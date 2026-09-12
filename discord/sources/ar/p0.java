package ar;

import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class p0 extends r0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final k f2949i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.b f2950v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(kotlinx.coroutines.b bVar, long j, k kVar) {
        super(j);
        this.f2950v = bVar;
        this.f2949i = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2949i.C(this.f2950v, Unit.f14616a);
    }

    @Override // ar.r0
    public final String toString() {
        return super.toString() + this.f2949i;
    }
}
