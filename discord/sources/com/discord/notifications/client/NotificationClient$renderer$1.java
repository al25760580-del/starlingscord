package com.discord.notifications.client;

import android.content.Context;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public /* synthetic */ class NotificationClient$renderer$1 extends FunctionReferenceImpl implements Function1<Context, Map<Integer, ? extends String>> {
    public NotificationClient$renderer$1(Object obj) {
        super(1, obj, NotificationCache.class, "getNotifTypeMappings", "getNotifTypeMappings(Landroid/content/Context;)Ljava/util/Map;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Map<Integer, String> invoke(Context p3) {
        Intrinsics.checkNotNullParameter(p3, "p0");
        return ((NotificationCache) this.receiver).getNotifTypeMappings(p3);
    }
}
