package pc;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import gc.g0;
import java.util.Collections;
import je.e0;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17911c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f17912d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f17913e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f17914f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f17915g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f17916h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f17917i;
    public final long j;
    public final e4.r k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Metadata f17918l;

    public p(byte[] bArr, int i7) {
        je.v vVar = new je.v(bArr, bArr.length);
        vVar.p(i7 * 8);
        this.f17909a = vVar.i(16);
        this.f17910b = vVar.i(16);
        this.f17911c = vVar.i(24);
        this.f17912d = vVar.i(24);
        int i10 = vVar.i(20);
        this.f17913e = i10;
        this.f17914f = d(i10);
        this.f17915g = vVar.i(3) + 1;
        int i11 = vVar.i(5) + 1;
        this.f17916h = i11;
        this.f17917i = a(i11);
        int i12 = vVar.i(4);
        int i13 = vVar.i(32);
        int i14 = e0.f13788a;
        this.j = ((((long) i12) & 4294967295L) << 32) | (((long) i13) & 4294967295L);
        this.k = null;
        this.f17918l = null;
    }

    public static int a(int i7) {
        if (i7 == 8) {
            return 1;
        }
        if (i7 == 12) {
            return 2;
        }
        if (i7 == 16) {
            return 4;
        }
        if (i7 != 20) {
            return i7 != 24 ? -1 : 6;
        }
        return 5;
    }

    public static int d(int i7) {
        switch (i7) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long b() {
        long j = this.j;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / ((long) this.f17913e);
    }

    public final Format c(byte[] bArr, Metadata metadata) {
        bArr[4] = ByteCompanionObject.MIN_VALUE;
        int i7 = this.f17912d;
        if (i7 <= 0) {
            i7 = -1;
        }
        Metadata metadata2 = this.f17918l;
        if (metadata2 != null) {
            metadata = metadata == null ? metadata2 : metadata2.a(metadata.f5693d);
        }
        g0 g0Var = new g0();
        g0Var.k = "audio/flac";
        g0Var.f9644l = i7;
        g0Var.f9656x = this.f17915g;
        g0Var.f9657y = this.f17913e;
        g0Var.f9645m = Collections.singletonList(bArr);
        g0Var.f9643i = metadata;
        return new Format(g0Var);
    }

    public p(int i7, int i10, int i11, int i12, int i13, int i14, int i15, long j, e4.r rVar, Metadata metadata) {
        this.f17909a = i7;
        this.f17910b = i10;
        this.f17911c = i11;
        this.f17912d = i12;
        this.f17913e = i13;
        this.f17914f = d(i13);
        this.f17915g = i14;
        this.f17916h = i15;
        this.f17917i = a(i15);
        this.j = j;
        this.k = rVar;
        this.f17918l = metadata;
    }
}
