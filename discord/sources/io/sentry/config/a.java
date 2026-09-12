package io.sentry.config;

import android.animation.TimeInterpolator;
import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.Path;
import android.os.Build;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.core.view.j;
import androidx.core.view.t0;
import androidx.core.view.u0;
import androidx.recyclerview.widget.RecyclerView;
import ci.t;
import com.discord.R;
import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.swmansion.rnscreens.Screen;
import com.swmansion.rnscreens.ScreenContainer;
import com.swmansion.rnscreens.ScreenFragmentWrapper;
import com.swmansion.rnscreens.q;
import e4.f;
import hj.g;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.WeakHashMap;
import java.util.logging.Logger;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonObjectBuilder;
import kq.m;
import or.n1;
import pr.h;
import rn.n;
import vo.u;
import yo.q0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f12574b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Method f12575c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f12576d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Field f12577e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f12578f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static AnimatedFactoryV2Impl f12579g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f12580h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static boolean f12581i;
    public static boolean j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12582a;

    public /* synthetic */ a(int i7) {
        this.f12582a = i7;
    }

    public static Date A(String str) {
        try {
            return io.sentry.vendor.gson.internal.bind.util.a.c(str, new ParsePosition(0));
        } catch (ParseException unused) {
            throw new IllegalArgumentException(a3.e.l("timestamp is not ISO format ", str));
        }
    }

    public static Date B(String str) {
        try {
            return z(new BigDecimal(str).setScale(3, RoundingMode.DOWN).movePointRight(3).longValue());
        } catch (NumberFormatException unused) {
            throw new IllegalArgumentException(a3.e.l("timestamp is not millis format ", str));
        }
    }

    public static float D(String[] strArr, int i7) {
        float f2 = Float.parseFloat(strArr[i7]);
        if (f2 >= 0.0f && f2 <= 1.0f) {
            return f2;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f2);
    }

    public static String F(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return "TRuntime.".concat(str);
        }
        String strConcat = "TRuntime.".concat(str);
        return strConcat.length() > 23 ? strConcat.substring(0, 23) : strConcat;
    }

    public static String G(Date date) {
        TimeZone timeZone = io.sentry.vendor.gson.internal.bind.util.a.f13254a;
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone, Locale.US);
        gregorianCalendar.setTime(date);
        StringBuilder sb2 = new StringBuilder(23 + (timeZone.getRawOffset() == 0 ? 1 : 6));
        io.sentry.vendor.gson.internal.bind.util.a.b(gregorianCalendar.get(1), 4, sb2);
        sb2.append('-');
        io.sentry.vendor.gson.internal.bind.util.a.b(gregorianCalendar.get(2) + 1, 2, sb2);
        sb2.append('-');
        io.sentry.vendor.gson.internal.bind.util.a.b(gregorianCalendar.get(5), 2, sb2);
        sb2.append('T');
        io.sentry.vendor.gson.internal.bind.util.a.b(gregorianCalendar.get(11), 2, sb2);
        sb2.append(':');
        io.sentry.vendor.gson.internal.bind.util.a.b(gregorianCalendar.get(12), 2, sb2);
        sb2.append(':');
        io.sentry.vendor.gson.internal.bind.util.a.b(gregorianCalendar.get(13), 2, sb2);
        sb2.append('.');
        io.sentry.vendor.gson.internal.bind.util.a.b(gregorianCalendar.get(14), 3, sb2);
        int offset = timeZone.getOffset(gregorianCalendar.getTimeInMillis());
        if (offset != 0) {
            int i7 = offset / 60000;
            int iAbs = Math.abs(i7 / 60);
            int iAbs2 = Math.abs(i7 % 60);
            sb2.append(offset >= 0 ? '+' : '-');
            io.sentry.vendor.gson.internal.bind.util.a.b(iAbs, 2, sb2);
            sb2.append(':');
            io.sentry.vendor.gson.internal.bind.util.a.b(iAbs2, 2, sb2);
        } else {
            sb2.append('Z');
        }
        return sb2.toString();
    }

    public static final Object H(m mVar, KProperty p3) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(p3, "p");
        return mVar.invoke();
    }

    public static boolean K(int i7) {
        if (i7 == 0) {
            return false;
        }
        ThreadLocal threadLocal = b1.c.f3024a;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int iRed = Color.red(i7);
        int iGreen = Color.green(i7);
        int iBlue = Color.blue(i7);
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d6 = ((double) iRed) / 255.0d;
        double dPow = d6 < 0.04045d ? d6 / 12.92d : Math.pow((d6 + 0.055d) / 1.055d, 2.4d);
        double d7 = ((double) iGreen) / 255.0d;
        double dPow2 = d7 < 0.04045d ? d7 / 12.92d : Math.pow((d7 + 0.055d) / 1.055d, 2.4d);
        double d8 = ((double) iBlue) / 255.0d;
        double dPow3 = d8 < 0.04045d ? d8 / 12.92d : Math.pow((d8 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.1805d * dPow3) + (0.3576d * dPow2) + (0.4124d * dPow)) * 100.0d;
        double d9 = ((0.0722d * dPow3) + (0.7152d * dPow2) + (0.2126d * dPow)) * 100.0d;
        dArr[1] = d9;
        dArr[2] = ((dPow3 * 0.9505d) + (dPow2 * 0.1192d) + (dPow * 0.0193d)) * 100.0d;
        return d9 / 100.0d > 0.5d;
    }

    public static boolean M(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    public static int N(int i7, int i10, float f2) {
        return b1.c.c(b1.c.e(i10, Math.round(Color.alpha(i10) * f2)), i7);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:40:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:48:0x0105  */
    /* JADX WARN: Code duplicated, block: B:50:0x010b  */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0117, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(bq.e.g(r3), bq.e.g(r0)) != false) goto L52;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static np.k O(vo.u r7, yo.q0 r8) {
        /*
            Method dump skipped, instruction units count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.config.a.O(vo.u, yo.q0):np.k");
    }

    public static final void P(JsonObjectBuilder jsonObjectBuilder, String key, Number number) {
        Intrinsics.checkNotNullParameter(jsonObjectBuilder, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        jsonObjectBuilder.b(key, h.b(number));
    }

    public static final void Q(JsonObjectBuilder jsonObjectBuilder, String key, String str) {
        Intrinsics.checkNotNullParameter(jsonObjectBuilder, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        jsonObjectBuilder.b(key, h.c(str));
    }

    public static final void R(JsonObjectBuilder jsonObjectBuilder, String key, Function1 builderAction) {
        Intrinsics.checkNotNullParameter(jsonObjectBuilder, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        JsonObjectBuilder jsonObjectBuilder2 = new JsonObjectBuilder();
        builderAction.invoke(jsonObjectBuilder2);
        jsonObjectBuilder.b(key, jsonObjectBuilder2.a());
    }

    public static int S(Context context, int i7, int i10) {
        TypedValue typedValueT = com.facebook.imagepipeline.nativecode.b.t(context, i7);
        return (typedValueT == null || typedValueT.type != 16) ? i10 : typedValueT.data;
    }

    public static TimeInterpolator T(Context context, int i7, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i7, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String strValueOf = String.valueOf(typedValue.string);
        if (!M(strValueOf, "cubic-bezier") && !M(strValueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (M(strValueOf, "cubic-bezier")) {
            String[] strArrSplit = strValueOf.substring(13, strValueOf.length() - 1).split(",");
            if (strArrSplit.length == 4) {
                return new PathInterpolator(D(strArrSplit, 0), D(strArrSplit, 1), D(strArrSplit, 2), D(strArrSplit, 3));
            }
            throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + strArrSplit.length);
        }
        if (!M(strValueOf, "path")) {
            throw new IllegalArgumentException("Invalid motion easing type: ".concat(strValueOf));
        }
        String strSubstring = strValueOf.substring(5, strValueOf.length() - 1);
        Path path = new Path();
        try {
            f.k0(f.v(strSubstring), path);
            return new PathInterpolator(path);
        } catch (RuntimeException e10) {
            throw new RuntimeException("Error in parsing ".concat(strSubstring), e10);
        }
    }

    public static void W(Screen screen, Activity activity) {
        Boolean boolIsStatusBarHidden;
        Intrinsics.checkNotNullParameter(screen, "screen");
        if (activity == null) {
            return;
        }
        Screen screenT = t(screen, q.f7230i);
        boolean zBooleanValue = (screenT == null || (boolIsStatusBarHidden = screenT.isStatusBarHidden()) == null) ? false : boolIsStatusBarHidden.booleanValue();
        Window window = activity.getWindow();
        UiThreadUtil.runOnUiThread(new com.facebook.react.devsupport.e(zBooleanValue, new WindowInsetsControllerCompat(window, window.getDecorView()), 5));
    }

    public static void X(Screen screen, Activity activity) {
        Boolean boolIsNavigationBarHidden;
        Intrinsics.checkNotNullParameter(screen, "screen");
        if (activity == null) {
            return;
        }
        Window window = activity.getWindow();
        Screen screenT = t(screen, q.f7231v);
        if (!((screenT == null || (boolIsNavigationBarHidden = screenT.isNavigationBarHidden()) == null) ? false : boolIsNavigationBarHidden.booleanValue())) {
            new WindowInsetsControllerCompat(window, window.getDecorView()).e(2);
            return;
        }
        WindowInsetsControllerCompat windowInsetsControllerCompat = new WindowInsetsControllerCompat(window, window.getDecorView());
        windowInsetsControllerCompat.a(2);
        windowInsetsControllerCompat.d();
    }

    public static void Y(Screen screen, Activity activity, ReactContext reactContext) {
        String statusBarStyle;
        Intrinsics.checkNotNullParameter(screen, "screen");
        if (activity == null || reactContext == null) {
            return;
        }
        Screen screenT = t(screen, q.f7229e);
        if (screenT == null || (statusBarStyle = screenT.getStatusBarStyle()) == null) {
            statusBarStyle = "light";
        }
        UiThreadUtil.runOnUiThread(new com.facebook.react.modules.statusbar.a(activity, statusBarStyle, 1));
    }

    public static void Z(Screen screen, Activity activity, ReactContext reactContext) {
        Integer screenOrientation;
        Intrinsics.checkNotNullParameter(screen, "screen");
        if (f12580h) {
            Intrinsics.checkNotNullParameter(screen, "screen");
            if (activity != null) {
                Screen screenT = t(screen, q.f7228d);
                activity.setRequestedOrientation((screenT == null || (screenOrientation = screenT.getScreenOrientation()) == null) ? -1 : screenOrientation.intValue());
            }
        }
        if (f12581i) {
            Y(screen, activity, reactContext);
            W(screen, activity);
        }
        if (j) {
            X(screen, activity);
        }
    }

    public static final ArrayList a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            t tVar = (t) it.next();
            Bundle bundle = new Bundle();
            bundle.putInt("event_type", tVar.f3723a);
            bundle.putLong("event_timestamp", tVar.f3724b);
            arrayList2.add(bundle);
        }
        return arrayList2;
    }

    public static final double a0(long j5) {
        return ((j5 >>> 11) * ((double) RecyclerView.ItemAnimator.FLAG_MOVED)) + (j5 & 2047);
    }

    public static final void b(fs.a aVar, fs.b bVar, String str) {
        Logger logger = fs.c.f9421i;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(bVar.f9415b);
        sb2.append(' ');
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str2 = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "format(format, *args)");
        sb2.append(str2);
        sb2.append(": ");
        sb2.append(aVar.f9410a);
        logger.fine(sb2.toString());
    }

    public static void d(boolean z5) {
        if (!z5) {
            throw new AssertionError();
        }
    }

    public static void e(boolean z5, String str) {
        if (!z5) {
            throw new AssertionError(str);
        }
    }

    public static void f(Object obj) {
        if (obj == null) {
            throw new AssertionError();
        }
    }

    public static void g(Object obj, String str) {
        if (obj == null) {
            throw new AssertionError(str);
        }
    }

    public static boolean h(Screen screen, q qVar) {
        int iOrdinal = qVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        if (iOrdinal != 4) {
                            throw new n();
                        }
                        if (screen.isNavigationBarHidden() == null) {
                            return false;
                        }
                    } else if (screen.isStatusBarAnimated() == null) {
                        return false;
                    }
                } else if (screen.isStatusBarHidden() == null) {
                    return false;
                }
            } else if (screen.getStatusBarStyle() == null) {
                return false;
            }
        } else if (screen.getScreenOrientation() == null) {
            return false;
        }
        return true;
    }

    public static Screen i(Screen screen, q qVar) {
        ScreenFragmentWrapper fragmentWrapper;
        if (screen == null || (fragmentWrapper = screen.getFragmentWrapper()) == null) {
            return null;
        }
        Iterator it = fragmentWrapper.l().iterator();
        while (it.hasNext()) {
            Screen topScreen = ((ScreenContainer) it.next()).getTopScreen();
            Screen screenI = i(topScreen, qVar);
            if (screenI != null) {
                return screenI;
            }
            if (topScreen != null && h(topScreen, qVar)) {
                return topScreen;
            }
        }
        return null;
    }

    public static int j(int i7, int i10) {
        return b1.c.e(i7, (Color.alpha(i7) * i10) / 255);
    }

    public static void k(Object obj, String str, String str2) {
        String strF = F(str);
        if (Log.isLoggable(strF, 3)) {
            Log.d(strF, String.format(str2, obj));
        }
    }

    public static boolean l(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int iIndexOfKey;
        WeakHashMap weakHashMap = u0.f1729a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = t0.f1724d;
        t0 t0Var = (t0) view.getTag(R.id.tag_unhandled_key_event_manager);
        WeakReference weakReference = null;
        if (t0Var == null) {
            t0Var = new t0();
            t0Var.f1725a = null;
            t0Var.f1726b = null;
            t0Var.f1727c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, t0Var);
        }
        WeakReference weakReference2 = t0Var.f1727c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        t0Var.f1727c = new WeakReference(keyEvent);
        if (t0Var.f1726b == null) {
            t0Var.f1726b = new SparseArray();
        }
        SparseArray sparseArray = t0Var.f1726b;
        if (keyEvent.getAction() == 1 && (iIndexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference = (WeakReference) sparseArray.valueAt(iIndexOfKey);
            sparseArray.removeAt(iIndexOfKey);
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view2 = (View) weakReference.get();
        if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
            return true;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }

    public static boolean m(j jVar, View view, Window.Callback callback, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListener;
        boolean zBooleanValue = false;
        if (jVar != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                return jVar.superDispatchKeyEvent(keyEvent);
            }
            if (callback instanceof Activity) {
                Activity activity = (Activity) callback;
                activity.onUserInteraction();
                Window window = activity.getWindow();
                if (window.hasFeature(8)) {
                    ActionBar actionBar = activity.getActionBar();
                    if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                        if (!f12574b) {
                            try {
                                f12575c = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                            } catch (NoSuchMethodException unused) {
                            }
                            f12574b = true;
                        }
                        Method method = f12575c;
                        if (method != null) {
                            try {
                                Object objInvoke = method.invoke(actionBar, keyEvent);
                                if (objInvoke != null) {
                                    zBooleanValue = ((Boolean) objInvoke).booleanValue();
                                }
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                            }
                        }
                        if (zBooleanValue) {
                            return true;
                        }
                    }
                }
                if (window.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView = window.getDecorView();
                if (u0.d(decorView, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
            }
            if (callback instanceof Dialog) {
                Dialog dialog = (Dialog) callback;
                if (!f12576d) {
                    try {
                        Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                        f12577e = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException unused3) {
                    }
                    f12576d = true;
                }
                Field field = f12577e;
                if (field != null) {
                    try {
                        onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
                    } catch (IllegalAccessException unused4) {
                        onKeyListener = null;
                    }
                } else {
                    onKeyListener = null;
                }
                if (onKeyListener != null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
                    return true;
                }
                Window window2 = dialog.getWindow();
                if (window2.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView2 = window2.getDecorView();
                if (u0.d(decorView2, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(dialog, decorView2 != null ? decorView2.getKeyDispatcherState() : null, dialog);
            }
            if ((view != null && u0.d(view, keyEvent)) || jVar.superDispatchKeyEvent(keyEvent)) {
                return true;
            }
        }
        return false;
    }

    public static boolean n(vo.b superDescriptor, vo.b subDescriptor) {
        Intrinsics.checkNotNullParameter(superDescriptor, "superDescriptor");
        Intrinsics.checkNotNullParameter(subDescriptor, "subDescriptor");
        if (!(subDescriptor instanceof gp.e) || !(superDescriptor instanceof u)) {
            return false;
        }
        gp.e eVar = (gp.e) subDescriptor;
        eVar.L().size();
        u uVar = (u) superDescriptor;
        uVar.L().size();
        List listL = eVar.a().L();
        Intrinsics.checkNotNullExpressionValue(listL, "getValueParameters(...)");
        List listL2 = uVar.a().L();
        Intrinsics.checkNotNullExpressionValue(listL2, "getValueParameters(...)");
        for (Pair pair : CollectionsKt.n0(listL, listL2)) {
            q0 q0Var = (q0) pair.f14612d;
            q0 q0Var2 = (q0) pair.f14613e;
            Intrinsics.checkNotNull(q0Var);
            boolean z5 = O((u) subDescriptor, q0Var) instanceof np.j;
            Intrinsics.checkNotNull(q0Var2);
            if (z5 != (O(uVar, q0Var2) instanceof np.j)) {
                return true;
            }
        }
        return false;
    }

    public static BigDecimal o(Double d6) {
        return BigDecimal.valueOf(d6.doubleValue()).setScale(6, RoundingMode.DOWN);
    }

    public static void p(String str, String str2, Exception exc) {
        String strF = F(str);
        if (Log.isLoggable(strF, 6)) {
            Log.e(strF, str2, exc);
        }
    }

    public static byte[] q(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = io.sentry.vendor.a.f13253c;
        int i7 = (length / 3) * 4;
        int i10 = length % 3;
        if (i10 == 1) {
            i7 += 2;
        } else if (i10 == 2) {
            i7 += 3;
        }
        byte[] bArr3 = new byte[i7];
        int i11 = 0;
        int i12 = 0;
        int i13 = -1;
        while (true) {
            int i14 = i11 + 3;
            if (i14 > length) {
                break;
            }
            int i15 = (bArr[i11 + 2] & 255) | ((bArr[i11] & 255) << 16) | ((bArr[i11 + 1] & 255) << 8);
            bArr3[i12] = bArr2[(i15 >> 18) & 63];
            bArr3[i12 + 1] = bArr2[(i15 >> 12) & 63];
            bArr3[i12 + 2] = bArr2[(i15 >> 6) & 63];
            bArr3[i12 + 3] = bArr2[i15 & 63];
            int i16 = i12 + 4;
            i13--;
            if (i13 == 0) {
                i12 += 5;
                bArr3[i16] = 10;
                i13 = 19;
            } else {
                i12 = i16;
            }
            i11 = i14;
        }
        if (i11 == length - 1) {
            int i17 = (bArr[i11] & 255) << 4;
            bArr3[i12] = bArr2[(i17 >> 6) & 63];
            bArr3[i12 + 1] = bArr2[i17 & 63];
            return bArr3;
        }
        if (i11 == length - 2) {
            int i18 = ((bArr[i11 + 1] & 255) << 2) | ((bArr[i11] & 255) << 10);
            bArr3[i12] = bArr2[(i18 >> 12) & 63];
            bArr3[i12 + 1] = bArr2[(i18 >> 6) & 63];
            bArr3[i12 + 2] = bArr2[i18 & 63];
        }
        return bArr3;
    }

    public static String r(byte[] bArr) {
        try {
            return new String(q(bArr), "US-ASCII");
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }

    public static String s(g gVar) {
        StringBuilder sb2 = new StringBuilder(gVar.size());
        for (int i7 = 0; i7 < gVar.size(); i7++) {
            byte bA = gVar.a(i7);
            if (bA == 34) {
                sb2.append("\\\"");
            } else if (bA == 39) {
                sb2.append("\\'");
            } else if (bA != 92) {
                switch (bA) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (bA < 32 || bA > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((bA >>> 6) & 3) + 48));
                            sb2.append((char) (((bA >>> 3) & 7) + 48));
                            sb2.append((char) ((bA & 7) + 48));
                        } else {
                            sb2.append((char) bA);
                        }
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    public static Screen t(Screen screen, q qVar) {
        Screen screenI = i(screen, qVar);
        if (screenI != null) {
            return screenI;
        }
        if (h(screen, qVar)) {
            return screen;
        }
        for (ViewParent container = screen.getContainer(); container != null; container = container.getParent()) {
            if (container instanceof Screen) {
                Screen screen2 = (Screen) container;
                if (h(screen2, qVar)) {
                    return screen2;
                }
            }
        }
        return null;
    }

    public static final String u(long j5) {
        String strN;
        if (j5 <= -999500000) {
            strN = a3.e.n(new StringBuilder(), (j5 - ((long) 500000000)) / ((long) 1000000000), " s ");
        } else if (j5 <= -999500) {
            strN = a3.e.n(new StringBuilder(), (j5 - ((long) 500000)) / ((long) 1000000), " ms");
        } else if (j5 <= 0) {
            strN = a3.e.n(new StringBuilder(), (j5 - ((long) 500)) / ((long) 1000), " µs");
        } else if (j5 < 999500) {
            strN = a3.e.n(new StringBuilder(), (j5 + ((long) 500)) / ((long) 1000), " µs");
        } else {
            strN = j5 < 999500000 ? a3.e.n(new StringBuilder(), (j5 + ((long) 500000)) / ((long) 1000000), " ms") : a3.e.n(new StringBuilder(), (j5 + ((long) 500000000)) / ((long) 1000000000), " s ");
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%6s", Arrays.copyOf(new Object[]{strN}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        return str;
    }

    public static final KClass v(SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        if (serialDescriptor instanceof mr.b) {
            return ((mr.b) serialDescriptor).f16053b;
        }
        if (serialDescriptor instanceof n1) {
            return v(((n1) serialDescriptor).f17580a);
        }
        return null;
    }

    public static int w(int i7, View view) {
        Context context = view.getContext();
        TypedValue typedValueX = com.facebook.imagepipeline.nativecode.b.x(view.getContext(), view.getClass().getCanonicalName(), i7);
        int i10 = typedValueX.resourceId;
        return i10 != 0 ? context.getColor(i10) : typedValueX.data;
    }

    public static int x(Context context, int i7, int i10) {
        Integer numValueOf;
        TypedValue typedValueT = com.facebook.imagepipeline.nativecode.b.t(context, i7);
        if (typedValueT != null) {
            int i11 = typedValueT.resourceId;
            numValueOf = Integer.valueOf(i11 != 0 ? context.getColor(i11) : typedValueT.data);
        } else {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : i10;
    }

    public static Date y() {
        return Calendar.getInstance(io.sentry.vendor.gson.internal.bind.util.a.f13254a).getTime();
    }

    public static Date z(long j5) {
        Calendar calendar = Calendar.getInstance(io.sentry.vendor.gson.internal.bind.util.a.f13254a);
        calendar.setTimeInMillis(j5);
        return calendar.getTime();
    }

    public abstract InputFilter[] C(InputFilter[] inputFilterArr);

    public abstract int E(View view, ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract int I();

    public abstract ViewPropertyAnimator J(int i7, View view);

    public abstract boolean L();

    public abstract void U(boolean z5);

    public abstract void V(boolean z5);

    public abstract TransformationMethod b0(TransformationMethod transformationMethod);

    public abstract String c();

    public String toString() {
        switch (this.f12582a) {
            case 17:
                return c();
            default:
                return super.toString();
        }
    }
}
