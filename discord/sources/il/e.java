package il;

import android.app.Activity;
import android.content.ClipData;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.MimeTypeMap;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.u0;
import com.discord.R;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.core.PermissionAwareActivity;
import com.google.android.material.datepicker.h;
import com.reactnativecommunity.clipboard.ClipboardModule;
import com.yalantis.ucrop.UCropActivity;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements ActivityEventListener {

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static a f11846f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static b f11847g0;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public ReadableMap M;
    public String N;
    public String O;
    public String P;
    public String Q;
    public String R;
    public String S;
    public String T;
    public String U;
    public String V;
    public String W;
    public int X;
    public int Y;
    public int Z;
    public Uri a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public String f11848b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public f f11849c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f11850d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public q8.c f11851d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f11852e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public ReactApplicationContext f11853e0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f11854i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f11855v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f11856w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f11857x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f11858y;

    public static Uri a(e eVar, Activity activity, Uri uri) throws Throwable {
        eVar.getClass();
        String strQ = com.facebook.imagepipeline.nativecode.b.q(activity, uri);
        if (strQ != null && !strQ.isEmpty()) {
            File file = new File(strQ);
            if (file.exists() && file.canRead()) {
                return Uri.fromFile(file);
            }
        }
        String strI = i(activity, uri);
        if (strI == null || strI.isEmpty()) {
            strI = "jpg";
        }
        File file2 = new File(m(activity), UUID.randomUUID().toString() + "." + strI);
        InputStream inputStreamOpenInputStream = activity.getContentResolver().openInputStream(uri);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                if (inputStreamOpenInputStream == null) {
                    throw new IOException("Failed to open input stream for content URI");
                }
                byte[] bArr = new byte[8192];
                while (true) {
                    int i7 = inputStreamOpenInputStream.read(bArr);
                    if (i7 == -1) {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        inputStreamOpenInputStream.close();
                        return Uri.fromFile(file2);
                    }
                    fileOutputStream.write(bArr, 0, i7);
                }
            } catch (Throwable th2) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            if (inputStreamOpenInputStream != null) {
                try {
                    inputStreamOpenInputStream.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
            }
            throw th4;
        }
    }

    public static void b(UCropActivity uCropActivity, int i7, int i10) {
        try {
            View viewFindViewById = uCropActivity.findViewById(R.id.layout_aspect_ratio);
            if (viewFindViewById != null && (viewFindViewById instanceof ViewGroup)) {
                ViewGroup viewGroup = (ViewGroup) viewFindViewById;
                for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                    View childAt = viewGroup.getChildAt(i11);
                    if (childAt instanceof ViewGroup) {
                        ViewGroup viewGroup2 = (ViewGroup) childAt;
                        if (viewGroup2.getChildCount() > 0) {
                            View childAt2 = viewGroup2.getChildAt(0);
                            if (childAt2 instanceof TextView) {
                                TextView textView = (TextView) childAt2;
                                if (i7 != -1 || i10 != -1) {
                                    textView.setTextColor(new ColorStateList(new int[][]{new int[]{android.R.attr.state_selected}, new int[0]}, new int[]{i7 != -1 ? i7 : -40192, i10 != -1 ? i10 : -16777216}));
                                }
                            } else {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        } catch (Exception e10) {
            Log.e("ImageCropPicker", "Error applying aspect ratio text colors", e10);
        }
    }

    public static void c(UCropActivity uCropActivity, int i7, int i10, int i11, int i12, int i13) {
        try {
            View viewFindViewById = uCropActivity.findViewById(i7);
            if (viewFindViewById == null) {
                return;
            }
            ImageView imageView = (ImageView) viewFindViewById.findViewById(i10);
            TextView textView = (TextView) viewFindViewById.findViewById(i11);
            if (imageView != null && imageView.getDrawable() != null) {
                Drawable drawableMutate = imageView.getDrawable().mutate();
                if (i12 != -1 && i13 != -1) {
                    drawableMutate.setTintList(new ColorStateList(new int[][]{new int[]{android.R.attr.state_selected}, new int[0]}, new int[]{i12, i13}));
                } else if (i12 != -1) {
                    drawableMutate.setTintList(new ColorStateList(new int[][]{new int[]{android.R.attr.state_selected}, new int[0]}, new int[]{i12, -8355712}));
                } else if (i13 != -1) {
                    drawableMutate.setTintList(new ColorStateList(new int[][]{new int[]{android.R.attr.state_selected}, new int[0]}, new int[]{-40192, i13}));
                }
            }
            if (textView != null) {
                if (i12 != -1 && i13 != -1) {
                    textView.setTextColor(new ColorStateList(new int[][]{new int[]{android.R.attr.state_selected}, new int[0]}, new int[]{i12, i13}));
                } else if (i12 != -1) {
                    textView.setTextColor(new ColorStateList(new int[][]{new int[]{android.R.attr.state_selected}, new int[0]}, new int[]{i12, -8355712}));
                } else if (i13 != -1) {
                    textView.setTextColor(new ColorStateList(new int[][]{new int[]{android.R.attr.state_selected}, new int[0]}, new int[]{-40192, i13}));
                }
            }
        } catch (Exception e10) {
            Log.e("ImageCropPicker", "Error applying widget state colors", e10);
        }
    }

    public static void f(File file) {
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                f(file2);
            }
        }
        file.delete();
    }

    public static WritableNativeMap h(Intent intent) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putInt("x", intent.getIntExtra("com.yalantis.ucrop.OffsetX", -1));
        writableNativeMap.putInt("y", intent.getIntExtra("com.yalantis.ucrop.OffsetY", -1));
        writableNativeMap.putInt("width", intent.getIntExtra("com.yalantis.ucrop.ImageWidth", -1));
        writableNativeMap.putInt("height", intent.getIntExtra("com.yalantis.ucrop.ImageHeight", -1));
        return writableNativeMap;
    }

    public static String i(Activity activity, Uri uri) {
        return uri.getScheme().equals("content") ? MimeTypeMap.getSingleton().getExtensionFromMimeType(activity.getContentResolver().getType(uri)) : MimeTypeMap.getFileExtensionFromUrl(Uri.fromFile(new File(uri.getPath())).toString());
    }

    public static String m(Activity activity) {
        String str = activity.getCacheDir() + "/react-native-image-crop-picker";
        new File(str).mkdir();
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void o(Activity activity, Promise promise, List list, Callable callable) {
        ArrayList arrayList = new ArrayList();
        ArrayList<String> arrayList2 = new ArrayList(list);
        if (Build.VERSION.SDK_INT > 28) {
            arrayList2.remove("android.permission.WRITE_EXTERNAL_STORAGE");
        }
        for (String str : arrayList2) {
            if (y0.b.a(activity, str) != 0) {
                arrayList.add(str);
            }
        }
        if (!arrayList.isEmpty()) {
            ((PermissionAwareActivity) activity).requestPermissions((String[]) arrayList.toArray(new String[arrayList.size()]), 1, new io.sentry.internal.debugmeta.c(promise, callable, 9, false));
            return;
        }
        try {
            callable.call();
        } catch (Exception e10) {
            promise.reject("E_CALLBACK_ERROR", "Unknown error", e10);
        }
    }

    public static void r(UCropActivity uCropActivity, int i7, int i10) {
        View viewFindViewById = uCropActivity.findViewById(i7);
        if (viewFindViewById == null) {
            return;
        }
        TextView textView = (TextView) viewFindViewById.findViewById(i10);
        if (textView != null && textView.getText() != null) {
            viewFindViewById.setContentDescription(textView.getText());
        }
        u0.p(viewFindViewById, new h(3));
    }

    public static void s(int i7, View view) {
        try {
            Field declaredField = view.getClass().getDeclaredField("mProgressLinePaint");
            declaredField.setAccessible(true);
            Paint paint = (Paint) declaredField.get(view);
            if (paint != null) {
                paint.setColor(i7);
                view.invalidate();
            }
        } catch (Exception e10) {
            Log.e("ImageCropPicker", "Error setting wheel tick color via reflection", e10);
        }
    }

    public static BitmapFactory.Options u(String str) throws Exception {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        options.inDither = true;
        BitmapFactory.decodeFile(str, options);
        if (options.outMimeType == null || options.outWidth == 0 || options.outHeight == 0) {
            throw new Exception("Invalid image selected");
        }
        return options;
    }

    public final File d() throws IOException {
        String str = "image-" + UUID.randomUUID().toString();
        File externalFilesDir = this.f11853e0.getExternalFilesDir(Environment.DIRECTORY_PICTURES);
        if (!externalFilesDir.exists() && !externalFilesDir.isDirectory()) {
            externalFilesDir.mkdirs();
        }
        File fileCreateTempFile = File.createTempFile(str, ".jpg", externalFilesDir);
        this.f11848b0 = "file:" + fileCreateTempFile.getAbsolutePath();
        return fileCreateTempFile;
    }

    public final File e() throws IOException {
        String str = "video-" + UUID.randomUUID().toString();
        File externalFilesDir = this.f11853e0.getExternalFilesDir(Environment.DIRECTORY_PICTURES);
        if (!externalFilesDir.exists() && !externalFilesDir.isDirectory()) {
            externalFilesDir.mkdirs();
        }
        File fileCreateTempFile = File.createTempFile(str, ".mp4", externalFilesDir);
        this.f11848b0 = "file:" + fileCreateTempFile.getAbsolutePath();
        return fileCreateTempFile;
    }

    public final void g(Activity activity, Uri uri) throws Exception {
        f fVar = this.f11849c0;
        String strP = p(activity, uri, false);
        if (strP == null || strP.isEmpty()) {
            fVar.c("E_NO_IMAGE_DATA_FOUND", "Cannot resolve asset path.");
            return;
        }
        String strK = k(strP);
        if (strK == null || !strK.startsWith("video/")) {
            fVar.d(j(strP));
        } else {
            n(activity, strP, strK);
        }
    }

    public final WritableNativeMap j(String str) throws Exception {
        File fileJ;
        String strEncodeToString;
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (str.startsWith("http://") || str.startsWith("https://")) {
            throw new Exception("Cannot select remote files");
        }
        BitmapFactory.Options optionsU = u(str);
        int iC = new n2.h(str).c();
        boolean z5 = iC == 6 || iC == 8 || iC == 5 || iC == 7;
        q8.c cVar = this.f11851d0;
        ReactApplicationContext reactApplicationContext = this.f11853e0;
        ReadableMap readableMap = this.M;
        cVar.getClass();
        Integer numValueOf = readableMap.hasKey("compressImageMaxWidth") ? Integer.valueOf(readableMap.getInt("compressImageMaxWidth")) : null;
        Integer numValueOf2 = readableMap.hasKey("compressImageMaxHeight") ? Integer.valueOf(readableMap.getInt("compressImageMaxHeight")) : null;
        Double dValueOf = readableMap.hasKey("compressImageQuality") ? Double.valueOf(readableMap.getDouble("compressImageQuality")) : null;
        boolean z6 = dValueOf == null || dValueOf.doubleValue() == 1.0d;
        boolean z7 = numValueOf == null || numValueOf.intValue() >= optionsU.outWidth;
        boolean z10 = numValueOf2 == null || numValueOf2.intValue() >= optionsU.outHeight;
        List listAsList = Arrays.asList(ClipboardModule.MIMETYPE_JPEG, ClipboardModule.MIMETYPE_JPG, ClipboardModule.MIMETYPE_PNG, "image/gif", "image/tiff");
        String str2 = optionsU.outMimeType;
        boolean z11 = str2 != null && listAsList.contains(str2.toLowerCase());
        if (z6 && z7 && z10 && z11) {
            Log.d("image-crop-picker", "Skipping image compression");
            fileJ = new File(str);
        } else {
            Log.d("image-crop-picker", "Image compression activated");
            int iDoubleValue = dValueOf != null ? (int) (dValueOf.doubleValue() * 100.0d) : 100;
            kk.b.q(iDoubleValue, "Compressing image with quality ", "image-crop-picker");
            if (numValueOf == null) {
                numValueOf = Integer.valueOf(optionsU.outWidth);
            }
            if (numValueOf2 == null) {
                numValueOf2 = Integer.valueOf(optionsU.outHeight);
            }
            fileJ = q8.c.j(reactApplicationContext, str, optionsU.outWidth, optionsU.outHeight, numValueOf.intValue(), numValueOf2.intValue(), iDoubleValue, optionsU.outMimeType);
        }
        String path = fileJ.getPath();
        BitmapFactory.Options optionsU2 = u(path);
        long jLastModified = new File(str).lastModified();
        writableNativeMap.putString("path", "file://" + path);
        writableNativeMap.putInt("width", z5 ? optionsU2.outHeight : optionsU2.outWidth);
        writableNativeMap.putInt("height", z5 ? optionsU2.outWidth : optionsU2.outHeight);
        writableNativeMap.putString("mime", optionsU2.outMimeType);
        writableNativeMap.putInt("size", (int) new File(path).length());
        writableNativeMap.putString("modificationDate", String.valueOf(jLastModified));
        writableNativeMap.putString("filename", new File(str).getName());
        if (this.f11854i) {
            try {
                FileInputStream fileInputStream = new FileInputStream(path);
                byte[] bArr = new byte[8192];
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                while (true) {
                    try {
                        int i7 = fileInputStream.read(bArr);
                        if (i7 == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, i7);
                    } catch (IOException e10) {
                        e10.printStackTrace();
                    }
                }
                strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            } catch (FileNotFoundException e11) {
                e11.printStackTrace();
                strEncodeToString = null;
            }
            writableNativeMap.putString("data", strEncodeToString);
        }
        if (this.f11855v) {
            try {
                writableNativeMap.putMap("exif", android.support.v4.media.session.b.g(str));
            } catch (Exception e12) {
                e12.printStackTrace();
            }
        }
        return writableNativeMap;
    }

    public final String k(String str) {
        Uri uriFromFile = Uri.parse(str);
        if ("content".equalsIgnoreCase(uriFromFile.getScheme())) {
            return this.f11853e0.getContentResolver().getType(uriFromFile);
        }
        if (!"file".equalsIgnoreCase(uriFromFile.getScheme())) {
            uriFromFile = Uri.fromFile(new File(str));
        }
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(uriFromFile.toString());
        if (fileExtensionFromUrl != null) {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl.toLowerCase());
        }
        return null;
    }

    public final WritableNativeMap l(Activity activity, Uri uri, boolean z5) throws Exception {
        String strP = p(activity, uri, z5);
        if (strP == null || strP.isEmpty()) {
            throw new Exception("Cannot resolve asset path.");
        }
        String strK = k(strP);
        if (strK == null || !strK.startsWith("video/")) {
            return j(strP);
        }
        n(activity, strP, strK);
        return null;
    }

    public final void n(Activity activity, String str, String str2) throws Exception {
        v(Uri.parse(str));
        new Thread(new ac.a(this, activity, str, m(activity) + "/" + UUID.randomUUID().toString() + ".mp4", str2)).start();
    }

    /* JADX WARN: Code duplicated, block: B:71:0x0144  */
    @Override // com.facebook.react.bridge.ActivityEventListener
    public final void onActivityResult(Activity activity, int i7, int i10, Intent intent) {
        int i11;
        int i12;
        int iRound;
        File fileJ;
        ClipData clipData;
        f fVar = this.f11849c0;
        Log.d("RESULT", "onActivityResult");
        if (i7 == 61110) {
            if (i10 == 0) {
                fVar.c("E_PICKER_CANCELLED", "User cancelled image selection");
                return;
            }
            if (i10 == -1) {
                if (this.f11852e) {
                    ClipData clipData2 = intent.getClipData();
                    try {
                        if (clipData2 == null) {
                            fVar.e(1);
                            g(activity, intent.getData());
                            return;
                        } else {
                            fVar.e(clipData2.getItemCount());
                            for (int i13 = 0; i13 < clipData2.getItemCount(); i13++) {
                                g(activity, clipData2.getItemAt(i13).getUri());
                            }
                            return;
                        }
                    } catch (Exception e10) {
                        fVar.c("E_NO_IMAGE_DATA_FOUND", e10.getMessage());
                        return;
                    }
                }
                Uri data = intent.getData();
                if (data == null && (clipData = intent.getClipData()) != null && clipData.getItemCount() > 0) {
                    data = clipData.getItemAt(0).getUri();
                }
                if (data == null) {
                    fVar.c("E_NO_IMAGE_DATA_FOUND", "Cannot resolve image url");
                    return;
                }
                if (this.f11856w) {
                    t(activity, data, k(data.toString()));
                    return;
                }
                try {
                    g(activity, data);
                    return;
                } catch (Exception e11) {
                    fVar.c("E_NO_IMAGE_DATA_FOUND", e11.getMessage());
                    return;
                }
            }
            return;
        }
        if (i7 == 61111) {
            if (i10 == 0) {
                fVar.c("E_PICKER_CANCELLED", "User cancelled image selection");
                return;
            }
            if (i10 == -1) {
                Uri uri = this.a0;
                if (uri == null) {
                    fVar.c("E_NO_IMAGE_DATA_FOUND", "Cannot resolve image url");
                    return;
                }
                if (this.f11856w) {
                    new Bundle().putString("com.yalantis.ucrop.CompressionFormatName", Bitmap.CompressFormat.JPEG.name());
                    t(activity, uri, k(uri.toString()));
                    return;
                }
                try {
                    fVar.e(1);
                    WritableNativeMap writableNativeMapL = l(activity, uri, true);
                    if (writableNativeMapL != null) {
                        fVar.d(writableNativeMapL);
                        return;
                    }
                    return;
                } catch (Exception e12) {
                    fVar.c("E_NO_IMAGE_DATA_FOUND", e12.getMessage());
                    return;
                }
            }
            return;
        }
        if (i7 == 69) {
            if (intent == null) {
                fVar.c("E_PICKER_CANCELLED", "User cancelled image selection");
                return;
            }
            Uri uriFromFile = (Uri) intent.getParcelableExtra("com.yalantis.ucrop.OutputUri");
            if (uriFromFile == null) {
                fVar.c("E_NO_IMAGE_DATA_FOUND", "Cannot find image data");
                return;
            }
            try {
                int i14 = this.X;
                if (i14 > 0 && (i11 = this.Y) > 0) {
                    if (this.f11858y) {
                        int intExtra = intent.getIntExtra("com.yalantis.ucrop.ImageWidth", 0);
                        int intExtra2 = intent.getIntExtra("com.yalantis.ucrop.ImageHeight", 0);
                        if (intExtra <= 0 || intExtra2 <= 0) {
                            i12 = i14;
                            iRound = i11;
                        } else {
                            float f2 = intExtra;
                            float f7 = intExtra2;
                            float fMin = Math.min(this.X / f2, this.Y / f7);
                            int iRound2 = Math.round(f2 * fMin);
                            iRound = Math.round(f7 * fMin);
                            i12 = iRound2;
                        }
                    } else {
                        i12 = i14;
                        iRound = i11;
                    }
                    try {
                        q8.c cVar = this.f11851d0;
                        ReactApplicationContext reactApplicationContext = this.f11853e0;
                        String path = uriFromFile.getPath();
                        String strK = k(uriFromFile.toString());
                        cVar.getClass();
                        fileJ = q8.c.j(reactApplicationContext, path, i12, iRound, i12, iRound, 100, strK);
                    } catch (OutOfMemoryError e13) {
                        fVar.c("E_LOW_MEMORY_ERROR", e13.getMessage());
                        fileJ = null;
                    }
                    uriFromFile = Uri.fromFile(fileJ);
                }
                WritableNativeMap writableNativeMapL2 = l(activity, uriFromFile, false);
                if (writableNativeMapL2 == null) {
                    throw new Exception("Cannot crop video files");
                }
                writableNativeMapL2.putMap("cropRect", h(intent));
                fVar.e(1);
                fVar.d(writableNativeMapL2);
            } catch (Exception e14) {
                fVar.c("E_NO_IMAGE_DATA_FOUND", e14.getMessage());
            }
        }
    }

    public final String p(Activity activity, Uri uri, boolean z5) throws FileNotFoundException {
        String path = z5 ? Uri.parse(this.f11848b0).getPath() : com.facebook.imagepipeline.nativecode.b.q(activity, uri);
        if (Build.VERSION.SDK_INT >= 29) {
            String type = activity.getContentResolver().getType(uri);
            if (type != null && type.startsWith("video/")) {
                return com.facebook.imagepipeline.nativecode.b.q(activity, uri);
            }
            String path2 = Uri.fromFile(activity.getExternalCacheDir()).getPath();
            String path3 = Uri.fromFile(activity.getExternalFilesDir(null)).getPath();
            String path4 = Uri.fromFile(activity.getCacheDir()).getPath();
            String path5 = Uri.fromFile(activity.getFilesDir()).getPath();
            if (!path.startsWith(path2) && !path.startsWith(path3) && !path.startsWith(path4) && !path.startsWith(path5)) {
                InputStream inputStreamOpenInputStream = activity.getContentResolver().openInputStream(uri);
                String strI = i(activity, uri);
                File file = new File(activity.getExternalCacheDir(), "/temp/" + System.currentTimeMillis() + "." + strI);
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    byte[] bArr = new byte[inputStreamOpenInputStream.available()];
                    inputStreamOpenInputStream.read(bArr);
                    fileOutputStream.write(bArr);
                    inputStreamOpenInputStream.close();
                    fileOutputStream.close();
                } catch (IOException e10) {
                    Log.w("image-crop-picker", "Error writing " + file, e10);
                }
                return com.facebook.imagepipeline.nativecode.b.q(activity, Uri.fromFile(file));
            }
        }
        return path;
    }

    public final void q(ReadableMap readableMap) {
        this.f11850d = readableMap.hasKey("mediaType") ? readableMap.getString("mediaType") : "any";
        this.f11852e = readableMap.hasKey("multiple") && readableMap.getBoolean("multiple");
        this.f11854i = readableMap.hasKey("includeBase64") && readableMap.getBoolean("includeBase64");
        this.f11855v = readableMap.hasKey("includeExif") && readableMap.getBoolean("includeExif");
        this.X = readableMap.hasKey("width") ? readableMap.getInt("width") : 0;
        this.Y = readableMap.hasKey("height") ? readableMap.getInt("height") : 0;
        this.Z = readableMap.hasKey("maxFiles") ? readableMap.getInt("maxFiles") : this.Z;
        this.f11856w = readableMap.hasKey("cropping") && readableMap.getBoolean("cropping");
        this.N = readableMap.hasKey("cropperActiveWidgetColor") ? readableMap.getString("cropperActiveWidgetColor") : null;
        this.O = readableMap.hasKey("cropperInactiveWidgetColor") ? readableMap.getString("cropperInactiveWidgetColor") : null;
        this.P = readableMap.hasKey("cropperToolbarColor") ? readableMap.getString("cropperToolbarColor") : null;
        this.Q = readableMap.hasKey("cropperToolbarTitle") ? readableMap.getString("cropperToolbarTitle") : null;
        this.R = readableMap.hasKey("cropperToolbarWidgetColor") ? readableMap.getString("cropperToolbarWidgetColor") : null;
        this.S = readableMap.hasKey("cropperControlsColor") ? readableMap.getString("cropperControlsColor") : null;
        this.T = readableMap.hasKey("cropperControlsBarColor") ? readableMap.getString("cropperControlsBarColor") : null;
        this.f11857x = readableMap.hasKey("cropperCircleOverlay") && readableMap.getBoolean("cropperCircleOverlay");
        this.f11858y = readableMap.hasKey("freeStyleCropEnabled") && readableMap.getBoolean("freeStyleCropEnabled");
        this.E = !readableMap.hasKey("showCropGuidelines") || readableMap.getBoolean("showCropGuidelines");
        this.F = !readableMap.hasKey("showCropFrame") || readableMap.getBoolean("showCropFrame");
        this.G = readableMap.hasKey("hideBottomControls") && readableMap.getBoolean("hideBottomControls");
        this.H = readableMap.hasKey("enableRotationGesture") && readableMap.getBoolean("enableRotationGesture");
        this.I = readableMap.hasKey("disableCropperColorSetters") && readableMap.getBoolean("disableCropperColorSetters");
        this.J = readableMap.hasKey("useFrontCamera") && readableMap.getBoolean("useFrontCamera");
        this.K = readableMap.hasKey("cropperStatusBarLight") ? readableMap.getBoolean("cropperStatusBarLight") : true;
        this.L = readableMap.hasKey("cropperNavigationBarLight") ? readableMap.getBoolean("cropperNavigationBarLight") : false;
        this.U = readableMap.hasKey("cropperCancelText") ? readableMap.getString("cropperCancelText") : "Cancel";
        this.V = readableMap.hasKey("cropperRotateByAngleAccessibilityLabel") ? readableMap.getString("cropperRotateByAngleAccessibilityLabel") : null;
        this.W = readableMap.hasKey("cropperResetRotationAccessibilityLabel") ? readableMap.getString("cropperResetRotationAccessibilityLabel") : null;
        this.M = readableMap;
    }

    public final void t(Activity activity, Uri uri, String str) {
        e eVar;
        int i7;
        Bitmap.CompressFormat compressFormat = str.equals(ClipboardModule.MIMETYPE_PNG) ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
        Bundle bundle = new Bundle();
        bundle.putString("com.yalantis.ucrop.CompressionFormatName", compressFormat.name());
        bundle.putInt("com.yalantis.ucrop.CompressionQuality", 100);
        bundle.putBoolean("com.yalantis.ucrop.CircleDimmedLayer", this.f11857x);
        bundle.putBoolean("com.yalantis.ucrop.FreeStyleCrop", this.f11858y);
        bundle.putBoolean("com.yalantis.ucrop.ShowCropGrid", this.E);
        bundle.putBoolean("com.yalantis.ucrop.ShowCropFrame", this.F);
        bundle.putBoolean("com.yalantis.ucrop.HideBottomControls", this.G);
        String str2 = this.Q;
        if (str2 != null) {
            bundle.putString("com.yalantis.ucrop.UcropToolbarTitleText", str2);
        }
        if (this.H) {
            bundle.putIntArray("com.yalantis.ucrop.AllowedGestures", new int[]{3, 3, 3});
        }
        if (!this.I) {
            String str3 = this.N;
            if (str3 != null) {
                bundle.putInt("com.yalantis.ucrop.UcropColorControlsWidgetActive", Color.parseColor(str3));
            }
            String str4 = this.P;
            if (str4 != null) {
                bundle.putInt("com.yalantis.ucrop.ToolbarColor", Color.parseColor(str4));
            }
            String str5 = this.R;
            if (str5 != null) {
                bundle.putInt("com.yalantis.ucrop.UcropToolbarWidgetColor", Color.parseColor(str5));
            }
            bundle.putBoolean("com.yalantis.ucrop.StatusBarLight", this.K);
            bundle.putBoolean("com.yalantis.ucrop.NavigationBarLight", this.L);
        }
        String str6 = compressFormat == Bitmap.CompressFormat.PNG ? ".png" : ".jpg";
        Uri uriFromFile = Uri.fromFile(new File(m(activity), UUID.randomUUID().toString() + str6));
        Intent intent = new Intent();
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("com.yalantis.ucrop.InputUri", uri);
        bundle2.putParcelable("com.yalantis.ucrop.OutputUri", uriFromFile);
        bundle2.putAll(bundle);
        int i10 = this.X;
        if (i10 > 0 && (i7 = this.Y) > 0) {
            bundle2.putFloat("com.yalantis.ucrop.AspectRatioX", i10);
            bundle2.putFloat("com.yalantis.ucrop.AspectRatioY", i7);
        }
        if (f11846f0 != null) {
            activity.getApplication().unregisterActivityLifecycleCallbacks(f11846f0);
            f11846f0 = null;
        }
        String str7 = this.S;
        if (str7 == null && this.T == null && this.N == null && this.O == null) {
            eVar = this;
        } else {
            eVar = this;
            f11846f0 = new a(eVar, str7, this.T, this.N, this.O);
            activity.getApplication().registerActivityLifecycleCallbacks(f11846f0);
        }
        if (f11847g0 != null) {
            activity.getApplication().unregisterActivityLifecycleCallbacks(f11847g0);
            f11847g0 = null;
        }
        f11847g0 = new b(this, eVar.U, eVar.V, eVar.W);
        activity.getApplication().registerActivityLifecycleCallbacks(f11847g0);
        intent.setClass(activity, UCropActivity.class);
        intent.putExtras(bundle2);
        activity.startActivityForResult(intent, 69);
    }

    public final Bitmap v(Uri uri) throws Exception {
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(this.f11853e0.getCurrentActivity(), uri);
        Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime();
        if (frameAtTime == null) {
            throw new Exception("Cannot retrieve video data");
        }
        mediaMetadataRetriever.release();
        return frameAtTime;
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public final void onNewIntent(Intent intent) {
    }
}
