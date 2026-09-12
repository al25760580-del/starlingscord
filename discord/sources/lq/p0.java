package lq;

import java.util.ArrayDeque;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f15236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f15237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mq.b f15238c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mq.e f15239d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final mq.f f15240e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15241f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayDeque f15242g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public vq.j f15243h;

    public p0(boolean z5, boolean z6, mq.b typeSystemContext, mq.e kotlinTypePreparator, mq.f kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(typeSystemContext, "typeSystemContext");
        Intrinsics.checkNotNullParameter(kotlinTypePreparator, "kotlinTypePreparator");
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        this.f15236a = z5;
        this.f15237b = z6;
        this.f15238c = typeSystemContext;
        this.f15239d = kotlinTypePreparator;
        this.f15240e = kotlinTypeRefiner;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f15242g;
        Intrinsics.checkNotNull(arrayDeque);
        arrayDeque.clear();
        vq.j jVar = this.f15243h;
        Intrinsics.checkNotNull(jVar);
        jVar.clear();
    }

    public boolean b(pq.d subType, pq.d superType) {
        Intrinsics.checkNotNullParameter(subType, "subType");
        Intrinsics.checkNotNullParameter(superType, "superType");
        return true;
    }

    public final void c() {
        if (this.f15242g == null) {
            this.f15242g = new ArrayDeque(4);
        }
        if (this.f15243h == null) {
            int i7 = vq.j.f21949i;
            this.f15243h = vq.m.f();
        }
    }

    public final d1 d(pq.d type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return this.f15239d.a(type);
    }

    public final z e(pq.d type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return this.f15240e.a(type);
    }
}
