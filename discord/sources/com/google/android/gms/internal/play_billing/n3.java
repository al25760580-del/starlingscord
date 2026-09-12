package com.google.android.gms.internal.play_billing;

import com.discord.media.utils.DiscordVideoMediaSource;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes3.dex */
public abstract class n3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f6076a = 0;

    static {
        int i7 = q1.f6096a;
    }

    public static int a(String str, byte[] bArr, int i7, int i10) {
        int i11;
        int i12;
        int length;
        int i13;
        char cCharAt;
        int length2 = str.length();
        int i14 = 0;
        while (true) {
            i11 = i7 + i10;
            if (i14 >= length2 || (i13 = i14 + i7) >= i11 || (cCharAt = str.charAt(i14)) >= 128) {
                break;
            }
            bArr[i13] = (byte) cCharAt;
            i14++;
        }
        if (i14 == length2) {
            return i7 + length2;
        }
        int i15 = i7 + i14;
        while (i14 < length2) {
            char cCharAt2 = str.charAt(i14);
            if (cCharAt2 < 128 && i15 < i11) {
                bArr[i15] = (byte) cCharAt2;
                i15++;
            } else if (cCharAt2 < 2048 && i15 <= i11 - 2) {
                bArr[i15] = (byte) ((cCharAt2 >>> 6) | 960);
                bArr[i15 + 1] = (byte) ((cCharAt2 & '?') | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                i15 += 2;
            } else {
                if ((cCharAt2 >= 55296 && cCharAt2 <= 57343) || i15 > i11 - 3) {
                    if (i15 <= i11 - 4) {
                        i14++;
                        if (i14 != str.length()) {
                            char cCharAt3 = str.charAt(i14);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int i16 = i15 + 3;
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                bArr[i15] = (byte) ((codePoint >>> 18) | 240);
                                bArr[i15 + 1] = (byte) (((codePoint >>> 12) & 63) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                                bArr[i15 + 2] = (byte) (((codePoint >>> 6) & 63) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                                i15 += 4;
                                bArr[i16] = (byte) ((codePoint & 63) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                            }
                        }
                        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
                        length = bytes.length;
                        if (length - i7 > i10) {
                            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
                        }
                        System.arraycopy(bytes, 0, bArr, i7, length);
                    } else {
                        if (cCharAt2 < 55296 || cCharAt2 > 57343 || ((i12 = i14 + 1) != str.length() && Character.isSurrogatePair(cCharAt2, str.charAt(i12)))) {
                            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
                        }
                        byte[] bytes2 = str.getBytes(StandardCharsets.UTF_8);
                        length = bytes2.length;
                        if (length - i7 > i10) {
                            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
                        }
                        System.arraycopy(bytes2, 0, bArr, i7, length);
                    }
                    return i7 + length;
                }
                bArr[i15] = (byte) ((cCharAt2 >>> '\f') | DiscordVideoMediaSource.DEFAULT_HEIGHT);
                bArr[i15 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                bArr[i15 + 2] = (byte) ((cCharAt2 & '?') | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                i15 += 3;
            }
            i14++;
        }
        return i15;
    }

    public static boolean b(byte[] bArr, int i7, int i10) {
        while (i7 < i10 && bArr[i7] >= 0) {
            i7++;
        }
        if (i7 >= i10) {
            return true;
        }
        while (i7 < i10) {
            int i11 = i7 + 1;
            byte b10 = bArr[i7];
            if (b10 >= 0) {
                i7 = i11;
            } else {
                if (b10 < -32) {
                    if (i11 < i10 && b10 >= -62) {
                        i7 += 2;
                        if (bArr[i11] > -65) {
                        }
                    }
                    return false;
                }
                if (b10 >= -16) {
                    if (i11 >= i10 - 2) {
                        return false;
                    }
                    int i12 = i7 + 2;
                    byte b11 = bArr[i11];
                    if (b11 <= -65) {
                        if ((((b11 + 112) + (b10 << 28)) >> 30) == 0) {
                            int i13 = i7 + 3;
                            if (bArr[i12] <= -65) {
                                i7 += 4;
                                if (bArr[i13] > -65) {
                                }
                            }
                        }
                    }
                    return false;
                }
                if (i11 >= i10 - 1) {
                    return false;
                }
                int i14 = i7 + 2;
                byte b12 = bArr[i11];
                if (b12 > -65 || (b10 == -32 && b12 < -96)) {
                    return false;
                }
                if (b10 == -19 && b12 >= -96) {
                    return false;
                }
                i7 += 3;
                if (bArr[i14] > -65) {
                    return false;
                }
            }
        }
        return true;
    }
}
