package uc;

import androidx.recyclerview.widget.h;
import pc.t;
import pc.u;
import pc.v;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u f21035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f21036b;

    public c(h hVar, u uVar) {
        this.f21036b = hVar;
        this.f21035a = uVar;
    }

    @Override // pc.u
    public final boolean c() {
        return this.f21035a.c();
    }

    @Override // pc.u
    public final t h(long j) {
        t tVarH = this.f21035a.h(j);
        v vVar = tVarH.f17927a;
        long j5 = vVar.f17930a;
        long j7 = vVar.f17931b;
        long j10 = this.f21036b.f2614e;
        v vVar2 = new v(j5, j7 + j10);
        v vVar3 = tVarH.f17928b;
        return new t(vVar2, new v(vVar3.f17930a, vVar3.f17931b + j10));
    }

    @Override // pc.u
    public final long i() {
        return this.f21035a.i();
    }
}
