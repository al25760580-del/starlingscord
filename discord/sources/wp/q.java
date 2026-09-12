package wp;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.x;

/* JADX INFO: loaded from: classes3.dex */
public final class q extends s {
    public q() {
        super("HTML", 1);
    }

    @Override // wp.s
    public final String a(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        return x.l(x.l(string, "<", "&lt;", false), ">", "&gt;", false);
    }
}
