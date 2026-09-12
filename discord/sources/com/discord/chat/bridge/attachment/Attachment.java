package com.discord.chat.bridge.attachment;

import a3.e;
import android.net.UrlQuerySanitizer;
import android.util.Base64;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.bridge.attachment.Attachment;
import com.discord.chat.bridge.spoiler.SpoilerableData;
import com.discord.media_player.HttpEngine;
import com.discord.media_player.MediaPlayer;
import com.discord.react_asset_fetcher.ReactAsset;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import ib.a;
import kk.b;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kr.f;
import or.e0;
import or.e1;
import or.g;
import or.i;
import or.m0;
import or.s1;
import org.jetbrains.annotations.NotNull;
import org.webrtc.MediaStreamTrack;
import rn.l;
import rn.q;
import rn.r;

/* JADX INFO: loaded from: classes.dex */
@f
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b3\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 ¼\u00012\u00020\u0001:\u0004»\u0001¼\u0001Bé\u0003\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u0018\u001a\u00020\f\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010'\u001a\u00020\f\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b0\u00101Bñ\u0003\b\u0010\u0012\u0006\u00102\u001a\u00020\t\u0012\u0006\u00103\u001a\u00020\t\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0018\u001a\u00020\f\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010 \u001a\u0004\u0018\u00010\f\u0012\b\u0010!\u001a\u0004\u0018\u00010\f\u0012\b\u0010\"\u001a\u0004\u0018\u00010\f\u0012\b\u0010#\u001a\u0004\u0018\u00010\f\u0012\b\u0010$\u001a\u0004\u0018\u00010%\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010'\u001a\u00020\f\u0012\b\u0010(\u001a\u0004\u0018\u00010\t\u0012\b\u0010)\u001a\u0004\u0018\u00010\t\u0012\b\u0010*\u001a\u0004\u0018\u00010\t\u0012\b\u0010+\u001a\u0004\u0018\u00010\t\u0012\b\u0010,\u001a\u0004\u0018\u00010\f\u0012\b\u0010-\u001a\u0004\u0018\u00010\f\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010/\u001a\u0004\u0018\u00010\f\u0012\b\u00104\u001a\u0004\u0018\u000105\u0012\b\u00106\u001a\u0004\u0018\u00010\u0003\u0012\b\u00107\u001a\u0004\u0018\u00010\u0003\u0012\b\u00108\u001a\u0004\u0018\u00010\t\u0012\b\u00109\u001a\u0004\u0018\u00010\t\u0012\b\u0010:\u001a\u0004\u0018\u00010;¢\u0006\u0004\b0\u0010<J\u0006\u0010y\u001a\u00020zJ\b\u0010{\u001a\u0004\u0018\u00010|J\b\u0010}\u001a\u00020\fH\u0002J\u0018\u0010~\u001a\u0004\u0018\u00010\t2\u0006\u0010\u007f\u001a\u00020\u0003H\u0002¢\u0006\u0003\u0010\u0080\u0001J\t\u0010\u0081\u0001\u001a\u00020\fH\u0002J\f\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010\u0083\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010\u0085\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0086\u0001\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0087\u0001\u001a\u0004\u0018\u00010\tHÂ\u0003¢\u0006\u0002\u0010NJ\u0011\u0010\u0088\u0001\u001a\u0004\u0018\u00010\tHÂ\u0003¢\u0006\u0002\u0010NJ\n\u0010\u0089\u0001\u001a\u00020\fHÆ\u0003J\f\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010\u008e\u0001\u001a\u00020\fHÆ\u0003J\u0011\u0010\u008f\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010NJ\f\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0093\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010NJ\u0011\u0010\u0094\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010NJ\n\u0010\u0095\u0001\u001a\u00020\fHÆ\u0003J\f\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0097\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010NJ\u0011\u0010\u0098\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010NJ\f\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\f\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u0011\u0010\u009b\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010XJ\f\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u009d\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010XJ\u0011\u0010\u009e\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010XJ\u0011\u0010\u009f\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010XJ\u0011\u0010 \u0001\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010XJ\u0011\u0010¡\u0001\u001a\u0004\u0018\u00010%HÆ\u0003¢\u0006\u0002\u0010`J\f\u0010¢\u0001\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\n\u0010£\u0001\u001a\u00020\fHÆ\u0003J\u0011\u0010¤\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010NJ\u0011\u0010¥\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010NJ\u0011\u0010¦\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010NJ\u0011\u0010§\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010NJ\u0011\u0010¨\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010XJ\u0011\u0010©\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010XJ\f\u0010ª\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010«\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010XJú\u0003\u0010¬\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0011\u001a\u00020\f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0018\u001a\u00020\f2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010'\u001a\u00020\f2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0003\u0010\u00ad\u0001J\u0016\u0010®\u0001\u001a\u00020\f2\n\u0010¯\u0001\u001a\u0005\u0018\u00010°\u0001HÖ\u0003J\n\u0010±\u0001\u001a\u00020\tHÖ\u0001J\n\u0010²\u0001\u001a\u00020\u0003HÖ\u0001J-\u0010³\u0001\u001a\u00030´\u00012\u0007\u0010µ\u0001\u001a\u00020\u00002\b\u0010¶\u0001\u001a\u00030·\u00012\b\u0010¸\u0001\u001a\u00030¹\u0001H\u0001¢\u0006\u0003\bº\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b?\u0010>R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b@\u0010>R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bA\u0010>R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bB\u0010>R\u001a\u0010\b\u001a\u0004\u0018\u00010\t8\u0002X\u0083\u0004¢\u0006\n\n\u0002\u0010E\u0012\u0004\bC\u0010DR\u001a\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0083\u0004¢\u0006\n\n\u0002\u0010E\u0012\u0004\bF\u0010DR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010GR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bH\u0010>R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bI\u0010>R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010>R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bK\u0010>R\u0011\u0010\u0011\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\bL\u0010GR\u0015\u0010\u0012\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010E\u001a\u0004\bM\u0010NR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bO\u0010>R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bP\u0010>R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010>R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010E\u001a\u0004\bR\u0010NR\u0015\u0010\u0017\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010E\u001a\u0004\bS\u0010NR\u0011\u0010\u0018\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010GR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bT\u0010>R\u0015\u0010\u001a\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010E\u001a\u0004\bU\u0010NR\u0015\u0010\u001b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010E\u001a\u0004\bV\u0010NR\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0015\u0010\u001e\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010Y\u001a\u0004\bW\u0010XR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010>R\u0015\u0010 \u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010Y\u001a\u0004\b[\u0010XR\u0015\u0010!\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010Y\u001a\u0004\b\\\u0010XR\u0015\u0010\"\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010Y\u001a\u0004\b]\u0010XR\u0015\u0010#\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010Y\u001a\u0004\b^\u0010XR\u0015\u0010$\u001a\u0004\u0018\u00010%¢\u0006\n\n\u0002\u0010a\u001a\u0004\b_\u0010`R\u0010\u0010&\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010'\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b'\u0010GR\u0015\u0010(\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010E\u001a\u0004\bb\u0010NR\u0015\u0010)\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010E\u001a\u0004\bc\u0010NR\u0015\u0010*\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010E\u001a\u0004\bd\u0010NR\u0015\u0010+\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010E\u001a\u0004\be\u0010NR\u0015\u0010,\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010Y\u001a\u0004\bf\u0010XR\u0015\u0010-\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010Y\u001a\u0004\bg\u0010XR\u0013\u0010.\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bh\u0010>R\u0015\u0010/\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010Y\u001a\u0004\bi\u0010XR\u001b\u0010j\u001a\u00020k8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bn\u0010o\u001a\u0004\bl\u0010mR\u0013\u00104\u001a\u0004\u0018\u000105¢\u0006\b\n\u0000\u001a\u0004\bp\u0010qR\u0016\u00106\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\br\u0010>R\u0016\u00107\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bs\u0010>R\u0012\u00108\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010ER\u0012\u00109\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010ER\u0011\u0010t\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bu\u0010vR\u0011\u0010w\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bx\u0010v¨\u0006½\u0001"}, d2 = {"Lcom/discord/chat/bridge/attachment/Attachment;", "Lcom/discord/chat/bridge/spoiler/SpoilerableData;", StackTraceHelper.ID_KEY, "", "url", "videoUrl", "filename", "size", "sourceWidth", "", "sourceHeight", "isSpoiler", "", "spoiler", "description", "hint", ViewProps.ROLE, "showDescription", ReactProgressBarViewManager.PROP_PROGRESS, "uploaderId", "uploaderItemId", "placeholder", "placeholderVersion", ViewProps.BACKGROUND_COLOR, "isSuspiciousDownload", "attachmentTagText", "attachmentTagBackgroundColor", "attachmentTagTextColor", "attachmentTagIconType", "attachmentType", "obscure", "obscureDescription", "obscureAwaitingScan", "obscureHideControls", "obscureIsOpaque", "verifyAge", "durationSecs", "", "waveform", "isAnimated", "mediaViewerBufferForPlaybackMs", "mediaViewerBufferForPlaybackAfterRebufferMs", "mediaViewerMinBufferMs", "mediaViewerMaxBufferMs", "mediaViewerEnableDecoderFallback", "mediaViewerEnableAsyncBufferQueueing", "mediaViewerHttpEngine", "srcIsAnimated", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Float;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;)V", "seen0", "seen1", "waveformByteArray", "", "spoilerOrNull", "obscureOrNull", "proxyWidth", "proxyHeight", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Float;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;[BLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getId", "()Ljava/lang/String;", "getUrl", "getVideoUrl", "getFilename", "getSize", "getSourceWidth$annotations", "()V", "Ljava/lang/Integer;", "getSourceHeight$annotations", "()Z", "getSpoiler", "getDescription", "getHint", "getRole", "getShowDescription", "getProgress", "()Ljava/lang/Integer;", "getUploaderId", "getUploaderItemId", "getPlaceholder", "getPlaceholderVersion", "getBackgroundColor", "getAttachmentTagText", "getAttachmentTagBackgroundColor", "getAttachmentTagTextColor", "getObscure", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getObscureDescription", "getObscureAwaitingScan", "getObscureHideControls", "getObscureIsOpaque", "getVerifyAge", "getDurationSecs", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getMediaViewerBufferForPlaybackMs", "getMediaViewerBufferForPlaybackAfterRebufferMs", "getMediaViewerMinBufferMs", "getMediaViewerMaxBufferMs", "getMediaViewerEnableDecoderFallback", "getMediaViewerEnableAsyncBufferQueueing", "getMediaViewerHttpEngine", "getSrcIsAnimated", "playerSettings", "Lcom/discord/media_player/MediaPlayer$PlayerSettings;", "getPlayerSettings", "()Lcom/discord/media_player/MediaPlayer$PlayerSettings;", "playerSettings$delegate", "Lkotlin/Lazy;", "getWaveformByteArray", "()[B", "getSpoilerOrNull", "getObscureOrNull", "width", "getWidth", "()I", "height", "getHeight", "type", "Lcom/discord/chat/bridge/attachment/AttachmentType;", "getAttachmentTagIcon", "Lcom/discord/react_asset_fetcher/ReactAsset;", "shouldShowImages", "getProxyUrlQueryParam", "paramName", "(Ljava/lang/String;)Ljava/lang/Integer;", "hasDimensions", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "component41", "component42", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Float;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/discord/chat/bridge/attachment/Attachment;", "equals", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAttachment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Attachment.kt\ncom/discord/chat/bridge/attachment/Attachment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,133:1\n1#2:134\n*E\n"})
public final /* data */ class Attachment implements SpoilerableData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final Integer attachmentTagBackgroundColor;
    private final String attachmentTagIconType;
    private final String attachmentTagText;
    private final Integer attachmentTagTextColor;
    private final String attachmentType;
    private final Integer backgroundColor;
    private final String description;
    private final Float durationSecs;

    @NotNull
    private final String filename;
    private final String hint;
    private final String id;
    private final boolean isAnimated;
    private final boolean isSpoiler;
    private final boolean isSuspiciousDownload;
    private final Integer mediaViewerBufferForPlaybackAfterRebufferMs;
    private final Integer mediaViewerBufferForPlaybackMs;
    private final Boolean mediaViewerEnableAsyncBufferQueueing;
    private final Boolean mediaViewerEnableDecoderFallback;
    private final String mediaViewerHttpEngine;
    private final Integer mediaViewerMaxBufferMs;
    private final Integer mediaViewerMinBufferMs;
    private final Boolean obscure;
    private final Boolean obscureAwaitingScan;
    private final String obscureDescription;
    private final Boolean obscureHideControls;
    private final Boolean obscureIsOpaque;
    private final String obscureOrNull;
    private final String placeholder;
    private final Integer placeholderVersion;

    /* JADX INFO: renamed from: playerSettings$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy playerSettings;
    private final Integer progress;
    private final Integer proxyHeight;
    private final Integer proxyWidth;
    private final String role;
    private final boolean showDescription;

    @NotNull
    private final String size;
    private final Integer sourceHeight;
    private final Integer sourceWidth;
    private final String spoiler;
    private final String spoilerOrNull;
    private final Boolean srcIsAnimated;
    private final String uploaderId;
    private final String uploaderItemId;

    @NotNull
    private final String url;
    private final Boolean verifyAge;
    private final String videoUrl;
    private final String waveform;
    private final byte[] waveformByteArray;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/attachment/Attachment$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/attachment/Attachment;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return Attachment$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ Attachment(int i7, int i10, String str, String str2, String str3, String str4, String str5, Integer num, Integer num2, boolean z5, String str6, String str7, String str8, String str9, boolean z6, Integer num3, String str10, String str11, String str12, Integer num4, Integer num5, boolean z7, String str13, Integer num6, Integer num7, String str14, String str15, Boolean bool, String str16, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Float f2, String str17, boolean z10, Integer num8, Integer num9, Integer num10, Integer num11, Boolean bool6, Boolean bool7, String str18, Boolean bool8, byte[] bArr, String str19, String str20, Integer num12, Integer num13, SerializationConstructorMarker serializationConstructorMarker) {
        byte[] bArrDecode;
        String str21;
        String str22 = null;
        if (154 != (i7 & 154)) {
            e1.k(new int[]{i7, i10}, new int[]{154, 0}, Attachment$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i7 & 1) == 0) {
            this.id = null;
        } else {
            this.id = str;
        }
        this.url = str2;
        if ((i7 & 4) == 0) {
            this.videoUrl = null;
        } else {
            this.videoUrl = str3;
        }
        this.filename = str4;
        this.size = str5;
        if ((i7 & 32) == 0) {
            this.sourceWidth = null;
        } else {
            this.sourceWidth = num;
        }
        if ((i7 & 64) == 0) {
            this.sourceHeight = null;
        } else {
            this.sourceHeight = num2;
        }
        this.isSpoiler = z5;
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 0) {
            this.spoiler = null;
        } else {
            this.spoiler = str6;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 0) {
            this.description = null;
        } else {
            this.description = str7;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) == 0) {
            this.hint = null;
        } else {
            this.hint = str8;
        }
        if ((i7 & RecyclerView.ItemAnimator.FLAG_MOVED) == 0) {
            this.role = null;
        } else {
            this.role = str9;
        }
        if ((i7 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) == 0) {
            this.showDescription = false;
        } else {
            this.showDescription = z6;
        }
        if ((i7 & 8192) == 0) {
            this.progress = null;
        } else {
            this.progress = num3;
        }
        if ((i7 & 16384) == 0) {
            this.uploaderId = null;
        } else {
            this.uploaderId = str10;
        }
        if ((32768 & i7) == 0) {
            this.uploaderItemId = null;
        } else {
            this.uploaderItemId = str11;
        }
        if ((65536 & i7) == 0) {
            this.placeholder = null;
        } else {
            this.placeholder = str12;
        }
        if ((131072 & i7) == 0) {
            this.placeholderVersion = null;
        } else {
            this.placeholderVersion = num4;
        }
        if ((262144 & i7) == 0) {
            this.backgroundColor = null;
        } else {
            this.backgroundColor = num5;
        }
        if ((524288 & i7) == 0) {
            this.isSuspiciousDownload = false;
        } else {
            this.isSuspiciousDownload = z7;
        }
        if ((1048576 & i7) == 0) {
            this.attachmentTagText = null;
        } else {
            this.attachmentTagText = str13;
        }
        if ((2097152 & i7) == 0) {
            this.attachmentTagBackgroundColor = null;
        } else {
            this.attachmentTagBackgroundColor = num6;
        }
        if ((4194304 & i7) == 0) {
            this.attachmentTagTextColor = null;
        } else {
            this.attachmentTagTextColor = num7;
        }
        if ((8388608 & i7) == 0) {
            this.attachmentTagIconType = null;
        } else {
            this.attachmentTagIconType = str14;
        }
        if ((16777216 & i7) == 0) {
            this.attachmentType = null;
        } else {
            this.attachmentType = str15;
        }
        if ((33554432 & i7) == 0) {
            this.obscure = null;
        } else {
            this.obscure = bool;
        }
        if ((67108864 & i7) == 0) {
            this.obscureDescription = null;
        } else {
            this.obscureDescription = str16;
        }
        if ((134217728 & i7) == 0) {
            this.obscureAwaitingScan = null;
        } else {
            this.obscureAwaitingScan = bool2;
        }
        if ((268435456 & i7) == 0) {
            this.obscureHideControls = null;
        } else {
            this.obscureHideControls = bool3;
        }
        if ((536870912 & i7) == 0) {
            this.obscureIsOpaque = null;
        } else {
            this.obscureIsOpaque = bool4;
        }
        if ((1073741824 & i7) == 0) {
            this.verifyAge = null;
        } else {
            this.verifyAge = bool5;
        }
        if ((i7 & Integer.MIN_VALUE) == 0) {
            this.durationSecs = null;
        } else {
            this.durationSecs = f2;
        }
        if ((i10 & 1) == 0) {
            this.waveform = null;
        } else {
            this.waveform = str17;
        }
        this.isAnimated = (i10 & 2) == 0 ? true : z10;
        if ((i10 & 4) == 0) {
            this.mediaViewerBufferForPlaybackMs = null;
        } else {
            this.mediaViewerBufferForPlaybackMs = num8;
        }
        if ((i10 & 8) == 0) {
            this.mediaViewerBufferForPlaybackAfterRebufferMs = null;
        } else {
            this.mediaViewerBufferForPlaybackAfterRebufferMs = num9;
        }
        if ((i10 & 16) == 0) {
            this.mediaViewerMinBufferMs = null;
        } else {
            this.mediaViewerMinBufferMs = num10;
        }
        if ((i10 & 32) == 0) {
            this.mediaViewerMaxBufferMs = null;
        } else {
            this.mediaViewerMaxBufferMs = num11;
        }
        this.mediaViewerEnableDecoderFallback = (i10 & 64) == 0 ? Boolean.FALSE : bool6;
        this.mediaViewerEnableAsyncBufferQueueing = (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 0 ? Boolean.TRUE : bool7;
        this.mediaViewerHttpEngine = (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 0 ? "default" : str18;
        this.srcIsAnimated = (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 0 ? Boolean.FALSE : bool8;
        final int i11 = 1;
        this.playerSettings = l.b(new Function0(this) { // from class: n5.a

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ Attachment f16494e;

            {
                this.f16494e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return Attachment.playerSettings_delegate$lambda$0(this.f16494e);
                    default:
                        return Attachment._init_$lambda$8(this.f16494e);
                }
            }
        });
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) == 0) {
            try {
                String str23 = this.waveform;
                bArrDecode = str23 != null ? Base64.decode(str23, 0) : null;
            } catch (Exception unused) {
            }
            this.waveformByteArray = bArrDecode;
        } else {
            this.waveformByteArray = bArr;
        }
        if ((i10 & RecyclerView.ItemAnimator.FLAG_MOVED) == 0) {
            str21 = this.spoiler;
            if (str21 == null || StringsKt.K(str21)) {
                str21 = null;
            }
        } else {
            str21 = str19;
        }
        this.spoilerOrNull = str21;
        if ((i10 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) == 0) {
            String str24 = this.obscureDescription;
            if (str24 != null && !StringsKt.K(str24)) {
                str22 = str24;
            }
            this.obscureOrNull = str22;
        } else {
            this.obscureOrNull = str20;
        }
        this.proxyWidth = (i10 & 8192) == 0 ? getProxyUrlQueryParam("width") : num12;
        this.proxyHeight = (i10 & 16384) == 0 ? getProxyUrlQueryParam("height") : num13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MediaPlayer.PlayerSettings _init_$lambda$8(Attachment attachment) {
        Integer num = attachment.mediaViewerMinBufferMs;
        int iIntValue = num != null ? num.intValue() : MediaPlayer.INSTANCE.getDefaultSettings().getMinBufferMs();
        Integer num2 = attachment.mediaViewerMaxBufferMs;
        int iIntValue2 = num2 != null ? num2.intValue() : MediaPlayer.INSTANCE.getDefaultSettings().getMaxBufferMs();
        Integer num3 = attachment.mediaViewerBufferForPlaybackMs;
        int iIntValue3 = num3 != null ? num3.intValue() : MediaPlayer.INSTANCE.getDefaultSettings().getBufferForPlaybackMs();
        Integer num4 = attachment.mediaViewerBufferForPlaybackAfterRebufferMs;
        int iIntValue4 = num4 != null ? num4.intValue() : MediaPlayer.INSTANCE.getDefaultSettings().getBufferForPlaybackAfterRebufferMs();
        Boolean bool = attachment.mediaViewerEnableDecoderFallback;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : MediaPlayer.INSTANCE.getDefaultSettings().getEnableDecoderFallback();
        Boolean bool2 = attachment.mediaViewerEnableAsyncBufferQueueing;
        boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : MediaPlayer.INSTANCE.getDefaultSettings().getEnableAsyncBufferQueueing();
        HttpEngine.Companion companion = HttpEngine.INSTANCE;
        String str = attachment.mediaViewerHttpEngine;
        if (str == null) {
            str = "default";
        }
        return new MediaPlayer.PlayerSettings(iIntValue, iIntValue2, iIntValue3, iIntValue4, zBooleanValue, zBooleanValue2, companion.fromString(str));
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    private final String getAttachmentTagIconType() {
        return this.attachmentTagIconType;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    private final String getAttachmentType() {
        return this.attachmentType;
    }

    /* JADX INFO: renamed from: component33, reason: from getter */
    private final String getWaveform() {
        return this.waveform;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    private final Integer getSourceWidth() {
        return this.sourceWidth;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    private final Integer getSourceHeight() {
        return this.sourceHeight;
    }

    private final Integer getProxyUrlQueryParam(String paramName) {
        Object objO;
        try {
            q qVar = Result.f14614e;
            String value = new UrlQuerySanitizer(this.url).getValue(paramName);
            objO = value != null ? StringsKt.toIntOrNull(value) : null;
        } catch (Throwable th2) {
            q qVar2 = Result.f14614e;
            objO = a.o(th2);
        }
        return (Integer) (objO instanceof r ? null : objO);
    }

    private static /* synthetic */ void getSourceHeight$annotations() {
    }

    private static /* synthetic */ void getSourceWidth$annotations() {
    }

    private final boolean hasDimensions() {
        return getWidth() > 0 && getHeight() > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MediaPlayer.PlayerSettings playerSettings_delegate$lambda$0(Attachment attachment) {
        Integer num = attachment.mediaViewerMinBufferMs;
        int iIntValue = num != null ? num.intValue() : MediaPlayer.INSTANCE.getDefaultSettings().getMinBufferMs();
        Integer num2 = attachment.mediaViewerMaxBufferMs;
        int iIntValue2 = num2 != null ? num2.intValue() : MediaPlayer.INSTANCE.getDefaultSettings().getMaxBufferMs();
        Integer num3 = attachment.mediaViewerBufferForPlaybackMs;
        int iIntValue3 = num3 != null ? num3.intValue() : MediaPlayer.INSTANCE.getDefaultSettings().getBufferForPlaybackMs();
        Integer num4 = attachment.mediaViewerBufferForPlaybackAfterRebufferMs;
        int iIntValue4 = num4 != null ? num4.intValue() : MediaPlayer.INSTANCE.getDefaultSettings().getBufferForPlaybackAfterRebufferMs();
        Boolean bool = attachment.mediaViewerEnableDecoderFallback;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : MediaPlayer.INSTANCE.getDefaultSettings().getEnableDecoderFallback();
        Boolean bool2 = attachment.mediaViewerEnableAsyncBufferQueueing;
        boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : MediaPlayer.INSTANCE.getDefaultSettings().getEnableAsyncBufferQueueing();
        HttpEngine.Companion companion = HttpEngine.INSTANCE;
        String str = attachment.mediaViewerHttpEngine;
        if (str == null) {
            str = "default";
        }
        return new MediaPlayer.PlayerSettings(iIntValue, iIntValue2, iIntValue3, iIntValue4, zBooleanValue, zBooleanValue2, companion.fromString(str));
    }

    private final boolean shouldShowImages() {
        Integer num = this.sourceWidth;
        if ((num != null ? num.intValue() : 0) > 0) {
            Integer num2 = this.sourceHeight;
            if ((num2 != null ? num2.intValue() : 0) > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:241:0x033a  */
    /* JADX WARN: Code duplicated, block: B:252:0x035f  */
    /* JADX WARN: Code duplicated, block: B:264:0x0387  */
    public static final /* synthetic */ void write$Self$chat_release(Attachment self, CompositeEncoder output, SerialDescriptor serialDesc) {
        byte[] bArrDecode;
        if (output.u(serialDesc, 0) || self.id != null) {
            output.r(serialDesc, 0, s1.f17602a, self.id);
        }
        output.q(serialDesc, 1, self.url);
        if (output.u(serialDesc, 2) || self.videoUrl != null) {
            output.r(serialDesc, 2, s1.f17602a, self.videoUrl);
        }
        output.q(serialDesc, 3, self.filename);
        output.q(serialDesc, 4, self.size);
        if (output.u(serialDesc, 5) || self.sourceWidth != null) {
            output.r(serialDesc, 5, m0.f17573a, self.sourceWidth);
        }
        if (output.u(serialDesc, 6) || self.sourceHeight != null) {
            output.r(serialDesc, 6, m0.f17573a, self.sourceHeight);
        }
        output.p(serialDesc, 7, self.isSpoiler);
        if (output.u(serialDesc, 8) || self.spoiler != null) {
            output.r(serialDesc, 8, s1.f17602a, self.spoiler);
        }
        if (output.u(serialDesc, 9) || self.description != null) {
            output.r(serialDesc, 9, s1.f17602a, self.description);
        }
        if (output.u(serialDesc, 10) || self.hint != null) {
            output.r(serialDesc, 10, s1.f17602a, self.hint);
        }
        if (output.u(serialDesc, 11) || self.role != null) {
            output.r(serialDesc, 11, s1.f17602a, self.role);
        }
        if (output.u(serialDesc, 12) || self.showDescription) {
            output.p(serialDesc, 12, self.showDescription);
        }
        if (output.u(serialDesc, 13) || self.progress != null) {
            output.r(serialDesc, 13, m0.f17573a, self.progress);
        }
        if (output.u(serialDesc, 14) || self.uploaderId != null) {
            output.r(serialDesc, 14, s1.f17602a, self.uploaderId);
        }
        if (output.u(serialDesc, 15) || self.uploaderItemId != null) {
            output.r(serialDesc, 15, s1.f17602a, self.uploaderItemId);
        }
        if (output.u(serialDesc, 16) || self.placeholder != null) {
            output.r(serialDesc, 16, s1.f17602a, self.placeholder);
        }
        if (output.u(serialDesc, 17) || self.placeholderVersion != null) {
            output.r(serialDesc, 17, m0.f17573a, self.placeholderVersion);
        }
        if (output.u(serialDesc, 18) || self.backgroundColor != null) {
            output.r(serialDesc, 18, m0.f17573a, self.backgroundColor);
        }
        if (output.u(serialDesc, 19) || self.isSuspiciousDownload) {
            output.p(serialDesc, 19, self.isSuspiciousDownload);
        }
        if (output.u(serialDesc, 20) || self.attachmentTagText != null) {
            output.r(serialDesc, 20, s1.f17602a, self.attachmentTagText);
        }
        if (output.u(serialDesc, 21) || self.attachmentTagBackgroundColor != null) {
            output.r(serialDesc, 21, m0.f17573a, self.attachmentTagBackgroundColor);
        }
        if (output.u(serialDesc, 22) || self.attachmentTagTextColor != null) {
            output.r(serialDesc, 22, m0.f17573a, self.attachmentTagTextColor);
        }
        if (output.u(serialDesc, 23) || self.attachmentTagIconType != null) {
            output.r(serialDesc, 23, s1.f17602a, self.attachmentTagIconType);
        }
        if (output.u(serialDesc, 24) || self.attachmentType != null) {
            output.r(serialDesc, 24, s1.f17602a, self.attachmentType);
        }
        if (output.u(serialDesc, 25) || self.obscure != null) {
            output.r(serialDesc, 25, g.f17537a, self.obscure);
        }
        if (output.u(serialDesc, 26) || self.obscureDescription != null) {
            output.r(serialDesc, 26, s1.f17602a, self.obscureDescription);
        }
        if (output.u(serialDesc, 27) || self.obscureAwaitingScan != null) {
            output.r(serialDesc, 27, g.f17537a, self.obscureAwaitingScan);
        }
        if (output.u(serialDesc, 28) || self.obscureHideControls != null) {
            output.r(serialDesc, 28, g.f17537a, self.obscureHideControls);
        }
        if (output.u(serialDesc, 29) || self.obscureIsOpaque != null) {
            output.r(serialDesc, 29, g.f17537a, self.obscureIsOpaque);
        }
        if (output.u(serialDesc, 30) || self.verifyAge != null) {
            output.r(serialDesc, 30, g.f17537a, self.verifyAge);
        }
        if (output.u(serialDesc, 31) || self.durationSecs != null) {
            output.r(serialDesc, 31, e0.f17525a, self.durationSecs);
        }
        if (output.u(serialDesc, 32) || self.waveform != null) {
            output.r(serialDesc, 32, s1.f17602a, self.waveform);
        }
        if (output.u(serialDesc, 33) || !self.isAnimated) {
            output.p(serialDesc, 33, self.isAnimated);
        }
        if (output.u(serialDesc, 34) || self.mediaViewerBufferForPlaybackMs != null) {
            output.r(serialDesc, 34, m0.f17573a, self.mediaViewerBufferForPlaybackMs);
        }
        if (output.u(serialDesc, 35) || self.mediaViewerBufferForPlaybackAfterRebufferMs != null) {
            output.r(serialDesc, 35, m0.f17573a, self.mediaViewerBufferForPlaybackAfterRebufferMs);
        }
        if (output.u(serialDesc, 36) || self.mediaViewerMinBufferMs != null) {
            output.r(serialDesc, 36, m0.f17573a, self.mediaViewerMinBufferMs);
        }
        if (output.u(serialDesc, 37) || self.mediaViewerMaxBufferMs != null) {
            output.r(serialDesc, 37, m0.f17573a, self.mediaViewerMaxBufferMs);
        }
        if (output.u(serialDesc, 38) || !Intrinsics.areEqual(self.mediaViewerEnableDecoderFallback, Boolean.FALSE)) {
            output.r(serialDesc, 38, g.f17537a, self.mediaViewerEnableDecoderFallback);
        }
        if (output.u(serialDesc, 39) || !Intrinsics.areEqual(self.mediaViewerEnableAsyncBufferQueueing, Boolean.TRUE)) {
            output.r(serialDesc, 39, g.f17537a, self.mediaViewerEnableAsyncBufferQueueing);
        }
        if (output.u(serialDesc, 40) || !Intrinsics.areEqual(self.mediaViewerHttpEngine, "default")) {
            output.r(serialDesc, 40, s1.f17602a, self.mediaViewerHttpEngine);
        }
        if (output.u(serialDesc, 41) || !Intrinsics.areEqual(self.srcIsAnimated, Boolean.FALSE)) {
            output.r(serialDesc, 41, g.f17537a, self.srcIsAnimated);
        }
        String str = null;
        if (output.u(serialDesc, 42)) {
            output.r(serialDesc, 42, i.f17558c, self.waveformByteArray);
        } else {
            byte[] bArr = self.waveformByteArray;
            try {
                String str2 = self.waveform;
                bArrDecode = str2 != null ? Base64.decode(str2, 0) : null;
            } catch (Exception unused) {
            }
            if (!Intrinsics.areEqual(bArr, bArrDecode)) {
                output.r(serialDesc, 42, i.f17558c, self.waveformByteArray);
            }
        }
        if (output.u(serialDesc, 43)) {
            output.r(serialDesc, 43, s1.f17602a, self.getSpoilerOrNull());
        } else {
            String spoilerOrNull = self.getSpoilerOrNull();
            String str3 = self.spoiler;
            if (str3 == null || StringsKt.K(str3)) {
                str3 = null;
            }
            if (!Intrinsics.areEqual(spoilerOrNull, str3)) {
                output.r(serialDesc, 43, s1.f17602a, self.getSpoilerOrNull());
            }
        }
        if (output.u(serialDesc, 44)) {
            output.r(serialDesc, 44, s1.f17602a, self.getObscureOrNull());
        } else {
            String obscureOrNull = self.getObscureOrNull();
            String str4 = self.obscureDescription;
            if (str4 != null && !StringsKt.K(str4)) {
                str = str4;
            }
            if (!Intrinsics.areEqual(obscureOrNull, str)) {
                output.r(serialDesc, 44, s1.f17602a, self.getObscureOrNull());
            }
        }
        if (output.u(serialDesc, 45) || !Intrinsics.areEqual(self.proxyWidth, self.getProxyUrlQueryParam("width"))) {
            output.r(serialDesc, 45, m0.f17573a, self.proxyWidth);
        }
        if (!output.u(serialDesc, 46) && Intrinsics.areEqual(self.proxyHeight, self.getProxyUrlQueryParam("height"))) {
            return;
        }
        output.r(serialDesc, 46, m0.f17573a, self.proxyHeight);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getHint() {
        return this.hint;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getRole() {
        return this.role;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getShowDescription() {
        return this.showDescription;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Integer getProgress() {
        return this.progress;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getUploaderId() {
        return this.uploaderId;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getUploaderItemId() {
        return this.uploaderItemId;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final Integer getPlaceholderVersion() {
        return this.placeholderVersion;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final Integer getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final boolean getIsSuspiciousDownload() {
        return this.isSuspiciousDownload;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getAttachmentTagText() {
        return this.attachmentTagText;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final Integer getAttachmentTagBackgroundColor() {
        return this.attachmentTagBackgroundColor;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final Integer getAttachmentTagTextColor() {
        return this.attachmentTagTextColor;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final Boolean getObscure() {
        return this.obscure;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final String getObscureDescription() {
        return this.obscureDescription;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final Boolean getObscureAwaitingScan() {
        return this.obscureAwaitingScan;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final Boolean getObscureHideControls() {
        return this.obscureHideControls;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getVideoUrl() {
        return this.videoUrl;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final Boolean getObscureIsOpaque() {
        return this.obscureIsOpaque;
    }

    /* JADX INFO: renamed from: component31, reason: from getter */
    public final Boolean getVerifyAge() {
        return this.verifyAge;
    }

    /* JADX INFO: renamed from: component32, reason: from getter */
    public final Float getDurationSecs() {
        return this.durationSecs;
    }

    /* JADX INFO: renamed from: component34, reason: from getter */
    public final boolean getIsAnimated() {
        return this.isAnimated;
    }

    /* JADX INFO: renamed from: component35, reason: from getter */
    public final Integer getMediaViewerBufferForPlaybackMs() {
        return this.mediaViewerBufferForPlaybackMs;
    }

    /* JADX INFO: renamed from: component36, reason: from getter */
    public final Integer getMediaViewerBufferForPlaybackAfterRebufferMs() {
        return this.mediaViewerBufferForPlaybackAfterRebufferMs;
    }

    /* JADX INFO: renamed from: component37, reason: from getter */
    public final Integer getMediaViewerMinBufferMs() {
        return this.mediaViewerMinBufferMs;
    }

    /* JADX INFO: renamed from: component38, reason: from getter */
    public final Integer getMediaViewerMaxBufferMs() {
        return this.mediaViewerMaxBufferMs;
    }

    /* JADX INFO: renamed from: component39, reason: from getter */
    public final Boolean getMediaViewerEnableDecoderFallback() {
        return this.mediaViewerEnableDecoderFallback;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getFilename() {
        return this.filename;
    }

    /* JADX INFO: renamed from: component40, reason: from getter */
    public final Boolean getMediaViewerEnableAsyncBufferQueueing() {
        return this.mediaViewerEnableAsyncBufferQueueing;
    }

    /* JADX INFO: renamed from: component41, reason: from getter */
    public final String getMediaViewerHttpEngine() {
        return this.mediaViewerHttpEngine;
    }

    /* JADX INFO: renamed from: component42, reason: from getter */
    public final Boolean getSrcIsAnimated() {
        return this.srcIsAnimated;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getIsSpoiler() {
        return this.isSpoiler;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getSpoiler() {
        return this.spoiler;
    }

    @NotNull
    public final Attachment copy(String id2, @NotNull String url, String videoUrl, @NotNull String filename, @NotNull String size, Integer sourceWidth, Integer sourceHeight, boolean isSpoiler, String spoiler, String description, String hint, String role, boolean showDescription, Integer progress, String uploaderId, String uploaderItemId, String placeholder, Integer placeholderVersion, Integer backgroundColor, boolean isSuspiciousDownload, String attachmentTagText, Integer attachmentTagBackgroundColor, Integer attachmentTagTextColor, String attachmentTagIconType, String attachmentType, Boolean obscure, String obscureDescription, Boolean obscureAwaitingScan, Boolean obscureHideControls, Boolean obscureIsOpaque, Boolean verifyAge, Float durationSecs, String waveform, boolean isAnimated, Integer mediaViewerBufferForPlaybackMs, Integer mediaViewerBufferForPlaybackAfterRebufferMs, Integer mediaViewerMinBufferMs, Integer mediaViewerMaxBufferMs, Boolean mediaViewerEnableDecoderFallback, Boolean mediaViewerEnableAsyncBufferQueueing, String mediaViewerHttpEngine, Boolean srcIsAnimated) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(filename, "filename");
        Intrinsics.checkNotNullParameter(size, "size");
        return new Attachment(id2, url, videoUrl, filename, size, sourceWidth, sourceHeight, isSpoiler, spoiler, description, hint, role, showDescription, progress, uploaderId, uploaderItemId, placeholder, placeholderVersion, backgroundColor, isSuspiciousDownload, attachmentTagText, attachmentTagBackgroundColor, attachmentTagTextColor, attachmentTagIconType, attachmentType, obscure, obscureDescription, obscureAwaitingScan, obscureHideControls, obscureIsOpaque, verifyAge, durationSecs, waveform, isAnimated, mediaViewerBufferForPlaybackMs, mediaViewerBufferForPlaybackAfterRebufferMs, mediaViewerMinBufferMs, mediaViewerMaxBufferMs, mediaViewerEnableDecoderFallback, mediaViewerEnableAsyncBufferQueueing, mediaViewerHttpEngine, srcIsAnimated);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Attachment)) {
            return false;
        }
        Attachment attachment = (Attachment) other;
        return Intrinsics.areEqual(this.id, attachment.id) && Intrinsics.areEqual(this.url, attachment.url) && Intrinsics.areEqual(this.videoUrl, attachment.videoUrl) && Intrinsics.areEqual(this.filename, attachment.filename) && Intrinsics.areEqual(this.size, attachment.size) && Intrinsics.areEqual(this.sourceWidth, attachment.sourceWidth) && Intrinsics.areEqual(this.sourceHeight, attachment.sourceHeight) && this.isSpoiler == attachment.isSpoiler && Intrinsics.areEqual(this.spoiler, attachment.spoiler) && Intrinsics.areEqual(this.description, attachment.description) && Intrinsics.areEqual(this.hint, attachment.hint) && Intrinsics.areEqual(this.role, attachment.role) && this.showDescription == attachment.showDescription && Intrinsics.areEqual(this.progress, attachment.progress) && Intrinsics.areEqual(this.uploaderId, attachment.uploaderId) && Intrinsics.areEqual(this.uploaderItemId, attachment.uploaderItemId) && Intrinsics.areEqual(this.placeholder, attachment.placeholder) && Intrinsics.areEqual(this.placeholderVersion, attachment.placeholderVersion) && Intrinsics.areEqual(this.backgroundColor, attachment.backgroundColor) && this.isSuspiciousDownload == attachment.isSuspiciousDownload && Intrinsics.areEqual(this.attachmentTagText, attachment.attachmentTagText) && Intrinsics.areEqual(this.attachmentTagBackgroundColor, attachment.attachmentTagBackgroundColor) && Intrinsics.areEqual(this.attachmentTagTextColor, attachment.attachmentTagTextColor) && Intrinsics.areEqual(this.attachmentTagIconType, attachment.attachmentTagIconType) && Intrinsics.areEqual(this.attachmentType, attachment.attachmentType) && Intrinsics.areEqual(this.obscure, attachment.obscure) && Intrinsics.areEqual(this.obscureDescription, attachment.obscureDescription) && Intrinsics.areEqual(this.obscureAwaitingScan, attachment.obscureAwaitingScan) && Intrinsics.areEqual(this.obscureHideControls, attachment.obscureHideControls) && Intrinsics.areEqual(this.obscureIsOpaque, attachment.obscureIsOpaque) && Intrinsics.areEqual(this.verifyAge, attachment.verifyAge) && Intrinsics.areEqual((Object) this.durationSecs, (Object) attachment.durationSecs) && Intrinsics.areEqual(this.waveform, attachment.waveform) && this.isAnimated == attachment.isAnimated && Intrinsics.areEqual(this.mediaViewerBufferForPlaybackMs, attachment.mediaViewerBufferForPlaybackMs) && Intrinsics.areEqual(this.mediaViewerBufferForPlaybackAfterRebufferMs, attachment.mediaViewerBufferForPlaybackAfterRebufferMs) && Intrinsics.areEqual(this.mediaViewerMinBufferMs, attachment.mediaViewerMinBufferMs) && Intrinsics.areEqual(this.mediaViewerMaxBufferMs, attachment.mediaViewerMaxBufferMs) && Intrinsics.areEqual(this.mediaViewerEnableDecoderFallback, attachment.mediaViewerEnableDecoderFallback) && Intrinsics.areEqual(this.mediaViewerEnableAsyncBufferQueueing, attachment.mediaViewerEnableAsyncBufferQueueing) && Intrinsics.areEqual(this.mediaViewerHttpEngine, attachment.mediaViewerHttpEngine) && Intrinsics.areEqual(this.srcIsAnimated, attachment.srcIsAnimated);
    }

    public final Integer getAttachmentTagBackgroundColor() {
        return this.attachmentTagBackgroundColor;
    }

    public final ReactAsset getAttachmentTagIcon() {
        if (Intrinsics.areEqual(this.attachmentTagIconType, "clip")) {
            return ReactAsset.ClipsIcon;
        }
        return null;
    }

    public final String getAttachmentTagText() {
        return this.attachmentTagText;
    }

    public final Integer getAttachmentTagTextColor() {
        return this.attachmentTagTextColor;
    }

    public final Integer getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Float getDurationSecs() {
        return this.durationSecs;
    }

    @NotNull
    public final String getFilename() {
        return this.filename;
    }

    public final int getHeight() {
        Integer num = this.proxyHeight;
        if (num != null) {
            return num.intValue();
        }
        Integer num2 = this.sourceHeight;
        if (num2 != null) {
            return num2.intValue();
        }
        return 0;
    }

    public final String getHint() {
        return this.hint;
    }

    public final String getId() {
        return this.id;
    }

    public final Integer getMediaViewerBufferForPlaybackAfterRebufferMs() {
        return this.mediaViewerBufferForPlaybackAfterRebufferMs;
    }

    public final Integer getMediaViewerBufferForPlaybackMs() {
        return this.mediaViewerBufferForPlaybackMs;
    }

    public final Boolean getMediaViewerEnableAsyncBufferQueueing() {
        return this.mediaViewerEnableAsyncBufferQueueing;
    }

    public final Boolean getMediaViewerEnableDecoderFallback() {
        return this.mediaViewerEnableDecoderFallback;
    }

    public final String getMediaViewerHttpEngine() {
        return this.mediaViewerHttpEngine;
    }

    public final Integer getMediaViewerMaxBufferMs() {
        return this.mediaViewerMaxBufferMs;
    }

    public final Integer getMediaViewerMinBufferMs() {
        return this.mediaViewerMinBufferMs;
    }

    public final Boolean getObscure() {
        return this.obscure;
    }

    public final Boolean getObscureAwaitingScan() {
        return this.obscureAwaitingScan;
    }

    public final String getObscureDescription() {
        return this.obscureDescription;
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

    public final String getPlaceholder() {
        return this.placeholder;
    }

    public final Integer getPlaceholderVersion() {
        return this.placeholderVersion;
    }

    @NotNull
    public final MediaPlayer.PlayerSettings getPlayerSettings() {
        return (MediaPlayer.PlayerSettings) this.playerSettings.getValue();
    }

    public final Integer getProgress() {
        return this.progress;
    }

    public final String getRole() {
        return this.role;
    }

    public final boolean getShowDescription() {
        return this.showDescription;
    }

    @NotNull
    public final String getSize() {
        return this.size;
    }

    public final String getSpoiler() {
        return this.spoiler;
    }

    @Override // com.discord.chat.bridge.spoiler.SpoilerableData
    public String getSpoilerOrNull() {
        return this.spoilerOrNull;
    }

    public final Boolean getSrcIsAnimated() {
        return this.srcIsAnimated;
    }

    public final String getUploaderId() {
        return this.uploaderId;
    }

    public final String getUploaderItemId() {
        return this.uploaderItemId;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public final Boolean getVerifyAge() {
        return this.verifyAge;
    }

    public final String getVideoUrl() {
        return this.videoUrl;
    }

    public final byte[] getWaveformByteArray() {
        return this.waveformByteArray;
    }

    public final int getWidth() {
        Integer num = this.proxyWidth;
        if (num != null) {
            return num.intValue();
        }
        Integer num2 = this.sourceWidth;
        if (num2 != null) {
            return num2.intValue();
        }
        return 0;
    }

    public int hashCode() {
        String str = this.id;
        int iD = e.d((str == null ? 0 : str.hashCode()) * 31, 31, this.url);
        String str2 = this.videoUrl;
        int iD2 = e.d(e.d((iD + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.filename), 31, this.size);
        Integer num = this.sourceWidth;
        int iHashCode = (iD2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.sourceHeight;
        int iG = com.discord.chat.presentation.list.a.g((iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.isSpoiler);
        String str3 = this.spoiler;
        int iHashCode2 = (iG + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.description;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.hint;
        int iHashCode4 = (iHashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.role;
        int iG2 = com.discord.chat.presentation.list.a.g((iHashCode4 + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.showDescription);
        Integer num3 = this.progress;
        int iHashCode5 = (iG2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str7 = this.uploaderId;
        int iHashCode6 = (iHashCode5 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.uploaderItemId;
        int iHashCode7 = (iHashCode6 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.placeholder;
        int iHashCode8 = (iHashCode7 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Integer num4 = this.placeholderVersion;
        int iHashCode9 = (iHashCode8 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.backgroundColor;
        int iG3 = com.discord.chat.presentation.list.a.g((iHashCode9 + (num5 == null ? 0 : num5.hashCode())) * 31, 31, this.isSuspiciousDownload);
        String str10 = this.attachmentTagText;
        int iHashCode10 = (iG3 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Integer num6 = this.attachmentTagBackgroundColor;
        int iHashCode11 = (iHashCode10 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.attachmentTagTextColor;
        int iHashCode12 = (iHashCode11 + (num7 == null ? 0 : num7.hashCode())) * 31;
        String str11 = this.attachmentTagIconType;
        int iHashCode13 = (iHashCode12 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.attachmentType;
        int iHashCode14 = (iHashCode13 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Boolean bool = this.obscure;
        int iHashCode15 = (iHashCode14 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str13 = this.obscureDescription;
        int iHashCode16 = (iHashCode15 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Boolean bool2 = this.obscureAwaitingScan;
        int iHashCode17 = (iHashCode16 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.obscureHideControls;
        int iHashCode18 = (iHashCode17 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.obscureIsOpaque;
        int iHashCode19 = (iHashCode18 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.verifyAge;
        int iHashCode20 = (iHashCode19 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Float f2 = this.durationSecs;
        int iHashCode21 = (iHashCode20 + (f2 == null ? 0 : f2.hashCode())) * 31;
        String str14 = this.waveform;
        int iG4 = com.discord.chat.presentation.list.a.g((iHashCode21 + (str14 == null ? 0 : str14.hashCode())) * 31, 31, this.isAnimated);
        Integer num8 = this.mediaViewerBufferForPlaybackMs;
        int iHashCode22 = (iG4 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.mediaViewerBufferForPlaybackAfterRebufferMs;
        int iHashCode23 = (iHashCode22 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.mediaViewerMinBufferMs;
        int iHashCode24 = (iHashCode23 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.mediaViewerMaxBufferMs;
        int iHashCode25 = (iHashCode24 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Boolean bool6 = this.mediaViewerEnableDecoderFallback;
        int iHashCode26 = (iHashCode25 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.mediaViewerEnableAsyncBufferQueueing;
        int iHashCode27 = (iHashCode26 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        String str15 = this.mediaViewerHttpEngine;
        int iHashCode28 = (iHashCode27 + (str15 == null ? 0 : str15.hashCode())) * 31;
        Boolean bool8 = this.srcIsAnimated;
        return iHashCode28 + (bool8 != null ? bool8.hashCode() : 0);
    }

    public final boolean isAnimated() {
        return this.isAnimated;
    }

    public final boolean isSpoiler() {
        return this.isSpoiler;
    }

    public final boolean isSuspiciousDownload() {
        return this.isSuspiciousDownload;
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.url;
        String str3 = this.videoUrl;
        String str4 = this.filename;
        String str5 = this.size;
        Integer num = this.sourceWidth;
        Integer num2 = this.sourceHeight;
        boolean z5 = this.isSpoiler;
        String str6 = this.spoiler;
        String str7 = this.description;
        String str8 = this.hint;
        String str9 = this.role;
        boolean z6 = this.showDescription;
        Integer num3 = this.progress;
        String str10 = this.uploaderId;
        String str11 = this.uploaderItemId;
        String str12 = this.placeholder;
        Integer num4 = this.placeholderVersion;
        Integer num5 = this.backgroundColor;
        boolean z7 = this.isSuspiciousDownload;
        String str13 = this.attachmentTagText;
        Integer num6 = this.attachmentTagBackgroundColor;
        Integer num7 = this.attachmentTagTextColor;
        String str14 = this.attachmentTagIconType;
        String str15 = this.attachmentType;
        Boolean bool = this.obscure;
        String str16 = this.obscureDescription;
        Boolean bool2 = this.obscureAwaitingScan;
        Boolean bool3 = this.obscureHideControls;
        Boolean bool4 = this.obscureIsOpaque;
        Boolean bool5 = this.verifyAge;
        Float f2 = this.durationSecs;
        String str17 = this.waveform;
        boolean z10 = this.isAnimated;
        Integer num8 = this.mediaViewerBufferForPlaybackMs;
        Integer num9 = this.mediaViewerBufferForPlaybackAfterRebufferMs;
        Integer num10 = this.mediaViewerMinBufferMs;
        Integer num11 = this.mediaViewerMaxBufferMs;
        Boolean bool6 = this.mediaViewerEnableDecoderFallback;
        Boolean bool7 = this.mediaViewerEnableAsyncBufferQueueing;
        String str18 = this.mediaViewerHttpEngine;
        Boolean bool8 = this.srcIsAnimated;
        StringBuilder sbU = e.u("Attachment(id=", str, ", url=", str2, ", videoUrl=");
        e.A(sbU, str3, ", filename=", str4, ", size=");
        com.discord.chat.presentation.list.a.r(num, str5, ", sourceWidth=", ", sourceHeight=", sbU);
        sbU.append(num2);
        sbU.append(", isSpoiler=");
        sbU.append(z5);
        sbU.append(", spoiler=");
        e.A(sbU, str6, ", description=", str7, ", hint=");
        e.A(sbU, str8, ", role=", str9, ", showDescription=");
        sbU.append(z6);
        sbU.append(", progress=");
        sbU.append(num3);
        sbU.append(", uploaderId=");
        e.A(sbU, str10, ", uploaderItemId=", str11, ", placeholder=");
        com.discord.chat.presentation.list.a.r(num4, str12, ", placeholderVersion=", ", backgroundColor=", sbU);
        sbU.append(num5);
        sbU.append(", isSuspiciousDownload=");
        sbU.append(z7);
        sbU.append(", attachmentTagText=");
        com.discord.chat.presentation.list.a.r(num6, str13, ", attachmentTagBackgroundColor=", ", attachmentTagTextColor=", sbU);
        b.r(num7, ", attachmentTagIconType=", str14, ", attachmentType=", sbU);
        sbU.append(str15);
        sbU.append(", obscure=");
        sbU.append(bool);
        sbU.append(", obscureDescription=");
        sbU.append(str16);
        sbU.append(", obscureAwaitingScan=");
        sbU.append(bool2);
        sbU.append(", obscureHideControls=");
        sbU.append(bool3);
        sbU.append(", obscureIsOpaque=");
        sbU.append(bool4);
        sbU.append(", verifyAge=");
        sbU.append(bool5);
        sbU.append(", durationSecs=");
        sbU.append(f2);
        sbU.append(", waveform=");
        sbU.append(str17);
        sbU.append(", isAnimated=");
        sbU.append(z10);
        sbU.append(", mediaViewerBufferForPlaybackMs=");
        b.s(sbU, num8, ", mediaViewerBufferForPlaybackAfterRebufferMs=", num9, ", mediaViewerMinBufferMs=");
        b.s(sbU, num10, ", mediaViewerMaxBufferMs=", num11, ", mediaViewerEnableDecoderFallback=");
        sbU.append(bool6);
        sbU.append(", mediaViewerEnableAsyncBufferQueueing=");
        sbU.append(bool7);
        sbU.append(", mediaViewerHttpEngine=");
        sbU.append(str18);
        sbU.append(", srcIsAnimated=");
        sbU.append(bool8);
        sbU.append(")");
        return sbU.toString();
    }

    @NotNull
    public final AttachmentType type() {
        if (Intrinsics.areEqual(this.attachmentType, MediaStreamTrack.AUDIO_TRACK_KIND)) {
            return AttachmentType.Audio;
        }
        if (!shouldShowImages()) {
            return AttachmentType.File;
        }
        if (Intrinsics.areEqual(this.attachmentType, "image") && hasDimensions()) {
            return AttachmentType.Image;
        }
        return (Intrinsics.areEqual(this.attachmentType, MediaStreamTrack.VIDEO_TRACK_KIND) && hasDimensions()) ? AttachmentType.Video : AttachmentType.File;
    }

    public Attachment(String str, @NotNull String url, String str2, @NotNull String filename, @NotNull String size, Integer num, Integer num2, boolean z5, String str3, String str4, String str5, String str6, boolean z6, Integer num3, String str7, String str8, String str9, Integer num4, Integer num5, boolean z7, String str10, Integer num6, Integer num7, String str11, String str12, Boolean bool, String str13, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Float f2, String str14, boolean z10, Integer num8, Integer num9, Integer num10, Integer num11, Boolean bool6, Boolean bool7, String str15, Boolean bool8) {
        byte[] bArrDecode;
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(filename, "filename");
        Intrinsics.checkNotNullParameter(size, "size");
        this.id = str;
        this.url = url;
        this.videoUrl = str2;
        this.filename = filename;
        this.size = size;
        this.sourceWidth = num;
        this.sourceHeight = num2;
        this.isSpoiler = z5;
        this.spoiler = str3;
        this.description = str4;
        this.hint = str5;
        this.role = str6;
        this.showDescription = z6;
        this.progress = num3;
        this.uploaderId = str7;
        this.uploaderItemId = str8;
        this.placeholder = str9;
        this.placeholderVersion = num4;
        this.backgroundColor = num5;
        this.isSuspiciousDownload = z7;
        this.attachmentTagText = str10;
        this.attachmentTagBackgroundColor = num6;
        this.attachmentTagTextColor = num7;
        this.attachmentTagIconType = str11;
        this.attachmentType = str12;
        this.obscure = bool;
        this.obscureDescription = str13;
        this.obscureAwaitingScan = bool2;
        this.obscureHideControls = bool3;
        this.obscureIsOpaque = bool4;
        this.verifyAge = bool5;
        this.durationSecs = f2;
        this.waveform = str14;
        this.isAnimated = z10;
        this.mediaViewerBufferForPlaybackMs = num8;
        this.mediaViewerBufferForPlaybackAfterRebufferMs = num9;
        this.mediaViewerMinBufferMs = num10;
        this.mediaViewerMaxBufferMs = num11;
        this.mediaViewerEnableDecoderFallback = bool6;
        this.mediaViewerEnableAsyncBufferQueueing = bool7;
        this.mediaViewerHttpEngine = str15;
        this.srcIsAnimated = bool8;
        final int i7 = 0;
        this.playerSettings = l.b(new Function0(this) { // from class: n5.a

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ Attachment f16494e;

            {
                this.f16494e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return Attachment.playerSettings_delegate$lambda$0(this.f16494e);
                    default:
                        return Attachment._init_$lambda$8(this.f16494e);
                }
            }
        });
        String str16 = null;
        if (str14 != null) {
            try {
                bArrDecode = Base64.decode(str14, 0);
            } catch (Exception unused) {
                bArrDecode = null;
            }
        } else {
            bArrDecode = null;
        }
        this.waveformByteArray = bArrDecode;
        String str17 = this.spoiler;
        this.spoilerOrNull = (str17 == null || StringsKt.K(str17)) ? null : str17;
        String str18 = this.obscureDescription;
        if (str18 != null && !StringsKt.K(str18)) {
            str16 = str18;
        }
        this.obscureOrNull = str16;
        this.proxyWidth = getProxyUrlQueryParam("width");
        this.proxyHeight = getProxyUrlQueryParam("height");
    }

    public /* synthetic */ Attachment(String str, String str2, String str3, String str4, String str5, Integer num, Integer num2, boolean z5, String str6, String str7, String str8, String str9, boolean z6, Integer num3, String str10, String str11, String str12, Integer num4, Integer num5, boolean z7, String str13, Integer num6, Integer num7, String str14, String str15, Boolean bool, String str16, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Float f2, String str17, boolean z10, Integer num8, Integer num9, Integer num10, Integer num11, Boolean bool6, Boolean bool7, String str18, Boolean bool8, int i7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, str2, (i7 & 4) != 0 ? null : str3, str4, str5, (i7 & 32) != 0 ? null : num, (i7 & 64) != 0 ? null : num2, z5, (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : str6, (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? null : str7, (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? null : str8, (i7 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? null : str9, (i7 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? false : z6, (i7 & 8192) != 0 ? null : num3, (i7 & 16384) != 0 ? null : str10, (32768 & i7) != 0 ? null : str11, (65536 & i7) != 0 ? null : str12, (131072 & i7) != 0 ? null : num4, (262144 & i7) != 0 ? null : num5, (524288 & i7) != 0 ? false : z7, (1048576 & i7) != 0 ? null : str13, (2097152 & i7) != 0 ? null : num6, (4194304 & i7) != 0 ? null : num7, (8388608 & i7) != 0 ? null : str14, (16777216 & i7) != 0 ? null : str15, (33554432 & i7) != 0 ? null : bool, (67108864 & i7) != 0 ? null : str16, (134217728 & i7) != 0 ? null : bool2, (268435456 & i7) != 0 ? null : bool3, (536870912 & i7) != 0 ? null : bool4, (1073741824 & i7) != 0 ? null : bool5, (i7 & Integer.MIN_VALUE) != 0 ? null : f2, (i10 & 1) != 0 ? null : str17, (i10 & 2) != 0 ? true : z10, (i10 & 4) != 0 ? null : num8, (i10 & 8) != 0 ? null : num9, (i10 & 16) != 0 ? null : num10, (i10 & 32) != 0 ? null : num11, (i10 & 64) != 0 ? Boolean.FALSE : bool6, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? Boolean.TRUE : bool7, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? "default" : str18, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? Boolean.FALSE : bool8);
    }
}
