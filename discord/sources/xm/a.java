package xm;

import a3.e;
import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.text.x;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f22977a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f22978b = new LinkedHashMap();

    public final int a(Context context, String str, String str2) {
        if (str.length() == 0) {
            return -1;
        }
        Locale locale = Locale.ROOT;
        String strL = x.l(e.p(locale, "ROOT", str, locale, "toLowerCase(...)"), "-", "_", false);
        String strK = kk.b.k(str2, "/", strL);
        synchronized (this) {
            LinkedHashMap linkedHashMap = f22978b;
            Integer num = (Integer) linkedHashMap.get(strK);
            if (num != null) {
                return num.intValue();
            }
            int identifier = context.getResources().getIdentifier(strL, str2, context.getPackageName());
            linkedHashMap.put(strK, Integer.valueOf(identifier));
            return identifier;
        }
    }
}
