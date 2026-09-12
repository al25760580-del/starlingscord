package com.google.firebase;

import a5.l0;
import android.content.Context;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.messaging.m;
import com.google.firebase.messaging.n;
import fj.a;
import fj.b;
import gc.s0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import mi.i;
import mi.q;
import rn.k;
import vi.c;
import vi.d;
import vi.e;
import vi.f;

/* JADX INFO: loaded from: classes3.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        String string;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(q.a(b.class));
        for (Class cls : new Class[0]) {
            l0.l(cls, "Null interface");
            hashSet.add(q.a(cls));
        }
        i iVar = new i(2, 0, a.class);
        if (hashSet.contains(iVar.f15820a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        hashSet2.add(iVar);
        arrayList.add(new mi.b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new n(15), hashSet3));
        q qVar = new q(li.a.class, Executor.class);
        s0 s0Var = new s0(c.class, new Class[]{e.class, f.class});
        s0Var.a(i.a(Context.class));
        s0Var.a(i.a(ji.f.class));
        s0Var.a(new i(2, 0, d.class));
        s0Var.a(new i(1, 1, b.class));
        s0Var.a(new i(qVar, 1, 0));
        s0Var.f9844f = new m(qVar, 1);
        arrayList.add(s0Var.b());
        arrayList.add(com.facebook.imagepipeline.nativecode.b.h("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(com.facebook.imagepipeline.nativecode.b.h("fire-core", "21.0.0"));
        arrayList.add(com.facebook.imagepipeline.nativecode.b.h("device-name", a(Build.PRODUCT)));
        arrayList.add(com.facebook.imagepipeline.nativecode.b.h("device-model", a(Build.DEVICE)));
        arrayList.add(com.facebook.imagepipeline.nativecode.b.h("device-brand", a(Build.BRAND)));
        arrayList.add(com.facebook.imagepipeline.nativecode.b.m("android-target-sdk", new io.sentry.react.b(2)));
        arrayList.add(com.facebook.imagepipeline.nativecode.b.m("android-min-sdk", new io.sentry.react.b(3)));
        arrayList.add(com.facebook.imagepipeline.nativecode.b.m("android-platform", new io.sentry.react.b(4)));
        arrayList.add(com.facebook.imagepipeline.nativecode.b.m("android-installer", new io.sentry.react.b(5)));
        try {
            string = k.f19478x.toString();
        } catch (NoClassDefFoundError unused) {
            string = null;
        }
        if (string != null) {
            arrayList.add(com.facebook.imagepipeline.nativecode.b.h("kotlin", string));
        }
        return arrayList;
    }
}
