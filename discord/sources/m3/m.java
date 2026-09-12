package m3;

import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.datastore.preferences.protobuf.d1;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import io.sentry.ILogger;
import io.sentry.f4;
import io.sentry.x1;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import or.e1;
import or.k1;
import or.l1;
import org.webrtc.MediaStreamTrack;
import vo.l0;

/* JADX INFO: loaded from: classes.dex */
public final class m implements o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f15428b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15429a;

    public static long A(ok.a aVar) {
        MediaFormat trackFormat = aVar.f17274a.getTrackFormat(aVar.f17280g);
        if (!trackFormat.containsKey("durationUs")) {
            return -1L;
        }
        long j = trackFormat.getLong("durationUs");
        aVar.f17274a.getSelection().getClass();
        return Math.min(j, LongCompanionObject.MAX_VALUE) - Math.max(0L, 0L);
    }

    public static final Object B(vp.k kVar, vp.m extension) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        Intrinsics.checkNotNullParameter(extension, "extension");
        if (kVar.l(extension)) {
            return kVar.k(extension);
        }
        return null;
    }

    public static final Object C(vp.k kVar, vp.m extension, int i7) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        Intrinsics.checkNotNullParameter(extension, "extension");
        kVar.o(extension);
        vp.h hVar = kVar.f21906d;
        vp.l lVar = extension.f21913d;
        hVar.getClass();
        vp.y yVar = hVar.f21887a;
        if (!lVar.f21909i) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object obj = yVar.get(lVar);
        if (i7 >= (obj == null ? 0 : ((List) obj).size())) {
            return null;
        }
        kVar.o(extension);
        if (!lVar.f21909i) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object obj2 = yVar.get(lVar);
        if (obj2 != null) {
            return extension.a(((List) obj2).get(i7));
        }
        throw new IndexOutOfBoundsException();
    }

    public static int D(int[] iArr, int i7, boolean z5) {
        boolean z6;
        int[] iArr2 = iArr;
        int i10 = 0;
        for (int i11 : iArr2) {
            i10 += i11;
        }
        int length = iArr2.length;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            int i15 = length - 1;
            if (i12 >= i15) {
                return i13;
            }
            int i16 = 1 << i12;
            i14 |= i16;
            int i17 = 1;
            while (i17 < iArr2[i12]) {
                int i18 = i10 - i17;
                int i19 = length - i12;
                int i20 = i19 - 2;
                int iJ = j(i18 - 1, i20);
                if (z5 && i14 == 0) {
                    int i21 = i19 - 1;
                    if (i18 - i21 >= i21) {
                        iJ -= j(i18 - i19, i20);
                    }
                }
                boolean z7 = true;
                if (i19 - 1 > 1) {
                    int i22 = i18 - i20;
                    int iJ2 = 0;
                    while (i22 > i7) {
                        iJ2 += j((i18 - i22) - 1, i19 - 3);
                        i22--;
                        z7 = z7;
                    }
                    z6 = z7;
                    iJ -= (i15 - i12) * iJ2;
                } else {
                    z6 = true;
                    if (i18 > i7) {
                        iJ--;
                    }
                }
                i13 += iJ;
                i17++;
                i14 &= ~i16;
                iArr2 = iArr;
            }
            i10 -= i17;
            i12++;
            iArr2 = iArr;
        }
    }

    public static boolean E(MotionEvent motionEvent, int i7) {
        return (motionEvent.getSource() & i7) == i7;
    }

    public static final boolean F(l0 l0Var) {
        Intrinsics.checkNotNullParameter(l0Var, "<this>");
        return l0Var.getGetter() == null;
    }

    public static boolean G(byte b10) {
        return b10 > -65;
    }

    public static final boolean H(int i7, String str) {
        char cCharAt = str.charAt(i7);
        return 'A' <= cCharAt && cCharAt < '[';
    }

    public static up.e I(up.e eVar, String str, String str2, int i7) {
        char cCharAt;
        char cCharAt2;
        Object next;
        boolean z5 = (i7 & 4) != 0;
        if ((i7 & 8) != 0) {
            str2 = null;
        }
        if (!eVar.f21270e) {
            String strC = eVar.c();
            Intrinsics.checkNotNullExpressionValue(strC, "getIdentifier(...)");
            if (kotlin.text.x.o(strC, str, false) && strC.length() != str.length() && ('a' > (cCharAt = strC.charAt(str.length())) || cCharAt >= '{')) {
                if (str2 != null) {
                    StringBuilder sbN = kk.b.n(str2);
                    sbN.append(StringsKt.N(strC, str));
                    return up.e.e(sbN.toString());
                }
                if (!z5) {
                    return eVar;
                }
                String strN = StringsKt.N(strC, str);
                Intrinsics.checkNotNullParameter(strN, "<this>");
                if (strN.length() != 0 && H(0, strN)) {
                    if (strN.length() == 1 || !H(1, strN)) {
                        Intrinsics.checkNotNullParameter(strN, "<this>");
                        if (strN.length() != 0 && 'A' <= (cCharAt2 = strN.charAt(0)) && cCharAt2 < '[') {
                            char lowerCase = Character.toLowerCase(cCharAt2);
                            String strSubstring = strN.substring(1);
                            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                            strN = lowerCase + strSubstring;
                        }
                    } else {
                        Intrinsics.checkNotNullParameter(strN, "<this>");
                        Iterator it = new IntRange(0, strN.length() - 1, 1).iterator();
                        do {
                            if (!((lo.b) it).f15156i) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (H(((Number) next).intValue(), strN));
                        Integer num = (Integer) next;
                        if (num != null) {
                            int iIntValue = num.intValue() - 1;
                            StringBuilder sb2 = new StringBuilder();
                            String strSubstring2 = strN.substring(0, iIntValue);
                            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                            sb2.append(U(strSubstring2));
                            String strSubstring3 = strN.substring(iIntValue);
                            Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
                            sb2.append(strSubstring3);
                            strN = sb2.toString();
                        } else {
                            strN = U(strN);
                        }
                    }
                }
                if (up.e.f(strN)) {
                    return up.e.e(strN);
                }
            }
        }
        return null;
    }

    public static boolean J(int i7, Parcel parcel) {
        X(parcel, i7, 4);
        return parcel.readInt() != 0;
    }

    public static final byte[] K(InputStream inputStream) throws IOException {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        k(inputStream, byteArrayOutputStream, 8192);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
        return byteArray;
    }

    public static int L(int i7, Parcel parcel) {
        X(parcel, i7, 4);
        return parcel.readInt();
    }

    public static Integer M(int i7, Parcel parcel) {
        int iP = P(i7, parcel);
        if (iP == 0) {
            return null;
        }
        Y(parcel, iP, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static long N(int i7, Parcel parcel) {
        X(parcel, i7, 8);
        return parcel.readLong();
    }

    public static long O(je.w wVar, int i7, int i10) {
        wVar.F(i7);
        if (wVar.a() < 5) {
            return -9223372036854775807L;
        }
        int iG = wVar.g();
        if ((8388608 & iG) != 0 || ((2096896 & iG) >> 8) != i10 || (iG & 32) == 0 || wVar.u() < 7 || wVar.a() < 7 || (wVar.u() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        wVar.e(bArr, 0, 6);
        return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((((long) bArr[4]) & 255) >> 7);
    }

    public static int P(int i7, Parcel parcel) {
        return (i7 & (-65536)) != -65536 ? (char) (i7 >> 16) : parcel.readInt();
    }

    public static final void Q(dp.b bVar, dp.a from, vo.f scopeOwner, up.e name) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(scopeOwner, "scopeOwner");
        Intrinsics.checkNotNullParameter(name, "name");
        if (bVar == dp.b.f7692a) {
            return;
        }
        from.getClass();
    }

    public static final void R(dp.b bVar, dp.a from, vo.e0 scopeOwner, up.e name) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(scopeOwner, "scopeOwner");
        Intrinsics.checkNotNullParameter(name, "name");
        String packageFqName = ((yo.b0) scopeOwner).f23420x.f21262a.f21265a;
        String name2 = name.b();
        Intrinsics.checkNotNullExpressionValue(name2, "asString(...)");
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        Intrinsics.checkNotNullParameter(name2, "name");
        if (bVar == dp.b.f7692a) {
            return;
        }
        from.getClass();
    }

    public static void S(int i7, Parcel parcel) {
        parcel.setDataPosition(parcel.dataPosition() + P(i7, parcel));
    }

    public static String T(String str) {
        int length = str.length();
        int i7 = 0;
        while (i7 < length) {
            char cCharAt = str.charAt(i7);
            if (cCharAt >= 'A' && cCharAt <= 'Z') {
                char[] charArray = str.toCharArray();
                while (i7 < length) {
                    char c8 = charArray[i7];
                    if (c8 >= 'A' && c8 <= 'Z') {
                        charArray[i7] = (char) (c8 ^ ' ');
                    }
                    i7++;
                }
                return String.valueOf(charArray);
            }
            i7++;
        }
        return str;
    }

    public static final String U(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        StringBuilder sb2 = new StringBuilder(str.length());
        int length = str.length();
        for (int i7 = 0; i7 < length; i7++) {
            char cCharAt = str.charAt(i7);
            if ('A' <= cCharAt && cCharAt < '[') {
                cCharAt = Character.toLowerCase(cCharAt);
            }
            sb2.append(cCharAt);
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static String V(String str) {
        int length = str.length();
        int i7 = 0;
        while (i7 < length) {
            char cCharAt = str.charAt(i7);
            if (cCharAt >= 'a' && cCharAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i7 < length) {
                    char c8 = charArray[i7];
                    if (c8 >= 'a' && c8 <= 'z') {
                        charArray[i7] = (char) (c8 ^ ' ');
                    }
                    i7++;
                }
                return String.valueOf(charArray);
            }
            i7++;
        }
        return str;
    }

    public static int W(Parcel parcel) {
        int i7 = parcel.readInt();
        int iP = P(i7, parcel);
        char c8 = (char) i7;
        int iDataPosition = parcel.dataPosition();
        if (c8 != 20293) {
            throw new d1("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(i7))), parcel);
        }
        int i10 = iP + iDataPosition;
        if (i10 >= iDataPosition && i10 <= parcel.dataSize()) {
            return i10;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(iDataPosition).length() + 32 + String.valueOf(i10).length());
        sb2.append("Size read is invalid start=");
        sb2.append(iDataPosition);
        sb2.append(" end=");
        sb2.append(i10);
        throw new d1(sb2.toString(), parcel);
    }

    public static void X(Parcel parcel, int i7, int i10) {
        int iP = P(i7, parcel);
        if (iP == i10) {
            return;
        }
        String hexString = Integer.toHexString(iP);
        int length = String.valueOf(i10).length();
        StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(iP).length() + 4 + 1);
        sb2.append("Expected size ");
        sb2.append(i10);
        sb2.append(" got ");
        sb2.append(iP);
        throw new d1(a3.e.o(sb2, " (0x", hexString, ")"), parcel);
    }

    public static void Y(Parcel parcel, int i7, int i10) {
        if (i7 == i10) {
            return;
        }
        String hexString = Integer.toHexString(i7);
        int length = String.valueOf(i10).length();
        StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(i7).length() + 4 + 1);
        sb2.append("Expected size ");
        sb2.append(i10);
        sb2.append(" got ");
        sb2.append(i7);
        throw new d1(a3.e.o(sb2, " (0x", hexString, ")"), parcel);
    }

    public static final k1 a(String serialName, mr.f kind) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        if (StringsKt.K(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        sn.i iVar = l1.f17571a;
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Object it = ((sn.l) l1.f17571a.values()).iterator();
        while (((androidx.core.view.i0) it).hasNext()) {
            KSerializer kSerializer = (KSerializer) ((sn.g) it).next();
            if (Intrinsics.areEqual(serialName, kSerializer.getDescriptor().d())) {
                StringBuilder sbN = com.discord.chat.presentation.list.a.n("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name ", serialName, " there already exists ");
                sbN.append(Reflection.getOrCreateKotlinClass(kSerializer.getClass()).getSimpleName());
                sbN.append(".\n                Please refer to SerialDescriptor documentation for additional information.\n            ");
                throw new IllegalArgumentException(kotlin.text.r.b(sbN.toString()));
            }
        }
        return new k1(serialName, kind);
    }

    public static final void d(Encoder encoder) {
        Intrinsics.checkNotNullParameter(encoder, "<this>");
        if ((encoder instanceof qr.z ? (qr.z) encoder : null) != null) {
            return;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got " + Reflection.getOrCreateKotlinClass(encoder.getClass()));
    }

    public static final pr.g e(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "<this>");
        pr.g gVar = decoder instanceof pr.g ? (pr.g) decoder : null;
        if (gVar != null) {
            return gVar;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got " + Reflection.getOrCreateKotlinClass(decoder.getClass()));
    }

    public static final mr.g f(String serialName, SerialDescriptor[] typeParameters, Function1 builderAction) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(typeParameters, "typeParameters");
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        if (StringsKt.K(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        mr.a aVar = new mr.a(serialName);
        builderAction.invoke(aVar);
        return new mr.g(serialName, mr.j.f16077b, aVar.f16047c.size(), kotlin.collections.y.H(typeParameters), aVar);
    }

    public static final mr.g g(String serialName, ls.d kind, SerialDescriptor[] typeParameters, Function1 builder) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(typeParameters, "typeParameters");
        Intrinsics.checkNotNullParameter(builder, "builder");
        if (StringsKt.K(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (Intrinsics.areEqual(kind, mr.j.f16077b)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        mr.a aVar = new mr.a(serialName);
        builder.invoke(aVar);
        return new mr.g(serialName, kind, aVar.f16047c.size(), kotlin.collections.y.H(typeParameters), aVar);
    }

    public static final String i(String str) {
        char cCharAt;
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() == 0 || 'a' > (cCharAt = str.charAt(0)) || cCharAt >= '{') {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        sb2.append(Character.toUpperCase(cCharAt));
        sb2.append((CharSequence) str, 1, str.length());
        return sb2.toString();
    }

    public static int j(int i7, int i10) {
        int i11 = i7 - i10;
        if (i11 > i10) {
            i11 = i10;
            i10 = i11;
        }
        int i12 = 1;
        int i13 = 1;
        while (i7 > i10) {
            i12 *= i7;
            if (i13 <= i11) {
                i12 /= i13;
                i13++;
            }
            i7--;
        }
        while (i13 <= i11) {
            i12 /= i13;
            i13++;
        }
        return i12;
    }

    public static final long k(InputStream inputStream, OutputStream out, int i7) throws IOException {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        Intrinsics.checkNotNullParameter(out, "out");
        byte[] bArr = new byte[i7];
        int i10 = inputStream.read(bArr);
        long j = 0;
        while (i10 >= 0) {
            out.write(bArr, 0, i10);
            j += (long) i10;
            i10 = inputStream.read(bArr);
        }
        return j;
    }

    public static Bundle m(int i7, Parcel parcel) {
        int iP = P(i7, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iP == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iP);
        return bundle;
    }

    public static byte[] n(int i7, Parcel parcel) {
        int iP = P(i7, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iP == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iP);
        return bArrCreateByteArray;
    }

    public static WritableMap o(String str, String str2, boolean z5) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putNull("UTType");
        writableMapCreateMap.putBoolean("isKnown", z5);
        writableMapCreateMap.putString("preferredFilenameExtension", str);
        writableMapCreateMap.putString("mimeType", str2);
        return writableMapCreateMap;
    }

    public static Parcelable p(Parcel parcel, int i7, Parcelable.Creator creator) {
        int iP = P(i7, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iP == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iP);
        return parcelable;
    }

    public static String q(int i7, Parcel parcel) {
        int iP = P(i7, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iP == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iP);
        return string;
    }

    public static ArrayList r(int i7, Parcel parcel) {
        int iP = P(i7, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iP == 0) {
            return null;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(iDataPosition + iP);
        return arrayListCreateStringArrayList;
    }

    public static Object[] s(Parcel parcel, int i7, Parcelable.Creator creator) {
        int iP = P(i7, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iP == 0) {
            return null;
        }
        Object[] objArrCreateTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iP);
        return objArrCreateTypedArray;
    }

    public static ArrayList t(Parcel parcel, int i7, Parcelable.Creator creator) {
        int iP = P(i7, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iP == 0) {
            return null;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iP);
        return arrayListCreateTypedArrayList;
    }

    public static boolean u(f4 f4Var, String str, x1 x1Var, ILogger iLogger) {
        int i7 = 8;
        int i10 = 2;
        int i11 = 0;
        switch (str) {
            case "debug_meta":
                f4Var.K = (io.sentry.protocol.d) x1Var.e0(iLogger, new io.sentry.clientreport.a(i7));
                return true;
            case "server_name":
                f4Var.H = x1Var.l0();
                return true;
            case "contexts":
                f4Var.f12671e.l(io.sentry.clientreport.a.c(x1Var, iLogger));
                return true;
            case "environment":
                f4Var.f12676y = x1Var.l0();
                return true;
            case "breadcrumbs":
                f4Var.J = x1Var.Q(iLogger, new io.sentry.d(i11));
                return true;
            case "sdk":
                f4Var.f12672i = (io.sentry.protocol.t) x1Var.e0(iLogger, new io.sentry.clientreport.a(21));
                return true;
            case "dist":
                f4Var.I = x1Var.l0();
                return true;
            case "tags":
                f4Var.f12674w = xr.m.F((Map) x1Var.c0());
                return true;
            case "user":
                f4Var.F = (io.sentry.protocol.h0) x1Var.e0(iLogger, new io.sentry.protocol.b0(i10));
                return true;
            case "extra":
                f4Var.L = xr.m.F((Map) x1Var.c0());
                return true;
            case "event_id":
                f4Var.f12670d = (io.sentry.protocol.v) x1Var.e0(iLogger, new io.sentry.clientreport.a(23));
                return true;
            case "release":
                f4Var.f12675x = x1Var.l0();
                return true;
            case "request":
                f4Var.f12673v = (io.sentry.protocol.p) x1Var.e0(iLogger, new io.sentry.clientreport.a(19));
                return true;
            case "platform":
                f4Var.E = x1Var.l0();
                return true;
            default:
                return false;
        }
    }

    public static void v(int i7, Parcel parcel) {
        if (parcel.dataPosition() == i7) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i7).length() + 26);
        sb2.append("Overread allowed size end=");
        sb2.append(i7);
        throw new d1(sb2.toString(), parcel);
    }

    public static boolean w(String str, String str2) {
        char c8;
        int length = str.length();
        if (str == str2) {
            return true;
        }
        if (length == str2.length()) {
            for (int i7 = 0; i7 < length; i7++) {
                char cCharAt = str.charAt(i7);
                char cCharAt2 = str2.charAt(i7);
                if (cCharAt == cCharAt2 || ((c8 = (char) ((cCharAt | ' ') - 97)) < 26 && c8 == ((char) ((cCharAt2 | ' ') - 97)))) {
                }
            }
            return true;
        }
        return false;
    }

    public static int x(uk.a aVar, int i7) {
        float f2;
        float duration;
        MediaFormat trackFormat = aVar.getTrackFormat(i7);
        if (trackFormat.containsKey("bitrate")) {
            return trackFormat.getInteger("bitrate");
        }
        float f7 = 1000.0f;
        float f10 = 1000000.0f;
        float f11 = trackFormat.containsKey("durationUs") ? trackFormat.getLong("durationUs") / 1000000.0f : aVar.getDuration() / 1000.0f;
        float f12 = 0.0f;
        if (f11 <= 0.0f) {
            return -1;
        }
        float size = aVar.getSize();
        int trackCount = aVar.getTrackCount();
        int i10 = 0;
        float integer = 0.0f;
        while (i10 < trackCount) {
            MediaFormat trackFormat2 = aVar.getTrackFormat(i10);
            float f13 = f7;
            if (trackFormat2.containsKey("mime")) {
                if (trackFormat2.containsKey("bitrate") && trackFormat2.containsKey("durationUs")) {
                    size -= ((trackFormat2.getLong("durationUs") / f10) * trackFormat2.getInteger("bitrate")) / 8.0f;
                } else if (trackFormat2.getString("mime").startsWith(MediaStreamTrack.VIDEO_TRACK_KIND)) {
                    if (trackFormat2.containsKey("durationUs")) {
                        f2 = f10;
                        duration = trackFormat2.getLong("durationUs") / f2;
                    } else {
                        f2 = f10;
                        duration = aVar.getDuration() / f13;
                    }
                    if (duration > f12) {
                        integer += trackFormat2.getInteger("height") * trackFormat2.getInteger("width") * duration;
                    }
                }
                f2 = f10;
                f12 = f12;
            } else {
                f2 = f10;
                f12 = f12;
            }
            i10++;
            f10 = f2;
            f12 = f12;
            f7 = f13;
        }
        float f14 = f12;
        float integer2 = trackFormat.getInteger("height") * trackFormat.getInteger("width") * f11;
        if (integer > f14) {
            size = (size * integer2) / integer;
        }
        return (int) ((size * 8.0f) / f11);
    }

    public static final DeserializationStrategy y(or.b bVar, CompositeDecoder decoder, String str) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        DeserializationStrategy deserializationStrategyA = bVar.a(decoder, str);
        if (deserializationStrategyA != null) {
            return deserializationStrategyA;
        }
        e1.m(str, bVar.c());
        throw null;
    }

    public static final KSerializer z(or.b bVar, Encoder encoder, Object value) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        KSerializer kSerializerB = bVar.b(encoder, value);
        if (kSerializerB != null) {
            return kSerializerB;
        }
        KClass subClass = Reflection.getOrCreateKotlinClass(value.getClass());
        KClass baseClass = bVar.c();
        Intrinsics.checkNotNullParameter(subClass, "subClass");
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        String simpleName = subClass.getSimpleName();
        if (simpleName == null) {
            simpleName = String.valueOf(subClass);
        }
        e1.m(simpleName, baseClass);
        throw null;
    }

    @Override // m3.o
    public final float b(View view, ViewGroup viewGroup) {
        switch (this.f15429a) {
            case 0:
                return view.getTranslationX() - viewGroup.getWidth();
            case 1:
                return viewGroup.getLayoutDirection() == 1 ? view.getTranslationX() + viewGroup.getWidth() : view.getTranslationX() - viewGroup.getWidth();
            case 2:
                return view.getTranslationX() + viewGroup.getWidth();
            default:
                return viewGroup.getLayoutDirection() == 1 ? view.getTranslationX() - viewGroup.getWidth() : view.getTranslationX() + viewGroup.getWidth();
        }
    }

    @Override // m3.o
    public float c(View view, ViewGroup viewGroup) {
        return view.getTranslationY();
    }
}
