package com.discord.avatar.decoration;

import android.content.Context;
import android.util.AttributeSet;
import com.discord.image.animated_image.apng.APNGImageView;
import com.discord.image.animated_image.apng.APNGView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\rJ\u0006\u0010\u0015\u001a\u00020\u000fJ\u0006\u0010\u0016\u001a\u00020\u000fJ\u000e\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0019R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/discord/avatar/decoration/DecorationView;", "Lcom/discord/image/animated_image/apng/APNGImageView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "config", "Lcom/discord/image/animated_image/apng/APNGView$Config;", "isDirty", "", "maybeUpdateView", "", "setUrl", "url", "", "setAutoplay", "autoplay", "play", "pause", "seek", "positionMillis", "", "Companion", "avatar_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DecorationView extends APNGImageView {

    @NotNull
    public static final String CACHE_DIRECTORY = "decorations";

    @NotNull
    private APNGView.Config config;
    private boolean isDirty;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DecorationView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void maybeUpdateView() {
        if (this.isDirty) {
            getApngView().loadImage(this.config);
            resetViews(getApngView(), false);
            this.isDirty = false;
        }
    }

    public final void pause() {
        getApngView().pause();
    }

    public final void play() {
        getApngView().play();
    }

    public final void seek(long positionMillis) {
        getApngView().seek(positionMillis);
    }

    public final void setAutoplay(boolean autoplay) {
        if (this.config.getAnimate() == autoplay) {
            return;
        }
        this.config = APNGView.Config.copy$default(this.config, null, autoplay, false, null, null, null, 61, null);
        this.isDirty = true;
    }

    public final void setUrl(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (Intrinsics.areEqual(this.config.getUrl(), url)) {
            return;
        }
        this.config = APNGView.Config.copy$default(this.config, url, false, false, null, null, null, 62, null);
        this.isDirty = true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DecorationView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ DecorationView(Context context, AttributeSet attributeSet, int i7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? 0 : i7);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DecorationView(@NotNull Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        this.config = new APNGView.Config("", true, false, null, null, CACHE_DIRECTORY);
    }
}
