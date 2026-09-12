package com.facebook.drawee.span;

import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.view.DraweeHolder;
import e9.c;
import f9.d;
import j9.a;
import j9.b;
import java.util.HashSet;
import java.util.Iterator;
import s0.g;

/* JADX INFO: loaded from: classes3.dex */
public final class DraweeSpanStringBuilder extends SpannableStringBuilder {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashSet f4720d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashSet f4721e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b f4722i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public SimpleDraweeSpanTextView f4723v;

    public DraweeSpanStringBuilder() {
        this.f4720d = new HashSet();
        this.f4721e = new HashSet();
        this.f4722i = new b(0, this);
    }

    public final void a(SimpleDraweeSpanTextView simpleDraweeSpanTextView) {
        if (this.f4723v != null) {
            this.f4723v = null;
        }
        this.f4723v = simpleDraweeSpanTextView;
        Iterator it = this.f4720d.iterator();
        while (it.hasNext()) {
            DraweeHolder draweeHolder = ((a) it.next()).E;
            draweeHolder.f4731f.a(c.L);
            draweeHolder.f4727b = true;
            draweeHolder.b();
        }
        Iterator it2 = this.f4721e.iterator();
        if (it2.hasNext()) {
            throw g.a(it2);
        }
    }

    public final void b(SimpleDraweeSpanTextView simpleDraweeSpanTextView) {
        if (simpleDraweeSpanTextView == this.f4723v) {
            this.f4723v = null;
        }
        Iterator it = this.f4720d.iterator();
        while (it.hasNext()) {
            DraweeHolder draweeHolder = ((a) it.next()).E;
            draweeHolder.f4731f.a(c.M);
            draweeHolder.f4727b = false;
            draweeHolder.b();
        }
        Iterator it2 = this.f4721e.iterator();
        while (it2.hasNext()) {
            if (it2.next() != null) {
                throw new ClassCastException();
            }
        }
    }

    public final void c(GenericDraweeHierarchy genericDraweeHierarchy, f9.c cVar, int i7, int i10, int i11, int i12) {
        DraweeHolder draweeHolder = new DraweeHolder(genericDraweeHierarchy);
        draweeHolder.f(cVar);
        if (i7 >= length()) {
            return;
        }
        Drawable drawableC = draweeHolder.c();
        if (drawableC != null) {
            if (drawableC.getBounds().isEmpty()) {
                drawableC.setBounds(0, 0, i10, i11);
            }
            drawableC.setCallback(this.f4722i);
        }
        a aVar = new a(draweeHolder, i12);
        DraweeController draweeController = draweeHolder.f4730e;
        if (draweeController instanceof f9.c) {
            ((f9.c) draweeController).a(new d(this, aVar, i11));
        }
        this.f4720d.add(aVar);
        setSpan(aVar, i7, i7 + 1, 33);
    }

    public DraweeSpanStringBuilder(CharSequence charSequence) {
        super(charSequence);
        this.f4720d = new HashSet();
        this.f4721e = new HashSet();
        this.f4722i = new b(0, this);
    }
}
