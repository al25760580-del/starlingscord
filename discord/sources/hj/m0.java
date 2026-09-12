package hj;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l0 f10882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l0 f10883b;

    static {
        l0 l0Var = null;
        try {
            l0Var = (l0) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f10882a = l0Var;
        f10883b = new l0();
    }
}
