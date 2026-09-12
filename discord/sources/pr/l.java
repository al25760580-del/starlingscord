package pr;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonPrimitive;
import qr.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends JsonPrimitive {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f18530d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f18531e;

    public l(Object body, boolean z5) {
        Intrinsics.checkNotNullParameter(body, "body");
        this.f18530d = z5;
        this.f18531e = body.toString();
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    public final String a() {
        return this.f18531e;
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    public final boolean b() {
        return this.f18530d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        return this.f18530d == lVar.f18530d && Intrinsics.areEqual(this.f18531e, lVar.f18531e);
    }

    public final int hashCode() {
        return this.f18531e.hashCode() + (Boolean.hashCode(this.f18530d) * 31);
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    public final String toString() {
        boolean z5 = this.f18530d;
        String str = this.f18531e;
        if (!z5) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        c0.a(str, sb2);
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
