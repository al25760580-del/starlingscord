package ep;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final up.e f8542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f8543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f8544d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f8545e;

    public f0(String internalName, up.e name, String parameters, String returnType) {
        Intrinsics.checkNotNullParameter(internalName, "classInternalName");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(returnType, "returnType");
        this.f8541a = internalName;
        this.f8542b = name;
        this.f8543c = parameters;
        this.f8544d = returnType;
        String jvmDescriptor = name + '(' + parameters + ')' + returnType;
        Intrinsics.checkNotNullParameter(internalName, "internalName");
        Intrinsics.checkNotNullParameter(jvmDescriptor, "jvmDescriptor");
        this.f8545e = internalName + '.' + jvmDescriptor;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return Intrinsics.areEqual(this.f8541a, f0Var.f8541a) && Intrinsics.areEqual(this.f8542b, f0Var.f8542b) && Intrinsics.areEqual(this.f8543c, f0Var.f8543c) && Intrinsics.areEqual(this.f8544d, f0Var.f8544d);
    }

    public final int hashCode() {
        return this.f8544d.hashCode() + a3.e.d((this.f8542b.hashCode() + (this.f8541a.hashCode() * 31)) * 31, 31, this.f8543c);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NameAndSignature(classInternalName=");
        sb2.append(this.f8541a);
        sb2.append(", name=");
        sb2.append(this.f8542b);
        sb2.append(", parameters=");
        sb2.append(this.f8543c);
        sb2.append(", returnType=");
        return s0.g.g(sb2, this.f8544d, ')');
    }
}
