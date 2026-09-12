package e4;

import a5.b0;
import a5.l0;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import android.widget.EditText;
import androidx.work.impl.WorkDatabase_Impl;
import com.discord.js_watchdog.SharedPreferencesKey;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.internal.play_billing.v1;
import gc.a1;
import gc.b1;
import gc.c1;
import gc.d1;
import gc.f1;
import gc.g1;
import gc.n1;
import i0.u;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.l4;
import io.sentry.p4;
import io.sentry.protocol.t;
import io.sentry.w5;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import je.a0;
import je.e0;
import kh.v;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import l4.g0;
import md.n0;
import md.s;
import md.w;
import pc.x;
import pp.k0;
import pp.m0;
import sh.q0;
import sh.r0;
import sh.s0;
import sh.t0;
import sh.u0;
import sh.v0;
import vp.i0;

/* JADX INFO: loaded from: classes.dex */
public class c implements vd.f, w, mc.o, ILogger, rp.f, u0, ig.f, pc.e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7965d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f7966e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f7967i;

    public /* synthetic */ c(int i7, Object obj, Object obj2) {
        this.f7965d = i7;
        this.f7966e = obj;
        this.f7967i = obj2;
    }

    public static boolean L(Bitmap bitmap) {
        if (bitmap == null) {
            return false;
        }
        if (bitmap.isRecycled()) {
            o8.a.z("BitmapPoolBackend", "Cannot reuse a recycled bitmap: %s", bitmap);
            return false;
        }
        if (bitmap.isMutable()) {
            return true;
        }
        o8.a.z("BitmapPoolBackend", "Cannot reuse an immutable bitmap: %s", bitmap);
        return false;
    }

    public static c R(InputStream inputStream) throws IOException {
        String str;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        byte b10 = dataInputStream.readByte();
        if (b10 == 1) {
            str = "arm64-v8a";
        } else if (b10 == 2) {
            str = "armeabi-v7a";
        } else if (b10 == 3) {
            str = "x86_64";
        } else {
            if (b10 != 4) {
                throw new RuntimeException(kk.b.h(b10, "Unrecognized arch id: "));
            }
            str = "x86";
        }
        int i7 = dataInputStream.readShort() & 65535;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < i7; i10++) {
            byte[] bArr = new byte[dataInputStream.readShort() & 65535];
            dataInputStream.readFully(bArr);
            arrayList.add(new String(bArr, StandardCharsets.UTF_8));
        }
        return new c(str, arrayList);
    }

    public c A(Object value, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        String string = value.toString();
        ((ArrayList) this.f7967i).add(key + ": " + string);
        return this;
    }

    public int B(int i7) {
        ak.a aVar = (ak.a) this.f7966e;
        int[] iArr = (int[]) this.f7967i;
        if (i7 == 0) {
            return F(0);
        }
        if (i7 == 1) {
            int iA = 0;
            for (int i10 : iArr) {
                iA = aVar.a(iA, i10);
            }
            return iA;
        }
        int iA2 = iArr[0];
        int length = iArr.length;
        for (int i11 = 1; i11 < length; i11++) {
            iA2 = aVar.a(aVar.c(i7, iA2), iArr[i11]);
        }
        return iA2;
    }

    public void C() {
        w3.q.g(((String) this.f7966e).concat(""));
    }

    public Bitmap D(int i7) {
        Object objPollFirst;
        n8.f fVar = (n8.f) this.f7967i;
        synchronized (fVar) {
            pa.g gVar = (pa.g) ((SparseArray) fVar.f16510e).get(i7);
            if (gVar == null) {
                objPollFirst = null;
            } else {
                objPollFirst = gVar.f17817c.pollFirst();
                if (((pa.g) fVar.f16512v) != gVar) {
                    fVar.d0(gVar);
                    pa.g gVar2 = (pa.g) fVar.f16512v;
                    if (gVar2 == null) {
                        fVar.f16512v = gVar;
                        fVar.f16511i = gVar;
                    } else {
                        gVar.f17818d = gVar2;
                        gVar2.f17815a = gVar;
                        fVar.f16512v = gVar;
                    }
                }
            }
        }
        if (objPollFirst != null) {
            synchronized (this) {
                ((HashSet) this.f7966e).remove(objPollFirst);
            }
        }
        Bitmap bitmap = (Bitmap) objPollFirst;
        if (bitmap == null || !L(bitmap)) {
            return null;
        }
        bitmap.eraseColor(0);
        return bitmap;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003e  */
    /* JADX WARN: Code duplicated, block: B:17:0x0046  */
    /* JADX WARN: Code duplicated, block: B:20:0x0059  */
    public CctBackendFactory E(String str) {
        Bundle bundle;
        Map map;
        Object obj;
        if (((Map) this.f7967i) == null) {
            Context context = (Context) this.f7966e;
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                } else {
                    ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                    if (serviceInfo == null) {
                        Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                    } else {
                        bundle = serviceInfo.metaData;
                    }
                    if (bundle == null) {
                        Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                        map = Collections.EMPTY_MAP;
                    } else {
                        HashMap map2 = new HashMap();
                        for (String str2 : bundle.keySet()) {
                            obj = bundle.get(str2);
                            if (!(obj instanceof String) && str2.startsWith("backend:")) {
                                for (String str3 : ((String) obj).split(",", -1)) {
                                    String strTrim = str3.trim();
                                    if (!strTrim.isEmpty()) {
                                        map2.put(strTrim, str2.substring(8));
                                    }
                                }
                            }
                        }
                        map = map2;
                    }
                    this.f7967i = map;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
            }
            bundle = null;
            if (bundle == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                map = Collections.EMPTY_MAP;
            } else {
                HashMap map3 = new HashMap();
                while (r6.hasNext()) {
                    obj = bundle.get(str2);
                    if (!(obj instanceof String)) {
                    }
                }
                map = map3;
            }
            this.f7967i = map;
        }
        String str4 = (String) ((Map) this.f7967i).get(str);
        if (str4 == null) {
            return null;
        }
        try {
            return (CctBackendFactory) Class.forName(str4).asSubclass(CctBackendFactory.class).getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e10) {
            Log.w("BackendRegistry", "Class " + str4 + " is not found.", e10);
            return null;
        } catch (IllegalAccessException e11) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e11);
            return null;
        } catch (InstantiationException e12) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e12);
            return null;
        } catch (NoSuchMethodException e13) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e13);
            return null;
        } catch (InvocationTargetException e14) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e14);
            return null;
        }
    }

    public int F(int i7) {
        int[] iArr = (int[]) this.f7967i;
        return iArr[(iArr.length - 1) - i7];
    }

    public int G() {
        return ((int[]) this.f7967i).length - 1;
    }

    public ArrayList H(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f7966e;
        a3.o oVarG = a3.o.g(1, "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
        if (str == null) {
            oVarG.R(1);
        } else {
            oVarG.o(1, str);
        }
        workDatabase_Impl.b();
        Cursor cursorM = l0.M(workDatabase_Impl, oVarG);
        try {
            ArrayList arrayList = new ArrayList(cursorM.getCount());
            while (cursorM.moveToNext()) {
                arrayList.add(cursorM.isNull(0) ? null : cursorM.getString(0));
            }
            return arrayList;
        } finally {
            cursorM.close();
            oVarG.i();
        }
    }

    public Pair I(int i7, s sVar) {
        s sVarB;
        f1 f1Var = (f1) this.f7966e;
        s sVar2 = null;
        if (sVar != null) {
            int i10 = 0;
            while (true) {
                if (i10 >= f1Var.f9632c.size()) {
                    sVarB = null;
                    break;
                }
                if (((s) f1Var.f9632c.get(i10)).f15692d == sVar.f15692d) {
                    Object obj = sVar.f15689a;
                    Object obj2 = f1Var.f9631b;
                    int i11 = n1.H;
                    sVarB = sVar.b(Pair.create(obj2, obj));
                    break;
                }
                i10++;
            }
            if (sVarB == null) {
                return null;
            }
            sVar2 = sVarB;
        }
        return Pair.create(Integer.valueOf(i7 + f1Var.f9633d), sVar2);
    }

    public Object J(v vVar) {
        return (g0) this.f7967i;
    }

    public Object K(float f2, float f7, Object obj, Object obj2, float f10, float f11, float f12) {
        v vVar = (v) this.f7966e;
        vVar.f14529a = f2;
        vVar.f14530b = f7;
        vVar.f14534f = obj;
        vVar.f14535g = obj2;
        vVar.f14531c = f10;
        vVar.f14532d = f11;
        vVar.f14533e = f12;
        return J(vVar);
    }

    public boolean M() {
        return ((int[]) this.f7967i)[0] == 0;
    }

    public g0.n N() {
        g0.n nVar = (g0.n) ((u.n) this.f7967i).getValue();
        if (nVar != null) {
            return nVar;
        }
        throw new IllegalStateException("Intrinsic size is queried but there is no measure policy in place.");
    }

    public c O(int i7) {
        int[] iArr = (int[]) this.f7967i;
        ak.a aVar = (ak.a) this.f7966e;
        if (i7 == 0) {
            return aVar.f633c;
        }
        if (i7 == 1) {
            return this;
        }
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr2[i10] = aVar.c(iArr[i10], i7);
        }
        return new c(aVar, iArr2);
    }

    public c P(c cVar) {
        ak.a aVar = (ak.a) this.f7966e;
        if (!aVar.equals((ak.a) cVar.f7966e)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        }
        if (M() || cVar.M()) {
            return aVar.f633c;
        }
        int[] iArr = (int[]) this.f7967i;
        int length = iArr.length;
        int[] iArr2 = (int[]) cVar.f7967i;
        int length2 = iArr2.length;
        int[] iArr3 = new int[(length + length2) - 1];
        for (int i7 = 0; i7 < length; i7++) {
            int i10 = iArr[i7];
            for (int i11 = 0; i11 < length2; i11++) {
                int i12 = i7 + i11;
                iArr3[i12] = aVar.a(iArr3[i12], aVar.c(i10, iArr2[i11]));
            }
        }
        return new c(aVar, iArr3);
    }

    public Object Q() {
        Object obj;
        n8.f fVar = (n8.f) this.f7967i;
        synchronized (fVar) {
            pa.g gVar = (pa.g) fVar.f16511i;
            if (gVar == null) {
                obj = null;
            } else {
                Object objPollLast = gVar.f17817c.pollLast();
                if (gVar.f17817c.isEmpty()) {
                    fVar.d0(gVar);
                    ((SparseArray) fVar.f16510e).remove(gVar.f17816b);
                }
                obj = objPollLast;
            }
        }
        if (obj == null) {
            return obj;
        }
        synchronized (this) {
            ((HashSet) this.f7966e).remove(obj);
        }
        return obj;
    }

    public je.a S() throws IOException {
        File file = (File) this.f7967i;
        File file2 = (File) this.f7966e;
        if (file2.exists()) {
            if (file.exists()) {
                file2.delete();
            } else if (!file2.renameTo(file)) {
                je.b.N("AtomicFile", "Couldn't rename file " + file2 + " to backup file " + file);
            }
        }
        try {
            return new je.a(file2);
        } catch (FileNotFoundException e10) {
            File parentFile = file2.getParentFile();
            if (parentFile == null || !parentFile.mkdirs()) {
                throw new IOException("Couldn't create " + file2, e10);
            }
            try {
                return new je.a(file2);
            } catch (FileNotFoundException e11) {
                throw new IOException("Couldn't create " + file2, e11);
            }
        }
    }

    public c T(c cVar) {
        if (!((ak.a) this.f7966e).equals((ak.a) cVar.f7966e)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        }
        if (cVar.M()) {
            return this;
        }
        ak.a aVar = (ak.a) cVar.f7966e;
        int[] iArr = (int[]) cVar.f7967i;
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i7 = 0; i7 < length; i7++) {
            int i10 = iArr[i7];
            aVar.getClass();
            iArr2[i7] = (929 - i10) % 929;
        }
        return z(new c(aVar, iArr2));
    }

    public x U(int i7) {
        int i10 = 0;
        while (true) {
            int[] iArr = (int[]) this.f7966e;
            if (i10 >= iArr.length) {
                je.b.r("BaseMediaChunkOutput", "Unmatched track of type: " + i7);
                return new pc.j();
            }
            if (i7 == iArr[i10]) {
                return ((n0[]) this.f7967i)[i10];
            }
            i10++;
        }
    }

    public rn.v V(int i7) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z5 = false;
        while (i7 != -1) {
            pp.l0 l0Var = (pp.l0) ((m0) this.f7967i).f18372e.get(i7);
            String str = (String) ((pp.n0) this.f7966e).f18384e.get(l0Var.f18361v);
            k0 k0Var = l0Var.f18362w;
            Intrinsics.checkNotNull(k0Var);
            int iOrdinal = k0Var.ordinal();
            if (iOrdinal == 0) {
                linkedList2.addFirst(str);
            } else if (iOrdinal == 1) {
                linkedList.addFirst(str);
            } else {
                if (iOrdinal != 2) {
                    throw new rn.n();
                }
                linkedList2.addFirst(str);
                z5 = true;
            }
            i7 = l0Var.f18360i;
        }
        return new rn.v(linkedList, linkedList2, Boolean.valueOf(z5));
    }

    public void W(int i7, v1 v1Var) throws IOException {
        Iterator it = (Iterator) this.f7966e;
        while (true) {
            Map.Entry entry = (Map.Entry) this.f7967i;
            if (entry == null || ((vp.l) entry.getKey()).f21907d >= i7) {
                return;
            }
            vp.l lVar = (vp.l) ((Map.Entry) this.f7967i).getKey();
            Object value = ((Map.Entry) this.f7967i).getValue();
            vp.h hVar = vp.h.f21886c;
            i0 i0Var = lVar.f21908e;
            int i10 = lVar.f21907d;
            if (lVar.f21909i) {
                for (Object obj : (List) value) {
                    if (i0Var == i0.f21892w) {
                        v1Var.C(i10, 3);
                        ((vp.a) obj).f(v1Var);
                        v1Var.C(i10, 4);
                    } else {
                        v1Var.C(i10, i0Var.f21896e);
                        vp.h.k(v1Var, i0Var, obj);
                    }
                }
            } else if (i0Var == i0.f21892w) {
                v1Var.C(i10, 3);
                ((vp.a) value).f(v1Var);
                v1Var.C(i10, 4);
            } else {
                v1Var.C(i10, i0Var.f21896e);
                vp.h.k(v1Var, i0Var, value);
            }
            if (it.hasNext()) {
                this.f7967i = (Map.Entry) it.next();
            } else {
                this.f7967i = null;
            }
        }
    }

    public void X(boolean z5, Status status) {
        HashMap map;
        HashMap map2;
        synchronized (((Map) this.f7966e)) {
            map = new HashMap((Map) this.f7966e);
        }
        synchronized (((Map) this.f7967i)) {
            map2 = new HashMap((Map) this.f7967i);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z5 || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).forceFailureUnlessReady(status);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z5 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((ig.g) entry2.getKey()).c(new ye.e(status));
            }
        }
    }

    @Override // sh.u0
    public Object a() {
        v0 v0Var = (v0) this.f7966e;
        Bundle bundle = (Bundle) this.f7967i;
        int i7 = bundle.getInt(SharedPreferencesKey.SESSION_ID);
        if (i7 == 0) {
            return Boolean.FALSE;
        }
        HashMap map = v0Var.f20210c;
        th.f fVar = v0Var.f20212e;
        Integer numValueOf = Integer.valueOf(i7);
        if (map.containsKey(numValueOf)) {
            r0 r0Var = v0Var.a(i7).f20176c;
            String str = r0Var.f20161a;
            int i10 = bundle.getInt(sa.a.a("status", str));
            int i11 = r0Var.f20164d;
            if (sh.m0.d(i11, i10)) {
                v0.f20207g.a("Found stale update for session %s with status %d.", numValueOf, Integer.valueOf(i11));
                int i12 = r0Var.f20164d;
                if (i12 == 4) {
                    ((sh.v1) fVar.a()).c(i7, str);
                } else if (i12 == 5) {
                    ((sh.v1) fVar.a()).b(i7);
                } else if (i12 == 6) {
                    ((sh.v1) fVar.a()).e(Arrays.asList(str));
                }
            } else {
                r0Var.f20164d = i10;
                if (i10 == 5 || i10 == 6 || i10 == 4) {
                    v0Var.b(new b0(i7, 19, v0Var));
                    v0Var.f20209b.b(str);
                } else {
                    for (t0 t0Var : r0Var.f20166f) {
                        ArrayList parcelableArrayList = bundle.getParcelableArrayList(sa.a.d("chunk_intents", str, t0Var.f20188a));
                        if (parcelableArrayList != null) {
                            for (int i13 = 0; i13 < parcelableArrayList.size(); i13++) {
                                if (parcelableArrayList.get(i13) != null && ((Intent) parcelableArrayList.get(i13)).getData() != null) {
                                    ((q0) t0Var.f20191d.get(i13)).f20155a = true;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            ArrayList<String> stringArrayList = bundle.getStringArrayList("pack_names");
            if (stringArrayList == null || stringArrayList.isEmpty()) {
                throw new sh.l0("Session without pack received.");
            }
            String str2 = stringArrayList.get(0);
            long j = bundle.getLong(sa.a.a("pack_version", str2));
            String string = bundle.getString(sa.a.a("pack_version_tag", str2), "");
            int i14 = bundle.getInt(sa.a.a("status", str2));
            long j5 = bundle.getLong(sa.a.a("total_bytes_to_download", str2));
            List<String> stringArrayList2 = bundle.getStringArrayList(sa.a.a("slice_ids", str2));
            ArrayList arrayList = new ArrayList();
            if (stringArrayList2 == null) {
                stringArrayList2 = Collections.EMPTY_LIST;
            }
            for (String str3 : stringArrayList2) {
                List parcelableArrayList2 = bundle.getParcelableArrayList(sa.a.d("chunk_intents", str2, str3));
                ArrayList arrayList2 = new ArrayList();
                if (parcelableArrayList2 == null) {
                    parcelableArrayList2 = Collections.EMPTY_LIST;
                }
                Iterator it = parcelableArrayList2.iterator();
                while (it.hasNext()) {
                    boolean z5 = ((Intent) it.next()) != null;
                    long j7 = j5;
                    q0 q0Var = new q0();
                    q0Var.f20155a = z5;
                    arrayList2.add(q0Var);
                    j5 = j7;
                }
                long j10 = j5;
                String string2 = bundle.getString(sa.a.d("uncompressed_hash_sha256", str2, str3));
                long j11 = bundle.getLong(sa.a.d("uncompressed_size", str2, str3));
                int i15 = bundle.getInt(sa.a.d("patch_format", str2, str3), 0);
                arrayList.add(i15 != 0 ? new t0(str3, string2, j11, arrayList2, 0, i15) : new t0(str3, string2, j11, arrayList2, bundle.getInt(sa.a.d("compression_format", str2, str3), 0), 0));
                j5 = j10;
            }
            v0Var.f20210c.put(Integer.valueOf(i7), new s0(i7, bundle.getInt("app_version_code"), new r0(str2, j, i14, j5, arrayList, string)));
        }
        return Boolean.TRUE;
    }

    @Override // mc.o
    public void b(int i7, s sVar) {
        Pair pairI = I(i7, sVar);
        if (pairI != null) {
            ((a0) ((g1) this.f7967i).j).c(new b1(this, pairI, 0));
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:39:0x00e7
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // pc.e
    public pc.d c(pc.l r17, long r18) {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.c.c(pc.l, long):pc.d");
    }

    @Override // md.w
    public void d(int i7, s sVar, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z5) {
        Pair pairI = I(i7, sVar);
        if (pairI != null) {
            ((a0) ((g1) this.f7967i).j).c(new d1(this, pairI, loadEventInfo, mediaLoadData, iOException, z5, 0));
        }
    }

    @Override // io.sentry.ILogger
    public void e(SentryLevel sentryLevel, Throwable th2, String str, Object... objArr) {
        ILogger iLogger = (ILogger) this.f7967i;
        if (iLogger == null || !s(sentryLevel)) {
            return;
        }
        iLogger.e(sentryLevel, th2, str, objArr);
    }

    @Override // vd.f
    public int f(long j) {
        int i7;
        ArrayList arrayList = (ArrayList) this.f7967i;
        Long lValueOf = Long.valueOf(j);
        int i10 = e0.f13788a;
        int iBinarySearch = Collections.binarySearch(arrayList, lValueOf);
        if (iBinarySearch < 0) {
            i7 = ~iBinarySearch;
        } else {
            int size = arrayList.size();
            do {
                iBinarySearch++;
                if (iBinarySearch >= size) {
                    break;
                }
            } while (((Comparable) arrayList.get(iBinarySearch)).compareTo(lValueOf) == 0);
            i7 = iBinarySearch;
        }
        if (i7 < arrayList.size()) {
            return i7;
        }
        return -1;
    }

    @Override // io.sentry.ILogger
    public void g(SentryLevel sentryLevel, String str, Throwable th2) {
        ILogger iLogger = (ILogger) this.f7967i;
        if (iLogger == null || !s(sentryLevel)) {
            return;
        }
        iLogger.g(sentryLevel, str, th2);
    }

    @Override // rp.f
    public String getString(int i7) {
        String str = (String) ((pp.n0) this.f7966e).f18384e.get(i7);
        Intrinsics.checkNotNullExpressionValue(str, "getString(...)");
        return str;
    }

    @Override // vd.f
    public long h(int i7) {
        ArrayList arrayList = (ArrayList) this.f7967i;
        je.b.g(i7 >= 0);
        je.b.g(i7 < arrayList.size());
        return ((Long) arrayList.get(i7)).longValue();
    }

    @Override // ig.f
    public ig.l i(Object obj) {
        com.google.android.play.core.integrity.a aVar = (com.google.android.play.core.integrity.a) this.f7966e;
        return l0.v(new com.google.android.play.core.integrity.e(aVar.f6508b, ((wh.r) this.f7967i).f22303a, ((Long) obj).longValue()));
    }

    @Override // md.w
    public void j(int i7, s sVar, MediaLoadData mediaLoadData) {
        Pair pairI = I(i7, sVar);
        if (pairI != null) {
            ((a0) ((g1) this.f7967i).j).c(new c1(this, pairI, mediaLoadData, 0));
        }
    }

    @Override // rp.f
    public String k(int i7) {
        rn.v vVarV = V(i7);
        List list = (List) vVarV.f19497d;
        String strO = CollectionsKt.O((List) vVarV.f19498e, ".", null, null, null, 62);
        if (list.isEmpty()) {
            return strO;
        }
        return CollectionsKt.O(list, "/", null, null, null, 62) + '/' + strO;
    }

    @Override // vd.f
    public List l(long j) {
        int iC = e0.c(Long.valueOf(j), false, (ArrayList) this.f7967i);
        return iC == -1 ? Collections.EMPTY_LIST : (List) ((ArrayList) this.f7966e).get(iC);
    }

    @Override // md.w
    public void m(int i7, s sVar, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        Pair pairI = I(i7, sVar);
        if (pairI != null) {
            ((a0) ((g1) this.f7967i).j).c(new a1(this, pairI, loadEventInfo, mediaLoadData, 2));
        }
    }

    @Override // md.w
    public void n(int i7, s sVar, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        Pair pairI = I(i7, sVar);
        if (pairI != null) {
            ((a0) ((g1) this.f7967i).j).c(new a1(this, pairI, loadEventInfo, mediaLoadData, 0));
        }
    }

    @Override // vd.f
    public int o() {
        return ((ArrayList) this.f7967i).size();
    }

    @Override // mc.o
    public void p(int i7, s sVar, Exception exc) {
        Pair pairI = I(i7, sVar);
        if (pairI != null) {
            ((a0) ((g1) this.f7967i).j).c(new ac.a(this, pairI, exc, 17));
        }
    }

    @Override // io.sentry.ILogger
    public void q(SentryLevel sentryLevel, String str, Object... objArr) {
        ILogger iLogger = (ILogger) this.f7967i;
        if (iLogger == null || !s(sentryLevel)) {
            return;
        }
        iLogger.q(sentryLevel, str, objArr);
    }

    @Override // mc.o
    public void r(int i7, s sVar, int i10) {
        Pair pairI = I(i7, sVar);
        if (pairI != null) {
            ((a0) ((g1) this.f7967i).j).c(new ab.a(this, pairI, i10, 9));
        }
    }

    @Override // io.sentry.ILogger
    public boolean s(SentryLevel sentryLevel) {
        w5 w5Var = (w5) this.f7966e;
        return sentryLevel != null && w5Var.isDebug() && sentryLevel.ordinal() >= w5Var.getDiagnosticLevel().ordinal();
    }

    @Override // mc.o
    public void t(int i7, s sVar) {
        Pair pairI = I(i7, sVar);
        if (pairI != null) {
            ((a0) ((g1) this.f7967i).j).c(new b1(this, pairI, 2));
        }
    }

    public String toString() {
        switch (this.f7965d) {
            case 3:
                StringBuilder sb2 = new StringBuilder(G() * 8);
                for (int iG = G(); iG >= 0; iG--) {
                    int iF = F(iG);
                    if (iF != 0) {
                        if (iF < 0) {
                            sb2.append(" - ");
                            iF = -iF;
                        } else if (sb2.length() > 0) {
                            sb2.append(" + ");
                        }
                        if (iG == 0 || iF != 1) {
                            sb2.append(iF);
                        }
                        if (iG != 0) {
                            if (iG == 1) {
                                sb2.append('x');
                            } else {
                                sb2.append("x^");
                                sb2.append(iG);
                            }
                        }
                    }
                }
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    @Override // mc.o
    public void u(int i7, s sVar) {
        Pair pairI = I(i7, sVar);
        if (pairI != null) {
            ((a0) ((g1) this.f7967i).j).c(new b1(this, pairI, 1));
        }
    }

    @Override // rp.f
    public boolean v(int i7) {
        return ((Boolean) V(i7).f19499i).booleanValue();
    }

    @Override // md.w
    public void w(int i7, s sVar, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        Pair pairI = I(i7, sVar);
        if (pairI != null) {
            ((a0) ((g1) this.f7967i).j).c(new a1(this, pairI, loadEventInfo, mediaLoadData, 1));
        }
    }

    @Override // md.w
    public void x(int i7, s sVar, MediaLoadData mediaLoadData) {
        Pair pairI = I(i7, sVar);
        if (pairI != null) {
            ((a0) ((g1) this.f7967i).j).c(new c1(this, pairI, mediaLoadData, 1));
        }
    }

    @Override // pc.e
    public void y() {
        je.w wVar = (je.w) this.f7967i;
        byte[] bArr = e0.f13793f;
        wVar.getClass();
        wVar.D(bArr, bArr.length);
    }

    public c z(c cVar) {
        ak.a aVar = (ak.a) this.f7966e;
        if (!aVar.equals((ak.a) cVar.f7966e)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        }
        if (M()) {
            return cVar;
        }
        if (cVar.M()) {
            return this;
        }
        int[] iArr = (int[]) this.f7967i;
        int[] iArr2 = (int[]) cVar.f7967i;
        if (iArr.length <= iArr2.length) {
            iArr = iArr2;
            iArr2 = iArr;
        }
        int[] iArr3 = new int[iArr.length];
        int length = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length);
        for (int i7 = length; i7 < iArr.length; i7++) {
            iArr3[i7] = aVar.a(iArr2[i7 - length], iArr[i7]);
        }
        return new c(aVar, iArr3);
    }

    public /* synthetic */ c(int i7, boolean z5) {
        this.f7965d = i7;
    }

    public c(pp.n0 strings, m0 qualifiedNames) {
        this.f7965d = 18;
        Intrinsics.checkNotNullParameter(strings, "strings");
        Intrinsics.checkNotNullParameter(qualifiedNames, "qualifiedNames");
        this.f7966e = strings;
        this.f7967i = qualifiedNames;
    }

    public c(String sectionName) {
        this.f7965d = 12;
        Intrinsics.checkNotNullParameter(sectionName, "sectionName");
        this.f7966e = sectionName;
        this.f7967i = new ArrayList();
    }

    public c(WorkDatabase_Impl database) {
        this.f7965d = 0;
        this.f7966e = database;
        Intrinsics.checkNotNullParameter(database, "database");
        this.f7967i = new b(database, false, 0);
    }

    public c(int i7) {
        this.f7965d = i7;
        switch (i7) {
            case 24:
                this.f7966e = new v();
                this.f7967i = null;
                break;
            case 25:
            default:
                this.f7966e = new HashSet();
                this.f7967i = new n8.f(5);
                break;
            case 26:
                this.f7966e = Collections.synchronizedMap(new WeakHashMap());
                this.f7967i = Collections.synchronizedMap(new WeakHashMap());
                break;
        }
    }

    public c(ak.a aVar, int[] iArr) {
        this.f7965d = 3;
        if (iArr.length != 0) {
            this.f7966e = aVar;
            int length = iArr.length;
            int i7 = 1;
            if (length > 1 && iArr[0] == 0) {
                while (i7 < length && iArr[i7] == 0) {
                    i7++;
                }
                if (i7 == length) {
                    this.f7967i = new int[]{0};
                    return;
                }
                int i10 = length - i7;
                int[] iArr2 = new int[i10];
                this.f7967i = iArr2;
                System.arraycopy(iArr, i7, iArr2, 0, i10);
                return;
            }
            this.f7967i = iArr;
            return;
        }
        throw new IllegalArgumentException();
    }

    public c(u layoutNode) {
        this.f7965d = 8;
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        this.f7966e = layoutNode;
        this.f7967i = mf.f.C(null);
    }

    public c(String str, ArrayList arrayList) {
        this.f7965d = 5;
        this.f7966e = str;
        this.f7967i = Collections.unmodifiableList(arrayList);
    }

    public c(l4 l4Var, List list) {
        this.f7965d = 10;
        com.facebook.imagepipeline.nativecode.c.H(l4Var, "SentryEnvelopeHeader is required.");
        this.f7966e = l4Var;
        com.facebook.imagepipeline.nativecode.c.H(list, "SentryEnvelope items are required.");
        this.f7967i = list;
    }

    public c(g0 g0Var) {
        this.f7965d = 24;
        this.f7966e = new v();
        this.f7967i = g0Var;
    }

    public c(io.sentry.protocol.v vVar, t tVar, p4 p4Var) {
        this.f7965d = 10;
        this.f7966e = new l4(vVar, tVar, null);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(p4Var);
        this.f7967i = arrayList;
    }

    public c(File file) {
        this.f7965d = 11;
        this.f7966e = file;
        this.f7967i = new File(file.getPath() + ".bak");
    }

    public c(je.b0 b0Var) {
        this.f7965d = 25;
        this.f7966e = b0Var;
        this.f7967i = new je.w();
    }

    public c(Context context) {
        this.f7965d = 22;
        this.f7967i = null;
        this.f7966e = context;
    }

    public c(ArrayList arrayList, ArrayList arrayList2) {
        this.f7965d = 1;
        int size = arrayList.size();
        this.f7966e = new int[size];
        this.f7967i = new float[size];
        for (int i7 = 0; i7 < size; i7++) {
            ((int[]) this.f7966e)[i7] = ((Integer) arrayList.get(i7)).intValue();
            ((float[]) this.f7967i)[i7] = ((Float) arrayList2.get(i7)).floatValue();
        }
    }

    public c(int i7, int i10) {
        this.f7965d = 1;
        this.f7966e = new int[]{i7, i10};
        this.f7967i = new float[]{0.0f, 1.0f};
    }

    public c(int i7, int i10, int i11) {
        this.f7965d = 1;
        this.f7966e = new int[]{i7, i10, i11};
        this.f7967i = new float[]{0.0f, 0.5f, 1.0f};
    }

    public c(EditText editText) {
        this.f7965d = 13;
        this.f7966e = editText;
        m2.i iVar = new m2.i(editText);
        this.f7967i = iVar;
        editText.addTextChangedListener(iVar);
        if (m2.a.f15354b == null) {
            synchronized (m2.a.f15353a) {
                try {
                    if (m2.a.f15354b == null) {
                        m2.a aVar = new m2.a();
                        try {
                            m2.a.f15355c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, m2.a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        m2.a.f15354b = aVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        editText.setEditableFactory(m2.a.f15354b);
    }

    public c(ArrayList parameters, Class cls) {
        this.f7965d = 16;
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        this.f7966e = parameters;
        this.f7967i = cls;
    }

    public c(vp.k kVar) {
        this.f7965d = 21;
        Iterator it = ((androidx.datastore.preferences.protobuf.c1) kVar.f21906d.f21887a.entrySet()).iterator();
        this.f7966e = it;
        if (it.hasNext()) {
            this.f7967i = (Map.Entry) it.next();
        }
    }

    public c(g1 g1Var, f1 f1Var) {
        this.f7965d = 7;
        this.f7967i = g1Var;
        this.f7966e = f1Var;
    }
}
