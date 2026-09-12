package kotlin.text;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements Iterator, KMappedMarker {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CharSequence f14728d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f14729e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f14730i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f14731v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f14732w;

    public k(CharSequence string) {
        Intrinsics.checkNotNullParameter(string, "string");
        this.f14728d = string;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i7;
        int i10;
        int i11 = this.f14729e;
        if (i11 != 0) {
            return i11 == 1;
        }
        if (this.f14732w < 0) {
            this.f14729e = 2;
            return false;
        }
        CharSequence charSequence = this.f14728d;
        int length = charSequence.length();
        int length2 = charSequence.length();
        for (int i12 = this.f14730i; i12 < length2; i12++) {
            char cCharAt = charSequence.charAt(i12);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i7 = (cCharAt == '\r' && (i10 = i12 + 1) < charSequence.length() && charSequence.charAt(i10) == '\n') ? 2 : 1;
                length = i12;
                this.f14729e = 1;
                this.f14732w = i7;
                this.f14731v = length;
                return true;
            }
        }
        i7 = -1;
        this.f14729e = 1;
        this.f14732w = i7;
        this.f14731v = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f14729e = 0;
        int i7 = this.f14731v;
        int i10 = this.f14730i;
        this.f14730i = this.f14732w + i7;
        return this.f14728d.subSequence(i10, i7).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
