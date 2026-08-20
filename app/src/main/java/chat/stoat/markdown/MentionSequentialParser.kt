package chat.stoat.markdown

import chat.stoat.api.internals.isUlid
import org.intellij.markdown.MarkdownTokenTypes
import org.intellij.markdown.parser.sequentialparsers.RangesListBuilder
import org.intellij.markdown.parser.sequentialparsers.SequentialParser
import org.intellij.markdown.parser.sequentialparsers.TokensCache

class MentionSequentialParser(private val content: String) : SequentialParser {
    override fun parse(tokens: TokensCache, rangesToGlue: List<IntRange>): SequentialParser.ParsingResult {
        val result = SequentialParser.ParsingResultBuilder()
        val delegateIndices = RangesListBuilder()
        var iterator: TokensCache.Iterator = tokens.RangesListIterator(rangesToGlue)

        while (iterator.type != null) {
            if (iterator.type == MarkdownTokenTypes.LT) {
                val ltEnd = iterator.end

                var lookahead = iterator.advance()
                var hops = 0
                while (lookahead.type != null &&
                    lookahead.type != MarkdownTokenTypes.GT &&
                    lookahead.type != MarkdownTokenTypes.EOL &&
                    hops < 5
                ) {
                    lookahead = lookahead.advance()
                    hops++
                }

                if (lookahead.type == MarkdownTokenTypes.GT) {
                    val innerText = content.substring(ltEnd, lookahead.start)

                    // Discord uses decimal snowflake ids (not Revolt's 26-char
                    // ULIDs) inside mention tokens, and supports `<@!id>`
                    // (nickname mention) and `<@&id>` (role mention). Accept both
                    // ULID and purely-numeric (snowflake) ids so Revolt AND
                    // Discord mentions render.
                    val mentionType = when {
                        innerText == "@EVERYONE" || innerText == "@ONLINE" -> MASS_MENTION_ELEMENT_TYPE
                        innerText.startsWith("@&") && innerText.length > 2 -> {
                            val id = innerText.substring(2)
                            if (id.isUlid() || id.all { it.isDigit() }) ROLE_MENTION_ELEMENT_TYPE else null
                        }
                        innerText.startsWith("@") && innerText.length > 1 -> {
                            val id = innerText.substring(1).removePrefix("!")
                            if (id.isUlid() || id.all { it.isDigit() }) USER_MENTION_ELEMENT_TYPE else null
                        }
                        innerText.startsWith("#") && innerText.length > 1 -> {
                            val id = innerText.substring(1)
                            if (id.isUlid() || id.all { it.isDigit() }) CHANNEL_MENTION_ELEMENT_TYPE else null
                        }
                        innerText.startsWith("%") && innerText.length > 1 -> {
                            val id = innerText.substring(1)
                            if (id.isUlid() || id.all { it.isDigit() }) ROLE_MENTION_ELEMENT_TYPE else null
                        }
                        else -> null
                    }
                    if (mentionType != null) {
                        result.withNode(SequentialParser.Node(iterator.index..lookahead.index + 1, mentionType))
                        iterator = lookahead.advance()
                        continue
                    }
                }
            }
            delegateIndices.put(iterator.index)
            iterator = iterator.advance()
        }

        return result.withFurtherProcessing(delegateIndices.get())
    }
}
