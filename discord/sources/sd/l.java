package sd;

import android.net.Uri;
import com.google.android.exoplayer2.Format;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends m {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final l f19898n;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f19899d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f19900e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f19901f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f19902g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f19903h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f19904i;
    public final Format j;
    public final List k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Map f19905l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f19906m;

    static {
        List list = Collections.EMPTY_LIST;
        f19898n = new l("", list, list, list, list, list, list, null, list, false, Collections.EMPTY_MAP, list);
    }

    public l(String str, List list, List list2, List list3, List list4, List list5, List list6, Format format, List list7, boolean z5, Map map, List list8) {
        super(str, list, z5);
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < list2.size(); i7++) {
            Uri uri = ((k) list2.get(i7)).f19892a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        b(list3, arrayList);
        b(list4, arrayList);
        b(list5, arrayList);
        b(list6, arrayList);
        this.f19899d = Collections.unmodifiableList(arrayList);
        this.f19900e = Collections.unmodifiableList(list2);
        this.f19901f = Collections.unmodifiableList(list3);
        this.f19902g = Collections.unmodifiableList(list4);
        this.f19903h = Collections.unmodifiableList(list5);
        this.f19904i = Collections.unmodifiableList(list6);
        this.j = format;
        this.k = list7 != null ? Collections.unmodifiableList(list7) : null;
        this.f19905l = Collections.unmodifiableMap(map);
        this.f19906m = Collections.unmodifiableList(list8);
    }

    public static void b(List list, ArrayList arrayList) {
        for (int i7 = 0; i7 < list.size(); i7++) {
            Uri uri = ((j) list.get(i7)).f19889a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
    }

    public static ArrayList c(int i7, List list, List list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            Object obj = list.get(i10);
            for (int i11 = 0; i11 < list2.size(); i11++) {
                ld.b bVar = (ld.b) list2.get(i11);
                if (bVar.f15019e == i7 && bVar.f15020i == i10) {
                    arrayList.add(obj);
                    break;
                }
            }
        }
        return arrayList;
    }

    @Override // ld.a
    public final Object a(List list) {
        ArrayList arrayListC = c(0, this.f19900e, list);
        List list2 = Collections.EMPTY_LIST;
        return new l(this.f19907a, this.f19908b, arrayListC, list2, c(1, this.f19902g, list), c(2, this.f19903h, list), list2, this.j, this.k, this.f19909c, this.f19905l, this.f19906m);
    }
}
