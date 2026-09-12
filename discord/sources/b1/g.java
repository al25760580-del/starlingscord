package b1;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class g extends gn.h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Class f3031b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Constructor f3032c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Method f3033d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Method f3034e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f3035f = false;

    public static boolean T(String str, boolean z5, int i7, Object obj) throws NoSuchMethodException {
        U();
        try {
            return ((Boolean) f3033d.invoke(obj, str, Integer.valueOf(i7), Boolean.valueOf(z5))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static void U() throws NoSuchMethodException {
        Method method;
        Class<?> cls;
        Method method2;
        if (f3035f) {
            return;
        }
        f3035f = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi21Impl", e10.getClass().getName(), e10);
            method = null;
            cls = null;
            method2 = null;
        }
        f3032c = constructor;
        f3031b = cls;
        f3033d = method2;
        f3034e = method;
    }

    @Override // gn.h
    public Typeface o(Context context, a1.f fVar, Resources resources, int i7) throws NoSuchMethodException {
        U();
        try {
            Object objNewInstance = f3032c.newInstance(null);
            for (a1.g gVar : fVar.f20a) {
                File fileU = ib.a.u(context);
                if (fileU == null) {
                    return null;
                }
                try {
                    if (!ib.a.k(fileU, resources, gVar.f26f)) {
                        return null;
                    }
                    if (!T(fileU.getPath(), gVar.f23c, gVar.f22b, objNewInstance)) {
                        return null;
                    }
                    fileU.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    fileU.delete();
                }
            }
            U();
            try {
                Object objNewInstance2 = Array.newInstance((Class<?>) f3031b, 1);
                Array.set(objNewInstance2, 0, objNewInstance);
                return (Typeface) f3034e.invoke(null, objNewInstance2);
            } catch (IllegalAccessException | InvocationTargetException e10) {
                throw new RuntimeException(e10);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // gn.h
    public Typeface p(Context context, i1.h[] hVarArr, int i7) {
        File file;
        if (hVarArr.length >= 1) {
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(w(hVarArr, i7).f11374a, "r", null);
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    try {
                        try {
                            String str = Os.readlink("/proc/self/fd/" + parcelFileDescriptorOpenFileDescriptor.getFd());
                            file = OsConstants.S_ISREG(Os.stat(str).st_mode) ? new File(str) : null;
                        } catch (Throwable th2) {
                            try {
                                parcelFileDescriptorOpenFileDescriptor.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    } catch (ErrnoException unused) {
                    }
                    if (file != null && file.canRead()) {
                        Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return typefaceCreateFromFile;
                    }
                    FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                    try {
                        Typeface typefaceR = r(context, fileInputStream);
                        fileInputStream.close();
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return typefaceR;
                    } catch (Throwable th4) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                        }
                        throw th4;
                    }
                }
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return null;
                }
            } catch (IOException unused2) {
            }
        }
        return null;
    }
}
