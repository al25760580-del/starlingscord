package r4;

import java.util.List;
import o4.f;
import o4.j;
import o4.n;

/* JADX INFO: loaded from: classes.dex */
public final class a extends fq.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f19198i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i7, List list) {
        super(6, list);
        this.f19198i = i7;
    }

    @Override // r4.e
    public final o4.e l0() {
        switch (this.f19198i) {
            case 0:
                return new f(0, (List) this.f9357e);
            case 1:
                return new j(0, (List) this.f9357e);
            case 2:
                return new f(1, (List) this.f9357e);
            case 3:
                return new j(1, (List) this.f9357e);
            case 4:
                return new j(2, (List) this.f9357e);
            case 5:
                return new n((List) this.f9357e);
            default:
                return new f(2, (List) this.f9357e);
        }
    }
}
