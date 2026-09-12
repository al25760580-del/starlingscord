package jm;

import android.util.SparseArray;
import android.view.View;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray f13956a = new SparseArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray f13957b = new SparseArray();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseArray f13958c = new SparseArray();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f13959d = new LinkedHashMap();

    public final synchronized boolean a(int i7, int i10, int i11, f fVar) {
        boolean z5;
        im.f fVar2 = (im.f) this.f13956a.get(i7);
        if (fVar2 != null) {
            d(fVar2);
            fVar2.f11899m = i11;
            fVar2.f11895g = fVar;
            i(i10, fVar2);
            z5 = true;
        } else {
            z5 = false;
        }
        return z5;
    }

    public final synchronized void b(f owner, int i7) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Map map = (Map) this.f13959d.get(Integer.valueOf(i7));
        if (map == null) {
            return;
        }
        map.remove(owner);
        if (map.isEmpty()) {
            this.f13959d.remove(Integer.valueOf(i7));
        }
    }

    public final synchronized void c(f fVar, int i7) {
        im.f fVar2 = (im.f) this.f13956a.get(i7);
        if (fVar2 != null) {
            if (!Intrinsics.areEqual(fVar2.f11895g, fVar)) {
            } else {
                d(fVar2);
            }
        }
    }

    public final synchronized void d(im.f fVar) {
        try {
            Integer num = (Integer) this.f13957b.get(fVar.f11892d);
            if (num != null) {
                this.f13957b.remove(fVar.f11892d);
                ArrayList arrayList = (ArrayList) this.f13958c.get(num.intValue());
                if (arrayList != null) {
                    synchronized (arrayList) {
                        arrayList.remove(fVar);
                    }
                    if (arrayList.size() == 0) {
                        this.f13958c.remove(num.intValue());
                    }
                }
            }
            if (fVar.f11894f != null) {
                UiThreadUtil.runOnUiThread(new im.c(1, fVar));
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void e(int i7) {
        im.f fVar = (im.f) this.f13956a.get(i7);
        if (fVar != null) {
            d(fVar);
            this.f13956a.remove(i7);
        }
    }

    public final synchronized im.f f(int i7) {
        return (im.f) this.f13956a.get(i7);
    }

    public final synchronized ArrayList g(View view) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(view, "view");
        int id2 = view.getId();
        synchronized (this) {
            arrayList = (ArrayList) this.f13958c.get(id2);
        }
        return arrayList;
        return arrayList;
    }

    public final void h(im.f handler) {
        boolean z5;
        Intrinsics.checkNotNullParameter(handler, "handler");
        synchronized (this) {
            this.f13956a.put(handler.f11892d, handler);
            Map map = (Map) this.f13959d.get(Integer.valueOf(handler.f11892d));
            z5 = false;
            if (map != null && (!map.isEmpty())) {
                z5 = true;
            }
        }
        if (z5) {
            c6.a aVar = new c6.a(25, this, handler);
            if (UiThreadUtil.isOnUiThread()) {
                aVar.invoke();
            } else {
                UiThreadUtil.runOnUiThread(new io.sentry.android.core.p(13, aVar));
            }
        }
    }

    public final synchronized void i(int i7, im.f fVar) {
        try {
            if (this.f13957b.get(fVar.f11892d) != null) {
                throw new IllegalStateException(("Handler " + fVar + " already attached").toString());
            }
            this.f13957b.put(fVar.f11892d, Integer.valueOf(i7));
            Object obj = this.f13958c.get(i7);
            if (obj == null) {
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(fVar);
                this.f13958c.put(i7, arrayList);
            } else {
                synchronized (obj) {
                    ((ArrayList) obj).add(fVar);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
