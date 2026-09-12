package zp;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class y extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lq.z f24076c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(List value, lq.z type) {
        super(value, new bp.i(27, type));
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f24076c = type;
    }
}
