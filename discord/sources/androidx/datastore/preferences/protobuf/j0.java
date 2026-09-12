package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i0 f1878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i0 f1879b;

    static {
        i0 i0Var = null;
        try {
            i0Var = (i0) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f1878a = i0Var;
        f1879b = new i0();
    }
}
