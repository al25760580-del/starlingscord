package com.reactnative.ivpusic.imagepicker;

import a5.r;
import android.app.Activity;
import android.net.Uri;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import il.d;
import il.e;
import il.f;
import java.util.Arrays;
import java.util.Collections;
import q8.c;

/* JADX INFO: loaded from: classes3.dex */
@ReactModule(name = NativeImageCropPickerSpec.NAME)
public class PickerModule extends NativeImageCropPickerSpec {
    private final e picker;

    public PickerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        e eVar = new e();
        eVar.f11850d = "any";
        eVar.f11852e = false;
        eVar.f11854i = false;
        eVar.f11855v = false;
        eVar.f11856w = false;
        eVar.f11857x = false;
        eVar.f11858y = false;
        eVar.E = true;
        eVar.F = true;
        eVar.G = false;
        eVar.H = false;
        eVar.I = false;
        eVar.J = false;
        eVar.K = true;
        eVar.L = false;
        eVar.N = null;
        eVar.O = null;
        eVar.P = null;
        eVar.Q = null;
        eVar.R = null;
        eVar.S = null;
        eVar.T = null;
        eVar.U = null;
        eVar.V = null;
        eVar.W = null;
        eVar.X = 0;
        eVar.Y = 0;
        eVar.Z = 5;
        eVar.f11849c0 = new f();
        eVar.f11851d0 = new c();
        eVar.f11853e0 = reactApplicationContext;
        reactApplicationContext.addActivityEventListener(eVar);
        this.picker = eVar;
    }

    @Override // com.reactnative.ivpusic.imagepicker.NativeImageCropPickerSpec
    public void clean(Promise promise) {
        e eVar = this.picker;
        Activity currentActivity = eVar.f11853e0.getCurrentActivity();
        if (currentActivity == null) {
            promise.reject("E_ACTIVITY_DOES_NOT_EXIST", "Activity doesn't exist");
        } else {
            e.o(currentActivity, promise, Collections.singletonList("android.permission.WRITE_EXTERNAL_STORAGE"), new r(eVar, currentActivity, promise, 4));
        }
    }

    @Override // com.reactnative.ivpusic.imagepicker.NativeImageCropPickerSpec
    public void cleanSingle(String str, Promise promise) {
        e eVar = this.picker;
        if (str == null) {
            eVar.getClass();
            promise.reject("E_ERROR_WHILE_CLEANING_FILES", "Cannot cleanup empty path");
            return;
        }
        Activity currentActivity = eVar.f11853e0.getCurrentActivity();
        if (currentActivity == null) {
            promise.reject("E_ACTIVITY_DOES_NOT_EXIST", "Activity doesn't exist");
        } else {
            e.o(currentActivity, promise, Collections.singletonList("android.permission.WRITE_EXTERNAL_STORAGE"), new r(str, eVar, promise));
        }
    }

    @Override // com.reactnative.ivpusic.imagepicker.NativeImageCropPickerSpec
    public void openCamera(ReadableMap readableMap, Promise promise) {
        e eVar = this.picker;
        Activity currentActivity = eVar.f11853e0.getCurrentActivity();
        if (currentActivity == null) {
            promise.reject("E_ACTIVITY_DOES_NOT_EXIST", "Activity doesn't exist");
            return;
        }
        if (!currentActivity.getPackageManager().hasSystemFeature("android.hardware.camera") && !currentActivity.getPackageManager().hasSystemFeature("android.hardware.camera.any")) {
            promise.reject("E_CAMERA_IS_NOT_AVAILABLE", "Camera not available");
            return;
        }
        eVar.q(readableMap);
        eVar.f11849c0.f(promise, false);
        e.o(currentActivity, promise, Arrays.asList("android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"), new il.c(eVar, currentActivity, 0));
    }

    @Override // com.reactnative.ivpusic.imagepicker.NativeImageCropPickerSpec
    public void openCropper(ReadableMap readableMap, Promise promise) {
        e eVar = this.picker;
        Activity currentActivity = eVar.f11853e0.getCurrentActivity();
        if (currentActivity == null) {
            promise.reject("E_ACTIVITY_DOES_NOT_EXIST", "Activity doesn't exist");
            return;
        }
        eVar.q(readableMap);
        eVar.f11849c0.f(promise, false);
        String string = readableMap.getString("mimeType");
        e.o(currentActivity, promise, Collections.singletonList("android.permission.WRITE_EXTERNAL_STORAGE"), new d(eVar, Uri.parse(readableMap.getString("path")), currentActivity, string));
    }

    @Override // com.reactnative.ivpusic.imagepicker.NativeImageCropPickerSpec
    public void openPicker(ReadableMap readableMap, Promise promise) {
        e eVar = this.picker;
        Activity currentActivity = eVar.f11853e0.getCurrentActivity();
        if (currentActivity == null) {
            promise.reject("E_ACTIVITY_DOES_NOT_EXIST", "Activity doesn't exist");
            return;
        }
        eVar.q(readableMap);
        eVar.f11849c0.f(promise, eVar.f11852e);
        e.o(currentActivity, promise, Collections.singletonList("android.permission.WRITE_EXTERNAL_STORAGE"), new il.c(eVar, currentActivity, 1));
    }
}
