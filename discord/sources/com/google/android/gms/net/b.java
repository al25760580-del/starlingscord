package com.google.android.gms.net;

import af.l;
import android.content.Context;
import java.util.concurrent.atomic.AtomicLong;
import ye.h;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile b f6216c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f6217d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cf.b f6218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicLong f6219b = new AtomicLong(-1);

    public b(Context context) {
        this.f6218a = new cf.b(context, null, cf.b.k, new l("module:cronet_dynamite"), h.f23298c);
    }
}
