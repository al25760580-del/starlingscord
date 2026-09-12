package com.discord.crash_reporting;

import com.discord.emoji.UnicodeEmojis;
import com.discord.emoji_picker.EmojiPickerViewHolder;
import com.discord.file_downloader.FileDownloader;
import com.discord.jank_stats.JankSessionRecorder;
import com.discord.misc.utilities.threading.ThreadUtilsKt;
import com.discord.mobile_voice_overlay.ConnectionQuality;
import com.discord.mobile_voice_overlay.MobileVoiceOverlayData;
import com.discord.notifications.client.NotificationClient;
import com.discord.play_delivery.PlayAssetDelivery;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4342d;

    public /* synthetic */ d(int i7) {
        this.f4342d = i7;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f4342d) {
            case 0:
                return TelemetryRing.ioExecutor_delegate$lambda$2();
            case 1:
                return UnicodeEmojis.Emoji._childSerializers$_anonymous_();
            case 2:
                return UnicodeEmojis.EmojiCategories._childSerializers$_anonymous_();
            case 3:
                return UnicodeEmojis.EmojiCategories._childSerializers$_anonymous_$0();
            case 4:
                return UnicodeEmojis.EmojiCategories._childSerializers$_anonymous_$1();
            case 5:
                return UnicodeEmojis.EmojiCategories._childSerializers$_anonymous_$2();
            case 6:
                return UnicodeEmojis.EmojiCategories._childSerializers$_anonymous_$3();
            case 7:
                return UnicodeEmojis.EmojiCategories._childSerializers$_anonymous_$4();
            case 8:
                return UnicodeEmojis.EmojiCategories._childSerializers$_anonymous_$5();
            case 9:
                return UnicodeEmojis.EmojiCategories._childSerializers$_anonymous_$6();
            case 10:
                return EmojiPickerViewHolder.Emoji.placeholder_delegate$lambda$0();
            case 11:
                return FileDownloader.defaultClient_delegate$lambda$0();
            case 12:
                return JankSessionRecorder.flushExecutor_delegate$lambda$2();
            case 13:
                return JankSessionRecorder.init$lambda$4$lambda$3();
            case 14:
                return ThreadUtilsKt.uiHandler_delegate$lambda$0();
            case 15:
                return ConnectionQuality._init_$_anonymous_();
            case 16:
                return MobileVoiceOverlayData._childSerializers$_anonymous_();
            case 17:
                return MobileVoiceOverlayData._childSerializers$_anonymous_$0();
            case 18:
                return MobileVoiceOverlayData._childSerializers$_anonymous_$1();
            case 19:
                return Unit.f14616a;
            case 20:
                return Unit.f14616a;
            case 21:
                return Unit.f14616a;
            case 22:
                return Unit.f14616a;
            case 23:
                return Unit.f14616a;
            case 24:
                return Unit.f14616a;
            case 25:
                return Boolean.valueOf(NotificationClient.shouldDisplayNotification$lambda$0());
            case 26:
                return PlayAssetDelivery.registerBackgroundStartListener$lambda$1();
            case 27:
                return Unit.f14616a;
            case 28:
                return Unit.f14616a;
            default:
                return Unit.f14616a;
        }
    }
}
