package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.ModalHostViewManagerInterface;

/* JADX INFO: loaded from: classes3.dex */
public class ModalHostViewManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & ModalHostViewManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public ModalHostViewManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* JADX INFO: renamed from: setProperty */
    public void kotlinCompat$setProperty(T t5, String str, Object obj) {
        str.getClass();
        switch (str) {
            case "presentationStyle":
                ((ModalHostViewManagerInterface) this.mViewManager).setPresentationStyle(t5, (String) obj);
                break;
            case "supportedOrientations":
                ((ModalHostViewManagerInterface) this.mViewManager).setSupportedOrientations(t5, (ReadableArray) obj);
                break;
            case "transparent":
                ((ModalHostViewManagerInterface) this.mViewManager).setTransparent(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "identifier":
                ((ModalHostViewManagerInterface) this.mViewManager).setIdentifier(t5, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "statusBarTranslucent":
                ((ModalHostViewManagerInterface) this.mViewManager).setStatusBarTranslucent(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "allowSwipeDismissal":
                ((ModalHostViewManagerInterface) this.mViewManager).setAllowSwipeDismissal(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "animated":
                ((ModalHostViewManagerInterface) this.mViewManager).setAnimated(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "visible":
                ((ModalHostViewManagerInterface) this.mViewManager).setVisible(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "navigationBarTranslucent":
                ((ModalHostViewManagerInterface) this.mViewManager).setNavigationBarTranslucent(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "hardwareAccelerated":
                ((ModalHostViewManagerInterface) this.mViewManager).setHardwareAccelerated(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "animationType":
                ((ModalHostViewManagerInterface) this.mViewManager).setAnimationType(t5, (String) obj);
                break;
            default:
                super.kotlinCompat$setProperty(t5, str, obj);
                break;
        }
    }
}
