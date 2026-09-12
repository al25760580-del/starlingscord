package d0;

import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f7535e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final g f7536f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f7537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f7538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f7539c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float[] f7540d;

    static {
        p source = d.f7528c;
        Intrinsics.checkNotNullParameter(source, "source");
        f7535e = new e(source, source, 1);
        k kVar = d.f7530e;
        new g(source, kVar, 0);
        f7536f = new g(kVar, source, 0);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0080  */
    /* JADX WARN: Illegal instructions before constructor call */
    public g(c source, c destination, int i7) {
        float[] fArr;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(destination, "destination");
        long j = source.f7524b;
        long j5 = b.f7518a;
        c cVarA = b.a(j, j5) ? i.a(source) : source;
        c cVarA2 = b.a(destination.f7524b, j5) ? i.a(destination) : destination;
        if (i7 == 3) {
            boolean zA = b.a(source.f7524b, j5);
            boolean zA2 = b.a(destination.f7524b, j5);
            if (!(zA && zA2) && (zA || zA2)) {
                c cVar = zA ? source : destination;
                Intrinsics.checkNotNull(cVar, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
                r rVar = ((p) cVar).f7560d;
                float[] fArrA = i.f7545e;
                float[] fArrA2 = zA ? rVar.a() : fArrA;
                fArrA = zA2 ? rVar.a() : fArrA;
                fArr = new float[]{fArrA2[0] / fArrA[0], fArrA2[1] / fArrA[1], fArrA2[2] / fArrA[2]};
            } else {
                fArr = null;
            }
        } else {
            fArr = null;
        }
        this(source, destination, cVarA, cVarA2, fArr);
    }

    public long a(float f2, float f7, float f10, float f11) {
        c cVar = this.f7538b;
        long jD = cVar.d(f2, f7, f10);
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jD >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jD & 4294967295L));
        float fE = cVar.e(f2, f7, f10);
        float[] fArr = this.f7540d;
        if (fArr != null) {
            fIntBitsToFloat *= fArr[0];
            fIntBitsToFloat2 *= fArr[1];
            fE *= fArr[2];
        }
        float f12 = fIntBitsToFloat2;
        float f13 = fIntBitsToFloat;
        return this.f7539c.f(f13, f12, fE, f11, this.f7537a);
    }

    public g(c source, c destination, c transformSource, c transformDestination, float[] fArr) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transformSource, "transformSource");
        Intrinsics.checkNotNullParameter(transformDestination, "transformDestination");
        this.f7537a = destination;
        this.f7538b = transformSource;
        this.f7539c = transformDestination;
        this.f7540d = fArr;
    }
}
