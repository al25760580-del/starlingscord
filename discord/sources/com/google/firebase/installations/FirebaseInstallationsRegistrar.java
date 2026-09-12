package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import gc.s0;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import ji.f;
import li.a;
import li.b;
import mi.c;
import mi.i;
import mi.q;
import ni.h;
import vi.e;
import yi.d;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static d lambda$getComponents$0(c cVar) {
        return new yi.c((f) cVar.b(f.class), cVar.c(e.class), (ExecutorService) cVar.d(new q(a.class, ExecutorService.class)), new h((Executor) cVar.d(new q(b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<mi.b> getComponents() {
        s0 s0Var = new s0(d.class, new Class[0]);
        s0Var.f9839a = LIBRARY_NAME;
        s0Var.a(i.a(f.class));
        s0Var.a(new i(0, 1, e.class));
        s0Var.a(new i(new q(a.class, ExecutorService.class), 1, 0));
        s0Var.a(new i(new q(b.class, Executor.class), 1, 0));
        s0Var.f9844f = new vd.a();
        mi.b bVarB = s0Var.b();
        vi.d dVar = new vi.d(0, (byte) 0);
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(q.a(vi.d.class));
        return Arrays.asList(bVarB, new mi.b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 1, new mi.a(0, dVar), hashSet3), com.facebook.imagepipeline.nativecode.b.h(LIBRARY_NAME, "17.2.0"));
    }
}
