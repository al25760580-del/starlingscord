package com.facebook.react.bridge;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rn.d;
import xa.a;

/* JADX INFO: loaded from: classes3.dex */
@a
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u001d\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0002\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u001c\u0010\u0004\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\u001c\u0010\u0004\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J&\u0010\u0004\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u0010\u0010\u0004\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u0004\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u001a\u0010\u0004\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J$\u0010\u0004\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J$\u0010\u0004\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J0\u0010\u0004\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0010\u0010\u0004\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0017R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/facebook/react/bridge/PromiseImpl;", "Lcom/facebook/react/bridge/Promise;", "resolve", "Lcom/facebook/react/bridge/Callback;", "reject", "<init>", "(Lcom/facebook/react/bridge/Callback;Lcom/facebook/react/bridge/Callback;)V", "", "value", "", PromiseImpl.ERROR_MAP_KEY_CODE, "", "message", "throwable", "", PromiseImpl.ERROR_MAP_KEY_USER_INFO, "Lcom/facebook/react/bridge/WritableMap;", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PromiseImpl implements Promise {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final String ERROR_DEFAULT_CODE = "EUNSPECIFIED";

    @NotNull
    private static final String ERROR_DEFAULT_MESSAGE = "Error not specified.";

    @NotNull
    private static final String ERROR_MAP_KEY_CODE = "code";

    @NotNull
    private static final String ERROR_MAP_KEY_MESSAGE = "message";

    @NotNull
    private static final String ERROR_MAP_KEY_NAME = "name";

    @NotNull
    private static final String ERROR_MAP_KEY_NATIVE_STACK = "nativeStackAndroid";

    @NotNull
    private static final String ERROR_MAP_KEY_USER_INFO = "userInfo";
    private static final int ERROR_STACK_FRAME_LIMIT = 50;

    @NotNull
    private static final String STACK_FRAME_KEY_CLASS = "class";

    @NotNull
    private static final String STACK_FRAME_KEY_FILE = "file";

    @NotNull
    private static final String STACK_FRAME_KEY_LINE_NUMBER = "lineNumber";

    @NotNull
    private static final String STACK_FRAME_KEY_METHOD_NAME = "methodName";
    private Callback reject;
    private Callback resolve;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/facebook/react/bridge/PromiseImpl$Companion;", "", "<init>", "()V", "ERROR_STACK_FRAME_LIMIT", "", "ERROR_DEFAULT_CODE", "", "ERROR_DEFAULT_MESSAGE", "ERROR_MAP_KEY_CODE", "ERROR_MAP_KEY_MESSAGE", "ERROR_MAP_KEY_NAME", "ERROR_MAP_KEY_USER_INFO", "ERROR_MAP_KEY_NATIVE_STACK", "STACK_FRAME_KEY_CLASS", "STACK_FRAME_KEY_FILE", "STACK_FRAME_KEY_LINE_NUMBER", "STACK_FRAME_KEY_METHOD_NAME", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @a
    public PromiseImpl(Callback callback, Callback callback2) {
        this.resolve = callback;
        this.reject = callback2;
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(String code, String message) {
        reject(code, message, null, null);
    }

    @Override // com.facebook.react.bridge.Promise
    public void resolve(Object value) {
        Callback callback = this.resolve;
        if (callback != null) {
            callback.invoke(value);
            this.resolve = null;
            this.reject = null;
        }
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(String code, Throwable throwable) {
        reject(code, null, throwable, null);
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(String code, String message, Throwable throwable) {
        reject(code, message, throwable, null);
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(@NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        reject(null, null, throwable, null);
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(@NotNull Throwable throwable, @NotNull WritableMap userInfo) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
        reject(null, null, throwable, userInfo);
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(String code, @NotNull WritableMap userInfo) {
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
        reject(code, null, null, userInfo);
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(String code, Throwable throwable, @NotNull WritableMap userInfo) {
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
        reject(code, null, throwable, userInfo);
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(String code, String message, @NotNull WritableMap userInfo) {
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
        reject(code, message, null, userInfo);
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(String code, String message, Throwable throwable, WritableMap userInfo) {
        if (this.reject == null) {
            this.resolve = null;
            return;
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (code == null) {
            writableNativeMap.putString(ERROR_MAP_KEY_CODE, ERROR_DEFAULT_CODE);
        } else {
            writableNativeMap.putString(ERROR_MAP_KEY_CODE, code);
        }
        if (message != null) {
            writableNativeMap.putString("message", message);
        } else if (throwable == null) {
            writableNativeMap.putString("message", ERROR_DEFAULT_MESSAGE);
        } else {
            String message2 = throwable.getMessage();
            if (message2 == null || message2.length() == 0) {
                message2 = throwable.getClass().getCanonicalName();
            }
            writableNativeMap.putString("message", message2);
        }
        if (userInfo != null) {
            writableNativeMap.putMap(ERROR_MAP_KEY_USER_INFO, userInfo);
        } else {
            writableNativeMap.putNull(ERROR_MAP_KEY_USER_INFO);
        }
        if (throwable == null) {
            writableNativeMap.putArray(ERROR_MAP_KEY_NATIVE_STACK, new WritableNativeArray());
        } else {
            writableNativeMap.putString("name", throwable.getClass().getCanonicalName());
            StackTraceElement[] stackTrace = throwable.getStackTrace();
            WritableNativeArray writableNativeArray = new WritableNativeArray();
            for (int i7 = 0; i7 < stackTrace.length && i7 < 50; i7++) {
                StackTraceElement stackTraceElement = stackTrace[i7];
                WritableNativeMap writableNativeMap2 = new WritableNativeMap();
                writableNativeMap2.putString(STACK_FRAME_KEY_CLASS, stackTraceElement.getClassName());
                writableNativeMap2.putString("file", stackTraceElement.getFileName());
                writableNativeMap2.putInt("lineNumber", stackTraceElement.getLineNumber());
                writableNativeMap2.putString("methodName", stackTraceElement.getMethodName());
                writableNativeArray.pushMap(writableNativeMap2);
            }
            writableNativeMap.putArray(ERROR_MAP_KEY_NATIVE_STACK, writableNativeArray);
        }
        Callback callback = this.reject;
        if (callback != null) {
            callback.invoke(writableNativeMap);
        }
        this.resolve = null;
        this.reject = null;
    }

    @Override // com.facebook.react.bridge.Promise
    @d
    public void reject(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        reject(null, message, null, null);
    }
}
