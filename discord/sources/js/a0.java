package js;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f14089b = new int[10];

    public final int a() {
        if ((this.f14088a & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
            return this.f14089b[7];
        }
        return 65535;
    }

    public final void b(a0 other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int i7 = 0;
        while (i7 < 10) {
            int i10 = i7 + 1;
            if (((1 << i7) & other.f14088a) != 0) {
                c(i7, other.f14089b[i7]);
            }
            i7 = i10;
        }
    }

    public final void c(int i7, int i10) {
        if (i7 >= 0) {
            int[] iArr = this.f14089b;
            if (i7 >= iArr.length) {
                return;
            }
            this.f14088a = (1 << i7) | this.f14088a;
            iArr[i7] = i10;
        }
    }
}
