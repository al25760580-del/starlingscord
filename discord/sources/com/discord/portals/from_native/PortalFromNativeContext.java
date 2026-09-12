package com.discord.portals.from_native;

import a3.e;
import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001Be\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0015\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u0015\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u0015\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u0015\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003Jq\u0010\u0019\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00062\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00062\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00062\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010¨\u0006!"}, d2 = {"Lcom/discord/portals/from_native/PortalFromNativeContext;", "", "view", "Ljava/lang/ref/WeakReference;", "Landroid/view/View;", "removeViewFromParent", "Lkotlin/Function1;", "", "onViewAddedToPortal", "onViewRemovedFromPortal", "returnViewToParent", "<init>", "(Ljava/lang/ref/WeakReference;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getView", "()Ljava/lang/ref/WeakReference;", "getRemoveViewFromParent", "()Lkotlin/jvm/functions/Function1;", "getOnViewAddedToPortal", "getOnViewRemovedFromPortal", "getReturnViewToParent", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "portals_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class PortalFromNativeContext {

    @NotNull
    private final Function1<View, Unit> onViewAddedToPortal;

    @NotNull
    private final Function1<View, Unit> onViewRemovedFromPortal;

    @NotNull
    private final Function1<View, Unit> removeViewFromParent;

    @NotNull
    private final Function1<View, Unit> returnViewToParent;

    @NotNull
    private final WeakReference<View> view;

    /* JADX WARN: Multi-variable type inference failed */
    public PortalFromNativeContext(@NotNull WeakReference<View> view, @NotNull Function1<? super View, Unit> removeViewFromParent, @NotNull Function1<? super View, Unit> onViewAddedToPortal, @NotNull Function1<? super View, Unit> onViewRemovedFromPortal, @NotNull Function1<? super View, Unit> returnViewToParent) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(removeViewFromParent, "removeViewFromParent");
        Intrinsics.checkNotNullParameter(onViewAddedToPortal, "onViewAddedToPortal");
        Intrinsics.checkNotNullParameter(onViewRemovedFromPortal, "onViewRemovedFromPortal");
        Intrinsics.checkNotNullParameter(returnViewToParent, "returnViewToParent");
        this.view = view;
        this.removeViewFromParent = removeViewFromParent;
        this.onViewAddedToPortal = onViewAddedToPortal;
        this.onViewRemovedFromPortal = onViewRemovedFromPortal;
        this.returnViewToParent = returnViewToParent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PortalFromNativeContext copy$default(PortalFromNativeContext portalFromNativeContext, WeakReference weakReference, Function1 function1, Function1 function2, Function1 function3, Function1 function4, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            weakReference = portalFromNativeContext.view;
        }
        if ((i7 & 2) != 0) {
            function1 = portalFromNativeContext.removeViewFromParent;
        }
        if ((i7 & 4) != 0) {
            function2 = portalFromNativeContext.onViewAddedToPortal;
        }
        if ((i7 & 8) != 0) {
            function3 = portalFromNativeContext.onViewRemovedFromPortal;
        }
        if ((i7 & 16) != 0) {
            function4 = portalFromNativeContext.returnViewToParent;
        }
        Function1 function5 = function4;
        Function1 function6 = function2;
        return portalFromNativeContext.copy(weakReference, function1, function6, function3, function5);
    }

    @NotNull
    public final WeakReference<View> component1() {
        return this.view;
    }

    @NotNull
    public final Function1<View, Unit> component2() {
        return this.removeViewFromParent;
    }

    @NotNull
    public final Function1<View, Unit> component3() {
        return this.onViewAddedToPortal;
    }

    @NotNull
    public final Function1<View, Unit> component4() {
        return this.onViewRemovedFromPortal;
    }

    @NotNull
    public final Function1<View, Unit> component5() {
        return this.returnViewToParent;
    }

    @NotNull
    public final PortalFromNativeContext copy(@NotNull WeakReference<View> view, @NotNull Function1<? super View, Unit> removeViewFromParent, @NotNull Function1<? super View, Unit> onViewAddedToPortal, @NotNull Function1<? super View, Unit> onViewRemovedFromPortal, @NotNull Function1<? super View, Unit> returnViewToParent) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(removeViewFromParent, "removeViewFromParent");
        Intrinsics.checkNotNullParameter(onViewAddedToPortal, "onViewAddedToPortal");
        Intrinsics.checkNotNullParameter(onViewRemovedFromPortal, "onViewRemovedFromPortal");
        Intrinsics.checkNotNullParameter(returnViewToParent, "returnViewToParent");
        return new PortalFromNativeContext(view, removeViewFromParent, onViewAddedToPortal, onViewRemovedFromPortal, returnViewToParent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PortalFromNativeContext)) {
            return false;
        }
        PortalFromNativeContext portalFromNativeContext = (PortalFromNativeContext) other;
        return Intrinsics.areEqual(this.view, portalFromNativeContext.view) && Intrinsics.areEqual(this.removeViewFromParent, portalFromNativeContext.removeViewFromParent) && Intrinsics.areEqual(this.onViewAddedToPortal, portalFromNativeContext.onViewAddedToPortal) && Intrinsics.areEqual(this.onViewRemovedFromPortal, portalFromNativeContext.onViewRemovedFromPortal) && Intrinsics.areEqual(this.returnViewToParent, portalFromNativeContext.returnViewToParent);
    }

    @NotNull
    public final Function1<View, Unit> getOnViewAddedToPortal() {
        return this.onViewAddedToPortal;
    }

    @NotNull
    public final Function1<View, Unit> getOnViewRemovedFromPortal() {
        return this.onViewRemovedFromPortal;
    }

    @NotNull
    public final Function1<View, Unit> getRemoveViewFromParent() {
        return this.removeViewFromParent;
    }

    @NotNull
    public final Function1<View, Unit> getReturnViewToParent() {
        return this.returnViewToParent;
    }

    @NotNull
    public final WeakReference<View> getView() {
        return this.view;
    }

    public int hashCode() {
        return this.returnViewToParent.hashCode() + e.e(e.e(e.e(this.view.hashCode() * 31, 31, this.removeViewFromParent), 31, this.onViewAddedToPortal), 31, this.onViewRemovedFromPortal);
    }

    @NotNull
    public String toString() {
        return "PortalFromNativeContext(view=" + this.view + ", removeViewFromParent=" + this.removeViewFromParent + ", onViewAddedToPortal=" + this.onViewAddedToPortal + ", onViewRemovedFromPortal=" + this.onViewRemovedFromPortal + ", returnViewToParent=" + this.returnViewToParent + ")";
    }
}
