package w9;

import android.util.Log;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import l1.c;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f22076a = new ArrayList(2);

    public final void a(String id2, Throwable th2, c cVar) {
        Intrinsics.checkNotNullParameter(id2, "id");
        ArrayList arrayList = this.f22076a;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            try {
                try {
                    ((a) arrayList.get(i7)).a(id2, th2, cVar);
                    Unit unit = Unit.f14616a;
                } catch (Exception e10) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onFailure", e10);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    public final void b(String id2, Object obj, c cVar) {
        Intrinsics.checkNotNullParameter(id2, "id");
        ArrayList arrayList = this.f22076a;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            try {
                try {
                    ((a) arrayList.get(i7)).b(id2, obj, cVar);
                    Unit unit = Unit.f14616a;
                } catch (Exception e10) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onFinalImageSet", e10);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    public final void c(String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        ArrayList arrayList = this.f22076a;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            try {
                try {
                    ((a) arrayList.get(i7)).c(id2);
                    Unit unit = Unit.f14616a;
                } catch (Exception e10) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onIntermediateImageFailed", e10);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    public final void d(String id2, Object obj) {
        Intrinsics.checkNotNullParameter(id2, "id");
        ArrayList arrayList = this.f22076a;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            try {
                try {
                    ((a) arrayList.get(i7)).d(id2, obj);
                    Unit unit = Unit.f14616a;
                } catch (Exception e10) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onIntermediateImageSet", e10);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    public final void e(String id2, c cVar) {
        Intrinsics.checkNotNullParameter(id2, "id");
        ArrayList arrayList = this.f22076a;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            try {
                try {
                    ((a) arrayList.get(i7)).e(id2, cVar);
                    Unit unit = Unit.f14616a;
                } catch (Exception e10) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onRelease", e10);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    public final void f(String id2, Object obj, c cVar) {
        Intrinsics.checkNotNullParameter(id2, "id");
        ArrayList arrayList = this.f22076a;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            try {
                try {
                    ((a) arrayList.get(i7)).f(id2, obj, cVar);
                    Unit unit = Unit.f14616a;
                } catch (Exception e10) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onSubmit", e10);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }
}
