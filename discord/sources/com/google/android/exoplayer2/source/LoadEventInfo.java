package com.google.android.exoplayer2.source;

import android.net.Uri;
import he.p;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public final class LoadEventInfo {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicLong f5695c = new AtomicLong();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f5696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f5697b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoadEventInfo(p pVar) {
        this(0L, Collections.EMPTY_MAP);
        Uri uri = pVar.f10649a;
    }

    public LoadEventInfo(long j, Map map) {
        this.f5696a = map;
        this.f5697b = j;
    }
}
