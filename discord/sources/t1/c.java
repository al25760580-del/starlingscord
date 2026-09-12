package t1;

import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o1.j;
import o1.o;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static void a(CancellationSignal cancellationSignal, Function0 onResultOrException) {
        Intrinsics.checkNotNullParameter(onResultOrException, "onResultOrException");
        CredentialProviderPlayServicesImpl.Companion.getClass();
        if (s1.f.a(cancellationSignal)) {
            return;
        }
        onResultOrException.invoke();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, o1.o] */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, o1.j] */
    public static boolean b(int i7, Function2 cancelOnError, Function1 onError, CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(cancelOnError, "cancelOnError");
        Intrinsics.checkNotNullParameter(onError, "onError");
        if (i7 == -1) {
            return false;
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new o(s0.g.d(i7, "activity with result code: ", " indicating not RESULT_OK"));
        if (i7 == 0) {
            objectRef.element = new j("activity is cancelled by the user.");
        }
        cancelOnError.invoke(cancellationSignal, new b(onError, objectRef, 1));
        return true;
    }
}
