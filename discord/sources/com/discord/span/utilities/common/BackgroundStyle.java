package com.discord.span.utilities.common;

import a3.e;
import com.discord.chat.presentation.list.a;
import com.facebook.react.uimanager.ViewProps;
import kk.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kr.f;
import or.e1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@f
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002\"#B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007B3\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\u000bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J%\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0001¢\u0006\u0002\b!R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006$"}, d2 = {"Lcom/discord/span/utilities/common/BackgroundStyle;", "", ViewProps.BACKGROUND_COLOR, "", "cornerRadius", ViewProps.MARGIN_VERTICAL, "<init>", "(III)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IIIILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getBackgroundColor", "()I", "getCornerRadius", "getMarginVertical", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$span_utilities_release", "$serializer", "Companion", "span_utilities_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class BackgroundStyle {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int backgroundColor;
    private final int cornerRadius;
    private final int marginVertical;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/span/utilities/common/BackgroundStyle$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/span/utilities/common/BackgroundStyle;", "span_utilities_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return BackgroundStyle$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ BackgroundStyle(int i7, int i10, int i11, int i12, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i7 & 1)) {
            e1.l(i7, 1, BackgroundStyle$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.backgroundColor = i10;
        if ((i7 & 2) == 0) {
            this.cornerRadius = 0;
        } else {
            this.cornerRadius = i11;
        }
        if ((i7 & 4) == 0) {
            this.marginVertical = 0;
        } else {
            this.marginVertical = i12;
        }
    }

    public static /* synthetic */ BackgroundStyle copy$default(BackgroundStyle backgroundStyle, int i7, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i7 = backgroundStyle.backgroundColor;
        }
        if ((i12 & 2) != 0) {
            i10 = backgroundStyle.cornerRadius;
        }
        if ((i12 & 4) != 0) {
            i11 = backgroundStyle.marginVertical;
        }
        return backgroundStyle.copy(i7, i10, i11);
    }

    public static final /* synthetic */ void write$Self$span_utilities_release(BackgroundStyle self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.l(0, self.backgroundColor, serialDesc);
        if (output.u(serialDesc, 1) || self.cornerRadius != 0) {
            output.l(1, self.cornerRadius, serialDesc);
        }
        if (!output.u(serialDesc, 2) && self.marginVertical == 0) {
            return;
        }
        output.l(2, self.marginVertical, serialDesc);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCornerRadius() {
        return this.cornerRadius;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getMarginVertical() {
        return this.marginVertical;
    }

    @NotNull
    public final BackgroundStyle copy(int backgroundColor, int cornerRadius, int marginVertical) {
        return new BackgroundStyle(backgroundColor, cornerRadius, marginVertical);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BackgroundStyle)) {
            return false;
        }
        BackgroundStyle backgroundStyle = (BackgroundStyle) other;
        return this.backgroundColor == backgroundStyle.backgroundColor && this.cornerRadius == backgroundStyle.cornerRadius && this.marginVertical == backgroundStyle.marginVertical;
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    public final int getCornerRadius() {
        return this.cornerRadius;
    }

    public final int getMarginVertical() {
        return this.marginVertical;
    }

    public int hashCode() {
        return Integer.hashCode(this.marginVertical) + a.u(this.cornerRadius, Integer.hashCode(this.backgroundColor) * 31, 31);
    }

    @NotNull
    public String toString() {
        int i7 = this.backgroundColor;
        int i10 = this.cornerRadius;
        return b.l(e.r(i7, "BackgroundStyle(backgroundColor=", i10, ", cornerRadius=", ", marginVertical="), this.marginVertical, ")");
    }

    public BackgroundStyle(int i7, int i10, int i11) {
        this.backgroundColor = i7;
        this.cornerRadius = i10;
        this.marginVertical = i11;
    }

    public /* synthetic */ BackgroundStyle(int i7, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i7, (i12 & 2) != 0 ? 0 : i10, (i12 & 4) != 0 ? 0 : i11);
    }
}
