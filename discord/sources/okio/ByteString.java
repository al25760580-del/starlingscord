package okio;

import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.io.IOException;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.zip.InflaterOutputStream;
import kotlin.collections.w;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.x;
import rs.u;
import rs.v;
import ss.b;

/* JADX INFO: loaded from: classes.dex */
public class ByteString implements Serializable, Comparable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final ByteString f17414v = new ByteString(new byte[0]);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f17415d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public transient int f17416e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public transient String f17417i;

    public ByteString(byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f17415d = data;
    }

    public String a() {
        byte[] map = u.f19608a;
        byte[] bArr = this.f17415d;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(map, "map");
        byte[] bArr2 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i7 = 0;
        int i10 = 0;
        while (i7 < length) {
            byte b10 = bArr[i7];
            int i11 = i7 + 2;
            byte b11 = bArr[i7 + 1];
            i7 += 3;
            byte b12 = bArr[i11];
            bArr2[i10] = map[(b10 & 255) >> 2];
            bArr2[i10 + 1] = map[((b10 & 3) << 4) | ((b11 & 255) >> 4)];
            int i12 = i10 + 3;
            bArr2[i10 + 2] = map[((b11 & 15) << 2) | ((b12 & 255) >> 6)];
            i10 += 4;
            bArr2[i12] = map[b12 & 63];
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b13 = bArr[i7];
            bArr2[i10] = map[(b13 & 255) >> 2];
            bArr2[i10 + 1] = map[(b13 & 3) << 4];
            byte b14 = (byte) 61;
            bArr2[i10 + 2] = b14;
            bArr2[i10 + 3] = b14;
        } else if (length2 == 2) {
            int i13 = i7 + 1;
            byte b15 = bArr[i7];
            byte b16 = bArr[i13];
            bArr2[i10] = map[(b15 & 255) >> 2];
            bArr2[i10 + 1] = map[((b15 & 3) << 4) | ((b16 & 255) >> 4)];
            bArr2[i10 + 2] = map[(b16 & 15) << 2];
            bArr2[i10 + 3] = (byte) 61;
        }
        Intrinsics.checkNotNullParameter(bArr2, "<this>");
        return new String(bArr2, Charsets.UTF_8);
    }

    public ByteString b(String algorithm) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        messageDigest.update(this.f17415d, 0, c());
        byte[] digestBytes = messageDigest.digest();
        Intrinsics.checkNotNullExpressionValue(digestBytes, "digestBytes");
        return new ByteString(digestBytes);
    }

    public int c() {
        return this.f17415d.length;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        ByteString other = (ByteString) obj;
        Intrinsics.checkNotNullParameter(other, "other");
        int iC = c();
        int iC2 = other.c();
        int iMin = Math.min(iC, iC2);
        for (int i7 = 0; i7 < iMin; i7++) {
            int iF = f(i7) & 255;
            int iF2 = other.f(i7) & 255;
            if (iF != iF2) {
                return iF < iF2 ? -1 : 1;
            }
        }
        if (iC == iC2) {
            return 0;
        }
        return iC < iC2 ? -1 : 1;
    }

    public String d() {
        byte[] bArr = this.f17415d;
        char[] cArr = new char[bArr.length * 2];
        int i7 = 0;
        for (byte b10 : bArr) {
            int i10 = i7 + 1;
            char[] cArr2 = b.f20565a;
            cArr[i7] = cArr2[(b10 >> 4) & 15];
            i7 += 2;
            cArr[i10] = cArr2[b10 & 15];
        }
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return new String(cArr);
    }

    public byte[] e() {
        return this.f17415d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            int iC = byteString.c();
            byte[] bArr = this.f17415d;
            if (iC == bArr.length && byteString.g(0, 0, bArr.length, bArr)) {
                return true;
            }
        }
        return false;
    }

    public byte f(int i7) {
        return this.f17415d[i7];
    }

    public boolean g(int i7, int i10, int i11, byte[] other) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (i7 < 0) {
            return false;
        }
        byte[] bArr = this.f17415d;
        return i7 <= bArr.length - i11 && i10 >= 0 && i10 <= other.length - i11 && v.a(i7, i10, i11, bArr, other);
    }

    public boolean h(ByteString other, int i7) {
        Intrinsics.checkNotNullParameter(other, "other");
        return other.g(0, 0, i7, this.f17415d);
    }

    public int hashCode() {
        int i7 = this.f17416e;
        if (i7 != 0) {
            return i7;
        }
        int iHashCode = Arrays.hashCode(this.f17415d);
        this.f17416e = iHashCode;
        return iHashCode;
    }

    public ByteString i() {
        byte b10;
        int i7 = 0;
        while (true) {
            byte[] bArr = this.f17415d;
            if (i7 >= bArr.length) {
                return this;
            }
            byte b11 = bArr[i7];
            byte b12 = (byte) 65;
            if (b11 >= b12 && b11 <= (b10 = (byte) 90)) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(this, size)");
                bArrCopyOf[i7] = (byte) (b11 + 32);
                for (int i10 = i7 + 1; i10 < bArrCopyOf.length; i10++) {
                    byte b13 = bArrCopyOf[i10];
                    if (b13 >= b12 && b13 <= b10) {
                        bArrCopyOf[i10] = (byte) (b13 + 32);
                    }
                }
                return new ByteString(bArrCopyOf);
            }
            i7++;
        }
    }

    public byte[] j() {
        byte[] bArr = this.f17415d;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(this, size)");
        return bArrCopyOf;
    }

    public final String k() {
        String str = this.f17417i;
        if (str != null) {
            return str;
        }
        byte[] bArrE = e();
        Intrinsics.checkNotNullParameter(bArrE, "<this>");
        String str2 = new String(bArrE, Charsets.UTF_8);
        this.f17417i = str2;
        return str2;
    }

    public void l(InflaterOutputStream out) throws IOException {
        Intrinsics.checkNotNullParameter(out, "out");
        out.write(this.f17415d);
    }

    public void m(Buffer buffer, int i7) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        buffer.m1269write(this.f17415d, 0, i7);
    }

    /* JADX WARN: Code duplicated, block: B:179:0x01b6 A[EDGE_INSN: B:179:0x01b6->B:180:0x01b7 BREAK  A[LOOP:0: B:7:0x000e->B:241:0x000e]] */
    public String toString() {
        byte b10;
        int i7;
        byte[] bArr = this.f17415d;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        loop0: while (i10 < length) {
            byte b11 = bArr[i10];
            if (b11 < 0) {
                if ((b11 >> 5) != -2) {
                    if ((b11 >> 4) != -2) {
                        if ((b11 >> 3) != -2) {
                            if (i12 == 64) {
                                break;
                            }
                            i11 = -1;
                            break;
                        }
                        int i13 = i10 + 3;
                        if (length > i13) {
                            byte b12 = bArr[i10 + 1];
                            if ((b12 & 192) != 128) {
                                if (i12 == 64) {
                                    break;
                                }
                                i11 = -1;
                                break;
                            }
                            byte b13 = bArr[i10 + 2];
                            if ((b13 & 192) != 128) {
                                if (i12 == 64) {
                                    break;
                                }
                                i11 = -1;
                                break;
                            }
                            byte b14 = bArr[i13];
                            if ((b14 & 192) != 128) {
                                if (i12 == 64) {
                                    break;
                                }
                                i11 = -1;
                                break;
                            }
                            int i14 = (((b14 ^ ByteCompanionObject.MIN_VALUE) ^ (b13 << 6)) ^ (b12 << 12)) ^ (b11 << 18);
                            if (i14 <= 1114111) {
                                if (55296 <= i14 && i14 < 57344) {
                                    if (i12 == 64) {
                                        break;
                                    }
                                    i11 = -1;
                                    break;
                                }
                                if (i14 >= 65536) {
                                    i7 = i12 + 1;
                                    if (i12 == 64) {
                                        break;
                                    }
                                    if ((i14 != 10 && i14 != 13 && ((i14 >= 0 && i14 < 32) || (127 <= i14 && i14 < 160))) || i14 == 65533) {
                                        i11 = -1;
                                        break;
                                    }
                                    i11 += i14 < 65536 ? 1 : 2;
                                    i10 += 4;
                                    i12 = i7;
                                } else {
                                    if (i12 == 64) {
                                        break;
                                    }
                                    i11 = -1;
                                    break;
                                }
                            } else {
                                if (i12 == 64) {
                                    break;
                                }
                                i11 = -1;
                                break;
                            }
                        } else {
                            if (i12 == 64) {
                                break;
                            }
                            i11 = -1;
                            break;
                        }
                    } else {
                        int i15 = i10 + 2;
                        if (length > i15) {
                            byte b15 = bArr[i10 + 1];
                            if ((b15 & 192) != 128) {
                                if (i12 == 64) {
                                    break;
                                }
                                i11 = -1;
                                break;
                            }
                            byte b16 = bArr[i15];
                            if ((b16 & 192) != 128) {
                                if (i12 == 64) {
                                    break;
                                }
                                i11 = -1;
                                break;
                            }
                            int i16 = ((b16 ^ ByteCompanionObject.MIN_VALUE) ^ (b15 << 6)) ^ (b11 << 12);
                            if (i16 >= 2048) {
                                if (55296 <= i16 && i16 < 57344) {
                                    if (i12 == 64) {
                                        break;
                                    }
                                    i11 = -1;
                                    break;
                                }
                                i7 = i12 + 1;
                                if (i12 == 64) {
                                    break;
                                }
                                if ((i16 != 10 && i16 != 13 && ((i16 >= 0 && i16 < 32) || (127 <= i16 && i16 < 160))) || i16 == 65533) {
                                    i11 = -1;
                                    break;
                                }
                                i11 += i16 < 65536 ? 1 : 2;
                                i10 += 3;
                                i12 = i7;
                            } else {
                                if (i12 == 64) {
                                    break;
                                }
                                i11 = -1;
                                break;
                            }
                        } else {
                            if (i12 == 64) {
                                break;
                            }
                            i11 = -1;
                            break;
                        }
                    }
                } else {
                    int i17 = i10 + 1;
                    if (length > i17) {
                        byte b17 = bArr[i17];
                        if ((b17 & 192) != 128) {
                            if (i12 == 64) {
                                break;
                            }
                            i11 = -1;
                            break;
                        }
                        int i18 = (b17 ^ ByteCompanionObject.MIN_VALUE) ^ (b11 << 6);
                        if (i18 >= 128) {
                            i7 = i12 + 1;
                            if (i12 == 64) {
                                break;
                            }
                            if ((i18 != 10 && i18 != 13 && ((i18 >= 0 && i18 < 32) || (127 <= i18 && i18 < 160))) || i18 == 65533) {
                                i11 = -1;
                                break;
                            }
                            i11 += i18 < 65536 ? 1 : 2;
                            i10 += 2;
                            i12 = i7;
                        } else {
                            if (i12 == 64) {
                                break;
                            }
                            i11 = -1;
                            break;
                        }
                    } else {
                        if (i12 == 64) {
                            break;
                        }
                        i11 = -1;
                        break;
                    }
                }
            } else {
                int i19 = i12 + 1;
                if (i12 == 64) {
                    break;
                }
                if ((b11 == 10 || b11 == 13 || ((b11 < 0 || b11 >= 32) && (127 > b11 || b11 >= 160))) && b11 != 65533) {
                    i11 += b11 < 65536 ? 1 : 2;
                    i10++;
                    while (true) {
                        i12 = i19;
                        if (i10 < length && (b10 = bArr[i10]) >= 0) {
                            i10++;
                            i19 = i12 + 1;
                            if (i12 == 64) {
                                break loop0;
                            }
                            if ((b10 == 10 || b10 == 13 || ((b10 < 0 || b10 >= 32) && (127 > b10 || b10 >= 160))) && b10 != 65533) {
                                i11 += b10 < 65536 ? 1 : 2;
                            }
                        }
                    }
                }
                i11 = -1;
                break;
            }
        }
        if (i11 != -1) {
            String strK = k();
            String strSubstring = strK.substring(0, i11);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            String strL = x.l(x.l(x.l(strSubstring, "\\", "\\\\", false), ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, "\\n", false), "\r", "\\r", false);
            if (i11 >= strK.length()) {
                return kk.b.g(']', "[text=", strL);
            }
            return "[size=" + bArr.length + " text=" + strL + "…]";
        }
        if (bArr.length <= 64) {
            return "[hex=" + d() + ']';
        }
        StringBuilder sb2 = new StringBuilder("[size=");
        sb2.append(bArr.length);
        sb2.append(" hex=");
        Intrinsics.checkNotNullParameter(this, "<this>");
        if (64 > bArr.length) {
            throw new IllegalArgumentException(com.discord.chat.presentation.list.a.j(new StringBuilder("endIndex > length("), bArr.length, ')').toString());
        }
        sb2.append((64 == bArr.length ? this : new ByteString(w.i(bArr, 64))).d());
        sb2.append("…]");
        return sb2.toString();
    }
}
