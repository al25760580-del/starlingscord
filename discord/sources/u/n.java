package u;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class n extends y.g implements Parcelable, l {

    @NotNull
    public static final Parcelable.Creator<n> CREATOR = new m();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v f20892d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public u f20893e;

    public n(Object obj, v vVar) {
        new x.a(0);
        this.f20892d = vVar;
        y.c cVarB = y.f.b();
        u uVar = new u(cVarB.e(), obj);
        if (!(cVarB instanceof y.a)) {
            uVar.f23120b = new u(1, obj);
        }
        this.f20893e = uVar;
    }

    @Override // y.g
    public final y.h a() {
        return this.f20893e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // u.x
    public final Object getValue() {
        return ((u) y.f.f(this.f20893e, this)).f20900c;
    }

    @Override // y.g
    public final void h(y.h hVar) {
        Intrinsics.checkNotNull(hVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        this.f20893e = (u) hVar;
    }

    @Override // u.l
    public final void setValue(Object obj) {
        y.c cVarB;
        y.h hVarD;
        y.h hVar;
        u uVar = (u) y.f.a(this.f20893e);
        if (this.f20892d.a(uVar.f20900c, obj)) {
            return;
        }
        u uVar2 = this.f20893e;
        synchronized (y.f.f23112b) {
            cVarB = y.f.b();
            if (cVarB.d()) {
                cVarB.h(this);
            }
            long jE = cVarB.e();
            if (uVar.f23119a == jE) {
                hVar = uVar;
            } else {
                synchronized (y.f.f23112b) {
                    hVarD = y.f.d(uVar2, this);
                }
                hVarD.f23119a = jE;
                if (uVar.f23119a != 1) {
                    cVarB.h(this);
                }
                hVar = hVarD;
            }
            ((u) hVar).f20900c = obj;
            Unit unit = Unit.f14616a;
        }
        cVarB.i(cVarB.f() + 1);
        Function1 function1G = cVarB.g();
        if (function1G != null) {
            function1G.invoke(this);
        }
    }

    public final String toString() {
        return "MutableState(value=" + ((u) y.f.a(this.f20893e)).f20900c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int i10;
        parcel.writeValue(getValue());
        i iVar = i.f20888i;
        Intrinsics.checkNotNull(iVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.neverEqualPolicy>");
        v vVar = this.f20892d;
        if (Intrinsics.areEqual(vVar, iVar)) {
            i10 = 0;
        } else {
            i iVar2 = i.f20890w;
            Intrinsics.checkNotNull(iVar2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
            if (Intrinsics.areEqual(vVar, iVar2)) {
                i10 = 1;
            } else {
                i iVar3 = i.f20889v;
                Intrinsics.checkNotNull(iVar3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.referentialEqualityPolicy>");
                if (!Intrinsics.areEqual(vVar, iVar3)) {
                    throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
                }
                i10 = 2;
            }
        }
        parcel.writeInt(i10);
    }
}
