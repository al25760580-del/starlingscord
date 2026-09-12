package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.viewmanagers.LottieAnimationViewManagerInterface;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;

/* JADX INFO: loaded from: classes3.dex */
public class LottieAnimationViewManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & LottieAnimationViewManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public LottieAnimationViewManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* JADX INFO: renamed from: receiveCommand */
    public void kotlinCompat$receiveCommand(T t5, String str, ReadableArray readableArray) {
        str.getClass();
        switch (str) {
            case "resume":
                ((LottieAnimationViewManagerInterface) this.mViewManager).resume(t5);
                break;
            case "play":
                ((LottieAnimationViewManagerInterface) this.mViewManager).play(t5, readableArray.getInt(0), readableArray.getInt(1));
                break;
            case "pause":
                ((LottieAnimationViewManagerInterface) this.mViewManager).pause(t5);
                break;
            case "reset":
                ((LottieAnimationViewManagerInterface) this.mViewManager).reset(t5);
                break;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* JADX INFO: renamed from: setProperty */
    public void kotlinCompat$setProperty(T t5, String str, Object obj) {
        str.getClass();
        byte b10 = -1;
        switch (str.hashCode()) {
            case -1931191604:
                if (str.equals("imageAssetsFolder")) {
                    b10 = 0;
                }
                break;
            case -1698420908:
                if (str.equals("sourceURL")) {
                    b10 = 1;
                }
                break;
            case -1620771041:
                if (str.equals("textFiltersIOS")) {
                    b10 = 2;
                }
                break;
            case -1111735389:
                if (str.equals("sourceJson")) {
                    b10 = 3;
                }
                break;
            case -1111633594:
                if (str.equals("sourceName")) {
                    b10 = 4;
                }
                break;
            case -1073046328:
                if (str.equals("cacheComposition")) {
                    b10 = 5;
                }
                break;
            case -1001078227:
                if (str.equals(ReactProgressBarViewManager.PROP_PROGRESS)) {
                    b10 = 6;
                }
                break;
            case -413415295:
                if (str.equals("textFiltersAndroid")) {
                    b10 = 7;
                }
                break;
            case -204076609:
                if (str.equals("sourceDotLottieURI")) {
                    b10 = 8;
                }
                break;
            case 3327652:
                if (str.equals("loop")) {
                    b10 = 9;
                }
                break;
            case 95945896:
                if (str.equals("dummy")) {
                    b10 = 10;
                }
                break;
            case 109641799:
                if (str.equals("speed")) {
                    b10 = 11;
                }
                break;
            case 399078087:
                if (str.equals("hardwareAccelerationAndroid")) {
                    b10 = 12;
                }
                break;
            case 1192042876:
                if (str.equals("enableSafeModeAndroid")) {
                    b10 = 13;
                }
                break;
            case 1193882713:
                if (str.equals("renderMode")) {
                    b10 = 14;
                }
                break;
            case 1410565912:
                if (str.equals("colorFilters")) {
                    b10 = 15;
                }
                break;
            case 1438608771:
                if (str.equals("autoPlay")) {
                    b10 = 16;
                }
                break;
            case 2049757303:
                if (str.equals(ViewProps.RESIZE_MODE)) {
                    b10 = 17;
                }
                break;
            case 2111299681:
                if (str.equals("enableMergePathsAndroidForKitKatAndAbove")) {
                    b10 = 18;
                }
                break;
        }
        switch (b10) {
            case 0:
                ((LottieAnimationViewManagerInterface) this.mViewManager).setImageAssetsFolder(t5, obj != null ? (String) obj : null);
                break;
            case 1:
                ((LottieAnimationViewManagerInterface) this.mViewManager).setSourceURL(t5, obj != null ? (String) obj : null);
                break;
            case 2:
                ((LottieAnimationViewManagerInterface) this.mViewManager).setTextFiltersIOS(t5, (ReadableArray) obj);
                break;
            case 3:
                ((LottieAnimationViewManagerInterface) this.mViewManager).setSourceJson(t5, obj != null ? (String) obj : null);
                break;
            case 4:
                ((LottieAnimationViewManagerInterface) this.mViewManager).setSourceName(t5, obj != null ? (String) obj : null);
                break;
            case 5:
                ((LottieAnimationViewManagerInterface) this.mViewManager).setCacheComposition(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 6:
                ((LottieAnimationViewManagerInterface) this.mViewManager).setProgress(t5, obj == null ? 0.0f : ((Double) obj).floatValue());
                break;
            case 7:
                ((LottieAnimationViewManagerInterface) this.mViewManager).setTextFiltersAndroid(t5, (ReadableArray) obj);
                break;
            case 8:
                ((LottieAnimationViewManagerInterface) this.mViewManager).setSourceDotLottieURI(t5, obj != null ? (String) obj : null);
                break;
            case 9:
                ((LottieAnimationViewManagerInterface) this.mViewManager).setLoop(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 10:
                ((LottieAnimationViewManagerInterface) this.mViewManager).setDummy(t5, (ReadableMap) obj);
                break;
            case 11:
                ((LottieAnimationViewManagerInterface) this.mViewManager).setSpeed(t5, obj == null ? 0.0d : ((Double) obj).doubleValue());
                break;
            case 12:
                ((LottieAnimationViewManagerInterface) this.mViewManager).setHardwareAccelerationAndroid(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 13:
                ((LottieAnimationViewManagerInterface) this.mViewManager).setEnableSafeModeAndroid(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 14:
                ((LottieAnimationViewManagerInterface) this.mViewManager).setRenderMode(t5, obj != null ? (String) obj : null);
                break;
            case 15:
                ((LottieAnimationViewManagerInterface) this.mViewManager).setColorFilters(t5, (ReadableArray) obj);
                break;
            case 16:
                ((LottieAnimationViewManagerInterface) this.mViewManager).setAutoPlay(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 17:
                ((LottieAnimationViewManagerInterface) this.mViewManager).setResizeMode(t5, obj != null ? (String) obj : null);
                break;
            case 18:
                ((LottieAnimationViewManagerInterface) this.mViewManager).setEnableMergePathsAndroidForKitKatAndAbove(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            default:
                super.kotlinCompat$setProperty(t5, str, obj);
                break;
        }
    }
}
