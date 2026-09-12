package com.facebook.react.fabric.mounting;

import android.os.SystemClock;
import android.os.Trace;
import co.s;
import com.facebook.react.bridge.ReactIgnorableMountingException;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.fabric.mounting.mountitems.DispatchCommandMountItem;
import com.facebook.react.fabric.mounting.mountitems.MountItem;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.internal.tracing.PerformanceTracer;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.c0;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\u0005\b\u0000\u0018\u0000 *2\u00020\u0001:\u0002)*B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\nJ\u000e\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\fJ\u000e\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\fJ\b\u0010\u001d\u001a\u00020\u0019H\u0007J\u0018\u0010\u001e\u001a\u00020\u00192\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\tH\u0007J\b\u0010\u001e\u001a\u00020\u0019H\u0003J\u0010\u0010\u001f\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u0011H\u0007J\u0010\u0010!\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020\u0011H\u0002J\u0010\u0010#\u001a\u00020\u00192\u0006\u0010$\u001a\u00020\fH\u0002J\u0010\u0010%\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010&H\u0003J\u0010\u0010'\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010&H\u0003J\u0010\u0010(\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010&H\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0011@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0011@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u000e\u0010\u0017\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/facebook/react/fabric/mounting/MountItemDispatcher;", "", "mountingManager", "Lcom/facebook/react/fabric/mounting/MountingManager;", "itemDispatchListener", "Lcom/facebook/react/fabric/mounting/MountItemDispatcher$ItemDispatchListener;", "<init>", "(Lcom/facebook/react/fabric/mounting/MountingManager;Lcom/facebook/react/fabric/mounting/MountItemDispatcher$ItemDispatchListener;)V", "viewCommandMountItems", "Ljava/util/Queue;", "Lcom/facebook/react/fabric/mounting/mountitems/DispatchCommandMountItem;", "mountItems", "Lcom/facebook/react/fabric/mounting/mountitems/MountItem;", "preMountItems", "inDispatch", "", "value", "", "batchedExecutionTime", "getBatchedExecutionTime", "()J", "runStartTime", "getRunStartTime", "lastFrameTimeNanos", "addViewCommandMountItem", "", "mountItem", "addMountItem", "addPreAllocateMountItem", "tryDispatchMountItems", "dispatchMountItems", "dispatchPreMountItems", "frameTimeNanos", "dispatchPreMountItemsImpl", "deadline", "executeOrEnqueue", "item", "getAndResetViewCommandMountItems", "", "getAndResetMountItems", "getAndResetPreMountItems", "ItemDispatchListener", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMountItemDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MountItemDispatcher.kt\ncom/facebook/react/fabric/mounting/MountItemDispatcher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,433:1\n1#2:434\n*E\n"})
public final class MountItemDispatcher {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final long FRAME_TIME_NS = 16666666;

    @NotNull
    private static final String TAG = "MountItemDispatcher";
    private long batchedExecutionTime;
    private boolean inDispatch;

    @NotNull
    private final ItemDispatchListener itemDispatchListener;
    private long lastFrameTimeNanos;

    @NotNull
    private final Queue<MountItem> mountItems;

    @NotNull
    private final MountingManager mountingManager;

    @NotNull
    private final Queue<MountItem> preMountItems;
    private long runStartTime;

    @NotNull
    private final Queue<DispatchCommandMountItem> viewCommandMountItems;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\b\u001a\n\u0012\u0004\u0012\u0002H\n\u0018\u00010\t\"\u0004\b\u0000\u0010\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\n0\fH\u0002J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/facebook/react/fabric/mounting/MountItemDispatcher$Companion;", "", "<init>", "()V", "TAG", "", "FRAME_TIME_NS", "", "drainConcurrentItemQueue", "", "E", "queue", "Ljava/util/Queue;", "printMountItem", "", "mountItem", "Lcom/facebook/react/fabric/mounting/mountitems/MountItem;", "prefix", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nMountItemDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MountItemDispatcher.kt\ncom/facebook/react/fabric/mounting/MountItemDispatcher$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,433:1\n1#2:434\n739#3,9:435\n*S KotlinDebug\n*F\n+ 1 MountItemDispatcher.kt\ncom/facebook/react/fabric/mounting/MountItemDispatcher$Companion\n*L\n425#1:435,9\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final <E> List<E> drainConcurrentItemQueue(Queue<E> queue) {
            if (queue.isEmpty()) {
                return null;
            }
            sn.e eVarB = c0.b();
            do {
                E ePoll = queue.poll();
                if (ePoll != null) {
                    eVarB.add(ePoll);
                }
            } while (!queue.isEmpty());
            sn.e eVarA = c0.a(eVarB);
            if (eVarA.isEmpty()) {
                return null;
            }
            return eVarA;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void printMountItem(MountItem mountItem, String prefix) {
            List listF0;
            List listSplit$default = StringsKt__StringsKt.split$default(mountItem.toString(), new String[]{ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE}, false, 0, 6, null);
            if (!listSplit$default.isEmpty()) {
                ListIterator listIterator = listSplit$default.listIterator(listSplit$default.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        listF0 = n0.f14659d;
                        break;
                    } else if (((String) listIterator.previous()).length() != 0) {
                        listF0 = CollectionsKt.f0(listSplit$default, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            } else {
                listF0 = n0.f14659d;
                break;
            }
            Iterator it = listF0.iterator();
            while (it.hasNext()) {
                o8.a.g(MountItemDispatcher.TAG, prefix + ": " + ((String) it.next()));
            }
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H&J\u0018\u0010\u0007\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H&J\b\u0010\b\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/fabric/mounting/MountItemDispatcher$ItemDispatchListener;", "", "willMountItems", "", "mountItems", "", "Lcom/facebook/react/fabric/mounting/mountitems/MountItem;", "didMountItems", "didDispatchMountItems", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ItemDispatchListener {
        void didDispatchMountItems();

        void didMountItems(List<? extends MountItem> mountItems);

        void willMountItems(List<? extends MountItem> mountItems);
    }

    public MountItemDispatcher(@NotNull MountingManager mountingManager, @NotNull ItemDispatchListener itemDispatchListener) {
        Intrinsics.checkNotNullParameter(mountingManager, "mountingManager");
        Intrinsics.checkNotNullParameter(itemDispatchListener, "itemDispatchListener");
        this.mountingManager = mountingManager;
        this.itemDispatchListener = itemDispatchListener;
        this.viewCommandMountItems = new ConcurrentLinkedQueue();
        this.mountItems = new ConcurrentLinkedQueue();
        this.preMountItems = new ConcurrentLinkedQueue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit dispatchMountItems$lambda$1(MountItemDispatcher mountItemDispatcher, DispatchCommandMountItem command) {
        Intrinsics.checkNotNullParameter(command, "command");
        if (ReactNativeFeatureFlags.enableFabricLogs()) {
            Companion.printMountItem(command, "dispatchMountItems: Executing viewCommandMountItem");
        }
        try {
            mountItemDispatcher.executeOrEnqueue(command);
        } catch (RetryableMountingLayerException e10) {
            if (command.getNumRetries() == 0) {
                command.incrementRetries();
                mountItemDispatcher.addViewCommandMountItem(command);
            } else {
                ReactSoftExceptionLogger.logSoftException(TAG, new ReactNoCrashSoftException("Caught exception executing ViewCommand: " + command, e10));
            }
        } catch (Throwable th2) {
            ReactSoftExceptionLogger.logSoftException(TAG, new RuntimeException("Caught exception executing ViewCommand: " + command, th2));
        }
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit dispatchMountItems$lambda$3$lambda$2(List list, Function1 function1) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            function1.invoke((DispatchCommandMountItem) it.next());
        }
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit dispatchMountItems$lambda$5$lambda$4(List list, MountItemDispatcher mountItemDispatcher) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MountItem mountItem = (MountItem) it.next();
            if (ReactNativeFeatureFlags.enableFabricLogs()) {
                Companion.printMountItem(mountItem, "dispatchMountItems: Executing preMountItem");
            }
            mountItemDispatcher.executeOrEnqueue(mountItem);
        }
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit dispatchMountItems$lambda$7$lambda$6(List list, Function1 function1, MountItemDispatcher mountItemDispatcher) throws Throwable {
        SurfaceMountingManager surfaceManager;
        long jUptimeMillis = SystemClock.uptimeMillis();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MountItem mountItem = (MountItem) it.next();
            if (ReactNativeFeatureFlags.enableFabricLogs()) {
                Companion.printMountItem(mountItem, "dispatchMountItems: Executing mountItem");
            }
            DispatchCommandMountItem dispatchCommandMountItem = mountItem instanceof DispatchCommandMountItem ? (DispatchCommandMountItem) mountItem : null;
            if (dispatchCommandMountItem != null) {
                function1.invoke(dispatchCommandMountItem);
            } else {
                try {
                    mountItemDispatcher.executeOrEnqueue(mountItem);
                } catch (Throwable th2) {
                    o8.a.h(TAG, "dispatchMountItems: caught exception, displaying mount state", th2);
                    if (ReactNativeFeatureFlags.enableFabricLogs()) {
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            MountItem mountItem2 = (MountItem) it2.next();
                            if (mountItem2 == mountItem) {
                                o8.a.g(TAG, "dispatchMountItems: mountItem: next mountItem triggered exception!");
                            }
                            Companion.printMountItem(mountItem2, "dispatchMountItems: mountItem");
                        }
                    }
                    if (mountItem.getSurfaceId() != -1 && (surfaceManager = mountItemDispatcher.mountingManager.getSurfaceManager(mountItem.getSurfaceId())) != null) {
                        surfaceManager.printSurfaceState();
                    }
                    if (!ReactIgnorableMountingException.INSTANCE.isIgnorable(th2)) {
                        throw th2;
                    }
                    ReactSoftExceptionLogger.logSoftException(TAG, th2);
                }
            }
        }
        mountItemDispatcher.batchedExecutionTime = (SystemClock.uptimeMillis() - jUptimeMillis) + mountItemDispatcher.batchedExecutionTime;
        return Unit.f14616a;
    }

    private final void dispatchPreMountItemsImpl(final long deadline) {
        Intrinsics.checkNotNullParameter("MountItemDispatcher::premountViews", "sectionName");
        Trace.beginSection(mo.c0.Q("MountItemDispatcher::premountViews"));
        PerformanceTracer.INSTANCE.trace("premount", "Renderer", "⚛ Native", new Function0() { // from class: com.facebook.react.fabric.mounting.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MountItemDispatcher.dispatchPreMountItemsImpl$lambda$8(this.f5235d, deadline);
            }
        });
        Trace.endSection();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit dispatchPreMountItemsImpl$lambda$8(MountItemDispatcher mountItemDispatcher, long j) {
        MountItem mountItemPoll;
        mountItemDispatcher.inDispatch = true;
        while (System.nanoTime() <= j && (mountItemPoll = mountItemDispatcher.preMountItems.poll()) != null) {
            try {
                if (ReactNativeFeatureFlags.enableFabricLogs()) {
                    Companion.printMountItem(mountItemPoll, "dispatchPreMountItems");
                }
                mountItemDispatcher.executeOrEnqueue(mountItemPoll);
            } catch (Throwable th2) {
                mountItemDispatcher.inDispatch = false;
                throw th2;
            }
        }
        mountItemDispatcher.inDispatch = false;
        return Unit.f14616a;
    }

    private final void executeOrEnqueue(MountItem item) {
        if (!this.mountingManager.isWaitingForViewAttach(item.getSurfaceId())) {
            item.execute(this.mountingManager);
            return;
        }
        if (ReactNativeFeatureFlags.enableFabricLogs()) {
            o8.a.i(TAG, "executeOrEnqueue: Item execution delayed, surface %s is not ready yet", Integer.valueOf(item.getSurfaceId()));
        }
        this.mountingManager.getSurfaceManagerEnforced(item.getSurfaceId(), "MountItemDispatcher::executeOrEnqueue").scheduleMountItemOnViewAttach$ReactAndroid_release(item);
    }

    private final List<MountItem> getAndResetMountItems() {
        return Companion.drainConcurrentItemQueue(this.mountItems);
    }

    private final List<MountItem> getAndResetPreMountItems() {
        return Companion.drainConcurrentItemQueue(this.preMountItems);
    }

    private final List<DispatchCommandMountItem> getAndResetViewCommandMountItems() {
        return Companion.drainConcurrentItemQueue(this.viewCommandMountItems);
    }

    public final void addMountItem(@NotNull MountItem mountItem) {
        Intrinsics.checkNotNullParameter(mountItem, "mountItem");
        this.mountItems.add(mountItem);
    }

    public final void addPreAllocateMountItem(@NotNull MountItem mountItem) {
        Intrinsics.checkNotNullParameter(mountItem, "mountItem");
        if (!this.mountingManager.surfaceIsStopped(mountItem.getSurfaceId())) {
            this.preMountItems.add(mountItem);
        } else if (FabricUIManager.IS_DEVELOPMENT_ENVIRONMENT) {
            o8.a.i(TAG, "Not queueing PreAllocateMountItem: surfaceId stopped: [%d] - %s", Integer.valueOf(mountItem.getSurfaceId()), mountItem.toString());
        }
    }

    public final void addViewCommandMountItem(@NotNull DispatchCommandMountItem mountItem) {
        Intrinsics.checkNotNullParameter(mountItem, "mountItem");
        if (ReactNativeFeatureFlags.disableEarlyViewCommandExecution()) {
            this.mountItems.add(mountItem);
        } else {
            this.viewCommandMountItems.add(mountItem);
        }
    }

    public final void dispatchMountItems(@NotNull Queue<MountItem> mountItems) {
        Intrinsics.checkNotNullParameter(mountItems, "mountItems");
        while (!mountItems.isEmpty()) {
            MountItem mountItemPoll = mountItems.poll();
            if (mountItemPoll == null) {
                throw new IllegalArgumentException("MountItem should not be null");
            }
            MountItem mountItem = mountItemPoll;
            try {
                mountItem.execute(this.mountingManager);
            } catch (RetryableMountingLayerException e10) {
                if (mountItem instanceof DispatchCommandMountItem) {
                    DispatchCommandMountItem dispatchCommandMountItem = (DispatchCommandMountItem) mountItem;
                    if (dispatchCommandMountItem.getNumRetries() == 0) {
                        dispatchCommandMountItem.incrementRetries();
                        addViewCommandMountItem(dispatchCommandMountItem);
                    }
                } else if (ReactNativeFeatureFlags.enableFabricLogs()) {
                    Companion.printMountItem(mountItem, a3.e.l("dispatchExternalMountItems: mounting failed with ", e10.getMessage()));
                }
            }
        }
    }

    public final void dispatchPreMountItems(long frameTimeNanos) {
        this.lastFrameTimeNanos = frameTimeNanos;
        if (this.preMountItems.isEmpty()) {
            return;
        }
        dispatchPreMountItemsImpl(this.lastFrameTimeNanos + 8333333);
    }

    public final long getBatchedExecutionTime() {
        return this.batchedExecutionTime;
    }

    public final long getRunStartTime() {
        return this.runStartTime;
    }

    public final void tryDispatchMountItems() {
        if (this.inDispatch) {
            return;
        }
        this.inDispatch = true;
        try {
            dispatchMountItems();
            this.inDispatch = false;
            this.itemDispatchListener.didDispatchMountItems();
        } catch (Throwable th2) {
            this.inDispatch = false;
            throw th2;
        }
    }

    private final void dispatchMountItems() {
        this.batchedExecutionTime = 0L;
        this.runStartTime = SystemClock.uptimeMillis();
        final List<DispatchCommandMountItem> andResetViewCommandMountItems = getAndResetViewCommandMountItems();
        List<MountItem> andResetMountItems = getAndResetMountItems();
        if (andResetMountItems == null && andResetViewCommandMountItems == null) {
            return;
        }
        this.itemDispatchListener.willMountItems(andResetMountItems);
        final s sVar = new s(24, this);
        if (andResetViewCommandMountItems != null) {
            Intrinsics.checkNotNullParameter("MountItemDispatcher::mountViews viewCommandMountItems", "sectionName");
            Trace.beginSection(mo.c0.Q("MountItemDispatcher::mountViews viewCommandMountItems"));
            final int i7 = 0;
            PerformanceTracer.INSTANCE.trace("view commands", "Renderer", "⚛ Native", new Function0() { // from class: com.facebook.react.fabric.mounting.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i7) {
                        case 0:
                            return MountItemDispatcher.dispatchMountItems$lambda$3$lambda$2(andResetViewCommandMountItems, (s) sVar);
                        default:
                            return MountItemDispatcher.dispatchMountItems$lambda$5$lambda$4(andResetViewCommandMountItems, (MountItemDispatcher) sVar);
                    }
                }
            });
            Trace.endSection();
        }
        final List<MountItem> andResetPreMountItems = getAndResetPreMountItems();
        if (andResetPreMountItems != null) {
            Intrinsics.checkNotNullParameter("MountItemDispatcher::mountViews preMountItems", "sectionName");
            Trace.beginSection(mo.c0.Q("MountItemDispatcher::mountViews preMountItems"));
            final int i10 = 1;
            PerformanceTracer.INSTANCE.trace("premount", "Renderer", "⚛ Native", new Function0() { // from class: com.facebook.react.fabric.mounting.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i10) {
                        case 0:
                            return MountItemDispatcher.dispatchMountItems$lambda$3$lambda$2(andResetPreMountItems, (s) this);
                        default:
                            return MountItemDispatcher.dispatchMountItems$lambda$5$lambda$4(andResetPreMountItems, (MountItemDispatcher) this);
                    }
                }
            });
            Trace.endSection();
        }
        if (andResetMountItems != null) {
            Intrinsics.checkNotNullParameter("MountItemDispatcher::mountViews mountItems to execute", "sectionName");
            Trace.beginSection(mo.c0.Q("MountItemDispatcher::mountViews mountItems to execute"));
            PerformanceTracer.INSTANCE.trace("mount", "Renderer", "⚛ Native", new com.discord.chat.presentation.list.delegate.c(andResetMountItems, sVar, this, 2));
            Trace.endSection();
        }
        this.itemDispatchListener.didMountItems(andResetMountItems);
    }
}
