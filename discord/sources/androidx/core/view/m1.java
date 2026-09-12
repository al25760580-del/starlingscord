package androidx.core.view;

import android.os.Build;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class m1 extends WindowInsetsAnimation$Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g1 f1701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f1702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f1703c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f1704d;

    public m1(g1 g1Var) {
        super(g1Var.getDispatchMode());
        this.f1704d = new HashMap();
        this.f1701a = g1Var;
    }

    public final p1 a(WindowInsetsAnimation windowInsetsAnimation) {
        p1 p1Var = (p1) this.f1704d.get(windowInsetsAnimation);
        if (p1Var == null) {
            p1Var = new p1(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                p1Var.f1715a = new n1(windowInsetsAnimation);
            }
            this.f1704d.put(windowInsetsAnimation, p1Var);
        }
        return p1Var;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.f1701a.onEnd(a(windowInsetsAnimation));
        this.f1704d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        this.f1701a.onPrepare(a(windowInsetsAnimation));
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.f1703c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f1703c = arrayList2;
            this.f1702b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimation = (WindowInsetsAnimation) list.get(size);
            p1 p1VarA = a(windowInsetsAnimation);
            p1VarA.f1715a.d(windowInsetsAnimation.getFraction());
            this.f1703c.add(p1VarA);
        }
        return this.f1701a.onProgress(WindowInsetsCompat.g(null, windowInsets), this.f1702b).f();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        f1 f1VarOnStart = this.f1701a.onStart(a(windowInsetsAnimation), new f1(bounds));
        f1VarOnStart.getClass();
        l1.c();
        return l1.a(f1VarOnStart.f1659a.d(), f1VarOnStart.f1660b.d());
    }
}
