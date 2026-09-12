package com.facebook.react.common.network;

import gs.f;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.Dispatcher;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0001H\u0007¨\u0006\t"}, d2 = {"Lcom/facebook/react/common/network/OkHttpCallUtil;", "", "<init>", "()V", "cancelTag", "", "client", "Lokhttp3/OkHttpClient;", "tag", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OkHttpCallUtil {

    @NotNull
    public static final OkHttpCallUtil INSTANCE = new OkHttpCallUtil();

    private OkHttpCallUtil() {
    }

    public static final void cancelTag(@NotNull OkHttpClient client, @NotNull Object tag) {
        List<Call> listUnmodifiableList;
        List<Call> listUnmodifiableList2;
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Dispatcher dispatcher = client.f17337d;
        synchronized (dispatcher) {
            try {
                ArrayDeque arrayDeque = dispatcher.f17316d;
                ArrayList arrayList = new ArrayList(e0.l(arrayDeque, 10));
                Iterator it = arrayDeque.iterator();
                while (it.hasNext()) {
                    arrayList.add(((f) it.next()).f10209i);
                }
                listUnmodifiableList = Collections.unmodifiableList(arrayList);
                Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(readyAsyncCalls.map { it.call })");
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (Call call : listUnmodifiableList) {
            Request requestI = call.i();
            requestI.getClass();
            Intrinsics.checkNotNullParameter(Object.class, "type");
            if (Intrinsics.areEqual(tag, Object.class.cast(requestI.f17372e.get(Object.class)))) {
                call.cancel();
                return;
            }
        }
        synchronized (dispatcher) {
            try {
                ArrayDeque arrayDeque2 = dispatcher.f17318f;
                ArrayDeque arrayDeque3 = dispatcher.f17317e;
                ArrayList arrayList2 = new ArrayList(e0.l(arrayDeque3, 10));
                Iterator it2 = arrayDeque3.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((f) it2.next()).f10209i);
                }
                listUnmodifiableList2 = Collections.unmodifiableList(CollectionsKt.V(arrayDeque2, arrayList2));
                Intrinsics.checkNotNullExpressionValue(listUnmodifiableList2, "unmodifiableList(running…yncCalls.map { it.call })");
            } catch (Throwable th3) {
                throw th3;
            }
        }
        for (Call call2 : listUnmodifiableList2) {
            Request requestI2 = call2.i();
            requestI2.getClass();
            Intrinsics.checkNotNullParameter(Object.class, "type");
            if (Intrinsics.areEqual(tag, Object.class.cast(requestI2.f17372e.get(Object.class)))) {
                call2.cancel();
                return;
            }
        }
    }
}
