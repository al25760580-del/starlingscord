package com.facebook.react.animated;

import a1.k;
import a3.e;
import android.util.SparseArray;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapBuilder;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.EventDispatcherListener;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import kk.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.x;
import org.jetbrains.annotations.NotNull;
import s0.g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\u0018\u0000 T2\u00020\u0001:\u0001TB\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0010J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0019\u001a\u00020\u0010J\u0006\u0010\u001a\u001a\u00020\u0013J\u0018\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001eH\u0007J\u001a\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u00102\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0007J\u0010\u0010 \u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u0010H\u0007J\u001a\u0010!\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u00102\b\u0010\"\u001a\u0004\u0018\u00010#H\u0007J\u0010\u0010$\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u0010H\u0007J\u0018\u0010%\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010&\u001a\u00020'H\u0007J\u0018\u0010(\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010)\u001a\u00020'H\u0007J\u0010\u0010*\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u0010H\u0007J\u0010\u0010+\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u0010H\u0007J*\u0010,\u001a\u00020\u00162\u0006\u0010-\u001a\u00020\u00102\u0006\u0010.\u001a\u00020\u00102\u0006\u0010/\u001a\u00020\u001e2\b\u00100\u001a\u0004\u0018\u000101H\u0007J\u0010\u00102\u001a\u00020\u00162\u0006\u00103\u001a\u00020\bH\u0003J\u0010\u00104\u001a\u00020\u00162\u0006\u0010-\u001a\u00020\u0010H\u0007J\u0018\u00105\u001a\u00020\u00162\u0006\u00106\u001a\u00020\u00102\u0006\u00107\u001a\u00020\u0010H\u0007J\u0016\u00108\u001a\u00020\u00162\u0006\u00106\u001a\u00020\u00102\u0006\u00107\u001a\u00020\u0010J\u0018\u00109\u001a\u00020\u00162\u0006\u0010.\u001a\u00020\u00102\u0006\u0010:\u001a\u00020\u0010H\u0007J\u0018\u0010;\u001a\u00020\u00162\u0006\u0010.\u001a\u00020\u00102\u0006\u0010:\u001a\u00020\u0010H\u0007J\u001a\u0010<\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u00102\b\u0010=\u001a\u0004\u0018\u000101H\u0007J\u0010\u0010>\u001a\u00020\u00162\u0006\u0010.\u001a\u00020\u0010H\u0007J \u0010?\u001a\u00020\u00162\u0006\u0010:\u001a\u00020\u00102\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020\u001eH\u0007J \u0010C\u001a\u00020\u00162\u0006\u0010:\u001a\u00020\u00102\u0006\u0010@\u001a\u00020A2\u0006\u0010D\u001a\u00020\u0010H\u0007J\u0014\u0010E\u001a\u00020\u00162\n\u0010F\u001a\u0006\u0012\u0002\b\u00030GH\u0016J\u0014\u0010H\u001a\u00020\u00162\n\u0010F\u001a\u0006\u0012\u0002\b\u00030GH\u0003J\u0010\u0010I\u001a\u00020\u00162\u0006\u0010J\u001a\u00020KH\u0007J#\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00100M2\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010N\u001a\u00020AH\u0000¢\u0006\u0002\bOJ\u0016\u0010P\u001a\u00020\u00162\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020\b0RH\u0003J\u0010\u0010S\u001a\u00020A2\u0006\u0010@\u001a\u00020AH\u0002R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006U"}, d2 = {"Lcom/facebook/react/animated/NativeAnimatedNodesManager;", "Lcom/facebook/react/uimanager/events/EventDispatcherListener;", "reactApplicationContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "animatedNodes", "Landroid/util/SparseArray;", "Lcom/facebook/react/animated/AnimatedNode;", "activeAnimations", "Lcom/facebook/react/animated/AnimationDriver;", "updatedNodes", "eventDrivers", "", "Lcom/facebook/react/animated/EventAnimationDriver;", "animatedGraphBFSColor", "", "runUpdateNodeList", "eventListenerInitializedForFabric", "", "warnedAboutGraphTraversal", "initializeEventListenerForUIManagerType", "", "uiManagerType", "getNodeById", StackTraceHelper.ID_KEY, "hasActiveAnimations", "createAnimatedNode", "tag", "config", "Lcom/facebook/react/bridge/ReadableMap;", "updateAnimatedNodeConfig", "dropAnimatedNode", "startListeningToAnimatedNodeValue", "listener", "Lcom/facebook/react/animated/AnimatedNodeValueListener;", "stopListeningToAnimatedNodeValue", "setAnimatedNodeValue", "value", "", "setAnimatedNodeOffset", "offset", "flattenAnimatedNodeOffset", "extractAnimatedNodeOffset", "startAnimatingNode", "animationId", "animatedNodeTag", "animationConfig", "endCallback", "Lcom/facebook/react/bridge/Callback;", "stopAnimationsForNode", "animatedNode", "stopAnimation", "connectAnimatedNodes", "parentNodeTag", "childNodeTag", "disconnectAnimatedNodes", "connectAnimatedNodeToView", "viewTag", "disconnectAnimatedNodeFromView", "getValue", "callback", "restoreDefaultValues", "addAnimatedEventToView", "eventHandlerName", "", "eventMapping", "removeAnimatedEventFromView", "animatedValueTag", "onEventDispatch", "event", "Lcom/facebook/react/uimanager/events/Event;", "handleEvent", "runUpdates", "frameTimeNanos", "", "getTagsOfConnectedNodes", "", "eventName", "getTagsOfConnectedNodes$ReactAndroid_release", "updateNodes", "nodes", "", "normalizeEventName", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNativeAnimatedNodesManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NativeAnimatedNodesManager.kt\ncom/facebook/react/animated/NativeAnimatedNodesManager\n+ 2 ReadableMapBuilder.kt\ncom/facebook/react/bridge/ReadableMapBuilderKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,783:1\n30#2,3:784\n30#2,3:787\n30#2,3:790\n30#2,3:793\n30#2,3:796\n30#2,3:800\n30#2,3:803\n1#3:799\n1869#4:806\n1869#4,2:807\n1870#4:809\n1869#4,2:810\n1869#4,2:812\n*S KotlinDebug\n*F\n+ 1 NativeAnimatedNodesManager.kt\ncom/facebook/react/animated/NativeAnimatedNodesManager\n*L\n267#1:784,3\n277#1:787,3\n308#1:790,3\n318#1:793,3\n438#1:796,3\n596#1:800,3\n606#1:803,3\n629#1:806\n632#1:807,2\n629#1:809\n666#1:810,2\n723#1:812,2\n*E\n"})
public final class NativeAnimatedNodesManager implements EventDispatcherListener {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final String TAG = "NativeAnimatedNodesManager";
    private int animatedGraphBFSColor;
    private boolean eventListenerInitializedForFabric;
    private final ReactApplicationContext reactApplicationContext;
    private boolean warnedAboutGraphTraversal;

    @NotNull
    private final SparseArray<AnimatedNode> animatedNodes = new SparseArray<>();

    @NotNull
    private final SparseArray<AnimationDriver> activeAnimations = new SparseArray<>();

    @NotNull
    private final SparseArray<AnimatedNode> updatedNodes = new SparseArray<>();

    @NotNull
    private final List<EventAnimationDriver> eventDrivers = new ArrayList();

    @NotNull
    private final List<AnimatedNode> runUpdateNodeList = new LinkedList();

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/facebook/react/animated/NativeAnimatedNodesManager$Companion;", "", "<init>", "()V", "TAG", "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public NativeAnimatedNodesManager(ReactApplicationContext reactApplicationContext) {
        this.reactApplicationContext = reactApplicationContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleEvent(Event<?> event) {
        if (this.eventDrivers.isEmpty()) {
            return;
        }
        Event.EventAnimationDriverMatchSpec eventAnimationDriverMatchSpec = event.getEventAnimationDriverMatchSpec();
        boolean z5 = false;
        for (EventAnimationDriver eventAnimationDriver : this.eventDrivers) {
            if (eventAnimationDriverMatchSpec != null && eventAnimationDriverMatchSpec.match(eventAnimationDriver.viewTag, eventAnimationDriver.eventName)) {
                stopAnimationsForNode(eventAnimationDriver.valueNode);
                event.dispatchModern(eventAnimationDriver);
                this.runUpdateNodeList.add(eventAnimationDriver.valueNode);
                z5 = true;
            }
        }
        if (z5) {
            updateNodes(this.runUpdateNodeList);
            this.runUpdateNodeList.clear();
        }
    }

    private final String normalizeEventName(String eventHandlerName) {
        if (!x.o(eventHandlerName, ViewProps.ON, false)) {
            return eventHandlerName;
        }
        String strSubstring = eventHandlerName.substring(2);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return ViewProps.TOP + strSubstring;
    }

    private final void stopAnimationsForNode(AnimatedNode animatedNode) {
        ReactApplicationContext reactApplicationContext;
        WritableArray writableArrayCreateArray = null;
        int i7 = 0;
        while (i7 < this.activeAnimations.size()) {
            AnimationDriver animationDriverValueAt = this.activeAnimations.valueAt(i7);
            if (Intrinsics.areEqual(animatedNode, animationDriverValueAt.animatedValue)) {
                ValueAnimatedNode valueAnimatedNode = animationDriverValueAt.animatedValue;
                if (valueAnimatedNode == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                if (animationDriverValueAt.endCallback != null) {
                    WritableMap writableMapCreateMap = Arguments.createMap();
                    ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(writableMapCreateMap);
                    readableMapBuilder.put("finished", false);
                    readableMapBuilder.put("value", valueAnimatedNode.nodeValue);
                    readableMapBuilder.put("offset", valueAnimatedNode.offset);
                    Callback callback = animationDriverValueAt.endCallback;
                    if (callback != null) {
                        callback.invoke(writableMapCreateMap);
                    }
                } else if (this.reactApplicationContext != null) {
                    WritableMap writableMapCreateMap2 = Arguments.createMap();
                    ReadableMapBuilder readableMapBuilder2 = new ReadableMapBuilder(writableMapCreateMap2);
                    readableMapBuilder2.put("animationId", animationDriverValueAt.id);
                    readableMapBuilder2.put("finished", false);
                    readableMapBuilder2.put("value", valueAnimatedNode.nodeValue);
                    readableMapBuilder2.put("offset", valueAnimatedNode.offset);
                    if (writableArrayCreateArray == null) {
                        writableArrayCreateArray = Arguments.createArray();
                    }
                    writableArrayCreateArray.pushMap(writableMapCreateMap2);
                }
                this.activeAnimations.removeAt(i7);
                i7--;
            }
            i7++;
        }
        if (writableArrayCreateArray == null || (reactApplicationContext = this.reactApplicationContext) == null) {
            return;
        }
        reactApplicationContext.emitDeviceEvent("onNativeAnimatedModuleAnimationFinished", writableArrayCreateArray);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00b1 A[Catch: JSApplicationCausedNativeException -> 0x00ab, TRY_LEAVE, TryCatch #0 {JSApplicationCausedNativeException -> 0x00ab, blocks: (B:39:0x00a7, B:42:0x00ad, B:44:0x00b1), top: B:76:0x00a7 }] */
    private final void updateNodes(List<? extends AnimatedNode> nodes) {
        List<AnimatedNode> list;
        List<AnimatedNode> list2;
        int i7 = this.animatedGraphBFSColor;
        int i10 = i7 + 1;
        this.animatedGraphBFSColor = i10;
        if (i10 == 0) {
            this.animatedGraphBFSColor = i7 + 2;
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        int i11 = 0;
        for (AnimatedNode animatedNode : nodes) {
            int i12 = animatedNode.BFSColor;
            int i13 = this.animatedGraphBFSColor;
            if (i12 != i13) {
                animatedNode.BFSColor = i13;
                i11++;
                arrayDeque.add(animatedNode);
            }
        }
        while (!arrayDeque.isEmpty()) {
            AnimatedNode animatedNode2 = (AnimatedNode) arrayDeque.poll();
            if (animatedNode2 != null && (list2 = animatedNode2.children) != null) {
                for (AnimatedNode animatedNode3 : list2) {
                    animatedNode3.activeIncomingNodes++;
                    int i14 = animatedNode3.BFSColor;
                    int i15 = this.animatedGraphBFSColor;
                    if (i14 != i15) {
                        animatedNode3.BFSColor = i15;
                        i11++;
                        arrayDeque.add(animatedNode3);
                    }
                }
            }
        }
        int i16 = this.animatedGraphBFSColor;
        int i17 = i16 + 1;
        this.animatedGraphBFSColor = i17;
        if (i17 == 0) {
            this.animatedGraphBFSColor = i16 + 2;
        }
        int i18 = 0;
        for (AnimatedNode animatedNode4 : nodes) {
            if (animatedNode4.activeIncomingNodes == 0) {
                int i19 = animatedNode4.BFSColor;
                int i20 = this.animatedGraphBFSColor;
                if (i19 != i20) {
                    animatedNode4.BFSColor = i20;
                    i18++;
                    arrayDeque.add(animatedNode4);
                }
            }
        }
        int i21 = 0;
        while (!arrayDeque.isEmpty()) {
            AnimatedNode animatedNode5 = (AnimatedNode) arrayDeque.poll();
            if (animatedNode5 != null) {
                try {
                    animatedNode5.update$ReactAndroid_release();
                    if (animatedNode5 instanceof PropsAnimatedNode) {
                        ((PropsAnimatedNode) animatedNode5).updateView();
                    }
                } catch (JSApplicationCausedNativeException e10) {
                    o8.a.h(TAG, "Native animation workaround, frame lost as result of race condition", e10);
                }
            } else if (animatedNode5 instanceof PropsAnimatedNode) {
                ((PropsAnimatedNode) animatedNode5).updateView();
            }
            if (animatedNode5 instanceof ValueAnimatedNode) {
                ((ValueAnimatedNode) animatedNode5).onValueUpdate();
            }
            if (animatedNode5 != null && (list = animatedNode5.children) != null) {
                for (AnimatedNode animatedNode6 : list) {
                    int i22 = animatedNode6.activeIncomingNodes - 1;
                    animatedNode6.activeIncomingNodes = i22;
                    int i23 = animatedNode6.BFSColor;
                    int i24 = this.animatedGraphBFSColor;
                    if (i23 != i24 && i22 == 0) {
                        animatedNode6.BFSColor = i24;
                        i18++;
                        arrayDeque.add(animatedNode6);
                    } else if (i23 == i24) {
                        i21++;
                    }
                }
            }
        }
        if (i11 == i18) {
            this.warnedAboutGraphTraversal = false;
            return;
        }
        if (this.warnedAboutGraphTraversal) {
            return;
        }
        this.warnedAboutGraphTraversal = true;
        o8.a.g(TAG, "Detected animation cycle or disconnected graph. ");
        Iterator<? extends AnimatedNode> it = nodes.iterator();
        while (it.hasNext()) {
            o8.a.g(TAG, it.next().prettyPrintWithChildren$ReactAndroid_release());
        }
        StringBuilder sbT = e.t("Looks like animated nodes graph has ", i21 > 0 ? g.d(i21, "cycles (", ")") : "disconnected regions", ", there are ", i11, " but toposort visited only ");
        sbT.append(i18);
        ReactSoftExceptionLogger.logSoftException(TAG, new ReactNoCrashSoftException(new IllegalStateException(sbT.toString())));
    }

    public final void addAnimatedEventToView(int viewTag, @NotNull String eventHandlerName, @NotNull ReadableMap eventMapping) {
        Intrinsics.checkNotNullParameter(eventHandlerName, "eventHandlerName");
        Intrinsics.checkNotNullParameter(eventMapping, "eventMapping");
        int i7 = eventMapping.getInt("animatedValueTag");
        AnimatedNode animatedNode = this.animatedNodes.get(i7);
        if (animatedNode == null) {
            throw new JSApplicationIllegalArgumentException(g.d(i7, "addAnimatedEventToView: Animated node with tag [", "] does not exist"));
        }
        if (!(animatedNode instanceof ValueAnimatedNode)) {
            throw new JSApplicationIllegalArgumentException("addAnimatedEventToView: Animated node on view [" + viewTag + "] connected to event handler (" + eventHandlerName + ") should be of type ValueAnimatedNode");
        }
        ReadableArray array = eventMapping.getArray("nativeEventPath");
        if (array == null) {
            throw new IllegalStateException("Required value was null.");
        }
        ArrayList arrayList = new ArrayList(array.size());
        int size = array.size();
        for (int i10 = 0; i10 < size; i10++) {
            String string = array.getString(i10);
            if (string == null) {
                throw new IllegalStateException("Required value was null.");
            }
            arrayList.add(string);
        }
        String strNormalizeEventName = normalizeEventName(eventHandlerName);
        this.eventDrivers.add(new EventAnimationDriver(strNormalizeEventName, viewTag, arrayList, (ValueAnimatedNode) animatedNode));
        if (Intrinsics.areEqual(strNormalizeEventName, "topScroll")) {
            addAnimatedEventToView(viewTag, "topScrollEnded", eventMapping);
        }
    }

    public final void connectAnimatedNodeToView(int animatedNodeTag, int viewTag) {
        AnimatedNode animatedNode = this.animatedNodes.get(animatedNodeTag);
        if (animatedNode == null) {
            throw new JSApplicationIllegalArgumentException(g.d(animatedNodeTag, "connectAnimatedNodeToView: Animated node with tag [", "] does not exist"));
        }
        if (!(animatedNode instanceof PropsAnimatedNode)) {
            throw new JSApplicationIllegalArgumentException(g.d(viewTag, "connectAnimatedNodeToView: Animated node connected to view [", "] should be of type PropsAnimatedNode"));
        }
        ReactApplicationContext reactApplicationContext = this.reactApplicationContext;
        if (reactApplicationContext == null) {
            throw new IllegalStateException(b.h(viewTag, "connectAnimatedNodeToView: Animated node could not be connected, no ReactApplicationContext: ").toString());
        }
        UIManager uIManagerForReactTag = UIManagerHelper.getUIManagerForReactTag(reactApplicationContext, viewTag);
        if (uIManagerForReactTag == null) {
            ReactSoftExceptionLogger.logSoftException(TAG, new ReactNoCrashSoftException(b.h(viewTag, "connectAnimatedNodeToView: Animated node could not be connected to UIManager - uiManager disappeared for tag: ")));
        } else {
            ((PropsAnimatedNode) animatedNode).connectToView(viewTag, uIManagerForReactTag);
            this.updatedNodes.put(animatedNodeTag, animatedNode);
        }
    }

    public final void connectAnimatedNodes(int parentNodeTag, int childNodeTag) {
        AnimatedNode animatedNode = this.animatedNodes.get(parentNodeTag);
        if (animatedNode == null) {
            throw new JSApplicationIllegalArgumentException(g.d(parentNodeTag, "connectAnimatedNodes: Animated node with tag (parent) [", "] does not exist"));
        }
        AnimatedNode animatedNode2 = this.animatedNodes.get(childNodeTag);
        if (animatedNode2 == null) {
            throw new JSApplicationIllegalArgumentException(g.d(childNodeTag, "connectAnimatedNodes: Animated node with tag (child) [", "] does not exist"));
        }
        animatedNode.addChild$ReactAndroid_release(animatedNode2);
        this.updatedNodes.put(childNodeTag, animatedNode2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void createAnimatedNode(int tag, @NotNull ReadableMap config) {
        AnimatedNode subtractionAnimatedNode;
        Intrinsics.checkNotNullParameter(config, "config");
        if (this.animatedNodes.get(tag) != null) {
            throw new JSApplicationIllegalArgumentException(g.d(tag, "createAnimatedNode: Animated node [", "] already exists"));
        }
        String string = config.getString("type");
        if (string != null) {
            switch (string.hashCode()) {
                case -1774341004:
                    if (string.equals("subtraction")) {
                        subtractionAnimatedNode = new SubtractionAnimatedNode(config, this);
                        subtractionAnimatedNode.tag = tag;
                        this.animatedNodes.put(tag, subtractionAnimatedNode);
                        this.updatedNodes.put(tag, subtractionAnimatedNode);
                        return;
                    }
                    break;
                case -1226589444:
                    if (string.equals("addition")) {
                        subtractionAnimatedNode = new AdditionAnimatedNode(config, this);
                        subtractionAnimatedNode.tag = tag;
                        this.animatedNodes.put(tag, subtractionAnimatedNode);
                        this.updatedNodes.put(tag, subtractionAnimatedNode);
                        return;
                    }
                    break;
                case -1023368385:
                    if (string.equals("object")) {
                        subtractionAnimatedNode = new ObjectAnimatedNode(config, this);
                        subtractionAnimatedNode.tag = tag;
                        this.animatedNodes.put(tag, subtractionAnimatedNode);
                        this.updatedNodes.put(tag, subtractionAnimatedNode);
                        return;
                    }
                    break;
                case 94842723:
                    if (string.equals(ViewProps.COLOR)) {
                        ReactApplicationContext reactApplicationContext = this.reactApplicationContext;
                        if (reactApplicationContext == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        subtractionAnimatedNode = new ColorAnimatedNode(config, this, reactApplicationContext);
                        subtractionAnimatedNode.tag = tag;
                        this.animatedNodes.put(tag, subtractionAnimatedNode);
                        this.updatedNodes.put(tag, subtractionAnimatedNode);
                        return;
                    }
                    break;
                case 106940784:
                    if (string.equals("props")) {
                        subtractionAnimatedNode = new PropsAnimatedNode(config, this);
                        subtractionAnimatedNode.tag = tag;
                        this.animatedNodes.put(tag, subtractionAnimatedNode);
                        this.updatedNodes.put(tag, subtractionAnimatedNode);
                        return;
                    }
                    break;
                case 109780401:
                    if (string.equals("style")) {
                        subtractionAnimatedNode = new StyleAnimatedNode(config, this);
                        subtractionAnimatedNode.tag = tag;
                        this.animatedNodes.put(tag, subtractionAnimatedNode);
                        this.updatedNodes.put(tag, subtractionAnimatedNode);
                        return;
                    }
                    break;
                case 111972721:
                    if (string.equals("value")) {
                        subtractionAnimatedNode = new ValueAnimatedNode(config);
                        subtractionAnimatedNode.tag = tag;
                        this.animatedNodes.put(tag, subtractionAnimatedNode);
                        this.updatedNodes.put(tag, subtractionAnimatedNode);
                        return;
                    }
                    break;
                case 364720301:
                    if (string.equals("division")) {
                        subtractionAnimatedNode = new DivisionAnimatedNode(config, this);
                        subtractionAnimatedNode.tag = tag;
                        this.animatedNodes.put(tag, subtractionAnimatedNode);
                        this.updatedNodes.put(tag, subtractionAnimatedNode);
                        return;
                    }
                    break;
                case 559331748:
                    if (string.equals("interpolation")) {
                        subtractionAnimatedNode = new InterpolationAnimatedNode(config);
                        subtractionAnimatedNode.tag = tag;
                        this.animatedNodes.put(tag, subtractionAnimatedNode);
                        this.updatedNodes.put(tag, subtractionAnimatedNode);
                        return;
                    }
                    break;
                case 668845958:
                    if (string.equals("multiplication")) {
                        subtractionAnimatedNode = new MultiplicationAnimatedNode(config, this);
                        subtractionAnimatedNode.tag = tag;
                        this.animatedNodes.put(tag, subtractionAnimatedNode);
                        this.updatedNodes.put(tag, subtractionAnimatedNode);
                        return;
                    }
                    break;
                case 1052666732:
                    if (string.equals(ViewProps.TRANSFORM)) {
                        subtractionAnimatedNode = new TransformAnimatedNode(config, this);
                        subtractionAnimatedNode.tag = tag;
                        this.animatedNodes.put(tag, subtractionAnimatedNode);
                        this.updatedNodes.put(tag, subtractionAnimatedNode);
                        return;
                    }
                    break;
                case 1227434359:
                    if (string.equals("modulus")) {
                        subtractionAnimatedNode = new ModulusAnimatedNode(config, this);
                        subtractionAnimatedNode.tag = tag;
                        this.animatedNodes.put(tag, subtractionAnimatedNode);
                        this.updatedNodes.put(tag, subtractionAnimatedNode);
                        return;
                    }
                    break;
                case 1270488759:
                    if (string.equals("tracking")) {
                        subtractionAnimatedNode = new TrackingAnimatedNode(config, this);
                        subtractionAnimatedNode.tag = tag;
                        this.animatedNodes.put(tag, subtractionAnimatedNode);
                        this.updatedNodes.put(tag, subtractionAnimatedNode);
                        return;
                    }
                    break;
                case 1300649942:
                    if (string.equals("diffclamp")) {
                        subtractionAnimatedNode = new DiffClampAnimatedNode(config, this);
                        subtractionAnimatedNode.tag = tag;
                        this.animatedNodes.put(tag, subtractionAnimatedNode);
                        this.updatedNodes.put(tag, subtractionAnimatedNode);
                        return;
                    }
                    break;
            }
        }
        throw new JSApplicationIllegalArgumentException(e.l("Unsupported node type: ", string));
    }

    public final void disconnectAnimatedNodeFromView(int animatedNodeTag, int viewTag) {
        AnimatedNode animatedNode = this.animatedNodes.get(animatedNodeTag);
        if (animatedNode == null) {
            throw new JSApplicationIllegalArgumentException(g.d(animatedNodeTag, "disconnectAnimatedNodeFromView: Animated node with tag [", "] does not exist"));
        }
        if (!(animatedNode instanceof PropsAnimatedNode)) {
            throw new JSApplicationIllegalArgumentException(g.d(viewTag, "disconnectAnimatedNodeFromView: Animated node connected to view [", "] should be of type PropsAnimatedNode"));
        }
        ((PropsAnimatedNode) animatedNode).disconnectFromView(viewTag);
    }

    public final void disconnectAnimatedNodes(int parentNodeTag, int childNodeTag) {
        AnimatedNode animatedNode = this.animatedNodes.get(parentNodeTag);
        if (animatedNode == null) {
            throw new JSApplicationIllegalArgumentException(g.d(parentNodeTag, "disconnectAnimatedNodes: Animated node with tag (parent) [", "] does not exist"));
        }
        AnimatedNode animatedNode2 = this.animatedNodes.get(childNodeTag);
        if (animatedNode2 == null) {
            throw new JSApplicationIllegalArgumentException(g.d(childNodeTag, "disconnectAnimatedNodes: Animated node with tag (child) [", "] does not exist"));
        }
        animatedNode.removeChild$ReactAndroid_release(animatedNode2);
        this.updatedNodes.put(childNodeTag, animatedNode2);
    }

    public final void dropAnimatedNode(int tag) {
        this.animatedNodes.remove(tag);
        this.updatedNodes.remove(tag);
    }

    public final void extractAnimatedNodeOffset(int tag) {
        AnimatedNode animatedNode = this.animatedNodes.get(tag);
        if (animatedNode == null || !(animatedNode instanceof ValueAnimatedNode)) {
            throw new JSApplicationIllegalArgumentException(g.d(tag, "extractAnimatedNodeOffset: Animated node [", "] does not exist, or is not a 'value' node"));
        }
        ((ValueAnimatedNode) animatedNode).extractOffset();
    }

    public final void flattenAnimatedNodeOffset(int tag) {
        AnimatedNode animatedNode = this.animatedNodes.get(tag);
        if (animatedNode == null || !(animatedNode instanceof ValueAnimatedNode)) {
            throw new JSApplicationIllegalArgumentException(g.d(tag, "flattenAnimatedNodeOffset: Animated node [", "] does not exist, or is not a 'value' node"));
        }
        ((ValueAnimatedNode) animatedNode).flattenOffset();
    }

    public final AnimatedNode getNodeById(int id2) {
        return this.animatedNodes.get(id2);
    }

    @NotNull
    public final Set<Integer> getTagsOfConnectedNodes$ReactAndroid_release(int tag, @NotNull String eventName) {
        int i7;
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        HashSet hashSet = new HashSet();
        for (EventAnimationDriver eventAnimationDriver : this.eventDrivers) {
            if (Intrinsics.areEqual(eventName, eventAnimationDriver.eventName) && tag == (i7 = eventAnimationDriver.viewTag)) {
                hashSet.add(Integer.valueOf(i7));
                List<AnimatedNode> list = eventAnimationDriver.valueNode.children;
                if (list != null) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        hashSet.add(Integer.valueOf(((AnimatedNode) it.next()).tag));
                    }
                }
            }
        }
        return hashSet;
    }

    public final void getValue(int tag, Callback callback) {
        AnimatedNode animatedNode = this.animatedNodes.get(tag);
        if (animatedNode == null || !(animatedNode instanceof ValueAnimatedNode)) {
            throw new JSApplicationIllegalArgumentException(g.d(tag, "getValue: Animated node with tag [", "] does not exist or is not a 'value' node"));
        }
        double value = ((ValueAnimatedNode) animatedNode).getValue();
        if (callback != null) {
            callback.invoke(Double.valueOf(value));
            return;
        }
        if (this.reactApplicationContext == null) {
            return;
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(writableMapCreateMap);
        readableMapBuilder.put("tag", tag);
        readableMapBuilder.put("value", value);
        this.reactApplicationContext.emitDeviceEvent("onNativeAnimatedModuleGetValue", writableMapCreateMap);
    }

    public final boolean hasActiveAnimations() {
        return this.activeAnimations.size() > 0 || this.updatedNodes.size() > 0;
    }

    public final void initializeEventListenerForUIManagerType(int uiManagerType) {
        if (this.eventListenerInitializedForFabric) {
            return;
        }
        ReactApplicationContext reactApplicationContext = this.reactApplicationContext;
        if (reactApplicationContext == null) {
            throw new IllegalStateException("Required value was null.");
        }
        UIManager uIManager = UIManagerHelper.getUIManager(reactApplicationContext, uiManagerType);
        if (uIManager != null) {
            uIManager.getEventDispatcher().addListener(this);
            this.eventListenerInitializedForFabric = true;
        }
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcherListener
    public void onEventDispatch(@NotNull Event<?> event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (UiThreadUtil.isOnUiThread()) {
            handleEvent(event);
        } else {
            UiThreadUtil.runOnUiThread(new k(20, this, event));
        }
    }

    public final void removeAnimatedEventFromView(int viewTag, @NotNull String eventHandlerName, int animatedValueTag) {
        Object next;
        Intrinsics.checkNotNullParameter(eventHandlerName, "eventHandlerName");
        String strNormalizeEventName = normalizeEventName(eventHandlerName);
        Iterator<T> it = this.eventDrivers.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            EventAnimationDriver eventAnimationDriver = (EventAnimationDriver) next;
            if (Intrinsics.areEqual(strNormalizeEventName, eventAnimationDriver.eventName) && viewTag == eventAnimationDriver.viewTag && animatedValueTag == eventAnimationDriver.valueNode.tag) {
                break;
            }
        }
        EventAnimationDriver eventAnimationDriver2 = (EventAnimationDriver) next;
        if (eventAnimationDriver2 != null) {
            this.eventDrivers.remove(eventAnimationDriver2);
        }
        if (Intrinsics.areEqual(strNormalizeEventName, "topScroll")) {
            removeAnimatedEventFromView(viewTag, "topScrollEnded", animatedValueTag);
        }
    }

    public final void restoreDefaultValues(int animatedNodeTag) {
        AnimatedNode animatedNode = this.animatedNodes.get(animatedNodeTag);
        if (animatedNode == null) {
            return;
        }
        if (!(animatedNode instanceof PropsAnimatedNode)) {
            throw new JSApplicationIllegalArgumentException("Animated node connected to view [?] should be of type PropsAnimatedNode");
        }
        ((PropsAnimatedNode) animatedNode).restoreDefaultValues();
    }

    public final void runUpdates(long frameTimeNanos) {
        ReactApplicationContext reactApplicationContext;
        UiThreadUtil.assertOnUiThread();
        int size = this.updatedNodes.size();
        for (int i7 = 0; i7 < size; i7++) {
            AnimatedNode animatedNodeValueAt = this.updatedNodes.valueAt(i7);
            List<AnimatedNode> list = this.runUpdateNodeList;
            Intrinsics.checkNotNull(animatedNodeValueAt);
            list.add(animatedNodeValueAt);
        }
        this.updatedNodes.clear();
        int size2 = this.activeAnimations.size();
        boolean z5 = false;
        for (int i10 = 0; i10 < size2; i10++) {
            AnimationDriver animationDriverValueAt = this.activeAnimations.valueAt(i10);
            animationDriverValueAt.runAnimationStep(frameTimeNanos);
            ValueAnimatedNode valueAnimatedNode = animationDriverValueAt.animatedValue;
            if (valueAnimatedNode != null) {
                this.runUpdateNodeList.add(valueAnimatedNode);
            }
            if (animationDriverValueAt.hasFinished) {
                z5 = true;
            }
        }
        updateNodes(this.runUpdateNodeList);
        this.runUpdateNodeList.clear();
        if (z5) {
            WritableArray writableArrayCreateArray = null;
            for (int size3 = this.activeAnimations.size() - 1; -1 < size3; size3--) {
                AnimationDriver animationDriverValueAt2 = this.activeAnimations.valueAt(size3);
                if (animationDriverValueAt2.hasFinished) {
                    ValueAnimatedNode valueAnimatedNode2 = animationDriverValueAt2.animatedValue;
                    if (valueAnimatedNode2 == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    if (animationDriverValueAt2.endCallback != null) {
                        WritableMap writableMapCreateMap = Arguments.createMap();
                        ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(writableMapCreateMap);
                        readableMapBuilder.put("finished", true);
                        readableMapBuilder.put("value", valueAnimatedNode2.nodeValue);
                        readableMapBuilder.put("offset", valueAnimatedNode2.offset);
                        Callback callback = animationDriverValueAt2.endCallback;
                        if (callback != null) {
                            callback.invoke(writableMapCreateMap);
                        }
                    } else if (this.reactApplicationContext != null) {
                        WritableMap writableMapCreateMap2 = Arguments.createMap();
                        ReadableMapBuilder readableMapBuilder2 = new ReadableMapBuilder(writableMapCreateMap2);
                        readableMapBuilder2.put("animationId", animationDriverValueAt2.id);
                        readableMapBuilder2.put("finished", true);
                        readableMapBuilder2.put("value", valueAnimatedNode2.nodeValue);
                        readableMapBuilder2.put("offset", valueAnimatedNode2.offset);
                        if (writableArrayCreateArray == null) {
                            writableArrayCreateArray = Arguments.createArray();
                        }
                        writableArrayCreateArray.pushMap(writableMapCreateMap2);
                    }
                    this.activeAnimations.removeAt(size3);
                }
            }
            if (writableArrayCreateArray == null || (reactApplicationContext = this.reactApplicationContext) == null) {
                return;
            }
            reactApplicationContext.emitDeviceEvent("onNativeAnimatedModuleAnimationFinished", writableArrayCreateArray);
        }
    }

    public final void setAnimatedNodeOffset(int tag, double offset) {
        AnimatedNode animatedNode = this.animatedNodes.get(tag);
        if (animatedNode == null || !(animatedNode instanceof ValueAnimatedNode)) {
            throw new JSApplicationIllegalArgumentException(g.d(tag, "setAnimatedNodeOffset: Animated node [", "] does not exist, or is not a 'value' node"));
        }
        ((ValueAnimatedNode) animatedNode).offset = offset;
        this.updatedNodes.put(tag, animatedNode);
    }

    public final void setAnimatedNodeValue(int tag, double value) {
        AnimatedNode animatedNode = this.animatedNodes.get(tag);
        if (animatedNode == null || !(animatedNode instanceof ValueAnimatedNode)) {
            throw new JSApplicationIllegalArgumentException(g.d(tag, "setAnimatedNodeValue: Animated node [", "] does not exist, or is not a 'value' node"));
        }
        stopAnimationsForNode(animatedNode);
        ((ValueAnimatedNode) animatedNode).nodeValue = value;
        this.updatedNodes.put(tag, animatedNode);
    }

    public final void startAnimatingNode(int animationId, int animatedNodeTag, @NotNull ReadableMap animationConfig, Callback endCallback) {
        AnimationDriver frameBasedAnimationDriver;
        Intrinsics.checkNotNullParameter(animationConfig, "animationConfig");
        AnimatedNode animatedNode = this.animatedNodes.get(animatedNodeTag);
        if (animatedNode == null) {
            throw new JSApplicationIllegalArgumentException(g.d(animatedNodeTag, "startAnimatingNode: Animated node [", "] does not exist"));
        }
        if (!(animatedNode instanceof ValueAnimatedNode)) {
            throw new JSApplicationIllegalArgumentException(g.d(animatedNodeTag, "startAnimatingNode: Animated node [", "] should be of type ValueAnimatedNode"));
        }
        AnimationDriver animationDriver = this.activeAnimations.get(animationId);
        if (animationDriver != null) {
            animationDriver.resetConfig(animationConfig);
            return;
        }
        String string = animationConfig.getString("type");
        if (string != null) {
            int iHashCode = string.hashCode();
            if (iHashCode != -1266514778) {
                if (iHashCode != -895679987) {
                    if (iHashCode == 95459258 && string.equals("decay")) {
                        frameBasedAnimationDriver = new DecayAnimation(animationConfig);
                        frameBasedAnimationDriver.id = animationId;
                        frameBasedAnimationDriver.endCallback = endCallback;
                        frameBasedAnimationDriver.animatedValue = (ValueAnimatedNode) animatedNode;
                        this.activeAnimations.put(animationId, frameBasedAnimationDriver);
                        return;
                    }
                } else if (string.equals("spring")) {
                    frameBasedAnimationDriver = new SpringAnimation(animationConfig);
                    frameBasedAnimationDriver.id = animationId;
                    frameBasedAnimationDriver.endCallback = endCallback;
                    frameBasedAnimationDriver.animatedValue = (ValueAnimatedNode) animatedNode;
                    this.activeAnimations.put(animationId, frameBasedAnimationDriver);
                    return;
                }
            } else if (string.equals("frames")) {
                frameBasedAnimationDriver = new FrameBasedAnimationDriver(animationConfig);
                frameBasedAnimationDriver.id = animationId;
                frameBasedAnimationDriver.endCallback = endCallback;
                frameBasedAnimationDriver.animatedValue = (ValueAnimatedNode) animatedNode;
                this.activeAnimations.put(animationId, frameBasedAnimationDriver);
                return;
            }
        }
        throw new JSApplicationIllegalArgumentException("startAnimatingNode: Unsupported animation type [" + animatedNodeTag + "]: " + string);
    }

    public final void startListeningToAnimatedNodeValue(int tag, AnimatedNodeValueListener listener) {
        AnimatedNode animatedNode = this.animatedNodes.get(tag);
        if (animatedNode == null || !(animatedNode instanceof ValueAnimatedNode)) {
            throw new JSApplicationIllegalArgumentException(g.d(tag, "startListeningToAnimatedNodeValue: Animated node [", "] does not exist, or is not a 'value' node"));
        }
        ((ValueAnimatedNode) animatedNode).setValueListener(listener);
    }

    public final void stopAnimation(int animationId) {
        WritableArray writableArrayCreateArray;
        ReactApplicationContext reactApplicationContext;
        int size = this.activeAnimations.size();
        int i7 = 0;
        while (true) {
            writableArrayCreateArray = null;
            if (i7 >= size) {
                break;
            }
            AnimationDriver animationDriverValueAt = this.activeAnimations.valueAt(i7);
            if (animationDriverValueAt.id == animationId) {
                if (animationDriverValueAt.endCallback != null) {
                    WritableMap writableMapCreateMap = Arguments.createMap();
                    ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(writableMapCreateMap);
                    readableMapBuilder.put("finished", false);
                    ValueAnimatedNode valueAnimatedNode = animationDriverValueAt.animatedValue;
                    if (valueAnimatedNode == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    readableMapBuilder.put("value", valueAnimatedNode.nodeValue);
                    ValueAnimatedNode valueAnimatedNode2 = animationDriverValueAt.animatedValue;
                    if (valueAnimatedNode2 == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    readableMapBuilder.put("offset", valueAnimatedNode2.offset);
                    Callback callback = animationDriverValueAt.endCallback;
                    if (callback == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    callback.invoke(writableMapCreateMap);
                } else if (this.reactApplicationContext != null) {
                    WritableMap writableMapCreateMap2 = Arguments.createMap();
                    ReadableMapBuilder readableMapBuilder2 = new ReadableMapBuilder(writableMapCreateMap2);
                    readableMapBuilder2.put("animationId", animationDriverValueAt.id);
                    readableMapBuilder2.put("finished", false);
                    ValueAnimatedNode valueAnimatedNode3 = animationDriverValueAt.animatedValue;
                    if (valueAnimatedNode3 == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    readableMapBuilder2.put("value", valueAnimatedNode3.nodeValue);
                    ValueAnimatedNode valueAnimatedNode4 = animationDriverValueAt.animatedValue;
                    if (valueAnimatedNode4 == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    readableMapBuilder2.put("offset", valueAnimatedNode4.offset);
                    writableArrayCreateArray = Arguments.createArray();
                    writableArrayCreateArray.pushMap(writableMapCreateMap2);
                }
                this.activeAnimations.removeAt(i7);
                break;
            }
            i7++;
        }
        if (writableArrayCreateArray == null || (reactApplicationContext = this.reactApplicationContext) == null) {
            return;
        }
        reactApplicationContext.emitDeviceEvent("onNativeAnimatedModuleAnimationFinished", writableArrayCreateArray);
    }

    public final void stopListeningToAnimatedNodeValue(int tag) {
        AnimatedNode animatedNode = this.animatedNodes.get(tag);
        if (animatedNode == null || !(animatedNode instanceof ValueAnimatedNode)) {
            throw new JSApplicationIllegalArgumentException(g.d(tag, "startListeningToAnimatedNodeValue: Animated node [", "] does not exist, or is not a 'value' node"));
        }
        ((ValueAnimatedNode) animatedNode).setValueListener(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void updateAnimatedNodeConfig(int tag, ReadableMap config) {
        AnimatedNode animatedNode = this.animatedNodes.get(tag);
        if (animatedNode == 0) {
            throw new JSApplicationIllegalArgumentException(g.d(tag, "updateAnimatedNode: Animated node [", "] does not exist"));
        }
        if (animatedNode instanceof AnimatedNodeWithUpdateableConfig) {
            stopAnimationsForNode(animatedNode);
            ((AnimatedNodeWithUpdateableConfig) animatedNode).onUpdateConfig(config);
            this.updatedNodes.put(tag, animatedNode);
        }
    }
}
