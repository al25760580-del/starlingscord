package op;

import ep.a0;
import java.security.AccessControlException;
import java.util.HashMap;
import np.l;
import np.n;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements n {
    public static final boolean F;
    public static final HashMap G;
    public String[] E;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f17493d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f17494e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f17495i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String[] f17496v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String[] f17497w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String[] f17498x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public a f17499y;

    static {
        try {
            F = "true".equals(System.getProperty("kotlin.ignore.old.metadata"));
        } catch (AccessControlException unused) {
            F = false;
        }
        HashMap map = new HashMap();
        G = map;
        map.put(yk.a.G(new up.c("kotlin.jvm.internal.KotlinClass")), a.CLASS);
        map.put(yk.a.G(new up.c("kotlin.jvm.internal.KotlinFileFacade")), a.FILE_FACADE);
        map.put(yk.a.G(new up.c("kotlin.jvm.internal.KotlinMultifileClass")), a.MULTIFILE_CLASS);
        map.put(yk.a.G(new up.c("kotlin.jvm.internal.KotlinMultifileClassPart")), a.MULTIFILE_CLASS_PART);
        map.put(yk.a.G(new up.c("kotlin.jvm.internal.KotlinSyntheticClass")), a.SYNTHETIC_CLASS);
    }

    @Override // np.n
    public final l e(up.b bVar, ap.a aVar) {
        a aVar2;
        up.c cVarA = bVar.a();
        if (cVarA.equals(a0.f8488a)) {
            return new c(0, this);
        }
        if (cVarA.equals(a0.f8500o)) {
            return new ga.l(27, this);
        }
        if (F || this.f17499y != null || (aVar2 = (a) G.get(bVar)) == null) {
            return null;
        }
        this.f17499y = aVar2;
        return new u4.b(29, this);
    }
}
