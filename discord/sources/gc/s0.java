package gc;

import android.net.Uri;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f9839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f9842d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Serializable f9843e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f9844f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f9845g;

    public s0(byte[] bArr, String str, ArrayList arrayList, String str2) {
        this(bArr, str, arrayList, str2, -1, -1);
    }

    public void a(mi.i iVar) {
        if (((HashSet) this.f9842d).contains(iVar.f15820a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        ((HashSet) this.f9843e).add(iVar);
    }

    public mi.b b() {
        if (((mi.e) this.f9844f) != null) {
            return new mi.b(this.f9839a, new HashSet((HashSet) this.f9842d), new HashSet((HashSet) this.f9843e), this.f9840b, this.f9841c, (mi.e) this.f9844f, (HashSet) this.f9845g);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    public s0(byte[] bArr, String str, List list, String str2, int i7, int i10) {
        this.f9842d = bArr;
        this.f9839a = str;
        this.f9844f = list;
        this.f9843e = str2;
        this.f9840b = i10;
        this.f9841c = i7;
    }

    public s0(Class cls, Class[] clsArr) {
        this.f9839a = null;
        HashSet hashSet = new HashSet();
        this.f9842d = hashSet;
        this.f9843e = new HashSet();
        this.f9840b = 0;
        this.f9841c = 0;
        this.f9845g = new HashSet();
        hashSet.add(mi.q.a(cls));
        for (Class cls2 : clsArr) {
            a5.l0.l(cls2, "Null interface");
            ((HashSet) this.f9842d).add(mi.q.a(cls2));
        }
    }

    public s0(Uri uri) {
        this.f9842d = uri;
    }
}
