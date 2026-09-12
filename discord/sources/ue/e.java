package ue;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import ze.m;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends af.f {
    public final GoogleSignInOptions V;

    public e(Context context, Looper looper, af.c cVar, GoogleSignInOptions googleSignInOptions, m mVar, m mVar2) {
        te.a aVar;
        super(context, looper, 91, cVar, mVar, mVar2, 0);
        Set<Scope> set = (Set) cVar.f394e;
        if (googleSignInOptions != null) {
            aVar = new te.a();
            aVar.f20726a = new HashSet();
            aVar.f20733h = new HashMap();
            aVar.f20726a = new HashSet(googleSignInOptions.f5903e);
            aVar.f20727b = googleSignInOptions.f5906w;
            aVar.f20728c = googleSignInOptions.f5907x;
            aVar.f20729d = googleSignInOptions.f5905v;
            aVar.f20730e = googleSignInOptions.f5908y;
            aVar.f20731f = googleSignInOptions.f5904i;
            aVar.f20732g = googleSignInOptions.E;
            aVar.f20733h = GoogleSignInOptions.i(googleSignInOptions.F);
            aVar.f20734i = googleSignInOptions.G;
        } else {
            aVar = new te.a();
            aVar.f20726a = new HashSet();
            aVar.f20733h = new HashMap();
        }
        aVar.f20734i = uf.e.a();
        if (!set.isEmpty()) {
            for (Scope scope : set) {
                HashSet hashSet = aVar.f20726a;
                hashSet.add(scope);
                hashSet.addAll(Arrays.asList(new Scope[0]));
            }
        }
        HashSet hashSet2 = aVar.f20726a;
        if (hashSet2.contains(GoogleSignInOptions.K)) {
            Scope scope2 = GoogleSignInOptions.J;
            if (hashSet2.contains(scope2)) {
                hashSet2.remove(scope2);
            }
        }
        if (aVar.f20729d && (aVar.f20731f == null || !hashSet2.isEmpty())) {
            hashSet2.add(GoogleSignInOptions.I);
        }
        this.V = new GoogleSignInOptions(3, new ArrayList(hashSet2), aVar.f20731f, aVar.f20729d, aVar.f20727b, aVar.f20728c, aVar.f20730e, aVar.f20732g, aVar.f20733h, aVar.f20734i);
    }

    @Override // af.f, ye.c
    public final int g() {
        return 12451000;
    }

    @Override // af.f
    public final IInterface l(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof k ? (k) iInterfaceQueryLocalInterface : new k(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService", 3);
    }

    @Override // af.f
    public final String p() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // af.f
    public final String q() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }
}
