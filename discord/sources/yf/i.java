package yf;

import a5.i0;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements Iterator {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f23328d;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f23330i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f23331v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f23333x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ h f23334y;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f23329e = 2;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f23332w = 0;

    public i(i0 i0Var, String str, h hVar) {
        this.f23334y = hVar;
        i0Var.getClass();
        this.f23331v = i0Var.f214e;
        this.f23333x = Integer.MAX_VALUE;
        this.f23330i = str;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i7;
        int i10 = this.f23329e;
        if (i10 == 4) {
            throw new IllegalStateException();
        }
        int i11 = i10 - 1;
        String string = null;
        if (i10 == 0) {
            throw null;
        }
        if (i11 == 0) {
            return true;
        }
        if (i11 != 2) {
            this.f23329e = 4;
            int i12 = this.f23332w;
            while (true) {
                int length = this.f23332w;
                if (length == -1) {
                    this.f23329e = 3;
                    break;
                }
                String str = this.f23330i;
                int length2 = str.length();
                android.support.v4.media.session.b.A(length, length2);
                while (true) {
                    if (length >= length2) {
                        length = -1;
                        break;
                    }
                    if (str.charAt(length) == this.f23334y.f23327a) {
                        break;
                    }
                    length++;
                }
                if (length == -1) {
                    length = str.length();
                    this.f23332w = -1;
                    i7 = -1;
                } else {
                    i7 = length + 1;
                    this.f23332w = i7;
                }
                if (i7 == i12) {
                    int i13 = i7 + 1;
                    this.f23332w = i13;
                    if (i13 > str.length()) {
                        this.f23332w = -1;
                    }
                } else {
                    if (i12 < length) {
                        str.charAt(i12);
                    }
                    if (i12 < length) {
                        str.charAt(length - 1);
                    }
                    if (!this.f23331v || i12 != length) {
                        int i14 = this.f23333x;
                        if (i14 == 1) {
                            length = str.length();
                            this.f23332w = -1;
                            if (length > i12) {
                                str.charAt(length - 1);
                            }
                        } else {
                            this.f23333x = i14 - 1;
                        }
                        string = str.subSequence(i12, length).toString();
                        break;
                    }
                    i12 = this.f23332w;
                }
            }
            this.f23328d = string;
            if (this.f23329e != 3) {
                this.f23329e = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f23329e = 2;
        String str = this.f23328d;
        this.f23328d = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
