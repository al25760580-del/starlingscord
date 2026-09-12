package com.discord.chat.bridge.rolecolors;

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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@f
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002%&B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007B7\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ0\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J%\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0001¢\u0006\u0002\b$R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\u000f¨\u0006'"}, d2 = {"Lcom/discord/chat/bridge/rolecolors/RoleColors;", "", "primaryColor", "", "secondaryColor", "tertiaryColor", "<init>", "(ILjava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILjava/lang/Integer;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getPrimaryColor", "()I", "getSecondaryColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTertiaryColor", "component1", "component2", "component3", "copy", "(ILjava/lang/Integer;Ljava/lang/Integer;)Lcom/discord/chat/bridge/rolecolors/RoleColors;", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class RoleColors {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int primaryColor;
    private final Integer secondaryColor;
    private final Integer tertiaryColor;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/rolecolors/RoleColors$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/rolecolors/RoleColors;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return RoleColors$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ RoleColors(int i7, int i10, Integer num, Integer num2, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i7 & 1)) {
            e1.l(i7, 1, RoleColors$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.primaryColor = i10;
        if ((i7 & 2) == 0) {
            this.secondaryColor = null;
        } else {
            this.secondaryColor = num;
        }
        if ((i7 & 4) == 0) {
            this.tertiaryColor = null;
        } else {
            this.tertiaryColor = num2;
        }
    }

    public static /* synthetic */ RoleColors copy$default(RoleColors roleColors, int i7, Integer num, Integer num2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i7 = roleColors.primaryColor;
        }
        if ((i10 & 2) != 0) {
            num = roleColors.secondaryColor;
        }
        if ((i10 & 4) != 0) {
            num2 = roleColors.tertiaryColor;
        }
        return roleColors.copy(i7, num, num2);
    }

    public static final /* synthetic */ void write$Self$chat_release(RoleColors self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.l(0, self.primaryColor, serialDesc);
        if (output.u(serialDesc, 1) || self.secondaryColor != null) {
            output.r(serialDesc, 1, m0.f17573a, self.secondaryColor);
        }
        if (!output.u(serialDesc, 2) && self.tertiaryColor == null) {
            return;
        }
        output.r(serialDesc, 2, m0.f17573a, self.tertiaryColor);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getPrimaryColor() {
        return this.primaryColor;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getSecondaryColor() {
        return this.secondaryColor;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getTertiaryColor() {
        return this.tertiaryColor;
    }

    @NotNull
    public final RoleColors copy(int primaryColor, Integer secondaryColor, Integer tertiaryColor) {
        return new RoleColors(primaryColor, secondaryColor, tertiaryColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RoleColors)) {
            return false;
        }
        RoleColors roleColors = (RoleColors) other;
        return this.primaryColor == roleColors.primaryColor && Intrinsics.areEqual(this.secondaryColor, roleColors.secondaryColor) && Intrinsics.areEqual(this.tertiaryColor, roleColors.tertiaryColor);
    }

    public final int getPrimaryColor() {
        return this.primaryColor;
    }

    public final Integer getSecondaryColor() {
        return this.secondaryColor;
    }

    public final Integer getTertiaryColor() {
        return this.tertiaryColor;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.primaryColor) * 31;
        Integer num = this.secondaryColor;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.tertiaryColor;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "RoleColors(primaryColor=" + this.primaryColor + ", secondaryColor=" + this.secondaryColor + ", tertiaryColor=" + this.tertiaryColor + ")";
    }

    public RoleColors(int i7, Integer num, Integer num2) {
        this.primaryColor = i7;
        this.secondaryColor = num;
        this.tertiaryColor = num2;
    }

    public /* synthetic */ RoleColors(int i7, Integer num, Integer num2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i7, (i10 & 2) != 0 ? null : num, (i10 & 4) != 0 ? null : num2);
    }
}
