package com.discord.mobile_voice_overlay;

import com.discord.primitives.UserId;
import com.discord.primitives.UserId$$serializer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kr.f;
import or.e1;
import or.s1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@f
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002-.B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bB?\b\u0010\u0012\u0006\u0010\f\u001a\u00020\t\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u000fJ\u0010\u0010\u0019\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0011J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003J:\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010!\u001a\u00020\u00072\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\tHÖ\u0001J\t\u0010$\u001a\u00020\u0005HÖ\u0001J%\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u00002\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0001¢\u0006\u0002\b,R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006/"}, d2 = {"Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayDataUser;", "", "userId", "Lcom/discord/primitives/UserId;", "avatar", "", "speaking", "", "discriminator", "", "<init>", "(JLjava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/discord/primitives/UserId;Ljava/lang/String;ZILkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getUserId-re6GcUE", "()J", "J", "getAvatar", "()Ljava/lang/String;", "getSpeaking", "()Z", "getDiscriminator", "()I", "component1", "component1-re6GcUE", "component2", "component3", "component4", "copy", "copy-ASSxI_0", "(JLjava/lang/String;ZI)Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayDataUser;", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$mobile_voice_overlay_release", "$serializer", "Companion", "mobile_voice_overlay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class MobileVoiceOverlayDataUser {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final String avatar;
    private final int discriminator;
    private final boolean speaking;
    private final long userId;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayDataUser$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayDataUser;", "mobile_voice_overlay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return MobileVoiceOverlayDataUser$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ MobileVoiceOverlayDataUser(int i7, UserId userId, String str, boolean z5, int i10, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i7, userId, str, z5, i10, serializationConstructorMarker);
    }

    /* JADX INFO: renamed from: copy-ASSxI_0$default, reason: not valid java name */
    public static /* synthetic */ MobileVoiceOverlayDataUser m1032copyASSxI_0$default(MobileVoiceOverlayDataUser mobileVoiceOverlayDataUser, long j, String str, boolean z5, int i7, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j = mobileVoiceOverlayDataUser.userId;
        }
        long j5 = j;
        if ((i10 & 2) != 0) {
            str = mobileVoiceOverlayDataUser.avatar;
        }
        String str2 = str;
        if ((i10 & 4) != 0) {
            z5 = mobileVoiceOverlayDataUser.speaking;
        }
        boolean z6 = z5;
        if ((i10 & 8) != 0) {
            i7 = mobileVoiceOverlayDataUser.discriminator;
        }
        return mobileVoiceOverlayDataUser.m1034copyASSxI_0(j5, str2, z6, i7);
    }

    public static final /* synthetic */ void write$Self$mobile_voice_overlay_release(MobileVoiceOverlayDataUser self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.g(serialDesc, 0, UserId$$serializer.INSTANCE, UserId.m1208boximpl(self.userId));
        output.r(serialDesc, 1, s1.f17602a, self.avatar);
        output.p(serialDesc, 2, self.speaking);
        output.l(3, self.discriminator, serialDesc);
    }

    /* JADX INFO: renamed from: component1-re6GcUE, reason: not valid java name and from getter */
    public final long getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAvatar() {
        return this.avatar;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getSpeaking() {
        return this.speaking;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getDiscriminator() {
        return this.discriminator;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-ASSxI_0, reason: not valid java name */
    public final MobileVoiceOverlayDataUser m1034copyASSxI_0(long userId, String avatar, boolean speaking, int discriminator) {
        return new MobileVoiceOverlayDataUser(userId, avatar, speaking, discriminator, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MobileVoiceOverlayDataUser)) {
            return false;
        }
        MobileVoiceOverlayDataUser mobileVoiceOverlayDataUser = (MobileVoiceOverlayDataUser) other;
        return UserId.m1212equalsimpl0(this.userId, mobileVoiceOverlayDataUser.userId) && Intrinsics.areEqual(this.avatar, mobileVoiceOverlayDataUser.avatar) && this.speaking == mobileVoiceOverlayDataUser.speaking && this.discriminator == mobileVoiceOverlayDataUser.discriminator;
    }

    public final String getAvatar() {
        return this.avatar;
    }

    public final int getDiscriminator() {
        return this.discriminator;
    }

    public final boolean getSpeaking() {
        return this.speaking;
    }

    /* JADX INFO: renamed from: getUserId-re6GcUE, reason: not valid java name */
    public final long m1035getUserIdre6GcUE() {
        return this.userId;
    }

    public int hashCode() {
        int iM1213hashCodeimpl = UserId.m1213hashCodeimpl(this.userId) * 31;
        String str = this.avatar;
        return Integer.hashCode(this.discriminator) + com.discord.chat.presentation.list.a.g((iM1213hashCodeimpl + (str == null ? 0 : str.hashCode())) * 31, 31, this.speaking);
    }

    @NotNull
    public String toString() {
        String strM1215toStringimpl = UserId.m1215toStringimpl(this.userId);
        String str = this.avatar;
        boolean z5 = this.speaking;
        int i7 = this.discriminator;
        StringBuilder sbU = a3.e.u("MobileVoiceOverlayDataUser(userId=", strM1215toStringimpl, ", avatar=", str, ", speaking=");
        sbU.append(z5);
        sbU.append(", discriminator=");
        sbU.append(i7);
        sbU.append(")");
        return sbU.toString();
    }

    public /* synthetic */ MobileVoiceOverlayDataUser(long j, String str, boolean z5, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, z5, i7);
    }

    private /* synthetic */ MobileVoiceOverlayDataUser(int i7, UserId userId, String str, boolean z5, int i10, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i7 & 15)) {
            e1.l(i7, 15, MobileVoiceOverlayDataUser$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.userId = userId.m1217unboximpl();
        this.avatar = str;
        this.speaking = z5;
        this.discriminator = i10;
    }

    private MobileVoiceOverlayDataUser(long j, String str, boolean z5, int i7) {
        this.userId = j;
        this.avatar = str;
        this.speaking = z5;
        this.discriminator = i7;
    }
}
