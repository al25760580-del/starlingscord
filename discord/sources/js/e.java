package js;

import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.ByteString;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Buffer f14114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f14116c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f14117d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c[] f14118e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f14119f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f14120g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f14121h;

    public e(Buffer out) {
        Intrinsics.checkNotNullParameter(out, "out");
        this.f14114a = out;
        this.f14115b = Integer.MAX_VALUE;
        this.f14117d = RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
        this.f14118e = new c[8];
        this.f14119f = 7;
    }

    public final void a(int i7) {
        int i10;
        if (i7 > 0) {
            int length = this.f14118e.length - 1;
            int i11 = 0;
            while (true) {
                i10 = this.f14119f;
                if (length < i10 || i7 <= 0) {
                    break;
                }
                c cVar = this.f14118e[length];
                Intrinsics.checkNotNull(cVar);
                i7 -= cVar.f14106c;
                int i12 = this.f14121h;
                c cVar2 = this.f14118e[length];
                Intrinsics.checkNotNull(cVar2);
                this.f14121h = i12 - cVar2.f14106c;
                this.f14120g--;
                i11++;
                length--;
            }
            c[] cVarArr = this.f14118e;
            int i13 = i10 + 1;
            System.arraycopy(cVarArr, i13, cVarArr, i13 + i11, this.f14120g);
            c[] cVarArr2 = this.f14118e;
            int i14 = this.f14119f + 1;
            Arrays.fill(cVarArr2, i14, i14 + i11, (Object) null);
            this.f14119f += i11;
        }
    }

    public final void b(c cVar) {
        int i7 = cVar.f14106c;
        int i10 = this.f14117d;
        if (i7 > i10) {
            c[] cVarArr = this.f14118e;
            kotlin.collections.w.k(cVarArr, null, 0, cVarArr.length);
            this.f14119f = this.f14118e.length - 1;
            this.f14120g = 0;
            this.f14121h = 0;
            return;
        }
        a((this.f14121h + i7) - i10);
        int i11 = this.f14120g + 1;
        c[] cVarArr2 = this.f14118e;
        if (i11 > cVarArr2.length) {
            c[] cVarArr3 = new c[cVarArr2.length * 2];
            System.arraycopy(cVarArr2, 0, cVarArr3, cVarArr2.length, cVarArr2.length);
            this.f14119f = this.f14118e.length - 1;
            this.f14118e = cVarArr3;
        }
        int i12 = this.f14119f;
        this.f14119f = i12 - 1;
        this.f14118e[i12] = cVar;
        this.f14120g++;
        this.f14121h += i7;
    }

    public final void c(ByteString source) throws EOFException {
        Intrinsics.checkNotNullParameter(source, "data");
        int[] iArr = y.f14203a;
        Intrinsics.checkNotNullParameter(source, "bytes");
        int iC = source.c();
        long j = 0;
        int i7 = 0;
        long j5 = 0;
        int i10 = 0;
        while (i10 < iC) {
            int i11 = i10 + 1;
            byte bF = source.f(i10);
            byte[] bArr = ds.b.f7815a;
            j5 += (long) y.f14204b[bF & 255];
            i10 = i11;
        }
        int i12 = (int) ((j5 + ((long) 7)) >> 3);
        int iC2 = source.c();
        Buffer buffer = this.f14114a;
        if (i12 >= iC2) {
            e(source.c(), 127, 0);
            buffer.T(source);
            return;
        }
        Buffer sink = new Buffer();
        int[] iArr2 = y.f14203a;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(sink, "sink");
        int iC3 = source.c();
        int i13 = 0;
        while (i7 < iC3) {
            int i14 = i7 + 1;
            byte bF2 = source.f(i7);
            byte[] bArr2 = ds.b.f7815a;
            int i15 = bF2 & 255;
            int i16 = y.f14203a[i15];
            byte b10 = y.f14204b[i15];
            j = (j << b10) | ((long) i16);
            i13 += b10;
            while (i13 >= 8) {
                i13 -= 8;
                sink.U((int) (j >> i13));
            }
            i7 = i14;
        }
        if (i13 > 0) {
            sink.U((int) ((j << (8 - i13)) | (255 >>> i13)));
        }
        ByteString byteStringM = sink.m(sink.f17413e);
        e(byteStringM.c(), 127, IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        buffer.T(byteStringM);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0070  */
    public final void d(ArrayList headerBlock) throws EOFException {
        int length;
        int length2;
        Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
        if (this.f14116c) {
            int i7 = this.f14115b;
            if (i7 < this.f14117d) {
                e(i7, 31, 32);
            }
            this.f14116c = false;
            this.f14115b = Integer.MAX_VALUE;
            e(this.f14117d, 31, 32);
        }
        int size = headerBlock.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            c cVar = (c) headerBlock.get(i10);
            ByteString byteStringI = cVar.f14104a.i();
            ByteString byteString = cVar.f14105b;
            Integer num = (Integer) f.f14123b.get(byteStringI);
            if (num != null) {
                int iIntValue = num.intValue();
                length2 = iIntValue + 1;
                if (2 > length2 || length2 >= 8) {
                    length = length2;
                    length2 = -1;
                } else {
                    c[] cVarArr = f.f14122a;
                    if (Intrinsics.areEqual(cVarArr[iIntValue].f14105b, byteString)) {
                        length = length2;
                    } else if (Intrinsics.areEqual(cVarArr[length2].f14105b, byteString)) {
                        length2 = iIntValue + 2;
                        length = length2;
                    } else {
                        length = length2;
                        length2 = -1;
                    }
                }
            } else {
                length = -1;
                length2 = -1;
            }
            if (length2 == -1) {
                int i12 = this.f14119f + 1;
                int length3 = this.f14118e.length;
                while (i12 < length3) {
                    int i13 = i12 + 1;
                    c cVar2 = this.f14118e[i12];
                    Intrinsics.checkNotNull(cVar2);
                    if (Intrinsics.areEqual(cVar2.f14104a, byteStringI)) {
                        c cVar3 = this.f14118e[i12];
                        Intrinsics.checkNotNull(cVar3);
                        if (Intrinsics.areEqual(cVar3.f14105b, byteString)) {
                            length2 = f.f14122a.length + (i12 - this.f14119f);
                            break;
                        } else if (length == -1) {
                            length = f.f14122a.length + (i12 - this.f14119f);
                        }
                    }
                    i12 = i13;
                }
            }
            if (length2 != -1) {
                e(length2, 127, IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
            } else if (length == -1) {
                this.f14114a.U(64);
                c(byteStringI);
                c(byteString);
                b(cVar);
            } else {
                ByteString prefix = c.f14098d;
                byteStringI.getClass();
                Intrinsics.checkNotNullParameter(prefix, "prefix");
                if (!byteStringI.h(prefix, prefix.c()) || Intrinsics.areEqual(c.f14103i, byteStringI)) {
                    e(length, 63, 64);
                    c(byteString);
                    b(cVar);
                } else {
                    e(length, 15, 0);
                    c(byteString);
                }
            }
            i10 = i11;
        }
    }

    public final void e(int i7, int i10, int i11) {
        Buffer buffer = this.f14114a;
        if (i7 < i10) {
            buffer.U(i7 | i11);
            return;
        }
        buffer.U(i11 | i10);
        int i12 = i7 - i10;
        while (i12 >= 128) {
            buffer.U(128 | (i12 & 127));
            i12 >>>= 7;
        }
        buffer.U(i12);
    }
}
