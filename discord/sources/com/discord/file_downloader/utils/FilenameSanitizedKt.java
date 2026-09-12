package com.discord.file_downloader.utils;

import android.webkit.MimeTypeMap;
import com.reactnativecommunity.clipboard.ClipboardModule;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.w0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0010\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0002\u001a\u0018\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\u0002\u001a\u0018\u0010\b\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\u0002\u001a\u0018\u0010\t\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\u0002\u001a\u0010\u0010\n\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0002\u001a\f\u0010\r\u001a\u0004\u0018\u00010\u0001*\u00020\u0001\"\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"filenameSanitized", "", "", "decodeUrlSafely", "filename", "processFilename", "useUrlEncoded", "", "removeFileSizeModifiers", "fixAtSeparatorExtensions", "sanitizeInvalidCharacters", "EXTENSION_TO_MIME_TYPE", "", "getMimeTypeFromFilename", "file_downloader_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class FilenameSanitizedKt {

    @NotNull
    private static final Map<String, String> EXTENSION_TO_MIME_TYPE = w0.g(new Pair("avif", "image/avif"), new Pair("gif", "image/gif"), new Pair("heic", ClipboardModule.MIMETYPE_HEIC), new Pair("jpeg", ClipboardModule.MIMETYPE_JPEG), new Pair("jpg", ClipboardModule.MIMETYPE_JPEG), new Pair("mov", "video/quicktime"), new Pair("mp3", "audio/mpeg"), new Pair("mp4", "video/mp4"), new Pair("pdf", "application/pdf"), new Pair("png", ClipboardModule.MIMETYPE_PNG), new Pair("txt", "text/plain"), new Pair("wav", "audio/wav"), new Pair("webm", "video/webm"), new Pair("webp", ClipboardModule.MIMETYPE_WEBP), new Pair("zip", "application/zip"));

    private static final String decodeUrlSafely(String str) throws UnsupportedEncodingException {
        String strDecode = URLDecoder.decode(str, "UTF-8");
        Intrinsics.checkNotNullExpressionValue(strDecode, "decode(...)");
        return strDecode;
    }

    @NotNull
    public static final String filenameSanitized(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        String string = charSequence.toString();
        try {
            return processFilename(decodeUrlSafely(string), false);
        } catch (UnsupportedEncodingException unused) {
            return processFilename(string, true);
        } catch (IllegalArgumentException unused2) {
            return processFilename(string, true);
        }
    }

    private static final String fixAtSeparatorExtensions(String str, boolean z5) {
        String str2 = z5 ? "%40" : "@";
        FilenamePatterns filenamePatterns = FilenamePatterns.INSTANCE;
        String strReplace = filenamePatterns.binExtensionFixPattern(str2).replace(str, "$1.$2");
        return Intrinsics.areEqual(strReplace, str) ? filenamePatterns.atSeparatorPattern(str2).replace(str, "$1.$2") : strReplace;
    }

    public static final String getMimeTypeFromFilename(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String lowerCase = StringsKt.W('.', str, "").toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        if (lowerCase.length() == 0) {
            return null;
        }
        try {
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase);
            return mimeTypeFromExtension == null ? EXTENSION_TO_MIME_TYPE.get(lowerCase) : mimeTypeFromExtension;
        } catch (RuntimeException unused) {
            return EXTENSION_TO_MIME_TYPE.get(lowerCase);
        }
    }

    private static final String processFilename(String str, boolean z5) {
        return sanitizeInvalidCharacters(fixAtSeparatorExtensions(removeFileSizeModifiers(str, z5), z5));
    }

    private static final String removeFileSizeModifiers(String str, boolean z5) {
        return FilenamePatterns.INSTANCE.sizeModifierPattern(z5 ? "%3A" : ":").replace(str, "$1");
    }

    private static final String sanitizeInvalidCharacters(String str) {
        return FilenamePatterns.INSTANCE.getINVALID_FILENAME_CHARS().replace(str, "_");
    }
}
