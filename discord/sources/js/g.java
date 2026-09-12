package js;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ByteString f14124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f14125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f14126c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f14127d;

    static {
        ByteString byteString = ByteString.f17414v;
        f14124a = io.sentry.hints.j.z("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        f14125b = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        f14126c = new String[64];
        String[] strArr = new String[IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER];
        int i7 = 0;
        for (int i10 = 0; i10 < 256; i10++) {
            String binaryString = Integer.toBinaryString(i10);
            Intrinsics.checkNotNullExpressionValue(binaryString, "toBinaryString(it)");
            strArr[i10] = kotlin.text.x.m(ds.b.h("%8s", binaryString), ' ', '0');
        }
        f14127d = strArr;
        String[] strArr2 = f14126c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i11 = iArr[0];
        strArr2[i11 | 8] = Intrinsics.stringPlus(strArr2[i11], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        int i12 = 0;
        while (i12 < 3) {
            int i13 = iArr2[i12];
            i12++;
            int i14 = iArr[0];
            String[] strArr3 = f14126c;
            int i15 = i14 | i13;
            StringBuilder sb2 = new StringBuilder();
            sb2.append((Object) strArr3[i14]);
            sb2.append('|');
            sb2.append((Object) strArr3[i13]);
            strArr3[i15] = sb2.toString();
            strArr3[i15 | 8] = ((Object) strArr3[i14]) + '|' + ((Object) strArr3[i13]) + "|PADDED";
        }
        int length = f14126c.length;
        while (i7 < length) {
            int i16 = i7 + 1;
            String[] strArr4 = f14126c;
            if (strArr4[i7] == null) {
                strArr4[i7] = f14127d[i7];
            }
            i7 = i16;
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    public static String a(int i7, int i10, int i11, int i12, boolean z5) {
        String strL;
        String str;
        String[] strArr = f14125b;
        String strH = i11 < strArr.length ? strArr[i11] : ds.b.h("0x%02x", Integer.valueOf(i11));
        if (i12 == 0) {
            strL = "";
        } else {
            String[] strArr2 = f14127d;
            if (i11 == 2 || i11 == 3) {
                strL = strArr2[i12];
            } else if (i11 == 4 || i11 == 6) {
                strL = i12 == 1 ? "ACK" : strArr2[i12];
            } else if (i11 == 7 || i11 == 8) {
                strL = strArr2[i12];
            } else {
                String[] strArr3 = f14126c;
                if (i12 < strArr3.length) {
                    str = strArr3[i12];
                    Intrinsics.checkNotNull(str);
                } else {
                    str = strArr2[i12];
                }
                if (i11 != 5 || (i12 & 4) == 0) {
                    strL = (i11 != 0 || (i12 & 32) == 0) ? str : kotlin.text.x.l(str, "PRIORITY", "COMPRESSED", false);
                } else {
                    strL = kotlin.text.x.l(str, "HEADERS", "PUSH_PROMISE", false);
                }
            }
        }
        return ds.b.h("%s 0x%08x %5d %-13s %s", z5 ? "<<" : ">>", Integer.valueOf(i7), Integer.valueOf(i10), strH, strL);
    }
}
