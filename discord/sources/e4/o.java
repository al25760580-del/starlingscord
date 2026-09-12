package e4;

import androidx.recyclerview.widget.RecyclerView;
import androidx.work.OverwritingInputMerger;
import com.discord.jank_stats.JankRecordStore;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import v3.y;
import v3.z;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z f7999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f8000c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f8001d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public v3.g f8002e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final v3.g f8003f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f8004g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f8005h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f8006i;
    public final v3.e j;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final v3.a f8007l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f8008m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f8009n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f8010o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f8011p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f8012q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public y f8013r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f8014s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f8015t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final long f8016u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f8017v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f8018w;

    static {
        Intrinsics.checkNotNullExpressionValue(v3.q.f("WorkSpec"), "tagWithPrefix(\"WorkSpec\")");
    }

    public o(String id2, z state, String workerClassName, String inputMergerClassName, v3.g input, v3.g output, long j, long j5, long j7, v3.e constraints, int i7, v3.a backoffPolicy, long j10, long j11, long j12, long j13, boolean z5, y outOfQuotaPolicy, int i10, int i11, long j14, int i12, int i13) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(workerClassName, "workerClassName");
        Intrinsics.checkNotNullParameter(inputMergerClassName, "inputMergerClassName");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(constraints, "constraints");
        Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
        Intrinsics.checkNotNullParameter(outOfQuotaPolicy, "outOfQuotaPolicy");
        this.f7998a = id2;
        this.f7999b = state;
        this.f8000c = workerClassName;
        this.f8001d = inputMergerClassName;
        this.f8002e = input;
        this.f8003f = output;
        this.f8004g = j;
        this.f8005h = j5;
        this.f8006i = j7;
        this.j = constraints;
        this.k = i7;
        this.f8007l = backoffPolicy;
        this.f8008m = j10;
        this.f8009n = j11;
        this.f8010o = j12;
        this.f8011p = j13;
        this.f8012q = z5;
        this.f8013r = outOfQuotaPolicy;
        this.f8014s = i10;
        this.f8015t = i11;
        this.f8016u = j14;
        this.f8017v = i12;
        this.f8018w = i13;
    }

    public final long a() {
        z zVar = this.f7999b;
        z zVar2 = z.f21435d;
        int i7 = this.k;
        boolean z5 = zVar == zVar2 && i7 > 0;
        long j = this.f8009n;
        boolean zC = c();
        v3.a backoffPolicy = this.f8007l;
        Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
        long j5 = this.f8016u;
        int i10 = this.f8014s;
        if (j5 != LongCompanionObject.MAX_VALUE && zC) {
            if (i10 != 0) {
                long j7 = j + 900000;
                if (j5 < j7) {
                    return j7;
                }
            }
            return j5;
        }
        if (z5) {
            v3.a aVar = v3.a.f21377e;
            long j10 = this.f8008m;
            long jScalb = backoffPolicy == aVar ? j10 * ((long) i7) : (long) Math.scalb(j10, i7 - 1);
            if (jScalb > 18000000) {
                jScalb = 18000000;
            }
            return j + jScalb;
        }
        long j11 = this.f8004g;
        if (!zC) {
            return j == -1 ? LongCompanionObject.MAX_VALUE : j + j11;
        }
        long j12 = this.f8005h;
        long j13 = i10 == 0 ? j + j11 : j + j12;
        long j14 = this.f8006i;
        return (j14 == j12 || i10 != 0) ? j13 : (j12 - j14) + j13;
    }

    public final boolean b() {
        return !Intrinsics.areEqual(v3.e.f21393i, this.j);
    }

    public final boolean c() {
        return this.f8005h != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Intrinsics.areEqual(this.f7998a, oVar.f7998a) && this.f7999b == oVar.f7999b && Intrinsics.areEqual(this.f8000c, oVar.f8000c) && Intrinsics.areEqual(this.f8001d, oVar.f8001d) && Intrinsics.areEqual(this.f8002e, oVar.f8002e) && Intrinsics.areEqual(this.f8003f, oVar.f8003f) && this.f8004g == oVar.f8004g && this.f8005h == oVar.f8005h && this.f8006i == oVar.f8006i && Intrinsics.areEqual(this.j, oVar.j) && this.k == oVar.k && this.f8007l == oVar.f8007l && this.f8008m == oVar.f8008m && this.f8009n == oVar.f8009n && this.f8010o == oVar.f8010o && this.f8011p == oVar.f8011p && this.f8012q == oVar.f8012q && this.f8013r == oVar.f8013r && this.f8014s == oVar.f8014s && this.f8015t == oVar.f8015t && this.f8016u == oVar.f8016u && this.f8017v == oVar.f8017v && this.f8018w == oVar.f8018w;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [int] */
    /* JADX WARN: Type inference failed for: r2v24, types: [int] */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33 */
    public final int hashCode() {
        int iH = com.discord.chat.presentation.list.a.h(this.f8011p, com.discord.chat.presentation.list.a.h(this.f8010o, com.discord.chat.presentation.list.a.h(this.f8009n, com.discord.chat.presentation.list.a.h(this.f8008m, (this.f8007l.hashCode() + com.discord.chat.presentation.list.a.u(this.k, (this.j.hashCode() + com.discord.chat.presentation.list.a.h(this.f8006i, com.discord.chat.presentation.list.a.h(this.f8005h, com.discord.chat.presentation.list.a.h(this.f8004g, (this.f8003f.hashCode() + ((this.f8002e.hashCode() + a3.e.d(a3.e.d((this.f7999b.hashCode() + (this.f7998a.hashCode() * 31)) * 31, 31, this.f8000c), 31, this.f8001d)) * 31)) * 31, 31), 31), 31)) * 31, 31)) * 31, 31), 31), 31), 31);
        boolean z5 = this.f8012q;
        ?? r5 = z5;
        if (z5) {
            r5 = 1;
        }
        return Integer.hashCode(this.f8018w) + com.discord.chat.presentation.list.a.u(this.f8017v, com.discord.chat.presentation.list.a.h(this.f8016u, com.discord.chat.presentation.list.a.u(this.f8015t, com.discord.chat.presentation.list.a.u(this.f8014s, (this.f8013r.hashCode() + ((iH + r5) * 31)) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        return s0.g.g(new StringBuilder("{WorkSpec: "), this.f7998a, '}');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ o(String str, z zVar, String str2, String str3, v3.g gVar, v3.g gVar2, long j, long j5, long j7, v3.e eVar, int i7, v3.a aVar, long j10, long j11, long j12, long j13, boolean z5, y yVar, int i10, long j14, int i11, int i12, int i13) {
        String str4;
        v3.g gVar3;
        v3.g gVar4;
        z zVar2 = (i13 & 2) != 0 ? z.f21435d : zVar;
        if ((i13 & 8) != 0) {
            String name = OverwritingInputMerger.class.getName();
            Intrinsics.checkNotNullExpressionValue(name, "OverwritingInputMerger::class.java.name");
            str4 = name;
        } else {
            str4 = str3;
        }
        if ((i13 & 16) != 0) {
            v3.g EMPTY = v3.g.f21404c;
            Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
            gVar3 = EMPTY;
        } else {
            gVar3 = gVar;
        }
        if ((i13 & 32) != 0) {
            v3.g EMPTY2 = v3.g.f21404c;
            Intrinsics.checkNotNullExpressionValue(EMPTY2, "EMPTY");
            gVar4 = EMPTY2;
        } else {
            gVar4 = gVar2;
        }
        this(str, zVar2, str2, str4, gVar3, gVar4, (i13 & 64) != 0 ? 0L : j, (i13 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? 0L : j5, (i13 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? 0L : j7, (i13 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? v3.e.f21393i : eVar, (i13 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? 0 : i7, (i13 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? v3.a.f21376d : aVar, (i13 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? JankRecordStore.FLUSH_INTERVAL_MS : j10, (i13 & 8192) != 0 ? -1L : j11, (i13 & 16384) == 0 ? j12 : 0L, (32768 & i13) != 0 ? -1L : j13, (65536 & i13) != 0 ? false : z5, (131072 & i13) != 0 ? y.f21432d : yVar, (262144 & i13) != 0 ? 0 : i10, 0, (1048576 & i13) != 0 ? Long.MAX_VALUE : j14, (2097152 & i13) != 0 ? 0 : i11, (i13 & 4194304) != 0 ? -256 : i12);
    }
}
