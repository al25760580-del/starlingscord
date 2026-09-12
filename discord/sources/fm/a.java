package fm;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ThemedReactContext;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends View {
    public boolean E;
    public float[] F;
    public float G;
    public int[] H;
    public float[] I;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Paint f9311d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Path f9312e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public RectF f9313i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float[] f9314v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float[] f9315w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float[] f9316x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int[] f9317y;

    public a(ThemedReactContext themedReactContext) {
        super(themedReactContext);
        this.f9311d = new Paint(1);
        this.f9315w = new float[]{0.0f, 0.0f};
        this.f9316x = new float[]{0.0f, 1.0f};
        this.E = false;
        this.F = new float[]{0.5f, 0.5f};
        this.G = 45.0f;
        this.H = new int[]{0, 0};
        this.I = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
    }

    public final void a() {
        float[] fArr;
        float[] fArr2;
        float[] fArr3;
        float[] fArr4;
        int[] iArr = this.f9317y;
        if (iArr != null) {
            float[] fArr5 = this.f9314v;
            if (fArr5 == null || iArr.length == fArr5.length) {
                if (!this.E || this.F == null) {
                    float[] fArr6 = this.f9315w;
                    float f2 = fArr6[0];
                    int[] iArr2 = this.H;
                    float f7 = iArr2[0];
                    float f10 = fArr6[1];
                    float f11 = iArr2[1];
                    fArr = new float[]{f2 * f7, f10 * f11};
                    float[] fArr7 = this.f9316x;
                    fArr2 = new float[]{fArr7[0] * f7, fArr7[1] * f11};
                } else {
                    float f12 = 90.0f - this.G;
                    int[] iArr3 = this.H;
                    float f13 = f12 % 360.0f;
                    if (f13 < 0.0f) {
                        f13 += 360.0f;
                    }
                    if (f13 % 90.0f == 0.0f) {
                        float f14 = iArr3[0] / 2.0f;
                        float f15 = iArr3[1] / 2.0f;
                        if (f13 == 0.0f) {
                            fArr4 = new float[]{-f14, 0.0f};
                        } else if (f13 == 90.0f) {
                            fArr4 = new float[]{0.0f, -f15};
                        } else {
                            fArr4 = f13 == 180.0f ? new float[]{f14, 0.0f} : new float[]{0.0f, f15};
                        }
                    } else {
                        float fTan = (float) Math.tan((((double) f13) * 3.141592653589793d) / 180.0d);
                        float f16 = (-1.0f) / fTan;
                        float f17 = iArr3[0] / 2.0f;
                        float f18 = iArr3[1] / 2.0f;
                        if (f13 < 90.0f) {
                            fArr3 = new float[]{-f17, -f18};
                        } else if (f13 < 180.0f) {
                            fArr3 = new float[]{f17, -f18};
                        } else {
                            fArr3 = f13 < 270.0f ? new float[]{f17, f18} : new float[]{-f17, f18};
                        }
                        float f19 = (fArr3[1] - (fArr3[0] * f16)) / (fTan - f16);
                        fArr4 = new float[]{f19, fTan * f19};
                    }
                    float[] fArr8 = this.F;
                    float f20 = fArr8[0];
                    int[] iArr4 = this.H;
                    float[] fArr9 = {f20 * iArr4[0], fArr8[1] * iArr4[1]};
                    fArr = new float[]{fArr9[0] + fArr4[0], fArr9[1] - fArr4[1]};
                    fArr2 = new float[]{fArr9[0] - fArr4[0], fArr9[1] + fArr4[1]};
                }
                this.f9311d.setShader(new LinearGradient(fArr[0], fArr[1], fArr2[0], fArr2[1], this.f9317y, this.f9314v, Shader.TileMode.CLAMP));
                invalidate();
            }
        }
    }

    public final void b() {
        if (this.f9312e == null) {
            this.f9312e = new Path();
            this.f9313i = new RectF();
        }
        this.f9312e.reset();
        RectF rectF = this.f9313i;
        int[] iArr = this.H;
        rectF.set(0.0f, 0.0f, iArr[0], iArr[1]);
        this.f9312e.addRoundRect(this.f9313i, this.I, Path.Direction.CW);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Path path = this.f9312e;
        Paint paint = this.f9311d;
        if (path == null) {
            canvas.drawPaint(paint);
        } else {
            canvas.drawPath(path, paint);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        this.H = new int[]{i7, i10};
        b();
        a();
    }

    public void setAngle(float f2) {
        this.G = f2;
        a();
    }

    public void setAngleCenter(ReadableMap readableMap) {
        this.F = new float[]{(float) readableMap.getDouble("x"), (float) readableMap.getDouble("y")};
        a();
    }

    public void setBorderRadii(ReadableArray readableArray) {
        int size = readableArray.size();
        float[] fArr = new float[size];
        for (int i7 = 0; i7 < size; i7++) {
            fArr[i7] = PixelUtil.toPixelFromDIP((float) readableArray.getDouble(i7));
        }
        this.I = fArr;
        b();
        a();
    }

    public void setColors(ReadableArray readableArray) {
        int size = readableArray.size();
        int[] iArr = new int[size];
        for (int i7 = 0; i7 < size; i7++) {
            iArr[i7] = readableArray.getType(i7) == ReadableType.Map ? ColorPropConverter.getColor(readableArray.getMap(i7), getContext()).intValue() : readableArray.getInt(i7);
        }
        this.f9317y = iArr;
        a();
    }

    public void setEndPoint(ReadableMap readableMap) {
        this.f9316x = new float[]{(float) readableMap.getDouble("x"), (float) readableMap.getDouble("y")};
        a();
    }

    public void setLocations(ReadableArray readableArray) {
        int size = readableArray.size();
        float[] fArr = new float[size];
        for (int i7 = 0; i7 < size; i7++) {
            fArr[i7] = (float) readableArray.getDouble(i7);
        }
        this.f9314v = fArr;
        a();
    }

    public void setStartPoint(ReadableMap readableMap) {
        this.f9315w = new float[]{(float) readableMap.getDouble("x"), (float) readableMap.getDouble("y")};
        a();
    }

    public void setUseAngle(boolean z5) {
        this.E = z5;
        a();
    }
}
