package com.imagepicker;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.annotation.NonNull;
import androidx.core.content.FileProvider;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.v0;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.module.annotations.ReactModule;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import org.webrtc.MediaStreamTrack;

/* JADX INFO: loaded from: classes3.dex */
@ReactModule(name = ImagePickerModule.NAME)
public class ImagePickerModule extends ReactContextBaseJavaModule implements ActivityEventListener, LifecycleEventListener {
    static final String NAME = "ImagePickerManager";
    public static final int REQUEST_LAUNCH_IMAGE_CAPTURE = 13001;
    public static final int REQUEST_LAUNCH_LIBRARY = 13003;
    public static final int REQUEST_LAUNCH_VIDEO_CAPTURE = 13002;
    Callback callback;
    Uri cameraCaptureURI;
    private ActivityResultLauncher cameraLauncher;
    private FragmentActivity currentFragmentActivity;
    private Uri fileUri;
    UUID identifier;
    private ActivityResultLauncher libraryLauncher;
    b options;
    final ReactApplicationContext reactContext;

    public ImagePickerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
        reactApplicationContext.addActivityEventListener(this);
        reactApplicationContext.addLifecycleEventListener(this);
    }

    private void initializeLaunchers(final FragmentActivity fragmentActivity) {
        if (fragmentActivity == null) {
            return;
        }
        if (this.currentFragmentActivity != fragmentActivity || this.cameraLauncher == null) {
            try {
                this.currentFragmentActivity = fragmentActivity;
                final int i7 = 0;
                this.cameraLauncher = fragmentActivity.registerForActivityResult(new v0(3), new ActivityResultCallback(this) { // from class: com.imagepicker.a

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ ImagePickerModule f6856e;

                    {
                        this.f6856e = this;
                    }

                    @Override // androidx.activity.result.ActivityResultCallback
                    public final void d(Object obj) {
                        switch (i7) {
                            case 0:
                                this.f6856e.lambda$initializeLaunchers$0(fragmentActivity, (f.a) obj);
                                break;
                            default:
                                this.f6856e.lambda$initializeLaunchers$1(fragmentActivity, (f.a) obj);
                                break;
                        }
                    }
                });
                final int i10 = 1;
                this.libraryLauncher = fragmentActivity.registerForActivityResult(new v0(3), new ActivityResultCallback(this) { // from class: com.imagepicker.a

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ ImagePickerModule f6856e;

                    {
                        this.f6856e = this;
                    }

                    @Override // androidx.activity.result.ActivityResultCallback
                    public final void d(Object obj) {
                        switch (i10) {
                            case 0:
                                this.f6856e.lambda$initializeLaunchers$0(fragmentActivity, (f.a) obj);
                                break;
                            default:
                                this.f6856e.lambda$initializeLaunchers$1(fragmentActivity, (f.a) obj);
                                break;
                        }
                    }
                });
            } catch (IllegalStateException unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$initializeLaunchers$0(FragmentActivity fragmentActivity, f.a aVar) {
        b bVar = this.options;
        onActivityResult(fragmentActivity, (bVar == null || !bVar.f6867l.equals(MediaStreamTrack.VIDEO_TRACK_KIND)) ? REQUEST_LAUNCH_IMAGE_CAPTURE : REQUEST_LAUNCH_VIDEO_CAPTURE, aVar.f8759d, aVar.f8760e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$initializeLaunchers$1(FragmentActivity fragmentActivity, f.a aVar) {
        onActivityResult(fragmentActivity, REQUEST_LAUNCH_LIBRARY, aVar.f8759d, aVar.f8760e);
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        super.invalidate();
        ActivityResultLauncher activityResultLauncher = this.cameraLauncher;
        if (activityResultLauncher != null) {
            activityResultLauncher.b();
            this.cameraLauncher = null;
        }
        ActivityResultLauncher activityResultLauncher2 = this.libraryLauncher;
        if (activityResultLauncher2 != null) {
            activityResultLauncher2.b();
            this.libraryLauncher = null;
        }
        if (this.currentFragmentActivity != null) {
            this.currentFragmentActivity = null;
        }
    }

    @ReactMethod
    public void launchCamera(ReadableMap readableMap, Callback callback) {
        Intent intent;
        File fileL;
        int i7;
        ReactApplicationContext reactApplicationContext = this.reactContext;
        if (!reactApplicationContext.getPackageManager().hasSystemFeature("android.hardware.camera") && !reactApplicationContext.getPackageManager().hasSystemFeature("android.hardware.camera.any")) {
            callback.invoke(c9.a.q("camera_unavailable", null));
            return;
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            callback.invoke(c9.a.q("others", "Activity error"));
            return;
        }
        ReactApplicationContext reactApplicationContext2 = this.reactContext;
        try {
            String[] strArr = reactApplicationContext2.getPackageManager().getPackageInfo(reactApplicationContext2.getPackageName(), RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT).requestedPermissions;
            if (strArr != null && Arrays.asList(strArr).contains("android.permission.CAMERA") && y0.b.a(currentActivity, "android.permission.CAMERA") != 0) {
                callback.invoke(c9.a.q("others", "This library does not require Manifest.permission.CAMERA, if you add this permission in manifest then you have to obtain the same."));
                return;
            }
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
        }
        this.callback = callback;
        b bVar = new b(readableMap);
        this.options = bVar;
        if (bVar.f6865h.booleanValue() && Build.VERSION.SDK_INT <= 28 && y0.b.a(currentActivity, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            callback.invoke(c9.a.q("permission", null));
            this.callback = null;
            return;
        }
        this.identifier = UUID.randomUUID();
        if (this.options.f6867l.equals(MediaStreamTrack.VIDEO_TRACK_KIND)) {
            intent = new Intent("android.media.action.VIDEO_CAPTURE");
            intent.putExtra("android.intent.extra.videoQuality", this.options.f6861d);
            int i10 = this.options.f6866i;
            if (i10 > 0) {
                intent.putExtra("android.intent.extra.durationLimit", i10);
            }
            fileL = c9.a.l(this.reactContext, this.identifier, "mp4");
            ReactApplicationContext reactApplicationContext3 = this.reactContext;
            this.cameraCaptureURI = FileProvider.getUriForFile(reactApplicationContext3, reactApplicationContext3.getApplicationContext().getPackageName() + ".imagepickerprovider", fileL);
            i7 = REQUEST_LAUNCH_VIDEO_CAPTURE;
        } else {
            intent = new Intent("android.media.action.IMAGE_CAPTURE");
            fileL = c9.a.l(this.reactContext, this.identifier, "jpg");
            ReactApplicationContext reactApplicationContext4 = this.reactContext;
            this.cameraCaptureURI = FileProvider.getUriForFile(reactApplicationContext4, reactApplicationContext4.getApplicationContext().getPackageName() + ".imagepickerprovider", fileL);
            i7 = REQUEST_LAUNCH_IMAGE_CAPTURE;
        }
        if (this.options.j.booleanValue()) {
            int i11 = Build.VERSION.SDK_INT;
            intent.putExtra("android.intent.extras.CAMERA_FACING", 0);
            if (i11 >= 26) {
                intent.putExtra("android.intent.extra.USE_FRONT_CAMERA", true);
            }
        }
        this.fileUri = Uri.fromFile(fileL);
        intent.putExtra("output", this.cameraCaptureURI);
        intent.addFlags(3);
        try {
            ActivityResultLauncher activityResultLauncher = this.cameraLauncher;
            if (activityResultLauncher != null) {
                activityResultLauncher.a(intent, null);
            } else {
                currentActivity.startActivityForResult(intent, i7);
            }
        } catch (ActivityNotFoundException e11) {
            callback.invoke(c9.a.q("others", e11.getMessage()));
            this.callback = null;
        } catch (Exception e12) {
            callback.invoke(c9.a.q("others", "Failed to launch camera: " + e12.getMessage()));
            this.callback = null;
        }
    }

    @ReactMethod
    public void launchImageLibrary(ReadableMap readableMap, Callback callback) {
        Intent intent;
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            callback.invoke(c9.a.q("others", "Activity error"));
            return;
        }
        this.callback = callback;
        b bVar = new b(readableMap);
        this.options = bVar;
        boolean z5 = bVar.f6858a == 1;
        boolean zEquals = bVar.f6867l.equals("photo");
        boolean zEquals2 = this.options.f6867l.equals(MediaStreamTrack.VIDEO_TRACK_KIND);
        boolean zEquals3 = this.options.f6867l.equals("mixed");
        if (!z5 || (!(zEquals || zEquals2) || this.options.k.booleanValue())) {
            intent = new Intent("android.intent.action.GET_CONTENT");
            intent.addCategory("android.intent.category.OPENABLE");
        } else {
            intent = new Intent("android.intent.action.PICK");
        }
        if (!z5) {
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        }
        if (zEquals) {
            intent.setType("image/*");
        } else if (zEquals2) {
            intent.setType("video/*");
        } else if (zEquals3) {
            intent.setType("*/*");
            intent.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
        } else {
            intent.setType("*/*");
        }
        Intent intentCreateChooser = Intent.createChooser(intent, null);
        try {
            ActivityResultLauncher activityResultLauncher = this.libraryLauncher;
            if (activityResultLauncher != null) {
                activityResultLauncher.a(intentCreateChooser, null);
            } else {
                currentActivity.startActivityForResult(intentCreateChooser, REQUEST_LAUNCH_LIBRARY);
            }
        } catch (ActivityNotFoundException e10) {
            callback.invoke(c9.a.q("others", e10.getMessage()));
            this.callback = null;
        } catch (Exception e11) {
            callback.invoke(c9.a.q("others", "Failed to launch library: " + e11.getMessage()));
            this.callback = null;
        }
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onActivityResult(Activity activity, int i7, int i10, Intent intent) {
        List<Uri> listSingletonList;
        switch (i7) {
            case REQUEST_LAUNCH_IMAGE_CAPTURE /* 13001 */:
            case REQUEST_LAUNCH_VIDEO_CAPTURE /* 13002 */:
            case REQUEST_LAUNCH_LIBRARY /* 13003 */:
                if (this.callback != null) {
                    if (i10 != -1) {
                        if (i7 == 13001) {
                            new File(this.fileUri.getPath()).delete();
                        }
                        Callback callback = this.callback;
                        WritableMap writableMapCreateMap = Arguments.createMap();
                        writableMapCreateMap.putBoolean("didCancel", true);
                        callback.invoke(writableMapCreateMap);
                        this.callback = null;
                        break;
                    } else {
                        switch (i7) {
                            case REQUEST_LAUNCH_IMAGE_CAPTURE /* 13001 */:
                                if (this.options.f6865h.booleanValue()) {
                                    c9.a.H(this.cameraCaptureURI, this.identifier, this.reactContext, "photo");
                                }
                                onAssetsObtained(Collections.singletonList(this.fileUri));
                                break;
                            case REQUEST_LAUNCH_VIDEO_CAPTURE /* 13002 */:
                                if (this.options.f6865h.booleanValue()) {
                                    c9.a.H(this.cameraCaptureURI, this.identifier, this.reactContext, MediaStreamTrack.VIDEO_TRACK_KIND);
                                }
                                onAssetsObtained(Collections.singletonList(this.fileUri));
                                break;
                            case REQUEST_LAUNCH_LIBRARY /* 13003 */:
                                if (intent.getClipData() == null) {
                                    listSingletonList = Collections.singletonList(intent.getData());
                                } else {
                                    ClipData clipData = intent.getClipData();
                                    ArrayList arrayList = new ArrayList(clipData.getItemCount());
                                    for (int i11 = 0; i11 < clipData.getItemCount(); i11++) {
                                        arrayList.add(clipData.getItemAt(i11).getUri());
                                    }
                                    listSingletonList = arrayList;
                                }
                                onAssetsObtained(listSingletonList);
                                break;
                        }
                    }
                }
                break;
        }
    }

    public void onAssetsObtained(List<Uri> list) {
        try {
            this.callback.invoke(c9.a.v(list, this.identifier, this.options, this.reactContext));
        } catch (RuntimeException e10) {
            this.callback.invoke(c9.a.q("others", e10.getMessage()));
        } finally {
            this.callback = null;
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity instanceof FragmentActivity) {
            initializeLaunchers((FragmentActivity) currentActivity);
        }
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onNewIntent(Intent intent) {
    }
}
