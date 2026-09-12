package com.swmansion.reanimated.keyboard;

import android.graphics.Bitmap;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import com.swmansion.gesturehandler.react.RNGestureHandlerModule;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.f1;
import kotlin.collections.s0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import lo.j;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.SurfaceViewRenderer;
import q9.d;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7119d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7120e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f7121i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f7122v;

    public /* synthetic */ c(Object obj, int i7, int i10, int i11) {
        this.f7119d = i11;
        this.f7122v = obj;
        this.f7120e = i7;
        this.f7121i = i10;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        int iIntValue;
        CloseableReference closeableReference;
        switch (this.f7119d) {
            case 0:
                ((WindowsInsetsManager) this.f7122v).lambda$updateInsets$1(this.f7120e, this.f7121i);
                return;
            case 1:
                ((RNGestureHandlerModule) this.f7122v).setGestureStateSync(this.f7120e, this.f7121i);
                return;
            case 2:
                ((SurfaceTextureHelper) this.f7122v).lambda$setTextureSize$2(this.f7120e, this.f7121i);
                return;
            case 3:
                ((SurfaceViewRenderer) this.f7122v).lambda$onFrameResolutionChanged$0(this.f7120e, this.f7121i);
                return;
            default:
                d this$0 = (d) this.f7122v;
                int i7 = this.f7120e;
                int i10 = this.f7121i;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                while (true) {
                    int i11 = this$0.j;
                    if (i11 < 0) {
                        i11 = 0;
                    }
                    o9.d dVar = this$0.f18659i;
                    int i12 = this$0.f18655e;
                    dVar.getClass();
                    IntRange intRangeI = j.i(0, i12);
                    ArrayList arrayList = new ArrayList(e0.l(intRangeI, 10));
                    Iterator it = intRangeI.iterator();
                    while (((lo.b) it).f15156i) {
                        arrayList.add(Integer.valueOf(dVar.m(((s0) it).nextInt() + i11)));
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : arrayList) {
                        if (this$0.f18660l.contains(Integer.valueOf(((Number) obj).intValue()))) {
                            arrayList2.add(obj);
                        }
                    }
                    Set setL0 = CollectionsKt.l0(arrayList2);
                    Set setKeySet = this$0.f18656f.keySet();
                    Intrinsics.checkNotNullExpressionValue(setKeySet, "<get-keys>(...)");
                    ArrayDeque arrayDeque = new ArrayDeque(f1.c(setKeySet, setL0));
                    Iterator it2 = arrayList2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            if (arrayList2.isEmpty()) {
                                iIntValue = (int) (this$0.f18655e * 0.5f);
                            } else {
                                int size = arrayList2.size();
                                iIntValue = ((Number) arrayList2.get(j.d((int) (size * 0.5f), 0, size - 1))).intValue();
                            }
                            this$0.f18657g = iIntValue;
                            this$0.f18658h = false;
                            return;
                        }
                        int iIntValue2 = ((Number) it2.next()).intValue();
                        if (this$0.f18656f.get(Integer.valueOf(iIntValue2)) == null) {
                            int i13 = this$0.j;
                            if (i13 == -1 || setL0.contains(Integer.valueOf(i13))) {
                                Integer num = (Integer) arrayDeque.pollFirst();
                                int iIntValue3 = num != null ? num.intValue() : -1;
                                q9.c cVar = (q9.c) this$0.f18656f.get(Integer.valueOf(iIntValue3));
                                CloseableReference closeableReferenceF = (cVar == null || (closeableReference = cVar.f18649a) == null) ? null : closeableReference.f();
                                if (closeableReferenceF == null) {
                                    PlatformBitmapFactory platformBitmapFactory = this$0.f18651a;
                                    platformBitmapFactory.getClass();
                                    CloseableReference closeableReferenceA = platformBitmapFactory.a(i7, i10, Bitmap.Config.ARGB_8888);
                                    Intrinsics.checkNotNullExpressionValue(closeableReferenceA, "createBitmap(...)");
                                    cVar = new q9.c(closeableReferenceA);
                                    closeableReferenceF = closeableReferenceA.clone();
                                }
                                cVar.f18650b = true;
                                try {
                                    this$0.f(iIntValue2, closeableReferenceF);
                                    Unit unit = Unit.f14616a;
                                    closeableReferenceF.close();
                                    this$0.f18656f.remove(Integer.valueOf(iIntValue3));
                                    cVar.f18650b = false;
                                    this$0.f18656f.put(Integer.valueOf(iIntValue2), cVar);
                                } catch (Throwable th2) {
                                    try {
                                        throw th2;
                                    } catch (Throwable th3) {
                                        ls.d.k(closeableReferenceF, th2);
                                        throw th3;
                                    }
                                }
                            }
                        }
                    }
                }
                break;
        }
    }
}
