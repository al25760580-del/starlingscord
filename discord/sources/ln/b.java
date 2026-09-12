package ln;

import a3.e;
import android.util.Log;
import ga.l;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f15141b = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f15142c = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f15143a;

    public b(InputStream inputStream) {
        this.f15143a = new l(22, inputStream);
    }

    public final int a() {
        int i7;
        InputStream inputStream = (InputStream) this.f15143a.f9547e;
        int i10 = 65280;
        short s2 = 255;
        int i11 = ((inputStream.read() << 8) & 65280) | (inputStream.read() & 255);
        if ((i11 & 65496) == 65496 || i11 == 19789 || i11 == 18761) {
            while (true) {
                short s5 = (short) (inputStream.read() & s2);
                if (s5 == s2) {
                    short s7 = (short) (inputStream.read() & s2);
                    if (s7 != 218) {
                        if (s7 != 217) {
                            i7 = (((inputStream.read() << 8) & i10) | (inputStream.read() & s2)) - 2;
                            if (s7 == 225) {
                                break;
                            }
                            long j = i7;
                            long j5 = 0;
                            if (j >= 0) {
                                long j7 = j;
                                while (j7 > 0) {
                                    long jSkip = inputStream.skip(j7);
                                    if (jSkip > 0) {
                                        j7 -= jSkip;
                                    } else {
                                        if (inputStream.read() == -1) {
                                            break;
                                        }
                                        j7--;
                                    }
                                }
                                j5 = j - j7;
                            }
                            if (j5 == j) {
                                i10 = 65280;
                                s2 = 255;
                            } else if (Log.isLoggable("ImageHeaderParser", 3)) {
                                StringBuilder sbR = e.r(s7, "Unable to skip enough data, type: ", i7, ", wanted to skip: ", ", but actually skipped: ");
                                sbR.append(j5);
                                Log.d("ImageHeaderParser", sbR.toString());
                            }
                        } else if (Log.isLoggable("ImageHeaderParser", 3)) {
                            Log.d("ImageHeaderParser", "Found MARKER_EOI in exif segment");
                        }
                    }
                } else if (Log.isLoggable("ImageHeaderParser", 3)) {
                    kk.b.q(s5, "Unknown segmentId=", "ImageHeaderParser");
                }
                i7 = -1;
                break;
            }
            if (i7 != -1) {
                byte[] bArr = new byte[i7];
                int i12 = i7;
                while (i12 > 0) {
                    int i13 = inputStream.read(bArr, i7 - i12, i12);
                    if (i13 == -1) {
                        break;
                    }
                    i12 -= i13;
                }
                int i14 = i7 - i12;
                if (i14 == i7) {
                    byte[] bArr2 = f15141b;
                    boolean z5 = i7 > bArr2.length;
                    if (z5) {
                        for (int i15 = 0; i15 < bArr2.length; i15++) {
                            if (bArr[i15] != bArr2[i15]) {
                                z5 = false;
                                break;
                            }
                        }
                    }
                    if (z5) {
                        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
                        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
                        ByteBuffer byteBuffer = (ByteBuffer) byteBufferWrap.order(byteOrder).limit(i7);
                        short s10 = byteBuffer.getShort(6);
                        if (s10 != 19789) {
                            if (s10 == 18761) {
                                byteOrder = ByteOrder.LITTLE_ENDIAN;
                            } else if (Log.isLoggable("ImageHeaderParser", 3)) {
                                kk.b.q(s10, "Unknown endianness = ", "ImageHeaderParser");
                            }
                        }
                        byteBuffer.order(byteOrder);
                        int i16 = byteBuffer.getInt(10);
                        short s11 = byteBuffer.getShort(i16 + 6);
                        for (int i17 = 0; i17 < s11; i17++) {
                            int i18 = (i17 * 12) + i16 + 8;
                            short s12 = byteBuffer.getShort(i18);
                            if (s12 == 274) {
                                short s13 = byteBuffer.getShort(i18 + 2);
                                if (s13 >= 1 && s13 <= 12) {
                                    int i19 = byteBuffer.getInt(i18 + 4);
                                    if (i19 >= 0) {
                                        if (Log.isLoggable("ImageHeaderParser", 3)) {
                                            StringBuilder sbR2 = e.r(i17, "Got tagIndex=", s12, " tagType=", " formatCode=");
                                            sbR2.append((int) s13);
                                            sbR2.append(" componentCount=");
                                            sbR2.append(i19);
                                            Log.d("ImageHeaderParser", sbR2.toString());
                                        }
                                        int i20 = i19 + f15142c[s13];
                                        if (i20 <= 4) {
                                            int i21 = i18 + 8;
                                            if (i21 >= 0 && i21 <= byteBuffer.remaining()) {
                                                if (i20 >= 0 && i20 + i21 <= byteBuffer.remaining()) {
                                                    return byteBuffer.getShort(i21);
                                                }
                                                if (Log.isLoggable("ImageHeaderParser", 3)) {
                                                    kk.b.q(s12, "Illegal number of bytes for TI tag data tagType=", "ImageHeaderParser");
                                                }
                                            } else if (Log.isLoggable("ImageHeaderParser", 3)) {
                                                Log.d("ImageHeaderParser", "Illegal tagValueOffset=" + i21 + " tagType=" + ((int) s12));
                                            }
                                        } else if (Log.isLoggable("ImageHeaderParser", 3)) {
                                            kk.b.q(s13, "Got byte count > 4, not orientation, continuing, formatCode=", "ImageHeaderParser");
                                        }
                                    } else if (Log.isLoggable("ImageHeaderParser", 3)) {
                                        Log.d("ImageHeaderParser", "Negative tiff component count");
                                    }
                                } else if (Log.isLoggable("ImageHeaderParser", 3)) {
                                    kk.b.q(s13, "Got invalid format code = ", "ImageHeaderParser");
                                }
                            }
                        }
                    } else if (Log.isLoggable("ImageHeaderParser", 3)) {
                        Log.d("ImageHeaderParser", "Missing jpeg exif preamble");
                    }
                } else if (Log.isLoggable("ImageHeaderParser", 3)) {
                    Log.d("ImageHeaderParser", "Unable to read exif segment data, length: " + i7 + ", actually read: " + i14);
                    return -1;
                }
            } else if (Log.isLoggable("ImageHeaderParser", 3)) {
                Log.d("ImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                return -1;
            }
        } else if (Log.isLoggable("ImageHeaderParser", 3)) {
            kk.b.q(i11, "Parser doesn't handle magic number: ", "ImageHeaderParser");
            return -1;
        }
        return -1;
    }
}
