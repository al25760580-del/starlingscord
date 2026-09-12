package com.facebook.react.views.image;

import android.net.Uri;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0010B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0005H\u0007J\b\u0010\t\u001a\u00020\u0007H\u0007J\u001d\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0000¢\u0006\u0002\b\u000fR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/facebook/react/views/image/ReactImageRequestBuilderHook;", "", "<init>", "()V", "hook", "Lcom/facebook/react/views/image/ReactImageRequestBuilderHook$Hook;", "setHook", "", "newHook", "clearHook", "apply", "sourceUri", "Landroid/net/Uri;", "imageRequestBuilder", "Lcom/facebook/imagepipeline/request/ImageRequestBuilder;", "apply$ReactAndroid_release", "Hook", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactImageRequestBuilderHook {

    @NotNull
    public static final ReactImageRequestBuilderHook INSTANCE = new ReactImageRequestBuilderHook();
    private static volatile Hook hook;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/views/image/ReactImageRequestBuilderHook$Hook;", "", "apply", "", "sourceUri", "Landroid/net/Uri;", "imageRequestBuilder", "Lcom/facebook/imagepipeline/request/ImageRequestBuilder;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Hook {
        void apply(@NotNull Uri sourceUri, @NotNull ImageRequestBuilder imageRequestBuilder);
    }

    private ReactImageRequestBuilderHook() {
    }

    public static final void clearHook() {
        hook = null;
    }

    public static final void setHook(Hook newHook) {
        hook = newHook;
    }

    public final void apply$ReactAndroid_release(@NotNull Uri sourceUri, @NotNull ImageRequestBuilder imageRequestBuilder) {
        Intrinsics.checkNotNullParameter(sourceUri, "sourceUri");
        Intrinsics.checkNotNullParameter(imageRequestBuilder, "imageRequestBuilder");
        Hook hook2 = hook;
        if (hook2 != null) {
            hook2.apply(sourceUri, imageRequestBuilder);
        }
    }
}
