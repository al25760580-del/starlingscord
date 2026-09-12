package com.discord.media_player;

import android.content.Context;
import com.google.android.exoplayer2.upstream.DataSource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/discord/media_player/HttpEngineFactoryResolver;", "", "<init>", "()V", "init", "", "context", "Landroid/content/Context;", "media_player_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HttpEngineFactoryResolver {

    @NotNull
    public static final HttpEngineFactoryResolver INSTANCE = new HttpEngineFactoryResolver();

    private HttpEngineFactoryResolver() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DataSource.Factory init$lambda$0(Context context, String str) {
        if (str == null) {
            return null;
        }
        int iHashCode = str.hashCode();
        if (iHashCode != -1351984195) {
            if (iHashCode == -1015101340 && str.equals("okhttp")) {
                return OkHttpDataSourceProvider.INSTANCE.getFactory();
            }
            return null;
        }
        if (!str.equals("cronet")) {
            return null;
        }
        CronetDataSourceProvider cronetDataSourceProvider = CronetDataSourceProvider.INSTANCE;
        Intrinsics.checkNotNull(context);
        return cronetDataSourceProvider.getFactory(context);
    }

    public final void init(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        e5.b.f8039b = new com.discord.avatar.react.a(2, context.getApplicationContext());
    }
}
