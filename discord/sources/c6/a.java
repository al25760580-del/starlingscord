package c6;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ComponentDialog;
import com.discord.MainApplication;
import com.discord.chat.databinding.AudioPlayerViewBinding;
import com.discord.chat.presentation.list.ChatListView;
import com.discord.chat.presentation.list.ChatListViewManager;
import com.discord.chat.presentation.message.MessageAccessoriesAdapter;
import com.discord.chat.presentation.message.messagepart.ImageAttachmentMessageAccessory;
import com.discord.chat.presentation.message.messagepart.InfoLinkMessageAccessory;
import com.discord.chat.presentation.message.messagepart.MessageAttachmentAccessory;
import com.discord.chat.presentation.message.messagepart.VideoAttachmentMessageAccessory;
import com.discord.chat.presentation.message.messagepart.polls.PollAnswerAccessory;
import com.discord.chat.presentation.message.view.ObscureOverlayView;
import com.discord.chat.presentation.message.view.SpoilerView;
import com.discord.chat.presentation.message.view.UploadContext;
import com.discord.chat.presentation.message.view.botuikit.ComponentContext;
import com.discord.chat.presentation.message.view.botuikit.components.CheckpointCardV2025ComponentView;
import com.discord.chat.presentation.message.view.botuikit.components.ContainerComponentView;
import com.discord.chat.presentation.message.view.botuikit.components.SelectComponentView;
import com.discord.chat.presentation.message.view.botuikit.components.TextDisplayComponentView;
import com.discord.chat.presentation.message.view.botuikit.react.SelectActionComponentViewManager;
import com.discord.chat.presentation.message.view.botuikit.react.TextDisplayComponentViewManager;
import com.discord.chat.presentation.message.view.mosaic_recycler.AttachmentMediaMosaicAdapter;
import com.discord.chat.presentation.message.view.polls.PollAnswerAdapter;
import com.discord.chat.presentation.message.view.voicemessages.AudioPlayerView;
import com.discord.chat.presentation.message.view.voicemessages.AudioPlayerWipeAnimatorManager;
import com.discord.chat.presentation.message.viewholder.MessageContentViewHolder;
import com.discord.emoji_picker.EmojiPickerView;
import com.discord.external_pip.ExternalPipTransitionView;
import com.discord.foreground_service.ForegroundServiceManager;
import com.discord.foreground_service.service.ServiceNotificationConfiguration;
import com.discord.lifecycle.ForegroundServiceStartGuard;
import com.discord.permissions.NativePermissionManagerModule;
import com.discord.recycler_view.scroller.Scroller;
import com.discord.tti_measurement_view.TTIMeasurementView;
import com.discord.view.ScreenOverride;
import com.facebook.react.bridge.Promise;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.views.image.ReactImageView;
import com.facebook.react.views.modal.ReactModalHostView;
import com.margelo.nitro.rive.BaseHybridViewModelPropertyImpl;
import com.margelo.nitro.rive.HybridRiveView;
import com.margelo.nitro.rive.HybridViewModelInstanceSpec;
import im.f;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jm.k;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.Regex;
import kotlin.text.n;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kr.e;
import m3.m;
import mr.c;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3526d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3527e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f3528i;

    public /* synthetic */ a(int i7, Object obj, Object obj2) {
        this.f3526d = i7;
        this.f3527e = obj;
        this.f3528i = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        List listI0;
        Collection collectionValues;
        switch (this.f3526d) {
            case 0:
                return MessageAttachmentAccessory.getUploadItemProps$lambda$0((Function2) this.f3527e, (UploadContext) this.f3528i);
            case 1:
                return MainApplication.attachBaseContext$lambda$0((Context) this.f3527e, (MainApplication) this.f3528i);
            case 2:
                return ChatListViewManager.addView$lambda$3((TTIMeasurementView) this.f3527e, (ChatListView) this.f3528i);
            case 3:
                return MessageAccessoriesAdapter.onBindViewHolder$lambda$9((MessageAccessoriesAdapter) this.f3527e, (InfoLinkMessageAccessory) this.f3528i);
            case 4:
                return ObscureOverlayView.configure$lambda$2((Function0) this.f3527e, (ObscureOverlayView) this.f3528i);
            case 5:
                return SpoilerView.configureSpoilerOverlay$lambda$5((SpoilerView) this.f3527e, (View) this.f3528i);
            case 6:
                return CheckpointCardV2025ComponentView.binding_delegate$lambda$6((CheckpointCardV2025ComponentView) this.f3527e, (Context) this.f3528i);
            case 7:
                return ContainerComponentView.configureSpoiler$lambda$2((ComponentContext) this.f3527e, (ContainerComponentView) this.f3528i);
            case 8:
                return PollAnswerAdapter.onBindViewHolder$lambda$4((PollAnswerAdapter) this.f3527e, (PollAnswerAccessory) this.f3528i);
            case 9:
                return AudioPlayerView.animatorManager_delegate$lambda$3((Context) this.f3527e, (AudioPlayerView) this.f3528i);
            case 10:
                return AudioPlayerWipeAnimatorManager.scaleAnimator_delegate$lambda$5((AudioPlayerViewBinding) this.f3527e, (AudioPlayerWipeAnimatorManager) this.f3528i);
            case 11:
                return MessageContentViewHolder.bind$lambda$1((MessageContentViewHolder) this.f3527e, (Function1) this.f3528i);
            case 12:
                return EmojiPickerView.visibilityTracker_delegate$lambda$1((Function2) this.f3527e, (EmojiPickerView) this.f3528i);
            case 13:
                return ExternalPipTransitionView.Companion.tryHide$lambda$0((ViewGroup) this.f3527e, (ExternalPipTransitionView) this.f3528i);
            case 14:
                return ForegroundServiceManager.handleCreateOrUpdateService$lambda$7((ServiceNotificationConfiguration.Type) this.f3527e, (ForegroundServiceStartGuard.Result) this.f3528i);
            case 15:
                return NativePermissionManagerModule.requestForegroundServicePermissionVoiceCall$lambda$3$lambda$1((NativePermissionManagerModule) this.f3527e, (Promise) this.f3528i);
            case 16:
                return Scroller.scrollToPosition$lambda$3((Function0) this.f3527e, (Function0) this.f3528i);
            case 17:
                return ReactImageView.onDraw$lambda$1((ReactImageView) this.f3527e, (Canvas) this.f3528i);
            case 18:
                return ReactModalHostView.showOrUpdate$lambda$5((ReactModalHostView) this.f3527e, (ComponentDialog) this.f3528i);
            case 19:
                return BaseHybridViewModelPropertyImpl.addListenerInternal$lambda$1((WeakReference) this.f3527e, (String) this.f3528i);
            case 20:
                return HybridRiveView.onEventListener$lambda$9((HybridRiveView) this.f3527e, (Function1) this.f3528i);
            case 21:
                return HybridRiveView.bindViewModelInstance$lambda$5((HybridViewModelInstanceSpec) this.f3527e, (HybridRiveView) this.f3528i);
            case 22:
                return SelectActionComponentViewManager.setModel$lambda$0((SelectActionComponentViewManager) this.f3527e, (SelectComponentView) this.f3528i);
            case 23:
                return TextDisplayComponentViewManager.createTextDisplayComponentContext$lambda$11((TextDisplayComponentViewManager) this.f3527e, (TextDisplayComponentView) this.f3528i);
            case 24:
                return ScreenOverride.uiManager_delegate$lambda$1((ThemedReactContext) this.f3527e, (ScreenOverride) this.f3528i);
            case 25:
                k kVar = (k) this.f3527e;
                f fVar = (f) this.f3528i;
                synchronized (kVar) {
                    try {
                        Map map = (Map) kVar.f13959d.get(Integer.valueOf(fVar.f11892d));
                        listI0 = (map == null || (collectionValues = map.values()) == null) ? null : CollectionsKt.i0(collectionValues);
                        if (listI0 == null) {
                            listI0 = n0.f14659d;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                Iterator it = listI0.iterator();
                while (it.hasNext()) {
                    ((Function1) it.next()).invoke(fVar);
                }
                return Unit.f14616a;
            case 26:
                return AttachmentMediaMosaicAdapter.onBindViewHolder$lambda$2((AttachmentMediaMosaicAdapter) this.f3527e, (ImageAttachmentMessageAccessory) this.f3528i);
            case 27:
                return AttachmentMediaMosaicAdapter.onBindViewHolder$lambda$6((AttachmentMediaMosaicAdapter) this.f3527e, (VideoAttachmentMessageAccessory) this.f3528i);
            case 28:
                Regex regex = (Regex) this.f3527e;
                String str = (String) this.f3528i;
                n nVar = Regex.f14705e;
                return regex.b(str);
            default:
                return m.g((String) this.f3527e, c.f16056c, new SerialDescriptor[0], new e((SealedClassSerializer) this.f3528i, 0));
        }
    }
}
