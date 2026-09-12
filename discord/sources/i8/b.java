package i8;

import android.media.MediaDrmException;
import android.net.Uri;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import androidx.core.view.y;
import com.facebook.common.internal.Fn;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.soloader.b0;
import com.facebook.soloader.c0;
import com.facebook.soloader.i0;
import cs.u;
import he.h0;
import he.l0;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import mc.x;
import mc.z;
import okhttp3.Response;
import sh.q;
import xr.g;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements y, Fn, l0, h0, kb.b, z, g, pc.c, r8.a, q, qm.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static b f11394e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11395d;

    public /* synthetic */ b(int i7) {
        this.f11395d = i7;
    }

    public static final void u(VelocityTracker velocityTracker, MotionEvent motionEvent) {
        float rawX = motionEvent.getRawX() - motionEvent.getX();
        float rawY = motionEvent.getRawY() - motionEvent.getY();
        motionEvent.offsetLocation(rawX, rawY);
        Intrinsics.checkNotNull(velocityTracker);
        velocityTracker.addMovement(motionEvent);
        motionEvent.offsetLocation(-rawX, -rawY);
    }

    public static final Response v(Response response) {
        if ((response == null ? null : response.f17385y) == null) {
            return response;
        }
        u uVarI = response.i();
        uVarI.f7489g = null;
        return uVarI.a();
    }

    public static boolean w(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    @Override // r8.a
    public void L(r8.d dVar, Throwable th2) {
        Object objA = dVar.a();
        o8.a.t(CloseableReference.class, "Finalized without closing: %x %x (type = %s)", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(dVar)), objA == null ? null : objA.getClass().getName());
    }

    @Override // com.facebook.common.internal.Fn
    public Uri apply(Object obj) {
        ImageRequest imageRequest = (ImageRequest) obj;
        if (imageRequest != null) {
            return imageRequest.getSourceUri();
        }
        return null;
    }

    @Override // mc.z
    public Map c(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // mc.z
    public mc.y e() {
        throw new IllegalStateException();
    }

    @Override // qm.a
    public String g() {
        switch (this.f11395d) {
            case 18:
                return "onWillDisappear";
            default:
                return "onNativeFocusChange";
        }
    }

    @Override // qm.a
    public String getEventName() {
        switch (this.f11395d) {
            case 18:
                return "topWillDisappear";
            default:
                return "topNativeFocusChange";
        }
    }

    @Override // mc.z
    public lc.b h(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // kb.b
    public boolean i(UnsatisfiedLinkError unsatisfiedLinkError, b0[] b0VarArr) {
        for (b0 b0Var : b0VarArr) {
            if (b0Var instanceof i0) {
                i0 i0Var = (i0) b0Var;
                Log.e("SoLoader", "Waiting on SoSource ".concat(b0Var.b()));
                File file = i0Var.f5386a;
                try {
                    c0.d(file, new File(file, "dso_lock")).close();
                } catch (Exception e10) {
                    Log.e("fb-UnpackingSoSource", "Encountered exception during wait for unpacking trying to acquire file lock for " + i0Var.getClass().getName() + " (" + file + "): ", e10);
                }
            }
        }
        return true;
    }

    @Override // mc.z
    public byte[] j() throws MediaDrmException {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // he.h0
    public void l() {
        synchronized (je.b.f13765h) {
            Object obj = je.b.f13766i;
            synchronized (obj) {
                if (je.b.j) {
                    return;
                }
                long jA = je.b.a();
                synchronized (obj) {
                    je.b.k = jA;
                    je.b.j = true;
                }
            }
        }
    }

    @Override // mc.z
    public boolean m(byte[] bArr, String str) {
        throw new IllegalStateException();
    }

    @Override // mc.z
    public void n(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // mc.z
    public byte[] p(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // mc.z
    public void q(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // mc.z
    public x r(byte[] bArr, List list, int i7, HashMap map) {
        throw new IllegalStateException();
    }

    @Override // mc.z
    public int s() {
        return 1;
    }

    @Override // r8.a
    public void E() {
    }

    @Override // he.l0
    public void b() {
    }

    @Override // mc.z
    public void release() {
    }

    @Override // he.h0
    public void t() {
    }

    @Override // pc.c
    public long d(long j) {
        return j;
    }

    @Override // mc.z
    public void f(fj.c cVar) {
    }

    @Override // sh.q
    public int k(int i7) {
        return i7;
    }

    @Override // mc.z
    public void o(byte[] bArr) {
    }

    @Override // androidx.core.view.y
    public void onScrollLimit(int i7, int i10, int i11, boolean z5) {
    }

    @Override // androidx.core.view.y
    public void onScrollProgress(int i7, int i10, int i11, int i12) {
    }
}
