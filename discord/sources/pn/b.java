package pn;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import rn.w;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f18056a = File.separator;

    public static final Bitmap.CompressFormat a(File compressFormat) {
        Intrinsics.checkParameterIsNotNull(compressFormat, "$this$compressFormat");
        Intrinsics.checkNotNullParameter(compressFormat, "<this>");
        String name = compressFormat.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        String strW = StringsKt.W('.', name, "");
        if (strW == null) {
            throw new w("null cannot be cast to non-null type java.lang.String");
        }
        String lowerCase = strW.toLowerCase();
        Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase()");
        int iHashCode = lowerCase.hashCode();
        if (iHashCode != 111145) {
            if (iHashCode != 3198679) {
                if (iHashCode == 3645340 && lowerCase.equals("webp")) {
                    return Bitmap.CompressFormat.WEBP;
                }
            } else if (lowerCase.equals("heic")) {
                return null;
            }
        } else if (lowerCase.equals("png")) {
            return Bitmap.CompressFormat.PNG;
        }
        return Bitmap.CompressFormat.JPEG;
    }

    public static final Bitmap b(File imageFile) {
        Intrinsics.checkParameterIsNotNull(imageFile, "imageFile");
        BitmapFactory.Options options = new BitmapFactory.Options();
        int i7 = 1;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(imageFile.getAbsolutePath(), options);
        Intrinsics.checkParameterIsNotNull(options, "options");
        int i10 = options.outHeight;
        int i11 = options.outWidth;
        if (i10 > 816 || i11 > 612) {
            int i12 = i10 / 2;
            int i13 = i11 / 2;
            while (i12 / i7 >= 816 && i13 / i7 >= 612) {
                i7 *= 2;
            }
        }
        options.inSampleSize = i7;
        options.inJustDecodeBounds = false;
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(imageFile.getAbsolutePath(), options);
        Intrinsics.checkExpressionValueIsNotNull(bitmapDecodeFile, "BitmapFactory.decodeFile…eFile.absolutePath, this)");
        Intrinsics.checkExpressionValueIsNotNull(bitmapDecodeFile, "BitmapFactory.Options().…absolutePath, this)\n    }");
        return bitmapDecodeFile;
    }

    public static final Bitmap c(File imageFile, Bitmap bitmap) {
        Intrinsics.checkParameterIsNotNull(imageFile, "imageFile");
        Intrinsics.checkParameterIsNotNull(bitmap, "bitmap");
        int attributeInt = new ExifInterface(imageFile.getAbsolutePath()).getAttributeInt("Orientation", 0);
        Matrix matrix = new Matrix();
        if (attributeInt == 3) {
            matrix.postRotate(180.0f);
        } else if (attributeInt == 6) {
            matrix.postRotate(90.0f);
        } else if (attributeInt == 8) {
            matrix.postRotate(270.0f);
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        Intrinsics.checkExpressionValueIsNotNull(bitmapCreateBitmap, "Bitmap.createBitmap(bitm…map.height, matrix, true)");
        return bitmapCreateBitmap;
    }

    public static final Bitmap d(File imageFile) {
        Intrinsics.checkParameterIsNotNull(imageFile, "imageFile");
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(imageFile.getAbsolutePath());
        if (bitmapDecodeFile != null) {
            return c(imageFile, bitmapDecodeFile);
        }
        throw new IllegalArgumentException(("Failed to load bitmap from " + imageFile).toString());
    }

    public static File e(File imageFile, Bitmap bitmap, int i7, int i10) throws Throwable {
        File destination;
        String str;
        FileOutputStream fileOutputStream;
        Throwable th2;
        Bitmap.CompressFormat compressFormatA;
        Bitmap.CompressFormat extension = Bitmap.CompressFormat.JPEG;
        if ((i10 & 4) != 0 && (compressFormatA = a(imageFile)) != null) {
            extension = compressFormatA;
        }
        if ((i10 & 8) != 0) {
            i7 = 100;
        }
        Intrinsics.checkParameterIsNotNull(imageFile, "imageFile");
        Intrinsics.checkParameterIsNotNull(bitmap, "bitmap");
        Intrinsics.checkParameterIsNotNull(extension, "format");
        if (extension == a(imageFile)) {
            destination = imageFile;
        } else {
            StringBuilder sb2 = new StringBuilder();
            String absolutePath = imageFile.getAbsolutePath();
            Intrinsics.checkExpressionValueIsNotNull(absolutePath, "imageFile.absolutePath");
            sb2.append(StringsKt.Z(absolutePath, absolutePath));
            sb2.append('.');
            Intrinsics.checkParameterIsNotNull(extension, "$this$extension");
            int i11 = a.f18055a[extension.ordinal()];
            if (i11 != 1) {
                str = i11 != 2 ? "jpg" : "webp";
            } else {
                str = "png";
            }
            sb2.append(str);
            destination = new File(sb2.toString());
        }
        imageFile.delete();
        Intrinsics.checkParameterIsNotNull(bitmap, "bitmap");
        Intrinsics.checkParameterIsNotNull(destination, "destination");
        Intrinsics.checkParameterIsNotNull(extension, "format");
        File parentFile = destination.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        try {
            fileOutputStream = new FileOutputStream(destination.getAbsolutePath());
            try {
                bitmap.compress(extension, i7, fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.close();
                return destination;
            } catch (Throwable th3) {
                th2 = th3;
                if (fileOutputStream != null) {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                }
                throw th2;
            }
        } catch (Throwable th4) {
            fileOutputStream = null;
            th2 = th4;
        }
    }
}
