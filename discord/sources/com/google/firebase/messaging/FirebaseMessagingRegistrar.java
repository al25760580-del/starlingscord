package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import gc.s0;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(mi.q qVar, mi.c cVar) {
        ji.f fVar = (ji.f) cVar.b(ji.f.class);
        if (cVar.b(wi.a.class) == null) {
            return new FirebaseMessaging(fVar, cVar.c(fj.b.class), cVar.c(vi.f.class), (yi.d) cVar.b(yi.d.class), cVar.e(qVar), (ui.b) cVar.b(ui.b.class));
        }
        throw new ClassCastException();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<mi.b> getComponents() {
        mi.q qVar = new mi.q(oi.b.class, sb.f.class);
        s0 s0Var = new s0(FirebaseMessaging.class, new Class[0]);
        s0Var.f9839a = LIBRARY_NAME;
        s0Var.a(mi.i.a(ji.f.class));
        s0Var.a(new mi.i(0, 0, wi.a.class));
        s0Var.a(new mi.i(0, 1, fj.b.class));
        s0Var.a(new mi.i(0, 1, vi.f.class));
        s0Var.a(mi.i.a(yi.d.class));
        s0Var.a(new mi.i(qVar, 0, 1));
        s0Var.a(mi.i.a(ui.b.class));
        s0Var.f9844f = new m(qVar, 0);
        if (!(s0Var.f9840b == 0)) {
            throw new IllegalStateException("Instantiation type has already been set.");
        }
        s0Var.f9840b = 1;
        return Arrays.asList(s0Var.b(), com.facebook.imagepipeline.nativecode.b.h(LIBRARY_NAME, "24.0.0"));
    }
}
