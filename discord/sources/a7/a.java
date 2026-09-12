package a7;

import android.view.MotionEvent;
import android.webkit.CookieManager;
import com.discord.audio.AndroidAudioDevice;
import com.discord.bundle_updater.AppManifest;
import com.discord.bundle_updater.BuildOverrideCookieMeta;
import com.discord.chat.bridge.botuikit.ActionRowComponent;
import com.discord.chat.bridge.botuikit.ChannelSelectComponent;
import com.discord.chat.bridge.botuikit.ContainerComponent;
import com.discord.chat.bridge.botuikit.ContentInventoryEntry;
import com.discord.chat.bridge.botuikit.MediaGalleryDisplayComponent;
import com.discord.chat.bridge.botuikit.MentionableSelectComponent;
import com.discord.chat.bridge.botuikit.RoleSelectComponent;
import com.discord.chat.bridge.botuikit.SearchableSelectComponent;
import com.discord.chat.bridge.botuikit.SectionComponent;
import com.discord.chat.bridge.botuikit.SelectComponent;
import com.discord.chat.bridge.botuikit.SelectItem;
import com.discord.chat.bridge.botuikit.StringSelectComponent;
import com.discord.chat.bridge.botuikit.UserSelectComponent;
import com.discord.chat.bridge.contentnode.AttachmentLinkContentNode;
import com.discord.chat.bridge.contentnode.BlockQuoteContentNode;
import com.discord.media_player.reactevents.MediaPlayerViewDidDisappear;
import com.discord.media_player.reactevents.MediaPlayerViewWillAppear;
import com.discord.metric_monitor.MetricEvent;
import com.facebook.react.uimanager.JSPointerDispatcher;
import com.facebook.react.uimanager.events.EventDispatcher;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f283d;

    public /* synthetic */ a(int i7) {
        this.f283d = i7;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f283d) {
            case 0:
                return MediaPlayerViewDidDisappear._childSerializers$_anonymous_();
            case 1:
                return MediaPlayerViewWillAppear._childSerializers$_anonymous_();
            case 2:
                return MetricEvent._childSerializers$_anonymous_();
            case 3:
                try {
                    try {
                        return JSPointerDispatcher.class.getMethod("handleMotionEvent", MotionEvent.class, EventDispatcher.class, Boolean.TYPE);
                    } catch (NoSuchMethodException unused) {
                        return JSPointerDispatcher.class.getMethod("handleMotionEvent", MotionEvent.class, EventDispatcher.class);
                    }
                } catch (NoSuchMethodException unused2) {
                    return null;
                }
            case 4:
                return AndroidAudioDevice._childSerializers$_anonymous_();
            case 5:
                return Unit.f14616a;
            case 6:
                return AppManifest._childSerializers$_anonymous_();
            case 7:
                return AppManifest._childSerializers$_anonymous_$0();
            case 8:
                return BuildOverrideCookieMeta._childSerializers$_anonymous_();
            case 9:
                return BuildOverrideCookieMeta._childSerializers$_anonymous_$0();
            case 10:
                return BuildOverrideCookieMeta._childSerializers$_anonymous_$1();
            case 11:
                return CookieManager.getInstance();
            case 12:
                return ActionRowComponent._childSerializers$_anonymous_();
            case 13:
                return ChannelSelectComponent._childSerializers$_anonymous_();
            case 14:
                return ChannelSelectComponent._childSerializers$_anonymous_$0();
            case 15:
                return ContainerComponent._childSerializers$_anonymous_();
            case 16:
                return ContentInventoryEntry._childSerializers$_anonymous_();
            case 17:
                return ContentInventoryEntry._childSerializers$_anonymous_$0();
            case 18:
                return MediaGalleryDisplayComponent._childSerializers$_anonymous_();
            case 19:
                return MentionableSelectComponent._childSerializers$_anonymous_();
            case 20:
                return RoleSelectComponent._childSerializers$_anonymous_();
            case 21:
                return SearchableSelectComponent._init_$_anonymous_();
            case 22:
                return SectionComponent._childSerializers$_anonymous_();
            case 23:
                return SelectComponent._init_$_anonymous_();
            case 24:
                return SelectItem._init_$_anonymous_();
            case 25:
                return StringSelectComponent._childSerializers$_anonymous_();
            case 26:
                return StringSelectComponent._childSerializers$_anonymous_$1();
            case 27:
                return UserSelectComponent._childSerializers$_anonymous_();
            case 28:
                return AttachmentLinkContentNode._childSerializers$_anonymous_();
            default:
                return BlockQuoteContentNode._childSerializers$_anonymous_();
        }
    }
}
