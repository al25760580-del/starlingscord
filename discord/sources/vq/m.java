package vq;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.c0;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f21953a = new k();

    public static /* synthetic */ void a(int i7) {
        Object[] objArr = new Object[3];
        switch (i7) {
            case 1:
            case 5:
            case 8:
            case 11:
            case 15:
            case 18:
            case 21:
            case 23:
                objArr[0] = "neighbors";
                break;
            case 2:
            case 12:
            case 16:
            case 19:
            case 24:
                objArr[0] = "visited";
                break;
            case 3:
            case 6:
            case 13:
            case 25:
                objArr[0] = "handler";
                break;
            case 4:
            case 7:
            case 17:
            case 20:
            default:
                objArr[0] = "nodes";
                break;
            case 9:
                objArr[0] = "predicate";
                break;
            case 10:
            case 14:
                objArr[0] = "node";
                break;
            case 22:
                objArr[0] = "current";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/DFS";
        switch (i7) {
            case 7:
            case 8:
            case 9:
                objArr[2] = "ifAny";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[2] = "dfsFromNode";
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                objArr[2] = "topologicalOrder";
                break;
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "doDfs";
                break;
            default:
                objArr[2] = "dfs";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static final void b(AbstractCollection abstractCollection, Object obj) {
        Intrinsics.checkNotNullParameter(abstractCollection, "<this>");
        if (obj != null) {
            abstractCollection.add(obj);
        }
    }

    public static final List e(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        int size = arrayList.size();
        if (size == 0) {
            return n0.f14659d;
        }
        if (size == 1) {
            return c0.c(CollectionsKt.K(arrayList));
        }
        arrayList.trimToSize();
        return arrayList;
    }

    public static j f() {
        return new j(0);
    }

    public static Object g(Collection collection, b bVar, m mVar) {
        if (collection == null) {
            a(4);
            throw null;
        }
        po.d dVar = new po.d(6);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            h(it.next(), bVar, dVar, mVar);
        }
        return mVar.k();
    }

    public static void h(Object obj, b bVar, po.d dVar, m mVar) {
        if (obj == null) {
            a(22);
            throw null;
        }
        if (((HashSet) dVar.f18079e).add(obj) && mVar.d(obj)) {
            Iterator it = bVar.b(obj).iterator();
            while (it.hasNext()) {
                h(it.next(), bVar, dVar, mVar);
            }
            mVar.c(obj);
        }
    }

    public static Boolean i(List list, b bVar, Function1 function1) {
        if (list == null) {
            a(7);
            throw null;
        }
        if (function1 != null) {
            return (Boolean) g(list, bVar, new a(function1, new boolean[1]));
        }
        a(9);
        throw null;
    }

    public static final boolean j(Throwable th2) {
        Intrinsics.checkNotNullParameter(th2, "<this>");
        Class<?> superclass = th2.getClass();
        while (!Intrinsics.areEqual(superclass.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                return false;
            }
        }
        return true;
    }

    public static void l(Object obj) throws Throwable {
        if (obj instanceof l) {
            Throwable e10 = ((l) obj).f21952a;
            Intrinsics.checkNotNullParameter(e10, "e");
            throw e10;
        }
    }

    public abstract boolean d(Object obj);

    public abstract Object k();

    public void c(Object obj) {
    }
}
