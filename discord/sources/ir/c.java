package ir;

import ar.m0;
import fr.u;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f13405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function3 f13406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function3 f13407c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f13408d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final xn.h f13409e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Function3 f13410f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f13411g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f13412h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e f13413i;

    public c(e eVar, Object obj, Function3 function3, Function3 function4, a5.h hVar, xn.h hVar2, Function3 function5) {
        this.f13413i = eVar;
        this.f13405a = obj;
        this.f13406b = function3;
        this.f13407c = function4;
        this.f13408d = hVar;
        this.f13409e = hVar2;
        this.f13410f = function5;
    }

    public final void a() {
        Object obj = this.f13411g;
        if (obj instanceof u) {
            ((u) obj).h(this.f13412h, this.f13413i.f13419d);
            return;
        }
        m0 m0Var = obj instanceof m0 ? (m0) obj : null;
        if (m0Var != null) {
            m0Var.dispose();
        }
    }
}
