package j$.time.format;

/* JADX INFO: loaded from: classes2.dex */
public final class j implements f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f13506c = {"+HH", "+HHmm", "+HH:mm", "+HHMM", "+HH:MM", "+HHMMss", "+HH:MM:ss", "+HHMMSS", "+HH:MM:SS"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j f13507d = new j("+HH:MM:ss", "Z");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13509b;

    static {
        new j("+HH:MM:ss", "0");
    }

    public j(String str, String str2) {
        for (int i7 = 0; i7 < 9; i7++) {
            if (f13506c[i7].equals(str)) {
                this.f13509b = i7;
                this.f13508a = str2;
                return;
            }
        }
        throw new IllegalArgumentException("Invalid zone offset pattern: ".concat(str));
    }

    @Override // j$.time.format.f
    public final boolean a(p pVar, StringBuilder sb2) {
        Long lA = pVar.a(j$.time.temporal.a.OFFSET_SECONDS);
        if (lA == null) {
            return false;
        }
        int intExact = Math.toIntExact(lA.longValue());
        String str = this.f13508a;
        if (intExact == 0) {
            sb2.append(str);
            return true;
        }
        int iAbs = Math.abs((intExact / 3600) % 100);
        int iAbs2 = Math.abs((intExact / 60) % 60);
        int iAbs3 = Math.abs(intExact % 60);
        int length = sb2.length();
        sb2.append(intExact < 0 ? "-" : "+");
        sb2.append((char) ((iAbs / 10) + 48));
        sb2.append((char) ((iAbs % 10) + 48));
        int i7 = this.f13509b;
        if (i7 >= 3 || (i7 >= 1 && iAbs2 > 0)) {
            int i10 = i7 % 2;
            sb2.append(i10 == 0 ? ":" : "");
            sb2.append((char) ((iAbs2 / 10) + 48));
            sb2.append((char) ((iAbs2 % 10) + 48));
            iAbs += iAbs2;
            if (i7 >= 7 || (i7 >= 5 && iAbs3 > 0)) {
                sb2.append(i10 == 0 ? ":" : "");
                sb2.append((char) ((iAbs3 / 10) + 48));
                sb2.append((char) ((iAbs3 % 10) + 48));
                iAbs += iAbs3;
            }
        }
        if (iAbs == 0) {
            sb2.setLength(length);
            sb2.append(str);
        }
        return true;
    }

    public final String toString() {
        return "Offset(" + f13506c[this.f13509b] + ",'" + this.f13508a.replace("'", "''") + "')";
    }
}
