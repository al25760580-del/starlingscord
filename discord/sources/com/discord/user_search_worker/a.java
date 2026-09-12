package com.discord.user_search_worker;

import com.discord.chat.bridge.contentnode.CommandMentionContentNode;
import com.discord.chat.bridge.contentnode.GameMentionContentNode;
import com.discord.chat.bridge.contentnode.LinkContentNode;
import com.discord.chat.presentation.message.view.botuikit.MarkdownTextRenderEventHandlers;
import com.discord.chat.presentation.message.view.botuikit.react.ComponentContextDefaults;
import com.discord.mobile_voice_overlay.utils.OverlayViewProvider;
import com.discord.mobile_voice_overlay.views.OverlayView;
import com.discord.primitives.UserId;
import com.discord.sticker_picker.StickerPickerRowView;
import com.facebook.react.ReactHost;
import com.facebook.react.common.mapbuffer.MapBuffer;
import com.facebook.react.common.mapbuffer.ReadableMapBuffer;
import com.facebook.react.defaults.DefaultReactHost;
import com.facebook.react.defaults.DefaultReactHostDelegate;
import com.facebook.react.packagerconnection.FileIoHandler;
import com.facebook.react.packagerconnection.PackagerConnectionSettings;
import com.margelo.nitro.rive.HybridRiveFile;
import com.margelo.nitro.rive.HybridRiveView;
import com.margelo.nitro.rive.RiveError;
import com.swmansion.rnscreens.Screen;
import com.swmansion.rnscreens.ScreenFragmentWrapper;
import com.swmansion.rnscreens.ScreenStack;
import com.swmansion.rnscreens.ScreenStackFragmentWrapper;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4609d;

    public /* synthetic */ a(int i7) {
        this.f4609d = i7;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f4609d) {
            case 0:
                return UserSearchWorker.searchUsers$lambda$3((UserSearchWorkerResult) obj);
            case 1:
                return UserSearchWorker.searchUsers$lambda$4((UserSearchWorkerResult) obj);
            case 2:
                return ReactHost.destroy$lambda$0(((Boolean) obj).booleanValue());
            case 3:
                return ReactHost.setBundleSource$lambda$1((Map) obj);
            case 4:
                return ReadableMapBuffer.toString$lambda$5((MapBuffer.Entry) obj);
            case 5:
                return DefaultReactHost.getDefaultReactHost$lambda$0((Exception) obj);
            case 6:
                return DefaultReactHostDelegate._init_$lambda$0((Exception) obj);
            case 7:
                return Boolean.valueOf(FileIoHandler.run$lambda$1$lambda$0((Map.Entry) obj));
            case 8:
                return PackagerConnectionSettings._packagerOptionsUpdater$lambda$1((Map) obj);
            case 9:
                return Boolean.valueOf(HybridRiveFile.refreshAfterAssetChange$lambda$1((WeakReference) obj));
            case 10:
                return HybridRiveView.onError$lambda$4((RiveError) obj);
            case 11:
                ScreenFragmentWrapper it = (ScreenFragmentWrapper) obj;
                ScreenStack.Companion companion = ScreenStack.Companion;
                Intrinsics.checkNotNullParameter(it, "it");
                return (ScreenStackFragmentWrapper) it;
            case 12:
                ScreenFragmentWrapper it2 = (ScreenFragmentWrapper) obj;
                ScreenStack.Companion companion2 = ScreenStack.Companion;
                Intrinsics.checkNotNullParameter(it2, "it");
                return Boolean.valueOf(it2.a().getActivityState() == Screen.ActivityState.f7128d);
            case 13:
                ScreenFragmentWrapper it3 = (ScreenFragmentWrapper) obj;
                ScreenStack.Companion companion3 = ScreenStack.Companion;
                Intrinsics.checkNotNullParameter(it3, "it");
                return Boolean.valueOf(it3.b());
            case 14:
                ScreenFragmentWrapper it4 = (ScreenFragmentWrapper) obj;
                ScreenStack.Companion companion4 = ScreenStack.Companion;
                Intrinsics.checkNotNullParameter(it4, "it");
                return Boolean.valueOf(!it4.g().isAdded());
            case 15:
                return MarkdownTextRenderEventHandlers._init_$lambda$0((GameMentionContentNode) obj);
            case 16:
                return OverlayViewProvider.removeViewFromOverlay$lambda$0((OverlayView) obj);
            case 17:
                return StickerPickerRowView.onPressSticker$lambda$0((String) obj);
            case 18:
                return StickerPickerRowView.onLongPressSticker$lambda$1((String) obj);
            case 19:
                return ComponentContextDefaults.MEDIA_HANDLERS$lambda$19((String) obj);
            case 20:
                return ComponentContextDefaults.MEDIA_HANDLERS$lambda$20(((Boolean) obj).booleanValue());
            case 21:
                return ComponentContextDefaults.COMPONENT_HANDLERS$lambda$21((String) obj);
            case 22:
                return ComponentContextDefaults.COMPONENT_HANDLERS$lambda$22((String) obj);
            case 23:
                return ComponentContextDefaults.COMPONENT_HANDLERS$lambda$23((String) obj);
            case 24:
                return ComponentContextDefaults.COMPONENT_HANDLERS$lambda$25((UserId) obj);
            case 25:
                return ComponentContextDefaults.MARKDOWN_HANDLERS$lambda$2((LinkContentNode) obj);
            case 26:
                return ComponentContextDefaults.MARKDOWN_HANDLERS$lambda$3((LinkContentNode) obj);
            case 27:
                return ComponentContextDefaults.MARKDOWN_HANDLERS$lambda$10((CommandMentionContentNode) obj);
            case 28:
                return ComponentContextDefaults.MARKDOWN_HANDLERS$lambda$6((String) obj);
            default:
                return ComponentContextDefaults.MARKDOWN_HANDLERS$lambda$9((CommandMentionContentNode) obj);
        }
    }
}
