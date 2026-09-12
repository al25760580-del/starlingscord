package com.reactnativedocumentpicker;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.ContentResolver;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.util.Base64;
import android.webkit.MimeTypeMap;
import androidx.lifecycle.f0;
import ar.b0;
import ar.k0;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import h1.c;
import hr.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.collections.c0;
import kotlin.collections.e0;
import kotlin.collections.n0;
import kotlin.collections.s0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;
import kotlinx.coroutines.CoroutineScope;
import lo.b;
import m3.m;
import ol.d;
import ol.f;
import ol.g;
import ol.h;
import ol.i;
import ol.j;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 =2\u00020\u0001:\u0001>B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0016\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0017\u0010\u0013J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010\"\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\"\u0010!J\u001f\u0010#\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b#\u0010\u0013J\u0015\u0010$\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b$\u0010\nR\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R \u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020(0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006?"}, d2 = {"Lcom/reactnativedocumentpicker/RNDocumentPickerModule;", "Lcom/reactnativedocumentpicker/NativeDocumentPickerSpec;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Landroid/content/Intent;", "intent", "", "processDirectoryPickerResult", "(Landroid/content/Intent;)V", "processSaveAsResult", "invalidate", "()V", "Lcom/facebook/react/bridge/ReadableMap;", "opts", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "pick", "(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V", "options", "saveDocument", "pickDirectory", "keepLocalCopy", "", "kind", "value", "Lcom/facebook/react/bridge/WritableMap;", "isKnownType", "(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/react/bridge/WritableMap;", "Lcom/facebook/react/bridge/ReadableArray;", "uris", "releaseSecureAccess", "(Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/Promise;)V", "releaseLongTermAccess", "writeDocuments", "processFilePickerResult", "Lol/g;", "currentPickOptions", "Lol/g;", "Landroid/net/Uri;", "currentUriOfFileBeingExported", "Landroid/net/Uri;", "Lol/h;", "promiseWrapper", "Lol/h;", "", "pickedFilesUriMap", "Ljava/util/Map;", "Lol/f;", "metadataGetter", "Lol/f;", "Lol/d;", "fileOps", "Lol/d;", "Lkotlinx/coroutines/CoroutineScope;", "fileCopyingCoroutine", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/facebook/react/bridge/ActivityEventListener;", "activityEventListener", "Lcom/facebook/react/bridge/ActivityEventListener;", "Companion", "ol/i", "react-native-documents_picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRNDocumentPickerModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RNDocumentPickerModule.kt\ncom/reactnativedocumentpicker/RNDocumentPickerModule\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,331:1\n1#2:332\n1563#3:333\n1634#3,3:334\n*S KotlinDebug\n*F\n+ 1 RNDocumentPickerModule.kt\ncom/reactnativedocumentpicker/RNDocumentPickerModule\n*L\n296#1:333\n296#1:334,3\n*E\n"})
public final class RNDocumentPickerModule extends NativeDocumentPickerSpec {

    @NotNull
    public static final i Companion = new i();

    @NotNull
    private static final String E_INVALID_DATA_RETURNED = "INVALID_DATA_RETURNED";

    @NotNull
    private static final String E_OTHER_PRESENTING_ERROR = "OTHER_PRESENTING_ERROR";

    @NotNull
    private static final String NULL_PRESENTER = "NULL_PRESENTER";
    private static final int PICK_DIR_REQUEST_CODE = 42;
    private static final int PICK_FILES_REQUEST_CODE = 41;
    private static final int SAVE_DOC_REQUEST_CODE = 43;

    @NotNull
    private static final String UNABLE_TO_OPEN_FILE_TYPE = "UNABLE_TO_OPEN_FILE_TYPE";

    @NotNull
    private final ActivityEventListener activityEventListener;
    private g currentPickOptions;
    private Uri currentUriOfFileBeingExported;

    @NotNull
    private final CoroutineScope fileCopyingCoroutine;

    @NotNull
    private final d fileOps;

    @NotNull
    private final f metadataGetter;

    @NotNull
    private final Map<String, Uri> pickedFilesUriMap;

    @NotNull
    private final h promiseWrapper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RNDocumentPickerModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(NativeDocumentPickerSpec.NAME, "MODULE_NAME");
        this.promiseWrapper = new h();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.pickedFilesUriMap = linkedHashMap;
        this.metadataGetter = new f(linkedHashMap);
        this.fileOps = new d(linkedHashMap);
        e eVar = k0.f2938a;
        this.fileCopyingCoroutine = b0.b(hr.d.f11103i);
        j jVar = new j(this);
        this.activityEventListener = jVar;
        getReactApplicationContext().addActivityEventListener(jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"WrongConstant"})
    public final void processDirectoryPickerResult(Intent intent) {
        Uri data = intent.getData();
        g gVar = this.currentPickOptions;
        if (data == null || gVar == null) {
            this.promiseWrapper.b(E_INVALID_DATA_RETURNED, "Data from document picker is null", null);
            return;
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("uri", data.toString());
        if (gVar.f17458f) {
            try {
                getReactApplicationContext().getContentResolver().takePersistableUriPermission(data, intent.getFlags() & 3);
                String string = data.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                byte[] bytes = string.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                String strEncodeToString = Base64.encodeToString(bytes, 0);
                writableMapCreateMap.putString("bookmarkStatus", "success");
                writableMapCreateMap.putString("bookmark", strEncodeToString);
            } catch (Exception e10) {
                String localizedMessage = e10.getLocalizedMessage();
                if (localizedMessage == null && (localizedMessage = e10.getMessage()) == null) {
                    localizedMessage = "Unknown error with takePersistableUriPermission";
                }
                writableMapCreateMap.putString("bookmarkStatus", "error");
                writableMapCreateMap.putString("bookmarkError", localizedMessage);
            }
        }
        this.promiseWrapper.c(writableMapCreateMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processSaveAsResult(Intent intent) {
        Uri data = intent.getData();
        if (data == null) {
            this.promiseWrapper.b(E_INVALID_DATA_RETURNED, "Data from document picker is null", null);
            return;
        }
        this.pickedFilesUriMap.put(data.toString(), data);
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("uri", data.toString());
        this.promiseWrapper.c(writableMapCreateMap);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        CoroutineScope coroutineScope = this.fileCopyingCoroutine;
        CancellationException cancellationException = new CancellationException("module invalidated");
        cancellationException.initCause(null);
        b0.f(coroutineScope, cancellationException);
        getReactApplicationContext().removeActivityEventListener(this.activityEventListener);
        super.invalidate();
    }

    @Override // com.reactnativedocumentpicker.NativeDocumentPickerSpec
    @NotNull
    public WritableMap isKnownType(@NotNull String kind, @NotNull String value) {
        boolean z5;
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(value, "value");
        if (Intrinsics.areEqual(kind, "mimeType")) {
            String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(value);
            z5 = extensionFromMimeType != null;
            if (extensionFromMimeType == null) {
                value = null;
            }
            return m.o(extensionFromMimeType, value, z5);
        }
        if (!Intrinsics.areEqual(kind, "extension")) {
            return m.o(null, null, false);
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(value);
        z5 = mimeTypeFromExtension != null;
        if (mimeTypeFromExtension == null) {
            value = null;
        }
        return m.o(value, mimeTypeFromExtension, z5);
    }

    @Override // com.reactnativedocumentpicker.NativeDocumentPickerSpec
    @ReactMethod
    public void keepLocalCopy(@NotNull ReadableMap options, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(promise, "promise");
        ReadableArray array = options.getArray("files");
        String string = options.getString("destination");
        if (string != null && array != null) {
            b0.t(this.fileCopyingCoroutine, null, new f0(this, array, string, promise, (Continuation) null, 3), 3);
            return;
        }
        promise.reject("keepLocalCopy", "You did not provide the correct options. Expected 'files' and 'destination', got: " + options.toHashMap().keySet());
    }

    @Override // com.reactnativedocumentpicker.NativeDocumentPickerSpec
    @ReactMethod
    public void pick(@NotNull ReadableMap opts, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(opts, "opts");
        Intrinsics.checkNotNullParameter(promise, "promise");
        Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        if (currentActivity == null) {
            Companion.getClass();
            Intrinsics.checkNotNullParameter(promise, "promise");
            promise.reject(NULL_PRESENTER, "Current activity is null. Cannot present sign-in UI. Make sure there are no modal windows being presented or dismissed.");
        } else if (this.promiseWrapper.d(promise, "pick")) {
            g gVar = new g(opts);
            this.currentPickOptions = gVar;
            try {
                currentActivity.startActivityForResult(gVar.a(), 41);
            } catch (ActivityNotFoundException e10) {
                this.promiseWrapper.a(UNABLE_TO_OPEN_FILE_TYPE, e10);
            } catch (Exception e11) {
                this.promiseWrapper.a(E_OTHER_PRESENTING_ERROR, e11);
            }
        }
    }

    @Override // com.reactnativedocumentpicker.NativeDocumentPickerSpec
    @ReactMethod
    public void pickDirectory(@NotNull ReadableMap opts, @NotNull Promise promise) {
        String str;
        Intrinsics.checkNotNullParameter(opts, "opts");
        Intrinsics.checkNotNullParameter(promise, "promise");
        Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        if (currentActivity == null) {
            Companion.getClass();
            Intrinsics.checkNotNullParameter(promise, "promise");
            promise.reject(NULL_PRESENTER, "Current activity is null. Cannot present sign-in UI. Make sure there are no modal windows being presented or dismissed.");
            return;
        }
        if (this.promiseWrapper.d(promise, "pickDirectory")) {
            g gVar = new g(opts);
            this.currentPickOptions = gVar;
            try {
                Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
                if (Build.VERSION.SDK_INT >= 26 && (str = gVar.f17455c) != null) {
                    intent.putExtra("android.provider.extra.INITIAL_URI", str);
                }
                currentActivity.startActivityForResult(intent, PICK_DIR_REQUEST_CODE);
            } catch (ActivityNotFoundException e10) {
                this.promiseWrapper.a(UNABLE_TO_OPEN_FILE_TYPE, e10);
            } catch (Exception e11) {
                this.promiseWrapper.a(E_OTHER_PRESENTING_ERROR, e11);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.collections.n0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
    public final void processFilePickerResult(@NotNull Intent intent) {
        Object objC;
        Intrinsics.checkNotNullParameter(intent, "intent");
        Uri data = intent.getData();
        ClipData clipData = intent.getClipData();
        if (clipData == null || clipData.getItemCount() <= 0) {
            objC = data != null ? c0.c(data) : n0.f14659d;
        } else {
            IntRange intRangeI = lo.j.i(0, clipData.getItemCount());
            objC = new ArrayList(e0.l(intRangeI, 10));
            Iterator it = intRangeI.iterator();
            while (((b) it).f15156i) {
                objC.add(clipData.getItemAt(((s0) it).nextInt()).getUri());
            }
        }
        b0.t(this.fileCopyingCoroutine, null, new b4.d(this, objC, null, 12), 3);
    }

    @Override // com.reactnativedocumentpicker.NativeDocumentPickerSpec
    public void releaseLongTermAccess(@NotNull ReadableArray uris, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(uris, "uris");
        Intrinsics.checkNotNullParameter(promise, "promise");
        ContentResolver contentResolver = getReactApplicationContext().getContentResolver();
        WritableArray writableArrayCreateArray = Arguments.createArray();
        int size = uris.size();
        for (int i7 = 0; i7 < size; i7++) {
            String string = uris.getString(i7);
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString("uri", string);
            try {
                contentResolver.releasePersistableUriPermission(Uri.parse(string), 3);
                writableMapCreateMap.putString("status", "success");
            } catch (Exception e10) {
                writableMapCreateMap.putString("status", "error");
                String message = e10.getMessage();
                if (message == null) {
                    message = "Unknown error";
                }
                writableMapCreateMap.putString("errorMessage", message);
            }
            writableArrayCreateArray.pushMap(writableMapCreateMap);
        }
        promise.resolve(writableArrayCreateArray);
    }

    @Override // com.reactnativedocumentpicker.NativeDocumentPickerSpec
    public void releaseSecureAccess(@NotNull ReadableArray uris, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(uris, "uris");
        Intrinsics.checkNotNullParameter(promise, "promise");
        promise.resolve(null);
    }

    @Override // com.reactnativedocumentpicker.NativeDocumentPickerSpec
    public void saveDocument(@NotNull ReadableMap options, @NotNull Promise promise) {
        String type;
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(promise, "promise");
        Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        if (currentActivity == null) {
            Companion.getClass();
            Intrinsics.checkNotNullParameter(promise, "promise");
            promise.reject(NULL_PRESENTER, "Current activity is null. Cannot present sign-in UI. Make sure there are no modal windows being presented or dismissed.");
            return;
        }
        if (this.promiseWrapper.d(promise, "saveDocuments")) {
            try {
                ReadableArray array = options.getArray("sourceUris");
                Intrinsics.checkNotNull(array);
                Uri uri = Uri.parse(array.getString(0));
                this.currentUriOfFileBeingExported = uri;
                if (options.hasKey("mimeType")) {
                    type = options.getString("mimeType");
                } else {
                    type = getReactApplicationContext().getContentResolver().getType(uri);
                    if (type == null) {
                        throw new IllegalStateException("MIME type could not be determined from the URI");
                    }
                }
                String string = options.hasKey("fileName") ? options.getString("fileName") : null;
                Intent intent = new Intent("android.intent.action.CREATE_DOCUMENT");
                intent.addCategory("android.intent.category.OPENABLE");
                intent.setType(type);
                if (string != null) {
                    intent.putExtra("android.intent.extra.TITLE", string);
                }
                if (Build.VERSION.SDK_INT >= 26 && options.hasKey("initialUri")) {
                    intent.putExtra("android.provider.extra.INITIAL_URI", options.getString("initialUri"));
                }
                currentActivity.startActivityForResult(intent, 43);
            } catch (ActivityNotFoundException e10) {
                this.promiseWrapper.a(UNABLE_TO_OPEN_FILE_TYPE, e10);
            } catch (Exception e11) {
                this.promiseWrapper.a(E_OTHER_PRESENTING_ERROR, e11);
            }
        }
    }

    @Override // com.reactnativedocumentpicker.NativeDocumentPickerSpec
    public void writeDocuments(@NotNull ReadableMap options, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(promise, "promise");
        b0.t(this.fileCopyingCoroutine, null, new c(options, this, promise, null), 3);
    }
}
