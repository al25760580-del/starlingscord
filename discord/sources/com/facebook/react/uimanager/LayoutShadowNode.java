package com.facebook.react.uimanager;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.common.annotations.internal.LegacyArchitectureLogLevel;
import com.facebook.react.common.annotations.internal.LegacyArchitectureLogger;
import com.facebook.react.modules.i18nmanager.I18nUtil;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import com.facebook.yoga.YogaAlign;
import com.facebook.yoga.YogaDisplay;
import com.facebook.yoga.YogaFlexDirection;
import com.facebook.yoga.YogaJustify;
import com.facebook.yoga.YogaOverflow;
import com.facebook.yoga.YogaPositionType;
import com.facebook.yoga.YogaUnit;
import com.facebook.yoga.YogaWrap;
import kotlin.Metadata;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.x;
import org.jetbrains.annotations.NotNull;
import rn.d;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u001b\b\u0017\u0018\u0000 W2\u00020\u0001:\u0002VWB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0017J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000bH\u0017J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0007H\u0017J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0017J\u0010\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u000bH\u0017J\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u000bH\u0017J\u0010\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u000bH\u0017J\u0010\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u000bH\u0017J\u0010\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u001bH\u0017J\u0010\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001bH\u0017J\u0010\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u000bH\u0017J\u0010\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\u000bH\u0017J\u0010\u0010\"\u001a\u00020\t2\u0006\u0010#\u001a\u00020\u000bH\u0017J\u0010\u0010$\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u001bH\u0017J\u0010\u0010&\u001a\u00020\t2\u0006\u0010'\u001a\u00020\u000bH\u0017J\u0010\u0010(\u001a\u00020\t2\u0006\u0010)\u001a\u00020\u001bH\u0017J\u0012\u0010*\u001a\u00020\t2\b\u0010+\u001a\u0004\u0018\u00010,H\u0017J\u0012\u0010-\u001a\u00020\t2\b\u0010.\u001a\u0004\u0018\u00010,H\u0017J\u0012\u0010/\u001a\u00020\t2\b\u00100\u001a\u0004\u0018\u00010,H\u0017J\u0012\u00101\u001a\u00020\t2\b\u00102\u001a\u0004\u0018\u00010,H\u0017J\u0012\u00103\u001a\u00020\t2\b\u00104\u001a\u0004\u0018\u00010,H\u0017J\u0012\u00105\u001a\u00020\t2\b\u00106\u001a\u0004\u0018\u00010,H\u0017J\u0012\u00107\u001a\u00020\t2\b\u00108\u001a\u0004\u0018\u00010,H\u0017J\u0012\u00109\u001a\u00020\t2\b\u0010:\u001a\u0004\u0018\u00010,H\u0017J\u0018\u0010;\u001a\u00020\t2\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020\u000bH\u0017J\u0018\u0010?\u001a\u00020\t2\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020\u000bH\u0017J\u0018\u0010@\u001a\u00020\t2\u0006\u0010<\u001a\u00020=2\u0006\u0010A\u001a\u00020\u000bH\u0017J\u0018\u0010B\u001a\u00020\t2\u0006\u0010<\u001a\u00020=2\u0006\u0010A\u001a\u00020\u000bH\u0017J\u0018\u0010C\u001a\u00020\t2\u0006\u0010<\u001a\u00020=2\u0006\u0010D\u001a\u00020\u000bH\u0017J\u0018\u0010E\u001a\u00020\t2\u0006\u0010<\u001a\u00020=2\u0006\u0010D\u001a\u00020\u000bH\u0017J\u0010\u0010F\u001a\u00020\t2\u0006\u0010D\u001a\u00020\u000bH\u0017J\u0018\u0010G\u001a\u00020\t2\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020\u000bH\u0017J\u0018\u0010H\u001a\u00020\t2\u0006\u0010<\u001a\u00020=2\u0006\u0010A\u001a\u00020\u000bH\u0017J\u0018\u0010I\u001a\u00020\t2\u0006\u0010<\u001a\u00020=2\u0006\u0010J\u001a\u00020\u001bH\u0017J\u0018\u0010K\u001a\u00020\t2\u0006\u0010<\u001a\u00020=2\u0006\u0010L\u001a\u00020\u000bH\u0017J\u0010\u0010M\u001a\u00020=2\u0006\u0010N\u001a\u00020=H\u0002J\u0012\u0010O\u001a\u00020\t2\b\u0010L\u001a\u0004\u0018\u00010,H\u0017J\u0010\u0010P\u001a\u00020\t2\u0006\u0010Q\u001a\u00020\u0007H\u0017J\u0010\u0010R\u001a\u00020\t2\u0006\u0010S\u001a\u00020\u0007H\u0017J\u0010\u0010T\u001a\u00020\t2\u0006\u0010S\u001a\u00020\u0007H\u0017J\u0010\u0010U\u001a\u00020\t2\u0006\u0010S\u001a\u00020\u0007H\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006X"}, d2 = {"Lcom/facebook/react/uimanager/LayoutShadowNode;", "Lcom/facebook/react/uimanager/ReactShadowNodeImpl;", "<init>", "()V", "tempYogaValue", "Lcom/facebook/react/uimanager/LayoutShadowNode$MutableYogaValue;", ViewProps.COLLAPSABLE, "", "setWidth", "", "width", "Lcom/facebook/react/bridge/Dynamic;", "setMinWidth", ViewProps.MIN_WIDTH, "setCollapsableChildren", ViewProps.COLLAPSABLE_CHILDREN, "setCollapsable", "setMaxWidth", ViewProps.MAX_WIDTH, "setHeight", "height", "setMinHeight", ViewProps.MIN_HEIGHT, "setMaxHeight", ViewProps.MAX_HEIGHT, "setFlex", ViewProps.FLEX, "", "setFlexGrow", ViewProps.FLEX_GROW, "setRowGap", ViewProps.ROW_GAP, "setColumnGap", ViewProps.COLUMN_GAP, "setGap", ViewProps.GAP, "setFlexShrink", ViewProps.FLEX_SHRINK, "setFlexBasis", ViewProps.FLEX_BASIS, "setAspectRatio", ViewProps.ASPECT_RATIO, "setFlexDirection", ViewProps.FLEX_DIRECTION, "", "setFlexWrap", ViewProps.FLEX_WRAP, "setAlignSelf", ViewProps.ALIGN_SELF, "setAlignItems", ViewProps.ALIGN_ITEMS, "setAlignContent", ViewProps.ALIGN_CONTENT, "setJustifyContent", ViewProps.JUSTIFY_CONTENT, "setOverflow", ViewProps.OVERFLOW, "setDisplay", ViewProps.DISPLAY, "setMarginBlock", "index", "", ViewProps.MARGIN, "setMarginInline", "setPaddingBlock", ViewProps.PADDING, "setPaddingInline", "setInsetBlock", "inset", "setInsetInline", "setInset", "setMargins", "setPaddings", "setBorderWidths", ViewProps.BORDER_WIDTH, "setPositionValues", ViewProps.POSITION, "maybeTransformLeftRightToStartEnd", "spacingType", "setPosition", "setShouldNotifyOnLayout", "shouldNotifyOnLayout", "setShouldNotifyPointerEnter", "value", "setShouldNotifyPointerLeave", "setShouldNotifyPointerMove", "MutableYogaValue", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@d
public class LayoutShadowNode extends ReactShadowNodeImpl {
    public boolean collapsable;

    @NotNull
    private final MutableYogaValue tempYogaValue = new MutableYogaValue();

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[YogaUnit.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        LegacyArchitectureLogger.assertLegacyArchitecture("LayoutShadowNode", LegacyArchitectureLogLevel.ERROR);
    }

    private final int maybeTransformLeftRightToStartEnd(int spacingType) {
        I18nUtil i18nUtilDEPRECATED$getInstance = I18nUtil.INSTANCE.DEPRECATED$getInstance();
        ThemedReactContext themedContext = getThemedContext();
        Intrinsics.checkNotNullExpressionValue(themedContext, "getThemedContext(...)");
        if (i18nUtilDEPRECATED$getInstance.doLeftAndRightSwapInRTL(themedContext)) {
            if (spacingType == 0) {
                return 4;
            }
            if (spacingType == 2) {
                return 5;
            }
        }
        return spacingType;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @ReactProp(name = ViewProps.ALIGN_CONTENT)
    public void setAlignContent(String alignContent) {
        if (isVirtual()) {
            return;
        }
        YogaAlign yogaAlign = YogaAlign.FLEX_START;
        if (alignContent == null) {
            setAlignContent(yogaAlign);
            return;
        }
        switch (alignContent.hashCode()) {
            case -1881872635:
                if (alignContent.equals("stretch")) {
                    setAlignContent(YogaAlign.STRETCH);
                    return;
                }
                break;
            case -1720785339:
                if (alignContent.equals("baseline")) {
                    setAlignContent(YogaAlign.BASELINE);
                    return;
                }
                break;
            case -1364013995:
                if (alignContent.equals("center")) {
                    setAlignContent(YogaAlign.CENTER);
                    return;
                }
                break;
            case -46581362:
                if (alignContent.equals("flex-start")) {
                    setAlignContent(yogaAlign);
                    return;
                }
                break;
            case 3005871:
                if (alignContent.equals("auto")) {
                    setAlignContent(YogaAlign.AUTO);
                    return;
                }
                break;
            case 441309761:
                if (alignContent.equals("space-between")) {
                    setAlignContent(YogaAlign.SPACE_BETWEEN);
                    return;
                }
                break;
            case 1742952711:
                if (alignContent.equals("flex-end")) {
                    setAlignContent(YogaAlign.FLEX_END);
                    return;
                }
                break;
            case 1937124468:
                if (alignContent.equals("space-around")) {
                    setAlignContent(YogaAlign.SPACE_AROUND);
                    return;
                }
                break;
            case 2055030478:
                if (alignContent.equals("space-evenly")) {
                    setAlignContent(YogaAlign.SPACE_EVENLY);
                    return;
                }
                break;
        }
        o8.a.v(ReactConstants.TAG, "invalid value for alignContent: ".concat(alignContent));
        setAlignContent(yogaAlign);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @ReactProp(name = ViewProps.ALIGN_ITEMS)
    public void setAlignItems(String alignItems) {
        if (isVirtual()) {
            return;
        }
        YogaAlign yogaAlign = YogaAlign.STRETCH;
        if (alignItems == null) {
            setAlignItems(yogaAlign);
            return;
        }
        switch (alignItems.hashCode()) {
            case -1881872635:
                if (alignItems.equals("stretch")) {
                    setAlignItems(yogaAlign);
                    return;
                }
                break;
            case -1720785339:
                if (alignItems.equals("baseline")) {
                    setAlignItems(YogaAlign.BASELINE);
                    return;
                }
                break;
            case -1364013995:
                if (alignItems.equals("center")) {
                    setAlignItems(YogaAlign.CENTER);
                    return;
                }
                break;
            case -46581362:
                if (alignItems.equals("flex-start")) {
                    setAlignItems(YogaAlign.FLEX_START);
                    return;
                }
                break;
            case 3005871:
                if (alignItems.equals("auto")) {
                    setAlignItems(YogaAlign.AUTO);
                    return;
                }
                break;
            case 441309761:
                if (alignItems.equals("space-between")) {
                    setAlignItems(YogaAlign.SPACE_BETWEEN);
                    return;
                }
                break;
            case 1742952711:
                if (alignItems.equals("flex-end")) {
                    setAlignItems(YogaAlign.FLEX_END);
                    return;
                }
                break;
            case 1937124468:
                if (alignItems.equals("space-around")) {
                    setAlignItems(YogaAlign.SPACE_AROUND);
                    return;
                }
                break;
        }
        o8.a.v(ReactConstants.TAG, "invalid value for alignItems: ".concat(alignItems));
        setAlignItems(yogaAlign);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @ReactProp(name = ViewProps.ALIGN_SELF)
    public void setAlignSelf(String alignSelf) {
        if (isVirtual()) {
            return;
        }
        YogaAlign yogaAlign = YogaAlign.AUTO;
        if (alignSelf == null) {
            setAlignSelf(yogaAlign);
            return;
        }
        switch (alignSelf.hashCode()) {
            case -1881872635:
                if (alignSelf.equals("stretch")) {
                    setAlignSelf(YogaAlign.STRETCH);
                    return;
                }
                break;
            case -1720785339:
                if (alignSelf.equals("baseline")) {
                    setAlignSelf(YogaAlign.BASELINE);
                    return;
                }
                break;
            case -1364013995:
                if (alignSelf.equals("center")) {
                    setAlignSelf(YogaAlign.CENTER);
                    return;
                }
                break;
            case -46581362:
                if (alignSelf.equals("flex-start")) {
                    setAlignSelf(YogaAlign.FLEX_START);
                    return;
                }
                break;
            case 3005871:
                if (alignSelf.equals("auto")) {
                    setAlignSelf(yogaAlign);
                    return;
                }
                break;
            case 441309761:
                if (alignSelf.equals("space-between")) {
                    setAlignSelf(YogaAlign.SPACE_BETWEEN);
                    return;
                }
                break;
            case 1742952711:
                if (alignSelf.equals("flex-end")) {
                    setAlignSelf(YogaAlign.FLEX_END);
                    return;
                }
                break;
            case 1937124468:
                if (alignSelf.equals("space-around")) {
                    setAlignSelf(YogaAlign.SPACE_AROUND);
                    return;
                }
                break;
        }
        o8.a.v(ReactConstants.TAG, "invalid value for alignSelf: ".concat(alignSelf));
        setAlignSelf(yogaAlign);
    }

    @ReactProp(defaultFloat = FloatCompanionObject.NaN, name = ViewProps.ASPECT_RATIO)
    public void setAspectRatio(float aspectRatio) {
        setStyleAspectRatio(aspectRatio);
    }

    @ReactPropGroup(defaultFloat = FloatCompanionObject.NaN, names = {ViewProps.BORDER_WIDTH, ViewProps.BORDER_START_WIDTH, ViewProps.BORDER_END_WIDTH, ViewProps.BORDER_TOP_WIDTH, ViewProps.BORDER_BOTTOM_WIDTH, ViewProps.BORDER_LEFT_WIDTH, ViewProps.BORDER_RIGHT_WIDTH})
    public void setBorderWidths(int index, float borderWidth) {
        if (isVirtual()) {
            return;
        }
        setBorder(maybeTransformLeftRightToStartEnd(ViewProps.BORDER_SPACING_TYPES[index]), PixelUtil.toPixelFromDIP(borderWidth));
    }

    @ReactProp(name = ViewProps.COLLAPSABLE)
    public void setCollapsable(boolean collapsable) {
        this.collapsable = collapsable;
    }

    @ReactProp(name = ViewProps.COLLAPSABLE_CHILDREN)
    public void setCollapsableChildren(boolean collapsableChildren) {
    }

    @ReactProp(name = ViewProps.COLUMN_GAP)
    public void setColumnGap(@NotNull Dynamic columnGap) {
        Intrinsics.checkNotNullParameter(columnGap, "columnGap");
        if (isVirtual()) {
            return;
        }
        this.tempYogaValue.setFromDynamic(columnGap);
        int i7 = WhenMappings.$EnumSwitchMapping$0[this.tempYogaValue.getUnit().ordinal()];
        if (i7 == 1 || i7 == 2 || i7 == 3) {
            setColumnGap(this.tempYogaValue.getValue());
        } else if (i7 == 4) {
            setColumnGapPercent(this.tempYogaValue.getValue());
        }
        columnGap.recycle();
    }

    @ReactProp(name = ViewProps.DISPLAY)
    public void setDisplay(String display) {
        if (isVirtual()) {
            return;
        }
        YogaDisplay yogaDisplay = YogaDisplay.FLEX;
        if (display == null) {
            setDisplay(yogaDisplay);
            return;
        }
        if (Intrinsics.areEqual(display, ViewProps.FLEX)) {
            setDisplay(yogaDisplay);
        } else if (Intrinsics.areEqual(display, ViewProps.NONE)) {
            setDisplay(YogaDisplay.NONE);
        } else {
            o8.a.v(ReactConstants.TAG, "invalid value for display: ".concat(display));
            setDisplay(yogaDisplay);
        }
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    @ReactProp(defaultFloat = 0.0f, name = ViewProps.FLEX)
    public void setFlex(float flex) {
        if (isVirtual()) {
            return;
        }
        super.setFlex(flex);
    }

    @ReactProp(name = ViewProps.FLEX_BASIS)
    public void setFlexBasis(@NotNull Dynamic flexBasis) {
        Intrinsics.checkNotNullParameter(flexBasis, "flexBasis");
        if (isVirtual()) {
            return;
        }
        this.tempYogaValue.setFromDynamic(flexBasis);
        int i7 = WhenMappings.$EnumSwitchMapping$0[this.tempYogaValue.getUnit().ordinal()];
        if (i7 == 1 || i7 == 2) {
            setFlexBasis(this.tempYogaValue.getValue());
        } else if (i7 == 3) {
            setFlexBasisAuto();
        } else if (i7 == 4) {
            setFlexBasisPercent(this.tempYogaValue.getValue());
        }
        flexBasis.recycle();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @ReactProp(name = ViewProps.FLEX_DIRECTION)
    public void setFlexDirection(String flexDirection) {
        if (isVirtual()) {
            return;
        }
        YogaFlexDirection yogaFlexDirection = YogaFlexDirection.COLUMN;
        if (flexDirection == null) {
            setFlexDirection(yogaFlexDirection);
            return;
        }
        switch (flexDirection.hashCode()) {
            case -1448970769:
                if (flexDirection.equals("row-reverse")) {
                    setFlexDirection(YogaFlexDirection.ROW_REVERSE);
                    return;
                }
                break;
            case -1354837162:
                if (flexDirection.equals("column")) {
                    setFlexDirection(yogaFlexDirection);
                    return;
                }
                break;
            case 113114:
                if (flexDirection.equals("row")) {
                    setFlexDirection(YogaFlexDirection.ROW);
                    return;
                }
                break;
            case 1272730475:
                if (flexDirection.equals("column-reverse")) {
                    setFlexDirection(YogaFlexDirection.COLUMN_REVERSE);
                    return;
                }
                break;
        }
        o8.a.v(ReactConstants.TAG, "invalid value for flexDirection: ".concat(flexDirection));
        setFlexDirection(yogaFlexDirection);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    @ReactProp(defaultFloat = 0.0f, name = ViewProps.FLEX_GROW)
    public void setFlexGrow(float flexGrow) {
        if (isVirtual()) {
            return;
        }
        super.setFlexGrow(flexGrow);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    @ReactProp(defaultFloat = 0.0f, name = ViewProps.FLEX_SHRINK)
    public void setFlexShrink(float flexShrink) {
        if (isVirtual()) {
            return;
        }
        super.setFlexShrink(flexShrink);
    }

    @ReactProp(name = ViewProps.FLEX_WRAP)
    public void setFlexWrap(String flexWrap) {
        if (isVirtual()) {
            return;
        }
        YogaWrap yogaWrap = YogaWrap.NO_WRAP;
        if (flexWrap == null) {
            setFlexWrap(yogaWrap);
            return;
        }
        int iHashCode = flexWrap.hashCode();
        if (iHashCode != -1039592053) {
            if (iHashCode != -749527969) {
                if (iHashCode == 3657802 && flexWrap.equals("wrap")) {
                    setFlexWrap(YogaWrap.WRAP);
                    return;
                }
            } else if (flexWrap.equals("wrap-reverse")) {
                setFlexWrap(YogaWrap.WRAP_REVERSE);
                return;
            }
        } else if (flexWrap.equals("nowrap")) {
            setFlexWrap(yogaWrap);
            return;
        }
        o8.a.v(ReactConstants.TAG, "invalid value for flexWrap: ".concat(flexWrap));
        setFlexWrap(yogaWrap);
    }

    @ReactProp(name = ViewProps.GAP)
    public void setGap(@NotNull Dynamic gap) {
        Intrinsics.checkNotNullParameter(gap, "gap");
        if (isVirtual()) {
            return;
        }
        this.tempYogaValue.setFromDynamic(gap);
        int i7 = WhenMappings.$EnumSwitchMapping$0[this.tempYogaValue.getUnit().ordinal()];
        if (i7 == 1 || i7 == 2 || i7 == 3) {
            setGap(this.tempYogaValue.getValue());
        } else if (i7 == 4) {
            setGapPercent(this.tempYogaValue.getValue());
        }
        gap.recycle();
    }

    @ReactProp(name = "height")
    public void setHeight(@NotNull Dynamic height) {
        Intrinsics.checkNotNullParameter(height, "height");
        if (isVirtual()) {
            return;
        }
        this.tempYogaValue.setFromDynamic(height);
        int i7 = WhenMappings.$EnumSwitchMapping$0[this.tempYogaValue.getUnit().ordinal()];
        if (i7 == 1 || i7 == 2) {
            setStyleHeight(this.tempYogaValue.getValue());
        } else if (i7 == 3) {
            setStyleHeightAuto();
        } else if (i7 == 4) {
            setStyleHeightPercent(this.tempYogaValue.getValue());
        }
        height.recycle();
    }

    @ReactProp(name = "inset")
    public void setInset(@NotNull Dynamic inset) {
        Intrinsics.checkNotNullParameter(inset, "inset");
    }

    @ReactPropGroup(names = {"insetBlock", "insetBlockEnd", "insetBlockStart"})
    public void setInsetBlock(int index, @NotNull Dynamic inset) {
        Intrinsics.checkNotNullParameter(inset, "inset");
    }

    @ReactPropGroup(names = {"insetInline", "insetInlineEnd", "insetInlineStart"})
    public void setInsetInline(int index, @NotNull Dynamic inset) {
        Intrinsics.checkNotNullParameter(inset, "inset");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @ReactProp(name = ViewProps.JUSTIFY_CONTENT)
    public void setJustifyContent(String justifyContent) {
        if (isVirtual()) {
            return;
        }
        YogaJustify yogaJustify = YogaJustify.FLEX_START;
        if (justifyContent == null) {
            setJustifyContent(yogaJustify);
            return;
        }
        switch (justifyContent.hashCode()) {
            case -1364013995:
                if (justifyContent.equals("center")) {
                    setJustifyContent(YogaJustify.CENTER);
                    return;
                }
                break;
            case -46581362:
                if (justifyContent.equals("flex-start")) {
                    setJustifyContent(yogaJustify);
                    return;
                }
                break;
            case 441309761:
                if (justifyContent.equals("space-between")) {
                    setJustifyContent(YogaJustify.SPACE_BETWEEN);
                    return;
                }
                break;
            case 1742952711:
                if (justifyContent.equals("flex-end")) {
                    setJustifyContent(YogaJustify.FLEX_END);
                    return;
                }
                break;
            case 1937124468:
                if (justifyContent.equals("space-around")) {
                    setJustifyContent(YogaJustify.SPACE_AROUND);
                    return;
                }
                break;
            case 2055030478:
                if (justifyContent.equals("space-evenly")) {
                    setJustifyContent(YogaJustify.SPACE_EVENLY);
                    return;
                }
                break;
        }
        o8.a.v(ReactConstants.TAG, "invalid value for justifyContent: ".concat(justifyContent));
        setJustifyContent(yogaJustify);
    }

    @ReactPropGroup(names = {"marginBlock", "marginBlockEnd", "marginBlockStart"})
    public void setMarginBlock(int index, @NotNull Dynamic margin) {
        Intrinsics.checkNotNullParameter(margin, "margin");
    }

    @ReactPropGroup(names = {"marginInline", "marginInlineEnd", "marginInlineStart"})
    public void setMarginInline(int index, @NotNull Dynamic margin) {
        Intrinsics.checkNotNullParameter(margin, "margin");
    }

    @ReactPropGroup(names = {ViewProps.MARGIN, ViewProps.MARGIN_VERTICAL, ViewProps.MARGIN_HORIZONTAL, ViewProps.MARGIN_START, ViewProps.MARGIN_END, ViewProps.MARGIN_TOP, ViewProps.MARGIN_BOTTOM, ViewProps.MARGIN_LEFT, ViewProps.MARGIN_RIGHT})
    public void setMargins(int index, @NotNull Dynamic margin) {
        Intrinsics.checkNotNullParameter(margin, "margin");
        if (isVirtual()) {
            return;
        }
        int iMaybeTransformLeftRightToStartEnd = maybeTransformLeftRightToStartEnd(ViewProps.PADDING_MARGIN_SPACING_TYPES[index]);
        this.tempYogaValue.setFromDynamic(margin);
        int i7 = WhenMappings.$EnumSwitchMapping$0[this.tempYogaValue.getUnit().ordinal()];
        if (i7 == 1 || i7 == 2) {
            setMargin(iMaybeTransformLeftRightToStartEnd, this.tempYogaValue.getValue());
        } else if (i7 == 3) {
            setMarginAuto(iMaybeTransformLeftRightToStartEnd);
        } else if (i7 == 4) {
            setMarginPercent(iMaybeTransformLeftRightToStartEnd, this.tempYogaValue.getValue());
        }
        margin.recycle();
    }

    @ReactProp(name = ViewProps.MAX_HEIGHT)
    public void setMaxHeight(@NotNull Dynamic maxHeight) {
        Intrinsics.checkNotNullParameter(maxHeight, "maxHeight");
        if (isVirtual()) {
            return;
        }
        this.tempYogaValue.setFromDynamic(maxHeight);
        int i7 = WhenMappings.$EnumSwitchMapping$0[this.tempYogaValue.getUnit().ordinal()];
        if (i7 == 1 || i7 == 2) {
            setStyleMaxHeight(this.tempYogaValue.getValue());
        } else if (i7 == 4) {
            setStyleMaxHeightPercent(this.tempYogaValue.getValue());
        }
        maxHeight.recycle();
    }

    @ReactProp(name = ViewProps.MAX_WIDTH)
    public void setMaxWidth(@NotNull Dynamic maxWidth) {
        Intrinsics.checkNotNullParameter(maxWidth, "maxWidth");
        if (isVirtual()) {
            return;
        }
        this.tempYogaValue.setFromDynamic(maxWidth);
        int i7 = WhenMappings.$EnumSwitchMapping$0[this.tempYogaValue.getUnit().ordinal()];
        if (i7 == 1 || i7 == 2) {
            setStyleMaxWidth(this.tempYogaValue.getValue());
        } else if (i7 == 4) {
            setStyleMaxWidthPercent(this.tempYogaValue.getValue());
        }
        maxWidth.recycle();
    }

    @ReactProp(name = ViewProps.MIN_HEIGHT)
    public void setMinHeight(@NotNull Dynamic minHeight) {
        Intrinsics.checkNotNullParameter(minHeight, "minHeight");
        if (isVirtual()) {
            return;
        }
        this.tempYogaValue.setFromDynamic(minHeight);
        int i7 = WhenMappings.$EnumSwitchMapping$0[this.tempYogaValue.getUnit().ordinal()];
        if (i7 == 1 || i7 == 2) {
            setStyleMinHeight(this.tempYogaValue.getValue());
        } else if (i7 == 4) {
            setStyleMinHeightPercent(this.tempYogaValue.getValue());
        }
        minHeight.recycle();
    }

    @ReactProp(name = ViewProps.MIN_WIDTH)
    public void setMinWidth(@NotNull Dynamic minWidth) {
        Intrinsics.checkNotNullParameter(minWidth, "minWidth");
        if (isVirtual()) {
            return;
        }
        this.tempYogaValue.setFromDynamic(minWidth);
        int i7 = WhenMappings.$EnumSwitchMapping$0[this.tempYogaValue.getUnit().ordinal()];
        if (i7 == 1 || i7 == 2) {
            setStyleMinWidth(this.tempYogaValue.getValue());
        } else if (i7 == 4) {
            setStyleMinWidthPercent(this.tempYogaValue.getValue());
        }
        minWidth.recycle();
    }

    @ReactProp(name = ViewProps.OVERFLOW)
    public void setOverflow(String overflow) {
        if (isVirtual()) {
            return;
        }
        YogaOverflow yogaOverflow = YogaOverflow.VISIBLE;
        if (overflow == null) {
            setOverflow(yogaOverflow);
            return;
        }
        int iHashCode = overflow.hashCode();
        if (iHashCode != -1217487446) {
            if (iHashCode != -907680051) {
                if (iHashCode == 466743410 && overflow.equals(ViewProps.VISIBLE)) {
                    setOverflow(yogaOverflow);
                    return;
                }
            } else if (overflow.equals(ViewProps.SCROLL)) {
                setOverflow(YogaOverflow.SCROLL);
                return;
            }
        } else if (overflow.equals(ViewProps.HIDDEN)) {
            setOverflow(YogaOverflow.HIDDEN);
            return;
        }
        o8.a.v(ReactConstants.TAG, "invalid value for overflow: ".concat(overflow));
        setOverflow(yogaOverflow);
    }

    @ReactPropGroup(names = {"paddingBlock", "paddingBlockEnd", "paddingBlockStart"})
    public void setPaddingBlock(int index, @NotNull Dynamic padding) {
        Intrinsics.checkNotNullParameter(padding, "padding");
    }

    @ReactPropGroup(names = {"paddingInline", "paddingInlineEnd", "paddingInlineStart"})
    public void setPaddingInline(int index, @NotNull Dynamic padding) {
        Intrinsics.checkNotNullParameter(padding, "padding");
    }

    @ReactPropGroup(names = {ViewProps.PADDING, ViewProps.PADDING_VERTICAL, ViewProps.PADDING_HORIZONTAL, ViewProps.PADDING_START, ViewProps.PADDING_END, ViewProps.PADDING_TOP, ViewProps.PADDING_BOTTOM, ViewProps.PADDING_LEFT, ViewProps.PADDING_RIGHT})
    public void setPaddings(int index, @NotNull Dynamic padding) {
        Intrinsics.checkNotNullParameter(padding, "padding");
        if (isVirtual()) {
            return;
        }
        int iMaybeTransformLeftRightToStartEnd = maybeTransformLeftRightToStartEnd(ViewProps.PADDING_MARGIN_SPACING_TYPES[index]);
        this.tempYogaValue.setFromDynamic(padding);
        int i7 = WhenMappings.$EnumSwitchMapping$0[this.tempYogaValue.getUnit().ordinal()];
        if (i7 == 1 || i7 == 2) {
            setPadding(iMaybeTransformLeftRightToStartEnd, this.tempYogaValue.getValue());
        } else if (i7 == 4) {
            mo979setPaddingPercent(iMaybeTransformLeftRightToStartEnd, this.tempYogaValue.getValue());
        }
        padding.recycle();
    }

    @ReactProp(name = ViewProps.POSITION)
    public void setPosition(String position) {
        if (isVirtual()) {
            return;
        }
        YogaPositionType yogaPositionType = YogaPositionType.RELATIVE;
        if (position == null) {
            setPositionType(yogaPositionType);
            return;
        }
        if (Intrinsics.areEqual(position, "relative")) {
            setPositionType(yogaPositionType);
        } else if (Intrinsics.areEqual(position, "absolute")) {
            setPositionType(YogaPositionType.ABSOLUTE);
        } else {
            o8.a.v(ReactConstants.TAG, "invalid value for position: ".concat(position));
            setPositionType(yogaPositionType);
        }
    }

    @ReactPropGroup(names = {ViewProps.START, ViewProps.END, ViewProps.LEFT, ViewProps.RIGHT, ViewProps.TOP, ViewProps.BOTTOM})
    public void setPositionValues(int index, @NotNull Dynamic position) {
        Intrinsics.checkNotNullParameter(position, "position");
        if (isVirtual()) {
            return;
        }
        int iMaybeTransformLeftRightToStartEnd = maybeTransformLeftRightToStartEnd(new int[]{4, 5, 0, 2, 1, 3}[index]);
        this.tempYogaValue.setFromDynamic(position);
        int i7 = WhenMappings.$EnumSwitchMapping$0[this.tempYogaValue.getUnit().ordinal()];
        if (i7 == 1 || i7 == 2) {
            setPosition(iMaybeTransformLeftRightToStartEnd, this.tempYogaValue.getValue());
        } else if (i7 == 4) {
            setPositionPercent(iMaybeTransformLeftRightToStartEnd, this.tempYogaValue.getValue());
        }
        position.recycle();
    }

    @ReactProp(name = ViewProps.ROW_GAP)
    public void setRowGap(@NotNull Dynamic rowGap) {
        Intrinsics.checkNotNullParameter(rowGap, "rowGap");
        if (isVirtual()) {
            return;
        }
        this.tempYogaValue.setFromDynamic(rowGap);
        int i7 = WhenMappings.$EnumSwitchMapping$0[this.tempYogaValue.getUnit().ordinal()];
        if (i7 == 1 || i7 == 2 || i7 == 3) {
            setRowGap(this.tempYogaValue.getValue());
        } else if (i7 == 4) {
            setRowGapPercent(this.tempYogaValue.getValue());
        }
        rowGap.recycle();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    @ReactProp(name = "onLayout")
    public void setShouldNotifyOnLayout(boolean shouldNotifyOnLayout) {
        super.setShouldNotifyOnLayout(shouldNotifyOnLayout);
    }

    @ReactProp(name = ViewProps.ON_POINTER_ENTER)
    public void setShouldNotifyPointerEnter(boolean value) {
    }

    @ReactProp(name = ViewProps.ON_POINTER_LEAVE)
    public void setShouldNotifyPointerLeave(boolean value) {
    }

    @ReactProp(name = ViewProps.ON_POINTER_MOVE)
    public void setShouldNotifyPointerMove(boolean value) {
    }

    @ReactProp(name = "width")
    public void setWidth(@NotNull Dynamic width) {
        Intrinsics.checkNotNullParameter(width, "width");
        if (isVirtual()) {
            return;
        }
        this.tempYogaValue.setFromDynamic(width);
        int i7 = WhenMappings.$EnumSwitchMapping$0[this.tempYogaValue.getUnit().ordinal()];
        if (i7 == 1 || i7 == 2) {
            setStyleWidth(this.tempYogaValue.getValue());
        } else if (i7 == 3) {
            setStyleWidthAuto();
        } else if (i7 == 4) {
            setStyleWidthPercent(this.tempYogaValue.getValue());
        }
        width.recycle();
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0005J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/facebook/react/uimanager/LayoutShadowNode$MutableYogaValue;", "", "<init>", "()V", "other", "(Lcom/facebook/react/uimanager/LayoutShadowNode$MutableYogaValue;)V", "value", "", "getValue", "()F", "setValue", "(F)V", "unit", "Lcom/facebook/yoga/YogaUnit;", "getUnit", "()Lcom/facebook/yoga/YogaUnit;", "setUnit", "(Lcom/facebook/yoga/YogaUnit;)V", "setFromDynamic", "", "dynamic", "Lcom/facebook/react/bridge/Dynamic;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MutableYogaValue {

        @NotNull
        private YogaUnit unit;
        private float value;

        public MutableYogaValue() {
            this.unit = YogaUnit.UNDEFINED;
        }

        @NotNull
        public final YogaUnit getUnit() {
            return this.unit;
        }

        public final float getValue() {
            return this.value;
        }

        public final void setFromDynamic(@NotNull Dynamic dynamic) {
            Intrinsics.checkNotNullParameter(dynamic, "dynamic");
            boolean zIsNull = dynamic.isNull();
            YogaUnit yogaUnit = YogaUnit.UNDEFINED;
            if (zIsNull) {
                this.unit = yogaUnit;
                this.value = Float.NaN;
                return;
            }
            if (dynamic.getType() != ReadableType.String) {
                if (dynamic.getType() == ReadableType.Number) {
                    this.unit = YogaUnit.POINT;
                    this.value = PixelUtil.toPixelFromDIP(dynamic.asDouble());
                    return;
                } else {
                    this.unit = yogaUnit;
                    this.value = Float.NaN;
                    return;
                }
            }
            String strAsString = dynamic.asString();
            if (Intrinsics.areEqual(strAsString, "auto")) {
                this.unit = YogaUnit.AUTO;
                this.value = Float.NaN;
                return;
            }
            if (strAsString != null && x.h(strAsString, "%", false)) {
                this.unit = YogaUnit.PERCENT;
                String strSubstring = strAsString.substring(0, strAsString.length() - 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                this.value = Float.parseFloat(strSubstring);
                return;
            }
            o8.a.v(ReactConstants.TAG, "Unknown value: " + strAsString);
            this.unit = yogaUnit;
            this.value = Float.NaN;
        }

        public final void setUnit(@NotNull YogaUnit yogaUnit) {
            Intrinsics.checkNotNullParameter(yogaUnit, "<set-?>");
            this.unit = yogaUnit;
        }

        public final void setValue(float f2) {
            this.value = f2;
        }

        public MutableYogaValue(@NotNull MutableYogaValue other) {
            Intrinsics.checkNotNullParameter(other, "other");
            this.unit = YogaUnit.UNDEFINED;
            this.value = other.value;
            this.unit = other.unit;
        }
    }
}
