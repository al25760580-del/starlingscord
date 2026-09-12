package vm;

import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.react.uimanager.ThemedReactContext;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends ViewGroup implements pm.a {
    public static final /* synthetic */ KProperty[] M = {com.discord.chat.presentation.list.a.p(k.class, "tabTitle", "getTabTitle()Ljava/lang/String;", 0), com.discord.chat.presentation.list.a.p(k.class, "badgeValue", "getBadgeValue()Ljava/lang/String;", 0), com.discord.chat.presentation.list.a.p(k.class, "tabBarItemBadgeTextColor", "getTabBarItemBadgeTextColor()Ljava/lang/Integer;", 0), com.discord.chat.presentation.list.a.p(k.class, "tabBarItemBadgeBackgroundColor", "getTabBarItemBadgeBackgroundColor()Ljava/lang/Integer;", 0), com.discord.chat.presentation.list.a.p(k.class, "tabBarItemTestID", "getTabBarItemTestID()Ljava/lang/String;", 0), com.discord.chat.presentation.list.a.p(k.class, "tabBarItemAccessibilityLabel", "getTabBarItemAccessibilityLabel()Ljava/lang/String;", 0), com.discord.chat.presentation.list.a.p(k.class, "drawableIconResourceName", "getDrawableIconResourceName()Ljava/lang/String;", 0), com.discord.chat.presentation.list.a.p(k.class, "icon", "getIcon()Landroid/graphics/drawable/Drawable;", 0)};
    public final j E;
    public final j F;
    public final j G;
    public final j H;
    public final j I;
    public boolean J;
    public boolean K;
    public boolean L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ThemedReactContext f21774d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public WeakReference f21775e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public m f21776i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f21777v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final j f21778w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final j f21779x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final j f21780y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ThemedReactContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.f21774d = reactContext;
        this.f21775e = new WeakReference(null);
        this.f21778w = new j(this, 0);
        this.f21779x = new j(this, 1);
        this.f21780y = new j(this, 2);
        this.E = new j(this, 3);
        this.F = new j(this, 4);
        this.G = new j(this, 5);
        this.H = new j(this, 6);
        this.I = new j(this, 7);
        this.J = true;
        this.K = true;
    }

    public static final void a(k tabsScreen, Object obj, Object obj2) {
        l lVar;
        if (Intrinsics.areEqual(obj2, obj) || (lVar = (l) tabsScreen.f21775e.get()) == null) {
            return;
        }
        e eVar = (e) lVar;
        Intrinsics.checkNotNullParameter(tabsScreen, "tabsScreen");
        Iterator it = eVar.F.iterator();
        int i7 = 0;
        while (true) {
            if (!it.hasNext()) {
                i7 = -1;
                break;
            } else if (((n) it.next()).f21781d == tabsScreen) {
                break;
            } else {
                i7++;
            }
        }
        Integer numValueOf = Integer.valueOf(i7);
        if (i7 == -1) {
            numValueOf = null;
        }
        MenuItem menuItemFindItem = numValueOf != null ? eVar.f21765w.getMenu().findItem(numValueOf.intValue()) : null;
        if (menuItemFindItem != null) {
            eVar.J.l0(menuItemFindItem, tabsScreen);
            eVar.K.a(menuItemFindItem, tabsScreen);
        }
    }

    @Override // pm.a
    public Fragment getAssociatedFragment() {
        l lVar = (l) this.f21775e.get();
        Object obj = null;
        if (lVar == null) {
            return null;
        }
        Intrinsics.checkNotNullParameter(this, "tabsScreen");
        for (Object obj2 : ((e) lVar).F) {
            if (((n) obj2).f21781d == this) {
                obj = obj2;
                break;
            }
        }
        return (n) obj;
    }

    public final String getBadgeValue() {
        return (String) this.f21779x.getValue(this, M[1]);
    }

    public final String getDrawableIconResourceName() {
        return (String) this.H.getValue(this, M[6]);
    }

    @NotNull
    public final m getEventEmitter$react_native_screens_release() {
        m mVar = this.f21776i;
        if (mVar != null) {
            return mVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventEmitter");
        return null;
    }

    public final Drawable getIcon() {
        return (Drawable) this.I.getValue(this, M[7]);
    }

    @NotNull
    public final ThemedReactContext getReactContext() {
        return this.f21774d;
    }

    public final boolean getShouldUseRepeatedTabSelectionPopToRootSpecialEffect() {
        return this.K;
    }

    public final boolean getShouldUseRepeatedTabSelectionScrollToTopSpecialEffect() {
        return this.J;
    }

    public final String getTabBarItemAccessibilityLabel() {
        return (String) this.G.getValue(this, M[5]);
    }

    public final Integer getTabBarItemBadgeBackgroundColor() {
        return (Integer) this.E.getValue(this, M[3]);
    }

    public final Integer getTabBarItemBadgeTextColor() {
        return (Integer) this.f21780y.getValue(this, M[2]);
    }

    public final String getTabBarItemTestID() {
        return (String) this.F.getValue(this, M[4]);
    }

    public final String getTabKey() {
        return this.f21777v;
    }

    public final String getTabTitle() {
        return (String) this.f21778w.getValue(this, M[0]);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        String message = "TabsScreen [" + getId() + "] attached to window";
        Intrinsics.checkNotNullParameter("TabsScreen", "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        super.onAttachedToWindow();
    }

    public final void setBadgeValue(String str) {
        this.f21779x.setValue(this, M[1], str);
    }

    public final void setDrawableIconResourceName(String str) {
        this.H.setValue(this, M[6], str);
    }

    public final void setEventEmitter$react_native_screens_release(@NotNull m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<set-?>");
        this.f21776i = mVar;
    }

    public final void setFocusedTab(boolean z5) {
        if (this.L != z5) {
            this.L = z5;
            l lVar = (l) this.f21775e.get();
            if (lVar != null) {
                Intrinsics.checkNotNullParameter(this, "tabsScreen");
                c cVar = ((e) lVar).f21761e;
                cVar.a();
                cVar.b();
            }
        }
    }

    public final void setIcon(Drawable drawable) {
        this.I.setValue(this, M[7], drawable);
    }

    public final void setShouldUseRepeatedTabSelectionPopToRootSpecialEffect(boolean z5) {
        this.K = z5;
    }

    public final void setShouldUseRepeatedTabSelectionScrollToTopSpecialEffect(boolean z5) {
        this.J = z5;
    }

    public final void setTabBarItemAccessibilityLabel(String str) {
        this.G.setValue(this, M[5], str);
    }

    public final void setTabBarItemBadgeBackgroundColor(Integer num) {
        this.E.setValue(this, M[3], num);
    }

    public final void setTabBarItemBadgeTextColor(Integer num) {
        this.f21780y.setValue(this, M[2], num);
    }

    public final void setTabBarItemTestID(String str) {
        this.F.setValue(this, M[4], str);
    }

    public final void setTabKey(String str) {
        if (str != null && StringsKt.K(str)) {
            str = null;
        }
        this.f21777v = str;
    }

    public final void setTabTitle(String str) {
        this.f21778w.setValue(this, M[0], str);
    }

    public final void setTabsScreenDelegate$react_native_screens_release(l lVar) {
        this.f21775e = new WeakReference(lVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i7, int i10, int i11, int i12) {
    }
}
