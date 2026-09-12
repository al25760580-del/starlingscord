package js;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes.dex */
public final class j extends fs.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f14129e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f14130f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f14131g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i7, Object obj, Object obj2, String str) {
        super(str, true);
        this.f14129e = i7;
        this.f14130f = obj;
        this.f14131g = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [T, js.a0] */
    @Override // fs.a
    public final long a() {
        long jA;
        int i7;
        w[] wVarArr;
        switch (this.f14129e) {
            case 0:
                p pVar = (p) this.f14130f;
                pVar.f14150d.a(pVar, (a0) ((Ref.ObjectRef) this.f14131g).element);
                return -1L;
            case 1:
                try {
                    ((p) this.f14130f).f14150d.b((w) this.f14131g);
                    break;
                } catch (IOException e10) {
                    ls.n nVar = ls.n.f15297a;
                    ls.n nVar2 = ls.n.f15297a;
                    String strStringPlus = Intrinsics.stringPlus("Http2Connection.Listener failure for ", ((p) this.f14130f).f14152i);
                    nVar2.getClass();
                    ls.n.i(4, strStringPlus, e10);
                    try {
                        ((w) this.f14131g).c(b.PROTOCOL_ERROR, e10);
                        break;
                    } catch (IOException unused) {
                    }
                }
                return -1L;
            default:
                fp.b bVar = (fp.b) this.f14130f;
                a0 settings = (a0) this.f14131g;
                Intrinsics.checkNotNullParameter(settings, "settings");
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                p pVar2 = (p) bVar.f9331i;
                synchronized (pVar2.T) {
                    synchronized (pVar2) {
                        try {
                            a0 a0Var = pVar2.N;
                            ?? a0Var2 = new a0();
                            a0Var2.b(a0Var);
                            a0Var2.b(settings);
                            objectRef.element = a0Var2;
                            jA = ((long) a0Var2.a()) - ((long) a0Var.a());
                            i7 = 0;
                            if (jA == 0 || pVar2.f14151e.isEmpty()) {
                                wVarArr = null;
                            } else {
                                Object[] array = pVar2.f14151e.values().toArray(new w[0]);
                                if (array == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                                }
                                wVarArr = (w[]) array;
                            }
                            a0 a0Var3 = (a0) objectRef.element;
                            Intrinsics.checkNotNullParameter(a0Var3, "<set-?>");
                            pVar2.N = a0Var3;
                            pVar2.G.c(new j(i7, pVar2, objectRef, Intrinsics.stringPlus(pVar2.f14152i, " onSettings")), 0L);
                            Unit unit = Unit.f14616a;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    try {
                        pVar2.T.c((a0) objectRef.element);
                    } catch (IOException e11) {
                        pVar2.f(e11);
                    }
                    Unit unit2 = Unit.f14616a;
                    break;
                }
                if (wVarArr != null) {
                    int length = wVarArr.length;
                    while (i7 < length) {
                        w wVar = wVarArr[i7];
                        i7++;
                        synchronized (wVar) {
                            wVar.f14190f += jA;
                            if (jA > 0) {
                                wVar.notifyAll();
                            }
                            Unit unit3 = Unit.f14616a;
                        }
                    }
                }
                return -1L;
        }
    }
}
