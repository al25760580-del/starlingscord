package a1;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import com.facebook.react.common.assets.ReactFontManager;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float[][] f8a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float[][] f9b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float[] f10c = {95.047f, 100.0f, 108.883f};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float[][] f11d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f12e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Method f13f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f14g;

    public static d b(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i7) {
        d dVarD;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i7, typedValue);
            int i10 = typedValue.type;
            if (i10 >= 28 && i10 <= 31) {
                return new d((Shader) null, (ColorStateList) null, typedValue.data);
            }
            try {
                dVarD = d.d(typedArray.getResources(), typedArray.getResourceId(i7, 0), theme);
            } catch (Exception e10) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e10);
                dVarD = null;
            }
            if (dVarD != null) {
                return dVarD;
            }
        }
        return new d((Shader) null, (ColorStateList) null, 0);
    }

    public static boolean c(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static int d(float f2) {
        if (f2 < 1.0f) {
            return -16777216;
        }
        if (f2 > 99.0f) {
            return -1;
        }
        float f7 = (f2 + 16.0f) / 116.0f;
        float f10 = f2 > 8.0f ? f7 * f7 * f7 : f2 / 903.2963f;
        float f11 = f7 * f7 * f7;
        boolean z5 = f11 > 0.008856452f;
        float f12 = z5 ? f11 : ((f7 * 116.0f) - 16.0f) / 903.2963f;
        if (!z5) {
            f11 = ((f7 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f10c;
        return b1.c.a(f12 * fArr[0], f10 * fArr[1], f11 * fArr[2]);
    }

    public static float e(int i7) {
        float f2 = i7 / 255.0f;
        return (f2 <= 0.04045f ? f2 / 12.92f : (float) Math.pow((f2 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static TypedArray f(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* JADX WARN: Code duplicated, block: B:160:0x011c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x0120 A[Catch: all -> 0x015c, TryCatch #5 {all -> 0x015c, blocks: (B:66:0x011c, B:68:0x0120, B:70:0x0124, B:72:0x012d, B:74:0x0133, B:77:0x0139, B:82:0x0149, B:80:0x0142, B:83:0x0151, B:84:0x0155), top: B:160:0x011c, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0124 A[Catch: all -> 0x015c, TryCatch #5 {all -> 0x015c, blocks: (B:66:0x011c, B:68:0x0120, B:70:0x0124, B:72:0x012d, B:74:0x0133, B:77:0x0139, B:82:0x0149, B:80:0x0142, B:83:0x0151, B:84:0x0155), top: B:160:0x011c, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0151 A[Catch: all -> 0x015c, TryCatch #5 {all -> 0x015c, blocks: (B:66:0x011c, B:68:0x0120, B:70:0x0124, B:72:0x012d, B:74:0x0133, B:77:0x0139, B:82:0x0149, B:80:0x0142, B:83:0x0151, B:84:0x0155), top: B:160:0x011c, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0155 A[Catch: all -> 0x015c, TRY_LEAVE, TryCatch #5 {all -> 0x015c, blocks: (B:66:0x011c, B:68:0x0120, B:70:0x0124, B:72:0x012d, B:74:0x0133, B:77:0x0139, B:82:0x0149, B:80:0x0142, B:83:0x0151, B:84:0x0155), top: B:160:0x011c, inners: #1 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v13 */
    public static e i(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        int i7;
        int i10;
        ?? r5;
        long j;
        Throwable th2;
        ?? r6;
        ExecutorService executorService;
        boolean zIsTerminated;
        boolean zIsTerminated2;
        do {
            next = xmlResourceParser.next();
            i7 = 2;
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (!xmlResourceParser.getName().equals("font-family")) {
            k(xmlResourceParser);
            return null;
        }
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), w0.a.f21975b);
        int i11 = 0;
        String string = typedArrayObtainAttributes.getString(0);
        String string2 = typedArrayObtainAttributes.getString(5);
        String string3 = typedArrayObtainAttributes.getString(6);
        String string4 = typedArrayObtainAttributes.getString(2);
        int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
        int i12 = 3;
        int integer = typedArrayObtainAttributes.getInteger(3, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(4, 500);
        String string5 = typedArrayObtainAttributes.getString(7);
        typedArrayObtainAttributes.recycle();
        if (string == null || string2 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlResourceParser.next() != 3) {
                if (xmlResourceParser.getEventType() == 2) {
                    if (xmlResourceParser.getName().equals("font")) {
                        TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), w0.a.f21976c);
                        int i13 = typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(8) ? 8 : 1, ReactFontManager.TypefaceStyle.NORMAL);
                        boolean z5 = 1 == typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(6) ? 6 : 2, 0);
                        int i14 = typedArrayObtainAttributes2.hasValue(9) ? 9 : 3;
                        String string6 = typedArrayObtainAttributes2.getString(typedArrayObtainAttributes2.hasValue(7) ? 7 : 4);
                        int i15 = typedArrayObtainAttributes2.getInt(i14, 0);
                        int i16 = typedArrayObtainAttributes2.hasValue(5) ? 5 : 0;
                        int resourceId2 = typedArrayObtainAttributes2.getResourceId(i16, 0);
                        String string7 = typedArrayObtainAttributes2.getString(i16);
                        typedArrayObtainAttributes2.recycle();
                        while (xmlResourceParser.next() != 3) {
                            k(xmlResourceParser);
                        }
                        arrayList.add(new g(string7, z5, i13, i15, string6, resourceId2));
                    } else {
                        k(xmlResourceParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new f((g[]) arrayList.toArray(new g[0]));
        }
        List listJ = j(resources, resourceId);
        ArrayList arrayList2 = new ArrayList();
        while (xmlResourceParser.next() != i12) {
            if (xmlResourceParser.getEventType() == i7) {
                if (xmlResourceParser.getName().equals("fallback")) {
                    TypedArray typedArrayObtainAttributes3 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), w0.a.f21977d);
                    int i17 = integer;
                    int i18 = 3;
                    try {
                        String string8 = typedArrayObtainAttributes3.getString(i11);
                        String string9 = typedArrayObtainAttributes3.getString(1);
                        String string10 = typedArrayObtainAttributes3.getString(i7);
                        if (string8 == null) {
                            r5 = typedArrayObtainAttributes3;
                            j = 1;
                            throw new XmlPullParserException("query attribute must be set in fallback element");
                        }
                        while (true) {
                            int i19 = i18;
                            if (xmlResourceParser.next() == i19) {
                                break;
                            }
                            try {
                                k(xmlResourceParser);
                                i18 = i19;
                            } catch (Throwable th3) {
                                th2 = th3;
                                r6 = typedArrayObtainAttributes3;
                                j = 1;
                            }
                        }
                        try {
                            r5 = typedArrayObtainAttributes3;
                            i10 = i17;
                            j = 1;
                            try {
                                i1.c cVar = new i1.c(listJ, string, string2, string8, string9, string10);
                                if (r5 instanceof AutoCloseable) {
                                    ((AutoCloseable) r5).close();
                                } else if (r5 instanceof ExecutorService) {
                                    ExecutorService executorService2 = (ExecutorService) r5;
                                    if (executorService2 != ForkJoinPool.commonPool() && !(zIsTerminated2 = executorService2.isTerminated())) {
                                        executorService2.shutdown();
                                        boolean z6 = false;
                                        while (!zIsTerminated2) {
                                            try {
                                                zIsTerminated2 = executorService2.awaitTermination(1L, TimeUnit.DAYS);
                                            } catch (InterruptedException unused) {
                                                if (!z6) {
                                                    executorService2.shutdownNow();
                                                    z6 = true;
                                                }
                                            }
                                        }
                                        if (z6) {
                                            Thread.currentThread().interrupt();
                                        }
                                    }
                                } else {
                                    r5.recycle();
                                }
                                arrayList2.add(cVar);
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            r5 = typedArrayObtainAttributes3;
                            j = 1;
                            th2 = th;
                            r6 = r5;
                            if (r6 != 0) {
                                throw th2;
                            }
                            try {
                                if (!(r6 instanceof AutoCloseable)) {
                                    ((AutoCloseable) r6).close();
                                    throw th2;
                                }
                                if (r6 instanceof ExecutorService) {
                                    r6.recycle();
                                    throw th2;
                                }
                                executorService = (ExecutorService) r6;
                                if (executorService != ForkJoinPool.commonPool()) {
                                    throw th2;
                                }
                                throw th2;
                            } catch (Throwable th6) {
                                th2.addSuppressed(th6);
                                throw th2;
                            }
                        }
                        th = th4;
                    } catch (Throwable th7) {
                        th = th7;
                        r5 = typedArrayObtainAttributes3;
                    }
                    th2 = th;
                    r6 = r5;
                    if (r6 != 0) {
                        throw th2;
                    }
                    if (!(r6 instanceof AutoCloseable)) {
                        ((AutoCloseable) r6).close();
                        throw th2;
                    }
                    if (r6 instanceof ExecutorService) {
                        r6.recycle();
                        throw th2;
                    }
                    executorService = (ExecutorService) r6;
                    if (executorService != ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
                        throw th2;
                    }
                    executorService.shutdown();
                    boolean z7 = false;
                    while (!zIsTerminated) {
                        try {
                            zIsTerminated = executorService.awaitTermination(j, TimeUnit.DAYS);
                        } catch (InterruptedException unused2) {
                            if (!z7) {
                                executorService.shutdownNow();
                                z7 = true;
                            }
                        }
                    }
                    if (!z7) {
                        throw th2;
                    }
                    Thread.currentThread().interrupt();
                    throw th2;
                }
                i10 = integer;
                k(xmlResourceParser);
                integer = i10;
                string3 = string3;
                string4 = string4;
                i7 = 2;
                i11 = 0;
                i12 = 3;
            }
        }
        int i20 = integer;
        String str = string3;
        String str2 = string4;
        if (!arrayList2.isEmpty()) {
            return new h(arrayList2, i20, integer2, string5);
        }
        if (str == null) {
            throw new IllegalArgumentException("The provider font XML requires query attribute or fallback children.");
        }
        arrayList2.add(new i1.c(listJ, string, string2, str, null, null));
        if (str2 != null) {
            arrayList2.add(new i1.c(listJ, string, string2, str2, null, null));
        }
        return new h(arrayList2, i20, integer2, string5);
    }

    public static List j(Resources resources, int i7) {
        if (i7 == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i7);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (typedArrayObtainTypedArray.getType(0) == 1) {
                for (int i10 = 0; i10 < typedArrayObtainTypedArray.length(); i10++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i10, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i7);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    public static void k(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i7 = 1;
        while (i7 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i7++;
            } else if (next == 3) {
                i7--;
            }
        }
    }

    public static float l() {
        return ((float) Math.pow((((double) 50.0f) + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }

    public void a(int i7) {
        new Handler(Looper.getMainLooper()).post(new l(i7, 0, this));
    }

    public abstract void g(int i7);

    public abstract void h(Typeface typeface);
}
