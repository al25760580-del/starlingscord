package ep;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class v {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final v f8595d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f8596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function1 f8597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f8598c;

    /* JADX WARN: Code duplicated, block: B:7:0x0020  */
    static {
        e0 globalReportLevel;
        up.c cVar = s.f8586a;
        rn.k other = rn.k.f19478x;
        Intrinsics.checkNotNullParameter(other, "configuredKotlinVersion");
        t tVar = s.f8589d;
        rn.k kVar = tVar.f8592b;
        if (kVar != null) {
            Intrinsics.checkNotNullParameter(other, "other");
            if (kVar.f19482v - other.f19482v <= 0) {
                globalReportLevel = tVar.f8593c;
            } else {
                globalReportLevel = tVar.f8591a;
            }
        } else {
            globalReportLevel = tVar.f8591a;
        }
        Intrinsics.checkNotNullParameter(globalReportLevel, "globalReportLevel");
        f8595d = new v(new y(globalReportLevel, globalReportLevel == e0.WARN ? null : globalReportLevel), u.f8594d);
    }

    public v(y jsr305, Function1 getReportLevelForAnnotation) {
        Intrinsics.checkNotNullParameter(jsr305, "jsr305");
        Intrinsics.checkNotNullParameter(getReportLevelForAnnotation, "getReportLevelForAnnotation");
        this.f8596a = jsr305;
        this.f8597b = getReportLevelForAnnotation;
        this.f8598c = jsr305.f8605d || getReportLevelForAnnotation.invoke(s.f8586a) == e0.IGNORE;
    }

    public final String toString() {
        return "JavaTypeEnhancementState(jsr305=" + this.f8596a + ", getReportLevelForAnnotation=" + this.f8597b + ')';
    }
}
