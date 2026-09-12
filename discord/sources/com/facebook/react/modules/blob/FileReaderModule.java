package com.facebook.react.modules.blob;

import android.util.Base64;
import com.facebook.fbreact.specs.NativeFileReaderModuleSpec;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@ReactModule(name = NativeFileReaderModuleSpec.NAME)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0002J \u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016¨\u0006\u0013"}, d2 = {"Lcom/facebook/react/modules/blob/FileReaderModule;", "Lcom/facebook/fbreact/specs/NativeFileReaderModuleSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getBlobModule", "Lcom/facebook/react/modules/blob/BlobModule;", "reason", "", "readAsText", "", "blob", "Lcom/facebook/react/bridge/ReadableMap;", "encoding", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "readAsDataURL", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FileReaderModule extends NativeFileReaderModuleSpec {

    @NotNull
    private static final String ERROR_INVALID_BLOB = "ERROR_INVALID_BLOB";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String NAME = NativeFileReaderModuleSpec.NAME;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/facebook/react/modules/blob/FileReaderModule$Companion;", "", "<init>", "()V", "NAME", "", "getNAME", "()Ljava/lang/String;", FileReaderModule.ERROR_INVALID_BLOB, "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getNAME() {
            return FileReaderModule.NAME;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileReaderModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
    }

    private final BlobModule getBlobModule(String reason) {
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            return (BlobModule) reactApplicationContextIfActiveOrWarn.getNativeModule(BlobModule.class);
        }
        return null;
    }

    @Override // com.facebook.fbreact.specs.NativeFileReaderModuleSpec
    public void readAsDataURL(@NotNull ReadableMap blob, @NotNull Promise promise) {
        String string;
        Intrinsics.checkNotNullParameter(blob, "blob");
        Intrinsics.checkNotNullParameter(promise, "promise");
        BlobModule blobModule = getBlobModule("readAsDataURL");
        if (blobModule == null) {
            promise.reject(new IllegalStateException("Could not get BlobModule from ReactApplicationContext"));
            return;
        }
        String string2 = blob.getString("blobId");
        if (string2 == null) {
            promise.reject(ERROR_INVALID_BLOB, "The specified blob does not contain a blobId");
            return;
        }
        byte[] bArrResolve = blobModule.resolve(string2, blob.getInt("offset"), blob.getInt("size"));
        if (bArrResolve == null) {
            promise.reject(ERROR_INVALID_BLOB, "The specified blob is invalid");
            return;
        }
        try {
            StringBuilder sb2 = new StringBuilder("data:");
            if (!blob.hasKey("type") || (string = blob.getString("type")) == null || string.length() == 0) {
                sb2.append("application/octet-stream");
            } else {
                sb2.append(blob.getString("type"));
            }
            sb2.append(";base64,");
            sb2.append(Base64.encodeToString(bArrResolve, 2));
            promise.resolve(sb2.toString());
        } catch (Exception e10) {
            promise.reject(e10);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeFileReaderModuleSpec
    public void readAsText(@NotNull ReadableMap blob, @NotNull String encoding, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(blob, "blob");
        Intrinsics.checkNotNullParameter(encoding, "encoding");
        Intrinsics.checkNotNullParameter(promise, "promise");
        BlobModule blobModule = getBlobModule("readAsText");
        if (blobModule == null) {
            promise.reject(new IllegalStateException("Could not get BlobModule from ReactApplicationContext"));
            return;
        }
        String string = blob.getString("blobId");
        if (string == null) {
            promise.reject(ERROR_INVALID_BLOB, "The specified blob does not contain a blobId");
            return;
        }
        byte[] bArrResolve = blobModule.resolve(string, blob.getInt("offset"), blob.getInt("size"));
        if (bArrResolve == null) {
            promise.reject(ERROR_INVALID_BLOB, "The specified blob is invalid");
            return;
        }
        try {
            Charset charsetForName = Charset.forName(encoding);
            Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(...)");
            promise.resolve(new String(bArrResolve, charsetForName));
        } catch (Exception e10) {
            promise.reject(e10);
        }
    }
}
