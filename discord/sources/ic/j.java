package ic;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f11517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f11518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f11519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f11520d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f11521e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f11522f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f11523g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f11524h;

    /* JADX WARN: Code duplicated, block: B:21:0x005c  */
    public j(Context context, gc.o oVar) {
        Uri uriFor;
        Context applicationContext = context.getApplicationContext();
        this.f11518b = applicationContext;
        this.f11519c = oVar;
        int i7 = je.e0.f13788a;
        Looper looperMyLooper = Looper.myLooper();
        Handler handler = new Handler(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper, null);
        this.f11520d = handler;
        int i10 = je.e0.f13788a;
        this.f11521e = i10 >= 23 ? new h(this) : null;
        this.f11522f = i10 >= 21 ? new c4.d(3, this) : null;
        f fVar = f.f11500c;
        if (i10 >= 17) {
            String str = je.e0.f13790c;
            if ("Amazon".equals(str) || "Xiaomi".equals(str)) {
                uriFor = Settings.Global.getUriFor("external_surround_sound_enabled");
            } else {
                uriFor = null;
            }
        } else {
            uriFor = null;
        }
        this.f11523g = uriFor != null ? new i(this, handler, applicationContext.getContentResolver(), uriFor) : null;
    }

    public static void a(j jVar, f fVar) {
        DefaultTrackSelector defaultTrackSelector;
        boolean z5;
        gc.e0 e0Var;
        if (!jVar.f11517a || fVar.equals((f) jVar.f11524h)) {
            return;
        }
        jVar.f11524h = fVar;
        j0 j0Var = (j0) ((gc.o) jVar.f11519c).f9799e;
        je.b.k(j0Var.f11537f0 == Looper.myLooper());
        if (fVar.equals(j0Var.e())) {
            return;
        }
        j0Var.f11552w = fVar;
        ga.l lVar = j0Var.f11547r;
        if (lVar != null) {
            m0 m0Var = (m0) lVar.f9547e;
            synchronized (m0Var.f9601d) {
                defaultTrackSelector = m0Var.K;
            }
            if (defaultTrackSelector != null) {
                synchronized (defaultTrackSelector.f5728d) {
                    z5 = defaultTrackSelector.f5732h.f5757k0;
                }
                if (!z5 || (e0Var = defaultTrackSelector.f9114a) == null) {
                    return;
                }
                e0Var.E.d(26);
            }
        }
    }

    public FileInputStream b(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e10) {
            String message = e10.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            ((y2.b) this.f11519c).c();
            return null;
        }
    }

    public void c(int i7, Serializable serializable) {
        ((Executor) this.f11518b).execute(new ab.a(this, i7, serializable, 13));
    }

    public j(AssetManager assetManager, Executor executor, y2.b bVar, String str, File file) {
        byte[] bArr;
        this.f11517a = false;
        this.f11518b = executor;
        this.f11519c = bVar;
        this.f11522f = str;
        this.f11521e = file;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 31) {
            bArr = y2.c.f23146d;
        } else {
            switch (i7) {
                case 24:
                case 25:
                    bArr = y2.c.f23150h;
                    break;
                case 26:
                    bArr = y2.c.f23149g;
                    break;
                case 27:
                    bArr = y2.c.f23148f;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = y2.c.f23147e;
                    break;
                default:
                    bArr = null;
                    break;
            }
        }
        this.f11520d = bArr;
    }
}
