package i8;

import android.graphics.Rect;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.view.View;
import androidx.appcompat.app.ActionBarDrawerToggle$Delegate;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.widget.FocusStrategy$BoundsAdapter;
import bd.x;
import ci.p;
import com.facebook.react.uimanager.PointerEvents;
import com.facebook.react.uimanager.ReactPointerEventsView;
import com.google.android.gms.internal.play_billing.k4;
import com.otaliastudios.zoom.OverPanRangeProvider;
import com.otaliastudios.zoom.ZoomEngine;
import ga.m;
import im.u;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import pa.q;
import pc.j;
import qr.v;
import rn.n;
import sb.e;
import sh.c0;
import xr.g;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements e, FocusStrategy$BoundsAdapter, x, OverPanRangeProvider, m, ActionBarDrawerToggle$Delegate, g, pc.m, th.g, xb.b, p, qm.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static c f11396e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static c f11397i;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11398d;

    public /* synthetic */ c(int i7) {
        this.f11398d = i7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static u k(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        PointerEvents pointerEvents = view instanceof ReactPointerEventsView ? ((ReactPointerEventsView) view).getPointerEvents() : PointerEvents.AUTO;
        if (!view.isEnabled()) {
            if (pointerEvents == PointerEvents.AUTO) {
                return u.f11967e;
            }
            if (pointerEvents == PointerEvents.BOX_ONLY) {
                return u.f11966d;
            }
        }
        int i7 = jm.p.f13973a[pointerEvents.ordinal()];
        if (i7 == 1) {
            return u.f11968i;
        }
        if (i7 == 2) {
            return u.f11967e;
        }
        if (i7 == 3) {
            return u.f11966d;
        }
        if (i7 == 4) {
            return u.f11969v;
        }
        throw new n();
    }

    @Override // th.g
    public Object a() {
        switch (this.f11398d) {
            case 16:
                return new c0();
            default:
                return new b(19);
        }
    }

    @Override // sb.e
    public Object apply(Object obj) {
        return ((k4) obj).b();
    }

    @Override // bd.x
    public MediaCodecInfo b(int i7) {
        return MediaCodecList.getCodecInfoAt(i7);
    }

    @Override // bd.x
    public boolean d(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }

    @Override // ga.m
    public int e(Object obj) {
        return ((q) obj).n();
    }

    @Override // com.otaliastudios.zoom.OverPanRangeProvider
    public float f(ZoomEngine engine, boolean z5) {
        float f2;
        Intrinsics.checkNotNullParameter(engine, "engine");
        if (z5) {
            f2 = engine.f7027i.j;
        } else {
            if (z5) {
                throw new n();
            }
            f2 = engine.f7027i.k;
        }
        return f2 * 0.1f;
    }

    @Override // qm.a
    public String g() {
        return "onDidAppear";
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new h4.a(3, Executors.newSingleThreadExecutor());
    }

    @Override // qm.a
    public String getEventName() {
        return "topDidAppear";
    }

    @Override // bd.x
    public boolean h(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // androidx.customview.widget.FocusStrategy$BoundsAdapter
    public void i(Object obj, Rect rect) {
        ((AccessibilityNodeInfoCompat) obj).g(rect);
    }

    @Override // bd.x
    public int j() {
        return MediaCodecList.getCodecCount();
    }

    public void l(int i7, String str) {
        AtomicReference atomicReference = jb.b.f13720a;
        jb.a[] aVarArr = (jb.a[]) atomicReference.get();
        if (aVarArr != null && aVarArr.length > 0) {
            jb.a aVar = aVarArr[0];
            throw null;
        }
        try {
            System.load(str);
            jb.a[] aVarArr2 = (jb.a[]) atomicReference.get();
            if (aVarArr2 == null || aVarArr2.length <= 0) {
                return;
            }
            jb.a aVar2 = aVarArr2[0];
            throw null;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                jb.a[] aVarArr3 = (jb.a[]) jb.b.f13720a.get();
                if (aVarArr3 == null || aVarArr3.length <= 0) {
                    throw th3;
                }
                jb.a aVar3 = aVarArr3[0];
                throw null;
            }
        }
    }

    @Override // bd.x
    public boolean m() {
        return false;
    }

    @Override // pc.m
    public pc.x x(int i7, int i10) {
        return new j();
    }

    public c(ci.q qVar, p pVar) {
        this.f11398d = 19;
    }

    public c(String name, String description) {
        this.f11398d = 21;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(description, "description");
    }

    public c(k8.a aVar) {
        this.f11398d = 4;
    }

    public c(v block) {
        this.f11398d = 15;
        Intrinsics.checkNotNullParameter(block, "block");
    }

    @Override // pc.m
    public void q() {
    }

    @Override // pc.m
    public void c(pc.u uVar) {
    }
}
