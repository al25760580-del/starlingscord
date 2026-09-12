package androidx.lifecycle;

import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.discord.MainApplication;
import com.discord.bug_reporter.ScreenshotDetector;
import com.discord.bug_reporter.ScreenshotHelperModule;
import com.discord.bundle_updater.BundleUpdaterManager;
import com.discord.chat.input.views.ChatInputRootView;
import com.discord.chat.presentation.message.system.AutomodSystemMessageWrapperView;
import com.discord.chat.presentation.message.view.EmbedView;
import com.discord.chat.presentation.message.view.FileAttachmentView;
import com.discord.chat.presentation.message.view.MessageContentView;
import com.discord.chat.presentation.message.view.botuikit.ComponentProvider;
import com.discord.chat.presentation.message.view.botuikit.components.ButtonComponentView;
import com.discord.chat.presentation.message.view.botuikit.components.ContentInventoryComponentView;
import com.discord.chat.presentation.message.view.botuikit.components.SelectComponentView;
import com.discord.chat.presentation.message.view.voicemessages.AudioPlayerView;
import com.discord.chat.presentation.message.viewholder.GuildEventInviteViewHolder;
import com.discord.chat.presentation.root.ChatView;
import com.discord.crash_reporting.system_logs.SystemLogCapture;
import com.discord.emoji_picker.EmojiPickerItemData;
import com.discord.emoji_picker.EmojiPickerScroller;
import com.discord.emoji_picker.EmojiPickerView;
import com.discord.mobile_voice_overlay.MobileVoiceOverlay;
import com.discord.notifications.react.PushNotificationModule;
import com.discord.progress_dots.ProgressDots;
import com.discord.recycler_view.utils.TransitionResilientGridLayoutManager;
import com.discord.recycler_view.utils.TransitionResilientLinearLayoutManager;
import com.facebook.react.modules.appearance.AppearanceModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import java.util.concurrent.FutureTask;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r0 implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2386d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2387e;

    public /* synthetic */ r0(int i7, Object obj) {
        this.f2386d = i7;
        this.f2387e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f2386d) {
            case 0:
                return q0.c((c1) this.f2387e);
            case 1:
                return AppearanceModule.schemeChangeListener$lambda$0((AppearanceModule) this.f2387e);
            case 2:
                return MainApplication.performInitialization$lambda$11((FutureTask) this.f2387e);
            case 3:
                return ScreenshotDetector.screenshotContentObserver$lambda$0((ScreenshotDetector) this.f2387e);
            case 4:
                return ScreenshotHelperModule.addListener$lambda$0((ScreenshotHelperModule) this.f2387e);
            case 5:
                return BundleUpdaterManager.checkForUpdateAndReload$lambda$0((BundleUpdaterManager) this.f2387e);
            case 6:
                return ChatInputRootView._init_$lambda$1((ChatInputRootView) this.f2387e);
            case 7:
                return AutomodSystemMessageWrapperView.setMessage$lambda$1((ComponentProvider) this.f2387e);
            case 8:
                return EmbedView.setFields_oCLp7l4$lambda$33$lambda$30((LinearLayout) this.f2387e);
            case 9:
                return EmbedView.setMediaEmbed$lambda$35((EmbedView) this.f2387e);
            case 10:
                return FileAttachmentView.setContent$lambda$3((FileAttachmentView) this.f2387e);
            case 11:
                return MessageContentView.shadowView_delegate$lambda$0((MessageContentView) this.f2387e);
            case 12:
                return ButtonComponentView.progressDots_delegate$lambda$0((ButtonComponentView) this.f2387e);
            case 13:
                return ContentInventoryComponentView.binding_delegate$lambda$4((ContentInventoryComponentView) this.f2387e);
            case 14:
                return SelectComponentView.setSelectedOptions$lambda$5((LayoutInflater) this.f2387e);
            case 15:
                return SelectComponentView.progressDots_delegate$lambda$0((SelectComponentView) this.f2387e);
            case 16:
                return AudioPlayerView.setUploadProgress$lambda$11((AudioPlayerView) this.f2387e);
            case 17:
                return GuildEventInviteViewHolder.bind$lambda$4$lambda$3$lambda$0((GuildEventInviteViewHolder) this.f2387e);
            case 18:
                return Integer.valueOf(((ChatView) this.f2387e).getId());
            case 19:
                return SystemLogCapture.startThread$lambda$0((SystemLogCapture) this.f2387e);
            case 20:
                return EmojiPickerItemData.CoreData.categoryIndices_delegate$lambda$1((EmojiPickerItemData.CoreData) this.f2387e);
            case 21:
                return EmojiPickerScroller.scrollToItemAtIndex$lambda$8((EmojiPickerScroller) this.f2387e);
            case 22:
                return EmojiPickerView.scroller_delegate$lambda$5$lambda$3((EmojiPickerView) this.f2387e);
            case 23:
                return MobileVoiceOverlay.menuDialogProvider$lambda$14$lambda$13$lambda$12((MobileVoiceOverlay) this.f2387e);
            case 24:
                return ProgressDots._init_$lambda$0((ProgressDots) this.f2387e);
            case 25:
                return TransitionResilientGridLayoutManager.removeAndRecycleAllViews$lambda$3((TransitionResilientGridLayoutManager) this.f2387e);
            case 26:
                return TransitionResilientLinearLayoutManager.removeAndRecycleAllViews$lambda$3((TransitionResilientLinearLayoutManager) this.f2387e);
            case 27:
                d3.e eVar = (d3.e) this.f2387e;
                eVar.getLifecycle().a(new d3.b(eVar));
                return Unit.f14616a;
            case 28:
                return Boolean.valueOf(PushNotificationModule._init_$lambda$0((PushNotificationModule) this.f2387e));
            default:
                return Integer.valueOf(UIManagerHelper.getSurfaceId((ThemedReactContext) this.f2387e));
        }
    }
}
