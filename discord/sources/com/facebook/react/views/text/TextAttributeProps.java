package com.facebook.react.views.text;

import android.os.Build;
import android.text.TextUtils;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.common.mapbuffer.MapBuffer;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ReactAccessibilityDelegate;
import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.react.uimanager.ViewProps;
import com.rnlineargradient.LinearGradientManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kk.b;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.n0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import o8.a;
import org.jetbrains.annotations.NotNull;
import rn.d;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u0015\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u001a\u0018\u0000 \u0086\u00012\u00020\u0001:\u0002\u0086\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010A\u001a\u00020B2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002J\u0010\u0010H\u001a\u00020B2\u0006\u0010\u001c\u001a\u00020\u0005H\u0002J\u0012\u0010\\\u001a\u00020B2\b\u0010S\u001a\u0004\u0018\u00010]H\u0002J\u0012\u0010\\\u001a\u00020B2\b\u0010S\u001a\u0004\u0018\u00010^H\u0002J \u0010_\u001a\u00020B2\u0016\u0010`\u001a\u0012\u0012\u0004\u0012\u00020\u00180aj\b\u0012\u0004\u0012\u00020\u0018`bH\u0002J\u0012\u0010c\u001a\u00020B2\b\u0010d\u001a\u0004\u0018\u00010]H\u0002J\u0012\u0010c\u001a\u00020B2\b\u0010d\u001a\u0004\u0018\u00010^H\u0002J\u0012\u0010e\u001a\u00020B2\b\u0010f\u001a\u0004\u0018\u000108H\u0002J\u0012\u0010g\u001a\u00020B2\b\u0010h\u001a\u0004\u0018\u000108H\u0002J\u0012\u0010i\u001a\u00020B2\b\u0010j\u001a\u0004\u0018\u000108H\u0002J\u0012\u0010k\u001a\u00020B2\b\u0010l\u001a\u0004\u0018\u00010mH\u0002J\u0012\u0010t\u001a\u00020B2\b\u0010!\u001a\u0004\u0018\u000108H\u0002J\u0013\u0010\u0083\u0001\u001a\u00020B2\b\u0010#\u001a\u0004\u0018\u000108H\u0002J\u0013\u0010\u0084\u0001\u001a\u00020B2\b\u0010-\u001a\u0004\u0018\u000108H\u0002J\u0013\u0010\u0085\u0001\u001a\u00020B2\b\u00101\u001a\u0004\u0018\u000108H\u0002J\u0011\u0010\u0085\u0001\u001a\u00020B2\u0006\u00101\u001a\u000200H\u0002R$\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR$\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000b@BX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\r\"\u0004\b\u0010\u0010\u0011R$\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\b\"\u0004\b\u0014\u0010\nR\u001e\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\rR\u001e\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\bR\u001e\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0004\u001a\u00020\u0018@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u0004\u001a\u00020\u0018@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u000e\u0010\u001e\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010!\u001a\u00020\u00182\u0006\u0010\u0004\u001a\u00020\u0018@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001bR\u001a\u0010#\u001a\u00020$X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001e\u0010)\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\rR\u001e\u0010*\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\rR\u000e\u0010+\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010-\u001a\u0004\u0018\u00010,2\b\u0010\u0004\u001a\u0004\u0018\u00010,@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\"\u00101\u001a\u0004\u0018\u0001002\b\u0010\u0004\u001a\u0004\u0018\u000100@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u001e\u00104\u001a\u00020\u00182\u0006\u0010\u0004\u001a\u00020\u0018@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\u001bR\u001e\u00106\u001a\u00020\u00182\u0006\u0010\u0004\u001a\u00020\u0018@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b7\u0010\u001bR\"\u00109\u001a\u0004\u0018\u0001082\b\u0010\u0004\u001a\u0004\u0018\u000108@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\"\u0010<\u001a\u0004\u0018\u0001082\b\u0010\u0004\u001a\u0004\u0018\u000108@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b=\u0010;R\u001a\u0010>\u001a\u00020\u00058FX\u0087\u0004¢\u0006\f\u0012\u0004\b?\u0010\u0003\u001a\u0004\b@\u0010\bR$\u0010C\u001a\u00020\u00052\u0006\u0010C\u001a\u00020\u00058F@BX\u0086\u000e¢\u0006\f\u001a\u0004\bD\u0010\b\"\u0004\bE\u0010\nR\u0011\u0010F\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\bG\u0010\bR*\u0010I\u001a\u0004\u0018\u00010\u00182\b\u0010\u0004\u001a\u0004\u0018\u00010\u0018@BX\u0086\u000e¢\u0006\u0010\n\u0002\u0010N\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR*\u0010O\u001a\u0004\u0018\u00010\u00182\b\u0010I\u001a\u0004\u0018\u00010\u0018@BX\u0086\u000e¢\u0006\u0010\n\u0002\u0010N\u001a\u0004\bP\u0010K\"\u0004\bQ\u0010MR\"\u0010S\u001a\u0004\u0018\u00010R2\b\u0010\u0004\u001a\u0004\u0018\u00010R@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\bT\u0010UR\u001e\u0010V\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\bW\u0010\bR\u001e\u0010X\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\bY\u0010\bR\"\u0010Z\u001a\u0004\u0018\u0001082\b\u0010\u0004\u001a\u0004\u0018\u000108@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b[\u0010;R$\u0010n\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bo\u0010\b\"\u0004\bp\u0010\nR$\u0010q\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\br\u0010\b\"\u0004\bs\u0010\nR$\u0010u\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bv\u0010\b\"\u0004\bw\u0010\nR$\u0010x\u001a\u00020\u00182\u0006\u0010\u0004\u001a\u00020\u0018@BX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\by\u0010\u001b\"\u0004\bz\u0010{R$\u0010|\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b}\u0010\b\"\u0004\b~\u0010\nR\u001e\u0010\u007f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u007f\u0010\rR'\u0010\u0080\u0001\u001a\u00020\u00182\u0006\u0010\u0004\u001a\u00020\u0018@BX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0081\u0001\u0010\u001b\"\u0005\b\u0082\u0001\u0010{¨\u0006\u0087\u0001"}, d2 = {"Lcom/facebook/react/views/text/TextAttributeProps;", "", "<init>", "()V", "value", "", ViewProps.LINE_HEIGHT, "getLineHeight", "()F", "setLineHeight", "(F)V", "", "isColorSet", "()Z", ViewProps.ALLOW_FONT_SCALING, "getAllowFontScaling", "setAllowFontScaling", "(Z)V", ViewProps.MAX_FONT_SIZE_MULTIPLIER, "getMaxFontSizeMultiplier", "setMaxFontSizeMultiplier", "isBackgroundColorSet", ViewProps.OPACITY, "getOpacity", "", ViewProps.NUMBER_OF_LINES, "getNumberOfLines", "()I", ViewProps.FONT_SIZE, "getFontSize", "fontSizeInput", "lineHeightInput", "letterSpacingInput", ViewProps.LAYOUT_DIRECTION, "getLayoutDirection", TextAttributeProps.PROP_TEXT_TRANSFORM, "Lcom/facebook/react/views/text/TextTransform;", "getTextTransform$ReactAndroid_release", "()Lcom/facebook/react/views/text/TextTransform;", "setTextTransform$ReactAndroid_release", "(Lcom/facebook/react/views/text/TextTransform;)V", "isUnderlineTextDecorationSet", "isLineThroughTextDecorationSet", ViewProps.INCLUDE_FONT_PADDING, "Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$AccessibilityRole;", ViewProps.ACCESSIBILITY_ROLE, "getAccessibilityRole", "()Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$AccessibilityRole;", "Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$Role;", ViewProps.ROLE, "getRole", "()Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$Role;", ViewProps.FONT_STYLE, "getFontStyle", ViewProps.FONT_WEIGHT, "getFontWeight", "", ViewProps.FONT_FAMILY, "getFontFamily", "()Ljava/lang/String;", "fontFeatureSettings", "getFontFeatureSettings", "effectiveLineHeight", "getEffectiveLineHeight$annotations", "getEffectiveLineHeight", "setNumberOfLines", "", ViewProps.LETTER_SPACING, "getLetterSpacing", "setLetterSpacing", "effectiveLetterSpacing", "getEffectiveLetterSpacing", "setFontSize", ViewProps.COLOR, "getColor", "()Ljava/lang/Integer;", "setColor", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", ViewProps.BACKGROUND_COLOR, "getBackgroundColor", "setBackgroundColor", "", "gradientColors", "getGradientColors", "()[I", "gradientAngle", "getGradientAngle", "gradientLength", "getGradientLength", "gradientMode", "getGradientMode", "setGradientColors", "Lcom/facebook/react/bridge/ReadableArray;", "Lcom/facebook/react/common/mapbuffer/MapBuffer;", "setGradientColorsFromList", LinearGradientManager.PROP_COLORS, "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "setFontVariant", ViewProps.FONT_VARIANT, "setFontWeight", "fontWeightString", "setFontStyle", "fontStyleString", "setTextDecorationLine", "textDecorationLineString", "setTextShadowOffset", "offsetMap", "Lcom/facebook/react/bridge/ReadableMap;", "textShadowOffsetDx", "getTextShadowOffsetDx", "setTextShadowOffsetDx", "textShadowOffsetDy", "getTextShadowOffsetDy", "setTextShadowOffsetDy", "setLayoutDirection", TextAttributeProps.PROP_SHADOW_RADIUS, "getTextShadowRadius", "setTextShadowRadius", TextAttributeProps.PROP_SHADOW_COLOR, "getTextShadowColor", "setTextShadowColor", "(I)V", "textStrokeWidth", "getTextStrokeWidth", "setTextStrokeWidth", "isTextStrokeColorSet", "textStrokeColor", "getTextStrokeColor", "setTextStrokeColor", "setTextTransform", "setAccessibilityRole", "setRole", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTextAttributeProps.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextAttributeProps.kt\ncom/facebook/react/views/text/TextAttributeProps\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,644:1\n1#2:645\n739#3,9:646\n37#4:655\n36#4,3:656\n*S KotlinDebug\n*F\n+ 1 TextAttributeProps.kt\ncom/facebook/react/views/text/TextAttributeProps\n*L\n300#1:646,9\n301#1:655\n301#1:656,3\n*E\n"})
public final class TextAttributeProps {
    private static final int DEFAULT_BREAK_STRATEGY = 1;
    private static final int DEFAULT_HYPHENATION_FREQUENCY = 0;
    private static final int DEFAULT_TEXT_SHADOW_COLOR = 1426063360;

    @NotNull
    private static final String PROP_SHADOW_COLOR = "textShadowColor";

    @NotNull
    private static final String PROP_SHADOW_OFFSET = "textShadowOffset";

    @NotNull
    private static final String PROP_SHADOW_OFFSET_HEIGHT = "height";

    @NotNull
    private static final String PROP_SHADOW_OFFSET_WIDTH = "width";

    @NotNull
    private static final String PROP_SHADOW_RADIUS = "textShadowRadius";

    @NotNull
    private static final String PROP_TEXT_TRANSFORM = "textTransform";
    public static final int TA_KEY_ACCESSIBILITY_ROLE = 24;
    public static final int TA_KEY_ALIGNMENT = 12;
    public static final int TA_KEY_ALLOW_FONT_SCALING = 9;
    public static final int TA_KEY_BACKGROUND_COLOR = 1;
    public static final int TA_KEY_BEST_WRITING_DIRECTION = 13;
    public static final int TA_KEY_FONT_FAMILY = 3;
    public static final int TA_KEY_FONT_SIZE = 4;
    public static final int TA_KEY_FONT_SIZE_MULTIPLIER = 5;
    public static final int TA_KEY_FONT_STYLE = 7;
    public static final int TA_KEY_FONT_VARIANT = 8;
    public static final int TA_KEY_FONT_WEIGHT = 6;
    public static final int TA_KEY_FOREGROUND_COLOR = 0;
    public static final int TA_KEY_GRADIENT_ANGLE = 33;
    public static final int TA_KEY_GRADIENT_COLORS = 30;
    public static final int TA_KEY_GRADIENT_LENGTH = 36;
    public static final int TA_KEY_GRADIENT_MODE = 35;
    public static final int TA_KEY_GRADIENT_WIDTH = 34;
    public static final int TA_KEY_IS_HIGHLIGHTED = 22;
    public static final int TA_KEY_LAYOUT_DIRECTION = 23;
    public static final int TA_KEY_LETTER_SPACING = 10;
    public static final int TA_KEY_LINE_BREAK_STRATEGY = 25;
    public static final int TA_KEY_LINE_HEIGHT = 11;
    public static final int TA_KEY_MAX_FONT_SIZE_MULTIPLIER = 29;
    public static final int TA_KEY_OPACITY = 2;
    public static final int TA_KEY_ROLE = 26;
    public static final int TA_KEY_TEXT_DECORATION_COLOR = 14;
    public static final int TA_KEY_TEXT_DECORATION_LINE = 15;
    public static final int TA_KEY_TEXT_DECORATION_STYLE = 16;
    public static final int TA_KEY_TEXT_SHADOW_COLOR = 19;
    public static final int TA_KEY_TEXT_SHADOW_OFFSET_DX = 20;
    public static final int TA_KEY_TEXT_SHADOW_OFFSET_DY = 21;
    public static final int TA_KEY_TEXT_SHADOW_RADIUS = 18;
    public static final int TA_KEY_TEXT_STROKE_COLOR = 32;
    public static final int TA_KEY_TEXT_STROKE_WIDTH = 31;
    public static final int TA_KEY_TEXT_TRANSFORM = 27;
    public static final int UNSET = -1;
    private ReactAccessibilityDelegate.AccessibilityRole accessibilityRole;
    private boolean allowFontScaling;
    private Integer backgroundColor;
    private Integer color;
    private String fontFamily;
    private String fontFeatureSettings;
    private int fontSize;
    private float fontSizeInput;
    private int fontStyle;
    private int fontWeight;
    private float gradientAngle;
    private int[] gradientColors;
    private float gradientLength;
    private String gradientMode;
    private boolean includeFontPadding;
    private boolean isBackgroundColorSet;
    private boolean isColorSet;
    private boolean isLineThroughTextDecorationSet;
    private boolean isTextStrokeColorSet;
    private boolean isUnderlineTextDecorationSet;
    private int layoutDirection;
    private float letterSpacingInput;
    private float lineHeight;
    private float lineHeightInput;
    private float maxFontSizeMultiplier;
    private int numberOfLines;
    private float opacity;
    private ReactAccessibilityDelegate.Role role;
    private int textShadowColor;
    private float textShadowOffsetDx;
    private float textShadowOffsetDy;
    private float textShadowRadius;
    private int textStrokeColor;
    private float textStrokeWidth;

    @NotNull
    private TextTransform textTransform;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int DEFAULT_JUSTIFICATION_MODE = 0;

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b$\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u00104\u001a\u0002052\u0006\u00106\u001a\u000207J\u000e\u00108\u001a\u0002052\u0006\u00106\u001a\u000209J\u001e\u0010:\u001a\u00020\u00052\u0006\u00106\u001a\u0002092\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020\u0005J\u0016\u0010>\u001a\u00020\u00052\u0006\u00106\u001a\u0002092\u0006\u0010=\u001a\u00020\u0005J \u0010?\u001a\u00020<2\u0006\u00106\u001a\u0002092\u0006\u0010@\u001a\u00020*2\u0006\u0010=\u001a\u00020<H\u0002J\u001a\u0010A\u001a\u0004\u0018\u00010*2\u0006\u00106\u001a\u0002092\u0006\u0010@\u001a\u00020*H\u0002J \u0010B\u001a\u00020\u00052\u0006\u00106\u001a\u0002092\u0006\u0010@\u001a\u00020*2\u0006\u0010=\u001a\u00020\u0005H\u0002J \u0010C\u001a\u00020D2\u0006\u00106\u001a\u0002092\u0006\u0010@\u001a\u00020*2\u0006\u0010=\u001a\u00020DH\u0002J\u001a\u0010E\u001a\u0004\u0018\u00010F2\u0006\u00106\u001a\u0002092\u0006\u0010@\u001a\u00020*H\u0002J\u0010\u0010G\u001a\u00020\u00052\b\u0010H\u001a\u0004\u0018\u00010*J\u0010\u0010I\u001a\u00020\u00052\b\u0010J\u001a\u0004\u0018\u00010*J\u0010\u0010K\u001a\u00020\u00052\b\u0010L\u001a\u0004\u0018\u00010*J\u0012\u0010M\u001a\u0004\u0018\u00010N2\b\u0010O\u001a\u0004\u0018\u00010*R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020*X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020*X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020*X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020*X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020*X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020*X\u0082T¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006P"}, d2 = {"Lcom/facebook/react/views/text/TextAttributeProps$Companion;", "", "<init>", "()V", "TA_KEY_FOREGROUND_COLOR", "", "TA_KEY_BACKGROUND_COLOR", "TA_KEY_OPACITY", "TA_KEY_FONT_FAMILY", "TA_KEY_FONT_SIZE", "TA_KEY_FONT_SIZE_MULTIPLIER", "TA_KEY_FONT_WEIGHT", "TA_KEY_FONT_STYLE", "TA_KEY_FONT_VARIANT", "TA_KEY_ALLOW_FONT_SCALING", "TA_KEY_LETTER_SPACING", "TA_KEY_LINE_HEIGHT", "TA_KEY_ALIGNMENT", "TA_KEY_BEST_WRITING_DIRECTION", "TA_KEY_TEXT_DECORATION_COLOR", "TA_KEY_TEXT_DECORATION_LINE", "TA_KEY_TEXT_DECORATION_STYLE", "TA_KEY_TEXT_SHADOW_RADIUS", "TA_KEY_TEXT_SHADOW_COLOR", "TA_KEY_TEXT_SHADOW_OFFSET_DX", "TA_KEY_TEXT_SHADOW_OFFSET_DY", "TA_KEY_IS_HIGHLIGHTED", "TA_KEY_LAYOUT_DIRECTION", "TA_KEY_ACCESSIBILITY_ROLE", "TA_KEY_LINE_BREAK_STRATEGY", "TA_KEY_ROLE", "TA_KEY_TEXT_TRANSFORM", "TA_KEY_MAX_FONT_SIZE_MULTIPLIER", "TA_KEY_GRADIENT_COLORS", "TA_KEY_TEXT_STROKE_WIDTH", "TA_KEY_TEXT_STROKE_COLOR", "TA_KEY_GRADIENT_ANGLE", "TA_KEY_GRADIENT_WIDTH", "TA_KEY_GRADIENT_MODE", "TA_KEY_GRADIENT_LENGTH", "UNSET", "PROP_SHADOW_OFFSET", "", "PROP_SHADOW_OFFSET_WIDTH", "PROP_SHADOW_OFFSET_HEIGHT", "PROP_SHADOW_RADIUS", "PROP_SHADOW_COLOR", "PROP_TEXT_TRANSFORM", "DEFAULT_TEXT_SHADOW_COLOR", "DEFAULT_JUSTIFICATION_MODE", "DEFAULT_BREAK_STRATEGY", "DEFAULT_HYPHENATION_FREQUENCY", "fromMapBuffer", "Lcom/facebook/react/views/text/TextAttributeProps;", "props", "Lcom/facebook/react/common/mapbuffer/MapBuffer;", "fromReadableMap", "Lcom/facebook/react/uimanager/ReactStylesDiffMap;", "getTextAlignment", "isRTL", "", "defaultValue", "getJustificationMode", "getBooleanProp", StackTraceHelper.NAME_KEY, "getStringProp", "getIntProp", "getFloatProp", "", "getArrayProp", "Lcom/facebook/react/bridge/ReadableArray;", "getLayoutDirection", ViewProps.LAYOUT_DIRECTION, "getTextBreakStrategy", ViewProps.TEXT_BREAK_STRATEGY, "getHyphenationFrequency", "hyphenationFrequency", "getEllipsizeMode", "Landroid/text/TextUtils$TruncateAt;", ViewProps.ELLIPSIZE_MODE, "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final ReadableArray getArrayProp(ReactStylesDiffMap props, String name) {
            if (props.hasKey(name)) {
                return props.getArray(name);
            }
            return null;
        }

        private final boolean getBooleanProp(ReactStylesDiffMap props, String name, boolean defaultValue) {
            return props.hasKey(name) ? props.getBoolean(name, defaultValue) : defaultValue;
        }

        private final float getFloatProp(ReactStylesDiffMap props, String name, float defaultValue) {
            return props.hasKey(name) ? props.getFloat(name, defaultValue) : defaultValue;
        }

        private final int getIntProp(ReactStylesDiffMap props, String name, int defaultValue) {
            return props.hasKey(name) ? props.getInt(name, defaultValue) : defaultValue;
        }

        private final String getStringProp(ReactStylesDiffMap props, String name) {
            if (props.hasKey(name)) {
                return props.getString(name);
            }
            return null;
        }

        @NotNull
        public final TextAttributeProps fromMapBuffer(@NotNull MapBuffer props) {
            Intrinsics.checkNotNullParameter(props, "props");
            TextAttributeProps textAttributeProps = new TextAttributeProps(null);
            for (MapBuffer.Entry entry : props) {
                switch (entry.getKey()) {
                    case 0:
                        textAttributeProps.setColor(Integer.valueOf(entry.getIntValue()));
                        break;
                    case 1:
                        textAttributeProps.setBackgroundColor(Integer.valueOf(entry.getIntValue()));
                        break;
                    case 2:
                        textAttributeProps.opacity = (float) entry.getDoubleValue();
                        break;
                    case 3:
                        textAttributeProps.fontFamily = entry.getStringValue();
                        break;
                    case 4:
                        textAttributeProps.setFontSize((float) entry.getDoubleValue());
                        break;
                    case 6:
                        textAttributeProps.setFontWeight(entry.getStringValue());
                        break;
                    case 7:
                        textAttributeProps.setFontStyle(entry.getStringValue());
                        break;
                    case 8:
                        textAttributeProps.setFontVariant(entry.getMapBufferValue());
                        break;
                    case 9:
                        textAttributeProps.setAllowFontScaling(entry.getBooleanValue());
                        break;
                    case 10:
                        textAttributeProps.setLetterSpacing((float) entry.getDoubleValue());
                        break;
                    case 11:
                        textAttributeProps.setLineHeight((float) entry.getDoubleValue());
                        break;
                    case 15:
                        textAttributeProps.setTextDecorationLine(entry.getStringValue());
                        break;
                    case 18:
                        textAttributeProps.setTextShadowRadius((float) entry.getDoubleValue());
                        break;
                    case 19:
                        textAttributeProps.setTextShadowColor(entry.getIntValue());
                        break;
                    case 20:
                        textAttributeProps.setTextShadowOffsetDx((float) entry.getDoubleValue());
                        break;
                    case 21:
                        textAttributeProps.setTextShadowOffsetDy((float) entry.getDoubleValue());
                        break;
                    case 23:
                        textAttributeProps.setLayoutDirection(entry.getStringValue());
                        break;
                    case 24:
                        textAttributeProps.setAccessibilityRole(entry.getStringValue());
                        break;
                    case 26:
                        textAttributeProps.setRole((ReactAccessibilityDelegate.Role) ReactAccessibilityDelegate.Role.getEntries().get(entry.getIntValue()));
                        break;
                    case 27:
                        textAttributeProps.setTextTransform(entry.getStringValue());
                        break;
                    case 29:
                        textAttributeProps.setMaxFontSizeMultiplier((float) entry.getDoubleValue());
                        break;
                    case 30:
                        textAttributeProps.setGradientColors(entry.getMapBufferValue());
                        break;
                    case 31:
                        textAttributeProps.setTextStrokeWidth((float) entry.getDoubleValue());
                        break;
                    case 32:
                        textAttributeProps.setTextStrokeColor(entry.getIntValue());
                        break;
                    case 33:
                        textAttributeProps.gradientAngle = (float) entry.getDoubleValue();
                        break;
                    case 35:
                        textAttributeProps.gradientMode = entry.getStringValue();
                        break;
                    case 36:
                        textAttributeProps.gradientLength = (float) entry.getDoubleValue();
                        break;
                }
            }
            return textAttributeProps;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final TextAttributeProps fromReadableMap(@NotNull ReactStylesDiffMap props) {
            Intrinsics.checkNotNullParameter(props, "props");
            TextAttributeProps textAttributeProps = new TextAttributeProps(0 == true ? 1 : 0);
            textAttributeProps.setNumberOfLines(getIntProp(props, ViewProps.NUMBER_OF_LINES, -1));
            textAttributeProps.setLineHeight(getFloatProp(props, ViewProps.LINE_HEIGHT, -1.0f));
            textAttributeProps.setLetterSpacing(getFloatProp(props, ViewProps.LETTER_SPACING, Float.NaN));
            textAttributeProps.setAllowFontScaling(getBooleanProp(props, ViewProps.ALLOW_FONT_SCALING, true));
            textAttributeProps.setMaxFontSizeMultiplier(getFloatProp(props, ViewProps.MAX_FONT_SIZE_MULTIPLIER, Float.NaN));
            textAttributeProps.setFontSize(getFloatProp(props, ViewProps.FONT_SIZE, -1.0f));
            textAttributeProps.setColor(props.hasKey(ViewProps.COLOR) ? Integer.valueOf(props.getInt(ViewProps.COLOR, 0)) : null);
            textAttributeProps.setColor(props.hasKey(ViewProps.FOREGROUND_COLOR) ? Integer.valueOf(props.getInt(ViewProps.FOREGROUND_COLOR, 0)) : null);
            textAttributeProps.setBackgroundColor(props.hasKey(ViewProps.BACKGROUND_COLOR) ? Integer.valueOf(props.getInt(ViewProps.BACKGROUND_COLOR, 0)) : null);
            textAttributeProps.opacity = getFloatProp(props, ViewProps.OPACITY, Float.NaN);
            textAttributeProps.fontFamily = getStringProp(props, ViewProps.FONT_FAMILY);
            textAttributeProps.setFontWeight(getStringProp(props, ViewProps.FONT_WEIGHT));
            textAttributeProps.setFontStyle(getStringProp(props, ViewProps.FONT_STYLE));
            textAttributeProps.setFontVariant(getArrayProp(props, ViewProps.FONT_VARIANT));
            textAttributeProps.includeFontPadding = getBooleanProp(props, ViewProps.INCLUDE_FONT_PADDING, true);
            textAttributeProps.setTextDecorationLine(getStringProp(props, ViewProps.TEXT_DECORATION_LINE));
            textAttributeProps.setTextShadowOffset(props.hasKey(TextAttributeProps.PROP_SHADOW_OFFSET) ? props.getMap(TextAttributeProps.PROP_SHADOW_OFFSET) : null);
            textAttributeProps.setTextShadowRadius(getFloatProp(props, TextAttributeProps.PROP_SHADOW_RADIUS, 1.0f));
            textAttributeProps.setTextShadowColor(getIntProp(props, TextAttributeProps.PROP_SHADOW_COLOR, TextAttributeProps.DEFAULT_TEXT_SHADOW_COLOR));
            textAttributeProps.setTextTransform(getStringProp(props, TextAttributeProps.PROP_TEXT_TRANSFORM));
            textAttributeProps.setLayoutDirection(getStringProp(props, ViewProps.LAYOUT_DIRECTION));
            textAttributeProps.setAccessibilityRole(getStringProp(props, ViewProps.ACCESSIBILITY_ROLE));
            textAttributeProps.setRole(getStringProp(props, ViewProps.ROLE));
            textAttributeProps.setGradientColors(getArrayProp(props, "gradientColors"));
            textAttributeProps.gradientAngle = getFloatProp(props, "gradientAngle", Float.NaN);
            textAttributeProps.gradientLength = getFloatProp(props, "gradientLength", Float.NaN);
            textAttributeProps.gradientMode = getStringProp(props, "gradientMode");
            textAttributeProps.setTextStrokeWidth(getFloatProp(props, "textStrokeWidth", Float.NaN));
            if (props.hasKey("textStrokeColor")) {
                textAttributeProps.setTextStrokeColor(props.getInt("textStrokeColor", 0));
            }
            return textAttributeProps;
        }

        public final TextUtils.TruncateAt getEllipsizeMode(String ellipsizeMode) {
            if (ellipsizeMode == null) {
                return null;
            }
            switch (ellipsizeMode.hashCode()) {
                case -1074341483:
                    if (ellipsizeMode.equals("middle")) {
                        return TextUtils.TruncateAt.MIDDLE;
                    }
                    return null;
                case 3056464:
                    ellipsizeMode.equals("clip");
                    return null;
                case 3198432:
                    if (ellipsizeMode.equals("head")) {
                        return TextUtils.TruncateAt.START;
                    }
                    return null;
                case 3552336:
                    if (ellipsizeMode.equals("tail")) {
                        return TextUtils.TruncateAt.END;
                    }
                    return null;
                default:
                    return null;
            }
        }

        public final int getHyphenationFrequency(String hyphenationFrequency) {
            if (hyphenationFrequency == null || Intrinsics.areEqual(hyphenationFrequency, ViewProps.NONE)) {
                return 0;
            }
            return Intrinsics.areEqual(hyphenationFrequency, "normal") ? 1 : 2;
        }

        public final int getJustificationMode(@NotNull ReactStylesDiffMap props, int defaultValue) {
            Intrinsics.checkNotNullParameter(props, "props");
            if (!props.hasKey(ViewProps.TEXT_ALIGN)) {
                return defaultValue;
            }
            if (!Intrinsics.areEqual("justify", props.getString(ViewProps.TEXT_ALIGN)) || Build.VERSION.SDK_INT < 26) {
                return TextAttributeProps.DEFAULT_JUSTIFICATION_MODE;
            }
            return 1;
        }

        public final int getLayoutDirection(String layoutDirection) {
            if (layoutDirection != null) {
                int iHashCode = layoutDirection.hashCode();
                if (iHashCode != -1038130864) {
                    if (iHashCode != 107498) {
                        if (iHashCode == 113258 && layoutDirection.equals("rtl")) {
                            return 1;
                        }
                    } else if (layoutDirection.equals("ltr")) {
                        return 0;
                    }
                } else if (!layoutDirection.equals("undefined")) {
                }
                a.v(ReactConstants.TAG, "Invalid layoutDirection: ".concat(layoutDirection));
            }
            return -1;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x003f, code lost:
        
            if (r4.equals("auto") == false) goto L31;
         */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final int getTextAlignment(@org.jetbrains.annotations.NotNull com.facebook.react.uimanager.ReactStylesDiffMap r4, boolean r5, int r6) {
            /*
                r3 = this;
                java.lang.String r0 = "props"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                java.lang.String r0 = "textAlign"
                boolean r1 = r4.hasKey(r0)
                if (r1 != 0) goto Le
                return r6
            Le:
                java.lang.String r4 = r4.getString(r0)
                r6 = 0
                if (r4 == 0) goto L62
                int r0 = r4.hashCode()
                r1 = 5
                r2 = 3
                switch(r0) {
                    case -1364013995: goto L4c;
                    case -1249482096: goto L42;
                    case 3005871: goto L39;
                    case 3317767: goto L2c;
                    case 108511772: goto L1f;
                    default: goto L1e;
                }
            L1e:
                goto L54
            L1f:
                java.lang.String r0 = "right"
                boolean r0 = r4.equals(r0)
                if (r0 != 0) goto L28
                goto L54
            L28:
                if (r5 == 0) goto L2b
                return r2
            L2b:
                return r1
            L2c:
                java.lang.String r0 = "left"
                boolean r0 = r4.equals(r0)
                if (r0 != 0) goto L35
                goto L54
            L35:
                if (r5 == 0) goto L38
                return r1
            L38:
                return r2
            L39:
                java.lang.String r5 = "auto"
                boolean r5 = r4.equals(r5)
                if (r5 != 0) goto L62
                goto L54
            L42:
                java.lang.String r5 = "justify"
                boolean r5 = r4.equals(r5)
                if (r5 != 0) goto L4b
                goto L54
            L4b:
                return r2
            L4c:
                java.lang.String r5 = "center"
                boolean r5 = r4.equals(r5)
                if (r5 != 0) goto L60
            L54:
                java.lang.String r5 = "Invalid textAlign: "
                java.lang.String r4 = r5.concat(r4)
                java.lang.String r5 = "ReactNative"
                o8.a.v(r5, r4)
                return r6
            L60:
                r4 = 1
                return r4
            L62:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.text.TextAttributeProps.Companion.getTextAlignment(com.facebook.react.uimanager.ReactStylesDiffMap, boolean, int):int");
        }

        public final int getTextBreakStrategy(String textBreakStrategy) {
            if (textBreakStrategy == null) {
                return 1;
            }
            if (Intrinsics.areEqual(textBreakStrategy, "simple")) {
                return 0;
            }
            return Intrinsics.areEqual(textBreakStrategy, "balanced") ? 2 : 1;
        }

        private Companion() {
        }
    }

    public /* synthetic */ TextAttributeProps(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @d
    public static /* synthetic */ void getEffectiveLineHeight$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAccessibilityRole(String accessibilityRole) {
        this.accessibilityRole = accessibilityRole == null ? null : ReactAccessibilityDelegate.AccessibilityRole.INSTANCE.fromValue(accessibilityRole);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAllowFontScaling(boolean z5) {
        if (z5 != this.allowFontScaling) {
            this.allowFontScaling = z5;
            setFontSize(this.fontSizeInput);
            setLineHeight(this.lineHeightInput);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setBackgroundColor(Integer num) {
        this.isBackgroundColorSet = num != null;
        if (num != null) {
            this.backgroundColor = num;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setColor(Integer num) {
        this.isColorSet = num != null;
        if (num != null) {
            this.color = num;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setFontSize(float fontSize) {
        this.fontSizeInput = fontSize;
        if (fontSize != -1.0f) {
            fontSize = (float) (this.allowFontScaling ? Math.ceil(PixelUtil.toPixelFromSP(fontSize, this.maxFontSizeMultiplier)) : Math.ceil(PixelUtil.toPixelFromDIP(fontSize)));
        }
        this.fontSize = (int) fontSize;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setFontStyle(String fontStyleString) {
        this.fontStyle = ReactTypefaceUtils.parseFontStyle(fontStyleString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setFontVariant(ReadableArray fontVariant) {
        this.fontFeatureSettings = ReactTypefaceUtils.parseFontVariant(fontVariant);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setFontWeight(String fontWeightString) {
        this.fontWeight = ReactTypefaceUtils.parseFontWeight(fontWeightString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setGradientColors(ReadableArray gradientColors) {
        if (gradientColors == null) {
            return;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        int size = gradientColors.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (!gradientColors.isNull(i7) && gradientColors.getType(i7) == ReadableType.Number) {
                arrayList.add(Integer.valueOf(gradientColors.getInt(i7)));
            }
        }
        setGradientColorsFromList(arrayList);
    }

    private final void setGradientColorsFromList(ArrayList<Integer> colors) {
        if (colors.size() >= 2) {
            this.gradientColors = CollectionsKt.h0(colors);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setLayoutDirection(String layoutDirection) {
        this.layoutDirection = INSTANCE.getLayoutDirection(layoutDirection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setLetterSpacing(float f2) {
        this.letterSpacingInput = f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setLineHeight(float f2) {
        float pixelFromSP$default;
        this.lineHeightInput = f2;
        if (f2 == -1.0f) {
            pixelFromSP$default = Float.NaN;
        } else {
            pixelFromSP$default = this.allowFontScaling ? PixelUtil.toPixelFromSP$default(f2, 0.0f, 2, null) : PixelUtil.toPixelFromDIP(f2);
        }
        this.lineHeight = pixelFromSP$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setMaxFontSizeMultiplier(float f2) {
        if (f2 == this.maxFontSizeMultiplier) {
            return;
        }
        this.maxFontSizeMultiplier = f2;
        setFontSize(this.fontSizeInput);
        setLineHeight(this.lineHeightInput);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setNumberOfLines(int numberOfLines) {
        if (numberOfLines == 0) {
            numberOfLines = -1;
        }
        this.numberOfLines = numberOfLines;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setRole(String role) {
        if (role == null) {
            this.role = null;
        } else {
            this.role = ReactAccessibilityDelegate.Role.INSTANCE.fromValue(role);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTextDecorationLine(String textDecorationLineString) {
        Collection collectionF0;
        this.isUnderlineTextDecorationSet = false;
        this.isLineThroughTextDecorationSet = false;
        if (textDecorationLineString != null) {
            List listF = new Regex("-").f(textDecorationLineString);
            if (listF.isEmpty()) {
                collectionF0 = n0.f14659d;
                break;
            }
            ListIterator listIterator = listF.listIterator(listF.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    if (((String) listIterator.previous()).length() != 0) {
                        collectionF0 = CollectionsKt.f0(listF, listIterator.nextIndex() + 1);
                        break;
                    }
                } else {
                    collectionF0 = n0.f14659d;
                    break;
                }
            }
            for (String str : (String[]) collectionF0.toArray(new String[0])) {
                if (Intrinsics.areEqual("underline", str)) {
                    this.isUnderlineTextDecorationSet = true;
                } else if (Intrinsics.areEqual("strikethrough", str)) {
                    this.isLineThroughTextDecorationSet = true;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTextShadowColor(int i7) {
        if (i7 != this.textShadowColor) {
            this.textShadowColor = i7;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTextShadowOffset(ReadableMap offsetMap) {
        setTextShadowOffsetDx(0.0f);
        setTextShadowOffsetDy(0.0f);
        if (offsetMap != null) {
            if (offsetMap.hasKey("width") && !offsetMap.isNull("width")) {
                setTextShadowOffsetDx(PixelUtil.toPixelFromDIP(offsetMap.getDouble("width")));
            }
            if (!offsetMap.hasKey("height") || offsetMap.isNull("height")) {
                return;
            }
            setTextShadowOffsetDy(PixelUtil.toPixelFromDIP(offsetMap.getDouble("height")));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTextShadowOffsetDx(float f2) {
        this.textShadowOffsetDx = PixelUtil.toPixelFromDIP(f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTextShadowOffsetDy(float f2) {
        this.textShadowOffsetDy = PixelUtil.toPixelFromDIP(f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTextShadowRadius(float f2) {
        if (f2 == this.textShadowRadius) {
            return;
        }
        this.textShadowRadius = f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTextStrokeColor(int i7) {
        if (i7 != this.textStrokeColor) {
            this.textStrokeColor = i7;
            this.isTextStrokeColorSet = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTextStrokeWidth(float f2) {
        this.textStrokeWidth = PixelUtil.toPixelFromDIP(f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:19:0x0033  */
    /* JADX WARN: Code duplicated, block: B:21:0x0044  */
    public final void setTextTransform(String textTransform) {
        TextTransform textTransform2;
        if (textTransform != null) {
            switch (textTransform) {
                case "capitalize":
                    textTransform2 = TextTransform.CAPITALIZE;
                    break;
                case "lowercase":
                    textTransform2 = TextTransform.LOWERCASE;
                    break;
                case "none":
                    textTransform2 = TextTransform.NONE;
                    break;
                case "uppercase":
                    textTransform2 = TextTransform.UPPERCASE;
                    break;
                default:
                    a.v(ReactConstants.TAG, "Invalid textTransform: ".concat(textTransform));
                    textTransform2 = TextTransform.NONE;
                    break;
            }
        } else {
            textTransform2 = TextTransform.NONE;
        }
        this.textTransform = textTransform2;
    }

    public final ReactAccessibilityDelegate.AccessibilityRole getAccessibilityRole() {
        return this.accessibilityRole;
    }

    public final boolean getAllowFontScaling() {
        return this.allowFontScaling;
    }

    public final Integer getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Integer getColor() {
        return this.color;
    }

    public final float getEffectiveLetterSpacing() {
        return getLetterSpacing();
    }

    /* JADX INFO: renamed from: getEffectiveLineHeight, reason: from getter */
    public final float getLineHeight() {
        return this.lineHeight;
    }

    public final String getFontFamily() {
        return this.fontFamily;
    }

    public final String getFontFeatureSettings() {
        return this.fontFeatureSettings;
    }

    public final int getFontSize() {
        return this.fontSize;
    }

    public final int getFontStyle() {
        return this.fontStyle;
    }

    public final int getFontWeight() {
        return this.fontWeight;
    }

    public final float getGradientAngle() {
        return this.gradientAngle;
    }

    public final int[] getGradientColors() {
        return this.gradientColors;
    }

    public final float getGradientLength() {
        return this.gradientLength;
    }

    public final String getGradientMode() {
        return this.gradientMode;
    }

    public final int getLayoutDirection() {
        return this.layoutDirection;
    }

    public final float getLetterSpacing() {
        float pixelFromSP$default = this.allowFontScaling ? PixelUtil.toPixelFromSP$default(this.letterSpacingInput, 0.0f, 2, null) : PixelUtil.toPixelFromDIP(this.letterSpacingInput);
        int i7 = this.fontSize;
        if (i7 > 0) {
            return pixelFromSP$default / i7;
        }
        throw new IllegalArgumentException(b.h(i7, "FontSize should be a positive value. Current value: ").toString());
    }

    public final float getLineHeight() {
        return this.lineHeight;
    }

    public final float getMaxFontSizeMultiplier() {
        return this.maxFontSizeMultiplier;
    }

    public final int getNumberOfLines() {
        return this.numberOfLines;
    }

    public final float getOpacity() {
        return this.opacity;
    }

    public final ReactAccessibilityDelegate.Role getRole() {
        return this.role;
    }

    public final int getTextShadowColor() {
        return this.textShadowColor;
    }

    public final float getTextShadowOffsetDx() {
        return this.textShadowOffsetDx;
    }

    public final float getTextShadowOffsetDy() {
        return this.textShadowOffsetDy;
    }

    public final float getTextShadowRadius() {
        return this.textShadowRadius;
    }

    public final int getTextStrokeColor() {
        return this.textStrokeColor;
    }

    public final float getTextStrokeWidth() {
        return this.textStrokeWidth;
    }

    @NotNull
    /* JADX INFO: renamed from: getTextTransform$ReactAndroid_release, reason: from getter */
    public final TextTransform getTextTransform() {
        return this.textTransform;
    }

    /* JADX INFO: renamed from: isBackgroundColorSet, reason: from getter */
    public final boolean getIsBackgroundColorSet() {
        return this.isBackgroundColorSet;
    }

    /* JADX INFO: renamed from: isColorSet, reason: from getter */
    public final boolean getIsColorSet() {
        return this.isColorSet;
    }

    /* JADX INFO: renamed from: isLineThroughTextDecorationSet, reason: from getter */
    public final boolean getIsLineThroughTextDecorationSet() {
        return this.isLineThroughTextDecorationSet;
    }

    /* JADX INFO: renamed from: isTextStrokeColorSet, reason: from getter */
    public final boolean getIsTextStrokeColorSet() {
        return this.isTextStrokeColorSet;
    }

    /* JADX INFO: renamed from: isUnderlineTextDecorationSet, reason: from getter */
    public final boolean getIsUnderlineTextDecorationSet() {
        return this.isUnderlineTextDecorationSet;
    }

    public final void setTextTransform$ReactAndroid_release(@NotNull TextTransform textTransform) {
        Intrinsics.checkNotNullParameter(textTransform, "<set-?>");
        this.textTransform = textTransform;
    }

    private TextAttributeProps() {
        this.lineHeight = Float.NaN;
        this.allowFontScaling = true;
        this.maxFontSizeMultiplier = Float.NaN;
        this.opacity = Float.NaN;
        this.numberOfLines = -1;
        this.fontSize = -1;
        this.fontSizeInput = -1.0f;
        this.lineHeightInput = -1.0f;
        this.letterSpacingInput = Float.NaN;
        this.layoutDirection = -1;
        this.textTransform = TextTransform.NONE;
        this.includeFontPadding = true;
        this.fontStyle = -1;
        this.fontWeight = -1;
        this.backgroundColor = 0;
        this.gradientAngle = Float.NaN;
        this.gradientLength = Float.NaN;
        this.textShadowColor = DEFAULT_TEXT_SHADOW_COLOR;
        this.textStrokeWidth = Float.NaN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void setFontVariant(MapBuffer fontVariant) {
        if (fontVariant == null || fontVariant.getCount() == 0) {
            this.fontFeatureSettings = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<MapBuffer.Entry> it = fontVariant.iterator();
        while (it.hasNext()) {
            String stringValue = it.next().getStringValue();
            if (stringValue != null) {
                switch (stringValue.hashCode()) {
                    case -1983120972:
                        if (stringValue.equals("stylistic-thirteen")) {
                            arrayList.add("'ss13'");
                        }
                        break;
                    case -1933522176:
                        if (stringValue.equals("stylistic-fifteen")) {
                            arrayList.add("'ss15'");
                        }
                        break;
                    case -1534462052:
                        if (stringValue.equals("stylistic-eighteen")) {
                            arrayList.add("'ss18'");
                        }
                        break;
                    case -1195362251:
                        if (stringValue.equals("proportional-nums")) {
                            arrayList.add("'pnum'");
                        }
                        break;
                    case -1061392823:
                        if (stringValue.equals("lining-nums")) {
                            arrayList.add("'lnum'");
                        }
                        break;
                    case -771984547:
                        if (stringValue.equals("tabular-nums")) {
                            arrayList.add("'tnum'");
                        }
                        break;
                    case -659678800:
                        if (stringValue.equals("oldstyle-nums")) {
                            arrayList.add("'onum'");
                        }
                        break;
                    case 296506098:
                        if (stringValue.equals("stylistic-eight")) {
                            arrayList.add("'ss08'");
                        }
                        break;
                    case 309330544:
                        if (stringValue.equals("stylistic-seven")) {
                            arrayList.add("'ss07'");
                        }
                        break;
                    case 310339585:
                        if (stringValue.equals("stylistic-three")) {
                            arrayList.add("'ss03'");
                        }
                        break;
                    case 604478526:
                        if (stringValue.equals("stylistic-eleven")) {
                            arrayList.add("'ss11'");
                        }
                        break;
                    case 979426287:
                        if (stringValue.equals("stylistic-five")) {
                            arrayList.add("'ss05'");
                        }
                        break;
                    case 979432035:
                        if (stringValue.equals("stylistic-four")) {
                            arrayList.add("'ss04'");
                        }
                        break;
                    case 979664367:
                        if (stringValue.equals("stylistic-nine")) {
                            arrayList.add("'ss09'");
                        }
                        break;
                    case 1001434505:
                        if (stringValue.equals("stylistic-one")) {
                            arrayList.add("'ss01'");
                        }
                        break;
                    case 1001438213:
                        if (stringValue.equals("stylistic-six")) {
                            arrayList.add("'ss06'");
                        }
                        break;
                    case 1001439040:
                        if (stringValue.equals("stylistic-ten")) {
                            arrayList.add("'ss10'");
                        }
                        break;
                    case 1001439599:
                        if (stringValue.equals("stylistic-two")) {
                            arrayList.add("'ss02'");
                        }
                        break;
                    case 1030714463:
                        if (stringValue.equals("stylistic-sixteen")) {
                            arrayList.add("'ss16'");
                        }
                        break;
                    case 1044065430:
                        if (stringValue.equals("stylistic-twelve")) {
                            arrayList.add("'ss12'");
                        }
                        break;
                    case 1044067310:
                        if (stringValue.equals("stylistic-twenty")) {
                            arrayList.add("'ss20'");
                        }
                        break;
                    case 1183323111:
                        if (stringValue.equals("small-caps")) {
                            arrayList.add("'smcp'");
                        }
                        break;
                    case 1463562569:
                        if (stringValue.equals("stylistic-nineteen")) {
                            arrayList.add("'ss19'");
                        }
                        break;
                    case 1648446397:
                        if (stringValue.equals("stylistic-fourteen")) {
                            arrayList.add("'ss14'");
                        }
                        break;
                    case 2097122634:
                        if (stringValue.equals("stylistic-seventeen")) {
                            arrayList.add("'ss17'");
                        }
                        break;
                }
            }
        }
        this.fontFeatureSettings = CollectionsKt.O(arrayList, ", ", null, null, null, 62);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setRole(ReactAccessibilityDelegate.Role role) {
        this.role = role;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setGradientColors(MapBuffer gradientColors) {
        if (gradientColors == null) {
            return;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        Iterator<MapBuffer.Entry> it = gradientColors.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().getIntValue()));
        }
        setGradientColorsFromList(arrayList);
    }
}
