package kotlin.coroutines;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e {
    public static CoroutineContext.Element a(CoroutineContext.Element element, f key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (!Intrinsics.areEqual(element.getKey(), key)) {
            return null;
        }
        Intrinsics.checkNotNull(element, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
        return element;
    }

    public static CoroutineContext b(CoroutineContext.Element element, f key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return Intrinsics.areEqual(element.getKey(), key) ? g.f14681d : element;
    }

    public static CoroutineContext c(CoroutineContext.Element element, CoroutineContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        return context == g.f14681d ? element : (CoroutineContext) context.Y(element, new ol.c(5));
    }
}
