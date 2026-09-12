package h5;

import android.hardware.Camera;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Camera f10365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f10366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f10367c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q f10368d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q f10369e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f10370f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f10371g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f10372h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f10373i;

    public o(Camera camera, Camera.CameraInfo cameraInfo, n nVar, q qVar, q qVar2, q qVar3, int i7, boolean z5, boolean z6) {
        this.f10365a = camera;
        this.f10366b = nVar;
        this.f10367c = qVar;
        this.f10368d = qVar2;
        this.f10369e = qVar3;
        this.f10370f = i7;
        this.f10371g = cameraInfo.facing == 1;
        this.f10372h = z5;
        this.f10373i = z6;
    }
}
