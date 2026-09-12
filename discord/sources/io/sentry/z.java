package io.sentry;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class z implements p0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f13294b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c1 f13295a;

    public z(c1 c1Var) {
        this.f13295a = c1Var;
    }

    @Override // io.sentry.p0
    public final e4.c a(InputStream inputStream) throws IOException {
        c1 c1Var = this.f13295a;
        Charset charset = f13294b;
        byte[] bArr = new byte[IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i7 = 0;
        int i10 = -1;
        while (true) {
            try {
                int i11 = inputStream.read(bArr);
                if (i11 <= 0) {
                    break;
                }
                for (int i12 = 0; i10 == -1 && i12 < i11; i12++) {
                    if (bArr[i12] == 10) {
                        i10 = i7 + i12;
                        break;
                    }
                }
                byteArrayOutputStream.write(bArr, 0, i11);
                i7 += i11;
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (byteArray.length == 0) {
            throw new IllegalArgumentException("Empty stream.");
        }
        if (i10 == -1) {
            throw new IllegalArgumentException("Envelope contains no header.");
        }
        StringReader stringReader = new StringReader(new String(byteArray, 0, i10, charset));
        try {
            l4 l4Var = (l4) c1Var.d(stringReader, l4.class);
            stringReader.close();
            if (l4Var == null) {
                throw new IllegalArgumentException("Envelope header is null.");
            }
            int i13 = i10 + 1;
            ArrayList arrayList = new ArrayList();
            while (true) {
                int i14 = i13;
                while (true) {
                    if (i14 >= byteArray.length) {
                        i14 = -1;
                        break;
                    }
                    if (byteArray[i14] == 10) {
                        break;
                    }
                    i14++;
                }
                if (i14 == -1) {
                    throw new IllegalArgumentException("Invalid envelope. Item at index '" + arrayList.size() + "'. has no header delimiter.");
                }
                StringReader stringReader2 = new StringReader(new String(byteArray, i13, i14 - i13, charset));
                try {
                    q4 q4Var = (q4) c1Var.d(stringReader2, q4.class);
                    stringReader2.close();
                    if (q4Var == null || q4Var.a() <= 0) {
                        throw new IllegalArgumentException("Item header at index '" + arrayList.size() + "' is null or empty.");
                    }
                    int iA = q4Var.a() + i14;
                    int i15 = iA + 1;
                    if (i15 > byteArray.length) {
                        throw new IllegalArgumentException("Invalid length for item at index '" + arrayList.size() + "'. Item is '" + i15 + "' bytes. There are '" + byteArray.length + "' in the buffer.");
                    }
                    arrayList.add(new p4(q4Var, Arrays.copyOfRange(byteArray, i14 + 1, i15)));
                    if (i15 == byteArray.length) {
                        break;
                    }
                    i13 = iA + 2;
                    if (i13 == byteArray.length) {
                        if (byteArray[i15] == 10) {
                            break;
                        }
                        throw new IllegalArgumentException("Envelope has invalid data following an item.");
                    }
                } catch (Throwable th4) {
                    try {
                        stringReader2.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                    throw th4;
                }
            }
            e4.c cVar = new e4.c(l4Var, arrayList);
            byteArrayOutputStream.close();
            return cVar;
        } catch (Throwable th6) {
            try {
                stringReader.close();
            } catch (Throwable th7) {
                th6.addSuppressed(th7);
            }
            throw th6;
        }
    }
}
