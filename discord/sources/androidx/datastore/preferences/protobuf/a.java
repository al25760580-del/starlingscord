package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    protected int memoizedHashCode;

    public abstract int a();

    public final int b(v0 v0Var) {
        s sVar = (s) this;
        int i7 = sVar.memoizedSerializedSize;
        if (i7 != -1) {
            return i7;
        }
        int iE = v0Var.e(this);
        sVar.memoizedSerializedSize = iE;
        return iE;
    }

    public abstract void c(i iVar);
}
