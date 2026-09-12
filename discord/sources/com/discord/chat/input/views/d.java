package com.discord.chat.input.views;

import a5.g;
import android.content.ClipData;
import android.content.Context;
import androidx.core.util.Predicate;
import com.discord.crash_reporting.CrashReporting;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import di.j;
import ei.r0;
import h3.h;
import he.s;
import io.sentry.Hint;
import io.sentry.SentryEvent;
import io.sentry.android.core.u0;
import io.sentry.j5;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import je.y;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Predicate, j5, j, io.sentry.util.runtime.a, g3.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4078d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f4079e;

    public /* synthetic */ d(Context context, int i7) {
        this.f4078d = i7;
        this.f4079e = context;
    }

    @Override // io.sentry.j5
    public SentryEvent a(SentryEvent sentryEvent, Hint hint) {
        return CrashReporting.init$lambda$3$lambda$0(this.f4079e, sentryEvent, hint);
    }

    @Override // g3.c
    public g3.d d(g3.b configuration) {
        Context context = this.f4079e;
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        String str = (String) configuration.f9464d;
        a1.d callback = (a1.d) configuration.f9465e;
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (callback == null) {
            throw new IllegalArgumentException("Must set a callback to create the configuration.");
        }
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
        }
        Intrinsics.checkNotNullParameter(new g3.b(context, str, callback, true, true), "configuration");
        return new h(context, str, callback, true, true);
    }

    @Override // di.j
    public Object get() {
        s sVar;
        switch (this.f4078d) {
            case 2:
                Context context = this.f4079e;
                new g(1);
                context.getApplicationContext();
                md.h hVar = new md.h();
                HashMap map = new HashMap();
                new HashSet();
                HashMap map2 = new HashMap();
                map.clear();
                map2.clear();
                return hVar;
            case 3:
                return new DefaultTrackSelector(this.f4079e);
            default:
                Context context2 = this.f4079e;
                r0 r0Var = s.f10680n;
                synchronized (s.class) {
                    try {
                        if (s.f10686t == null) {
                            bd.c cVar = new bd.c(context2);
                            s.f10686t = new s((Context) cVar.f3134i, (HashMap) cVar.f3135v, cVar.f3132d, (y) cVar.f3136w, cVar.f3133e);
                        }
                        sVar = s.f10686t;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return sVar;
        }
    }

    @Override // io.sentry.util.runtime.a
    public Object run() {
        switch (this.f4078d) {
            case 5:
                return new File(this.f4079e.getCacheDir(), "sentry").getAbsolutePath();
            case 6:
                return u0.a(this.f4079e);
            default:
                return u0.a(this.f4079e);
        }
    }

    @Override // androidx.core.util.Predicate
    public boolean test(Object obj) {
        return ChatInputRootView.lambda$8$lambda$4(this.f4079e, (ClipData.Item) obj);
    }
}
