package androidx.core.view;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.discord.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class t0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ArrayList f1724d = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakHashMap f1725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SparseArray f1726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WeakReference f1727c;

    public final View a(View view) {
        int size;
        WeakHashMap weakHashMap = this.f1725a;
        if (weakHashMap == null || !weakHashMap.containsKey(view)) {
            return null;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View viewA = a(viewGroup.getChildAt(childCount));
                if (viewA != null) {
                    return viewA;
                }
            }
        }
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
        if (arrayList == null || (size = arrayList.size() - 1) < 0) {
            return null;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }
}
