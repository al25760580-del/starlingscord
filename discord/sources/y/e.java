package y;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.collections.e0;
import kotlin.collections.w;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.markers.KMappedMarker;
import xq.l;
import xr.m;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Iterable, KMappedMarker {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final e f23106w = new e(0, 0, 0, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f23107d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f23108e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f23109i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long[] f23110v;

    public e(long j, long j5, long j7, long[] jArr) {
        this.f23107d = j;
        this.f23108e = j5;
        this.f23109i = j7;
        this.f23110v = jArr;
    }

    public final boolean a(long j) {
        long[] jArr;
        long j5 = j - this.f23109i;
        long j7 = 0;
        if (Intrinsics.compare(j5, j7) >= 0 && Intrinsics.compare(j5, 64) < 0) {
            return ((1 << ((int) j5)) & this.f23108e) != 0;
        }
        if (Intrinsics.compare(j5, 64) < 0 || Intrinsics.compare(j5, IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) >= 0) {
            return Intrinsics.compare(j5, j7) <= 0 && (jArr = this.f23110v) != null && m.b(jArr, j) >= 0;
        }
        return ((1 << (((int) j5) - 64)) & this.f23107d) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0141  */
    public final e b(long j) {
        long[] jArr;
        long j5;
        long j7;
        long[] jArr2;
        long[] jArr3;
        long j10 = this.f23109i;
        long j11 = j - j10;
        long j12 = 0;
        int iCompare = Intrinsics.compare(j11, j12);
        long j13 = this.f23108e;
        int i7 = 64;
        if (iCompare < 0 || Intrinsics.compare(j11, 64) >= 0) {
            long j14 = 64;
            int iCompare2 = Intrinsics.compare(j11, j14);
            long j15 = this.f23107d;
            if (iCompare2 < 0 || Intrinsics.compare(j11, IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) >= 0) {
                long j16 = IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                int iCompare3 = Intrinsics.compare(j11, j16);
                long[] jArr4 = this.f23110v;
                if (iCompare3 < 0) {
                    if (jArr4 == null) {
                        return new e(this.f23107d, this.f23108e, this.f23109i, new long[]{j});
                    }
                    int iB = m.b(jArr4, j);
                    if (iB < 0) {
                        int i10 = -(iB + 1);
                        int length = jArr4.length;
                        long[] jArr5 = new long[length + 1];
                        w.f(jArr4, jArr5, 0, 0, i10);
                        w.f(jArr4, jArr5, i10 + 1, i10, length);
                        jArr5[i10] = j;
                        return new e(this.f23107d, this.f23108e, this.f23109i, jArr5);
                    }
                } else if (!a(j)) {
                    long j17 = 1;
                    long j18 = ((j + j17) / j14) * j14;
                    long[] jArr6 = jArr4;
                    if (Intrinsics.compare(j18, j12) < 0) {
                        j18 = (LongCompanionObject.MAX_VALUE - j16) + j17;
                    }
                    long j19 = j15;
                    long j20 = j10;
                    pf.b bVar = null;
                    while (true) {
                        if (Intrinsics.compare(j20, j18) >= 0) {
                            jArr = jArr6;
                            j5 = j13;
                            j7 = j20;
                            break;
                        }
                        if (j13 != 0) {
                            if (bVar == null) {
                                jArr = jArr6;
                                bVar = new pf.b(jArr);
                            } else {
                                jArr = jArr6;
                            }
                            int i11 = 0;
                            while (i11 < i7) {
                                long j21 = j20;
                                if ((j13 & (1 << i11)) != 0) {
                                    long j22 = j21 + ((long) i11);
                                    s.m mVar = (s.m) bVar.f18027e;
                                    int i12 = mVar.f19634b + 1;
                                    long[] jArr7 = mVar.f19633a;
                                    if (jArr7.length < i12) {
                                        long[] jArrCopyOf = Arrays.copyOf(jArr7, Math.max(i12, (jArr7.length * 3) / 2));
                                        Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
                                        mVar.f19633a = jArrCopyOf;
                                    }
                                    long[] jArr8 = mVar.f19633a;
                                    int i13 = mVar.f19634b;
                                    jArr8[i13] = j22;
                                    mVar.f19634b = i13 + 1;
                                }
                                i11++;
                                j20 = j21;
                                i7 = 64;
                            }
                        } else {
                            jArr = jArr6;
                        }
                        long j23 = j20;
                        if (j19 == 0) {
                            j7 = j18;
                            j5 = 0;
                            break;
                        }
                        j20 = j23 + j14;
                        jArr6 = jArr;
                        j13 = j19;
                        i7 = 64;
                        j19 = 0;
                    }
                    if (bVar == null) {
                        jArr2 = jArr;
                    } else {
                        s.m mVar2 = (s.m) bVar.f18027e;
                        int i14 = mVar2.f19634b;
                        if (i14 == 0) {
                            jArr3 = null;
                        } else {
                            long[] jArr9 = new long[i14];
                            long[] jArr10 = mVar2.f19633a;
                            for (int i15 = 0; i15 < i14; i15++) {
                                jArr9[i15] = jArr10[i15];
                            }
                            jArr3 = jArr9;
                        }
                        if (jArr3 == null) {
                            jArr2 = jArr;
                        } else {
                            jArr2 = jArr3;
                        }
                    }
                    return new e(j19, j5, j7, jArr2).b(j);
                }
            } else {
                long j24 = 1 << (((int) j11) - 64);
                if ((j15 & j24) == 0) {
                    return new e(j15 | j24, this.f23108e, this.f23109i, this.f23110v);
                }
            }
        } else {
            long j25 = 1 << ((int) j11);
            if ((j13 & j25) == 0) {
                return new e(this.f23107d, j13 | j25, this.f23109i, this.f23110v);
            }
        }
        return this;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        d block = new d(this, null);
        Intrinsics.checkNotNullParameter(block, "block");
        return l.a(block);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(" [");
        ArrayList arrayList = new ArrayList(e0.l(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append((CharSequence) "");
        int size = arrayList.size();
        int i7 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = arrayList.get(i10);
            i7++;
            if (i7 > 1) {
                sb3.append((CharSequence) ", ");
            }
            if (obj != null ? obj instanceof CharSequence : true) {
                sb3.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb3.append(((Character) obj).charValue());
            } else {
                sb3.append((CharSequence) obj.toString());
            }
        }
        sb3.append((CharSequence) "");
        sb2.append(sb3.toString());
        sb2.append(']');
        return sb2.toString();
    }
}
