package bc;

import android.os.Handler;
import android.os.Process;
import com.appsflyer.internal.AFj1rSDK;
import com.discord.chat.presentation.message.view.voicemessages.AudioPlayerModule;
import com.discord.crash_reporting.TelemetryRing;
import com.discord.device.DeviceAccessibilityModule;
import com.facebook.common.references.CloseableReference;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.runtime.ReactHostImpl;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import com.swmansion.reanimated.ReanimatedModule;
import io.sentry.android.ndk.SentryNdk;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.webrtc.EglBase10Impl;
import org.webrtc.EglBase14Impl;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3088d;

    public /* synthetic */ a(int i7) {
        this.f3088d = i7;
    }

    private final void a() {
    }

    private final void b() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3088d) {
            case 0:
                int i7 = AlarmManagerSchedulerBroadcastReceiver.f5496a;
                return;
            case 1:
                AFj1rSDK.getMonetizationNetwork();
                return;
            case 2:
                AudioPlayerModule.maybePlayCurrentPlayer$lambda$1();
                return;
            case 3:
                TelemetryRing.clear$lambda$9();
                return;
            case 4:
                TelemetryRing.scheduleFlush$lambda$11();
                return;
            case 5:
                ReactInstanceManager.lambda$setupReactContext$4();
                return;
            case 6:
                Process.setThreadPriority(0);
                return;
            case 7:
                ReactHostImpl.getOrCreateReactInstanceTask$lambda$45$lambda$41$lambda$40();
                return;
            case 8:
                ReanimatedModule.lambda$new$1();
                return;
            case 9:
                return;
            case 10:
                io.sentry.android.core.internal.util.e.f12291b = Process.myTid();
                return;
            case 11:
                SentryNdk.lambda$static$0();
                return;
            case 12:
                EglBase10Impl.EglConnection.lambda$new$1();
                return;
            case 13:
                EglBase14Impl.EglConnection.lambda$new$1();
                return;
            case 14:
                ConcurrentHashMap concurrentHashMap = q9.b.f18645d;
                float andSet = q9.b.f18642a.getAndSet(0);
                float andSet2 = q9.b.f18643b.getAndSet(0);
                float andSet3 = q9.b.f18644c.getAndSet(0);
                float f2 = andSet + andSet2 + andSet3;
                if (f2 > 0.0f) {
                    float f7 = andSet / f2;
                    float f10 = andSet3 / f2;
                    if (andSet2 / f2 > 0.25f || f10 > 0.1f) {
                        for (Map.Entry entry : concurrentHashMap.entrySet()) {
                            q9.b.a((o9.e) entry.getKey(), -((Number) entry.getValue()).intValue());
                        }
                    } else if (f7 > 0.98f) {
                        for (Map.Entry entry2 : concurrentHashMap.entrySet()) {
                            q9.b.a((o9.e) entry2.getKey(), ((Number) entry2.getValue()).intValue());
                        }
                    }
                    concurrentHashMap.clear();
                }
                ((Handler) q9.b.f18646e.getValue()).postDelayed(q9.b.f18647f, 2000L);
                return;
            case 15:
                long jCurrentTimeMillis = System.currentTimeMillis() - 10000;
                ConcurrentHashMap concurrentHashMap2 = q9.e.f18661d;
                Date until = new Date(jCurrentTimeMillis);
                Intrinsics.checkNotNullParameter(until, "until");
                ConcurrentHashMap concurrentHashMap3 = q9.e.f18661d;
                synchronized (concurrentHashMap3) {
                    try {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry entry3 : concurrentHashMap3.entrySet()) {
                            if (((q9.g) entry3.getValue()).f18670b.compareTo(until) < 0) {
                                linkedHashMap.put(entry3.getKey(), entry3.getValue());
                            }
                        }
                        for (Map.Entry entry4 : linkedHashMap.entrySet()) {
                            q9.d dVar = ((q9.g) entry4.getValue()).f18669a;
                            ConcurrentHashMap concurrentHashMap4 = dVar.f18656f;
                            Collection collectionValues = concurrentHashMap4.values();
                            Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
                            Iterator it = collectionValues.iterator();
                            while (it.hasNext()) {
                                CloseableReference.l(((q9.c) it.next()).f18649a);
                            }
                            concurrentHashMap4.clear();
                            dVar.j = -1;
                            q9.e.f18661d.remove(entry4.getKey());
                        }
                        Unit unit = Unit.f14616a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                ((Handler) q9.b.f18646e.getValue()).postDelayed(q9.b.f18648g, 10000L);
                return;
            case 16:
                DeviceAccessibilityModule.disableFocusLock$lambda$3();
                return;
            default:
                return;
        }
    }
}
