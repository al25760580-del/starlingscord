package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.TextDisplayComponentViewManagerInterface;

/* JADX INFO: loaded from: classes3.dex */
public class TextDisplayComponentViewManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & TextDisplayComponentViewManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public TextDisplayComponentViewManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* JADX INFO: renamed from: setProperty */
    public void kotlinCompat$setProperty(T t5, String str, Object obj) {
        str.getClass();
        if (str.equals("model")) {
            ((TextDisplayComponentViewManagerInterface) this.mViewManager).setModel(t5, (ReadableMap) obj);
        } else if (str.equals("markdownTextRenderOptions")) {
            ((TextDisplayComponentViewManagerInterface) this.mViewManager).setMarkdownTextRenderOptions(t5, (ReadableMap) obj);
        } else {
            super.kotlinCompat$setProperty(t5, str, obj);
        }
    }
}
