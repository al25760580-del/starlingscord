package ue;

import a5.b0;
import a5.l0;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.MenuItem;
import android.view.WindowInsetsController;
import androidx.activity.result.ActivityResultCallback;
import androidx.appcompat.widget.h1;
import androidx.appcompat.widget.h2;
import androidx.appcompat.widget.n;
import androidx.core.view.i1;
import androidx.work.impl.WorkDatabase;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.facebook.cache.common.CacheKey;
import com.facebook.imageutils.JfifUtil;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.internal.play_billing.r;
import e4.p;
import ga.m;
import gc.s0;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.protocol.SentryStackFrame;
import io.sentry.w5;
import io.sentry.y1;
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Currency;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.x;
import n.u;
import org.json.JSONException;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements ActivityResultCallback, u, m, h1, gk.d, ik.c, h2, r8.c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static i f21116e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f21117d;

    public /* synthetic */ i(Object obj) {
        this.f21117d = obj;
    }

    public static synchronized i t(Context context) {
        i iVar;
        Context applicationContext = context.getApplicationContext();
        synchronized (i.class) {
            iVar = f21116e;
            if (iVar == null) {
                iVar = new i(applicationContext, 0);
                f21116e = iVar;
            }
        }
        return iVar;
        return iVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v15 */
    public s0 a(a3.f fVar, Map map) throws Throwable {
        int iG;
        dk.e eVar;
        ArrayList arrayList;
        Throwable th2;
        String str;
        int iG2;
        dk.g gVarS = fVar.s();
        int i7 = fVar.r().f7655a;
        dk.d dVarR = fVar.r();
        dk.g gVarS2 = fVar.s();
        int i10 = f0.e.c(8)[dVarR.f7656b];
        mj.b bVar = (mj.b) fVar.f68b;
        int i11 = bVar.f15840e;
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            for (int i14 = 0; i14 < i11; i14++) {
                if (dk.c.a(i10, i13, i14)) {
                    bVar.a(i14, i13);
                }
            }
        }
        int i15 = gVarS2.f7666a * 4;
        int i16 = i15 + 17;
        int i17 = gVarS2.f7669d;
        mj.b bVar2 = new mj.b(i16, i16);
        bVar2.g(0, 0, 9, 9);
        int i18 = i15 + 9;
        bVar2.g(i18, 0, 8, 9);
        bVar2.g(0, i18, 9, 8);
        int[] iArr = gVarS2.f7667b;
        int length = iArr.length;
        int i19 = 0;
        while (i19 < length) {
            int i20 = iArr[i19] - 2;
            for (int i21 = i12; i21 < length; i21++) {
                if ((i19 != 0 || (i21 != 0 && i21 != length - 1)) && (i19 != length - 1 || i21 != 0)) {
                    bVar2.g(iArr[i21] - 2, i20, 5, 5);
                }
            }
            i19++;
            i12 = 0;
        }
        int i22 = 2;
        int i23 = 6;
        int i24 = 1;
        bVar2.g(6, 9, 1, i15);
        bVar2.g(9, 6, i15, 1);
        if (gVarS2.f7666a > 6) {
            int i25 = i15 + 6;
            bVar2.g(i25, 0, 3, 6);
            bVar2.g(0, i25, 6, 3);
        }
        byte[] bArr = new byte[i17];
        int i26 = i11 - 1;
        int i27 = i26;
        boolean z5 = true;
        int i28 = 0;
        int i29 = 0;
        int i30 = 0;
        while (i27 > 0) {
            if (i27 == i23) {
                i27--;
            }
            int i31 = 0;
            while (i31 < i11) {
                int i32 = z5 ? i26 - i31 : i31;
                int i33 = i24;
                int i34 = 0;
                for (int i35 = i22; i34 < i35; i35 = 2) {
                    int i36 = i27 - i34;
                    if (!bVar2.b(i36, i32)) {
                        i29++;
                        i30 <<= 1;
                        if (bVar.b(i36, i32)) {
                            i30 |= 1;
                        }
                        if (i29 == 8) {
                            bArr[i28] = (byte) i30;
                            i28++;
                            i29 = 0;
                            i30 = 0;
                        }
                    }
                    i34++;
                }
                i31++;
                i24 = i33;
                i22 = 2;
            }
            z5 = !z5;
            i27 -= 2;
            i23 = 6;
            i22 = 2;
        }
        int i37 = i24;
        if (i28 != i17) {
            throw ij.d.a();
        }
        int i38 = gVarS.f7669d;
        int i39 = gVarS.f7666a;
        if (i17 != i38) {
            throw new IllegalArgumentException();
        }
        b0 b0Var = gVarS.f7668c[f0.e.b(i7)];
        c5.e[] eVarArr = (c5.e[]) b0Var.f174i;
        int i40 = b0Var.f173e;
        int i41 = 0;
        for (c5.e eVar2 : eVarArr) {
            i41 += eVar2.f3485b;
        }
        dk.a[] aVarArr = new dk.a[i41];
        int i42 = 0;
        for (c5.e eVar3 : eVarArr) {
            int i43 = 0;
            while (i43 < eVar3.f3485b) {
                int i44 = eVar3.f3486c;
                aVarArr[i42] = new dk.a(new byte[i40 + i44], i44);
                i43++;
                i42++;
            }
        }
        int length2 = aVarArr[0].f7651b.length;
        int i45 = i41 - 1;
        while (i45 >= 0 && aVarArr[i45].f7651b.length != length2) {
            i45--;
        }
        int i46 = i45 + 1;
        int i47 = length2 - i40;
        int i48 = 0;
        int i49 = 0;
        while (i48 < i47) {
            int i50 = i49;
            int i51 = 0;
            while (i51 < i42) {
                aVarArr[i51].f7651b[i48] = bArr[i50];
                i51++;
                i50++;
            }
            i48++;
            i49 = i50;
        }
        int i52 = i46;
        while (i52 < i42) {
            aVarArr[i52].f7651b[i47] = bArr[i49];
            i52++;
            i49++;
        }
        int length3 = aVarArr[0].f7651b.length;
        while (i47 < length3) {
            int i53 = i49;
            int i54 = 0;
            while (i54 < i42) {
                aVarArr[i54].f7651b[i54 < i46 ? i47 : i47 + 1] = bArr[i53];
                i54++;
                i53++;
            }
            i47++;
            i49 = i53;
        }
        int i55 = 0;
        for (int i56 = 0; i56 < i41; i56++) {
            i55 += aVarArr[i56].f7650a;
        }
        byte[] bArr2 = new byte[i55];
        int i57 = 0;
        for (int i58 = 0; i58 < i41; i58++) {
            dk.a aVar = aVarArr[i58];
            byte[] bArr3 = aVar.f7651b;
            int i59 = aVar.f7650a;
            int length4 = bArr3.length;
            int[] iArr2 = new int[length4];
            for (int i60 = 0; i60 < length4; i60++) {
                iArr2[i60] = bArr3[i60] & 255;
            }
            try {
                ((i) this.f21117d).h(bArr3.length - i59, iArr2);
                for (int i61 = 0; i61 < i59; i61++) {
                    bArr3[i61] = (byte) iArr2[i61];
                }
                int i62 = 0;
                while (i62 < i59) {
                    bArr2[i57] = bArr3[i62];
                    i62++;
                    i57++;
                }
            } catch (oj.b unused) {
                throw ij.b.a();
            }
        }
        char[] cArr = dk.b.f7652a;
        a5.g gVar = new a5.g(bArr2);
        StringBuilder sb2 = new StringBuilder(50);
        ArrayList arrayList2 = new ArrayList(i37);
        int iG3 = -1;
        int iG4 = -1;
        boolean z6 = false;
        mj.c cVar = null;
        while (true) {
            try {
                int iD = gVar.d();
                dk.e eVar4 = dk.e.TERMINATOR;
                if (iD < 4 || (iG = gVar.g(4)) == 0) {
                    eVar = eVar4;
                } else if (iG == 1) {
                    eVar = dk.e.NUMERIC;
                } else if (iG == 2) {
                    eVar = dk.e.ALPHANUMERIC;
                } else if (iG == 3) {
                    eVar = dk.e.STRUCTURED_APPEND;
                } else if (iG == 4) {
                    eVar = dk.e.BYTE;
                } else if (iG == 5) {
                    eVar = dk.e.FNC1_FIRST_POSITION;
                } else if (iG == 7) {
                    eVar = dk.e.ECI;
                } else if (iG == 8) {
                    eVar = dk.e.KANJI;
                } else if (iG == 9) {
                    eVar = dk.e.FNC1_SECOND_POSITION;
                } else {
                    if (iG != 13) {
                        throw new IllegalArgumentException();
                    }
                    eVar = dk.e.HANZI;
                }
                int[] iArr3 = eVar.f7663d;
                int iOrdinal = eVar.ordinal();
                if (iOrdinal != 0) {
                    th2 = null;
                    if (iOrdinal == 3) {
                        arrayList = arrayList2;
                        if (gVar.d() < 16) {
                            throw ij.d.a();
                        }
                        iG3 = gVar.g(8);
                        iG4 = gVar.g(8);
                    } else if (iOrdinal == 5) {
                        arrayList = arrayList2;
                        int iG5 = gVar.g(8);
                        if ((iG5 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 0) {
                            iG2 = iG5 & 127;
                        } else if ((iG5 & JfifUtil.MARKER_SOFn) == 128) {
                            iG2 = ((iG5 & 63) << 8) | gVar.g(8);
                        } else {
                            if ((iG5 & 224) != 192) {
                                throw ij.d.a();
                            }
                            iG2 = ((iG5 & 31) << 16) | gVar.g(16);
                        }
                        HashMap map2 = mj.c.f15843i;
                        if (iG2 < 0 || iG2 >= 900) {
                            throw ij.d.a();
                        }
                        cVar = (mj.c) mj.c.f15843i.get(Integer.valueOf(iG2));
                        if (cVar == null) {
                            throw ij.d.a();
                        }
                    } else if (iOrdinal == 7 || iOrdinal == 8) {
                        arrayList = arrayList2;
                        z6 = true;
                    } else if (iOrdinal != 9) {
                        int iG6 = gVar.g(iArr3[i39 <= 9 ? (char) 0 : i39 <= 26 ? (char) 1 : (char) 2]);
                        int iOrdinal2 = eVar.ordinal();
                        if (iOrdinal2 == 1) {
                            arrayList = arrayList2;
                            dk.b.e(gVar, sb2, iG6);
                        } else if (iOrdinal2 == 2) {
                            arrayList = arrayList2;
                            dk.b.a(gVar, sb2, iG6, z6);
                        } else if (iOrdinal2 == 4) {
                            arrayList = arrayList2;
                            dk.b.b(gVar, sb2, iG6, cVar, arrayList, map);
                        } else {
                            if (iOrdinal2 != 6) {
                                throw ij.d.a();
                            }
                            dk.b.d(gVar, sb2, iG6);
                            arrayList = arrayList2;
                        }
                    } else {
                        arrayList = arrayList2;
                        int iG7 = gVar.g(4);
                        int iG8 = gVar.g(iArr3[i39 <= 9 ? (char) 0 : i39 <= 26 ? (char) 1 : (char) 2]);
                        if (iG7 == 1) {
                            dk.b.c(gVar, sb2, iG8);
                        }
                    }
                } else {
                    arrayList = arrayList2;
                    th2 = null;
                }
                if (eVar == eVar4) {
                    int i63 = iG3;
                    int i64 = iG4;
                    String string = sb2.toString();
                    ?? r10 = arrayList.isEmpty() ? th2 : arrayList;
                    if (i7 == 1) {
                        str = "L";
                    } else if (i7 == 2) {
                        str = "M";
                    } else if (i7 == 3) {
                        str = "Q";
                    } else {
                        if (i7 != 4) {
                            throw th2;
                        }
                        str = "H";
                    }
                    return new s0(bArr2, string, r10, str, i63, i64);
                }
                arrayList2 = arrayList;
            } catch (IllegalArgumentException unused2) {
                throw ij.d.a();
            }
        }
    }

    @Override // n.u
    public void b(n.j jVar, boolean z5) {
        if (jVar instanceof n.b0) {
            ((n.b0) jVar).f16117z.k().c(false);
        }
        u uVar = ((n) this.f21117d).f1040w;
        if (uVar != null) {
            uVar.b(jVar, z5);
        }
    }

    @Override // androidx.appcompat.widget.h2
    public void c(n.j jVar, MenuItem menuItem) {
        ((n.d) this.f21117d).f16125x.removeCallbacksAndMessages(jVar);
    }

    @Override // androidx.activity.result.ActivityResultCallback
    public void d(Object obj) {
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f21117d;
        f.a aVar = (f.a) obj;
        proxyBillingActivityV2.getClass();
        Intent intent = aVar.f8760e;
        int i7 = aVar.f8759d;
        Bundle extras = intent == null ? null : intent.getExtras();
        if (i7 != -1) {
            if (extras == null) {
                extras = new Bundle();
            }
            r.h("ProxyBillingActivityV2", "Launch external link flow finished with resultCode: " + i7);
            extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "Launch external link flow finished with error resultCode: " + i7);
        }
        int i10 = r.e(intent, "ProxyBillingActivityV2").f3788a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.H;
        if (resultReceiver != null) {
            resultReceiver.send(i10, extras);
        } else {
            r.h("ProxyBillingActivityV2", "Launch external link flow result receiver is null");
        }
        if (i10 != 0) {
            r.h("ProxyBillingActivityV2", "Launch external link flow finished with billing responseCode: " + i10);
        }
        proxyBillingActivityV2.finish();
    }

    @Override // ga.m
    public int e(Object obj) {
        return ((m) this.f21117d).e(((ga.d) obj).f9535b.q());
    }

    @Override // n.u
    public boolean f(n.j jVar) {
        n nVar = (n) this.f21117d;
        if (jVar == nVar.f1038i) {
            return false;
        }
        nVar.V = ((n.b0) jVar).A.f16167a;
        u uVar = nVar.f1040w;
        if (uVar != null) {
            return uVar.f(jVar);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002b A[Catch: b | d -> 0x0053, TryCatch #2 {b | d -> 0x0053, blocks: (B:9:0x0012, B:10:0x0027, B:12:0x002b, B:13:0x002e, B:15:0x0032, B:17:0x003c, B:18:0x0042, B:20:0x0047), top: B:25:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:15:0x0032 A[Catch: b | d -> 0x0053, TryCatch #2 {b | d -> 0x0053, blocks: (B:9:0x0012, B:10:0x0027, B:12:0x002b, B:13:0x002e, B:15:0x0032, B:17:0x003c, B:18:0x0042, B:20:0x0047), top: B:25:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:17:0x003c A[Catch: b | d -> 0x0053, TryCatch #2 {b | d -> 0x0053, blocks: (B:9:0x0012, B:10:0x0027, B:12:0x002b, B:13:0x002e, B:15:0x0032, B:17:0x003c, B:18:0x0042, B:20:0x0047), top: B:25:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0042 A[SYNTHETIC] */
    public s0 g(mj.b bVar, Map map) throws ij.b, ij.d {
        ij.b bVar2;
        mj.b bVar3;
        int i7;
        int i10;
        a3.f fVar = new a3.f(bVar, 3);
        try {
            return a(fVar, map);
        } catch (ij.b e10) {
            bVar2 = e10;
            e = null;
            try {
                fVar.t();
                fVar.f69c = null;
                fVar.f70d = null;
                fVar.f67a = true;
                fVar.s();
                fVar.r();
                bVar3 = (mj.b) fVar.f68b;
                i7 = 0;
                while (i7 < bVar3.f15839d) {
                    int i11 = i7 + 1;
                    for (i10 = i11; i10 < bVar3.f15840e; i10++) {
                        if (bVar3.b(i7, i10) != bVar3.b(i10, i7)) {
                            bVar3.a(i10, i7);
                            bVar3.a(i7, i10);
                        }
                    }
                    i7 = i11;
                }
                s0 s0VarA = a(fVar, map);
                s0VarA.f9845g = new dk.f();
                return s0VarA;
            } catch (ij.b | ij.d unused) {
                if (e != null) {
                    throw e;
                }
                throw bVar2;
            }
        } catch (ij.d e11) {
            e = e11;
            bVar2 = null;
            fVar.t();
            fVar.f69c = null;
            fVar.f70d = null;
            fVar.f67a = true;
            fVar.s();
            fVar.r();
            bVar3 = (mj.b) fVar.f68b;
            i7 = 0;
            while (i7 < bVar3.f15839d) {
                int i12 = i7 + 1;
                while (i10 < bVar3.f15840e) {
                    if (bVar3.b(i7, i10) != bVar3.b(i10, i7)) {
                        bVar3.a(i10, i7);
                        bVar3.a(i7, i10);
                    }
                }
                i7 = i12;
            }
            s0 s0VarA2 = a(fVar, map);
            s0VarA2.f9845g = new dk.f();
            return s0VarA2;
        }
    }

    public void h(int i7, int[] iArr) throws oj.b {
        int[] iArr2;
        int[] iArr3;
        e4.e eVar;
        e4.e eVar2;
        e4.e eVar3;
        int iB;
        int i10;
        int i11 = i7;
        oj.a aVar = (oj.a) this.f21117d;
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        int length = iArr.length;
        int i12 = 0;
        int i13 = 1;
        if (length <= 1 || iArr[0] != 0) {
            iArr2 = iArr;
        } else {
            int i14 = 1;
            while (i14 < length && iArr[i14] == 0) {
                i14++;
            }
            if (i14 == length) {
                iArr2 = new int[]{0};
            } else {
                int i15 = length - i14;
                int[] iArr4 = new int[i15];
                System.arraycopy(iArr, i14, iArr4, 0, i15);
                iArr2 = iArr4;
            }
        }
        int[] iArr5 = new int[i11];
        boolean z5 = true;
        for (int i16 = 0; i16 < i11; i16++) {
            int i17 = aVar.f17267a[aVar.f17273g + i16];
            if (i17 == 0) {
                i10 = iArr2[iArr2.length - 1];
            } else {
                if (i17 == 1) {
                    iB = 0;
                    for (int i18 : iArr2) {
                        oj.a aVar2 = oj.a.f17261h;
                        iB ^= i18;
                    }
                } else {
                    iB = iArr2[0];
                    int length2 = iArr2.length;
                    for (int i19 = 1; i19 < length2; i19++) {
                        iB = aVar.b(i17, iB) ^ iArr2[i19];
                    }
                }
                i10 = iB;
            }
            iArr5[(i11 - 1) - i16] = i10;
            if (i10 != 0) {
                z5 = false;
            }
        }
        if (z5) {
            return;
        }
        e4.e eVar4 = new e4.e(aVar, iArr5);
        aVar.getClass();
        e4.e eVar5 = aVar.f17269c;
        if (i11 < 0) {
            throw new IllegalArgumentException();
        }
        int[] iArr6 = new int[i11 + 1];
        iArr6[0] = 1;
        e4.e eVar6 = new e4.e(aVar, iArr6);
        if (eVar6.E() >= eVar4.E()) {
            eVar6 = eVar4;
            eVar4 = eVar6;
        }
        e4.e eVarX = eVar4;
        e4.e eVar7 = eVar6;
        e4.e eVar8 = aVar.f17270d;
        e4.e eVar9 = eVar5;
        while (eVar7.E() >= i11 / 2) {
            if (eVar7.H()) {
                throw new oj.b("r_{i-1} was zero");
            }
            int iA = aVar.a(eVar7.D(eVar7.E()));
            e4.e eVarX2 = eVar5;
            while (eVarX.E() >= eVar7.E() && !eVarX.H()) {
                int iE = eVarX.E() - eVar7.E();
                int iB2 = aVar.b(eVarX.D(eVarX.E()), iA);
                if (iE < 0) {
                    throw new IllegalArgumentException();
                }
                if (iB2 == 0) {
                    eVar2 = eVar5;
                } else {
                    int[] iArr7 = new int[iE + 1];
                    iArr7[i12] = iB2;
                    eVar2 = new e4.e(aVar, iArr7);
                }
                eVarX2 = eVarX2.x(eVar2);
                int[] iArr8 = (int[]) eVar7.f7972i;
                oj.a aVar3 = (oj.a) eVar7.f7971e;
                if (iE < 0) {
                    throw new IllegalArgumentException();
                }
                if (iB2 == 0) {
                    eVar3 = aVar3.f17269c;
                } else {
                    int length3 = iArr8.length;
                    int[] iArr9 = new int[iE + length3];
                    int i20 = 0;
                    while (i20 < length3) {
                        int i21 = i20;
                        iArr9[i21] = aVar3.b(iArr8[i21], iB2);
                        i20 = i21 + 1;
                    }
                    eVar3 = new e4.e(aVar3, iArr9);
                }
                eVarX = eVarX.x(eVar3);
                i13 = i13;
                i12 = 0;
            }
            int i22 = i13;
            oj.a aVar4 = (oj.a) eVarX2.f7971e;
            if (!aVar4.equals((oj.a) eVar8.f7971e)) {
                throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
            }
            if (eVarX2.H() || eVar8.H()) {
                eVar = aVar4.f17269c;
            } else {
                int[] iArr10 = (int[]) eVarX2.f7972i;
                int length4 = iArr10.length;
                int[] iArr11 = (int[]) eVar8.f7972i;
                int length5 = iArr11.length;
                int[] iArr12 = new int[(length4 + length5) - 1];
                for (int i23 = 0; i23 < length4; i23++) {
                    int i24 = iArr10[i23];
                    int i25 = 0;
                    while (i25 < length5) {
                        int i26 = i23 + i25;
                        int i27 = i25;
                        iArr12[i26] = iArr12[i26] ^ aVar4.b(i24, iArr11[i27]);
                        i25 = i27 + 1;
                    }
                }
                eVar = new e4.e(aVar4, iArr12);
            }
            e4.e eVarX3 = eVar.x(eVar9);
            if (eVarX.E() >= eVar7.E()) {
                throw new IllegalStateException("Division algorithm failed to reduce polynomial?");
            }
            e4.e eVar10 = eVarX;
            eVarX = eVar7;
            eVar7 = eVar10;
            eVar9 = eVar8;
            i13 = i22;
            i12 = 0;
            eVar8 = eVarX3;
            i11 = i7;
        }
        int i28 = i12;
        int i29 = i13;
        int iD = eVar8.D(i28);
        if (iD == 0) {
            throw new oj.b("sigmaTilde(0) was zero");
        }
        int iA2 = aVar.a(iD);
        e4.e[] eVarArr = {eVar8.J(iA2), eVar7.J(iA2)};
        e4.e eVar11 = eVarArr[i28];
        e4.e eVar12 = eVarArr[i29];
        int iE2 = eVar11.E();
        if (iE2 == i29) {
            iArr3 = new int[]{eVar11.D(i29)};
        } else {
            int[] iArr13 = new int[iE2];
            int i30 = i28;
            for (int i31 = 1; i31 < aVar.f17271e && i30 < iE2; i31++) {
                if (eVar11.B(i31) == 0) {
                    iArr13[i30] = aVar.a(i31);
                    i30++;
                }
            }
            if (i30 != iE2) {
                throw new oj.b("Error locator degree does not match number of roots");
            }
            iArr3 = iArr13;
        }
        int length6 = iArr3.length;
        int[] iArr14 = new int[length6];
        for (int i32 = i28; i32 < length6; i32++) {
            int iA3 = aVar.a(iArr3[i32]);
            int iB3 = 1;
            for (int i33 = i28; i33 < length6; i33++) {
                if (i32 != i33) {
                    int iB4 = aVar.b(iArr3[i33], iA3);
                    iB3 = aVar.b(iB3, (iB4 & 1) == 0 ? iB4 | 1 : iB4 & (-2));
                }
            }
            int iB5 = aVar.b(eVar12.B(iA3), aVar.a(iB3));
            iArr14[i32] = iB5;
            if (aVar.f17273g != 0) {
                iArr14[i32] = aVar.b(iB5, iA3);
            }
        }
        for (int i34 = i28; i34 < iArr3.length; i34++) {
            int length7 = iArr.length - 1;
            int i35 = iArr3[i34];
            if (i35 == 0) {
                throw new IllegalArgumentException();
            }
            int i36 = length7 - aVar.f17268b[i35];
            if (i36 < 0) {
                throw new oj.b("Bad error location");
            }
            iArr[i36] = iArr[i36] ^ iArr14[i34];
        }
    }

    public fj.c i(up.b classId, rp.e metadataVersion) {
        ap.b bVarN;
        Intrinsics.checkNotNullParameter(classId, "classId");
        Intrinsics.checkNotNullParameter(metadataVersion, "metadataVersion");
        String strM = x.m(classId.f21259b.f21262a.f21265a, '.', '$');
        up.c cVar = classId.f21258a;
        if (!cVar.f21262a.c()) {
            strM = cVar + '.' + strM;
        }
        Class clsD = a.a.D((ClassLoader) this.f21117d, strM);
        if (clsD == null || (bVarN = l0.n(clsD)) == null) {
            return null;
        }
        return new fj.c(bVarN);
    }

    public ArrayList j(StackTraceElement[] stackTraceElementArr, boolean z5) {
        if (stackTraceElementArr == null || stackTraceElementArr.length <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            if (stackTraceElement != null) {
                String className = stackTraceElement.getClassName();
                if (z5 || !className.startsWith("io.sentry.") || className.startsWith("io.sentry.samples.") || className.startsWith("io.sentry.mobile.")) {
                    SentryStackFrame sentryStackFrame = new SentryStackFrame();
                    sentryStackFrame.H = k(className);
                    sentryStackFrame.f12905x = className;
                    sentryStackFrame.f12904w = stackTraceElement.getMethodName();
                    sentryStackFrame.f12903v = stackTraceElement.getFileName();
                    if (stackTraceElement.getLineNumber() >= 0) {
                        sentryStackFrame.f12906y = Integer.valueOf(stackTraceElement.getLineNumber());
                    }
                    sentryStackFrame.J = Boolean.valueOf(stackTraceElement.isNativeMethod());
                    arrayList.add(sentryStackFrame);
                    if (arrayList.size() >= 100) {
                        break;
                    }
                }
            }
        }
        Collections.reverse(arrayList);
        return arrayList;
    }

    public Boolean k(String str) {
        w5 w5Var = (w5) this.f21117d;
        if (str == null || str.isEmpty()) {
            return Boolean.TRUE;
        }
        Iterator<String> it = w5Var.getInAppIncludes().iterator();
        while (it.hasNext()) {
            if (str.startsWith(it.next())) {
                return Boolean.TRUE;
            }
        }
        Iterator<String> it2 = w5Var.getInAppExcludes().iterator();
        while (it2.hasNext()) {
            if (str.startsWith(it2.next())) {
                return Boolean.FALSE;
            }
        }
        return null;
    }

    public void l(Object obj, boolean z5) {
        CacheKey cacheKey = (CacheKey) obj;
        com.google.firebase.messaging.r rVar = (com.google.firebase.messaging.r) this.f21117d;
        synchronized (rVar) {
            try {
                if (z5) {
                    ((LinkedHashSet) rVar.f6613v).add(cacheKey);
                } else {
                    ((LinkedHashSet) rVar.f6613v).remove(cacheKey);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.appcompat.widget.h2
    public void m(n.j jVar, n.l lVar) {
        n.d dVar = (n.d) this.f21117d;
        Handler handler = dVar.f16125x;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = dVar.E;
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                i7 = -1;
                break;
            } else if (jVar == ((n.c) arrayList.get(i7)).f16119b) {
                break;
            } else {
                i7++;
            }
        }
        if (i7 == -1) {
            return;
        }
        int i10 = i7 + 1;
        handler.postAtTime(new i1(this, i10 < arrayList.size() ? (n.c) arrayList.get(i10) : null, lVar, jVar), jVar, SystemClock.uptimeMillis() + 200);
    }

    public void n() {
        long j;
        pd.g gVar = (pd.g) this.f21117d;
        synchronized (je.b.f13766i) {
            try {
                j = je.b.j ? je.b.k : -9223372036854775807L;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        gVar.f17973j0 = j;
        gVar.y(true);
    }

    public void o() {
        String str;
        hp.e eVar = (hp.e) ((fj.c) this.f21117d).f9267e;
        int i7 = ((kk.c) eVar.f10988e).e() ? 2 : 1;
        if (f0.e.a(i7, eVar.f10987d)) {
            return;
        }
        eVar.f10987d = i7;
        String str2 = (String) ((jk.a) ((p) eVar.f10989i).k).f13919a;
        WritableMap writableMapCreateMap = Arguments.createMap();
        if (i7 == 1) {
            str = "idle";
        } else {
            if (i7 != 2) {
                throw null;
            }
            str = "spinning";
        }
        writableMapCreateMap.putString("spinnerState", str);
        writableMapCreateMap.putString(StackTraceHelper.ID_KEY, str2);
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) com.mkuczera.haptic.d.f7010b.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("spinnerStateChange", writableMapCreateMap);
        Iterator it = ((HashSet) eVar.f10991w).iterator();
        while (it.hasNext()) {
            ((fk.f) it.next()).f9276a.f9277a.getButton(-1).setEnabled(i7 == 1);
        }
    }

    public void p(e4.e eVar, ILogger iLogger, Object obj) throws IOException {
        if (obj == null) {
            eVar.K();
            return;
        }
        if (obj instanceof Character) {
            eVar.f(Character.toString(((Character) obj).charValue()));
            return;
        }
        if (obj instanceof String) {
            eVar.f((String) obj);
            return;
        }
        if (obj instanceof Boolean) {
            eVar.j(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Number) {
            eVar.o((Number) obj);
            return;
        }
        if (obj instanceof Date) {
            try {
                eVar.f(io.sentry.config.a.G((Date) obj));
                return;
            } catch (Exception e10) {
                iLogger.g(SentryLevel.ERROR, "Error when serializing Date", e10);
                eVar.K();
                return;
            }
        }
        if (obj instanceof TimeZone) {
            try {
                eVar.f(((TimeZone) obj).getID());
                return;
            } catch (Exception e11) {
                iLogger.g(SentryLevel.ERROR, "Error when serializing TimeZone", e11);
                eVar.K();
                return;
            }
        }
        if (obj instanceof y1) {
            ((y1) obj).serialize(eVar, iLogger);
            return;
        }
        if (obj instanceof Collection) {
            q(eVar, iLogger, (Collection) obj);
            return;
        }
        int i7 = 0;
        if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            ArrayList arrayList = new ArrayList(zArr.length);
            int length = zArr.length;
            while (i7 < length) {
                arrayList.add(Boolean.valueOf(zArr[i7]));
                i7++;
            }
            q(eVar, iLogger, arrayList);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            ArrayList arrayList2 = new ArrayList(bArr.length);
            int length2 = bArr.length;
            while (i7 < length2) {
                arrayList2.add(Byte.valueOf(bArr[i7]));
                i7++;
            }
            q(eVar, iLogger, arrayList2);
            return;
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            ArrayList arrayList3 = new ArrayList(sArr.length);
            int length3 = sArr.length;
            while (i7 < length3) {
                arrayList3.add(Short.valueOf(sArr[i7]));
                i7++;
            }
            q(eVar, iLogger, arrayList3);
            return;
        }
        if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            ArrayList arrayList4 = new ArrayList(cArr.length);
            int length4 = cArr.length;
            while (i7 < length4) {
                arrayList4.add(Character.valueOf(cArr[i7]));
                i7++;
            }
            q(eVar, iLogger, arrayList4);
            return;
        }
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            ArrayList arrayList5 = new ArrayList(iArr.length);
            int length5 = iArr.length;
            while (i7 < length5) {
                arrayList5.add(Integer.valueOf(iArr[i7]));
                i7++;
            }
            q(eVar, iLogger, arrayList5);
            return;
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            ArrayList arrayList6 = new ArrayList(jArr.length);
            int length6 = jArr.length;
            while (i7 < length6) {
                arrayList6.add(Long.valueOf(jArr[i7]));
                i7++;
            }
            q(eVar, iLogger, arrayList6);
            return;
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            ArrayList arrayList7 = new ArrayList(fArr.length);
            int length7 = fArr.length;
            while (i7 < length7) {
                arrayList7.add(Float.valueOf(fArr[i7]));
                i7++;
            }
            q(eVar, iLogger, arrayList7);
            return;
        }
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            ArrayList arrayList8 = new ArrayList(dArr.length);
            int length8 = dArr.length;
            while (i7 < length8) {
                arrayList8.add(Double.valueOf(dArr[i7]));
                i7++;
            }
            q(eVar, iLogger, arrayList8);
            return;
        }
        if (obj.getClass().isArray()) {
            q(eVar, iLogger, Arrays.asList((Object[]) obj));
            return;
        }
        if (obj instanceof Map) {
            r(eVar, iLogger, (Map) obj);
            return;
        }
        if (obj instanceof Locale) {
            eVar.f(obj.toString());
            return;
        }
        if (obj instanceof AtomicIntegerArray) {
            q(eVar, iLogger, io.sentry.util.c.a((AtomicIntegerArray) obj));
            return;
        }
        if (obj instanceof AtomicBoolean) {
            eVar.j(((AtomicBoolean) obj).get());
            return;
        }
        if (obj instanceof URI) {
            eVar.f(obj.toString());
            return;
        }
        if (obj instanceof InetAddress) {
            eVar.f(obj.toString());
            return;
        }
        if (obj instanceof UUID) {
            eVar.f(obj.toString());
            return;
        }
        if (obj instanceof Currency) {
            eVar.f(obj.toString());
            return;
        }
        if (obj instanceof Calendar) {
            r(eVar, iLogger, io.sentry.util.c.d((Calendar) obj));
            return;
        }
        if (obj.getClass().isEnum()) {
            eVar.f(obj.toString());
            return;
        }
        try {
            p(eVar, iLogger, ((b0) this.f21117d).E(iLogger, obj));
        } catch (Exception e12) {
            iLogger.g(SentryLevel.ERROR, "Failed serializing unknown object.", e12);
            eVar.f("[OBJECT]");
        }
    }

    public void q(e4.e eVar, ILogger iLogger, Collection collection) throws IOException {
        io.sentry.vendor.gson.stream.c cVar = (io.sentry.vendor.gson.stream.c) eVar.f7971e;
        cVar.q();
        cVar.c();
        int i7 = cVar.f13264i;
        int[] iArr = cVar.f13263e;
        if (i7 == iArr.length) {
            cVar.f13263e = Arrays.copyOf(iArr, i7 * 2);
        }
        int[] iArr2 = cVar.f13263e;
        int i10 = cVar.f13264i;
        cVar.f13264i = i10 + 1;
        iArr2[i10] = 1;
        cVar.f13262d.write(91);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            p(eVar, iLogger, it.next());
        }
        cVar.f(']', 1, 2);
    }

    public void r(e4.e eVar, ILogger iLogger, Map map) throws IOException {
        eVar.q();
        for (Object obj : map.keySet()) {
            if (obj instanceof String) {
                eVar.v((String) obj);
                p(eVar, iLogger, map.get(obj));
            }
        }
        eVar.l();
    }

    @Override // r8.c
    public void release(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        try {
            ((pa.c) this.f21117d).a(bitmap);
        } finally {
            bitmap.recycle();
        }
    }

    public void s(Exception exc) {
        j4.e eVar = (j4.e) this.f21117d;
        synchronized (eVar.f13658a) {
            try {
                if (eVar.f13659b) {
                    throw new IllegalStateException("Cannot set the error on a completed task.");
                }
                eVar.f13659b = true;
                eVar.f13662e = exc;
                eVar.f13658a.notifyAll();
                eVar.e();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public synchronized void u() {
        b bVar = (b) this.f21117d;
        ReentrantLock reentrantLock = bVar.f21098a;
        reentrantLock.lock();
        try {
            bVar.f21099b.edit().clear().apply();
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public i(Context context, int i7) {
        boolean zIsEmpty;
        String strD;
        switch (i7) {
            case 6:
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
                this.f21117d = sharedPreferences;
                File file = new File(context.getNoBackupFilesDir(), "com.google.android.gms.appid-no-backup");
                if (file.exists()) {
                    return;
                }
                try {
                    if (file.createNewFile()) {
                        synchronized (this) {
                            zIsEmpty = sharedPreferences.getAll().isEmpty();
                        }
                        if (zIsEmpty) {
                            return;
                        }
                        Log.i("FirebaseMessaging", "App restored, clearing state");
                        synchronized (this) {
                            sharedPreferences.edit().clear().commit();
                        }
                        return;
                    }
                    return;
                } catch (IOException e10) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e10.getMessage());
                        return;
                    }
                    return;
                }
            default:
                b bVarA = b.a(context);
                this.f21117d = bVarA;
                bVarA.b();
                String strD2 = bVarA.d("defaultGoogleSignInAccount");
                if (TextUtils.isEmpty(strD2) || (strD = bVarA.d(b.f("googleSignInOptions", strD2))) == null) {
                    return;
                }
                try {
                    GoogleSignInOptions.h(strD);
                    return;
                } catch (JSONException unused) {
                    return;
                }
        }
    }

    public i(WorkDatabase workDatabase) {
        Intrinsics.checkNotNullParameter(workDatabase, "workDatabase");
        this.f21117d = workDatabase;
    }

    public i(ClassLoader classLoader) {
        Intrinsics.checkNotNullParameter(classLoader, "classLoader");
        this.f21117d = classLoader;
    }

    public i(int i7, boolean z5) {
        switch (i7) {
            case 8:
                this.f21117d = new i(oj.a.f17263l);
                break;
            case 11:
                this.f21117d = new LinkedHashSet();
                break;
            case 12:
                this.f21117d = new CopyOnWriteArrayList();
                break;
            case 19:
                this.f21117d = new io.sentry.util.e(new hm.a(28));
                break;
            case 20:
                this.f21117d = new j4.e();
                break;
            default:
                TimeUnit timeUnit = TimeUnit.MINUTES;
                Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
                gs.m delegate = new gs.m(fs.c.f9420h);
                Intrinsics.checkNotNullParameter(delegate, "delegate");
                this.f21117d = delegate;
                break;
        }
    }

    public i(WindowInsetsController windowInsetsController) {
        androidx.core.view.b0 b0Var = new androidx.core.view.b0(null);
        b0Var.f1632i = windowInsetsController;
        this.f21117d = b0Var;
    }

    public i(ga.h hVar, m mVar) {
        this.f21117d = mVar;
    }
}
