package b1;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import androidx.collection.SimpleArrayMap;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class h extends gn.h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class f3036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Constructor f3037c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Method f3038d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Method f3039e;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi24Impl", e10.getClass().getName(), e10);
            cls = null;
            method = null;
            method2 = null;
        }
        f3037c = constructor;
        f3036b = cls;
        f3038d = method2;
        f3039e = method;
    }

    public static boolean T(Object obj, ByteBuffer byteBuffer, int i7, int i10, boolean z5) {
        try {
            return ((Boolean) f3038d.invoke(obj, byteBuffer, Integer.valueOf(i7), null, Integer.valueOf(i10), Boolean.valueOf(z5))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface U(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) f3036b, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f3039e.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // gn.h
    public final Typeface o(Context context, a1.f fVar, Resources resources, int i7) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        MappedByteBuffer map;
        try {
            objNewInstance = f3037c.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            for (a1.g gVar : fVar.f20a) {
                int i10 = gVar.f26f;
                File fileU = ib.a.u(context);
                if (fileU != null) {
                    try {
                        if (ib.a.k(fileU, resources, i10)) {
                            try {
                                FileInputStream fileInputStream = new FileInputStream(fileU);
                                try {
                                    FileChannel channel = fileInputStream.getChannel();
                                    map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                    fileInputStream.close();
                                    fileU.delete();
                                } catch (Throwable th2) {
                                    try {
                                        fileInputStream.close();
                                    } catch (Throwable th3) {
                                        th2.addSuppressed(th3);
                                    }
                                    throw th2;
                                }
                            } catch (IOException unused2) {
                                map = null;
                            }
                        } else {
                            fileU.delete();
                        }
                        if (map != null && T(objNewInstance, map, gVar.f25e, gVar.f22b, gVar.f23c)) {
                        }
                    } catch (Throwable th4) {
                        fileU.delete();
                        throw th4;
                    }
                }
                map = null;
                if (map != null) {
                }
            }
            return U(objNewInstance);
        }
        return null;
    }

    @Override // gn.h
    public final Typeface p(Context context, i1.h[] hVarArr, int i7) {
        Object objNewInstance;
        try {
            objNewInstance = f3037c.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            SimpleArrayMap simpleArrayMap = new SimpleArrayMap(0);
            for (i1.h hVar : hVarArr) {
                Uri uri = hVar.f11374a;
                ByteBuffer byteBufferA = (ByteBuffer) simpleArrayMap.get(uri);
                if (byteBufferA == null) {
                    byteBufferA = ib.a.A(context, uri);
                    simpleArrayMap.put(uri, byteBufferA);
                }
                if (byteBufferA != null && T(objNewInstance, byteBufferA, hVar.f11375b, hVar.f11376c, hVar.f11377d)) {
                }
            }
            Typeface typefaceU = U(objNewInstance);
            if (typefaceU != null) {
                return Typeface.create(typefaceU, i7);
            }
        }
        return null;
    }
}
