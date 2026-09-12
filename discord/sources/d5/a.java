package d5;

import ag.t;
import androidx.recyclerview.widget.RecyclerView;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final t f7595e = new t(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f7597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7598c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f7599d;

    public a(int i7, ArrayList arrayList, int i10, InputStream inputStream) {
        this.f7596a = i7;
        this.f7597b = arrayList;
        this.f7598c = i10;
        this.f7599d = inputStream;
    }

    public synchronized byte[] a(int i7) {
        for (int i10 = 0; i10 < ((ArrayList) this.f7599d).size(); i10++) {
            byte[] bArr = (byte[]) ((ArrayList) this.f7599d).get(i10);
            if (bArr.length >= i7) {
                this.f7596a -= bArr.length;
                ((ArrayList) this.f7599d).remove(i10);
                this.f7597b.remove(bArr);
                return bArr;
            }
        }
        return new byte[i7];
    }

    public synchronized void b(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length <= this.f7598c) {
                this.f7597b.add(bArr);
                int iBinarySearch = Collections.binarySearch((ArrayList) this.f7599d, bArr, f7595e);
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 1;
                }
                ((ArrayList) this.f7599d).add(iBinarySearch, bArr);
                this.f7596a += bArr.length;
                synchronized (this) {
                    while (this.f7596a > this.f7598c) {
                        byte[] bArr2 = (byte[]) this.f7597b.remove(0);
                        ((ArrayList) this.f7599d).remove(bArr2);
                        this.f7596a -= bArr2.length;
                    }
                }
            }
        }
    }

    public a() {
        this.f7597b = new ArrayList();
        this.f7599d = new ArrayList(64);
        this.f7596a = 0;
        this.f7598c = RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
    }
}
