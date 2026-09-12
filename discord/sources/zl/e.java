package zl;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import androidx.datastore.preferences.protobuf.d1;
import java.util.ArrayDeque;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.collections.w0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import mi.q;
import mi.r;
import sh.m1;
import sh.p0;
import sh.s;
import sh.v0;
import th.g;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements mi.c, g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f24044d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f24045e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f24046i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Object f24047v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f24048w;

    public e(Map initialState) {
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        this.f24044d = w0.n(initialState);
        this.f24045e = new LinkedHashMap();
        this.f24046i = new LinkedHashMap();
        this.f24047v = new LinkedHashMap();
        this.f24048w = new e.c(1, this);
    }

    public static e h(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        e eVar = new e();
        eVar.f24047v = new ArrayDeque();
        eVar.f24044d = sharedPreferences;
        eVar.f24045e = "topic_operation_queue";
        eVar.f24046i = ",";
        eVar.f24048w = scheduledThreadPoolExecutor;
        synchronized (((ArrayDeque) eVar.f24047v)) {
            try {
                ((ArrayDeque) eVar.f24047v).clear();
                String string = ((SharedPreferences) eVar.f24044d).getString((String) eVar.f24045e, "");
                if (!TextUtils.isEmpty(string) && string.contains((String) eVar.f24046i)) {
                    String[] strArrSplit = string.split((String) eVar.f24046i, -1);
                    if (strArrSplit.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : strArrSplit) {
                        if (!TextUtils.isEmpty(str)) {
                            ((ArrayDeque) eVar.f24047v).add(str);
                        }
                    }
                    return eVar;
                }
                return eVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // th.g
    public Object a() {
        Object objA = ((th.f) this.f24044d).a();
        int i7 = 8;
        return new m1((s) objA, new th.f(new pf.b(8, (po.d) this.f24045e)), (v0) ((th.f) this.f24046i).a(), new th.f(new pf.b(i7, (th.f) this.f24047v)), (p0) ((th.f) this.f24048w).a());
    }

    @Override // mi.c
    public Object b(Class cls) {
        if (!((Set) this.f24044d).contains(q.a(cls))) {
            throw new d1("Attempting to request an undeclared dependency " + cls + ".");
        }
        Object objB = ((mi.c) this.f24048w).b(cls);
        if (!cls.equals(ui.a.class)) {
            return objB;
        }
        return new r();
    }

    @Override // mi.c
    public xi.a c(Class cls) {
        return e(q.a(cls));
    }

    @Override // mi.c
    public Object d(q qVar) {
        if (((Set) this.f24044d).contains(qVar)) {
            return ((mi.c) this.f24048w).d(qVar);
        }
        throw new d1("Attempting to request an undeclared dependency " + qVar + ".");
    }

    @Override // mi.c
    public xi.a e(q qVar) {
        if (((Set) this.f24045e).contains(qVar)) {
            return ((mi.c) this.f24048w).e(qVar);
        }
        throw new d1("Attempting to request an undeclared dependency Provider<" + qVar + ">.");
    }

    @Override // mi.c
    public Set f(q qVar) {
        if (((Set) this.f24046i).contains(qVar)) {
            return ((mi.c) this.f24048w).f(qVar);
        }
        throw new d1("Attempting to request an undeclared dependency Set<" + qVar + ">.");
    }

    @Override // mi.c
    public xi.a g(q qVar) {
        if (((Set) this.f24047v).contains(qVar)) {
            return ((mi.c) this.f24048w).g(qVar);
        }
        throw new d1("Attempting to request an undeclared dependency Provider<Set<" + qVar + ">>.");
    }

    public void i(Object obj, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        ((LinkedHashMap) this.f24044d).put(key, obj);
        MutableStateFlow mutableStateFlow = (MutableStateFlow) ((LinkedHashMap) this.f24046i).get(key);
        if (mutableStateFlow != null) {
            mutableStateFlow.setValue(obj);
        }
        MutableStateFlow mutableStateFlow2 = (MutableStateFlow) ((LinkedHashMap) this.f24047v).get(key);
        if (mutableStateFlow2 != null) {
            mutableStateFlow2.setValue(obj);
        }
    }
}
