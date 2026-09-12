package wh;

import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends ye.e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Throwable f22265e;

    /* JADX WARN: Code duplicated, block: B:8:0x003f  */
    /* JADX WARN: Illegal instructions before constructor call */
    public b(int i7, Exception exc) {
        String str;
        Locale locale = Locale.ROOT;
        HashMap map = xh.b.f22950a;
        Integer numValueOf = Integer.valueOf(i7);
        if (map.containsKey(numValueOf)) {
            HashMap map2 = xh.b.f22951b;
            if (map2.containsKey(numValueOf)) {
                str = ((String) map.get(numValueOf)) + " (https://developer.android.com/google/play/integrity/reference/com/google/android/play/core/integrity/model/StandardIntegrityErrorCode.html#" + ((String) map2.get(numValueOf)) + ")";
            } else {
                str = "";
            }
        } else {
            str = "";
        }
        super(new Status(i7, "Standard Integrity API error (" + i7 + "): " + str + ".", null, null));
        if (i7 == 0) {
            throw new IllegalArgumentException("ErrorCode should not be 0.");
        }
        this.f22265e = exc;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        return this.f22265e;
    }
}
