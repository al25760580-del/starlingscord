package androidx.core.view;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;

/* JADX INFO: loaded from: classes.dex */
public abstract class i0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1671d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1672e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f1673i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Object f1674v;

    public i0() {
        if (i8.c.f11397i == null) {
            i8.c.f11397i = new i8.c(11);
        }
    }

    public int a(int i7) {
        if (i7 < this.f1673i) {
            return ((ByteBuffer) this.f1674v).getShort(this.f1672e + i7);
        }
        return 0;
    }

    public void b() {
        if (((sn.i) this.f1674v).E != this.f1673i) {
            throw new ConcurrentModificationException();
        }
    }

    public abstract Object c(View view);

    public abstract void d(View view, Object obj);

    public void e() {
        while (true) {
            int i7 = this.f1671d;
            sn.i iVar = (sn.i) this.f1674v;
            if (i7 >= iVar.f20319x || iVar.f20316i[i7] >= 0) {
                return;
            } else {
                this.f1671d = i7 + 1;
            }
        }
    }

    public void f(View view, Object obj) {
        Object tag;
        if (Build.VERSION.SDK_INT >= this.f1672e) {
            d(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f1672e) {
            tag = c(view);
        } else {
            tag = view.getTag(this.f1671d);
            if (!((Class) this.f1674v).isInstance(tag)) {
                tag = null;
            }
        }
        if (g(tag, obj)) {
            b bVarE = u0.e(view);
            if (bVarE == null) {
                bVarE = new b();
            }
            u0.p(view, bVarE);
            view.setTag(this.f1671d, obj);
            u0.j(this.f1673i, view);
        }
    }

    public abstract boolean g(Object obj, Object obj2);

    public boolean hasNext() {
        return this.f1671d < ((sn.i) this.f1674v).f20319x;
    }

    public void remove() {
        sn.i iVar = (sn.i) this.f1674v;
        b();
        if (this.f1672e == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
        iVar.c();
        iVar.l(this.f1672e);
        this.f1672e = -1;
        this.f1673i = iVar.E;
    }
}
