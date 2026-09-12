package cl;

import android.view.View;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewAtIndex;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.swmansion.reanimated.layoutReanimation.SharedTransitionManager;
import ei.q0;
import ei.v;
import ei.x;
import fe.k;
import fe.n;
import ge.l;
import i0.u;
import io.sentry.ISpan;
import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Comparator {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3730d;

    public /* synthetic */ b(int i7) {
        this.f3730d = i7;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        boolean z5;
        switch (this.f3730d) {
            case 0:
                ReadableMap readableMap = (ReadableMap) obj;
                ReadableMap readableMap2 = (ReadableMap) obj2;
                return Double.compare(readableMap.hasKey("time") ? readableMap.getDouble("time") : 0.0d, readableMap2.hasKey("time") ? readableMap2.getDouble("time") : 0.0d);
            case 1:
                return ViewAtIndex.COMPARATOR$lambda$0((ViewAtIndex) obj, (ViewAtIndex) obj2);
            case 2:
                return SharedTransitionManager.lambda$sortViewsByTags$0((View) obj, (View) obj2);
            case 3:
                return Integer.compare(((ee.e) obj).f8162a.f8165b, ((ee.e) obj2).f8162a.f8165b);
            case 4:
                return Long.compare(((ee.d) obj).f8159b, ((ee.d) obj2).f8159b);
            case 5:
                return ((Format) obj2).E - ((Format) obj).E;
            case 6:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                q0 q0Var = DefaultTrackSelector.k;
                if (num.intValue() == -1) {
                    return num2.intValue() == -1 ? 0 : -1;
                }
                if (num2.intValue() == -1) {
                    return 1;
                }
                return num.intValue() - num2.intValue();
            case 7:
                q0 q0Var2 = DefaultTrackSelector.k;
                return 0;
            case 8:
                List list = (List) obj;
                List list2 = (List) obj2;
                int i7 = 11;
                int i10 = 12;
                return v.f(n.c((n) Collections.max(list, new b(i7)), (n) Collections.max(list2, new b(i7)))).a(list.size(), list2.size()).b((n) Collections.max(list, new b(i10)), (n) Collections.max(list2, new b(i10)), new b(i10)).e();
            case 9:
                return ((fe.e) Collections.max((List) obj)).compareTo((fe.e) Collections.max((List) obj2));
            case 10:
                return ((k) ((List) obj).get(0)).compareTo((k) ((List) obj2).get(0));
            case 11:
                return n.c((n) obj, (n) obj2);
            case 12:
                n nVar = (n) obj;
                n nVar2 = (n) obj2;
                boolean z6 = nVar.f9109w;
                int i11 = nVar.F;
                q0 q0VarB = (z6 && nVar.E) ? DefaultTrackSelector.k : DefaultTrackSelector.k.b();
                return x.f8383a.b(Integer.valueOf(i11), Integer.valueOf(nVar2.F), nVar.f9110x.T ? DefaultTrackSelector.k.b() : DefaultTrackSelector.f5727l).b(Integer.valueOf(nVar.G), Integer.valueOf(nVar2.G), q0VarB).b(Integer.valueOf(i11), Integer.valueOf(nVar2.F), q0VarB).e();
            case 13:
                l lVar = (l) obj;
                l lVar2 = (l) obj2;
                int iCompare = Integer.compare(lVar2.f9992b, lVar.f9992b);
                if (iCompare != 0) {
                    return iCompare;
                }
                int iCompareTo = lVar.f9993c.compareTo(lVar2.f9993c);
                return iCompareTo != 0 ? iCompareTo : lVar.f9994d.compareTo(lVar2.f9994d);
            case 14:
                l lVar3 = (l) obj;
                l lVar4 = (l) obj2;
                int iCompare2 = Integer.compare(lVar4.f9991a, lVar3.f9991a);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                int iCompareTo2 = lVar4.f9993c.compareTo(lVar3.f9993c);
                return iCompareTo2 != 0 ? iCompareTo2 : lVar4.f9994d.compareTo(lVar3.f9994d);
            case 15:
                return ((he.q0) obj).f10667a - ((he.q0) obj2).f10667a;
            case 16:
                return Float.compare(((he.q0) obj).f10669c, ((he.q0) obj2).f10669c);
            case 17:
                u uVar = (u) obj;
                u uVar2 = (u) obj2;
                float f2 = uVar.f11326m.f11348i.K;
                float f7 = uVar2.f11326m.f11348i.K;
                return f2 == f7 ? Intrinsics.compare(uVar.e(), uVar2.e()) : Float.compare(f2, f7);
            case 18:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i12 = 0; i12 < bArr.length; i12++) {
                    byte b10 = bArr[i12];
                    byte b11 = bArr2[i12];
                    if (b10 != b11) {
                        return b10 - b11;
                    }
                }
                return 0;
            case 19:
                im.f fVar = (im.f) obj;
                im.f fVar2 = (im.f) obj2;
                boolean z7 = fVar.L;
                if ((z7 && fVar2.L) || ((z5 = fVar.M) && fVar2.M)) {
                    return Integer.signum(fVar2.K - fVar.K);
                }
                if (z7) {
                    return -1;
                }
                if (!fVar2.L) {
                    if (z5) {
                        return -1;
                    }
                    if (!fVar2.M) {
                        return 0;
                    }
                }
                return 1;
            case 20:
                ISpan iSpan = (ISpan) obj;
                ISpan iSpan2 = (ISpan) obj2;
                if (iSpan == iSpan2) {
                    return 0;
                }
                int iCompareTo3 = iSpan.s().compareTo(iSpan2.s());
                return iCompareTo3 != 0 ? iCompareTo3 : iSpan.o().f12783e.toString().compareTo(iSpan2.o().f12783e.toString());
            case 21:
                return Long.compare(((File) obj).lastModified(), ((File) obj2).lastModified());
            case 22:
                qd.b bVar = (qd.b) obj;
                qd.b bVar2 = (qd.b) obj2;
                int iCompare3 = Integer.compare(bVar.f18713c, bVar2.f18713c);
                return iCompare3 != 0 ? iCompare3 : bVar.f18712b.compareTo(bVar2.f18712b);
            default:
                return Integer.compare(((wd.d) obj2).f22154b, ((wd.d) obj).f22154b);
        }
    }
}
