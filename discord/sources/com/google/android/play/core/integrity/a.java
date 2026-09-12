package com.google.android.play.core.integrity;

import a5.l0;
import android.text.TextUtils;
import ci.d0;
import ig.h;
import ig.j;
import ig.l;
import wh.k;
import wh.r;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements StandardIntegrityManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f6507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f6508b;

    public a(c cVar, f fVar) {
        this.f6507a = cVar;
        this.f6508b = fVar;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager
    public final l a(r rVar) {
        if (!TextUtils.isEmpty(null)) {
            try {
                return l0.v(new e(this.f6508b, rVar.f22303a, Long.parseLong(null)));
            } catch (NumberFormatException e10) {
                return l0.u(e10);
            }
        }
        long j = rVar.f22303a;
        Object[] objArr = {Long.valueOf(j)};
        c cVar = this.f6507a;
        cVar.f6510a.b("warmUpIntegrityToken(%s)", objArr);
        ig.g gVar = new ig.g();
        k kVar = new k(cVar, gVar, j, gVar);
        ci.d dVar = cVar.f6514e;
        dVar.getClass();
        dVar.a().post(new d0(dVar, gVar, gVar, kVar));
        e4.c cVar2 = new e4.c(23, this, rVar);
        l lVar = gVar.f11763a;
        lVar.getClass();
        h4.a aVar = h.f11764a;
        l lVar2 = new l();
        lVar.f11775b.e(new j(aVar, cVar2, lVar2));
        lVar.t();
        return lVar2;
    }
}
