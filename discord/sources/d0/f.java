package d0;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class f extends g {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p f7532g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p f7533h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float[] f7534i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(p mSource, p mDestination) {
        float[] fArrG;
        super(mSource, mDestination, mSource, mDestination, null);
        Intrinsics.checkNotNullParameter(mSource, "mSource");
        Intrinsics.checkNotNullParameter(mDestination, "mDestination");
        this.f7532g = mSource;
        this.f7533h = mDestination;
        float[] fArr = a.f7516b.f7517a;
        r rVar = mSource.f7560d;
        float[] fArrG2 = mSource.f7565i;
        r rVar2 = mDestination.f7560d;
        float[] fArrF = mDestination.j;
        if (i.d(rVar, rVar2)) {
            fArrG = i.g(fArrF, fArrG2);
        } else {
            float[] fArrA = rVar.a();
            float[] fArrA2 = rVar2.a();
            r rVar3 = i.f7542b;
            boolean zD = i.d(rVar, rVar3);
            float[] fArr2 = i.f7545e;
            if (!zD) {
                float[] fArrCopyOf = Arrays.copyOf(fArr2, 3);
                Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "copyOf(this, size)");
                fArrG2 = i.g(i.c(fArr, fArrA, fArrCopyOf), fArrG2);
            }
            if (!i.d(rVar2, rVar3)) {
                float[] fArrCopyOf2 = Arrays.copyOf(fArr2, 3);
                Intrinsics.checkNotNullExpressionValue(fArrCopyOf2, "copyOf(this, size)");
                fArrF = i.f(i.g(i.c(fArr, fArrA2, fArrCopyOf2), mDestination.f7565i));
            }
            fArrG = i.g(fArrF, fArrG2);
        }
        this.f7534i = fArrG;
    }

    @Override // d0.g
    public final long a(float f2, float f7, float f10, float f11) {
        p pVar = this.f7532g;
        float fInvoke = (float) pVar.f7568n.invoke(f2);
        l lVar = pVar.f7568n;
        float fInvoke2 = (float) lVar.invoke(f7);
        float fInvoke3 = (float) lVar.invoke(f10);
        float[] fArr = this.f7534i;
        float fI = i.i(fArr, fInvoke, fInvoke2, fInvoke3);
        float fJ = i.j(fArr, fInvoke, fInvoke2, fInvoke3);
        float fK = i.k(fArr, fInvoke, fInvoke2, fInvoke3);
        p pVar2 = this.f7533h;
        float fInvoke4 = (float) pVar2.f7566l.invoke(fI);
        l lVar2 = pVar2.f7566l;
        return w3.q.a(fInvoke4, (float) lVar2.invoke(fJ), (float) lVar2.invoke(fK), f11, pVar2);
    }
}
