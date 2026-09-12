package com.discord.thumbhash;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import c9.a;
import com.discord.theme.ThemeManagerKt;
import com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import f9.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0010\u0010\u0010\u001a\u00020\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\tJ\u0015\u0010\u0011\u001a\u00020\u000f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\tJ\u0006\u0010\u0015\u001a\u00020\u000fR\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\r¨\u0006\u0016"}, d2 = {"Lcom/discord/thumbhash/ImageWithThumbhashPlaceholderView;", "Lcom/facebook/drawee/view/SimpleDraweeView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "uri", "", "placeholder", "placeholderVersion", "", "Ljava/lang/Integer;", "setUri", "", "setPlaceholder", "setPlaceholderVersion", "(Ljava/lang/Integer;)V", "setAlt", "alt", "update", "thumbhash_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nImageWithThumbhashPlaceholderView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageWithThumbhashPlaceholderView.kt\ncom/discord/thumbhash/ImageWithThumbhashPlaceholderView\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n+ 3 ColorDrawable.kt\nandroidx/core/graphics/drawable/ColorDrawableKt\n*L\n1#1,68:1\n29#2:69\n27#3:70\n*S KotlinDebug\n*F\n+ 1 ImageWithThumbhashPlaceholderView.kt\ncom/discord/thumbhash/ImageWithThumbhashPlaceholderView\n*L\n52#1:69\n59#1:70\n*E\n"})
public final class ImageWithThumbhashPlaceholderView extends SimpleDraweeView {
    private String placeholder;
    private Integer placeholderVersion;
    private String uri;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ImageWithThumbhashPlaceholderView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setAlt(String alt) {
        setContentDescription(alt);
    }

    public final void setPlaceholder(String placeholder) {
        this.placeholder = placeholder;
        update();
    }

    public final void setPlaceholderVersion(Integer placeholderVersion) {
        this.placeholderVersion = placeholderVersion;
        update();
    }

    public final void setUri(String uri) {
        this.uri = uri;
        update();
    }

    public final void update() {
        String str = this.uri;
        if (str == null) {
            return;
        }
        ImageRequestBuilder imageRequestBuilderD = ImageRequestBuilder.d(Uri.parse(str));
        PipelineDraweeControllerBuilder pipelineDraweeControllerBuilder = a.f3531a.get();
        pipelineDraweeControllerBuilder.f4633b = imageRequestBuilderD.a();
        pipelineDraweeControllerBuilder.f4635d = new ThumbhashPlaceholderControllerListener(this, new ColorDrawable(ThemeManagerKt.getTheme().getBackgroundSurfaceHigh()), this.placeholder, this.placeholderVersion);
        c cVarA = pipelineDraweeControllerBuilder.a();
        Intrinsics.checkNotNullExpressionValue(cVarA, "build(...)");
        setController(cVarA);
    }

    public /* synthetic */ ImageWithThumbhashPlaceholderView(Context context, AttributeSet attributeSet, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i7 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageWithThumbhashPlaceholderView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
