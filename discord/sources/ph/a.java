package ph;

import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends ye.e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int i7, int i10) {
        String str;
        super(new Status(i7, String.format(Locale.getDefault(), "Age Signals Error: %d", Integer.valueOf(i7)), null, null));
        switch (i10) {
            case 1:
                Locale locale = Locale.getDefault();
                Integer numValueOf = Integer.valueOf(i7);
                HashMap map = uh.a.f21133a;
                Integer numValueOf2 = Integer.valueOf(i7);
                if (map.containsKey(numValueOf2)) {
                    str = ((String) map.get(numValueOf2)) + " (https://developer.android.com/reference/com/google/android/play/core/assetpacks/model/AssetPackErrorCode.html#" + ((String) uh.a.f21134b.get(numValueOf2)) + ")";
                } else {
                    str = "";
                }
                super(new Status(i7, String.format(locale, "Asset Pack Download Error(%d): %s", numValueOf, str), null, null));
                if (i7 == 0) {
                    throw new IllegalArgumentException("errorCode should not be 0.");
                }
                return;
            default:
                if (i7 == 0) {
                    throw new IllegalArgumentException("errorCode should not be 0.");
                }
                return;
        }
    }
}
