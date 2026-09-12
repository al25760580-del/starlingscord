package on;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import android.view.PixelCopy;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.facebook.react.bridge.Promise;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.NativeViewHierarchyManager;
import com.facebook.react.uimanager.UIBlock;
import hi.o;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.zip.Deflater;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements UIBlock {
    public static byte[] K = new byte[65536];
    public static final Object L = new Object();
    public static final Set M = Collections.newSetFromMap(new WeakHashMap());
    public final String E;
    public final Promise F;
    public final Boolean G;
    public final boolean H;
    public final Activity I;
    public final Executor J;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f17472d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f17473e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f17474i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final double f17475v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Integer f17476w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Integer f17477x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final File f17478y;

    public e(int i7, String str, int i10, double d6, Integer num, Integer num2, File file, String str2, Boolean bool, Activity activity, boolean z5, Promise promise, Executor executor) {
        this.f17472d = i7;
        this.f17473e = str;
        this.f17474i = i10;
        this.f17475v = d6;
        this.f17476w = num;
        this.f17477x = num2;
        this.f17478y = file;
        this.E = str2;
        this.G = bool;
        this.I = activity;
        this.H = z5;
        this.F = promise;
        this.J = executor;
    }

    public static void a(e eVar, View view) throws IOException {
        String string;
        boolean z5 = -1 == eVar.f17474i;
        boolean zEquals = "zip-base64".equals(eVar.E);
        d dVar = new d(K);
        try {
            Point pointE = eVar.e(view, dVar);
            dVar.close();
            K = dVar.f();
            int size = dVar.size();
            Locale locale = Locale.US;
            String str = pointE.x + ":" + pointE.y + "|";
            if (!z5) {
                str = "";
            }
            if (zEquals) {
                Deflater deflater = new Deflater();
                deflater.setInput(K, 0, size);
                deflater.finish();
                d dVar2 = new d(new byte[32]);
                byte[] bArr = new byte[IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET];
                while (!deflater.finished()) {
                    dVar2.write(bArr, 0, deflater.deflate(bArr));
                }
                StringBuilder sbN = kk.b.n(str);
                sbN.append(Base64.encodeToString(dVar2.f(), 0, dVar2.size(), 2));
                string = sbN.toString();
            } else {
                StringBuilder sbN2 = kk.b.n(str);
                sbN2.append(Base64.encodeToString(K, 0, size, 2));
                string = sbN2.toString();
            }
            eVar.F.resolve(string);
        } catch (Throwable th2) {
            dVar.close();
            throw th2;
        }
    }

    public static void b(e eVar, View view) throws IOException {
        d dVar = new d(K);
        try {
            eVar.e(view, dVar);
            dVar.close();
            K = dVar.f();
            String strEncodeToString = Base64.encodeToString(K, 0, dVar.size(), 2);
            String str = eVar.f17473e;
            if ("jpg".equals(str)) {
                str = "jpeg";
            }
            eVar.F.resolve("data:image/" + str + ";base64," + strEncodeToString);
        } catch (Throwable th2) {
            dVar.close();
            throw th2;
        }
    }

    public static void c(e eVar, View view) throws IOException {
        File file = eVar.f17478y;
        String string = Uri.fromFile(file).toString();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        d dVar = new d(K);
        try {
            Point pointE = eVar.e(view, dVar);
            dVar.close();
            K = dVar.f();
            int size = dVar.size();
            Locale locale = Locale.US;
            fileOutputStream.write((pointE.x + ":" + pointE.y + "|").getBytes(Charset.forName("US-ASCII")));
            fileOutputStream.write(K, 0, size);
            fileOutputStream.close();
            eVar.F.resolve(string);
        } catch (Throwable th2) {
            dVar.close();
            throw th2;
        }
    }

    public static Matrix d(Canvas canvas, View view, View view2) {
        Matrix matrix = new Matrix();
        LinkedList<View> linkedList = new LinkedList();
        View view3 = view2;
        do {
            linkedList.add(view3);
            view3 = (View) view3.getParent();
        } while (view3 != view);
        Collections.reverse(linkedList);
        for (View view4 : linkedList) {
            canvas.save();
            int paddingTop = 0;
            float translationX = view4.getTranslationX() + view4.getLeft() + (view4 != view2 ? view4.getPaddingLeft() : 0);
            int top = view4.getTop();
            if (view4 != view2) {
                paddingTop = view4.getPaddingTop();
            }
            float translationY = view4.getTranslationY() + top + paddingTop;
            canvas.translate(translationX, translationY);
            canvas.rotate(view4.getRotation(), view4.getPivotX(), view4.getPivotY());
            canvas.scale(view4.getScaleX(), view4.getScaleY());
            matrix.postTranslate(translationX, translationY);
            matrix.postRotate(view4.getRotation(), view4.getPivotX(), view4.getPivotY());
            matrix.postScale(view4.getScaleX(), view4.getScaleY());
        }
        return matrix;
    }

    public static ArrayList f(View view) {
        if (!(view instanceof ViewGroup)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
            arrayList2.addAll(f(viewGroup.getChildAt(i7)));
        }
        return arrayList2;
    }

    public static Bitmap g(int i7, int i10) {
        synchronized (L) {
            try {
                for (Bitmap bitmap : M) {
                    if (bitmap.getWidth() == i7 && bitmap.getHeight() == i10) {
                        M.remove(bitmap);
                        bitmap.eraseColor(0);
                        return bitmap;
                    }
                }
                return Bitmap.createBitmap(i7, i10, Bitmap.Config.ARGB_8888);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void h(Bitmap bitmap) {
        synchronized (L) {
            M.add(bitmap);
        }
    }

    public final Point e(View view, OutputStream outputStream) {
        int i7;
        Bitmap bitmapCreateBitmap;
        SurfaceView surfaceView;
        View view2 = view;
        int width = view2.getWidth();
        int height = view2.getHeight();
        if (width <= 0 || height <= 0) {
            throw new RuntimeException("Impossible to snapshot the view: view is invalid");
        }
        boolean z5 = false;
        if (this.G.booleanValue()) {
            ScrollView scrollView = (ScrollView) view2;
            int height2 = 0;
            for (int i10 = 0; i10 < scrollView.getChildCount(); i10++) {
                height2 += scrollView.getChildAt(i10).getHeight();
            }
            i7 = height2;
        } else {
            i7 = height;
        }
        Point point = new Point(width, i7);
        synchronized (L) {
            try {
                Iterator it = M.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        bitmapCreateBitmap = Bitmap.createBitmap(width, i7, Bitmap.Config.ARGB_8888);
                        break;
                    }
                    bitmapCreateBitmap = (Bitmap) it.next();
                    if (bitmapCreateBitmap.getWidth() == width && bitmapCreateBitmap.getHeight() == i7) {
                        M.remove(bitmapCreateBitmap);
                        bitmapCreateBitmap.eraseColor(0);
                        break;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Bitmap bitmap = bitmapCreateBitmap;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setDither(true);
        Canvas canvas = new Canvas(bitmap);
        view2.draw(canvas);
        for (View view3 : f(view2)) {
            if (view3 instanceof TextureView) {
                if (view3.getVisibility() == 0) {
                    TextureView textureView = (TextureView) view3;
                    textureView.setOpaque(z5);
                    Bitmap bitmap2 = textureView.getBitmap(g(view3.getWidth(), view3.getHeight()));
                    int iSave = canvas.save();
                    d(canvas, view2, view3);
                    canvas.drawBitmap(bitmap2, 0.0f, 0.0f, paint);
                    canvas.restoreToCount(iSave);
                    h(bitmap2);
                }
            } else if ((view3 instanceof SurfaceView) && this.H) {
                SurfaceView surfaceView2 = (SurfaceView) view3;
                CountDownLatch countDownLatch = new CountDownLatch(1);
                Bitmap bitmapG = g(view3.getWidth(), view3.getHeight());
                try {
                    surfaceView = surfaceView2;
                    try {
                        PixelCopy.request(surfaceView, bitmapG, new b(this, canvas, view2, (SurfaceView) view3, bitmapG, paint, countDownLatch), new Handler(Looper.getMainLooper()));
                        countDownLatch.await(5L, TimeUnit.SECONDS);
                    } catch (Exception e10) {
                        e = e10;
                        Log.e("e", "Cannot PixelCopy for " + surfaceView, e);
                    }
                } catch (Exception e11) {
                    e = e11;
                    surfaceView = surfaceView2;
                }
            }
            view2 = view;
            z5 = false;
        }
        Integer num = this.f17476w;
        if (num != null && this.f17477x != null && (num.intValue() != width || this.f17477x.intValue() != i7)) {
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, this.f17476w.intValue(), this.f17477x.intValue(), true);
            h(bitmap);
            bitmap = bitmapCreateScaledBitmap;
        }
        int i11 = this.f17474i;
        if (-1 == i11 && (outputStream instanceof d)) {
            int i12 = width * i7 * 4;
            d dVar = (d) outputStream;
            bitmap.copyPixelsToBuffer(dVar.c(i12));
            dVar.g(i12);
        } else {
            bitmap.compress(c.f17471a[i11], (int) (this.f17475v * 100.0d), outputStream);
        }
        h(bitmap);
        return point;
    }

    @Override // com.facebook.react.uimanager.UIBlock
    public final void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
        this.J.execute(new o(this, nativeViewHierarchyManager, 16, false));
    }
}
