package u4;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import androidx.activity.result.ActivityResultCallback;
import androidx.core.view.z;
import bp.o;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.gms.internal.play_billing.r;
import com.google.common.util.concurrent.SettableFuture;
import com.swmansion.rnscreens.Screen;
import ep.l;
import ga.j;
import ga.k;
import gk.e;
import he.f0;
import he.h0;
import he.k0;
import he.n0;
import he.s0;
import hq.f;
import i.e0;
import io.sentry.protocol.a0;
import io.sentry.protocol.m;
import io.sentry.protocol.u;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.MissingFormatArgumentException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.x;
import n.h;
import n1.w;
import nm.d;
import okhttp3.Call;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONException;
import pd.g;
import rn.q;
import ue.i;

/* JADX INFO: loaded from: classes.dex */
public class c implements ActivityResultCallback, j, h5.j, f, h, e, n1.h, cs.h, f0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f20946d;

    public /* synthetic */ c(Object obj) {
        this.f20946d = obj;
    }

    public static String C(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    public static u s(Throwable th2, m mVar, Long l6, List list, boolean z5) {
        Package r5 = th2.getClass().getPackage();
        String name = th2.getClass().getName();
        u uVar = new u();
        String message = th2.getMessage();
        if (r5 != null) {
            name = name.replace(r5.getName() + ".", "");
        }
        String name2 = r5 != null ? r5.getName() : null;
        if (list != null && !list.isEmpty()) {
            a0 a0Var = new a0(list);
            if (z5) {
                a0Var.f12916i = Boolean.TRUE;
            }
            uVar.f13052w = a0Var;
        }
        uVar.f13051v = l6;
        uVar.f13048d = name;
        uVar.f13053x = mVar;
        uVar.f13050i = name2;
        uVar.f13049e = message;
        return uVar;
    }

    public static boolean w(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    public float A(int i7, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        double dSqrt;
        int i19 = 1;
        boolean z5 = Math.abs(i12 - i10) > Math.abs(i11 - i7);
        if (z5) {
            i14 = i7;
            i13 = i10;
            i16 = i11;
            i15 = i12;
        } else {
            i13 = i7;
            i14 = i10;
            i15 = i11;
            i16 = i12;
        }
        int iAbs = Math.abs(i15 - i13);
        int i20 = i16 - i14;
        int iAbs2 = Math.abs(i20);
        int i21 = 2;
        int i22 = (-iAbs) / 2;
        int i23 = i13 < i15 ? 1 : -1;
        int i24 = i14 < i16 ? 1 : -1;
        int i25 = i15 + i23;
        int i26 = i13;
        int i27 = i14;
        int i28 = 0;
        while (true) {
            if (i26 == i25) {
                i17 = i13;
                i18 = i21;
                break;
            }
            boolean z6 = z5;
            i17 = i13;
            if ((i28 == i19 ? i19 : 0) == ((mj.b) this.f20946d).b(z5 ? i27 : i26, z5 ? i26 : i27)) {
                if (i28 == 2) {
                    int i29 = i26 - i17;
                    int i30 = i27 - i14;
                    dSqrt = Math.sqrt((i30 * i30) + (i29 * i29));
                } else {
                    i28++;
                }
                return (float) dSqrt;
            }
            i22 += iAbs2;
            if (i22 > 0) {
                if (i27 == i16) {
                    i18 = 2;
                    break;
                }
                i27 += i24;
                i22 -= iAbs;
            }
            i26 += i23;
            i13 = i17;
            i14 = i14;
            z5 = z6;
            i19 = 1;
            i21 = 2;
        }
        if (i28 != i18) {
            return Float.NaN;
        }
        int i31 = i25 - i17;
        dSqrt = Math.sqrt((i20 * i20) + (i31 * i31));
        return (float) dSqrt;
    }

    public float B(int i7, int i10, int i11, int i12) {
        float f2;
        float f7;
        mj.b bVar = (mj.b) this.f20946d;
        float fA = A(i7, i10, i11, i12);
        int i13 = i7 - (i11 - i7);
        int i14 = 0;
        if (i13 < 0) {
            f2 = i7 / (i7 - i13);
            i13 = 0;
        } else {
            int i15 = bVar.f15839d;
            if (i13 >= i15) {
                float f10 = ((i15 - 1) - i7) / (i13 - i7);
                int i16 = i15 - 1;
                f2 = f10;
                i13 = i16;
            } else {
                f2 = 1.0f;
            }
        }
        float f11 = i10;
        int i17 = (int) (f11 - ((i12 - i10) * f2));
        if (i17 < 0) {
            f7 = f11 / (i10 - i17);
        } else {
            int i18 = bVar.f15840e;
            if (i17 >= i18) {
                f7 = ((i18 - 1) - i10) / (i17 - i10);
                i14 = i18 - 1;
            } else {
                i14 = i17;
                f7 = 1.0f;
            }
        }
        return (A(i7, i10, (int) (((i13 - i7) * f7) + i7), i14) + fA) - 1.0f;
    }

    @Override // ga.j
    public void H(Object obj) {
        ((k) this.f20946d).getClass();
    }

    @Override // n.h
    public void R(n.j jVar) {
        e0 e0Var = (e0) this.f20946d;
        Window.Callback callback = e0Var.f11201b;
        if (e0Var.f11200a.f1164a.o()) {
            callback.onPanelClosed(108, jVar);
        } else if (callback.onPreparePanel(0, null, jVar)) {
            callback.onMenuOpened(108, jVar);
        }
    }

    public float a(ek.c cVar, ek.c cVar2) {
        int i7 = (int) cVar.f11823a;
        int i10 = (int) cVar.f11824b;
        int i11 = (int) cVar2.f11823a;
        int i12 = (int) cVar2.f11824b;
        float fB = B(i7, i10, i11, i12);
        float fB2 = B((int) cVar2.f11823a, i12, (int) cVar.f11823a, i10);
        if (Float.isNaN(fB)) {
            return fB2 / 7.0f;
        }
        return Float.isNaN(fB2) ? fB / 7.0f : (fB + fB2) / 14.0f;
    }

    public void b(float f2, boolean z5, boolean z6) {
        int i7;
        Screen screen = (Screen) this.f20946d;
        float fC = lo.j.c(f2, 0.0f, 1.0f);
        if (fC == 0.0f) {
            i7 = 1;
        } else {
            i7 = fC == 1.0f ? 2 : 3;
        }
        short s2 = (short) i7;
        EventDispatcher reactEventDispatcher = screen.getReactEventDispatcher();
        if (reactEventDispatcher != null) {
            reactEventDispatcher.dispatchEvent(new d(UIManagerHelper.getSurfaceId(screen), screen.getId(), fC, z5, z6, s2));
        }
    }

    public void c(Throwable th2, AtomicInteger atomicInteger, HashSet hashSet, ArrayDeque arrayDeque, String str) {
        Thread threadCurrentThread;
        m mVar;
        boolean z5;
        int iIncrementAndGet = atomicInteger.get();
        while (th2 != null && hashSet.add(th2)) {
            if (str == null) {
                str = "chained";
            }
            if (th2 instanceof io.sentry.exception.a) {
                io.sentry.exception.a aVar = (io.sentry.exception.a) th2;
                m mVar2 = aVar.f12658d;
                Throwable th3 = aVar.f12659e;
                threadCurrentThread = aVar.f12660i;
                z5 = aVar.f12661v;
                th2 = th3;
                mVar = mVar2;
            } else {
                m mVar3 = new m();
                threadCurrentThread = Thread.currentThread();
                mVar = mVar3;
                z5 = false;
            }
            arrayDeque.addFirst(s(th2, mVar, Long.valueOf(threadCurrentThread.getId()), ((i) this.f20946d).j(th2.getStackTrace(), Boolean.FALSE.equals(mVar.f12998v)), z5));
            if (mVar.f12995d == null) {
                mVar.f12995d = str;
            }
            if (atomicInteger.get() >= 0) {
                mVar.F = Integer.valueOf(iIncrementAndGet);
            }
            iIncrementAndGet = atomicInteger.incrementAndGet();
            mVar.E = Integer.valueOf(iIncrementAndGet);
            Throwable[] suppressed = th2.getSuppressed();
            if (suppressed != null && suppressed.length > 0) {
                for (Throwable th4 : suppressed) {
                    c(th4, atomicInteger, hashSet, arrayDeque, "suppressed");
                }
            }
            th2 = th2.getCause();
            str = null;
            atomicInteger = atomicInteger;
            hashSet = hashSet;
            arrayDeque = arrayDeque;
        }
    }

    @Override // androidx.activity.result.ActivityResultCallback
    public void d(Object obj) {
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f20946d;
        f.a aVar = (f.a) obj;
        proxyBillingActivityV2.getClass();
        Intent intent = aVar.f8760e;
        int i7 = aVar.f8759d;
        Bundle extras = intent == null ? null : intent.getExtras();
        if (i7 != -1) {
            if (extras == null) {
                extras = new Bundle();
            }
            r.h("ProxyBillingActivityV2", "External offer flow finished with resultCode: " + i7);
            extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "External offer flow finished with error resultCode: " + i7);
        }
        int i10 = r.e(intent, "ProxyBillingActivityV2").f3788a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.G;
        if (resultReceiver != null) {
            resultReceiver.send(i10, extras);
        } else {
            r.h("ProxyBillingActivityV2", "External offer flow result receiver is null");
        }
        if (i10 != 0) {
            r.h("ProxyBillingActivityV2", "External offer flow finished with billing responseCode: " + i10);
        }
        proxyBillingActivityV2.finish();
    }

    @Override // he.f0
    public void e(h0 h0Var, long j, long j5) {
        n0 n0Var = (n0) h0Var;
        g gVar = (g) this.f20946d;
        long j7 = n0Var.f10634d;
        s0 s0Var = n0Var.f10637v;
        Uri uri = s0Var.f10700i;
        LoadEventInfo loadEventInfo = new LoadEventInfo(s0Var.f10699e, s0Var.f10701v);
        gVar.K.getClass();
        gVar.O.m(loadEventInfo, n0Var.f10636i);
        gVar.f17973j0 = ((Long) n0Var.f10639x).longValue() - j;
        gVar.y(true);
    }

    public ek.a f(float f2, float f7, int i7, int i10) throws ij.h {
        ek.a aVarB;
        ek.a aVarB2;
        int i11 = (int) (f7 * f2);
        int iMax = Math.max(0, i7 - i11);
        mj.b bVar = (mj.b) this.f20946d;
        int iMin = Math.min(bVar.f15839d - 1, i7 + i11) - iMax;
        float f10 = 3.0f * f2;
        if (iMin < f10) {
            throw ij.h.f11808i;
        }
        int iMax2 = Math.max(0, i10 - i11);
        int iMin2 = Math.min(bVar.f15840e - 1, i10 + i11) - iMax2;
        if (iMin2 < f10) {
            throw ij.h.f11808i;
        }
        mj.b bVar2 = (mj.b) this.f20946d;
        ek.b bVar3 = new ek.b(bVar2, iMax, iMax2, iMin, iMin2, f2);
        int i12 = bVar3.f8444e;
        int i13 = bVar3.f8442c;
        int i14 = i12 + i13;
        int i15 = bVar3.f8445f;
        int i16 = (i15 / 2) + bVar3.f8443d;
        int[] iArr = new int[3];
        for (int i17 = 0; i17 < i15; i17++) {
            int i18 = ((i17 & 1) == 0 ? (i17 + 1) / 2 : -((i17 + 1) / 2)) + i16;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            int i19 = i13;
            while (i19 < i14 && !bVar2.b(i19, i18)) {
                i19++;
            }
            int i20 = 0;
            while (i19 < i14) {
                if (!bVar2.b(i19, i18)) {
                    if (i20 == 1) {
                        i20++;
                    }
                    iArr[i20] = iArr[i20] + 1;
                } else if (i20 == 1) {
                    iArr[1] = iArr[1] + 1;
                } else if (i20 != 2) {
                    i20++;
                    iArr[i20] = iArr[i20] + 1;
                } else {
                    if (bVar3.a(iArr) && (aVarB2 = bVar3.b(i18, i19, iArr)) != null) {
                        return aVarB2;
                    }
                    iArr[0] = iArr[2];
                    iArr[1] = 1;
                    iArr[2] = 0;
                    i20 = 1;
                }
                i19++;
            }
            if (bVar3.a(iArr) && (aVarB = bVar3.b(i18, i14, iArr)) != null) {
                return aVarB;
            }
        }
        ArrayList arrayList = bVar3.f8441b;
        if (arrayList.isEmpty()) {
            throw ij.h.f11808i;
        }
        return (ek.a) arrayList.get(0);
    }

    public o g(l request) {
        Intrinsics.checkNotNullParameter(request, "request");
        up.b bVar = request.f8568a;
        up.c cVar = bVar.f21258a;
        String strM = x.m(bVar.f21259b.f21262a.f21265a, '.', '$');
        if (!cVar.f21262a.c()) {
            strM = cVar.f21262a.f21265a + '.' + strM;
        }
        Class clsD = a.a.D((ClassLoader) this.f20946d, strM);
        if (clsD != null) {
            return new o(clsD);
        }
        return null;
    }

    @Override // n1.h
    public void h(Object obj) {
        q1.c e10 = (q1.c) obj;
        Intrinsics.checkNotNullParameter(e10, "e");
        ar.k kVar = (ar.k) this.f20946d;
        if (kVar.c()) {
            q qVar = Result.f14614e;
            kVar.resumeWith(ib.a.o(e10));
        }
    }

    public l4.a0 i(Context context, String str, InputStream inputStream, String str2, String str3) {
        l4.a0 a0VarF;
        a aVar;
        b bVar = (b) this.f20946d;
        if (str2 == null) {
            str2 = "application/json";
        }
        if (str2.contains("application/zip") || str2.contains("application/x-zip") || str2.contains("application/x-zip-compressed") || str.split("\\?")[0].endsWith(".lottie")) {
            x4.c.a();
            a aVar2 = a.ZIP;
            a0VarF = str3 != null ? l4.m.f(context, new ZipInputStream(new FileInputStream(bVar.i0(str, inputStream, aVar2))), str) : l4.m.f(context, new ZipInputStream(inputStream), null);
            aVar = aVar2;
        } else if (str2.contains("application/gzip") || str2.contains("application/x-gzip") || str.split("\\?")[0].endsWith(".tgs")) {
            x4.c.a();
            aVar = a.GZIP;
            a0VarF = str3 != null ? l4.m.c(new GZIPInputStream(new FileInputStream(bVar.i0(str, inputStream, aVar))), str) : l4.m.c(new GZIPInputStream(inputStream), null);
        } else {
            x4.c.a();
            aVar = a.JSON;
            a0VarF = str3 != null ? l4.m.c(new FileInputStream(bVar.i0(str, inputStream, aVar).getAbsolutePath()), str) : l4.m.c(inputStream, null);
        }
        if (str3 != null && a0VarF.f14820a != null) {
            File file = new File(bVar.g0(), b.c0(str, aVar, true));
            File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
            boolean zRenameTo = file.renameTo(file2);
            file2.toString();
            x4.c.a();
            if (!zRenameTo) {
                x4.c.b("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
            }
        }
        return a0VarF;
    }

    @Override // hq.f
    public hq.e j(up.b classId) {
        hq.e eVarJ;
        Intrinsics.checkNotNullParameter(classId, "classId");
        for (vo.e0 e0Var : sa.a.A((vo.h0) this.f20946d, classId.f21258a)) {
            if ((e0Var instanceof iq.c) && (eVarJ = ((iq.c) e0Var).G.j(classId)) != null) {
                return eVarJ;
            }
        }
        return null;
    }

    public boolean k(String str) {
        String strU = u(str);
        return "1".equals(strU) || Boolean.parseBoolean(strU);
    }

    public Integer l(String str) {
        String strU = u(str);
        if (TextUtils.isEmpty(strU)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(strU));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + C(str) + "(" + strU + ") into an int");
            return null;
        }
    }

    public JSONArray m(String str) {
        String strU = u(str);
        if (TextUtils.isEmpty(strU)) {
            return null;
        }
        try {
            return new JSONArray(strU);
        } catch (JSONException unused) {
            Log.w("NotificationParams", "Malformed JSON for key " + C(str) + ": " + strU + ", falling back to default");
            return null;
        }
    }

    @Override // he.f0
    public ad.f n(h0 h0Var, long j, long j5, IOException iOException, int i7) {
        n0 n0Var = (n0) h0Var;
        g gVar = (g) this.f20946d;
        a1.d dVar = gVar.O;
        long j7 = n0Var.f10634d;
        s0 s0Var = n0Var.f10637v;
        Uri uri = s0Var.f10700i;
        dVar.q(new LoadEventInfo(s0Var.f10699e, s0Var.f10701v), n0Var.f10636i, iOException, true);
        gVar.K.getClass();
        je.b.s("DashMediaSource", "Failed to resolve time offset.", iOException);
        gVar.y(true);
        return k0.f10619w;
    }

    @Override // n.h
    public boolean o(n.j jVar, MenuItem menuItem) {
        return false;
    }

    @Override // cs.h
    public void onFailure(Call call, IOException iOException) {
        SettableFuture settableFuture = (SettableFuture) this.f20946d;
        if (hi.m.f10791x.l(settableFuture, null, new hi.b(iOException))) {
            hi.m.e(settableFuture);
        }
    }

    @Override // cs.h
    public void onResponse(Call call, Response response) {
        SettableFuture settableFuture = (SettableFuture) this.f20946d;
        if (hi.m.f10791x.l(settableFuture, null, response)) {
            hi.m.e(settableFuture);
        }
    }

    @Override // n1.h
    public void onResult(Object obj) {
        w result = (w) obj;
        Intrinsics.checkNotNullParameter(result, "result");
        ar.k kVar = (ar.k) this.f20946d;
        if (kVar.c()) {
            q qVar = Result.f14614e;
            kVar.resumeWith(result);
        }
    }

    @Override // he.f0
    public void p(h0 h0Var, long j, long j5, boolean z5) {
        ((g) this.f20946d).x((n0) h0Var);
    }

    @Override // ga.j
    public void q(Object obj) {
        ((k) this.f20946d).getClass();
    }

    public String r(Resources resources, String str, String str2) {
        String[] strArr;
        String strU = u(str2);
        if (!TextUtils.isEmpty(strU)) {
            return strU;
        }
        String strU2 = u(str2.concat("_loc_key"));
        if (TextUtils.isEmpty(strU2)) {
            return null;
        }
        int identifier = resources.getIdentifier(strU2, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", C(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        JSONArray jSONArrayM = m(str2.concat("_loc_args"));
        if (jSONArrayM == null) {
            strArr = null;
        } else {
            int length = jSONArrayM.length();
            strArr = new String[length];
            for (int i7 = 0; i7 < length; i7++) {
                strArr[i7] = jSONArrayM.optString(i7);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException e10) {
            Log.w("NotificationParams", "Missing format argument for " + C(str2) + ": " + Arrays.toString(strArr) + " Default value will be used.", e10);
            return null;
        }
    }

    @Override // ga.j
    public void t(Object obj) {
        ((k) this.f20946d).getClass();
    }

    public String u(String str) {
        Bundle bundle = (Bundle) this.f20946d;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String strReplace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(strReplace)) {
                str = strReplace;
            }
        }
        return bundle.getString(str);
    }

    public void v() {
        View view = (View) this.f20946d;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public Bundle x() {
        Bundle bundle = (Bundle) this.f20946d;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    public vo.f y(o javaClass) {
        ip.r rVar;
        Intrinsics.checkNotNullParameter(javaClass, "javaClass");
        up.c cVarC = javaClass.c();
        if (cVarC != null) {
            lp.f[] fVarArr = lp.f.f15168d;
        }
        Class<?> declaringClass = javaClass.f3364a.getDeclaringClass();
        o oVar = declaringClass != null ? new o(declaringClass) : null;
        if (oVar != null) {
            vo.f fVarY = y(oVar);
            eq.o oVarH0 = fVarY != null ? fVarY.h0() : null;
            vo.i iVarG = oVarH0 != null ? oVarH0.g(javaClass.e(), dp.c.E) : null;
            if (iVarG instanceof vo.f) {
                return (vo.f) iVarG;
            }
        } else if (cVarC != null && (rVar = (ip.r) CollectionsKt.firstOrNull(((hp.d) this.f20946d).c(cVarC.b()))) != null) {
            Intrinsics.checkNotNullParameter(javaClass, "jClass");
            ip.w wVar = rVar.H.f13333d;
            wVar.getClass();
            Intrinsics.checkNotNullParameter(javaClass, "javaClass");
            return wVar.v(javaClass.e(), javaClass);
        }
        return null;
    }

    public void z() {
        View viewFindViewById;
        View view = (View) this.f20946d;
        if (view == null) {
            return;
        }
        if (view.isInEditMode() || view.onCheckIsTextEditor()) {
            view.requestFocus();
            viewFindViewById = view;
        } else {
            viewFindViewById = view.getRootView().findFocus();
        }
        if (viewFindViewById == null) {
            viewFindViewById = view.getRootView().findViewById(R.id.content);
        }
        if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
            return;
        }
        viewFindViewById.post(new z(0, viewFindViewById));
    }

    public /* synthetic */ c(Object obj, Object obj2) {
        this.f20946d = obj;
    }

    public c(vo.h0 packageFragmentProvider) {
        Intrinsics.checkNotNullParameter(packageFragmentProvider, "packageFragmentProvider");
        this.f20946d = packageFragmentProvider;
    }

    public c(int i7) {
        switch (i7) {
            case 22:
                this.f20946d = new io.sentry.hints.j(11);
                break;
            default:
                this.f20946d = ak.a.f630e;
                break;
        }
    }
}
