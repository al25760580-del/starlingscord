package com.discord.chat.bridge.activities;

import a3.e;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.activity_invites.RGBAColorModel;
import com.discord.activity_invites.RGBAColorModel$$serializer;
import com.discord.chat.bridge.structurabletext.StructurableText;
import com.discord.chat.bridge.structurabletext.StructurableTextSerializer;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.modules.dialog.AlertFragment;
import i5.a;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kr.f;
import or.d;
import or.e1;
import or.g;
import or.m0;
import or.s1;
import org.jetbrains.annotations.NotNull;
import org.webrtc.PeerConnection;
import rn.l;
import rn.m;

/* JADX INFO: loaded from: classes.dex */
@f
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001d\b\u0087\b\u0018\u0000 c2\u00020\u0001:\u0002dcBù\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dBë\u0001\b\u0010\u0012\u0006\u0010\u001e\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b\u001c\u0010!J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b(\u0010%J\u0012\u0010)\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b)\u0010'J\u0018\u0010*\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b,\u0010'J\u0012\u0010-\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b-\u0010'J\u0012\u0010.\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b.\u0010%J\u0012\u0010/\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b/\u0010%J\u0012\u00100\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b0\u00101J\u0018\u00102\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b2\u0010+J\u0012\u00103\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b3\u0010'J\u0018\u00104\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b4\u0010+J\u0012\u00105\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b5\u0010'J\u0012\u00106\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b6\u0010'J\u0012\u00107\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b7\u0010'J\u0012\u00108\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b8\u0010'J\u0012\u00109\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0004\b9\u0010:J\u0084\u0002\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÆ\u0001¢\u0006\u0004\b;\u0010<J\u0010\u0010=\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b=\u0010'J\u0010\u0010>\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b>\u0010?J\u001a\u0010A\u001a\u00020\u00042\b\u0010@\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bA\u0010BJ'\u0010K\u001a\u00020H2\u0006\u0010C\u001a\u00020\u00002\u0006\u0010E\u001a\u00020D2\u0006\u0010G\u001a\u00020FH\u0001¢\u0006\u0004\bI\u0010JR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010L\u001a\u0004\bM\u0010#R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010N\u001a\u0004\bO\u0010%R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010P\u001a\u0004\bQ\u0010'R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010N\u001a\u0004\bR\u0010%R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010P\u001a\u0004\bS\u0010'R\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u0010T\u001a\u0004\bU\u0010+R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\r\u0010P\u001a\u0004\bV\u0010'R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u000e\u0010P\u001a\u0004\bW\u0010'R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010N\u001a\u0004\b\u000f\u0010%R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010N\u001a\u0004\b\u0010\u0010%R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010X\u001a\u0004\bY\u00101R\u001f\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u0013\u0010T\u001a\u0004\bZ\u0010+R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010P\u001a\u0004\b[\u0010'R\u001f\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u0015\u0010T\u001a\u0004\b\\\u0010+R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010P\u001a\u0004\b]\u0010'R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010P\u001a\u0004\b^\u0010'R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010P\u001a\u0004\b_\u0010'R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010P\u001a\u0004\b`\u0010'R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010a\u001a\u0004\bb\u0010:¨\u0006e"}, d2 = {"Lcom/discord/chat/bridge/activities/ActivityRichPresenceInviteEmbed;", "", "Lcom/discord/chat/bridge/activities/EmbedDisplayType;", "displayType", "", "ctaButtonEnabled", "", "ctaButtonText", "ctaButtonIsLoading", "footerLabel", "", "Lcom/discord/activity_invites/RGBAColorModel;", "gradientColors", "headerText", "iconSrc", "isPlatformSupported", "isSpotifyParty", "", "maxPartySize", "partyMemberAvatarURIs", "partySizeText", "platformIconKeys", "coverImageUrl", "detailsText", "subtitle", AlertFragment.ARG_TITLE, "Lcom/discord/chat/bridge/structurabletext/StructurableText;", "hiddenEmbedMessageContent", "<init>", "(Lcom/discord/chat/bridge/activities/EmbedDisplayType;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/discord/chat/bridge/activities/EmbedDisplayType;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/discord/chat/bridge/activities/EmbedDisplayType;", "component2", "()Ljava/lang/Boolean;", "component3", "()Ljava/lang/String;", "component4", "component5", "component6", "()Ljava/util/List;", "component7", "component8", "component9", "component10", "component11", "()Ljava/lang/Integer;", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "()Lcom/discord/chat/bridge/structurabletext/StructurableText;", "copy", "(Lcom/discord/chat/bridge/activities/EmbedDisplayType;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;)Lcom/discord/chat/bridge/activities/ActivityRichPresenceInviteEmbed;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$chat_release", "(Lcom/discord/chat/bridge/activities/ActivityRichPresenceInviteEmbed;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/discord/chat/bridge/activities/EmbedDisplayType;", "getDisplayType", "Ljava/lang/Boolean;", "getCtaButtonEnabled", "Ljava/lang/String;", "getCtaButtonText", "getCtaButtonIsLoading", "getFooterLabel", "Ljava/util/List;", "getGradientColors", "getHeaderText", "getIconSrc", "Ljava/lang/Integer;", "getMaxPartySize", "getPartyMemberAvatarURIs", "getPartySizeText", "getPlatformIconKeys", "getCoverImageUrl", "getDetailsText", "getSubtitle", "getTitle", "Lcom/discord/chat/bridge/structurabletext/StructurableText;", "getHiddenEmbedMessageContent", "Companion", "$serializer", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ActivityRichPresenceInviteEmbed {

    @NotNull
    private static final Lazy[] $childSerializers;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final String coverImageUrl;
    private final Boolean ctaButtonEnabled;
    private final Boolean ctaButtonIsLoading;
    private final String ctaButtonText;
    private final String detailsText;

    @NotNull
    private final EmbedDisplayType displayType;
    private final String footerLabel;
    private final List<RGBAColorModel> gradientColors;
    private final String headerText;
    private final StructurableText hiddenEmbedMessageContent;
    private final String iconSrc;
    private final Boolean isPlatformSupported;
    private final Boolean isSpotifyParty;
    private final Integer maxPartySize;
    private final List<String> partyMemberAvatarURIs;
    private final String partySizeText;
    private final List<String> platformIconKeys;
    private final String subtitle;
    private final String title;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/activities/ActivityRichPresenceInviteEmbed$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/activities/ActivityRichPresenceInviteEmbed;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return ActivityRichPresenceInviteEmbed$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        m mVar = m.f19486e;
        $childSerializers = new Lazy[]{l.a(mVar, new a(15)), null, null, null, null, l.a(mVar, new a(16)), null, null, null, null, null, l.a(mVar, new a(17)), null, l.a(mVar, new a(18)), null, null, null, null, null};
    }

    public /* synthetic */ ActivityRichPresenceInviteEmbed(int i7, EmbedDisplayType embedDisplayType, Boolean bool, String str, Boolean bool2, String str2, List list, String str3, String str4, Boolean bool3, Boolean bool4, Integer num, List list2, String str5, List list3, String str6, String str7, String str8, String str9, StructurableText structurableText, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i7 & 1)) {
            e1.l(i7, 1, ActivityRichPresenceInviteEmbed$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.displayType = embedDisplayType;
        if ((i7 & 2) == 0) {
            this.ctaButtonEnabled = Boolean.FALSE;
        } else {
            this.ctaButtonEnabled = bool;
        }
        if ((i7 & 4) == 0) {
            this.ctaButtonText = null;
        } else {
            this.ctaButtonText = str;
        }
        if ((i7 & 8) == 0) {
            this.ctaButtonIsLoading = Boolean.FALSE;
        } else {
            this.ctaButtonIsLoading = bool2;
        }
        if ((i7 & 16) == 0) {
            this.footerLabel = null;
        } else {
            this.footerLabel = str2;
        }
        if ((i7 & 32) == 0) {
            this.gradientColors = null;
        } else {
            this.gradientColors = list;
        }
        if ((i7 & 64) == 0) {
            this.headerText = null;
        } else {
            this.headerText = str3;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 0) {
            this.iconSrc = null;
        } else {
            this.iconSrc = str4;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 0) {
            this.isPlatformSupported = Boolean.FALSE;
        } else {
            this.isPlatformSupported = bool3;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 0) {
            this.isSpotifyParty = Boolean.FALSE;
        } else {
            this.isSpotifyParty = bool4;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) == 0) {
            this.maxPartySize = null;
        } else {
            this.maxPartySize = num;
        }
        if ((i7 & RecyclerView.ItemAnimator.FLAG_MOVED) == 0) {
            this.partyMemberAvatarURIs = null;
        } else {
            this.partyMemberAvatarURIs = list2;
        }
        if ((i7 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) == 0) {
            this.partySizeText = null;
        } else {
            this.partySizeText = str5;
        }
        if ((i7 & 8192) == 0) {
            this.platformIconKeys = null;
        } else {
            this.platformIconKeys = list3;
        }
        if ((i7 & 16384) == 0) {
            this.coverImageUrl = null;
        } else {
            this.coverImageUrl = str6;
        }
        if ((32768 & i7) == 0) {
            this.detailsText = null;
        } else {
            this.detailsText = str7;
        }
        if ((65536 & i7) == 0) {
            this.subtitle = null;
        } else {
            this.subtitle = str8;
        }
        if ((131072 & i7) == 0) {
            this.title = null;
        } else {
            this.title = str9;
        }
        if ((i7 & 262144) == 0) {
            this.hiddenEmbedMessageContent = null;
        } else {
            this.hiddenEmbedMessageContent = structurableText;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return EmbedDisplayType.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new d(new kr.a(Reflection.getOrCreateKotlinClass(RGBAColorModel.class), RGBAColorModel$$serializer.INSTANCE, new KSerializer[0]), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new d(s1.f17602a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$2() {
        return new d(s1.f17602a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ActivityRichPresenceInviteEmbed copy$default(ActivityRichPresenceInviteEmbed activityRichPresenceInviteEmbed, EmbedDisplayType embedDisplayType, Boolean bool, String str, Boolean bool2, String str2, List list, String str3, String str4, Boolean bool3, Boolean bool4, Integer num, List list2, String str5, List list3, String str6, String str7, String str8, String str9, StructurableText structurableText, int i7, Object obj) {
        StructurableText structurableText2;
        String str10;
        EmbedDisplayType embedDisplayType2 = (i7 & 1) != 0 ? activityRichPresenceInviteEmbed.displayType : embedDisplayType;
        Boolean bool5 = (i7 & 2) != 0 ? activityRichPresenceInviteEmbed.ctaButtonEnabled : bool;
        String str11 = (i7 & 4) != 0 ? activityRichPresenceInviteEmbed.ctaButtonText : str;
        Boolean bool6 = (i7 & 8) != 0 ? activityRichPresenceInviteEmbed.ctaButtonIsLoading : bool2;
        String str12 = (i7 & 16) != 0 ? activityRichPresenceInviteEmbed.footerLabel : str2;
        List list4 = (i7 & 32) != 0 ? activityRichPresenceInviteEmbed.gradientColors : list;
        String str13 = (i7 & 64) != 0 ? activityRichPresenceInviteEmbed.headerText : str3;
        String str14 = (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? activityRichPresenceInviteEmbed.iconSrc : str4;
        Boolean bool7 = (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? activityRichPresenceInviteEmbed.isPlatformSupported : bool3;
        Boolean bool8 = (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? activityRichPresenceInviteEmbed.isSpotifyParty : bool4;
        Integer num2 = (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? activityRichPresenceInviteEmbed.maxPartySize : num;
        List list5 = (i7 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? activityRichPresenceInviteEmbed.partyMemberAvatarURIs : list2;
        String str15 = (i7 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? activityRichPresenceInviteEmbed.partySizeText : str5;
        List list6 = (i7 & 8192) != 0 ? activityRichPresenceInviteEmbed.platformIconKeys : list3;
        EmbedDisplayType embedDisplayType3 = embedDisplayType2;
        String str16 = (i7 & 16384) != 0 ? activityRichPresenceInviteEmbed.coverImageUrl : str6;
        String str17 = (i7 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? activityRichPresenceInviteEmbed.detailsText : str7;
        String str18 = (i7 & 65536) != 0 ? activityRichPresenceInviteEmbed.subtitle : str8;
        String str19 = (i7 & 131072) != 0 ? activityRichPresenceInviteEmbed.title : str9;
        if ((i7 & 262144) != 0) {
            str10 = str19;
            structurableText2 = activityRichPresenceInviteEmbed.hiddenEmbedMessageContent;
        } else {
            structurableText2 = structurableText;
            str10 = str19;
        }
        return activityRichPresenceInviteEmbed.copy(embedDisplayType3, bool5, str11, bool6, str12, list4, str13, str14, bool7, bool8, num2, list5, str15, list6, str16, str17, str18, str10, structurableText2);
    }

    public static final /* synthetic */ void write$Self$chat_release(ActivityRichPresenceInviteEmbed self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Lazy[] lazyArr = $childSerializers;
        output.g(serialDesc, 0, (KSerializer) lazyArr[0].getValue(), self.displayType);
        if (output.u(serialDesc, 1) || !Intrinsics.areEqual(self.ctaButtonEnabled, Boolean.FALSE)) {
            output.r(serialDesc, 1, g.f17537a, self.ctaButtonEnabled);
        }
        if (output.u(serialDesc, 2) || self.ctaButtonText != null) {
            output.r(serialDesc, 2, s1.f17602a, self.ctaButtonText);
        }
        if (output.u(serialDesc, 3) || !Intrinsics.areEqual(self.ctaButtonIsLoading, Boolean.FALSE)) {
            output.r(serialDesc, 3, g.f17537a, self.ctaButtonIsLoading);
        }
        if (output.u(serialDesc, 4) || self.footerLabel != null) {
            output.r(serialDesc, 4, s1.f17602a, self.footerLabel);
        }
        if (output.u(serialDesc, 5) || self.gradientColors != null) {
            output.r(serialDesc, 5, (KSerializer) lazyArr[5].getValue(), self.gradientColors);
        }
        if (output.u(serialDesc, 6) || self.headerText != null) {
            output.r(serialDesc, 6, s1.f17602a, self.headerText);
        }
        if (output.u(serialDesc, 7) || self.iconSrc != null) {
            output.r(serialDesc, 7, s1.f17602a, self.iconSrc);
        }
        if (output.u(serialDesc, 8) || !Intrinsics.areEqual(self.isPlatformSupported, Boolean.FALSE)) {
            output.r(serialDesc, 8, g.f17537a, self.isPlatformSupported);
        }
        if (output.u(serialDesc, 9) || !Intrinsics.areEqual(self.isSpotifyParty, Boolean.FALSE)) {
            output.r(serialDesc, 9, g.f17537a, self.isSpotifyParty);
        }
        if (output.u(serialDesc, 10) || self.maxPartySize != null) {
            output.r(serialDesc, 10, m0.f17573a, self.maxPartySize);
        }
        if (output.u(serialDesc, 11) || self.partyMemberAvatarURIs != null) {
            output.r(serialDesc, 11, (KSerializer) lazyArr[11].getValue(), self.partyMemberAvatarURIs);
        }
        if (output.u(serialDesc, 12) || self.partySizeText != null) {
            output.r(serialDesc, 12, s1.f17602a, self.partySizeText);
        }
        if (output.u(serialDesc, 13) || self.platformIconKeys != null) {
            output.r(serialDesc, 13, (KSerializer) lazyArr[13].getValue(), self.platformIconKeys);
        }
        if (output.u(serialDesc, 14) || self.coverImageUrl != null) {
            output.r(serialDesc, 14, s1.f17602a, self.coverImageUrl);
        }
        if (output.u(serialDesc, 15) || self.detailsText != null) {
            output.r(serialDesc, 15, s1.f17602a, self.detailsText);
        }
        if (output.u(serialDesc, 16) || self.subtitle != null) {
            output.r(serialDesc, 16, s1.f17602a, self.subtitle);
        }
        if (output.u(serialDesc, 17) || self.title != null) {
            output.r(serialDesc, 17, s1.f17602a, self.title);
        }
        if (!output.u(serialDesc, 18) && self.hiddenEmbedMessageContent == null) {
            return;
        }
        output.r(serialDesc, 18, StructurableTextSerializer.INSTANCE, self.hiddenEmbedMessageContent);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final EmbedDisplayType getDisplayType() {
        return this.displayType;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Boolean getIsSpotifyParty() {
        return this.isSpotifyParty;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Integer getMaxPartySize() {
        return this.maxPartySize;
    }

    public final List<String> component12() {
        return this.partyMemberAvatarURIs;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getPartySizeText() {
        return this.partySizeText;
    }

    public final List<String> component14() {
        return this.platformIconKeys;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getCoverImageUrl() {
        return this.coverImageUrl;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getDetailsText() {
        return this.detailsText;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final StructurableText getHiddenEmbedMessageContent() {
        return this.hiddenEmbedMessageContent;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getCtaButtonEnabled() {
        return this.ctaButtonEnabled;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCtaButtonText() {
        return this.ctaButtonText;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getCtaButtonIsLoading() {
        return this.ctaButtonIsLoading;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getFooterLabel() {
        return this.footerLabel;
    }

    public final List<RGBAColorModel> component6() {
        return this.gradientColors;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getHeaderText() {
        return this.headerText;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getIconSrc() {
        return this.iconSrc;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Boolean getIsPlatformSupported() {
        return this.isPlatformSupported;
    }

    @NotNull
    public final ActivityRichPresenceInviteEmbed copy(@NotNull EmbedDisplayType displayType, Boolean ctaButtonEnabled, String ctaButtonText, Boolean ctaButtonIsLoading, String footerLabel, List<RGBAColorModel> gradientColors, String headerText, String iconSrc, Boolean isPlatformSupported, Boolean isSpotifyParty, Integer maxPartySize, List<String> partyMemberAvatarURIs, String partySizeText, List<String> platformIconKeys, String coverImageUrl, String detailsText, String subtitle, String title, StructurableText hiddenEmbedMessageContent) {
        Intrinsics.checkNotNullParameter(displayType, "displayType");
        return new ActivityRichPresenceInviteEmbed(displayType, ctaButtonEnabled, ctaButtonText, ctaButtonIsLoading, footerLabel, gradientColors, headerText, iconSrc, isPlatformSupported, isSpotifyParty, maxPartySize, partyMemberAvatarURIs, partySizeText, platformIconKeys, coverImageUrl, detailsText, subtitle, title, hiddenEmbedMessageContent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActivityRichPresenceInviteEmbed)) {
            return false;
        }
        ActivityRichPresenceInviteEmbed activityRichPresenceInviteEmbed = (ActivityRichPresenceInviteEmbed) other;
        return this.displayType == activityRichPresenceInviteEmbed.displayType && Intrinsics.areEqual(this.ctaButtonEnabled, activityRichPresenceInviteEmbed.ctaButtonEnabled) && Intrinsics.areEqual(this.ctaButtonText, activityRichPresenceInviteEmbed.ctaButtonText) && Intrinsics.areEqual(this.ctaButtonIsLoading, activityRichPresenceInviteEmbed.ctaButtonIsLoading) && Intrinsics.areEqual(this.footerLabel, activityRichPresenceInviteEmbed.footerLabel) && Intrinsics.areEqual(this.gradientColors, activityRichPresenceInviteEmbed.gradientColors) && Intrinsics.areEqual(this.headerText, activityRichPresenceInviteEmbed.headerText) && Intrinsics.areEqual(this.iconSrc, activityRichPresenceInviteEmbed.iconSrc) && Intrinsics.areEqual(this.isPlatformSupported, activityRichPresenceInviteEmbed.isPlatformSupported) && Intrinsics.areEqual(this.isSpotifyParty, activityRichPresenceInviteEmbed.isSpotifyParty) && Intrinsics.areEqual(this.maxPartySize, activityRichPresenceInviteEmbed.maxPartySize) && Intrinsics.areEqual(this.partyMemberAvatarURIs, activityRichPresenceInviteEmbed.partyMemberAvatarURIs) && Intrinsics.areEqual(this.partySizeText, activityRichPresenceInviteEmbed.partySizeText) && Intrinsics.areEqual(this.platformIconKeys, activityRichPresenceInviteEmbed.platformIconKeys) && Intrinsics.areEqual(this.coverImageUrl, activityRichPresenceInviteEmbed.coverImageUrl) && Intrinsics.areEqual(this.detailsText, activityRichPresenceInviteEmbed.detailsText) && Intrinsics.areEqual(this.subtitle, activityRichPresenceInviteEmbed.subtitle) && Intrinsics.areEqual(this.title, activityRichPresenceInviteEmbed.title) && Intrinsics.areEqual(this.hiddenEmbedMessageContent, activityRichPresenceInviteEmbed.hiddenEmbedMessageContent);
    }

    public final String getCoverImageUrl() {
        return this.coverImageUrl;
    }

    public final Boolean getCtaButtonEnabled() {
        return this.ctaButtonEnabled;
    }

    public final Boolean getCtaButtonIsLoading() {
        return this.ctaButtonIsLoading;
    }

    public final String getCtaButtonText() {
        return this.ctaButtonText;
    }

    public final String getDetailsText() {
        return this.detailsText;
    }

    @NotNull
    public final EmbedDisplayType getDisplayType() {
        return this.displayType;
    }

    public final String getFooterLabel() {
        return this.footerLabel;
    }

    public final List<RGBAColorModel> getGradientColors() {
        return this.gradientColors;
    }

    public final String getHeaderText() {
        return this.headerText;
    }

    public final StructurableText getHiddenEmbedMessageContent() {
        return this.hiddenEmbedMessageContent;
    }

    public final String getIconSrc() {
        return this.iconSrc;
    }

    public final Integer getMaxPartySize() {
        return this.maxPartySize;
    }

    public final List<String> getPartyMemberAvatarURIs() {
        return this.partyMemberAvatarURIs;
    }

    public final String getPartySizeText() {
        return this.partySizeText;
    }

    public final List<String> getPlatformIconKeys() {
        return this.platformIconKeys;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.displayType.hashCode() * 31;
        Boolean bool = this.ctaButtonEnabled;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.ctaButtonText;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool2 = this.ctaButtonIsLoading;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str2 = this.footerLabel;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<RGBAColorModel> list = this.gradientColors;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.headerText;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.iconSrc;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool3 = this.isPlatformSupported;
        int iHashCode9 = (iHashCode8 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.isSpotifyParty;
        int iHashCode10 = (iHashCode9 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Integer num = this.maxPartySize;
        int iHashCode11 = (iHashCode10 + (num == null ? 0 : num.hashCode())) * 31;
        List<String> list2 = this.partyMemberAvatarURIs;
        int iHashCode12 = (iHashCode11 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str5 = this.partySizeText;
        int iHashCode13 = (iHashCode12 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<String> list3 = this.platformIconKeys;
        int iHashCode14 = (iHashCode13 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str6 = this.coverImageUrl;
        int iHashCode15 = (iHashCode14 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.detailsText;
        int iHashCode16 = (iHashCode15 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.subtitle;
        int iHashCode17 = (iHashCode16 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.title;
        int iHashCode18 = (iHashCode17 + (str9 == null ? 0 : str9.hashCode())) * 31;
        StructurableText structurableText = this.hiddenEmbedMessageContent;
        return iHashCode18 + (structurableText != null ? structurableText.hashCode() : 0);
    }

    public final Boolean isPlatformSupported() {
        return this.isPlatformSupported;
    }

    public final Boolean isSpotifyParty() {
        return this.isSpotifyParty;
    }

    @NotNull
    public String toString() {
        EmbedDisplayType embedDisplayType = this.displayType;
        Boolean bool = this.ctaButtonEnabled;
        String str = this.ctaButtonText;
        Boolean bool2 = this.ctaButtonIsLoading;
        String str2 = this.footerLabel;
        List<RGBAColorModel> list = this.gradientColors;
        String str3 = this.headerText;
        String str4 = this.iconSrc;
        Boolean bool3 = this.isPlatformSupported;
        Boolean bool4 = this.isSpotifyParty;
        Integer num = this.maxPartySize;
        List<String> list2 = this.partyMemberAvatarURIs;
        String str5 = this.partySizeText;
        List<String> list3 = this.platformIconKeys;
        String str6 = this.coverImageUrl;
        String str7 = this.detailsText;
        String str8 = this.subtitle;
        String str9 = this.title;
        StructurableText structurableText = this.hiddenEmbedMessageContent;
        StringBuilder sb2 = new StringBuilder("ActivityRichPresenceInviteEmbed(displayType=");
        sb2.append(embedDisplayType);
        sb2.append(", ctaButtonEnabled=");
        sb2.append(bool);
        sb2.append(", ctaButtonText=");
        sb2.append(str);
        sb2.append(", ctaButtonIsLoading=");
        sb2.append(bool2);
        sb2.append(", footerLabel=");
        sb2.append(str2);
        sb2.append(", gradientColors=");
        sb2.append(list);
        sb2.append(", headerText=");
        e.A(sb2, str3, ", iconSrc=", str4, ", isPlatformSupported=");
        sb2.append(bool3);
        sb2.append(", isSpotifyParty=");
        sb2.append(bool4);
        sb2.append(", maxPartySize=");
        sb2.append(num);
        sb2.append(", partyMemberAvatarURIs=");
        sb2.append(list2);
        sb2.append(", partySizeText=");
        sb2.append(str5);
        sb2.append(", platformIconKeys=");
        sb2.append(list3);
        sb2.append(", coverImageUrl=");
        e.A(sb2, str6, ", detailsText=", str7, ", subtitle=");
        e.A(sb2, str8, ", title=", str9, ", hiddenEmbedMessageContent=");
        sb2.append(structurableText);
        sb2.append(")");
        return sb2.toString();
    }

    public ActivityRichPresenceInviteEmbed(@NotNull EmbedDisplayType displayType, Boolean bool, String str, Boolean bool2, String str2, List<RGBAColorModel> list, String str3, String str4, Boolean bool3, Boolean bool4, Integer num, List<String> list2, String str5, List<String> list3, String str6, String str7, String str8, String str9, StructurableText structurableText) {
        Intrinsics.checkNotNullParameter(displayType, "displayType");
        this.displayType = displayType;
        this.ctaButtonEnabled = bool;
        this.ctaButtonText = str;
        this.ctaButtonIsLoading = bool2;
        this.footerLabel = str2;
        this.gradientColors = list;
        this.headerText = str3;
        this.iconSrc = str4;
        this.isPlatformSupported = bool3;
        this.isSpotifyParty = bool4;
        this.maxPartySize = num;
        this.partyMemberAvatarURIs = list2;
        this.partySizeText = str5;
        this.platformIconKeys = list3;
        this.coverImageUrl = str6;
        this.detailsText = str7;
        this.subtitle = str8;
        this.title = str9;
        this.hiddenEmbedMessageContent = structurableText;
    }

    public /* synthetic */ ActivityRichPresenceInviteEmbed(EmbedDisplayType embedDisplayType, Boolean bool, String str, Boolean bool2, String str2, List list, String str3, String str4, Boolean bool3, Boolean bool4, Integer num, List list2, String str5, List list3, String str6, String str7, String str8, String str9, StructurableText structurableText, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(embedDisplayType, (i7 & 2) != 0 ? Boolean.FALSE : bool, (i7 & 4) != 0 ? null : str, (i7 & 8) != 0 ? Boolean.FALSE : bool2, (i7 & 16) != 0 ? null : str2, (i7 & 32) != 0 ? null : list, (i7 & 64) != 0 ? null : str3, (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? null : str4, (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? Boolean.FALSE : bool3, (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? Boolean.FALSE : bool4, (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? null : num, (i7 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? null : list2, (i7 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : str5, (i7 & 8192) != 0 ? null : list3, (i7 & 16384) != 0 ? null : str6, (i7 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? null : str7, (i7 & 65536) != 0 ? null : str8, (i7 & 131072) != 0 ? null : str9, (i7 & 262144) != 0 ? null : structurableText);
    }
}
