package io.sentry;

import com.reactnativecommunity.clipboard.ClipboardModule;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f12029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final io.sentry.protocol.i0 f12030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.facebook.react.runtime.o f12031c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f12032d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f12033e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f12034f;

    public a(byte[] bArr) {
        this.f12029a = bArr;
        this.f12030b = null;
        this.f12031c = null;
        this.f12032d = "thread-dump.txt";
        this.f12033e = "text/plain";
        this.f12034f = "event.attachment";
    }

    public a(io.sentry.protocol.i0 i0Var) {
        this.f12029a = null;
        this.f12030b = i0Var;
        this.f12031c = null;
        this.f12032d = "view-hierarchy.json";
        this.f12033e = "application/json";
        this.f12034f = "event.view_hierarchy";
    }

    public a(com.facebook.react.runtime.o oVar) {
        this.f12029a = null;
        this.f12030b = null;
        this.f12031c = oVar;
        this.f12032d = "screenshot.png";
        this.f12033e = ClipboardModule.MIMETYPE_PNG;
        this.f12034f = "event.attachment";
    }
}
