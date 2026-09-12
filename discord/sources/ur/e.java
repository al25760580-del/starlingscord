package ur;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import net.time4j.tz.o;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f21311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f21312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Collection f21313c;

    static {
        as.a aVar;
        Set setSingleton = Collections.singleton(new bs.a());
        f21311a = setSingleton;
        f21312b = Collections.singleton(new bs.b());
        Iterator it = setSingleton.iterator();
        while (true) {
            if (!it.hasNext()) {
                aVar = null;
                break;
            }
            o oVar = (o) it.next();
            if (oVar instanceof as.a) {
                aVar = (as.a) as.a.class.cast(oVar);
                break;
            }
        }
        if (aVar == null) {
            f21313c = Collections.EMPTY_LIST;
        } else {
            f21313c = Collections.singleton(aVar);
        }
    }
}
