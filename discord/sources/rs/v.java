package rs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.logging.Logger;
import kotlin.collections.d0;
import kotlin.collections.y;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okio.Buffer;
import okio.ByteString;
import okio.Sink;
import okio.Source;
import okio.Timeout;

/* JADX INFO: loaded from: classes.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f19609a = new d();

    public static final boolean a(int i7, int i10, int i11, byte[] a10, byte[] b10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        for (int i12 = 0; i12 < i11; i12++) {
            if (a10[i12 + i7] != b10[i12 + i10]) {
                return false;
            }
        }
        return true;
    }

    public static okio.a b() throws InterruptedException {
        okio.a aVar = okio.a.j;
        Intrinsics.checkNotNull(aVar);
        okio.a aVar2 = aVar.f17425f;
        if (aVar2 == null) {
            long jNanoTime = System.nanoTime();
            okio.a.class.wait(okio.a.f17422h);
            okio.a aVar3 = okio.a.j;
            Intrinsics.checkNotNull(aVar3);
            if (aVar3.f17425f != null || System.nanoTime() - jNanoTime < okio.a.f17423i) {
                return null;
            }
            return okio.a.j;
        }
        long jNanoTime2 = aVar2.f17426g - System.nanoTime();
        if (jNanoTime2 > 0) {
            long j = jNanoTime2 / 1000000;
            okio.a.class.wait(j, (int) (jNanoTime2 - (1000000 * j)));
            return null;
        }
        okio.a aVar4 = okio.a.j;
        Intrinsics.checkNotNull(aVar4);
        aVar4.f17425f = aVar2.f17425f;
        aVar2.f17425f = null;
        return aVar2;
    }

    public static final o c(Sink sink) {
        Intrinsics.checkNotNullParameter(sink, "<this>");
        return new o(sink);
    }

    public static final p d(Source source) {
        Intrinsics.checkNotNullParameter(source, "<this>");
        return new p(source);
    }

    public static void e(long j, Buffer buffer, int i7, ArrayList arrayList, int i10, int i11, ArrayList arrayList2) {
        int i12;
        int i13;
        ArrayList arrayList3;
        long j5;
        int i14;
        int i15 = i7;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        if (i10 >= i11) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        for (int i16 = i10; i16 < i11; i16++) {
            if (((ByteString) arrayList4.get(i16)).c() < i15) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        ByteString byteString = (ByteString) arrayList.get(i10);
        ByteString byteString2 = (ByteString) arrayList4.get(i11 - 1);
        if (i15 == byteString.c()) {
            int iIntValue = ((Number) arrayList5.get(i10)).intValue();
            int i17 = i10 + 1;
            ByteString byteString3 = (ByteString) arrayList4.get(i17);
            i12 = i17;
            i13 = iIntValue;
            byteString = byteString3;
        } else {
            i12 = i10;
            i13 = -1;
        }
        if (byteString.f(i15) == byteString2.f(i15)) {
            int iMin = Math.min(byteString.c(), byteString2.c());
            int i18 = 0;
            for (int i19 = i15; i19 < iMin && byteString.f(i19) == byteString2.f(i19); i19++) {
                i18++;
            }
            long j7 = 4;
            long j10 = (buffer.f17413e / j7) + j + ((long) 2) + ((long) i18) + 1;
            buffer.c0(-i18);
            buffer.c0(i13);
            int i20 = i15 + i18;
            while (i15 < i20) {
                buffer.c0(byteString.f(i15) & 255);
                i15++;
            }
            if (i12 + 1 == i11) {
                if (i20 != ((ByteString) arrayList4.get(i12)).c()) {
                    throw new IllegalStateException("Check failed.");
                }
                buffer.c0(((Number) arrayList5.get(i12)).intValue());
                return;
            } else {
                Buffer buffer2 = new Buffer();
                buffer.c0(((int) ((buffer2.f17413e / j7) + j10)) * (-1));
                e(j10, buffer2, i20, arrayList4, i12, i11, arrayList5);
                buffer.J(buffer2);
                return;
            }
        }
        int i21 = 1;
        for (int i22 = i12 + 1; i22 < i11; i22++) {
            if (((ByteString) arrayList4.get(i22 - 1)).f(i15) != ((ByteString) arrayList4.get(i22)).f(i15)) {
                i21++;
            }
        }
        long j11 = 4;
        long j12 = (buffer.f17413e / j11) + j + ((long) 2) + ((long) (i21 * 2));
        buffer.c0(i21);
        buffer.c0(i13);
        for (int i23 = i12; i23 < i11; i23++) {
            int iF = ((ByteString) arrayList4.get(i23)).f(i15);
            if (i23 == i12 || iF != ((ByteString) arrayList4.get(i23 - 1)).f(i15)) {
                buffer.c0(iF & 255);
            }
        }
        Buffer buffer3 = new Buffer();
        int i24 = i12;
        while (i24 < i11) {
            byte bF = ((ByteString) arrayList4.get(i24)).f(i15);
            int i25 = i24 + 1;
            int i26 = i25;
            while (true) {
                if (i26 >= i11) {
                    i26 = i11;
                    break;
                } else if (bF != ((ByteString) arrayList4.get(i26)).f(i15)) {
                    break;
                } else {
                    i26++;
                }
            }
            if (i25 == i26 && i15 + 1 == ((ByteString) arrayList4.get(i24)).c()) {
                buffer.c0(((Number) arrayList5.get(i24)).intValue());
                arrayList3 = arrayList5;
                j5 = j12;
                i14 = i26;
            } else {
                buffer.c0(((int) ((buffer3.f17413e / j11) + j12)) * (-1));
                arrayList3 = arrayList5;
                j5 = j12;
                i14 = i26;
                e(j5, buffer3, i15 + 1, arrayList, i24, i14, arrayList3);
                arrayList4 = arrayList;
            }
            j12 = j5;
            i24 = i14;
            arrayList5 = arrayList3;
        }
        buffer.J(buffer3);
    }

    public static final void f(long j, long j5, long j7) {
        if ((j5 | j7) < 0 || j5 > j || j - j5 < j7) {
            StringBuilder sbM = kk.b.m(j, "size=", " offset=");
            sbM.append(j5);
            sbM.append(" byteCount=");
            sbM.append(j7);
            throw new ArrayIndexOutOfBoundsException(sbM.toString());
        }
    }

    public static final boolean g(AssertionError assertionError) {
        Logger logger = l.f19580a;
        Intrinsics.checkNotNullParameter(assertionError, "<this>");
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? StringsKt.D(message, "getsockname failed", false) : false) {
                return true;
            }
        }
        return false;
    }

    public static m h(ByteString... byteStrings) {
        int i7;
        Intrinsics.checkNotNullParameter(byteStrings, "byteStrings");
        int i10 = 0;
        if (byteStrings.length == 0) {
            return new m(new ByteString[0], new int[]{0, -1});
        }
        ArrayList arrayListI = y.I(byteStrings);
        Intrinsics.checkNotNullParameter(arrayListI, "<this>");
        if (arrayListI.size() > 1) {
            Collections.sort(arrayListI);
        }
        ArrayList arrayList = new ArrayList(byteStrings.length);
        for (ByteString byteString : byteStrings) {
            arrayList.add(-1);
        }
        Object[] array = arrayList.toArray(new Integer[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        Integer[] numArr = (Integer[]) array;
        ArrayList arrayListI2 = d0.i(Arrays.copyOf(numArr, numArr.length));
        int length = byteStrings.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            ByteString byteString2 = byteStrings[i11];
            int i13 = i12 + 1;
            int size = arrayListI.size();
            Intrinsics.checkNotNullParameter(arrayListI, "<this>");
            int size2 = arrayListI.size();
            if (size < 0) {
                throw new IllegalArgumentException(s0.g.d(size, "fromIndex (0) is greater than toIndex (", ")."));
            }
            if (size > size2) {
                throw new IndexOutOfBoundsException(s0.g.c(size, "toIndex (", size2, ") is greater than size (", ")."));
            }
            int i14 = size - 1;
            int i15 = 0;
            while (true) {
                if (i15 > i14) {
                    i7 = -(i15 + 1);
                    break;
                }
                i7 = (i15 + i14) >>> 1;
                int iA = tn.a.a((Comparable) arrayListI.get(i7), byteString2);
                if (iA >= 0) {
                    if (iA <= 0) {
                        break;
                    }
                    i14 = i7 - 1;
                } else {
                    i15 = i7 + 1;
                }
            }
            arrayListI2.set(i7, Integer.valueOf(i12));
            i11++;
            i12 = i13;
        }
        if (((ByteString) arrayListI.get(0)).c() <= 0) {
            throw new IllegalArgumentException("the empty byte string is not a supported option");
        }
        int i16 = 0;
        while (i16 < arrayListI.size()) {
            ByteString prefix = (ByteString) arrayListI.get(i16);
            int i17 = i16 + 1;
            int i18 = i17;
            while (i18 < arrayListI.size()) {
                ByteString byteString3 = (ByteString) arrayListI.get(i18);
                byteString3.getClass();
                Intrinsics.checkNotNullParameter(prefix, "prefix");
                if (!byteString3.h(prefix, prefix.c())) {
                    break;
                }
                if (byteString3.c() == prefix.c()) {
                    throw new IllegalArgumentException(("duplicate option: " + byteString3).toString());
                }
                if (((Number) arrayListI2.get(i18)).intValue() > ((Number) arrayListI2.get(i16)).intValue()) {
                    arrayListI.remove(i18);
                    arrayListI2.remove(i18);
                } else {
                    i18++;
                }
            }
            i16 = i17;
        }
        Buffer buffer = new Buffer();
        e(0L, buffer, 0, arrayListI, 0, arrayListI.size(), arrayListI2);
        int[] iArr = new int[(int) (buffer.f17413e / ((long) 4))];
        while (!buffer.l()) {
            iArr[i10] = buffer.readInt();
            i10++;
        }
        Object[] objArrCopyOf = Arrays.copyOf(byteStrings, byteStrings.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, size)");
        return new m((ByteString[]) objArrCopyOf, iArr);
    }

    public static final a i(OutputStream outputStream) {
        Logger logger = l.f19580a;
        Intrinsics.checkNotNullParameter(outputStream, "<this>");
        return new a(outputStream, new Timeout());
    }

    public static final a j(Socket socket) throws IOException {
        Logger logger = l.f19580a;
        Intrinsics.checkNotNullParameter(socket, "<this>");
        gs.h hVar = new gs.h(socket);
        OutputStream outputStream = socket.getOutputStream();
        Intrinsics.checkNotNullExpressionValue(outputStream, "getOutputStream()");
        a sink = new a(outputStream, hVar);
        Intrinsics.checkNotNullParameter(sink, "sink");
        return new a(hVar, sink);
    }

    public static a k(File file) {
        Logger logger = l.f19580a;
        Intrinsics.checkNotNullParameter(file, "<this>");
        return i(new FileOutputStream(file, false));
    }

    public static final b l(File file) {
        Logger logger = l.f19580a;
        Intrinsics.checkNotNullParameter(file, "<this>");
        return new b(new FileInputStream(file), Timeout.f17418d);
    }

    public static final b m(InputStream inputStream) {
        Logger logger = l.f19580a;
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        return new b(inputStream, new Timeout());
    }

    public static final b n(Socket socket) throws IOException {
        Logger logger = l.f19580a;
        Intrinsics.checkNotNullParameter(socket, "<this>");
        gs.h hVar = new gs.h(socket);
        InputStream inputStream = socket.getInputStream();
        Intrinsics.checkNotNullExpressionValue(inputStream, "getInputStream()");
        b source = new b(inputStream, hVar);
        Intrinsics.checkNotNullParameter(source, "source");
        return new b(hVar, source);
    }
}
