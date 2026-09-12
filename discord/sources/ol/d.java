package ol;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Build;
import android.os.FileUtils;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.runtime.p;
import com.facebook.react.util.RNLog;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.x;
import m3.m;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f17443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f17444b;

    public d(LinkedHashMap uriMap) {
        Intrinsics.checkNotNullParameter(uriMap, "uriMap");
        this.f17443a = uriMap;
        this.f17444b = new c(0);
    }

    public static long a(InputStream inputStream, OutputStream outputStream) {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        Intrinsics.checkNotNullParameter(outputStream, "outputStream");
        try {
            try {
                long jCopy = Build.VERSION.SDK_INT >= 29 ? FileUtils.copy(inputStream, outputStream) : m.k(inputStream, outputStream, 8192);
                ls.d.k(outputStream, null);
                ls.d.k(inputStream, null);
                return jCopy;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    ls.d.k(outputStream, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                ls.d.k(inputStream, th4);
                throw th5;
            }
        }
    }

    public static final WritableMap b(d dVar, ReadableMap readableMap, ReactContext reactContext, File file) throws IOException {
        String string = readableMap.getString("uri");
        if (string == null) {
            throw new IllegalArgumentException("URI is missing");
        }
        String string2 = readableMap.getString("fileName");
        if (string2 == null) {
            throw new IllegalArgumentException("fileName is missing");
        }
        String string3 = readableMap.getString("convertVirtualFileToType");
        Uri uri = (Uri) dVar.f17443a.get(string);
        if (uri == null) {
            RNLog.w(reactContext, "keepLocalCopy: You're trying to copy a file \"" + string2 + "\" that wasn't picked with this module. This can lead to permission errors because the file reference is transient to your activity's current lifecycle. See https://developer.android.com/guide/components/intents-common#GetFile . Please use the result from the picker directly.");
        }
        if (uri == null) {
            uri = Uri.parse(string);
        }
        Intrinsics.checkNotNull(uri);
        File file2 = new File(file, string2);
        String canonicalPath = file2.getCanonicalPath();
        Intrinsics.checkNotNull(canonicalPath);
        String canonicalPath2 = file.getCanonicalPath();
        Intrinsics.checkNotNullExpressionValue(canonicalPath2, "getCanonicalPath(...)");
        if (!x.o(canonicalPath, canonicalPath2, false)) {
            throw new IllegalArgumentException("The copied file is attempting to write outside of the target directory.");
        }
        p pVar = new p(9, dVar, file2);
        if (string3 == null) {
            pVar.invoke(reactContext.getContentResolver().openInputStream(uri));
        } else {
            ContentResolver contentResolver = reactContext.getContentResolver();
            Intrinsics.checkNotNullExpressionValue(contentResolver, "getContentResolver(...)");
            AssetFileDescriptor assetFileDescriptorOpenTypedAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(uri, string3, null);
            pVar.invoke(assetFileDescriptorOpenTypedAssetFileDescriptor != null ? assetFileDescriptorOpenTypedAssetFileDescriptor.createInputStream() : null);
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("status", "success");
        writableMapCreateMap.putString("localUri", Uri.fromFile(file2).toString());
        writableMapCreateMap.putString("sourceUri", string);
        return writableMapCreateMap;
    }

    public final b c(Uri uri, String str, ReactApplicationContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (uri == null) {
            throw new IllegalArgumentException("The source URI is null. Call saveDocument() before writeDocument()");
        }
        Uri uri2 = (Uri) this.f17443a.get(str);
        if (uri2 == null) {
            RNLog.e(context, "writeDocument: You're trying to write from Uri \"" + str + "\" that wasn't picked with this module. Please use the result from saveDocument()");
            throw new IllegalArgumentException("The provided URI is not known");
        }
        b bVar = new b(uri2);
        ContentResolver contentResolver = context.getContentResolver();
        bVar.f17436d = contentResolver.getType(uri2);
        InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
        if (inputStreamOpenInputStream == null) {
            bVar.f17437e = "No input stream found for source file";
            return bVar;
        }
        OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(uri2);
        if (outputStreamOpenOutputStream == null) {
            bVar.f17437e = "No output stream found for destination file";
            return bVar;
        }
        if (((Number) this.f17444b.invoke(inputStreamOpenInputStream, outputStreamOpenOutputStream)).longValue() == 0) {
            bVar.f17437e = "No data was copied to the destination file";
        }
        return bVar;
    }
}
