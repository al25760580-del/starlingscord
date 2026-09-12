package hs;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import io.sentry.util.i;
import java.nio.ByteBuffer;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class c extends ThreadLocal {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11126a;

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f11126a) {
            case 0:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(ds.b.f7819e);
                return simpleDateFormat;
            case 1:
                return new DecimalFormat("#.################", DecimalFormatSymbols.getInstance(Locale.ROOT));
            case 2:
                return new i();
            case 3:
                Choreographer choreographer = Choreographer.getInstance();
                Intrinsics.checkNotNullExpressionValue(choreographer, "getInstance()");
                Looper looperMyLooper = Looper.myLooper();
                if (looperMyLooper == null) {
                    throw new IllegalStateException("no Looper on this thread");
                }
                Handler handlerC = a.a.c(looperMyLooper);
                Intrinsics.checkNotNullExpressionValue(handlerC, "createAsync(\n           …d\")\n                    )");
                j0.d dVar = new j0.d(choreographer, handlerC);
                return kotlin.coroutines.e.c(dVar, dVar.I);
            case 4:
                return 0L;
            case 5:
                c cVar = q8.a.f18629a;
                return ByteBuffer.allocate(16384);
            case 6:
                return new PathMeasure();
            case 7:
                return new Path();
            case 8:
                return new Path();
            case 9:
                return new float[4];
            default:
                return Boolean.FALSE;
        }
    }
}
