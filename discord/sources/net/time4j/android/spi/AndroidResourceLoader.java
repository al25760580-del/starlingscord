package net.time4j.android.spi;

import android.content.Context;
import as.a;
import as.d;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;
import net.time4j.tz.o;
import net.time4j.tz.p;
import net.time4j.x;
import ur.f;
import vr.c;
import yr.a0;
import yr.e;
import yr.h;
import yr.h0;
import yr.r0;
import yr.s0;
import zr.j;

/* JADX INFO: loaded from: classes3.dex */
public class AndroidResourceLoader extends c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Map f16593f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Set f16594g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f16595d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f16596e = Collections.EMPTY_LIST;

    static {
        HashMap map = new HashMap();
        map.put(h0.class, new ur.c(4));
        map.put(o.class, new ur.c(7));
        map.put(p.class, new ur.c(6));
        map.put(a.class, new ur.c(1));
        map.put(x.class, new ur.c(0));
        map.put(h.class, new ur.c(2));
        map.put(a0.class, new ur.c(3));
        map.put(r0.class, Collections.singleton(new j()));
        map.put(s0.class, new ur.c(5));
        map.put(d.class, Collections.singleton(new f()));
        f16593f = Collections.unmodifiableMap(map);
        HashSet hashSet = new HashSet();
        hashSet.add("i18n");
        hashSet.add("calendar");
        hashSet.add("olson");
        hashSet.add("tzdata");
        f16594g = Collections.unmodifiableSet(hashSet);
    }

    @Override // vr.c
    public final InputStream b(URI uri) {
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isAbsolute()) {
                URLConnection uRLConnectionOpenConnection = uri.toURL().openConnection();
                uRLConnectionOpenConnection.setUseCaches(false);
                return uRLConnectionOpenConnection.getInputStream();
            }
            Context context = this.f16595d;
            if (context != null) {
                return context.getAssets().open(uri.toString());
            }
            throw new IllegalStateException("'ApplicationStarter.initialize(context)' must be called first at app start.");
        } catch (IOException | RuntimeException unused) {
            return null;
        }
    }

    @Override // vr.c
    public final URI c(String str, String str2, Class cls) {
        try {
            if (!f16594g.contains(str)) {
                URL resource = cls.getClassLoader().getResource(str2);
                if (resource != null) {
                    return resource.toURI();
                }
                return null;
            }
            return new URI("net/time4j/" + str + '/' + str2);
        } catch (URISyntaxException unused) {
            return null;
        }
    }

    @Override // vr.c
    public final Iterable d(Class cls) {
        Iterable iterable = (Iterable) f16593f.get(cls);
        if (iterable == null) {
            if (cls != e.class) {
                return ServiceLoader.load(cls, cls.getClassLoader());
            }
            iterable = this.f16596e;
        }
        return iterable;
    }
}
