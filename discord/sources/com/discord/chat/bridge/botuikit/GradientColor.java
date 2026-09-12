package com.discord.chat.bridge.botuikit;

import a3.e;
import com.discord.chat.presentation.list.a;
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
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002'(B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tB;\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\rJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J%\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0001¢\u0006\u0002\b&R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006)"}, d2 = {"Lcom/discord/chat/bridge/botuikit/GradientColor;", "", "r", "", "g", "b", "a", "", "<init>", "(IIIF)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IIIIFLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getR", "()I", "getG", "getB", "getA", "()F", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class GradientColor {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final float a;
    private final int b;
    private final int g;
    private final int r;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/botuikit/GradientColor$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/botuikit/GradientColor;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return GradientColor$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ GradientColor(int i7, int i10, int i11, int i12, float f2, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i7 & 15)) {
            e1.l(i7, 15, GradientColor$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.r = i10;
        this.g = i11;
        this.b = i12;
        this.a = f2;
    }

    public static /* synthetic */ GradientColor copy$default(GradientColor gradientColor, int i7, int i10, int i11, float f2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i7 = gradientColor.r;
        }
        if ((i12 & 2) != 0) {
            i10 = gradientColor.g;
        }
        if ((i12 & 4) != 0) {
            i11 = gradientColor.b;
        }
        if ((i12 & 8) != 0) {
            f2 = gradientColor.a;
        }
        return gradientColor.copy(i7, i10, i11, f2);
    }

    public static final /* synthetic */ void write$Self$chat_release(GradientColor self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.l(0, self.r, serialDesc);
        output.l(1, self.g, serialDesc);
        output.l(2, self.b, serialDesc);
        output.j(serialDesc, 3, self.a);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getR() {
        return this.r;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getG() {
        return this.g;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getB() {
        return this.b;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getA() {
        return this.a;
    }

    @NotNull
    public final GradientColor copy(int r5, int g6, int b10, float a10) {
        return new GradientColor(r5, g6, b10, a10);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GradientColor)) {
            return false;
        }
        GradientColor gradientColor = (GradientColor) other;
        return this.r == gradientColor.r && this.g == gradientColor.g && this.b == gradientColor.b && Float.compare(this.a, gradientColor.a) == 0;
    }

    public final float getA() {
        return this.a;
    }

    public final int getB() {
        return this.b;
    }

    public final int getG() {
        return this.g;
    }

    public final int getR() {
        return this.r;
    }

    public int hashCode() {
        return Float.hashCode(this.a) + a.u(this.b, a.u(this.g, Integer.hashCode(this.r) * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        int i7 = this.r;
        int i10 = this.g;
        int i11 = this.b;
        float f2 = this.a;
        StringBuilder sbR = e.r(i7, "GradientColor(r=", i10, ", g=", ", b=");
        sbR.append(i11);
        sbR.append(", a=");
        sbR.append(f2);
        sbR.append(")");
        return sbR.toString();
    }

    public GradientColor(int i7, int i10, int i11, float f2) {
        this.r = i7;
        this.g = i10;
        this.b = i11;
        this.a = f2;
    }
}
