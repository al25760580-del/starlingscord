package com.discord.chat.presentation.events;

import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.bridge.contentnode.CommandMentionContentNode;
import com.discord.chat.bridge.contentnode.EmojiContentNode;
import com.discord.chat.bridge.contentnode.GameMentionContentNode;
import com.discord.chat.bridge.contentnode.InlineCodeContentNode;
import com.discord.chat.bridge.contentnode.LinkContentNode;
import com.discord.chat.bridge.contentnode.SoundmojiContentNode;
import com.discord.chat.bridge.sticker.Sticker;
import com.discord.chat.presentation.list.ScrollState;
import com.discord.chat.reactevents.ViewResizeMode;
import com.discord.media_player.reactevents.MediaPlayFinishedAnalytics;
import com.discord.primitives.ChannelId;
import com.discord.primitives.MessageId;
import com.discord.reactions.ReactionView;
import com.facebook.react.modules.dialog.AlertFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rn.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\r\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0007\n\u0002\b>\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0002¶\u0002J\u001f\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H&¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u001d\u0010\u0014J\u001f\u0010#\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H&¢\u0006\u0004\b#\u0010$J\u001f\u0010)\u001a\u00020\u00062\u0006\u0010&\u001a\u00020%2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b'\u0010(J\u001f\u0010+\u001a\u00020\u00062\u0006\u0010&\u001a\u00020%2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b*\u0010(J\u001f\u0010-\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b,\u0010\u0014J\u001f\u00101\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010.\u001a\u00020\nH&¢\u0006\u0004\b/\u00100J\u001f\u00103\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b2\u0010\u0014J+\u00105\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\n2\b\u00104\u001a\u0004\u0018\u00010\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b5\u0010\u000eJ5\u00107\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\n2\b\u00104\u001a\u0004\u0018\u00010\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\n2\b\u00106\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u00020\u00062\u0006\u00109\u001a\u00020\nH&¢\u0006\u0004\b:\u0010;J\u001f\u0010=\u001a\u00020\u00062\u0006\u00109\u001a\u00020\n2\u0006\u0010<\u001a\u00020\nH&¢\u0006\u0004\b=\u00100J\u0017\u0010@\u001a\u00020\u00062\u0006\u0010?\u001a\u00020>H&¢\u0006\u0004\b@\u0010AJ!\u0010D\u001a\u00020\u00062\u0006\u0010B\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\bC\u00100J\u0019\u0010F\u001a\u00020\u00062\b\u0010E\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\bF\u0010;J\u0017\u0010G\u001a\u00020\u00062\u0006\u0010B\u001a\u00020\nH&¢\u0006\u0004\bG\u0010;J\u0083\u0001\u0010W\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010H\u001a\u00020!2\u0006\u0010I\u001a\u00020\n2\u0006\u0010J\u001a\u00020!2\u0006\u0010K\u001a\u00020!2\u0006\u0010L\u001a\u00020!2\u0006\u0010M\u001a\u00020!2\u0006\u0010O\u001a\u00020N2\b\u0010Q\u001a\u0004\u0018\u00010P2\b\u0010R\u001a\u0004\u0018\u00010!2\b\u0010.\u001a\u0004\u0018\u00010\n2\b\u0010S\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010T\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\bU\u0010VJ3\u0010^\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010X\u001a\u00020!2\b\u0010Z\u001a\u0004\u0018\u00010Y2\b\u0010[\u001a\u0004\u0018\u00010YH&¢\u0006\u0004\b\\\u0010]J\u001f\u0010a\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010X\u001a\u00020!H&¢\u0006\u0004\b_\u0010`J\u000f\u0010b\u001a\u00020\u0006H&¢\u0006\u0004\bb\u0010cJ\u000f\u0010d\u001a\u00020\u0006H&¢\u0006\u0004\bd\u0010cJM\u0010h\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0017\u001a\u00020\n2\b\u0010e\u001a\u0004\u0018\u00010\n2\b\u0010f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010g\u001a\u0004\u0018\u00010\n2\n\b\u0002\u00104\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\bh\u0010iJ\u0017\u0010k\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020jH&¢\u0006\u0004\bk\u0010lJ\u0017\u0010m\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020jH&¢\u0006\u0004\bm\u0010lJ\u0017\u0010o\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020nH&¢\u0006\u0004\bo\u0010pJ\u001f\u0010t\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010q\u001a\u00020\u0002H&¢\u0006\u0004\br\u0010sJ9\u0010y\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010u\u001a\u0004\u0018\u00010Y2\n\b\u0002\u0010v\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\bw\u0010xJ'\u0010}\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010z\u001a\u00020\nH&¢\u0006\u0004\b{\u0010|J'\u0010\u007f\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010z\u001a\u00020\nH&¢\u0006\u0004\b~\u0010|J\"\u0010\u0081\u0001\u001a\u00020\u00062\u0006\u0010e\u001a\u00020\n2\u0007\u0010\u0080\u0001\u001a\u00020\nH&¢\u0006\u0005\b\u0081\u0001\u00100J\u0019\u0010\u0082\u0001\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\nH&¢\u0006\u0005\b\u0082\u0001\u0010;J#\u0010\u0085\u0001\u001a\u00020\u00062\u0007\u0010\u0083\u0001\u001a\u00020\n2\u0007\u0010\u0084\u0001\u001a\u00020\nH&¢\u0006\u0005\b\u0085\u0001\u00100J\u0011\u0010\u0086\u0001\u001a\u00020\u0006H&¢\u0006\u0005\b\u0086\u0001\u0010cJ\u0011\u0010\u0087\u0001\u001a\u00020\u0006H&¢\u0006\u0005\b\u0087\u0001\u0010cJ1\u0010\u0088\u0001\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\n2\u0006\u00104\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010g\u001a\u00020\nH&¢\u0006\u0005\b\u0088\u0001\u00108J!\u0010\u008a\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010.\u001a\u00020\nH&¢\u0006\u0005\b\u0089\u0001\u00100J\u001a\u0010\u008b\u0001\u001a\u00020\u00062\u0007\u0010\u0084\u0001\u001a\u00020\nH&¢\u0006\u0005\b\u008b\u0001\u0010;J\u001b\u0010\u008d\u0001\u001a\u00020\u00062\u0007\u0010\u0005\u001a\u00030\u008c\u0001H&¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J\u0019\u0010\u0090\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0005\b\u008f\u0001\u0010;J\u0019\u0010\u0092\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0005\b\u0091\u0001\u0010;J\u001a\u0010\u0094\u0001\u001a\u00020\u00062\u0007\u0010\u0093\u0001\u001a\u00020\nH&¢\u0006\u0005\b\u0094\u0001\u0010;J#\u0010\u0097\u0001\u001a\u00020\u00062\u0007\u0010\u0095\u0001\u001a\u00020\n2\u0007\u0010\u0096\u0001\u001a\u00020\nH&¢\u0006\u0005\b\u0097\u0001\u00100J!\u0010\u0099\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0005\b\u0098\u0001\u0010\u0014J!\u0010\u009b\u0001\u001a\u00020\u00062\u0006\u0010&\u001a\u00020%2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0005\b\u009a\u0001\u0010(J\u0019\u0010\u009d\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0005\b\u009c\u0001\u0010;J\u0019\u0010\u009f\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0005\b\u009e\u0001\u0010;J\u0019\u0010¡\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0005\b \u0001\u0010;J\u001c\u0010¤\u0001\u001a\u00020\u00062\b\u0010£\u0001\u001a\u00030¢\u0001H&¢\u0006\u0006\b¤\u0001\u0010¥\u0001J!\u0010§\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0005\b¦\u0001\u0010\u0014J#\u0010«\u0001\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0007\u00104\u001a\u00030¨\u0001H&¢\u0006\u0006\b©\u0001\u0010ª\u0001J!\u0010\u00ad\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0005\b¬\u0001\u0010\u0014J!\u0010¯\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0005\b®\u0001\u0010\u0014J!\u0010±\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0005\b°\u0001\u0010\u0014J\u0011\u0010²\u0001\u001a\u00020\u0006H&¢\u0006\u0005\b²\u0001\u0010cJ-\u0010¶\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\t\u0010³\u0001\u001a\u0004\u0018\u00010\nH&¢\u0006\u0006\b´\u0001\u0010µ\u0001J\u0019\u0010¸\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0005\b·\u0001\u0010;J\u001a\u0010º\u0001\u001a\u00020\u00062\u0007\u0010¹\u0001\u001a\u00020\nH&¢\u0006\u0005\bº\u0001\u0010;J;\u0010¾\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u000b\b\u0002\u0010»\u0001\u001a\u0004\u0018\u00010Y2\n\b\u0002\u0010v\u001a\u0004\u0018\u00010\nH&¢\u0006\u0006\b¼\u0001\u0010½\u0001J!\u0010À\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0005\b¿\u0001\u0010\u0014J!\u0010Â\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0005\bÁ\u0001\u0010\u0014JI\u0010Ë\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010Ä\u0001\u001a\u00030Ã\u00012\b\u0010Å\u0001\u001a\u00030Ã\u00012\u0007\u0010Æ\u0001\u001a\u00020\u00112\u0007\u0010Ç\u0001\u001a\u00020Y2\u0007\u0010È\u0001\u001a\u00020\nH&¢\u0006\u0006\bÉ\u0001\u0010Ê\u0001JS\u0010Ð\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010Ä\u0001\u001a\u00030Ã\u00012\b\u0010Ì\u0001\u001a\u00030Ã\u00012\u0007\u0010Æ\u0001\u001a\u00020\u00112\b\u0010Í\u0001\u001a\u00030Ã\u00012\u0007\u0010Ç\u0001\u001a\u00020Y2\u0007\u0010È\u0001\u001a\u00020\nH&¢\u0006\u0006\bÎ\u0001\u0010Ï\u0001J$\u0010Ó\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\t\u0010Ñ\u0001\u001a\u0004\u0018\u00010\nH&¢\u0006\u0005\bÒ\u0001\u00100J4\u0010×\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\n2\u0007\u0010Ô\u0001\u001a\u00020\n2\u0007\u0010Õ\u0001\u001a\u00020\n2\u0007\u0010Ö\u0001\u001a\u00020\nH&¢\u0006\u0005\b×\u0001\u00108J5\u0010Ü\u0001\u001a\u00020\u00062\u0007\u00104\u001a\u00030¨\u00012\u0007\u0010Ø\u0001\u001a\u00020\u00162\u0007\u0010Ù\u0001\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0006\bÚ\u0001\u0010Û\u0001J\u0019\u0010Þ\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0005\bÝ\u0001\u0010;J+\u0010á\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0007\u0010ß\u0001\u001a\u00020\nH&¢\u0006\u0006\bà\u0001\u0010µ\u0001J7\u0010ä\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\t\u0010È\u0001\u001a\u0004\u0018\u00010\n2\b\u0010T\u001a\u0004\u0018\u00010\nH&¢\u0006\u0006\bâ\u0001\u0010ã\u0001J@\u0010è\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0007\u0010å\u0001\u001a\u00020Y2\t\u0010È\u0001\u001a\u0004\u0018\u00010\n2\b\u0010T\u001a\u0004\u0018\u00010\nH&¢\u0006\u0006\bæ\u0001\u0010ç\u0001J\u001a\u0010ê\u0001\u001a\u00020\u00062\u0007\u0010é\u0001\u001a\u00020\nH&¢\u0006\u0005\bê\u0001\u0010;J#\u0010í\u0001\u001a\u00020\u00062\u0007\u0010ë\u0001\u001a\u00020\n2\u0007\u0010ì\u0001\u001a\u00020\nH&¢\u0006\u0005\bí\u0001\u00100J*\u0010ð\u0001\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00022\u0007\u0010î\u0001\u001a\u00020\nH&¢\u0006\u0005\bï\u0001\u0010|J*\u0010ó\u0001\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00022\u0007\u0010ñ\u0001\u001a\u00020\nH&¢\u0006\u0005\bò\u0001\u0010|J!\u0010õ\u0001\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0005\bô\u0001\u0010sJ)\u0010÷\u0001\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010I\u001a\u00020\nH&¢\u0006\u0005\bö\u0001\u0010|JS\u0010ú\u0001\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00022\u0007\u0010È\u0001\u001a\u00020\n2\u0006\u0010J\u001a\u00020!2\u0006\u0010K\u001a\u00020!2\u0006\u0010L\u001a\u00020!2\u0006\u0010M\u001a\u00020!2\u0006\u0010O\u001a\u00020NH&¢\u0006\u0006\bø\u0001\u0010ù\u0001J:\u0010ÿ\u0001\u001a\u00020\u00062\u0007\u0010û\u0001\u001a\u00020!2\t\u0010ü\u0001\u001a\u0004\u0018\u00010P2\u0007\u0010ý\u0001\u001a\u00020!2\t\u0010þ\u0001\u001a\u0004\u0018\u00010PH&¢\u0006\u0006\bÿ\u0001\u0010\u0080\u0002J\u0011\u0010\u0081\u0002\u001a\u00020\u0006H&¢\u0006\u0005\b\u0081\u0002\u0010cJ\u001c\u0010\u0084\u0002\u001a\u00020\u00062\b\u0010\u0083\u0002\u001a\u00030\u0082\u0002H&¢\u0006\u0006\b\u0084\u0002\u0010\u0085\u0002J+\u0010\u0089\u0002\u001a\u00020\u00062\u0007\u0010\u0086\u0002\u001a\u00020!2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0006\b\u0087\u0002\u0010\u0088\u0002JN\u0010\u008d\u0002\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00022\u0007\u0010\u008a\u0002\u001a\u00020\n2\b\u0010R\u001a\u0004\u0018\u00010!2\u000b\b\u0002\u0010»\u0001\u001a\u0004\u0018\u00010Y2\n\b\u0002\u0010v\u001a\u0004\u0018\u00010\nH&¢\u0006\u0006\b\u008b\u0002\u0010\u008c\u0002J\u001b\u0010\u0090\u0002\u001a\u00020\u00062\u0007\u00104\u001a\u00030¨\u0001H&¢\u0006\u0006\b\u008e\u0002\u0010\u008f\u0002J5\u0010\u0095\u0002\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0007\u0010\u0091\u0002\u001a\u00020\u00112\u0007\u0010\u0092\u0002\u001a\u00020\n2\u0007\u0010\u0093\u0002\u001a\u00020\nH&¢\u0006\u0006\b\u0094\u0002\u0010ã\u0001J\"\u0010\u0097\u0002\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0007\u0010\u0091\u0002\u001a\u00020\u0011H&¢\u0006\u0005\b\u0096\u0002\u0010\u0014J\u001b\u0010\u0099\u0002\u001a\u00020\u00062\u0007\u0010\u0005\u001a\u00030\u0098\u0002H&¢\u0006\u0006\b\u0099\u0002\u0010\u009a\u0002J\u0019\u0010\u009c\u0002\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0005\b\u009b\u0002\u0010;J\u0019\u0010\u009e\u0002\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0005\b\u009d\u0002\u0010;J,\u0010£\u0002\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0007\u0010\u009f\u0002\u001a\u00020\u00112\u0007\u0010 \u0002\u001a\u00020!H&¢\u0006\u0006\b¡\u0002\u0010¢\u0002J,\u0010¥\u0002\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0007\u0010\u009f\u0002\u001a\u00020\u00112\u0007\u0010 \u0002\u001a\u00020!H&¢\u0006\u0006\b¤\u0002\u0010¢\u0002J,\u0010§\u0002\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0007\u0010\u009f\u0002\u001a\u00020\u00112\u0007\u0010 \u0002\u001a\u00020!H&¢\u0006\u0006\b¦\u0002\u0010¢\u0002RT\u0010\u00ad\u0002\u001a?\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0016\u0012\u0006\u0012\u0004\u0018\u00010!\u0012\u0007\u0012\u0005\u0018\u00010©\u0002\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010!\u0012\u0004\u0012\u00020\u0006\u0018\u00010¨\u0002j\u0005\u0018\u0001`ª\u00028&X¦\u0004¢\u0006\b\u001a\u0006\b«\u0002\u0010¬\u0002R3\u0010²\u0002\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010®\u0002j\u0005\u0018\u0001`¯\u00028&X¦\u0004¢\u0006\b\u001a\u0006\b°\u0002\u0010±\u0002R3\u0010µ\u0002\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010®\u0002j\u0005\u0018\u0001`³\u00028&X¦\u0004¢\u0006\b\u001a\u0006\b´\u0002\u0010±\u0002¨\u0006·\u0002"}, d2 = {"Lcom/discord/chat/presentation/events/ChatEventHandler;", "", "Lcom/discord/primitives/MessageId;", "messageId", "Lcom/discord/chat/bridge/contentnode/LinkContentNode;", "node", "", "onLinkClicked-ntcYbpo", "(Ljava/lang/String;Lcom/discord/chat/bridge/contentnode/LinkContentNode;)V", "onLinkClicked", "", "url", AlertFragment.ARG_TITLE, "onLinkClicked-u7_MRrM", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "onLinkLongClicked", "(Lcom/discord/chat/bridge/contentnode/LinkContentNode;)V", "Lcom/discord/primitives/UserId;", "userId", "onLongPressAvatar-x5gers8", "(Ljava/lang/String;J)V", "onLongPressAvatar", "Lcom/discord/primitives/ChannelId;", "channelId", "Lcom/discord/reactions/ReactionView$Reaction;", "reaction", "onLongPressReaction-Eqy5D80", "(Ljava/lang/String;JLcom/discord/reactions/ReactionView$Reaction;)V", "onLongPressReaction", "onLongPressUsername-x5gers8", "onLongPressUsername", "Lcom/discord/chat/presentation/list/ScrollState;", "scrollState", "", "changesetUpdateId", "onScrollStateChanged", "(Lcom/discord/chat/presentation/list/ScrollState;I)V", "Lcom/discord/chat/bridge/sticker/Sticker;", "sticker", "onStickerClicked-Ayv7vGE", "(Lcom/discord/chat/bridge/sticker/Sticker;Ljava/lang/String;)V", "onStickerClicked", "onStickerLongClicked-Ayv7vGE", "onStickerLongClicked", "onTapAvatar-x5gers8", "onTapAvatar", "componentId", "onTapButtonActionComponent-ntcYbpo", "(Ljava/lang/String;Ljava/lang/String;)V", "onTapButtonActionComponent", "onTapCall-pfaIj0E", "onTapCall", "guildId", "onTapChannel", "originalLink", "onLongPressChannel", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "attachmentUrl", "onTapAttachmentLink", "(Ljava/lang/String;)V", "attachmentName", "onLongPressAttachmentLink", "", "text", "onTapCopyText", "(Ljava/lang/CharSequence;)V", "giftCode", "onTapGiftCodeAccept-NU4t8f8", "onTapGiftCodeAccept", "referralId", "onTapReferralRedeem", "onTapGiftCodeEmbed", "attachmentIndex", "type", "viewWidth", "viewHeight", "viewX", "viewY", "Lcom/discord/chat/reactevents/ViewResizeMode;", "viewResizeMode", "", "portal", "embedIndex", "componentMediaIndex", "embedId", "onTapImage-JJXpD5M", "(Ljava/lang/String;ILjava/lang/String;IIIILcom/discord/chat/reactevents/ViewResizeMode;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "onTapImage", "index", "", "primary", "secondary", "onTapInviteEmbed-AFFcxXc", "(Ljava/lang/String;ILjava/lang/Boolean;Ljava/lang/Boolean;)V", "onTapInviteEmbed", "onTapInviteEmbedAccept-ntcYbpo", "(Ljava/lang/String;I)V", "onTapInviteEmbedAccept", "onTapLoadMessagesAfter", "()V", "onTapLoadMessagesBefore", "roleName", "parsedUserId", "roleId", "onTapMention", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;", "onTapCommand", "(Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;)V", "onLongPressCommand", "Lcom/discord/chat/bridge/contentnode/GameMentionContentNode;", "onTapGameMention", "(Lcom/discord/chat/bridge/contentnode/GameMentionContentNode;)V", "originId", "onTapMessageReply-0eiqbug", "(JLjava/lang/String;)V", "onTapMessageReply", "isBurst", "location", "onTapReaction-AFFcxXc", "(Ljava/lang/String;Lcom/discord/reactions/ReactionView$Reaction;Ljava/lang/Boolean;Ljava/lang/String;)V", "onTapReaction", "summaryId", "onTapSummary-sekaTiM", "(JLjava/lang/String;Ljava/lang/String;)V", "onTapSummary", "onTapSummaryJump-sekaTiM", "onTapSummaryJump", "roleIconSource", "onTapRoleIcon", "onTapVoiceChannelBadge", "gameApplicationId", "timestamp", "onTapGameIcon", "onTapSuppressNotificationsIcon", "onTapTimeoutIcon", "onTapConnectionsRoleTag", "onTapSelectActionComponent-ntcYbpo", "onTapSelectActionComponent", "onTapTimestamp", "Lcom/discord/chat/bridge/contentnode/InlineCodeContentNode;", "onTapInlineCode", "(Lcom/discord/chat/bridge/contentnode/InlineCodeContentNode;)V", "onTapThreadEmbed-1xi1bu0", "onTapThreadEmbed", "onTapToggleBlockedMessages-1xi1bu0", "onTapToggleBlockedMessages", "context", "onTapDismissBlockedMessages", "uploaderId", "itemId", "onTapCancelUploadItem", "onTapUsername-x5gers8", "onTapUsername", "onWelcomeReplyClicked-Ayv7vGE", "onWelcomeReplyClicked", "onTapInviteToSpeak-1xi1bu0", "onTapInviteToSpeak", "onTapJoinActivity-1xi1bu0", "onTapJoinActivity", "onTapJoinRichPresence-1xi1bu0", "onTapJoinRichPresence", "Lcom/discord/chat/bridge/contentnode/EmojiContentNode;", "emoji", "onTapEmoji", "(Lcom/discord/chat/bridge/contentnode/EmojiContentNode;)V", "onTapFollowForumPost-pfaIj0E", "onTapFollowForumPost", "Lcom/discord/primitives/GuildId;", "onTapShareForumPost-mgk6anA", "(JJ)V", "onTapShareForumPost", "onTapReactionOverflow-pfaIj0E", "onTapReactionOverflow", "onTapAutoModerationActions-pfaIj0E", "onTapAutoModerationActions", "onTapAutoModerationFeedback-pfaIj0E", "onTapAutoModerationFeedback", "onTapOpTag", "tagType", "onTapTag-Eqy5D80", "(Ljava/lang/String;JLjava/lang/String;)V", "onTapTag", "onTapSeeMore-1xi1bu0", "onTapSeeMore", "description", "onTapShowAltText", "triggerHaptic", "onInitiateReply-8a0ehIg", "(Ljava/lang/String;JLjava/lang/Boolean;Ljava/lang/String;)V", "onInitiateReply", "onInitiateThread-pfaIj0E", "onInitiateThread", "onInitiateEdit-pfaIj0E", "onInitiateEdit", "", "totalDurationSecs", "startDurationSecs", "senderUserId", "isVoiceMessage", "attachmentId", "mediaAttachmentPlaybackStarted-jd4C3YQ", "(Ljava/lang/String;FFJZLjava/lang/String;)V", "mediaAttachmentPlaybackStarted", "endDurationSecs", "durationListeningSecs", "mediaAttachmentPlaybackEnded-O97gnAM", "(Ljava/lang/String;FFJFZLjava/lang/String;)V", "mediaAttachmentPlaybackEnded", "errorMessage", "voiceMessagePlaybackFailed-ntcYbpo", "voiceMessagePlaybackFailed", "actionId", "appId", "embedUrl", "onTapAppMessageEmbed", "parentChannelId", "threadId", "onTapPostPreviewEmbed-kUTrp-s", "(JJJLjava/lang/String;)V", "onTapPostPreviewEmbed", "onTapDismissMediaPostSharePrompt-1xi1bu0", "onTapDismissMediaPostSharePrompt", "buttonType", "onTapChannelPromptButton-Eqy5D80", "onTapChannelPromptButton", "onTapObscuredMediaLearnMore-8a0ehIg", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V", "onTapObscuredMediaLearnMore", "isReveal", "onTapObscuredMediaToggle-ZQwuxwg", "(Ljava/lang/String;JZLjava/lang/String;Ljava/lang/String;)V", "onTapObscuredMediaToggle", "classificationId", "onTapSafetyPolicyNoticeEmbed", "ctaType", "ctaKey", "onTapSafetySystemNotificationCta", "answerId", "onTapPollAnswer-sekaTiM", "onTapPollAnswer", "callback", "onTapCtaButton-sekaTiM", "onTapCtaButton", "onTapPollSubmitVote-0eiqbug", "onTapPollSubmitVote", "onTapPollAction-sekaTiM", "onTapPollAction", "onLongPressPollImage-YVExdug", "(JLjava/lang/String;Ljava/lang/String;IIIILcom/discord/chat/reactevents/ViewResizeMode;)V", "onLongPressPollImage", "firstVisibleMessageIndex", "firstVisibleMessagePercentVisible", "lastVisibleMessageIndex", "lastVisibleMessagePercentVisible", "onFirstLayout", "(ILjava/lang/Double;ILjava/lang/Double;)V", "onCompleteFirstLayout", "Lcom/discord/media_player/reactevents/MediaPlayFinishedAnalytics;", "analytics", "onMediaPlayFinishedAnalytics", "(Lcom/discord/media_player/reactevents/MediaPlayFinishedAnalytics;)V", "snapshotIndex", "onTapForwardFooter-SHRpUJI", "(IJLjava/lang/String;)V", "onTapForwardFooter", "targetKind", "onTapInlineForward-j8a4Y88", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;)V", "onTapInlineForward", "onTapClanTagChiplet-g3bFfsM", "(J)V", "onTapClanTagChiplet", "authorId", "contentId", "tappedElement", "onTapContentInventoryEntryEmbed-tsfjtEQ", "onTapContentInventoryEntryEmbed", "onTapCheckpointCard-x5gers8", "onTapCheckpointCard", "Lcom/discord/chat/bridge/contentnode/SoundmojiContentNode;", "onTapSoundmoji", "(Lcom/discord/chat/bridge/contentnode/SoundmojiContentNode;)V", "onTapPreviewSharedClientTheme-1xi1bu0", "onTapPreviewSharedClientTheme", "onSharedClientThemeViewed-1xi1bu0", "onSharedClientThemeViewed", "recipientUserId", "giftIntentType", "onGiftIntentCardViewed-gzHKzLY", "(Ljava/lang/String;JI)V", "onGiftIntentCardViewed", "onTapGiftIntentPrimaryCta-gzHKzLY", "onTapGiftIntentPrimaryCta", "onTapGiftIntentSecondaryCta-gzHKzLY", "onTapGiftIntentSecondaryCta", "Lkotlin/Function6;", "Lcom/discord/chat/bridge/MediaType;", "Lcom/discord/chat/presentation/events/MessageLongPress;", "getOnMessageLongPressed", "()Lkotlin/jvm/functions/Function6;", "onMessageLongPressed", "Lkotlin/Function2;", "Lcom/discord/chat/presentation/events/MessageTapped;", "getOnMessageTapped", "()Lkotlin/jvm/functions/Function2;", "onMessageTapped", "Lcom/discord/chat/presentation/events/MessageDoubleTapped;", "getOnMessageDoubleTapped", "onMessageDoubleTapped", "Empty", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ChatEventHandler {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        /* JADX INFO: renamed from: onInitiateReply-8a0ehIg$default, reason: not valid java name */
        public static /* synthetic */ void m521onInitiateReply8a0ehIg$default(ChatEventHandler chatEventHandler, String str, long j, Boolean bool, String str2, int i7, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onInitiateReply-8a0ehIg");
            }
            if ((i7 & 4) != 0) {
                bool = Boolean.FALSE;
            }
            Boolean bool2 = bool;
            if ((i7 & 8) != 0) {
                str2 = null;
            }
            chatEventHandler.mo466onInitiateReply8a0ehIg(str, j, bool2, str2);
        }

        /* JADX INFO: renamed from: onLinkClicked-u7_MRrM$default, reason: not valid java name */
        public static /* synthetic */ void m522onLinkClickedu7_MRrM$default(ChatEventHandler chatEventHandler, String str, String str2, String str3, int i7, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onLinkClicked-u7_MRrM");
            }
            if ((i7 & 4) != 0) {
                str3 = null;
            }
            chatEventHandler.mo469onLinkClickedu7_MRrM(str, str2, str3);
        }

        /* JADX INFO: renamed from: onTapImage-JJXpD5M$default, reason: not valid java name */
        public static /* synthetic */ void m523onTapImageJJXpD5M$default(ChatEventHandler chatEventHandler, String str, int i7, String str2, int i10, int i11, int i12, int i13, ViewResizeMode viewResizeMode, Double d6, Integer num, String str3, Integer num2, String str4, int i14, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onTapImage-JJXpD5M");
            }
            chatEventHandler.mo493onTapImageJJXpD5M(str, i7, str2, i10, i11, i12, i13, viewResizeMode, d6, num, str3, num2, (i14 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : str4);
        }

        /* JADX INFO: renamed from: onTapInlineForward-j8a4Y88$default, reason: not valid java name */
        public static /* synthetic */ void m524onTapInlineForwardj8a4Y88$default(ChatEventHandler chatEventHandler, long j, String str, String str2, Integer num, Boolean bool, String str3, int i7, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onTapInlineForward-j8a4Y88");
            }
            if ((i7 & 16) != 0) {
                bool = Boolean.FALSE;
            }
            chatEventHandler.mo494onTapInlineForwardj8a4Y88(j, str, str2, num, bool, (i7 & 32) != 0 ? "inline-button" : str3);
        }

        public static /* synthetic */ void onTapMention$default(ChatEventHandler chatEventHandler, String str, String str2, String str3, String str4, String str5, String str6, int i7, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onTapMention");
            }
            if ((i7 & 16) != 0) {
                str5 = null;
            }
            if ((i7 & 32) != 0) {
                str6 = null;
            }
            chatEventHandler.onTapMention(str, str2, str3, str4, str5, str6);
        }

        /* JADX INFO: renamed from: onTapReaction-AFFcxXc$default, reason: not valid java name */
        public static /* synthetic */ void m525onTapReactionAFFcxXc$default(ChatEventHandler chatEventHandler, String str, ReactionView.Reaction reaction, Boolean bool, String str2, int i7, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onTapReaction-AFFcxXc");
            }
            if ((i7 & 4) != 0) {
                bool = Boolean.FALSE;
            }
            if ((i7 & 8) != 0) {
                str2 = null;
            }
            chatEventHandler.mo508onTapReactionAFFcxXc(str, reaction, bool, str2);
        }
    }

    @Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\r\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0007\n\u0002\b>\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000e\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u001f\u0010\u001a\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ)\u0010\u001f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b$\u0010%J\u001f\u0010&\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016¢\u0006\u0004\b'\u0010\u001eJ\u0018\u0010(\u001a\u00020\r2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0016J\u001f\u0010-\u001a\u00020\r2\u0006\u0010.\u001a\u00020/2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¢\u0006\u0004\b0\u00101J\u001f\u00102\u001a\u00020\r2\u0006\u0010.\u001a\u00020/2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¢\u0006\u0004\b3\u00101J\u001f\u00104\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016¢\u0006\u0004\b5\u0010\u001eJ\u001f\u00106\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u00107\u001a\u00020\u0015H\u0016¢\u0006\u0004\b8\u00109J\u001f\u0010:\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020!H\u0016¢\u0006\u0004\b;\u0010\u001eJ$\u0010<\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u00152\b\u0010=\u001a\u0004\u0018\u00010\u00152\b\u0010\u000e\u001a\u0004\u0018\u00010\u0015H\u0016J.\u0010>\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u00152\b\u0010=\u001a\u0004\u0018\u00010\u00152\b\u0010\u000e\u001a\u0004\u0018\u00010\u00152\b\u0010?\u001a\u0004\u0018\u00010\u0015H\u0016J\u0010\u0010@\u001a\u00020\r2\u0006\u0010A\u001a\u00020\u0015H\u0016J\u0018\u0010B\u001a\u00020\r2\u0006\u0010A\u001a\u00020\u00152\u0006\u0010C\u001a\u00020\u0015H\u0016J\u0010\u0010D\u001a\u00020\r2\u0006\u0010E\u001a\u00020FH\u0016J!\u0010G\u001a\u00020\r2\u0006\u0010H\u001a\u00020\u00152\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\bI\u00109J\u0010\u0010J\u001a\u00020\r2\u0006\u0010H\u001a\u00020\u0015H\u0016J\u0012\u0010K\u001a\u00020\r2\b\u0010L\u001a\u0004\u0018\u00010\u0015H\u0016J\u0081\u0001\u0010M\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010N\u001a\u00020,2\u0006\u0010O\u001a\u00020\u00152\u0006\u0010P\u001a\u00020,2\u0006\u0010Q\u001a\u00020,2\u0006\u0010R\u001a\u00020,2\u0006\u0010S\u001a\u00020,2\u0006\u0010T\u001a\u00020U2\b\u0010V\u001a\u0004\u0018\u00010W2\b\u0010X\u001a\u0004\u0018\u00010,2\b\u00107\u001a\u0004\u0018\u00010\u00152\b\u0010Y\u001a\u0004\u0018\u00010,2\b\u0010Z\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b[\u0010\\J3\u0010]\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010^\u001a\u00020,2\b\u0010_\u001a\u0004\u0018\u00010`2\b\u0010a\u001a\u0004\u0018\u00010`H\u0016¢\u0006\u0004\bb\u0010cJ\u001f\u0010d\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010^\u001a\u00020,H\u0016¢\u0006\u0004\be\u0010fJ\u0017\u0010g\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¢\u0006\u0004\bh\u0010iJ\u0017\u0010j\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¢\u0006\u0004\bk\u0010iJ\b\u0010l\u001a\u00020\rH\u0016J\b\u0010m\u001a\u00020\rH\u0016JB\u0010n\u001a\u00020\r2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00152\u0006\u0010 \u001a\u00020\u00152\b\u0010o\u001a\u0004\u0018\u00010\u00152\b\u0010p\u001a\u0004\u0018\u00010\u00152\b\u0010q\u001a\u0004\u0018\u00010\u00152\b\u0010=\u001a\u0004\u0018\u00010\u0015H\u0016J\u0010\u0010r\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020sH\u0016J\u0010\u0010t\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020sH\u0016J\u0010\u0010u\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020vH\u0016J\u001f\u0010w\u001a\u00020\r2\u0006\u0010 \u001a\u00020!2\u0006\u0010x\u001a\u00020\u000fH\u0016¢\u0006\u0004\by\u0010zJ5\u0010{\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010|\u001a\u0004\u0018\u00010`2\b\u0010}\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b~\u0010\u007fJ+\u0010\u0080\u0001\u001a\u00020\r2\u0006\u0010 \u001a\u00020!2\u0006\u0010\u000e\u001a\u00020\u000f2\u0007\u0010\u0081\u0001\u001a\u00020\u0015H\u0016¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J+\u0010\u0084\u0001\u001a\u00020\r2\u0006\u0010 \u001a\u00020!2\u0006\u0010\u000e\u001a\u00020\u000f2\u0007\u0010\u0081\u0001\u001a\u00020\u0015H\u0016¢\u0006\u0006\b\u0085\u0001\u0010\u0083\u0001J\u001a\u0010\u0086\u0001\u001a\u00020\r2\u0006\u0010o\u001a\u00020\u00152\u0007\u0010\u0087\u0001\u001a\u00020\u0015H\u0016J\u0011\u0010\u0088\u0001\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u0015H\u0016J\u001b\u0010\u0089\u0001\u001a\u00020\r2\u0007\u0010\u008a\u0001\u001a\u00020\u00152\u0007\u0010\u008b\u0001\u001a\u00020\u0015H\u0016J\t\u0010\u008c\u0001\u001a\u00020\rH\u0016J\t\u0010\u008d\u0001\u001a\u00020\rH\u0016J)\u0010\u008e\u0001\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u0010=\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u00152\u0006\u0010q\u001a\u00020\u0015H\u0016J!\u0010\u008f\u0001\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u00107\u001a\u00020\u0015H\u0016¢\u0006\u0005\b\u0090\u0001\u00109J\u0012\u0010\u0091\u0001\u001a\u00020\r2\u0007\u0010\u008b\u0001\u001a\u00020\u0015H\u0016J\u0012\u0010\u0092\u0001\u001a\u00020\r2\u0007\u0010\u0010\u001a\u00030\u0093\u0001H\u0016J\u0019\u0010\u0094\u0001\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¢\u0006\u0005\b\u0095\u0001\u0010iJ\u0019\u0010\u0096\u0001\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¢\u0006\u0005\b\u0097\u0001\u0010iJ\u0012\u0010\u0098\u0001\u001a\u00020\r2\u0007\u0010\u0099\u0001\u001a\u00020\u0015H\u0016J\u001b\u0010\u009a\u0001\u001a\u00020\r2\u0007\u0010\u009b\u0001\u001a\u00020\u00152\u0007\u0010\u009c\u0001\u001a\u00020\u0015H\u0016J!\u0010\u009d\u0001\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016¢\u0006\u0005\b\u009e\u0001\u0010\u001eJ!\u0010\u009f\u0001\u001a\u00020\r2\u0006\u0010.\u001a\u00020/2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¢\u0006\u0005\b \u0001\u00101J\u0019\u0010¡\u0001\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¢\u0006\u0005\b¢\u0001\u0010iJ\u0013\u0010£\u0001\u001a\u00020\r2\b\u0010¤\u0001\u001a\u00030¥\u0001H\u0016J!\u0010¦\u0001\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020!H\u0016¢\u0006\u0005\b§\u0001\u0010\u001eJ#\u0010¨\u0001\u001a\u00020\r2\u0006\u0010 \u001a\u00020!2\u0007\u0010=\u001a\u00030©\u0001H\u0016¢\u0006\u0006\bª\u0001\u0010«\u0001J!\u0010¬\u0001\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020!H\u0016¢\u0006\u0005\b\u00ad\u0001\u0010\u001eJ!\u0010®\u0001\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020!H\u0016¢\u0006\u0005\b¯\u0001\u0010\u001eJ!\u0010°\u0001\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020!H\u0016¢\u0006\u0005\b±\u0001\u0010\u001eJ\t\u0010²\u0001\u001a\u00020\rH\u0016J-\u0010³\u0001\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020!2\t\u0010´\u0001\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0006\bµ\u0001\u0010¶\u0001J\u0019\u0010·\u0001\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¢\u0006\u0005\b¸\u0001\u0010iJ\u0012\u0010¹\u0001\u001a\u00020\r2\u0007\u0010º\u0001\u001a\u00020\u0015H\u0016J7\u0010»\u0001\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020!2\t\u0010¼\u0001\u001a\u0004\u0018\u00010`2\b\u0010}\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0006\b½\u0001\u0010¾\u0001J!\u0010¿\u0001\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020!H\u0016¢\u0006\u0005\bÀ\u0001\u0010\u001eJ!\u0010Á\u0001\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020!H\u0016¢\u0006\u0005\bÂ\u0001\u0010\u001eJI\u0010Ã\u0001\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010Ä\u0001\u001a\u00030Å\u00012\b\u0010Æ\u0001\u001a\u00030Å\u00012\u0007\u0010Ç\u0001\u001a\u00020\u001c2\u0007\u0010È\u0001\u001a\u00020`2\u0007\u0010É\u0001\u001a\u00020\u0015H\u0016¢\u0006\u0006\bÊ\u0001\u0010Ë\u0001JS\u0010Ì\u0001\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010Ä\u0001\u001a\u00030Å\u00012\b\u0010Í\u0001\u001a\u00030Å\u00012\u0007\u0010Ç\u0001\u001a\u00020\u001c2\b\u0010Î\u0001\u001a\u00030Å\u00012\u0007\u0010È\u0001\u001a\u00020`2\u0007\u0010É\u0001\u001a\u00020\u0015H\u0016¢\u0006\u0006\bÏ\u0001\u0010Ð\u0001J$\u0010Ñ\u0001\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\t\u0010Ò\u0001\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0005\bÓ\u0001\u00109J,\u0010Ô\u0001\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00152\u0007\u0010Õ\u0001\u001a\u00020\u00152\u0007\u0010Ö\u0001\u001a\u00020\u00152\u0007\u0010×\u0001\u001a\u00020\u0015H\u0016J5\u0010Ø\u0001\u001a\u00020\r2\u0007\u0010=\u001a\u00030©\u00012\u0007\u0010Ù\u0001\u001a\u00020!2\u0007\u0010Ú\u0001\u001a\u00020!2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¢\u0006\u0006\bÛ\u0001\u0010Ü\u0001J\u0019\u0010Ý\u0001\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¢\u0006\u0005\bÞ\u0001\u0010iJ+\u0010ß\u0001\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020!2\u0007\u0010à\u0001\u001a\u00020\u0015H\u0016¢\u0006\u0006\bá\u0001\u0010¶\u0001J7\u0010â\u0001\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020!2\t\u0010É\u0001\u001a\u0004\u0018\u00010\u00152\b\u0010Z\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0006\bã\u0001\u0010ä\u0001J@\u0010å\u0001\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020!2\u0007\u0010æ\u0001\u001a\u00020`2\t\u0010É\u0001\u001a\u0004\u0018\u00010\u00152\b\u0010Z\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0006\bç\u0001\u0010è\u0001J\u0012\u0010é\u0001\u001a\u00020\r2\u0007\u0010ê\u0001\u001a\u00020\u0015H\u0016J\u001b\u0010ë\u0001\u001a\u00020\r2\u0007\u0010ì\u0001\u001a\u00020\u00152\u0007\u0010í\u0001\u001a\u00020\u0015H\u0016J+\u0010î\u0001\u001a\u00020\r2\u0006\u0010 \u001a\u00020!2\u0006\u0010\u000e\u001a\u00020\u000f2\u0007\u0010ï\u0001\u001a\u00020\u0015H\u0016¢\u0006\u0006\bð\u0001\u0010\u0083\u0001J+\u0010ñ\u0001\u001a\u00020\r2\u0006\u0010 \u001a\u00020!2\u0006\u0010\u000e\u001a\u00020\u000f2\u0007\u0010ò\u0001\u001a\u00020\u0015H\u0016¢\u0006\u0006\bó\u0001\u0010\u0083\u0001J!\u0010ô\u0001\u001a\u00020\r2\u0006\u0010 \u001a\u00020!2\u0006\u0010\u000e\u001a\u00020\u000fH\u0017¢\u0006\u0005\bõ\u0001\u0010zJ*\u0010ö\u0001\u001a\u00020\r2\u0006\u0010 \u001a\u00020!2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010O\u001a\u00020\u0015H\u0016¢\u0006\u0006\b÷\u0001\u0010\u0083\u0001JS\u0010ø\u0001\u001a\u00020\r2\u0006\u0010 \u001a\u00020!2\u0006\u0010\u000e\u001a\u00020\u000f2\u0007\u0010É\u0001\u001a\u00020\u00152\u0006\u0010P\u001a\u00020,2\u0006\u0010Q\u001a\u00020,2\u0006\u0010R\u001a\u00020,2\u0006\u0010S\u001a\u00020,2\u0006\u0010T\u001a\u00020UH\u0016¢\u0006\u0006\bù\u0001\u0010ú\u0001J7\u0010û\u0001\u001a\u00020\r2\u0007\u0010ü\u0001\u001a\u00020,2\t\u0010ý\u0001\u001a\u0004\u0018\u00010W2\u0007\u0010þ\u0001\u001a\u00020,2\t\u0010ÿ\u0001\u001a\u0004\u0018\u00010WH\u0016¢\u0006\u0003\u0010\u0080\u0002J\t\u0010\u0081\u0002\u001a\u00020\rH\u0016J\u0013\u0010\u0082\u0002\u001a\u00020\r2\b\u0010\u0083\u0002\u001a\u00030\u0084\u0002H\u0016J+\u0010\u0085\u0002\u001a\u00020\r2\u0007\u0010\u0086\u0002\u001a\u00020,2\u0006\u0010 \u001a\u00020!2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¢\u0006\u0006\b\u0087\u0002\u0010\u0088\u0002JJ\u0010\u0089\u0002\u001a\u00020\r2\u0006\u0010 \u001a\u00020!2\u0006\u0010\u000e\u001a\u00020\u000f2\u0007\u0010\u008a\u0002\u001a\u00020\u00152\b\u0010X\u001a\u0004\u0018\u00010,2\t\u0010¼\u0001\u001a\u0004\u0018\u00010`2\b\u0010}\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0006\b\u008b\u0002\u0010\u008c\u0002J\u001b\u0010\u008d\u0002\u001a\u00020\r2\u0007\u0010=\u001a\u00030©\u0001H\u0016¢\u0006\u0006\b\u008e\u0002\u0010\u008f\u0002J5\u0010\u0090\u0002\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0007\u0010\u0091\u0002\u001a\u00020\u001c2\u0007\u0010\u0092\u0002\u001a\u00020\u00152\u0007\u0010\u0093\u0002\u001a\u00020\u0015H\u0016¢\u0006\u0006\b\u0094\u0002\u0010ä\u0001J\"\u0010\u0095\u0002\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0007\u0010\u0091\u0002\u001a\u00020\u001cH\u0016¢\u0006\u0005\b\u0096\u0002\u0010\u001eJ\u0012\u0010\u0097\u0002\u001a\u00020\r2\u0007\u0010\u0010\u001a\u00030\u0098\u0002H\u0016J\u0019\u0010\u0099\u0002\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¢\u0006\u0005\b\u009a\u0002\u0010iJ\u0019\u0010\u009b\u0002\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¢\u0006\u0005\b\u009c\u0002\u0010iJ,\u0010\u009d\u0002\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0007\u0010\u009e\u0002\u001a\u00020\u001c2\u0007\u0010\u009f\u0002\u001a\u00020,H\u0016¢\u0006\u0006\b \u0002\u0010¡\u0002J,\u0010¢\u0002\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0007\u0010\u009e\u0002\u001a\u00020\u001c2\u0007\u0010\u009f\u0002\u001a\u00020,H\u0016¢\u0006\u0006\b£\u0002\u0010¡\u0002J,\u0010¤\u0002\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0007\u0010\u009e\u0002\u001a\u00020\u001c2\u0007\u0010\u009f\u0002\u001a\u00020,H\u0016¢\u0006\u0006\b¥\u0002\u0010¡\u0002R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0016\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007¨\u0006¦\u0002"}, d2 = {"Lcom/discord/chat/presentation/events/ChatEventHandler$Empty;", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "<init>", "()V", "onMessageLongPressed", "", "getOnMessageLongPressed", "()Ljava/lang/Void;", "onMessageTapped", "getOnMessageTapped", "onMessageDoubleTapped", "getOnMessageDoubleTapped", "onLinkClicked", "", "messageId", "Lcom/discord/primitives/MessageId;", "node", "Lcom/discord/chat/bridge/contentnode/LinkContentNode;", "onLinkClicked-ntcYbpo", "(Ljava/lang/String;Lcom/discord/chat/bridge/contentnode/LinkContentNode;)V", "url", "", AlertFragment.ARG_TITLE, "onLinkClicked-u7_MRrM", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "onLinkLongClicked", "onLongPressAvatar", "userId", "Lcom/discord/primitives/UserId;", "onLongPressAvatar-x5gers8", "(Ljava/lang/String;J)V", "onLongPressReaction", "channelId", "Lcom/discord/primitives/ChannelId;", "reaction", "Lcom/discord/reactions/ReactionView$Reaction;", "onLongPressReaction-Eqy5D80", "(Ljava/lang/String;JLcom/discord/reactions/ReactionView$Reaction;)V", "onLongPressUsername", "onLongPressUsername-x5gers8", "onScrollStateChanged", "scrollState", "Lcom/discord/chat/presentation/list/ScrollState;", "changesetUpdateId", "", "onStickerClicked", "sticker", "Lcom/discord/chat/bridge/sticker/Sticker;", "onStickerClicked-Ayv7vGE", "(Lcom/discord/chat/bridge/sticker/Sticker;Ljava/lang/String;)V", "onStickerLongClicked", "onStickerLongClicked-Ayv7vGE", "onTapAvatar", "onTapAvatar-x5gers8", "onTapButtonActionComponent", "componentId", "onTapButtonActionComponent-ntcYbpo", "(Ljava/lang/String;Ljava/lang/String;)V", "onTapCall", "onTapCall-pfaIj0E", "onTapChannel", "guildId", "onLongPressChannel", "originalLink", "onTapAttachmentLink", "attachmentUrl", "onLongPressAttachmentLink", "attachmentName", "onTapCopyText", "text", "", "onTapGiftCodeAccept", "giftCode", "onTapGiftCodeAccept-NU4t8f8", "onTapGiftCodeEmbed", "onTapReferralRedeem", "referralId", "onTapImage", "attachmentIndex", "type", "viewWidth", "viewHeight", "viewX", "viewY", "viewResizeMode", "Lcom/discord/chat/reactevents/ViewResizeMode;", "portal", "", "embedIndex", "componentMediaIndex", "embedId", "onTapImage-JJXpD5M", "(Ljava/lang/String;ILjava/lang/String;IIIILcom/discord/chat/reactevents/ViewResizeMode;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "onTapInviteEmbed", "index", "primary", "", "secondary", "onTapInviteEmbed-AFFcxXc", "(Ljava/lang/String;ILjava/lang/Boolean;Ljava/lang/Boolean;)V", "onTapInviteEmbedAccept", "onTapInviteEmbedAccept-ntcYbpo", "(Ljava/lang/String;I)V", "onTapJoinActivity", "onTapJoinActivity-1xi1bu0", "(Ljava/lang/String;)V", "onTapJoinRichPresence", "onTapJoinRichPresence-1xi1bu0", "onTapLoadMessagesAfter", "onTapLoadMessagesBefore", "onTapMention", "roleName", "parsedUserId", "roleId", "onTapCommand", "Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;", "onLongPressCommand", "onTapGameMention", "Lcom/discord/chat/bridge/contentnode/GameMentionContentNode;", "onTapMessageReply", "originId", "onTapMessageReply-0eiqbug", "(JLjava/lang/String;)V", "onTapReaction", "isBurst", "location", "onTapReaction-AFFcxXc", "(Ljava/lang/String;Lcom/discord/reactions/ReactionView$Reaction;Ljava/lang/Boolean;Ljava/lang/String;)V", "onTapSummary", "summaryId", "onTapSummary-sekaTiM", "(JLjava/lang/String;Ljava/lang/String;)V", "onTapSummaryJump", "onTapSummaryJump-sekaTiM", "onTapRoleIcon", "roleIconSource", "onTapVoiceChannelBadge", "onTapGameIcon", "gameApplicationId", "timestamp", "onTapSuppressNotificationsIcon", "onTapTimeoutIcon", "onTapConnectionsRoleTag", "onTapSelectActionComponent", "onTapSelectActionComponent-ntcYbpo", "onTapTimestamp", "onTapInlineCode", "Lcom/discord/chat/bridge/contentnode/InlineCodeContentNode;", "onTapThreadEmbed", "onTapThreadEmbed-1xi1bu0", "onTapToggleBlockedMessages", "onTapToggleBlockedMessages-1xi1bu0", "onTapDismissBlockedMessages", "context", "onTapCancelUploadItem", "uploaderId", "itemId", "onTapUsername", "onTapUsername-x5gers8", "onWelcomeReplyClicked", "onWelcomeReplyClicked-Ayv7vGE", "onTapInviteToSpeak", "onTapInviteToSpeak-1xi1bu0", "onTapEmoji", "emoji", "Lcom/discord/chat/bridge/contentnode/EmojiContentNode;", "onTapFollowForumPost", "onTapFollowForumPost-pfaIj0E", "onTapShareForumPost", "Lcom/discord/primitives/GuildId;", "onTapShareForumPost-mgk6anA", "(JJ)V", "onTapReactionOverflow", "onTapReactionOverflow-pfaIj0E", "onTapAutoModerationActions", "onTapAutoModerationActions-pfaIj0E", "onTapAutoModerationFeedback", "onTapAutoModerationFeedback-pfaIj0E", "onTapOpTag", "onTapTag", "tagType", "onTapTag-Eqy5D80", "(Ljava/lang/String;JLjava/lang/String;)V", "onTapSeeMore", "onTapSeeMore-1xi1bu0", "onTapShowAltText", "description", "onInitiateReply", "triggerHaptic", "onInitiateReply-8a0ehIg", "(Ljava/lang/String;JLjava/lang/Boolean;Ljava/lang/String;)V", "onInitiateThread", "onInitiateThread-pfaIj0E", "onInitiateEdit", "onInitiateEdit-pfaIj0E", "mediaAttachmentPlaybackStarted", "totalDurationSecs", "", "startDurationSecs", "senderUserId", "isVoiceMessage", "attachmentId", "mediaAttachmentPlaybackStarted-jd4C3YQ", "(Ljava/lang/String;FFJZLjava/lang/String;)V", "mediaAttachmentPlaybackEnded", "endDurationSecs", "durationListeningSecs", "mediaAttachmentPlaybackEnded-O97gnAM", "(Ljava/lang/String;FFJFZLjava/lang/String;)V", "voiceMessagePlaybackFailed", "errorMessage", "voiceMessagePlaybackFailed-ntcYbpo", "onTapAppMessageEmbed", "actionId", "appId", "embedUrl", "onTapPostPreviewEmbed", "parentChannelId", "threadId", "onTapPostPreviewEmbed-kUTrp-s", "(JJJLjava/lang/String;)V", "onTapDismissMediaPostSharePrompt", "onTapDismissMediaPostSharePrompt-1xi1bu0", "onTapChannelPromptButton", "buttonType", "onTapChannelPromptButton-Eqy5D80", "onTapObscuredMediaLearnMore", "onTapObscuredMediaLearnMore-8a0ehIg", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V", "onTapObscuredMediaToggle", "isReveal", "onTapObscuredMediaToggle-ZQwuxwg", "(Ljava/lang/String;JZLjava/lang/String;Ljava/lang/String;)V", "onTapSafetyPolicyNoticeEmbed", "classificationId", "onTapSafetySystemNotificationCta", "ctaType", "ctaKey", "onTapPollAnswer", "answerId", "onTapPollAnswer-sekaTiM", "onTapCtaButton", "callback", "onTapCtaButton-sekaTiM", "onTapPollSubmitVote", "onTapPollSubmitVote-0eiqbug", "onTapPollAction", "onTapPollAction-sekaTiM", "onLongPressPollImage", "onLongPressPollImage-YVExdug", "(JLjava/lang/String;Ljava/lang/String;IIIILcom/discord/chat/reactevents/ViewResizeMode;)V", "onFirstLayout", "firstVisibleMessageIndex", "firstVisibleMessagePercentVisible", "lastVisibleMessageIndex", "lastVisibleMessagePercentVisible", "(ILjava/lang/Double;ILjava/lang/Double;)V", "onCompleteFirstLayout", "onMediaPlayFinishedAnalytics", "analytics", "Lcom/discord/media_player/reactevents/MediaPlayFinishedAnalytics;", "onTapForwardFooter", "snapshotIndex", "onTapForwardFooter-SHRpUJI", "(IJLjava/lang/String;)V", "onTapInlineForward", "targetKind", "onTapInlineForward-j8a4Y88", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;)V", "onTapClanTagChiplet", "onTapClanTagChiplet-g3bFfsM", "(J)V", "onTapContentInventoryEntryEmbed", "authorId", "contentId", "tappedElement", "onTapContentInventoryEntryEmbed-tsfjtEQ", "onTapCheckpointCard", "onTapCheckpointCard-x5gers8", "onTapSoundmoji", "Lcom/discord/chat/bridge/contentnode/SoundmojiContentNode;", "onTapPreviewSharedClientTheme", "onTapPreviewSharedClientTheme-1xi1bu0", "onSharedClientThemeViewed", "onSharedClientThemeViewed-1xi1bu0", "onGiftIntentCardViewed", "recipientUserId", "giftIntentType", "onGiftIntentCardViewed-gzHKzLY", "(Ljava/lang/String;JI)V", "onTapGiftIntentPrimaryCta", "onTapGiftIntentPrimaryCta-gzHKzLY", "onTapGiftIntentSecondaryCta", "onTapGiftIntentSecondaryCta-gzHKzLY", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Empty implements ChatEventHandler {

        @NotNull
        public static final Empty INSTANCE = new Empty();
        private static final Void onMessageDoubleTapped = null;
        private static final Void onMessageLongPressed = null;
        private static final Void onMessageTapped = null;

        private Empty() {
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        /* JADX INFO: renamed from: getOnMessageDoubleTapped, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ Function2 mo526getOnMessageDoubleTapped() {
            return (Function2) getOnMessageDoubleTapped();
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        /* JADX INFO: renamed from: getOnMessageLongPressed, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ Function6 mo527getOnMessageLongPressed() {
            return (Function6) getOnMessageLongPressed();
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        /* JADX INFO: renamed from: getOnMessageTapped, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ Function2 mo528getOnMessageTapped() {
            return (Function2) getOnMessageTapped();
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        /* JADX INFO: renamed from: mediaAttachmentPlaybackEnded-O97gnAM */
        public void mo462mediaAttachmentPlaybackEndedO97gnAM(@NotNull String messageId, float totalDurationSecs, float endDurationSecs, long senderUserId, float durationListeningSecs, boolean isVoiceMessage, @NotNull String attachmentId) {
            Intrinsics.checkNotNullParameter(messageId, "messageId");
            Intrinsics.checkNotNullParameter(attachmentId, "attachmentId");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        /* JADX INFO: renamed from: mediaAttachmentPlaybackStarted-jd4C3YQ */
        public void mo463mediaAttachmentPlaybackStartedjd4C3YQ(@NotNull String messageId, float totalDurationSecs, float startDurationSecs, long senderUserId, boolean isVoiceMessage, @NotNull String attachmentId) {
            Intrinsics.checkNotNullParameter(messageId, "messageId");
            Intrinsics.checkNotNullParameter(attachmentId, "attachmentId");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        public void onCompleteFirstLayout() {
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        public void onFirstLayout(int firstVisibleMessageIndex, Double firstVisibleMessagePercentVisible, int lastVisibleMessageIndex, Double lastVisibleMessagePercentVisible) {
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        /* JADX INFO: renamed from: onGiftIntentCardViewed-gzHKzLY */
        public void mo464onGiftIntentCardViewedgzHKzLY(@NotNull String messageId, long recipientUserId, int giftIntentType) {
            Intrinsics.checkNotNullParameter(messageId, "messageId");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        /* JADX INFO: renamed from: onInitiateEdit-pfaIj0E */
        public void mo465onInitiateEditpfaIj0E(@NotNull String messageId, long channelId) {
            Intrinsics.checkNotNullParameter(messageId, "messageId");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        /* JADX INFO: renamed from: onInitiateReply-8a0ehIg */
        public void mo466onInitiateReply8a0ehIg(@NotNull String messageId, long channelId, Boolean triggerHaptic, String location) {
            Intrinsics.checkNotNullParameter(messageId, "messageId");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        /* JADX INFO: renamed from: onInitiateThread-pfaIj0E */
        public void mo467onInitiateThreadpfaIj0E(@NotNull String messageId, long channelId) {
            Intrinsics.checkNotNullParameter(messageId, "messageId");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        /* JADX INFO: renamed from: onLinkClicked-ntcYbpo */
        public void mo468onLinkClickedntcYbpo(@NotNull String messageId, @NotNull LinkContentNode node) {
            Intrinsics.checkNotNullParameter(messageId, "messageId");
            Intrinsics.checkNotNullParameter(node, "node");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        /* JADX INFO: renamed from: onLinkClicked-u7_MRrM */
        public void mo469onLinkClickedu7_MRrM(@NotNull String messageId, @NotNull String url, String title) {
            Intrinsics.checkNotNullParameter(messageId, "messageId");
            Intrinsics.checkNotNullParameter(url, "url");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        public void onLinkLongClicked(@NotNull LinkContentNode node) {
            Intrinsics.checkNotNullParameter(node, "node");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        public void onLongPressAttachmentLink(@NotNull String attachmentUrl, @NotNull String attachmentName) {
            Intrinsics.checkNotNullParameter(attachmentUrl, "attachmentUrl");
            Intrinsics.checkNotNullParameter(attachmentName, "attachmentName");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        /* JADX INFO: renamed from: onLongPressAvatar-x5gers8 */
        public void mo470onLongPressAvatarx5gers8(@NotNull String messageId, long userId) {
            Intrinsics.checkNotNullParameter(messageId, "messageId");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        public void onLongPressChannel(@NotNull String channelId, String guildId, String messageId, String originalLink) {
            Intrinsics.checkNotNullParameter(channelId, "channelId");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        public void onLongPressCommand(@NotNull CommandMentionContentNode node) {
            Intrinsics.checkNotNullParameter(node, "node");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        /* JADX INFO: renamed from: onLongPressPollImage-YVExdug */
        public void mo471onLongPressPollImageYVExdug(long channelId, @NotNull String messageId, @NotNull String attachmentId, int viewWidth, int viewHeight, int viewX, int viewY, @NotNull ViewResizeMode viewResizeMode) {
            Intrinsics.checkNotNullParameter(messageId, "messageId");
            Intrinsics.checkNotNullParameter(attachmentId, "attachmentId");
            Intrinsics.checkNotNullParameter(viewResizeMode, "viewResizeMode");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        /* JADX INFO: renamed from: onLongPressReaction-Eqy5D80 */
        public void mo472onLongPressReactionEqy5D80(@NotNull String messageId, long channelId, ReactionView.Reaction reaction) {
            Intrinsics.checkNotNullParameter(messageId, "messageId");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        /* JADX INFO: renamed from: onLongPressUsername-x5gers8 */
        public void mo473onLongPressUsernamex5gers8(@NotNull String messageId, long userId) {
            Intrinsics.checkNotNullParameter(messageId, "messageId");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        public void onMediaPlayFinishedAnalytics(@NotNull MediaPlayFinishedAnalytics analytics) {
            Intrinsics.checkNotNullParameter(analytics, "analytics");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        public void onScrollStateChanged(@NotNull ScrollState scrollState, int changesetUpdateId) {
            Intrinsics.checkNotNullParameter(scrollState, "scrollState");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        /* JADX INFO: renamed from: onSharedClientThemeViewed-1xi1bu0 */
        public void mo474onSharedClientThemeViewed1xi1bu0(@NotNull String messageId) {
            Intrinsics.checkNotNullParameter(messageId, "messageId");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        /* JADX INFO: renamed from: onStickerClicked-Ayv7vGE */
        public void mo475onStickerClickedAyv7vGE(@NotNull Sticker sticker, @NotNull String messageId) {
            Intrinsics.checkNotNullParameter(sticker, "sticker");
            Intrinsics.checkNotNullParameter(messageId, "messageId");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        /* JADX INFO: renamed from: onStickerLongClicked-Ayv7vGE */
        public void mo476onStickerLongClickedAyv7vGE(@NotNull Sticker sticker, @NotNull String messageId) {
            Intrinsics.checkNotNullParameter(sticker, "sticker");
            Intrinsics.checkNotNullParameter(messageId, "messageId");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        public void onTapAppMessageEmbed(@NotNull String messageId, @NotNull String actionId, @NotNull String appId, @NotNull String embedUrl) {
            Intrinsics.checkNotNullParameter(messageId, "messageId");
            Intrinsics.checkNotNullParameter(actionId, "actionId");
            Intrinsics.checkNotNullParameter(appId, "appId");
            Intrinsics.checkNotNullParameter(embedUrl, "embedUrl");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        public void onTapAttachmentLink(@NotNull String attachmentUrl) {
            Intrinsics.checkNotNullParameter(attachmentUrl, "attachmentUrl");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        /* JADX INFO: renamed from: onTapAutoModerationActions-pfaIj0E */
        public void mo477onTapAutoModerationActionspfaIj0E(@NotNull String messageId, long channelId) {
            Intrinsics.checkNotNullParameter(messageId, "messageId");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        /* JADX INFO: renamed from: onTapAutoModerationFeedback-pfaIj0E */
        public void mo478onTapAutoModerationFeedbackpfaIj0E(@NotNull String messageId, long channelId) {
            Intrinsics.checkNotNullParameter(messageId, "messageId");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        /* JADX INFO: renamed from: onTapAvatar-x5gers8 */
        public void mo479onTapAvatarx5gers8(@NotNull String messageId, long userId) {
            Intrinsics.checkNotNullParameter(messageId, "messageId");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        /* JADX INFO: renamed from: onTapButtonActionComponent-ntcYbpo */
        public void mo480onTapButtonActionComponentntcYbpo(@NotNull String messageId, @NotNull String componentId) {
            Intrinsics.checkNotNullParameter(messageId, "messageId");
            Intrinsics.checkNotNullParameter(componentId, "componentId");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        /* JADX INFO: renamed from: onTapCall-pfaIj0E */
        public void mo481onTapCallpfaIj0E(@NotNull String messageId, long channelId) {
            Intrinsics.checkNotNullParameter(messageId, "messageId");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        public void onTapCancelUploadItem(@NotNull String uploaderId, @NotNull String itemId) {
            Intrinsics.checkNotNullParameter(uploaderId, "uploaderId");
            Intrinsics.checkNotNullParameter(itemId, "itemId");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        public void onTapChannel(@NotNull String channelId, String guildId, String messageId) {
            Intrinsics.checkNotNullParameter(channelId, "channelId");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        /* JADX INFO: renamed from: onTapChannelPromptButton-Eqy5D80 */
        public void mo482onTapChannelPromptButtonEqy5D80(@NotNull String messageId, long channelId, @NotNull String buttonType) {
            Intrinsics.checkNotNullParameter(messageId, "messageId");
            Intrinsics.checkNotNullParameter(buttonType, "buttonType");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        /* JADX INFO: renamed from: onTapCheckpointCard-x5gers8 */
        public void mo483onTapCheckpointCardx5gers8(@NotNull String messageId, long authorId) {
            Intrinsics.checkNotNullParameter(messageId, "messageId");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        /* JADX INFO: renamed from: onTapClanTagChiplet-g3bFfsM */
        public void mo484onTapClanTagChipletg3bFfsM(long guildId) {
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        public void onTapCommand(@NotNull CommandMentionContentNode node) {
            Intrinsics.checkNotNullParameter(node, "node");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        public void onTapConnectionsRoleTag(@NotNull String userId, @NotNull String guildId, @NotNull String channelId, @NotNull String roleId) {
            Intrinsics.checkNotNullParameter(userId, "userId");
            Intrinsics.checkNotNullParameter(guildId, "guildId");
            Intrinsics.checkNotNullParameter(channelId, "channelId");
            Intrinsics.checkNotNullParameter(roleId, "roleId");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        /* JADX INFO: renamed from: onTapContentInventoryEntryEmbed-tsfjtEQ */
        public void mo485onTapContentInventoryEntryEmbedtsfjtEQ(@NotNull String messageId, long authorId, @NotNull String contentId, @NotNull String tappedElement) {
            Intrinsics.checkNotNullParameter(messageId, "messageId");
            Intrinsics.checkNotNullParameter(contentId, "contentId");
            Intrinsics.checkNotNullParameter(tappedElement, "tappedElement");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        public void onTapCopyText(@NotNull CharSequence text) {
            Intrinsics.checkNotNullParameter(text, "text");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        /* JADX INFO: renamed from: onTapCtaButton-sekaTiM */
        public void mo486onTapCtaButtonsekaTiM(long channelId, @NotNull String messageId, @NotNull String callback) {
            Intrinsics.checkNotNullParameter(messageId, "messageId");
            Intrinsics.checkNotNullParameter(callback, "callback");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        public void onTapDismissBlockedMessages(@NotNull String context) {
            Intrinsics.checkNotNullParameter(context, "context");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        /* JADX INFO: renamed from: onTapDismissMediaPostSharePrompt-1xi1bu0 */
        public void mo487onTapDismissMediaPostSharePrompt1xi1bu0(@NotNull String messageId) {
            Intrinsics.checkNotNullParameter(messageId, "messageId");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        public void onTapEmoji(@NotNull EmojiContentNode emoji) {
            Intrinsics.checkNotNullParameter(emoji, "emoji");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        /* JADX INFO: renamed from: onTapFollowForumPost-pfaIj0E */
        public void mo488onTapFollowForumPostpfaIj0E(@NotNull String messageId, long channelId) {
            Intrinsics.checkNotNullParameter(messageId, "messageId");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        /* JADX INFO: renamed from: onTapForwardFooter-SHRpUJI */
        public void mo489onTapForwardFooterSHRpUJI(int snapshotIndex, long channelId, @NotNull String messageId) {
            Intrinsics.checkNotNullParameter(messageId, "messageId");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        public void onTapGameIcon(@NotNull String gameApplicationId, @NotNull String timestamp) {
            Intrinsics.checkNotNullParameter(gameApplicationId, "gameApplicationId");
            Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        public void onTapGameMention(@NotNull GameMentionContentNode node) {
            Intrinsics.checkNotNullParameter(node, "node");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        /* JADX INFO: renamed from: onTapGiftCodeAccept-NU4t8f8 */
        public void mo490onTapGiftCodeAcceptNU4t8f8(@NotNull String giftCode, String messageId) {
            Intrinsics.checkNotNullParameter(giftCode, "giftCode");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        public void onTapGiftCodeEmbed(@NotNull String giftCode) {
            Intrinsics.checkNotNullParameter(giftCode, "giftCode");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        /* JADX INFO: renamed from: onTapGiftIntentPrimaryCta-gzHKzLY */
        public void mo491onTapGiftIntentPrimaryCtagzHKzLY(@NotNull String messageId, long recipientUserId, int giftIntentType) {
            Intrinsics.checkNotNullParameter(messageId, "messageId");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        /* JADX INFO: renamed from: onTapGiftIntentSecondaryCta-gzHKzLY */
        public void mo492onTapGiftIntentSecondaryCtagzHKzLY(@NotNull String messageId, long recipientUserId, int giftIntentType) {
            Intrinsics.checkNotNullParameter(messageId, "messageId");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        /* JADX INFO: renamed from: onTapImage-JJXpD5M */
        public void mo493onTapImageJJXpD5M(@NotNull String messageId, int attachmentIndex, @NotNull String type, int viewWidth, int viewHeight, int viewX, int viewY, @NotNull ViewResizeMode viewResizeMode, Double portal, Integer embedIndex, String componentId, Integer componentMediaIndex, String embedId) {
            Intrinsics.checkNotNullParameter(messageId, "messageId");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(viewResizeMode, "viewResizeMode");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        public void onTapInlineCode(@NotNull InlineCodeContentNode node) {
            Intrinsics.checkNotNullParameter(node, "node");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        /* JADX INFO: renamed from: onTapInlineForward-j8a4Y88 */
        public void mo494onTapInlineForwardj8a4Y88(long channelId, @NotNull String messageId, @NotNull String targetKind, Integer embedIndex, Boolean triggerHaptic, String location) {
            Intrinsics.checkNotNullParameter(messageId, "messageId");
            Intrinsics.checkNotNullParameter(targetKind, "targetKind");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        /* JADX INFO: renamed from: onTapInviteEmbed-AFFcxXc */
        public void mo495onTapInviteEmbedAFFcxXc(@NotNull String messageId, int index, Boolean primary, Boolean secondary) {
            Intrinsics.checkNotNullParameter(messageId, "messageId");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        /* JADX INFO: renamed from: onTapInviteEmbedAccept-ntcYbpo */
        public void mo496onTapInviteEmbedAcceptntcYbpo(@NotNull String messageId, int index) {
            Intrinsics.checkNotNullParameter(messageId, "messageId");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        /* JADX INFO: renamed from: onTapInviteToSpeak-1xi1bu0 */
        public void mo497onTapInviteToSpeak1xi1bu0(@NotNull String messageId) {
            Intrinsics.checkNotNullParameter(messageId, "messageId");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        /* JADX INFO: renamed from: onTapJoinActivity-1xi1bu0 */
        public void mo498onTapJoinActivity1xi1bu0(@NotNull String messageId) {
            Intrinsics.checkNotNullParameter(messageId, "messageId");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        /* JADX INFO: renamed from: onTapJoinRichPresence-1xi1bu0 */
        public void mo499onTapJoinRichPresence1xi1bu0(@NotNull String messageId) {
            Intrinsics.checkNotNullParameter(messageId, "messageId");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        public void onTapLoadMessagesAfter() {
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        public void onTapLoadMessagesBefore() {
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        public void onTapMention(String userId, @NotNull String channelId, String roleName, String parsedUserId, String roleId, String guildId) {
            Intrinsics.checkNotNullParameter(channelId, "channelId");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        /* JADX INFO: renamed from: onTapMessageReply-0eiqbug */
        public void mo500onTapMessageReply0eiqbug(long channelId, @NotNull String originId) {
            Intrinsics.checkNotNullParameter(originId, "originId");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        /* JADX INFO: renamed from: onTapObscuredMediaLearnMore-8a0ehIg */
        public void mo501onTapObscuredMediaLearnMore8a0ehIg(@NotNull String messageId, long channelId, String attachmentId, String embedId) {
            Intrinsics.checkNotNullParameter(messageId, "messageId");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        /* JADX INFO: renamed from: onTapObscuredMediaToggle-ZQwuxwg */
        public void mo502onTapObscuredMediaToggleZQwuxwg(@NotNull String messageId, long channelId, boolean isReveal, String attachmentId, String embedId) {
            Intrinsics.checkNotNullParameter(messageId, "messageId");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        public void onTapOpTag() {
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        /* JADX INFO: renamed from: onTapPollAction-sekaTiM */
        public void mo503onTapPollActionsekaTiM(long channelId, @NotNull String messageId, @NotNull String type) {
            Intrinsics.checkNotNullParameter(messageId, "messageId");
            Intrinsics.checkNotNullParameter(type, "type");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        /* JADX INFO: renamed from: onTapPollAnswer-sekaTiM */
        public void mo504onTapPollAnswersekaTiM(long channelId, @NotNull String messageId, @NotNull String answerId) {
            Intrinsics.checkNotNullParameter(messageId, "messageId");
            Intrinsics.checkNotNullParameter(answerId, "answerId");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        @d
        /* JADX INFO: renamed from: onTapPollSubmitVote-0eiqbug */
        public void mo505onTapPollSubmitVote0eiqbug(long channelId, @NotNull String messageId) {
            Intrinsics.checkNotNullParameter(messageId, "messageId");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        /* JADX INFO: renamed from: onTapPostPreviewEmbed-kUTrp-s */
        public void mo506onTapPostPreviewEmbedkUTrps(long guildId, long parentChannelId, long threadId, @NotNull String messageId) {
            Intrinsics.checkNotNullParameter(messageId, "messageId");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        /* JADX INFO: renamed from: onTapPreviewSharedClientTheme-1xi1bu0 */
        public void mo507onTapPreviewSharedClientTheme1xi1bu0(@NotNull String messageId) {
            Intrinsics.checkNotNullParameter(messageId, "messageId");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        /* JADX INFO: renamed from: onTapReaction-AFFcxXc */
        public void mo508onTapReactionAFFcxXc(@NotNull String messageId, ReactionView.Reaction reaction, Boolean isBurst, String location) {
            Intrinsics.checkNotNullParameter(messageId, "messageId");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        /* JADX INFO: renamed from: onTapReactionOverflow-pfaIj0E */
        public void mo509onTapReactionOverflowpfaIj0E(@NotNull String messageId, long channelId) {
            Intrinsics.checkNotNullParameter(messageId, "messageId");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        public void onTapReferralRedeem(String referralId) {
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        public void onTapRoleIcon(@NotNull String roleName, @NotNull String roleIconSource) {
            Intrinsics.checkNotNullParameter(roleName, "roleName");
            Intrinsics.checkNotNullParameter(roleIconSource, "roleIconSource");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        public void onTapSafetyPolicyNoticeEmbed(@NotNull String classificationId) {
            Intrinsics.checkNotNullParameter(classificationId, "classificationId");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        public void onTapSafetySystemNotificationCta(@NotNull String ctaType, @NotNull String ctaKey) {
            Intrinsics.checkNotNullParameter(ctaType, "ctaType");
            Intrinsics.checkNotNullParameter(ctaKey, "ctaKey");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        /* JADX INFO: renamed from: onTapSeeMore-1xi1bu0 */
        public void mo510onTapSeeMore1xi1bu0(@NotNull String messageId) {
            Intrinsics.checkNotNullParameter(messageId, "messageId");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        /* JADX INFO: renamed from: onTapSelectActionComponent-ntcYbpo */
        public void mo511onTapSelectActionComponentntcYbpo(@NotNull String messageId, @NotNull String componentId) {
            Intrinsics.checkNotNullParameter(messageId, "messageId");
            Intrinsics.checkNotNullParameter(componentId, "componentId");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        /* JADX INFO: renamed from: onTapShareForumPost-mgk6anA */
        public void mo512onTapShareForumPostmgk6anA(long channelId, long guildId) {
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        public void onTapShowAltText(@NotNull String description) {
            Intrinsics.checkNotNullParameter(description, "description");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        public void onTapSoundmoji(@NotNull SoundmojiContentNode node) {
            Intrinsics.checkNotNullParameter(node, "node");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        /* JADX INFO: renamed from: onTapSummary-sekaTiM */
        public void mo513onTapSummarysekaTiM(long channelId, @NotNull String messageId, @NotNull String summaryId) {
            Intrinsics.checkNotNullParameter(messageId, "messageId");
            Intrinsics.checkNotNullParameter(summaryId, "summaryId");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        /* JADX INFO: renamed from: onTapSummaryJump-sekaTiM */
        public void mo514onTapSummaryJumpsekaTiM(long channelId, @NotNull String messageId, @NotNull String summaryId) {
            Intrinsics.checkNotNullParameter(messageId, "messageId");
            Intrinsics.checkNotNullParameter(summaryId, "summaryId");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        public void onTapSuppressNotificationsIcon() {
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        /* JADX INFO: renamed from: onTapTag-Eqy5D80 */
        public void mo515onTapTagEqy5D80(@NotNull String messageId, long channelId, String tagType) {
            Intrinsics.checkNotNullParameter(messageId, "messageId");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        /* JADX INFO: renamed from: onTapThreadEmbed-1xi1bu0 */
        public void mo516onTapThreadEmbed1xi1bu0(@NotNull String messageId) {
            Intrinsics.checkNotNullParameter(messageId, "messageId");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        public void onTapTimeoutIcon() {
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        public void onTapTimestamp(@NotNull String timestamp) {
            Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        /* JADX INFO: renamed from: onTapToggleBlockedMessages-1xi1bu0 */
        public void mo517onTapToggleBlockedMessages1xi1bu0(@NotNull String messageId) {
            Intrinsics.checkNotNullParameter(messageId, "messageId");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        /* JADX INFO: renamed from: onTapUsername-x5gers8 */
        public void mo518onTapUsernamex5gers8(@NotNull String messageId, long userId) {
            Intrinsics.checkNotNullParameter(messageId, "messageId");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        public void onTapVoiceChannelBadge(@NotNull String channelId) {
            Intrinsics.checkNotNullParameter(channelId, "channelId");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        /* JADX INFO: renamed from: onWelcomeReplyClicked-Ayv7vGE */
        public void mo519onWelcomeReplyClickedAyv7vGE(@NotNull Sticker sticker, @NotNull String messageId) {
            Intrinsics.checkNotNullParameter(sticker, "sticker");
            Intrinsics.checkNotNullParameter(messageId, "messageId");
        }

        @Override // com.discord.chat.presentation.events.ChatEventHandler
        /* JADX INFO: renamed from: voiceMessagePlaybackFailed-ntcYbpo */
        public void mo520voiceMessagePlaybackFailedntcYbpo(@NotNull String messageId, String errorMessage) {
            Intrinsics.checkNotNullParameter(messageId, "messageId");
        }

        public Void getOnMessageDoubleTapped() {
            return onMessageDoubleTapped;
        }

        public Void getOnMessageLongPressed() {
            return onMessageLongPressed;
        }

        public Void getOnMessageTapped() {
            return onMessageTapped;
        }
    }

    /* JADX INFO: renamed from: getOnMessageDoubleTapped */
    Function2<MessageId, ChannelId, Unit> mo526getOnMessageDoubleTapped();

    /* JADX INFO: renamed from: getOnMessageLongPressed */
    Function6 mo527getOnMessageLongPressed();

    /* JADX INFO: renamed from: getOnMessageTapped */
    Function2<MessageId, ChannelId, Unit> mo528getOnMessageTapped();

    /* JADX INFO: renamed from: mediaAttachmentPlaybackEnded-O97gnAM, reason: not valid java name */
    void mo462mediaAttachmentPlaybackEndedO97gnAM(@NotNull String messageId, float totalDurationSecs, float endDurationSecs, long senderUserId, float durationListeningSecs, boolean isVoiceMessage, @NotNull String attachmentId);

    /* JADX INFO: renamed from: mediaAttachmentPlaybackStarted-jd4C3YQ, reason: not valid java name */
    void mo463mediaAttachmentPlaybackStartedjd4C3YQ(@NotNull String messageId, float totalDurationSecs, float startDurationSecs, long senderUserId, boolean isVoiceMessage, @NotNull String attachmentId);

    void onCompleteFirstLayout();

    void onFirstLayout(int firstVisibleMessageIndex, Double firstVisibleMessagePercentVisible, int lastVisibleMessageIndex, Double lastVisibleMessagePercentVisible);

    /* JADX INFO: renamed from: onGiftIntentCardViewed-gzHKzLY, reason: not valid java name */
    void mo464onGiftIntentCardViewedgzHKzLY(@NotNull String messageId, long recipientUserId, int giftIntentType);

    /* JADX INFO: renamed from: onInitiateEdit-pfaIj0E, reason: not valid java name */
    void mo465onInitiateEditpfaIj0E(@NotNull String messageId, long channelId);

    /* JADX INFO: renamed from: onInitiateReply-8a0ehIg, reason: not valid java name */
    void mo466onInitiateReply8a0ehIg(@NotNull String messageId, long channelId, Boolean triggerHaptic, String location);

    /* JADX INFO: renamed from: onInitiateThread-pfaIj0E, reason: not valid java name */
    void mo467onInitiateThreadpfaIj0E(@NotNull String messageId, long channelId);

    /* JADX INFO: renamed from: onLinkClicked-ntcYbpo, reason: not valid java name */
    void mo468onLinkClickedntcYbpo(@NotNull String messageId, @NotNull LinkContentNode node);

    /* JADX INFO: renamed from: onLinkClicked-u7_MRrM, reason: not valid java name */
    void mo469onLinkClickedu7_MRrM(@NotNull String messageId, @NotNull String url, String title);

    void onLinkLongClicked(@NotNull LinkContentNode node);

    void onLongPressAttachmentLink(@NotNull String attachmentUrl, @NotNull String attachmentName);

    /* JADX INFO: renamed from: onLongPressAvatar-x5gers8, reason: not valid java name */
    void mo470onLongPressAvatarx5gers8(@NotNull String messageId, long userId);

    void onLongPressChannel(@NotNull String channelId, String guildId, String messageId, String originalLink);

    void onLongPressCommand(@NotNull CommandMentionContentNode node);

    /* JADX INFO: renamed from: onLongPressPollImage-YVExdug, reason: not valid java name */
    void mo471onLongPressPollImageYVExdug(long channelId, @NotNull String messageId, @NotNull String attachmentId, int viewWidth, int viewHeight, int viewX, int viewY, @NotNull ViewResizeMode viewResizeMode);

    /* JADX INFO: renamed from: onLongPressReaction-Eqy5D80, reason: not valid java name */
    void mo472onLongPressReactionEqy5D80(@NotNull String messageId, long channelId, ReactionView.Reaction reaction);

    /* JADX INFO: renamed from: onLongPressUsername-x5gers8, reason: not valid java name */
    void mo473onLongPressUsernamex5gers8(@NotNull String messageId, long userId);

    void onMediaPlayFinishedAnalytics(@NotNull MediaPlayFinishedAnalytics analytics);

    void onScrollStateChanged(@NotNull ScrollState scrollState, int changesetUpdateId);

    /* JADX INFO: renamed from: onSharedClientThemeViewed-1xi1bu0, reason: not valid java name */
    void mo474onSharedClientThemeViewed1xi1bu0(@NotNull String messageId);

    /* JADX INFO: renamed from: onStickerClicked-Ayv7vGE, reason: not valid java name */
    void mo475onStickerClickedAyv7vGE(@NotNull Sticker sticker, @NotNull String messageId);

    /* JADX INFO: renamed from: onStickerLongClicked-Ayv7vGE, reason: not valid java name */
    void mo476onStickerLongClickedAyv7vGE(@NotNull Sticker sticker, @NotNull String messageId);

    void onTapAppMessageEmbed(@NotNull String messageId, @NotNull String actionId, @NotNull String appId, @NotNull String embedUrl);

    void onTapAttachmentLink(@NotNull String attachmentUrl);

    /* JADX INFO: renamed from: onTapAutoModerationActions-pfaIj0E, reason: not valid java name */
    void mo477onTapAutoModerationActionspfaIj0E(@NotNull String messageId, long channelId);

    /* JADX INFO: renamed from: onTapAutoModerationFeedback-pfaIj0E, reason: not valid java name */
    void mo478onTapAutoModerationFeedbackpfaIj0E(@NotNull String messageId, long channelId);

    /* JADX INFO: renamed from: onTapAvatar-x5gers8, reason: not valid java name */
    void mo479onTapAvatarx5gers8(@NotNull String messageId, long userId);

    /* JADX INFO: renamed from: onTapButtonActionComponent-ntcYbpo, reason: not valid java name */
    void mo480onTapButtonActionComponentntcYbpo(@NotNull String messageId, @NotNull String componentId);

    /* JADX INFO: renamed from: onTapCall-pfaIj0E, reason: not valid java name */
    void mo481onTapCallpfaIj0E(@NotNull String messageId, long channelId);

    void onTapCancelUploadItem(@NotNull String uploaderId, @NotNull String itemId);

    void onTapChannel(@NotNull String channelId, String guildId, String messageId);

    /* JADX INFO: renamed from: onTapChannelPromptButton-Eqy5D80, reason: not valid java name */
    void mo482onTapChannelPromptButtonEqy5D80(@NotNull String messageId, long channelId, @NotNull String buttonType);

    /* JADX INFO: renamed from: onTapCheckpointCard-x5gers8, reason: not valid java name */
    void mo483onTapCheckpointCardx5gers8(@NotNull String messageId, long authorId);

    /* JADX INFO: renamed from: onTapClanTagChiplet-g3bFfsM, reason: not valid java name */
    void mo484onTapClanTagChipletg3bFfsM(long guildId);

    void onTapCommand(@NotNull CommandMentionContentNode node);

    void onTapConnectionsRoleTag(@NotNull String userId, @NotNull String guildId, @NotNull String channelId, @NotNull String roleId);

    /* JADX INFO: renamed from: onTapContentInventoryEntryEmbed-tsfjtEQ, reason: not valid java name */
    void mo485onTapContentInventoryEntryEmbedtsfjtEQ(@NotNull String messageId, long authorId, @NotNull String contentId, @NotNull String tappedElement);

    void onTapCopyText(@NotNull CharSequence text);

    /* JADX INFO: renamed from: onTapCtaButton-sekaTiM, reason: not valid java name */
    void mo486onTapCtaButtonsekaTiM(long channelId, @NotNull String messageId, @NotNull String callback);

    void onTapDismissBlockedMessages(@NotNull String context);

    /* JADX INFO: renamed from: onTapDismissMediaPostSharePrompt-1xi1bu0, reason: not valid java name */
    void mo487onTapDismissMediaPostSharePrompt1xi1bu0(@NotNull String messageId);

    void onTapEmoji(@NotNull EmojiContentNode emoji);

    /* JADX INFO: renamed from: onTapFollowForumPost-pfaIj0E, reason: not valid java name */
    void mo488onTapFollowForumPostpfaIj0E(@NotNull String messageId, long channelId);

    /* JADX INFO: renamed from: onTapForwardFooter-SHRpUJI, reason: not valid java name */
    void mo489onTapForwardFooterSHRpUJI(int snapshotIndex, long channelId, @NotNull String messageId);

    void onTapGameIcon(@NotNull String gameApplicationId, @NotNull String timestamp);

    void onTapGameMention(@NotNull GameMentionContentNode node);

    /* JADX INFO: renamed from: onTapGiftCodeAccept-NU4t8f8, reason: not valid java name */
    void mo490onTapGiftCodeAcceptNU4t8f8(@NotNull String giftCode, String messageId);

    void onTapGiftCodeEmbed(@NotNull String giftCode);

    /* JADX INFO: renamed from: onTapGiftIntentPrimaryCta-gzHKzLY, reason: not valid java name */
    void mo491onTapGiftIntentPrimaryCtagzHKzLY(@NotNull String messageId, long recipientUserId, int giftIntentType);

    /* JADX INFO: renamed from: onTapGiftIntentSecondaryCta-gzHKzLY, reason: not valid java name */
    void mo492onTapGiftIntentSecondaryCtagzHKzLY(@NotNull String messageId, long recipientUserId, int giftIntentType);

    /* JADX INFO: renamed from: onTapImage-JJXpD5M, reason: not valid java name */
    void mo493onTapImageJJXpD5M(@NotNull String messageId, int attachmentIndex, @NotNull String type, int viewWidth, int viewHeight, int viewX, int viewY, @NotNull ViewResizeMode viewResizeMode, Double portal, Integer embedIndex, String componentId, Integer componentMediaIndex, String embedId);

    void onTapInlineCode(@NotNull InlineCodeContentNode node);

    /* JADX INFO: renamed from: onTapInlineForward-j8a4Y88, reason: not valid java name */
    void mo494onTapInlineForwardj8a4Y88(long channelId, @NotNull String messageId, @NotNull String targetKind, Integer embedIndex, Boolean triggerHaptic, String location);

    /* JADX INFO: renamed from: onTapInviteEmbed-AFFcxXc, reason: not valid java name */
    void mo495onTapInviteEmbedAFFcxXc(@NotNull String messageId, int index, Boolean primary, Boolean secondary);

    /* JADX INFO: renamed from: onTapInviteEmbedAccept-ntcYbpo, reason: not valid java name */
    void mo496onTapInviteEmbedAcceptntcYbpo(@NotNull String messageId, int index);

    /* JADX INFO: renamed from: onTapInviteToSpeak-1xi1bu0, reason: not valid java name */
    void mo497onTapInviteToSpeak1xi1bu0(@NotNull String messageId);

    /* JADX INFO: renamed from: onTapJoinActivity-1xi1bu0, reason: not valid java name */
    void mo498onTapJoinActivity1xi1bu0(@NotNull String messageId);

    /* JADX INFO: renamed from: onTapJoinRichPresence-1xi1bu0, reason: not valid java name */
    void mo499onTapJoinRichPresence1xi1bu0(@NotNull String messageId);

    void onTapLoadMessagesAfter();

    void onTapLoadMessagesBefore();

    void onTapMention(String userId, @NotNull String channelId, String roleName, String parsedUserId, String roleId, String guildId);

    /* JADX INFO: renamed from: onTapMessageReply-0eiqbug, reason: not valid java name */
    void mo500onTapMessageReply0eiqbug(long channelId, @NotNull String originId);

    /* JADX INFO: renamed from: onTapObscuredMediaLearnMore-8a0ehIg, reason: not valid java name */
    void mo501onTapObscuredMediaLearnMore8a0ehIg(@NotNull String messageId, long channelId, String attachmentId, String embedId);

    /* JADX INFO: renamed from: onTapObscuredMediaToggle-ZQwuxwg, reason: not valid java name */
    void mo502onTapObscuredMediaToggleZQwuxwg(@NotNull String messageId, long channelId, boolean isReveal, String attachmentId, String embedId);

    void onTapOpTag();

    /* JADX INFO: renamed from: onTapPollAction-sekaTiM, reason: not valid java name */
    void mo503onTapPollActionsekaTiM(long channelId, @NotNull String messageId, @NotNull String type);

    /* JADX INFO: renamed from: onTapPollAnswer-sekaTiM, reason: not valid java name */
    void mo504onTapPollAnswersekaTiM(long channelId, @NotNull String messageId, @NotNull String answerId);

    @d
    /* JADX INFO: renamed from: onTapPollSubmitVote-0eiqbug, reason: not valid java name */
    void mo505onTapPollSubmitVote0eiqbug(long channelId, @NotNull String messageId);

    /* JADX INFO: renamed from: onTapPostPreviewEmbed-kUTrp-s, reason: not valid java name */
    void mo506onTapPostPreviewEmbedkUTrps(long guildId, long parentChannelId, long threadId, @NotNull String messageId);

    /* JADX INFO: renamed from: onTapPreviewSharedClientTheme-1xi1bu0, reason: not valid java name */
    void mo507onTapPreviewSharedClientTheme1xi1bu0(@NotNull String messageId);

    /* JADX INFO: renamed from: onTapReaction-AFFcxXc, reason: not valid java name */
    void mo508onTapReactionAFFcxXc(@NotNull String messageId, ReactionView.Reaction reaction, Boolean isBurst, String location);

    /* JADX INFO: renamed from: onTapReactionOverflow-pfaIj0E, reason: not valid java name */
    void mo509onTapReactionOverflowpfaIj0E(@NotNull String messageId, long channelId);

    void onTapReferralRedeem(String referralId);

    void onTapRoleIcon(@NotNull String roleName, @NotNull String roleIconSource);

    void onTapSafetyPolicyNoticeEmbed(@NotNull String classificationId);

    void onTapSafetySystemNotificationCta(@NotNull String ctaType, @NotNull String ctaKey);

    /* JADX INFO: renamed from: onTapSeeMore-1xi1bu0, reason: not valid java name */
    void mo510onTapSeeMore1xi1bu0(@NotNull String messageId);

    /* JADX INFO: renamed from: onTapSelectActionComponent-ntcYbpo, reason: not valid java name */
    void mo511onTapSelectActionComponentntcYbpo(@NotNull String messageId, @NotNull String componentId);

    /* JADX INFO: renamed from: onTapShareForumPost-mgk6anA, reason: not valid java name */
    void mo512onTapShareForumPostmgk6anA(long channelId, long guildId);

    void onTapShowAltText(@NotNull String description);

    void onTapSoundmoji(@NotNull SoundmojiContentNode node);

    /* JADX INFO: renamed from: onTapSummary-sekaTiM, reason: not valid java name */
    void mo513onTapSummarysekaTiM(long channelId, @NotNull String messageId, @NotNull String summaryId);

    /* JADX INFO: renamed from: onTapSummaryJump-sekaTiM, reason: not valid java name */
    void mo514onTapSummaryJumpsekaTiM(long channelId, @NotNull String messageId, @NotNull String summaryId);

    void onTapSuppressNotificationsIcon();

    /* JADX INFO: renamed from: onTapTag-Eqy5D80, reason: not valid java name */
    void mo515onTapTagEqy5D80(@NotNull String messageId, long channelId, String tagType);

    /* JADX INFO: renamed from: onTapThreadEmbed-1xi1bu0, reason: not valid java name */
    void mo516onTapThreadEmbed1xi1bu0(@NotNull String messageId);

    void onTapTimeoutIcon();

    void onTapTimestamp(@NotNull String timestamp);

    /* JADX INFO: renamed from: onTapToggleBlockedMessages-1xi1bu0, reason: not valid java name */
    void mo517onTapToggleBlockedMessages1xi1bu0(@NotNull String messageId);

    /* JADX INFO: renamed from: onTapUsername-x5gers8, reason: not valid java name */
    void mo518onTapUsernamex5gers8(@NotNull String messageId, long userId);

    void onTapVoiceChannelBadge(@NotNull String channelId);

    /* JADX INFO: renamed from: onWelcomeReplyClicked-Ayv7vGE, reason: not valid java name */
    void mo519onWelcomeReplyClickedAyv7vGE(@NotNull Sticker sticker, @NotNull String messageId);

    /* JADX INFO: renamed from: voiceMessagePlaybackFailed-ntcYbpo, reason: not valid java name */
    void mo520voiceMessagePlaybackFailedntcYbpo(@NotNull String messageId, String errorMessage);
}
