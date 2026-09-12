package com.horcrux.svg;

import android.graphics.Matrix;
import android.graphics.Rect;
import com.facebook.react.bridge.ReadableArray;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r0[] f6656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ReadableArray f6657c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f6658d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f6659e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Matrix f6660f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Rect f6661g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public j0 f6662h;

    public a(int i7, r0[] r0VarArr, int i10) {
        this.f6655a = i7;
        this.f6656b = r0VarArr;
        this.f6658d = i10 == 1;
    }

    public final double a(r0 r0Var, double d6, float f2, float f7) {
        return a.a.g(r0Var, d6, (this.f6658d && r0Var.f6787b == SVGLength$UnitType.NUMBER) ? d6 : f2, f7);
    }
}
