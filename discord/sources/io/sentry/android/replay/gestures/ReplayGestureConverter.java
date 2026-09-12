package io.sentry.android.replay.gestures;

import android.view.MotionEvent;
import io.sentry.android.replay.ScreenshotRecorderConfig;
import io.sentry.rrweb.e;
import io.sentry.rrweb.g;
import io.sentry.rrweb.h;
import io.sentry.rrweb.i;
import io.sentry.transport.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.c0;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eRP\u0010\u0015\u001a>\u0012\u0004\u0012\u00020\u0010\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00120\u0011j\b\u0012\u0004\u0012\u00020\u0012`\u00130\u000fj\u001e\u0012\u0004\u0012\u00020\u0010\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00120\u0011j\b\u0012\u0004\u0012\u00020\u0012`\u0013`\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019¨\u0006\u001c"}, d2 = {"Lio/sentry/android/replay/gestures/ReplayGestureConverter;", "", "Lio/sentry/transport/f;", "dateProvider", "<init>", "(Lio/sentry/transport/f;)V", "Landroid/view/MotionEvent;", "event", "Lio/sentry/android/replay/ScreenshotRecorderConfig;", "recorderConfig", "", "Lio/sentry/rrweb/e;", "convert", "(Landroid/view/MotionEvent;Lio/sentry/android/replay/ScreenshotRecorderConfig;)Ljava/util/List;", "Lio/sentry/transport/f;", "Ljava/util/LinkedHashMap;", "", "Ljava/util/ArrayList;", "Lio/sentry/rrweb/h;", "Lkotlin/collections/ArrayList;", "Lkotlin/collections/LinkedHashMap;", "currentPositions", "Ljava/util/LinkedHashMap;", "", "touchMoveBaseline", "J", "lastCapturedMoveEvent", "Companion", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nReplayGestureConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReplayGestureConverter.kt\nio/sentry/android/replay/gestures/ReplayGestureConverter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,150:1\n1855#2,2:151\n1549#2:153\n1620#2,3:154\n*S KotlinDebug\n*F\n+ 1 ReplayGestureConverter.kt\nio/sentry/android/replay/gestures/ReplayGestureConverter\n*L\n38#1:151,2\n69#1:153\n69#1:154,3\n*E\n"})
public final class ReplayGestureConverter {
    private static final int CAPTURE_MOVE_EVENT_THRESHOLD = 500;
    private static final int TOUCH_MOVE_DEBOUNCE_THRESHOLD = 50;

    @NotNull
    private final LinkedHashMap<Integer, ArrayList<h>> currentPositions;

    @NotNull
    private final f dateProvider;
    private long lastCapturedMoveEvent;
    private long touchMoveBaseline;
    public static final int $stable = 8;

    public ReplayGestureConverter(@NotNull f dateProvider) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.dateProvider = dateProvider;
        this.currentPositions = new LinkedHashMap<>(10);
    }

    public final List<e> convert(@NotNull MotionEvent event, @NotNull ScreenshotRecorderConfig recorderConfig) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(recorderConfig, "recorderConfig");
        int actionMasked = event.getActionMasked();
        int i7 = 10;
        int i10 = 0;
        List<e> list = null;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    long jE = this.dateProvider.e();
                    long j = this.lastCapturedMoveEvent;
                    if (j != 0 && j + ((long) 50) > jE) {
                        return null;
                    }
                    this.lastCapturedMoveEvent = jE;
                    Set<Integer> setKeySet = this.currentPositions.keySet();
                    Intrinsics.checkNotNullExpressionValue(setKeySet, "<get-keys>(...)");
                    for (Integer num : setKeySet) {
                        Intrinsics.checkNotNull(num);
                        int iFindPointerIndex = event.findPointerIndex(num.intValue());
                        if (iFindPointerIndex != -1) {
                            if (this.touchMoveBaseline == 0) {
                                this.touchMoveBaseline = jE;
                            }
                            ArrayList<h> arrayList = this.currentPositions.get(num);
                            Intrinsics.checkNotNull(arrayList);
                            h hVar = new h();
                            hVar.f13118e = event.getX(iFindPointerIndex) * recorderConfig.getScaleFactorX();
                            hVar.f13119i = recorderConfig.getScaleFactorY() * event.getY(iFindPointerIndex);
                            hVar.f13117d = i10;
                            hVar.f13120v = jE - this.touchMoveBaseline;
                            arrayList.add(hVar);
                        }
                        list = list;
                        i10 = 0;
                    }
                    List<e> list2 = list;
                    long j5 = jE - this.touchMoveBaseline;
                    if (j5 <= 500) {
                        return list2;
                    }
                    ArrayList arrayList2 = new ArrayList(this.currentPositions.size());
                    Iterator<Map.Entry<Integer, ArrayList<h>>> it = this.currentPositions.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry<Integer, ArrayList<h>> next = it.next();
                        int iIntValue = next.getKey().intValue();
                        ArrayList<h> value = next.getValue();
                        if (!value.isEmpty()) {
                            i iVar = new i();
                            iVar.f13111e = jE;
                            ArrayList arrayList3 = new ArrayList(e0.l(value, i7));
                            for (h hVar2 : value) {
                                hVar2.f13120v -= j5;
                                arrayList3.add(hVar2);
                                it = it;
                            }
                            iVar.f13123w = arrayList3;
                            iVar.f13122v = iIntValue;
                            arrayList2.add(iVar);
                            ArrayList<h> arrayList4 = this.currentPositions.get(Integer.valueOf(iIntValue));
                            Intrinsics.checkNotNull(arrayList4);
                            arrayList4.clear();
                            it = it;
                            i7 = 10;
                        }
                    }
                    this.touchMoveBaseline = 0L;
                    return arrayList2;
                }
                if (actionMasked == 3) {
                    this.currentPositions.clear();
                    g gVar = new g();
                    gVar.f13111e = this.dateProvider.e();
                    gVar.f13115x = recorderConfig.getScaleFactorX() * event.getX();
                    gVar.f13116y = recorderConfig.getScaleFactorY() * event.getY();
                    gVar.f13114w = 0;
                    gVar.F = 0;
                    gVar.f13113v = io.sentry.rrweb.f.TouchCancel;
                    return c0.c(gVar);
                }
                if (actionMasked != 5) {
                    if (actionMasked != 6) {
                        return null;
                    }
                }
            }
            int pointerId = event.getPointerId(event.getActionIndex());
            int iFindPointerIndex2 = event.findPointerIndex(pointerId);
            if (iFindPointerIndex2 == -1) {
                return null;
            }
            this.currentPositions.remove(Integer.valueOf(pointerId));
            g gVar2 = new g();
            gVar2.f13111e = this.dateProvider.e();
            gVar2.f13115x = recorderConfig.getScaleFactorX() * event.getX(iFindPointerIndex2);
            gVar2.f13116y = recorderConfig.getScaleFactorY() * event.getY(iFindPointerIndex2);
            gVar2.f13114w = 0;
            gVar2.F = pointerId;
            gVar2.f13113v = io.sentry.rrweb.f.TouchEnd;
            return c0.c(gVar2);
        }
        int pointerId2 = event.getPointerId(event.getActionIndex());
        int iFindPointerIndex3 = event.findPointerIndex(pointerId2);
        if (iFindPointerIndex3 == -1) {
            return null;
        }
        this.currentPositions.put(Integer.valueOf(pointerId2), new ArrayList<>(10));
        g gVar3 = new g();
        gVar3.f13111e = this.dateProvider.e();
        gVar3.f13115x = recorderConfig.getScaleFactorX() * event.getX(iFindPointerIndex3);
        gVar3.f13116y = recorderConfig.getScaleFactorY() * event.getY(iFindPointerIndex3);
        gVar3.f13114w = 0;
        gVar3.F = pointerId2;
        gVar3.f13113v = io.sentry.rrweb.f.TouchStart;
        return c0.c(gVar3);
    }
}
