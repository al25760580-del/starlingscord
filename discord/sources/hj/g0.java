package hj;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f0 f10832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f0 f10833b;

    static {
        f0 f0Var = null;
        try {
            f0Var = (f0) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f10832a = f0Var;
        f10833b = new f0();
    }
}
