package com.discord.chat.presentation.message.view.voicemessages;

import kotlin.Metadata;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"abs", "", "getAbs", "(B)B", "chat_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class SamplerKt {
    public static final byte getAbs(byte b10) {
        if (b10 == -128) {
            return ByteCompanionObject.MAX_VALUE;
        }
        return (-127 > b10 || b10 >= 1) ? b10 : (byte) (-b10);
    }
}
