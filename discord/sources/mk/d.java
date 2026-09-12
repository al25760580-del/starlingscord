package mk;

import android.graphics.Paint;
import e4.p;
import ga.l;
import java.util.ArrayList;
import java.util.Calendar;
import s0.g;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final kh.f f15867f;

    public d(ik.e eVar, p pVar) {
        super(eVar, pVar);
        this.f15867f = new kh.f(6);
    }

    @Override // mk.e
    public final String a() {
        return ((l) this.f15868a.f8030n).t() ? "h" : "HH";
    }

    @Override // mk.e
    public final Paint.Align d() {
        return Paint.Align.RIGHT;
    }

    @Override // mk.e
    public final ArrayList f() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2000, 0, 0, 0, 0, 0);
        ArrayList arrayList = new ArrayList();
        int i7 = ((l) this.f15868a.f8030n).t() ? 12 : 24;
        for (int i10 = 0; i10 < i7; i10++) {
            arrayList.add(this.f15872e.format(calendar.getTime()));
            calendar.add(11, 1);
        }
        return arrayList;
    }

    @Override // mk.e
    public final String g(String str) {
        this.f15867f.getClass();
        return str.length() != 1 ? str : g.e(" ", str, " ");
    }

    @Override // mk.e
    public final boolean h() {
        return this.f15868a.g() != hk.b.f10922d;
    }

    @Override // mk.e
    public final boolean i() {
        return true;
    }
}
