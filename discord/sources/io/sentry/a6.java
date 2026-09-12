package io.sentry;

import com.discord.jank_stats.JankRecordStore;
import com.discord.misc.utilities.logThrottle.LogThrottleSingleton;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes3.dex */
public final class a6 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final List f12048u = Collections.unmodifiableList(Arrays.asList("Content-Type", "Content-Length", "Accept"));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Double f12049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Double f12050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArraySet f12051c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArraySet f12052d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f12053e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f12054f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public z5 f12055g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f12056h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f12057i;
    public final long j;
    public final long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f12058l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public io.sentry.protocol.t f12059m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f12060n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public w3 f12061o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public List f12062p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public List f12063q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f12064r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public List f12065s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public List f12066t;

    public a6(boolean z5, io.sentry.protocol.t tVar) {
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        this.f12051c = copyOnWriteArraySet;
        this.f12052d = new CopyOnWriteArraySet();
        this.f12053e = null;
        this.f12054f = null;
        this.f12055g = z5.MEDIUM;
        this.f12056h = 1;
        this.f12057i = JankRecordStore.FLUSH_INTERVAL_MS;
        this.j = JankRecordStore.FIRST_FLUSH_DELAY_MS;
        this.k = LogThrottleSingleton.RATE_LIMIT_ONE_HOUR;
        this.f12058l = true;
        this.f12060n = false;
        this.f12061o = w3.PIXEL_COPY;
        List list = Collections.EMPTY_LIST;
        this.f12062p = list;
        this.f12063q = list;
        this.f12064r = true;
        List list2 = f12048u;
        this.f12065s = list2;
        this.f12066t = list2;
        if (z5) {
            return;
        }
        j(true);
        i(true);
        copyOnWriteArraySet.add("android.webkit.WebView");
        copyOnWriteArraySet.add("android.widget.VideoView");
        copyOnWriteArraySet.add("androidx.media3.ui.PlayerView");
        copyOnWriteArraySet.add("com.google.android.exoplayer2.ui.PlayerView");
        copyOnWriteArraySet.add("com.google.android.exoplayer2.ui.StyledPlayerView");
        this.f12059m = tVar;
    }

    public final List a() {
        return this.f12062p;
    }

    public final List b() {
        return this.f12063q;
    }

    public final List c() {
        return this.f12065s;
    }

    public final List d() {
        return this.f12066t;
    }

    public final Double e() {
        return this.f12050b;
    }

    public final Double f() {
        return this.f12049a;
    }

    public final boolean g() {
        return this.f12064r;
    }

    public final void h(boolean z5) {
        this.f12060n = z5;
    }

    public final void i(boolean z5) {
        CopyOnWriteArraySet copyOnWriteArraySet = this.f12052d;
        CopyOnWriteArraySet copyOnWriteArraySet2 = this.f12051c;
        if (z5) {
            copyOnWriteArraySet2.add("android.widget.ImageView");
            copyOnWriteArraySet.remove("android.widget.ImageView");
        } else {
            copyOnWriteArraySet.add("android.widget.ImageView");
            copyOnWriteArraySet2.remove("android.widget.ImageView");
        }
    }

    public final void j(boolean z5) {
        CopyOnWriteArraySet copyOnWriteArraySet = this.f12052d;
        CopyOnWriteArraySet copyOnWriteArraySet2 = this.f12051c;
        if (z5) {
            copyOnWriteArraySet2.add("android.widget.TextView");
            copyOnWriteArraySet.remove("android.widget.TextView");
        } else {
            copyOnWriteArraySet.add("android.widget.TextView");
            copyOnWriteArraySet2.remove("android.widget.TextView");
        }
    }

    public final void k(boolean z5) {
        this.f12064r = z5;
    }

    public final void l(ArrayList arrayList) {
        this.f12062p = Collections.unmodifiableList(new ArrayList(arrayList));
    }

    public final void m(ArrayList arrayList) {
        this.f12063q = Collections.unmodifiableList(new ArrayList(arrayList));
    }

    public final void n(ArrayList arrayList) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(f12048u);
        linkedHashSet.addAll(arrayList);
        this.f12065s = Collections.unmodifiableList(new ArrayList(linkedHashSet));
    }

    public final void o(ArrayList arrayList) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(f12048u);
        linkedHashSet.addAll(arrayList);
        this.f12066t = Collections.unmodifiableList(new ArrayList(linkedHashSet));
    }

    public final void p(Double d6) {
        if (e4.f.e0(d6, true)) {
            this.f12050b = d6;
            return;
        }
        throw new IllegalArgumentException("The value " + d6 + " is not valid. Use null to disable or values >= 0.0 and <= 1.0.");
    }

    public final void q(Double d6) {
        if (e4.f.e0(d6, true)) {
            this.f12049a = d6;
            return;
        }
        throw new IllegalArgumentException("The value " + d6 + " is not valid. Use null to disable or values >= 0.0 and <= 1.0.");
    }
}
