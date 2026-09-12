package a5;

import android.graphics.Bitmap;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Parcel;
import android.util.Log;
import com.facebook.common.references.CloseableReference;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.google.android.gms.internal.play_billing.w4;
import com.linkedin.android.litr.io.MediaRange;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.net.InetAddress;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Currency;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicIntegerArray;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import sh.r0;
import sh.s0;
import sh.u0;
import sh.v0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b0 implements bd.x, kb.b, m9.b, u0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f172d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f173e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f174i;

    public /* synthetic */ b0(int i7, int i10, Object obj) {
        this.f172d = i10;
        this.f174i = obj;
        this.f173e = i7;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object g(b0 b0Var, rn.b bVar, xn.a aVar) {
        qr.w frame;
        byte bG;
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        b0 b0Var2;
        byte bF;
        pc.f fVar;
        pc.f fVar2 = (pc.f) b0Var.f174i;
        if (aVar instanceof qr.w) {
            frame = (qr.w) aVar;
            int i7 = frame.f19048y;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                frame.f19048y = i7 - Integer.MIN_VALUE;
            } else {
                frame = new qr.w(b0Var, aVar);
            }
        } else {
            frame = new qr.w(b0Var, aVar);
        }
        Object obj = frame.f19046w;
        wn.a aVar2 = wn.a.f22354d;
        int i10 = frame.f19048y;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str = frame.f19045v;
            linkedHashMap2 = frame.f19044i;
            b0Var2 = frame.f19043e;
            rn.b bVar2 = frame.f19042d;
            ib.a.L(obj);
            linkedHashMap2.put(str, (JsonElement) obj);
            bF = ((pc.f) b0Var2.f174i).f();
            if (bF == 4) {
                bG = bF;
                b0Var = b0Var2;
                linkedHashMap = linkedHashMap2;
                bVar = bVar2;
            } else if (bF != 7) {
                pc.f.q((pc.f) b0Var2.f174i, "Expected end of the object or comma", 0, null, 6);
                throw null;
            }
            fVar = (pc.f) b0Var2.f174i;
            if (bF == 6) {
                fVar.g((byte) 7);
            } else if (bF == 4) {
                qr.p.n(fVar, "object");
                throw null;
            }
            return new JsonObject(linkedHashMap2);
        }
        ib.a.L(obj);
        bG = fVar2.g((byte) 6);
        if (fVar2.y() == 4) {
            pc.f.q(fVar2, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        linkedHashMap = new LinkedHashMap();
        pc.f fVar3 = (pc.f) b0Var.f174i;
        if (!fVar3.c()) {
            linkedHashMap2 = linkedHashMap;
            b0Var2 = b0Var;
            bF = bG;
            fVar = (pc.f) b0Var2.f174i;
            if (bF == 6) {
                fVar.g((byte) 7);
            } else if (bF == 4) {
                qr.p.n(fVar, "object");
                throw null;
            }
            return new JsonObject(linkedHashMap2);
        }
        String strJ = fVar3.j();
        fVar3.g((byte) 5);
        Unit unit = Unit.f14616a;
        frame.f19042d = bVar;
        frame.f19043e = b0Var;
        frame.f19044i = linkedHashMap;
        frame.f19045v = strJ;
        frame.f19048y = 1;
        rn.c cVar = (rn.c) bVar;
        cVar.getClass();
        Intrinsics.checkNotNull(frame, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        cVar.f19465i = frame;
        cVar.f19464e = unit;
        Intrinsics.checkNotNullParameter(frame, "frame");
        return aVar2;
    }

    public JsonPrimitive A(boolean z5) {
        pc.f fVar = (pc.f) this.f174i;
        String strL = !z5 ? fVar.l() : fVar.j();
        return (z5 || !Intrinsics.areEqual(strL, "null")) ? new pr.l(strL, z5) : JsonNull.INSTANCE;
    }

    public synchronized boolean B(String str) {
        for (String str2 : (String[]) this.f174i) {
            if (str.equals(str2)) {
                return false;
            }
        }
        StringBuilder sb2 = new StringBuilder("Recording new base apk path: ");
        sb2.append(str);
        sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        D(sb2);
        Log.w("SoLoader", sb2.toString());
        String[] strArr = (String[]) this.f174i;
        int i7 = this.f173e;
        strArr[i7 % strArr.length] = str;
        this.f173e = i7 + 1;
        return true;
    }

    public void C(p0.b bVar) {
        int i7 = this.f173e;
        Object[] objArr = (Object[]) this.f174i;
        if (i7 < objArr.length) {
            objArr[i7] = bVar;
            this.f173e = i7 + 1;
        }
    }

    public synchronized void D(StringBuilder sb2) {
        try {
            sb2.append("Previously recorded ");
            sb2.append(this.f173e);
            sb2.append(" base apk paths.");
            if (this.f173e > 0) {
                sb2.append(" Most recent ones:");
            }
            int i7 = 0;
            while (true) {
                String[] strArr = (String[]) this.f174i;
                if (i7 < strArr.length) {
                    int i10 = (this.f173e - i7) - 1;
                    if (i10 >= 0) {
                        String str = strArr[i10 % strArr.length];
                        sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                        sb2.append(str);
                        sb2.append(" (");
                        sb2.append(new File(str).exists() ? "exists" : "does not exist");
                        sb2.append(")");
                    }
                    i7++;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.ArrayList] */
    public Object E(ILogger iLogger, Object obj) {
        Object objF;
        HashSet hashSet = (HashSet) this.f174i;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Character) {
            return obj.toString();
        }
        if ((obj instanceof Number) || (obj instanceof Boolean) || (obj instanceof String)) {
            return obj;
        }
        if (obj instanceof Locale) {
            return obj.toString();
        }
        if (obj instanceof AtomicIntegerArray) {
            return io.sentry.util.c.a((AtomicIntegerArray) obj);
        }
        if (obj instanceof AtomicBoolean) {
            return Boolean.valueOf(((AtomicBoolean) obj).get());
        }
        if (obj instanceof URI) {
            return obj.toString();
        }
        if (obj instanceof InetAddress) {
            return obj.toString();
        }
        if (obj instanceof UUID) {
            return obj.toString();
        }
        if (obj instanceof Currency) {
            return obj.toString();
        }
        if (obj instanceof Calendar) {
            return io.sentry.util.c.d((Calendar) obj);
        }
        if (obj.getClass().isEnum()) {
            return obj.toString();
        }
        if (hashSet.contains(obj)) {
            iLogger.q(SentryLevel.INFO, "Cyclic reference detected. Calling toString() on object.", new Object[0]);
            return obj.toString();
        }
        hashSet.add(obj);
        try {
            if (hashSet.size() > this.f173e) {
                hashSet.remove(obj);
                iLogger.q(SentryLevel.INFO, "Max depth exceeded. Calling toString() on object.", new Object[0]);
                return obj.toString();
            }
            try {
                if (obj.getClass().isArray()) {
                    objF = new ArrayList();
                    for (Object obj2 : (Object[]) obj) {
                        objF.add(E(iLogger, obj2));
                    }
                } else if (obj instanceof Collection) {
                    objF = new ArrayList();
                    Iterator it = ((Collection) obj).iterator();
                    while (it.hasNext()) {
                        objF.add(E(iLogger, it.next()));
                    }
                } else if (obj instanceof Map) {
                    objF = t(iLogger, (Map) obj);
                } else {
                    objF = F(iLogger, obj);
                    if (objF.isEmpty()) {
                        objF = obj.toString();
                    }
                }
                return objF;
            } catch (Exception e10) {
                iLogger.g(SentryLevel.INFO, "Not serializing object due to throwing sub-path.", e10);
                return null;
            }
        } finally {
            hashSet.remove(obj);
        }
    }

    public HashMap F(ILogger iLogger, Object obj) {
        Field[] declaredFields = obj.getClass().getDeclaredFields();
        HashMap map = new HashMap();
        for (Field field : declaredFields) {
            if (!Modifier.isTransient(field.getModifiers()) && !Modifier.isStatic(field.getModifiers())) {
                String name = field.getName();
                try {
                    field.setAccessible(true);
                    map.put(name, E(iLogger, field.get(obj)));
                    field.setAccessible(false);
                } catch (Exception unused) {
                    iLogger.q(SentryLevel.INFO, s0.g.e("Cannot access field ", name, "."), new Object[0]);
                }
            }
        }
        return map;
    }

    public void G(int i7, int i10) {
        int[] iArr = (int[]) this.f174i;
        int i11 = iArr[i7];
        iArr[i7] = iArr[i10];
        iArr[i10] = i11;
        int i12 = i7 + 1;
        int i13 = i10 + 1;
        int i14 = iArr[i12];
        iArr[i12] = iArr[i13];
        iArr[i13] = i14;
        int i15 = i7 + 2;
        int i16 = i10 + 2;
        int i17 = iArr[i15];
        iArr[i15] = iArr[i16];
        iArr[i16] = i17;
    }

    public void H(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        int length = text.length();
        if (length == 0) {
            return;
        }
        q(this.f173e, length);
        text.getChars(0, text.length(), (char[]) this.f174i, this.f173e);
        this.f173e += length;
    }

    public String I(w4 w4Var) {
        String str;
        e0 e0Var = (e0) this.f174i;
        int i7 = this.f173e;
        try {
            if (e0Var.G == null) {
                throw null;
            }
            com.google.android.gms.internal.play_billing.i iVar = e0Var.G;
            String packageName = e0Var.E.getPackageName();
            if (i7 == 2) {
                str = "LAUNCH_BILLING_FLOW";
            } else if (i7 == 3) {
                str = "ACKNOWLEDGE_PURCHASE";
            } else if (i7 == 4) {
                str = "CONSUME_ASYNC";
            } else if (i7 != 5) {
                str = i7 != 6 ? "QUERY_PRODUCT_DETAILS_ASYNC" : "START_CONNECTION";
            } else {
                str = "IS_FEATURE_SUPPORTED";
            }
            c0 c0Var = new c0(w4Var);
            com.google.android.gms.internal.play_billing.f fVar = (com.google.android.gms.internal.play_billing.f) iVar;
            Parcel parcelV = fVar.v();
            parcelV.writeString(packageName);
            parcelV.writeString(str);
            int i10 = com.google.android.gms.internal.play_billing.e.f5997a;
            parcelV.writeStrongBinder(c0Var);
            fVar.x(1, parcelV);
            return "billingOverrideService.getBillingOverride";
        } catch (Exception e10) {
            e0Var.O(95, 28, h0.f205r);
            com.google.android.gms.internal.play_billing.r.i("BillingClientTesting", "An error occurred while retrieving billing override.", e10);
            w4Var.a(0);
            return "billingOverrideService.getBillingOverride";
        }
    }

    @Override // sh.u0
    public Object a() {
        v0 v0Var = (v0) this.f174i;
        int i7 = this.f173e;
        s0 s0VarA = v0Var.a(i7);
        sh.s sVar = v0Var.f20208a;
        int i10 = s0VarA.f20175b;
        r0 r0Var = s0VarA.f20176c;
        int i11 = r0Var.f20164d;
        long j = r0Var.f20162b;
        String str = r0Var.f20161a;
        if (i11 != 5 && i11 != 6 && i11 != 4) {
            throw new sh.l0(String.format("Could not safely delete session %d because it is not in a terminal state.", Integer.valueOf(i7)), i7);
        }
        if (sVar.c(i10, j, str).exists()) {
            sh.s.g(sVar.c(i10, j, str));
        }
        int i12 = r0Var.f20164d;
        if ((i12 != 5 && i12 != 6) || !sVar.j(i10, j, str).exists()) {
            return null;
        }
        sh.s.g(sVar.j(i10, j, str));
        return null;
    }

    @Override // bd.x
    public MediaCodecInfo b(int i7) {
        if (((MediaCodecInfo[]) this.f174i) == null) {
            this.f174i = new MediaCodecList(this.f173e).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f174i)[i7];
    }

    @Override // m9.b
    public synchronized CloseableReference c() {
        return CloseableReference.g((CloseableReference) this.f174i);
    }

    @Override // m9.b
    public synchronized void clear() {
        o();
    }

    @Override // m9.b
    public synchronized boolean contains(int i7) {
        return i7 == this.f173e && CloseableReference.z((CloseableReference) this.f174i);
    }

    @Override // bd.x
    public boolean d(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // m9.b
    public synchronized CloseableReference e() {
        CloseableReference closeableReferenceG;
        try {
            closeableReferenceG = CloseableReference.g((CloseableReference) this.f174i);
            o();
        } catch (Throwable th2) {
            o();
            throw th2;
        }
        return closeableReferenceG;
    }

    @Override // m9.b
    public synchronized CloseableReference f(int i7) {
        return this.f173e == i7 ? CloseableReference.g((CloseableReference) this.f174i) : null;
    }

    @Override // bd.x
    public boolean h(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override // kb.b
    public boolean i(UnsatisfiedLinkError unsatisfiedLinkError, com.facebook.soloader.b0[] b0VarArr) {
        int i7;
        kb.b[] bVarArr;
        do {
            i7 = this.f173e;
            bVarArr = (kb.b[]) this.f174i;
            if (i7 >= 8) {
                return false;
            }
            this.f173e = i7 + 1;
        } while (!bVarArr[i7].i(unsatisfiedLinkError, b0VarArr));
        return true;
    }

    @Override // bd.x
    public int j() {
        if (((MediaCodecInfo[]) this.f174i) == null) {
            this.f174i = new MediaCodecList(this.f173e).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f174i).length;
    }

    @Override // m9.b
    public void k(int i7, CloseableReference bitmapReference) {
        Intrinsics.checkNotNullParameter(bitmapReference, "bitmapReference");
    }

    @Override // m9.b
    public synchronized void l(int i7, CloseableReference bitmapReference) {
        try {
            Intrinsics.checkNotNullParameter(bitmapReference, "bitmapReference");
            if (((CloseableReference) this.f174i) != null) {
                Object objQ = bitmapReference.q();
                CloseableReference closeableReference = (CloseableReference) this.f174i;
                if (Intrinsics.areEqual(objQ, closeableReference != null ? (Bitmap) closeableReference.q() : null)) {
                    return;
                }
            }
            CloseableReference.l((CloseableReference) this.f174i);
            this.f174i = CloseableReference.g(bitmapReference);
            this.f173e = i7;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // bd.x
    public boolean m() {
        return true;
    }

    public void n(long j) {
        int i7 = this.f173e;
        long[] jArr = (long[]) this.f174i;
        if (i7 == jArr.length) {
            this.f174i = Arrays.copyOf(jArr, i7 * 2);
        }
        long[] jArr2 = (long[]) this.f174i;
        int i10 = this.f173e;
        this.f173e = i10 + 1;
        jArr2[i10] = j;
    }

    public synchronized void o() {
        CloseableReference.l((CloseableReference) this.f174i);
        this.f174i = null;
        this.f173e = -1;
    }

    public void p(InputStream inputStream, OutputStream outputStream) {
        pa.n nVar = (pa.n) this.f174i;
        int i7 = this.f173e;
        byte[] bArr = (byte[]) nVar.get(i7);
        while (true) {
            try {
                int i10 = inputStream.read(bArr, 0, i7);
                if (i10 == -1) {
                    nVar.release(bArr);
                    return;
                }
                outputStream.write(bArr, 0, i10);
            } catch (Throwable th2) {
                nVar.release(bArr);
                throw th2;
            }
        }
    }

    public void q(int i7, int i10) {
        int i11 = i10 + i7;
        char[] cArr = (char[]) this.f174i;
        if (cArr.length <= i11) {
            int i12 = i7 * 2;
            if (i11 < i12) {
                i11 = i12;
            }
            char[] cArrCopyOf = Arrays.copyOf(cArr, i11);
            Intrinsics.checkNotNullExpressionValue(cArrCopyOf, "copyOf(...)");
            this.f174i = cArrCopyOf;
        }
    }

    public long r(int i7) {
        if (i7 >= 0 && i7 < this.f173e) {
            return ((long[]) this.f174i)[i7];
        }
        StringBuilder sbS = a3.e.s(i7, "Invalid index ", ", size is ");
        sbS.append(this.f173e);
        throw new IndexOutOfBoundsException(sbS.toString());
    }

    public boolean s() {
        return this.f173e < ((ArrayList) this.f174i).size();
    }

    public HashMap t(ILogger iLogger, Map map) {
        HashMap map2 = new HashMap();
        for (Object obj : map.keySet()) {
            Object obj2 = map.get(obj);
            if (obj2 != null) {
                map2.put(obj.toString(), E(iLogger, obj2));
            } else {
                map2.put(obj.toString(), null);
            }
        }
        return map2;
    }

    public String toString() {
        switch (this.f172d) {
            case 17:
                return new String((char[]) this.f174i, 0, this.f173e);
            default:
                return super.toString();
        }
    }

    public void u(int i7, int i10, int i11) {
        int i12 = this.f173e;
        int i13 = i12 + 3;
        int[] iArr = (int[]) this.f174i;
        if (i13 >= iArr.length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
            this.f174i = iArrCopyOf;
        }
        int[] iArr2 = (int[]) this.f174i;
        iArr2[i12] = i7 + i11;
        iArr2[i12 + 1] = i10 + i11;
        iArr2[i12 + 2] = i11;
        this.f173e = i13;
    }

    public void v(int i7, int i10, int i11, int i12) {
        int i13 = this.f173e;
        int i14 = i13 + 4;
        int[] iArr = (int[]) this.f174i;
        if (i14 >= iArr.length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
            this.f174i = iArrCopyOf;
        }
        int[] iArr2 = (int[]) this.f174i;
        iArr2[i13] = i7;
        iArr2[i13 + 1] = i10;
        iArr2[i13 + 2] = i11;
        iArr2[i13 + 3] = i12;
        this.f173e = i14;
    }

    public void w(int i7, int i10) {
        if (i7 < i10) {
            int i11 = i7 - 3;
            for (int i12 = i7; i12 < i10; i12 += 3) {
                int[] iArr = (int[]) this.f174i;
                int i13 = iArr[i12];
                int i14 = iArr[i10];
                if (i13 < i14 || (i13 == i14 && iArr[i12 + 1] <= iArr[i10 + 1])) {
                    i11 += 3;
                    G(i11, i12);
                }
            }
            G(i11 + 3, i10);
            w(i7, i11);
            w(i11 + 6, i10);
        }
    }

    public JsonElement x() {
        JsonElement jsonObject;
        Object obj;
        Object objInvoke;
        Object eVar;
        pc.f fVar = (pc.f) this.f174i;
        byte bY = fVar.y();
        if (bY == 1) {
            return A(true);
        }
        if (bY == 0) {
            return A(false);
        }
        if (bY != 6) {
            if (bY == 8) {
                return y();
            }
            pc.f.q(fVar, "Cannot read Json element because of unexpected ".concat(qr.p.t(bY)), 0, null, 6);
            throw null;
        }
        int i7 = this.f173e + 1;
        this.f173e = i7;
        if (i7 == 200) {
            qr.v block = new qr.v(this, null);
            i8.c cVar = new i8.c(block);
            Unit unit = Unit.f14616a;
            wn.a aVar = rn.a.f19460a;
            Intrinsics.checkNotNullParameter(cVar, "<this>");
            Intrinsics.checkNotNullParameter(block, "block");
            rn.c cVar2 = new rn.c(null);
            cVar2.f19463d = block;
            cVar2.f19464e = unit;
            Intrinsics.checkNotNull(cVar2, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            cVar2.f19465i = cVar2;
            wn.a aVar2 = rn.a.f19460a;
            cVar2.f19466v = aVar2;
            while (true) {
                obj = cVar2.f19466v;
                Continuation completion = cVar2.f19465i;
                if (completion == null) {
                    break;
                }
                rn.q qVar = Result.f14614e;
                if (Intrinsics.areEqual(aVar2, obj)) {
                    try {
                        qr.v vVar = cVar2.f19463d;
                        Unit unit2 = cVar2.f19464e;
                        if (vVar == null) {
                            Intrinsics.checkNotNullParameter(vVar, "<this>");
                            Intrinsics.checkNotNullParameter(completion, "completion");
                            Intrinsics.checkNotNullParameter(completion, "completion");
                            CoroutineContext context = completion.getContext();
                            if (context == kotlin.coroutines.g.f14681d) {
                                Intrinsics.checkNotNull(completion, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
                                eVar = new wn.d(completion);
                            } else {
                                Intrinsics.checkNotNull(completion, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
                                eVar = new wn.e(completion, context);
                            }
                            objInvoke = ((Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(vVar, 3)).invoke(cVar2, unit2, eVar);
                        } else {
                            objInvoke = ((Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(vVar, 3)).invoke(cVar2, unit2, completion);
                        }
                        if (objInvoke != wn.a.f22354d) {
                            completion.resumeWith(objInvoke);
                        }
                    } catch (Throwable th2) {
                        rn.q qVar2 = Result.f14614e;
                        completion.resumeWith(ib.a.o(th2));
                    }
                } else {
                    cVar2.f19466v = aVar2;
                    completion.resumeWith(obj);
                }
            }
            ib.a.L(obj);
            jsonObject = (JsonElement) obj;
        } else {
            byte bG = fVar.g((byte) 6);
            if (fVar.y() == 4) {
                pc.f.q(fVar, "Unexpected leading comma", 0, null, 6);
                throw null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (fVar.c()) {
                String strJ = fVar.j();
                fVar.g((byte) 5);
                linkedHashMap.put(strJ, x());
                bG = fVar.f();
                if (bG != 4) {
                    if (bG == 7) {
                        break;
                    }
                    pc.f.q(fVar, "Expected end of the object or comma", 0, null, 6);
                    throw null;
                }
            }
            if (bG == 6) {
                fVar.g((byte) 7);
            } else if (bG == 4) {
                qr.p.n(fVar, "object");
                throw null;
            }
            jsonObject = new JsonObject(linkedHashMap);
        }
        this.f173e--;
        return jsonObject;
    }

    public kotlinx.serialization.json.a y() {
        pc.f fVar = (pc.f) this.f174i;
        byte bF = fVar.f();
        if (fVar.y() == 4) {
            pc.f.q(fVar, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        while (fVar.c()) {
            arrayList.add(x());
            bF = fVar.f();
            if (bF != 4) {
                boolean z5 = bF == 9;
                int i7 = fVar.f17882b;
                if (!z5) {
                    pc.f.q(fVar, "Expected end of the array or comma", i7, null, 4);
                    throw null;
                }
            }
        }
        if (bF == 8) {
            fVar.g((byte) 9);
        } else if (bF == 4) {
            qr.p.n(fVar, "array");
            throw null;
        }
        return new kotlinx.serialization.json.a(arrayList);
    }

    public long z(pc.h hVar) {
        je.w wVar = (je.w) this.f174i;
        int i7 = 0;
        hVar.g(wVar.f13860a, 0, 1, false);
        int i10 = wVar.f13860a[0] & 255;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int i11 = IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        int i12 = 0;
        while ((i10 & i11) == 0) {
            i11 >>= 1;
            i12++;
        }
        int i13 = i10 & (~i11);
        hVar.g(wVar.f13860a, 1, i12, false);
        while (i7 < i12) {
            i7++;
            i13 = (wVar.f13860a[i7] & 255) + (i13 << 8);
        }
        this.f173e = i12 + 1 + this.f173e;
        return i13;
    }

    public /* synthetic */ b0(int i7, short s2) {
        this.f172d = i7;
    }

    public b0(androidx.appcompat.widget.v configuration, pc.f lexer) {
        this.f172d = 18;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(lexer, "lexer");
        this.f174i = lexer;
    }

    public b0(kb.b[] bVarArr) {
        this.f172d = 10;
        this.f174i = bVarArr;
        this.f173e = 0;
    }

    public b0(pa.n nVar) {
        this.f172d = 15;
        n8.i.a(true);
        this.f173e = 16384;
        this.f174i = nVar;
    }

    public b0(char c8, int i7) {
        this.f172d = i7;
        switch (i7) {
            case 9:
                this.f174i = new String[5];
                this.f173e = 0;
                break;
            case 14:
                this.f174i = new Object[IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER];
                break;
            case 20:
                this.f174i = new je.w(8);
                break;
            default:
                this.f174i = new long[32];
                break;
        }
    }

    public b0(int i7, boolean z5) {
        this.f172d = 13;
        this.f173e = i7;
        this.f174i = new MediaRange();
    }

    public b0(int i7, c5.e eVar) {
        this.f172d = 16;
        this.f173e = i7;
        this.f174i = new c5.e[]{eVar};
    }

    public b0(c5.e eVar, c5.e eVar2) {
        this.f172d = 16;
        this.f173e = 62;
        this.f174i = new c5.e[]{eVar, eVar2};
    }

    public b0(ArrayList routes) {
        this.f172d = 4;
        Intrinsics.checkNotNullParameter(routes, "routes");
        this.f174i = routes;
    }

    public b0(int i7, c5.e[] eVarArr) {
        this.f172d = 3;
        this.f173e = i7;
        this.f174i = eVarArr;
    }

    public b0(int i7, int i10) {
        this.f172d = i10;
        switch (i10) {
            case 7:
                this.f174i = new HashSet();
                this.f173e = i7;
                break;
            default:
                this.f174i = new int[i7];
                break;
        }
    }

    public b0(boolean z5, boolean z6) {
        this.f172d = 2;
        this.f173e = (z5 || z6) ? 1 : 0;
    }
}
