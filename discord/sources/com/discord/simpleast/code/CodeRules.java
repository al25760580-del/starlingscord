package com.discord.simpleast.code;

import android.text.SpannableStringBuilder;
import com.discord.simpleast.core.node.Node;
import com.discord.simpleast.core.node.StyleNode;
import com.discord.simpleast.core.node.TextNode;
import com.discord.simpleast.core.parser.ParseSpec;
import com.discord.simpleast.core.parser.Parser;
import com.discord.simpleast.core.parser.Rule;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.d0;
import kotlin.collections.w0;
import kotlin.collections.y;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0012\n\u0002\b\u0006*\u0001:\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JJ\u0010\u0013\u001a,\u0012\u0004\u0012\u00020\u0015\u0012\"\u0012 \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u0002H\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00180\u0019\u0012\u0004\u0012\u0002H\u001a0\u00170\u00160\u0014\"\u0004\b\u0000\u0010\u0018\"\u0004\b\u0001\u0010\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u00180\u001cJ\u0098\u0001\u0010\u001d\u001a\u001a\u0012\u0004\u0012\u0002H\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00180\u0019\u0012\u0004\u0012\u0002H\u001a0\u0017\"\u0004\b\u0000\u0010\u0018\"\u0004\b\u0001\u0010\u001a2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u00180\u001f20\u0010 \u001a,\u0012\u0004\u0012\u00020\u0015\u0012\"\u0012 \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u0002H\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00180\u0019\u0012\u0004\u0012\u0002H\u001a0\u00170\u00160\u00142,\b\u0002\u0010!\u001a&\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00180#\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u0002H\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00180\u00190\"JQ\u0010%\u001a\u001a\u0012\u0004\u0012\u0002H\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00180\u0019\u0012\u0004\u0012\u0002H\u001a0\u0017\"\u0004\b\u0000\u0010\u0018\"\u0004\b\u0001\u0010\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u00180\u001c2\u0012\u0010&\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00150'\"\u00020\u0015¢\u0006\u0002\u0010(J¥\u0001\u0010)\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u0002H\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00180\u0019\u0012\u0004\u0012\u0002H\u001a0\u00170\u0016\"\u0004\b\u0000\u0010\u0018\"\u0004\b\u0001\u0010\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u00180\u001c2$\u0010*\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u0002H\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00180\u0019\u0012\u0004\u0012\u0002H\u001a0\u00170\u00162\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00150'2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00150'2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00150'2\u000e\b\u0002\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00150'H\u0002¢\u0006\u0002\u0010/JF\u00100\u001a\u001a\u0012\u0004\u0012\u0002H\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00180\u0019\u0012\u0004\u0012\u0002H\u001a0\u0017\"\u0004\b\u0000\u0010\u0018\"\u0004\b\u0001\u0010\u001a2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u00180\u001f2\f\u00101\u001a\b\u0012\u0004\u0012\u0002H\u00180\u001fJ\u0018\u00102\u001a\n 3*\u0004\u0018\u00010\b0\b2\u0006\u00104\u001a\u00020\u0015H\u0002J+\u00105\u001a\n 3*\u0004\u0018\u00010\b0\b2\u0012\u00106\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00150'\"\u00020\u0015H\u0000¢\u0006\u0004\b7\u00108JE\u00109\u001a\u000e\u0012\u0004\u0012\u0002H\u0018\u0012\u0004\u0012\u0002H\u001a0:\"\u0004\b\u0000\u0010\u0018\"\u0004\b\u0001\u0010\u001a*\u00020\b2\b\b\u0002\u0010;\u001a\u00020\u00042\u0010\b\u0002\u0010<\u001a\n\u0012\u0004\u0012\u0002H\u0018\u0018\u00010\u001fH\u0002¢\u0006\u0002\u0010=JJ\u0010>\u001a\u001a\u0012\u0004\u0012\u0002H\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00180\u0019\u0012\u0004\u0012\u0002H\u001a0\u0017\"\u0004\b\u0000\u0010\u0018\"\u0004\b\u0001\u0010\u001a*\u00020\b2\b\b\u0002\u0010;\u001a\u00020\u00042\u0010\b\u0002\u0010<\u001a\n\u0012\u0004\u0012\u0002H\u0018\u0018\u00010\u001fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\r\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\u0011\u0010\u000f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\nR\u0011\u0010\u0011\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\n¨\u0006?"}, d2 = {"Lcom/discord/simpleast/code/CodeRules;", "", "()V", "CODE_BLOCK_BODY_GROUP", "", "CODE_BLOCK_LANGUAGE_GROUP", "CODE_BLOCK_WS_PREFIX", "PATTERN_CODE_BLOCK", "Ljava/util/regex/Pattern;", "getPATTERN_CODE_BLOCK", "()Ljava/util/regex/Pattern;", "PATTERN_CODE_INLINE", "getPATTERN_CODE_INLINE", "PATTERN_LEADING_WS_CONSUMER", "getPATTERN_LEADING_WS_CONSUMER", "PATTERN_NUMBERS", "getPATTERN_NUMBERS", "PATTERN_TEXT", "getPATTERN_TEXT", "createCodeLanguageMap", "", "", "", "Lcom/discord/simpleast/core/parser/Rule;", "R", "Lcom/discord/simpleast/core/node/Node;", "S", "codeStyleProviders", "Lcom/discord/simpleast/code/CodeStyleProviders;", "createCodeRule", "textStyleProvider", "Lcom/discord/simpleast/core/node/StyleNode$SpanProvider;", "languageMap", "wrapperNodeProvider", "Lkotlin/Function3;", "Lcom/discord/simpleast/code/CodeNode;", "", "createDefinitionRule", "identifiers", "", "(Lcom/discord/simpleast/code/CodeStyleProviders;[Ljava/lang/String;)Lcom/discord/simpleast/core/parser/Rule;", "createGenericCodeRules", "additionalRules", "definitions", "builtIns", "keywords", "types", "(Lcom/discord/simpleast/code/CodeStyleProviders;Ljava/util/List;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;", "createInlineCodeRule", "bgStyleProvider", "createSingleLineCommentPattern", "kotlin.jvm.PlatformType", "prefix", "createWordPattern", "words", "createWordPattern$simpleast_core_release", "([Ljava/lang/String;)Ljava/util/regex/Pattern;", "toLineStartMatchGroupRule", "com/discord/simpleast/code/CodeRules$toLineStartMatchGroupRule$1", "group", "stylesProvider", "(Ljava/util/regex/Pattern;ILcom/discord/simpleast/core/node/StyleNode$SpanProvider;)Lcom/discord/simpleast/code/CodeRules$toLineStartMatchGroupRule$1;", "toMatchGroupRule", "simpleast-core_release"}, k = 1, mv = {1, 4, 0})
public final class CodeRules {
    private static final int CODE_BLOCK_BODY_GROUP = 3;
    private static final int CODE_BLOCK_LANGUAGE_GROUP = 1;
    private static final int CODE_BLOCK_WS_PREFIX = 2;
    public static final CodeRules INSTANCE = new CodeRules();

    @NotNull
    private static final Pattern PATTERN_CODE_BLOCK;

    @NotNull
    private static final Pattern PATTERN_CODE_INLINE;

    @NotNull
    private static final Pattern PATTERN_LEADING_WS_CONSUMER;

    @NotNull
    private static final Pattern PATTERN_NUMBERS;

    @NotNull
    private static final Pattern PATTERN_TEXT;

    /* JADX INFO: Add missing generic type declarations: [R, S] */
    /* JADX INFO: renamed from: com.discord.simpleast.code.CodeRules$createInlineCodeRule$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u001a\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00028\u00010\u0001JK\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062 \u0010\u0007\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\f\b\u0000\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00028\u00010\b2\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"com/discord/simpleast/code/CodeRules$createInlineCodeRule$1", "Lcom/discord/simpleast/core/parser/Rule;", "Lcom/discord/simpleast/core/node/Node;", "parse", "Lcom/discord/simpleast/core/parser/ParseSpec;", "matcher", "Ljava/util/regex/Matcher;", "parser", "Lcom/discord/simpleast/core/parser/Parser;", "state", "(Ljava/util/regex/Matcher;Lcom/discord/simpleast/core/parser/Parser;Ljava/lang/Object;)Lcom/discord/simpleast/core/parser/ParseSpec;", "simpleast-core_release"}, k = 1, mv = {1, 4, 0})
    public static final class C02131<R, S> extends Rule<R, Node<R>, S> {
        final /* synthetic */ StyleNode.SpanProvider $bgStyleProvider;
        final /* synthetic */ StyleNode.SpanProvider $textStyleProvider;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02131(StyleNode.SpanProvider spanProvider, StyleNode.SpanProvider spanProvider2, Pattern pattern) {
            super(pattern);
            this.$textStyleProvider = spanProvider;
            this.$bgStyleProvider = spanProvider2;
        }

        @Override // com.discord.simpleast.core.parser.Rule
        @NotNull
        public ParseSpec<R, S> parse(@NotNull Matcher matcher, @NotNull Parser<R, ? super Node<R>, S> parser, S state) {
            Intrinsics.checkNotNullParameter(matcher, "matcher");
            Intrinsics.checkNotNullParameter(parser, "parser");
            String strGroup = matcher.group(2);
            if (strGroup == null) {
                strGroup = "";
            }
            if (strGroup.length() != 0) {
                final CodeNode codeNode = new CodeNode(new CodeNode.Content.Raw(strGroup), null, this.$textStyleProvider);
                final Node[] nodeArr = {codeNode};
                return ParseSpec.INSTANCE.createTerminal(new Node.Parent<R>(nodeArr) { // from class: com.discord.simpleast.code.CodeRules$createInlineCodeRule$1$parse$node$1
                    @Override // com.discord.simpleast.core.node.Node.Parent, com.discord.simpleast.core.node.Node
                    public void render(@NotNull SpannableStringBuilder builder, R renderContext) {
                        Intrinsics.checkNotNullParameter(builder, "builder");
                        int length = builder.length();
                        super.render(builder, renderContext);
                        Iterator<?> it = this.this$0.$bgStyleProvider.get(renderContext).iterator();
                        while (it.hasNext()) {
                            builder.setSpan(it.next(), length, builder.length(), 33);
                        }
                    }
                }, state);
            }
            ParseSpec.Companion companion = ParseSpec.INSTANCE;
            String strGroup2 = matcher.group();
            Intrinsics.checkNotNullExpressionValue(strGroup2, "matcher.group()");
            return companion.createTerminal(new TextNode(strGroup2), state);
        }
    }

    static {
        Pattern patternCompile = Pattern.compile("^```(?:([\\w+\\-.]+?)?(\\s*\\n))?([^\\n].*?)\\n*```", 32);
        Intrinsics.checkNotNullExpressionValue(patternCompile, "Pattern.compile(\"\"\"^```(…n*```\"\"\", Pattern.DOTALL)");
        PATTERN_CODE_BLOCK = patternCompile;
        Pattern patternCompile2 = Pattern.compile("^(``?)([^`]*)\\1", 32);
        Intrinsics.checkNotNullExpressionValue(patternCompile2, "Pattern.compile(\"\"\"^(``?…]*)\\1\"\"\", Pattern.DOTALL)");
        PATTERN_CODE_INLINE = patternCompile2;
        Pattern patternCompile3 = Pattern.compile("^(?:\\n\\s*)+");
        Intrinsics.checkNotNullExpressionValue(patternCompile3, "Pattern.compile(\"\"\"^(?:\\n\\s*)+\"\"\")");
        PATTERN_LEADING_WS_CONSUMER = patternCompile3;
        Pattern patternCompile4 = Pattern.compile("^[\\s\\S]+?(?=\\b|[^0-9A-Za-z\\s\\u00c0-\\uffff]|\\n| {2,}\\n|\\w+:\\S|$)");
        Intrinsics.checkNotNullExpressionValue(patternCompile4, "Pattern.compile(\"\"\"^[\\s\\…|\\n| {2,}\\n|\\w+:\\S|$)\"\"\")");
        PATTERN_TEXT = patternCompile4;
        Pattern patternCompile5 = Pattern.compile("^\\b\\d+?\\b");
        Intrinsics.checkNotNullExpressionValue(patternCompile5, "Pattern.compile(\"\"\"^\\b\\d+?\\b\"\"\")");
        PATTERN_NUMBERS = patternCompile5;
    }

    private CodeRules() {
    }

    public static /* synthetic */ Rule createCodeRule$default(CodeRules codeRules, StyleNode.SpanProvider spanProvider, Map map, Function3 function3, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            function3 = new Function3() { // from class: com.discord.simpleast.code.CodeRules.createCodeRule.1
                @NotNull
                public final CodeNode invoke(@NotNull CodeNode codeNode, boolean z5, Object obj2) {
                    Intrinsics.checkNotNullParameter(codeNode, "codeNode");
                    return codeNode;
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3, Object obj4) {
                    return invoke((CodeNode) obj2, ((Boolean) obj3).booleanValue(), obj4);
                }
            };
        }
        return codeRules.createCodeRule(spanProvider, map, function3);
    }

    private final <R, S> List<Rule<R, Node<R>, S>> createGenericCodeRules(CodeStyleProviders<R> codeStyleProviders, List<? extends Rule<R, Node<R>, S>> additionalRules, String[] definitions, String[] builtIns, String[] keywords, String[] types) {
        Rule<R, Node<R>, S> ruleCreateDefinitionRule = createDefinitionRule(codeStyleProviders, (String[]) Arrays.copyOf(definitions, definitions.length));
        Pattern patternCreateWordPattern$simpleast_core_release = createWordPattern$simpleast_core_release((String[]) Arrays.copyOf(builtIns, builtIns.length));
        Intrinsics.checkNotNullExpressionValue(patternCreateWordPattern$simpleast_core_release, "createWordPattern(*builtIns)");
        Rule matchGroupRule$default = toMatchGroupRule$default(this, patternCreateWordPattern$simpleast_core_release, 0, codeStyleProviders.getGenericsStyleProvider(), 1, null);
        Pattern patternCreateWordPattern$simpleast_core_release2 = createWordPattern$simpleast_core_release((String[]) Arrays.copyOf(keywords, keywords.length));
        Intrinsics.checkNotNullExpressionValue(patternCreateWordPattern$simpleast_core_release2, "createWordPattern(*keywords)");
        Rule matchGroupRule$default2 = toMatchGroupRule$default(this, patternCreateWordPattern$simpleast_core_release2, 0, codeStyleProviders.getKeywordStyleProvider(), 1, null);
        Pattern patternCreateWordPattern$simpleast_core_release3 = createWordPattern$simpleast_core_release((String[]) Arrays.copyOf(types, types.length));
        Intrinsics.checkNotNullExpressionValue(patternCreateWordPattern$simpleast_core_release3, "createWordPattern(*types)");
        return CollectionsKt.V(additionalRules, d0.g(ruleCreateDefinitionRule, matchGroupRule$default, matchGroupRule$default2, toMatchGroupRule$default(this, patternCreateWordPattern$simpleast_core_release3, 0, codeStyleProviders.getTypesStyleProvider(), 1, null), toMatchGroupRule$default(this, PATTERN_NUMBERS, 0, codeStyleProviders.getLiteralStyleProvider(), 1, null), toMatchGroupRule$default(this, PATTERN_LEADING_WS_CONSUMER, 0, null, 3, null), toMatchGroupRule$default(this, PATTERN_TEXT, 0, null, 3, null)));
    }

    public static /* synthetic */ List createGenericCodeRules$default(CodeRules codeRules, CodeStyleProviders codeStyleProviders, List list, String[] strArr, String[] strArr2, String[] strArr3, String[] strArr4, int i7, Object obj) {
        if ((i7 & 32) != 0) {
            strArr4 = new String[]{" "};
        }
        return codeRules.createGenericCodeRules(codeStyleProviders, list, strArr, strArr2, strArr3, strArr4);
    }

    private final Pattern createSingleLineCommentPattern(String prefix) {
        return Pattern.compile("^(?:" + prefix + ".*?(?=\\n|$))");
    }

    private final <R, S> C02141 toLineStartMatchGroupRule(final Pattern pattern, final int i7, final StyleNode.SpanProvider<R> spanProvider) {
        return new Rule.BlockRule<R, Node<R>, S>(pattern) { // from class: com.discord.simpleast.code.CodeRules.toLineStartMatchGroupRule.1
            @Override // com.discord.simpleast.core.parser.Rule
            @NotNull
            public ParseSpec<R, S> parse(@NotNull Matcher matcher, @NotNull Parser<R, ? super Node<R>, S> parser, S state) {
                Intrinsics.checkNotNullParameter(matcher, "matcher");
                Intrinsics.checkNotNullParameter(parser, "parser");
                String strGroup = matcher.group(i7);
                if (strGroup == null) {
                    strGroup = "";
                }
                StyleNode.SpanProvider spanProvider2 = spanProvider;
                return ParseSpec.INSTANCE.createTerminal(spanProvider2 != null ? new StyleNode.TextStyledNode<>(strGroup, spanProvider2) : new TextNode<>(strGroup), state);
            }
        };
    }

    public static /* synthetic */ C02141 toLineStartMatchGroupRule$default(CodeRules codeRules, Pattern pattern, int i7, StyleNode.SpanProvider spanProvider, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i7 = 0;
        }
        if ((i10 & 2) != 0) {
            spanProvider = null;
        }
        return codeRules.toLineStartMatchGroupRule(pattern, i7, spanProvider);
    }

    public static /* synthetic */ Rule toMatchGroupRule$default(CodeRules codeRules, Pattern pattern, int i7, StyleNode.SpanProvider spanProvider, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i7 = 0;
        }
        if ((i10 & 2) != 0) {
            spanProvider = null;
        }
        return codeRules.toMatchGroupRule(pattern, i7, spanProvider);
    }

    @NotNull
    public final <R, S> Map<String, List<Rule<R, Node<R>, S>>> createCodeLanguageMap(@NotNull CodeStyleProviders<R> codeStyleProviders) {
        Intrinsics.checkNotNullParameter(codeStyleProviders, "codeStyleProviders");
        Kotlin kotlin2 = Kotlin.INSTANCE;
        List listCreateGenericCodeRules$default = createGenericCodeRules$default(this, codeStyleProviders, kotlin2.createKotlinCodeRules$simpleast_core_release(codeStyleProviders), new String[]{"object", "class", "interface"}, kotlin2.getBUILT_INS(), kotlin2.getKEYWORDS(), null, 32, null);
        Pattern patternCreateSingleLineCommentPattern = createSingleLineCommentPattern("//");
        Intrinsics.checkNotNullExpressionValue(patternCreateSingleLineCommentPattern, "createSingleLineCommentPattern(\"//\")");
        Rule matchGroupRule$default = toMatchGroupRule$default(this, patternCreateSingleLineCommentPattern, 0, codeStyleProviders.getCommentStyleProvider(), 1, null);
        Pattern patternCompile = Pattern.compile("^\"[\\s\\S]*?(?<!\\\\)\"(?=\\W|\\s|$)");
        Intrinsics.checkNotNullExpressionValue(patternCompile, "Pattern.compile(\"\"\"^\"[\\s…*?(?<!\\\\)\"(?=\\W|\\s|$)\"\"\")");
        List listCreateGenericCodeRules$default2 = createGenericCodeRules$default(this, codeStyleProviders, d0.g(matchGroupRule$default, toMatchGroupRule$default(this, patternCompile, 0, codeStyleProviders.getLiteralStyleProvider(), 1, null)), new String[]{"message|enum|extend|service"}, new String[]{"true|false", "string|bool|double|float|bytes", "int32|uint32|sint32|int64|unit64|sint64", "map"}, new String[]{"required|repeated|optional|option|oneof|default|reserved", "package|import", "rpc|returns"}, null, 32, null);
        Pattern patternCreateSingleLineCommentPattern2 = createSingleLineCommentPattern("#");
        Intrinsics.checkNotNullExpressionValue(patternCreateSingleLineCommentPattern2, "createSingleLineCommentPattern(\"#\")");
        Rule matchGroupRule$default2 = toMatchGroupRule$default(this, patternCreateSingleLineCommentPattern2, 0, codeStyleProviders.getCommentStyleProvider(), 1, null);
        Pattern patternCompile2 = Pattern.compile("^\"[\\s\\S]*?(?<!\\\\)\"(?=\\W|\\s|$)");
        Intrinsics.checkNotNullExpressionValue(patternCompile2, "Pattern.compile(\"\"\"^\"[\\s…*?(?<!\\\\)\"(?=\\W|\\s|$)\"\"\")");
        Rule matchGroupRule$default3 = toMatchGroupRule$default(this, patternCompile2, 0, codeStyleProviders.getLiteralStyleProvider(), 1, null);
        Pattern patternCompile3 = Pattern.compile("^'[\\s\\S]*?(?<!\\\\)'(?=\\W|\\s|$)");
        Intrinsics.checkNotNullExpressionValue(patternCompile3, "Pattern.compile(\"\"\"^'[\\s…*?(?<!\\\\)'(?=\\W|\\s|$)\"\"\")");
        Rule matchGroupRule$default4 = toMatchGroupRule$default(this, patternCompile3, 0, codeStyleProviders.getLiteralStyleProvider(), 1, null);
        Pattern patternCompile4 = Pattern.compile("^@(\\w+)");
        Intrinsics.checkNotNullExpressionValue(patternCompile4, "Pattern.compile(\"\"\"^@(\\w+)\"\"\")");
        List listCreateGenericCodeRules$default3 = createGenericCodeRules$default(this, codeStyleProviders, d0.g(matchGroupRule$default2, matchGroupRule$default3, matchGroupRule$default4, toMatchGroupRule$default(this, patternCompile4, 0, codeStyleProviders.getGenericsStyleProvider(), 1, null)), new String[]{"class", "def", "lambda"}, new String[]{"True|False|None"}, new String[]{"from|import|global|nonlocal", "async|await|class|self|cls|def|lambda", "for|while|if|else|elif|break|continue|return", "try|except|finally|raise|pass|yeild", "in|as|is|del", "and|or|not|assert"}, null, 32, null);
        Pattern patternCreateSingleLineCommentPattern3 = createSingleLineCommentPattern("//");
        Intrinsics.checkNotNullExpressionValue(patternCreateSingleLineCommentPattern3, "createSingleLineCommentPattern(\"//\")");
        Rule matchGroupRule$default5 = toMatchGroupRule$default(this, patternCreateSingleLineCommentPattern3, 0, codeStyleProviders.getCommentStyleProvider(), 1, null);
        Pattern patternCompile5 = Pattern.compile("^\"[\\s\\S]*?(?<!\\\\)\"(?=\\W|\\s|$)");
        Intrinsics.checkNotNullExpressionValue(patternCompile5, "Pattern.compile(\"\"\"^\"[\\s…*?(?<!\\\\)\"(?=\\W|\\s|$)\"\"\")");
        Rule matchGroupRule$default6 = toMatchGroupRule$default(this, patternCompile5, 0, codeStyleProviders.getLiteralStyleProvider(), 1, null);
        Pattern patternCompile6 = Pattern.compile("^#!?\\[.*?\\]\\n");
        Intrinsics.checkNotNullExpressionValue(patternCompile6, "Pattern.compile(\"\"\"^#!?\\[.*?\\]\\n\"\"\")");
        List listCreateGenericCodeRules$default4 = createGenericCodeRules$default(this, codeStyleProviders, d0.g(matchGroupRule$default5, matchGroupRule$default6, toMatchGroupRule$default(this, patternCompile6, 0, codeStyleProviders.getGenericsStyleProvider(), 1, null)), new String[]{"struct", "trait", "mod"}, new String[]{"Self|Result|Ok|Err|Option|None|Some", "Copy|Clone|Eq|Hash|Send|Sync|Sized|Debug|Display", "Arc|Rc|Box|Pin|Future", "true|false|bool|usize|i64|u64|u32|i32|str|String"}, new String[]{"let|mut|static|const|unsafe", "crate|mod|extern|pub|pub(super)|use", "struct|enum|trait|type|where|impl|dyn|async|await|move|self|fn", "for|while|loop|if|else|match|break|continue|return|try", "in|as|ref"}, null, 32, null);
        Xml xml = Xml.INSTANCE;
        Rule matchGroupRule$default7 = toMatchGroupRule$default(this, xml.getPATTERN_XML_COMMENT(), 0, codeStyleProviders.getCommentStyleProvider(), 1, null);
        Rule ruleCreateTagRule = xml.createTagRule(codeStyleProviders);
        Pattern pattern = PATTERN_LEADING_WS_CONSUMER;
        Rule matchGroupRule$default8 = toMatchGroupRule$default(this, pattern, 0, null, 3, null);
        Pattern pattern2 = PATTERN_TEXT;
        List listG = d0.g(matchGroupRule$default7, ruleCreateTagRule, matchGroupRule$default8, toMatchGroupRule$default(this, pattern2, 0, null, 3, null));
        Pattern patternCreateSingleLineCommentPattern4 = createSingleLineCommentPattern("#");
        Intrinsics.checkNotNullExpressionValue(patternCreateSingleLineCommentPattern4, "createSingleLineCommentPattern(\"#\")");
        Rule matchGroupRule$default9 = toMatchGroupRule$default(this, patternCreateSingleLineCommentPattern4, 0, codeStyleProviders.getCommentStyleProvider(), 1, null);
        Pattern patternCompile7 = Pattern.compile("^\"[\\s\\S]*?(?<!\\\\)\"(?=\\W|\\s|$)");
        Intrinsics.checkNotNullExpressionValue(patternCompile7, "Pattern.compile(\"\"\"^\"[\\s…*?(?<!\\\\)\"(?=\\W|\\s|$)\"\"\")");
        Rule matchGroupRule$default10 = toMatchGroupRule$default(this, patternCompile7, 0, codeStyleProviders.getLiteralStyleProvider(), 1, null);
        String strPattern = createWordPattern$simpleast_core_release("true|false|null").pattern();
        Intrinsics.checkNotNullExpressionValue(strPattern, "createWordPattern(\"true|false|null\").pattern()");
        Pattern patternCompile8 = Pattern.compile(strPattern, 2);
        Intrinsics.checkNotNullExpressionValue(patternCompile8, "java.util.regex.Pattern.compile(this, flags)");
        Rule matchGroupRule$default11 = toMatchGroupRule$default(this, patternCompile8, 0, codeStyleProviders.getGenericsStyleProvider(), 1, null);
        String strPattern2 = createWordPattern$simpleast_core_release("select|from|join|where|and|as|distinct|count|avg", "order by|group by|desc|sum|min|max", "like|having|in|is|not").pattern();
        Intrinsics.checkNotNullExpressionValue(strPattern2, "createWordPattern(\n     …ing|in|is|not\").pattern()");
        Pattern patternCompile9 = Pattern.compile(strPattern2, 2);
        Intrinsics.checkNotNullExpressionValue(patternCompile9, "java.util.regex.Pattern.compile(this, flags)");
        List listG2 = d0.g(matchGroupRule$default9, matchGroupRule$default10, matchGroupRule$default11, toMatchGroupRule$default(this, patternCompile9, 0, codeStyleProviders.getKeywordStyleProvider(), 1, null), toMatchGroupRule$default(this, PATTERN_NUMBERS, 0, codeStyleProviders.getLiteralStyleProvider(), 1, null), toMatchGroupRule$default(this, pattern, 0, null, 3, null), toMatchGroupRule$default(this, pattern2, 0, null, 3, null));
        Crystal crystal = Crystal.INSTANCE;
        List listCreateGenericCodeRules$default5 = createGenericCodeRules$default(this, codeStyleProviders, crystal.createCrystalCodeRules$simpleast_core_release(codeStyleProviders), new String[]{"def", "class"}, crystal.getBUILT_INS(), crystal.getKEYWORDS(), null, 32, null);
        JavaScript javaScript = JavaScript.INSTANCE;
        List listCreateGenericCodeRules$default6 = createGenericCodeRules$default(this, codeStyleProviders, javaScript.createCodeRules$simpleast_core_release(codeStyleProviders), new String[]{"class"}, javaScript.getBUILT_INS(), javaScript.getKEYWORDS(), null, 32, null);
        TypeScript typeScript = TypeScript.INSTANCE;
        List<Rule<R, Node<R>, S>> listCreateGenericCodeRules = createGenericCodeRules(codeStyleProviders, typeScript.createCodeRules$simpleast_core_release(codeStyleProviders), new String[]{"class", "interface", "enum", "namespace", "module", "type"}, typeScript.getBUILT_INS(), typeScript.getKEYWORDS(), typeScript.getTYPES());
        Pattern patternCompile10 = Pattern.compile("^-.*");
        Intrinsics.checkNotNullExpressionValue(patternCompile10, "Pattern.compile(\"\"\"^-.*\"\"\")");
        C02141 lineStartMatchGroupRule$default = toLineStartMatchGroupRule$default(this, patternCompile10, 0, codeStyleProviders.getDeletionStyleProvider(), 1, null);
        Pattern patternCompile11 = Pattern.compile("^\\+.*");
        Intrinsics.checkNotNullExpressionValue(patternCompile11, "Pattern.compile(\"\"\"^\\+.*\"\"\")");
        List listG3 = d0.g(lineStartMatchGroupRule$default, toLineStartMatchGroupRule$default(this, patternCompile11, 0, codeStyleProviders.getAdditionStyleProvider(), 1, null), toMatchGroupRule$default(this, pattern, 0, null, 3, null), toMatchGroupRule$default(this, pattern2, 0, null, 3, null));
        return w0.g(new Pair("kt", listCreateGenericCodeRules$default), new Pair("kts", listCreateGenericCodeRules$default), new Pair("kotlin", listCreateGenericCodeRules$default), new Pair("protobuf", listCreateGenericCodeRules$default2), new Pair("proto", listCreateGenericCodeRules$default2), new Pair("pb", listCreateGenericCodeRules$default2), new Pair("py", listCreateGenericCodeRules$default3), new Pair("python", listCreateGenericCodeRules$default3), new Pair("gyp", listCreateGenericCodeRules$default3), new Pair("ipython", listCreateGenericCodeRules$default3), new Pair("rs", listCreateGenericCodeRules$default4), new Pair("rust", listCreateGenericCodeRules$default4), new Pair("cql", listG2), new Pair("sql", listG2), new Pair("xml", listG), new Pair("http", listG), new Pair("cr", listCreateGenericCodeRules$default5), new Pair("crystal", listCreateGenericCodeRules$default5), new Pair("js", listCreateGenericCodeRules$default6), new Pair("javascript", listCreateGenericCodeRules$default6), new Pair("jsx", listCreateGenericCodeRules$default6), new Pair("mjs", listCreateGenericCodeRules$default6), new Pair("cjs", listCreateGenericCodeRules$default6), new Pair("ts", listCreateGenericCodeRules), new Pair("typescript", listCreateGenericCodeRules), new Pair("tsx", listCreateGenericCodeRules), new Pair("mts", listCreateGenericCodeRules), new Pair("cts", listCreateGenericCodeRules), new Pair("patch", listG3), new Pair("diff", listG3));
    }

    @NotNull
    public final <R, S> Rule<R, Node<R>, S> createCodeRule(@NotNull final StyleNode.SpanProvider<R> textStyleProvider, @NotNull final Map<String, ? extends List<? extends Rule<R, Node<R>, S>>> languageMap, @NotNull final Function3 wrapperNodeProvider) {
        Intrinsics.checkNotNullParameter(textStyleProvider, "textStyleProvider");
        Intrinsics.checkNotNullParameter(languageMap, "languageMap");
        Intrinsics.checkNotNullParameter(wrapperNodeProvider, "wrapperNodeProvider");
        return new Rule<R, Node<R>, S>(PATTERN_CODE_BLOCK) { // from class: com.discord.simpleast.code.CodeRules.createCodeRule.2
            @Override // com.discord.simpleast.core.parser.Rule
            @NotNull
            public ParseSpec<R, S> parse(@NotNull Matcher matcher, @NotNull Parser<R, ? super Node<R>, S> parser, S state) {
                List list;
                CodeNode.Content raw;
                List list2;
                Intrinsics.checkNotNullParameter(matcher, "matcher");
                Intrinsics.checkNotNullParameter(parser, "parser");
                String strGroup = matcher.group(1);
                String strGroup2 = matcher.group(3);
                if (strGroup2 == null) {
                    strGroup2 = "";
                }
                String strGroup3 = matcher.group(2);
                boolean zE = strGroup3 != null ? StringsKt.E(strGroup3, '\n') : false;
                if (strGroup != null) {
                    list2 = (List) languageMap.get(strGroup);
                } else {
                    list = null;
                }
                if (list != null) {
                    List<T> list3 = parser.parse(strGroup2, state, list);
                    if (list3 == 0) {
                        list = list2;
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<com.discord.simpleast.core.node.Node<R>>");
                    }
                    list = list2;
                    raw = new CodeNode.Content.Parsed(strGroup2, list3);
                } else {
                    list = list2;
                    raw = new CodeNode.Content.Raw(strGroup2);
                }
                return ParseSpec.INSTANCE.createTerminal((Node) wrapperNodeProvider.invoke(new CodeNode(raw, strGroup, textStyleProvider), Boolean.valueOf(zE), state), state);
            }
        };
    }

    @NotNull
    public final <R, S> Rule<R, Node<R>, S> createDefinitionRule(@NotNull final CodeStyleProviders<R> codeStyleProviders, @NotNull final String... identifiers) {
        Intrinsics.checkNotNullParameter(codeStyleProviders, "codeStyleProviders");
        Intrinsics.checkNotNullParameter(identifiers, "identifiers");
        Pattern patternCompile = Pattern.compile("^\\b(" + y.A(identifiers, "|", null, null, null, 62) + ")(\\s+\\w+)");
        Intrinsics.checkNotNullExpressionValue(patternCompile, "Pattern.compile(\"\"\"^\\b($…String(\"|\")})(\\s+\\w+)\"\"\")");
        return new Rule<R, Node<R>, S>(patternCompile) { // from class: com.discord.simpleast.code.CodeRules.createDefinitionRule.1
            @Override // com.discord.simpleast.core.parser.Rule
            @NotNull
            public ParseSpec<R, S> parse(@NotNull Matcher matcher, @NotNull Parser<R, ? super Node<R>, S> parser, S state) {
                Intrinsics.checkNotNullParameter(matcher, "matcher");
                Intrinsics.checkNotNullParameter(parser, "parser");
                String strGroup = matcher.group(1);
                Intrinsics.checkNotNull(strGroup);
                String strGroup2 = matcher.group(2);
                Intrinsics.checkNotNull(strGroup2);
                return ParseSpec.INSTANCE.createTerminal(new CodeNode.DefinitionNode(strGroup, strGroup2, codeStyleProviders), state);
            }
        };
    }

    @NotNull
    public final <R, S> Rule<R, Node<R>, S> createInlineCodeRule(@NotNull StyleNode.SpanProvider<R> textStyleProvider, @NotNull StyleNode.SpanProvider<R> bgStyleProvider) {
        Intrinsics.checkNotNullParameter(textStyleProvider, "textStyleProvider");
        Intrinsics.checkNotNullParameter(bgStyleProvider, "bgStyleProvider");
        return new C02131(textStyleProvider, bgStyleProvider, PATTERN_CODE_INLINE);
    }

    public final Pattern createWordPattern$simpleast_core_release(@NotNull String... words) {
        Intrinsics.checkNotNullParameter(words, "words");
        return Pattern.compile("^\\b(?:" + y.A(words, "|", null, null, null, 62) + ")\\b");
    }

    @NotNull
    public final Pattern getPATTERN_CODE_BLOCK() {
        return PATTERN_CODE_BLOCK;
    }

    @NotNull
    public final Pattern getPATTERN_CODE_INLINE() {
        return PATTERN_CODE_INLINE;
    }

    @NotNull
    public final Pattern getPATTERN_LEADING_WS_CONSUMER() {
        return PATTERN_LEADING_WS_CONSUMER;
    }

    @NotNull
    public final Pattern getPATTERN_NUMBERS() {
        return PATTERN_NUMBERS;
    }

    @NotNull
    public final Pattern getPATTERN_TEXT() {
        return PATTERN_TEXT;
    }

    @NotNull
    public final <R, S> Rule<R, Node<R>, S> toMatchGroupRule(@NotNull final Pattern toMatchGroupRule, final int i7, final StyleNode.SpanProvider<R> spanProvider) {
        Intrinsics.checkNotNullParameter(toMatchGroupRule, "$this$toMatchGroupRule");
        return new Rule<R, Node<R>, S>(toMatchGroupRule) { // from class: com.discord.simpleast.code.CodeRules.toMatchGroupRule.1
            @Override // com.discord.simpleast.core.parser.Rule
            @NotNull
            public ParseSpec<R, S> parse(@NotNull Matcher matcher, @NotNull Parser<R, ? super Node<R>, S> parser, S state) {
                Intrinsics.checkNotNullParameter(matcher, "matcher");
                Intrinsics.checkNotNullParameter(parser, "parser");
                String strGroup = matcher.group(i7);
                if (strGroup == null) {
                    strGroup = "";
                }
                StyleNode.SpanProvider spanProvider2 = spanProvider;
                return ParseSpec.INSTANCE.createTerminal(spanProvider2 != null ? new StyleNode.TextStyledNode<>(strGroup, spanProvider2) : new TextNode<>(strGroup), state);
            }
        };
    }
}
