package androidx.credentials;

import android.app.Activity;
import android.content.Context;
import android.os.CancellationSignal;
import ar.k;
import com.discord.misc.utilities.threading.a;
import ga.l;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import n1.e;
import n1.g;
import n1.o;
import n1.v;
import u4.b;
import u4.c;
import wn.f;
import xn.h;

/* JADX INFO: loaded from: classes.dex */
public interface CredentialManager {
    default Object b(Context context, o oVar, h frame) {
        k kVar = new k(1, f.b(frame));
        kVar.t();
        CancellationSignal cancellationSignal = new CancellationSignal();
        kVar.v(new g(cancellationSignal, 1));
        c(context, oVar, cancellationSignal, new a(1), new b(26, kVar));
        Object objR = kVar.r();
        if (objR == wn.a.f22354d) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objR;
    }

    void c(Context context, o oVar, CancellationSignal cancellationSignal, a aVar, b bVar);

    default Object d(Activity activity, e eVar, Continuation frame) {
        k kVar = new k(1, f.b(frame));
        kVar.t();
        CancellationSignal cancellationSignal = new CancellationSignal();
        kVar.v(new g(cancellationSignal, 0));
        e(activity, eVar, cancellationSignal, new a(1), new l(25, kVar));
        Object objR = kVar.r();
        if (objR == wn.a.f22354d) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objR;
    }

    void e(Context context, e eVar, CancellationSignal cancellationSignal, a aVar, l lVar);

    default Object f(v vVar, h frame) {
        k kVar = new k(1, f.b(frame));
        kVar.t();
        g(vVar, new a(1), new c(kVar));
        Object objR = kVar.r();
        if (objR == wn.a.f22354d) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objR;
    }

    default void g(v request, a executor, c callback) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
    }
}
