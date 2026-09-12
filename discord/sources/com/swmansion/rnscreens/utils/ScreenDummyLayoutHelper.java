package com.swmansion.rnscreens.utils;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.m0;
import androidx.core.view.u0;
import com.facebook.jni.annotations.DoNotStrip;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ViewProps;
import com.swmansion.rnscreens.ScreenStackHeaderConfig;
import dn.a;
import dn.b;
import dn.c;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mg.e;
import mg.f;
import v0.d;

/* JADX INFO: loaded from: classes3.dex */
@DoNotStrip
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\tJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/swmansion/rnscreens/utils/ScreenDummyLayoutHelper;", "Lcom/facebook/react/bridge/LifecycleEventListener;", "", ViewProps.FONT_SIZE, "", "isTitleEmpty", "", "computeDummyLayout", "(IZ)F", "dn/c", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nScreenDummyLayoutHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScreenDummyLayoutHelper.kt\ncom/swmansion/rnscreens/utils/ScreenDummyLayoutHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,290:1\n1#2:291\n*E\n"})
public final class ScreenDummyLayoutHelper implements LifecycleEventListener {
    public static final c G = new c();
    public static WeakReference H = new WeakReference(null);
    public WeakReference E;
    public volatile boolean F;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CoordinatorLayout f7239d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public f f7240e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public View f7241i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Toolbar f7242v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f7243w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f7244x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public a f7245y;

    @DoNotStrip
    private final float computeDummyLayout(int fontSize, boolean isTitleEmpty) {
        if (!this.F && !b(c(new com.discord.sticker.sticker_types.c(11)))) {
            Log.e("ScreenDummyLayoutHelper", "[RNScreens] Failed to late-init layout while computing header height. This is most likely a race-condition-bug in react-native-screens, please file an issue at https://github.com/software-mansion/react-native-screens/issues");
            return 0.0f;
        }
        a aVar = this.f7245y;
        b key = new b(fontSize, isTitleEmpty);
        aVar.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        b bVar = aVar.f7688a;
        if (bVar.f7690a != Integer.MIN_VALUE && Intrinsics.areEqual(bVar, key)) {
            return this.f7245y.f7689b;
        }
        f fVar = null;
        Activity currentActivity = c(null).getCurrentActivity();
        if (currentActivity == null) {
            throw new IllegalArgumentException("[RNScreens] Attempt to use context detached from activity");
        }
        View decorView = currentActivity.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        Intrinsics.checkNotNullParameter(decorView, "decorView");
        WeakHashMap weakHashMap = u0.f1729a;
        WindowInsetsCompat windowInsetsCompatA = m0.a(decorView);
        int i7 = windowInsetsCompatA == null ? 0 : windowInsetsCompatA.f1605a.f(647).f1557b;
        int width = decorView.getWidth();
        int height = decorView.getHeight();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(width, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(height, 1073741824);
        if (isTitleEmpty) {
            Toolbar toolbar = this.f7242v;
            if (toolbar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("toolbar");
                toolbar = null;
            }
            toolbar.setTitle("");
            Toolbar toolbar2 = this.f7242v;
            if (toolbar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("toolbar");
                toolbar2 = null;
            }
            toolbar2.setContentInsetStartWithNavigation(0);
        } else {
            Toolbar toolbar3 = this.f7242v;
            if (toolbar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("toolbar");
                toolbar3 = null;
            }
            toolbar3.setTitle("FontSize123!#$");
            Toolbar toolbar4 = this.f7242v;
            if (toolbar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("toolbar");
                toolbar4 = null;
            }
            toolbar4.setContentInsetStartWithNavigation(this.f7244x);
        }
        q8.c cVar = ScreenStackHeaderConfig.f7160f0;
        Toolbar toolbar5 = this.f7242v;
        if (toolbar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("toolbar");
            toolbar5 = null;
        }
        cVar.getClass();
        TextView textViewH = q8.c.h(toolbar5);
        if (textViewH != null) {
            textViewH.setTextSize(fontSize != -1 ? fontSize : this.f7243w);
        }
        CoordinatorLayout coordinatorLayout = this.f7239d;
        if (coordinatorLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coordinatorLayout");
            coordinatorLayout = null;
        }
        coordinatorLayout.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        CoordinatorLayout coordinatorLayout2 = this.f7239d;
        if (coordinatorLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coordinatorLayout");
            coordinatorLayout2 = null;
        }
        coordinatorLayout2.layout(0, 0, width, height);
        f fVar2 = this.f7240e;
        if (fVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appBarLayout");
        } else {
            fVar = fVar2;
        }
        float dIPFromPixel = PixelUtil.toDIPFromPixel(fVar.getHeight() + i7);
        this.f7245y = new a(new b(fontSize, isTitleEmpty), dIPFromPixel);
        return dIPFromPixel;
    }

    @DoNotStrip
    public static final ScreenDummyLayoutHelper getInstance() {
        return G.getInstance();
    }

    public final void a(Activity activity) {
        View view = null;
        this.f7239d = new CoordinatorLayout(activity, null);
        f fVar = new f(activity);
        fVar.setLayoutParams(new d(-1, -2));
        this.f7240e = fVar;
        Toolbar toolbar = new Toolbar(activity, null);
        toolbar.setTitle("FontSize123!#$");
        e eVar = new e();
        eVar.f15774a = 0;
        toolbar.setLayoutParams(eVar);
        this.f7242v = toolbar;
        ScreenStackHeaderConfig.f7160f0.getClass();
        TextView textViewH = q8.c.h(toolbar);
        Intrinsics.checkNotNull(textViewH);
        this.f7243w = textViewH.getTextSize();
        Toolbar toolbar2 = this.f7242v;
        if (toolbar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("toolbar");
            toolbar2 = null;
        }
        this.f7244x = toolbar2.getContentInsetStartWithNavigation();
        f fVar2 = this.f7240e;
        if (fVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appBarLayout");
            fVar2 = null;
        }
        Toolbar toolbar3 = this.f7242v;
        if (toolbar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("toolbar");
            toolbar3 = null;
        }
        fVar2.addView(toolbar3);
        View view2 = new View(activity);
        view2.setLayoutParams(new d(-1, -1));
        this.f7241i = view2;
        CoordinatorLayout coordinatorLayout = this.f7239d;
        if (coordinatorLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coordinatorLayout");
            coordinatorLayout = null;
        }
        f fVar3 = this.f7240e;
        if (fVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appBarLayout");
            fVar3 = null;
        }
        coordinatorLayout.addView(fVar3);
        View view3 = this.f7241i;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dummyContentView");
        } else {
            view = view3;
        }
        coordinatorLayout.addView(view);
        this.F = true;
    }

    public final boolean b(ReactApplicationContext reactApplicationContext) {
        if (this.F) {
            return true;
        }
        if (!reactApplicationContext.hasCurrentActivity()) {
            return false;
        }
        Activity currentActivity = reactApplicationContext.getCurrentActivity();
        if (currentActivity == null) {
            throw new IllegalArgumentException("[RNScreens] Attempt to use context detached from activity. This could happen only due to race-condition.");
        }
        synchronized (this) {
            if (this.F) {
                return true;
            }
            a(currentActivity);
            Unit unit = Unit.f14616a;
            return true;
        }
    }

    public final ReactApplicationContext c(Function0 function0) {
        Object obj = this.E.get();
        if (function0 == null) {
            function0 = new com.discord.sticker.sticker_types.c(13);
        }
        if (obj != null) {
            return (ReactApplicationContext) obj;
        }
        throw new IllegalArgumentException(function0.invoke().toString());
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostDestroy() {
        ReactApplicationContext reactApplicationContext = (ReactApplicationContext) this.E.get();
        if (reactApplicationContext != null) {
            reactApplicationContext.removeLifecycleEventListener(this);
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostResume() {
        ReactApplicationContext reactApplicationContextC = c(new com.discord.sticker.sticker_types.c(12));
        if (b(reactApplicationContextC)) {
            reactApplicationContextC.removeLifecycleEventListener(this);
        } else {
            Log.w("ScreenDummyLayoutHelper", "[RNScreens] Failed to initialise dummy layout in onHostResume.");
        }
    }
}
