package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class e0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p f1839b = new p(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f1840a;

    public e0(i iVar) {
        u.a(iVar, "output");
        this.f1840a = iVar;
        iVar.f1871c = this;
    }

    public void a(int i7, e eVar) {
        ((i) this.f1840a).G(i7, eVar);
    }

    public void b(int i7, Object obj, v0 v0Var) {
        i iVar = (i) this.f1840a;
        iVar.R(i7, 3);
        v0Var.d((a) obj, iVar.f1871c);
        iVar.R(i7, 4);
    }

    public e0() {
        k0 k0Var;
        try {
            k0Var = (k0) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            k0Var = f1839b;
        }
        k0[] k0VarArr = {p.f1922b, k0Var};
        d0 d0Var = new d0();
        d0Var.f1834a = k0VarArr;
        Charset charset = u.f1936a;
        this.f1840a = d0Var;
    }
}
