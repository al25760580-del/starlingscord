package xj;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f22962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object[][] f22963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object[][] f22964c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object[][] f22965d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object[][] f22966e;

    static {
        Object obj = new Object();
        f22962a = obj;
        f22963b = new Object[][]{new Object[]{"00", 18}, new Object[]{"01", 14}, new Object[]{"02", 14}, new Object[]{"10", obj, 20}, new Object[]{"11", 6}, new Object[]{"12", 6}, new Object[]{"13", 6}, new Object[]{"15", 6}, new Object[]{"17", 6}, new Object[]{"20", 2}, new Object[]{"21", obj, 20}, new Object[]{"22", obj, 29}, new Object[]{"30", obj, 8}, new Object[]{"37", obj, 8}, new Object[]{"90", obj, 30}, new Object[]{"91", obj, 30}, new Object[]{"92", obj, 30}, new Object[]{"93", obj, 30}, new Object[]{"94", obj, 30}, new Object[]{"95", obj, 30}, new Object[]{"96", obj, 30}, new Object[]{"97", obj, 30}, new Object[]{"98", obj, 30}, new Object[]{"99", obj, 30}};
        f22964c = new Object[][]{new Object[]{"240", obj, 30}, new Object[]{"241", obj, 30}, new Object[]{"242", obj, 6}, new Object[]{"250", obj, 30}, new Object[]{"251", obj, 30}, new Object[]{"253", obj, 17}, new Object[]{"254", obj, 20}, new Object[]{"400", obj, 30}, new Object[]{"401", obj, 30}, new Object[]{"402", 17}, new Object[]{"403", obj, 30}, new Object[]{"410", 13}, new Object[]{"411", 13}, new Object[]{"412", 13}, new Object[]{"413", 13}, new Object[]{"414", 13}, new Object[]{"420", obj, 20}, new Object[]{"421", obj, 15}, new Object[]{"422", 3}, new Object[]{"423", obj, 15}, new Object[]{"424", 3}, new Object[]{"425", 3}, new Object[]{"426", 3}};
        f22965d = new Object[][]{new Object[]{"310", 6}, new Object[]{"311", 6}, new Object[]{"312", 6}, new Object[]{"313", 6}, new Object[]{"314", 6}, new Object[]{"315", 6}, new Object[]{"316", 6}, new Object[]{"320", 6}, new Object[]{"321", 6}, new Object[]{"322", 6}, new Object[]{"323", 6}, new Object[]{"324", 6}, new Object[]{"325", 6}, new Object[]{"326", 6}, new Object[]{"327", 6}, new Object[]{"328", 6}, new Object[]{"329", 6}, new Object[]{"330", 6}, new Object[]{"331", 6}, new Object[]{"332", 6}, new Object[]{"333", 6}, new Object[]{"334", 6}, new Object[]{"335", 6}, new Object[]{"336", 6}, new Object[]{"340", 6}, new Object[]{"341", 6}, new Object[]{"342", 6}, new Object[]{"343", 6}, new Object[]{"344", 6}, new Object[]{"345", 6}, new Object[]{"346", 6}, new Object[]{"347", 6}, new Object[]{"348", 6}, new Object[]{"349", 6}, new Object[]{"350", 6}, new Object[]{"351", 6}, new Object[]{"352", 6}, new Object[]{"353", 6}, new Object[]{"354", 6}, new Object[]{"355", 6}, new Object[]{"356", 6}, new Object[]{"357", 6}, new Object[]{"360", 6}, new Object[]{"361", 6}, new Object[]{"362", 6}, new Object[]{"363", 6}, new Object[]{"364", 6}, new Object[]{"365", 6}, new Object[]{"366", 6}, new Object[]{"367", 6}, new Object[]{"368", 6}, new Object[]{"369", 6}, new Object[]{"390", obj, 15}, new Object[]{"391", obj, 18}, new Object[]{"392", obj, 15}, new Object[]{"393", obj, 18}, new Object[]{"703", obj, 30}};
        f22966e = new Object[][]{new Object[]{"7001", 13}, new Object[]{"7002", obj, 30}, new Object[]{"7003", 10}, new Object[]{"8001", 14}, new Object[]{"8002", obj, 20}, new Object[]{"8003", obj, 30}, new Object[]{"8004", obj, 30}, new Object[]{"8005", 6}, new Object[]{"8006", 18}, new Object[]{"8007", obj, 30}, new Object[]{"8008", obj, 12}, new Object[]{"8018", 18}, new Object[]{"8020", obj, 25}, new Object[]{"8100", 6}, new Object[]{"8101", 10}, new Object[]{"8102", 2}, new Object[]{"8110", obj, 70}, new Object[]{"8200", obj, 70}};
    }

    public static String a(String str) {
        if (str.isEmpty()) {
            return null;
        }
        if (str.length() < 2) {
            throw ij.h.f11808i;
        }
        String strSubstring = str.substring(0, 2);
        int i7 = 0;
        while (true) {
            Object obj = f22962a;
            if (i7 >= 24) {
                if (str.length() < 3) {
                    throw ij.h.f11808i;
                }
                String strSubstring2 = str.substring(0, 3);
                for (int i10 = 0; i10 < 23; i10++) {
                    Object[] objArr = f22964c[i10];
                    if (objArr[0].equals(strSubstring2)) {
                        Object obj2 = objArr[1];
                        return obj2 == obj ? c(3, ((Integer) objArr[2]).intValue(), str) : b(3, ((Integer) obj2).intValue(), str);
                    }
                }
                for (int i11 = 0; i11 < 57; i11++) {
                    Object[] objArr2 = f22965d[i11];
                    if (objArr2[0].equals(strSubstring2)) {
                        Object obj3 = objArr2[1];
                        return obj3 == obj ? c(4, ((Integer) objArr2[2]).intValue(), str) : b(4, ((Integer) obj3).intValue(), str);
                    }
                }
                if (str.length() < 4) {
                    throw ij.h.f11808i;
                }
                String strSubstring3 = str.substring(0, 4);
                for (int i12 = 0; i12 < 18; i12++) {
                    Object[] objArr3 = f22966e[i12];
                    if (objArr3[0].equals(strSubstring3)) {
                        Object obj4 = objArr3[1];
                        return obj4 == obj ? c(4, ((Integer) objArr3[2]).intValue(), str) : b(4, ((Integer) obj4).intValue(), str);
                    }
                }
                throw ij.h.f11808i;
            }
            Object[] objArr4 = f22963b[i7];
            if (objArr4[0].equals(strSubstring)) {
                Object obj5 = objArr4[1];
                return obj5 == obj ? c(2, ((Integer) objArr4[2]).intValue(), str) : b(2, ((Integer) obj5).intValue(), str);
            }
            i7++;
        }
    }

    public static String b(int i7, int i10, String str) throws ij.h {
        if (str.length() < i7) {
            throw ij.h.f11808i;
        }
        String strSubstring = str.substring(0, i7);
        int i11 = i10 + i7;
        if (str.length() < i11) {
            throw ij.h.f11808i;
        }
        String strSubstring2 = str.substring(i7, i11);
        String str2 = "(" + strSubstring + ')' + strSubstring2;
        String strA = a(str.substring(i11));
        return strA == null ? str2 : kk.b.j(str2, strA);
    }

    public static String c(int i7, int i10, String str) {
        String strSubstring = str.substring(0, i7);
        int length = i10 + i7;
        if (str.length() < length) {
            length = str.length();
        }
        String strSubstring2 = str.substring(i7, length);
        String str2 = "(" + strSubstring + ')' + strSubstring2;
        String strA = a(str.substring(length));
        return strA == null ? str2 : kk.b.j(str2, strA);
    }
}
