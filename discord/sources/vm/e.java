package vm;

import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Build;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.core.view.x0;
import androidx.fragment.app.FragmentManager;
import bh.p;
import com.discord.R;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.core.ReactChoreographer;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.swmansion.rnscreens.ScreenStack;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends FrameLayout implements l, ym.c, View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f21756f0 = {com.discord.chat.presentation.list.a.p(e.class, "tabBarBackgroundColor", "getTabBarBackgroundColor()Ljava/lang/Integer;", 0), com.discord.chat.presentation.list.a.p(e.class, "tabBarItemActiveIndicatorColor", "getTabBarItemActiveIndicatorColor()Ljava/lang/Integer;", 0), com.discord.chat.presentation.list.a.p(e.class, "isTabBarItemActiveIndicatorEnabled", "isTabBarItemActiveIndicatorEnabled()Z", 0), com.discord.chat.presentation.list.a.p(e.class, "tabBarItemIconColor", "getTabBarItemIconColor()Ljava/lang/Integer;", 0), com.discord.chat.presentation.list.a.p(e.class, "tabBarItemTitleFontFamily", "getTabBarItemTitleFontFamily()Ljava/lang/String;", 0), com.discord.chat.presentation.list.a.p(e.class, "tabBarItemIconColorActive", "getTabBarItemIconColorActive()Ljava/lang/Integer;", 0), com.discord.chat.presentation.list.a.p(e.class, "tabBarItemTitleFontColor", "getTabBarItemTitleFontColor()Ljava/lang/Integer;", 0), com.discord.chat.presentation.list.a.p(e.class, "tabBarItemTitleFontColorActive", "getTabBarItemTitleFontColorActive()Ljava/lang/Integer;", 0), com.discord.chat.presentation.list.a.p(e.class, "tabBarItemTitleFontSize", "getTabBarItemTitleFontSize()Ljava/lang/Float;", 0), com.discord.chat.presentation.list.a.p(e.class, "tabBarItemTitleFontSizeActive", "getTabBarItemTitleFontSizeActive()Ljava/lang/Float;", 0), com.discord.chat.presentation.list.a.p(e.class, "tabBarItemTitleFontWeight", "getTabBarItemTitleFontWeight()Ljava/lang/String;", 0), com.discord.chat.presentation.list.a.p(e.class, "tabBarItemTitleFontStyle", "getTabBarItemTitleFontStyle()Ljava/lang/String;", 0), com.discord.chat.presentation.list.a.p(e.class, "tabBarItemRippleColor", "getTabBarItemRippleColor()Ljava/lang/Integer;", 0), com.discord.chat.presentation.list.a.p(e.class, "tabBarItemLabelVisibilityMode", "getTabBarItemLabelVisibilityMode()Ljava/lang/String;", 0), com.discord.chat.presentation.list.a.p(e.class, "tabBarHidden", "getTabBarHidden()Z", 0), com.discord.chat.presentation.list.a.p(e.class, "nativeContainerBackgroundColor", "getNativeContainerBackgroundColor()Ljava/lang/Integer;", 0)};
    public FragmentManager E;
    public final ArrayList F;
    public Integer G;
    public boolean H;
    public ym.d I;
    public final n8.f J;
    public final f K;
    public final d L;
    public final d M;
    public final d N;
    public final d O;
    public final d P;
    public final d Q;
    public final d R;
    public final d S;
    public final d T;
    public final d U;
    public final d V;
    public final d W;
    public final d a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final d f21757b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final d f21758c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ThemedReactContext f21759d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final d f21760d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f21761e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final com.facebook.react.modules.core.b f21762e0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final op.c f21763i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ContextThemeWrapper f21764v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final qg.e f21765w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final FrameLayout f21766x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public h f21767y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ThemedReactContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.f21759d = reactContext;
        this.f21761e = new c(this);
        this.f21763i = new op.c(10, this);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(reactContext, R.style.Theme_Material3_DayNight_NoActionBar);
        this.f21764v = contextThemeWrapper;
        qg.e eVar = new qg.e(contextThemeWrapper);
        e4.m mVarG = p.g(eVar.getContext(), null, kg.a.f14434e, R.attr.bottomNavigationStyle, R.style.Widget_Design_BottomNavigationView, new int[0]);
        TypedArray typedArray = (TypedArray) mVarG.f7994i;
        eVar.setItemHorizontalTranslationEnabled(typedArray.getBoolean(2, true));
        if (typedArray.hasValue(0)) {
            eVar.setMinimumHeight(typedArray.getDimensionPixelSize(0, 0));
        }
        mVarG.H();
        p.d(eVar, new vi.d(14, (byte) 0));
        eVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 80));
        this.f21765w = eVar;
        FrameLayout frameLayout = new FrameLayout(reactContext);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        o9.d dVar = rm.b.f19459a;
        o9.d dVar2 = rm.b.f19459a;
        int i7 = dVar2.f17185e;
        int i10 = i7 + 2;
        dVar2.f17185e = i10;
        if (i10 % 10 == 1) {
            dVar2.f17185e = i7 + 4;
        }
        frameLayout.setId(i7);
        this.f21766x = frameLayout;
        ArrayList arrayList = new ArrayList();
        this.F = arrayList;
        this.J = new n8.f(contextThemeWrapper, eVar, arrayList);
        this.K = new f(eVar, arrayList);
        this.L = new d(this, 7, false);
        this.M = new d(this, 8, false);
        this.N = new d(this, 9);
        this.O = new d(this, 10, false);
        this.P = new d(this, 11, false);
        this.Q = new d(this, 12, false);
        this.R = new d(this, 13, false);
        this.S = new d(this, 14, false);
        this.T = new d(this, 15, false);
        this.U = new d(this, 0, false);
        this.V = new d(this, 1, false);
        this.W = new d(this, 2, false);
        this.a0 = new d(this, 3, false);
        this.f21757b0 = new d(this, 4, false);
        this.f21758c0 = new d(this, 5);
        this.f21760d0 = new d(this, 6, false);
        addView(frameLayout);
        addView(eVar);
        eVar.addOnLayoutChangeListener(new vl.b());
        eVar.setOnItemSelectedListener(new mi.a(9, this));
        this.f21762e0 = new com.facebook.react.modules.core.b(3, this);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0077  */
    /* JADX WARN: Code duplicated, block: B:23:0x007f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0084  */
    /* JADX WARN: Code duplicated, block: B:28:0x008c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0090  */
    /* JADX WARN: Code duplicated, block: B:32:0x0098 A[LOOP:1: B:24:0x0082->B:32:0x0098, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:53:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x009d A[EDGE_INSN: B:54:0x009d->B:33:0x009d BREAK  A[LOOP:1: B:24:0x0082->B:32:0x0098], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x009d A[EDGE_INSN: B:55:0x009d->B:33:0x009d BREAK  A[LOOP:1: B:24:0x0082->B:32:0x0098], SYNTHETIC] */
    public static void a(e eVar, MenuItem item) {
        String tabKey;
        k kVar;
        ViewGroup viewGroup;
        ScreenStack screenStack;
        Intrinsics.checkNotNullParameter(item, "item");
        String message = "Item selected " + item;
        Intrinsics.checkNotNullParameter("TabsHost", "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        n nVar = (n) CollectionsKt.M(item.getItemId(), eVar.F);
        boolean z5 = false;
        if (Intrinsics.areEqual(nVar, eVar.getCurrentFocusedTab())) {
            e eVar2 = (e) eVar.f21763i.f17490e;
            View view = eVar2.f21766x;
            n currentFocusedTab = eVar2.getCurrentFocusedTab();
            ScrollView scrollView = null;
            if (currentFocusedTab.f21781d.getShouldUseRepeatedTabSelectionPopToRootSpecialEffect()) {
                Intrinsics.checkNotNullParameter(view, "view");
                View childAt = view;
                while (true) {
                    if (childAt != null) {
                        if (childAt instanceof ScreenStack) {
                            screenStack = (ScreenStack) childAt;
                            break;
                        } else if (childAt instanceof ViewGroup) {
                            ViewGroup viewGroup2 = (ViewGroup) childAt;
                            if (viewGroup2.getChildCount() != 0) {
                                childAt = viewGroup2.getChildAt(0);
                            }
                        }
                    }
                    screenStack = null;
                    break;
                }
                if (screenStack != null && screenStack.popToRoot()) {
                    z5 = true;
                } else if (currentFocusedTab.f21781d.getShouldUseRepeatedTabSelectionScrollToTopSpecialEffect()) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    while (view != null) {
                        if (view instanceof ScrollView) {
                            if (view instanceof ViewGroup) {
                                break;
                            }
                            viewGroup = (ViewGroup) view;
                            if (viewGroup.getChildCount() != 0) {
                                break;
                            } else {
                                view = viewGroup.getChildAt(0);
                            }
                        } else {
                            scrollView = (ScrollView) view;
                            break;
                        }
                    }
                    if (scrollView != null && scrollView.getScrollY() > 0) {
                        scrollView.smoothScrollTo(scrollView.getScrollX(), 0);
                        z5 = true;
                    }
                }
            } else if (currentFocusedTab.f21781d.getShouldUseRepeatedTabSelectionScrollToTopSpecialEffect()) {
                Intrinsics.checkNotNullParameter(view, "view");
                while (view != null) {
                    if (view instanceof ScrollView) {
                        if (view instanceof ViewGroup) {
                            break;
                            break;
                        }
                        viewGroup = (ViewGroup) view;
                        if (viewGroup.getChildCount() != 0) {
                            break;
                            break;
                        }
                        view = viewGroup.getChildAt(0);
                    } else {
                        scrollView = (ScrollView) view;
                        break;
                    }
                }
                if (scrollView != null) {
                    scrollView.smoothScrollTo(scrollView.getScrollX(), 0);
                    z5 = true;
                }
            }
        }
        boolean z6 = z5;
        if (nVar == null || (kVar = nVar.f21781d) == null || (tabKey = kVar.getTabKey()) == null) {
            tabKey = "undefined";
        }
        String tabKey2 = tabKey;
        h eventEmitter$react_native_screens_release = eVar.getEventEmitter$react_native_screens_release();
        int itemId = item.getItemId();
        eventEmitter$react_native_screens_release.getClass();
        Intrinsics.checkNotNullParameter(tabKey2, "tabKey");
        ((EventDispatcher) eventEmitter$react_native_screens_release.f14232c).dispatchEvent(new wm.a(UIManagerHelper.getSurfaceId((ReactContext) eventEmitter$react_native_screens_release.f14231b), eventEmitter$react_native_screens_release.f14230a, tabKey2, itemId, z6));
    }

    public static final void b(e eVar) {
        qg.e eVar2 = eVar.f21765w;
        Intrinsics.checkNotNullParameter("TabsHost", "tag");
        Intrinsics.checkNotNullParameter("updateBottomNavigationViewAppearance", "message");
        eVar.J.m0(eVar);
        Integer selectedTabsScreenFragmentId = eVar.getSelectedTabsScreenFragmentId();
        if (selectedTabsScreenFragmentId == null) {
            throw new IllegalStateException("[RNScreens] A single selected tab must be present");
        }
        int iIntValue = selectedTabsScreenFragmentId.intValue();
        if (eVar2.getSelectedItemId() != iIntValue) {
            eVar2.setSelectedItemId(iIntValue);
        }
        eVar.post(new sm.f(5, eVar));
    }

    public static final void c(e eVar, Object obj, Object obj2) {
        eVar.getClass();
        if (Intrinsics.areEqual(obj2, obj)) {
            return;
        }
        c cVar = eVar.f21761e;
        cVar.f21752c = true;
        cVar.b();
    }

    public static final void d(e eVar) {
        n currentFocusedTab = eVar.getCurrentFocusedTab();
        List listF = eVar.getRequireFragmentManager().f2043c.f();
        Intrinsics.checkNotNullExpressionValue(listF, "getFragments(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : listF) {
            if (obj instanceof n) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() > 1) {
            throw new IllegalStateException("[RNScreens] There can be only a single focused tab");
        }
        n nVar = (n) CollectionsKt.firstOrNull(arrayList);
        if (currentFocusedTab == nVar) {
            return;
        }
        FragmentManager requireFragmentManager = eVar.getRequireFragmentManager();
        requireFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(requireFragmentManager);
        aVar.f2078p = true;
        if (nVar != null) {
            aVar.f(nVar);
        }
        aVar.e(eVar.f21766x.getId(), currentFocusedTab, null, 1);
        aVar.d();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001d  */
    /* JADX WARN: Code duplicated, block: B:12:0x0020  */
    private final n getCurrentFocusedTab() {
        for (Object obj : this.F) {
            if (((n) obj).f21781d.L) {
                if (obj != null) {
                    return (n) obj;
                }
                throw new IllegalStateException("[RNScreens] No focused tab present");
            }
        }
        obj = null;
        if (obj != null) {
            return (n) obj;
        }
        throw new IllegalStateException("[RNScreens] No focused tab present");
    }

    private final FragmentManager getRequireFragmentManager() {
        FragmentManager fragmentManager = this.E;
        if (fragmentManager != null) {
            return fragmentManager;
        }
        throw new IllegalStateException("[RNScreens] Nullish fragment manager");
    }

    private final Integer getSelectedTabsScreenFragmentId() {
        ArrayList arrayList = this.F;
        if (arrayList.isEmpty()) {
            return null;
        }
        Iterator it = arrayList.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            if (((n) it.next()).f21781d.L) {
                return Integer.valueOf(i7);
            }
            i7++;
        }
        i7 = -1;
        return Integer.valueOf(i7);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        if (Build.VERSION.SDK_INT >= 30) {
            return super.dispatchApplyWindowInsets(windowInsets);
        }
        if (!(windowInsets != null ? windowInsets.isConsumed() : true)) {
            Iterator it = new x0(this).iterator();
            while (it.hasNext()) {
                ((View) it.next()).dispatchApplyWindowInsets(windowInsets);
            }
        }
        return windowInsets;
    }

    public final void e(Integer num) {
        int iIntValue;
        if (getTabBarHidden()) {
            iIntValue = 0;
        } else {
            iIntValue = num != null ? num.intValue() : this.f21765w.getHeight();
        }
        ym.d dVar = this.I;
        if (dVar != null) {
            ym.a newInterfaceInsets = new ym.a(0.0f, 0.0f, 0.0f, iIntValue);
            Intrinsics.checkNotNullParameter(newInterfaceInsets, "newInterfaceInsets");
            if (Intrinsics.areEqual(newInterfaceInsets, dVar.f23406e)) {
                return;
            }
            dVar.f23406e = newInterfaceInsets;
            ym.b bVar = dVar.f23411y;
            bVar.getClass();
            if (bVar == ym.b.f23401d || bVar == ym.b.f23403i) {
                dVar.f23408v = true;
            }
        }
    }

    @NotNull
    public final h getEventEmitter$react_native_screens_release() {
        h hVar = this.f21767y;
        if (hVar != null) {
            return hVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventEmitter");
        return null;
    }

    @NotNull
    public ym.a getInterfaceInsets() {
        return new ym.a(0.0f, 0.0f, 0.0f, this.f21765w.getHeight());
    }

    public final Integer getNativeContainerBackgroundColor() {
        return (Integer) this.f21760d0.getValue(this, f21756f0[15]);
    }

    @NotNull
    public final ThemedReactContext getReactContext() {
        return this.f21759d;
    }

    public final Integer getTabBarBackgroundColor() {
        return (Integer) this.L.getValue(this, f21756f0[0]);
    }

    public final boolean getTabBarHidden() {
        return ((Boolean) this.f21758c0.getValue(this, f21756f0[14])).booleanValue();
    }

    public final Integer getTabBarItemActiveIndicatorColor() {
        return (Integer) this.M.getValue(this, f21756f0[1]);
    }

    public final Integer getTabBarItemIconColor() {
        return (Integer) this.O.getValue(this, f21756f0[3]);
    }

    public final Integer getTabBarItemIconColorActive() {
        return (Integer) this.Q.getValue(this, f21756f0[5]);
    }

    public final String getTabBarItemLabelVisibilityMode() {
        return (String) this.f21757b0.getValue(this, f21756f0[13]);
    }

    public final Integer getTabBarItemRippleColor() {
        return (Integer) this.a0.getValue(this, f21756f0[12]);
    }

    public final Integer getTabBarItemTitleFontColor() {
        return (Integer) this.R.getValue(this, f21756f0[6]);
    }

    public final Integer getTabBarItemTitleFontColorActive() {
        return (Integer) this.S.getValue(this, f21756f0[7]);
    }

    public final String getTabBarItemTitleFontFamily() {
        return (String) this.P.getValue(this, f21756f0[4]);
    }

    public final Float getTabBarItemTitleFontSize() {
        return (Float) this.T.getValue(this, f21756f0[8]);
    }

    public final Float getTabBarItemTitleFontSizeActive() {
        return (Float) this.U.getValue(this, f21756f0[9]);
    }

    public final String getTabBarItemTitleFontStyle() {
        return (String) this.W.getValue(this, f21756f0[11]);
    }

    public final String getTabBarItemTitleFontWeight() {
        return (String) this.V.getValue(this, f21756f0[10]);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        String message = "TabsHost [" + getId() + "] attached to window";
        Intrinsics.checkNotNullParameter("TabsHost", "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        super.onAttachedToWindow();
        FragmentManager fragmentManagerA = rm.a.a(this);
        if (fragmentManagerA == null) {
            throw new IllegalStateException("[RNScreens] Nullish fragment manager - can't run container operations");
        }
        this.E = fragmentManagerA;
        c cVar = this.f21761e;
        cVar.a();
        cVar.c();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (configuration != null) {
            int i7 = configuration.uiMode & 48;
            Integer num = this.G;
            if (num != null && i7 == num.intValue()) {
                return;
            }
            ContextThemeWrapper contextThemeWrapper = this.f21764v;
            if (i7 == 16) {
                contextThemeWrapper.setTheme(R.style.Theme_Material3_Light_NoActionBar);
            } else if (i7 != 32) {
                contextThemeWrapper.setTheme(R.style.Theme_Material3_DayNight_NoActionBar);
            } else {
                contextThemeWrapper.setTheme(R.style.Theme_Material3_Dark_NoActionBar);
            }
            this.J.m0(this);
            this.G = Integer.valueOf(i7);
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        if (!(view instanceof qg.e)) {
            throw new IllegalArgumentException(("[RNScreens] TabsHost's onLayoutChange expects BottomNavigationView, received " + view + " instead").toString());
        }
        int i17 = i12 - i10;
        if (i17 != i16 - i14) {
            e(Integer.valueOf(i17));
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        com.facebook.react.modules.core.b bVar;
        super.requestLayout();
        if (this.H || (bVar = this.f21762e0) == null) {
            return;
        }
        this.H = true;
        ReactChoreographer.INSTANCE.getInstance().postFrameCallback(ReactChoreographer.CallbackType.NATIVE_ANIMATED_MODULE, bVar);
    }

    public final void setEventEmitter$react_native_screens_release(@NotNull h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<set-?>");
        this.f21767y = hVar;
    }

    public final void setNativeContainerBackgroundColor(Integer num) {
        this.f21760d0.setValue(this, f21756f0[15], num);
    }

    public void setOnInterfaceInsetsChangeListener(@NotNull ym.d listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (this.I == null) {
            this.f21765w.addOnLayoutChangeListener(this);
        }
        this.I = listener;
    }

    public final void setTabBarBackgroundColor(Integer num) {
        this.L.setValue(this, f21756f0[0], num);
    }

    public final void setTabBarHidden(boolean z5) {
        this.f21758c0.setValue(this, f21756f0[14], Boolean.valueOf(z5));
    }

    public final void setTabBarItemActiveIndicatorColor(Integer num) {
        this.M.setValue(this, f21756f0[1], num);
    }

    public final void setTabBarItemActiveIndicatorEnabled(boolean z5) {
        this.N.setValue(this, f21756f0[2], Boolean.valueOf(z5));
    }

    public final void setTabBarItemIconColor(Integer num) {
        this.O.setValue(this, f21756f0[3], num);
    }

    public final void setTabBarItemIconColorActive(Integer num) {
        this.Q.setValue(this, f21756f0[5], num);
    }

    public final void setTabBarItemLabelVisibilityMode(String str) {
        this.f21757b0.setValue(this, f21756f0[13], str);
    }

    public final void setTabBarItemRippleColor(Integer num) {
        this.a0.setValue(this, f21756f0[12], num);
    }

    public final void setTabBarItemTitleFontColor(Integer num) {
        this.R.setValue(this, f21756f0[6], num);
    }

    public final void setTabBarItemTitleFontColorActive(Integer num) {
        this.S.setValue(this, f21756f0[7], num);
    }

    public final void setTabBarItemTitleFontFamily(String str) {
        this.P.setValue(this, f21756f0[4], str);
    }

    public final void setTabBarItemTitleFontSize(Float f2) {
        this.T.setValue(this, f21756f0[8], f2);
    }

    public final void setTabBarItemTitleFontSizeActive(Float f2) {
        this.U.setValue(this, f21756f0[9], f2);
    }

    public final void setTabBarItemTitleFontStyle(String str) {
        this.W.setValue(this, f21756f0[11], str);
    }

    public final void setTabBarItemTitleFontWeight(String str) {
        this.V.setValue(this, f21756f0[10], str);
    }
}
