package im;

import android.content.Context;
import android.os.Handler;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class s extends f {
    public float S;
    public float T;
    public final float U;
    public float V;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public float f11954j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public float f11955k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public float f11956l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public float f11957m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public float f11958n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public float f11959o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public VelocityTracker f11960p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f11961q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public long f11962r0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public Handler f11964t0;
    public final boolean R = true;
    public float W = Float.MAX_VALUE;
    public float X = Float.MIN_VALUE;
    public float Y = Float.MIN_VALUE;
    public float Z = Float.MAX_VALUE;
    public float a0 = Float.MAX_VALUE;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public float f11947b0 = Float.MIN_VALUE;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public float f11948c0 = Float.MIN_VALUE;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public float f11949d0 = Float.MAX_VALUE;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public float f11950e0 = Float.MAX_VALUE;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public float f11951f0 = Float.MAX_VALUE;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public float f11952g0 = Float.MAX_VALUE;
    public int h0 = 1;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f11953i0 = 10;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final com.google.firebase.messaging.s f11963s0 = new com.google.firebase.messaging.s(23, this);

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public z f11965u0 = new z();

    public s(Context context) {
        this.V = Float.MIN_VALUE;
        Intrinsics.checkNotNull(context);
        float scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.U = scaledTouchSlop;
        this.V = scaledTouchSlop;
    }

    @Override // im.f
    public final void B() {
        Handler handler = this.f11964t0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        VelocityTracker velocityTracker = this.f11960p0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f11960p0 = null;
        }
        this.f11965u0 = new z();
    }

    @Override // im.f
    public final void D() {
        super.D();
        this.W = Float.MAX_VALUE;
        this.X = Float.MIN_VALUE;
        this.Y = Float.MIN_VALUE;
        this.Z = Float.MAX_VALUE;
        this.a0 = Float.MAX_VALUE;
        this.f11947b0 = Float.MIN_VALUE;
        this.f11948c0 = Float.MIN_VALUE;
        this.f11949d0 = Float.MAX_VALUE;
        this.f11950e0 = Float.MAX_VALUE;
        this.f11951f0 = Float.MAX_VALUE;
        this.f11952g0 = Float.MAX_VALUE;
        this.V = this.U;
        this.h0 = 1;
        this.f11953i0 = 10;
        this.f11962r0 = 0L;
        this.f11961q0 = false;
    }

    @Override // im.f
    public final void E() {
        this.f11954j0 = this.f11958n0;
        this.f11955k0 = this.f11959o0;
    }

    @Override // im.f
    public final void a(boolean z5) {
        if (this.f11896h != 4) {
            E();
        }
        super.a(z5);
    }

    @Override // im.f
    public final boolean t() {
        return this.R;
    }

    @Override // im.f
    public final void w() {
        Handler handler = this.f11964t0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:105:0x01af  */
    /* JADX WARN: Code duplicated, block: B:108:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:111:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:120:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:123:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:132:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:135:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:147:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x013b  */
    /* JADX WARN: Code duplicated, block: B:59:0x0148  */
    /* JADX WARN: Code duplicated, block: B:62:0x0152  */
    /* JADX WARN: Code duplicated, block: B:65:0x0157  */
    /* JADX WARN: Code duplicated, block: B:68:0x015e  */
    /* JADX WARN: Code duplicated, block: B:71:0x0163  */
    /* JADX WARN: Code duplicated, block: B:74:0x016a  */
    /* JADX WARN: Code duplicated, block: B:81:0x0179  */
    /* JADX WARN: Code duplicated, block: B:84:0x017f  */
    /* JADX WARN: Code duplicated, block: B:87:0x0186  */
    /* JADX WARN: Code duplicated, block: B:90:0x018c  */
    /* JADX WARN: Code duplicated, block: B:93:0x0193  */
    /* JADX WARN: Code duplicated, block: B:96:0x0199  */
    /* JADX WARN: Code duplicated, block: B:99:0x01a0  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Iterative traversal limit reached: limit: 620, visitor: jadx.core.dex.visitors.regions.IfRegionVisitor$RemoveRedundantElseVisitor, blocks count: 124
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:51)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:46)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // im.f
    public final void y(android.view.MotionEvent r12, android.view.MotionEvent r13) {
        /*
            Method dump skipped, instruction units count: 519
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: im.s.y(android.view.MotionEvent, android.view.MotionEvent):void");
    }
}
