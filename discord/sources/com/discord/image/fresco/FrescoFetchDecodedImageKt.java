package com.discord.image.fresco;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import ar.k;
import com.discord.image.fresco.postprocessors.PostProcessor;
import com.facebook.datasource.DataSource;
import com.facebook.imagepipeline.core.DefaultExecutorSupplier;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import ib.a;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuation;
import org.jetbrains.annotations.NotNull;
import rn.q;
import rn.r;
import wn.f;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a=\u0010\t\u001a\u00020\u0007*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0014\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\n\u001a=\u0010\t\u001a\u00020\u0007*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0014\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\f\u001a6\u0010\t\u001a\u0004\u0018\u00010\u0006*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0086@¢\u0006\u0004\b\t\u0010\u000f\u001a6\u0010\t\u001a\u0004\u0018\u00010\u0006*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0086@¢\u0006\u0004\b\t\u0010\u0010\"\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroid/content/Context;", "", "uri", "Lcom/discord/image/fresco/postprocessors/PostProcessor;", "postProcessor", "Lkotlin/Function1;", "Landroid/graphics/Bitmap;", "", "onDecodedImage", "fetchDecodedImage", "(Landroid/content/Context;Ljava/lang/String;Lcom/discord/image/fresco/postprocessors/PostProcessor;Lkotlin/jvm/functions/Function1;)V", "Landroid/net/Uri;", "(Landroid/content/Context;Landroid/net/Uri;Lcom/discord/image/fresco/postprocessors/PostProcessor;Lkotlin/jvm/functions/Function1;)V", "", "copyBitmap", "(Landroid/content/Context;Ljava/lang/String;Lcom/discord/image/fresco/postprocessors/PostProcessor;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Landroid/content/Context;Landroid/net/Uri;Lcom/discord/image/fresco/postprocessors/PostProcessor;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/facebook/imagepipeline/core/DefaultExecutorSupplier;", "executorSupplier", "Lcom/facebook/imagepipeline/core/DefaultExecutorSupplier;", "fresco_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFrescoFetchDecodedImage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FrescoFetchDecodedImage.kt\ncom/discord/image/fresco/FrescoFetchDecodedImageKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Uri.kt\nandroidx/core/net/UriKt\n+ 4 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,111:1\n1#2:112\n29#3:113\n29#3:114\n426#4,11:115\n*S KotlinDebug\n*F\n+ 1 FrescoFetchDecodedImage.kt\ncom/discord/image/fresco/FrescoFetchDecodedImageKt\n*L\n28#1:113\n67#1:114\n76#1:115,11\n*E\n"})
public final class FrescoFetchDecodedImageKt {

    @NotNull
    private static final DefaultExecutorSupplier executorSupplier = new DefaultExecutorSupplier(3);

    public static final void fetchDecodedImage(@NotNull Context context, String str, PostProcessor postProcessor, @NotNull Function1<? super Bitmap, Unit> onDecodedImage) {
        Object objO;
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(onDecodedImage, "onDecodedImage");
        try {
            q qVar = Result.f14614e;
            objO = str != null ? Uri.parse(str) : null;
        } catch (Throwable th2) {
            q qVar2 = Result.f14614e;
            objO = a.o(th2);
        }
        fetchDecodedImage(context, (Uri) (objO instanceof r ? null : objO), postProcessor, onDecodedImage);
    }

    public static /* synthetic */ void fetchDecodedImage$default(Context context, String str, PostProcessor postProcessor, Function1 function1, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            postProcessor = null;
        }
        fetchDecodedImage(context, str, postProcessor, (Function1<? super Bitmap, Unit>) function1);
    }

    public static /* synthetic */ void fetchDecodedImage$default(Context context, Uri uri, PostProcessor postProcessor, Function1 function1, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            postProcessor = null;
        }
        fetchDecodedImage(context, uri, postProcessor, (Function1<? super Bitmap, Unit>) function1);
    }

    public static /* synthetic */ Object fetchDecodedImage$default(Context context, String str, PostProcessor postProcessor, boolean z5, Continuation continuation, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            postProcessor = null;
        }
        if ((i7 & 4) != 0) {
            z5 = false;
        }
        return fetchDecodedImage(context, str, postProcessor, z5, continuation);
    }

    public static /* synthetic */ Object fetchDecodedImage$default(Context context, Uri uri, PostProcessor postProcessor, boolean z5, Continuation continuation, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            postProcessor = null;
        }
        if ((i7 & 4) != 0) {
            z5 = false;
        }
        return fetchDecodedImage(context, uri, postProcessor, z5, continuation);
    }

    public static final void fetchDecodedImage(@NotNull Context context, Uri uri, PostProcessor postProcessor, @NotNull final Function1<? super Bitmap, Unit> onDecodedImage) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(onDecodedImage, "onDecodedImage");
        if (uri == null) {
            onDecodedImage.invoke(null);
            return;
        }
        ImageRequestBuilder imageRequestBuilderD = ImageRequestBuilder.d(uri);
        Intrinsics.checkNotNullExpressionValue(imageRequestBuilderD, "newBuilderWithSource(...)");
        ImageRequestBuilder imageRequestBuilderApplyDiscordDiskCachePolicy = DiskCachePolicyKt.applyDiscordDiskCachePolicy(imageRequestBuilderD, uri);
        imageRequestBuilderApplyDiscordDiskCachePolicy.f5135l = postProcessor != null ? postProcessor.create() : null;
        c9.a.s().a(imageRequestBuilderApplyDiscordDiskCachePolicy.a(), context, null, null, null).d(new ja.a() { // from class: com.discord.image.fresco.FrescoFetchDecodedImageKt.fetchDecodedImage.2
            @Override // x8.b
            public void onFailureImpl(DataSource dataSource) {
                Intrinsics.checkNotNullParameter(dataSource, "dataSource");
                onDecodedImage.invoke(null);
            }

            @Override // ja.a
            public void onNewResultImpl(Bitmap bitmap) {
                onDecodedImage.invoke(bitmap);
            }
        }, executorSupplier.f4825b);
    }

    public static final Object fetchDecodedImage(@NotNull Context context, String str, PostProcessor postProcessor, boolean z5, @NotNull Continuation continuation) {
        Object objO;
        try {
            q qVar = Result.f14614e;
            objO = str != null ? Uri.parse(str) : null;
        } catch (Throwable th2) {
            q qVar2 = Result.f14614e;
            objO = a.o(th2);
        }
        return fetchDecodedImage(context, (Uri) (objO instanceof r ? null : objO), postProcessor, z5, continuation);
    }

    public static final Object fetchDecodedImage(@NotNull Context context, Uri uri, PostProcessor postProcessor, final boolean z5, @NotNull Continuation frame) {
        final k kVar = new k(1, f.b(frame));
        kVar.t();
        if (uri == null) {
            q qVar = Result.f14614e;
            kVar.resumeWith(null);
        } else {
            ImageRequestBuilder imageRequestBuilderD = ImageRequestBuilder.d(uri);
            Intrinsics.checkNotNullExpressionValue(imageRequestBuilderD, "newBuilderWithSource(...)");
            ImageRequestBuilder imageRequestBuilderApplyDiscordDiskCachePolicy = DiskCachePolicyKt.applyDiscordDiskCachePolicy(imageRequestBuilderD, uri);
            imageRequestBuilderApplyDiscordDiskCachePolicy.f5135l = postProcessor != null ? postProcessor.create() : null;
            final x8.a aVarA = c9.a.s().a(imageRequestBuilderApplyDiscordDiskCachePolicy.a(), context, null, null, null);
            aVarA.d(new ja.a() { // from class: com.discord.image.fresco.FrescoFetchDecodedImageKt$fetchDecodedImage$6$subscriber$1
                @Override // x8.b
                public void onFailureImpl(DataSource dataSource) {
                    Intrinsics.checkNotNullParameter(dataSource, "dataSource");
                    CancellableContinuation cancellableContinuation = kVar;
                    q qVar2 = Result.f14614e;
                    cancellableContinuation.resumeWith(null);
                }

                @Override // ja.a
                public void onNewResultImpl(Bitmap bitmap) {
                    CancellableContinuation cancellableContinuation = kVar;
                    q qVar2 = Result.f14614e;
                    if (z5 && bitmap != null) {
                        bitmap = Bitmap.createBitmap(bitmap);
                    }
                    cancellableContinuation.resumeWith(bitmap);
                }
            }, executorSupplier.f4825b);
            kVar.v(new Function1<Throwable, Unit>() { // from class: com.discord.image.fresco.FrescoFetchDecodedImageKt$fetchDecodedImage$6$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Throwable) obj);
                    return Unit.f14616a;
                }

                public final void invoke(Throwable th2) {
                    aVarA.close();
                }
            });
        }
        Object objR = kVar.r();
        if (objR == wn.a.f22354d) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objR;
    }
}
