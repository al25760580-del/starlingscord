package g1;

import android.os.Build;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.collections.w0;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9457a;

    public a() {
        int i7;
        HashMap mapF = w0.f(new Pair("robolectric-BrandX/ProductX/Device30:11", 30), new Pair("robolectric-BrandX/ProductX/Device31:12", 31), new Pair("OPPO/CPH2025EEA/OP4BA2L1:12", 30), new Pair("OPPO/CPH2207EEA/OP4F0BL1:12", 30), new Pair("OPPO/PENM00/OP4EC1:11", 30), new Pair("OnePlus/OnePlus7TTMO/OnePlus7TTMO:11", 30), new Pair("OnePlus/OnePlus8_BETA/OnePlus8:11", 30), new Pair("Xiaomi/umi_global/umi:11", 30), new Pair("realme/RMX2085/RMX2085L1:11", 30), new Pair("samsung/c1qsqw/c1q:12", 30), new Pair("samsung/o1quew/o1q:12", 30), new Pair("samsung/r0quew/r0q:12", 30), new Pair("samsung/r0sxxx/r0s:12", 30));
        int i10 = Build.VERSION.SDK_INT >= 31 ? Build.VERSION.MEDIA_PERFORMANCE_CLASS : 0;
        if (i10 >= 30) {
            i7 = i10;
        } else {
            Integer num = (Integer) mapF.get(Build.BRAND + '/' + Build.PRODUCT + '/' + Build.DEVICE + ':' + Build.VERSION.RELEASE);
            int iIntValue = (num == null ? 0 : num).intValue();
            i7 = iIntValue >= 30 ? iIntValue : 0;
        }
        this.f9457a = i7;
    }
}
