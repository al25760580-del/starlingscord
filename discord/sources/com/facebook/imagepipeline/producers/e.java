package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.react.devsupport.StackTraceHelper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class e implements ProducerContext {
    public static final com.facebook.soloader.t J;
    public static final Object K;
    public Priority E;
    public boolean F;
    public boolean G;
    public final ArrayList H;
    public final ia.f I;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageRequest f4965d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f4966e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a1 f4967i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Object f4968v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ImageRequest.RequestLevel f4969w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final HashMap f4970x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f4971y;

    static {
        String[] strArr = {StackTraceHelper.ID_KEY, "uri_source"};
        int i7 = com.facebook.soloader.t.f5421d;
        HashSet hashSet = new HashSet(2);
        Collections.addAll(hashSet, strArr);
        J = new com.facebook.soloader.t(hashSet);
        K = new Object();
    }

    public e(ImageRequest imageRequest, String str, String str2, a1 a1Var, Object obj, ImageRequest.RequestLevel requestLevel, boolean z5, boolean z6, Priority priority, ia.f fVar) {
        this.f4965d = imageRequest;
        this.f4966e = str;
        HashMap map = new HashMap();
        this.f4970x = map;
        map.put(StackTraceHelper.ID_KEY, str);
        map.put("uri_source", imageRequest == null ? "null-request" : imageRequest.getSourceUri());
        this.f4967i = a1Var;
        this.f4968v = obj == null ? K : obj;
        this.f4969w = requestLevel;
        this.f4971y = z5;
        this.E = priority;
        this.F = z6;
        this.G = false;
        this.H = new ArrayList();
        this.I = fVar;
    }

    public static void a(ArrayList arrayList) {
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((f) it.next()).b();
        }
    }

    public static void b(ArrayList arrayList) {
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((f) it.next()).c();
        }
    }

    public static void d(ArrayList arrayList) {
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((f) it.next()).d();
        }
    }

    @Override // v9.a
    public final void B(Object obj, String str) {
        if (J.contains(str)) {
            return;
        }
        this.f4970x.put(str, obj);
    }

    @Override // com.facebook.imagepipeline.producers.ProducerContext
    public final a1 O() {
        return this.f4967i;
    }

    @Override // com.facebook.imagepipeline.producers.ProducerContext
    public final synchronized boolean P() {
        return this.F;
    }

    @Override // com.facebook.imagepipeline.producers.ProducerContext
    public final ImageRequest.RequestLevel Q() {
        return this.f4969w;
    }

    @Override // com.facebook.imagepipeline.producers.ProducerContext
    public final Object c() {
        return this.f4968v;
    }

    public final void e() {
        ArrayList arrayList;
        synchronized (this) {
            if (this.G) {
                arrayList = null;
            } else {
                this.G = true;
                arrayList = new ArrayList(this.H);
            }
        }
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((f) it.next()).a();
        }
    }

    @Override // com.facebook.imagepipeline.producers.ProducerContext
    public final synchronized Priority f() {
        return this.E;
    }

    @Override // com.facebook.imagepipeline.producers.ProducerContext
    public final ImageRequest g() {
        return this.f4965d;
    }

    @Override // v9.a
    public final Map getExtras() {
        return this.f4970x;
    }

    @Override // com.facebook.imagepipeline.producers.ProducerContext
    public final String getId() {
        return this.f4966e;
    }

    @Override // com.facebook.imagepipeline.producers.ProducerContext
    public final void i(f fVar) {
        boolean z5;
        synchronized (this) {
            this.H.add(fVar);
            z5 = this.G;
        }
        if (z5) {
            fVar.a();
        }
    }

    @Override // com.facebook.imagepipeline.producers.ProducerContext
    public final ia.f l() {
        return this.I;
    }

    @Override // com.facebook.imagepipeline.producers.ProducerContext
    public final void n(String str, String str2) {
        HashMap map = this.f4970x;
        map.put("origin", str);
        map.put("origin_sub", str2);
    }

    @Override // v9.a
    public final void q(Map map) {
        if (map == null) {
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            B(entry.getValue(), (String) entry.getKey());
        }
    }

    @Override // com.facebook.imagepipeline.producers.ProducerContext
    public final synchronized boolean u() {
        return this.f4971y;
    }

    @Override // v9.a
    public final Object y(String str) {
        return this.f4970x.get(str);
    }

    @Override // com.facebook.imagepipeline.producers.ProducerContext
    public final void z(String str) {
        n(str, "default");
    }
}
