package gc;

import android.content.Context;
import android.os.Looper;
import com.discord.jank_stats.JankRecordStore;
import com.google.android.exoplayer2.audio.AudioAttributes;

/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f9756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final je.y f9757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final app.rive.runtime.kotlin.core.a f9758c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.discord.chat.input.views.d f9759d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public di.j f9760e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public di.j f9761f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public di.j f9762g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Looper f9763h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AudioAttributes f9764i;
    public final int j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final q1 f9765l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f9766m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f9767n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final i f9768o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f9769p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final long f9770q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f9771r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f9772s;

    public m(Context context, b bVar) {
        app.rive.runtime.kotlin.core.a aVar = new app.rive.runtime.kotlin.core.a(28, bVar);
        int i7 = 2;
        com.discord.chat.input.views.d dVar = new com.discord.chat.input.views.d(context, i7);
        com.discord.chat.input.views.d dVar2 = new com.discord.chat.input.views.d(context, 3);
        gb.a aVar2 = new gb.a(i7);
        com.discord.chat.input.views.d dVar3 = new com.discord.chat.input.views.d(context, 4);
        context.getClass();
        this.f9756a = context;
        this.f9758c = aVar;
        this.f9759d = dVar;
        this.f9760e = dVar2;
        this.f9761f = aVar2;
        this.f9762g = dVar3;
        int i10 = je.e0.f13788a;
        Looper looperMyLooper = Looper.myLooper();
        this.f9763h = looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper;
        this.f9764i = AudioAttributes.f5627y;
        this.j = 1;
        this.k = true;
        this.f9765l = q1.f9828c;
        this.f9766m = JankRecordStore.FIRST_FLUSH_DELAY_MS;
        this.f9767n = 15000L;
        this.f9768o = new i(je.e0.I(20L), je.e0.I(500L));
        this.f9757b = je.y.f13866a;
        this.f9769p = 500L;
        this.f9770q = 2000L;
        this.f9771r = true;
    }
}
