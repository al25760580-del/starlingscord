package com.discord.chat.bridge.codedlinks;

import a3.e;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.bridge.structurabletext.AnnotatedStructurableText;
import com.discord.chat.bridge.structurabletext.AnnotatedStructurableTextSerializer;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.PointerEventHelper;
import i5.a;
import java.util.List;
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
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\bR\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u008f\u00012\u00020\u00012\u00020\u0002:\u0004\u008e\u0001\u008f\u0001B\u0081\u0003\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\b\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\b0$\u0012\u0006\u0010%\u001a\u00020&\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(\u0012\u0006\u0010)\u001a\u00020\b\u0012\u0006\u0010*\u001a\u00020\u0012¢\u0006\u0004\b+\u0010,Bë\u0002\b\u0010\u0012\u0006\u0010-\u001a\u00020\u0004\u0012\u0006\u0010.\u001a\u00020\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\b\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0004\u0012\b\u0010!\u001a\u0004\u0018\u00010\b\u0012\b\u0010\"\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010$\u0012\b\u0010%\u001a\u0004\u0018\u00010&\u0012\b\u0010'\u001a\u0004\u0018\u00010(\u0012\b\u0010)\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010*\u001a\u00020\u0012\u0012\b\u0010/\u001a\u0004\u0018\u000100¢\u0006\u0004\b+\u00101J\t\u0010^\u001a\u00020\u0004HÆ\u0003J\t\u0010_\u001a\u00020\u0004HÆ\u0003J\t\u0010`\u001a\u00020\u0004HÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0010\u0010c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010;J\u0010\u0010d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010;J\u0010\u0010e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010;J\u000b\u0010f\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010h\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010;J\u0010\u0010i\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010CJ\u0010\u0010j\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010CJ\u0010\u0010k\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010;J\u0010\u0010l\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010;J\u0010\u0010m\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010CJ\u0010\u0010n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010;J\u000b\u0010o\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010q\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010;J\u0010\u0010s\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010;J\u0010\u0010t\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010;J\u000b\u0010u\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010v\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010w\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010;J\u000b\u0010x\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010y\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000f\u0010z\u001a\b\u0012\u0004\u0012\u00020\b0$HÆ\u0003J\t\u0010{\u001a\u00020&HÆ\u0003J\u000b\u0010|\u001a\u0004\u0018\u00010(HÆ\u0003J\t\u0010}\u001a\u00020\bHÆ\u0003J\t\u0010~\u001a\u00020\u0012HÆ\u0003J\u0093\u0003\u0010\u007f\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00042\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\b0$2\b\b\u0002\u0010%\u001a\u00020&2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(2\b\b\u0002\u0010)\u001a\u00020\b2\b\b\u0002\u0010*\u001a\u00020\u0012HÆ\u0001¢\u0006\u0003\u0010\u0080\u0001J\u0016\u0010\u0081\u0001\u001a\u00020\u00122\n\u0010\u0082\u0001\u001a\u0005\u0018\u00010\u0083\u0001HÖ\u0003J\n\u0010\u0084\u0001\u001a\u00020\u0004HÖ\u0001J\n\u0010\u0085\u0001\u001a\u00020\bHÖ\u0001J-\u0010\u0086\u0001\u001a\u00030\u0087\u00012\u0007\u0010\u0088\u0001\u001a\u00020\u00002\b\u0010\u0089\u0001\u001a\u00030\u008a\u00012\b\u0010\u008b\u0001\u001a\u00030\u008c\u0001H\u0001¢\u0006\u0003\b\u008d\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0014\u0010\u0005\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00103R\u0014\u0010\u0006\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u00103R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\n\n\u0002\u0010<\u001a\u0004\b:\u0010;R\u0018\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\n\n\u0002\u0010<\u001a\u0004\b=\u0010;R\u0018\u0010\r\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\n\n\u0002\u0010<\u001a\u0004\b>\u0010;R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u00107R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u00107R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\n\n\u0002\u0010<\u001a\u0004\bA\u0010;R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0096\u0004¢\u0006\n\n\u0002\u0010D\u001a\u0004\bB\u0010CR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u0012X\u0096\u0004¢\u0006\n\n\u0002\u0010D\u001a\u0004\bE\u0010CR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\n\n\u0002\u0010<\u001a\u0004\bF\u0010;R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\n\n\u0002\u0010<\u001a\u0004\bG\u0010;R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u0012X\u0096\u0004¢\u0006\n\n\u0002\u0010D\u001a\u0004\bH\u0010CR\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\n\n\u0002\u0010<\u001a\u0004\bI\u0010;R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u00107R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bK\u00107R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bL\u00107R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\n\n\u0002\u0010<\u001a\u0004\bM\u0010;R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\n\n\u0002\u0010<\u001a\u0004\bN\u0010;R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\n\n\u0002\u0010<\u001a\u0004\bO\u0010;R\u0016\u0010\u001e\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bP\u00107R\u0016\u0010\u001f\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bQ\u00107R\u0018\u0010 \u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\n\n\u0002\u0010<\u001a\u0004\bR\u0010;R\u0016\u0010!\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bS\u00107R\u0016\u0010\"\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bT\u00107R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\b0$X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bU\u0010VR\u0014\u0010%\u001a\u00020&X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bW\u0010XR\u0016\u0010'\u001a\u0004\u0018\u00010(X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bY\u0010ZR\u0014\u0010)\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b[\u00107R\u0014\u0010*\u001a\u00020\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010]¨\u0006\u0090\u0001"}, d2 = {"Lcom/discord/chat/bridge/codedlinks/EmbeddedActivityInviteEmbedImpl;", "Lcom/discord/chat/bridge/codedlinks/CodedLinkEmbed;", "Lcom/discord/chat/bridge/codedlinks/EmbeddedActivityInviteEmbed;", ViewProps.BACKGROUND_COLOR, "", ViewProps.BORDER_COLOR, "headerColor", "headerText", "", "type", "Lcom/discord/chat/bridge/codedlinks/InviteType;", "acceptLabelBackgroundColor", "acceptLabelBorderColor", "acceptLabelColor", "acceptLabelText", "bodyText", "bodyTextColor", "canBeAccepted", "", "embedCanBeTapped", "resolvingGradientEnd", "resolvingGradientStart", "splashHasRadialGradient", "splashOpacity", "splashUrl", "inviteSplash", "subtitle", "subtitleColor", "thumbnailBackgroundColor", "thumbnailCornerRadius", "thumbnailText", "thumbnailUrl", "titleColor", "titleText", "channelIcon", "participantAvatarUris", "", "extendedType", "Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;", "structurableSubtitleText", "Lcom/discord/chat/bridge/structurabletext/AnnotatedStructurableText;", "noParticipantsText", "ctaEnabled", "<init>", "(IIILjava/lang/String;Lcom/discord/chat/bridge/codedlinks/InviteType;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;Lcom/discord/chat/bridge/structurabletext/AnnotatedStructurableText;Ljava/lang/String;Z)V", "seen0", "seen1", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IIIIILjava/lang/String;Lcom/discord/chat/bridge/codedlinks/InviteType;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;Lcom/discord/chat/bridge/structurabletext/AnnotatedStructurableText;Ljava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getBackgroundColor", "()I", "getBorderColor", "getHeaderColor", "getHeaderText", "()Ljava/lang/String;", "getType", "()Lcom/discord/chat/bridge/codedlinks/InviteType;", "getAcceptLabelBackgroundColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAcceptLabelBorderColor", "getAcceptLabelColor", "getAcceptLabelText", "getBodyText", "getBodyTextColor", "getCanBeAccepted", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getEmbedCanBeTapped", "getResolvingGradientEnd", "getResolvingGradientStart", "getSplashHasRadialGradient", "getSplashOpacity", "getSplashUrl", "getInviteSplash", "getSubtitle", "getSubtitleColor", "getThumbnailBackgroundColor", "getThumbnailCornerRadius", "getThumbnailText", "getThumbnailUrl", "getTitleColor", "getTitleText", "getChannelIcon", "getParticipantAvatarUris", "()Ljava/util/List;", "getExtendedType", "()Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;", "getStructurableSubtitleText", "()Lcom/discord/chat/bridge/structurabletext/AnnotatedStructurableText;", "getNoParticipantsText", "getCtaEnabled", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "copy", "(IIILjava/lang/String;Lcom/discord/chat/bridge/codedlinks/InviteType;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;Lcom/discord/chat/bridge/structurabletext/AnnotatedStructurableText;Ljava/lang/String;Z)Lcom/discord/chat/bridge/codedlinks/EmbeddedActivityInviteEmbedImpl;", "equals", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class EmbeddedActivityInviteEmbedImpl extends CodedLinkEmbed implements EmbeddedActivityInviteEmbed {
    private final Integer acceptLabelBackgroundColor;
    private final Integer acceptLabelBorderColor;
    private final Integer acceptLabelColor;
    private final String acceptLabelText;
    private final int backgroundColor;
    private final String bodyText;
    private final Integer bodyTextColor;
    private final int borderColor;
    private final Boolean canBeAccepted;
    private final String channelIcon;
    private final boolean ctaEnabled;
    private final Boolean embedCanBeTapped;

    @NotNull
    private final CodedLinkExtendedType extendedType;
    private final int headerColor;
    private final String headerText;
    private final String inviteSplash;

    @NotNull
    private final String noParticipantsText;

    @NotNull
    private final List<String> participantAvatarUris;
    private final Integer resolvingGradientEnd;
    private final Integer resolvingGradientStart;
    private final Boolean splashHasRadialGradient;
    private final Integer splashOpacity;
    private final String splashUrl;
    private final AnnotatedStructurableText structurableSubtitleText;
    private final String subtitle;
    private final Integer subtitleColor;
    private final Integer thumbnailBackgroundColor;
    private final Integer thumbnailCornerRadius;
    private final String thumbnailText;
    private final String thumbnailUrl;
    private final Integer titleColor;
    private final String titleText;
    private final InviteType type;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, l.a(m.f19486e, new a(29)), null, null, null, null};

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/codedlinks/EmbeddedActivityInviteEmbedImpl$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/codedlinks/EmbeddedActivityInviteEmbedImpl;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return EmbeddedActivityInviteEmbedImpl$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ EmbeddedActivityInviteEmbedImpl(int i7, int i10, int i11, int i12, int i13, String str, InviteType inviteType, Integer num, Integer num2, Integer num3, String str2, String str3, Integer num4, Boolean bool, Boolean bool2, Integer num5, Integer num6, Boolean bool3, Integer num7, String str4, String str5, String str6, Integer num8, Integer num9, Integer num10, String str7, String str8, Integer num11, String str9, String str10, List list, CodedLinkExtendedType codedLinkExtendedType, AnnotatedStructurableText annotatedStructurableText, String str11, boolean z5, SerializationConstructorMarker serializationConstructorMarker) {
        DefaultConstructorMarker defaultConstructorMarker = null;
        if ((-1342177265 != (i7 & (-1342177265))) || (1 != (i10 & 1))) {
            e1.k(new int[]{i7, i10}, new int[]{-1342177265, 1}, EmbeddedActivityInviteEmbedImpl$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        super(defaultConstructorMarker);
        this.backgroundColor = i11;
        this.borderColor = i12;
        this.headerColor = i13;
        this.headerText = str;
        if ((i7 & 16) == 0) {
            this.type = null;
        } else {
            this.type = inviteType;
        }
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
            this.embedCanBeTapped = null;
        } else {
            this.embedCanBeTapped = bool2;
        }
        if ((i7 & 8192) == 0) {
            this.resolvingGradientEnd = null;
        } else {
            this.resolvingGradientEnd = num5;
        }
        if ((i7 & 16384) == 0) {
            this.resolvingGradientStart = null;
        } else {
            this.resolvingGradientStart = num6;
        }
        if ((32768 & i7) == 0) {
            this.splashHasRadialGradient = null;
        } else {
            this.splashHasRadialGradient = bool3;
        }
        if ((65536 & i7) == 0) {
            this.splashOpacity = null;
        } else {
            this.splashOpacity = num7;
        }
        if ((131072 & i7) == 0) {
            this.splashUrl = null;
        } else {
            this.splashUrl = str4;
        }
        if ((262144 & i7) == 0) {
            this.inviteSplash = null;
        } else {
            this.inviteSplash = str5;
        }
        if ((524288 & i7) == 0) {
            this.subtitle = null;
        } else {
            this.subtitle = str6;
        }
        if ((1048576 & i7) == 0) {
            this.subtitleColor = null;
        } else {
            this.subtitleColor = num8;
        }
        if ((2097152 & i7) == 0) {
            this.thumbnailBackgroundColor = null;
        } else {
            this.thumbnailBackgroundColor = num9;
        }
        if ((4194304 & i7) == 0) {
            this.thumbnailCornerRadius = null;
        } else {
            this.thumbnailCornerRadius = num10;
        }
        if ((8388608 & i7) == 0) {
            this.thumbnailText = null;
        } else {
            this.thumbnailText = str7;
        }
        if ((16777216 & i7) == 0) {
            this.thumbnailUrl = null;
        } else {
            this.thumbnailUrl = str8;
        }
        if ((33554432 & i7) == 0) {
            this.titleColor = null;
        } else {
            this.titleColor = num11;
        }
        if ((67108864 & i7) == 0) {
            this.titleText = null;
        } else {
            this.titleText = str9;
        }
        if ((134217728 & i7) == 0) {
            this.channelIcon = null;
        } else {
            this.channelIcon = str10;
        }
        this.participantAvatarUris = list;
        this.extendedType = codedLinkExtendedType;
        if ((i7 & 1073741824) == 0) {
            this.structurableSubtitleText = null;
        } else {
            this.structurableSubtitleText = annotatedStructurableText;
        }
        this.noParticipantsText = str11;
        this.ctaEnabled = z5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(s1.f17602a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EmbeddedActivityInviteEmbedImpl copy$default(EmbeddedActivityInviteEmbedImpl embeddedActivityInviteEmbedImpl, int i7, int i10, int i11, String str, InviteType inviteType, Integer num, Integer num2, Integer num3, String str2, String str3, Integer num4, Boolean bool, Boolean bool2, Integer num5, Integer num6, Boolean bool3, Integer num7, String str4, String str5, String str6, Integer num8, Integer num9, Integer num10, String str7, String str8, Integer num11, String str9, String str10, List list, CodedLinkExtendedType codedLinkExtendedType, AnnotatedStructurableText annotatedStructurableText, String str11, boolean z5, int i12, int i13, Object obj) {
        boolean z6;
        String str12;
        int i14 = (i12 & 1) != 0 ? embeddedActivityInviteEmbedImpl.backgroundColor : i7;
        int i15 = (i12 & 2) != 0 ? embeddedActivityInviteEmbedImpl.borderColor : i10;
        int i16 = (i12 & 4) != 0 ? embeddedActivityInviteEmbedImpl.headerColor : i11;
        String str13 = (i12 & 8) != 0 ? embeddedActivityInviteEmbedImpl.headerText : str;
        InviteType inviteType2 = (i12 & 16) != 0 ? embeddedActivityInviteEmbedImpl.type : inviteType;
        Integer num12 = (i12 & 32) != 0 ? embeddedActivityInviteEmbedImpl.acceptLabelBackgroundColor : num;
        Integer num13 = (i12 & 64) != 0 ? embeddedActivityInviteEmbedImpl.acceptLabelBorderColor : num2;
        Integer num14 = (i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? embeddedActivityInviteEmbedImpl.acceptLabelColor : num3;
        String str14 = (i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? embeddedActivityInviteEmbedImpl.acceptLabelText : str2;
        String str15 = (i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? embeddedActivityInviteEmbedImpl.bodyText : str3;
        Integer num15 = (i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? embeddedActivityInviteEmbedImpl.bodyTextColor : num4;
        Boolean bool4 = (i12 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? embeddedActivityInviteEmbedImpl.canBeAccepted : bool;
        Boolean bool5 = (i12 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? embeddedActivityInviteEmbedImpl.embedCanBeTapped : bool2;
        Integer num16 = (i12 & 8192) != 0 ? embeddedActivityInviteEmbedImpl.resolvingGradientEnd : num5;
        int i17 = i14;
        Integer num17 = (i12 & 16384) != 0 ? embeddedActivityInviteEmbedImpl.resolvingGradientStart : num6;
        Boolean bool6 = (i12 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? embeddedActivityInviteEmbedImpl.splashHasRadialGradient : bool3;
        Integer num18 = (i12 & 65536) != 0 ? embeddedActivityInviteEmbedImpl.splashOpacity : num7;
        String str16 = (i12 & 131072) != 0 ? embeddedActivityInviteEmbedImpl.splashUrl : str4;
        String str17 = (i12 & 262144) != 0 ? embeddedActivityInviteEmbedImpl.inviteSplash : str5;
        String str18 = (i12 & 524288) != 0 ? embeddedActivityInviteEmbedImpl.subtitle : str6;
        Integer num19 = (i12 & 1048576) != 0 ? embeddedActivityInviteEmbedImpl.subtitleColor : num8;
        Integer num20 = (i12 & 2097152) != 0 ? embeddedActivityInviteEmbedImpl.thumbnailBackgroundColor : num9;
        Integer num21 = (i12 & 4194304) != 0 ? embeddedActivityInviteEmbedImpl.thumbnailCornerRadius : num10;
        String str19 = (i12 & 8388608) != 0 ? embeddedActivityInviteEmbedImpl.thumbnailText : str7;
        String str20 = (i12 & PointerEventHelper.X_FLAG_SUPPORTS_HOVER) != 0 ? embeddedActivityInviteEmbedImpl.thumbnailUrl : str8;
        Integer num22 = (i12 & 33554432) != 0 ? embeddedActivityInviteEmbedImpl.titleColor : num11;
        String str21 = (i12 & 67108864) != 0 ? embeddedActivityInviteEmbedImpl.titleText : str9;
        String str22 = (i12 & 134217728) != 0 ? embeddedActivityInviteEmbedImpl.channelIcon : str10;
        List list2 = (i12 & 268435456) != 0 ? embeddedActivityInviteEmbedImpl.participantAvatarUris : list;
        CodedLinkExtendedType codedLinkExtendedType2 = (i12 & 536870912) != 0 ? embeddedActivityInviteEmbedImpl.extendedType : codedLinkExtendedType;
        AnnotatedStructurableText annotatedStructurableText2 = (i12 & 1073741824) != 0 ? embeddedActivityInviteEmbedImpl.structurableSubtitleText : annotatedStructurableText;
        String str23 = (i12 & Integer.MIN_VALUE) != 0 ? embeddedActivityInviteEmbedImpl.noParticipantsText : str11;
        if ((i13 & 1) != 0) {
            str12 = str23;
            z6 = embeddedActivityInviteEmbedImpl.ctaEnabled;
        } else {
            z6 = z5;
            str12 = str23;
        }
        return embeddedActivityInviteEmbedImpl.copy(i17, i15, i16, str13, inviteType2, num12, num13, num14, str14, str15, num15, bool4, bool5, num16, num17, bool6, num18, str16, str17, str18, num19, num20, num21, str19, str20, num22, str21, str22, list2, codedLinkExtendedType2, annotatedStructurableText2, str12, z6);
    }

    public static final /* synthetic */ void write$Self$chat_release(EmbeddedActivityInviteEmbedImpl self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Lazy[] lazyArr = $childSerializers;
        output.l(0, self.getBackgroundColor(), serialDesc);
        output.l(1, self.getBorderColor(), serialDesc);
        output.l(2, self.getHeaderColor(), serialDesc);
        s1 s1Var = s1.f17602a;
        output.r(serialDesc, 3, s1Var, self.getHeaderText());
        if (output.u(serialDesc, 4) || self.getType() != null) {
            output.r(serialDesc, 4, InviteType.Serializer.INSTANCE, self.getType());
        }
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
        if (output.u(serialDesc, 12) || self.getEmbedCanBeTapped() != null) {
            output.r(serialDesc, 12, g.f17537a, self.getEmbedCanBeTapped());
        }
        if (output.u(serialDesc, 13) || self.getResolvingGradientEnd() != null) {
            output.r(serialDesc, 13, m0.f17573a, self.getResolvingGradientEnd());
        }
        if (output.u(serialDesc, 14) || self.getResolvingGradientStart() != null) {
            output.r(serialDesc, 14, m0.f17573a, self.getResolvingGradientStart());
        }
        if (output.u(serialDesc, 15) || self.getSplashHasRadialGradient() != null) {
            output.r(serialDesc, 15, g.f17537a, self.getSplashHasRadialGradient());
        }
        if (output.u(serialDesc, 16) || self.getSplashOpacity() != null) {
            output.r(serialDesc, 16, m0.f17573a, self.getSplashOpacity());
        }
        if (output.u(serialDesc, 17) || self.getSplashUrl() != null) {
            output.r(serialDesc, 17, s1Var, self.getSplashUrl());
        }
        if (output.u(serialDesc, 18) || self.getInviteSplash() != null) {
            output.r(serialDesc, 18, s1Var, self.getInviteSplash());
        }
        if (output.u(serialDesc, 19) || self.getSubtitle() != null) {
            output.r(serialDesc, 19, s1Var, self.getSubtitle());
        }
        if (output.u(serialDesc, 20) || self.getSubtitleColor() != null) {
            output.r(serialDesc, 20, m0.f17573a, self.getSubtitleColor());
        }
        if (output.u(serialDesc, 21) || self.getThumbnailBackgroundColor() != null) {
            output.r(serialDesc, 21, m0.f17573a, self.getThumbnailBackgroundColor());
        }
        if (output.u(serialDesc, 22) || self.getThumbnailCornerRadius() != null) {
            output.r(serialDesc, 22, m0.f17573a, self.getThumbnailCornerRadius());
        }
        if (output.u(serialDesc, 23) || self.getThumbnailText() != null) {
            output.r(serialDesc, 23, s1Var, self.getThumbnailText());
        }
        if (output.u(serialDesc, 24) || self.getThumbnailUrl() != null) {
            output.r(serialDesc, 24, s1Var, self.getThumbnailUrl());
        }
        if (output.u(serialDesc, 25) || self.getTitleColor() != null) {
            output.r(serialDesc, 25, m0.f17573a, self.getTitleColor());
        }
        if (output.u(serialDesc, 26) || self.getTitleText() != null) {
            output.r(serialDesc, 26, s1Var, self.getTitleText());
        }
        if (output.u(serialDesc, 27) || self.getChannelIcon() != null) {
            output.r(serialDesc, 27, s1Var, self.getChannelIcon());
        }
        output.g(serialDesc, 28, (KSerializer) lazyArr[28].getValue(), self.getParticipantAvatarUris());
        output.g(serialDesc, 29, CodedLinkExtendedType.Serializer.INSTANCE, self.getExtendedType());
        if (output.u(serialDesc, 30) || self.getStructurableSubtitleText() != null) {
            output.r(serialDesc, 30, AnnotatedStructurableTextSerializer.INSTANCE, self.getStructurableSubtitleText());
        }
        output.q(serialDesc, 31, self.getNoParticipantsText());
        output.p(serialDesc, 32, self.getCtaEnabled());
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
    public final Boolean getEmbedCanBeTapped() {
        return this.embedCanBeTapped;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Integer getResolvingGradientEnd() {
        return this.resolvingGradientEnd;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Integer getResolvingGradientStart() {
        return this.resolvingGradientStart;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Boolean getSplashHasRadialGradient() {
        return this.splashHasRadialGradient;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final Integer getSplashOpacity() {
        return this.splashOpacity;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getSplashUrl() {
        return this.splashUrl;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getInviteSplash() {
        return this.inviteSplash;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getBorderColor() {
        return this.borderColor;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final Integer getSubtitleColor() {
        return this.subtitleColor;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final Integer getThumbnailBackgroundColor() {
        return this.thumbnailBackgroundColor;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final Integer getThumbnailCornerRadius() {
        return this.thumbnailCornerRadius;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getThumbnailText() {
        return this.thumbnailText;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final Integer getTitleColor() {
        return this.titleColor;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final String getTitleText() {
        return this.titleText;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final String getChannelIcon() {
        return this.channelIcon;
    }

    @NotNull
    public final List<String> component29() {
        return this.participantAvatarUris;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getHeaderColor() {
        return this.headerColor;
    }

    @NotNull
    /* JADX INFO: renamed from: component30, reason: from getter */
    public final CodedLinkExtendedType getExtendedType() {
        return this.extendedType;
    }

    /* JADX INFO: renamed from: component31, reason: from getter */
    public final AnnotatedStructurableText getStructurableSubtitleText() {
        return this.structurableSubtitleText;
    }

    @NotNull
    /* JADX INFO: renamed from: component32, reason: from getter */
    public final String getNoParticipantsText() {
        return this.noParticipantsText;
    }

    /* JADX INFO: renamed from: component33, reason: from getter */
    public final boolean getCtaEnabled() {
        return this.ctaEnabled;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getHeaderText() {
        return this.headerText;
    }

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
    public final EmbeddedActivityInviteEmbedImpl copy(int backgroundColor, int borderColor, int headerColor, String headerText, InviteType type, Integer acceptLabelBackgroundColor, Integer acceptLabelBorderColor, Integer acceptLabelColor, String acceptLabelText, String bodyText, Integer bodyTextColor, Boolean canBeAccepted, Boolean embedCanBeTapped, Integer resolvingGradientEnd, Integer resolvingGradientStart, Boolean splashHasRadialGradient, Integer splashOpacity, String splashUrl, String inviteSplash, String subtitle, Integer subtitleColor, Integer thumbnailBackgroundColor, Integer thumbnailCornerRadius, String thumbnailText, String thumbnailUrl, Integer titleColor, String titleText, String channelIcon, @NotNull List<String> participantAvatarUris, @NotNull CodedLinkExtendedType extendedType, AnnotatedStructurableText structurableSubtitleText, @NotNull String noParticipantsText, boolean ctaEnabled) {
        Intrinsics.checkNotNullParameter(participantAvatarUris, "participantAvatarUris");
        Intrinsics.checkNotNullParameter(extendedType, "extendedType");
        Intrinsics.checkNotNullParameter(noParticipantsText, "noParticipantsText");
        return new EmbeddedActivityInviteEmbedImpl(backgroundColor, borderColor, headerColor, headerText, type, acceptLabelBackgroundColor, acceptLabelBorderColor, acceptLabelColor, acceptLabelText, bodyText, bodyTextColor, canBeAccepted, embedCanBeTapped, resolvingGradientEnd, resolvingGradientStart, splashHasRadialGradient, splashOpacity, splashUrl, inviteSplash, subtitle, subtitleColor, thumbnailBackgroundColor, thumbnailCornerRadius, thumbnailText, thumbnailUrl, titleColor, titleText, channelIcon, participantAvatarUris, extendedType, structurableSubtitleText, noParticipantsText, ctaEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EmbeddedActivityInviteEmbedImpl)) {
            return false;
        }
        EmbeddedActivityInviteEmbedImpl embeddedActivityInviteEmbedImpl = (EmbeddedActivityInviteEmbedImpl) other;
        return this.backgroundColor == embeddedActivityInviteEmbedImpl.backgroundColor && this.borderColor == embeddedActivityInviteEmbedImpl.borderColor && this.headerColor == embeddedActivityInviteEmbedImpl.headerColor && Intrinsics.areEqual(this.headerText, embeddedActivityInviteEmbedImpl.headerText) && this.type == embeddedActivityInviteEmbedImpl.type && Intrinsics.areEqual(this.acceptLabelBackgroundColor, embeddedActivityInviteEmbedImpl.acceptLabelBackgroundColor) && Intrinsics.areEqual(this.acceptLabelBorderColor, embeddedActivityInviteEmbedImpl.acceptLabelBorderColor) && Intrinsics.areEqual(this.acceptLabelColor, embeddedActivityInviteEmbedImpl.acceptLabelColor) && Intrinsics.areEqual(this.acceptLabelText, embeddedActivityInviteEmbedImpl.acceptLabelText) && Intrinsics.areEqual(this.bodyText, embeddedActivityInviteEmbedImpl.bodyText) && Intrinsics.areEqual(this.bodyTextColor, embeddedActivityInviteEmbedImpl.bodyTextColor) && Intrinsics.areEqual(this.canBeAccepted, embeddedActivityInviteEmbedImpl.canBeAccepted) && Intrinsics.areEqual(this.embedCanBeTapped, embeddedActivityInviteEmbedImpl.embedCanBeTapped) && Intrinsics.areEqual(this.resolvingGradientEnd, embeddedActivityInviteEmbedImpl.resolvingGradientEnd) && Intrinsics.areEqual(this.resolvingGradientStart, embeddedActivityInviteEmbedImpl.resolvingGradientStart) && Intrinsics.areEqual(this.splashHasRadialGradient, embeddedActivityInviteEmbedImpl.splashHasRadialGradient) && Intrinsics.areEqual(this.splashOpacity, embeddedActivityInviteEmbedImpl.splashOpacity) && Intrinsics.areEqual(this.splashUrl, embeddedActivityInviteEmbedImpl.splashUrl) && Intrinsics.areEqual(this.inviteSplash, embeddedActivityInviteEmbedImpl.inviteSplash) && Intrinsics.areEqual(this.subtitle, embeddedActivityInviteEmbedImpl.subtitle) && Intrinsics.areEqual(this.subtitleColor, embeddedActivityInviteEmbedImpl.subtitleColor) && Intrinsics.areEqual(this.thumbnailBackgroundColor, embeddedActivityInviteEmbedImpl.thumbnailBackgroundColor) && Intrinsics.areEqual(this.thumbnailCornerRadius, embeddedActivityInviteEmbedImpl.thumbnailCornerRadius) && Intrinsics.areEqual(this.thumbnailText, embeddedActivityInviteEmbedImpl.thumbnailText) && Intrinsics.areEqual(this.thumbnailUrl, embeddedActivityInviteEmbedImpl.thumbnailUrl) && Intrinsics.areEqual(this.titleColor, embeddedActivityInviteEmbedImpl.titleColor) && Intrinsics.areEqual(this.titleText, embeddedActivityInviteEmbedImpl.titleText) && Intrinsics.areEqual(this.channelIcon, embeddedActivityInviteEmbedImpl.channelIcon) && Intrinsics.areEqual(this.participantAvatarUris, embeddedActivityInviteEmbedImpl.participantAvatarUris) && this.extendedType == embeddedActivityInviteEmbedImpl.extendedType && Intrinsics.areEqual(this.structurableSubtitleText, embeddedActivityInviteEmbedImpl.structurableSubtitleText) && Intrinsics.areEqual(this.noParticipantsText, embeddedActivityInviteEmbedImpl.noParticipantsText) && this.ctaEnabled == embeddedActivityInviteEmbedImpl.ctaEnabled;
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

    @Override // com.discord.chat.bridge.codedlinks.EmbeddedActivityInviteEmbed
    public String getChannelIcon() {
        return this.channelIcon;
    }

    @Override // com.discord.chat.bridge.codedlinks.EmbeddedActivityInviteEmbed
    public boolean getCtaEnabled() {
        return this.ctaEnabled;
    }

    @Override // com.discord.chat.bridge.codedlinks.CodedLinkEmbed
    public Boolean getEmbedCanBeTapped() {
        return this.embedCanBeTapped;
    }

    @Override // com.discord.chat.bridge.codedlinks.EmbeddedActivityInviteEmbed
    @NotNull
    public CodedLinkExtendedType getExtendedType() {
        return this.extendedType;
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

    @Override // com.discord.chat.bridge.codedlinks.EmbeddedActivityInviteEmbed
    @NotNull
    public String getNoParticipantsText() {
        return this.noParticipantsText;
    }

    @Override // com.discord.chat.bridge.codedlinks.EmbeddedActivityInviteEmbed
    @NotNull
    public List<String> getParticipantAvatarUris() {
        return this.participantAvatarUris;
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
    public InviteType getType() {
        return this.type;
    }

    public int hashCode() {
        int iU = com.discord.chat.presentation.list.a.u(this.headerColor, com.discord.chat.presentation.list.a.u(this.borderColor, Integer.hashCode(this.backgroundColor) * 31, 31), 31);
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
        int iHashCode24 = (iHashCode23 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.channelIcon;
        int iHashCode25 = (this.extendedType.hashCode() + e.f(this.participantAvatarUris, (iHashCode24 + (str10 == null ? 0 : str10.hashCode())) * 31, 31)) * 31;
        AnnotatedStructurableText annotatedStructurableText = this.structurableSubtitleText;
        return Boolean.hashCode(this.ctaEnabled) + e.d((iHashCode25 + (annotatedStructurableText != null ? annotatedStructurableText.hashCode() : 0)) * 31, 31, this.noParticipantsText);
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
        String str10 = this.channelIcon;
        List<String> list = this.participantAvatarUris;
        CodedLinkExtendedType codedLinkExtendedType = this.extendedType;
        AnnotatedStructurableText annotatedStructurableText = this.structurableSubtitleText;
        String str11 = this.noParticipantsText;
        boolean z5 = this.ctaEnabled;
        StringBuilder sbR = e.r(i7, "EmbeddedActivityInviteEmbedImpl(backgroundColor=", i10, ", borderColor=", ", headerColor=");
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
        sbR.append(", embedCanBeTapped=");
        sbR.append(bool2);
        sbR.append(", resolvingGradientEnd=");
        sbR.append(num5);
        sbR.append(", resolvingGradientStart=");
        sbR.append(num6);
        sbR.append(", splashHasRadialGradient=");
        sbR.append(bool3);
        sbR.append(", splashOpacity=");
        b.r(num7, ", splashUrl=", str4, ", inviteSplash=", sbR);
        e.A(sbR, str5, ", subtitle=", str6, ", subtitleColor=");
        b.s(sbR, num8, ", thumbnailBackgroundColor=", num9, ", thumbnailCornerRadius=");
        b.r(num10, ", thumbnailText=", str7, ", thumbnailUrl=", sbR);
        com.discord.chat.presentation.list.a.r(num11, str8, ", titleColor=", ", titleText=", sbR);
        e.A(sbR, str9, ", channelIcon=", str10, ", participantAvatarUris=");
        sbR.append(list);
        sbR.append(", extendedType=");
        sbR.append(codedLinkExtendedType);
        sbR.append(", structurableSubtitleText=");
        sbR.append(annotatedStructurableText);
        sbR.append(", noParticipantsText=");
        sbR.append(str11);
        sbR.append(", ctaEnabled=");
        return com.discord.chat.presentation.list.a.m(sbR, z5, ")");
    }

    public /* synthetic */ EmbeddedActivityInviteEmbedImpl(int i7, int i10, int i11, String str, InviteType inviteType, Integer num, Integer num2, Integer num3, String str2, String str3, Integer num4, Boolean bool, Boolean bool2, Integer num5, Integer num6, Boolean bool3, Integer num7, String str4, String str5, String str6, Integer num8, Integer num9, Integer num10, String str7, String str8, Integer num11, String str9, String str10, List list, CodedLinkExtendedType codedLinkExtendedType, AnnotatedStructurableText annotatedStructurableText, String str11, boolean z5, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(i7, i10, i11, str, (i12 & 16) != 0 ? null : inviteType, (i12 & 32) != 0 ? null : num, (i12 & 64) != 0 ? null : num2, (i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? null : num3, (i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : str2, (i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? null : str3, (i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? null : num4, (i12 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? null : bool, (i12 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : bool2, (i12 & 8192) != 0 ? null : num5, (i12 & 16384) != 0 ? null : num6, (32768 & i12) != 0 ? null : bool3, (65536 & i12) != 0 ? null : num7, (131072 & i12) != 0 ? null : str4, (262144 & i12) != 0 ? null : str5, (524288 & i12) != 0 ? null : str6, (1048576 & i12) != 0 ? null : num8, (2097152 & i12) != 0 ? null : num9, (4194304 & i12) != 0 ? null : num10, (8388608 & i12) != 0 ? null : str7, (16777216 & i12) != 0 ? null : str8, (33554432 & i12) != 0 ? null : num11, (67108864 & i12) != 0 ? null : str9, (134217728 & i12) != 0 ? null : str10, list, codedLinkExtendedType, (i12 & 1073741824) != 0 ? null : annotatedStructurableText, str11, z5);
    }

    @Override // com.discord.chat.bridge.codedlinks.EmbeddedActivityInviteEmbed
    public AnnotatedStructurableText getStructurableSubtitleText() {
        return this.structurableSubtitleText;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmbeddedActivityInviteEmbedImpl(int i7, int i10, int i11, String str, InviteType inviteType, Integer num, Integer num2, Integer num3, String str2, String str3, Integer num4, Boolean bool, Boolean bool2, Integer num5, Integer num6, Boolean bool3, Integer num7, String str4, String str5, String str6, Integer num8, Integer num9, Integer num10, String str7, String str8, Integer num11, String str9, String str10, @NotNull List<String> participantAvatarUris, @NotNull CodedLinkExtendedType extendedType, AnnotatedStructurableText annotatedStructurableText, @NotNull String noParticipantsText, boolean z5) {
        super(null);
        Intrinsics.checkNotNullParameter(participantAvatarUris, "participantAvatarUris");
        Intrinsics.checkNotNullParameter(extendedType, "extendedType");
        Intrinsics.checkNotNullParameter(noParticipantsText, "noParticipantsText");
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
        this.channelIcon = str10;
        this.participantAvatarUris = participantAvatarUris;
        this.extendedType = extendedType;
        this.structurableSubtitleText = annotatedStructurableText;
        this.noParticipantsText = noParticipantsText;
        this.ctaEnabled = z5;
    }
}
