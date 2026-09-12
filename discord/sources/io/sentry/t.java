package io.sentry;

import io.sentry.android.replay.ReplayCache;
import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class t implements FilenameFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13153b;

    public /* synthetic */ t(int i7, Object obj) {
        this.f13152a = i7;
        this.f13153b = obj;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        switch (this.f13152a) {
            case 0:
                return ((v) this.f13153b).a(str);
            default:
                return ReplayCache.Companion.fromDisk$lambda$3((ReplayCache) this.f13153b, file, str);
        }
    }
}
