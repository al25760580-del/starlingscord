package ne;

import com.google.android.flexbox.FlexboxLayoutManager;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f16564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f16565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f16566c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16567d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f16568e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f16569f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f16570g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ FlexboxLayoutManager f16571h;

    public d(FlexboxLayoutManager flexboxLayoutManager) {
        this.f16571h = flexboxLayoutManager;
    }

    public static void a(d dVar) {
        FlexboxLayoutManager flexboxLayoutManager = dVar.f16571h;
        if (flexboxLayoutManager.isMainAxisDirectionHorizontal() || !flexboxLayoutManager.f5887w) {
            dVar.f16566c = dVar.f16568e ? flexboxLayoutManager.J.g() : flexboxLayoutManager.J.k();
        } else {
            dVar.f16566c = dVar.f16568e ? flexboxLayoutManager.J.g() : flexboxLayoutManager.getWidth() - flexboxLayoutManager.J.k();
        }
    }

    public static void b(d dVar) {
        dVar.f16564a = -1;
        dVar.f16565b = -1;
        dVar.f16566c = Integer.MIN_VALUE;
        dVar.f16569f = false;
        dVar.f16570g = false;
        FlexboxLayoutManager flexboxLayoutManager = dVar.f16571h;
        if (flexboxLayoutManager.isMainAxisDirectionHorizontal()) {
            int i7 = flexboxLayoutManager.f5884e;
            if (i7 == 0) {
                dVar.f16568e = flexboxLayoutManager.f5883d == 1;
                return;
            } else {
                dVar.f16568e = i7 == 2;
                return;
            }
        }
        int i10 = flexboxLayoutManager.f5884e;
        if (i10 == 0) {
            dVar.f16568e = flexboxLayoutManager.f5883d == 3;
        } else {
            dVar.f16568e = i10 == 2;
        }
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.f16564a + ", mFlexLinePosition=" + this.f16565b + ", mCoordinate=" + this.f16566c + ", mPerpendicularCoordinate=" + this.f16567d + ", mLayoutFromEnd=" + this.f16568e + ", mValid=" + this.f16569f + ", mAssignedFromSavedState=" + this.f16570g + '}';
    }
}
