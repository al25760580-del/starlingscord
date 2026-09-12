package com.rnfs;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.database.Cursor;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.util.Base64;
import android.util.SparseArray;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.core.RCTNativeAppEventEmitter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.net.URL;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import je.u;

/* JADX INFO: loaded from: classes3.dex */
@ReactModule(name = RNFSManager.MODULE_NAME)
public class RNFSManager extends ReactContextBaseJavaModule {
    static final String MODULE_NAME = "RNFSManager";
    private static final String RNFSCachesDirectoryPath = "RNFSCachesDirectoryPath";
    private static final String RNFSDocumentDirectory = "RNFSDocumentDirectory";
    private static final String RNFSDocumentDirectoryPath = "RNFSDocumentDirectoryPath";
    private static final String RNFSDownloadDirectoryPath = "RNFSDownloadDirectoryPath";
    private static final String RNFSExternalCachesDirectoryPath = "RNFSExternalCachesDirectoryPath";
    private static final String RNFSExternalDirectoryPath = "RNFSExternalDirectoryPath";
    private static final String RNFSExternalStorageDirectoryPath = "RNFSExternalStorageDirectoryPath";
    private static final String RNFSFileTypeDirectory = "RNFSFileTypeDirectory";
    private static final String RNFSFileTypeRegular = "RNFSFileTypeRegular";
    private static final String RNFSPicturesDirectoryPath = "RNFSPicturesDirectoryPath";
    private static final String RNFSTemporaryDirectoryPath = "RNFSTemporaryDirectoryPath";
    private SparseArray<c> downloaders;
    private ReactApplicationContext reactContext;
    private SparseArray<k> uploaders;

    public RNFSManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.downloaders = new SparseArray<>();
        this.uploaders = new SparseArray<>();
        this.reactContext = reactApplicationContext;
    }

    private void DeleteRecursive(File file) {
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                DeleteRecursive(file2);
            }
        }
        file.delete();
    }

    private void copyInputStream(InputStream inputStream, String str, String str2, Promise promise) throws Throwable {
        OutputStream outputStream = null;
        try {
            try {
                try {
                    OutputStream outputStream2 = getOutputStream(str2, false);
                    try {
                        byte[] bArr = new byte[10240];
                        while (true) {
                            int i7 = inputStream.read(bArr);
                            if (i7 == -1) {
                                break;
                            } else {
                                outputStream2.write(bArr, 0, i7);
                            }
                        }
                        promise.resolve(null);
                        try {
                            inputStream.close();
                        } catch (IOException unused) {
                        }
                        if (outputStream2 != null) {
                            outputStream2.close();
                        }
                    } catch (Exception e10) {
                        e = e10;
                        outputStream = outputStream2;
                        reject(promise, str, new Exception("Failed to copy '" + str + "' to " + str2 + " (" + e.getLocalizedMessage() + ")"));
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        if (outputStream == null) {
                        } else {
                            outputStream.close();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        outputStream = outputStream2;
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException unused3) {
                            }
                        }
                        if (outputStream == null) {
                            throw th;
                        }
                        try {
                            outputStream.close();
                            throw th;
                        } catch (IOException unused4) {
                            throw th;
                        }
                    }
                } catch (IOException unused5) {
                }
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private Uri getFileUri(String str, boolean z5) throws d {
        Uri uri = Uri.parse(str);
        if (uri.getScheme() != null) {
            return uri;
        }
        File file = new File(str);
        if (!z5 && file.isDirectory()) {
            throw new d("EISDIR", s0.g.e("EISDIR: illegal operation on a directory, read '", str, "'"));
        }
        return Uri.parse("file://" + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InputStream getInputStream(String str) throws d {
        try {
            InputStream inputStreamOpenInputStream = this.reactContext.getContentResolver().openInputStream(getFileUri(str, false));
            if (inputStreamOpenInputStream != null) {
                return inputStreamOpenInputStream;
            }
            throw new d("ENOENT", s0.g.e("ENOENT: could not open an input stream for '", str, "'"));
        } catch (FileNotFoundException e10) {
            throw new d("ENOENT", "ENOENT: " + e10.getMessage() + ", open '" + str + "'");
        }
    }

    private static byte[] getInputStreamBytes(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET];
        while (true) {
            try {
                int i7 = inputStream.read(bArr);
                if (i7 == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i7);
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (IOException unused) {
                }
                throw th2;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            byteArrayOutputStream.close();
        } catch (IOException unused2) {
        }
        return byteArray;
    }

    private String getOriginalFilepath(String str, boolean z5) throws d {
        Uri fileUri = getFileUri(str, z5);
        if (fileUri.getScheme().equals("content")) {
            try {
                Cursor cursorQuery = this.reactContext.getContentResolver().query(fileUri, null, null, null, null);
                if (cursorQuery.moveToFirst()) {
                    str = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                }
                cursorQuery.close();
            } catch (IllegalArgumentException unused) {
            }
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public OutputStream getOutputStream(String str, boolean z5) throws d {
        try {
            OutputStream outputStreamOpenOutputStream = this.reactContext.getContentResolver().openOutputStream(getFileUri(str, false), z5 ? "wa" : getWriteAccessByAPILevel());
            if (outputStreamOpenOutputStream != null) {
                return outputStreamOpenOutputStream;
            }
            throw new d("ENOENT", s0.g.e("ENOENT: could not open an output stream for '", str, "'"));
        } catch (FileNotFoundException e10) {
            throw new d("ENOENT", "ENOENT: " + e10.getMessage() + ", open '" + str + "'");
        }
    }

    private int getResIdentifier(String str) {
        boolean z5 = true;
        String strSubstring = str.substring(str.lastIndexOf(".") + 1);
        String strSubstring2 = str.substring(0, str.lastIndexOf("."));
        if (!strSubstring.equals("png") && !strSubstring.equals("jpg") && !strSubstring.equals("jpeg") && !strSubstring.equals("bmp") && !strSubstring.equals("gif") && !strSubstring.equals("webp") && !strSubstring.equals("psd") && !strSubstring.equals("svg") && !strSubstring.equals("tiff")) {
            z5 = false;
        }
        return getReactApplicationContext().getResources().getIdentifier(strSubstring2, z5 ? "drawable" : "raw", getReactApplicationContext().getPackageName());
    }

    private String getWriteAccessByAPILevel() {
        return Build.VERSION.SDK_INT <= 28 ? "w" : "rwt";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reject(Promise promise, String str, Exception exc) {
        if (exc instanceof FileNotFoundException) {
            rejectFileNotFound(promise, str);
        } else if (!(exc instanceof d)) {
            promise.reject((String) null, exc.getMessage());
        } else {
            d dVar = (d) exc;
            promise.reject(dVar.f7083d, dVar.getMessage());
        }
    }

    private void rejectFileIsDirectory(Promise promise) {
        promise.reject("EISDIR", "EISDIR: illegal operation on a directory, read");
    }

    private void rejectFileNotFound(Promise promise, String str) {
        promise.reject("ENOENT", "ENOENT: no such file or directory, open '" + str + "'");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendEvent(ReactContext reactContext, String str, WritableMap writableMap) {
        ((RCTNativeAppEventEmitter) reactContext.getJSModule(RCTNativeAppEventEmitter.class)).emit(str, writableMap);
    }

    @ReactMethod
    public void addListener(String str) {
    }

    @ReactMethod
    public void appendFile(String str, String str2, Promise promise) {
        try {
            byte[] bArrDecode = Base64.decode(str2, 0);
            OutputStream outputStream = getOutputStream(str, true);
            outputStream.write(bArrDecode);
            outputStream.close();
            promise.resolve(null);
        } catch (Exception e10) {
            e10.printStackTrace();
            reject(promise, str, e10);
        }
    }

    @ReactMethod
    public void copyFile(String str, String str2, ReadableMap readableMap, Promise promise) {
        new f(this, promise, str).execute(str, str2);
    }

    @ReactMethod
    public void copyFileAssets(String str, String str2, Promise promise) throws Throwable {
        try {
            copyInputStream(getReactApplicationContext().getAssets().open(str), str, str2, promise);
        } catch (IOException unused) {
            reject(promise, str, new Exception(s0.g.e("Asset '", str, "' could not be opened")));
        }
    }

    @ReactMethod
    public void copyFileRes(String str, String str2, Promise promise) throws Throwable {
        try {
            copyInputStream(getReactApplicationContext().getResources().openRawResource(getResIdentifier(str)), str, str2, promise);
        } catch (Exception unused) {
            reject(promise, str, new Exception(s0.g.e("Res '", str, "' could not be opened")));
        }
    }

    @ReactMethod
    public void downloadFile(ReadableMap readableMap, Promise promise) {
        try {
            File file = new File(readableMap.getString("toFile"));
            URL url = new URL(readableMap.getString("fromUrl"));
            int i7 = readableMap.getInt("jobId");
            ReadableMap map = readableMap.getMap("headers");
            int i10 = readableMap.getInt("progressInterval");
            int i11 = readableMap.getInt("progressDivider");
            int i12 = readableMap.getInt("readTimeout");
            int i13 = readableMap.getInt("connectionTimeout");
            boolean z5 = readableMap.getBoolean("hasBeginCallback");
            boolean z6 = readableMap.getBoolean("hasProgressCallback");
            a aVar = new a();
            aVar.f7068a = url;
            aVar.f7069b = file;
            aVar.f7070c = map;
            aVar.f7071d = i10;
            aVar.f7072e = i11;
            aVar.f7073f = i12;
            aVar.f7074g = i13;
            u uVar = new u();
            uVar.f13851d = this;
            uVar.f13848a = i7;
            uVar.f13849b = promise;
            uVar.f13850c = readableMap;
            aVar.f7075h = uVar;
            if (z5) {
                aVar.f7076i = new g(this, i7);
            }
            if (z6) {
                aVar.j = new g(this, i7);
            }
            c cVar = new c();
            cVar.f7081b = new AtomicBoolean(false);
            cVar.execute(aVar);
            this.downloaders.put(i7, cVar);
        } catch (Exception e10) {
            e10.printStackTrace();
            reject(promise, readableMap.getString("toFile"), e10);
        }
    }

    @ReactMethod
    public void exists(String str, Promise promise) {
        try {
            promise.resolve(Boolean.valueOf(new File(str).exists()));
        } catch (Exception e10) {
            e10.printStackTrace();
            reject(promise, str, e10);
        }
    }

    @ReactMethod
    public void existsAssets(String str, Promise promise) {
        try {
            AssetManager assets = getReactApplicationContext().getAssets();
            try {
                String[] list = assets.list(str);
                if (list != null && list.length > 0) {
                    promise.resolve(Boolean.TRUE);
                    return;
                }
            } catch (Exception unused) {
            }
            InputStream inputStreamOpen = null;
            try {
                try {
                    inputStreamOpen = assets.open(str);
                    promise.resolve(Boolean.TRUE);
                    if (inputStreamOpen == null) {
                        return;
                    }
                } catch (Exception unused2) {
                    promise.resolve(Boolean.FALSE);
                    if (inputStreamOpen == null) {
                        return;
                    }
                }
                try {
                    inputStreamOpen.close();
                } catch (Exception unused3) {
                }
            } catch (Throwable th2) {
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                    } catch (Exception unused4) {
                    }
                }
                throw th2;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            reject(promise, str, e10);
        }
    }

    @ReactMethod
    public void existsRes(String str, Promise promise) {
        try {
            if (getResIdentifier(str) > 0) {
                promise.resolve(Boolean.TRUE);
            } else {
                promise.resolve(Boolean.FALSE);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            reject(promise, str, e10);
        }
    }

    @ReactMethod
    public void getAllExternalFilesDirs(Promise promise) {
        File[] externalFilesDirs = getReactApplicationContext().getExternalFilesDirs(null);
        WritableArray writableArrayCreateArray = Arguments.createArray();
        for (File file : externalFilesDirs) {
            if (file != null) {
                writableArrayCreateArray.pushString(file.getAbsolutePath());
            }
        }
        promise.resolve(writableArrayCreateArray);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap map = new HashMap();
        map.put(RNFSDocumentDirectory, 0);
        map.put(RNFSDocumentDirectoryPath, getReactApplicationContext().getFilesDir().getAbsolutePath());
        map.put(RNFSTemporaryDirectoryPath, getReactApplicationContext().getCacheDir().getAbsolutePath());
        map.put(RNFSPicturesDirectoryPath, Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).getAbsolutePath());
        map.put(RNFSCachesDirectoryPath, getReactApplicationContext().getCacheDir().getAbsolutePath());
        map.put(RNFSDownloadDirectoryPath, Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath());
        map.put(RNFSFileTypeRegular, 0);
        map.put(RNFSFileTypeDirectory, 1);
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory != null) {
            map.put(RNFSExternalStorageDirectoryPath, externalStorageDirectory.getAbsolutePath());
        } else {
            map.put(RNFSExternalStorageDirectoryPath, null);
        }
        File externalFilesDir = getReactApplicationContext().getExternalFilesDir(null);
        if (externalFilesDir != null) {
            map.put(RNFSExternalDirectoryPath, externalFilesDir.getAbsolutePath());
        } else {
            map.put(RNFSExternalDirectoryPath, null);
        }
        File externalCacheDir = getReactApplicationContext().getExternalCacheDir();
        if (externalCacheDir != null) {
            map.put(RNFSExternalCachesDirectoryPath, externalCacheDir.getAbsolutePath());
            return map;
        }
        map.put(RNFSExternalCachesDirectoryPath, null);
        return map;
    }

    @ReactMethod
    public void getFSInfo(Promise promise) {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        StatFs statFs2 = new StatFs(Environment.getExternalStorageDirectory().getPath());
        long totalBytes = statFs.getTotalBytes();
        long freeBytes = statFs.getFreeBytes();
        long totalBytes2 = statFs2.getTotalBytes();
        long freeBytes2 = statFs2.getFreeBytes();
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("totalSpace", totalBytes);
        writableMapCreateMap.putDouble("freeSpace", freeBytes);
        writableMapCreateMap.putDouble("totalSpaceEx", totalBytes2);
        writableMapCreateMap.putDouble("freeSpaceEx", freeBytes2);
        promise.resolve(writableMapCreateMap);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return MODULE_NAME;
    }

    @ReactMethod
    public void hash(String str, String str2, Promise promise) {
        int i7;
        try {
            HashMap map = new HashMap();
            map.put("md5", "MD5");
            map.put("sha1", "SHA-1");
            map.put("sha224", "SHA-224");
            map.put("sha256", "SHA-256");
            map.put("sha384", "SHA-384");
            map.put("sha512", "SHA-512");
            if (!map.containsKey(str2)) {
                throw new Exception("Invalid hash algorithm");
            }
            File file = new File(str);
            if (file.isDirectory()) {
                rejectFileIsDirectory(promise);
                return;
            }
            if (!file.exists()) {
                rejectFileNotFound(promise, str);
                return;
            }
            MessageDigest messageDigest = MessageDigest.getInstance((String) map.get(str2));
            FileInputStream fileInputStream = new FileInputStream(str);
            byte[] bArr = new byte[10240];
            while (true) {
                int i10 = fileInputStream.read(bArr);
                if (i10 == -1) {
                    break;
                } else {
                    messageDigest.update(bArr, 0, i10);
                }
            }
            StringBuilder sb2 = new StringBuilder();
            for (byte b10 : messageDigest.digest()) {
                sb2.append(String.format("%02x", Byte.valueOf(b10)));
            }
            promise.resolve(sb2.toString());
        } catch (Exception e10) {
            e10.printStackTrace();
            reject(promise, str, e10);
        }
    }

    @ReactMethod
    public void mkdir(String str, ReadableMap readableMap, Promise promise) {
        try {
            File file = new File(str);
            file.mkdirs();
            if (!file.exists()) {
                throw new Exception("Directory could not be created");
            }
            promise.resolve(null);
        } catch (Exception e10) {
            e10.printStackTrace();
            reject(promise, str, e10);
        }
    }

    @ReactMethod
    public void moveFile(String str, String str2, ReadableMap readableMap, Promise promise) {
        try {
            File file = new File(str);
            if (file.renameTo(new File(str2))) {
                promise.resolve(Boolean.TRUE);
            } else {
                new e(this, file, promise, str).execute(str, str2);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            reject(promise, str, e10);
        }
    }

    @ReactMethod
    public void pathForBundle(String str, Promise promise) {
    }

    @ReactMethod
    public void pathForGroup(String str, Promise promise) {
    }

    @ReactMethod
    public void read(String str, int i7, int i10, Promise promise) {
        try {
            InputStream inputStream = getInputStream(str);
            byte[] bArr = new byte[i7];
            inputStream.skip(i10);
            promise.resolve(Base64.encodeToString(bArr, 0, inputStream.read(bArr, 0, i7), 2));
        } catch (Exception e10) {
            e10.printStackTrace();
            reject(promise, str, e10);
        }
    }

    @ReactMethod
    public void readDir(String str, Promise promise) {
        try {
            File file = new File(str);
            if (!file.exists()) {
                throw new Exception("Folder does not exist");
            }
            File[] fileArrListFiles = file.listFiles();
            WritableArray writableArrayCreateArray = Arguments.createArray();
            for (File file2 : fileArrListFiles) {
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putDouble("mtime", file2.lastModified() / 1000.0d);
                writableMapCreateMap.putString(StackTraceHelper.NAME_KEY, file2.getName());
                writableMapCreateMap.putString("path", file2.getAbsolutePath());
                writableMapCreateMap.putDouble("size", file2.length());
                writableMapCreateMap.putInt("type", file2.isDirectory() ? 1 : 0);
                writableArrayCreateArray.pushMap(writableMapCreateMap);
            }
            promise.resolve(writableArrayCreateArray);
        } catch (Exception e10) {
            e10.printStackTrace();
            reject(promise, str, e10);
        }
    }

    @ReactMethod
    public void readDirAssets(String str, Promise promise) {
        int length;
        try {
            AssetManager assets = getReactApplicationContext().getAssets();
            String[] list = assets.list(str);
            WritableArray writableArrayCreateArray = Arguments.createArray();
            for (String str2 : list) {
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putString(StackTraceHelper.NAME_KEY, str2);
                if (!str.isEmpty()) {
                    str2 = str + "/" + str2;
                }
                writableMapCreateMap.putString("path", str2);
                int i7 = 1;
                try {
                    AssetFileDescriptor assetFileDescriptorOpenFd = assets.openFd(str2);
                    if (assetFileDescriptorOpenFd != null) {
                        length = (int) assetFileDescriptorOpenFd.getLength();
                        try {
                            assetFileDescriptorOpenFd.close();
                            i7 = 0;
                        } catch (IOException e10) {
                            e = e10;
                            i7 = 1 ^ (e.getMessage().contains("compressed") ? 1 : 0);
                        }
                    } else {
                        length = 0;
                    }
                } catch (IOException e11) {
                    e = e11;
                    length = 0;
                }
                writableMapCreateMap.putInt("size", length);
                writableMapCreateMap.putInt("type", i7);
                writableArrayCreateArray.pushMap(writableMapCreateMap);
            }
            promise.resolve(writableArrayCreateArray);
        } catch (IOException e12) {
            reject(promise, str, e12);
        }
    }

    @ReactMethod
    public void readFile(String str, Promise promise) {
        try {
            promise.resolve(Base64.encodeToString(getInputStreamBytes(getInputStream(str)), 2));
        } catch (Exception e10) {
            e10.printStackTrace();
            reject(promise, str, e10);
        }
    }

    /* JADX INFO: Removed unreachable split cross block B:34:0x0044 */
    @ReactMethod
    public void readFileAssets(String str, Promise promise) {
        InputStream inputStreamOpen = null;
        try {
            try {
                try {
                    inputStreamOpen = getReactApplicationContext().getAssets().open(str, 0);
                    if (inputStreamOpen != null) {
                        byte[] bArr = new byte[inputStreamOpen.available()];
                        inputStreamOpen.read(bArr);
                        promise.resolve(Base64.encodeToString(bArr, 2));
                        inputStreamOpen.close();
                        return;
                    }
                    reject(promise, str, new Exception("Failed to open file"));
                    if (inputStreamOpen != null) {
                        try {
                            inputStreamOpen.close();
                        } catch (IOException unused) {
                        }
                    }
                } catch (Throwable th2) {
                    if (inputStreamOpen != null) {
                        try {
                            inputStreamOpen.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th2;
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                reject(promise, str, e10);
                if (0 != 0) {
                    inputStreamOpen.close();
                }
            }
        } catch (IOException unused3) {
        }
    }

    /* JADX INFO: Removed unreachable split cross block B:32:0x0047 */
    @ReactMethod
    public void readFileRes(String str, Promise promise) {
        InputStream inputStreamOpenRawResource = null;
        try {
            try {
                try {
                    inputStreamOpenRawResource = getReactApplicationContext().getResources().openRawResource(getResIdentifier(str));
                    if (inputStreamOpenRawResource != null) {
                        byte[] bArr = new byte[inputStreamOpenRawResource.available()];
                        inputStreamOpenRawResource.read(bArr);
                        promise.resolve(Base64.encodeToString(bArr, 2));
                        inputStreamOpenRawResource.close();
                        return;
                    }
                    reject(promise, str, new Exception("Failed to open file"));
                    if (inputStreamOpenRawResource != null) {
                        try {
                            inputStreamOpenRawResource.close();
                        } catch (IOException unused) {
                        }
                    }
                } catch (IOException unused2) {
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                reject(promise, str, e10);
                if (0 != 0) {
                    inputStreamOpenRawResource.close();
                }
            }
        } catch (Throwable th2) {
            if (inputStreamOpenRawResource != null) {
                try {
                    inputStreamOpenRawResource.close();
                } catch (IOException unused3) {
                }
            }
            throw th2;
        }
    }

    @ReactMethod
    public void removeListeners(Integer num) {
    }

    @ReactMethod
    public void scanFile(String str, Promise promise) {
        MediaScannerConnection.scanFile(getReactApplicationContext(), new String[]{str}, null, new h(promise));
    }

    @ReactMethod
    public void setReadable(String str, Boolean bool, Boolean bool2, Promise promise) {
        try {
            File file = new File(str);
            if (!file.exists()) {
                throw new Exception("File does not exist");
            }
            file.setReadable(bool.booleanValue(), bool2.booleanValue());
            promise.resolve(Boolean.TRUE);
        } catch (Exception e10) {
            e10.printStackTrace();
            reject(promise, str, e10);
        }
    }

    @ReactMethod
    public void stat(String str, Promise promise) {
        try {
            String originalFilepath = getOriginalFilepath(str, true);
            File file = new File(originalFilepath);
            if (!file.exists()) {
                throw new Exception("File does not exist");
            }
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putInt("ctime", (int) (file.lastModified() / 1000));
            writableMapCreateMap.putInt("mtime", (int) (file.lastModified() / 1000));
            writableMapCreateMap.putDouble("size", file.length());
            writableMapCreateMap.putInt("type", file.isDirectory() ? 1 : 0);
            writableMapCreateMap.putString("originalFilepath", originalFilepath);
            promise.resolve(writableMapCreateMap);
        } catch (Exception e10) {
            e10.printStackTrace();
            reject(promise, str, e10);
        }
    }

    @ReactMethod
    public void stopDownload(int i7) {
        c cVar = this.downloaders.get(i7);
        if (cVar != null) {
            cVar.f7081b.set(true);
        }
    }

    @ReactMethod
    public void stopUpload(int i7) {
        k kVar = this.uploaders.get(i7);
        if (kVar != null) {
            kVar.f7106c.set(true);
        }
    }

    @ReactMethod
    public void touch(String str, double d6, double d7, Promise promise) {
        try {
            promise.resolve(Boolean.valueOf(new File(str).setLastModified((long) d6)));
        } catch (Exception e10) {
            e10.printStackTrace();
            reject(promise, str, e10);
        }
    }

    @ReactMethod
    public void unlink(String str, Promise promise) {
        try {
            File file = new File(str);
            if (!file.exists()) {
                throw new Exception("File does not exist");
            }
            DeleteRecursive(file);
            promise.resolve(null);
        } catch (Exception e10) {
            e10.printStackTrace();
            reject(promise, str, e10);
        }
    }

    @ReactMethod
    public void uploadFiles(ReadableMap readableMap, Promise promise) {
        RNFSManager rNFSManager;
        try {
            ReadableArray array = readableMap.getArray("files");
            URL url = new URL(readableMap.getString("toUrl"));
            int i7 = readableMap.getInt("jobId");
            ReadableMap map = readableMap.getMap("headers");
            ReadableMap map2 = readableMap.getMap("fields");
            String string = readableMap.getString("method");
            boolean z5 = readableMap.getBoolean("binaryStreamOnly");
            boolean z6 = readableMap.getBoolean("hasBeginCallback");
            boolean z7 = readableMap.getBoolean("hasProgressCallback");
            ArrayList arrayList = new ArrayList();
            j jVar = new j();
            for (int i10 = 0; i10 < array.size(); i10++) {
                arrayList.add(array.getMap(i10));
            }
            jVar.f7095a = url;
            jVar.f7096b = arrayList;
            jVar.f7098d = map;
            jVar.f7100f = string;
            jVar.f7099e = map2;
            jVar.f7097c = z5;
            rNFSManager = this;
            try {
                jVar.f7101g = new we.k(i7, 2, rNFSManager, promise, readableMap);
                if (z6) {
                    jVar.f7103i = new g(rNFSManager, i7);
                }
                if (z7) {
                    jVar.f7102h = new g(rNFSManager, i7);
                }
                k kVar = new k();
                kVar.f7106c = new AtomicBoolean(false);
                kVar.execute(jVar);
                rNFSManager.uploaders.put(i7, kVar);
            } catch (Exception e10) {
                e = e10;
                e.printStackTrace();
                rNFSManager.reject(promise, readableMap.getString("toUrl"), e);
            }
        } catch (Exception e11) {
            e = e11;
            rNFSManager = this;
        }
    }

    @ReactMethod
    public void write(String str, String str2, int i7, Promise promise) {
        try {
            byte[] bArrDecode = Base64.decode(str2, 0);
            if (i7 < 0) {
                OutputStream outputStream = getOutputStream(str, true);
                outputStream.write(bArrDecode);
                outputStream.close();
            } else {
                RandomAccessFile randomAccessFile = new RandomAccessFile(str, "rw");
                randomAccessFile.seek(i7);
                randomAccessFile.write(bArrDecode);
                randomAccessFile.close();
            }
            promise.resolve(null);
        } catch (Exception e10) {
            e10.printStackTrace();
            reject(promise, str, e10);
        }
    }

    @ReactMethod
    public void writeFile(String str, String str2, ReadableMap readableMap, Promise promise) {
        try {
            byte[] bArrDecode = Base64.decode(str2, 0);
            OutputStream outputStream = getOutputStream(str, false);
            outputStream.write(bArrDecode);
            outputStream.close();
            promise.resolve(null);
        } catch (Exception e10) {
            e10.printStackTrace();
            reject(promise, str, e10);
        }
    }
}
