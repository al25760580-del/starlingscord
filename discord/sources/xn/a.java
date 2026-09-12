package xn;

import androidx.appcompat.widget.b3;
import com.facebook.react.devsupport.StackTraceHelper;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rn.q;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements Continuation, CoroutineStackFrame, Serializable {
    private final Continuation completion;

    public a(Continuation continuation) {
        this.completion = continuation;
    }

    @NotNull
    public Continuation create(@NotNull Continuation completion) {
        Intrinsics.checkNotNullParameter(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public CoroutineStackFrame getCallerFrame() {
        Continuation continuation = this.completion;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    public final Continuation getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        int iIntValue;
        String strC;
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        Intrinsics.checkNotNullParameter(this, "<this>");
        d dVar = (d) getClass().getAnnotation(d.class);
        String str = null;
        if (dVar == null) {
            return null;
        }
        int iV = dVar.v();
        if (iV > 1) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + iV + ". Please update the Kotlin standard library.").toString());
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            iIntValue = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            iIntValue = -1;
        }
        int i7 = iIntValue >= 0 ? dVar.l()[iIntValue] : -1;
        e.f22986a.getClass();
        Intrinsics.checkNotNullParameter(this, "continuation");
        b3 b3Var = e.f22988c;
        b3 b3Var2 = e.f22987b;
        if (b3Var == null) {
            try {
                b3 b3Var3 = new b3(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod(StackTraceHelper.NAME_KEY, null));
                e.f22988c = b3Var3;
                b3Var = b3Var3;
            } catch (Exception unused2) {
                e.f22988c = b3Var2;
                b3Var = b3Var2;
            }
        }
        if (b3Var != b3Var2 && (method = b3Var.f906a) != null && (objInvoke = method.invoke(getClass(), null)) != null && (method2 = b3Var.f907b) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
            Method method3 = b3Var.f908c;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
            if (objInvoke3 instanceof String) {
                str = (String) objInvoke3;
            }
        }
        if (str == null) {
            strC = dVar.c();
        } else {
            strC = str + '/' + dVar.c();
        }
        return new StackTraceElement(strC, dVar.m(), dVar.f(), i7);
    }

    public abstract Object invokeSuspend(Object obj);

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(@NotNull Object obj) {
        Continuation frame = this;
        while (true) {
            Intrinsics.checkNotNullParameter(frame, "frame");
            a aVar = (a) frame;
            Continuation continuation = aVar.completion;
            Intrinsics.checkNotNull(continuation);
            try {
                obj = aVar.invokeSuspend(obj);
                if (obj == wn.a.f22354d) {
                    return;
                } else {
                    q qVar = Result.f14614e;
                }
            } catch (Throwable th2) {
                q qVar2 = Result.f14614e;
                obj = ib.a.o(th2);
            }
            aVar.releaseIntercepted();
            if (!(continuation instanceof a)) {
                continuation.resumeWith(obj);
                return;
            }
            frame = continuation;
        }
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb2.append(stackTraceElement);
        return sb2.toString();
    }

    @NotNull
    public Continuation create(Object obj, @NotNull Continuation completion) {
        Intrinsics.checkNotNullParameter(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}
