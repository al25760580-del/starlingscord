package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import com.discord.R;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class k1 extends o1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final PathInterpolator f1687e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final q2.a f1688f = new q2.a(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final DecelerateInterpolator f1689g = new DecelerateInterpolator(1.5f);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final AccelerateInterpolator f1690h = new AccelerateInterpolator(1.5f);

    public static void e(View view, p1 p1Var) {
        g1 g1VarJ = j(view);
        if (g1VarJ != null) {
            g1VarJ.onEnd(p1Var);
            if (g1VarJ.getDispatchMode() == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                e(viewGroup.getChildAt(i7), p1Var);
            }
        }
    }

    public static void f(View view, p1 p1Var, WindowInsetsCompat windowInsetsCompat, boolean z5) {
        g1 g1VarJ = j(view);
        if (g1VarJ != null) {
            g1VarJ.mDispachedInsets = windowInsetsCompat;
            if (!z5) {
                g1VarJ.onPrepare(p1Var);
                z5 = g1VarJ.getDispatchMode() == 0;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                f(viewGroup.getChildAt(i7), p1Var, windowInsetsCompat, z5);
            }
        }
    }

    public static void g(View view, WindowInsetsCompat windowInsetsCompat, List list) {
        g1 g1VarJ = j(view);
        if (g1VarJ != null) {
            windowInsetsCompat = g1VarJ.onProgress(windowInsetsCompat, list);
            if (g1VarJ.getDispatchMode() == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                g(viewGroup.getChildAt(i7), windowInsetsCompat, list);
            }
        }
    }

    public static void h(View view, p1 p1Var, f1 f1Var) {
        g1 g1VarJ = j(view);
        if (g1VarJ != null) {
            g1VarJ.onStart(p1Var, f1Var);
            if (g1VarJ.getDispatchMode() == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                h(viewGroup.getChildAt(i7), p1Var, f1Var);
            }
        }
    }

    public static WindowInsets i(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    public static g1 j(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof j1) {
            return ((j1) tag).f1682a;
        }
        return null;
    }
}
