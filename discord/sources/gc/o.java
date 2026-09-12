package gc;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.Display;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.performance.play.services.PlayServicesDevicePerformance;
import com.facebook.cache.common.CacheKey;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.react.bridge.ReadableMap;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.text.CueGroup;
import com.google.android.exoplayer2.video.VideoSize;
import io.sentry.ILogger;
import io.sentry.IScope;
import io.sentry.SentryLevel;
import io.sentry.android.replay.capture.BufferCaptureStrategy;
import io.sentry.android.replay.capture.SessionCaptureStrategy;
import io.sentry.d6;
import io.sentry.e6;
import io.sentry.h6;
import io.sentry.i6;
import io.sentry.k6;
import io.sentry.m3;
import io.sentry.r3;
import io.sentry.r6;
import io.sentry.react.RNSentryModuleImpl;
import io.sentry.w5;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o implements je.j, di.j, ig.d, ig.c, n8.g, k6, r3, io.sentry.util.runtime.a, io.sentry.util.d, m3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9798d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f9799e;

    public /* synthetic */ o(int i7, Object obj) {
        this.f9798d = i7;
        this.f9799e = obj;
    }

    public boolean a(u4.b bVar, int i7, Bundle bundle) {
        androidx.core.view.e dVar;
        AppCompatEditText appCompatEditText = (AppCompatEditText) this.f9799e;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 25 && (i7 & 1) != 0) {
            try {
                ((m1.f) bVar.f20945e).g();
                Parcelable parcelable = (Parcelable) ((m1.f) bVar.f20945e).q();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e10) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e10);
                return false;
            }
        }
        m1.f fVar = (m1.f) bVar.f20945e;
        ClipData clipData = new ClipData(fVar.getDescription(), new ClipData.Item(fVar.c()));
        if (i10 >= 31) {
            dVar = new androidx.core.view.d(clipData, 2);
        } else {
            androidx.core.view.f fVar2 = new androidx.core.view.f();
            fVar2.f1654b = clipData;
            fVar2.f1655c = 2;
            dVar = fVar2;
        }
        dVar.a(fVar.e());
        dVar.setExtras(bundle);
        return androidx.core.view.u0.l(appCompatEditText, dVar.build()) == null;
    }

    @Override // n8.g
    public boolean apply(Object obj) {
        Uri uri = (Uri) this.f9799e;
        CacheKey key = (CacheKey) obj;
        CancellationException cancellationException = ImagePipeline.k;
        Intrinsics.checkNotNullParameter(uri, "$uri");
        Intrinsics.checkNotNullParameter(key, "key");
        return key.a(uri);
    }

    @Override // io.sentry.util.d
    public Object b() {
        io.sentry.cache.tape.h hVar;
        switch (this.f9798d) {
            case 22:
                return ((io.sentry.cache.c) this.f9799e).f12530d.getSerializer();
            case 23:
                io.sentry.cache.g gVar = (io.sentry.cache.g) this.f9799e;
                w5 w5Var = gVar.f12542a;
                File fileB = io.sentry.cache.a.b(w5Var, ".scope-cache");
                if (fileB == null) {
                    w5Var.getLogger().q(SentryLevel.INFO, "Cache dir is not set, cannot store in scope cache", new Object[0]);
                    return new io.sentry.cache.tape.b();
                }
                File file = new File(fileB, "breadcrumbs.json");
                try {
                    int maxBreadcrumbs = w5Var.getMaxBreadcrumbs();
                    RandomAccessFile randomAccessFileI = io.sentry.cache.tape.h.i(file);
                    try {
                        try {
                            hVar = new io.sentry.cache.tape.h(file, randomAccessFileI, maxBreadcrumbs);
                        } catch (IOException e10) {
                            w5Var.getLogger().g(SentryLevel.ERROR, "Failed to create breadcrumbs queue", e10);
                            return new io.sentry.cache.tape.b();
                        }
                    } catch (Throwable th2) {
                        randomAccessFileI.close();
                        throw th2;
                    }
                    break;
                } catch (IOException unused) {
                    file.delete();
                    int maxBreadcrumbs2 = w5Var.getMaxBreadcrumbs();
                    RandomAccessFile randomAccessFileI2 = io.sentry.cache.tape.h.i(file);
                    try {
                        hVar = new io.sentry.cache.tape.h(file, randomAccessFileI2, maxBreadcrumbs2);
                    } catch (Throwable th3) {
                        randomAccessFileI2.close();
                        throw th3;
                    }
                    break;
                }
                return new io.sentry.cache.tape.d(hVar, new u4.c(gVar));
            default:
                return Boolean.valueOf(io.sentry.util.f.b("androidx.core.app.FrameMetricsAggregator", (ILogger) this.f9799e));
        }
    }

    @Override // io.sentry.k6
    public void c(i6 i6Var) {
        e6 e6Var = (e6) this.f9799e;
        io.sentry.k kVar = e6Var.f12656q;
        if (kVar != null) {
            kVar.b(i6Var);
        }
        d6 d6Var = e6Var.f12647f;
        r6 r6Var = e6Var.f12657r;
        if (r6Var.f13093g == null) {
            if (d6Var.f12629a) {
                e6Var.q(d6Var.f12630b, null);
                return;
            }
            return;
        }
        if (r6Var.f13092f) {
            ListIterator listIterator = e6Var.f12644c.listIterator();
            while (listIterator.hasNext()) {
                i6 i6Var2 = (i6) listIterator.next();
                if (!i6Var2.f12749f && i6Var2.f12745b == null) {
                    return;
                }
            }
        }
        e6Var.m();
    }

    @Override // io.sentry.m3
    public void d(e4.m mVar) {
        ((IScope) this.f9799e).q(new e4.m());
    }

    public void e(Display display) {
        ke.t tVar = (ke.t) this.f9799e;
        tVar.getClass();
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            tVar.k = refreshRate;
            tVar.f14412l = (refreshRate * 80) / 100;
        } else {
            je.b.N("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            tVar.k = -9223372036854775807L;
            tVar.f14412l = -9223372036854775807L;
        }
    }

    @Override // io.sentry.r3
    public void g(IScope iScope) {
        h6 h6VarV;
        switch (this.f9798d) {
            case 12:
                iScope.M(new bc.i(28, (io.sentry.f1) this.f9799e, iScope));
                break;
            case 13:
            case 14:
            case 15:
            default:
                RNSentryModuleImpl.lambda$addBreadcrumb$6((ReadableMap) this.f9799e, iScope);
                break;
            case 16:
                ((AtomicReference) this.f9799e).set(iScope.clone());
                break;
            case 17:
                AtomicLong atomicLong = ((io.sentry.android.core.x0) this.f9799e).f12443d;
                if (atomicLong.get() == 0 && (h6VarV = iScope.v()) != null && h6VarV.c() != null) {
                    atomicLong.set(h6VarV.c().getTime());
                    break;
                }
                break;
            case 18:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f9799e;
                h6 h6VarV2 = iScope.v();
                if (h6VarV2 != null && h6VarV2.c() != null) {
                    atomicBoolean.set(true);
                    break;
                }
                break;
            case 19:
                iScope.M(new io.sentry.android.core.x(2, (io.sentry.android.core.internal.gestures.f) this.f9799e, iScope));
                break;
            case 20:
                BufferCaptureStrategy.captureReplay$lambda$1((BufferCaptureStrategy) this.f9799e, iScope);
                break;
            case 21:
                SessionCaptureStrategy.start$lambda$0((SessionCaptureStrategy) this.f9799e, iScope);
                break;
        }
    }

    @Override // di.j
    public Object get() {
        return Boolean.valueOf(((e0) this.f9799e).V);
    }

    @Override // je.j
    public void invoke(Object obj) {
        switch (this.f9798d) {
            case 0:
                ((com.google.android.exoplayer2.e) obj).onMediaMetadataChanged((MediaMetadata) this.f9799e);
                break;
            case 1:
                ((com.google.android.exoplayer2.e) obj).onCues((List) this.f9799e);
                break;
            case 2:
                ((com.google.android.exoplayer2.e) obj).onCues((CueGroup) this.f9799e);
                break;
            case 3:
                ((com.google.android.exoplayer2.e) obj).onMediaMetadataChanged(((w) this.f9799e).f9916d.M);
                break;
            case 4:
                ((com.google.android.exoplayer2.e) obj).onMetadata((Metadata) this.f9799e);
                break;
            default:
                ((com.google.android.exoplayer2.e) obj).onVideoSizeChanged((VideoSize) this.f9799e);
                break;
        }
    }

    @Override // ig.c
    public void onFailure(Exception e10) {
        PlayServicesDevicePerformance this$0 = (PlayServicesDevicePerformance) this.f9799e;
        String str = this$0.f1572b;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(e10, "e");
        if (e10 instanceof ye.e) {
            Log.e(str, "Error saving mediaPerformanceClass", e10);
        } else if (e10 instanceof IllegalStateException) {
            Log.e(str, "Error saving mediaPerformanceClass", e10);
        }
    }

    @Override // ig.d
    public void onSuccess(Object obj) {
        androidx.fragment.app.r tmp0 = (androidx.fragment.app.r) this.f9799e;
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // io.sentry.util.runtime.a
    public Object run() {
        switch (this.f9798d) {
            case 13:
                return io.sentry.android.core.u0.a(((io.sentry.android.core.h0) this.f9799e).f12210d);
            case 14:
                return io.sentry.android.core.u0.a(((io.sentry.android.core.n0) this.f9799e).f12351d);
            default:
                return io.sentry.android.core.u0.a(((io.sentry.android.core.p0) this.f9799e).f12359a);
        }
    }

    public /* synthetic */ o(int i7, Object obj, Object obj2) {
        this.f9798d = i7;
        this.f9799e = obj2;
    }
}
