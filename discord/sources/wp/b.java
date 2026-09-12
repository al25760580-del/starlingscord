package wp;

import java.util.ArrayList;
import kotlin.collections.j0;
import kotlin.jvm.internal.Intrinsics;
import vo.e0;
import vo.r0;
import yo.b0;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f22410b = new b(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f22411c = new b(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f22412d = new b(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22413a;

    public /* synthetic */ b(int i7) {
        this.f22413a = i7;
    }

    public static String b(vo.i iVar) {
        String strF;
        up.e name = iVar.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        String strE = com.facebook.imagepipeline.nativecode.c.E(name);
        if (iVar instanceof r0) {
            return strE;
        }
        vo.l lVarG = iVar.g();
        Intrinsics.checkNotNullExpressionValue(lVarG, "getContainingDeclaration(...)");
        if (lVarG instanceof vo.f) {
            strF = b((vo.i) lVarG);
        } else if (lVarG instanceof e0) {
            up.d dVar = ((b0) ((e0) lVarG)).f23420x.f21262a;
            Intrinsics.checkNotNullParameter(dVar, "<this>");
            dVar.getClass();
            strF = com.facebook.imagepipeline.nativecode.c.F(up.d.e(dVar));
        } else {
            strF = null;
        }
        if (strF == null || Intrinsics.areEqual(strF, "")) {
            return strE;
        }
        return strF + '.' + strE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, vo.i, vo.l] */
    /* JADX WARN: Type inference failed for: r2v6, types: [vo.l] */
    /* JADX WARN: Type inference failed for: r2v7, types: [vo.l] */
    @Override // wp.c
    public final String a(vo.i classifier, h renderer) {
        switch (this.f22413a) {
            case 0:
                Intrinsics.checkNotNullParameter(classifier, "classifier");
                Intrinsics.checkNotNullParameter(renderer, "renderer");
                if (classifier instanceof r0) {
                    up.e name = ((r0) classifier).getName();
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    return renderer.O(name, false);
                }
                up.d dVarG = xp.e.g(classifier);
                Intrinsics.checkNotNullExpressionValue(dVarG, "getFqName(...)");
                return renderer.G(dVarG);
            case 1:
                Intrinsics.checkNotNullParameter(classifier, "classifier");
                Intrinsics.checkNotNullParameter(renderer, "renderer");
                if (classifier instanceof r0) {
                    up.e name2 = ((r0) classifier).getName();
                    Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                    return renderer.O(name2, false);
                }
                ArrayList arrayList = new ArrayList();
                do {
                    arrayList.add(classifier.getName());
                    classifier = classifier.g();
                } while (classifier instanceof vo.f);
                return com.facebook.imagepipeline.nativecode.c.F(j0.y(arrayList));
            default:
                Intrinsics.checkNotNullParameter(classifier, "classifier");
                Intrinsics.checkNotNullParameter(renderer, "renderer");
                return b(classifier);
        }
    }
}
