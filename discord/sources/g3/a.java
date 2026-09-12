package g3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a implements f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9459d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f9460e;

    public a(String name, int i7) {
        this.f9459d = i7;
        switch (i7) {
            case 1:
                Intrinsics.checkNotNullParameter(name, "name");
                this.f9460e = name;
                break;
            default:
                Intrinsics.checkNotNullParameter(name, "query");
                Intrinsics.checkNotNullParameter(name, "query");
                this.f9460e = name;
                break;
        }
    }

    @Override // g3.f
    public String c() {
        return this.f9460e;
    }

    @Override // g3.f
    public void f(e statement) {
        Intrinsics.checkNotNullParameter(statement, "statement");
        Intrinsics.checkNotNullParameter(statement, "statement");
    }

    public String toString() {
        switch (this.f9459d) {
            case 1:
                return this.f9460e;
            default:
                return super.toString();
        }
    }
}
