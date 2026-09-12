package com.facebook.hermes.intl;

import ag.b;
import android.icu.lang.UCharacter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import x9.b0;
import xa.a;

/* JADX INFO: loaded from: classes3.dex */
@a
public class Intl {
    @a
    public static List<String> getCanonicalLocales(List<String> list) throws b {
        if (list.size() == 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str == null) {
                throw new b("Incorrect locale information provided", 9);
            }
            if (str.isEmpty()) {
                throw new b("Incorrect locale information provided", 9);
            }
            String strF = x9.a.g(str).f();
            if (!strF.isEmpty() && !arrayList.contains(strF)) {
                arrayList.add(strF);
            }
        }
        return arrayList;
    }

    @a
    public static String toLocaleLowerCase(List<String> list, String str) throws b {
        b0 b0Var = (b0) x9.a.e((String[]) list.toArray(new String[list.size()])).f8034e;
        b0Var.b();
        return UCharacter.toLowerCase(b0Var.f22667a, str);
    }

    @a
    public static String toLocaleUpperCase(List<String> list, String str) throws b {
        b0 b0Var = (b0) x9.a.e((String[]) list.toArray(new String[list.size()])).f8034e;
        b0Var.b();
        return UCharacter.toUpperCase(b0Var.f22667a, str);
    }
}
