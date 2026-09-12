package com.facebook.cache.disk;

import android.content.Context;
import com.facebook.common.internal.Supplier;
import i8.b;
import j8.d;
import k8.a;
import q8.c;

/* JADX INFO: loaded from: classes3.dex */
public final class DiskCacheConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Supplier f4615c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f4616d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f4617e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f4618f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f4619g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f4620h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final i8.c f4621i;
    public final Context j;

    public DiskCacheConfig(d dVar) {
        b bVar;
        i8.c cVar;
        Context context = (Context) dVar.f13683e;
        this.j = context;
        Supplier supplier = (Supplier) dVar.f13681c;
        if (!((supplier == null && context == null) ? false : true)) {
            throw new IllegalStateException("Either a non-null context or a base directory path or supplier must be provided.");
        }
        if (supplier == null && context != null) {
            dVar.f13681c = new j8.c(0, this);
        }
        this.f4613a = 1;
        String str = (String) dVar.f13680b;
        str.getClass();
        this.f4614b = str;
        Supplier supplier2 = (Supplier) dVar.f13681c;
        supplier2.getClass();
        this.f4615c = supplier2;
        this.f4616d = dVar.f13679a;
        this.f4617e = 10485760L;
        this.f4618f = 2097152L;
        this.f4619g = (c) dVar.f13682d;
        synchronized (b.class) {
            try {
                if (b.f11394e == null) {
                    b.f11394e = new b(0);
                }
                bVar = b.f11394e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f4620h = bVar;
        synchronized (i8.c.class) {
            try {
                if (i8.c.f11396e == null) {
                    i8.c.f11396e = new i8.c(0);
                }
                cVar = i8.c.f11396e;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        this.f4621i = cVar;
        synchronized (a.class) {
            if (a.f14310d == null) {
                a.f14310d = new a();
            }
        }
    }
}
