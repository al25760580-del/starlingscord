package ze;

import ag.p1;
import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import io.sentry.h4;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class v extends gg.c implements ye.j, ye.k {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final p1 f23973n = fg.b.f9164a;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Context f23974g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Handler f23975h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p1 f23976i;
    public final Set j;
    public final af.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public gg.a f23977l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public h4 f23978m;

    public v(Context context, eg.a aVar, af.c cVar) {
        super("com.google.android.gms.signin.internal.ISignInCallbacks", 6);
        this.f23974g = context;
        this.f23975h = aVar;
        this.k = cVar;
        this.j = (Set) cVar.f393d;
        this.f23976i = f23973n;
    }

    @Override // ye.k
    public final void j(xe.b bVar) {
        this.f23978m.A(bVar);
    }

    @Override // ye.j
    public final void k(int i7) {
        h4 h4Var = this.f23978m;
        m mVar = (m) ((e) h4Var.f12715f).G.get((a) h4Var.f12712c);
        if (mVar != null) {
            if (mVar.f23951n) {
                mVar.o(new xe.b(17, null, null));
            } else {
                mVar.k(i7);
            }
        }
    }

    @Override // ye.j
    public final void onConnected() {
        gg.a aVar = this.f23977l;
        aVar.getClass();
        boolean z5 = false;
        try {
            aVar.W.getClass();
            Account account = new Account("<<default account>>", "com.google");
            GoogleSignInAccount googleSignInAccountB = "<<default account>>".equals(account.name) ? ue.b.a(aVar.f421i).b() : null;
            Integer num = aVar.Y;
            af.w.g(num);
            af.s sVar = new af.s(2, account, num.intValue(), googleSignInAccountB);
            gg.d dVar = (gg.d) aVar.o();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(dVar.f3676h);
            int i7 = wf.a.f22223a;
            parcelObtain.writeInt(1);
            int iT = ls.d.T(20293, parcelObtain);
            ls.d.S(parcelObtain, 1, 4);
            parcelObtain.writeInt(1);
            ls.d.N(parcelObtain, 2, sVar, 0);
            ls.d.U(iT, parcelObtain);
            parcelObtain.writeStrongBinder(this);
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                dVar.f3675g.transact(12, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
            } finally {
                parcelObtain.recycle();
                parcelObtain2.recycle();
            }
        } catch (RemoteException e10) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                this.f23975h.post(new hi.o(this, new gg.f(1, new xe.b(8, null, null), null), 26, z5));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e10);
            }
        }
    }
}
