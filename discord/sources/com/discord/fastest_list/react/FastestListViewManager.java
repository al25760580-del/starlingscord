package com.discord.fastest_list.react;

import ar.j;
import com.discord.fastest_list.android.FastestListSections;
import com.discord.fastest_list.android.FastestListView;
import com.discord.fastest_list.android.FastestListVisibleItemsTracker;
import com.discord.fastest_list.android.placeholder.FastestListPlaceholderConfig;
import com.discord.fastest_list.android.scroll.FastestListScrollOffset;
import com.discord.fastest_list.react.FastestListViewManager;
import com.discord.fastest_list.react_events.OnLayoutEvent;
import com.discord.fastest_list.react_events.OnScrollBeginDragEvent;
import com.discord.fastest_list.react_events.OnScrollEndDragEvent;
import com.discord.fastest_list.react_events.OnScrollEvent;
import com.discord.fastest_list.react_events.OnUnexpectedItemSizeEvent;
import com.discord.fastest_list.react_events.OnVisibleItemsChangedEvent;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.react.utilities.InitialPropsViewGroupManager;
import com.discord.react.utilities.ReactStylesDiffMapExtensionsKt;
import com.discord.reactevents.ReactEvents;
import com.facebook.react.bridge.NoSuchKeyException;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.viewmanagers.FastestListManagerDelegate;
import com.facebook.react.viewmanagers.FastestListManagerInterface;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0001\u0018\u0000 82\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u00018B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0016J\b\u0010\u000f\u001a\u00020\rH\u0016J$\u0010\u0010\u001a\u001e\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00000\u00000\u0007H\u0014J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00170\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0002H\u0016J\u0018\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0018\u0010 \u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020!H\u0016J\u0018\u0010\"\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020!H\u0016J\u0018\u0010#\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u001a\u0010$\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010%H\u0016J\u001a\u0010&\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\rH\u0016J\u0018\u0010'\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020(H\u0016J\u001a\u0010)\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010%H\u0016J\u0018\u0010*\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0018\u0010+\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010,\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0002H\u0014J0\u0010-\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010.\u001a\u00020(2\u0006\u0010/\u001a\u00020(2\u0006\u00100\u001a\u00020\u001f2\u0006\u00101\u001a\u00020(H\u0016J\u0018\u00102\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u00100\u001a\u00020\u001fH\u0016J0\u00103\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u00104\u001a\u00020(2\u0006\u00105\u001a\u00020(2\u0006\u00106\u001a\u00020(2\u0006\u00107\u001a\u00020(H\u0016R*\u0010\u0006\u001a\u001e\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00000\u00000\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00069"}, d2 = {"Lcom/discord/fastest_list/react/FastestListViewManager;", "Lcom/discord/react/utilities/InitialPropsViewGroupManager;", "Lcom/discord/fastest_list/android/FastestListView;", "Lcom/facebook/react/viewmanagers/FastestListManagerInterface;", "<init>", "()V", "delegate", "Lcom/facebook/react/viewmanagers/FastestListManagerDelegate;", "kotlin.jvm.PlatformType", "reactEvents", "Lcom/discord/reactevents/ReactEvents;", "getExportedCustomDirectEventTypeConstants", "", "", "", "getName", "getDelegate", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "initialProps", "Lcom/facebook/react/uimanager/ReactStylesDiffMap;", "createShadowNodeInstance", "Lcom/facebook/react/uimanager/LayoutShadowNode;", "getShadowNodeClass", "Ljava/lang/Class;", "onDropViewInstance", "", "view", "setHorizontal", "value", "", "setInsetEnd", "", "setInsetStart", "setKeyboardDismissOnDrag", "setPlaceholderConfig", "Lcom/facebook/react/bridge/ReadableMap;", "setRenderAhead", "setScrollEventThrottle", "", "setSectionsVersioned", "setShowsHorizontalScrollIndicator", "setShowsVerticalScrollIndicator", "onAfterUpdateTransaction", "scrollToLocation", "section", "item", "animated", ViewProps.PADDING_START, "scrollToTop", "setPadding", ViewProps.LEFT, ViewProps.TOP, ViewProps.RIGHT, ViewProps.BOTTOM, "Companion", "fastest_list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@ReactModule(name = FastestListViewManager.NAME)
@SourceDebugExtension({"SMAP\nFastestListViewManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FastestListViewManager.kt\ncom/discord/fastest_list/react/FastestListViewManager\n+ 2 ReactStylesDiffMapExtensions.kt\ncom/discord/react/utilities/ReactStylesDiffMapExtensionsKt\n*L\n1#1,276:1\n8#2,12:277\n8#2,12:289\n8#2,12:301\n8#2,12:313\n8#2,12:325\n8#2,12:337\n8#2,12:349\n*S KotlinDebug\n*F\n+ 1 FastestListViewManager.kt\ncom/discord/fastest_list/react/FastestListViewManager\n*L\n59#1:277,12\n60#1:289,12\n61#1:301,12\n62#1:313,12\n75#1:325,12\n131#1:337,12\n135#1:349,12\n*E\n"})
public final class FastestListViewManager extends InitialPropsViewGroupManager<FastestListView> implements FastestListManagerInterface<FastestListView> {

    @NotNull
    public static final String NAME = "FastestList";

    @NotNull
    private static final String PROP_HORIZONTAL = "horizontal";

    @NotNull
    private static final String PROP_INSET_END = "insetEnd";

    @NotNull
    private static final String PROP_INSET_START = "insetStart";

    @NotNull
    private static final String PROP_KEYBOARD_DISMISS_ON_DRAG = "keyboardDismissOnDrag";

    @NotNull
    private static final String PROP_PLACEHOLDER_CONFIG = "placeholderConfig";

    @NotNull
    private static final String PROP_RENDER_AHEAD = "renderAhead";

    @NotNull
    private static final String PROP_SCROLL_EVENT_THROTTLE = "scrollEventThrottle";

    @NotNull
    private static final String PROP_SECTIONS_VERSIONED = "sectionsVersioned";

    @NotNull
    private static final String PROP_SHOWS_HORIZONTAL_SCROLL_INDICATOR = "showsHorizontalScrollIndicator";

    @NotNull
    private static final String PROP_SHOWS_VERTICAL_SCROLL_INDICATOR = "showsVerticalScrollIndicator";

    @NotNull
    private final FastestListManagerDelegate<FastestListView, FastestListViewManager> delegate = new FastestListManagerDelegate<>(this);

    @NotNull
    private final ReactEvents reactEvents = new ReactEvents(new Pair("onUnexpectedItemSize", Reflection.getOrCreateKotlinClass(OnUnexpectedItemSizeEvent.class)), new Pair("onLayout", Reflection.getOrCreateKotlinClass(OnLayoutEvent.class)), new Pair("onScroll", Reflection.getOrCreateKotlinClass(OnScrollEvent.class)), new Pair("onScrollBeginDrag", Reflection.getOrCreateKotlinClass(OnScrollBeginDragEvent.class)), new Pair("onScrollEndDrag", Reflection.getOrCreateKotlinClass(OnScrollEndDragEvent.class)), new Pair("onVisibleItemsChanged", Reflection.getOrCreateKotlinClass(OnVisibleItemsChangedEvent.class)));

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createViewInstance$lambda$0(FastestListViewManager fastestListViewManager, FastestListView view, int i7, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(view, "view");
        fastestListViewManager.reactEvents.emitEvent(view, new OnLayoutEvent(SizeUtilsKt.getPxToDp(i7), SizeUtilsKt.getPxToDp(i10), SizeUtilsKt.getPxToDp(i11), SizeUtilsKt.getPxToDp(i12)));
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createViewInstance$lambda$1(FastestListViewManager fastestListViewManager, FastestListView view, FastestListScrollOffset.Data data) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(data, "data");
        fastestListViewManager.reactEvents.emitEvent(view, new OnScrollEvent(data));
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createViewInstance$lambda$2(FastestListViewManager fastestListViewManager, FastestListView view, FastestListScrollOffset.Data data) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(data, "data");
        fastestListViewManager.reactEvents.emitEvent(view, new OnScrollBeginDragEvent(data));
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createViewInstance$lambda$3(FastestListViewManager fastestListViewManager, FastestListView view, FastestListScrollOffset.Data data) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(data, "data");
        fastestListViewManager.reactEvents.emitEvent(view, new OnScrollEndDragEvent(data));
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createViewInstance$lambda$4(FastestListViewManager fastestListViewManager, FastestListView view, FastestListSections.Entry entry, int i7) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(entry, "entry");
        fastestListViewManager.reactEvents.emitEvent(view, new OnUnexpectedItemSizeEvent(entry, i7));
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createViewInstance$lambda$5(FastestListViewManager fastestListViewManager, FastestListView view, String sectionsId, int i7, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(sectionsId, "sectionsId");
        fastestListViewManager.reactEvents.emitEvent(view, new OnVisibleItemsChangedEvent(sectionsId, i7, i10, i11, i12));
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

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    @NotNull
    public Class<? extends LayoutShadowNode> getShadowNodeClass() {
        return FastestListShadowNode.class;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    @NotNull
    public LayoutShadowNode createShadowNodeInstance() {
        return new FastestListShadowNode();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0367 A[Catch: NoSuchKeyException | IllegalArgumentException -> 0x03b0, NoSuchKeyException | IllegalArgumentException -> 0x03b0, TryCatch #7 {NoSuchKeyException | IllegalArgumentException -> 0x03b0, blocks: (B:93:0x0342, B:97:0x0354, B:97:0x0354, B:98:0x035d, B:98:0x035d, B:100:0x0367, B:100:0x0367, B:102:0x037a, B:102:0x037a, B:104:0x0384, B:104:0x0384, B:105:0x0396, B:105:0x0396, B:106:0x03af, B:106:0x03af), top: B:125:0x0342 }] */
    /* JADX WARN: Code duplicated, block: B:102:0x037a A[Catch: NoSuchKeyException | IllegalArgumentException -> 0x03b0, NoSuchKeyException | IllegalArgumentException -> 0x03b0, TryCatch #7 {NoSuchKeyException | IllegalArgumentException -> 0x03b0, blocks: (B:93:0x0342, B:97:0x0354, B:97:0x0354, B:98:0x035d, B:98:0x035d, B:100:0x0367, B:100:0x0367, B:102:0x037a, B:102:0x037a, B:104:0x0384, B:104:0x0384, B:105:0x0396, B:105:0x0396, B:106:0x03af, B:106:0x03af), top: B:125:0x0342 }] */
    /* JADX WARN: Code duplicated, block: B:104:0x0384 A[Catch: NoSuchKeyException | IllegalArgumentException -> 0x03b0, NoSuchKeyException | IllegalArgumentException -> 0x03b0, TryCatch #7 {NoSuchKeyException | IllegalArgumentException -> 0x03b0, blocks: (B:93:0x0342, B:97:0x0354, B:97:0x0354, B:98:0x035d, B:98:0x035d, B:100:0x0367, B:100:0x0367, B:102:0x037a, B:102:0x037a, B:104:0x0384, B:104:0x0384, B:105:0x0396, B:105:0x0396, B:106:0x03af, B:106:0x03af), top: B:125:0x0342 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x0396 A[Catch: NoSuchKeyException | IllegalArgumentException -> 0x03b0, NoSuchKeyException | IllegalArgumentException -> 0x03b0, TryCatch #7 {NoSuchKeyException | IllegalArgumentException -> 0x03b0, blocks: (B:93:0x0342, B:97:0x0354, B:97:0x0354, B:98:0x035d, B:98:0x035d, B:100:0x0367, B:100:0x0367, B:102:0x037a, B:102:0x037a, B:104:0x0384, B:104:0x0384, B:105:0x0396, B:105:0x0396, B:106:0x03af, B:106:0x03af), top: B:125:0x0342 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x0353  */
    /* JADX WARN: Code duplicated, block: B:98:0x035d A[Catch: NoSuchKeyException | IllegalArgumentException -> 0x03b0, NoSuchKeyException | IllegalArgumentException -> 0x03b0, TryCatch #7 {NoSuchKeyException | IllegalArgumentException -> 0x03b0, blocks: (B:93:0x0342, B:97:0x0354, B:97:0x0354, B:98:0x035d, B:98:0x035d, B:100:0x0367, B:100:0x0367, B:102:0x037a, B:102:0x037a, B:104:0x0384, B:104:0x0384, B:105:0x0396, B:105:0x0396, B:106:0x03af, B:106:0x03af), top: B:125:0x0342 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:105:0x0396, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r11v33 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Number] */
    /* JADX WARN: Type inference failed for: r4v54 */
    /* JADX WARN: Type inference failed for: r4v55 */
    /* JADX WARN: Type inference failed for: r4v56 */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Number] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Number] */
    /* JADX WARN: Type inference failed for: r5v6 */
    @Override // com.discord.react.utilities.InitialPropsViewGroupManager
    @NotNull
    public FastestListView createViewInstance(@NotNull ThemedReactContext reactContext, @NotNull ReactStylesDiffMap initialProps) {
        ?? ValueOf;
        Object obj;
        j jVar;
        ?? ValueOf2;
        ?? ValueOf3;
        KClass orCreateKotlinClass;
        Boolean bool;
        Integer numValueOf;
        Boolean bool2;
        Float fValueOf;
        Boolean boolValueOf;
        ?? ValueOf4 = Float.valueOf(0.0f);
        Class cls = Float.TYPE;
        Class cls2 = Integer.TYPE;
        Class cls3 = Boolean.TYPE;
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(initialProps, "initialProps");
        ?? r11 = Boolean.FALSE;
        try {
            KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(Boolean.class);
            if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(cls3))) {
                boolValueOf = Boolean.valueOf(initialProps.getBoolean(PROP_HORIZONTAL, false));
            } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(cls2))) {
                boolValueOf = (Boolean) Integer.valueOf(initialProps.getInt(PROP_HORIZONTAL, ((Integer) r11).intValue()));
            } else {
                if (!Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(cls))) {
                    throw new IllegalStateException(("Unsupported type " + Reflection.getOrCreateKotlinClass(Boolean.class)).toString());
                }
                boolValueOf = (Boolean) Float.valueOf(initialProps.getFloat(PROP_HORIZONTAL, ((Float) r11).floatValue()));
            }
            r11 = boolValueOf;
        } catch (NoSuchKeyException | IllegalArgumentException unused) {
        }
        boolean zBooleanValue = r11.booleanValue();
        try {
            KClass orCreateKotlinClass3 = Reflection.getOrCreateKotlinClass(Float.class);
            if (Intrinsics.areEqual(orCreateKotlinClass3, Reflection.getOrCreateKotlinClass(cls3))) {
                ValueOf = (Float) Boolean.valueOf(initialProps.getBoolean(PROP_INSET_END, ((Boolean) ValueOf4).booleanValue()));
            } else if (Intrinsics.areEqual(orCreateKotlinClass3, Reflection.getOrCreateKotlinClass(cls2))) {
                ValueOf = (Float) Integer.valueOf(initialProps.getInt(PROP_INSET_END, ((Integer) ValueOf4).intValue()));
            } else {
                if (!Intrinsics.areEqual(orCreateKotlinClass3, Reflection.getOrCreateKotlinClass(cls))) {
                    throw new IllegalStateException(("Unsupported type " + Reflection.getOrCreateKotlinClass(Float.class)).toString());
                }
                ValueOf = Float.valueOf(initialProps.getFloat(PROP_INSET_END, 0.0f));
            }
        } catch (NoSuchKeyException | IllegalArgumentException unused2) {
            ValueOf = ValueOf4;
        }
        int dpToPx = SizeUtilsKt.getDpToPx(ValueOf.floatValue());
        try {
            KClass orCreateKotlinClass4 = Reflection.getOrCreateKotlinClass(Float.class);
            if (Intrinsics.areEqual(orCreateKotlinClass4, Reflection.getOrCreateKotlinClass(cls3))) {
                fValueOf = (Float) Boolean.valueOf(initialProps.getBoolean(PROP_INSET_START, ((Boolean) ValueOf4).booleanValue()));
            } else if (Intrinsics.areEqual(orCreateKotlinClass4, Reflection.getOrCreateKotlinClass(cls2))) {
                fValueOf = (Float) Integer.valueOf(initialProps.getInt(PROP_INSET_START, ((Integer) ValueOf4).intValue()));
            } else {
                if (!Intrinsics.areEqual(orCreateKotlinClass4, Reflection.getOrCreateKotlinClass(cls))) {
                    throw new IllegalStateException(("Unsupported type " + Reflection.getOrCreateKotlinClass(Float.class)).toString());
                }
                fValueOf = Float.valueOf(initialProps.getFloat(PROP_INSET_START, 0.0f));
            }
            ValueOf4 = fValueOf;
        } catch (NoSuchKeyException | IllegalArgumentException unused3) {
        }
        int dpToPx2 = SizeUtilsKt.getDpToPx(ValueOf4.floatValue());
        ?? ValueOf5 = Boolean.FALSE;
        try {
            KClass orCreateKotlinClass5 = Reflection.getOrCreateKotlinClass(Boolean.class);
            if (Intrinsics.areEqual(orCreateKotlinClass5, Reflection.getOrCreateKotlinClass(cls3))) {
                ValueOf5 = Boolean.valueOf(initialProps.getBoolean(PROP_KEYBOARD_DISMISS_ON_DRAG, false));
            } else {
                if (Intrinsics.areEqual(orCreateKotlinClass5, Reflection.getOrCreateKotlinClass(cls2))) {
                    bool2 = (Boolean) Integer.valueOf(initialProps.getInt(PROP_KEYBOARD_DISMISS_ON_DRAG, ((Integer) ValueOf5).intValue()));
                } else {
                    if (!Intrinsics.areEqual(orCreateKotlinClass5, Reflection.getOrCreateKotlinClass(cls))) {
                        throw new IllegalStateException(("Unsupported type " + Reflection.getOrCreateKotlinClass(Boolean.class)).toString());
                    }
                    bool2 = (Boolean) Float.valueOf(initialProps.getFloat(PROP_KEYBOARD_DISMISS_ON_DRAG, ((Float) ValueOf5).floatValue()));
                }
                ValueOf5 = bool2;
            }
        } catch (NoSuchKeyException | IllegalArgumentException unused4) {
        }
        boolean zBooleanValue2 = ValueOf5.booleanValue();
        Function5 function5 = new Function5() { // from class: u6.a
            @Override // kotlin.jvm.functions.Function5
            public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                int iIntValue = ((Integer) obj3).intValue();
                int iIntValue2 = ((Integer) obj4).intValue();
                int iIntValue3 = ((Integer) obj5).intValue();
                int iIntValue4 = ((Integer) obj6).intValue();
                return FastestListViewManager.createViewInstance$lambda$0(this.f20947d, (FastestListView) obj2, iIntValue, iIntValue2, iIntValue3, iIntValue4);
            }
        };
        ?? r5 = 0;
        try {
            KClass orCreateKotlinClass6 = Reflection.getOrCreateKotlinClass(Integer.class);
            if (Intrinsics.areEqual(orCreateKotlinClass6, Reflection.getOrCreateKotlinClass(cls3))) {
                numValueOf = (Integer) Boolean.valueOf(initialProps.getBoolean(PROP_SCROLL_EVENT_THROTTLE, ((Boolean) r5).booleanValue()));
            } else if (Intrinsics.areEqual(orCreateKotlinClass6, Reflection.getOrCreateKotlinClass(cls2))) {
                numValueOf = Integer.valueOf(initialProps.getInt(PROP_SCROLL_EVENT_THROTTLE, 0));
            } else {
                if (!Intrinsics.areEqual(orCreateKotlinClass6, Reflection.getOrCreateKotlinClass(cls))) {
                    throw new IllegalStateException(("Unsupported type " + Reflection.getOrCreateKotlinClass(Integer.class)).toString());
                }
                numValueOf = (Integer) Float.valueOf(initialProps.getFloat(PROP_SCROLL_EVENT_THROTTLE, ((Float) r5).floatValue()));
            }
            r5 = numValueOf;
        } catch (NoSuchKeyException | IllegalArgumentException unused5) {
        }
        long jIntValue = r5.intValue();
        final int i7 = 0;
        Function2 function2 = new Function2(this) { // from class: u6.b

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ FastestListViewManager f20949e;

            {
                this.f20949e = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                FastestListView fastestListView = (FastestListView) obj2;
                FastestListScrollOffset.Data data = (FastestListScrollOffset.Data) obj3;
                switch (i7) {
                    case 0:
                        return FastestListViewManager.createViewInstance$lambda$1(this.f20949e, fastestListView, data);
                    case 1:
                        return FastestListViewManager.createViewInstance$lambda$2(this.f20949e, fastestListView, data);
                    default:
                        return FastestListViewManager.createViewInstance$lambda$3(this.f20949e, fastestListView, data);
                }
            }
        };
        final int i10 = 1;
        Function2 function3 = new Function2(this) { // from class: u6.b

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ FastestListViewManager f20949e;

            {
                this.f20949e = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                FastestListView fastestListView = (FastestListView) obj2;
                FastestListScrollOffset.Data data = (FastestListScrollOffset.Data) obj3;
                switch (i10) {
                    case 0:
                        return FastestListViewManager.createViewInstance$lambda$1(this.f20949e, fastestListView, data);
                    case 1:
                        return FastestListViewManager.createViewInstance$lambda$2(this.f20949e, fastestListView, data);
                    default:
                        return FastestListViewManager.createViewInstance$lambda$3(this.f20949e, fastestListView, data);
                }
            }
        };
        final int i11 = 2;
        Function2 function4 = new Function2(this) { // from class: u6.b

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ FastestListViewManager f20949e;

            {
                this.f20949e = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                FastestListView fastestListView = (FastestListView) obj2;
                FastestListScrollOffset.Data data = (FastestListScrollOffset.Data) obj3;
                switch (i11) {
                    case 0:
                        return FastestListViewManager.createViewInstance$lambda$1(this.f20949e, fastestListView, data);
                    case 1:
                        return FastestListViewManager.createViewInstance$lambda$2(this.f20949e, fastestListView, data);
                    default:
                        return FastestListViewManager.createViewInstance$lambda$3(this.f20949e, fastestListView, data);
                }
            }
        };
        j jVar2 = new j(6, this);
        Function6 function6 = new Function6() { // from class: u6.c
            @Override // kotlin.jvm.functions.Function6
            public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
                int iIntValue = ((Integer) obj4).intValue();
                int iIntValue2 = ((Integer) obj5).intValue();
                int iIntValue3 = ((Integer) obj6).intValue();
                int iIntValue4 = ((Integer) obj7).intValue();
                return FastestListViewManager.createViewInstance$lambda$5(this.f20950d, (FastestListView) obj2, (String) obj3, iIntValue, iIntValue2, iIntValue3, iIntValue4);
            }
        };
        FastestListPlaceholderConfig fastestListPlaceholderConfigInvoke = FastestListDeserializerPlaceholderConfigKt.invoke(FastestListPlaceholderConfig.INSTANCE, ReactStylesDiffMapExtensionsKt.getNonNullMap(initialProps, PROP_PLACEHOLDER_CONFIG));
        FastestListVisibleItemsTracker.RenderAhead renderAheadCreate = FastestListVisibleItemsTracker.RenderAhead.INSTANCE.create(ReactStylesDiffMapExtensionsKt.getNonNullString(initialProps, PROP_RENDER_AHEAD));
        FastestListSections.Versioned versionedInvoke = FastestListDeserializerSectionsKt.invoke(FastestListSections.Versioned.INSTANCE, ReactStylesDiffMapExtensionsKt.getNonNullMap(initialProps, PROP_SECTIONS_VERSIONED));
        Boolean bool3 = Boolean.FALSE;
        try {
            KClass orCreateKotlinClass7 = Reflection.getOrCreateKotlinClass(Boolean.class);
            obj = bool3;
            try {
                try {
                    if (Intrinsics.areEqual(orCreateKotlinClass7, Reflection.getOrCreateKotlinClass(cls3))) {
                        jVar = jVar2;
                        ValueOf2 = Boolean.valueOf(initialProps.getBoolean(PROP_SHOWS_HORIZONTAL_SCROLL_INDICATOR, false));
                    } else {
                        jVar = jVar2;
                        if (Intrinsics.areEqual(orCreateKotlinClass7, Reflection.getOrCreateKotlinClass(cls2))) {
                            ValueOf2 = (Boolean) Integer.valueOf(initialProps.getInt(PROP_SHOWS_HORIZONTAL_SCROLL_INDICATOR, ((Integer) obj).intValue()));
                        } else {
                            if (!Intrinsics.areEqual(orCreateKotlinClass7, Reflection.getOrCreateKotlinClass(cls))) {
                                throw new IllegalStateException(("Unsupported type " + Reflection.getOrCreateKotlinClass(Boolean.class)).toString());
                            }
                            ValueOf2 = (Boolean) Float.valueOf(initialProps.getFloat(PROP_SHOWS_HORIZONTAL_SCROLL_INDICATOR, ((Float) obj).floatValue()));
                        }
                    }
                } catch (NoSuchKeyException | IllegalArgumentException unused6) {
                    ValueOf2 = obj;
                }
            } catch (NoSuchKeyException | IllegalArgumentException unused7) {
                jVar = jVar2;
                ValueOf2 = obj;
                boolean zBooleanValue3 = ValueOf2.booleanValue();
                ValueOf3 = Boolean.FALSE;
                orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Boolean.class);
                if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(cls3))) {
                    ValueOf3 = Boolean.valueOf(initialProps.getBoolean(PROP_SHOWS_VERTICAL_SCROLL_INDICATOR, false));
                } else {
                    if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(cls2))) {
                        bool = (Boolean) Integer.valueOf(initialProps.getInt(PROP_SHOWS_VERTICAL_SCROLL_INDICATOR, ((Integer) ValueOf3).intValue()));
                    } else {
                        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(cls))) {
                            throw new IllegalStateException(("Unsupported type " + Reflection.getOrCreateKotlinClass(Boolean.class)).toString());
                        }
                        bool = (Boolean) Float.valueOf(initialProps.getFloat(PROP_SHOWS_VERTICAL_SCROLL_INDICATOR, ((Float) ValueOf3).floatValue()));
                    }
                    ValueOf3 = bool;
                }
                return new FastestListView(reactContext, zBooleanValue, dpToPx, dpToPx2, zBooleanValue2, function5, jIntValue, function2, function3, function4, jVar, function6, fastestListPlaceholderConfigInvoke, renderAheadCreate, versionedInvoke, zBooleanValue3, ValueOf3.booleanValue());
            }
        } catch (NoSuchKeyException | IllegalArgumentException unused8) {
            obj = bool3;
        }
        boolean zBooleanValue4 = ValueOf2.booleanValue();
        ValueOf3 = Boolean.FALSE;
        try {
            orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Boolean.class);
            if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(cls3))) {
                ValueOf3 = Boolean.valueOf(initialProps.getBoolean(PROP_SHOWS_VERTICAL_SCROLL_INDICATOR, false));
            } else {
                if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(cls2))) {
                    bool = (Boolean) Integer.valueOf(initialProps.getInt(PROP_SHOWS_VERTICAL_SCROLL_INDICATOR, ((Integer) ValueOf3).intValue()));
                } else {
                    if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(cls))) {
                        throw new IllegalStateException(("Unsupported type " + Reflection.getOrCreateKotlinClass(Boolean.class)).toString());
                    }
                    bool = (Boolean) Float.valueOf(initialProps.getFloat(PROP_SHOWS_VERTICAL_SCROLL_INDICATOR, ((Float) ValueOf3).floatValue()));
                }
                ValueOf3 = bool;
            }
        } catch (NoSuchKeyException | IllegalArgumentException unused9) {
        }
        return new FastestListView(reactContext, zBooleanValue, dpToPx, dpToPx2, zBooleanValue2, function5, jIntValue, function2, function3, function4, jVar, function6, fastestListPlaceholderConfigInvoke, renderAheadCreate, versionedInvoke, zBooleanValue4, ValueOf3.booleanValue());
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public FastestListManagerDelegate<FastestListView, FastestListViewManager> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(@NotNull FastestListView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onAfterUpdateTransaction(view);
        FastestListShadowNode.INSTANCE.updateFromShadowNode(view);
    }

    @Override // com.facebook.react.viewmanagers.FastestListManagerInterface
    public void scrollToLocation(@NotNull FastestListView view, int section, int item, boolean animated, int paddingStart) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.scrollTo(section, item, animated, paddingStart);
    }

    @Override // com.facebook.react.viewmanagers.FastestListManagerInterface
    public void scrollToTop(@NotNull FastestListView view, boolean animated) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.scrollToTop(animated);
    }

    @Override // com.facebook.react.viewmanagers.FastestListManagerInterface
    public void setHorizontal(@NotNull FastestListView view, boolean value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setHorizontal(value);
    }

    @Override // com.facebook.react.viewmanagers.FastestListManagerInterface
    public void setInsetEnd(@NotNull FastestListView view, float value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setInsetEnd(SizeUtilsKt.getDpToPx(value));
    }

    @Override // com.facebook.react.viewmanagers.FastestListManagerInterface
    public void setInsetStart(@NotNull FastestListView view, float value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setInsetStart(SizeUtilsKt.getDpToPx(value));
    }

    @Override // com.facebook.react.viewmanagers.FastestListManagerInterface
    public void setKeyboardDismissOnDrag(@NotNull FastestListView view, boolean value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setKeyboardDismissOnDrag(value);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void setPadding(@NotNull FastestListView view, int left, int top, int right, int bottom) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.setPadding(view, left, top, right, bottom);
        view.setPadding(left, top, right, bottom);
    }

    @Override // com.facebook.react.viewmanagers.FastestListManagerInterface
    public void setPlaceholderConfig(@NotNull FastestListView view, ReadableMap value) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (value == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        view.setPlaceholderConfig(FastestListDeserializerPlaceholderConfigKt.invoke(FastestListPlaceholderConfig.INSTANCE, value));
    }

    @Override // com.facebook.react.viewmanagers.FastestListManagerInterface
    public void setRenderAhead(@NotNull FastestListView view, String value) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (value == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        view.setRenderAhead(FastestListVisibleItemsTracker.RenderAhead.INSTANCE.create(value));
    }

    @Override // com.facebook.react.viewmanagers.FastestListManagerInterface
    public void setScrollEventThrottle(@NotNull FastestListView view, int value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setScrollEventThrottle(value);
    }

    @Override // com.facebook.react.viewmanagers.FastestListManagerInterface
    public void setSectionsVersioned(@NotNull FastestListView view, ReadableMap value) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (value == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        view.setSectionsVersioned(FastestListDeserializerSectionsKt.invoke(FastestListSections.Versioned.INSTANCE, value));
    }

    @Override // com.facebook.react.viewmanagers.FastestListManagerInterface
    public void setShowsHorizontalScrollIndicator(@NotNull FastestListView view, boolean value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setShowsHorizontalScrollIndicator(value);
    }

    @Override // com.facebook.react.viewmanagers.FastestListManagerInterface
    public void setShowsVerticalScrollIndicator(@NotNull FastestListView view, boolean value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setShowsVerticalScrollIndicator(value);
    }

    @Override // com.discord.react.utilities.InitialPropsViewGroupManager
    public void onDropViewInstance(@NotNull FastestListView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.onDrop();
        FastestListShadowNode.INSTANCE.dropShadowNode(view);
    }
}
