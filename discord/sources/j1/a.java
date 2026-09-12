package j1;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f13597e = new byte[1792];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f13598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13600c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public char f13601d;

    static {
        for (int i7 = 0; i7 < 1792; i7++) {
            f13597e[i7] = Character.getDirectionality(i7);
        }
    }

    public a(CharSequence charSequence) {
        this.f13598a = charSequence;
        this.f13599b = charSequence.length();
    }

    public final byte a() {
        int i7 = this.f13600c - 1;
        CharSequence charSequence = this.f13598a;
        char cCharAt = charSequence.charAt(i7);
        this.f13601d = cCharAt;
        if (Character.isLowSurrogate(cCharAt)) {
            int iCodePointBefore = Character.codePointBefore(charSequence, this.f13600c);
            this.f13600c -= Character.charCount(iCodePointBefore);
            return Character.getDirectionality(iCodePointBefore);
        }
        this.f13600c--;
        char c8 = this.f13601d;
        return c8 < 1792 ? f13597e[c8] : Character.getDirectionality(c8);
    }
}
