package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.DCDVideoRendererManagerInterface;

/* JADX INFO: loaded from: classes3.dex */
public class DCDVideoRendererManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & DCDVideoRendererManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public DCDVideoRendererManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* JADX INFO: renamed from: setProperty */
    public void kotlinCompat$setProperty(T t5, String str, Object obj) {
        str.getClass();
        if (str.equals("useSurfaceDirectRenderer")) {
            ((DCDVideoRendererManagerInterface) this.mViewManager).setUseSurfaceDirectRenderer(t5, obj == null ? false : ((Boolean) obj).booleanValue());
        } else if (str.equals("streamId")) {
            ((DCDVideoRendererManagerInterface) this.mViewManager).setStreamId(t5, obj == null ? null : (String) obj);
        } else {
            super.kotlinCompat$setProperty(t5, str, obj);
        }
    }
}
