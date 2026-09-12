package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.VirtualViewExperimentalManagerInterface;

/* JADX INFO: loaded from: classes3.dex */
public class VirtualViewExperimentalManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & VirtualViewExperimentalManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public VirtualViewExperimentalManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* JADX INFO: renamed from: setProperty */
    public void kotlinCompat$setProperty(T t5, String str, Object obj) {
        str.getClass();
        switch (str) {
            case "renderState":
                ((VirtualViewExperimentalManagerInterface) this.mViewManager).setRenderState(t5, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "initialHidden":
                ((VirtualViewExperimentalManagerInterface) this.mViewManager).setInitialHidden(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "removeClippedSubviews":
                ((VirtualViewExperimentalManagerInterface) this.mViewManager).setRemoveClippedSubviews(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            default:
                super.kotlinCompat$setProperty(t5, str, obj);
                break;
        }
    }
}
