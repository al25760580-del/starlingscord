package kn;

import a3.e;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.yalantis.ucrop.UCropActivity;
import fj.c;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import mn.f;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.BufferedSource;
import rs.v;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends AsyncTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f14606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Uri f14607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri f14608c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f14609d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f14610e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c f14611f;

    public b(Context context, Uri uri, Uri uri2, int i7, int i10, c cVar) {
        this.f14606a = context;
        this.f14607b = uri;
        this.f14608c = uri2;
        this.f14609d = i7;
        this.f14610e = i10;
        this.f14611f = cVar;
    }

    public final void a(Uri uri, Uri uri2) throws Throwable {
        InputStream inputStreamOpenInputStream;
        Uri uri3 = this.f14608c;
        Context context = this.f14606a;
        Log.d("BitmapWorkerTask", "copyFile");
        if (uri2 == null) {
            throw new NullPointerException("Output Uri is null - cannot copy image");
        }
        try {
            inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            try {
                if (inputStreamOpenInputStream == null) {
                    throw new NullPointerException("InputStream for given input Uri is null");
                }
                OutputStream outputStreamOpenOutputStream = uri2.getScheme().equals("content") ? context.getContentResolver().openOutputStream(uri2) : new FileOutputStream(new File(uri2.getPath()));
                byte[] bArr = new byte[IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET];
                while (true) {
                    int i7 = inputStreamOpenInputStream.read(bArr);
                    if (i7 <= 0) {
                        a.a.a(outputStreamOpenOutputStream);
                        a.a.a(inputStreamOpenInputStream);
                        this.f14607b = uri3;
                        return;
                    }
                    outputStreamOpenOutputStream.write(bArr, 0, i7);
                }
            } catch (Throwable th2) {
                th = th2;
                a.a.a(null);
                a.a.a(inputStreamOpenInputStream);
                this.f14607b = uri3;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            inputStreamOpenInputStream = null;
        }
    }

    public final void b(Uri uri, Uri uri2) throws Throwable {
        Closeable closeable;
        Response response;
        Uri uri3 = this.f14608c;
        Log.d("BitmapWorkerTask", "downloadFile");
        if (uri2 == null) {
            throw new NullPointerException("Output Uri is null - cannot download image");
        }
        hn.c cVar = hn.c.f10952c;
        if (((OkHttpClient) cVar.f10954b) == null) {
            cVar.f10954b = new OkHttpClient();
        }
        OkHttpClient okHttpClient = (OkHttpClient) cVar.f10954b;
        BufferedSource bufferedSource = null;
        try {
            Request.Builder builder = new Request.Builder();
            builder.i(uri.toString());
            Response responseE = okHttpClient.a(builder.b()).e();
            try {
                ResponseBody responseBody = responseE.f17385y;
                BufferedSource bufferedSourceSource = responseBody.source();
                try {
                    OutputStream outputStreamOpenOutputStream = uri3.getScheme().equals("content") ? this.f14606a.getContentResolver().openOutputStream(uri2) : new FileOutputStream(new File(uri2.getPath()));
                    if (outputStreamOpenOutputStream == null) {
                        throw new NullPointerException("OutputStream for given output Uri is null");
                    }
                    rs.a aVarI = v.i(outputStreamOpenOutputStream);
                    bufferedSourceSource.Z(aVarI);
                    a.a.a(bufferedSourceSource);
                    a.a.a(aVarI);
                    a.a.a(responseBody);
                    okHttpClient.f17337d.a();
                    this.f14607b = uri3;
                } catch (Throwable th2) {
                    th = th2;
                    response = responseE;
                    closeable = null;
                    bufferedSource = bufferedSourceSource;
                    a.a.a(bufferedSource);
                    a.a.a(closeable);
                    if (response != null) {
                        a.a.a(response.f17385y);
                    }
                    okHttpClient.f17337d.a();
                    this.f14607b = uri3;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                response = responseE;
                closeable = null;
            }
        } catch (Throwable th4) {
            th = th4;
            closeable = null;
            response = null;
        }
    }

    public final void c() {
        Log.d("BitmapWorkerTask", "Uri scheme: " + this.f14607b.getScheme());
        String scheme = this.f14607b.getScheme();
        boolean zEquals = scheme.equals("http");
        Uri uri = this.f14608c;
        if (zEquals || scheme.equals("https")) {
            try {
                b(this.f14607b, uri);
                return;
            } catch (IOException | NullPointerException e10) {
                Log.e("BitmapWorkerTask", "Downloading failed", e10);
                throw e10;
            }
        }
        if (this.f14607b.getScheme().equals("content")) {
            try {
                a(this.f14607b, uri);
                return;
            } catch (IOException | NullPointerException e11) {
                Log.e("BitmapWorkerTask", "Copying failed", e11);
                throw e11;
            }
        }
        if (this.f14607b.getScheme().equals("file")) {
            return;
        }
        String scheme2 = this.f14607b.getScheme();
        Log.e("BitmapWorkerTask", "Invalid Uri scheme " + scheme2);
        throw new IllegalArgumentException(e.l("Invalid Uri scheme", scheme2));
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        a aVar;
        int i7;
        int iA;
        int i10;
        int i11;
        if (this.f14607b == null) {
            return new a(new NullPointerException("Input Uri cannot be null"));
        }
        try {
            c();
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            int i12 = options.outHeight;
            int i13 = options.outWidth;
            int i14 = this.f14609d;
            int i15 = this.f14610e;
            if (i12 > i15 || i13 > i14) {
                i7 = 1;
                while (true) {
                    if (i12 / i7 <= i15 && i13 / i7 <= i14) {
                        break;
                    }
                    i7 *= 2;
                }
            } else {
                i7 = 1;
            }
            options.inSampleSize = i7;
            int i16 = 0;
            options.inJustDecodeBounds = false;
            boolean z5 = false;
            Bitmap bitmapDecodeStream = null;
            while (true) {
                Context context = this.f14606a;
                int i17 = -1;
                if (z5) {
                    if (bitmapDecodeStream == null) {
                        return new a(new IllegalArgumentException("Bitmap could not be decoded from the Uri: [" + this.f14607b + "]"));
                    }
                    Uri uri = this.f14607b;
                    try {
                        InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
                        if (inputStreamOpenInputStream == null) {
                            iA = 0;
                        } else {
                            iA = new ln.b(inputStreamOpenInputStream).a();
                            try {
                                a.a.a(inputStreamOpenInputStream);
                            } catch (IOException e10) {
                                e = e10;
                                Log.e("BitmapLoadUtils", "getExifOrientation: " + uri.toString(), e);
                            }
                        }
                    } catch (IOException e11) {
                        e = e11;
                        iA = 0;
                    }
                    switch (iA) {
                        case 3:
                        case 4:
                            i10 = 180;
                            break;
                        case 5:
                        case 6:
                            i10 = 90;
                            break;
                        case 7:
                        case 8:
                            i10 = 270;
                            break;
                        default:
                            i10 = 0;
                            break;
                    }
                    if (iA != 2 && iA != 7 && iA != 4 && iA != 5) {
                        i17 = 1;
                    }
                    jn.c cVar = new jn.c();
                    cVar.f13984a = iA;
                    cVar.f13985b = i10;
                    cVar.f13986c = i17;
                    Matrix matrix = new Matrix();
                    if (i10 != 0) {
                        matrix.preRotate(i10);
                    }
                    if (i17 != 1) {
                        matrix.postScale(i17, 1.0f);
                    }
                    if (matrix.isIdentity()) {
                        return new a(bitmapDecodeStream, cVar);
                    }
                    try {
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeStream, 0, 0, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight(), matrix, true);
                        if (!bitmapDecodeStream.sameAs(bitmapCreateBitmap)) {
                            bitmapDecodeStream = bitmapCreateBitmap;
                        }
                    } catch (OutOfMemoryError e12) {
                        Log.e("BitmapLoadUtils", "transformBitmap: ", e12);
                    }
                    return new a(bitmapDecodeStream, cVar);
                }
                try {
                    InputStream inputStreamOpenInputStream2 = context.getContentResolver().openInputStream(this.f14607b);
                    try {
                        bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream2, null, options);
                        if (options.outWidth == -1 || options.outHeight == -1) {
                            a aVar2 = new a(new IllegalArgumentException("Bounds for bitmap could not be retrieved from the Uri: [" + this.f14607b + "]"));
                            a.a.a(inputStreamOpenInputStream2);
                            return aVar2;
                        }
                        a.a.a(inputStreamOpenInputStream2);
                        if ((bitmapDecodeStream != null ? bitmapDecodeStream.getByteCount() : i16) > 104857600) {
                            options.inSampleSize *= 2;
                            i11 = 1;
                        } else {
                            i11 = i16;
                        }
                        if (i11 == 0) {
                            z5 = true;
                        }
                    } catch (Throwable th2) {
                        a.a.a(inputStreamOpenInputStream2);
                        throw th2;
                    }
                } catch (IOException e13) {
                    Log.e("BitmapWorkerTask", "doInBackground: ImageDecoder.createSource: ", e13);
                    aVar = new a(new IllegalArgumentException("Bitmap could not be decoded from the Uri: [" + this.f14607b + "]", e13));
                    return aVar;
                } catch (OutOfMemoryError e14) {
                    Log.e("BitmapWorkerTask", "doInBackground: BitmapFactory.decodeFileDescriptor: ", e14);
                    options.inSampleSize *= 2;
                    i16 = 0;
                }
            }
        } catch (IOException | NullPointerException e15) {
            aVar = new a(e15);
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        a aVar = (a) obj;
        Exception exc = aVar.f14605c;
        c cVar = this.f14611f;
        if (exc != null) {
            cVar.getClass();
            Log.e("TransformImageView", "onFailure: setImageUri", exc);
            mn.e eVar = ((f) cVar.f9267e).f15934y;
            if (eVar != null) {
                UCropActivity uCropActivity = (UCropActivity) ((hn.c) eVar).f10954b;
                uCropActivity.f(exc);
                uCropActivity.finish();
                return;
            }
            return;
        }
        Bitmap bitmap = aVar.f14603a;
        jn.c cVar2 = aVar.f14604b;
        String path = this.f14607b.getPath();
        Uri uri = this.f14608c;
        String path2 = uri == null ? null : uri.getPath();
        f fVar = (f) cVar.f9267e;
        fVar.J = path;
        fVar.K = path2;
        fVar.L = cVar2;
        fVar.G = true;
        fVar.setImageBitmap(bitmap);
    }
}
