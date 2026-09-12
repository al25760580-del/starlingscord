package hj;

/* JADX INFO: loaded from: classes3.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f10896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f10898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f10899d;

    public p0(b bVar, String str, Object[] objArr) {
        this.f10896a = bVar;
        this.f10897b = str;
        this.f10898c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f10899d = cCharAt;
            return;
        }
        int i7 = cCharAt & 8191;
        int i10 = 13;
        int i11 = 1;
        while (true) {
            int i12 = i11 + 1;
            char cCharAt2 = str.charAt(i11);
            if (cCharAt2 < 55296) {
                this.f10899d = i7 | (cCharAt2 << i10);
                return;
            } else {
                i7 |= (cCharAt2 & 8191) << i10;
                i10 += 13;
                i11 = i12;
            }
        }
    }

    public final int a() {
        int i7 = this.f10899d;
        if ((i7 & 1) != 0) {
            return 1;
        }
        return (i7 & 4) == 4 ? 3 : 2;
    }
}
