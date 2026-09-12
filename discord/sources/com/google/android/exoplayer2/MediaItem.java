package com.google.android.exoplayer2;

import android.net.Uri;
import ei.c0;
import ei.e0;
import ei.r0;
import ei.w0;
import gc.g;
import gc.j0;
import gc.l0;
import gc.m0;
import gc.n0;
import gc.o0;
import gc.p0;
import gc.q0;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class MediaItem implements g {
    public static final MediaItem E;
    public static final String F;
    public static final String G;
    public static final String H;
    public static final String I;
    public static final String J;
    public static final String K;
    public static final gb.a L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f5533d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p0 f5534e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p0 f5535i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final o0 f5536v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final MediaMetadata f5537w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final l0 f5538x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final q0 f5539y;

    static {
        j0 j0Var = new j0();
        c0 c0Var = e0.f8303e;
        r0 r0Var = r0.f8352w;
        List list = Collections.EMPTY_LIST;
        E = new MediaItem("", new l0(j0Var), null, new o0(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), MediaMetadata.f5540f0, q0.f9821i);
        int i7 = je.e0.f13788a;
        F = Integer.toString(0, 36);
        G = Integer.toString(1, 36);
        H = Integer.toString(2, 36);
        I = Integer.toString(3, 36);
        J = Integer.toString(4, 36);
        K = Integer.toString(5, 36);
        L = new gb.a(10);
    }

    public MediaItem(String str, l0 l0Var, p0 p0Var, o0 o0Var, MediaMetadata mediaMetadata, q0 q0Var) {
        this.f5533d = str;
        this.f5534e = p0Var;
        this.f5535i = p0Var;
        this.f5536v = o0Var;
        this.f5537w = mediaMetadata;
        this.f5538x = l0Var;
        this.f5539y = q0Var;
    }

    public static MediaItem a(String str) {
        p0 p0Var;
        j0 j0Var = new j0();
        m0 m0Var = new m0();
        m0Var.f9775c = w0.f8376y;
        c0 c0Var = e0.f8303e;
        r0 r0Var = r0.f8352w;
        m0Var.f9779g = r0Var;
        List list = Collections.EMPTY_LIST;
        q0 q0Var = q0.f9821i;
        Uri uri = str == null ? null : Uri.parse(str);
        je.b.k(m0Var.f9774b == null || m0Var.f9773a != null);
        if (uri != null) {
            p0Var = new p0(uri, null, m0Var.f9773a != null ? new n0(m0Var) : null, null, list, null, r0Var);
        } else {
            p0Var = null;
        }
        return new MediaItem("", new l0(j0Var), p0Var, new o0(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), MediaMetadata.f5540f0, q0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaItem)) {
            return false;
        }
        MediaItem mediaItem = (MediaItem) obj;
        return je.e0.a(this.f5533d, mediaItem.f5533d) && this.f5538x.equals(mediaItem.f5538x) && je.e0.a(this.f5534e, mediaItem.f5534e) && je.e0.a(this.f5536v, mediaItem.f5536v) && je.e0.a(this.f5537w, mediaItem.f5537w) && je.e0.a(this.f5539y, mediaItem.f5539y);
    }

    public final int hashCode() {
        int iHashCode = this.f5533d.hashCode() * 31;
        p0 p0Var = this.f5534e;
        return this.f5539y.hashCode() + ((this.f5537w.hashCode() + ((this.f5538x.hashCode() + ((this.f5536v.hashCode() + ((iHashCode + (p0Var != null ? p0Var.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }
}
