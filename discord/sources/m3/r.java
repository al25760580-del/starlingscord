package m3;

import android.view.animation.AnimationUtils;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.transition.Transition;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class r extends u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f15440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15441c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SpringAnimation f15443e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a1.d f15444f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Runnable f15445g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ z f15446h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f15439a = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15442d = 0;

    public r(z zVar) {
        this.f15446h = zVar;
        a1.d dVar = new a1.d(9, (byte) 0);
        long[] jArr = new long[20];
        dVar.f18i = jArr;
        dVar.f19v = new float[20];
        dVar.f17e = 0;
        Arrays.fill(jArr, Long.MIN_VALUE);
        this.f15444f = dVar;
    }

    public final void a() {
        if (this.f15440b) {
            b();
            this.f15443e.a(this.f15446h.W + 1);
        } else {
            this.f15442d = 1;
            this.f15445g = null;
        }
    }

    public final void b() {
        int i7;
        if (this.f15443e != null) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        float f2 = this.f15439a;
        a1.d dVar = this.f15444f;
        int i10 = dVar.f17e;
        float[] fArr = (float[]) dVar.f19v;
        long[] jArr = (long[]) dVar.f18i;
        char c8 = 20;
        int i11 = (i10 + 1) % 20;
        dVar.f17e = i11;
        jArr[i11] = jCurrentAnimationTimeMillis;
        fArr[i11] = f2;
        this.f15443e = new SpringAnimation(new j2.h());
        j2.i iVar = new j2.i();
        iVar.a(1.0f);
        iVar.b(200.0f);
        SpringAnimation springAnimation = this.f15443e;
        springAnimation.f2009m = iVar;
        springAnimation.f2000b = this.f15439a;
        springAnimation.f2001c = true;
        ArrayList arrayList = springAnimation.f2008l;
        if (springAnimation.f2004f) {
            throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
        }
        if (!arrayList.contains(this)) {
            arrayList.add(this);
        }
        SpringAnimation springAnimation2 = this.f15443e;
        int i12 = dVar.f17e;
        long j = Long.MIN_VALUE;
        float fSqrt = 0.0f;
        if (i12 != 0 || jArr[i12] != Long.MIN_VALUE) {
            long j5 = jArr[i12];
            int i13 = 0;
            long j7 = j5;
            while (true) {
                long j10 = jArr[i12];
                if (j10 == j) {
                    break;
                }
                float f7 = j5 - j10;
                float fAbs = Math.abs(j10 - j7);
                if (f7 > 100.0f || fAbs > 40.0f) {
                    break;
                }
                if (i12 == 0) {
                    i12 = 20;
                }
                i12--;
                i13++;
                if (i13 >= 20) {
                    break;
                }
                j7 = j10;
                j = Long.MIN_VALUE;
            }
            if (i13 >= 2) {
                float f10 = 1000.0f;
                if (i13 == 2) {
                    int i14 = dVar.f17e;
                    int i15 = i14 == 0 ? 19 : i14 - 1;
                    float f11 = jArr[i14] - jArr[i15];
                    if (f11 != 0.0f) {
                        fSqrt = ((fArr[i14] - fArr[i15]) / f11) * 1000.0f;
                    }
                } else {
                    int i16 = dVar.f17e;
                    int i17 = ((i16 - i13) + 21) % 20;
                    int i18 = (i16 + 21) % 20;
                    long j11 = jArr[i17];
                    float f12 = fArr[i17];
                    int i19 = i17 + 1;
                    int i20 = i19 % 20;
                    float f13 = 0.0f;
                    while (i20 != i18) {
                        long j12 = jArr[i20];
                        char c10 = c8;
                        float f14 = f10;
                        float f15 = j12 - j11;
                        if (f15 == fSqrt) {
                            i7 = i19;
                        } else {
                            float f16 = fArr[i20];
                            int i21 = i19;
                            float f17 = (f16 - f12) / f15;
                            float fAbs2 = (Math.abs(f17) * (f17 - ((float) (Math.sqrt(2.0f * Math.abs(f13)) * ((double) Math.signum(f13)))))) + f13;
                            i7 = i21;
                            if (i20 == i7) {
                                fAbs2 *= 0.5f;
                            }
                            f13 = fAbs2;
                            f12 = f16;
                            j11 = j12;
                        }
                        i20 = (i20 + 1) % 20;
                        i19 = i7;
                        c8 = c10;
                        f10 = f14;
                        fSqrt = 0.0f;
                    }
                    fSqrt = ((float) (Math.sqrt(Math.abs(f13) * 2.0f) * ((double) Math.signum(f13)))) * f10;
                }
            }
        }
        springAnimation2.f1999a = fSqrt;
        SpringAnimation springAnimation3 = this.f15443e;
        springAnimation3.f2005g = this.f15446h.W + 1;
        springAnimation3.f2006h = -1.0f;
        springAnimation3.j = 4.0f;
        q qVar = new q(0, this);
        ArrayList arrayList2 = springAnimation3.k;
        if (arrayList2.contains(qVar)) {
            return;
        }
        arrayList2.add(qVar);
    }

    @Override // m3.u, m3.s
    public final void onTransitionCancel(Transition transition) {
        this.f15441c = true;
    }
}
