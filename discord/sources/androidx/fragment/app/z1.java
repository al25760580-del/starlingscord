package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class z1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final z1 f2289d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final z1 f2290e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final z1 f2291i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final z1 f2292v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ z1[] f2293w;

    static {
        z1 z1Var = new z1("REMOVED", 0);
        f2289d = z1Var;
        z1 z1Var2 = new z1("VISIBLE", 1);
        f2290e = z1Var2;
        z1 z1Var3 = new z1("GONE", 2);
        f2291i = z1Var3;
        z1 z1Var4 = new z1("INVISIBLE", 3);
        f2292v = z1Var4;
        f2293w = new z1[]{z1Var, z1Var2, z1Var3, z1Var4};
    }

    public static z1 valueOf(String str) {
        return (z1) Enum.valueOf(z1.class, str);
    }

    public static z1[] values() {
        return (z1[]) f2293w.clone();
    }

    public final void a(View view, ViewGroup container) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(container, "container");
        if (FragmentManager.M(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Calling apply state");
        }
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                if (FragmentManager.M(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                }
                viewGroup.removeView(view);
                return;
            }
            return;
        }
        if (iOrdinal == 1) {
            if (FragmentManager.M(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
            }
            ViewParent parent2 = view.getParent();
            if ((parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null) == null) {
                if (FragmentManager.M(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Adding view " + view + " to Container " + container);
                }
                container.addView(view);
            }
            view.setVisibility(0);
            return;
        }
        if (iOrdinal == 2) {
            if (FragmentManager.M(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
            }
            view.setVisibility(8);
            return;
        }
        if (iOrdinal != 3) {
            return;
        }
        if (FragmentManager.M(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
        }
        view.setVisibility(4);
    }
}
