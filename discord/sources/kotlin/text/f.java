package kotlin.text;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final e f14718a = new e(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f14719b;

    static {
        Intrinsics.checkNotNullParameter("  ", "groupSeparator");
        Intrinsics.checkNotNullParameter("", "byteSeparator");
        Intrinsics.checkNotNullParameter("", "bytePrefix");
        Intrinsics.checkNotNullParameter("", "byteSuffix");
        f fVar = new f();
        if (!c0.a("  ") && !c0.a("") && !c0.a("")) {
            c0.a("");
        }
        f14719b = fVar;
    }

    public final void a(String indent, StringBuilder sb2) {
        Intrinsics.checkNotNullParameter(sb2, "sb");
        Intrinsics.checkNotNullParameter(indent, "indent");
        sb2.append(indent);
        sb2.append("bytesPerLine = ");
        sb2.append(Integer.MAX_VALUE);
        sb2.append(",");
        sb2.append('\n');
        sb2.append(indent);
        sb2.append("bytesPerGroup = ");
        sb2.append(Integer.MAX_VALUE);
        sb2.append(",");
        sb2.append('\n');
        sb2.append(indent);
        sb2.append("groupSeparator = \"");
        sb2.append("  ");
        sb2.append("\",");
        sb2.append('\n');
        sb2.append(indent);
        sb2.append("byteSeparator = \"");
        sb2.append("");
        sb2.append("\",");
        sb2.append('\n');
        sb2.append(indent);
        sb2.append("bytePrefix = \"");
        sb2.append("");
        sb2.append("\",");
        sb2.append('\n');
        a3.e.A(sb2, indent, "byteSuffix = \"", "", "\"");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("BytesHexFormat(\n");
        a("    ", sb2);
        sb2.append('\n');
        sb2.append(")");
        return sb2.toString();
    }
}
