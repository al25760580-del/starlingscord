package com.discord.span.utilities.spannable;

import com.discord.span.utilities.common.BackgroundStyle;
import com.discord.span.utilities.common.BorderStyle;
import com.discord.span.utilities.common.ShadowStyle;
import com.facebook.react.modules.appstate.AppStateModule;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/discord/span/utilities/spannable/BackgroundSpan;", "", AppStateModule.APP_STATE_BACKGROUND, "Lcom/discord/span/utilities/common/BackgroundStyle;", "border", "Lcom/discord/span/utilities/common/BorderStyle;", "shadow", "Lcom/discord/span/utilities/common/ShadowStyle;", "<init>", "(Lcom/discord/span/utilities/common/BackgroundStyle;Lcom/discord/span/utilities/common/BorderStyle;Lcom/discord/span/utilities/common/ShadowStyle;)V", "getBackground", "()Lcom/discord/span/utilities/common/BackgroundStyle;", "getBorder", "()Lcom/discord/span/utilities/common/BorderStyle;", "getShadow", "()Lcom/discord/span/utilities/common/ShadowStyle;", "span_utilities_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class BackgroundSpan {

    @NotNull
    private final BackgroundStyle background;
    private final BorderStyle border;
    private final ShadowStyle shadow;

    public BackgroundSpan(@NotNull BackgroundStyle background, BorderStyle borderStyle, ShadowStyle shadowStyle) {
        Intrinsics.checkNotNullParameter(background, "background");
        this.background = background;
        this.border = borderStyle;
        this.shadow = shadowStyle;
    }

    @NotNull
    public final BackgroundStyle getBackground() {
        return this.background;
    }

    public final BorderStyle getBorder() {
        return this.border;
    }

    public final ShadowStyle getShadow() {
        return this.shadow;
    }

    public /* synthetic */ BackgroundSpan(BackgroundStyle backgroundStyle, BorderStyle borderStyle, ShadowStyle shadowStyle, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(backgroundStyle, (i7 & 2) != 0 ? null : borderStyle, (i7 & 4) != 0 ? null : shadowStyle);
    }
}
