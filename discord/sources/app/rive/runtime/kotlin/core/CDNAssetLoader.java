package app.rive.runtime.kotlin.core;

import android.content.Context;
import app.rive.RiveLog;
import c5.o;
import c5.t;
import gn.h;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import rn.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lapp/rive/runtime/kotlin/core/CDNAssetLoader;", "Lapp/rive/runtime/kotlin/core/FileAssetLoader;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lapp/rive/runtime/kotlin/core/FileAsset;", "asset", "", "inBandBytes", "", "loadContents", "(Lapp/rive/runtime/kotlin/core/FileAsset;[B)Z", "", "TAG", "Ljava/lang/String;", "Lc5/o;", "queue$delegate", "Lkotlin/Lazy;", "getQueue", "()Lc5/o;", "queue", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFileAssetLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileAssetLoader.kt\napp/rive/runtime/kotlin/core/CDNAssetLoader\n+ 2 RiveLog.kt\napp/rive/RiveLog\n*L\n1#1,202:1\n69#2,2:203\n*S KotlinDebug\n*F\n+ 1 FileAssetLoader.kt\napp/rive/runtime/kotlin/core/CDNAssetLoader\n*L\n177#1:203,2\n*E\n"})
public class CDNAssetLoader extends FileAssetLoader {
    public static final int $stable = 8;

    @NotNull
    private final String TAG;

    /* JADX INFO: renamed from: queue$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy queue;

    public CDNAssetLoader(@NotNull final Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.TAG = "RiveL/CDNAssetLoader";
        this.queue = l.b(new Function0<o>() { // from class: app.rive.runtime.kotlin.core.CDNAssetLoader$queue$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final o invoke() {
                return h.H(context);
            }
        });
    }

    private final o getQueue() {
        return (o) this.queue.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadContents$lambda$0(CDNAssetLoader this$0, t tVar) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        RiveLog.INSTANCE.getLogger().e(this$0.TAG, null, new Function0<String>() { // from class: app.rive.runtime.kotlin.core.CDNAssetLoader$loadContents$request$2$1
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return "onAssetLoaded: loading image failed.";
            }
        });
        tVar.printStackTrace();
    }

    @Override // app.rive.runtime.kotlin.core.FileAssetLoader
    public boolean loadContents(@NotNull final FileAsset asset, @NotNull byte[] inBandBytes) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(inBandBytes, "inBandBytes");
        String cdnUrl = asset.getCdnUrl();
        if (cdnUrl.length() == 0) {
            return false;
        }
        getQueue().a(new BytesRequest(cdnUrl, new Function1<byte[], Unit>() { // from class: app.rive.runtime.kotlin.core.CDNAssetLoader$loadContents$request$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((byte[]) obj);
                return Unit.f14616a;
            }

            public final void invoke(@NotNull byte[] bytes) {
                Intrinsics.checkNotNullParameter(bytes, "bytes");
                asset.decode(bytes);
            }
        }, new a(0, this)));
        return true;
    }
}
