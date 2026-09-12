package com.facebook.react.views.text;

import a3.e;
import android.content.Context;
import android.content.res.AssetManager;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import com.facebook.imagepipeline.nativecode.c;
import com.facebook.react.R;
import com.facebook.react.common.mapbuffer.MapBuffer;
import com.facebook.react.common.mapbuffer.ReadableMapBuffer;
import com.facebook.react.internal.SystraceSection;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.BackgroundStyleApplicator;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.IViewManagerWithChildren;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.LengthPercentage;
import com.facebook.react.uimanager.LengthPercentageType;
import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.react.uimanager.ReferenceStateWrapper;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import com.facebook.react.uimanager.style.BorderRadiusProp;
import com.facebook.react.uimanager.style.BorderStyle;
import com.facebook.react.uimanager.style.LogicalEdge;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.v0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@ReactModule(name = "RCTText")
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u0007\n\u0002\b\u001c\b\u0017\u0018\u0000 ]2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0001]B\u0015\b\u0007\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0014J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u0002H\u0014J\u0010\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u000eH\u0016J\u0018\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0003H\u0016J\u0010\u0010\u0019\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u0002H\u0014J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\"\u0010\u001f\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0016J \u0010$\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020!2\u0006\u0010%\u001a\u00020&H\u0002J\u0018\u0010'\u001a\u00020(2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010)\u001a\u00020*H\u0002J\u0016\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0018\u0018\u00010,H\u0016J\u0010\u0010-\u001a\u00020\u00132\u0006\u0010.\u001a\u00020/H\u0016J0\u00100\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u0002022\u0006\u00104\u001a\u0002022\u0006\u00105\u001a\u000202H\u0016J\u001a\u00106\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00022\b\u00107\u001a\u0004\u0018\u00010\u0011H\u0007J\u0018\u00108\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u00109\u001a\u00020\u001eH\u0007J\u0018\u0010:\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010;\u001a\u000202H\u0007J\u001a\u0010<\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00022\b\u0010=\u001a\u0004\u0018\u00010\u0011H\u0007J\u0018\u0010>\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010?\u001a\u00020\u001eH\u0007J\u0018\u0010@\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010A\u001a\u00020BH\u0007J\u0018\u0010C\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010D\u001a\u00020BH\u0007J\u001a\u0010E\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00022\b\u0010F\u001a\u0004\u0018\u00010\u0011H\u0007J\u0018\u0010G\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010H\u001a\u00020\u001eH\u0007J\u001f\u0010I\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00022\b\u0010J\u001a\u0004\u0018\u000102H\u0007¢\u0006\u0002\u0010KJ\u001a\u0010L\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00022\b\u0010M\u001a\u0004\u0018\u00010\u0011H\u0007J \u0010N\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010O\u001a\u0002022\u0006\u0010P\u001a\u00020BH\u0007J\u001a\u0010Q\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00022\b\u0010R\u001a\u0004\u0018\u00010\u0011H\u0007J \u0010S\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010O\u001a\u0002022\u0006\u0010T\u001a\u00020BH\u0007J'\u0010U\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010O\u001a\u0002022\b\u0010J\u001a\u0004\u0018\u000102H\u0007¢\u0006\u0002\u0010VJ\u0018\u0010W\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010X\u001a\u00020\u001eH\u0007J\u0018\u0010Y\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010Z\u001a\u00020\u001eH\u0007J\u001a\u0010[\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00022\b\u0010\\\u001a\u0004\u0018\u00010\u0011H\u0007R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\b¨\u0006^"}, d2 = {"Lcom/facebook/react/views/text/ReactTextViewManager;", "Lcom/facebook/react/uimanager/BaseViewManager;", "Lcom/facebook/react/views/text/ReactTextView;", "Lcom/facebook/react/uimanager/LayoutShadowNode;", "Lcom/facebook/react/uimanager/IViewManagerWithChildren;", "Lcom/facebook/react/views/text/ReactTextViewManagerCallback;", "reactTextViewManagerCallback", "<init>", "(Lcom/facebook/react/views/text/ReactTextViewManagerCallback;)V", "getReactTextViewManagerCallback", "()Lcom/facebook/react/views/text/ReactTextViewManagerCallback;", "setReactTextViewManagerCallback", "prepareToRecycleView", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "view", "getName", "", "updateViewAccessibility", "", "createViewInstance", "context", "updateExtraData", "extraData", "", "createShadowNodeInstance", "getShadowNodeClass", "Ljava/lang/Class;", "onAfterUpdateTransaction", "needsCustomLayoutForChildren", "", "updateState", "props", "Lcom/facebook/react/uimanager/ReactStylesDiffMap;", "stateWrapper", "Lcom/facebook/react/uimanager/StateWrapper;", "getReactTextUpdate", "state", "Lcom/facebook/react/common/mapbuffer/MapBuffer;", "getReactTextUpdateFromPreparedLayout", "Lcom/facebook/react/views/text/ReactTextUpdate;", "preparedLayout", "Lcom/facebook/react/views/text/PreparedLayout;", "getExportedCustomDirectEventTypeConstants", "", "onPostProcessSpannable", "text", "Landroid/text/Spannable;", "setPadding", ViewProps.LEFT, "", ViewProps.TOP, ViewProps.RIGHT, ViewProps.BOTTOM, "setOverflow", ViewProps.OVERFLOW, "setAccessible", "accessible", "setNumberOfLines", ViewProps.NUMBER_OF_LINES, "setEllipsizeMode", ViewProps.ELLIPSIZE_MODE, "setAdjustFontSizeToFit", ViewProps.ADJUSTS_FONT_SIZE_TO_FIT, "setFontSize", ViewProps.FONT_SIZE, "", "setLetterSpacing", ViewProps.LETTER_SPACING, "setTextAlignVertical", ViewProps.TEXT_ALIGN_VERTICAL, "setSelectable", "isSelectable", "setSelectionColor", ViewProps.COLOR, "(Lcom/facebook/react/views/text/ReactTextView;Ljava/lang/Integer;)V", "setAndroidHyphenationFrequency", "frequency", "setBorderRadius", "index", "borderRadius", "setBorderStyle", "borderStyle", "setBorderWidth", "width", "setBorderColor", "(Lcom/facebook/react/views/text/ReactTextView;ILjava/lang/Integer;)V", "setIncludeFontPadding", "includepad", "setDisabled", "disabled", "setDataDetectorType", "type", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class ReactTextViewManager extends BaseViewManager<ReactTextView, LayoutShadowNode> implements IViewManagerWithChildren, ReactTextViewManagerCallback {

    @NotNull
    public static final String REACT_CLASS = "RCTText";
    private static final short TX_STATE_KEY_ATTRIBUTED_STRING = 0;
    private static final short TX_STATE_KEY_PARAGRAPH_ATTRIBUTES = 1;
    private ReactTextViewManagerCallback reactTextViewManagerCallback;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            try {
                iArr[Layout.Alignment.ALIGN_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ReactTextViewManager() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final Object getReactTextUpdate(ReactTextView view, ReactStylesDiffMap props, MapBuffer state) {
        MapBuffer mapBuffer = state.getMapBuffer(0);
        MapBuffer mapBuffer2 = state.getMapBuffer(1);
        TextLayoutManager textLayoutManager = TextLayoutManager.INSTANCE;
        AssetManager assets = view.getContext().getAssets();
        Intrinsics.checkNotNullExpressionValue(assets, "getAssets(...)");
        Spannable orCreateSpannableForText = textLayoutManager.getOrCreateSpannableForText(assets, mapBuffer, this.reactTextViewManagerCallback);
        view.setSpanned(orCreateSpannableForText);
        view.setMinimumFontSize((float) mapBuffer2.getDouble(6));
        view.setPreparedLayout(null);
        TextAttributeProps.Companion companion = TextAttributeProps.INSTANCE;
        return new ReactTextUpdate(orCreateSpannableForText, -1, TextLayoutManager.getTextGravity(mapBuffer, orCreateSpannableForText), companion.getTextBreakStrategy(mapBuffer2.getString(2)), companion.getJustificationMode(props, Build.VERSION.SDK_INT >= 26 ? view.getJustificationMode() : 0));
    }

    private final ReactTextUpdate getReactTextUpdateFromPreparedLayout(ReactTextView view, PreparedLayout preparedLayout) {
        Layout layout = preparedLayout.getLayout();
        CharSequence text = layout.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        Spannable spannableString = text instanceof Spannable ? (Spannable) text : new SpannableString(text);
        view.setSpanned(spannableString);
        view.setPreparedLayout(preparedLayout);
        int i7 = WhenMappings.$EnumSwitchMapping$0[layout.getAlignment().ordinal()];
        int i10 = 1;
        if (i7 != 1) {
            i10 = i7 != 2 ? 8388611 : 8388613;
        }
        return new ReactTextUpdate(spannableString, -1, i10, preparedLayout.getTextBreakStrategy(), preparedLayout.getJustificationMode());
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap<>();
        }
        exportedCustomDirectEventTypeConstants.putAll(v0.b(new Pair("topTextLayout", e.v("registrationName", "onTextLayout"))));
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "RCTText";
    }

    public final ReactTextViewManagerCallback getReactTextViewManagerCallback() {
        return this.reactTextViewManagerCallback;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public Class<LayoutShadowNode> getShadowNodeClass() {
        return LayoutShadowNode.class;
    }

    @Override // com.facebook.react.uimanager.IViewManagerWithChildren
    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    @Override // com.facebook.react.views.text.ReactTextViewManagerCallback
    public void onPostProcessSpannable(@NotNull Spannable text) {
        Intrinsics.checkNotNullParameter(text, "text");
        ReactTextViewManagerCallback reactTextViewManagerCallback = this.reactTextViewManagerCallback;
        if (reactTextViewManagerCallback != null) {
            reactTextViewManagerCallback.onPostProcessSpannable(text);
        }
    }

    @ReactProp(name = "accessible")
    public final void setAccessible(@NotNull ReactTextView view, boolean accessible) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setFocusable(accessible);
    }

    @ReactProp(name = ViewProps.ADJUSTS_FONT_SIZE_TO_FIT)
    public final void setAdjustFontSizeToFit(@NotNull ReactTextView view, boolean adjustsFontSizeToFit) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setAdjustFontSizeToFit(adjustsFontSizeToFit);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
    
        if (r5.equals(com.facebook.react.uimanager.ViewProps.NONE) == false) goto L21;
     */
    @com.facebook.react.uimanager.annotations.ReactProp(name = "android_hyphenationFrequency")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setAndroidHyphenationFrequency(@org.jetbrains.annotations.NotNull com.facebook.react.views.text.ReactTextView r4, java.lang.String r5) {
        /*
            r3 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 0
            if (r5 == 0) goto L4f
            int r1 = r5.hashCode()
            r2 = -1039745817(0xffffffffc206bce7, float:-33.684475)
            if (r1 == r2) goto L33
            r2 = 3154575(0x30228f, float:4.420501E-39)
            if (r1 == r2) goto L25
            r2 = 3387192(0x33af38, float:4.746467E-39)
            if (r1 == r2) goto L1c
            goto L3b
        L1c:
            java.lang.String r1 = "none"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L4f
            goto L3b
        L25:
            java.lang.String r1 = "full"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L2e
            goto L3b
        L2e:
            r5 = 2
            r4.setHyphenationFrequency(r5)
            return
        L33:
            java.lang.String r1 = "normal"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L4a
        L3b:
            java.lang.String r1 = "Invalid android_hyphenationFrequency: "
            java.lang.String r5 = r1.concat(r5)
            java.lang.String r1 = "ReactNative"
            o8.a.v(r1, r5)
            r4.setHyphenationFrequency(r0)
            return
        L4a:
            r5 = 1
            r4.setHyphenationFrequency(r5)
            return
        L4f:
            r4.setHyphenationFrequency(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.text.ReactTextViewManager.setAndroidHyphenationFrequency(com.facebook.react.views.text.ReactTextView, java.lang.String):void");
    }

    @ReactPropGroup(customType = "Color", names = {ViewProps.BORDER_COLOR, ViewProps.BORDER_LEFT_COLOR, ViewProps.BORDER_RIGHT_COLOR, ViewProps.BORDER_TOP_COLOR, ViewProps.BORDER_BOTTOM_COLOR})
    public final void setBorderColor(@NotNull ReactTextView view, int index, Integer color) {
        Intrinsics.checkNotNullParameter(view, "view");
        BackgroundStyleApplicator.setBorderColor(view, LogicalEdge.values()[index], color);
    }

    @ReactPropGroup(defaultFloat = FloatCompanionObject.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public final void setBorderRadius(@NotNull ReactTextView view, int index, float borderRadius) {
        Intrinsics.checkNotNullParameter(view, "view");
        BackgroundStyleApplicator.setBorderRadius(view, BorderRadiusProp.values()[index], Float.isNaN(borderRadius) ? null : new LengthPercentage(borderRadius, LengthPercentageType.POINT));
    }

    @ReactProp(name = "borderStyle")
    public final void setBorderStyle(@NotNull ReactTextView view, String borderStyle) {
        Intrinsics.checkNotNullParameter(view, "view");
        BackgroundStyleApplicator.setBorderStyle(view, borderStyle == null ? null : BorderStyle.INSTANCE.fromString(borderStyle));
    }

    @ReactPropGroup(defaultFloat = FloatCompanionObject.NaN, names = {ViewProps.BORDER_WIDTH, ViewProps.BORDER_LEFT_WIDTH, ViewProps.BORDER_RIGHT_WIDTH, ViewProps.BORDER_TOP_WIDTH, ViewProps.BORDER_BOTTOM_WIDTH, ViewProps.BORDER_START_WIDTH, ViewProps.BORDER_END_WIDTH})
    public final void setBorderWidth(@NotNull ReactTextView view, int index, float width) {
        Intrinsics.checkNotNullParameter(view, "view");
        BackgroundStyleApplicator.setBorderWidth(view, LogicalEdge.values()[index], Float.valueOf(width));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @ReactProp(name = "dataDetectorType")
    public final void setDataDetectorType(@NotNull ReactTextView view, String type) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (type != null) {
            switch (type.hashCode()) {
                case -1192969641:
                    if (type.equals("phoneNumber")) {
                        view.setLinkifyMask(4);
                        return;
                    }
                    break;
                case 96673:
                    if (type.equals("all")) {
                        view.setLinkifyMask(15);
                        return;
                    }
                    break;
                case 3321850:
                    if (type.equals("link")) {
                        view.setLinkifyMask(1);
                        return;
                    }
                    break;
                case 96619420:
                    if (type.equals("email")) {
                        view.setLinkifyMask(2);
                        return;
                    }
                    break;
            }
        }
        view.setLinkifyMask(0);
    }

    @ReactProp(defaultBoolean = false, name = "disabled")
    public final void setDisabled(@NotNull ReactTextView view, boolean disabled) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setEnabled(!disabled);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
    
        if (r3.equals("tail") == false) goto L22;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @com.facebook.react.uimanager.annotations.ReactProp(name = com.facebook.react.uimanager.ViewProps.ELLIPSIZE_MODE)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setEllipsizeMode(@org.jetbrains.annotations.NotNull com.facebook.react.views.text.ReactTextView r2, java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            if (r3 == 0) goto L54
            int r0 = r3.hashCode()
            switch(r0) {
                case -1074341483: goto L35;
                case 3056464: goto L27;
                case 3198432: goto L18;
                case 3552336: goto Lf;
                default: goto Le;
            }
        Le:
            goto L3d
        Lf:
            java.lang.String r0 = "tail"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L54
            goto L3d
        L18:
            java.lang.String r0 = "head"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L21
            goto L3d
        L21:
            android.text.TextUtils$TruncateAt r3 = android.text.TextUtils.TruncateAt.START
            r2.setEllipsizeLocation(r3)
            return
        L27:
            java.lang.String r0 = "clip"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L30
            goto L3d
        L30:
            r3 = 0
            r2.setEllipsizeLocation(r3)
            return
        L35:
            java.lang.String r0 = "middle"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L4e
        L3d:
            java.lang.String r0 = "Invalid ellipsizeMode: "
            java.lang.String r3 = r0.concat(r3)
            java.lang.String r0 = "ReactNative"
            o8.a.v(r0, r3)
            android.text.TextUtils$TruncateAt r3 = android.text.TextUtils.TruncateAt.END
            r2.setEllipsizeLocation(r3)
            return
        L4e:
            android.text.TextUtils$TruncateAt r3 = android.text.TextUtils.TruncateAt.MIDDLE
            r2.setEllipsizeLocation(r3)
            return
        L54:
            android.text.TextUtils$TruncateAt r3 = android.text.TextUtils.TruncateAt.END
            r2.setEllipsizeLocation(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.text.ReactTextViewManager.setEllipsizeMode(com.facebook.react.views.text.ReactTextView, java.lang.String):void");
    }

    @ReactProp(name = ViewProps.FONT_SIZE)
    public final void setFontSize(@NotNull ReactTextView view, float fontSize) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setFontSize(fontSize);
    }

    @ReactProp(defaultBoolean = true, name = ViewProps.INCLUDE_FONT_PADDING)
    public final void setIncludeFontPadding(@NotNull ReactTextView view, boolean includepad) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setIncludeFontPadding(includepad);
    }

    @ReactProp(defaultFloat = 0.0f, name = ViewProps.LETTER_SPACING)
    public final void setLetterSpacing(@NotNull ReactTextView view, float letterSpacing) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setLetterSpacing(letterSpacing);
    }

    @ReactProp(defaultInt = Integer.MAX_VALUE, name = ViewProps.NUMBER_OF_LINES)
    public final void setNumberOfLines(@NotNull ReactTextView view, int numberOfLines) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setNumberOfLines(numberOfLines);
    }

    @ReactProp(name = ViewProps.OVERFLOW)
    public final void setOverflow(@NotNull ReactTextView view, String overflow) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setOverflow(overflow);
    }

    public final void setReactTextViewManagerCallback(ReactTextViewManagerCallback reactTextViewManagerCallback) {
        this.reactTextViewManagerCallback = reactTextViewManagerCallback;
    }

    @ReactProp(name = "selectable")
    public final void setSelectable(@NotNull ReactTextView view, boolean isSelectable) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setTextIsSelectable(isSelectable);
    }

    @ReactProp(customType = "Color", name = "selectionColor")
    public final void setSelectionColor(@NotNull ReactTextView view, Integer color) {
        int defaultTextColorHighlight;
        Intrinsics.checkNotNullParameter(view, "view");
        if (color != null) {
            defaultTextColorHighlight = color.intValue();
        } else {
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            defaultTextColorHighlight = DefaultStyleValuesUtil.getDefaultTextColorHighlight(context);
        }
        view.setHighlightColor(defaultTextColorHighlight);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        if (r4.equals("auto") == false) goto L22;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @com.facebook.react.uimanager.annotations.ReactProp(name = com.facebook.react.uimanager.ViewProps.TEXT_ALIGN_VERTICAL)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setTextAlignVertical(@org.jetbrains.annotations.NotNull com.facebook.react.views.text.ReactTextView r3, java.lang.String r4) {
        /*
            r2 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            if (r4 == 0) goto L54
            int r1 = r4.hashCode()
            switch(r1) {
                case -1383228885: goto L37;
                case -1364013995: goto L28;
                case 115029: goto L19;
                case 3005871: goto L10;
                default: goto Lf;
            }
        Lf:
            goto L3f
        L10:
            java.lang.String r1 = "auto"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L54
            goto L3f
        L19:
            java.lang.String r1 = "top"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L22
            goto L3f
        L22:
            r4 = 48
            r3.setGravityVertical(r4)
            return
        L28:
            java.lang.String r1 = "center"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L31
            goto L3f
        L31:
            r4 = 16
            r3.setGravityVertical(r4)
            return
        L37:
            java.lang.String r1 = "bottom"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L4e
        L3f:
            java.lang.String r1 = "Invalid textAlignVertical: "
            java.lang.String r4 = r1.concat(r4)
            java.lang.String r1 = "ReactNative"
            o8.a.v(r1, r4)
            r3.setGravityVertical(r0)
            return
        L4e:
            r4 = 80
            r3.setGravityVertical(r4)
            return
        L54:
            r3.setGravityVertical(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.text.ReactTextViewManager.setTextAlignVertical(com.facebook.react.views.text.ReactTextView, java.lang.String):void");
    }

    public /* synthetic */ ReactTextViewManager(ReactTextViewManagerCallback reactTextViewManagerCallback, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : reactTextViewManagerCallback);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public LayoutShadowNode createShadowNodeInstance() {
        return new LayoutShadowNode();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public ReactTextView createViewInstance(@NotNull ThemedReactContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new ReactTextView(context);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(@NotNull ReactTextView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onAfterUpdateTransaction(view);
        view.updateView();
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public ReactTextView prepareToRecycleView(@NotNull ThemedReactContext reactContext, @NotNull ReactTextView view) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(view, "view");
        ReactTextView reactTextView = (ReactTextView) super.prepareToRecycleView(reactContext, view);
        if (reactTextView != null) {
            reactTextView.recycleView();
            setSelectionColor(reactTextView, null);
        }
        return reactTextView;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void setPadding(@NotNull ReactTextView view, int left, int top, int right, int bottom) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setPadding(left, top, right, bottom);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(@NotNull ReactTextView view, @NotNull Object extraData) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        SystraceSection systraceSection = new SystraceSection("ReactTextViewManager.updateExtraData");
        try {
            ReactTextUpdate reactTextUpdate = (ReactTextUpdate) extraData;
            Spanned text = reactTextUpdate.getText();
            view.setText(reactTextUpdate);
            ReactTextViewAccessibilityDelegate.AccessibilityLinks accessibilityLinks = new ReactTextViewAccessibilityDelegate.AccessibilityLinks(text);
            int i7 = R.id.accessibility_links;
            if (accessibilityLinks.size() <= 0) {
                accessibilityLinks = null;
            }
            view.setTag(i7, accessibilityLinks);
            ReactTextViewAccessibilityDelegate.INSTANCE.resetDelegate(view, view.isFocusable(), view.getImportantForAccessibility());
            Unit unit = Unit.f14616a;
            c.i(systraceSection, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                c.i(systraceSection, th2);
                throw th3;
            }
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(@NotNull ReactTextView view, @NotNull ReactStylesDiffMap props, @NotNull StateWrapper stateWrapper) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(props, "props");
        Intrinsics.checkNotNullParameter(stateWrapper, "stateWrapper");
        SystraceSection systraceSection = new SystraceSection("ReactTextViewManager.updateState");
        try {
            ReferenceStateWrapper referenceStateWrapper = stateWrapper instanceof ReferenceStateWrapper ? (ReferenceStateWrapper) stateWrapper : null;
            Object stateDataReference = referenceStateWrapper != null ? referenceStateWrapper.getStateDataReference() : null;
            if (stateDataReference instanceof PreparedLayout) {
                ReactTextUpdate reactTextUpdateFromPreparedLayout = getReactTextUpdateFromPreparedLayout(view, (PreparedLayout) stateDataReference);
                c.i(systraceSection, null);
                return reactTextUpdateFromPreparedLayout;
            }
            ReadableMapBuffer stateDataMapBuffer = stateWrapper.getStateDataMapBuffer();
            Object reactTextUpdate = stateDataMapBuffer != null ? getReactTextUpdate(view, props, stateDataMapBuffer) : null;
            c.i(systraceSection, null);
            return reactTextUpdate;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                c.i(systraceSection, th2);
                throw th3;
            }
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    public void updateViewAccessibility(@NotNull ReactTextView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ReactTextViewAccessibilityDelegate.INSTANCE.setDelegate(view, view.isFocusable(), view.getImportantForAccessibility());
    }

    public ReactTextViewManager(ReactTextViewManagerCallback reactTextViewManagerCallback) {
        this.reactTextViewManagerCallback = reactTextViewManagerCallback;
        if (ReactNativeFeatureFlags.enableViewRecyclingForText()) {
            setupViewRecycling();
        }
    }

    @NotNull
    public final LayoutShadowNode createShadowNodeInstance(ReactTextViewManagerCallback reactTextViewManagerCallback) {
        return new LayoutShadowNode();
    }
}
