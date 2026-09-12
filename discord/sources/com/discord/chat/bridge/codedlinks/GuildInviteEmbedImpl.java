package com.discord.chat.bridge.codedlinks;

import a3.e;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.presentation.list.a;
import com.discord.notifications.renderer.NotificationRenderer;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.PointerEventHelper;
import kk.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kr.f;
import or.e1;
import or.g;
import or.m0;
import or.s1;
import org.jetbrains.annotations.NotNull;
import org.webrtc.PeerConnection;

/* JADX INFO: loaded from: classes.dex */
@f
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\bL\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u0085\u00012\u00020\u00012\u00020\u0002:\u0004\u0084\u0001\u0085\u0001Bû\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010$\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b'\u0010(BÝ\u0002\b\u0010\u0012\u0006\u0010)\u001a\u00020\u0004\u0012\u0006\u0010*\u001a\u00020\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0004\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\"\u001a\u0004\u0018\u00010\b\u0012\b\u0010#\u001a\u0004\u0018\u00010\b\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010%\u001a\u0004\u0018\u00010\b\u0012\b\u0010&\u001a\u0004\u0018\u00010\b\u0012\b\u0010+\u001a\u0004\u0018\u00010,¢\u0006\u0004\b'\u0010-J\t\u0010U\u001a\u00020\u0004HÆ\u0003J\t\u0010V\u001a\u00020\u0004HÆ\u0003J\t\u0010W\u001a\u00020\u0004HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010Y\u001a\u00020\nHÆ\u0003J\u0010\u0010Z\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u00107J\u0010\u0010[\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u00107J\u0010\u0010\\\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u00107J\u000b\u0010]\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010_\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u00107J\u0010\u0010`\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010?J\u000b\u0010a\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010c\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010?J\u000b\u0010d\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u00107J\u0010\u0010g\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u00107J\u0010\u0010h\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010?J\u0010\u0010i\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u00107J\u000b\u0010j\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010m\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u00107J\u0010\u0010n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u00107J\u0010\u0010o\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u00107J\u000b\u0010p\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010q\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u00107J\u000b\u0010s\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0086\u0003\u0010u\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00042\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010$\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010vJ\u0013\u0010w\u001a\u00020\u00122\b\u0010x\u001a\u0004\u0018\u00010yHÖ\u0003J\t\u0010z\u001a\u00020\u0004HÖ\u0001J\t\u0010{\u001a\u00020\bHÖ\u0001J)\u0010|\u001a\u00020}2\u0006\u0010~\u001a\u00020\u00002\u0007\u0010\u007f\u001a\u00030\u0080\u00012\b\u0010\u0081\u0001\u001a\u00030\u0082\u0001H\u0001¢\u0006\u0003\b\u0083\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0014\u0010\u0005\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010/R\u0014\u0010\u0006\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010/R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\n\n\u0002\u00108\u001a\u0004\b6\u00107R\u0018\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\n\n\u0002\u00108\u001a\u0004\b9\u00107R\u0018\u0010\r\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\n\n\u0002\u00108\u001a\u0004\b:\u00107R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u00103R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u00103R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\n\n\u0002\u00108\u001a\u0004\b=\u00107R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0096\u0004¢\u0006\n\n\u0002\u0010@\u001a\u0004\b>\u0010?R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u00103R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u00103R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u0012X\u0096\u0004¢\u0006\n\n\u0002\u0010@\u001a\u0004\bC\u0010?R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u00103R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u00103R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\n\n\u0002\u00108\u001a\u0004\bF\u00107R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\n\n\u0002\u00108\u001a\u0004\bG\u00107R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u0012X\u0096\u0004¢\u0006\n\n\u0002\u0010@\u001a\u0004\bH\u0010?R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\n\n\u0002\u00108\u001a\u0004\bI\u00107R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u00103R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bK\u00103R\u0016\u0010\u001e\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bL\u00103R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\n\n\u0002\u00108\u001a\u0004\bM\u00107R\u0018\u0010 \u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\n\n\u0002\u00108\u001a\u0004\bN\u00107R\u0018\u0010!\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\n\n\u0002\u00108\u001a\u0004\bO\u00107R\u0016\u0010\"\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bP\u00103R\u0016\u0010#\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bQ\u00103R\u0018\u0010$\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\n\n\u0002\u00108\u001a\u0004\bR\u00107R\u0016\u0010%\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bS\u00103R\u0016\u0010&\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bT\u00103¨\u0006\u0086\u0001"}, d2 = {"Lcom/discord/chat/bridge/codedlinks/GuildInviteEmbedImpl;", "Lcom/discord/chat/bridge/codedlinks/CodedLinkEmbed;", "Lcom/discord/chat/bridge/codedlinks/GuildInviteEmbed;", ViewProps.BACKGROUND_COLOR, "", ViewProps.BORDER_COLOR, "headerColor", "headerText", "", "type", "Lcom/discord/chat/bridge/codedlinks/InviteType;", "acceptLabelBackgroundColor", "acceptLabelBorderColor", "acceptLabelColor", "acceptLabelText", "bodyText", "bodyTextColor", "canBeAccepted", "", "channelIcon", NotificationRenderer.CHANNEL_NAME, "embedCanBeTapped", "memberText", "onlineText", "resolvingGradientEnd", "resolvingGradientStart", "splashHasRadialGradient", "splashOpacity", "splashUrl", "inviteSplash", "subtitle", "subtitleColor", "thumbnailBackgroundColor", "thumbnailCornerRadius", "thumbnailText", "thumbnailUrl", "titleColor", "titleText", "badgeIconUrl", "<init>", "(IIILjava/lang/String;Lcom/discord/chat/bridge/codedlinks/InviteType;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "seen1", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IIIIILjava/lang/String;Lcom/discord/chat/bridge/codedlinks/InviteType;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getBackgroundColor", "()I", "getBorderColor", "getHeaderColor", "getHeaderText", "()Ljava/lang/String;", "getType", "()Lcom/discord/chat/bridge/codedlinks/InviteType;", "getAcceptLabelBackgroundColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAcceptLabelBorderColor", "getAcceptLabelColor", "getAcceptLabelText", "getBodyText", "getBodyTextColor", "getCanBeAccepted", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getChannelIcon", "getChannelName", "getEmbedCanBeTapped", "getMemberText", "getOnlineText", "getResolvingGradientEnd", "getResolvingGradientStart", "getSplashHasRadialGradient", "getSplashOpacity", "getSplashUrl", "getInviteSplash", "getSubtitle", "getSubtitleColor", "getThumbnailBackgroundColor", "getThumbnailCornerRadius", "getThumbnailText", "getThumbnailUrl", "getTitleColor", "getTitleText", "getBadgeIconUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "copy", "(IIILjava/lang/String;Lcom/discord/chat/bridge/codedlinks/InviteType;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/discord/chat/bridge/codedlinks/GuildInviteEmbedImpl;", "equals", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class GuildInviteEmbedImpl extends CodedLinkEmbed implements GuildInviteEmbed {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final Integer acceptLabelBackgroundColor;
    private final Integer acceptLabelBorderColor;
    private final Integer acceptLabelColor;
    private final String acceptLabelText;
    private final int backgroundColor;
    private final String badgeIconUrl;
    private final String bodyText;
    private final Integer bodyTextColor;
    private final int borderColor;
    private final Boolean canBeAccepted;
    private final String channelIcon;
    private final String channelName;
    private final Boolean embedCanBeTapped;
    private final int headerColor;
    private final String headerText;
    private final String inviteSplash;
    private final String memberText;
    private final String onlineText;
    private final Integer resolvingGradientEnd;
    private final Integer resolvingGradientStart;
    private final Boolean splashHasRadialGradient;
    private final Integer splashOpacity;
    private final String splashUrl;
    private final String subtitle;
    private final Integer subtitleColor;
    private final Integer thumbnailBackgroundColor;
    private final Integer thumbnailCornerRadius;
    private final String thumbnailText;
    private final String thumbnailUrl;
    private final Integer titleColor;
    private final String titleText;

    @NotNull
    private final InviteType type;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/codedlinks/GuildInviteEmbedImpl$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/codedlinks/GuildInviteEmbedImpl;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return GuildInviteEmbedImpl$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ GuildInviteEmbedImpl(int i7, int i10, int i11, int i12, int i13, String str, InviteType inviteType, Integer num, Integer num2, Integer num3, String str2, String str3, Integer num4, Boolean bool, String str4, String str5, Boolean bool2, String str6, String str7, Integer num5, Integer num6, Boolean bool3, Integer num7, String str8, String str9, String str10, Integer num8, Integer num9, Integer num10, String str11, String str12, Integer num11, String str13, String str14, SerializationConstructorMarker serializationConstructorMarker) {
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (31 != (i7 & 31)) {
            e1.k(new int[]{i7, i10}, new int[]{31, 0}, GuildInviteEmbedImpl$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        super(defaultConstructorMarker);
        this.backgroundColor = i11;
        this.borderColor = i12;
        this.headerColor = i13;
        this.headerText = str;
        this.type = inviteType;
        if ((i7 & 32) == 0) {
            this.acceptLabelBackgroundColor = null;
        } else {
            this.acceptLabelBackgroundColor = num;
        }
        if ((i7 & 64) == 0) {
            this.acceptLabelBorderColor = null;
        } else {
            this.acceptLabelBorderColor = num2;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 0) {
            this.acceptLabelColor = null;
        } else {
            this.acceptLabelColor = num3;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 0) {
            this.acceptLabelText = null;
        } else {
            this.acceptLabelText = str2;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 0) {
            this.bodyText = null;
        } else {
            this.bodyText = str3;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) == 0) {
            this.bodyTextColor = null;
        } else {
            this.bodyTextColor = num4;
        }
        if ((i7 & RecyclerView.ItemAnimator.FLAG_MOVED) == 0) {
            this.canBeAccepted = null;
        } else {
            this.canBeAccepted = bool;
        }
        if ((i7 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) == 0) {
            this.channelIcon = null;
        } else {
            this.channelIcon = str4;
        }
        if ((i7 & 8192) == 0) {
            this.channelName = null;
        } else {
            this.channelName = str5;
        }
        if ((i7 & 16384) == 0) {
            this.embedCanBeTapped = null;
        } else {
            this.embedCanBeTapped = bool2;
        }
        if ((32768 & i7) == 0) {
            this.memberText = null;
        } else {
            this.memberText = str6;
        }
        if ((65536 & i7) == 0) {
            this.onlineText = null;
        } else {
            this.onlineText = str7;
        }
        if ((131072 & i7) == 0) {
            this.resolvingGradientEnd = null;
        } else {
            this.resolvingGradientEnd = num5;
        }
        if ((262144 & i7) == 0) {
            this.resolvingGradientStart = null;
        } else {
            this.resolvingGradientStart = num6;
        }
        if ((524288 & i7) == 0) {
            this.splashHasRadialGradient = null;
        } else {
            this.splashHasRadialGradient = bool3;
        }
        if ((1048576 & i7) == 0) {
            this.splashOpacity = null;
        } else {
            this.splashOpacity = num7;
        }
        if ((2097152 & i7) == 0) {
            this.splashUrl = null;
        } else {
            this.splashUrl = str8;
        }
        if ((4194304 & i7) == 0) {
            this.inviteSplash = null;
        } else {
            this.inviteSplash = str9;
        }
        if ((8388608 & i7) == 0) {
            this.subtitle = null;
        } else {
            this.subtitle = str10;
        }
        if ((16777216 & i7) == 0) {
            this.subtitleColor = null;
        } else {
            this.subtitleColor = num8;
        }
        if ((33554432 & i7) == 0) {
            this.thumbnailBackgroundColor = null;
        } else {
            this.thumbnailBackgroundColor = num9;
        }
        if ((67108864 & i7) == 0) {
            this.thumbnailCornerRadius = null;
        } else {
            this.thumbnailCornerRadius = num10;
        }
        if ((134217728 & i7) == 0) {
            this.thumbnailText = null;
        } else {
            this.thumbnailText = str11;
        }
        if ((268435456 & i7) == 0) {
            this.thumbnailUrl = null;
        } else {
            this.thumbnailUrl = str12;
        }
        if ((536870912 & i7) == 0) {
            this.titleColor = null;
        } else {
            this.titleColor = num11;
        }
        if ((1073741824 & i7) == 0) {
            this.titleText = null;
        } else {
            this.titleText = str13;
        }
        if ((i7 & Integer.MIN_VALUE) == 0) {
            this.badgeIconUrl = null;
        } else {
            this.badgeIconUrl = str14;
        }
    }

    public static /* synthetic */ GuildInviteEmbedImpl copy$default(GuildInviteEmbedImpl guildInviteEmbedImpl, int i7, int i10, int i11, String str, InviteType inviteType, Integer num, Integer num2, Integer num3, String str2, String str3, Integer num4, Boolean bool, String str4, String str5, Boolean bool2, String str6, String str7, Integer num5, Integer num6, Boolean bool3, Integer num7, String str8, String str9, String str10, Integer num8, Integer num9, Integer num10, String str11, String str12, Integer num11, String str13, String str14, int i12, Object obj) {
        String str15;
        String str16;
        int i13 = (i12 & 1) != 0 ? guildInviteEmbedImpl.backgroundColor : i7;
        int i14 = (i12 & 2) != 0 ? guildInviteEmbedImpl.borderColor : i10;
        int i15 = (i12 & 4) != 0 ? guildInviteEmbedImpl.headerColor : i11;
        String str17 = (i12 & 8) != 0 ? guildInviteEmbedImpl.headerText : str;
        InviteType inviteType2 = (i12 & 16) != 0 ? guildInviteEmbedImpl.type : inviteType;
        Integer num12 = (i12 & 32) != 0 ? guildInviteEmbedImpl.acceptLabelBackgroundColor : num;
        Integer num13 = (i12 & 64) != 0 ? guildInviteEmbedImpl.acceptLabelBorderColor : num2;
        Integer num14 = (i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? guildInviteEmbedImpl.acceptLabelColor : num3;
        String str18 = (i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? guildInviteEmbedImpl.acceptLabelText : str2;
        String str19 = (i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? guildInviteEmbedImpl.bodyText : str3;
        Integer num15 = (i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? guildInviteEmbedImpl.bodyTextColor : num4;
        Boolean bool4 = (i12 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? guildInviteEmbedImpl.canBeAccepted : bool;
        String str20 = (i12 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? guildInviteEmbedImpl.channelIcon : str4;
        String str21 = (i12 & 8192) != 0 ? guildInviteEmbedImpl.channelName : str5;
        int i16 = i13;
        Boolean bool5 = (i12 & 16384) != 0 ? guildInviteEmbedImpl.embedCanBeTapped : bool2;
        String str22 = (i12 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? guildInviteEmbedImpl.memberText : str6;
        String str23 = (i12 & 65536) != 0 ? guildInviteEmbedImpl.onlineText : str7;
        Integer num16 = (i12 & 131072) != 0 ? guildInviteEmbedImpl.resolvingGradientEnd : num5;
        Integer num17 = (i12 & 262144) != 0 ? guildInviteEmbedImpl.resolvingGradientStart : num6;
        Boolean bool6 = (i12 & 524288) != 0 ? guildInviteEmbedImpl.splashHasRadialGradient : bool3;
        Integer num18 = (i12 & 1048576) != 0 ? guildInviteEmbedImpl.splashOpacity : num7;
        String str24 = (i12 & 2097152) != 0 ? guildInviteEmbedImpl.splashUrl : str8;
        String str25 = (i12 & 4194304) != 0 ? guildInviteEmbedImpl.inviteSplash : str9;
        String str26 = (i12 & 8388608) != 0 ? guildInviteEmbedImpl.subtitle : str10;
        Integer num19 = (i12 & PointerEventHelper.X_FLAG_SUPPORTS_HOVER) != 0 ? guildInviteEmbedImpl.subtitleColor : num8;
        Integer num20 = (i12 & 33554432) != 0 ? guildInviteEmbedImpl.thumbnailBackgroundColor : num9;
        Integer num21 = (i12 & 67108864) != 0 ? guildInviteEmbedImpl.thumbnailCornerRadius : num10;
        String str27 = (i12 & 134217728) != 0 ? guildInviteEmbedImpl.thumbnailText : str11;
        String str28 = (i12 & 268435456) != 0 ? guildInviteEmbedImpl.thumbnailUrl : str12;
        Integer num22 = (i12 & 536870912) != 0 ? guildInviteEmbedImpl.titleColor : num11;
        String str29 = (i12 & 1073741824) != 0 ? guildInviteEmbedImpl.titleText : str13;
        if ((i12 & Integer.MIN_VALUE) != 0) {
            str16 = str29;
            str15 = guildInviteEmbedImpl.badgeIconUrl;
        } else {
            str15 = str14;
            str16 = str29;
        }
        return guildInviteEmbedImpl.copy(i16, i14, i15, str17, inviteType2, num12, num13, num14, str18, str19, num15, bool4, str20, str21, bool5, str22, str23, num16, num17, bool6, num18, str24, str25, str26, num19, num20, num21, str27, str28, num22, str16, str15);
    }

    public static final /* synthetic */ void write$Self$chat_release(GuildInviteEmbedImpl self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.l(0, self.getBackgroundColor(), serialDesc);
        output.l(1, self.getBorderColor(), serialDesc);
        output.l(2, self.getHeaderColor(), serialDesc);
        s1 s1Var = s1.f17602a;
        output.r(serialDesc, 3, s1Var, self.getHeaderText());
        output.g(serialDesc, 4, InviteType.Serializer.INSTANCE, self.getType());
        if (output.u(serialDesc, 5) || self.getAcceptLabelBackgroundColor() != null) {
            output.r(serialDesc, 5, m0.f17573a, self.getAcceptLabelBackgroundColor());
        }
        if (output.u(serialDesc, 6) || self.getAcceptLabelBorderColor() != null) {
            output.r(serialDesc, 6, m0.f17573a, self.getAcceptLabelBorderColor());
        }
        if (output.u(serialDesc, 7) || self.getAcceptLabelColor() != null) {
            output.r(serialDesc, 7, m0.f17573a, self.getAcceptLabelColor());
        }
        if (output.u(serialDesc, 8) || self.getAcceptLabelText() != null) {
            output.r(serialDesc, 8, s1Var, self.getAcceptLabelText());
        }
        if (output.u(serialDesc, 9) || self.getBodyText() != null) {
            output.r(serialDesc, 9, s1Var, self.getBodyText());
        }
        if (output.u(serialDesc, 10) || self.getBodyTextColor() != null) {
            output.r(serialDesc, 10, m0.f17573a, self.getBodyTextColor());
        }
        if (output.u(serialDesc, 11) || self.getCanBeAccepted() != null) {
            output.r(serialDesc, 11, g.f17537a, self.getCanBeAccepted());
        }
        if (output.u(serialDesc, 12) || self.getChannelIcon() != null) {
            output.r(serialDesc, 12, s1Var, self.getChannelIcon());
        }
        if (output.u(serialDesc, 13) || self.getChannelName() != null) {
            output.r(serialDesc, 13, s1Var, self.getChannelName());
        }
        if (output.u(serialDesc, 14) || self.getEmbedCanBeTapped() != null) {
            output.r(serialDesc, 14, g.f17537a, self.getEmbedCanBeTapped());
        }
        if (output.u(serialDesc, 15) || self.getMemberText() != null) {
            output.r(serialDesc, 15, s1Var, self.getMemberText());
        }
        if (output.u(serialDesc, 16) || self.getOnlineText() != null) {
            output.r(serialDesc, 16, s1Var, self.getOnlineText());
        }
        if (output.u(serialDesc, 17) || self.getResolvingGradientEnd() != null) {
            output.r(serialDesc, 17, m0.f17573a, self.getResolvingGradientEnd());
        }
        if (output.u(serialDesc, 18) || self.getResolvingGradientStart() != null) {
            output.r(serialDesc, 18, m0.f17573a, self.getResolvingGradientStart());
        }
        if (output.u(serialDesc, 19) || self.getSplashHasRadialGradient() != null) {
            output.r(serialDesc, 19, g.f17537a, self.getSplashHasRadialGradient());
        }
        if (output.u(serialDesc, 20) || self.getSplashOpacity() != null) {
            output.r(serialDesc, 20, m0.f17573a, self.getSplashOpacity());
        }
        if (output.u(serialDesc, 21) || self.getSplashUrl() != null) {
            output.r(serialDesc, 21, s1Var, self.getSplashUrl());
        }
        if (output.u(serialDesc, 22) || self.getInviteSplash() != null) {
            output.r(serialDesc, 22, s1Var, self.getInviteSplash());
        }
        if (output.u(serialDesc, 23) || self.getSubtitle() != null) {
            output.r(serialDesc, 23, s1Var, self.getSubtitle());
        }
        if (output.u(serialDesc, 24) || self.getSubtitleColor() != null) {
            output.r(serialDesc, 24, m0.f17573a, self.getSubtitleColor());
        }
        if (output.u(serialDesc, 25) || self.getThumbnailBackgroundColor() != null) {
            output.r(serialDesc, 25, m0.f17573a, self.getThumbnailBackgroundColor());
        }
        if (output.u(serialDesc, 26) || self.getThumbnailCornerRadius() != null) {
            output.r(serialDesc, 26, m0.f17573a, self.getThumbnailCornerRadius());
        }
        if (output.u(serialDesc, 27) || self.getThumbnailText() != null) {
            output.r(serialDesc, 27, s1Var, self.getThumbnailText());
        }
        if (output.u(serialDesc, 28) || self.getThumbnailUrl() != null) {
            output.r(serialDesc, 28, s1Var, self.getThumbnailUrl());
        }
        if (output.u(serialDesc, 29) || self.getTitleColor() != null) {
            output.r(serialDesc, 29, m0.f17573a, self.getTitleColor());
        }
        if (output.u(serialDesc, 30) || self.getTitleText() != null) {
            output.r(serialDesc, 30, s1Var, self.getTitleText());
        }
        if (!output.u(serialDesc, 31) && self.getBadgeIconUrl() == null) {
            return;
        }
        output.r(serialDesc, 31, s1Var, self.getBadgeIconUrl());
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getBodyText() {
        return this.bodyText;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Integer getBodyTextColor() {
        return this.bodyTextColor;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Boolean getCanBeAccepted() {
        return this.canBeAccepted;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getChannelIcon() {
        return this.channelIcon;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getChannelName() {
        return this.channelName;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Boolean getEmbedCanBeTapped() {
        return this.embedCanBeTapped;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getMemberText() {
        return this.memberText;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getOnlineText() {
        return this.onlineText;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final Integer getResolvingGradientEnd() {
        return this.resolvingGradientEnd;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final Integer getResolvingGradientStart() {
        return this.resolvingGradientStart;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getBorderColor() {
        return this.borderColor;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final Boolean getSplashHasRadialGradient() {
        return this.splashHasRadialGradient;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final Integer getSplashOpacity() {
        return this.splashOpacity;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getSplashUrl() {
        return this.splashUrl;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getInviteSplash() {
        return this.inviteSplash;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final Integer getSubtitleColor() {
        return this.subtitleColor;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final Integer getThumbnailBackgroundColor() {
        return this.thumbnailBackgroundColor;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final Integer getThumbnailCornerRadius() {
        return this.thumbnailCornerRadius;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final String getThumbnailText() {
        return this.thumbnailText;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getHeaderColor() {
        return this.headerColor;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final Integer getTitleColor() {
        return this.titleColor;
    }

    /* JADX INFO: renamed from: component31, reason: from getter */
    public final String getTitleText() {
        return this.titleText;
    }

    /* JADX INFO: renamed from: component32, reason: from getter */
    public final String getBadgeIconUrl() {
        return this.badgeIconUrl;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getHeaderText() {
        return this.headerText;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final InviteType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getAcceptLabelBackgroundColor() {
        return this.acceptLabelBackgroundColor;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getAcceptLabelBorderColor() {
        return this.acceptLabelBorderColor;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getAcceptLabelColor() {
        return this.acceptLabelColor;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getAcceptLabelText() {
        return this.acceptLabelText;
    }

    @NotNull
    public final GuildInviteEmbedImpl copy(int backgroundColor, int borderColor, int headerColor, String headerText, @NotNull InviteType type, Integer acceptLabelBackgroundColor, Integer acceptLabelBorderColor, Integer acceptLabelColor, String acceptLabelText, String bodyText, Integer bodyTextColor, Boolean canBeAccepted, String channelIcon, String channelName, Boolean embedCanBeTapped, String memberText, String onlineText, Integer resolvingGradientEnd, Integer resolvingGradientStart, Boolean splashHasRadialGradient, Integer splashOpacity, String splashUrl, String inviteSplash, String subtitle, Integer subtitleColor, Integer thumbnailBackgroundColor, Integer thumbnailCornerRadius, String thumbnailText, String thumbnailUrl, Integer titleColor, String titleText, String badgeIconUrl) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new GuildInviteEmbedImpl(backgroundColor, borderColor, headerColor, headerText, type, acceptLabelBackgroundColor, acceptLabelBorderColor, acceptLabelColor, acceptLabelText, bodyText, bodyTextColor, canBeAccepted, channelIcon, channelName, embedCanBeTapped, memberText, onlineText, resolvingGradientEnd, resolvingGradientStart, splashHasRadialGradient, splashOpacity, splashUrl, inviteSplash, subtitle, subtitleColor, thumbnailBackgroundColor, thumbnailCornerRadius, thumbnailText, thumbnailUrl, titleColor, titleText, badgeIconUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GuildInviteEmbedImpl)) {
            return false;
        }
        GuildInviteEmbedImpl guildInviteEmbedImpl = (GuildInviteEmbedImpl) other;
        return this.backgroundColor == guildInviteEmbedImpl.backgroundColor && this.borderColor == guildInviteEmbedImpl.borderColor && this.headerColor == guildInviteEmbedImpl.headerColor && Intrinsics.areEqual(this.headerText, guildInviteEmbedImpl.headerText) && this.type == guildInviteEmbedImpl.type && Intrinsics.areEqual(this.acceptLabelBackgroundColor, guildInviteEmbedImpl.acceptLabelBackgroundColor) && Intrinsics.areEqual(this.acceptLabelBorderColor, guildInviteEmbedImpl.acceptLabelBorderColor) && Intrinsics.areEqual(this.acceptLabelColor, guildInviteEmbedImpl.acceptLabelColor) && Intrinsics.areEqual(this.acceptLabelText, guildInviteEmbedImpl.acceptLabelText) && Intrinsics.areEqual(this.bodyText, guildInviteEmbedImpl.bodyText) && Intrinsics.areEqual(this.bodyTextColor, guildInviteEmbedImpl.bodyTextColor) && Intrinsics.areEqual(this.canBeAccepted, guildInviteEmbedImpl.canBeAccepted) && Intrinsics.areEqual(this.channelIcon, guildInviteEmbedImpl.channelIcon) && Intrinsics.areEqual(this.channelName, guildInviteEmbedImpl.channelName) && Intrinsics.areEqual(this.embedCanBeTapped, guildInviteEmbedImpl.embedCanBeTapped) && Intrinsics.areEqual(this.memberText, guildInviteEmbedImpl.memberText) && Intrinsics.areEqual(this.onlineText, guildInviteEmbedImpl.onlineText) && Intrinsics.areEqual(this.resolvingGradientEnd, guildInviteEmbedImpl.resolvingGradientEnd) && Intrinsics.areEqual(this.resolvingGradientStart, guildInviteEmbedImpl.resolvingGradientStart) && Intrinsics.areEqual(this.splashHasRadialGradient, guildInviteEmbedImpl.splashHasRadialGradient) && Intrinsics.areEqual(this.splashOpacity, guildInviteEmbedImpl.splashOpacity) && Intrinsics.areEqual(this.splashUrl, guildInviteEmbedImpl.splashUrl) && Intrinsics.areEqual(this.inviteSplash, guildInviteEmbedImpl.inviteSplash) && Intrinsics.areEqual(this.subtitle, guildInviteEmbedImpl.subtitle) && Intrinsics.areEqual(this.subtitleColor, guildInviteEmbedImpl.subtitleColor) && Intrinsics.areEqual(this.thumbnailBackgroundColor, guildInviteEmbedImpl.thumbnailBackgroundColor) && Intrinsics.areEqual(this.thumbnailCornerRadius, guildInviteEmbedImpl.thumbnailCornerRadius) && Intrinsics.areEqual(this.thumbnailText, guildInviteEmbedImpl.thumbnailText) && Intrinsics.areEqual(this.thumbnailUrl, guildInviteEmbedImpl.thumbnailUrl) && Intrinsics.areEqual(this.titleColor, guildInviteEmbedImpl.titleColor) && Intrinsics.areEqual(this.titleText, guildInviteEmbedImpl.titleText) && Intrinsics.areEqual(this.badgeIconUrl, guildInviteEmbedImpl.badgeIconUrl);
    }

    @Override // com.discord.chat.bridge.codedlinks.CodedLinkEmbed
    public Integer getAcceptLabelBackgroundColor() {
        return this.acceptLabelBackgroundColor;
    }

    @Override // com.discord.chat.bridge.codedlinks.CodedLinkEmbed
    public Integer getAcceptLabelBorderColor() {
        return this.acceptLabelBorderColor;
    }

    @Override // com.discord.chat.bridge.codedlinks.CodedLinkEmbed
    public Integer getAcceptLabelColor() {
        return this.acceptLabelColor;
    }

    @Override // com.discord.chat.bridge.codedlinks.CodedLinkEmbed
    public String getAcceptLabelText() {
        return this.acceptLabelText;
    }

    @Override // com.discord.chat.bridge.codedlinks.CodedLinkEmbed
    public int getBackgroundColor() {
        return this.backgroundColor;
    }

    @Override // com.discord.chat.bridge.codedlinks.GuildInviteEmbed
    public String getBadgeIconUrl() {
        return this.badgeIconUrl;
    }

    @Override // com.discord.chat.bridge.codedlinks.CodedLinkEmbed
    public String getBodyText() {
        return this.bodyText;
    }

    @Override // com.discord.chat.bridge.codedlinks.CodedLinkEmbed
    public Integer getBodyTextColor() {
        return this.bodyTextColor;
    }

    @Override // com.discord.chat.bridge.codedlinks.CodedLinkEmbed
    public int getBorderColor() {
        return this.borderColor;
    }

    @Override // com.discord.chat.bridge.codedlinks.CodedLinkEmbed
    public Boolean getCanBeAccepted() {
        return this.canBeAccepted;
    }

    @Override // com.discord.chat.bridge.codedlinks.GuildInviteEmbed
    public String getChannelIcon() {
        return this.channelIcon;
    }

    @Override // com.discord.chat.bridge.codedlinks.GuildInviteEmbed
    public String getChannelName() {
        return this.channelName;
    }

    @Override // com.discord.chat.bridge.codedlinks.CodedLinkEmbed
    public Boolean getEmbedCanBeTapped() {
        return this.embedCanBeTapped;
    }

    @Override // com.discord.chat.bridge.codedlinks.CodedLinkEmbed
    public int getHeaderColor() {
        return this.headerColor;
    }

    @Override // com.discord.chat.bridge.codedlinks.CodedLinkEmbed
    public String getHeaderText() {
        return this.headerText;
    }

    @Override // com.discord.chat.bridge.codedlinks.CodedLinkEmbed
    public String getInviteSplash() {
        return this.inviteSplash;
    }

    @Override // com.discord.chat.bridge.codedlinks.GuildInviteEmbed
    public String getMemberText() {
        return this.memberText;
    }

    @Override // com.discord.chat.bridge.codedlinks.GuildInviteEmbed
    public String getOnlineText() {
        return this.onlineText;
    }

    @Override // com.discord.chat.bridge.codedlinks.CodedLinkEmbed
    public Integer getResolvingGradientEnd() {
        return this.resolvingGradientEnd;
    }

    @Override // com.discord.chat.bridge.codedlinks.CodedLinkEmbed
    public Integer getResolvingGradientStart() {
        return this.resolvingGradientStart;
    }

    @Override // com.discord.chat.bridge.codedlinks.CodedLinkEmbed
    public Boolean getSplashHasRadialGradient() {
        return this.splashHasRadialGradient;
    }

    @Override // com.discord.chat.bridge.codedlinks.CodedLinkEmbed
    public Integer getSplashOpacity() {
        return this.splashOpacity;
    }

    @Override // com.discord.chat.bridge.codedlinks.CodedLinkEmbed
    public String getSplashUrl() {
        return this.splashUrl;
    }

    @Override // com.discord.chat.bridge.codedlinks.CodedLinkEmbed
    public String getSubtitle() {
        return this.subtitle;
    }

    @Override // com.discord.chat.bridge.codedlinks.CodedLinkEmbed
    public Integer getSubtitleColor() {
        return this.subtitleColor;
    }

    @Override // com.discord.chat.bridge.codedlinks.CodedLinkEmbed
    public Integer getThumbnailBackgroundColor() {
        return this.thumbnailBackgroundColor;
    }

    @Override // com.discord.chat.bridge.codedlinks.CodedLinkEmbed
    public Integer getThumbnailCornerRadius() {
        return this.thumbnailCornerRadius;
    }

    @Override // com.discord.chat.bridge.codedlinks.CodedLinkEmbed
    public String getThumbnailText() {
        return this.thumbnailText;
    }

    @Override // com.discord.chat.bridge.codedlinks.CodedLinkEmbed
    public String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    @Override // com.discord.chat.bridge.codedlinks.CodedLinkEmbed
    public Integer getTitleColor() {
        return this.titleColor;
    }

    @Override // com.discord.chat.bridge.codedlinks.CodedLinkEmbed
    public String getTitleText() {
        return this.titleText;
    }

    @Override // com.discord.chat.bridge.codedlinks.CodedLinkEmbed
    @NotNull
    public InviteType getType() {
        return this.type;
    }

    public int hashCode() {
        int iU = a.u(this.headerColor, a.u(this.borderColor, Integer.hashCode(this.backgroundColor) * 31, 31), 31);
        String str = this.headerText;
        int iHashCode = (this.type.hashCode() + ((iU + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        Integer num = this.acceptLabelBackgroundColor;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.acceptLabelBorderColor;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.acceptLabelColor;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str2 = this.acceptLabelText;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.bodyText;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num4 = this.bodyTextColor;
        int iHashCode7 = (iHashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Boolean bool = this.canBeAccepted;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.channelIcon;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.channelName;
        int iHashCode10 = (iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool2 = this.embedCanBeTapped;
        int iHashCode11 = (iHashCode10 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str6 = this.memberText;
        int iHashCode12 = (iHashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.onlineText;
        int iHashCode13 = (iHashCode12 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num5 = this.resolvingGradientEnd;
        int iHashCode14 = (iHashCode13 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.resolvingGradientStart;
        int iHashCode15 = (iHashCode14 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Boolean bool3 = this.splashHasRadialGradient;
        int iHashCode16 = (iHashCode15 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Integer num7 = this.splashOpacity;
        int iHashCode17 = (iHashCode16 + (num7 == null ? 0 : num7.hashCode())) * 31;
        String str8 = this.splashUrl;
        int iHashCode18 = (iHashCode17 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.inviteSplash;
        int iHashCode19 = (iHashCode18 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.subtitle;
        int iHashCode20 = (iHashCode19 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Integer num8 = this.subtitleColor;
        int iHashCode21 = (iHashCode20 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.thumbnailBackgroundColor;
        int iHashCode22 = (iHashCode21 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.thumbnailCornerRadius;
        int iHashCode23 = (iHashCode22 + (num10 == null ? 0 : num10.hashCode())) * 31;
        String str11 = this.thumbnailText;
        int iHashCode24 = (iHashCode23 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.thumbnailUrl;
        int iHashCode25 = (iHashCode24 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Integer num11 = this.titleColor;
        int iHashCode26 = (iHashCode25 + (num11 == null ? 0 : num11.hashCode())) * 31;
        String str13 = this.titleText;
        int iHashCode27 = (iHashCode26 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.badgeIconUrl;
        return iHashCode27 + (str14 != null ? str14.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i7 = this.backgroundColor;
        int i10 = this.borderColor;
        int i11 = this.headerColor;
        String str = this.headerText;
        InviteType inviteType = this.type;
        Integer num = this.acceptLabelBackgroundColor;
        Integer num2 = this.acceptLabelBorderColor;
        Integer num3 = this.acceptLabelColor;
        String str2 = this.acceptLabelText;
        String str3 = this.bodyText;
        Integer num4 = this.bodyTextColor;
        Boolean bool = this.canBeAccepted;
        String str4 = this.channelIcon;
        String str5 = this.channelName;
        Boolean bool2 = this.embedCanBeTapped;
        String str6 = this.memberText;
        String str7 = this.onlineText;
        Integer num5 = this.resolvingGradientEnd;
        Integer num6 = this.resolvingGradientStart;
        Boolean bool3 = this.splashHasRadialGradient;
        Integer num7 = this.splashOpacity;
        String str8 = this.splashUrl;
        String str9 = this.inviteSplash;
        String str10 = this.subtitle;
        Integer num8 = this.subtitleColor;
        Integer num9 = this.thumbnailBackgroundColor;
        Integer num10 = this.thumbnailCornerRadius;
        String str11 = this.thumbnailText;
        String str12 = this.thumbnailUrl;
        Integer num11 = this.titleColor;
        String str13 = this.titleText;
        String str14 = this.badgeIconUrl;
        StringBuilder sbR = e.r(i7, "GuildInviteEmbedImpl(backgroundColor=", i10, ", borderColor=", ", headerColor=");
        sbR.append(i11);
        sbR.append(", headerText=");
        sbR.append(str);
        sbR.append(", type=");
        sbR.append(inviteType);
        sbR.append(", acceptLabelBackgroundColor=");
        sbR.append(num);
        sbR.append(", acceptLabelBorderColor=");
        b.s(sbR, num2, ", acceptLabelColor=", num3, ", acceptLabelText=");
        e.A(sbR, str2, ", bodyText=", str3, ", bodyTextColor=");
        sbR.append(num4);
        sbR.append(", canBeAccepted=");
        sbR.append(bool);
        sbR.append(", channelIcon=");
        e.A(sbR, str4, ", channelName=", str5, ", embedCanBeTapped=");
        sbR.append(bool2);
        sbR.append(", memberText=");
        sbR.append(str6);
        sbR.append(", onlineText=");
        a.r(num5, str7, ", resolvingGradientEnd=", ", resolvingGradientStart=", sbR);
        sbR.append(num6);
        sbR.append(", splashHasRadialGradient=");
        sbR.append(bool3);
        sbR.append(", splashOpacity=");
        b.r(num7, ", splashUrl=", str8, ", inviteSplash=", sbR);
        e.A(sbR, str9, ", subtitle=", str10, ", subtitleColor=");
        b.s(sbR, num8, ", thumbnailBackgroundColor=", num9, ", thumbnailCornerRadius=");
        b.r(num10, ", thumbnailText=", str11, ", thumbnailUrl=", sbR);
        a.r(num11, str12, ", titleColor=", ", titleText=", sbR);
        return a.l(sbR, str13, ", badgeIconUrl=", str14, ")");
    }

    public /* synthetic */ GuildInviteEmbedImpl(int i7, int i10, int i11, String str, InviteType inviteType, Integer num, Integer num2, Integer num3, String str2, String str3, Integer num4, Boolean bool, String str4, String str5, Boolean bool2, String str6, String str7, Integer num5, Integer num6, Boolean bool3, Integer num7, String str8, String str9, String str10, Integer num8, Integer num9, Integer num10, String str11, String str12, Integer num11, String str13, String str14, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i7, i10, i11, str, inviteType, (i12 & 32) != 0 ? null : num, (i12 & 64) != 0 ? null : num2, (i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? null : num3, (i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : str2, (i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? null : str3, (i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? null : num4, (i12 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? null : bool, (i12 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : str4, (i12 & 8192) != 0 ? null : str5, (i12 & 16384) != 0 ? null : bool2, (32768 & i12) != 0 ? null : str6, (65536 & i12) != 0 ? null : str7, (131072 & i12) != 0 ? null : num5, (262144 & i12) != 0 ? null : num6, (524288 & i12) != 0 ? null : bool3, (1048576 & i12) != 0 ? null : num7, (2097152 & i12) != 0 ? null : str8, (4194304 & i12) != 0 ? null : str9, (8388608 & i12) != 0 ? null : str10, (16777216 & i12) != 0 ? null : num8, (33554432 & i12) != 0 ? null : num9, (67108864 & i12) != 0 ? null : num10, (134217728 & i12) != 0 ? null : str11, (268435456 & i12) != 0 ? null : str12, (536870912 & i12) != 0 ? null : num11, (1073741824 & i12) != 0 ? null : str13, (i12 & Integer.MIN_VALUE) != 0 ? null : str14);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GuildInviteEmbedImpl(int i7, int i10, int i11, String str, @NotNull InviteType type, Integer num, Integer num2, Integer num3, String str2, String str3, Integer num4, Boolean bool, String str4, String str5, Boolean bool2, String str6, String str7, Integer num5, Integer num6, Boolean bool3, Integer num7, String str8, String str9, String str10, Integer num8, Integer num9, Integer num10, String str11, String str12, Integer num11, String str13, String str14) {
        super(null);
        Intrinsics.checkNotNullParameter(type, "type");
        this.backgroundColor = i7;
        this.borderColor = i10;
        this.headerColor = i11;
        this.headerText = str;
        this.type = type;
        this.acceptLabelBackgroundColor = num;
        this.acceptLabelBorderColor = num2;
        this.acceptLabelColor = num3;
        this.acceptLabelText = str2;
        this.bodyText = str3;
        this.bodyTextColor = num4;
        this.canBeAccepted = bool;
        this.channelIcon = str4;
        this.channelName = str5;
        this.embedCanBeTapped = bool2;
        this.memberText = str6;
        this.onlineText = str7;
        this.resolvingGradientEnd = num5;
        this.resolvingGradientStart = num6;
        this.splashHasRadialGradient = bool3;
        this.splashOpacity = num7;
        this.splashUrl = str8;
        this.inviteSplash = str9;
        this.subtitle = str10;
        this.subtitleColor = num8;
        this.thumbnailBackgroundColor = num9;
        this.thumbnailCornerRadius = num10;
        this.thumbnailText = str11;
        this.thumbnailUrl = str12;
        this.titleColor = num11;
        this.titleText = str13;
        this.badgeIconUrl = str14;
    }
}
