package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.collection.ArrayMap;
import androidx.core.app.SharedElementCallback;
import androidx.core.os.CancellationSignal;
import androidx.core.util.Preconditions;
import androidx.core.view.OneShotPreDrawListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewGroupCompat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class DefaultSpecialEffectsController extends SpecialEffectsController {
    DefaultSpecialEffectsController(ViewGroup viewGroup) {
        super(viewGroup);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0085  */
    @Override // androidx.fragment.app.SpecialEffectsController
    void executeOperations(List<SpecialEffectsController.Operation> list, boolean z) {
        SpecialEffectsController.Operation operation = null;
        SpecialEffectsController.Operation operation2 = null;
        for (SpecialEffectsController.Operation operation3 : list) {
            SpecialEffectsController.Operation.State stateFrom = SpecialEffectsController.Operation.State.from(operation3.getFragment().mView);
            int i = AnonymousClass10.$SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$State[operation3.getFinalState().ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                if (stateFrom == SpecialEffectsController.Operation.State.VISIBLE && operation == null) {
                    operation = operation3;
                }
            } else if (i == 4 && stateFrom != SpecialEffectsController.Operation.State.VISIBLE) {
                operation2 = operation3;
            }
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        final ArrayList arrayList3 = new ArrayList(list);
        for (final SpecialEffectsController.Operation operation4 : list) {
            CancellationSignal cancellationSignal = new CancellationSignal();
            operation4.markStartedSpecialEffect(cancellationSignal);
            arrayList.add(new AnimationInfo(operation4, cancellationSignal, z));
            CancellationSignal cancellationSignal2 = new CancellationSignal();
            operation4.markStartedSpecialEffect(cancellationSignal2);
            boolean z2 = false;
            if (z) {
                if (operation4 == operation) {
                    z2 = true;
                }
            } else if (operation4 == operation2) {
                z2 = true;
            }
            arrayList2.add(new TransitionInfo(operation4, cancellationSignal2, z, z2));
            operation4.addCompletionListener(new Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.1
                @Override // java.lang.Runnable
                public void run() {
                    if (arrayList3.contains(operation4)) {
                        arrayList3.remove(operation4);
                        DefaultSpecialEffectsController.this.applyContainerChanges(operation4);
                    }
                }
            });
        }
        Map<SpecialEffectsController.Operation, Boolean> mapStartTransitions = startTransitions(arrayList2, arrayList3, z, operation, operation2);
        startAnimations(arrayList, arrayList3, mapStartTransitions.containsValue(true), mapStartTransitions);
        Iterator<SpecialEffectsController.Operation> it = arrayList3.iterator();
        while (it.hasNext()) {
            applyContainerChanges(it.next());
        }
        arrayList3.clear();
    }

    /* JADX INFO: renamed from: androidx.fragment.app.DefaultSpecialEffectsController$10, reason: invalid class name */
    static /* synthetic */ class AnonymousClass10 {
        static final /* synthetic */ int[] $SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$State;

        static {
            int[] iArr = new int[SpecialEffectsController.Operation.State.values().length];
            $SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$State = iArr;
            try {
                iArr[SpecialEffectsController.Operation.State.GONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$State[SpecialEffectsController.Operation.State.INVISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$State[SpecialEffectsController.Operation.State.REMOVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$State[SpecialEffectsController.Operation.State.VISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private void startAnimations(List<AnimationInfo> list, List<SpecialEffectsController.Operation> list2, boolean z, Map<SpecialEffectsController.Operation, Boolean> map) {
        final ViewGroup container = getContainer();
        Context context = container.getContext();
        ArrayList<AnimationInfo> arrayList = new ArrayList();
        boolean z2 = false;
        for (final AnimationInfo animationInfo : list) {
            if (animationInfo.isVisibilityUnchanged()) {
                animationInfo.completeSpecialEffect();
            } else {
                FragmentAnim.AnimationOrAnimator animation = animationInfo.getAnimation(context);
                if (animation == null) {
                    animationInfo.completeSpecialEffect();
                } else {
                    final Animator animator = animation.animator;
                    if (animator == null) {
                        arrayList.add(animationInfo);
                    } else {
                        final SpecialEffectsController.Operation operation = animationInfo.getOperation();
                        Fragment fragment = operation.getFragment();
                        if (Boolean.TRUE.equals(map.get(operation))) {
                            if (FragmentManager.isLoggingEnabled(2)) {
                                Log.v("FragmentManager", "Ignoring Animator set on " + fragment + " as this Fragment was involved in a Transition.");
                            }
                            animationInfo.completeSpecialEffect();
                        } else {
                            final boolean z3 = operation.getFinalState() == SpecialEffectsController.Operation.State.GONE;
                            if (z3) {
                                list2.remove(operation);
                            }
                            final View view = fragment.mView;
                            container.startViewTransition(view);
                            animator.addListener(new AnimatorListenerAdapter() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.2
                                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                public void onAnimationEnd(Animator animator2) {
                                    container.endViewTransition(view);
                                    if (z3) {
                                        operation.getFinalState().applyState(view);
                                    }
                                    animationInfo.completeSpecialEffect();
                                }
                            });
                            animator.setTarget(view);
                            animator.start();
                            animationInfo.getSignal().setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.3
                                @Override // androidx.core.os.CancellationSignal.OnCancelListener
                                public void onCancel() {
                                    animator.end();
                                }
                            });
                            z2 = true;
                        }
                    }
                }
            }
        }
        for (final AnimationInfo animationInfo2 : arrayList) {
            SpecialEffectsController.Operation operation2 = animationInfo2.getOperation();
            Fragment fragment2 = operation2.getFragment();
            if (z) {
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + fragment2 + " as Animations cannot run alongside Transitions.");
                }
                animationInfo2.completeSpecialEffect();
            } else if (z2) {
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + fragment2 + " as Animations cannot run alongside Animators.");
                }
                animationInfo2.completeSpecialEffect();
            } else {
                final View view2 = fragment2.mView;
                Animation animation2 = (Animation) Preconditions.checkNotNull(((FragmentAnim.AnimationOrAnimator) Preconditions.checkNotNull(animationInfo2.getAnimation(context))).animation);
                if (operation2.getFinalState() != SpecialEffectsController.Operation.State.REMOVED) {
                    view2.startAnimation(animation2);
                    animationInfo2.completeSpecialEffect();
                } else {
                    container.startViewTransition(view2);
                    FragmentAnim.EndViewTransitionAnimation endViewTransitionAnimation = new FragmentAnim.EndViewTransitionAnimation(animation2, container, view2);
                    endViewTransitionAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.4
                        @Override // android.view.animation.Animation.AnimationListener
                        public void onAnimationRepeat(Animation animation3) {
                        }

                        @Override // android.view.animation.Animation.AnimationListener
                        public void onAnimationStart(Animation animation3) {
                        }

                        @Override // android.view.animation.Animation.AnimationListener
                        public void onAnimationEnd(Animation animation3) {
                            container.post(new Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.4.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    container.endViewTransition(view2);
                                    animationInfo2.completeSpecialEffect();
                                }
                            });
                        }
                    });
                    view2.startAnimation(endViewTransitionAnimation);
                }
                animationInfo2.getSignal().setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.5
                    @Override // androidx.core.os.CancellationSignal.OnCancelListener
                    public void onCancel() {
                        view2.clearAnimation();
                        container.endViewTransition(view2);
                        animationInfo2.completeSpecialEffect();
                    }
                });
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Map<SpecialEffectsController.Operation, Boolean> startTransitions(List<TransitionInfo> list, List<SpecialEffectsController.Operation> list2, final boolean z, final SpecialEffectsController.Operation operation, final SpecialEffectsController.Operation operation2) {
        ArrayList<View> arrayList;
        Object obj;
        ArrayList<View> arrayList2;
        View view;
        Object objMergeTransitionsTogether;
        Object objMergeTransitionsTogether2;
        View view2;
        ArrayList arrayList3;
        SpecialEffectsController.Operation operation3;
        int i;
        Rect rect;
        ArrayList<View> arrayList4;
        SharedElementCallback exitTransitionCallback;
        SharedElementCallback enterTransitionCallback;
        int i2;
        View view3;
        final View view4;
        int i3;
        String strFindKeyForValue;
        int i4;
        DefaultSpecialEffectsController defaultSpecialEffectsController = this;
        HashMap map = new HashMap();
        final FragmentTransitionImpl fragmentTransitionImpl = null;
        for (TransitionInfo transitionInfo : list) {
            if (!transitionInfo.isVisibilityUnchanged()) {
                FragmentTransitionImpl handlingImpl = transitionInfo.getHandlingImpl();
                if (fragmentTransitionImpl == null) {
                    fragmentTransitionImpl = handlingImpl;
                } else if (handlingImpl != null && fragmentTransitionImpl != handlingImpl) {
                    throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + transitionInfo.getOperation().getFragment() + " returned Transition " + transitionInfo.getTransition() + " which uses a different Transition  type than other Fragments.");
                }
            }
        }
        int i5 = 0;
        if (fragmentTransitionImpl == null) {
            for (TransitionInfo transitionInfo2 : list) {
                map.put(transitionInfo2.getOperation(), false);
                transitionInfo2.completeSpecialEffect();
            }
        } else {
            View view5 = new View(defaultSpecialEffectsController.getContainer().getContext());
            final Rect rect2 = new Rect();
            ArrayList<View> arrayList5 = new ArrayList<>();
            ArrayList<View> arrayList6 = new ArrayList<>();
            ArrayMap arrayMap = new ArrayMap();
            boolean z2 = false;
            Object obj2 = null;
            View view6 = null;
            DefaultSpecialEffectsController defaultSpecialEffectsController2 = defaultSpecialEffectsController;
            ArrayMap arrayMap2 = arrayMap;
            for (TransitionInfo transitionInfo3 : list) {
                if (!transitionInfo3.hasSharedElementTransition() || operation == null || operation2 == null) {
                    i = i5;
                    rect = rect2;
                    arrayList4 = arrayList5;
                    view6 = view6;
                } else {
                    Object objWrapTransitionInSet = fragmentTransitionImpl.wrapTransitionInSet(fragmentTransitionImpl.cloneTransition(transitionInfo3.getSharedElementTransition()));
                    ArrayList<String> sharedElementSourceNames = operation2.getFragment().getSharedElementSourceNames();
                    ArrayList<String> sharedElementSourceNames2 = operation.getFragment().getSharedElementSourceNames();
                    ArrayList<String> sharedElementTargetNames = operation.getFragment().getSharedElementTargetNames();
                    while (i5 < sharedElementTargetNames.size()) {
                        int iIndexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i5));
                        Object obj3 = objWrapTransitionInSet;
                        if (iIndexOf != -1) {
                            sharedElementSourceNames.set(iIndexOf, sharedElementSourceNames2.get(i5));
                        }
                        i5++;
                        objWrapTransitionInSet = obj3;
                    }
                    Object obj4 = objWrapTransitionInSet;
                    ArrayList<String> sharedElementTargetNames2 = operation2.getFragment().getSharedElementTargetNames();
                    if (z == 0) {
                        enterTransitionCallback = operation.getFragment().getExitTransitionCallback();
                        exitTransitionCallback = operation2.getFragment().getEnterTransitionCallback();
                    } else {
                        enterTransitionCallback = operation.getFragment().getEnterTransitionCallback();
                        exitTransitionCallback = operation2.getFragment().getExitTransitionCallback();
                    }
                    int i6 = 0;
                    for (int size = sharedElementSourceNames.size(); i6 < size; size = size) {
                        arrayMap2.put(sharedElementSourceNames.get(i6), sharedElementTargetNames2.get(i6));
                        i6++;
                    }
                    ArrayMap<String, View> arrayMap3 = new ArrayMap<>();
                    defaultSpecialEffectsController2.findNamedViews(arrayMap3, operation.getFragment().mView);
                    arrayMap3.retainAll(sharedElementSourceNames);
                    if (enterTransitionCallback != null) {
                        enterTransitionCallback.onMapSharedElements(sharedElementSourceNames, arrayMap3);
                        int size2 = sharedElementSourceNames.size() - 1;
                        while (size2 >= 0) {
                            String str = sharedElementSourceNames.get(size2);
                            View view7 = arrayMap3.get(str);
                            if (view7 == null) {
                                arrayMap2.remove(str);
                                i4 = size2;
                            } else {
                                i4 = size2;
                                if (!str.equals(ViewCompat.getTransitionName(view7))) {
                                    arrayMap2.put(ViewCompat.getTransitionName(view7), (String) arrayMap2.remove(str));
                                }
                            }
                            size2 = i4 - 1;
                        }
                    } else {
                        arrayMap2.retainAll(arrayMap3.keySet());
                    }
                    final ArrayMap<String, View> arrayMap4 = new ArrayMap<>();
                    defaultSpecialEffectsController2.findNamedViews(arrayMap4, operation2.getFragment().mView);
                    arrayMap4.retainAll(sharedElementTargetNames2);
                    arrayMap4.retainAll(arrayMap2.values());
                    if (exitTransitionCallback != null) {
                        exitTransitionCallback.onMapSharedElements(sharedElementTargetNames2, arrayMap4);
                        int size3 = sharedElementTargetNames2.size() - 1;
                        while (size3 >= 0) {
                            String str2 = sharedElementTargetNames2.get(size3);
                            View view8 = arrayMap4.get(str2);
                            if (view8 == null) {
                                String strFindKeyForValue2 = FragmentTransition.findKeyForValue(arrayMap2, str2);
                                if (strFindKeyForValue2 != null) {
                                    arrayMap2.remove(strFindKeyForValue2);
                                }
                                i3 = size3;
                            } else {
                                i3 = size3;
                                if (!str2.equals(ViewCompat.getTransitionName(view8)) && (strFindKeyForValue = FragmentTransition.findKeyForValue(arrayMap2, str2)) != null) {
                                    arrayMap2.put(strFindKeyForValue, ViewCompat.getTransitionName(view8));
                                }
                            }
                            size3 = i3 - 1;
                        }
                    } else {
                        FragmentTransition.retainValues(arrayMap2, arrayMap4);
                    }
                    defaultSpecialEffectsController2.retainMatchingViews(arrayMap3, arrayMap2.keySet());
                    defaultSpecialEffectsController2.retainMatchingViews(arrayMap4, arrayMap2.values());
                    if (arrayMap2.isEmpty()) {
                        arrayList5.clear();
                        arrayList6.clear();
                        rect = rect2;
                        arrayList4 = arrayList5;
                        obj2 = null;
                        i = 0;
                    } else {
                        FragmentTransition.callSharedElementStartEnd(operation2.getFragment(), operation.getFragment(), z, arrayMap3, true);
                        View view9 = view6;
                        defaultSpecialEffectsController2 = this;
                        OneShotPreDrawListener.add(getContainer(), new Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.6
                            @Override // java.lang.Runnable
                            public void run() {
                                FragmentTransition.callSharedElementStartEnd(operation2.getFragment(), operation.getFragment(), z, arrayMap4, false);
                            }
                        });
                        arrayList5.addAll(arrayMap3.values());
                        if (sharedElementSourceNames.isEmpty()) {
                            i2 = 0;
                            view3 = view9;
                        } else {
                            i2 = 0;
                            view3 = arrayMap3.get(sharedElementSourceNames.get(0));
                            fragmentTransitionImpl.setEpicenter(obj4, view3);
                        }
                        arrayList6.addAll(arrayMap4.values());
                        z2 = z2;
                        if (!sharedElementTargetNames2.isEmpty() && (view4 = arrayMap4.get(sharedElementTargetNames2.get(i2))) != null) {
                            z2 = z2;
                            OneShotPreDrawListener.add(defaultSpecialEffectsController2.getContainer(), new Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.7
                                @Override // java.lang.Runnable
                                public void run() {
                                    fragmentTransitionImpl.getBoundsOnScreen(view4, rect2);
                                }
                            });
                            z2 = true;
                        }
                        z2 = z2;
                        fragmentTransitionImpl.setSharedElementTargets(obj4, view5, arrayList5);
                        i = i2;
                        arrayList4 = arrayList5;
                        rect = rect2;
                        fragmentTransitionImpl.scheduleRemoveTargets(obj4, null, null, null, null, obj4, arrayList6);
                        map.put(operation, true);
                        map.put(operation2, true);
                        view6 = view3;
                        obj2 = obj4;
                    }
                }
                arrayList5 = arrayList4;
                rect2 = rect;
                view5 = view5;
                arrayList6 = arrayList6;
                i5 = i;
                arrayMap2 = arrayMap2;
                defaultSpecialEffectsController2 = defaultSpecialEffectsController2;
                z2 = z2;
            }
            SpecialEffectsController.Operation operation4 = operation;
            SpecialEffectsController.Operation operation5 = operation2;
            boolean z3 = i5;
            View view10 = view5;
            Rect rect3 = rect2;
            ArrayList<View> arrayList7 = arrayList5;
            ArrayMap arrayMap5 = arrayMap2;
            View view11 = view6;
            ArrayList<View> arrayList8 = arrayList6;
            ArrayList arrayList9 = new ArrayList();
            Object obj5 = null;
            Object obj6 = null;
            for (TransitionInfo transitionInfo4 : list) {
                if (transitionInfo4.isVisibilityUnchanged()) {
                    map.put(transitionInfo4.getOperation(), Boolean.valueOf(z3));
                    transitionInfo4.completeSpecialEffect();
                } else {
                    Object objCloneTransition = fragmentTransitionImpl.cloneTransition(transitionInfo4.getTransition());
                    SpecialEffectsController.Operation operation6 = transitionInfo4.getOperation();
                    boolean z4 = (obj2 == null || !(operation6 == operation4 || operation6 == operation5)) ? z3 ? 1 : 0 : true;
                    if (objCloneTransition == null) {
                        if (!z4) {
                            map.put(operation6, Boolean.valueOf(z3));
                            transitionInfo4.completeSpecialEffect();
                        }
                        arrayList2 = arrayList7;
                        arrayList = arrayList8;
                        objMergeTransitionsTogether = obj5;
                        view = view11;
                        view2 = view10;
                        arrayList3 = arrayList9;
                    } else {
                        Object obj7 = obj5;
                        final ArrayList<View> arrayList10 = new ArrayList<>();
                        ArrayList arrayList11 = arrayList9;
                        defaultSpecialEffectsController2.captureTransitioningViews(arrayList10, operation6.getFragment().mView);
                        if (z4) {
                            if (operation6 == operation4) {
                                arrayList10.removeAll(arrayList7);
                            } else {
                                arrayList10.removeAll(arrayList8);
                            }
                        }
                        if (arrayList10.isEmpty()) {
                            fragmentTransitionImpl.addTarget(objCloneTransition, view10);
                            arrayList2 = arrayList7;
                            arrayList = arrayList8;
                            objMergeTransitionsTogether2 = obj6;
                            obj = objCloneTransition;
                            operation3 = operation6;
                            view = view11;
                            objMergeTransitionsTogether = obj7;
                            view2 = view10;
                            arrayList3 = arrayList11;
                        } else {
                            fragmentTransitionImpl.addTargets(objCloneTransition, arrayList10);
                            arrayList = arrayList8;
                            obj = objCloneTransition;
                            arrayList2 = arrayList7;
                            view = view11;
                            objMergeTransitionsTogether = obj7;
                            objMergeTransitionsTogether2 = obj6;
                            view2 = view10;
                            arrayList3 = arrayList11;
                            fragmentTransitionImpl.scheduleRemoveTargets(obj, obj, arrayList10, null, null, null, null);
                            if (operation6.getFinalState() == SpecialEffectsController.Operation.State.GONE) {
                                operation3 = operation6;
                                list2.remove(operation3);
                                ArrayList<View> arrayList12 = new ArrayList<>(arrayList10);
                                arrayList12.remove(operation3.getFragment().mView);
                                fragmentTransitionImpl.scheduleHideFragmentView(obj, operation3.getFragment().mView, arrayList12);
                                OneShotPreDrawListener.add(defaultSpecialEffectsController2.getContainer(), new Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.8
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        FragmentTransition.setViewVisibility(arrayList10, 4);
                                    }
                                });
                            } else {
                                operation3 = operation6;
                            }
                        }
                        if (operation3.getFinalState() == SpecialEffectsController.Operation.State.VISIBLE) {
                            arrayList3.addAll(arrayList10);
                            if (z2) {
                                fragmentTransitionImpl.setEpicenter(obj, rect3);
                            }
                        } else {
                            fragmentTransitionImpl.setEpicenter(obj, view);
                        }
                        map.put(operation3, true);
                        if (transitionInfo4.isOverlapAllowed()) {
                            objMergeTransitionsTogether = fragmentTransitionImpl.mergeTransitionsTogether(objMergeTransitionsTogether, obj, null);
                        } else {
                            objMergeTransitionsTogether2 = fragmentTransitionImpl.mergeTransitionsTogether(objMergeTransitionsTogether2, obj, null);
                        }
                        obj6 = objMergeTransitionsTogether2;
                    }
                    operation5 = operation2;
                    obj5 = objMergeTransitionsTogether;
                    arrayList9 = arrayList3;
                    view10 = view2;
                    arrayList8 = arrayList;
                    arrayList7 = arrayList2;
                    view11 = view;
                    operation4 = operation;
                }
            }
            ArrayList<View> arrayList13 = arrayList7;
            ArrayList<View> arrayList14 = arrayList8;
            ArrayList arrayList15 = arrayList9;
            Object objMergeTransitionsInSequence = fragmentTransitionImpl.mergeTransitionsInSequence(obj5, obj6, obj2);
            for (final TransitionInfo transitionInfo5 : list) {
                if (!transitionInfo5.isVisibilityUnchanged()) {
                    Object transition = transitionInfo5.getTransition();
                    SpecialEffectsController.Operation operation7 = transitionInfo5.getOperation();
                    boolean z5 = (obj2 == null || !(operation7 == operation || operation7 == operation2)) ? z3 ? 1 : 0 : true;
                    if (transition != null || z5) {
                        if (!ViewCompat.isLaidOut(defaultSpecialEffectsController2.getContainer())) {
                            if (FragmentManager.isLoggingEnabled(2)) {
                                Log.v("FragmentManager", "SpecialEffectsController: Container " + defaultSpecialEffectsController2.getContainer() + " has not been laid out. Completing operation " + operation7);
                            }
                            transitionInfo5.completeSpecialEffect();
                        } else {
                            fragmentTransitionImpl.setListenerForTransitionEnd(transitionInfo5.getOperation().getFragment(), objMergeTransitionsInSequence, transitionInfo5.getSignal(), new Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.9
                                @Override // java.lang.Runnable
                                public void run() {
                                    transitionInfo5.completeSpecialEffect();
                                }
                            });
                        }
                    }
                }
            }
            if (ViewCompat.isLaidOut(defaultSpecialEffectsController2.getContainer())) {
                FragmentTransition.setViewVisibility(arrayList15, 4);
                ArrayList<String> arrayListPrepareSetNameOverridesReordered = fragmentTransitionImpl.prepareSetNameOverridesReordered(arrayList14);
                fragmentTransitionImpl.beginDelayedTransition(defaultSpecialEffectsController2.getContainer(), objMergeTransitionsInSequence);
                fragmentTransitionImpl.setNameOverridesReordered(defaultSpecialEffectsController2.getContainer(), arrayList13, arrayList14, arrayListPrepareSetNameOverridesReordered, arrayMap5);
                FragmentTransition.setViewVisibility(arrayList15, z3 ? 1 : 0);
                fragmentTransitionImpl.swapSharedElementTargets(obj2, arrayList13, arrayList14);
                return map;
            }
        }
        return map;
    }

    void retainMatchingViews(ArrayMap<String, View> arrayMap, Collection<String> collection) {
        Iterator<Map.Entry<String, View>> it = arrayMap.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(ViewCompat.getTransitionName(it.next().getValue()))) {
                it.remove();
            }
        }
    }

    void captureTransitioningViews(ArrayList<View> arrayList, View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (ViewGroupCompat.isTransitionGroup(viewGroup)) {
                if (arrayList.contains(view)) {
                    return;
                }
                arrayList.add(viewGroup);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    captureTransitioningViews(arrayList, childAt);
                }
            }
            return;
        }
        if (arrayList.contains(view)) {
            return;
        }
        arrayList.add(view);
    }

    void findNamedViews(Map<String, View> map, View view) {
        String transitionName = ViewCompat.getTransitionName(view);
        if (transitionName != null) {
            map.put(transitionName, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    findNamedViews(map, childAt);
                }
            }
        }
    }

    void applyContainerChanges(SpecialEffectsController.Operation operation) {
        operation.getFinalState().applyState(operation.getFragment().mView);
    }

    private static class SpecialEffectsInfo {
        private final SpecialEffectsController.Operation mOperation;
        private final CancellationSignal mSignal;

        SpecialEffectsInfo(SpecialEffectsController.Operation operation, CancellationSignal cancellationSignal) {
            this.mOperation = operation;
            this.mSignal = cancellationSignal;
        }

        SpecialEffectsController.Operation getOperation() {
            return this.mOperation;
        }

        CancellationSignal getSignal() {
            return this.mSignal;
        }

        boolean isVisibilityUnchanged() {
            SpecialEffectsController.Operation.State stateFrom = SpecialEffectsController.Operation.State.from(this.mOperation.getFragment().mView);
            SpecialEffectsController.Operation.State finalState = this.mOperation.getFinalState();
            if (stateFrom != finalState) {
                return (stateFrom == SpecialEffectsController.Operation.State.VISIBLE || finalState == SpecialEffectsController.Operation.State.VISIBLE) ? false : true;
            }
            return true;
        }

        void completeSpecialEffect() {
            this.mOperation.completeSpecialEffect(this.mSignal);
        }
    }

    private static class AnimationInfo extends SpecialEffectsInfo {
        private FragmentAnim.AnimationOrAnimator mAnimation;
        private boolean mIsPop;
        private boolean mLoadedAnim;

        AnimationInfo(SpecialEffectsController.Operation operation, CancellationSignal cancellationSignal, boolean z) {
            super(operation, cancellationSignal);
            this.mLoadedAnim = false;
            this.mIsPop = z;
        }

        FragmentAnim.AnimationOrAnimator getAnimation(Context context) {
            if (this.mLoadedAnim) {
                return this.mAnimation;
            }
            FragmentAnim.AnimationOrAnimator animationOrAnimatorLoadAnimation = FragmentAnim.loadAnimation(context, getOperation().getFragment(), getOperation().getFinalState() == SpecialEffectsController.Operation.State.VISIBLE, this.mIsPop);
            this.mAnimation = animationOrAnimatorLoadAnimation;
            this.mLoadedAnim = true;
            return animationOrAnimatorLoadAnimation;
        }
    }

    private static class TransitionInfo extends SpecialEffectsInfo {
        private final boolean mOverlapAllowed;
        private final Object mSharedElementTransition;
        private final Object mTransition;

        TransitionInfo(SpecialEffectsController.Operation operation, CancellationSignal cancellationSignal, boolean z, boolean z2) {
            Object exitTransition;
            Object enterTransition;
            boolean allowEnterTransitionOverlap;
            super(operation, cancellationSignal);
            if (operation.getFinalState() == SpecialEffectsController.Operation.State.VISIBLE) {
                if (z) {
                    enterTransition = operation.getFragment().getReenterTransition();
                } else {
                    enterTransition = operation.getFragment().getEnterTransition();
                }
                this.mTransition = enterTransition;
                if (z) {
                    allowEnterTransitionOverlap = operation.getFragment().getAllowReturnTransitionOverlap();
                } else {
                    allowEnterTransitionOverlap = operation.getFragment().getAllowEnterTransitionOverlap();
                }
                this.mOverlapAllowed = allowEnterTransitionOverlap;
            } else {
                if (z) {
                    exitTransition = operation.getFragment().getReturnTransition();
                } else {
                    exitTransition = operation.getFragment().getExitTransition();
                }
                this.mTransition = exitTransition;
                this.mOverlapAllowed = true;
            }
            if (!z2) {
                this.mSharedElementTransition = null;
            } else if (z) {
                this.mSharedElementTransition = operation.getFragment().getSharedElementReturnTransition();
            } else {
                this.mSharedElementTransition = operation.getFragment().getSharedElementEnterTransition();
            }
        }

        Object getTransition() {
            return this.mTransition;
        }

        boolean isOverlapAllowed() {
            return this.mOverlapAllowed;
        }

        public boolean hasSharedElementTransition() {
            return this.mSharedElementTransition != null;
        }

        public Object getSharedElementTransition() {
            return this.mSharedElementTransition;
        }

        FragmentTransitionImpl getHandlingImpl() {
            FragmentTransitionImpl handlingImpl = getHandlingImpl(this.mTransition);
            FragmentTransitionImpl handlingImpl2 = getHandlingImpl(this.mSharedElementTransition);
            if (handlingImpl == null || handlingImpl2 == null || handlingImpl == handlingImpl2) {
                return handlingImpl != null ? handlingImpl : handlingImpl2;
            }
            throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + getOperation().getFragment() + " returned Transition " + this.mTransition + " which uses a different Transition  type than its shared element transition " + this.mSharedElementTransition);
        }

        private FragmentTransitionImpl getHandlingImpl(Object obj) {
            if (obj == null) {
                return null;
            }
            if (FragmentTransition.PLATFORM_IMPL != null && FragmentTransition.PLATFORM_IMPL.canHandle(obj)) {
                return FragmentTransition.PLATFORM_IMPL;
            }
            if (FragmentTransition.SUPPORT_IMPL != null && FragmentTransition.SUPPORT_IMPL.canHandle(obj)) {
                return FragmentTransition.SUPPORT_IMPL;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + getOperation().getFragment() + " is not a valid framework Transition or AndroidX Transition");
        }
    }
}
