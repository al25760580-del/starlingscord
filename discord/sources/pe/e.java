package pe;

import android.text.TextUtils;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e {
    public static String a(int i7, Object obj) {
        if (i7 > 10) {
            return "ERROR: Recursive toString calls";
        }
        if (obj == null) {
            return "";
        }
        if (obj instanceof String) {
            return TextUtils.isEmpty((String) obj) ? "" : obj.toString();
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue() == 0 ? "" : obj.toString();
        }
        if (obj instanceof Long) {
            return ((Long) obj).longValue() == 0 ? "" : obj.toString();
        }
        if (obj instanceof Double) {
            return ((Double) obj).doubleValue() == 0.0d ? "" : obj.toString();
        }
        if (obj instanceof Boolean) {
            return !((Boolean) obj).booleanValue() ? "" : obj.toString();
        }
        if (obj instanceof List) {
            StringBuilder sb2 = new StringBuilder();
            if (i7 > 0) {
                sb2.append("[");
            }
            int length = sb2.length();
            for (Object obj2 : (List) obj) {
                if (sb2.length() > length) {
                    sb2.append(", ");
                }
                sb2.append(a(i7 + 1, obj2));
            }
            if (i7 > 0) {
                sb2.append("]");
            }
            return sb2.toString();
        }
        if (!(obj instanceof Map)) {
            return obj.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        boolean z5 = false;
        int length2 = 0;
        for (Map.Entry entry : new TreeMap((Map) obj).entrySet()) {
            String strA = a(i7 + 1, entry.getValue());
            if (!TextUtils.isEmpty(strA)) {
                if (i7 > 0 && !z5) {
                    sb3.append("{");
                    length2 = sb3.length();
                    z5 = true;
                }
                if (sb3.length() > length2) {
                    sb3.append(", ");
                }
                sb3.append((String) entry.getKey());
                sb3.append('=');
                sb3.append(strA);
            }
        }
        if (z5) {
            sb3.append("}");
        }
        return sb3.toString();
    }

    public static String zza(Object obj) {
        return a(0, obj);
    }
}
