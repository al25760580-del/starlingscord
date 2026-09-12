package es;

import androidx.fragment.app.r;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.Flushable;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.x;
import ls.n;
import rs.l;
import rs.o;
import rs.p;
import rs.v;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Closeable, Flushable {
    public static final Regex P = new Regex("[a-z0-9_-]{1,120}");
    public static final String Q = "CLEAN";
    public static final String R = "DIRTY";
    public static final String S = "REMOVE";
    public static final String T = "READ";
    public final LinkedHashMap E;
    public int F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public long M;
    public final fs.b N;
    public final g O;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final File f8750d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f8751e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final File f8752i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final File f8753v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final File f8754w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f8755x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public o f8756y;

    public h(File directory, long j, fs.c taskRunner) {
        ks.a fileSystem = ks.a.f14809a;
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        Intrinsics.checkNotNullParameter(directory, "directory");
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        this.f8750d = directory;
        this.f8751e = j;
        this.E = new LinkedHashMap(0, 0.75f, true);
        this.N = taskRunner.e();
        this.O = new g(this, Intrinsics.stringPlus(ds.b.f7821g, " Cache"), 0);
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f8752i = new File(directory, "journal");
        this.f8753v = new File(directory, "journal.tmp");
        this.f8754w = new File(directory, "journal.bkp");
    }

    public static void Q(String str) {
        if (!P.d(str)) {
            throw new IllegalArgumentException(kk.b.g('\"', "keys must match regex [a-z0-9_-]{1,120}: \"", str).toString());
        }
    }

    public final synchronized void B() {
        rs.a aVarK;
        try {
            o oVar = this.f8756y;
            if (oVar != null) {
                oVar.close();
            }
            File file = this.f8753v;
            Intrinsics.checkNotNullParameter(file, "file");
            try {
                aVarK = v.k(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                aVarK = v.k(file);
            }
            o writer = v.c(aVarK);
            try {
                writer.A("libcore.io.DiskLruCache");
                writer.writeByte(10);
                writer.A("1");
                writer.writeByte(10);
                writer.f0(201105);
                writer.writeByte(10);
                writer.f0(2);
                writer.writeByte(10);
                writer.writeByte(10);
                Iterator it = this.E.values().iterator();
                while (true) {
                    int i7 = 0;
                    if (!it.hasNext()) {
                        break;
                    }
                    e eVar = (e) it.next();
                    if (eVar.f8741g != null) {
                        writer.A(R);
                        writer.writeByte(32);
                        writer.A(eVar.f8735a);
                        writer.writeByte(10);
                    } else {
                        writer.A(Q);
                        writer.writeByte(32);
                        writer.A(eVar.f8735a);
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        long[] jArr = eVar.f8736b;
                        int length = jArr.length;
                        while (i7 < length) {
                            long j = jArr[i7];
                            i7++;
                            writer.writeByte(32);
                            writer.f0(j);
                        }
                        writer.writeByte(10);
                    }
                    throw th;
                }
                Unit unit = Unit.f14616a;
                writer.close();
                ks.a aVar = ks.a.f14809a;
                if (aVar.c(this.f8752i)) {
                    aVar.d(this.f8752i, this.f8754w);
                }
                aVar.d(this.f8753v, this.f8752i);
                aVar.a(this.f8754w);
                this.f8756y = q();
                this.G = false;
                this.L = false;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    ls.d.k(writer, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            throw th4;
        }
    }

    public final void O(e entry) throws IOException {
        o oVar;
        String str = entry.f8735a;
        Intrinsics.checkNotNullParameter(entry, "entry");
        if (!this.H) {
            if (entry.f8742h > 0 && (oVar = this.f8756y) != null) {
                oVar.A(R);
                oVar.writeByte(32);
                oVar.A(str);
                oVar.writeByte(10);
                oVar.flush();
            }
            if (entry.f8742h > 0 || entry.f8741g != null) {
                entry.f8740f = true;
                return;
            }
        }
        a3.f fVar = entry.f8741g;
        if (fVar != null) {
            fVar.g();
        }
        int i7 = 0;
        while (i7 < 2) {
            int i10 = i7 + 1;
            File file = (File) entry.f8737c.get(i7);
            Intrinsics.checkNotNullParameter(file, "file");
            if (!file.delete() && file.exists()) {
                throw new IOException(Intrinsics.stringPlus("failed to delete ", file));
            }
            long j = this.f8755x;
            long[] jArr = entry.f8736b;
            this.f8755x = j - jArr[i7];
            jArr[i7] = 0;
            i7 = i10;
        }
        this.F++;
        o oVar2 = this.f8756y;
        if (oVar2 != null) {
            oVar2.A(S);
            oVar2.writeByte(32);
            oVar2.A(str);
            oVar2.writeByte(10);
        }
        this.E.remove(str);
        if (n()) {
            this.N.c(this.O, 0L);
        }
    }

    public final void P() throws IOException {
        while (this.f8755x > this.f8751e) {
            for (e toEvict : this.E.values()) {
                if (!toEvict.f8740f) {
                    Intrinsics.checkNotNullExpressionValue(toEvict, "toEvict");
                    O(toEvict);
                }
            }
            return;
        }
        this.K = false;
    }

    public final synchronized void c() {
        if (this.J) {
            throw new IllegalStateException("cache is closed");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.I && !this.J) {
                Collection collectionValues = this.E.values();
                Intrinsics.checkNotNullExpressionValue(collectionValues, "lruEntries.values");
                int i7 = 0;
                Object[] array = collectionValues.toArray(new e[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                }
                e[] eVarArr = (e[]) array;
                int length = eVarArr.length;
                while (i7 < length) {
                    e eVar = eVarArr[i7];
                    i7++;
                    a3.f fVar = eVar.f8741g;
                    if (fVar != null) {
                        fVar.g();
                    }
                }
                P();
                o oVar = this.f8756y;
                Intrinsics.checkNotNull(oVar);
                oVar.close();
                this.f8756y = null;
                this.J = true;
                return;
            }
            this.J = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void f(a3.f editor, boolean z5) {
        Intrinsics.checkNotNullParameter(editor, "editor");
        e eVar = (e) editor.f68b;
        if (!Intrinsics.areEqual(eVar.f8741g, editor)) {
            throw new IllegalStateException("Check failed.");
        }
        int i7 = 0;
        if (z5 && !eVar.f8739e) {
            int i10 = 0;
            while (i10 < 2) {
                int i11 = i10 + 1;
                boolean[] zArr = (boolean[]) editor.f69c;
                Intrinsics.checkNotNull(zArr);
                if (!zArr[i10]) {
                    editor.a();
                    throw new IllegalStateException(Intrinsics.stringPlus("Newly created entry didn't create value for index ", Integer.valueOf(i10)));
                }
                File file = (File) eVar.f8738d.get(i10);
                Intrinsics.checkNotNullParameter(file, "file");
                if (!file.exists()) {
                    editor.a();
                    return;
                }
                i10 = i11;
            }
        }
        int i12 = 0;
        while (i12 < 2) {
            int i13 = i12 + 1;
            File file2 = (File) eVar.f8738d.get(i12);
            if (!z5 || eVar.f8740f) {
                Intrinsics.checkNotNullParameter(file2, "file");
                if (!file2.delete() && file2.exists()) {
                    throw new IOException(Intrinsics.stringPlus("failed to delete ", file2));
                }
            } else {
                ks.a aVar = ks.a.f14809a;
                if (aVar.c(file2)) {
                    File file3 = (File) eVar.f8737c.get(i12);
                    aVar.d(file2, file3);
                    long j = eVar.f8736b[i12];
                    Intrinsics.checkNotNullParameter(file3, "file");
                    long length = file3.length();
                    eVar.f8736b[i12] = length;
                    this.f8755x = (this.f8755x - j) + length;
                }
            }
            i12 = i13;
        }
        eVar.f8741g = null;
        if (eVar.f8740f) {
            O(eVar);
            return;
        }
        this.F++;
        o writer = this.f8756y;
        Intrinsics.checkNotNull(writer);
        if (eVar.f8739e || z5) {
            eVar.f8739e = true;
            writer.A(Q);
            writer.writeByte(32);
            writer.A(eVar.f8735a);
            Intrinsics.checkNotNullParameter(writer, "writer");
            long[] jArr = eVar.f8736b;
            int length2 = jArr.length;
            while (i7 < length2) {
                long j5 = jArr[i7];
                i7++;
                writer.writeByte(32);
                writer.f0(j5);
            }
            writer.writeByte(10);
            if (z5) {
                long j7 = this.M;
                this.M = 1 + j7;
                eVar.f8743i = j7;
            }
        } else {
            this.E.remove(eVar.f8735a);
            writer.A(S);
            writer.writeByte(32);
            writer.A(eVar.f8735a);
            writer.writeByte(10);
        }
        writer.flush();
        if (this.f8755x > this.f8751e || n()) {
            this.N.c(this.O, 0L);
        }
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (this.I) {
            c();
            P();
            o oVar = this.f8756y;
            Intrinsics.checkNotNull(oVar);
            oVar.flush();
        }
    }

    public final synchronized a3.f g(long j, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        l();
        c();
        Q(key);
        e eVar = (e) this.E.get(key);
        if (j != -1 && (eVar == null || eVar.f8743i != j)) {
            return null;
        }
        if ((eVar == null ? null : eVar.f8741g) != null) {
            return null;
        }
        if (eVar != null && eVar.f8742h != 0) {
            return null;
        }
        if (!this.K && !this.L) {
            o oVar = this.f8756y;
            Intrinsics.checkNotNull(oVar);
            oVar.A(R);
            oVar.writeByte(32);
            oVar.A(key);
            oVar.writeByte(10);
            oVar.flush();
            if (this.G) {
                return null;
            }
            if (eVar == null) {
                eVar = new e(this, key);
                this.E.put(key, eVar);
            }
            a3.f fVar = new a3.f(this, eVar);
            eVar.f8741g = fVar;
            return fVar;
        }
        this.N.c(this.O, 0L);
        return null;
    }

    public final synchronized f i(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        l();
        c();
        Q(key);
        e eVar = (e) this.E.get(key);
        if (eVar == null) {
            return null;
        }
        f fVarA = eVar.a();
        if (fVarA == null) {
            return null;
        }
        this.F++;
        o oVar = this.f8756y;
        Intrinsics.checkNotNull(oVar);
        oVar.A(T);
        oVar.writeByte(32);
        oVar.A(key);
        oVar.writeByte(10);
        if (n()) {
            this.N.c(this.O, 0L);
        }
        return fVarA;
    }

    public final synchronized void l() {
        rs.a aVarK;
        boolean z5;
        try {
            byte[] bArr = ds.b.f7815a;
            if (this.I) {
                return;
            }
            ks.a aVar = ks.a.f14809a;
            if (aVar.c(this.f8754w)) {
                if (aVar.c(this.f8752i)) {
                    aVar.a(this.f8754w);
                } else {
                    aVar.d(this.f8754w, this.f8752i);
                }
            }
            File file = this.f8754w;
            Intrinsics.checkNotNullParameter(aVar, "<this>");
            Intrinsics.checkNotNullParameter(file, "file");
            aVar.getClass();
            Intrinsics.checkNotNullParameter(file, "file");
            try {
                aVarK = v.k(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                aVarK = v.k(file);
            }
            try {
                try {
                    aVar.a(file);
                    aVarK.close();
                    z5 = true;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        ls.d.k(aVarK, th2);
                        throw th3;
                    }
                }
            } catch (IOException unused2) {
                Unit unit = Unit.f14616a;
                aVarK.close();
                aVar.a(file);
                z5 = false;
            }
            this.H = z5;
            File file2 = this.f8752i;
            Intrinsics.checkNotNullParameter(file2, "file");
            if (file2.exists()) {
                try {
                    y();
                    u();
                    this.I = true;
                    return;
                } catch (IOException e10) {
                    n nVar = n.f15297a;
                    n nVar2 = n.f15297a;
                    String str = "DiskLruCache " + this.f8750d + " is corrupt: " + ((Object) e10.getMessage()) + ", removing";
                    nVar2.getClass();
                    n.i(5, str, e10);
                    try {
                        close();
                        ks.a.f14809a.b(this.f8750d);
                        this.J = false;
                        B();
                        this.I = true;
                    } catch (Throwable th4) {
                        this.J = false;
                        throw th4;
                    }
                }
            }
            B();
            this.I = true;
        } catch (Throwable th5) {
            throw th5;
        }
    }

    public final boolean n() {
        int i7 = this.F;
        return i7 >= 2000 && i7 >= this.E.size();
    }

    public final o q() {
        rs.a aVarI;
        File file = this.f8752i;
        Intrinsics.checkNotNullParameter(file, "file");
        try {
            Logger logger = l.f19580a;
            Intrinsics.checkNotNullParameter(file, "<this>");
            aVarI = v.i(new FileOutputStream(file, true));
        } catch (FileNotFoundException unused) {
            file.getParentFile().mkdirs();
            Logger logger2 = l.f19580a;
            Intrinsics.checkNotNullParameter(file, "<this>");
            aVarI = v.i(new FileOutputStream(file, true));
        }
        return v.c(new i(aVarI, new r(2, this)));
    }

    public final void u() throws IOException {
        File file = this.f8753v;
        ks.a aVar = ks.a.f14809a;
        aVar.a(file);
        Iterator it = this.E.values().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "i.next()");
            e eVar = (e) next;
            int i7 = 0;
            if (eVar.f8741g == null) {
                while (i7 < 2) {
                    this.f8755x += eVar.f8736b[i7];
                    i7++;
                }
            } else {
                eVar.f8741g = null;
                while (i7 < 2) {
                    aVar.a((File) eVar.f8737c.get(i7));
                    aVar.a((File) eVar.f8738d.get(i7));
                    i7++;
                }
                it.remove();
            }
        }
    }

    public final void y() {
        File file = this.f8752i;
        Intrinsics.checkNotNullParameter(file, "file");
        p pVarD = v.d(v.l(file));
        try {
            String strW = pVarD.w(LongCompanionObject.MAX_VALUE);
            String strW2 = pVarD.w(LongCompanionObject.MAX_VALUE);
            String strW3 = pVarD.w(LongCompanionObject.MAX_VALUE);
            String strW4 = pVarD.w(LongCompanionObject.MAX_VALUE);
            String strW5 = pVarD.w(LongCompanionObject.MAX_VALUE);
            if (!Intrinsics.areEqual("libcore.io.DiskLruCache", strW) || !Intrinsics.areEqual("1", strW2) || !Intrinsics.areEqual(String.valueOf(201105), strW3) || !Intrinsics.areEqual(String.valueOf(2), strW4) || strW5.length() > 0) {
                throw new IOException("unexpected journal header: [" + strW + ", " + strW2 + ", " + strW4 + ", " + strW5 + ']');
            }
            int i7 = 0;
            while (true) {
                try {
                    z(pVarD.w(LongCompanionObject.MAX_VALUE));
                    i7++;
                } catch (EOFException unused) {
                    this.F = i7 - this.E.size();
                    if (pVarD.c()) {
                        this.f8756y = q();
                    } else {
                        B();
                    }
                    Unit unit = Unit.f14616a;
                    pVarD.close();
                    return;
                }
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                ls.d.k(pVarD, th2);
                throw th3;
            }
        }
    }

    public final void z(String str) throws IOException {
        String strSubstring;
        int i7 = 0;
        int I = StringsKt.I(str, ' ', 0, 6);
        if (I == -1) {
            throw new IOException(Intrinsics.stringPlus("unexpected journal line: ", str));
        }
        int i10 = I + 1;
        int I2 = StringsKt.I(str, ' ', i10, 4);
        LinkedHashMap linkedHashMap = this.E;
        if (I2 == -1) {
            strSubstring = str.substring(i10);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
            String str2 = S;
            if (I == str2.length() && x.o(str, str2, false)) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i10, I2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        e eVar = (e) linkedHashMap.get(strSubstring);
        if (eVar == null) {
            eVar = new e(this, strSubstring);
            linkedHashMap.put(strSubstring, eVar);
        }
        if (I2 != -1) {
            String str3 = Q;
            if (I == str3.length() && x.o(str, str3, false)) {
                String strSubstring2 = str.substring(I2 + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
                List strings = StringsKt.S(strSubstring2, new char[]{' '});
                eVar.f8739e = true;
                eVar.f8741g = null;
                Intrinsics.checkNotNullParameter(strings, "strings");
                int size = strings.size();
                eVar.j.getClass();
                if (size != 2) {
                    throw new IOException(Intrinsics.stringPlus("unexpected journal line: ", strings));
                }
                try {
                    int size2 = strings.size();
                    while (i7 < size2) {
                        int i11 = i7 + 1;
                        eVar.f8736b[i7] = Long.parseLong((String) strings.get(i7));
                        i7 = i11;
                    }
                    return;
                } catch (NumberFormatException unused) {
                    throw new IOException(Intrinsics.stringPlus("unexpected journal line: ", strings));
                }
            }
        }
        if (I2 == -1) {
            String str4 = R;
            if (I == str4.length() && x.o(str, str4, false)) {
                eVar.f8741g = new a3.f(this, eVar);
                return;
            }
        }
        if (I2 == -1) {
            String str5 = T;
            if (I == str5.length() && x.o(str, str5, false)) {
                return;
            }
        }
        throw new IOException(Intrinsics.stringPlus("unexpected journal line: ", str));
    }
}
