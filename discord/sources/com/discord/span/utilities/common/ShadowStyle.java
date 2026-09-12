package com.discord.span.utilities.common;

import a3.e;
import android.util.SizeF;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/discord/span/utilities/common/ShadowStyle;", "", ViewProps.COLOR, "", "radius", "", "offset", "Landroid/util/SizeF;", "<init>", "(IFLandroid/util/SizeF;)V", "getColor", "()I", "getRadius", "()F", "getOffset", "()Landroid/util/SizeF;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "span_utilities_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ShadowStyle {
    private final int color;

    @NotNull
    private final SizeF offset;
    private final float radius;

    public ShadowStyle(int i7, float f2, @NotNull SizeF offset) {
        Intrinsics.checkNotNullParameter(offset, "offset");
        this.color = i7;
        this.radius = f2;
        this.offset = offset;
    }

    public static /* synthetic */ ShadowStyle copy$default(ShadowStyle shadowStyle, int i7, float f2, SizeF sizeF, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i7 = shadowStyle.color;
        }
        if ((i10 & 2) != 0) {
            f2 = shadowStyle.radius;
        }
        if ((i10 & 4) != 0) {
            sizeF = shadowStyle.offset;
        }
        return shadowStyle.copy(i7, f2, sizeF);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getRadius() {
        return this.radius;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final SizeF getOffset() {
        return this.offset;
    }

    @NotNull
    public final ShadowStyle copy(int color, float radius, @NotNull SizeF offset) {
        Intrinsics.checkNotNullParameter(offset, "offset");
        return new ShadowStyle(color, radius, offset);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShadowStyle)) {
            return false;
        }
        ShadowStyle shadowStyle = (ShadowStyle) other;
        return this.color == shadowStyle.color && Float.compare(this.radius, shadowStyle.radius) == 0 && Intrinsics.areEqual(this.offset, shadowStyle.offset);
    }

    public final int getColor() {
        return this.color;
    }

    @NotNull
    public final SizeF getOffset() {
        return this.offset;
    }

    public final float getRadius() {
        return this.radius;
    }

    public int hashCode() {
        return this.offset.hashCode() + e.a(Integer.hashCode(this.color) * 31, 31, this.radius);
    }

    @NotNull
    public String toString() {
        return "ShadowStyle(color=" + this.color + ", radius=" + this.radius + ", offset=" + this.offset + ")";
    }
}
