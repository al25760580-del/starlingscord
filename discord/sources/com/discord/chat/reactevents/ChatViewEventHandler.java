package com.discord.chat.reactevents;

import android.content.Context;
import com.discord.age_assurance.a;
import com.discord.chat.bridge.MediaType;
import com.discord.chat.bridge.contentnode.CommandMentionContentNode;
import com.discord.chat.bridge.contentnode.EmojiContentNode;
import com.discord.chat.bridge.contentnode.GameMentionContentNode;
import com.discord.chat.bridge.contentnode.InlineCodeContentNode;
import com.discord.chat.bridge.contentnode.LinkContentNode;
import com.discord.chat.bridge.contentnode.LinkContextData;
import com.discord.chat.bridge.contentnode.SoundmojiContentNode;
import com.discord.chat.bridge.sticker.Sticker;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.events.TapReactionOverflow;
import com.discord.chat.presentation.list.ScrollDirection;
import com.discord.chat.presentation.list.ScrollState;
import com.discord.media_player.reactevents.MediaPlayFinishedAnalytics;
import com.discord.primitives.ChannelId;
import com.discord.primitives.GuildId;
import com.discord.primitives.MessageId;
import com.discord.primitives.UserId;
import com.discord.reactevents.ReactEvent;
import com.discord.reactevents.ReactEvents;
import com.discord.reactions.ReactionView;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.dialog.AlertFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rn.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\r\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0007\n\u0002\b>\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010#\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010%\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b$\u0010\u001bJ\u0017\u0010'\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(J\u001f\u0010,\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\u0007H\u0016¢\u0006\u0004\b,\u0010-J\u001f\u00102\u001a\u00020\u000f2\u0006\u0010/\u001a\u00020.2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b0\u00101J\u001f\u00104\u001a\u00020\u000f2\u0006\u0010/\u001a\u00020.2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b3\u00101J\u001f\u00106\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b5\u0010\u001bJ\u001f\u0010:\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u00107\u001a\u00020\u0013H\u0016¢\u0006\u0004\b8\u00109J\u001f\u0010<\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b;\u0010\u001bJ+\u0010>\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u00132\b\u0010=\u001a\u0004\u0018\u00010\u00132\b\u0010\f\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b>\u0010\u0017J5\u0010@\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u00132\b\u0010=\u001a\u0004\u0018\u00010\u00132\b\u0010\f\u001a\u0004\u0018\u00010\u00132\b\u0010?\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b@\u0010AJ\u0017\u0010C\u001a\u00020\u000f2\u0006\u0010B\u001a\u00020\u0013H\u0016¢\u0006\u0004\bC\u0010DJ\u001f\u0010F\u001a\u00020\u000f2\u0006\u0010B\u001a\u00020\u00132\u0006\u0010E\u001a\u00020\u0013H\u0016¢\u0006\u0004\bF\u00109J\u0017\u0010I\u001a\u00020\u000f2\u0006\u0010H\u001a\u00020GH\u0016¢\u0006\u0004\bI\u0010JJ!\u0010M\u001a\u00020\u000f2\u0006\u0010K\u001a\u00020\u00132\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\bL\u00109J\u0017\u0010N\u001a\u00020\u000f2\u0006\u0010K\u001a\u00020\u0013H\u0016¢\u0006\u0004\bN\u0010DJ\u0019\u0010P\u001a\u00020\u000f2\b\u0010O\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\bP\u0010DJ\u0017\u0010Q\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\bQ\u0010RJ\u0081\u0001\u0010b\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010S\u001a\u00020\u00072\u0006\u0010T\u001a\u00020\u00132\u0006\u0010U\u001a\u00020\u00072\u0006\u0010V\u001a\u00020\u00072\u0006\u0010W\u001a\u00020\u00072\u0006\u0010X\u001a\u00020\u00072\u0006\u0010Z\u001a\u00020Y2\b\u0010\\\u001a\u0004\u0018\u00010[2\b\u0010]\u001a\u0004\u0018\u00010\u00072\b\u00107\u001a\u0004\u0018\u00010\u00132\b\u0010^\u001a\u0004\u0018\u00010\u00072\b\u0010_\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b`\u0010aJ3\u0010i\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010c\u001a\u00020\u00072\b\u0010e\u001a\u0004\u0018\u00010d2\b\u0010f\u001a\u0004\u0018\u00010dH\u0016¢\u0006\u0004\bg\u0010hJ\u001f\u0010l\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010c\u001a\u00020\u0007H\u0016¢\u0006\u0004\bj\u0010kJ\u000f\u0010m\u001a\u00020\u000fH\u0016¢\u0006\u0004\bm\u0010nJ\u000f\u0010o\u001a\u00020\u000fH\u0016¢\u0006\u0004\bo\u0010nJI\u0010s\u001a\u00020\u000f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u001e\u001a\u00020\u00132\b\u0010p\u001a\u0004\u0018\u00010\u00132\b\u0010q\u001a\u0004\u0018\u00010\u00132\b\u0010r\u001a\u0004\u0018\u00010\u00132\b\u0010=\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\bs\u0010tJ\u0017\u0010u\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020&H\u0016¢\u0006\u0004\bu\u0010(J\u0017\u0010w\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020vH\u0016¢\u0006\u0004\bw\u0010xJ\u001f\u0010|\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010y\u001a\u00020\u000bH\u0016¢\u0006\u0004\bz\u0010{J(\u0010\u0080\u0001\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010}\u001a\u00020\u0013H\u0016¢\u0006\u0004\b~\u0010\u007fJ)\u0010\u0082\u0001\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010}\u001a\u00020\u0013H\u0016¢\u0006\u0005\b\u0081\u0001\u0010\u007fJ:\u0010\u0087\u0001\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\t\u0010\u0083\u0001\u001a\u0004\u0018\u00010d2\t\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\"\u0010\u0089\u0001\u001a\u00020\u000f2\u0006\u0010p\u001a\u00020\u00132\u0007\u0010\u0088\u0001\u001a\u00020\u0013H\u0016¢\u0006\u0005\b\u0089\u0001\u00109J\u0019\u0010\u008a\u0001\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u0013H\u0016¢\u0006\u0005\b\u008a\u0001\u0010DJ#\u0010\u008d\u0001\u001a\u00020\u000f2\u0007\u0010\u008b\u0001\u001a\u00020\u00132\u0007\u0010\u008c\u0001\u001a\u00020\u0013H\u0016¢\u0006\u0005\b\u008d\u0001\u00109J\u0011\u0010\u008e\u0001\u001a\u00020\u000fH\u0016¢\u0006\u0005\b\u008e\u0001\u0010nJ\u0011\u0010\u008f\u0001\u001a\u00020\u000fH\u0016¢\u0006\u0005\b\u008f\u0001\u0010nJ1\u0010\u0090\u0001\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00132\u0006\u0010=\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u00132\u0006\u0010r\u001a\u00020\u0013H\u0016¢\u0006\u0005\b\u0090\u0001\u0010AJ!\u0010\u0092\u0001\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u00107\u001a\u00020\u0013H\u0016¢\u0006\u0005\b\u0091\u0001\u00109J\u001a\u0010\u0093\u0001\u001a\u00020\u000f2\u0007\u0010\u008c\u0001\u001a\u00020\u0013H\u0016¢\u0006\u0005\b\u0093\u0001\u0010DJ\u001b\u0010\u0095\u0001\u001a\u00020\u000f2\u0007\u0010\u000e\u001a\u00030\u0094\u0001H\u0016¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J\u0019\u0010\u0098\u0001\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0005\b\u0097\u0001\u0010DJ\u0019\u0010\u009a\u0001\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0005\b\u0099\u0001\u0010DJ\u0019\u0010\u009b\u0001\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0013H\u0016¢\u0006\u0005\b\u009b\u0001\u0010DJ!\u0010\u009d\u0001\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0005\b\u009c\u0001\u0010\u001bJ#\u0010 \u0001\u001a\u00020\u000f2\u0007\u0010\u009e\u0001\u001a\u00020\u00132\u0007\u0010\u009f\u0001\u001a\u00020\u0013H\u0016¢\u0006\u0005\b \u0001\u00109J!\u0010¢\u0001\u001a\u00020\u000f2\u0006\u0010/\u001a\u00020.2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0005\b¡\u0001\u00101J\u0019\u0010¤\u0001\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0005\b£\u0001\u0010DJ\u0019\u0010¦\u0001\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0005\b¥\u0001\u0010DJ\u0019\u0010¨\u0001\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0005\b§\u0001\u0010DJ\u001c\u0010«\u0001\u001a\u00020\u000f2\b\u0010ª\u0001\u001a\u00030©\u0001H\u0016¢\u0006\u0006\b«\u0001\u0010¬\u0001J!\u0010®\u0001\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0005\b\u00ad\u0001\u0010\u001bJ#\u0010²\u0001\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0007\u0010=\u001a\u00030¯\u0001H\u0016¢\u0006\u0006\b°\u0001\u0010±\u0001J!\u0010´\u0001\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0005\b³\u0001\u0010\u001bJ!\u0010¶\u0001\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0005\bµ\u0001\u0010\u001bJ!\u0010¸\u0001\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0005\b·\u0001\u0010\u001bJ\u0011\u0010¹\u0001\u001a\u00020\u000fH\u0016¢\u0006\u0005\b¹\u0001\u0010nJ\u0019\u0010»\u0001\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0005\bº\u0001\u0010DJ-\u0010¿\u0001\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001d2\t\u0010¼\u0001\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0006\b½\u0001\u0010¾\u0001J\u001a\u0010Á\u0001\u001a\u00020\u000f2\u0007\u0010À\u0001\u001a\u00020\u0013H\u0016¢\u0006\u0005\bÁ\u0001\u0010DJ8\u0010Å\u0001\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001d2\t\u0010Â\u0001\u001a\u0004\u0018\u00010d2\t\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0006\bÃ\u0001\u0010Ä\u0001J!\u0010Ç\u0001\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0005\bÆ\u0001\u0010\u001bJ!\u0010É\u0001\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0005\bÈ\u0001\u0010\u001bJI\u0010Ò\u0001\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010Ë\u0001\u001a\u00030Ê\u00012\b\u0010Ì\u0001\u001a\u00030Ê\u00012\u0007\u0010Í\u0001\u001a\u00020\u00182\u0007\u0010Î\u0001\u001a\u00020d2\u0007\u0010Ï\u0001\u001a\u00020\u0013H\u0016¢\u0006\u0006\bÐ\u0001\u0010Ñ\u0001JS\u0010×\u0001\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010Ë\u0001\u001a\u00030Ê\u00012\b\u0010Ó\u0001\u001a\u00030Ê\u00012\u0007\u0010Í\u0001\u001a\u00020\u00182\b\u0010Ô\u0001\u001a\u00030Ê\u00012\u0007\u0010Î\u0001\u001a\u00020d2\u0007\u0010Ï\u0001\u001a\u00020\u0013H\u0016¢\u0006\u0006\bÕ\u0001\u0010Ö\u0001J$\u0010Ú\u0001\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\t\u0010Ø\u0001\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0005\bÙ\u0001\u00109J4\u0010Þ\u0001\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u00132\u0007\u0010Û\u0001\u001a\u00020\u00132\u0007\u0010Ü\u0001\u001a\u00020\u00132\u0007\u0010Ý\u0001\u001a\u00020\u0013H\u0016¢\u0006\u0005\bÞ\u0001\u0010AJ5\u0010ã\u0001\u001a\u00020\u000f2\u0007\u0010=\u001a\u00030¯\u00012\u0007\u0010ß\u0001\u001a\u00020\u001d2\u0007\u0010à\u0001\u001a\u00020\u001d2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0006\bá\u0001\u0010â\u0001J\u0019\u0010å\u0001\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0005\bä\u0001\u0010DJ+\u0010è\u0001\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0007\u0010æ\u0001\u001a\u00020\u0013H\u0016¢\u0006\u0006\bç\u0001\u0010¾\u0001J7\u0010ë\u0001\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001d2\t\u0010Ï\u0001\u001a\u0004\u0018\u00010\u00132\b\u0010_\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0006\bé\u0001\u0010ê\u0001J@\u0010ï\u0001\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0007\u0010ì\u0001\u001a\u00020d2\t\u0010Ï\u0001\u001a\u0004\u0018\u00010\u00132\b\u0010_\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0006\bí\u0001\u0010î\u0001J\u001a\u0010ñ\u0001\u001a\u00020\u000f2\u0007\u0010ð\u0001\u001a\u00020\u0013H\u0016¢\u0006\u0005\bñ\u0001\u0010DJ#\u0010ô\u0001\u001a\u00020\u000f2\u0007\u0010ò\u0001\u001a\u00020\u00132\u0007\u0010ó\u0001\u001a\u00020\u0013H\u0016¢\u0006\u0005\bô\u0001\u00109J*\u0010÷\u0001\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\f\u001a\u00020\u000b2\u0007\u0010õ\u0001\u001a\u00020\u0013H\u0016¢\u0006\u0005\bö\u0001\u0010\u007fJ!\u0010ù\u0001\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0005\bø\u0001\u0010{J)\u0010û\u0001\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010T\u001a\u00020\u0013H\u0016¢\u0006\u0005\bú\u0001\u0010\u007fJS\u0010þ\u0001\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\f\u001a\u00020\u000b2\u0007\u0010Ï\u0001\u001a\u00020\u00132\u0006\u0010U\u001a\u00020\u00072\u0006\u0010V\u001a\u00020\u00072\u0006\u0010W\u001a\u00020\u00072\u0006\u0010X\u001a\u00020\u00072\u0006\u0010Z\u001a\u00020YH\u0016¢\u0006\u0006\bü\u0001\u0010ý\u0001J*\u0010\u0081\u0002\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\f\u001a\u00020\u000b2\u0007\u0010ÿ\u0001\u001a\u00020\u0013H\u0016¢\u0006\u0005\b\u0080\u0002\u0010\u007fJ:\u0010\u0086\u0002\u001a\u00020\u000f2\u0007\u0010\u0082\u0002\u001a\u00020\u00072\t\u0010\u0083\u0002\u001a\u0004\u0018\u00010[2\u0007\u0010\u0084\u0002\u001a\u00020\u00072\t\u0010\u0085\u0002\u001a\u0004\u0018\u00010[H\u0016¢\u0006\u0006\b\u0086\u0002\u0010\u0087\u0002J\u0011\u0010\u0088\u0002\u001a\u00020\u000fH\u0016¢\u0006\u0005\b\u0088\u0002\u0010nJ\u001c\u0010\u008b\u0002\u001a\u00020\u000f2\b\u0010\u008a\u0002\u001a\u00030\u0089\u0002H\u0016¢\u0006\u0006\b\u008b\u0002\u0010\u008c\u0002J+\u0010\u0090\u0002\u001a\u00020\u000f2\u0007\u0010\u008d\u0002\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0006\b\u008e\u0002\u0010\u008f\u0002JK\u0010\u0094\u0002\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\f\u001a\u00020\u000b2\u0007\u0010\u0091\u0002\u001a\u00020\u00132\b\u0010]\u001a\u0004\u0018\u00010\u00072\t\u0010Â\u0001\u001a\u0004\u0018\u00010d2\t\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0006\b\u0092\u0002\u0010\u0093\u0002J\u001b\u0010\u0097\u0002\u001a\u00020\u000f2\u0007\u0010=\u001a\u00030¯\u0001H\u0016¢\u0006\u0006\b\u0095\u0002\u0010\u0096\u0002J5\u0010\u009c\u0002\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0007\u0010\u0098\u0002\u001a\u00020\u00182\u0007\u0010\u0099\u0002\u001a\u00020\u00132\u0007\u0010\u009a\u0002\u001a\u00020\u0013H\u0016¢\u0006\u0006\b\u009b\u0002\u0010ê\u0001J\"\u0010\u009e\u0002\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0007\u0010\u0098\u0002\u001a\u00020\u0018H\u0016¢\u0006\u0005\b\u009d\u0002\u0010\u001bJ\u001b\u0010 \u0002\u001a\u00020\u000f2\u0007\u0010\u000e\u001a\u00030\u009f\u0002H\u0016¢\u0006\u0006\b \u0002\u0010¡\u0002J\u0019\u0010£\u0002\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0005\b¢\u0002\u0010DJ\u0019\u0010¥\u0002\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0005\b¤\u0002\u0010DJ,\u0010ª\u0002\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0007\u0010¦\u0002\u001a\u00020\u00182\u0007\u0010§\u0002\u001a\u00020\u0007H\u0016¢\u0006\u0006\b¨\u0002\u0010©\u0002J,\u0010¬\u0002\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0007\u0010¦\u0002\u001a\u00020\u00182\u0007\u0010§\u0002\u001a\u00020\u0007H\u0016¢\u0006\u0006\b«\u0002\u0010©\u0002J,\u0010®\u0002\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0007\u0010¦\u0002\u001a\u00020\u00182\u0007\u0010§\u0002\u001a\u00020\u0007H\u0016¢\u0006\u0006\b\u00ad\u0002\u0010©\u0002R%\u0010±\u0002\u001a\u0010\u0012\u0005\u0012\u00030°\u0002\u0012\u0004\u0012\u00020\u000f0¯\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b±\u0002\u0010²\u0002R\\\u0010¶\u0002\u001a?\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0007\u0012\u0005\u0018\u00010´\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u000f\u0018\u00010³\u0002j\u0005\u0018\u0001`µ\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b¶\u0002\u0010·\u0002\u001a\u0006\b¸\u0002\u0010¹\u0002R;\u0010¼\u0002\u001a\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u000f\u0018\u00010º\u0002j\u0005\u0018\u0001`»\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b¼\u0002\u0010½\u0002\u001a\u0006\b¾\u0002\u0010¿\u0002R;\u0010Á\u0002\u001a\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u000f\u0018\u00010º\u0002j\u0005\u0018\u0001`À\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bÁ\u0002\u0010½\u0002\u001a\u0006\bÂ\u0002\u0010¿\u0002¨\u0006Ã\u0002"}, d2 = {"Lcom/discord/chat/reactevents/ChatViewEventHandler;", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "Landroid/content/Context;", "context", "Lcom/discord/reactevents/ReactEvents;", "reactEvents", "Lkotlin/Function0;", "", "reactTag", "<init>", "(Landroid/content/Context;Lcom/discord/reactevents/ReactEvents;Lkotlin/jvm/functions/Function0;)V", "Lcom/discord/primitives/MessageId;", "messageId", "Lcom/discord/chat/bridge/contentnode/LinkContentNode;", "node", "", "onLinkClicked-ntcYbpo", "(Ljava/lang/String;Lcom/discord/chat/bridge/contentnode/LinkContentNode;)V", "onLinkClicked", "", "url", AlertFragment.ARG_TITLE, "onLinkClicked-u7_MRrM", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/discord/primitives/UserId;", "userId", "onLongPressAvatar-x5gers8", "(Ljava/lang/String;J)V", "onLongPressAvatar", "Lcom/discord/primitives/ChannelId;", "channelId", "Lcom/discord/reactions/ReactionView$Reaction;", "reaction", "onLongPressReaction-Eqy5D80", "(Ljava/lang/String;JLcom/discord/reactions/ReactionView$Reaction;)V", "onLongPressReaction", "onLongPressUsername-x5gers8", "onLongPressUsername", "Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;", "onLongPressCommand", "(Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;)V", "Lcom/discord/chat/presentation/list/ScrollState;", "scrollState", "changesetUpdateId", "onScrollStateChanged", "(Lcom/discord/chat/presentation/list/ScrollState;I)V", "Lcom/discord/chat/bridge/sticker/Sticker;", "sticker", "onStickerClicked-Ayv7vGE", "(Lcom/discord/chat/bridge/sticker/Sticker;Ljava/lang/String;)V", "onStickerClicked", "onStickerLongClicked-Ayv7vGE", "onStickerLongClicked", "onTapAvatar-x5gers8", "onTapAvatar", "componentId", "onTapButtonActionComponent-ntcYbpo", "(Ljava/lang/String;Ljava/lang/String;)V", "onTapButtonActionComponent", "onTapCall-pfaIj0E", "onTapCall", "guildId", "onTapChannel", "originalLink", "onLongPressChannel", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "attachmentUrl", "onTapAttachmentLink", "(Ljava/lang/String;)V", "attachmentName", "onLongPressAttachmentLink", "", "text", "onTapCopyText", "(Ljava/lang/CharSequence;)V", "giftCode", "onTapGiftCodeAccept-NU4t8f8", "onTapGiftCodeAccept", "onTapGiftCodeEmbed", "referralId", "onTapReferralRedeem", "onLinkLongClicked", "(Lcom/discord/chat/bridge/contentnode/LinkContentNode;)V", "attachmentIndex", "type", "viewWidth", "viewHeight", "viewX", "viewY", "Lcom/discord/chat/reactevents/ViewResizeMode;", "viewResizeMode", "", "portal", "embedIndex", "componentMediaIndex", "embedId", "onTapImage-JJXpD5M", "(Ljava/lang/String;ILjava/lang/String;IIIILcom/discord/chat/reactevents/ViewResizeMode;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "onTapImage", "index", "", "primary", "secondary", "onTapInviteEmbed-AFFcxXc", "(Ljava/lang/String;ILjava/lang/Boolean;Ljava/lang/Boolean;)V", "onTapInviteEmbed", "onTapInviteEmbedAccept-ntcYbpo", "(Ljava/lang/String;I)V", "onTapInviteEmbedAccept", "onTapLoadMessagesAfter", "()V", "onTapLoadMessagesBefore", "roleName", "parsedUserId", "roleId", "onTapMention", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "onTapCommand", "Lcom/discord/chat/bridge/contentnode/GameMentionContentNode;", "onTapGameMention", "(Lcom/discord/chat/bridge/contentnode/GameMentionContentNode;)V", "originId", "onTapMessageReply-0eiqbug", "(JLjava/lang/String;)V", "onTapMessageReply", "summaryId", "onTapSummary-sekaTiM", "(JLjava/lang/String;Ljava/lang/String;)V", "onTapSummary", "onTapSummaryJump-sekaTiM", "onTapSummaryJump", "isBurst", "location", "onTapReaction-AFFcxXc", "(Ljava/lang/String;Lcom/discord/reactions/ReactionView$Reaction;Ljava/lang/Boolean;Ljava/lang/String;)V", "onTapReaction", "roleIconSource", "onTapRoleIcon", "onTapVoiceChannelBadge", "gameApplicationId", "timestamp", "onTapGameIcon", "onTapSuppressNotificationsIcon", "onTapTimeoutIcon", "onTapConnectionsRoleTag", "onTapSelectActionComponent-ntcYbpo", "onTapSelectActionComponent", "onTapTimestamp", "Lcom/discord/chat/bridge/contentnode/InlineCodeContentNode;", "onTapInlineCode", "(Lcom/discord/chat/bridge/contentnode/InlineCodeContentNode;)V", "onTapThreadEmbed-1xi1bu0", "onTapThreadEmbed", "onTapToggleBlockedMessages-1xi1bu0", "onTapToggleBlockedMessages", "onTapDismissBlockedMessages", "onTapUsername-x5gers8", "onTapUsername", "uploaderId", "itemId", "onTapCancelUploadItem", "onWelcomeReplyClicked-Ayv7vGE", "onWelcomeReplyClicked", "onTapInviteToSpeak-1xi1bu0", "onTapInviteToSpeak", "onTapJoinActivity-1xi1bu0", "onTapJoinActivity", "onTapJoinRichPresence-1xi1bu0", "onTapJoinRichPresence", "Lcom/discord/chat/bridge/contentnode/EmojiContentNode;", "emoji", "onTapEmoji", "(Lcom/discord/chat/bridge/contentnode/EmojiContentNode;)V", "onTapFollowForumPost-pfaIj0E", "onTapFollowForumPost", "Lcom/discord/primitives/GuildId;", "onTapShareForumPost-mgk6anA", "(JJ)V", "onTapShareForumPost", "onTapReactionOverflow-pfaIj0E", "onTapReactionOverflow", "onTapAutoModerationActions-pfaIj0E", "onTapAutoModerationActions", "onTapAutoModerationFeedback-pfaIj0E", "onTapAutoModerationFeedback", "onTapOpTag", "onTapSeeMore-1xi1bu0", "onTapSeeMore", "tagType", "onTapTag-Eqy5D80", "(Ljava/lang/String;JLjava/lang/String;)V", "onTapTag", "description", "onTapShowAltText", "triggerHaptic", "onInitiateReply-8a0ehIg", "(Ljava/lang/String;JLjava/lang/Boolean;Ljava/lang/String;)V", "onInitiateReply", "onInitiateThread-pfaIj0E", "onInitiateThread", "onInitiateEdit-pfaIj0E", "onInitiateEdit", "", "totalDurationSecs", "startDurationSecs", "senderUserId", "isVoiceMessage", "attachmentId", "mediaAttachmentPlaybackStarted-jd4C3YQ", "(Ljava/lang/String;FFJZLjava/lang/String;)V", "mediaAttachmentPlaybackStarted", "endDurationSecs", "durationListeningSecs", "mediaAttachmentPlaybackEnded-O97gnAM", "(Ljava/lang/String;FFJFZLjava/lang/String;)V", "mediaAttachmentPlaybackEnded", "errorMessage", "voiceMessagePlaybackFailed-ntcYbpo", "voiceMessagePlaybackFailed", "actionId", "appId", "embedUrl", "onTapAppMessageEmbed", "parentChannelId", "threadId", "onTapPostPreviewEmbed-kUTrp-s", "(JJJLjava/lang/String;)V", "onTapPostPreviewEmbed", "onTapDismissMediaPostSharePrompt-1xi1bu0", "onTapDismissMediaPostSharePrompt", "buttonType", "onTapChannelPromptButton-Eqy5D80", "onTapChannelPromptButton", "onTapObscuredMediaLearnMore-8a0ehIg", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V", "onTapObscuredMediaLearnMore", "isReveal", "onTapObscuredMediaToggle-ZQwuxwg", "(Ljava/lang/String;JZLjava/lang/String;Ljava/lang/String;)V", "onTapObscuredMediaToggle", "classificationId", "onTapSafetyPolicyNoticeEmbed", "ctaType", "ctaKey", "onTapSafetySystemNotificationCta", "answerId", "onTapPollAnswer-sekaTiM", "onTapPollAnswer", "onTapPollSubmitVote-0eiqbug", "onTapPollSubmitVote", "onTapPollAction-sekaTiM", "onTapPollAction", "onLongPressPollImage-YVExdug", "(JLjava/lang/String;Ljava/lang/String;IIIILcom/discord/chat/reactevents/ViewResizeMode;)V", "onLongPressPollImage", "callback", "onTapCtaButton-sekaTiM", "onTapCtaButton", "firstVisibleMessageIndex", "firstVisibleMessagePercentVisible", "lastVisibleMessageIndex", "lastVisibleMessagePercentVisible", "onFirstLayout", "(ILjava/lang/Double;ILjava/lang/Double;)V", "onCompleteFirstLayout", "Lcom/discord/media_player/reactevents/MediaPlayFinishedAnalytics;", "analytics", "onMediaPlayFinishedAnalytics", "(Lcom/discord/media_player/reactevents/MediaPlayFinishedAnalytics;)V", "snapshotIndex", "onTapForwardFooter-SHRpUJI", "(IJLjava/lang/String;)V", "onTapForwardFooter", "targetKind", "onTapInlineForward-j8a4Y88", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;)V", "onTapInlineForward", "onTapClanTagChiplet-g3bFfsM", "(J)V", "onTapClanTagChiplet", "authorId", "contentId", "tappedElement", "onTapContentInventoryEntryEmbed-tsfjtEQ", "onTapContentInventoryEntryEmbed", "onTapCheckpointCard-x5gers8", "onTapCheckpointCard", "Lcom/discord/chat/bridge/contentnode/SoundmojiContentNode;", "onTapSoundmoji", "(Lcom/discord/chat/bridge/contentnode/SoundmojiContentNode;)V", "onTapPreviewSharedClientTheme-1xi1bu0", "onTapPreviewSharedClientTheme", "onSharedClientThemeViewed-1xi1bu0", "onSharedClientThemeViewed", "recipientUserId", "giftIntentType", "onGiftIntentCardViewed-gzHKzLY", "(Ljava/lang/String;JI)V", "onGiftIntentCardViewed", "onTapGiftIntentPrimaryCta-gzHKzLY", "onTapGiftIntentPrimaryCta", "onTapGiftIntentSecondaryCta-gzHKzLY", "onTapGiftIntentSecondaryCta", "Lkotlin/Function1;", "Lcom/discord/reactevents/ReactEvent;", "emitReactEvent", "Lkotlin/jvm/functions/Function1;", "Lkotlin/Function6;", "Lcom/discord/chat/bridge/MediaType;", "Lcom/discord/chat/presentation/events/MessageLongPress;", "onMessageLongPressed", "Lkotlin/jvm/functions/Function6;", "getOnMessageLongPressed", "()Lkotlin/jvm/functions/Function6;", "Lkotlin/Function2;", "Lcom/discord/chat/presentation/events/MessageTapped;", "onMessageTapped", "Lkotlin/jvm/functions/Function2;", "getOnMessageTapped", "()Lkotlin/jvm/functions/Function2;", "Lcom/discord/chat/presentation/events/MessageDoubleTapped;", "onMessageDoubleTapped", "getOnMessageDoubleTapped", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class ChatViewEventHandler implements ChatEventHandler {

    @NotNull
    private final Function1<ReactEvent, Unit> emitReactEvent;
    private final Function2<MessageId, ChannelId, Unit> onMessageDoubleTapped;
    private final Function6 onMessageLongPressed;
    private final Function2<MessageId, ChannelId, Unit> onMessageTapped;

    public ChatViewEventHandler(@NotNull Context context, @NotNull ReactEvents reactEvents, @NotNull Function0<Integer> reactTag) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(reactEvents, "reactEvents");
        Intrinsics.checkNotNullParameter(reactTag, "reactTag");
        this.emitReactEvent = new a(reactEvents, context, reactTag, 5);
        this.onMessageLongPressed = new Function6() { // from class: com.discord.chat.reactevents.ChatViewEventHandler$onMessageLongPressed$1
            @Override // kotlin.jvm.functions.Function6
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                m780invokeeTS4JUY(((MessageId) obj).m1165unboximpl(), ((ChannelId) obj2).m1139unboximpl(), (Integer) obj3, (MediaType) obj4, (String) obj5, (Integer) obj6);
                return Unit.f14616a;
            }

            /* JADX INFO: renamed from: invoke-eTS4JUY, reason: not valid java name */
            public final void m780invokeeTS4JUY(String messageId, long j, Integer num, MediaType mediaType, String str, Integer num2) {
                String type;
                Intrinsics.checkNotNullParameter(messageId, "messageId");
                Function1 function1 = this.this$0.emitReactEvent;
                String strM1163toStringimpl = MessageId.m1163toStringimpl(messageId);
                String strM1137toStringimpl = ChannelId.m1137toStringimpl(j);
                int iIntValue = num != null ? num.intValue() : 0;
                if (mediaType == null || (type = mediaType.getType()) == null) {
                    type = "";
                }
                function1.invoke(new LongPressMessageEvent(strM1163toStringimpl, strM1137toStringimpl, iIntValue, type, str, num2));
            }
        };
        this.onMessageTapped = new Function2<MessageId, ChannelId, Unit>() { // from class: com.discord.chat.reactevents.ChatViewEventHandler$onMessageTapped$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                m781invokepfaIj0E(((MessageId) obj).m1165unboximpl(), ((ChannelId) obj2).m1139unboximpl());
                return Unit.f14616a;
            }

            /* JADX INFO: renamed from: invoke-pfaIj0E, reason: not valid java name */
            public final void m781invokepfaIj0E(String messageId, long j) {
                Intrinsics.checkNotNullParameter(messageId, "messageId");
                this.this$0.emitReactEvent.invoke(new TapMessageData(MessageId.m1163toStringimpl(messageId), ChannelId.m1137toStringimpl(j)));
            }
        };
        this.onMessageDoubleTapped = new Function2<MessageId, ChannelId, Unit>() { // from class: com.discord.chat.reactevents.ChatViewEventHandler$onMessageDoubleTapped$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                m779invokepfaIj0E(((MessageId) obj).m1165unboximpl(), ((ChannelId) obj2).m1139unboximpl());
                return Unit.f14616a;
            }

            /* JADX INFO: renamed from: invoke-pfaIj0E, reason: not valid java name */
            public final void m779invokepfaIj0E(String messageId, long j) {
                Intrinsics.checkNotNullParameter(messageId, "messageId");
                this.this$0.emitReactEvent.invoke(new DoubleTapMessageEvent(MessageId.m1163toStringimpl(messageId), ChannelId.m1137toStringimpl(j)));
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit emitReactEvent$lambda$0(ReactEvents reactEvents, Context context, Function0 function0, ReactEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        reactEvents.emitEvent((ReactContext) context, ((Number) function0.invoke()).intValue(), event);
        return Unit.f14616a;
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* JADX INFO: renamed from: getOnMessageDoubleTapped */
    public Function2<MessageId, ChannelId, Unit> mo526getOnMessageDoubleTapped() {
        return this.onMessageDoubleTapped;
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    public Function6 getOnMessageLongPressed() {
        return this.onMessageLongPressed;
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* JADX INFO: renamed from: getOnMessageTapped */
    public Function2<MessageId, ChannelId, Unit> mo528getOnMessageTapped() {
        return this.onMessageTapped;
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* JADX INFO: renamed from: mediaAttachmentPlaybackEnded-O97gnAM */
    public void mo462mediaAttachmentPlaybackEndedO97gnAM(@NotNull String messageId, float totalDurationSecs, float endDurationSecs, long senderUserId, float durationListeningSecs, boolean isVoiceMessage, @NotNull String attachmentId) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(attachmentId, "attachmentId");
        this.emitReactEvent.invoke(new MediaAttachmentPlaybackEndedData(messageId, totalDurationSecs, endDurationSecs, senderUserId, durationListeningSecs, isVoiceMessage, attachmentId, null));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* JADX INFO: renamed from: mediaAttachmentPlaybackStarted-jd4C3YQ */
    public void mo463mediaAttachmentPlaybackStartedjd4C3YQ(@NotNull String messageId, float totalDurationSecs, float startDurationSecs, long senderUserId, boolean isVoiceMessage, @NotNull String attachmentId) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(attachmentId, "attachmentId");
        this.emitReactEvent.invoke(new MediaAttachmentPlaybackStartedData(messageId, totalDurationSecs, startDurationSecs, senderUserId, isVoiceMessage, attachmentId, null));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    public void onCompleteFirstLayout() {
        this.emitReactEvent.invoke(new CompleteFirstLayoutData());
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    public void onFirstLayout(int firstVisibleMessageIndex, Double firstVisibleMessagePercentVisible, int lastVisibleMessageIndex, Double lastVisibleMessagePercentVisible) {
        this.emitReactEvent.invoke(new FirstLayoutData(firstVisibleMessageIndex, firstVisibleMessagePercentVisible, lastVisibleMessageIndex, lastVisibleMessagePercentVisible));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* JADX INFO: renamed from: onGiftIntentCardViewed-gzHKzLY */
    public void mo464onGiftIntentCardViewedgzHKzLY(@NotNull String messageId, long recipientUserId, int giftIntentType) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        this.emitReactEvent.invoke(new GiftIntentCardViewedData(messageId, recipientUserId, giftIntentType, null));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* JADX INFO: renamed from: onInitiateEdit-pfaIj0E */
    public void mo465onInitiateEditpfaIj0E(@NotNull String messageId, long channelId) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        this.emitReactEvent.invoke(new InitiateEditData(messageId, channelId, null));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* JADX INFO: renamed from: onInitiateReply-8a0ehIg */
    public void mo466onInitiateReply8a0ehIg(@NotNull String messageId, long channelId, Boolean triggerHaptic, String location) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        this.emitReactEvent.invoke(new InitiateReplyData(messageId, channelId, triggerHaptic, location, null));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* JADX INFO: renamed from: onInitiateThread-pfaIj0E */
    public void mo467onInitiateThreadpfaIj0E(@NotNull String messageId, long channelId) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        this.emitReactEvent.invoke(new InitiateThreadData(messageId, channelId, null));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* JADX INFO: renamed from: onLinkClicked-ntcYbpo */
    public void mo468onLinkClickedntcYbpo(@NotNull String messageId, @NotNull LinkContentNode node) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(node, "node");
        this.emitReactEvent.invoke(new TapLinkData(messageId, node, null));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* JADX INFO: renamed from: onLinkClicked-u7_MRrM */
    public void mo469onLinkClickedu7_MRrM(@NotNull String messageId, @NotNull String url, String title) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(url, "url");
        Function1<ReactEvent, Unit> function1 = this.emitReactEvent;
        LinkContextData.LinkUrl linkUrl = new LinkContextData.LinkUrl(url);
        if (title == null) {
            title = "";
        }
        function1.invoke(new TapLinkData(messageId, title, linkUrl, null, 8, null));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    public void onLinkLongClicked(@NotNull LinkContentNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        this.emitReactEvent.invoke(new LongPressLinkData(node.getUrl()));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    public void onLongPressAttachmentLink(@NotNull String attachmentUrl, @NotNull String attachmentName) {
        Intrinsics.checkNotNullParameter(attachmentUrl, "attachmentUrl");
        Intrinsics.checkNotNullParameter(attachmentName, "attachmentName");
        this.emitReactEvent.invoke(new LongPressAttachmentLinkData(attachmentUrl, attachmentName));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* JADX INFO: renamed from: onLongPressAvatar-x5gers8 */
    public void mo470onLongPressAvatarx5gers8(@NotNull String messageId, long userId) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        this.emitReactEvent.invoke(new LongPressAvatarData(MessageId.m1163toStringimpl(messageId), UserId.m1215toStringimpl(userId)));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    public void onLongPressChannel(@NotNull String channelId, String guildId, String messageId, String originalLink) {
        Intrinsics.checkNotNullParameter(channelId, "channelId");
        this.emitReactEvent.invoke(new LongPressChannelData(guildId, channelId, messageId, originalLink));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    public void onLongPressCommand(@NotNull CommandMentionContentNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        this.emitReactEvent.invoke(new LongPressCommandData(node));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* JADX INFO: renamed from: onLongPressPollImage-YVExdug */
    public void mo471onLongPressPollImageYVExdug(long channelId, @NotNull String messageId, @NotNull String attachmentId, int viewWidth, int viewHeight, int viewX, int viewY, @NotNull ViewResizeMode viewResizeMode) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(attachmentId, "attachmentId");
        Intrinsics.checkNotNullParameter(viewResizeMode, "viewResizeMode");
        this.emitReactEvent.invoke(new LongPressPollImageData(ChannelId.m1137toStringimpl(channelId), MessageId.m1163toStringimpl(messageId), attachmentId, new TapImageData.Layout(viewWidth, viewHeight, viewX, viewY, viewResizeMode)));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* JADX INFO: renamed from: onLongPressReaction-Eqy5D80 */
    public void mo472onLongPressReactionEqy5D80(@NotNull String messageId, long channelId, ReactionView.Reaction reaction) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        this.emitReactEvent.invoke(new LongPressReactionData(messageId, channelId, reaction, null));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* JADX INFO: renamed from: onLongPressUsername-x5gers8 */
    public void mo473onLongPressUsernamex5gers8(@NotNull String messageId, long userId) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        this.emitReactEvent.invoke(new LongPressUsernameData(MessageId.m1163toStringimpl(messageId), UserId.m1215toStringimpl(userId)));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    public void onMediaPlayFinishedAnalytics(@NotNull MediaPlayFinishedAnalytics analytics) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        this.emitReactEvent.invoke(analytics);
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    public void onScrollStateChanged(@NotNull ScrollState scrollState, int changesetUpdateId) {
        Intrinsics.checkNotNullParameter(scrollState, "scrollState");
        this.emitReactEvent.invoke(new ChatScrollPositionEvent(scrollState.isAtBottom(), scrollState.isNearBottom() && scrollState.getScrollDirection() == ScrollDirection.DOWN, scrollState.isNearTop() && scrollState.getScrollDirection() == ScrollDirection.UP, scrollState.isDragging(), scrollState.isSettling(), (scrollState.isNearBottom() || scrollState.isAtBottom()) ? false : true, scrollState.isFirstMessageVisible(), scrollState.getFirstVisibleMessageIndex(), scrollState.getFirstVisibleMessagePercentVisible(), scrollState.getLastVisibleMessageIndex(), scrollState.getLastVisibleMessagePercentVisible(), changesetUpdateId));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* JADX INFO: renamed from: onSharedClientThemeViewed-1xi1bu0 */
    public void mo474onSharedClientThemeViewed1xi1bu0(@NotNull String messageId) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        this.emitReactEvent.invoke(new SharedClientThemeViewedData(messageId, null));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* JADX INFO: renamed from: onStickerClicked-Ayv7vGE */
    public void mo475onStickerClickedAyv7vGE(@NotNull Sticker sticker, @NotNull String messageId) {
        Intrinsics.checkNotNullParameter(sticker, "sticker");
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        this.emitReactEvent.invoke(new TapStickerData(sticker, messageId, null));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* JADX INFO: renamed from: onStickerLongClicked-Ayv7vGE */
    public void mo476onStickerLongClickedAyv7vGE(@NotNull Sticker sticker, @NotNull String messageId) {
        Intrinsics.checkNotNullParameter(sticker, "sticker");
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        this.emitReactEvent.invoke(new LongPressStickerData(messageId, sticker, null));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    public void onTapAppMessageEmbed(@NotNull String messageId, @NotNull String actionId, @NotNull String appId, @NotNull String embedUrl) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(embedUrl, "embedUrl");
        this.emitReactEvent.invoke(new TapAppMessageEmbedData(messageId, actionId, appId, embedUrl));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    public void onTapAttachmentLink(@NotNull String attachmentUrl) {
        Intrinsics.checkNotNullParameter(attachmentUrl, "attachmentUrl");
        this.emitReactEvent.invoke(new TapAttachmentLinkData(attachmentUrl));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* JADX INFO: renamed from: onTapAutoModerationActions-pfaIj0E */
    public void mo477onTapAutoModerationActionspfaIj0E(@NotNull String messageId, long channelId) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        this.emitReactEvent.invoke(new TapAutoModerationActionsData(MessageId.m1163toStringimpl(messageId), ChannelId.m1137toStringimpl(channelId)));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* JADX INFO: renamed from: onTapAutoModerationFeedback-pfaIj0E */
    public void mo478onTapAutoModerationFeedbackpfaIj0E(@NotNull String messageId, long channelId) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        this.emitReactEvent.invoke(new TapAutoModerationFeedbackData(MessageId.m1163toStringimpl(messageId), ChannelId.m1137toStringimpl(channelId)));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* JADX INFO: renamed from: onTapAvatar-x5gers8 */
    public void mo479onTapAvatarx5gers8(@NotNull String messageId, long userId) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        this.emitReactEvent.invoke(new TapAvatarData(MessageId.m1163toStringimpl(messageId), UserId.m1215toStringimpl(userId)));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* JADX INFO: renamed from: onTapButtonActionComponent-ntcYbpo */
    public void mo480onTapButtonActionComponentntcYbpo(@NotNull String messageId, @NotNull String componentId) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(componentId, "componentId");
        this.emitReactEvent.invoke(new TapButtonActionComponent(messageId, componentId, null));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* JADX INFO: renamed from: onTapCall-pfaIj0E */
    public void mo481onTapCallpfaIj0E(@NotNull String messageId, long channelId) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        this.emitReactEvent.invoke(new TapCallData(messageId, channelId, null));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    public void onTapCancelUploadItem(@NotNull String uploaderId, @NotNull String itemId) {
        Intrinsics.checkNotNullParameter(uploaderId, "uploaderId");
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        this.emitReactEvent.invoke(new TapCancelUploadItemData(uploaderId, itemId));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    public void onTapChannel(@NotNull String channelId, String guildId, String messageId) {
        Intrinsics.checkNotNullParameter(channelId, "channelId");
        this.emitReactEvent.invoke(new TapChannelData(guildId, channelId, messageId));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* JADX INFO: renamed from: onTapChannelPromptButton-Eqy5D80 */
    public void mo482onTapChannelPromptButtonEqy5D80(@NotNull String messageId, long channelId, @NotNull String buttonType) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(buttonType, "buttonType");
        this.emitReactEvent.invoke(new TapChannelPromptButtonData(MessageId.m1163toStringimpl(messageId), ChannelId.m1137toStringimpl(channelId), buttonType));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* JADX INFO: renamed from: onTapCheckpointCard-x5gers8 */
    public void mo483onTapCheckpointCardx5gers8(@NotNull String messageId, long authorId) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        this.emitReactEvent.invoke(new TapCheckpointCardData(MessageId.m1163toStringimpl(messageId), UserId.m1215toStringimpl(authorId)));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* JADX INFO: renamed from: onTapClanTagChiplet-g3bFfsM */
    public void mo484onTapClanTagChipletg3bFfsM(long guildId) {
        this.emitReactEvent.invoke(new TapClanTagChipletData(GuildId.m1150toStringimpl(guildId)));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    public void onTapCommand(@NotNull CommandMentionContentNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        this.emitReactEvent.invoke(new TapCommandData(node));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    public void onTapConnectionsRoleTag(@NotNull String userId, @NotNull String guildId, @NotNull String channelId, @NotNull String roleId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(guildId, "guildId");
        Intrinsics.checkNotNullParameter(channelId, "channelId");
        Intrinsics.checkNotNullParameter(roleId, "roleId");
        this.emitReactEvent.invoke(new TapConnectionsRoleTagData(userId, guildId, channelId, roleId));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* JADX INFO: renamed from: onTapContentInventoryEntryEmbed-tsfjtEQ */
    public void mo485onTapContentInventoryEntryEmbedtsfjtEQ(@NotNull String messageId, long authorId, @NotNull String contentId, @NotNull String tappedElement) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(contentId, "contentId");
        Intrinsics.checkNotNullParameter(tappedElement, "tappedElement");
        this.emitReactEvent.invoke(new TapContentInventoryEntryEmbedData(MessageId.m1163toStringimpl(messageId), UserId.m1215toStringimpl(authorId), contentId, tappedElement));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    public void onTapCopyText(@NotNull CharSequence text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.emitReactEvent.invoke(new TapCopyText(text));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* JADX INFO: renamed from: onTapCtaButton-sekaTiM */
    public void mo486onTapCtaButtonsekaTiM(long channelId, @NotNull String messageId, @NotNull String callback) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.emitReactEvent.invoke(new TapCtaButton(ChannelId.m1137toStringimpl(channelId), MessageId.m1163toStringimpl(messageId), callback));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    public void onTapDismissBlockedMessages(@NotNull String context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.emitReactEvent.invoke(new TapSeparatorData("dismiss", context));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* JADX INFO: renamed from: onTapDismissMediaPostSharePrompt-1xi1bu0 */
    public void mo487onTapDismissMediaPostSharePrompt1xi1bu0(@NotNull String messageId) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        this.emitReactEvent.invoke(new TapDismissMediaPostSharePromptData(messageId, null));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    public void onTapEmoji(@NotNull EmojiContentNode emoji) {
        Intrinsics.checkNotNullParameter(emoji, "emoji");
        this.emitReactEvent.invoke(new TapEmojiData(emoji));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* JADX INFO: renamed from: onTapFollowForumPost-pfaIj0E */
    public void mo488onTapFollowForumPostpfaIj0E(@NotNull String messageId, long channelId) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        this.emitReactEvent.invoke(new TapFollowForumPost(MessageId.m1163toStringimpl(messageId), ChannelId.m1137toStringimpl(channelId)));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* JADX INFO: renamed from: onTapForwardFooter-SHRpUJI */
    public void mo489onTapForwardFooterSHRpUJI(int snapshotIndex, long channelId, @NotNull String messageId) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        this.emitReactEvent.invoke(new TapForwardFooterData(snapshotIndex, ChannelId.m1137toStringimpl(channelId), MessageId.m1163toStringimpl(messageId)));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    public void onTapGameIcon(@NotNull String gameApplicationId, @NotNull String timestamp) {
        Intrinsics.checkNotNullParameter(gameApplicationId, "gameApplicationId");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        this.emitReactEvent.invoke(new TapGameIconData(gameApplicationId, timestamp));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    public void onTapGameMention(@NotNull GameMentionContentNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        this.emitReactEvent.invoke(new TapGameMentionData(node));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* JADX INFO: renamed from: onTapGiftCodeAccept-NU4t8f8 */
    public void mo490onTapGiftCodeAcceptNU4t8f8(@NotNull String giftCode, String messageId) {
        Intrinsics.checkNotNullParameter(giftCode, "giftCode");
        this.emitReactEvent.invoke(new TapGiftCodeAcceptData(giftCode, messageId, null));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    public void onTapGiftCodeEmbed(@NotNull String giftCode) {
        Intrinsics.checkNotNullParameter(giftCode, "giftCode");
        this.emitReactEvent.invoke(new TapGiftCodeEmbedData(giftCode));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* JADX INFO: renamed from: onTapGiftIntentPrimaryCta-gzHKzLY */
    public void mo491onTapGiftIntentPrimaryCtagzHKzLY(@NotNull String messageId, long recipientUserId, int giftIntentType) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        this.emitReactEvent.invoke(new GiftIntentPrimaryCtaData(messageId, recipientUserId, giftIntentType, null));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* JADX INFO: renamed from: onTapGiftIntentSecondaryCta-gzHKzLY */
    public void mo492onTapGiftIntentSecondaryCtagzHKzLY(@NotNull String messageId, long recipientUserId, int giftIntentType) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        this.emitReactEvent.invoke(new GiftIntentSecondaryCtaData(messageId, recipientUserId, giftIntentType, null));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* JADX INFO: renamed from: onTapImage-JJXpD5M */
    public void mo493onTapImageJJXpD5M(@NotNull String messageId, int attachmentIndex, @NotNull String type, int viewWidth, int viewHeight, int viewX, int viewY, @NotNull ViewResizeMode viewResizeMode, Double portal, Integer embedIndex, String componentId, Integer componentMediaIndex, String embedId) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(viewResizeMode, "viewResizeMode");
        this.emitReactEvent.invoke(new TapImageData(MessageId.m1163toStringimpl(messageId), attachmentIndex, type, new TapImageData.Layout(viewWidth, viewHeight, viewX, viewY, viewResizeMode), portal, embedIndex, componentId, componentMediaIndex, embedId));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    public void onTapInlineCode(@NotNull InlineCodeContentNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        this.emitReactEvent.invoke(new TapInlineCodeEvent(node));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* JADX INFO: renamed from: onTapInlineForward-j8a4Y88 */
    public void mo494onTapInlineForwardj8a4Y88(long channelId, @NotNull String messageId, @NotNull String targetKind, Integer embedIndex, Boolean triggerHaptic, String location) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(targetKind, "targetKind");
        this.emitReactEvent.invoke(new TapInlineForwardData(ChannelId.m1137toStringimpl(channelId), MessageId.m1163toStringimpl(messageId), targetKind, embedIndex, triggerHaptic, location));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* JADX INFO: renamed from: onTapInviteEmbed-AFFcxXc */
    public void mo495onTapInviteEmbedAFFcxXc(@NotNull String messageId, int index, Boolean primary, Boolean secondary) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        this.emitReactEvent.invoke(new TapInviteEvent(messageId, index, primary, secondary));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* JADX INFO: renamed from: onTapInviteEmbedAccept-ntcYbpo */
    public void mo496onTapInviteEmbedAcceptntcYbpo(@NotNull String messageId, int index) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        this.emitReactEvent.invoke(new TapInviteAcceptEvent(messageId, index));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* JADX INFO: renamed from: onTapInviteToSpeak-1xi1bu0 */
    public void mo497onTapInviteToSpeak1xi1bu0(@NotNull String messageId) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        this.emitReactEvent.invoke(new TapInviteToSpeakData(messageId, null));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* JADX INFO: renamed from: onTapJoinActivity-1xi1bu0 */
    public void mo498onTapJoinActivity1xi1bu0(@NotNull String messageId) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        this.emitReactEvent.invoke(new TapJoinActivityData(messageId, null));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* JADX INFO: renamed from: onTapJoinRichPresence-1xi1bu0 */
    public void mo499onTapJoinRichPresence1xi1bu0(@NotNull String messageId) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        this.emitReactEvent.invoke(new TapJoinRichPresenceData(messageId, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.discord.chat.presentation.events.ChatEventHandler
    public void onTapLoadMessagesAfter() {
        this.emitReactEvent.invoke(new TapSeparatorData("load_more_after", null, 2, 0 == true ? 1 : 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.discord.chat.presentation.events.ChatEventHandler
    public void onTapLoadMessagesBefore() {
        this.emitReactEvent.invoke(new TapSeparatorData("load_more_before", null, 2, 0 == true ? 1 : 0));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    public void onTapMention(String userId, @NotNull String channelId, String roleName, String parsedUserId, String roleId, String guildId) {
        Intrinsics.checkNotNullParameter(channelId, "channelId");
        this.emitReactEvent.invoke(new TapMentionData(userId, channelId, roleName, parsedUserId, roleId, guildId));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* JADX INFO: renamed from: onTapMessageReply-0eiqbug */
    public void mo500onTapMessageReply0eiqbug(long channelId, @NotNull String originId) {
        Intrinsics.checkNotNullParameter(originId, "originId");
        this.emitReactEvent.invoke(new TapMessageReplyData(ChannelId.m1137toStringimpl(channelId), MessageId.m1163toStringimpl(originId)));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* JADX INFO: renamed from: onTapObscuredMediaLearnMore-8a0ehIg */
    public void mo501onTapObscuredMediaLearnMore8a0ehIg(@NotNull String messageId, long channelId, String attachmentId, String embedId) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        this.emitReactEvent.invoke(new TapObscuredMediaLearnMoreData(MessageId.m1163toStringimpl(messageId), ChannelId.m1137toStringimpl(channelId), String.valueOf(attachmentId), String.valueOf(embedId)));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* JADX INFO: renamed from: onTapObscuredMediaToggle-ZQwuxwg */
    public void mo502onTapObscuredMediaToggleZQwuxwg(@NotNull String messageId, long channelId, boolean isReveal, String attachmentId, String embedId) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        this.emitReactEvent.invoke(new TapObscuredMediaToggleData(MessageId.m1163toStringimpl(messageId), ChannelId.m1137toStringimpl(channelId), String.valueOf(attachmentId), String.valueOf(embedId), isReveal));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    public void onTapOpTag() {
        this.emitReactEvent.invoke(TapOpTagData.INSTANCE);
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* JADX INFO: renamed from: onTapPollAction-sekaTiM */
    public void mo503onTapPollActionsekaTiM(long channelId, @NotNull String messageId, @NotNull String type) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(type, "type");
        this.emitReactEvent.invoke(new TapPollAction(ChannelId.m1137toStringimpl(channelId), MessageId.m1163toStringimpl(messageId), type));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* JADX INFO: renamed from: onTapPollAnswer-sekaTiM */
    public void mo504onTapPollAnswersekaTiM(long channelId, @NotNull String messageId, @NotNull String answerId) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(answerId, "answerId");
        this.emitReactEvent.invoke(new TapPollAnswer(ChannelId.m1137toStringimpl(channelId), MessageId.m1163toStringimpl(messageId), answerId));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    @d
    /* JADX INFO: renamed from: onTapPollSubmitVote-0eiqbug */
    public void mo505onTapPollSubmitVote0eiqbug(long channelId, @NotNull String messageId) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        this.emitReactEvent.invoke(new TapPollSubmitVote(ChannelId.m1137toStringimpl(channelId), MessageId.m1163toStringimpl(messageId)));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* JADX INFO: renamed from: onTapPostPreviewEmbed-kUTrp-s */
    public void mo506onTapPostPreviewEmbedkUTrps(long guildId, long parentChannelId, long threadId, @NotNull String messageId) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        this.emitReactEvent.invoke(new TapPostPreviewEmbedData(GuildId.m1150toStringimpl(guildId), ChannelId.m1137toStringimpl(parentChannelId), ChannelId.m1137toStringimpl(threadId), messageId, null));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* JADX INFO: renamed from: onTapPreviewSharedClientTheme-1xi1bu0 */
    public void mo507onTapPreviewSharedClientTheme1xi1bu0(@NotNull String messageId) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        this.emitReactEvent.invoke(new TapPreviewSharedClientThemeData(messageId, null));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* JADX INFO: renamed from: onTapReaction-AFFcxXc */
    public void mo508onTapReactionAFFcxXc(@NotNull String messageId, ReactionView.Reaction reaction, Boolean isBurst, String location) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        this.emitReactEvent.invoke(new TapReactionData(messageId, reaction, isBurst, location, null));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* JADX INFO: renamed from: onTapReactionOverflow-pfaIj0E */
    public void mo509onTapReactionOverflowpfaIj0E(@NotNull String messageId, long channelId) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        this.emitReactEvent.invoke(new TapReactionOverflow(MessageId.m1163toStringimpl(messageId), ChannelId.m1137toStringimpl(channelId)));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    public void onTapReferralRedeem(String referralId) {
        this.emitReactEvent.invoke(new TapReferralRedeemData(referralId));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    public void onTapRoleIcon(@NotNull String roleName, @NotNull String roleIconSource) {
        Intrinsics.checkNotNullParameter(roleName, "roleName");
        Intrinsics.checkNotNullParameter(roleIconSource, "roleIconSource");
        this.emitReactEvent.invoke(new TapRoleIconData(roleName, roleIconSource));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    public void onTapSafetyPolicyNoticeEmbed(@NotNull String classificationId) {
        Intrinsics.checkNotNullParameter(classificationId, "classificationId");
        this.emitReactEvent.invoke(new TapSafetyPolicyNoticeEmbed(classificationId));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    public void onTapSafetySystemNotificationCta(@NotNull String ctaType, @NotNull String ctaKey) {
        Intrinsics.checkNotNullParameter(ctaType, "ctaType");
        Intrinsics.checkNotNullParameter(ctaKey, "ctaKey");
        this.emitReactEvent.invoke(new TapSafetySystemNotificationCta(ctaType, ctaKey));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* JADX INFO: renamed from: onTapSeeMore-1xi1bu0 */
    public void mo510onTapSeeMore1xi1bu0(@NotNull String messageId) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        this.emitReactEvent.invoke(new TapSeeMoreData(messageId, null));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* JADX INFO: renamed from: onTapSelectActionComponent-ntcYbpo */
    public void mo511onTapSelectActionComponentntcYbpo(@NotNull String messageId, @NotNull String componentId) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(componentId, "componentId");
        this.emitReactEvent.invoke(new TapSelectActionComponent(messageId, componentId, null));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* JADX INFO: renamed from: onTapShareForumPost-mgk6anA */
    public void mo512onTapShareForumPostmgk6anA(long channelId, long guildId) {
        this.emitReactEvent.invoke(new TapShareForumPost(ChannelId.m1137toStringimpl(channelId), GuildId.m1150toStringimpl(guildId)));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    public void onTapShowAltText(@NotNull String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        this.emitReactEvent.invoke(new TapShowAltTextData(description));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    public void onTapSoundmoji(@NotNull SoundmojiContentNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        this.emitReactEvent.invoke(new TapSoundmojiData(node.getSoundId(), ChannelId.m1137toStringimpl(node.m404getChannelIdo4g7jtM()), node.getGuildId(), node.m405getMessageId3Eiw7ao(), null));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* JADX INFO: renamed from: onTapSummary-sekaTiM */
    public void mo513onTapSummarysekaTiM(long channelId, @NotNull String messageId, @NotNull String summaryId) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(summaryId, "summaryId");
        this.emitReactEvent.invoke(new TapSummaryData(ChannelId.m1137toStringimpl(channelId), MessageId.m1163toStringimpl(messageId), summaryId));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* JADX INFO: renamed from: onTapSummaryJump-sekaTiM */
    public void mo514onTapSummaryJumpsekaTiM(long channelId, @NotNull String messageId, @NotNull String summaryId) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(summaryId, "summaryId");
        this.emitReactEvent.invoke(new TapSummaryJumpData(ChannelId.m1137toStringimpl(channelId), MessageId.m1163toStringimpl(messageId), summaryId));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    public void onTapSuppressNotificationsIcon() {
        this.emitReactEvent.invoke(TapSuppressNotificationsIconData.INSTANCE);
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* JADX INFO: renamed from: onTapTag-Eqy5D80 */
    public void mo515onTapTagEqy5D80(@NotNull String messageId, long channelId, String tagType) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        this.emitReactEvent.invoke(new TapTagData(messageId, channelId, tagType, null));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* JADX INFO: renamed from: onTapThreadEmbed-1xi1bu0 */
    public void mo516onTapThreadEmbed1xi1bu0(@NotNull String messageId) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        this.emitReactEvent.invoke(new TapThreadEmbedEvent(messageId));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    public void onTapTimeoutIcon() {
        this.emitReactEvent.invoke(TapTimeoutIconData.INSTANCE);
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    public void onTapTimestamp(@NotNull String timestamp) {
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        this.emitReactEvent.invoke(new TapTimestampEvent(timestamp));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* JADX INFO: renamed from: onTapToggleBlockedMessages-1xi1bu0 */
    public void mo517onTapToggleBlockedMessages1xi1bu0(@NotNull String messageId) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        this.emitReactEvent.invoke(new TapSeparatorData("toggle", MessageId.m1163toStringimpl(messageId)));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* JADX INFO: renamed from: onTapUsername-x5gers8 */
    public void mo518onTapUsernamex5gers8(@NotNull String messageId, long userId) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        this.emitReactEvent.invoke(new TapUsernameData(MessageId.m1163toStringimpl(messageId), UserId.m1215toStringimpl(userId)));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    public void onTapVoiceChannelBadge(@NotNull String channelId) {
        Intrinsics.checkNotNullParameter(channelId, "channelId");
        this.emitReactEvent.invoke(new TapVoiceChannelBadgeData(channelId));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* JADX INFO: renamed from: onWelcomeReplyClicked-Ayv7vGE */
    public void mo519onWelcomeReplyClickedAyv7vGE(@NotNull Sticker sticker, @NotNull String messageId) {
        Intrinsics.checkNotNullParameter(sticker, "sticker");
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        this.emitReactEvent.invoke(new TapWelcomeReplyData(sticker.getId(), messageId, null));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* JADX INFO: renamed from: voiceMessagePlaybackFailed-ntcYbpo */
    public void mo520voiceMessagePlaybackFailedntcYbpo(@NotNull String messageId, String errorMessage) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        this.emitReactEvent.invoke(new VoiceMessagePlaybackFailedData(messageId, errorMessage, null));
    }
}
