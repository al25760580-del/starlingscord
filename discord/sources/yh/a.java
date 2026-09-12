package yh;

import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends ye.e {
    /* JADX WARN: Illegal instructions before constructor call */
    public a(int i7) {
        String str;
        Locale locale = Locale.getDefault();
        Integer numValueOf = Integer.valueOf(i7);
        HashMap map = ai.a.f610a;
        Integer numValueOf2 = Integer.valueOf(i7);
        if (map.containsKey(numValueOf2)) {
            str = ((String) map.get(numValueOf2)) + " (https://developer.android.com/reference/com/google/android/play/core/review/model/ReviewErrorCode.html#" + ((String) ai.a.f611b.get(numValueOf2)) + ")";
        } else {
            str = "";
        }
        super(new Status(i7, String.format(locale, "Review Error(%d): %s", numValueOf, str), null, null));
    }
}
