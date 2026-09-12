package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.viewmanagers.RNPlainTextManagerInterface;

/* JADX INFO: loaded from: classes3.dex */
public class RNPlainTextManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNPlainTextManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNPlainTextManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* JADX INFO: renamed from: setProperty */
    public void kotlinCompat$setProperty(T t5, String str, Object obj) {
        str.getClass();
        byte b10 = -1;
        switch (str.hashCode()) {
            case -1550943582:
                if (str.equals(ViewProps.FONT_STYLE)) {
                    b10 = 0;
                }
                break;
            case -1329887265:
                if (str.equals(ViewProps.NUMBER_OF_LINES)) {
                    b10 = 1;
                }
                break;
            case -1224696685:
                if (str.equals(ViewProps.FONT_FAMILY)) {
                    b10 = 2;
                }
                break;
            case -1065511464:
                if (str.equals(ViewProps.TEXT_ALIGN)) {
                    b10 = 3;
                }
                break;
            case -746936125:
                if (str.equals("hasLetterSpacing")) {
                    b10 = 4;
                }
                break;
            case -734428249:
                if (str.equals(ViewProps.FONT_WEIGHT)) {
                    b10 = 5;
                }
                break;
            case -515807685:
                if (str.equals(ViewProps.LINE_HEIGHT)) {
                    b10 = 6;
                }
                break;
            case -407229137:
                if (str.equals(ViewProps.ALLOW_FONT_SCALING)) {
                    b10 = 7;
                }
                break;
            case -85337091:
                if (str.equals("experiment")) {
                    b10 = 8;
                }
                break;
            case 3556653:
                if (str.equals("text")) {
                    b10 = 9;
                }
                break;
            case 94842723:
                if (str.equals(ViewProps.COLOR)) {
                    b10 = 10;
                }
                break;
            case 117406407:
                if (str.equals("fontVariationSettings")) {
                    b10 = 11;
                }
                break;
            case 365601008:
                if (str.equals(ViewProps.FONT_SIZE)) {
                    b10 = 12;
                }
                break;
            case 548921173:
                if (str.equals(ViewProps.MAX_FONT_SIZE_MULTIPLIER)) {
                    b10 = 13;
                }
                break;
            case 830763696:
                if (str.equals("lineHeightClippingIos")) {
                    b10 = 14;
                }
                break;
            case 1327548607:
                if (str.equals("textTransform")) {
                    b10 = 15;
                }
                break;
            case 1806129616:
                if (str.equals(ViewProps.ELLIPSIZE_MODE)) {
                    b10 = 16;
                }
                break;
            case 1869416814:
                if (str.equals(ViewProps.TEXT_ALIGN_VERTICAL)) {
                    b10 = 17;
                }
                break;
            case 2008872246:
                if (str.equals(ViewProps.FONT_VARIANT)) {
                    b10 = 18;
                }
                break;
            case 2020113146:
                if (str.equals(ViewProps.INCLUDE_FONT_PADDING)) {
                    b10 = 19;
                }
                break;
            case 2031616849:
                if (str.equals(ViewProps.TEXT_DECORATION_LINE)) {
                    b10 = 20;
                }
                break;
            case 2111078717:
                if (str.equals(ViewProps.LETTER_SPACING)) {
                    b10 = 21;
                }
                break;
        }
        switch (b10) {
            case 0:
                ((RNPlainTextManagerInterface) this.mViewManager).setFontStyle(t5, obj != null ? (String) obj : null);
                break;
            case 1:
                ((RNPlainTextManagerInterface) this.mViewManager).setNumberOfLines(t5, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 2:
                ((RNPlainTextManagerInterface) this.mViewManager).setFontFamily(t5, obj != null ? (String) obj : null);
                break;
            case 3:
                ((RNPlainTextManagerInterface) this.mViewManager).setTextAlign(t5, (String) obj);
                break;
            case 4:
                ((RNPlainTextManagerInterface) this.mViewManager).setHasLetterSpacing(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 5:
                ((RNPlainTextManagerInterface) this.mViewManager).setFontWeight(t5, obj != null ? (String) obj : null);
                break;
            case 6:
                ((RNPlainTextManagerInterface) this.mViewManager).setLineHeight(t5, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 7:
                ((RNPlainTextManagerInterface) this.mViewManager).setAllowFontScaling(t5, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case 8:
                ((RNPlainTextManagerInterface) this.mViewManager).setExperiment(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 9:
                ((RNPlainTextManagerInterface) this.mViewManager).setText(t5, obj != null ? (String) obj : null);
                break;
            case 10:
                ((RNPlainTextManagerInterface) this.mViewManager).setColor(t5, ColorPropConverter.getColor(obj, t5.getContext()));
                break;
            case 11:
                ((RNPlainTextManagerInterface) this.mViewManager).setFontVariationSettings(t5, obj != null ? (String) obj : null);
                break;
            case 12:
                ((RNPlainTextManagerInterface) this.mViewManager).setFontSize(t5, obj == null ? 14.0f : ((Double) obj).floatValue());
                break;
            case 13:
                ((RNPlainTextManagerInterface) this.mViewManager).setMaxFontSizeMultiplier(t5, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 14:
                ((RNPlainTextManagerInterface) this.mViewManager).setLineHeightClippingIos(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 15:
                ((RNPlainTextManagerInterface) this.mViewManager).setTextTransform(t5, (String) obj);
                break;
            case 16:
                ((RNPlainTextManagerInterface) this.mViewManager).setEllipsizeMode(t5, (String) obj);
                break;
            case 17:
                ((RNPlainTextManagerInterface) this.mViewManager).setTextAlignVertical(t5, (String) obj);
                break;
            case 18:
                ((RNPlainTextManagerInterface) this.mViewManager).setFontVariant(t5, (ReadableArray) obj);
                break;
            case 19:
                ((RNPlainTextManagerInterface) this.mViewManager).setIncludeFontPadding(t5, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case 20:
                ((RNPlainTextManagerInterface) this.mViewManager).setTextDecorationLine(t5, obj != null ? (String) obj : null);
                break;
            case 21:
                ((RNPlainTextManagerInterface) this.mViewManager).setLetterSpacing(t5, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            default:
                super.kotlinCompat$setProperty(t5, str, obj);
                break;
        }
    }
}
