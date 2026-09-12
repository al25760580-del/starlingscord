package com.discord.chat.presentation.textutils;

import a3.e;
import android.content.Context;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.bridge.contentnode.CommandMentionContentNode;
import com.discord.chat.bridge.contentnode.EmojiContentNode;
import com.discord.chat.bridge.contentnode.GameMentionContentNode;
import com.discord.chat.bridge.contentnode.InlineCodeContentNode;
import com.discord.chat.bridge.contentnode.LinkContentNode;
import com.discord.chat.bridge.contentnode.SoundmojiContentNode;
import com.discord.chat.presentation.list.a;
import com.discord.theme.DiscordThemeObject;
import com.facebook.imagepipeline.nativecode.b;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.webrtc.PeerConnection;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b{\b\u0086\b\u0018\u00002\u00020\u0001:\u0004±\u0001²\u0001BÃ\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\u0006\u0012\"\u0010\u000e\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\b0\r\u0012*\u0010\u0010\u001a&\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\b0\u000f\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0012\u0012:\u0010\u0015\u001a6\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\b0\u0014\u0012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\b0\u0006\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u001b\u0012\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\b0\u0006\u0012\u0014\b\u0002\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010&\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020$\u0012\u0006\u0010(\u001a\u00020$\u0012\u0006\u0010)\u001a\u00020$\u0012\u0006\u0010+\u001a\u00020*\u0012\b\b\u0002\u0010-\u001a\u00020,\u0012\b\b\u0002\u0010/\u001a\u00020.\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u000100\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u000100\u0012\b\b\u0002\u00103\u001a\u00020$\u0012\b\b\u0002\u00105\u001a\u000204\u0012\u0006\u00107\u001a\u000206\u0012\b\b\u0002\u00109\u001a\u000208\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u000108\u0012\b\b\u0002\u0010;\u001a\u00020$¢\u0006\u0004\b<\u0010=J!\u0010?\u001a\u00020\u00002\u0012\u0010>\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u0002040\u0006¢\u0006\u0004\b?\u0010@J\r\u0010A\u001a\u00020$¢\u0006\u0004\bA\u0010BJ\r\u0010C\u001a\u00020$¢\u0006\u0004\bC\u0010BJ\r\u0010D\u001a\u00020$¢\u0006\u0004\bD\u0010BJ\u0010\u0010E\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bE\u0010FJ\u0010\u0010G\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bG\u0010HJ\u001c\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006HÆ\u0003¢\u0006\u0004\bI\u0010JJ\u001c\u0010K\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006HÆ\u0003¢\u0006\u0004\bK\u0010JJ\u001c\u0010L\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\u0006HÆ\u0003¢\u0006\u0004\bL\u0010JJ,\u0010M\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\b0\rHÆ\u0003¢\u0006\u0004\bM\u0010NJ4\u0010O\u001a&\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\b0\u000fHÆ\u0003¢\u0006\u0004\bO\u0010PJ\u001c\u0010Q\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0006HÆ\u0003¢\u0006\u0004\bQ\u0010JJ\"\u0010R\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0012HÆ\u0003¢\u0006\u0004\bR\u0010SJD\u0010T\u001a6\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\b0\u0014HÆ\u0003¢\u0006\u0004\bT\u0010UJ\u001c\u0010V\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\b0\u0006HÆ\u0003¢\u0006\u0004\bV\u0010JJ\u001c\u0010W\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\b0\u0006HÆ\u0003¢\u0006\u0004\bW\u0010JJ\u001c\u0010X\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\b0\u0006HÆ\u0003¢\u0006\u0004\bX\u0010JJ\u0016\u0010Y\u001a\b\u0012\u0004\u0012\u00020\b0\u001bHÆ\u0003¢\u0006\u0004\bY\u0010ZJ\u001c\u0010[\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0006HÆ\u0003¢\u0006\u0004\b[\u0010JJ\u001c\u0010\\\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\b0\u0006HÆ\u0003¢\u0006\u0004\b\\\u0010JJ\u001c\u0010]\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\b0\u0006HÆ\u0003¢\u0006\u0004\b]\u0010JJ\u001c\u0010^\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\b0\u0006HÆ\u0003¢\u0006\u0004\b^\u0010JJ\u0010\u0010_\u001a\u00020$HÆ\u0003¢\u0006\u0004\b_\u0010BJ\u0010\u0010`\u001a\u00020$HÆ\u0003¢\u0006\u0004\b`\u0010BJ\u0010\u0010a\u001a\u00020$HÆ\u0003¢\u0006\u0004\ba\u0010BJ\u0010\u0010b\u001a\u00020$HÆ\u0003¢\u0006\u0004\bb\u0010BJ\u0010\u0010c\u001a\u00020$HÆ\u0003¢\u0006\u0004\bc\u0010BJ\u0010\u0010d\u001a\u00020*HÆ\u0003¢\u0006\u0004\bd\u0010eJ\u0010\u0010f\u001a\u00020,HÆ\u0003¢\u0006\u0004\bf\u0010gJ\u0010\u0010h\u001a\u00020.HÆ\u0003¢\u0006\u0004\bh\u0010iJ\u0012\u0010j\u001a\u0004\u0018\u000100HÆ\u0003¢\u0006\u0004\bj\u0010kJ\u0012\u0010l\u001a\u0004\u0018\u000100HÆ\u0003¢\u0006\u0004\bl\u0010kJ\u0010\u0010m\u001a\u00020$HÆ\u0003¢\u0006\u0004\bm\u0010BJ\u0010\u0010n\u001a\u000204HÆ\u0003¢\u0006\u0004\bn\u0010oJ\u0010\u0010p\u001a\u000206HÆ\u0003¢\u0006\u0004\bp\u0010qJ\u0010\u0010r\u001a\u000208HÆ\u0003¢\u0006\u0004\br\u0010sJ\u0012\u0010t\u001a\u0004\u0018\u000108HÆ\u0003¢\u0006\u0004\bt\u0010uJ\u0010\u0010v\u001a\u00020$HÆ\u0003¢\u0006\u0004\bv\u0010BJú\u0004\u0010w\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\u00062$\b\u0002\u0010\u000e\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\b0\r2,\b\u0002\u0010\u0010\u001a&\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\b0\u000f2\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u00062\u001a\b\u0002\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u00122<\b\u0002\u0010\u0015\u001a6\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\b0\u00142\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\b0\u00062\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\b0\u00062\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\b0\u00062\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u001b2\u0014\b\u0002\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u00062\u0014\b\u0002\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\b0\u00062\u0014\b\u0002\u0010!\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\b0\u00062\u0014\b\u0002\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\b0\u00062\b\b\u0002\u0010%\u001a\u00020$2\b\b\u0002\u0010&\u001a\u00020$2\b\b\u0002\u0010'\u001a\u00020$2\b\b\u0002\u0010(\u001a\u00020$2\b\b\u0002\u0010)\u001a\u00020$2\b\b\u0002\u0010+\u001a\u00020*2\b\b\u0002\u0010-\u001a\u00020,2\b\b\u0002\u0010/\u001a\u00020.2\n\b\u0002\u00101\u001a\u0004\u0018\u0001002\n\b\u0002\u00102\u001a\u0004\u0018\u0001002\b\b\u0002\u00103\u001a\u00020$2\b\b\u0002\u00105\u001a\u0002042\b\b\u0002\u00107\u001a\u0002062\b\b\u0002\u00109\u001a\u0002082\n\b\u0002\u0010:\u001a\u0004\u0018\u0001082\b\b\u0002\u0010;\u001a\u00020$HÆ\u0001¢\u0006\u0004\bw\u0010xJ\u0010\u0010y\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\by\u0010HJ\u0010\u0010z\u001a\u00020.HÖ\u0001¢\u0006\u0004\bz\u0010iJ\u001a\u0010|\u001a\u00020$2\b\u0010{\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b|\u0010}R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010~\u001a\u0004\b\u007f\u0010FR\u0019\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0005\u0010\u0080\u0001\u001a\u0005\b\u0081\u0001\u0010HR%\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0006¢\u0006\u000e\n\u0005\b\t\u0010\u0082\u0001\u001a\u0005\b\u0083\u0001\u0010JR%\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0006¢\u0006\u000e\n\u0005\b\n\u0010\u0082\u0001\u001a\u0005\b\u0084\u0001\u0010JR%\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\u00068\u0006¢\u0006\u000e\n\u0005\b\f\u0010\u0082\u0001\u001a\u0005\b\u0085\u0001\u0010JR5\u0010\u000e\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\b0\r8\u0006¢\u0006\u000e\n\u0005\b\u000e\u0010\u0086\u0001\u001a\u0005\b\u0087\u0001\u0010NR=\u0010\u0010\u001a&\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\b0\u000f8\u0006¢\u0006\u000e\n\u0005\b\u0010\u0010\u0088\u0001\u001a\u0005\b\u0089\u0001\u0010PR%\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u00068\u0006¢\u0006\u000e\n\u0005\b\u0011\u0010\u0082\u0001\u001a\u0005\b\u008a\u0001\u0010JR+\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u00128\u0006¢\u0006\u000e\n\u0005\b\u0013\u0010\u008b\u0001\u001a\u0005\b\u008c\u0001\u0010SRM\u0010\u0015\u001a6\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\b0\u00148\u0006¢\u0006\u000e\n\u0005\b\u0015\u0010\u008d\u0001\u001a\u0005\b\u008e\u0001\u0010UR%\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\b0\u00068\u0006¢\u0006\u000e\n\u0005\b\u0017\u0010\u0082\u0001\u001a\u0005\b\u008f\u0001\u0010JR%\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\b0\u00068\u0006¢\u0006\u000e\n\u0005\b\u0018\u0010\u0082\u0001\u001a\u0005\b\u0090\u0001\u0010JR%\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\b0\u00068\u0006¢\u0006\u000e\n\u0005\b\u001a\u0010\u0082\u0001\u001a\u0005\b\u0091\u0001\u0010JR\u001f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u001b8\u0006¢\u0006\u000e\n\u0005\b\u001c\u0010\u0092\u0001\u001a\u0005\b\u0093\u0001\u0010ZR%\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u00068\u0006¢\u0006\u000e\n\u0005\b\u001d\u0010\u0082\u0001\u001a\u0005\b\u0094\u0001\u0010JR%\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\b0\u00068\u0006¢\u0006\u000e\n\u0005\b\u001f\u0010\u0082\u0001\u001a\u0005\b\u0095\u0001\u0010JR%\u0010!\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\b0\u00068\u0006¢\u0006\u000e\n\u0005\b!\u0010\u0082\u0001\u001a\u0005\b\u0096\u0001\u0010JR%\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\b0\u00068\u0006¢\u0006\u000e\n\u0005\b#\u0010\u0082\u0001\u001a\u0005\b\u0097\u0001\u0010JR\u0019\u0010%\u001a\u00020$8\u0006¢\u0006\u000e\n\u0005\b%\u0010\u0098\u0001\u001a\u0005\b\u0099\u0001\u0010BR\u0019\u0010&\u001a\u00020$8\u0006¢\u0006\u000e\n\u0005\b&\u0010\u0098\u0001\u001a\u0005\b\u009a\u0001\u0010BR\u0019\u0010'\u001a\u00020$8\u0006¢\u0006\u000e\n\u0005\b'\u0010\u0098\u0001\u001a\u0005\b\u009b\u0001\u0010BR\u0019\u0010(\u001a\u00020$8\u0006¢\u0006\u000e\n\u0005\b(\u0010\u0098\u0001\u001a\u0005\b\u009c\u0001\u0010BR\u0019\u0010)\u001a\u00020$8\u0006¢\u0006\u000e\n\u0005\b)\u0010\u0098\u0001\u001a\u0005\b\u009d\u0001\u0010BR\u0019\u0010+\u001a\u00020*8\u0006¢\u0006\u000e\n\u0005\b+\u0010\u009e\u0001\u001a\u0005\b\u009f\u0001\u0010eR\u0019\u0010-\u001a\u00020,8\u0006¢\u0006\u000e\n\u0005\b-\u0010 \u0001\u001a\u0005\b¡\u0001\u0010gR\u0019\u0010/\u001a\u00020.8\u0006¢\u0006\u000e\n\u0005\b/\u0010¢\u0001\u001a\u0005\b£\u0001\u0010iR\u001b\u00101\u001a\u0004\u0018\u0001008\u0006¢\u0006\u000e\n\u0005\b1\u0010¤\u0001\u001a\u0005\b¥\u0001\u0010kR\u001b\u00102\u001a\u0004\u0018\u0001008\u0006¢\u0006\u000e\n\u0005\b2\u0010¤\u0001\u001a\u0005\b¦\u0001\u0010kR\u0019\u00103\u001a\u00020$8\u0006¢\u0006\u000e\n\u0005\b3\u0010\u0098\u0001\u001a\u0005\b§\u0001\u0010BR\u0019\u00105\u001a\u0002048\u0006¢\u0006\u000e\n\u0005\b5\u0010¨\u0001\u001a\u0005\b©\u0001\u0010oR\u0019\u00107\u001a\u0002068\u0006¢\u0006\u000e\n\u0005\b7\u0010ª\u0001\u001a\u0005\b«\u0001\u0010qR\u0019\u00109\u001a\u0002088\u0006¢\u0006\u000e\n\u0005\b9\u0010¬\u0001\u001a\u0005\b\u00ad\u0001\u0010sR\u001b\u0010:\u001a\u0004\u0018\u0001088\u0006¢\u0006\u000e\n\u0005\b:\u0010®\u0001\u001a\u0005\b¯\u0001\u0010uR\u0019\u0010;\u001a\u00020$8\u0006¢\u0006\u000e\n\u0005\b;\u0010\u0098\u0001\u001a\u0005\b°\u0001\u0010B¨\u0006³\u0001"}, d2 = {"Lcom/discord/chat/presentation/textutils/RenderContext;", "", "Landroid/content/Context;", "context", "", "containerId", "Lkotlin/Function1;", "Lcom/discord/chat/bridge/contentnode/LinkContentNode;", "", "onTapLink", "onLongTapLink", "Lcom/discord/chat/presentation/textutils/LinkStyle;", "linkStyle", "Lkotlin/Function3;", "onTapChannel", "Lkotlin/Function4;", "onLongPressChannel", "onTapAttachmentLink", "Lkotlin/Function2;", "onLongPressAttachmentLink", "Lkotlin/Function6;", "onTapMention", "Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;", "onTapCommand", "onLongPressCommand", "Lcom/discord/chat/bridge/contentnode/GameMentionContentNode;", "onTapGameMention", "Lkotlin/Function0;", "onTapSpoiler", "onTapTimestamp", "Lcom/discord/chat/bridge/contentnode/InlineCodeContentNode;", "onTapInlineCode", "Lcom/discord/chat/bridge/contentnode/EmojiContentNode;", "onTapEmoji", "Lcom/discord/chat/bridge/contentnode/SoundmojiContentNode;", "onTapSoundmoji", "", "animateEmoji", "showLinkDecorations", "shouldShowRoleDot", "shouldShowRoleOnName", "singleLine", "Landroid/graphics/Paint;", "paint", "Lcom/discord/chat/presentation/textutils/RenderContext$SpoilerState;", "spoilerState", "", "listNestedLevel", "", "listOrderedIndex", "listLargestOrderedIndex", "inLink", "Lcom/discord/chat/presentation/textutils/RenderContext$Insets;", "insets", "Lcom/discord/theme/DiscordThemeObject;", "theme", "", "baselineHeightPx", "emojiBaselineHeightOverridePx", "shouldOmitTopAndBottomHeadingSpacerNewLine", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function6;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZZZZLandroid/graphics/Paint;Lcom/discord/chat/presentation/textutils/RenderContext$SpoilerState;ILjava/lang/Long;Ljava/lang/Long;ZLcom/discord/chat/presentation/textutils/RenderContext$Insets;Lcom/discord/theme/DiscordThemeObject;FLjava/lang/Float;Z)V", "update", "updateInsets", "(Lkotlin/jvm/functions/Function1;)Lcom/discord/chat/presentation/textutils/RenderContext;", "spoilerExists", "()Z", "spoilerIsHidden", "spoilerIsRevealed", "component1", "()Landroid/content/Context;", "component2", "()Ljava/lang/String;", "component3", "()Lkotlin/jvm/functions/Function1;", "component4", "component5", "component6", "()Lkotlin/jvm/functions/Function3;", "component7", "()Lkotlin/jvm/functions/Function4;", "component8", "component9", "()Lkotlin/jvm/functions/Function2;", "component10", "()Lkotlin/jvm/functions/Function6;", "component11", "component12", "component13", "component14", "()Lkotlin/jvm/functions/Function0;", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "()Landroid/graphics/Paint;", "component25", "()Lcom/discord/chat/presentation/textutils/RenderContext$SpoilerState;", "component26", "()I", "component27", "()Ljava/lang/Long;", "component28", "component29", "component30", "()Lcom/discord/chat/presentation/textutils/RenderContext$Insets;", "component31", "()Lcom/discord/theme/DiscordThemeObject;", "component32", "()F", "component33", "()Ljava/lang/Float;", "component34", "copy", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function6;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZZZZLandroid/graphics/Paint;Lcom/discord/chat/presentation/textutils/RenderContext$SpoilerState;ILjava/lang/Long;Ljava/lang/Long;ZLcom/discord/chat/presentation/textutils/RenderContext$Insets;Lcom/discord/theme/DiscordThemeObject;FLjava/lang/Float;Z)Lcom/discord/chat/presentation/textutils/RenderContext;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Landroid/content/Context;", "getContext", "Ljava/lang/String;", "getContainerId", "Lkotlin/jvm/functions/Function1;", "getOnTapLink", "getOnLongTapLink", "getLinkStyle", "Lkotlin/jvm/functions/Function3;", "getOnTapChannel", "Lkotlin/jvm/functions/Function4;", "getOnLongPressChannel", "getOnTapAttachmentLink", "Lkotlin/jvm/functions/Function2;", "getOnLongPressAttachmentLink", "Lkotlin/jvm/functions/Function6;", "getOnTapMention", "getOnTapCommand", "getOnLongPressCommand", "getOnTapGameMention", "Lkotlin/jvm/functions/Function0;", "getOnTapSpoiler", "getOnTapTimestamp", "getOnTapInlineCode", "getOnTapEmoji", "getOnTapSoundmoji", "Z", "getAnimateEmoji", "getShowLinkDecorations", "getShouldShowRoleDot", "getShouldShowRoleOnName", "getSingleLine", "Landroid/graphics/Paint;", "getPaint", "Lcom/discord/chat/presentation/textutils/RenderContext$SpoilerState;", "getSpoilerState", "I", "getListNestedLevel", "Ljava/lang/Long;", "getListOrderedIndex", "getListLargestOrderedIndex", "getInLink", "Lcom/discord/chat/presentation/textutils/RenderContext$Insets;", "getInsets", "Lcom/discord/theme/DiscordThemeObject;", "getTheme", "F", "getBaselineHeightPx", "Ljava/lang/Float;", "getEmojiBaselineHeightOverridePx", "getShouldOmitTopAndBottomHeadingSpacerNewLine", "Insets", "SpoilerState", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class RenderContext {
    private final boolean animateEmoji;
    private final float baselineHeightPx;

    @NotNull
    private final String containerId;

    @NotNull
    private final Context context;
    private final Float emojiBaselineHeightOverridePx;
    private final boolean inLink;

    @NotNull
    private final Insets insets;

    @NotNull
    private final Function1<LinkContentNode, LinkStyle> linkStyle;
    private final Long listLargestOrderedIndex;
    private final int listNestedLevel;
    private final Long listOrderedIndex;

    @NotNull
    private final Function2<String, String, Unit> onLongPressAttachmentLink;

    @NotNull
    private final Function4 onLongPressChannel;

    @NotNull
    private final Function1<CommandMentionContentNode, Unit> onLongPressCommand;

    @NotNull
    private final Function1<LinkContentNode, Unit> onLongTapLink;

    @NotNull
    private final Function1<String, Unit> onTapAttachmentLink;

    @NotNull
    private final Function3 onTapChannel;

    @NotNull
    private final Function1<CommandMentionContentNode, Unit> onTapCommand;

    @NotNull
    private final Function1<EmojiContentNode, Unit> onTapEmoji;

    @NotNull
    private final Function1<GameMentionContentNode, Unit> onTapGameMention;

    @NotNull
    private final Function1<InlineCodeContentNode, Unit> onTapInlineCode;

    @NotNull
    private final Function1<LinkContentNode, Unit> onTapLink;

    @NotNull
    private final Function6 onTapMention;

    @NotNull
    private final Function1<SoundmojiContentNode, Unit> onTapSoundmoji;

    @NotNull
    private final Function0<Unit> onTapSpoiler;

    @NotNull
    private final Function1<String, Unit> onTapTimestamp;

    @NotNull
    private final Paint paint;
    private final boolean shouldOmitTopAndBottomHeadingSpacerNewLine;
    private final boolean shouldShowRoleDot;
    private final boolean shouldShowRoleOnName;
    private final boolean showLinkDecorations;
    private final boolean singleLine;

    @NotNull
    private final SpoilerState spoilerState;

    @NotNull
    private final DiscordThemeObject theme;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/discord/chat/presentation/textutils/RenderContext$Insets;", "", ViewProps.TOP, "", ViewProps.BOTTOM, ViewProps.START, ViewProps.END, "<init>", "(IIII)V", "getTop", "()I", "getBottom", "getStart", "getEnd", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Insets {
        private final int bottom;
        private final int end;
        private final int start;
        private final int top;

        public Insets() {
            this(0, 0, 0, 0, 15, null);
        }

        public static /* synthetic */ Insets copy$default(Insets insets, int i7, int i10, int i11, int i12, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i7 = insets.top;
            }
            if ((i13 & 2) != 0) {
                i10 = insets.bottom;
            }
            if ((i13 & 4) != 0) {
                i11 = insets.start;
            }
            if ((i13 & 8) != 0) {
                i12 = insets.end;
            }
            return insets.copy(i7, i10, i11, i12);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getTop() {
            return this.top;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getBottom() {
            return this.bottom;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getStart() {
            return this.start;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final int getEnd() {
            return this.end;
        }

        @NotNull
        public final Insets copy(int top, int bottom, int start, int end) {
            return new Insets(top, bottom, start, end);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Insets)) {
                return false;
            }
            Insets insets = (Insets) other;
            return this.top == insets.top && this.bottom == insets.bottom && this.start == insets.start && this.end == insets.end;
        }

        public final int getBottom() {
            return this.bottom;
        }

        public final int getEnd() {
            return this.end;
        }

        public final int getStart() {
            return this.start;
        }

        public final int getTop() {
            return this.top;
        }

        public int hashCode() {
            return Integer.hashCode(this.end) + a.u(this.start, a.u(this.bottom, Integer.hashCode(this.top) * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            int i7 = this.top;
            int i10 = this.bottom;
            int i11 = this.start;
            int i12 = this.end;
            StringBuilder sbR = e.r(i7, "Insets(top=", i10, ", bottom=", ", start=");
            sbR.append(i11);
            sbR.append(", end=");
            sbR.append(i12);
            sbR.append(")");
            return sbR.toString();
        }

        public Insets(int i7, int i10, int i11, int i12) {
            this.top = i7;
            this.bottom = i10;
            this.start = i11;
            this.end = i12;
        }

        public /* synthetic */ Insets(int i7, int i10, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? 0 : i7, (i13 & 2) != 0 ? 0 : i10, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/presentation/textutils/RenderContext$SpoilerState;", "", "<init>", "(Ljava/lang/String;I)V", "None", "Hidden", "Revealed", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum SpoilerState {
        None,
        Hidden,
        Revealed;

        private static final /* synthetic */ EnumEntries $ENTRIES = b.l(values());

        @NotNull
        public static EnumEntries getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RenderContext(@NotNull Context context, @NotNull String containerId, @NotNull Function1<? super LinkContentNode, Unit> onTapLink, @NotNull Function1<? super LinkContentNode, Unit> onLongTapLink, @NotNull Function1<? super LinkContentNode, LinkStyle> linkStyle, @NotNull Function3 onTapChannel, @NotNull Function4 onLongPressChannel, @NotNull Function1<? super String, Unit> onTapAttachmentLink, @NotNull Function2<? super String, ? super String, Unit> onLongPressAttachmentLink, @NotNull Function6 onTapMention, @NotNull Function1<? super CommandMentionContentNode, Unit> onTapCommand, @NotNull Function1<? super CommandMentionContentNode, Unit> onLongPressCommand, @NotNull Function1<? super GameMentionContentNode, Unit> onTapGameMention, @NotNull Function0<Unit> onTapSpoiler, @NotNull Function1<? super String, Unit> onTapTimestamp, @NotNull Function1<? super InlineCodeContentNode, Unit> onTapInlineCode, @NotNull Function1<? super EmojiContentNode, Unit> onTapEmoji, @NotNull Function1<? super SoundmojiContentNode, Unit> onTapSoundmoji, boolean z5, boolean z6, boolean z7, boolean z10, boolean z11, @NotNull Paint paint, @NotNull SpoilerState spoilerState, int i7, Long l6, Long l7, boolean z12, @NotNull Insets insets, @NotNull DiscordThemeObject theme, float f2, Float f7, boolean z13) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(containerId, "containerId");
        Intrinsics.checkNotNullParameter(onTapLink, "onTapLink");
        Intrinsics.checkNotNullParameter(onLongTapLink, "onLongTapLink");
        Intrinsics.checkNotNullParameter(linkStyle, "linkStyle");
        Intrinsics.checkNotNullParameter(onTapChannel, "onTapChannel");
        Intrinsics.checkNotNullParameter(onLongPressChannel, "onLongPressChannel");
        Intrinsics.checkNotNullParameter(onTapAttachmentLink, "onTapAttachmentLink");
        Intrinsics.checkNotNullParameter(onLongPressAttachmentLink, "onLongPressAttachmentLink");
        Intrinsics.checkNotNullParameter(onTapMention, "onTapMention");
        Intrinsics.checkNotNullParameter(onTapCommand, "onTapCommand");
        Intrinsics.checkNotNullParameter(onLongPressCommand, "onLongPressCommand");
        Intrinsics.checkNotNullParameter(onTapGameMention, "onTapGameMention");
        Intrinsics.checkNotNullParameter(onTapSpoiler, "onTapSpoiler");
        Intrinsics.checkNotNullParameter(onTapTimestamp, "onTapTimestamp");
        Intrinsics.checkNotNullParameter(onTapInlineCode, "onTapInlineCode");
        Intrinsics.checkNotNullParameter(onTapEmoji, "onTapEmoji");
        Intrinsics.checkNotNullParameter(onTapSoundmoji, "onTapSoundmoji");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Intrinsics.checkNotNullParameter(spoilerState, "spoilerState");
        Intrinsics.checkNotNullParameter(insets, "insets");
        Intrinsics.checkNotNullParameter(theme, "theme");
        this.context = context;
        this.containerId = containerId;
        this.onTapLink = onTapLink;
        this.onLongTapLink = onLongTapLink;
        this.linkStyle = linkStyle;
        this.onTapChannel = onTapChannel;
        this.onLongPressChannel = onLongPressChannel;
        this.onTapAttachmentLink = onTapAttachmentLink;
        this.onLongPressAttachmentLink = onLongPressAttachmentLink;
        this.onTapMention = onTapMention;
        this.onTapCommand = onTapCommand;
        this.onLongPressCommand = onLongPressCommand;
        this.onTapGameMention = onTapGameMention;
        this.onTapSpoiler = onTapSpoiler;
        this.onTapTimestamp = onTapTimestamp;
        this.onTapInlineCode = onTapInlineCode;
        this.onTapEmoji = onTapEmoji;
        this.onTapSoundmoji = onTapSoundmoji;
        this.animateEmoji = z5;
        this.showLinkDecorations = z6;
        this.shouldShowRoleDot = z7;
        this.shouldShowRoleOnName = z10;
        this.singleLine = z11;
        this.paint = paint;
        this.spoilerState = spoilerState;
        this.listNestedLevel = i7;
        this.listOrderedIndex = l6;
        this.listLargestOrderedIndex = l7;
        this.inLink = z12;
        this.insets = insets;
        this.theme = theme;
        this.baselineHeightPx = f2;
        this.emojiBaselineHeightOverridePx = f7;
        this.shouldOmitTopAndBottomHeadingSpacerNewLine = z13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(GameMentionContentNode it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$1(SoundmojiContentNode it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f14616a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RenderContext copy$default(RenderContext renderContext, Context context, String str, Function1 function1, Function1 function2, Function1 function3, Function3 function4, Function4 function5, Function1 function6, Function2 function7, Function6 function8, Function1 function9, Function1 function10, Function1 function11, Function0 function0, Function1 function12, Function1 function13, Function1 function14, Function1 function15, boolean z5, boolean z6, boolean z7, boolean z10, boolean z11, Paint paint, SpoilerState spoilerState, int i7, Long l6, Long l7, boolean z12, Insets insets, DiscordThemeObject discordThemeObject, float f2, Float f7, boolean z13, int i10, int i11, Object obj) {
        boolean z14;
        Float f10;
        Context context2 = (i10 & 1) != 0 ? renderContext.context : context;
        String str2 = (i10 & 2) != 0 ? renderContext.containerId : str;
        Function1 function16 = (i10 & 4) != 0 ? renderContext.onTapLink : function1;
        Function1 function17 = (i10 & 8) != 0 ? renderContext.onLongTapLink : function2;
        Function1 function18 = (i10 & 16) != 0 ? renderContext.linkStyle : function3;
        Function3 function19 = (i10 & 32) != 0 ? renderContext.onTapChannel : function4;
        Function4 function20 = (i10 & 64) != 0 ? renderContext.onLongPressChannel : function5;
        Function1 function21 = (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? renderContext.onTapAttachmentLink : function6;
        Function2 function22 = (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? renderContext.onLongPressAttachmentLink : function7;
        Function6 function23 = (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? renderContext.onTapMention : function8;
        Function1 function24 = (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? renderContext.onTapCommand : function9;
        Function1 function25 = (i10 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? renderContext.onLongPressCommand : function10;
        Function1 function26 = (i10 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? renderContext.onTapGameMention : function11;
        Function0 function27 = (i10 & 8192) != 0 ? renderContext.onTapSpoiler : function0;
        Context context3 = context2;
        Function1 function28 = (i10 & 16384) != 0 ? renderContext.onTapTimestamp : function12;
        Function1 function29 = (i10 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? renderContext.onTapInlineCode : function13;
        Function1 function30 = (i10 & 65536) != 0 ? renderContext.onTapEmoji : function14;
        Function1 function31 = (i10 & 131072) != 0 ? renderContext.onTapSoundmoji : function15;
        boolean z15 = (i10 & 262144) != 0 ? renderContext.animateEmoji : z5;
        boolean z16 = (i10 & 524288) != 0 ? renderContext.showLinkDecorations : z6;
        boolean z17 = (i10 & 1048576) != 0 ? renderContext.shouldShowRoleDot : z7;
        boolean z18 = (i10 & 2097152) != 0 ? renderContext.shouldShowRoleOnName : z10;
        boolean z19 = (i10 & 4194304) != 0 ? renderContext.singleLine : z11;
        Paint paint2 = (i10 & 8388608) != 0 ? renderContext.paint : paint;
        SpoilerState spoilerState2 = (i10 & PointerEventHelper.X_FLAG_SUPPORTS_HOVER) != 0 ? renderContext.spoilerState : spoilerState;
        int i12 = (i10 & 33554432) != 0 ? renderContext.listNestedLevel : i7;
        Long l10 = (i10 & 67108864) != 0 ? renderContext.listOrderedIndex : l6;
        Long l11 = (i10 & 134217728) != 0 ? renderContext.listLargestOrderedIndex : l7;
        boolean z20 = (i10 & 268435456) != 0 ? renderContext.inLink : z12;
        Insets insets2 = (i10 & 536870912) != 0 ? renderContext.insets : insets;
        DiscordThemeObject discordThemeObject2 = (i10 & 1073741824) != 0 ? renderContext.theme : discordThemeObject;
        float f11 = (i10 & Integer.MIN_VALUE) != 0 ? renderContext.baselineHeightPx : f2;
        Float f12 = (i11 & 1) != 0 ? renderContext.emojiBaselineHeightOverridePx : f7;
        if ((i11 & 2) != 0) {
            f10 = f12;
            z14 = renderContext.shouldOmitTopAndBottomHeadingSpacerNewLine;
        } else {
            z14 = z13;
            f10 = f12;
        }
        return renderContext.copy(context3, str2, function16, function17, function18, function19, function20, function21, function22, function23, function24, function25, function26, function27, function28, function29, function30, function31, z15, z16, z17, z18, z19, paint2, spoilerState2, i12, l10, l11, z20, insets2, discordThemeObject2, f11, f10, z14);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Function6 getOnTapMention() {
        return this.onTapMention;
    }

    @NotNull
    public final Function1<CommandMentionContentNode, Unit> component11() {
        return this.onTapCommand;
    }

    @NotNull
    public final Function1<CommandMentionContentNode, Unit> component12() {
        return this.onLongPressCommand;
    }

    @NotNull
    public final Function1<GameMentionContentNode, Unit> component13() {
        return this.onTapGameMention;
    }

    @NotNull
    public final Function0<Unit> component14() {
        return this.onTapSpoiler;
    }

    @NotNull
    public final Function1<String, Unit> component15() {
        return this.onTapTimestamp;
    }

    @NotNull
    public final Function1<InlineCodeContentNode, Unit> component16() {
        return this.onTapInlineCode;
    }

    @NotNull
    public final Function1<EmojiContentNode, Unit> component17() {
        return this.onTapEmoji;
    }

    @NotNull
    public final Function1<SoundmojiContentNode, Unit> component18() {
        return this.onTapSoundmoji;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final boolean getAnimateEmoji() {
        return this.animateEmoji;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getContainerId() {
        return this.containerId;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final boolean getShowLinkDecorations() {
        return this.showLinkDecorations;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final boolean getShouldShowRoleDot() {
        return this.shouldShowRoleDot;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final boolean getShouldShowRoleOnName() {
        return this.shouldShowRoleOnName;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final boolean getSingleLine() {
        return this.singleLine;
    }

    @NotNull
    /* JADX INFO: renamed from: component24, reason: from getter */
    public final Paint getPaint() {
        return this.paint;
    }

    @NotNull
    /* JADX INFO: renamed from: component25, reason: from getter */
    public final SpoilerState getSpoilerState() {
        return this.spoilerState;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final int getListNestedLevel() {
        return this.listNestedLevel;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final Long getListOrderedIndex() {
        return this.listOrderedIndex;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final Long getListLargestOrderedIndex() {
        return this.listLargestOrderedIndex;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final boolean getInLink() {
        return this.inLink;
    }

    @NotNull
    public final Function1<LinkContentNode, Unit> component3() {
        return this.onTapLink;
    }

    @NotNull
    /* JADX INFO: renamed from: component30, reason: from getter */
    public final Insets getInsets() {
        return this.insets;
    }

    @NotNull
    /* JADX INFO: renamed from: component31, reason: from getter */
    public final DiscordThemeObject getTheme() {
        return this.theme;
    }

    /* JADX INFO: renamed from: component32, reason: from getter */
    public final float getBaselineHeightPx() {
        return this.baselineHeightPx;
    }

    /* JADX INFO: renamed from: component33, reason: from getter */
    public final Float getEmojiBaselineHeightOverridePx() {
        return this.emojiBaselineHeightOverridePx;
    }

    /* JADX INFO: renamed from: component34, reason: from getter */
    public final boolean getShouldOmitTopAndBottomHeadingSpacerNewLine() {
        return this.shouldOmitTopAndBottomHeadingSpacerNewLine;
    }

    @NotNull
    public final Function1<LinkContentNode, Unit> component4() {
        return this.onLongTapLink;
    }

    @NotNull
    public final Function1<LinkContentNode, LinkStyle> component5() {
        return this.linkStyle;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Function3 getOnTapChannel() {
        return this.onTapChannel;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Function4 getOnLongPressChannel() {
        return this.onLongPressChannel;
    }

    @NotNull
    public final Function1<String, Unit> component8() {
        return this.onTapAttachmentLink;
    }

    @NotNull
    public final Function2<String, String, Unit> component9() {
        return this.onLongPressAttachmentLink;
    }

    @NotNull
    public final RenderContext copy(@NotNull Context context, @NotNull String containerId, @NotNull Function1<? super LinkContentNode, Unit> onTapLink, @NotNull Function1<? super LinkContentNode, Unit> onLongTapLink, @NotNull Function1<? super LinkContentNode, LinkStyle> linkStyle, @NotNull Function3 onTapChannel, @NotNull Function4 onLongPressChannel, @NotNull Function1<? super String, Unit> onTapAttachmentLink, @NotNull Function2<? super String, ? super String, Unit> onLongPressAttachmentLink, @NotNull Function6 onTapMention, @NotNull Function1<? super CommandMentionContentNode, Unit> onTapCommand, @NotNull Function1<? super CommandMentionContentNode, Unit> onLongPressCommand, @NotNull Function1<? super GameMentionContentNode, Unit> onTapGameMention, @NotNull Function0<Unit> onTapSpoiler, @NotNull Function1<? super String, Unit> onTapTimestamp, @NotNull Function1<? super InlineCodeContentNode, Unit> onTapInlineCode, @NotNull Function1<? super EmojiContentNode, Unit> onTapEmoji, @NotNull Function1<? super SoundmojiContentNode, Unit> onTapSoundmoji, boolean animateEmoji, boolean showLinkDecorations, boolean shouldShowRoleDot, boolean shouldShowRoleOnName, boolean singleLine, @NotNull Paint paint, @NotNull SpoilerState spoilerState, int listNestedLevel, Long listOrderedIndex, Long listLargestOrderedIndex, boolean inLink, @NotNull Insets insets, @NotNull DiscordThemeObject theme, float baselineHeightPx, Float emojiBaselineHeightOverridePx, boolean shouldOmitTopAndBottomHeadingSpacerNewLine) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(containerId, "containerId");
        Intrinsics.checkNotNullParameter(onTapLink, "onTapLink");
        Intrinsics.checkNotNullParameter(onLongTapLink, "onLongTapLink");
        Intrinsics.checkNotNullParameter(linkStyle, "linkStyle");
        Intrinsics.checkNotNullParameter(onTapChannel, "onTapChannel");
        Intrinsics.checkNotNullParameter(onLongPressChannel, "onLongPressChannel");
        Intrinsics.checkNotNullParameter(onTapAttachmentLink, "onTapAttachmentLink");
        Intrinsics.checkNotNullParameter(onLongPressAttachmentLink, "onLongPressAttachmentLink");
        Intrinsics.checkNotNullParameter(onTapMention, "onTapMention");
        Intrinsics.checkNotNullParameter(onTapCommand, "onTapCommand");
        Intrinsics.checkNotNullParameter(onLongPressCommand, "onLongPressCommand");
        Intrinsics.checkNotNullParameter(onTapGameMention, "onTapGameMention");
        Intrinsics.checkNotNullParameter(onTapSpoiler, "onTapSpoiler");
        Intrinsics.checkNotNullParameter(onTapTimestamp, "onTapTimestamp");
        Intrinsics.checkNotNullParameter(onTapInlineCode, "onTapInlineCode");
        Intrinsics.checkNotNullParameter(onTapEmoji, "onTapEmoji");
        Intrinsics.checkNotNullParameter(onTapSoundmoji, "onTapSoundmoji");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Intrinsics.checkNotNullParameter(spoilerState, "spoilerState");
        Intrinsics.checkNotNullParameter(insets, "insets");
        Intrinsics.checkNotNullParameter(theme, "theme");
        return new RenderContext(context, containerId, onTapLink, onLongTapLink, linkStyle, onTapChannel, onLongPressChannel, onTapAttachmentLink, onLongPressAttachmentLink, onTapMention, onTapCommand, onLongPressCommand, onTapGameMention, onTapSpoiler, onTapTimestamp, onTapInlineCode, onTapEmoji, onTapSoundmoji, animateEmoji, showLinkDecorations, shouldShowRoleDot, shouldShowRoleOnName, singleLine, paint, spoilerState, listNestedLevel, listOrderedIndex, listLargestOrderedIndex, inLink, insets, theme, baselineHeightPx, emojiBaselineHeightOverridePx, shouldOmitTopAndBottomHeadingSpacerNewLine);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RenderContext)) {
            return false;
        }
        RenderContext renderContext = (RenderContext) other;
        return Intrinsics.areEqual(this.context, renderContext.context) && Intrinsics.areEqual(this.containerId, renderContext.containerId) && Intrinsics.areEqual(this.onTapLink, renderContext.onTapLink) && Intrinsics.areEqual(this.onLongTapLink, renderContext.onLongTapLink) && Intrinsics.areEqual(this.linkStyle, renderContext.linkStyle) && Intrinsics.areEqual(this.onTapChannel, renderContext.onTapChannel) && Intrinsics.areEqual(this.onLongPressChannel, renderContext.onLongPressChannel) && Intrinsics.areEqual(this.onTapAttachmentLink, renderContext.onTapAttachmentLink) && Intrinsics.areEqual(this.onLongPressAttachmentLink, renderContext.onLongPressAttachmentLink) && Intrinsics.areEqual(this.onTapMention, renderContext.onTapMention) && Intrinsics.areEqual(this.onTapCommand, renderContext.onTapCommand) && Intrinsics.areEqual(this.onLongPressCommand, renderContext.onLongPressCommand) && Intrinsics.areEqual(this.onTapGameMention, renderContext.onTapGameMention) && Intrinsics.areEqual(this.onTapSpoiler, renderContext.onTapSpoiler) && Intrinsics.areEqual(this.onTapTimestamp, renderContext.onTapTimestamp) && Intrinsics.areEqual(this.onTapInlineCode, renderContext.onTapInlineCode) && Intrinsics.areEqual(this.onTapEmoji, renderContext.onTapEmoji) && Intrinsics.areEqual(this.onTapSoundmoji, renderContext.onTapSoundmoji) && this.animateEmoji == renderContext.animateEmoji && this.showLinkDecorations == renderContext.showLinkDecorations && this.shouldShowRoleDot == renderContext.shouldShowRoleDot && this.shouldShowRoleOnName == renderContext.shouldShowRoleOnName && this.singleLine == renderContext.singleLine && Intrinsics.areEqual(this.paint, renderContext.paint) && this.spoilerState == renderContext.spoilerState && this.listNestedLevel == renderContext.listNestedLevel && Intrinsics.areEqual(this.listOrderedIndex, renderContext.listOrderedIndex) && Intrinsics.areEqual(this.listLargestOrderedIndex, renderContext.listLargestOrderedIndex) && this.inLink == renderContext.inLink && Intrinsics.areEqual(this.insets, renderContext.insets) && Intrinsics.areEqual(this.theme, renderContext.theme) && Float.compare(this.baselineHeightPx, renderContext.baselineHeightPx) == 0 && Intrinsics.areEqual((Object) this.emojiBaselineHeightOverridePx, (Object) renderContext.emojiBaselineHeightOverridePx) && this.shouldOmitTopAndBottomHeadingSpacerNewLine == renderContext.shouldOmitTopAndBottomHeadingSpacerNewLine;
    }

    public final boolean getAnimateEmoji() {
        return this.animateEmoji;
    }

    public final float getBaselineHeightPx() {
        return this.baselineHeightPx;
    }

    @NotNull
    public final String getContainerId() {
        return this.containerId;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    public final Float getEmojiBaselineHeightOverridePx() {
        return this.emojiBaselineHeightOverridePx;
    }

    public final boolean getInLink() {
        return this.inLink;
    }

    @NotNull
    public final Insets getInsets() {
        return this.insets;
    }

    @NotNull
    public final Function1<LinkContentNode, LinkStyle> getLinkStyle() {
        return this.linkStyle;
    }

    public final Long getListLargestOrderedIndex() {
        return this.listLargestOrderedIndex;
    }

    public final int getListNestedLevel() {
        return this.listNestedLevel;
    }

    public final Long getListOrderedIndex() {
        return this.listOrderedIndex;
    }

    @NotNull
    public final Function2<String, String, Unit> getOnLongPressAttachmentLink() {
        return this.onLongPressAttachmentLink;
    }

    @NotNull
    public final Function4 getOnLongPressChannel() {
        return this.onLongPressChannel;
    }

    @NotNull
    public final Function1<CommandMentionContentNode, Unit> getOnLongPressCommand() {
        return this.onLongPressCommand;
    }

    @NotNull
    public final Function1<LinkContentNode, Unit> getOnLongTapLink() {
        return this.onLongTapLink;
    }

    @NotNull
    public final Function1<String, Unit> getOnTapAttachmentLink() {
        return this.onTapAttachmentLink;
    }

    @NotNull
    public final Function3 getOnTapChannel() {
        return this.onTapChannel;
    }

    @NotNull
    public final Function1<CommandMentionContentNode, Unit> getOnTapCommand() {
        return this.onTapCommand;
    }

    @NotNull
    public final Function1<EmojiContentNode, Unit> getOnTapEmoji() {
        return this.onTapEmoji;
    }

    @NotNull
    public final Function1<GameMentionContentNode, Unit> getOnTapGameMention() {
        return this.onTapGameMention;
    }

    @NotNull
    public final Function1<InlineCodeContentNode, Unit> getOnTapInlineCode() {
        return this.onTapInlineCode;
    }

    @NotNull
    public final Function1<LinkContentNode, Unit> getOnTapLink() {
        return this.onTapLink;
    }

    @NotNull
    public final Function6 getOnTapMention() {
        return this.onTapMention;
    }

    @NotNull
    public final Function1<SoundmojiContentNode, Unit> getOnTapSoundmoji() {
        return this.onTapSoundmoji;
    }

    @NotNull
    public final Function0<Unit> getOnTapSpoiler() {
        return this.onTapSpoiler;
    }

    @NotNull
    public final Function1<String, Unit> getOnTapTimestamp() {
        return this.onTapTimestamp;
    }

    @NotNull
    public final Paint getPaint() {
        return this.paint;
    }

    public final boolean getShouldOmitTopAndBottomHeadingSpacerNewLine() {
        return this.shouldOmitTopAndBottomHeadingSpacerNewLine;
    }

    public final boolean getShouldShowRoleDot() {
        return this.shouldShowRoleDot;
    }

    public final boolean getShouldShowRoleOnName() {
        return this.shouldShowRoleOnName;
    }

    public final boolean getShowLinkDecorations() {
        return this.showLinkDecorations;
    }

    public final boolean getSingleLine() {
        return this.singleLine;
    }

    @NotNull
    public final SpoilerState getSpoilerState() {
        return this.spoilerState;
    }

    @NotNull
    public final DiscordThemeObject getTheme() {
        return this.theme;
    }

    public int hashCode() {
        int iU = a.u(this.listNestedLevel, (this.spoilerState.hashCode() + ((this.paint.hashCode() + a.g(a.g(a.g(a.g(a.g(e.e(e.e(e.e(e.e((this.onTapSpoiler.hashCode() + e.e(e.e(e.e((this.onTapMention.hashCode() + ((this.onLongPressAttachmentLink.hashCode() + e.e((this.onLongPressChannel.hashCode() + ((this.onTapChannel.hashCode() + e.e(e.e(e.e(e.d(this.context.hashCode() * 31, 31, this.containerId), 31, this.onTapLink), 31, this.onLongTapLink), 31, this.linkStyle)) * 31)) * 31, 31, this.onTapAttachmentLink)) * 31)) * 31, 31, this.onTapCommand), 31, this.onLongPressCommand), 31, this.onTapGameMention)) * 31, 31, this.onTapTimestamp), 31, this.onTapInlineCode), 31, this.onTapEmoji), 31, this.onTapSoundmoji), 31, this.animateEmoji), 31, this.showLinkDecorations), 31, this.shouldShowRoleDot), 31, this.shouldShowRoleOnName), 31, this.singleLine)) * 31)) * 31, 31);
        Long l6 = this.listOrderedIndex;
        int iHashCode = (iU + (l6 == null ? 0 : l6.hashCode())) * 31;
        Long l7 = this.listLargestOrderedIndex;
        int iA = e.a((this.theme.hashCode() + ((this.insets.hashCode() + a.g((iHashCode + (l7 == null ? 0 : l7.hashCode())) * 31, 31, this.inLink)) * 31)) * 31, 31, this.baselineHeightPx);
        Float f2 = this.emojiBaselineHeightOverridePx;
        return Boolean.hashCode(this.shouldOmitTopAndBottomHeadingSpacerNewLine) + ((iA + (f2 != null ? f2.hashCode() : 0)) * 31);
    }

    public final boolean spoilerExists() {
        return this.spoilerState != SpoilerState.None;
    }

    public final boolean spoilerIsHidden() {
        return this.spoilerState == SpoilerState.Hidden;
    }

    public final boolean spoilerIsRevealed() {
        return this.spoilerState == SpoilerState.Revealed;
    }

    @NotNull
    public String toString() {
        Context context = this.context;
        String str = this.containerId;
        Function1<LinkContentNode, Unit> function1 = this.onTapLink;
        Function1<LinkContentNode, Unit> function2 = this.onLongTapLink;
        Function1<LinkContentNode, LinkStyle> function3 = this.linkStyle;
        Function3 function4 = this.onTapChannel;
        Function4 function5 = this.onLongPressChannel;
        Function1<String, Unit> function6 = this.onTapAttachmentLink;
        Function2<String, String, Unit> function7 = this.onLongPressAttachmentLink;
        Function6 function8 = this.onTapMention;
        Function1<CommandMentionContentNode, Unit> function9 = this.onTapCommand;
        Function1<CommandMentionContentNode, Unit> function10 = this.onLongPressCommand;
        Function1<GameMentionContentNode, Unit> function11 = this.onTapGameMention;
        Function0<Unit> function0 = this.onTapSpoiler;
        Function1<String, Unit> function12 = this.onTapTimestamp;
        Function1<InlineCodeContentNode, Unit> function13 = this.onTapInlineCode;
        Function1<EmojiContentNode, Unit> function14 = this.onTapEmoji;
        Function1<SoundmojiContentNode, Unit> function15 = this.onTapSoundmoji;
        boolean z5 = this.animateEmoji;
        boolean z6 = this.showLinkDecorations;
        boolean z7 = this.shouldShowRoleDot;
        boolean z10 = this.shouldShowRoleOnName;
        boolean z11 = this.singleLine;
        Paint paint = this.paint;
        SpoilerState spoilerState = this.spoilerState;
        int i7 = this.listNestedLevel;
        Long l6 = this.listOrderedIndex;
        Long l7 = this.listLargestOrderedIndex;
        boolean z12 = this.inLink;
        Insets insets = this.insets;
        DiscordThemeObject discordThemeObject = this.theme;
        float f2 = this.baselineHeightPx;
        Float f7 = this.emojiBaselineHeightOverridePx;
        boolean z13 = this.shouldOmitTopAndBottomHeadingSpacerNewLine;
        StringBuilder sb2 = new StringBuilder("RenderContext(context=");
        sb2.append(context);
        sb2.append(", containerId=");
        sb2.append(str);
        sb2.append(", onTapLink=");
        sb2.append(function1);
        sb2.append(", onLongTapLink=");
        sb2.append(function2);
        sb2.append(", linkStyle=");
        sb2.append(function3);
        sb2.append(", onTapChannel=");
        sb2.append(function4);
        sb2.append(", onLongPressChannel=");
        sb2.append(function5);
        sb2.append(", onTapAttachmentLink=");
        sb2.append(function6);
        sb2.append(", onLongPressAttachmentLink=");
        sb2.append(function7);
        sb2.append(", onTapMention=");
        sb2.append(function8);
        sb2.append(", onTapCommand=");
        sb2.append(function9);
        sb2.append(", onLongPressCommand=");
        sb2.append(function10);
        sb2.append(", onTapGameMention=");
        sb2.append(function11);
        sb2.append(", onTapSpoiler=");
        sb2.append(function0);
        sb2.append(", onTapTimestamp=");
        sb2.append(function12);
        sb2.append(", onTapInlineCode=");
        sb2.append(function13);
        sb2.append(", onTapEmoji=");
        sb2.append(function14);
        sb2.append(", onTapSoundmoji=");
        sb2.append(function15);
        sb2.append(", animateEmoji=");
        e.B(sb2, z5, ", showLinkDecorations=", z6, ", shouldShowRoleDot=");
        e.B(sb2, z7, ", shouldShowRoleOnName=", z10, ", singleLine=");
        sb2.append(z11);
        sb2.append(", paint=");
        sb2.append(paint);
        sb2.append(", spoilerState=");
        sb2.append(spoilerState);
        sb2.append(", listNestedLevel=");
        sb2.append(i7);
        sb2.append(", listOrderedIndex=");
        sb2.append(l6);
        sb2.append(", listLargestOrderedIndex=");
        sb2.append(l7);
        sb2.append(", inLink=");
        sb2.append(z12);
        sb2.append(", insets=");
        sb2.append(insets);
        sb2.append(", theme=");
        sb2.append(discordThemeObject);
        sb2.append(", baselineHeightPx=");
        sb2.append(f2);
        sb2.append(", emojiBaselineHeightOverridePx=");
        sb2.append(f7);
        sb2.append(", shouldOmitTopAndBottomHeadingSpacerNewLine=");
        sb2.append(z13);
        sb2.append(")");
        return sb2.toString();
    }

    @NotNull
    public final RenderContext updateInsets(@NotNull Function1<? super Insets, Insets> update) {
        Intrinsics.checkNotNullParameter(update, "update");
        return copy$default(this, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, null, null, 0, null, null, false, (Insets) update.invoke(this.insets), null, 0.0f, null, false, -536870913, 3, null);
    }

    public /* synthetic */ RenderContext(Context context, String str, Function1 function1, Function1 function2, Function1 function3, Function3 function4, Function4 function5, Function1 function6, Function2 function7, Function6 function8, Function1 function9, Function1 function10, Function1 function11, Function0 function0, Function1 function12, Function1 function13, Function1 function14, Function1 function15, boolean z5, boolean z6, boolean z7, boolean z10, boolean z11, Paint paint, SpoilerState spoilerState, int i7, Long l6, Long l7, boolean z12, Insets insets, DiscordThemeObject discordThemeObject, float f2, Float f7, boolean z13, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, function1, function2, function3, function4, function5, function6, function7, function8, function9, function10, (i10 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? new f6.a(18) : function11, function0, function12, function13, function14, (131072 & i10) != 0 ? new f6.a(19) : function15, z5, z6, z7, z10, z11, paint, (16777216 & i10) != 0 ? SpoilerState.None : spoilerState, (33554432 & i10) != 0 ? 0 : i7, (67108864 & i10) != 0 ? null : l6, (134217728 & i10) != 0 ? null : l7, (268435456 & i10) != 0 ? false : z12, (536870912 & i10) != 0 ? new Insets(0, 0, 0, 0, 15, null) : insets, discordThemeObject, (i10 & Integer.MIN_VALUE) != 0 ? -1.0f : f2, (i11 & 1) != 0 ? null : f7, (i11 & 2) != 0 ? false : z13);
    }
}
