package kq;

import a5.i0;
import com.discord.misc.utilities.chat_view_types.ChatViewRecyclerTypes;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public class l implements o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f14787d = StringsKt.Z(l.class.getCanonicalName(), "");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f14788e = new b("NO_LOCKS", a.f14769d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f14789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f14790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f14791c;

    public l(String str) {
        this(str, new u4.b(new ReentrantLock()));
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0065  */
    public static /* synthetic */ void a(int i7) {
        String str = (i7 == 10 || i7 == 13 || i7 == 20 || i7 == 37) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i7 == 10 || i7 == 13 || i7 == 20 || i7 == 37) ? 2 : 3];
        if (i7 == 1 || i7 == 3 || i7 == 5) {
            objArr[0] = "exceptionHandlingStrategy";
        } else if (i7 != 6) {
            switch (i7) {
                case 8:
                    objArr[0] = "exceptionHandlingStrategy";
                    break;
                case 9:
                case 11:
                case 14:
                case 16:
                case 19:
                case 21:
                    objArr[0] = "compute";
                    break;
                case 10:
                case 13:
                case 20:
                case ChatViewRecyclerTypes.POLL_TEXT_AND_IMAGE /* 37 */:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager";
                    break;
                case 12:
                case 17:
                case 25:
                case 27:
                    objArr[0] = "onRecursiveCall";
                    break;
                case 15:
                case 18:
                case 22:
                    objArr[0] = "map";
                    break;
                case 23:
                case 24:
                case 26:
                case 28:
                case 30:
                case 31:
                case 32:
                case 34:
                    objArr[0] = "computable";
                    break;
                case 29:
                case 33:
                    objArr[0] = "postCompute";
                    break;
                case 35:
                    objArr[0] = "source";
                    break;
                case 36:
                    objArr[0] = "throwable";
                    break;
                default:
                    objArr[0] = "debugText";
                    break;
            }
        } else {
            objArr[0] = "lock";
        }
        if (i7 == 10 || i7 == 13) {
            objArr[1] = "createMemoizedFunction";
        } else if (i7 == 20) {
            objArr[1] = "createMemoizedFunctionWithNullableValues";
        } else if (i7 != 37) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager";
        } else {
            objArr[1] = "sanitizeStackTrace";
        }
        switch (i7) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "<init>";
                break;
            case 7:
            case 8:
                objArr[2] = "replaceExceptionHandling";
                break;
            case 9:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createMemoizedFunction";
                break;
            case 10:
            case 13:
            case 20:
            case ChatViewRecyclerTypes.POLL_TEXT_AND_IMAGE /* 37 */:
                break;
            case 19:
            case 21:
            case 22:
                objArr[2] = "createMemoizedFunctionWithNullableValues";
                break;
            case 23:
            case 24:
            case 25:
                objArr[2] = "createLazyValue";
                break;
            case 26:
            case 27:
                objArr[2] = "createRecursionTolerantLazyValue";
                break;
            case 28:
            case 29:
                objArr[2] = "createLazyValueWithPostCompute";
                break;
            case 30:
                objArr[2] = "createNullableLazyValue";
                break;
            case 31:
                objArr[2] = "createRecursionTolerantNullableLazyValue";
                break;
            case 32:
            case 33:
                objArr[2] = "createNullableLazyValueWithPostCompute";
                break;
            case 34:
                objArr[2] = "compute";
                break;
            case 35:
                objArr[2] = "recursionDetectedDefault";
                break;
            case 36:
                objArr[2] = "sanitizeStackTrace";
                break;
            default:
                objArr[2] = "createWithExceptionHandling";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i7 != 10 && i7 != 13 && i7 != 20 && i7 != 37) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static void f(AssertionError assertionError) {
        StackTraceElement[] stackTrace = assertionError.getStackTrace();
        int length = stackTrace.length;
        int i7 = 0;
        while (i7 < length) {
            if (!stackTrace[i7].getClassName().startsWith(f14787d)) {
                List listSubList = Arrays.asList(stackTrace).subList(i7, length);
                assertionError.setStackTrace((StackTraceElement[]) listSubList.toArray(new StackTraceElement[listSubList.size()]));
            }
            i7++;
        }
        i7 = -1;
        List listSubList2 = Arrays.asList(stackTrace).subList(i7, length);
        assertionError.setStackTrace((StackTraceElement[]) listSubList2.toArray(new StackTraceElement[listSubList2.size()]));
    }

    public final i b(Function0 function0) {
        return new i(this, function0);
    }

    public final e c(Function1 function1) {
        return new e(this, new ConcurrentHashMap(3, 1.0f, 2), function1, 1);
    }

    public final j d(Function1 function1) {
        return new j(this, new ConcurrentHashMap(3, 1.0f, 2), function1);
    }

    public i0 e(Object obj, String str) {
        String str2;
        StringBuilder sb2 = new StringBuilder("Recursion detected ");
        sb2.append(str);
        if (obj == null) {
            str2 = "";
        } else {
            str2 = "on input: " + obj;
        }
        sb2.append(str2);
        sb2.append(" under ");
        sb2.append(this);
        AssertionError assertionError = new AssertionError(sb2.toString());
        f(assertionError);
        throw assertionError;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append("@");
        sb2.append(Integer.toHexString(hashCode()));
        sb2.append(" (");
        return com.discord.chat.presentation.list.a.k(sb2, this.f14791c, ")");
    }

    public l(String str, n nVar) {
        a aVar = a.f14770e;
        this.f14789a = nVar;
        this.f14790b = aVar;
        this.f14791c = str;
    }
}
