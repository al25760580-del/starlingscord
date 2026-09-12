package d0;

import com.facebook.react.devsupport.StackTraceHelper;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float[] f7526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float[] f7527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p f7528c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p f7529d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final k f7530e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c[] f7531f;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        f7526a = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        f7527b = fArr2;
        q qVar = new q(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        q qVar2 = new q(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        r rVar = i.f7544d;
        p pVar = new p("sRGB IEC61966-2.1", fArr, rVar, qVar, 0);
        f7528c = pVar;
        p pVar2 = new p("sRGB IEC61966-2.1 (Linear)", fArr, rVar, 1.0d, 0.0f, 1.0f, 1);
        p pVar3 = new p("scRGB-nl IEC 61966-2-2:2003", fArr, rVar, null, new com.google.firebase.messaging.n(4), new com.google.firebase.messaging.n(5), -0.799f, 2.399f, qVar, 2);
        p pVar4 = new p("scRGB IEC 61966-2-2:2003", fArr, rVar, 1.0d, -0.5f, 7.499f, 3);
        p pVar5 = new p("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, rVar, new q(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 4);
        p pVar6 = new p("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, rVar, new q(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), 5);
        p pVar7 = new p("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new r(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        p pVar8 = new p("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, rVar, qVar, 7);
        p pVar9 = new p("NTSC (1953)", fArr2, i.f7541a, new q(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 8);
        p pVar10 = new p("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, rVar, new q(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 9);
        p pVar11 = new p("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, rVar, 2.2d, 0.0f, 1.0f, 10);
        p pVar12 = new p("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, i.f7542b, new q(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d), 11);
        r rVar2 = i.f7543c;
        p pVar13 = new p("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, rVar2, 1.0d, -65504.0f, 65504.0f, 12);
        p pVar14 = new p("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, rVar2, 1.0d, -65504.0f, 65504.0f, 13);
        Intrinsics.checkNotNullParameter("Generic XYZ", StackTraceHelper.NAME_KEY);
        j jVar = new j(b.f7519b, "Generic XYZ", 14, 1);
        Intrinsics.checkNotNullParameter("Generic L*a*b*", StackTraceHelper.NAME_KEY);
        long j = b.f7520c;
        j jVar2 = new j(j, "Generic L*a*b*", 15, 0);
        p pVar15 = new p("None", fArr, rVar, qVar2, 16);
        f7529d = pVar15;
        Intrinsics.checkNotNullParameter("Oklab", StackTraceHelper.NAME_KEY);
        k kVar = new k("Oklab", j, 17);
        f7530e = kVar;
        f7531f = new c[]{pVar, pVar2, pVar3, pVar4, pVar5, pVar6, pVar7, pVar8, pVar9, pVar10, pVar11, pVar12, pVar13, pVar14, jVar, jVar2, pVar15, kVar};
    }
}
