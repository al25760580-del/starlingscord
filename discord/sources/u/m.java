package u;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class m implements Parcelable.ClassLoaderCreator {
    public static n a(Parcel parcel, ClassLoader classLoader) {
        i iVar;
        if (classLoader == null) {
            classLoader = m.class.getClassLoader();
        }
        Object value = parcel.readValue(classLoader);
        int i7 = parcel.readInt();
        if (i7 == 0) {
            iVar = i.f20888i;
            Intrinsics.checkNotNull(iVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.neverEqualPolicy>");
        } else if (i7 == 1) {
            iVar = i.f20890w;
            Intrinsics.checkNotNull(iVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        } else {
            if (i7 != 2) {
                throw new IllegalStateException(s0.g.d(i7, "Unsupported MutableState policy ", " was restored"));
            }
            iVar = i.f20889v;
            Intrinsics.checkNotNull(iVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.referentialEqualityPolicy>");
        }
        return new n(value, iVar);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return a(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        return new n[i7];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return a(parcel, null);
    }
}
