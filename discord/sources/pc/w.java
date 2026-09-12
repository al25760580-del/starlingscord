package pc;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f17933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17934c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f17935d;

    public w(int i7, int i10, int i11, byte[] bArr) {
        this.f17932a = i7;
        this.f17933b = bArr;
        this.f17934c = i10;
        this.f17935d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w.class == obj.getClass()) {
            w wVar = (w) obj;
            if (this.f17932a == wVar.f17932a && this.f17934c == wVar.f17934c && this.f17935d == wVar.f17935d && Arrays.equals(this.f17933b, wVar.f17933b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f17933b) + (this.f17932a * 31)) * 31) + this.f17934c) * 31) + this.f17935d;
    }
}
