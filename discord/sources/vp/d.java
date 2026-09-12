package vp;

import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.Stack;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d implements Iterable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t f21871d = new t(new byte[0]);

    public static d a(Iterator it, int i7) {
        if (i7 == 1) {
            return (d) it.next();
        }
        int i10 = i7 >>> 1;
        return a(it, i10).b(a(it, i7 - i10));
    }

    public static c k() {
        return new c();
    }

    public final d b(d dVar) {
        int size = size();
        int size2 = dVar.size();
        if (((long) size) + ((long) size2) >= 2147483647L) {
            StringBuilder sb2 = new StringBuilder(53);
            sb2.append("ByteString would be too long: ");
            sb2.append(size);
            sb2.append("+");
            sb2.append(size2);
            throw new IllegalArgumentException(sb2.toString());
        }
        int[] iArr = x.E;
        x xVar = this instanceof x ? (x) this : null;
        if (dVar.size() == 0) {
            return this;
        }
        if (size() == 0) {
            return dVar;
        }
        int size3 = dVar.size() + size();
        if (size3 < 128) {
            int size4 = size();
            int size5 = dVar.size();
            byte[] bArr = new byte[size4 + size5];
            d(0, 0, size4, bArr);
            dVar.d(0, size4, size5, bArr);
            return new t(bArr);
        }
        if (xVar != null) {
            d dVar2 = xVar.f21926v;
            if (dVar.size() + dVar2.size() < 128) {
                int size6 = dVar2.size();
                int size7 = dVar.size();
                byte[] bArr2 = new byte[size6 + size7];
                dVar2.d(0, 0, size6, bArr2);
                dVar.d(0, size6, size7, bArr2);
                return new x(xVar.f21925i, new t(bArr2));
            }
        }
        if (xVar != null) {
            d dVar3 = xVar.f21926v;
            d dVar4 = xVar.f21925i;
            if (dVar4.h() > dVar3.h() && xVar.f21928x > dVar.h()) {
                return new x(dVar4, new x(dVar3, dVar));
            }
        }
        if (size3 >= x.E[Math.max(h(), dVar.h()) + 1]) {
            return new x(this, dVar);
        }
        pc.r rVar = new pc.r(10);
        rVar.g(this);
        rVar.g(dVar);
        Stack stack = (Stack) rVar.f17922d;
        d xVar2 = (d) stack.pop();
        while (!stack.isEmpty()) {
            xVar2 = new x((d) stack.pop(), xVar2);
        }
        return xVar2;
    }

    public final void d(int i7, int i10, int i11, byte[] bArr) {
        if (i7 < 0) {
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Source offset < 0: ");
            sb2.append(i7);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (i10 < 0) {
            StringBuilder sb3 = new StringBuilder(30);
            sb3.append("Target offset < 0: ");
            sb3.append(i10);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        if (i11 < 0) {
            StringBuilder sb4 = new StringBuilder(23);
            sb4.append("Length < 0: ");
            sb4.append(i11);
            throw new IndexOutOfBoundsException(sb4.toString());
        }
        int i12 = i7 + i11;
        if (i12 > size()) {
            StringBuilder sb5 = new StringBuilder(34);
            sb5.append("Source end offset < 0: ");
            sb5.append(i12);
            throw new IndexOutOfBoundsException(sb5.toString());
        }
        int i13 = i10 + i11;
        if (i13 <= bArr.length) {
            if (i11 > 0) {
                e(i7, i10, i11, bArr);
            }
        } else {
            StringBuilder sb6 = new StringBuilder(34);
            sb6.append("Target end offset < 0: ");
            sb6.append(i13);
            throw new IndexOutOfBoundsException(sb6.toString());
        }
    }

    public abstract void e(int i7, int i10, int i11, byte[] bArr);

    public abstract int h();

    public abstract boolean i();

    public abstract boolean j();

    public abstract int m(int i7, int i10, int i11);

    public abstract int o(int i7, int i10, int i11);

    public abstract int p();

    public abstract String r();

    public final String s() {
        try {
            return r();
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("UTF-8 not supported?", e10);
        }
    }

    public abstract int size();

    public abstract void t(OutputStream outputStream, int i7, int i10);

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }
}
