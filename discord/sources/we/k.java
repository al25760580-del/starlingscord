package we;

import a5.e0;
import a5.h0;
import a5.u;
import android.content.Context;
import android.util.Log;
import android.view.ViewGroup;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.rnfs.RNFSManager;
import e4.r;
import ig.l;
import ij.m;
import java.util.Formatter;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static k f22217f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f22219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f22220c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f22221d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f22222e;

    public /* synthetic */ k(int i7, int i10, Object obj, Object obj2, Object obj3) {
        this.f22218a = i10;
        this.f22219b = i7;
        this.f22220c = obj2;
        this.f22221d = obj3;
        this.f22222e = obj;
    }

    public static synchronized k e(Context context) {
        try {
            if (f22217f == null) {
                f22217f = new k(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new u("MessengerIpcClient", 1))));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f22217f;
    }

    public void a(r rVar) {
        if (rVar != null) {
            zj.d dVar = (zj.d) rVar;
            ae.b bVar = (ae.b) this.f22220c;
            ae.b[] bVarArr = (ae.b[]) dVar.f8035i;
            for (ae.b bVar2 : bVarArr) {
                if (bVar2 != null) {
                    bVar2.d();
                }
            }
            dVar.d0(bVarArr, bVar);
            zj.b bVar3 = (zj.b) dVar.f8034e;
            boolean z5 = dVar.f24030v;
            m mVar = z5 ? bVar3.f24019b : bVar3.f24021d;
            m mVar2 = z5 ? bVar3.f24020c : bVar3.f24022e;
            int iK = dVar.K((int) mVar.f11824b);
            int iK2 = dVar.K((int) mVar2.f11824b);
            int i7 = -1;
            int iMax = 1;
            int i10 = 0;
            while (iK < iK2) {
                ae.b bVar4 = bVarArr[iK];
                if (bVar4 != null) {
                    int i11 = bVar4.f365f;
                    int i12 = i11 - i7;
                    if (i12 == 0) {
                        i10++;
                    } else {
                        if (i12 == 1) {
                            iMax = Math.max(iMax, i10);
                            i7 = bVar4.f365f;
                        } else if (i12 < 0 || i11 >= bVar.f365f || i12 > iK) {
                            bVarArr[iK] = null;
                        } else {
                            if (iMax > 2) {
                                i12 *= iMax - 2;
                            }
                            boolean z6 = i12 >= iK;
                            for (int i13 = 1; i13 <= i12 && !z6; i13++) {
                                z6 = bVarArr[iK - i13] != null;
                            }
                            if (z6) {
                                bVarArr[iK] = null;
                            } else {
                                i7 = bVar4.f365f;
                            }
                        }
                        i10 = 1;
                    }
                }
                iK++;
            }
        }
    }

    public String b(long j, long j5, String str, int i7) {
        String[] strArr = (String[]) this.f22220c;
        String[] strArr2 = (String[]) this.f22222e;
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        while (true) {
            int i11 = this.f22219b;
            if (i10 >= i11) {
                sb2.append(strArr[i11]);
                return sb2.toString();
            }
            sb2.append(strArr[i10]);
            int i12 = ((int[]) this.f22221d)[i10];
            if (i12 == 1) {
                sb2.append(str);
            } else if (i12 == 2) {
                sb2.append(String.format(Locale.US, strArr2[i10], Long.valueOf(j)));
            } else if (i12 == 3) {
                sb2.append(String.format(Locale.US, strArr2[i10], Integer.valueOf(i7)));
            } else if (i12 == 4) {
                sb2.append(String.format(Locale.US, strArr2[i10], Long.valueOf(j5)));
            }
            i10++;
        }
    }

    public void c(je.u uVar) {
        Promise promise = (Promise) this.f22220c;
        if (((Exception) uVar.f13850c) != null) {
            ((RNFSManager) this.f22222e).reject(promise, ((ReadableMap) this.f22221d).getString("toUrl"), (Exception) uVar.f13850c);
            return;
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("jobId", this.f22219b);
        writableMapCreateMap.putInt("statusCode", uVar.f13848a);
        writableMapCreateMap.putMap("headers", (WritableMap) uVar.f13849b);
        writableMapCreateMap.putString("body", (String) uVar.f13851d);
        promise.resolve(writableMapCreateMap);
    }

    public void d(Throwable th2) {
        e0 e0Var = (e0) this.f22222e;
        if (th2 instanceof TimeoutException) {
            e0Var.O(102, 28, h0.f205r);
            com.google.android.gms.internal.play_billing.r.i("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", th2);
        } else {
            e0Var.O(95, 28, h0.f205r);
            com.google.android.gms.internal.play_billing.r.i("BillingClientTesting", "An error occurred while retrieving billing override.", th2);
        }
        ((Runnable) this.f22221d).run();
    }

    public synchronized l f(j jVar) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Queueing ".concat(jVar.toString()));
            }
            if (!((i) this.f22222e).d(jVar)) {
                i iVar = new i(this);
                this.f22222e = iVar;
                iVar.d(jVar);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return jVar.f22213b.f11763a;
    }

    public String toString() {
        switch (this.f22218a) {
            case 5:
                int i7 = this.f22219b;
                r[] rVarArr = (r[]) this.f22221d;
                r rVar = rVarArr[0];
                if (rVar == null) {
                    rVar = rVarArr[i7 + 1];
                }
                Formatter formatter = new Formatter();
                for (int i10 = 0; i10 < ((ae.b[]) rVar.f8035i).length; i10++) {
                    try {
                        formatter.format("CW %3d:", Integer.valueOf(i10));
                        for (int i11 = 0; i11 < i7 + 2; i11++) {
                            r rVar2 = rVarArr[i11];
                            if (rVar2 == null) {
                                formatter.format("    |   ", new Object[0]);
                            } else {
                                ae.b bVar = ((ae.b[]) rVar2.f8035i)[i10];
                                if (bVar == null) {
                                    formatter.format("    |   ", new Object[0]);
                                } else {
                                    formatter.format(" %3d|%3d", Integer.valueOf(bVar.f365f), Integer.valueOf(bVar.f364e));
                                }
                            }
                        }
                        formatter.format("%n", new Object[0]);
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            try {
                                formatter.close();
                                break;
                            } catch (Throwable th4) {
                                th2.addSuppressed(th4);
                            }
                            throw th3;
                        }
                    }
                }
                String string = formatter.toString();
                formatter.close();
                return string;
            default:
                return super.toString();
        }
    }

    public k(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f22218a = 0;
        this.f22222e = new i(this);
        this.f22219b = 1;
        this.f22221d = scheduledExecutorService;
        this.f22220c = context.getApplicationContext();
    }

    public k(ae.b bVar, zj.b bVar2) {
        this.f22218a = 5;
        this.f22220c = bVar;
        int i7 = bVar.f361b;
        this.f22219b = i7;
        this.f22222e = bVar2;
        this.f22221d = new r[i7 + 2];
    }

    public k(ViewGroup view, am.e eventPropagationView, ThemedReactContext themedReactContext) {
        this.f22218a = 4;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(eventPropagationView, "eventPropagationView");
        this.f22220c = view;
        this.f22221d = eventPropagationView;
        this.f22222e = themedReactContext;
        this.f22219b = UIManagerHelper.getSurfaceId(view);
        new vl.b(this);
        new kotlin.collections.a(18, this);
        new com.discord.chat.presentation.message.view.d(this);
    }

    public k(String[] strArr, int[] iArr, String[] strArr2, int i7) {
        this.f22218a = 3;
        this.f22220c = strArr;
        this.f22221d = iArr;
        this.f22222e = strArr2;
        this.f22219b = i7;
    }
}
