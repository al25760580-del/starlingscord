package com.discord.simpleast.code;

import com.discord.simpleast.core.node.Node;
import com.discord.simpleast.core.node.StyleNode;
import com.discord.simpleast.core.parser.ParseSpec;
import com.discord.simpleast.core.parser.Parser;
import com.discord.simpleast.core.parser.Rule;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.collections.d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u001bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002JE\u0010\u0012\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u0002H\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00150\u0016\u0012\u0004\u0012\u0002H\u00170\u00140\u0013\"\u0004\b\u0000\u0010\u0015\"\u0004\b\u0001\u0010\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00150\u0019H\u0000¢\u0006\u0002\b\u001aR\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\n\u0010\u0007R\u0016\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n \r*\u0004\u0018\u00010\f0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n \r*\u0004\u0018\u00010\f0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n \r*\u0004\u0018\u00010\f0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n \r*\u0004\u0018\u00010\f0\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/discord/simpleast/code/Crystal;", "", "()V", "BUILT_INS", "", "", "getBUILT_INS", "()[Ljava/lang/String;", "[Ljava/lang/String;", "KEYWORDS", "getKEYWORDS", "PATTERN_CRYSTAL_ANNOTATION", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "PATTERN_CRYSTAL_COMMENTS", "PATTERN_CRYSTAL_REGEX", "PATTERN_CRYSTAL_STRINGS", "PATTERN_CRYSTAL_SYMBOL", "createCrystalCodeRules", "", "Lcom/discord/simpleast/core/parser/Rule;", "RC", "Lcom/discord/simpleast/core/node/Node;", "S", "codeStyleProviders", "Lcom/discord/simpleast/code/CodeStyleProviders;", "createCrystalCodeRules$simpleast_core_release", "FunctionNode", "simpleast-core_release"}, k = 1, mv = {1, 4, 0})
public final class Crystal {
    public static final Crystal INSTANCE = new Crystal();

    @NotNull
    private static final String[] KEYWORDS = {"true|false|nil", "module|require|include|extend|lib", "abstract|private|protected", "annotation|class|finalize|new|initialize|allocate|self|super", "union|typeof|forall|is_a?|nil?|as?|as|responds_to?|alias|type", "property|getter|setter|struct|of", "previous_def|method|fun|enum|macro", "rescue|raise|begin|end|ensure", "if|else|elsif|then|unless|until", "for|in|of|do|when|select|with", "while|break|next|yield|case", "print|puts|return"};

    @NotNull
    private static final String[] BUILT_INS = {"Nil|Bool|true|false|Void|NoReturn", "Number|BigDecimal|BigRational|BigFloat|BigInt", "Int|Int8|Int16|Int32|Int64|UInt8|UInt16|UInt32|UInt64|Float|Float32|Float64", "Char|String|Symbol|Regex", "StaticArray|Array|Set|Hash|Range|Tuple|NamedTuple|Union|BitArray", "Proc|Command|Enum|Class", "Reference|Value|Struct|Object|Pointer", "Exception|ArgumentError|KeyError|TypeCastError|IndexError|RuntimeError|NilAssertionError|InvalidBigDecimalException|NotImplementedError|OverflowError", "pointerof|sizeof|instance_sizeof|offsetof|uninitialized"};
    private static final Pattern PATTERN_CRYSTAL_COMMENTS = Pattern.compile("^(#.*)");
    private static final Pattern PATTERN_CRYSTAL_ANNOTATION = Pattern.compile("^@\\[(\\w+)(?:\\(.+\\))?]");
    private static final Pattern PATTERN_CRYSTAL_STRINGS = Pattern.compile("^\"[\\s\\S]*?(?<!\\\\)\"(?=\\W|\\s|$)");
    private static final Pattern PATTERN_CRYSTAL_REGEX = Pattern.compile("^/.*?/[imx]?");
    private static final Pattern PATTERN_CRYSTAL_SYMBOL = Pattern.compile("^(:\"?(?:[+-/%&^|]|\\*\\*?|\\w+|(?:<(?=[<=\\s])[<=]?(?:(?<==)>)?|>(?=[>=\\s])[>=]?(?:(?<==)>)?)|\\[][?=]?|(?:!(?=[=~\\s])[=~]?|=?(?:~|==?)))(?:(?<!\\\\)\"(?=\\s|$))?)");

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \n*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001\nB-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0002\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/discord/simpleast/code/Crystal$FunctionNode;", "RC", "Lcom/discord/simpleast/core/node/Node$Parent;", "pre", "", "signature", "params", "codeStyleProviders", "Lcom/discord/simpleast/code/CodeStyleProviders;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/simpleast/code/CodeStyleProviders;)V", "Companion", "simpleast-core_release"}, k = 1, mv = {1, 4, 0})
    public static final class FunctionNode<RC> extends Node.Parent<RC> {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Pattern PATTERN_CRYSTAL_FUNC = Pattern.compile("^(def)( +\\w+)( *\\( *(?:@\\w+ +: +\\w*)?\\w+(?: +[:=] +.*)? *\\))?(?!.+)");

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J8\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u0002H\b\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\t\u0012\u0004\u0012\u0002H\n0\u0007\"\u0004\b\u0001\u0010\b\"\u0004\b\u0002\u0010\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\b0\fR\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/discord/simpleast/code/Crystal$FunctionNode$Companion;", "", "()V", "PATTERN_CRYSTAL_FUNC", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "createFunctionRule", "Lcom/discord/simpleast/core/parser/Rule;", "RC", "Lcom/discord/simpleast/core/node/Node;", "S", "codeStyleProviders", "Lcom/discord/simpleast/code/CodeStyleProviders;", "simpleast-core_release"}, k = 1, mv = {1, 4, 0})
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final <RC, S> Rule<RC, Node<RC>, S> createFunctionRule(@NotNull final CodeStyleProviders<RC> codeStyleProviders) {
                Intrinsics.checkNotNullParameter(codeStyleProviders, "codeStyleProviders");
                final Pattern PATTERN_CRYSTAL_FUNC = FunctionNode.PATTERN_CRYSTAL_FUNC;
                Intrinsics.checkNotNullExpressionValue(PATTERN_CRYSTAL_FUNC, "PATTERN_CRYSTAL_FUNC");
                return new Rule<RC, Node<RC>, S>(PATTERN_CRYSTAL_FUNC) { // from class: com.discord.simpleast.code.Crystal$FunctionNode$Companion$createFunctionRule$1
                    @Override // com.discord.simpleast.core.parser.Rule
                    @NotNull
                    public ParseSpec<RC, S> parse(@NotNull Matcher matcher, @NotNull Parser<RC, ? super Node<RC>, S> parser, S state) {
                        Intrinsics.checkNotNullParameter(matcher, "matcher");
                        Intrinsics.checkNotNullParameter(parser, "parser");
                        String strGroup = matcher.group(1);
                        String strGroup2 = matcher.group(2);
                        String strGroup3 = matcher.group(3);
                        ParseSpec.Companion companion = ParseSpec.INSTANCE;
                        Intrinsics.checkNotNull(strGroup);
                        Intrinsics.checkNotNull(strGroup2);
                        return companion.createTerminal(new Crystal.FunctionNode(strGroup, strGroup2, strGroup3, codeStyleProviders), state);
                    }
                };
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FunctionNode(@NotNull String pre, @NotNull String signature, String str, @NotNull CodeStyleProviders<RC> codeStyleProviders) {
            super(new StyleNode.TextStyledNode(pre, codeStyleProviders.getKeywordStyleProvider()), new StyleNode.TextStyledNode(signature, codeStyleProviders.getIdentifierStyleProvider()), str != null ? new StyleNode.TextStyledNode(str, codeStyleProviders.getParamsStyleProvider()) : null);
            Intrinsics.checkNotNullParameter(pre, "pre");
            Intrinsics.checkNotNullParameter(signature, "signature");
            Intrinsics.checkNotNullParameter(codeStyleProviders, "codeStyleProviders");
        }
    }

    private Crystal() {
    }

    @NotNull
    public final <RC, S> List<Rule<RC, Node<RC>, S>> createCrystalCodeRules$simpleast_core_release(@NotNull CodeStyleProviders<RC> codeStyleProviders) {
        Intrinsics.checkNotNullParameter(codeStyleProviders, "codeStyleProviders");
        CodeRules codeRules = CodeRules.INSTANCE;
        Pattern PATTERN_CRYSTAL_COMMENTS2 = PATTERN_CRYSTAL_COMMENTS;
        Intrinsics.checkNotNullExpressionValue(PATTERN_CRYSTAL_COMMENTS2, "PATTERN_CRYSTAL_COMMENTS");
        Rule matchGroupRule$default = CodeRules.toMatchGroupRule$default(codeRules, PATTERN_CRYSTAL_COMMENTS2, 0, codeStyleProviders.getCommentStyleProvider(), 1, null);
        Pattern PATTERN_CRYSTAL_STRINGS2 = PATTERN_CRYSTAL_STRINGS;
        Intrinsics.checkNotNullExpressionValue(PATTERN_CRYSTAL_STRINGS2, "PATTERN_CRYSTAL_STRINGS");
        Rule matchGroupRule$default2 = CodeRules.toMatchGroupRule$default(codeRules, PATTERN_CRYSTAL_STRINGS2, 0, codeStyleProviders.getLiteralStyleProvider(), 1, null);
        Pattern PATTERN_CRYSTAL_REGEX2 = PATTERN_CRYSTAL_REGEX;
        Intrinsics.checkNotNullExpressionValue(PATTERN_CRYSTAL_REGEX2, "PATTERN_CRYSTAL_REGEX");
        Rule matchGroupRule$default3 = CodeRules.toMatchGroupRule$default(codeRules, PATTERN_CRYSTAL_REGEX2, 0, codeStyleProviders.getLiteralStyleProvider(), 1, null);
        Pattern PATTERN_CRYSTAL_ANNOTATION2 = PATTERN_CRYSTAL_ANNOTATION;
        Intrinsics.checkNotNullExpressionValue(PATTERN_CRYSTAL_ANNOTATION2, "PATTERN_CRYSTAL_ANNOTATION");
        Rule matchGroupRule$default4 = CodeRules.toMatchGroupRule$default(codeRules, PATTERN_CRYSTAL_ANNOTATION2, 0, codeStyleProviders.getGenericsStyleProvider(), 1, null);
        Pattern PATTERN_CRYSTAL_SYMBOL2 = PATTERN_CRYSTAL_SYMBOL;
        Intrinsics.checkNotNullExpressionValue(PATTERN_CRYSTAL_SYMBOL2, "PATTERN_CRYSTAL_SYMBOL");
        return d0.g(matchGroupRule$default, matchGroupRule$default2, matchGroupRule$default3, matchGroupRule$default4, CodeRules.toMatchGroupRule$default(codeRules, PATTERN_CRYSTAL_SYMBOL2, 0, codeStyleProviders.getLiteralStyleProvider(), 1, null), FunctionNode.INSTANCE.createFunctionRule(codeStyleProviders));
    }

    @NotNull
    public final String[] getBUILT_INS() {
        return BUILT_INS;
    }

    @NotNull
    public final String[] getKEYWORDS() {
        return KEYWORDS;
    }
}
