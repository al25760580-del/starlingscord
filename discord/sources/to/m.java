package to;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.d0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.x;

/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m f20868c = new m(d0.g(g.f20860c, j.f20863c, h.f20861c, i.f20862c));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f20869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f20870b;

    public m(List kinds) {
        Intrinsics.checkNotNullParameter(kinds, "kinds");
        this.f20869a = kinds;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : kinds) {
            up.c cVar = ((k) obj).f20864a;
            Object arrayList = linkedHashMap.get(cVar);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(cVar, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        this.f20870b = linkedHashMap;
    }

    public final l a(String className, up.c packageFqName) {
        Integer numValueOf;
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        Intrinsics.checkNotNullParameter(className, "className");
        List<k> list = (List) this.f20870b.get(packageFqName);
        if (list != null) {
            for (k kVar : list) {
                int i7 = 0;
                if (x.o(className, kVar.f20865b, false)) {
                    String strSubstring = className.substring(kVar.f20865b.length());
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    if (strSubstring.length() == 0) {
                        numValueOf = null;
                        break;
                    }
                    int length = strSubstring.length();
                    int i10 = 0;
                    while (true) {
                        if (i7 >= length) {
                            numValueOf = Integer.valueOf(i10);
                            break;
                        }
                        int iCharAt = strSubstring.charAt(i7) - '0';
                        if (iCharAt < 0 || iCharAt >= 10) {
                            numValueOf = null;
                            break;
                        }
                        i10 = (i10 * 10) + iCharAt;
                        i7++;
                    }
                    if (numValueOf != null) {
                        return new l(kVar, numValueOf.intValue());
                    }
                }
            }
        }
        return null;
    }
}
