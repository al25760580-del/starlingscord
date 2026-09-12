package io.sentry.android.replay.capture;

import android.graphics.Bitmap;
import android.view.MotionEvent;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.ViewProps;
import io.sentry.Breadcrumb;
import io.sentry.Hint;
import io.sentry.IScope;
import io.sentry.a6;
import io.sentry.android.replay.GeneratedVideo;
import io.sentry.android.replay.ReplayCache;
import io.sentry.android.replay.ScreenshotRecorderConfig;
import io.sentry.l3;
import io.sentry.protocol.t;
import io.sentry.protocol.v;
import io.sentry.rrweb.c;
import io.sentry.rrweb.j;
import io.sentry.rrweb.k;
import io.sentry.rrweb.m;
import io.sentry.w3;
import io.sentry.w5;
import io.sentry.x0;
import io.sentry.x5;
import io.sentry.y5;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.webrtc.MediaStreamTrack;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000f\b`\u0018\u0000 C2\u00020\u0001:\u0002CDJ/\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH&¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\bH&¢\u0006\u0004\b\u000e\u0010\fJ+\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\b0\u0011H&¢\u0006\u0004\b\u0014\u0010\u0015J5\u0010\u001c\u001a\u00020\b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0018\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\b0\u0018H&¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001eH&¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\b2\u0006\u0010#\u001a\u00020\"H&¢\u0006\u0004\b$\u0010%J\u0019\u0010(\u001a\u00020\b2\b\u0010'\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0000H&¢\u0006\u0004\b*\u0010+R\u001c\u00100\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001c\u00105\u001a\u00020\u00048&@&X¦\u000e¢\u0006\f\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0016\u00109\u001a\u0004\u0018\u0001068&X¦\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u001c\u0010\u0007\u001a\u00020\u00068&@&X¦\u000e¢\u0006\f\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001e\u0010B\u001a\u0004\u0018\u00010\u00128&@&X¦\u000e¢\u0006\f\u001a\u0004\b>\u0010?\"\u0004\b@\u0010A¨\u0006E"}, d2 = {"Lio/sentry/android/replay/capture/CaptureStrategy;", "", "", "segmentId", "Lio/sentry/protocol/v;", "replayId", "Lio/sentry/x5;", "replayType", "", ViewProps.START, "(ILio/sentry/protocol/v;Lio/sentry/x5;)V", "stop", "()V", "pause", "resume", "", "isTerminating", "Lkotlin/Function1;", "Ljava/util/Date;", "onSegmentSent", "captureReplay", "(ZLkotlin/jvm/functions/Function1;)V", "Landroid/graphics/Bitmap;", "bitmap", "Lkotlin/Function2;", "Lio/sentry/android/replay/ReplayCache;", "", "store", "onScreenshotRecorded", "(Landroid/graphics/Bitmap;Lkotlin/jvm/functions/Function2;)V", "Lio/sentry/android/replay/ScreenshotRecorderConfig;", "recorderConfig", "onConfigurationChanged", "(Lio/sentry/android/replay/ScreenshotRecorderConfig;)V", "Landroid/view/MotionEvent;", "event", "onTouchEvent", "(Landroid/view/MotionEvent;)V", "", "screen", "onScreenChanged", "(Ljava/lang/String;)V", "convert", "()Lio/sentry/android/replay/capture/CaptureStrategy;", "getCurrentSegment", "()I", "setCurrentSegment", "(I)V", "currentSegment", "getCurrentReplayId", "()Lio/sentry/protocol/v;", "setCurrentReplayId", "(Lio/sentry/protocol/v;)V", "currentReplayId", "Ljava/io/File;", "getReplayCacheDir", "()Ljava/io/File;", "replayCacheDir", "getReplayType", "()Lio/sentry/x5;", "setReplayType", "(Lio/sentry/x5;)V", "getSegmentTimestamp", "()Ljava/util/Date;", "setSegmentTimestamp", "(Ljava/util/Date;)V", "segmentTimestamp", "Companion", "ReplaySegment", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface CaptureStrategy {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u0005*\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0007J\u008d\u0001\u0010#\u001a\u00020\"2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u001d2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0002¢\u0006\u0004\b#\u0010$J\u0099\u0001\u0010-\u001a\u00020\"2\b\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010'\u001a\u00020\u00172\u0006\u0010(\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010+\u001a\u0004\u0018\u00010*2\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010,\u001a\u00020\u00112\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001d2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f¢\u0006\u0004\b-\u0010.J=\u00105\u001a\u0002012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010/\u001a\u00020\u00172\u0016\b\u0002\u00102\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u000201\u0018\u000100H\u0000¢\u0006\u0004\b3\u00104R\u0014\u00106\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00108\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b8\u00107¨\u00069"}, d2 = {"Lio/sentry/android/replay/capture/CaptureStrategy$Companion;", "", "<init>", "()V", "Lio/sentry/Breadcrumb;", "", "isNetworkAvailable", "(Lio/sentry/Breadcrumb;)Z", "isNetworkConnectivity", "Lio/sentry/w5;", "options", "Ljava/io/File;", MediaStreamTrack.VIDEO_TRACK_KIND, "Lio/sentry/protocol/v;", "currentReplayId", "Ljava/util/Date;", "segmentTimestamp", "", "segmentId", "height", "width", "frameCount", "frameRate", "", "videoDuration", "Lio/sentry/x5;", "replayType", "", "screenAtStart", "", "breadcrumbs", "Ljava/util/Deque;", "Lio/sentry/rrweb/b;", "events", "Lio/sentry/android/replay/capture/CaptureStrategy$ReplaySegment;", "buildReplay", "(Lio/sentry/w5;Ljava/io/File;Lio/sentry/protocol/v;Ljava/util/Date;IIIIIJLio/sentry/x5;Ljava/lang/String;Ljava/util/List;Ljava/util/Deque;)Lio/sentry/android/replay/capture/CaptureStrategy$ReplaySegment;", "Lio/sentry/x0;", "scopes", "duration", "currentSegmentTimestamp", "replayId", "Lio/sentry/android/replay/ReplayCache;", "cache", "bitRate", "createSegment", "(Lio/sentry/x0;Lio/sentry/w5;JLjava/util/Date;Lio/sentry/protocol/v;IIILio/sentry/x5;Lio/sentry/android/replay/ReplayCache;IILjava/lang/String;Ljava/util/List;Ljava/util/Deque;)Lio/sentry/android/replay/capture/CaptureStrategy$ReplaySegment;", "until", "Lkotlin/Function1;", "", "callback", "rotateEvents$sentry_android_replay_release", "(Ljava/util/Deque;JLkotlin/jvm/functions/Function1;)V", "rotateEvents", "NETWORK_BREADCRUMB_START_OFFSET", "J", "MAX_SEGMENT_DURATION", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nCaptureStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CaptureStrategy.kt\nio/sentry/android/replay/capture/CaptureStrategy$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,272:1\n1#2:273\n1855#3,2:274\n1045#3:276\n*S KotlinDebug\n*F\n+ 1 CaptureStrategy.kt\nio/sentry/android/replay/capture/CaptureStrategy$Companion\n*L\n181#1:274,2\n228#1:276\n*E\n"})
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final long MAX_SEGMENT_DURATION = 300000;
        private static final long NETWORK_BREADCRUMB_START_OFFSET = 5000;

        private Companion() {
        }

        /* JADX WARN: Code duplicated, block: B:14:0x00af  */
        /* JADX WARN: Code duplicated, block: B:35:0x010b  */
        private final ReplaySegment buildReplay(w5 options, File video, v currentReplayId, final Date segmentTimestamp, int segmentId, int height, int width, int frameCount, int frameRate, long videoDuration, x5 replayType, String screenAtStart, List<Breadcrumb> breadcrumbs, Deque<io.sentry.rrweb.b> events) {
            boolean z5;
            io.sentry.rrweb.b bVarConvert;
            Object obj;
            Date dateZ = io.sentry.config.a.z(segmentTimestamp.getTime() + videoDuration);
            Intrinsics.checkNotNullExpressionValue(dateZ, "getDateTime(...)");
            y5 y5Var = new y5();
            y5Var.f12670d = currentReplayId;
            y5Var.P = currentReplayId;
            y5Var.Q = segmentId;
            y5Var.R = dateZ;
            y5Var.S = segmentTimestamp;
            y5Var.O = replayType;
            y5Var.M = video;
            final ArrayList arrayList = new ArrayList();
            j jVar = new j();
            jVar.f13111e = segmentTimestamp.getTime();
            jVar.f13127v = height;
            jVar.f13128w = width;
            arrayList.add(jVar);
            m mVar = new m();
            mVar.f13111e = segmentTimestamp.getTime();
            mVar.f13138v = segmentId;
            mVar.f13140x = videoDuration;
            mVar.H = frameCount;
            mVar.f13139w = video.length();
            mVar.J = frameRate;
            mVar.F = height;
            mVar.G = width;
            mVar.K = 0;
            mVar.L = 0;
            arrayList.add(mVar);
            LinkedList linkedList = new LinkedList();
            Iterator<T> it = breadcrumbs.iterator();
            Breadcrumb breadcrumb = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Breadcrumb breadcrumb2 = (Breadcrumb) it.next();
                if (breadcrumb != null) {
                    Companion companion = $$INSTANCE;
                    z5 = companion.isNetworkAvailable(breadcrumb) && companion.isNetworkConnectivity(breadcrumb2) && breadcrumb2.b().getTime() + 5000 >= segmentTimestamp.getTime();
                }
                if ((breadcrumb2.b().getTime() >= segmentTimestamp.getTime() || z5) && breadcrumb2.b().getTime() < dateZ.getTime() && (bVarConvert = options.getReplayController().getReplayBreadcrumbConverter().convert(breadcrumb2)) != null) {
                    arrayList.add(bVarConvert);
                    io.sentry.rrweb.a aVar = bVarConvert instanceof io.sentry.rrweb.a ? (io.sentry.rrweb.a) bVarConvert : null;
                    if (Intrinsics.areEqual(aVar != null ? aVar.f13108x : null, "navigation")) {
                        io.sentry.rrweb.a aVar2 = (io.sentry.rrweb.a) bVarConvert;
                        ConcurrentHashMap concurrentHashMap = aVar2.F;
                        if (concurrentHashMap != null) {
                            Intrinsics.checkNotNull(concurrentHashMap);
                            obj = concurrentHashMap.get("to");
                            if (obj == null) {
                                obj = null;
                            }
                        } else {
                            obj = null;
                        }
                        if (obj instanceof String) {
                            ConcurrentHashMap concurrentHashMap2 = aVar2.F;
                            Intrinsics.checkNotNull(concurrentHashMap2);
                            Object obj2 = concurrentHashMap2.get("to");
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                            linkedList.add((String) obj2);
                        }
                    }
                }
                breadcrumb = breadcrumb2;
            }
            if (screenAtStart != null && !Intrinsics.areEqual(CollectionsKt.firstOrNull(linkedList), screenAtStart)) {
                linkedList.addFirst(screenAtStart);
            }
            rotateEvents$sentry_android_replay_release(events, dateZ.getTime(), new Function1<io.sentry.rrweb.b, Unit>() { // from class: io.sentry.android.replay.capture.CaptureStrategy$Companion$buildReplay$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void invoke(io.sentry.rrweb.b event) {
                    Intrinsics.checkNotNullParameter(event, "event");
                    if (event.f13111e >= segmentTimestamp.getTime()) {
                        arrayList.add(event);
                    }
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                    invoke((io.sentry.rrweb.b) obj3);
                    return Unit.f14616a;
                }
            });
            if (segmentId == 0) {
                k kVar = new k(c.Custom);
                HashMap map = new HashMap();
                kVar.f13131v = map;
                kVar.f13130i = "options";
                t sdkVersion = options.getSdkVersion();
                if (sdkVersion != null) {
                    map.put("nativeSdkName", sdkVersion.f13043d);
                    map.put("nativeSdkVersion", sdkVersion.f13044e);
                }
                a6 sessionReplay = options.getSessionReplay();
                Double d6 = sessionReplay.f12050b;
                CopyOnWriteArraySet copyOnWriteArraySet = sessionReplay.f12051c;
                map.put("errorSampleRate", d6);
                map.put("sessionSampleRate", sessionReplay.f12049a);
                map.put("maskAllImages", Boolean.valueOf(copyOnWriteArraySet.contains("android.widget.ImageView")));
                map.put("maskAllText", Boolean.valueOf(copyOnWriteArraySet.contains("android.widget.TextView")));
                map.put("quality", sessionReplay.f12055g.serializedName());
                map.put("maskedViewClasses", copyOnWriteArraySet);
                map.put("unmaskedViewClasses", sessionReplay.f12052d);
                map.put("screenshotStrategy", sessionReplay.f12061o == w3.PIXEL_COPY ? "pixelCopy" : "canvas");
                map.put("networkDetailHasUrls", Boolean.valueOf(!sessionReplay.f12062p.isEmpty()));
                if (!sessionReplay.f12062p.isEmpty()) {
                    map.put("networkDetailAllowUrls", sessionReplay.f12062p);
                    map.put("networkRequestHeaders", sessionReplay.f12065s);
                    map.put("networkResponseHeaders", sessionReplay.f12066t);
                    map.put("networkCaptureBodies", Boolean.valueOf(sessionReplay.f12064r));
                    if (!sessionReplay.f12063q.isEmpty()) {
                        map.put("networkDetailDenyUrls", sessionReplay.f12063q);
                    }
                }
                arrayList.add(kVar);
            }
            l3 l3Var = new l3();
            l3Var.f12793d = Integer.valueOf(segmentId);
            l3Var.f12794e = CollectionsKt.e0(arrayList, new Comparator() { // from class: io.sentry.android.replay.capture.CaptureStrategy$Companion$buildReplay$lambda$8$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t5, T t10) {
                    return tn.a.a(Long.valueOf(((io.sentry.rrweb.b) t5).f13111e), Long.valueOf(((io.sentry.rrweb.b) t10).f13111e));
                }
            });
            y5Var.T = linkedList;
            return new ReplaySegment.Created(y5Var, l3Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Type inference failed for: r0v1, types: [T, java.util.ArrayList] */
        public static final void createSegment$lambda$1(Ref.ObjectRef objectRef, IScope scope) {
            Intrinsics.checkNotNullParameter(scope, "scope");
            objectRef.element = new ArrayList(scope.w());
        }

        private final boolean isNetworkAvailable(Breadcrumb breadcrumb) {
            if (breadcrumb == null || !Intrinsics.areEqual(breadcrumb.f12010y, "network.event")) {
                return false;
            }
            ConcurrentHashMap concurrentHashMap = breadcrumb.f12009x;
            Intrinsics.checkNotNullExpressionValue(concurrentHashMap, "getData(...)");
            Object obj = concurrentHashMap.get("action");
            if (obj == null) {
                obj = null;
            }
            return Intrinsics.areEqual(obj, "NETWORK_AVAILABLE");
        }

        private final boolean isNetworkConnectivity(Breadcrumb breadcrumb) {
            return Intrinsics.areEqual(breadcrumb.f12010y, "network.event") && breadcrumb.f12009x.containsKey("network_type");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void rotateEvents$sentry_android_replay_release$default(Companion companion, Deque deque, long j, Function1 function1, int i7, Object obj) {
            if ((i7 & 4) != 0) {
                function1 = null;
            }
            companion.rotateEvents$sentry_android_replay_release(deque, j, function1);
        }

        /* JADX WARN: Type inference failed for: r7v2, types: [T, kotlin.collections.n0] */
        @NotNull
        public final ReplaySegment createSegment(x0 scopes, @NotNull w5 options, long duration, @NotNull Date currentSegmentTimestamp, @NotNull v replayId, int segmentId, int height, int width, @NotNull x5 replayType, ReplayCache cache, int frameRate, int bitRate, String screenAtStart, List<Breadcrumb> breadcrumbs, @NotNull Deque<io.sentry.rrweb.b> events) {
            GeneratedVideo generatedVideoCreateVideoOf$default;
            List<Breadcrumb> list;
            Intrinsics.checkNotNullParameter(options, "options");
            Intrinsics.checkNotNullParameter(currentSegmentTimestamp, "currentSegmentTimestamp");
            Intrinsics.checkNotNullParameter(replayId, "replayId");
            Intrinsics.checkNotNullParameter(replayType, "replayType");
            Intrinsics.checkNotNullParameter(events, "events");
            if (cache == null || (generatedVideoCreateVideoOf$default = ReplayCache.createVideoOf$default(cache, Math.min(duration, 300000L), currentSegmentTimestamp.getTime(), segmentId, height, width, frameRate, bitRate, null, IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT, null)) == null) {
                return ReplaySegment.Failed.INSTANCE;
            }
            File fileComponent1 = generatedVideoCreateVideoOf$default.getVideo();
            int iComponent2 = generatedVideoCreateVideoOf$default.getFrameCount();
            long jComponent3 = generatedVideoCreateVideoOf$default.getDuration();
            if (breadcrumbs == null) {
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                objectRef.element = n0.f14659d;
                if (scopes != null) {
                    scopes.r(null, new io.sentry.android.replay.a(objectRef, 1));
                }
                list = (List) objectRef.element;
            } else {
                list = breadcrumbs;
            }
            return buildReplay(options, fileComponent1, replayId, currentSegmentTimestamp, segmentId, height, width, iComponent2, frameRate, jComponent3, replayType, screenAtStart, list, events);
        }

        public final void rotateEvents$sentry_android_replay_release(@NotNull Deque<io.sentry.rrweb.b> events, long until, Function1<? super io.sentry.rrweb.b, Unit> callback) {
            Intrinsics.checkNotNullParameter(events, "events");
            Iterator<io.sentry.rrweb.b> it = events.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
            while (it.hasNext()) {
                io.sentry.rrweb.b next = it.next();
                if (next.f13111e < until) {
                    if (callback != null) {
                        Intrinsics.checkNotNull(next);
                        callback.invoke(next);
                    }
                    it.remove();
                }
            }
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onScreenChanged(@NotNull CaptureStrategy captureStrategy, String str) {
        }

        public static /* synthetic */ void onScreenshotRecorded$default(CaptureStrategy captureStrategy, Bitmap bitmap, Function2 function2, int i7, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onScreenshotRecorded");
            }
            if ((i7 & 1) != 0) {
                bitmap = null;
            }
            captureStrategy.onScreenshotRecorded(bitmap, function2);
        }

        public static /* synthetic */ void start$default(CaptureStrategy captureStrategy, int i7, v vVar, x5 x5Var, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: start");
            }
            if ((i10 & 1) != 0) {
                i7 = 0;
            }
            if ((i10 & 2) != 0) {
                vVar = new v();
            }
            if ((i10 & 4) != 0) {
                x5Var = null;
            }
            captureStrategy.start(i7, vVar, x5Var);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lio/sentry/android/replay/capture/CaptureStrategy$ReplaySegment;", "", "()V", "Created", "Failed", "Lio/sentry/android/replay/capture/CaptureStrategy$ReplaySegment$Created;", "Lio/sentry/android/replay/capture/CaptureStrategy$ReplaySegment$Failed;", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class ReplaySegment {
        public static final int $stable = 0;

        @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\r\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J$\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0016¨\u0006'"}, d2 = {"Lio/sentry/android/replay/capture/CaptureStrategy$ReplaySegment$Created;", "Lio/sentry/android/replay/capture/CaptureStrategy$ReplaySegment;", "Lio/sentry/y5;", "replay", "Lio/sentry/l3;", "recording", "<init>", "(Lio/sentry/y5;Lio/sentry/l3;)V", "Lio/sentry/x0;", "scopes", "Lio/sentry/Hint;", "hint", "", "capture", "(Lio/sentry/x0;Lio/sentry/Hint;)V", "", "segmentId", "setSegmentId", "(I)V", "component1", "()Lio/sentry/y5;", "component2", "()Lio/sentry/l3;", "copy", "(Lio/sentry/y5;Lio/sentry/l3;)Lio/sentry/android/replay/capture/CaptureStrategy$ReplaySegment$Created;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lio/sentry/y5;", "getReplay", "Lio/sentry/l3;", "getRecording", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @SourceDebugExtension({"SMAP\nCaptureStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CaptureStrategy.kt\nio/sentry/android/replay/capture/CaptureStrategy$ReplaySegment$Created\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,272:1\n1#2:273\n1855#3,2:274\n*S KotlinDebug\n*F\n+ 1 CaptureStrategy.kt\nio/sentry/android/replay/capture/CaptureStrategy$ReplaySegment$Created\n*L\n263#1:274,2\n*E\n"})
        public static final /* data */ class Created extends ReplaySegment {
            public static final int $stable = 8;

            @NotNull
            private final l3 recording;

            @NotNull
            private final y5 replay;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Created(@NotNull y5 replay, @NotNull l3 recording) {
                super(null);
                Intrinsics.checkNotNullParameter(replay, "replay");
                Intrinsics.checkNotNullParameter(recording, "recording");
                this.replay = replay;
                this.recording = recording;
            }

            public static /* synthetic */ void capture$default(Created created, x0 x0Var, Hint hint, int i7, Object obj) {
                if ((i7 & 2) != 0) {
                    hint = new Hint();
                }
                created.capture(x0Var, hint);
            }

            public static /* synthetic */ Created copy$default(Created created, y5 y5Var, l3 l3Var, int i7, Object obj) {
                if ((i7 & 1) != 0) {
                    y5Var = created.replay;
                }
                if ((i7 & 2) != 0) {
                    l3Var = created.recording;
                }
                return created.copy(y5Var, l3Var);
            }

            public final void capture(x0 scopes, @NotNull Hint hint) {
                Intrinsics.checkNotNullParameter(hint, "hint");
                if (scopes != null) {
                    y5 y5Var = this.replay;
                    hint.f12018g = this.recording;
                    Unit unit = Unit.f14616a;
                    scopes.s(y5Var, hint);
                }
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final y5 getReplay() {
                return this.replay;
            }

            @NotNull
            /* JADX INFO: renamed from: component2, reason: from getter */
            public final l3 getRecording() {
                return this.recording;
            }

            @NotNull
            public final Created copy(@NotNull y5 replay, @NotNull l3 recording) {
                Intrinsics.checkNotNullParameter(replay, "replay");
                Intrinsics.checkNotNullParameter(recording, "recording");
                return new Created(replay, recording);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Created)) {
                    return false;
                }
                Created created = (Created) other;
                return Intrinsics.areEqual(this.replay, created.replay) && Intrinsics.areEqual(this.recording, created.recording);
            }

            @NotNull
            public final l3 getRecording() {
                return this.recording;
            }

            @NotNull
            public final y5 getReplay() {
                return this.replay;
            }

            public int hashCode() {
                return this.recording.hashCode() + (this.replay.hashCode() * 31);
            }

            public final void setSegmentId(int segmentId) {
                this.replay.Q = segmentId;
                List<io.sentry.rrweb.b> list = this.recording.f12794e;
                if (list != null) {
                    for (io.sentry.rrweb.b bVar : list) {
                        if (bVar instanceof m) {
                            ((m) bVar).f13138v = segmentId;
                        }
                    }
                }
            }

            @NotNull
            public String toString() {
                return "Created(replay=" + this.replay + ", recording=" + this.recording + ')';
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lio/sentry/android/replay/capture/CaptureStrategy$ReplaySegment$Failed;", "Lio/sentry/android/replay/capture/CaptureStrategy$ReplaySegment;", "()V", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Failed extends ReplaySegment {
            public static final int $stable = 0;

            @NotNull
            public static final Failed INSTANCE = new Failed();

            private Failed() {
                super(null);
            }
        }

        public /* synthetic */ ReplaySegment(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ReplaySegment() {
        }
    }

    void captureReplay(boolean isTerminating, @NotNull Function1<? super Date, Unit> onSegmentSent);

    @NotNull
    CaptureStrategy convert();

    @NotNull
    v getCurrentReplayId();

    int getCurrentSegment();

    File getReplayCacheDir();

    @NotNull
    x5 getReplayType();

    Date getSegmentTimestamp();

    void onConfigurationChanged(@NotNull ScreenshotRecorderConfig recorderConfig);

    void onScreenChanged(String screen);

    void onScreenshotRecorded(Bitmap bitmap, @NotNull Function2<? super ReplayCache, ? super Long, Unit> store);

    void onTouchEvent(@NotNull MotionEvent event);

    void pause();

    void resume();

    void setCurrentReplayId(@NotNull v vVar);

    void setCurrentSegment(int i7);

    void setReplayType(@NotNull x5 x5Var);

    void setSegmentTimestamp(Date date);

    void start(int segmentId, @NotNull v replayId, x5 replayType);

    void stop();
}
