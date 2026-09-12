package zr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import net.time4j.p1;
import yr.s0;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24103a;

    public k() {
        String strSubstring;
        p1 p1Var;
        HashMap map;
        vr.c cVar = vr.c.f21955b;
        URI uriC = cVar.c("i18n", "data/week.data", k.class);
        InputStream inputStreamB = cVar.b(uriC);
        if (inputStreamB == null) {
            try {
                inputStreamB = vr.c.a(k.class, "data/week.data");
            } catch (IOException unused) {
            }
        }
        if (inputStreamB == null) {
            this.f24103a = "@STATIC";
            Set set = Collections.EMPTY_SET;
            Map map2 = Collections.EMPTY_MAP;
            System.err.println("Warning: File \"data/week.data\" not found.");
            return;
        }
        this.f24103a = "@" + uriC;
        HashSet hashSet = new HashSet();
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        HashMap map5 = new HashMap();
        try {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamB, "US-ASCII"));
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        Collections.unmodifiableSet(hashSet);
                        Collections.unmodifiableMap(map3);
                        Collections.unmodifiableMap(map4);
                        Collections.unmodifiableMap(map5);
                        try {
                            inputStreamB.close();
                            return;
                        } catch (IOException e10) {
                            e10.printStackTrace(System.err);
                            return;
                        }
                    }
                    if (!line.startsWith("#")) {
                        int iIndexOf = line.indexOf(61);
                        int i7 = 0;
                        String strTrim = line.substring(0, iIndexOf).trim();
                        String[] strArrSplit = line.substring(iIndexOf + 1).split(" ");
                        if (strTrim.equals("minDays-4")) {
                            int length = strArrSplit.length;
                            while (i7 < length) {
                                String upperCase = strArrSplit[i7].trim().toUpperCase(Locale.US);
                                if (!upperCase.isEmpty()) {
                                    hashSet.add(upperCase);
                                }
                                i7++;
                            }
                        } else {
                            if (strTrim.startsWith("start-")) {
                                strSubstring = strTrim.substring(6);
                                p1Var = p1.f16692x;
                                map = map4;
                            } else if (strTrim.startsWith("end-")) {
                                strSubstring = strTrim.substring(4);
                                p1Var = p1.f16693y;
                                map = map5;
                            } else {
                                if (!strTrim.startsWith("first-")) {
                                    throw new IllegalStateException("Unexpected format: " + this.f24103a);
                                }
                                strSubstring = strTrim.substring(6);
                                p1Var = p1.f16687d;
                                map = map3;
                            }
                            if (strSubstring.equals("sun")) {
                                p1Var = p1.f16693y;
                            } else if (strSubstring.equals("sat")) {
                                p1Var = p1.f16692x;
                            } else if (strSubstring.equals("fri")) {
                                p1Var = p1.f16691w;
                            } else if (strSubstring.equals("thu")) {
                                p1Var = p1.f16690v;
                            } else if (strSubstring.equals("wed")) {
                                p1Var = p1.f16689i;
                            } else if (strSubstring.equals("tue")) {
                                p1Var = p1.f16688e;
                            } else if (strSubstring.equals("mon")) {
                                p1Var = p1.f16687d;
                            }
                            int length2 = strArrSplit.length;
                            while (i7 < length2) {
                                String upperCase2 = strArrSplit[i7].trim().toUpperCase(Locale.US);
                                if (!upperCase2.isEmpty()) {
                                    map.put(upperCase2, p1Var);
                                }
                                i7++;
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                try {
                    inputStreamB.close();
                } catch (IOException e11) {
                    e11.printStackTrace(System.err);
                }
                throw th2;
            }
        } catch (UnsupportedEncodingException e12) {
            throw new AssertionError(e12);
        } catch (Exception e13) {
            throw new IllegalStateException("Unexpected format: " + this.f24103a, e13);
        }
    }

    public final String toString() {
        return k.class.getName() + this.f24103a;
    }
}
