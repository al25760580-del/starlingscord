package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.viewmanagers.RNCSliderManagerInterface;

/* JADX INFO: loaded from: classes3.dex */
public class RNCSliderManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNCSliderManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNCSliderManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* JADX INFO: renamed from: setProperty */
    public void kotlinCompat$setProperty(T t5, String str, Object obj) {
        str.getClass();
        byte b10 = -1;
        switch (str.hashCode()) {
            case -1984141450:
                if (str.equals("vertical")) {
                    b10 = 0;
                }
                break;
            case -1900655011:
                if (str.equals("maximumTrackTintColor")) {
                    b10 = 1;
                }
                break;
            case -1736983259:
                if (str.equals("thumbImage")) {
                    b10 = 2;
                }
                break;
            case -1681713095:
                if (str.equals("upperLimit")) {
                    b10 = 3;
                }
                break;
            case -1021497397:
                if (str.equals("minimumTrackTintColor")) {
                    b10 = 4;
                }
                break;
            case -981448432:
                if (str.equals("maximumTrackImage")) {
                    b10 = 5;
                }
                break;
            case -877170387:
                if (str.equals(ViewProps.TEST_ID)) {
                    b10 = 6;
                }
                break;
            case 3540684:
                if (str.equals("step")) {
                    b10 = 7;
                }
                break;
            case 111972721:
                if (str.equals("value")) {
                    b10 = 8;
                }
                break;
            case 270940796:
                if (str.equals("disabled")) {
                    b10 = 9;
                }
                break;
            case 627674869:
                if (str.equals("inverted")) {
                    b10 = 10;
                }
                break;
            case 628733650:
                if (str.equals("accessibilityIncrements")) {
                    b10 = 11;
                }
                break;
            case 718061361:
                if (str.equals("maximumValue")) {
                    b10 = 12;
                }
                break;
            case 1139400400:
                if (str.equals("trackImage")) {
                    b10 = 13;
                }
                break;
            case 1155548865:
                if (str.equals("accessibilityUnits")) {
                    b10 = 14;
                }
                break;
            case 1168687382:
                if (str.equals("tapToSeek")) {
                    b10 = 15;
                }
                break;
            case 1192487427:
                if (str.equals("minimumValue")) {
                    b10 = 16;
                }
                break;
            case 1209133370:
                if (str.equals("lowerLimit")) {
                    b10 = 17;
                }
                break;
            case 1329736439:
                if (str.equals("thumbSize")) {
                    b10 = 18;
                }
                break;
            case 1333596542:
                if (str.equals("minimumTrackImage")) {
                    b10 = 19;
                }
                break;
            case 1912319986:
                if (str.equals("thumbTintColor")) {
                    b10 = 20;
                }
                break;
        }
        switch (b10) {
            case 0:
                ((RNCSliderManagerInterface) this.mViewManager).setVertical(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 1:
                ((RNCSliderManagerInterface) this.mViewManager).setMaximumTrackTintColor(t5, ColorPropConverter.getColor(obj, t5.getContext()));
                break;
            case 2:
                ((RNCSliderManagerInterface) this.mViewManager).setThumbImage(t5, (ReadableMap) obj);
                break;
            case 3:
                ((RNCSliderManagerInterface) this.mViewManager).setUpperLimit(t5, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 4:
                ((RNCSliderManagerInterface) this.mViewManager).setMinimumTrackTintColor(t5, ColorPropConverter.getColor(obj, t5.getContext()));
                break;
            case 5:
                ((RNCSliderManagerInterface) this.mViewManager).setMaximumTrackImage(t5, (ReadableMap) obj);
                break;
            case 6:
                ((RNCSliderManagerInterface) this.mViewManager).setTestID(t5, obj != null ? (String) obj : null);
                break;
            case 7:
                ((RNCSliderManagerInterface) this.mViewManager).setStep(t5, obj != null ? ((Double) obj).doubleValue() : 0.0d);
                break;
            case 8:
                ((RNCSliderManagerInterface) this.mViewManager).setValue(t5, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 9:
                ((RNCSliderManagerInterface) this.mViewManager).setDisabled(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 10:
                ((RNCSliderManagerInterface) this.mViewManager).setInverted(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 11:
                ((RNCSliderManagerInterface) this.mViewManager).setAccessibilityIncrements(t5, (ReadableArray) obj);
                break;
            case 12:
                ((RNCSliderManagerInterface) this.mViewManager).setMaximumValue(t5, obj != null ? ((Double) obj).doubleValue() : 0.0d);
                break;
            case 13:
                ((RNCSliderManagerInterface) this.mViewManager).setTrackImage(t5, (ReadableMap) obj);
                break;
            case 14:
                ((RNCSliderManagerInterface) this.mViewManager).setAccessibilityUnits(t5, obj != null ? (String) obj : null);
                break;
            case 15:
                ((RNCSliderManagerInterface) this.mViewManager).setTapToSeek(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 16:
                ((RNCSliderManagerInterface) this.mViewManager).setMinimumValue(t5, obj != null ? ((Double) obj).doubleValue() : 0.0d);
                break;
            case 17:
                ((RNCSliderManagerInterface) this.mViewManager).setLowerLimit(t5, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 18:
                ((RNCSliderManagerInterface) this.mViewManager).setThumbSize(t5, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 19:
                ((RNCSliderManagerInterface) this.mViewManager).setMinimumTrackImage(t5, (ReadableMap) obj);
                break;
            case 20:
                ((RNCSliderManagerInterface) this.mViewManager).setThumbTintColor(t5, ColorPropConverter.getColor(obj, t5.getContext()));
                break;
            default:
                super.kotlinCompat$setProperty(t5, str, obj);
                break;
        }
    }
}
