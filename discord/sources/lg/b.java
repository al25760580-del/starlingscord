package lg;

import android.animation.TypeEvaluator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b implements TypeEvaluator {
    public static Integer a(float f2, Integer num, Integer num2) {
        int iIntValue = num.intValue();
        float f7 = ((iIntValue >> 24) & 255) / 255.0f;
        int iIntValue2 = num2.intValue();
        float f10 = ((iIntValue2 >> 24) & 255) / 255.0f;
        float fPow = (float) Math.pow(((iIntValue >> 16) & 255) / 255.0f, 2.2d);
        float fPow2 = (float) Math.pow(((iIntValue >> 8) & 255) / 255.0f, 2.2d);
        float fPow3 = (float) Math.pow((iIntValue & 255) / 255.0f, 2.2d);
        float fPow4 = (float) Math.pow(((iIntValue2 >> 16) & 255) / 255.0f, 2.2d);
        float fPow5 = (float) Math.pow(((iIntValue2 >> 8) & 255) / 255.0f, 2.2d);
        float fPow6 = (float) Math.pow((iIntValue2 & 255) / 255.0f, 2.2d);
        float fC = kk.b.c(f10, f7, f2, f7);
        float fC2 = kk.b.c(fPow4, fPow, f2, fPow);
        float fC3 = kk.b.c(fPow5, fPow2, f2, fPow2);
        float fC4 = kk.b.c(fPow6, fPow3, f2, fPow3);
        float fPow7 = ((float) Math.pow(fC2, 0.45454545454545453d)) * 255.0f;
        float fPow8 = ((float) Math.pow(fC3, 0.45454545454545453d)) * 255.0f;
        return Integer.valueOf(Math.round(((float) Math.pow(fC4, 0.45454545454545453d)) * 255.0f) | (Math.round(fPow7) << 16) | (Math.round(fC * 255.0f) << 24) | (Math.round(fPow8) << 8));
    }
}
