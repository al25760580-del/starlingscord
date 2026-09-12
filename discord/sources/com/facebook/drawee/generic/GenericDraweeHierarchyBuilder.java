package com.facebook.drawee.generic;

import android.content.res.Resources;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import com.facebook.drawee.drawable.ScalingUtils$ScaleType;
import com.facebook.drawee.drawable.o;
import com.facebook.react.views.image.ReactImageView;
import i9.b;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class GenericDraweeHierarchyBuilder {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final o f4703r = o.f4690d;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final o f4704s = o.f4689c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources f4705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4706b = ReactImageView.REMOTE_IMAGE_FADE_DURATION_MS;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f4707c = 0.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Drawable f4708d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ScalingUtils$ScaleType f4709e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f4710f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ScalingUtils$ScaleType f4711g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Drawable f4712h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ScalingUtils$ScaleType f4713i;
    public Drawable j;
    public ScalingUtils$ScaleType k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ScalingUtils$ScaleType f4714l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public PorterDuffColorFilter f4715m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Drawable f4716n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List f4717o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public StateListDrawable f4718p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public b f4719q;

    public GenericDraweeHierarchyBuilder(Resources resources) {
        this.f4705a = resources;
        o oVar = f4703r;
        this.f4709e = oVar;
        this.f4710f = null;
        this.f4711g = oVar;
        this.f4712h = null;
        this.f4713i = oVar;
        this.j = null;
        this.k = oVar;
        this.f4714l = f4704s;
        this.f4715m = null;
        this.f4716n = null;
        this.f4717o = null;
        this.f4718p = null;
        this.f4719q = null;
    }

    public final GenericDraweeHierarchy a() {
        List list = this.f4717o;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((Drawable) it.next()).getClass();
            }
        }
        return new GenericDraweeHierarchy(this);
    }
}
