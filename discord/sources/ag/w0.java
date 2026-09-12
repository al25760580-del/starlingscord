package ag;

import com.google.android.gms.internal.play_billing.t1;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class w0 implements Iterator {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f590d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f591e = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f592i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Iterable f593v;

    public w0(y0 y0Var) {
        this.f593v = y0Var;
        this.f592i = y0Var.e();
    }

    public byte a() {
        try {
            byte[] bArr = ((vp.t) this.f593v).f21919e;
            int i7 = this.f591e;
            this.f591e = i7 + 1;
            return bArr[i7];
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f590d) {
            case 0:
                return this.f591e < this.f592i;
            case 1:
                return this.f591e < this.f592i;
            case 2:
                return this.f591e < this.f592i;
            case 3:
                return this.f591e < this.f592i;
            default:
                return this.f591e < this.f592i;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f590d) {
            case 0:
                int i7 = this.f591e;
                if (i7 >= this.f592i) {
                    throw new NoSuchElementException();
                }
                this.f591e = i7 + 1;
                return Byte.valueOf(((y0) this.f593v).b(i7));
            case 1:
                int i10 = this.f591e;
                if (i10 >= this.f592i) {
                    throw new NoSuchElementException();
                }
                this.f591e = i10 + 1;
                return Byte.valueOf(((androidx.datastore.preferences.protobuf.e) this.f593v).f1838e[i10]);
            case 2:
                int i11 = this.f591e;
                if (i11 >= this.f592i) {
                    throw new NoSuchElementException();
                }
                this.f591e = i11 + 1;
                return Byte.valueOf(((t1) this.f593v).a(i11));
            case 3:
                int i12 = this.f591e;
                if (i12 >= this.f592i) {
                    throw new NoSuchElementException();
                }
                this.f591e = i12 + 1;
                return Byte.valueOf(((hj.g) this.f593v).h(i12));
            default:
                return Byte.valueOf(a());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f590d) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            case 3:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public w0(t1 t1Var) {
        this.f593v = t1Var;
        this.f592i = t1Var.d();
    }

    public w0(hj.g gVar) {
        this.f593v = gVar;
        this.f592i = gVar.size();
    }

    public w0(androidx.datastore.preferences.protobuf.e eVar) {
        this.f593v = eVar;
        this.f592i = eVar.size();
    }

    public w0(vp.t tVar) {
        this.f593v = tVar;
        this.f592i = tVar.f21919e.length;
    }
}
