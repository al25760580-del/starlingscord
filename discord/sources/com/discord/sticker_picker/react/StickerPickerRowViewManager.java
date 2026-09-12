package com.discord.sticker_picker.react;

import com.discord.reactevents.ReactEvents;
import com.discord.sticker_picker.StickerPickerRowView;
import com.discord.sticker_picker.react.StickerPickerRowViewManager;
import com.discord.sticker_picker.react_events.OnLongPressStickerEvent;
import com.discord.sticker_picker.react_events.OnPressStickerEvent;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.viewmanagers.StickerPickerRowViewManagerDelegate;
import com.facebook.react.viewmanagers.StickerPickerRowViewManagerInterface;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@ReactModule(name = StickerPickerRowViewManager.NAME)
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u001aB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\t\u001a\u001e\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00000\u00000\u0007H\u0014J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0014J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u0016J\u0014\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00160\u0015H\u0016J\u001a\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016R*\u0010\u0006\u001a\u001e\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00000\u00000\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/discord/sticker_picker/react/StickerPickerRowViewManager;", "Lcom/facebook/react/uimanager/SimpleViewManager;", "Lcom/discord/sticker_picker/StickerPickerRowView;", "Lcom/facebook/react/viewmanagers/StickerPickerRowViewManagerInterface;", "<init>", "()V", "delegate", "Lcom/facebook/react/viewmanagers/StickerPickerRowViewManagerDelegate;", "kotlin.jvm.PlatformType", "getDelegate", "getName", "", "reactEvents", "Lcom/discord/reactevents/ReactEvents;", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "onDropViewInstance", "", "view", "getExportedCustomDirectEventTypeConstants", "", "", "setRowData", "value", "Lcom/facebook/react/bridge/ReadableMap;", "Companion", "sticker_picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class StickerPickerRowViewManager extends SimpleViewManager<StickerPickerRowView> implements StickerPickerRowViewManagerInterface<StickerPickerRowView> {

    @NotNull
    public static final String NAME = "StickerPickerRowView";

    @NotNull
    private final StickerPickerRowViewManagerDelegate<StickerPickerRowView, StickerPickerRowViewManager> delegate = new StickerPickerRowViewManagerDelegate<>(this);

    @NotNull
    private final ReactEvents reactEvents = new ReactEvents(new Pair("onPressSticker", Reflection.getOrCreateKotlinClass(OnPressStickerEvent.class)), new Pair("onLongPressSticker", Reflection.getOrCreateKotlinClass(OnLongPressStickerEvent.class)));

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createViewInstance$lambda$2$lambda$0(StickerPickerRowViewManager stickerPickerRowViewManager, ThemedReactContext themedReactContext, StickerPickerRowView stickerPickerRowView, String stickerId) {
        Intrinsics.checkNotNullParameter(stickerId, "stickerId");
        stickerPickerRowViewManager.reactEvents.emitEvent(themedReactContext, stickerPickerRowView, new OnPressStickerEvent(stickerId));
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createViewInstance$lambda$2$lambda$1(StickerPickerRowViewManager stickerPickerRowViewManager, ThemedReactContext themedReactContext, StickerPickerRowView stickerPickerRowView, String stickerId) {
        Intrinsics.checkNotNullParameter(stickerId, "stickerId");
        stickerPickerRowViewManager.reactEvents.emitEvent(themedReactContext, stickerPickerRowView, new OnLongPressStickerEvent(stickerId));
        return Unit.f14616a;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @NotNull
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return this.reactEvents.exportEventConstants();
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public StickerPickerRowView createViewInstance(@NotNull final ThemedReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        final StickerPickerRowView stickerPickerRowView = new StickerPickerRowView(reactContext);
        final int i7 = 0;
        stickerPickerRowView.setOnPressSticker(new Function1(this) { // from class: e8.a

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ StickerPickerRowViewManager f8105e;

            {
                this.f8105e = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i7) {
                    case 0:
                        return StickerPickerRowViewManager.createViewInstance$lambda$2$lambda$0(this.f8105e, reactContext, stickerPickerRowView, (String) obj);
                    default:
                        return StickerPickerRowViewManager.createViewInstance$lambda$2$lambda$1(this.f8105e, reactContext, stickerPickerRowView, (String) obj);
                }
            }
        });
        final int i10 = 1;
        stickerPickerRowView.setOnLongPressSticker(new Function1(this) { // from class: e8.a

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ StickerPickerRowViewManager f8105e;

            {
                this.f8105e = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i10) {
                    case 0:
                        return StickerPickerRowViewManager.createViewInstance$lambda$2$lambda$0(this.f8105e, reactContext, stickerPickerRowView, (String) obj);
                    default:
                        return StickerPickerRowViewManager.createViewInstance$lambda$2$lambda$1(this.f8105e, reactContext, stickerPickerRowView, (String) obj);
                }
            }
        });
        return stickerPickerRowView;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public StickerPickerRowViewManagerDelegate<StickerPickerRowView, StickerPickerRowViewManager> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(@NotNull StickerPickerRowView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onDropViewInstance(view);
        view.clean();
    }

    @Override // com.facebook.react.viewmanagers.StickerPickerRowViewManagerInterface
    public void setRowData(@NotNull StickerPickerRowView view, ReadableMap value) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (value != null) {
            view.setRowData(StickerPickerRowDataSerializationUtilsKt.deserializeStickerPickerRowData(value));
        }
    }
}
