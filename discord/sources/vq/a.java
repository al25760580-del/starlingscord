package vq;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f21936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean[] f21937c;

    public a(Function1 function1, boolean[] zArr) {
        this.f21936b = function1;
        this.f21937c = zArr;
    }

    @Override // vq.m
    public final boolean d(Object obj) {
        boolean zBooleanValue = ((Boolean) this.f21936b.invoke(obj)).booleanValue();
        boolean[] zArr = this.f21937c;
        if (zBooleanValue) {
            zArr[0] = true;
        }
        return !zArr[0];
    }

    @Override // vq.m
    public final Object k() {
        return Boolean.valueOf(this.f21937c[0]);
    }
}
