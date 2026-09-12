package io.sentry.android.core;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import io.sentry.SentryLevel;
import io.sentry.c4;
import io.sentry.v4;

/* JADX INFO: loaded from: classes3.dex */
public final class SentryInitProvider extends q0 {
    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        if (SentryInitProvider.class.getName().equals(providerInfo.authority)) {
            throw new IllegalStateException("An applicationId is required to fulfill the manifest placeholder.");
        }
        super.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        boolean zF;
        m0 m0Var = new m0(1);
        Context context = getContext();
        if (context == null) {
            m0Var.q(SentryLevel.FATAL, "App. Context from ContentProvider is null", new Object[0]);
            return false;
        }
        try {
            ApplicationInfo applicationInfo = Build.VERSION.SDK_INT >= 33 ? (ApplicationInfo) l0.f12347d.a(context) : (ApplicationInfo) l0.f12348e.a(context);
            Bundle bundle = applicationInfo != null ? applicationInfo.metaData : null;
            zF = bundle != null ? w0.f(bundle, m0Var, "io.sentry.auto-init", true) : true;
        } catch (Throwable th2) {
            m0Var.g(SentryLevel.ERROR, "Failed to read auto-init from android manifest metadata.", th2);
        }
        if (zF && !l0.c(context)) {
            d1.b(context, m0Var, new hm.a(24));
            v4.d().a("AutoInit");
        }
        return true;
    }

    @Override // android.content.ContentProvider
    public final void shutdown() {
        c4.c();
    }
}
