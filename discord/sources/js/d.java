package js;

import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.ByteString;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f14108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rs.p f14109c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c[] f14110d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f14111e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f14112f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f14113g;

    public d(s source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f14107a = RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
        this.f14108b = new ArrayList();
        this.f14109c = rs.v.d(source);
        this.f14110d = new c[8];
        this.f14111e = 7;
    }

    public final int a(int i7) {
        int i10;
        int i11 = 0;
        if (i7 > 0) {
            int length = this.f14110d.length;
            while (true) {
                length--;
                i10 = this.f14111e;
                if (length < i10 || i7 <= 0) {
                    break;
                }
                c cVar = this.f14110d[length];
                Intrinsics.checkNotNull(cVar);
                int i12 = cVar.f14106c;
                i7 -= i12;
                this.f14113g -= i12;
                this.f14112f--;
                i11++;
            }
            c[] cVarArr = this.f14110d;
            System.arraycopy(cVarArr, i10 + 1, cVarArr, i10 + 1 + i11, this.f14112f);
            this.f14111e += i11;
        }
        return i11;
    }

    public final ByteString b(int i7) throws IOException {
        if (i7 >= 0) {
            c[] cVarArr = f.f14122a;
            if (i7 <= cVarArr.length - 1) {
                return cVarArr[i7].f14104a;
            }
        }
        int length = this.f14111e + 1 + (i7 - f.f14122a.length);
        if (length >= 0) {
            c[] cVarArr2 = this.f14110d;
            if (length < cVarArr2.length) {
                c cVar = cVarArr2[length];
                Intrinsics.checkNotNull(cVar);
                return cVar.f14104a;
            }
        }
        throw new IOException(Intrinsics.stringPlus("Header index too large ", Integer.valueOf(i7 + 1)));
    }

    public final void c(c cVar) {
        this.f14108b.add(cVar);
        int i7 = cVar.f14106c;
        int i10 = this.f14107a;
        if (i7 > i10) {
            c[] cVarArr = this.f14110d;
            kotlin.collections.w.k(cVarArr, null, 0, cVarArr.length);
            this.f14111e = this.f14110d.length - 1;
            this.f14112f = 0;
            this.f14113g = 0;
            return;
        }
        a((this.f14113g + i7) - i10);
        int i11 = this.f14112f + 1;
        c[] cVarArr2 = this.f14110d;
        if (i11 > cVarArr2.length) {
            c[] cVarArr3 = new c[cVarArr2.length * 2];
            System.arraycopy(cVarArr2, 0, cVarArr3, cVarArr2.length, cVarArr2.length);
            this.f14111e = this.f14110d.length - 1;
            this.f14110d = cVarArr3;
        }
        int i12 = this.f14111e;
        this.f14111e = i12 - 1;
        this.f14110d[i12] = cVar;
        this.f14112f++;
        this.f14113g += i7;
    }

    public final ByteString d() {
        rs.p source = this.f14109c;
        byte b10 = source.readByte();
        byte[] bArr = ds.b.f7815a;
        int i7 = b10 & 255;
        int i10 = 0;
        boolean z5 = (b10 & ByteCompanionObject.MIN_VALUE) == 128;
        long jE = e(i7, 127);
        if (!z5) {
            return source.m(jE);
        }
        Buffer sink = new Buffer();
        int[] iArr = y.f14203a;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(sink, "sink");
        a5.g gVar = y.f14205c;
        a5.g gVar2 = gVar;
        long j = 0;
        int i11 = 0;
        while (j < jE) {
            j++;
            byte b11 = source.readByte();
            byte[] bArr2 = ds.b.f7815a;
            i10 = (i10 << 8) | (b11 & 255);
            i11 += 8;
            while (i11 >= 8) {
                a5.g[] gVarArr = (a5.g[]) gVar2.f186i;
                Intrinsics.checkNotNull(gVarArr);
                gVar2 = gVarArr[(i10 >>> (i11 - 8)) & 255];
                Intrinsics.checkNotNull(gVar2);
                if (((a5.g[]) gVar2.f186i) == null) {
                    sink.U(gVar2.f184d);
                    i11 -= gVar2.f185e;
                    gVar2 = gVar;
                } else {
                    i11 -= 8;
                }
            }
        }
        while (i11 > 0) {
            a5.g[] gVarArr2 = (a5.g[]) gVar2.f186i;
            Intrinsics.checkNotNull(gVarArr2);
            a5.g gVar3 = gVarArr2[(i10 << (8 - i11)) & 255];
            Intrinsics.checkNotNull(gVar3);
            a5.g[] gVarArr3 = (a5.g[]) gVar3.f186i;
            int i12 = gVar3.f185e;
            if (gVarArr3 != null || i12 > i11) {
                break;
            }
            sink.U(gVar3.f184d);
            i11 -= i12;
            gVar2 = gVar;
        }
        return sink.m(sink.f17413e);
    }

    public final int e(int i7, int i10) {
        int i11 = i7 & i10;
        if (i11 < i10) {
            return i11;
        }
        int i12 = 0;
        while (true) {
            byte b10 = this.f14109c.readByte();
            byte[] bArr = ds.b.f7815a;
            int i13 = b10 & 255;
            if ((b10 & ByteCompanionObject.MIN_VALUE) == 0) {
                return i10 + (i13 << i12);
            }
            i10 += (b10 & ByteCompanionObject.MAX_VALUE) << i12;
            i12 += 7;
        }
    }
}
