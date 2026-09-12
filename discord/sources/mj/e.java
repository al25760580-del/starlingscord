package mj;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f15853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f15854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f15855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f15856d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f15857e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f15858f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f15859g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f15860h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f15861i;

    public e(float f2, float f7, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        this.f15853a = f2;
        this.f15854b = f11;
        this.f15855c = f14;
        this.f15856d = f7;
        this.f15857e = f12;
        this.f15858f = f15;
        this.f15859g = f10;
        this.f15860h = f13;
        this.f15861i = f16;
    }

    public static e a(float f2, float f7, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21, float f22, float f23) {
        e eVarB = b(f2, f7, f10, f11, f12, f13, f14, f15);
        float f24 = eVarB.f15857e;
        float f25 = eVarB.f15861i;
        float f26 = eVarB.f15858f;
        float f27 = eVarB.f15860h;
        float f28 = (f24 * f25) - (f26 * f27);
        float f29 = eVarB.f15859g;
        float f30 = eVarB.f15856d;
        float f31 = (f26 * f29) - (f30 * f25);
        float f32 = (f30 * f27) - (f24 * f29);
        float f33 = eVarB.f15855c;
        float f34 = eVarB.f15854b;
        float f35 = (f33 * f27) - (f34 * f25);
        float f36 = eVarB.f15853a;
        float f37 = (f25 * f36) - (f33 * f29);
        float f38 = (f29 * f34) - (f27 * f36);
        float f39 = (f34 * f26) - (f33 * f24);
        float f40 = (f33 * f30) - (f26 * f36);
        float f41 = (f36 * f24) - (f34 * f30);
        e eVarB2 = b(f16, f17, f18, f19, f20, f21, f22, f23);
        float f42 = eVarB2.f15853a;
        float f43 = eVarB2.f15856d;
        float f44 = eVarB2.f15859g;
        float f45 = (f44 * f39) + (f43 * f35) + (f42 * f28);
        float f46 = (f44 * f40) + (f43 * f37) + (f42 * f31);
        float f47 = f44 * f41;
        float f48 = f47 + (f43 * f38) + (f42 * f32);
        float f49 = eVarB2.f15854b;
        float f50 = eVarB2.f15857e;
        float f51 = eVarB2.f15860h;
        float f52 = (f51 * f39) + (f50 * f35) + (f49 * f28);
        float f53 = (f51 * f40) + (f50 * f37) + (f49 * f31);
        float f54 = f51 * f41;
        float f55 = f54 + (f50 * f38) + (f49 * f32);
        float f56 = eVarB2.f15855c;
        float f57 = eVarB2.f15858f;
        float f58 = f35 * f57;
        float f59 = eVarB2.f15861i;
        return new e(f45, f46, f48, f52, f53, f55, (f39 * f59) + f58 + (f28 * f56), (f40 * f59) + (f37 * f57) + (f31 * f56), (f59 * f41) + (f57 * f38) + (f56 * f32));
    }

    public static e b(float f2, float f7, float f10, float f11, float f12, float f13, float f14, float f15) {
        float f16 = ((f2 - f10) + f12) - f14;
        float f17 = ((f7 - f11) + f13) - f15;
        if (f16 == 0.0f && f17 == 0.0f) {
            return new e(f10 - f2, f12 - f10, f2, f11 - f7, f13 - f11, f7, 0.0f, 0.0f, 1.0f);
        }
        float f18 = f10 - f12;
        float f19 = f14 - f12;
        float f20 = f11 - f13;
        float f21 = f15 - f13;
        float f22 = (f18 * f21) - (f19 * f20);
        float f23 = ((f21 * f16) - (f19 * f17)) / f22;
        float f24 = ((f18 * f17) - (f16 * f20)) / f22;
        return new e((f23 * f10) + (f10 - f2), (f24 * f14) + (f14 - f2), f2, (f23 * f11) + (f11 - f7), (f24 * f15) + (f15 - f7), f7, f23, f24, 1.0f);
    }
}
