package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.DCDVisualEffectViewManagerInterface;

/* JADX INFO: loaded from: classes3.dex */
public class DCDVisualEffectViewManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & DCDVisualEffectViewManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public DCDVisualEffectViewManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* JADX INFO: renamed from: setProperty */
    public void kotlinCompat$setProperty(T t5, String str, Object obj) {
        str.getClass();
        byte b10 = -1;
        switch (str.hashCode()) {
            case -1903475809:
                if (str.equals("blurAmount")) {
                    b10 = 0;
                }
                break;
            case -1896608177:
                if (str.equals("blurTargetViewNativeId")) {
                    b10 = 1;
                }
                break;
            case -984977533:
                if (str.equals("blurEffectName")) {
                    b10 = 2;
                }
                break;
            case -526737135:
                if (str.equals("blurTintIOSParityCompensationColor")) {
                    b10 = 3;
                }
                break;
            case 1327599912:
                if (str.equals("tintColor")) {
                    b10 = 4;
                }
                break;
        }
        switch (b10) {
            case 0:
                ((DCDVisualEffectViewManagerInterface) this.mViewManager).setBlurAmount(t5, obj == null ? Float.NaN : ((Double) obj).floatValue());
                break;
            case 1:
                ((DCDVisualEffectViewManagerInterface) this.mViewManager).setBlurTargetViewNativeId(t5, obj != null ? (String) obj : null);
                break;
            case 2:
                ((DCDVisualEffectViewManagerInterface) this.mViewManager).setBlurEffectName(t5, obj != null ? (String) obj : null);
                break;
            case 3:
                ((DCDVisualEffectViewManagerInterface) this.mViewManager).setBlurTintIOSParityCompensationColor(t5, ColorPropConverter.getColor(obj, t5.getContext()));
                break;
            case 4:
                ((DCDVisualEffectViewManagerInterface) this.mViewManager).setTintColor(t5, ColorPropConverter.getColor(obj, t5.getContext()));
                break;
            default:
                super.kotlinCompat$setProperty(t5, str, obj);
                break;
        }
    }
}
