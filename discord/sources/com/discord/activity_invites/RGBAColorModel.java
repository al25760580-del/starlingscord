package com.discord.activity_invites;

import a3.e;
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
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002&'B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bB;\b\u0010\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0007\u0010\rJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\nHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J%\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0001¢\u0006\u0002\b%R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000f¨\u0006("}, d2 = {"Lcom/discord/activity_invites/RGBAColorModel;", "", "r", "", "g", "b", "a", "<init>", "(FFFF)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IFFFFLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getR", "()F", "getG", "getB", "getA", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$activity_invites_release", "$serializer", "Companion", "activity_invites_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class RGBAColorModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final float a;
    private final float b;
    private final float g;
    private final float r;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/activity_invites/RGBAColorModel$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/activity_invites/RGBAColorModel;", "activity_invites_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return RGBAColorModel$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ RGBAColorModel(int i7, float f2, float f7, float f10, float f11, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i7 & 15)) {
            e1.l(i7, 15, RGBAColorModel$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.r = f2;
        this.g = f7;
        this.b = f10;
        this.a = f11;
    }

    public static /* synthetic */ RGBAColorModel copy$default(RGBAColorModel rGBAColorModel, float f2, float f7, float f10, float f11, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            f2 = rGBAColorModel.r;
        }
        if ((i7 & 2) != 0) {
            f7 = rGBAColorModel.g;
        }
        if ((i7 & 4) != 0) {
            f10 = rGBAColorModel.b;
        }
        if ((i7 & 8) != 0) {
            f11 = rGBAColorModel.a;
        }
        return rGBAColorModel.copy(f2, f7, f10, f11);
    }

    public static final /* synthetic */ void write$Self$activity_invites_release(RGBAColorModel self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.j(serialDesc, 0, self.r);
        output.j(serialDesc, 1, self.g);
        output.j(serialDesc, 2, self.b);
        output.j(serialDesc, 3, self.a);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getR() {
        return this.r;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getG() {
        return this.g;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getB() {
        return this.b;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getA() {
        return this.a;
    }

    @NotNull
    public final RGBAColorModel copy(float r5, float g6, float b10, float a10) {
        return new RGBAColorModel(r5, g6, b10, a10);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RGBAColorModel)) {
            return false;
        }
        RGBAColorModel rGBAColorModel = (RGBAColorModel) other;
        return Float.compare(this.r, rGBAColorModel.r) == 0 && Float.compare(this.g, rGBAColorModel.g) == 0 && Float.compare(this.b, rGBAColorModel.b) == 0 && Float.compare(this.a, rGBAColorModel.a) == 0;
    }

    public final float getA() {
        return this.a;
    }

    public final float getB() {
        return this.b;
    }

    public final float getG() {
        return this.g;
    }

    public final float getR() {
        return this.r;
    }

    public int hashCode() {
        return Float.hashCode(this.a) + e.a(e.a(Float.hashCode(this.r) * 31, 31, this.g), 31, this.b);
    }

    @NotNull
    public String toString() {
        return "RGBAColorModel(r=" + this.r + ", g=" + this.g + ", b=" + this.b + ", a=" + this.a + ")";
    }

    public RGBAColorModel(float f2, float f7, float f10, float f11) {
        this.r = f2;
        this.g = f7;
        this.b = f10;
        this.a = f11;
    }
}
