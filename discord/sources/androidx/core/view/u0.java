package androidx.core.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.PathInterpolator;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static WeakHashMap f1729a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Field f1730b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f1731c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f1732d = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f0 f1733e = new f0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final h0 f1734f = new h0();

    public static void a(View view, ViewGroup viewGroup) {
        viewGroup.getOverlay().add(view);
        View view2 = (View) view.getParent();
        Intrinsics.checkNotNullParameter(view2, "<this>");
        view2.setTag(R.id.view_tree_disjoint_parent, viewGroup);
    }

    public static c1 b(View view) {
        if (f1729a == null) {
            f1729a = new WeakHashMap();
        }
        c1 c1Var = (c1) f1729a.get(view);
        if (c1Var != null) {
            return c1Var;
        }
        c1 c1Var2 = new c1(view);
        f1729a.put(view, c1Var2);
        return c1Var2;
    }

    public static void c(View view, WindowInsetsCompat windowInsetsCompat) {
        int i7 = Build.VERSION.SDK_INT;
        WindowInsets windowInsetsF = windowInsetsCompat.f();
        if (windowInsetsF != null) {
            WindowInsets windowInsetsA = i7 >= 30 ? q0.a(view, windowInsetsF) : j0.a(view, windowInsetsF);
            if (windowInsetsA.equals(windowInsetsF)) {
                return;
            }
            WindowInsetsCompat.g(view, windowInsetsA);
        }
    }

    public static boolean d(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = t0.f1724d;
        t0 t0Var = (t0) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (t0Var == null) {
            t0Var = new t0();
            t0Var.f1725a = null;
            t0Var.f1726b = null;
            t0Var.f1727c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, t0Var);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = t0Var.f1725a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = t0.f1724d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (t0Var.f1725a == null) {
                            t0Var.f1725a = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = t0.f1724d;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                t0Var.f1725a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    t0Var.f1725a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
        View viewA = t0Var.a(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (viewA != null && !KeyEvent.isModifierKey(keyCode)) {
                if (t0Var.f1726b == null) {
                    t0Var.f1726b = new SparseArray();
                }
                t0Var.f1726b.put(keyCode, new WeakReference(viewA));
            }
        }
        return viewA != null;
    }

    public static b e(View view) {
        View.AccessibilityDelegate accessibilityDelegateF = f(view);
        if (accessibilityDelegateF == null) {
            return null;
        }
        return accessibilityDelegateF instanceof a ? ((a) accessibilityDelegateF).f1607a : new b(accessibilityDelegateF);
    }

    public static View.AccessibilityDelegate f(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return p0.a(view);
        }
        if (f1731c) {
            return null;
        }
        if (f1730b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f1730b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f1731c = true;
                return null;
            }
        }
        try {
            Object obj = f1730b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f1731c = true;
            return null;
        }
    }

    public static CharSequence g(View view) {
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = o0.a(view);
        } else {
            tag = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }

    public static ArrayList h(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static String[] i(AppCompatEditText appCompatEditText) {
        return Build.VERSION.SDK_INT >= 31 ? r0.a(appCompatEditText) : (String[]) appCompatEditText.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void j(int i7, View view) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z5 = g(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z5) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z5 ? 32 : RecyclerView.ItemAnimator.FLAG_MOVED);
                accessibilityEventObtain.setContentChangeTypes(i7);
                if (z5) {
                    accessibilityEventObtain.getText().add(g(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i7 != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i7);
                        return;
                    } catch (AbstractMethodError e10) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e10);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            accessibilityEventObtain2.setContentChangeTypes(i7);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.getText().add(g(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    public static WindowInsetsCompat k(View view, WindowInsetsCompat windowInsetsCompat) {
        WindowInsets windowInsetsF = windowInsetsCompat.f();
        if (windowInsetsF != null) {
            WindowInsets windowInsetsB = j0.b(view, windowInsetsF);
            if (!windowInsetsB.equals(windowInsetsF)) {
                return WindowInsetsCompat.g(view, windowInsetsB);
            }
        }
        return windowInsetsCompat;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ContentInfoCompat l(View view, ContentInfoCompat contentInfoCompat) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + contentInfoCompat + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return r0.b(view, contentInfoCompat);
        }
        u uVar = (u) view.getTag(R.id.tag_on_receive_content_listener);
        v vVar = f1733e;
        if (uVar == null) {
            if (view instanceof v) {
                vVar = (v) view;
            }
            return vVar.onReceiveContent(contentInfoCompat);
        }
        ContentInfoCompat contentInfoCompatA = uVar.a(view, contentInfoCompat);
        if (contentInfoCompatA == null) {
            return null;
        }
        if (view instanceof v) {
            vVar = (v) view;
        }
        return vVar.onReceiveContent(contentInfoCompatA);
    }

    public static void m(int i7, View view) {
        ArrayList arrayListH = h(view);
        for (int i10 = 0; i10 < arrayListH.size(); i10++) {
            if (((androidx.core.view.accessibility.a) arrayListH.get(i10)).a() == i7) {
                arrayListH.remove(i10);
                return;
            }
        }
    }

    public static void n(View view, androidx.core.view.accessibility.a aVar, CharSequence charSequence, AccessibilityViewCommand accessibilityViewCommand) {
        if (accessibilityViewCommand == null && charSequence == null) {
            m(aVar.a(), view);
            j(0, view);
            return;
        }
        androidx.core.view.accessibility.a aVar2 = new androidx.core.view.accessibility.a(null, aVar.f1628b, charSequence, accessibilityViewCommand, aVar.f1629c);
        b bVarE = e(view);
        if (bVarE == null) {
            bVarE = new b();
        }
        p(view, bVarE);
        m(aVar2.a(), view);
        h(view).add(aVar2);
        j(0, view);
    }

    public static void o(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i7, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            p0.b(view, context, iArr, attributeSet, typedArray, i7, i10);
        }
    }

    public static void p(View view, b bVar) {
        if (bVar == null && (f(view) instanceof a)) {
            bVar = new b();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(bVar == null ? null : bVar.getBridge());
    }

    public static void q(View view, CharSequence charSequence) {
        new g0(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).f(view, charSequence);
        h0 h0Var = f1734f;
        if (charSequence == null) {
            h0Var.f1664d.remove(view);
            view.removeOnAttachStateChangeListener(h0Var);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(h0Var);
        } else {
            h0Var.f1664d.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(h0Var);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(h0Var);
            }
        }
    }

    public static void r(View view, g1 g1Var) {
        if (Build.VERSION.SDK_INT >= 30) {
            n1.g(view, g1Var);
            return;
        }
        PathInterpolator pathInterpolator = k1.f1687e;
        View.OnApplyWindowInsetsListener j1Var = g1Var != null ? new j1(view, g1Var) : null;
        view.setTag(R.id.tag_window_insets_animation_callback, j1Var);
        if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(j1Var);
        }
    }
}
