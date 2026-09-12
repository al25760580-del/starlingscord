package com.appsflyer.internal;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AFi1fSDKT8615$AFa1uSDK implements OnCompleteListener<IntegrityTokenResponse> {
    private final long getMediationNetwork;
    private /* synthetic */ AFi1jSDK getRevenue;

    public AFi1fSDKT8615$AFa1uSDK(AFi1jSDK aFi1jSDK, long j) {
        this.getRevenue = aFi1jSDK;
        this.getMediationNetwork = j;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(@NotNull Task<IntegrityTokenResponse> task) throws Throwable {
        long j;
        Object objInvoke;
        String strA;
        Intrinsics.checkNotNullParameter(task, "");
        char c8 = 2;
        char c10 = 1;
        if (task.m()) {
            strA = ((IntegrityTokenResponse) task.i()).a();
            c8 = 2;
            c10 = 1;
            objInvoke = null;
            j = 0;
        } else {
            try {
                Object[] objArr = {this.getRevenue, task.h()};
                Map map = AFi1hSDK.f3858d;
                Object method = map.get(-556555390);
                if (method != null) {
                    j = 0;
                } else {
                    j = 0;
                    method = ((Class) AFi1hSDK.getCurrencyIso4217Code((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 37 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), Color.red(0))).getMethod("AFAdRevenueData", (Class) AFi1hSDK.getCurrencyIso4217Code((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), 35 - TextUtils.indexOf((CharSequence) "", '0', 0), KeyEvent.keyCodeFromString("")), Exception.class);
                    map.put(-556555390, method);
                }
                objInvoke = ((Method) method).invoke(null, objArr);
                strA = null;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
        AFi1jSDK aFi1jSDK = this.getRevenue;
        long j5 = this.getMediationNetwork;
        Object[] objArr2 = new Object[4];
        objArr2[3] = objInvoke;
        objArr2[c8] = strA;
        objArr2[c10] = Long.valueOf(j5);
        objArr2[0] = aFi1jSDK;
        Map map2 = AFi1hSDK.f3858d;
        Object method2 = map2.get(1107971505);
        if (method2 == null) {
            method2 = ((Class) AFi1hSDK.getCurrencyIso4217Code((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)) + 35, Process.myPid() >> 22)).getMethod("getCurrencyIso4217Code", (Class) AFi1hSDK.getCurrencyIso4217Code((char) (ViewConfiguration.getPressedStateDuration() >> 16), 36 - View.MeasureSpec.getSize(0), ViewConfiguration.getScrollBarFadeDuration() >> 16), Long.TYPE, String.class, String.class);
            map2.put(1107971505, method2);
        }
        ((Method) method2).invoke(null, objArr2);
        Object[] objArr3 = {this.getRevenue};
        Object method3 = map2.get(1522770359);
        if (method3 == null) {
            method3 = ((Class) AFi1hSDK.getCurrencyIso4217Code((char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 36, TextUtils.getCapsMode("", 0, 0))).getMethod("getCurrencyIso4217Code", (Class) AFi1hSDK.getCurrencyIso4217Code((char) (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 36, 1 - (ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1))));
            map2.put(1522770359, method3);
        }
        ((CountDownLatch) ((Method) method3).invoke(null, objArr3)).countDown();
    }
}
