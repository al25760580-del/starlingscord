package mk;

import android.graphics.Paint;
import fk.k;
import java.util.ArrayList;
import java.util.Calendar;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends e {
    @Override // mk.e
    public final String a() {
        return e4.f.z(((jk.b) this.f15868a.f8022d).f13918b, k.f9279e);
    }

    @Override // mk.e
    public final Paint.Align d() {
        return Paint.Align.RIGHT;
    }

    @Override // mk.e
    public final ArrayList f() {
        Calendar calendar = Calendar.getInstance();
        ArrayList arrayList = new ArrayList();
        calendar.set(2, 0);
        calendar.set(5, 1);
        for (int i7 = 1; i7 <= 31; i7++) {
            arrayList.add(c(calendar));
            calendar.add(5, 1);
        }
        return arrayList;
    }

    @Override // mk.e
    public final boolean h() {
        return this.f15868a.g() == hk.b.f10922d;
    }

    @Override // mk.e
    public final boolean i() {
        return true;
    }
}
