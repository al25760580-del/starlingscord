package com.discord.notifications.api;

import a3.e;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.presentation.list.a;
import com.discord.notifications.renderer.NotificationRenderer;
import com.discord.primitives.ApplicationId;
import com.discord.primitives.ApplicationId$$serializer;
import com.discord.primitives.ChannelId;
import com.discord.primitives.ChannelId$$serializer;
import com.discord.primitives.GuildId;
import com.discord.primitives.GuildId$$serializer;
import com.discord.primitives.MessageId;
import com.discord.primitives.MessageId$$serializer;
import com.discord.primitives.UserId;
import com.discord.primitives.UserId$$serializer;
import com.discord.sticker.sticker_types.c;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.modules.dialog.AlertFragment;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.util.List;
import java.util.Map;
import kk.b;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.n0;
import kotlin.collections.w0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kr.f;
import or.e1;
import or.g;
import or.h0;
import or.m0;
import or.r0;
import or.s1;
import org.jetbrains.annotations.NotNull;
import org.webrtc.PeerConnection;
import rn.l;
import rn.m;

/* JADX INFO: loaded from: classes.dex */
@f
@Metadata(d1 = {"\u0000\u0083\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010$\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0003\bã\u0001\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 À\u00022\u00020\u0001:\u0004À\u0002Á\u0002B\u0091\u0006\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010/\u001a\u000200\u0012\b\b\u0002\u00101\u001a\u000200\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u000100\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010@\u001a\u000200\u0012\u0014\b\u0002\u0010A\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030B\u0012\b\b\u0002\u0010C\u001a\u000200\u0012\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010I\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010M\u001a\u00020\f\u0012\b\b\u0002\u0010N\u001a\u000200¢\u0006\u0004\bO\u0010PB»\u0005\b\u0010\u0012\u0006\u0010Q\u001a\u00020\u0007\u0012\u0006\u0010R\u001a\u00020\u0007\u0012\u0006\u0010S\u001a\u00020\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0017\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0007\u0012\b\u0010!\u001a\u0004\u0018\u00010\"\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010(\u001a\u0004\u0018\u00010)\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010,\u001a\u0004\u0018\u00010-\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010/\u001a\u000200\u0012\u0006\u00101\u001a\u000200\u0012\b\u00102\u001a\u0004\u0018\u00010\u0019\u0012\b\u00103\u001a\u0004\u0018\u00010\u0003\u0012\b\u00104\u001a\u0004\u0018\u00010\u0003\u0012\b\u00105\u001a\u0004\u0018\u00010\u0003\u0012\b\u00106\u001a\u0004\u0018\u00010\u0003\u0012\b\u00107\u001a\u0004\u0018\u00010\u0003\u0012\b\u00108\u001a\u0004\u0018\u00010\u0003\u0012\b\u00109\u001a\u0004\u0018\u000100\u0012\b\u0010:\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010;\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010<\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010=\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010>\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010?\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010@\u001a\u000200\u0012\u0014\u0010A\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010B\u0012\u0006\u0010C\u001a\u000200\u0012\b\u0010D\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010E\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010F\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010G\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010H\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010I\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010J\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010K\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010L\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010M\u001a\u00020\f\u0012\u0006\u0010N\u001a\u000200\u0012\b\u0010T\u001a\u0004\u0018\u00010U¢\u0006\u0004\bO\u0010VJ\n\u0010é\u0001\u001a\u00020\u0003HÆ\u0003J\u0014\u0010ê\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0005\bë\u0001\u0010ZJ\u0011\u0010ì\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010`J\f\u0010í\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010î\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010`J\f\u0010ï\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010ð\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010jJ\u0011\u0010ñ\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010`J\f\u0010ò\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0012\u0010ó\u0001\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0003\bô\u0001J\f\u0010õ\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010ö\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0012\u0010÷\u0001\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0003\bø\u0001J\u0011\u0010ù\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010`J\f\u0010ú\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010û\u0001\u001a\b\u0012\u0004\u0012\u00020\u00100\u0017HÆ\u0003J\u0012\u0010ü\u0001\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0003\bý\u0001J\f\u0010þ\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010ÿ\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0080\u0002\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010`J\f\u0010\u0081\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0082\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0083\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0084\u0002\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010`J\u0012\u0010\u0085\u0002\u001a\u0004\u0018\u00010\"HÆ\u0003¢\u0006\u0003\b\u0086\u0002J\f\u0010\u0087\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0088\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0089\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u008a\u0002\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010`J\f\u0010\u008b\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0012\u0010\u008c\u0002\u001a\u0004\u0018\u00010)HÆ\u0003¢\u0006\u0003\b\u008d\u0002J\f\u0010\u008e\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008f\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0090\u0002\u001a\u0004\u0018\u00010-HÆ\u0003J\f\u0010\u0091\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010\u0092\u0002\u001a\u000200HÆ\u0003J\n\u0010\u0093\u0002\u001a\u000200HÆ\u0003J\u0012\u0010\u0094\u0002\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0003\b\u0095\u0002J\f\u0010\u0096\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0097\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0098\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0099\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009a\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009b\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0012\u0010\u009c\u0002\u001a\u0004\u0018\u000100HÆ\u0003¢\u0006\u0003\u0010¾\u0001J\f\u0010\u009d\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009e\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u009f\u0002\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010`J\u0011\u0010 \u0002\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010`J\u0011\u0010¡\u0002\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010`J\f\u0010¢\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010£\u0002\u001a\u000200HÆ\u0003J\u0016\u0010¤\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030BHÆ\u0003J\n\u0010¥\u0002\u001a\u000200HÆ\u0003J\f\u0010¦\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010§\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¨\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010©\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010ª\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010«\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¬\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u00ad\u0002\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010`J\f\u0010®\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010¯\u0002\u001a\u00020\fHÆ\u0003J\n\u0010°\u0002\u001a\u000200HÆ\u0003J\u009f\u0006\u0010±\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010/\u001a\u0002002\b\b\u0002\u00101\u001a\u0002002\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00109\u001a\u0004\u0018\u0001002\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010@\u001a\u0002002\u0014\b\u0002\u0010A\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030B2\b\b\u0002\u0010C\u001a\u0002002\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010I\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010M\u001a\u00020\f2\b\b\u0002\u0010N\u001a\u000200HÆ\u0001¢\u0006\u0006\b²\u0002\u0010³\u0002J\u0015\u0010´\u0002\u001a\u0002002\t\u0010µ\u0002\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010¶\u0002\u001a\u00020\u0007HÖ\u0001J\n\u0010·\u0002\u001a\u00020\u0003HÖ\u0001J-\u0010¸\u0002\u001a\u00030¹\u00022\u0007\u0010º\u0002\u001a\u00020\u00002\b\u0010»\u0002\u001a\u00030¼\u00022\b\u0010½\u0002\u001a\u00030¾\u0002H\u0001¢\u0006\u0003\b¿\u0002R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010]\u0012\u0004\b[\u0010X\u001a\u0004\b\\\u0010ZR \u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010a\u0012\u0004\b^\u0010X\u001a\u0004\b_\u0010`R\u001e\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bb\u0010X\u001a\u0004\bc\u0010ZR \u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010a\u0012\u0004\bd\u0010X\u001a\u0004\be\u0010`R\u001e\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bf\u0010X\u001a\u0004\bg\u0010ZR \u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010k\u0012\u0004\bh\u0010X\u001a\u0004\bi\u0010jR \u0010\r\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010a\u0012\u0004\bl\u0010X\u001a\u0004\bm\u0010`R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bn\u0010X\u001a\u0004\bo\u0010ZR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bp\u0010X\u001a\u0004\bq\u0010rR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bs\u0010X\u001a\u0004\bt\u0010ZR\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bu\u0010X\u001a\u0004\bv\u0010ZR\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bw\u0010X\u001a\u0004\bx\u0010rR \u0010\u0014\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010a\u0012\u0004\by\u0010X\u001a\u0004\bz\u0010`R\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b{\u0010X\u001a\u0004\b|\u0010ZR\"\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u00178\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b}\u0010X\u001a\u0004\b~\u0010\u007fR!\u0010\u0018\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u0080\u0001\u0010X\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R \u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u0083\u0001\u0010X\u001a\u0005\b\u0084\u0001\u0010ZR \u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u0085\u0001\u0010X\u001a\u0005\b\u0086\u0001\u0010ZR\"\u0010\u001c\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0002\u0010a\u0012\u0005\b\u0087\u0001\u0010X\u001a\u0005\b\u0088\u0001\u0010`R \u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u0089\u0001\u0010X\u001a\u0005\b\u008a\u0001\u0010ZR \u0010\u001e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u008b\u0001\u0010X\u001a\u0005\b\u008c\u0001\u0010ZR \u0010\u001f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u008d\u0001\u0010X\u001a\u0005\b\u008e\u0001\u0010ZR\"\u0010 \u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0002\u0010a\u0012\u0005\b\u008f\u0001\u0010X\u001a\u0005\b\u0090\u0001\u0010`R!\u0010!\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u0091\u0001\u0010X\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001R \u0010#\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u0094\u0001\u0010X\u001a\u0005\b\u0095\u0001\u0010ZR \u0010$\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u0096\u0001\u0010X\u001a\u0005\b\u0097\u0001\u0010ZR \u0010%\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u0098\u0001\u0010X\u001a\u0005\b\u0099\u0001\u0010ZR\"\u0010&\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0002\u0010a\u0012\u0005\b\u009a\u0001\u0010X\u001a\u0005\b\u009b\u0001\u0010`R \u0010'\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u009c\u0001\u0010X\u001a\u0005\b\u009d\u0001\u0010ZR!\u0010(\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u009e\u0001\u0010X\u001a\u0006\b\u009f\u0001\u0010 \u0001R \u0010*\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b¡\u0001\u0010X\u001a\u0005\b¢\u0001\u0010ZR \u0010+\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b£\u0001\u0010X\u001a\u0005\b¤\u0001\u0010ZR!\u0010,\u001a\u0004\u0018\u00010-8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b¥\u0001\u0010X\u001a\u0006\b¦\u0001\u0010§\u0001R \u0010.\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b¨\u0001\u0010X\u001a\u0005\b©\u0001\u0010ZR\u001f\u0010/\u001a\u0002008\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\bª\u0001\u0010X\u001a\u0006\b«\u0001\u0010¬\u0001R\u001e\u00101\u001a\u0002008\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u00ad\u0001\u0010X\u001a\u0005\b1\u0010¬\u0001R!\u00102\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b®\u0001\u0010X\u001a\u0006\b¯\u0001\u0010\u0082\u0001R \u00103\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b°\u0001\u0010X\u001a\u0005\b±\u0001\u0010ZR \u00104\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b²\u0001\u0010X\u001a\u0005\b³\u0001\u0010ZR \u00105\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b´\u0001\u0010X\u001a\u0005\bµ\u0001\u0010ZR \u00106\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b¶\u0001\u0010X\u001a\u0005\b·\u0001\u0010ZR \u00107\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b¸\u0001\u0010X\u001a\u0005\b¹\u0001\u0010ZR \u00108\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\bº\u0001\u0010X\u001a\u0005\b»\u0001\u0010ZR$\u00109\u001a\u0004\u0018\u0001008\u0006X\u0087\u0004¢\u0006\u0014\n\u0003\u0010¿\u0001\u0012\u0005\b¼\u0001\u0010X\u001a\u0006\b½\u0001\u0010¾\u0001R \u0010:\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\bÀ\u0001\u0010X\u001a\u0005\bÁ\u0001\u0010ZR \u0010;\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\bÂ\u0001\u0010X\u001a\u0005\bÃ\u0001\u0010ZR\"\u0010<\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0002\u0010a\u0012\u0005\bÄ\u0001\u0010X\u001a\u0005\bÅ\u0001\u0010`R\"\u0010=\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0002\u0010a\u0012\u0005\bÆ\u0001\u0010X\u001a\u0005\bÇ\u0001\u0010`R\"\u0010>\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0002\u0010a\u0012\u0005\bÈ\u0001\u0010X\u001a\u0005\bÉ\u0001\u0010`R \u0010?\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\bÊ\u0001\u0010X\u001a\u0005\bË\u0001\u0010ZR\u001f\u0010@\u001a\u0002008\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\bÌ\u0001\u0010X\u001a\u0006\bÍ\u0001\u0010¬\u0001R+\u0010A\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030B8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\bÎ\u0001\u0010X\u001a\u0006\bÏ\u0001\u0010Ð\u0001R\u001f\u0010C\u001a\u0002008\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\bÑ\u0001\u0010X\u001a\u0006\bÒ\u0001\u0010¬\u0001R \u0010D\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\bÓ\u0001\u0010X\u001a\u0005\bÔ\u0001\u0010ZR \u0010E\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\bÕ\u0001\u0010X\u001a\u0005\bÖ\u0001\u0010ZR \u0010F\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b×\u0001\u0010X\u001a\u0005\bØ\u0001\u0010ZR \u0010G\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\bÙ\u0001\u0010X\u001a\u0005\bÚ\u0001\u0010ZR \u0010H\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\bÛ\u0001\u0010X\u001a\u0005\bÜ\u0001\u0010ZR \u0010I\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\bÝ\u0001\u0010X\u001a\u0005\bÞ\u0001\u0010ZR \u0010J\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\bß\u0001\u0010X\u001a\u0005\bà\u0001\u0010ZR\"\u0010K\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0002\u0010a\u0012\u0005\bá\u0001\u0010X\u001a\u0005\bâ\u0001\u0010`R \u0010L\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\bã\u0001\u0010X\u001a\u0005\bä\u0001\u0010ZR\u001f\u0010M\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\bå\u0001\u0010X\u001a\u0006\bæ\u0001\u0010ç\u0001R\u001e\u0010N\u001a\u0002008\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\bè\u0001\u0010X\u001a\u0005\bN\u0010¬\u0001¨\u0006Â\u0002"}, d2 = {"Lcom/discord/notifications/api/NotificationData;", "", "type", "", "messageId", "Lcom/discord/primitives/MessageId;", "messageActivityType", "", "messageApplicationName", "messageType", "messageContent", "messageFlags", "", "channelType", NotificationRenderer.CHANNEL_NAME, "channelId", "Lcom/discord/primitives/ChannelId;", "channelIcon", "parentName", "parentId", "messageReferenceType", "channelRtcRegion", "ackChannelIds", "", "userId", "Lcom/discord/primitives/UserId;", "userUsername", "userGlobalName", "userDiscriminator", "userAvatar", "userGuildAvatar", "platformUserUsername", "relationshipType", "guildId", "Lcom/discord/primitives/GuildId;", "guildName", "guildIcon", "activityInstanceId", "activityType", "activityName", "applicationId", "Lcom/discord/primitives/ApplicationId;", "applicationName", "applicationIcon", "message", "Lcom/discord/notifications/api/NotificationMessage;", "stageInstanceTopic", "canReply", "", "isFromCurrentUser", "receivingUserId", AlertFragment.ARG_TITLE, "subtitle", "iconUrl", "notificationChannel", "trackingType", "deeplink", "expandSubtitle", "imageAttachmentUrl", "ergoImageAttachmentUrl", "attachmentTextVariant", "imageAttachmentCount", "videoAttachmentCount", "timeReceived", "silent", "userInfo", "", "appDm", "notifTypeId", "notifInstanceId", "joinId", "mentionType", "appState", "inviteGuildName", "inviteChannelName", "inviteTitleVariant", "pollQuestion", "sentAtMillis", "isSpoilerChannel", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Lcom/discord/primitives/ChannelId;Ljava/lang/String;Ljava/lang/String;Lcom/discord/primitives/ChannelId;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Lcom/discord/primitives/UserId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/discord/primitives/GuildId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/discord/primitives/ApplicationId;Ljava/lang/String;Ljava/lang/String;Lcom/discord/notifications/api/NotificationMessage;Ljava/lang/String;ZZLcom/discord/primitives/UserId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ZLjava/util/Map;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;JZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "seen0", "seen1", "seen2", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Lcom/discord/primitives/ChannelId;Ljava/lang/String;Ljava/lang/String;Lcom/discord/primitives/ChannelId;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Lcom/discord/primitives/UserId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/discord/primitives/GuildId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/discord/primitives/ApplicationId;Ljava/lang/String;Ljava/lang/String;Lcom/discord/notifications/api/NotificationMessage;Ljava/lang/String;ZZLcom/discord/primitives/UserId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ZLjava/util/Map;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;JZLkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getType$annotations", "()V", "getType", "()Ljava/lang/String;", "getMessageId-N_6c4I0$annotations", "getMessageId-N_6c4I0", "Ljava/lang/String;", "getMessageActivityType$annotations", "getMessageActivityType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMessageApplicationName$annotations", "getMessageApplicationName", "getMessageType$annotations", "getMessageType", "getMessageContent$annotations", "getMessageContent", "getMessageFlags$annotations", "getMessageFlags", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getChannelType$annotations", "getChannelType", "getChannelName$annotations", "getChannelName", "getChannelId-qMVnFVQ$annotations", "getChannelId-qMVnFVQ", "()Lcom/discord/primitives/ChannelId;", "getChannelIcon$annotations", "getChannelIcon", "getParentName$annotations", "getParentName", "getParentId-qMVnFVQ$annotations", "getParentId-qMVnFVQ", "getMessageReferenceType$annotations", "getMessageReferenceType", "getChannelRtcRegion$annotations", "getChannelRtcRegion", "getAckChannelIds$annotations", "getAckChannelIds", "()Ljava/util/List;", "getUserId-wUX8bhU$annotations", "getUserId-wUX8bhU", "()Lcom/discord/primitives/UserId;", "getUserUsername$annotations", "getUserUsername", "getUserGlobalName$annotations", "getUserGlobalName", "getUserDiscriminator$annotations", "getUserDiscriminator", "getUserAvatar$annotations", "getUserAvatar", "getUserGuildAvatar$annotations", "getUserGuildAvatar", "getPlatformUserUsername$annotations", "getPlatformUserUsername", "getRelationshipType$annotations", "getRelationshipType", "getGuildId-qOKuAAo$annotations", "getGuildId-qOKuAAo", "()Lcom/discord/primitives/GuildId;", "getGuildName$annotations", "getGuildName", "getGuildIcon$annotations", "getGuildIcon", "getActivityInstanceId$annotations", "getActivityInstanceId", "getActivityType$annotations", "getActivityType", "getActivityName$annotations", "getActivityName", "getApplicationId-UtIrSio$annotations", "getApplicationId-UtIrSio", "()Lcom/discord/primitives/ApplicationId;", "getApplicationName$annotations", "getApplicationName", "getApplicationIcon$annotations", "getApplicationIcon", "getMessage$annotations", "getMessage", "()Lcom/discord/notifications/api/NotificationMessage;", "getStageInstanceTopic$annotations", "getStageInstanceTopic", "getCanReply$annotations", "getCanReply", "()Z", "isFromCurrentUser$annotations", "getReceivingUserId-wUX8bhU$annotations", "getReceivingUserId-wUX8bhU", "getTitle$annotations", "getTitle", "getSubtitle$annotations", "getSubtitle", "getIconUrl$annotations", "getIconUrl", "getNotificationChannel$annotations", "getNotificationChannel", "getTrackingType$annotations", "getTrackingType", "getDeeplink$annotations", "getDeeplink", "getExpandSubtitle$annotations", "getExpandSubtitle", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getImageAttachmentUrl$annotations", "getImageAttachmentUrl", "getErgoImageAttachmentUrl$annotations", "getErgoImageAttachmentUrl", "getAttachmentTextVariant$annotations", "getAttachmentTextVariant", "getImageAttachmentCount$annotations", "getImageAttachmentCount", "getVideoAttachmentCount$annotations", "getVideoAttachmentCount", "getTimeReceived$annotations", "getTimeReceived", "getSilent$annotations", "getSilent", "getUserInfo$annotations", "getUserInfo", "()Ljava/util/Map;", "getAppDm$annotations", "getAppDm", "getNotifTypeId$annotations", "getNotifTypeId", "getNotifInstanceId$annotations", "getNotifInstanceId", "getJoinId$annotations", "getJoinId", "getMentionType$annotations", "getMentionType", "getAppState$annotations", "getAppState", "getInviteGuildName$annotations", "getInviteGuildName", "getInviteChannelName$annotations", "getInviteChannelName", "getInviteTitleVariant$annotations", "getInviteTitleVariant", "getPollQuestion$annotations", "getPollQuestion", "getSentAtMillis$annotations", "getSentAtMillis", "()J", "isSpoilerChannel$annotations", "component1", "component2", "component2-N_6c4I0", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component10-qMVnFVQ", "component11", "component12", "component13", "component13-qMVnFVQ", "component14", "component15", "component16", "component17", "component17-wUX8bhU", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component25-qOKuAAo", "component26", "component27", "component28", "component29", "component30", "component31", "component31-UtIrSio", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component38-wUX8bhU", "component39", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component50", "component51", "component52", "component53", "component54", "component55", "component56", "component57", "component58", "component59", "component60", "component61", "component62", "component63", "component64", "component65", "copy", "copy-kb5oZcE", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Lcom/discord/primitives/ChannelId;Ljava/lang/String;Ljava/lang/String;Lcom/discord/primitives/ChannelId;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Lcom/discord/primitives/UserId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/discord/primitives/GuildId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/discord/primitives/ApplicationId;Ljava/lang/String;Ljava/lang/String;Lcom/discord/notifications/api/NotificationMessage;Ljava/lang/String;ZZLcom/discord/primitives/UserId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ZLjava/util/Map;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;JZ)Lcom/discord/notifications/api/NotificationData;", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$notification_api_release", "Companion", "$serializer", "notification_api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class NotificationData {
    public static final int ACTIVITY_TYPE_PLAYING = 0;
    public static final int ACTIVITY_TYPE_STREAMING = 1;
    public static final int CHANNEL_TYPE_ANNOUNCEMENT_THREAD = 10;
    public static final int CHANNEL_TYPE_CATEGORY = 4;
    public static final int CHANNEL_TYPE_DIRECTORY = 14;
    public static final int CHANNEL_TYPE_DM = 1;
    public static final int CHANNEL_TYPE_GROUP_DM = 3;
    public static final int CHANNEL_TYPE_GUILD_ANNOUNCEMENT = 5;
    public static final int CHANNEL_TYPE_GUILD_STAGE_VOICE = 13;
    public static final int CHANNEL_TYPE_GUILD_STORE = 6;
    public static final int CHANNEL_TYPE_GUILD_TEXT = 0;
    public static final int CHANNEL_TYPE_GUILD_VOICE = 2;
    public static final int CHANNEL_TYPE_PRIVATE_THREAD = 12;
    public static final int CHANNEL_TYPE_PUBLIC_THREAD = 11;
    public static final int INVITE_TITLE_VARIANT_EMOJI = 2;
    public static final int INVITE_TITLE_VARIANT_SENDER_ONLY = 1;
    public static final int MESSAGE_ACTIVITY_TYPE_JOIN = 1;
    public static final int MESSAGE_ACTIVITY_TYPE_LISTEN = 3;
    public static final int MESSAGE_ACTIVITY_TYPE_REQUEST = 5;
    public static final int MESSAGE_ACTIVITY_TYPE_SPECTATE = 2;
    public static final int MESSAGE_ACTIVITY_TYPE_WATCH = 4;
    public static final int MESSAGE_REFERENCE_TYPE_FORWARD = 1;
    public static final int MESSAGE_TYPE_POLL_RESULT = 46;
    public static final int MESSAGE_TYPE_USER_JOIN = 7;
    public static final int MSG_MUTE_MIN_COUNT = 2;
    public static final int NOTIF_TYPE_APPLICATION_LIBRARY_INSTALL_COMPLETE = 5;
    public static final int NOTIF_TYPE_CALL_RING = 2;
    public static final int NOTIF_TYPE_FORUM_THREAD_CREATED = 9;
    public static final int NOTIF_TYPE_FRIEND_REQUEST_REMINDER_PUSH = 13;
    public static final int NOTIF_TYPE_FRIEND_SUGGESTION_CREATE = 4;
    public static final int NOTIF_TYPE_GUILD_SCHEDULED_EVENT_UPDATE = 8;
    public static final int NOTIF_TYPE_GUILD_STREAM_START = 6;
    public static final int NOTIF_TYPE_HOME_LIFECYCLE_PUSH = 14;
    public static final int NOTIF_TYPE_MESSAGE_CREATE = 1;
    public static final int NOTIF_TYPE_MISSED_MESSAGE_PUSH = 11;
    public static final int NOTIF_TYPE_NEW_USER_SESSION = 28;
    public static final int NOTIF_TYPE_NUDGE_NEW_FRIEND_DM_PUSH = 16;
    public static final int NOTIF_TYPE_POLL_ENDED_PUSH = 15;
    public static final int NOTIF_TYPE_REACTIONS_PUSH_NOTIFICATION = 23;
    public static final int NOTIF_TYPE_RELATIONSHIP_ADD = 3;
    public static final int NOTIF_TYPE_STAGE_INSTANCE_CREATE = 7;
    public static final int NOTIF_TYPE_SUSPICIOUS_SESSION = 27;
    public static final int NOTIF_TYPE_TOP_MESSAGES_PUSH = 10;
    public static final int RELATIONSHIP_TYPE_FRIEND = 1;
    public static final int RELATIONSHIP_TYPE_INVITE_INCOMING = 3;

    @NotNull
    public static final String TRACKING_TYPE_FRIEND_REQUEST_REMINDER = "generic_friend_request_reminder";

    @NotNull
    public static final String TRACKING_TYPE_GUILD_STREAM_START = "GUILD_STREAM_START";

    @NotNull
    public static final String TRACKING_TYPE_HOME_LIFECYCLE_PUSH = "home_lifecycle_push";

    @NotNull
    public static final String TRACKING_TYPE_MISSED_MESSAGE = "generic_missed_message";

    @NotNull
    public static final String TRACKING_TYPE_MODERATOR_FEATURED_MESSAGE = "generic_home_featured_message";

    @NotNull
    public static final String TRACKING_TYPE_NEW_USER_SESSION = "new_user_session";

    @NotNull
    public static final String TRACKING_TYPE_NUDGE_NEW_FRIEND_DM_PUSH = "nudge_new_friend_dm_push";

    @NotNull
    public static final String TRACKING_TYPE_POLL_ENDED = "poll_ended";

    @NotNull
    public static final String TRACKING_TYPE_REACTIONS = "reactions_push_notification";

    @NotNull
    public static final String TRACKING_TYPE_SUSPICIOUS_SESSION = "suspicious_session";

    @NotNull
    public static final String TRACKING_TYPE_TOP_MESSAGES_PUSH = "top_messages_push";

    @NotNull
    public static final String TRACKING_TYPE_TRENDING_CONTENT_PUSH = "trending_content_push";

    @NotNull
    public static final String TYPE_ACTIVITY_START = "ACTIVITY_START";

    @NotNull
    public static final String TYPE_APPLICATION_LIBRARY_INSTALL_COMPLETE = "APPLICATION_LIBRARY_INSTALL_COMPLETE";

    @NotNull
    public static final String TYPE_CALL_ACK = "CALL_ACK";

    @NotNull
    public static final String TYPE_CALL_CONNECT = "CALL_CONNECT";

    @NotNull
    public static final String TYPE_CALL_RING = "CALL_RING";

    @NotNull
    public static final String TYPE_CALL_RING_END = "CALL_RING_END";

    @NotNull
    public static final String TYPE_CHANNEL_ACK = "CHANNEL_ACK";

    @NotNull
    public static final String TYPE_FORUM_THREAD_CREATED = "FORUM_THREAD_CREATED";

    @NotNull
    public static final String TYPE_FRIEND_SUGGESTION_CREATE = "FRIEND_SUGGESTION_CREATE";

    @NotNull
    public static final String TYPE_GENERIC_PUSH_NOTIFICATION_SENT = "GENERIC_PUSH_NOTIFICATION_SENT";

    @NotNull
    public static final String TYPE_GUILD_SCHEDULED_EVENT_UPDATE = "GUILD_SCHEDULED_EVENT_UPDATE";

    @NotNull
    public static final String TYPE_LOCAL_NOTIFICATION = "LOCAL_NOTIFICATION";

    @NotNull
    public static final String TYPE_MESSAGE_CREATE = "MESSAGE_CREATE";

    @NotNull
    public static final String TYPE_RELATIONSHIP_ADD = "RELATIONSHIP_ADD";

    @NotNull
    public static final String TYPE_STAGE_INSTANCE_CREATE = "STAGE_INSTANCE_CREATE";

    @NotNull
    private final List<ChannelId> ackChannelIds;
    private final String activityInstanceId;
    private final String activityName;
    private final Integer activityType;
    private final boolean appDm;
    private final String appState;
    private final String applicationIcon;
    private final ApplicationId applicationId;
    private final String applicationName;
    private final Integer attachmentTextVariant;
    private final boolean canReply;
    private final String channelIcon;
    private final ChannelId channelId;
    private final String channelName;
    private final String channelRtcRegion;
    private final Integer channelType;
    private final String deeplink;
    private final String ergoImageAttachmentUrl;
    private final Boolean expandSubtitle;
    private final String guildIcon;
    private final GuildId guildId;
    private final String guildName;
    private final String iconUrl;
    private final Integer imageAttachmentCount;
    private final String imageAttachmentUrl;
    private final String inviteChannelName;
    private final String inviteGuildName;
    private final Integer inviteTitleVariant;
    private final boolean isFromCurrentUser;
    private final boolean isSpoilerChannel;
    private final String joinId;
    private final String mentionType;
    private final NotificationMessage message;
    private final Integer messageActivityType;
    private final String messageApplicationName;
    private final String messageContent;
    private final Long messageFlags;
    private final String messageId;
    private final Integer messageReferenceType;
    private final Integer messageType;
    private final String notifInstanceId;
    private final String notifTypeId;
    private final String notificationChannel;
    private final ChannelId parentId;
    private final String parentName;
    private final String platformUserUsername;
    private final String pollQuestion;
    private final UserId receivingUserId;
    private final Integer relationshipType;
    private final long sentAtMillis;
    private final boolean silent;
    private final String stageInstanceTopic;
    private final String subtitle;
    private final String timeReceived;
    private final String title;
    private final String trackingType;

    @NotNull
    private final String type;
    private final String userAvatar;
    private final Integer userDiscriminator;
    private final String userGlobalName;
    private final String userGuildAvatar;
    private final UserId userId;

    @NotNull
    private final Map<String, String> userInfo;
    private final String userUsername;
    private final Integer videoAttachmentCount;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, l.a(m.f19486e, new c(21)), null, null, null, null, null, null, null, null, null, null, null, null};

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0010\u000e\n\u0002\b.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010N\u001a\b\u0012\u0004\u0012\u00020P0OR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020 X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020 X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020 X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020 X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020 X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020 X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020 X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020 X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020 X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020 X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020 X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020 X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020 X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020 X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020 X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020 X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020 X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020 X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020 X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020 X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020 X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020 X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020 X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020 X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020 X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020 X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010I\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010J\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010K\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010L\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010M\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006Q"}, d2 = {"Lcom/discord/notifications/api/NotificationData$Companion;", "", "<init>", "()V", "CHANNEL_TYPE_GUILD_TEXT", "", "CHANNEL_TYPE_DM", "CHANNEL_TYPE_GUILD_VOICE", "CHANNEL_TYPE_GROUP_DM", "CHANNEL_TYPE_CATEGORY", "CHANNEL_TYPE_GUILD_ANNOUNCEMENT", "CHANNEL_TYPE_GUILD_STORE", "CHANNEL_TYPE_ANNOUNCEMENT_THREAD", "CHANNEL_TYPE_PUBLIC_THREAD", "CHANNEL_TYPE_PRIVATE_THREAD", "CHANNEL_TYPE_GUILD_STAGE_VOICE", "CHANNEL_TYPE_DIRECTORY", "MESSAGE_ACTIVITY_TYPE_JOIN", "MESSAGE_ACTIVITY_TYPE_SPECTATE", "MESSAGE_ACTIVITY_TYPE_LISTEN", "MESSAGE_ACTIVITY_TYPE_WATCH", "MESSAGE_ACTIVITY_TYPE_REQUEST", "MESSAGE_TYPE_USER_JOIN", "MESSAGE_TYPE_POLL_RESULT", "MESSAGE_REFERENCE_TYPE_FORWARD", "RELATIONSHIP_TYPE_FRIEND", "RELATIONSHIP_TYPE_INVITE_INCOMING", "ACTIVITY_TYPE_PLAYING", "ACTIVITY_TYPE_STREAMING", "INVITE_TITLE_VARIANT_SENDER_ONLY", "INVITE_TITLE_VARIANT_EMOJI", "TYPE_ACTIVITY_START", "", "TYPE_CHANNEL_ACK", "TYPE_MESSAGE_CREATE", "TYPE_RELATIONSHIP_ADD", "TYPE_CALL_RING", "TYPE_CALL_RING_END", "TYPE_CALL_ACK", "TYPE_CALL_CONNECT", "TYPE_APPLICATION_LIBRARY_INSTALL_COMPLETE", "TYPE_STAGE_INSTANCE_CREATE", "TYPE_FORUM_THREAD_CREATED", "TYPE_GUILD_SCHEDULED_EVENT_UPDATE", "TYPE_GENERIC_PUSH_NOTIFICATION_SENT", "TYPE_FRIEND_SUGGESTION_CREATE", "TYPE_LOCAL_NOTIFICATION", "TRACKING_TYPE_SUSPICIOUS_SESSION", "TRACKING_TYPE_GUILD_STREAM_START", "TRACKING_TYPE_MODERATOR_FEATURED_MESSAGE", "TRACKING_TYPE_MISSED_MESSAGE", "TRACKING_TYPE_FRIEND_REQUEST_REMINDER", "TRACKING_TYPE_NUDGE_NEW_FRIEND_DM_PUSH", "TRACKING_TYPE_TOP_MESSAGES_PUSH", "TRACKING_TYPE_HOME_LIFECYCLE_PUSH", "TRACKING_TYPE_TRENDING_CONTENT_PUSH", "TRACKING_TYPE_POLL_ENDED", "TRACKING_TYPE_REACTIONS", "TRACKING_TYPE_NEW_USER_SESSION", "MSG_MUTE_MIN_COUNT", "NOTIF_TYPE_MESSAGE_CREATE", "NOTIF_TYPE_CALL_RING", "NOTIF_TYPE_RELATIONSHIP_ADD", "NOTIF_TYPE_FRIEND_SUGGESTION_CREATE", "NOTIF_TYPE_APPLICATION_LIBRARY_INSTALL_COMPLETE", "NOTIF_TYPE_GUILD_STREAM_START", "NOTIF_TYPE_STAGE_INSTANCE_CREATE", "NOTIF_TYPE_GUILD_SCHEDULED_EVENT_UPDATE", "NOTIF_TYPE_FORUM_THREAD_CREATED", "NOTIF_TYPE_TOP_MESSAGES_PUSH", "NOTIF_TYPE_MISSED_MESSAGE_PUSH", "NOTIF_TYPE_FRIEND_REQUEST_REMINDER_PUSH", "NOTIF_TYPE_HOME_LIFECYCLE_PUSH", "NOTIF_TYPE_POLL_ENDED_PUSH", "NOTIF_TYPE_NUDGE_NEW_FRIEND_DM_PUSH", "NOTIF_TYPE_REACTIONS_PUSH_NOTIFICATION", "NOTIF_TYPE_SUSPICIOUS_SESSION", "NOTIF_TYPE_NEW_USER_SESSION", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/notifications/api/NotificationData;", "notification_api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return NotificationData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ NotificationData(int i7, int i10, int i11, String str, String str2, Integer num, String str3, Integer num2, String str4, Long l6, Integer num3, String str5, ChannelId channelId, String str6, String str7, ChannelId channelId2, Integer num4, String str8, List list, UserId userId, String str9, String str10, Integer num5, String str11, String str12, String str13, Integer num6, GuildId guildId, String str14, String str15, String str16, Integer num7, String str17, ApplicationId applicationId, String str18, String str19, NotificationMessage notificationMessage, String str20, boolean z5, boolean z6, UserId userId2, String str21, String str22, String str23, String str24, String str25, String str26, Boolean bool, String str27, String str28, Integer num8, Integer num9, Integer num10, String str29, boolean z7, Map map, boolean z10, String str30, String str31, String str32, String str33, String str34, String str35, String str36, Integer num11, String str37, long j, boolean z11, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i7, i10, i11, str, str2, num, str3, num2, str4, l6, num3, str5, channelId, str6, str7, channelId2, num4, str8, list, userId, str9, str10, num5, str11, str12, str13, num6, guildId, str14, str15, str16, num7, str17, applicationId, str18, str19, notificationMessage, str20, z5, z6, userId2, str21, str22, str23, str24, str25, str26, bool, str27, str28, num8, num9, num10, str29, z7, map, z10, str30, str31, str32, str33, str34, str35, str36, num11, str37, j, z11, serializationConstructorMarker);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        s1 s1Var = s1.f17602a;
        return new h0(s1Var, s1Var, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-kb5oZcE$default, reason: not valid java name */
    public static /* synthetic */ NotificationData m1073copykb5oZcE$default(NotificationData notificationData, String str, String str2, Integer num, String str3, Integer num2, String str4, Long l6, Integer num3, String str5, ChannelId channelId, String str6, String str7, ChannelId channelId2, Integer num4, String str8, List list, UserId userId, String str9, String str10, Integer num5, String str11, String str12, String str13, Integer num6, GuildId guildId, String str14, String str15, String str16, Integer num7, String str17, ApplicationId applicationId, String str18, String str19, NotificationMessage notificationMessage, String str20, boolean z5, boolean z6, UserId userId2, String str21, String str22, String str23, String str24, String str25, String str26, Boolean bool, String str27, String str28, Integer num8, Integer num9, Integer num10, String str29, boolean z7, Map map, boolean z10, String str30, String str31, String str32, String str33, String str34, String str35, String str36, Integer num11, String str37, long j, boolean z11, int i7, int i10, int i11, Object obj) {
        boolean z12;
        long j5;
        String str38 = (i7 & 1) != 0 ? notificationData.type : str;
        String str39 = (i7 & 2) != 0 ? notificationData.messageId : str2;
        Integer num12 = (i7 & 4) != 0 ? notificationData.messageActivityType : num;
        String str40 = (i7 & 8) != 0 ? notificationData.messageApplicationName : str3;
        Integer num13 = (i7 & 16) != 0 ? notificationData.messageType : num2;
        String str41 = (i7 & 32) != 0 ? notificationData.messageContent : str4;
        Long l7 = (i7 & 64) != 0 ? notificationData.messageFlags : l6;
        Integer num14 = (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? notificationData.channelType : num3;
        String str42 = (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? notificationData.channelName : str5;
        ChannelId channelId3 = (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? notificationData.channelId : channelId;
        String str43 = (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? notificationData.channelIcon : str6;
        String str44 = (i7 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? notificationData.parentName : str7;
        ChannelId channelId4 = (i7 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? notificationData.parentId : channelId2;
        String str45 = str38;
        Integer num15 = (i7 & 8192) != 0 ? notificationData.messageReferenceType : num4;
        String str46 = (i7 & 16384) != 0 ? notificationData.channelRtcRegion : str8;
        List list2 = (i7 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? notificationData.ackChannelIds : list;
        UserId userId3 = (i7 & 65536) != 0 ? notificationData.userId : userId;
        String str47 = (i7 & 131072) != 0 ? notificationData.userUsername : str9;
        String str48 = (i7 & 262144) != 0 ? notificationData.userGlobalName : str10;
        Integer num16 = (i7 & 524288) != 0 ? notificationData.userDiscriminator : num5;
        String str49 = (i7 & 1048576) != 0 ? notificationData.userAvatar : str11;
        String str50 = (i7 & 2097152) != 0 ? notificationData.userGuildAvatar : str12;
        String str51 = (i7 & 4194304) != 0 ? notificationData.platformUserUsername : str13;
        Integer num17 = (i7 & 8388608) != 0 ? notificationData.relationshipType : num6;
        GuildId guildId2 = (i7 & PointerEventHelper.X_FLAG_SUPPORTS_HOVER) != 0 ? notificationData.guildId : guildId;
        String str52 = (i7 & 33554432) != 0 ? notificationData.guildName : str14;
        String str53 = (i7 & 67108864) != 0 ? notificationData.guildIcon : str15;
        String str54 = (i7 & 134217728) != 0 ? notificationData.activityInstanceId : str16;
        Integer num18 = (i7 & 268435456) != 0 ? notificationData.activityType : num7;
        String str55 = (i7 & 536870912) != 0 ? notificationData.activityName : str17;
        ApplicationId applicationId2 = (i7 & 1073741824) != 0 ? notificationData.applicationId : applicationId;
        String str56 = (i7 & Integer.MIN_VALUE) != 0 ? notificationData.applicationName : str18;
        String str57 = (i10 & 1) != 0 ? notificationData.applicationIcon : str19;
        NotificationMessage notificationMessage2 = (i10 & 2) != 0 ? notificationData.message : notificationMessage;
        String str58 = (i10 & 4) != 0 ? notificationData.stageInstanceTopic : str20;
        boolean z13 = (i10 & 8) != 0 ? notificationData.canReply : z5;
        boolean z14 = (i10 & 16) != 0 ? notificationData.isFromCurrentUser : z6;
        UserId userId4 = (i10 & 32) != 0 ? notificationData.receivingUserId : userId2;
        String str59 = (i10 & 64) != 0 ? notificationData.title : str21;
        String str60 = (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? notificationData.subtitle : str22;
        String str61 = (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? notificationData.iconUrl : str23;
        String str62 = (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? notificationData.notificationChannel : str24;
        String str63 = (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? notificationData.trackingType : str25;
        String str64 = (i10 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? notificationData.deeplink : str26;
        Boolean bool2 = (i10 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? notificationData.expandSubtitle : bool;
        String str65 = (i10 & 8192) != 0 ? notificationData.imageAttachmentUrl : str27;
        String str66 = (i10 & 16384) != 0 ? notificationData.ergoImageAttachmentUrl : str28;
        Integer num19 = (i10 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? notificationData.attachmentTextVariant : num8;
        Integer num20 = (i10 & 65536) != 0 ? notificationData.imageAttachmentCount : num9;
        Integer num21 = (i10 & 131072) != 0 ? notificationData.videoAttachmentCount : num10;
        String str67 = (i10 & 262144) != 0 ? notificationData.timeReceived : str29;
        boolean z15 = (i10 & 524288) != 0 ? notificationData.silent : z7;
        Map map2 = (i10 & 1048576) != 0 ? notificationData.userInfo : map;
        boolean z16 = (i10 & 2097152) != 0 ? notificationData.appDm : z10;
        String str68 = (i10 & 4194304) != 0 ? notificationData.notifTypeId : str30;
        String str69 = (i10 & 8388608) != 0 ? notificationData.notifInstanceId : str31;
        String str70 = (i10 & PointerEventHelper.X_FLAG_SUPPORTS_HOVER) != 0 ? notificationData.joinId : str32;
        String str71 = (i10 & 33554432) != 0 ? notificationData.mentionType : str33;
        String str72 = (i10 & 67108864) != 0 ? notificationData.appState : str34;
        String str73 = (i10 & 134217728) != 0 ? notificationData.inviteGuildName : str35;
        String str74 = (i10 & 268435456) != 0 ? notificationData.inviteChannelName : str36;
        Integer num22 = (i10 & 536870912) != 0 ? notificationData.inviteTitleVariant : num11;
        String str75 = (i10 & 1073741824) != 0 ? notificationData.pollQuestion : str37;
        long j7 = (i10 & Integer.MIN_VALUE) != 0 ? notificationData.sentAtMillis : j;
        if ((i11 & 1) != 0) {
            j5 = j7;
            z12 = notificationData.isSpoilerChannel;
        } else {
            z12 = z11;
            j5 = j7;
        }
        return notificationData.m1088copykb5oZcE(str45, str39, num12, str40, num13, str41, l7, num14, str42, channelId3, str43, str44, channelId4, num15, str46, list2, userId3, str47, str48, num16, str49, str50, str51, num17, guildId2, str52, str53, str54, num18, str55, applicationId2, str56, str57, notificationMessage2, str58, z13, z14, userId4, str59, str60, str61, str62, str63, str64, bool2, str65, str66, num19, num20, num21, str67, z15, map2, z16, str68, str69, str70, str71, str72, str73, str74, num22, str75, j5, z12);
    }

    @f(with = ChannelListSerializer.class)
    public static /* synthetic */ void getAckChannelIds$annotations() {
    }

    public static /* synthetic */ void getActivityInstanceId$annotations() {
    }

    public static /* synthetic */ void getActivityName$annotations() {
    }

    public static /* synthetic */ void getActivityType$annotations() {
    }

    public static /* synthetic */ void getAppDm$annotations() {
    }

    public static /* synthetic */ void getAppState$annotations() {
    }

    public static /* synthetic */ void getApplicationIcon$annotations() {
    }

    /* JADX INFO: renamed from: getApplicationId-UtIrSio$annotations, reason: not valid java name */
    public static /* synthetic */ void m1074getApplicationIdUtIrSio$annotations() {
    }

    public static /* synthetic */ void getApplicationName$annotations() {
    }

    public static /* synthetic */ void getAttachmentTextVariant$annotations() {
    }

    @f(with = CanReplySerializer.class)
    public static /* synthetic */ void getCanReply$annotations() {
    }

    public static /* synthetic */ void getChannelIcon$annotations() {
    }

    /* JADX INFO: renamed from: getChannelId-qMVnFVQ$annotations, reason: not valid java name */
    public static /* synthetic */ void m1075getChannelIdqMVnFVQ$annotations() {
    }

    public static /* synthetic */ void getChannelName$annotations() {
    }

    public static /* synthetic */ void getChannelRtcRegion$annotations() {
    }

    public static /* synthetic */ void getChannelType$annotations() {
    }

    public static /* synthetic */ void getDeeplink$annotations() {
    }

    public static /* synthetic */ void getErgoImageAttachmentUrl$annotations() {
    }

    public static /* synthetic */ void getExpandSubtitle$annotations() {
    }

    public static /* synthetic */ void getGuildIcon$annotations() {
    }

    /* JADX INFO: renamed from: getGuildId-qOKuAAo$annotations, reason: not valid java name */
    public static /* synthetic */ void m1076getGuildIdqOKuAAo$annotations() {
    }

    public static /* synthetic */ void getGuildName$annotations() {
    }

    public static /* synthetic */ void getIconUrl$annotations() {
    }

    public static /* synthetic */ void getImageAttachmentCount$annotations() {
    }

    public static /* synthetic */ void getImageAttachmentUrl$annotations() {
    }

    public static /* synthetic */ void getInviteChannelName$annotations() {
    }

    public static /* synthetic */ void getInviteGuildName$annotations() {
    }

    public static /* synthetic */ void getInviteTitleVariant$annotations() {
    }

    public static /* synthetic */ void getJoinId$annotations() {
    }

    public static /* synthetic */ void getMentionType$annotations() {
    }

    @f(with = NotificationMessageSerializer.class)
    public static /* synthetic */ void getMessage$annotations() {
    }

    public static /* synthetic */ void getMessageActivityType$annotations() {
    }

    public static /* synthetic */ void getMessageApplicationName$annotations() {
    }

    public static /* synthetic */ void getMessageContent$annotations() {
    }

    public static /* synthetic */ void getMessageFlags$annotations() {
    }

    /* JADX INFO: renamed from: getMessageId-N_6c4I0$annotations, reason: not valid java name */
    public static /* synthetic */ void m1077getMessageIdN_6c4I0$annotations() {
    }

    public static /* synthetic */ void getMessageReferenceType$annotations() {
    }

    public static /* synthetic */ void getMessageType$annotations() {
    }

    public static /* synthetic */ void getNotifInstanceId$annotations() {
    }

    public static /* synthetic */ void getNotifTypeId$annotations() {
    }

    public static /* synthetic */ void getNotificationChannel$annotations() {
    }

    /* JADX INFO: renamed from: getParentId-qMVnFVQ$annotations, reason: not valid java name */
    public static /* synthetic */ void m1078getParentIdqMVnFVQ$annotations() {
    }

    public static /* synthetic */ void getParentName$annotations() {
    }

    public static /* synthetic */ void getPlatformUserUsername$annotations() {
    }

    public static /* synthetic */ void getPollQuestion$annotations() {
    }

    /* JADX INFO: renamed from: getReceivingUserId-wUX8bhU$annotations, reason: not valid java name */
    public static /* synthetic */ void m1079getReceivingUserIdwUX8bhU$annotations() {
    }

    public static /* synthetic */ void getRelationshipType$annotations() {
    }

    public static /* synthetic */ void getSentAtMillis$annotations() {
    }

    public static /* synthetic */ void getSilent$annotations() {
    }

    public static /* synthetic */ void getStageInstanceTopic$annotations() {
    }

    public static /* synthetic */ void getSubtitle$annotations() {
    }

    public static /* synthetic */ void getTimeReceived$annotations() {
    }

    public static /* synthetic */ void getTitle$annotations() {
    }

    public static /* synthetic */ void getTrackingType$annotations() {
    }

    public static /* synthetic */ void getType$annotations() {
    }

    public static /* synthetic */ void getUserAvatar$annotations() {
    }

    public static /* synthetic */ void getUserDiscriminator$annotations() {
    }

    public static /* synthetic */ void getUserGlobalName$annotations() {
    }

    public static /* synthetic */ void getUserGuildAvatar$annotations() {
    }

    /* JADX INFO: renamed from: getUserId-wUX8bhU$annotations, reason: not valid java name */
    public static /* synthetic */ void m1080getUserIdwUX8bhU$annotations() {
    }

    public static /* synthetic */ void getUserInfo$annotations() {
    }

    public static /* synthetic */ void getUserUsername$annotations() {
    }

    public static /* synthetic */ void getVideoAttachmentCount$annotations() {
    }

    public static /* synthetic */ void isFromCurrentUser$annotations() {
    }

    public static /* synthetic */ void isSpoilerChannel$annotations() {
    }

    public static final void write$Self$notification_api_release(NotificationData self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Lazy[] lazyArr = $childSerializers;
        output.q(serialDesc, 0, self.type);
        if (output.u(serialDesc, 1) || self.messageId != null) {
            MessageId$$serializer messageId$$serializer = MessageId$$serializer.INSTANCE;
            String str = self.messageId;
            output.r(serialDesc, 1, messageId$$serializer, str != null ? MessageId.m1156boximpl(str) : null);
        }
        if (output.u(serialDesc, 2) || self.messageActivityType != null) {
            output.r(serialDesc, 2, m0.f17573a, self.messageActivityType);
        }
        if (output.u(serialDesc, 3) || self.messageApplicationName != null) {
            output.r(serialDesc, 3, s1.f17602a, self.messageApplicationName);
        }
        if (output.u(serialDesc, 4) || self.messageType != null) {
            output.r(serialDesc, 4, m0.f17573a, self.messageType);
        }
        if (output.u(serialDesc, 5) || self.messageContent != null) {
            output.r(serialDesc, 5, s1.f17602a, self.messageContent);
        }
        if (output.u(serialDesc, 6) || self.messageFlags != null) {
            output.r(serialDesc, 6, r0.f17595a, self.messageFlags);
        }
        if (output.u(serialDesc, 7) || self.channelType != null) {
            output.r(serialDesc, 7, m0.f17573a, self.channelType);
        }
        if (output.u(serialDesc, 8) || self.channelName != null) {
            output.r(serialDesc, 8, s1.f17602a, self.channelName);
        }
        if (output.u(serialDesc, 9) || self.channelId != null) {
            output.r(serialDesc, 9, ChannelId$$serializer.INSTANCE, self.channelId);
        }
        if (output.u(serialDesc, 10) || self.channelIcon != null) {
            output.r(serialDesc, 10, s1.f17602a, self.channelIcon);
        }
        if (output.u(serialDesc, 11) || self.parentName != null) {
            output.r(serialDesc, 11, s1.f17602a, self.parentName);
        }
        if (output.u(serialDesc, 12) || self.parentId != null) {
            output.r(serialDesc, 12, ChannelId$$serializer.INSTANCE, self.parentId);
        }
        if (output.u(serialDesc, 13) || self.messageReferenceType != null) {
            output.r(serialDesc, 13, m0.f17573a, self.messageReferenceType);
        }
        if (output.u(serialDesc, 14) || self.channelRtcRegion != null) {
            output.r(serialDesc, 14, s1.f17602a, self.channelRtcRegion);
        }
        if (output.u(serialDesc, 15) || !Intrinsics.areEqual(self.ackChannelIds, n0.f14659d)) {
            output.g(serialDesc, 15, ChannelListSerializer.INSTANCE, self.ackChannelIds);
        }
        if (output.u(serialDesc, 16) || self.userId != null) {
            output.r(serialDesc, 16, UserId$$serializer.INSTANCE, self.userId);
        }
        if (output.u(serialDesc, 17) || self.userUsername != null) {
            output.r(serialDesc, 17, s1.f17602a, self.userUsername);
        }
        if (output.u(serialDesc, 18) || self.userGlobalName != null) {
            output.r(serialDesc, 18, s1.f17602a, self.userGlobalName);
        }
        if (output.u(serialDesc, 19) || self.userDiscriminator != null) {
            output.r(serialDesc, 19, m0.f17573a, self.userDiscriminator);
        }
        if (output.u(serialDesc, 20) || self.userAvatar != null) {
            output.r(serialDesc, 20, s1.f17602a, self.userAvatar);
        }
        if (output.u(serialDesc, 21) || self.userGuildAvatar != null) {
            output.r(serialDesc, 21, s1.f17602a, self.userGuildAvatar);
        }
        if (output.u(serialDesc, 22) || self.platformUserUsername != null) {
            output.r(serialDesc, 22, s1.f17602a, self.platformUserUsername);
        }
        if (output.u(serialDesc, 23) || self.relationshipType != null) {
            output.r(serialDesc, 23, m0.f17573a, self.relationshipType);
        }
        if (output.u(serialDesc, 24) || self.guildId != null) {
            output.r(serialDesc, 24, GuildId$$serializer.INSTANCE, self.guildId);
        }
        if (output.u(serialDesc, 25) || self.guildName != null) {
            output.r(serialDesc, 25, s1.f17602a, self.guildName);
        }
        if (output.u(serialDesc, 26) || self.guildIcon != null) {
            output.r(serialDesc, 26, s1.f17602a, self.guildIcon);
        }
        if (output.u(serialDesc, 27) || self.activityInstanceId != null) {
            output.r(serialDesc, 27, s1.f17602a, self.activityInstanceId);
        }
        if (output.u(serialDesc, 28) || self.activityType != null) {
            output.r(serialDesc, 28, m0.f17573a, self.activityType);
        }
        if (output.u(serialDesc, 29) || self.activityName != null) {
            output.r(serialDesc, 29, s1.f17602a, self.activityName);
        }
        if (output.u(serialDesc, 30) || self.applicationId != null) {
            output.r(serialDesc, 30, ApplicationId$$serializer.INSTANCE, self.applicationId);
        }
        if (output.u(serialDesc, 31) || self.applicationName != null) {
            output.r(serialDesc, 31, s1.f17602a, self.applicationName);
        }
        if (output.u(serialDesc, 32) || self.applicationIcon != null) {
            output.r(serialDesc, 32, s1.f17602a, self.applicationIcon);
        }
        if (output.u(serialDesc, 33) || self.message != null) {
            output.r(serialDesc, 33, NotificationMessageSerializer.INSTANCE, self.message);
        }
        if (output.u(serialDesc, 34) || self.stageInstanceTopic != null) {
            output.r(serialDesc, 34, s1.f17602a, self.stageInstanceTopic);
        }
        if (output.u(serialDesc, 35) || self.canReply) {
            output.g(serialDesc, 35, CanReplySerializer.INSTANCE, Boolean.valueOf(self.canReply));
        }
        if (output.u(serialDesc, 36) || self.isFromCurrentUser) {
            output.p(serialDesc, 36, self.isFromCurrentUser);
        }
        if (output.u(serialDesc, 37) || self.receivingUserId != null) {
            output.r(serialDesc, 37, UserId$$serializer.INSTANCE, self.receivingUserId);
        }
        if (output.u(serialDesc, 38) || self.title != null) {
            output.r(serialDesc, 38, s1.f17602a, self.title);
        }
        if (output.u(serialDesc, 39) || self.subtitle != null) {
            output.r(serialDesc, 39, s1.f17602a, self.subtitle);
        }
        if (output.u(serialDesc, 40) || self.iconUrl != null) {
            output.r(serialDesc, 40, s1.f17602a, self.iconUrl);
        }
        if (output.u(serialDesc, 41) || self.notificationChannel != null) {
            output.r(serialDesc, 41, s1.f17602a, self.notificationChannel);
        }
        if (output.u(serialDesc, 42) || self.trackingType != null) {
            output.r(serialDesc, 42, s1.f17602a, self.trackingType);
        }
        if (output.u(serialDesc, 43) || self.deeplink != null) {
            output.r(serialDesc, 43, s1.f17602a, self.deeplink);
        }
        if (output.u(serialDesc, 44) || !Intrinsics.areEqual(self.expandSubtitle, Boolean.FALSE)) {
            output.r(serialDesc, 44, g.f17537a, self.expandSubtitle);
        }
        if (output.u(serialDesc, 45) || self.imageAttachmentUrl != null) {
            output.r(serialDesc, 45, s1.f17602a, self.imageAttachmentUrl);
        }
        if (output.u(serialDesc, 46) || self.ergoImageAttachmentUrl != null) {
            output.r(serialDesc, 46, s1.f17602a, self.ergoImageAttachmentUrl);
        }
        if (output.u(serialDesc, 47) || self.attachmentTextVariant != null) {
            output.r(serialDesc, 47, m0.f17573a, self.attachmentTextVariant);
        }
        if (output.u(serialDesc, 48) || self.imageAttachmentCount != null) {
            output.r(serialDesc, 48, m0.f17573a, self.imageAttachmentCount);
        }
        if (output.u(serialDesc, 49) || self.videoAttachmentCount != null) {
            output.r(serialDesc, 49, m0.f17573a, self.videoAttachmentCount);
        }
        if (output.u(serialDesc, 50) || self.timeReceived != null) {
            output.r(serialDesc, 50, s1.f17602a, self.timeReceived);
        }
        if (output.u(serialDesc, 51) || self.silent) {
            output.p(serialDesc, 51, self.silent);
        }
        if (output.u(serialDesc, 52) || !Intrinsics.areEqual(self.userInfo, w0.d())) {
            output.g(serialDesc, 52, (KSerializer) lazyArr[52].getValue(), self.userInfo);
        }
        if (output.u(serialDesc, 53) || self.appDm) {
            output.p(serialDesc, 53, self.appDm);
        }
        if (output.u(serialDesc, 54) || self.notifTypeId != null) {
            output.r(serialDesc, 54, s1.f17602a, self.notifTypeId);
        }
        if (output.u(serialDesc, 55) || self.notifInstanceId != null) {
            output.r(serialDesc, 55, s1.f17602a, self.notifInstanceId);
        }
        if (output.u(serialDesc, 56) || self.joinId != null) {
            output.r(serialDesc, 56, s1.f17602a, self.joinId);
        }
        if (output.u(serialDesc, 57) || self.mentionType != null) {
            output.r(serialDesc, 57, s1.f17602a, self.mentionType);
        }
        if (output.u(serialDesc, 58) || self.appState != null) {
            output.r(serialDesc, 58, s1.f17602a, self.appState);
        }
        if (output.u(serialDesc, 59) || self.inviteGuildName != null) {
            output.r(serialDesc, 59, s1.f17602a, self.inviteGuildName);
        }
        if (output.u(serialDesc, 60) || self.inviteChannelName != null) {
            output.r(serialDesc, 60, s1.f17602a, self.inviteChannelName);
        }
        if (output.u(serialDesc, 61) || self.inviteTitleVariant != null) {
            output.r(serialDesc, 61, m0.f17573a, self.inviteTitleVariant);
        }
        if (output.u(serialDesc, 62) || self.pollQuestion != null) {
            output.r(serialDesc, 62, s1.f17602a, self.pollQuestion);
        }
        if (output.u(serialDesc, 63) || self.sentAtMillis != System.currentTimeMillis()) {
            output.C(serialDesc, 63, self.sentAtMillis);
        }
        if (output.u(serialDesc, 64) || self.isSpoilerChannel) {
            output.p(serialDesc, 64, self.isSpoilerChannel);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component10-qMVnFVQ, reason: not valid java name and from getter */
    public final ChannelId getChannelId() {
        return this.channelId;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getChannelIcon() {
        return this.channelIcon;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getParentName() {
        return this.parentName;
    }

    /* JADX INFO: renamed from: component13-qMVnFVQ, reason: not valid java name and from getter */
    public final ChannelId getParentId() {
        return this.parentId;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Integer getMessageReferenceType() {
        return this.messageReferenceType;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getChannelRtcRegion() {
        return this.channelRtcRegion;
    }

    @NotNull
    public final List<ChannelId> component16() {
        return this.ackChannelIds;
    }

    /* JADX INFO: renamed from: component17-wUX8bhU, reason: not valid java name and from getter */
    public final UserId getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getUserUsername() {
        return this.userUsername;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getUserGlobalName() {
        return this.userGlobalName;
    }

    /* JADX INFO: renamed from: component2-N_6c4I0, reason: not valid java name and from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final Integer getUserDiscriminator() {
        return this.userDiscriminator;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getUserAvatar() {
        return this.userAvatar;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getUserGuildAvatar() {
        return this.userGuildAvatar;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getPlatformUserUsername() {
        return this.platformUserUsername;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final Integer getRelationshipType() {
        return this.relationshipType;
    }

    /* JADX INFO: renamed from: component25-qOKuAAo, reason: not valid java name and from getter */
    public final GuildId getGuildId() {
        return this.guildId;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getGuildName() {
        return this.guildName;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final String getGuildIcon() {
        return this.guildIcon;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final String getActivityInstanceId() {
        return this.activityInstanceId;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final Integer getActivityType() {
        return this.activityType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getMessageActivityType() {
        return this.messageActivityType;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final String getActivityName() {
        return this.activityName;
    }

    /* JADX INFO: renamed from: component31-UtIrSio, reason: not valid java name and from getter */
    public final ApplicationId getApplicationId() {
        return this.applicationId;
    }

    /* JADX INFO: renamed from: component32, reason: from getter */
    public final String getApplicationName() {
        return this.applicationName;
    }

    /* JADX INFO: renamed from: component33, reason: from getter */
    public final String getApplicationIcon() {
        return this.applicationIcon;
    }

    /* JADX INFO: renamed from: component34, reason: from getter */
    public final NotificationMessage getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component35, reason: from getter */
    public final String getStageInstanceTopic() {
        return this.stageInstanceTopic;
    }

    /* JADX INFO: renamed from: component36, reason: from getter */
    public final boolean getCanReply() {
        return this.canReply;
    }

    /* JADX INFO: renamed from: component37, reason: from getter */
    public final boolean getIsFromCurrentUser() {
        return this.isFromCurrentUser;
    }

    /* JADX INFO: renamed from: component38-wUX8bhU, reason: not valid java name and from getter */
    public final UserId getReceivingUserId() {
        return this.receivingUserId;
    }

    /* JADX INFO: renamed from: component39, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMessageApplicationName() {
        return this.messageApplicationName;
    }

    /* JADX INFO: renamed from: component40, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component41, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    /* JADX INFO: renamed from: component42, reason: from getter */
    public final String getNotificationChannel() {
        return this.notificationChannel;
    }

    /* JADX INFO: renamed from: component43, reason: from getter */
    public final String getTrackingType() {
        return this.trackingType;
    }

    /* JADX INFO: renamed from: component44, reason: from getter */
    public final String getDeeplink() {
        return this.deeplink;
    }

    /* JADX INFO: renamed from: component45, reason: from getter */
    public final Boolean getExpandSubtitle() {
        return this.expandSubtitle;
    }

    /* JADX INFO: renamed from: component46, reason: from getter */
    public final String getImageAttachmentUrl() {
        return this.imageAttachmentUrl;
    }

    /* JADX INFO: renamed from: component47, reason: from getter */
    public final String getErgoImageAttachmentUrl() {
        return this.ergoImageAttachmentUrl;
    }

    /* JADX INFO: renamed from: component48, reason: from getter */
    public final Integer getAttachmentTextVariant() {
        return this.attachmentTextVariant;
    }

    /* JADX INFO: renamed from: component49, reason: from getter */
    public final Integer getImageAttachmentCount() {
        return this.imageAttachmentCount;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getMessageType() {
        return this.messageType;
    }

    /* JADX INFO: renamed from: component50, reason: from getter */
    public final Integer getVideoAttachmentCount() {
        return this.videoAttachmentCount;
    }

    /* JADX INFO: renamed from: component51, reason: from getter */
    public final String getTimeReceived() {
        return this.timeReceived;
    }

    /* JADX INFO: renamed from: component52, reason: from getter */
    public final boolean getSilent() {
        return this.silent;
    }

    @NotNull
    public final Map<String, String> component53() {
        return this.userInfo;
    }

    /* JADX INFO: renamed from: component54, reason: from getter */
    public final boolean getAppDm() {
        return this.appDm;
    }

    /* JADX INFO: renamed from: component55, reason: from getter */
    public final String getNotifTypeId() {
        return this.notifTypeId;
    }

    /* JADX INFO: renamed from: component56, reason: from getter */
    public final String getNotifInstanceId() {
        return this.notifInstanceId;
    }

    /* JADX INFO: renamed from: component57, reason: from getter */
    public final String getJoinId() {
        return this.joinId;
    }

    /* JADX INFO: renamed from: component58, reason: from getter */
    public final String getMentionType() {
        return this.mentionType;
    }

    /* JADX INFO: renamed from: component59, reason: from getter */
    public final String getAppState() {
        return this.appState;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getMessageContent() {
        return this.messageContent;
    }

    /* JADX INFO: renamed from: component60, reason: from getter */
    public final String getInviteGuildName() {
        return this.inviteGuildName;
    }

    /* JADX INFO: renamed from: component61, reason: from getter */
    public final String getInviteChannelName() {
        return this.inviteChannelName;
    }

    /* JADX INFO: renamed from: component62, reason: from getter */
    public final Integer getInviteTitleVariant() {
        return this.inviteTitleVariant;
    }

    /* JADX INFO: renamed from: component63, reason: from getter */
    public final String getPollQuestion() {
        return this.pollQuestion;
    }

    /* JADX INFO: renamed from: component64, reason: from getter */
    public final long getSentAtMillis() {
        return this.sentAtMillis;
    }

    /* JADX INFO: renamed from: component65, reason: from getter */
    public final boolean getIsSpoilerChannel() {
        return this.isSpoilerChannel;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Long getMessageFlags() {
        return this.messageFlags;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getChannelType() {
        return this.channelType;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getChannelName() {
        return this.channelName;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-kb5oZcE, reason: not valid java name */
    public final NotificationData m1088copykb5oZcE(@NotNull String type, String messageId, Integer messageActivityType, String messageApplicationName, Integer messageType, String messageContent, Long messageFlags, Integer channelType, String channelName, ChannelId channelId, String channelIcon, String parentName, ChannelId parentId, Integer messageReferenceType, String channelRtcRegion, @NotNull List<ChannelId> ackChannelIds, UserId userId, String userUsername, String userGlobalName, Integer userDiscriminator, String userAvatar, String userGuildAvatar, String platformUserUsername, Integer relationshipType, GuildId guildId, String guildName, String guildIcon, String activityInstanceId, Integer activityType, String activityName, ApplicationId applicationId, String applicationName, String applicationIcon, NotificationMessage message, String stageInstanceTopic, boolean canReply, boolean isFromCurrentUser, UserId receivingUserId, String title, String subtitle, String iconUrl, String notificationChannel, String trackingType, String deeplink, Boolean expandSubtitle, String imageAttachmentUrl, String ergoImageAttachmentUrl, Integer attachmentTextVariant, Integer imageAttachmentCount, Integer videoAttachmentCount, String timeReceived, boolean silent, @NotNull Map<String, String> userInfo, boolean appDm, String notifTypeId, String notifInstanceId, String joinId, String mentionType, String appState, String inviteGuildName, String inviteChannelName, Integer inviteTitleVariant, String pollQuestion, long sentAtMillis, boolean isSpoilerChannel) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(ackChannelIds, "ackChannelIds");
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
        return new NotificationData(type, messageId, messageActivityType, messageApplicationName, messageType, messageContent, messageFlags, channelType, channelName, channelId, channelIcon, parentName, parentId, messageReferenceType, channelRtcRegion, ackChannelIds, userId, userUsername, userGlobalName, userDiscriminator, userAvatar, userGuildAvatar, platformUserUsername, relationshipType, guildId, guildName, guildIcon, activityInstanceId, activityType, activityName, applicationId, applicationName, applicationIcon, message, stageInstanceTopic, canReply, isFromCurrentUser, receivingUserId, title, subtitle, iconUrl, notificationChannel, trackingType, deeplink, expandSubtitle, imageAttachmentUrl, ergoImageAttachmentUrl, attachmentTextVariant, imageAttachmentCount, videoAttachmentCount, timeReceived, silent, userInfo, appDm, notifTypeId, notifInstanceId, joinId, mentionType, appState, inviteGuildName, inviteChannelName, inviteTitleVariant, pollQuestion, sentAtMillis, isSpoilerChannel, null);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0021  */
    public boolean equals(Object other) {
        boolean zM1160equalsimpl0;
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationData)) {
            return false;
        }
        NotificationData notificationData = (NotificationData) other;
        if (!Intrinsics.areEqual(this.type, notificationData.type)) {
            return false;
        }
        String str = this.messageId;
        String str2 = notificationData.messageId;
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
        return zM1160equalsimpl0 && Intrinsics.areEqual(this.messageActivityType, notificationData.messageActivityType) && Intrinsics.areEqual(this.messageApplicationName, notificationData.messageApplicationName) && Intrinsics.areEqual(this.messageType, notificationData.messageType) && Intrinsics.areEqual(this.messageContent, notificationData.messageContent) && Intrinsics.areEqual(this.messageFlags, notificationData.messageFlags) && Intrinsics.areEqual(this.channelType, notificationData.channelType) && Intrinsics.areEqual(this.channelName, notificationData.channelName) && Intrinsics.areEqual(this.channelId, notificationData.channelId) && Intrinsics.areEqual(this.channelIcon, notificationData.channelIcon) && Intrinsics.areEqual(this.parentName, notificationData.parentName) && Intrinsics.areEqual(this.parentId, notificationData.parentId) && Intrinsics.areEqual(this.messageReferenceType, notificationData.messageReferenceType) && Intrinsics.areEqual(this.channelRtcRegion, notificationData.channelRtcRegion) && Intrinsics.areEqual(this.ackChannelIds, notificationData.ackChannelIds) && Intrinsics.areEqual(this.userId, notificationData.userId) && Intrinsics.areEqual(this.userUsername, notificationData.userUsername) && Intrinsics.areEqual(this.userGlobalName, notificationData.userGlobalName) && Intrinsics.areEqual(this.userDiscriminator, notificationData.userDiscriminator) && Intrinsics.areEqual(this.userAvatar, notificationData.userAvatar) && Intrinsics.areEqual(this.userGuildAvatar, notificationData.userGuildAvatar) && Intrinsics.areEqual(this.platformUserUsername, notificationData.platformUserUsername) && Intrinsics.areEqual(this.relationshipType, notificationData.relationshipType) && Intrinsics.areEqual(this.guildId, notificationData.guildId) && Intrinsics.areEqual(this.guildName, notificationData.guildName) && Intrinsics.areEqual(this.guildIcon, notificationData.guildIcon) && Intrinsics.areEqual(this.activityInstanceId, notificationData.activityInstanceId) && Intrinsics.areEqual(this.activityType, notificationData.activityType) && Intrinsics.areEqual(this.activityName, notificationData.activityName) && Intrinsics.areEqual(this.applicationId, notificationData.applicationId) && Intrinsics.areEqual(this.applicationName, notificationData.applicationName) && Intrinsics.areEqual(this.applicationIcon, notificationData.applicationIcon) && Intrinsics.areEqual(this.message, notificationData.message) && Intrinsics.areEqual(this.stageInstanceTopic, notificationData.stageInstanceTopic) && this.canReply == notificationData.canReply && this.isFromCurrentUser == notificationData.isFromCurrentUser && Intrinsics.areEqual(this.receivingUserId, notificationData.receivingUserId) && Intrinsics.areEqual(this.title, notificationData.title) && Intrinsics.areEqual(this.subtitle, notificationData.subtitle) && Intrinsics.areEqual(this.iconUrl, notificationData.iconUrl) && Intrinsics.areEqual(this.notificationChannel, notificationData.notificationChannel) && Intrinsics.areEqual(this.trackingType, notificationData.trackingType) && Intrinsics.areEqual(this.deeplink, notificationData.deeplink) && Intrinsics.areEqual(this.expandSubtitle, notificationData.expandSubtitle) && Intrinsics.areEqual(this.imageAttachmentUrl, notificationData.imageAttachmentUrl) && Intrinsics.areEqual(this.ergoImageAttachmentUrl, notificationData.ergoImageAttachmentUrl) && Intrinsics.areEqual(this.attachmentTextVariant, notificationData.attachmentTextVariant) && Intrinsics.areEqual(this.imageAttachmentCount, notificationData.imageAttachmentCount) && Intrinsics.areEqual(this.videoAttachmentCount, notificationData.videoAttachmentCount) && Intrinsics.areEqual(this.timeReceived, notificationData.timeReceived) && this.silent == notificationData.silent && Intrinsics.areEqual(this.userInfo, notificationData.userInfo) && this.appDm == notificationData.appDm && Intrinsics.areEqual(this.notifTypeId, notificationData.notifTypeId) && Intrinsics.areEqual(this.notifInstanceId, notificationData.notifInstanceId) && Intrinsics.areEqual(this.joinId, notificationData.joinId) && Intrinsics.areEqual(this.mentionType, notificationData.mentionType) && Intrinsics.areEqual(this.appState, notificationData.appState) && Intrinsics.areEqual(this.inviteGuildName, notificationData.inviteGuildName) && Intrinsics.areEqual(this.inviteChannelName, notificationData.inviteChannelName) && Intrinsics.areEqual(this.inviteTitleVariant, notificationData.inviteTitleVariant) && Intrinsics.areEqual(this.pollQuestion, notificationData.pollQuestion) && this.sentAtMillis == notificationData.sentAtMillis && this.isSpoilerChannel == notificationData.isSpoilerChannel;
    }

    @NotNull
    public final List<ChannelId> getAckChannelIds() {
        return this.ackChannelIds;
    }

    public final String getActivityInstanceId() {
        return this.activityInstanceId;
    }

    public final String getActivityName() {
        return this.activityName;
    }

    public final Integer getActivityType() {
        return this.activityType;
    }

    public final boolean getAppDm() {
        return this.appDm;
    }

    public final String getAppState() {
        return this.appState;
    }

    public final String getApplicationIcon() {
        return this.applicationIcon;
    }

    /* JADX INFO: renamed from: getApplicationId-UtIrSio, reason: not valid java name */
    public final ApplicationId m1089getApplicationIdUtIrSio() {
        return this.applicationId;
    }

    public final String getApplicationName() {
        return this.applicationName;
    }

    public final Integer getAttachmentTextVariant() {
        return this.attachmentTextVariant;
    }

    public final boolean getCanReply() {
        return this.canReply;
    }

    public final String getChannelIcon() {
        return this.channelIcon;
    }

    /* JADX INFO: renamed from: getChannelId-qMVnFVQ, reason: not valid java name */
    public final ChannelId m1090getChannelIdqMVnFVQ() {
        return this.channelId;
    }

    public final String getChannelName() {
        return this.channelName;
    }

    public final String getChannelRtcRegion() {
        return this.channelRtcRegion;
    }

    public final Integer getChannelType() {
        return this.channelType;
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    public final String getErgoImageAttachmentUrl() {
        return this.ergoImageAttachmentUrl;
    }

    public final Boolean getExpandSubtitle() {
        return this.expandSubtitle;
    }

    public final String getGuildIcon() {
        return this.guildIcon;
    }

    /* JADX INFO: renamed from: getGuildId-qOKuAAo, reason: not valid java name */
    public final GuildId m1091getGuildIdqOKuAAo() {
        return this.guildId;
    }

    public final String getGuildName() {
        return this.guildName;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final Integer getImageAttachmentCount() {
        return this.imageAttachmentCount;
    }

    public final String getImageAttachmentUrl() {
        return this.imageAttachmentUrl;
    }

    public final String getInviteChannelName() {
        return this.inviteChannelName;
    }

    public final String getInviteGuildName() {
        return this.inviteGuildName;
    }

    public final Integer getInviteTitleVariant() {
        return this.inviteTitleVariant;
    }

    public final String getJoinId() {
        return this.joinId;
    }

    public final String getMentionType() {
        return this.mentionType;
    }

    public final NotificationMessage getMessage() {
        return this.message;
    }

    public final Integer getMessageActivityType() {
        return this.messageActivityType;
    }

    public final String getMessageApplicationName() {
        return this.messageApplicationName;
    }

    public final String getMessageContent() {
        return this.messageContent;
    }

    public final Long getMessageFlags() {
        return this.messageFlags;
    }

    /* JADX INFO: renamed from: getMessageId-N_6c4I0, reason: not valid java name */
    public final String m1092getMessageIdN_6c4I0() {
        return this.messageId;
    }

    public final Integer getMessageReferenceType() {
        return this.messageReferenceType;
    }

    public final Integer getMessageType() {
        return this.messageType;
    }

    public final String getNotifInstanceId() {
        return this.notifInstanceId;
    }

    public final String getNotifTypeId() {
        return this.notifTypeId;
    }

    public final String getNotificationChannel() {
        return this.notificationChannel;
    }

    /* JADX INFO: renamed from: getParentId-qMVnFVQ, reason: not valid java name */
    public final ChannelId m1093getParentIdqMVnFVQ() {
        return this.parentId;
    }

    public final String getParentName() {
        return this.parentName;
    }

    public final String getPlatformUserUsername() {
        return this.platformUserUsername;
    }

    public final String getPollQuestion() {
        return this.pollQuestion;
    }

    /* JADX INFO: renamed from: getReceivingUserId-wUX8bhU, reason: not valid java name */
    public final UserId m1094getReceivingUserIdwUX8bhU() {
        return this.receivingUserId;
    }

    public final Integer getRelationshipType() {
        return this.relationshipType;
    }

    public final long getSentAtMillis() {
        return this.sentAtMillis;
    }

    public final boolean getSilent() {
        return this.silent;
    }

    public final String getStageInstanceTopic() {
        return this.stageInstanceTopic;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTimeReceived() {
        return this.timeReceived;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTrackingType() {
        return this.trackingType;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public final String getUserAvatar() {
        return this.userAvatar;
    }

    public final Integer getUserDiscriminator() {
        return this.userDiscriminator;
    }

    public final String getUserGlobalName() {
        return this.userGlobalName;
    }

    public final String getUserGuildAvatar() {
        return this.userGuildAvatar;
    }

    /* JADX INFO: renamed from: getUserId-wUX8bhU, reason: not valid java name */
    public final UserId m1095getUserIdwUX8bhU() {
        return this.userId;
    }

    @NotNull
    public final Map<String, String> getUserInfo() {
        return this.userInfo;
    }

    public final String getUserUsername() {
        return this.userUsername;
    }

    public final Integer getVideoAttachmentCount() {
        return this.videoAttachmentCount;
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        String str = this.messageId;
        int iM1161hashCodeimpl = (iHashCode + (str == null ? 0 : MessageId.m1161hashCodeimpl(str))) * 31;
        Integer num = this.messageActivityType;
        int iHashCode2 = (iM1161hashCodeimpl + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.messageApplicationName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.messageType;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.messageContent;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l6 = this.messageFlags;
        int iHashCode6 = (iHashCode5 + (l6 == null ? 0 : l6.hashCode())) * 31;
        Integer num3 = this.channelType;
        int iHashCode7 = (iHashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str4 = this.channelName;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        ChannelId channelId = this.channelId;
        int iM1135hashCodeimpl = (iHashCode8 + (channelId == null ? 0 : ChannelId.m1135hashCodeimpl(channelId.m1139unboximpl()))) * 31;
        String str5 = this.channelIcon;
        int iHashCode9 = (iM1135hashCodeimpl + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.parentName;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        ChannelId channelId2 = this.parentId;
        int iM1135hashCodeimpl2 = (iHashCode10 + (channelId2 == null ? 0 : ChannelId.m1135hashCodeimpl(channelId2.m1139unboximpl()))) * 31;
        Integer num4 = this.messageReferenceType;
        int iHashCode11 = (iM1135hashCodeimpl2 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str7 = this.channelRtcRegion;
        int iF = e.f(this.ackChannelIds, (iHashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31, 31);
        UserId userId = this.userId;
        int iM1213hashCodeimpl = (iF + (userId == null ? 0 : UserId.m1213hashCodeimpl(userId.m1217unboximpl()))) * 31;
        String str8 = this.userUsername;
        int iHashCode12 = (iM1213hashCodeimpl + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.userGlobalName;
        int iHashCode13 = (iHashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Integer num5 = this.userDiscriminator;
        int iHashCode14 = (iHashCode13 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str10 = this.userAvatar;
        int iHashCode15 = (iHashCode14 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.userGuildAvatar;
        int iHashCode16 = (iHashCode15 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.platformUserUsername;
        int iHashCode17 = (iHashCode16 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Integer num6 = this.relationshipType;
        int iHashCode18 = (iHashCode17 + (num6 == null ? 0 : num6.hashCode())) * 31;
        GuildId guildId = this.guildId;
        int iM1148hashCodeimpl = (iHashCode18 + (guildId == null ? 0 : GuildId.m1148hashCodeimpl(guildId.m1152unboximpl()))) * 31;
        String str13 = this.guildName;
        int iHashCode19 = (iM1148hashCodeimpl + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.guildIcon;
        int iHashCode20 = (iHashCode19 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.activityInstanceId;
        int iHashCode21 = (iHashCode20 + (str15 == null ? 0 : str15.hashCode())) * 31;
        Integer num7 = this.activityType;
        int iHashCode22 = (iHashCode21 + (num7 == null ? 0 : num7.hashCode())) * 31;
        String str16 = this.activityName;
        int iHashCode23 = (iHashCode22 + (str16 == null ? 0 : str16.hashCode())) * 31;
        ApplicationId applicationId = this.applicationId;
        int iM1122hashCodeimpl = (iHashCode23 + (applicationId == null ? 0 : ApplicationId.m1122hashCodeimpl(applicationId.m1126unboximpl()))) * 31;
        String str17 = this.applicationName;
        int iHashCode24 = (iM1122hashCodeimpl + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.applicationIcon;
        int iHashCode25 = (iHashCode24 + (str18 == null ? 0 : str18.hashCode())) * 31;
        NotificationMessage notificationMessage = this.message;
        int iHashCode26 = (iHashCode25 + (notificationMessage == null ? 0 : notificationMessage.hashCode())) * 31;
        String str19 = this.stageInstanceTopic;
        int iG = a.g(a.g((iHashCode26 + (str19 == null ? 0 : str19.hashCode())) * 31, 31, this.canReply), 31, this.isFromCurrentUser);
        UserId userId2 = this.receivingUserId;
        int iM1213hashCodeimpl2 = (iG + (userId2 == null ? 0 : UserId.m1213hashCodeimpl(userId2.m1217unboximpl()))) * 31;
        String str20 = this.title;
        int iHashCode27 = (iM1213hashCodeimpl2 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.subtitle;
        int iHashCode28 = (iHashCode27 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.iconUrl;
        int iHashCode29 = (iHashCode28 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.notificationChannel;
        int iHashCode30 = (iHashCode29 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.trackingType;
        int iHashCode31 = (iHashCode30 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.deeplink;
        int iHashCode32 = (iHashCode31 + (str25 == null ? 0 : str25.hashCode())) * 31;
        Boolean bool = this.expandSubtitle;
        int iHashCode33 = (iHashCode32 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str26 = this.imageAttachmentUrl;
        int iHashCode34 = (iHashCode33 + (str26 == null ? 0 : str26.hashCode())) * 31;
        String str27 = this.ergoImageAttachmentUrl;
        int iHashCode35 = (iHashCode34 + (str27 == null ? 0 : str27.hashCode())) * 31;
        Integer num8 = this.attachmentTextVariant;
        int iHashCode36 = (iHashCode35 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.imageAttachmentCount;
        int iHashCode37 = (iHashCode36 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.videoAttachmentCount;
        int iHashCode38 = (iHashCode37 + (num10 == null ? 0 : num10.hashCode())) * 31;
        String str28 = this.timeReceived;
        int iG2 = a.g((this.userInfo.hashCode() + a.g((iHashCode38 + (str28 == null ? 0 : str28.hashCode())) * 31, 31, this.silent)) * 31, 31, this.appDm);
        String str29 = this.notifTypeId;
        int iHashCode39 = (iG2 + (str29 == null ? 0 : str29.hashCode())) * 31;
        String str30 = this.notifInstanceId;
        int iHashCode40 = (iHashCode39 + (str30 == null ? 0 : str30.hashCode())) * 31;
        String str31 = this.joinId;
        int iHashCode41 = (iHashCode40 + (str31 == null ? 0 : str31.hashCode())) * 31;
        String str32 = this.mentionType;
        int iHashCode42 = (iHashCode41 + (str32 == null ? 0 : str32.hashCode())) * 31;
        String str33 = this.appState;
        int iHashCode43 = (iHashCode42 + (str33 == null ? 0 : str33.hashCode())) * 31;
        String str34 = this.inviteGuildName;
        int iHashCode44 = (iHashCode43 + (str34 == null ? 0 : str34.hashCode())) * 31;
        String str35 = this.inviteChannelName;
        int iHashCode45 = (iHashCode44 + (str35 == null ? 0 : str35.hashCode())) * 31;
        Integer num11 = this.inviteTitleVariant;
        int iHashCode46 = (iHashCode45 + (num11 == null ? 0 : num11.hashCode())) * 31;
        String str36 = this.pollQuestion;
        return Boolean.hashCode(this.isSpoilerChannel) + a.h(this.sentAtMillis, (iHashCode46 + (str36 != null ? str36.hashCode() : 0)) * 31, 31);
    }

    public final boolean isFromCurrentUser() {
        return this.isFromCurrentUser;
    }

    public final boolean isSpoilerChannel() {
        return this.isSpoilerChannel;
    }

    @NotNull
    public String toString() {
        String str = this.type;
        String str2 = this.messageId;
        String strM1163toStringimpl = str2 == null ? "null" : MessageId.m1163toStringimpl(str2);
        Integer num = this.messageActivityType;
        String str3 = this.messageApplicationName;
        Integer num2 = this.messageType;
        String str4 = this.messageContent;
        Long l6 = this.messageFlags;
        Integer num3 = this.channelType;
        String str5 = this.channelName;
        ChannelId channelId = this.channelId;
        String str6 = this.channelIcon;
        String str7 = this.parentName;
        ChannelId channelId2 = this.parentId;
        Integer num4 = this.messageReferenceType;
        String str8 = this.channelRtcRegion;
        List<ChannelId> list = this.ackChannelIds;
        UserId userId = this.userId;
        String str9 = this.userUsername;
        String str10 = this.userGlobalName;
        Integer num5 = this.userDiscriminator;
        String str11 = this.userAvatar;
        String str12 = this.userGuildAvatar;
        String str13 = this.platformUserUsername;
        Integer num6 = this.relationshipType;
        GuildId guildId = this.guildId;
        String str14 = this.guildName;
        String str15 = this.guildIcon;
        String str16 = this.activityInstanceId;
        Integer num7 = this.activityType;
        String str17 = this.activityName;
        ApplicationId applicationId = this.applicationId;
        String str18 = this.applicationName;
        String str19 = this.applicationIcon;
        NotificationMessage notificationMessage = this.message;
        String str20 = this.stageInstanceTopic;
        boolean z5 = this.canReply;
        boolean z6 = this.isFromCurrentUser;
        UserId userId2 = this.receivingUserId;
        String str21 = this.title;
        String str22 = this.subtitle;
        String str23 = this.iconUrl;
        String str24 = this.notificationChannel;
        String str25 = this.trackingType;
        String str26 = this.deeplink;
        Boolean bool = this.expandSubtitle;
        String str27 = this.imageAttachmentUrl;
        String str28 = this.ergoImageAttachmentUrl;
        Integer num8 = this.attachmentTextVariant;
        Integer num9 = this.imageAttachmentCount;
        Integer num10 = this.videoAttachmentCount;
        String str29 = this.timeReceived;
        boolean z7 = this.silent;
        Map<String, String> map = this.userInfo;
        boolean z10 = this.appDm;
        String str30 = this.notifTypeId;
        String str31 = this.notifInstanceId;
        String str32 = this.joinId;
        String str33 = this.mentionType;
        String str34 = this.appState;
        String str35 = this.inviteGuildName;
        String str36 = this.inviteChannelName;
        Integer num11 = this.inviteTitleVariant;
        String str37 = this.pollQuestion;
        long j = this.sentAtMillis;
        boolean z11 = this.isSpoilerChannel;
        StringBuilder sbU = e.u("NotificationData(type=", str, ", messageId=", strM1163toStringimpl, ", messageActivityType=");
        b.r(num, ", messageApplicationName=", str3, ", messageType=", sbU);
        b.r(num2, ", messageContent=", str4, ", messageFlags=", sbU);
        sbU.append(l6);
        sbU.append(", channelType=");
        sbU.append(num3);
        sbU.append(", channelName=");
        sbU.append(str5);
        sbU.append(", channelId=");
        sbU.append(channelId);
        sbU.append(", channelIcon=");
        e.A(sbU, str6, ", parentName=", str7, ", parentId=");
        sbU.append(channelId2);
        sbU.append(", messageReferenceType=");
        sbU.append(num4);
        sbU.append(", channelRtcRegion=");
        sbU.append(str8);
        sbU.append(", ackChannelIds=");
        sbU.append(list);
        sbU.append(", userId=");
        sbU.append(userId);
        sbU.append(", userUsername=");
        sbU.append(str9);
        sbU.append(", userGlobalName=");
        a.r(num5, str10, ", userDiscriminator=", ", userAvatar=", sbU);
        e.A(sbU, str11, ", userGuildAvatar=", str12, ", platformUserUsername=");
        a.r(num6, str13, ", relationshipType=", ", guildId=", sbU);
        sbU.append(guildId);
        sbU.append(", guildName=");
        sbU.append(str14);
        sbU.append(", guildIcon=");
        e.A(sbU, str15, ", activityInstanceId=", str16, ", activityType=");
        b.r(num7, ", activityName=", str17, ", applicationId=", sbU);
        sbU.append(applicationId);
        sbU.append(", applicationName=");
        sbU.append(str18);
        sbU.append(", applicationIcon=");
        sbU.append(str19);
        sbU.append(", message=");
        sbU.append(notificationMessage);
        sbU.append(", stageInstanceTopic=");
        sbU.append(str20);
        sbU.append(", canReply=");
        sbU.append(z5);
        sbU.append(", isFromCurrentUser=");
        sbU.append(z6);
        sbU.append(", receivingUserId=");
        sbU.append(userId2);
        sbU.append(", title=");
        e.A(sbU, str21, ", subtitle=", str22, ", iconUrl=");
        e.A(sbU, str23, ", notificationChannel=", str24, ", trackingType=");
        e.A(sbU, str25, ", deeplink=", str26, ", expandSubtitle=");
        sbU.append(bool);
        sbU.append(", imageAttachmentUrl=");
        sbU.append(str27);
        sbU.append(", ergoImageAttachmentUrl=");
        a.r(num8, str28, ", attachmentTextVariant=", ", imageAttachmentCount=", sbU);
        b.s(sbU, num9, ", videoAttachmentCount=", num10, ", timeReceived=");
        sbU.append(str29);
        sbU.append(", silent=");
        sbU.append(z7);
        sbU.append(", userInfo=");
        sbU.append(map);
        sbU.append(", appDm=");
        sbU.append(z10);
        sbU.append(", notifTypeId=");
        e.A(sbU, str30, ", notifInstanceId=", str31, ", joinId=");
        e.A(sbU, str32, ", mentionType=", str33, ", appState=");
        e.A(sbU, str34, ", inviteGuildName=", str35, ", inviteChannelName=");
        a.r(num11, str36, ", inviteTitleVariant=", ", pollQuestion=", sbU);
        sbU.append(str37);
        sbU.append(", sentAtMillis=");
        sbU.append(j);
        sbU.append(", isSpoilerChannel=");
        sbU.append(z11);
        sbU.append(")");
        return sbU.toString();
    }

    public /* synthetic */ NotificationData(String str, String str2, Integer num, String str3, Integer num2, String str4, Long l6, Integer num3, String str5, ChannelId channelId, String str6, String str7, ChannelId channelId2, Integer num4, String str8, List list, UserId userId, String str9, String str10, Integer num5, String str11, String str12, String str13, Integer num6, GuildId guildId, String str14, String str15, String str16, Integer num7, String str17, ApplicationId applicationId, String str18, String str19, NotificationMessage notificationMessage, String str20, boolean z5, boolean z6, UserId userId2, String str21, String str22, String str23, String str24, String str25, String str26, Boolean bool, String str27, String str28, Integer num8, Integer num9, Integer num10, String str29, boolean z7, Map map, boolean z10, String str30, String str31, String str32, String str33, String str34, String str35, String str36, Integer num11, String str37, long j, boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, num, str3, num2, str4, l6, num3, str5, channelId, str6, str7, channelId2, num4, str8, list, userId, str9, str10, num5, str11, str12, str13, num6, guildId, str14, str15, str16, num7, str17, applicationId, str18, str19, notificationMessage, str20, z5, z6, userId2, str21, str22, str23, str24, str25, str26, bool, str27, str28, num8, num9, num10, str29, z7, map, z10, str30, str31, str32, str33, str34, str35, str36, num11, str37, j, z11);
    }

    private NotificationData(int i7, int i10, int i11, String str, String str2, Integer num, String str3, Integer num2, String str4, Long l6, Integer num3, String str5, ChannelId channelId, String str6, String str7, ChannelId channelId2, Integer num4, String str8, List list, UserId userId, String str9, String str10, Integer num5, String str11, String str12, String str13, Integer num6, GuildId guildId, String str14, String str15, String str16, Integer num7, String str17, ApplicationId applicationId, String str18, String str19, NotificationMessage notificationMessage, String str20, boolean z5, boolean z6, UserId userId2, String str21, String str22, String str23, String str24, String str25, String str26, Boolean bool, String str27, String str28, Integer num8, Integer num9, Integer num10, String str29, boolean z7, Map map, boolean z10, String str30, String str31, String str32, String str33, String str34, String str35, String str36, Integer num11, String str37, long j, boolean z11, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i7 & 1)) {
            e1.k(new int[]{i7, i10, i11}, new int[]{1, 0, 0}, NotificationData$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.type = str;
        if ((i7 & 2) == 0) {
            this.messageId = null;
        } else {
            this.messageId = str2;
        }
        if ((i7 & 4) == 0) {
            this.messageActivityType = null;
        } else {
            this.messageActivityType = num;
        }
        if ((i7 & 8) == 0) {
            this.messageApplicationName = null;
        } else {
            this.messageApplicationName = str3;
        }
        if ((i7 & 16) == 0) {
            this.messageType = null;
        } else {
            this.messageType = num2;
        }
        if ((i7 & 32) == 0) {
            this.messageContent = null;
        } else {
            this.messageContent = str4;
        }
        if ((i7 & 64) == 0) {
            this.messageFlags = null;
        } else {
            this.messageFlags = l6;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 0) {
            this.channelType = null;
        } else {
            this.channelType = num3;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 0) {
            this.channelName = null;
        } else {
            this.channelName = str5;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 0) {
            this.channelId = null;
        } else {
            this.channelId = channelId;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) == 0) {
            this.channelIcon = null;
        } else {
            this.channelIcon = str6;
        }
        if ((i7 & RecyclerView.ItemAnimator.FLAG_MOVED) == 0) {
            this.parentName = null;
        } else {
            this.parentName = str7;
        }
        if ((i7 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) == 0) {
            this.parentId = null;
        } else {
            this.parentId = channelId2;
        }
        if ((i7 & 8192) == 0) {
            this.messageReferenceType = null;
        } else {
            this.messageReferenceType = num4;
        }
        if ((i7 & 16384) == 0) {
            this.channelRtcRegion = null;
        } else {
            this.channelRtcRegion = str8;
        }
        this.ackChannelIds = (i7 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) == 0 ? n0.f14659d : list;
        if ((i7 & 65536) == 0) {
            this.userId = null;
        } else {
            this.userId = userId;
        }
        if ((i7 & 131072) == 0) {
            this.userUsername = null;
        } else {
            this.userUsername = str9;
        }
        if ((i7 & 262144) == 0) {
            this.userGlobalName = null;
        } else {
            this.userGlobalName = str10;
        }
        if ((i7 & 524288) == 0) {
            this.userDiscriminator = null;
        } else {
            this.userDiscriminator = num5;
        }
        if ((i7 & 1048576) == 0) {
            this.userAvatar = null;
        } else {
            this.userAvatar = str11;
        }
        if ((i7 & 2097152) == 0) {
            this.userGuildAvatar = null;
        } else {
            this.userGuildAvatar = str12;
        }
        if ((i7 & 4194304) == 0) {
            this.platformUserUsername = null;
        } else {
            this.platformUserUsername = str13;
        }
        if ((i7 & 8388608) == 0) {
            this.relationshipType = null;
        } else {
            this.relationshipType = num6;
        }
        if ((i7 & PointerEventHelper.X_FLAG_SUPPORTS_HOVER) == 0) {
            this.guildId = null;
        } else {
            this.guildId = guildId;
        }
        if ((i7 & 33554432) == 0) {
            this.guildName = null;
        } else {
            this.guildName = str14;
        }
        if ((i7 & 67108864) == 0) {
            this.guildIcon = null;
        } else {
            this.guildIcon = str15;
        }
        if ((i7 & 134217728) == 0) {
            this.activityInstanceId = null;
        } else {
            this.activityInstanceId = str16;
        }
        if ((i7 & 268435456) == 0) {
            this.activityType = null;
        } else {
            this.activityType = num7;
        }
        if ((i7 & 536870912) == 0) {
            this.activityName = null;
        } else {
            this.activityName = str17;
        }
        if ((i7 & 1073741824) == 0) {
            this.applicationId = null;
        } else {
            this.applicationId = applicationId;
        }
        if ((i7 & Integer.MIN_VALUE) == 0) {
            this.applicationName = null;
        } else {
            this.applicationName = str18;
        }
        if ((i10 & 1) == 0) {
            this.applicationIcon = null;
        } else {
            this.applicationIcon = str19;
        }
        if ((i10 & 2) == 0) {
            this.message = null;
        } else {
            this.message = notificationMessage;
        }
        if ((i10 & 4) == 0) {
            this.stageInstanceTopic = null;
        } else {
            this.stageInstanceTopic = str20;
        }
        if ((i10 & 8) == 0) {
            this.canReply = false;
        } else {
            this.canReply = z5;
        }
        if ((i10 & 16) == 0) {
            this.isFromCurrentUser = false;
        } else {
            this.isFromCurrentUser = z6;
        }
        if ((i10 & 32) == 0) {
            this.receivingUserId = null;
        } else {
            this.receivingUserId = userId2;
        }
        if ((i10 & 64) == 0) {
            this.title = null;
        } else {
            this.title = str21;
        }
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 0) {
            this.subtitle = null;
        } else {
            this.subtitle = str22;
        }
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 0) {
            this.iconUrl = null;
        } else {
            this.iconUrl = str23;
        }
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 0) {
            this.notificationChannel = null;
        } else {
            this.notificationChannel = str24;
        }
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) == 0) {
            this.trackingType = null;
        } else {
            this.trackingType = str25;
        }
        if ((i10 & RecyclerView.ItemAnimator.FLAG_MOVED) == 0) {
            this.deeplink = null;
        } else {
            this.deeplink = str26;
        }
        this.expandSubtitle = (i10 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) == 0 ? Boolean.FALSE : bool;
        if ((i10 & 8192) == 0) {
            this.imageAttachmentUrl = null;
        } else {
            this.imageAttachmentUrl = str27;
        }
        if ((i10 & 16384) == 0) {
            this.ergoImageAttachmentUrl = null;
        } else {
            this.ergoImageAttachmentUrl = str28;
        }
        if ((i10 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) == 0) {
            this.attachmentTextVariant = null;
        } else {
            this.attachmentTextVariant = num8;
        }
        if ((i10 & 65536) == 0) {
            this.imageAttachmentCount = null;
        } else {
            this.imageAttachmentCount = num9;
        }
        if ((i10 & 131072) == 0) {
            this.videoAttachmentCount = null;
        } else {
            this.videoAttachmentCount = num10;
        }
        if ((i10 & 262144) == 0) {
            this.timeReceived = null;
        } else {
            this.timeReceived = str29;
        }
        if ((i10 & 524288) == 0) {
            this.silent = false;
        } else {
            this.silent = z7;
        }
        this.userInfo = (i10 & 1048576) == 0 ? w0.d() : map;
        if ((i10 & 2097152) == 0) {
            this.appDm = false;
        } else {
            this.appDm = z10;
        }
        if ((i10 & 4194304) == 0) {
            this.notifTypeId = null;
        } else {
            this.notifTypeId = str30;
        }
        if ((i10 & 8388608) == 0) {
            this.notifInstanceId = null;
        } else {
            this.notifInstanceId = str31;
        }
        if ((i10 & PointerEventHelper.X_FLAG_SUPPORTS_HOVER) == 0) {
            this.joinId = null;
        } else {
            this.joinId = str32;
        }
        if ((i10 & 33554432) == 0) {
            this.mentionType = null;
        } else {
            this.mentionType = str33;
        }
        if ((i10 & 67108864) == 0) {
            this.appState = null;
        } else {
            this.appState = str34;
        }
        if ((i10 & 134217728) == 0) {
            this.inviteGuildName = null;
        } else {
            this.inviteGuildName = str35;
        }
        if ((i10 & 268435456) == 0) {
            this.inviteChannelName = null;
        } else {
            this.inviteChannelName = str36;
        }
        if ((i10 & 536870912) == 0) {
            this.inviteTitleVariant = null;
        } else {
            this.inviteTitleVariant = num11;
        }
        if ((i10 & 1073741824) == 0) {
            this.pollQuestion = null;
        } else {
            this.pollQuestion = str37;
        }
        this.sentAtMillis = (i10 & Integer.MIN_VALUE) == 0 ? System.currentTimeMillis() : j;
        if ((i11 & 1) == 0) {
            this.isSpoilerChannel = false;
        } else {
            this.isSpoilerChannel = z11;
        }
    }

    private NotificationData(String type, String str, Integer num, String str2, Integer num2, String str3, Long l6, Integer num3, String str4, ChannelId channelId, String str5, String str6, ChannelId channelId2, Integer num4, String str7, List<ChannelId> ackChannelIds, UserId userId, String str8, String str9, Integer num5, String str10, String str11, String str12, Integer num6, GuildId guildId, String str13, String str14, String str15, Integer num7, String str16, ApplicationId applicationId, String str17, String str18, NotificationMessage notificationMessage, String str19, boolean z5, boolean z6, UserId userId2, String str20, String str21, String str22, String str23, String str24, String str25, Boolean bool, String str26, String str27, Integer num8, Integer num9, Integer num10, String str28, boolean z7, Map<String, String> userInfo, boolean z10, String str29, String str30, String str31, String str32, String str33, String str34, String str35, Integer num11, String str36, long j, boolean z11) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(ackChannelIds, "ackChannelIds");
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
        this.type = type;
        this.messageId = str;
        this.messageActivityType = num;
        this.messageApplicationName = str2;
        this.messageType = num2;
        this.messageContent = str3;
        this.messageFlags = l6;
        this.channelType = num3;
        this.channelName = str4;
        this.channelId = channelId;
        this.channelIcon = str5;
        this.parentName = str6;
        this.parentId = channelId2;
        this.messageReferenceType = num4;
        this.channelRtcRegion = str7;
        this.ackChannelIds = ackChannelIds;
        this.userId = userId;
        this.userUsername = str8;
        this.userGlobalName = str9;
        this.userDiscriminator = num5;
        this.userAvatar = str10;
        this.userGuildAvatar = str11;
        this.platformUserUsername = str12;
        this.relationshipType = num6;
        this.guildId = guildId;
        this.guildName = str13;
        this.guildIcon = str14;
        this.activityInstanceId = str15;
        this.activityType = num7;
        this.activityName = str16;
        this.applicationId = applicationId;
        this.applicationName = str17;
        this.applicationIcon = str18;
        this.message = notificationMessage;
        this.stageInstanceTopic = str19;
        this.canReply = z5;
        this.isFromCurrentUser = z6;
        this.receivingUserId = userId2;
        this.title = str20;
        this.subtitle = str21;
        this.iconUrl = str22;
        this.notificationChannel = str23;
        this.trackingType = str24;
        this.deeplink = str25;
        this.expandSubtitle = bool;
        this.imageAttachmentUrl = str26;
        this.ergoImageAttachmentUrl = str27;
        this.attachmentTextVariant = num8;
        this.imageAttachmentCount = num9;
        this.videoAttachmentCount = num10;
        this.timeReceived = str28;
        this.silent = z7;
        this.userInfo = userInfo;
        this.appDm = z10;
        this.notifTypeId = str29;
        this.notifInstanceId = str30;
        this.joinId = str31;
        this.mentionType = str32;
        this.appState = str33;
        this.inviteGuildName = str34;
        this.inviteChannelName = str35;
        this.inviteTitleVariant = num11;
        this.pollQuestion = str36;
        this.sentAtMillis = j;
        this.isSpoilerChannel = z11;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NotificationData(String str, String str2, Integer num, String str3, Integer num2, String str4, Long l6, Integer num3, String str5, ChannelId channelId, String str6, String str7, ChannelId channelId2, Integer num4, String str8, List list, UserId userId, String str9, String str10, Integer num5, String str11, String str12, String str13, Integer num6, GuildId guildId, String str14, String str15, String str16, Integer num7, String str17, ApplicationId applicationId, String str18, String str19, NotificationMessage notificationMessage, String str20, boolean z5, boolean z6, UserId userId2, String str21, String str22, String str23, String str24, String str25, String str26, Boolean bool, String str27, String str28, Integer num8, Integer num9, Integer num10, String str29, boolean z7, Map map, boolean z10, String str30, String str31, String str32, String str33, String str34, String str35, String str36, Integer num11, String str37, long j, boolean z11, int i7, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        String str38 = (i7 & 2) != 0 ? null : str2;
        Integer num12 = (i7 & 4) != 0 ? null : num;
        String str39 = (i7 & 8) != 0 ? null : str3;
        Integer num13 = (i7 & 16) != 0 ? null : num2;
        String str40 = (i7 & 32) != 0 ? null : str4;
        Long l7 = (i7 & 64) != 0 ? null : l6;
        Integer num14 = (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? null : num3;
        String str41 = (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : str5;
        ChannelId channelId3 = (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? null : channelId;
        String str42 = (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? null : str6;
        String str43 = (i7 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? null : str7;
        ChannelId channelId4 = (i7 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : channelId2;
        Integer num15 = (i7 & 8192) != 0 ? null : num4;
        String str44 = (i7 & 16384) != 0 ? null : str8;
        List list2 = (i7 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? n0.f14659d : list;
        UserId userId3 = (i7 & 65536) != 0 ? null : userId;
        String str45 = (i7 & 131072) != 0 ? null : str9;
        String str46 = (i7 & 262144) != 0 ? null : str10;
        Integer num16 = (i7 & 524288) != 0 ? null : num5;
        String str47 = (i7 & 1048576) != 0 ? null : str11;
        String str48 = (i7 & 2097152) != 0 ? null : str12;
        String str49 = (i7 & 4194304) != 0 ? null : str13;
        Integer num17 = (i7 & 8388608) != 0 ? null : num6;
        GuildId guildId2 = (i7 & PointerEventHelper.X_FLAG_SUPPORTS_HOVER) != 0 ? null : guildId;
        String str50 = (i7 & 33554432) != 0 ? null : str14;
        String str51 = (i7 & 67108864) != 0 ? null : str15;
        String str52 = (i7 & 134217728) != 0 ? null : str16;
        Integer num18 = (i7 & 268435456) != 0 ? null : num7;
        String str53 = (i7 & 536870912) != 0 ? null : str17;
        ApplicationId applicationId2 = (i7 & 1073741824) != 0 ? null : applicationId;
        String str54 = (i7 & Integer.MIN_VALUE) != 0 ? null : str18;
        String str55 = (i10 & 1) != 0 ? null : str19;
        NotificationMessage notificationMessage2 = (i10 & 2) != 0 ? null : notificationMessage;
        String str56 = (i10 & 4) != 0 ? null : str20;
        boolean z12 = (i10 & 8) != 0 ? false : z5;
        boolean z13 = (i10 & 16) != 0 ? false : z6;
        UserId userId4 = (i10 & 32) != 0 ? null : userId2;
        String str57 = (i10 & 64) != 0 ? null : str21;
        String str58 = str54;
        String str59 = (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? null : str22;
        String str60 = (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : str23;
        String str61 = (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? null : str24;
        String str62 = (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? null : str25;
        String str63 = (i10 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? null : str26;
        Boolean bool2 = (i10 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? Boolean.FALSE : bool;
        String str64 = (i10 & 8192) != 0 ? null : str27;
        String str65 = (i10 & 16384) != 0 ? null : str28;
        Integer num19 = (i10 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? null : num8;
        Integer num20 = (i10 & 65536) != 0 ? null : num9;
        Integer num21 = (i10 & 131072) != 0 ? null : num10;
        String str66 = (i10 & 262144) != 0 ? null : str29;
        boolean z14 = (i10 & 524288) != 0 ? false : z7;
        Map mapD = (i10 & 1048576) != 0 ? w0.d() : map;
        boolean z15 = (i10 & 2097152) != 0 ? false : z10;
        String str67 = (i10 & 4194304) != 0 ? null : str30;
        String str68 = (i10 & 8388608) != 0 ? null : str31;
        String str69 = (i10 & PointerEventHelper.X_FLAG_SUPPORTS_HOVER) != 0 ? null : str32;
        String str70 = (i10 & 33554432) != 0 ? null : str33;
        String str71 = (i10 & 67108864) != 0 ? null : str34;
        String str72 = (i10 & 134217728) != 0 ? null : str35;
        String str73 = (i10 & 268435456) != 0 ? null : str36;
        Integer num22 = (i10 & 536870912) != 0 ? null : num11;
        String str74 = (i10 & 1073741824) != 0 ? null : str37;
        Integer num23 = num12;
        String str75 = str39;
        Integer num24 = num13;
        String str76 = str40;
        Long l10 = l7;
        Integer num25 = num14;
        String str77 = str41;
        ChannelId channelId5 = channelId3;
        String str78 = str42;
        String str79 = str43;
        ChannelId channelId6 = channelId4;
        Integer num26 = num15;
        this(str, str38, num23, str75, num24, str76, l10, num25, str77, channelId5, str78, str79, channelId6, num26, str44, list2, userId3, str45, str46, num16, str47, str48, str49, num17, guildId2, str50, str51, str52, num18, str53, applicationId2, str58, str55, notificationMessage2, str56, z12, z13, userId4, str57, str59, str60, str61, str62, str63, bool2, str64, str65, num19, num20, num21, str66, z14, mapD, z15, str67, str68, str69, str70, str71, str72, str73, num22, str74, (i10 & Integer.MIN_VALUE) != 0 ? System.currentTimeMillis() : j, (i11 & 1) == 0 ? z11 : false, null);
    }
}
