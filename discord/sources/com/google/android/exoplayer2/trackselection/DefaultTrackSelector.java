package com.google.android.exoplayer2.trackselection;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import cl.b;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.audio.AudioAttributes;
import ei.q0;
import ei.r0;
import ei.u;
import fe.g;
import fe.j;
import fe.l;
import fe.m;
import fe.o;
import fe.r;
import fe.s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.RandomAccess;
import je.e0;
import md.x0;
import md.y0;

/* JADX INFO: loaded from: classes3.dex */
public final class DefaultTrackSelector extends r {
    public static final q0 k = new u(new b(6));

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final q0 f5727l = new u(new b(7));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f5728d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f5729e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k8.a f5730f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f5731g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a f5732h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final j f5733i;
    public AudioAttributes j;

    public DefaultTrackSelector(TrackSelectionParameters trackSelectionParameters, k8.a aVar, Context context) {
        this.f5728d = new Object();
        this.f5729e = context != null ? context.getApplicationContext() : null;
        this.f5730f = aVar;
        if (trackSelectionParameters instanceof a) {
            this.f5732h = (a) trackSelectionParameters;
        } else {
            a aVar2 = context != null ? new a(new g(context)) : a.f5747n0;
            aVar2.getClass();
            g gVar = new g(aVar2);
            gVar.a(trackSelectionParameters);
            this.f5732h = new a(gVar);
        }
        this.j = AudioAttributes.f5627y;
        boolean z5 = context != null && e0.H(context);
        this.f5731g = z5;
        if (!z5 && context != null && e0.f13788a >= 32) {
            this.f5733i = j.f(context);
        }
        if (this.f5732h.f5754g0 && context == null) {
            je.b.N("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static void a(y0 y0Var, a aVar, HashMap map) {
        for (int i7 = 0; i7 < y0Var.f15737d; i7++) {
            s sVar = (s) aVar.V.get(y0Var.a(i7));
            if (sVar != null) {
                x0 x0Var = sVar.f9119d;
                s sVar2 = (s) map.get(Integer.valueOf(x0Var.f15729i));
                if (sVar2 == null || (sVar2.f9120e.isEmpty() && !sVar.f9120e.isEmpty())) {
                    map.put(Integer.valueOf(x0Var.f15729i), sVar);
                }
            }
        }
    }

    public static int b(Format format, String str, boolean z5) {
        if (!TextUtils.isEmpty(str) && str.equals(format.f5528i)) {
            return 4;
        }
        String strF = f(str);
        String strF2 = f(format.f5528i);
        if (strF2 == null || strF == null) {
            return (z5 && strF2 == null) ? 1 : 0;
        }
        if (strF2.startsWith(strF) || strF.startsWith(strF2)) {
            return 3;
        }
        int i7 = e0.f13788a;
        return strF2.split("-", 2)[0].equals(strF.split("-", 2)[0]) ? 2 : 0;
    }

    public static boolean d(int i7, boolean z5) {
        int i10 = i7 & 7;
        if (i10 != 4) {
            return z5 && i10 == 3;
        }
        return true;
    }

    public static String f(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static Pair g(int i7, MappingTrackSelector$MappedTrackInfo mappingTrackSelector$MappedTrackInfo, int[][][] iArr, l lVar, Comparator comparator) {
        int i10;
        RandomAccess randomAccessR;
        MappingTrackSelector$MappedTrackInfo mappingTrackSelector$MappedTrackInfo2 = mappingTrackSelector$MappedTrackInfo;
        ArrayList arrayList = new ArrayList();
        int i11 = mappingTrackSelector$MappedTrackInfo2.f5734a;
        int i12 = 0;
        while (i12 < i11) {
            if (i7 == mappingTrackSelector$MappedTrackInfo2.f5735b[i12]) {
                y0 y0Var = mappingTrackSelector$MappedTrackInfo2.f5736c[i12];
                for (int i13 = 0; i13 < y0Var.f15737d; i13++) {
                    x0 x0VarA = y0Var.a(i13);
                    r0 r0VarC = lVar.c(i12, x0VarA, iArr[i12][i13]);
                    int i14 = x0VarA.f15727d;
                    boolean[] zArr = new boolean[i14];
                    int i15 = 0;
                    while (i15 < i14) {
                        m mVar = (m) r0VarC.get(i15);
                        int iA = mVar.a();
                        if (zArr[i15] || iA == 0) {
                            i10 = i11;
                        } else {
                            if (iA == 1) {
                                randomAccessR = ei.e0.r(mVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(mVar);
                                int i16 = i15 + 1;
                                while (i16 < i14) {
                                    m mVar2 = (m) r0VarC.get(i16);
                                    int i17 = i11;
                                    if (mVar2.a() == 2 && mVar.b(mVar2)) {
                                        arrayList2.add(mVar2);
                                        zArr[i16] = true;
                                    }
                                    i16++;
                                    i11 = i17;
                                }
                                randomAccessR = arrayList2;
                            }
                            i10 = i11;
                            arrayList.add(randomAccessR);
                        }
                        i15++;
                        i11 = i10;
                    }
                }
            }
            i12++;
            mappingTrackSelector$MappedTrackInfo2 = mappingTrackSelector$MappedTrackInfo;
            i11 = i11;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i18 = 0; i18 < list.size(); i18++) {
            iArr2[i18] = ((m) list.get(i18)).f9107i;
        }
        m mVar3 = (m) list.get(0);
        return Pair.create(new o(0, mVar3.f9106e, iArr2), Integer.valueOf(mVar3.f9105d));
    }

    public final a c() {
        a aVar;
        synchronized (this.f5728d) {
            aVar = this.f5732h;
        }
        return aVar;
    }

    public final void e() {
        boolean z5;
        gc.e0 e0Var;
        j jVar;
        synchronized (this.f5728d) {
            try {
                z5 = this.f5732h.f5754g0 && !this.f5731g && e0.f13788a >= 32 && (jVar = this.f5733i) != null && jVar.f9099b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!z5 || (e0Var = this.f9114a) == null) {
            return;
        }
        e0Var.E.d(10);
    }

    public final void h(TrackSelectionParameters trackSelectionParameters) {
        if (trackSelectionParameters instanceof a) {
            i((a) trackSelectionParameters);
        }
        g gVar = new g(c());
        gVar.a(trackSelectionParameters);
        i(new a(gVar));
    }

    public final void i(a aVar) {
        boolean zEquals;
        aVar.getClass();
        synchronized (this.f5728d) {
            zEquals = this.f5732h.equals(aVar);
            this.f5732h = aVar;
        }
        if (zEquals) {
            return;
        }
        if (aVar.f5754g0 && this.f5729e == null) {
            je.b.N("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        gc.e0 e0Var = this.f9114a;
        if (e0Var != null) {
            e0Var.E.d(10);
        }
    }

    public DefaultTrackSelector(Context context) {
        k8.a aVar = new k8.a();
        a aVar2 = a.f5747n0;
        this(new a(new g(context)), aVar, context);
    }
}
