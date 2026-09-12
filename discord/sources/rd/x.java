package rd;

import android.text.TextUtils;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.exoplayer2.Format;
import gc.g0;
import gc.h1;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import je.b0;

/* JADX INFO: loaded from: classes3.dex */
public final class x implements pc.k {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Pattern f19352g = Pattern.compile("LOCAL:([^,]+)");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Pattern f19353h = Pattern.compile("MPEGTS:(-?\\d+)");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0 f19355b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public pc.m f19357d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f19359f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final je.w f19356c = new je.w();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f19358e = new byte[IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET];

    public x(String str, b0 b0Var) {
        this.f19354a = str;
        this.f19355b = b0Var;
    }

    public final pc.x a(long j) {
        pc.x xVarX = this.f19357d.x(0, 3);
        g0 g0Var = new g0();
        g0Var.k = "text/vtt";
        g0Var.f9637c = this.f19354a;
        g0Var.f9647o = j;
        xVarX.e(new Format(g0Var));
        this.f19357d.q();
        return xVarX;
    }

    @Override // pc.k
    public final int d(pc.l lVar, pc.n nVar) throws h1, EOFException, InterruptedIOException {
        String strH;
        this.f19357d.getClass();
        int i7 = (int) ((pc.h) lVar).f17894i;
        int i10 = this.f19359f;
        byte[] bArr = this.f19358e;
        int i11 = -1;
        if (i10 == bArr.length) {
            this.f19358e = Arrays.copyOf(bArr, ((i7 != -1 ? i7 : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.f19358e;
        int i12 = this.f19359f;
        int i13 = ((pc.h) lVar).read(bArr2, i12, bArr2.length - i12);
        if (i13 != -1) {
            int i14 = this.f19359f + i13;
            this.f19359f = i14;
            if (i7 == -1 || i14 != i7) {
                return 0;
            }
        }
        je.w wVar = new je.w(this.f19358e);
        ee.k.d(wVar);
        String strH2 = wVar.h(di.d.f7631c);
        long j = 0;
        long jC = 0;
        while (true) {
            int i15 = i11;
            Matcher matcher = null;
            if (TextUtils.isEmpty(strH2)) {
                while (true) {
                    String strH3 = wVar.h(di.d.f7631c);
                    if (strH3 == null) {
                        break;
                    }
                    if (ee.k.f8185a.matcher(strH3).matches()) {
                        do {
                            strH = wVar.h(di.d.f7631c);
                            if (strH == null) {
                                break;
                            }
                        } while (!strH.isEmpty());
                    } else {
                        Matcher matcher2 = ee.i.f8179a.matcher(strH3);
                        if (matcher2.matches()) {
                            matcher = matcher2;
                            break;
                        }
                    }
                }
                if (matcher == null) {
                    a(0L);
                    return i15;
                }
                String strGroup = matcher.group(1);
                strGroup.getClass();
                long jC2 = ee.k.c(strGroup);
                long jB = this.f19355b.b(((((j + jC2) - jC) * 90000) / 1000000) % 8589934592L);
                pc.x xVarA = a(jB - jC2);
                byte[] bArr3 = this.f19358e;
                int i16 = this.f19359f;
                je.w wVar2 = this.f19356c;
                wVar2.D(bArr3, i16);
                xVarA.d(this.f19359f, wVar2);
                xVarA.c(jB, 1, this.f19359f, 0, null);
                return i15;
            }
            if (strH2.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher3 = f19352g.matcher(strH2);
                if (!matcher3.find()) {
                    throw h1.a("X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(strH2), null);
                }
                Matcher matcher4 = f19353h.matcher(strH2);
                if (!matcher4.find()) {
                    throw h1.a("X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(strH2), null);
                }
                String strGroup2 = matcher3.group(1);
                strGroup2.getClass();
                jC = ee.k.c(strGroup2);
                String strGroup3 = matcher4.group(1);
                strGroup3.getClass();
                j = (Long.parseLong(strGroup3) * 1000000) / 90000;
            }
            strH2 = wVar.h(di.d.f7631c);
            i11 = i15;
        }
    }

    @Override // pc.k
    public final void e(pc.m mVar) {
        this.f19357d = mVar;
        mVar.c(new pc.o(-9223372036854775807L));
    }

    @Override // pc.k
    public final boolean f(pc.l lVar) {
        pc.h hVar = (pc.h) lVar;
        hVar.g(this.f19358e, 0, 6, false);
        byte[] bArr = this.f19358e;
        je.w wVar = this.f19356c;
        wVar.D(bArr, 6);
        if (ee.k.a(wVar)) {
            return true;
        }
        hVar.g(this.f19358e, 6, 3, false);
        wVar.D(this.f19358e, 9);
        return ee.k.a(wVar);
    }

    @Override // pc.k
    public final void g(long j, long j5) {
        throw new IllegalStateException();
    }

    @Override // pc.k
    public final void release() {
    }
}
