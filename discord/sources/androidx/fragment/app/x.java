package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2268d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2269e;

    public /* synthetic */ x(int i7, Object obj) {
        this.f2268d = i7;
        this.f2269e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2268d) {
            case 0:
                Fragment fragment = (Fragment) this.f2269e;
                FragmentViewLifecycleOwner fragmentViewLifecycleOwner = fragment.mViewLifecycleOwner;
                fragmentViewLifecycleOwner.f2084w.a(fragment.mSavedViewRegistryState);
                fragment.mSavedViewRegistryState = null;
                break;
            case 1:
                Ref.ObjectRef seekCancelLambda = (Ref.ObjectRef) this.f2269e;
                Intrinsics.checkNotNullParameter(seekCancelLambda, "$seekCancelLambda");
                Function0 function0 = (Function0) seekCancelLambda.element;
                if (function0 != null) {
                    function0.invoke();
                }
                break;
            case 2:
                ArrayList transitioningViews = (ArrayList) this.f2269e;
                Intrinsics.checkNotNullParameter(transitioningViews, "$transitioningViews");
                m1.c(4, transitioningViews);
                break;
            case 3:
                p this$0 = (p) this.f2269e;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (FragmentManager.M(2)) {
                    Log.v("FragmentManager", "Transition for all operations has completed");
                }
                Iterator it = this$0.f2214c.iterator();
                while (it.hasNext()) {
                    ((q) it.next()).f2178a.c(this$0);
                }
                break;
            default:
                Iterator it2 = ((FragmentManager) this.f2269e).f2052n.iterator();
                while (it2.hasNext()) {
                    ((y0) it2.next()).getClass();
                }
                break;
        }
    }
}
