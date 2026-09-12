package kotlin.text;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final h f14720b = new h(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f14721c = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f14722a;

    public i() {
        Intrinsics.checkNotNullParameter("", "prefix");
        Intrinsics.checkNotNullParameter("", "suffix");
        this.f14722a = true;
        if (c0.a("")) {
            return;
        }
        c0.a("");
    }

    public final void a(String indent, StringBuilder sb2) {
        Intrinsics.checkNotNullParameter(sb2, "sb");
        Intrinsics.checkNotNullParameter(indent, "indent");
        sb2.append(indent);
        sb2.append("prefix = \"");
        sb2.append("");
        sb2.append("\",");
        sb2.append('\n');
        a3.e.A(sb2, indent, "suffix = \"", "", "\",");
        sb2.append('\n');
        sb2.append(indent);
        sb2.append("removeLeadingZeros = ");
        sb2.append(false);
        sb2.append(',');
        sb2.append('\n');
        sb2.append(indent);
        sb2.append("minLength = ");
        sb2.append(1);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("NumberHexFormat(\n");
        a("    ", sb2);
        sb2.append('\n');
        sb2.append(")");
        return sb2.toString();
    }
}
