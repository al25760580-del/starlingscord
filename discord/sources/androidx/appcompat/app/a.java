package androidx.appcompat.app;

import a1.b;
import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.appcompat.widget.c4;
import androidx.appcompat.widget.d0;
import androidx.appcompat.widget.f0;
import androidx.appcompat.widget.f4;
import androidx.appcompat.widget.g1;
import androidx.appcompat.widget.i1;
import androidx.appcompat.widget.n;
import androidx.appcompat.widget.n2;
import androidx.appcompat.widget.r0;
import androidx.appcompat.widget.w;
import androidx.appcompat.widget.x3;
import androidx.appcompat.widget.y;
import androidx.collection.SimpleArrayMap;
import androidx.core.os.LocaleListCompat;
import androidx.core.view.c1;
import androidx.core.view.g0;
import androidx.core.view.l0;
import androidx.core.view.u0;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.imageutils.JfifUtil;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import f1.d;
import fj.c;
import ga.l;
import i.a0;
import i.b0;
import i.e0;
import i.i;
import i.j0;
import i.m;
import i.o;
import i.p;
import i.q;
import i.s;
import i.t;
import i.u;
import i.v;
import i.x;
import i.z;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import m.e;
import n.f;
import n.h;
import n.j;
import org.webrtc.MediaStreamTrack;
import s.k;

/* JADX INFO: loaded from: classes.dex */
public final class a extends AppCompatDelegate implements h, LayoutInflater.Factory2 {
    public static final SimpleArrayMap E0 = new SimpleArrayMap(0);
    public static final int[] F0 = {R.attr.windowBackground};
    public static final boolean G0 = !"robolectric".equals(Build.FINGERPRINT);
    public Rect A0;
    public b0 B0;
    public OnBackInvokedDispatcher C0;
    public OnBackInvokedCallback D0;
    public final Object G;
    public final Context H;
    public Window I;
    public u J;
    public final Object K;
    public ActionBar L;
    public e M;
    public CharSequence N;
    public i1 O;
    public c P;
    public l Q;
    public ActionMode R;
    public ActionBarContextView S;
    public PopupWindow T;
    public o U;
    public boolean W;
    public ViewGroup X;
    public TextView Y;
    public View Z;
    public boolean a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f739b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public boolean f740c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public boolean f741d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f742e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public boolean f743f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public boolean f744g0;
    public boolean h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public x[] f745i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public x f746j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public boolean f747k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public boolean f748l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public boolean f749m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public boolean f750n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public Configuration f751o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final int f752p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f753q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f754r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f755s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public v f756t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public v f757u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public boolean f758v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f759w0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public boolean f761y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public Rect f762z0;
    public c1 V = null;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final a3.h f760x0 = new a3.h(19, this);

    public a(Context context, Window window, i iVar, Object obj) {
        i.h hVar = null;
        this.f752p0 = -100;
        this.H = context;
        this.K = iVar;
        this.G = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (!(context instanceof i.h)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    hVar = (i.h) context;
                    break;
                }
            }
            if (hVar != null) {
                this.f752p0 = hVar.getDelegate().g();
            }
        }
        if (this.f752p0 == -100) {
            String name = this.G.getClass().getName();
            SimpleArrayMap simpleArrayMap = E0;
            Integer num = (Integer) simpleArrayMap.get(name);
            if (num != null) {
                this.f752p0 = num.intValue();
                simpleArrayMap.remove(this.G.getClass().getName());
            }
        }
        if (window != null) {
            F(window);
        }
        w.d();
    }

    public static LocaleListCompat G(Context context) {
        LocaleListCompat localeListCompat;
        LocaleListCompat localeListCompat2;
        if (Build.VERSION.SDK_INT >= 33 || (localeListCompat = AppCompatDelegate.f734i) == null) {
            return null;
        }
        d dVar = localeListCompat.f1570a;
        LocaleListCompat localeListCompatB = s.b(context.getApplicationContext().getResources().getConfiguration());
        if (dVar.f8789a.isEmpty()) {
            localeListCompat2 = LocaleListCompat.f1569b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i7 = 0;
            while (i7 < localeListCompatB.f1570a.f8789a.size() + dVar.f8789a.size()) {
                Locale locale = i7 < dVar.f8789a.size() ? dVar.f8789a.get(i7) : localeListCompatB.f1570a.f8789a.get(i7 - dVar.f8789a.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i7++;
            }
            localeListCompat2 = new LocaleListCompat(new d(new LocaleList((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        return localeListCompat2.f1570a.f8789a.isEmpty() ? localeListCompatB : localeListCompat2;
    }

    public static Configuration K(Context context, int i7, LocaleListCompat localeListCompat, Configuration configuration, boolean z5) {
        int i10;
        if (i7 == 1) {
            i10 = 16;
        } else if (i7 != 2) {
            i10 = z5 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        } else {
            i10 = 32;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i10 | (configuration2.uiMode & (-49));
        if (localeListCompat != null) {
            s.d(configuration2, localeListCompat);
        }
        return configuration2;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void A(Toolbar toolbar) {
        Object obj = this.G;
        if (obj instanceof Activity) {
            S();
            ActionBar actionBar = this.L;
            if (actionBar instanceof j0) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.M = null;
            if (actionBar != null) {
                actionBar.h();
            }
            this.L = null;
            if (toolbar != null) {
                e0 e0Var = new e0(toolbar, obj instanceof Activity ? ((Activity) obj).getTitle() : this.N, this.J);
                this.L = e0Var;
                this.J.f11257e = e0Var.f11202c;
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                this.J.f11257e = null;
            }
            k();
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void B(int i7) {
        this.f753q0 = i7;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void C(CharSequence charSequence) {
        this.N = charSequence;
        i1 i1Var = this.O;
        if (i1Var != null) {
            i1Var.setWindowTitle(charSequence);
            return;
        }
        ActionBar actionBar = this.L;
        if (actionBar != null) {
            actionBar.r(charSequence);
            return;
        }
        TextView textView = this.Y;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [i.i, java.lang.Object] */
    @Override // androidx.appcompat.app.AppCompatDelegate
    public final ActionMode D(ActionMode.Callback callback) {
        ActionMode actionModeOnWindowStartingSupportActionMode;
        ViewGroup viewGroup;
        if (callback == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        ActionMode actionMode = this.R;
        if (actionMode != null) {
            actionMode.a();
        }
        q qVar = new q(this, callback);
        S();
        ActionBar actionBar = this.L;
        ?? r5 = this.K;
        if (actionBar != null) {
            ActionMode actionModeS = actionBar.s(qVar);
            this.R = actionModeS;
            if (actionModeS != null) {
                r5.onSupportActionModeStarted(actionModeS);
            }
        }
        if (this.R == null) {
            c1 c1Var = this.V;
            if (c1Var != null) {
                c1Var.b();
            }
            ActionMode actionMode2 = this.R;
            if (actionMode2 != null) {
                actionMode2.a();
            }
            if (this.f750n0) {
                actionModeOnWindowStartingSupportActionMode = null;
            } else {
                try {
                    actionModeOnWindowStartingSupportActionMode = r5.onWindowStartingSupportActionMode(qVar);
                } catch (AbstractMethodError unused) {
                    actionModeOnWindowStartingSupportActionMode = null;
                }
            }
            if (actionModeOnWindowStartingSupportActionMode != null) {
                this.R = actionModeOnWindowStartingSupportActionMode;
            } else {
                if (this.S == null) {
                    boolean z5 = this.f743f0;
                    Context context = this.H;
                    if (z5) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme = context.getTheme();
                        theme.resolveAttribute(com.discord.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            Resources.Theme themeNewTheme = context.getResources().newTheme();
                            themeNewTheme.setTo(theme);
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, 0);
                            contextThemeWrapper.getTheme().setTo(themeNewTheme);
                            context = contextThemeWrapper;
                        }
                        this.S = new ActionBarContextView(context, null);
                        PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, com.discord.R.attr.actionModePopupWindowStyle);
                        this.T = popupWindow;
                        popupWindow.setWindowLayoutType(2);
                        this.T.setContentView(this.S);
                        this.T.setWidth(-1);
                        context.getTheme().resolveAttribute(com.discord.R.attr.actionBarSize, typedValue, true);
                        this.S.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                        this.T.setHeight(-2);
                        this.U = new o(this);
                    } else {
                        ViewStubCompat viewStubCompat = (ViewStubCompat) this.X.findViewById(com.discord.R.id.action_mode_bar_stub);
                        if (viewStubCompat != null) {
                            S();
                            ActionBar actionBar2 = this.L;
                            Context contextE = actionBar2 != null ? actionBar2.e() : null;
                            if (contextE != null) {
                                context = contextE;
                            }
                            viewStubCompat.setLayoutInflater(LayoutInflater.from(context));
                            this.S = (ActionBarContextView) viewStubCompat.a();
                        }
                    }
                }
                if (this.S != null) {
                    c1 c1Var2 = this.V;
                    if (c1Var2 != null) {
                        c1Var2.b();
                    }
                    this.S.e();
                    Context context2 = this.S.getContext();
                    ActionBarContextView actionBarContextView = this.S;
                    androidx.appcompat.view.a aVar = new androidx.appcompat.view.a();
                    aVar.f771i = context2;
                    aVar.f772v = actionBarContextView;
                    aVar.f773w = qVar;
                    j jVar = new j(actionBarContextView.getContext());
                    jVar.f16151l = 1;
                    aVar.E = jVar;
                    jVar.f16146e = aVar;
                    if (qVar.f11255a.b(aVar, jVar)) {
                        aVar.g();
                        this.S.c(aVar);
                        this.R = aVar;
                        if (this.W && (viewGroup = this.X) != null && viewGroup.isLaidOut()) {
                            this.S.setAlpha(0.0f);
                            c1 c1VarB = u0.b(this.S);
                            c1VarB.a(1.0f);
                            this.V = c1VarB;
                            c1VarB.d(new p(this));
                        } else {
                            this.S.setAlpha(1.0f);
                            this.S.setVisibility(0);
                            if (this.S.getParent() instanceof View) {
                                View view = (View) this.S.getParent();
                                WeakHashMap weakHashMap = u0.f1729a;
                                androidx.core.view.j0.c(view);
                            }
                        }
                        if (this.T != null) {
                            this.I.getDecorView().post(this.U);
                        }
                    } else {
                        this.R = null;
                    }
                }
            }
            ActionMode actionMode3 = this.R;
            if (actionMode3 != null) {
                r5.onSupportActionModeStarted(actionMode3);
            }
            a0();
            this.R = this.R;
        }
        a0();
        return this.R;
    }

    /* JADX WARN: Code duplicated, block: B:70:0x00fa  */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean E(boolean z5, boolean z6) throws IllegalAccessException {
        int i7;
        boolean z7;
        boolean z10;
        boolean z11;
        Object obj;
        Object obj2;
        if (this.f750n0) {
            return false;
        }
        int i10 = this.f752p0;
        if (i10 == -100) {
            i10 = AppCompatDelegate.f733e;
        }
        Context context = this.H;
        int iU = U(context, i10);
        int i11 = Build.VERSION.SDK_INT;
        LongSparseArray longSparseArray = null;
        LocaleListCompat localeListCompatG = i11 < 33 ? G(context) : null;
        if (!z6 && localeListCompatG != null) {
            localeListCompatG = s.b(context.getResources().getConfiguration());
        }
        Configuration configurationK = K(context, iU, localeListCompatG, null, false);
        boolean z12 = this.f755s0;
        Object obj3 = this.G;
        if (z12 || !(obj3 instanceof Activity)) {
            this.f755s0 = true;
            i7 = this.f754r0;
        } else {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i7 = 0;
            } else {
                try {
                    ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj3.getClass()), i11 >= 29 ? 269221888 : 786432);
                    if (activityInfo != null) {
                        this.f754r0 = activityInfo.configChanges;
                    }
                } catch (PackageManager.NameNotFoundException e10) {
                    Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e10);
                    this.f754r0 = 0;
                }
                this.f755s0 = true;
                i7 = this.f754r0;
            }
        }
        Configuration configuration = this.f751o0;
        if (configuration == null) {
            configuration = context.getResources().getConfiguration();
        }
        int i12 = configuration.uiMode & 48;
        int i13 = configurationK.uiMode & 48;
        LocaleListCompat localeListCompatB = s.b(configuration);
        LocaleListCompat localeListCompatB2 = localeListCompatG == null ? null : s.b(configurationK);
        int i14 = i12 != i13 ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING : 0;
        if (localeListCompatB2 != null && !localeListCompatB.equals(localeListCompatB2)) {
            i14 |= 8196;
        }
        if (((~i7) & i14) != 0 && z5 && this.f748l0 && ((G0 || this.f749m0) && (obj3 instanceof Activity))) {
            Activity activity = (Activity) obj3;
            if (activity.isChild()) {
                z7 = false;
            } else {
                int i15 = Build.VERSION.SDK_INT;
                if (i15 >= 31 && (i14 & 8192) != 0) {
                    activity.getWindow().getDecorView().setLayoutDirection(configurationK.getLayoutDirection());
                }
                if (i15 >= 28) {
                    activity.recreate();
                } else {
                    new Handler(activity.getMainLooper()).post(new com.discord.share.a(activity, 2));
                }
                z7 = true;
            }
        } else {
            z7 = false;
        }
        if (z7 || i14 == 0) {
            z10 = z7;
        } else {
            boolean z13 = (i7 & i14) == i14;
            Resources resources = context.getResources();
            Configuration configuration2 = new Configuration(resources.getConfiguration());
            configuration2.uiMode = (resources.getConfiguration().uiMode & (-49)) | i13;
            if (localeListCompatB2 != null) {
                s.d(configuration2, localeListCompatB2);
            }
            resources.updateConfiguration(configuration2, null);
            int i16 = Build.VERSION.SDK_INT;
            if (i16 < 26 && i16 < 28) {
                if (!yk.a.f23388i) {
                    try {
                        Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                        yk.a.f23387h = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException e11) {
                        Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e11);
                    }
                    yk.a.f23388i = true;
                }
                Field field = yk.a.f23387h;
                if (field != null) {
                    try {
                        obj = field.get(resources);
                    } catch (IllegalAccessException e12) {
                        Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e12);
                        obj = null;
                    }
                    if (obj != null) {
                        if (!yk.a.f23382c) {
                            try {
                                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                                yk.a.f23381b = declaredField2;
                                declaredField2.setAccessible(true);
                            } catch (NoSuchFieldException e13) {
                                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e13);
                            }
                            yk.a.f23382c = true;
                        }
                        Field field2 = yk.a.f23381b;
                        if (field2 != null) {
                            try {
                                obj2 = field2.get(obj);
                            } catch (IllegalAccessException e14) {
                                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e14);
                                obj2 = null;
                            }
                        } else {
                            obj2 = null;
                        }
                        if (obj2 != null) {
                            if (!yk.a.f23384e) {
                                try {
                                    yk.a.f23383d = Class.forName("android.content.res.ThemedResourceCache");
                                } catch (ClassNotFoundException e15) {
                                    Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e15);
                                }
                                yk.a.f23384e = true;
                            }
                            Class cls = yk.a.f23383d;
                            if (cls != null) {
                                if (!yk.a.f23386g) {
                                    try {
                                        Field declaredField3 = cls.getDeclaredField("mUnthemedEntries");
                                        yk.a.f23385f = declaredField3;
                                        declaredField3.setAccessible(true);
                                    } catch (NoSuchFieldException e16) {
                                        Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e16);
                                    }
                                    yk.a.f23386g = true;
                                }
                                Field field3 = yk.a.f23385f;
                                if (field3 != null) {
                                    try {
                                        longSparseArray = (LongSparseArray) field3.get(obj2);
                                    } catch (IllegalAccessException e17) {
                                        Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e17);
                                    }
                                    if (longSparseArray != null) {
                                        longSparseArray.clear();
                                    }
                                }
                            }
                        }
                    }
                }
            }
            int i17 = this.f753q0;
            if (i17 != 0) {
                context.setTheme(i17);
                z11 = true;
                context.getTheme().applyStyle(this.f753q0, true);
            } else {
                z11 = true;
            }
            if (z13 && (obj3 instanceof Activity)) {
                Activity activity2 = (Activity) obj3;
                if (activity2 instanceof LifecycleOwner) {
                    if (((LifecycleOwner) activity2).getLifecycle().b().a(Lifecycle.State.f2297i)) {
                        activity2.onConfigurationChanged(configuration2);
                    }
                } else if (this.f749m0 && !this.f750n0) {
                    activity2.onConfigurationChanged(configuration2);
                }
            }
            z10 = z11;
        }
        if (z10 && (obj3 instanceof i.h)) {
            if ((i14 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0) {
                ((i.h) obj3).onNightModeChanged(iU);
            }
            if ((i14 & 4) != 0) {
                ((i.h) obj3).onLocalesChanged(localeListCompatG);
            }
        }
        if (localeListCompatB2 != null) {
            s.c(s.b(context.getResources().getConfiguration()));
        }
        if (i10 == 0) {
            P(context).n();
        } else {
            v vVar = this.f756t0;
            if (vVar != null) {
                vVar.d();
            }
        }
        if (i10 == 3) {
            if (this.f757u0 == null) {
                this.f757u0 = new v(this, context);
            }
            this.f757u0.n();
        } else {
            v vVar2 = this.f757u0;
            if (vVar2 != null) {
                vVar2.d();
            }
        }
        return z10;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0074  */
    public final void F(Window window) {
        Drawable drawableD;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.I != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof u) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        u uVar = new u(this, callback);
        this.J = uVar;
        window.setCallback(uVar);
        Context context = this.H;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, F0);
        if (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawableD = null;
        } else {
            w wVarA = w.a();
            synchronized (wVarA) {
                drawableD = wVarA.f1148a.d(context, resourceId, true);
            }
        }
        if (drawableD != null) {
            window.setBackgroundDrawable(drawableD);
        }
        typedArrayObtainStyledAttributes.recycle();
        this.I = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.C0) != null) {
            return;
        }
        Object obj = this.G;
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.D0) != null) {
            t.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.D0 = null;
        }
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.C0 = t.a(activity);
            } else {
                this.C0 = null;
            }
        } else {
            this.C0 = null;
        }
        a0();
    }

    public final void H(int i7, x xVar, j jVar) {
        if (jVar == null) {
            if (xVar == null && i7 >= 0) {
                x[] xVarArr = this.f745i0;
                if (i7 < xVarArr.length) {
                    xVar = xVarArr[i7];
                }
            }
            if (xVar != null) {
                jVar = xVar.f11272h;
            }
        }
        if ((xVar == null || xVar.f11275m) && !this.f750n0) {
            u uVar = this.J;
            Window.Callback callback = this.I.getCallback();
            uVar.getClass();
            try {
                uVar.f11260w = true;
                callback.onPanelClosed(i7, jVar);
            } finally {
                uVar.f11260w = false;
            }
        }
    }

    public final void I(j jVar) {
        n nVar;
        if (this.h0) {
            return;
        }
        this.h0 = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.O;
        actionBarOverlayLayout.e();
        ActionMenuView actionMenuView = ((x3) actionBarOverlayLayout.f818w).f1164a.f865d;
        if (actionMenuView != null && (nVar = actionMenuView.Q) != null) {
            nVar.l();
            androidx.appcompat.widget.h hVar = nVar.R;
            if (hVar != null && hVar.b()) {
                hVar.f16210i.dismiss();
            }
        }
        Window.Callback callback = this.I.getCallback();
        if (callback != null && !this.f750n0) {
            callback.onPanelClosed(108, jVar);
        }
        this.h0 = false;
    }

    public final void J(x xVar, boolean z5) {
        i.w wVar;
        i1 i1Var;
        if (z5 && xVar.f11265a == 0 && (i1Var = this.O) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) i1Var;
            actionBarOverlayLayout.e();
            if (((x3) actionBarOverlayLayout.f818w).f1164a.o()) {
                I(xVar.f11272h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.H.getSystemService("window");
        if (windowManager != null && xVar.f11275m && (wVar = xVar.f11269e) != null) {
            windowManager.removeView(wVar);
            if (z5) {
                H(xVar.f11265a, xVar, null);
            }
        }
        xVar.k = false;
        xVar.f11274l = false;
        xVar.f11275m = false;
        xVar.f11270f = null;
        xVar.f11276n = true;
        if (this.f746j0 == xVar) {
            this.f746j0 = null;
        }
        if (xVar.f11265a == 0) {
            a0();
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003f  */
    /* JADX WARN: Code duplicated, block: B:23:0x004a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x006b  */
    /* JADX WARN: Code duplicated, block: B:38:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:46:0x0085  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:85:0x011b  */
    /* JADX WARN: Code duplicated, block: B:87:0x0129  */
    /* JADX WARN: Code duplicated, block: B:89:0x012d  */
    /* JADX WARN: Code duplicated, block: B:91:0x0135  */
    /* JADX WARN: Code duplicated, block: B:94:0x013c A[RETURN] */
    public final boolean L(KeyEvent keyEvent) {
        View decorView;
        int keyCode;
        x xVarQ;
        i1 i1Var;
        Context context;
        boolean z5;
        boolean zU;
        boolean zY;
        AudioManager audioManager;
        Toolbar toolbar;
        ActionMenuView actionMenuView;
        n nVar;
        x xVarQ2;
        Object obj = this.G;
        if ((!(obj instanceof androidx.core.view.j) && !(obj instanceof z)) || (decorView = this.I.getDecorView()) == null || !io.sentry.config.a.l(decorView, keyEvent)) {
            if (keyEvent.getKeyCode() == 82) {
                u uVar = this.J;
                Window.Callback callback = this.I.getCallback();
                uVar.getClass();
                try {
                    uVar.f11259v = true;
                    boolean zDispatchKeyEvent = callback.dispatchKeyEvent(keyEvent);
                    uVar.f11259v = false;
                    if (!zDispatchKeyEvent) {
                        keyCode = keyEvent.getKeyCode();
                        if (keyEvent.getAction() == 0) {
                            if (keyCode != 4) {
                                this.f747k0 = (keyEvent.getFlags() & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0;
                                return false;
                            }
                            if (keyCode == 82) {
                                if (keyEvent.getRepeatCount() == 0) {
                                    xVarQ2 = Q(0);
                                    if (!xVarQ2.f11275m) {
                                        Y(xVarQ2, keyEvent);
                                        return true;
                                    }
                                }
                            }
                            return false;
                        }
                        if (keyCode != 4) {
                            if (keyCode == 82) {
                                if (this.R == null) {
                                    xVarQ = Q(0);
                                    i1Var = this.O;
                                    context = this.H;
                                    if (i1Var != null) {
                                        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) i1Var;
                                        actionBarOverlayLayout.e();
                                        toolbar = ((x3) actionBarOverlayLayout.f818w).f1164a;
                                        if (toolbar.getVisibility() == 0 || (actionMenuView = toolbar.f865d) == null || !actionMenuView.P || ViewConfiguration.get(context).hasPermanentMenuKey()) {
                                            z5 = xVarQ.f11275m;
                                            if (!z5 || xVarQ.f11274l) {
                                                J(xVarQ, true);
                                                zU = z5;
                                            } else {
                                                if (xVarQ.k) {
                                                    if (xVarQ.f11277o) {
                                                        xVarQ.k = false;
                                                        zY = Y(xVarQ, keyEvent);
                                                    } else {
                                                        zY = true;
                                                    }
                                                    if (zY) {
                                                        W(xVarQ, keyEvent);
                                                        zU = true;
                                                    }
                                                }
                                                zU = false;
                                            }
                                        } else {
                                            ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.O;
                                            actionBarOverlayLayout2.e();
                                            if (((x3) actionBarOverlayLayout2.f818w).f1164a.o()) {
                                                ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.O;
                                                actionBarOverlayLayout3.e();
                                                ActionMenuView actionMenuView2 = ((x3) actionBarOverlayLayout3.f818w).f1164a.f865d;
                                                if (actionMenuView2 != null && (nVar = actionMenuView2.Q) != null && nVar.l()) {
                                                    zU = true;
                                                }
                                            } else if (!this.f750n0 && Y(xVarQ, keyEvent)) {
                                                ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.O;
                                                actionBarOverlayLayout4.e();
                                                zU = ((x3) actionBarOverlayLayout4.f818w).f1164a.u();
                                            }
                                            zU = false;
                                        }
                                    } else {
                                        z5 = xVarQ.f11275m;
                                        if (z5) {
                                        }
                                        J(xVarQ, true);
                                        zU = z5;
                                    }
                                    if (zU) {
                                        audioManager = (AudioManager) context.getApplicationContext().getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                                        if (audioManager != null) {
                                            audioManager.playSoundEffect(0);
                                            return true;
                                        }
                                        Log.w("AppCompatDelegate", "Couldn't get audio manager");
                                        return true;
                                    }
                                }
                            }
                            return false;
                        }
                        if (V()) {
                            return false;
                        }
                    }
                } catch (Throwable th2) {
                    uVar.f11259v = false;
                    throw th2;
                }
            } else {
                keyCode = keyEvent.getKeyCode();
                if (keyEvent.getAction() == 0) {
                    if (keyCode != 4) {
                        this.f747k0 = (keyEvent.getFlags() & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0;
                        return false;
                    }
                    if (keyCode == 82) {
                        if (keyEvent.getRepeatCount() == 0) {
                            xVarQ2 = Q(0);
                            if (!xVarQ2.f11275m) {
                                Y(xVarQ2, keyEvent);
                                return true;
                            }
                        }
                    }
                    return false;
                }
                if (keyCode != 4) {
                    if (keyCode == 82) {
                        if (this.R == null) {
                            xVarQ = Q(0);
                            i1Var = this.O;
                            context = this.H;
                            if (i1Var != null) {
                                ActionBarOverlayLayout actionBarOverlayLayout5 = (ActionBarOverlayLayout) i1Var;
                                actionBarOverlayLayout5.e();
                                toolbar = ((x3) actionBarOverlayLayout5.f818w).f1164a;
                                if (toolbar.getVisibility() == 0) {
                                    z5 = xVarQ.f11275m;
                                    if (z5) {
                                    }
                                    J(xVarQ, true);
                                    zU = z5;
                                } else {
                                    z5 = xVarQ.f11275m;
                                    if (z5) {
                                    }
                                    J(xVarQ, true);
                                    zU = z5;
                                }
                            } else {
                                z5 = xVarQ.f11275m;
                                if (z5) {
                                }
                                J(xVarQ, true);
                                zU = z5;
                            }
                            if (zU) {
                                audioManager = (AudioManager) context.getApplicationContext().getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                                if (audioManager != null) {
                                    audioManager.playSoundEffect(0);
                                    return true;
                                }
                                Log.w("AppCompatDelegate", "Couldn't get audio manager");
                                return true;
                            }
                        }
                    }
                    return false;
                }
                if (V()) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void M(int i7) {
        x xVarQ = Q(i7);
        if (xVarQ.f11272h != null) {
            Bundle bundle = new Bundle();
            xVarQ.f11272h.t(bundle);
            if (bundle.size() > 0) {
                xVarQ.f11278p = bundle;
            }
            xVarQ.f11272h.w();
            xVarQ.f11272h.clear();
        }
        xVarQ.f11277o = true;
        xVarQ.f11276n = true;
        if ((i7 == 108 || i7 == 0) && this.O != null) {
            x xVarQ2 = Q(0);
            xVarQ2.k = false;
            Y(xVarQ2, null);
        }
    }

    public final void N() {
        ViewGroup viewGroup;
        if (this.W) {
            return;
        }
        Context context = this.H;
        int[] iArr = h.a.j;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(117)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        int i7 = 0;
        if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
            v(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
            v(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            v(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            v(10);
        }
        this.f743f0 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        O();
        this.I.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (this.f744g0) {
            viewGroup = this.f742e0 ? (ViewGroup) layoutInflaterFrom.inflate(com.discord.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(com.discord.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.f743f0) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(com.discord.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.f741d0 = false;
            this.f740c0 = false;
        } else if (this.f740c0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.discord.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new ContextThemeWrapper(context, typedValue.resourceId) : context).inflate(com.discord.R.layout.abc_screen_toolbar, (ViewGroup) null);
            i1 i1Var = (i1) viewGroup.findViewById(com.discord.R.id.decor_content_parent);
            this.O = i1Var;
            i1Var.setWindowCallback(this.I.getCallback());
            if (this.f741d0) {
                ((ActionBarOverlayLayout) this.O).d(109);
            }
            if (this.a0) {
                ((ActionBarOverlayLayout) this.O).d(2);
            }
            if (this.f739b0) {
                ((ActionBarOverlayLayout) this.O).d(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            StringBuilder sb2 = new StringBuilder("AppCompat does not support the current theme features: { windowActionBar: ");
            sb2.append(this.f740c0);
            sb2.append(", windowActionBarOverlay: ");
            sb2.append(this.f741d0);
            sb2.append(", android:windowIsFloating: ");
            sb2.append(this.f743f0);
            sb2.append(", windowActionModeOverlay: ");
            sb2.append(this.f742e0);
            sb2.append(", windowNoTitle: ");
            throw new IllegalArgumentException(com.discord.chat.presentation.list.a.m(sb2, this.f744g0, " }"));
        }
        m mVar = new m(i7, this);
        WeakHashMap weakHashMap = u0.f1729a;
        l0.m(viewGroup, mVar);
        if (this.O == null) {
            this.Y = (TextView) viewGroup.findViewById(com.discord.R.id.title);
        }
        boolean z5 = f4.f976a;
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException e10) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e10);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e11) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e11);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.discord.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.I.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.I.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new ue.i(this));
        this.X = viewGroup;
        Object obj = this.G;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.N;
        if (!TextUtils.isEmpty(title)) {
            i1 i1Var2 = this.O;
            if (i1Var2 != null) {
                i1Var2.setWindowTitle(title);
            } else {
                ActionBar actionBar = this.L;
                if (actionBar != null) {
                    actionBar.r(title);
                } else {
                    TextView textView = this.Y;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.X.findViewById(R.id.content);
        View decorView = this.I.getDecorView();
        contentFrameLayout2.f858y.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        typedArrayObtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
        typedArrayObtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes2.hasValue(122)) {
            typedArrayObtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(123)) {
            typedArrayObtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(120)) {
            typedArrayObtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(121)) {
            typedArrayObtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.W = true;
        x xVarQ = Q(0);
        if (this.f750n0 || xVarQ.f11272h != null) {
            return;
        }
        T(108);
    }

    public final void O() {
        if (this.I == null) {
            Object obj = this.G;
            if (obj instanceof Activity) {
                F(((Activity) obj).getWindow());
            }
        }
        if (this.I == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final fh.s P(Context context) {
        if (this.f756t0 == null) {
            if (e4.m.f7991w == null) {
                Context applicationContext = context.getApplicationContext();
                e4.m.f7991w = new e4.m(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f756t0 = new v(this, e4.m.f7991w);
        }
        return this.f756t0;
    }

    public final x Q(int i7) {
        x[] xVarArr = this.f745i0;
        if (xVarArr == null || xVarArr.length <= i7) {
            x[] xVarArr2 = new x[i7 + 1];
            if (xVarArr != null) {
                System.arraycopy(xVarArr, 0, xVarArr2, 0, xVarArr.length);
            }
            this.f745i0 = xVarArr2;
            xVarArr = xVarArr2;
        }
        x xVar = xVarArr[i7];
        if (xVar != null) {
            return xVar;
        }
        x xVar2 = new x();
        xVar2.f11265a = i7;
        xVar2.f11276n = false;
        xVarArr[i7] = xVar2;
        return xVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (r6.m() != false) goto L20;
     */
    @Override // n.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void R(n.j r6) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.a.R(n.j):void");
    }

    public final void S() {
        N();
        if (this.f740c0 && this.L == null) {
            Object obj = this.G;
            if (obj instanceof Activity) {
                this.L = new j0((Activity) obj, this.f741d0);
            } else if (obj instanceof Dialog) {
                this.L = new j0((Dialog) obj);
            }
            ActionBar actionBar = this.L;
            if (actionBar != null) {
                actionBar.l(this.f761y0);
            }
        }
    }

    public final void T(int i7) {
        this.f759w0 = (1 << i7) | this.f759w0;
        if (this.f758v0) {
            return;
        }
        View decorView = this.I.getDecorView();
        WeakHashMap weakHashMap = u0.f1729a;
        decorView.postOnAnimation(this.f760x0);
        this.f758v0 = true;
    }

    public final int U(Context context, int i7) {
        if (i7 != -100) {
            if (i7 != -1) {
                if (i7 != 0) {
                    if (i7 != 1 && i7 != 2) {
                        if (i7 != 3) {
                            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        }
                        if (this.f757u0 == null) {
                            this.f757u0 = new v(this, context);
                        }
                        return this.f757u0.f();
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return P(context).f();
                }
            }
            return i7;
        }
        return -1;
    }

    public final boolean V() {
        boolean z5 = this.f747k0;
        this.f747k0 = false;
        x xVarQ = Q(0);
        if (!xVarQ.f11275m) {
            ActionMode actionMode = this.R;
            if (actionMode != null) {
                actionMode.a();
                return true;
            }
            S();
            ActionBar actionBar = this.L;
            if (actionBar == null || !actionBar.b()) {
                return false;
            }
        } else if (!z5) {
            J(xVarQ, true);
            return true;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0178, code lost:
    
        if (r2.f16134x.getCount() > 0) goto L88;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void W(i.x r18, android.view.KeyEvent r19) {
        /*
            Method dump skipped, instruction units count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.a.W(i.x, android.view.KeyEvent):void");
    }

    public final boolean X(x xVar, int i7, KeyEvent keyEvent) {
        j jVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((xVar.k || Y(xVar, keyEvent)) && (jVar = xVar.f11272h) != null) {
            return jVar.performShortcut(i7, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:71:0x0101  */
    /* JADX WARN: Code duplicated, block: B:74:0x0106 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x0108  */
    /* JADX WARN: Code duplicated, block: B:82:0x011d  */
    public final boolean Y(x xVar, KeyEvent keyEvent) {
        j jVar;
        i1 i1Var;
        i1 i1Var2;
        Resources.Theme themeNewTheme;
        i1 i1Var3;
        i1 i1Var4;
        if (!this.f750n0) {
            boolean z5 = xVar.k;
            int i7 = xVar.f11265a;
            if (z5) {
                return true;
            }
            x xVar2 = this.f746j0;
            if (xVar2 != null && xVar2 != xVar) {
                J(xVar2, false);
            }
            Window.Callback callback = this.I.getCallback();
            if (callback != null) {
                xVar.f11271g = callback.onCreatePanelView(i7);
            }
            boolean z6 = i7 == 0 || i7 == 108;
            if (z6 && (i1Var4 = this.O) != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) i1Var4;
                actionBarOverlayLayout.e();
                ((x3) actionBarOverlayLayout.f818w).f1173l = true;
            }
            if (xVar.f11271g == null && (!z6 || !(this.L instanceof e0))) {
                j jVar2 = xVar.f11272h;
                if (jVar2 == null || xVar.f11277o) {
                    if (jVar2 == null) {
                        Context context = this.H;
                        if ((i7 == 0 || i7 == 108) && this.O != null) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme = context.getTheme();
                            theme.resolveAttribute(com.discord.R.attr.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                themeNewTheme = context.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                                themeNewTheme.resolveAttribute(com.discord.R.attr.actionBarWidgetTheme, typedValue, true);
                            } else {
                                theme.resolveAttribute(com.discord.R.attr.actionBarWidgetTheme, typedValue, true);
                                themeNewTheme = null;
                            }
                            if (typedValue.resourceId != 0) {
                                if (themeNewTheme == null) {
                                    themeNewTheme = context.getResources().newTheme();
                                    themeNewTheme.setTo(theme);
                                }
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                            }
                            if (themeNewTheme != null) {
                                ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, 0);
                                contextThemeWrapper.getTheme().setTo(themeNewTheme);
                                context = contextThemeWrapper;
                            }
                        }
                        j jVar3 = new j(context);
                        jVar3.f16146e = this;
                        j jVar4 = xVar.f11272h;
                        if (jVar3 != jVar4) {
                            if (jVar4 != null) {
                                jVar4.r(xVar.f11273i);
                            }
                            xVar.f11272h = jVar3;
                            f fVar = xVar.f11273i;
                            if (fVar != null) {
                                jVar3.b(fVar, jVar3.f16142a);
                            }
                        }
                        if (xVar.f11272h != null) {
                            if (z6 && (i1Var2 = this.O) != null) {
                                if (this.P == null) {
                                    this.P = new c(15, this);
                                }
                                ((ActionBarOverlayLayout) i1Var2).f(xVar.f11272h, this.P);
                            }
                            xVar.f11272h.w();
                            if (callback.onCreatePanelMenu(i7, xVar.f11272h)) {
                                xVar.f11277o = false;
                            } else {
                                jVar = xVar.f11272h;
                                if (jVar != null) {
                                    if (jVar != null) {
                                        jVar.r(xVar.f11273i);
                                    }
                                    xVar.f11272h = null;
                                }
                                if (z6 && (i1Var = this.O) != null) {
                                    ((ActionBarOverlayLayout) i1Var).f(null, this.P);
                                }
                            }
                        }
                    } else {
                        if (z6) {
                            if (this.P == null) {
                                this.P = new c(15, this);
                            }
                            ((ActionBarOverlayLayout) i1Var2).f(xVar.f11272h, this.P);
                        }
                        xVar.f11272h.w();
                        if (callback.onCreatePanelMenu(i7, xVar.f11272h)) {
                            jVar = xVar.f11272h;
                            if (jVar != null) {
                                if (jVar != null) {
                                    jVar.r(xVar.f11273i);
                                }
                                xVar.f11272h = null;
                            }
                            if (z6) {
                                ((ActionBarOverlayLayout) i1Var).f(null, this.P);
                            }
                        } else {
                            xVar.f11277o = false;
                        }
                    }
                }
                xVar.f11272h.w();
                Bundle bundle = xVar.f11278p;
                if (bundle != null) {
                    xVar.f11272h.s(bundle);
                    xVar.f11278p = null;
                }
                if (!callback.onPreparePanel(0, xVar.f11271g, xVar.f11272h)) {
                    if (z6 && (i1Var3 = this.O) != null) {
                        ((ActionBarOverlayLayout) i1Var3).f(null, this.P);
                    }
                    xVar.f11272h.v();
                    return false;
                }
                xVar.f11272h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
                xVar.f11272h.v();
            }
            xVar.k = true;
            xVar.f11274l = false;
            this.f746j0 = xVar;
            return true;
        }
        return false;
    }

    public final void Z() {
        if (this.W) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void a(View view, ViewGroup.LayoutParams layoutParams) {
        N();
        ((ViewGroup) this.X.findViewById(R.id.content)).addView(view, layoutParams);
        this.J.a(this.I.getCallback());
    }

    public final void a0() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z5 = false;
            if (this.C0 != null && (Q(0).f11275m || this.R != null)) {
                z5 = true;
            }
            if (z5 && this.D0 == null) {
                this.D0 = t.b(this.C0, this);
            } else {
                if (z5 || (onBackInvokedCallback = this.D0) == null) {
                    return;
                }
                t.c(this.C0, onBackInvokedCallback);
                this.D0 = null;
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final boolean b() {
        return E(true, true);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final Context c(Context context) {
        Configuration configuration;
        this.f748l0 = true;
        int i7 = this.f752p0;
        if (i7 == -100) {
            i7 = AppCompatDelegate.f733e;
        }
        int iU = U(context, i7);
        int i10 = 0;
        if (AppCompatDelegate.l(context) && AppCompatDelegate.l(context)) {
            if (Build.VERSION.SDK_INT < 33) {
                synchronized (AppCompatDelegate.F) {
                    try {
                        LocaleListCompat localeListCompat = AppCompatDelegate.f734i;
                        if (localeListCompat == null) {
                            if (AppCompatDelegate.f735v == null) {
                                AppCompatDelegate.f735v = LocaleListCompat.a(x0.f.f(context));
                            }
                            if (!AppCompatDelegate.f735v.f1570a.f8789a.isEmpty()) {
                                AppCompatDelegate.f734i = AppCompatDelegate.f735v;
                            }
                        } else if (!localeListCompat.equals(AppCompatDelegate.f735v)) {
                            LocaleListCompat localeListCompat2 = AppCompatDelegate.f734i;
                            AppCompatDelegate.f735v = localeListCompat2;
                            x0.f.e(context, localeListCompat2.f1570a.f8789a.toLanguageTags());
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } else if (!AppCompatDelegate.f737x) {
                AppCompatDelegate.f732d.execute(new i.j(context, i10));
            }
        }
        LocaleListCompat localeListCompatG = G(context);
        if (context instanceof android.view.ContextThemeWrapper) {
            try {
                ((android.view.ContextThemeWrapper) context).applyOverrideConfiguration(K(context, iU, localeListCompatG, null, false));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).a(K(context, iU, localeListCompatG, null, false));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!G0) {
            return context;
        }
        Configuration configuration2 = new Configuration();
        configuration2.uiMode = -1;
        configuration2.fontScale = 0.0f;
        Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
        Configuration configuration4 = context.getResources().getConfiguration();
        configuration3.uiMode = configuration4.uiMode;
        if (configuration3.equals(configuration4)) {
            configuration = null;
        } else {
            configuration = new Configuration();
            configuration.fontScale = 0.0f;
            if (configuration3.diff(configuration4) != 0) {
                float f2 = configuration3.fontScale;
                float f7 = configuration4.fontScale;
                if (f2 != f7) {
                    configuration.fontScale = f7;
                }
                int i11 = configuration3.mcc;
                int i12 = configuration4.mcc;
                if (i11 != i12) {
                    configuration.mcc = i12;
                }
                int i13 = configuration3.mnc;
                int i14 = configuration4.mnc;
                if (i13 != i14) {
                    configuration.mnc = i14;
                }
                int i15 = Build.VERSION.SDK_INT;
                s.a(configuration3, configuration4, configuration);
                int i16 = configuration3.touchscreen;
                int i17 = configuration4.touchscreen;
                if (i16 != i17) {
                    configuration.touchscreen = i17;
                }
                int i18 = configuration3.keyboard;
                int i19 = configuration4.keyboard;
                if (i18 != i19) {
                    configuration.keyboard = i19;
                }
                int i20 = configuration3.keyboardHidden;
                int i21 = configuration4.keyboardHidden;
                if (i20 != i21) {
                    configuration.keyboardHidden = i21;
                }
                int i22 = configuration3.navigation;
                int i23 = configuration4.navigation;
                if (i22 != i23) {
                    configuration.navigation = i23;
                }
                int i24 = configuration3.navigationHidden;
                int i25 = configuration4.navigationHidden;
                if (i24 != i25) {
                    configuration.navigationHidden = i25;
                }
                int i26 = configuration3.orientation;
                int i27 = configuration4.orientation;
                if (i26 != i27) {
                    configuration.orientation = i27;
                }
                int i28 = configuration3.screenLayout & 15;
                int i29 = configuration4.screenLayout & 15;
                if (i28 != i29) {
                    configuration.screenLayout |= i29;
                }
                int i30 = configuration3.screenLayout & JfifUtil.MARKER_SOFn;
                int i31 = configuration4.screenLayout & JfifUtil.MARKER_SOFn;
                if (i30 != i31) {
                    configuration.screenLayout |= i31;
                }
                int i32 = configuration3.screenLayout & 48;
                int i33 = configuration4.screenLayout & 48;
                if (i32 != i33) {
                    configuration.screenLayout |= i33;
                }
                int i34 = configuration3.screenLayout & 768;
                int i35 = configuration4.screenLayout & 768;
                if (i34 != i35) {
                    configuration.screenLayout |= i35;
                }
                if (i15 >= 26) {
                    hf.a.e(configuration3, configuration4, configuration);
                }
                int i36 = configuration3.uiMode & 15;
                int i37 = configuration4.uiMode & 15;
                if (i36 != i37) {
                    configuration.uiMode |= i37;
                }
                int i38 = configuration3.uiMode & 48;
                int i39 = configuration4.uiMode & 48;
                if (i38 != i39) {
                    configuration.uiMode |= i39;
                }
                int i40 = configuration3.screenWidthDp;
                int i41 = configuration4.screenWidthDp;
                if (i40 != i41) {
                    configuration.screenWidthDp = i41;
                }
                int i42 = configuration3.screenHeightDp;
                int i43 = configuration4.screenHeightDp;
                if (i42 != i43) {
                    configuration.screenHeightDp = i43;
                }
                int i44 = configuration3.smallestScreenWidthDp;
                int i45 = configuration4.smallestScreenWidthDp;
                if (i44 != i45) {
                    configuration.smallestScreenWidthDp = i45;
                }
                int i46 = configuration3.densityDpi;
                int i47 = configuration4.densityDpi;
                if (i46 != i47) {
                    configuration.densityDpi = i47;
                }
            }
        }
        Configuration configurationK = K(context, iU, localeListCompatG, configuration, true);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, com.discord.R.style.Theme_AppCompat_Empty);
        contextThemeWrapper.a(configurationK);
        try {
            if (context.getTheme() != null) {
                Resources.Theme theme = contextThemeWrapper.getTheme();
                if (Build.VERSION.SDK_INT >= 29) {
                    a1.m.a(theme);
                } else {
                    synchronized (b.f12e) {
                        if (!b.f14g) {
                            try {
                                Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                                b.f13f = declaredMethod;
                                declaredMethod.setAccessible(true);
                            } catch (NoSuchMethodException e10) {
                                Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e10);
                            }
                            b.f14g = true;
                        }
                        Method method = b.f13f;
                        if (method != null) {
                            try {
                                method.invoke(theme, null);
                            } catch (IllegalAccessException | InvocationTargetException e11) {
                                Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e11);
                                b.f13f = null;
                            }
                        }
                    }
                }
            }
        } catch (NullPointerException unused3) {
        }
        return contextThemeWrapper;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final View d(int i7) {
        N();
        return this.I.findViewById(i7);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final Context e() {
        return this.H;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final i8.c f() {
        return new i8.c(8);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final int g() {
        return this.f752p0;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final MenuInflater h() {
        if (this.M == null) {
            S();
            ActionBar actionBar = this.L;
            this.M = new e(actionBar != null ? actionBar.e() : this.H);
        }
        return this.M;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final ActionBar i() {
        S();
        return this.L;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void j() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.H);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof a) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void k() {
        if (this.L != null) {
            S();
            if (this.L.f()) {
                return;
            }
            T(0);
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void m(Configuration configuration) throws IllegalAccessException {
        if (this.f740c0 && this.W) {
            S();
            ActionBar actionBar = this.L;
            if (actionBar != null) {
                actionBar.g();
            }
        }
        w wVarA = w.a();
        Context context = this.H;
        synchronized (wVarA) {
            n2 n2Var = wVarA.f1148a;
            synchronized (n2Var) {
                k kVar = (k) n2Var.f1052b.get(context);
                if (kVar != null) {
                    kVar.a();
                }
            }
        }
        this.f751o0 = new Configuration(this.H.getResources().getConfiguration());
        E(false, false);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void n() throws IllegalAccessException {
        String strD;
        this.f748l0 = true;
        E(false, true);
        O();
        Object obj = this.G;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    strD = x0.f.d(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e10) {
                    throw new IllegalArgumentException(e10);
                }
            } catch (IllegalArgumentException unused) {
                strD = null;
            }
            if (strD != null) {
                ActionBar actionBar = this.L;
                if (actionBar == null) {
                    this.f761y0 = true;
                } else {
                    actionBar.l(true);
                }
            }
            synchronized (AppCompatDelegate.E) {
                AppCompatDelegate.u(this);
                AppCompatDelegate.f738y.add(new WeakReference(this));
            }
        }
        this.f751o0 = new Configuration(this.H.getResources().getConfiguration());
        this.f749m0 = true;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x002a  */
    @Override // n.h
    public final boolean o(j jVar, MenuItem menuItem) {
        x xVar;
        Window.Callback callback = this.I.getCallback();
        if (callback != null && !this.f750n0) {
            j jVarK = jVar.k();
            x[] xVarArr = this.f745i0;
            int length = xVarArr != null ? xVarArr.length : 0;
            for (int i7 = 0; i7 < length; i7++) {
                xVar = xVarArr[i7];
                if (xVar != null && xVar.f11272h == jVarK) {
                    if (xVar != null) {
                        return callback.onMenuItemSelected(xVar.f11265a, menuItem);
                    }
                }
            }
            xVar = null;
            if (xVar != null) {
                return callback.onMenuItemSelected(xVar.f11265a, menuItem);
            }
        }
        return false;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View d0Var;
        View view2 = null;
        if (this.B0 == null) {
            int[] iArr = h.a.j;
            Context context2 = this.H;
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            String string = typedArrayObtainStyledAttributes.getString(116);
            typedArrayObtainStyledAttributes.recycle();
            if (string == null) {
                this.B0 = new b0();
            } else {
                try {
                    this.B0 = (b0) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable th2) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th2);
                    this.B0 = new b0();
                }
            }
        }
        b0 b0Var = this.B0;
        int i7 = c4.f925a;
        b0Var.getClass();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, h.a.f10276z, 0, 0);
        byte b10 = 4;
        int resourceId = typedArrayObtainStyledAttributes2.getResourceId(4, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        typedArrayObtainStyledAttributes2.recycle();
        Context contextThemeWrapper = (resourceId == 0 || ((context instanceof ContextThemeWrapper) && ((ContextThemeWrapper) context).f766a == resourceId)) ? context : new ContextThemeWrapper(context, resourceId);
        str.getClass();
        switch (str.hashCode()) {
            case -1946472170:
                b10 = !str.equals("RatingBar") ? (byte) -1 : (byte) 0;
                break;
            case -1455429095:
                b10 = !str.equals("CheckedTextView") ? (byte) -1 : (byte) 1;
                break;
            case -1346021293:
                b10 = !str.equals("MultiAutoCompleteTextView") ? (byte) -1 : (byte) 2;
                break;
            case -938935918:
                b10 = !str.equals("TextView") ? (byte) -1 : (byte) 3;
                break;
            case -937446323:
                if (!str.equals("ImageButton")) {
                    b10 = -1;
                }
                break;
            case -658531749:
                b10 = !str.equals("SeekBar") ? (byte) -1 : (byte) 5;
                break;
            case -339785223:
                b10 = !str.equals("Spinner") ? (byte) -1 : (byte) 6;
                break;
            case 776382189:
                b10 = !str.equals("RadioButton") ? (byte) -1 : (byte) 7;
                break;
            case 799298502:
                b10 = !str.equals("ToggleButton") ? (byte) -1 : (byte) 8;
                break;
            case 1125864064:
                b10 = !str.equals("ImageView") ? (byte) -1 : (byte) 9;
                break;
            case 1413872058:
                b10 = !str.equals("AutoCompleteTextView") ? (byte) -1 : (byte) 10;
                break;
            case 1601505219:
                b10 = !str.equals("CheckBox") ? (byte) -1 : (byte) 11;
                break;
            case 1666676343:
                b10 = !str.equals("EditText") ? (byte) -1 : (byte) 12;
                break;
            case 2001146706:
                b10 = !str.equals("Button") ? (byte) -1 : (byte) 13;
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                d0Var = new d0(contextThemeWrapper, attributeSet);
                break;
            case 1:
                d0Var = new androidx.appcompat.widget.u(contextThemeWrapper, attributeSet);
                break;
            case 2:
                d0Var = new androidx.appcompat.widget.z(contextThemeWrapper, attributeSet);
                break;
            case 3:
                d0Var = b0Var.e(contextThemeWrapper, attributeSet);
                break;
            case 4:
                d0Var = new androidx.appcompat.widget.x(contextThemeWrapper, attributeSet, com.discord.R.attr.imageButtonStyle);
                break;
            case 5:
                d0Var = new f0(contextThemeWrapper, attributeSet);
                break;
            case 6:
                d0Var = new r0(contextThemeWrapper, attributeSet);
                break;
            case 7:
                d0Var = b0Var.d(contextThemeWrapper, attributeSet);
                break;
            case 8:
                d0Var = new g1(contextThemeWrapper, attributeSet);
                break;
            case 9:
                d0Var = new y(contextThemeWrapper, attributeSet, 0);
                break;
            case 10:
                d0Var = b0Var.a(contextThemeWrapper, attributeSet);
                break;
            case 11:
                d0Var = b0Var.c(contextThemeWrapper, attributeSet);
                break;
            case 12:
                d0Var = new AppCompatEditText(contextThemeWrapper, attributeSet, 0);
                break;
            case 13:
                d0Var = b0Var.b(contextThemeWrapper, attributeSet);
                break;
            default:
                d0Var = null;
                break;
        }
        if (d0Var != null || context == contextThemeWrapper) {
            view2 = d0Var;
        } else {
            Object[] objArr = b0Var.f11172a;
            if (str.equals("view")) {
                str = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = contextThemeWrapper;
                objArr[1] = attributeSet;
                if (-1 == str.indexOf(46)) {
                    int i10 = 0;
                    while (true) {
                        String[] strArr = b0.f11170g;
                        if (i10 < 3) {
                            View viewF = b0Var.f(contextThemeWrapper, str, strArr[i10]);
                            if (viewF != null) {
                                objArr[0] = null;
                                objArr[1] = null;
                                view2 = viewF;
                            } else {
                                i10++;
                            }
                        } else {
                            objArr[0] = null;
                            objArr[1] = null;
                        }
                    }
                } else {
                    View viewF2 = b0Var.f(contextThemeWrapper, str, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view2 = viewF2;
                }
            } catch (Exception unused) {
                objArr[0] = view2;
                objArr[1] = view2;
            } catch (Throwable th3) {
                objArr[0] = view2;
                objArr[1] = view2;
                throw th3;
            }
        }
        if (view2 != null) {
            Context context3 = view2.getContext();
            if ((context3 instanceof ContextWrapper) && view2.hasOnClickListeners()) {
                TypedArray typedArrayObtainStyledAttributes3 = context3.obtainStyledAttributes(attributeSet, b0.f11166c);
                String string2 = typedArrayObtainStyledAttributes3.getString(0);
                if (string2 != null) {
                    view2.setOnClickListener(new a0(view2, string2));
                }
                typedArrayObtainStyledAttributes3.recycle();
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray typedArrayObtainStyledAttributes4 = contextThemeWrapper.obtainStyledAttributes(attributeSet, b0.f11167d);
                if (typedArrayObtainStyledAttributes4.hasValue(0)) {
                    boolean z5 = typedArrayObtainStyledAttributes4.getBoolean(0, false);
                    WeakHashMap weakHashMap = u0.f1729a;
                    new g0(com.discord.R.id.tag_accessibility_heading, Boolean.class, 0, 28, 3).f(view2, Boolean.valueOf(z5));
                }
                typedArrayObtainStyledAttributes4.recycle();
                TypedArray typedArrayObtainStyledAttributes5 = contextThemeWrapper.obtainStyledAttributes(attributeSet, b0.f11168e);
                if (typedArrayObtainStyledAttributes5.hasValue(0)) {
                    u0.q(view2, typedArrayObtainStyledAttributes5.getString(0));
                }
                typedArrayObtainStyledAttributes5.recycle();
                TypedArray typedArrayObtainStyledAttributes6 = contextThemeWrapper.obtainStyledAttributes(attributeSet, b0.f11169f);
                if (typedArrayObtainStyledAttributes6.hasValue(0)) {
                    boolean z6 = typedArrayObtainStyledAttributes6.getBoolean(0, false);
                    WeakHashMap weakHashMap2 = u0.f1729a;
                    new g0(com.discord.R.id.tag_screen_reader_focusable, Boolean.class, 0, 28, 0).f(view2, Boolean.valueOf(z6));
                }
                typedArrayObtainStyledAttributes6.recycle();
            }
        }
        return view2;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void p() {
        if (this.G instanceof Activity) {
            synchronized (AppCompatDelegate.E) {
                AppCompatDelegate.u(this);
            }
        }
        if (this.f758v0) {
            this.I.getDecorView().removeCallbacks(this.f760x0);
        }
        this.f750n0 = true;
        if (this.f752p0 != -100) {
            Object obj = this.G;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                E0.put(this.G.getClass().getName(), Integer.valueOf(this.f752p0));
            } else {
                E0.remove(this.G.getClass().getName());
            }
        } else {
            E0.remove(this.G.getClass().getName());
        }
        ActionBar actionBar = this.L;
        if (actionBar != null) {
            actionBar.h();
        }
        v vVar = this.f756t0;
        if (vVar != null) {
            vVar.d();
        }
        v vVar2 = this.f757u0;
        if (vVar2 != null) {
            vVar2.d();
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void q() {
        N();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void r() {
        S();
        ActionBar actionBar = this.L;
        if (actionBar != null) {
            actionBar.p(true);
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void s() throws IllegalAccessException {
        E(true, false);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void t() {
        S();
        ActionBar actionBar = this.L;
        if (actionBar != null) {
            actionBar.p(false);
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final boolean v(int i7) {
        if (i7 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i7 = 108;
        } else if (i7 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i7 = 109;
        }
        if (this.f744g0 && i7 == 108) {
            return false;
        }
        if (this.f740c0 && i7 == 1) {
            this.f740c0 = false;
        }
        if (i7 == 1) {
            Z();
            this.f744g0 = true;
            return true;
        }
        if (i7 == 2) {
            Z();
            this.a0 = true;
            return true;
        }
        if (i7 == 5) {
            Z();
            this.f739b0 = true;
            return true;
        }
        if (i7 == 10) {
            Z();
            this.f742e0 = true;
            return true;
        }
        if (i7 == 108) {
            Z();
            this.f740c0 = true;
            return true;
        }
        if (i7 != 109) {
            return this.I.requestFeature(i7);
        }
        Z();
        this.f741d0 = true;
        return true;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void w(int i7) {
        N();
        ViewGroup viewGroup = (ViewGroup) this.X.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.H).inflate(i7, viewGroup);
        this.J.a(this.I.getCallback());
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void x(View view) {
        N();
        ViewGroup viewGroup = (ViewGroup) this.X.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.J.a(this.I.getCallback());
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void y(View view, ViewGroup.LayoutParams layoutParams) {
        N();
        ViewGroup viewGroup = (ViewGroup) this.X.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.J.a(this.I.getCallback());
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
