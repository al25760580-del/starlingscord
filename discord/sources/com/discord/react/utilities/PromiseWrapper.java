package com.discord.react.utilities;

import a3.e;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.WritableMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001\"B?\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0011\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0011\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0011\u0010\u0015J-\u0010\u0011\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0011\u0010\u0016J\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0011\u0010\u0017J\u001f\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0011\u0010\u001aJ!\u0010\u0011\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0011\u0010\u001bJ+\u0010\u0011\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0011\u0010\u001cJ+\u0010\u0011\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0011\u0010\u001dJ\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u001eJ7\u0010\u0011\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u0011\u0010\u001fR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010 R$\u0010\u0005\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010!¨\u0006#"}, d2 = {"Lcom/discord/react/utilities/PromiseWrapper;", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lkotlin/Function1;", "", "resolveTransform", "Lcom/discord/react/utilities/PromiseWrapper$Rejection;", "rejectTransform", "<init>", "(Lcom/facebook/react/bridge/Promise;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "value", "", "resolve", "(Ljava/lang/Object;)V", "", "code", "message", "reject", "(Ljava/lang/String;Ljava/lang/String;)V", "", "throwable", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "(Ljava/lang/Throwable;)V", "Lcom/facebook/react/bridge/WritableMap;", "userInfo", "(Ljava/lang/Throwable;Lcom/facebook/react/bridge/WritableMap;)V", "(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V", "(Ljava/lang/String;Ljava/lang/Throwable;Lcom/facebook/react/bridge/WritableMap;)V", "(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V", "(Ljava/lang/String;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Lcom/facebook/react/bridge/WritableMap;)V", "Lcom/facebook/react/bridge/Promise;", "Lkotlin/jvm/functions/Function1;", "Rejection", "react_utilities_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PromiseWrapper implements Promise {

    @NotNull
    private final Promise promise;

    @NotNull
    private final Function1<Rejection, Rejection> rejectTransform;

    @NotNull
    private final Function1<Object, Object> resolveTransform;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J9\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/discord/react/utilities/PromiseWrapper$Rejection;", "", "code", "", "message", "throwable", "", "userInfo", "Lcom/facebook/react/bridge/WritableMap;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Lcom/facebook/react/bridge/WritableMap;)V", "getCode", "()Ljava/lang/String;", "getMessage", "getThrowable", "()Ljava/lang/Throwable;", "getUserInfo", "()Lcom/facebook/react/bridge/WritableMap;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "react_utilities_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Rejection {
        private final String code;
        private final String message;
        private final Throwable throwable;
        private final WritableMap userInfo;

        public Rejection(String str, String str2, Throwable th2, WritableMap writableMap) {
            this.code = str;
            this.message = str2;
            this.throwable = th2;
            this.userInfo = writableMap;
        }

        public static /* synthetic */ Rejection copy$default(Rejection rejection, String str, String str2, Throwable th2, WritableMap writableMap, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = rejection.code;
            }
            if ((i7 & 2) != 0) {
                str2 = rejection.message;
            }
            if ((i7 & 4) != 0) {
                th2 = rejection.throwable;
            }
            if ((i7 & 8) != 0) {
                writableMap = rejection.userInfo;
            }
            return rejection.copy(str, str2, th2, writableMap);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getCode() {
            return this.code;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Throwable getThrowable() {
            return this.throwable;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final WritableMap getUserInfo() {
            return this.userInfo;
        }

        @NotNull
        public final Rejection copy(String code, String message, Throwable throwable, WritableMap userInfo) {
            return new Rejection(code, message, throwable, userInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Rejection)) {
                return false;
            }
            Rejection rejection = (Rejection) other;
            return Intrinsics.areEqual(this.code, rejection.code) && Intrinsics.areEqual(this.message, rejection.message) && Intrinsics.areEqual(this.throwable, rejection.throwable) && Intrinsics.areEqual(this.userInfo, rejection.userInfo);
        }

        public final String getCode() {
            return this.code;
        }

        public final String getMessage() {
            return this.message;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }

        public final WritableMap getUserInfo() {
            return this.userInfo;
        }

        public int hashCode() {
            String str = this.code;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.message;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Throwable th2 = this.throwable;
            int iHashCode3 = (iHashCode2 + (th2 == null ? 0 : th2.hashCode())) * 31;
            WritableMap writableMap = this.userInfo;
            return iHashCode3 + (writableMap != null ? writableMap.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.code;
            String str2 = this.message;
            Throwable th2 = this.throwable;
            WritableMap writableMap = this.userInfo;
            StringBuilder sbU = e.u("Rejection(code=", str, ", message=", str2, ", throwable=");
            sbU.append(th2);
            sbU.append(", userInfo=");
            sbU.append(writableMap);
            sbU.append(")");
            return sbU.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PromiseWrapper(@NotNull Promise promise, @NotNull Function1<Object, ? extends Object> resolveTransform, @NotNull Function1<? super Rejection, Rejection> rejectTransform) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        Intrinsics.checkNotNullParameter(resolveTransform, "resolveTransform");
        Intrinsics.checkNotNullParameter(rejectTransform, "rejectTransform");
        this.promise = promise;
        this.resolveTransform = resolveTransform;
        this.rejectTransform = rejectTransform;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object _init_$lambda$0(Object obj) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rejection _init_$lambda$1(Rejection it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it;
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(String code, String message) {
        Rejection rejection = (Rejection) this.rejectTransform.invoke(new Rejection(code, message, null, null));
        this.promise.reject(rejection.getCode(), rejection.getMessage());
    }

    @Override // com.facebook.react.bridge.Promise
    public void resolve(Object value) {
        this.promise.resolve(this.resolveTransform.invoke(value));
    }

    public /* synthetic */ PromiseWrapper(Promise promise, Function1 function1, Function1 function2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(promise, (i7 & 2) != 0 ? new n6.e(2) : function1, (i7 & 4) != 0 ? new n6.e(3) : function2);
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(String code, Throwable throwable) {
        Rejection rejection = (Rejection) this.rejectTransform.invoke(new Rejection(code, null, throwable, null));
        this.promise.reject(rejection.getCode(), rejection.getThrowable());
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(String code, String message, Throwable throwable) {
        Rejection rejection = (Rejection) this.rejectTransform.invoke(new Rejection(code, message, throwable, null));
        this.promise.reject(rejection.getCode(), rejection.getMessage(), rejection.getThrowable());
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(@NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Rejection rejection = (Rejection) this.rejectTransform.invoke(new Rejection(null, null, throwable, null));
        Promise promise = this.promise;
        Throwable throwable2 = rejection.getThrowable();
        Intrinsics.checkNotNull(throwable2);
        promise.reject(throwable2);
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(@NotNull Throwable throwable, @NotNull WritableMap userInfo) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
        Rejection rejection = (Rejection) this.rejectTransform.invoke(new Rejection(null, null, throwable, userInfo));
        Promise promise = this.promise;
        Throwable throwable2 = rejection.getThrowable();
        Intrinsics.checkNotNull(throwable2);
        WritableMap userInfo2 = rejection.getUserInfo();
        Intrinsics.checkNotNull(userInfo2);
        promise.reject(throwable2, userInfo2);
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(String code, @NotNull WritableMap userInfo) {
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
        Rejection rejection = (Rejection) this.rejectTransform.invoke(new Rejection(code, null, null, userInfo));
        Promise promise = this.promise;
        String code2 = rejection.getCode();
        WritableMap userInfo2 = rejection.getUserInfo();
        Intrinsics.checkNotNull(userInfo2);
        promise.reject(code2, userInfo2);
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(String code, Throwable throwable, @NotNull WritableMap userInfo) {
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
        Rejection rejection = (Rejection) this.rejectTransform.invoke(new Rejection(code, null, throwable, userInfo));
        Promise promise = this.promise;
        String code2 = rejection.getCode();
        Throwable throwable2 = rejection.getThrowable();
        WritableMap userInfo2 = rejection.getUserInfo();
        Intrinsics.checkNotNull(userInfo2);
        promise.reject(code2, throwable2, userInfo2);
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(String code, String message, @NotNull WritableMap userInfo) {
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
        Rejection rejection = (Rejection) this.rejectTransform.invoke(new Rejection(null, message, null, userInfo));
        Promise promise = this.promise;
        String code2 = rejection.getCode();
        String message2 = rejection.getMessage();
        WritableMap userInfo2 = rejection.getUserInfo();
        Intrinsics.checkNotNull(userInfo2);
        promise.reject(code2, message2, userInfo2);
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Rejection rejection = (Rejection) this.rejectTransform.invoke(new Rejection(null, message, null, null));
        Promise promise = this.promise;
        String message2 = rejection.getMessage();
        Intrinsics.checkNotNull(message2);
        promise.reject(message2);
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(String code, String message, Throwable throwable, WritableMap userInfo) {
        Rejection rejection = (Rejection) this.rejectTransform.invoke(new Rejection(code, message, throwable, userInfo));
        this.promise.reject(rejection.getCode(), rejection.getMessage(), rejection.getThrowable(), rejection.getUserInfo());
    }
}
