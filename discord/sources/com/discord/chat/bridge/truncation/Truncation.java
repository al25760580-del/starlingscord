package com.discord.chat.bridge.truncation;

import com.discord.chat.presentation.list.a;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kr.f;
import or.e1;
import or.m0;
import or.s1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@f
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002*+B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0016J:\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u00052\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\u0007HÖ\u0001J%\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0001¢\u0006\u0002\b)R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016¨\u0006,"}, d2 = {"Lcom/discord/chat/bridge/truncation/Truncation;", "", ViewProps.NUMBER_OF_LINES, "", "expandable", "", "seeMoreLabel", "", "seeMoreLabelColor", "<init>", "(IZLjava/lang/String;Ljava/lang/Integer;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IIZLjava/lang/String;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getNumberOfLines", "()I", "getExpandable", "()Z", "getSeeMoreLabel", "()Ljava/lang/String;", "getSeeMoreLabelColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "(IZLjava/lang/String;Ljava/lang/Integer;)Lcom/discord/chat/bridge/truncation/Truncation;", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class Truncation {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final boolean expandable;
    private final int numberOfLines;
    private final String seeMoreLabel;
    private final Integer seeMoreLabelColor;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/truncation/Truncation$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/truncation/Truncation;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return Truncation$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ Truncation(int i7, int i10, boolean z5, String str, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i7 & 3)) {
            e1.l(i7, 3, Truncation$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.numberOfLines = i10;
        this.expandable = z5;
        if ((i7 & 4) == 0) {
            this.seeMoreLabel = null;
        } else {
            this.seeMoreLabel = str;
        }
        if ((i7 & 8) == 0) {
            this.seeMoreLabelColor = null;
        } else {
            this.seeMoreLabelColor = num;
        }
    }

    public static /* synthetic */ Truncation copy$default(Truncation truncation, int i7, boolean z5, String str, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i7 = truncation.numberOfLines;
        }
        if ((i10 & 2) != 0) {
            z5 = truncation.expandable;
        }
        if ((i10 & 4) != 0) {
            str = truncation.seeMoreLabel;
        }
        if ((i10 & 8) != 0) {
            num = truncation.seeMoreLabelColor;
        }
        return truncation.copy(i7, z5, str, num);
    }

    public static final /* synthetic */ void write$Self$chat_release(Truncation self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.l(0, self.numberOfLines, serialDesc);
        output.p(serialDesc, 1, self.expandable);
        if (output.u(serialDesc, 2) || self.seeMoreLabel != null) {
            output.r(serialDesc, 2, s1.f17602a, self.seeMoreLabel);
        }
        if (!output.u(serialDesc, 3) && self.seeMoreLabelColor == null) {
            return;
        }
        output.r(serialDesc, 3, m0.f17573a, self.seeMoreLabelColor);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getNumberOfLines() {
        return this.numberOfLines;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getExpandable() {
        return this.expandable;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSeeMoreLabel() {
        return this.seeMoreLabel;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getSeeMoreLabelColor() {
        return this.seeMoreLabelColor;
    }

    @NotNull
    public final Truncation copy(int numberOfLines, boolean expandable, String seeMoreLabel, Integer seeMoreLabelColor) {
        return new Truncation(numberOfLines, expandable, seeMoreLabel, seeMoreLabelColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Truncation)) {
            return false;
        }
        Truncation truncation = (Truncation) other;
        return this.numberOfLines == truncation.numberOfLines && this.expandable == truncation.expandable && Intrinsics.areEqual(this.seeMoreLabel, truncation.seeMoreLabel) && Intrinsics.areEqual(this.seeMoreLabelColor, truncation.seeMoreLabelColor);
    }

    public final boolean getExpandable() {
        return this.expandable;
    }

    public final int getNumberOfLines() {
        return this.numberOfLines;
    }

    public final String getSeeMoreLabel() {
        return this.seeMoreLabel;
    }

    public final Integer getSeeMoreLabelColor() {
        return this.seeMoreLabelColor;
    }

    public int hashCode() {
        int iG = a.g(Integer.hashCode(this.numberOfLines) * 31, 31, this.expandable);
        String str = this.seeMoreLabel;
        int iHashCode = (iG + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.seeMoreLabelColor;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Truncation(numberOfLines=" + this.numberOfLines + ", expandable=" + this.expandable + ", seeMoreLabel=" + this.seeMoreLabel + ", seeMoreLabelColor=" + this.seeMoreLabelColor + ")";
    }

    public Truncation(int i7, boolean z5, String str, Integer num) {
        this.numberOfLines = i7;
        this.expandable = z5;
        this.seeMoreLabel = str;
        this.seeMoreLabelColor = num;
    }

    public /* synthetic */ Truncation(int i7, boolean z5, String str, Integer num, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i7, z5, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? null : num);
    }
}
