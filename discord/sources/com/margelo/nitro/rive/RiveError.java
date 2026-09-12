package com.margelo.nitro.rive;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@xa.a
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/margelo/nitro/rive/RiveError;", "", "message", "", "type", "Lcom/margelo/nitro/rive/RiveErrorType;", "<init>", "(Ljava/lang/String;Lcom/margelo/nitro/rive/RiveErrorType;)V", "getMessage", "()Ljava/lang/String;", "getType", "()Lcom/margelo/nitro/rive/RiveErrorType;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "rive-app_react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class RiveError {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @xa.a
    @Keep
    @NotNull
    private final String message;

    @xa.a
    @Keep
    @NotNull
    private final RiveErrorType type;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/margelo/nitro/rive/RiveError$Companion;", "", "", "message", "Lcom/margelo/nitro/rive/RiveErrorType;", "type", "Lcom/margelo/nitro/rive/RiveError;", "fromCpp", "(Ljava/lang/String;Lcom/margelo/nitro/rive/RiveErrorType;)Lcom/margelo/nitro/rive/RiveError;", "rive-app_react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        /* JADX INFO: Access modifiers changed from: private */
        @xa.a
        @Keep
        public final RiveError fromCpp(String message, RiveErrorType type) {
            return new RiveError(message, type);
        }
    }

    public RiveError(@NotNull String message, @NotNull RiveErrorType type) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(type, "type");
        this.message = message;
        this.type = type;
    }

    public static /* synthetic */ RiveError copy$default(RiveError riveError, String str, RiveErrorType riveErrorType, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = riveError.message;
        }
        if ((i7 & 2) != 0) {
            riveErrorType = riveError.type;
        }
        return riveError.copy(str, riveErrorType);
    }

    @xa.a
    @Keep
    private static final RiveError fromCpp(String str, RiveErrorType riveErrorType) {
        return INSTANCE.fromCpp(str, riveErrorType);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final RiveErrorType getType() {
        return this.type;
    }

    @NotNull
    public final RiveError copy(@NotNull String message, @NotNull RiveErrorType type) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(type, "type");
        return new RiveError(message, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RiveError)) {
            return false;
        }
        RiveError riveError = (RiveError) other;
        return Intrinsics.areEqual(this.message, riveError.message) && this.type == riveError.type;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final RiveErrorType getType() {
        return this.type;
    }

    public int hashCode() {
        return this.type.hashCode() + (this.message.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "RiveError(message=" + this.message + ", type=" + this.type + ")";
    }
}
