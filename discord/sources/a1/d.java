package a1;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.os.Bundle;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;
import cs.t;
import ei.f0;
import ei.h0;
import ei.p;
import ei.w0;
import ei.y;
import gc.d1;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import je.b0;
import je.e0;
import je.w;
import kotlin.Unit;
import kotlin.collections.c0;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.x;
import kotlinx.serialization.descriptors.SerialDescriptor;
import md.s;
import md.u;
import md.v;
import org.xmlpull.v1.XmlPullParserException;
import pc.r;
import qr.q;
import ze.a0;

/* JADX INFO: loaded from: classes.dex */
public final class d implements pc.e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f16d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f17e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f18i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Object f19v;

    public /* synthetic */ d(int i7, byte b10) {
        this.f16d = i7;
    }

    public static void A(h3.c cVar) {
        cVar.l("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        Intrinsics.checkNotNullParameter("7d73d21f1bd82c9e5268b6dcf9fde2cb", "hash");
        cVar.l("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '7d73d21f1bd82c9e5268b6dcf9fde2cb')");
    }

    public static d d(Resources resources, int i7, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        float f2;
        float f7;
        Shader.TileMode tileMode;
        Shader radialGradient;
        Shader.TileMode tileMode2;
        XmlResourceParser xml = resources.getXml(i7);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.getClass();
        if (!name.equals("gradient")) {
            if (name.equals("selector")) {
                ColorStateList colorStateListB = c.b(resources, xml, attributeSetAsAttributeSet, theme);
                return new d((Shader) null, colorStateListB, colorStateListB.getDefaultColor());
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        TypedArray typedArrayF = b.f(resources, theme, attributeSetAsAttributeSet, w0.a.f21978e);
        float f10 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startX") != null ? typedArrayF.getFloat(8, 0.0f) : 0.0f;
        float f11 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startY") != null ? typedArrayF.getFloat(9, 0.0f) : 0.0f;
        float f12 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endX") != null ? typedArrayF.getFloat(10, 0.0f) : 0.0f;
        float f13 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endY") != null ? typedArrayF.getFloat(11, 0.0f) : 0.0f;
        float f14 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerX") != null ? typedArrayF.getFloat(3, 0.0f) : 0.0f;
        float f15 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerY") != null ? typedArrayF.getFloat(4, 0.0f) : 0.0f;
        int i10 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "type") != null ? typedArrayF.getInt(2, 0) : 0;
        int color = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startColor") != null ? typedArrayF.getColor(0, 0) : 0;
        boolean z5 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null;
        int color2 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null ? typedArrayF.getColor(7, 0) : 0;
        int color3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endColor") != null ? typedArrayF.getColor(1, 0) : 0;
        int i11 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tileMode") != null ? typedArrayF.getInt(6, 0) : 0;
        float f16 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "gradientRadius") != null ? typedArrayF.getFloat(5, 0.0f) : 0.0f;
        typedArrayF.recycle();
        int depth = xml.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        float f17 = f16;
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            f2 = f12;
            if (next2 == 1) {
                f7 = f13;
                break;
            }
            int depth2 = xml.getDepth();
            f7 = f13;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                TypedArray typedArrayF2 = b.f(resources, theme, attributeSetAsAttributeSet, w0.a.f21979f);
                boolean zHasValue = typedArrayF2.hasValue(0);
                boolean zHasValue2 = typedArrayF2.hasValue(1);
                if (!zHasValue || !zHasValue2) {
                    throw new XmlPullParserException(xml.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                }
                int color4 = typedArrayF2.getColor(0, 0);
                float f18 = typedArrayF2.getFloat(1, 0.0f);
                typedArrayF2.recycle();
                arrayList2.add(Integer.valueOf(color4));
                arrayList.add(Float.valueOf(f18));
            }
            f12 = f2;
            f13 = f7;
        }
        e4.c cVar = arrayList2.size() > 0 ? new e4.c(arrayList2, arrayList) : null;
        if (cVar == null) {
            cVar = z5 ? new e4.c(color, color2, color3) : new e4.c(color, color3);
        }
        if (i10 != 1) {
            if (i10 != 2) {
                int[] iArr = (int[]) cVar.f7966e;
                float[] fArr = (float[]) cVar.f7967i;
                if (i11 != 1) {
                    tileMode2 = i11 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
                } else {
                    tileMode2 = Shader.TileMode.REPEAT;
                }
                radialGradient = new LinearGradient(f10, f11, f2, f7, iArr, fArr, tileMode2);
            } else {
                radialGradient = new SweepGradient(f14, f15, (int[]) cVar.f7966e, (float[]) cVar.f7967i);
            }
        } else {
            if (f17 <= 0.0f) {
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
            int[] iArr2 = (int[]) cVar.f7966e;
            float[] fArr2 = (float[]) cVar.f7967i;
            if (i11 != 1) {
                tileMode = i11 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
            } else {
                tileMode = Shader.TileMode.REPEAT;
            }
            radialGradient = new RadialGradient(f14, f15, f17, iArr2, fArr2, tileMode);
        }
        return new d(radialGradient, (ColorStateList) null, 0);
    }

    public static void e(String str) {
        if (x.i(str, ":memory:", true)) {
            return;
        }
        int length = str.length() - 1;
        int i7 = 0;
        boolean z5 = false;
        while (i7 <= length) {
            boolean z6 = Intrinsics.compare((int) str.charAt(!z5 ? i7 : length), 32) <= 0;
            if (z5) {
                if (!z6) {
                    break;
                } else {
                    length--;
                }
            } else if (z6) {
                i7++;
            } else {
                z5 = true;
            }
        }
        if (str.subSequence(i7, length + 1).toString().length() == 0) {
            return;
        }
        Log.w("SupportSQLite", "deleting the database file: ".concat(str));
        try {
            File file = new File(str);
            Intrinsics.checkNotNullParameter(file, "file");
            SQLiteDatabase.deleteDatabase(file);
        } catch (Exception e10) {
            Log.w("SupportSQLite", "delete failed: ", e10);
        }
    }

    public void B(MediaLoadData mediaLoadData) {
        s sVar = (s) this.f18i;
        sVar.getClass();
        for (v vVar : (CopyOnWriteArrayList) this.f19v) {
            e0.M(vVar.f15714a, new cb.a(9, this, vVar.f15715b, sVar, mediaLoadData));
        }
    }

    public void C(ze.k kVar) {
        Map map = (Map) this.f18i;
        if (map.containsKey("ConnectionlessLifecycleHelper")) {
            StringBuilder sb2 = new StringBuilder("ConnectionlessLifecycleHelper".length() + 59);
            sb2.append("LifecycleCallback with tag ConnectionlessLifecycleHelper already added to this fragment.");
            throw new IllegalArgumentException(sb2.toString());
        }
        map.put("ConnectionlessLifecycleHelper", kVar);
        if (this.f17e > 0) {
            new eg.a(Looper.getMainLooper(), 3).post(new hi.o(this, kVar, 27, false));
        }
    }

    public void D(Bundle bundle) {
        this.f17e = 1;
        this.f19v = bundle;
        for (Map.Entry entry : ((Map) this.f18i).entrySet()) {
            ((ze.k) entry.getValue()).b(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x000c A[SYNTHETIC] */
    public void E(int i7, int i10, Intent intent) {
        for (ze.k kVar : ((Map) this.f18i).values()) {
            AtomicReference atomicReference = kVar.f23939i;
            ze.e eVar = kVar.f23943y;
            AtomicReference atomicReference2 = kVar.f23939i;
            a0 a0Var = (a0) atomicReference.get();
            if (i7 != 1) {
                if (i7 == 2) {
                    int iB = kVar.f23941w.b(kVar.a(), xe.f.f22923a);
                    if (iB == 0) {
                        atomicReference2.set(null);
                        eg.a aVar = eVar.K;
                        aVar.sendMessage(aVar.obtainMessage(3));
                    } else if (a0Var == null || (a0Var.f23918b.f22910e == 18 && iB == 18)) {
                    }
                }
                if (a0Var != null) {
                    xe.b bVar = a0Var.f23918b;
                    int i11 = a0Var.f23917a;
                    atomicReference2.set(null);
                    eVar.h(bVar, i11);
                }
            } else if (i10 == -1) {
                atomicReference2.set(null);
                eg.a aVar2 = eVar.K;
                aVar2.sendMessage(aVar2.obtainMessage(3));
            } else if (i10 == 0) {
                if (a0Var != null) {
                    xe.b bVar2 = new xe.b(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, a0Var.f23918b.toString());
                    int i12 = a0Var.f23917a;
                    atomicReference2.set(null);
                    eVar.h(bVar2, i12);
                }
            } else if (a0Var != null) {
                xe.b bVar3 = a0Var.f23918b;
                int i13 = a0Var.f23917a;
                atomicReference2.set(null);
                eVar.h(bVar3, i13);
            }
        }
    }

    public void F(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : ((Map) this.f18i).entrySet()) {
            Bundle bundle2 = new Bundle();
            a0 a0Var = (a0) ((ze.k) entry.getValue()).f23939i.get();
            if (a0Var != null) {
                xe.b bVar = a0Var.f23918b;
                bundle2.putBoolean("resolving_error", true);
                bundle2.putInt("failed_client_id", a0Var.f23917a);
                bundle2.putInt("failed_status", bVar.f22910e);
                bundle2.putParcelable("failed_resolution", bVar.f22911i);
            }
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    public aj.b a() {
        if ("".isEmpty()) {
            return new aj.b((String) this.f18i, ((Long) this.f19v).longValue(), this.f17e);
        }
        throw new IllegalStateException("Missing required properties:".concat(""));
    }

    /* JADX WARN: Code duplicated, block: B:74:0x01a3  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v11 */
    /* JADX WARN: Type inference failed for: r17v12 */
    /* JADX WARN: Type inference failed for: r17v13 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v7 */
    public w0 b() {
        int i7;
        boolean z5;
        char c8;
        ?? r5;
        char c10;
        short[] sArr;
        int i10;
        boolean z6;
        ?? r17;
        boolean z7;
        ?? r6;
        w0 w0Var;
        boolean z10;
        f0 f0Var = (f0) this.f19v;
        if (f0Var != null) {
            throw f0Var.a();
        }
        int i11 = this.f17e;
        Object[] objArrCopyOf = (Object[]) this.f18i;
        if (i11 == 0) {
            w0Var = w0.f8376y;
        } else {
            int i12 = 1;
            f0 f0Var2 = null;
            ?? r7 = 0;
            f0 f0Var3 = null;
            f0 f0Var4 = null;
            boolean z11 = false;
            if (i11 == 1) {
                Objects.requireNonNull(objArrCopyOf[0]);
                Objects.requireNonNull(objArrCopyOf[1]);
                w0Var = new w0(null, objArrCopyOf, 1);
            } else {
                ls.l.g(i11, objArrCopyOf.length >> 1);
                int iJ = h0.j(i11);
                char c11 = 2;
                if (i11 == 1) {
                    Objects.requireNonNull(objArrCopyOf[0]);
                    Objects.requireNonNull(objArrCopyOf[1]);
                    i7 = 1;
                    z10 = false;
                } else {
                    int i13 = iJ - 1;
                    if (iJ <= 128) {
                        byte[] bArr = new byte[iJ];
                        Arrays.fill(bArr, (byte) -1);
                        int i14 = 0;
                        int i15 = 0;
                        while (i14 < i11) {
                            int i16 = i14 * 2;
                            int i17 = i15 * 2;
                            Object obj = objArrCopyOf[i16];
                            Objects.requireNonNull(obj);
                            Object obj2 = objArrCopyOf[i16 ^ i12];
                            Objects.requireNonNull(obj2);
                            int iP = p.p(obj.hashCode());
                            while (true) {
                                int i18 = iP & i13;
                                i10 = i12;
                                z6 = z11;
                                int i19 = bArr[i18] & 255;
                                if (i19 == 255) {
                                    bArr[i18] = (byte) i17;
                                    if (i15 < i14) {
                                        objArrCopyOf[i17] = obj;
                                        objArrCopyOf[i17 ^ 1] = obj2;
                                    }
                                    i15++;
                                    break;
                                }
                                if (obj.equals(objArrCopyOf[i19 == true ? 1 : 0])) {
                                    int i20 = ~i19;
                                    Object obj3 = objArrCopyOf[i20 == true ? 1 : 0];
                                    Objects.requireNonNull(obj3);
                                    f0Var3 = new f0(obj, obj2, obj3);
                                    objArrCopyOf[i20 == true ? 1 : 0] = obj2;
                                    break;
                                }
                                iP = i18 + 1;
                                i12 = i10;
                                z11 = z6;
                            }
                            i14++;
                            i12 = i10;
                            z11 = z6;
                        }
                        i7 = i12;
                        z5 = z11;
                        if (i15 == i11) {
                            r7 = bArr;
                            z10 = z5;
                        } else {
                            sArr = new Object[3];
                            sArr[z5 ? 1 : 0] = bArr;
                            sArr[i7] = Integer.valueOf(i15);
                            sArr[2] = f0Var3;
                            r7 = sArr;
                            z10 = z5;
                        }
                    } else {
                        i7 = 1;
                        z5 = false;
                        if (iJ <= 32768) {
                            sArr = new short[iJ];
                            Arrays.fill(sArr, (short) -1);
                            int i21 = 0;
                            for (int i22 = 0; i22 < i11; i22++) {
                                int i23 = i22 * 2;
                                int i24 = i21 * 2;
                                Object obj4 = objArrCopyOf[i23];
                                Objects.requireNonNull(obj4);
                                Object obj5 = objArrCopyOf[i23 ^ 1];
                                Objects.requireNonNull(obj5);
                                int iP2 = p.p(obj4.hashCode());
                                while (true) {
                                    int i25 = iP2 & i13;
                                    int i26 = sArr[i25] & 65535;
                                    if (i26 == 65535) {
                                        sArr[i25] = (short) i24;
                                        if (i21 < i22) {
                                            objArrCopyOf[i24] = obj4;
                                            objArrCopyOf[i24 ^ 1] = obj5;
                                        }
                                        i21++;
                                        break;
                                    }
                                    if (obj4.equals(objArrCopyOf[i26 == true ? 1 : 0])) {
                                        int i27 = ~i26;
                                        Object obj6 = objArrCopyOf[i27 == true ? 1 : 0];
                                        Objects.requireNonNull(obj6);
                                        f0Var4 = new f0(obj4, obj5, obj6);
                                        objArrCopyOf[i27 == true ? 1 : 0] = obj5;
                                        break;
                                    }
                                    iP2 = i25 + 1;
                                }
                            }
                            if (i21 == i11) {
                                r7 = sArr;
                                z10 = z5;
                            } else {
                                r7 = new Object[]{sArr, Integer.valueOf(i21), f0Var4};
                                z10 = z5;
                            }
                        } else {
                            int[] iArr = new int[iJ];
                            Arrays.fill(iArr, -1);
                            int i28 = 0;
                            int i29 = 0;
                            while (i28 < i11) {
                                int i30 = i28 * 2;
                                int i31 = i29 * 2;
                                Object obj7 = objArrCopyOf[i30];
                                Objects.requireNonNull(obj7);
                                Object obj8 = objArrCopyOf[i30 ^ 1];
                                Objects.requireNonNull(obj8);
                                int iP3 = p.p(obj7.hashCode());
                                while (true) {
                                    int i32 = iP3 & i13;
                                    int i33 = iArr[i32];
                                    if (i33 == -1) {
                                        iArr[i32] = i31;
                                        if (i29 < i28) {
                                            objArrCopyOf[i31] = obj7;
                                            objArrCopyOf[i31 ^ 1] = obj8;
                                        }
                                        i29++;
                                        c10 = c11;
                                        break;
                                    }
                                    c10 = c11;
                                    if (obj7.equals(objArrCopyOf[i33])) {
                                        int i34 = i33 ^ 1;
                                        Object obj9 = objArrCopyOf[i34];
                                        Objects.requireNonNull(obj9);
                                        f0Var2 = new f0(obj7, obj8, obj9);
                                        objArrCopyOf[i34] = obj8;
                                        break;
                                    }
                                    iP3 = i32 + 1;
                                    c11 = c10;
                                }
                                i28++;
                                c11 = c10;
                            }
                            c8 = c11;
                            if (i29 == i11) {
                                r5 = iArr;
                                r17 = z5;
                            } else {
                                Object[] objArr = new Object[3];
                                objArr[0] = iArr;
                                objArr[1] = Integer.valueOf(i29);
                                objArr[c8] = f0Var2;
                                r5 = objArr;
                                r17 = z5;
                            }
                        }
                    }
                    z7 = r5 instanceof Object[];
                    r6 = r5;
                    if (z7) {
                        Object[] objArr2 = (Object[]) r5;
                        this.f19v = (f0) objArr2[c8];
                        Object obj10 = objArr2[r17];
                        int iIntValue = ((Integer) objArr2[i7]).intValue();
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue * 2);
                        r6 = obj10;
                        i11 = iIntValue;
                    }
                    w0Var = new w0(r6, objArrCopyOf, i11);
                }
                c8 = 2;
                r5 = r7;
                r17 = z10;
                z7 = r5 instanceof Object[];
                r6 = r5;
                if (z7) {
                    Object[] objArr3 = (Object[]) r5;
                    this.f19v = (f0) objArr3[c8];
                    Object obj11 = objArr3[r17];
                    int iIntValue2 = ((Integer) objArr3[i7]).intValue();
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue2 * 2);
                    r6 = obj11;
                    i11 = iIntValue2;
                }
                w0Var = new w0(r6, objArrCopyOf, i11);
            }
        }
        f0 f0Var5 = (f0) this.f19v;
        if (f0Var5 == null) {
            return w0Var;
        }
        throw f0Var5.a();
    }

    @Override // pc.e
    public pc.d c(pc.l lVar, long j) {
        long j5;
        long position = lVar.getPosition();
        int iMin = (int) Math.min(112800, lVar.getLength() - position);
        w wVar = (w) this.f19v;
        wVar.C(iMin);
        lVar.C(wVar.f13860a, 0, iMin);
        int i7 = wVar.f13862c;
        long j7 = -1;
        long j10 = -1;
        long j11 = -9223372036854775807L;
        while (true) {
            if (wVar.a() < 188) {
                j5 = -9223372036854775807L;
                break;
            }
            byte[] bArr = wVar.f13860a;
            int i10 = wVar.f13861b;
            while (true) {
                if (i10 >= i7) {
                    j5 = -9223372036854775807L;
                    break;
                }
                j5 = -9223372036854775807L;
                if (bArr[i10] == 71) {
                    break;
                }
                i10++;
            }
            int i11 = i10 + 188;
            if (i11 > i7) {
                break;
            }
            long jO = m3.m.O(wVar, i10, this.f17e);
            if (jO != j5) {
                long jB = ((b0) this.f18i).b(jO);
                if (jB > j) {
                    return j11 == j5 ? new pc.d(-1, jB, position) : new pc.d(0, -9223372036854775807L, position + j10);
                }
                if (100000 + jB > j) {
                    return new pc.d(0, -9223372036854775807L, position + ((long) i10));
                }
                j11 = jB;
                j10 = i10;
            }
            wVar.F(i11);
            j7 = i11;
        }
        return j11 != j5 ? new pc.d(-2, j11, position + j7) : pc.d.f17877d;
    }

    public void f(int i7, Format format, int i10, Object obj, long j) {
        g(new MediaLoadData(1, i7, format, i10, obj, e0.U(j), -9223372036854775807L));
    }

    public void g(MediaLoadData mediaLoadData) {
        for (v vVar : (CopyOnWriteArrayList) this.f19v) {
            e0.M(vVar.f15714a, new ac.a(this, vVar.f15715b, mediaLoadData, 29));
        }
    }

    public Object h(int i7) {
        SparseArray sparseArray = (SparseArray) this.f18i;
        if (this.f17e == -1) {
            this.f17e = 0;
        }
        while (true) {
            int i10 = this.f17e;
            if (i10 <= 0 || i7 >= sparseArray.keyAt(i10)) {
                break;
            }
            this.f17e--;
        }
        while (this.f17e < sparseArray.size() - 1 && i7 >= sparseArray.keyAt(this.f17e + 1)) {
            this.f17e++;
        }
        return sparseArray.valueAt(this.f17e);
    }

    public String i() {
        StringBuilder sb2 = new StringBuilder("$");
        int i7 = this.f17e + 1;
        for (int i10 = 0; i10 < i7; i10++) {
            Object obj = ((Object[]) this.f18i)[i10];
            if (obj instanceof SerialDescriptor) {
                SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
                if (!Intrinsics.areEqual(serialDescriptor.c(), mr.j.f16078c)) {
                    int i11 = ((int[]) this.f19v)[i10];
                    if (i11 >= 0) {
                        sb2.append(".");
                        sb2.append(serialDescriptor.h(i11));
                    }
                } else if (((int[]) this.f19v)[i10] != -1) {
                    sb2.append("[");
                    sb2.append(((int[]) this.f19v)[i10]);
                    sb2.append("]");
                }
            } else if (obj != q.f19028a) {
                sb2.append("['");
                sb2.append(obj);
                sb2.append("']");
            }
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public boolean j() {
        ColorStateList colorStateList;
        return ((Shader) this.f18i) == null && (colorStateList = (ColorStateList) this.f19v) != null && colorStateList.isStateful();
    }

    public void k(LoadEventInfo loadEventInfo, int i7, int i10, Format format, int i11, Object obj, long j, long j5) {
        l(loadEventInfo, new MediaLoadData(i7, i10, format, i11, obj, e0.U(j), e0.U(j5)));
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, md.w] */
    public void l(LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        for (v vVar : (CopyOnWriteArrayList) this.f19v) {
            e0.M(vVar.f15714a, new u(this, vVar.f15715b, loadEventInfo, mediaLoadData, 1));
        }
    }

    public void m(LoadEventInfo loadEventInfo, int i7) {
        n(loadEventInfo, i7, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public void n(LoadEventInfo loadEventInfo, int i7, int i10, Format format, int i11, Object obj, long j, long j5) {
        o(loadEventInfo, new MediaLoadData(i7, i10, format, i11, obj, e0.U(j), e0.U(j5)));
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, md.w] */
    public void o(LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        for (v vVar : (CopyOnWriteArrayList) this.f19v) {
            e0.M(vVar.f15714a, new u(this, vVar.f15715b, loadEventInfo, mediaLoadData, 0));
        }
    }

    public void p(LoadEventInfo loadEventInfo, int i7, int i10, Format format, int i11, Object obj, long j, long j5, IOException iOException, boolean z5) {
        r(loadEventInfo, new MediaLoadData(i7, i10, format, i11, obj, e0.U(j), e0.U(j5)), iOException, z5);
    }

    public void q(LoadEventInfo loadEventInfo, int i7, IOException iOException, boolean z5) {
        p(loadEventInfo, i7, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z5);
    }

    public void r(LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z5) {
        for (v vVar : (CopyOnWriteArrayList) this.f19v) {
            e0.M(vVar.f15714a, new d1(this, vVar.f15715b, loadEventInfo, mediaLoadData, iOException, z5, 1));
        }
    }

    public void s(LoadEventInfo loadEventInfo, int i7, int i10, Format format, int i11, Object obj, long j, long j5) {
        t(loadEventInfo, new MediaLoadData(i7, i10, format, i11, obj, e0.U(j), e0.U(j5)));
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, md.w] */
    public void t(LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        for (v vVar : (CopyOnWriteArrayList) this.f19v) {
            e0.M(vVar.f15714a, new u(this, vVar.f15715b, loadEventInfo, mediaLoadData, 2));
        }
    }

    public String toString() {
        switch (this.f16d) {
            case 8:
                StringBuilder sb2 = new StringBuilder();
                if (((t) this.f18i) == t.HTTP_1_0) {
                    sb2.append("HTTP/1.0");
                } else {
                    sb2.append("HTTP/1.1");
                }
                sb2.append(' ');
                sb2.append(this.f17e);
                sb2.append(' ');
                sb2.append((String) this.f19v);
                String string = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
                return string;
            case 12:
                return i();
            default:
                return super.toString();
        }
    }

    public void u(h3.c db) throws IOException {
        r rVar = (r) this.f19v;
        Intrinsics.checkNotNullParameter(db, "db");
        Intrinsics.checkNotNullParameter(db, "db");
        Cursor cursorZ = db.z("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z5 = cursorZ.moveToFirst() && cursorZ.getInt(0) == 0;
            cursorZ.close();
            r.e(db);
            if (!z5) {
                a3.n nVarK = r.k(db);
                if (!nVarK.f106b) {
                    throw new IllegalStateException("Pre-packaged database has an invalid schema: " + nVarK.f105a);
                }
            }
            A(db);
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) rVar.f17922d;
            List list = workDatabase_Impl.f2823f;
            if (list != null) {
                int size = list.size();
                for (int i7 = 0; i7 < size; i7++) {
                    ((w3.b) workDatabase_Impl.f2823f.get(i7)).getClass();
                    Intrinsics.checkNotNullParameter(db, "db");
                }
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                ls.d.k(cursorZ, th2);
                throw th3;
            }
        }
    }

    public void v(h3.c db) throws IOException {
        Intrinsics.checkNotNullParameter(db, "db");
        Intrinsics.checkNotNullParameter(db, "db");
        Intrinsics.checkNotNullParameter(db, "db");
        Cursor cursorZ = db.z("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            boolean z5 = cursorZ.moveToFirst() && cursorZ.getInt(0) != 0;
            cursorZ.close();
            if (z5) {
                Cursor cursorY = db.y(new g3.a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1", 0));
                try {
                    String string = cursorY.moveToFirst() ? cursorY.getString(0) : null;
                    cursorY.close();
                    if (!Intrinsics.areEqual("7d73d21f1bd82c9e5268b6dcf9fde2cb", string) && !Intrinsics.areEqual("3071c8717539de5d5353f4c8cd59a032", string)) {
                        throw new IllegalStateException(a3.e.l("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: 7d73d21f1bd82c9e5268b6dcf9fde2cb, found: ", string));
                    }
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        ls.d.k(cursorY, th2);
                        throw th3;
                    }
                }
            } else {
                a3.n nVarK = r.k(db);
                if (!nVarK.f106b) {
                    throw new IllegalStateException("Pre-packaged database has an invalid schema: " + nVarK.f105a);
                }
                A(db);
            }
            r rVar = (r) this.f19v;
            ((WorkDatabase_Impl) rVar.f17922d).f2818a = db;
            db.l("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) rVar.f17922d;
            Intrinsics.checkNotNullParameter(db, "db");
            a3.i iVar = workDatabase_Impl.f2821d;
            iVar.getClass();
            Intrinsics.checkNotNullParameter(db, "database");
            synchronized (iVar.k) {
                if (iVar.f79f) {
                    Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                } else {
                    db.l("PRAGMA temp_store = MEMORY;");
                    db.l("PRAGMA recursive_triggers='ON';");
                    db.l("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                    iVar.c(db);
                    iVar.f80g = db.g("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
                    iVar.f79f = true;
                    Unit unit = Unit.f14616a;
                }
            }
            List list = ((WorkDatabase_Impl) rVar.f17922d).f2823f;
            if (list != null) {
                int size = list.size();
                for (int i7 = 0; i7 < size; i7++) {
                    w3.b bVar = (w3.b) ((WorkDatabase_Impl) rVar.f17922d).f2823f.get(i7);
                    bVar.getClass();
                    Intrinsics.checkNotNullParameter(db, "db");
                    Intrinsics.checkNotNullParameter(db, "db");
                    db.c();
                    try {
                        StringBuilder sb2 = new StringBuilder("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < ");
                        bVar.f22005a.getClass();
                        sb2.append(System.currentTimeMillis() - w3.l.f22041a);
                        sb2.append(" AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
                        db.l(sb2.toString());
                        db.B();
                        db.i();
                    } catch (Throwable th4) {
                        db.i();
                        throw th4;
                    }
                }
            }
            this.f18i = null;
        } catch (Throwable th5) {
            try {
                throw th5;
            } catch (Throwable th6) {
                ls.d.k(cursorZ, th5);
                throw th6;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:? A[LOOP:3: B:11:0x002e->B:107:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x008f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x0074 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x0066 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:15:0x0035  */
    /* JADX WARN: Code duplicated, block: B:18:0x0046 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0048  */
    /* JADX WARN: Code duplicated, block: B:20:0x004d  */
    /* JADX WARN: Code duplicated, block: B:24:0x005b  */
    public void w(h3.c db, int i7, int i10) throws IOException {
        Set set;
        Iterable iterable;
        TreeMap treeMap;
        Set setKeySet;
        Iterator it;
        boolean z5;
        Integer targetVersion;
        int i11;
        int iIntValue;
        int iIntValue2;
        r rVar = (r) this.f19v;
        Intrinsics.checkNotNullParameter(db, "db");
        a3.b bVar = (a3.b) this.f18i;
        if (bVar != null) {
            fj.c cVar = bVar.f57d;
            cVar.getClass();
            if (i7 == i10) {
                iterable = n0.f14659d;
            } else {
                boolean z6 = i10 > i7;
                ArrayList arrayList = new ArrayList();
                int iIntValue3 = i7;
                while (true) {
                    if (z6) {
                        if (iIntValue3 < i10) {
                            treeMap = (TreeMap) ((LinkedHashMap) cVar.f9267e).get(Integer.valueOf(iIntValue3));
                            if (treeMap != null) {
                                if (z6) {
                                    setKeySet = treeMap.descendingKeySet();
                                } else {
                                    setKeySet = treeMap.keySet();
                                }
                                it = setKeySet.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        z5 = false;
                                        break;
                                    }
                                    targetVersion = (Integer) it.next();
                                    if (z6) {
                                        i11 = iIntValue3 + 1;
                                        Intrinsics.checkNotNullExpressionValue(targetVersion, "targetVersion");
                                        iIntValue = targetVersion.intValue();
                                        if (i11 <= iIntValue && iIntValue <= i10) {
                                            Object obj = treeMap.get(targetVersion);
                                            Intrinsics.checkNotNull(obj);
                                            arrayList.add(obj);
                                            iIntValue3 = targetVersion.intValue();
                                            z5 = true;
                                            break;
                                        }
                                    } else {
                                        Intrinsics.checkNotNullExpressionValue(targetVersion, "targetVersion");
                                        iIntValue2 = targetVersion.intValue();
                                        if (i10 <= iIntValue2 && iIntValue2 < iIntValue3) {
                                            Object obj2 = treeMap.get(targetVersion);
                                            Intrinsics.checkNotNull(obj2);
                                            arrayList.add(obj2);
                                            iIntValue3 = targetVersion.intValue();
                                            z5 = true;
                                            break;
                                            break;
                                        }
                                    }
                                }
                                if (!z5) {
                                }
                            }
                            iterable = null;
                        } else {
                            iterable = arrayList;
                        }
                    } else if (iIntValue3 > i10) {
                        treeMap = (TreeMap) ((LinkedHashMap) cVar.f9267e).get(Integer.valueOf(iIntValue3));
                        if (treeMap != null) {
                            if (z6) {
                                setKeySet = treeMap.descendingKeySet();
                            } else {
                                setKeySet = treeMap.keySet();
                            }
                            it = setKeySet.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    z5 = false;
                                    break;
                                    break;
                                }
                                targetVersion = (Integer) it.next();
                                if (z6) {
                                    i11 = iIntValue3 + 1;
                                    Intrinsics.checkNotNullExpressionValue(targetVersion, "targetVersion");
                                    iIntValue = targetVersion.intValue();
                                    if (i11 <= iIntValue) {
                                        continue;
                                    }
                                } else {
                                    Intrinsics.checkNotNullExpressionValue(targetVersion, "targetVersion");
                                    iIntValue2 = targetVersion.intValue();
                                    if (i10 <= iIntValue2) {
                                        continue;
                                    }
                                }
                            }
                            if (!z5) {
                            }
                        }
                        iterable = null;
                    } else {
                        iterable = arrayList;
                    }
                }
            }
            if (iterable != null) {
                Intrinsics.checkNotNullParameter(db, "db");
                sn.e eVarB = c0.b();
                Cursor cursorZ = db.z("SELECT name FROM sqlite_master WHERE type = 'trigger'");
                while (cursorZ.moveToNext()) {
                    try {
                        eVarB.add(cursorZ.getString(0));
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            ls.d.k(cursorZ, th2);
                            throw th3;
                        }
                    }
                }
                Unit unit = Unit.f14616a;
                cursorZ.close();
                ListIterator listIterator = c0.a(eVarB).listIterator(0);
                while (true) {
                    sn.b bVar2 = (sn.b) listIterator;
                    if (!bVar2.hasNext()) {
                        break;
                    }
                    String triggerName = (String) bVar2.next();
                    Intrinsics.checkNotNullExpressionValue(triggerName, "triggerName");
                    if (x.o(triggerName, "room_fts_content_sync_", false)) {
                        db.l("DROP TRIGGER IF EXISTS ".concat(triggerName));
                    }
                }
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    ((b3.a) it2.next()).a(db);
                }
                a3.n nVarK = r.k(db);
                if (!nVarK.f106b) {
                    throw new IllegalStateException("Migration didn't properly handle: " + nVarK.f105a);
                }
                A(db);
                return;
            }
        }
        a3.b bVar3 = (a3.b) this.f18i;
        if (bVar3 != null) {
            if (!((i7 <= i10 || !bVar3.k) && bVar3.j && ((set = bVar3.f63l) == null || !set.contains(Integer.valueOf(i7))))) {
                db.l("DROP TABLE IF EXISTS `Dependency`");
                db.l("DROP TABLE IF EXISTS `WorkSpec`");
                db.l("DROP TABLE IF EXISTS `WorkTag`");
                db.l("DROP TABLE IF EXISTS `SystemIdInfo`");
                db.l("DROP TABLE IF EXISTS `WorkName`");
                db.l("DROP TABLE IF EXISTS `WorkProgress`");
                db.l("DROP TABLE IF EXISTS `Preference`");
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) rVar.f17922d;
                List list = workDatabase_Impl.f2823f;
                if (list != null) {
                    int size = list.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        ((w3.b) workDatabase_Impl.f2823f.get(i12)).getClass();
                        Intrinsics.checkNotNullParameter(db, "db");
                    }
                }
                r.e(db);
                return;
            }
        }
        throw new IllegalStateException(s0.g.c(i7, "A migration from ", i10, " to ", " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods."));
    }

    public void x(Object obj, Object obj2) {
        int i7 = (this.f17e + 1) * 2;
        Object[] objArr = (Object[]) this.f18i;
        if (i7 > objArr.length) {
            this.f18i = Arrays.copyOf(objArr, y.d(objArr.length, i7));
        }
        if (obj == null) {
            String strValueOf = String.valueOf(obj2);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 24);
            sb2.append("null key in entry: null=");
            sb2.append(strValueOf);
            throw new NullPointerException(sb2.toString());
        }
        if (obj2 == null) {
            String strValueOf2 = String.valueOf(obj);
            StringBuilder sb3 = new StringBuilder(strValueOf2.length() + 26);
            sb3.append("null value in entry: ");
            sb3.append(strValueOf2);
            sb3.append("=null");
            throw new NullPointerException(sb3.toString());
        }
        Object[] objArr2 = (Object[]) this.f18i;
        int i10 = this.f17e;
        int i11 = i10 * 2;
        objArr2[i11] = obj;
        objArr2[i11 + 1] = obj2;
        this.f17e = i10 + 1;
    }

    @Override // pc.e
    public void y() {
        w wVar = (w) this.f19v;
        byte[] bArr = e0.f13793f;
        wVar.getClass();
        wVar.D(bArr, bArr.length);
    }

    public List z(CharSequence charSequence) {
        charSequence.getClass();
        u4.c cVar = (u4.c) this.f19v;
        cVar.getClass();
        di.i iVar = new di.i(cVar, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (iVar.hasNext()) {
            arrayList.add((String) iVar.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public /* synthetic */ d(Object obj, int i7, Serializable serializable, int i10) {
        this.f16d = i10;
        this.f18i = obj;
        this.f17e = i7;
        this.f19v = serializable;
    }

    public d() {
        this.f16d = 15;
        this.f18i = Collections.synchronizedMap(new s.e(0));
        this.f17e = 0;
    }

    public d(String str, String[] strArr) {
        String string;
        this.f16d = 4;
        if (strArr.length == 0) {
            string = "";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('[');
            for (String str2 : strArr) {
                if (sb2.length() > 1) {
                    sb2.append(",");
                }
                sb2.append(str2);
            }
            sb2.append("] ");
            string = sb2.toString();
        }
        this.f19v = string;
        this.f18i = str;
        int length = str.length();
        Object[] objArr = {str, 23};
        if (length <= 23) {
            int i7 = 2;
            while (i7 <= 7 && !Log.isLoggable((String) this.f18i, i7)) {
                i7++;
            }
            this.f17e = i7;
            return;
        }
        throw new IllegalArgumentException(String.format("tag \"%s\" is longer than the %d character maximum", objArr));
    }

    public d(t protocol, int i7, String message) {
        this.f16d = 8;
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(message, "message");
        this.f18i = protocol;
        this.f17e = i7;
        this.f19v = message;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(a3.b configuration, r delegate) {
        this(20, 1);
        this.f16d = 1;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter("7d73d21f1bd82c9e5268b6dcf9fde2cb", "identityHash");
        Intrinsics.checkNotNullParameter("3071c8717539de5d5353f4c8cd59a032", "legacyHash");
        this.f18i = configuration;
        this.f19v = delegate;
    }

    public d(mc.q qVar) {
        this.f16d = 11;
        this.f18i = new SparseArray();
        this.f19v = qVar;
        this.f17e = -1;
    }

    public d(Shader shader, ColorStateList colorStateList, int i7) {
        this.f16d = 0;
        this.f18i = shader;
        this.f19v = colorStateList;
        this.f17e = i7;
    }

    public d(int i7, b0 b0Var) {
        this.f16d = 14;
        this.f17e = i7;
        this.f18i = b0Var;
        this.f19v = new w();
    }

    public d(int i7, int i10) {
        this.f16d = i10;
        switch (i10) {
            case 6:
                this.f18i = new Object[i7 * 2];
                this.f17e = 0;
                break;
            default:
                this.f17e = i7;
                break;
        }
    }

    public d(u4.c cVar) {
        this.f16d = 5;
        this.f19v = cVar;
        this.f18i = di.c.f7628d;
        this.f17e = Integer.MAX_VALUE;
    }

    public d(CopyOnWriteArrayList copyOnWriteArrayList, int i7, s sVar) {
        this.f16d = 10;
        this.f19v = copyOnWriteArrayList;
        this.f17e = i7;
        this.f18i = sVar;
    }
}
