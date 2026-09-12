package hj;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.io.FileInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f10850b;

    public j(int i7, String str) {
        this.f10849a = i7;
        this.f10850b = str;
    }

    public static int o(int i7, FileInputStream fileInputStream) throws IOException {
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 0) {
            return i7;
        }
        int i10 = i7 & 127;
        int i11 = 7;
        while (i11 < 32) {
            int i12 = fileInputStream.read();
            if (i12 == -1) {
                throw v.e();
            }
            i10 |= (i12 & 127) << i11;
            if ((i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 0) {
                return i10;
            }
            i11 += 7;
        }
        while (i11 < 64) {
            int i13 = fileInputStream.read();
            if (i13 == -1) {
                throw v.e();
            }
            if ((i13 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 0) {
                return i10;
            }
            i11 += 7;
        }
        throw v.c();
    }

    public abstract void a(int i7);

    public abstract int b();

    public abstract boolean c();

    public abstract void d(int i7);

    public abstract int e(int i7);

    public abstract boolean f();

    public abstract g g();

    public abstract double h();

    public abstract int i();

    public abstract int j();

    public abstract long k();

    public abstract float l();

    public abstract int m();

    public abstract long n();

    public abstract int p();

    public abstract long q();

    public abstract int r();

    public abstract long s();

    public abstract String t();

    public abstract String u();

    public abstract int v();

    public abstract int w();

    public abstract long x();

    public abstract boolean y(int i7);

    public void z() {
        boolean zY;
        do {
            int iV = v();
            if (iV == 0) {
                return;
            }
            int i7 = this.f10849a;
            if (i7 >= 100) {
                throw new v("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.f10849a = i7 + 1;
            zY = y(iV);
            this.f10849a--;
        } while (zY);
    }
}
