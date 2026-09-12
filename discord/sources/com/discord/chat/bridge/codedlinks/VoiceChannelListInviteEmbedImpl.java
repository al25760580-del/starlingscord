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
import or.r0;
import or.s1;
import org.jetbrains.annotations.NotNull;
import org.webrtc.PeerConnection;
import rn.l;
import rn.m;

/* JADX INFO: loaded from: classes.dex */
@f
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\\\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u009f\u00012\u00020\u00012\u00020\u0002:\u0004\u009e\u0001\u009f\u0001B¯\u0003\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0001\u0010\f\u001a\u00020\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\b\u0012\b\b\u0001\u0010\u001e\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!\u0012\b\b\u0002\u0010\"\u001a\u00020#\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0002\u0010&\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010'\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*\u0012\u0006\u0010+\u001a\u00020\b\u0012\u0006\u0010,\u001a\u00020\b\u0012\b\b\u0001\u0010-\u001a\u00020\u0004\u0012\b\b\u0002\u0010.\u001a\u00020\u000e\u0012\b\b\u0002\u0010/\u001a\u00020\u000e\u0012\u0006\u00100\u001a\u00020\b¢\u0006\u0004\b1\u00102B\u0093\u0003\b\u0010\u0012\u0006\u00103\u001a\u00020\u0004\u0012\u0006\u00104\u001a\u00020\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u001e\u001a\u00020\u0004\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\b\u0012\b\u0010 \u001a\u0004\u0018\u00010!\u0012\b\u0010\"\u001a\u0004\u0018\u00010#\u0012\b\u0010$\u001a\u0004\u0018\u00010\b\u0012\b\u0010%\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010'\u0012\b\u0010)\u001a\u0004\u0018\u00010*\u0012\b\u0010+\u001a\u0004\u0018\u00010\b\u0012\b\u0010,\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010-\u001a\u00020\u0004\u0012\u0006\u0010.\u001a\u00020\u000e\u0012\u0006\u0010/\u001a\u00020\u000e\u0012\b\u00100\u001a\u0004\u0018\u00010\b\u0012\b\u00105\u001a\u0004\u0018\u000106¢\u0006\u0004\b1\u00107J\t\u0010i\u001a\u00020\u0004HÆ\u0003J\u0010\u0010j\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u00109J\t\u0010k\u001a\u00020\u0004HÆ\u0003J\t\u0010l\u001a\u00020\bHÆ\u0003J\u0010\u0010m\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u00109J\u000b\u0010n\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010o\u001a\u00020\u0004HÆ\u0003J\t\u0010p\u001a\u00020\u0004HÆ\u0003J\u0010\u0010q\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010EJ\u0010\u0010r\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010EJ\t\u0010s\u001a\u00020\u0004HÆ\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010u\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u00109J\u0010\u0010v\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u00109J\u0010\u0010w\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010EJ\u0010\u0010x\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u00109J\u000b\u0010y\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010z\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010{\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010|\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u00109J\u0010\u0010}\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u00109J\u0010\u0010~\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u00109J\u000b\u0010\u007f\u001a\u0004\u0018\u00010\bHÆ\u0003J\f\u0010\u0080\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003J\n\u0010\u0081\u0001\u001a\u00020\u0004HÆ\u0003J\f\u0010\u0082\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003J\f\u0010\u0083\u0001\u001a\u0004\u0018\u00010!HÆ\u0003J\n\u0010\u0084\u0001\u001a\u00020#HÆ\u0003J\f\u0010\u0085\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003J\f\u0010\u0086\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0012\u0010\u0087\u0001\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010'HÆ\u0003J\u0011\u0010\u0088\u0001\u001a\u0004\u0018\u00010*HÆ\u0003¢\u0006\u0002\u0010aJ\n\u0010\u0089\u0001\u001a\u00020\bHÆ\u0003J\n\u0010\u008a\u0001\u001a\u00020\bHÆ\u0003J\n\u0010\u008b\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010\u008c\u0001\u001a\u00020\u000eHÆ\u0003J\n\u0010\u008d\u0001\u001a\u00020\u000eHÆ\u0003J\n\u0010\u008e\u0001\u001a\u00020\bHÆ\u0003JÂ\u0003\u0010\u008f\u0001\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00042\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\b\b\u0003\u0010\u000b\u001a\u00020\u00042\b\b\u0003\u0010\f\u001a\u00020\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0003\u0010\u0010\u001a\u00020\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\b2\b\b\u0003\u0010\u001e\u001a\u00020\u00042\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\b\b\u0002\u0010\"\u001a\u00020#2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010&\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010'2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*2\b\b\u0002\u0010+\u001a\u00020\b2\b\b\u0002\u0010,\u001a\u00020\b2\b\b\u0003\u0010-\u001a\u00020\u00042\b\b\u0002\u0010.\u001a\u00020\u000e2\b\b\u0002\u0010/\u001a\u00020\u000e2\b\b\u0002\u00100\u001a\u00020\bHÆ\u0001¢\u0006\u0003\u0010\u0090\u0001J\u0016\u0010\u0091\u0001\u001a\u00020\u000e2\n\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u0093\u0001HÖ\u0003J\n\u0010\u0094\u0001\u001a\u00020\u0004HÖ\u0001J\n\u0010\u0095\u0001\u001a\u00020\bHÖ\u0001J-\u0010\u0096\u0001\u001a\u00030\u0097\u00012\u0007\u0010\u0098\u0001\u001a\u00020\u00002\b\u0010\u0099\u0001\u001a\u00030\u009a\u00012\b\u0010\u009b\u0001\u001a\u00030\u009c\u0001H\u0001¢\u0006\u0003\b\u009d\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\n\n\u0002\u0010;\u001a\u0004\b:\u00109R\u0014\u0010\u0006\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u00109R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0018\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\n\n\u0002\u0010;\u001a\u0004\b?\u00109R\u0016\u0010\n\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010>R\u0014\u0010\u000b\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0014\u0010\f\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010BR\u0018\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0096\u0004¢\u0006\n\n\u0002\u0010F\u001a\u0004\bD\u0010ER\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000eX\u0096\u0004¢\u0006\n\n\u0002\u0010F\u001a\u0004\bG\u0010ER\u0014\u0010\u0010\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u0010BR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u0010>R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\n\n\u0002\u0010;\u001a\u0004\bJ\u00109R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\n\n\u0002\u0010;\u001a\u0004\bK\u00109R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u000eX\u0096\u0004¢\u0006\n\n\u0002\u0010F\u001a\u0004\bL\u0010ER\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\n\n\u0002\u0010;\u001a\u0004\bM\u00109R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bN\u0010>R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bO\u0010>R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bP\u0010>R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\n\n\u0002\u0010;\u001a\u0004\bQ\u00109R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\n\n\u0002\u0010;\u001a\u0004\bR\u00109R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\n\n\u0002\u0010;\u001a\u0004\bS\u00109R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bT\u0010>R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bU\u0010>R\u0014\u0010\u001e\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bV\u00109R\u0016\u0010\u001f\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bW\u0010>R\u0016\u0010 \u001a\u0004\u0018\u00010!X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bX\u0010YR\u0014\u0010\"\u001a\u00020#X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010[R\u0016\u0010$\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010>R\u0016\u0010%\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b]\u0010>R\u001c\u0010&\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010'X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b^\u0010_R\u0018\u0010)\u001a\u0004\u0018\u00010*X\u0096\u0004¢\u0006\n\n\u0002\u0010b\u001a\u0004\b`\u0010aR\u0014\u0010+\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bc\u0010>R\u0014\u0010,\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bd\u0010>R\u0014\u0010-\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\be\u0010BR\u0014\u0010.\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bf\u0010gR\u0014\u0010/\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010gR\u0014\u00100\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bh\u0010>¨\u0006 \u0001"}, d2 = {"Lcom/discord/chat/bridge/codedlinks/VoiceChannelListInviteEmbedImpl;", "Lcom/discord/chat/bridge/codedlinks/CodedLinkEmbed;", "Lcom/discord/chat/bridge/codedlinks/VoiceChannelListInviteEmbed;", "acceptLabelBackgroundColor", "", "acceptLabelBorderColor", "acceptLabelColor", "acceptLabelText", "", "bodyTextColor", "bodyText", ViewProps.BACKGROUND_COLOR, ViewProps.BORDER_COLOR, "canBeAccepted", "", "embedCanBeTapped", "headerColor", "headerText", "resolvingGradientEnd", "resolvingGradientStart", "splashHasRadialGradient", "splashOpacity", "splashUrl", "inviteSplash", "subtitle", "subtitleColor", "thumbnailBackgroundColor", "thumbnailCornerRadius", "thumbnailText", "thumbnailUrl", "titleColor", "titleText", "type", "Lcom/discord/chat/bridge/codedlinks/InviteType;", "extendedType", "Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;", "guildIcon", "guildName", "voiceUsers", "", "Lcom/discord/chat/bridge/codedlinks/VoiceUser;", "voiceStartTimestamp", "", "emptyStateText", "streamingLabel", "voiceHeaderBackgroundColor", "reducedMotion", "isConnected", "privacyHintText", "<init>", "(ILjava/lang/Integer;ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;IILjava/lang/Boolean;Ljava/lang/Boolean;ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lcom/discord/chat/bridge/codedlinks/InviteType;Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;IZZLjava/lang/String;)V", "seen0", "seen1", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IIILjava/lang/Integer;ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;IILjava/lang/Boolean;Ljava/lang/Boolean;ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lcom/discord/chat/bridge/codedlinks/InviteType;Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;IZZLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getAcceptLabelBackgroundColor", "()Ljava/lang/Integer;", "getAcceptLabelBorderColor", "Ljava/lang/Integer;", "getAcceptLabelColor", "getAcceptLabelText", "()Ljava/lang/String;", "getBodyTextColor", "getBodyText", "getBackgroundColor", "()I", "getBorderColor", "getCanBeAccepted", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getEmbedCanBeTapped", "getHeaderColor", "getHeaderText", "getResolvingGradientEnd", "getResolvingGradientStart", "getSplashHasRadialGradient", "getSplashOpacity", "getSplashUrl", "getInviteSplash", "getSubtitle", "getSubtitleColor", "getThumbnailBackgroundColor", "getThumbnailCornerRadius", "getThumbnailText", "getThumbnailUrl", "getTitleColor", "getTitleText", "getType", "()Lcom/discord/chat/bridge/codedlinks/InviteType;", "getExtendedType", "()Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;", "getGuildIcon", "getGuildName", "getVoiceUsers", "()Ljava/util/List;", "getVoiceStartTimestamp", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getEmptyStateText", "getStreamingLabel", "getVoiceHeaderBackgroundColor", "getReducedMotion", "()Z", "getPrivacyHintText", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "copy", "(ILjava/lang/Integer;ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;IILjava/lang/Boolean;Ljava/lang/Boolean;ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lcom/discord/chat/bridge/codedlinks/InviteType;Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;IZZLjava/lang/String;)Lcom/discord/chat/bridge/codedlinks/VoiceChannelListInviteEmbedImpl;", "equals", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class VoiceChannelListInviteEmbedImpl extends CodedLinkEmbed implements VoiceChannelListInviteEmbed {
    private final int acceptLabelBackgroundColor;
    private final Integer acceptLabelBorderColor;
    private final int acceptLabelColor;

    @NotNull
    private final String acceptLabelText;
    private final int backgroundColor;
    private final String bodyText;
    private final Integer bodyTextColor;
    private final int borderColor;
    private final Boolean canBeAccepted;
    private final Boolean embedCanBeTapped;

    @NotNull
    private final String emptyStateText;

    @NotNull
    private final CodedLinkExtendedType extendedType;
    private final String guildIcon;
    private final String guildName;
    private final int headerColor;
    private final String headerText;
    private final String inviteSplash;
    private final boolean isConnected;

    @NotNull
    private final String privacyHintText;
    private final boolean reducedMotion;
    private final Integer resolvingGradientEnd;
    private final Integer resolvingGradientStart;
    private final Boolean splashHasRadialGradient;
    private final Integer splashOpacity;
    private final String splashUrl;

    @NotNull
    private final String streamingLabel;
    private final String subtitle;
    private final Integer subtitleColor;
    private final Integer thumbnailBackgroundColor;
    private final Integer thumbnailCornerRadius;
    private final String thumbnailText;
    private final String thumbnailUrl;
    private final int titleColor;
    private final String titleText;
    private final InviteType type;
    private final int voiceHeaderBackgroundColor;
    private final Long voiceStartTimestamp;
    private final List<VoiceUser> voiceUsers;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, l.a(m.f19486e, new a(1)), null, null, null, null, null, null, null};

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/codedlinks/VoiceChannelListInviteEmbedImpl$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/codedlinks/VoiceChannelListInviteEmbedImpl;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return VoiceChannelListInviteEmbedImpl$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ VoiceChannelListInviteEmbedImpl(int i7, int i10, int i11, Integer num, int i12, String str, Integer num2, String str2, int i13, int i14, Boolean bool, Boolean bool2, int i15, String str3, Integer num3, Integer num4, Boolean bool3, Integer num5, String str4, String str5, String str6, Integer num6, Integer num7, Integer num8, String str7, String str8, int i16, String str9, InviteType inviteType, CodedLinkExtendedType codedLinkExtendedType, String str10, String str11, List list, Long l6, String str12, String str13, int i17, boolean z5, boolean z6, String str14, SerializationConstructorMarker serializationConstructorMarker) {
        DefaultConstructorMarker defaultConstructorMarker = null;
        if ((16780493 != (i7 & 16780493)) || (39 != (i10 & 39))) {
            e1.k(new int[]{i7, i10}, new int[]{16780493, 39}, VoiceChannelListInviteEmbedImpl$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        super(defaultConstructorMarker);
        this.acceptLabelBackgroundColor = i11;
        if ((i7 & 2) == 0) {
            this.acceptLabelBorderColor = null;
        } else {
            this.acceptLabelBorderColor = num;
        }
        this.acceptLabelColor = i12;
        this.acceptLabelText = str;
        if ((i7 & 16) == 0) {
            this.bodyTextColor = null;
        } else {
            this.bodyTextColor = num2;
        }
        if ((i7 & 32) == 0) {
            this.bodyText = null;
        } else {
            this.bodyText = str2;
        }
        this.backgroundColor = i13;
        this.borderColor = i14;
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
        this.headerColor = i15;
        this.headerText = str3;
        if ((i7 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) == 0) {
            this.resolvingGradientEnd = null;
        } else {
            this.resolvingGradientEnd = num3;
        }
        if ((i7 & 8192) == 0) {
            this.resolvingGradientStart = null;
        } else {
            this.resolvingGradientStart = num4;
        }
        if ((i7 & 16384) == 0) {
            this.splashHasRadialGradient = null;
        } else {
            this.splashHasRadialGradient = bool3;
        }
        if ((32768 & i7) == 0) {
            this.splashOpacity = null;
        } else {
            this.splashOpacity = num5;
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
            this.subtitleColor = num6;
        }
        if ((1048576 & i7) == 0) {
            this.thumbnailBackgroundColor = null;
        } else {
            this.thumbnailBackgroundColor = num7;
        }
        if ((2097152 & i7) == 0) {
            this.thumbnailCornerRadius = null;
        } else {
            this.thumbnailCornerRadius = num8;
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
        this.titleColor = i16;
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
        this.extendedType = (134217728 & i7) == 0 ? CodedLinkExtendedType.VOICE_CHANNEL_LIST_INVITE : codedLinkExtendedType;
        if ((268435456 & i7) == 0) {
            this.guildIcon = null;
        } else {
            this.guildIcon = str10;
        }
        if ((536870912 & i7) == 0) {
            this.guildName = null;
        } else {
            this.guildName = str11;
        }
        if ((1073741824 & i7) == 0) {
            this.voiceUsers = null;
        } else {
            this.voiceUsers = list;
        }
        if ((i7 & Integer.MIN_VALUE) == 0) {
            this.voiceStartTimestamp = null;
        } else {
            this.voiceStartTimestamp = l6;
        }
        this.emptyStateText = str12;
        this.streamingLabel = str13;
        this.voiceHeaderBackgroundColor = i17;
        if ((i10 & 8) == 0) {
            this.reducedMotion = false;
        } else {
            this.reducedMotion = z5;
        }
        if ((i10 & 16) == 0) {
            this.isConnected = false;
        } else {
            this.isConnected = z6;
        }
        this.privacyHintText = str14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(VoiceUser$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VoiceChannelListInviteEmbedImpl copy$default(VoiceChannelListInviteEmbedImpl voiceChannelListInviteEmbedImpl, int i7, Integer num, int i10, String str, Integer num2, String str2, int i11, int i12, Boolean bool, Boolean bool2, int i13, String str3, Integer num3, Integer num4, Boolean bool3, Integer num5, String str4, String str5, String str6, Integer num6, Integer num7, Integer num8, String str7, String str8, int i14, String str9, InviteType inviteType, CodedLinkExtendedType codedLinkExtendedType, String str10, String str11, List list, Long l6, String str12, String str13, int i15, boolean z5, boolean z6, String str14, int i16, int i17, Object obj) {
        String str15;
        boolean z7;
        int i18 = (i16 & 1) != 0 ? voiceChannelListInviteEmbedImpl.acceptLabelBackgroundColor : i7;
        Integer num9 = (i16 & 2) != 0 ? voiceChannelListInviteEmbedImpl.acceptLabelBorderColor : num;
        int i19 = (i16 & 4) != 0 ? voiceChannelListInviteEmbedImpl.acceptLabelColor : i10;
        String str16 = (i16 & 8) != 0 ? voiceChannelListInviteEmbedImpl.acceptLabelText : str;
        Integer num10 = (i16 & 16) != 0 ? voiceChannelListInviteEmbedImpl.bodyTextColor : num2;
        String str17 = (i16 & 32) != 0 ? voiceChannelListInviteEmbedImpl.bodyText : str2;
        int i20 = (i16 & 64) != 0 ? voiceChannelListInviteEmbedImpl.backgroundColor : i11;
        int i21 = (i16 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? voiceChannelListInviteEmbedImpl.borderColor : i12;
        Boolean bool4 = (i16 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? voiceChannelListInviteEmbedImpl.canBeAccepted : bool;
        Boolean bool5 = (i16 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? voiceChannelListInviteEmbedImpl.embedCanBeTapped : bool2;
        int i22 = (i16 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? voiceChannelListInviteEmbedImpl.headerColor : i13;
        String str18 = (i16 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? voiceChannelListInviteEmbedImpl.headerText : str3;
        Integer num11 = (i16 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? voiceChannelListInviteEmbedImpl.resolvingGradientEnd : num3;
        Integer num12 = (i16 & 8192) != 0 ? voiceChannelListInviteEmbedImpl.resolvingGradientStart : num4;
        int i23 = i18;
        Boolean bool6 = (i16 & 16384) != 0 ? voiceChannelListInviteEmbedImpl.splashHasRadialGradient : bool3;
        Integer num13 = (i16 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? voiceChannelListInviteEmbedImpl.splashOpacity : num5;
        String str19 = (i16 & 65536) != 0 ? voiceChannelListInviteEmbedImpl.splashUrl : str4;
        String str20 = (i16 & 131072) != 0 ? voiceChannelListInviteEmbedImpl.inviteSplash : str5;
        String str21 = (i16 & 262144) != 0 ? voiceChannelListInviteEmbedImpl.subtitle : str6;
        Integer num14 = (i16 & 524288) != 0 ? voiceChannelListInviteEmbedImpl.subtitleColor : num6;
        Integer num15 = (i16 & 1048576) != 0 ? voiceChannelListInviteEmbedImpl.thumbnailBackgroundColor : num7;
        Integer num16 = (i16 & 2097152) != 0 ? voiceChannelListInviteEmbedImpl.thumbnailCornerRadius : num8;
        String str22 = (i16 & 4194304) != 0 ? voiceChannelListInviteEmbedImpl.thumbnailText : str7;
        String str23 = (i16 & 8388608) != 0 ? voiceChannelListInviteEmbedImpl.thumbnailUrl : str8;
        int i24 = (i16 & PointerEventHelper.X_FLAG_SUPPORTS_HOVER) != 0 ? voiceChannelListInviteEmbedImpl.titleColor : i14;
        String str24 = (i16 & 33554432) != 0 ? voiceChannelListInviteEmbedImpl.titleText : str9;
        InviteType inviteType2 = (i16 & 67108864) != 0 ? voiceChannelListInviteEmbedImpl.type : inviteType;
        CodedLinkExtendedType codedLinkExtendedType2 = (i16 & 134217728) != 0 ? voiceChannelListInviteEmbedImpl.extendedType : codedLinkExtendedType;
        String str25 = (i16 & 268435456) != 0 ? voiceChannelListInviteEmbedImpl.guildIcon : str10;
        String str26 = (i16 & 536870912) != 0 ? voiceChannelListInviteEmbedImpl.guildName : str11;
        List list2 = (i16 & 1073741824) != 0 ? voiceChannelListInviteEmbedImpl.voiceUsers : list;
        Long l7 = (i16 & Integer.MIN_VALUE) != 0 ? voiceChannelListInviteEmbedImpl.voiceStartTimestamp : l6;
        String str27 = (i17 & 1) != 0 ? voiceChannelListInviteEmbedImpl.emptyStateText : str12;
        String str28 = (i17 & 2) != 0 ? voiceChannelListInviteEmbedImpl.streamingLabel : str13;
        int i25 = (i17 & 4) != 0 ? voiceChannelListInviteEmbedImpl.voiceHeaderBackgroundColor : i15;
        boolean z10 = (i17 & 8) != 0 ? voiceChannelListInviteEmbedImpl.reducedMotion : z5;
        boolean z11 = (i17 & 16) != 0 ? voiceChannelListInviteEmbedImpl.isConnected : z6;
        if ((i17 & 32) != 0) {
            z7 = z11;
            str15 = voiceChannelListInviteEmbedImpl.privacyHintText;
        } else {
            str15 = str14;
            z7 = z11;
        }
        return voiceChannelListInviteEmbedImpl.copy(i23, num9, i19, str16, num10, str17, i20, i21, bool4, bool5, i22, str18, num11, num12, bool6, num13, str19, str20, str21, num14, num15, num16, str22, str23, i24, str24, inviteType2, codedLinkExtendedType2, str25, str26, list2, l7, str27, str28, i25, z10, z7, str15);
    }

    public static final /* synthetic */ void write$Self$chat_release(VoiceChannelListInviteEmbedImpl self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Lazy[] lazyArr = $childSerializers;
        output.l(0, self.getAcceptLabelBackgroundColor().intValue(), serialDesc);
        if (output.u(serialDesc, 1) || self.getAcceptLabelBorderColor() != null) {
            output.r(serialDesc, 1, m0.f17573a, self.getAcceptLabelBorderColor());
        }
        output.l(2, self.getAcceptLabelColor().intValue(), serialDesc);
        output.q(serialDesc, 3, self.getAcceptLabelText());
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
        output.l(24, self.getTitleColor().intValue(), serialDesc);
        if (output.u(serialDesc, 25) || self.getTitleText() != null) {
            output.r(serialDesc, 25, s1Var, self.getTitleText());
        }
        if (output.u(serialDesc, 26) || self.getType() != null) {
            output.r(serialDesc, 26, InviteType.Serializer.INSTANCE, self.getType());
        }
        if (output.u(serialDesc, 27) || self.getExtendedType() != CodedLinkExtendedType.VOICE_CHANNEL_LIST_INVITE) {
            output.g(serialDesc, 27, CodedLinkExtendedType.Serializer.INSTANCE, self.getExtendedType());
        }
        if (output.u(serialDesc, 28) || self.getGuildIcon() != null) {
            output.r(serialDesc, 28, s1Var, self.getGuildIcon());
        }
        if (output.u(serialDesc, 29) || self.getGuildName() != null) {
            output.r(serialDesc, 29, s1Var, self.getGuildName());
        }
        if (output.u(serialDesc, 30) || self.getVoiceUsers() != null) {
            output.r(serialDesc, 30, (KSerializer) lazyArr[30].getValue(), self.getVoiceUsers());
        }
        if (output.u(serialDesc, 31) || self.getVoiceStartTimestamp() != null) {
            output.r(serialDesc, 31, r0.f17595a, self.getVoiceStartTimestamp());
        }
        output.q(serialDesc, 32, self.getEmptyStateText());
        output.q(serialDesc, 33, self.getStreamingLabel());
        output.l(34, self.getVoiceHeaderBackgroundColor(), serialDesc);
        if (output.u(serialDesc, 35) || self.getReducedMotion()) {
            output.p(serialDesc, 35, self.getReducedMotion());
        }
        if (output.u(serialDesc, 36) || self.isConnected()) {
            output.p(serialDesc, 36, self.isConnected());
        }
        output.q(serialDesc, 37, self.getPrivacyHintText());
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getAcceptLabelBackgroundColor() {
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
    public final int getTitleColor() {
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
    public final String getGuildIcon() {
        return this.guildIcon;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getAcceptLabelColor() {
        return this.acceptLabelColor;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final String getGuildName() {
        return this.guildName;
    }

    public final List<VoiceUser> component31() {
        return this.voiceUsers;
    }

    /* JADX INFO: renamed from: component32, reason: from getter */
    public final Long getVoiceStartTimestamp() {
        return this.voiceStartTimestamp;
    }

    @NotNull
    /* JADX INFO: renamed from: component33, reason: from getter */
    public final String getEmptyStateText() {
        return this.emptyStateText;
    }

    @NotNull
    /* JADX INFO: renamed from: component34, reason: from getter */
    public final String getStreamingLabel() {
        return this.streamingLabel;
    }

    /* JADX INFO: renamed from: component35, reason: from getter */
    public final int getVoiceHeaderBackgroundColor() {
        return this.voiceHeaderBackgroundColor;
    }

    /* JADX INFO: renamed from: component36, reason: from getter */
    public final boolean getReducedMotion() {
        return this.reducedMotion;
    }

    /* JADX INFO: renamed from: component37, reason: from getter */
    public final boolean getIsConnected() {
        return this.isConnected;
    }

    @NotNull
    /* JADX INFO: renamed from: component38, reason: from getter */
    public final String getPrivacyHintText() {
        return this.privacyHintText;
    }

    @NotNull
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
    public final VoiceChannelListInviteEmbedImpl copy(int acceptLabelBackgroundColor, Integer acceptLabelBorderColor, int acceptLabelColor, @NotNull String acceptLabelText, Integer bodyTextColor, String bodyText, int backgroundColor, int borderColor, Boolean canBeAccepted, Boolean embedCanBeTapped, int headerColor, String headerText, Integer resolvingGradientEnd, Integer resolvingGradientStart, Boolean splashHasRadialGradient, Integer splashOpacity, String splashUrl, String inviteSplash, String subtitle, Integer subtitleColor, Integer thumbnailBackgroundColor, Integer thumbnailCornerRadius, String thumbnailText, String thumbnailUrl, int titleColor, String titleText, InviteType type, @NotNull CodedLinkExtendedType extendedType, String guildIcon, String guildName, List<VoiceUser> voiceUsers, Long voiceStartTimestamp, @NotNull String emptyStateText, @NotNull String streamingLabel, int voiceHeaderBackgroundColor, boolean reducedMotion, boolean isConnected, @NotNull String privacyHintText) {
        Intrinsics.checkNotNullParameter(acceptLabelText, "acceptLabelText");
        Intrinsics.checkNotNullParameter(extendedType, "extendedType");
        Intrinsics.checkNotNullParameter(emptyStateText, "emptyStateText");
        Intrinsics.checkNotNullParameter(streamingLabel, "streamingLabel");
        Intrinsics.checkNotNullParameter(privacyHintText, "privacyHintText");
        return new VoiceChannelListInviteEmbedImpl(acceptLabelBackgroundColor, acceptLabelBorderColor, acceptLabelColor, acceptLabelText, bodyTextColor, bodyText, backgroundColor, borderColor, canBeAccepted, embedCanBeTapped, headerColor, headerText, resolvingGradientEnd, resolvingGradientStart, splashHasRadialGradient, splashOpacity, splashUrl, inviteSplash, subtitle, subtitleColor, thumbnailBackgroundColor, thumbnailCornerRadius, thumbnailText, thumbnailUrl, titleColor, titleText, type, extendedType, guildIcon, guildName, voiceUsers, voiceStartTimestamp, emptyStateText, streamingLabel, voiceHeaderBackgroundColor, reducedMotion, isConnected, privacyHintText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VoiceChannelListInviteEmbedImpl)) {
            return false;
        }
        VoiceChannelListInviteEmbedImpl voiceChannelListInviteEmbedImpl = (VoiceChannelListInviteEmbedImpl) other;
        return this.acceptLabelBackgroundColor == voiceChannelListInviteEmbedImpl.acceptLabelBackgroundColor && Intrinsics.areEqual(this.acceptLabelBorderColor, voiceChannelListInviteEmbedImpl.acceptLabelBorderColor) && this.acceptLabelColor == voiceChannelListInviteEmbedImpl.acceptLabelColor && Intrinsics.areEqual(this.acceptLabelText, voiceChannelListInviteEmbedImpl.acceptLabelText) && Intrinsics.areEqual(this.bodyTextColor, voiceChannelListInviteEmbedImpl.bodyTextColor) && Intrinsics.areEqual(this.bodyText, voiceChannelListInviteEmbedImpl.bodyText) && this.backgroundColor == voiceChannelListInviteEmbedImpl.backgroundColor && this.borderColor == voiceChannelListInviteEmbedImpl.borderColor && Intrinsics.areEqual(this.canBeAccepted, voiceChannelListInviteEmbedImpl.canBeAccepted) && Intrinsics.areEqual(this.embedCanBeTapped, voiceChannelListInviteEmbedImpl.embedCanBeTapped) && this.headerColor == voiceChannelListInviteEmbedImpl.headerColor && Intrinsics.areEqual(this.headerText, voiceChannelListInviteEmbedImpl.headerText) && Intrinsics.areEqual(this.resolvingGradientEnd, voiceChannelListInviteEmbedImpl.resolvingGradientEnd) && Intrinsics.areEqual(this.resolvingGradientStart, voiceChannelListInviteEmbedImpl.resolvingGradientStart) && Intrinsics.areEqual(this.splashHasRadialGradient, voiceChannelListInviteEmbedImpl.splashHasRadialGradient) && Intrinsics.areEqual(this.splashOpacity, voiceChannelListInviteEmbedImpl.splashOpacity) && Intrinsics.areEqual(this.splashUrl, voiceChannelListInviteEmbedImpl.splashUrl) && Intrinsics.areEqual(this.inviteSplash, voiceChannelListInviteEmbedImpl.inviteSplash) && Intrinsics.areEqual(this.subtitle, voiceChannelListInviteEmbedImpl.subtitle) && Intrinsics.areEqual(this.subtitleColor, voiceChannelListInviteEmbedImpl.subtitleColor) && Intrinsics.areEqual(this.thumbnailBackgroundColor, voiceChannelListInviteEmbedImpl.thumbnailBackgroundColor) && Intrinsics.areEqual(this.thumbnailCornerRadius, voiceChannelListInviteEmbedImpl.thumbnailCornerRadius) && Intrinsics.areEqual(this.thumbnailText, voiceChannelListInviteEmbedImpl.thumbnailText) && Intrinsics.areEqual(this.thumbnailUrl, voiceChannelListInviteEmbedImpl.thumbnailUrl) && this.titleColor == voiceChannelListInviteEmbedImpl.titleColor && Intrinsics.areEqual(this.titleText, voiceChannelListInviteEmbedImpl.titleText) && this.type == voiceChannelListInviteEmbedImpl.type && this.extendedType == voiceChannelListInviteEmbedImpl.extendedType && Intrinsics.areEqual(this.guildIcon, voiceChannelListInviteEmbedImpl.guildIcon) && Intrinsics.areEqual(this.guildName, voiceChannelListInviteEmbedImpl.guildName) && Intrinsics.areEqual(this.voiceUsers, voiceChannelListInviteEmbedImpl.voiceUsers) && Intrinsics.areEqual(this.voiceStartTimestamp, voiceChannelListInviteEmbedImpl.voiceStartTimestamp) && Intrinsics.areEqual(this.emptyStateText, voiceChannelListInviteEmbedImpl.emptyStateText) && Intrinsics.areEqual(this.streamingLabel, voiceChannelListInviteEmbedImpl.streamingLabel) && this.voiceHeaderBackgroundColor == voiceChannelListInviteEmbedImpl.voiceHeaderBackgroundColor && this.reducedMotion == voiceChannelListInviteEmbedImpl.reducedMotion && this.isConnected == voiceChannelListInviteEmbedImpl.isConnected && Intrinsics.areEqual(this.privacyHintText, voiceChannelListInviteEmbedImpl.privacyHintText);
    }

    @Override // com.discord.chat.bridge.codedlinks.CodedLinkEmbed
    @NotNull
    public Integer getAcceptLabelBackgroundColor() {
        return Integer.valueOf(this.acceptLabelBackgroundColor);
    }

    @Override // com.discord.chat.bridge.codedlinks.CodedLinkEmbed
    public Integer getAcceptLabelBorderColor() {
        return this.acceptLabelBorderColor;
    }

    @Override // com.discord.chat.bridge.codedlinks.CodedLinkEmbed
    @NotNull
    public Integer getAcceptLabelColor() {
        return Integer.valueOf(this.acceptLabelColor);
    }

    @Override // com.discord.chat.bridge.codedlinks.CodedLinkEmbed
    @NotNull
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

    @Override // com.discord.chat.bridge.codedlinks.CodedLinkEmbed
    public Boolean getEmbedCanBeTapped() {
        return this.embedCanBeTapped;
    }

    @Override // com.discord.chat.bridge.codedlinks.VoiceChannelListInviteEmbed
    @NotNull
    public String getEmptyStateText() {
        return this.emptyStateText;
    }

    @Override // com.discord.chat.bridge.codedlinks.VoiceChannelListInviteEmbed
    @NotNull
    public CodedLinkExtendedType getExtendedType() {
        return this.extendedType;
    }

    @Override // com.discord.chat.bridge.codedlinks.VoiceChannelListInviteEmbed
    public String getGuildIcon() {
        return this.guildIcon;
    }

    @Override // com.discord.chat.bridge.codedlinks.VoiceChannelListInviteEmbed
    public String getGuildName() {
        return this.guildName;
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

    @Override // com.discord.chat.bridge.codedlinks.VoiceChannelListInviteEmbed
    @NotNull
    public String getPrivacyHintText() {
        return this.privacyHintText;
    }

    @Override // com.discord.chat.bridge.codedlinks.VoiceChannelListInviteEmbed
    public boolean getReducedMotion() {
        return this.reducedMotion;
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

    @Override // com.discord.chat.bridge.codedlinks.VoiceChannelListInviteEmbed
    @NotNull
    public String getStreamingLabel() {
        return this.streamingLabel;
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
    @NotNull
    public Integer getTitleColor() {
        return Integer.valueOf(this.titleColor);
    }

    @Override // com.discord.chat.bridge.codedlinks.CodedLinkEmbed
    public String getTitleText() {
        return this.titleText;
    }

    @Override // com.discord.chat.bridge.codedlinks.CodedLinkEmbed
    public InviteType getType() {
        return this.type;
    }

    @Override // com.discord.chat.bridge.codedlinks.VoiceChannelListInviteEmbed
    public int getVoiceHeaderBackgroundColor() {
        return this.voiceHeaderBackgroundColor;
    }

    @Override // com.discord.chat.bridge.codedlinks.VoiceChannelListInviteEmbed
    public Long getVoiceStartTimestamp() {
        return this.voiceStartTimestamp;
    }

    @Override // com.discord.chat.bridge.codedlinks.VoiceChannelListInviteEmbed
    public List<VoiceUser> getVoiceUsers() {
        return this.voiceUsers;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.acceptLabelBackgroundColor) * 31;
        Integer num = this.acceptLabelBorderColor;
        int iD = e.d(com.discord.chat.presentation.list.a.u(this.acceptLabelColor, (iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31), 31, this.acceptLabelText);
        Integer num2 = this.bodyTextColor;
        int iHashCode2 = (iD + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.bodyText;
        int iU = com.discord.chat.presentation.list.a.u(this.borderColor, com.discord.chat.presentation.list.a.u(this.backgroundColor, (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
        Boolean bool = this.canBeAccepted;
        int iHashCode3 = (iU + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.embedCanBeTapped;
        int iU2 = com.discord.chat.presentation.list.a.u(this.headerColor, (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31, 31);
        String str2 = this.headerText;
        int iHashCode4 = (iU2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num3 = this.resolvingGradientEnd;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.resolvingGradientStart;
        int iHashCode6 = (iHashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Boolean bool3 = this.splashHasRadialGradient;
        int iHashCode7 = (iHashCode6 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Integer num5 = this.splashOpacity;
        int iHashCode8 = (iHashCode7 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str3 = this.splashUrl;
        int iHashCode9 = (iHashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.inviteSplash;
        int iHashCode10 = (iHashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.subtitle;
        int iHashCode11 = (iHashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num6 = this.subtitleColor;
        int iHashCode12 = (iHashCode11 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.thumbnailBackgroundColor;
        int iHashCode13 = (iHashCode12 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.thumbnailCornerRadius;
        int iHashCode14 = (iHashCode13 + (num8 == null ? 0 : num8.hashCode())) * 31;
        String str6 = this.thumbnailText;
        int iHashCode15 = (iHashCode14 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.thumbnailUrl;
        int iU3 = com.discord.chat.presentation.list.a.u(this.titleColor, (iHashCode15 + (str7 == null ? 0 : str7.hashCode())) * 31, 31);
        String str8 = this.titleText;
        int iHashCode16 = (iU3 + (str8 == null ? 0 : str8.hashCode())) * 31;
        InviteType inviteType = this.type;
        int iHashCode17 = (this.extendedType.hashCode() + ((iHashCode16 + (inviteType == null ? 0 : inviteType.hashCode())) * 31)) * 31;
        String str9 = this.guildIcon;
        int iHashCode18 = (iHashCode17 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.guildName;
        int iHashCode19 = (iHashCode18 + (str10 == null ? 0 : str10.hashCode())) * 31;
        List<VoiceUser> list = this.voiceUsers;
        int iHashCode20 = (iHashCode19 + (list == null ? 0 : list.hashCode())) * 31;
        Long l6 = this.voiceStartTimestamp;
        return this.privacyHintText.hashCode() + com.discord.chat.presentation.list.a.g(com.discord.chat.presentation.list.a.g(com.discord.chat.presentation.list.a.u(this.voiceHeaderBackgroundColor, e.d(e.d((iHashCode20 + (l6 != null ? l6.hashCode() : 0)) * 31, 31, this.emptyStateText), 31, this.streamingLabel), 31), 31, this.reducedMotion), 31, this.isConnected);
    }

    @Override // com.discord.chat.bridge.codedlinks.VoiceChannelListInviteEmbed
    public boolean isConnected() {
        return this.isConnected;
    }

    @NotNull
    public String toString() {
        int i7 = this.acceptLabelBackgroundColor;
        Integer num = this.acceptLabelBorderColor;
        int i10 = this.acceptLabelColor;
        String str = this.acceptLabelText;
        Integer num2 = this.bodyTextColor;
        String str2 = this.bodyText;
        int i11 = this.backgroundColor;
        int i12 = this.borderColor;
        Boolean bool = this.canBeAccepted;
        Boolean bool2 = this.embedCanBeTapped;
        int i13 = this.headerColor;
        String str3 = this.headerText;
        Integer num3 = this.resolvingGradientEnd;
        Integer num4 = this.resolvingGradientStart;
        Boolean bool3 = this.splashHasRadialGradient;
        Integer num5 = this.splashOpacity;
        String str4 = this.splashUrl;
        String str5 = this.inviteSplash;
        String str6 = this.subtitle;
        Integer num6 = this.subtitleColor;
        Integer num7 = this.thumbnailBackgroundColor;
        Integer num8 = this.thumbnailCornerRadius;
        String str7 = this.thumbnailText;
        String str8 = this.thumbnailUrl;
        int i14 = this.titleColor;
        String str9 = this.titleText;
        InviteType inviteType = this.type;
        CodedLinkExtendedType codedLinkExtendedType = this.extendedType;
        String str10 = this.guildIcon;
        String str11 = this.guildName;
        List<VoiceUser> list = this.voiceUsers;
        Long l6 = this.voiceStartTimestamp;
        String str12 = this.emptyStateText;
        String str13 = this.streamingLabel;
        int i15 = this.voiceHeaderBackgroundColor;
        boolean z5 = this.reducedMotion;
        boolean z6 = this.isConnected;
        String str14 = this.privacyHintText;
        StringBuilder sb2 = new StringBuilder("VoiceChannelListInviteEmbedImpl(acceptLabelBackgroundColor=");
        sb2.append(i7);
        sb2.append(", acceptLabelBorderColor=");
        sb2.append(num);
        sb2.append(", acceptLabelColor=");
        sb2.append(i10);
        sb2.append(", acceptLabelText=");
        sb2.append(str);
        sb2.append(", bodyTextColor=");
        b.r(num2, ", bodyText=", str2, ", backgroundColor=", sb2);
        e.z(sb2, i11, ", borderColor=", i12, ", canBeAccepted=");
        sb2.append(bool);
        sb2.append(", embedCanBeTapped=");
        sb2.append(bool2);
        sb2.append(", headerColor=");
        sb2.append(i13);
        sb2.append(", headerText=");
        sb2.append(str3);
        sb2.append(", resolvingGradientEnd=");
        b.s(sb2, num3, ", resolvingGradientStart=", num4, ", splashHasRadialGradient=");
        sb2.append(bool3);
        sb2.append(", splashOpacity=");
        sb2.append(num5);
        sb2.append(", splashUrl=");
        e.A(sb2, str4, ", inviteSplash=", str5, ", subtitle=");
        com.discord.chat.presentation.list.a.r(num6, str6, ", subtitleColor=", ", thumbnailBackgroundColor=", sb2);
        b.s(sb2, num7, ", thumbnailCornerRadius=", num8, ", thumbnailText=");
        e.A(sb2, str7, ", thumbnailUrl=", str8, ", titleColor=");
        sb2.append(i14);
        sb2.append(", titleText=");
        sb2.append(str9);
        sb2.append(", type=");
        sb2.append(inviteType);
        sb2.append(", extendedType=");
        sb2.append(codedLinkExtendedType);
        sb2.append(", guildIcon=");
        e.A(sb2, str10, ", guildName=", str11, ", voiceUsers=");
        sb2.append(list);
        sb2.append(", voiceStartTimestamp=");
        sb2.append(l6);
        sb2.append(", emptyStateText=");
        e.A(sb2, str12, ", streamingLabel=", str13, ", voiceHeaderBackgroundColor=");
        sb2.append(i15);
        sb2.append(", reducedMotion=");
        sb2.append(z5);
        sb2.append(", isConnected=");
        sb2.append(z6);
        sb2.append(", privacyHintText=");
        sb2.append(str14);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ VoiceChannelListInviteEmbedImpl(int i7, Integer num, int i10, String str, Integer num2, String str2, int i11, int i12, Boolean bool, Boolean bool2, int i13, String str3, Integer num3, Integer num4, Boolean bool3, Integer num5, String str4, String str5, String str6, Integer num6, Integer num7, Integer num8, String str7, String str8, int i14, String str9, InviteType inviteType, CodedLinkExtendedType codedLinkExtendedType, String str10, String str11, List list, Long l6, String str12, String str13, int i15, boolean z5, boolean z6, String str14, int i16, int i17, DefaultConstructorMarker defaultConstructorMarker) {
        this(i7, (i16 & 2) != 0 ? null : num, i10, str, (i16 & 16) != 0 ? null : num2, (i16 & 32) != 0 ? null : str2, i11, i12, (i16 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : bool, (i16 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? null : bool2, i13, str3, (i16 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : num3, (i16 & 8192) != 0 ? null : num4, (i16 & 16384) != 0 ? null : bool3, (32768 & i16) != 0 ? null : num5, (65536 & i16) != 0 ? null : str4, (131072 & i16) != 0 ? null : str5, (262144 & i16) != 0 ? null : str6, (524288 & i16) != 0 ? null : num6, (1048576 & i16) != 0 ? null : num7, (2097152 & i16) != 0 ? null : num8, (4194304 & i16) != 0 ? null : str7, (8388608 & i16) != 0 ? null : str8, i14, (33554432 & i16) != 0 ? null : str9, (67108864 & i16) != 0 ? null : inviteType, (134217728 & i16) != 0 ? CodedLinkExtendedType.VOICE_CHANNEL_LIST_INVITE : codedLinkExtendedType, (268435456 & i16) != 0 ? null : str10, (536870912 & i16) != 0 ? null : str11, (1073741824 & i16) != 0 ? null : list, (i16 & Integer.MIN_VALUE) != 0 ? null : l6, str12, str13, i15, (i17 & 8) != 0 ? false : z5, (i17 & 16) != 0 ? false : z6, str14);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceChannelListInviteEmbedImpl(int i7, Integer num, int i10, @NotNull String acceptLabelText, Integer num2, String str, int i11, int i12, Boolean bool, Boolean bool2, int i13, String str2, Integer num3, Integer num4, Boolean bool3, Integer num5, String str3, String str4, String str5, Integer num6, Integer num7, Integer num8, String str6, String str7, int i14, String str8, InviteType inviteType, @NotNull CodedLinkExtendedType extendedType, String str9, String str10, List<VoiceUser> list, Long l6, @NotNull String emptyStateText, @NotNull String streamingLabel, int i15, boolean z5, boolean z6, @NotNull String privacyHintText) {
        super(null);
        Intrinsics.checkNotNullParameter(acceptLabelText, "acceptLabelText");
        Intrinsics.checkNotNullParameter(extendedType, "extendedType");
        Intrinsics.checkNotNullParameter(emptyStateText, "emptyStateText");
        Intrinsics.checkNotNullParameter(streamingLabel, "streamingLabel");
        Intrinsics.checkNotNullParameter(privacyHintText, "privacyHintText");
        this.acceptLabelBackgroundColor = i7;
        this.acceptLabelBorderColor = num;
        this.acceptLabelColor = i10;
        this.acceptLabelText = acceptLabelText;
        this.bodyTextColor = num2;
        this.bodyText = str;
        this.backgroundColor = i11;
        this.borderColor = i12;
        this.canBeAccepted = bool;
        this.embedCanBeTapped = bool2;
        this.headerColor = i13;
        this.headerText = str2;
        this.resolvingGradientEnd = num3;
        this.resolvingGradientStart = num4;
        this.splashHasRadialGradient = bool3;
        this.splashOpacity = num5;
        this.splashUrl = str3;
        this.inviteSplash = str4;
        this.subtitle = str5;
        this.subtitleColor = num6;
        this.thumbnailBackgroundColor = num7;
        this.thumbnailCornerRadius = num8;
        this.thumbnailText = str6;
        this.thumbnailUrl = str7;
        this.titleColor = i14;
        this.titleText = str8;
        this.type = inviteType;
        this.extendedType = extendedType;
        this.guildIcon = str9;
        this.guildName = str10;
        this.voiceUsers = list;
        this.voiceStartTimestamp = l6;
        this.emptyStateText = emptyStateText;
        this.streamingLabel = streamingLabel;
        this.voiceHeaderBackgroundColor = i15;
        this.reducedMotion = z5;
        this.isConnected = z6;
        this.privacyHintText = privacyHintText;
    }
}
