package com.facebook.react.animated;

import android.os.Build;
import android.view.ViewGroup;
import co.s;
import com.facebook.fbreact.specs.NativeAnimatedModuleSpec;
import com.facebook.imagepipeline.nativecode.b;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableArrayBuilder;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapBuilder;
import com.facebook.react.bridge.ScrollEndedListener;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerListener;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.annotations.VisibleForTesting;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.core.ReactChoreographer;
import com.facebook.react.uimanager.GuardedFrameCallback;
import com.facebook.react.uimanager.UIManagerHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import rn.n;

/* JADX INFO: loaded from: classes3.dex */
@ReactModule(name = "NativeAnimatedModule")
@Metadata(d1 = {"\u0000\u0097\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\b\t\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005*\u00015\b\u0007\u0018\u0000 l2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0004ijklB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\b\u0010\u001b\u001a\u00020\u0018H\u0016J\u0010\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u0018H\u0016J\u0014\u0010 \u001a\u00020\u00182\n\u0010!\u001a\u00060\"R\u00020\u0000H\u0002J\u0014\u0010#\u001a\u00020\u00182\n\u0010!\u001a\u00060\"R\u00020\u0000H\u0002J\u0014\u0010$\u001a\u00020\u00182\n\u0010!\u001a\u00060\"R\u00020\u0000H\u0002J\u0010\u0010%\u001a\u00020\u00182\u0006\u0010&\u001a\u00020'H\u0016J\u0010\u0010(\u001a\u00020\u00182\u0006\u0010&\u001a\u00020'H\u0016J\u0010\u0010)\u001a\u00020\u00182\u0006\u0010&\u001a\u00020'H\u0016J\u0010\u0010*\u001a\u00020\u00182\u0006\u0010&\u001a\u00020'H\u0017J\u0010\u0010+\u001a\u00020\u00182\u0006\u0010&\u001a\u00020'H\u0017J\b\u0010,\u001a\u00020\u0018H\u0016J\b\u0010-\u001a\u00020\u0018H\u0016J\b\u00107\u001a\u00020\u0018H\u0002J\b\u00108\u001a\u00020\u0018H\u0002J\u0010\u00109\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010:\u001a\u00020\u0018H\u0016J\b\u0010;\u001a\u00020\u0018H\u0016J\u0018\u0010<\u001a\u00020\u00182\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@H\u0016J\u0018\u0010A\u001a\u00020\u00182\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@H\u0016J\u0010\u0010B\u001a\u00020\u00182\u0006\u0010=\u001a\u00020>H\u0016J\u0010\u0010C\u001a\u00020\u00182\u0006\u0010=\u001a\u00020>H\u0016J\u0010\u0010D\u001a\u00020\u00182\u0006\u0010=\u001a\u00020>H\u0016J\u0018\u0010E\u001a\u00020\u00182\u0006\u0010=\u001a\u00020>2\u0006\u0010F\u001a\u00020>H\u0016J\u0018\u0010G\u001a\u00020\u00182\u0006\u0010=\u001a\u00020>2\u0006\u0010F\u001a\u00020>H\u0016J\u0010\u0010H\u001a\u00020\u00182\u0006\u0010=\u001a\u00020>H\u0016J\u0010\u0010I\u001a\u00020\u00182\u0006\u0010=\u001a\u00020>H\u0016J(\u0010J\u001a\u00020\u00182\u0006\u0010K\u001a\u00020>2\u0006\u0010L\u001a\u00020>2\u0006\u0010M\u001a\u00020@2\u0006\u0010N\u001a\u00020OH\u0016J\u0010\u0010P\u001a\u00020\u00182\u0006\u0010K\u001a\u00020>H\u0016J\u0018\u0010Q\u001a\u00020\u00182\u0006\u0010R\u001a\u00020>2\u0006\u0010S\u001a\u00020>H\u0016J\u0018\u0010T\u001a\u00020\u00182\u0006\u0010R\u001a\u00020>2\u0006\u0010S\u001a\u00020>H\u0016J\u0018\u0010U\u001a\u00020\u00182\u0006\u0010L\u001a\u00020>2\u0006\u0010V\u001a\u00020>H\u0016J\u0018\u0010W\u001a\u00020\u00182\u0006\u0010L\u001a\u00020>2\u0006\u0010V\u001a\u00020>H\u0016J\u0010\u0010X\u001a\u00020\u00182\u0006\u0010L\u001a\u00020>H\u0016J \u0010Y\u001a\u00020\u00182\u0006\u0010V\u001a\u00020>2\u0006\u0010Z\u001a\u00020[2\u0006\u0010\\\u001a\u00020@H\u0016J \u0010]\u001a\u00020\u00182\u0006\u0010V\u001a\u00020>2\u0006\u0010Z\u001a\u00020[2\u0006\u0010^\u001a\u00020>H\u0016J\u0010\u0010_\u001a\u00020\u00182\u0006\u0010Z\u001a\u00020[H\u0016J\u0010\u0010`\u001a\u00020\u00182\u0006\u0010a\u001a\u00020>H\u0016J\u0018\u0010b\u001a\u00020\u00182\u0006\u0010c\u001a\u00020>2\u0006\u0010d\u001a\u00020OH\u0016J\b\u0010e\u001a\u00020\u0018H\u0016J\u0010\u0010f\u001a\u00020\u00182\u0006\u0010g\u001a\u00020hH\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00060\fR\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u00060\fR\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010.\u001a\u0004\u0018\u00010\u00102\b\u0010.\u001a\u0004\u0018\u00010\u00108F@GX\u0086\u000e¢\u0006\f\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u000e\u00103\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00104\u001a\u000205X\u0082\u0004¢\u0006\u0004\n\u0002\u00106¨\u0006m"}, d2 = {"Lcom/facebook/react/animated/NativeAnimatedModule;", "Lcom/facebook/fbreact/specs/NativeAnimatedModuleSpec;", "Lcom/facebook/react/bridge/LifecycleEventListener;", "Lcom/facebook/react/bridge/UIManagerListener;", "Lcom/facebook/react/bridge/ScrollEndedListener;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "reactChoreographer", "Lcom/facebook/react/modules/core/ReactChoreographer;", "operations", "Lcom/facebook/react/animated/NativeAnimatedModule$ConcurrentOperationQueue;", "preOperations", "nodesManagerRef", "Ljava/util/concurrent/atomic/AtomicReference;", "Lcom/facebook/react/animated/NativeAnimatedNodesManager;", "batchingControlledByJS", "", "currentFrameNumber", "", "currentBatchNumber", "initializedForFabric", "userDrivenScrollEnded", "", "viewTag", "", "initialize", "onScrollEnded", "scrollView", "Landroid/view/ViewGroup;", "onHostResume", "addOperation", "operation", "Lcom/facebook/react/animated/NativeAnimatedModule$UIThreadOperation;", "addUnbatchedOperation", "addPreOperation", "didScheduleMountItems", "uiManager", "Lcom/facebook/react/bridge/UIManager;", "willMountItems", "didMountItems", "didDispatchMountItems", "willDispatchViewUpdates", "onHostPause", "onHostDestroy", "nodesManager", "getNodesManager", "()Lcom/facebook/react/animated/NativeAnimatedNodesManager;", "setNodesManager", "(Lcom/facebook/react/animated/NativeAnimatedNodesManager;)V", "enqueuedAnimationOnFrame", "animatedFrameCallback", "com/facebook/react/animated/NativeAnimatedModule$animatedFrameCallback$1", "Lcom/facebook/react/animated/NativeAnimatedModule$animatedFrameCallback$1;", "clearFrameCallback", "enqueueFrameCallback", "initializeLifecycleEventListenersForViewTag", "startOperationBatch", "finishOperationBatch", "createAnimatedNode", "tagDouble", "", "config", "Lcom/facebook/react/bridge/ReadableMap;", "updateAnimatedNodeConfig", "startListeningToAnimatedNodeValue", "stopListeningToAnimatedNodeValue", "dropAnimatedNode", "setAnimatedNodeValue", "value", "setAnimatedNodeOffset", "flattenAnimatedNodeOffset", "extractAnimatedNodeOffset", "startAnimatingNode", "animationIdDouble", "animatedNodeTagDouble", "animationConfig", "endCallback", "Lcom/facebook/react/bridge/Callback;", "stopAnimation", "connectAnimatedNodes", "parentNodeTagDouble", "childNodeTagDouble", "disconnectAnimatedNodes", "connectAnimatedNodeToView", "viewTagDouble", "disconnectAnimatedNodeFromView", "restoreDefaultValues", "addAnimatedEventToView", "eventName", "", "eventMapping", "removeAnimatedEventFromView", "animatedValueTagDouble", "addListener", "removeListeners", "count", "getValue", "animatedValueNodeTagDouble", "callback", "invalidate", "queueAndExecuteBatchedOperations", "opsAndArgs", "Lcom/facebook/react/bridge/ReadableArray;", "BatchExecutionOpCodes", "UIThreadOperation", "ConcurrentOperationQueue", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNativeAnimatedModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NativeAnimatedModule.kt\ncom/facebook/react/animated/NativeAnimatedModule\n+ 2 ReadableMapBuilder.kt\ncom/facebook/react/bridge/ReadableMapBuilderKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1049:1\n30#2,3:1050\n30#2,3:1055\n1869#3,2:1053\n*S KotlinDebug\n*F\n+ 1 NativeAnimatedModule.kt\ncom/facebook/react/animated/NativeAnimatedModule\n*L\n236#1:1050,3\n473#1:1055,3\n236#1:1053,2\n*E\n"})
public final class NativeAnimatedModule extends NativeAnimatedModuleSpec implements LifecycleEventListener, UIManagerListener, ScrollEndedListener {
    public static final boolean ANIMATED_MODULE_DEBUG = false;

    @NotNull
    public static final String NAME = "NativeAnimatedModule";

    @NotNull
    private final NativeAnimatedModule$animatedFrameCallback$1 animatedFrameCallback;
    private boolean batchingControlledByJS;
    private volatile long currentBatchNumber;
    private volatile long currentFrameNumber;
    private boolean enqueuedAnimationOnFrame;
    private boolean initializedForFabric;

    @NotNull
    private final AtomicReference<NativeAnimatedNodesManager> nodesManagerRef;

    @NotNull
    private final ConcurrentOperationQueue operations;

    @NotNull
    private final ConcurrentOperationQueue preOperations;

    @NotNull
    private final ReactChoreographer reactChoreographer;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0019\b\u0082\u0081\u0002\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a¨\u0006\u001c"}, d2 = {"Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "OP_CODE_CREATE_ANIMATED_NODE", "OP_CODE_UPDATE_ANIMATED_NODE_CONFIG", "OP_CODE_GET_VALUE", "OP_START_LISTENING_TO_ANIMATED_NODE_VALUE", "OP_STOP_LISTENING_TO_ANIMATED_NODE_VALUE", "OP_CODE_CONNECT_ANIMATED_NODES", "OP_CODE_DISCONNECT_ANIMATED_NODES", "OP_CODE_START_ANIMATING_NODE", "OP_CODE_STOP_ANIMATION", "OP_CODE_SET_ANIMATED_NODE_VALUE", "OP_CODE_SET_ANIMATED_NODE_OFFSET", "OP_CODE_FLATTEN_ANIMATED_NODE_OFFSET", "OP_CODE_EXTRACT_ANIMATED_NODE_OFFSET", "OP_CODE_CONNECT_ANIMATED_NODE_TO_VIEW", "OP_CODE_DISCONNECT_ANIMATED_NODE_FROM_VIEW", "OP_CODE_RESTORE_DEFAULT_VALUES", "OP_CODE_DROP_ANIMATED_NODE", "OP_CODE_ADD_ANIMATED_EVENT_TO_VIEW", "OP_CODE_REMOVE_ANIMATED_EVENT_FROM_VIEW", "OP_CODE_ADD_LISTENER", "OP_CODE_REMOVE_LISTENERS", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum BatchExecutionOpCodes {
        OP_CODE_CREATE_ANIMATED_NODE(1),
        OP_CODE_UPDATE_ANIMATED_NODE_CONFIG(2),
        OP_CODE_GET_VALUE(3),
        OP_START_LISTENING_TO_ANIMATED_NODE_VALUE(4),
        OP_STOP_LISTENING_TO_ANIMATED_NODE_VALUE(5),
        OP_CODE_CONNECT_ANIMATED_NODES(6),
        OP_CODE_DISCONNECT_ANIMATED_NODES(7),
        OP_CODE_START_ANIMATING_NODE(8),
        OP_CODE_STOP_ANIMATION(9),
        OP_CODE_SET_ANIMATED_NODE_VALUE(10),
        OP_CODE_SET_ANIMATED_NODE_OFFSET(11),
        OP_CODE_FLATTEN_ANIMATED_NODE_OFFSET(12),
        OP_CODE_EXTRACT_ANIMATED_NODE_OFFSET(13),
        OP_CODE_CONNECT_ANIMATED_NODE_TO_VIEW(14),
        OP_CODE_DISCONNECT_ANIMATED_NODE_FROM_VIEW(15),
        OP_CODE_RESTORE_DEFAULT_VALUES(16),
        OP_CODE_DROP_ANIMATED_NODE(17),
        OP_CODE_ADD_ANIMATED_EVENT_TO_VIEW(18),
        OP_CODE_REMOVE_ANIMATED_EVENT_FROM_VIEW(19),
        OP_CODE_ADD_LISTENER(20),
        OP_CODE_REMOVE_LISTENERS(21);

        private static BatchExecutionOpCodes[] valueMap;
        private static final /* synthetic */ EnumEntries $ENTRIES = b.l(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0007R\u0018\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes$Companion;", "", "<init>", "()V", "valueMap", "", "Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;", "[Lcom/facebook/react/animated/NativeAnimatedModule$BatchExecutionOpCodes;", "fromId", StackTraceHelper.ID_KEY, "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final BatchExecutionOpCodes fromId(int id2) {
                BatchExecutionOpCodes[] batchExecutionOpCodesArrValues = BatchExecutionOpCodes.valueMap;
                if (batchExecutionOpCodesArrValues == null) {
                    batchExecutionOpCodesArrValues = BatchExecutionOpCodes.values();
                }
                if (BatchExecutionOpCodes.valueMap == null) {
                    BatchExecutionOpCodes.valueMap = batchExecutionOpCodesArrValues;
                }
                return batchExecutionOpCodesArrValues[id2 - 1];
            }

            private Companion() {
            }
        }

        BatchExecutionOpCodes(int i7) {
        }

        @NotNull
        public static final BatchExecutionOpCodes fromId(int i7) {
            return INSTANCE.fromId(i7);
        }

        @NotNull
        public static EnumEntries getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\f\u001a\u00020\r2\n\u0010\u000e\u001a\u00060\u0006R\u00020\u0007H\u0007J\u001a\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007J\u001c\u0010\u0014\u001a\u000e\u0012\b\u0012\u00060\u0006R\u00020\u0007\u0018\u00010\u00152\u0006\u0010\u0010\u001a\u00020\u0011H\u0007R\u0018\u0010\u0004\u001a\f\u0012\b\u0012\u00060\u0006R\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0018\u00010\u0006R\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\b\t\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/facebook/react/animated/NativeAnimatedModule$ConcurrentOperationQueue;", "", "<init>", "(Lcom/facebook/react/animated/NativeAnimatedModule;)V", "queue", "Ljava/util/Queue;", "Lcom/facebook/react/animated/NativeAnimatedModule$UIThreadOperation;", "Lcom/facebook/react/animated/NativeAnimatedModule;", "peekedOperation", "isEmpty", "", "()Z", "add", "", "operation", "executeBatch", "maxBatchNumber", "", "nodesManager", "Lcom/facebook/react/animated/NativeAnimatedNodesManager;", "drainQueueIntoList", "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class ConcurrentOperationQueue {
        private UIThreadOperation peekedOperation;

        @NotNull
        private final Queue<UIThreadOperation> queue;

        public ConcurrentOperationQueue() {
            this.queue = Build.VERSION.SDK_INT == 31 ? new LinkedBlockingQueue<>() : new ConcurrentLinkedQueue<>();
        }

        public final void add(@NotNull UIThreadOperation operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            this.queue.add(operation);
        }

        /* JADX WARN: Code duplicated, block: B:15:0x002a  */
        /* JADX WARN: Code duplicated, block: B:19:0x0035 A[LOOP:0: B:6:0x000d->B:19:0x0035, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:20:0x0032 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:22:0x0029 A[SYNTHETIC] */
        public final List<UIThreadOperation> drainQueueIntoList(long maxBatchNumber) {
            UIThreadOperation uIThreadOperationPoll;
            if (isEmpty()) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            while (true) {
                UIThreadOperation uIThreadOperation = this.peekedOperation;
                if (uIThreadOperation == null) {
                    uIThreadOperationPoll = this.queue.poll();
                    if (uIThreadOperationPoll == null) {
                        if (uIThreadOperationPoll.getBatchNumber() > maxBatchNumber) {
                            this.peekedOperation = uIThreadOperationPoll;
                            return arrayList;
                        }
                        arrayList.add(uIThreadOperationPoll);
                    }
                } else if (uIThreadOperation.getBatchNumber() <= maxBatchNumber) {
                    arrayList.add(uIThreadOperation);
                    this.peekedOperation = null;
                    uIThreadOperationPoll = this.queue.poll();
                    if (uIThreadOperationPoll == null) {
                        if (uIThreadOperationPoll.getBatchNumber() > maxBatchNumber) {
                            this.peekedOperation = uIThreadOperationPoll;
                            return arrayList;
                        }
                        arrayList.add(uIThreadOperationPoll);
                    }
                }
                return arrayList;
            }
        }

        public final void executeBatch(long maxBatchNumber, NativeAnimatedNodesManager nodesManager) {
            List<UIThreadOperation> listDrainQueueIntoList = drainQueueIntoList(maxBatchNumber);
            if (listDrainQueueIntoList != null) {
                for (UIThreadOperation uIThreadOperation : listDrainQueueIntoList) {
                    if (nodesManager == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    uIThreadOperation.execute(nodesManager);
                }
            }
        }

        public final boolean isEmpty() {
            return this.queue.isEmpty() && this.peekedOperation == null;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b¢\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/facebook/react/animated/NativeAnimatedModule$UIThreadOperation;", "", "<init>", "(Lcom/facebook/react/animated/NativeAnimatedModule;)V", "execute", "", "animatedNodesManager", "Lcom/facebook/react/animated/NativeAnimatedNodesManager;", "batchNumber", "", "getBatchNumber", "()J", "setBatchNumber", "(J)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public abstract class UIThreadOperation {
        private long batchNumber = -1;

        public UIThreadOperation() {
        }

        public abstract void execute(@NotNull NativeAnimatedNodesManager animatedNodesManager);

        public final long getBatchNumber() {
            return this.batchNumber;
        }

        public final void setBatchNumber(long j) {
            this.batchNumber = j;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BatchExecutionOpCodes.values().length];
            try {
                iArr[BatchExecutionOpCodes.OP_CODE_GET_VALUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BatchExecutionOpCodes.OP_START_LISTENING_TO_ANIMATED_NODE_VALUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BatchExecutionOpCodes.OP_STOP_LISTENING_TO_ANIMATED_NODE_VALUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BatchExecutionOpCodes.OP_CODE_STOP_ANIMATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BatchExecutionOpCodes.OP_CODE_FLATTEN_ANIMATED_NODE_OFFSET.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BatchExecutionOpCodes.OP_CODE_EXTRACT_ANIMATED_NODE_OFFSET.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BatchExecutionOpCodes.OP_CODE_RESTORE_DEFAULT_VALUES.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[BatchExecutionOpCodes.OP_CODE_DROP_ANIMATED_NODE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[BatchExecutionOpCodes.OP_CODE_ADD_LISTENER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[BatchExecutionOpCodes.OP_CODE_REMOVE_LISTENERS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[BatchExecutionOpCodes.OP_CODE_CREATE_ANIMATED_NODE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[BatchExecutionOpCodes.OP_CODE_UPDATE_ANIMATED_NODE_CONFIG.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[BatchExecutionOpCodes.OP_CODE_CONNECT_ANIMATED_NODES.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[BatchExecutionOpCodes.OP_CODE_DISCONNECT_ANIMATED_NODES.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[BatchExecutionOpCodes.OP_CODE_SET_ANIMATED_NODE_VALUE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[BatchExecutionOpCodes.OP_CODE_SET_ANIMATED_NODE_OFFSET.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[BatchExecutionOpCodes.OP_CODE_DISCONNECT_ANIMATED_NODE_FROM_VIEW.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[BatchExecutionOpCodes.OP_CODE_START_ANIMATING_NODE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[BatchExecutionOpCodes.OP_CODE_REMOVE_ANIMATED_EVENT_FROM_VIEW.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[BatchExecutionOpCodes.OP_CODE_CONNECT_ANIMATED_NODE_TO_VIEW.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[BatchExecutionOpCodes.OP_CODE_ADD_ANIMATED_EVENT_TO_VIEW.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.animated.NativeAnimatedModule$queueAndExecuteBatchedOperations$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00060\u0001R\u00020\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/facebook/react/animated/NativeAnimatedModule$queueAndExecuteBatchedOperations$1", "Lcom/facebook/react/animated/NativeAnimatedModule$UIThreadOperation;", "Lcom/facebook/react/animated/NativeAnimatedModule;", "execute", "", "animatedNodesManager", "Lcom/facebook/react/animated/NativeAnimatedNodesManager;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nNativeAnimatedModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NativeAnimatedModule.kt\ncom/facebook/react/animated/NativeAnimatedModule$queueAndExecuteBatchedOperations$1\n+ 2 ReadableMapBuilder.kt\ncom/facebook/react/bridge/ReadableMapBuilderKt\n*L\n1#1,1049:1\n30#2,3:1050\n*S KotlinDebug\n*F\n+ 1 NativeAnimatedModule.kt\ncom/facebook/react/animated/NativeAnimatedModule$queueAndExecuteBatchedOperations$1\n*L\n940#1:1050,3\n*E\n"})
    public static final class C02351 extends UIThreadOperation {
        final /* synthetic */ int $opBufferSize;
        final /* synthetic */ ReadableArray $opsAndArgs;

        /* JADX INFO: renamed from: com.facebook.react.animated.NativeAnimatedModule$queueAndExecuteBatchedOperations$1$WhenMappings */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[BatchExecutionOpCodes.values().length];
                try {
                    iArr[BatchExecutionOpCodes.OP_CODE_CREATE_ANIMATED_NODE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[BatchExecutionOpCodes.OP_CODE_UPDATE_ANIMATED_NODE_CONFIG.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[BatchExecutionOpCodes.OP_CODE_GET_VALUE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[BatchExecutionOpCodes.OP_START_LISTENING_TO_ANIMATED_NODE_VALUE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[BatchExecutionOpCodes.OP_STOP_LISTENING_TO_ANIMATED_NODE_VALUE.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[BatchExecutionOpCodes.OP_CODE_CONNECT_ANIMATED_NODES.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[BatchExecutionOpCodes.OP_CODE_DISCONNECT_ANIMATED_NODES.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[BatchExecutionOpCodes.OP_CODE_START_ANIMATING_NODE.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[BatchExecutionOpCodes.OP_CODE_STOP_ANIMATION.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[BatchExecutionOpCodes.OP_CODE_SET_ANIMATED_NODE_VALUE.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[BatchExecutionOpCodes.OP_CODE_SET_ANIMATED_NODE_OFFSET.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[BatchExecutionOpCodes.OP_CODE_FLATTEN_ANIMATED_NODE_OFFSET.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[BatchExecutionOpCodes.OP_CODE_EXTRACT_ANIMATED_NODE_OFFSET.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[BatchExecutionOpCodes.OP_CODE_CONNECT_ANIMATED_NODE_TO_VIEW.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[BatchExecutionOpCodes.OP_CODE_DISCONNECT_ANIMATED_NODE_FROM_VIEW.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[BatchExecutionOpCodes.OP_CODE_RESTORE_DEFAULT_VALUES.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr[BatchExecutionOpCodes.OP_CODE_DROP_ANIMATED_NODE.ordinal()] = 17;
                } catch (NoSuchFieldError unused17) {
                }
                try {
                    iArr[BatchExecutionOpCodes.OP_CODE_ADD_ANIMATED_EVENT_TO_VIEW.ordinal()] = 18;
                } catch (NoSuchFieldError unused18) {
                }
                try {
                    iArr[BatchExecutionOpCodes.OP_CODE_REMOVE_ANIMATED_EVENT_FROM_VIEW.ordinal()] = 19;
                } catch (NoSuchFieldError unused19) {
                }
                try {
                    iArr[BatchExecutionOpCodes.OP_CODE_ADD_LISTENER.ordinal()] = 20;
                } catch (NoSuchFieldError unused20) {
                }
                try {
                    iArr[BatchExecutionOpCodes.OP_CODE_REMOVE_LISTENERS.ordinal()] = 21;
                } catch (NoSuchFieldError unused21) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02351(int i7, ReadableArray readableArray) {
            super();
            this.$opBufferSize = i7;
            this.$opsAndArgs = readableArray;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void execute$lambda$1(NativeAnimatedModule nativeAnimatedModule, int i7, double d6, double d7) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(writableMapCreateMap);
            readableMapBuilder.put("tag", i7);
            readableMapBuilder.put("value", d6);
            readableMapBuilder.put("offset", d7);
            ReactApplicationContext reactApplicationContextIfActiveOrWarn = nativeAnimatedModule.getReactApplicationContextIfActiveOrWarn();
            if (reactApplicationContextIfActiveOrWarn != null) {
                reactApplicationContextIfActiveOrWarn.emitDeviceEvent("onAnimatedValueUpdate", writableMapCreateMap);
            }
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
        public void execute(NativeAnimatedNodesManager animatedNodesManager) {
            Intrinsics.checkNotNullParameter(animatedNodesManager, "animatedNodesManager");
            NativeAnimatedModule.this.getReactApplicationContextIfActiveOrWarn();
            int i7 = 0;
            while (i7 < this.$opBufferSize) {
                int i10 = i7 + 1;
                switch (WhenMappings.$EnumSwitchMapping$0[BatchExecutionOpCodes.INSTANCE.fromId(this.$opsAndArgs.getInt(i7)).ordinal()]) {
                    case 1:
                        int i11 = i7 + 2;
                        int i12 = this.$opsAndArgs.getInt(i10);
                        i7 += 3;
                        ReadableMap map = this.$opsAndArgs.getMap(i11);
                        if (map == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        animatedNodesManager.createAnimatedNode(i12, map);
                        break;
                        break;
                    case 2:
                        int i13 = i7 + 2;
                        int i14 = this.$opsAndArgs.getInt(i10);
                        i7 += 3;
                        ReadableMap map2 = this.$opsAndArgs.getMap(i13);
                        if (map2 == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        animatedNodesManager.updateAnimatedNodeConfig(i14, map2);
                        break;
                        break;
                    case 3:
                        i7 += 2;
                        animatedNodesManager.getValue(this.$opsAndArgs.getInt(i10), null);
                        break;
                    case 4:
                        i7 += 2;
                        int i15 = this.$opsAndArgs.getInt(i10);
                        animatedNodesManager.startListeningToAnimatedNodeValue(i15, new a(NativeAnimatedModule.this, i15, 1));
                        break;
                    case 5:
                        i7 += 2;
                        animatedNodesManager.stopListeningToAnimatedNodeValue(this.$opsAndArgs.getInt(i10));
                        break;
                    case 6:
                        int i16 = i7 + 2;
                        i7 += 3;
                        animatedNodesManager.connectAnimatedNodes(this.$opsAndArgs.getInt(i10), this.$opsAndArgs.getInt(i16));
                        break;
                    case 7:
                        int i17 = i7 + 2;
                        i7 += 3;
                        animatedNodesManager.disconnectAnimatedNodes(this.$opsAndArgs.getInt(i10), this.$opsAndArgs.getInt(i17));
                        break;
                    case 8:
                        int i18 = this.$opsAndArgs.getInt(i10);
                        int i19 = i7 + 3;
                        int i20 = this.$opsAndArgs.getInt(i7 + 2);
                        i7 += 4;
                        ReadableMap map3 = this.$opsAndArgs.getMap(i19);
                        if (map3 == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        animatedNodesManager.startAnimatingNode(i18, i20, map3, null);
                        break;
                        break;
                    case 9:
                        i7 += 2;
                        animatedNodesManager.stopAnimation(this.$opsAndArgs.getInt(i10));
                        break;
                    case 10:
                        int i21 = i7 + 2;
                        i7 += 3;
                        animatedNodesManager.setAnimatedNodeValue(this.$opsAndArgs.getInt(i10), this.$opsAndArgs.getDouble(i21));
                        break;
                    case 11:
                        int i22 = i7 + 2;
                        i7 += 3;
                        animatedNodesManager.setAnimatedNodeOffset(this.$opsAndArgs.getInt(i10), this.$opsAndArgs.getDouble(i22));
                        break;
                    case 12:
                        i7 += 2;
                        animatedNodesManager.flattenAnimatedNodeOffset(this.$opsAndArgs.getInt(i10));
                        break;
                    case 13:
                        i7 += 2;
                        animatedNodesManager.extractAnimatedNodeOffset(this.$opsAndArgs.getInt(i10));
                        break;
                    case 14:
                        int i23 = i7 + 2;
                        i7 += 3;
                        animatedNodesManager.connectAnimatedNodeToView(this.$opsAndArgs.getInt(i10), this.$opsAndArgs.getInt(i23));
                        break;
                    case 15:
                        int i24 = i7 + 2;
                        i7 += 3;
                        animatedNodesManager.disconnectAnimatedNodeFromView(this.$opsAndArgs.getInt(i10), this.$opsAndArgs.getInt(i24));
                        break;
                    case 16:
                        i7 += 2;
                        animatedNodesManager.restoreDefaultValues(this.$opsAndArgs.getInt(i10));
                        break;
                    case 17:
                        i7 += 2;
                        animatedNodesManager.dropAnimatedNode(this.$opsAndArgs.getInt(i10));
                        break;
                    case 18:
                        int i25 = this.$opsAndArgs.getInt(i10);
                        int i26 = i7 + 3;
                        String string = this.$opsAndArgs.getString(i7 + 2);
                        if (string == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        i7 += 4;
                        ReadableMap map4 = this.$opsAndArgs.getMap(i26);
                        if (map4 == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        animatedNodesManager.addAnimatedEventToView(i25, string, map4);
                        break;
                        break;
                    case 19:
                        int i27 = this.$opsAndArgs.getInt(i10);
                        int i28 = i7 + 3;
                        String string2 = this.$opsAndArgs.getString(i7 + 2);
                        if (string2 == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        i7 += 4;
                        animatedNodesManager.removeAnimatedEventFromView(i27, string2, this.$opsAndArgs.getInt(i28));
                        break;
                        break;
                    case 20:
                    case 21:
                        i7 += 2;
                        break;
                    default:
                        throw new n();
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.facebook.react.animated.NativeAnimatedModule$animatedFrameCallback$1] */
    public NativeAnimatedModule(@NotNull final ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.reactChoreographer = ReactChoreographer.INSTANCE.getInstance();
        this.operations = new ConcurrentOperationQueue();
        this.preOperations = new ConcurrentOperationQueue();
        this.nodesManagerRef = new AtomicReference<>();
        this.animatedFrameCallback = new GuardedFrameCallback(reactContext) { // from class: com.facebook.react.animated.NativeAnimatedModule$animatedFrameCallback$1
            @Override // com.facebook.react.uimanager.GuardedFrameCallback
            public void doFrameGuarded(long frameTimeNanos) {
                try {
                    this.enqueuedAnimationOnFrame = false;
                    NativeAnimatedNodesManager nodesManager = this.getNodesManager();
                    if (nodesManager == null) {
                        return;
                    }
                    if (nodesManager.hasActiveAnimations()) {
                        nodesManager.runUpdates(frameTimeNanos);
                    }
                    this.enqueueFrameCallback();
                } catch (Exception e10) {
                    throw new RuntimeException(e10);
                }
            }
        };
    }

    private final void addOperation(UIThreadOperation operation) {
        operation.setBatchNumber(this.currentBatchNumber);
        this.operations.add(operation);
    }

    private final void addPreOperation(UIThreadOperation operation) {
        operation.setBatchNumber(this.currentBatchNumber);
        this.preOperations.add(operation);
    }

    private final void addUnbatchedOperation(UIThreadOperation operation) {
        operation.setBatchNumber(-1L);
        this.operations.add(operation);
    }

    private final void clearFrameCallback() {
        this.reactChoreographer.removeFrameCallback(ReactChoreographer.CallbackType.NATIVE_ANIMATED_MODULE, this.animatedFrameCallback);
        this.enqueuedAnimationOnFrame = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void enqueueFrameCallback() {
        if (this.enqueuedAnimationOnFrame) {
            return;
        }
        this.reactChoreographer.postFrameCallback(ReactChoreographer.CallbackType.NATIVE_ANIMATED_MODULE, this.animatedFrameCallback);
        this.enqueuedAnimationOnFrame = true;
    }

    private final void initializeLifecycleEventListenersForViewTag(int viewTag) {
        ReactApplicationContext reactApplicationContextIfActiveOrWarn;
        UIManager uIManager;
        NativeAnimatedNodesManager nodesManager = getNodesManager();
        if (nodesManager != null) {
            nodesManager.initializeEventListenerForUIManagerType(2);
        } else {
            ReactSoftExceptionLogger.logSoftException("NativeAnimatedModule", new RuntimeException("initializeLifecycleEventListenersForViewTag could not get NativeAnimatedNodesManager"));
        }
        if (this.initializedForFabric || (reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn()) == null || (uIManager = UIManagerHelper.getUIManager(reactApplicationContextIfActiveOrWarn, 2)) == null) {
            return;
        }
        uIManager.addUIManagerEventListener(this);
        this.initializedForFabric = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startListeningToAnimatedNodeValue$lambda$4(NativeAnimatedModule nativeAnimatedModule, int i7, double d6, double d7) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(writableMapCreateMap);
        readableMapBuilder.put("tag", i7);
        readableMapBuilder.put("value", d6);
        readableMapBuilder.put("offset", d7);
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = nativeAnimatedModule.getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            reactApplicationContextIfActiveOrWarn.emitDeviceEvent("onAnimatedValueUpdate", writableMapCreateMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit userDrivenScrollEnded$lambda$2$lambda$1(Set set, ReadableArrayBuilder putArray) {
        Intrinsics.checkNotNullParameter(putArray, "$this$putArray");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            putArray.add(((Number) it.next()).intValue());
        }
        return Unit.f14616a;
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void addAnimatedEventToView(double viewTagDouble, @NotNull final String eventName, @NotNull final ReadableMap eventMapping) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(eventMapping, "eventMapping");
        final int i7 = (int) viewTagDouble;
        initializeLifecycleEventListenersForViewTag(i7);
        addOperation(new UIThreadOperation(this) { // from class: com.facebook.react.animated.NativeAnimatedModule.addAnimatedEventToView.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager animatedNodesManager) {
                Intrinsics.checkNotNullParameter(animatedNodesManager, "animatedNodesManager");
                animatedNodesManager.addAnimatedEventToView(i7, eventName, eventMapping);
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void addListener(@NotNull String eventName) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void connectAnimatedNodeToView(double animatedNodeTagDouble, double viewTagDouble) {
        final int i7 = (int) animatedNodeTagDouble;
        final int i10 = (int) viewTagDouble;
        initializeLifecycleEventListenersForViewTag(i10);
        addOperation(new UIThreadOperation(this) { // from class: com.facebook.react.animated.NativeAnimatedModule.connectAnimatedNodeToView.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager animatedNodesManager) {
                Intrinsics.checkNotNullParameter(animatedNodesManager, "animatedNodesManager");
                animatedNodesManager.connectAnimatedNodeToView(i7, i10);
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void connectAnimatedNodes(double parentNodeTagDouble, double childNodeTagDouble) {
        final int i7 = (int) parentNodeTagDouble;
        final int i10 = (int) childNodeTagDouble;
        addOperation(new UIThreadOperation(this) { // from class: com.facebook.react.animated.NativeAnimatedModule.connectAnimatedNodes.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager animatedNodesManager) {
                Intrinsics.checkNotNullParameter(animatedNodesManager, "animatedNodesManager");
                animatedNodesManager.connectAnimatedNodes(i7, i10);
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void createAnimatedNode(double tagDouble, @NotNull final ReadableMap config) {
        Intrinsics.checkNotNullParameter(config, "config");
        final int i7 = (int) tagDouble;
        addOperation(new UIThreadOperation(this) { // from class: com.facebook.react.animated.NativeAnimatedModule.createAnimatedNode.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager animatedNodesManager) {
                Intrinsics.checkNotNullParameter(animatedNodesManager, "animatedNodesManager");
                animatedNodesManager.createAnimatedNode(i7, config);
            }
        });
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didDispatchMountItems(@NotNull UIManager uiManager) {
        Intrinsics.checkNotNullParameter(uiManager, "uiManager");
        long j = this.currentBatchNumber - 1;
        if (!this.batchingControlledByJS) {
            this.currentFrameNumber++;
            if (this.currentFrameNumber - this.currentBatchNumber > 2) {
                this.currentBatchNumber = this.currentFrameNumber;
                j = this.currentBatchNumber;
            }
        }
        this.preOperations.executeBatch(j, getNodesManager());
        this.operations.executeBatch(j, getNodesManager());
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didMountItems(@NotNull UIManager uiManager) {
        Intrinsics.checkNotNullParameter(uiManager, "uiManager");
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didScheduleMountItems(@NotNull UIManager uiManager) {
        Intrinsics.checkNotNullParameter(uiManager, "uiManager");
        this.currentFrameNumber++;
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void disconnectAnimatedNodeFromView(double animatedNodeTagDouble, double viewTagDouble) {
        final int i7 = (int) animatedNodeTagDouble;
        final int i10 = (int) viewTagDouble;
        addOperation(new UIThreadOperation(this) { // from class: com.facebook.react.animated.NativeAnimatedModule.disconnectAnimatedNodeFromView.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager animatedNodesManager) {
                Intrinsics.checkNotNullParameter(animatedNodesManager, "animatedNodesManager");
                animatedNodesManager.disconnectAnimatedNodeFromView(i7, i10);
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void disconnectAnimatedNodes(double parentNodeTagDouble, double childNodeTagDouble) {
        final int i7 = (int) parentNodeTagDouble;
        final int i10 = (int) childNodeTagDouble;
        addOperation(new UIThreadOperation(this) { // from class: com.facebook.react.animated.NativeAnimatedModule.disconnectAnimatedNodes.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager animatedNodesManager) {
                Intrinsics.checkNotNullParameter(animatedNodesManager, "animatedNodesManager");
                animatedNodesManager.disconnectAnimatedNodes(i7, i10);
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void dropAnimatedNode(double tagDouble) {
        final int i7 = (int) tagDouble;
        addOperation(new UIThreadOperation(this) { // from class: com.facebook.react.animated.NativeAnimatedModule.dropAnimatedNode.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager animatedNodesManager) {
                Intrinsics.checkNotNullParameter(animatedNodesManager, "animatedNodesManager");
                animatedNodesManager.dropAnimatedNode(i7);
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void extractAnimatedNodeOffset(double tagDouble) {
        final int i7 = (int) tagDouble;
        addOperation(new UIThreadOperation(this) { // from class: com.facebook.react.animated.NativeAnimatedModule.extractAnimatedNodeOffset.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager animatedNodesManager) {
                Intrinsics.checkNotNullParameter(animatedNodesManager, "animatedNodesManager");
                animatedNodesManager.extractAnimatedNodeOffset(i7);
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void finishOperationBatch() {
        this.batchingControlledByJS = false;
        this.currentBatchNumber++;
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void flattenAnimatedNodeOffset(double tagDouble) {
        final int i7 = (int) tagDouble;
        addOperation(new UIThreadOperation(this) { // from class: com.facebook.react.animated.NativeAnimatedModule.flattenAnimatedNodeOffset.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager animatedNodesManager) {
                Intrinsics.checkNotNullParameter(animatedNodesManager, "animatedNodesManager");
                animatedNodesManager.flattenAnimatedNodeOffset(i7);
            }
        });
    }

    public final NativeAnimatedNodesManager getNodesManager() {
        ReactApplicationContext reactApplicationContextIfActiveOrWarn;
        if (this.nodesManagerRef.get() == null && (reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn()) != null) {
            AtomicReference<NativeAnimatedNodesManager> atomicReference = this.nodesManagerRef;
            NativeAnimatedNodesManager nativeAnimatedNodesManager = new NativeAnimatedNodesManager(reactApplicationContextIfActiveOrWarn);
            while (!atomicReference.compareAndSet(null, nativeAnimatedNodesManager) && atomicReference.get() == null) {
            }
        }
        return this.nodesManagerRef.get();
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void getValue(double animatedValueNodeTagDouble, @NotNull final Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        final int i7 = (int) animatedValueNodeTagDouble;
        addOperation(new UIThreadOperation(this) { // from class: com.facebook.react.animated.NativeAnimatedModule.getValue.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager animatedNodesManager) {
                Intrinsics.checkNotNullParameter(animatedNodesManager, "animatedNodesManager");
                animatedNodesManager.getValue(i7, callback);
            }
        });
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
        getReactApplicationContext().addLifecycleEventListener(this);
        getReactApplicationContext().getScrollEndedListeners().addListener(this);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        super.invalidate();
        getReactApplicationContext().getScrollEndedListeners().removeListener(this);
        getReactApplicationContext().removeLifecycleEventListener(this);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        clearFrameCallback();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        clearFrameCallback();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        enqueueFrameCallback();
    }

    @Override // com.facebook.react.bridge.ScrollEndedListener
    public void onScrollEnded(@NotNull ViewGroup scrollView) {
        Intrinsics.checkNotNullParameter(scrollView, "scrollView");
        userDrivenScrollEnded(scrollView.getId());
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void queueAndExecuteBatchedOperations(@NotNull ReadableArray opsAndArgs) {
        Intrinsics.checkNotNullParameter(opsAndArgs, "opsAndArgs");
        int size = opsAndArgs.size();
        int i7 = 0;
        while (i7 < size) {
            int i10 = i7 + 1;
            switch (WhenMappings.$EnumSwitchMapping$0[BatchExecutionOpCodes.INSTANCE.fromId(opsAndArgs.getInt(i7)).ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    i7 += 2;
                    continue;
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                    i7 += 3;
                    continue;
                case 18:
                case 19:
                    break;
                case 20:
                    int i11 = i7 + 2;
                    i7 += 3;
                    initializeLifecycleEventListenersForViewTag(opsAndArgs.getInt(i11));
                    continue;
                case 21:
                    initializeLifecycleEventListenersForViewTag(opsAndArgs.getInt(i10));
                    break;
                default:
                    throw new n();
            }
            i7 += 4;
        }
        startOperationBatch();
        addUnbatchedOperation(new C02351(size, opsAndArgs));
        finishOperationBatch();
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void removeAnimatedEventFromView(double viewTagDouble, @NotNull final String eventName, double animatedValueTagDouble) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        final int i7 = (int) viewTagDouble;
        final int i10 = (int) animatedValueTagDouble;
        addOperation(new UIThreadOperation(this) { // from class: com.facebook.react.animated.NativeAnimatedModule.removeAnimatedEventFromView.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager animatedNodesManager) {
                Intrinsics.checkNotNullParameter(animatedNodesManager, "animatedNodesManager");
                animatedNodesManager.removeAnimatedEventFromView(i7, eventName, i10);
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void removeListeners(double count) {
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void restoreDefaultValues(double animatedNodeTagDouble) {
        final int i7 = (int) animatedNodeTagDouble;
        addPreOperation(new UIThreadOperation(this) { // from class: com.facebook.react.animated.NativeAnimatedModule.restoreDefaultValues.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager animatedNodesManager) {
                Intrinsics.checkNotNullParameter(animatedNodesManager, "animatedNodesManager");
                animatedNodesManager.restoreDefaultValues(i7);
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void setAnimatedNodeOffset(double tagDouble, final double value) {
        final int i7 = (int) tagDouble;
        addOperation(new UIThreadOperation(this) { // from class: com.facebook.react.animated.NativeAnimatedModule.setAnimatedNodeOffset.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager animatedNodesManager) {
                Intrinsics.checkNotNullParameter(animatedNodesManager, "animatedNodesManager");
                animatedNodesManager.setAnimatedNodeOffset(i7, value);
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void setAnimatedNodeValue(double tagDouble, final double value) {
        final int i7 = (int) tagDouble;
        addOperation(new UIThreadOperation(this) { // from class: com.facebook.react.animated.NativeAnimatedModule.setAnimatedNodeValue.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager animatedNodesManager) {
                Intrinsics.checkNotNullParameter(animatedNodesManager, "animatedNodesManager");
                animatedNodesManager.setAnimatedNodeValue(i7, value);
            }
        });
    }

    @VisibleForTesting
    public final void setNodesManager(NativeAnimatedNodesManager nativeAnimatedNodesManager) {
        this.nodesManagerRef.set(nativeAnimatedNodesManager);
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void startAnimatingNode(double animationIdDouble, double animatedNodeTagDouble, @NotNull final ReadableMap animationConfig, @NotNull final Callback endCallback) {
        Intrinsics.checkNotNullParameter(animationConfig, "animationConfig");
        Intrinsics.checkNotNullParameter(endCallback, "endCallback");
        final int i7 = (int) animationIdDouble;
        final int i10 = (int) animatedNodeTagDouble;
        addUnbatchedOperation(new UIThreadOperation(this) { // from class: com.facebook.react.animated.NativeAnimatedModule.startAnimatingNode.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager animatedNodesManager) {
                Intrinsics.checkNotNullParameter(animatedNodesManager, "animatedNodesManager");
                animatedNodesManager.startAnimatingNode(i7, i10, animationConfig, endCallback);
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void startListeningToAnimatedNodeValue(double tagDouble) {
        final int i7 = (int) tagDouble;
        final a aVar = new a(this, i7, 0);
        addOperation(new UIThreadOperation(this) { // from class: com.facebook.react.animated.NativeAnimatedModule.startListeningToAnimatedNodeValue.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager animatedNodesManager) {
                Intrinsics.checkNotNullParameter(animatedNodesManager, "animatedNodesManager");
                animatedNodesManager.startListeningToAnimatedNodeValue(i7, aVar);
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void startOperationBatch() {
        this.batchingControlledByJS = true;
        this.currentBatchNumber++;
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void stopAnimation(double animationIdDouble) {
        final int i7 = (int) animationIdDouble;
        addOperation(new UIThreadOperation(this) { // from class: com.facebook.react.animated.NativeAnimatedModule.stopAnimation.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager animatedNodesManager) {
                Intrinsics.checkNotNullParameter(animatedNodesManager, "animatedNodesManager");
                animatedNodesManager.stopAnimation(i7);
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void stopListeningToAnimatedNodeValue(double tagDouble) {
        final int i7 = (int) tagDouble;
        addOperation(new UIThreadOperation(this) { // from class: com.facebook.react.animated.NativeAnimatedModule.stopListeningToAnimatedNodeValue.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager animatedNodesManager) {
                Intrinsics.checkNotNullParameter(animatedNodesManager, "animatedNodesManager");
                animatedNodesManager.stopListeningToAnimatedNodeValue(i7);
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void updateAnimatedNodeConfig(double tagDouble, @NotNull final ReadableMap config) {
        Intrinsics.checkNotNullParameter(config, "config");
        final int i7 = (int) tagDouble;
        addOperation(new UIThreadOperation(this) { // from class: com.facebook.react.animated.NativeAnimatedModule.updateAnimatedNodeConfig.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.facebook.react.animated.NativeAnimatedModule.UIThreadOperation
            public void execute(NativeAnimatedNodesManager animatedNodesManager) {
                Intrinsics.checkNotNullParameter(animatedNodesManager, "animatedNodesManager");
                animatedNodesManager.updateAnimatedNodeConfig(i7, config);
            }
        });
    }

    public final void userDrivenScrollEnded(int viewTag) {
        NativeAnimatedNodesManager nativeAnimatedNodesManager = this.nodesManagerRef.get();
        if (nativeAnimatedNodesManager == null) {
            return;
        }
        Set<Integer> tagsOfConnectedNodes$ReactAndroid_release = nativeAnimatedNodesManager.getTagsOfConnectedNodes$ReactAndroid_release(viewTag, "topScrollEnded");
        if (tagsOfConnectedNodes$ReactAndroid_release.isEmpty()) {
            return;
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        new ReadableMapBuilder(writableMapCreateMap).putArray("tags", new s(23, tagsOfConnectedNodes$ReactAndroid_release));
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            reactApplicationContextIfActiveOrWarn.emitDeviceEvent("onUserDrivenAnimationEnded", writableMapCreateMap);
        }
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void willDispatchViewUpdates(@NotNull UIManager uiManager) {
        Intrinsics.checkNotNullParameter(uiManager, "uiManager");
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void willMountItems(@NotNull UIManager uiManager) {
        Intrinsics.checkNotNullParameter(uiManager, "uiManager");
    }
}
