package y2;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import ic.j;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vi.d f23143a = new vi.d(20, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f23144b = {112, 114, 111, 0};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f23145c = {112, 114, 109, 0};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f23146d = {48, 49, 53, 0};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f23147e = {48, 49, 48, 0};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f23148f = {48, 48, 57, 0};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f23149g = {48, 48, 53, 0};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f23150h = {48, 48, 49, 0};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f23151i = {48, 48, 49, 0};
    public static final byte[] j = {48, 48, 50, 0};

    public static byte[] a(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th2) {
                try {
                    deflaterOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            deflater.end();
            throw th4;
        }
    }

    public static byte[] b(a[] aVarArr, byte[] bArr) throws IOException {
        int i7 = 0;
        int length = 0;
        for (a aVar : aVarArr) {
            length += ((((aVar.f23140g * 2) + 7) & (-8)) / 8) + (aVar.f23138e * 2) + d(aVar.f23134a, aVar.f23135b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + aVar.f23139f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, f23148f)) {
            int length2 = aVarArr.length;
            while (i7 < length2) {
                a aVar2 = aVarArr[i7];
                q(byteArrayOutputStream, aVar2, d(aVar2.f23134a, aVar2.f23135b, bArr));
                p(byteArrayOutputStream, aVar2);
                i7++;
            }
        } else {
            for (a aVar3 : aVarArr) {
                q(byteArrayOutputStream, aVar3, d(aVar3.f23134a, aVar3.f23135b, bArr));
            }
            int length3 = aVarArr.length;
            while (i7 < length3) {
                p(byteArrayOutputStream, aVarArr[i7]);
                i7++;
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    public static boolean c(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z5 = true;
        for (File file2 : fileArrListFiles) {
            z5 = c(file2) && z5;
        }
        return z5;
    }

    public static String d(String str, String str2, byte[] bArr) {
        byte[] bArr2 = f23150h;
        boolean zEquals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f23149g;
        Object obj = (zEquals || Arrays.equals(bArr, bArr3)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            if (":".equals(obj)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(obj)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(obj)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                return com.discord.chat.presentation.list.a.k(kk.b.n(str), (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!", str2);
            }
        }
        return str2;
    }

    public static void e(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } catch (Throwable th2) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException unused) {
        }
    }

    public static byte[] f(InputStream inputStream, int i7) throws IOException {
        byte[] bArr = new byte[i7];
        int i10 = 0;
        while (i10 < i7) {
            int i11 = inputStream.read(bArr, i10, i7 - i10);
            if (i11 < 0) {
                throw new IllegalStateException(kk.b.h(i7, "Not enough bytes to read: "));
            }
            i10 += i11;
        }
        return bArr;
    }

    public static int[] g(ByteArrayInputStream byteArrayInputStream, int i7) {
        int[] iArr = new int[i7];
        int iM = 0;
        for (int i10 = 0; i10 < i7; i10++) {
            iM += (int) m(byteArrayInputStream, 2);
            iArr[i10] = iM;
        }
        return iArr;
    }

    public static byte[] h(FileInputStream fileInputStream, int i7, int i10) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i10];
            byte[] bArr2 = new byte[RecyclerView.ItemAnimator.FLAG_MOVED];
            int i11 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i11 < i7) {
                int i12 = fileInputStream.read(bArr2);
                if (i12 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i7 + " bytes");
                }
                inflater.setInput(bArr2, 0, i12);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i10 - iInflate);
                    i11 += i12;
                } catch (DataFormatException e10) {
                    throw new IllegalStateException(e10.getMessage());
                }
            }
            if (i11 == i7) {
                if (!inflater.finished()) {
                    throw new IllegalStateException("Inflater did not finish");
                }
                inflater.end();
                return bArr;
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i7 + " actual=" + i11);
        } catch (Throwable th2) {
            inflater.end();
            throw th2;
        }
    }

    public static a[] i(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, a[] aVarArr) throws IOException {
        byte[] bArr3 = f23151i;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, j)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int iM = (int) m(fileInputStream, 2);
            byte[] bArrH = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrH);
            try {
                a[] aVarArrK = k(byteArrayInputStream, bArr2, iM, aVarArr);
                byteArrayInputStream.close();
                return aVarArrK;
            } catch (Throwable th2) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        if (Arrays.equals(f23146d, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int iM2 = (int) m(fileInputStream, 1);
        byte[] bArrH2 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrH2);
        try {
            a[] aVarArrJ = j(byteArrayInputStream2, iM2, aVarArr);
            byteArrayInputStream2.close();
            return aVarArrJ;
        } catch (Throwable th4) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
            }
            throw th4;
        }
    }

    public static a[] j(ByteArrayInputStream byteArrayInputStream, int i7, a[] aVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new a[0];
        }
        if (i7 != aVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i7];
        int[] iArr = new int[i7];
        for (int i10 = 0; i10 < i7; i10++) {
            int iM = (int) m(byteArrayInputStream, 2);
            iArr[i10] = (int) m(byteArrayInputStream, 2);
            strArr[i10] = new String(f(byteArrayInputStream, iM), StandardCharsets.UTF_8);
        }
        for (int i11 = 0; i11 < i7; i11++) {
            a aVar = aVarArr[i11];
            if (!aVar.f23135b.equals(strArr[i11])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i12 = iArr[i11];
            aVar.f23138e = i12;
            aVar.f23141h = g(byteArrayInputStream, i12);
        }
        return aVarArr;
    }

    public static a[] k(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i7, a[] aVarArr) throws IOException {
        if (byteArrayInputStream.available() == 0) {
            return new a[0];
        }
        if (i7 != aVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i10 = 0; i10 < i7; i10++) {
            m(byteArrayInputStream, 2);
            String str = new String(f(byteArrayInputStream, (int) m(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jM = m(byteArrayInputStream, 4);
            int iM = (int) m(byteArrayInputStream, 2);
            a aVar = null;
            if (aVarArr.length > 0) {
                int iIndexOf = str.indexOf("!");
                if (iIndexOf < 0) {
                    iIndexOf = str.indexOf(":");
                }
                String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
                for (int i11 = 0; i11 < aVarArr.length; i11++) {
                    if (aVarArr[i11].f23135b.equals(strSubstring)) {
                        aVar = aVarArr[i11];
                        break;
                    }
                }
            }
            if (aVar == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            aVar.f23137d = jM;
            int[] iArrG = g(byteArrayInputStream, iM);
            if (Arrays.equals(bArr, f23150h)) {
                aVar.f23138e = iM;
                aVar.f23141h = iArrG;
            }
        }
        return aVarArr;
    }

    public static a[] l(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, f23147e)) {
            throw new IllegalStateException("Unsupported version");
        }
        int iM = (int) m(fileInputStream, 1);
        byte[] bArrH = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrH);
        try {
            a[] aVarArrN = n(byteArrayInputStream, str, iM);
            byteArrayInputStream.close();
            return aVarArrN;
        } catch (Throwable th2) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static long m(InputStream inputStream, int i7) throws IOException {
        byte[] bArrF = f(inputStream, i7);
        long j5 = 0;
        for (int i10 = 0; i10 < i7; i10++) {
            j5 += ((long) (bArrF[i10] & 255)) << (i10 * 8);
        }
        return j5;
    }

    public static a[] n(ByteArrayInputStream byteArrayInputStream, String str, int i7) throws IOException {
        int i10 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new a[0];
        }
        a[] aVarArr = new a[i7];
        for (int i11 = 0; i11 < i7; i11++) {
            int iM = (int) m(byteArrayInputStream, 2);
            int iM2 = (int) m(byteArrayInputStream, 2);
            aVarArr[i11] = new a(str, new String(f(byteArrayInputStream, iM), StandardCharsets.UTF_8), m(byteArrayInputStream, 4), iM2, (int) m(byteArrayInputStream, 4), (int) m(byteArrayInputStream, 4), new int[iM2], new TreeMap());
        }
        int i12 = 0;
        while (i12 < i7) {
            a aVar = aVarArr[i12];
            int iAvailable = byteArrayInputStream.available();
            int i13 = aVar.f23139f;
            int i14 = aVar.f23140g;
            TreeMap treeMap = aVar.f23142i;
            int i15 = iAvailable - i13;
            int iM3 = i10;
            while (byteArrayInputStream.available() > i15) {
                iM3 += (int) m(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iM3), 1);
                int iM4 = (int) m(byteArrayInputStream, 2);
                while (iM4 > 0) {
                    m(byteArrayInputStream, 2);
                    int iM5 = (int) m(byteArrayInputStream, 1);
                    if (iM5 != 6 && iM5 != 7) {
                        while (iM5 > 0) {
                            m(byteArrayInputStream, 1);
                            int i16 = i10;
                            int i17 = i12;
                            for (int iM6 = (int) m(byteArrayInputStream, 1); iM6 > 0; iM6--) {
                                m(byteArrayInputStream, 2);
                            }
                            iM5--;
                            i10 = i16;
                            i12 = i17;
                        }
                    }
                    iM4--;
                    i10 = i10;
                    i12 = i12;
                }
            }
            int i18 = i10;
            int i19 = i12;
            if (byteArrayInputStream.available() != i15) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            aVar.f23141h = g(byteArrayInputStream, aVar.f23138e);
            BitSet bitSetValueOf = BitSet.valueOf(f(byteArrayInputStream, (((i14 * 2) + 7) & (-8)) / 8));
            for (int i20 = i18; i20 < i14; i20++) {
                int i21 = bitSetValueOf.get(i20) ? 2 : i18;
                if (bitSetValueOf.get(i20 + i14)) {
                    i21 |= 4;
                }
                if (i21 != 0) {
                    Integer numValueOf = (Integer) treeMap.get(Integer.valueOf(i20));
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(i18);
                    }
                    treeMap.put(Integer.valueOf(i20), Integer.valueOf(i21 | numValueOf.intValue()));
                }
            }
            i12 = i19 + 1;
            i10 = i18;
        }
        return aVarArr;
    }

    public static boolean o(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, a[] aVarArr) throws IOException {
        long j5;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = f23146d;
        int i7 = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = f23147e;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] bArrB = b(aVarArr, bArr3);
                u(byteArrayOutputStream, aVarArr.length, 1);
                u(byteArrayOutputStream, bArrB.length, 4);
                byte[] bArrA = a(bArrB);
                u(byteArrayOutputStream, bArrA.length, 4);
                byteArrayOutputStream.write(bArrA);
                return true;
            }
            byte[] bArr4 = f23149g;
            if (Arrays.equals(bArr, bArr4)) {
                u(byteArrayOutputStream, aVarArr.length, 1);
                for (a aVar : aVarArr) {
                    int size = aVar.f23142i.size() * 4;
                    String strD = d(aVar.f23134a, aVar.f23135b, bArr4);
                    Charset charset = StandardCharsets.UTF_8;
                    v(byteArrayOutputStream, strD.getBytes(charset).length);
                    v(byteArrayOutputStream, aVar.f23141h.length);
                    u(byteArrayOutputStream, size, 4);
                    u(byteArrayOutputStream, aVar.f23136c, 4);
                    byteArrayOutputStream.write(strD.getBytes(charset));
                    Iterator it = aVar.f23142i.keySet().iterator();
                    while (it.hasNext()) {
                        v(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        v(byteArrayOutputStream, 0);
                    }
                    for (int i10 : aVar.f23141h) {
                        v(byteArrayOutputStream, i10);
                    }
                }
                return true;
            }
            byte[] bArr5 = f23148f;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrB2 = b(aVarArr, bArr5);
                u(byteArrayOutputStream, aVarArr.length, 1);
                u(byteArrayOutputStream, bArrB2.length, 4);
                byte[] bArrA2 = a(bArrB2);
                u(byteArrayOutputStream, bArrA2.length, 4);
                byteArrayOutputStream.write(bArrA2);
                return true;
            }
            byte[] bArr6 = f23150h;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            v(byteArrayOutputStream, aVarArr.length);
            for (a aVar2 : aVarArr) {
                String str = aVar2.f23134a;
                TreeMap treeMap = aVar2.f23142i;
                String strD2 = d(str, aVar2.f23135b, bArr6);
                Charset charset2 = StandardCharsets.UTF_8;
                v(byteArrayOutputStream, strD2.getBytes(charset2).length);
                v(byteArrayOutputStream, treeMap.size());
                v(byteArrayOutputStream, aVar2.f23141h.length);
                u(byteArrayOutputStream, aVar2.f23136c, 4);
                byteArrayOutputStream.write(strD2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    v(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i11 : aVar2.f23141h) {
                    v(byteArrayOutputStream, i11);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            v(byteArrayOutputStream2, aVarArr.length);
            int i12 = 2;
            int i13 = 2;
            for (a aVar3 : aVarArr) {
                u(byteArrayOutputStream2, aVar3.f23136c, 4);
                u(byteArrayOutputStream2, aVar3.f23137d, 4);
                u(byteArrayOutputStream2, aVar3.f23140g, 4);
                String strD3 = d(aVar3.f23134a, aVar3.f23135b, bArr2);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strD3.getBytes(charset3).length;
                v(byteArrayOutputStream2, length2);
                i13 = i13 + 14 + length2;
                byteArrayOutputStream2.write(strD3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i13 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i13 + ", does not match actual size " + byteArray.length);
            }
            i iVar = new i(byteArray, 1, false);
            byteArrayOutputStream2.close();
            arrayList2.add(iVar);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i14 = 0;
            int i15 = 0;
            while (i14 < aVarArr.length) {
                try {
                    a aVar4 = aVarArr[i14];
                    v(byteArrayOutputStream3, i14);
                    v(byteArrayOutputStream3, aVar4.f23138e);
                    i15 = i15 + 4 + (aVar4.f23138e * i12);
                    int[] iArr = aVar4.f23141h;
                    int length3 = iArr.length;
                    int i16 = i7;
                    int i17 = i12;
                    int i18 = i16;
                    while (i18 < length3) {
                        int i19 = iArr[i18];
                        v(byteArrayOutputStream3, i19 - i16);
                        i18++;
                        i16 = i19;
                    }
                    i14++;
                    i12 = i17;
                    i7 = 0;
                } catch (Throwable th2) {
                    try {
                        byteArrayOutputStream3.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i15 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i15 + ", does not match actual size " + byteArray2.length);
            }
            i iVar2 = new i(byteArray2, 3, true);
            byteArrayOutputStream3.close();
            arrayList2.add(iVar2);
            ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
            int i20 = 0;
            int i21 = 0;
            while (i20 < aVarArr.length) {
                try {
                    a aVar5 = aVarArr[i20];
                    Iterator it3 = aVar5.f23142i.entrySet().iterator();
                    int iIntValue = 0;
                    while (it3.hasNext()) {
                        iIntValue |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                    try {
                        r(byteArrayOutputStream5, iIntValue, aVar5);
                        byte[] byteArray3 = byteArrayOutputStream5.toByteArray();
                        byteArrayOutputStream5.close();
                        ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
                        try {
                            s(byteArrayOutputStream6, aVar5);
                            byte[] byteArray4 = byteArrayOutputStream6.toByteArray();
                            byteArrayOutputStream6.close();
                            v(byteArrayOutputStream4, i20);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i22 = i21 + 6;
                            ArrayList arrayList4 = arrayList3;
                            u(byteArrayOutputStream4, length4, 4);
                            v(byteArrayOutputStream4, iIntValue);
                            byteArrayOutputStream4.write(byteArray3);
                            byteArrayOutputStream4.write(byteArray4);
                            i21 = i22 + length4;
                            i20++;
                            arrayList3 = arrayList4;
                        } catch (Throwable th4) {
                            try {
                                byteArrayOutputStream6.close();
                                throw th4;
                            } catch (Throwable th5) {
                                th4.addSuppressed(th5);
                                throw th4;
                            }
                        }
                    } catch (Throwable th6) {
                        try {
                            byteArrayOutputStream5.close();
                            throw th6;
                        } catch (Throwable th7) {
                            th6.addSuppressed(th7);
                            throw th6;
                        }
                    }
                } catch (Throwable th8) {
                    try {
                        byteArrayOutputStream4.close();
                        throw th8;
                    } catch (Throwable th9) {
                        th8.addSuppressed(th9);
                        throw th8;
                    }
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream4.toByteArray();
            if (i21 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i21 + ", does not match actual size " + byteArray5.length);
            }
            i iVar3 = new i(byteArray5, 4, true);
            byteArrayOutputStream4.close();
            arrayList2.add(iVar3);
            long j7 = 4;
            long size2 = j7 + j7 + 4 + ((long) (arrayList2.size() * 16));
            u(byteArrayOutputStream, arrayList2.size(), 4);
            int i23 = 0;
            while (i23 < arrayList2.size()) {
                i iVar4 = (i) arrayList2.get(i23);
                int i24 = iVar4.f23160a;
                byte[] bArr7 = iVar4.f23161b;
                if (i24 == 1) {
                    j5 = 0;
                } else if (i24 == 2) {
                    j5 = 1;
                } else if (i24 == 3) {
                    j5 = 2;
                } else if (i24 == 4) {
                    j5 = 3;
                } else {
                    if (i24 != 5) {
                        throw null;
                    }
                    j5 = 4;
                }
                u(byteArrayOutputStream, j5, 4);
                u(byteArrayOutputStream, size2, 4);
                if (iVar4.f23162c) {
                    long length5 = bArr7.length;
                    byte[] bArrA3 = a(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(bArrA3);
                    u(byteArrayOutputStream, bArrA3.length, 4);
                    u(byteArrayOutputStream, length5, 4);
                    length = bArrA3.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    u(byteArrayOutputStream, bArr7.length, 4);
                    u(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += (long) length;
                i23++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i25 = 0; i25 < arrayList6.size(); i25++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i25));
            }
            return true;
        } catch (Throwable th10) {
            try {
                byteArrayOutputStream2.close();
                throw th10;
            } catch (Throwable th11) {
                th10.addSuppressed(th11);
                throw th10;
            }
        }
    }

    public static void p(ByteArrayOutputStream byteArrayOutputStream, a aVar) throws IOException {
        s(byteArrayOutputStream, aVar);
        int i7 = aVar.f23140g;
        int[] iArr = aVar.f23141h;
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = iArr[i10];
            v(byteArrayOutputStream, i12 - i11);
            i10++;
            i11 = i12;
        }
        byte[] bArr = new byte[(((i7 * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : aVar.f23142i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i13 = iIntValue / 8;
                bArr[i13] = (byte) (bArr[i13] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i14 = iIntValue + i7;
                int i15 = i14 / 8;
                bArr[i15] = (byte) ((1 << (i14 % 8)) | bArr[i15]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void q(ByteArrayOutputStream byteArrayOutputStream, a aVar, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        v(byteArrayOutputStream, str.getBytes(charset).length);
        v(byteArrayOutputStream, aVar.f23138e);
        u(byteArrayOutputStream, aVar.f23139f, 4);
        u(byteArrayOutputStream, aVar.f23136c, 4);
        u(byteArrayOutputStream, aVar.f23140g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void r(ByteArrayOutputStream byteArrayOutputStream, int i7, a aVar) throws IOException {
        int i10 = aVar.f23140g;
        byte[] bArr = new byte[(((Integer.bitCount(i7 & (-2)) * i10) + 7) & (-8)) / 8];
        for (Map.Entry entry : aVar.f23142i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            int i11 = 0;
            for (int i12 = 1; i12 <= 4; i12 <<= 1) {
                if (i12 != 1 && (i12 & i7) != 0) {
                    if ((i12 & iIntValue2) == i12) {
                        int i13 = (i11 * i10) + iIntValue;
                        int i14 = i13 / 8;
                        bArr[i14] = (byte) ((1 << (i13 % 8)) | bArr[i14]);
                    }
                    i11++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void s(ByteArrayOutputStream byteArrayOutputStream, a aVar) throws IOException {
        int i7 = 0;
        for (Map.Entry entry : aVar.f23142i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                v(byteArrayOutputStream, iIntValue - i7);
                v(byteArrayOutputStream, 0);
                i7 = iIntValue;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0192 A[Catch: all -> 0x018f, TRY_ENTER, TryCatch #31 {all -> 0x018f, blocks: (B:94:0x016e, B:96:0x017a, B:107:0x0192, B:108:0x0197), top: B:283:0x016e }] */
    /* JADX WARN: Code duplicated, block: B:114:0x01a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:115:0x01a3 A[Catch: IllegalStateException -> 0x0189, IOException -> 0x018b, FileNotFoundException -> 0x018d, TRY_LEAVE, TryCatch #34 {FileNotFoundException -> 0x018d, IOException -> 0x018b, IllegalStateException -> 0x0189, blocks: (B:92:0x0166, B:97:0x0184, B:115:0x01a3, B:113:0x01a0, B:112:0x019d), top: B:299:0x0166 }] */
    /* JADX WARN: Code duplicated, block: B:122:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:132:0x01e3 A[Catch: all -> 0x01f1, TRY_LEAVE, TryCatch #14 {all -> 0x01f1, blocks: (B:130:0x01d7, B:132:0x01e3, B:141:0x01f4), top: B:272:0x01d7 }] */
    /* JADX WARN: Code duplicated, block: B:141:0x01f4 A[Catch: all -> 0x01f1, TRY_ENTER, TRY_LEAVE, TryCatch #14 {all -> 0x01f1, blocks: (B:130:0x01d7, B:132:0x01e3, B:141:0x01f4), top: B:272:0x01d7 }] */
    /* JADX WARN: Code duplicated, block: B:152:0x0211  */
    /* JADX WARN: Code duplicated, block: B:156:0x021d  */
    /* JADX WARN: Code duplicated, block: B:157:0x0221  */
    /* JADX WARN: Code duplicated, block: B:166:0x0243 A[Catch: all -> 0x0281, TryCatch #26 {all -> 0x0281, blocks: (B:164:0x023d, B:166:0x0243, B:167:0x0247, B:169:0x024d), top: B:277:0x023d }] */
    /* JADX WARN: Code duplicated, block: B:169:0x024d A[Catch: all -> 0x0281, TRY_LEAVE, TryCatch #26 {all -> 0x0281, blocks: (B:164:0x023d, B:166:0x0243, B:167:0x0247, B:169:0x024d), top: B:277:0x023d }] */
    /* JADX WARN: Code duplicated, block: B:235:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:239:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:246:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:269:0x0107 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:277:0x023d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:283:0x016e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:296:0x01d2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:297:0x0225 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:300:0x0252 A[EDGE_INSN: B:300:0x0252->B:171:0x0252 BREAK  A[LOOP:0: B:167:0x0247->B:301:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:55:0x0111 A[Catch: all -> 0x0126, IllegalStateException -> 0x0129, IOException -> 0x012b, TRY_LEAVE, TryCatch #11 {IOException -> 0x012b, blocks: (B:53:0x0107, B:55:0x0111, B:66:0x012d, B:67:0x0132), top: B:269:0x0107, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x012d A[Catch: all -> 0x0126, IllegalStateException -> 0x0129, IOException -> 0x012b, TRY_ENTER, TryCatch #11 {IOException -> 0x012b, blocks: (B:53:0x0107, B:55:0x0111, B:66:0x012d, B:67:0x0132), top: B:269:0x0107, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x017a A[Catch: all -> 0x018f, TRY_LEAVE, TryCatch #31 {all -> 0x018f, blocks: (B:94:0x016e, B:96:0x017a, B:107:0x0192, B:108:0x0197), top: B:283:0x016e }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v25, types: [int] */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v40 */
    /* JADX WARN: Type inference failed for: r7v41 */
    /* JADX WARN: Type inference failed for: r7v42 */
    /* JADX WARN: Type inference failed for: r7v43 */
    /* JADX WARN: Type inference failed for: r7v44 */
    /* JADX WARN: Type inference failed for: r7v45 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v47 */
    /* JADX WARN: Type inference failed for: r7v48 */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v50 */
    /* JADX WARN: Type inference failed for: r7v51 */
    /* JADX WARN: Type inference failed for: r7v52 */
    /* JADX WARN: Type inference failed for: r7v53 */
    /* JADX WARN: Type inference failed for: r7v54 */
    /* JADX WARN: Type inference failed for: r7v55 */
    /* JADX WARN: Type inference failed for: r7v56 */
    /* JADX WARN: Type inference failed for: r7v57 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v18 */
    public static void t(Context context, Executor executor, b bVar, boolean z5) {
        boolean z6;
        ?? B;
        byte[] bArr;
        a[] aVarArrL;
        a[] aVarArr;
        b bVar2;
        a[] aVarArr2;
        byte[] bArr2;
        ?? r7;
        byte[] bArr3;
        ?? r10;
        boolean z7;
        ByteArrayInputStream byteArrayInputStream;
        Throwable th2;
        FileOutputStream fileOutputStream;
        Throwable th3;
        FileChannel channel;
        FileLock fileLockTryLock;
        byte[] bArr4;
        int i7;
        ?? r11;
        boolean z10;
        boolean z11;
        ?? r12;
        ByteArrayOutputStream byteArrayOutputStream;
        j jVar;
        ?? r13;
        String str;
        FileInputStream fileInputStreamB;
        ?? r14;
        ?? r15;
        boolean z12;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z5) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long j5 = dataInputStream.readLong();
                            dataInputStream.close();
                            z12 = j5 == packageInfo.lastUpdateTime;
                            if (z12) {
                                bVar.j(2, null);
                            }
                        } catch (Throwable th4) {
                            try {
                                dataInputStream.close();
                                throw th4;
                            } catch (Throwable th5) {
                                th4.addSuppressed(th5);
                                throw th4;
                            }
                        }
                    } catch (IOException unused) {
                        z12 = false;
                    }
                } else {
                    z12 = false;
                }
                if (z12) {
                    Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                    h.c(context, false);
                    return;
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            j jVar2 = new j(assets, executor, bVar, name, file2);
            byte[] bArr5 = (byte[]) jVar2.f11520d;
            if (bArr5 != null) {
                if (!file2.exists()) {
                    try {
                        if (file2.createNewFile()) {
                            jVar2.f11517a = true;
                            B = jVar2.b(assets, "dexopt/baseline.prof");
                            bArr = f23144b;
                            if (B != 0) {
                                if (Arrays.equals(bArr, f(B, 4))) {
                                    throw new IllegalStateException("Invalid magic");
                                }
                                aVarArrL = l(B, f(B, 4), (String) jVar2.f11522f);
                                B.close();
                                jVar2.f11523g = aVarArrL;
                            }
                            aVarArr = (a[]) jVar2.f11523g;
                            if (aVarArr != null) {
                                str = "dexopt/baseline.profm";
                                fileInputStreamB = jVar2.b(assets, "dexopt/baseline.profm");
                                r13 = str;
                                if (fileInputStreamB == null) {
                                    if (fileInputStreamB != null) {
                                        fileInputStreamB.close();
                                        r13 = str;
                                    }
                                    jVar = null;
                                    B = r13;
                                } else {
                                    if (Arrays.equals(f23145c, f(fileInputStreamB, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    byte[] bArrF = f(fileInputStreamB, 4);
                                    jVar2.f11523g = i(fileInputStreamB, bArrF, bArr5, aVarArr);
                                    fileInputStreamB.close();
                                    jVar = jVar2;
                                    B = bArrF;
                                }
                                if (jVar != null) {
                                    jVar2 = jVar;
                                }
                            }
                            bVar2 = (b) jVar2.f11519c;
                            aVarArr2 = (a[]) jVar2.f11523g;
                            bArr2 = (byte[]) jVar2.f11520d;
                            r7 = B;
                            r7 = B;
                            if (aVarArr2 != null) {
                                z11 = jVar2.f11517a;
                                if (z11) {
                                    throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                }
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                byteArrayOutputStream.write(bArr);
                                byteArrayOutputStream.write(bArr2);
                                if (o(byteArrayOutputStream, bArr2, aVarArr2)) {
                                    jVar2.f11524h = byteArrayOutputStream.toByteArray();
                                    byteArrayOutputStream.close();
                                    r12 = byteArrayOutputStream;
                                    jVar2.f11523g = null;
                                    r7 = r12;
                                } else {
                                    bVar2.j(5, null);
                                    jVar2.f11523g = null;
                                    byteArrayOutputStream.close();
                                    r7 = byteArrayOutputStream;
                                }
                            }
                            bArr3 = (byte[]) jVar2.f11524h;
                            if (bArr3 != null) {
                                if (jVar2.f11517a) {
                                    throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                }
                                byteArrayInputStream = new ByteArrayInputStream(bArr3);
                                fileOutputStream = new FileOutputStream((File) jVar2.f11521e);
                                channel = fileOutputStream.getChannel();
                                fileLockTryLock = channel.tryLock();
                                if (fileLockTryLock != null) {
                                    if (fileLockTryLock.isValid()) {
                                        bArr4 = new byte[IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING];
                                        while (true) {
                                            i7 = byteArrayInputStream.read(bArr4);
                                            if (i7 > 0) {
                                                break;
                                                break;
                                            }
                                            fileOutputStream.write(bArr4, 0, i7);
                                        }
                                        r11 = 1;
                                        jVar2.c(1, null);
                                        fileLockTryLock.close();
                                        channel.close();
                                        fileOutputStream.close();
                                        byteArrayInputStream.close();
                                        jVar2.f11524h = null;
                                        jVar2.f11523g = null;
                                        z7 = true;
                                    }
                                }
                                throw new IOException("Unable to acquire a lock on the underlying file channel.");
                            }
                            z7 = false;
                            r11 = 1;
                            if (z7) {
                                e(packageInfo, filesDir);
                            }
                            z10 = z7;
                            r14 = r11;
                        } else {
                            jVar2.c(4, null);
                        }
                    } catch (IOException unused2) {
                        z6 = true;
                        jVar2.c(4, null);
                    }
                } else if (file2.canWrite()) {
                    jVar2.f11517a = true;
                    try {
                        B = jVar2.b(assets, "dexopt/baseline.prof");
                    } catch (FileNotFoundException e10) {
                        bVar.j(6, e10);
                        B = 0;
                    } catch (IOException e11) {
                        bVar.j(7, e11);
                        B = 0;
                    }
                    bArr = f23144b;
                    try {
                        if (B != 0) {
                            try {
                                try {
                                    if (Arrays.equals(bArr, f(B, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    aVarArrL = l(B, f(B, 4), (String) jVar2.f11522f);
                                    try {
                                        B.close();
                                    } catch (IOException e12) {
                                        bVar.j(7, e12);
                                    }
                                    jVar2.f11523g = aVarArrL;
                                } catch (IOException e13) {
                                    bVar.j(7, e13);
                                    try {
                                        B.close();
                                    } catch (IOException e14) {
                                        bVar.j(7, e14);
                                    }
                                    aVarArrL = null;
                                }
                            } catch (IllegalStateException e15) {
                                bVar.j(8, e15);
                                B.close();
                                aVarArrL = null;
                            }
                        }
                        aVarArr = (a[]) jVar2.f11523g;
                        if (aVarArr != null && ((B = Build.VERSION.SDK_INT) >= 31 || B == 24 || B == 25)) {
                            try {
                                str = "dexopt/baseline.profm";
                                fileInputStreamB = jVar2.b(assets, "dexopt/baseline.profm");
                                r13 = str;
                                if (fileInputStreamB == null) {
                                    try {
                                        if (Arrays.equals(f23145c, f(fileInputStreamB, 4))) {
                                            throw new IllegalStateException("Invalid magic");
                                        }
                                        byte[] bArrF2 = f(fileInputStreamB, 4);
                                        jVar2.f11523g = i(fileInputStreamB, bArrF2, bArr5, aVarArr);
                                        fileInputStreamB.close();
                                        jVar = jVar2;
                                        B = bArrF2;
                                    } catch (Throwable th6) {
                                        try {
                                            fileInputStreamB.close();
                                            throw th6;
                                        } catch (Throwable th7) {
                                            th6.addSuppressed(th7);
                                            throw th6;
                                        }
                                    }
                                } else {
                                    if (fileInputStreamB != null) {
                                        fileInputStreamB.close();
                                        r13 = str;
                                    }
                                    jVar = null;
                                    B = r13;
                                }
                            } catch (FileNotFoundException e16) {
                                bVar.j(9, e16);
                                r13 = B;
                            } catch (IOException e17) {
                                bVar.j(7, e17);
                                r13 = B;
                            } catch (IllegalStateException e18) {
                                jVar2.f11523g = null;
                                bVar.j(8, e18);
                                r13 = B;
                            }
                            if (jVar != null) {
                                jVar2 = jVar;
                            }
                        }
                        bVar2 = (b) jVar2.f11519c;
                        aVarArr2 = (a[]) jVar2.f11523g;
                        bArr2 = (byte[]) jVar2.f11520d;
                        r7 = B;
                        r7 = B;
                        if (aVarArr2 != null && bArr2 != null) {
                            z11 = jVar2.f11517a;
                            if (z11) {
                                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                            }
                            try {
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    byteArrayOutputStream.write(bArr);
                                    byteArrayOutputStream.write(bArr2);
                                    if (o(byteArrayOutputStream, bArr2, aVarArr2)) {
                                        bVar2.j(5, null);
                                        jVar2.f11523g = null;
                                        byteArrayOutputStream.close();
                                        r7 = byteArrayOutputStream;
                                    } else {
                                        jVar2.f11524h = byteArrayOutputStream.toByteArray();
                                        byteArrayOutputStream.close();
                                        r12 = byteArrayOutputStream;
                                        jVar2.f11523g = null;
                                        r7 = r12;
                                    }
                                } catch (Throwable th8) {
                                    try {
                                        byteArrayOutputStream.close();
                                        throw th8;
                                    } catch (Throwable th9) {
                                        th8.addSuppressed(th9);
                                        throw th8;
                                    }
                                }
                            } catch (IOException e19) {
                                bVar2.j(7, e19);
                                r12 = z11;
                            } catch (IllegalStateException e20) {
                                bVar2.j(8, e20);
                                r12 = z11;
                            }
                        }
                        bArr3 = (byte[]) jVar2.f11524h;
                        if (bArr3 != null) {
                            z7 = false;
                            r11 = 1;
                        } else {
                            try {
                                if (jVar2.f11517a) {
                                    throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                }
                                try {
                                    try {
                                        byteArrayInputStream = new ByteArrayInputStream(bArr3);
                                        try {
                                            try {
                                                fileOutputStream = new FileOutputStream((File) jVar2.f11521e);
                                                try {
                                                    try {
                                                        channel = fileOutputStream.getChannel();
                                                        try {
                                                            fileLockTryLock = channel.tryLock();
                                                            try {
                                                                try {
                                                                    if (fileLockTryLock != null) {
                                                                        try {
                                                                            if (fileLockTryLock.isValid()) {
                                                                                bArr4 = new byte[IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING];
                                                                                while (true) {
                                                                                    i7 = byteArrayInputStream.read(bArr4);
                                                                                    if (i7 > 0) {
                                                                                        break;
                                                                                    } else {
                                                                                        fileOutputStream.write(bArr4, 0, i7);
                                                                                    }
                                                                                }
                                                                                r11 = 1;
                                                                                jVar2.c(1, null);
                                                                                fileLockTryLock.close();
                                                                                channel.close();
                                                                                fileOutputStream.close();
                                                                                byteArrayInputStream.close();
                                                                                jVar2.f11524h = null;
                                                                                jVar2.f11523g = null;
                                                                                z7 = true;
                                                                            }
                                                                        } catch (Throwable th10) {
                                                                            th = th10;
                                                                            Throwable th11 = th;
                                                                            if (fileLockTryLock == null) {
                                                                                throw th11;
                                                                            }
                                                                            try {
                                                                                fileLockTryLock.close();
                                                                                throw th11;
                                                                            } catch (Throwable th12) {
                                                                                th11.addSuppressed(th12);
                                                                                throw th11;
                                                                            }
                                                                        }
                                                                    }
                                                                    throw new IOException("Unable to acquire a lock on the underlying file channel.");
                                                                } catch (Throwable th13) {
                                                                    th = th13;
                                                                    Throwable th14 = th;
                                                                    if (channel == null) {
                                                                        throw th14;
                                                                    }
                                                                    try {
                                                                        channel.close();
                                                                        throw th14;
                                                                    } catch (Throwable th15) {
                                                                        th14.addSuppressed(th15);
                                                                        throw th14;
                                                                    }
                                                                }
                                                            } catch (Throwable th16) {
                                                                th = th16;
                                                            }
                                                        } catch (Throwable th17) {
                                                            th = th17;
                                                        }
                                                    } catch (Throwable th18) {
                                                        th = th18;
                                                        th3 = th;
                                                        try {
                                                            fileOutputStream.close();
                                                            throw th3;
                                                        } catch (Throwable th19) {
                                                            th3.addSuppressed(th19);
                                                            throw th3;
                                                        }
                                                    }
                                                } catch (Throwable th20) {
                                                    th = th20;
                                                    th3 = th;
                                                    fileOutputStream.close();
                                                    throw th3;
                                                }
                                            } catch (Throwable th21) {
                                                th = th21;
                                                th2 = th;
                                                try {
                                                    byteArrayInputStream.close();
                                                    throw th2;
                                                } catch (Throwable th22) {
                                                    th2.addSuppressed(th22);
                                                    throw th2;
                                                }
                                            }
                                        } catch (Throwable th23) {
                                            th = th23;
                                            th2 = th;
                                            byteArrayInputStream.close();
                                            throw th2;
                                        }
                                    } catch (FileNotFoundException e21) {
                                        e = e21;
                                        jVar2.c(6, e);
                                        r10 = r7;
                                        jVar2.f11524h = null;
                                        jVar2.f11523g = null;
                                        z7 = false;
                                        r11 = r10;
                                    } catch (IOException e22) {
                                        e = e22;
                                        jVar2.c(7, e);
                                        r10 = r7;
                                        jVar2.f11524h = null;
                                        jVar2.f11523g = null;
                                        z7 = false;
                                        r11 = r10;
                                    }
                                } catch (FileNotFoundException e23) {
                                    e = e23;
                                    r7 = 1;
                                    jVar2.c(6, e);
                                    r10 = r7;
                                    jVar2.f11524h = null;
                                    jVar2.f11523g = null;
                                    z7 = false;
                                    r11 = r10;
                                } catch (IOException e24) {
                                    e = e24;
                                    r7 = 1;
                                    jVar2.c(7, e);
                                    r10 = r7;
                                    jVar2.f11524h = null;
                                    jVar2.f11523g = null;
                                    z7 = false;
                                    r11 = r10;
                                }
                            } catch (Throwable th24) {
                                jVar2.f11524h = null;
                                jVar2.f11523g = null;
                                throw th24;
                            }
                        }
                        if (z7) {
                            e(packageInfo, filesDir);
                        }
                        z10 = z7;
                        r14 = r11;
                    } catch (Throwable th25) {
                        try {
                            B.close();
                            throw th25;
                        } catch (IOException e25) {
                            bVar.j(7, e25);
                            throw th25;
                        }
                    }
                } else {
                    jVar2.c(4, null);
                }
                if (z10 || !z5) {
                    r15 = 0;
                } else {
                    r15 = r14;
                }
                h.c(context, r15);
            }
            jVar2.c(3, Integer.valueOf(Build.VERSION.SDK_INT));
            z6 = true;
            z10 = false;
            r14 = z6;
            if (z10) {
                r15 = 0;
            } else {
                r15 = 0;
            }
            h.c(context, r15);
        } catch (PackageManager.NameNotFoundException e26) {
            bVar.j(7, e26);
            h.c(context, false);
        }
    }

    public static void u(ByteArrayOutputStream byteArrayOutputStream, long j5, int i7) throws IOException {
        byte[] bArr = new byte[i7];
        for (int i10 = 0; i10 < i7; i10++) {
            bArr[i10] = (byte) ((j5 >> (i10 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void v(ByteArrayOutputStream byteArrayOutputStream, int i7) throws IOException {
        u(byteArrayOutputStream, i7, 2);
    }
}
