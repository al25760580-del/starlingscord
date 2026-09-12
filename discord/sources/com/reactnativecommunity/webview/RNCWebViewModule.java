package com.reactnativecommunity.webview;

import android.app.Activity;
import android.app.DownloadManager;
import android.content.ComponentCallbacks2;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Parcelable;
import android.util.Log;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.MimeTypeMap;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.core.PermissionAwareActivity;
import com.facebook.react.modules.core.PermissionListener;
import com.facebook.react.uimanager.ThemedReactContext;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicReference;
import org.webrtc.MediaStreamTrack;

/* JADX INFO: loaded from: classes3.dex */
@ReactModule(name = RNCWebViewModule.MODULE_NAME)
public class RNCWebViewModule extends ReactContextBaseJavaModule implements ActivityEventListener {
    private static final int FILE_DOWNLOAD_PERMISSION_REQUEST = 1;
    public static final String MODULE_NAME = "RNCWebView";
    private static final int PICKER = 1;
    private static final int PICKER_LEGACY = 3;
    private static final String TAG = "RNCWebViewModule";
    protected static final o shouldOverrideUrlLoadingLock = new o();
    private DownloadManager.Request downloadRequest;
    private ValueCallback<Uri[]> filePathCallback;
    private ValueCallback<Uri> filePathCallbackLegacy;
    private File outputImage;
    private File outputVideo;

    public RNCWebViewModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        reactApplicationContext.addActivityEventListener(this);
    }

    private Boolean acceptsImages(String str) {
        if (str.matches("\\.\\w+")) {
            str = getMimeTypeFromExtension(str.replace(".", ""));
        }
        return Boolean.valueOf(str.isEmpty() || str.toLowerCase().contains("image"));
    }

    private Boolean acceptsVideo(String str) {
        if (str.matches("\\.\\w+")) {
            str = getMimeTypeFromExtension(str.replace(".", ""));
        }
        return Boolean.valueOf(str.isEmpty() || str.toLowerCase().contains(MediaStreamTrack.VIDEO_TRACK_KIND));
    }

    private Boolean arrayContainsString(String[] strArr, String str) {
        for (String str2 : strArr) {
            if (str2.contains(str)) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    private String[] getAcceptedMimeType(String[] strArr) {
        if (noAcceptTypesSet(strArr).booleanValue()) {
            return new String[]{"*/*"};
        }
        String[] strArr2 = new String[strArr.length];
        for (int i7 = 0; i7 < strArr.length; i7++) {
            String str = strArr[i7];
            if (str.matches("\\.\\w+")) {
                String mimeTypeFromExtension = getMimeTypeFromExtension(str.replace(".", ""));
                if (mimeTypeFromExtension != null) {
                    strArr2[i7] = mimeTypeFromExtension;
                } else {
                    strArr2[i7] = str;
                }
            } else {
                strArr2[i7] = str;
            }
        }
        return strArr2;
    }

    private File getCapturedFile(m mVar) {
        String str;
        String str2;
        int iOrdinal = mVar.ordinal();
        if (iOrdinal == 1) {
            String str3 = Environment.DIRECTORY_PICTURES;
            str = "image-";
            str2 = ".jpg";
        } else if (iOrdinal != 2) {
            str = "";
            str2 = "";
        } else {
            String str4 = Environment.DIRECTORY_MOVIES;
            str = "video-";
            str2 = ".mp4";
        }
        StringBuilder sbN = kk.b.n(str);
        sbN.append(String.valueOf(System.currentTimeMillis()));
        sbN.append(str2);
        return File.createTempFile(str, str2, getReactApplicationContext().getExternalFilesDir(null));
    }

    private Intent getFileChooserIntent(String str) {
        String mimeTypeFromExtension = str.isEmpty() ? "*/*" : str;
        if (str.matches("\\.\\w+")) {
            mimeTypeFromExtension = getMimeTypeFromExtension(str.replace(".", ""));
        }
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType(mimeTypeFromExtension);
        return intent;
    }

    private String getMimeTypeFromExtension(String str) {
        if (str != null) {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(str);
        }
        return null;
    }

    private Uri getOutputUri(File file) {
        String packageName = getReactApplicationContext().getPackageName();
        return FileProvider.getUriForFile(getReactApplicationContext(), packageName + ".fileprovider", file);
    }

    private PermissionAwareActivity getPermissionAwareActivity() {
        ComponentCallbacks2 currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            throw new IllegalStateException("Tried to use permissions API while not attached to an Activity.");
        }
        if (currentActivity instanceof PermissionAwareActivity) {
            return (PermissionAwareActivity) currentActivity;
        }
        throw new IllegalStateException("Tried to use permissions API but the host Activity doesn't implement PermissionAwareActivity.");
    }

    private Intent getPhotoIntent() {
        Intent intent;
        Throwable e10;
        try {
            File capturedFile = getCapturedFile(m.f7061d);
            this.outputImage = capturedFile;
            Uri outputUri = getOutputUri(capturedFile);
            intent = new Intent("android.media.action.IMAGE_CAPTURE");
            try {
                intent.putExtra("output", outputUri);
                return intent;
            } catch (IOException e11) {
                e10 = e11;
                Log.e("CREATE FILE", "Error occurred while creating the File", e10);
                e10.printStackTrace();
                return intent;
            } catch (IllegalArgumentException e12) {
                e10 = e12;
                Log.e("CREATE FILE", "Error occurred while creating the File", e10);
                e10.printStackTrace();
                return intent;
            }
        } catch (IOException | IllegalArgumentException e13) {
            intent = null;
            e10 = e13;
        }
    }

    private Uri[] getSelectedFiles(Intent intent, int i7) {
        if (intent == null) {
            return null;
        }
        if (intent.getClipData() == null) {
            if (intent.getData() == null || i7 != -1) {
                return null;
            }
            return WebChromeClient.FileChooserParams.parseResult(i7, intent);
        }
        int itemCount = intent.getClipData().getItemCount();
        Uri[] uriArr = new Uri[itemCount];
        for (int i10 = 0; i10 < itemCount; i10++) {
            uriArr[i10] = intent.getClipData().getItemAt(i10).getUri();
        }
        return uriArr;
    }

    private Intent getVideoIntent() {
        Intent intent;
        Throwable e10;
        try {
            File capturedFile = getCapturedFile(m.f7062e);
            this.outputVideo = capturedFile;
            Uri outputUri = getOutputUri(capturedFile);
            intent = new Intent("android.media.action.VIDEO_CAPTURE");
            try {
                intent.putExtra("output", outputUri);
                return intent;
            } catch (IOException e11) {
                e10 = e11;
                Log.e("CREATE FILE", "Error occurred while creating the File", e10);
                e10.printStackTrace();
                return intent;
            } catch (IllegalArgumentException e12) {
                e10 = e12;
                Log.e("CREATE FILE", "Error occurred while creating the File", e10);
                e10.printStackTrace();
                return intent;
            }
        } catch (IOException | IllegalArgumentException e13) {
            intent = null;
            e10 = e13;
        }
    }

    private PermissionListener getWebviewFileDownloaderPermissionListener(String str, String str2) {
        return new e4.m(15, this, str2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$injectJavaScriptWithWebViewKey$1(String str, String str2, Promise promise) {
        j jVar = (j) l.f7059a.get(str);
        if (jVar != null) {
            jVar.evaluateJavascript(str2, null);
            promise.resolve(null);
        } else {
            promise.reject("err", "Failed to inject javascript with webViewKey: " + str + ". WebView is null.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$releaseWebView$0(String str) {
        LinkedHashMap linkedHashMap = l.f7059a;
        j jVar = (j) linkedHashMap.get(str);
        if (jVar == null) {
            o8.a.v(TAG, "Failed to release webview with webViewKey: " + str);
            return;
        }
        ViewParent parent = jVar.getParent();
        if (parent == null || !(parent instanceof c)) {
            ViewGroup viewGroup = (ViewGroup) jVar.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(jVar);
            }
        } else {
            c cVar = (c) parent;
            j jVar2 = cVar.f7033e;
            if (jVar2 == null) {
                throw new IllegalStateException("Webview is null");
            }
            cVar.endViewTransition(jVar2);
            cVar.removeView(cVar.f7033e);
            j jVar3 = cVar.f7033e;
            cVar.f7033e = null;
            if (jVar3 != jVar) {
                throw new IllegalStateException(a3.e.l("mismatched webview with key: ", str));
            }
        }
        if (jVar.f7049v != null) {
            ((ThemedReactContext) jVar.getContext()).removeLifecycleEventListener(jVar);
            jVar.setWebViewClient(null);
            jVar.destroy();
        }
        linkedHashMap.remove(str);
    }

    private Boolean noAcceptTypesSet(String[] strArr) {
        String str;
        boolean z5 = true;
        if (strArr.length != 0 && (strArr.length != 1 || (str = strArr[0]) == null || str.length() != 0)) {
            z5 = false;
        }
        return Boolean.valueOf(z5);
    }

    public void downloadFile(String str) {
        try {
            ((DownloadManager) getCurrentActivity().getBaseContext().getSystemService("download")).enqueue(this.downloadRequest);
            Toast.makeText(getCurrentActivity().getApplicationContext(), str, 1).show();
        } catch (IllegalArgumentException e10) {
            Log.w(TAG, "Unsupported URI, aborting download", e10);
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return MODULE_NAME;
    }

    public boolean grantFileDownloaderPermissions(String str, String str2) {
        if (Build.VERSION.SDK_INT > 28) {
            return true;
        }
        boolean z5 = y0.b.a(getCurrentActivity(), "android.permission.WRITE_EXTERNAL_STORAGE") == 0;
        if (!z5) {
            getPermissionAwareActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 1, getWebviewFileDownloaderPermissionListener(str, str2));
        }
        return z5;
    }

    @ReactMethod
    public void injectJavaScriptWithWebViewKey(String str, String str2, Promise promise) {
        UiThreadUtil.runOnUiThread(new ac.a(str, str2, promise, 14));
    }

    @ReactMethod
    public void isFileUploadSupported(Promise promise) {
        promise.resolve(Boolean.TRUE);
    }

    public boolean needsCameraPermission() {
        try {
            return Arrays.asList(getCurrentActivity().getPackageManager().getPackageInfo(getReactApplicationContext().getPackageName(), RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT).requestedPermissions).contains("android.permission.CAMERA") && y0.b.a(getCurrentActivity(), "android.permission.CAMERA") != 0;
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onActivityResult(Activity activity, int i7, int i10, Intent intent) {
        if (this.filePathCallback == null && this.filePathCallbackLegacy == null) {
            return;
        }
        File file = this.outputImage;
        boolean z5 = false;
        boolean z6 = file != null && file.length() > 0;
        File file2 = this.outputVideo;
        if (file2 != null && file2.length() > 0) {
            z5 = true;
        }
        if (i7 != 1) {
            if (i7 == 3) {
                if (i10 != -1) {
                    this.filePathCallbackLegacy.onReceiveValue(null);
                } else if (z6) {
                    this.filePathCallbackLegacy.onReceiveValue(getOutputUri(this.outputImage));
                } else if (z5) {
                    this.filePathCallbackLegacy.onReceiveValue(getOutputUri(this.outputVideo));
                } else {
                    this.filePathCallbackLegacy.onReceiveValue(intent.getData());
                }
            }
        } else if (i10 != -1) {
            ValueCallback<Uri[]> valueCallback = this.filePathCallback;
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
            }
        } else if (z6) {
            this.filePathCallback.onReceiveValue(new Uri[]{getOutputUri(this.outputImage)});
        } else if (z5) {
            this.filePathCallback.onReceiveValue(new Uri[]{getOutputUri(this.outputVideo)});
        } else {
            this.filePathCallback.onReceiveValue(getSelectedFiles(intent, i10));
        }
        File file3 = this.outputImage;
        if (file3 != null && !z6) {
            file3.delete();
        }
        File file4 = this.outputVideo;
        if (file4 != null && !z5) {
            file4.delete();
        }
        this.filePathCallback = null;
        this.filePathCallbackLegacy = null;
        this.outputImage = null;
        this.outputVideo = null;
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onNewIntent(Intent intent) {
    }

    @ReactMethod
    public void onShouldStartLoadWithRequestCallback(boolean z5, int i7) {
        AtomicReference atomicReference;
        o oVar = shouldOverrideUrlLoadingLock;
        Integer numValueOf = Integer.valueOf(i7);
        synchronized (oVar) {
            atomicReference = (AtomicReference) oVar.f7067a.get(numValueOf);
        }
        if (atomicReference != null) {
            synchronized (atomicReference) {
                try {
                    atomicReference.set(z5 ? n.f7065e : n.f7064d);
                    atomicReference.notify();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @ReactMethod
    public void releaseWebView(String str) {
        UiThreadUtil.runOnUiThread(new bb.a(str, 3));
    }

    public void setDownloadRequest(DownloadManager.Request request) {
        this.downloadRequest = request;
    }

    public void startPhotoPickerIntent(ValueCallback<Uri> valueCallback, String str) {
        Intent videoIntent;
        Intent photoIntent;
        this.filePathCallbackLegacy = valueCallback;
        Intent intentCreateChooser = Intent.createChooser(getFileChooserIntent(str), "");
        ArrayList arrayList = new ArrayList();
        if (acceptsImages(str).booleanValue() && (photoIntent = getPhotoIntent()) != null) {
            arrayList.add(photoIntent);
        }
        if (acceptsVideo(str).booleanValue() && (videoIntent = getVideoIntent()) != null) {
            arrayList.add(videoIntent);
        }
        intentCreateChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[0]));
        if (intentCreateChooser.resolveActivity(getCurrentActivity().getPackageManager()) != null) {
            getCurrentActivity().startActivityForResult(intentCreateChooser, 3);
        } else {
            Log.w(TAG, "there is no Activity to handle this Intent");
        }
    }

    private Boolean acceptsImages(String[] strArr) {
        String[] acceptedMimeType = getAcceptedMimeType(strArr);
        return Boolean.valueOf(arrayContainsString(acceptedMimeType, "*/*").booleanValue() || arrayContainsString(acceptedMimeType, "image").booleanValue());
    }

    private Boolean acceptsVideo(String[] strArr) {
        String[] acceptedMimeType = getAcceptedMimeType(strArr);
        return Boolean.valueOf(arrayContainsString(acceptedMimeType, "*/*").booleanValue() || arrayContainsString(acceptedMimeType, MediaStreamTrack.VIDEO_TRACK_KIND).booleanValue());
    }

    private Intent getFileChooserIntent(String[] strArr, boolean z5) {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("*/*");
        intent.putExtra("android.intent.extra.MIME_TYPES", getAcceptedMimeType(strArr));
        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", z5);
        return intent;
    }

    public boolean startPhotoPickerIntent(ValueCallback<Uri[]> valueCallback, String[] strArr, boolean z5) {
        Intent videoIntent;
        Intent photoIntent;
        this.filePathCallback = valueCallback;
        ArrayList arrayList = new ArrayList();
        if (!needsCameraPermission()) {
            if (acceptsImages(strArr).booleanValue() && (photoIntent = getPhotoIntent()) != null) {
                arrayList.add(photoIntent);
            }
            if (acceptsVideo(strArr).booleanValue() && (videoIntent = getVideoIntent()) != null) {
                arrayList.add(videoIntent);
            }
        }
        Intent fileChooserIntent = getFileChooserIntent(strArr, z5);
        Intent intent = new Intent("android.intent.action.CHOOSER");
        intent.putExtra("android.intent.extra.INTENT", fileChooserIntent);
        intent.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[0]));
        if (intent.resolveActivity(getCurrentActivity().getPackageManager()) != null) {
            getCurrentActivity().startActivityForResult(intent, 1);
        } else {
            Log.w(TAG, "there is no Activity to handle this Intent");
        }
        return true;
    }
}
