package com.facebook.react.views.image;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import com.facebook.drawee.controller.ControllerListener;
import com.facebook.drawee.drawable.e;
import com.facebook.react.devsupport.StackTraceHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rn.d;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\t\b\u0010\u0018\u0000 #*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0002$#B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0016\u001a\u0004\u0018\u00018\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0016\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u001b\u0010\u0015J\u001f\u0010\u001e\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010 \u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b \u0010\u001fJ\u0017\u0010!\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lcom/facebook/react/views/image/ReactImageDownloadListener;", "INFO", "Lcom/facebook/drawee/drawable/e;", "Lcom/facebook/drawee/controller/ControllerListener;", "<init>", "()V", "", "loaded", "total", "", "onProgressChange", "(II)V", "level", "", "onLevelChange", "(I)Z", "", StackTraceHelper.ID_KEY, "", "callerContext", "onSubmit", "(Ljava/lang/String;Ljava/lang/Object;)V", "imageInfo", "Landroid/graphics/drawable/Animatable;", "animatable", "onFinalImageSet", "(Ljava/lang/String;Ljava/lang/Object;Landroid/graphics/drawable/Animatable;)V", "onIntermediateImageSet", "", "throwable", "onIntermediateImageFailed", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "onFailure", "onRelease", "(Ljava/lang/String;)V", "Companion", "EmptyDrawable", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class ReactImageDownloadListener<INFO> extends e implements ControllerListener {
    private static final int MAX_LEVEL = 10000;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016J\u0012\u0010\u000b\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u000e\u001a\u00020\nH\u0017¨\u0006\u000f"}, d2 = {"Lcom/facebook/react/views/image/ReactImageDownloadListener$EmptyDrawable;", "Landroid/graphics/drawable/Drawable;", "<init>", "()V", "draw", "", "canvas", "Landroid/graphics/Canvas;", "setAlpha", "alpha", "", "setColorFilter", "colorFilter", "Landroid/graphics/ColorFilter;", "getOpacity", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class EmptyDrawable extends Drawable {
        @Override // android.graphics.drawable.Drawable
        public void draw(@NotNull Canvas canvas) {
            Intrinsics.checkNotNullParameter(canvas, "canvas");
        }

        @Override // android.graphics.drawable.Drawable
        @d
        public int getOpacity() {
            return -1;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int alpha) {
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
        }
    }

    public ReactImageDownloadListener() {
        super(new EmptyDrawable());
    }

    @Override // com.facebook.drawee.controller.ControllerListener
    public void onFailure(@NotNull String id2, @NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
    }

    @Override // com.facebook.drawee.controller.ControllerListener
    public void onFinalImageSet(@NotNull String id2, INFO imageInfo, Animatable animatable) {
        Intrinsics.checkNotNullParameter(id2, "id");
    }

    @Override // com.facebook.drawee.controller.ControllerListener
    public void onIntermediateImageFailed(@NotNull String id2, @NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
    }

    @Override // com.facebook.drawee.controller.ControllerListener
    public void onIntermediateImageSet(@NotNull String id2, INFO imageInfo) {
        Intrinsics.checkNotNullParameter(id2, "id");
    }

    @Override // com.facebook.drawee.drawable.e, android.graphics.drawable.Drawable
    public boolean onLevelChange(int level) {
        onProgressChange(level, MAX_LEVEL);
        return super.onLevelChange(level);
    }

    public void onProgressChange(int loaded, int total) {
    }

    @Override // com.facebook.drawee.controller.ControllerListener
    public void onRelease(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
    }

    @Override // com.facebook.drawee.controller.ControllerListener
    public void onSubmit(@NotNull String id2, Object callerContext) {
        Intrinsics.checkNotNullParameter(id2, "id");
    }
}
