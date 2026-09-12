package com.discord.span.utilities.common;

import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import s0.g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/discord/span/utilities/common/BorderStyle;", "", ViewProps.COLOR, "", "width", "<init>", "(II)V", "getColor", "()I", "getWidth", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "span_utilities_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class BorderStyle {
    private final int color;
    private final int width;

    public BorderStyle(int i7, int i10) {
        this.color = i7;
        this.width = i10;
    }

    public static /* synthetic */ BorderStyle copy$default(BorderStyle borderStyle, int i7, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i7 = borderStyle.color;
        }
        if ((i11 & 2) != 0) {
            i10 = borderStyle.width;
        }
        return borderStyle.copy(i7, i10);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    @NotNull
    public final BorderStyle copy(int color, int width) {
        return new BorderStyle(color, width);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BorderStyle)) {
            return false;
        }
        BorderStyle borderStyle = (BorderStyle) other;
        return this.color == borderStyle.color && this.width == borderStyle.width;
    }

    public final int getColor() {
        return this.color;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return Integer.hashCode(this.width) + (Integer.hashCode(this.color) * 31);
    }

    @NotNull
    public String toString() {
        return g.c(this.color, "BorderStyle(color=", this.width, ", width=", ")");
    }
}
