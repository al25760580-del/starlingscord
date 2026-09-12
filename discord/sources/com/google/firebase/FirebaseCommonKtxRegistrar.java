package com.google.firebase;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import gc.s0;
import java.util.List;
import java.util.concurrent.Executor;
import ji.g;
import kotlin.Metadata;
import kotlin.collections.d0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineDispatcher;
import li.a;
import li.c;
import li.d;
import mi.b;
import mi.i;
import mi.q;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/google/firebase/FirebaseCommonKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "", "Lmi/b;", "getComponents", "()Ljava/util/List;", "com.google.firebase-firebase-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFirebase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Firebase.kt\ncom/google/firebase/FirebaseCommonKtxRegistrar\n+ 2 Firebase.kt\ncom/google/firebase/FirebaseKt\n*L\n1#1,82:1\n76#2,6:83\n76#2,6:89\n76#2,6:95\n76#2,6:101\n*S KotlinDebug\n*F\n+ 1 Firebase.kt\ncom/google/firebase/FirebaseCommonKtxRegistrar\n*L\n67#1:83,6\n68#1:89,6\n69#1:95,6\n70#1:101,6\n*E\n"})
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    @NotNull
    public List<b> getComponents() {
        s0 s0VarA = b.a(new q(a.class, CoroutineDispatcher.class));
        s0VarA.a(new i(new q(a.class, Executor.class), 1, 0));
        s0VarA.f9844f = g.f13899e;
        b bVarB = s0VarA.b();
        Intrinsics.checkNotNullExpressionValue(bVarB, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        s0 s0VarA2 = b.a(new q(c.class, CoroutineDispatcher.class));
        s0VarA2.a(new i(new q(c.class, Executor.class), 1, 0));
        s0VarA2.f9844f = g.f13900i;
        b bVarB2 = s0VarA2.b();
        Intrinsics.checkNotNullExpressionValue(bVarB2, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        s0 s0VarA3 = b.a(new q(li.b.class, CoroutineDispatcher.class));
        s0VarA3.a(new i(new q(li.b.class, Executor.class), 1, 0));
        s0VarA3.f9844f = g.f13901v;
        b bVarB3 = s0VarA3.b();
        Intrinsics.checkNotNullExpressionValue(bVarB3, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        s0 s0VarA4 = b.a(new q(d.class, CoroutineDispatcher.class));
        s0VarA4.a(new i(new q(d.class, Executor.class), 1, 0));
        s0VarA4.f9844f = g.f13902w;
        b bVarB4 = s0VarA4.b();
        Intrinsics.checkNotNullExpressionValue(bVarB4, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        return d0.g(bVarB, bVarB2, bVarB3, bVarB4);
    }
}
