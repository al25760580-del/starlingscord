package zr;

import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ConcurrentHashMap f24092e = new ConcurrentHashMap(32);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ReferenceQueue f24093f = new ReferenceQueue();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f24094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f24095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f24096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Locale f24097d;

    public g(i iVar, String str, Locale locale) throws IOException {
        int i7;
        this.f24094a = null;
        this.f24096c = str;
        this.f24097d = locale;
        HashMap map = new HashMap();
        while (true) {
            iVar.c();
            String line = iVar.f24102e.readLine();
            if (line == null) {
                this.f24095b = Collections.unmodifiableMap(map);
                return;
            }
            String strTrim = line.trim();
            if (!strTrim.isEmpty() && strTrim.charAt(0) != '#') {
                int length = strTrim.length();
                for (int i10 = 0; i10 < length; i10++) {
                    if (strTrim.charAt(i10) == '=' && (i7 = i10 + 1) < length) {
                        map.put(strTrim.substring(0, i10), strTrim.substring(i7));
                        break;
                    }
                }
            }
        }
    }

    public static LinkedList b(Locale locale) {
        String strA = d.a(locale);
        String country = locale.getCountry();
        String variant = locale.getVariant();
        LinkedList linkedList = new LinkedList();
        if (!variant.isEmpty()) {
            linkedList.add(new Locale(strA, country, variant));
        }
        if (!country.isEmpty()) {
            linkedList.add(new Locale(strA, country, ""));
        }
        if (!strA.isEmpty()) {
            linkedList.add(new Locale(strA, "", ""));
            if (strA.equals("nn")) {
                linkedList.add(new Locale("nb", "", ""));
            }
        }
        linkedList.add(Locale.ROOT);
        return linkedList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static g d(String str, Locale locale) throws Throwable {
        ReferenceQueue referenceQueue;
        g gVar;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Base name must not be empty.");
        }
        if (locale == null) {
            throw new NullPointerException("Missing locale.");
        }
        f fVar = new f(str, locale);
        ConcurrentHashMap concurrentHashMap = f24092e;
        e eVar = (e) concurrentHashMap.get(fVar);
        if (eVar != null && (gVar = (g) eVar.get()) != null) {
            return gVar;
        }
        while (true) {
            referenceQueue = f24093f;
            Reference referencePoll = referenceQueue.poll();
            if (referencePoll == null) {
                break;
            }
            concurrentHashMap.remove(((e) referencePoll).f24089a);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = b(locale).iterator();
        while (it.hasNext()) {
            try {
                g gVarE = e(str, (Locale) it.next());
                if (gVarE != null) {
                    arrayList.add(gVarE);
                }
            } catch (IOException e10) {
                throw new IllegalStateException(e10);
            }
        }
        if (arrayList.isEmpty()) {
            throw new MissingResourceException("Cannot find resource bundle for: " + f(str, locale), g.class.getName(), "");
        }
        for (int size = arrayList.size() - 1; size >= 1; size--) {
            int i7 = size - 1;
            g gVar2 = (g) arrayList.get(i7);
            g gVar3 = (g) arrayList.get(size);
            gVar2.getClass();
            if (gVar3 != null) {
                gVar2 = new g(gVar2, gVar3);
            }
            arrayList.set(i7, gVar2);
        }
        g gVar4 = (g) arrayList.get(0);
        e eVar2 = new e(gVar4, referenceQueue);
        eVar2.f24089a = fVar;
        concurrentHashMap.putIfAbsent(fVar, eVar2);
        return gVar4;
    }

    public static g e(String str, Locale locale) throws Throwable {
        int iIndexOf = str.indexOf(47);
        String strSubstring = str.substring(0, iIndexOf);
        String strF = f(str.substring(iIndexOf + 1), locale);
        vr.c cVar = vr.c.f21955b;
        InputStream inputStreamB = cVar.b(cVar.c(strSubstring, strF, g.class));
        i iVar = null;
        if (inputStreamB == null) {
            try {
                inputStreamB = vr.c.a(g.class, strF);
            } catch (IOException unused) {
            }
        }
        if (inputStreamB != null) {
            try {
                i iVar2 = new i(inputStreamB);
                try {
                    g gVar = new g(iVar2, str, locale);
                    iVar2.close();
                    return gVar;
                } catch (Throwable th2) {
                    th = th2;
                    iVar = iVar2;
                    if (iVar != null) {
                        iVar.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
        return null;
    }

    public static String f(String str, Locale locale) {
        String strA = d.a(locale);
        String country = locale.getCountry();
        String variant = locale.getVariant();
        StringBuilder sb2 = new StringBuilder(str.length() + 20);
        sb2.append(str.replace('.', '/'));
        if (!strA.isEmpty()) {
            sb2.append('_');
            sb2.append(strA);
            if (!variant.isEmpty()) {
                sb2.append('_');
                sb2.append(country);
                sb2.append('_');
                sb2.append(variant);
            } else if (!country.isEmpty()) {
                sb2.append('_');
                sb2.append(country);
            }
        }
        sb2.append(".properties");
        return sb2.toString();
    }

    public final boolean a(String str) {
        if (str == null) {
            throw new NullPointerException("Missing resource key.");
        }
        g gVar = this;
        while (((String) gVar.f24095b.get(str)) == null) {
            gVar = gVar.f24094a;
            if (gVar == null) {
                return false;
            }
        }
        return true;
    }

    public final String c(String str) {
        if (str == null) {
            throw new NullPointerException("Missing resource key.");
        }
        g gVar = this;
        do {
            String str2 = (String) gVar.f24095b.get(str);
            if (str2 != null) {
                return str2;
            }
            gVar = gVar.f24094a;
        } while (gVar != null);
        throw new MissingResourceException("Cannot find property resource for: " + f(this.f24096c, this.f24097d) + "=>" + str, g.class.getName(), str);
    }

    public g(g gVar, g gVar2) {
        this.f24094a = gVar2;
        this.f24096c = gVar.f24096c;
        this.f24097d = gVar.f24097d;
        this.f24095b = gVar.f24095b;
    }
}
