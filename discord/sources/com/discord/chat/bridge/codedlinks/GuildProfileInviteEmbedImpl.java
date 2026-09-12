package com.discord.chat.bridge.codedlinks;

import a3.e;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.PointerEventHelper;
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
import o5.a;
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
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\bY\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u009a\u00012\u00020\u00012\u00020\u0002:\u0004\u0099\u0001\u009a\u0001B³\u0003\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0001\u0010\f\u001a\u00020\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!\u0012\b\b\u0002\u0010\"\u001a\u00020#\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010&\u001a\u00020\u0004\u0012\u0006\u0010'\u001a\u00020\u0004\u0012\u0006\u0010(\u001a\u00020\u000e\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0002\u0010+\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010,\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b/\u00100B\u008f\u0003\b\u0010\u0012\u0006\u00101\u001a\u00020\u0004\u0012\u0006\u00102\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\b\u0012\b\u0010 \u001a\u0004\u0018\u00010!\u0012\b\u0010\"\u001a\u0004\u0018\u00010#\u0012\b\u0010$\u001a\u0004\u0018\u00010\b\u0012\b\u0010%\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010&\u001a\u00020\u0004\u0012\u0006\u0010'\u001a\u00020\u0004\u0012\u0006\u0010(\u001a\u00020\u000e\u0012\b\u0010)\u001a\u0004\u0018\u00010\b\u0012\b\u0010*\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010,\u0012\b\u0010.\u001a\u0004\u0018\u00010\b\u0012\b\u00103\u001a\u0004\u0018\u000104¢\u0006\u0004\b/\u00105J\u0010\u0010e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u00107J\u0010\u0010f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u00107J\u0010\u0010g\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u00107J\u000b\u0010h\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010i\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u00107J\u000b\u0010j\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010k\u001a\u00020\u0004HÆ\u0003J\t\u0010l\u001a\u00020\u0004HÆ\u0003J\u0010\u0010m\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010CJ\u0010\u0010n\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010CJ\t\u0010o\u001a\u00020\u0004HÆ\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010q\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u00107J\u0010\u0010r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u00107J\u0010\u0010s\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010CJ\u0010\u0010t\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u00107J\u000b\u0010u\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010v\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010w\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010x\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u00107J\u0010\u0010y\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u00107J\u0010\u0010z\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u00107J\u000b\u0010{\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010|\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010}\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u00107J\u000b\u0010~\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u007f\u001a\u0004\u0018\u00010!HÆ\u0003J\n\u0010\u0080\u0001\u001a\u00020#HÆ\u0003J\f\u0010\u0081\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003J\f\u0010\u0082\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003J\n\u0010\u0083\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010\u0084\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010\u0085\u0001\u001a\u00020\u000eHÆ\u0003J\f\u0010\u0086\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003J\f\u0010\u0087\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0012\u0010\u0088\u0001\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010,HÆ\u0003J\f\u0010\u0089\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003JÄ\u0003\u0010\u008a\u0001\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\b\b\u0003\u0010\u000b\u001a\u00020\u00042\b\b\u0003\u0010\f\u001a\u00020\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0003\u0010\u0010\u001a\u00020\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\b\b\u0002\u0010\"\u001a\u00020#2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010&\u001a\u00020\u00042\b\b\u0002\u0010'\u001a\u00020\u00042\b\b\u0002\u0010(\u001a\u00020\u000e2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010+\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010,2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0003\u0010\u008b\u0001J\u0016\u0010\u008c\u0001\u001a\u00020\u000e2\n\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u008e\u0001HÖ\u0003J\n\u0010\u008f\u0001\u001a\u00020\u0004HÖ\u0001J\n\u0010\u0090\u0001\u001a\u00020\bHÖ\u0001J-\u0010\u0091\u0001\u001a\u00030\u0092\u00012\u0007\u0010\u0093\u0001\u001a\u00020\u00002\b\u0010\u0094\u0001\u001a\u00030\u0095\u00012\b\u0010\u0096\u0001\u001a\u00030\u0097\u0001H\u0001¢\u0006\u0003\b\u0098\u0001R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\n\n\u0002\u00108\u001a\u0004\b6\u00107R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\n\n\u0002\u00108\u001a\u0004\b9\u00107R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\n\n\u0002\u00108\u001a\u0004\b:\u00107R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0018\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\n\n\u0002\u00108\u001a\u0004\b=\u00107R\u0016\u0010\n\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010<R\u0014\u0010\u000b\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0014\u0010\f\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010@R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0096\u0004¢\u0006\n\n\u0002\u0010D\u001a\u0004\bB\u0010CR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000eX\u0096\u0004¢\u0006\n\n\u0002\u0010D\u001a\u0004\bE\u0010CR\u0014\u0010\u0010\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u0010@R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u0010<R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\n\n\u0002\u00108\u001a\u0004\bH\u00107R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\n\n\u0002\u00108\u001a\u0004\bI\u00107R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u000eX\u0096\u0004¢\u0006\n\n\u0002\u0010D\u001a\u0004\bJ\u0010CR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\n\n\u0002\u00108\u001a\u0004\bK\u00107R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bL\u0010<R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bM\u0010<R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bN\u0010<R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\n\n\u0002\u00108\u001a\u0004\bO\u00107R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\n\n\u0002\u00108\u001a\u0004\bP\u00107R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\n\n\u0002\u00108\u001a\u0004\bQ\u00107R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bR\u0010<R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bS\u0010<R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\n\n\u0002\u00108\u001a\u0004\bT\u00107R\u0016\u0010\u001f\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bU\u0010<R\u0016\u0010 \u001a\u0004\u0018\u00010!X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bV\u0010WR\u0014\u0010\"\u001a\u00020#X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bX\u0010YR\u0016\u0010$\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010<R\u0016\u0010%\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b[\u0010<R\u0014\u0010&\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010@R\u0014\u0010'\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b]\u0010@R\u0014\u0010(\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b^\u0010_R\u0016\u0010)\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b`\u0010<R\u0016\u0010*\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\ba\u0010<R\u001c\u0010+\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010,X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bb\u0010cR\u0016\u0010.\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bd\u0010<¨\u0006\u009b\u0001"}, d2 = {"Lcom/discord/chat/bridge/codedlinks/GuildProfileInviteEmbedImpl;", "Lcom/discord/chat/bridge/codedlinks/CodedLinkEmbed;", "Lcom/discord/chat/bridge/codedlinks/GuildProfileInviteEmbed;", "acceptLabelBackgroundColor", "", "acceptLabelBorderColor", "acceptLabelColor", "acceptLabelText", "", "bodyTextColor", "bodyText", ViewProps.BACKGROUND_COLOR, ViewProps.BORDER_COLOR, "canBeAccepted", "", "embedCanBeTapped", "headerColor", "headerText", "resolvingGradientEnd", "resolvingGradientStart", "splashHasRadialGradient", "splashOpacity", "splashUrl", "inviteSplash", "subtitle", "subtitleColor", "thumbnailBackgroundColor", "thumbnailCornerRadius", "thumbnailText", "thumbnailUrl", "titleColor", "titleText", "type", "Lcom/discord/chat/bridge/codedlinks/InviteType;", "extendedType", "Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;", "memberText", "onlineText", "bannerColor", "bannerColorSecondary", "hasProfileOverflow", "badgeIconUrl", "establishedText", "roles", "", "Lcom/discord/chat/bridge/codedlinks/InviteRole;", "rolesHeadingText", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;IILjava/lang/Boolean;Ljava/lang/Boolean;ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/discord/chat/bridge/codedlinks/InviteType;Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;Ljava/lang/String;Ljava/lang/String;IIZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "seen0", "seen1", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;IILjava/lang/Boolean;Ljava/lang/Boolean;ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/discord/chat/bridge/codedlinks/InviteType;Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;Ljava/lang/String;Ljava/lang/String;IIZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getAcceptLabelBackgroundColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAcceptLabelBorderColor", "getAcceptLabelColor", "getAcceptLabelText", "()Ljava/lang/String;", "getBodyTextColor", "getBodyText", "getBackgroundColor", "()I", "getBorderColor", "getCanBeAccepted", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getEmbedCanBeTapped", "getHeaderColor", "getHeaderText", "getResolvingGradientEnd", "getResolvingGradientStart", "getSplashHasRadialGradient", "getSplashOpacity", "getSplashUrl", "getInviteSplash", "getSubtitle", "getSubtitleColor", "getThumbnailBackgroundColor", "getThumbnailCornerRadius", "getThumbnailText", "getThumbnailUrl", "getTitleColor", "getTitleText", "getType", "()Lcom/discord/chat/bridge/codedlinks/InviteType;", "getExtendedType", "()Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;", "getMemberText", "getOnlineText", "getBannerColor", "getBannerColorSecondary", "getHasProfileOverflow", "()Z", "getBadgeIconUrl", "getEstablishedText", "getRoles", "()Ljava/util/List;", "getRolesHeadingText", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;IILjava/lang/Boolean;Ljava/lang/Boolean;ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/discord/chat/bridge/codedlinks/InviteType;Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;Ljava/lang/String;Ljava/lang/String;IIZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lcom/discord/chat/bridge/codedlinks/GuildProfileInviteEmbedImpl;", "equals", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class GuildProfileInviteEmbedImpl extends CodedLinkEmbed implements GuildProfileInviteEmbed {
    private final Integer acceptLabelBackgroundColor;
    private final Integer acceptLabelBorderColor;
    private final Integer acceptLabelColor;
    private final String acceptLabelText;
    private final int backgroundColor;
    private final String badgeIconUrl;
    private final int bannerColor;
    private final int bannerColorSecondary;
    private final String bodyText;
    private final Integer bodyTextColor;
    private final int borderColor;
    private final Boolean canBeAccepted;
    private final Boolean embedCanBeTapped;
    private final String establishedText;

    @NotNull
    private final CodedLinkExtendedType extendedType;
    private final boolean hasProfileOverflow;
    private final int headerColor;
    private final String headerText;
    private final String inviteSplash;
    private final String memberText;
    private final String onlineText;
    private final Integer resolvingGradientEnd;
    private final Integer resolvingGradientStart;
    private final List<InviteRole> roles;
    private final String rolesHeadingText;
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
    private final InviteType type;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, l.a(m.f19486e, new a(0)), null};

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/codedlinks/GuildProfileInviteEmbedImpl$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/codedlinks/GuildProfileInviteEmbedImpl;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return GuildProfileInviteEmbedImpl$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ GuildProfileInviteEmbedImpl(int i7, int i10, Integer num, Integer num2, Integer num3, String str, Integer num4, String str2, int i11, int i12, Boolean bool, Boolean bool2, int i13, String str3, Integer num5, Integer num6, Boolean bool3, Integer num7, String str4, String str5, String str6, Integer num8, Integer num9, Integer num10, String str7, String str8, Integer num11, String str9, InviteType inviteType, CodedLinkExtendedType codedLinkExtendedType, String str10, String str11, int i14, int i15, boolean z5, String str12, String str13, List list, String str14, SerializationConstructorMarker serializationConstructorMarker) {
        DefaultConstructorMarker defaultConstructorMarker = null;
        if ((-1073738560 != (i7 & (-1073738560))) || (1 != (i10 & 1))) {
            e1.k(new int[]{i7, i10}, new int[]{-1073738560, 1}, GuildProfileInviteEmbedImpl$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        super(defaultConstructorMarker);
        if ((i7 & 1) == 0) {
            this.acceptLabelBackgroundColor = null;
        } else {
            this.acceptLabelBackgroundColor = num;
        }
        if ((i7 & 2) == 0) {
            this.acceptLabelBorderColor = null;
        } else {
            this.acceptLabelBorderColor = num2;
        }
        if ((i7 & 4) == 0) {
            this.acceptLabelColor = null;
        } else {
            this.acceptLabelColor = num3;
        }
        if ((i7 & 8) == 0) {
            this.acceptLabelText = null;
        } else {
            this.acceptLabelText = str;
        }
        if ((i7 & 16) == 0) {
            this.bodyTextColor = null;
        } else {
            this.bodyTextColor = num4;
        }
        if ((i7 & 32) == 0) {
            this.bodyText = null;
        } else {
            this.bodyText = str2;
        }
        this.backgroundColor = i11;
        this.borderColor = i12;
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 0) {
            this.canBeAccepted = null;
        } else {
            this.canBeAccepted = bool;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 0) {
            this.embedCanBeTapped = null;
        } else {
            this.embedCanBeTapped = bool2;
        }
        this.headerColor = i13;
        this.headerText = str3;
        if ((i7 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) == 0) {
            this.resolvingGradientEnd = null;
        } else {
            this.resolvingGradientEnd = num5;
        }
        if ((i7 & 8192) == 0) {
            this.resolvingGradientStart = null;
        } else {
            this.resolvingGradientStart = num6;
        }
        if ((i7 & 16384) == 0) {
            this.splashHasRadialGradient = null;
        } else {
            this.splashHasRadialGradient = bool3;
        }
        if ((32768 & i7) == 0) {
            this.splashOpacity = null;
        } else {
            this.splashOpacity = num7;
        }
        if ((65536 & i7) == 0) {
            this.splashUrl = null;
        } else {
            this.splashUrl = str4;
        }
        if ((131072 & i7) == 0) {
            this.inviteSplash = null;
        } else {
            this.inviteSplash = str5;
        }
        if ((262144 & i7) == 0) {
            this.subtitle = null;
        } else {
            this.subtitle = str6;
        }
        if ((524288 & i7) == 0) {
            this.subtitleColor = null;
        } else {
            this.subtitleColor = num8;
        }
        if ((1048576 & i7) == 0) {
            this.thumbnailBackgroundColor = null;
        } else {
            this.thumbnailBackgroundColor = num9;
        }
        if ((2097152 & i7) == 0) {
            this.thumbnailCornerRadius = null;
        } else {
            this.thumbnailCornerRadius = num10;
        }
        if ((4194304 & i7) == 0) {
            this.thumbnailText = null;
        } else {
            this.thumbnailText = str7;
        }
        if ((8388608 & i7) == 0) {
            this.thumbnailUrl = null;
        } else {
            this.thumbnailUrl = str8;
        }
        if ((16777216 & i7) == 0) {
            this.titleColor = null;
        } else {
            this.titleColor = num11;
        }
        if ((33554432 & i7) == 0) {
            this.titleText = null;
        } else {
            this.titleText = str9;
        }
        if ((67108864 & i7) == 0) {
            this.type = null;
        } else {
            this.type = inviteType;
        }
        this.extendedType = (134217728 & i7) == 0 ? CodedLinkExtendedType.GUILD_PROFILE_INVITE : codedLinkExtendedType;
        if ((268435456 & i7) == 0) {
            this.memberText = null;
        } else {
            this.memberText = str10;
        }
        if ((i7 & 536870912) == 0) {
            this.onlineText = null;
        } else {
            this.onlineText = str11;
        }
        this.bannerColor = i14;
        this.bannerColorSecondary = i15;
        this.hasProfileOverflow = z5;
        if ((i10 & 2) == 0) {
            this.badgeIconUrl = null;
        } else {
            this.badgeIconUrl = str12;
        }
        if ((i10 & 4) == 0) {
            this.establishedText = null;
        } else {
            this.establishedText = str13;
        }
        if ((i10 & 8) == 0) {
            this.roles = null;
        } else {
            this.roles = list;
        }
        if ((i10 & 16) == 0) {
            this.rolesHeadingText = null;
        } else {
            this.rolesHeadingText = str14;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(InviteRole$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GuildProfileInviteEmbedImpl copy$default(GuildProfileInviteEmbedImpl guildProfileInviteEmbedImpl, Integer num, Integer num2, Integer num3, String str, Integer num4, String str2, int i7, int i10, Boolean bool, Boolean bool2, int i11, String str3, Integer num5, Integer num6, Boolean bool3, Integer num7, String str4, String str5, String str6, Integer num8, Integer num9, Integer num10, String str7, String str8, Integer num11, String str9, InviteType inviteType, CodedLinkExtendedType codedLinkExtendedType, String str10, String str11, int i12, int i13, boolean z5, String str12, String str13, List list, String str14, int i14, int i15, Object obj) {
        String str15;
        List list2;
        Integer num12 = (i14 & 1) != 0 ? guildProfileInviteEmbedImpl.acceptLabelBackgroundColor : num;
        Integer num13 = (i14 & 2) != 0 ? guildProfileInviteEmbedImpl.acceptLabelBorderColor : num2;
        Integer num14 = (i14 & 4) != 0 ? guildProfileInviteEmbedImpl.acceptLabelColor : num3;
        String str16 = (i14 & 8) != 0 ? guildProfileInviteEmbedImpl.acceptLabelText : str;
        Integer num15 = (i14 & 16) != 0 ? guildProfileInviteEmbedImpl.bodyTextColor : num4;
        String str17 = (i14 & 32) != 0 ? guildProfileInviteEmbedImpl.bodyText : str2;
        int i16 = (i14 & 64) != 0 ? guildProfileInviteEmbedImpl.backgroundColor : i7;
        int i17 = (i14 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? guildProfileInviteEmbedImpl.borderColor : i10;
        Boolean bool4 = (i14 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? guildProfileInviteEmbedImpl.canBeAccepted : bool;
        Boolean bool5 = (i14 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? guildProfileInviteEmbedImpl.embedCanBeTapped : bool2;
        int i18 = (i14 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? guildProfileInviteEmbedImpl.headerColor : i11;
        String str18 = (i14 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? guildProfileInviteEmbedImpl.headerText : str3;
        Integer num16 = (i14 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? guildProfileInviteEmbedImpl.resolvingGradientEnd : num5;
        Integer num17 = (i14 & 8192) != 0 ? guildProfileInviteEmbedImpl.resolvingGradientStart : num6;
        Integer num18 = num12;
        Boolean bool6 = (i14 & 16384) != 0 ? guildProfileInviteEmbedImpl.splashHasRadialGradient : bool3;
        Integer num19 = (i14 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? guildProfileInviteEmbedImpl.splashOpacity : num7;
        String str19 = (i14 & 65536) != 0 ? guildProfileInviteEmbedImpl.splashUrl : str4;
        String str20 = (i14 & 131072) != 0 ? guildProfileInviteEmbedImpl.inviteSplash : str5;
        String str21 = (i14 & 262144) != 0 ? guildProfileInviteEmbedImpl.subtitle : str6;
        Integer num20 = (i14 & 524288) != 0 ? guildProfileInviteEmbedImpl.subtitleColor : num8;
        Integer num21 = (i14 & 1048576) != 0 ? guildProfileInviteEmbedImpl.thumbnailBackgroundColor : num9;
        Integer num22 = (i14 & 2097152) != 0 ? guildProfileInviteEmbedImpl.thumbnailCornerRadius : num10;
        String str22 = (i14 & 4194304) != 0 ? guildProfileInviteEmbedImpl.thumbnailText : str7;
        String str23 = (i14 & 8388608) != 0 ? guildProfileInviteEmbedImpl.thumbnailUrl : str8;
        Integer num23 = (i14 & PointerEventHelper.X_FLAG_SUPPORTS_HOVER) != 0 ? guildProfileInviteEmbedImpl.titleColor : num11;
        String str24 = (i14 & 33554432) != 0 ? guildProfileInviteEmbedImpl.titleText : str9;
        InviteType inviteType2 = (i14 & 67108864) != 0 ? guildProfileInviteEmbedImpl.type : inviteType;
        CodedLinkExtendedType codedLinkExtendedType2 = (i14 & 134217728) != 0 ? guildProfileInviteEmbedImpl.extendedType : codedLinkExtendedType;
        String str25 = (i14 & 268435456) != 0 ? guildProfileInviteEmbedImpl.memberText : str10;
        String str26 = (i14 & 536870912) != 0 ? guildProfileInviteEmbedImpl.onlineText : str11;
        int i19 = (i14 & 1073741824) != 0 ? guildProfileInviteEmbedImpl.bannerColor : i12;
        int i20 = (i14 & Integer.MIN_VALUE) != 0 ? guildProfileInviteEmbedImpl.bannerColorSecondary : i13;
        boolean z6 = (i15 & 1) != 0 ? guildProfileInviteEmbedImpl.hasProfileOverflow : z5;
        String str27 = (i15 & 2) != 0 ? guildProfileInviteEmbedImpl.badgeIconUrl : str12;
        String str28 = (i15 & 4) != 0 ? guildProfileInviteEmbedImpl.establishedText : str13;
        List list3 = (i15 & 8) != 0 ? guildProfileInviteEmbedImpl.roles : list;
        if ((i15 & 16) != 0) {
            list2 = list3;
            str15 = guildProfileInviteEmbedImpl.rolesHeadingText;
        } else {
            str15 = str14;
            list2 = list3;
        }
        return guildProfileInviteEmbedImpl.copy(num18, num13, num14, str16, num15, str17, i16, i17, bool4, bool5, i18, str18, num16, num17, bool6, num19, str19, str20, str21, num20, num21, num22, str22, str23, num23, str24, inviteType2, codedLinkExtendedType2, str25, str26, i19, i20, z6, str27, str28, list2, str15);
    }

    public static final /* synthetic */ void write$Self$chat_release(GuildProfileInviteEmbedImpl self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Lazy[] lazyArr = $childSerializers;
        if (output.u(serialDesc, 0) || self.getAcceptLabelBackgroundColor() != null) {
            output.r(serialDesc, 0, m0.f17573a, self.getAcceptLabelBackgroundColor());
        }
        if (output.u(serialDesc, 1) || self.getAcceptLabelBorderColor() != null) {
            output.r(serialDesc, 1, m0.f17573a, self.getAcceptLabelBorderColor());
        }
        if (output.u(serialDesc, 2) || self.getAcceptLabelColor() != null) {
            output.r(serialDesc, 2, m0.f17573a, self.getAcceptLabelColor());
        }
        if (output.u(serialDesc, 3) || self.getAcceptLabelText() != null) {
            output.r(serialDesc, 3, s1.f17602a, self.getAcceptLabelText());
        }
        if (output.u(serialDesc, 4) || self.getBodyTextColor() != null) {
            output.r(serialDesc, 4, m0.f17573a, self.getBodyTextColor());
        }
        if (output.u(serialDesc, 5) || self.getBodyText() != null) {
            output.r(serialDesc, 5, s1.f17602a, self.getBodyText());
        }
        output.l(6, self.getBackgroundColor(), serialDesc);
        output.l(7, self.getBorderColor(), serialDesc);
        if (output.u(serialDesc, 8) || self.getCanBeAccepted() != null) {
            output.r(serialDesc, 8, g.f17537a, self.getCanBeAccepted());
        }
        if (output.u(serialDesc, 9) || self.getEmbedCanBeTapped() != null) {
            output.r(serialDesc, 9, g.f17537a, self.getEmbedCanBeTapped());
        }
        output.l(10, self.getHeaderColor(), serialDesc);
        s1 s1Var = s1.f17602a;
        output.r(serialDesc, 11, s1Var, self.getHeaderText());
        if (output.u(serialDesc, 12) || self.getResolvingGradientEnd() != null) {
            output.r(serialDesc, 12, m0.f17573a, self.getResolvingGradientEnd());
        }
        if (output.u(serialDesc, 13) || self.getResolvingGradientStart() != null) {
            output.r(serialDesc, 13, m0.f17573a, self.getResolvingGradientStart());
        }
        if (output.u(serialDesc, 14) || self.getSplashHasRadialGradient() != null) {
            output.r(serialDesc, 14, g.f17537a, self.getSplashHasRadialGradient());
        }
        if (output.u(serialDesc, 15) || self.getSplashOpacity() != null) {
            output.r(serialDesc, 15, m0.f17573a, self.getSplashOpacity());
        }
        if (output.u(serialDesc, 16) || self.getSplashUrl() != null) {
            output.r(serialDesc, 16, s1Var, self.getSplashUrl());
        }
        if (output.u(serialDesc, 17) || self.getInviteSplash() != null) {
            output.r(serialDesc, 17, s1Var, self.getInviteSplash());
        }
        if (output.u(serialDesc, 18) || self.getSubtitle() != null) {
            output.r(serialDesc, 18, s1Var, self.getSubtitle());
        }
        if (output.u(serialDesc, 19) || self.getSubtitleColor() != null) {
            output.r(serialDesc, 19, m0.f17573a, self.getSubtitleColor());
        }
        if (output.u(serialDesc, 20) || self.getThumbnailBackgroundColor() != null) {
            output.r(serialDesc, 20, m0.f17573a, self.getThumbnailBackgroundColor());
        }
        if (output.u(serialDesc, 21) || self.getThumbnailCornerRadius() != null) {
            output.r(serialDesc, 21, m0.f17573a, self.getThumbnailCornerRadius());
        }
        if (output.u(serialDesc, 22) || self.getThumbnailText() != null) {
            output.r(serialDesc, 22, s1Var, self.getThumbnailText());
        }
        if (output.u(serialDesc, 23) || self.getThumbnailUrl() != null) {
            output.r(serialDesc, 23, s1Var, self.getThumbnailUrl());
        }
        if (output.u(serialDesc, 24) || self.getTitleColor() != null) {
            output.r(serialDesc, 24, m0.f17573a, self.getTitleColor());
        }
        if (output.u(serialDesc, 25) || self.getTitleText() != null) {
            output.r(serialDesc, 25, s1Var, self.getTitleText());
        }
        if (output.u(serialDesc, 26) || self.getType() != null) {
            output.r(serialDesc, 26, InviteType.Serializer.INSTANCE, self.getType());
        }
        if (output.u(serialDesc, 27) || self.getExtendedType() != CodedLinkExtendedType.GUILD_PROFILE_INVITE) {
            output.g(serialDesc, 27, CodedLinkExtendedType.Serializer.INSTANCE, self.getExtendedType());
        }
        if (output.u(serialDesc, 28) || self.getMemberText() != null) {
            output.r(serialDesc, 28, s1Var, self.getMemberText());
        }
        if (output.u(serialDesc, 29) || self.getOnlineText() != null) {
            output.r(serialDesc, 29, s1Var, self.getOnlineText());
        }
        output.l(30, self.getBannerColor(), serialDesc);
        output.l(31, self.getBannerColorSecondary(), serialDesc);
        output.p(serialDesc, 32, self.getHasProfileOverflow());
        if (output.u(serialDesc, 33) || self.getBadgeIconUrl() != null) {
            output.r(serialDesc, 33, s1Var, self.getBadgeIconUrl());
        }
        if (output.u(serialDesc, 34) || self.getEstablishedText() != null) {
            output.r(serialDesc, 34, s1Var, self.getEstablishedText());
        }
        if (output.u(serialDesc, 35) || self.getRoles() != null) {
            output.r(serialDesc, 35, (KSerializer) lazyArr[35].getValue(), self.getRoles());
        }
        if (!output.u(serialDesc, 36) && self.getRolesHeadingText() == null) {
            return;
        }
        output.r(serialDesc, 36, s1Var, self.getRolesHeadingText());
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getAcceptLabelBackgroundColor() {
        return this.acceptLabelBackgroundColor;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Boolean getEmbedCanBeTapped() {
        return this.embedCanBeTapped;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getHeaderColor() {
        return this.headerColor;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getHeaderText() {
        return this.headerText;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Integer getResolvingGradientEnd() {
        return this.resolvingGradientEnd;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Integer getResolvingGradientStart() {
        return this.resolvingGradientStart;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Boolean getSplashHasRadialGradient() {
        return this.splashHasRadialGradient;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Integer getSplashOpacity() {
        return this.splashOpacity;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getSplashUrl() {
        return this.splashUrl;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getInviteSplash() {
        return this.inviteSplash;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getAcceptLabelBorderColor() {
        return this.acceptLabelBorderColor;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final Integer getSubtitleColor() {
        return this.subtitleColor;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final Integer getThumbnailBackgroundColor() {
        return this.thumbnailBackgroundColor;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final Integer getThumbnailCornerRadius() {
        return this.thumbnailCornerRadius;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getThumbnailText() {
        return this.thumbnailText;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final Integer getTitleColor() {
        return this.titleColor;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getTitleText() {
        return this.titleText;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final InviteType getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component28, reason: from getter */
    public final CodedLinkExtendedType getExtendedType() {
        return this.extendedType;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final String getMemberText() {
        return this.memberText;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getAcceptLabelColor() {
        return this.acceptLabelColor;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final String getOnlineText() {
        return this.onlineText;
    }

    /* JADX INFO: renamed from: component31, reason: from getter */
    public final int getBannerColor() {
        return this.bannerColor;
    }

    /* JADX INFO: renamed from: component32, reason: from getter */
    public final int getBannerColorSecondary() {
        return this.bannerColorSecondary;
    }

    /* JADX INFO: renamed from: component33, reason: from getter */
    public final boolean getHasProfileOverflow() {
        return this.hasProfileOverflow;
    }

    /* JADX INFO: renamed from: component34, reason: from getter */
    public final String getBadgeIconUrl() {
        return this.badgeIconUrl;
    }

    /* JADX INFO: renamed from: component35, reason: from getter */
    public final String getEstablishedText() {
        return this.establishedText;
    }

    public final List<InviteRole> component36() {
        return this.roles;
    }

    /* JADX INFO: renamed from: component37, reason: from getter */
    public final String getRolesHeadingText() {
        return this.rolesHeadingText;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAcceptLabelText() {
        return this.acceptLabelText;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getBodyTextColor() {
        return this.bodyTextColor;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getBodyText() {
        return this.bodyText;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getBorderColor() {
        return this.borderColor;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Boolean getCanBeAccepted() {
        return this.canBeAccepted;
    }

    @NotNull
    public final GuildProfileInviteEmbedImpl copy(Integer acceptLabelBackgroundColor, Integer acceptLabelBorderColor, Integer acceptLabelColor, String acceptLabelText, Integer bodyTextColor, String bodyText, int backgroundColor, int borderColor, Boolean canBeAccepted, Boolean embedCanBeTapped, int headerColor, String headerText, Integer resolvingGradientEnd, Integer resolvingGradientStart, Boolean splashHasRadialGradient, Integer splashOpacity, String splashUrl, String inviteSplash, String subtitle, Integer subtitleColor, Integer thumbnailBackgroundColor, Integer thumbnailCornerRadius, String thumbnailText, String thumbnailUrl, Integer titleColor, String titleText, InviteType type, @NotNull CodedLinkExtendedType extendedType, String memberText, String onlineText, int bannerColor, int bannerColorSecondary, boolean hasProfileOverflow, String badgeIconUrl, String establishedText, List<InviteRole> roles, String rolesHeadingText) {
        Intrinsics.checkNotNullParameter(extendedType, "extendedType");
        return new GuildProfileInviteEmbedImpl(acceptLabelBackgroundColor, acceptLabelBorderColor, acceptLabelColor, acceptLabelText, bodyTextColor, bodyText, backgroundColor, borderColor, canBeAccepted, embedCanBeTapped, headerColor, headerText, resolvingGradientEnd, resolvingGradientStart, splashHasRadialGradient, splashOpacity, splashUrl, inviteSplash, subtitle, subtitleColor, thumbnailBackgroundColor, thumbnailCornerRadius, thumbnailText, thumbnailUrl, titleColor, titleText, type, extendedType, memberText, onlineText, bannerColor, bannerColorSecondary, hasProfileOverflow, badgeIconUrl, establishedText, roles, rolesHeadingText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GuildProfileInviteEmbedImpl)) {
            return false;
        }
        GuildProfileInviteEmbedImpl guildProfileInviteEmbedImpl = (GuildProfileInviteEmbedImpl) other;
        return Intrinsics.areEqual(this.acceptLabelBackgroundColor, guildProfileInviteEmbedImpl.acceptLabelBackgroundColor) && Intrinsics.areEqual(this.acceptLabelBorderColor, guildProfileInviteEmbedImpl.acceptLabelBorderColor) && Intrinsics.areEqual(this.acceptLabelColor, guildProfileInviteEmbedImpl.acceptLabelColor) && Intrinsics.areEqual(this.acceptLabelText, guildProfileInviteEmbedImpl.acceptLabelText) && Intrinsics.areEqual(this.bodyTextColor, guildProfileInviteEmbedImpl.bodyTextColor) && Intrinsics.areEqual(this.bodyText, guildProfileInviteEmbedImpl.bodyText) && this.backgroundColor == guildProfileInviteEmbedImpl.backgroundColor && this.borderColor == guildProfileInviteEmbedImpl.borderColor && Intrinsics.areEqual(this.canBeAccepted, guildProfileInviteEmbedImpl.canBeAccepted) && Intrinsics.areEqual(this.embedCanBeTapped, guildProfileInviteEmbedImpl.embedCanBeTapped) && this.headerColor == guildProfileInviteEmbedImpl.headerColor && Intrinsics.areEqual(this.headerText, guildProfileInviteEmbedImpl.headerText) && Intrinsics.areEqual(this.resolvingGradientEnd, guildProfileInviteEmbedImpl.resolvingGradientEnd) && Intrinsics.areEqual(this.resolvingGradientStart, guildProfileInviteEmbedImpl.resolvingGradientStart) && Intrinsics.areEqual(this.splashHasRadialGradient, guildProfileInviteEmbedImpl.splashHasRadialGradient) && Intrinsics.areEqual(this.splashOpacity, guildProfileInviteEmbedImpl.splashOpacity) && Intrinsics.areEqual(this.splashUrl, guildProfileInviteEmbedImpl.splashUrl) && Intrinsics.areEqual(this.inviteSplash, guildProfileInviteEmbedImpl.inviteSplash) && Intrinsics.areEqual(this.subtitle, guildProfileInviteEmbedImpl.subtitle) && Intrinsics.areEqual(this.subtitleColor, guildProfileInviteEmbedImpl.subtitleColor) && Intrinsics.areEqual(this.thumbnailBackgroundColor, guildProfileInviteEmbedImpl.thumbnailBackgroundColor) && Intrinsics.areEqual(this.thumbnailCornerRadius, guildProfileInviteEmbedImpl.thumbnailCornerRadius) && Intrinsics.areEqual(this.thumbnailText, guildProfileInviteEmbedImpl.thumbnailText) && Intrinsics.areEqual(this.thumbnailUrl, guildProfileInviteEmbedImpl.thumbnailUrl) && Intrinsics.areEqual(this.titleColor, guildProfileInviteEmbedImpl.titleColor) && Intrinsics.areEqual(this.titleText, guildProfileInviteEmbedImpl.titleText) && this.type == guildProfileInviteEmbedImpl.type && this.extendedType == guildProfileInviteEmbedImpl.extendedType && Intrinsics.areEqual(this.memberText, guildProfileInviteEmbedImpl.memberText) && Intrinsics.areEqual(this.onlineText, guildProfileInviteEmbedImpl.onlineText) && this.bannerColor == guildProfileInviteEmbedImpl.bannerColor && this.bannerColorSecondary == guildProfileInviteEmbedImpl.bannerColorSecondary && this.hasProfileOverflow == guildProfileInviteEmbedImpl.hasProfileOverflow && Intrinsics.areEqual(this.badgeIconUrl, guildProfileInviteEmbedImpl.badgeIconUrl) && Intrinsics.areEqual(this.establishedText, guildProfileInviteEmbedImpl.establishedText) && Intrinsics.areEqual(this.roles, guildProfileInviteEmbedImpl.roles) && Intrinsics.areEqual(this.rolesHeadingText, guildProfileInviteEmbedImpl.rolesHeadingText);
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

    @Override // com.discord.chat.bridge.codedlinks.GuildProfileInviteEmbed
    public String getBadgeIconUrl() {
        return this.badgeIconUrl;
    }

    @Override // com.discord.chat.bridge.codedlinks.GuildProfileInviteEmbed
    public int getBannerColor() {
        return this.bannerColor;
    }

    @Override // com.discord.chat.bridge.codedlinks.GuildProfileInviteEmbed
    public int getBannerColorSecondary() {
        return this.bannerColorSecondary;
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

    @Override // com.discord.chat.bridge.codedlinks.CodedLinkEmbed
    public Boolean getEmbedCanBeTapped() {
        return this.embedCanBeTapped;
    }

    @Override // com.discord.chat.bridge.codedlinks.GuildProfileInviteEmbed
    public String getEstablishedText() {
        return this.establishedText;
    }

    @Override // com.discord.chat.bridge.codedlinks.GuildProfileInviteEmbed
    @NotNull
    public CodedLinkExtendedType getExtendedType() {
        return this.extendedType;
    }

    @Override // com.discord.chat.bridge.codedlinks.GuildProfileInviteEmbed
    public boolean getHasProfileOverflow() {
        return this.hasProfileOverflow;
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

    @Override // com.discord.chat.bridge.codedlinks.GuildProfileInviteEmbed
    public String getMemberText() {
        return this.memberText;
    }

    @Override // com.discord.chat.bridge.codedlinks.GuildProfileInviteEmbed
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

    @Override // com.discord.chat.bridge.codedlinks.GuildProfileInviteEmbed
    public List<InviteRole> getRoles() {
        return this.roles;
    }

    @Override // com.discord.chat.bridge.codedlinks.GuildProfileInviteEmbed
    public String getRolesHeadingText() {
        return this.rolesHeadingText;
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
        Integer num = this.acceptLabelBackgroundColor;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.acceptLabelBorderColor;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.acceptLabelColor;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str = this.acceptLabelText;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num4 = this.bodyTextColor;
        int iHashCode5 = (iHashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str2 = this.bodyText;
        int iU = com.discord.chat.presentation.list.a.u(this.borderColor, com.discord.chat.presentation.list.a.u(this.backgroundColor, (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31);
        Boolean bool = this.canBeAccepted;
        int iHashCode6 = (iU + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.embedCanBeTapped;
        int iU2 = com.discord.chat.presentation.list.a.u(this.headerColor, (iHashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31, 31);
        String str3 = this.headerText;
        int iHashCode7 = (iU2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num5 = this.resolvingGradientEnd;
        int iHashCode8 = (iHashCode7 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.resolvingGradientStart;
        int iHashCode9 = (iHashCode8 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Boolean bool3 = this.splashHasRadialGradient;
        int iHashCode10 = (iHashCode9 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Integer num7 = this.splashOpacity;
        int iHashCode11 = (iHashCode10 + (num7 == null ? 0 : num7.hashCode())) * 31;
        String str4 = this.splashUrl;
        int iHashCode12 = (iHashCode11 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.inviteSplash;
        int iHashCode13 = (iHashCode12 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.subtitle;
        int iHashCode14 = (iHashCode13 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num8 = this.subtitleColor;
        int iHashCode15 = (iHashCode14 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.thumbnailBackgroundColor;
        int iHashCode16 = (iHashCode15 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.thumbnailCornerRadius;
        int iHashCode17 = (iHashCode16 + (num10 == null ? 0 : num10.hashCode())) * 31;
        String str7 = this.thumbnailText;
        int iHashCode18 = (iHashCode17 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.thumbnailUrl;
        int iHashCode19 = (iHashCode18 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num11 = this.titleColor;
        int iHashCode20 = (iHashCode19 + (num11 == null ? 0 : num11.hashCode())) * 31;
        String str9 = this.titleText;
        int iHashCode21 = (iHashCode20 + (str9 == null ? 0 : str9.hashCode())) * 31;
        InviteType inviteType = this.type;
        int iHashCode22 = (this.extendedType.hashCode() + ((iHashCode21 + (inviteType == null ? 0 : inviteType.hashCode())) * 31)) * 31;
        String str10 = this.memberText;
        int iHashCode23 = (iHashCode22 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.onlineText;
        int iG = com.discord.chat.presentation.list.a.g(com.discord.chat.presentation.list.a.u(this.bannerColorSecondary, com.discord.chat.presentation.list.a.u(this.bannerColor, (iHashCode23 + (str11 == null ? 0 : str11.hashCode())) * 31, 31), 31), 31, this.hasProfileOverflow);
        String str12 = this.badgeIconUrl;
        int iHashCode24 = (iG + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.establishedText;
        int iHashCode25 = (iHashCode24 + (str13 == null ? 0 : str13.hashCode())) * 31;
        List<InviteRole> list = this.roles;
        int iHashCode26 = (iHashCode25 + (list == null ? 0 : list.hashCode())) * 31;
        String str14 = this.rolesHeadingText;
        return iHashCode26 + (str14 != null ? str14.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Integer num = this.acceptLabelBackgroundColor;
        Integer num2 = this.acceptLabelBorderColor;
        Integer num3 = this.acceptLabelColor;
        String str = this.acceptLabelText;
        Integer num4 = this.bodyTextColor;
        String str2 = this.bodyText;
        int i7 = this.backgroundColor;
        int i10 = this.borderColor;
        Boolean bool = this.canBeAccepted;
        Boolean bool2 = this.embedCanBeTapped;
        int i11 = this.headerColor;
        String str3 = this.headerText;
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
        InviteType inviteType = this.type;
        CodedLinkExtendedType codedLinkExtendedType = this.extendedType;
        String str10 = this.memberText;
        String str11 = this.onlineText;
        int i12 = this.bannerColor;
        int i13 = this.bannerColorSecondary;
        boolean z5 = this.hasProfileOverflow;
        String str12 = this.badgeIconUrl;
        String str13 = this.establishedText;
        List<InviteRole> list = this.roles;
        String str14 = this.rolesHeadingText;
        StringBuilder sb2 = new StringBuilder("GuildProfileInviteEmbedImpl(acceptLabelBackgroundColor=");
        sb2.append(num);
        sb2.append(", acceptLabelBorderColor=");
        sb2.append(num2);
        sb2.append(", acceptLabelColor=");
        b.r(num3, ", acceptLabelText=", str, ", bodyTextColor=", sb2);
        b.r(num4, ", bodyText=", str2, ", backgroundColor=", sb2);
        e.z(sb2, i7, ", borderColor=", i10, ", canBeAccepted=");
        sb2.append(bool);
        sb2.append(", embedCanBeTapped=");
        sb2.append(bool2);
        sb2.append(", headerColor=");
        sb2.append(i11);
        sb2.append(", headerText=");
        sb2.append(str3);
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
        b.r(num11, ", titleText=", str9, ", type=", sb2);
        sb2.append(inviteType);
        sb2.append(", extendedType=");
        sb2.append(codedLinkExtendedType);
        sb2.append(", memberText=");
        e.A(sb2, str10, ", onlineText=", str11, ", bannerColor=");
        e.z(sb2, i12, ", bannerColorSecondary=", i13, ", hasProfileOverflow=");
        sb2.append(z5);
        sb2.append(", badgeIconUrl=");
        sb2.append(str12);
        sb2.append(", establishedText=");
        sb2.append(str13);
        sb2.append(", roles=");
        sb2.append(list);
        sb2.append(", rolesHeadingText=");
        return com.discord.chat.presentation.list.a.k(sb2, str14, ")");
    }

    public /* synthetic */ GuildProfileInviteEmbedImpl(Integer num, Integer num2, Integer num3, String str, Integer num4, String str2, int i7, int i10, Boolean bool, Boolean bool2, int i11, String str3, Integer num5, Integer num6, Boolean bool3, Integer num7, String str4, String str5, String str6, Integer num8, Integer num9, Integer num10, String str7, String str8, Integer num11, String str9, InviteType inviteType, CodedLinkExtendedType codedLinkExtendedType, String str10, String str11, int i12, int i13, boolean z5, String str12, String str13, List list, String str14, int i14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? null : num, (i14 & 2) != 0 ? null : num2, (i14 & 4) != 0 ? null : num3, (i14 & 8) != 0 ? null : str, (i14 & 16) != 0 ? null : num4, (i14 & 32) != 0 ? null : str2, i7, i10, (i14 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : bool, (i14 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? null : bool2, i11, str3, (i14 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : num5, (i14 & 8192) != 0 ? null : num6, (i14 & 16384) != 0 ? null : bool3, (32768 & i14) != 0 ? null : num7, (65536 & i14) != 0 ? null : str4, (131072 & i14) != 0 ? null : str5, (262144 & i14) != 0 ? null : str6, (524288 & i14) != 0 ? null : num8, (1048576 & i14) != 0 ? null : num9, (2097152 & i14) != 0 ? null : num10, (4194304 & i14) != 0 ? null : str7, (8388608 & i14) != 0 ? null : str8, (16777216 & i14) != 0 ? null : num11, (33554432 & i14) != 0 ? null : str9, (67108864 & i14) != 0 ? null : inviteType, (134217728 & i14) != 0 ? CodedLinkExtendedType.GUILD_PROFILE_INVITE : codedLinkExtendedType, (268435456 & i14) != 0 ? null : str10, (i14 & 536870912) != 0 ? null : str11, i12, i13, z5, (i15 & 2) != 0 ? null : str12, (i15 & 4) != 0 ? null : str13, (i15 & 8) != 0 ? null : list, (i15 & 16) != 0 ? null : str14);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GuildProfileInviteEmbedImpl(Integer num, Integer num2, Integer num3, String str, Integer num4, String str2, int i7, int i10, Boolean bool, Boolean bool2, int i11, String str3, Integer num5, Integer num6, Boolean bool3, Integer num7, String str4, String str5, String str6, Integer num8, Integer num9, Integer num10, String str7, String str8, Integer num11, String str9, InviteType inviteType, @NotNull CodedLinkExtendedType extendedType, String str10, String str11, int i12, int i13, boolean z5, String str12, String str13, List<InviteRole> list, String str14) {
        super(null);
        Intrinsics.checkNotNullParameter(extendedType, "extendedType");
        this.acceptLabelBackgroundColor = num;
        this.acceptLabelBorderColor = num2;
        this.acceptLabelColor = num3;
        this.acceptLabelText = str;
        this.bodyTextColor = num4;
        this.bodyText = str2;
        this.backgroundColor = i7;
        this.borderColor = i10;
        this.canBeAccepted = bool;
        this.embedCanBeTapped = bool2;
        this.headerColor = i11;
        this.headerText = str3;
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
        this.type = inviteType;
        this.extendedType = extendedType;
        this.memberText = str10;
        this.onlineText = str11;
        this.bannerColor = i12;
        this.bannerColorSecondary = i13;
        this.hasProfileOverflow = z5;
        this.badgeIconUrl = str12;
        this.establishedText = str13;
        this.roles = list;
        this.rolesHeadingText = str14;
    }
}
