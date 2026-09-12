package com.facebook.drawee.view;

import android.graphics.drawable.Drawable;
import com.facebook.drawee.drawable.q;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.interfaces.DraweeHierarchy;
import e9.c;
import e9.d;
import i9.a;
import n8.f;
import n8.i;

/* JADX INFO: loaded from: classes3.dex */
public final class DraweeHolder {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public DraweeHierarchy f4729d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f4731f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f4726a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4727b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4728c = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public DraweeController f4730e = null;

    public DraweeHolder(GenericDraweeHierarchy genericDraweeHierarchy) {
        this.f4731f = d.f8122c ? new d() : d.f8121b;
        if (genericDraweeHierarchy != null) {
            g(genericDraweeHierarchy);
        }
    }

    public final void a() {
        if (this.f4726a) {
            return;
        }
        this.f4731f.a(c.f8120y);
        this.f4726a = true;
        DraweeController draweeController = this.f4730e;
        if (draweeController == null || draweeController.getHierarchy() == null) {
            return;
        }
        this.f4730e.onAttach();
    }

    public final void b() {
        if (this.f4727b && this.f4728c) {
            a();
            return;
        }
        if (this.f4726a) {
            this.f4731f.a(c.E);
            this.f4726a = false;
            if (d()) {
                this.f4730e.onDetach();
            }
        }
    }

    public final Drawable c() {
        DraweeHierarchy draweeHierarchy = this.f4729d;
        if (draweeHierarchy == null) {
            return null;
        }
        return draweeHierarchy.a();
    }

    public final boolean d() {
        DraweeController draweeController = this.f4730e;
        return draweeController != null && draweeController.getHierarchy() == this.f4729d;
    }

    public final void e(boolean z5) {
        if (this.f4728c == z5) {
            return;
        }
        this.f4731f.a(z5 ? c.N : c.O);
        this.f4728c = z5;
        b();
    }

    public final void f(DraweeController draweeController) {
        boolean z5 = this.f4726a;
        d dVar = this.f4731f;
        if (z5 && z5) {
            dVar.a(c.E);
            this.f4726a = false;
            if (d()) {
                this.f4730e.onDetach();
            }
        }
        if (d()) {
            dVar.a(c.f8117v);
            this.f4730e.setHierarchy(null);
        }
        this.f4730e = draweeController;
        if (draweeController != null) {
            dVar.a(c.f8116i);
            this.f4730e.setHierarchy(this.f4729d);
        } else {
            dVar.a(c.f8118w);
        }
        if (z5) {
            a();
        }
    }

    public final void g(DraweeHierarchy draweeHierarchy) {
        this.f4731f.a(c.f8114d);
        boolean zD = d();
        Object objC = c();
        if (objC != null) {
            ((a) ((q) objC)).f11401e = null;
        }
        draweeHierarchy.getClass();
        this.f4729d = draweeHierarchy;
        a aVarA = draweeHierarchy.a();
        e(aVarA == null || aVarA.isVisible());
        Object objC2 = c();
        if (objC2 != null) {
            ((a) ((q) objC2)).f11401e = this;
        }
        if (zD) {
            this.f4730e.setHierarchy(draweeHierarchy);
        }
    }

    public final String toString() {
        f fVarJ = i.j(this);
        fVarJ.G("controllerAttached", this.f4726a);
        fVarJ.G("holderAttached", this.f4727b);
        fVarJ.G("drawableVisible", this.f4728c);
        fVarJ.H(this.f4731f.f8123a.toString(), "events");
        return fVarJ.toString();
    }
}
