package af;

import a5.l0;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.appcompat.widget.b4;
import androidx.appcompat.widget.k3;
import androidx.appcompat.widget.n2;
import com.appsflyer.AppsFlyerProperties;
import com.discord.R;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.tasks.Task;
import ei.w0;
import gc.u1;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import pp.a1;
import pp.s0;
import pp.x0;
import sh.d1;
import sh.g1;
import sh.p0;
import sh.v0;
import vo.n0;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements hq.b, hq.d, th.g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f393d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f394e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f395i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Object f396v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f397w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f398x;

    public c(String str, String str2, Set set) {
        Set setUnmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.f393d = setUnmodifiableSet;
        Map map = Collections.EMPTY_MAP;
        this.f395i = str;
        this.f396v = str2;
        this.f397w = fg.a.f9163d;
        HashSet hashSet = new HashSet(setUnmodifiableSet);
        Iterator it = map.values().iterator();
        if (it.hasNext()) {
            throw s0.g.a(it);
        }
        this.f394e = Collections.unmodifiableSet(hashSet);
    }

    public static LayerDrawable B(n2 n2Var, Context context, int i7) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i7);
        Drawable drawableC = n2Var.c(context, R.drawable.abc_star_black_48dp);
        Drawable drawableC2 = n2Var.c(context, R.drawable.abc_star_half_black_48dp);
        if ((drawableC instanceof BitmapDrawable) && drawableC.getIntrinsicWidth() == dimensionPixelSize && drawableC.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableC;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableC.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableC.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableC2 instanceof BitmapDrawable) && drawableC2.getIntrinsicWidth() == dimensionPixelSize && drawableC2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableC2;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableC2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableC2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public static boolean F(md.s sVar, Object obj, boolean z5, int i7, int i10, int i11) {
        Object obj2 = sVar.f15689a;
        int i12 = sVar.f15690b;
        if (!obj2.equals(obj)) {
            return false;
        }
        if (z5 && i12 == i7 && sVar.f15691c == i10) {
            return true;
        }
        return !z5 && i12 == -1 && sVar.f15693e == i11;
    }

    public static void M(Drawable drawable, int i7, PorterDuff.Mode mode) {
        Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = androidx.appcompat.widget.w.f1146b;
        }
        drawableMutate.setColorFilter(androidx.appcompat.widget.w.c(i7, mode));
    }

    public static ie.o b(DataInputStream dataInputStream) throws IOException {
        int i7 = dataInputStream.readInt();
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < i7; i10++) {
            String utf = dataInputStream.readUTF();
            int i11 = dataInputStream.readInt();
            if (i11 < 0) {
                throw new IOException(kk.b.h(i11, "Invalid value size: "));
            }
            int iMin = Math.min(i11, 10485760);
            byte[] bArrCopyOf = je.e0.f13793f;
            int i12 = 0;
            while (i12 != i11) {
                int i13 = i12 + iMin;
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i13);
                dataInputStream.readFully(bArrCopyOf, i12, iMin);
                iMin = Math.min(i11 - i13, 10485760);
                i12 = i13;
            }
            map.put(utf, bArrCopyOf);
        }
        return new ie.o(map);
    }

    public static void f(ie.o oVar, DataOutputStream dataOutputStream) throws IOException {
        Set<Map.Entry> setEntrySet = oVar.f11756b.entrySet();
        dataOutputStream.writeInt(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            dataOutputStream.writeUTF((String) entry.getKey());
            byte[] bArr = (byte[]) entry.getValue();
            dataOutputStream.writeInt(bArr.length);
            dataOutputStream.write(bArr);
        }
    }

    public static final zp.g g(c cVar, up.e eVar, Object obj) {
        zp.g gVarB = zp.h.b(obj, (yo.z) cVar.f395i);
        if (gVarB != null) {
            return gVarB;
        }
        String message = "Unsupported annotation argument: " + eVar;
        Intrinsics.checkNotNullParameter(message, "message");
        return new zp.j(message);
    }

    public static boolean k(int i7, int[] iArr) {
        for (int i10 : iArr) {
            if (i10 == i7) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList o(Context context, int i7) {
        int iC = k3.c(context, R.attr.colorControlHighlight);
        int iB = k3.b(context, R.attr.colorButtonNormal);
        int[] iArr = k3.f1013b;
        int[] iArr2 = k3.f1015d;
        int iC2 = b1.c.c(iC, i7);
        return new ColorStateList(new int[][]{iArr, iArr2, k3.f1014c, k3.f1017f}, new int[]{iB, iC2, b1.c.c(iC, i7), i7});
    }

    public static /* synthetic */ List u(c cVar, a3.r rVar, np.p pVar, Boolean bool, boolean z5, int i7) {
        boolean z6 = (i7 & 4) == 0;
        if ((i7 & 16) != 0) {
            bool = null;
        }
        return cVar.r(rVar, pVar, z6, false, bool, (i7 & 32) != 0 ? false : z5);
    }

    public static md.s x(Player player, ei.e0 e0Var, md.s sVar, u1 u1Var) {
        Timeline timelineJ = player.J();
        int iJ = player.j();
        Object objL = timelineJ.p() ? null : timelineJ.l(iJ);
        int iB = (player.c() || timelineJ.p()) ? -1 : timelineJ.f(iJ, u1Var, false).b(je.e0.I(player.S()) - u1Var.f9890w);
        for (int i7 = 0; i7 < e0Var.size(); i7++) {
            md.s sVar2 = (md.s) e0Var.get(i7);
            if (F(sVar2, objL, player.c(), player.C(), player.o(), iB)) {
                return sVar2;
            }
        }
        if (e0Var.isEmpty() && sVar != null && F(sVar, objL, player.c(), player.C(), player.o(), iB)) {
            return sVar;
        }
        return null;
    }

    public static np.p z(vp.a proto, rp.f nameResolver, pf.b typeTable, hq.a kind, boolean z5) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        Intrinsics.checkNotNullParameter(kind, "kind");
        if (proto instanceof pp.n) {
            vp.g gVar = tp.g.f20880a;
            tp.e eVarA = tp.g.a((pp.n) proto, nameResolver, typeTable);
            if (eVarA != null) {
                return android.support.v4.media.session.b.j(eVarA);
            }
        } else if (proto instanceof pp.a0) {
            vp.g gVar2 = tp.g.f20880a;
            tp.e eVarC = tp.g.c((pp.a0) proto, nameResolver, typeTable);
            if (eVarC != null) {
                return android.support.v4.media.session.b.j(eVarC);
            }
        } else if (proto instanceof pp.i0) {
            vp.m propertySignature = sp.k.f20486d;
            Intrinsics.checkNotNullExpressionValue(propertySignature, "propertySignature");
            sp.e eVar = (sp.e) m3.m.B((vp.k) proto, propertySignature);
            if (eVar != null) {
                int iOrdinal = kind.ordinal();
                if (iOrdinal == 1) {
                    return zs.a.y((pp.i0) proto, nameResolver, typeTable, true, true, z5);
                }
                if (iOrdinal == 2) {
                    if ((eVar.f20449e & 4) != 4) {
                        return null;
                    }
                    sp.c signature = eVar.f20452w;
                    Intrinsics.checkNotNullExpressionValue(signature, "getGetter(...)");
                    Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
                    Intrinsics.checkNotNullParameter(signature, "signature");
                    String name = nameResolver.getString(signature.f20438i);
                    String desc = nameResolver.getString(signature.f20439v);
                    Intrinsics.checkNotNullParameter(name, "name");
                    Intrinsics.checkNotNullParameter(desc, "desc");
                    return new np.p(kk.b.j(name, desc));
                }
                if (iOrdinal != 3 || (eVar.f20449e & 8) != 8) {
                    return null;
                }
                sp.c signature2 = eVar.f20453x;
                Intrinsics.checkNotNullExpressionValue(signature2, "getSetter(...)");
                Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
                Intrinsics.checkNotNullParameter(signature2, "signature");
                String name2 = nameResolver.getString(signature2.f20438i);
                String desc2 = nameResolver.getString(signature2.f20439v);
                Intrinsics.checkNotNullParameter(name2, "name");
                Intrinsics.checkNotNullParameter(desc2, "desc");
                return new np.p(kk.b.j(name2, desc2));
            }
        }
        return null;
    }

    public ie.k A(String str) {
        HashMap map = (HashMap) this.f393d;
        ie.k kVar = (ie.k) map.get(str);
        if (kVar != null) {
            return kVar;
        }
        SparseArray sparseArray = (SparseArray) this.f394e;
        int size = sparseArray.size();
        int i7 = 0;
        int iKeyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (iKeyAt < 0) {
            while (i7 < size && i7 == sparseArray.keyAt(i7)) {
                i7++;
            }
            iKeyAt = i7;
        }
        ie.k kVar2 = new ie.k(iKeyAt, str, ie.o.f11754c);
        map.put(str, kVar2);
        sparseArray.put(iKeyAt, str);
        ((SparseBooleanArray) this.f396v).put(iKeyAt, true);
        ((ie.m) this.f397w).c(kVar2);
        return kVar2;
    }

    public ColorStateList C(Context context, int i7) {
        if (i7 == R.drawable.abc_edit_text_material) {
            return y0.b.c(context, R.color.abc_tint_edittext);
        }
        if (i7 == 2131230862) {
            return y0.b.c(context, R.color.abc_tint_switch_track);
        }
        if (i7 != R.drawable.abc_switch_thumb_material) {
            if (i7 == R.drawable.abc_btn_default_mtrl_shape) {
                return o(context, k3.c(context, R.attr.colorButtonNormal));
            }
            if (i7 == R.drawable.abc_btn_borderless_material) {
                return o(context, 0);
            }
            if (i7 == R.drawable.abc_btn_colored_material) {
                return o(context, k3.c(context, R.attr.colorAccent));
            }
            if (i7 == 2131230857 || i7 == R.drawable.abc_spinner_textfield_background_material) {
                return y0.b.c(context, R.color.abc_tint_spinner);
            }
            if (k(i7, (int[]) this.f394e)) {
                return k3.d(context, R.attr.colorControlNormal);
            }
            if (k(i7, (int[]) this.f397w)) {
                return y0.b.c(context, R.color.abc_tint_default);
            }
            if (k(i7, (int[]) this.f398x)) {
                return y0.b.c(context, R.color.abc_tint_btn_checkable);
            }
            if (i7 == R.drawable.abc_seekbar_thumb_material) {
                return y0.b.c(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListD = k3.d(context, R.attr.colorSwitchThumbNormal);
        if (colorStateListD == null || !colorStateListD.isStateful()) {
            iArr[0] = k3.f1013b;
            iArr2[0] = k3.b(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = k3.f1016e;
            iArr2[1] = k3.c(context, R.attr.colorControlActivated);
            iArr[2] = k3.f1017f;
            iArr2[2] = k3.c(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = k3.f1013b;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListD.getColorForState(iArr3, 0);
            iArr[1] = k3.f1016e;
            iArr2[1] = k3.c(context, R.attr.colorControlActivated);
            iArr[2] = k3.f1017f;
            iArr2[2] = colorStateListD.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    public void D(long j) {
        ie.m mVar;
        SparseArray sparseArray = (SparseArray) this.f394e;
        HashMap map = (HashMap) this.f393d;
        ie.m mVar2 = (ie.m) this.f397w;
        mVar2.f(j);
        ie.m mVar3 = (ie.m) this.f398x;
        if (mVar3 != null) {
            mVar3.f(j);
        }
        if (mVar2.d() || (mVar = (ie.m) this.f398x) == null || !mVar.d()) {
            mVar2.g(map, sparseArray);
        } else {
            ((ie.m) this.f398x).g(map, sparseArray);
            mVar2.a(map);
        }
        ie.m mVar4 = (ie.m) this.f398x;
        if (mVar4 != null) {
            mVar4.h();
            this.f398x = null;
        }
    }

    public boolean E(up.b classId) {
        ap.b klass;
        Intrinsics.checkNotNullParameter(classId, "classId");
        if (classId.e() == null || !Intrinsics.areEqual(classId.f().b(), "Container") || (klass = l0.t((ue.i) this.f393d, classId, (rp.e) this.f398x)) == null) {
            return false;
        }
        LinkedHashSet linkedHashSet = ro.b.f19504a;
        Intrinsics.checkNotNullParameter(klass, "klass");
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        ro.a visitor = new ro.a(booleanRef);
        Intrinsics.checkNotNullParameter(visitor, "visitor");
        Class klass2 = klass.f2856a;
        Intrinsics.checkNotNullParameter(klass2, "klass");
        Intrinsics.checkNotNullParameter(visitor, "visitor");
        Iterator it = ArrayIteratorKt.iterator(klass2.getDeclaredAnnotations());
        while (it.hasNext()) {
            Annotation annotation = (Annotation) it.next();
            Intrinsics.checkNotNull(annotation);
            zs.a.O(visitor, annotation);
        }
        return booleanRef.element;
    }

    public b4 G(up.b annotationClassId, n0 source, List result) {
        Intrinsics.checkNotNullParameter(annotationClassId, "annotationClassId");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(result, "result");
        vo.f fVarQ = mo.c0.q((yo.z) this.f395i, annotationClassId, (com.google.firebase.messaging.r) this.f396v);
        b4 b4Var = new b4();
        b4Var.f911i = this;
        b4Var.f912v = fVarQ;
        b4Var.f913w = annotationClassId;
        b4Var.f914x = result;
        b4Var.f915y = source;
        b4Var.f909d = this;
        b4Var.f910e = new HashMap();
        return b4Var;
    }

    public b4 H(up.b annotationClassId, ap.a source, List result) {
        Intrinsics.checkNotNullParameter(annotationClassId, "annotationClassId");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(result, "result");
        if (ro.b.f19504a.contains(annotationClassId)) {
            return null;
        }
        return G(annotationClassId, source, result);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003d  */
    public Object I(a3.r container, pp.i0 i0Var, hq.a aVar, lq.z zVar, Function2 function2) {
        Object constant;
        ap.b bVarU = yk.a.u(container, true, true, rp.d.B.g(i0Var.f18318v), tp.g.d(i0Var), (ue.i) this.f393d, (rp.e) this.f398x);
        Intrinsics.checkNotNullParameter(container, "container");
        if (bVarU == null) {
            if (container instanceof hq.u) {
                n0 n0Var = (n0) ((hq.u) container).f119d;
                np.o oVar = n0Var instanceof np.o ? (np.o) n0Var : null;
                if (oVar != null) {
                    bVarU = oVar.f17016d;
                } else {
                    bVarU = null;
                }
            } else {
                bVarU = null;
            }
        }
        if (bVarU != null) {
            rp.e eVar = (rp.e) bVarU.f2857b.f10248d;
            rp.e version = np.e.f16995e;
            Intrinsics.checkNotNullParameter(version, "version");
            np.p pVarZ = z(i0Var, (rp.f) container.f117b, (pf.b) container.f118c, aVar, eVar.a(version.f19507b, version.f19508c, version.f19509d));
            if (pVarZ != null && (constant = function2.invoke(((kq.e) this.f394e).invoke(bVarU), pVarZ)) != null) {
                if (so.t.a(zVar)) {
                    constant = (zp.g) constant;
                    Intrinsics.checkNotNullParameter(constant, "constant");
                    if (constant instanceof zp.d) {
                        return new zp.z(((Number) ((zp.d) constant).f24066a).byteValue());
                    }
                    if (constant instanceof zp.w) {
                        return new zp.z(((Number) ((zp.w) constant).f24066a).shortValue());
                    }
                    if (constant instanceof zp.k) {
                        return new zp.z(((Number) ((zp.k) constant).f24066a).intValue());
                    }
                    if (constant instanceof zp.u) {
                        return new zp.z(((Number) ((zp.u) constant).f24066a).longValue());
                    }
                }
                return constant;
            }
        }
        return null;
    }

    public List J(a3.r rVar, pp.i0 i0Var, np.b bVar) {
        pf.b bVar2 = (pf.b) rVar.f118c;
        rp.f fVar = (rp.f) rVar.f117b;
        Boolean boolG = rp.d.B.g(i0Var.f18318v);
        Intrinsics.checkNotNullExpressionValue(boolG, "get(...)");
        boolean zD = tp.g.d(i0Var);
        if (bVar == np.b.f16984d) {
            np.p pVarY = zs.a.y(i0Var, fVar, bVar2, (40 & 8) == 0, (40 & 16) == 0, true);
            return pVarY == null ? kotlin.collections.n0.f14659d : u(this, rVar, pVarY, boolG, zD, 8);
        }
        np.p pVarY2 = zs.a.y(i0Var, fVar, bVar2, (40 & 8) == 0, (40 & 16) == 0, true);
        if (pVarY2 == null) {
            return kotlin.collections.n0.f14659d;
        }
        return StringsKt.D(pVarY2.f17017a, "$delegate", false) != (bVar == np.b.f16986i) ? kotlin.collections.n0.f14659d : r(rVar, pVarY2, true, true, boolG, zD);
    }

    public void K(String str) {
        SparseArray sparseArray = (SparseArray) this.f394e;
        SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) this.f396v;
        HashMap map = (HashMap) this.f393d;
        ie.k kVar = (ie.k) map.get(str);
        if (kVar != null && kVar.f11746c.isEmpty() && kVar.f11747d.isEmpty()) {
            map.remove(str);
            int i7 = kVar.f11744a;
            boolean z5 = sparseBooleanArray.get(i7);
            ((ie.m) this.f397w).b(kVar, z5);
            if (z5) {
                sparseArray.remove(i7);
                sparseBooleanArray.delete(i7);
            } else {
                sparseArray.put(i7, null);
                ((SparseBooleanArray) this.f395i).put(i7, true);
            }
        }
    }

    public void L(String str, String str2, Bundle bundle) {
        int i7;
        String str3;
        String strEncodeToString;
        boolean zG;
        int i10;
        PackageInfo packageInfoD;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        ji.f fVar = (ji.f) this.f393d;
        fVar.a();
        bundle.putString("gmp_app_id", fVar.f13892c.f13905b);
        com.google.firebase.messaging.p pVar = (com.google.firebase.messaging.p) this.f394e;
        synchronized (pVar) {
            try {
                if (pVar.f6602a == 0 && (packageInfoD = pVar.d("com.google.android.gms")) != null) {
                    pVar.f6602a = packageInfoD.versionCode;
                }
                i7 = pVar.f6602a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        bundle.putString("gmsv", Integer.toString(i7));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", ((com.google.firebase.messaging.p) this.f394e).b());
        com.google.firebase.messaging.p pVar2 = (com.google.firebase.messaging.p) this.f394e;
        synchronized (pVar2) {
            try {
                if (((String) pVar2.f6606e) == null) {
                    pVar2.g();
                }
                str3 = (String) pVar2.f6606e;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        bundle.putString("app_ver_name", str3);
        ji.f fVar2 = (ji.f) this.f393d;
        fVar2.a();
        try {
            strEncodeToString = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(fVar2.f13891b.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            strEncodeToString = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", strEncodeToString);
        try {
            String str4 = ((yi.a) l0.h(((yi.c) ((yi.d) this.f398x)).d())).f23351a;
            if (TextUtils.isEmpty(str4)) {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", str4);
            }
        } catch (InterruptedException e10) {
            e = e10;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
        } catch (ExecutionException e11) {
            e = e11;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
        }
        bundle.putString(AppsFlyerProperties.APP_ID, (String) l0.h(((yi.c) ((yi.d) this.f398x)).c()));
        bundle.putString("cliv", "fcm-24.0.0");
        vi.f fVar3 = (vi.f) ((xi.a) this.f397w).get();
        fj.b bVar = (fj.b) ((xi.a) this.f396v).get();
        if (fVar3 == null || bVar == null) {
            return;
        }
        vi.c cVar = (vi.c) fVar3;
        synchronized (cVar) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            vi.g gVar = (vi.g) cVar.f21675a.get();
            synchronized (gVar) {
                zG = gVar.g(jCurrentTimeMillis);
            }
            if (zG) {
                synchronized (gVar) {
                    String strD = gVar.d(System.currentTimeMillis());
                    gVar.f21681a.edit().putString("last-used-date", strD).commit();
                    gVar.f(strD);
                }
                i10 = 3;
            } else {
                i10 = 1;
            }
        }
        if (i10 != 1) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(f0.e.b(i10)));
            bundle.putString("Firebase-Client", bVar.a());
        }
    }

    public Task N(String str, String str2, Bundle bundle) {
        int i7;
        try {
            L(str, str2, bundle);
            Rpc rpc = (Rpc) this.f395i;
            we.g gVar = we.g.f22202i;
            a5.g gVar2 = rpc.f5924c;
            if (gVar2.h() < 12000000) {
                return gVar2.i() != 0 ? rpc.a(bundle).g(gVar, new e4.r(24, rpc, bundle)) : l0.u(new IOException("MISSING_INSTANCEID_SERVICE"));
            }
            we.k kVarE = we.k.e(rpc.f5923b);
            synchronized (kVarE) {
                i7 = kVarE.f22219b;
                kVarE.f22219b = i7 + 1;
            }
            return kVarE.f(new we.j(i7, 1, bundle, 1)).f(gVar, we.c.f22195e);
        } catch (InterruptedException | ExecutionException e10) {
            return l0.u(e10);
        }
    }

    public void O() {
        ((ie.m) this.f397w).e((HashMap) this.f393d);
        SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) this.f395i;
        int size = sparseBooleanArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((SparseArray) this.f394e).remove(sparseBooleanArray.keyAt(i7));
        }
        sparseBooleanArray.clear();
        ((SparseBooleanArray) this.f396v).clear();
    }

    public void P(Timeline timeline) {
        a1.d dVar = new a1.d(4, 6);
        if (((ei.e0) this.f394e).isEmpty()) {
            j(dVar, (md.s) this.f397w, timeline);
            if (!ls.d.n((md.s) this.f398x, (md.s) this.f397w)) {
                j(dVar, (md.s) this.f398x, timeline);
            }
            if (!ls.d.n((md.s) this.f396v, (md.s) this.f397w) && !ls.d.n((md.s) this.f396v, (md.s) this.f398x)) {
                j(dVar, (md.s) this.f396v, timeline);
            }
        } else {
            for (int i7 = 0; i7 < ((ei.e0) this.f394e).size(); i7++) {
                j(dVar, (md.s) ((ei.e0) this.f394e).get(i7), timeline);
            }
            if (!((ei.e0) this.f394e).contains((md.s) this.f396v)) {
                j(dVar, (md.s) this.f396v, timeline);
            }
        }
        this.f395i = dVar.b();
    }

    @Override // th.g
    public Object a() {
        Object objA = ((th.f) this.f393d).a();
        th.f fVar = new th.f(new pf.b(8, (po.d) this.f394e));
        Object objA2 = ((th.f) this.f395i).a();
        return new d1((sh.s) objA, fVar, (v0) objA2, new th.f(new pf.b(8, (th.f) this.f396v)), (p0) ((th.f) this.f397w).a(), (g1) ((th.f) this.f398x).a());
    }

    @Override // hq.d
    public ArrayList c(s0 proto, rp.f nameResolver) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Object objK = proto.k(sp.k.f20488f);
        Intrinsics.checkNotNullExpressionValue(objK, "getExtension(...)");
        Iterable<pp.h> iterable = (Iterable) objK;
        ArrayList arrayList = new ArrayList(kotlin.collections.e0.l(iterable, 10));
        for (pp.h proto2 : iterable) {
            Intrinsics.checkNotNull(proto2);
            Intrinsics.checkNotNullParameter(proto2, "proto");
            Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
            arrayList.add(((io.sentry.internal.debugmeta.c) this.f397w).s0(proto2, nameResolver));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003d  */
    @Override // hq.d
    public List d(a3.r container, vp.a callableProto, hq.a kind, int i7, a1 proto) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(callableProto, "callableProto");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(proto, "proto");
        int i10 = 0;
        np.p signature = z(callableProto, (rp.f) container.f117b, (pf.b) container.f118c, kind, false);
        if (signature == null) {
            return kotlin.collections.n0.f14659d;
        }
        if (callableProto instanceof pp.a0) {
            pp.a0 a0Var = (pp.a0) callableProto;
            Intrinsics.checkNotNullParameter(a0Var, "<this>");
            int i11 = a0Var.f18200i;
            if ((i11 & 32) == 32 || (i11 & 64) == 64) {
                i10 = 1;
            }
        } else if (callableProto instanceof pp.i0) {
            pp.i0 i0Var = (pp.i0) callableProto;
            Intrinsics.checkNotNullParameter(i0Var, "<this>");
            int i12 = i0Var.f18317i;
            if ((i12 & 32) == 32 || (i12 & 64) == 64) {
                i10 = 1;
            }
        } else {
            if (!(callableProto instanceof pp.n)) {
                throw new UnsupportedOperationException("Unsupported message: " + callableProto.getClass());
            }
            Intrinsics.checkNotNull(container, "null cannot be cast to non-null type org.jetbrains.kotlin.serialization.deserialization.ProtoContainer.Class");
            hq.u uVar = (hq.u) container;
            if (uVar.f11073h == pp.j.ENUM_CLASS) {
                i10 = 2;
            } else if (uVar.f11074i) {
                i10 = 1;
            }
        }
        Intrinsics.checkNotNullParameter(signature, "signature");
        return u(this, container, new np.p(signature.f17017a + '@' + (i7 + i10)), null, false, 60);
    }

    @Override // hq.d
    public List e(a3.r container, vp.a proto, hq.a kind) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(kind, "kind");
        if (kind == hq.a.f10993e) {
            return J(container, (pp.i0) proto, np.b.f16984d);
        }
        np.p pVarZ = z(proto, (rp.f) container.f117b, (pf.b) container.f118c, kind, false);
        return pVarZ == null ? kotlin.collections.n0.f14659d : u(this, container, pVarZ, null, false, 60);
    }

    @Override // hq.d
    public List h(a3.r container, vp.a proto, hq.a kind) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(kind, "kind");
        np.p signature = z(proto, (rp.f) container.f117b, (pf.b) container.f118c, kind, false);
        if (signature == null) {
            return kotlin.collections.n0.f14659d;
        }
        Intrinsics.checkNotNullParameter(signature, "signature");
        return u(this, container, new np.p(com.discord.chat.presentation.list.a.k(new StringBuilder(), signature.f17017a, "@0")), null, false, 60);
    }

    public void i(String str, String str2) {
        HashMap map = (HashMap) this.f397w;
        if (map == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map.put(str, str2);
    }

    public void j(a1.d dVar, md.s sVar, Timeline timeline) {
        if (sVar == null) {
            return;
        }
        if (timeline.b(sVar.f15689a) != -1) {
            dVar.x(sVar, timeline);
            return;
        }
        Timeline timeline2 = (Timeline) ((w0) this.f395i).get(sVar);
        if (timeline2 != null) {
            dVar.x(sVar, timeline2);
        }
    }

    @Override // hq.d
    public ArrayList l(x0 proto, rp.f nameResolver) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Object objK = proto.k(sp.k.f20490h);
        Intrinsics.checkNotNullExpressionValue(objK, "getExtension(...)");
        Iterable<pp.h> iterable = (Iterable) objK;
        ArrayList arrayList = new ArrayList(kotlin.collections.e0.l(iterable, 10));
        for (pp.h proto2 : iterable) {
            Intrinsics.checkNotNull(proto2);
            Intrinsics.checkNotNullParameter(proto2, "proto");
            Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
            arrayList.add(((io.sentry.internal.debugmeta.c) this.f397w).s0(proto2, nameResolver));
        }
        return arrayList;
    }

    public vb.h m() {
        String strJ = ((String) this.f395i) == null ? " transportName" : "";
        if (((vb.l) this.f393d) == null) {
            strJ = strJ.concat(" encodedPayload");
        }
        if (((Long) this.f394e) == null) {
            strJ = kk.b.j(strJ, " eventMillis");
        }
        if (((Long) this.f396v) == null) {
            strJ = kk.b.j(strJ, " uptimeMillis");
        }
        if (((HashMap) this.f397w) == null) {
            strJ = kk.b.j(strJ, " autoMetadata");
        }
        if (strJ.isEmpty()) {
            return new vb.h((String) this.f395i, (Integer) this.f398x, (vb.l) this.f393d, ((Long) this.f394e).longValue(), ((Long) this.f396v).longValue(), (HashMap) this.f397w);
        }
        throw new IllegalStateException("Missing required properties:".concat(strJ));
    }

    @Override // hq.b
    public Object n(a3.r container, pp.i0 proto, lq.z expectedType) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(expectedType, "expectedType");
        return I(container, proto, hq.a.f10993e, expectedType, np.a.f16982i);
    }

    public Task p(Task task) {
        return task.f(new com.discord.misc.utilities.threading.a(1), new com.google.firebase.messaging.n(this));
    }

    @Override // hq.b
    public Object q(a3.r container, pp.i0 proto, lq.z expectedType) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(expectedType, "expectedType");
        return I(container, proto, hq.a.f10994i, expectedType, np.a.f16981e);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0033  */
    public List r(a3.r container, np.p pVar, boolean z5, boolean z6, Boolean bool, boolean z7) {
        ap.b binaryClass = yk.a.u(container, z5, z6, bool, z7, (ue.i) this.f393d, (rp.e) this.f398x);
        Intrinsics.checkNotNullParameter(container, "container");
        if (binaryClass == null) {
            if (container instanceof hq.u) {
                n0 n0Var = (n0) ((hq.u) container).f119d;
                np.o oVar = n0Var instanceof np.o ? (np.o) n0Var : null;
                if (oVar != null) {
                    binaryClass = oVar.f17016d;
                } else {
                    binaryClass = null;
                }
            } else {
                binaryClass = null;
            }
        }
        if (binaryClass == null) {
            return kotlin.collections.n0.f14659d;
        }
        Intrinsics.checkNotNullParameter(binaryClass, "binaryClass");
        List list = (List) ((np.c) ((kq.e) this.f394e).invoke(binaryClass)).f16988a.get(pVar);
        return list == null ? kotlin.collections.n0.f14659d : list;
    }

    @Override // hq.d
    public List s(a3.r container, pp.i0 proto) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        return J(container, proto, np.b.f16986i);
    }

    @Override // hq.d
    public List t(a3.r container, pp.i0 proto) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        return J(container, proto, np.b.f16985e);
    }

    @Override // hq.d
    public ArrayList v(hq.u container) {
        Intrinsics.checkNotNullParameter(container, "container");
        n0 n0Var = (n0) container.f119d;
        np.o oVar = n0Var instanceof np.o ? (np.o) n0Var : null;
        ap.b kotlinClass = oVar != null ? oVar.f17016d : null;
        if (kotlinClass == null) {
            throw new IllegalStateException(("Class for loading annotations is not found: " + container.f11072g.a()).toString());
        }
        ArrayList arrayList = new ArrayList(1);
        e4.l visitor = new e4.l(14, this, arrayList);
        Intrinsics.checkNotNullParameter(kotlinClass, "kotlinClass");
        Intrinsics.checkNotNullParameter(visitor, "visitor");
        Class klass = kotlinClass.f2856a;
        Intrinsics.checkNotNullParameter(klass, "klass");
        Intrinsics.checkNotNullParameter(visitor, "visitor");
        Iterator it = ArrayIteratorKt.iterator(klass.getDeclaredAnnotations());
        while (it.hasNext()) {
            Annotation annotation = (Annotation) it.next();
            Intrinsics.checkNotNull(annotation);
            zs.a.O(visitor, annotation);
        }
        return arrayList;
    }

    @Override // hq.d
    public List w(a3.r container, pp.v proto) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        String name = ((rp.f) container.f117b).getString(proto.f18460v);
        String desc = tp.b.b(((hq.u) container).f11072g.b());
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(desc, "desc");
        return u(this, container, new np.p(name + '#' + desc), null, false, 60);
    }

    public ie.k y(String str) {
        return (ie.k) ((HashMap) this.f393d).get(str);
    }
}
