package e4;

import af.w;
import android.content.Context;
import android.graphics.Path;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import com.discord.misc.utilities.chat_view_types.ChatViewRecyclerTypes;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.UIManagerHelper;
import com.swmansion.reanimated.BuildConfig;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.time.Duration;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.Encoder;
import lq.b1;
import lq.d0;
import lq.d1;
import lq.e1;
import lq.g0;
import lq.i0;
import lq.l0;
import lq.q0;
import lq.s;
import lq.t0;
import lq.y0;
import lq.z;
import po.u1;
import vo.r0;
import vo.v;
import vo.y;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static WeakReference f7973a;

    public static float A(MotionEvent event, boolean z5) {
        Intrinsics.checkNotNullParameter(event, "event");
        int actionIndex = event.getActionMasked() == 6 ? event.getActionIndex() : -1;
        if (!z5) {
            int pointerCount = event.getPointerCount();
            int i7 = pointerCount - 1;
            if (i7 == actionIndex) {
                i7 = pointerCount - 2;
            }
            return event.getX(i7);
        }
        int pointerCount2 = event.getPointerCount();
        float x5 = 0.0f;
        int i10 = 0;
        for (int i11 = 0; i11 < pointerCount2; i11++) {
            if (i11 != actionIndex) {
                i10++;
                x5 = event.getX(i11) + x5;
            }
        }
        return x5 / i10;
    }

    public static float B(MotionEvent event, boolean z5) {
        Intrinsics.checkNotNullParameter(event, "event");
        int actionIndex = event.getActionMasked() == 6 ? event.getActionIndex() : -1;
        if (!z5) {
            int pointerCount = event.getPointerCount();
            int i7 = pointerCount - 1;
            if (i7 == actionIndex) {
                i7 = pointerCount - 2;
            }
            return event.getY(i7);
        }
        int pointerCount2 = event.getPointerCount();
        float y5 = 0.0f;
        int i10 = 0;
        for (int i11 = 0; i11 < pointerCount2; i11++) {
            if (i11 != actionIndex) {
                i10++;
                y5 = event.getY(i11) + y5;
            }
        }
        return y5 / i10;
    }

    public static c5.i C(c5.n nVar, List list) {
        c5.b cacheEntry = nVar.getCacheEntry();
        if (cacheEntry == null) {
            return new c5.i(null, true, list);
        }
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                treeSet.add(((c5.g) it.next()).f3489a);
            }
        }
        ArrayList arrayList = new ArrayList(list);
        List list2 = cacheEntry.f3476h;
        if (list2 != null) {
            if (!list2.isEmpty()) {
                for (c5.g gVar : cacheEntry.f3476h) {
                    if (!treeSet.contains(gVar.f3489a)) {
                        arrayList.add(gVar);
                    }
                }
            }
        } else if (!cacheEntry.f3475g.isEmpty()) {
            for (Map.Entry entry : cacheEntry.f3475g.entrySet()) {
                if (!treeSet.contains(entry.getKey())) {
                    arrayList.add(new c5.g((String) entry.getKey(), (String) entry.getValue()));
                }
            }
        }
        return new c5.i(cacheEntry.f3469a, true, arrayList);
    }

    public static r0 D(pq.h receiver, int i7) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (receiver instanceof q0) {
            Object obj = ((q0) receiver).getParameters().get(i7);
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            return (r0) obj;
        }
        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
    }

    public static uf.b E(Context context) {
        w.g(context);
        return new uf.b(context, new re.h());
    }

    public static d1 F(mq.b bVar, t0 receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (bVar.F(receiver)) {
            return null;
        }
        if (receiver instanceof t0) {
            return receiver.b().w0();
        }
        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
    }

    public static r0 G(pq.h receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (receiver instanceof q0) {
            vo.i iVarG = ((q0) receiver).g();
            if (iVarG instanceof r0) {
                return (r0) iVarG;
            }
            return null;
        }
        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
    }

    public static pq.i H(t0 receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (receiver instanceof t0) {
            e1 e1VarA = receiver.a();
            Intrinsics.checkNotNullExpressionValue(e1VarA, "getProjectionKind(...)");
            return ib.a.j(e1VarA);
        }
        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
    }

    public static pq.i I(r0 receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (receiver != null) {
            e1 variance = receiver.getVariance();
            Intrinsics.checkNotNullExpressionValue(variance, "getVariance(...)");
            return ib.a.j(variance);
        }
        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
    }

    public static boolean J(pq.d receiver, up.c fqName) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        if (receiver instanceof z) {
            return ((z) receiver).getAnnotations().P(fqName);
        }
        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
    }

    public static boolean K(r0 receiver, pq.h hVar) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (hVar == null ? true : hVar instanceof q0) {
            return c9.a.y(receiver, (q0) hVar, 4);
        }
        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
    }

    public static boolean L(pq.e a10, pq.e b10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        if (!(a10 instanceof d0)) {
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + a10 + ", " + Reflection.getOrCreateKotlinClass(a10.getClass())).toString());
        }
        if (b10 instanceof d0) {
            return ((d0) a10).l0() == ((d0) b10).l0();
        }
        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + b10 + ", " + Reflection.getOrCreateKotlinClass(b10.getClass())).toString());
    }

    public static final long M(long j) {
        if (j < 0) {
            Duration.f14747e.getClass();
            return Duration.f14749v;
        }
        Duration.f14747e.getClass();
        return Duration.f14748i;
    }

    public static byte[] N(InputStream inputStream, int i7, d5.a aVar) throws Throwable {
        byte[] bArrA;
        d5.e eVar = new d5.e(aVar, i7);
        try {
            bArrA = aVar.a(IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
            while (true) {
                try {
                    int i10 = inputStream.read(bArrA);
                    if (i10 == -1) {
                        break;
                    }
                    eVar.write(bArrA, 0, i10);
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                        c5.w.d("Error occurred when closing InputStream", new Object[0]);
                    }
                    aVar.b(bArrA);
                    eVar.close();
                    throw th;
                }
            }
            byte[] byteArray = eVar.toByteArray();
            try {
                inputStream.close();
            } catch (IOException unused2) {
                c5.w.d("Error occurred when closing InputStream", new Object[0]);
            }
            aVar.b(bArrA);
            eVar.close();
            return byteArray;
        } catch (Throwable th3) {
            th = th3;
            bArrA = null;
        }
    }

    public static boolean O(pq.h receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (receiver instanceof q0) {
            return so.i.I((q0) receiver, so.o.f20363a);
        }
        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
    }

    public static boolean P(pq.h receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (receiver instanceof q0) {
            return ((q0) receiver).g() instanceof vo.f;
        }
        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
    }

    public static boolean Q(pq.h receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (!(receiver instanceof q0)) {
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }
        vo.i iVarG = ((q0) receiver).g();
        vo.f fVar = iVarG instanceof vo.f ? (vo.f) iVarG : null;
        if (fVar != null) {
            Intrinsics.checkNotNullParameter(fVar, "<this>");
            if (fVar.e() == y.f21852e && fVar.c() != vo.g.f21810i && fVar.c() != vo.g.f21811v && fVar.c() != vo.g.f21812w) {
                return true;
            }
        }
        return false;
    }

    public static boolean R(pq.h receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (receiver instanceof q0) {
            return ((q0) receiver).i();
        }
        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
    }

    public static boolean S(pq.d receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (receiver instanceof z) {
            return lq.c.j((z) receiver);
        }
        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
    }

    public static boolean T(pq.h receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (receiver instanceof q0) {
            vo.i iVarG = ((q0) receiver).g();
            vo.f fVar = iVarG instanceof vo.f ? (vo.f) iVarG : null;
            return (fVar != null ? fVar.j0() : null) instanceof v;
        }
        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
    }

    public static boolean U(pq.h receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (receiver instanceof q0) {
            return receiver instanceof zp.o;
        }
        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
    }

    public static boolean V(pq.h receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (receiver instanceof q0) {
            return receiver instanceof lq.y;
        }
        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
    }

    public static boolean W(pq.d receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        return (receiver instanceof d0) && ((d0) receiver).t0();
    }

    public static boolean X(pq.h receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (receiver instanceof q0) {
            return so.i.I((q0) receiver, so.o.f20364b);
        }
        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
    }

    public static boolean Y(pq.d receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (receiver instanceof z) {
            return b1.e((z) receiver);
        }
        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean Z(pq.f receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (receiver instanceof z) {
            return so.i.G((z) receiver);
        }
        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
    }

    public static Object a(Parcel parcel) {
        Parcelable.Creator creator = Bundle.CREATOR;
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static boolean a0(pq.c receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (receiver instanceof mq.h) {
            return ((mq.h) receiver).f16025y;
        }
        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
    }

    public static void b(Parcel parcel, Bundle bundle) {
        if (bundle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
        }
    }

    public static boolean b0(t0 receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (receiver instanceof t0) {
            return receiver.c();
        }
        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
    }

    public static long c(int i7, int i10, int i11) {
        long j;
        if ((i11 & 2) != 0) {
            i7 = Integer.MAX_VALUE;
        }
        if ((i11 & 8) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        if (i7 < 0) {
            throw new IllegalArgumentException(("maxWidth(" + i7 + ") must be >= than minWidth(0)").toString());
        }
        if (i10 < 0) {
            throw new IllegalArgumentException(("maxHeight(" + i10 + ") must be >= than minHeight(0)").toString());
        }
        int i12 = i10 == Integer.MAX_VALUE ? 0 : i10;
        int iE = com.facebook.imagepipeline.nativecode.c.e(i12);
        int i13 = i7 == Integer.MAX_VALUE ? 0 : i7;
        int iE2 = com.facebook.imagepipeline.nativecode.c.e(i13);
        if (iE + iE2 > 31) {
            throw new IllegalArgumentException(s0.g.c(i13, "Can't represent a width of ", i12, " and height of ", " in Constraints"));
        }
        if (iE2 == 13) {
            j = 3;
        } else if (iE2 == 18) {
            j = 1;
        } else if (iE2 == 15) {
            j = 2;
        } else {
            if (iE2 != 16) {
                throw new IllegalStateException("Should only have the provided constants.");
            }
            j = 0;
        }
        int i14 = i7 == Integer.MAX_VALUE ? 0 : i7 + 1;
        int i15 = i10 == Integer.MAX_VALUE ? 0 : i10 + 1;
        int i16 = m0.a.f15341b[(int) j];
        return (((long) i15) << (i16 + 31)) | j | (((long) 0) << 2) | (((long) i14) << 33) | (((long) 0) << i16);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void c0(pq.e receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (receiver instanceof d0) {
            Intrinsics.checkNotNullParameter((z) receiver, "<this>");
            return;
        }
        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
    }

    public static void d(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void d0(pq.e receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (receiver instanceof d0) {
            Intrinsics.checkNotNullParameter((z) receiver, "<this>");
            return;
        }
        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
    }

    public static final up.c e(String str, up.c cVar) {
        up.e eVarE = up.e.e(str);
        Intrinsics.checkNotNullExpressionValue(eVarE, "identifier(...)");
        return cVar.a(eVarE);
    }

    public static boolean e0(Double d6, boolean z5) {
        if (d6 == null) {
            return z5;
        }
        return !d6.isNaN() && d6.doubleValue() >= 0.0d && d6.doubleValue() <= 1.0d;
    }

    public static boolean f(pq.h c8, pq.h c10) {
        Intrinsics.checkNotNullParameter(c8, "c1");
        Intrinsics.checkNotNullParameter(c10, "c2");
        if (!(c8 instanceof q0)) {
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + c8 + ", " + Reflection.getOrCreateKotlinClass(c8.getClass())).toString());
        }
        if (c10 instanceof q0) {
            return Intrinsics.areEqual(c8, c10);
        }
        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + c10 + ", " + Reflection.getOrCreateKotlinClass(c10.getClass())).toString());
    }

    public static u1 f0(vo.d dVar, Function0 function0) {
        if (function0 != null) {
            return new u1(dVar, function0);
        }
        throw new IllegalArgumentException("Argument for @NotNull parameter 'initializer' of kotlin/reflect/jvm/internal/ReflectProperties.lazySoft must not be null");
    }

    public static int g(pq.d receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (receiver instanceof z) {
            return ((z) receiver).l0().size();
        }
        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
    }

    public static float g0(float f2, float f7, float f10) {
        return (f10 * f7) + ((1.0f - f10) * f2);
    }

    public static pq.g h(pq.e receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (receiver instanceof d0) {
            return (pq.g) receiver;
        }
        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
    }

    public static d0 h0(s receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (receiver instanceof s) {
            return receiver.f15248e;
        }
        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
    }

    public static pq.c i(mq.b bVar, pq.f receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (receiver instanceof d0) {
            if (receiver instanceof g0) {
                return bVar.c0(((g0) receiver).f15207e);
            }
            if (receiver instanceof mq.h) {
                return (mq.h) receiver;
            }
            return null;
        }
        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
    }

    public static d1 i0(pq.c receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (receiver instanceof mq.h) {
            return ((mq.h) receiver).f16022v;
        }
        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
    }

    public static lq.o j(pq.e receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (receiver instanceof d0) {
            if (receiver instanceof lq.o) {
                return (lq.o) receiver;
            }
            return null;
        }
        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
    }

    public static d1 j0(pq.d receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (receiver instanceof d1) {
            return lq.c.m((d1) receiver, false);
        }
        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
    }

    public static void k(s receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void k0(b1.e[] eVarArr, Path path) {
        int i7;
        float f2;
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        b1.e[] eVarArr2 = eVarArr;
        float[] fArr = new float[6];
        int length = eVarArr2.length;
        int i10 = 0;
        int i11 = 0;
        char c8 = 'm';
        while (i11 < length) {
            b1.e eVar = eVarArr2[i11];
            char c10 = eVar.f3026a;
            float[] fArr2 = eVar.f3027b;
            float f18 = fArr[i10];
            float f19 = fArr[1];
            float f20 = fArr[2];
            float f21 = fArr[3];
            float f22 = fArr[4];
            int i12 = i10;
            float f23 = fArr[5];
            switch (c10) {
                case 'A':
                case 'a':
                    i7 = 7;
                    break;
                case 'C':
                case 'c':
                    i7 = 6;
                    break;
                case 'H':
                case BuildConfig.REACT_NATIVE_MINOR_VERSION /* 86 */:
                case 'h':
                case 'v':
                    i7 = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i7 = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f22, f23);
                    f18 = f22;
                    f20 = f18;
                    f19 = f23;
                    f21 = f19;
                default:
                    i7 = 2;
                    break;
            }
            float f24 = f22;
            float f25 = f23;
            float f26 = f18;
            float f27 = f19;
            int i13 = i12;
            while (i13 < fArr2.length) {
                if (c10 == 'A') {
                    fArr2 = fArr2;
                    i13 = i13;
                    eVar = eVar;
                    float f28 = f27;
                    i11 = i11;
                    int i14 = i13 + 5;
                    int i15 = i13 + 6;
                    b1.e.a(path, f26, f28, fArr2[i14], fArr2[i15], fArr2[i13], fArr2[i13 + 1], fArr2[i13 + 2], fArr2[i13 + 3] != 0.0f ? 1 : i12, fArr2[i13 + 4] != 0.0f ? 1 : i12);
                    f20 = fArr2[i14];
                    f2 = fArr2[i15];
                    f21 = f2;
                    f7 = f20;
                } else if (c10 == 'C') {
                    fArr2 = fArr2;
                    i13 = i13;
                    i11 = i11;
                    eVar = eVar;
                    int i16 = i13 + 2;
                    int i17 = i13 + 3;
                    int i18 = i13 + 4;
                    int i19 = i13 + 5;
                    path.cubicTo(fArr2[i13], fArr2[i13 + 1], fArr2[i16], fArr2[i17], fArr2[i18], fArr2[i19]);
                    float f29 = fArr2[i18];
                    float f30 = fArr2[i19];
                    f20 = fArr2[i16];
                    f21 = fArr2[i17];
                    f2 = f30;
                    f7 = f29;
                } else if (c10 == 'H') {
                    fArr2 = fArr2;
                    i13 = i13;
                    eVar = eVar;
                    f2 = f27;
                    i11 = i11;
                    path.lineTo(fArr2[i13], f2);
                    f7 = fArr2[i13];
                } else if (c10 == 'Q') {
                    fArr2 = fArr2;
                    i13 = i13;
                    i11 = i11;
                    eVar = eVar;
                    int i20 = i13 + 1;
                    int i21 = i13 + 2;
                    int i22 = i13 + 3;
                    path.quadTo(fArr2[i13], fArr2[i20], fArr2[i21], fArr2[i22]);
                    float f31 = fArr2[i13];
                    float f32 = fArr2[i20];
                    float f33 = fArr2[i21];
                    float f34 = fArr2[i22];
                    f20 = f31;
                    f21 = f32;
                    f7 = f33;
                    f2 = f34;
                } else if (c10 == 'V') {
                    fArr2 = fArr2;
                    i13 = i13;
                    i11 = i11;
                    eVar = eVar;
                    f7 = f26;
                    path.lineTo(f7, fArr2[i13]);
                    f2 = fArr2[i13];
                } else if (c10 != 'a') {
                    if (c10 == 'c') {
                        fArr2 = fArr2;
                        i13 = i13;
                        int i23 = i13 + 2;
                        int i24 = i13 + 3;
                        int i25 = i13 + 4;
                        int i26 = i13 + 5;
                        path.rCubicTo(fArr2[i13], fArr2[i13 + 1], fArr2[i23], fArr2[i24], fArr2[i25], fArr2[i26]);
                        float f35 = fArr2[i23] + f26;
                        float f36 = fArr2[i24] + f27;
                        f26 += fArr2[i25];
                        f27 += fArr2[i26];
                        f20 = f35;
                        f21 = f36;
                    } else if (c10 != 'h') {
                        if (c10 != 'q') {
                            if (c10 != 'v') {
                                if (c10 == 'L') {
                                    fArr2 = fArr2;
                                    i13 = i13;
                                    int i27 = i13 + 1;
                                    path.lineTo(fArr2[i13], fArr2[i27]);
                                    f7 = fArr2[i13];
                                    f2 = fArr2[i27];
                                } else if (c10 == 'M') {
                                    fArr2 = fArr2;
                                    i13 = i13;
                                    f7 = fArr2[i13];
                                    f2 = fArr2[i13 + 1];
                                    if (i13 > 0) {
                                        path.lineTo(f7, f2);
                                    } else {
                                        path.moveTo(f7, f2);
                                        f24 = f7;
                                        f25 = f2;
                                    }
                                } else if (c10 == 'S') {
                                    fArr2 = fArr2;
                                    i13 = i13;
                                    if (c8 == 'c' || c8 == 's' || c8 == 'C' || c8 == 'S') {
                                        f26 = (f26 * 2.0f) - f20;
                                        f27 = (f27 * 2.0f) - f21;
                                    }
                                    float f37 = f26;
                                    float f38 = f27;
                                    int i28 = i13 + 1;
                                    int i29 = i13 + 2;
                                    int i30 = i13 + 3;
                                    path.cubicTo(f37, f38, fArr2[i13], fArr2[i28], fArr2[i29], fArr2[i30]);
                                    f20 = fArr2[i13];
                                    f21 = fArr2[i28];
                                    f7 = fArr2[i29];
                                    f2 = fArr2[i30];
                                } else if (c10 == 'T') {
                                    fArr2 = fArr2;
                                    i13 = i13;
                                    if (c8 == 'q' || c8 == 't' || c8 == 'Q' || c8 == 'T') {
                                        f26 = (f26 * 2.0f) - f20;
                                        f27 = (f27 * 2.0f) - f21;
                                    }
                                    int i31 = i13 + 1;
                                    path.quadTo(f26, f27, fArr2[i13], fArr2[i31]);
                                    f7 = fArr2[i13];
                                    f2 = fArr2[i31];
                                    eVar = eVar;
                                    f20 = f26;
                                    f21 = f27;
                                } else if (c10 == 'l') {
                                    fArr2 = fArr2;
                                    i13 = i13;
                                    int i32 = i13 + 1;
                                    path.rLineTo(fArr2[i13], fArr2[i32]);
                                    f26 += fArr2[i13];
                                    f13 = fArr2[i32];
                                } else if (c10 == 'm') {
                                    fArr2 = fArr2;
                                    i13 = i13;
                                    float f39 = fArr2[i13];
                                    f26 += f39;
                                    float f40 = fArr2[i13 + 1];
                                    f27 += f40;
                                    if (i13 > 0) {
                                        path.rLineTo(f39, f40);
                                    } else {
                                        path.rMoveTo(f39, f40);
                                        eVar = eVar;
                                        f7 = f26;
                                        f24 = f7;
                                        f2 = f27;
                                        f25 = f2;
                                    }
                                } else if (c10 != 's') {
                                    if (c10 != 't') {
                                        f7 = f26;
                                    } else {
                                        if (c8 == 'q' || c8 == 't' || c8 == 'Q' || c8 == 'T') {
                                            f16 = f26 - f20;
                                            f17 = f27 - f21;
                                        } else {
                                            f17 = 0.0f;
                                            f16 = 0.0f;
                                        }
                                        int i33 = i13 + 1;
                                        path.rQuadTo(f16, f17, fArr2[i13], fArr2[i33]);
                                        float f41 = f16 + f26;
                                        float f42 = f17 + f27;
                                        float f43 = f26 + fArr2[i13];
                                        f27 += fArr2[i33];
                                        f21 = f42;
                                        f7 = f43;
                                        f20 = f41;
                                    }
                                    f2 = f27;
                                } else {
                                    if (c8 == 'c' || c8 == 's' || c8 == 'C' || c8 == 'S') {
                                        f14 = f27 - f21;
                                        f15 = f26 - f20;
                                    } else {
                                        f15 = 0.0f;
                                        f14 = 0.0f;
                                    }
                                    int i34 = i13;
                                    int i35 = i34 + 1;
                                    int i36 = i34 + 2;
                                    int i37 = i34 + 3;
                                    fArr2 = fArr2;
                                    i13 = i34;
                                    path.rCubicTo(f15, f14, fArr2[i34], fArr2[i35], fArr2[i36], fArr2[i37]);
                                    f10 = fArr2[i13] + f26;
                                    f11 = fArr2[i35] + f27;
                                    f26 += fArr2[i36];
                                    f12 = fArr2[i37];
                                }
                                eVar = eVar;
                            } else {
                                fArr2 = fArr2;
                                i13 = i13;
                                path.rLineTo(0.0f, fArr2[i13]);
                                f13 = fArr2[i13];
                            }
                            f27 += f13;
                        } else {
                            fArr2 = fArr2;
                            i13 = i13;
                            int i38 = i13 + 1;
                            int i39 = i13 + 2;
                            int i40 = i13 + 3;
                            path.rQuadTo(fArr2[i13], fArr2[i38], fArr2[i39], fArr2[i40]);
                            f10 = fArr2[i13] + f26;
                            f11 = fArr2[i38] + f27;
                            f26 += fArr2[i39];
                            f12 = fArr2[i40];
                        }
                        f27 += f12;
                        f20 = f10;
                        f21 = f11;
                    } else {
                        fArr2 = fArr2;
                        i13 = i13;
                        path.rLineTo(fArr2[i13], 0.0f);
                        f26 += fArr2[i13];
                    }
                    eVar = eVar;
                    f7 = f26;
                    f2 = f27;
                } else {
                    fArr2 = fArr2;
                    i13 = i13;
                    int i41 = i13 + 5;
                    float f44 = fArr2[i41] + f26;
                    int i42 = i13 + 6;
                    float f45 = fArr2[i42] + f27;
                    eVar = eVar;
                    float f46 = f26;
                    float f47 = f27;
                    i11 = i11;
                    b1.e.a(path, f46, f47, f44, f45, fArr2[i13], fArr2[i13 + 1], fArr2[i13 + 2], fArr2[i13 + 3] != 0.0f ? 1 : i12, fArr2[i13 + 4] != 0.0f ? 1 : i12);
                    f7 = f46 + fArr2[i41];
                    f2 = f47 + fArr2[i42];
                    f20 = f7;
                    f21 = f2;
                }
                i13 += i7;
                path = path;
                eVar = eVar;
                c10 = c10;
                i11 = i11;
                f26 = f7;
                f27 = f2;
                c8 = c10;
                fArr2 = fArr2;
            }
            fArr[i12] = f26;
            fArr[1] = f27;
            fArr[2] = f20;
            fArr[3] = f21;
            fArr[4] = f24;
            fArr[5] = f25;
            c8 = eVar.f3026a;
            i11++;
            eVarArr2 = eVarArr;
            i10 = i12;
        }
    }

    public static s l(pq.d receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (receiver instanceof z) {
            d1 d1VarW0 = ((z) receiver).w0();
            if (d1VarW0 instanceof s) {
                return (s) d1VarW0;
            }
            return null;
        }
        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
    }

    public static km.b l0(im.f handler, int i7, lm.b dataBuilder, km.a eventHandlerType) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(dataBuilder, "dataBuilder");
        Intrinsics.checkNotNullParameter(eventHandlerType, "eventHandlerType");
        km.b bVar = (km.b) km.b.f14586w.acquire();
        if (bVar == null) {
            bVar = new km.b();
            bVar.f14589i = 2;
        }
        View viewR = handler.r();
        bVar.init(UIManagerHelper.getSurfaceId(viewR), viewR.getId());
        bVar.f14589i = i7;
        bVar.f14587d = dataBuilder;
        bVar.f14590v = eventHandlerType;
        bVar.f14588e = handler.f11910x;
        return bVar;
    }

    public static d0 m(pq.d receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (receiver instanceof z) {
            d1 d1VarW0 = ((z) receiver).w0();
            if (d1VarW0 instanceof d0) {
                return (d0) d1VarW0;
            }
            return null;
        }
        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
    }

    public static i0 n(pq.d receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (receiver instanceof z) {
            return c9.a.e((z) receiver);
        }
        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
    }

    public static e9.b o(e9.b bVar) {
        if (((Double) bVar.f8111i) != null) {
            return bVar;
        }
        return new e9.b((Boolean) bVar.f8109d, (Double) bVar.f8110e, p(null, (Double) bVar.f8110e, (Boolean) bVar.f8109d), (Boolean) bVar.f8112v, (Double) bVar.f8113w);
    }

    public static d0 o0(lq.o receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        return receiver.f15230e;
    }

    public static Double p(Double d6, Double d7, Boolean bool) {
        if (d6 != null) {
            return d6;
        }
        double dC = io.sentry.util.j.a().c();
        if (d7 == null || bool == null) {
            return Double.valueOf(dC);
        }
        if (bool.booleanValue()) {
            return Double.valueOf(d7.doubleValue() * dC);
        }
        return Double.valueOf(((1.0d - d7.doubleValue()) * dC) + d7.doubleValue());
    }

    public static int p0(pq.h receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (receiver instanceof q0) {
            return ((q0) receiver).getParameters().size();
        }
        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
    }

    public static d0 q(pq.e type) {
        List listL0;
        ArrayList arrayList;
        mq.e eVar;
        pq.b captureStatus = pq.b.f18511d;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(captureStatus, "status");
        if (!(type instanceof d0)) {
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + type + ", " + Reflection.getOrCreateKotlinClass(type.getClass())).toString());
        }
        d0 type2 = (d0) type;
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(captureStatus, "status");
        jq.e eVar2 = null;
        if (type2.l0().size() == type2.r0().getParameters().size() && ((listL0 = type2.l0()) == null || !listL0.isEmpty())) {
            Iterator it = listL0.iterator();
            while (it.hasNext()) {
                if (((t0) it.next()).a() != e1.INVARIANT) {
                    List parameters = type2.r0().getParameters();
                    Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
                    ArrayList<Pair> arrayListN0 = CollectionsKt.n0(listL0, parameters);
                    arrayList = new ArrayList(e0.l(arrayListN0, 10));
                    for (Pair pair : arrayListN0) {
                        t0 projection = (t0) pair.f14612d;
                        r0 typeParameter = (r0) pair.f14613e;
                        if (projection.a() != e1.INVARIANT) {
                            d1 d1VarW0 = (projection.c() || projection.a() != e1.IN_VARIANCE) ? null : projection.b().w0();
                            Intrinsics.checkNotNull(typeParameter);
                            Intrinsics.checkNotNullParameter(captureStatus, "captureStatus");
                            Intrinsics.checkNotNullParameter(projection, "projection");
                            Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
                            projection = c9.a.e(new mq.h(captureStatus, new mq.i(projection, eVar2, typeParameter, 6), d1VarW0, (l0) null, false, 56));
                        }
                        arrayList.add(projection);
                    }
                    y0 y0VarC = lq.r0.f15247b.f(type2.r0(), arrayList).c();
                    int size = listL0.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        t0 t0Var = (t0) listL0.get(i7);
                        t0 t0Var2 = (t0) arrayList.get(i7);
                        if (t0Var.a() != e1.INVARIANT) {
                            List upperBounds = ((r0) type2.r0().getParameters().get(i7)).getUpperBounds();
                            Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
                            ArrayList supertypes = new ArrayList();
                            Iterator it2 = upperBounds.iterator();
                            while (true) {
                                boolean zHasNext = it2.hasNext();
                                eVar = mq.e.f16017a;
                                if (!zHasNext) {
                                    break;
                                }
                                supertypes.add(eVar.a(y0VarC.h((z) it2.next(), e1.INVARIANT).w0()));
                            }
                            if (!t0Var.c() && t0Var.a() == e1.OUT_VARIANCE) {
                                supertypes.add(eVar.a(t0Var.b().w0()));
                            }
                            z zVarB = t0Var2.b();
                            Intrinsics.checkNotNull(zVarB, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedType");
                            mq.i iVar = ((mq.h) zVarB).f16021i;
                            iVar.getClass();
                            Intrinsics.checkNotNullParameter(supertypes, "supertypes");
                            iVar.f16027b = new jq.e(2, supertypes);
                        }
                    }
                }
            }
            arrayList = null;
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            return lq.c.t(arrayList, type2.q0(), type2.r0(), type2.t0());
        }
        return null;
    }

    public static Collection q0(mq.b bVar, pq.e receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        q0 q0VarD = bVar.D(receiver);
        if (q0VarD instanceof zp.o) {
            return ((zp.o) q0VarD).f24072a;
        }
        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
    }

    public static pq.b r(pq.c receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (receiver instanceof mq.h) {
            return ((mq.h) receiver).f16020e;
        }
        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
    }

    public static t0 r0(yp.b receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (receiver instanceof mq.i) {
            return ((mq.i) receiver).f16026a;
        }
        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
    }

    public static float[] s(float[] fArr, int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int iMin = Math.min(i7, length);
        float[] fArr2 = new float[i7];
        System.arraycopy(fArr, 0, fArr2, 0, iMin);
        return fArr2;
    }

    public static final long s0(long j, long j5, yq.d dVar) {
        long j7 = j - j5;
        if (((j7 ^ j) & (~(j7 ^ j5))) >= 0) {
            return yq.c.h(j7, dVar);
        }
        yq.d dVar2 = yq.d.MILLISECONDS;
        if (dVar.compareTo(dVar2) >= 0) {
            return Duration.m(M(j7));
        }
        long jB = yq.e.b(1L, dVar2, dVar);
        long j10 = (j / jB) - (j5 / jB);
        long j11 = (j % jB) - (j5 % jB);
        yq.a aVar = Duration.f14747e;
        return Duration.i(yq.c.h(j10, dVar2), yq.c.h(j11, dVar));
    }

    public static WritableMap t(lm.b dataBuilder) {
        Intrinsics.checkNotNullParameter(dataBuilder, "dataBuilder");
        WritableMap writableMapCreateMap = Arguments.createMap();
        dataBuilder.a(writableMapCreateMap);
        writableMapCreateMap.putInt("handlerTag", dataBuilder.f15105a);
        writableMapCreateMap.putInt("state", dataBuilder.f15106b);
        return writableMapCreateMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static mq.a t0(mq.b bVar, pq.e type) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (type instanceof d0) {
            z kotlinType = (z) type;
            Intrinsics.checkNotNullParameter(kotlinType, "kotlinType");
            return new mq.a(bVar, lq.r0.f15247b.f(kotlinType.r0(), kotlinType.l0()).c());
        }
        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + type + ", " + Reflection.getOrCreateKotlinClass(type.getClass())).toString());
    }

    public static d1 u(mq.b bVar, pq.e lowerBound, pq.e upperBound) {
        Intrinsics.checkNotNullParameter(lowerBound, "lowerBound");
        Intrinsics.checkNotNullParameter(upperBound, "upperBound");
        if (!(lowerBound instanceof d0)) {
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + bVar + ", " + Reflection.getOrCreateKotlinClass(bVar.getClass())).toString());
        }
        if (upperBound instanceof d0) {
            return lq.c.e((d0) lowerBound, (d0) upperBound);
        }
        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + bVar + ", " + Reflection.getOrCreateKotlinClass(bVar.getClass())).toString());
    }

    public static Collection u0(pq.h receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (receiver instanceof q0) {
            Collection collectionH = ((q0) receiver).h();
            Intrinsics.checkNotNullExpressionValue(collectionH, "getSupertypes(...)");
            return collectionH;
        }
        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002c  */
    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    /* JADX WARN: Code duplicated, block: B:41:0x0091  */
    /* JADX WARN: Code duplicated, block: B:46:0x009c A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b1 A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d7 A[SYNTHETIC] */
    public static b1.e[] v(String str) {
        int i7;
        String strTrim;
        float[] fArrS;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        int i11 = 0;
        int i12 = 1;
        while (i12 < str.length()) {
            while (i12 < str.length()) {
                char cCharAt = str.charAt(i12);
                if ((cCharAt - 'Z') * (cCharAt - 'A') > 0) {
                    if ((cCharAt - 'z') * (cCharAt - 'a') > 0) {
                        continue;
                    } else if (cCharAt != 'e' && cCharAt != 'E') {
                        strTrim = str.substring(i11, i12).trim();
                        if (strTrim.isEmpty()) {
                            if (strTrim.charAt(i10) != 'z' || strTrim.charAt(i10) == 'Z') {
                                fArrS = new float[i10];
                            } else {
                                try {
                                    float[] fArr = new float[strTrim.length()];
                                    int length = strTrim.length();
                                    int i13 = i10;
                                    int i14 = 1;
                                    while (i14 < length) {
                                        int i15 = i10;
                                        int i16 = i15;
                                        int i17 = i16;
                                        int i18 = i17;
                                        for (int i19 = i14; i19 < strTrim.length(); i19++) {
                                            char cCharAt2 = strTrim.charAt(i19);
                                            if (cCharAt2 == ' ') {
                                                i15 = 0;
                                                i17 = 1;
                                            } else if (cCharAt2 != 'E' && cCharAt2 != 'e') {
                                                switch (cCharAt2) {
                                                    case ChatViewRecyclerTypes.FORWARD_BREADCRUMB /* 44 */:
                                                        i15 = 0;
                                                        i17 = 1;
                                                        break;
                                                    case ChatViewRecyclerTypes.REACTION_BURST_REACTION /* 45 */:
                                                        if (i19 == i14 || i15 != 0) {
                                                            i15 = 0;
                                                        } else {
                                                            i15 = 0;
                                                            i17 = 1;
                                                            i18 = 1;
                                                        }
                                                        break;
                                                    case '.':
                                                        if (i16 == 0) {
                                                            i15 = 0;
                                                            i16 = 1;
                                                        } else {
                                                            i15 = 0;
                                                            i17 = 1;
                                                            i18 = 1;
                                                        }
                                                        break;
                                                    default:
                                                        i15 = 0;
                                                        break;
                                                }
                                            } else {
                                                i15 = 1;
                                            }
                                            if (i17 != 0) {
                                                if (i14 < i19) {
                                                    fArr[i13] = Float.parseFloat(strTrim.substring(i14, i19));
                                                    i13++;
                                                }
                                                if (i18 != 0) {
                                                    i14 = i19;
                                                } else {
                                                    i14 = i19 + 1;
                                                }
                                                i10 = 0;
                                            }
                                        }
                                        if (i14 < i19) {
                                            fArr[i13] = Float.parseFloat(strTrim.substring(i14, i19));
                                            i13++;
                                        }
                                        if (i18 != 0) {
                                            i14 = i19;
                                        } else {
                                            i14 = i19 + 1;
                                        }
                                        i10 = 0;
                                    }
                                    fArrS = s(fArr, i13);
                                    i10 = 0;
                                } catch (NumberFormatException e10) {
                                    throw new RuntimeException(s0.g.e("error in parsing \"", strTrim, "\""), e10);
                                }
                            }
                            arrayList.add(new b1.e(strTrim.charAt(i10), fArrS));
                        }
                        i11 = i12;
                        i12++;
                        i10 = 0;
                    }
                } else if (cCharAt != 'e') {
                    continue;
                }
                i12++;
            }
            strTrim = str.substring(i11, i12).trim();
            if (strTrim.isEmpty()) {
                if (strTrim.charAt(i10) != 'z') {
                    fArrS = new float[i10];
                } else {
                    fArrS = new float[i10];
                }
                arrayList.add(new b1.e(strTrim.charAt(i10), fArrS));
            }
            i11 = i12;
            i12++;
            i10 = 0;
        }
        if (i12 - i11 != 1 || i11 >= str.length()) {
            i7 = 0;
        } else {
            i7 = 0;
            arrayList.add(new b1.e(str.charAt(i11), new float[0]));
        }
        return (b1.e[]) arrayList.toArray(new b1.e[i7]);
    }

    public static q0 v0(pq.e receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (receiver instanceof d0) {
            return ((d0) receiver).r0();
        }
        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
    }

    public static b1.e[] w(b1.e[] eVarArr) {
        b1.e[] eVarArr2 = new b1.e[eVarArr.length];
        for (int i7 = 0; i7 < eVarArr.length; i7++) {
            eVarArr2[i7] = new b1.e(eVarArr[i7]);
        }
        return eVarArr2;
    }

    public static mq.i w0(pq.c receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (receiver instanceof mq.h) {
            return ((mq.h) receiver).f16021i;
        }
        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
    }

    public static void x(Encoder encoder, KSerializer serializer, Object obj) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (serializer.getDescriptor().e()) {
            encoder.y(serializer, obj);
        } else if (obj == null) {
            encoder.a();
        } else {
            encoder.o();
            encoder.y(serializer, obj);
        }
    }

    public static d0 x0(s receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (receiver instanceof s) {
            return receiver.f15249i;
        }
        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
    }

    public static t0 y(pq.d receiver, int i7) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (receiver instanceof z) {
            return (t0) ((z) receiver).l0().get(i7);
        }
        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
    }

    public static d0 y0(pq.e receiver, boolean z5) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (receiver instanceof d0) {
            return ((d0) receiver).x0(z5);
        }
        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
    }

    public static String z(String str, fk.k kVar) {
        try {
            try {
                return fk.m.a(str, kVar);
            } catch (fk.l | IndexOutOfBoundsException unused) {
                return (String) fk.m.f9282a.get(kVar);
            }
        } catch (fk.l unused2) {
            return fk.m.a(str.substring(0, str.indexOf("_")), kVar);
        }
    }

    public static pq.d z0(mq.b bVar, pq.d receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        if (receiver instanceof pq.e) {
            return bVar.V((pq.e) receiver);
        }
        if (!(receiver instanceof s)) {
            throw new IllegalStateException("sealed");
        }
        s sVar = (s) receiver;
        return bVar.q0(bVar.V(bVar.w(sVar)), bVar.V(bVar.y(sVar)));
    }

    public abstract void m0(int i7);

    public abstract void n0(Typeface typeface, boolean z5);
}
