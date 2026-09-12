package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.RNSScreenStackHeaderSubviewManagerInterface;

/* JADX INFO: loaded from: classes3.dex */
public class RNSScreenStackHeaderSubviewManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNSScreenStackHeaderSubviewManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSScreenStackHeaderSubviewManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* JADX INFO: renamed from: setProperty */
    public void kotlinCompat$setProperty(T t5, String str, Object obj) {
        str.getClass();
        switch (str) {
            case "synchronousShadowStateUpdatesEnabled":
                ((RNSScreenStackHeaderSubviewManagerInterface) this.mViewManager).setSynchronousShadowStateUpdatesEnabled(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "type":
                ((RNSScreenStackHeaderSubviewManagerInterface) this.mViewManager).setType(t5, (String) obj);
                break;
            case "hidesSharedBackground":
                ((RNSScreenStackHeaderSubviewManagerInterface) this.mViewManager).setHidesSharedBackground(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            default:
                super.kotlinCompat$setProperty(t5, str, obj);
                break;
        }
    }
}
