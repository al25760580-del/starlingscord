package kh;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends com.facebook.imagepipeline.nativecode.b {
    @Override // com.facebook.imagepipeline.nativecode.b
    public final void n(v vVar, float f2, float f7) {
        float f10 = f7 * f2;
        vVar.d(f10, 180.0f, 90.0f);
        double d6 = f10;
        vVar.c((float) (Math.sin(Math.toRadians(90.0f)) * d6), (float) (Math.sin(Math.toRadians(0.0f)) * d6));
    }
}
