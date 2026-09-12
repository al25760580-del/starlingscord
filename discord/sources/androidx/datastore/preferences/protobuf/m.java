package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f1885a = new l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f1886b;

    static {
        l lVar = null;
        try {
            lVar = (l) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f1886b = lVar;
    }
}
