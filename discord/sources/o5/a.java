package o5;

import android.os.Handler;
import android.os.HandlerThread;
import com.discord.chat.bridge.codedlinks.GuildProfileInviteEmbedImpl;
import com.discord.chat.bridge.codedlinks.VoiceChannelListInviteEmbedImpl;
import com.discord.chat.bridge.customthemes.SharedCustomThemeData;
import com.discord.chat.bridge.gift_intent.GiftIntentEmbed;
import com.discord.chat.bridge.polls.PollAction;
import com.discord.chat.bridge.polls.PollActionPresentation;
import com.discord.chat.bridge.polls.PollData;
import com.discord.chat.bridge.polls.PollMedia;
import com.discord.chat.bridge.polls.PollResources;
import com.discord.chat.bridge.polls.PollStyleSet;
import com.discord.chat.bridge.row.BlockedGroupRow;
import com.discord.chat.bridge.row.LoadingAction;
import com.discord.chat.bridge.row.LoadingActionType;
import com.discord.chat.bridge.row.MessageRow;
import com.discord.chat.bridge.safetysystemnotification.FooterTheme;
import com.discord.chat.bridge.safetysystemnotification.SafetySystemNotificationEmbed;
import com.discord.chat.bridge.summaries.Summary;
import com.discord.chat.input.bridge.ChatInputNodeFontWeight;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import pr.d;
import pr.m;
import pr.o;
import pr.q;
import pr.r;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f17170d;

    public /* synthetic */ a(int i7) {
        this.f17170d = i7;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f17170d) {
            case 0:
                return GuildProfileInviteEmbedImpl._childSerializers$_anonymous_();
            case 1:
                return VoiceChannelListInviteEmbedImpl._childSerializers$_anonymous_();
            case 2:
                return Unit.f14616a;
            case 3:
                return SharedCustomThemeData._childSerializers$_anonymous_();
            case 4:
                return Unit.f14616a;
            case 5:
                return Unit.f14616a;
            case 6:
                return r.f18542b;
            case 7:
                return o.f18535b;
            case 8:
                return m.f18533b;
            case 9:
                return q.f18540b;
            case 10:
                return d.f18525b;
            case 11:
                return GiftIntentEmbed._childSerializers$_anonymous_();
            case 12:
                return Unit.f14616a;
            case 13:
                HandlerThread handlerThread = new HandlerThread("FrescoAnimationWorker");
                handlerThread.start();
                return new Handler(handlerThread.getLooper());
            case 14:
                throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
            case 15:
                return PollAction._childSerializers$_anonymous_();
            case 16:
                return PollActionPresentation._init_$_anonymous_();
            case 17:
                return PollData._childSerializers$_anonymous_();
            case 18:
                return PollMedia._childSerializers$_anonymous_();
            case 19:
                return PollResources._childSerializers$_anonymous_();
            case 20:
                return PollStyleSet.DEFAULT_delegate$lambda$6();
            case 21:
                return BlockedGroupRow._childSerializers$_anonymous_();
            case 22:
                return LoadingAction._childSerializers$_anonymous_();
            case 23:
                return LoadingActionType._init_$_anonymous_();
            case 24:
                return MessageRow._childSerializers$_anonymous_();
            case 25:
                return FooterTheme._init_$_anonymous_();
            case 26:
                return SafetySystemNotificationEmbed._childSerializers$_anonymous_();
            case 27:
                return Summary._childSerializers$_anonymous_();
            case 28:
                return Boolean.valueOf(ReactNativeFeatureFlags.usePullModelOnAndroid());
            default:
                return ChatInputNodeFontWeight._init_$_anonymous_();
        }
    }
}
