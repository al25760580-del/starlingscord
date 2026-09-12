package kr;

import ar.s;
import e4.l;
import e4.r;
import kotlin.jvm.internal.Intrinsics;
import or.d1;
import or.m;
import or.o1;
import or.q;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o1 f14805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o1 f14806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d1 f14807c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d1 f14808d;

    static {
        f6.a factory = new f6.a(13);
        boolean z5 = m.f17572a;
        Intrinsics.checkNotNullParameter(factory, "factory");
        boolean z6 = m.f17572a;
        f14805a = z6 ? new q(factory) : new l(factory);
        f6.a factory2 = new f6.a(14);
        Intrinsics.checkNotNullParameter(factory2, "factory");
        f14806b = z6 ? new q(factory2) : new l(factory2);
        s factory3 = new s(25);
        Intrinsics.checkNotNullParameter(factory3, "factory");
        f14807c = z6 ? new q(factory3) : new r(factory3);
        s factory4 = new s(26);
        Intrinsics.checkNotNullParameter(factory4, "factory");
        f14808d = z6 ? new q(factory4) : new r(factory4);
    }
}
