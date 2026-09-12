package com.discord.analytics;

import ar.k;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import ib.a;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuation;
import rn.q;
import wn.f;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0082@¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"await", "", "Lcom/android/installreferrer/api/InstallReferrerClient;", "(Lcom/android/installreferrer/api/InstallReferrerClient;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "analytics_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nInstallReferrerModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InstallReferrerModule.kt\ncom/discord/analytics/InstallReferrerModuleKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,98:1\n426#2,11:99\n*S KotlinDebug\n*F\n+ 1 InstallReferrerModule.kt\ncom/discord/analytics/InstallReferrerModuleKt\n*L\n74#1:99,11\n*E\n"})
public final class InstallReferrerModuleKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Object await(final InstallReferrerClient installReferrerClient, Continuation frame) {
        Object objO;
        final k kVar = new k(1, f.b(frame));
        kVar.t();
        InstallReferrerStateListener installReferrerStateListener = new InstallReferrerStateListener() { // from class: com.discord.analytics.InstallReferrerModuleKt$await$2$listener$1
            @Override // com.android.installreferrer.api.InstallReferrerStateListener
            public void onInstallReferrerServiceDisconnected() {
                if (kVar.c()) {
                    kVar.m(null);
                }
            }

            @Override // com.android.installreferrer.api.InstallReferrerStateListener
            public void onInstallReferrerSetupFinished(int responseCode) {
                Integer numValueOf = Integer.valueOf(responseCode);
                CancellableContinuation cancellableContinuation = kVar;
                q qVar = Result.f14614e;
                cancellableContinuation.resumeWith(numValueOf);
            }
        };
        kVar.v(new Function1<Throwable, Unit>() { // from class: com.discord.analytics.InstallReferrerModuleKt$await$2$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return Unit.f14616a;
            }

            public final void invoke(Throwable th2) {
                InstallReferrerClient installReferrerClient2 = installReferrerClient;
                try {
                    q qVar = Result.f14614e;
                    installReferrerClient2.endConnection();
                    Unit unit = Unit.f14616a;
                } catch (Throwable th3) {
                    q qVar2 = Result.f14614e;
                    a.o(th3);
                }
            }
        });
        try {
            q qVar = Result.f14614e;
            installReferrerClient.startConnection(installReferrerStateListener);
            objO = Unit.f14616a;
        } catch (Throwable th2) {
            q qVar2 = Result.f14614e;
            objO = a.o(th2);
        }
        Throwable thA = Result.a(objO);
        if (thA != null) {
            kVar.resumeWith(a.o(thA));
        }
        Object objR = kVar.r();
        if (objR == wn.a.f22354d) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objR;
    }
}
