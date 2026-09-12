package com.discord.file_downloader.utils;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import s0.g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0007J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0007R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/discord/file_downloader/utils/FilenamePatterns;", "", "<init>", "()V", "sizeModifierPattern", "Lkotlin/text/Regex;", "colonPattern", "", "binExtensionFixPattern", "atPattern", "atSeparatorPattern", "INVALID_FILENAME_CHARS", "getINVALID_FILENAME_CHARS", "()Lkotlin/text/Regex;", "file_downloader_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class FilenamePatterns {

    @NotNull
    public static final FilenamePatterns INSTANCE = new FilenamePatterns();

    @NotNull
    private static final Regex INVALID_FILENAME_CHARS = new Regex("[<>:\"/\\\\|?*@]");

    private FilenamePatterns() {
    }

    @NotNull
    public final Regex atSeparatorPattern(@NotNull String atPattern) {
        Intrinsics.checkNotNullParameter(atPattern, "atPattern");
        return new Regex(g.e("(.+)", atPattern, "([a-zA-Z0-9]+)$"));
    }

    @NotNull
    public final Regex binExtensionFixPattern(@NotNull String atPattern) {
        Intrinsics.checkNotNullParameter(atPattern, "atPattern");
        return new Regex(g.e("(.+)", atPattern, "([a-zA-Z0-9]+)\\.bin$"));
    }

    @NotNull
    public final Regex getINVALID_FILENAME_CHARS() {
        return INVALID_FILENAME_CHARS;
    }

    @NotNull
    public final Regex sizeModifierPattern(@NotNull String colonPattern) {
        Intrinsics.checkNotNullParameter(colonPattern, "colonPattern");
        return new Regex(g.e("(\\.[a-zA-Z0-9]+)", colonPattern, ".+$"));
    }
}
