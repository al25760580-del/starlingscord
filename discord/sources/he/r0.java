package he;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public final class r0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final cl.b f10671h = new cl.b(15);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final cl.b f10672i = new cl.b(16);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10673a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10677e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f10678f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f10679g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q0[] f10675c = new q0[5];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f10674b = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10676d = -1;

    public r0(int i7) {
        this.f10673a = i7;
    }

    public final void a(float f2, int i7) {
        q0 q0Var;
        int i10 = this.f10676d;
        ArrayList arrayList = this.f10674b;
        if (i10 != 1) {
            Collections.sort(arrayList, f10671h);
            this.f10676d = 1;
        }
        int i11 = this.f10679g;
        q0[] q0VarArr = this.f10675c;
        if (i11 > 0) {
            int i12 = i11 - 1;
            this.f10679g = i12;
            q0Var = q0VarArr[i12];
        } else {
            q0Var = new q0();
        }
        int i13 = this.f10677e;
        this.f10677e = i13 + 1;
        q0Var.f10667a = i13;
        q0Var.f10668b = i7;
        q0Var.f10669c = f2;
        arrayList.add(q0Var);
        this.f10678f += i7;
        while (true) {
            int i14 = this.f10678f;
            int i15 = this.f10673a;
            if (i14 <= i15) {
                return;
            }
            int i16 = i14 - i15;
            q0 q0Var2 = (q0) arrayList.get(0);
            int i17 = q0Var2.f10668b;
            if (i17 <= i16) {
                this.f10678f -= i17;
                arrayList.remove(0);
                int i18 = this.f10679g;
                if (i18 < 5) {
                    this.f10679g = i18 + 1;
                    q0VarArr[i18] = q0Var2;
                }
            } else {
                q0Var2.f10668b = i17 - i16;
                this.f10678f -= i16;
            }
        }
    }

    public final float b() {
        int i7 = this.f10676d;
        ArrayList arrayList = this.f10674b;
        if (i7 != 0) {
            Collections.sort(arrayList, f10672i);
            this.f10676d = 0;
        }
        float f2 = 0.5f * this.f10678f;
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            q0 q0Var = (q0) arrayList.get(i11);
            i10 += q0Var.f10668b;
            if (i10 >= f2) {
                return q0Var.f10669c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((q0) kk.b.e(1, arrayList)).f10669c;
    }
}
