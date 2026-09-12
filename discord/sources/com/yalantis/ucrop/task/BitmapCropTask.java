package com.yalantis.ucrop.task;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.RectF;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import com.yalantis.ucrop.UCropActivity;
import io.sentry.android.core.internal.gestures.e;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import jn.b;
import jn.c;
import n2.h;

/* JADX INFO: loaded from: classes3.dex */
public class BitmapCropTask extends AsyncTask<Void, Void, Throwable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Bitmap f7284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RectF f7285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RectF f7286c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f7287d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f7288e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f7289f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f7290g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Bitmap.CompressFormat f7291h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f7292i;
    public final String j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c f7293l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final hn.c f7294m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f7295n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f7296o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f7297p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f7298q;

    static {
        System.loadLibrary("ucrop");
    }

    public BitmapCropTask(Bitmap bitmap, e eVar, b bVar, hn.c cVar) {
        this.f7284a = bitmap;
        this.f7285b = (RectF) eVar.f12232c;
        this.f7286c = (RectF) eVar.f12233d;
        this.f7287d = eVar.f12230a;
        this.f7288e = eVar.f12231b;
        this.f7289f = bVar.f13977a;
        this.f7290g = bVar.f13978b;
        this.f7291h = (Bitmap.CompressFormat) bVar.f13981e;
        this.f7292i = bVar.f13979c;
        this.j = bVar.f13980d;
        this.k = (String) bVar.f13982f;
        this.f7293l = (c) bVar.f13983g;
        this.f7294m = cVar;
    }

    public static native boolean cropCImg(String str, String str2, int i7, int i10, int i11, int i12, float f2, float f7, int i13, int i14, int i15, int i16);

    public final void a(float f2) throws Throwable {
        FileChannel channel;
        String str = this.j;
        h hVar = new h(str);
        RectF rectF = this.f7285b;
        float f7 = rectF.left;
        RectF rectF2 = this.f7286c;
        this.f7297p = Math.round((f7 - rectF2.left) / this.f7287d);
        this.f7298q = Math.round((rectF.top - rectF2.top) / this.f7287d);
        this.f7295n = Math.round(rectF.width() / this.f7287d);
        int iRound = Math.round(rectF.height() / this.f7287d);
        this.f7296o = iRound;
        boolean z5 = true;
        int iRound2 = Math.round(Math.max(this.f7295n, iRound) / 1000.0f) + 1;
        if (this.f7289f <= 0 || this.f7290g <= 0) {
            float f10 = iRound2;
            if (Math.abs(rectF.left - rectF2.left) <= f10 && Math.abs(rectF.top - rectF2.top) <= f10 && Math.abs(rectF.bottom - rectF2.bottom) <= f10 && Math.abs(rectF.right - rectF2.right) <= f10 && this.f7288e == 0.0f) {
                z5 = false;
            }
        }
        Log.i("BitmapCropTask", "Should crop: " + z5);
        String str2 = this.k;
        if (z5) {
            int i7 = this.f7297p;
            int i10 = this.f7298q;
            int i11 = this.f7295n;
            int i12 = this.f7296o;
            Bitmap.CompressFormat compressFormat = this.f7291h;
            int iOrdinal = compressFormat.ordinal();
            c cVar = this.f7293l;
            if (cropCImg(this.j, this.k, i7, i10, i11, i12, this.f7288e, f2, iOrdinal, this.f7292i, cVar.f13985b, cVar.f13986c) && compressFormat.equals(Bitmap.CompressFormat.JPEG)) {
                int i13 = this.f7295n;
                int i14 = this.f7296o;
                byte[] bArr = ln.b.f15141b;
                String[] strArr = {"FNumber", "DateTime", "DateTimeDigitized", "ExposureTime", "Flash", "FocalLength", "GPSAltitude", "GPSAltitudeRef", "GPSDateStamp", "GPSLatitude", "GPSLatitudeRef", "GPSLongitude", "GPSLongitudeRef", "GPSProcessingMethod", "GPSTimeStamp", "PhotographicSensitivity", "Make", "Model", "SubSecTime", "SubSecTimeDigitized", "SubSecTimeOriginal", "WhiteBalance"};
                try {
                    h hVar2 = new h(str2);
                    for (int i15 = 0; i15 < 22; i15++) {
                        String str3 = strArr[i15];
                        String strB = hVar.b(str3);
                        if (!TextUtils.isEmpty(strB)) {
                            hVar2.F(str3, strB);
                        }
                    }
                    hVar2.F("ImageWidth", String.valueOf(i13));
                    hVar2.F("ImageLength", String.valueOf(i14));
                    hVar2.F("Orientation", "0");
                    hVar2.B();
                    return;
                } catch (IOException e10) {
                    Log.d("ImageHeaderParser", e10.getMessage());
                    return;
                }
            }
            return;
        }
        if (str.equalsIgnoreCase(str2)) {
            return;
        }
        FileChannel fileChannel = null;
        try {
            FileChannel channel2 = new FileInputStream(new File(str)).getChannel();
            try {
                channel = new FileOutputStream(new File(str2)).getChannel();
                try {
                    channel2.transferTo(0L, channel2.size(), channel);
                    channel2.close();
                    channel2.close();
                    if (channel != null) {
                        channel.close();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileChannel = channel2;
                    if (fileChannel != null) {
                        fileChannel.close();
                    }
                    if (channel != null) {
                        channel.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                channel = null;
            }
        } catch (Throwable th4) {
            th = th4;
            channel = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x009f  */
    @Override // android.os.AsyncTask
    public final Throwable doInBackground(Void[] voidArr) {
        float fMin;
        int i7;
        Bitmap bitmap = this.f7284a;
        if (bitmap == null) {
            return new NullPointerException("ViewBitmap is null");
        }
        if (bitmap.isRecycled()) {
            return new NullPointerException("ViewBitmap is recycled");
        }
        if (this.f7286c.isEmpty()) {
            return new NullPointerException("CurrentImageRect is empty");
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        boolean z5 = true;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(this.j, options);
        int i10 = this.f7293l.f13985b;
        if (i10 != 90 && i10 != 270) {
            z5 = false;
        }
        this.f7287d /= Math.min((z5 ? options.outHeight : options.outWidth) / this.f7284a.getWidth(), (z5 ? options.outWidth : options.outHeight) / this.f7284a.getHeight());
        int i11 = this.f7289f;
        if (i11 <= 0 || (i7 = this.f7290g) <= 0) {
            fMin = 1.0f;
        } else {
            RectF rectF = this.f7285b;
            float fWidth = rectF.width() / this.f7287d;
            float fHeight = rectF.height() / this.f7287d;
            float f2 = i11;
            if (fWidth > f2 || fHeight > i7) {
                fMin = Math.min(f2 / fWidth, i7 / fHeight);
                this.f7287d /= fMin;
            } else {
                fMin = 1.0f;
            }
        }
        try {
            a(fMin);
            this.f7284a = null;
            return null;
        } catch (Throwable th2) {
            return th2;
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Throwable th2) {
        Throwable th3 = th2;
        hn.c cVar = this.f7294m;
        if (cVar != null) {
            UCropActivity uCropActivity = (UCropActivity) cVar.f10954b;
            if (th3 != null) {
                uCropActivity.f(th3);
                uCropActivity.finish();
                return;
            }
            Uri uriFromFile = Uri.fromFile(new File(this.k));
            int i7 = this.f7297p;
            int i10 = this.f7298q;
            int i11 = this.f7295n;
            uCropActivity.setResult(-1, new Intent().putExtra("com.yalantis.ucrop.OutputUri", uriFromFile).putExtra("com.yalantis.ucrop.CropAspectRatio", uCropActivity.J.getTargetAspectRatio()).putExtra("com.yalantis.ucrop.ImageWidth", i11).putExtra("com.yalantis.ucrop.ImageHeight", this.f7296o).putExtra("com.yalantis.ucrop.OffsetX", i7).putExtra("com.yalantis.ucrop.OffsetY", i10));
            uCropActivity.finish();
        }
    }
}
