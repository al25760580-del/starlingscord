package qr;

import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayDeque f19010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f19011b;

    public e(int i7) {
        switch (i7) {
            case 1:
                this.f19010a = new ArrayDeque();
                break;
            default:
                this.f19010a = new ArrayDeque();
                break;
        }
    }

    public void a(char[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        synchronized (this) {
            try {
                int i7 = this.f19011b;
                if (array.length + i7 < c.f18999a) {
                    this.f19011b = i7 + array.length;
                    this.f19010a.addLast(array);
                }
                Unit unit = Unit.f14616a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public char[] b(int i7) {
        char[] cArr;
        synchronized (this) {
            ArrayDeque arrayDeque = this.f19010a;
            cArr = null;
            char[] cArr2 = (char[]) (arrayDeque.isEmpty() ? null : arrayDeque.removeLast());
            if (cArr2 != null) {
                this.f19011b -= cArr2.length;
                cArr = cArr2;
            }
        }
        return cArr == null ? new char[i7] : cArr;
    }
}
