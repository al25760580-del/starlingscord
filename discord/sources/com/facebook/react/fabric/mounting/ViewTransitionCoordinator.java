package com.facebook.react.fabric.mounting;

import android.view.View;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.build.ReactBuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0010\b\n\u0000\n\u0002\u0010%\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 (2\u00020\u0001:\u0001(B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0006J\"\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\b\b\u0002\u0010\u001a\u001a\u00020\u0011H\u0007J\u000e\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\nJ\u0016\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010 \u001a\u00020!J&\u0010#\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00062\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010 \u001a\u00020!H\u0002J\u0016\u0010%\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006J\u0006\u0010&\u001a\u00020\u000eJ\b\u0010'\u001a\u00020\u0011H\u0007R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\f0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u001eR \u0010\"\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/facebook/react/fabric/mounting/ViewTransitionCoordinator;", "", "<init>", "()V", "viewsInTransition", "", "", "parentQueues", "", "", "Lcom/facebook/react/fabric/mounting/ViewOperation;", "childToParentOrder", "Ljava/util/LinkedList;", "markViewInTransition", "", "tag", "transitioning", "", "view", "Landroid/view/View;", "onDetach", "Ljava/lang/Runnable;", "notifyViewCreated", "shouldEnqueueOperation", "childTag", "parentTag", "checkTransitionStatus", "enqueueOperation", "operation", "drainingParentTag", "Ljava/lang/Integer;", "drainOperationsForChild", "manager", "Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;", "executedChildIdsForParent", "drainQueue", "queue", "isFirstInLineForChild", "clearAllPending", "isEmpty", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nViewTransitionCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewTransitionCoordinator.kt\ncom/facebook/react/fabric/mounting/ViewTransitionCoordinator\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,277:1\n360#2,7:278\n384#3,7:285\n384#3,7:292\n384#3,7:299\n*S KotlinDebug\n*F\n+ 1 ViewTransitionCoordinator.kt\ncom/facebook/react/fabric/mounting/ViewTransitionCoordinator\n*L\n96#1:278,7\n148#1:285,7\n152#1:292,7\n234#1:299,7\n*E\n"})
public final class ViewTransitionCoordinator {

    @NotNull
    private static final String TAG = "ViewTransitionCoordinator";
    private Integer drainingParentTag;

    @NotNull
    private final Set<Integer> viewsInTransition = new LinkedHashSet();

    @NotNull
    private final Map<Integer, List<ViewOperation>> parentQueues = new LinkedHashMap();

    @NotNull
    private final Map<Integer, LinkedList<Integer>> childToParentOrder = new LinkedHashMap();

    @NotNull
    private final Map<Integer, Set<Integer>> executedChildIdsForParent = new LinkedHashMap();

    private final boolean drainQueue(int parentTag, List<ViewOperation> queue, SurfaceMountingManager manager) {
        Integer first;
        Iterator<ViewOperation> it = queue.iterator();
        boolean z5 = false;
        while (it.hasNext()) {
            ViewOperation next = it.next();
            if (!next.isReadyToExecute(this) || this.viewsInTransition.contains(Integer.valueOf(next.getChildTag()))) {
                break;
            }
            if (ReactBuildConfig.DEBUG) {
                o8.a.b(TAG, "Executing " + next);
            }
            it.remove();
            Map<Integer, Set<Integer>> map = this.executedChildIdsForParent;
            Integer numValueOf = Integer.valueOf(parentTag);
            Set<Integer> linkedHashSet = map.get(numValueOf);
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet<>();
                map.put(numValueOf, linkedHashSet);
            }
            linkedHashSet.add(Integer.valueOf(next.getChildTag()));
            next.execute(manager);
            z5 = true;
        }
        Set<Integer> set = this.executedChildIdsForParent.get(Integer.valueOf(parentTag));
        if (queue.isEmpty() && set != null) {
            Iterator<Integer> it2 = set.iterator();
            while (it2.hasNext()) {
                int iIntValue = it2.next().intValue();
                LinkedList<Integer> linkedList = this.childToParentOrder.get(Integer.valueOf(iIntValue));
                if (linkedList == null || (first = linkedList.getFirst()) == null || first.intValue() != parentTag) {
                    Map<Integer, LinkedList<Integer>> map2 = this.childToParentOrder;
                    StringBuilder sbR = a3.e.r(parentTag, "Internal error: operation parentTag ", iIntValue, " is not first in childToParentOrder for childTag ", ": ");
                    sbR.append(map2);
                    throw new IllegalStateException(sbR.toString().toString());
                }
                linkedList.removeFirst();
                if (linkedList.isEmpty()) {
                    this.childToParentOrder.remove(Integer.valueOf(iIntValue));
                }
            }
            this.executedChildIdsForParent.remove(Integer.valueOf(parentTag));
        }
        return z5;
    }

    public static /* synthetic */ boolean shouldEnqueueOperation$default(ViewTransitionCoordinator viewTransitionCoordinator, int i7, int i10, boolean z5, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z5 = true;
        }
        return viewTransitionCoordinator.shouldEnqueueOperation(i7, i10, z5);
    }

    public final void clearAllPending() {
        this.parentQueues.clear();
        this.childToParentOrder.clear();
        this.viewsInTransition.clear();
    }

    public final void drainOperationsForChild(int childTag, @NotNull SurfaceMountingManager manager) {
        boolean zDrainQueue;
        Intrinsics.checkNotNullParameter(manager, "manager");
        UiThreadUtil.assertOnUiThread();
        do {
            LinkedList<Integer> linkedList = this.childToParentOrder.get(Integer.valueOf(childTag));
            if (linkedList == null || linkedList.isEmpty()) {
                break;
            }
            Integer first = linkedList.getFirst();
            List<ViewOperation> list = this.parentQueues.get(first);
            if (list == null) {
                throw new IllegalStateException(("No queue for parentTag=" + first + ". This should not happen as childToParentOrder indicates there are pending operations. childToParentOrder=" + this.childToParentOrder).toString());
            }
            if (Intrinsics.areEqual(this.drainingParentTag, first)) {
                break;
            }
            this.drainingParentTag = first;
            Intrinsics.checkNotNull(first);
            zDrainQueue = drainQueue(first.intValue(), list, manager);
            if (list.isEmpty()) {
                this.parentQueues.remove(first);
            }
        } while (zDrainQueue);
        this.drainingParentTag = null;
    }

    public final void enqueueOperation(@NotNull ViewOperation operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        UiThreadUtil.assertOnUiThread();
        int parentTag = operation.getParentTag();
        int childTag = operation.getChildTag();
        Map<Integer, List<ViewOperation>> map = this.parentQueues;
        Integer numValueOf = Integer.valueOf(parentTag);
        List<ViewOperation> arrayList = map.get(numValueOf);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            map.put(numValueOf, arrayList);
        }
        arrayList.add(operation);
        Map<Integer, LinkedList<Integer>> map2 = this.childToParentOrder;
        Integer numValueOf2 = Integer.valueOf(childTag);
        LinkedList<Integer> linkedList = map2.get(numValueOf2);
        if (linkedList == null) {
            linkedList = new LinkedList<>();
            map2.put(numValueOf2, linkedList);
        }
        LinkedList<Integer> linkedList2 = linkedList;
        Integer num = (Integer) CollectionsKt.S(linkedList2);
        if (num == null || num.intValue() != parentTag) {
            linkedList2.add(Integer.valueOf(parentTag));
        }
        if (ReactBuildConfig.DEBUG) {
            o8.a.b(TAG, "Enqueued operation: " + operation);
        }
    }

    public final boolean isEmpty() {
        return this.parentQueues.isEmpty() && this.childToParentOrder.isEmpty() && this.viewsInTransition.isEmpty();
    }

    public final boolean isFirstInLineForChild(int childTag, int parentTag) {
        LinkedList<Integer> linkedList = this.childToParentOrder.get(Integer.valueOf(childTag));
        if (linkedList == null || linkedList.isEmpty()) {
            return true;
        }
        Integer first = linkedList.getFirst();
        return first != null && first.intValue() == parentTag;
    }

    public final void markViewInTransition(int tag, boolean transitioning, View view, @NotNull Runnable onDetach) {
        Intrinsics.checkNotNullParameter(onDetach, "onDetach");
        UiThreadUtil.assertOnUiThread();
        if (!transitioning) {
            this.viewsInTransition.remove(Integer.valueOf(tag));
        } else {
            if (this.viewsInTransition.contains(Integer.valueOf(tag))) {
                return;
            }
            this.viewsInTransition.add(Integer.valueOf(tag));
            if (view != null) {
                view.addOnAttachStateChangeListener(new ViewTransitionCoordinator$markViewInTransition$listener$1(view, this, tag, onDetach));
            }
        }
    }

    public final void notifyViewCreated(int tag) {
        Map<Integer, List<ViewOperation>> map = this.parentQueues;
        Integer numValueOf = Integer.valueOf(ViewOperationsKt.DELETE_VIEW_PARENT_TAG);
        List<ViewOperation> list = map.get(numValueOf);
        if (list == null) {
            return;
        }
        Iterator<ViewOperation> it = list.iterator();
        int i7 = 0;
        while (true) {
            if (!it.hasNext()) {
                i7 = -1;
                break;
            } else if (it.next().getChildTag() == tag) {
                break;
            } else {
                i7++;
            }
        }
        if (i7 == -1) {
            return;
        }
        list.remove(i7);
        if (list.isEmpty()) {
            this.parentQueues.remove(numValueOf);
        }
        LinkedList<Integer> linkedList = this.childToParentOrder.get(Integer.valueOf(tag));
        if (linkedList != null) {
            linkedList.remove(numValueOf);
        }
        if (linkedList != null && linkedList.isEmpty()) {
            this.childToParentOrder.remove(Integer.valueOf(tag));
        }
        if (ReactBuildConfig.DEBUG) {
            o8.a.b(TAG, "Dropping queued delete operation for tag " + tag + " as the view was re-created");
        }
    }

    public final boolean shouldEnqueueOperation(int i7, int i10) {
        return shouldEnqueueOperation$default(this, i7, i10, false, 4, null);
    }

    public final boolean shouldEnqueueOperation(int childTag, int parentTag, boolean checkTransitionStatus) {
        if (this.childToParentOrder.containsKey(Integer.valueOf(childTag))) {
            return true;
        }
        if (!this.parentQueues.containsKey(Integer.valueOf(parentTag)) || parentTag == -1337) {
            return checkTransitionStatus && this.viewsInTransition.contains(Integer.valueOf(childTag));
        }
        return true;
    }
}
