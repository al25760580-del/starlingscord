package com.facebook.react;

import android.content.Context;
import com.facebook.react.defaults.DefaultNewArchitectureEntryPoint;
import com.facebook.react.soloader.OpenSourceMergedSoMapping;
import com.facebook.soloader.SoLoader;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class ReactNativeApplicationEntryPoint {
    public static void loadReactNative(Context context) {
        try {
            OpenSourceMergedSoMapping openSourceMergedSoMapping = OpenSourceMergedSoMapping.INSTANCE;
            boolean z5 = SoLoader.f5363a;
            synchronized (SoLoader.class) {
                SoLoader.f5375o = openSourceMergedSoMapping;
            }
            SoLoader.init(context, 0);
            DefaultNewArchitectureEntryPoint.load();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }
}
