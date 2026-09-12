package com.margelo.nitro.rive;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class s0 implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6978d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function0 f6979e;

    public /* synthetic */ s0(int i7, Function0 function0) {
        this.f6978d = i7;
        this.f6979e = function0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6978d) {
            case 0:
                HybridRiveView.executeOnUiThread$lambda$12(this.f6979e);
                return;
            default:
                try {
                    this.f6979e.invoke();
                    return;
                } catch (Error e10) {
                    throw new Error(e10.getMessage());
                } catch (Exception e11) {
                    throw new Error(e11.getMessage());
                }
        }
    }
}
