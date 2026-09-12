package com.discord.core;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Size;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import ar.b0;
import com.discord.crash_reporting.CrashReporting;
import com.discord.misc.utilities.coroutines.CoroutineViewUtilsKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder;
import com.facebook.drawee.drawable.o;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.w0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import wn.a;
import xn.d;
import xn.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\f\u0010\u000e\u001a\u00020\u000f*\u00020\u0010H\u0002J\u001e\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0007J\u0010\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0014\u0010\u0019\u001a\u00020\u000f*\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/discord/core/LocalImageThumbnailView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "imageView", "Landroid/widget/ImageView;", "simpleDraweeView", "Lcom/facebook/drawee/view/SimpleDraweeView;", "addToParent", "", "Landroid/view/View;", "setLocalImageSource", "uri", "Landroid/net/Uri;", "widthDp", "heightDp", "toggleImages", "showSimpleDraweeView", "", "loadDefaultBitmap", "Companion", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLocalImageThumbnailView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalImageThumbnailView.kt\ncom/discord/core/LocalImageThumbnailView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,116:1\n257#2,2:117\n257#2,2:119\n*S KotlinDebug\n*F\n+ 1 LocalImageThumbnailView.kt\ncom/discord/core/LocalImageThumbnailView\n*L\n97#1:117,2\n98#1:119,2\n*E\n"})
public final class LocalImageThumbnailView extends FrameLayout {
    private static final int DEFAULT_SIZE = 200;

    @NotNull
    private ImageView imageView;

    @NotNull
    private SimpleDraweeView simpleDraweeView;

    /* JADX INFO: renamed from: com.discord.core.LocalImageThumbnailView$setLocalImageSource$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @d(c = "com.discord.core.LocalImageThumbnailView$setLocalImageSource$1", f = "LocalImageThumbnailView.kt", l = {65}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ int $heightDp;
        final /* synthetic */ Uri $uri;
        final /* synthetic */ int $widthDp;
        int label;
        final /* synthetic */ LocalImageThumbnailView this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i7, int i10, LocalImageThumbnailView localImageThumbnailView, Uri uri, Continuation continuation) {
            super(2, continuation);
            this.$widthDp = i7;
            this.$heightDp = i10;
            this.this$0 = localImageThumbnailView;
            this.$uri = uri;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$widthDp, this.$heightDp, this.this$0, this.$uri, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f22354d;
            int i7 = this.label;
            try {
                if (i7 == 0) {
                    ib.a.L(obj);
                    int dpToPx = SizeUtilsKt.getDpToPx(this.$widthDp);
                    int dpToPx2 = SizeUtilsKt.getDpToPx(this.$heightDp);
                    Size size = (dpToPx == 0 || dpToPx2 == 0) ? new Size(200, 200) : new Size(dpToPx, dpToPx2);
                    ThumbnailLoader thumbnailLoader = ThumbnailLoader.INSTANCE;
                    Context context = this.this$0.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    Uri uri = this.$uri;
                    this.label = 1;
                    obj = thumbnailLoader.loadThumbnail(context, uri, size, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ib.a.L(obj);
                }
                Bitmap bitmap = (Bitmap) obj;
                boolean z5 = (bitmap != null ? bitmap.getAllocationByteCount() : 0) == 0;
                this.this$0.toggleImages(z5);
                if (z5) {
                    LocalImageThumbnailView localImageThumbnailView = this.this$0;
                    localImageThumbnailView.loadDefaultBitmap(localImageThumbnailView.simpleDraweeView, this.$uri);
                } else {
                    this.this$0.imageView.setImageBitmap(bitmap);
                }
            } catch (Exception e10) {
                CrashReporting.addBreadcrumb$default(CrashReporting.INSTANCE, "DCDLocalImageThumbnail - Failed to load thumbnail", w0.g(new Pair("exception", e10.toString()), new Pair("url", this.$uri.toString())), null, null, false, 28, null);
                this.this$0.toggleImages(true);
                LocalImageThumbnailView localImageThumbnailView2 = this.this$0;
                localImageThumbnailView2.loadDefaultBitmap(localImageThumbnailView2.simpleDraweeView, this.$uri);
            }
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LocalImageThumbnailView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void addToParent(View view) {
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadDefaultBitmap(SimpleDraweeView simpleDraweeView, Uri uri) {
        PipelineDraweeControllerBuilder pipelineDraweeControllerBuilder = c9.a.f3531a.get();
        ImageRequestBuilder imageRequestBuilderD = ImageRequestBuilder.d(uri);
        int width = simpleDraweeView.getWidth();
        int height = simpleDraweeView.getHeight();
        imageRequestBuilderD.f5129d = (width <= 0 || height <= 0) ? null : new ResizeOptions(width, height);
        pipelineDraweeControllerBuilder.f4633b = imageRequestBuilderD.a();
        simpleDraweeView.setController(pipelineDraweeControllerBuilder.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void toggleImages(boolean showSimpleDraweeView) {
        this.simpleDraweeView.setVisibility(showSimpleDraweeView ? 0 : 8);
        this.imageView.setVisibility(showSimpleDraweeView ? 8 : 0);
    }

    public final void setLocalImageSource(@NotNull Uri uri, int widthDp, int heightDp) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        b0.t(CoroutineViewUtilsKt.getAttachedScope(this), null, new AnonymousClass1(widthDp, heightDp, this, uri, null), 3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LocalImageThumbnailView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ LocalImageThumbnailView(Context context, AttributeSet attributeSet, int i7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? 0 : i7);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalImageThumbnailView(@NotNull Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        ImageView imageView = new ImageView(context);
        addToParent(imageView);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.imageView = imageView;
        SimpleDraweeView simpleDraweeView = new SimpleDraweeView(context);
        addToParent(simpleDraweeView);
        ((GenericDraweeHierarchy) simpleDraweeView.getHierarchy()).j(o.f4689c);
        this.simpleDraweeView = simpleDraweeView;
    }
}
