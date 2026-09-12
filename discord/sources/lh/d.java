package lh;

import af.w;
import android.os.Bundle;
import android.os.Parcel;
import android.view.View;
import androidx.recyclerview.widget.h;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import io.sentry.android.core.p;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import vd.g;
import vd.j;
import ze.i;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15090c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f15091d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f15092e;

    public d(d dVar, xe.d[] dVarArr, boolean z5, int i7) {
        this.f15088a = 4;
        this.f15092e = dVar;
        this.f15091d = dVarArr;
        boolean z6 = false;
        if (dVarArr != null && z5) {
            z6 = true;
        }
        this.f15090c = z6;
        this.f15089b = i7;
    }

    public static d f() {
        d dVar = new d(3);
        dVar.f15090c = true;
        dVar.f15089b = 0;
        return dVar;
    }

    @Override // lc.d
    public void a(j jVar) {
        je.b.k(!this.f15090c);
        je.b.k(this.f15089b == 1);
        je.b.g(((j) this.f15091d) == jVar);
        this.f15089b = 2;
    }

    @Override // lc.d
    public Object c() {
        ArrayDeque arrayDeque = (ArrayDeque) this.f15092e;
        j jVar = (j) this.f15091d;
        je.b.k(!this.f15090c);
        if (this.f15089b != 2 || arrayDeque.isEmpty()) {
            return null;
        }
        vd.d dVar = (vd.d) arrayDeque.removeFirst();
        if (jVar.c(4)) {
            dVar.a(4);
        } else {
            long j = jVar.f15012x;
            ByteBuffer byteBuffer = jVar.f15010v;
            byteBuffer.getClass();
            byte[] bArrArray = byteBuffer.array();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.unmarshall(bArrArray, 0, bArrArray.length);
            parcelObtain.setDataPosition(0);
            Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
            parcelObtain.recycle();
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("c");
            parcelableArrayList.getClass();
            dVar.g(jVar.f15012x, new h(j, je.b.v(vd.c.f21638g0, parcelableArrayList), 8), 0L);
        }
        jVar.e();
        this.f15089b = 0;
        return dVar;
    }

    @Override // lc.d
    public Object d() {
        je.b.k(!this.f15090c);
        if (this.f15089b != 0) {
            return null;
        }
        this.f15089b = 1;
        return (j) this.f15091d;
    }

    public d e() {
        w.a("execute parameter required", ((i) this.f15091d) != null);
        return new d(this, (xe.d[]) this.f15092e, this.f15090c, this.f15089b);
    }

    @Override // lc.d
    public void flush() {
        je.b.k(!this.f15090c);
        ((j) this.f15091d).e();
        this.f15089b = 0;
    }

    public void g(int i7) {
        switch (this.f15088a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f15092e;
                WeakReference weakReference = sideSheetBehavior.f6429p;
                if (weakReference != null && weakReference.get() != null) {
                    this.f15089b = i7;
                    if (!this.f15090c) {
                        ((View) sideSheetBehavior.f6429p.get()).postOnAnimation((p) this.f15091d);
                        this.f15090c = true;
                    }
                    break;
                }
                break;
            default:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f15092e;
                WeakReference weakReference2 = bottomSheetBehavior.W;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.f15089b = i7;
                    if (!this.f15090c) {
                        ((View) bottomSheetBehavior.W.get()).postOnAnimation((a3.h) this.f15091d);
                        this.f15090c = true;
                    }
                    break;
                }
                break;
        }
    }

    @Override // lc.d
    public void release() {
        this.f15090c = true;
    }

    public d(int i7) {
        this.f15088a = i7;
        switch (i7) {
            case 3:
                break;
            default:
                this.f15091d = new j(1);
                this.f15092e = new ArrayDeque();
                for (int i10 = 0; i10 < 2; i10++) {
                    ((ArrayDeque) this.f15092e).addFirst(new vd.d(this, 0));
                }
                this.f15089b = 0;
                break;
        }
    }

    public d(SideSheetBehavior sideSheetBehavior) {
        this.f15088a = 0;
        this.f15092e = sideSheetBehavior;
        this.f15091d = new p(20, this);
    }

    public d(BottomSheetBehavior bottomSheetBehavior) {
        this.f15088a = 1;
        this.f15092e = bottomSheetBehavior;
        this.f15091d = new a3.h(29, this);
    }

    @Override // vd.g
    public void b(long j) {
    }
}
