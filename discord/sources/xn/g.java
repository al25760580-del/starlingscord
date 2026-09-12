package xn;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.FunctionBase;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g extends f implements FunctionBase {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f22989d;

    public g(int i7, Continuation continuation) {
        super(continuation);
        this.f22989d = i7;
    }

    @Override // kotlin.jvm.internal.FunctionBase
    public final int getArity() {
        return this.f22989d;
    }

    @Override // xn.a
    public final String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String strRenderLambdaToString = Reflection.renderLambdaToString(this);
        Intrinsics.checkNotNullExpressionValue(strRenderLambdaToString, "renderLambdaToString(...)");
        return strRenderLambdaToString;
    }
}
