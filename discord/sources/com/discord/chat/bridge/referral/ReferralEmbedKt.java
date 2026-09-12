package com.discord.chat.bridge.referral;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import pr.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001a%\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0007\"\u00020\u0004H\u0002¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"hasPrimitive", "", "Lkotlinx/serialization/json/JsonObject;", "key", "", "hasPrimitives", "keys", "", "(Lkotlinx/serialization/json/JsonObject;[Ljava/lang/String;)Z", "chat_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nReferralEmbed.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReferralEmbed.kt\ncom/discord/chat/bridge/referral/ReferralEmbedKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,83:1\n12434#2,2:84\n*S KotlinDebug\n*F\n+ 1 ReferralEmbed.kt\ncom/discord/chat/bridge/referral/ReferralEmbedKt\n*L\n82#1:84,2\n*E\n"})
public final class ReferralEmbedKt {
    private static final boolean hasPrimitive(JsonObject jsonObject, String str) {
        String strA;
        JsonElement jsonElement = (JsonElement) jsonObject.get(str);
        return (jsonElement == null || (strA = h.k(jsonElement).a()) == null || !(StringsKt.K(strA) ^ true)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean hasPrimitives(JsonObject jsonObject, String... strArr) {
        for (String str : strArr) {
            if (!hasPrimitive(jsonObject, str)) {
                return false;
            }
        }
        return true;
    }
}
