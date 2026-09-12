package com.discord.chat.presentation.message.view.voicemessages;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/discord/chat/presentation/message/view/voicemessages/Sampler;", "", "<init>", "()V", "downSample", "", "data", "targetSize", "", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Sampler {

    @NotNull
    public static final Sampler INSTANCE = new Sampler();

    private Sampler() {
    }

    @NotNull
    public final byte[] downSample(@NotNull byte[] data, int targetSize) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (targetSize == 0) {
            return new byte[0];
        }
        if (data.length == targetSize) {
            return data;
        }
        if (data.length == 0) {
            return new byte[targetSize];
        }
        if (data.length < targetSize) {
            int length = targetSize - data.length;
            byte[] elements = new byte[length];
            Intrinsics.checkNotNullParameter(data, "<this>");
            Intrinsics.checkNotNullParameter(elements, "elements");
            int length2 = data.length;
            byte[] bArrCopyOf = Arrays.copyOf(data, length2 + length);
            System.arraycopy(elements, 0, bArrCopyOf, length2, length);
            Intrinsics.checkNotNull(bArrCopyOf);
            return bArrCopyOf;
        }
        float length3 = data.length / targetSize;
        byte[] bArr = new byte[targetSize];
        int i7 = 0;
        int i10 = 0;
        while (i7 < targetSize) {
            int i11 = i7 + 1;
            int iRint = (int) Math.rint(i11 * length3);
            int iMin = Math.min(iRint, data.length);
            int abs = 0;
            int i12 = 0;
            while (i10 < iMin) {
                abs += SamplerKt.getAbs(data[i10]);
                i12++;
                i10++;
            }
            bArr[i7] = (byte) (abs / i12);
            i7 = i11;
            i10 = iRint;
        }
        return bArr;
    }
}
