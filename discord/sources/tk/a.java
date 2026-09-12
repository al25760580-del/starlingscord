package tk;

import android.graphics.PointF;
import android.opengl.GLES20;
import e4.c;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FloatBuffer f20822d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f20823e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f20824f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f20825g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f20826h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f20827i;
    public int j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f20828l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float[] f20820b = new float[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float[] f20821c = new float[16];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f20819a = new c(20, new PointF(1.0f, 1.0f), new PointF(0.5f, 0.5f));

    public a() {
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(80).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f20822d = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(new float[]{-1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f}).position(0);
    }

    public final void a() {
        GLES20.glDeleteProgram(this.f20825g);
        GLES20.glDeleteShader(this.f20823e);
        GLES20.glDeleteShader(this.f20824f);
        GLES20.glDeleteBuffers(1, new int[]{this.f20828l}, 0);
        this.f20825g = 0;
        this.f20823e = 0;
        this.f20824f = 0;
        this.f20828l = 0;
    }
}
