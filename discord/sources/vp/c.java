package vp;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends OutputStream {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final byte[] f21864x = new byte[0];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f21867i;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f21869w;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f21865d = IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f21866e = new ArrayList();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public byte[] f21868v = new byte[IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT];

    public final void c(int i7) {
        this.f21866e.add(new t(this.f21868v));
        int length = this.f21867i + this.f21868v.length;
        this.f21867i = length;
        this.f21868v = new byte[Math.max(this.f21865d, Math.max(i7, length >>> 1))];
        this.f21869w = 0;
    }

    public final void f() {
        int i7 = this.f21869w;
        byte[] bArr = this.f21868v;
        int length = bArr.length;
        ArrayList arrayList = this.f21866e;
        if (i7 >= length) {
            arrayList.add(new t(this.f21868v));
            this.f21868v = f21864x;
        } else if (i7 > 0) {
            byte[] bArr2 = new byte[i7];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i7));
            arrayList.add(new t(bArr2));
        }
        this.f21867i += this.f21869w;
        this.f21869w = 0;
    }

    public final synchronized d g() {
        ArrayList arrayList;
        f();
        arrayList = this.f21866e;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add((d) it.next());
            }
            arrayList = arrayList2;
        }
        return arrayList.isEmpty() ? d.f21871d : d.a(arrayList.iterator(), arrayList.size());
    }

    public final String toString() {
        int i7;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        synchronized (this) {
            i7 = this.f21867i + this.f21869w;
        }
        return String.format("<ByteString.Output@%s size=%d>", hexString, Integer.valueOf(i7));
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i7) {
        try {
            if (this.f21869w == this.f21868v.length) {
                c(1);
            }
            byte[] bArr = this.f21868v;
            int i10 = this.f21869w;
            this.f21869w = i10 + 1;
            bArr[i10] = (byte) i7;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i7, int i10) {
        try {
            byte[] bArr2 = this.f21868v;
            int length = bArr2.length;
            int i11 = this.f21869w;
            if (i10 <= length - i11) {
                System.arraycopy(bArr, i7, bArr2, i11, i10);
                this.f21869w += i10;
            } else {
                int length2 = bArr2.length - i11;
                System.arraycopy(bArr, i7, bArr2, i11, length2);
                int i12 = i10 - length2;
                c(i12);
                System.arraycopy(bArr, i7 + length2, this.f21868v, 0, i12);
                this.f21869w = i12;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
