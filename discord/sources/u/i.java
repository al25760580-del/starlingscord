package u;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class i implements kotlin.coroutines.f, v {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ i f20887e = new i(0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final i f20888i = new i(1);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final i f20889v = new i(2);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final i f20890w = new i(3);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f20891d;

    public /* synthetic */ i(int i7) {
        this.f20891d = i7;
    }

    @Override // u.v
    public boolean a(Object obj, Object obj2) {
        switch (this.f20891d) {
            case 1:
                return false;
            case 2:
                return obj == obj2;
            default:
                return Intrinsics.areEqual(obj, obj2);
        }
    }

    public String toString() {
        switch (this.f20891d) {
            case 1:
                return "NeverEqualPolicy";
            case 2:
                return "ReferentialEqualityPolicy";
            case 3:
                return "StructuralEqualityPolicy";
            case 4:
                return "Empty";
            default:
                return super.toString();
        }
    }
}
