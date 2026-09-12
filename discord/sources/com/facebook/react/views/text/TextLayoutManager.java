package com.facebook.react.views.text;

import android.content.res.AssetManager;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.LeadingMarginSpan;
import com.discord.sticker.sticker_types.c;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.common.mapbuffer.MapBuffer;
import com.facebook.react.common.mapbuffer.ReadableMapBuffer;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.uimanager.DisplayMetricsHolder;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ReactAccessibilityDelegate;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.text.internal.span.CustomLetterSpacingSpan;
import com.facebook.react.views.text.internal.span.CustomLineHeightSpan;
import com.facebook.react.views.text.internal.span.CustomStyleSpan;
import com.facebook.react.views.text.internal.span.LinearGradientSpan;
import com.facebook.react.views.text.internal.span.ReactAbsoluteSizeSpan;
import com.facebook.react.views.text.internal.span.ReactBackgroundColorSpan;
import com.facebook.react.views.text.internal.span.ReactClickableSpan;
import com.facebook.react.views.text.internal.span.ReactForegroundColorSpan;
import com.facebook.react.views.text.internal.span.ReactFragmentIndexSpan;
import com.facebook.react.views.text.internal.span.ReactLinkSpan;
import com.facebook.react.views.text.internal.span.ReactOpacitySpan;
import com.facebook.react.views.text.internal.span.ReactStrikethroughSpan;
import com.facebook.react.views.text.internal.span.ReactTagSpan;
import com.facebook.react.views.text.internal.span.ReactTextPaintHolderSpan;
import com.facebook.react.views.text.internal.span.ReactUnderlineSpan;
import com.facebook.react.views.text.internal.span.SetSpanOperation;
import com.facebook.react.views.text.internal.span.ShadowStyleSpan;
import com.facebook.react.views.text.internal.span.StrokeStyleSpan;
import com.facebook.react.views.text.internal.span.TextInlineViewPlaceholderSpan;
import com.facebook.yoga.YogaMeasureMode;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import rn.l;
import rn.n;
import zs.a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000à\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001:\u0006\u0087\u0001\u0088\u0001\u0089\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u00052\u0006\u0010-\u001a\u00020#J\u000e\u0010.\u001a\u00020+2\u0006\u0010,\u001a\u00020\u0005J\u000e\u0010/\u001a\u00020\u001f2\u0006\u00100\u001a\u000201J\u0012\u00102\u001a\u0004\u0018\u00010\u001a2\u0006\u00100\u001a\u000201H\u0002J\u0012\u00103\u001a\u00020\u00052\b\u00104\u001a\u0004\u0018\u00010\u001aH\u0002J\"\u00105\u001a\u0002062\u0006\u00100\u001a\u0002012\u0006\u00107\u001a\u00020#2\b\u00104\u001a\u0004\u0018\u00010\u001aH\u0002J\u0018\u00108\u001a\u00020\u00052\u0006\u00100\u001a\u0002012\u0006\u00107\u001a\u00020#H\u0007J8\u00109\u001a\u00020+2\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u0002012\u0006\u0010=\u001a\u00020>2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020A0@2\b\u0010B\u001a\u0004\u0018\u00010CH\u0002J\"\u0010D\u001a\u00020#2\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u0002012\b\u0010B\u001a\u0004\u0018\u00010CH\u0002J\u0010\u0010E\u001a\u00020+2\u0006\u0010F\u001a\u00020#H\u0002J \u0010G\u001a\u00020#2\u0006\u0010:\u001a\u00020;2\u0006\u00100\u001a\u0002012\b\u0010H\u001a\u0004\u0018\u00010IJ,\u0010J\u001a\u00020#2\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u0002012\b\u0010H\u001a\u0004\u0018\u00010I2\b\u0010B\u001a\u0004\u0018\u00010CH\u0002Jl\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020#2\b\u0010N\u001a\u0004\u0018\u00010O2\u0006\u0010P\u001a\u00020Q2\u0006\u0010R\u001a\u00020S2\u0006\u0010T\u001a\u00020\u001f2\u0006\u0010U\u001a\u00020\u00052\u0006\u0010V\u001a\u00020\u00052\u0006\u0010W\u001a\u0002062\u0006\u0010X\u001a\u00020\u00052\b\u0010Y\u001a\u0004\u0018\u00010Z2\u0006\u0010[\u001a\u00020\u00052\u0006\u0010\\\u001a\u00020\u001dH\u0002JZ\u0010]\u001a\u00020L2\u0006\u0010M\u001a\u00020#2\u0006\u0010^\u001a\u00020\u00052\u0006\u0010T\u001a\u00020\u001f2\u0006\u0010U\u001a\u00020\u00052\u0006\u0010V\u001a\u00020\u00052\u0006\u0010W\u001a\u0002062\u0006\u0010X\u001a\u00020\u00052\b\u0010Y\u001a\u0004\u0018\u00010Z2\u0006\u0010[\u001a\u00020\u00052\u0006\u0010\\\u001a\u00020\u001dH\u0002J \u0010_\u001a\u00020+2\u0006\u0010\\\u001a\u00020\u001d2\u0006\u0010`\u001a\u00020a2\u0006\u0010:\u001a\u00020;H\u0002J\u0018\u0010b\u001a\u00020\u001d2\u0006\u0010`\u001a\u00020a2\u0006\u0010:\u001a\u00020;H\u0002J\u0018\u0010c\u001a\u00020\u001d2\u0006\u0010`\u001a\u00020a2\u0006\u0010:\u001a\u00020;H\u0002JJ\u0010d\u001a\u00020L2\u0006\u0010:\u001a\u00020;2\u0006\u00100\u001a\u0002012\u0006\u0010e\u001a\u0002012\u0006\u0010P\u001a\u00020Q2\u0006\u0010R\u001a\u00020S2\u0006\u0010f\u001a\u00020Q2\u0006\u0010g\u001a\u00020S2\b\u0010H\u001a\u0004\u0018\u00010IH\u0002JH\u0010K\u001a\u00020h2\u0006\u0010M\u001a\u00020#2\u0006\u0010\\\u001a\u00020\u001d2\u0006\u00100\u001a\u0002012\u0006\u0010e\u001a\u0002012\u0006\u0010P\u001a\u00020Q2\u0006\u0010R\u001a\u00020S2\u0006\u0010f\u001a\u00020Q2\u0006\u0010g\u001a\u00020SH\u0002JJ\u0010i\u001a\u00020j2\u0006\u0010:\u001a\u00020;2\u0006\u00100\u001a\u00020k2\u0006\u0010e\u001a\u00020k2\u0006\u0010P\u001a\u00020Q2\u0006\u0010R\u001a\u00020S2\u0006\u0010f\u001a\u00020Q2\u0006\u0010g\u001a\u00020S2\b\u0010H\u001a\u0004\u0018\u00010IH\u0007Jp\u0010l\u001a\u00020+2\u0006\u0010M\u001a\u00020#2\u0006\u0010P\u001a\u00020Q2\u0006\u0010R\u001a\u00020S2\u0006\u0010f\u001a\u00020Q2\u0006\u0010g\u001a\u00020S2\u0006\u0010m\u001a\u00020Q2\u0006\u0010n\u001a\u00020\u00052\u0006\u0010T\u001a\u00020\u001f2\u0006\u0010U\u001a\u00020\u00052\u0006\u0010V\u001a\u00020\u00052\u0006\u0010W\u001a\u0002062\u0006\u0010X\u001a\u00020\u00052\u0006\u0010\\\u001a\u00020\u001dH\u0007JT\u0010o\u001a\u00020p2\u0006\u0010:\u001a\u00020;2\u0006\u00100\u001a\u0002012\u0006\u0010e\u001a\u0002012\u0006\u0010P\u001a\u00020Q2\u0006\u0010R\u001a\u00020S2\u0006\u0010f\u001a\u00020Q2\u0006\u0010g\u001a\u00020S2\b\u0010H\u001a\u0004\u0018\u00010I2\b\u0010q\u001a\u0004\u0018\u00010rH\u0007J0\u0010s\u001a\u00020r2\u0006\u0010t\u001a\u00020j2\u0006\u0010P\u001a\u00020Q2\u0006\u0010R\u001a\u00020S2\u0006\u0010f\u001a\u00020Q2\u0006\u0010g\u001a\u00020SH\u0007J0\u0010u\u001a\u00020Q2\u0006\u0010v\u001a\u00020L2\u0006\u0010e\u001a\u00020k2\u0006\u0010f\u001a\u00020Q2\u0006\u0010w\u001a\u00020S2\u0006\u0010n\u001a\u00020\u0005H\u0002J\u0018\u0010x\u001a\u00020\u00052\u0006\u0010v\u001a\u00020L2\u0006\u0010n\u001a\u00020\u0005H\u0002J0\u0010y\u001a\u00020Q2\u0006\u0010v\u001a\u00020L2\u0006\u0010M\u001a\u00020z2\u0006\u0010P\u001a\u00020Q2\u0006\u0010R\u001a\u00020S2\u0006\u0010{\u001a\u00020\u0005H\u0002J(\u0010|\u001a\u00020Q2\u0006\u0010v\u001a\u00020L2\u0006\u0010f\u001a\u00020Q2\u0006\u0010g\u001a\u00020S2\u0006\u0010{\u001a\u00020\u0005H\u0002JC\u0010}\u001a\u00020\u00052\u0006\u0010v\u001a\u00020L2\u0006\u0010M\u001a\u00020z2\u0006\u0010~\u001a\u00020Q2\u0006\u0010{\u001a\u00020\u00052\u0006\u0010\u007f\u001a\u00020\u00052\u0007\u0010\u0080\u0001\u001a\u00020Q2\b\u0010\u0081\u0001\u001a\u00030\u0082\u0001H\u0002J=\u0010\u0083\u0001\u001a\u00030\u0084\u00012\u0007\u0010\u0085\u0001\u001a\u00020;2\u0006\u00100\u001a\u0002012\u0006\u0010e\u001a\u0002012\u0006\u0010P\u001a\u00020Q2\u0006\u0010f\u001a\u00020Q2\b\u0010H\u001a\u0004\u0018\u00010IH\u0007J\u001b\u0010\u0086\u0001\u001a\u0004\u0018\u00010O2\u0006\u0010M\u001a\u00020#2\u0006\u0010\\\u001a\u00020\u001dH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u001fX\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020#0\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010$\u001a\u0004\u0018\u00010%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b&\u0010'¨\u0006\u008a\u0001"}, d2 = {"Lcom/facebook/react/views/text/TextLayoutManager;", "", "<init>", "()V", "AS_KEY_HASH", "", "AS_KEY_STRING", "AS_KEY_FRAGMENTS", "AS_KEY_CACHE_ID", "AS_KEY_BASE_ATTRIBUTES", "FR_KEY_STRING", "FR_KEY_REACT_TAG", "FR_KEY_IS_ATTACHMENT", "FR_KEY_WIDTH", "FR_KEY_HEIGHT", "FR_KEY_TEXT_ATTRIBUTES", "PA_KEY_MAX_NUMBER_OF_LINES", "PA_KEY_ELLIPSIZE_MODE", "PA_KEY_TEXT_BREAK_STRATEGY", "PA_KEY_ADJUST_FONT_SIZE_TO_FIT", "PA_KEY_INCLUDE_FONT_PADDING", "PA_KEY_HYPHENATION_FREQUENCY", "PA_KEY_MINIMUM_FONT_SIZE", "PA_KEY_MAXIMUM_FONT_SIZE", "PA_KEY_TEXT_ALIGN_VERTICAL", "TAG", "", "textPaintInstance", "Ljava/lang/ThreadLocal;", "Landroid/text/TextPaint;", "DEFAULT_INCLUDE_FONT_PADDING", "", "DEFAULT_ADJUST_FONT_SIZE_TO_FIT", "tagToSpannableCache", "Ljava/util/concurrent/ConcurrentHashMap;", "Landroid/text/Spannable;", "setUseBoundsForWidthMethod", "Ljava/lang/reflect/Method;", "getSetUseBoundsForWidthMethod", "()Ljava/lang/reflect/Method;", "setUseBoundsForWidthMethod$delegate", "Lkotlin/Lazy;", "setCachedSpannableForTag", "", "reactTag", "sp", "deleteCachedSpannableForTag", "isRTL", "attributedString", "Lcom/facebook/react/common/mapbuffer/MapBuffer;", "getTextAlignmentAttr", "getTextJustificationMode", "alignmentAttr", "getTextAlignment", "Landroid/text/Layout$Alignment;", "spanned", "getTextGravity", "buildSpannableFromFragments", "assets", "Landroid/content/res/AssetManager;", "fragments", "sb", "Landroid/text/SpannableStringBuilder;", "ops", "", "Lcom/facebook/react/views/text/internal/span/SetSpanOperation;", "outputReactTags", "", "buildSpannableFromFragmentsOptimized", "addLeadingMarginForTextEffects", "spannable", "getOrCreateSpannableForText", "reactTextViewManagerCallback", "Lcom/facebook/react/views/text/ReactTextViewManagerCallback;", "createSpannableFromAttributedString", "createLayout", "Landroid/text/Layout;", "text", "boring", "Landroid/text/BoringLayout$Metrics;", "width", "", "widthYogaMeasureMode", "Lcom/facebook/yoga/YogaMeasureMode;", ViewProps.INCLUDE_FONT_PADDING, ViewProps.TEXT_BREAK_STRATEGY, "hyphenationFrequency", "alignment", "justificationMode", ViewProps.ELLIPSIZE_MODE, "Landroid/text/TextUtils$TruncateAt;", "maxNumberOfLines", "paint", "buildLayout", "layoutWidth", "updateTextPaint", "baseTextAttributes", "Lcom/facebook/react/views/text/TextAttributeProps;", "scratchPaintWithAttributes", "newPaintWithAttributes", "createLayoutForMeasurement", "paragraphAttributes", "height", "heightYogaMeasureMode", "Lcom/facebook/react/views/text/TextLayoutManager$CreateLayoutResult;", "createPreparedLayout", "Lcom/facebook/react/views/text/PreparedLayout;", "Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;", "adjustSpannableFontToFit", "minimumFontSizeAttr", "maximumNumberOfLines", "measureText", "", "attachmentsPositions", "", "measurePreparedLayout", "preparedLayout", "getVerticalOffset", "layout", "heightMeasureMode", "calculateLineCount", "calculateWidth", "Landroid/text/Spanned;", "calculatedLineCount", "calculateHeight", "nextAttachmentMetrics", "calculatedWidth", "i", "verticalOffset", "metrics", "Lcom/facebook/react/views/text/TextLayoutManager$AttachmentMetrics;", "measureLines", "Lcom/facebook/react/bridge/WritableArray;", "assetManager", "isBoring", "FragmentAttributes", "CreateLayoutResult", "AttachmentMetrics", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTextLayoutManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextLayoutManager.kt\ncom/facebook/react/views/text/TextLayoutManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1471:1\n1#2:1472\n*E\n"})
public final class TextLayoutManager {
    public static final int AS_KEY_BASE_ATTRIBUTES = 4;
    public static final int AS_KEY_CACHE_ID = 3;
    public static final int AS_KEY_FRAGMENTS = 2;
    public static final int AS_KEY_HASH = 0;
    public static final int AS_KEY_STRING = 1;
    private static final boolean DEFAULT_ADJUST_FONT_SIZE_TO_FIT = false;
    private static final boolean DEFAULT_INCLUDE_FONT_PADDING = true;
    public static final int FR_KEY_HEIGHT = 4;
    public static final int FR_KEY_IS_ATTACHMENT = 2;
    public static final int FR_KEY_REACT_TAG = 1;
    public static final int FR_KEY_STRING = 0;
    public static final int FR_KEY_TEXT_ATTRIBUTES = 5;
    public static final int FR_KEY_WIDTH = 3;

    @NotNull
    public static final TextLayoutManager INSTANCE = new TextLayoutManager();
    public static final int PA_KEY_ADJUST_FONT_SIZE_TO_FIT = 3;
    public static final int PA_KEY_ELLIPSIZE_MODE = 1;
    public static final int PA_KEY_HYPHENATION_FREQUENCY = 5;
    public static final int PA_KEY_INCLUDE_FONT_PADDING = 4;
    public static final int PA_KEY_MAXIMUM_FONT_SIZE = 7;
    public static final int PA_KEY_MAX_NUMBER_OF_LINES = 0;
    public static final int PA_KEY_MINIMUM_FONT_SIZE = 6;
    public static final int PA_KEY_TEXT_ALIGN_VERTICAL = 8;
    public static final int PA_KEY_TEXT_BREAK_STRATEGY = 2;

    @NotNull
    private static final String TAG;

    /* JADX INFO: renamed from: setUseBoundsForWidthMethod$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy setUseBoundsForWidthMethod;

    @NotNull
    private static final ConcurrentHashMap<Integer, Spannable> tagToSpannableCache;

    @NotNull
    private static final ThreadLocal<TextPaint> textPaintInstance;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001a\u0010\u0016\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/facebook/react/views/text/TextLayoutManager$AttachmentMetrics;", "", "<init>", "()V", "wasFound", "", "getWasFound", "()Z", "setWasFound", "(Z)V", ViewProps.TOP, "", "getTop", "()F", "setTop", "(F)V", ViewProps.LEFT, "getLeft", "setLeft", "width", "getWidth", "setWidth", "height", "getHeight", "setHeight", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AttachmentMetrics {
        private float height;
        private float left;
        private float top;
        private boolean wasFound;
        private float width;

        public final float getHeight() {
            return this.height;
        }

        public final float getLeft() {
            return this.left;
        }

        public final float getTop() {
            return this.top;
        }

        public final boolean getWasFound() {
            return this.wasFound;
        }

        public final float getWidth() {
            return this.width;
        }

        public final void setHeight(float f2) {
            this.height = f2;
        }

        public final void setLeft(float f2) {
            this.left = f2;
        }

        public final void setTop(float f2) {
            this.top = f2;
        }

        public final void setWasFound(boolean z5) {
            this.wasFound = z5;
        }

        public final void setWidth(float f2) {
            this.width = f2;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/facebook/react/views/text/TextLayoutManager$CreateLayoutResult;", "", "layout", "Landroid/text/Layout;", ViewProps.TEXT_BREAK_STRATEGY, "", "justificationMode", "<init>", "(Landroid/text/Layout;II)V", "getLayout", "()Landroid/text/Layout;", "getTextBreakStrategy", "()I", "getJustificationMode", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CreateLayoutResult {
        private final int justificationMode;

        @NotNull
        private final Layout layout;
        private final int textBreakStrategy;

        public CreateLayoutResult(@NotNull Layout layout, int i7, int i10) {
            Intrinsics.checkNotNullParameter(layout, "layout");
            this.layout = layout;
            this.textBreakStrategy = i7;
            this.justificationMode = i10;
        }

        public final int getJustificationMode() {
            return this.justificationMode;
        }

        @NotNull
        public final Layout getLayout() {
            return this.layout;
        }

        public final int getTextBreakStrategy() {
            return this.textBreakStrategy;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;", "", "props", "Lcom/facebook/react/views/text/TextAttributeProps;", "length", "", "reactTag", "isAttachment", "", "width", "", "height", "<init>", "(Lcom/facebook/react/views/text/TextAttributeProps;IIZDD)V", "getProps", "()Lcom/facebook/react/views/text/TextAttributeProps;", "getLength", "()I", "getReactTag", "()Z", "getWidth", "()D", "getHeight", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FragmentAttributes {
        private final double height;
        private final boolean isAttachment;
        private final int length;

        @NotNull
        private final TextAttributeProps props;
        private final int reactTag;
        private final double width;

        public FragmentAttributes(@NotNull TextAttributeProps props, int i7, int i10, boolean z5, double d6, double d7) {
            Intrinsics.checkNotNullParameter(props, "props");
            this.props = props;
            this.length = i7;
            this.reactTag = i10;
            this.isAttachment = z5;
            this.width = d6;
            this.height = d7;
        }

        public final double getHeight() {
            return this.height;
        }

        public final int getLength() {
            return this.length;
        }

        @NotNull
        public final TextAttributeProps getProps() {
            return this.props;
        }

        public final int getReactTag() {
            return this.reactTag;
        }

        public final double getWidth() {
            return this.width;
        }

        /* JADX INFO: renamed from: isAttachment, reason: from getter */
        public final boolean getIsAttachment() {
            return this.isAttachment;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Layout.Alignment.ALIGN_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[YogaMeasureMode.values().length];
            try {
                iArr2[1] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[2] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    static {
        Intrinsics.checkNotNullExpressionValue("TextLayoutManager", "getSimpleName(...)");
        TAG = "TextLayoutManager";
        textPaintInstance = new ThreadLocal<TextPaint>() { // from class: com.facebook.react.views.text.TextLayoutManager$textPaintInstance$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.lang.ThreadLocal
            public TextPaint initialValue() {
                return new TextPaint(1);
            }
        };
        tagToSpannableCache = new ConcurrentHashMap<>();
        setUseBoundsForWidthMethod = l.b(new c(10));
    }

    private TextLayoutManager() {
    }

    private final void addLeadingMarginForTextEffects(Spannable spannable) {
        StrokeStyleSpan strokeSpan = StrokeStyleSpan.INSTANCE.getStrokeSpan(spannable);
        ShadowStyleSpan shadowSpan = ShadowStyleSpan.INSTANCE.getShadowSpan(spannable);
        int iMax = (int) Math.max(strokeSpan != null ? strokeSpan.getLeftOffset() : 0.0f, shadowSpan != null ? shadowSpan.getLeftOffset() : 0.0f);
        if (iMax > 0) {
            spannable.setSpan(new LeadingMarginSpan.Standard(iMax), 0, spannable.length(), 18);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0117  */
    /* JADX WARN: Code duplicated, block: B:42:0x012b  */
    /* JADX WARN: Code duplicated, block: B:52:0x013e  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void adjustSpannableFontToFit(@NotNull Spannable text, float width, @NotNull YogaMeasureMode widthYogaMeasureMode, float height, @NotNull YogaMeasureMode heightYogaMeasureMode, float minimumFontSizeAttr, int maximumNumberOfLines, boolean includeFontPadding, int textBreakStrategy, int hyphenationFrequency, @NotNull Layout.Alignment alignment, int justificationMode, @NotNull TextPaint paint) {
        int i7;
        int i10;
        int i11;
        int i12;
        Spannable text2 = text;
        TextPaint paint2 = paint;
        Intrinsics.checkNotNullParameter(text2, "text");
        Intrinsics.checkNotNullParameter(widthYogaMeasureMode, "widthYogaMeasureMode");
        Intrinsics.checkNotNullParameter(heightYogaMeasureMode, "heightYogaMeasureMode");
        Layout.Alignment alignment2 = alignment;
        Intrinsics.checkNotNullParameter(alignment2, "alignment");
        Intrinsics.checkNotNullParameter(paint2, "paint");
        BoringLayout.Metrics metricsIsBoring = INSTANCE.isBoring(text2, paint2);
        int iDpToPx = (int) (Float.isNaN(minimumFontSizeAttr) ? PixelUtil.INSTANCE.dpToPx(4) : minimumFontSizeAttr);
        int i13 = 0;
        Class<ReactAbsoluteSizeSpan> cls = ReactAbsoluteSizeSpan.class;
        Iterator it = ArrayIteratorKt.iterator((ReactAbsoluteSizeSpan[]) text2.getSpans(0, text2.length(), cls));
        int iMax = iDpToPx;
        while (it.hasNext()) {
            iMax = Math.max(iMax, ((ReactAbsoluteSizeSpan) it.next()).getSize());
        }
        int i14 = iMax;
        int i15 = iDpToPx;
        while (true) {
            int i16 = ((i15 + iMax) + 1) / 2;
            float f2 = i16 / i14;
            paint2.setTextSize(Math.max((int) (paint2.getTextSize() * f2), iDpToPx));
            for (Iterator it2 = ArrayIteratorKt.iterator((ReactAbsoluteSizeSpan[]) text2.getSpans(i13, text2.length(), cls)); it2.hasNext(); it2 = it2) {
                ReactAbsoluteSizeSpan reactAbsoluteSizeSpan = (ReactAbsoluteSizeSpan) it2.next();
                text2.setSpan(new ReactAbsoluteSizeSpan(Math.max((int) (reactAbsoluteSizeSpan.getSize() * f2), iDpToPx)), text2.getSpanStart(reactAbsoluteSizeSpan), text2.getSpanEnd(reactAbsoluteSizeSpan), text2.getSpanFlags(reactAbsoluteSizeSpan));
                text2.removeSpan(reactAbsoluteSizeSpan);
                metricsIsBoring = metricsIsBoring;
            }
            BoringLayout.Metrics metrics = metricsIsBoring;
            BoringLayout.Metrics metricsIsBoring2 = metrics != null ? INSTANCE.isBoring(text2, paint2) : metrics;
            Class<ReactAbsoluteSizeSpan> cls2 = cls;
            int i17 = iMax;
            int i18 = iDpToPx;
            int i19 = i15;
            Layout layoutCreateLayout = INSTANCE.createLayout(text2, metricsIsBoring2, width, widthYogaMeasureMode, includeFontPadding, textBreakStrategy, hyphenationFrequency, alignment2, justificationMode, null, -1, paint2);
            if (i19 == i17) {
                return;
            }
            if (text.length() == 1) {
                i7 = 0;
                if (layoutCreateLayout.getLineWidth(0) > width) {
                    i10 = 1;
                }
                if (heightYogaMeasureMode != YogaMeasureMode.f5460d || layoutCreateLayout.getHeight() <= height) {
                    i11 = i7;
                } else {
                    i11 = 1;
                }
                if (maximumNumberOfLines != -1 || maximumNumberOfLines == 0 || layoutCreateLayout.getLineCount() <= maximumNumberOfLines) {
                    i12 = i7;
                } else {
                    i12 = 1;
                }
                if (i16 > i18 || (i12 == 0 && i11 == 0 && i10 == 0)) {
                    i19 = i16;
                } else {
                    i17 = i17 - i19 == 1 ? i19 : i16;
                }
                alignment2 = alignment;
                paint2 = paint;
                i13 = i7;
                metricsIsBoring = metricsIsBoring2;
                i14 = i16;
                i15 = i19;
                cls = cls2;
                text2 = text;
                iDpToPx = i18;
                iMax = i17;
            } else {
                i7 = 0;
            }
            i10 = i7;
            if (heightYogaMeasureMode != YogaMeasureMode.f5460d) {
                i11 = i7;
            } else {
                i11 = i7;
            }
            if (maximumNumberOfLines != -1) {
                i12 = i7;
            } else {
                i12 = i7;
            }
            if (i16 > i18) {
                i19 = i16;
            } else {
                i19 = i16;
            }
            alignment2 = alignment;
            paint2 = paint;
            i13 = i7;
            metricsIsBoring = metricsIsBoring2;
            i14 = i16;
            i15 = i19;
            cls = cls2;
            text2 = text;
            iDpToPx = i18;
            iMax = i17;
        }
    }

    private final Layout buildLayout(Spannable text, int layoutWidth, boolean includeFontPadding, int textBreakStrategy, int hyphenationFrequency, Layout.Alignment alignment, int justificationMode, TextUtils.TruncateAt ellipsizeMode, int maxNumberOfLines, TextPaint paint) {
        StaticLayout.Builder hyphenationFrequency2 = StaticLayout.Builder.obtain(text, 0, text.length(), paint, layoutWidth).setAlignment(alignment).setLineSpacing(0.0f, 1.0f).setIncludePad(includeFontPadding).setBreakStrategy(textBreakStrategy).setHyphenationFrequency(hyphenationFrequency);
        Intrinsics.checkNotNullExpressionValue(hyphenationFrequency2, "setHyphenationFrequency(...)");
        if (maxNumberOfLines != -1 && maxNumberOfLines != 0) {
            hyphenationFrequency2.setEllipsize(ellipsizeMode).setMaxLines(maxNumberOfLines);
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 26) {
            hyphenationFrequency2.setJustificationMode(justificationMode);
        }
        if (i7 >= 28) {
            hyphenationFrequency2.setUseLineSpacingFromFallbacks(true);
        }
        StaticLayout staticLayoutBuild = hyphenationFrequency2.build();
        Intrinsics.checkNotNullExpressionValue(staticLayoutBuild, "build(...)");
        return staticLayoutBuild;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x009a, code lost:
    
        if (com.facebook.react.internal.featureflags.ReactNativeFeatureFlags.enablePreparedTextLayout() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009c, code lost:
    
        r24.add(new com.facebook.react.views.text.internal.span.SetSpanOperation(r6, r8, new com.facebook.react.views.text.internal.span.ReactLinkSpan(r3)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00aa, code lost:
    
        r24.add(new com.facebook.react.views.text.internal.span.SetSpanOperation(r6, r8, new com.facebook.react.views.text.internal.span.ReactClickableSpan(r11)));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void buildSpannableFromFragments(android.content.res.AssetManager r21, com.facebook.react.common.mapbuffer.MapBuffer r22, android.text.SpannableStringBuilder r23, java.util.List<com.facebook.react.views.text.internal.span.SetSpanOperation> r24, int[] r25) {
        /*
            Method dump skipped, instruction units count: 643
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.text.TextLayoutManager.buildSpannableFromFragments(android.content.res.AssetManager, com.facebook.react.common.mapbuffer.MapBuffer, android.text.SpannableStringBuilder, java.util.List, int[]):void");
    }

    private final Spannable buildSpannableFromFragmentsOptimized(AssetManager assets, MapBuffer fragments, int[] outputReactTags) {
        int i7;
        StringBuilder sb2 = new StringBuilder();
        ArrayList<FragmentAttributes> arrayList = new ArrayList(fragments.getCount());
        int count = fragments.getCount();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            i7 = 2;
            if (i11 >= count) {
                break;
            }
            MapBuffer mapBuffer = fragments.getMapBuffer(i11);
            TextAttributeProps textAttributePropsFromMapBuffer = TextAttributeProps.INSTANCE.fromMapBuffer(mapBuffer.getMapBuffer(5));
            String strApply = TextTransform.INSTANCE.apply(mapBuffer.getString(0), textAttributePropsFromMapBuffer.getTextTransform());
            sb2.append(strApply);
            int length = strApply.length();
            int i12 = mapBuffer.contains(1) ? mapBuffer.getInt(1) : -1;
            boolean z5 = mapBuffer.contains(2) && mapBuffer.getBoolean(2);
            double d6 = Double.NaN;
            double d7 = mapBuffer.contains(3) ? mapBuffer.getDouble(3) : Double.NaN;
            if (mapBuffer.contains(4)) {
                d6 = mapBuffer.getDouble(4);
            }
            arrayList.add(new FragmentAttributes(textAttributePropsFromMapBuffer, length, i12, z5, d7, d6));
            i11++;
        }
        SpannableString spannableString = new SpannableString(sb2);
        int i13 = 0;
        for (FragmentAttributes fragmentAttributes : arrayList) {
            int i14 = i10 + 1;
            int length2 = fragmentAttributes.getLength() + i13;
            int i15 = i13 == 0 ? 18 : 34;
            if (fragmentAttributes.getIsAttachment()) {
                spannableString.setSpan(new TextInlineViewPlaceholderSpan(fragmentAttributes.getReactTag(), (int) PixelUtil.toPixelFromSP(fragmentAttributes.getWidth()), (int) PixelUtil.toPixelFromSP(fragmentAttributes.getHeight())), i13, length2, i15);
            } else {
                if (fragmentAttributes.getProps().getRole() == null ? fragmentAttributes.getProps().getAccessibilityRole() == ReactAccessibilityDelegate.AccessibilityRole.LINK : fragmentAttributes.getProps().getRole() == ReactAccessibilityDelegate.Role.LINK) {
                    if (ReactNativeFeatureFlags.enablePreparedTextLayout()) {
                        spannableString.setSpan(new ReactLinkSpan(i10), i13, length2, i15);
                    } else {
                        spannableString.setSpan(new ReactClickableSpan(fragmentAttributes.getReactTag()), i13, length2, i15);
                    }
                }
                if (fragmentAttributes.getProps().getIsColorSet()) {
                    Integer color = fragmentAttributes.getProps().getColor();
                    spannableString.setSpan(color != null ? new ReactForegroundColorSpan(color.intValue()) : null, i13, length2, i15);
                }
                int[] gradientColors = fragmentAttributes.getProps().getGradientColors();
                if (gradientColors != null && gradientColors.length >= i7) {
                    spannableString.setSpan(new LinearGradientSpan(i13 * fragmentAttributes.getProps().getFontSize(), gradientColors, Float.isNaN(fragmentAttributes.getProps().getGradientAngle()) ? 0.0f : fragmentAttributes.getProps().getGradientAngle(), fragmentAttributes.getProps().getGradientLength(), fragmentAttributes.getProps().getGradientMode()), i13, length2, i15);
                }
                if (fragmentAttributes.getProps().getIsBackgroundColorSet()) {
                    Integer backgroundColor = fragmentAttributes.getProps().getBackgroundColor();
                    spannableString.setSpan(backgroundColor != null ? new ReactBackgroundColorSpan(backgroundColor.intValue()) : null, i13, length2, i15);
                }
                if (!Float.isNaN(fragmentAttributes.getProps().getOpacity())) {
                    spannableString.setSpan(new ReactOpacitySpan(fragmentAttributes.getProps().getOpacity()), i13, length2, i15);
                }
                if (!Float.isNaN(fragmentAttributes.getProps().getLetterSpacing())) {
                    spannableString.setSpan(new CustomLetterSpacingSpan(fragmentAttributes.getProps().getLetterSpacing()), i13, length2, i15);
                }
                spannableString.setSpan(new ReactAbsoluteSizeSpan(fragmentAttributes.getProps().getFontSize()), i13, length2, i15);
                if (fragmentAttributes.getProps().getFontStyle() != -1 || fragmentAttributes.getProps().getFontWeight() != -1 || fragmentAttributes.getProps().getFontFamily() != null) {
                    spannableString.setSpan(new CustomStyleSpan(fragmentAttributes.getProps().getFontStyle(), fragmentAttributes.getProps().getFontWeight(), fragmentAttributes.getProps().getFontFeatureSettings(), fragmentAttributes.getProps().getFontFamily(), assets), i13, length2, i15);
                }
                if (fragmentAttributes.getProps().getIsUnderlineTextDecorationSet()) {
                    spannableString.setSpan(new ReactUnderlineSpan(), i13, length2, i15);
                }
                if (fragmentAttributes.getProps().getIsLineThroughTextDecorationSet()) {
                    spannableString.setSpan(new ReactStrikethroughSpan(), i13, length2, i15);
                }
                if ((fragmentAttributes.getProps().getTextShadowOffsetDx() != 0.0f || fragmentAttributes.getProps().getTextShadowOffsetDy() != 0.0f || fragmentAttributes.getProps().getTextShadowRadius() != 0.0f) && Color.alpha(fragmentAttributes.getProps().getTextShadowColor()) != 0) {
                    spannableString.setSpan(new ShadowStyleSpan(fragmentAttributes.getProps().getTextShadowOffsetDx(), fragmentAttributes.getProps().getTextShadowOffsetDy(), fragmentAttributes.getProps().getTextShadowRadius(), fragmentAttributes.getProps().getTextShadowColor()), i13, length2, i15);
                }
                if (!Float.isNaN(fragmentAttributes.getProps().getTextStrokeWidth()) && fragmentAttributes.getProps().getTextStrokeWidth() > 0.0f && fragmentAttributes.getProps().getIsTextStrokeColorSet()) {
                    spannableString.setSpan(new StrokeStyleSpan(fragmentAttributes.getProps().getTextStrokeWidth(), fragmentAttributes.getProps().getTextStrokeColor()), i13, length2, i15);
                }
                if (!Float.isNaN(fragmentAttributes.getProps().getLineHeight())) {
                    spannableString.setSpan(new CustomLineHeightSpan(fragmentAttributes.getProps().getLineHeight()), i13, length2, i15);
                }
                if (ReactNativeFeatureFlags.enablePreparedTextLayout()) {
                    spannableString.setSpan(new ReactFragmentIndexSpan(i10), i13, length2, i15);
                    if (outputReactTags != null) {
                        outputReactTags[i10] = fragmentAttributes.getReactTag();
                    }
                } else {
                    spannableString.setSpan(new ReactTagSpan(fragmentAttributes.getReactTag()), i13, length2, i15);
                }
            }
            i10 = i14;
            i13 = length2;
            i7 = 2;
        }
        addLeadingMarginForTextEffects(spannableString);
        return spannableString;
    }

    private final float calculateHeight(Layout layout, float height, YogaMeasureMode heightYogaMeasureMode, int calculatedLineCount) {
        if (heightYogaMeasureMode != YogaMeasureMode.f5461e) {
            float lineBottom = layout.getLineBottom(calculatedLineCount - 1);
            if (heightYogaMeasureMode != YogaMeasureMode.f5462i || lineBottom <= height) {
                return lineBottom;
            }
        }
        return height;
    }

    private final int calculateLineCount(Layout layout, int maximumNumberOfLines) {
        return (maximumNumberOfLines == -1 || maximumNumberOfLines == 0) ? layout.getLineCount() : Math.min(maximumNumberOfLines, layout.getLineCount());
    }

    private final float calculateWidth(Layout layout, Spanned text, float width, YogaMeasureMode widthYogaMeasureMode, int calculatedLineCount) {
        return widthYogaMeasureMode == YogaMeasureMode.f5461e ? width : layout.getWidth();
    }

    private final Layout createLayout(Spannable text, BoringLayout.Metrics boring, float width, YogaMeasureMode widthYogaMeasureMode, boolean includeFontPadding, int textBreakStrategy, int hyphenationFrequency, Layout.Alignment alignment, int justificationMode, TextUtils.TruncateAt ellipsizeMode, int maxNumberOfLines, TextPaint paint) {
        if (boring != null && (widthYogaMeasureMode == YogaMeasureMode.f5460d || boring.width <= ((float) Math.floor(width)))) {
            BoringLayout boringLayoutMake = BoringLayout.make(text, paint, widthYogaMeasureMode == YogaMeasureMode.f5461e ? (int) Math.ceil(width) : boring.width, alignment, 1.0f, 0.0f, boring, includeFontPadding);
            Intrinsics.checkNotNullExpressionValue(boringLayoutMake, "make(...)");
            return boringLayoutMake;
        }
        int iCeil = (int) Math.ceil(Layout.getDesiredWidth(text, paint));
        int iOrdinal = widthYogaMeasureMode.ordinal();
        if (iOrdinal == 1) {
            iCeil = (int) Math.ceil(width);
        } else if (iOrdinal == 2) {
            iCeil = Math.min(iCeil, (int) Math.floor(width));
        }
        return buildLayout(text, iCeil, includeFontPadding, textBreakStrategy, hyphenationFrequency, alignment, justificationMode, ellipsizeMode, maxNumberOfLines, paint);
    }

    private final Layout createLayoutForMeasurement(AssetManager assets, MapBuffer attributedString, MapBuffer paragraphAttributes, float width, YogaMeasureMode widthYogaMeasureMode, float height, YogaMeasureMode heightYogaMeasureMode, ReactTextViewManagerCallback reactTextViewManagerCallback) {
        Spannable orCreateSpannableForText = getOrCreateSpannableForText(assets, attributedString, reactTextViewManagerCallback);
        return createLayout(orCreateSpannableForText, attributedString.contains(3) ? ((ReactTextPaintHolderSpan[]) orCreateSpannableForText.getSpans(0, 0, ReactTextPaintHolderSpan.class))[0].getTextPaint() : scratchPaintWithAttributes(TextAttributeProps.INSTANCE.fromMapBuffer(attributedString.getMapBuffer(4)), assets), attributedString, paragraphAttributes, width, widthYogaMeasureMode, height, heightYogaMeasureMode).getLayout();
    }

    @NotNull
    public static final PreparedLayout createPreparedLayout(@NotNull AssetManager assets, @NotNull ReadableMapBuffer attributedString, @NotNull ReadableMapBuffer paragraphAttributes, float width, @NotNull YogaMeasureMode widthYogaMeasureMode, float height, @NotNull YogaMeasureMode heightYogaMeasureMode, ReactTextViewManagerCallback reactTextViewManagerCallback) {
        Intrinsics.checkNotNullParameter(assets, "assets");
        Intrinsics.checkNotNullParameter(attributedString, "attributedString");
        Intrinsics.checkNotNullParameter(paragraphAttributes, "paragraphAttributes");
        Intrinsics.checkNotNullParameter(widthYogaMeasureMode, "widthYogaMeasureMode");
        Intrinsics.checkNotNullParameter(heightYogaMeasureMode, "heightYogaMeasureMode");
        ReadableMapBuffer mapBuffer = attributedString.getMapBuffer(2);
        int[] iArr = new int[mapBuffer.getCount()];
        TextLayoutManager textLayoutManager = INSTANCE;
        CreateLayoutResult createLayoutResultCreateLayout = textLayoutManager.createLayout(textLayoutManager.createSpannableFromAttributedString(assets, mapBuffer, reactTextViewManagerCallback, iArr), textLayoutManager.newPaintWithAttributes(TextAttributeProps.INSTANCE.fromMapBuffer(attributedString.getMapBuffer(4)), assets), attributedString, paragraphAttributes, width, widthYogaMeasureMode, height, heightYogaMeasureMode);
        int i7 = paragraphAttributes.contains(0) ? paragraphAttributes.getInt(0) : -1;
        return new PreparedLayout(createLayoutResultCreateLayout.getLayout(), i7, textLayoutManager.getVerticalOffset(createLayoutResultCreateLayout.getLayout(), paragraphAttributes, height, heightYogaMeasureMode, i7), iArr, createLayoutResultCreateLayout.getTextBreakStrategy(), createLayoutResultCreateLayout.getJustificationMode());
    }

    private final Spannable createSpannableFromAttributedString(AssetManager assets, MapBuffer fragments, ReactTextViewManagerCallback reactTextViewManagerCallback, int[] outputReactTags) {
        if (ReactNativeFeatureFlags.enableAndroidTextMeasurementOptimizations()) {
            Spannable spannableBuildSpannableFromFragmentsOptimized = buildSpannableFromFragmentsOptimized(assets, fragments, outputReactTags);
            if (reactTextViewManagerCallback != null) {
                reactTextViewManagerCallback.onPostProcessSpannable(spannableBuildSpannableFromFragmentsOptimized);
            }
            return spannableBuildSpannableFromFragmentsOptimized;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        List<SetSpanOperation> arrayList = new ArrayList<>();
        buildSpannableFromFragments(assets, fragments, spannableStringBuilder, arrayList, outputReactTags);
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            arrayList.get((arrayList.size() - i7) - 1).execute(spannableStringBuilder, i7);
        }
        addLeadingMarginForTextEffects(spannableStringBuilder);
        if (reactTextViewManagerCallback != null) {
            reactTextViewManagerCallback.onPostProcessSpannable(spannableStringBuilder);
        }
        return spannableStringBuilder;
    }

    private final Method getSetUseBoundsForWidthMethod() {
        return (Method) setUseBoundsForWidthMethod.getValue();
    }

    private final Layout.Alignment getTextAlignment(MapBuffer attributedString, Spannable spanned, String alignmentAttr) {
        boolean z5 = isRTL(attributedString) != TextDirectionHeuristics.FIRSTSTRONG_LTR.isRtl(spanned, 0, spanned.length());
        Layout.Alignment alignment = z5 ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        if (alignmentAttr == null) {
            return alignment;
        }
        if (Intrinsics.areEqual(alignmentAttr, "center")) {
            return Layout.Alignment.ALIGN_CENTER;
        }
        if (Intrinsics.areEqual(alignmentAttr, ViewProps.RIGHT)) {
            return z5 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
        }
        return alignment;
    }

    private final String getTextAlignmentAttr(MapBuffer attributedString) {
        if (!attributedString.contains(2)) {
            return null;
        }
        MapBuffer mapBuffer = attributedString.getMapBuffer(2);
        if (mapBuffer.getCount() != 0) {
            MapBuffer mapBuffer2 = mapBuffer.getMapBuffer(0).getMapBuffer(5);
            if (mapBuffer2.contains(12)) {
                return mapBuffer2.getString(12);
            }
        }
        return null;
    }

    public static final int getTextGravity(@NotNull MapBuffer attributedString, @NotNull Spannable spanned) {
        Intrinsics.checkNotNullParameter(attributedString, "attributedString");
        Intrinsics.checkNotNullParameter(spanned, "spanned");
        TextLayoutManager textLayoutManager = INSTANCE;
        Layout.Alignment textAlignment = textLayoutManager.getTextAlignment(attributedString, spanned, textLayoutManager.getTextAlignmentAttr(attributedString));
        boolean zIsRtl = TextDirectionHeuristics.FIRSTSTRONG_LTR.isRtl(spanned, 0, spanned.length());
        int i7 = WhenMappings.$EnumSwitchMapping$0[textAlignment.ordinal()];
        if (i7 == 1) {
            return zIsRtl ? 5 : 3;
        }
        if (i7 == 2) {
            return zIsRtl ? 3 : 5;
        }
        if (i7 == 3) {
            return 1;
        }
        throw new n();
    }

    private final int getTextJustificationMode(String alignmentAttr) {
        if (Build.VERSION.SDK_INT < 26) {
            return -1;
        }
        return (alignmentAttr == null || !Intrinsics.areEqual(alignmentAttr, "justified")) ? 0 : 1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        if (r4.equals("auto") == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003b, code lost:
    
        if (r4.equals(com.facebook.react.uimanager.ViewProps.TOP) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003e, code lost:
    
        return 0.0f;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final float getVerticalOffset(android.text.Layout r3, com.facebook.react.common.mapbuffer.ReadableMapBuffer r4, float r5, com.facebook.yoga.YogaMeasureMode r6, int r7) {
        /*
            r2 = this;
            r0 = 8
            boolean r1 = r4.contains(r0)
            if (r1 == 0) goto Ld
            java.lang.String r4 = r4.getString(r0)
            goto Le
        Ld:
            r4 = 0
        Le:
            r0 = 0
            if (r4 != 0) goto L12
            return r0
        L12:
            int r1 = r3.getHeight()
            int r7 = r2.calculateLineCount(r3, r7)
            float r3 = r2.calculateHeight(r3, r5, r6, r7)
            float r5 = (float) r1
            int r6 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r6 <= 0) goto L24
            return r0
        L24:
            int r6 = r4.hashCode()
            switch(r6) {
                case -1383228885: goto L4d;
                case -1364013995: goto L3f;
                case 115029: goto L35;
                case 3005871: goto L2c;
                default: goto L2b;
            }
        L2b:
            goto L55
        L2c:
            java.lang.String r3 = "auto"
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L3e
            goto L55
        L35:
            java.lang.String r3 = "top"
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L3e
            goto L55
        L3e:
            return r0
        L3f:
            java.lang.String r6 = "center"
            boolean r6 = r4.equals(r6)
            if (r6 != 0) goto L48
            goto L55
        L48:
            float r3 = r3 - r5
            r4 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r4
            return r3
        L4d:
            java.lang.String r6 = "bottom"
            boolean r6 = r4.equals(r6)
            if (r6 != 0) goto L61
        L55:
            java.lang.String r3 = "Invalid textAlignVertical: "
            java.lang.String r3 = r3.concat(r4)
            java.lang.String r4 = "ReactNative"
            o8.a.v(r4, r3)
            return r0
        L61:
            float r3 = r3 - r5
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.text.TextLayoutManager.getVerticalOffset(android.text.Layout, com.facebook.react.common.mapbuffer.ReadableMapBuffer, float, com.facebook.yoga.YogaMeasureMode, int):float");
    }

    private final BoringLayout.Metrics isBoring(Spannable text, TextPaint paint) {
        BoringLayout.Metrics metricsIsBoring = Build.VERSION.SDK_INT < 33 ? BoringLayout.isBoring(text, paint) : BoringLayout.isBoring(text, paint, TextDirectionHeuristics.FIRSTSTRONG_LTR, true, null);
        if (metricsIsBoring == null || metricsIsBoring.width < 0) {
            return null;
        }
        return metricsIsBoring;
    }

    @NotNull
    public static final WritableArray measureLines(@NotNull AssetManager assetManager, @NotNull MapBuffer attributedString, @NotNull MapBuffer paragraphAttributes, float width, float height, ReactTextViewManagerCallback reactTextViewManagerCallback) {
        Intrinsics.checkNotNullParameter(assetManager, "assetManager");
        Intrinsics.checkNotNullParameter(attributedString, "attributedString");
        Intrinsics.checkNotNullParameter(paragraphAttributes, "paragraphAttributes");
        TextLayoutManager textLayoutManager = INSTANCE;
        YogaMeasureMode yogaMeasureMode = YogaMeasureMode.f5461e;
        Layout layoutCreateLayoutForMeasurement = textLayoutManager.createLayoutForMeasurement(assetManager, attributedString, paragraphAttributes, width, yogaMeasureMode, height, yogaMeasureMode, reactTextViewManagerCallback);
        CharSequence text = layoutCreateLayoutForMeasurement.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        return FontMetricsUtil.getFontMetrics(text, layoutCreateLayoutForMeasurement, DisplayMetricsHolder.getWindowDisplayMetrics());
    }

    @NotNull
    public static final float[] measurePreparedLayout(@NotNull PreparedLayout preparedLayout, float width, @NotNull YogaMeasureMode widthYogaMeasureMode, float height, @NotNull YogaMeasureMode heightYogaMeasureMode) {
        Intrinsics.checkNotNullParameter(preparedLayout, "preparedLayout");
        Intrinsics.checkNotNullParameter(widthYogaMeasureMode, "widthYogaMeasureMode");
        Intrinsics.checkNotNullParameter(heightYogaMeasureMode, "heightYogaMeasureMode");
        Layout layout = preparedLayout.getLayout();
        CharSequence text = layout.getText();
        Intrinsics.checkNotNull(text, "null cannot be cast to non-null type android.text.Spanned");
        Spanned spanned = (Spanned) text;
        int maximumNumberOfLines = preparedLayout.getMaximumNumberOfLines();
        TextLayoutManager textLayoutManager = INSTANCE;
        int iCalculateLineCount = textLayoutManager.calculateLineCount(layout, maximumNumberOfLines);
        float fCalculateWidth = textLayoutManager.calculateWidth(layout, spanned, width, widthYogaMeasureMode, iCalculateLineCount);
        float fCalculateHeight = textLayoutManager.calculateHeight(layout, height, heightYogaMeasureMode, iCalculateLineCount);
        ArrayList arrayList = new ArrayList();
        PixelUtil pixelUtil = PixelUtil.INSTANCE;
        arrayList.add(Float.valueOf(pixelUtil.pxToDp(fCalculateWidth)));
        arrayList.add(Float.valueOf(pixelUtil.pxToDp(fCalculateHeight)));
        AttachmentMetrics attachmentMetrics = new AttachmentMetrics();
        int iNextAttachmentMetrics = 0;
        while (iNextAttachmentMetrics < spanned.length()) {
            iNextAttachmentMetrics = textLayoutManager.nextAttachmentMetrics(layout, spanned, fCalculateWidth, iCalculateLineCount, iNextAttachmentMetrics, preparedLayout.getVerticalOffset(), attachmentMetrics);
            if (attachmentMetrics.getWasFound()) {
                PixelUtil pixelUtil2 = PixelUtil.INSTANCE;
                arrayList.add(Float.valueOf(pixelUtil2.pxToDp(attachmentMetrics.getTop())));
                arrayList.add(Float.valueOf(pixelUtil2.pxToDp(attachmentMetrics.getLeft())));
                arrayList.add(Float.valueOf(pixelUtil2.pxToDp(attachmentMetrics.getWidth())));
                arrayList.add(Float.valueOf(pixelUtil2.pxToDp(attachmentMetrics.getHeight())));
            }
        }
        float[] fArr = new float[arrayList.size()];
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            Object obj = arrayList.get(i7);
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            fArr[i7] = ((Number) obj).floatValue();
        }
        return fArr;
    }

    public static final long measureText(@NotNull AssetManager assets, @NotNull MapBuffer attributedString, @NotNull MapBuffer paragraphAttributes, float width, @NotNull YogaMeasureMode widthYogaMeasureMode, float height, @NotNull YogaMeasureMode heightYogaMeasureMode, ReactTextViewManagerCallback reactTextViewManagerCallback, float[] attachmentsPositions) {
        Intrinsics.checkNotNullParameter(assets, "assets");
        Intrinsics.checkNotNullParameter(attributedString, "attributedString");
        Intrinsics.checkNotNullParameter(paragraphAttributes, "paragraphAttributes");
        Intrinsics.checkNotNullParameter(widthYogaMeasureMode, "widthYogaMeasureMode");
        Intrinsics.checkNotNullParameter(heightYogaMeasureMode, "heightYogaMeasureMode");
        TextLayoutManager textLayoutManager = INSTANCE;
        Layout layoutCreateLayoutForMeasurement = textLayoutManager.createLayoutForMeasurement(assets, attributedString, paragraphAttributes, width, widthYogaMeasureMode, height, heightYogaMeasureMode, reactTextViewManagerCallback);
        int iNextAttachmentMetrics = 0;
        int i7 = paragraphAttributes.contains(0) ? paragraphAttributes.getInt(0) : -1;
        CharSequence text = layoutCreateLayoutForMeasurement.getText();
        Intrinsics.checkNotNull(text, "null cannot be cast to non-null type android.text.Spanned");
        Spanned spanned = (Spanned) text;
        int iCalculateLineCount = textLayoutManager.calculateLineCount(layoutCreateLayoutForMeasurement, i7);
        float fCalculateWidth = textLayoutManager.calculateWidth(layoutCreateLayoutForMeasurement, spanned, width, widthYogaMeasureMode, iCalculateLineCount);
        float fCalculateHeight = textLayoutManager.calculateHeight(layoutCreateLayoutForMeasurement, height, heightYogaMeasureMode, iCalculateLineCount);
        if (attachmentsPositions != null) {
            AttachmentMetrics attachmentMetrics = new AttachmentMetrics();
            int i10 = 0;
            while (iNextAttachmentMetrics < spanned.length()) {
                iNextAttachmentMetrics = INSTANCE.nextAttachmentMetrics(layoutCreateLayoutForMeasurement, spanned, fCalculateWidth, iCalculateLineCount, iNextAttachmentMetrics, 0.0f, attachmentMetrics);
                if (attachmentMetrics.getWasFound()) {
                    PixelUtil pixelUtil = PixelUtil.INSTANCE;
                    attachmentsPositions[i10] = pixelUtil.pxToDp(attachmentMetrics.getTop());
                    attachmentsPositions[i10 + 1] = pixelUtil.pxToDp(attachmentMetrics.getLeft());
                    i10 += 2;
                }
            }
        }
        PixelUtil pixelUtil2 = PixelUtil.INSTANCE;
        return a.I(pixelUtil2.pxToDp(fCalculateWidth), pixelUtil2.pxToDp(fCalculateHeight));
    }

    private final TextPaint newPaintWithAttributes(TextAttributeProps baseTextAttributes, AssetManager assets) {
        TextPaint textPaint = new TextPaint(1);
        updateTextPaint(textPaint, baseTextAttributes, assets);
        return textPaint;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0076  */
    private final int nextAttachmentMetrics(Layout layout, Spanned text, float calculatedWidth, int calculatedLineCount, int i7, float verticalOffset, AttachmentMetrics metrics) {
        int iNextSpanTransition = text.nextSpanTransition(i7, text.length(), TextInlineViewPlaceholderSpan.class);
        TextInlineViewPlaceholderSpan[] textInlineViewPlaceholderSpanArr = (TextInlineViewPlaceholderSpan[]) text.getSpans(i7, iNextSpanTransition, TextInlineViewPlaceholderSpan.class);
        if (textInlineViewPlaceholderSpanArr.length == 0) {
            metrics.setWasFound(false);
            return iNextSpanTransition;
        }
        io.sentry.config.a.d(textInlineViewPlaceholderSpanArr.length == 1);
        TextInlineViewPlaceholderSpan textInlineViewPlaceholderSpan = textInlineViewPlaceholderSpanArr[0];
        int spanStart = text.getSpanStart(textInlineViewPlaceholderSpan);
        int lineForOffset = layout.getLineForOffset(spanStart);
        boolean z5 = layout.getEllipsisCount(lineForOffset) > 0;
        if (lineForOffset > calculatedLineCount) {
            metrics.setTop(Float.NaN);
            metrics.setLeft(Float.NaN);
        } else {
            if (z5) {
                if (spanStart >= layout.getEllipsisStart(lineForOffset) + layout.getLineStart(lineForOffset)) {
                    metrics.setTop(Float.NaN);
                    metrics.setLeft(Float.NaN);
                }
            }
            float width = textInlineViewPlaceholderSpan.getWidth();
            float height = textInlineViewPlaceholderSpan.getHeight();
            boolean zIsRtlCharAt = layout.isRtlCharAt(spanStart);
            float primaryHorizontal = (layout.getParagraphDirection(lineForOffset) == -1) == zIsRtlCharAt ? layout.getPrimaryHorizontal(spanStart) : layout.getSecondaryHorizontal(spanStart);
            if (zIsRtlCharAt) {
                primaryHorizontal -= width;
            }
            metrics.setTop(layout.getLineBaseline(lineForOffset) - height);
            metrics.setLeft(primaryHorizontal);
        }
        metrics.setTop(metrics.getTop() + verticalOffset);
        metrics.setWasFound(true);
        metrics.setWidth(textInlineViewPlaceholderSpan.getWidth());
        metrics.setHeight(textInlineViewPlaceholderSpan.getHeight());
        return iNextSpanTransition;
    }

    private final TextPaint scratchPaintWithAttributes(TextAttributeProps baseTextAttributes, AssetManager assets) {
        TextPaint textPaint = textPaintInstance.get();
        if (textPaint == null) {
            throw new IllegalStateException("Required value was null.");
        }
        TextPaint textPaint2 = textPaint;
        textPaint2.setTypeface(null);
        textPaint2.setTextSize(12.0f);
        textPaint2.setFakeBoldText(false);
        textPaint2.setTextSkewX(0.0f);
        updateTextPaint(textPaint2, baseTextAttributes, assets);
        return textPaint2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Method setUseBoundsForWidthMethod_delegate$lambda$0() {
        try {
            return StaticLayout.Builder.class.getMethod("setUseBoundsForWidth", Boolean.TYPE);
        } catch (ReflectiveOperationException unused) {
            return null;
        }
    }

    private final void updateTextPaint(TextPaint paint, TextAttributeProps baseTextAttributes, AssetManager assets) {
        if (baseTextAttributes.getFontSize() != -1) {
            paint.setTextSize(baseTextAttributes.getFontSize());
        }
        if (baseTextAttributes.getFontStyle() == -1 && baseTextAttributes.getFontWeight() == -1 && baseTextAttributes.getFontFamily() == null) {
            return;
        }
        Typeface typefaceApplyStyles = ReactTypefaceUtils.applyStyles(null, baseTextAttributes.getFontStyle(), baseTextAttributes.getFontWeight(), baseTextAttributes.getFontFamily(), assets);
        paint.setTypeface(typefaceApplyStyles);
        if (baseTextAttributes.getFontStyle() == -1 || baseTextAttributes.getFontStyle() == typefaceApplyStyles.getStyle()) {
            return;
        }
        int fontStyle = baseTextAttributes.getFontStyle() & (~typefaceApplyStyles.getStyle());
        paint.setFakeBoldText((fontStyle & 1) != 0);
        paint.setTextSkewX((fontStyle & 2) != 0 ? -0.25f : 0.0f);
    }

    public final void deleteCachedSpannableForTag(int reactTag) {
        tagToSpannableCache.remove(Integer.valueOf(reactTag));
    }

    @NotNull
    public final Spannable getOrCreateSpannableForText(@NotNull AssetManager assets, @NotNull MapBuffer attributedString, ReactTextViewManagerCallback reactTextViewManagerCallback) {
        Intrinsics.checkNotNullParameter(assets, "assets");
        Intrinsics.checkNotNullParameter(attributedString, "attributedString");
        if (!attributedString.contains(3)) {
            return createSpannableFromAttributedString(assets, attributedString.getMapBuffer(2), reactTextViewManagerCallback, null);
        }
        Spannable spannable = tagToSpannableCache.get(Integer.valueOf(attributedString.getInt(3)));
        if (spannable != null) {
            return spannable;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final boolean isRTL(@NotNull MapBuffer attributedString) {
        Intrinsics.checkNotNullParameter(attributedString, "attributedString");
        if (!attributedString.contains(2)) {
            return false;
        }
        MapBuffer mapBuffer = attributedString.getMapBuffer(2);
        if (mapBuffer.getCount() == 0) {
            return false;
        }
        MapBuffer mapBuffer2 = mapBuffer.getMapBuffer(0).getMapBuffer(5);
        return mapBuffer2.contains(23) && TextAttributeProps.INSTANCE.getLayoutDirection(mapBuffer2.getString(23)) == 1;
    }

    public final void setCachedSpannableForTag(int reactTag, @NotNull Spannable sp2) {
        Intrinsics.checkNotNullParameter(sp2, "sp");
        tagToSpannableCache.put(Integer.valueOf(reactTag), sp2);
    }

    private final CreateLayoutResult createLayout(Spannable text, TextPaint paint, MapBuffer attributedString, MapBuffer paragraphAttributes, float width, YogaMeasureMode widthYogaMeasureMode, float height, YogaMeasureMode heightYogaMeasureMode) {
        Layout.Alignment alignment;
        BoringLayout.Metrics metricsIsBoring = isBoring(text, paint);
        TextAttributeProps.Companion companion = TextAttributeProps.INSTANCE;
        int textBreakStrategy = companion.getTextBreakStrategy(paragraphAttributes.getString(2));
        boolean z5 = paragraphAttributes.contains(4) ? paragraphAttributes.getBoolean(4) : true;
        int hyphenationFrequency = companion.getHyphenationFrequency(paragraphAttributes.getString(5));
        boolean z6 = paragraphAttributes.contains(3) ? paragraphAttributes.getBoolean(3) : false;
        int i7 = paragraphAttributes.contains(0) ? paragraphAttributes.getInt(0) : -1;
        TextUtils.TruncateAt ellipsizeMode = paragraphAttributes.contains(1) ? companion.getEllipsizeMode(paragraphAttributes.getString(1)) : null;
        String textAlignmentAttr = getTextAlignmentAttr(attributedString);
        Layout.Alignment textAlignment = getTextAlignment(attributedString, text, textAlignmentAttr);
        int textJustificationMode = getTextJustificationMode(textAlignmentAttr);
        if (z6) {
            alignment = textAlignment;
            adjustSpannableFontToFit(text, width, YogaMeasureMode.f5461e, height, heightYogaMeasureMode, paragraphAttributes.contains(6) ? (float) paragraphAttributes.getDouble(6) : Float.NaN, i7, z5, textBreakStrategy, hyphenationFrequency, alignment, textJustificationMode, paint);
            i7 = i7;
            textJustificationMode = textJustificationMode;
        } else {
            alignment = textAlignment;
        }
        return new CreateLayoutResult(createLayout(text, metricsIsBoring, width, widthYogaMeasureMode, z5, textBreakStrategy, hyphenationFrequency, alignment, textJustificationMode, ellipsizeMode, i7, paint), textBreakStrategy, textJustificationMode);
    }
}
