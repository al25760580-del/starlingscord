package bs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import net.time4j.tz.p;
import vr.c;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements p {
    static {
        new ConcurrentHashMap();
        HashSet hashSet = new HashSet();
        hashSet.add("Z");
        hashSet.add("GMT");
        hashSet.add("GMT0");
        hashSet.add("Greenwich");
        hashSet.add("UCT");
        hashSet.add("UTC");
        hashSet.add("UTC0");
        hashSet.add("Universal");
        hashSet.add("Zulu");
        Collections.unmodifiableSet(hashSet);
        HashMap map = new HashMap();
        c cVar = c.f21955b;
        InputStream inputStreamB = cVar.b(cVar.c("olson", "data/zone1970.tab", b.class));
        if (inputStreamB == null) {
            inputStreamB = b.class.getClassLoader().getResourceAsStream("data/zone1970.tab");
        }
        try {
            if (inputStreamB != null) {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamB, "UTF-8"));
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            try {
                                break;
                            } catch (IOException e10) {
                                e10.printStackTrace(System.err);
                            }
                        } else if (!line.startsWith("#") && !line.isEmpty()) {
                            String[] strArrSplit = line.split("\t");
                            if (strArrSplit.length >= 3) {
                                for (String str : strArrSplit[0].split(",")) {
                                    a(str, strArrSplit[2], map);
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    inputStreamB.close();
                } catch (UnsupportedEncodingException e11) {
                    throw new AssertionError(e11);
                } catch (IOException e12) {
                    throw new IllegalStateException(e12);
                }
            } else {
                System.err.println("Warning: File \"data/zone1970.tab\" not found.");
            }
            Collections.unmodifiableMap(map);
            HashMap map2 = new HashMap();
            map2.put("CL", "America/Santiago");
            map2.put("CN", "Asia/Shanghai");
            map2.put("DE", "Europe/Berlin");
            map2.put("EC", "America/Guayaquil");
            map2.put("ES", "Europe/Madrid");
            map2.put("MH", "Pacific/Majuro");
            map2.put("MY", "Asia/Kuala_Lumpur");
            map2.put("NZ", "Pacific/Auckland");
            map2.put("PT", "Europe/Lisbon");
            map2.put("UA", "Europe/Kiev");
            map2.put("UZ", "Asia/Tashkent");
            Collections.unmodifiableMap(map2);
        } catch (Throwable th2) {
            try {
                inputStreamB.close();
            } catch (IOException e13) {
                e13.printStackTrace(System.err);
            }
            throw th2;
        }
    }

    public static void a(String str, String str2, HashMap map) {
        Set linkedHashSet = (Set) map.get(str);
        if (linkedHashSet == null) {
            linkedHashSet = new LinkedHashSet();
            map.put(str, linkedHashSet);
        }
        linkedHashSet.add(str2);
    }
}
