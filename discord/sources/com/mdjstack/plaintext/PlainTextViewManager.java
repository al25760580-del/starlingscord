package com.mdjstack.plaintext;

import android.content.Context;
import android.view.View;
import bl.e;
import bl.g;
import bl.h;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.RNPlainTextManagerInterface;
import com.facebook.yoga.YogaMeasureMode;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import zs.a;

/* JADX INFO: loaded from: classes3.dex */
@ReactModule(name = PlainTextViewManager.NAME)
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 s2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001tB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J7\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001c\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\tH\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010\u001f\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u0014H\u0017¢\u0006\u0004\b\u001f\u0010 J!\u0010#\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0006\u0010\"\u001a\u00020!H\u0017¢\u0006\u0004\b#\u0010$J#\u0010&\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\u0010%\u001a\u0004\u0018\u00010\tH\u0017¢\u0006\u0004\b&\u0010\u001dJ#\u0010(\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\u0010'\u001a\u0004\u0018\u00010\tH\u0017¢\u0006\u0004\b(\u0010\u001dJ#\u0010*\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\u0010)\u001a\u0004\u0018\u00010\tH\u0017¢\u0006\u0004\b*\u0010\u001dJ#\u0010-\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\u0010,\u001a\u0004\u0018\u00010+H\u0017¢\u0006\u0004\b-\u0010.J#\u00100\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\u0010/\u001a\u0004\u0018\u00010\tH\u0017¢\u0006\u0004\b0\u0010\u001dJ#\u00102\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\u00101\u001a\u0004\u0018\u00010\tH\u0017¢\u0006\u0004\b2\u0010\u001dJ#\u00104\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\u00103\u001a\u0004\u0018\u00010\tH\u0017¢\u0006\u0004\b4\u0010\u001dJ#\u00106\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\u00105\u001a\u0004\u0018\u00010\tH\u0017¢\u0006\u0004\b6\u0010\u001dJ#\u00108\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\u00107\u001a\u0004\u0018\u00010\tH\u0017¢\u0006\u0004\b8\u0010\u001dJ!\u0010:\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0006\u00109\u001a\u00020!H\u0017¢\u0006\u0004\b:\u0010$J!\u0010<\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0006\u0010;\u001a\u00020!H\u0017¢\u0006\u0004\b<\u0010$J!\u0010?\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0006\u0010>\u001a\u00020=H\u0017¢\u0006\u0004\b?\u0010@J!\u0010B\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0006\u0010A\u001a\u00020\u0014H\u0017¢\u0006\u0004\bB\u0010CJ#\u0010E\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\u0010D\u001a\u0004\u0018\u00010\tH\u0017¢\u0006\u0004\bE\u0010\u001dJ!\u0010G\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0006\u0010F\u001a\u00020=H\u0017¢\u0006\u0004\bG\u0010@J!\u0010I\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0006\u0010H\u001a\u00020!H\u0017¢\u0006\u0004\bI\u0010$J!\u0010K\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0006\u0010J\u001a\u00020=H\u0017¢\u0006\u0004\bK\u0010@J!\u0010M\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0006\u0010L\u001a\u00020=H\u0017¢\u0006\u0004\bM\u0010@J!\u0010O\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0006\u0010N\u001a\u00020=H\u0017¢\u0006\u0004\bO\u0010@J_\u0010]\u001a\u00020\\2\u0006\u0010\r\u001a\u00020P2\b\u0010R\u001a\u0004\u0018\u00010Q2\b\u0010S\u001a\u0004\u0018\u00010Q2\b\u0010T\u001a\u0004\u0018\u00010Q2\u0006\u0010U\u001a\u00020!2\u0006\u0010W\u001a\u00020V2\u0006\u0010X\u001a\u00020!2\u0006\u0010Y\u001a\u00020V2\b\u0010[\u001a\u0004\u0018\u00010ZH\u0016¢\u0006\u0004\b]\u0010^J%\u0010a\u001a\u00020=*\u0004\u0018\u00010Q2\u0006\u0010_\u001a\u00020\t2\u0006\u0010`\u001a\u00020=H\u0002¢\u0006\u0004\ba\u0010bJ%\u0010c\u001a\u00020\u0014*\u0004\u0018\u00010Q2\u0006\u0010_\u001a\u00020\t2\u0006\u0010`\u001a\u00020\u0014H\u0002¢\u0006\u0004\bc\u0010dJ%\u0010e\u001a\u00020!*\u0004\u0018\u00010Q2\u0006\u0010_\u001a\u00020\t2\u0006\u0010`\u001a\u00020!H\u0002¢\u0006\u0004\be\u0010fJ\u0017\u0010g\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020PH\u0002¢\u0006\u0004\bg\u0010hJ\u001f\u0010k\u001a\u00020\u00142\u0006\u0010i\u001a\u00020!2\u0006\u0010j\u001a\u00020VH\u0002¢\u0006\u0004\bk\u0010lR\u001a\u0010m\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR \u0010q\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020p0o8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010r¨\u0006u"}, d2 = {"Lcom/mdjstack/plaintext/PlainTextViewManager;", "Lcom/facebook/react/uimanager/SimpleViewManager;", "Lbl/e;", "Lcom/facebook/react/viewmanagers/RNPlainTextManagerInterface;", "<init>", "()V", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "getDelegate", "()Lcom/facebook/react/uimanager/ViewManagerDelegate;", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/ThemedReactContext;", "context", "createViewInstance", "(Lcom/facebook/react/uimanager/ThemedReactContext;)Lbl/e;", "view", "", "onAfterUpdateTransaction", "(Lbl/e;)V", "", ViewProps.LEFT, ViewProps.TOP, ViewProps.RIGHT, ViewProps.BOTTOM, "setPadding", "(Lbl/e;IIII)V", "text", "setText", "(Lbl/e;Ljava/lang/String;)V", ViewProps.COLOR, "setColor", "(Lbl/e;Ljava/lang/Integer;)V", "", ViewProps.FONT_SIZE, "setFontSize", "(Lbl/e;F)V", ViewProps.FONT_FAMILY, "setFontFamily", ViewProps.FONT_WEIGHT, "setFontWeight", ViewProps.FONT_STYLE, "setFontStyle", "Lcom/facebook/react/bridge/ReadableArray;", ViewProps.FONT_VARIANT, "setFontVariant", "(Lbl/e;Lcom/facebook/react/bridge/ReadableArray;)V", "fontVariationSettings", "setFontVariationSettings", ViewProps.TEXT_ALIGN, "setTextAlign", ViewProps.TEXT_ALIGN_VERTICAL, "setTextAlignVertical", ViewProps.TEXT_DECORATION_LINE, "setTextDecorationLine", "textTransform", "setTextTransform", ViewProps.LINE_HEIGHT, "setLineHeight", ViewProps.LETTER_SPACING, "setLetterSpacing", "", "hasLetterSpacing", "setHasLetterSpacing", "(Lbl/e;Z)V", ViewProps.NUMBER_OF_LINES, "setNumberOfLines", "(Lbl/e;I)V", ViewProps.ELLIPSIZE_MODE, "setEllipsizeMode", ViewProps.ALLOW_FONT_SCALING, "setAllowFontScaling", ViewProps.MAX_FONT_SIZE_MULTIPLIER, "setMaxFontSizeMultiplier", ViewProps.INCLUDE_FONT_PADDING, "setIncludeFontPadding", "experiment", "setExperiment", "lineHeightClippingIos", "setLineHeightClippingIos", "Landroid/content/Context;", "Lcom/facebook/react/bridge/ReadableMap;", "localData", "props", "state", "width", "Lcom/facebook/yoga/YogaMeasureMode;", "widthMode", "height", "heightMode", "", "attachmentsPositions", "", "measure", "(Landroid/content/Context;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/ReadableMap;FLcom/facebook/yoga/YogaMeasureMode;FLcom/facebook/yoga/YogaMeasureMode;[F)J", StackTraceHelper.NAME_KEY, "default", "getBooleanOr", "(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;Z)Z", "getIntOr", "(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;I)I", "getFloatOr", "(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;F)F", "measureView", "(Landroid/content/Context;)Lbl/e;", "size", "mode", "toMeasureSpec", "(FLcom/facebook/yoga/YogaMeasureMode;)I", "mDelegate", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "Ljava/lang/ThreadLocal;", "Ljava/lang/ref/WeakReference;", "measureViews", "Ljava/lang/ThreadLocal;", "Companion", "bl/g", "react-native-plain-text_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPlainTextViewManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlainTextViewManager.kt\ncom/mdjstack/plaintext/PlainTextViewManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,308:1\n1#2:309\n*E\n"})
public final class PlainTextViewManager extends SimpleViewManager<e> implements RNPlainTextManagerInterface<e> {

    @NotNull
    private static final String BASELINE_QUERY_PROP = "__baseline";

    @NotNull
    public static final g Companion = new g();

    @NotNull
    public static final String NAME = "RNPlainText";

    @NotNull
    private final ViewManagerDelegate<e> mDelegate = new h(this);

    @NotNull
    private final ThreadLocal<WeakReference<e>> measureViews = new ThreadLocal<>();

    private final boolean getBooleanOr(ReadableMap readableMap, String str, boolean z5) {
        return (readableMap == null || !readableMap.hasKey(str)) ? z5 : readableMap.getBoolean(str);
    }

    private final float getFloatOr(ReadableMap readableMap, String str, float f2) {
        return (readableMap == null || !readableMap.hasKey(str)) ? f2 : (float) readableMap.getDouble(str);
    }

    private final int getIntOr(ReadableMap readableMap, String str, int i7) {
        return (readableMap == null || !readableMap.hasKey(str)) ? i7 : readableMap.getInt(str);
    }

    private final e measureView(Context context) {
        e eVar;
        WeakReference<e> weakReference = this.measureViews.get();
        if (weakReference != null && (eVar = weakReference.get()) != null && eVar.getContext() == context) {
            return eVar;
        }
        e eVar2 = new e(context);
        eVar2.setMeasureOnly$react_native_plain_text_release(true);
        this.measureViews.set(new WeakReference<>(eVar2));
        return eVar2;
    }

    private final int toMeasureSpec(float size, YogaMeasureMode mode) {
        int iOrdinal = mode.ordinal();
        if (iOrdinal != 1) {
            return iOrdinal != 2 ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec((int) size, Integer.MIN_VALUE);
        }
        return View.MeasureSpec.makeMeasureSpec((int) size, 1073741824);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ViewManagerDelegate<e> getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public long measure(@NotNull Context context, ReadableMap localData, ReadableMap props, ReadableMap state, float width, @NotNull YogaMeasureMode widthMode, float height, @NotNull YogaMeasureMode heightMode, float[] attachmentsPositions) {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(widthMode, "widthMode");
        Intrinsics.checkNotNullParameter(heightMode, "heightMode");
        e eVarMeasureView = measureView(context);
        eVarMeasureView.setAllowFontScaling(getBooleanOr(props, ViewProps.ALLOW_FONT_SCALING, true));
        eVarMeasureView.setMaxFontSizeMultiplier(getFloatOr(props, ViewProps.MAX_FONT_SIZE_MULTIPLIER, 0.0f));
        eVarMeasureView.setFontSizeSp(getFloatOr(props, ViewProps.FONT_SIZE, 14.0f));
        if (props == null || (string = props.getString(ViewProps.FONT_FAMILY)) == null || string.length() == 0) {
            string = null;
        }
        eVarMeasureView.setFontFamily(string);
        if (props == null || (string2 = props.getString(ViewProps.FONT_WEIGHT)) == null || string2.length() == 0) {
            string2 = null;
        }
        eVarMeasureView.setFontWeight(string2);
        if (props == null || (string3 = props.getString(ViewProps.FONT_STYLE)) == null || string3.length() == 0) {
            string3 = null;
        }
        eVarMeasureView.setFontStyle(string3);
        eVarMeasureView.setFontVariant(props != null ? props.getArray(ViewProps.FONT_VARIANT) : null);
        if (props == null || (string4 = props.getString("fontVariationSettings")) == null || string4.length() == 0) {
            string4 = null;
        }
        eVarMeasureView.setVariationSettings(string4);
        eVarMeasureView.setLetterSpacingDip(getFloatOr(props, ViewProps.LETTER_SPACING, 0.0f));
        eVarMeasureView.setLineHeight(getFloatOr(props, ViewProps.LINE_HEIGHT, 0.0f));
        eVarMeasureView.setTextTransform(props != null ? props.getString("textTransform") : null);
        eVarMeasureView.setNumberOfLines(getIntOr(props, ViewProps.NUMBER_OF_LINES, 0));
        eVarMeasureView.setIncludeFontPadding(getBooleanOr(props, ViewProps.INCLUDE_FONT_PADDING, true));
        if (props == null || (string5 = props.getString("text")) == null) {
            string5 = "";
        }
        eVarMeasureView.setPlainText(string5);
        eVarMeasureView.d();
        eVarMeasureView.measure(toMeasureSpec(width, widthMode), toMeasureSpec(height, heightMode));
        return (props == null || !props.hasKey(BASELINE_QUERY_PROP)) ? a.I(PixelUtil.toDIPFromPixel(eVarMeasureView.getMeasuredWidth()), PixelUtil.toDIPFromPixel(eVarMeasureView.getMeasuredHeight())) : a.I(0.0f, PixelUtil.toDIPFromPixel(eVarMeasureView.getBaseline()));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public e createViewInstance(@NotNull ThemedReactContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new e(context);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(@NotNull e view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onAfterUpdateTransaction(view);
        view.d();
    }

    @Override // com.facebook.react.viewmanagers.RNPlainTextManagerInterface
    @ReactProp(defaultBoolean = true, name = ViewProps.ALLOW_FONT_SCALING)
    public void setAllowFontScaling(e view, boolean allowFontScaling) {
        if (view != null) {
            view.setAllowFontScaling(allowFontScaling);
        }
    }

    @Override // com.facebook.react.viewmanagers.RNPlainTextManagerInterface
    @ReactProp(customType = "Color", name = ViewProps.COLOR)
    public void setColor(e view, Integer color) {
        if (view != null) {
            view.setColor(color);
        }
    }

    @Override // com.facebook.react.viewmanagers.RNPlainTextManagerInterface
    @ReactProp(name = ViewProps.ELLIPSIZE_MODE)
    public void setEllipsizeMode(e view, String ellipsizeMode) {
        if (view != null) {
            view.setEllipsizeMode(ellipsizeMode);
        }
    }

    @Override // com.facebook.react.viewmanagers.RNPlainTextManagerInterface
    @ReactProp(defaultBoolean = false, name = "experiment")
    public void setExperiment(e view, boolean experiment) {
    }

    @Override // com.facebook.react.viewmanagers.RNPlainTextManagerInterface
    @ReactProp(name = ViewProps.FONT_FAMILY)
    public void setFontFamily(e view, String fontFamily) {
        if (view != null) {
            view.setFontFamily(fontFamily);
        }
    }

    @Override // com.facebook.react.viewmanagers.RNPlainTextManagerInterface
    @ReactProp(name = ViewProps.FONT_SIZE)
    public void setFontSize(e view, float fontSize) {
        if (view != null) {
            view.setFontSizeSp(fontSize);
        }
    }

    @Override // com.facebook.react.viewmanagers.RNPlainTextManagerInterface
    @ReactProp(name = ViewProps.FONT_STYLE)
    public void setFontStyle(e view, String fontStyle) {
        if (view != null) {
            view.setFontStyle(fontStyle);
        }
    }

    @Override // com.facebook.react.viewmanagers.RNPlainTextManagerInterface
    @ReactProp(name = ViewProps.FONT_VARIANT)
    public void setFontVariant(e view, ReadableArray fontVariant) {
        if (view != null) {
            view.setFontVariant(fontVariant);
        }
    }

    @Override // com.facebook.react.viewmanagers.RNPlainTextManagerInterface
    @ReactProp(name = "fontVariationSettings")
    public void setFontVariationSettings(e view, String fontVariationSettings) {
        if (view != null) {
            view.setVariationSettings(fontVariationSettings);
        }
    }

    @Override // com.facebook.react.viewmanagers.RNPlainTextManagerInterface
    @ReactProp(name = ViewProps.FONT_WEIGHT)
    public void setFontWeight(e view, String fontWeight) {
        if (view != null) {
            view.setFontWeight(fontWeight);
        }
    }

    @Override // com.facebook.react.viewmanagers.RNPlainTextManagerInterface
    @ReactProp(defaultBoolean = false, name = "hasLetterSpacing")
    public void setHasLetterSpacing(e view, boolean hasLetterSpacing) {
    }

    @Override // com.facebook.react.viewmanagers.RNPlainTextManagerInterface
    @ReactProp(defaultBoolean = true, name = ViewProps.INCLUDE_FONT_PADDING)
    public void setIncludeFontPadding(e view, boolean includeFontPadding) {
        if (view != null) {
            view.setIncludeFontPadding(includeFontPadding);
        }
    }

    @Override // com.facebook.react.viewmanagers.RNPlainTextManagerInterface
    @ReactProp(name = ViewProps.LETTER_SPACING)
    public void setLetterSpacing(e view, float letterSpacing) {
        if (view != null) {
            view.setLetterSpacingDip(letterSpacing);
        }
    }

    @Override // com.facebook.react.viewmanagers.RNPlainTextManagerInterface
    @ReactProp(name = ViewProps.LINE_HEIGHT)
    public void setLineHeight(e view, float lineHeight) {
        if (view != null) {
            view.setLineHeight(lineHeight);
        }
    }

    @Override // com.facebook.react.viewmanagers.RNPlainTextManagerInterface
    @ReactProp(defaultBoolean = false, name = "lineHeightClippingIos")
    public void setLineHeightClippingIos(e view, boolean lineHeightClippingIos) {
    }

    @Override // com.facebook.react.viewmanagers.RNPlainTextManagerInterface
    @ReactProp(name = ViewProps.MAX_FONT_SIZE_MULTIPLIER)
    public void setMaxFontSizeMultiplier(e view, float maxFontSizeMultiplier) {
        if (view != null) {
            view.setMaxFontSizeMultiplier(maxFontSizeMultiplier);
        }
    }

    @Override // com.facebook.react.viewmanagers.RNPlainTextManagerInterface
    @ReactProp(name = ViewProps.NUMBER_OF_LINES)
    public void setNumberOfLines(e view, int numberOfLines) {
        if (view != null) {
            view.setNumberOfLines(numberOfLines);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void setPadding(@NotNull e view, int left, int top, int right, int bottom) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setPadding(left, top, right, bottom);
    }

    @Override // com.facebook.react.viewmanagers.RNPlainTextManagerInterface
    @ReactProp(name = "text")
    public void setText(e view, String text) {
        if (view != null) {
            view.setPlainText(text);
        }
    }

    @Override // com.facebook.react.viewmanagers.RNPlainTextManagerInterface
    @ReactProp(name = ViewProps.TEXT_ALIGN)
    public void setTextAlign(e view, String textAlign) {
        if (view != null) {
            view.setTextAlign(textAlign);
        }
    }

    @Override // com.facebook.react.viewmanagers.RNPlainTextManagerInterface
    @ReactProp(name = ViewProps.TEXT_ALIGN_VERTICAL)
    public void setTextAlignVertical(e view, String textAlignVertical) {
        if (view != null) {
            view.setTextAlignVertical(textAlignVertical);
        }
    }

    @Override // com.facebook.react.viewmanagers.RNPlainTextManagerInterface
    @ReactProp(name = ViewProps.TEXT_DECORATION_LINE)
    public void setTextDecorationLine(e view, String textDecorationLine) {
        if (view != null) {
            view.setTextDecorationLine(textDecorationLine);
        }
    }

    @Override // com.facebook.react.viewmanagers.RNPlainTextManagerInterface
    @ReactProp(name = "textTransform")
    public void setTextTransform(e view, String textTransform) {
        if (view != null) {
            view.setTextTransform(textTransform);
        }
    }
}
