package androidx.lifecycle;

import androidx.savedstate.SavedStateRegistry;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class f implements t {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2344d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f2345e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f2346i;

    public f(DefaultLifecycleObserver defaultLifecycleObserver, t tVar) {
        Intrinsics.checkNotNullParameter(defaultLifecycleObserver, "defaultLifecycleObserver");
        this.f2345e = defaultLifecycleObserver;
        this.f2346i = tVar;
    }

    @Override // androidx.lifecycle.t
    public final void c(LifecycleOwner source, n event) {
        switch (this.f2344d) {
            case 0:
                DefaultLifecycleObserver defaultLifecycleObserver = (DefaultLifecycleObserver) this.f2345e;
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                switch (e.f2339a[event.ordinal()]) {
                    case 1:
                        defaultLifecycleObserver.onCreate(source);
                        break;
                    case 2:
                        defaultLifecycleObserver.onStart(source);
                        break;
                    case 3:
                        defaultLifecycleObserver.onResume(source);
                        break;
                    case 4:
                        defaultLifecycleObserver.onPause(source);
                        break;
                    case 5:
                        defaultLifecycleObserver.onStop(source);
                        break;
                    case 6:
                        defaultLifecycleObserver.onDestroy(source);
                        break;
                    case 7:
                        throw new IllegalArgumentException("ON_ANY must not been send by anybody");
                    default:
                        throw new rn.n();
                }
                t tVar = (t) this.f2346i;
                if (tVar != null) {
                    tVar.c(source, event);
                    return;
                }
                return;
            case 1:
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event == n.ON_START) {
                    ((Lifecycle) this.f2345e).c(this);
                    ((SavedStateRegistry) this.f2346i).d();
                    return;
                }
                return;
            default:
                HashMap map = ((b) this.f2346i).f2331a;
                List list = (List) map.get(event);
                Object obj = this.f2345e;
                b.a(list, source, event, obj);
                b.a((List) map.get(n.ON_ANY), source, event, obj);
                return;
        }
    }

    public f(u uVar) {
        this.f2345e = uVar;
        d dVar = d.f2336c;
        Class<?> cls = uVar.getClass();
        b bVar = (b) dVar.f2337a.get(cls);
        this.f2346i = bVar == null ? dVar.a(cls, null) : bVar;
    }

    public f(Lifecycle lifecycle, SavedStateRegistry savedStateRegistry) {
        this.f2345e = lifecycle;
        this.f2346i = savedStateRegistry;
    }
}
