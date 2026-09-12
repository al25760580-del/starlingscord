package hj;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o f10807b = new o(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f10808a;

    public c0() {
        h0 h0Var;
        try {
            h0Var = (h0) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            h0Var = f10807b;
        }
        h0[] h0VarArr = {o.f10889b, h0Var};
        b0 b0Var = new b0();
        b0Var.f10804a = h0VarArr;
        Charset charset = t.f10906a;
        this.f10808a = b0Var;
    }
}
