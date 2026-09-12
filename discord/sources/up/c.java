package up;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.x;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f21261c = new c("");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f21262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient c f21263b;

    public c(String fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        this.f21262a = new d(fqName, this);
    }

    public final c a(e name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new c(this.f21262a.a(name), this);
    }

    public final c b() {
        c cVar = this.f21263b;
        if (cVar != null) {
            return cVar;
        }
        d dVar = this.f21262a;
        if (dVar.c()) {
            throw new IllegalStateException("root");
        }
        d dVar2 = dVar.f21267c;
        if (dVar2 == null) {
            if (dVar.c()) {
                throw new IllegalStateException("root");
            }
            dVar.b();
            dVar2 = dVar.f21267c;
            Intrinsics.checkNotNull(dVar2);
        }
        c cVar2 = new c(dVar2);
        this.f21263b = cVar2;
        return cVar2;
    }

    public final boolean c(e segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        d dVar = this.f21262a;
        dVar.getClass();
        String str = dVar.f21265a;
        Intrinsics.checkNotNullParameter(segment, "segment");
        if (!dVar.c()) {
            int I = StringsKt.I(str, '.', 0, 6);
            if (I == -1) {
                I = str.length();
            }
            int i7 = I;
            String strB = segment.b();
            Intrinsics.checkNotNullExpressionValue(strB, "asString(...)");
            if (i7 == strB.length() && x.j(dVar.f21265a, false, 0, 0, strB, i7)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return Intrinsics.areEqual(this.f21262a, ((c) obj).f21262a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f21262a.f21265a.hashCode();
    }

    public final String toString() {
        return this.f21262a.toString();
    }

    public c(d fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        this.f21262a = fqName;
    }

    public c(d dVar, c cVar) {
        this.f21262a = dVar;
        this.f21263b = cVar;
    }
}
