package wh;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import ci.a0;
import ci.c0;
import ci.y;
import com.google.android.play.core.integrity.IntegrityTokenRequest;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends c0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f22270e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Long f22271i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ ig.g f22272v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ IntegrityTokenRequest f22273w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ g f22274x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, ig.g gVar2, byte[] bArr, Long l6, ig.g gVar3, IntegrityTokenRequest integrityTokenRequest) {
        super(gVar2);
        this.f22270e = bArr;
        this.f22271i = l6;
        this.f22272v = gVar3;
        this.f22273w = integrityTokenRequest;
        Objects.requireNonNull(gVar);
        this.f22274x = gVar;
    }

    @Override // ci.c0
    public final void a(Exception exc) {
        if (exc instanceof ci.e) {
            super.a(new a(-9, exc));
        } else {
            super.a(exc);
        }
    }

    @Override // ci.c0
    public final void b() {
        ig.g gVar = this.f22272v;
        g gVar2 = this.f22274x;
        try {
            a0 a0Var = (a0) gVar2.f22282e.f3696n;
            Bundle bundleA = g.a(gVar2, this.f22270e, this.f22271i);
            f fVar = new f(gVar2, gVar);
            y yVar = (y) a0Var;
            yVar.getClass();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(yVar.f3676h);
            int i7 = ci.s.f3722a;
            parcelObtain.writeInt(1);
            bundleA.writeToParcel(parcelObtain, 0);
            parcelObtain.writeStrongBinder(fVar);
            yVar.k(2, parcelObtain);
        } catch (RemoteException e10) {
            gVar2.f22278a.a(e10, "requestIntegrityToken(%s)", this.f22273w);
            gVar.c(new a(-100, e10));
        }
    }
}
