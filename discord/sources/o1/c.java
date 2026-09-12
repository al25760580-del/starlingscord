package o1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class c extends d {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(CharSequence charSequence, String type) {
        super(charSequence, type);
        Intrinsics.checkNotNullParameter(type, "type");
        if (type.length() <= 0) {
            throw new IllegalArgumentException("type must not be empty");
        }
    }
}
