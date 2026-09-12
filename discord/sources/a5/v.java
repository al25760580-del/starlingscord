package a5;

import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Binder;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.os.Process;
import android.text.TextUtils;
import androidx.core.app.Person;
import androidx.core.content.pm.ShortcutInfoCompat;
import com.android.billingclient.api.BillingResult;
import com.discord.misc.utilities.logThrottle.LogThrottleSingleton;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v implements Callable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f267d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f268e;

    public /* synthetic */ v(int i7, Object obj) {
        this.f267d = i7;
        this.f268e = obj;
    }

    /* JADX WARN: Code duplicated, block: B:128:0x0270 A[Catch: Exception -> 0x01f7, TryCatch #3 {Exception -> 0x01f7, blocks: (B:100:0x01e1, B:102:0x01ef, B:107:0x0203, B:110:0x0213, B:114:0x021d, B:116:0x0221, B:118:0x022c, B:120:0x023a, B:124:0x024b, B:125:0x0264, B:122:0x0242, B:126:0x0267, B:128:0x0270, B:129:0x0279, B:108:0x020f, B:105:0x01fa), top: B:146:0x01e1 }] */
    /* JADX WARN: Code duplicated, block: B:131:0x027e  */
    /* JADX WARN: Code duplicated, block: B:132:0x0287  */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle bundle;
        com.google.android.gms.internal.play_billing.d dVar;
        switch (this.f267d) {
            case 0:
                w wVar = (w) this.f268e;
                b bVar = wVar.f272v;
                synchronized (bVar.f148a) {
                    try {
                        if (bVar.f149b != 3) {
                            boolean z5 = true;
                            int i7 = 1;
                            int i10 = 0;
                            if (bVar.f149b != 1) {
                                z5 = false;
                            }
                            if (TextUtils.isEmpty(null)) {
                                bundle = null;
                            } else {
                                bundle = new Bundle();
                                bundle.putString("accountName", null);
                                com.google.android.gms.internal.play_billing.r.b(bundle, bVar.f151d, bVar.C.longValue());
                            }
                            synchronized (bVar.f148a) {
                                dVar = bVar.f156i;
                                break;
                            }
                            if (dVar == null) {
                                b bVar2 = wVar.f272v;
                                bVar2.E(0);
                                BillingResult billingResult = h0.f197h;
                                bVar2.D(107, billingResult);
                                wVar.d(billingResult);
                            } else {
                                String packageName = wVar.f272v.f154g.getPackageName();
                                try {
                                    com.google.android.gms.internal.play_billing.b bVar3 = (com.google.android.gms.internal.play_billing.b) dVar;
                                    if (bVar3.y(25, packageName, "inapp") == 0) {
                                        b bVar4 = wVar.f272v;
                                        Context context = bVar4.f154g;
                                        synchronized (l0.class) {
                                        }
                                        synchronized (l0.class) {
                                        }
                                        synchronized (l0.class) {
                                        }
                                        synchronized (l0.class) {
                                        }
                                        long jMin = 100;
                                        Exception e10 = null;
                                        while (true) {
                                            long j = i10;
                                            if (j <= 3) {
                                                try {
                                                    Boolean boolValueOf = Boolean.valueOf(z5);
                                                    Bundle bundle2 = new Bundle();
                                                    bundle2.putString("callingPackage", bVar4.f154g.getPackageName());
                                                    com.google.android.gms.internal.play_billing.r.b(bundle2, bVar4.f151d, bVar4.C.longValue());
                                                    if (bVar4.f171z != null) {
                                                        bundle2.putBoolean("enablePendingPurchases", true);
                                                    }
                                                    bVar3.H(bVar4.f154g.getPackageName(), bundle2, new y(bVar4, wVar, boolValueOf, i10));
                                                } catch (SecurityException e11) {
                                                    wVar.e(e11, z5, i10);
                                                } catch (Exception e12) {
                                                    e10 = e12;
                                                    if (j != 3) {
                                                        com.google.android.gms.internal.play_billing.r.i("BillingClient", a3.e.h(jMin, "Transient error during initialize(), retrying in ", "ms"), e10);
                                                        try {
                                                            Thread.sleep(jMin);
                                                            jMin = (long) Math.min(jMin * 2.0d, LogThrottleSingleton.RATE_LIMIT_ONE_MINUTE);
                                                            i10++;
                                                        } catch (InterruptedException e13) {
                                                            Thread.currentThread().interrupt();
                                                            wVar.e(e13, z5, i10);
                                                        }
                                                    } else {
                                                        wVar.e(e10, z5, i10);
                                                    }
                                                }
                                            }
                                        }
                                        wVar.e(e10, z5, i10);
                                    } else {
                                        int i11 = 29;
                                        int iY = 3;
                                        while (true) {
                                            if (i11 >= 3) {
                                                try {
                                                    com.google.android.gms.internal.play_billing.r.g("BillingClient", l0.U(i11, "trying subs apiVersion: "));
                                                    iY = bundle == null ? bVar3.y(i11, packageName, "subs") : bVar3.z(i11, packageName, "subs", bundle);
                                                    if (iY == 0) {
                                                        com.google.android.gms.internal.play_billing.r.g("BillingClient", l0.U(i11, "highestLevelSupportedForSubs: "));
                                                    } else {
                                                        i11--;
                                                    }
                                                } catch (Exception e14) {
                                                    wVar.f(e14, z5);
                                                }
                                            } else {
                                                i11 = 0;
                                            }
                                        }
                                        b bVar5 = wVar.f272v;
                                        bVar5.getClass();
                                        bVar5.k = i11 >= 3 ? z5 : false;
                                        if (i11 < 3) {
                                            com.google.android.gms.internal.play_billing.r.g("BillingClient", "In-app billing API does not support subscription on this device.");
                                            i7 = 9;
                                        }
                                        for (int i12 = 29; i12 >= 3; i12--) {
                                            com.google.android.gms.internal.play_billing.r.g("BillingClient", l0.U(i12, "trying inapp apiVersion: "));
                                            iY = bundle == null ? bVar3.y(i12, packageName, "inapp") : bVar3.z(i12, packageName, "inapp", bundle);
                                            if (iY == 0) {
                                                bVar5.f157l = i12;
                                                com.google.android.gms.internal.play_billing.r.g("BillingClient", "mHighestLevelSupportedForInApp: " + i12);
                                                b.q(bVar5, bVar5.f157l);
                                                if (bVar5.f157l < 3) {
                                                    com.google.android.gms.internal.play_billing.r.h("BillingClient", "In-app billing API version 3 is not supported on this device.");
                                                    i7 = 36;
                                                }
                                                b.r(bVar5, iY);
                                                if (iY == 0) {
                                                    wVar.c(0, z5);
                                                    wVar.d(h0.f196g);
                                                } else {
                                                    BillingResult billingResult2 = h0.f190a;
                                                    wVar.b(billingResult2, i7, null, z5, 0);
                                                    wVar.d(billingResult2);
                                                }
                                            }
                                        }
                                        b.q(bVar5, bVar5.f157l);
                                        if (bVar5.f157l < 3) {
                                            com.google.android.gms.internal.play_billing.r.h("BillingClient", "In-app billing API version 3 is not supported on this device.");
                                            i7 = 36;
                                        }
                                        b.r(bVar5, iY);
                                        if (iY == 0) {
                                            wVar.c(0, z5);
                                            wVar.d(h0.f196g);
                                        } else {
                                            BillingResult billingResult3 = h0.f190a;
                                            wVar.b(billingResult3, i7, null, z5, 0);
                                            wVar.d(billingResult3);
                                        }
                                    }
                                } catch (Exception e15) {
                                    wVar.f(e15, z5);
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return null;
            case 1:
                ArrayList arrayList = new ArrayList();
                Iterator it = ((s.d) ((f3.f) this.f268e).f8807b.values()).iterator();
                while (true) {
                    s.a aVar = (s.a) it;
                    if (!aVar.hasNext()) {
                        return arrayList;
                    }
                    ShortcutInfoCompat shortcutInfoCompat = ((f3.g) aVar.next()).f8815c;
                    ShortcutInfoCompat shortcutInfoCompat2 = new ShortcutInfoCompat();
                    shortcutInfoCompat2.f1543a = shortcutInfoCompat.f1543a;
                    shortcutInfoCompat2.f1544b = shortcutInfoCompat.f1544b;
                    Intent[] intentArr = shortcutInfoCompat.f1545c;
                    shortcutInfoCompat2.f1545c = (Intent[]) Arrays.copyOf(intentArr, intentArr.length);
                    shortcutInfoCompat2.f1546d = shortcutInfoCompat.f1546d;
                    shortcutInfoCompat2.f1547e = shortcutInfoCompat.f1547e;
                    shortcutInfoCompat2.f1548f = shortcutInfoCompat.f1548f;
                    shortcutInfoCompat2.f1549g = shortcutInfoCompat.f1549g;
                    shortcutInfoCompat2.f1550h = shortcutInfoCompat.f1550h;
                    shortcutInfoCompat2.k = shortcutInfoCompat.k;
                    shortcutInfoCompat2.f1552l = shortcutInfoCompat.f1552l;
                    shortcutInfoCompat2.f1553m = shortcutInfoCompat.f1553m;
                    Person[] personArr = shortcutInfoCompat.f1551i;
                    if (personArr != null) {
                        shortcutInfoCompat2.f1551i = (Person[]) Arrays.copyOf(personArr, personArr.length);
                    }
                    if (shortcutInfoCompat.j != null) {
                        shortcutInfoCompat2.j = new HashSet(shortcutInfoCompat.j);
                    }
                    PersistableBundle persistableBundle = shortcutInfoCompat.f1554n;
                    if (persistableBundle != null) {
                        shortcutInfoCompat2.f1554n = persistableBundle;
                    }
                    if (TextUtils.isEmpty(shortcutInfoCompat2.f1547e)) {
                        throw new IllegalArgumentException("Shortcut must have a non-empty label");
                    }
                    Intent[] intentArr2 = shortcutInfoCompat2.f1545c;
                    if (intentArr2 != null && intentArr2.length != 0) {
                        arrayList.add(shortcutInfoCompat2);
                    }
                }
                throw new IllegalArgumentException("Shortcut must have an intent");
            case 2:
                return BitmapFactory.decodeFile(((f3.g) this.f268e).f8814b);
            default:
                w2.a aVar2 = (w2.a) this.f268e;
                aVar2.f22002v.set(true);
                try {
                    Process.setThreadPriority(10);
                    aVar2.f22003w.d();
                    Binder.flushPendingCommands();
                    aVar2.a(null);
                    return null;
                } catch (Throwable th3) {
                    try {
                        aVar2.f22001i.set(true);
                        throw th3;
                    } catch (Throwable th4) {
                        aVar2.a(null);
                        throw th4;
                    }
                }
        }
    }
}
