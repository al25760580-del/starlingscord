package qs;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class e extends fs.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f19078e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g f19079f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String str, g gVar) {
        super(str, true);
        this.f19079f = gVar;
    }

    @Override // fs.a
    public final long a() {
        switch (this.f19078e) {
            case 0:
                g gVar = this.f19079f;
                try {
                    return gVar.k() ? 0L : -1L;
                } catch (IOException e10) {
                    gVar.f(e10, null);
                }
                break;
            default:
                gs.i iVar = this.f19079f.f19089g;
                Intrinsics.checkNotNull(iVar);
                iVar.cancel();
                return -1L;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g this$0) {
        super(Intrinsics.stringPlus(this$0.f19092l, " writer"), true);
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this.f19079f = this$0;
    }
}
