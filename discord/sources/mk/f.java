package mk;

import android.graphics.Paint;
import e4.p;
import fk.k;
import java.util.ArrayList;
import java.util.Calendar;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15873f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f15874g;

    @Override // mk.e
    public final String a() {
        return e4.f.z(((jk.b) this.f15868a.f8022d).f13918b, k.f9280i);
    }

    @Override // mk.e
    public final Paint.Align d() {
        return Paint.Align.RIGHT;
    }

    @Override // mk.e
    public final ArrayList f() {
        ArrayList arrayList = new ArrayList();
        Calendar calendar = Calendar.getInstance();
        p pVar = this.f15868a;
        jk.a aVar = (jk.a) pVar.f8025g;
        jk.a aVar2 = (jk.a) pVar.f8026h;
        int i7 = pVar.a(aVar) == null ? this.f15873f : pVar.a((jk.a) pVar.f8025g).get(1);
        int i10 = (pVar.a(aVar2) == null ? this.f15874g : pVar.a(aVar2).get(1)) - i7;
        calendar.set(1, i7);
        for (int i11 = 0; i11 <= i10; i11++) {
            arrayList.add(c(calendar));
            calendar.add(1, 1);
        }
        return arrayList;
    }

    @Override // mk.e
    public final boolean h() {
        return this.f15868a.g() == hk.b.f10922d;
    }

    @Override // mk.e
    public final boolean i() {
        return false;
    }
}
