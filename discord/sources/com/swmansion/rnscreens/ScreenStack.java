package com.swmansion.rnscreens;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.discord.R;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.swmansion.rnscreens.stack.views.ChildrenDrawingOrderStrategy;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.z0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public class ScreenStack extends ScreenContainer {

    @NotNull
    public static final Companion Companion = new Companion();

    @NotNull
    public static final String TAG = "ScreenStack";
    private ChildrenDrawingOrderStrategy childrenDrawingOrderStrategy;
    private ScreenFragmentWrapper currentVisibleBottom;

    @NotNull
    private List<View> disappearingTransitioningChildren;

    @NotNull
    private final Set<ScreenStackFragmentWrapper> dismissedWrappers;

    @NotNull
    private final List<DrawingOp> drawingOpPool;

    @NotNull
    private List<DrawingOp> drawingOps;
    private boolean goingForward;

    @NotNull
    private List<? extends ScreenFragmentWrapper> preloadedWrappers;
    private boolean removalTransitionStarted;

    @NotNull
    private final ArrayList<ScreenStackFragmentWrapper> stack;
    private ScreenStackFragmentWrapper topScreenWrapper;

    public static final class Companion {
    }

    public final class DrawingOp {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Canvas f7156a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public View f7157b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f7158c;

        public DrawingOp() {
        }
    }

    public ScreenStack(Context context) {
        super(context);
        this.stack = new ArrayList<>();
        this.dismissedWrappers = new HashSet();
        this.preloadedWrappers = new ArrayList();
        this.drawingOpPool = new ArrayList();
        this.drawingOps = new ArrayList();
        this.disappearingTransitioningChildren = new ArrayList();
    }

    public static final void access$performDraw(ScreenStack screenStack, DrawingOp drawingOp) {
        screenStack.getClass();
        Canvas canvas = drawingOp.f7156a;
        Intrinsics.checkNotNull(canvas);
        super.drawChild(canvas, drawingOp.f7157b, drawingOp.f7158c);
    }

    public static boolean b(ScreenStack screenStack, ScreenFragmentWrapper it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (CollectionsKt.E(screenStack.dismissedWrappers, it) || it.a().getActivityState() == Screen.ActivityState.f7128d) ? false : true;
    }

    public static boolean c(ScreenStack screenStack, ScreenStackFragmentWrapper wrapper) {
        Intrinsics.checkNotNullParameter(wrapper, "wrapper");
        return !screenStack.screenWrappers.contains(wrapper) || screenStack.dismissedWrappers.contains(wrapper);
    }

    public static boolean d(Ref.ObjectRef objectRef, ScreenStack screenStack, ScreenFragmentWrapper it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return !(it == objectRef.element || CollectionsKt.E(screenStack.dismissedWrappers, it)) || it.a().getActivityState() == Screen.ActivityState.f7128d;
    }

    public static void e(Screen screen, boolean z5) {
        int i7 = z5 ? 262144 : 393216;
        if (Build.VERSION.SDK_INT >= 26) {
            screen.changeFocusability$react_native_screens_release(z5 ? 16 : 0, i7);
        } else {
            screen.changeFocusabilityCompat$react_native_screens_release(z5, i7);
        }
    }

    public final void dismiss(@NotNull ScreenStackFragmentWrapper screenFragment) {
        Intrinsics.checkNotNullParameter(screenFragment, "screenFragment");
        this.dismissedWrappers.add(screenFragment);
        performUpdatesNow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.dispatchDraw(canvas);
        ChildrenDrawingOrderStrategy childrenDrawingOrderStrategy = this.childrenDrawingOrderStrategy;
        if (childrenDrawingOrderStrategy != null) {
            childrenDrawingOrderStrategy.a(this.drawingOps);
        }
        List<DrawingOp> list = this.drawingOps;
        this.drawingOps = new ArrayList();
        for (DrawingOp drawingOp : list) {
            access$performDraw(ScreenStack.this, drawingOp);
            drawingOp.f7156a = null;
            drawingOp.f7157b = null;
            drawingOp.f7158c = 0L;
            this.drawingOpPool.add(drawingOp);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(@NotNull Canvas canvas, @NotNull View child, long j) {
        DrawingOp drawingOpRemove;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(child, "child");
        List<DrawingOp> list = this.drawingOps;
        if (this.drawingOpPool.isEmpty()) {
            drawingOpRemove = new DrawingOp();
        } else {
            List<DrawingOp> list2 = this.drawingOpPool;
            drawingOpRemove = list2.remove(kotlin.collections.d0.f(list2));
        }
        drawingOpRemove.f7156a = canvas;
        drawingOpRemove.f7157b = child;
        drawingOpRemove.f7158c = j;
        list.add(drawingOpRemove);
        return true;
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(View view) {
        ChildrenDrawingOrderStrategy childrenDrawingOrderStrategy;
        Intrinsics.checkNotNullParameter(view, "view");
        super.endViewTransition(view);
        this.disappearingTransitioningChildren.remove(view);
        if (this.disappearingTransitioningChildren.isEmpty() && (childrenDrawingOrderStrategy = this.childrenDrawingOrderStrategy) != null) {
            childrenDrawingOrderStrategy.disable();
        }
        if (this.removalTransitionStarted) {
            this.removalTransitionStarted = false;
            f();
        }
    }

    public final void f() {
        int surfaceId = UIManagerHelper.getSurfaceId(this);
        Context context = getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag((ReactContext) context, getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new k4.k(surfaceId, getId(), 13));
        }
    }

    @NotNull
    public final ArrayList<ScreenStackFragmentWrapper> getFragments() {
        return this.stack;
    }

    public final boolean getGoingForward() {
        return this.goingForward;
    }

    @NotNull
    public final Screen getRootScreen() {
        Object next;
        Screen screenA;
        Iterator<T> it = this.screenWrappers.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (CollectionsKt.E(this.dismissedWrappers, (ScreenFragmentWrapper) next));
        ScreenFragmentWrapper screenFragmentWrapper = (ScreenFragmentWrapper) next;
        if (screenFragmentWrapper == null || (screenA = screenFragmentWrapper.a()) == null) {
            throw new IllegalStateException("[RNScreens] Stack has no root screen set");
        }
        return screenA;
    }

    @NotNull
    public final List<String> getScreenIds() {
        ArrayList<ScreenFragmentWrapper> arrayList = this.screenWrappers;
        ArrayList arrayList2 = new ArrayList(kotlin.collections.e0.l(arrayList, 10));
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ScreenFragmentWrapper) it.next()).a().getScreenId());
        }
        return arrayList2;
    }

    @Override // com.swmansion.rnscreens.ScreenContainer
    public Screen getTopScreen() {
        ScreenStackFragmentWrapper screenStackFragmentWrapper = this.topScreenWrapper;
        if (screenStackFragmentWrapper != null) {
            return screenStackFragmentWrapper.a();
        }
        return null;
    }

    @Override // com.swmansion.rnscreens.ScreenContainer
    public boolean hasScreen(ScreenFragmentWrapper screenFragmentWrapper) {
        return CollectionsKt.E(this.screenWrappers, screenFragmentWrapper) && !CollectionsKt.E(this.dismissedWrappers, screenFragmentWrapper);
    }

    @Override // com.swmansion.rnscreens.ScreenContainer
    public void notifyContainerUpdate() {
        Iterator<T> it = this.stack.iterator();
        while (it.hasNext()) {
            ((ScreenStackFragmentWrapper) it.next()).n();
        }
    }

    /* JADX WARN: Code duplicated, block: B:147:0x032a  */
    /* JADX WARN: Code duplicated, block: B:148:0x032e  */
    /* JADX WARN: Code duplicated, block: B:76:0x0111  */
    /* JADX WARN: Code duplicated, block: B:87:0x014d  */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [T, com.swmansion.rnscreens.ScreenFragmentWrapper] */
    /* JADX WARN: Type inference failed for: r5v1, types: [T, java.lang.Object] */
    @Override // com.swmansion.rnscreens.ScreenContainer
    public void onUpdate() {
        ?? r5;
        Screen.StackAnimation stackAnimation;
        boolean z5;
        ScreenStackFragmentWrapper screenStackFragmentWrapper;
        int iE;
        ScreenStackFragmentWrapper screenStackFragmentWrapper2;
        T t5;
        ScreenStackFragmentWrapper screenStackFragmentWrapper3;
        T t10;
        Screen screenA;
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        this.childrenDrawingOrderStrategy = null;
        final int i7 = 0;
        xq.g gVarH = xq.r.h(CollectionsKt.C(kotlin.collections.j0.y(this.screenWrappers)), new Function1(this) { // from class: com.swmansion.rnscreens.z

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ ScreenStack f7266e;

            {
                this.f7266e = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean zB;
                switch (i7) {
                    case 0:
                        zB = ScreenStack.b(this.f7266e, (ScreenFragmentWrapper) obj);
                        break;
                    default:
                        zB = ScreenStack.c(this.f7266e, (ScreenStackFragmentWrapper) obj);
                        break;
                }
                return Boolean.valueOf(zB);
            }
        });
        objectRef.element = xq.r.j(gVarH);
        ScreenFragmentWrapper screenFragmentWrapper = (ScreenFragmentWrapper) xq.r.j(xq.r.g(gVarH, new com.discord.user_search_worker.a(13)));
        if (screenFragmentWrapper == null || screenFragmentWrapper == objectRef.element) {
            r5 = screenFragmentWrapper;
            r5 = 0;
        }
        r5 = screenFragmentWrapper;
        objectRef2.element = r5;
        this.currentVisibleBottom = r5;
        boolean z6 = CollectionsKt.E(this.stack, objectRef.element) && !CollectionsKt.E(this.preloadedWrappers, objectRef.element);
        T t11 = objectRef.element;
        ScreenStackFragmentWrapper screenStackFragmentWrapper4 = this.topScreenWrapper;
        boolean z7 = t11 != screenStackFragmentWrapper4;
        if (t11 == 0 || z6) {
            if (t11 == 0 || screenStackFragmentWrapper4 == null || !z7) {
                stackAnimation = null;
                z5 = true;
            } else {
                Screen screenA2 = screenStackFragmentWrapper4.a();
                stackAnimation = screenA2 != null ? screenA2.getStackAnimation() : null;
                z5 = false;
            }
        } else if (screenStackFragmentWrapper4 != null) {
            z5 = (this.screenWrappers.contains(screenStackFragmentWrapper4)) || (((ScreenFragmentWrapper) objectRef.element).a().getReplaceAnimation() == Screen.ReplaceAnimation.f7132d);
            if (z5) {
                screenA = ((ScreenFragmentWrapper) objectRef.element).a();
            } else {
                ScreenStackFragmentWrapper screenStackFragmentWrapper5 = this.topScreenWrapper;
                if (screenStackFragmentWrapper5 == null || (screenA = screenStackFragmentWrapper5.a()) == null) {
                    stackAnimation = null;
                }
            }
            stackAnimation = screenA.getStackAnimation();
        } else {
            stackAnimation = Screen.StackAnimation.f7136e;
            this.goingForward = true;
            z5 = true;
        }
        this.goingForward = z5;
        if (z5 && (t10 = objectRef.element) != 0) {
            ScreenFragmentWrapper screenFragmentWrapper2 = (ScreenFragmentWrapper) t10;
            Companion.getClass();
            Screen.StackAnimation stackAnimation2 = stackAnimation == null ? screenFragmentWrapper2.a().getStackAnimation() : stackAnimation;
            if ((Build.VERSION.SDK_INT >= 33 || stackAnimation2 == Screen.StackAnimation.f7138v || stackAnimation2 == Screen.StackAnimation.f7141y || stackAnimation2 == Screen.StackAnimation.E || stackAnimation2 == Screen.StackAnimation.F) && stackAnimation2 != Screen.StackAnimation.f7136e && objectRef2.element == 0) {
                this.childrenDrawingOrderStrategy = new bn.c();
            } else if (objectRef.element != 0) {
                co.q qVarC = CollectionsKt.C(kotlin.collections.j0.y(this.stack));
                final int i10 = 0;
                Function1 predicate = new Function1() { // from class: com.swmansion.rnscreens.a0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i11 = i10;
                        boolean z10 = false;
                        Ref.ObjectRef objectRef3 = objectRef;
                        switch (i11) {
                            case 0:
                                ScreenStackFragmentWrapper it = (ScreenStackFragmentWrapper) obj;
                                ScreenStack.Companion companion = ScreenStack.Companion;
                                Intrinsics.checkNotNullParameter(it, "it");
                                if (it != objectRef3.element && it.b()) {
                                    z10 = true;
                                }
                                return Boolean.valueOf(z10);
                            case 1:
                                ScreenFragmentWrapper it2 = (ScreenFragmentWrapper) obj;
                                ScreenStack.Companion companion2 = ScreenStack.Companion;
                                Intrinsics.checkNotNullParameter(it2, "it");
                                return Boolean.valueOf(it2 != objectRef3.element);
                            default:
                                ScreenFragmentWrapper it3 = (ScreenFragmentWrapper) obj;
                                ScreenStack.Companion companion3 = ScreenStack.Companion;
                                Intrinsics.checkNotNullParameter(it3, "it");
                                return Boolean.valueOf(it3 != objectRef3.element);
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(qVarC, "<this>");
                Intrinsics.checkNotNullParameter(predicate, "predicate");
                iE = xq.r.e(new xq.e(qVarC, predicate, 1));
                if (iE > 1) {
                    this.childrenDrawingOrderStrategy = new bn.b(Math.max((kotlin.collections.d0.f(this.stack) - iE) + 1, 0));
                }
            }
        } else if (objectRef.element != 0 && z6 && (screenStackFragmentWrapper = this.topScreenWrapper) != null && screenStackFragmentWrapper.b() && !((ScreenFragmentWrapper) objectRef.element).b()) {
            co.q qVarC2 = CollectionsKt.C(kotlin.collections.j0.y(this.stack));
            final int i11 = 0;
            Function1 predicate2 = new Function1() { // from class: com.swmansion.rnscreens.a0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i12 = i11;
                    boolean z10 = false;
                    Ref.ObjectRef objectRef3 = objectRef;
                    switch (i12) {
                        case 0:
                            ScreenStackFragmentWrapper it = (ScreenStackFragmentWrapper) obj;
                            ScreenStack.Companion companion = ScreenStack.Companion;
                            Intrinsics.checkNotNullParameter(it, "it");
                            if (it != objectRef3.element && it.b()) {
                                z10 = true;
                            }
                            return Boolean.valueOf(z10);
                        case 1:
                            ScreenFragmentWrapper it2 = (ScreenFragmentWrapper) obj;
                            ScreenStack.Companion companion2 = ScreenStack.Companion;
                            Intrinsics.checkNotNullParameter(it2, "it");
                            return Boolean.valueOf(it2 != objectRef3.element);
                        default:
                            ScreenFragmentWrapper it3 = (ScreenFragmentWrapper) obj;
                            ScreenStack.Companion companion3 = ScreenStack.Companion;
                            Intrinsics.checkNotNullParameter(it3, "it");
                            return Boolean.valueOf(it3 != objectRef3.element);
                    }
                }
            };
            Intrinsics.checkNotNullParameter(qVarC2, "<this>");
            Intrinsics.checkNotNullParameter(predicate2, "predicate");
            iE = xq.r.e(new xq.e(qVarC2, predicate2, 1));
            if (iE > 1) {
                this.childrenDrawingOrderStrategy = new bn.b(Math.max((kotlin.collections.d0.f(this.stack) - iE) + 1, 0));
            }
        }
        FragmentTransaction fragmentTransactionCreateTransaction = createTransaction();
        if (stackAnimation != null) {
            Intrinsics.checkNotNullParameter(fragmentTransactionCreateTransaction, "<this>");
            Intrinsics.checkNotNullParameter(stackAnimation, "stackAnimation");
            if (z5) {
                switch (stackAnimation.ordinal()) {
                    case 0:
                        fragmentTransactionCreateTransaction.h(R.anim.rns_default_enter_in, R.anim.rns_default_enter_out);
                        break;
                    case 1:
                        fragmentTransactionCreateTransaction.h(R.anim.rns_no_animation_20, R.anim.rns_no_animation_20);
                        break;
                    case 2:
                        fragmentTransactionCreateTransaction.h(R.anim.rns_fade_in, R.anim.rns_fade_out);
                        break;
                    case 3:
                        fragmentTransactionCreateTransaction.h(R.anim.rns_slide_in_from_bottom, R.anim.rns_no_animation_medium);
                        break;
                    case 4:
                        fragmentTransactionCreateTransaction.h(R.anim.rns_slide_in_from_right, R.anim.rns_slide_out_to_left);
                        break;
                    case 5:
                        fragmentTransactionCreateTransaction.h(R.anim.rns_slide_in_from_left, R.anim.rns_slide_out_to_right);
                        break;
                    case 6:
                        fragmentTransactionCreateTransaction.h(R.anim.rns_fade_from_bottom, R.anim.rns_no_animation_350);
                        break;
                    case 7:
                        fragmentTransactionCreateTransaction.h(R.anim.rns_ios_from_right_foreground_open, R.anim.rns_ios_from_right_background_open);
                        break;
                    case 8:
                        fragmentTransactionCreateTransaction.h(R.anim.rns_ios_from_left_foreground_open, R.anim.rns_ios_from_left_background_open);
                        break;
                    default:
                        throw new rn.n();
                }
            } else {
                switch (stackAnimation.ordinal()) {
                    case 0:
                        fragmentTransactionCreateTransaction.h(R.anim.rns_default_exit_in, R.anim.rns_default_exit_out);
                        break;
                    case 1:
                        fragmentTransactionCreateTransaction.h(R.anim.rns_no_animation_20, R.anim.rns_no_animation_20);
                        break;
                    case 2:
                        fragmentTransactionCreateTransaction.h(R.anim.rns_fade_in, R.anim.rns_fade_out);
                        break;
                    case 3:
                        fragmentTransactionCreateTransaction.h(R.anim.rns_no_animation_medium, R.anim.rns_slide_out_to_bottom);
                        break;
                    case 4:
                        fragmentTransactionCreateTransaction.h(R.anim.rns_slide_in_from_left, R.anim.rns_slide_out_to_right);
                        break;
                    case 5:
                        fragmentTransactionCreateTransaction.h(R.anim.rns_slide_in_from_right, R.anim.rns_slide_out_to_left);
                        break;
                    case 6:
                        fragmentTransactionCreateTransaction.h(R.anim.rns_no_animation_250, R.anim.rns_fade_to_bottom);
                        break;
                    case 7:
                        fragmentTransactionCreateTransaction.h(R.anim.rns_ios_from_right_background_close, R.anim.rns_ios_from_right_foreground_close);
                        break;
                    case 8:
                        fragmentTransactionCreateTransaction.h(R.anim.rns_ios_from_left_background_close, R.anim.rns_ios_from_left_foreground_close);
                        break;
                    default:
                        throw new rn.n();
                }
            }
        }
        final int i12 = 1;
        xq.d dVar = new xq.d(xq.r.h(CollectionsKt.C(this.stack), new Function1(this) { // from class: com.swmansion.rnscreens.z

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ ScreenStack f7266e;

            {
                this.f7266e = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean zB;
                switch (i12) {
                    case 0:
                        zB = ScreenStack.b(this.f7266e, (ScreenFragmentWrapper) obj);
                        break;
                    default:
                        zB = ScreenStack.c(this.f7266e, (ScreenStackFragmentWrapper) obj);
                        break;
                }
                return Boolean.valueOf(zB);
            }
        }));
        while (dVar.hasNext()) {
            fragmentTransactionCreateTransaction.f(((ScreenStackFragmentWrapper) dVar.next()).g());
        }
        co.q qVarC3 = CollectionsKt.C(this.screenWrappers);
        final int i13 = 1;
        Function1 predicate3 = new Function1() { // from class: com.swmansion.rnscreens.a0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i14 = i13;
                boolean z10 = false;
                Ref.ObjectRef objectRef3 = objectRef2;
                switch (i14) {
                    case 0:
                        ScreenStackFragmentWrapper it = (ScreenStackFragmentWrapper) obj;
                        ScreenStack.Companion companion = ScreenStack.Companion;
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it != objectRef3.element && it.b()) {
                            z10 = true;
                        }
                        return Boolean.valueOf(z10);
                    case 1:
                        ScreenFragmentWrapper it2 = (ScreenFragmentWrapper) obj;
                        ScreenStack.Companion companion2 = ScreenStack.Companion;
                        Intrinsics.checkNotNullParameter(it2, "it");
                        return Boolean.valueOf(it2 != objectRef3.element);
                    default:
                        ScreenFragmentWrapper it3 = (ScreenFragmentWrapper) obj;
                        ScreenStack.Companion companion3 = ScreenStack.Companion;
                        Intrinsics.checkNotNullParameter(it3, "it");
                        return Boolean.valueOf(it3 != objectRef3.element);
                }
            }
        };
        Intrinsics.checkNotNullParameter(qVarC3, "<this>");
        Intrinsics.checkNotNullParameter(predicate3, "predicate");
        xq.d dVar2 = new xq.d(xq.r.h(new xq.e(qVarC3, predicate3, 1), new com.facebook.react.runtime.p(2, objectRef, this)));
        while (dVar2.hasNext()) {
            fragmentTransactionCreateTransaction.f(((ScreenFragmentWrapper) dVar2.next()).g());
        }
        T t12 = objectRef2.element;
        if (t12 == 0 || ((ScreenFragmentWrapper) t12).g().isAdded()) {
            T t13 = objectRef.element;
            if (t13 != 0 && !((ScreenFragmentWrapper) t13).g().isAdded()) {
                Screen screenA3 = ((ScreenFragmentWrapper) objectRef.element).a();
                Intrinsics.checkNotNullParameter(screenA3, "<this>");
                if (!screenA3.getSheetShouldOverflowTopInset() && mm.j.b(screenA3)) {
                    ((ScreenFragmentWrapper) objectRef.element).g().postponeEnterTransition();
                }
                screenStackFragmentWrapper2 = null;
                fragmentTransactionCreateTransaction.e(getId(), ((ScreenFragmentWrapper) objectRef.element).g(), null, 1);
            }
            t5 = objectRef.element;
            if (t5 instanceof ScreenStackFragmentWrapper) {
                screenStackFragmentWrapper3 = (ScreenStackFragmentWrapper) t5;
            } else {
                screenStackFragmentWrapper3 = screenStackFragmentWrapper2;
            }
            this.topScreenWrapper = screenStackFragmentWrapper3;
            this.stack.clear();
            kotlin.collections.i0.p(this.stack, xq.r.n(CollectionsKt.C(this.screenWrappers), new com.discord.user_search_worker.a(11)));
            this.preloadedWrappers = xq.r.q(xq.r.h(CollectionsKt.C(this.screenWrappers), new com.discord.user_search_worker.a(12)));
            updateA11yForVisibleScreens$react_native_screens_release();
            fragmentTransactionCreateTransaction.d();
        }
        ScreenFragmentWrapper screenFragmentWrapper3 = (ScreenFragmentWrapper) objectRef.element;
        final int i14 = 2;
        xq.d dVar3 = new xq.d(xq.r.h(xq.r.g(CollectionsKt.C(this.screenWrappers), new Function1() { // from class: com.swmansion.rnscreens.a0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i15 = i14;
                boolean z10 = false;
                Ref.ObjectRef objectRef3 = objectRef2;
                switch (i15) {
                    case 0:
                        ScreenStackFragmentWrapper it = (ScreenStackFragmentWrapper) obj;
                        ScreenStack.Companion companion = ScreenStack.Companion;
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it != objectRef3.element && it.b()) {
                            z10 = true;
                        }
                        return Boolean.valueOf(z10);
                    case 1:
                        ScreenFragmentWrapper it2 = (ScreenFragmentWrapper) obj;
                        ScreenStack.Companion companion2 = ScreenStack.Companion;
                        Intrinsics.checkNotNullParameter(it2, "it");
                        return Boolean.valueOf(it2 != objectRef3.element);
                    default:
                        ScreenFragmentWrapper it3 = (ScreenFragmentWrapper) obj;
                        ScreenStack.Companion companion3 = ScreenStack.Companion;
                        Intrinsics.checkNotNullParameter(it3, "it");
                        return Boolean.valueOf(it3 != objectRef3.element);
                }
            }
        }), new com.discord.user_search_worker.a(14)));
        while (dVar3.hasNext()) {
            fragmentTransactionCreateTransaction.e(getId(), ((ScreenFragmentWrapper) dVar3.next()).g(), null, 1);
            fragmentTransactionCreateTransaction.g(false, new com.google.firebase.messaging.s(4, screenFragmentWrapper3));
        }
        screenStackFragmentWrapper2 = null;
        t5 = objectRef.element;
        if (t5 instanceof ScreenStackFragmentWrapper) {
            screenStackFragmentWrapper3 = (ScreenStackFragmentWrapper) t5;
        } else {
            screenStackFragmentWrapper3 = screenStackFragmentWrapper2;
        }
        this.topScreenWrapper = screenStackFragmentWrapper3;
        this.stack.clear();
        kotlin.collections.i0.p(this.stack, xq.r.n(CollectionsKt.C(this.screenWrappers), new com.discord.user_search_worker.a(11)));
        this.preloadedWrappers = xq.r.q(xq.r.h(CollectionsKt.C(this.screenWrappers), new com.discord.user_search_worker.a(12)));
        updateA11yForVisibleScreens$react_native_screens_release();
        fragmentTransactionCreateTransaction.d();
    }

    public final void onViewAppearTransitionEnd() {
        if (this.removalTransitionStarted) {
            return;
        }
        f();
    }

    public final boolean popToRoot() {
        int iNextIndex;
        Iterator<ScreenFragmentWrapper> it = this.screenWrappers.iterator();
        int i7 = 0;
        while (true) {
            iNextIndex = -1;
            if (!it.hasNext()) {
                i7 = -1;
                break;
            }
            if (it.next().a().getActivityState() != Screen.ActivityState.f7128d) {
                break;
            }
            i7++;
        }
        ArrayList<ScreenFragmentWrapper> arrayList = this.screenWrappers;
        ListIterator<ScreenFragmentWrapper> listIterator = arrayList.listIterator(arrayList.size());
        while (listIterator.hasPrevious()) {
            if (listIterator.previous().a().getActivityState() != Screen.ActivityState.f7128d) {
                iNextIndex = listIterator.nextIndex();
                break;
            }
        }
        if (i7 < 0 || iNextIndex <= i7) {
            return false;
        }
        int i10 = i7 + 1;
        if (i10 <= iNextIndex) {
            while (true) {
                notifyScreenDetached(this.screenWrappers.get(i10).a());
                if (i10 == iNextIndex) {
                    break;
                }
                i10++;
            }
        }
        return true;
    }

    @Override // com.swmansion.rnscreens.ScreenContainer
    public void removeAllScreens() {
        this.dismissedWrappers.clear();
        super.removeAllScreens();
    }

    @Override // com.swmansion.rnscreens.ScreenContainer
    public void removeScreenAt(int i7) {
        Set<ScreenStackFragmentWrapper> set = this.dismissedWrappers;
        TypeIntrinsics.asMutableCollection(set).remove(getScreenFragmentWrapperAt(i7));
        super.removeScreenAt(i7);
    }

    public final void setGoingForward(boolean z5) {
        this.goingForward = z5;
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(@NotNull View view) {
        ChildrenDrawingOrderStrategy childrenDrawingOrderStrategy;
        Intrinsics.checkNotNullParameter(view, "view");
        if (!(view instanceof bn.e)) {
            throw new IllegalStateException(a3.e.j(view.getClass(), "[RNScreens] Unexpected type of ScreenStack direct subview ").toString());
        }
        super.startViewTransition(view);
        if (((bn.e) view).getFragment$react_native_screens_release().isRemoving()) {
            this.disappearingTransitioningChildren.add(view);
        }
        if (!this.disappearingTransitioningChildren.isEmpty() && (childrenDrawingOrderStrategy = this.childrenDrawingOrderStrategy) != null) {
            childrenDrawingOrderStrategy.enable();
        }
        this.removalTransitionStarted = true;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0037  */
    public final void updateA11yForVisibleScreens$react_native_screens_release() {
        ScreenStackFragmentWrapper screenStackFragmentWrapper;
        boolean zB;
        ScreenFragmentWrapper screenFragmentWrapper;
        int sheetInitialDetentIndex;
        if (this.screenWrappers.size() > 1 && this.currentVisibleBottom != null && (screenStackFragmentWrapper = this.topScreenWrapper) != null) {
            if (mm.j.b(screenStackFragmentWrapper.a())) {
                Screen screenA = screenStackFragmentWrapper.a();
                Intrinsics.checkNotNullParameter(screenA, "<this>");
                Fragment fragment = screenA.getFragment();
                if (fragment != null) {
                    Intrinsics.checkNotNullParameter(fragment, "<this>");
                    mm.i iVar = ((e0) fragment).O;
                    if (iVar != null) {
                        sheetInitialDetentIndex = iVar.f15912y;
                    } else {
                        sheetInitialDetentIndex = screenA.getSheetInitialDetentIndex();
                    }
                } else {
                    sheetInitialDetentIndex = screenA.getSheetInitialDetentIndex();
                }
                zB = sheetInitialDetentIndex > screenA.getSheetLargestUndimmedDetentIndex();
            } else {
                zB = screenStackFragmentWrapper.b();
            }
            ArrayList<ScreenFragmentWrapper> arrayList = this.screenWrappers;
            Iterator it = kotlin.collections.j0.x(CollectionsKt.c0(arrayList, lo.j.i(0, arrayList.size() - 1))).iterator();
            do {
                ListIterator listIterator = ((z0) it).f14674d;
                if (!listIterator.hasPrevious()) {
                    break;
                }
                screenFragmentWrapper = (ScreenFragmentWrapper) listIterator.previous();
                screenFragmentWrapper.a().changeAccessibilityMode(zB ? 4 : 0);
                e(screenFragmentWrapper.a(), !zB);
            } while (!Intrinsics.areEqual(screenFragmentWrapper, this.currentVisibleBottom));
        }
        Screen topScreen = getTopScreen();
        if (topScreen != null) {
            topScreen.changeAccessibilityMode(0);
        }
        Screen topScreen2 = getTopScreen();
        if (topScreen2 != null) {
            e(topScreen2, true);
        }
    }

    @Override // com.swmansion.rnscreens.ScreenContainer
    @NotNull
    public ScreenStackFragmentWrapper adapt(@NotNull Screen screenView) {
        Intrinsics.checkNotNullParameter(screenView, "screen");
        if (b0.f7171a[screenView.getStackPresentation().ordinal()] == 1) {
            Intrinsics.checkNotNullParameter(screenView, "screenView");
            return new e0(screenView);
        }
        Intrinsics.checkNotNullParameter(screenView, "screenView");
        return new e0(screenView);
    }
}
