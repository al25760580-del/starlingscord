package com.discord.media.utils;

import android.media.MediaFormat;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import rn.q;
import rn.r;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u001a\n\u0010\u0007\u001a\u00020\b*\u00020\u0002\"\u0017\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004\"\u0017\u0010\t\u001a\u0004\u0018\u00010\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\"\u0017\u0010\r\u001a\u0004\u0018\u00010\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\f\"\u0017\u0010\u000f\u001a\u0004\u0018\u00010\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0004¨\u0006\u0011"}, d2 = {"mimeType", "", "Landroid/media/MediaFormat;", "getMimeType", "(Landroid/media/MediaFormat;)Ljava/lang/String;", "codecType", "getCodecType", "isHevcVideo", "", "profile", "", "getProfile", "(Landroid/media/MediaFormat;)Ljava/lang/Integer;", "level", "getLevel", "profileName", "getProfileName", "media_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMediaFormatUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaFormatUtils.kt\ncom/discord/media/utils/MediaFormatUtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,55:1\n1#2:56\n*E\n"})
public final class MediaFormatUtilsKt {
    public static final String getCodecType(@NotNull MediaFormat mediaFormat) {
        Intrinsics.checkNotNullParameter(mediaFormat, "<this>");
        String mimeType = getMimeType(mediaFormat);
        if (mimeType == null) {
            return null;
        }
        switch (mimeType) {
            case "video/dolby-vision":
                return "dvh1";
            case "video/3gpp":
                return "h263";
            case "video/av01":
                return "av01";
            case "video/hevc":
                return "hvc1";
            case "video/mpeg2":
                return "mp2v";
            case "video/mp4v-es":
                return "mp4v";
            case "video/avc":
                return "avc1";
            case "video/x-vnd.on2.vp8":
                return "vp08";
            case "video/x-vnd.on2.vp9":
                return "vp09";
            default:
                return null;
        }
    }

    public static final Integer getLevel(@NotNull MediaFormat mediaFormat) {
        Object objO;
        Intrinsics.checkNotNullParameter(mediaFormat, "<this>");
        try {
            q qVar = Result.f14614e;
            objO = Integer.valueOf(mediaFormat.getInteger("level"));
        } catch (Throwable th2) {
            q qVar2 = Result.f14614e;
            objO = ib.a.o(th2);
        }
        if (objO instanceof r) {
            objO = null;
        }
        return (Integer) objO;
    }

    public static final String getMimeType(@NotNull MediaFormat mediaFormat) {
        Object objO;
        Intrinsics.checkNotNullParameter(mediaFormat, "<this>");
        try {
            q qVar = Result.f14614e;
            objO = mediaFormat.getString("mime");
        } catch (Throwable th2) {
            q qVar2 = Result.f14614e;
            objO = ib.a.o(th2);
        }
        if (objO instanceof r) {
            objO = null;
        }
        return (String) objO;
    }

    public static final Integer getProfile(@NotNull MediaFormat mediaFormat) {
        Object objO;
        Intrinsics.checkNotNullParameter(mediaFormat, "<this>");
        try {
            q qVar = Result.f14614e;
            objO = Integer.valueOf(mediaFormat.getInteger("profile"));
        } catch (Throwable th2) {
            q qVar2 = Result.f14614e;
            objO = ib.a.o(th2);
        }
        if (objO instanceof r) {
            objO = null;
        }
        return (Integer) objO;
    }

    public static final String getProfileName(@NotNull MediaFormat mediaFormat) {
        Intrinsics.checkNotNullParameter(mediaFormat, "<this>");
        String mimeType = getMimeType(mediaFormat);
        if (Intrinsics.areEqual(mimeType, "video/avc")) {
            Integer profile = getProfile(mediaFormat);
            if (profile != null && profile.intValue() == 1) {
                return "baseline";
            }
            if (profile != null && profile.intValue() == 2) {
                return "main";
            }
            if (profile != null && profile.intValue() == 4) {
                return "extended";
            }
            if (profile != null && profile.intValue() == 8) {
                return "high";
            }
            return (profile != null && profile.intValue() == 16) ? "high10" : "other";
        }
        if (!Intrinsics.areEqual(mimeType, "video/hevc")) {
            return null;
        }
        Integer profile2 = getProfile(mediaFormat);
        if (profile2 != null && profile2.intValue() == 1) {
            return "main";
        }
        if (profile2 != null && profile2.intValue() == 2) {
            return "main10";
        }
        if (profile2 != null && profile2.intValue() == 4) {
            return "mainstill";
        }
        if (profile2 != null && profile2.intValue() == 4096) {
            return "main10hdr";
        }
        return (profile2 != null && profile2.intValue() == 8192) ? "main10hdrplus" : "other";
    }

    public static final boolean isHevcVideo(@NotNull MediaFormat mediaFormat) {
        Intrinsics.checkNotNullParameter(mediaFormat, "<this>");
        return Intrinsics.areEqual(getMimeType(mediaFormat), "video/hevc");
    }
}
