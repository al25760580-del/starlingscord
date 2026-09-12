package com.discord.media_player;

import android.content.Context;
import com.google.android.exoplayer2.ext.cronet.CronetDataSource$Factory;
import com.google.android.exoplayer2.upstream.DataSource;
import e4.l;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nc.e;
import org.chromium.net.CronetEngine;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/discord/media_player/CronetDataSourceProvider;", "", "<init>", "()V", "cronetEngine", "Lorg/chromium/net/CronetEngine;", "factory", "Lcom/google/android/exoplayer2/ext/cronet/CronetDataSource$Factory;", "initAttempted", "", "getFactory", "Lcom/google/android/exoplayer2/upstream/DataSource$Factory;", "context", "Landroid/content/Context;", "media_player_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CronetDataSourceProvider {

    @NotNull
    public static final CronetDataSourceProvider INSTANCE = new CronetDataSourceProvider();
    private static CronetEngine cronetEngine;
    private static CronetDataSource$Factory factory;
    private static boolean initAttempted;

    private CronetDataSourceProvider() {
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.exoplayer2.ext.cronet.CronetDataSource$Factory] */
    public final synchronized DataSource.Factory getFactory(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (!initAttempted) {
            initAttempted = true;
            try {
                final CronetEngine cronetEngineBuild = new CronetEngine.Builder(context).enableQuic(true).enableHttp2(true).build();
                cronetEngine = cronetEngineBuild;
                Intrinsics.checkNotNull(cronetEngineBuild);
                final ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
                factory = new DataSource.Factory(cronetEngineBuild, executorServiceNewCachedThreadPool) { // from class: com.google.android.exoplayer2.ext.cronet.CronetDataSource$Factory

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final CronetEngine f5685d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    public final Executor f5686e;

                    /* JADX INFO: renamed from: i, reason: collision with root package name */
                    public final l f5687i;

                    /* JADX INFO: renamed from: v, reason: collision with root package name */
                    public final int f5688v;

                    /* JADX INFO: renamed from: w, reason: collision with root package name */
                    public final int f5689w;

                    /* JADX INFO: renamed from: x, reason: collision with root package name */
                    public final int f5690x;

                    {
                        cronetEngineBuild.getClass();
                        this.f5685d = cronetEngineBuild;
                        this.f5686e = executorServiceNewCachedThreadPool;
                        this.f5687i = new l(7);
                        this.f5688v = 3;
                        this.f5689w = 8000;
                        this.f5690x = 8000;
                    }

                    @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
                    public final DataSource createDataSource() {
                        this.f5685d.getClass();
                        return new e(this.f5685d, this.f5686e, this.f5688v, this.f5689w, this.f5690x, this.f5687i);
                    }
                };
            } catch (Exception unused) {
            }
        }
        return factory;
    }
}
