package mi;

import a5.l0;
import gc.s0;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f15800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f15801c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f15802d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f15803e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e f15804f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Set f15805g;

    public b(String str, Set set, Set set2, int i7, int i10, e eVar, Set set3) {
        this.f15799a = str;
        this.f15800b = Collections.unmodifiableSet(set);
        this.f15801c = Collections.unmodifiableSet(set2);
        this.f15802d = i7;
        this.f15803e = i10;
        this.f15804f = eVar;
        this.f15805g = Collections.unmodifiableSet(set3);
    }

    public static s0 a(q qVar) {
        q[] qVarArr = new q[0];
        s0 s0Var = new s0();
        s0Var.f9839a = null;
        HashSet hashSet = new HashSet();
        s0Var.f9842d = hashSet;
        s0Var.f9843e = new HashSet();
        s0Var.f9840b = 0;
        s0Var.f9841c = 0;
        s0Var.f9845g = new HashSet();
        hashSet.add(qVar);
        for (q qVar2 : qVarArr) {
            l0.l(qVar2, "Null interface");
        }
        Collections.addAll((HashSet) s0Var.f9842d, qVarArr);
        return s0Var;
    }

    public static b b(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(q.a(cls));
        for (Class cls2 : clsArr) {
            l0.l(cls2, "Null interface");
            hashSet.add(q.a(cls2));
        }
        return new b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new a(0, obj), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f15800b.toArray()) + ">{" + this.f15802d + ", type=" + this.f15803e + ", deps=" + Arrays.toString(this.f15801c.toArray()) + "}";
    }
}
