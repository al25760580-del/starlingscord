package com.discord.emoji_picker.react;

import com.discord.emoji_picker.EmojiPickerRowView;
import com.discord.emoji_picker.react.EmojiPickerRowViewManager;
import com.discord.emoji_picker.react_events.OnLongPressEmojiEvent;
import com.discord.emoji_picker.react_events.OnPressEmojiEvent;
import com.discord.reactevents.ReactEvents;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.viewmanagers.EmojiPickerRowViewManagerDelegate;
import com.facebook.react.viewmanagers.EmojiPickerRowViewManagerInterface;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@ReactModule(name = EmojiPickerRowViewManager.NAME)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u0019B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\t\u001a\u001e\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00000\u00000\u0007H\u0014J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0014J\u0014\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00130\u0012H\u0016J\u001a\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016R*\u0010\u0006\u001a\u001e\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00000\u00000\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/discord/emoji_picker/react/EmojiPickerRowViewManager;", "Lcom/facebook/react/uimanager/SimpleViewManager;", "Lcom/discord/emoji_picker/EmojiPickerRowView;", "Lcom/facebook/react/viewmanagers/EmojiPickerRowViewManagerInterface;", "<init>", "()V", "delegate", "Lcom/facebook/react/viewmanagers/EmojiPickerRowViewManagerDelegate;", "kotlin.jvm.PlatformType", "getDelegate", "getName", "", "reactEvents", "Lcom/discord/reactevents/ReactEvents;", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getExportedCustomDirectEventTypeConstants", "", "", "setRowData", "", "view", "data", "Lcom/facebook/react/bridge/ReadableMap;", "Companion", "emoji_picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class EmojiPickerRowViewManager extends SimpleViewManager<EmojiPickerRowView> implements EmojiPickerRowViewManagerInterface<EmojiPickerRowView> {

    @NotNull
    public static final String NAME = "EmojiPickerRowView";

    @NotNull
    private final EmojiPickerRowViewManagerDelegate<EmojiPickerRowView, EmojiPickerRowViewManager> delegate = new EmojiPickerRowViewManagerDelegate<>(this);

    @NotNull
    private final ReactEvents reactEvents = new ReactEvents(new Pair("onPressEmoji", Reflection.getOrCreateKotlinClass(OnPressEmojiEvent.class)), new Pair("onLongPressEmoji", Reflection.getOrCreateKotlinClass(OnLongPressEmojiEvent.class)));

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createViewInstance$lambda$2$lambda$0(EmojiPickerRowViewManager emojiPickerRowViewManager, ThemedReactContext themedReactContext, EmojiPickerRowView emojiPickerRowView, String emojiName) {
        Intrinsics.checkNotNullParameter(emojiName, "emojiName");
        emojiPickerRowViewManager.reactEvents.emitEvent(themedReactContext, emojiPickerRowView, new OnPressEmojiEvent(emojiName, (String) null, 2, (DefaultConstructorMarker) null));
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createViewInstance$lambda$2$lambda$1(EmojiPickerRowViewManager emojiPickerRowViewManager, ThemedReactContext themedReactContext, EmojiPickerRowView emojiPickerRowView, String emojiName) {
        Intrinsics.checkNotNullParameter(emojiName, "emojiName");
        emojiPickerRowViewManager.reactEvents.emitEvent(themedReactContext, emojiPickerRowView, new OnLongPressEmojiEvent(emojiName, (String) null, 2, (DefaultConstructorMarker) null));
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
    public EmojiPickerRowView createViewInstance(@NotNull final ThemedReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        final EmojiPickerRowView emojiPickerRowView = new EmojiPickerRowView(reactContext);
        final int i7 = 0;
        emojiPickerRowView.setOnPressEmoji(new Function1(this) { // from class: t6.a

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ EmojiPickerRowViewManager f20645e;

            {
                this.f20645e = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i7) {
                    case 0:
                        return EmojiPickerRowViewManager.createViewInstance$lambda$2$lambda$0(this.f20645e, reactContext, emojiPickerRowView, (String) obj);
                    default:
                        return EmojiPickerRowViewManager.createViewInstance$lambda$2$lambda$1(this.f20645e, reactContext, emojiPickerRowView, (String) obj);
                }
            }
        });
        final int i10 = 1;
        emojiPickerRowView.setOnLongPressEmoji(new Function1(this) { // from class: t6.a

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ EmojiPickerRowViewManager f20645e;

            {
                this.f20645e = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i10) {
                    case 0:
                        return EmojiPickerRowViewManager.createViewInstance$lambda$2$lambda$0(this.f20645e, reactContext, emojiPickerRowView, (String) obj);
                    default:
                        return EmojiPickerRowViewManager.createViewInstance$lambda$2$lambda$1(this.f20645e, reactContext, emojiPickerRowView, (String) obj);
                }
            }
        });
        return emojiPickerRowView;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public EmojiPickerRowViewManagerDelegate<EmojiPickerRowView, EmojiPickerRowViewManager> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.viewmanagers.EmojiPickerRowViewManagerInterface
    public void setRowData(@NotNull EmojiPickerRowView view, ReadableMap data) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (data != null) {
            view.setRowData(EmojiPickerRowDataSerializationUtilsKt.deserializeEmojiPickerRowData(data));
        }
    }
}
