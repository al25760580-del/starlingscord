package si;

import java.util.Date;
import java.util.HashMap;
import qi.f;
import qi.g;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements ri.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f20264f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f20265g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f20267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f20268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f20269c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f20270d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f20263e = new a(0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c f20266h = new c();

    /* JADX WARN: Type inference failed for: r0v1, types: [si.b] */
    /* JADX WARN: Type inference failed for: r0v2, types: [si.b] */
    static {
        final int i7 = 0;
        f20264f = new f() { // from class: si.b
            @Override // qi.a
            public final void a(Object obj, Object obj2) {
                switch (i7) {
                    case 0:
                        ((g) obj2).c((String) obj);
                        break;
                    default:
                        ((g) obj2).d(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
        final int i10 = 1;
        f20265g = new f() { // from class: si.b
            @Override // qi.a
            public final void a(Object obj, Object obj2) {
                switch (i10) {
                    case 0:
                        ((g) obj2).c((String) obj);
                        break;
                    default:
                        ((g) obj2).d(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
    }

    public d() {
        HashMap map = new HashMap();
        this.f20267a = map;
        HashMap map2 = new HashMap();
        this.f20268b = map2;
        this.f20269c = f20263e;
        this.f20270d = false;
        map2.put(String.class, f20264f);
        map.remove(String.class);
        map2.put(Boolean.class, f20265g);
        map.remove(Boolean.class);
        map2.put(Date.class, f20266h);
        map.remove(Date.class);
    }

    public final ri.a a(Class cls, qi.d dVar) {
        this.f20267a.put(cls, dVar);
        this.f20268b.remove(cls);
        return this;
    }
}
