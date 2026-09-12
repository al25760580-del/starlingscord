package hf;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.MenuItem;
import android.view.PixelCopy;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.Window;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.android.core.internal.util.j;
import io.sentry.android.core.k0;
import java.io.ByteArrayOutputStream;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Context f10724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Boolean f10725b;

    /* JADX WARN: Code duplicated, block: B:55:0x00df A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:56:0x00e0 A[RETURN] */
    public static Bitmap a(Activity activity, io.sentry.util.thread.a aVar, ILogger iLogger, k0 k0Var) {
        ILogger iLogger2;
        Throwable th2;
        boolean z5 = false;
        if (activity.isFinishing() || activity.isDestroyed()) {
            iLogger.q(SentryLevel.DEBUG, "Activity isn't valid, not taking screenshot.", new Object[0]);
            return null;
        }
        Window window = activity.getWindow();
        if (window == null) {
            iLogger.q(SentryLevel.DEBUG, "Activity window is null, not taking screenshot.", new Object[0]);
            return null;
        }
        View viewPeekDecorView = window.peekDecorView();
        if (viewPeekDecorView == null) {
            iLogger.q(SentryLevel.DEBUG, "DecorView is null, not taking screenshot.", new Object[0]);
            return null;
        }
        View rootView = viewPeekDecorView.getRootView();
        if (rootView == null) {
            iLogger.q(SentryLevel.DEBUG, "Root view is null, not taking screenshot.", new Object[0]);
            return null;
        }
        if (rootView.getWidth() <= 0 || rootView.getHeight() <= 0) {
            iLogger.q(SentryLevel.DEBUG, "View's width and height is zeroed, not taking screenshot.", new Object[0]);
            return null;
        }
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(rootView.getWidth(), rootView.getHeight(), Bitmap.Config.ARGB_8888);
            CountDownLatch countDownLatch = new CountDownLatch(1);
            k0Var.getClass();
            try {
                if (Build.VERSION.SDK_INT < 26) {
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    if (aVar.c()) {
                        rootView.draw(canvas);
                        countDownLatch.countDown();
                        iLogger2 = iLogger;
                    } else {
                        iLogger2 = iLogger;
                        try {
                            activity.runOnUiThread(new cb.a(8, rootView, canvas, iLogger2, countDownLatch));
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    }
                    if (countDownLatch.await(1000L, TimeUnit.MILLISECONDS)) {
                        return bitmapCreateBitmap;
                    }
                    return null;
                }
                HandlerThread handlerThread = new HandlerThread("SentryScreenshot");
                handlerThread.start();
                try {
                    Handler handler = new Handler(handlerThread.getLooper());
                    AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                    PixelCopy.request(window, bitmapCreateBitmap, new j(0, atomicBoolean, countDownLatch), handler);
                    if (countDownLatch.await(1000L, TimeUnit.MILLISECONDS) && atomicBoolean.get()) {
                        z5 = true;
                    }
                } catch (Throwable th4) {
                    try {
                        iLogger.g(SentryLevel.ERROR, "Taking screenshot using PixelCopy failed.", th4);
                    } catch (Throwable th5) {
                        handlerThread.quit();
                        throw th5;
                    }
                }
                handlerThread.quit();
                if (z5) {
                    return bitmapCreateBitmap;
                }
                return null;
            } catch (Throwable th6) {
                th2 = th6;
                iLogger2 = iLogger;
            }
        } catch (Throwable th7) {
            th = th7;
            iLogger2 = iLogger;
        }
        th2 = th;
        iLogger2.g(SentryLevel.ERROR, "Taking screenshot failed.", th2);
        return null;
    }

    public static void b(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (Build.VERSION.SDK_INT < 34 || context.getApplicationInfo().targetSdkVersion < 34) {
            context.registerReceiver(broadcastReceiver, intentFilter);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter, 4);
        }
    }

    public static byte[] c(Bitmap bitmap, ILogger iLogger) {
        if (bitmap != null && !bitmap.isRecycled()) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
                    bitmap.recycle();
                    if (byteArrayOutputStream.size() <= 0) {
                        iLogger.q(SentryLevel.DEBUG, "Screenshot is 0 bytes, not attaching the image.", new Object[0]);
                        byteArrayOutputStream.close();
                        return null;
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    return byteArray;
                } catch (Throwable th2) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                iLogger.g(SentryLevel.ERROR, "Compressing bitmap failed.", th4);
            }
        }
        return null;
    }

    public static Icon d(Bitmap bitmap) {
        return Icon.createWithAdaptiveBitmap(bitmap);
    }

    public static void e(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        int i7 = configuration.colorMode & 3;
        int i10 = configuration2.colorMode & 3;
        if (i7 != i10) {
            configuration3.colorMode |= i10;
        }
        int i11 = configuration.colorMode & 12;
        int i12 = configuration2.colorMode & 12;
        if (i11 != i12) {
            configuration3.colorMode |= i12;
        }
    }

    public static float f(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    public static float g(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }

    public static synchronized boolean h(Context context) {
        Boolean bool;
        Context applicationContext = context.getApplicationContext();
        Context context2 = f10724a;
        if (context2 != null && (bool = f10725b) != null && context2 == applicationContext) {
            return bool.booleanValue();
        }
        f10725b = null;
        if (ff.c.c()) {
            f10725b = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
        } else {
            try {
                context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                f10725b = Boolean.TRUE;
            } catch (ClassNotFoundException unused) {
                f10725b = Boolean.FALSE;
            }
        }
        f10724a = applicationContext;
        return f10725b.booleanValue();
    }

    public static void i(byte[] bArr) {
        for (int i7 = 0; i7 < bArr.length / 2; i7++) {
            byte b10 = bArr[i7];
            bArr[i7] = bArr[(bArr.length - i7) - 1];
            bArr[(bArr.length - i7) - 1] = b10;
        }
    }

    public static void j(MenuItem menuItem, char c8, int i7) {
        menuItem.setAlphabeticShortcut(c8, i7);
    }

    public static void k(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setContentDescription(charSequence);
    }

    public static void l(Animator animator, long j) {
        ((AnimatorSet) animator).setCurrentPlayTime(j);
    }

    public static void m(MenuItem menuItem, ColorStateList colorStateList) {
        menuItem.setIconTintList(colorStateList);
    }

    public static void n(MenuItem menuItem, PorterDuff.Mode mode) {
        menuItem.setIconTintMode(mode);
    }

    public static void o(MenuItem menuItem, char c8, int i7) {
        menuItem.setNumericShortcut(c8, i7);
    }

    public static void p(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setTooltipText(charSequence);
    }
}
