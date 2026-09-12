package com.discord.tti_manager;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import ls.d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0002"}, d2 = {"json", "Lkotlinx/serialization/json/Json;", "tti_manager_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class TTIBroadcastReceiverKt {

    @NotNull
    private static final Json json = d.e(new com.discord.emoji.a(28));

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit json$lambda$0(JsonBuilder Json) {
        Intrinsics.checkNotNullParameter(Json, "$this$Json");
        Json.f14765b = true;
        return Unit.f14616a;
    }
}
