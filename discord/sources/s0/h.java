package s0;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class h implements e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q f19674d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f19676f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f19677g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public q f19671a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f19672b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f19673c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f19675e = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f19678h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public i f19679i = null;
    public boolean j = false;
    public final ArrayList k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f19680l = new ArrayList();

    public h(q qVar) {
        this.f19674d = qVar;
    }

    @Override // s0.e
    public final void a(e eVar) {
        ArrayList<h> arrayList = this.f19680l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((h) it.next()).j) {
                return;
            }
        }
        this.f19673c = true;
        q qVar = this.f19671a;
        if (qVar != null) {
            qVar.a(this);
        }
        if (this.f19672b) {
            this.f19674d.a(this);
            return;
        }
        h hVar = null;
        int i7 = 0;
        for (h hVar2 : arrayList) {
            if (!(hVar2 instanceof i)) {
                i7++;
                hVar = hVar2;
            }
        }
        if (hVar != null && i7 == 1 && hVar.j) {
            i iVar = this.f19679i;
            if (iVar != null) {
                if (!iVar.j) {
                    return;
                } else {
                    this.f19676f = this.f19678h * iVar.f19677g;
                }
            }
            d(hVar.f19677g + this.f19676f);
        }
        q qVar2 = this.f19671a;
        if (qVar2 != null) {
            qVar2.a(this);
        }
    }

    public final void b(q qVar) {
        this.k.add(qVar);
        if (this.j) {
            qVar.a(qVar);
        }
    }

    public final void c() {
        this.f19680l.clear();
        this.k.clear();
        this.j = false;
        this.f19677g = 0;
        this.f19673c = false;
        this.f19672b = false;
    }

    public void d(int i7) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.f19677g = i7;
        for (e eVar : this.k) {
            eVar.a(eVar);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f19674d.f19693b.f1249g0);
        sb2.append(":");
        switch (this.f19675e) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 3:
                str = "VERTICAL_DIMENSION";
                break;
            case 4:
                str = "LEFT";
                break;
            case 5:
                str = "RIGHT";
                break;
            case 6:
                str = "TOP";
                break;
            case 7:
                str = "BOTTOM";
                break;
            case 8:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        sb2.append(str);
        sb2.append("(");
        sb2.append(this.j ? Integer.valueOf(this.f19677g) : "unresolved");
        sb2.append(") <t=");
        sb2.append(this.f19680l.size());
        sb2.append(":d=");
        sb2.append(this.k.size());
        sb2.append(">");
        return sb2.toString();
    }
}
