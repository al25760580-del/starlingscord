package kotlin.text;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final g f14723d = new g(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j f14724e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f14725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f14726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f14727c;

    static {
        e eVar = f.f14718a;
        eVar.getClass();
        f fVar = f.f14719b;
        h hVar = i.f14720b;
        hVar.getClass();
        i iVar = i.f14721c;
        f14724e = new j(false, fVar, iVar);
        eVar.getClass();
        hVar.getClass();
        new j(true, fVar, iVar);
    }

    public j(boolean z5, f bytes, i number) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        Intrinsics.checkNotNullParameter(number, "number");
        this.f14725a = z5;
        this.f14726b = bytes;
        this.f14727c = number;
    }

    public final String toString() {
        StringBuilder sbN = kk.b.n("HexFormat(\n    upperCase = ");
        sbN.append(this.f14725a);
        sbN.append(",\n    bytes = BytesHexFormat(\n");
        this.f14726b.a("        ", sbN);
        sbN.append('\n');
        sbN.append("    ),");
        sbN.append('\n');
        sbN.append("    number = NumberHexFormat(");
        sbN.append('\n');
        this.f14727c.a("        ", sbN);
        sbN.append('\n');
        sbN.append("    )");
        sbN.append('\n');
        sbN.append(")");
        return sbN.toString();
    }
}
