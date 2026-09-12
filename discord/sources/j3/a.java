package j3;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import androidx.datastore.preferences.protobuf.d1;
import com.discord.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import mo.c0;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile a f13640d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f13641e = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f13644c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f13643b = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f13642a = new HashMap();

    public a(Context context) {
        this.f13644c = context.getApplicationContext();
    }

    public static a c(Context context) {
        if (f13640d == null) {
            synchronized (f13641e) {
                try {
                    if (f13640d == null) {
                        f13640d = new a(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f13640d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f13644c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    hashSet = this.f13643b;
                    if (!zHasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e10) {
                throw new d1((Throwable) e10);
            }
        }
    }

    public final Object b(Class cls, HashSet hashSet) {
        Object objCreate;
        HashMap map = this.f13642a;
        if (c0.C()) {
            try {
                Trace.beginSection(c0.Q(cls.getSimpleName()));
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (map.containsKey(cls)) {
            objCreate = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                b bVar = (b) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listDependencies = bVar.dependencies();
                if (!listDependencies.isEmpty()) {
                    for (Class cls2 : listDependencies) {
                        if (!map.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                objCreate = bVar.create(this.f13644c);
                hashSet.remove(cls);
                map.put(cls, objCreate);
            } catch (Throwable th3) {
                throw new d1(th3);
            }
        }
        Trace.endSection();
        return objCreate;
    }
}
