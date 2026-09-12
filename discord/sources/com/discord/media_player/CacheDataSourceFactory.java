package com.discord.media_player;

import a5.g;
import android.app.Application;
import android.content.Context;
import android.net.Uri;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.cache.SimpleCache;
import he.n;
import he.p;
import he.z;
import ie.e;
import ie.q;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import m3.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0007\u001a\u00020\bH\u0016J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0006\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/discord/media_player/CacheDataSourceFactory;", "Lcom/google/android/exoplayer2/upstream/DataSource$Factory;", "httpEngine", "Lcom/discord/media_player/HttpEngine;", "<init>", "(Lcom/discord/media_player/HttpEngine;)V", "upstreamFactory", "createDataSource", "Lcom/google/android/exoplayer2/upstream/DataSource;", "buildCacheDataSource", "isDownload", "", "Companion", "media_player_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CacheDataSourceFactory implements DataSource.Factory {

    @NotNull
    private static final String CACHE_DIR_NAME = "app_media_player";
    private static final long CACHE_MAX_SIZE = 104857600;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static Application applicationContext;
    private static SimpleCache cache;
    private static CacheDataSourceFactory cronetFactory;
    private static CacheDataSourceFactory defaultFactory;
    private static CacheDataSourceFactory okHttpFactory;

    @NotNull
    private final DataSource.Factory upstreamFactory;

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0018J\u0010\u0010\u0019\u001a\u00020\t2\b\b\u0002\u0010\u001a\u001a\u00020\u001bJ\u0010\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0013H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/discord/media_player/CacheDataSourceFactory$Companion;", "", "<init>", "()V", "cache", "Lcom/google/android/exoplayer2/upstream/cache/SimpleCache;", "applicationContext", "Landroid/app/Application;", "defaultFactory", "Lcom/discord/media_player/CacheDataSourceFactory;", "okHttpFactory", "cronetFactory", "CACHE_MAX_SIZE", "", "CACHE_DIR_NAME", "", "init", "", "context", "Landroid/content/Context;", "copyVideoToFile", "", "url", "destination", "Ljava/io/File;", "getInstance", "httpEngine", "Lcom/discord/media_player/HttpEngine;", "getSimpleCache", "media_player_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nCacheDataSourceFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CacheDataSourceFactory.kt\ncom/discord/media_player/CacheDataSourceFactory$Companion\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,130:1\n29#2:131\n1#3:132\n*S KotlinDebug\n*F\n+ 1 CacheDataSourceFactory.kt\ncom/discord/media_player/CacheDataSourceFactory$Companion\n*L\n99#1:131\n*E\n"})
    public static final class Companion {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[HttpEngine.values().length];
                try {
                    iArr[HttpEngine.OKHTTP.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[HttpEngine.CRONET.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[HttpEngine.DEFAULT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ CacheDataSourceFactory getInstance$default(Companion companion, HttpEngine httpEngine, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                httpEngine = HttpEngine.DEFAULT;
            }
            return companion.getInstance(httpEngine);
        }

        private final SimpleCache getSimpleCache(Context context) {
            return new SimpleCache(new File(context.getCacheDir(), CacheDataSourceFactory.CACHE_DIR_NAME), new q(), new kc.a(context.getApplicationContext(), "exoplayer_internal.db", null, 1));
        }

        public final boolean copyVideoToFile(@NotNull String url, @NotNull File destination) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(destination, "destination");
            if (CacheDataSourceFactory.cache == null) {
                return false;
            }
            try {
                File parentFile = destination.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                try {
                    n nVar = new n(getInstance$default(this, null, 1, null).buildCacheDataSource(true), new p(Uri.parse(url), 0L, 1, null, Collections.EMPTY_MAP, 0L, -1L, null, 0));
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(destination);
                        try {
                            m.k(nVar, fileOutputStream, 65536);
                            fileOutputStream.close();
                            nVar.close();
                            return true;
                        } catch (Throwable th2) {
                            try {
                                throw th2;
                            } catch (Throwable th3) {
                                ls.d.k(fileOutputStream, th2);
                                throw th3;
                            }
                        }
                    } catch (Throwable th4) {
                        try {
                            throw th4;
                        } catch (Throwable th5) {
                            ls.d.k(nVar, th4);
                            throw th5;
                        }
                    }
                } catch (Exception unused) {
                    destination.delete();
                    return false;
                }
            } catch (Exception unused2) {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final synchronized CacheDataSourceFactory getInstance(@NotNull HttpEngine httpEngine) {
            CacheDataSourceFactory cacheDataSourceFactory;
            CacheDataSourceFactory cacheDataSourceFactory2;
            try {
                Intrinsics.checkNotNullParameter(httpEngine, "httpEngine");
                int i7 = WhenMappings.$EnumSwitchMapping$0[httpEngine.ordinal()];
                cacheDataSourceFactory = null;
                Object[] objArr = 0;
                Object[] objArr2 = 0;
                if (i7 == 1) {
                    cacheDataSourceFactory2 = CacheDataSourceFactory.okHttpFactory;
                    if (cacheDataSourceFactory2 == null) {
                        cacheDataSourceFactory2 = new CacheDataSourceFactory(HttpEngine.OKHTTP, objArr == true ? 1 : 0);
                        CacheDataSourceFactory.okHttpFactory = cacheDataSourceFactory2;
                    }
                } else if (i7 == 2) {
                    cacheDataSourceFactory2 = CacheDataSourceFactory.cronetFactory;
                    if (cacheDataSourceFactory2 == null) {
                        cacheDataSourceFactory2 = new CacheDataSourceFactory(HttpEngine.CRONET, objArr2 == true ? 1 : 0);
                        CacheDataSourceFactory.cronetFactory = cacheDataSourceFactory2;
                    }
                } else {
                    if (i7 != 3) {
                        throw new rn.n();
                    }
                    cacheDataSourceFactory2 = CacheDataSourceFactory.defaultFactory;
                    if (cacheDataSourceFactory2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("defaultFactory");
                    }
                }
                cacheDataSourceFactory = cacheDataSourceFactory2;
            } catch (Throwable th2) {
                throw th2;
            }
            return cacheDataSourceFactory;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void init(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
            CacheDataSourceFactory.applicationContext = (Application) applicationContext;
            CacheDataSourceFactory.cache = getSimpleCache(context);
            CacheDataSourceFactory cacheDataSourceFactory = null;
            CacheDataSourceFactory.defaultFactory = new CacheDataSourceFactory(HttpEngine.DEFAULT, 0 == true ? 1 : 0);
            CacheDataSourceFactory cacheDataSourceFactory2 = CacheDataSourceFactory.defaultFactory;
            if (cacheDataSourceFactory2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("defaultFactory");
            } else {
                cacheDataSourceFactory = cacheDataSourceFactory2;
            }
            e5.b.f8038a = cacheDataSourceFactory;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HttpEngine.values().length];
            try {
                iArr[HttpEngine.OKHTTP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HttpEngine.CRONET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HttpEngine.DEFAULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ CacheDataSourceFactory(HttpEngine httpEngine, DefaultConstructorMarker defaultConstructorMarker) {
        this(httpEngine);
    }

    @NotNull
    public final DataSource buildCacheDataSource(boolean isDownload) {
        int i7 = !isDownload ? 3 : 2;
        SimpleCache simpleCache = cache;
        SimpleCache simpleCache2 = null;
        if (simpleCache == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cache");
            simpleCache = null;
        }
        DataSource dataSourceCreateDataSource = this.upstreamFactory.createDataSource();
        z zVar = new z(false);
        SimpleCache simpleCache3 = cache;
        if (simpleCache3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cache");
        } else {
            simpleCache2 = simpleCache3;
        }
        return new e(simpleCache, dataSourceCreateDataSource, zVar, new ie.d(simpleCache2), i7);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
    @NotNull
    public DataSource createDataSource() {
        return buildCacheDataSource(false);
    }

    private CacheDataSourceFactory(HttpEngine httpEngine) {
        DataSource.Factory factory;
        int i7 = WhenMappings.$EnumSwitchMapping$0[httpEngine.ordinal()];
        if (i7 == 1) {
            factory = OkHttpDataSourceProvider.INSTANCE.getFactory();
            if (factory == null) {
                factory = new g(1);
            }
        } else if (i7 == 2) {
            CronetDataSourceProvider cronetDataSourceProvider = CronetDataSourceProvider.INSTANCE;
            Application application = applicationContext;
            if (application == null) {
                Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
                application = null;
            }
            factory = cronetDataSourceProvider.getFactory(application);
            if (factory == null) {
                factory = new g(1);
            }
        } else {
            if (i7 != 3) {
                throw new rn.n();
            }
            factory = new g(1);
        }
        this.upstreamFactory = factory;
    }
}
