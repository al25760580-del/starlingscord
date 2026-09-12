package androidx.core.view;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class DifferentialMotionFlingController {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f1584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DifferentialMotionFlingTarget f1585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public VelocityTracker f1586c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f1587d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1588e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1589f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f1590g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int[] f1591h = {Integer.MAX_VALUE, 0};

    public DifferentialMotionFlingController(Context context, DifferentialMotionFlingTarget differentialMotionFlingTarget) {
        this.f1584a = context;
        this.f1585b = differentialMotionFlingTarget;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007d  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:83:0x016a  */
    public final void a(MotionEvent motionEvent, int i7) {
        int i10;
        int i11;
        int scaledMinimumFlingVelocity;
        int scaledMaximumFlingVelocity;
        boolean z5;
        float f2;
        float yVelocity;
        long j;
        float fSqrt;
        float f7;
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        int i12 = this.f1589f;
        int[] iArr = this.f1591h;
        if (i12 == source && this.f1590g == deviceId && this.f1588e == i7) {
            z5 = false;
            i10 = 1;
            i11 = 0;
        } else {
            Context context = this.f1584a;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int deviceId2 = motionEvent.getDeviceId();
            int source2 = motionEvent.getSource();
            i10 = 1;
            int i13 = Build.VERSION.SDK_INT;
            i11 = 0;
            if (i13 >= 34) {
                Method method = v0.f1735a;
                scaledMinimumFlingVelocity = a2.a.j(viewConfiguration, deviceId2, i7, source2);
            } else {
                Method method2 = v0.f1735a;
                InputDevice device = InputDevice.getDevice(deviceId2);
                if (device == null || device.getMotionRange(i7, source2) == null) {
                    scaledMinimumFlingVelocity = Integer.MAX_VALUE;
                } else {
                    Resources resources = context.getResources();
                    int identifier = (source2 == 4194304 && i7 == 26) ? resources.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                    Objects.requireNonNull(viewConfiguration);
                    if (identifier == -1) {
                        scaledMinimumFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
                    } else if (identifier == 0 || (scaledMinimumFlingVelocity = resources.getDimensionPixelSize(identifier)) < 0) {
                        scaledMinimumFlingVelocity = Integer.MAX_VALUE;
                    }
                }
            }
            iArr[0] = scaledMinimumFlingVelocity;
            int deviceId3 = motionEvent.getDeviceId();
            int source3 = motionEvent.getSource();
            if (i13 >= 34) {
                scaledMaximumFlingVelocity = a2.a.i(viewConfiguration, deviceId3, i7, source3);
            } else {
                InputDevice device2 = InputDevice.getDevice(deviceId3);
                if (device2 == null || device2.getMotionRange(i7, source3) == null) {
                    scaledMaximumFlingVelocity = Integer.MIN_VALUE;
                } else {
                    Resources resources2 = context.getResources();
                    int identifier2 = (source3 == 4194304 && i7 == 26) ? resources2.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                    Objects.requireNonNull(viewConfiguration);
                    if (identifier2 == -1) {
                        scaledMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
                    } else if (identifier2 == 0 || (scaledMaximumFlingVelocity = resources2.getDimensionPixelSize(identifier2)) < 0) {
                        scaledMaximumFlingVelocity = Integer.MIN_VALUE;
                    }
                }
            }
            iArr[1] = scaledMaximumFlingVelocity;
            this.f1589f = source;
            this.f1590g = deviceId;
            this.f1588e = i7;
            z5 = true;
        }
        if (iArr[i11] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker = this.f1586c;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f1586c = null;
                return;
            }
            return;
        }
        if (this.f1586c == null) {
            this.f1586c = VelocityTracker.obtain();
        }
        VelocityTracker velocityTracker2 = this.f1586c;
        Map map = d0.f1646a;
        velocityTracker2.addMovement(motionEvent);
        float f10 = 0.0f;
        int i14 = 20;
        if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            Map map2 = d0.f1646a;
            if (!map2.containsKey(velocityTracker2)) {
                map2.put(velocityTracker2, new e0());
            }
            e0 e0Var = (e0) map2.get(velocityTracker2);
            long[] jArr = e0Var.f1648b;
            long eventTime = motionEvent.getEventTime();
            if (e0Var.f1650d != 0 && eventTime - jArr[e0Var.f1651e] > 40) {
                e0Var.f1650d = i11;
                e0Var.f1649c = 0.0f;
            }
            int i15 = (e0Var.f1651e + 1) % 20;
            e0Var.f1651e = i15;
            int i16 = e0Var.f1650d;
            if (i16 != 20) {
                e0Var.f1650d = i16 + 1;
            }
            e0Var.f1647a[i15] = motionEvent.getAxisValue(26);
            jArr[e0Var.f1651e] = eventTime;
        }
        velocityTracker2.computeCurrentVelocity(1000, Float.MAX_VALUE);
        e0 e0Var2 = (e0) d0.f1646a.get(velocityTracker2);
        if (e0Var2 != null) {
            float[] fArr = e0Var2.f1647a;
            long[] jArr2 = e0Var2.f1648b;
            int i17 = e0Var2.f1650d;
            if (i17 < 2) {
                fSqrt = 0.0f;
                f2 = 0.0f;
            } else {
                int i18 = e0Var2.f1651e;
                int i19 = ((i18 + 20) - (i17 - 1)) % 20;
                long j5 = jArr2[i18];
                while (true) {
                    j = jArr2[i19];
                    if (j5 - j <= 100) {
                        break;
                    }
                    e0Var2.f1650d--;
                    i19 = (i19 + 1) % 20;
                }
                int i20 = e0Var2.f1650d;
                if (i20 < 2) {
                    fSqrt = 0.0f;
                    f2 = 0.0f;
                } else if (i20 == 2) {
                    int i21 = (i19 + 1) % 20;
                    long j7 = jArr2[i21];
                    if (j == j7) {
                        fSqrt = 0.0f;
                        f2 = 0.0f;
                    } else {
                        fSqrt = fArr[i21] / (j7 - j);
                        f2 = 0.0f;
                    }
                } else {
                    float fAbs = 0.0f;
                    int i22 = 0;
                    int i23 = 0;
                    while (true) {
                        if (i22 >= e0Var2.f1650d - 1) {
                            break;
                        }
                        int i24 = i22 + i19;
                        long j10 = jArr2[i24 % 20];
                        int i25 = (i24 + 1) % i14;
                        if (jArr2[i25] == j10) {
                            f7 = f10;
                        } else {
                            i23++;
                            f7 = f10;
                            float fSqrt2 = (fAbs < f10 ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(fAbs) * 2.0f));
                            float f11 = fArr[i25] / (jArr2[i25] - j10);
                            fAbs += Math.abs(f11) * (f11 - fSqrt2);
                            if (i23 == i10) {
                                fAbs *= 0.5f;
                            }
                        }
                        i22++;
                        f10 = f7;
                        i14 = 20;
                        i10 = 1;
                    }
                    f2 = f10;
                    fSqrt = (fAbs < f2 ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(fAbs) * 2.0f));
                }
            }
            float f12 = fSqrt * 1000;
            e0Var2.f1649c = f12;
            if (f12 < (-Math.abs((float) r4))) {
                e0Var2.f1649c = -Math.abs(Float.MAX_VALUE);
            } else if (e0Var2.f1649c > Math.abs((float) r4)) {
                e0Var2.f1649c = Math.abs((float) r4);
            }
        } else {
            f2 = 0.0f;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            yVelocity = a2.a.f(velocityTracker2, i7);
        } else if (i7 == 0) {
            yVelocity = velocityTracker2.getXVelocity();
        } else if (i7 == 1) {
            yVelocity = velocityTracker2.getYVelocity();
        } else {
            e0 e0Var3 = (e0) d0.f1646a.get(velocityTracker2);
            yVelocity = (e0Var3 == null || i7 != 26) ? f2 : e0Var3.f1649c;
        }
        DifferentialMotionFlingTarget differentialMotionFlingTarget = this.f1585b;
        float fB = differentialMotionFlingTarget.b() * yVelocity;
        float fSignum = Math.signum(fB);
        if (z5 || (fSignum != Math.signum(this.f1587d) && fSignum != f2)) {
            differentialMotionFlingTarget.c();
        }
        if (Math.abs(fB) < iArr[0]) {
            return;
        }
        int i26 = iArr[1];
        float fMax = Math.max(-i26, Math.min(fB, i26));
        this.f1587d = differentialMotionFlingTarget.a(fMax) ? fMax : f2;
    }
}
