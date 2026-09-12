package androidx.lifecycle;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class LifecycleRegistry extends Lifecycle {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f2301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p.a f2302c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Lifecycle.State f2303d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WeakReference f2304e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2305f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f2306g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f2307h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f2308i;
    public final dr.d0 j;

    public LifecycleRegistry(LifecycleOwner provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f2294a = new ga.l(2);
        this.f2301b = true;
        this.f2302c = new p.a();
        Lifecycle.State state = Lifecycle.State.f2296e;
        this.f2303d = state;
        this.f2308i = new ArrayList();
        this.f2304e = new WeakReference(provider);
        this.j = dr.z.b(state);
    }

    @Override // androidx.lifecycle.Lifecycle
    public final void a(u object) {
        t fVar;
        Object obj;
        LifecycleOwner lifecycleOwner;
        n nVar;
        Intrinsics.checkNotNullParameter(object, "observer");
        e("addObserver");
        Lifecycle.State state = this.f2303d;
        Lifecycle.State initialState = Lifecycle.State.f2295d;
        if (state != initialState) {
            initialState = Lifecycle.State.f2296e;
        }
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        v vVar = new v();
        Intrinsics.checkNotNull(object);
        HashMap map = x.f2408a;
        Intrinsics.checkNotNullParameter(object, "object");
        boolean z5 = object instanceof t;
        boolean z6 = object instanceof DefaultLifecycleObserver;
        if (z5 && z6) {
            fVar = new f((DefaultLifecycleObserver) object, (t) object);
        } else if (z6) {
            fVar = new f((DefaultLifecycleObserver) object, (t) null);
        } else if (z5) {
            fVar = (t) object;
        } else {
            Class<?> cls = object.getClass();
            if (x.c(cls) == 2) {
                Object obj2 = x.f2409b.get(cls);
                Intrinsics.checkNotNull(obj2);
                List list = (List) obj2;
                if (list.size() == 1) {
                    x.a((Constructor) list.get(0), object);
                    Intrinsics.checkNotNullParameter(null, "generatedAdapter");
                    fVar = new x0();
                } else {
                    int size = list.size();
                    h[] hVarArr = new h[size];
                    for (int i7 = 0; i7 < size; i7++) {
                        x.a((Constructor) list.get(i7), object);
                        hVarArr[i7] = null;
                    }
                    fVar = new d3.b(hVarArr);
                }
            } else {
                fVar = new f(object);
            }
        }
        vVar.f2400b = fVar;
        vVar.f2399a = initialState;
        p.a aVar = this.f2302c;
        p.c cVarA = aVar.a(object);
        if (cVarA != null) {
            obj = cVarA.f17714e;
        } else {
            HashMap map2 = aVar.f17709w;
            p.c cVar = new p.c(object, vVar);
            aVar.f17723v++;
            p.c cVar2 = aVar.f17721e;
            if (cVar2 == null) {
                aVar.f17720d = cVar;
                aVar.f17721e = cVar;
            } else {
                cVar2.f17715i = cVar;
                cVar.f17716v = cVar2;
                aVar.f17721e = cVar;
            }
            map2.put(object, cVar);
            obj = null;
        }
        if (((v) obj) == null && (lifecycleOwner = (LifecycleOwner) this.f2304e.get()) != null) {
            boolean z7 = this.f2305f != 0 || this.f2306g;
            Lifecycle.State stateD = d(object);
            this.f2305f++;
            while (vVar.f2399a.compareTo(stateD) < 0 && this.f2302c.f17709w.containsKey(object)) {
                Lifecycle.State state2 = vVar.f2399a;
                ArrayList arrayList = this.f2308i;
                arrayList.add(state2);
                l lVar = n.Companion;
                Lifecycle.State state3 = vVar.f2399a;
                lVar.getClass();
                Intrinsics.checkNotNullParameter(state3, "state");
                int iOrdinal = state3.ordinal();
                if (iOrdinal == 1) {
                    nVar = n.ON_CREATE;
                } else if (iOrdinal != 2) {
                    nVar = iOrdinal != 3 ? null : n.ON_RESUME;
                } else {
                    nVar = n.ON_START;
                }
                if (nVar == null) {
                    throw new IllegalStateException("no event up from " + vVar.f2399a);
                }
                vVar.a(lifecycleOwner, nVar);
                arrayList.remove(arrayList.size() - 1);
                stateD = d(object);
            }
            if (!z7) {
                i();
            }
            this.f2305f--;
        }
    }

    @Override // androidx.lifecycle.Lifecycle
    public final Lifecycle.State b() {
        return this.f2303d;
    }

    @Override // androidx.lifecycle.Lifecycle
    public final void c(u observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        e("removeObserver");
        this.f2302c.b(observer);
    }

    public final Lifecycle.State d(u uVar) {
        HashMap map = this.f2302c.f17709w;
        p.c cVar = map.containsKey(uVar) ? ((p.c) map.get(uVar)).f17716v : null;
        Lifecycle.State state1 = cVar != null ? ((v) cVar.f17714e).f2399a : null;
        ArrayList arrayList = this.f2308i;
        Lifecycle.State state = arrayList.isEmpty() ? null : (Lifecycle.State) kk.b.e(1, arrayList);
        Lifecycle.State state2 = this.f2303d;
        Intrinsics.checkNotNullParameter(state2, "state1");
        if (state1 == null || state1.compareTo(state2) >= 0) {
            state1 = state2;
        }
        Intrinsics.checkNotNullParameter(state1, "state1");
        return (state == null || state.compareTo(state1) >= 0) ? state1 : state;
    }

    public final void e(String str) {
        if (this.f2301b) {
            o.a.T().f17070b.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(s0.g.e("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void f(n event) {
        Intrinsics.checkNotNullParameter(event, "event");
        e("handleLifecycleEvent");
        g(event.a());
    }

    public final void g(Lifecycle.State next) {
        if (this.f2303d == next) {
            return;
        }
        LifecycleOwner lifecycleOwner = (LifecycleOwner) this.f2304e.get();
        Lifecycle.State current = this.f2303d;
        Intrinsics.checkNotNullParameter(current, "current");
        Intrinsics.checkNotNullParameter(next, "next");
        if (current == Lifecycle.State.f2296e && next == Lifecycle.State.f2295d) {
            throw new IllegalStateException(("State must be at least '" + Lifecycle.State.f2297i + "' to be moved to '" + next + "' in component " + lifecycleOwner).toString());
        }
        Lifecycle.State state = Lifecycle.State.f2295d;
        if (current == state && current != next) {
            throw new IllegalStateException(("State is '" + state + "' and cannot be moved to `" + next + "` in component " + lifecycleOwner).toString());
        }
        this.f2303d = next;
        if (this.f2306g || this.f2305f != 0) {
            this.f2307h = true;
            return;
        }
        this.f2306g = true;
        i();
        this.f2306g = false;
        if (this.f2303d == state) {
            this.f2302c = new p.a();
        }
    }

    public final void h() {
        Lifecycle.State state = Lifecycle.State.f2297i;
        Intrinsics.checkNotNullParameter(state, "state");
        e("setCurrentState");
        g(state);
    }

    public final void i() {
        n nVar;
        LifecycleOwner lifecycleOwner = (LifecycleOwner) this.f2304e.get();
        if (lifecycleOwner == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            p.a aVar = this.f2302c;
            if (aVar.f17723v != 0) {
                p.c cVar = aVar.f17720d;
                Intrinsics.checkNotNull(cVar);
                Lifecycle.State state = ((v) cVar.f17714e).f2399a;
                p.c cVar2 = this.f2302c.f17721e;
                Intrinsics.checkNotNull(cVar2);
                Lifecycle.State state2 = ((v) cVar2.f17714e).f2399a;
                if (state == state2 && this.f2303d == state2) {
                    break;
                }
                this.f2307h = false;
                Lifecycle.State state3 = this.f2303d;
                p.c cVar3 = this.f2302c.f17720d;
                Intrinsics.checkNotNull(cVar3);
                int iCompareTo = state3.compareTo(((v) cVar3.f17714e).f2399a);
                ArrayList arrayList = this.f2308i;
                if (iCompareTo < 0) {
                    p.a aVar2 = this.f2302c;
                    p.b bVar = new p.b(aVar2.f17721e, aVar2.f17720d, 1);
                    aVar2.f17722i.put(bVar, Boolean.FALSE);
                    Intrinsics.checkNotNullExpressionValue(bVar, "descendingIterator(...)");
                    while (bVar.hasNext() && !this.f2307h) {
                        Map.Entry entry = (Map.Entry) bVar.next();
                        Intrinsics.checkNotNull(entry);
                        u uVar = (u) entry.getKey();
                        v vVar = (v) entry.getValue();
                        while (vVar.f2399a.compareTo(this.f2303d) > 0 && !this.f2307h && this.f2302c.f17709w.containsKey(uVar)) {
                            l lVar = n.Companion;
                            Lifecycle.State state4 = vVar.f2399a;
                            lVar.getClass();
                            n nVarA = l.a(state4);
                            if (nVarA == null) {
                                throw new IllegalStateException("no event down from " + vVar.f2399a);
                            }
                            arrayList.add(nVarA.a());
                            vVar.a(lifecycleOwner, nVarA);
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
                p.c cVar4 = this.f2302c.f17721e;
                if (!this.f2307h && cVar4 != null && this.f2303d.compareTo(((v) cVar4.f17714e).f2399a) > 0) {
                    p.a aVar3 = this.f2302c;
                    aVar3.getClass();
                    p.d dVar = new p.d(aVar3);
                    aVar3.f17722i.put(dVar, Boolean.FALSE);
                    Intrinsics.checkNotNullExpressionValue(dVar, "iteratorWithAdditions(...)");
                    while (dVar.hasNext() && !this.f2307h) {
                        Map.Entry entry2 = (Map.Entry) dVar.next();
                        u uVar2 = (u) entry2.getKey();
                        v vVar2 = (v) entry2.getValue();
                        while (vVar2.f2399a.compareTo(this.f2303d) < 0 && !this.f2307h && this.f2302c.f17709w.containsKey(uVar2)) {
                            arrayList.add(vVar2.f2399a);
                            l lVar2 = n.Companion;
                            Lifecycle.State state5 = vVar2.f2399a;
                            lVar2.getClass();
                            Intrinsics.checkNotNullParameter(state5, "state");
                            int iOrdinal = state5.ordinal();
                            if (iOrdinal == 1) {
                                nVar = n.ON_CREATE;
                            } else if (iOrdinal != 2) {
                                nVar = iOrdinal != 3 ? null : n.ON_RESUME;
                            } else {
                                nVar = n.ON_START;
                            }
                            if (nVar == null) {
                                throw new IllegalStateException("no event up from " + vVar2.f2399a);
                            }
                            vVar2.a(lifecycleOwner, nVar);
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
            } else {
                break;
            }
        }
        this.f2307h = false;
        this.j.setValue(this.f2303d);
    }
}
