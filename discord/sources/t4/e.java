package t4;

import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import e4.r;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f20617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l4.i f20618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f20619c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f20620d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f20621e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f20622f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f20623g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f20624h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final r4.d f20625i;
    public final int j;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f20626l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f20627m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f20628n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f20629o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final float f20630p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final r4.a f20631q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final r f20632r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final r4.b f20633s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final List f20634t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f20635u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f20636v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final op.c f20637w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e9.b f20638x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f20639y;

    public e(List list, l4.i iVar, String str, long j, int i7, long j5, String str2, List list2, r4.d dVar, int i10, int i11, int i12, float f2, float f7, float f10, float f11, r4.a aVar, r rVar, List list3, int i13, r4.b bVar, boolean z5, op.c cVar, e9.b bVar2, int i14) {
        this.f20617a = list;
        this.f20618b = iVar;
        this.f20619c = str;
        this.f20620d = j;
        this.f20621e = i7;
        this.f20622f = j5;
        this.f20623g = str2;
        this.f20624h = list2;
        this.f20625i = dVar;
        this.j = i10;
        this.k = i11;
        this.f20626l = i12;
        this.f20627m = f2;
        this.f20628n = f7;
        this.f20629o = f10;
        this.f20630p = f11;
        this.f20631q = aVar;
        this.f20632r = rVar;
        this.f20634t = list3;
        this.f20635u = i13;
        this.f20633s = bVar;
        this.f20636v = z5;
        this.f20637w = cVar;
        this.f20638x = bVar2;
        this.f20639y = i14;
    }

    public final String a(String str) {
        int i7;
        StringBuilder sbN = kk.b.n(str);
        sbN.append(this.f20619c);
        sbN.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        long j = this.f20622f;
        l4.i iVar = this.f20618b;
        e eVar = (e) iVar.f14871i.b(j);
        if (eVar != null) {
            sbN.append("\t\tParents: ");
            sbN.append(eVar.f20619c);
            for (e eVar2 = (e) iVar.f14871i.b(eVar.f20622f); eVar2 != null; eVar2 = (e) iVar.f14871i.b(eVar2.f20622f)) {
                sbN.append("->");
                sbN.append(eVar2.f20619c);
            }
            sbN.append(str);
            sbN.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        }
        List list = this.f20624h;
        if (!list.isEmpty()) {
            sbN.append(str);
            sbN.append("\tMasks: ");
            sbN.append(list.size());
            sbN.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        }
        int i10 = this.j;
        if (i10 != 0 && (i7 = this.k) != 0) {
            sbN.append(str);
            sbN.append("\tBackground: ");
            sbN.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(i10), Integer.valueOf(i7), Integer.valueOf(this.f20626l)));
        }
        List list2 = this.f20617a;
        if (!list2.isEmpty()) {
            sbN.append(str);
            sbN.append("\tShapes:\n");
            for (Object obj : list2) {
                sbN.append(str);
                sbN.append("\t\t");
                sbN.append(obj);
                sbN.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
            }
        }
        return sbN.toString();
    }

    public final String toString() {
        return a("");
    }
}
