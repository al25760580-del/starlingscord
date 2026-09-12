package com.discord.chat.bridge.botuikit;

import a3.e;
import com.discord.chat.bridge.media.UnfurledMediaItem;
import com.discord.chat.bridge.media.UnfurledMediaItem$$serializer;
import com.discord.chat.bridge.spoiler.SpoilerableData;
import com.discord.chat.presentation.list.a;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kr.f;
import or.e1;
import or.g;
import or.s1;
import org.jetbrains.annotations.NotNull;
import org.webrtc.PeerConnection;

/* JADX INFO: loaded from: classes.dex */
@f
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 N2\u00020\u00012\u00020\u0002:\u0002MNB\u0081\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016B¯\u0001\b\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u0015\u0010\u001cJ\t\u00100\u001a\u00020\u0004HÆ\u0003J\t\u00101\u001a\u00020\u0006HÆ\u0003J\t\u00102\u001a\u00020\bHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u00104\u001a\u00020\u000bHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u00106\u001a\u00020\u000bHÆ\u0003J\t\u00107\u001a\u00020\u000bHÆ\u0003J\t\u00108\u001a\u00020\u000bHÆ\u0003J\t\u00109\u001a\u00020\u000bHÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010;\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010*J\t\u0010<\u001a\u00020\u0006HÆ\u0003J\t\u0010=\u001a\u00020\u0006HÆ\u0003J¢\u0001\u0010>\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u0006HÆ\u0001¢\u0006\u0002\u0010?J\u0013\u0010@\u001a\u00020\u000b2\b\u0010A\u001a\u0004\u0018\u00010BHÖ\u0003J\t\u0010C\u001a\u00020\u0004HÖ\u0001J\t\u0010D\u001a\u00020\u0006HÖ\u0001J%\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020\u00002\u0006\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020KH\u0001¢\u0006\u0002\bLR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b#\u0010 R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010$R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b%\u0010 R\u0011\u0010\r\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010$R\u0011\u0010\u000e\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010$R\u0011\u0010\u000f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b&\u0010$R\u0011\u0010\u0010\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b'\u0010$R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b(\u0010 R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010+\u001a\u0004\b)\u0010*R\u0011\u0010\u0013\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b,\u0010 R\u0011\u0010\u0014\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b-\u0010 R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010 R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010 ¨\u0006O"}, d2 = {"Lcom/discord/chat/bridge/botuikit/ThumbnailDisplayComponent;", "Lcom/discord/chat/bridge/botuikit/Component;", "Lcom/discord/chat/bridge/spoiler/SpoilerableData;", "type", "", StackTraceHelper.ID_KEY, "", "media", "Lcom/discord/chat/bridge/media/UnfurledMediaItem;", "description", "isSpoiler", "", "spoilerDescription", "isObscure", "isObscureAwaitingScan", "obscureHideControls", "obscureIsOpaque", "obscureDescription", "verifyAge", "descriptionHint", ViewProps.ACCESSIBILITY_ROLE, "<init>", "(ILjava/lang/String;Lcom/discord/chat/bridge/media/UnfurledMediaItem;Ljava/lang/String;ZLjava/lang/String;ZZZZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "spoilerOrNull", "obscureOrNull", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILjava/lang/String;Lcom/discord/chat/bridge/media/UnfurledMediaItem;Ljava/lang/String;ZLjava/lang/String;ZZZZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getType", "()I", "getId", "()Ljava/lang/String;", "getMedia", "()Lcom/discord/chat/bridge/media/UnfurledMediaItem;", "getDescription", "()Z", "getSpoilerDescription", "getObscureHideControls", "getObscureIsOpaque", "getObscureDescription", "getVerifyAge", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getDescriptionHint", "getAccessibilityRole", "getSpoilerOrNull", "getObscureOrNull", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "(ILjava/lang/String;Lcom/discord/chat/bridge/media/UnfurledMediaItem;Ljava/lang/String;ZLjava/lang/String;ZZZZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lcom/discord/chat/bridge/botuikit/ThumbnailDisplayComponent;", "equals", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nThumbnailDisplayComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThumbnailDisplayComponent.kt\ncom/discord/chat/bridge/botuikit/ThumbnailDisplayComponent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,30:1\n1#2:31\n*E\n"})
public final /* data */ class ThumbnailDisplayComponent extends Component implements SpoilerableData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String accessibilityRole;
    private final String description;

    @NotNull
    private final String descriptionHint;

    @NotNull
    private final String id;
    private final boolean isObscure;
    private final boolean isObscureAwaitingScan;
    private final boolean isSpoiler;

    @NotNull
    private final UnfurledMediaItem media;
    private final String obscureDescription;
    private final boolean obscureHideControls;
    private final boolean obscureIsOpaque;
    private final String obscureOrNull;
    private final String spoilerDescription;
    private final String spoilerOrNull;
    private final int type;
    private final Boolean verifyAge;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/botuikit/ThumbnailDisplayComponent$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/botuikit/ThumbnailDisplayComponent;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return ThumbnailDisplayComponent$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ThumbnailDisplayComponent(int i7, int i10, String str, UnfurledMediaItem unfurledMediaItem, String str2, boolean z5, String str3, boolean z6, boolean z7, boolean z10, boolean z11, String str4, Boolean bool, String str5, String str6, String str7, String str8, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        String str9 = str4;
        if (16375 != (i7 & 16375)) {
            e1.l(i7, 16375, ThumbnailDisplayComponent$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.type = i10;
        this.id = str;
        this.media = unfurledMediaItem;
        if ((i7 & 8) == 0) {
            this.description = null;
        } else {
            this.description = str2;
        }
        this.isSpoiler = z5;
        this.spoilerDescription = str3;
        this.isObscure = z6;
        this.isObscureAwaitingScan = z7;
        this.obscureHideControls = z10;
        this.obscureIsOpaque = z11;
        this.obscureDescription = str9;
        this.verifyAge = bool;
        this.descriptionHint = str5;
        this.accessibilityRole = str6;
        boolean z12 = true;
        if ((i7 & 16384) == 0) {
            this.spoilerOrNull = str3 == null || StringsKt.K(str3) ? null : str3;
        } else {
            this.spoilerOrNull = str7;
        }
        if ((i7 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0) {
            this.obscureOrNull = str8;
            return;
        }
        if (str9 != null && !StringsKt.K(str9)) {
            z12 = false;
        }
        this.obscureOrNull = z12 ? null : str9;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0090  */
    public static final /* synthetic */ void write$Self$chat_release(ThumbnailDisplayComponent self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.l(0, self.getType(), serialDesc);
        output.q(serialDesc, 1, self.getId());
        output.g(serialDesc, 2, UnfurledMediaItem$$serializer.INSTANCE, self.media);
        if (output.u(serialDesc, 3) || self.description != null) {
            output.r(serialDesc, 3, s1.f17602a, self.description);
        }
        output.p(serialDesc, 4, self.isSpoiler);
        s1 s1Var = s1.f17602a;
        output.r(serialDesc, 5, s1Var, self.spoilerDescription);
        output.p(serialDesc, 6, self.isObscure);
        output.p(serialDesc, 7, self.isObscureAwaitingScan);
        output.p(serialDesc, 8, self.obscureHideControls);
        output.p(serialDesc, 9, self.obscureIsOpaque);
        output.r(serialDesc, 10, s1Var, self.obscureDescription);
        output.r(serialDesc, 11, g.f17537a, self.verifyAge);
        output.q(serialDesc, 12, self.descriptionHint);
        output.q(serialDesc, 13, self.accessibilityRole);
        String str = null;
        if (output.u(serialDesc, 14)) {
            output.r(serialDesc, 14, s1Var, self.getSpoilerOrNull());
        } else {
            String spoilerOrNull = self.getSpoilerOrNull();
            String str2 = self.spoilerDescription;
            if (str2 == null || StringsKt.K(str2)) {
                str2 = null;
            }
            if (!Intrinsics.areEqual(spoilerOrNull, str2)) {
                output.r(serialDesc, 14, s1Var, self.getSpoilerOrNull());
            }
        }
        if (!output.u(serialDesc, 15)) {
            String obscureOrNull = self.getObscureOrNull();
            String str3 = self.obscureDescription;
            if (str3 != null && !StringsKt.K(str3)) {
                str = str3;
            }
            if (Intrinsics.areEqual(obscureOrNull, str)) {
                return;
            }
        }
        output.r(serialDesc, 15, s1Var, self.getObscureOrNull());
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getObscureIsOpaque() {
        return this.obscureIsOpaque;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getObscureDescription() {
        return this.obscureDescription;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Boolean getVerifyAge() {
        return this.verifyAge;
    }

    @NotNull
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getDescriptionHint() {
        return this.descriptionHint;
    }

    @NotNull
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getAccessibilityRole() {
        return this.accessibilityRole;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final UnfurledMediaItem getMedia() {
        return this.media;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsSpoiler() {
        return this.isSpoiler;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSpoilerDescription() {
        return this.spoilerDescription;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIsObscure() {
        return this.isObscure;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getIsObscureAwaitingScan() {
        return this.isObscureAwaitingScan;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getObscureHideControls() {
        return this.obscureHideControls;
    }

    @NotNull
    public final ThumbnailDisplayComponent copy(int type, @NotNull String id2, @NotNull UnfurledMediaItem media, String description, boolean isSpoiler, String spoilerDescription, boolean isObscure, boolean isObscureAwaitingScan, boolean obscureHideControls, boolean obscureIsOpaque, String obscureDescription, Boolean verifyAge, @NotNull String descriptionHint, @NotNull String accessibilityRole) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(media, "media");
        Intrinsics.checkNotNullParameter(descriptionHint, "descriptionHint");
        Intrinsics.checkNotNullParameter(accessibilityRole, "accessibilityRole");
        return new ThumbnailDisplayComponent(type, id2, media, description, isSpoiler, spoilerDescription, isObscure, isObscureAwaitingScan, obscureHideControls, obscureIsOpaque, obscureDescription, verifyAge, descriptionHint, accessibilityRole);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ThumbnailDisplayComponent)) {
            return false;
        }
        ThumbnailDisplayComponent thumbnailDisplayComponent = (ThumbnailDisplayComponent) other;
        return this.type == thumbnailDisplayComponent.type && Intrinsics.areEqual(this.id, thumbnailDisplayComponent.id) && Intrinsics.areEqual(this.media, thumbnailDisplayComponent.media) && Intrinsics.areEqual(this.description, thumbnailDisplayComponent.description) && this.isSpoiler == thumbnailDisplayComponent.isSpoiler && Intrinsics.areEqual(this.spoilerDescription, thumbnailDisplayComponent.spoilerDescription) && this.isObscure == thumbnailDisplayComponent.isObscure && this.isObscureAwaitingScan == thumbnailDisplayComponent.isObscureAwaitingScan && this.obscureHideControls == thumbnailDisplayComponent.obscureHideControls && this.obscureIsOpaque == thumbnailDisplayComponent.obscureIsOpaque && Intrinsics.areEqual(this.obscureDescription, thumbnailDisplayComponent.obscureDescription) && Intrinsics.areEqual(this.verifyAge, thumbnailDisplayComponent.verifyAge) && Intrinsics.areEqual(this.descriptionHint, thumbnailDisplayComponent.descriptionHint) && Intrinsics.areEqual(this.accessibilityRole, thumbnailDisplayComponent.accessibilityRole);
    }

    @NotNull
    public final String getAccessibilityRole() {
        return this.accessibilityRole;
    }

    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final String getDescriptionHint() {
        return this.descriptionHint;
    }

    @Override // com.discord.chat.bridge.botuikit.Component
    @NotNull
    public String getId() {
        return this.id;
    }

    @NotNull
    public final UnfurledMediaItem getMedia() {
        return this.media;
    }

    public final String getObscureDescription() {
        return this.obscureDescription;
    }

    public final boolean getObscureHideControls() {
        return this.obscureHideControls;
    }

    public final boolean getObscureIsOpaque() {
        return this.obscureIsOpaque;
    }

    @Override // com.discord.chat.bridge.spoiler.SpoilerableData
    public String getObscureOrNull() {
        return this.obscureOrNull;
    }

    public final String getSpoilerDescription() {
        return this.spoilerDescription;
    }

    @Override // com.discord.chat.bridge.spoiler.SpoilerableData
    public String getSpoilerOrNull() {
        return this.spoilerOrNull;
    }

    @Override // com.discord.chat.bridge.botuikit.Component
    public int getType() {
        return this.type;
    }

    public final Boolean getVerifyAge() {
        return this.verifyAge;
    }

    public int hashCode() {
        int iHashCode = (this.media.hashCode() + e.d(Integer.hashCode(this.type) * 31, 31, this.id)) * 31;
        String str = this.description;
        int iG = a.g((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.isSpoiler);
        String str2 = this.spoilerDescription;
        int iG2 = a.g(a.g(a.g(a.g((iG + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.isObscure), 31, this.isObscureAwaitingScan), 31, this.obscureHideControls), 31, this.obscureIsOpaque);
        String str3 = this.obscureDescription;
        int iHashCode2 = (iG2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.verifyAge;
        return this.accessibilityRole.hashCode() + e.d((iHashCode2 + (bool != null ? bool.hashCode() : 0)) * 31, 31, this.descriptionHint);
    }

    public final boolean isObscure() {
        return this.isObscure;
    }

    public final boolean isObscureAwaitingScan() {
        return this.isObscureAwaitingScan;
    }

    public final boolean isSpoiler() {
        return this.isSpoiler;
    }

    @NotNull
    public String toString() {
        int i7 = this.type;
        String str = this.id;
        UnfurledMediaItem unfurledMediaItem = this.media;
        String str2 = this.description;
        boolean z5 = this.isSpoiler;
        String str3 = this.spoilerDescription;
        boolean z6 = this.isObscure;
        boolean z7 = this.isObscureAwaitingScan;
        boolean z10 = this.obscureHideControls;
        boolean z11 = this.obscureIsOpaque;
        String str4 = this.obscureDescription;
        Boolean bool = this.verifyAge;
        String str5 = this.descriptionHint;
        String str6 = this.accessibilityRole;
        StringBuilder sbO = a.o("ThumbnailDisplayComponent(type=", ", id=", str, i7, ", media=");
        sbO.append(unfurledMediaItem);
        sbO.append(", description=");
        sbO.append(str2);
        sbO.append(", isSpoiler=");
        sbO.append(z5);
        sbO.append(", spoilerDescription=");
        sbO.append(str3);
        sbO.append(", isObscure=");
        e.B(sbO, z6, ", isObscureAwaitingScan=", z7, ", obscureHideControls=");
        e.B(sbO, z10, ", obscureIsOpaque=", z11, ", obscureDescription=");
        sbO.append(str4);
        sbO.append(", verifyAge=");
        sbO.append(bool);
        sbO.append(", descriptionHint=");
        return a.l(sbO, str5, ", accessibilityRole=", str6, ")");
    }

    public /* synthetic */ ThumbnailDisplayComponent(int i7, String str, UnfurledMediaItem unfurledMediaItem, String str2, boolean z5, String str3, boolean z6, boolean z7, boolean z10, boolean z11, String str4, Boolean bool, String str5, String str6, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i7, str, unfurledMediaItem, (i10 & 8) != 0 ? null : str2, z5, str3, z6, z7, z10, z11, str4, bool, str5, str6);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThumbnailDisplayComponent(int i7, @NotNull String id2, @NotNull UnfurledMediaItem media, String str, boolean z5, String str2, boolean z6, boolean z7, boolean z10, boolean z11, String str3, Boolean bool, @NotNull String descriptionHint, @NotNull String accessibilityRole) {
        super(null);
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(media, "media");
        Intrinsics.checkNotNullParameter(descriptionHint, "descriptionHint");
        Intrinsics.checkNotNullParameter(accessibilityRole, "accessibilityRole");
        this.type = i7;
        this.id = id2;
        this.media = media;
        this.description = str;
        this.isSpoiler = z5;
        this.spoilerDescription = str2;
        this.isObscure = z6;
        this.isObscureAwaitingScan = z7;
        this.obscureHideControls = z10;
        this.obscureIsOpaque = z11;
        this.obscureDescription = str3;
        this.verifyAge = bool;
        this.descriptionHint = descriptionHint;
        this.accessibilityRole = accessibilityRole;
        boolean z12 = true;
        this.spoilerOrNull = str2 == null || StringsKt.K(str2) ? null : str2;
        if (str3 != null && !StringsKt.K(str3)) {
            z12 = false;
        }
        this.obscureOrNull = z12 ? null : str3;
    }
}
