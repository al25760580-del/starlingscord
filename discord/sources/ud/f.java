package ud;

import android.text.TextUtils;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.exoplayer2.Format;
import gc.g0;
import gc.h1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import je.e0;
import md.z0;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Format f21073f;

    public static ArrayList m(String str) {
        byte[][] bArr;
        byte[] bArr2 = je.b.f13758a;
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            int i7 = e0.f13788a;
            int length = str.length() / 2;
            byte[] bArr3 = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 * 2;
                bArr3[i10] = (byte) (Character.digit(str.charAt(i11 + 1), 16) + (Character.digit(str.charAt(i11), 16) << 4));
            }
            if (length <= 4) {
                bArr = null;
                break;
            }
            int i12 = 0;
            while (true) {
                if (i12 >= 4) {
                    ArrayList arrayList2 = new ArrayList();
                    int i13 = 0;
                    do {
                        arrayList2.add(Integer.valueOf(i13));
                        i13 += 4;
                        int i14 = length - 4;
                        while (true) {
                            if (i13 > i14) {
                                i13 = -1;
                                break;
                            }
                            if (length - i13 > 4) {
                                int i15 = 0;
                                while (true) {
                                    if (i15 >= 4) {
                                        break;
                                    }
                                    if (bArr3[i13 + i15] != bArr2[i15]) {
                                        break;
                                    }
                                    i15++;
                                }
                            }
                            i13++;
                        }
                    } while (i13 != -1);
                    byte[][] bArr4 = new byte[arrayList2.size()][];
                    int i16 = 0;
                    while (i16 < arrayList2.size()) {
                        int iIntValue = ((Integer) arrayList2.get(i16)).intValue();
                        int iIntValue2 = (i16 < arrayList2.size() + (-1) ? ((Integer) arrayList2.get(i16 + 1)).intValue() : length) - iIntValue;
                        byte[] bArr5 = new byte[iIntValue2];
                        System.arraycopy(bArr3, iIntValue, bArr5, 0, iIntValue2);
                        bArr4[i16] = bArr5;
                        i16++;
                    }
                    bArr = bArr4;
                    break;
                }
                if (bArr3[i12] != bArr2[i12]) {
                    bArr = null;
                    break;
                }
                i12++;
            }
            if (bArr == null) {
                arrayList.add(bArr3);
                return arrayList;
            }
            Collections.addAll(arrayList, bArr);
        }
        return arrayList;
    }

    @Override // ud.d
    public final Object b() {
        return this.f21073f;
    }

    @Override // ud.d
    public final void j(XmlPullParser xmlPullParser) throws h1 {
        String str;
        g0 g0Var = new g0();
        String attributeValue = xmlPullParser.getAttributeValue(null, "FourCC");
        if (attributeValue == null) {
            throw new z0("FourCC", 2);
        }
        if (attributeValue.equalsIgnoreCase("H264") || attributeValue.equalsIgnoreCase("X264") || attributeValue.equalsIgnoreCase("AVC1") || attributeValue.equalsIgnoreCase("DAVC")) {
            str = "video/avc";
        } else if (attributeValue.equalsIgnoreCase("AAC") || attributeValue.equalsIgnoreCase("AACL") || attributeValue.equalsIgnoreCase("AACH") || attributeValue.equalsIgnoreCase("AACP")) {
            str = "audio/mp4a-latm";
        } else if (attributeValue.equalsIgnoreCase("TTML") || attributeValue.equalsIgnoreCase("DFXP")) {
            str = "application/ttml+xml";
        } else if (attributeValue.equalsIgnoreCase("ac-3") || attributeValue.equalsIgnoreCase("dac3")) {
            str = "audio/ac3";
        } else if (attributeValue.equalsIgnoreCase("ec-3") || attributeValue.equalsIgnoreCase("dec3")) {
            str = "audio/eac3";
        } else if (attributeValue.equalsIgnoreCase("dtsc")) {
            str = "audio/vnd.dts";
        } else if (attributeValue.equalsIgnoreCase("dtsh") || attributeValue.equalsIgnoreCase("dtsl")) {
            str = "audio/vnd.dts.hd";
        } else if (attributeValue.equalsIgnoreCase("dtse")) {
            str = "audio/vnd.dts.hd;profile=lbr";
        } else {
            str = attributeValue.equalsIgnoreCase("opus") ? "audio/opus" : null;
        }
        int iIntValue = ((Integer) c("Type")).intValue();
        if (iIntValue == 2) {
            ArrayList arrayListM = m(xmlPullParser.getAttributeValue(null, "CodecPrivateData"));
            g0Var.j = "video/mp4";
            g0Var.f9648p = d.i(xmlPullParser, "MaxWidth");
            g0Var.f9649q = d.i(xmlPullParser, "MaxHeight");
            g0Var.f9645m = arrayListM;
        } else {
            int i7 = 0;
            if (iIntValue == 1) {
                if (str == null) {
                    str = "audio/mp4a-latm";
                }
                int i10 = d.i(xmlPullParser, "Channels");
                int i11 = d.i(xmlPullParser, "SamplingRate");
                ArrayList arrayListM2 = m(xmlPullParser.getAttributeValue(null, "CodecPrivateData"));
                boolean zIsEmpty = arrayListM2.isEmpty();
                List listSingletonList = arrayListM2;
                if (zIsEmpty && "audio/mp4a-latm".equals(str)) {
                    listSingletonList = arrayListM2;
                    int i12 = -1;
                    int i13 = 0;
                    while (true) {
                        int[] iArr = ic.a.f11471a;
                        if (i13 >= 13) {
                            break;
                        }
                        if (i11 == iArr[i13]) {
                            i12 = i13;
                        }
                        i13++;
                    }
                    int i14 = -1;
                    while (true) {
                        int[] iArr2 = ic.a.f11472b;
                        if (i7 >= 16) {
                            break;
                        }
                        if (i10 == iArr2[i7]) {
                            i14 = i7;
                        }
                        i7++;
                    }
                    if (i11 == -1 || i14 == -1) {
                        throw new IllegalArgumentException(a3.e.g(i11, i10, "Invalid sample rate or number of channels: ", ", "));
                    }
                    listSingletonList = Collections.singletonList(ic.a.a(2, i12, i14));
                }
                listSingletonList = arrayListM2;
                g0Var.j = "audio/mp4";
                g0Var.f9656x = i10;
                g0Var.f9657y = i11;
                g0Var.f9645m = listSingletonList;
            } else if (iIntValue == 3) {
                String str2 = (String) c("Subtype");
                if (str2 != null) {
                    if (str2.equals("CAPT")) {
                        i7 = 64;
                    } else if (str2.equals("DESC")) {
                        i7 = IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
                    }
                }
                g0Var.j = "application/mp4";
                g0Var.f9639e = i7;
            } else {
                g0Var.j = "application/mp4";
            }
        }
        g0Var.f9635a = xmlPullParser.getAttributeValue(null, "Index");
        g0Var.f9636b = (String) c("Name");
        g0Var.k = str;
        g0Var.f9640f = d.i(xmlPullParser, "Bitrate");
        g0Var.f9637c = (String) c("Language");
        this.f21073f = new Format(g0Var);
    }
}
