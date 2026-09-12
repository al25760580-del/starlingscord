package com.discord.chat.bridge.codedlinks;

import a3.e;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.modules.dialog.AlertFragment;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.PointerEventHelper;
import i5.a;
import java.util.List;
import java.util.Map;
import kk.b;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kr.f;
import or.d;
import or.g;
import or.h0;
import or.m0;
import or.s1;
import org.jetbrains.annotations.NotNull;
import org.webrtc.PeerConnection;
import rn.l;
import rn.m;

/* JADX INFO: loaded from: classes.dex */
@f
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010 \n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b^\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 £\u00012\u00020\u00012\u00020\u0002:\u0004¢\u0001£\u0001Bñ\u0003\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0003\u0010\b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010\"\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010$\u001a\u00020\n\u0012\b\b\u0002\u0010%\u001a\u00020\n\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\n\u0012\u001c\b\u0002\u0010*\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060,\u0018\u00010+\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u00100\u001a\u00020\n\u0012\u0010\b\u0002\u00101\u001a\n\u0012\u0004\u0012\u000202\u0018\u00010+¢\u0006\u0004\b3\u00104BÅ\u0003\b\u0010\u0012\u0006\u00105\u001a\u00020\u0006\u0012\u0006\u00106\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010 \u001a\u0004\u0018\u00010\n\u0012\b\u0010!\u001a\u0004\u0018\u00010\n\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010#\u001a\u0004\u0018\u00010\n\u0012\b\u0010$\u001a\u0004\u0018\u00010\n\u0012\b\u0010%\u001a\u0004\u0018\u00010\n\u0012\b\u0010&\u001a\u0004\u0018\u00010\n\u0012\b\u0010'\u001a\u0004\u0018\u00010\n\u0012\b\u0010(\u001a\u0004\u0018\u00010\n\u0012\b\u0010)\u001a\u0004\u0018\u00010\n\u0012\u001a\u0010*\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060,\u0018\u00010+\u0012\b\u0010-\u001a\u0004\u0018\u00010\n\u0012\b\u0010.\u001a\u0004\u0018\u00010\n\u0012\b\u0010/\u001a\u0004\u0018\u00010\n\u0012\b\u00100\u001a\u0004\u0018\u00010\n\u0012\u000e\u00101\u001a\n\u0012\u0004\u0012\u000202\u0018\u00010+\u0012\b\u00107\u001a\u0004\u0018\u000108¢\u0006\u0004\b3\u00109J\t\u0010k\u001a\u00020\u0004HÆ\u0003J\t\u0010l\u001a\u00020\u0006HÆ\u0003J\t\u0010m\u001a\u00020\u0006HÆ\u0003J\t\u0010n\u001a\u00020\u0006HÆ\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0010\u0010q\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010EJ\u0010\u0010r\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010EJ\u0010\u0010s\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010EJ\u000b\u0010t\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010u\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0010\u0010v\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010EJ\u0010\u0010w\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u0010MJ\u0010\u0010x\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u0010MJ\u0010\u0010y\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010EJ\u0010\u0010z\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010EJ\u0010\u0010{\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u0010MJ\u0010\u0010|\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010EJ\u000b\u0010}\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010~\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\u007f\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0011\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010EJ\u0011\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010EJ\u0011\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010EJ\f\u0010\u0083\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\f\u0010\u0084\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0011\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010EJ\f\u0010\u0086\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\n\u0010\u0087\u0001\u001a\u00020\nHÆ\u0003J\n\u0010\u0088\u0001\u001a\u00020\nHÆ\u0003J\f\u0010\u0089\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\f\u0010\u008a\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\f\u0010\u008b\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\f\u0010\u008c\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\u001e\u0010\u008d\u0001\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060,\u0018\u00010+HÆ\u0003J\f\u0010\u008e\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\f\u0010\u008f\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\f\u0010\u0090\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\n\u0010\u0091\u0001\u001a\u00020\nHÆ\u0003J\u0012\u0010\u0092\u0001\u001a\n\u0012\u0004\u0012\u000202\u0018\u00010+HÆ\u0003Jú\u0003\u0010\u0093\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\"\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010$\u001a\u00020\n2\b\b\u0002\u0010%\u001a\u00020\n2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\n2\u001c\b\u0002\u0010*\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060,\u0018\u00010+2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\n2\b\b\u0002\u00100\u001a\u00020\n2\u0010\b\u0002\u00101\u001a\n\u0012\u0004\u0012\u000202\u0018\u00010+HÆ\u0001¢\u0006\u0003\u0010\u0094\u0001J\u0016\u0010\u0095\u0001\u001a\u00020\u00142\n\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u0097\u0001HÖ\u0003J\n\u0010\u0098\u0001\u001a\u00020\u0006HÖ\u0001J\n\u0010\u0099\u0001\u001a\u00020\nHÖ\u0001J-\u0010\u009a\u0001\u001a\u00030\u009b\u00012\u0007\u0010\u009c\u0001\u001a\u00020\u00002\b\u0010\u009d\u0001\u001a\u00030\u009e\u00012\b\u0010\u009f\u0001\u001a\u00030 \u0001H\u0001¢\u0006\u0003\b¡\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0014\u0010\u0007\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010=R\u0014\u0010\b\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010=R\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0018\u0010\r\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\n\n\u0002\u0010F\u001a\u0004\bD\u0010ER\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\n\n\u0002\u0010F\u001a\u0004\bG\u0010ER\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\n\n\u0002\u0010F\u001a\u0004\bH\u0010ER\u0016\u0010\u0010\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u0010AR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010AR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\n\n\u0002\u0010F\u001a\u0004\bK\u0010ER\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0096\u0004¢\u0006\n\n\u0002\u0010N\u001a\u0004\bL\u0010MR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u0014X\u0096\u0004¢\u0006\n\n\u0002\u0010N\u001a\u0004\bO\u0010MR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\n\n\u0002\u0010F\u001a\u0004\bP\u0010ER\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\n\n\u0002\u0010F\u001a\u0004\bQ\u0010ER\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u0014X\u0096\u0004¢\u0006\n\n\u0002\u0010N\u001a\u0004\bR\u0010MR\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\n\n\u0002\u0010F\u001a\u0004\bS\u0010ER\u0016\u0010\u001a\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bT\u0010AR\u0016\u0010\u001b\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bU\u0010AR\u0016\u0010\u001c\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bV\u0010AR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\n\n\u0002\u0010F\u001a\u0004\bW\u0010ER\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\n\n\u0002\u0010F\u001a\u0004\bX\u0010ER\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\n\n\u0002\u0010F\u001a\u0004\bY\u0010ER\u0016\u0010 \u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010AR\u0016\u0010!\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b[\u0010AR\u0018\u0010\"\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\n\n\u0002\u0010F\u001a\u0004\b\\\u0010ER\u0016\u0010#\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b]\u0010AR\u0014\u0010$\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b^\u0010AR\u0014\u0010%\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b_\u0010AR\u0016\u0010&\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b`\u0010AR\u0016\u0010'\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\ba\u0010AR\u0016\u0010(\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bb\u0010AR\u0016\u0010)\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bc\u0010AR(\u0010*\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060,\u0018\u00010+X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bd\u0010eR\u0016\u0010-\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bf\u0010AR\u0016\u0010.\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bg\u0010AR\u0016\u0010/\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bh\u0010AR\u0014\u00100\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bi\u0010AR\u001c\u00101\u001a\n\u0012\u0004\u0012\u000202\u0018\u00010+X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bj\u0010e¨\u0006¤\u0001"}, d2 = {"Lcom/discord/chat/bridge/codedlinks/AppMessageEmbedImpl;", "Lcom/discord/chat/bridge/codedlinks/CodedLinkEmbed;", "Lcom/discord/chat/bridge/codedlinks/AppMessageEmbed;", "displayType", "Lcom/discord/chat/bridge/codedlinks/AppMessageEmbedDisplayType;", ViewProps.BACKGROUND_COLOR, "", ViewProps.BORDER_COLOR, "headerColor", "headerText", "", "type", "Lcom/discord/chat/bridge/codedlinks/InviteType;", "acceptLabelBackgroundColor", "acceptLabelBorderColor", "acceptLabelColor", "acceptLabelText", "bodyText", "bodyTextColor", "canBeAccepted", "", "embedCanBeTapped", "resolvingGradientEnd", "resolvingGradientStart", "splashHasRadialGradient", "splashOpacity", "splashUrl", "inviteSplash", "subtitle", "subtitleColor", "thumbnailBackgroundColor", "thumbnailCornerRadius", "thumbnailText", "thumbnailUrl", "titleColor", "titleText", "appId", "messageId", AlertFragment.ARG_TITLE, "header", "info", "tagline", "gradientColors", "", "", "staticBannerSrc", "iconSrc", "embedUrl", "bannerRatio", "actions", "Lcom/discord/chat/bridge/codedlinks/AppMessageActionImpl;", "<init>", "(Lcom/discord/chat/bridge/codedlinks/AppMessageEmbedDisplayType;IIILjava/lang/String;Lcom/discord/chat/bridge/codedlinks/InviteType;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "seen0", "seen1", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILcom/discord/chat/bridge/codedlinks/AppMessageEmbedDisplayType;IIILjava/lang/String;Lcom/discord/chat/bridge/codedlinks/InviteType;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getDisplayType", "()Lcom/discord/chat/bridge/codedlinks/AppMessageEmbedDisplayType;", "getBackgroundColor", "()I", "getBorderColor", "getHeaderColor", "getHeaderText", "()Ljava/lang/String;", "getType", "()Lcom/discord/chat/bridge/codedlinks/InviteType;", "getAcceptLabelBackgroundColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAcceptLabelBorderColor", "getAcceptLabelColor", "getAcceptLabelText", "getBodyText", "getBodyTextColor", "getCanBeAccepted", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getEmbedCanBeTapped", "getResolvingGradientEnd", "getResolvingGradientStart", "getSplashHasRadialGradient", "getSplashOpacity", "getSplashUrl", "getInviteSplash", "getSubtitle", "getSubtitleColor", "getThumbnailBackgroundColor", "getThumbnailCornerRadius", "getThumbnailText", "getThumbnailUrl", "getTitleColor", "getTitleText", "getAppId", "getMessageId", "getTitle", "getHeader", "getInfo", "getTagline", "getGradientColors", "()Ljava/util/List;", "getStaticBannerSrc", "getIconSrc", "getEmbedUrl", "getBannerRatio", "getActions", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "copy", "(Lcom/discord/chat/bridge/codedlinks/AppMessageEmbedDisplayType;IIILjava/lang/String;Lcom/discord/chat/bridge/codedlinks/InviteType;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/discord/chat/bridge/codedlinks/AppMessageEmbedImpl;", "equals", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class AppMessageEmbedImpl extends CodedLinkEmbed implements AppMessageEmbed {

    @NotNull
    private static final Lazy[] $childSerializers;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final Integer acceptLabelBackgroundColor;
    private final Integer acceptLabelBorderColor;
    private final Integer acceptLabelColor;
    private final String acceptLabelText;
    private final List<AppMessageActionImpl> actions;

    @NotNull
    private final String appId;
    private final int backgroundColor;

    @NotNull
    private final String bannerRatio;
    private final String bodyText;
    private final Integer bodyTextColor;
    private final int borderColor;
    private final Boolean canBeAccepted;

    @NotNull
    private final AppMessageEmbedDisplayType displayType;
    private final Boolean embedCanBeTapped;
    private final String embedUrl;
    private final List<Map<String, Integer>> gradientColors;
    private final String header;
    private final int headerColor;
    private final String headerText;
    private final String iconSrc;
    private final String info;
    private final String inviteSplash;

    @NotNull
    private final String messageId;
    private final Integer resolvingGradientEnd;
    private final Integer resolvingGradientStart;
    private final Boolean splashHasRadialGradient;
    private final Integer splashOpacity;
    private final String splashUrl;
    private final String staticBannerSrc;
    private final String subtitle;
    private final Integer subtitleColor;
    private final String tagline;
    private final Integer thumbnailBackgroundColor;
    private final Integer thumbnailCornerRadius;
    private final String thumbnailText;
    private final String thumbnailUrl;
    private final String title;
    private final Integer titleColor;
    private final String titleText;
    private final InviteType type;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/codedlinks/AppMessageEmbedImpl$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/codedlinks/AppMessageEmbedImpl;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return AppMessageEmbedImpl$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        m mVar = m.f19486e;
        $childSerializers = new Lazy[]{l.a(mVar, new a(26)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, l.a(mVar, new a(27)), null, null, null, null, l.a(mVar, new a(28))};
    }

    public AppMessageEmbedImpl() {
        this((AppMessageEmbedDisplayType) null, 0, 0, 0, (String) null, (InviteType) null, (Integer) null, (Integer) null, (Integer) null, (String) null, (String) null, (Integer) null, (Boolean) null, (Boolean) null, (Integer) null, (Integer) null, (Boolean) null, (Integer) null, (String) null, (String) null, (String) null, (Integer) null, (Integer) null, (Integer) null, (String) null, (String) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (List) null, -1, 255, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return AppMessageEmbedDisplayType.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new d(new h0(s1.f17602a, m0.f17573a, 1), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new d(AppMessageActionImpl$$serializer.INSTANCE, 0);
    }

    public static final /* synthetic */ void write$Self$chat_release(AppMessageEmbedImpl self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Lazy[] lazyArr = $childSerializers;
        if (output.u(serialDesc, 0) || self.getDisplayType() != AppMessageEmbedDisplayType.Display) {
            output.g(serialDesc, 0, (KSerializer) lazyArr[0].getValue(), self.getDisplayType());
        }
        if (output.u(serialDesc, 1) || self.getBackgroundColor() != 0) {
            output.l(1, self.getBackgroundColor(), serialDesc);
        }
        if (output.u(serialDesc, 2) || self.getBorderColor() != 0) {
            output.l(2, self.getBorderColor(), serialDesc);
        }
        if (output.u(serialDesc, 3) || self.getHeaderColor() != 0) {
            output.l(3, self.getHeaderColor(), serialDesc);
        }
        if (output.u(serialDesc, 4) || self.getHeaderText() != null) {
            output.r(serialDesc, 4, s1.f17602a, self.getHeaderText());
        }
        if (output.u(serialDesc, 5) || self.getType() != null) {
            output.r(serialDesc, 5, InviteType.Serializer.INSTANCE, self.getType());
        }
        if (output.u(serialDesc, 6) || self.getAcceptLabelBackgroundColor() != null) {
            output.r(serialDesc, 6, m0.f17573a, self.getAcceptLabelBackgroundColor());
        }
        if (output.u(serialDesc, 7) || self.getAcceptLabelBorderColor() != null) {
            output.r(serialDesc, 7, m0.f17573a, self.getAcceptLabelBorderColor());
        }
        if (output.u(serialDesc, 8) || self.getAcceptLabelColor() != null) {
            output.r(serialDesc, 8, m0.f17573a, self.getAcceptLabelColor());
        }
        if (output.u(serialDesc, 9) || self.getAcceptLabelText() != null) {
            output.r(serialDesc, 9, s1.f17602a, self.getAcceptLabelText());
        }
        if (output.u(serialDesc, 10) || self.getBodyText() != null) {
            output.r(serialDesc, 10, s1.f17602a, self.getBodyText());
        }
        if (output.u(serialDesc, 11) || self.getBodyTextColor() != null) {
            output.r(serialDesc, 11, m0.f17573a, self.getBodyTextColor());
        }
        if (output.u(serialDesc, 12) || self.getCanBeAccepted() != null) {
            output.r(serialDesc, 12, g.f17537a, self.getCanBeAccepted());
        }
        if (output.u(serialDesc, 13) || self.getEmbedCanBeTapped() != null) {
            output.r(serialDesc, 13, g.f17537a, self.getEmbedCanBeTapped());
        }
        if (output.u(serialDesc, 14) || self.getResolvingGradientEnd() != null) {
            output.r(serialDesc, 14, m0.f17573a, self.getResolvingGradientEnd());
        }
        if (output.u(serialDesc, 15) || self.getResolvingGradientStart() != null) {
            output.r(serialDesc, 15, m0.f17573a, self.getResolvingGradientStart());
        }
        if (output.u(serialDesc, 16) || self.getSplashHasRadialGradient() != null) {
            output.r(serialDesc, 16, g.f17537a, self.getSplashHasRadialGradient());
        }
        if (output.u(serialDesc, 17) || self.getSplashOpacity() != null) {
            output.r(serialDesc, 17, m0.f17573a, self.getSplashOpacity());
        }
        if (output.u(serialDesc, 18) || self.getSplashUrl() != null) {
            output.r(serialDesc, 18, s1.f17602a, self.getSplashUrl());
        }
        if (output.u(serialDesc, 19) || self.getInviteSplash() != null) {
            output.r(serialDesc, 19, s1.f17602a, self.getInviteSplash());
        }
        if (output.u(serialDesc, 20) || self.getSubtitle() != null) {
            output.r(serialDesc, 20, s1.f17602a, self.getSubtitle());
        }
        if (output.u(serialDesc, 21) || self.getSubtitleColor() != null) {
            output.r(serialDesc, 21, m0.f17573a, self.getSubtitleColor());
        }
        if (output.u(serialDesc, 22) || self.getThumbnailBackgroundColor() != null) {
            output.r(serialDesc, 22, m0.f17573a, self.getThumbnailBackgroundColor());
        }
        if (output.u(serialDesc, 23) || self.getThumbnailCornerRadius() != null) {
            output.r(serialDesc, 23, m0.f17573a, self.getThumbnailCornerRadius());
        }
        if (output.u(serialDesc, 24) || self.getThumbnailText() != null) {
            output.r(serialDesc, 24, s1.f17602a, self.getThumbnailText());
        }
        if (output.u(serialDesc, 25) || self.getThumbnailUrl() != null) {
            output.r(serialDesc, 25, s1.f17602a, self.getThumbnailUrl());
        }
        if (output.u(serialDesc, 26) || self.getTitleColor() != null) {
            output.r(serialDesc, 26, m0.f17573a, self.getTitleColor());
        }
        if (output.u(serialDesc, 27) || self.getTitleText() != null) {
            output.r(serialDesc, 27, s1.f17602a, self.getTitleText());
        }
        if (output.u(serialDesc, 28) || !Intrinsics.areEqual(self.getAppId(), "")) {
            output.q(serialDesc, 28, self.getAppId());
        }
        if (output.u(serialDesc, 29) || !Intrinsics.areEqual(self.getMessageId(), "")) {
            output.q(serialDesc, 29, self.getMessageId());
        }
        if (output.u(serialDesc, 30) || self.getTitle() != null) {
            output.r(serialDesc, 30, s1.f17602a, self.getTitle());
        }
        if (output.u(serialDesc, 31) || self.getHeader() != null) {
            output.r(serialDesc, 31, s1.f17602a, self.getHeader());
        }
        if (output.u(serialDesc, 32) || self.getInfo() != null) {
            output.r(serialDesc, 32, s1.f17602a, self.getInfo());
        }
        if (output.u(serialDesc, 33) || self.getTagline() != null) {
            output.r(serialDesc, 33, s1.f17602a, self.getTagline());
        }
        if (output.u(serialDesc, 34) || self.getGradientColors() != null) {
            output.r(serialDesc, 34, (KSerializer) lazyArr[34].getValue(), self.getGradientColors());
        }
        if (output.u(serialDesc, 35) || self.getStaticBannerSrc() != null) {
            output.r(serialDesc, 35, s1.f17602a, self.getStaticBannerSrc());
        }
        if (output.u(serialDesc, 36) || self.getIconSrc() != null) {
            output.r(serialDesc, 36, s1.f17602a, self.getIconSrc());
        }
        if (output.u(serialDesc, 37) || self.getEmbedUrl() != null) {
            output.r(serialDesc, 37, s1.f17602a, self.getEmbedUrl());
        }
        if (output.u(serialDesc, 38) || !Intrinsics.areEqual(self.getBannerRatio(), "")) {
            output.q(serialDesc, 38, self.getBannerRatio());
        }
        if (!output.u(serialDesc, 39) && self.getActions() == null) {
            return;
        }
        output.r(serialDesc, 39, (KSerializer) lazyArr[39].getValue(), self.getActions());
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AppMessageEmbedDisplayType getDisplayType() {
        return this.displayType;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getAcceptLabelText() {
        return this.acceptLabelText;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getBodyText() {
        return this.bodyText;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Integer getBodyTextColor() {
        return this.bodyTextColor;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Boolean getCanBeAccepted() {
        return this.canBeAccepted;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Boolean getEmbedCanBeTapped() {
        return this.embedCanBeTapped;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Integer getResolvingGradientEnd() {
        return this.resolvingGradientEnd;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Integer getResolvingGradientStart() {
        return this.resolvingGradientStart;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final Boolean getSplashHasRadialGradient() {
        return this.splashHasRadialGradient;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final Integer getSplashOpacity() {
        return this.splashOpacity;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getSplashUrl() {
        return this.splashUrl;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getInviteSplash() {
        return this.inviteSplash;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final Integer getSubtitleColor() {
        return this.subtitleColor;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final Integer getThumbnailBackgroundColor() {
        return this.thumbnailBackgroundColor;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final Integer getThumbnailCornerRadius() {
        return this.thumbnailCornerRadius;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getThumbnailText() {
        return this.thumbnailText;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final Integer getTitleColor() {
        return this.titleColor;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final String getTitleText() {
        return this.titleText;
    }

    @NotNull
    /* JADX INFO: renamed from: component29, reason: from getter */
    public final String getAppId() {
        return this.appId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getBorderColor() {
        return this.borderColor;
    }

    @NotNull
    /* JADX INFO: renamed from: component30, reason: from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    /* JADX INFO: renamed from: component31, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component32, reason: from getter */
    public final String getHeader() {
        return this.header;
    }

    /* JADX INFO: renamed from: component33, reason: from getter */
    public final String getInfo() {
        return this.info;
    }

    /* JADX INFO: renamed from: component34, reason: from getter */
    public final String getTagline() {
        return this.tagline;
    }

    public final List<Map<String, Integer>> component35() {
        return this.gradientColors;
    }

    /* JADX INFO: renamed from: component36, reason: from getter */
    public final String getStaticBannerSrc() {
        return this.staticBannerSrc;
    }

    /* JADX INFO: renamed from: component37, reason: from getter */
    public final String getIconSrc() {
        return this.iconSrc;
    }

    /* JADX INFO: renamed from: component38, reason: from getter */
    public final String getEmbedUrl() {
        return this.embedUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component39, reason: from getter */
    public final String getBannerRatio() {
        return this.bannerRatio;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getHeaderColor() {
        return this.headerColor;
    }

    public final List<AppMessageActionImpl> component40() {
        return this.actions;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getHeaderText() {
        return this.headerText;
    }

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
    public final AppMessageEmbedImpl copy(@NotNull AppMessageEmbedDisplayType displayType, int backgroundColor, int borderColor, int headerColor, String headerText, InviteType type, Integer acceptLabelBackgroundColor, Integer acceptLabelBorderColor, Integer acceptLabelColor, String acceptLabelText, String bodyText, Integer bodyTextColor, Boolean canBeAccepted, Boolean embedCanBeTapped, Integer resolvingGradientEnd, Integer resolvingGradientStart, Boolean splashHasRadialGradient, Integer splashOpacity, String splashUrl, String inviteSplash, String subtitle, Integer subtitleColor, Integer thumbnailBackgroundColor, Integer thumbnailCornerRadius, String thumbnailText, String thumbnailUrl, Integer titleColor, String titleText, @NotNull String appId, @NotNull String messageId, String title, String header, String info, String tagline, List<? extends Map<String, Integer>> gradientColors, String staticBannerSrc, String iconSrc, String embedUrl, @NotNull String bannerRatio, List<AppMessageActionImpl> actions) {
        Intrinsics.checkNotNullParameter(displayType, "displayType");
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(bannerRatio, "bannerRatio");
        return new AppMessageEmbedImpl(displayType, backgroundColor, borderColor, headerColor, headerText, type, acceptLabelBackgroundColor, acceptLabelBorderColor, acceptLabelColor, acceptLabelText, bodyText, bodyTextColor, canBeAccepted, embedCanBeTapped, resolvingGradientEnd, resolvingGradientStart, splashHasRadialGradient, splashOpacity, splashUrl, inviteSplash, subtitle, subtitleColor, thumbnailBackgroundColor, thumbnailCornerRadius, thumbnailText, thumbnailUrl, titleColor, titleText, appId, messageId, title, header, info, tagline, gradientColors, staticBannerSrc, iconSrc, embedUrl, bannerRatio, actions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppMessageEmbedImpl)) {
            return false;
        }
        AppMessageEmbedImpl appMessageEmbedImpl = (AppMessageEmbedImpl) other;
        return this.displayType == appMessageEmbedImpl.displayType && this.backgroundColor == appMessageEmbedImpl.backgroundColor && this.borderColor == appMessageEmbedImpl.borderColor && this.headerColor == appMessageEmbedImpl.headerColor && Intrinsics.areEqual(this.headerText, appMessageEmbedImpl.headerText) && this.type == appMessageEmbedImpl.type && Intrinsics.areEqual(this.acceptLabelBackgroundColor, appMessageEmbedImpl.acceptLabelBackgroundColor) && Intrinsics.areEqual(this.acceptLabelBorderColor, appMessageEmbedImpl.acceptLabelBorderColor) && Intrinsics.areEqual(this.acceptLabelColor, appMessageEmbedImpl.acceptLabelColor) && Intrinsics.areEqual(this.acceptLabelText, appMessageEmbedImpl.acceptLabelText) && Intrinsics.areEqual(this.bodyText, appMessageEmbedImpl.bodyText) && Intrinsics.areEqual(this.bodyTextColor, appMessageEmbedImpl.bodyTextColor) && Intrinsics.areEqual(this.canBeAccepted, appMessageEmbedImpl.canBeAccepted) && Intrinsics.areEqual(this.embedCanBeTapped, appMessageEmbedImpl.embedCanBeTapped) && Intrinsics.areEqual(this.resolvingGradientEnd, appMessageEmbedImpl.resolvingGradientEnd) && Intrinsics.areEqual(this.resolvingGradientStart, appMessageEmbedImpl.resolvingGradientStart) && Intrinsics.areEqual(this.splashHasRadialGradient, appMessageEmbedImpl.splashHasRadialGradient) && Intrinsics.areEqual(this.splashOpacity, appMessageEmbedImpl.splashOpacity) && Intrinsics.areEqual(this.splashUrl, appMessageEmbedImpl.splashUrl) && Intrinsics.areEqual(this.inviteSplash, appMessageEmbedImpl.inviteSplash) && Intrinsics.areEqual(this.subtitle, appMessageEmbedImpl.subtitle) && Intrinsics.areEqual(this.subtitleColor, appMessageEmbedImpl.subtitleColor) && Intrinsics.areEqual(this.thumbnailBackgroundColor, appMessageEmbedImpl.thumbnailBackgroundColor) && Intrinsics.areEqual(this.thumbnailCornerRadius, appMessageEmbedImpl.thumbnailCornerRadius) && Intrinsics.areEqual(this.thumbnailText, appMessageEmbedImpl.thumbnailText) && Intrinsics.areEqual(this.thumbnailUrl, appMessageEmbedImpl.thumbnailUrl) && Intrinsics.areEqual(this.titleColor, appMessageEmbedImpl.titleColor) && Intrinsics.areEqual(this.titleText, appMessageEmbedImpl.titleText) && Intrinsics.areEqual(this.appId, appMessageEmbedImpl.appId) && Intrinsics.areEqual(this.messageId, appMessageEmbedImpl.messageId) && Intrinsics.areEqual(this.title, appMessageEmbedImpl.title) && Intrinsics.areEqual(this.header, appMessageEmbedImpl.header) && Intrinsics.areEqual(this.info, appMessageEmbedImpl.info) && Intrinsics.areEqual(this.tagline, appMessageEmbedImpl.tagline) && Intrinsics.areEqual(this.gradientColors, appMessageEmbedImpl.gradientColors) && Intrinsics.areEqual(this.staticBannerSrc, appMessageEmbedImpl.staticBannerSrc) && Intrinsics.areEqual(this.iconSrc, appMessageEmbedImpl.iconSrc) && Intrinsics.areEqual(this.embedUrl, appMessageEmbedImpl.embedUrl) && Intrinsics.areEqual(this.bannerRatio, appMessageEmbedImpl.bannerRatio) && Intrinsics.areEqual(this.actions, appMessageEmbedImpl.actions);
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

    @Override // com.discord.chat.bridge.codedlinks.AppMessageEmbed
    public List<AppMessageActionImpl> getActions() {
        return this.actions;
    }

    @Override // com.discord.chat.bridge.codedlinks.AppMessageEmbed
    @NotNull
    public String getAppId() {
        return this.appId;
    }

    @Override // com.discord.chat.bridge.codedlinks.CodedLinkEmbed
    public int getBackgroundColor() {
        return this.backgroundColor;
    }

    @Override // com.discord.chat.bridge.codedlinks.AppMessageEmbed
    @NotNull
    public String getBannerRatio() {
        return this.bannerRatio;
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

    @Override // com.discord.chat.bridge.codedlinks.AppMessageEmbed
    @NotNull
    public AppMessageEmbedDisplayType getDisplayType() {
        return this.displayType;
    }

    @Override // com.discord.chat.bridge.codedlinks.CodedLinkEmbed
    public Boolean getEmbedCanBeTapped() {
        return this.embedCanBeTapped;
    }

    @Override // com.discord.chat.bridge.codedlinks.AppMessageEmbed
    public String getEmbedUrl() {
        return this.embedUrl;
    }

    @Override // com.discord.chat.bridge.codedlinks.AppMessageEmbed
    public List<Map<String, Integer>> getGradientColors() {
        return this.gradientColors;
    }

    @Override // com.discord.chat.bridge.codedlinks.AppMessageEmbed
    public String getHeader() {
        return this.header;
    }

    @Override // com.discord.chat.bridge.codedlinks.CodedLinkEmbed
    public int getHeaderColor() {
        return this.headerColor;
    }

    @Override // com.discord.chat.bridge.codedlinks.CodedLinkEmbed
    public String getHeaderText() {
        return this.headerText;
    }

    @Override // com.discord.chat.bridge.codedlinks.AppMessageEmbed
    public String getIconSrc() {
        return this.iconSrc;
    }

    @Override // com.discord.chat.bridge.codedlinks.AppMessageEmbed
    public String getInfo() {
        return this.info;
    }

    @Override // com.discord.chat.bridge.codedlinks.CodedLinkEmbed
    public String getInviteSplash() {
        return this.inviteSplash;
    }

    @Override // com.discord.chat.bridge.codedlinks.AppMessageEmbed
    @NotNull
    public String getMessageId() {
        return this.messageId;
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

    @Override // com.discord.chat.bridge.codedlinks.AppMessageEmbed
    public String getStaticBannerSrc() {
        return this.staticBannerSrc;
    }

    @Override // com.discord.chat.bridge.codedlinks.CodedLinkEmbed
    public String getSubtitle() {
        return this.subtitle;
    }

    @Override // com.discord.chat.bridge.codedlinks.CodedLinkEmbed
    public Integer getSubtitleColor() {
        return this.subtitleColor;
    }

    @Override // com.discord.chat.bridge.codedlinks.AppMessageEmbed
    public String getTagline() {
        return this.tagline;
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

    @Override // com.discord.chat.bridge.codedlinks.AppMessageEmbed
    public String getTitle() {
        return this.title;
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
    public InviteType getType() {
        return this.type;
    }

    public int hashCode() {
        int iU = com.discord.chat.presentation.list.a.u(this.headerColor, com.discord.chat.presentation.list.a.u(this.borderColor, com.discord.chat.presentation.list.a.u(this.backgroundColor, this.displayType.hashCode() * 31, 31), 31), 31);
        String str = this.headerText;
        int iHashCode = (iU + (str == null ? 0 : str.hashCode())) * 31;
        InviteType inviteType = this.type;
        int iHashCode2 = (iHashCode + (inviteType == null ? 0 : inviteType.hashCode())) * 31;
        Integer num = this.acceptLabelBackgroundColor;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.acceptLabelBorderColor;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.acceptLabelColor;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str2 = this.acceptLabelText;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.bodyText;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num4 = this.bodyTextColor;
        int iHashCode8 = (iHashCode7 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Boolean bool = this.canBeAccepted;
        int iHashCode9 = (iHashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.embedCanBeTapped;
        int iHashCode10 = (iHashCode9 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num5 = this.resolvingGradientEnd;
        int iHashCode11 = (iHashCode10 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.resolvingGradientStart;
        int iHashCode12 = (iHashCode11 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Boolean bool3 = this.splashHasRadialGradient;
        int iHashCode13 = (iHashCode12 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Integer num7 = this.splashOpacity;
        int iHashCode14 = (iHashCode13 + (num7 == null ? 0 : num7.hashCode())) * 31;
        String str4 = this.splashUrl;
        int iHashCode15 = (iHashCode14 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.inviteSplash;
        int iHashCode16 = (iHashCode15 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.subtitle;
        int iHashCode17 = (iHashCode16 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num8 = this.subtitleColor;
        int iHashCode18 = (iHashCode17 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.thumbnailBackgroundColor;
        int iHashCode19 = (iHashCode18 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.thumbnailCornerRadius;
        int iHashCode20 = (iHashCode19 + (num10 == null ? 0 : num10.hashCode())) * 31;
        String str7 = this.thumbnailText;
        int iHashCode21 = (iHashCode20 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.thumbnailUrl;
        int iHashCode22 = (iHashCode21 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num11 = this.titleColor;
        int iHashCode23 = (iHashCode22 + (num11 == null ? 0 : num11.hashCode())) * 31;
        String str9 = this.titleText;
        int iD = e.d(e.d((iHashCode23 + (str9 == null ? 0 : str9.hashCode())) * 31, 31, this.appId), 31, this.messageId);
        String str10 = this.title;
        int iHashCode24 = (iD + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.header;
        int iHashCode25 = (iHashCode24 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.info;
        int iHashCode26 = (iHashCode25 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.tagline;
        int iHashCode27 = (iHashCode26 + (str13 == null ? 0 : str13.hashCode())) * 31;
        List<Map<String, Integer>> list = this.gradientColors;
        int iHashCode28 = (iHashCode27 + (list == null ? 0 : list.hashCode())) * 31;
        String str14 = this.staticBannerSrc;
        int iHashCode29 = (iHashCode28 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.iconSrc;
        int iHashCode30 = (iHashCode29 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.embedUrl;
        int iD2 = e.d((iHashCode30 + (str16 == null ? 0 : str16.hashCode())) * 31, 31, this.bannerRatio);
        List<AppMessageActionImpl> list2 = this.actions;
        return iD2 + (list2 != null ? list2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        AppMessageEmbedDisplayType appMessageEmbedDisplayType = this.displayType;
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
        Boolean bool2 = this.embedCanBeTapped;
        Integer num5 = this.resolvingGradientEnd;
        Integer num6 = this.resolvingGradientStart;
        Boolean bool3 = this.splashHasRadialGradient;
        Integer num7 = this.splashOpacity;
        String str4 = this.splashUrl;
        String str5 = this.inviteSplash;
        String str6 = this.subtitle;
        Integer num8 = this.subtitleColor;
        Integer num9 = this.thumbnailBackgroundColor;
        Integer num10 = this.thumbnailCornerRadius;
        String str7 = this.thumbnailText;
        String str8 = this.thumbnailUrl;
        Integer num11 = this.titleColor;
        String str9 = this.titleText;
        String str10 = this.appId;
        String str11 = this.messageId;
        String str12 = this.title;
        String str13 = this.header;
        String str14 = this.info;
        String str15 = this.tagline;
        List<Map<String, Integer>> list = this.gradientColors;
        String str16 = this.staticBannerSrc;
        String str17 = this.iconSrc;
        String str18 = this.embedUrl;
        String str19 = this.bannerRatio;
        List<AppMessageActionImpl> list2 = this.actions;
        StringBuilder sb2 = new StringBuilder("AppMessageEmbedImpl(displayType=");
        sb2.append(appMessageEmbedDisplayType);
        sb2.append(", backgroundColor=");
        sb2.append(i7);
        sb2.append(", borderColor=");
        e.z(sb2, i10, ", headerColor=", i11, ", headerText=");
        sb2.append(str);
        sb2.append(", type=");
        sb2.append(inviteType);
        sb2.append(", acceptLabelBackgroundColor=");
        b.s(sb2, num, ", acceptLabelBorderColor=", num2, ", acceptLabelColor=");
        b.r(num3, ", acceptLabelText=", str2, ", bodyText=", sb2);
        com.discord.chat.presentation.list.a.r(num4, str3, ", bodyTextColor=", ", canBeAccepted=", sb2);
        sb2.append(bool);
        sb2.append(", embedCanBeTapped=");
        sb2.append(bool2);
        sb2.append(", resolvingGradientEnd=");
        b.s(sb2, num5, ", resolvingGradientStart=", num6, ", splashHasRadialGradient=");
        sb2.append(bool3);
        sb2.append(", splashOpacity=");
        sb2.append(num7);
        sb2.append(", splashUrl=");
        e.A(sb2, str4, ", inviteSplash=", str5, ", subtitle=");
        com.discord.chat.presentation.list.a.r(num8, str6, ", subtitleColor=", ", thumbnailBackgroundColor=", sb2);
        b.s(sb2, num9, ", thumbnailCornerRadius=", num10, ", thumbnailText=");
        e.A(sb2, str7, ", thumbnailUrl=", str8, ", titleColor=");
        b.r(num11, ", titleText=", str9, ", appId=", sb2);
        e.A(sb2, str10, ", messageId=", str11, ", title=");
        e.A(sb2, str12, ", header=", str13, ", info=");
        e.A(sb2, str14, ", tagline=", str15, ", gradientColors=");
        sb2.append(list);
        sb2.append(", staticBannerSrc=");
        sb2.append(str16);
        sb2.append(", iconSrc=");
        e.A(sb2, str17, ", embedUrl=", str18, ", bannerRatio=");
        sb2.append(str19);
        sb2.append(", actions=");
        sb2.append(list2);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ AppMessageEmbedImpl(int i7, int i10, AppMessageEmbedDisplayType appMessageEmbedDisplayType, int i11, int i12, int i13, String str, InviteType inviteType, Integer num, Integer num2, Integer num3, String str2, String str3, Integer num4, Boolean bool, Boolean bool2, Integer num5, Integer num6, Boolean bool3, Integer num7, String str4, String str5, String str6, Integer num8, Integer num9, Integer num10, String str7, String str8, Integer num11, String str9, String str10, String str11, String str12, String str13, String str14, String str15, List list, String str16, String str17, String str18, String str19, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        this.displayType = (i7 & 1) == 0 ? AppMessageEmbedDisplayType.Display : appMessageEmbedDisplayType;
        if ((i7 & 2) == 0) {
            this.backgroundColor = 0;
        } else {
            this.backgroundColor = i11;
        }
        if ((i7 & 4) == 0) {
            this.borderColor = 0;
        } else {
            this.borderColor = i12;
        }
        if ((i7 & 8) == 0) {
            this.headerColor = 0;
        } else {
            this.headerColor = i13;
        }
        if ((i7 & 16) == 0) {
            this.headerText = null;
        } else {
            this.headerText = str;
        }
        if ((i7 & 32) == 0) {
            this.type = null;
        } else {
            this.type = inviteType;
        }
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
            this.acceptLabelText = null;
        } else {
            this.acceptLabelText = str2;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) == 0) {
            this.bodyText = null;
        } else {
            this.bodyText = str3;
        }
        if ((i7 & RecyclerView.ItemAnimator.FLAG_MOVED) == 0) {
            this.bodyTextColor = null;
        } else {
            this.bodyTextColor = num4;
        }
        if ((i7 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) == 0) {
            this.canBeAccepted = null;
        } else {
            this.canBeAccepted = bool;
        }
        if ((i7 & 8192) == 0) {
            this.embedCanBeTapped = null;
        } else {
            this.embedCanBeTapped = bool2;
        }
        if ((i7 & 16384) == 0) {
            this.resolvingGradientEnd = null;
        } else {
            this.resolvingGradientEnd = num5;
        }
        if ((32768 & i7) == 0) {
            this.resolvingGradientStart = null;
        } else {
            this.resolvingGradientStart = num6;
        }
        if ((65536 & i7) == 0) {
            this.splashHasRadialGradient = null;
        } else {
            this.splashHasRadialGradient = bool3;
        }
        if ((131072 & i7) == 0) {
            this.splashOpacity = null;
        } else {
            this.splashOpacity = num7;
        }
        if ((262144 & i7) == 0) {
            this.splashUrl = null;
        } else {
            this.splashUrl = str4;
        }
        if ((524288 & i7) == 0) {
            this.inviteSplash = null;
        } else {
            this.inviteSplash = str5;
        }
        if ((1048576 & i7) == 0) {
            this.subtitle = null;
        } else {
            this.subtitle = str6;
        }
        if ((2097152 & i7) == 0) {
            this.subtitleColor = null;
        } else {
            this.subtitleColor = num8;
        }
        if ((4194304 & i7) == 0) {
            this.thumbnailBackgroundColor = null;
        } else {
            this.thumbnailBackgroundColor = num9;
        }
        if ((8388608 & i7) == 0) {
            this.thumbnailCornerRadius = null;
        } else {
            this.thumbnailCornerRadius = num10;
        }
        if ((16777216 & i7) == 0) {
            this.thumbnailText = null;
        } else {
            this.thumbnailText = str7;
        }
        if ((33554432 & i7) == 0) {
            this.thumbnailUrl = null;
        } else {
            this.thumbnailUrl = str8;
        }
        if ((67108864 & i7) == 0) {
            this.titleColor = null;
        } else {
            this.titleColor = num11;
        }
        if ((134217728 & i7) == 0) {
            this.titleText = null;
        } else {
            this.titleText = str9;
        }
        if ((268435456 & i7) == 0) {
            this.appId = "";
        } else {
            this.appId = str10;
        }
        if ((536870912 & i7) == 0) {
            this.messageId = "";
        } else {
            this.messageId = str11;
        }
        if ((1073741824 & i7) == 0) {
            this.title = null;
        } else {
            this.title = str12;
        }
        if ((i7 & Integer.MIN_VALUE) == 0) {
            this.header = null;
        } else {
            this.header = str13;
        }
        if ((i10 & 1) == 0) {
            this.info = null;
        } else {
            this.info = str14;
        }
        if ((i10 & 2) == 0) {
            this.tagline = null;
        } else {
            this.tagline = str15;
        }
        if ((i10 & 4) == 0) {
            this.gradientColors = null;
        } else {
            this.gradientColors = list;
        }
        if ((i10 & 8) == 0) {
            this.staticBannerSrc = null;
        } else {
            this.staticBannerSrc = str16;
        }
        if ((i10 & 16) == 0) {
            this.iconSrc = null;
        } else {
            this.iconSrc = str17;
        }
        if ((i10 & 32) == 0) {
            this.embedUrl = null;
        } else {
            this.embedUrl = str18;
        }
        if ((i10 & 64) == 0) {
            this.bannerRatio = "";
        } else {
            this.bannerRatio = str19;
        }
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 0) {
            this.actions = null;
        } else {
            this.actions = list2;
        }
    }

    public /* synthetic */ AppMessageEmbedImpl(AppMessageEmbedDisplayType appMessageEmbedDisplayType, int i7, int i10, int i11, String str, InviteType inviteType, Integer num, Integer num2, Integer num3, String str2, String str3, Integer num4, Boolean bool, Boolean bool2, Integer num5, Integer num6, Boolean bool3, Integer num7, String str4, String str5, String str6, Integer num8, Integer num9, Integer num10, String str7, String str8, Integer num11, String str9, String str10, String str11, String str12, String str13, String str14, String str15, List list, String str16, String str17, String str18, String str19, List list2, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? AppMessageEmbedDisplayType.Display : appMessageEmbedDisplayType, (i12 & 2) != 0 ? 0 : i7, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) == 0 ? i11 : 0, (i12 & 16) != 0 ? null : str, (i12 & 32) != 0 ? null : inviteType, (i12 & 64) != 0 ? null : num, (i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? null : num2, (i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : num3, (i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? null : str2, (i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? null : str3, (i12 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? null : num4, (i12 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : bool, (i12 & 8192) != 0 ? null : bool2, (i12 & 16384) != 0 ? null : num5, (i12 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? null : num6, (i12 & 65536) != 0 ? null : bool3, (i12 & 131072) != 0 ? null : num7, (i12 & 262144) != 0 ? null : str4, (i12 & 524288) != 0 ? null : str5, (i12 & 1048576) != 0 ? null : str6, (i12 & 2097152) != 0 ? null : num8, (i12 & 4194304) != 0 ? null : num9, (i12 & 8388608) != 0 ? null : num10, (i12 & PointerEventHelper.X_FLAG_SUPPORTS_HOVER) != 0 ? null : str7, (i12 & 33554432) != 0 ? null : str8, (i12 & 67108864) != 0 ? null : num11, (i12 & 134217728) != 0 ? null : str9, (i12 & 268435456) != 0 ? "" : str10, (i12 & 536870912) != 0 ? "" : str11, (i12 & 1073741824) != 0 ? null : str12, (i12 & Integer.MIN_VALUE) != 0 ? null : str13, (i13 & 1) != 0 ? null : str14, (i13 & 2) != 0 ? null : str15, (i13 & 4) != 0 ? null : list, (i13 & 8) != 0 ? null : str16, (i13 & 16) != 0 ? null : str17, (i13 & 32) != 0 ? null : str18, (i13 & 64) == 0 ? str19 : "", (i13 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? null : list2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AppMessageEmbedImpl(@NotNull AppMessageEmbedDisplayType displayType, int i7, int i10, int i11, String str, InviteType inviteType, Integer num, Integer num2, Integer num3, String str2, String str3, Integer num4, Boolean bool, Boolean bool2, Integer num5, Integer num6, Boolean bool3, Integer num7, String str4, String str5, String str6, Integer num8, Integer num9, Integer num10, String str7, String str8, Integer num11, String str9, @NotNull String appId, @NotNull String messageId, String str10, String str11, String str12, String str13, List<? extends Map<String, Integer>> list, String str14, String str15, String str16, @NotNull String bannerRatio, List<AppMessageActionImpl> list2) {
        super(null);
        Intrinsics.checkNotNullParameter(displayType, "displayType");
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(bannerRatio, "bannerRatio");
        this.displayType = displayType;
        this.backgroundColor = i7;
        this.borderColor = i10;
        this.headerColor = i11;
        this.headerText = str;
        this.type = inviteType;
        this.acceptLabelBackgroundColor = num;
        this.acceptLabelBorderColor = num2;
        this.acceptLabelColor = num3;
        this.acceptLabelText = str2;
        this.bodyText = str3;
        this.bodyTextColor = num4;
        this.canBeAccepted = bool;
        this.embedCanBeTapped = bool2;
        this.resolvingGradientEnd = num5;
        this.resolvingGradientStart = num6;
        this.splashHasRadialGradient = bool3;
        this.splashOpacity = num7;
        this.splashUrl = str4;
        this.inviteSplash = str5;
        this.subtitle = str6;
        this.subtitleColor = num8;
        this.thumbnailBackgroundColor = num9;
        this.thumbnailCornerRadius = num10;
        this.thumbnailText = str7;
        this.thumbnailUrl = str8;
        this.titleColor = num11;
        this.titleText = str9;
        this.appId = appId;
        this.messageId = messageId;
        this.title = str10;
        this.header = str11;
        this.info = str12;
        this.tagline = str13;
        this.gradientColors = list;
        this.staticBannerSrc = str14;
        this.iconSrc = str15;
        this.embedUrl = str16;
        this.bannerRatio = bannerRatio;
        this.actions = list2;
    }
}
