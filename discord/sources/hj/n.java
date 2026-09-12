package hj;

/* JADX INFO: loaded from: classes3.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f10884a = new m();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m f10885b;

    static {
        m mVar = null;
        try {
            mVar = (m) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f10885b = mVar;
    }
}
