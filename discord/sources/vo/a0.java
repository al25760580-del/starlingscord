package vo;

import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a0 extends s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f21786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f21787b;

    public a0(ArrayList underlyingPropertyNamesToTypes) {
        Intrinsics.checkNotNullParameter(underlyingPropertyNamesToTypes, "underlyingPropertyNamesToTypes");
        this.f21786a = underlyingPropertyNamesToTypes;
        this.f21787b = kotlin.collections.w0.l(underlyingPropertyNamesToTypes);
    }

    @Override // vo.s0
    public final boolean a(up.e name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f21787b.containsKey(name);
    }

    public final String toString() {
        return "MultiFieldValueClassRepresentation(underlyingPropertyNamesToTypes=" + this.f21786a + ')';
    }
}
