package ue;

import af.r;
import af.w;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Build;
import android.os.Looper;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.RevocationBoundService;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import org.json.JSONException;
import ye.p;
import ze.o;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends bg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f21118g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f21119h;

    public l(RevocationBoundService revocationBoundService) {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService", 5);
        this.f21119h = revocationBoundService;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // bg.a
    public final boolean x(int i7, Parcel parcel, Parcel parcel2) {
        BasePendingResult basePendingResult;
        BasePendingResult basePendingResult2;
        String strD;
        int i10 = this.f21118g;
        Object obj = this.f21119h;
        switch (i10) {
            case 0:
                RevocationBoundService revocationBoundService = (RevocationBoundService) obj;
                if (i7 == 1) {
                    z();
                    b bVarA = b.a(revocationBoundService);
                    GoogleSignInAccount googleSignInAccountB = bVarA.b();
                    GoogleSignInOptions googleSignInOptionsH = GoogleSignInOptions.H;
                    if (googleSignInAccountB != null) {
                        String strD2 = bVarA.d("defaultGoogleSignInAccount");
                        if (TextUtils.isEmpty(strD2) || (strD = bVarA.d(b.f("googleSignInOptions", strD2))) == null) {
                            googleSignInOptionsH = null;
                        } else {
                            try {
                                googleSignInOptionsH = GoogleSignInOptions.h(strD);
                            } catch (JSONException unused) {
                                googleSignInOptionsH = null;
                            }
                        }
                    }
                    GoogleSignInOptions googleSignInOptions = googleSignInOptionsH;
                    w.g(googleSignInOptions);
                    kf.h hVar = new kf.h((RevocationBoundService) obj, null, qe.a.f18785a, googleSignInOptions, new ye.h(new kh.f(21), Looper.getMainLooper()));
                    Context context = hVar.f23301a;
                    o oVar = hVar.f23308h;
                    if (googleSignInAccountB != null) {
                        boolean z5 = hVar.c() == 3;
                        a1.d dVar = h.f21115a;
                        if (dVar.f17e <= 3) {
                            Log.d((String) dVar.f18i, ((String) dVar.f19v).concat("Revoking access"));
                        }
                        String strD3 = b.a(context).d("refreshToken");
                        h.a(context);
                        if (!z5) {
                            g gVar = new g(oVar, 1);
                            oVar.a(gVar);
                            basePendingResult2 = gVar;
                        } else if (strD3 == null) {
                            a1.d dVar2 = c.f21100i;
                            Status status = new Status(4, null, null, null);
                            w.a("Status code must not be SUCCESS", !false);
                            p pVar = new p(status);
                            pVar.setResult(status);
                            basePendingResult2 = pVar;
                        } else {
                            c cVar = new c(strD3);
                            new Thread(cVar).start();
                            basePendingResult2 = cVar.f21102e;
                        }
                        basePendingResult2.addStatusListener(new r(basePendingResult2, new ig.g(), new kh.f(1)));
                    } else {
                        boolean z6 = hVar.c() == 3;
                        a1.d dVar3 = h.f21115a;
                        if (dVar3.f17e <= 3) {
                            Log.d((String) dVar3.f18i, ((String) dVar3.f19v).concat("Signing out"));
                        }
                        h.a(context);
                        if (z6) {
                            ze.j jVar = new ze.j(oVar);
                            jVar.setResult(Status.f5933w);
                            basePendingResult = jVar;
                        } else {
                            g gVar2 = new g(oVar, 0);
                            oVar.a(gVar2);
                            basePendingResult = gVar2;
                        }
                        basePendingResult.addStatusListener(new r(basePendingResult, new ig.g(), new kh.f(1)));
                    }
                } else {
                    if (i7 != 2) {
                        return false;
                    }
                    z();
                    i.t(revocationBoundService).u();
                }
                return true;
            default:
                if (i7 != 1) {
                    return false;
                }
                Status status2 = (Status) uf.f.a(parcel, Status.CREATOR);
                re.f fVar = (re.f) uf.f.a(parcel, re.f.CREATOR);
                uf.f.b(parcel);
                ls.l.z(status2, fVar, (ig.g) obj);
                return true;
        }
    }

    public void z() {
        RevocationBoundService revocationBoundService = (RevocationBoundService) this.f21119h;
        int callingUid = Binder.getCallingUid();
        hf.b bVarA = hf.c.a(revocationBoundService);
        bVarA.getClass();
        try {
            AppOpsManager appOpsManager = (AppOpsManager) bVarA.f10726a.getSystemService("appops");
            if (appOpsManager == null) {
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager.checkPackage(callingUid, "com.google.android.gms");
            try {
                PackageInfo packageInfo = revocationBoundService.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                xe.j jVarA = xe.j.a(revocationBoundService);
                jVarA.getClass();
                if (packageInfo != null) {
                    if (xe.j.b(packageInfo, false)) {
                        return;
                    }
                    if (xe.j.b(packageInfo, true)) {
                        Context context = jVarA.f22931a;
                        try {
                            if (!xe.i.f22927c) {
                                PackageInfo packageInfo2 = hf.c.a(context).f10726a.getPackageManager().getPackageInfo("com.google.android.gms", Build.VERSION.SDK_INT >= 28 ? 134217792 : 64);
                                xe.j.a(context);
                                if (packageInfo2 == null || xe.j.b(packageInfo2, false) || !xe.j.b(packageInfo2, true)) {
                                    xe.i.f22926b = false;
                                } else {
                                    xe.i.f22926b = true;
                                }
                            }
                        } catch (PackageManager.NameNotFoundException e10) {
                            Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e10);
                        } finally {
                            xe.i.f22927c = true;
                        }
                        if (xe.i.f22926b || !"user".equals(Build.TYPE)) {
                            return;
                        } else {
                            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                        }
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
                if (Log.isLoggable("UidVerifier", 3)) {
                    Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
                }
            }
            throw new SecurityException(s0.g.d(Binder.getCallingUid(), "Calling UID ", " is not Google Play services."));
        } catch (SecurityException unused2) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ig.g gVar) {
        super("com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback", 5);
        this.f21119h = gVar;
    }
}
