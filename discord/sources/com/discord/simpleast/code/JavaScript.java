package com.discord.simpleast.code;

import com.discord.simpleast.core.node.Node;
import com.discord.simpleast.core.node.StyleNode;
import com.discord.simpleast.core.parser.ParseSpec;
import com.discord.simpleast.core.parser.Parser;
import com.discord.simpleast.core.parser.Rule;
import com.facebook.react.devsupport.StackTraceHelper;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.collections.d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u001a\u001b\u001cB\u0007\b\u0002¢\u0006\u0002\u0010\u0002JE\u0010\u0011\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u0002H\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00140\u0015\u0012\u0004\u0012\u0002H\u00160\u00130\u0012\"\u0004\b\u0000\u0010\u0014\"\u0004\b\u0001\u0010\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0018H\u0000¢\u0006\u0002\b\u0019R\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\n\u0010\u0007R\u0016\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n \r*\u0004\u0018\u00010\f0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n \r*\u0004\u0018\u00010\f0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n \r*\u0004\u0018\u00010\f0\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/discord/simpleast/code/JavaScript;", "", "()V", "BUILT_INS", "", "", "getBUILT_INS", "()[Ljava/lang/String;", "[Ljava/lang/String;", "KEYWORDS", "getKEYWORDS", "PATTERN_JAVASCRIPT_COMMENTS", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "PATTERN_JAVASCRIPT_GENERIC", "PATTERN_JAVASCRIPT_REGEX", "PATTERN_JAVASCRIPT_STRINGS", "createCodeRules", "", "Lcom/discord/simpleast/core/parser/Rule;", "RC", "Lcom/discord/simpleast/core/node/Node;", "S", "codeStyleProviders", "Lcom/discord/simpleast/code/CodeStyleProviders;", "createCodeRules$simpleast_core_release", "FieldNode", "FunctionNode", "ObjectPropertyNode", "simpleast-core_release"}, k = 1, mv = {1, 4, 0})
public final class JavaScript {
    public static final JavaScript INSTANCE = new JavaScript();

    @NotNull
    private static final String[] KEYWORDS = {"import|from|export|default|package", "class|enum", "function|super|extends|implements|arguments", "var|let|const|static|get|set|new", "return|break|continue|yield|void", "if|else|for|while|do|switch|async|await|case|try|catch|finally|delete|throw|NaN|Infinity", "of|in|instanceof|typeof", "debugger|with", "true|false|null|undefined"};

    @NotNull
    private static final String[] BUILT_INS = {"String|Boolean|RegExp|Number|Date|Math|JSON|Symbol|BigInt|Atomics|DataView", "Function|Promise|Generator|GeneratorFunction|AsyncFunction|AsyncGenerator|AsyncGeneratorFunction", "Array|Object|Map|Set|WeakMap|WeakSet|Int8Array|Int16Array|Int32Array|Uint8Array|Uint16Array", "Uint32Array|Uint8ClampedArray|Float32Array|Float64Array|BigInt64Array|BigUint64Array|Buffer", "ArrayBuffer|SharedArrayBuffer", "Reflect|Proxy|Intl|WebAssembly", "console|process|require|isNaN|parseInt|parseFloat|encodeURI|decodeURI|encodeURIComponent", "decodeURIComponent|this|global|globalThis|eval|isFinite|module", "setTimeout|setInterval|clearTimeout|clearInterval|setImmediate|clearImmediate", "queueMicrotask|document|window", "Error|SyntaxError|TypeError|RangeError|ReferenceError|EvalError|InternalError|URIError", "AggregateError|escape|unescape|URL|URLSearchParams|TextEncoder|TextDecoder", "AbortController|AbortSignal|EventTarget|Event|MessageChannel", "MessagePort|MessageEvent|FinalizationRegistry|WeakRef", "regeneratorRuntime|performance"};
    private static final Pattern PATTERN_JAVASCRIPT_REGEX = Pattern.compile("^/.+(?<!\\\\)/[dgimsuy]*");
    private static final Pattern PATTERN_JAVASCRIPT_GENERIC = Pattern.compile("^<.*(?<!\\\\)>");
    private static final Pattern PATTERN_JAVASCRIPT_COMMENTS = Pattern.compile("^(?:(?://.*?(?=\\n|$))|(/\\*.*?\\*/))", 32);
    private static final Pattern PATTERN_JAVASCRIPT_STRINGS = Pattern.compile("^('.*?(?<!\\\\)'|\".*?(?<!\\\\)\"|`[\\s\\S]*?(?<!\\\\)`)(?=\\W|\\s|$)");

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \t*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001\tB#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0002\u0010\b¨\u0006\n"}, d2 = {"Lcom/discord/simpleast/code/JavaScript$FieldNode;", "RC", "Lcom/discord/simpleast/core/node/Node$Parent;", "definition", "", StackTraceHelper.NAME_KEY, "codeStyleProviders", "Lcom/discord/simpleast/code/CodeStyleProviders;", "(Ljava/lang/String;Ljava/lang/String;Lcom/discord/simpleast/code/CodeStyleProviders;)V", "Companion", "simpleast-core_release"}, k = 1, mv = {1, 4, 0})
    public static final class FieldNode<RC> extends Node.Parent<RC> {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Pattern PATTERN_JAVASCRIPT_FIELD = Pattern.compile("^(var|let|const)(\\s+[a-zA-Z_$][a-zA-Z0-9_$]*)");

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J8\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u0002H\b\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\t\u0012\u0004\u0012\u0002H\n0\u0007\"\u0004\b\u0001\u0010\b\"\u0004\b\u0002\u0010\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\b0\fR\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/discord/simpleast/code/JavaScript$FieldNode$Companion;", "", "()V", "PATTERN_JAVASCRIPT_FIELD", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "createFieldRule", "Lcom/discord/simpleast/core/parser/Rule;", "RC", "Lcom/discord/simpleast/core/node/Node;", "S", "codeStyleProviders", "Lcom/discord/simpleast/code/CodeStyleProviders;", "simpleast-core_release"}, k = 1, mv = {1, 4, 0})
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final <RC, S> Rule<RC, Node<RC>, S> createFieldRule(@NotNull final CodeStyleProviders<RC> codeStyleProviders) {
                Intrinsics.checkNotNullParameter(codeStyleProviders, "codeStyleProviders");
                final Pattern PATTERN_JAVASCRIPT_FIELD = FieldNode.PATTERN_JAVASCRIPT_FIELD;
                Intrinsics.checkNotNullExpressionValue(PATTERN_JAVASCRIPT_FIELD, "PATTERN_JAVASCRIPT_FIELD");
                return new Rule<RC, Node<RC>, S>(PATTERN_JAVASCRIPT_FIELD) { // from class: com.discord.simpleast.code.JavaScript$FieldNode$Companion$createFieldRule$1
                    @Override // com.discord.simpleast.core.parser.Rule
                    @NotNull
                    public ParseSpec<RC, S> parse(@NotNull Matcher matcher, @NotNull Parser<RC, ? super Node<RC>, S> parser, S state) {
                        Intrinsics.checkNotNullParameter(matcher, "matcher");
                        Intrinsics.checkNotNullParameter(parser, "parser");
                        String strGroup = matcher.group(1);
                        String strGroup2 = matcher.group(2);
                        ParseSpec.Companion companion = ParseSpec.INSTANCE;
                        Intrinsics.checkNotNull(strGroup);
                        Intrinsics.checkNotNull(strGroup2);
                        return companion.createTerminal(new JavaScript.FieldNode(strGroup, strGroup2, codeStyleProviders), state);
                    }
                };
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FieldNode(@NotNull String definition, @NotNull String name, @NotNull CodeStyleProviders<RC> codeStyleProviders) {
            super(new StyleNode.TextStyledNode(definition, codeStyleProviders.getKeywordStyleProvider()), new StyleNode.TextStyledNode(name, codeStyleProviders.getIdentifierStyleProvider()));
            Intrinsics.checkNotNullParameter(definition, "definition");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(codeStyleProviders, "codeStyleProviders");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \n*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001\nB-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0002\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/discord/simpleast/code/JavaScript$FunctionNode;", "RC", "Lcom/discord/simpleast/core/node/Node$Parent;", "pre", "", "signature", "params", "codeStyleProviders", "Lcom/discord/simpleast/code/CodeStyleProviders;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/simpleast/code/CodeStyleProviders;)V", "Companion", "simpleast-core_release"}, k = 1, mv = {1, 4, 0})
    public static final class FunctionNode<RC> extends Node.Parent<RC> {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Pattern PATTERN_JAVASCRIPT_FUNC = new Regex("^(function\\*?|static|get|set|async)(\\s+[a-zA-Z_$][a-zA-Z0-9_$]*)?(\\s*\\(.*?\\))", p.DOT_MATCHES_ALL).f14706d;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J8\u0010\u0005\u001a\u001a\u0012\u0004\u0012\u0002H\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00070\b\u0012\u0004\u0012\u0002H\t0\u0006\"\u0004\b\u0001\u0010\u0007\"\u0004\b\u0002\u0010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00070\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/discord/simpleast/code/JavaScript$FunctionNode$Companion;", "", "()V", "PATTERN_JAVASCRIPT_FUNC", "Ljava/util/regex/Pattern;", "createFunctionRule", "Lcom/discord/simpleast/core/parser/Rule;", "RC", "Lcom/discord/simpleast/core/node/Node;", "S", "codeStyleProviders", "Lcom/discord/simpleast/code/CodeStyleProviders;", "simpleast-core_release"}, k = 1, mv = {1, 4, 0})
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final <RC, S> Rule<RC, Node<RC>, S> createFunctionRule(@NotNull final CodeStyleProviders<RC> codeStyleProviders) {
                Intrinsics.checkNotNullParameter(codeStyleProviders, "codeStyleProviders");
                final Pattern pattern = FunctionNode.PATTERN_JAVASCRIPT_FUNC;
                return new Rule<RC, Node<RC>, S>(pattern) { // from class: com.discord.simpleast.code.JavaScript$FunctionNode$Companion$createFunctionRule$1
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
                        Intrinsics.checkNotNull(strGroup3);
                        return companion.createTerminal(new JavaScript.FunctionNode(strGroup, strGroup2, strGroup3, codeStyleProviders), state);
                    }
                };
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FunctionNode(@NotNull String pre, String str, @NotNull String params, @NotNull CodeStyleProviders<RC> codeStyleProviders) {
            super(new StyleNode.TextStyledNode(pre, codeStyleProviders.getKeywordStyleProvider()), str != null ? new StyleNode.TextStyledNode(str, codeStyleProviders.getIdentifierStyleProvider()) : null, new StyleNode.TextStyledNode(params, codeStyleProviders.getParamsStyleProvider()));
            Intrinsics.checkNotNullParameter(pre, "pre");
            Intrinsics.checkNotNullParameter(params, "params");
            Intrinsics.checkNotNullParameter(codeStyleProviders, "codeStyleProviders");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \n*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001\nB+\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0002\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/discord/simpleast/code/JavaScript$ObjectPropertyNode;", "RC", "Lcom/discord/simpleast/core/node/Node$Parent;", "prefix", "", "property", "suffix", "codeStyleProviders", "Lcom/discord/simpleast/code/CodeStyleProviders;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/simpleast/code/CodeStyleProviders;)V", "Companion", "simpleast-core_release"}, k = 1, mv = {1, 4, 0})
    public static final class ObjectPropertyNode<RC> extends Node.Parent<RC> {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Pattern PATTERN_JAVASCRIPT_OBJECT_PROPERTY = Pattern.compile("^([\\{\\[\\,])(\\s*[a-zA-Z0-9_$]+)(\\s*:)");

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J8\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u0002H\b\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\t\u0012\u0004\u0012\u0002H\n0\u0007\"\u0004\b\u0001\u0010\b\"\u0004\b\u0002\u0010\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\b0\fR\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/discord/simpleast/code/JavaScript$ObjectPropertyNode$Companion;", "", "()V", "PATTERN_JAVASCRIPT_OBJECT_PROPERTY", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "createObjectPropertyRule", "Lcom/discord/simpleast/core/parser/Rule;", "RC", "Lcom/discord/simpleast/core/node/Node;", "S", "codeStyleProviders", "Lcom/discord/simpleast/code/CodeStyleProviders;", "simpleast-core_release"}, k = 1, mv = {1, 4, 0})
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final <RC, S> Rule<RC, Node<RC>, S> createObjectPropertyRule(@NotNull final CodeStyleProviders<RC> codeStyleProviders) {
                Intrinsics.checkNotNullParameter(codeStyleProviders, "codeStyleProviders");
                final Pattern PATTERN_JAVASCRIPT_OBJECT_PROPERTY = ObjectPropertyNode.PATTERN_JAVASCRIPT_OBJECT_PROPERTY;
                Intrinsics.checkNotNullExpressionValue(PATTERN_JAVASCRIPT_OBJECT_PROPERTY, "PATTERN_JAVASCRIPT_OBJECT_PROPERTY");
                return new Rule<RC, Node<RC>, S>(PATTERN_JAVASCRIPT_OBJECT_PROPERTY) { // from class: com.discord.simpleast.code.JavaScript$ObjectPropertyNode$Companion$createObjectPropertyRule$1
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
                        Intrinsics.checkNotNull(strGroup3);
                        return companion.createTerminal(new JavaScript.ObjectPropertyNode(strGroup, strGroup2, strGroup3, codeStyleProviders), state);
                    }
                };
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ObjectPropertyNode(@NotNull String prefix, @NotNull String property, @NotNull String suffix, @NotNull CodeStyleProviders<RC> codeStyleProviders) {
            super(new StyleNode.TextStyledNode(prefix, codeStyleProviders.getDefaultStyleProvider()), new StyleNode.TextStyledNode(property, codeStyleProviders.getIdentifierStyleProvider()), new StyleNode.TextStyledNode(suffix, codeStyleProviders.getDefaultStyleProvider()));
            Intrinsics.checkNotNullParameter(prefix, "prefix");
            Intrinsics.checkNotNullParameter(property, "property");
            Intrinsics.checkNotNullParameter(suffix, "suffix");
            Intrinsics.checkNotNullParameter(codeStyleProviders, "codeStyleProviders");
        }
    }

    private JavaScript() {
    }

    @NotNull
    public final <RC, S> List<Rule<RC, Node<RC>, S>> createCodeRules$simpleast_core_release(@NotNull CodeStyleProviders<RC> codeStyleProviders) {
        Intrinsics.checkNotNullParameter(codeStyleProviders, "codeStyleProviders");
        CodeRules codeRules = CodeRules.INSTANCE;
        Pattern PATTERN_JAVASCRIPT_COMMENTS2 = PATTERN_JAVASCRIPT_COMMENTS;
        Intrinsics.checkNotNullExpressionValue(PATTERN_JAVASCRIPT_COMMENTS2, "PATTERN_JAVASCRIPT_COMMENTS");
        Rule matchGroupRule$default = CodeRules.toMatchGroupRule$default(codeRules, PATTERN_JAVASCRIPT_COMMENTS2, 0, codeStyleProviders.getCommentStyleProvider(), 1, null);
        Pattern PATTERN_JAVASCRIPT_STRINGS2 = PATTERN_JAVASCRIPT_STRINGS;
        Intrinsics.checkNotNullExpressionValue(PATTERN_JAVASCRIPT_STRINGS2, "PATTERN_JAVASCRIPT_STRINGS");
        Rule matchGroupRule$default2 = CodeRules.toMatchGroupRule$default(codeRules, PATTERN_JAVASCRIPT_STRINGS2, 0, codeStyleProviders.getLiteralStyleProvider(), 1, null);
        Rule<RC, Node<RC>, S> ruleCreateObjectPropertyRule = ObjectPropertyNode.INSTANCE.createObjectPropertyRule(codeStyleProviders);
        Pattern PATTERN_JAVASCRIPT_GENERIC2 = PATTERN_JAVASCRIPT_GENERIC;
        Intrinsics.checkNotNullExpressionValue(PATTERN_JAVASCRIPT_GENERIC2, "PATTERN_JAVASCRIPT_GENERIC");
        Rule matchGroupRule$default3 = CodeRules.toMatchGroupRule$default(codeRules, PATTERN_JAVASCRIPT_GENERIC2, 0, codeStyleProviders.getGenericsStyleProvider(), 1, null);
        Pattern PATTERN_JAVASCRIPT_REGEX2 = PATTERN_JAVASCRIPT_REGEX;
        Intrinsics.checkNotNullExpressionValue(PATTERN_JAVASCRIPT_REGEX2, "PATTERN_JAVASCRIPT_REGEX");
        return d0.g(matchGroupRule$default, matchGroupRule$default2, ruleCreateObjectPropertyRule, matchGroupRule$default3, CodeRules.toMatchGroupRule$default(codeRules, PATTERN_JAVASCRIPT_REGEX2, 0, codeStyleProviders.getLiteralStyleProvider(), 1, null), FieldNode.INSTANCE.createFieldRule(codeStyleProviders), FunctionNode.INSTANCE.createFunctionRule(codeStyleProviders));
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
