package fr;

import kotlin.Result;

/* JADX INFO: loaded from: classes3.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f9399a = 0;

    static {
        Object objO;
        Object objO2;
        Exception exc = new Exception();
        String simpleName = a.a.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            rn.q qVar = Result.f14614e;
            objO = xn.a.class.getCanonicalName();
        } catch (Throwable th2) {
            rn.q qVar2 = Result.f14614e;
            objO = ib.a.o(th2);
        }
        if (Result.a(objO) != null) {
            objO = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            objO2 = v.class.getCanonicalName();
        } catch (Throwable th3) {
            rn.q qVar3 = Result.f14614e;
            objO2 = ib.a.o(th3);
        }
        if (Result.a(objO2) != null) {
            objO2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
