package com.facebook.soloader;

import android.content.Context;
import android.os.StrictMode;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends b0 implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f5377b;

    public a(Context context, int i7) {
        this.f5376a = i7;
        this.f5377b = new e(new File(context.getApplicationInfo().nativeLibraryDir), i7);
    }

    @Override // com.facebook.soloader.w
    public final b0 a(Context context) {
        this.f5377b = new e(new File(context.getApplicationInfo().nativeLibraryDir), this.f5376a | 1);
        return this;
    }

    @Override // com.facebook.soloader.b0
    public final String b() {
        return "ApplicationSoSource";
    }

    @Override // com.facebook.soloader.b0
    public final int c(String str, int i7, StrictMode.ThreadPolicy threadPolicy) {
        return this.f5377b.c(str, i7, threadPolicy);
    }

    @Override // com.facebook.soloader.b0
    public final void d(int i7) {
        this.f5377b.getClass();
    }

    @Override // com.facebook.soloader.b0
    public final String toString() {
        return "ApplicationSoSource[" + this.f5377b.toString() + "]";
    }
}
