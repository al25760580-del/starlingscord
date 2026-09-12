package androidx.core.view;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import androidx.core.graphics.Insets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public final class r1 extends x1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Field f1717e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f1718f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Constructor f1719g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f1720h = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WindowInsets f1721c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Insets f1722d;

    public r1() {
        this.f1721c = i();
    }

    private static WindowInsets i() {
        if (!f1718f) {
            try {
                f1717e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e10) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e10);
            }
            f1718f = true;
        }
        Field field = f1717e;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e11) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e11);
            }
        }
        if (!f1720h) {
            try {
                f1719g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e12) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e12);
            }
            f1720h = true;
        }
        Constructor constructor = f1719g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e13) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e13);
            }
        }
        return null;
    }

    @Override // androidx.core.view.x1
    public WindowInsetsCompat b() {
        a();
        WindowInsetsCompat windowInsetsCompatG = WindowInsetsCompat.g(null, this.f1721c);
        Insets[] insetsArr = this.f1743b;
        f2 f2Var = windowInsetsCompatG.f1605a;
        f2Var.q(insetsArr);
        f2Var.s(this.f1722d);
        return windowInsetsCompatG;
    }

    @Override // androidx.core.view.x1
    public void e(Insets insets) {
        this.f1722d = insets;
    }

    @Override // androidx.core.view.x1
    public void g(Insets insets) {
        WindowInsets windowInsets = this.f1721c;
        if (windowInsets != null) {
            this.f1721c = windowInsets.replaceSystemWindowInsets(insets.f1556a, insets.f1557b, insets.f1558c, insets.f1559d);
        }
    }

    public r1(WindowInsetsCompat windowInsetsCompat) {
        super(windowInsetsCompat);
        this.f1721c = windowInsetsCompat.f();
    }
}
