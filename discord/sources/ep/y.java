package ep;

import kotlin.collections.o0;
import kotlin.collections.w0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0 f8602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e0 f8603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o0 f8604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f8605d;

    public y(e0 globalLevel, e0 e0Var) {
        boolean z5;
        o0 userDefinedLevelForSpecificAnnotation = w0.d();
        Intrinsics.checkNotNullParameter(globalLevel, "globalLevel");
        Intrinsics.checkNotNullParameter(userDefinedLevelForSpecificAnnotation, "userDefinedLevelForSpecificAnnotation");
        this.f8602a = globalLevel;
        this.f8603b = e0Var;
        this.f8604c = userDefinedLevelForSpecificAnnotation;
        rn.l.b(new x(0, this));
        e0 e0Var2 = e0.IGNORE;
        if (globalLevel == e0Var2 && e0Var == e0Var2) {
            userDefinedLevelForSpecificAnnotation.getClass();
            z5 = true;
        } else {
            z5 = false;
        }
        this.f8605d = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f8602a == yVar.f8602a && this.f8603b == yVar.f8603b && Intrinsics.areEqual(this.f8604c, yVar.f8604c);
    }

    public final int hashCode() {
        int iHashCode = this.f8602a.hashCode() * 31;
        e0 e0Var = this.f8603b;
        int iHashCode2 = (iHashCode + (e0Var == null ? 0 : e0Var.hashCode())) * 31;
        this.f8604c.getClass();
        return iHashCode2;
    }

    public final String toString() {
        return "Jsr305Settings(globalLevel=" + this.f8602a + ", migrationLevel=" + this.f8603b + ", userDefinedLevelForSpecificAnnotation=" + this.f8604c + ')';
    }
}
