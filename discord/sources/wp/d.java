package wp;

import kotlin.Unit;
import kotlin.collections.d0;
import kotlin.collections.f1;
import kotlin.collections.p0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import lq.z;
import yo.q0;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f22420d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f22414e = new d(0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final d f22415i = new d(1);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final d f22416v = new d(2);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final d f22417w = new d(3);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final d f22418x = new d(4);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final d f22419y = new d(5);
    public static final d E = new d(6);
    public static final d F = new d(7);
    public static final d G = new d(8);
    public static final d H = new d(9);
    public static final d I = new d(10);
    public static final d J = new d(11);
    public static final d K = new d(12);
    public static final d L = new d(13);
    public static final d M = new d(14);
    public static final d N = new d(15);

    public /* synthetic */ d(int i7) {
        this.f22420d = i7;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f22420d) {
            case 0:
                j withOptions = (j) obj;
                h hVar = f.f22422a;
                Intrinsics.checkNotNullParameter(withOptions, "$this$withOptions");
                withOptions.d(p0.f14661d);
                return Unit.f14616a;
            case 1:
                j withOptions2 = (j) obj;
                h hVar2 = f.f22422a;
                Intrinsics.checkNotNullParameter(withOptions2, "$this$withOptions");
                r rVar = s.f22473d;
                withOptions2.l();
                withOptions2.d(i.f22431i);
                return Unit.f14616a;
            case 2:
                j withOptions3 = (j) obj;
                h hVar3 = f.f22422a;
                Intrinsics.checkNotNullParameter(withOptions3, "$this$withOptions");
                withOptions3.h();
                return Unit.f14616a;
            case 3:
                j withOptions4 = (j) obj;
                h hVar4 = f.f22422a;
                Intrinsics.checkNotNullParameter(withOptions4, "$this$withOptions");
                withOptions4.h();
                withOptions4.d(p0.f14661d);
                return Unit.f14616a;
            case 4:
                j withOptions5 = (j) obj;
                h hVar5 = f.f22422a;
                Intrinsics.checkNotNullParameter(withOptions5, "$this$withOptions");
                withOptions5.h();
                withOptions5.d(p0.f14661d);
                withOptions5.m();
                return Unit.f14616a;
            case 5:
                j withOptions6 = (j) obj;
                h hVar6 = f.f22422a;
                Intrinsics.checkNotNullParameter(withOptions6, "$this$withOptions");
                withOptions6.d(p0.f14661d);
                withOptions6.i(b.f22411c);
                withOptions6.j(o.f22467e);
                return Unit.f14616a;
            case 6:
                j withOptions7 = (j) obj;
                h hVar7 = f.f22422a;
                Intrinsics.checkNotNullParameter(withOptions7, "$this$withOptions");
                withOptions7.h();
                withOptions7.d(p0.f14661d);
                withOptions7.i(b.f22411c);
                withOptions7.f();
                withOptions7.j(o.f22468i);
                withOptions7.a();
                withOptions7.c();
                withOptions7.m();
                withOptions7.g();
                return Unit.f14616a;
            case 7:
                j withOptions8 = (j) obj;
                h hVar8 = f.f22422a;
                Intrinsics.checkNotNullParameter(withOptions8, "$this$withOptions");
                withOptions8.d(i.f22430e);
                return Unit.f14616a;
            case 8:
                j withOptions9 = (j) obj;
                h hVar9 = f.f22422a;
                Intrinsics.checkNotNullParameter(withOptions9, "$this$withOptions");
                withOptions9.d(i.f22431i);
                return Unit.f14616a;
            case 9:
                j withOptions10 = (j) obj;
                h hVar10 = f.f22422a;
                Intrinsics.checkNotNullParameter(withOptions10, "$this$withOptions");
                withOptions10.i(b.f22411c);
                withOptions10.j(o.f22467e);
                return Unit.f14616a;
            case 10:
                j withOptions11 = (j) obj;
                h hVar11 = f.f22422a;
                Intrinsics.checkNotNullParameter(withOptions11, "$this$withOptions");
                withOptions11.b();
                withOptions11.i(b.f22410b);
                withOptions11.d(i.f22431i);
                return Unit.f14616a;
            case 11:
                z it = (z) obj;
                int i7 = h.f22427f;
                Intrinsics.checkNotNullParameter(it, "it");
                return it;
            case 12:
                int i10 = h.f22427f;
                return "";
            case 13:
                j withOptions12 = (j) obj;
                int i11 = h.f22427f;
                Intrinsics.checkNotNullParameter(withOptions12, "$this$withOptions");
                withOptions12.e(f1.d(withOptions12.k(), d0.g(so.o.f20382p, so.o.f20383q)));
                return Unit.f14616a;
            case 14:
                z it2 = (z) obj;
                KProperty[] kPropertyArr = k.Y;
                Intrinsics.checkNotNullParameter(it2, "it");
                return it2;
            default:
                KProperty[] kPropertyArr2 = k.Y;
                Intrinsics.checkNotNullParameter((q0) obj, "it");
                return "...";
        }
    }
}
