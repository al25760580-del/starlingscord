package com.discord.chat.bridge.codedlinks;

import a3.e;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.bridge.structurabletext.StructurableText;
import com.discord.chat.bridge.structurabletext.StructurableTextSerializer;
import com.discord.chat.presentation.list.a;
import com.discord.notifications.renderer.NotificationRenderer;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.ViewProps;
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

/* JADX INFO: loaded from: classes.dex */
@f
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\be\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00ad\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0004¬\u0001\u00ad\u0001B\u0087\u0004\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0001\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0003\u0010\"\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0003\u0010.\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010/\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0003\u00103\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b6\u00107BÕ\u0003\b\u0010\u0012\u0006\u00108\u001a\u00020\u0005\u0012\u0006\u00109\u001a\u00020\u0005\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010 \u001a\u0004\u0018\u00010\u000b\u0012\b\u0010!\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010$\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010%\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010(\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010+\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010,\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010-\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010/\u001a\u0004\u0018\u00010\u0005\u0012\b\u00100\u001a\u0004\u0018\u00010\u0005\u0012\b\u00101\u001a\u0004\u0018\u00010\u000b\u0012\b\u00102\u001a\u0004\u0018\u00010\u000b\u0012\b\u00103\u001a\u0004\u0018\u00010\u0005\u0012\b\u00104\u001a\u0004\u0018\u00010\u000b\u0012\b\u00105\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010:\u001a\u0004\u0018\u00010;¢\u0006\u0004\b6\u0010<J\t\u0010q\u001a\u00020\u0005HÆ\u0003J\t\u0010r\u001a\u00020\u0005HÆ\u0003J\t\u0010s\u001a\u00020\bHÆ\u0003J\t\u0010t\u001a\u00020\u0005HÆ\u0003J\t\u0010u\u001a\u00020\u000bHÆ\u0003J\t\u0010v\u001a\u00020\rHÆ\u0003J\u0010\u0010w\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010HJ\u0010\u0010x\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010HJ\u0010\u0010y\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010HJ\u000b\u0010z\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010{\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010|\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010}\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010~\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0010\u0010\u007f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010HJ\u0011\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0002\u0010SJ\f\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\f\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\f\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\f\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0011\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0002\u0010SJ\f\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\f\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\f\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0011\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010HJ\u0011\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0002\u0010SJ\f\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\f\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0011\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010HJ\u0011\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010HJ\f\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0011\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0002\u0010SJ\u0011\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010HJ\f\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\f\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\f\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0011\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010HJ\u0011\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010HJ\u0011\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010HJ\f\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\f\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0011\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010HJ\f\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\f\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0094\u0004\u0010\u009d\u0001\u001a\u00020\u00002\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\"\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010.\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010/\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u00103\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0003\u0010\u009e\u0001J\u0016\u0010\u009f\u0001\u001a\u00020\u00182\n\u0010 \u0001\u001a\u0005\u0018\u00010¡\u0001HÖ\u0003J\n\u0010¢\u0001\u001a\u00020\u0005HÖ\u0001J\n\u0010£\u0001\u001a\u00020\u000bHÖ\u0001J-\u0010¤\u0001\u001a\u00030¥\u00012\u0007\u0010¦\u0001\u001a\u00020\u00002\b\u0010§\u0001\u001a\u00030¨\u00012\b\u0010©\u0001\u001a\u00030ª\u0001H\u0001¢\u0006\u0003\b«\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010>R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0014\u0010\t\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010>R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\n\n\u0002\u0010I\u001a\u0004\bG\u0010HR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\n\n\u0002\u0010I\u001a\u0004\bJ\u0010HR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\n\n\u0002\u0010I\u001a\u0004\bK\u0010HR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bL\u0010DR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bM\u0010DR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bN\u0010DR\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bO\u0010DR\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bP\u0010DR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\n\n\u0002\u0010I\u001a\u0004\bQ\u0010HR\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0096\u0004¢\u0006\n\n\u0002\u0010T\u001a\u0004\bR\u0010SR\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bU\u0010DR\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bV\u0010DR\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bW\u0010XR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bY\u0010DR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u0018X\u0096\u0004¢\u0006\n\n\u0002\u0010T\u001a\u0004\bZ\u0010SR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b[\u0010DR\u0016\u0010 \u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010DR\u0016\u0010!\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b]\u0010DR\u0018\u0010\"\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\n\n\u0002\u0010I\u001a\u0004\b^\u0010HR\u0018\u0010#\u001a\u0004\u0018\u00010\u0018X\u0096\u0004¢\u0006\n\n\u0002\u0010T\u001a\u0004\b#\u0010SR\u0016\u0010$\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b_\u0010DR\u0016\u0010%\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b`\u0010DR\u0018\u0010&\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\n\n\u0002\u0010I\u001a\u0004\ba\u0010HR\u0018\u0010'\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\n\n\u0002\u0010I\u001a\u0004\bb\u0010HR\u0016\u0010(\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bc\u0010DR\u0018\u0010)\u001a\u0004\u0018\u00010\u0018X\u0096\u0004¢\u0006\n\n\u0002\u0010T\u001a\u0004\bd\u0010SR\u0018\u0010*\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\n\n\u0002\u0010I\u001a\u0004\be\u0010HR\u0016\u0010+\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bf\u0010DR\u0016\u0010,\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bg\u0010DR\u0016\u0010-\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bh\u0010DR\u0018\u0010.\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\n\n\u0002\u0010I\u001a\u0004\bi\u0010HR\u0018\u0010/\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\n\n\u0002\u0010I\u001a\u0004\bj\u0010HR\u0018\u00100\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\n\n\u0002\u0010I\u001a\u0004\bk\u0010HR\u0016\u00101\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bl\u0010DR\u0016\u00102\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bm\u0010DR\u0018\u00103\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\n\n\u0002\u0010I\u001a\u0004\bn\u0010HR\u0016\u00104\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bo\u0010DR\u0016\u00105\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bp\u0010D¨\u0006®\u0001"}, d2 = {"Lcom/discord/chat/bridge/codedlinks/GuildEventInviteEmbedImpl;", "Lcom/discord/chat/bridge/codedlinks/CodedLinkEmbed;", "Lcom/discord/chat/bridge/codedlinks/GuildEventInviteEmbed;", "Lcom/discord/chat/bridge/codedlinks/GuildInviteExtendedEmbed;", ViewProps.BACKGROUND_COLOR, "", ViewProps.BORDER_COLOR, "extendedType", "Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;", "headerColor", "headerText", "", "type", "Lcom/discord/chat/bridge/codedlinks/InviteType;", "acceptLabelBackgroundColor", "acceptLabelBorderColor", "acceptLabelColor", "acceptLabelIcon", "acceptLabelText", "badgeCount", "badgeIcon", "bodyText", "bodyTextColor", "canBeAccepted", "", "channelIcon", NotificationRenderer.CHANNEL_NAME, "content", "Lcom/discord/chat/bridge/structurabletext/StructurableText;", "creatorAvatar", "embedCanBeTapped", "guildIcon", "guildName", "headerIcon", "headerTextColor", "isRsvped", "memberText", "onlineText", "resolvingGradientEnd", "resolvingGradientStart", "secondaryActionIcon", "splashHasRadialGradient", "splashOpacity", "splashUrl", "inviteSplash", "subtitle", "subtitleColor", "thumbnailBackgroundColor", "thumbnailCornerRadius", "thumbnailText", "thumbnailUrl", "titleColor", "titleText", "badgeIconUrl", "<init>", "(IILcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;ILjava/lang/String;Lcom/discord/chat/bridge/codedlinks/InviteType;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "seen1", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IIIILcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;ILjava/lang/String;Lcom/discord/chat/bridge/codedlinks/InviteType;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getBackgroundColor", "()I", "getBorderColor", "getExtendedType", "()Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;", "getHeaderColor", "getHeaderText", "()Ljava/lang/String;", "getType", "()Lcom/discord/chat/bridge/codedlinks/InviteType;", "getAcceptLabelBackgroundColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAcceptLabelBorderColor", "getAcceptLabelColor", "getAcceptLabelIcon", "getAcceptLabelText", "getBadgeCount", "getBadgeIcon", "getBodyText", "getBodyTextColor", "getCanBeAccepted", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getChannelIcon", "getChannelName", "getContent", "()Lcom/discord/chat/bridge/structurabletext/StructurableText;", "getCreatorAvatar", "getEmbedCanBeTapped", "getGuildIcon", "getGuildName", "getHeaderIcon", "getHeaderTextColor", "getMemberText", "getOnlineText", "getResolvingGradientEnd", "getResolvingGradientStart", "getSecondaryActionIcon", "getSplashHasRadialGradient", "getSplashOpacity", "getSplashUrl", "getInviteSplash", "getSubtitle", "getSubtitleColor", "getThumbnailBackgroundColor", "getThumbnailCornerRadius", "getThumbnailText", "getThumbnailUrl", "getTitleColor", "getTitleText", "getBadgeIconUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "component41", "component42", "component43", "component44", "copy", "(IILcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;ILjava/lang/String;Lcom/discord/chat/bridge/codedlinks/InviteType;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/discord/chat/bridge/codedlinks/GuildEventInviteEmbedImpl;", "equals", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class GuildEventInviteEmbedImpl extends CodedLinkEmbed implements GuildEventInviteEmbed, GuildInviteExtendedEmbed {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final Integer acceptLabelBackgroundColor;
    private final Integer acceptLabelBorderColor;
    private final Integer acceptLabelColor;
    private final String acceptLabelIcon;
    private final String acceptLabelText;
    private final int backgroundColor;
    private final String badgeCount;
    private final String badgeIcon;
    private final String badgeIconUrl;
    private final String bodyText;
    private final Integer bodyTextColor;
    private final int borderColor;
    private final Boolean canBeAccepted;
    private final String channelIcon;
    private final String channelName;
    private final StructurableText content;
    private final String creatorAvatar;
    private final Boolean embedCanBeTapped;

    @NotNull
    private final CodedLinkExtendedType extendedType;
    private final String guildIcon;
    private final String guildName;
    private final int headerColor;
    private final String headerIcon;

    @NotNull
    private final String headerText;
    private final Integer headerTextColor;
    private final String inviteSplash;
    private final Boolean isRsvped;
    private final String memberText;
    private final String onlineText;
    private final Integer resolvingGradientEnd;
    private final Integer resolvingGradientStart;
    private final String secondaryActionIcon;
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

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/codedlinks/GuildEventInviteEmbedImpl$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/codedlinks/GuildEventInviteEmbedImpl;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return GuildEventInviteEmbedImpl$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ GuildEventInviteEmbedImpl(int i7, int i10, int i11, int i12, CodedLinkExtendedType codedLinkExtendedType, int i13, String str, InviteType inviteType, Integer num, Integer num2, Integer num3, String str2, String str3, String str4, String str5, String str6, Integer num4, Boolean bool, String str7, String str8, StructurableText structurableText, String str9, Boolean bool2, String str10, String str11, String str12, Integer num5, Boolean bool3, String str13, String str14, Integer num6, Integer num7, String str15, Boolean bool4, Integer num8, String str16, String str17, String str18, Integer num9, Integer num10, Integer num11, String str19, String str20, Integer num12, String str21, String str22, SerializationConstructorMarker serializationConstructorMarker) {
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (59 != (i7 & 59)) {
            e1.k(new int[]{i7, i10}, new int[]{59, 0}, GuildEventInviteEmbedImpl$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        super(defaultConstructorMarker);
        this.backgroundColor = i11;
        this.borderColor = i12;
        if ((i7 & 4) == 0) {
            this.extendedType = CodedLinkExtendedType.GUILD_SCHEDULED_EVENT;
        } else {
            this.extendedType = codedLinkExtendedType;
        }
        this.headerColor = i13;
        this.headerText = str;
        this.type = inviteType;
        if ((i7 & 64) == 0) {
            this.acceptLabelBackgroundColor = null;
        } else {
            this.acceptLabelBackgroundColor = num;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 0) {
            this.acceptLabelBorderColor = null;
        } else {
            this.acceptLabelBorderColor = num2;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 0) {
            this.acceptLabelColor = null;
        } else {
            this.acceptLabelColor = num3;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 0) {
            this.acceptLabelIcon = null;
        } else {
            this.acceptLabelIcon = str2;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) == 0) {
            this.acceptLabelText = null;
        } else {
            this.acceptLabelText = str3;
        }
        if ((i7 & RecyclerView.ItemAnimator.FLAG_MOVED) == 0) {
            this.badgeCount = null;
        } else {
            this.badgeCount = str4;
        }
        if ((i7 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) == 0) {
            this.badgeIcon = null;
        } else {
            this.badgeIcon = str5;
        }
        if ((i7 & 8192) == 0) {
            this.bodyText = null;
        } else {
            this.bodyText = str6;
        }
        if ((i7 & 16384) == 0) {
            this.bodyTextColor = null;
        } else {
            this.bodyTextColor = num4;
        }
        if ((32768 & i7) == 0) {
            this.canBeAccepted = null;
        } else {
            this.canBeAccepted = bool;
        }
        if ((65536 & i7) == 0) {
            this.channelIcon = null;
        } else {
            this.channelIcon = str7;
        }
        if ((131072 & i7) == 0) {
            this.channelName = null;
        } else {
            this.channelName = str8;
        }
        if ((262144 & i7) == 0) {
            this.content = null;
        } else {
            this.content = structurableText;
        }
        if ((524288 & i7) == 0) {
            this.creatorAvatar = null;
        } else {
            this.creatorAvatar = str9;
        }
        if ((1048576 & i7) == 0) {
            this.embedCanBeTapped = null;
        } else {
            this.embedCanBeTapped = bool2;
        }
        if ((2097152 & i7) == 0) {
            this.guildIcon = null;
        } else {
            this.guildIcon = str10;
        }
        if ((4194304 & i7) == 0) {
            this.guildName = null;
        } else {
            this.guildName = str11;
        }
        if ((8388608 & i7) == 0) {
            this.headerIcon = null;
        } else {
            this.headerIcon = str12;
        }
        if ((16777216 & i7) == 0) {
            this.headerTextColor = null;
        } else {
            this.headerTextColor = num5;
        }
        if ((33554432 & i7) == 0) {
            this.isRsvped = null;
        } else {
            this.isRsvped = bool3;
        }
        if ((67108864 & i7) == 0) {
            this.memberText = null;
        } else {
            this.memberText = str13;
        }
        if ((134217728 & i7) == 0) {
            this.onlineText = null;
        } else {
            this.onlineText = str14;
        }
        if ((268435456 & i7) == 0) {
            this.resolvingGradientEnd = null;
        } else {
            this.resolvingGradientEnd = num6;
        }
        if ((536870912 & i7) == 0) {
            this.resolvingGradientStart = null;
        } else {
            this.resolvingGradientStart = num7;
        }
        if ((1073741824 & i7) == 0) {
            this.secondaryActionIcon = null;
        } else {
            this.secondaryActionIcon = str15;
        }
        if ((i7 & Integer.MIN_VALUE) == 0) {
            this.splashHasRadialGradient = null;
        } else {
            this.splashHasRadialGradient = bool4;
        }
        if ((i10 & 1) == 0) {
            this.splashOpacity = null;
        } else {
            this.splashOpacity = num8;
        }
        if ((i10 & 2) == 0) {
            this.splashUrl = null;
        } else {
            this.splashUrl = str16;
        }
        if ((i10 & 4) == 0) {
            this.inviteSplash = null;
        } else {
            this.inviteSplash = str17;
        }
        if ((i10 & 8) == 0) {
            this.subtitle = null;
        } else {
            this.subtitle = str18;
        }
        if ((i10 & 16) == 0) {
            this.subtitleColor = null;
        } else {
            this.subtitleColor = num9;
        }
        if ((i10 & 32) == 0) {
            this.thumbnailBackgroundColor = null;
        } else {
            this.thumbnailBackgroundColor = num10;
        }
        if ((i10 & 64) == 0) {
            this.thumbnailCornerRadius = null;
        } else {
            this.thumbnailCornerRadius = num11;
        }
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 0) {
            this.thumbnailText = null;
        } else {
            this.thumbnailText = str19;
        }
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 0) {
            this.thumbnailUrl = null;
        } else {
            this.thumbnailUrl = str20;
        }
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 0) {
            this.titleColor = null;
        } else {
            this.titleColor = num12;
        }
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) == 0) {
            this.titleText = null;
        } else {
            this.titleText = str21;
        }
        if ((i10 & RecyclerView.ItemAnimator.FLAG_MOVED) == 0) {
            this.badgeIconUrl = null;
        } else {
            this.badgeIconUrl = str22;
        }
    }

    public static final /* synthetic */ void write$Self$chat_release(GuildEventInviteEmbedImpl self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.l(0, self.getBackgroundColor(), serialDesc);
        output.l(1, self.getBorderColor(), serialDesc);
        if (output.u(serialDesc, 2) || self.getExtendedType() != CodedLinkExtendedType.GUILD_SCHEDULED_EVENT) {
            output.g(serialDesc, 2, CodedLinkExtendedType.Serializer.INSTANCE, self.getExtendedType());
        }
        output.l(3, self.getHeaderColor(), serialDesc);
        output.q(serialDesc, 4, self.getHeaderText());
        output.g(serialDesc, 5, InviteType.Serializer.INSTANCE, self.getType());
        if (output.u(serialDesc, 6) || self.getAcceptLabelBackgroundColor() != null) {
            output.r(serialDesc, 6, m0.f17573a, self.getAcceptLabelBackgroundColor());
        }
        if (output.u(serialDesc, 7) || self.getAcceptLabelBorderColor() != null) {
            output.r(serialDesc, 7, m0.f17573a, self.getAcceptLabelBorderColor());
        }
        if (output.u(serialDesc, 8) || self.getAcceptLabelColor() != null) {
            output.r(serialDesc, 8, m0.f17573a, self.getAcceptLabelColor());
        }
        if (output.u(serialDesc, 9) || self.getAcceptLabelIcon() != null) {
            output.r(serialDesc, 9, s1.f17602a, self.getAcceptLabelIcon());
        }
        if (output.u(serialDesc, 10) || self.getAcceptLabelText() != null) {
            output.r(serialDesc, 10, s1.f17602a, self.getAcceptLabelText());
        }
        if (output.u(serialDesc, 11) || self.getBadgeCount() != null) {
            output.r(serialDesc, 11, s1.f17602a, self.getBadgeCount());
        }
        if (output.u(serialDesc, 12) || self.getBadgeIcon() != null) {
            output.r(serialDesc, 12, s1.f17602a, self.getBadgeIcon());
        }
        if (output.u(serialDesc, 13) || self.getBodyText() != null) {
            output.r(serialDesc, 13, s1.f17602a, self.getBodyText());
        }
        if (output.u(serialDesc, 14) || self.getBodyTextColor() != null) {
            output.r(serialDesc, 14, m0.f17573a, self.getBodyTextColor());
        }
        if (output.u(serialDesc, 15) || self.getCanBeAccepted() != null) {
            output.r(serialDesc, 15, g.f17537a, self.getCanBeAccepted());
        }
        if (output.u(serialDesc, 16) || self.getChannelIcon() != null) {
            output.r(serialDesc, 16, s1.f17602a, self.getChannelIcon());
        }
        if (output.u(serialDesc, 17) || self.getChannelName() != null) {
            output.r(serialDesc, 17, s1.f17602a, self.getChannelName());
        }
        if (output.u(serialDesc, 18) || self.getContent() != null) {
            output.r(serialDesc, 18, StructurableTextSerializer.INSTANCE, self.getContent());
        }
        if (output.u(serialDesc, 19) || self.getCreatorAvatar() != null) {
            output.r(serialDesc, 19, s1.f17602a, self.getCreatorAvatar());
        }
        if (output.u(serialDesc, 20) || self.getEmbedCanBeTapped() != null) {
            output.r(serialDesc, 20, g.f17537a, self.getEmbedCanBeTapped());
        }
        if (output.u(serialDesc, 21) || self.getGuildIcon() != null) {
            output.r(serialDesc, 21, s1.f17602a, self.getGuildIcon());
        }
        if (output.u(serialDesc, 22) || self.getGuildName() != null) {
            output.r(serialDesc, 22, s1.f17602a, self.getGuildName());
        }
        if (output.u(serialDesc, 23) || self.getHeaderIcon() != null) {
            output.r(serialDesc, 23, s1.f17602a, self.getHeaderIcon());
        }
        if (output.u(serialDesc, 24) || self.getHeaderTextColor() != null) {
            output.r(serialDesc, 24, m0.f17573a, self.getHeaderTextColor());
        }
        if (output.u(serialDesc, 25) || self.isRsvped() != null) {
            output.r(serialDesc, 25, g.f17537a, self.isRsvped());
        }
        if (output.u(serialDesc, 26) || self.getMemberText() != null) {
            output.r(serialDesc, 26, s1.f17602a, self.getMemberText());
        }
        if (output.u(serialDesc, 27) || self.getOnlineText() != null) {
            output.r(serialDesc, 27, s1.f17602a, self.getOnlineText());
        }
        if (output.u(serialDesc, 28) || self.getResolvingGradientEnd() != null) {
            output.r(serialDesc, 28, m0.f17573a, self.getResolvingGradientEnd());
        }
        if (output.u(serialDesc, 29) || self.getResolvingGradientStart() != null) {
            output.r(serialDesc, 29, m0.f17573a, self.getResolvingGradientStart());
        }
        if (output.u(serialDesc, 30) || self.getSecondaryActionIcon() != null) {
            output.r(serialDesc, 30, s1.f17602a, self.getSecondaryActionIcon());
        }
        if (output.u(serialDesc, 31) || self.getSplashHasRadialGradient() != null) {
            output.r(serialDesc, 31, g.f17537a, self.getSplashHasRadialGradient());
        }
        if (output.u(serialDesc, 32) || self.getSplashOpacity() != null) {
            output.r(serialDesc, 32, m0.f17573a, self.getSplashOpacity());
        }
        if (output.u(serialDesc, 33) || self.getSplashUrl() != null) {
            output.r(serialDesc, 33, s1.f17602a, self.getSplashUrl());
        }
        if (output.u(serialDesc, 34) || self.getInviteSplash() != null) {
            output.r(serialDesc, 34, s1.f17602a, self.getInviteSplash());
        }
        if (output.u(serialDesc, 35) || self.getSubtitle() != null) {
            output.r(serialDesc, 35, s1.f17602a, self.getSubtitle());
        }
        if (output.u(serialDesc, 36) || self.getSubtitleColor() != null) {
            output.r(serialDesc, 36, m0.f17573a, self.getSubtitleColor());
        }
        if (output.u(serialDesc, 37) || self.getThumbnailBackgroundColor() != null) {
            output.r(serialDesc, 37, m0.f17573a, self.getThumbnailBackgroundColor());
        }
        if (output.u(serialDesc, 38) || self.getThumbnailCornerRadius() != null) {
            output.r(serialDesc, 38, m0.f17573a, self.getThumbnailCornerRadius());
        }
        if (output.u(serialDesc, 39) || self.getThumbnailText() != null) {
            output.r(serialDesc, 39, s1.f17602a, self.getThumbnailText());
        }
        if (output.u(serialDesc, 40) || self.getThumbnailUrl() != null) {
            output.r(serialDesc, 40, s1.f17602a, self.getThumbnailUrl());
        }
        if (output.u(serialDesc, 41) || self.getTitleColor() != null) {
            output.r(serialDesc, 41, m0.f17573a, self.getTitleColor());
        }
        if (output.u(serialDesc, 42) || self.getTitleText() != null) {
            output.r(serialDesc, 42, s1.f17602a, self.getTitleText());
        }
        if (!output.u(serialDesc, 43) && self.getBadgeIconUrl() == null) {
            return;
        }
        output.r(serialDesc, 43, s1.f17602a, self.getBadgeIconUrl());
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getAcceptLabelIcon() {
        return this.acceptLabelIcon;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getAcceptLabelText() {
        return this.acceptLabelText;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getBadgeCount() {
        return this.badgeCount;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getBadgeIcon() {
        return this.badgeIcon;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getBodyText() {
        return this.bodyText;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Integer getBodyTextColor() {
        return this.bodyTextColor;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Boolean getCanBeAccepted() {
        return this.canBeAccepted;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getChannelIcon() {
        return this.channelIcon;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getChannelName() {
        return this.channelName;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final StructurableText getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getBorderColor() {
        return this.borderColor;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getCreatorAvatar() {
        return this.creatorAvatar;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final Boolean getEmbedCanBeTapped() {
        return this.embedCanBeTapped;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getGuildIcon() {
        return this.guildIcon;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getGuildName() {
        return this.guildName;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getHeaderIcon() {
        return this.headerIcon;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final Integer getHeaderTextColor() {
        return this.headerTextColor;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final Boolean getIsRsvped() {
        return this.isRsvped;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final String getMemberText() {
        return this.memberText;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final String getOnlineText() {
        return this.onlineText;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final Integer getResolvingGradientEnd() {
        return this.resolvingGradientEnd;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final CodedLinkExtendedType getExtendedType() {
        return this.extendedType;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final Integer getResolvingGradientStart() {
        return this.resolvingGradientStart;
    }

    /* JADX INFO: renamed from: component31, reason: from getter */
    public final String getSecondaryActionIcon() {
        return this.secondaryActionIcon;
    }

    /* JADX INFO: renamed from: component32, reason: from getter */
    public final Boolean getSplashHasRadialGradient() {
        return this.splashHasRadialGradient;
    }

    /* JADX INFO: renamed from: component33, reason: from getter */
    public final Integer getSplashOpacity() {
        return this.splashOpacity;
    }

    /* JADX INFO: renamed from: component34, reason: from getter */
    public final String getSplashUrl() {
        return this.splashUrl;
    }

    /* JADX INFO: renamed from: component35, reason: from getter */
    public final String getInviteSplash() {
        return this.inviteSplash;
    }

    /* JADX INFO: renamed from: component36, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component37, reason: from getter */
    public final Integer getSubtitleColor() {
        return this.subtitleColor;
    }

    /* JADX INFO: renamed from: component38, reason: from getter */
    public final Integer getThumbnailBackgroundColor() {
        return this.thumbnailBackgroundColor;
    }

    /* JADX INFO: renamed from: component39, reason: from getter */
    public final Integer getThumbnailCornerRadius() {
        return this.thumbnailCornerRadius;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getHeaderColor() {
        return this.headerColor;
    }

    /* JADX INFO: renamed from: component40, reason: from getter */
    public final String getThumbnailText() {
        return this.thumbnailText;
    }

    /* JADX INFO: renamed from: component41, reason: from getter */
    public final String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    /* JADX INFO: renamed from: component42, reason: from getter */
    public final Integer getTitleColor() {
        return this.titleColor;
    }

    /* JADX INFO: renamed from: component43, reason: from getter */
    public final String getTitleText() {
        return this.titleText;
    }

    /* JADX INFO: renamed from: component44, reason: from getter */
    public final String getBadgeIconUrl() {
        return this.badgeIconUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getHeaderText() {
        return this.headerText;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final InviteType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getAcceptLabelBackgroundColor() {
        return this.acceptLabelBackgroundColor;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getAcceptLabelBorderColor() {
        return this.acceptLabelBorderColor;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Integer getAcceptLabelColor() {
        return this.acceptLabelColor;
    }

    @NotNull
    public final GuildEventInviteEmbedImpl copy(int backgroundColor, int borderColor, @NotNull CodedLinkExtendedType extendedType, int headerColor, @NotNull String headerText, @NotNull InviteType type, Integer acceptLabelBackgroundColor, Integer acceptLabelBorderColor, Integer acceptLabelColor, String acceptLabelIcon, String acceptLabelText, String badgeCount, String badgeIcon, String bodyText, Integer bodyTextColor, Boolean canBeAccepted, String channelIcon, String channelName, StructurableText content, String creatorAvatar, Boolean embedCanBeTapped, String guildIcon, String guildName, String headerIcon, Integer headerTextColor, Boolean isRsvped, String memberText, String onlineText, Integer resolvingGradientEnd, Integer resolvingGradientStart, String secondaryActionIcon, Boolean splashHasRadialGradient, Integer splashOpacity, String splashUrl, String inviteSplash, String subtitle, Integer subtitleColor, Integer thumbnailBackgroundColor, Integer thumbnailCornerRadius, String thumbnailText, String thumbnailUrl, Integer titleColor, String titleText, String badgeIconUrl) {
        Intrinsics.checkNotNullParameter(extendedType, "extendedType");
        Intrinsics.checkNotNullParameter(headerText, "headerText");
        Intrinsics.checkNotNullParameter(type, "type");
        return new GuildEventInviteEmbedImpl(backgroundColor, borderColor, extendedType, headerColor, headerText, type, acceptLabelBackgroundColor, acceptLabelBorderColor, acceptLabelColor, acceptLabelIcon, acceptLabelText, badgeCount, badgeIcon, bodyText, bodyTextColor, canBeAccepted, channelIcon, channelName, content, creatorAvatar, embedCanBeTapped, guildIcon, guildName, headerIcon, headerTextColor, isRsvped, memberText, onlineText, resolvingGradientEnd, resolvingGradientStart, secondaryActionIcon, splashHasRadialGradient, splashOpacity, splashUrl, inviteSplash, subtitle, subtitleColor, thumbnailBackgroundColor, thumbnailCornerRadius, thumbnailText, thumbnailUrl, titleColor, titleText, badgeIconUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GuildEventInviteEmbedImpl)) {
            return false;
        }
        GuildEventInviteEmbedImpl guildEventInviteEmbedImpl = (GuildEventInviteEmbedImpl) other;
        return this.backgroundColor == guildEventInviteEmbedImpl.backgroundColor && this.borderColor == guildEventInviteEmbedImpl.borderColor && this.extendedType == guildEventInviteEmbedImpl.extendedType && this.headerColor == guildEventInviteEmbedImpl.headerColor && Intrinsics.areEqual(this.headerText, guildEventInviteEmbedImpl.headerText) && this.type == guildEventInviteEmbedImpl.type && Intrinsics.areEqual(this.acceptLabelBackgroundColor, guildEventInviteEmbedImpl.acceptLabelBackgroundColor) && Intrinsics.areEqual(this.acceptLabelBorderColor, guildEventInviteEmbedImpl.acceptLabelBorderColor) && Intrinsics.areEqual(this.acceptLabelColor, guildEventInviteEmbedImpl.acceptLabelColor) && Intrinsics.areEqual(this.acceptLabelIcon, guildEventInviteEmbedImpl.acceptLabelIcon) && Intrinsics.areEqual(this.acceptLabelText, guildEventInviteEmbedImpl.acceptLabelText) && Intrinsics.areEqual(this.badgeCount, guildEventInviteEmbedImpl.badgeCount) && Intrinsics.areEqual(this.badgeIcon, guildEventInviteEmbedImpl.badgeIcon) && Intrinsics.areEqual(this.bodyText, guildEventInviteEmbedImpl.bodyText) && Intrinsics.areEqual(this.bodyTextColor, guildEventInviteEmbedImpl.bodyTextColor) && Intrinsics.areEqual(this.canBeAccepted, guildEventInviteEmbedImpl.canBeAccepted) && Intrinsics.areEqual(this.channelIcon, guildEventInviteEmbedImpl.channelIcon) && Intrinsics.areEqual(this.channelName, guildEventInviteEmbedImpl.channelName) && Intrinsics.areEqual(this.content, guildEventInviteEmbedImpl.content) && Intrinsics.areEqual(this.creatorAvatar, guildEventInviteEmbedImpl.creatorAvatar) && Intrinsics.areEqual(this.embedCanBeTapped, guildEventInviteEmbedImpl.embedCanBeTapped) && Intrinsics.areEqual(this.guildIcon, guildEventInviteEmbedImpl.guildIcon) && Intrinsics.areEqual(this.guildName, guildEventInviteEmbedImpl.guildName) && Intrinsics.areEqual(this.headerIcon, guildEventInviteEmbedImpl.headerIcon) && Intrinsics.areEqual(this.headerTextColor, guildEventInviteEmbedImpl.headerTextColor) && Intrinsics.areEqual(this.isRsvped, guildEventInviteEmbedImpl.isRsvped) && Intrinsics.areEqual(this.memberText, guildEventInviteEmbedImpl.memberText) && Intrinsics.areEqual(this.onlineText, guildEventInviteEmbedImpl.onlineText) && Intrinsics.areEqual(this.resolvingGradientEnd, guildEventInviteEmbedImpl.resolvingGradientEnd) && Intrinsics.areEqual(this.resolvingGradientStart, guildEventInviteEmbedImpl.resolvingGradientStart) && Intrinsics.areEqual(this.secondaryActionIcon, guildEventInviteEmbedImpl.secondaryActionIcon) && Intrinsics.areEqual(this.splashHasRadialGradient, guildEventInviteEmbedImpl.splashHasRadialGradient) && Intrinsics.areEqual(this.splashOpacity, guildEventInviteEmbedImpl.splashOpacity) && Intrinsics.areEqual(this.splashUrl, guildEventInviteEmbedImpl.splashUrl) && Intrinsics.areEqual(this.inviteSplash, guildEventInviteEmbedImpl.inviteSplash) && Intrinsics.areEqual(this.subtitle, guildEventInviteEmbedImpl.subtitle) && Intrinsics.areEqual(this.subtitleColor, guildEventInviteEmbedImpl.subtitleColor) && Intrinsics.areEqual(this.thumbnailBackgroundColor, guildEventInviteEmbedImpl.thumbnailBackgroundColor) && Intrinsics.areEqual(this.thumbnailCornerRadius, guildEventInviteEmbedImpl.thumbnailCornerRadius) && Intrinsics.areEqual(this.thumbnailText, guildEventInviteEmbedImpl.thumbnailText) && Intrinsics.areEqual(this.thumbnailUrl, guildEventInviteEmbedImpl.thumbnailUrl) && Intrinsics.areEqual(this.titleColor, guildEventInviteEmbedImpl.titleColor) && Intrinsics.areEqual(this.titleText, guildEventInviteEmbedImpl.titleText) && Intrinsics.areEqual(this.badgeIconUrl, guildEventInviteEmbedImpl.badgeIconUrl);
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

    @Override // com.discord.chat.bridge.codedlinks.GuildEventInviteEmbed
    public String getAcceptLabelIcon() {
        return this.acceptLabelIcon;
    }

    @Override // com.discord.chat.bridge.codedlinks.CodedLinkEmbed
    public String getAcceptLabelText() {
        return this.acceptLabelText;
    }

    @Override // com.discord.chat.bridge.codedlinks.CodedLinkEmbed
    public int getBackgroundColor() {
        return this.backgroundColor;
    }

    @Override // com.discord.chat.bridge.codedlinks.GuildEventInviteEmbed
    public String getBadgeCount() {
        return this.badgeCount;
    }

    @Override // com.discord.chat.bridge.codedlinks.GuildEventInviteEmbed
    public String getBadgeIcon() {
        return this.badgeIcon;
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

    @Override // com.discord.chat.bridge.codedlinks.GuildEventInviteEmbed
    public StructurableText getContent() {
        return this.content;
    }

    @Override // com.discord.chat.bridge.codedlinks.GuildEventInviteEmbed
    public String getCreatorAvatar() {
        return this.creatorAvatar;
    }

    @Override // com.discord.chat.bridge.codedlinks.CodedLinkEmbed
    public Boolean getEmbedCanBeTapped() {
        return this.embedCanBeTapped;
    }

    @Override // com.discord.chat.bridge.codedlinks.GuildInviteExtendedEmbed
    @NotNull
    public CodedLinkExtendedType getExtendedType() {
        return this.extendedType;
    }

    @Override // com.discord.chat.bridge.codedlinks.GuildInviteExtendedEmbed
    public String getGuildIcon() {
        return this.guildIcon;
    }

    @Override // com.discord.chat.bridge.codedlinks.GuildInviteExtendedEmbed
    public String getGuildName() {
        return this.guildName;
    }

    @Override // com.discord.chat.bridge.codedlinks.CodedLinkEmbed
    public int getHeaderColor() {
        return this.headerColor;
    }

    @Override // com.discord.chat.bridge.codedlinks.GuildInviteExtendedEmbed
    public String getHeaderIcon() {
        return this.headerIcon;
    }

    @Override // com.discord.chat.bridge.codedlinks.CodedLinkEmbed
    @NotNull
    public String getHeaderText() {
        return this.headerText;
    }

    @Override // com.discord.chat.bridge.codedlinks.GuildEventInviteEmbed
    public Integer getHeaderTextColor() {
        return this.headerTextColor;
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

    @Override // com.discord.chat.bridge.codedlinks.GuildEventInviteEmbed
    public String getSecondaryActionIcon() {
        return this.secondaryActionIcon;
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
        int iHashCode = (this.type.hashCode() + e.d(a.u(this.headerColor, (this.extendedType.hashCode() + a.u(this.borderColor, Integer.hashCode(this.backgroundColor) * 31, 31)) * 31, 31), 31, this.headerText)) * 31;
        Integer num = this.acceptLabelBackgroundColor;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.acceptLabelBorderColor;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.acceptLabelColor;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str = this.acceptLabelIcon;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.acceptLabelText;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.badgeCount;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.badgeIcon;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.bodyText;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num4 = this.bodyTextColor;
        int iHashCode10 = (iHashCode9 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Boolean bool = this.canBeAccepted;
        int iHashCode11 = (iHashCode10 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str6 = this.channelIcon;
        int iHashCode12 = (iHashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.channelName;
        int iHashCode13 = (iHashCode12 + (str7 == null ? 0 : str7.hashCode())) * 31;
        StructurableText structurableText = this.content;
        int iHashCode14 = (iHashCode13 + (structurableText == null ? 0 : structurableText.hashCode())) * 31;
        String str8 = this.creatorAvatar;
        int iHashCode15 = (iHashCode14 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Boolean bool2 = this.embedCanBeTapped;
        int iHashCode16 = (iHashCode15 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str9 = this.guildIcon;
        int iHashCode17 = (iHashCode16 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.guildName;
        int iHashCode18 = (iHashCode17 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.headerIcon;
        int iHashCode19 = (iHashCode18 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Integer num5 = this.headerTextColor;
        int iHashCode20 = (iHashCode19 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Boolean bool3 = this.isRsvped;
        int iHashCode21 = (iHashCode20 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str12 = this.memberText;
        int iHashCode22 = (iHashCode21 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.onlineText;
        int iHashCode23 = (iHashCode22 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Integer num6 = this.resolvingGradientEnd;
        int iHashCode24 = (iHashCode23 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.resolvingGradientStart;
        int iHashCode25 = (iHashCode24 + (num7 == null ? 0 : num7.hashCode())) * 31;
        String str14 = this.secondaryActionIcon;
        int iHashCode26 = (iHashCode25 + (str14 == null ? 0 : str14.hashCode())) * 31;
        Boolean bool4 = this.splashHasRadialGradient;
        int iHashCode27 = (iHashCode26 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Integer num8 = this.splashOpacity;
        int iHashCode28 = (iHashCode27 + (num8 == null ? 0 : num8.hashCode())) * 31;
        String str15 = this.splashUrl;
        int iHashCode29 = (iHashCode28 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.inviteSplash;
        int iHashCode30 = (iHashCode29 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.subtitle;
        int iHashCode31 = (iHashCode30 + (str17 == null ? 0 : str17.hashCode())) * 31;
        Integer num9 = this.subtitleColor;
        int iHashCode32 = (iHashCode31 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.thumbnailBackgroundColor;
        int iHashCode33 = (iHashCode32 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.thumbnailCornerRadius;
        int iHashCode34 = (iHashCode33 + (num11 == null ? 0 : num11.hashCode())) * 31;
        String str18 = this.thumbnailText;
        int iHashCode35 = (iHashCode34 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.thumbnailUrl;
        int iHashCode36 = (iHashCode35 + (str19 == null ? 0 : str19.hashCode())) * 31;
        Integer num12 = this.titleColor;
        int iHashCode37 = (iHashCode36 + (num12 == null ? 0 : num12.hashCode())) * 31;
        String str20 = this.titleText;
        int iHashCode38 = (iHashCode37 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.badgeIconUrl;
        return iHashCode38 + (str21 != null ? str21.hashCode() : 0);
    }

    @Override // com.discord.chat.bridge.codedlinks.GuildEventInviteEmbed
    public Boolean isRsvped() {
        return this.isRsvped;
    }

    @NotNull
    public String toString() {
        int i7 = this.backgroundColor;
        int i10 = this.borderColor;
        CodedLinkExtendedType codedLinkExtendedType = this.extendedType;
        int i11 = this.headerColor;
        String str = this.headerText;
        InviteType inviteType = this.type;
        Integer num = this.acceptLabelBackgroundColor;
        Integer num2 = this.acceptLabelBorderColor;
        Integer num3 = this.acceptLabelColor;
        String str2 = this.acceptLabelIcon;
        String str3 = this.acceptLabelText;
        String str4 = this.badgeCount;
        String str5 = this.badgeIcon;
        String str6 = this.bodyText;
        Integer num4 = this.bodyTextColor;
        Boolean bool = this.canBeAccepted;
        String str7 = this.channelIcon;
        String str8 = this.channelName;
        StructurableText structurableText = this.content;
        String str9 = this.creatorAvatar;
        Boolean bool2 = this.embedCanBeTapped;
        String str10 = this.guildIcon;
        String str11 = this.guildName;
        String str12 = this.headerIcon;
        Integer num5 = this.headerTextColor;
        Boolean bool3 = this.isRsvped;
        String str13 = this.memberText;
        String str14 = this.onlineText;
        Integer num6 = this.resolvingGradientEnd;
        Integer num7 = this.resolvingGradientStart;
        String str15 = this.secondaryActionIcon;
        Boolean bool4 = this.splashHasRadialGradient;
        Integer num8 = this.splashOpacity;
        String str16 = this.splashUrl;
        String str17 = this.inviteSplash;
        String str18 = this.subtitle;
        Integer num9 = this.subtitleColor;
        Integer num10 = this.thumbnailBackgroundColor;
        Integer num11 = this.thumbnailCornerRadius;
        String str19 = this.thumbnailText;
        String str20 = this.thumbnailUrl;
        Integer num12 = this.titleColor;
        String str21 = this.titleText;
        String str22 = this.badgeIconUrl;
        StringBuilder sbR = e.r(i7, "GuildEventInviteEmbedImpl(backgroundColor=", i10, ", borderColor=", ", extendedType=");
        sbR.append(codedLinkExtendedType);
        sbR.append(", headerColor=");
        sbR.append(i11);
        sbR.append(", headerText=");
        sbR.append(str);
        sbR.append(", type=");
        sbR.append(inviteType);
        sbR.append(", acceptLabelBackgroundColor=");
        b.s(sbR, num, ", acceptLabelBorderColor=", num2, ", acceptLabelColor=");
        b.r(num3, ", acceptLabelIcon=", str2, ", acceptLabelText=", sbR);
        e.A(sbR, str3, ", badgeCount=", str4, ", badgeIcon=");
        e.A(sbR, str5, ", bodyText=", str6, ", bodyTextColor=");
        sbR.append(num4);
        sbR.append(", canBeAccepted=");
        sbR.append(bool);
        sbR.append(", channelIcon=");
        e.A(sbR, str7, ", channelName=", str8, ", content=");
        sbR.append(structurableText);
        sbR.append(", creatorAvatar=");
        sbR.append(str9);
        sbR.append(", embedCanBeTapped=");
        sbR.append(bool2);
        sbR.append(", guildIcon=");
        sbR.append(str10);
        sbR.append(", guildName=");
        e.A(sbR, str11, ", headerIcon=", str12, ", headerTextColor=");
        sbR.append(num5);
        sbR.append(", isRsvped=");
        sbR.append(bool3);
        sbR.append(", memberText=");
        e.A(sbR, str13, ", onlineText=", str14, ", resolvingGradientEnd=");
        b.s(sbR, num6, ", resolvingGradientStart=", num7, ", secondaryActionIcon=");
        sbR.append(str15);
        sbR.append(", splashHasRadialGradient=");
        sbR.append(bool4);
        sbR.append(", splashOpacity=");
        b.r(num8, ", splashUrl=", str16, ", inviteSplash=", sbR);
        e.A(sbR, str17, ", subtitle=", str18, ", subtitleColor=");
        b.s(sbR, num9, ", thumbnailBackgroundColor=", num10, ", thumbnailCornerRadius=");
        b.r(num11, ", thumbnailText=", str19, ", thumbnailUrl=", sbR);
        a.r(num12, str20, ", titleColor=", ", titleText=", sbR);
        return a.l(sbR, str21, ", badgeIconUrl=", str22, ")");
    }

    public /* synthetic */ GuildEventInviteEmbedImpl(int i7, int i10, CodedLinkExtendedType codedLinkExtendedType, int i11, String str, InviteType inviteType, Integer num, Integer num2, Integer num3, String str2, String str3, String str4, String str5, String str6, Integer num4, Boolean bool, String str7, String str8, StructurableText structurableText, String str9, Boolean bool2, String str10, String str11, String str12, Integer num5, Boolean bool3, String str13, String str14, Integer num6, Integer num7, String str15, Boolean bool4, Integer num8, String str16, String str17, String str18, Integer num9, Integer num10, Integer num11, String str19, String str20, Integer num12, String str21, String str22, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(i7, i10, (i12 & 4) != 0 ? CodedLinkExtendedType.GUILD_SCHEDULED_EVENT : codedLinkExtendedType, i11, str, inviteType, (i12 & 64) != 0 ? null : num, (i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? null : num2, (i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : num3, (i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? null : str2, (i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? null : str3, (i12 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? null : str4, (i12 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : str5, (i12 & 8192) != 0 ? null : str6, (i12 & 16384) != 0 ? null : num4, (32768 & i12) != 0 ? null : bool, (65536 & i12) != 0 ? null : str7, (131072 & i12) != 0 ? null : str8, (262144 & i12) != 0 ? null : structurableText, (524288 & i12) != 0 ? null : str9, (1048576 & i12) != 0 ? null : bool2, (2097152 & i12) != 0 ? null : str10, (4194304 & i12) != 0 ? null : str11, (8388608 & i12) != 0 ? null : str12, (16777216 & i12) != 0 ? null : num5, (33554432 & i12) != 0 ? null : bool3, (67108864 & i12) != 0 ? null : str13, (134217728 & i12) != 0 ? null : str14, (268435456 & i12) != 0 ? null : num6, (536870912 & i12) != 0 ? null : num7, (1073741824 & i12) != 0 ? null : str15, (i12 & Integer.MIN_VALUE) != 0 ? null : bool4, (i13 & 1) != 0 ? null : num8, (i13 & 2) != 0 ? null : str16, (i13 & 4) != 0 ? null : str17, (i13 & 8) != 0 ? null : str18, (i13 & 16) != 0 ? null : num9, (i13 & 32) != 0 ? null : num10, (i13 & 64) != 0 ? null : num11, (i13 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? null : str19, (i13 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : str20, (i13 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? null : num12, (i13 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? null : str21, (i13 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? null : str22);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GuildEventInviteEmbedImpl(int i7, int i10, @NotNull CodedLinkExtendedType extendedType, int i11, @NotNull String headerText, @NotNull InviteType type, Integer num, Integer num2, Integer num3, String str, String str2, String str3, String str4, String str5, Integer num4, Boolean bool, String str6, String str7, StructurableText structurableText, String str8, Boolean bool2, String str9, String str10, String str11, Integer num5, Boolean bool3, String str12, String str13, Integer num6, Integer num7, String str14, Boolean bool4, Integer num8, String str15, String str16, String str17, Integer num9, Integer num10, Integer num11, String str18, String str19, Integer num12, String str20, String str21) {
        super(null);
        Intrinsics.checkNotNullParameter(extendedType, "extendedType");
        Intrinsics.checkNotNullParameter(headerText, "headerText");
        Intrinsics.checkNotNullParameter(type, "type");
        this.backgroundColor = i7;
        this.borderColor = i10;
        this.extendedType = extendedType;
        this.headerColor = i11;
        this.headerText = headerText;
        this.type = type;
        this.acceptLabelBackgroundColor = num;
        this.acceptLabelBorderColor = num2;
        this.acceptLabelColor = num3;
        this.acceptLabelIcon = str;
        this.acceptLabelText = str2;
        this.badgeCount = str3;
        this.badgeIcon = str4;
        this.bodyText = str5;
        this.bodyTextColor = num4;
        this.canBeAccepted = bool;
        this.channelIcon = str6;
        this.channelName = str7;
        this.content = structurableText;
        this.creatorAvatar = str8;
        this.embedCanBeTapped = bool2;
        this.guildIcon = str9;
        this.guildName = str10;
        this.headerIcon = str11;
        this.headerTextColor = num5;
        this.isRsvped = bool3;
        this.memberText = str12;
        this.onlineText = str13;
        this.resolvingGradientEnd = num6;
        this.resolvingGradientStart = num7;
        this.secondaryActionIcon = str14;
        this.splashHasRadialGradient = bool4;
        this.splashOpacity = num8;
        this.splashUrl = str15;
        this.inviteSplash = str16;
        this.subtitle = str17;
        this.subtitleColor = num9;
        this.thumbnailBackgroundColor = num10;
        this.thumbnailCornerRadius = num11;
        this.thumbnailText = str18;
        this.thumbnailUrl = str19;
        this.titleColor = num12;
        this.titleText = str20;
        this.badgeIconUrl = str21;
    }
}
