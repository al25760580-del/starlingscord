package u3;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import androidx.core.view.h;
import androidx.window.layout.WindowMetrics;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class c implements b, e, g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f20929c = new c(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f20930d = new c(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f20931e = new c(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f20932f = new c(3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f20933g = new c(4);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c f20934h = new c(5);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c f20935i = new c(6);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20936b;

    public /* synthetic */ c(int i7) {
        this.f20936b = i7;
    }

    @Override // u3.e
    public float a(Activity context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getResources().getDisplayMetrics().density;
    }

    @Override // u3.b
    public Rect b(Activity activity) throws Exception {
        switch (this.f20936b) {
            case 0:
                Intrinsics.checkNotNullParameter(activity, "activity");
                Rect rect = new Rect();
                Display display = activity.getWindowManager().getDefaultDisplay();
                display.getRectSize(rect);
                Intrinsics.checkNotNullParameter(activity, "activity");
                if (!activity.isInMultiWindowMode()) {
                    Intrinsics.checkNotNull(display);
                    Intrinsics.checkNotNullParameter(display, "display");
                    Point point = new Point();
                    display.getRealSize(point);
                    Resources resources = activity.getResources();
                    int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    int i7 = rect.bottom + dimensionPixelSize;
                    if (i7 == point.y) {
                        rect.bottom = i7;
                    } else {
                        int i10 = rect.right + dimensionPixelSize;
                        if (i10 == point.x) {
                            rect.right = i10;
                        }
                    }
                }
                return rect;
            case 1:
                Intrinsics.checkNotNullParameter(activity, "activity");
                Rect rect2 = new Rect();
                Configuration configuration = activity.getResources().getConfiguration();
                try {
                    Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(configuration);
                    Intrinsics.checkNotNullParameter(activity, "activity");
                    if (activity.isInMultiWindowMode()) {
                        Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                        Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type android.graphics.Rect");
                        rect2.set((Rect) objInvoke);
                    } else {
                        Object objInvoke2 = obj.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj, null);
                        Intrinsics.checkNotNull(objInvoke2, "null cannot be cast to non-null type android.graphics.Rect");
                        rect2.set((Rect) objInvoke2);
                    }
                    break;
                } catch (Exception e10) {
                    if (!(e10 instanceof NoSuchFieldException) && !(e10 instanceof NoSuchMethodException) && !(e10 instanceof IllegalAccessException) && !(e10 instanceof InvocationTargetException)) {
                        throw e10;
                    }
                    b.f20928a.getClass();
                    Log.w(a.f20927b, e10);
                    activity.getWindowManager().getDefaultDisplay().getRectSize(rect2);
                }
                Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
                Point point2 = new Point();
                defaultDisplay.getRealSize(point2);
                Intrinsics.checkNotNullParameter(activity, "activity");
                if (!activity.isInMultiWindowMode()) {
                    Resources resources2 = activity.getResources();
                    int identifier2 = resources2.getIdentifier("navigation_bar_height", "dimen", "android");
                    int dimensionPixelSize2 = identifier2 > 0 ? resources2.getDimensionPixelSize(identifier2) : 0;
                    int i11 = rect2.bottom + dimensionPixelSize2;
                    if (i11 == point2.y) {
                        rect2.bottom = i11;
                    } else {
                        int i12 = rect2.right + dimensionPixelSize2;
                        if (i12 == point2.x) {
                            rect2.right = i12;
                        } else if (rect2.left == dimensionPixelSize2) {
                            rect2.left = 0;
                        }
                    }
                }
                if (rect2.width() < point2.x || rect2.height() < point2.y) {
                    Intrinsics.checkNotNullParameter(activity, "activity");
                    if (!activity.isInMultiWindowMode()) {
                        Intrinsics.checkNotNull(defaultDisplay);
                        DisplayCutout displayCutoutA = h.a(defaultDisplay);
                        if (displayCutoutA != null) {
                            if (rect2.left == h.s(displayCutoutA)) {
                                rect2.left = 0;
                            }
                            if (point2.x - rect2.right == h.t(displayCutoutA)) {
                                rect2.right = h.t(displayCutoutA) + rect2.right;
                            }
                            if (rect2.top == h.u(displayCutoutA)) {
                                rect2.top = 0;
                            }
                            if (point2.y - rect2.bottom == h.r(displayCutoutA)) {
                                rect2.bottom = h.r(displayCutoutA) + rect2.bottom;
                            }
                        }
                    }
                }
                return rect2;
            default:
                Intrinsics.checkNotNullParameter(activity, "activity");
                Configuration configuration2 = activity.getResources().getConfiguration();
                try {
                    Field declaredField2 = Configuration.class.getDeclaredField("windowConfiguration");
                    declaredField2.setAccessible(true);
                    Object obj2 = declaredField2.get(configuration2);
                    Object objInvoke3 = obj2.getClass().getDeclaredMethod("getBounds", null).invoke(obj2, null);
                    Intrinsics.checkNotNull(objInvoke3, "null cannot be cast to non-null type android.graphics.Rect");
                    return new Rect((Rect) objInvoke3);
                } catch (Exception e11) {
                    if (!(e11 instanceof NoSuchFieldException) && !(e11 instanceof NoSuchMethodException) && !(e11 instanceof IllegalAccessException) && !(e11 instanceof InvocationTargetException)) {
                        throw e11;
                    }
                    b.f20928a.getClass();
                    Log.w(a.f20927b, e11);
                    return f20930d.b(activity);
                }
        }
    }

    @Override // u3.g
    public WindowMetrics c(Activity activity, e densityCompatHelper) {
        switch (this.f20936b) {
            case 4:
                Intrinsics.checkNotNullParameter(activity, "activity");
                Intrinsics.checkNotNullParameter(densityCompatHelper, "densityCompatHelper");
                b.f20928a.getClass();
                break;
            case 5:
                Intrinsics.checkNotNullParameter(activity, "activity");
                Intrinsics.checkNotNullParameter(densityCompatHelper, "densityCompatHelper");
                Intrinsics.checkNotNullParameter(activity, "activity");
                Intrinsics.checkNotNullParameter(densityCompatHelper, "densityCompatHelper");
                b.f20928a.getClass();
                break;
            default:
                Intrinsics.checkNotNullParameter(activity, "activity");
                Intrinsics.checkNotNullParameter(densityCompatHelper, "densityCompatHelper");
                b.f20928a.getClass();
                break;
        }
        return new WindowMetrics(new s3.a(a.a().b(activity)), densityCompatHelper.a(activity));
    }
}
