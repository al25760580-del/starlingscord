package androidx.fragment.app;

import android.util.Log;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.io.Writer;

/* JADX INFO: loaded from: classes.dex */
public final class u1 extends Writer {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final StringBuilder f2258e = new StringBuilder(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f2257d = "FragmentManager";

    public final void c() {
        StringBuilder sb2 = this.f2258e;
        if (sb2.length() > 0) {
            Log.d(this.f2257d, sb2.toString());
            sb2.delete(0, sb2.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        c();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        c();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i7, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            char c8 = cArr[i7 + i11];
            if (c8 == '\n') {
                c();
            } else {
                this.f2258e.append(c8);
            }
        }
    }
}
