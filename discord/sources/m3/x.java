package m3;

import android.view.ViewGroup;
import androidx.transition.Transition;
import com.discord.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f15456a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f15457b = new ThreadLocal();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ArrayList f15458c = new ArrayList();

    public static void a(ViewGroup viewGroup, Transition transition) {
        ArrayList arrayList = f15458c;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        arrayList.add(viewGroup);
        if (transition == null) {
            transition = f15456a;
        }
        Transition transitionClone = transition.clone();
        c(viewGroup, transitionClone);
        viewGroup.setTag(R.id.transition_current_scene, null);
        w wVar = new w();
        wVar.f15454d = transitionClone;
        wVar.f15455e = viewGroup;
        viewGroup.addOnAttachStateChangeListener(wVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(wVar);
    }

    public static s.e b() {
        s.e eVar;
        ThreadLocal threadLocal = f15457b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (eVar = (s.e) weakReference.get()) != null) {
            return eVar;
        }
        s.e eVar2 = new s.e(0);
        threadLocal.set(new WeakReference(eVar2));
        return eVar2;
    }

    public static void c(ViewGroup viewGroup, Transition transition) {
        ArrayList arrayList = (ArrayList) b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((Transition) it.next()).B(viewGroup);
            }
        }
        if (transition != null) {
            transition.h(viewGroup, true);
        }
        if (viewGroup.getTag(R.id.transition_current_scene) != null) {
            throw new ClassCastException();
        }
    }
}
