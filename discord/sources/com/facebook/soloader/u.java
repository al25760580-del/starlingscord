package com.facebook.soloader;

import android.os.StrictMode;
import android.os.Trace;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes3.dex */
public abstract class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f5422a;

    static {
        new ReentrantReadWriteLock();
        t tVar = new t();
        tVar.add("libEGL.so");
        tVar.add("libGLESv2.so");
        tVar.add("libGLESv3.so");
        tVar.add("libOpenSLES.so");
        tVar.add("libandroid.so");
        tVar.add("libc.so");
        tVar.add("libdl.so");
        tVar.add("libjnigraphics.so");
        tVar.add("liblog.so");
        tVar.add("libm.so");
        tVar.add("libstdc++.so");
        tVar.add("libz.so");
        f5422a = tVar;
    }

    public static String[] a(String str, g gVar) {
        boolean z5 = SoLoader.f5363a;
        if (z5) {
            Api18TraceUtils.a("soloader.NativeDeps.getDependencies[", str, "]");
        }
        AtomicReference atomicReference = jb.b.f13720a;
        jb.a[] aVarArr = (jb.a[]) atomicReference.get();
        if (aVarArr != null && aVarArr.length > 0) {
            jb.a aVar = aVarArr[0];
            throw null;
        }
        try {
            try {
                String[] strArrC = r.c(gVar);
                jb.a[] aVarArr2 = (jb.a[]) atomicReference.get();
                if (aVarArr2 != null && aVarArr2.length > 0) {
                    jb.a aVar2 = aVarArr2[0];
                    throw null;
                }
                if (z5) {
                    Trace.endSection();
                }
                return strArrC;
            } catch (s e10) {
                throw r.a(str, e10);
            } catch (Error e11) {
                throw e11;
            } catch (RuntimeException e12) {
                throw e12;
            }
        } catch (Throwable th2) {
            jb.a[] aVarArr3 = (jb.a[]) jb.b.f13720a.get();
            if (aVarArr3 != null && aVarArr3.length > 0) {
                jb.a aVar3 = aVarArr3[0];
                throw null;
            }
            if (SoLoader.f5363a) {
                Trace.endSection();
            }
            throw th2;
        }
    }

    public static void b(String str, h hVar, int i7, StrictMode.ThreadPolicy threadPolicy) {
        String[] strArrA = a(str, hVar);
        StringBuilder sbN = com.discord.chat.presentation.list.a.n("Loading ", str, "'s dependencies: ");
        sbN.append(Arrays.toString(strArrA));
        r.b(sbN.toString());
        for (String str2 : strArrA) {
            if (!str2.startsWith("/") && !f5422a.contains(str2)) {
                SoLoader.l(str2, i7, threadPolicy);
            }
        }
    }
}
