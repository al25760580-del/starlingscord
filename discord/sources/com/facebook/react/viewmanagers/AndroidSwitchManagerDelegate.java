package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.AndroidSwitchManagerInterface;

/* JADX INFO: loaded from: classes3.dex */
public class AndroidSwitchManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & AndroidSwitchManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public AndroidSwitchManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* JADX INFO: renamed from: receiveCommand */
    public void kotlinCompat$receiveCommand(T t5, String str, ReadableArray readableArray) {
        str.getClass();
        if (str.equals("setNativeValue")) {
            ((AndroidSwitchManagerInterface) this.mViewManager).setNativeValue(t5, readableArray.getBoolean(0));
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* JADX INFO: renamed from: setProperty */
    public void kotlinCompat$setProperty(T t5, String str, Object obj) {
        str.getClass();
        switch (str) {
            case "thumbColor":
                ((AndroidSwitchManagerInterface) this.mViewManager).setThumbColor(t5, ColorPropConverter.getColor(obj, t5.getContext()));
                break;
            case "enabled":
                ((AndroidSwitchManagerInterface) this.mViewManager).setEnabled(t5, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case "trackTintColor":
                ((AndroidSwitchManagerInterface) this.mViewManager).setTrackTintColor(t5, ColorPropConverter.getColor(obj, t5.getContext()));
                break;
            case "on":
                ((AndroidSwitchManagerInterface) this.mViewManager).setOn(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "value":
                ((AndroidSwitchManagerInterface) this.mViewManager).setValue(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "disabled":
                ((AndroidSwitchManagerInterface) this.mViewManager).setDisabled(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "trackColorForFalse":
                ((AndroidSwitchManagerInterface) this.mViewManager).setTrackColorForFalse(t5, ColorPropConverter.getColor(obj, t5.getContext()));
                break;
            case "thumbTintColor":
                ((AndroidSwitchManagerInterface) this.mViewManager).setThumbTintColor(t5, ColorPropConverter.getColor(obj, t5.getContext()));
                break;
            case "trackColorForTrue":
                ((AndroidSwitchManagerInterface) this.mViewManager).setTrackColorForTrue(t5, ColorPropConverter.getColor(obj, t5.getContext()));
                break;
            default:
                super.kotlinCompat$setProperty(t5, str, obj);
                break;
        }
    }
}
