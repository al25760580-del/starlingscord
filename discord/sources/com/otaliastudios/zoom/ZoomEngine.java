package com.otaliastudios.zoom;

import android.content.Context;
import android.graphics.RectF;
import androidx.appcompat.widget.i0;
import com.discord.zoom_layout.ZoomLayoutFixed;
import dl.e;
import dl.g;
import dl.h;
import e4.l;
import el.a;
import fl.d;
import hl.b;
import hl.c;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import w3.q;

/* JADX INFO: loaded from: classes3.dex */
public final class ZoomEngine {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final ZoomLogger f7018l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ZoomLayoutFixed f7021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i0 f7022d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l f7023e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a f7024f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f7025g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c f7026h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final gl.a f7027i;
    public final d j;
    public final fl.c k;

    static {
        Intrinsics.checkNotNullExpressionValue("ZoomEngine", "TAG");
        Intrinsics.checkNotNullParameter("ZoomEngine", "tag");
        f7018l = new ZoomLogger("ZoomEngine");
    }

    public ZoomEngine(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        i0 i0Var = new i0(this);
        this.f7022d = i0Var;
        this.f7023e = new l(this);
        a aVar = new a(i0Var);
        this.f7024f = aVar;
        b bVar = new b(this, new g(this, 0));
        this.f7025g = bVar;
        c cVar = new c(this, new g(this, 1));
        this.f7026h = cVar;
        gl.a aVar2 = new gl.a(cVar, bVar, aVar, i0Var);
        this.f7027i = aVar2;
        this.j = new d(context, bVar, aVar, aVar2);
        this.k = new fl.c(context, cVar, bVar, aVar, aVar2);
    }

    public static final float a(ZoomEngine zoomEngine) {
        gl.a aVar = zoomEngine.f7027i;
        int i7 = zoomEngine.f7019a;
        ZoomLogger zoomLogger = f7018l;
        if (i7 == 0) {
            float fWidth = aVar.j / aVar.f10101f.width();
            float fHeight = aVar.k / aVar.f10101f.height();
            zoomLogger.c("computeTransformationZoom", "centerInside", "scaleX:", Float.valueOf(fWidth), "scaleY:", Float.valueOf(fHeight));
            return Math.min(fWidth, fHeight);
        }
        if (i7 != 1) {
            return 1.0f;
        }
        float fWidth2 = aVar.j / aVar.f10101f.width();
        float fHeight2 = aVar.k / aVar.f10101f.height();
        zoomLogger.c("computeTransformationZoom", "centerCrop", "scaleX:", Float.valueOf(fWidth2), "scaleY:", Float.valueOf(fHeight2));
        return Math.max(fWidth2, fHeight2);
    }

    public final void b(dl.d listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (this.f7021c == null) {
            throw new IllegalStateException("container is not initialized.");
        }
        l lVar = this.f7023e;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(listener, "listener");
        ArrayList arrayList = (ArrayList) lVar.f7990i;
        if (arrayList.contains(listener)) {
            return;
        }
        arrayList.add(listener);
    }

    public final boolean c() {
        a aVar = this.f7024f;
        int i7 = aVar.f8454b;
        if (i7 == 4) {
            this.j.f9308w.forceFinished(true);
            return true;
        }
        if (i7 != 3) {
            return false;
        }
        aVar.b(0);
        return true;
    }

    public final float d() {
        return this.f7027i.f() / this.f7026h.f10943v;
    }

    public final void e(float f2, float f7, float f10, boolean z5) {
        float f11 = f2 * this.f7026h.f10943v;
        int i7 = gl.c.k;
        gl.c cVarV = q.v(new e(f11, f7, f10));
        gl.a aVar = this.f7027i;
        if (z5) {
            aVar.a(cVarV);
        } else {
            c();
            aVar.b(cVarV);
        }
    }

    public final void f(float f2, boolean z5) {
        int i7 = gl.c.k;
        gl.c cVarV = q.v(new h(f2, 0));
        gl.a aVar = this.f7027i;
        if (z5) {
            aVar.a(cVarV);
        } else {
            c();
            aVar.b(cVarV);
        }
    }

    public final void g(float f2, float f7, boolean z5) {
        gl.a aVar = this.f7027i;
        RectF rectF = aVar.f10101f;
        if (f2 <= 0.0f || f7 <= 0.0f) {
            return;
        }
        if (rectF.width() == f2 && rectF.height() == f7 && !z5) {
            return;
        }
        float f10 = aVar.f();
        rectF.set(0.0f, 0.0f, f2, f7);
        aVar.g(f10, z5);
    }

    public final void h(float f2, int i7) {
        c cVar = this.f7026h;
        if (f2 < 0.0f) {
            cVar.getClass();
            throw new IllegalArgumentException("Max zoom should be >= 0.");
        }
        cVar.f10946y = f2;
        cVar.E = i7;
        if (d() > cVar.A0()) {
            f(cVar.A0(), true);
        }
    }

    public final void i(float f2, int i7) {
        c cVar = this.f7026h;
        if (f2 < 0.0f) {
            cVar.getClass();
            throw new IllegalArgumentException("Min zoom should be >= 0");
        }
        cVar.f10944w = f2;
        cVar.f10945x = i7;
        if (this.f7027i.f() <= cVar.B0()) {
            f(cVar.B0(), true);
        }
    }
}
