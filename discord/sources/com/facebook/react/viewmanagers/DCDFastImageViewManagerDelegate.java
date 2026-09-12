package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.DCDFastImageViewManagerInterface;

/* JADX INFO: loaded from: classes3.dex */
public class DCDFastImageViewManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & DCDFastImageViewManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public DCDFastImageViewManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* JADX INFO: renamed from: setProperty */
    public void kotlinCompat$setProperty(T t5, String str, Object obj) {
        str.getClass();
        switch (str) {
            case "enableAnimation":
                ((DCDFastImageViewManagerInterface) this.mViewManager).setEnableAnimation(t5, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case "paused":
                ((DCDFastImageViewManagerInterface) this.mViewManager).setPaused(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "source":
                ((DCDFastImageViewManagerInterface) this.mViewManager).setSource(t5, (ReadableMap) obj);
                break;
            case "fade":
                ((DCDFastImageViewManagerInterface) this.mViewManager).setFade(t5, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case "usesSmallCache":
                ((DCDFastImageViewManagerInterface) this.mViewManager).setUsesSmallCache(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "placeholder":
                ((DCDFastImageViewManagerInterface) this.mViewManager).setPlaceholder(t5, obj == null ? null : (String) obj);
                break;
            case "manualPlayback":
                ((DCDFastImageViewManagerInterface) this.mViewManager).setManualPlayback(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "resizeMode":
                ((DCDFastImageViewManagerInterface) this.mViewManager).setResizeMode(t5, obj == null ? "cover" : (String) obj);
                break;
            default:
                super.kotlinCompat$setProperty(t5, str, obj);
                break;
        }
    }
}
