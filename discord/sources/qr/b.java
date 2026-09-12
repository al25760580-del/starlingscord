package qr;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements CharSequence {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final char[] f18996d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18997e;

    public b(char[] buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        this.f18996d = buffer;
        this.f18997e = buffer.length;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i7) {
        return this.f18996d[i7];
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f18997e;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i7, int i10) {
        return kotlin.text.x.f(this.f18996d, i7, Math.min(i10, this.f18997e));
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        int i7 = this.f18997e;
        return kotlin.text.x.f(this.f18996d, 0, Math.min(i7, i7));
    }
}
