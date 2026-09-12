package com.google.android.exoplayer2;

import gc.v1;
import je.e0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements Player {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v1 f5591a = new v1();

    @Override // com.google.android.exoplayer2.Player
    public final void B() {
        r(true);
    }

    @Override // com.google.android.exoplayer2.Player
    public final boolean E(int i7) {
        return f().f5577d.f13801a.get(i7);
    }

    @Override // com.google.android.exoplayer2.Player
    public final void N() {
        int iE;
        if (J().p() || c()) {
            return;
        }
        if (!V()) {
            if (Y() && X()) {
                a0(D(), -9223372036854775807L, 9, false);
                return;
            }
            return;
        }
        Timeline timelineJ = J();
        if (timelineJ.p()) {
            iE = -1;
        } else {
            int iD = D();
            int I = I();
            if (I == 1) {
                I = 0;
            }
            iE = timelineJ.e(iD, I, L());
        }
        if (iE == -1) {
            return;
        }
        if (iE == D()) {
            a0(D(), -9223372036854775807L, 9, true);
        } else {
            a0(iE, -9223372036854775807L, 9, false);
        }
    }

    @Override // com.google.android.exoplayer2.Player
    public final void O() {
        long jS = S() + s();
        long duration = getDuration();
        if (duration != -9223372036854775807L) {
            jS = Math.min(jS, duration);
        }
        b0(12, Math.max(jS, 0L));
    }

    @Override // com.google.android.exoplayer2.Player
    public final void Q() {
        long jS = S() + (-T());
        long duration = getDuration();
        if (duration != -9223372036854775807L) {
            jS = Math.min(jS, duration);
        }
        b0(11, Math.max(jS, 0L));
    }

    public final int U() {
        long jV = v();
        long duration = getDuration();
        if (jV == -9223372036854775807L || duration == -9223372036854775807L) {
            return 0;
        }
        if (duration == 0) {
            return 100;
        }
        return e0.i((int) ((jV * 100) / duration), 0, 100);
    }

    public final boolean V() {
        int iE;
        Timeline timelineJ = J();
        if (timelineJ.p()) {
            iE = -1;
        } else {
            int iD = D();
            int I = I();
            if (I == 1) {
                I = 0;
            }
            iE = timelineJ.e(iD, I, L());
        }
        return iE != -1;
    }

    public final boolean W() {
        int iK;
        Timeline timelineJ = J();
        if (timelineJ.p()) {
            iK = -1;
        } else {
            int iD = D();
            int I = I();
            if (I == 1) {
                I = 0;
            }
            iK = timelineJ.k(iD, I, L());
        }
        return iK != -1;
    }

    public final boolean X() {
        Timeline timelineJ = J();
        return !timelineJ.p() && timelineJ.m(D(), this.f5591a, 0L).F;
    }

    public final boolean Y() {
        Timeline timelineJ = J();
        return !timelineJ.p() && timelineJ.m(D(), this.f5591a, 0L).a();
    }

    public final boolean Z() {
        Timeline timelineJ = J();
        return !timelineJ.p() && timelineJ.m(D(), this.f5591a, 0L).E;
    }

    public abstract void a0(int i7, long j, int i10, boolean z5);

    public final void b0(int i7, long j) {
        a0(D(), j, i7, false);
    }

    @Override // com.google.android.exoplayer2.Player
    public final void e(int i7, long j) {
        a0(i7, j, 10, false);
    }

    @Override // com.google.android.exoplayer2.Player
    public final void n() {
        a0(D(), -9223372036854775807L, 4, false);
    }

    @Override // com.google.android.exoplayer2.Player
    public final void pause() {
        r(false);
    }

    @Override // com.google.android.exoplayer2.Player
    public final void q() {
        int iK;
        int iK2;
        if (!J().p() && !c()) {
            boolean zW = W();
            if (!Y() || Z()) {
                if (zW) {
                    long jS = S();
                    i();
                    if (jS <= 3000) {
                        Timeline timelineJ = J();
                        if (timelineJ.p()) {
                            iK = -1;
                        } else {
                            int iD = D();
                            int I = I();
                            iK = timelineJ.k(iD, I != 1 ? I : 0, L());
                        }
                        if (iK != -1) {
                            if (iK == D()) {
                                a0(D(), -9223372036854775807L, 7, true);
                                return;
                            } else {
                                a0(iK, -9223372036854775807L, 7, false);
                                return;
                            }
                        }
                    }
                }
                b0(7, 0L);
                return;
            }
            if (zW) {
                Timeline timelineJ2 = J();
                if (timelineJ2.p()) {
                    iK2 = -1;
                } else {
                    int iD2 = D();
                    int I2 = I();
                    iK2 = timelineJ2.k(iD2, I2 != 1 ? I2 : 0, L());
                }
                if (iK2 != -1) {
                    if (iK2 == D()) {
                        a0(D(), -9223372036854775807L, 7, true);
                    } else {
                        a0(iK2, -9223372036854775807L, 7, false);
                    }
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.Player
    public final boolean y() {
        return w() == 3 && g() && H() == 0;
    }
}
