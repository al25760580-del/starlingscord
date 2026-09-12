package le;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.View;
import android.view.WindowManager;
import io.sentry.android.core.p;
import java.util.concurrent.CopyOnWriteArrayList;
import je.e0;
import ke.o;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends GLSurfaceView {
    public static final /* synthetic */ int I = 0;
    public Surface E;
    public boolean F;
    public boolean G;
    public boolean H;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArrayList f15057d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SensorManager f15058e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Sensor f15059i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final d f15060v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Handler f15061w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final i f15062x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public SurfaceTexture f15063y;

    public k(Context context) {
        super(context, null);
        this.f15057d = new CopyOnWriteArrayList();
        this.f15061w = new Handler(Looper.getMainLooper());
        Object systemService = context.getSystemService("sensor");
        systemService.getClass();
        SensorManager sensorManager = (SensorManager) systemService;
        this.f15058e = sensorManager;
        Sensor defaultSensor = e0.f13788a >= 18 ? sensorManager.getDefaultSensor(15) : null;
        this.f15059i = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        i iVar = new i();
        this.f15062x = iVar;
        j jVar = new j(this, iVar);
        View.OnTouchListener lVar = new l(context, jVar);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        windowManager.getClass();
        this.f15060v = new d(windowManager.getDefaultDisplay(), lVar, jVar);
        this.F = true;
        setEGLContextClientVersion(2);
        setRenderer(jVar);
        setOnTouchListener(lVar);
    }

    public final void a() {
        boolean z5 = this.F && this.G;
        Sensor sensor = this.f15059i;
        if (sensor == null || z5 == this.H) {
            return;
        }
        d dVar = this.f15060v;
        SensorManager sensorManager = this.f15058e;
        if (z5) {
            sensorManager.registerListener(dVar, sensor, 0);
        } else {
            sensorManager.unregisterListener(dVar);
        }
        this.H = z5;
    }

    public a getCameraMotionListener() {
        return this.f15062x;
    }

    public o getVideoFrameMetadataListener() {
        return this.f15062x;
    }

    public Surface getVideoSurface() {
        return this.E;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f15061w.post(new p(19, this));
    }

    @Override // android.opengl.GLSurfaceView
    public final void onPause() {
        this.G = false;
        a();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public final void onResume() {
        super.onResume();
        this.G = true;
        a();
    }

    public void setDefaultStereoMode(int i7) {
        this.f15062x.H = i7;
    }

    public void setUseSensorRotation(boolean z5) {
        this.F = z5;
        a();
    }
}
