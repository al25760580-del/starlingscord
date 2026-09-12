package b1;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class i extends g {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Class f3040g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Constructor f3041h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Method f3042i;
    public final Method j;
    public final Method k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Method f3043l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Method f3044m;

    public i() throws NoSuchMethodException {
        Method methodZ;
        Constructor<?> constructor;
        Method methodY;
        Method method;
        Method method2;
        Method method3;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            methodY = Y(cls2);
            Class cls3 = Integer.TYPE;
            method = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method2 = cls2.getMethod("freeze", null);
            method3 = cls2.getMethod("abortCreation", null);
            methodZ = Z(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e10.getClass().getName()), e10);
            methodZ = null;
            constructor = null;
            methodY = null;
            method = null;
            method2 = null;
            method3 = null;
        }
        this.f3040g = cls;
        this.f3041h = constructor;
        this.f3042i = methodY;
        this.j = method;
        this.k = method2;
        this.f3043l = method3;
        this.f3044m = methodZ;
    }

    public static Method Y(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    public final boolean V(Context context, Object obj, String str, int i7, int i10, int i11, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f3042i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i7), Integer.valueOf(i10), Integer.valueOf(i11), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface W(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f3040g, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f3044m.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean X(Object obj) {
        try {
            return ((Boolean) this.k.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Method Z(Class cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // b1.g, gn.h
    public final Typeface o(Context context, a1.f fVar, Resources resources, int i7) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        Method method = this.f3042i;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.o(context, fVar, resources, i7);
        }
        try {
            objNewInstance = this.f3041h.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            a1.g[] gVarArr = fVar.f20a;
            int length = gVarArr.length;
            int i10 = 0;
            while (i10 < length) {
                a1.g gVar = gVarArr[i10];
                Context context2 = context;
                if (V(context2, objNewInstance, gVar.f21a, gVar.f25e, gVar.f22b, gVar.f23c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(gVar.f24d))) {
                    i10++;
                    context = context2;
                } else {
                    try {
                        this.f3043l.invoke(objNewInstance, null);
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                }
            }
            if (X(objNewInstance)) {
                return W(objNewInstance);
            }
        }
        return null;
    }

    @Override // b1.g, gn.h
    public final Typeface p(Context context, i1.h[] hVarArr, int i7) throws IOException {
        Object objNewInstance;
        Typeface typefaceW;
        boolean zBooleanValue;
        if (hVarArr.length >= 1) {
            Method method = this.f3042i;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            try {
                if (method != null) {
                    HashMap map = new HashMap();
                    for (i1.h hVar : hVarArr) {
                        if (hVar.f11379f == 0) {
                            Uri uri = hVar.f11374a;
                            if (!map.containsKey(uri)) {
                                map.put(uri, ib.a.A(context, uri));
                            }
                        }
                    }
                    Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
                    try {
                        objNewInstance = this.f3041h.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        objNewInstance = null;
                    }
                    if (objNewInstance != null) {
                        int length = hVarArr.length;
                        int i10 = 0;
                        boolean z5 = false;
                        while (true) {
                            Method method2 = this.f3043l;
                            if (i10 >= length) {
                                if (!z5) {
                                    method2.invoke(objNewInstance, null);
                                    break;
                                }
                                if (!X(objNewInstance) || (typefaceW = W(objNewInstance)) == null) {
                                    break;
                                    break;
                                }
                                return Typeface.create(typefaceW, i7);
                            }
                            i1.h hVar2 = hVarArr[i10];
                            ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(hVar2.f11374a);
                            if (byteBuffer != null) {
                                try {
                                    zBooleanValue = ((Boolean) this.j.invoke(objNewInstance, byteBuffer, Integer.valueOf(hVar2.f11375b), null, Integer.valueOf(hVar2.f11376c), Integer.valueOf(hVar2.f11377d ? 1 : 0))).booleanValue();
                                } catch (IllegalAccessException | InvocationTargetException unused2) {
                                    zBooleanValue = false;
                                }
                                if (!zBooleanValue) {
                                    method2.invoke(objNewInstance, null);
                                    break;
                                }
                                z5 = true;
                            }
                            i10++;
                            z5 = z5;
                        }
                    }
                } else {
                    i1.h hVarW = w(hVarArr, i7);
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(hVarW.f11374a, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        try {
                            Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(hVarW.f11376c).setItalic(hVarW.f11377d).build();
                            parcelFileDescriptorOpenFileDescriptor.close();
                            return typefaceBuild;
                        } catch (Throwable th2) {
                            try {
                                parcelFileDescriptorOpenFileDescriptor.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    }
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return null;
                    }
                }
            } catch (IOException | IllegalAccessException | InvocationTargetException unused3) {
            }
        }
        return null;
    }

    @Override // gn.h
    public final Typeface s(Context context, Resources resources, int i7, String str, int i10) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        Method method = this.f3042i;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.s(context, resources, i7, str, i10);
        }
        try {
            objNewInstance = this.f3041h.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            if (!V(context, objNewInstance, str, 0, -1, -1, null)) {
                try {
                    this.f3043l.invoke(objNewInstance, null);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            } else if (X(objNewInstance)) {
                return W(objNewInstance);
            }
        }
        return null;
    }
}
