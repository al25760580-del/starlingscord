package le;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements SensorEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f15021a = new float[16];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f15022b = new float[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float[] f15023c = new float[16];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float[] f15024d = new float[3];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Display f15025e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c[] f15026f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f15027g;

    public d(Display display, c... cVarArr) {
        this.f15025e = display;
        this.f15026f = cVarArr;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i7;
        float[] fArr = sensorEvent.values;
        float[] fArr2 = this.f15021a;
        SensorManager.getRotationMatrixFromVector(fArr2, fArr);
        int rotation = this.f15025e.getRotation();
        float[] fArr3 = this.f15022b;
        if (rotation != 0) {
            int i10 = 129;
            if (rotation != 1) {
                i7 = 130;
                if (rotation != 2) {
                    if (rotation != 3) {
                        throw new IllegalStateException();
                    }
                    i10 = 130;
                    i7 = 1;
                }
            } else {
                i7 = 129;
                i10 = 2;
            }
            System.arraycopy(fArr2, 0, fArr3, 0, fArr3.length);
            SensorManager.remapCoordinateSystem(fArr3, i10, i7, fArr2);
        }
        SensorManager.remapCoordinateSystem(fArr2, 1, 131, fArr3);
        float[] fArr4 = this.f15024d;
        SensorManager.getOrientation(fArr3, fArr4);
        float f2 = fArr4[2];
        Matrix.rotateM(fArr2, 0, 90.0f, 1.0f, 0.0f, 0.0f);
        boolean z5 = this.f15027g;
        float[] fArr5 = this.f15023c;
        if (!z5) {
            a3.f.e(fArr5, fArr2);
            this.f15027g = true;
        }
        System.arraycopy(fArr2, 0, fArr3, 0, fArr3.length);
        Matrix.multiplyMM(fArr2, 0, fArr3, 0, fArr5, 0);
        for (int i11 = 0; i11 < 2; i11++) {
            this.f15026f[i11].a(f2, fArr2);
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i7) {
    }
}
