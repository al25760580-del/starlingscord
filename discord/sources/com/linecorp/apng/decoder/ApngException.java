package com.linecorp.apng.decoder;

import a3.e;
import com.facebook.imagepipeline.nativecode.b;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import rn.n;
import yn.a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0012B\u001d\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/linecorp/apng/decoder/ApngException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lcom/linecorp/apng/decoder/ApngException$ErrorCode;", "errorCode", "", "throwable", "<init>", "(Lcom/linecorp/apng/decoder/ApngException$ErrorCode;Ljava/lang/Throwable;)V", "(Ljava/lang/Throwable;)V", "d", "Lcom/linecorp/apng/decoder/ApngException$ErrorCode;", "getErrorCode", "()Lcom/linecorp/apng/decoder/ApngException$ErrorCode;", "", "getMessage", "()Ljava/lang/String;", "message", "ErrorCode", "apng-drawable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ApngException extends Exception {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final ErrorCode errorCode;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.linecorp.apng.decoder.ApngException$ErrorCode[], still in use, count: 1, list:
      (r0v1 com.linecorp.apng.decoder.ApngException$ErrorCode[]) from 0x0073: INVOKE (r0v1 com.linecorp.apng.decoder.ApngException$ErrorCode[]) STATIC call: com.facebook.imagepipeline.nativecode.b.l(java.lang.Enum[]):yn.a A[MD:(java.lang.Enum[]):yn.a (m), WRAPPED] (LINE:116)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/linecorp/apng/decoder/ApngException$ErrorCode;", "", "", "d", "I", "getErrorCode", "()I", "errorCode", "Companion", "ERR_STREAM_READ_FAIL", "ERR_UNEXPECTED_EOF", "ERR_INVALID_FILE_FORMAT", "ERR_NOT_EXIST_IMAGE", "ERR_FRAME_INDEX_OUT_OF_RANGE", "ERR_OUT_OF_MEMORY", "ERR_BITMAP_OPERATION", "ERR_UNSUPPORTED_TYPE", "ERR_WITH_CHILD_EXCEPTION", "apng-drawable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ErrorCode {
        ERR_STREAM_READ_FAIL(-100),
        ERR_UNEXPECTED_EOF(-101),
        ERR_INVALID_FILE_FORMAT(-102),
        ERR_NOT_EXIST_IMAGE(-103),
        ERR_FRAME_INDEX_OUT_OF_RANGE(-104),
        ERR_OUT_OF_MEMORY(-105),
        ERR_BITMAP_OPERATION(-106),
        ERR_UNSUPPORTED_TYPE(-107),
        ERR_WITH_CHILD_EXCEPTION(-200);


        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ a f6886i;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public final int errorCode;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/linecorp/apng/decoder/ApngException$ErrorCode$Companion;", "", "", "errorCode", "Lcom/linecorp/apng/decoder/ApngException$ErrorCode;", "fromErrorCode$apng_drawable_release", "(I)Lcom/linecorp/apng/decoder/ApngException$ErrorCode;", "fromErrorCode", "apng-drawable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @SourceDebugExtension({"SMAP\nApngException.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ApngException.kt\ncom/linecorp/apng/decoder/ApngException$ErrorCode$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,102:1\n1137#2,2:103\n*S KotlinDebug\n*F\n+ 1 ApngException.kt\ncom/linecorp/apng/decoder/ApngException$ErrorCode$Companion\n*L\n98#1:103,2\n*E\n"})
        public static final class Companion {
            public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            @NotNull
            public final ErrorCode fromErrorCode$apng_drawable_release(int errorCode) {
                for (ErrorCode errorCode2 : ErrorCode.values()) {
                    if (errorCode2.getErrorCode() == errorCode) {
                        return errorCode2;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
        }

        static {
            f6886i = b.l(new ErrorCode[]{r0, r1, r2, r3, r4, r5, r6, r7, r8});
        }

        public ErrorCode(int i7) {
            super(str, i);
            this.errorCode = i7;
        }

        @NotNull
        public static EnumEntries getEntries() {
            return f6886i;
        }

        public static ErrorCode valueOf(String str) {
            return (ErrorCode) Enum.valueOf(ErrorCode.class, str);
        }

        public static ErrorCode[] values() {
            return (ErrorCode[]) f6885e.clone();
        }

        public final int getErrorCode() {
            return this.errorCode;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ErrorCode.values().length];
            try {
                iArr[ErrorCode.ERR_STREAM_READ_FAIL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ErrorCode.ERR_UNEXPECTED_EOF.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ErrorCode.ERR_INVALID_FILE_FORMAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ErrorCode.ERR_NOT_EXIST_IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ErrorCode.ERR_FRAME_INDEX_OUT_OF_RANGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ErrorCode.ERR_OUT_OF_MEMORY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ErrorCode.ERR_BITMAP_OPERATION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ErrorCode.ERR_UNSUPPORTED_TYPE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ErrorCode.ERR_WITH_CHILD_EXCEPTION.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ ApngException(ErrorCode errorCode, Throwable th2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(errorCode, (i7 & 2) != 0 ? null : th2);
    }

    @NotNull
    public final ErrorCode getErrorCode() {
        return this.errorCode;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        switch (WhenMappings.$EnumSwitchMapping$0[this.errorCode.ordinal()]) {
            case 1:
                return "Can't read the stream.";
            case 2:
                return "Unexpected end of file.";
            case 3:
                return "Invalid file format.";
            case 4:
                return "Not exist native image.";
            case 5:
                return "Frame index is out of range.";
            case 6:
                return "Out of memory";
            case 7:
                return "Error in the native bitmap operation.";
            case 8:
                return "Unsupported image type.";
            case 9:
                Throwable cause = getCause();
                return e.l("Failed with sub exception : ", cause != null ? cause.getMessage() : null);
            default:
                throw new n();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApngException(@NotNull ErrorCode errorCode, Throwable th2) {
        super(th2);
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        this.errorCode = errorCode;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ApngException(@NotNull Throwable throwable) {
        this(ErrorCode.ERR_WITH_CHILD_EXCEPTION, throwable);
        Intrinsics.checkNotNullParameter(throwable, "throwable");
    }
}
