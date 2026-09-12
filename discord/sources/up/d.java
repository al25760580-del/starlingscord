package up;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f21264e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient c f21266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient d f21267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient e f21268d;

    static {
        e eVarG = e.g("<root>");
        Intrinsics.checkNotNullExpressionValue(eVarG, "special(...)");
        f21264e = eVarG;
        Intrinsics.checkNotNullExpressionValue(Pattern.compile("\\."), "compile(...)");
    }

    public d(String fqName, c safe) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(safe, "safe");
        this.f21265a = fqName;
        this.f21266b = safe;
    }

    public static final List e(d dVar) {
        if (dVar.c()) {
            return new ArrayList();
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
        List listE = e(dVar2);
        listE.add(dVar.f());
        return listE;
    }

    public final d a(e name) {
        String strB;
        Intrinsics.checkNotNullParameter(name, "name");
        if (c()) {
            strB = name.b();
        } else {
            strB = this.f21265a + '.' + name.b();
        }
        Intrinsics.checkNotNull(strB);
        return new d(strB, this, name);
    }

    public final void b() {
        String str = this.f21265a;
        int length = str.length() - 1;
        boolean z5 = false;
        while (true) {
            if (length < 0) {
                length = -1;
                break;
            }
            char cCharAt = str.charAt(length);
            if (cCharAt == '.' && !z5) {
                break;
            }
            if (cCharAt == '`') {
                z5 = !z5;
            } else if (cCharAt == '\\') {
                length--;
            }
            length--;
        }
        if (length < 0) {
            this.f21268d = e.d(str);
            this.f21267c = c.f21261c.f21262a;
            return;
        }
        String strSubstring = str.substring(length + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        this.f21268d = e.d(strSubstring);
        String strSubstring2 = str.substring(0, length);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        this.f21267c = new d(strSubstring2);
    }

    public final boolean c() {
        return this.f21265a.length() == 0;
    }

    public final boolean d() {
        return this.f21266b != null || StringsKt.I(this.f21265a, '<', 0, 6) < 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            return Intrinsics.areEqual(this.f21265a, ((d) obj).f21265a);
        }
        return false;
    }

    public final e f() {
        e eVar = this.f21268d;
        if (eVar != null) {
            return eVar;
        }
        if (c()) {
            throw new IllegalStateException("root");
        }
        b();
        e eVar2 = this.f21268d;
        Intrinsics.checkNotNull(eVar2);
        return eVar2;
    }

    public final c g() {
        c cVar = this.f21266b;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c(this);
        this.f21266b = cVar2;
        return cVar2;
    }

    public final int hashCode() {
        return this.f21265a.hashCode();
    }

    public final String toString() {
        if (!c()) {
            return this.f21265a;
        }
        String strB = f21264e.b();
        Intrinsics.checkNotNullExpressionValue(strB, "asString(...)");
        return strB;
    }

    public d(String fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        this.f21265a = fqName;
    }

    public d(String str, d dVar, e eVar) {
        this.f21265a = str;
        this.f21267c = dVar;
        this.f21268d = eVar;
    }
}
