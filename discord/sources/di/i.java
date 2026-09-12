package di;

import java.util.Iterator;
import java.util.NoSuchElementException;
import ls.l;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements Iterator {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f7638e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CharSequence f7639i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final a f7640v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f7642x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ u4.c f7643y;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7637d = 2;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f7641w = 0;

    public i(u4.c cVar, a1.d dVar, CharSequence charSequence) {
        this.f7643y = cVar;
        this.f7640v = (a) dVar.f18i;
        this.f7642x = dVar.f17e;
        this.f7639i = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String string;
        a aVar;
        int i7 = this.f7637d;
        if (i7 == 4) {
            throw new IllegalStateException();
        }
        int iB = f0.e.b(i7);
        if (iB == 0) {
            return true;
        }
        if (iB == 2) {
            return false;
        }
        this.f7637d = 4;
        int i10 = this.f7641w;
        while (true) {
            int length = this.f7641w;
            if (length == -1) {
                this.f7637d = 3;
                string = null;
                break;
            }
            b bVar = (b) this.f7643y.f20946d;
            CharSequence charSequence = this.f7639i;
            int length2 = charSequence.length();
            l.g(length, length2);
            while (true) {
                if (length >= length2) {
                    length = -1;
                    break;
                }
                if (bVar.a(charSequence.charAt(length))) {
                    break;
                }
                length++;
            }
            if (length == -1) {
                length = charSequence.length();
                this.f7641w = -1;
            } else {
                this.f7641w = length + 1;
            }
            int i11 = this.f7641w;
            if (i11 != i10) {
                while (true) {
                    aVar = this.f7640v;
                    if (i10 >= length || !aVar.a(charSequence.charAt(i10))) {
                        break;
                    }
                    i10++;
                }
                while (length > i10 && aVar.a(charSequence.charAt(length - 1))) {
                    length--;
                }
                int i12 = this.f7642x;
                if (i12 == 1) {
                    length = charSequence.length();
                    this.f7641w = -1;
                    while (length > i10 && aVar.a(charSequence.charAt(length - 1))) {
                        length--;
                    }
                } else {
                    this.f7642x = i12 - 1;
                }
                string = charSequence.subSequence(i10, length).toString();
                break;
            }
            int i13 = i11 + 1;
            this.f7641w = i13;
            if (i13 > charSequence.length()) {
                this.f7641w = -1;
            }
        }
        this.f7638e = string;
        if (this.f7637d == 3) {
            return false;
        }
        this.f7637d = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f7637d = 2;
        String str = this.f7638e;
        this.f7638e = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
