package fr.greweb.reactnativeviewshot;

import a3.e;
import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import androidx.annotation.NonNull;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.UIManagerModule;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import on.a;

/* JADX INFO: loaded from: classes3.dex */
public class RNViewShotModule extends ReactContextBaseJavaModule {
    public static final String RNVIEW_SHOT = "RNViewShot";
    private static final String TEMP_FILE_PREFIX = "ReactNative-snapshot-image";
    private final Executor executor;
    private final ReactApplicationContext reactContext;

    public RNViewShotModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.executor = Executors.newCachedThreadPool();
        this.reactContext = reactApplicationContext;
    }

    @NonNull
    private File createTempFile(@NonNull Context context, @NonNull String str, String str2) throws IOException {
        File externalCacheDir = context.getExternalCacheDir();
        File cacheDir = context.getCacheDir();
        if (externalCacheDir == null && cacheDir == null) {
            throw new IOException("No cache directory available");
        }
        if (externalCacheDir == null || (cacheDir != null && externalCacheDir.getFreeSpace() <= cacheDir.getFreeSpace())) {
            externalCacheDir = cacheDir;
        }
        String strL = e.l(".", str);
        return str2 != null ? File.createTempFile(str2, strL, externalCacheDir) : File.createTempFile(TEMP_FILE_PREFIX, strL, externalCacheDir);
    }

    @ReactMethod
    public void captureRef(int i7, ReadableMap readableMap, Promise promise) {
        int i10;
        int i11;
        getReactApplicationContext().getResources().getDisplayMetrics();
        String string = readableMap.getString("format");
        if ("jpg".equals(string)) {
            i10 = 0;
        } else if ("webm".equals(string)) {
            i10 = 2;
        } else {
            i10 = "raw".equals(string) ? -1 : 1;
        }
        double d6 = readableMap.getDouble("quality");
        Integer numValueOf = readableMap.hasKey("width") ? Integer.valueOf(readableMap.getInt("width")) : null;
        Integer numValueOf2 = readableMap.hasKey("height") ? Integer.valueOf(readableMap.getInt("height")) : null;
        String string2 = readableMap.getString("result");
        String string3 = readableMap.hasKey("fileName") ? readableMap.getString("fileName") : null;
        try {
            i11 = i7;
            try {
                ((UIManagerModule) this.reactContext.getNativeModule(UIManagerModule.class)).addUIBlock(new on.e(i11, string, i10, d6, numValueOf, numValueOf2, "tmpfile".equals(string2) ? createTempFile(getReactApplicationContext(), string, string3) : null, string2, Boolean.valueOf(readableMap.getBoolean("snapshotContentContainer")), getCurrentActivity(), readableMap.hasKey("handleGLSurfaceViewOnAndroid") && readableMap.getBoolean("handleGLSurfaceViewOnAndroid"), promise, this.executor));
            } catch (Throwable th2) {
                th = th2;
                Log.e(RNVIEW_SHOT, "Failed to snapshot view tag " + i11, th);
                promise.reject("E_UNABLE_TO_SNAPSHOT", "Failed to snapshot view tag " + i11);
            }
        } catch (Throwable th3) {
            th = th3;
            i11 = i7;
        }
    }

    @ReactMethod
    public void captureScreen(ReadableMap readableMap, Promise promise) {
        captureRef(-1, readableMap, promise);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        return Collections.EMPTY_MAP;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return RNVIEW_SHOT;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        super.onCatalystInstanceDestroy();
        new a(getReactApplicationContext()).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    @ReactMethod
    public void releaseCapture(String str) {
        String path = Uri.parse(str).getPath();
        if (path == null) {
            return;
        }
        File file = new File(path);
        if (file.exists()) {
            File parentFile = file.getParentFile();
            if (parentFile.equals(this.reactContext.getExternalCacheDir()) || parentFile.equals(this.reactContext.getCacheDir())) {
                file.delete();
            }
        }
    }
}
