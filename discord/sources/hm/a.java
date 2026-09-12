package hm;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.SystemClock;
import android.window.OnBackInvokedDispatcher;
import androidx.core.app.FrameMetricsAggregator;
import com.discord.notifications.service.utils.FCMTokenHelper;
import com.facebook.cache.common.CacheKey;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager;
import com.swmansion.gesturehandler.react.RNGestureHandlerDetectorViewManager;
import com.swmansion.gesturehandler.react.RNGestureHandlerRootViewManager;
import ig.c;
import io.sentry.IScope;
import io.sentry.android.core.d1;
import io.sentry.android.core.l0;
import io.sentry.android.replay.capture.SessionCaptureStrategy;
import io.sentry.b4;
import io.sentry.e4;
import io.sentry.h6;
import io.sentry.l;
import io.sentry.n3;
import io.sentry.q1;
import io.sentry.r3;
import io.sentry.transport.f;
import io.sentry.util.d;
import io.sentry.util.j;
import io.sentry.util.m;
import io.sentry.w5;
import java.util.Collections;
import java.util.Timer;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import javax.inject.Provider;
import kotlin.jvm.internal.Intrinsics;
import n8.g;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Provider, c, g, q1, d, n3, f, b4, r3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10947d;

    public /* synthetic */ a(int i7) {
        this.f10947d = i7;
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher i(Object obj) {
        return (OnBackInvokedDispatcher) obj;
    }

    @Override // io.sentry.n3
    public void a(h6 h6Var) {
    }

    @Override // n8.g
    public boolean apply(Object obj) {
        CacheKey it = (CacheKey) obj;
        CancellationException cancellationException = ImagePipeline.k;
        Intrinsics.checkNotNullParameter(it, "it");
        return true;
    }

    @Override // io.sentry.util.d
    public Object b() {
        switch (this.f10947d) {
            case 10:
                return w5.empty();
            case 11:
                return w5.empty();
            case 13:
                return new e4();
            case 14:
                byte[] bArr = new byte[8];
                j.a().b(bArr);
                byte b10 = (byte) (bArr[6] & 15);
                bArr[6] = b10;
                bArr[6] = (byte) (b10 | 64);
                long j = 0;
                for (int i7 = 0; i7 < 8; i7++) {
                    j = (j << 8) | ((long) (bArr[i7] & 255));
                }
                char[] cArr = new char[16];
                m.a(cArr, j);
                return new String(cArr);
            case 16:
                return new FrameMetricsAggregator();
            case 23:
                return new Timer(true);
            case 28:
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                for (io.sentry.clientreport.d dVar : io.sentry.clientreport.d.values()) {
                    for (l lVar : l.values()) {
                        concurrentHashMap.put(new io.sentry.clientreport.c(dVar.getReason(), lVar.getCategory()), new AtomicLong(0L));
                    }
                }
                return Collections.unmodifiableMap(concurrentHashMap);
            default:
                return ls.l.r();
        }
    }

    @Override // io.sentry.b4
    public void c(w5 w5Var) {
        io.sentry.util.a aVar = d1.f12174b;
    }

    @Override // io.sentry.q1
    public Object d() {
        return null;
    }

    @Override // io.sentry.transport.f
    public long e() {
        return SystemClock.uptimeMillis();
    }

    public Object f(Context context) {
        String string;
        switch (this.f10947d) {
            case 18:
                return l0.b(context);
            case 19:
                try {
                    return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                } catch (Throwable unused) {
                    return null;
                }
            case 20:
                try {
                    ApplicationInfo applicationInfo = context.getApplicationInfo();
                    int i7 = applicationInfo.labelRes;
                    if (i7 == 0) {
                        CharSequence charSequence = applicationInfo.nonLocalizedLabel;
                        string = charSequence != null ? charSequence.toString() : context.getPackageManager().getApplicationLabel(applicationInfo).toString();
                    } else {
                        string = context.getString(i7);
                    }
                    return string;
                } catch (Throwable unused2) {
                    return null;
                }
            case 21:
                return l0.a(context);
            default:
                try {
                    return context.getPackageManager().getApplicationInfo(context.getPackageName(), IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                } catch (Throwable unused3) {
                    return null;
                }
        }
    }

    @Override // io.sentry.r3
    public void g(IScope iScope) {
        SessionCaptureStrategy.stop$lambda$1(iScope);
    }

    @Override // javax.inject.Provider
    public Object get() {
        switch (this.f10947d) {
            case 0:
                return new RNGestureHandlerRootViewManager();
            case 1:
                return new RNGestureHandlerButtonViewManager();
            default:
                return new RNGestureHandlerDetectorViewManager();
        }
    }

    @Override // ig.c
    public void onFailure(Exception exc) {
        FCMTokenHelper.getToken$lambda$0(exc);
    }
}
