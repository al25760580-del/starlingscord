package com.discord.react_strings;

import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.a;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR%\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u0003\u001a\u0004\b\u000b\u0010\b¨\u0006\r"}, d2 = {"Lcom/discord/react_strings/RenderContext;", "", "<init>", "()V", "args", "", "", "getArgs", "()Ljava/util/Map;", "argHooks", "getArgHooks$annotations", "getArgHooks", "Argument", "react_strings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RenderContext {

    @NotNull
    private final Map<String, String> args = new HashMap();

    @NotNull
    private final Map<String, String> argHooks = new HashMap();

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000b\u001a\u00020\n*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ7\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2 \u0010\u0010\u001a\u001c\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r0\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u0016\u0010\u0003R\u0014\u0010\u0017\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018¨\u0006\u001e"}, d2 = {"Lcom/discord/react_strings/RenderContext$Argument;", "", "<init>", "()V", "Lkotlin/text/MatchResult;", "", "group", "", "get", "(Lkotlin/text/MatchResult;I)Ljava/lang/String;", "", "contains", "(Lkotlin/text/MatchResult;I)Z", "", "input", "Lkotlin/Function3;", "onMatch", "replace", "(Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function3;)Ljava/lang/String;", "Lkotlin/text/Regex;", "argumentRegex", "Lkotlin/text/Regex;", "getArgumentRegex$annotations", "GROUP_ESCAPE_L", "I", "GROUP_ESCAPE_R", "GROUP_ARG_NAME", "GROUP_HOOK_MARKER_L", "GROUP_HOOK_MARKER_R", "GROUP_HOOK", "react_strings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Argument {
        private static final int GROUP_ARG_NAME = 3;
        private static final int GROUP_ESCAPE_L = 2;
        private static final int GROUP_ESCAPE_R = 4;
        private static final int GROUP_HOOK = 7;
        private static final int GROUP_HOOK_MARKER_L = 1;
        private static final int GROUP_HOOK_MARKER_R = 5;

        @NotNull
        public static final Argument INSTANCE = new Argument();

        @NotNull
        private static final Regex argumentRegex = new Regex("(\\[)?(!!)?\\{(\\S+?)\\}(!!)?(\\])?(\\((\\S+?)\\))?");

        private Argument() {
        }

        private final boolean contains(MatchResult matchResult, int i7) {
            return get(matchResult, i7).length() > 0;
        }

        private final String get(MatchResult matchResult, int i7) {
            return (String) matchResult.a().get(i7);
        }

        private static /* synthetic */ void getArgumentRegex$annotations() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence replace$lambda$0(Function3 function3, MatchResult match) {
            Intrinsics.checkNotNullParameter(match, "match");
            Argument argument = INSTANCE;
            return (CharSequence) function3.invoke(argument.get(match, 3), (argument.contains(match, 1) && argument.contains(match, 5)) ? (String) match.a().get(7) : null, Boolean.valueOf(argument.contains(match, 2) && argument.contains(match, 4)));
        }

        @NotNull
        public final String replace(@NotNull CharSequence input, @NotNull Function3 onMatch) {
            Intrinsics.checkNotNullParameter(input, "input");
            Intrinsics.checkNotNullParameter(onMatch, "onMatch");
            return argumentRegex.e(input, new a(13, onMatch));
        }
    }

    public static /* synthetic */ void getArgHooks$annotations() {
    }

    @NotNull
    public final Map<String, String> getArgHooks() {
        return this.argHooks;
    }

    @NotNull
    public final Map<String, String> getArgs() {
        return this.args;
    }
}
