package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.APNGDecorationViewManagerInterface;

/* JADX INFO: loaded from: classes3.dex */
public class APNGDecorationViewManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & APNGDecorationViewManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public APNGDecorationViewManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* JADX INFO: renamed from: receiveCommand */
    public void kotlinCompat$receiveCommand(T t5, String str, ReadableArray readableArray) {
        str.getClass();
        switch (str) {
            case "play":
                ((APNGDecorationViewManagerInterface) this.mViewManager).play(t5);
                break;
            case "seek":
                ((APNGDecorationViewManagerInterface) this.mViewManager).seek(t5, readableArray.getInt(0));
                break;
            case "pause":
                ((APNGDecorationViewManagerInterface) this.mViewManager).pause(t5);
                break;
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* JADX INFO: renamed from: setProperty */
    public void kotlinCompat$setProperty(T t5, String str, Object obj) {
        str.getClass();
        if (str.equals("url")) {
            ((APNGDecorationViewManagerInterface) this.mViewManager).setUrl(t5, obj == null ? null : (String) obj);
        } else if (str.equals("autoplay")) {
            ((APNGDecorationViewManagerInterface) this.mViewManager).setAutoplay(t5, obj == null ? true : ((Boolean) obj).booleanValue());
        } else {
            super.kotlinCompat$setProperty(t5, str, obj);
        }
    }
}
