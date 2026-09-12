package mp;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f16005a;

    public q(int i7) {
        switch (i7) {
            case 1:
                this.f16005a = new LinkedHashMap(0, 0.75f, true);
                break;
            default:
                this.f16005a = new LinkedHashMap();
                break;
        }
    }
}
