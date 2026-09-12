package he;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class u implements di.g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10713d;

    @Override // di.g
    public final boolean apply(Object obj) {
        switch (this.f10713d) {
            case 0:
                return ((String) obj) != null;
            default:
                return ((Map.Entry) obj).getKey() != null;
        }
    }
}
