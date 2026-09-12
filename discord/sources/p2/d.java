package p2;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f17776a = c.f17773c;

    public static c a(Fragment fragment) {
        while (fragment != null) {
            if (fragment.isAdded()) {
                FragmentManager parentFragmentManager = fragment.getParentFragmentManager();
                Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "declaringFragment.parentFragmentManager");
                parentFragmentManager.getClass();
            }
            fragment = fragment.getParentFragment();
        }
        return f17776a;
    }

    public static void b(c cVar, m mVar) {
        Fragment fragment = mVar.f17778d;
        String name = fragment.getClass().getName();
        Set set = cVar.f17774a;
        if (set.contains(b.f17766d)) {
            Log.d("FragmentStrictMode", "Policy violation in ".concat(name), mVar);
        }
        if (set.contains(b.f17767e)) {
            io.sentry.react.d dVar = new io.sentry.react.d(13, name, mVar);
            if (!fragment.isAdded()) {
                dVar.run();
                throw null;
            }
            Handler handler = fragment.getParentFragmentManager().f2061w.f2039i;
            if (Intrinsics.areEqual(handler.getLooper(), Looper.myLooper())) {
                dVar.run();
                throw null;
            }
            handler.post(dVar);
        }
    }

    public static void c(m mVar) {
        if (FragmentManager.M(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(mVar.f17778d.getClass().getName()), mVar);
        }
    }

    public static final void d(Fragment fragment, String previousFragmentId) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(previousFragmentId, "previousFragmentId");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(previousFragmentId, "previousFragmentId");
        a aVar = new a(fragment, "Attempting to reuse fragment " + fragment + " with previous ID " + previousFragmentId);
        c(aVar);
        c cVarA = a(fragment);
        if (cVarA.f17774a.contains(b.f17768i) && e(cVarA, fragment.getClass(), a.class)) {
            b(cVarA, aVar);
        }
    }

    public static boolean e(c cVar, Class cls, Class cls2) {
        Set set = (Set) cVar.f17775b.get(cls.getName());
        if (set == null) {
            return true;
        }
        if (Intrinsics.areEqual(cls2.getSuperclass(), m.class) || !CollectionsKt.E(set, cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }
}
