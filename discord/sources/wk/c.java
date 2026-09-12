package wk;

import android.media.MediaFormat;
import com.linkedin.android.litr.io.MediaRange;
import kotlin.jvm.internal.LongCompanionObject;
import vk.e;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uk.a f22326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uk.b f22327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f22328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qk.b f22329d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final qk.b f22330e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final MediaRange f22331f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f22332g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f22333h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f22334i;
    public MediaFormat j;
    public final long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f22335l;

    public c(int i7, int i10, MediaFormat mediaFormat, qk.b bVar, qk.b bVar2, uk.a aVar, uk.b bVar3, e eVar) {
        this.k = -1L;
        this.f22326a = aVar;
        this.f22332g = i7;
        this.f22333h = i10;
        this.f22327b = bVar3;
        this.j = mediaFormat;
        this.f22328c = eVar;
        this.f22329d = bVar;
        this.f22330e = bVar2;
        MediaRange selection = aVar.getSelection();
        this.f22331f = selection;
        MediaFormat trackFormat = aVar.getTrackFormat(i7);
        if (trackFormat.containsKey("durationUs")) {
            long j = trackFormat.getLong("durationUs");
            this.k = j;
            if (mediaFormat != null) {
                mediaFormat.setLong("durationUs", j);
            }
        }
        selection.getClass();
        this.k = Math.min(this.k, LongCompanionObject.MAX_VALUE);
    }

    public static void a(MediaFormat mediaFormat, MediaFormat mediaFormat2) {
        if (!mediaFormat2.containsKey("durationUs") && mediaFormat.containsKey("durationUs")) {
            mediaFormat2.setLong("durationUs", mediaFormat.getLong("durationUs"));
        }
        if (mediaFormat2.containsKey("language") || !mediaFormat.containsKey("language")) {
            return;
        }
        mediaFormat2.setString("language", mediaFormat.getString("language"));
    }

    public final int b() {
        uk.a aVar;
        do {
            aVar = this.f22326a;
            if (aVar.getSampleTrackIndex() != this.f22332g) {
                return 5;
            }
            aVar.advance();
        } while ((aVar.getSampleFlags() & 4) == 0);
        return 4;
    }

    public void c() throws rk.e {
        qk.b bVar = this.f22329d;
        bVar.getClass();
        try {
            bVar.f18918b.getName();
        } catch (IllegalStateException e10) {
            throw new rk.e(7, null, e10);
        }
    }

    public void d() throws rk.e {
        qk.b bVar = this.f22330e;
        bVar.getClass();
        try {
            bVar.f18918b.getName();
        } catch (IllegalStateException e10) {
            throw new rk.e(7, null, e10);
        }
    }

    public abstract int e();

    public abstract void f();

    public abstract void g();
}
