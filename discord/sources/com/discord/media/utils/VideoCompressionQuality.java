package com.discord.media.utils;

import com.facebook.imagepipeline.nativecode.b;
import com.facebook.react.uimanager.ViewProps;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0015B!\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0016"}, d2 = {"Lcom/discord/media/utils/VideoCompressionQuality;", "", "value", "", "targetResolution", "", "targetBitrate", "<init>", "(Ljava/lang/String;ILjava/lang/String;II)V", "getValue", "()Ljava/lang/String;", "getTargetResolution", "()I", "getTargetBitrate", "Original", "VeryHigh", "High", "Medium", "Low", "VeryLow", "None", "Companion", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum VideoCompressionQuality {
    Original("original", Integer.MAX_VALUE, Integer.MAX_VALUE),
    VeryHigh("very_high", 1080, 7000000),
    High("high", 720, 2500000),
    Medium("medium", DiscordVideoMediaSource.DEFAULT_HEIGHT, 2000000),
    Low("low", 360, 1200000),
    VeryLow("very_low", 360, 800000),
    None(ViewProps.NONE, DiscordVideoMediaSource.DEFAULT_HEIGHT, 3000000);

    private final int targetBitrate;
    private final int targetResolution;

    @NotNull
    private final String value;
    private static final /* synthetic */ EnumEntries $ENTRIES = b.l(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lcom/discord/media/utils/VideoCompressionQuality$Companion;", "", "<init>", "()V", "fromString", "Lcom/discord/media/utils/VideoCompressionQuality;", "value", "", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nVideoCompressionQuality.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VideoCompressionQuality.kt\ncom/discord/media/utils/VideoCompressionQuality$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,22:1\n295#2,2:23\n*S KotlinDebug\n*F\n+ 1 VideoCompressionQuality.kt\ncom/discord/media/utils/VideoCompressionQuality$Companion\n*L\n19#1:23,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final VideoCompressionQuality fromString(String value) {
            Object next;
            Iterator<E> it = VideoCompressionQuality.getEntries().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.areEqual(((VideoCompressionQuality) next).getValue(), value));
            VideoCompressionQuality videoCompressionQuality = (VideoCompressionQuality) next;
            return videoCompressionQuality == null ? VideoCompressionQuality.None : videoCompressionQuality;
        }

        private Companion() {
        }
    }

    VideoCompressionQuality(String str, int i7, int i10) {
        this.value = str;
        this.targetResolution = i7;
        this.targetBitrate = i10;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public final int getTargetBitrate() {
        return this.targetBitrate;
    }

    public final int getTargetResolution() {
        return this.targetResolution;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
