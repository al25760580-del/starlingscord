package net.time4j.tz;

import ag.t;
import j$.util.DesugarTimeZone;
import java.io.Serializable;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i implements Serializable {
    public static final Map E;
    public static final h F;
    public static final o G;
    public static final ConcurrentHashMap H;
    public static final ReferenceQueue I;
    public static final LinkedList J;
    public static final ConcurrentHashMap K;
    public static final i L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f16723d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final t f16724e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final k f16725i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final boolean f16726v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static volatile i f16727w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static volatile boolean f16728x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f16729y;

    static {
        List listUnmodifiableList;
        i iVarC;
        System.getProperty("line.separator");
        f16723d = System.getProperty("net.time4j.tz.repository.version");
        f16724e = new t(8);
        f16725i = k.a(1, 2);
        k.a(3, 2);
        f16726v = "Dalvik".equalsIgnoreCase(System.getProperty("java.vm.name")) || Boolean.getBoolean("net.time4j.allow.system.tz.override");
        f16727w = null;
        f16728x = true;
        f16729y = 11;
        H = new ConcurrentHashMap();
        K = new ConcurrentHashMap();
        I = new ReferenceQueue();
        J = new LinkedList();
        try {
            ClassLoader classLoader = i.class.getClassLoader();
            String[] strArr = {"AFRICA", "AMERICA", "AMERICA$ARGENTINA", "AMERICA$INDIANA", "AMERICA$KENTUCKY", "AMERICA$NORTH_DAKOTA", "ANTARCTICA", "ASIA", "ATLANTIC", "AUSTRALIA", "EUROPE", "INDIAN", "PACIFIC"};
            ArrayList arrayList = new ArrayList();
            for (int i7 = 0; i7 < 13; i7++) {
                Class<?> cls = Class.forName("net.time4j.tz.olson." + strArr[i7], true, classLoader);
                if (f.class.isAssignableFrom(cls)) {
                    arrayList.add(cls);
                }
            }
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
        } catch (ClassNotFoundException unused) {
            listUnmodifiableList = Collections.EMPTY_LIST;
        }
        HashMap map = new HashMap();
        m mVar = m.f16734w;
        map.put("Z", mVar);
        map.put("UT", mVar);
        map.put("UTC", mVar);
        map.put("GMT", mVar);
        map.put("UTC0", mVar);
        map.put("GMT0", mVar);
        Iterator it = listUnmodifiableList.iterator();
        while (it.hasNext()) {
            for (f fVar : (f[]) ((Class) it.next()).getEnumConstants()) {
                map.put(fVar.a(), fVar);
            }
        }
        E = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        m mVar2 = m.f16734w;
        map2.put("Etc/GMT", mVar2);
        map2.put("Etc/Greenwich", mVar2);
        map2.put("Etc/Universal", mVar2);
        map2.put("Etc/Zulu", mVar2);
        map2.put("Etc/GMT+0", mVar2);
        map2.put("Etc/GMT-0", mVar2);
        map2.put("Etc/GMT0", mVar2);
        map2.put("Etc/UTC", mVar2);
        map2.put("Etc/UCT", mVar2);
        map2.put("Etc/GMT-14", m.e(50400, 0));
        map2.put("Etc/GMT-13", m.e(46800, 0));
        map2.put("Etc/GMT-12", m.e(43200, 0));
        map2.put("Etc/GMT-11", m.e(39600, 0));
        map2.put("Etc/GMT-10", m.e(36000, 0));
        map2.put("Etc/GMT-9", m.e(32400, 0));
        map2.put("Etc/GMT-8", m.e(28800, 0));
        map2.put("Etc/GMT-7", m.e(25200, 0));
        map2.put("Etc/GMT-6", m.e(21600, 0));
        map2.put("Etc/GMT-5", m.e(18000, 0));
        map2.put("Etc/GMT-4", m.e(14400, 0));
        map2.put("Etc/GMT-3", m.e(10800, 0));
        map2.put("Etc/GMT-2", m.e(7200, 0));
        map2.put("Etc/GMT-1", m.e(3600, 0));
        map2.put("Etc/GMT+1", m.e(-3600, 0));
        map2.put("Etc/GMT+2", m.e(-7200, 0));
        map2.put("Etc/GMT+3", m.e(-10800, 0));
        map2.put("Etc/GMT+4", m.e(-14400, 0));
        map2.put("Etc/GMT+5", m.e(-18000, 0));
        map2.put("Etc/GMT+6", m.e(-21600, 0));
        map2.put("Etc/GMT+7", m.e(-25200, 0));
        map2.put("Etc/GMT+8", m.e(-28800, 0));
        map2.put("Etc/GMT+9", m.e(-32400, 0));
        map2.put("Etc/GMT+10", m.e(-36000, 0));
        map2.put("Etc/GMT+11", m.e(-39600, 0));
        map2.put("Etc/GMT+12", m.e(-43200, 0));
        Collections.unmodifiableMap(map2);
        o oVar = null;
        for (o oVar2 : vr.c.f21955b.d(o.class)) {
            String name = oVar2.getName();
            if (name.equals("TZDB")) {
                String strC = oVar2.c();
                if (!strC.isEmpty()) {
                    String str = f16723d;
                    if (strC.equals(str) || (str == null && (oVar == null || strC.compareTo(oVar.c()) > 0 || (strC.compareTo(oVar.c()) == 0 && !oVar2.d().contains("{java.home}"))))) {
                        oVar = oVar2;
                    }
                }
            } else if (!name.isEmpty() && !name.equals("DEFAULT")) {
                K.put(name, oVar2);
            }
        }
        for (p pVar : vr.c.f21955b.d(p.class)) {
        }
        h hVar = new h();
        F = hVar;
        ConcurrentHashMap concurrentHashMap = K;
        concurrentHashMap.put("java.util.TimeZone", hVar);
        if (oVar == null) {
            G = hVar;
        } else {
            concurrentHashMap.put("TZDB", oVar);
            G = oVar;
        }
        try {
            String property = System.getProperty("user.timezone");
            iVarC = ("Z".equals(property) || "UTC".equals(property)) ? m.f16734w.c() : property != null ? b(c(property), property, false) : null;
        } catch (SecurityException unused2) {
        }
        if (iVarC == null) {
            String id2 = TimeZone.getDefault().getID();
            i iVarB = b(null, id2, false);
            if (iVarB == null) {
                iVarB = new d(new c(id2));
            }
            L = iVarB;
        } else {
            L = iVarC;
        }
        if (f16726v) {
            f16727w = L;
        }
        new fp.l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static i b(f fVar, String str, boolean z5) {
        i iVar;
        boolean z6;
        String strSubstring;
        i bVar;
        i bVar2;
        d dVar;
        TimeZone timeZone;
        i iVar2;
        ConcurrentHashMap concurrentHashMap = H;
        g gVar = (g) concurrentHashMap.get(str);
        if (gVar != null) {
            iVar2 = (i) gVar.get();
            if (iVar2 == null) {
                iVar = iVar2;
                concurrentHashMap.remove(gVar.f16722a);
                iVar = iVar2;
            }
        } else {
            iVar = null;
        }
        if (iVar != null) {
            return iVar;
        }
        String strSubstring2 = "";
        int length = str.length();
        int i7 = 0;
        while (true) {
            z6 = true;
            if (i7 >= length) {
                strSubstring = str;
                break;
            }
            if (str.charAt(i7) == '~') {
                strSubstring2 = str.substring(0, i7);
                strSubstring = str.substring(i7 + 1);
                break;
            }
            i7++;
        }
        if (!strSubstring.isEmpty()) {
            o oVar = G;
            if (!strSubstring2.isEmpty() && !strSubstring2.equals("DEFAULT")) {
                z6 = false;
            }
            if (z6 || (oVar = (o) K.get(strSubstring2)) != null) {
                if (fVar == null) {
                    if (z6) {
                        fVar = c(strSubstring);
                        if (fVar instanceof m) {
                            return ((m) fVar).c();
                        }
                    } else {
                        fVar = new c(str);
                    }
                }
                if (oVar == F) {
                    if (strSubstring.equals("Z")) {
                        timeZone = DesugarTimeZone.getTimeZone("GMT+00:00");
                    } else if (strSubstring.startsWith("UTC")) {
                        timeZone = DesugarTimeZone.getTimeZone("GMT" + strSubstring.substring(3));
                    } else if (strSubstring.startsWith("UT")) {
                        timeZone = DesugarTimeZone.getTimeZone("GMT" + strSubstring.substring(2));
                    } else {
                        timeZone = DesugarTimeZone.getTimeZone(strSubstring);
                    }
                    dVar = new d(fVar, timeZone, false);
                    boolean zD = dVar.d();
                    bVar2 = dVar;
                    if (!zD || strSubstring.equals("GMT") || strSubstring.startsWith("UT") || strSubstring.equals("Z")) {
                        bVar2 = dVar;
                        bVar2 = dVar;
                        bVar = iVar;
                        bVar2 = dVar;
                        bVar2 = dVar;
                        bVar2 = dVar;
                        bVar2 = dVar;
                        bVar = bVar2;
                    }
                } else {
                    j jVarLoad = oVar.load(strSubstring);
                    if (jVarLoad == null) {
                        Map mapB = oVar.b();
                        j jVarLoad2 = null;
                        while (jVarLoad2 == null) {
                            strSubstring = (String) mapB.get(strSubstring);
                            if (strSubstring == null) {
                                break;
                            }
                            jVarLoad2 = oVar.load(strSubstring);
                        }
                        if (jVarLoad2 == null) {
                            bVar = null;
                        } else {
                            bVar2 = new b(fVar, jVarLoad2, f16725i);
                            bVar2 = dVar;
                            bVar2 = dVar;
                            bVar = iVar;
                            bVar2 = dVar;
                            bVar2 = dVar;
                            bVar2 = dVar;
                            bVar2 = dVar;
                            bVar = bVar2;
                        }
                    } else {
                        bVar = new b(fVar, jVarLoad, f16725i);
                    }
                }
                if (bVar != null) {
                    if (f16728x) {
                        g gVar2 = (g) H.putIfAbsent(str, new g(bVar, I));
                        if (gVar2 == null) {
                            synchronized (i.class) {
                                try {
                                    J.addFirst(bVar);
                                    while (true) {
                                        LinkedList linkedList = J;
                                        if (linkedList.size() >= f16729y) {
                                            linkedList.removeLast();
                                        }
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                            return bVar;
                        }
                        i iVar3 = (i) gVar2.get();
                        if (iVar3 != null) {
                            return iVar3;
                        }
                    }
                    return bVar;
                }
                if (z5) {
                    if (TimeZone.getDefault().getID().equals(str)) {
                        return new d(new c(str));
                    }
                    throw new IllegalArgumentException("Unknown timezone: ".concat(str));
                }
            } else if (z5) {
                throw new IllegalArgumentException((strSubstring2.equals("TZDB") ? "TZDB provider not available: " : "Timezone model provider not registered: ").concat(str));
            }
        } else if (z5) {
            throw new IllegalArgumentException("Timezone key is empty.");
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0050  */
    /* JADX WARN: Code duplicated, block: B:21:0x0054  */
    /* JADX WARN: Code duplicated, block: B:23:0x005e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0060  */
    /* JADX WARN: Code duplicated, block: B:26:0x0068  */
    /* JADX WARN: Code duplicated, block: B:27:0x006a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0073  */
    /* JADX WARN: Code duplicated, block: B:32:0x0078  */
    /* JADX WARN: Code duplicated, block: B:35:0x0081  */
    /* JADX WARN: Code duplicated, block: B:38:0x008e A[ADDED_TO_REGION] */
    public static f c(String str) {
        String strSubstring;
        m mVarE;
        int i7;
        int iF;
        int i10;
        int iF2;
        int iF3;
        f fVar = (f) E.get(str);
        if (fVar != null) {
            return fVar;
        }
        if (str.startsWith("GMT")) {
            str = "UTC" + str.substring(3);
        }
        ConcurrentHashMap concurrentHashMap = m.f16733v;
        if (str.equals("Z")) {
            mVarE = m.f16734w;
        } else {
            int length = str.length();
            if (length < 3) {
                strSubstring = str;
                if (length >= 2) {
                    if (strSubstring.charAt(0) == '-') {
                        i7 = 1;
                    } else if (strSubstring.charAt(0) == '+') {
                        i7 = 2;
                    } else {
                        i7 = 0;
                    }
                    iF = m.f(1, 2, strSubstring);
                    if (iF >= 0) {
                        if (length <= 3) {
                            mVarE = m.d(i7, iF, 0);
                        } else {
                            i10 = strSubstring.charAt(2) != ':' ? 4 : 3;
                            int iF4 = m.f(i10, 2, strSubstring);
                            if (strSubstring.charAt(i10 - 1) != ':' && iF4 >= 0) {
                                int i11 = i10 + 2;
                                if (length == i11) {
                                    mVarE = m.d(i7, iF, iF4);
                                } else {
                                    int i12 = i10 + 5;
                                    if (length >= i12 && strSubstring.charAt(i11) == ':' && (iF2 = m.f(i10 + 3, 2, strSubstring)) >= 0) {
                                        int i13 = (iF4 * 60) + (iF * 3600) + iF2;
                                        if (i7 == 1) {
                                            i13 = -i13;
                                        }
                                        if (length == i12) {
                                            mVarE = m.e(i13, 0);
                                        } else if (length == i10 + 15 && strSubstring.charAt(i12) == '.' && (iF3 = m.f(i10 + 6, 9, strSubstring)) >= 0) {
                                            if (i7 == 1) {
                                                iF3 = -iF3;
                                            }
                                            mVarE = m.e(i13, iF3);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else if (str.startsWith("UTC")) {
                strSubstring = str.substring(3);
                length -= 3;
                if (length >= 2) {
                    if (strSubstring.charAt(0) == '-') {
                        i7 = 1;
                    } else if (strSubstring.charAt(0) == '+') {
                        i7 = 2;
                    } else {
                        i7 = 0;
                    }
                    iF = m.f(1, 2, strSubstring);
                    if (iF >= 0) {
                        if (length <= 3) {
                            mVarE = m.d(i7, iF, 0);
                        } else {
                            if (strSubstring.charAt(2) != ':') {
                            }
                            int iF5 = m.f(i10, 2, strSubstring);
                            if (strSubstring.charAt(i10 - 1) != ':') {
                            }
                        }
                    }
                }
            } else if (!str.startsWith("GMT")) {
                strSubstring = str;
                if (length >= 2) {
                    if (strSubstring.charAt(0) == '-') {
                        i7 = 1;
                    } else if (strSubstring.charAt(0) == '+') {
                        i7 = 2;
                    } else {
                        i7 = 0;
                    }
                    iF = m.f(1, 2, strSubstring);
                    if (iF >= 0) {
                        if (length <= 3) {
                            mVarE = m.d(i7, iF, 0);
                        } else {
                            if (strSubstring.charAt(2) != ':') {
                            }
                            int iF6 = m.f(i10, 2, strSubstring);
                            if (strSubstring.charAt(i10 - 1) != ':') {
                            }
                        }
                    }
                }
            }
            mVarE = null;
        }
        return mVarE == null ? new c(str) : mVarE;
    }

    public abstract f a();
}
