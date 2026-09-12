package com.google.android.gms.net;

import af.w;
import android.content.Context;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;
import mf.d;
import org.chromium.net.ApiVersion;
import xe.f;
import xe.g;
import xe.h;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f6211a = f.f22924b;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f6212b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static d f6213c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f6214d = "0";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f6215e;

    public static boolean a() {
        boolean z5;
        Object obj = f6212b;
        synchronized (obj) {
            try {
                if (f6215e) {
                    return true;
                }
                synchronized (obj) {
                    z5 = f6213c != null;
                }
                return z5;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void b(Context context) {
        synchronized (f6212b) {
            try {
                if (a()) {
                    return;
                }
                c cVar = new c(context, 37401, 1.0f);
                try {
                    Trace.beginSection("PlayServices CronetProviderInstaller#installIfNeeded");
                    try {
                        w.h(context, "Context must not be null");
                        if (HttpEngineProviderSingleton.getInstance(context).shouldUseHttpEngine()) {
                            f6215e = true;
                            cVar.f6225x = 0;
                            Trace.endSection();
                            cVar.close();
                            return;
                        }
                        ClassLoader classLoader = a.class.getClassLoader();
                        w.g(classLoader);
                        try {
                            classLoader.loadClass("org.chromium.net.CronetEngine");
                            int apiLevel = ApiVersion.getApiLevel();
                            Trace.beginSection("PlayServices CronetProviderInstaller#installIfNeeded verifyGooglePlayServicesIsAvailable");
                            try {
                                f fVar = f6211a;
                                fVar.getClass();
                                f.c(context);
                                Trace.endSection();
                                try {
                                    Trace.beginSection("CronetProviderInstaller#installIfNeeded DynamiteModule#load");
                                    try {
                                        d dVarB = d.b(context, d.f15744b);
                                        Trace.endSection();
                                        try {
                                            Trace.beginSection("PlayServices CronetProviderInstaller#installIfNeeded loading class");
                                            try {
                                                Class<?> clsLoadClass = dVarB.f15753a.getClassLoader().loadClass("org.chromium.net.impl.ImplVersion");
                                                if (clsLoadClass.getClassLoader() == a.class.getClassLoader()) {
                                                    Log.e("a", "ImplVersion class is missing from Cronet module.");
                                                    throw new g();
                                                }
                                                Method method = clsLoadClass.getMethod("getApiLevel", null);
                                                Method method2 = clsLoadClass.getMethod("getCronetVersion", null);
                                                Integer num = (Integer) method.invoke(null, null);
                                                w.g(num);
                                                int iIntValue = num.intValue();
                                                String str = (String) method2.invoke(null, null);
                                                w.g(str);
                                                f6214d = str;
                                                Trace.endSection();
                                                if (apiLevel <= iIntValue) {
                                                    f6213c = dVarB;
                                                    cVar.f6225x = 0;
                                                    Trace.endSection();
                                                    cVar.close();
                                                    return;
                                                }
                                                if (fVar.a(context, "cr", 2) == null) {
                                                    Log.e("a", "Unable to fetch error resolution intent");
                                                    throw new g();
                                                }
                                                String str2 = f6214d;
                                                StringBuilder sb2 = new StringBuilder(String.valueOf(apiLevel).length() + 113 + String.valueOf(iIntValue).length() + 39 + String.valueOf(str2).length());
                                                sb2.append("Google Play Services update is required. The API Level of the client is ");
                                                sb2.append(apiLevel);
                                                sb2.append(". The API Level of the implementation is ");
                                                sb2.append(iIntValue);
                                                sb2.append(". The Cronet implementation version is ");
                                                sb2.append(str2);
                                                throw new h(sb2.toString());
                                            } catch (Throwable th2) {
                                                try {
                                                    Trace.endSection();
                                                } catch (Throwable th3) {
                                                    th2.addSuppressed(th3);
                                                }
                                                throw th2;
                                            }
                                        } catch (Exception e10) {
                                            Log.e("a", "Unable to read Cronet version from the Cronet module ", e10);
                                            throw ((g) new g().initCause(e10));
                                        }
                                    } catch (Throwable th4) {
                                        try {
                                            Trace.endSection();
                                        } catch (Throwable th5) {
                                            th4.addSuppressed(th5);
                                        }
                                        throw th4;
                                    }
                                } catch (mf.b e11) {
                                    Log.e("a", "Unable to load Cronet module", e11);
                                    throw ((g) new g().initCause(e11));
                                }
                            } catch (Throwable th6) {
                                try {
                                    Trace.endSection();
                                } catch (Throwable th7) {
                                    th6.addSuppressed(th7);
                                }
                                throw th6;
                            }
                        } catch (ClassNotFoundException e12) {
                            Log.e("a", "Cronet API is not available. Have you included all required dependencies?");
                            throw ((g) new g().initCause(e12));
                        }
                    } catch (Throwable th8) {
                        try {
                            Trace.endSection();
                        } catch (Throwable th9) {
                            th8.addSuppressed(th9);
                        }
                        throw th8;
                    }
                } catch (Throwable th10) {
                    cVar.close();
                    throw th10;
                }
                try {
                    cVar.close();
                } catch (Throwable th11) {
                    th10.addSuppressed(th11);
                }
                throw th10;
            } catch (Throwable th12) {
                throw th12;
            }
        }
    }
}
