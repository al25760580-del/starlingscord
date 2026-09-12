package bg;

import android.os.Parcelable;
import xe.d;
import ye.f;
import ye.g;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f3230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f3231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f3232c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d[] f3233d;

    static {
        d dVar = new d("GET_CREDENTIAL", 1L);
        f3230a = dVar;
        d dVar2 = new d("CREDENTIAL_REGISTRY", 1L);
        d dVar3 = new d("CLEAR_REGISTRY", 2L);
        d dVar4 = new d("CLEAR_CREATION_OPTIONS", 1L);
        d dVar5 = new d("CLEAR_CREDENTIAL_STATE", 1L);
        d dVar6 = new d("CREATE_CREDENTIAL", 3L);
        f3231b = dVar6;
        d dVar7 = new d("REGISTER_CREATION_OPTIONS", 1L);
        d dVar8 = new d("REGISTER_EXPORT", 1L);
        d dVar9 = new d("IMPORT_CREDENTIALS", 1L);
        d dVar10 = new d("SIGNAL_CREDENTIAL_STATE", 1L);
        f3232c = dVar10;
        f3233d = new d[]{dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8, dVar9, dVar10, new d("CLEAR_EXPORT", 1L), new d("IMPORT_CREDENTIALS_FOR_DEVICE_SETUP", 3L), new d("EXPORT_CREDENTIALS_TO_DEVICE_SETUP", 3L), new d("GET_CREDENTIAL_TRANSFER_CAPABILITIES", 3L)};
    }

    public static f a() {
        g gVar = new g(-1, -1, 0, true);
        Parcelable.Creator<f> creator = f.CREATOR;
        f fVar = new f(gVar, false);
        fVar.f23293i = false;
        return fVar;
    }
}
