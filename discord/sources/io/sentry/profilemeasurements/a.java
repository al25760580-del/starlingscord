package io.sentry.profilemeasurements;

import com.facebook.imagepipeline.nativecode.c;
import io.sentry.ILogger;
import io.sentry.y1;
import io.sentry.y2;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements y1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ConcurrentHashMap f12893d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f12894e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Collection f12895i;

    public a(String str, AbstractCollection abstractCollection) {
        this.f12894e = str;
        this.f12895i = abstractCollection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return c.r(this.f12893d, aVar.f12893d) && this.f12894e.equals(aVar.f12894e) && new ArrayList(this.f12895i).equals(new ArrayList(aVar.f12895i));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12893d, this.f12894e, this.f12895i});
    }

    @Override // io.sentry.y1
    public final void serialize(y2 y2Var, ILogger iLogger) {
        y2Var.q();
        y2Var.v("unit").r(iLogger, this.f12894e);
        y2Var.v("values").r(iLogger, this.f12895i);
        ConcurrentHashMap concurrentHashMap = this.f12893d;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                com.discord.chat.presentation.list.a.s(this.f12893d, str, y2Var, str, iLogger);
            }
        }
        y2Var.l();
    }
}
