package i;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.e4;
import androidx.appcompat.widget.f4;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.f2;
import androidx.core.view.m0;
import androidx.core.view.r1;
import androidx.core.view.t1;
import androidx.core.view.u0;
import androidx.core.view.u1;
import androidx.core.view.v1;
import androidx.core.view.w1;
import androidx.core.view.x1;
import com.discord.R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class m implements androidx.core.view.t {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11249d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f11250e;

    public /* synthetic */ m(int i7, Object obj) {
        this.f11249d = i7;
        this.f11250e = obj;
    }

    @Override // androidx.core.view.t
    public final WindowInsetsCompat a(View v6, WindowInsetsCompat insets) {
        int i7;
        int i10;
        boolean z5;
        WindowInsetsCompat windowInsetsCompatB;
        x1 t1Var;
        boolean z6;
        boolean z7;
        int i11 = this.f11249d;
        Object obj = this.f11250e;
        switch (i11) {
            case 0:
                int iD = insets.d();
                androidx.appcompat.app.a aVar = (androidx.appcompat.app.a) obj;
                Context context = aVar.H;
                int iD2 = insets.d();
                ActionBarContextView actionBarContextView = aVar.S;
                if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
                    i7 = 0;
                    i10 = 8;
                    z5 = false;
                } else {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) aVar.S.getLayoutParams();
                    if (aVar.S.isShown()) {
                        if (aVar.f762z0 == null) {
                            aVar.f762z0 = new Rect();
                            aVar.A0 = new Rect();
                        }
                        Rect rect = aVar.f762z0;
                        Rect rect2 = aVar.A0;
                        rect.set(insets.b(), insets.d(), insets.c(), insets.a());
                        ViewGroup viewGroup = aVar.X;
                        if (Build.VERSION.SDK_INT >= 29) {
                            boolean z10 = f4.f976a;
                            e4.a(viewGroup, rect, rect2);
                        } else {
                            if (!f4.f976a) {
                                f4.f976a = true;
                                try {
                                    Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                                    f4.f977b = declaredMethod;
                                    if (!declaredMethod.isAccessible()) {
                                        f4.f977b.setAccessible(true);
                                    }
                                } catch (NoSuchMethodException unused) {
                                    Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                                }
                            }
                            Method method = f4.f977b;
                            if (method != null) {
                                try {
                                    method.invoke(viewGroup, rect, rect2);
                                } catch (Exception e10) {
                                    Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e10);
                                }
                            }
                        }
                        int i12 = rect.top;
                        int i13 = rect.left;
                        int i14 = rect.right;
                        ViewGroup viewGroup2 = aVar.X;
                        WeakHashMap weakHashMap = u0.f1729a;
                        WindowInsetsCompat windowInsetsCompatA = m0.a(viewGroup2);
                        int iB = windowInsetsCompatA == null ? 0 : windowInsetsCompatA.b();
                        int iC = windowInsetsCompatA == null ? 0 : windowInsetsCompatA.c();
                        if (marginLayoutParams.topMargin == i12 && marginLayoutParams.leftMargin == i13 && marginLayoutParams.rightMargin == i14) {
                            z7 = false;
                        } else {
                            marginLayoutParams.topMargin = i12;
                            marginLayoutParams.leftMargin = i13;
                            marginLayoutParams.rightMargin = i14;
                            z7 = true;
                        }
                        if (i12 <= 0 || aVar.Z != null) {
                            i10 = 8;
                            View view = aVar.Z;
                            if (view != null) {
                                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                                int i15 = marginLayoutParams2.height;
                                int i16 = marginLayoutParams.topMargin;
                                if (i15 != i16 || marginLayoutParams2.leftMargin != iB || marginLayoutParams2.rightMargin != iC) {
                                    marginLayoutParams2.height = i16;
                                    marginLayoutParams2.leftMargin = iB;
                                    marginLayoutParams2.rightMargin = iC;
                                    aVar.Z.setLayoutParams(marginLayoutParams2);
                                }
                            }
                        } else {
                            View view2 = new View(context);
                            aVar.Z = view2;
                            i10 = 8;
                            view2.setVisibility(8);
                            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                            layoutParams.leftMargin = iB;
                            layoutParams.rightMargin = iC;
                            aVar.X.addView(aVar.Z, -1, layoutParams);
                        }
                        View view3 = aVar.Z;
                        boolean z11 = view3 != null;
                        if (z11 && view3.getVisibility() != 0) {
                            View view4 = aVar.Z;
                            view4.setBackgroundColor((view4.getWindowSystemUiVisibility() & 8192) != 0 ? context.getColor(R.color.abc_decor_view_status_guard_light) : context.getColor(R.color.abc_decor_view_status_guard));
                        }
                        if (!aVar.f742e0 && z11) {
                            iD2 = 0;
                        }
                        z5 = z11;
                        z6 = z7;
                        i7 = 0;
                        break;
                    } else {
                        i10 = 8;
                        i7 = 0;
                        if (marginLayoutParams.topMargin != 0) {
                            marginLayoutParams.topMargin = 0;
                            z5 = false;
                            z6 = true;
                        } else {
                            z5 = false;
                            z6 = false;
                        }
                    }
                    if (z6) {
                        aVar.S.setLayoutParams(marginLayoutParams);
                    }
                }
                View view5 = aVar.Z;
                if (view5 != null) {
                    if (!z5) {
                        i7 = i10;
                    }
                    view5.setVisibility(i7);
                }
                if (iD != iD2) {
                    int iB2 = insets.b();
                    int iC2 = insets.c();
                    int iA = insets.a();
                    insets.getClass();
                    int i17 = Build.VERSION.SDK_INT;
                    if (i17 >= 34) {
                        t1Var = new w1(insets);
                    } else if (i17 >= 31) {
                        t1Var = new v1(insets);
                    } else if (i17 >= 30) {
                        t1Var = new u1(insets);
                    } else {
                        t1Var = i17 >= 29 ? new t1(insets) : new r1(insets);
                    }
                    t1Var.g(Insets.b(iB2, iD2, iC2, iA));
                    windowInsetsCompatB = t1Var.b();
                } else {
                    windowInsetsCompatB = insets;
                }
                return u0.k(v6, windowInsetsCompatB);
            case 1:
                mg.f fVar = (mg.f) obj;
                WindowInsetsCompat windowInsetsCompat = fVar.getFitsSystemWindows() ? insets : null;
                if (!Objects.equals(fVar.f15783y, windowInsetsCompat)) {
                    fVar.f15783y = windowInsetsCompat;
                    fVar.setWillNotDraw(!(fVar.T != null && fVar.getTopInset() > 0));
                    fVar.requestLayout();
                }
                return insets;
            case 2:
                Intrinsics.checkNotNullParameter(v6, "v");
                Intrinsics.checkNotNullParameter(insets, "insets");
                Iterator it = ((ArrayList) obj).iterator();
                while (it.hasNext()) {
                    ((androidx.core.view.t) it.next()).a(v6, insets);
                }
                return insets;
            default:
                f2 f2Var = insets.f1605a;
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) obj;
                if (!Objects.equals(coordinatorLayout.J, insets)) {
                    coordinatorLayout.J = insets;
                    boolean z12 = insets.d() > 0;
                    coordinatorLayout.K = z12;
                    coordinatorLayout.setWillNotDraw(!z12 && coordinatorLayout.getBackground() == null);
                    if (!f2Var.n()) {
                        int childCount = coordinatorLayout.getChildCount();
                        for (int i18 = 0; i18 < childCount; i18++) {
                            View childAt = coordinatorLayout.getChildAt(i18);
                            WeakHashMap weakHashMap2 = u0.f1729a;
                            if (!childAt.getFitsSystemWindows() || ((v0.d) childAt.getLayoutParams()).f21325a == null || !f2Var.n()) {
                            }
                        }
                    }
                    coordinatorLayout.requestLayout();
                }
                return insets;
        }
    }

    public m() {
        this.f11249d = 2;
        this.f11250e = new ArrayList();
    }
}
