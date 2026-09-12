package com.google.firebase.datatransport;

import a5.l0;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.firebase.components.ComponentRegistrar;
import gc.s0;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import mi.b;
import mi.c;
import mi.i;
import mi.q;
import sb.f;
import tb.a;
import vb.p;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f lambda$getComponents$0(c cVar) {
        p.b((Context) cVar.b(Context.class));
        return p.a().c(a.f20674f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f lambda$getComponents$1(c cVar) {
        p.b((Context) cVar.b(Context.class));
        return p.a().c(a.f20674f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f lambda$getComponents$2(c cVar) {
        p.b((Context) cVar.b(Context.class));
        return p.a().c(a.f20673e);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    public List<b> getComponents() {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(q.a(f.class));
        for (Class cls : new Class[0]) {
            l0.l(cls, "Null interface");
            hashSet.add(q.a(cls));
        }
        i iVarA = i.a(Context.class);
        if (hashSet.contains(iVarA.f15820a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        hashSet2.add(iVarA);
        b bVar = new b(LIBRARY_NAME, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new mc.q(19), hashSet3);
        s0 s0VarA = b.a(new q(oi.a.class, f.class));
        s0VarA.a(i.a(Context.class));
        s0VarA.f9844f = new mc.q(20);
        b bVarB = s0VarA.b();
        s0 s0VarA2 = b.a(new q(oi.b.class, f.class));
        s0VarA2.a(i.a(Context.class));
        s0VarA2.f9844f = new mc.q(21);
        return Arrays.asList(bVar, bVarB, s0VarA2.b(), com.facebook.imagepipeline.nativecode.b.h(LIBRARY_NAME, "18.2.0"));
    }
}
