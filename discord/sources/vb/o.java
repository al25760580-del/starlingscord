package vb;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements sb.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f21543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f21544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f21545c;

    public o(Set set, i iVar, p pVar) {
        this.f21543a = set;
        this.f21544b = iVar;
        this.f21545c = pVar;
    }

    public final o9.c a(String str, sb.c cVar, sb.e eVar) {
        Set set = this.f21543a;
        if (set.contains(cVar)) {
            return new o9.c(this.f21544b, str, cVar, eVar, this.f21545c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, set));
    }
}
