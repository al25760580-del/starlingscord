package com.discord.portals.from_js;

import a3.e;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import com.discord.crash_reporting.CrashReporting;
import com.discord.misc.utilities.logThrottle.LogThrottleSingleton;
import com.discord.portals.utils.StacktraceUtilsKt;
import com.facebook.react.views.view.ReactViewGroup;
import java.util.ArrayList;
import kk.b;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.w0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J \u0010\u0015\u001a\u00020\u000f2\u0016\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\n0\fj\b\u0012\u0004\u0012\u00020\n`\rH\u0016J\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0012H\u0016J\u0010\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u001d\u001a\u00020\u000fH\u0016J\u0010\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0012\u0010\u001f\u001a\u00020\u000f2\b\u0010 \u001a\u0004\u0018\u00010\nH\u0016J\u000e\u0010!\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\"\u001a\u00020\u000fJ\u0006\u0010#\u001a\u00020\u000fJ\u0010\u0010$\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\nH\u0002J\u000f\u0010%\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0002\u0010&J\u0018\u0010'\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\nH\u0002J\u0010\u0010(\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\b\u0010)\u001a\u00020\u0018H\u0002J\b\u0010*\u001a\u00020\u000fH\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\n0\fj\b\u0012\u0004\u0012\u00020\n`\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/discord/portals/from_js/PortalFromJsViewHost;", "Lcom/facebook/react/views/view/ReactViewGroup;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "portalId", "", "portalIdPrev", "childView", "Landroid/view/View;", "otherViews", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "addView", "", "child", "index", "", "params", "Landroid/view/ViewGroup$LayoutParams;", "addChildrenForAccessibility", "outChildren", "dispatchPopulateAccessibilityEvent", "", "event", "Landroid/view/accessibility/AccessibilityEvent;", "getChildCount", "getChildAt", "removeAllViews", "removeViewAt", "removeView", "view", "setPortalId", "onAfterUpdateTransaction", "onDropViewInstance", "addChildView", "removeChildView", "()Lkotlin/Unit;", "childViewAdded", "childViewRemoved", "childViewValid", "replaceChildViewWithNextAvailableChild", "portals_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PortalFromJsViewHost extends ReactViewGroup {
    private View childView;

    @NotNull
    private ArrayList<View> otherViews;
    private String portalId;
    private String portalIdPrev;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PortalFromJsViewHost(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.otherViews = new ArrayList<>();
    }

    private final void addChildView(View child) {
        this.childView = child;
        String str = this.portalId;
        Intrinsics.checkNotNull(str);
        childViewAdded(str, child);
    }

    private final void childViewAdded(String portalId, View child) {
        PortalFromJsContextManager.INSTANCE.portalDidMount$portals_release(portalId, child);
    }

    private final void childViewRemoved(String portalId) {
        PortalFromJsContextManager.INSTANCE.portalDidUnmount$portals_release(portalId);
    }

    private final boolean childViewValid() {
        View view = this.childView;
        return (view == null || !view.isAttachedToWindow() || view.getLayoutParams() == null) ? false : true;
    }

    private final Unit removeChildView() {
        if (this.childView == null) {
            return null;
        }
        String str = this.portalId;
        Intrinsics.checkNotNull(str);
        childViewRemoved(str);
        this.childView = null;
        return Unit.f14616a;
    }

    private final void replaceChildViewWithNextAvailableChild() {
        if (this.childView != null) {
            String str = this.portalId;
            if (str == null) {
                return;
            } else {
                childViewRemoved(str);
            }
        }
        addChildView((View) CollectionsKt.K(this.otherViews));
        this.otherViews.remove(0);
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    public void addChildrenForAccessibility(@NotNull ArrayList<View> outChildren) {
        Intrinsics.checkNotNullParameter(outChildren, "outChildren");
    }

    @Override // android.view.ViewGroup
    public void addView(@NotNull View child, int index, ViewGroup.LayoutParams params) {
        Intrinsics.checkNotNullParameter(child, "child");
        String str = this.portalIdPrev;
        if (str == null) {
            str = "";
        }
        String str2 = this.portalId;
        String str3 = str2 != null ? str2 : "";
        if (index != 0) {
            CrashReporting.addBreadcrumb$default(CrashReporting.INSTANCE, b.h(index, "Non-zero index child added "), w0.g(new Pair("portalId", str3), new Pair("prevPortalId", str), new Pair("child", child.toString()), new Pair("index", String.valueOf(index)), new Pair("childViewIsNull", this.childView == null ? "true" : "false"), new Pair("stacktrace", StacktraceUtilsKt.getCurrentStacktraceString())), "portal", null, false, 24, null);
            this.otherViews.add(child);
            return;
        }
        if (Intrinsics.areEqual(this.childView, child)) {
            CrashReporting.addBreadcrumb$default(CrashReporting.INSTANCE, "Same child added again", w0.g(new Pair("portalId", str3), new Pair("prevPortalId", str), new Pair("child", child.toString()), new Pair("index", String.valueOf(index)), new Pair("stacktrace", StacktraceUtilsKt.getCurrentStacktraceString())), "portal", null, false, 24, null);
        } else if (this.childView != null && !childViewValid()) {
            removeChildView();
            CrashReporting.addBreadcrumb$default(CrashReporting.INSTANCE, "childView not valid before addView ".concat(str3), w0.g(new Pair("portalId", str3), new Pair("prevPortalId", str), new Pair("child", child.toString()), new Pair("index", String.valueOf(index)), new Pair("stacktrace", StacktraceUtilsKt.getCurrentStacktraceString())), "portal", null, false, 24, null);
        }
        View view = this.childView;
        if (view != null) {
            CrashReporting.addBreadcrumb$default(CrashReporting.INSTANCE, "Attempting to add different child when one already exists", w0.g(new Pair("portalId", str3), new Pair("prevPortalId", str), new Pair("existing", String.valueOf(view)), new Pair("new", child.toString()), new Pair("index", String.valueOf(index)), new Pair("stacktrace", StacktraceUtilsKt.getCurrentStacktraceString())), "portal_error", null, false, 24, null);
        }
        if (this.childView != null) {
            throw new IllegalArgumentException(e.m("Adding more than one child unsupported: ", this.portalId, ", previous: ", str).toString());
        }
        addChildView(child);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent event) {
        return false;
    }

    @Override // android.view.ViewGroup
    @NotNull
    public View getChildAt(int index) {
        String str;
        if (index == 0 && this.childView == null) {
            str = "Requesting portaled view when it's null.";
        } else {
            str = index >= getChildCount() ? "Requesting invalid index." : "";
        }
        if (!StringsKt.K(str)) {
            CrashReporting crashReporting = CrashReporting.INSTANCE;
            Pair pair = new Pair("index", String.valueOf(index));
            String str2 = this.portalId;
            if (str2 == null) {
                str2 = "";
            }
            Pair pair2 = new Pair("portalId", str2);
            String str3 = this.portalIdPrev;
            CrashReporting.addBreadcrumb$default(crashReporting, "About to crash from getChildAt", w0.g(pair, pair2, new Pair("prevPortalId", str3 != null ? str3 : ""), new Pair("childViewIsNull", this.childView == null ? "true" : "false")), "portal", null, false, 24, null);
            throw new IllegalArgumentException(str);
        }
        if (index > 0) {
            CrashReporting crashReporting2 = CrashReporting.INSTANCE;
            Pair pair3 = new Pair("index", String.valueOf(index));
            String str4 = this.portalId;
            if (str4 == null) {
                str4 = "";
            }
            Pair pair4 = new Pair("portalId", str4);
            String str5 = this.portalIdPrev;
            CrashReporting.addBreadcrumb$default(crashReporting2, "getChildAt of non-zero index", w0.g(pair3, pair4, new Pair("prevPortalId", str5 != null ? str5 : ""), new Pair("childViewIsNull", this.childView == null ? "true" : "false"), new Pair("stacktrace", StacktraceUtilsKt.getCurrentStacktraceString())), "portal", null, false, 24, null);
        }
        View view = index == 0 ? this.childView : this.otherViews.get(index - 1);
        Intrinsics.checkNotNull(view);
        return view;
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        return this.otherViews.size() + (this.childView != null ? 1 : 0);
    }

    public final void onAfterUpdateTransaction() {
        String str = this.portalIdPrev;
        if (str != null) {
            childViewRemoved(str);
            View view = this.childView;
            if (view != null) {
                String str2 = this.portalId;
                Intrinsics.checkNotNull(str2);
                childViewAdded(str2, view);
            }
            this.portalIdPrev = null;
        }
    }

    public final void onDropViewInstance() {
        String str = this.portalIdPrev;
        if (str != null) {
            Intrinsics.checkNotNull(str);
            childViewRemoved(str);
        } else {
            String str2 = this.portalId;
            if (str2 != null) {
                Intrinsics.checkNotNull(str2);
                childViewRemoved(str2);
            }
        }
        this.childView = null;
        this.otherViews.clear();
        this.portalIdPrev = null;
        this.portalId = null;
    }

    @Override // android.view.ViewGroup
    public void removeAllViews() {
        this.otherViews.clear();
        removeChildView();
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (Intrinsics.areEqual(view, this.childView)) {
            removeChildView();
        } else {
            TypeIntrinsics.asMutableCollection(this.otherViews).remove(view);
        }
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int index) {
        String string;
        if (index > 0) {
            CrashReporting crashReporting = CrashReporting.INSTANCE;
            Pair pair = new Pair("index", String.valueOf(index));
            String str = this.portalId;
            if (str == null) {
                str = "";
            }
            Pair pair2 = new Pair("portalId", str);
            String str2 = this.portalIdPrev;
            CrashReporting.addBreadcrumb$default(crashReporting, "removeViewAt of non-zero index", w0.g(pair, pair2, new Pair("prevPortalId", str2 != null ? str2 : "")), null, null, false, 28, null);
            this.otherViews.remove(index - 1);
            return;
        }
        if (index != 0 || this.otherViews.isEmpty()) {
            removeChildView();
            return;
        }
        CrashReporting crashReporting2 = CrashReporting.INSTANCE;
        String str3 = this.portalId;
        if (str3 == null) {
            str3 = "";
        }
        Pair pair3 = new Pair("portalId", str3);
        String str4 = this.portalIdPrev;
        Pair pair4 = new Pair("prevPortalId", str4 != null ? str4 : "");
        View view = this.childView;
        if (view == null || (string = view.toString()) == null) {
            string = "null";
        }
        CrashReporting.addBreadcrumb$default(crashReporting2, "removeViewAt of index 0 even though children with index > 0 exist. Switching to next available child (index 1).", w0.g(pair3, pair4, new Pair("childView", string), new Pair("otherViewsSize", String.valueOf(this.otherViews.size())), new Pair("stacktrace", StacktraceUtilsKt.getCurrentStacktraceString())), "portal_error", null, false, 24, null);
        if (!LogThrottleSingleton.INSTANCE.shouldThrottle("PortalFromJsViewHost.removeViewAt", LogThrottleSingleton.RATE_LIMIT_ONE_MINUTE)) {
            crashReporting2.captureMessage("PortalFromJsViewHost", "removeViewAt of index 0 even though children with index > 0 exist. Switching to next available child (index 1).", CrashReporting.ErrorLevel.WARNING);
        }
        replaceChildViewWithNextAvailableChild();
    }

    public final void setPortalId(@NotNull String portalId) {
        Intrinsics.checkNotNullParameter(portalId, "portalId");
        String str = this.portalId;
        if (str == null) {
            this.portalId = portalId;
        } else {
            if (Intrinsics.areEqual(str, portalId)) {
                return;
            }
            this.portalIdPrev = this.portalId;
            this.portalId = portalId;
        }
    }
}
