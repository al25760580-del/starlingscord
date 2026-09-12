package io.sentry.cache;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12538d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g f12539e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Map f12540i;

    public /* synthetic */ f(g gVar, Map map, int i7) {
        this.f12538d = i7;
        this.f12539e = gVar;
        this.f12540i = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12538d) {
            case 0:
                this.f12539e.r(this.f12540i, "tags.json");
                break;
            default:
                this.f12539e.r(this.f12540i, "extras.json");
                break;
        }
    }
}
