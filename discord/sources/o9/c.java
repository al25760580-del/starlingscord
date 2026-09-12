package o9;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import android.util.SparseArray;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import com.facebook.imagepipeline.common.ImageDecodeOptions;
import com.facebook.imagepipeline.image.EncodedImage;
import e4.r;
import gn.h;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;
import mc.q;
import na.j;
import na.k;
import sh.e0;
import sh.g1;
import sh.p0;
import sh.s;
import th.g;
import vb.i;
import vb.l;
import vb.p;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements vd.f, la.b, g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f17179d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f17180e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f17181i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Object f17182v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Object f17183w;

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.f17179d = obj;
        this.f17180e = obj2;
        this.f17181i = obj3;
        this.f17182v = obj4;
        this.f17183w = obj5;
    }

    @Override // th.g
    public Object a() {
        Object objA = ((th.f) this.f17179d).a();
        int i7 = 8;
        return new e0((s) objA, new th.f(new pf.b(i7, (po.d) this.f17180e)), new th.f(new pf.b(i7, (th.f) this.f17181i)), (p0) ((th.f) this.f17182v).a(), (g1) ((th.f) this.f17183w).a());
    }

    public na.g b(EncodedImage encodedImage, ImageDecodeOptions imageDecodeOptions) {
        CloseableReference closeableReferenceA = ((qa.d) this.f17182v).a(encodedImage, imageDecodeOptions.f4810a);
        try {
            closeableReferenceA.getClass();
            j jVar = j.f16536d;
            int rotationAngle = encodedImage.getRotationAngle();
            int exifOrientation = encodedImage.getExifOrientation();
            int i7 = na.g.F;
            na.g gVar = new na.g(closeableReferenceA, jVar, rotationAngle, exifOrientation);
            gVar.B(Boolean.FALSE, "is_rounded");
            closeableReferenceA.close();
            return gVar;
        } catch (Throwable th2) {
            CloseableReference.l(closeableReferenceA);
            throw th2;
        }
    }

    public void c(sb.a aVar) {
        q qVar = new q(29);
        p pVar = (p) this.f17183w;
        i iVar = (i) this.f17179d;
        String str = (String) this.f17180e;
        sb.e eVar = (sb.e) this.f17182v;
        sb.c cVar = (sb.c) this.f17181i;
        ac.d dVar = pVar.f21549c;
        n8.f fVarA = i.a();
        fVarA.h0(iVar.f21529a);
        fVarA.f16511i = sb.d.f19823d;
        fVarA.f16512v = iVar.f21530b;
        i iVarJ = fVarA.J();
        af.c cVar2 = new af.c();
        cVar2.f397w = new HashMap();
        cVar2.f394e = Long.valueOf(pVar.f21547a.b());
        cVar2.f396v = Long.valueOf(pVar.f21548b.b());
        cVar2.f395i = str;
        cVar2.f393d = new l(cVar, (byte[]) eVar.apply(aVar.f19819a));
        cVar2.f398x = null;
        ac.c cVar3 = (ac.c) dVar;
        cVar3.f311b.execute(new ac.a(cVar3, iVarJ, qVar, cVar2.m()));
    }

    @Override // vd.f
    public int f(long j) {
        long[] jArr = (long[]) this.f17180e;
        int iB = je.e0.b(jArr, j, false);
        if (iB < jArr.length) {
            return iB;
        }
        return -1;
    }

    @Override // la.b
    public na.c g(EncodedImage encodedImage, int i7, k kVar, ImageDecodeOptions imageDecodeOptions) throws Throwable {
        InputStream is2;
        imageDecodeOptions.getClass();
        z9.c imageFormat = encodedImage.getImageFormat();
        if ((imageFormat == null || imageFormat == z9.c.f23631c) && (is2 = encodedImage.getInputStream()) != null) {
            Object obj = z9.d.f23634d;
            Intrinsics.checkNotNullParameter(is2, "is");
            try {
                encodedImage.setImageFormat(h.A(is2));
            } catch (IOException e10) {
                n8.i.h(e10);
                throw null;
            }
        }
        return ((u4.b) this.f17183w).g(encodedImage, i7, kVar, imageDecodeOptions);
    }

    @Override // vd.f
    public long h(int i7) {
        return ((long[]) this.f17180e)[i7];
    }

    @Override // vd.f
    public List l(long j) {
        ce.e eVar = (ce.e) this.f17179d;
        Map map = (Map) this.f17181i;
        HashMap map2 = (HashMap) this.f17182v;
        HashMap map3 = (HashMap) this.f17183w;
        ArrayList<Pair> arrayList = new ArrayList();
        eVar.g(j, eVar.f3618h, arrayList);
        TreeMap treeMap = new TreeMap();
        eVar.i(j, false, eVar.f3618h, treeMap);
        eVar.h(j, map, map2, eVar.f3618h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair pair : arrayList) {
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                ce.f fVar = (ce.f) map2.get(pair.first);
                fVar.getClass();
                arrayList2.add(new vd.c(null, null, null, bitmapDecodeByteArray, fVar.f3624c, 0, fVar.f3626e, fVar.f3623b, 0, Integer.MIN_VALUE, -3.4028235E38f, fVar.f3627f, fVar.f3628g, false, -16777216, fVar.j, 0.0f));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            ce.f fVar2 = (ce.f) map2.get(entry.getKey());
            fVar2.getClass();
            vd.b bVar = (vd.b) entry.getValue();
            CharSequence charSequence = bVar.f21618a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (ce.a aVar : (ce.a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ce.a.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(aVar), spannableStringBuilder.getSpanEnd(aVar), (CharSequence) "");
            }
            for (int i7 = 0; i7 < spannableStringBuilder.length(); i7++) {
                if (spannableStringBuilder.charAt(i7) == ' ') {
                    int i10 = i7 + 1;
                    int i11 = i10;
                    while (i11 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i11) == ' ') {
                        i11++;
                    }
                    int i12 = i11 - i10;
                    if (i12 > 0) {
                        spannableStringBuilder.delete(i7, i12 + i7);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i13 = 0; i13 < spannableStringBuilder.length() - 1; i13++) {
                if (spannableStringBuilder.charAt(i13) == '\n') {
                    int i14 = i13 + 1;
                    if (spannableStringBuilder.charAt(i14) == ' ') {
                        spannableStringBuilder.delete(i14, i13 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i15 = 0; i15 < spannableStringBuilder.length() - 1; i15++) {
                if (spannableStringBuilder.charAt(i15) == ' ') {
                    int i16 = i15 + 1;
                    if (spannableStringBuilder.charAt(i16) == '\n') {
                        spannableStringBuilder.delete(i15, i16);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            float f2 = fVar2.f3624c;
            int i17 = fVar2.f3625d;
            bVar.f21622e = f2;
            bVar.f21623f = i17;
            bVar.f21624g = fVar2.f3626e;
            bVar.f21625h = fVar2.f3623b;
            bVar.f21627l = fVar2.f3627f;
            float f7 = fVar2.f3630i;
            int i18 = fVar2.f3629h;
            bVar.k = f7;
            bVar.j = i18;
            bVar.f21631p = fVar2.j;
            arrayList2.add(bVar.a());
        }
        return arrayList2;
    }

    @Override // vd.f
    public int o() {
        return ((long[]) this.f17180e).length;
    }

    public c(PlatformBitmapFactory platformBitmapFactory, r9.a bitmapFrameRenderer, Bitmap.Config bitmapConfig, ExecutorService executorService) {
        Intrinsics.checkNotNullParameter(platformBitmapFactory, "platformBitmapFactory");
        Intrinsics.checkNotNullParameter(bitmapFrameRenderer, "bitmapFrameRenderer");
        Intrinsics.checkNotNullParameter(bitmapConfig, "bitmapConfig");
        Intrinsics.checkNotNullParameter(executorService, "executorService");
        this.f17179d = platformBitmapFactory;
        this.f17180e = bitmapFrameRenderer;
        this.f17181i = bitmapConfig;
        this.f17182v = executorService;
        this.f17183w = new SparseArray();
    }

    public c(ce.e eVar, HashMap map, HashMap map2, HashMap map3) {
        this.f17179d = eVar;
        this.f17182v = map2;
        this.f17183w = map3;
        this.f17181i = Collections.unmodifiableMap(map);
        TreeSet treeSet = new TreeSet();
        int i7 = 0;
        eVar.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i7] = ((Long) it.next()).longValue();
            i7++;
        }
        this.f17180e = jArr;
    }

    public c(pf.b bVar, mi.a aVar, r rVar, qa.d dVar) {
        this.f17183w = new u4.b(22, this);
        this.f17179d = bVar;
        this.f17180e = aVar;
        this.f17181i = rVar;
        this.f17182v = dVar;
    }
}
