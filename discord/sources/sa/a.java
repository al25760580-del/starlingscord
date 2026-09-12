package sa;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EdgeEffect;
import android.widget.ImageView;
import androidx.core.view.e1;
import bp.d;
import bp.i;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.image.EncodedImage;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import ep.p;
import eq.f;
import eq.o;
import eq.q;
import gn.h;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.net.IDN;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.collections.n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.x;
import mo.c0;
import o1.k;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okio.Buffer;
import pa.s;
import pp.b0;
import pp.g1;
import u4.b;
import u4.c;
import vo.h0;
import vq.j;
import vq.m;
import xp.l;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static s f19813a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile c f19814b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile b f19815c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f19816d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Field f19817e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f19818f;

    public static final ArrayList A(h0 h0Var, up.c fqName) {
        Intrinsics.checkNotNullParameter(h0Var, "<this>");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        ArrayList arrayList = new ArrayList();
        e(h0Var, fqName, arrayList);
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x006b A[EDGE_INSN: B:109:0x006b->B:22:0x006b BREAK  A[LOOP:2: B:16:0x0051->B:20:0x0062], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:15:0x004a  */
    /* JADX WARN: Code duplicated, block: B:17:0x0053  */
    /* JADX WARN: Code duplicated, block: B:20:0x0062 A[LOOP:2: B:16:0x0051->B:20:0x0062, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x0092  */
    /* JADX WARN: Code duplicated, block: B:54:0x0126  */
    /* JADX WARN: Code duplicated, block: B:56:0x012f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0137  */
    /* JADX WARN: Code duplicated, block: B:59:0x013d  */
    /* JADX WARN: Code duplicated, block: B:61:0x0145  */
    /* JADX WARN: Code duplicated, block: B:63:0x014f  */
    /* JADX WARN: Code duplicated, block: B:65:0x0158  */
    /* JADX WARN: Code duplicated, block: B:66:0x015d  */
    /* JADX WARN: Code duplicated, block: B:68:0x0165  */
    /* JADX WARN: Code duplicated, block: B:69:0x016b  */
    /* JADX WARN: Code duplicated, block: B:71:0x0173  */
    /* JADX WARN: Code duplicated, block: B:72:0x0179  */
    /* JADX WARN: Code duplicated, block: B:74:0x0181  */
    /* JADX WARN: Code duplicated, block: B:75:0x0187  */
    /* JADX WARN: Code duplicated, block: B:77:0x018f  */
    /* JADX WARN: Code duplicated, block: B:78:0x0197  */
    /* JADX WARN: Code duplicated, block: B:80:0x019f  */
    /* JADX WARN: Code duplicated, block: B:81:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:83:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:84:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:86:0x01be  */
    /* JADX WARN: Code duplicated, block: B:87:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:89:0x01ce  */
    public static CacheControl B(Headers headers) {
        int i7;
        int length;
        boolean z5;
        int length2;
        String string;
        int i10;
        String string2;
        int length3;
        int i11;
        Headers headers2 = headers;
        Intrinsics.checkNotNullParameter(headers2, "headers");
        int size = headers2.size();
        boolean z6 = true;
        boolean z7 = true;
        int i12 = 0;
        String str = null;
        boolean z10 = false;
        boolean z11 = false;
        int iX = -1;
        int iX2 = -1;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        int iX3 = -1;
        int iX4 = -1;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        while (i12 < size) {
            int i13 = i12 + 1;
            String strB = headers2.b(i12);
            String strH = headers2.h(i12);
            if (x.i(strB, "Cache-Control", z6)) {
                if (str == null) {
                    str = strH;
                }
                i7 = 0;
                while (i7 < strH.length()) {
                    length = strH.length();
                    z5 = z6;
                    length2 = i7;
                    while (true) {
                        if (length2 < length) {
                            length2 = strH.length();
                            break;
                        }
                        i11 = length2 + 1;
                        if (StringsKt.E("=,;", strH.charAt(length2))) {
                            break;
                        }
                        length2 = i11;
                    }
                    String strSubstring = strH.substring(i7, length2);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    string = StringsKt.b0(strSubstring).toString();
                    if (length2 != strH.length() || strH.charAt(length2) == ',' || strH.charAt(length2) == ';') {
                        i10 = size;
                        i7 = length2 + 1;
                        string2 = null;
                    } else {
                        int length4 = length2 + 1;
                        byte[] bArr = ds.b.f7815a;
                        Intrinsics.checkNotNullParameter(strH, "<this>");
                        int length5 = strH.length();
                        while (true) {
                            if (length4 >= length5) {
                                i10 = size;
                                length4 = strH.length();
                                break;
                            }
                            int i14 = length4 + 1;
                            i10 = size;
                            char cCharAt = strH.charAt(length4);
                            int i15 = length5;
                            if (cCharAt != ' ' && cCharAt != '\t') {
                                break;
                            }
                            length4 = i14;
                            size = i10;
                            length5 = i15;
                        }
                        if (length4 >= strH.length() || strH.charAt(length4) != '\"') {
                            int length6 = strH.length();
                            int i16 = length4;
                            while (true) {
                                if (i16 >= length6) {
                                    length3 = strH.length();
                                    break;
                                }
                                int i17 = i16 + 1;
                                int i18 = length6;
                                int i19 = i16;
                                if (StringsKt.E(",;", strH.charAt(i16))) {
                                    length3 = i19;
                                    break;
                                }
                                i16 = i17;
                                length6 = i18;
                            }
                            String strSubstring2 = strH.substring(length4, length3);
                            Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                            i7 = length3;
                            string2 = StringsKt.b0(strSubstring2).toString();
                        } else {
                            int i20 = length4 + 1;
                            int I = StringsKt.I(strH, '\"', i20, 4);
                            string2 = strH.substring(i20, I);
                            Intrinsics.checkNotNullExpressionValue(string2, "this as java.lang.String…ing(startIndex, endIndex)");
                            i7 = I + 1;
                        }
                    }
                    if ("no-cache".equalsIgnoreCase(string)) {
                        z6 = z5;
                        z10 = z6;
                    } else if ("no-store".equalsIgnoreCase(string)) {
                        z6 = z5;
                        z11 = z6;
                    } else {
                        if ("max-age".equalsIgnoreCase(string)) {
                            iX = ds.b.x(-1, string2);
                        } else if ("s-maxage".equalsIgnoreCase(string)) {
                            iX2 = ds.b.x(-1, string2);
                        } else if ("private".equalsIgnoreCase(string)) {
                            z6 = z5;
                            z12 = z6;
                        } else if ("public".equalsIgnoreCase(string)) {
                            z6 = z5;
                            z13 = z6;
                        } else if ("must-revalidate".equalsIgnoreCase(string)) {
                            z6 = z5;
                            z14 = z6;
                        } else if ("max-stale".equalsIgnoreCase(string)) {
                            iX3 = ds.b.x(Integer.MAX_VALUE, string2);
                        } else if ("min-fresh".equalsIgnoreCase(string)) {
                            iX4 = ds.b.x(-1, string2);
                        } else if ("only-if-cached".equalsIgnoreCase(string)) {
                            z6 = z5;
                            z15 = z6;
                        } else if ("no-transform".equalsIgnoreCase(string)) {
                            z6 = z5;
                            z16 = z6;
                        } else if ("immutable".equalsIgnoreCase(string)) {
                            z6 = z5;
                            z17 = z6;
                        }
                        z6 = z5;
                    }
                    size = i10;
                }
                headers2 = headers;
                i12 = i13;
            } else {
                if (x.i(strB, "Pragma", z6)) {
                }
                headers2 = headers;
                i12 = i13;
            }
            z7 = false;
            i7 = 0;
            while (i7 < strH.length()) {
                length = strH.length();
                z5 = z6;
                length2 = i7;
                while (true) {
                    if (length2 < length) {
                        length2 = strH.length();
                        break;
                    }
                    i11 = length2 + 1;
                    if (StringsKt.E("=,;", strH.charAt(length2))) {
                        break;
                        break;
                    }
                    length2 = i11;
                }
                String strSubstring3 = strH.substring(i7, length2);
                Intrinsics.checkNotNullExpressionValue(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                string = StringsKt.b0(strSubstring3).toString();
                if (length2 != strH.length()) {
                    i10 = size;
                    i7 = length2 + 1;
                    string2 = null;
                } else {
                    i10 = size;
                    i7 = length2 + 1;
                    string2 = null;
                }
                if ("no-cache".equalsIgnoreCase(string)) {
                    z6 = z5;
                    z10 = z6;
                } else if ("no-store".equalsIgnoreCase(string)) {
                    z6 = z5;
                    z11 = z6;
                } else {
                    if ("max-age".equalsIgnoreCase(string)) {
                        iX = ds.b.x(-1, string2);
                    } else if ("s-maxage".equalsIgnoreCase(string)) {
                        iX2 = ds.b.x(-1, string2);
                    } else if ("private".equalsIgnoreCase(string)) {
                        z6 = z5;
                        z12 = z6;
                    } else if ("public".equalsIgnoreCase(string)) {
                        z6 = z5;
                        z13 = z6;
                    } else if ("must-revalidate".equalsIgnoreCase(string)) {
                        z6 = z5;
                        z14 = z6;
                    } else if ("max-stale".equalsIgnoreCase(string)) {
                        iX3 = ds.b.x(Integer.MAX_VALUE, string2);
                    } else if ("min-fresh".equalsIgnoreCase(string)) {
                        iX4 = ds.b.x(-1, string2);
                    } else if ("only-if-cached".equalsIgnoreCase(string)) {
                        z6 = z5;
                        z15 = z6;
                    } else if ("no-transform".equalsIgnoreCase(string)) {
                        z6 = z5;
                        z16 = z6;
                    } else if ("immutable".equalsIgnoreCase(string)) {
                        z6 = z5;
                        z17 = z6;
                    }
                    z6 = z5;
                }
                size = i10;
            }
            headers2 = headers;
            i12 = i13;
        }
        return new CacheControl(z10, z11, iX, iX2, z12, z13, z14, iX3, iX4, z15, z16, z17, !z7 ? null : str);
    }

    public static void C(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
        int colorForState = colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor());
        Drawable drawableMutate = drawable.mutate();
        drawableMutate.setTintList(ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(drawableMutate);
    }

    public static final void D(Object[] objArr, int i7, int i10) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        while (i7 < i10) {
            Intrinsics.checkNotNullParameter(objArr, "<this>");
            objArr[i7] = null;
            i7++;
        }
    }

    public static final Collection E(Collection collection, Function1 descriptorByHandle) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(descriptorByHandle, "descriptorByHandle");
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        int i7 = j.f21949i;
        j jVarF = m.f();
        while (!linkedList.isEmpty()) {
            Object objK = CollectionsKt.K(linkedList);
            int i10 = j.f21949i;
            j jVarF2 = m.f();
            ArrayList arrayListG = l.g(objK, linkedList, descriptorByHandle, new i(20, jVarF2));
            Intrinsics.checkNotNullExpressionValue(arrayListG, "extractMembersOverridableInBothWays(...)");
            if (arrayListG.size() == 1 && jVarF2.isEmpty()) {
                Object objY = CollectionsKt.Y(arrayListG);
                Intrinsics.checkNotNullExpressionValue(objY, "single(...)");
                jVarF.add(objY);
            } else {
                Object objS = l.s(arrayListG, descriptorByHandle);
                vo.b bVar = (vo.b) descriptorByHandle.invoke(objS);
                for (Object obj : arrayListG) {
                    Intrinsics.checkNotNull(obj);
                    if (!l.k(bVar, (vo.b) descriptorByHandle.invoke(obj))) {
                        jVarF2.add(obj);
                    }
                }
                if (!jVarF2.isEmpty()) {
                    jVarF.addAll(jVarF2);
                }
                jVarF.add(objS);
            }
        }
        return jVarF;
    }

    public static void F(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean zHasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z5 = onLongClickListener != null;
        boolean z6 = zHasOnClickListeners || z5;
        checkableImageButton.setFocusable(z6);
        checkableImageButton.setClickable(zHasOnClickListeners);
        checkableImageButton.setPressable(zHasOnClickListeners);
        checkableImageButton.setLongClickable(z5);
        checkableImageButton.setImportantForAccessibility(z6 ? 1 : 2);
    }

    public static final String J(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int i7 = 0;
        int i10 = -1;
        if (!StringsKt.D(str, ":", false)) {
            try {
                String ascii = IDN.toASCII(str);
                Intrinsics.checkNotNullExpressionValue(ascii, "toASCII(host)");
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                String lowerCase = ascii.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (lowerCase.length() == 0) {
                    return null;
                }
                int length = lowerCase.length();
                int i11 = 0;
                while (i11 < length) {
                    int i12 = i11 + 1;
                    char cCharAt = lowerCase.charAt(i11);
                    if (Intrinsics.compare((int) cCharAt, 31) <= 0 || Intrinsics.compare((int) cCharAt, 127) >= 0 || StringsKt.I(" #%/:?@[\\]", cCharAt, 0, 6) != -1) {
                        return null;
                    }
                    i11 = i12;
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress inetAddressH = (x.o(str, "[", false) && x.h(str, "]", false)) ? h(1, str.length() - 1, str) : h(0, str.length(), str);
        if (inetAddressH == null) {
            return null;
        }
        byte[] address = inetAddressH.getAddress();
        if (address.length != 16) {
            if (address.length == 4) {
                return inetAddressH.getHostAddress();
            }
            throw new AssertionError(kk.b.g('\'', "Invalid IPv6 address: '", str));
        }
        Intrinsics.checkNotNullExpressionValue(address, "address");
        int i13 = 0;
        int i14 = 0;
        while (i13 < address.length) {
            int i15 = i13;
            while (i15 < 16 && address[i15] == 0 && address[i15 + 1] == 0) {
                i15 += 2;
            }
            int i16 = i15 - i13;
            if (i16 > i14 && i16 >= 4) {
                i10 = i13;
                i14 = i16;
            }
            i13 = i15 + 2;
        }
        Buffer buffer = new Buffer();
        while (i7 < address.length) {
            if (i7 == i10) {
                buffer.U(58);
                i7 += i14;
                if (i7 == 16) {
                    buffer.U(58);
                }
            } else {
                if (i7 > 0) {
                    buffer.U(58);
                }
                byte b10 = address[i7];
                byte[] bArr = ds.b.f7815a;
                buffer.a0(((b10 & 255) << 8) | (address[i7 + 1] & 255));
                i7 += 2;
            }
        }
        return buffer.V();
    }

    public static String a(String str, String str2) {
        return kk.b.k(str, ":", str2);
    }

    public static final String b(Object[] objArr, int i7, int i10, n nVar) {
        StringBuilder sb2 = new StringBuilder((i10 * 3) + 2);
        sb2.append("[");
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            Object obj = objArr[i7 + i11];
            if (obj == nVar) {
                sb2.append("(this Collection)");
            } else {
                sb2.append(obj);
            }
        }
        sb2.append("]");
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static void c(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                drawable.setTintList(colorStateList);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
                drawable.setTintList(ColorStateList.valueOf(colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static String d(String str, String str2, String str3) {
        return str + ":" + str2 + ":" + str3;
    }

    public static final void e(h0 h0Var, up.c fqName, ArrayList packageFragments) {
        Intrinsics.checkNotNullParameter(h0Var, "<this>");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(packageFragments, "packageFragments");
        if (h0Var != null) {
            h0Var.b(fqName, packageFragments);
        } else {
            packageFragments.addAll(h0Var.c(fqName));
        }
    }

    public static ImageView.ScaleType f(int i7) {
        if (i7 == 0) {
            return ImageView.ScaleType.FIT_XY;
        }
        if (i7 == 1) {
            return ImageView.ScaleType.FIT_START;
        }
        if (i7 == 2) {
            return ImageView.ScaleType.FIT_CENTER;
        }
        if (i7 == 3) {
            return ImageView.ScaleType.FIT_END;
        }
        if (i7 != 5) {
            return i7 != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE;
        }
        return ImageView.ScaleType.CENTER_CROP;
    }

    public static o1.l g(String type, String str) {
        Exception excA;
        Intrinsics.checkNotNullParameter(type, "type");
        try {
            q1.b bVar = new q1.b(new p1.a(26), null);
            if (Intrinsics.areEqual(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_ABORT_ERROR")) {
                excA = c0.a(new p1.a(0), str, bVar);
            } else if (Intrinsics.areEqual(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_CONSTRAINT_ERROR")) {
                excA = c0.a(new p1.a(1), str, bVar);
            } else if (Intrinsics.areEqual(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_DATA_CLONE_ERROR")) {
                excA = c0.a(new p1.a(2), str, bVar);
            } else if (Intrinsics.areEqual(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_DATA_ERROR")) {
                excA = c0.a(new p1.a(3), str, bVar);
            } else if (Intrinsics.areEqual(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_ENCODING_ERROR")) {
                excA = c0.a(new p1.a(4), str, bVar);
            } else if (Intrinsics.areEqual(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_HIERARCHY_REQUEST_ERROR")) {
                excA = c0.a(new p1.a(5), str, bVar);
            } else if (Intrinsics.areEqual(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_IN_USE_ATTRIBUTE_ERROR")) {
                excA = c0.a(new p1.a(6), str, bVar);
            } else if (Intrinsics.areEqual(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_CHARACTER_ERROR")) {
                excA = c0.a(new p1.a(7), str, bVar);
            } else if (Intrinsics.areEqual(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_MODIFICATION_ERROR")) {
                excA = c0.a(new p1.a(8), str, bVar);
            } else if (Intrinsics.areEqual(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_NODE_TYPE_ERROR")) {
                excA = c0.a(new p1.a(9), str, bVar);
            } else if (Intrinsics.areEqual(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_STATE_ERROR")) {
                excA = c0.a(new p1.a(10), str, bVar);
            } else if (Intrinsics.areEqual(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NAMESPACE_ERROR")) {
                excA = c0.a(new p1.a(11), str, bVar);
            } else if (Intrinsics.areEqual(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NETWORK_ERROR")) {
                excA = c0.a(new p1.a(12), str, bVar);
            } else if (Intrinsics.areEqual(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NO_MODIFICATION_ALLOWED_ERROR")) {
                excA = c0.a(new p1.a(13), str, bVar);
            } else if (Intrinsics.areEqual(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_ALLOWED_ERROR")) {
                excA = c0.a(new p1.a(14), str, bVar);
            } else if (Intrinsics.areEqual(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_FOUND_ERROR")) {
                excA = c0.a(new p1.a(15), str, bVar);
            } else if (Intrinsics.areEqual(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_READABLE_ERROR")) {
                excA = c0.a(new p1.a(16), str, bVar);
            } else if (Intrinsics.areEqual(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_SUPPORTED_ERROR")) {
                excA = c0.a(new p1.a(17), str, bVar);
            } else if (Intrinsics.areEqual(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_OPERATION_ERROR")) {
                excA = c0.a(new p1.a(18), str, bVar);
            } else if (Intrinsics.areEqual(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_OPT_OUT_ERROR")) {
                excA = c0.a(new p1.a(19), str, bVar);
            } else if (Intrinsics.areEqual(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_QUOTA_EXCEEDED_ERROR")) {
                excA = c0.a(new p1.a(20), str, bVar);
            } else if (Intrinsics.areEqual(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_READ_ONLY_ERROR")) {
                excA = c0.a(new p1.a(21), str, bVar);
            } else if (Intrinsics.areEqual(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_SECURITY_ERROR")) {
                excA = c0.a(new p1.a(22), str, bVar);
            } else if (Intrinsics.areEqual(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_SYNTAX_ERROR")) {
                excA = c0.a(new p1.a(23), str, bVar);
            } else if (Intrinsics.areEqual(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_TIMEOUT_ERROR")) {
                excA = c0.a(new p1.a(24), str, bVar);
            } else if (Intrinsics.areEqual(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_TRANSACTION_INACTIVE_ERROR")) {
                excA = c0.a(new p1.a(25), str, bVar);
            } else if (Intrinsics.areEqual(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_UNKNOWN_ERROR")) {
                excA = c0.a(new p1.a(26), str, bVar);
            } else if (Intrinsics.areEqual(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_VERSION_ERROR")) {
                excA = c0.a(new p1.a(27), str, bVar);
            } else {
                if (!Intrinsics.areEqual(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_WRONG_DOCUMENT_ERROR")) {
                    throw new r1.a();
                }
                excA = c0.a(new p1.a(28), str, bVar);
            }
            return (o1.l) excA;
        } catch (r1.a unused) {
            return new k(str, type);
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ad A[LOOP:1: B:54:0x00a0->B:58:0x00ad, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:80:0x00b3 A[EDGE_INSN: B:80:0x00b3->B:59:0x00b3 BREAK  A[LOOP:1: B:54:0x00a0->B:58:0x00ad], SYNTHETIC] */
    public static final InetAddress h(int i7, int i10, String str) {
        int i11;
        int i12;
        int iQ;
        byte[] bArr = new byte[16];
        int i13 = i7;
        int i14 = 0;
        int i15 = -1;
        int i16 = -1;
        while (i13 < i10) {
            if (i14 == 16) {
                return null;
            }
            int i17 = i13 + 2;
            if (i17 <= i10 && x.n(str, i13, "::", false)) {
                if (i15 != -1) {
                    return null;
                }
                i14 += 2;
                i15 = i14;
                if (i17 == i10) {
                    break;
                }
                i16 = i17;
                i11 = 0;
                i13 = i16;
                while (i13 < i10) {
                    iQ = ds.b.q(str.charAt(i13));
                    if (iQ == -1) {
                        break;
                        break;
                    }
                    i11 = (i11 << 4) + iQ;
                    i13++;
                }
                i12 = i13 - i16;
                return i12 == 0 ? null : null;
            }
            if (i14 != 0) {
                if (!x.n(str, i13, ":", false)) {
                    if (!x.n(str, i13, ".", false)) {
                        return null;
                    }
                    int i18 = i14 - 2;
                    int i19 = i18;
                    while (i16 < i10) {
                        if (i19 == 16) {
                            return null;
                        }
                        if (i19 != i18) {
                            if (str.charAt(i16) != '.') {
                                return null;
                            }
                            i16++;
                        }
                        int i20 = 0;
                        int i21 = i16;
                        while (i21 < i10) {
                            char cCharAt = str.charAt(i21);
                            if (Intrinsics.compare((int) cCharAt, 48) < 0 || Intrinsics.compare((int) cCharAt, 57) > 0) {
                                break;
                            }
                            if ((i20 == 0 && i16 != i21) || (i20 = ((i20 * 10) + cCharAt) - 48) > 255) {
                                return null;
                            }
                            i21++;
                        }
                        if (i21 - i16 == 0) {
                            return null;
                        }
                        bArr[i19] = (byte) i20;
                        i19++;
                        i16 = i21;
                    }
                    if (i19 != i14 + 2) {
                        return null;
                    }
                    i14 += 2;
                    break;
                }
                i13++;
            }
            i16 = i13;
            i11 = 0;
            i13 = i16;
            while (i13 < i10) {
                iQ = ds.b.q(str.charAt(i13));
                if (iQ == -1) {
                    break;
                }
                i11 = (i11 << 4) + iQ;
                i13++;
            }
            i12 = i13 - i16;
            if (i12 == 0 && i12 <= 4) {
                int i22 = i14 + 1;
                bArr[i14] = (byte) (255 & (i11 >>> 8));
                i14 += 2;
                bArr[i22] = (byte) (i11 & 255);
            }
        }
        if (i14 != 16) {
            if (i15 == -1) {
                return null;
            }
            int i23 = i14 - i15;
            System.arraycopy(bArr, i15, bArr, 16 - i23, i23);
            Arrays.fill(bArr, i15, (16 - i14) + i15, (byte) 0);
        }
        return InetAddress.getByAddress(bArr);
    }

    public static final p i(g1 g1Var) {
        Intrinsics.checkNotNullParameter(hq.k.f11042h, "<this>");
        switch (g1Var == null ? -1 : hq.x.f11079b[g1Var.ordinal()]) {
            case 1:
                p INTERNAL = vo.p.f21827d;
                Intrinsics.checkNotNullExpressionValue(INTERNAL, "INTERNAL");
                return INTERNAL;
            case 2:
                p PRIVATE = vo.p.f21824a;
                Intrinsics.checkNotNullExpressionValue(PRIVATE, "PRIVATE");
                return PRIVATE;
            case 3:
                p PRIVATE_TO_THIS = vo.p.f21825b;
                Intrinsics.checkNotNullExpressionValue(PRIVATE_TO_THIS, "PRIVATE_TO_THIS");
                return PRIVATE_TO_THIS;
            case 4:
                p PROTECTED = vo.p.f21826c;
                Intrinsics.checkNotNullExpressionValue(PROTECTED, "PROTECTED");
                return PROTECTED;
            case 5:
                p PUBLIC = vo.p.f21828e;
                Intrinsics.checkNotNullExpressionValue(PUBLIC, "PUBLIC");
                return PUBLIC;
            case 6:
                p LOCAL = vo.p.f21829f;
                Intrinsics.checkNotNullExpressionValue(LOCAL, "LOCAL");
                return LOCAL;
            default:
                p PRIVATE2 = vo.p.f21824a;
                Intrinsics.checkNotNullExpressionValue(PRIVATE2, "PRIVATE");
                return PRIVATE2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002e  */
    /* JADX WARN: Code duplicated, block: B:13:0x0034 A[RETURN] */
    public static final d j(Annotation[] annotationArr, up.c fqName) {
        Intrinsics.checkNotNullParameter(annotationArr, "<this>");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        for (Annotation annotation : annotationArr) {
            if (Intrinsics.areEqual(bp.c.a(h.B(h.z(annotation))).a(), fqName)) {
                if (annotation != null) {
                    return new d(annotation);
                }
                return null;
            }
        }
        annotation = null;
        if (annotation != null) {
            return new d(annotation);
        }
        return null;
    }

    public static View k(int i7, View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View viewFindViewById = viewGroup.getChildAt(i10).findViewById(i7);
            if (viewFindViewById != null) {
                return viewFindViewById;
            }
        }
        return null;
    }

    public static final ArrayList l(Annotation[] annotationArr) {
        Intrinsics.checkNotNullParameter(annotationArr, "<this>");
        ArrayList arrayList = new ArrayList(annotationArr.length);
        for (Annotation annotation : annotationArr) {
            arrayList.add(new d(annotation));
        }
        return arrayList;
    }

    public static /* synthetic */ Collection m(q qVar, f fVar, int i7) {
        if ((i7 & 1) != 0) {
            fVar = f.f8623m;
        }
        o.f8649a.getClass();
        return qVar.d(fVar, eq.l.f8642e);
    }

    public static float n(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return androidx.core.widget.c.b(edgeEffect);
        }
        return 0.0f;
    }

    public static int r(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static final boolean s(h0 h0Var, up.c fqName) {
        Intrinsics.checkNotNullParameter(h0Var, "<this>");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return h0Var != null ? h0Var.a(fqName) : A(h0Var, fqName).isEmpty();
    }

    public static final boolean t(int i7, int i10, ResizeOptions resizeOptions) {
        if (resizeOptions == null) {
            return ((float) ((int) (((float) i7) * 1.3333334f))) >= 2048.0f && ((int) (((float) i10) * 1.3333334f)) >= 2048;
        }
        return ((int) (((float) i7) * 1.3333334f)) >= resizeOptions.f4817a && ((int) (((float) i10) * 1.3333334f)) >= resizeOptions.f4818b;
    }

    public static final boolean u(EncodedImage encodedImage, ResizeOptions resizeOptions) {
        if (encodedImage == null) {
            return false;
        }
        int rotationAngle = encodedImage.getRotationAngle();
        return (rotationAngle == 90 || rotationAngle == 270) ? t(encodedImage.getHeight(), encodedImage.getWidth(), resizeOptions) : t(encodedImage.getWidth(), encodedImage.getHeight(), resizeOptions);
    }

    public static final void w() {
        if (f19813a == null) {
            synchronized (a.class) {
                f19813a = new s();
            }
        }
    }

    public static long x(long... jArr) {
        if (jArr.length <= 0) {
            throw new IllegalArgumentException();
        }
        long j = jArr[0];
        for (int i7 = 1; i7 < jArr.length; i7++) {
            long j5 = jArr[i7];
            if (j5 > j) {
                j = j5;
            }
        }
        return j;
    }

    public static final vo.c y(b0 b0Var) {
        Intrinsics.checkNotNullParameter(hq.k.f11042h, "<this>");
        int i7 = b0Var == null ? -1 : hq.x.f11078a[b0Var.ordinal()];
        if (i7 != 1) {
            if (i7 == 2) {
                return vo.c.f21793e;
            }
            if (i7 == 3) {
                return vo.c.f21794i;
            }
            if (i7 == 4) {
                return vo.c.f21795v;
            }
        }
        return vo.c.f21792d;
    }

    public static float z(EdgeEffect edgeEffect, float f2, float f7) {
        if (Build.VERSION.SDK_INT >= 31) {
            return androidx.core.widget.c.c(edgeEffect, f2, f7);
        }
        androidx.core.widget.b.a(edgeEffect, f2, f7);
        return f2;
    }

    public void G(View view, float f2) {
        if (f19816d) {
            try {
                e1.m(view, f2);
                return;
            } catch (NoSuchMethodError unused) {
                f19816d = false;
            }
        }
        view.setAlpha(f2);
    }

    public void H(int i7, View view) {
        if (!f19818f) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f19817e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            f19818f = true;
        }
        Field field = f19817e;
        if (field != null) {
            try {
                f19817e.setInt(view, i7 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public abstract void I(Object obj, float f2);

    public abstract int o();

    public float p(View view) {
        if (f19816d) {
            try {
                return e1.d(view);
            } catch (NoSuchMethodError unused) {
                f19816d = false;
            }
        }
        return view.getAlpha();
    }

    public abstract float q(Object obj);

    public abstract boolean v();
}
