package w4;

import ag.a1;
import androidx.datastore.preferences.protobuf.d1;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import io.sentry.internal.debugmeta.c;
import java.io.Closeable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements Closeable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String[] f22063w = new String[IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f22064d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f22065e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String[] f22066i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int[] f22067v;

    static {
        for (int i7 = 0; i7 <= 31; i7++) {
            f22063w[i7] = String.format("\\u%04x", Integer.valueOf(i7));
        }
        String[] strArr = f22063w;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public abstract int B();

    public final void O(int i7) {
        int i10 = this.f22064d;
        int[] iArr = this.f22065e;
        if (i10 == iArr.length) {
            if (i10 == 256) {
                throw new d1("Nesting too deep at " + l());
            }
            this.f22065e = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f22066i;
            this.f22066i = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f22067v;
            this.f22067v = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f22065e;
        int i11 = this.f22064d;
        this.f22064d = i11 + 1;
        iArr3[i11] = i7;
    }

    public abstract int P(c cVar);

    public abstract void Q();

    public abstract void T();

    public final void U(String str) throws a1 {
        StringBuilder sbO = kk.b.o(str, " at path ");
        sbO.append(l());
        throw new a1(sbO.toString());
    }

    public abstract void c();

    public abstract void f();

    public abstract void g();

    public abstract void i();

    public final String l() {
        int i7 = this.f22064d;
        int[] iArr = this.f22065e;
        String[] strArr = this.f22066i;
        int[] iArr2 = this.f22067v;
        StringBuilder sb2 = new StringBuilder("$");
        for (int i10 = 0; i10 < i7; i10++) {
            int i11 = iArr[i10];
            if (i11 == 1 || i11 == 2) {
                sb2.append('[');
                sb2.append(iArr2[i10]);
                sb2.append(']');
            } else if (i11 == 3 || i11 == 4 || i11 == 5) {
                sb2.append('.');
                String str = strArr[i10];
                if (str != null) {
                    sb2.append(str);
                }
            }
        }
        return sb2.toString();
    }

    public abstract boolean n();

    public abstract boolean q();

    public abstract double u();

    public abstract int y();

    public abstract String z();
}
