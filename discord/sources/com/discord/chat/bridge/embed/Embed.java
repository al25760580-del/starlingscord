package com.discord.chat.bridge.embed;

import a3.e;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.bridge.botuikit.Component;
import com.discord.chat.bridge.botuikit.ComponentSerializer;
import com.discord.chat.bridge.spoiler.SpoilerableData;
import com.discord.chat.bridge.structurabletext.StructurableText;
import com.discord.chat.bridge.structurabletext.StructurableTextSerializer;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.modules.dialog.AlertFragment;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.util.List;
import kotlin.Lazy;
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
import or.d;
import or.e1;
import or.g;
import or.m0;
import or.s1;
import org.jetbrains.annotations.NotNull;
import org.webrtc.MediaStreamTrack;
import org.webrtc.PeerConnection;
import rn.l;
import rn.m;

/* JADX INFO: loaded from: classes.dex */
@f
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\bX\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u009d\u00012\u00020\u0001:\u0004\u009c\u0001\u009d\u0001B\u009f\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010'\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010\u000e\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*\u0012\n\b\u0003\u0010+\u001a\u0004\u0018\u00010,\u0012\n\b\u0003\u0010-\u001a\u0004\u0018\u00010,\u0012\n\b\u0003\u0010.\u001a\u0004\u0018\u00010,\u0012\b\b\u0001\u0010/\u001a\u00020,\u0012\n\b\u0003\u00100\u001a\u0004\u0018\u00010,¢\u0006\u0004\b1\u00102B\u0091\u0003\b\u0010\u0012\u0006\u00103\u001a\u00020,\u0012\u0006\u00104\u001a\u00020,\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u000e\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0005\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010#\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010$\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010%\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010'\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010\u000e\u0012\b\u0010)\u001a\u0004\u0018\u00010*\u0012\b\u0010+\u001a\u0004\u0018\u00010,\u0012\b\u0010-\u001a\u0004\u0018\u00010,\u0012\b\u0010.\u001a\u0004\u0018\u00010,\u0012\u0006\u0010/\u001a\u00020,\u0012\b\u00100\u001a\u0004\u0018\u00010,\u0012\b\u00105\u001a\u0004\u0018\u00010\u0005\u0012\b\u00106\u001a\u0004\u0018\u00010\u0005\u0012\b\u00107\u001a\u0004\u0018\u000108¢\u0006\u0004\b1\u00109J\t\u0010l\u001a\u00020\u0003HÆ\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010q\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0011\u0010r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003J\u000b\u0010s\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010u\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010v\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u0011\u0010w\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u000eHÆ\u0003J\u000b\u0010x\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u000b\u0010y\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u000b\u0010z\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010{\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010|\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010}\u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0002\u0010TJ\u000b\u0010~\u001a\u0004\u0018\u00010\u001fHÆ\u0003J\u000b\u0010\u007f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0002\u0010TJ\u0011\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0002\u0010TJ\u0011\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0002\u0010TJ\f\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0012\u0010\u0086\u0001\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010\u000eHÆ\u0003J\f\u0010\u0087\u0001\u001a\u0004\u0018\u00010*HÆ\u0003J\u0011\u0010\u0088\u0001\u001a\u0004\u0018\u00010,HÆ\u0003¢\u0006\u0002\u0010cJ\u0011\u0010\u0089\u0001\u001a\u0004\u0018\u00010,HÆ\u0003¢\u0006\u0002\u0010cJ\u0011\u0010\u008a\u0001\u001a\u0004\u0018\u00010,HÆ\u0003¢\u0006\u0002\u0010cJ\n\u0010\u008b\u0001\u001a\u00020,HÆ\u0003J\u0011\u0010\u008c\u0001\u001a\u0004\u0018\u00010,HÆ\u0003¢\u0006\u0002\u0010cJª\u0003\u0010\u008d\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u000e2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010'\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010\u000e2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*2\n\b\u0003\u0010+\u001a\u0004\u0018\u00010,2\n\b\u0003\u0010-\u001a\u0004\u0018\u00010,2\n\b\u0003\u0010.\u001a\u0004\u0018\u00010,2\b\b\u0003\u0010/\u001a\u00020,2\n\b\u0003\u00100\u001a\u0004\u0018\u00010,HÆ\u0001¢\u0006\u0003\u0010\u008e\u0001J\u0016\u0010\u008f\u0001\u001a\u00020\u001d2\n\u0010\u0090\u0001\u001a\u0005\u0018\u00010\u0091\u0001HÖ\u0003J\n\u0010\u0092\u0001\u001a\u00020,HÖ\u0001J\n\u0010\u0093\u0001\u001a\u00020\u0005HÖ\u0001J-\u0010\u0094\u0001\u001a\u00030\u0095\u00012\u0007\u0010\u0096\u0001\u001a\u00020\u00002\b\u0010\u0097\u0001\u001a\u00030\u0098\u00012\b\u0010\u0099\u0001\u001a\u00030\u009a\u0001H\u0001¢\u0006\u0003\b\u009b\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bB\u0010=R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bG\u0010=R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bH\u0010=R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\bI\u0010DR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u0019\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\bL\u0010FR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\bM\u0010KR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\bN\u0010OR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bP\u0010=R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010=R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bR\u0010=R\u0015\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\n\n\u0002\u0010U\u001a\u0004\bS\u0010TR\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001f¢\u0006\b\n\u0000\u001a\u0004\bV\u0010WR\u0013\u0010 \u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bX\u0010=R\u0013\u0010!\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bY\u0010=R\u0013\u0010\"\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010=R\u0015\u0010#\u001a\u0004\u0018\u00010\u001d¢\u0006\n\n\u0002\u0010U\u001a\u0004\b[\u0010TR\u0015\u0010$\u001a\u0004\u0018\u00010\u001d¢\u0006\n\n\u0002\u0010U\u001a\u0004\b\\\u0010TR\u0015\u0010%\u001a\u0004\u0018\u00010\u001d¢\u0006\n\n\u0002\u0010U\u001a\u0004\b]\u0010TR\u0013\u0010&\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b^\u0010=R\u0019\u0010'\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b_\u0010FR\u0013\u0010)\u001a\u0004\u0018\u00010*¢\u0006\b\n\u0000\u001a\u0004\b`\u0010aR\u0015\u0010+\u001a\u0004\u0018\u00010,¢\u0006\n\n\u0002\u0010d\u001a\u0004\bb\u0010cR\u0015\u0010-\u001a\u0004\u0018\u00010,¢\u0006\n\n\u0002\u0010d\u001a\u0004\be\u0010cR\u0015\u0010.\u001a\u0004\u0018\u00010,¢\u0006\n\n\u0002\u0010d\u001a\u0004\bf\u0010cR\u0011\u0010/\u001a\u00020,¢\u0006\b\n\u0000\u001a\u0004\bg\u0010hR\u0015\u00100\u001a\u0004\u0018\u00010,¢\u0006\n\n\u0002\u0010d\u001a\u0004\bi\u0010cR\u0016\u00105\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bj\u0010=R\u0016\u00106\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bk\u0010=¨\u0006\u009e\u0001"}, d2 = {"Lcom/discord/chat/bridge/embed/Embed;", "Lcom/discord/chat/bridge/spoiler/SpoilerableData;", "type", "Lcom/discord/chat/bridge/embed/EmbedType;", StackTraceHelper.ID_KEY, "", "author", "Lcom/discord/chat/bridge/embed/EmbedAuthor;", "provider", "Lcom/discord/chat/bridge/embed/EmbedProvider;", "rawTitle", AlertFragment.ARG_TITLE, "Lcom/discord/chat/bridge/structurabletext/StructurableText;", "fields", "", "Lcom/discord/chat/bridge/embed/EmbedField;", "url", "rawDescription", "description", "image", "Lcom/discord/chat/bridge/embed/EmbedMedia;", "images", MediaStreamTrack.VIDEO_TRACK_KIND, "thumbnail", "Lcom/discord/chat/bridge/embed/EmbedThumbnail;", "numAttachments", "attachmentsSize", "messageSendError", "disableBackgroundColor", "", "footer", "Lcom/discord/chat/bridge/embed/EmbedFooter;", "spoiler", "obscure", "obscureAwaitingScan", "obscureHideControls", "obscureIsOpaque", "verifyAge", "iconURL", "components", "Lcom/discord/chat/bridge/botuikit/Component;", "failureState", "Lcom/discord/chat/bridge/embed/EmbedFailureState;", "providerColor", "", ViewProps.BORDER_LEFT_COLOR, "headerTextColor", "bodyTextColor", ViewProps.BACKGROUND_COLOR, "<init>", "(Lcom/discord/chat/bridge/embed/EmbedType;Ljava/lang/String;Lcom/discord/chat/bridge/embed/EmbedAuthor;Lcom/discord/chat/bridge/embed/EmbedProvider;Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;Lcom/discord/chat/bridge/embed/EmbedMedia;Ljava/util/List;Lcom/discord/chat/bridge/embed/EmbedMedia;Lcom/discord/chat/bridge/embed/EmbedThumbnail;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/discord/chat/bridge/embed/EmbedFooter;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Lcom/discord/chat/bridge/embed/EmbedFailureState;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ILjava/lang/Integer;)V", "seen0", "seen1", "spoilerOrNull", "obscureOrNull", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILcom/discord/chat/bridge/embed/EmbedType;Ljava/lang/String;Lcom/discord/chat/bridge/embed/EmbedAuthor;Lcom/discord/chat/bridge/embed/EmbedProvider;Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;Lcom/discord/chat/bridge/embed/EmbedMedia;Ljava/util/List;Lcom/discord/chat/bridge/embed/EmbedMedia;Lcom/discord/chat/bridge/embed/EmbedThumbnail;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/discord/chat/bridge/embed/EmbedFooter;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Lcom/discord/chat/bridge/embed/EmbedFailureState;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getType", "()Lcom/discord/chat/bridge/embed/EmbedType;", "getId", "()Ljava/lang/String;", "getAuthor", "()Lcom/discord/chat/bridge/embed/EmbedAuthor;", "getProvider", "()Lcom/discord/chat/bridge/embed/EmbedProvider;", "getRawTitle", "getTitle", "()Lcom/discord/chat/bridge/structurabletext/StructurableText;", "getFields", "()Ljava/util/List;", "getUrl", "getRawDescription", "getDescription", "getImage", "()Lcom/discord/chat/bridge/embed/EmbedMedia;", "getImages", "getVideo", "getThumbnail", "()Lcom/discord/chat/bridge/embed/EmbedThumbnail;", "getNumAttachments", "getAttachmentsSize", "getMessageSendError", "getDisableBackgroundColor", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getFooter", "()Lcom/discord/chat/bridge/embed/EmbedFooter;", "getSpoiler", "getObscure", "getObscureAwaitingScan", "getObscureHideControls", "getObscureIsOpaque", "getVerifyAge", "getIconURL", "getComponents", "getFailureState", "()Lcom/discord/chat/bridge/embed/EmbedFailureState;", "getProviderColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBorderLeftColor", "getHeaderTextColor", "getBodyTextColor", "()I", "getBackgroundColor", "getSpoilerOrNull", "getObscureOrNull", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "copy", "(Lcom/discord/chat/bridge/embed/EmbedType;Ljava/lang/String;Lcom/discord/chat/bridge/embed/EmbedAuthor;Lcom/discord/chat/bridge/embed/EmbedProvider;Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;Lcom/discord/chat/bridge/embed/EmbedMedia;Ljava/util/List;Lcom/discord/chat/bridge/embed/EmbedMedia;Lcom/discord/chat/bridge/embed/EmbedThumbnail;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/discord/chat/bridge/embed/EmbedFooter;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Lcom/discord/chat/bridge/embed/EmbedFailureState;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ILjava/lang/Integer;)Lcom/discord/chat/bridge/embed/Embed;", "equals", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nEmbed.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Embed.kt\ncom/discord/chat/bridge/embed/Embed\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,48:1\n1#2:49\n*E\n"})
public final /* data */ class Embed implements SpoilerableData {

    @NotNull
    private static final Lazy[] $childSerializers;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final String attachmentsSize;
    private final EmbedAuthor author;
    private final Integer backgroundColor;
    private final int bodyTextColor;
    private final Integer borderLeftColor;
    private final List<Component> components;
    private final StructurableText description;
    private final Boolean disableBackgroundColor;
    private final EmbedFailureState failureState;
    private final List<EmbedField> fields;
    private final EmbedFooter footer;
    private final Integer headerTextColor;
    private final String iconURL;
    private final String id;
    private final EmbedMedia image;
    private final List<EmbedMedia> images;
    private final String messageSendError;
    private final String numAttachments;
    private final String obscure;
    private final String obscureAwaitingScan;
    private final Boolean obscureHideControls;
    private final Boolean obscureIsOpaque;
    private final String obscureOrNull;
    private final EmbedProvider provider;
    private final Integer providerColor;
    private final String rawDescription;
    private final String rawTitle;
    private final String spoiler;
    private final String spoilerOrNull;
    private final EmbedThumbnail thumbnail;
    private final StructurableText title;

    @NotNull
    private final EmbedType type;
    private final String url;
    private final Boolean verifyAge;
    private final EmbedMedia video;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/embed/Embed$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/embed/Embed;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return Embed$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        m mVar = m.f19486e;
        $childSerializers = new Lazy[]{l.a(mVar, new com.discord.chat.bridge.contentnode.a(21)), null, null, null, null, null, l.a(mVar, new com.discord.chat.bridge.contentnode.a(22)), null, null, null, null, l.a(mVar, new com.discord.chat.bridge.contentnode.a(23)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, l.a(mVar, new com.discord.chat.bridge.contentnode.a(24)), null, null, null, null, null, null, null, null};
    }

    public /* synthetic */ Embed(int i7, int i10, EmbedType embedType, String str, EmbedAuthor embedAuthor, EmbedProvider embedProvider, String str2, StructurableText structurableText, List list, String str3, String str4, StructurableText structurableText2, EmbedMedia embedMedia, List list2, EmbedMedia embedMedia2, EmbedThumbnail embedThumbnail, String str5, String str6, String str7, Boolean bool, EmbedFooter embedFooter, String str8, String str9, String str10, Boolean bool2, Boolean bool3, Boolean bool4, String str11, List list3, EmbedFailureState embedFailureState, Integer num, Integer num2, Integer num3, int i11, Integer num4, String str12, String str13, SerializationConstructorMarker serializationConstructorMarker) {
        String str14;
        String str15 = null;
        if (-2147483647 != (i7 & (-2147483647))) {
            e1.k(new int[]{i7, i10}, new int[]{-2147483647, 0}, Embed$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.type = embedType;
        if ((i7 & 2) == 0) {
            this.id = null;
        } else {
            this.id = str;
        }
        if ((i7 & 4) == 0) {
            this.author = null;
        } else {
            this.author = embedAuthor;
        }
        if ((i7 & 8) == 0) {
            this.provider = null;
        } else {
            this.provider = embedProvider;
        }
        if ((i7 & 16) == 0) {
            this.rawTitle = null;
        } else {
            this.rawTitle = str2;
        }
        if ((i7 & 32) == 0) {
            this.title = null;
        } else {
            this.title = structurableText;
        }
        if ((i7 & 64) == 0) {
            this.fields = null;
        } else {
            this.fields = list;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 0) {
            this.url = null;
        } else {
            this.url = str3;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 0) {
            this.rawDescription = null;
        } else {
            this.rawDescription = str4;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 0) {
            this.description = null;
        } else {
            this.description = structurableText2;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) == 0) {
            this.image = null;
        } else {
            this.image = embedMedia;
        }
        if ((i7 & RecyclerView.ItemAnimator.FLAG_MOVED) == 0) {
            this.images = null;
        } else {
            this.images = list2;
        }
        if ((i7 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) == 0) {
            this.video = null;
        } else {
            this.video = embedMedia2;
        }
        if ((i7 & 8192) == 0) {
            this.thumbnail = null;
        } else {
            this.thumbnail = embedThumbnail;
        }
        if ((i7 & 16384) == 0) {
            this.numAttachments = null;
        } else {
            this.numAttachments = str5;
        }
        if ((32768 & i7) == 0) {
            this.attachmentsSize = null;
        } else {
            this.attachmentsSize = str6;
        }
        if ((65536 & i7) == 0) {
            this.messageSendError = null;
        } else {
            this.messageSendError = str7;
        }
        if ((131072 & i7) == 0) {
            this.disableBackgroundColor = null;
        } else {
            this.disableBackgroundColor = bool;
        }
        if ((262144 & i7) == 0) {
            this.footer = null;
        } else {
            this.footer = embedFooter;
        }
        if ((524288 & i7) == 0) {
            this.spoiler = null;
        } else {
            this.spoiler = str8;
        }
        if ((1048576 & i7) == 0) {
            this.obscure = null;
        } else {
            this.obscure = str9;
        }
        if ((2097152 & i7) == 0) {
            this.obscureAwaitingScan = null;
        } else {
            this.obscureAwaitingScan = str10;
        }
        if ((4194304 & i7) == 0) {
            this.obscureHideControls = null;
        } else {
            this.obscureHideControls = bool2;
        }
        if ((8388608 & i7) == 0) {
            this.obscureIsOpaque = null;
        } else {
            this.obscureIsOpaque = bool3;
        }
        if ((16777216 & i7) == 0) {
            this.verifyAge = null;
        } else {
            this.verifyAge = bool4;
        }
        if ((33554432 & i7) == 0) {
            this.iconURL = null;
        } else {
            this.iconURL = str11;
        }
        if ((67108864 & i7) == 0) {
            this.components = null;
        } else {
            this.components = list3;
        }
        if ((134217728 & i7) == 0) {
            this.failureState = null;
        } else {
            this.failureState = embedFailureState;
        }
        if ((268435456 & i7) == 0) {
            this.providerColor = null;
        } else {
            this.providerColor = num;
        }
        if ((536870912 & i7) == 0) {
            this.borderLeftColor = null;
        } else {
            this.borderLeftColor = num2;
        }
        if ((i7 & 1073741824) == 0) {
            this.headerTextColor = null;
        } else {
            this.headerTextColor = num3;
        }
        this.bodyTextColor = i11;
        if ((i10 & 1) == 0) {
            this.backgroundColor = null;
        } else {
            this.backgroundColor = num4;
        }
        if ((i10 & 2) == 0) {
            str14 = this.spoiler;
            if (str14 == null || StringsKt.K(str14)) {
                str14 = null;
            }
        } else {
            str14 = str12;
        }
        this.spoilerOrNull = str14;
        if ((i10 & 4) != 0) {
            this.obscureOrNull = str13;
            return;
        }
        String str16 = this.obscure;
        if (str16 != null && !StringsKt.K(str16)) {
            str15 = str16;
        }
        this.obscureOrNull = str15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return EmbedType.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$6() {
        return new d(EmbedField$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$7() {
        return new d(EmbedMedia$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$8() {
        return new d(ComponentSerializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Embed copy$default(Embed embed, EmbedType embedType, String str, EmbedAuthor embedAuthor, EmbedProvider embedProvider, String str2, StructurableText structurableText, List list, String str3, String str4, StructurableText structurableText2, EmbedMedia embedMedia, List list2, EmbedMedia embedMedia2, EmbedThumbnail embedThumbnail, String str5, String str6, String str7, Boolean bool, EmbedFooter embedFooter, String str8, String str9, String str10, Boolean bool2, Boolean bool3, Boolean bool4, String str11, List list3, EmbedFailureState embedFailureState, Integer num, Integer num2, Integer num3, int i7, Integer num4, int i10, int i11, Object obj) {
        Integer num5;
        int i12;
        EmbedType embedType2 = (i10 & 1) != 0 ? embed.type : embedType;
        String str12 = (i10 & 2) != 0 ? embed.id : str;
        EmbedAuthor embedAuthor2 = (i10 & 4) != 0 ? embed.author : embedAuthor;
        EmbedProvider embedProvider2 = (i10 & 8) != 0 ? embed.provider : embedProvider;
        String str13 = (i10 & 16) != 0 ? embed.rawTitle : str2;
        StructurableText structurableText3 = (i10 & 32) != 0 ? embed.title : structurableText;
        List list4 = (i10 & 64) != 0 ? embed.fields : list;
        String str14 = (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? embed.url : str3;
        String str15 = (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? embed.rawDescription : str4;
        StructurableText structurableText4 = (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? embed.description : structurableText2;
        EmbedMedia embedMedia3 = (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? embed.image : embedMedia;
        List list5 = (i10 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? embed.images : list2;
        EmbedMedia embedMedia4 = (i10 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? embed.video : embedMedia2;
        EmbedThumbnail embedThumbnail2 = (i10 & 8192) != 0 ? embed.thumbnail : embedThumbnail;
        EmbedType embedType3 = embedType2;
        String str16 = (i10 & 16384) != 0 ? embed.numAttachments : str5;
        String str17 = (i10 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? embed.attachmentsSize : str6;
        String str18 = (i10 & 65536) != 0 ? embed.messageSendError : str7;
        Boolean bool5 = (i10 & 131072) != 0 ? embed.disableBackgroundColor : bool;
        EmbedFooter embedFooter2 = (i10 & 262144) != 0 ? embed.footer : embedFooter;
        String str19 = (i10 & 524288) != 0 ? embed.spoiler : str8;
        String str20 = (i10 & 1048576) != 0 ? embed.obscure : str9;
        String str21 = (i10 & 2097152) != 0 ? embed.obscureAwaitingScan : str10;
        Boolean bool6 = (i10 & 4194304) != 0 ? embed.obscureHideControls : bool2;
        Boolean bool7 = (i10 & 8388608) != 0 ? embed.obscureIsOpaque : bool3;
        Boolean bool8 = (i10 & PointerEventHelper.X_FLAG_SUPPORTS_HOVER) != 0 ? embed.verifyAge : bool4;
        String str22 = (i10 & 33554432) != 0 ? embed.iconURL : str11;
        List list6 = (i10 & 67108864) != 0 ? embed.components : list3;
        EmbedFailureState embedFailureState2 = (i10 & 134217728) != 0 ? embed.failureState : embedFailureState;
        Integer num6 = (i10 & 268435456) != 0 ? embed.providerColor : num;
        Integer num7 = (i10 & 536870912) != 0 ? embed.borderLeftColor : num2;
        Integer num8 = (i10 & 1073741824) != 0 ? embed.headerTextColor : num3;
        int i13 = (i10 & Integer.MIN_VALUE) != 0 ? embed.bodyTextColor : i7;
        if ((i11 & 1) != 0) {
            i12 = i13;
            num5 = embed.backgroundColor;
        } else {
            num5 = num4;
            i12 = i13;
        }
        return embed.copy(embedType3, str12, embedAuthor2, embedProvider2, str13, structurableText3, list4, str14, str15, structurableText4, embedMedia3, list5, embedMedia4, embedThumbnail2, str16, str17, str18, bool5, embedFooter2, str19, str20, str21, bool6, bool7, bool8, str22, list6, embedFailureState2, num6, num7, num8, i12, num5);
    }

    /* JADX WARN: Code duplicated, block: B:199:0x02ae  */
    public static final /* synthetic */ void write$Self$chat_release(Embed self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Lazy[] lazyArr = $childSerializers;
        output.g(serialDesc, 0, (KSerializer) lazyArr[0].getValue(), self.type);
        if (output.u(serialDesc, 1) || self.id != null) {
            output.r(serialDesc, 1, s1.f17602a, self.id);
        }
        if (output.u(serialDesc, 2) || self.author != null) {
            output.r(serialDesc, 2, EmbedAuthor$$serializer.INSTANCE, self.author);
        }
        if (output.u(serialDesc, 3) || self.provider != null) {
            output.r(serialDesc, 3, EmbedProvider$$serializer.INSTANCE, self.provider);
        }
        if (output.u(serialDesc, 4) || self.rawTitle != null) {
            output.r(serialDesc, 4, s1.f17602a, self.rawTitle);
        }
        if (output.u(serialDesc, 5) || self.title != null) {
            output.r(serialDesc, 5, StructurableTextSerializer.INSTANCE, self.title);
        }
        if (output.u(serialDesc, 6) || self.fields != null) {
            output.r(serialDesc, 6, (KSerializer) lazyArr[6].getValue(), self.fields);
        }
        if (output.u(serialDesc, 7) || self.url != null) {
            output.r(serialDesc, 7, s1.f17602a, self.url);
        }
        if (output.u(serialDesc, 8) || self.rawDescription != null) {
            output.r(serialDesc, 8, s1.f17602a, self.rawDescription);
        }
        if (output.u(serialDesc, 9) || self.description != null) {
            output.r(serialDesc, 9, StructurableTextSerializer.INSTANCE, self.description);
        }
        if (output.u(serialDesc, 10) || self.image != null) {
            output.r(serialDesc, 10, EmbedMedia$$serializer.INSTANCE, self.image);
        }
        if (output.u(serialDesc, 11) || self.images != null) {
            output.r(serialDesc, 11, (KSerializer) lazyArr[11].getValue(), self.images);
        }
        if (output.u(serialDesc, 12) || self.video != null) {
            output.r(serialDesc, 12, EmbedMedia$$serializer.INSTANCE, self.video);
        }
        if (output.u(serialDesc, 13) || self.thumbnail != null) {
            output.r(serialDesc, 13, EmbedThumbnail$$serializer.INSTANCE, self.thumbnail);
        }
        if (output.u(serialDesc, 14) || self.numAttachments != null) {
            output.r(serialDesc, 14, s1.f17602a, self.numAttachments);
        }
        if (output.u(serialDesc, 15) || self.attachmentsSize != null) {
            output.r(serialDesc, 15, s1.f17602a, self.attachmentsSize);
        }
        if (output.u(serialDesc, 16) || self.messageSendError != null) {
            output.r(serialDesc, 16, s1.f17602a, self.messageSendError);
        }
        if (output.u(serialDesc, 17) || self.disableBackgroundColor != null) {
            output.r(serialDesc, 17, g.f17537a, self.disableBackgroundColor);
        }
        if (output.u(serialDesc, 18) || self.footer != null) {
            output.r(serialDesc, 18, EmbedFooter$$serializer.INSTANCE, self.footer);
        }
        if (output.u(serialDesc, 19) || self.spoiler != null) {
            output.r(serialDesc, 19, s1.f17602a, self.spoiler);
        }
        if (output.u(serialDesc, 20) || self.obscure != null) {
            output.r(serialDesc, 20, s1.f17602a, self.obscure);
        }
        if (output.u(serialDesc, 21) || self.obscureAwaitingScan != null) {
            output.r(serialDesc, 21, s1.f17602a, self.obscureAwaitingScan);
        }
        if (output.u(serialDesc, 22) || self.obscureHideControls != null) {
            output.r(serialDesc, 22, g.f17537a, self.obscureHideControls);
        }
        if (output.u(serialDesc, 23) || self.obscureIsOpaque != null) {
            output.r(serialDesc, 23, g.f17537a, self.obscureIsOpaque);
        }
        if (output.u(serialDesc, 24) || self.verifyAge != null) {
            output.r(serialDesc, 24, g.f17537a, self.verifyAge);
        }
        if (output.u(serialDesc, 25) || self.iconURL != null) {
            output.r(serialDesc, 25, s1.f17602a, self.iconURL);
        }
        if (output.u(serialDesc, 26) || self.components != null) {
            output.r(serialDesc, 26, (KSerializer) lazyArr[26].getValue(), self.components);
        }
        if (output.u(serialDesc, 27) || self.failureState != null) {
            output.r(serialDesc, 27, EmbedFailureState.Serializer.INSTANCE, self.failureState);
        }
        if (output.u(serialDesc, 28) || self.providerColor != null) {
            output.r(serialDesc, 28, m0.f17573a, self.providerColor);
        }
        if (output.u(serialDesc, 29) || self.borderLeftColor != null) {
            output.r(serialDesc, 29, m0.f17573a, self.borderLeftColor);
        }
        if (output.u(serialDesc, 30) || self.headerTextColor != null) {
            output.r(serialDesc, 30, m0.f17573a, self.headerTextColor);
        }
        output.l(31, self.bodyTextColor, serialDesc);
        if (output.u(serialDesc, 32) || self.backgroundColor != null) {
            output.r(serialDesc, 32, m0.f17573a, self.backgroundColor);
        }
        String str = null;
        if (output.u(serialDesc, 33)) {
            output.r(serialDesc, 33, s1.f17602a, self.getSpoilerOrNull());
        } else {
            String spoilerOrNull = self.getSpoilerOrNull();
            String str2 = self.spoiler;
            if (str2 == null || StringsKt.K(str2)) {
                str2 = null;
            }
            if (!Intrinsics.areEqual(spoilerOrNull, str2)) {
                output.r(serialDesc, 33, s1.f17602a, self.getSpoilerOrNull());
            }
        }
        if (!output.u(serialDesc, 34)) {
            String obscureOrNull = self.getObscureOrNull();
            String str3 = self.obscure;
            if (str3 != null && !StringsKt.K(str3)) {
                str = str3;
            }
            if (Intrinsics.areEqual(obscureOrNull, str)) {
                return;
            }
        }
        output.r(serialDesc, 34, s1.f17602a, self.getObscureOrNull());
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final EmbedType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final StructurableText getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final EmbedMedia getImage() {
        return this.image;
    }

    public final List<EmbedMedia> component12() {
        return this.images;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final EmbedMedia getVideo() {
        return this.video;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final EmbedThumbnail getThumbnail() {
        return this.thumbnail;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getNumAttachments() {
        return this.numAttachments;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getAttachmentsSize() {
        return this.attachmentsSize;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getMessageSendError() {
        return this.messageSendError;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final Boolean getDisableBackgroundColor() {
        return this.disableBackgroundColor;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final EmbedFooter getFooter() {
        return this.footer;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getSpoiler() {
        return this.spoiler;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getObscure() {
        return this.obscure;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getObscureAwaitingScan() {
        return this.obscureAwaitingScan;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final Boolean getObscureHideControls() {
        return this.obscureHideControls;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final Boolean getObscureIsOpaque() {
        return this.obscureIsOpaque;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final Boolean getVerifyAge() {
        return this.verifyAge;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getIconURL() {
        return this.iconURL;
    }

    public final List<Component> component27() {
        return this.components;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final EmbedFailureState getFailureState() {
        return this.failureState;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final Integer getProviderColor() {
        return this.providerColor;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final EmbedAuthor getAuthor() {
        return this.author;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final Integer getBorderLeftColor() {
        return this.borderLeftColor;
    }

    /* JADX INFO: renamed from: component31, reason: from getter */
    public final Integer getHeaderTextColor() {
        return this.headerTextColor;
    }

    /* JADX INFO: renamed from: component32, reason: from getter */
    public final int getBodyTextColor() {
        return this.bodyTextColor;
    }

    /* JADX INFO: renamed from: component33, reason: from getter */
    public final Integer getBackgroundColor() {
        return this.backgroundColor;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final EmbedProvider getProvider() {
        return this.provider;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getRawTitle() {
        return this.rawTitle;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final StructurableText getTitle() {
        return this.title;
    }

    public final List<EmbedField> component7() {
        return this.fields;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getRawDescription() {
        return this.rawDescription;
    }

    @NotNull
    public final Embed copy(@NotNull EmbedType type, String id2, EmbedAuthor author, EmbedProvider provider, String rawTitle, StructurableText title, List<EmbedField> fields, String url, String rawDescription, StructurableText description, EmbedMedia image, List<EmbedMedia> images, EmbedMedia video, EmbedThumbnail thumbnail, String numAttachments, String attachmentsSize, String messageSendError, Boolean disableBackgroundColor, EmbedFooter footer, String spoiler, String obscure, String obscureAwaitingScan, Boolean obscureHideControls, Boolean obscureIsOpaque, Boolean verifyAge, String iconURL, List<? extends Component> components, EmbedFailureState failureState, Integer providerColor, Integer borderLeftColor, Integer headerTextColor, int bodyTextColor, Integer backgroundColor) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new Embed(type, id2, author, provider, rawTitle, title, fields, url, rawDescription, description, image, images, video, thumbnail, numAttachments, attachmentsSize, messageSendError, disableBackgroundColor, footer, spoiler, obscure, obscureAwaitingScan, obscureHideControls, obscureIsOpaque, verifyAge, iconURL, components, failureState, providerColor, borderLeftColor, headerTextColor, bodyTextColor, backgroundColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Embed)) {
            return false;
        }
        Embed embed = (Embed) other;
        return this.type == embed.type && Intrinsics.areEqual(this.id, embed.id) && Intrinsics.areEqual(this.author, embed.author) && Intrinsics.areEqual(this.provider, embed.provider) && Intrinsics.areEqual(this.rawTitle, embed.rawTitle) && Intrinsics.areEqual(this.title, embed.title) && Intrinsics.areEqual(this.fields, embed.fields) && Intrinsics.areEqual(this.url, embed.url) && Intrinsics.areEqual(this.rawDescription, embed.rawDescription) && Intrinsics.areEqual(this.description, embed.description) && Intrinsics.areEqual(this.image, embed.image) && Intrinsics.areEqual(this.images, embed.images) && Intrinsics.areEqual(this.video, embed.video) && Intrinsics.areEqual(this.thumbnail, embed.thumbnail) && Intrinsics.areEqual(this.numAttachments, embed.numAttachments) && Intrinsics.areEqual(this.attachmentsSize, embed.attachmentsSize) && Intrinsics.areEqual(this.messageSendError, embed.messageSendError) && Intrinsics.areEqual(this.disableBackgroundColor, embed.disableBackgroundColor) && Intrinsics.areEqual(this.footer, embed.footer) && Intrinsics.areEqual(this.spoiler, embed.spoiler) && Intrinsics.areEqual(this.obscure, embed.obscure) && Intrinsics.areEqual(this.obscureAwaitingScan, embed.obscureAwaitingScan) && Intrinsics.areEqual(this.obscureHideControls, embed.obscureHideControls) && Intrinsics.areEqual(this.obscureIsOpaque, embed.obscureIsOpaque) && Intrinsics.areEqual(this.verifyAge, embed.verifyAge) && Intrinsics.areEqual(this.iconURL, embed.iconURL) && Intrinsics.areEqual(this.components, embed.components) && this.failureState == embed.failureState && Intrinsics.areEqual(this.providerColor, embed.providerColor) && Intrinsics.areEqual(this.borderLeftColor, embed.borderLeftColor) && Intrinsics.areEqual(this.headerTextColor, embed.headerTextColor) && this.bodyTextColor == embed.bodyTextColor && Intrinsics.areEqual(this.backgroundColor, embed.backgroundColor);
    }

    public final String getAttachmentsSize() {
        return this.attachmentsSize;
    }

    public final EmbedAuthor getAuthor() {
        return this.author;
    }

    public final Integer getBackgroundColor() {
        return this.backgroundColor;
    }

    public final int getBodyTextColor() {
        return this.bodyTextColor;
    }

    public final Integer getBorderLeftColor() {
        return this.borderLeftColor;
    }

    public final List<Component> getComponents() {
        return this.components;
    }

    public final StructurableText getDescription() {
        return this.description;
    }

    public final Boolean getDisableBackgroundColor() {
        return this.disableBackgroundColor;
    }

    public final EmbedFailureState getFailureState() {
        return this.failureState;
    }

    public final List<EmbedField> getFields() {
        return this.fields;
    }

    public final EmbedFooter getFooter() {
        return this.footer;
    }

    public final Integer getHeaderTextColor() {
        return this.headerTextColor;
    }

    public final String getIconURL() {
        return this.iconURL;
    }

    public final String getId() {
        return this.id;
    }

    public final EmbedMedia getImage() {
        return this.image;
    }

    public final List<EmbedMedia> getImages() {
        return this.images;
    }

    public final String getMessageSendError() {
        return this.messageSendError;
    }

    public final String getNumAttachments() {
        return this.numAttachments;
    }

    public final String getObscure() {
        return this.obscure;
    }

    public final String getObscureAwaitingScan() {
        return this.obscureAwaitingScan;
    }

    public final Boolean getObscureHideControls() {
        return this.obscureHideControls;
    }

    public final Boolean getObscureIsOpaque() {
        return this.obscureIsOpaque;
    }

    @Override // com.discord.chat.bridge.spoiler.SpoilerableData
    public String getObscureOrNull() {
        return this.obscureOrNull;
    }

    public final EmbedProvider getProvider() {
        return this.provider;
    }

    public final Integer getProviderColor() {
        return this.providerColor;
    }

    public final String getRawDescription() {
        return this.rawDescription;
    }

    public final String getRawTitle() {
        return this.rawTitle;
    }

    public final String getSpoiler() {
        return this.spoiler;
    }

    @Override // com.discord.chat.bridge.spoiler.SpoilerableData
    public String getSpoilerOrNull() {
        return this.spoilerOrNull;
    }

    public final EmbedThumbnail getThumbnail() {
        return this.thumbnail;
    }

    public final StructurableText getTitle() {
        return this.title;
    }

    @NotNull
    public final EmbedType getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    public final Boolean getVerifyAge() {
        return this.verifyAge;
    }

    public final EmbedMedia getVideo() {
        return this.video;
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        String str = this.id;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        EmbedAuthor embedAuthor = this.author;
        int iHashCode3 = (iHashCode2 + (embedAuthor == null ? 0 : embedAuthor.hashCode())) * 31;
        EmbedProvider embedProvider = this.provider;
        int iHashCode4 = (iHashCode3 + (embedProvider == null ? 0 : embedProvider.hashCode())) * 31;
        String str2 = this.rawTitle;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        StructurableText structurableText = this.title;
        int iHashCode6 = (iHashCode5 + (structurableText == null ? 0 : structurableText.hashCode())) * 31;
        List<EmbedField> list = this.fields;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.url;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.rawDescription;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        StructurableText structurableText2 = this.description;
        int iHashCode10 = (iHashCode9 + (structurableText2 == null ? 0 : structurableText2.hashCode())) * 31;
        EmbedMedia embedMedia = this.image;
        int iHashCode11 = (iHashCode10 + (embedMedia == null ? 0 : embedMedia.hashCode())) * 31;
        List<EmbedMedia> list2 = this.images;
        int iHashCode12 = (iHashCode11 + (list2 == null ? 0 : list2.hashCode())) * 31;
        EmbedMedia embedMedia2 = this.video;
        int iHashCode13 = (iHashCode12 + (embedMedia2 == null ? 0 : embedMedia2.hashCode())) * 31;
        EmbedThumbnail embedThumbnail = this.thumbnail;
        int iHashCode14 = (iHashCode13 + (embedThumbnail == null ? 0 : embedThumbnail.hashCode())) * 31;
        String str5 = this.numAttachments;
        int iHashCode15 = (iHashCode14 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.attachmentsSize;
        int iHashCode16 = (iHashCode15 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.messageSendError;
        int iHashCode17 = (iHashCode16 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool = this.disableBackgroundColor;
        int iHashCode18 = (iHashCode17 + (bool == null ? 0 : bool.hashCode())) * 31;
        EmbedFooter embedFooter = this.footer;
        int iHashCode19 = (iHashCode18 + (embedFooter == null ? 0 : embedFooter.hashCode())) * 31;
        String str8 = this.spoiler;
        int iHashCode20 = (iHashCode19 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.obscure;
        int iHashCode21 = (iHashCode20 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.obscureAwaitingScan;
        int iHashCode22 = (iHashCode21 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Boolean bool2 = this.obscureHideControls;
        int iHashCode23 = (iHashCode22 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.obscureIsOpaque;
        int iHashCode24 = (iHashCode23 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.verifyAge;
        int iHashCode25 = (iHashCode24 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str11 = this.iconURL;
        int iHashCode26 = (iHashCode25 + (str11 == null ? 0 : str11.hashCode())) * 31;
        List<Component> list3 = this.components;
        int iHashCode27 = (iHashCode26 + (list3 == null ? 0 : list3.hashCode())) * 31;
        EmbedFailureState embedFailureState = this.failureState;
        int iHashCode28 = (iHashCode27 + (embedFailureState == null ? 0 : embedFailureState.hashCode())) * 31;
        Integer num = this.providerColor;
        int iHashCode29 = (iHashCode28 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.borderLeftColor;
        int iHashCode30 = (iHashCode29 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.headerTextColor;
        int iU = com.discord.chat.presentation.list.a.u(this.bodyTextColor, (iHashCode30 + (num3 == null ? 0 : num3.hashCode())) * 31, 31);
        Integer num4 = this.backgroundColor;
        return iU + (num4 != null ? num4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        EmbedType embedType = this.type;
        String str = this.id;
        EmbedAuthor embedAuthor = this.author;
        EmbedProvider embedProvider = this.provider;
        String str2 = this.rawTitle;
        StructurableText structurableText = this.title;
        List<EmbedField> list = this.fields;
        String str3 = this.url;
        String str4 = this.rawDescription;
        StructurableText structurableText2 = this.description;
        EmbedMedia embedMedia = this.image;
        List<EmbedMedia> list2 = this.images;
        EmbedMedia embedMedia2 = this.video;
        EmbedThumbnail embedThumbnail = this.thumbnail;
        String str5 = this.numAttachments;
        String str6 = this.attachmentsSize;
        String str7 = this.messageSendError;
        Boolean bool = this.disableBackgroundColor;
        EmbedFooter embedFooter = this.footer;
        String str8 = this.spoiler;
        String str9 = this.obscure;
        String str10 = this.obscureAwaitingScan;
        Boolean bool2 = this.obscureHideControls;
        Boolean bool3 = this.obscureIsOpaque;
        Boolean bool4 = this.verifyAge;
        String str11 = this.iconURL;
        List<Component> list3 = this.components;
        EmbedFailureState embedFailureState = this.failureState;
        Integer num = this.providerColor;
        Integer num2 = this.borderLeftColor;
        Integer num3 = this.headerTextColor;
        int i7 = this.bodyTextColor;
        Integer num4 = this.backgroundColor;
        StringBuilder sb2 = new StringBuilder("Embed(type=");
        sb2.append(embedType);
        sb2.append(", id=");
        sb2.append(str);
        sb2.append(", author=");
        sb2.append(embedAuthor);
        sb2.append(", provider=");
        sb2.append(embedProvider);
        sb2.append(", rawTitle=");
        sb2.append(str2);
        sb2.append(", title=");
        sb2.append(structurableText);
        sb2.append(", fields=");
        sb2.append(list);
        sb2.append(", url=");
        sb2.append(str3);
        sb2.append(", rawDescription=");
        sb2.append(str4);
        sb2.append(", description=");
        sb2.append(structurableText2);
        sb2.append(", image=");
        sb2.append(embedMedia);
        sb2.append(", images=");
        sb2.append(list2);
        sb2.append(", video=");
        sb2.append(embedMedia2);
        sb2.append(", thumbnail=");
        sb2.append(embedThumbnail);
        sb2.append(", numAttachments=");
        e.A(sb2, str5, ", attachmentsSize=", str6, ", messageSendError=");
        sb2.append(str7);
        sb2.append(", disableBackgroundColor=");
        sb2.append(bool);
        sb2.append(", footer=");
        sb2.append(embedFooter);
        sb2.append(", spoiler=");
        sb2.append(str8);
        sb2.append(", obscure=");
        e.A(sb2, str9, ", obscureAwaitingScan=", str10, ", obscureHideControls=");
        sb2.append(bool2);
        sb2.append(", obscureIsOpaque=");
        sb2.append(bool3);
        sb2.append(", verifyAge=");
        sb2.append(bool4);
        sb2.append(", iconURL=");
        sb2.append(str11);
        sb2.append(", components=");
        sb2.append(list3);
        sb2.append(", failureState=");
        sb2.append(embedFailureState);
        sb2.append(", providerColor=");
        kk.b.s(sb2, num, ", borderLeftColor=", num2, ", headerTextColor=");
        sb2.append(num3);
        sb2.append(", bodyTextColor=");
        sb2.append(i7);
        sb2.append(", backgroundColor=");
        sb2.append(num4);
        sb2.append(")");
        return sb2.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Embed(@NotNull EmbedType type, String str, EmbedAuthor embedAuthor, EmbedProvider embedProvider, String str2, StructurableText structurableText, List<EmbedField> list, String str3, String str4, StructurableText structurableText2, EmbedMedia embedMedia, List<EmbedMedia> list2, EmbedMedia embedMedia2, EmbedThumbnail embedThumbnail, String str5, String str6, String str7, Boolean bool, EmbedFooter embedFooter, String str8, String str9, String str10, Boolean bool2, Boolean bool3, Boolean bool4, String str11, List<? extends Component> list3, EmbedFailureState embedFailureState, Integer num, Integer num2, Integer num3, int i7, Integer num4) {
        String str12 = str8;
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.id = str;
        this.author = embedAuthor;
        this.provider = embedProvider;
        this.rawTitle = str2;
        this.title = structurableText;
        this.fields = list;
        this.url = str3;
        this.rawDescription = str4;
        this.description = structurableText2;
        this.image = embedMedia;
        this.images = list2;
        this.video = embedMedia2;
        this.thumbnail = embedThumbnail;
        this.numAttachments = str5;
        this.attachmentsSize = str6;
        this.messageSendError = str7;
        this.disableBackgroundColor = bool;
        this.footer = embedFooter;
        this.spoiler = str12;
        this.obscure = str9;
        this.obscureAwaitingScan = str10;
        this.obscureHideControls = bool2;
        this.obscureIsOpaque = bool3;
        this.verifyAge = bool4;
        this.iconURL = str11;
        this.components = list3;
        this.failureState = embedFailureState;
        this.providerColor = num;
        this.borderLeftColor = num2;
        this.headerTextColor = num3;
        this.bodyTextColor = i7;
        this.backgroundColor = num4;
        String str13 = null;
        this.spoilerOrNull = (str12 == null || StringsKt.K(str12)) ? null : str12;
        if (str9 != null && !StringsKt.K(str9)) {
            str13 = str9;
        }
        this.obscureOrNull = str13;
    }

    public /* synthetic */ Embed(EmbedType embedType, String str, EmbedAuthor embedAuthor, EmbedProvider embedProvider, String str2, StructurableText structurableText, List list, String str3, String str4, StructurableText structurableText2, EmbedMedia embedMedia, List list2, EmbedMedia embedMedia2, EmbedThumbnail embedThumbnail, String str5, String str6, String str7, Boolean bool, EmbedFooter embedFooter, String str8, String str9, String str10, Boolean bool2, Boolean bool3, Boolean bool4, String str11, List list3, EmbedFailureState embedFailureState, Integer num, Integer num2, Integer num3, int i7, Integer num4, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(embedType, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : embedAuthor, (i10 & 8) != 0 ? null : embedProvider, (i10 & 16) != 0 ? null : str2, (i10 & 32) != 0 ? null : structurableText, (i10 & 64) != 0 ? null : list, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? null : str3, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : str4, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? null : structurableText2, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? null : embedMedia, (i10 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? null : list2, (i10 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : embedMedia2, (i10 & 8192) != 0 ? null : embedThumbnail, (i10 & 16384) != 0 ? null : str5, (32768 & i10) != 0 ? null : str6, (65536 & i10) != 0 ? null : str7, (131072 & i10) != 0 ? null : bool, (262144 & i10) != 0 ? null : embedFooter, (524288 & i10) != 0 ? null : str8, (1048576 & i10) != 0 ? null : str9, (2097152 & i10) != 0 ? null : str10, (4194304 & i10) != 0 ? null : bool2, (8388608 & i10) != 0 ? null : bool3, (16777216 & i10) != 0 ? null : bool4, (33554432 & i10) != 0 ? null : str11, (67108864 & i10) != 0 ? null : list3, (134217728 & i10) != 0 ? null : embedFailureState, (268435456 & i10) != 0 ? null : num, (536870912 & i10) != 0 ? null : num2, (i10 & 1073741824) != 0 ? null : num3, i7, (i11 & 1) != 0 ? null : num4);
    }
}
