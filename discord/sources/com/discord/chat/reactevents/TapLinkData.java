package com.discord.chat.reactevents;

import a3.e;
import com.discord.chat.bridge.contentnode.LinkContentNode;
import com.discord.chat.bridge.contentnode.LinkContextData;
import com.discord.logging.Log;
import com.discord.notifications.renderer.NotificationRenderer;
import com.discord.primitives.ChannelId;
import com.discord.primitives.GuildId;
import com.discord.primitives.MessageId;
import com.discord.primitives.UserId;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.discord.reactevents.ReactEvent;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.modules.dialog.AlertFragment;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nB\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\t\u0010\rJ\f\u0010\u0015\u001a\u00020\u0016*\u00020\u0007H\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u000fJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J>\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006("}, d2 = {"Lcom/discord/chat/reactevents/TapLinkData;", "Lcom/discord/reactevents/ReactEvent;", "messageId", "Lcom/discord/primitives/MessageId;", AlertFragment.ARG_TITLE, "", "target", "Lcom/discord/chat/bridge/contentnode/LinkContextData;", "content", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/contentnode/LinkContextData;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "node", "Lcom/discord/chat/bridge/contentnode/LinkContentNode;", "(Ljava/lang/String;Lcom/discord/chat/bridge/contentnode/LinkContentNode;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getMessageId-N_6c4I0", "()Ljava/lang/String;", "Ljava/lang/String;", "getTitle", "getTarget", "()Lcom/discord/chat/bridge/contentnode/LinkContextData;", "getContent", "toMap", "Lcom/facebook/react/bridge/WritableNativeMap;", "serialize", "Lcom/facebook/react/bridge/WritableMap;", "component1", "component1-N_6c4I0", "component2", "component3", "component4", "copy", "copy-Efb-KrI", "(Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/contentnode/LinkContextData;Ljava/lang/String;)Lcom/discord/chat/reactevents/TapLinkData;", "equals", "", "other", "", "hashCode", "", "toString", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTapLinkData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TapLinkData.kt\ncom/discord/chat/reactevents/TapLinkData\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,147:1\n1#2:148\n*E\n"})
public final /* data */ class TapLinkData implements ReactEvent {

    @NotNull
    private final String content;
    private final String messageId;
    private final LinkContextData target;
    private final String title;

    public /* synthetic */ TapLinkData(String str, LinkContentNode linkContentNode, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, linkContentNode);
    }

    /* JADX INFO: renamed from: copy-Efb-KrI$default, reason: not valid java name */
    public static /* synthetic */ TapLinkData m883copyEfbKrI$default(TapLinkData tapLinkData, String str, String str2, LinkContextData linkContextData, String str3, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = tapLinkData.messageId;
        }
        if ((i7 & 2) != 0) {
            str2 = tapLinkData.title;
        }
        if ((i7 & 4) != 0) {
            linkContextData = tapLinkData.target;
        }
        if ((i7 & 8) != 0) {
            str3 = tapLinkData.content;
        }
        return tapLinkData.m885copyEfbKrI(str, str2, linkContextData, str3);
    }

    private final WritableNativeMap toMap(LinkContextData linkContextData) {
        WritableNativeMap writableNativeMapNativeMapOf = NativeMapExtensionsKt.nativeMapOf(new Pair[0]);
        LinkContextData linkContextData2 = this.target;
        if (linkContextData2 instanceof LinkContextData.LinkUrl) {
            NativeMapExtensionsKt.put(writableNativeMapNativeMapOf, "url", ((LinkContextData.LinkUrl) linkContextData2).getUrl());
            NativeMapExtensionsKt.put(writableNativeMapNativeMapOf, "node", NativeMapExtensionsKt.nativeMapOf(new Pair(AlertFragment.ARG_TITLE, this.title), new Pair("target", ((LinkContextData.LinkUrl) this.target).getUrl()), new Pair("content", this.content)));
            return writableNativeMapNativeMapOf;
        }
        if (linkContextData2 instanceof LinkContextData.BindOpenThreadChannel) {
            NativeMapExtensionsKt.put(writableNativeMapNativeMapOf, "action", ((LinkContextData.BindOpenThreadChannel) linkContextData2).getAction());
            NativeMapExtensionsKt.put(writableNativeMapNativeMapOf, "threadId", ChannelId.m1137toStringimpl(((LinkContextData.BindOpenThreadChannel) this.target).m364getThreadIdo4g7jtM()));
            return writableNativeMapNativeMapOf;
        }
        if (linkContextData2 instanceof LinkContextData.BindUserMenu) {
            NativeMapExtensionsKt.put(writableNativeMapNativeMapOf, "action", ((LinkContextData.BindUserMenu) linkContextData2).getAction());
            NativeMapExtensionsKt.put(writableNativeMapNativeMapOf, "userId", UserId.m1215toStringimpl(((LinkContextData.BindUserMenu) this.target).m392getUserIdre6GcUE()));
            ChannelId channelIdM391getMessageChannelIdqMVnFVQ = ((LinkContextData.BindUserMenu) this.target).m391getMessageChannelIdqMVnFVQ();
            if (channelIdM391getMessageChannelIdqMVnFVQ != null) {
                NativeMapExtensionsKt.put(writableNativeMapNativeMapOf, "messageChannelId", ChannelId.m1137toStringimpl(channelIdM391getMessageChannelIdqMVnFVQ.m1139unboximpl()));
                return writableNativeMapNativeMapOf;
            }
        } else {
            if (linkContextData2 instanceof LinkContextData.BindTapCommandName) {
                NativeMapExtensionsKt.put(writableNativeMapNativeMapOf, "action", ((LinkContextData.BindTapCommandName) linkContextData2).getAction());
                NativeMapExtensionsKt.put(writableNativeMapNativeMapOf, "userId", UserId.m1215toStringimpl(((LinkContextData.BindTapCommandName) this.target).m380getUserIdre6GcUE()));
                NativeMapExtensionsKt.put(writableNativeMapNativeMapOf, "messageType", Integer.valueOf(((LinkContextData.BindTapCommandName) this.target).getMessageType().getSerialNumber()));
                NativeMapExtensionsKt.put(writableNativeMapNativeMapOf, "messageId", MessageId.m1163toStringimpl(((LinkContextData.BindTapCommandName) this.target).m379getMessageId3Eiw7ao()));
                NativeMapExtensionsKt.put(writableNativeMapNativeMapOf, "applicationUserId", UserId.m1215toStringimpl(((LinkContextData.BindTapCommandName) this.target).m377getApplicationUserIdre6GcUE()));
                NativeMapExtensionsKt.put(writableNativeMapNativeMapOf, "messageChannelId", ChannelId.m1137toStringimpl(((LinkContextData.BindTapCommandName) this.target).m378getMessageChannelIdo4g7jtM()));
                return writableNativeMapNativeMapOf;
            }
            if (linkContextData2 instanceof LinkContextData.BindOpenPins) {
                NativeMapExtensionsKt.put(writableNativeMapNativeMapOf, "action", ((LinkContextData.BindOpenPins) linkContextData2).getAction());
                NativeMapExtensionsKt.put(writableNativeMapNativeMapOf, "messageChannelId", ChannelId.m1137toStringimpl(((LinkContextData.BindOpenPins) this.target).m360getMessageChannelIdo4g7jtM()));
                return writableNativeMapNativeMapOf;
            }
            if (linkContextData2 instanceof LinkContextData.BindGuildMenu) {
                NativeMapExtensionsKt.put(writableNativeMapNativeMapOf, "action", ((LinkContextData.BindGuildMenu) linkContextData2).getAction());
                LinkContextData.BindGuildMenu.MessageReference messageReference = ((LinkContextData.BindGuildMenu) this.target).getMessageReference();
                if (messageReference != null) {
                    WritableNativeMap writableNativeMapNativeMapOf2 = NativeMapExtensionsKt.nativeMapOf(new Pair[0]);
                    NativeMapExtensionsKt.put(writableNativeMapNativeMapOf2, "channel_id", ChannelId.m1137toStringimpl(messageReference.m343getChannelIdo4g7jtM()));
                    GuildId guildIdM344getGuildIdqOKuAAo = messageReference.m344getGuildIdqOKuAAo();
                    if (guildIdM344getGuildIdqOKuAAo != null) {
                        guildIdM344getGuildIdqOKuAAo.m1152unboximpl();
                        NativeMapExtensionsKt.put(writableNativeMapNativeMapOf2, "guild_id", ((LinkContextData.BindGuildMenu) this.target).toString());
                    }
                    Unit unit = Unit.f14616a;
                    NativeMapExtensionsKt.put(writableNativeMapNativeMapOf, "messageReference", writableNativeMapNativeMapOf2);
                    return writableNativeMapNativeMapOf;
                }
            } else {
                if (linkContextData2 instanceof LinkContextData.BindDismissMessage) {
                    NativeMapExtensionsKt.put(writableNativeMapNativeMapOf, "action", ((LinkContextData.BindDismissMessage) linkContextData2).getAction());
                    NativeMapExtensionsKt.put(writableNativeMapNativeMapOf, "message", NativeMapExtensionsKt.nativeMapOf(new Pair(StackTraceHelper.ID_KEY, ((LinkContextData.BindDismissMessage) this.target).getMessage().m336getId3Eiw7ao()), new Pair("channel_id", ChannelId.m1137toStringimpl(((LinkContextData.BindDismissMessage) this.target).getMessage().m335getChannelIdo4g7jtM())), new Pair("loggingName", ((LinkContextData.BindDismissMessage) this.target).getMessage().getLoggingName()), new Pair("author", NativeMapExtensionsKt.nativeMapOf(new Pair(NotificationRenderer.USERNAME, ((LinkContextData.BindDismissMessage) this.target).getMessage().getAuthor().getUsername())))));
                    return writableNativeMapNativeMapOf;
                }
                if (linkContextData2 instanceof LinkContextData.BindOpenRoleSubscriptionOverview) {
                    NativeMapExtensionsKt.put(writableNativeMapNativeMapOf, "action", ((LinkContextData.BindOpenRoleSubscriptionOverview) linkContextData2).getAction());
                    NativeMapExtensionsKt.put(writableNativeMapNativeMapOf, "guildId", ((LinkContextData.BindOpenRoleSubscriptionOverview) this.target).getGuildId());
                    NativeMapExtensionsKt.put(writableNativeMapNativeMapOf, "channelId", ((LinkContextData.BindOpenRoleSubscriptionOverview) this.target).getChannelId());
                    NativeMapExtensionsKt.put(writableNativeMapNativeMapOf, "messageId", ((LinkContextData.BindOpenRoleSubscriptionOverview) this.target).getMessageId());
                    NativeMapExtensionsKt.put(writableNativeMapNativeMapOf, "roleSubscriptionListingId", ((LinkContextData.BindOpenRoleSubscriptionOverview) this.target).getRoleSubscriptionListingId());
                    return writableNativeMapNativeMapOf;
                }
                if (linkContextData2 instanceof LinkContextData.BindUserSurvey) {
                    NativeMapExtensionsKt.put(writableNativeMapNativeMapOf, "action", ((LinkContextData.BindUserSurvey) linkContextData2).getAction());
                    NativeMapExtensionsKt.put(writableNativeMapNativeMapOf, "message", NativeMapExtensionsKt.nativeMapOf(new Pair(StackTraceHelper.ID_KEY, ((LinkContextData.BindUserSurvey) this.target).getMessage().m399getId3Eiw7ao()), new Pair("channel_id", ChannelId.m1137toStringimpl(((LinkContextData.BindUserSurvey) this.target).getMessage().m398getChannelIdo4g7jtM())), new Pair("loggingName", ((LinkContextData.BindUserSurvey) this.target).getMessage().getLoggingName())));
                    NativeMapExtensionsKt.put(writableNativeMapNativeMapOf, "notificationType", ((LinkContextData.BindUserSurvey) this.target).getNotificationType());
                    return writableNativeMapNativeMapOf;
                }
                if (linkContextData2 instanceof LinkContextData.BindJumpToMessage) {
                    NativeMapExtensionsKt.put(writableNativeMapNativeMapOf, "action", ((LinkContextData.BindJumpToMessage) linkContextData2).getAction());
                    NativeMapExtensionsKt.put(writableNativeMapNativeMapOf, "targetChannelId", ((LinkContextData.BindJumpToMessage) this.target).getTargetChannelId());
                    NativeMapExtensionsKt.put(writableNativeMapNativeMapOf, "targetMessageId", ((LinkContextData.BindJumpToMessage) this.target).getTargetMessageId());
                    return writableNativeMapNativeMapOf;
                }
                if (linkContextData2 instanceof LinkContextData.BindOpenUrl) {
                    NativeMapExtensionsKt.put(writableNativeMapNativeMapOf, "url", ((LinkContextData.BindOpenUrl) linkContextData2).getUrl());
                    NativeMapExtensionsKt.put(writableNativeMapNativeMapOf, "linkColor", ((LinkContextData.BindOpenUrl) this.target).getLinkColor());
                    return writableNativeMapNativeMapOf;
                }
                if (linkContextData2 instanceof LinkContextData.BindOpenGdmCustomizeActionSheet) {
                    NativeMapExtensionsKt.put(writableNativeMapNativeMapOf, "action", ((LinkContextData.BindOpenGdmCustomizeActionSheet) linkContextData2).getAction());
                    NativeMapExtensionsKt.put(writableNativeMapNativeMapOf, "messageChannelId", ((LinkContextData.BindOpenGdmCustomizeActionSheet) this.target).getMessageChannelId());
                    NativeMapExtensionsKt.put(writableNativeMapNativeMapOf, "linkColor", ((LinkContextData.BindOpenGdmCustomizeActionSheet) this.target).getLinkColor());
                    return writableNativeMapNativeMapOf;
                }
                if (!(linkContextData2 instanceof LinkContextData.BindInsertText)) {
                    Log.e$default(Log.INSTANCE, "TapLink", "Missing target type data: " + linkContextData2, (Throwable) null, 4, (Object) null);
                    return writableNativeMapNativeMapOf;
                }
                NativeMapExtensionsKt.put(writableNativeMapNativeMapOf, "action", ((LinkContextData.BindInsertText) linkContextData2).getAction());
                NativeMapExtensionsKt.put(writableNativeMapNativeMapOf, "text", ((LinkContextData.BindInsertText) this.target).getText());
                Boolean addSpace = ((LinkContextData.BindInsertText) this.target).getAddSpace();
                if (addSpace != null) {
                    NativeMapExtensionsKt.put(writableNativeMapNativeMapOf, "addSpace", addSpace);
                }
            }
        }
        return writableNativeMapNativeMapOf;
    }

    /* JADX INFO: renamed from: component1-N_6c4I0, reason: not valid java name and from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final LinkContextData getTarget() {
        return this.target;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-Efb-KrI, reason: not valid java name */
    public final TapLinkData m885copyEfbKrI(String messageId, String title, LinkContextData target, @NotNull String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        return new TapLinkData(messageId, title, target, content, null);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0016  */
    public boolean equals(Object other) {
        boolean zM1160equalsimpl0;
        if (this == other) {
            return true;
        }
        if (!(other instanceof TapLinkData)) {
            return false;
        }
        TapLinkData tapLinkData = (TapLinkData) other;
        String str = this.messageId;
        String str2 = tapLinkData.messageId;
        if (str == null) {
            if (str2 == null) {
                zM1160equalsimpl0 = true;
            } else {
                zM1160equalsimpl0 = false;
            }
        } else if (str2 == null) {
            zM1160equalsimpl0 = false;
        } else {
            zM1160equalsimpl0 = MessageId.m1160equalsimpl0(str, str2);
        }
        return zM1160equalsimpl0 && Intrinsics.areEqual(this.title, tapLinkData.title) && Intrinsics.areEqual(this.target, tapLinkData.target) && Intrinsics.areEqual(this.content, tapLinkData.content);
    }

    @NotNull
    public final String getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: getMessageId-N_6c4I0, reason: not valid java name */
    public final String m886getMessageIdN_6c4I0() {
        return this.messageId;
    }

    public final LinkContextData getTarget() {
        return this.target;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.messageId;
        int iM1161hashCodeimpl = (str == null ? 0 : MessageId.m1161hashCodeimpl(str)) * 31;
        String str2 = this.title;
        int iHashCode = (iM1161hashCodeimpl + (str2 == null ? 0 : str2.hashCode())) * 31;
        LinkContextData linkContextData = this.target;
        return this.content.hashCode() + ((iHashCode + (linkContextData != null ? linkContextData.hashCode() : 0)) * 31);
    }

    @Override // com.discord.reactevents.ReactEvent
    @NotNull
    /* JADX INFO: renamed from: serialize */
    public WritableMap getData() {
        WritableNativeMap writableNativeMapNativeMapOf;
        LinkContextData linkContextData = this.target;
        if (linkContextData == null || (writableNativeMapNativeMapOf = toMap(linkContextData)) == null) {
            String str = this.messageId;
            Pair pair = new Pair("messageId", str == null ? "null" : MessageId.m1163toStringimpl(str));
            LinkContextData linkContextData2 = this.target;
            writableNativeMapNativeMapOf = NativeMapExtensionsKt.nativeMapOf(pair, new Pair("url", linkContextData2), new Pair("node", NativeMapExtensionsKt.nativeMapOf(new Pair(AlertFragment.ARG_TITLE, this.title), new Pair("target", linkContextData2), new Pair("content", this.content))));
        }
        return NativeMapExtensionsKt.nativeMapOf(new Pair("data", writableNativeMapNativeMapOf));
    }

    @NotNull
    public String toString() {
        String str = this.messageId;
        String strM1163toStringimpl = str == null ? "null" : MessageId.m1163toStringimpl(str);
        String str2 = this.title;
        LinkContextData linkContextData = this.target;
        String str3 = this.content;
        StringBuilder sbU = e.u("TapLinkData(messageId=", strM1163toStringimpl, ", title=", str2, ", target=");
        sbU.append(linkContextData);
        sbU.append(", content=");
        sbU.append(str3);
        sbU.append(")");
        return sbU.toString();
    }

    public /* synthetic */ TapLinkData(String str, String str2, LinkContextData linkContextData, String str3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, linkContextData, str3);
    }

    private TapLinkData(String str, String str2, LinkContextData linkContextData, String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.messageId = str;
        this.title = str2;
        this.target = linkContextData;
        this.content = content;
    }

    public /* synthetic */ TapLinkData(String str, String str2, LinkContextData linkContextData, String str3, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : str2, (i7 & 4) != 0 ? null : linkContextData, (i7 & 8) != 0 ? "" : str3, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private TapLinkData(String str, LinkContentNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        LinkContextData target = node.getTarget();
        String textContent = node.getTextContent();
        String str2 = textContent == null ? "" : textContent;
        String textContent2 = node.getTextContent();
        this(str, textContent2 == null ? "" : textContent2, target, str2, null);
    }
}
