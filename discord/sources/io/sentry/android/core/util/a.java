package io.sentry.android.core.util;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f12426a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hm.a f12427b;

    public a(hm.a aVar) {
        this.f12427b = aVar;
    }

    public final Object a(Context context) {
        if (this.f12426a == null) {
            synchronized (this) {
                try {
                    if (this.f12426a == null) {
                        this.f12426a = this.f12427b.f(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f12426a;
    }
}
