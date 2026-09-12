package ep;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class u extends FunctionReferenceImpl implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final u f8594d = new u(1, s.class, "getDefaultReportLevelForAnnotation", "getDefaultReportLevelForAnnotation(Lorg/jetbrains/kotlin/name/FqName;)Lorg/jetbrains/kotlin/load/java/ReportLevel;", 1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        up.c fqName = (up.c) obj;
        Intrinsics.checkNotNullParameter(fqName, "p0");
        up.c cVar = s.f8586a;
        Intrinsics.checkNotNullParameter(fqName, "annotationFqName");
        d0.f8530h.getClass();
        e4.r configuredReportLevels = c0.f8522b;
        rn.k other = new rn.k(1, 7, 20);
        Intrinsics.checkNotNullParameter(fqName, "annotation");
        Intrinsics.checkNotNullParameter(configuredReportLevels, "configuredReportLevels");
        Intrinsics.checkNotNullParameter(other, "configuredKotlinVersion");
        configuredReportLevels.getClass();
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        e0 e0Var = (e0) ((kq.j) configuredReportLevels.f8035i).invoke(fqName);
        if (e0Var != null) {
            return e0Var;
        }
        e4.r rVar = s.f8588c;
        rVar.getClass();
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        t tVar = (t) ((kq.j) rVar.f8035i).invoke(fqName);
        if (tVar == null) {
            return e0.IGNORE;
        }
        rn.k kVar = tVar.f8592b;
        if (kVar != null) {
            Intrinsics.checkNotNullParameter(other, "other");
            if (kVar.f19482v - other.f19482v <= 0) {
                return tVar.f8593c;
            }
        }
        return tVar.f8591a;
    }
}
