package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
public final class w2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o1 f6176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f6178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6179d;

    public w2(o1 o1Var, String str, Object[] objArr) {
        this.f6176a = o1Var;
        this.f6177b = str;
        this.f6178c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f6179d = cCharAt;
            return;
        }
        int i7 = cCharAt & 8191;
        int i10 = 1;
        int i11 = 13;
        while (true) {
            int i12 = i10 + 1;
            char cCharAt2 = str.charAt(i10);
            if (cCharAt2 < 55296) {
                this.f6179d = i7 | (cCharAt2 << i11);
                return;
            } else {
                i7 |= (cCharAt2 & 8191) << i11;
                i11 += 13;
                i10 = i12;
            }
        }
    }

    public final int a() {
        int i7 = this.f6179d;
        if ((i7 & 1) != 0) {
            return 1;
        }
        return (i7 & 4) == 4 ? 3 : 2;
    }
}
