package ol;

import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements Function2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f17442d;

    public /* synthetic */ c(int i7) {
        this.f17442d = i7;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        kotlin.coroutines.c cVar;
        switch (this.f17442d) {
            case 0:
                return Long.valueOf(d.a((InputStream) obj, (OutputStream) obj2));
            case 1:
                Function0 f2 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(f2, "f");
                t1.a aVar = t1.d.f20573a;
                t1.c.a((CancellationSignal) obj, f2);
                return Unit.f14616a;
            case 2:
                Function0 onResultOrException = (Function0) obj2;
                Intrinsics.checkNotNullParameter(onResultOrException, "f");
                Intrinsics.checkNotNullParameter(onResultOrException, "onResultOrException");
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!s1.f.a((CancellationSignal) obj)) {
                    onResultOrException.invoke();
                }
                return Unit.f14616a;
            case 3:
                Function0 onResultOrException2 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(onResultOrException2, "f");
                Intrinsics.checkNotNullParameter(onResultOrException2, "onResultOrException");
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!s1.f.a((CancellationSignal) obj)) {
                    onResultOrException2.invoke();
                }
                return Unit.f14616a;
            case 4:
                String acc = (String) obj;
                CoroutineContext.Element element = (CoroutineContext.Element) obj2;
                Intrinsics.checkNotNullParameter(acc, "acc");
                Intrinsics.checkNotNullParameter(element, "element");
                if (acc.length() == 0) {
                    return element.toString();
                }
                return acc + ", " + element;
            case 5:
                CoroutineContext acc2 = (CoroutineContext) obj;
                CoroutineContext.Element element2 = (CoroutineContext.Element) obj2;
                Intrinsics.checkNotNullParameter(acc2, "acc");
                Intrinsics.checkNotNullParameter(element2, "element");
                CoroutineContext coroutineContextB = acc2.B(element2.getKey());
                kotlin.coroutines.g gVar = kotlin.coroutines.g.f14681d;
                if (coroutineContextB == gVar) {
                    return element2;
                }
                vn.a aVar2 = kotlin.coroutines.d.k;
                kotlin.coroutines.d dVar = (kotlin.coroutines.d) coroutineContextB.l(aVar2);
                if (dVar == null) {
                    cVar = new kotlin.coroutines.c(element2, coroutineContextB);
                } else {
                    CoroutineContext coroutineContextB2 = coroutineContextB.B(aVar2);
                    if (coroutineContextB2 == gVar) {
                        return new kotlin.coroutines.c(dVar, element2);
                    }
                    cVar = new kotlin.coroutines.c(dVar, new kotlin.coroutines.c(element2, coroutineContextB2));
                }
                return cVar;
            case 6:
                Function0 onResultOrException3 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(onResultOrException3, "f");
                Intrinsics.checkNotNullParameter(onResultOrException3, "onResultOrException");
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!s1.f.a((CancellationSignal) obj)) {
                    onResultOrException3.invoke();
                }
                return Unit.f14616a;
            default:
                return new Pair(obj, obj2);
        }
    }
}
