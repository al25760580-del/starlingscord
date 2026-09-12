package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f1938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f1940c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1941d;

    public u0(s sVar, String str, Object[] objArr) {
        this.f1938a = sVar;
        this.f1939b = str;
        this.f1940c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f1941d = cCharAt;
            return;
        }
        int i7 = cCharAt & 8191;
        int i10 = 13;
        int i11 = 1;
        while (true) {
            int i12 = i11 + 1;
            char cCharAt2 = str.charAt(i11);
            if (cCharAt2 < 55296) {
                this.f1941d = i7 | (cCharAt2 << i10);
                return;
            } else {
                i7 |= (cCharAt2 & 8191) << i10;
                i10 += 13;
                i11 = i12;
            }
        }
    }
}
