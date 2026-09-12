package ff;

import a5.i0;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import pc.r;
import yf.i;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d {
    static {
        Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");
        Pattern.compile("^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$");
        Pattern.compile("^((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)::((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)$");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.HashMap] */
    public static Map a(URI uri) {
        String strDecode;
        ?? map = Collections.EMPTY_MAP;
        String rawQuery = uri.getRawQuery();
        if (rawQuery != null && rawQuery.length() > 0) {
            map = new HashMap();
            i0 i0Var = new i0(new r(new yf.h('=')), false, 14);
            i0 i0Var2 = new i0(new r(new yf.h('&')), true, 14);
            i iVar = new i(i0Var2, rawQuery, (yf.h) ((r) i0Var2.f215i).f17922d);
            while (iVar.hasNext()) {
                String str = (String) iVar.next();
                str.getClass();
                i iVar2 = new i(i0Var, str, (yf.h) ((r) i0Var.f215i).f17922d);
                ArrayList arrayList = new ArrayList();
                while (iVar2.hasNext()) {
                    arrayList.add((String) iVar2.next());
                }
                List listUnmodifiableList = Collections.unmodifiableList(arrayList);
                if (listUnmodifiableList.isEmpty() || listUnmodifiableList.size() > 2) {
                    throw new IllegalArgumentException("bad parameter");
                }
                try {
                    String strDecode2 = URLDecoder.decode((String) listUnmodifiableList.get(0), "UTF-8");
                    if (listUnmodifiableList.size() == 2) {
                        try {
                            strDecode = URLDecoder.decode((String) listUnmodifiableList.get(1), "UTF-8");
                        } catch (UnsupportedEncodingException e10) {
                            throw new IllegalArgumentException(e10);
                        }
                    } else {
                        strDecode = null;
                    }
                    map.put(strDecode2, strDecode);
                } catch (UnsupportedEncodingException e11) {
                    throw new IllegalArgumentException(e11);
                }
            }
        }
        return map;
    }
}
