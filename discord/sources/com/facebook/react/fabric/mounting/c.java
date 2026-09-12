package com.facebook.react.fabric.mounting;

import android.view.ViewGroup;
import com.facebook.react.modules.toast.ToastModule;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5240d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5241e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f5242i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f5243v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f5244w;

    public /* synthetic */ c(int i7, int i10, Ref.IntRef intRef, ViewGroup viewGroup) {
        this.f5241e = i7;
        this.f5242i = i10;
        this.f5243v = intRef;
        this.f5244w = viewGroup;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5240d) {
            case 0:
                SurfaceMountingManager.removeViewAtInternal$lambda$10(this.f5241e, this.f5242i, (Ref.IntRef) this.f5243v, (ViewGroup) this.f5244w);
                break;
            default:
                ToastModule.showWithGravity$lambda$1((ToastModule) this.f5243v, (String) this.f5244w, this.f5241e, this.f5242i);
                break;
        }
    }

    public /* synthetic */ c(ToastModule toastModule, String str, int i7, int i10) {
        this.f5243v = toastModule;
        this.f5244w = str;
        this.f5241e = i7;
        this.f5242i = i10;
    }
}
