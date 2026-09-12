package f9;

import a3.h;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import com.facebook.common.internal.Fn;
import com.facebook.common.references.CloseableReference;
import com.facebook.datasource.DataSource;
import com.facebook.drawee.controller.ControllerListener;
import com.facebook.drawee.drawable.m;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.interfaces.DraweeHierarchy;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import na.i;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c implements DraweeController, e9.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Map f9024r = n8.e.a("component_tag", "drawee");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Map f9025s = n8.e.b("origin", "memory_bitmap", "origin_sub", "shortcut");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Class f9026t = c.class;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e9.d f9027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e9.b f9028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f9029c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ControllerListener f9030d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w9.a f9031e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public GenericDraweeHierarchy f9032f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public g9.a f9033g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f9034h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f9035i;
    public boolean j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f9036l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f9037m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public DataSource f9038n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f9039o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f9040p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Drawable f9041q;

    public c(e9.b bVar, Executor executor) {
        this.f9027a = e9.d.f8122c ? new e9.d() : e9.d.f8121b;
        this.f9031e = new w9.a();
        this.f9040p = true;
        this.f9028b = bVar;
        this.f9029c = executor;
        f(null, null);
    }

    public final void a(ControllerListener controllerListener) {
        controllerListener.getClass();
        ControllerListener controllerListener2 = this.f9030d;
        if (controllerListener2 instanceof b) {
            ((b) controllerListener2).a(controllerListener);
            return;
        }
        if (controllerListener2 == null) {
            this.f9030d = controllerListener;
            return;
        }
        sa.a.w();
        b bVar = new b();
        bVar.a(controllerListener2);
        bVar.a(controllerListener);
        sa.a.w();
        this.f9030d = bVar;
    }

    public abstract Drawable b(Object obj);

    public final ControllerListener c() {
        ControllerListener controllerListener = this.f9030d;
        return controllerListener == null ? f.getNoOpListener() : controllerListener;
    }

    public abstract i d(Object obj);

    public final GenericDraweeHierarchy e() {
        GenericDraweeHierarchy genericDraweeHierarchy = this.f9032f;
        if (genericDraweeHierarchy != null) {
            return genericDraweeHierarchy;
        }
        throw new IllegalStateException("mSettableDraweeHierarchy is null; Caller context: " + this.f9035i);
    }

    public final synchronized void f(Object obj, String str) {
        e9.b bVar;
        try {
            sa.a.w();
            this.f9027a.a(e9.c.f8119x);
            if (!this.f9040p && (bVar = this.f9028b) != null) {
                bVar.b(this);
            }
            this.j = false;
            n();
            ControllerListener controllerListener = this.f9030d;
            if (controllerListener instanceof b) {
                b bVar2 = (b) controllerListener;
                synchronized (bVar2) {
                    bVar2.f9049d.clear();
                }
            } else {
                this.f9030d = null;
            }
            GenericDraweeHierarchy genericDraweeHierarchy = this.f9032f;
            if (genericDraweeHierarchy != null) {
                genericDraweeHierarchy.f4702f.setDrawable(genericDraweeHierarchy.f4697a);
                genericDraweeHierarchy.i();
                i9.a aVar = this.f9032f.f4700d;
                aVar.f11400d = null;
                aVar.invalidateSelf();
                this.f9032f = null;
            }
            this.f9033g = null;
            if (o8.a.f17171a.isLoggable(2)) {
                o8.a.p(f9026t, "controller %x %s -> %s: initialize", Integer.valueOf(System.identityHashCode(this)), this.f9034h, str);
            }
            this.f9034h = str;
            this.f9035i = obj;
            sa.a.w();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final boolean g(String str, DataSource dataSource) {
        if (dataSource == null && this.f9038n == null) {
            return true;
        }
        return str.equals(this.f9034h) && dataSource == this.f9038n && this.k;
    }

    @Override // com.facebook.drawee.interfaces.DraweeController
    public final Animatable getAnimatable() {
        Object obj = this.f9041q;
        if (obj instanceof Animatable) {
            return (Animatable) obj;
        }
        return null;
    }

    @Override // com.facebook.drawee.interfaces.DraweeController
    public final DraweeHierarchy getHierarchy() {
        return this.f9032f;
    }

    public final void h(String str, Throwable th2) {
        if (o8.a.f17171a.isLoggable(2)) {
            Integer numValueOf = Integer.valueOf(System.identityHashCode(this));
            String str2 = this.f9034h;
            if (o8.a.f17171a.isLoggable(2)) {
                o8.a.f17171a.v(f9026t.getSimpleName(), String.format(null, "controller %x %s: %s: failure: %s", numValueOf, str2, str, th2));
            }
        }
    }

    public final void i(Object obj, String str) {
        if (o8.a.f17171a.isLoggable(2)) {
            Integer numValueOf = Integer.valueOf(System.identityHashCode(this));
            String str2 = this.f9034h;
            String simpleName = obj != null ? obj.getClass().getSimpleName() : "<null>";
            CloseableReference closeableReference = (CloseableReference) obj;
            Object[] objArr = {numValueOf, str2, str, simpleName, Integer.valueOf((closeableReference == null || !closeableReference.u()) ? 0 : System.identityHashCode(closeableReference.f4625e.a()))};
            if (o8.a.f17171a.isLoggable(2)) {
                o8.a.f17171a.v(f9026t.getSimpleName(), String.format(null, "controller %x %s: %s: image: %s %x", objArr));
            }
        }
    }

    public final l1.c j() {
        GenericDraweeHierarchy genericDraweeHierarchy = this.f9032f;
        if (genericDraweeHierarchy != null) {
            String.valueOf(genericDraweeHierarchy.f());
            if (genericDraweeHierarchy.g(2) instanceof m) {
                genericDraweeHierarchy.h(2);
            }
        }
        GenericDraweeHierarchy genericDraweeHierarchy2 = this.f9032f;
        Rect bounds = genericDraweeHierarchy2 == null ? null : genericDraweeHierarchy2.f4700d.getBounds();
        Object obj = this.f9035i;
        Map componentAttribution = f9024r;
        Intrinsics.checkNotNullParameter(componentAttribution, "componentAttribution");
        Map shortcutAttribution = f9025s;
        Intrinsics.checkNotNullParameter(shortcutAttribution, "shortcutAttribution");
        l1.c cVar = new l1.c();
        if (bounds != null) {
            bounds.width();
            bounds.height();
        }
        cVar.f14815a = obj;
        return cVar;
    }

    public final void k(String str, DataSource dataSource, Throwable th2, boolean z5) {
        sa.a.w();
        if (!g(str, dataSource)) {
            h("ignore_old_datasource @ onFailure", th2);
            dataSource.close();
            sa.a.w();
            return;
        }
        this.f9027a.a(z5 ? e9.c.J : e9.c.K);
        w9.a aVar = this.f9031e;
        if (z5) {
            h("final_failed @ onFailure", th2);
            this.f9038n = null;
            this.f9036l = true;
            GenericDraweeHierarchy genericDraweeHierarchy = this.f9032f;
            if (genericDraweeHierarchy != null) {
                com.facebook.drawee.drawable.d dVar = genericDraweeHierarchy.f4701e;
                dVar.O++;
                genericDraweeHierarchy.d();
                if (dVar.c(5) != null) {
                    genericDraweeHierarchy.c(5);
                } else {
                    genericDraweeHierarchy.c(1);
                }
                dVar.a();
            }
            l1.c cVarJ = j();
            c().onFailure(this.f9034h, th2);
            aVar.a(this.f9034h, th2, cVarJ);
        } else {
            h("intermediate_failed @ onFailure", th2);
            c().onIntermediateImageFailed(this.f9034h, th2);
            aVar.c(this.f9034h);
        }
        sa.a.w();
    }

    public final void l(String str, DataSource dataSource, Object obj, float f2, boolean z5, boolean z6, boolean z7) {
        try {
            sa.a.w();
            if (!g(str, dataSource)) {
                i(obj, "ignore_old_datasource @ onNewResult");
                CloseableReference.l((CloseableReference) obj);
                dataSource.close();
                sa.a.w();
                return;
            }
            this.f9027a.a(z5 ? e9.c.H : e9.c.I);
            try {
                Drawable drawableB = b(obj);
                Object obj2 = this.f9039o;
                Object obj3 = this.f9041q;
                this.f9039o = obj;
                this.f9041q = drawableB;
                w9.a aVar = this.f9031e;
                try {
                    if (z5) {
                        i(obj, "set_final_result @ onNewResult");
                        this.f9038n = null;
                        e().m(drawableB, 1.0f, z6);
                        i iVarD = d(obj);
                        c().onFinalImageSet(str, iVarD, getAnimatable());
                        aVar.b(str, iVarD, j());
                    } else if (z7) {
                        i(obj, "set_temporary_result @ onNewResult");
                        e().m(drawableB, 1.0f, z6);
                        i iVarD2 = d(obj);
                        c().onFinalImageSet(str, iVarD2, getAnimatable());
                        aVar.b(str, iVarD2, j());
                    } else {
                        i(obj, "set_intermediate_result @ onNewResult");
                        e().m(drawableB, f2, z6);
                        i iVarD3 = d(obj);
                        c().onIntermediateImageSet(str, iVarD3);
                        aVar.d(str, iVarD3);
                    }
                    if (obj3 != null && obj3 != drawableB && (obj3 instanceof a9.a)) {
                        ((a9.a) obj3).a();
                    }
                    if (obj2 != null && obj2 != obj) {
                        i(obj2, "release_previous_result @ onNewResult");
                        CloseableReference.l((CloseableReference) obj2);
                    }
                    sa.a.w();
                } catch (Throwable th2) {
                    if (obj3 != null && obj3 != drawableB && (obj3 instanceof a9.a)) {
                        ((a9.a) obj3).a();
                    }
                    if (obj2 != null && obj2 != obj) {
                        i(obj2, "release_previous_result @ onNewResult");
                        CloseableReference.l((CloseableReference) obj2);
                    }
                    throw th2;
                }
            } catch (Exception e10) {
                i(obj, "drawable_failed @ onNewResult");
                CloseableReference.l((CloseableReference) obj);
                k(str, dataSource, e10, z5);
                sa.a.w();
            }
        } catch (Throwable th3) {
            sa.a.w();
            throw th3;
        }
    }

    public final void m() {
        this.f9027a.a(e9.c.F);
        GenericDraweeHierarchy genericDraweeHierarchy = this.f9032f;
        if (genericDraweeHierarchy != null) {
            genericDraweeHierarchy.f4702f.setDrawable(genericDraweeHierarchy.f4697a);
            genericDraweeHierarchy.i();
        }
        n();
    }

    public final void n() {
        boolean z5 = this.k;
        this.k = false;
        this.f9036l = false;
        DataSource dataSource = this.f9038n;
        if (dataSource != null) {
            dataSource.close();
            this.f9038n = null;
        }
        Object obj = this.f9041q;
        if (obj != null && (obj instanceof a9.a)) {
            ((a9.a) obj).a();
        }
        if (this.f9037m != null) {
            this.f9037m = null;
        }
        this.f9041q = null;
        Object obj2 = this.f9039o;
        if (obj2 != null) {
            d(obj2);
            i(this.f9039o, "release");
            CloseableReference.l((CloseableReference) this.f9039o);
            this.f9039o = null;
        }
        if (z5) {
            c().onRelease(this.f9034h);
            this.f9031e.e(this.f9034h, j());
        }
    }

    public final void o(DataSource dataSource, i iVar) {
        c().onSubmit(this.f9034h, this.f9035i);
        String str = this.f9034h;
        Object obj = this.f9035i;
        c9.b bVar = (c9.b) this;
        ImageRequest imageRequest = bVar.f3543z;
        ImageRequest imageRequest2 = bVar.A;
        Fn requestToUri = ImageRequest.REQUEST_TO_URI_FN;
        Intrinsics.checkNotNullParameter(requestToUri, "requestToUri");
        if ((imageRequest != null ? requestToUri.apply(imageRequest) : null) == null && imageRequest2 != null) {
            requestToUri.apply(imageRequest2);
        }
        this.f9031e.f(str, obj, j());
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x00b0 */
    @Override // com.facebook.drawee.interfaces.DraweeController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAttach() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f9.c.onAttach():void");
    }

    @Override // com.facebook.drawee.interfaces.DraweeController
    public final void onDetach() {
        sa.a.w();
        if (o8.a.f17171a.isLoggable(2)) {
            o8.a.o(f9026t, "controller %x %s: onDetach", Integer.valueOf(System.identityHashCode(this)), this.f9034h);
        }
        this.f9027a.a(e9.c.E);
        this.j = false;
        e9.b bVar = this.f9028b;
        bVar.getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            synchronized (bVar.f8109d) {
                try {
                    if (!((ArrayList) bVar.f8111i).contains(this)) {
                        ((ArrayList) bVar.f8111i).add(this);
                        boolean z5 = ((ArrayList) bVar.f8111i).size() == 1;
                        if (z5) {
                            ((Handler) bVar.f8110e).post((h) bVar.f8113w);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else {
            m();
        }
        sa.a.w();
    }

    @Override // com.facebook.drawee.interfaces.DraweeController
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!o8.a.f17171a.isLoggable(2)) {
            return false;
        }
        o8.a.p(f9026t, "controller %x %s: onTouchEvent %s", Integer.valueOf(System.identityHashCode(this)), this.f9034h, motionEvent);
        return false;
    }

    public String toString() {
        n8.f fVarJ = n8.i.j(this);
        fVarJ.G("isAttached", this.j);
        fVarJ.G("isRequestSubmitted", this.k);
        fVarJ.G("hasFetchFailed", this.f9036l);
        CloseableReference closeableReference = (CloseableReference) this.f9039o;
        fVarJ.F((closeableReference == null || !closeableReference.u()) ? 0 : System.identityHashCode(closeableReference.f4625e.a()), "fetchedImage");
        fVarJ.H(this.f9027a.f8123a.toString(), "events");
        return fVarJ.toString();
    }
}
