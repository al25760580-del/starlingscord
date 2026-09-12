package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.KeyboardControllerViewManagerInterface;

/* JADX INFO: loaded from: classes3.dex */
public class KeyboardControllerViewManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & KeyboardControllerViewManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public KeyboardControllerViewManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* JADX INFO: renamed from: receiveCommand */
    public void kotlinCompat$receiveCommand(T t5, String str, ReadableArray readableArray) {
        str.getClass();
        if (str.equals("synchronizeFocusedInputLayout")) {
            ((KeyboardControllerViewManagerInterface) this.mViewManager).synchronizeFocusedInputLayout(t5);
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* JADX INFO: renamed from: setProperty */
    public void kotlinCompat$setProperty(T t5, String str, Object obj) {
        str.getClass();
        switch (str) {
            case "enabled":
                ((KeyboardControllerViewManagerInterface) this.mViewManager).setEnabled(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "statusBarTranslucent":
                ((KeyboardControllerViewManagerInterface) this.mViewManager).setStatusBarTranslucent(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "preserveEdgeToEdge":
                ((KeyboardControllerViewManagerInterface) this.mViewManager).setPreserveEdgeToEdge(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "navigationBarTranslucent":
                ((KeyboardControllerViewManagerInterface) this.mViewManager).setNavigationBarTranslucent(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            default:
                super.kotlinCompat$setProperty(t5, str, obj);
                break;
        }
    }
}
