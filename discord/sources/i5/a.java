package i5;

import android.view.animation.AnimationUtils;
import com.discord.app_database.DatabaseVersions;
import com.discord.bundle_updater.react.events.OtaCheckAttemptEvent;
import com.discord.chat.bridge.Message;
import com.discord.chat.bridge.MessageBase;
import com.discord.chat.bridge.activities.ActivityInstanceEmbed;
import com.discord.chat.bridge.activities.ActivityRichPresenceInviteEmbed;
import com.discord.chat.bridge.activities.EmbedDisplayType;
import com.discord.chat.bridge.codedlinks.AppMessageEmbedDisplayType;
import com.discord.chat.bridge.codedlinks.AppMessageEmbedImpl;
import com.discord.chat.bridge.codedlinks.EmbeddedActivityInviteEmbedImpl;
import com.discord.chat.presentation.textutils.CodeStyle;
import com.discord.push_notification_monitor.PushNotificationLog;
import com.discord.react.utilities.ReactViewExtensionsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11390d;

    public /* synthetic */ a(int i7) {
        this.f11390d = i7;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f11390d) {
            case 0:
                return DatabaseVersions._childSerializers$_anonymous_$0();
            case 1:
                try {
                    return Class.forName("com.facebook.react.uimanager.HasChildPressedStateDelay").getMethod("setHasChildPressedStateDelay", Boolean.class);
                } catch (ReflectiveOperationException unused) {
                    return null;
                }
            case 2:
                return OtaCheckAttemptEvent._childSerializers$_anonymous_();
            case 3:
                return Message._childSerializers$_anonymous_$8();
            case 4:
                return Message._childSerializers$_anonymous_$9();
            case 5:
                return Message._childSerializers$_anonymous_();
            case 6:
                return Message._childSerializers$_anonymous_$2();
            case 7:
                return Message._childSerializers$_anonymous_$3();
            case 8:
                return Message._childSerializers$_anonymous_$4();
            case 9:
                return Message._childSerializers$_anonymous_$5();
            case 10:
                return Message._childSerializers$_anonymous_$6();
            case 11:
                return Message._childSerializers$_anonymous_$7();
            case 12:
                return MessageBase._init_$_anonymous_();
            case 13:
                return PushNotificationLog._childSerializers$_anonymous_();
            case 14:
                return ActivityInstanceEmbed._childSerializers$_anonymous_();
            case 15:
                return ActivityRichPresenceInviteEmbed._childSerializers$_anonymous_();
            case 16:
                return ActivityRichPresenceInviteEmbed._childSerializers$_anonymous_$0();
            case 17:
                return ActivityRichPresenceInviteEmbed._childSerializers$_anonymous_$1();
            case 18:
                return ActivityRichPresenceInviteEmbed._childSerializers$_anonymous_$2();
            case 19:
                return EmbedDisplayType._init_$_anonymous_();
            case 20:
                return Unit.f14616a;
            case 21:
                return CodeStyle.parser_delegate$lambda$11();
            case 22:
                return Unit.f14616a;
            case 23:
                return ReactViewExtensionsKt.viewOperationQueueMethod_delegate$lambda$1();
            case 24:
                return Long.valueOf(AnimationUtils.currentAnimationTimeMillis());
            case 25:
                return AppMessageEmbedDisplayType._init_$_anonymous_();
            case 26:
                return AppMessageEmbedImpl._childSerializers$_anonymous_();
            case 27:
                return AppMessageEmbedImpl._childSerializers$_anonymous_$0();
            case 28:
                return AppMessageEmbedImpl._childSerializers$_anonymous_$1();
            default:
                return EmbeddedActivityInviteEmbedImpl._childSerializers$_anonymous_();
        }
    }
}
