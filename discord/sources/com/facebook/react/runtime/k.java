package com.facebook.react.runtime;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5308d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ReactHostImpl f5309e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f5310i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ ReactSurfaceImpl f5311v;

    public /* synthetic */ k(ReactHostImpl reactHostImpl, String str, ReactSurfaceImpl reactSurfaceImpl, int i7) {
        this.f5308d = i7;
        this.f5309e = reactHostImpl;
        this.f5310i = str;
        this.f5311v = reactSurfaceImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f5308d) {
            case 0:
                return ReactHostImpl.prerenderSurface$lambda$2(this.f5309e, this.f5310i, this.f5311v, (ReactInstance) obj);
            case 1:
                return ReactHostImpl.stopSurface$lambda$4(this.f5309e, this.f5310i, this.f5311v, (ReactInstance) obj);
            default:
                return ReactHostImpl.startSurface$lambda$3(this.f5309e, this.f5310i, this.f5311v, (ReactInstance) obj);
        }
    }
}
