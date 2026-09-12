package up;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.x;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f21258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f21259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f21260c;

    public b(c packageFqName, c relativeClassName, boolean z5) {
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        Intrinsics.checkNotNullParameter(relativeClassName, "relativeClassName");
        this.f21258a = packageFqName;
        this.f21259b = relativeClassName;
        this.f21260c = z5;
        relativeClassName.f21262a.c();
    }

    public static final String c(c cVar) {
        String str = cVar.f21262a.f21265a;
        return StringsKt.E(str, '/') ? kk.b.g('`', "`", str) : str;
    }

    public final c a() {
        c cVar = this.f21258a;
        boolean zC = cVar.f21262a.c();
        c cVar2 = this.f21259b;
        if (zC) {
            return cVar2;
        }
        return new c(cVar.f21262a.f21265a + '.' + cVar2.f21262a.f21265a);
    }

    public final String b() {
        c cVar = this.f21258a;
        boolean zC = cVar.f21262a.c();
        c cVar2 = this.f21259b;
        if (zC) {
            return c(cVar2);
        }
        return x.m(cVar.f21262a.f21265a, '.', '/') + "/" + c(cVar2);
    }

    public final b d(e name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new b(this.f21258a, this.f21259b.a(name), this.f21260c);
    }

    public final b e() {
        c cVarB = this.f21259b.b();
        if (cVarB.f21262a.c()) {
            return null;
        }
        return new b(this.f21258a, cVarB, this.f21260c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.areEqual(this.f21258a, bVar.f21258a) && Intrinsics.areEqual(this.f21259b, bVar.f21259b) && this.f21260c == bVar.f21260c;
    }

    public final e f() {
        return this.f21259b.f21262a.f();
    }

    public final boolean g() {
        return !this.f21259b.b().f21262a.c();
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f21260c) + ((this.f21259b.hashCode() + (this.f21258a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        if (!this.f21258a.f21262a.c()) {
            return b();
        }
        return "/" + b();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(c packageFqName, e topLevelName) {
        this(packageFqName, zs.a.Y(topLevelName), false);
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        Intrinsics.checkNotNullParameter(topLevelName, "topLevelName");
        c cVar = c.f21261c;
    }
}
