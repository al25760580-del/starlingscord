package di;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final char f7627d;

    public b(char c8) {
        this.f7627d = c8;
    }

    @Override // di.a
    public final boolean a(char c8) {
        return c8 == this.f7627d;
    }

    public final String toString() {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        char c8 = this.f7627d;
        for (int i7 = 0; i7 < 4; i7++) {
            cArr[5 - i7] = "0123456789ABCDEF".charAt(c8 & 15);
            c8 = (char) (c8 >> 4);
        }
        String strCopyValueOf = String.copyValueOf(cArr);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strCopyValueOf).length() + 18);
        sb2.append("CharMatcher.is('");
        sb2.append(strCopyValueOf);
        sb2.append("')");
        return sb2.toString();
    }
}
