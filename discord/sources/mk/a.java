package mk;

import android.graphics.Paint;
import e4.p;
import ga.l;
import java.util.ArrayList;
import java.util.Calendar;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f15864f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(ik.e eVar, p pVar, int i7) {
        super(eVar, pVar);
        this.f15864f = i7;
    }

    @Override // mk.e
    public final String a() {
        switch (this.f15864f) {
            case 0:
                return ((l) this.f15868a.f8030n).t() ? " a " : "";
            case 1:
                return "mm";
            default:
                return "LLLL";
        }
    }

    @Override // mk.e
    public final Paint.Align d() {
        switch (this.f15864f) {
            case 0:
                return Paint.Align.RIGHT;
            case 1:
                l lVar = (l) this.f15868a.f8030n;
                return (((p) lVar.f9547e).g() != hk.b.f10923e || lVar.t()) ? Paint.Align.RIGHT : Paint.Align.LEFT;
            default:
                return Paint.Align.LEFT;
        }
    }

    @Override // mk.e
    public final ArrayList f() {
        switch (this.f15864f) {
            case 0:
                Calendar calendar = Calendar.getInstance();
                calendar.set(2000, 0, 0, 0, 0, 0);
                ArrayList arrayList = new ArrayList();
                calendar.set(11, 0);
                arrayList.add(this.f15872e.format(calendar.getTime()));
                calendar.add(11, 12);
                arrayList.add(this.f15872e.format(calendar.getTime()));
                return arrayList;
            case 1:
                Calendar calendar2 = Calendar.getInstance();
                ArrayList arrayList2 = new ArrayList();
                int iIntValue = 0;
                calendar2.set(12, 0);
                while (iIntValue < 60) {
                    arrayList2.add(this.f15872e.format(calendar2.getTime()));
                    p pVar = this.f15868a;
                    calendar2.add(12, ((Integer) ((jk.a) pVar.f8024f).f13919a).intValue());
                    iIntValue += ((Integer) ((jk.a) pVar.f8024f).f13919a).intValue();
                }
                return arrayList2;
            default:
                ArrayList arrayList3 = new ArrayList();
                Calendar calendar3 = Calendar.getInstance();
                calendar3.set(2, 0);
                for (int i7 = 0; i7 <= 11; i7++) {
                    arrayList3.add(c(calendar3));
                    calendar3.add(2, 1);
                }
                return arrayList3;
        }
    }

    @Override // mk.e
    public final boolean h() {
        switch (this.f15864f) {
            case 0:
                p pVar = this.f15868a;
                return ((l) pVar.f8030n).t() && pVar.g() != hk.b.f10922d;
            case 1:
                return this.f15868a.g() != hk.b.f10922d;
            default:
                return this.f15868a.g() == hk.b.f10922d;
        }
    }

    @Override // mk.e
    public final boolean i() {
        switch (this.f15864f) {
            case 0:
                return false;
            case 1:
                return true;
            default:
                return true;
        }
    }
}
