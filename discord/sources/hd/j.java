package hd;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j implements cd.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f10570d;

    public j(String str) {
        this.f10570d = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f10570d;
    }
}
