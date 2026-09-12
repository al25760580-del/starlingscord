package q8;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.ExifInterface;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.facebook.common.references.CloseableReference;
import com.reactnativecommunity.clipboard.ClipboardModule;
import h3.h;
import he.m0;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import sd.i;
import sd.l;
import sd.o;
import sd.p;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements b, t2.b, ec.a, g3.c, m9.b, p, qm.a, ci.p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static c f18630d;

    public static TextView h(Toolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        int childCount = toolbar.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = toolbar.getChildAt(i7);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), toolbar.getTitle())) {
                    return textView;
                }
            }
        }
        return null;
    }

    public static synchronized c i() {
        try {
            if (f18630d == null) {
                f18630d = new c();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f18630d;
    }

    public static File j(Context context, String str, int i7, int i10, int i11, int i12, int i13, String str2) throws IOException {
        int i14;
        int i15;
        int i16;
        Bitmap bitmapDecodeFile;
        if (i7 > i11) {
            i15 = (int) (i10 * (i11 / i7));
            i14 = i11;
        } else {
            i14 = i7;
            i15 = i10;
        }
        if (i15 > i12) {
            i14 = (int) (i14 * (i12 / i15));
            i15 = i12;
        }
        Pair pairCreate = Pair.create(Integer.valueOf(i14), Integer.valueOf(i15));
        int iIntValue = ((Integer) pairCreate.first).intValue();
        int iIntValue2 = ((Integer) pairCreate.second).intValue();
        if (i7 > i11 || i10 > i12) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            if (i7 > iIntValue || i10 > iIntValue2) {
                int i17 = i7 / 2;
                int i18 = i10 / 2;
                i16 = 1;
                while (i17 / i16 >= iIntValue && i18 / i16 >= iIntValue2) {
                    i16 *= 2;
                }
            } else {
                i16 = 1;
            }
            options.inSampleSize = i16;
            bitmapDecodeFile = BitmapFactory.decodeFile(str, options);
        } else {
            bitmapDecodeFile = BitmapFactory.decodeFile(str);
        }
        String attribute = new ExifInterface(str).getAttribute("Orientation");
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDecodeFile, iIntValue, iIntValue2, true);
        File externalFilesDir = context.getExternalFilesDir(Environment.DIRECTORY_PICTURES);
        if (!externalFilesDir.exists()) {
            Log.d("image-crop-picker", "Pictures Directory is not existing. Will create this directory.");
            externalFilesDir.mkdirs();
        }
        Bitmap.CompressFormat compressFormat = str2.equals(ClipboardModule.MIMETYPE_PNG) ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
        Bitmap.CompressFormat compressFormat2 = Bitmap.CompressFormat.PNG;
        File file = new File(externalFilesDir, UUID.randomUUID() + (compressFormat == compressFormat2 ? ".png" : ".jpg"));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
        if (!str2.equals(ClipboardModule.MIMETYPE_PNG)) {
            compressFormat2 = Bitmap.CompressFormat.JPEG;
        }
        bitmapCreateScaledBitmap.compress(compressFormat2, i13, bufferedOutputStream);
        if (!attribute.equals(String.valueOf(1)) && !attribute.equals(String.valueOf(0))) {
            ExifInterface exifInterface = new ExifInterface(file.getAbsolutePath());
            exifInterface.setAttribute("Orientation", attribute);
            exifInterface.saveAttributes();
        }
        bufferedOutputStream.close();
        bitmapCreateScaledBitmap.recycle();
        return file;
    }

    @Override // ci.r
    public Object a() {
        return new kh.f(19);
    }

    @Override // ec.a
    public long b() {
        return System.currentTimeMillis();
    }

    @Override // m9.b
    public CloseableReference c() {
        return null;
    }

    @Override // m9.b
    public boolean contains(int i7) {
        return false;
    }

    @Override // g3.c
    public g3.d d(g3.b configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return new h((Context) configuration.f9463c, (String) configuration.f9464d, (a1.d) configuration.f9465e, configuration.f9461a, configuration.f9462b);
    }

    @Override // m9.b
    public CloseableReference e() {
        return null;
    }

    @Override // m9.b
    public CloseableReference f(int i7) {
        return null;
    }

    @Override // qm.a
    public String g() {
        return "onDismiss";
    }

    @Override // qm.a
    public String getEventName() {
        return "topDismiss";
    }

    @Override // m9.b
    public void k(int i7, CloseableReference bitmapReference) {
        Intrinsics.checkNotNullParameter(bitmapReference, "bitmapReference");
    }

    @Override // m9.b
    public void l(int i7, CloseableReference bitmapReference) {
        Intrinsics.checkNotNullParameter(bitmapReference, "bitmapReference");
    }

    public Object m() {
        int i7 = ag.a.f498a;
        if (ag.c.f507e == null) {
            ag.c.f507e = new ag.b(0);
        }
        synchronized (ag.c.f506d) {
        }
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    }

    @Override // sd.p
    public m0 s(l lVar, i iVar) {
        return new o(lVar, iVar);
    }

    @Override // sd.p
    public m0 u() {
        return new o(l.f19898n, null);
    }

    @Override // m9.b
    public void clear() {
    }
}
