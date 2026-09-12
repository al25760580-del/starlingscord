package o1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class k extends l {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f17100i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(CharSequence charSequence, String type) {
        super(charSequence, type);
        Intrinsics.checkNotNullParameter(type, "type");
        this.f17100i = type;
        if (type.length() <= 0) {
            throw new IllegalArgumentException("type must not be empty");
        }
    }

    @Override // o1.l
    public final String a() {
        return this.f17100i;
    }
}
