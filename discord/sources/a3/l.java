package a3;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f87a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f88b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f89c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f90d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f91e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Executor f92f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Executor f93g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public com.discord.chat.input.views.d f94h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f95i;
    public final m j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f96l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f97m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final fj.c f98n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final LinkedHashSet f99o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public HashSet f100p;

    public l(Context context, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(WorkDatabase.class, "klass");
        this.f87a = context;
        this.f88b = str;
        this.f89c = new ArrayList();
        this.f90d = new ArrayList();
        this.f91e = new ArrayList();
        this.j = m.f101d;
        this.k = true;
        this.f97m = -1L;
        this.f98n = new fj.c(1);
        this.f99o = new LinkedHashSet();
    }

    public final void a(b3.a... migrations) {
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        if (this.f100p == null) {
            this.f100p = new HashSet();
        }
        for (b3.a aVar : migrations) {
            HashSet hashSet = this.f100p;
            Intrinsics.checkNotNull(hashSet);
            hashSet.add(Integer.valueOf(aVar.f3055a));
            HashSet hashSet2 = this.f100p;
            Intrinsics.checkNotNull(hashSet2);
            hashSet2.add(Integer.valueOf(aVar.f3056b));
        }
        this.f98n.q((b3.a[]) Arrays.copyOf(migrations, migrations.length));
    }
}
