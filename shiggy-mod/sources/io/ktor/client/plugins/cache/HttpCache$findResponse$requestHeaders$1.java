package io.ktor.client.plugins.cache;

import androidx.constraintlayout.widget.ConstraintLayout;
import io.ktor.http.Headers;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HttpCache.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
final /* synthetic */ class HttpCache$findResponse$requestHeaders$1 extends FunctionReferenceImpl implements Function1<String, String> {
    HttpCache$findResponse$requestHeaders$1(Object obj) {
        super(1, obj, Headers.class, "get", "get(Ljava/lang/String;)Ljava/lang/String;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final String invoke(String p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((Headers) this.receiver).get(p0);
    }
}
