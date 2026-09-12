package com.facebook.react.views.text;

import android.text.Layout;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xa.a;

/* JADX INFO: loaded from: classes3.dex */
@a
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u000f\b\u0001\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011¨\u0006\u0018"}, d2 = {"Lcom/facebook/react/views/text/PreparedLayout;", "", "layout", "Landroid/text/Layout;", "maximumNumberOfLines", "", "verticalOffset", "", "reactTags", "", ViewProps.TEXT_BREAK_STRATEGY, "justificationMode", "<init>", "(Landroid/text/Layout;IF[III)V", "getLayout", "()Landroid/text/Layout;", "getMaximumNumberOfLines", "()I", "getVerticalOffset", "()F", "getReactTags", "()[I", "getTextBreakStrategy", "getJustificationMode", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PreparedLayout {
    private final int justificationMode;

    @NotNull
    private final Layout layout;
    private final int maximumNumberOfLines;

    @NotNull
    private final int[] reactTags;
    private final int textBreakStrategy;
    private final float verticalOffset;

    public PreparedLayout(@NotNull Layout layout, int i7, float f2, @NotNull int[] reactTags, int i10, int i11) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        Intrinsics.checkNotNullParameter(reactTags, "reactTags");
        this.layout = layout;
        this.maximumNumberOfLines = i7;
        this.verticalOffset = f2;
        this.reactTags = reactTags;
        this.textBreakStrategy = i10;
        this.justificationMode = i11;
    }

    public final int getJustificationMode() {
        return this.justificationMode;
    }

    @NotNull
    public final Layout getLayout() {
        return this.layout;
    }

    public final int getMaximumNumberOfLines() {
        return this.maximumNumberOfLines;
    }

    @NotNull
    public final int[] getReactTags() {
        return this.reactTags;
    }

    public final int getTextBreakStrategy() {
        return this.textBreakStrategy;
    }

    public final float getVerticalOffset() {
        return this.verticalOffset;
    }
}
