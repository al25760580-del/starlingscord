package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o0 f1924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o0 f1925b;

    static {
        o0 o0Var = null;
        try {
            o0Var = (o0) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f1924a = o0Var;
        f1925b = new o0();
    }
}
