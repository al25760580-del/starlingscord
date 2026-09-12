package com.discord.chat.bridge.codedlinks;

import a3.e;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.presentation.list.a;
import com.discord.notifications.renderer.NotificationRenderer;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.PointerEventHelper;
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
import org.webrtc.PeerConnection;

/* JADX INFO: loaded from: classes.dex */
@f
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\bY\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u009a\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0004\u0099\u0001\u009a\u0001B«\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010#\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010$\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010(\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010)\u001a\u00020*\u0012\u0006\u0010+\u001a\u00020\t\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b/\u00100B\u0099\u0003\b\u0010\u0012\u0006\u00101\u001a\u00020\u0005\u0012\u0006\u00102\u001a\u00020\u0005\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0005\u0012\b\u0010!\u001a\u0004\u0018\u00010\t\u0012\b\u0010\"\u001a\u0004\u0018\u00010\t\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010&\u001a\u0004\u0018\u00010\t\u0012\b\u0010'\u001a\u0004\u0018\u00010\t\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010)\u001a\u0004\u0018\u00010*\u0012\b\u0010+\u001a\u0004\u0018\u00010\t\u0012\b\u0010,\u001a\u0004\u0018\u00010\t\u0012\b\u0010-\u001a\u0004\u0018\u00010\t\u0012\b\u0010.\u001a\u0004\u0018\u00010\t\u0012\b\u00103\u001a\u0004\u0018\u000104¢\u0006\u0004\b/\u00105J\t\u0010d\u001a\u00020\u0005HÆ\u0003J\t\u0010e\u001a\u00020\u0005HÆ\u0003J\t\u0010f\u001a\u00020\u0005HÆ\u0003J\t\u0010g\u001a\u00020\tHÆ\u0003J\t\u0010h\u001a\u00020\u000bHÆ\u0003J\t\u0010i\u001a\u00020\tHÆ\u0003J\t\u0010j\u001a\u00020\tHÆ\u0003J\t\u0010k\u001a\u00020\tHÆ\u0003J\t\u0010l\u001a\u00020\tHÆ\u0003J\u0010\u0010m\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010CJ\u0010\u0010n\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010CJ\u0010\u0010o\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010CJ\u000b\u0010p\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010q\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010CJ\u0010\u0010s\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0002\u0010KJ\u000b\u0010t\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010u\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010v\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0002\u0010KJ\u000b\u0010w\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010x\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010y\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010CJ\u0010\u0010z\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010CJ\u0010\u0010{\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0002\u0010KJ\u0010\u0010|\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010CJ\u000b\u0010}\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010~\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010\u007f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010CJ\u0011\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010CJ\u0011\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010CJ\f\u0010\u0082\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003J\f\u0010\u0083\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0011\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010CJ\n\u0010\u0085\u0001\u001a\u00020*HÆ\u0003J\n\u0010\u0086\u0001\u001a\u00020\tHÆ\u0003J\f\u0010\u0087\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003J\f\u0010\u0088\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003J\f\u0010\u0089\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003JÂ\u0003\u0010\u008a\u0001\u001a\u00020\u00002\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\t2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010#\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010$\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010(\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010)\u001a\u00020*2\b\b\u0002\u0010+\u001a\u00020\t2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0003\u0010\u008b\u0001J\u0016\u0010\u008c\u0001\u001a\u00020\u00172\n\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u008e\u0001HÖ\u0003J\n\u0010\u008f\u0001\u001a\u00020\u0005HÖ\u0001J\n\u0010\u0090\u0001\u001a\u00020\tHÖ\u0001J-\u0010\u0091\u0001\u001a\u00030\u0092\u00012\u0007\u0010\u0093\u0001\u001a\u00020\u00002\b\u0010\u0094\u0001\u001a\u00030\u0095\u00012\b\u0010\u0096\u0001\u001a\u00030\u0097\u0001H\u0001¢\u0006\u0003\b\u0098\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u00107R\u0014\u0010\u0007\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u00107R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0014\u0010\f\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010;R\u0014\u0010\r\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010;R\u0014\u0010\u000e\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010;R\u0014\u0010\u000f\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010;R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\n\n\u0002\u0010D\u001a\u0004\bB\u0010CR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\n\n\u0002\u0010D\u001a\u0004\bE\u0010CR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\n\n\u0002\u0010D\u001a\u0004\bF\u0010CR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u0010;R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u0010;R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\n\n\u0002\u0010D\u001a\u0004\bI\u0010CR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0096\u0004¢\u0006\n\n\u0002\u0010L\u001a\u0004\bJ\u0010KR\u0016\u0010\u0018\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bM\u0010;R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bN\u0010;R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u0017X\u0096\u0004¢\u0006\n\n\u0002\u0010L\u001a\u0004\bO\u0010KR\u0016\u0010\u001b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bP\u0010;R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010;R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\n\n\u0002\u0010D\u001a\u0004\bR\u0010CR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\n\n\u0002\u0010D\u001a\u0004\bS\u0010CR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u0017X\u0096\u0004¢\u0006\n\n\u0002\u0010L\u001a\u0004\bT\u0010KR\u0018\u0010 \u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\n\n\u0002\u0010D\u001a\u0004\bU\u0010CR\u0016\u0010!\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bV\u0010;R\u0016\u0010\"\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bW\u0010;R\u0018\u0010#\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\n\n\u0002\u0010D\u001a\u0004\bX\u0010CR\u0018\u0010$\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\n\n\u0002\u0010D\u001a\u0004\bY\u0010CR\u0018\u0010%\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\n\n\u0002\u0010D\u001a\u0004\bZ\u0010CR\u0016\u0010&\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b[\u0010;R\u0016\u0010'\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010;R\u0018\u0010(\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\n\n\u0002\u0010D\u001a\u0004\b]\u0010CR\u0014\u0010)\u001a\u00020*X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b^\u0010_R\u0014\u0010+\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b`\u0010;R\u0016\u0010,\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\ba\u0010;R\u0016\u0010-\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bb\u0010;R\u0016\u0010.\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bc\u0010;¨\u0006\u009b\u0001"}, d2 = {"Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;", "Lcom/discord/chat/bridge/codedlinks/CodedLinkEmbed;", "Lcom/discord/chat/bridge/codedlinks/GuildDisabledInviteEmbed;", "Lcom/discord/chat/bridge/codedlinks/GuildInviteExtendedEmbed;", ViewProps.BACKGROUND_COLOR, "", ViewProps.BORDER_COLOR, "headerColor", "headerText", "", "type", "Lcom/discord/chat/bridge/codedlinks/InviteType;", "titleText", "subtitle", "helpCenterArticleLabel", "helpCenterArticleURL", "acceptLabelBackgroundColor", "acceptLabelBorderColor", "acceptLabelColor", "acceptLabelText", "bodyText", "bodyTextColor", "canBeAccepted", "", "channelIcon", NotificationRenderer.CHANNEL_NAME, "embedCanBeTapped", "memberText", "onlineText", "resolvingGradientEnd", "resolvingGradientStart", "splashHasRadialGradient", "splashOpacity", "splashUrl", "inviteSplash", "subtitleColor", "thumbnailBackgroundColor", "thumbnailCornerRadius", "thumbnailText", "thumbnailUrl", "titleColor", "extendedType", "Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;", "guildName", "guildIcon", "headerIcon", "badgeIconUrl", "<init>", "(IIILjava/lang/String;Lcom/discord/chat/bridge/codedlinks/InviteType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "seen1", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IIIIILjava/lang/String;Lcom/discord/chat/bridge/codedlinks/InviteType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getBackgroundColor", "()I", "getBorderColor", "getHeaderColor", "getHeaderText", "()Ljava/lang/String;", "getType", "()Lcom/discord/chat/bridge/codedlinks/InviteType;", "getTitleText", "getSubtitle", "getHelpCenterArticleLabel", "getHelpCenterArticleURL", "getAcceptLabelBackgroundColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAcceptLabelBorderColor", "getAcceptLabelColor", "getAcceptLabelText", "getBodyText", "getBodyTextColor", "getCanBeAccepted", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getChannelIcon", "getChannelName", "getEmbedCanBeTapped", "getMemberText", "getOnlineText", "getResolvingGradientEnd", "getResolvingGradientStart", "getSplashHasRadialGradient", "getSplashOpacity", "getSplashUrl", "getInviteSplash", "getSubtitleColor", "getThumbnailBackgroundColor", "getThumbnailCornerRadius", "getThumbnailText", "getThumbnailUrl", "getTitleColor", "getExtendedType", "()Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;", "getGuildName", "getGuildIcon", "getHeaderIcon", "getBadgeIconUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "copy", "(IIILjava/lang/String;Lcom/discord/chat/bridge/codedlinks/InviteType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;", "equals", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class GuildInviteDisabledEmbedImpl extends CodedLinkEmbed implements GuildDisabledInviteEmbed, GuildInviteExtendedEmbed {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final Integer acceptLabelBackgroundColor;
    private final Integer acceptLabelBorderColor;
    private final Integer acceptLabelColor;
    private final String acceptLabelText;
    private final int backgroundColor;
    private final String badgeIconUrl;
    private final String bodyText;
    private final Integer bodyTextColor;
    private final int borderColor;
    private final Boolean canBeAccepted;
    private final String channelIcon;
    private final String channelName;
    private final Boolean embedCanBeTapped;

    @NotNull
    private final CodedLinkExtendedType extendedType;
    private final String guildIcon;

    @NotNull
    private final String guildName;
    private final int headerColor;
    private final String headerIcon;

    @NotNull
    private final String headerText;

    @NotNull
    private final String helpCenterArticleLabel;

    @NotNull
    private final String helpCenterArticleURL;
    private final String inviteSplash;
    private final String memberText;
    private final String onlineText;
    private final Integer resolvingGradientEnd;
    private final Integer resolvingGradientStart;
    private final Boolean splashHasRadialGradient;
    private final Integer splashOpacity;
    private final String splashUrl;

    @NotNull
    private final String subtitle;
    private final Integer subtitleColor;
    private final Integer thumbnailBackgroundColor;
    private final Integer thumbnailCornerRadius;
    private final String thumbnailText;
    private final String thumbnailUrl;
    private final Integer titleColor;

    @NotNull
    private final String titleText;

    @NotNull
    private final InviteType type;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return GuildInviteDisabledEmbedImpl$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ GuildInviteDisabledEmbedImpl(int i7, int i10, int i11, int i12, int i13, String str, InviteType inviteType, String str2, String str3, String str4, String str5, Integer num, Integer num2, Integer num3, String str6, String str7, Integer num4, Boolean bool, String str8, String str9, Boolean bool2, String str10, String str11, Integer num5, Integer num6, Boolean bool3, Integer num7, String str12, String str13, Integer num8, Integer num9, Integer num10, String str14, String str15, Integer num11, CodedLinkExtendedType codedLinkExtendedType, String str16, String str17, String str18, String str19, SerializationConstructorMarker serializationConstructorMarker) {
        DefaultConstructorMarker defaultConstructorMarker = null;
        if ((511 != (i7 & 511)) || (4 != (i10 & 4))) {
            e1.k(new int[]{i7, i10}, new int[]{511, 4}, GuildInviteDisabledEmbedImpl$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        super(defaultConstructorMarker);
        this.backgroundColor = i11;
        this.borderColor = i12;
        this.headerColor = i13;
        this.headerText = str;
        this.type = inviteType;
        this.titleText = str2;
        this.subtitle = str3;
        this.helpCenterArticleLabel = str4;
        this.helpCenterArticleURL = str5;
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 0) {
            this.acceptLabelBackgroundColor = null;
        } else {
            this.acceptLabelBackgroundColor = num;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) == 0) {
            this.acceptLabelBorderColor = null;
        } else {
            this.acceptLabelBorderColor = num2;
        }
        if ((i7 & RecyclerView.ItemAnimator.FLAG_MOVED) == 0) {
            this.acceptLabelColor = null;
        } else {
            this.acceptLabelColor = num3;
        }
        if ((i7 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) == 0) {
            this.acceptLabelText = null;
        } else {
            this.acceptLabelText = str6;
        }
        if ((i7 & 8192) == 0) {
            this.bodyText = null;
        } else {
            this.bodyText = str7;
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
            this.channelIcon = str8;
        }
        if ((131072 & i7) == 0) {
            this.channelName = null;
        } else {
            this.channelName = str9;
        }
        if ((262144 & i7) == 0) {
            this.embedCanBeTapped = null;
        } else {
            this.embedCanBeTapped = bool2;
        }
        if ((524288 & i7) == 0) {
            this.memberText = null;
        } else {
            this.memberText = str10;
        }
        if ((1048576 & i7) == 0) {
            this.onlineText = null;
        } else {
            this.onlineText = str11;
        }
        if ((2097152 & i7) == 0) {
            this.resolvingGradientEnd = null;
        } else {
            this.resolvingGradientEnd = num5;
        }
        if ((4194304 & i7) == 0) {
            this.resolvingGradientStart = null;
        } else {
            this.resolvingGradientStart = num6;
        }
        if ((8388608 & i7) == 0) {
            this.splashHasRadialGradient = null;
        } else {
            this.splashHasRadialGradient = bool3;
        }
        if ((16777216 & i7) == 0) {
            this.splashOpacity = null;
        } else {
            this.splashOpacity = num7;
        }
        if ((33554432 & i7) == 0) {
            this.splashUrl = null;
        } else {
            this.splashUrl = str12;
        }
        if ((67108864 & i7) == 0) {
            this.inviteSplash = null;
        } else {
            this.inviteSplash = str13;
        }
        if ((134217728 & i7) == 0) {
            this.subtitleColor = null;
        } else {
            this.subtitleColor = num8;
        }
        if ((268435456 & i7) == 0) {
            this.thumbnailBackgroundColor = null;
        } else {
            this.thumbnailBackgroundColor = num9;
        }
        if ((536870912 & i7) == 0) {
            this.thumbnailCornerRadius = null;
        } else {
            this.thumbnailCornerRadius = num10;
        }
        if ((1073741824 & i7) == 0) {
            this.thumbnailText = null;
        } else {
            this.thumbnailText = str14;
        }
        if ((i7 & Integer.MIN_VALUE) == 0) {
            this.thumbnailUrl = null;
        } else {
            this.thumbnailUrl = str15;
        }
        if ((i10 & 1) == 0) {
            this.titleColor = null;
        } else {
            this.titleColor = num11;
        }
        this.extendedType = (i10 & 2) == 0 ? CodedLinkExtendedType.GUILD_INVITE_DISABLED : codedLinkExtendedType;
        this.guildName = str16;
        if ((i10 & 8) == 0) {
            this.guildIcon = null;
        } else {
            this.guildIcon = str17;
        }
        if ((i10 & 16) == 0) {
            this.headerIcon = null;
        } else {
            this.headerIcon = str18;
        }
        if ((i10 & 32) == 0) {
            this.badgeIconUrl = null;
        } else {
            this.badgeIconUrl = str19;
        }
    }

    public static /* synthetic */ GuildInviteDisabledEmbedImpl copy$default(GuildInviteDisabledEmbedImpl guildInviteDisabledEmbedImpl, int i7, int i10, int i11, String str, InviteType inviteType, String str2, String str3, String str4, String str5, Integer num, Integer num2, Integer num3, String str6, String str7, Integer num4, Boolean bool, String str8, String str9, Boolean bool2, String str10, String str11, Integer num5, Integer num6, Boolean bool3, Integer num7, String str12, String str13, Integer num8, Integer num9, Integer num10, String str14, String str15, Integer num11, CodedLinkExtendedType codedLinkExtendedType, String str16, String str17, String str18, String str19, int i12, int i13, Object obj) {
        String str20;
        String str21;
        int i14 = (i12 & 1) != 0 ? guildInviteDisabledEmbedImpl.backgroundColor : i7;
        int i15 = (i12 & 2) != 0 ? guildInviteDisabledEmbedImpl.borderColor : i10;
        int i16 = (i12 & 4) != 0 ? guildInviteDisabledEmbedImpl.headerColor : i11;
        String str22 = (i12 & 8) != 0 ? guildInviteDisabledEmbedImpl.headerText : str;
        InviteType inviteType2 = (i12 & 16) != 0 ? guildInviteDisabledEmbedImpl.type : inviteType;
        String str23 = (i12 & 32) != 0 ? guildInviteDisabledEmbedImpl.titleText : str2;
        String str24 = (i12 & 64) != 0 ? guildInviteDisabledEmbedImpl.subtitle : str3;
        String str25 = (i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? guildInviteDisabledEmbedImpl.helpCenterArticleLabel : str4;
        String str26 = (i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? guildInviteDisabledEmbedImpl.helpCenterArticleURL : str5;
        Integer num12 = (i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? guildInviteDisabledEmbedImpl.acceptLabelBackgroundColor : num;
        Integer num13 = (i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? guildInviteDisabledEmbedImpl.acceptLabelBorderColor : num2;
        Integer num14 = (i12 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? guildInviteDisabledEmbedImpl.acceptLabelColor : num3;
        String str27 = (i12 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? guildInviteDisabledEmbedImpl.acceptLabelText : str6;
        String str28 = (i12 & 8192) != 0 ? guildInviteDisabledEmbedImpl.bodyText : str7;
        int i17 = i14;
        Integer num15 = (i12 & 16384) != 0 ? guildInviteDisabledEmbedImpl.bodyTextColor : num4;
        Boolean bool4 = (i12 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? guildInviteDisabledEmbedImpl.canBeAccepted : bool;
        String str29 = (i12 & 65536) != 0 ? guildInviteDisabledEmbedImpl.channelIcon : str8;
        String str30 = (i12 & 131072) != 0 ? guildInviteDisabledEmbedImpl.channelName : str9;
        Boolean bool5 = (i12 & 262144) != 0 ? guildInviteDisabledEmbedImpl.embedCanBeTapped : bool2;
        String str31 = (i12 & 524288) != 0 ? guildInviteDisabledEmbedImpl.memberText : str10;
        String str32 = (i12 & 1048576) != 0 ? guildInviteDisabledEmbedImpl.onlineText : str11;
        Integer num16 = (i12 & 2097152) != 0 ? guildInviteDisabledEmbedImpl.resolvingGradientEnd : num5;
        Integer num17 = (i12 & 4194304) != 0 ? guildInviteDisabledEmbedImpl.resolvingGradientStart : num6;
        Boolean bool6 = (i12 & 8388608) != 0 ? guildInviteDisabledEmbedImpl.splashHasRadialGradient : bool3;
        Integer num18 = (i12 & PointerEventHelper.X_FLAG_SUPPORTS_HOVER) != 0 ? guildInviteDisabledEmbedImpl.splashOpacity : num7;
        String str33 = (i12 & 33554432) != 0 ? guildInviteDisabledEmbedImpl.splashUrl : str12;
        String str34 = (i12 & 67108864) != 0 ? guildInviteDisabledEmbedImpl.inviteSplash : str13;
        Integer num19 = (i12 & 134217728) != 0 ? guildInviteDisabledEmbedImpl.subtitleColor : num8;
        Integer num20 = (i12 & 268435456) != 0 ? guildInviteDisabledEmbedImpl.thumbnailBackgroundColor : num9;
        Integer num21 = (i12 & 536870912) != 0 ? guildInviteDisabledEmbedImpl.thumbnailCornerRadius : num10;
        String str35 = (i12 & 1073741824) != 0 ? guildInviteDisabledEmbedImpl.thumbnailText : str14;
        String str36 = (i12 & Integer.MIN_VALUE) != 0 ? guildInviteDisabledEmbedImpl.thumbnailUrl : str15;
        Integer num22 = (i13 & 1) != 0 ? guildInviteDisabledEmbedImpl.titleColor : num11;
        CodedLinkExtendedType codedLinkExtendedType2 = (i13 & 2) != 0 ? guildInviteDisabledEmbedImpl.extendedType : codedLinkExtendedType;
        String str37 = (i13 & 4) != 0 ? guildInviteDisabledEmbedImpl.guildName : str16;
        String str38 = (i13 & 8) != 0 ? guildInviteDisabledEmbedImpl.guildIcon : str17;
        String str39 = (i13 & 16) != 0 ? guildInviteDisabledEmbedImpl.headerIcon : str18;
        if ((i13 & 32) != 0) {
            str21 = str39;
            str20 = guildInviteDisabledEmbedImpl.badgeIconUrl;
        } else {
            str20 = str19;
            str21 = str39;
        }
        return guildInviteDisabledEmbedImpl.copy(i17, i15, i16, str22, inviteType2, str23, str24, str25, str26, num12, num13, num14, str27, str28, num15, bool4, str29, str30, bool5, str31, str32, num16, num17, bool6, num18, str33, str34, num19, num20, num21, str35, str36, num22, codedLinkExtendedType2, str37, str38, str21, str20);
    }

    public static final /* synthetic */ void write$Self$chat_release(GuildInviteDisabledEmbedImpl self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.l(0, self.getBackgroundColor(), serialDesc);
        output.l(1, self.getBorderColor(), serialDesc);
        output.l(2, self.getHeaderColor(), serialDesc);
        output.q(serialDesc, 3, self.getHeaderText());
        output.g(serialDesc, 4, InviteType.Serializer.INSTANCE, self.getType());
        output.q(serialDesc, 5, self.getTitleText());
        output.q(serialDesc, 6, self.getSubtitle());
        output.q(serialDesc, 7, self.getHelpCenterArticleLabel());
        output.q(serialDesc, 8, self.getHelpCenterArticleURL());
        if (output.u(serialDesc, 9) || self.getAcceptLabelBackgroundColor() != null) {
            output.r(serialDesc, 9, m0.f17573a, self.getAcceptLabelBackgroundColor());
        }
        if (output.u(serialDesc, 10) || self.getAcceptLabelBorderColor() != null) {
            output.r(serialDesc, 10, m0.f17573a, self.getAcceptLabelBorderColor());
        }
        if (output.u(serialDesc, 11) || self.getAcceptLabelColor() != null) {
            output.r(serialDesc, 11, m0.f17573a, self.getAcceptLabelColor());
        }
        if (output.u(serialDesc, 12) || self.getAcceptLabelText() != null) {
            output.r(serialDesc, 12, s1.f17602a, self.getAcceptLabelText());
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
        if (output.u(serialDesc, 18) || self.getEmbedCanBeTapped() != null) {
            output.r(serialDesc, 18, g.f17537a, self.getEmbedCanBeTapped());
        }
        if (output.u(serialDesc, 19) || self.getMemberText() != null) {
            output.r(serialDesc, 19, s1.f17602a, self.getMemberText());
        }
        if (output.u(serialDesc, 20) || self.getOnlineText() != null) {
            output.r(serialDesc, 20, s1.f17602a, self.getOnlineText());
        }
        if (output.u(serialDesc, 21) || self.getResolvingGradientEnd() != null) {
            output.r(serialDesc, 21, m0.f17573a, self.getResolvingGradientEnd());
        }
        if (output.u(serialDesc, 22) || self.getResolvingGradientStart() != null) {
            output.r(serialDesc, 22, m0.f17573a, self.getResolvingGradientStart());
        }
        if (output.u(serialDesc, 23) || self.getSplashHasRadialGradient() != null) {
            output.r(serialDesc, 23, g.f17537a, self.getSplashHasRadialGradient());
        }
        if (output.u(serialDesc, 24) || self.getSplashOpacity() != null) {
            output.r(serialDesc, 24, m0.f17573a, self.getSplashOpacity());
        }
        if (output.u(serialDesc, 25) || self.getSplashUrl() != null) {
            output.r(serialDesc, 25, s1.f17602a, self.getSplashUrl());
        }
        if (output.u(serialDesc, 26) || self.getInviteSplash() != null) {
            output.r(serialDesc, 26, s1.f17602a, self.getInviteSplash());
        }
        if (output.u(serialDesc, 27) || self.getSubtitleColor() != null) {
            output.r(serialDesc, 27, m0.f17573a, self.getSubtitleColor());
        }
        if (output.u(serialDesc, 28) || self.getThumbnailBackgroundColor() != null) {
            output.r(serialDesc, 28, m0.f17573a, self.getThumbnailBackgroundColor());
        }
        if (output.u(serialDesc, 29) || self.getThumbnailCornerRadius() != null) {
            output.r(serialDesc, 29, m0.f17573a, self.getThumbnailCornerRadius());
        }
        if (output.u(serialDesc, 30) || self.getThumbnailText() != null) {
            output.r(serialDesc, 30, s1.f17602a, self.getThumbnailText());
        }
        if (output.u(serialDesc, 31) || self.getThumbnailUrl() != null) {
            output.r(serialDesc, 31, s1.f17602a, self.getThumbnailUrl());
        }
        if (output.u(serialDesc, 32) || self.getTitleColor() != null) {
            output.r(serialDesc, 32, m0.f17573a, self.getTitleColor());
        }
        if (output.u(serialDesc, 33) || self.getExtendedType() != CodedLinkExtendedType.GUILD_INVITE_DISABLED) {
            output.g(serialDesc, 33, CodedLinkExtendedType.Serializer.INSTANCE, self.getExtendedType());
        }
        output.q(serialDesc, 34, self.getGuildName());
        if (output.u(serialDesc, 35) || self.getGuildIcon() != null) {
            output.r(serialDesc, 35, s1.f17602a, self.getGuildIcon());
        }
        if (output.u(serialDesc, 36) || self.getHeaderIcon() != null) {
            output.r(serialDesc, 36, s1.f17602a, self.getHeaderIcon());
        }
        if (!output.u(serialDesc, 37) && self.getBadgeIconUrl() == null) {
            return;
        }
        output.r(serialDesc, 37, s1.f17602a, self.getBadgeIconUrl());
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Integer getAcceptLabelBackgroundColor() {
        return this.acceptLabelBackgroundColor;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Integer getAcceptLabelBorderColor() {
        return this.acceptLabelBorderColor;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Integer getAcceptLabelColor() {
        return this.acceptLabelColor;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getAcceptLabelText() {
        return this.acceptLabelText;
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
    public final Boolean getEmbedCanBeTapped() {
        return this.embedCanBeTapped;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getBorderColor() {
        return this.borderColor;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getMemberText() {
        return this.memberText;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getOnlineText() {
        return this.onlineText;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final Integer getResolvingGradientEnd() {
        return this.resolvingGradientEnd;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final Integer getResolvingGradientStart() {
        return this.resolvingGradientStart;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final Boolean getSplashHasRadialGradient() {
        return this.splashHasRadialGradient;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final Integer getSplashOpacity() {
        return this.splashOpacity;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getSplashUrl() {
        return this.splashUrl;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final String getInviteSplash() {
        return this.inviteSplash;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final Integer getSubtitleColor() {
        return this.subtitleColor;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final Integer getThumbnailBackgroundColor() {
        return this.thumbnailBackgroundColor;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getHeaderColor() {
        return this.headerColor;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final Integer getThumbnailCornerRadius() {
        return this.thumbnailCornerRadius;
    }

    /* JADX INFO: renamed from: component31, reason: from getter */
    public final String getThumbnailText() {
        return this.thumbnailText;
    }

    /* JADX INFO: renamed from: component32, reason: from getter */
    public final String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    /* JADX INFO: renamed from: component33, reason: from getter */
    public final Integer getTitleColor() {
        return this.titleColor;
    }

    @NotNull
    /* JADX INFO: renamed from: component34, reason: from getter */
    public final CodedLinkExtendedType getExtendedType() {
        return this.extendedType;
    }

    @NotNull
    /* JADX INFO: renamed from: component35, reason: from getter */
    public final String getGuildName() {
        return this.guildName;
    }

    /* JADX INFO: renamed from: component36, reason: from getter */
    public final String getGuildIcon() {
        return this.guildIcon;
    }

    /* JADX INFO: renamed from: component37, reason: from getter */
    public final String getHeaderIcon() {
        return this.headerIcon;
    }

    /* JADX INFO: renamed from: component38, reason: from getter */
    public final String getBadgeIconUrl() {
        return this.badgeIconUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getHeaderText() {
        return this.headerText;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final InviteType getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTitleText() {
        return this.titleText;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getHelpCenterArticleLabel() {
        return this.helpCenterArticleLabel;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getHelpCenterArticleURL() {
        return this.helpCenterArticleURL;
    }

    @NotNull
    public final GuildInviteDisabledEmbedImpl copy(int backgroundColor, int borderColor, int headerColor, @NotNull String headerText, @NotNull InviteType type, @NotNull String titleText, @NotNull String subtitle, @NotNull String helpCenterArticleLabel, @NotNull String helpCenterArticleURL, Integer acceptLabelBackgroundColor, Integer acceptLabelBorderColor, Integer acceptLabelColor, String acceptLabelText, String bodyText, Integer bodyTextColor, Boolean canBeAccepted, String channelIcon, String channelName, Boolean embedCanBeTapped, String memberText, String onlineText, Integer resolvingGradientEnd, Integer resolvingGradientStart, Boolean splashHasRadialGradient, Integer splashOpacity, String splashUrl, String inviteSplash, Integer subtitleColor, Integer thumbnailBackgroundColor, Integer thumbnailCornerRadius, String thumbnailText, String thumbnailUrl, Integer titleColor, @NotNull CodedLinkExtendedType extendedType, @NotNull String guildName, String guildIcon, String headerIcon, String badgeIconUrl) {
        Intrinsics.checkNotNullParameter(headerText, "headerText");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(helpCenterArticleLabel, "helpCenterArticleLabel");
        Intrinsics.checkNotNullParameter(helpCenterArticleURL, "helpCenterArticleURL");
        Intrinsics.checkNotNullParameter(extendedType, "extendedType");
        Intrinsics.checkNotNullParameter(guildName, "guildName");
        return new GuildInviteDisabledEmbedImpl(backgroundColor, borderColor, headerColor, headerText, type, titleText, subtitle, helpCenterArticleLabel, helpCenterArticleURL, acceptLabelBackgroundColor, acceptLabelBorderColor, acceptLabelColor, acceptLabelText, bodyText, bodyTextColor, canBeAccepted, channelIcon, channelName, embedCanBeTapped, memberText, onlineText, resolvingGradientEnd, resolvingGradientStart, splashHasRadialGradient, splashOpacity, splashUrl, inviteSplash, subtitleColor, thumbnailBackgroundColor, thumbnailCornerRadius, thumbnailText, thumbnailUrl, titleColor, extendedType, guildName, guildIcon, headerIcon, badgeIconUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GuildInviteDisabledEmbedImpl)) {
            return false;
        }
        GuildInviteDisabledEmbedImpl guildInviteDisabledEmbedImpl = (GuildInviteDisabledEmbedImpl) other;
        return this.backgroundColor == guildInviteDisabledEmbedImpl.backgroundColor && this.borderColor == guildInviteDisabledEmbedImpl.borderColor && this.headerColor == guildInviteDisabledEmbedImpl.headerColor && Intrinsics.areEqual(this.headerText, guildInviteDisabledEmbedImpl.headerText) && this.type == guildInviteDisabledEmbedImpl.type && Intrinsics.areEqual(this.titleText, guildInviteDisabledEmbedImpl.titleText) && Intrinsics.areEqual(this.subtitle, guildInviteDisabledEmbedImpl.subtitle) && Intrinsics.areEqual(this.helpCenterArticleLabel, guildInviteDisabledEmbedImpl.helpCenterArticleLabel) && Intrinsics.areEqual(this.helpCenterArticleURL, guildInviteDisabledEmbedImpl.helpCenterArticleURL) && Intrinsics.areEqual(this.acceptLabelBackgroundColor, guildInviteDisabledEmbedImpl.acceptLabelBackgroundColor) && Intrinsics.areEqual(this.acceptLabelBorderColor, guildInviteDisabledEmbedImpl.acceptLabelBorderColor) && Intrinsics.areEqual(this.acceptLabelColor, guildInviteDisabledEmbedImpl.acceptLabelColor) && Intrinsics.areEqual(this.acceptLabelText, guildInviteDisabledEmbedImpl.acceptLabelText) && Intrinsics.areEqual(this.bodyText, guildInviteDisabledEmbedImpl.bodyText) && Intrinsics.areEqual(this.bodyTextColor, guildInviteDisabledEmbedImpl.bodyTextColor) && Intrinsics.areEqual(this.canBeAccepted, guildInviteDisabledEmbedImpl.canBeAccepted) && Intrinsics.areEqual(this.channelIcon, guildInviteDisabledEmbedImpl.channelIcon) && Intrinsics.areEqual(this.channelName, guildInviteDisabledEmbedImpl.channelName) && Intrinsics.areEqual(this.embedCanBeTapped, guildInviteDisabledEmbedImpl.embedCanBeTapped) && Intrinsics.areEqual(this.memberText, guildInviteDisabledEmbedImpl.memberText) && Intrinsics.areEqual(this.onlineText, guildInviteDisabledEmbedImpl.onlineText) && Intrinsics.areEqual(this.resolvingGradientEnd, guildInviteDisabledEmbedImpl.resolvingGradientEnd) && Intrinsics.areEqual(this.resolvingGradientStart, guildInviteDisabledEmbedImpl.resolvingGradientStart) && Intrinsics.areEqual(this.splashHasRadialGradient, guildInviteDisabledEmbedImpl.splashHasRadialGradient) && Intrinsics.areEqual(this.splashOpacity, guildInviteDisabledEmbedImpl.splashOpacity) && Intrinsics.areEqual(this.splashUrl, guildInviteDisabledEmbedImpl.splashUrl) && Intrinsics.areEqual(this.inviteSplash, guildInviteDisabledEmbedImpl.inviteSplash) && Intrinsics.areEqual(this.subtitleColor, guildInviteDisabledEmbedImpl.subtitleColor) && Intrinsics.areEqual(this.thumbnailBackgroundColor, guildInviteDisabledEmbedImpl.thumbnailBackgroundColor) && Intrinsics.areEqual(this.thumbnailCornerRadius, guildInviteDisabledEmbedImpl.thumbnailCornerRadius) && Intrinsics.areEqual(this.thumbnailText, guildInviteDisabledEmbedImpl.thumbnailText) && Intrinsics.areEqual(this.thumbnailUrl, guildInviteDisabledEmbedImpl.thumbnailUrl) && Intrinsics.areEqual(this.titleColor, guildInviteDisabledEmbedImpl.titleColor) && this.extendedType == guildInviteDisabledEmbedImpl.extendedType && Intrinsics.areEqual(this.guildName, guildInviteDisabledEmbedImpl.guildName) && Intrinsics.areEqual(this.guildIcon, guildInviteDisabledEmbedImpl.guildIcon) && Intrinsics.areEqual(this.headerIcon, guildInviteDisabledEmbedImpl.headerIcon) && Intrinsics.areEqual(this.badgeIconUrl, guildInviteDisabledEmbedImpl.badgeIconUrl);
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
    @NotNull
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

    @Override // com.discord.chat.bridge.codedlinks.GuildDisabledInviteEmbed
    @NotNull
    public String getHelpCenterArticleLabel() {
        return this.helpCenterArticleLabel;
    }

    @Override // com.discord.chat.bridge.codedlinks.GuildDisabledInviteEmbed
    @NotNull
    public String getHelpCenterArticleURL() {
        return this.helpCenterArticleURL;
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
    @NotNull
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
    @NotNull
    public String getTitleText() {
        return this.titleText;
    }

    @Override // com.discord.chat.bridge.codedlinks.CodedLinkEmbed
    @NotNull
    public InviteType getType() {
        return this.type;
    }

    public int hashCode() {
        int iD = e.d(e.d(e.d(e.d((this.type.hashCode() + e.d(a.u(this.headerColor, a.u(this.borderColor, Integer.hashCode(this.backgroundColor) * 31, 31), 31), 31, this.headerText)) * 31, 31, this.titleText), 31, this.subtitle), 31, this.helpCenterArticleLabel), 31, this.helpCenterArticleURL);
        Integer num = this.acceptLabelBackgroundColor;
        int iHashCode = (iD + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.acceptLabelBorderColor;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.acceptLabelColor;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str = this.acceptLabelText;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.bodyText;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num4 = this.bodyTextColor;
        int iHashCode6 = (iHashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Boolean bool = this.canBeAccepted;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.channelIcon;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.channelName;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool2 = this.embedCanBeTapped;
        int iHashCode10 = (iHashCode9 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str5 = this.memberText;
        int iHashCode11 = (iHashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.onlineText;
        int iHashCode12 = (iHashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num5 = this.resolvingGradientEnd;
        int iHashCode13 = (iHashCode12 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.resolvingGradientStart;
        int iHashCode14 = (iHashCode13 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Boolean bool3 = this.splashHasRadialGradient;
        int iHashCode15 = (iHashCode14 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Integer num7 = this.splashOpacity;
        int iHashCode16 = (iHashCode15 + (num7 == null ? 0 : num7.hashCode())) * 31;
        String str7 = this.splashUrl;
        int iHashCode17 = (iHashCode16 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.inviteSplash;
        int iHashCode18 = (iHashCode17 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num8 = this.subtitleColor;
        int iHashCode19 = (iHashCode18 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.thumbnailBackgroundColor;
        int iHashCode20 = (iHashCode19 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.thumbnailCornerRadius;
        int iHashCode21 = (iHashCode20 + (num10 == null ? 0 : num10.hashCode())) * 31;
        String str9 = this.thumbnailText;
        int iHashCode22 = (iHashCode21 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.thumbnailUrl;
        int iHashCode23 = (iHashCode22 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Integer num11 = this.titleColor;
        int iD2 = e.d((this.extendedType.hashCode() + ((iHashCode23 + (num11 == null ? 0 : num11.hashCode())) * 31)) * 31, 31, this.guildName);
        String str11 = this.guildIcon;
        int iHashCode24 = (iD2 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.headerIcon;
        int iHashCode25 = (iHashCode24 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.badgeIconUrl;
        return iHashCode25 + (str13 != null ? str13.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i7 = this.backgroundColor;
        int i10 = this.borderColor;
        int i11 = this.headerColor;
        String str = this.headerText;
        InviteType inviteType = this.type;
        String str2 = this.titleText;
        String str3 = this.subtitle;
        String str4 = this.helpCenterArticleLabel;
        String str5 = this.helpCenterArticleURL;
        Integer num = this.acceptLabelBackgroundColor;
        Integer num2 = this.acceptLabelBorderColor;
        Integer num3 = this.acceptLabelColor;
        String str6 = this.acceptLabelText;
        String str7 = this.bodyText;
        Integer num4 = this.bodyTextColor;
        Boolean bool = this.canBeAccepted;
        String str8 = this.channelIcon;
        String str9 = this.channelName;
        Boolean bool2 = this.embedCanBeTapped;
        String str10 = this.memberText;
        String str11 = this.onlineText;
        Integer num5 = this.resolvingGradientEnd;
        Integer num6 = this.resolvingGradientStart;
        Boolean bool3 = this.splashHasRadialGradient;
        Integer num7 = this.splashOpacity;
        String str12 = this.splashUrl;
        String str13 = this.inviteSplash;
        Integer num8 = this.subtitleColor;
        Integer num9 = this.thumbnailBackgroundColor;
        Integer num10 = this.thumbnailCornerRadius;
        String str14 = this.thumbnailText;
        String str15 = this.thumbnailUrl;
        Integer num11 = this.titleColor;
        CodedLinkExtendedType codedLinkExtendedType = this.extendedType;
        String str16 = this.guildName;
        String str17 = this.guildIcon;
        String str18 = this.headerIcon;
        String str19 = this.badgeIconUrl;
        StringBuilder sbR = e.r(i7, "GuildInviteDisabledEmbedImpl(backgroundColor=", i10, ", borderColor=", ", headerColor=");
        sbR.append(i11);
        sbR.append(", headerText=");
        sbR.append(str);
        sbR.append(", type=");
        sbR.append(inviteType);
        sbR.append(", titleText=");
        sbR.append(str2);
        sbR.append(", subtitle=");
        e.A(sbR, str3, ", helpCenterArticleLabel=", str4, ", helpCenterArticleURL=");
        a.r(num, str5, ", acceptLabelBackgroundColor=", ", acceptLabelBorderColor=", sbR);
        b.s(sbR, num2, ", acceptLabelColor=", num3, ", acceptLabelText=");
        e.A(sbR, str6, ", bodyText=", str7, ", bodyTextColor=");
        sbR.append(num4);
        sbR.append(", canBeAccepted=");
        sbR.append(bool);
        sbR.append(", channelIcon=");
        e.A(sbR, str8, ", channelName=", str9, ", embedCanBeTapped=");
        sbR.append(bool2);
        sbR.append(", memberText=");
        sbR.append(str10);
        sbR.append(", onlineText=");
        a.r(num5, str11, ", resolvingGradientEnd=", ", resolvingGradientStart=", sbR);
        sbR.append(num6);
        sbR.append(", splashHasRadialGradient=");
        sbR.append(bool3);
        sbR.append(", splashOpacity=");
        b.r(num7, ", splashUrl=", str12, ", inviteSplash=", sbR);
        a.r(num8, str13, ", subtitleColor=", ", thumbnailBackgroundColor=", sbR);
        b.s(sbR, num9, ", thumbnailCornerRadius=", num10, ", thumbnailText=");
        e.A(sbR, str14, ", thumbnailUrl=", str15, ", titleColor=");
        sbR.append(num11);
        sbR.append(", extendedType=");
        sbR.append(codedLinkExtendedType);
        sbR.append(", guildName=");
        e.A(sbR, str16, ", guildIcon=", str17, ", headerIcon=");
        return a.l(sbR, str18, ", badgeIconUrl=", str19, ")");
    }

    public /* synthetic */ GuildInviteDisabledEmbedImpl(int i7, int i10, int i11, String str, InviteType inviteType, String str2, String str3, String str4, String str5, Integer num, Integer num2, Integer num3, String str6, String str7, Integer num4, Boolean bool, String str8, String str9, Boolean bool2, String str10, String str11, Integer num5, Integer num6, Boolean bool3, Integer num7, String str12, String str13, Integer num8, Integer num9, Integer num10, String str14, String str15, Integer num11, CodedLinkExtendedType codedLinkExtendedType, String str16, String str17, String str18, String str19, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(i7, i10, i11, str, inviteType, str2, str3, str4, str5, (i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? null : num, (i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? null : num2, (i12 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? null : num3, (i12 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : str6, (i12 & 8192) != 0 ? null : str7, (i12 & 16384) != 0 ? null : num4, (32768 & i12) != 0 ? null : bool, (65536 & i12) != 0 ? null : str8, (131072 & i12) != 0 ? null : str9, (262144 & i12) != 0 ? null : bool2, (524288 & i12) != 0 ? null : str10, (1048576 & i12) != 0 ? null : str11, (2097152 & i12) != 0 ? null : num5, (4194304 & i12) != 0 ? null : num6, (8388608 & i12) != 0 ? null : bool3, (16777216 & i12) != 0 ? null : num7, (33554432 & i12) != 0 ? null : str12, (67108864 & i12) != 0 ? null : str13, (134217728 & i12) != 0 ? null : num8, (268435456 & i12) != 0 ? null : num9, (536870912 & i12) != 0 ? null : num10, (1073741824 & i12) != 0 ? null : str14, (i12 & Integer.MIN_VALUE) != 0 ? null : str15, (i13 & 1) != 0 ? null : num11, (i13 & 2) != 0 ? CodedLinkExtendedType.GUILD_INVITE_DISABLED : codedLinkExtendedType, str16, (i13 & 8) != 0 ? null : str17, (i13 & 16) != 0 ? null : str18, (i13 & 32) != 0 ? null : str19);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GuildInviteDisabledEmbedImpl(int i7, int i10, int i11, @NotNull String headerText, @NotNull InviteType type, @NotNull String titleText, @NotNull String subtitle, @NotNull String helpCenterArticleLabel, @NotNull String helpCenterArticleURL, Integer num, Integer num2, Integer num3, String str, String str2, Integer num4, Boolean bool, String str3, String str4, Boolean bool2, String str5, String str6, Integer num5, Integer num6, Boolean bool3, Integer num7, String str7, String str8, Integer num8, Integer num9, Integer num10, String str9, String str10, Integer num11, @NotNull CodedLinkExtendedType extendedType, @NotNull String guildName, String str11, String str12, String str13) {
        super(null);
        Intrinsics.checkNotNullParameter(headerText, "headerText");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(helpCenterArticleLabel, "helpCenterArticleLabel");
        Intrinsics.checkNotNullParameter(helpCenterArticleURL, "helpCenterArticleURL");
        Intrinsics.checkNotNullParameter(extendedType, "extendedType");
        Intrinsics.checkNotNullParameter(guildName, "guildName");
        this.backgroundColor = i7;
        this.borderColor = i10;
        this.headerColor = i11;
        this.headerText = headerText;
        this.type = type;
        this.titleText = titleText;
        this.subtitle = subtitle;
        this.helpCenterArticleLabel = helpCenterArticleLabel;
        this.helpCenterArticleURL = helpCenterArticleURL;
        this.acceptLabelBackgroundColor = num;
        this.acceptLabelBorderColor = num2;
        this.acceptLabelColor = num3;
        this.acceptLabelText = str;
        this.bodyText = str2;
        this.bodyTextColor = num4;
        this.canBeAccepted = bool;
        this.channelIcon = str3;
        this.channelName = str4;
        this.embedCanBeTapped = bool2;
        this.memberText = str5;
        this.onlineText = str6;
        this.resolvingGradientEnd = num5;
        this.resolvingGradientStart = num6;
        this.splashHasRadialGradient = bool3;
        this.splashOpacity = num7;
        this.splashUrl = str7;
        this.inviteSplash = str8;
        this.subtitleColor = num8;
        this.thumbnailBackgroundColor = num9;
        this.thumbnailCornerRadius = num10;
        this.thumbnailText = str9;
        this.thumbnailUrl = str10;
        this.titleColor = num11;
        this.extendedType = extendedType;
        this.guildName = guildName;
        this.guildIcon = str11;
        this.headerIcon = str12;
        this.badgeIconUrl = str13;
    }
}
