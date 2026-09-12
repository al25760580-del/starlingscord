package a5;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Parcel;
import android.text.TextUtils;
import com.android.billingclient.api.BillingResult;
import com.discord.billing.BillingManager;
import com.google.android.gms.internal.play_billing.b3;
import com.google.android.gms.internal.play_billing.d3;
import com.google.android.gms.internal.play_billing.k1;
import com.google.android.gms.internal.play_billing.o3;
import com.google.android.gms.internal.play_billing.p3;
import java.net.URL;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s implements Callable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f257d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f258e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f259i;

    public /* synthetic */ s(b bVar, BillingManager.C01061.C00181.C00191 c00191) {
        this.f257d = 0;
        this.f258e = bVar;
        this.f259i = c00191;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        com.google.android.gms.internal.play_billing.d dVar;
        Bitmap bitmapDecodeStream;
        switch (this.f257d) {
            case 0:
                b bVar = (b) this.f258e;
                BillingManager.C01061.C00181.C00191 c00191 = (BillingManager.C01061.C00181.C00191) this.f259i;
                bVar.getClass();
                try {
                    if (!bVar.H(com.facebook.imagepipeline.nativecode.b.f4924c)) {
                        com.google.android.gms.internal.play_billing.r.h("BillingClient", "Service disconnected.");
                        BillingResult billingResult = h0.f197h;
                        bVar.u(2, 13, billingResult);
                        c00191.onBillingConfigResponse(billingResult, null);
                    } else if (bVar.f164s) {
                        synchronized (bVar.f148a) {
                            dVar = bVar.f156i;
                            break;
                        }
                        if (dVar == null) {
                            bVar.A(c00191, h0.f197h, 107, null);
                        } else if (com.facebook.imagepipeline.nativecode.b.f4923b && bVar.f168w) {
                            String str = bVar.f150c;
                            k1 k1VarR = c9.a.R(bVar.f154g);
                            b3 b3VarR = d3.r();
                            o3 o3VarR = p3.r();
                            if (!o3VarR.f5994e.h()) {
                                o3VarR.d();
                            }
                            p3.t((p3) o3VarR.f5994e, str);
                            p3 p3Var = (p3) o3VarR.a();
                            if (!b3VarR.f5994e.h()) {
                                b3VarR.d();
                            }
                            d3.s((d3) b3VarR.f5994e).put("PLAY_BILLING_LIBRARY_VERSION", p3Var);
                            o3 o3VarR2 = p3.r();
                            String packageName = bVar.f154g.getPackageName();
                            if (!o3VarR2.f5994e.h()) {
                                o3VarR2.d();
                            }
                            p3.t((p3) o3VarR2.f5994e, packageName);
                            p3 p3Var2 = (p3) o3VarR2.a();
                            if (!b3VarR.f5994e.h()) {
                                b3VarR.d();
                            }
                            d3.s((d3) b3VarR.f5994e).put("CALLING_PACKAGE", p3Var2);
                            Bundle bundleP = c9.a.P(k1VarR, (d3) b3VarR.a());
                            if (!TextUtils.isEmpty(null)) {
                                bundleP.putString("accountName", null);
                            }
                            x xVar = new x(c00191, bVar.f155h, bVar.f157l, 1);
                            com.google.android.gms.internal.play_billing.b bVar2 = (com.google.android.gms.internal.play_billing.b) dVar;
                            Parcel parcelV = bVar2.v();
                            int i7 = com.google.android.gms.internal.play_billing.e.f5997a;
                            parcelV.writeInt(1);
                            bundleP.writeToParcel(parcelV, 0);
                            parcelV.writeStrongBinder(xVar);
                            bVar2.x(2001, parcelV);
                        } else {
                            String packageName2 = bVar.f154g.getPackageName();
                            String str2 = bVar.f151d;
                            long jLongValue = bVar.C.longValue();
                            int i10 = com.google.android.gms.internal.play_billing.r.f6105a;
                            Bundle bundle = new Bundle();
                            com.google.android.gms.internal.play_billing.r.b(bundle, str2, jLongValue);
                            if (!TextUtils.isEmpty(null)) {
                                bundle.putString("accountName", null);
                            }
                            ((com.google.android.gms.internal.play_billing.b) dVar).G(packageName2, bundle, new x(c00191, bVar.f155h, bVar.f157l, 0));
                        }
                    } else {
                        com.google.android.gms.internal.play_billing.r.h("BillingClient", "Current client doesn't support get billing config.");
                        BillingResult billingResult2 = h0.f202o;
                        bVar.u(32, 13, billingResult2);
                        c00191.onBillingConfigResponse(billingResult2, null);
                    }
                } catch (DeadObjectException e10) {
                    bVar.A(c00191, h0.f197h, 62, e10);
                } catch (Exception e11) {
                    bVar.A(c00191, h0.f195f, 62, e11);
                }
                return null;
            case 1:
                return (f3.g) ((f3.f) this.f259i).f8807b.get((String) this.f258e);
            default:
                ml.a aVar = (ml.a) this.f259i;
                String str3 = (String) this.f258e;
                try {
                    if (str3.startsWith("http://") || str3.startsWith("https://") || str3.startsWith("file://") || str3.startsWith("asset://") || str3.startsWith("data:")) {
                        bitmapDecodeStream = BitmapFactory.decodeStream(new URL(str3).openStream());
                    } else {
                        bitmapDecodeStream = BitmapFactory.decodeResource(aVar.getResources(), aVar.getResources().getIdentifier(str3, "drawable", aVar.getContext().getPackageName()));
                    }
                    return new BitmapDrawable(aVar.getResources(), bitmapDecodeStream);
                } catch (Exception e12) {
                    e12.printStackTrace();
                    return null;
                }
        }
    }

    public /* synthetic */ s(Object obj, String str, int i7) {
        this.f257d = i7;
        this.f259i = obj;
        this.f258e = str;
    }
}
