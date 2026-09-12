package com.facebook.drawee.controller;

import c9.b;
import com.facebook.common.internal.Supplier;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.imagepipeline.request.ImageRequest;
import f9.c;
import f9.d;
import f9.e;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import n8.h;
import sa.a;
import x8.f;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractDraweeControllerBuilder {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final d f4630h = new d();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final NullPointerException f4631i = new NullPointerException("No image request was specified!");
    public static final AtomicLong j = new AtomicLong();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f4632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageRequest f4633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ImageRequest f4634c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ControllerListener f4635d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f4636e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f4637f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public DraweeController f4638g;

    public final c a() {
        ImageRequest imageRequest;
        if (this.f4633b == null && (imageRequest = this.f4634c) != null) {
            this.f4633b = imageRequest;
            this.f4634c = null;
        }
        a.w();
        b bVarD = d();
        bVarD.f9037m = this.f4637f;
        ControllerListener controllerListener = this.f4635d;
        if (controllerListener != null) {
            bVarD.a(controllerListener);
        }
        if (this.f4636e) {
            bVarD.a(f4630h);
        }
        a.w();
        return bVarD;
    }

    public abstract x8.a b(b bVar, String str, Object obj, Object obj2, int i7);

    public final void c() {
        this.f4632a = null;
        this.f4633b = null;
        this.f4634c = null;
        this.f4635d = null;
        this.f4636e = false;
        this.f4638g = null;
        this.f4637f = null;
    }

    public abstract b d();

    public final Supplier e(b bVar, String str) {
        AbstractDraweeControllerBuilder abstractDraweeControllerBuilder;
        b bVar2;
        String str2;
        Supplier fVar;
        ImageRequest imageRequest = this.f4633b;
        if (imageRequest != null) {
            abstractDraweeControllerBuilder = this;
            bVar2 = bVar;
            str2 = str;
            fVar = new e(abstractDraweeControllerBuilder, bVar2, str2, imageRequest, this.f4632a, 1);
        } else {
            abstractDraweeControllerBuilder = this;
            bVar2 = bVar;
            str2 = str;
            fVar = null;
        }
        if (fVar != null && abstractDraweeControllerBuilder.f4634c != null) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(fVar);
            arrayList.add(new e(abstractDraweeControllerBuilder, bVar2, str2, abstractDraweeControllerBuilder.f4634c, abstractDraweeControllerBuilder.f4632a, 1));
            fVar = new f(arrayList);
        }
        return fVar == null ? new h(2) : fVar;
    }
}
