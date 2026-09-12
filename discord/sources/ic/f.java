package ic;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.provider.Settings;
import android.util.Pair;
import com.google.android.exoplayer2.Format;
import ei.w0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f11500c = new f(10, new int[]{2});

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ei.r0 f11501d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final w0 f11502e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f11503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11504b;

    static {
        Object[] objArr = {2, 5, 6};
        ei.p.b(3, objArr);
        f11501d = ei.e0.j(3, objArr);
        a1.d dVar = new a1.d(4, 6);
        dVar.x(5, 6);
        dVar.x(17, 6);
        dVar.x(7, 6);
        dVar.x(30, 10);
        dVar.x(18, 6);
        dVar.x(6, 8);
        dVar.x(8, 8);
        dVar.x(14, 8);
        f11502e = dVar.b();
    }

    public f(int i7, int[] iArr) {
        if (iArr != null) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            this.f11503a = iArrCopyOf;
            Arrays.sort(iArrCopyOf);
        } else {
            this.f11503a = new int[0];
        }
        this.f11504b = i7;
    }

    public static f a(Context context) {
        return b(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
    }

    public static f b(Context context, Intent intent) {
        int i7 = je.e0.f13788a;
        if (i7 < 23 || !d.b(context)) {
            ei.g0 g0Var = new ei.g0();
            if (i7 >= 17) {
                String str = je.e0.f13790c;
                if (("Amazon".equals(str) || "Xiaomi".equals(str)) && Settings.Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) == 1) {
                    ei.r0 r0Var = f11501d;
                    r0Var.getClass();
                    g0Var.c(r0Var);
                }
            }
            if (i7 >= 29 && (je.e0.H(context) || (i7 >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")))) {
                ei.e0 e0VarA = e.a();
                e0VarA.getClass();
                g0Var.c(e0VarA);
                return new f(10, mo.c0.P(g0Var.f()));
            }
            if (intent != null && intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 1) {
                int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
                if (intArrayExtra != null) {
                    List aVar = intArrayExtra.length == 0 ? Collections.EMPTY_LIST : new gi.a(0, intArrayExtra.length, intArrayExtra);
                    aVar.getClass();
                    g0Var.c(aVar);
                }
                return new f(intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10), mo.c0.P(g0Var.f()));
            }
            ei.h0 h0VarF = g0Var.f();
            if (!h0VarF.isEmpty()) {
                return new f(10, mo.c0.P(h0VarF));
            }
        }
        return f11500c;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00a3  */
    public final Pair c(Format format) {
        int iIntValue;
        String str = format.I;
        str.getClass();
        int iC = je.o.c(str, format.F);
        Integer numValueOf = Integer.valueOf(iC);
        w0 w0Var = f11502e;
        if (w0Var.containsKey(numValueOf)) {
            int[] iArr = this.f11503a;
            int i7 = 6;
            if (iC == 18 && Arrays.binarySearch(iArr, 18) < 0) {
                iC = 6;
            } else if ((iC == 8 && Arrays.binarySearch(iArr, 8) < 0) || (iC == 30 && Arrays.binarySearch(iArr, 30) < 0)) {
                iC = 7;
            }
            if (Arrays.binarySearch(iArr, iC) < 0) {
                return null;
            }
            int i10 = format.V;
            if (i10 == -1 || iC == 18) {
                int i11 = format.W;
                if (i11 == -1) {
                    i11 = 48000;
                }
                if (je.e0.f13788a >= 29) {
                    iIntValue = e.b(iC, i11);
                } else {
                    Object obj = w0Var.get(Integer.valueOf(iC));
                    iIntValue = ((Integer) (obj != null ? obj : 0)).intValue();
                }
                i10 = iIntValue;
            } else if (!format.I.equals("audio/vnd.dts.uhd;profile=p2") ? i10 <= this.f11504b : i10 <= 10) {
            }
            int i12 = je.e0.f13788a;
            if (i12 > 28) {
                i7 = i10;
            } else if (i10 == 7) {
                i7 = 8;
            } else if (i10 != 3 && i10 != 4 && i10 != 5) {
                i7 = i10;
            }
            if (i12 <= 26 && "fugu".equals(je.e0.f13789b) && i7 == 1) {
                i7 = 2;
            }
            int iO = je.e0.o(i7);
            if (iO != 0) {
                return Pair.create(Integer.valueOf(iC), Integer.valueOf(iO));
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Arrays.equals(this.f11503a, fVar.f11503a) && this.f11504b == fVar.f11504b;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.f11503a) * 31) + this.f11504b;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f11504b + ", supportedEncodings=" + Arrays.toString(this.f11503a) + "]";
    }
}
