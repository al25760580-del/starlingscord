package com.facebook.react.uimanager.events;

import android.view.MotionEvent;
import androidx.core.util.Pools$SynchronizedPool;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.TouchTargetHelper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import rn.d;
import rn.l;
import rn.m;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 /2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002./B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000bH\u0002J\b\u0010\u0016\u001a\u00020\u0007H\u0016J\u0010\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001cH\u0017J\b\u0010#\u001a\u00020\u0012H\u0016J\u000e\u0010$\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002J\u0018\u0010%\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\f2\u0006\u0010'\u001a\u00020\u0010H\u0002J\u0010\u0010(\u001a\u00020\f2\u0006\u0010)\u001a\u00020\u0010H\u0002J\u0010\u0010*\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0002J\b\u0010+\u001a\u00020\tH\u0016J\u0010\u0010,\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020-H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0019R\u001b\u0010\u001d\u001a\u00020\u001e8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 ¨\u00060"}, d2 = {"Lcom/facebook/react/uimanager/events/PointerEvent;", "Lcom/facebook/react/uimanager/events/Event;", "<init>", "()V", "motionEvent", "Landroid/view/MotionEvent;", "_eventName", "", "coalescingKey", "", "pointersEventData", "", "Lcom/facebook/react/bridge/WritableMap;", "eventState", "Lcom/facebook/react/uimanager/events/PointerEvent$PointerEventState;", "activeHitPathViewIds", "", "init", "", "eventName", "targetTag", "motionEventToCopy", "getEventName", "isClickEvent", "", "()Z", "dispatch", "rctEventEmitter", "Lcom/facebook/react/uimanager/events/RCTEventEmitter;", "eventAnimationDriverMatchSpec", "Lcom/facebook/react/uimanager/events/Event$EventAnimationDriverMatchSpec;", "getEventAnimationDriverMatchSpec", "()Lcom/facebook/react/uimanager/events/Event$EventAnimationDriverMatchSpec;", "eventAnimationDriverMatchSpec$delegate", "Lkotlin/Lazy;", "onDispose", "createW3CPointerEvents", "addModifierKeyData", "pointerEvent", "modifierKeyMask", "createW3CPointerEvent", "index", "createPointersEventData", "getCoalescingKey", "dispatchModern", "Lcom/facebook/react/uimanager/events/RCTModernEventEmitter;", "PointerEventState", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PointerEvent extends Event<PointerEvent> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Pools$SynchronizedPool EVENTS_POOL;
    private static final int POINTER_EVENTS_POOL_SIZE = 6;

    @NotNull
    private static final String TAG;
    private static final short UNSET_COALESCING_KEY = -1;
    private String _eventName;
    private List<Integer> activeHitPathViewIds;
    private short coalescingKey;

    /* JADX INFO: renamed from: eventAnimationDriverMatchSpec$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy eventAnimationDriverMatchSpec;
    private PointerEventState eventState;
    private MotionEvent motionEvent;
    private List<? extends WritableMap> pointersEventData;

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007J:\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0015H\u0007J2\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\fH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/facebook/react/uimanager/events/PointerEvent$Companion;", "", "<init>", "()V", "TAG", "", "POINTER_EVENTS_POOL_SIZE", "", "EVENTS_POOL", "Landroidx/core/util/Pools$SynchronizedPool;", "Lcom/facebook/react/uimanager/events/PointerEvent;", "UNSET_COALESCING_KEY", "", "obtain", "eventName", "targetTag", "eventState", "Lcom/facebook/react/uimanager/events/PointerEvent$PointerEventState;", "motionEventToCopy", "Landroid/view/MotionEvent;", "activeHitPathViewIds", "", "coalescingKey", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final PointerEvent obtain(@NotNull String eventName, int targetTag, @NotNull PointerEventState eventState, MotionEvent motionEventToCopy) {
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            Intrinsics.checkNotNullParameter(eventState, "eventState");
            return obtain(eventName, targetTag, eventState, motionEventToCopy, (List<Integer>) null);
        }

        private Companion() {
        }

        @NotNull
        public final PointerEvent obtain(@NotNull String eventName, int targetTag, @NotNull PointerEventState eventState, MotionEvent motionEventToCopy, List<Integer> activeHitPathViewIds) {
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            Intrinsics.checkNotNullParameter(eventState, "eventState");
            PointerEvent pointerEvent = (PointerEvent) PointerEvent.EVENTS_POOL.acquire();
            if (pointerEvent == null) {
                pointerEvent = new PointerEvent(null);
            }
            PointerEvent pointerEvent2 = pointerEvent;
            io.sentry.config.a.f(motionEventToCopy);
            Intrinsics.checkNotNullExpressionValue(motionEventToCopy, "assertNotNull(...)");
            pointerEvent2.init(eventName, targetTag, eventState, motionEventToCopy, (short) 0, activeHitPathViewIds);
            return pointerEvent2;
        }

        @NotNull
        public final PointerEvent obtain(@NotNull String eventName, int targetTag, @NotNull PointerEventState eventState, MotionEvent motionEventToCopy, short coalescingKey) {
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            Intrinsics.checkNotNullParameter(eventState, "eventState");
            PointerEvent pointerEvent = (PointerEvent) PointerEvent.EVENTS_POOL.acquire();
            if (pointerEvent == null) {
                pointerEvent = new PointerEvent(null);
            }
            PointerEvent pointerEvent2 = pointerEvent;
            io.sentry.config.a.f(motionEventToCopy);
            Intrinsics.checkNotNullExpressionValue(motionEventToCopy, "assertNotNull(...)");
            pointerEvent2.init(eventName, targetTag, eventState, motionEventToCopy, coalescingKey, null);
            return pointerEvent2;
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\b\u0012\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\b\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0006\u0010\u001e\u001a\u00020\u0003J\u000e\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R#\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u001d\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u001d\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b8F¢\u0006\u0006\u001a\u0004\b&\u0010$¨\u0006'"}, d2 = {"Lcom/facebook/react/uimanager/events/PointerEvent$PointerEventState;", "", "primaryPointerId", "", "activePointerId", "lastButtonState", "surfaceId", "offsetByPointerId", "", "", "hitPathByPointerId", "", "Lcom/facebook/react/uimanager/TouchTargetHelper$ViewTarget;", "eventCoordinatesByPointerId", "screenCoordinatesByPointerId", "hoveringPointerIds", "", "<init>", "(IIIILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Set;)V", "getPrimaryPointerId", "()I", "getActivePointerId", "getLastButtonState", "getOffsetByPointerId", "()Ljava/util/Map;", "getHitPathByPointerId", "getEventCoordinatesByPointerId", "getScreenCoordinatesByPointerId", "getHoveringPointerIds", "()Ljava/util/Set;", "getSurfaceId", "supportsHover", "", "pointerId", "hitPathForActivePointer", "getHitPathForActivePointer", "()Ljava/util/List;", "hitPathViewIdsForActivePointer", "getHitPathViewIdsForActivePointer", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nPointerEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerEvent.kt\ncom/facebook/react/uimanager/events/PointerEvent$PointerEventState\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,376:1\n1563#2:377\n1634#2,3:378\n*S KotlinDebug\n*F\n+ 1 PointerEvent.kt\ncom/facebook/react/uimanager/events/PointerEvent$PointerEventState\n*L\n312#1:377\n312#1:378,3\n*E\n"})
    public static final class PointerEventState {
        private final int activePointerId;

        @NotNull
        private final Map<Integer, float[]> eventCoordinatesByPointerId;

        @NotNull
        private final Map<Integer, List<TouchTargetHelper.ViewTarget>> hitPathByPointerId;

        @NotNull
        private final Set<Integer> hoveringPointerIds;
        private final int lastButtonState;

        @NotNull
        private final Map<Integer, float[]> offsetByPointerId;
        private final int primaryPointerId;

        @NotNull
        private final Map<Integer, float[]> screenCoordinatesByPointerId;
        private final int surfaceId;

        /* JADX WARN: Multi-variable type inference failed */
        public PointerEventState(int i7, int i10, int i11, int i12, @NotNull Map<Integer, float[]> offsetByPointerId, @NotNull Map<Integer, ? extends List<TouchTargetHelper.ViewTarget>> hitPathByPointerId, @NotNull Map<Integer, float[]> eventCoordinatesByPointerId, @NotNull Map<Integer, float[]> screenCoordinatesByPointerId, @NotNull Set<Integer> hoveringPointerIds) {
            Intrinsics.checkNotNullParameter(offsetByPointerId, "offsetByPointerId");
            Intrinsics.checkNotNullParameter(hitPathByPointerId, "hitPathByPointerId");
            Intrinsics.checkNotNullParameter(eventCoordinatesByPointerId, "eventCoordinatesByPointerId");
            Intrinsics.checkNotNullParameter(screenCoordinatesByPointerId, "screenCoordinatesByPointerId");
            Intrinsics.checkNotNullParameter(hoveringPointerIds, "hoveringPointerIds");
            this.primaryPointerId = i7;
            this.activePointerId = i10;
            this.lastButtonState = i11;
            this.surfaceId = i12;
            this.offsetByPointerId = offsetByPointerId;
            this.hitPathByPointerId = hitPathByPointerId;
            this.eventCoordinatesByPointerId = eventCoordinatesByPointerId;
            this.screenCoordinatesByPointerId = screenCoordinatesByPointerId;
            this.hoveringPointerIds = new HashSet(hoveringPointerIds);
        }

        public final int getActivePointerId() {
            return this.activePointerId;
        }

        @NotNull
        public final Map<Integer, float[]> getEventCoordinatesByPointerId() {
            return this.eventCoordinatesByPointerId;
        }

        @NotNull
        public final Map<Integer, List<TouchTargetHelper.ViewTarget>> getHitPathByPointerId() {
            return this.hitPathByPointerId;
        }

        @NotNull
        public final List<TouchTargetHelper.ViewTarget> getHitPathForActivePointer() {
            List<TouchTargetHelper.ViewTarget> list = this.hitPathByPointerId.get(Integer.valueOf(this.activePointerId));
            if (list != null) {
                return list;
            }
            throw new IllegalStateException("Required value was null.");
        }

        @NotNull
        public final List<Integer> getHitPathViewIdsForActivePointer() {
            List<TouchTargetHelper.ViewTarget> list = this.hitPathByPointerId.get(Integer.valueOf(this.activePointerId));
            if (list == null) {
                throw new IllegalStateException("Required value was null.");
            }
            List<TouchTargetHelper.ViewTarget> list2 = list;
            ArrayList arrayList = new ArrayList(e0.l(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((TouchTargetHelper.ViewTarget) it.next()).getViewId()));
            }
            return arrayList;
        }

        @NotNull
        public final Set<Integer> getHoveringPointerIds() {
            return this.hoveringPointerIds;
        }

        public final int getLastButtonState() {
            return this.lastButtonState;
        }

        @NotNull
        public final Map<Integer, float[]> getOffsetByPointerId() {
            return this.offsetByPointerId;
        }

        public final int getPrimaryPointerId() {
            return this.primaryPointerId;
        }

        @NotNull
        public final Map<Integer, float[]> getScreenCoordinatesByPointerId() {
            return this.screenCoordinatesByPointerId;
        }

        public final int getSurfaceId() {
            return this.surfaceId;
        }

        public final boolean supportsHover(int pointerId) {
            return this.hoveringPointerIds.contains(Integer.valueOf(pointerId));
        }
    }

    static {
        Intrinsics.checkNotNullExpressionValue("PointerEvent", "getSimpleName(...)");
        TAG = "PointerEvent";
        EVENTS_POOL = new Pools$SynchronizedPool(6);
    }

    public /* synthetic */ PointerEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final void addModifierKeyData(WritableMap pointerEvent, int modifierKeyMask) {
        pointerEvent.putBoolean("ctrlKey", (modifierKeyMask & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0);
        pointerEvent.putBoolean("shiftKey", (modifierKeyMask & 1) != 0);
        pointerEvent.putBoolean("altKey", (modifierKeyMask & 2) != 0);
        pointerEvent.putBoolean("metaKey", (modifierKeyMask & 65536) != 0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        if (r1.equals(com.facebook.react.uimanager.events.PointerEventHelper.POINTER_OUT) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        if (r1.equals(com.facebook.react.uimanager.events.PointerEventHelper.POINTER_CANCEL) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        if (r1.equals(com.facebook.react.uimanager.events.PointerEventHelper.CLICK) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
    
        if (r1.equals(com.facebook.react.uimanager.events.PointerEventHelper.POINTER_UP) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0045, code lost:
    
        if (r1.equals(com.facebook.react.uimanager.events.PointerEventHelper.POINTER_OVER) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004e, code lost:
    
        if (r1.equals(com.facebook.react.uimanager.events.PointerEventHelper.POINTER_MOVE) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0055, code lost:
    
        return createW3CPointerEvents();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005c, code lost:
    
        if (r1.equals(com.facebook.react.uimanager.events.PointerEventHelper.POINTER_DOWN) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0065, code lost:
    
        if (r1.equals(com.facebook.react.uimanager.events.PointerEventHelper.POINTER_LEAVE) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006e, code lost:
    
        if (r1.equals(com.facebook.react.uimanager.events.PointerEventHelper.POINTER_ENTER) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0079, code lost:
    
        return kotlin.collections.c0.c(createW3CPointerEvent(r0));
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List<com.facebook.react.bridge.WritableMap> createPointersEventData() {
        /*
            r4 = this;
            android.view.MotionEvent r0 = r4.motionEvent
            if (r0 == 0) goto L7a
            int r0 = r0.getActionIndex()
            java.lang.String r1 = r4._eventName
            r2 = 0
            if (r1 != 0) goto L13
            java.lang.String r1 = "_eventName"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            r1 = r2
        L13:
            int r3 = r1.hashCode()
            switch(r3) {
                case -1786514288: goto L68;
                case -1780335505: goto L5f;
                case -1304584214: goto L56;
                case -1304316135: goto L48;
                case -1304250340: goto L3f;
                case -1065042973: goto L36;
                case -992108237: goto L2d;
                case 383186882: goto L24;
                case 1343400710: goto L1b;
                default: goto L1a;
            }
        L1a:
            goto L70
        L1b:
            java.lang.String r3 = "topPointerOut"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L71
            goto L70
        L24:
            java.lang.String r0 = "topPointerCancel"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L51
            goto L70
        L2d:
            java.lang.String r3 = "topClick"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L71
            goto L70
        L36:
            java.lang.String r3 = "topPointerUp"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L71
            goto L70
        L3f:
            java.lang.String r3 = "topPointerOver"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L71
            goto L70
        L48:
            java.lang.String r0 = "topPointerMove"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L51
            goto L70
        L51:
            java.util.List r0 = r4.createW3CPointerEvents()
            return r0
        L56:
            java.lang.String r3 = "topPointerDown"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L71
            goto L70
        L5f:
            java.lang.String r3 = "topPointerLeave"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L71
            goto L70
        L68:
            java.lang.String r3 = "topPointerEnter"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L71
        L70:
            return r2
        L71:
            com.facebook.react.bridge.WritableMap r0 = r4.createW3CPointerEvent(r0)
            java.util.List r0 = kotlin.collections.c0.c(r0)
            return r0
        L7a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Required value was null."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.events.PointerEvent.createPointersEventData():java.util.List");
    }

    private final WritableMap createW3CPointerEvent(int index) {
        double pressure;
        WritableMap writableMapCreateMap = Arguments.createMap();
        MotionEvent motionEvent = this.motionEvent;
        if (motionEvent == null) {
            throw new IllegalStateException("Required value was null.");
        }
        int pointerId = motionEvent.getPointerId(index);
        PointerEventState pointerEventState = this.eventState;
        if (pointerEventState == null) {
            throw new IllegalStateException("Required value was null.");
        }
        writableMapCreateMap.putDouble("pointerId", pointerId);
        String w3CPointerType = PointerEventHelper.getW3CPointerType(motionEvent.getToolType(index));
        writableMapCreateMap.putString("pointerType", w3CPointerType);
        writableMapCreateMap.putBoolean("isPrimary", !isClickEvent() && (pointerEventState.supportsHover(pointerId) || pointerId == pointerEventState.getPrimaryPointerId()));
        float[] fArr = pointerEventState.getEventCoordinatesByPointerId().get(Integer.valueOf(pointerId));
        if (fArr == null) {
            throw new IllegalStateException("Required value was null.");
        }
        float[] fArr2 = fArr;
        double dIPFromPixel = PixelUtil.toDIPFromPixel(fArr2[0]);
        double dIPFromPixel2 = PixelUtil.toDIPFromPixel(fArr2[1]);
        writableMapCreateMap.putDouble("clientX", dIPFromPixel);
        writableMapCreateMap.putDouble("clientY", dIPFromPixel2);
        float[] fArr3 = pointerEventState.getScreenCoordinatesByPointerId().get(Integer.valueOf(pointerId));
        if (fArr3 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        float[] fArr4 = fArr3;
        double dIPFromPixel3 = PixelUtil.toDIPFromPixel(fArr4[0]);
        double dIPFromPixel4 = PixelUtil.toDIPFromPixel(fArr4[1]);
        writableMapCreateMap.putDouble("screenX", dIPFromPixel3);
        writableMapCreateMap.putDouble("screenY", dIPFromPixel4);
        writableMapCreateMap.putDouble("x", dIPFromPixel);
        writableMapCreateMap.putDouble("y", dIPFromPixel2);
        writableMapCreateMap.putDouble("pageX", dIPFromPixel);
        writableMapCreateMap.putDouble("pageY", dIPFromPixel2);
        float[] fArr5 = pointerEventState.getOffsetByPointerId().get(Integer.valueOf(pointerId));
        if (fArr5 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        float[] fArr6 = fArr5;
        writableMapCreateMap.putDouble("offsetX", PixelUtil.toDIPFromPixel(fArr6[0]));
        writableMapCreateMap.putDouble("offsetY", PixelUtil.toDIPFromPixel(fArr6[1]));
        writableMapCreateMap.putInt("target", getViewTag());
        writableMapCreateMap.putDouble("timestamp", getTimestampMs());
        writableMapCreateMap.putInt("detail", 0);
        writableMapCreateMap.putDouble("tiltX", 0.0d);
        writableMapCreateMap.putDouble("tiltY", 0.0d);
        writableMapCreateMap.putInt("twist", 0);
        if (Intrinsics.areEqual(w3CPointerType, PointerEventHelper.POINTER_TYPE_MOUSE) || isClickEvent()) {
            writableMapCreateMap.putDouble("width", 1.0d);
            writableMapCreateMap.putDouble("height", 1.0d);
        } else {
            double dIPFromPixel5 = PixelUtil.toDIPFromPixel(motionEvent.getTouchMajor(index));
            writableMapCreateMap.putDouble("width", dIPFromPixel5);
            writableMapCreateMap.putDouble("height", dIPFromPixel5);
        }
        int buttonState = motionEvent.getButtonState();
        writableMapCreateMap.putInt("button", PointerEventHelper.getButtonChange(w3CPointerType, pointerEventState.getLastButtonState(), buttonState));
        String str = this._eventName;
        String str2 = null;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("_eventName");
            str = null;
        }
        writableMapCreateMap.putInt("buttons", PointerEventHelper.getButtons(str, w3CPointerType, buttonState));
        if (isClickEvent()) {
            pressure = 0.0d;
        } else {
            int i7 = writableMapCreateMap.getInt("buttons");
            String str3 = this._eventName;
            if (str3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("_eventName");
            } else {
                str2 = str3;
            }
            pressure = PointerEventHelper.getPressure(i7, str2);
        }
        writableMapCreateMap.putDouble("pressure", pressure);
        writableMapCreateMap.putDouble("tangentialPressure", 0.0d);
        List<Integer> list = this.activeHitPathViewIds;
        if (list != null) {
            writableMapCreateMap.putArray("hitPathForEventListener", Arguments.makeNativeArray((List<?>) list));
        }
        addModifierKeyData(writableMapCreateMap, motionEvent.getMetaState());
        return writableMapCreateMap;
    }

    private final List<WritableMap> createW3CPointerEvents() {
        ArrayList arrayList = new ArrayList();
        MotionEvent motionEvent = this.motionEvent;
        if (motionEvent == null) {
            throw new IllegalStateException("Required value was null.");
        }
        int pointerCount = motionEvent.getPointerCount();
        for (int i7 = 0; i7 < pointerCount; i7++) {
            arrayList.add(createW3CPointerEvent(i7));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Event.EventAnimationDriverMatchSpec eventAnimationDriverMatchSpec_delegate$lambda$1(final PointerEvent pointerEvent) {
        return new Event.EventAnimationDriverMatchSpec() { // from class: com.facebook.react.uimanager.events.b
            @Override // com.facebook.react.uimanager.events.Event.EventAnimationDriverMatchSpec
            public final boolean match(int i7, String str) {
                return PointerEvent.eventAnimationDriverMatchSpec_delegate$lambda$1$lambda$0(this.f5341a, i7, str);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean eventAnimationDriverMatchSpec_delegate$lambda$1$lambda$0(PointerEvent pointerEvent, int i7, String eventName) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        String str = pointerEvent._eventName;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("_eventName");
            str = null;
        }
        if (!Intrinsics.areEqual(eventName, str)) {
            return false;
        }
        if (!PointerEventHelper.isBubblingEvent(eventName)) {
            return pointerEvent.getViewTag() == i7;
        }
        PointerEventState pointerEventState = pointerEvent.eventState;
        if (pointerEventState == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Iterator<TouchTargetHelper.ViewTarget> it = pointerEventState.getHitPathForActivePointer().iterator();
        while (it.hasNext()) {
            if (it.next().getViewId() == i7) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void init(String eventName, int targetTag, PointerEventState eventState, MotionEvent motionEventToCopy, short coalescingKey, List<Integer> activeHitPathViewIds) {
        init(eventState.getSurfaceId(), targetTag, motionEventToCopy.getEventTime());
        this._eventName = eventName;
        this.motionEvent = MotionEvent.obtain(motionEventToCopy);
        this.coalescingKey = coalescingKey;
        this.eventState = eventState;
        this.activeHitPathViewIds = activeHitPathViewIds;
    }

    private final boolean isClickEvent() {
        String str = this._eventName;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("_eventName");
            str = null;
        }
        return Intrinsics.areEqual(str, PointerEventHelper.CLICK);
    }

    @NotNull
    public static final PointerEvent obtain(@NotNull String str, int i7, @NotNull PointerEventState pointerEventState, MotionEvent motionEvent) {
        return INSTANCE.obtain(str, i7, pointerEventState, motionEvent);
    }

    @Override // com.facebook.react.uimanager.events.Event
    @d
    public void dispatch(@NotNull RCTEventEmitter rctEventEmitter) {
        Intrinsics.checkNotNullParameter(rctEventEmitter, "rctEventEmitter");
        if (this.motionEvent == null) {
            ReactSoftExceptionLogger.logSoftException(TAG, new IllegalStateException("Cannot dispatch a Pointer that has no MotionEvent; the PointerEvent has been recycled"));
            return;
        }
        if (this.pointersEventData == null) {
            this.pointersEventData = createPointersEventData();
        }
        List<? extends WritableMap> list = this.pointersEventData;
        if (list == null) {
            return;
        }
        boolean z5 = list.size() > 1;
        for (WritableMap writableMapCopy : list) {
            if (z5) {
                writableMapCopy = writableMapCopy.copy();
            }
            int viewTag = getViewTag();
            String str = this._eventName;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("_eventName");
                str = null;
            }
            rctEventEmitter.receiveEvent(viewTag, str, writableMapCopy);
        }
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void dispatchModern(@NotNull RCTModernEventEmitter rctEventEmitter) {
        Intrinsics.checkNotNullParameter(rctEventEmitter, "rctEventEmitter");
        if (this.motionEvent == null) {
            ReactSoftExceptionLogger.logSoftException(TAG, new IllegalStateException("Cannot dispatch a Pointer that has no MotionEvent; the PointerEvent has been recycled"));
            return;
        }
        if (this.pointersEventData == null) {
            this.pointersEventData = createPointersEventData();
        }
        List<? extends WritableMap> list = this.pointersEventData;
        if (list == null) {
            return;
        }
        if (list == null) {
            throw new IllegalStateException("Required value was null.");
        }
        boolean z5 = list.size() > 1;
        for (WritableMap writableMapCopy : list) {
            if (z5) {
                writableMapCopy = writableMapCopy.copy();
            }
            WritableMap writableMap = writableMapCopy;
            int surfaceId = getSurfaceId();
            int viewTag = getViewTag();
            String str = this._eventName;
            String str2 = null;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("_eventName");
                str = null;
            }
            short s2 = this.coalescingKey;
            boolean z6 = s2 != -1;
            String str3 = this._eventName;
            if (str3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("_eventName");
            } else {
                str2 = str3;
            }
            rctEventEmitter.receiveEvent(surfaceId, viewTag, str, z6, s2, writableMap, PointerEventHelper.getEventCategory(str2), getTimestampMs());
        }
    }

    @Override // com.facebook.react.uimanager.events.Event
    public short getCoalescingKey() {
        return this.coalescingKey;
    }

    @Override // com.facebook.react.uimanager.events.Event
    @NotNull
    public Event.EventAnimationDriverMatchSpec getEventAnimationDriverMatchSpec() {
        return (Event.EventAnimationDriverMatchSpec) this.eventAnimationDriverMatchSpec.getValue();
    }

    @Override // com.facebook.react.uimanager.events.Event
    @NotNull
    /* JADX INFO: renamed from: getEventName */
    public String getName() {
        String str = this._eventName;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("_eventName");
        return null;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void onDispose() {
        this.eventState = null;
        this.pointersEventData = null;
        MotionEvent motionEvent = this.motionEvent;
        if (motionEvent != null) {
            motionEvent.recycle();
        }
        this.motionEvent = null;
        try {
            EVENTS_POOL.release(this);
        } catch (IllegalStateException e10) {
            ReactSoftExceptionLogger.logSoftException(TAG, e10);
        }
    }

    private PointerEvent() {
        this.coalescingKey = UNSET_COALESCING_KEY;
        this.eventAnimationDriverMatchSpec = l.a(m.f19487i, new Function0() { // from class: com.facebook.react.uimanager.events.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PointerEvent.eventAnimationDriverMatchSpec_delegate$lambda$1(this.f5342d);
            }
        });
    }

    @NotNull
    public static final PointerEvent obtain(@NotNull String str, int i7, @NotNull PointerEventState pointerEventState, MotionEvent motionEvent, List<Integer> list) {
        return INSTANCE.obtain(str, i7, pointerEventState, motionEvent, list);
    }

    @NotNull
    public static final PointerEvent obtain(@NotNull String str, int i7, @NotNull PointerEventState pointerEventState, MotionEvent motionEvent, short s2) {
        return INSTANCE.obtain(str, i7, pointerEventState, motionEvent, s2);
    }
}
