package ip;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lq.z f13314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f13315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f13316c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f13317d;

    public a0(lq.z returnType, List valueParameters, ArrayList typeParameters, List errors) {
        Intrinsics.checkNotNullParameter(returnType, "returnType");
        Intrinsics.checkNotNullParameter(valueParameters, "valueParameters");
        Intrinsics.checkNotNullParameter(typeParameters, "typeParameters");
        Intrinsics.checkNotNullParameter(errors, "errors");
        this.f13314a = returnType;
        this.f13315b = valueParameters;
        this.f13316c = typeParameters;
        this.f13317d = errors;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return Intrinsics.areEqual(this.f13314a, a0Var.f13314a) && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual(this.f13315b, a0Var.f13315b) && Intrinsics.areEqual(this.f13316c, a0Var.f13316c) && Intrinsics.areEqual(this.f13317d, a0Var.f13317d);
    }

    public final int hashCode() {
        return this.f13317d.hashCode() + com.discord.chat.presentation.list.a.g((this.f13316c.hashCode() + a3.e.f(this.f13315b, this.f13314a.hashCode() * 961, 31)) * 31, 31, false);
    }

    public final String toString() {
        return "MethodSignatureData(returnType=" + this.f13314a + ", receiverType=null, valueParameters=" + this.f13315b + ", typeParameters=" + this.f13316c + ", hasStableParameterNames=false, errors=" + this.f13317d + ')';
    }
}
