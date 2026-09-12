package ib;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.a4;
import androidx.appcompat.widget.y3;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.UIManagerHelper;
import hq.m;
import im.f;
import im.z;
import ip.j;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;
import km.e;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.e0;
import kotlin.collections.n0;
import kotlin.collections.s0;
import kotlin.collections.x;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import lq.d0;
import lq.e1;
import pq.i;
import rn.n;
import rn.r;
import s0.g;
import to.c;
import vo.o0;
import vo.p;
import vo.r0;
import vo.y;
import xp.l;
import yo.h;
import yo.q0;
import yo.t;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static b f11470a;

    public static MappedByteBuffer A(Context context, Uri uri) {
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return null;
                }
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return map;
                } catch (Throwable th2) {
                    try {
                        fileInputStream.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            } catch (Throwable th4) {
                try {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    throw th4;
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                    throw th4;
                }
            }
        } catch (IOException unused) {
        }
    }

    public static e B(f handler, int i7, km.a eventHandlerType) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(eventHandlerType, "eventHandlerType");
        e eVar = (e) e.f14598w.acquire();
        if (eVar == null) {
            eVar = new e();
            eVar.f14601i = 4;
        }
        View viewR = handler.r();
        eVar.init(UIManagerHelper.getSurfaceId(viewR), viewR.getId());
        eVar.f14599d = n(handler);
        eVar.f14600e = handler.f11910x;
        eVar.f14601i = i7;
        eVar.f14602v = eventHandlerType;
        return eVar;
    }

    public static LinkedHashSet E(up.e eVar, Collection collection, Collection collection2, vo.f fVar, m mVar, l lVar, boolean z5) {
        if (eVar == null) {
            a(12);
            throw null;
        }
        if (collection == null) {
            a(13);
            throw null;
        }
        if (collection2 == null) {
            a(14);
            throw null;
        }
        if (fVar == null) {
            a(15);
            throw null;
        }
        if (mVar == null) {
            a(16);
            throw null;
        }
        if (lVar == null) {
            a(17);
            throw null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        lVar.h(eVar, collection, collection2, fVar, new fp.a(mVar, linkedHashSet, z5));
        return linkedHashSet;
    }

    public static LinkedHashSet F(up.e eVar, AbstractCollection abstractCollection, Collection collection, vo.f fVar, m mVar, l lVar) {
        if (eVar == null) {
            a(0);
            throw null;
        }
        if (collection == null) {
            a(2);
            throw null;
        }
        if (fVar == null) {
            a(3);
            throw null;
        }
        if (mVar == null) {
            a(4);
            throw null;
        }
        if (lVar != null) {
            return E(eVar, abstractCollection, collection, fVar, mVar, lVar, false);
        }
        a(5);
        throw null;
    }

    public static LinkedHashSet G(up.e eVar, Collection collection, AbstractCollection abstractCollection, j jVar, m mVar, l lVar) {
        if (eVar == null) {
            a(6);
            throw null;
        }
        if (collection == null) {
            a(7);
            throw null;
        }
        if (jVar == null) {
            a(9);
            throw null;
        }
        if (mVar == null) {
            a(10);
            throw null;
        }
        if (lVar != null) {
            return E(eVar, collection, abstractCollection, jVar, mVar, lVar, true);
        }
        a(11);
        throw null;
    }

    public static void I(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            y3.a(view, charSequence);
            return;
        }
        a4 a4Var = a4.H;
        if (a4Var != null && a4Var.f894d == view) {
            a4.b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new a4(view, charSequence);
            return;
        }
        a4 a4Var2 = a4.I;
        if (a4Var2 != null && a4Var2.f894d == view) {
            a4Var2.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    public static void J(q8.e eVar, long j) {
        if (!(j >= 0)) {
            throw new IllegalArgumentException();
        }
        while (j > 0) {
            long jSkip = eVar.skip(j);
            if (jSkip <= 0) {
                if (eVar.read() == -1) {
                    return;
                } else {
                    jSkip = 1;
                }
            }
            j -= jSkip;
        }
    }

    public static final boolean K(byte[] byteArray, byte[] pattern) {
        Intrinsics.checkNotNullParameter(byteArray, "byteArray");
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        return v(0, byteArray, pattern);
    }

    public static final void L(Object obj) {
        if (obj instanceof r) {
            throw ((r) obj).f19489d;
        }
    }

    public static /* synthetic */ void a(int i7) {
        String str = i7 != 18 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i7 != 18 ? 3 : 2];
        switch (i7) {
            case 1:
            case 7:
            case 13:
                objArr[0] = "membersFromSupertypes";
                break;
            case 2:
            case 8:
            case 14:
                objArr[0] = "membersFromCurrent";
                break;
            case 3:
            case 9:
            case 15:
                objArr[0] = "classDescriptor";
                break;
            case 4:
            case 10:
            case 16:
                objArr[0] = "errorReporter";
                break;
            case 5:
            case 11:
            case 17:
                objArr[0] = "overridingUtil";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = StackTraceHelper.NAME_KEY;
                break;
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
                break;
            case 20:
                objArr[0] = "annotationClass";
                break;
        }
        if (i7 != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
        } else {
            objArr[1] = "resolveOverrides";
        }
        switch (i7) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "resolveOverridesForStaticMembers";
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "resolveOverrides";
                break;
            case 18:
                break;
            case 19:
            case 20:
                objArr[2] = "getAnnotationParameterByName";
                break;
            default:
                objArr[2] = "resolveOverridesForNonStaticMembers";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i7 == 18) {
            throw new IllegalStateException(str2);
        }
    }

    public static final long b(int i7, int i10) {
        return (((long) i10) & 4294967295L) | (((long) i7) << 32);
    }

    public static String c(String str, Object... objArr) {
        int length;
        int iIndexOf;
        StringBuilder sb2 = new StringBuilder(str.length() + (objArr.length * 16));
        int i7 = 0;
        int i10 = 0;
        while (true) {
            length = objArr.length;
            if (i7 >= length || (iIndexOf = str.indexOf("%s", i10)) == -1) {
                break;
            }
            sb2.append((CharSequence) str, i10, iIndexOf);
            sb2.append(e(objArr[i7]));
            i10 = iIndexOf + 2;
            i7++;
        }
        sb2.append((CharSequence) str, i10, str.length());
        if (i7 < length) {
            String str2 = " [";
            while (i7 < objArr.length) {
                sb2.append(str2);
                sb2.append(e(objArr[i7]));
                i7++;
                str2 = ", ";
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    public static final byte[] d(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            Charset charsetForName = Charset.forName("ASCII");
            Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(...)");
            byte[] bytes = value.getBytes(charsetForName);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            return bytes;
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("ASCII not found!", e10);
        }
    }

    public static String e(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e10) {
            String strK = kk.b.k(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strK), (Throwable) e10);
            return g.f("<", strK, " threw ", e10.getClass().getName(), ">");
        }
    }

    public static void i(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static final i j(e1 e1Var) {
        Intrinsics.checkNotNullParameter(e1Var, "<this>");
        int iOrdinal = e1Var.ordinal();
        if (iOrdinal == 0) {
            return i.INV;
        }
        if (iOrdinal == 1) {
            return i.IN;
        }
        if (iOrdinal == 2) {
            return i.OUT;
        }
        throw new n();
    }

    public static boolean k(File file, Resources resources, int i7) throws Throwable {
        InputStream inputStreamOpenRawResource;
        try {
            inputStreamOpenRawResource = resources.openRawResource(i7);
            try {
                boolean zL = l(inputStreamOpenRawResource, file);
                i(inputStreamOpenRawResource);
                return zL;
            } catch (Throwable th2) {
                th = th2;
                i(inputStreamOpenRawResource);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            inputStreamOpenRawResource = null;
        }
    }

    public static boolean l(InputStream inputStream, File file) throws Throwable {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
                try {
                    byte[] bArr = new byte[IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET];
                    while (true) {
                        int i7 = inputStream.read(bArr);
                        if (i7 == -1) {
                            i(fileOutputStream2);
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                            return true;
                        }
                        fileOutputStream2.write(bArr, 0, i7);
                    }
                } catch (IOException e10) {
                    e = e10;
                    fileOutputStream = fileOutputStream2;
                    Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
                    i(fileOutputStream);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = fileOutputStream2;
                    i(fileOutputStream);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    throw th;
                }
            } catch (IOException e11) {
                e = e11;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static to.f m(c functionClass, boolean z5) {
        String lowerCase;
        Intrinsics.checkNotNullParameter(functionClass, "functionClass");
        List list = functionClass.H;
        to.f fVar = new to.f(functionClass, null, vo.c.f21792d, z5);
        t tVarU0 = functionClass.u0();
        n0 n0Var = n0.f14659d;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((r0) obj).getVariance() != e1.IN_VARIANCE) {
                break;
            }
            arrayList.add(obj);
        }
        x xVarM0 = CollectionsKt.m0(arrayList);
        ArrayList arrayList2 = new ArrayList(e0.l(xVarM0, 10));
        Iterator it = xVarM0.iterator();
        while (true) {
            kotlin.collections.r0 r0Var = (kotlin.collections.r0) it;
            if (!r0Var.f14666e.hasNext()) {
                fVar.G0(null, tVarU0, n0Var, n0Var, arrayList2, ((r0) CollectionsKt.Q(list)).j(), y.f21855w, p.f21828e);
                to.f fVar2 = fVar;
                fVar2.U = true;
                return fVar2;
            }
            IndexedValue indexedValue = (IndexedValue) r0Var.next();
            int i7 = indexedValue.f14622a;
            r0 r0Var2 = (r0) indexedValue.f14623b;
            String strB = r0Var2.getName().b();
            Intrinsics.checkNotNullExpressionValue(strB, "asString(...)");
            if (Intrinsics.areEqual(strB, "T")) {
                lowerCase = "instance";
            } else if (Intrinsics.areEqual(strB, "E")) {
                lowerCase = "receiver";
            } else {
                lowerCase = strB.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            }
            to.f fVar3 = fVar;
            up.e eVarE = up.e.e(lowerCase);
            Intrinsics.checkNotNullExpressionValue(eVarE, "identifier(...)");
            d0 d0VarJ = r0Var2.j();
            Intrinsics.checkNotNullExpressionValue(d0VarJ, "getDefaultType(...)");
            o0 NO_SOURCE = vo.n0.C;
            Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
            arrayList2.add(new q0(fVar3, null, i7, wo.g.f22379a, eVarE, d0VarJ, false, false, false, null, NO_SOURCE));
            fVar = fVar3;
        }
    }

    public static WritableMap n(f handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("handlerTag", handler.f11892d);
        writableMapCreateMap.putInt("state", handler.f11896h);
        writableMapCreateMap.putInt("numberOfTouches", handler.f11903q);
        writableMapCreateMap.putInt("eventType", handler.f11902p);
        writableMapCreateMap.putInt("pointerType", handler.I);
        WritableArray writableArray = handler.f11900n;
        handler.f11900n = null;
        if (writableArray != null) {
            writableMapCreateMap.putArray("changedTouches", writableArray);
        }
        WritableArray writableArray2 = handler.f11901o;
        handler.f11901o = null;
        if (writableArray2 != null) {
            writableMapCreateMap.putArray("allTouches", writableArray2);
        }
        if (handler.M && handler.f11896h == 4) {
            writableMapCreateMap.putInt("state", 2);
        }
        return writableMapCreateMap;
    }

    public static final r o(Throwable exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        return new r(exception);
    }

    public static final String p(lq.q0 q0Var) {
        StringBuilder sb2 = new StringBuilder();
        q("type: " + q0Var, sb2);
        q("hashCode: " + q0Var.hashCode(), sb2);
        q("javaClass: " + q0Var.getClass().getCanonicalName(), sb2);
        for (vo.l lVarG = q0Var.g(); lVarG != null; lVarG = lVarG.g()) {
            q("fqName: " + wp.f.f22422a.v(lVarG), sb2);
            q("javaClass: " + lVarG.getClass().getCanonicalName(), sb2);
        }
        return sb2.toString();
    }

    public static final void q(String str, StringBuilder sb2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        sb2.append(str);
        sb2.append('\n');
    }

    public static z r(MotionEvent event) {
        double dAtan;
        Intrinsics.checkNotNullParameter(event, "event");
        double dAtan2 = 1.5707963267948966d;
        double axisValue = 1.5707963267948966d - ((double) event.getAxisValue(25));
        double pressure = event.getPressure(0);
        double orientation = (((double) event.getOrientation(0)) + 1.5707963267948966d) % 6.283185307179586d;
        if (orientation != 0.0d && Math.signum(orientation) != Math.signum(6.283185307179586d)) {
            orientation += 6.283185307179586d;
        }
        double d6 = orientation;
        if (axisValue < 1.0E-9d) {
            double d7 = (d6 < 1.0E-9d || Math.abs(d6 - 6.283185307179586d) < 1.0E-9d) ? 1.5707963267948966d : 0.0d;
            double d8 = d6 - 1.5707963267948966d;
            double d9 = Math.abs(d8) < 1.0E-9d ? 1.5707963267948966d : 0.0d;
            double d10 = d6 - 3.141592653589793d;
            dAtan = -1.5707963267948966d;
            if (Math.abs(d10) < 1.0E-9d) {
                d7 = -1.5707963267948966d;
            }
            double d11 = d6 - 4.71238898038469d;
            if (Math.abs(d11) < 1.0E-9d) {
                d9 = -1.5707963267948966d;
            }
            if (d6 > 1.0E-9d && Math.abs(d8) < 1.0E-9d) {
                d9 = 1.5707963267948966d;
                d7 = 1.5707963267948966d;
            }
            if (Math.abs(d8) > 1.0E-9d && Math.abs(d10) < 1.0E-9d) {
                d9 = 1.5707963267948966d;
                d7 = -1.5707963267948966d;
            }
            if (Math.abs(d10) > 1.0E-9d && Math.abs(d11) < 1.0E-9d) {
                d9 = -1.5707963267948966d;
                d7 = -1.5707963267948966d;
            }
            if (Math.abs(d11) <= 1.0E-9d || Math.abs(d6 - 6.283185307179586d) >= 1.0E-9d) {
                dAtan = d9;
                dAtan2 = d7;
            }
        } else {
            double dTan = Math.tan(axisValue);
            dAtan2 = Math.atan(Math.cos(d6) / dTan);
            dAtan = Math.atan(Math.sin(d6) / dTan);
        }
        return new z(Double.valueOf(Math.rint(dAtan2 * 57.29577951308232d)).doubleValue(), Double.valueOf(Math.rint(dAtan * 57.29577951308232d)).doubleValue(), axisValue, d6, pressure);
    }

    public static q0 s(up.e eVar, vo.f fVar) {
        if (eVar == null) {
            a(19);
            throw null;
        }
        if (fVar == null) {
            a(20);
            throw null;
        }
        Collection collectionP = fVar.p();
        if (collectionP.size() != 1) {
            return null;
        }
        for (q0 q0Var : ((h) collectionP.iterator().next()).L()) {
            if (q0Var.getName().equals(eVar)) {
                return q0Var;
            }
        }
        return null;
    }

    public static Object t(Future future) {
        Object obj;
        if (!future.isDone()) {
            throw new IllegalStateException(mf.f.A("Future was expected to be done: %s", future));
        }
        boolean z5 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z5 = true;
            } catch (Throwable th2) {
                if (z5) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z5) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static File u(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i7 = 0; i7 < 100; i7++) {
            File file = new File(cacheDir, str + i7);
            try {
                if (file.createNewFile()) {
                    return file;
                }
            } catch (IOException unused) {
            }
        }
        return null;
    }

    public static final boolean v(int i7, byte[] byteArray, byte[] pattern) {
        Intrinsics.checkNotNullParameter(byteArray, "byteArray");
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        if (pattern.length + i7 <= byteArray.length) {
            Intrinsics.checkNotNullParameter(pattern, "<this>");
            Intrinsics.checkNotNullParameter(pattern, "<this>");
            Iterable intRange = new IntRange(0, pattern.length - 1, 1);
            if (!(intRange instanceof Collection) || !((Collection) intRange).isEmpty()) {
                Iterator it = intRange.iterator();
                while (((lo.b) it).f15156i) {
                    int iNextInt = ((s0) it).nextInt();
                    if (byteArray[i7 + iNextInt] != pattern[iNextInt]) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static x8.g w(Exception exc) {
        x8.g gVar = new x8.g();
        exc.getClass();
        gVar.h(exc, null);
        return gVar;
    }

    public static void x(b bVar) {
        if (y()) {
            return;
        }
        synchronized (a.class) {
            try {
                if (f11470a != null) {
                    throw new IllegalStateException("Cannot re-initialize NativeLoader.");
                }
                f11470a = bVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static boolean y() {
        boolean z5;
        synchronized (a.class) {
            z5 = f11470a != null;
        }
        return z5;
    }

    public static boolean z(String str) {
        b bVar;
        synchronized (a.class) {
            bVar = f11470a;
            if (bVar == null) {
                throw new IllegalStateException("NativeLoader has not been initialized.  To use standard native library loading, call NativeLoader.init(new SystemDelegate()).");
            }
        }
        return bVar.i(str);
    }

    public abstract void C(o0.f fVar, o0.f fVar2);

    public abstract void D(o0.f fVar, Thread thread);

    public abstract void H(boolean z5);

    public abstract boolean f(o0.g gVar, o0.c cVar, o0.c cVar2);

    public abstract boolean g(o0.g gVar, Object obj, Object obj2);

    public abstract boolean h(o0.g gVar, o0.f fVar, o0.f fVar2);
}
