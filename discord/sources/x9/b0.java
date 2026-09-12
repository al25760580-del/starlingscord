package x9;

import android.icu.util.ULocale;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ULocale f22667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ULocale.Builder f22668b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f22669c = false;

    public b0(ULocale uLocale) {
        this.f22667a = uLocale;
    }

    public final b0 a() throws ag.b {
        b();
        return new b0(this.f22667a);
    }

    public final void b() throws ag.b {
        if (this.f22669c) {
            try {
                this.f22667a = this.f22668b.build();
                this.f22669c = false;
            } catch (RuntimeException e10) {
                throw new ag.b(e10.getMessage(), 9);
            }
        }
    }

    public final Object c() throws ag.b {
        b();
        return this.f22667a;
    }

    public final HashMap d() throws ag.b {
        b();
        HashMap map = new HashMap();
        Iterator<String> keywords = this.f22667a.getKeywords();
        if (keywords != null) {
            while (keywords.hasNext()) {
                String next = keywords.next();
                fk.i iVar = d0.f22685b;
                map.put(iVar.containsKey(next) ? (String) iVar.get(next) : next, this.f22667a.getKeywordValue(next));
            }
        }
        return map;
    }

    public final void e(String str, ArrayList arrayList) throws ag.b {
        b();
        if (this.f22668b == null) {
            this.f22668b = new ULocale.Builder().setLocale(this.f22667a);
        }
        try {
            this.f22668b.setUnicodeLocaleKeyword(str, TextUtils.join("-", arrayList));
            this.f22669c = true;
        } catch (RuntimeException e10) {
            throw new ag.b(e10.getMessage(), 9);
        }
    }

    public final String f() throws ag.b {
        b();
        return this.f22667a.toLanguageTag();
    }
}
