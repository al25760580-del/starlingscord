package com.google.firebase.ktx;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import gc.s0;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.collections.d0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineDispatcher;
import li.a;
import li.c;
import mi.b;
import mi.i;
import mi.q;
import org.jetbrains.annotations.NotNull;
import rn.d;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/google/firebase/ktx/FirebaseCommonKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "", "Lmi/b;", "getComponents", "()Ljava/util/List;", "com.google.firebase-firebase-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFirebase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Firebase.kt\ncom/google/firebase/ktx/FirebaseCommonKtxRegistrar\n+ 2 Firebase.kt\ncom/google/firebase/ktx/FirebaseKt\n*L\n1#1,158:1\n152#2,6:159\n152#2,6:165\n152#2,6:171\n152#2,6:177\n*S KotlinDebug\n*F\n+ 1 Firebase.kt\ncom/google/firebase/ktx/FirebaseCommonKtxRegistrar\n*L\n143#1:159,6\n144#1:165,6\n145#1:171,6\n146#1:177,6\n*E\n"})
@d
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    @NotNull
    public List<b> getComponents() {
        s0 s0VarA = b.a(new q(a.class, CoroutineDispatcher.class));
        s0VarA.a(new i(new q(a.class, Executor.class), 1, 0));
        s0VarA.f9844f = dj.a.f7645e;
        b bVarB = s0VarA.b();
        Intrinsics.checkNotNullExpressionValue(bVarB, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        s0 s0VarA2 = b.a(new q(c.class, CoroutineDispatcher.class));
        s0VarA2.a(new i(new q(c.class, Executor.class), 1, 0));
        s0VarA2.f9844f = dj.a.f7646i;
        b bVarB2 = s0VarA2.b();
        Intrinsics.checkNotNullExpressionValue(bVarB2, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        s0 s0VarA3 = b.a(new q(li.b.class, CoroutineDispatcher.class));
        s0VarA3.a(new i(new q(li.b.class, Executor.class), 1, 0));
        s0VarA3.f9844f = dj.a.f7647v;
        b bVarB3 = s0VarA3.b();
        Intrinsics.checkNotNullExpressionValue(bVarB3, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        s0 s0VarA4 = b.a(new q(li.d.class, CoroutineDispatcher.class));
        s0VarA4.a(new i(new q(li.d.class, Executor.class), 1, 0));
        s0VarA4.f9844f = dj.a.f7648w;
        b bVarB4 = s0VarA4.b();
        Intrinsics.checkNotNullExpressionValue(bVarB4, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        return d0.g(bVarB, bVarB2, bVarB3, bVarB4);
    }
}
