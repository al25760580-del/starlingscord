package di;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements g {
    public abstract boolean a(char c8);

    @Override // di.g
    public final boolean apply(Object obj) {
        return a(((Character) obj).charValue());
    }
}
