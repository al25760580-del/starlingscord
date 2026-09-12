package com.facebook.soloader;

import android.os.StrictMode;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e4.c f5384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public HashSet f5385b;

    @Override // com.facebook.soloader.b0
    public final String b() {
        return "DirectSplitSoSource";
    }

    @Override // com.facebook.soloader.b0
    public final int c(String str, int i7, StrictMode.ThreadPolicy threadPolicy) {
        String strO;
        HashSet hashSet = this.f5385b;
        if (hashSet == null) {
            throw new IllegalStateException("prepare not called");
        }
        if (!hashSet.contains(str)) {
            return 0;
        }
        HashSet hashSet2 = this.f5385b;
        if (hashSet2 == null || this.f5384a == null) {
            throw new IllegalStateException("prepare not called");
        }
        if (hashSet2.contains(str)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(SoLoader.f5366d.getApplicationInfo().sourceDir);
            sb2.append("!/lib/");
            strO = a3.e.o(sb2, (String) this.f5384a.f7966e, "/", str);
        } else {
            strO = null;
        }
        strO.getClass();
        System.load(strO);
        return 1;
    }

    @Override // com.facebook.soloader.b0
    public final void d(int i7) throws IOException {
        InputStream inputStreamOpen = SoLoader.f5366d.getAssets().open("base.soloader-manifest");
        try {
            this.f5384a = e4.c.R(inputStreamOpen);
            if (inputStreamOpen != null) {
                inputStreamOpen.close();
            }
            this.f5385b = new HashSet((List) this.f5384a.f7967i);
        } catch (Throwable th2) {
            if (inputStreamOpen != null) {
                try {
                    inputStreamOpen.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }
}
