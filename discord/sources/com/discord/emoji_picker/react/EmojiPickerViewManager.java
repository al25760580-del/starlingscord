package com.discord.emoji_picker.react;

import android.view.View;
import com.discord.emoji_picker.EmojiPickerCache;
import com.discord.emoji_picker.EmojiPickerItem;
import com.discord.emoji_picker.EmojiPickerItemData;
import com.discord.emoji_picker.EmojiPickerScroller;
import com.discord.emoji_picker.EmojiPickerView;
import com.discord.emoji_picker.react.EmojiPickerViewManager;
import com.discord.emoji_picker.react.deserialization.EmojiPickerItemDataCoreDataDeserializer;
import com.discord.emoji_picker.react.deserialization.EmojiPickerViewConfigDeserializer;
import com.discord.emoji_picker.react_events.OnLongPressEmojiEvent;
import com.discord.emoji_picker.react_events.OnPressEmojiEvent;
import com.discord.emoji_picker.react_events.OnScrollBeginDragEvent;
import com.discord.emoji_picker.react_events.OnScrollEndDragEvent;
import com.discord.emoji_picker.react_events.OnScrollEvent;
import com.discord.emoji_picker.react_events.OnShowNitroUpsell;
import com.discord.emoji_picker.react_events.OnStickyHeaderRenderEvent;
import com.discord.react.utilities.InitialPropsViewGroupManager;
import com.discord.reactevents.ReactEvents;
import com.facebook.react.bridge.NoSuchKeyException;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.viewmanagers.EmojiPickerViewManagerDelegate;
import com.facebook.react.viewmanagers.EmojiPickerViewManagerInterface;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 /2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001/B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\nH\u0016J\b\u0010\u0011\u001a\u00020\u000fH\u0016J$\u0010\u0012\u001a\u001e\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00000\u00000\u0007H\u0014J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0014H\u0014J\u0010\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u0002H\u0016J\u0018\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0018\u0010 \u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0018\u0010!\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\"H\u0016J\u0018\u0010#\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\"H\u0016J\u0018\u0010$\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020%H\u0016J\u001a\u0010&\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010'H\u0016J\u001a\u0010(\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010'H\u0016J\u0010\u0010)\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u0002H\u0016J\u0018\u0010*\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010+\u001a\u00020%H\u0016J \u0010,\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010-\u001a\u00020\"2\u0006\u0010.\u001a\u00020%H\u0016R*\u0010\u0006\u001a\u001e\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00000\u00000\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lcom/discord/emoji_picker/react/EmojiPickerViewManager;", "Lcom/discord/react/utilities/InitialPropsViewGroupManager;", "Lcom/discord/emoji_picker/EmojiPickerView;", "Lcom/facebook/react/viewmanagers/EmojiPickerViewManagerInterface;", "<init>", "()V", "delegate", "Lcom/facebook/react/viewmanagers/EmojiPickerViewManagerDelegate;", "kotlin.jvm.PlatformType", "emojiPickerCaches", "", "Lcom/discord/emoji_picker/EmojiPickerCache;", "reactEvents", "Lcom/discord/reactevents/ReactEvents;", "getExportedCustomDirectEventTypeConstants", "", "", "getName", "getDelegate", "invalidate", "", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "initialProps", "Lcom/facebook/react/uimanager/ReactStylesDiffMap;", "setupViewRecycling", "onDropViewInstance", "view", "setPaddingTop", "value", "", "setPaddingBottom", "setEmojiSize", "", "setEmojiMargin", "setUseTier0UpsellContent", "", "setEmojiData", "Lcom/facebook/react/bridge/ReadableMap;", "setConfig", "refreshEmojis", "scrollingEnabled", ViewProps.ENABLED, "scrollToHeaderIndex", "index", "animated", "Companion", "emoji_picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@ReactModule(name = EmojiPickerViewManager.NAME)
@SourceDebugExtension({"SMAP\nEmojiPickerViewManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmojiPickerViewManager.kt\ncom/discord/emoji_picker/react/EmojiPickerViewManager\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 ReactStylesDiffMapExtensions.kt\ncom/discord/react/utilities/ReactStylesDiffMapExtensionsKt\n*L\n1#1,211:1\n216#2,2:212\n8#3,12:214\n8#3,12:226\n8#3,12:238\n8#3,12:250\n8#3,12:262\n*S KotlinDebug\n*F\n+ 1 EmojiPickerViewManager.kt\ncom/discord/emoji_picker/react/EmojiPickerViewManager\n*L\n54#1:212,2\n65#1:214,12\n66#1:226,12\n67#1:238,12\n68#1:250,12\n133#1:262,12\n*E\n"})
public final class EmojiPickerViewManager extends InitialPropsViewGroupManager<EmojiPickerView> implements EmojiPickerViewManagerInterface<EmojiPickerView> {

    @NotNull
    public static final String NAME = "EmojiPickerView";

    @NotNull
    private static final String PROP_CONFIG = "config";

    @NotNull
    private static final String PROP_EMOJI_DATA = "emojiData";

    @NotNull
    private static final String PROP_EMOJI_MARGIN = "emojiMargin";

    @NotNull
    private static final String PROP_EMOJI_SIZE = "emojiSize";

    @NotNull
    private static final String PROP_PADDING_BOTTOM = "paddingBottom";

    @NotNull
    private static final String PROP_PADDING_TOP = "paddingTop";

    @NotNull
    private static final String PROP_USE_TIER_0_UPSELL_CONTENT = "useTier0UpsellContent";

    @NotNull
    private final EmojiPickerViewManagerDelegate<EmojiPickerView, EmojiPickerViewManager> delegate = new EmojiPickerViewManagerDelegate<>(this);

    @NotNull
    private final Map<EmojiPickerView, EmojiPickerCache> emojiPickerCaches = new LinkedHashMap();

    @NotNull
    private final ReactEvents reactEvents = new ReactEvents(new Pair("onPressEmoji", Reflection.getOrCreateKotlinClass(OnPressEmojiEvent.class)), new Pair("onLongPressEmoji", Reflection.getOrCreateKotlinClass(OnLongPressEmojiEvent.class)), new Pair("onScroll", Reflection.getOrCreateKotlinClass(OnScrollEvent.class)), new Pair("onScrollBeginDrag", Reflection.getOrCreateKotlinClass(OnScrollBeginDragEvent.class)), new Pair("onScrollEndDrag", Reflection.getOrCreateKotlinClass(OnScrollEndDragEvent.class)), new Pair("onStickyHeaderRender", Reflection.getOrCreateKotlinClass(OnStickyHeaderRenderEvent.class)), new Pair("onShowNitroUpsell", Reflection.getOrCreateKotlinClass(OnShowNitroUpsell.class)));

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createViewInstance$lambda$1(EmojiPickerViewManager emojiPickerViewManager, ThemedReactContext themedReactContext, View view, Long l6, String emojiName) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(emojiName, "emojiName");
        emojiPickerViewManager.reactEvents.emitEvent(themedReactContext, view, new OnPressEmojiEvent(emojiName, l6 != null ? l6.toString() : null));
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createViewInstance$lambda$2(EmojiPickerViewManager emojiPickerViewManager, EmojiPickerView view, EmojiPickerScroller.ScrollEvent data) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(data, "data");
        emojiPickerViewManager.reactEvents.emitEvent(view, new OnScrollEvent(data));
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createViewInstance$lambda$3(EmojiPickerViewManager emojiPickerViewManager, EmojiPickerView view, EmojiPickerScroller.ScrollEvent data) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(data, "data");
        emojiPickerViewManager.reactEvents.emitEvent(view, new OnScrollBeginDragEvent(data));
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createViewInstance$lambda$4(EmojiPickerViewManager emojiPickerViewManager, EmojiPickerView view, EmojiPickerScroller.ScrollEvent data) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(data, "data");
        emojiPickerViewManager.reactEvents.emitEvent(view, new OnScrollEndDragEvent(data));
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createViewInstance$lambda$5(EmojiPickerViewManager emojiPickerViewManager, ThemedReactContext themedReactContext, View view, Long l6, String emojiName) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(emojiName, "emojiName");
        emojiPickerViewManager.reactEvents.emitEvent(themedReactContext, view, new OnLongPressEmojiEvent(emojiName, l6 != null ? l6.toString() : null));
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createViewInstance$lambda$6(EmojiPickerViewManager emojiPickerViewManager, ThemedReactContext themedReactContext, View view, int i7) {
        Intrinsics.checkNotNullParameter(view, "view");
        emojiPickerViewManager.reactEvents.emitEvent(themedReactContext, view, new OnStickyHeaderRenderEvent(i7));
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createViewInstance$lambda$7(EmojiPickerViewManager emojiPickerViewManager, ThemedReactContext themedReactContext, View view, boolean z5) {
        Intrinsics.checkNotNullParameter(view, "view");
        emojiPickerViewManager.reactEvents.emitEvent(themedReactContext, view, new OnShowNitroUpsell(z5));
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

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        super.invalidate();
        Iterator<Map.Entry<EmojiPickerView, EmojiPickerCache>> it = this.emojiPickerCaches.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().invalidate();
        }
        this.emojiPickerCaches.clear();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void setupViewRecycling() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Number] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Number] */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Number] */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Number] */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v32 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r9v8 */
    @Override // com.discord.react.utilities.InitialPropsViewGroupManager
    @NotNull
    public EmojiPickerView createViewInstance(@NotNull final ThemedReactContext reactContext, @NotNull ReactStylesDiffMap initialProps) {
        ?? ValueOf;
        Class cls;
        ?? ValueOf2;
        Boolean boolValueOf;
        Integer numValueOf;
        Float fValueOf;
        Class cls2 = Float.TYPE;
        Class cls3 = Integer.TYPE;
        Class cls4 = Boolean.TYPE;
        ?? r10 = -1;
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(initialProps, "initialProps");
        ReadableMap map = initialProps.getMap(PROP_CONFIG);
        ?? ValueOf3 = Float.valueOf(0.0f);
        try {
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Float.class);
            if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(cls4))) {
                ValueOf = (Float) Boolean.valueOf(initialProps.getBoolean("paddingTop", ((Boolean) ValueOf3).booleanValue()));
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(cls3))) {
                ValueOf = (Float) Integer.valueOf(initialProps.getInt("paddingTop", ((Integer) ValueOf3).intValue()));
            } else {
                if (!Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(cls2))) {
                    throw new IllegalStateException(("Unsupported type " + Reflection.getOrCreateKotlinClass(Float.class)).toString());
                }
                ValueOf = Float.valueOf(initialProps.getFloat("paddingTop", 0.0f));
            }
        } catch (NoSuchKeyException | IllegalArgumentException unused) {
            ValueOf = ValueOf3;
        }
        float fFloatValue = ValueOf.floatValue();
        try {
            KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(Float.class);
            cls = Boolean.class;
            try {
                if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(cls4))) {
                    fValueOf = (Float) Boolean.valueOf(initialProps.getBoolean("paddingBottom", ((Boolean) ValueOf3).booleanValue()));
                } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(cls3))) {
                    fValueOf = (Float) Integer.valueOf(initialProps.getInt("paddingBottom", ((Integer) ValueOf3).intValue()));
                } else {
                    if (!Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(cls2))) {
                        throw new IllegalStateException(("Unsupported type " + Reflection.getOrCreateKotlinClass(Float.class)).toString());
                    }
                    fValueOf = Float.valueOf(initialProps.getFloat("paddingBottom", 0.0f));
                }
                ValueOf3 = fValueOf;
            } catch (NoSuchKeyException | IllegalArgumentException unused2) {
            }
        } catch (NoSuchKeyException | IllegalArgumentException unused3) {
            cls = Boolean.class;
        }
        float fFloatValue2 = ValueOf3.floatValue();
        try {
            KClass orCreateKotlinClass3 = Reflection.getOrCreateKotlinClass(Integer.class);
            if (Intrinsics.areEqual(orCreateKotlinClass3, Reflection.getOrCreateKotlinClass(cls4))) {
                ValueOf2 = (Integer) Boolean.valueOf(initialProps.getBoolean(PROP_EMOJI_SIZE, ((Boolean) r10).booleanValue()));
            } else if (Intrinsics.areEqual(orCreateKotlinClass3, Reflection.getOrCreateKotlinClass(cls3))) {
                ValueOf2 = Integer.valueOf(initialProps.getInt(PROP_EMOJI_SIZE, -1));
            } else {
                if (!Intrinsics.areEqual(orCreateKotlinClass3, Reflection.getOrCreateKotlinClass(cls2))) {
                    throw new IllegalStateException(("Unsupported type " + Reflection.getOrCreateKotlinClass(Integer.class)).toString());
                }
                ValueOf2 = (Integer) Float.valueOf(initialProps.getFloat(PROP_EMOJI_SIZE, ((Float) r10).floatValue()));
            }
        } catch (NoSuchKeyException | IllegalArgumentException unused4) {
            ValueOf2 = r10;
        }
        int iIntValue = ValueOf2.intValue();
        try {
            KClass orCreateKotlinClass4 = Reflection.getOrCreateKotlinClass(Integer.class);
            if (Intrinsics.areEqual(orCreateKotlinClass4, Reflection.getOrCreateKotlinClass(cls4))) {
                numValueOf = (Integer) Boolean.valueOf(initialProps.getBoolean(PROP_EMOJI_MARGIN, ((Boolean) r10).booleanValue()));
            } else if (Intrinsics.areEqual(orCreateKotlinClass4, Reflection.getOrCreateKotlinClass(cls3))) {
                numValueOf = Integer.valueOf(initialProps.getInt(PROP_EMOJI_MARGIN, -1));
            } else {
                if (!Intrinsics.areEqual(orCreateKotlinClass4, Reflection.getOrCreateKotlinClass(cls2))) {
                    throw new IllegalStateException(("Unsupported type " + Reflection.getOrCreateKotlinClass(Integer.class)).toString());
                }
                numValueOf = (Integer) Float.valueOf(initialProps.getFloat(PROP_EMOJI_MARGIN, ((Float) r10).floatValue()));
            }
            r10 = numValueOf;
        } catch (NoSuchKeyException | IllegalArgumentException unused5) {
        }
        int iIntValue2 = r10.intValue();
        ReadableMap map2 = initialProps.getMap(PROP_EMOJI_DATA);
        if (map == null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (iIntValue == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (iIntValue2 == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (map2 == null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        EmojiPickerItemData.CoreData coreDataDeserialize = EmojiPickerItemDataCoreDataDeserializer.INSTANCE.deserialize(EmojiPickerItemData.CoreData.INSTANCE, map2, fFloatValue2, fFloatValue);
        ?? r11 = Boolean.FALSE;
        try {
            KClass orCreateKotlinClass5 = Reflection.getOrCreateKotlinClass(cls);
            if (Intrinsics.areEqual(orCreateKotlinClass5, Reflection.getOrCreateKotlinClass(cls4))) {
                boolValueOf = Boolean.valueOf(initialProps.getBoolean(PROP_USE_TIER_0_UPSELL_CONTENT, false));
            } else if (Intrinsics.areEqual(orCreateKotlinClass5, Reflection.getOrCreateKotlinClass(cls3))) {
                boolValueOf = (Boolean) Integer.valueOf(initialProps.getInt(PROP_USE_TIER_0_UPSELL_CONTENT, ((Integer) r11).intValue()));
            } else {
                if (!Intrinsics.areEqual(orCreateKotlinClass5, Reflection.getOrCreateKotlinClass(cls2))) {
                    throw new IllegalStateException(("Unsupported type " + Reflection.getOrCreateKotlinClass(cls)).toString());
                }
                boolValueOf = (Boolean) Float.valueOf(initialProps.getFloat(PROP_USE_TIER_0_UPSELL_CONTENT, ((Float) r11).floatValue()));
            }
            r11 = boolValueOf;
        } catch (NoSuchKeyException | IllegalArgumentException unused6) {
        }
        boolean zBooleanValue = r11.booleanValue();
        EmojiPickerView.Config configDeserialize = EmojiPickerViewConfigDeserializer.INSTANCE.deserialize(EmojiPickerView.Config.INSTANCE, map);
        final int i7 = 0;
        final int i10 = 0;
        final int i11 = 1;
        final int i12 = 2;
        final int i13 = 1;
        final int i14 = 0;
        final int i15 = 1;
        EmojiPickerView emojiPickerView = new EmojiPickerView(reactContext, iIntValue, iIntValue2, coreDataDeserialize, new Function3(this) { // from class: t6.b

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ EmojiPickerViewManager f20649e;

            {
                this.f20649e = this;
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                View view = (View) obj;
                Long l6 = (Long) obj2;
                String str = (String) obj3;
                switch (i7) {
                    case 0:
                        return EmojiPickerViewManager.createViewInstance$lambda$1(this.f20649e, reactContext, view, l6, str);
                    default:
                        return EmojiPickerViewManager.createViewInstance$lambda$5(this.f20649e, reactContext, view, l6, str);
                }
            }
        }, new Function2(this) { // from class: t6.c

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ EmojiPickerViewManager f20652e;

            {
                this.f20652e = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                EmojiPickerView emojiPickerView2 = (EmojiPickerView) obj;
                EmojiPickerScroller.ScrollEvent scrollEvent = (EmojiPickerScroller.ScrollEvent) obj2;
                switch (i10) {
                    case 0:
                        return EmojiPickerViewManager.createViewInstance$lambda$2(this.f20652e, emojiPickerView2, scrollEvent);
                    case 1:
                        return EmojiPickerViewManager.createViewInstance$lambda$3(this.f20652e, emojiPickerView2, scrollEvent);
                    default:
                        return EmojiPickerViewManager.createViewInstance$lambda$4(this.f20652e, emojiPickerView2, scrollEvent);
                }
            }
        }, new Function2(this) { // from class: t6.c

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ EmojiPickerViewManager f20652e;

            {
                this.f20652e = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                EmojiPickerView emojiPickerView2 = (EmojiPickerView) obj;
                EmojiPickerScroller.ScrollEvent scrollEvent = (EmojiPickerScroller.ScrollEvent) obj2;
                switch (i11) {
                    case 0:
                        return EmojiPickerViewManager.createViewInstance$lambda$2(this.f20652e, emojiPickerView2, scrollEvent);
                    case 1:
                        return EmojiPickerViewManager.createViewInstance$lambda$3(this.f20652e, emojiPickerView2, scrollEvent);
                    default:
                        return EmojiPickerViewManager.createViewInstance$lambda$4(this.f20652e, emojiPickerView2, scrollEvent);
                }
            }
        }, new Function2(this) { // from class: t6.c

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ EmojiPickerViewManager f20652e;

            {
                this.f20652e = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                EmojiPickerView emojiPickerView2 = (EmojiPickerView) obj;
                EmojiPickerScroller.ScrollEvent scrollEvent = (EmojiPickerScroller.ScrollEvent) obj2;
                switch (i12) {
                    case 0:
                        return EmojiPickerViewManager.createViewInstance$lambda$2(this.f20652e, emojiPickerView2, scrollEvent);
                    case 1:
                        return EmojiPickerViewManager.createViewInstance$lambda$3(this.f20652e, emojiPickerView2, scrollEvent);
                    default:
                        return EmojiPickerViewManager.createViewInstance$lambda$4(this.f20652e, emojiPickerView2, scrollEvent);
                }
            }
        }, new Function3(this) { // from class: t6.b

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ EmojiPickerViewManager f20649e;

            {
                this.f20649e = this;
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                View view = (View) obj;
                Long l6 = (Long) obj2;
                String str = (String) obj3;
                switch (i13) {
                    case 0:
                        return EmojiPickerViewManager.createViewInstance$lambda$1(this.f20649e, reactContext, view, l6, str);
                    default:
                        return EmojiPickerViewManager.createViewInstance$lambda$5(this.f20649e, reactContext, view, l6, str);
                }
            }
        }, new Function2(this) { // from class: t6.d

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ EmojiPickerViewManager f20654e;

            {
                this.f20654e = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                View view = (View) obj;
                switch (i14) {
                    case 0:
                        return EmojiPickerViewManager.createViewInstance$lambda$6(this.f20654e, reactContext, view, ((Integer) obj2).intValue());
                    default:
                        return EmojiPickerViewManager.createViewInstance$lambda$7(this.f20654e, reactContext, view, ((Boolean) obj2).booleanValue());
                }
            }
        }, new Function2(this) { // from class: t6.d

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ EmojiPickerViewManager f20654e;

            {
                this.f20654e = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                View view = (View) obj;
                switch (i15) {
                    case 0:
                        return EmojiPickerViewManager.createViewInstance$lambda$6(this.f20654e, reactContext, view, ((Integer) obj2).intValue());
                    default:
                        return EmojiPickerViewManager.createViewInstance$lambda$7(this.f20654e, reactContext, view, ((Boolean) obj2).booleanValue());
                }
            }
        }, zBooleanValue, configDeserialize);
        this.emojiPickerCaches.put(emojiPickerView, new EmojiPickerCache(emojiPickerView, coreDataDeserialize));
        return emojiPickerView;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public EmojiPickerViewManagerDelegate<EmojiPickerView, EmojiPickerViewManager> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.viewmanagers.EmojiPickerViewManagerInterface
    public void refreshEmojis(@NotNull EmojiPickerView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        EmojiPickerCache emojiPickerCache = this.emojiPickerCaches.get(view);
        if (emojiPickerCache != null) {
            EmojiPickerCache.refreshEmojis$default(emojiPickerCache, null, 1, null);
        }
    }

    @Override // com.facebook.react.viewmanagers.EmojiPickerViewManagerInterface
    public void scrollToHeaderIndex(@NotNull EmojiPickerView view, int index, boolean animated) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.scrollToItemAtIndex(index, animated, EmojiPickerItem.ItemType.CATEGORY);
    }

    @Override // com.facebook.react.viewmanagers.EmojiPickerViewManagerInterface
    public void scrollingEnabled(@NotNull EmojiPickerView view, boolean enabled) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.scrollingEnabled(enabled);
    }

    @Override // com.facebook.react.viewmanagers.EmojiPickerViewManagerInterface
    public void setConfig(@NotNull EmojiPickerView view, ReadableMap value) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (isInitialProp(view, PROP_CONFIG) || value == null) {
            return;
        }
        view.setConfig(EmojiPickerViewConfigDeserializer.INSTANCE.deserialize(EmojiPickerView.Config.INSTANCE, value));
    }

    @Override // com.facebook.react.viewmanagers.EmojiPickerViewManagerInterface
    public void setEmojiData(@NotNull EmojiPickerView view, ReadableMap value) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (isInitialProp(view, PROP_EMOJI_DATA) || value == null) {
            return;
        }
        EmojiPickerItemData.CoreData coreDataDeserialize$default = EmojiPickerItemDataCoreDataDeserializer.deserialize$default(EmojiPickerItemDataCoreDataDeserializer.INSTANCE, EmojiPickerItemData.CoreData.INSTANCE, value, 0.0f, 0.0f, 6, null);
        EmojiPickerCache emojiPickerCache = this.emojiPickerCaches.get(view);
        if (emojiPickerCache != null) {
            emojiPickerCache.refreshEmojis(coreDataDeserialize$default);
        }
        view.setCoreData(coreDataDeserialize$default);
    }

    @Override // com.facebook.react.viewmanagers.EmojiPickerViewManagerInterface
    public void setEmojiMargin(@NotNull EmojiPickerView view, int value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setEmojiMargin(value);
    }

    @Override // com.facebook.react.viewmanagers.EmojiPickerViewManagerInterface
    public void setEmojiSize(@NotNull EmojiPickerView view, int value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setEmojiSize(value);
    }

    @Override // com.facebook.react.viewmanagers.EmojiPickerViewManagerInterface
    public void setPaddingBottom(@NotNull EmojiPickerView view, float value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setContentPaddingBottom(value);
    }

    @Override // com.facebook.react.viewmanagers.EmojiPickerViewManagerInterface
    public void setPaddingTop(@NotNull EmojiPickerView view, float value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setContentPaddingTop(value);
    }

    @Override // com.facebook.react.viewmanagers.EmojiPickerViewManagerInterface
    public void setUseTier0UpsellContent(@NotNull EmojiPickerView view, boolean value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setUseTier0UpsellContent(value);
    }

    @Override // com.discord.react.utilities.InitialPropsViewGroupManager
    public void onDropViewInstance(@NotNull EmojiPickerView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onDropViewInstance(view);
        view.onDestroy();
        EmojiPickerCache emojiPickerCacheRemove = this.emojiPickerCaches.remove(view);
        if (emojiPickerCacheRemove != null) {
            emojiPickerCacheRemove.invalidate();
        }
    }
}
