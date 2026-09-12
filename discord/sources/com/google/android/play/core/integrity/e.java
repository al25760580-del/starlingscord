package com.google.android.play.core.integrity;

import ci.d0;
import ig.l;
import java.util.Objects;
import wh.s;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements StandardIntegrityManager.StandardIntegrityTokenProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f6516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f6517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f6518c;

    public e(f fVar, long j, long j5) {
        this.f6516a = j;
        this.f6517b = j5;
        Objects.requireNonNull(fVar);
        this.f6518c = fVar;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenProvider
    public final l a(s sVar) {
        c cVar = this.f6518c.f6519a;
        long j = this.f6517b;
        cVar.f6510a.b("requestExpressIntegrityToken(%s)", Long.valueOf(j));
        ig.g gVar = new ig.g();
        wh.l lVar = new wh.l(cVar, gVar, sVar, this.f6516a, j, gVar);
        ci.d dVar = cVar.f6514e;
        dVar.getClass();
        dVar.a().post(new d0(dVar, gVar, gVar, lVar));
        return gVar.f11763a;
    }
}
