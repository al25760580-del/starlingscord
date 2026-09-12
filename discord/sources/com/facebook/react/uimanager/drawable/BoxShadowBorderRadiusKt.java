package com.facebook.react.uimanager.drawable;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000¨\u0006\u0004"}, d2 = {"adjustRadiusForSpread", "", "radius", "spread", "ReactAndroid_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class BoxShadowBorderRadiusKt {
    public static final float adjustRadiusForSpread(float f2, float f7) {
        float fPow;
        if (f2 < Math.abs(f7)) {
            float f10 = 1;
            fPow = f10 + ((float) Math.pow((f2 / Math.abs(f7)) - f10, 3));
        } else {
            fPow = 1.0f;
        }
        float f11 = (f7 * fPow) + f2;
        if (f11 < 0.0f) {
            return 0.0f;
        }
        return f11;
    }
}
