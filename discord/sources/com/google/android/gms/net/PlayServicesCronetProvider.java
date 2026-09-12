package com.google.android.gms.net;

import af.w;
import android.content.Context;
import android.os.Trace;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByReflection;
import java.util.Arrays;
import mf.d;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetProvider;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.ICronetEngineBuilder;
import xe.g;
import xe.h;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public class PlayServicesCronetProvider extends CronetProvider {
    private static final String NATIVE_CRONET_ENGINE_BUILDER_IMPL = "org.chromium.net.impl.NativeCronetEngineBuilderImpl";
    private static final String TAG = "PlayServicesCronet";

    @UsedByReflection("CronetAPI")
    public PlayServicesCronetProvider(@NonNull Context context) {
        super(context);
    }

    private static Class<? extends ICronetEngineBuilder> subclassNativeCronetEngine(ClassLoader classLoader) {
        try {
            return classLoader.loadClass(NATIVE_CRONET_ENGINE_BUILDER_IMPL).asSubclass(ICronetEngineBuilder.class);
        } catch (ClassCastException e10) {
            throw new IllegalStateException(String.format("Failed to subclass native cronet engine!, NativeCronetEngineBuilderImpl Classloader: %s, ICronetEngineBuilder Classloader: %s", classLoader, ICronetEngineBuilder.class.getClassLoader()), e10);
        }
    }

    private void tryToInstallCronetProvider() {
        try {
            a.b(this.mContext);
        } catch (g unused) {
            if (Log.isLoggable(TAG, 4)) {
                Log.i(TAG, "Google-Play-Services-Cronet-Provider is unavailable.");
            }
        } catch (h unused2) {
            if (Log.isLoggable(TAG, 4)) {
                Log.i(TAG, "Google-Play-Services-Cronet-Provider is not installed yet.");
            }
        }
    }

    @Override // org.chromium.net.CronetProvider
    @NonNull
    @Keep
    public CronetEngine.Builder createBuilder() {
        d dVar;
        CronetEngine.Builder builderCreateBuilder;
        Trace.beginSection("GMS PlayServicesCronetProvider#createBuilder");
        try {
            try {
                try {
                    a.b(this.mContext);
                    try {
                        c cVar = new c(this.mContext, 37402, 0.01f);
                        try {
                            HttpEngineProviderSingleton httpEngineProviderSingleton = HttpEngineProviderSingleton.getInstance(this.mContext);
                            if (httpEngineProviderSingleton.shouldUseHttpEngine()) {
                                builderCreateBuilder = httpEngineProviderSingleton.getHttpEngineProvider().createBuilder();
                                cVar.f6225x = 0;
                                cVar.close();
                            } else {
                                synchronized (a.f6212b) {
                                    dVar = a.f6213c;
                                }
                                w.g(dVar);
                                ClassLoader classLoader = dVar.f15753a.getClassLoader();
                                w.g(classLoader);
                                ExperimentalCronetEngine.Builder builder = new ExperimentalCronetEngine.Builder(subclassNativeCronetEngine(classLoader).getConstructor(Context.class).newInstance(this.mContext));
                                cVar.f6225x = 0;
                                cVar.close();
                                builderCreateBuilder = builder;
                            }
                            Trace.endSection();
                            return builderCreateBuilder;
                        } catch (Throwable th2) {
                            try {
                                cVar.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    } catch (ReflectiveOperationException e10) {
                        throw new RuntimeException("Unable to construct the implementation of the Cronet Engine Builder: org.chromium.net.impl.NativeCronetEngineBuilderImpl", e10);
                    }
                } catch (Throwable th4) {
                    try {
                        Trace.endSection();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                    throw th4;
                }
            } catch (g e11) {
                throw new IllegalStateException("Google Play Services Cronet provider is unavailable on this device.", e11);
            }
        } catch (h e12) {
            throw new IllegalStateException("Google Play Services Cronet provider is not enabled. Call com.google.android.gms.net.CronetProviderInstaller.installIfNeeded(Context) to enable it.", e12);
        }
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof PlayServicesCronetProvider) && this.mContext.equals(((PlayServicesCronetProvider) obj).mContext);
        }
        return true;
    }

    @Override // org.chromium.net.CronetProvider
    @NonNull
    @Keep
    public String getName() {
        return "Google-Play-Services-Cronet-Provider";
    }

    @Override // org.chromium.net.CronetProvider
    @NonNull
    @Keep
    public String getVersion() {
        String str;
        HttpEngineProviderSingleton httpEngineProviderSingleton = HttpEngineProviderSingleton.getInstance(this.mContext);
        if (httpEngineProviderSingleton.shouldUseHttpEngine()) {
            return httpEngineProviderSingleton.getHttpEngineProvider().getVersion();
        }
        tryToInstallCronetProvider();
        synchronized (a.f6212b) {
            str = a.f6214d;
        }
        return str;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{PlayServicesCronetProvider.class, this.mContext});
    }

    @Override // org.chromium.net.CronetProvider
    @Keep
    public boolean isEnabled() {
        if (HttpEngineProviderSingleton.getInstance(this.mContext).shouldUseHttpEngine()) {
            return true;
        }
        tryToInstallCronetProvider();
        return a.a();
    }
}
