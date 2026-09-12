package com.discord.theme;

import android.content.res.Resources;
import com.discord.theme.DarkThemeExperiment;
import com.discord.theme.utils.ColorUtilsKt;
import f8.h;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rn.l;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0003\b¦\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u00060\u0005R\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u000f\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0012\u0010\u000bR\u001b\u0010\u0014\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\r\u001a\u0004\b\u0015\u0010\u000bR\u001b\u0010\u0017\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\r\u001a\u0004\b\u0018\u0010\u000bR\u001b\u0010\u001a\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\r\u001a\u0004\b\u001b\u0010\u000bR\u001b\u0010\u001d\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\r\u001a\u0004\b\u001e\u0010\u000bR\u001b\u0010 \u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\r\u001a\u0004\b!\u0010\u000bR\u001b\u0010#\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\r\u001a\u0004\b$\u0010\u000bR\u001b\u0010&\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\r\u001a\u0004\b'\u0010\u000bR\u001b\u0010)\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\r\u001a\u0004\b*\u0010\u000bR\u001b\u0010,\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\r\u001a\u0004\b-\u0010\u000bR\u001b\u0010/\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b1\u0010\r\u001a\u0004\b0\u0010\u000bR\u001b\u00102\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b4\u0010\r\u001a\u0004\b3\u0010\u000bR\u001b\u00105\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b7\u0010\r\u001a\u0004\b6\u0010\u000bR\u001b\u00108\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b:\u0010\r\u001a\u0004\b9\u0010\u000bR\u001b\u0010;\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b=\u0010\r\u001a\u0004\b<\u0010\u000bR\u001b\u0010>\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b@\u0010\r\u001a\u0004\b?\u0010\u000bR\u001b\u0010A\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bC\u0010\r\u001a\u0004\bB\u0010\u000bR\u001b\u0010D\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bF\u0010\r\u001a\u0004\bE\u0010\u000bR\u001b\u0010G\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bI\u0010\r\u001a\u0004\bH\u0010\u000bR\u001b\u0010J\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bL\u0010\r\u001a\u0004\bK\u0010\u000bR\u001b\u0010M\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bO\u0010\r\u001a\u0004\bN\u0010\u000bR\u001b\u0010P\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bR\u0010\r\u001a\u0004\bQ\u0010\u000bR\u001b\u0010S\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bU\u0010\r\u001a\u0004\bT\u0010\u000bR\u001b\u0010V\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bX\u0010\r\u001a\u0004\bW\u0010\u000bR\u001b\u0010Y\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b[\u0010\r\u001a\u0004\bZ\u0010\u000bR\u001b\u0010\\\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b^\u0010\r\u001a\u0004\b]\u0010\u000bR\u001b\u0010_\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\ba\u0010\r\u001a\u0004\b`\u0010\u000bR\u001b\u0010b\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bd\u0010\r\u001a\u0004\bc\u0010\u000bR\u001b\u0010e\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bg\u0010\r\u001a\u0004\bf\u0010\u000bR\u001b\u0010h\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bj\u0010\r\u001a\u0004\bi\u0010\u000bR\u001b\u0010k\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bm\u0010\r\u001a\u0004\bl\u0010\u000bR\u001b\u0010n\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bp\u0010\r\u001a\u0004\bo\u0010\u000bR\u001b\u0010q\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bs\u0010\r\u001a\u0004\br\u0010\u000bR\u001b\u0010t\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bv\u0010\r\u001a\u0004\bu\u0010\u000bR\u001b\u0010w\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\by\u0010\r\u001a\u0004\bx\u0010\u000bR\u001b\u0010z\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b|\u0010\r\u001a\u0004\b{\u0010\u000bR\u001b\u0010}\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u007f\u0010\r\u001a\u0004\b~\u0010\u000bR\u001e\u0010\u0080\u0001\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\b\u0082\u0001\u0010\r\u001a\u0005\b\u0081\u0001\u0010\u000bR\u001e\u0010\u0083\u0001\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\b\u0085\u0001\u0010\r\u001a\u0005\b\u0084\u0001\u0010\u000bR\u001e\u0010\u0086\u0001\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\b\u0088\u0001\u0010\r\u001a\u0005\b\u0087\u0001\u0010\u000bR\u001e\u0010\u0089\u0001\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\b\u008b\u0001\u0010\r\u001a\u0005\b\u008a\u0001\u0010\u000bR\u001e\u0010\u008c\u0001\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\b\u008e\u0001\u0010\r\u001a\u0005\b\u008d\u0001\u0010\u000bR\u001e\u0010\u008f\u0001\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\b\u0091\u0001\u0010\r\u001a\u0005\b\u0090\u0001\u0010\u000bR\u001e\u0010\u0092\u0001\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\b\u0094\u0001\u0010\r\u001a\u0005\b\u0093\u0001\u0010\u000bR\u001e\u0010\u0095\u0001\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\b\u0097\u0001\u0010\r\u001a\u0005\b\u0096\u0001\u0010\u000bR\u001e\u0010\u0098\u0001\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\b\u009a\u0001\u0010\r\u001a\u0005\b\u0099\u0001\u0010\u000bR\u001e\u0010\u009b\u0001\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\b\u009d\u0001\u0010\r\u001a\u0005\b\u009c\u0001\u0010\u000bR\u001e\u0010\u009e\u0001\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\b \u0001\u0010\r\u001a\u0005\b\u009f\u0001\u0010\u000bR\u001e\u0010¡\u0001\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\b£\u0001\u0010\r\u001a\u0005\b¢\u0001\u0010\u000bR\u001e\u0010¤\u0001\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\b¦\u0001\u0010\r\u001a\u0005\b¥\u0001\u0010\u000bR\u001e\u0010§\u0001\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\b©\u0001\u0010\r\u001a\u0005\b¨\u0001\u0010\u000bR\u001e\u0010ª\u0001\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\b¬\u0001\u0010\r\u001a\u0005\b«\u0001\u0010\u000bR\u001e\u0010\u00ad\u0001\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\b¯\u0001\u0010\r\u001a\u0005\b®\u0001\u0010\u000bR\u001e\u0010°\u0001\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\b²\u0001\u0010\r\u001a\u0005\b±\u0001\u0010\u000bR\u001e\u0010³\u0001\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\bµ\u0001\u0010\r\u001a\u0005\b´\u0001\u0010\u000bR\u001e\u0010¶\u0001\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\b¸\u0001\u0010\r\u001a\u0005\b·\u0001\u0010\u000bR\u001e\u0010¹\u0001\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\b»\u0001\u0010\r\u001a\u0005\bº\u0001\u0010\u000bR\u001e\u0010¼\u0001\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\b¾\u0001\u0010\r\u001a\u0005\b½\u0001\u0010\u000bR\u001e\u0010¿\u0001\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\bÁ\u0001\u0010\r\u001a\u0005\bÀ\u0001\u0010\u000bR\u001e\u0010Â\u0001\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\bÄ\u0001\u0010\r\u001a\u0005\bÃ\u0001\u0010\u000bR\u001e\u0010Å\u0001\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\bÇ\u0001\u0010\r\u001a\u0005\bÆ\u0001\u0010\u000bR\u001e\u0010È\u0001\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\bÊ\u0001\u0010\r\u001a\u0005\bÉ\u0001\u0010\u000bR\u001e\u0010Ë\u0001\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\bÍ\u0001\u0010\r\u001a\u0005\bÌ\u0001\u0010\u000bR\u001e\u0010Î\u0001\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\bÐ\u0001\u0010\r\u001a\u0005\bÏ\u0001\u0010\u000bR\u001e\u0010Ñ\u0001\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\bÓ\u0001\u0010\r\u001a\u0005\bÒ\u0001\u0010\u000bR\u001e\u0010Ô\u0001\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\bÖ\u0001\u0010\r\u001a\u0005\bÕ\u0001\u0010\u000bR\u001e\u0010×\u0001\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\bÙ\u0001\u0010\r\u001a\u0005\bØ\u0001\u0010\u000bR\u001e\u0010Ú\u0001\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\bÜ\u0001\u0010\r\u001a\u0005\bÛ\u0001\u0010\u000bR\u001e\u0010Ý\u0001\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\bß\u0001\u0010\r\u001a\u0005\bÞ\u0001\u0010\u000bR\u001e\u0010à\u0001\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\bâ\u0001\u0010\r\u001a\u0005\bá\u0001\u0010\u000bR\u001e\u0010ã\u0001\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\bå\u0001\u0010\r\u001a\u0005\bä\u0001\u0010\u000bR\u001e\u0010æ\u0001\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\bè\u0001\u0010\r\u001a\u0005\bç\u0001\u0010\u000bR\u001e\u0010é\u0001\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\bë\u0001\u0010\r\u001a\u0005\bê\u0001\u0010\u000bR\u001e\u0010ì\u0001\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\bî\u0001\u0010\r\u001a\u0005\bí\u0001\u0010\u000bR\u001e\u0010ï\u0001\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\bñ\u0001\u0010\r\u001a\u0005\bð\u0001\u0010\u000bR\u001e\u0010ò\u0001\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\bô\u0001\u0010\r\u001a\u0005\bó\u0001\u0010\u000bR\u001e\u0010õ\u0001\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\b÷\u0001\u0010\r\u001a\u0005\bö\u0001\u0010\u000bR\u001e\u0010ø\u0001\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\bú\u0001\u0010\r\u001a\u0005\bù\u0001\u0010\u000bR\u001e\u0010û\u0001\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\bý\u0001\u0010\r\u001a\u0005\bü\u0001\u0010\u000bR\u001e\u0010þ\u0001\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\b\u0080\u0002\u0010\r\u001a\u0005\bÿ\u0001\u0010\u000bR\u001e\u0010\u0081\u0002\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\b\u0083\u0002\u0010\r\u001a\u0005\b\u0082\u0002\u0010\u000bR\u001e\u0010\u0084\u0002\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\b\u0086\u0002\u0010\r\u001a\u0005\b\u0085\u0002\u0010\u000bR\u001e\u0010\u0087\u0002\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\b\u0089\u0002\u0010\r\u001a\u0005\b\u0088\u0002\u0010\u000bR\u001e\u0010\u008a\u0002\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\b\u008c\u0002\u0010\r\u001a\u0005\b\u008b\u0002\u0010\u000bR\u001e\u0010\u008d\u0002\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\b\u008f\u0002\u0010\r\u001a\u0005\b\u008e\u0002\u0010\u000bR\u001e\u0010\u0090\u0002\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\b\u0092\u0002\u0010\r\u001a\u0005\b\u0091\u0002\u0010\u000bR\u001e\u0010\u0093\u0002\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\b\u0095\u0002\u0010\r\u001a\u0005\b\u0094\u0002\u0010\u000bR\u001e\u0010\u0096\u0002\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\b\u0098\u0002\u0010\r\u001a\u0005\b\u0097\u0002\u0010\u000bR\u001e\u0010\u0099\u0002\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\b\u009b\u0002\u0010\r\u001a\u0005\b\u009a\u0002\u0010\u000bR\u001e\u0010\u009c\u0002\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\b\u009e\u0002\u0010\r\u001a\u0005\b\u009d\u0002\u0010\u000bR\u001e\u0010\u009f\u0002\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\b¡\u0002\u0010\r\u001a\u0005\b \u0002\u0010\u000bR\u001e\u0010¢\u0002\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\b¤\u0002\u0010\r\u001a\u0005\b£\u0002\u0010\u000bR\u001e\u0010¥\u0002\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\b§\u0002\u0010\r\u001a\u0005\b¦\u0002\u0010\u000bR\u001e\u0010¨\u0002\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\bª\u0002\u0010\r\u001a\u0005\b©\u0002\u0010\u000bR\u001e\u0010«\u0002\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\b\u00ad\u0002\u0010\r\u001a\u0005\b¬\u0002\u0010\u000bR\u001e\u0010®\u0002\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\b°\u0002\u0010\r\u001a\u0005\b¯\u0002\u0010\u000bR\u001e\u0010±\u0002\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\b³\u0002\u0010\r\u001a\u0005\b²\u0002\u0010\u000bR\u001e\u0010´\u0002\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\b¶\u0002\u0010\r\u001a\u0005\bµ\u0002\u0010\u000bR\u001e\u0010·\u0002\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\b¹\u0002\u0010\r\u001a\u0005\b¸\u0002\u0010\u000bR\u001e\u0010º\u0002\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\b¼\u0002\u0010\r\u001a\u0005\b»\u0002\u0010\u000bR\u001e\u0010½\u0002\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\b¿\u0002\u0010\r\u001a\u0005\b¾\u0002\u0010\u000bR\u001e\u0010À\u0002\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\bÂ\u0002\u0010\r\u001a\u0005\bÁ\u0002\u0010\u000bR\u001e\u0010Ã\u0002\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\bÅ\u0002\u0010\r\u001a\u0005\bÄ\u0002\u0010\u000bR\u001e\u0010Æ\u0002\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\bÈ\u0002\u0010\r\u001a\u0005\bÇ\u0002\u0010\u000bR\u001e\u0010É\u0002\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\bË\u0002\u0010\r\u001a\u0005\bÊ\u0002\u0010\u000bR\u001e\u0010Ì\u0002\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\bÎ\u0002\u0010\r\u001a\u0005\bÍ\u0002\u0010\u000bR\u001e\u0010Ï\u0002\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\bÑ\u0002\u0010\r\u001a\u0005\bÐ\u0002\u0010\u000bR\u001e\u0010Ò\u0002\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\bÔ\u0002\u0010\r\u001a\u0005\bÓ\u0002\u0010\u000bR\u001e\u0010Õ\u0002\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\b×\u0002\u0010\r\u001a\u0005\bÖ\u0002\u0010\u000bR\u001e\u0010Ø\u0002\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\bÚ\u0002\u0010\r\u001a\u0005\bÙ\u0002\u0010\u000bR\u001e\u0010Û\u0002\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\bÝ\u0002\u0010\r\u001a\u0005\bÜ\u0002\u0010\u000bR\u001e\u0010Þ\u0002\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\bà\u0002\u0010\r\u001a\u0005\bß\u0002\u0010\u000bR\u001e\u0010á\u0002\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\bã\u0002\u0010\r\u001a\u0005\bâ\u0002\u0010\u000bR\u001e\u0010ä\u0002\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\bæ\u0002\u0010\r\u001a\u0005\bå\u0002\u0010\u000bR\u001e\u0010ç\u0002\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\bé\u0002\u0010\r\u001a\u0005\bè\u0002\u0010\u000bR\u001e\u0010ê\u0002\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\bì\u0002\u0010\r\u001a\u0005\bë\u0002\u0010\u000bR\u001e\u0010í\u0002\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\bï\u0002\u0010\r\u001a\u0005\bî\u0002\u0010\u000bR\u001e\u0010ð\u0002\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\bò\u0002\u0010\r\u001a\u0005\bñ\u0002\u0010\u000bR\u001e\u0010ó\u0002\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\bõ\u0002\u0010\r\u001a\u0005\bô\u0002\u0010\u000bR\u001e\u0010ö\u0002\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\bø\u0002\u0010\r\u001a\u0005\b÷\u0002\u0010\u000bR\u001e\u0010ù\u0002\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\bû\u0002\u0010\r\u001a\u0005\bú\u0002\u0010\u000bR\u001e\u0010ü\u0002\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\bþ\u0002\u0010\r\u001a\u0005\bý\u0002\u0010\u000bR\u001e\u0010ÿ\u0002\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\b\u0081\u0003\u0010\r\u001a\u0005\b\u0080\u0003\u0010\u000bR\u001e\u0010\u0082\u0003\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\b\u0084\u0003\u0010\r\u001a\u0005\b\u0083\u0003\u0010\u000bR\u001e\u0010\u0085\u0003\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\b\u0087\u0003\u0010\r\u001a\u0005\b\u0086\u0003\u0010\u000bR\u001e\u0010\u0088\u0003\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\b\u008a\u0003\u0010\r\u001a\u0005\b\u0089\u0003\u0010\u000bR\u001e\u0010\u008b\u0003\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\b\u008d\u0003\u0010\r\u001a\u0005\b\u008c\u0003\u0010\u000bR\u001e\u0010\u008e\u0003\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\b\u0090\u0003\u0010\r\u001a\u0005\b\u008f\u0003\u0010\u000bR\u001e\u0010\u0091\u0003\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\b\u0093\u0003\u0010\r\u001a\u0005\b\u0092\u0003\u0010\u000bR\u001e\u0010\u0094\u0003\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\b\u0096\u0003\u0010\r\u001a\u0005\b\u0095\u0003\u0010\u000bR\u001e\u0010\u0097\u0003\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\b\u0099\u0003\u0010\r\u001a\u0005\b\u0098\u0003\u0010\u000bR\u001e\u0010\u009a\u0003\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\b\u009c\u0003\u0010\r\u001a\u0005\b\u009b\u0003\u0010\u000bR\u001e\u0010\u009d\u0003\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\b\u009f\u0003\u0010\r\u001a\u0005\b\u009e\u0003\u0010\u000bR\u001e\u0010 \u0003\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\b¢\u0003\u0010\r\u001a\u0005\b¡\u0003\u0010\u000bR\u001e\u0010£\u0003\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\b¥\u0003\u0010\r\u001a\u0005\b¤\u0003\u0010\u000bR\u001e\u0010¦\u0003\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\b¨\u0003\u0010\r\u001a\u0005\b§\u0003\u0010\u000bR\u001e\u0010©\u0003\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\b«\u0003\u0010\r\u001a\u0005\bª\u0003\u0010\u000bR\u001e\u0010¬\u0003\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\b®\u0003\u0010\r\u001a\u0005\b\u00ad\u0003\u0010\u000b¨\u0006¯\u0003"}, d2 = {"Lcom/discord/theme/DarkThemeExperiment;", "Lcom/discord/theme/DarkTheme;", "resources", "Landroid/content/res/Resources;", "theme", "Landroid/content/res/Resources$Theme;", "<init>", "(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;)V", "activityTimebarProgressBackground", "", "getActivityTimebarProgressBackground", "()I", "activityTimebarProgressBackground$delegate", "Lkotlin/Lazy;", "appFrameBorder", "getAppFrameBorder", "appFrameBorder$delegate", "backgroundBaseLow", "getBackgroundBaseLow", "backgroundBaseLow$delegate", "backgroundBaseLower", "getBackgroundBaseLower", "backgroundBaseLower$delegate", "backgroundBaseLowest", "getBackgroundBaseLowest", "backgroundBaseLowest$delegate", "backgroundFeedbackCritical", "getBackgroundFeedbackCritical", "backgroundFeedbackCritical$delegate", "backgroundFeedbackNotification", "getBackgroundFeedbackNotification", "backgroundFeedbackNotification$delegate", "backgroundModNormal", "getBackgroundModNormal", "backgroundModNormal$delegate", "backgroundModStrong", "getBackgroundModStrong", "backgroundModStrong$delegate", "backgroundModSubtle", "getBackgroundModSubtle", "backgroundModSubtle$delegate", "backgroundScrim", "getBackgroundScrim", "backgroundScrim$delegate", "backgroundScrimLightbox", "getBackgroundScrimLightbox", "backgroundScrimLightbox$delegate", "backgroundSurfaceHigh", "getBackgroundSurfaceHigh", "backgroundSurfaceHigh$delegate", "backgroundSurfaceHighest", "getBackgroundSurfaceHighest", "backgroundSurfaceHighest$delegate", "backgroundVoiceMuted", "getBackgroundVoiceMuted", "backgroundVoiceMuted$delegate", "badgeNotificationBackground", "getBadgeNotificationBackground", "badgeNotificationBackground$delegate", "borderStrong", "getBorderStrong", "borderStrong$delegate", "borderSubtle", "getBorderSubtle", "borderSubtle$delegate", "cardBackgroundDefault", "getCardBackgroundDefault", "cardBackgroundDefault$delegate", "cardSecondaryBackgroundActive", "getCardSecondaryBackgroundActive", "cardSecondaryBackgroundActive$delegate", "cardSecondaryBackgroundDefault", "getCardSecondaryBackgroundDefault", "cardSecondaryBackgroundDefault$delegate", "channelBackgroundDefault", "getChannelBackgroundDefault", "channelBackgroundDefault$delegate", "chatInputActionButtonBackground", "getChatInputActionButtonBackground", "chatInputActionButtonBackground$delegate", "chatInputActionButtonIconDefaultTint", "getChatInputActionButtonIconDefaultTint", "chatInputActionButtonIconDefaultTint$delegate", "chatInputActionIconActiveTint", "getChatInputActionIconActiveTint", "chatInputActionIconActiveTint$delegate", "chatInputBackground", "getChatInputBackground", "chatInputBackground$delegate", "chatInputIconDefaultTint", "getChatInputIconDefaultTint", "chatInputIconDefaultTint$delegate", "chatInputSendButtonActiveBackground", "getChatInputSendButtonActiveBackground", "chatInputSendButtonActiveBackground$delegate", "chatInputSendButtonIconActiveTint", "getChatInputSendButtonIconActiveTint", "chatInputSendButtonIconActiveTint$delegate", "checkboxBackgroundDefault", "getCheckboxBackgroundDefault", "checkboxBackgroundDefault$delegate", "checkboxBackgroundSelectedDefault", "getCheckboxBackgroundSelectedDefault", "checkboxBackgroundSelectedDefault$delegate", "checkboxBorderDefault", "getCheckboxBorderDefault", "checkboxBorderDefault$delegate", "checkboxBorderSelectedDefault", "getCheckboxBorderSelectedDefault", "checkboxBorderSelectedDefault$delegate", "checkboxIconActive", "getCheckboxIconActive", "checkboxIconActive$delegate", "controlConnectedBackgroundActive", "getControlConnectedBackgroundActive", "controlConnectedBackgroundActive$delegate", "controlConnectedBackgroundDefault", "getControlConnectedBackgroundDefault", "controlConnectedBackgroundDefault$delegate", "controlConnectedBorderActive", "getControlConnectedBorderActive", "controlConnectedBorderActive$delegate", "controlConnectedBorderDefault", "getControlConnectedBorderDefault", "controlConnectedBorderDefault$delegate", "controlConnectedTextDefault", "getControlConnectedTextDefault", "controlConnectedTextDefault$delegate", "controlCriticalPrimaryBackgroundActive", "getControlCriticalPrimaryBackgroundActive", "controlCriticalPrimaryBackgroundActive$delegate", "controlCriticalPrimaryBackgroundDefault", "getControlCriticalPrimaryBackgroundDefault", "controlCriticalPrimaryBackgroundDefault$delegate", "controlCriticalPrimaryBorderActive", "getControlCriticalPrimaryBorderActive", "controlCriticalPrimaryBorderActive$delegate", "controlCriticalPrimaryBorderDefault", "getControlCriticalPrimaryBorderDefault", "controlCriticalPrimaryBorderDefault$delegate", "controlCriticalPrimaryTextDefault", "getControlCriticalPrimaryTextDefault", "controlCriticalPrimaryTextDefault$delegate", "controlOverlayPrimaryBackgroundActive", "getControlOverlayPrimaryBackgroundActive", "controlOverlayPrimaryBackgroundActive$delegate", "controlOverlayPrimaryBackgroundDefault", "getControlOverlayPrimaryBackgroundDefault", "controlOverlayPrimaryBackgroundDefault$delegate", "controlOverlayPrimaryBorderDefault", "getControlOverlayPrimaryBorderDefault", "controlOverlayPrimaryBorderDefault$delegate", "controlOverlayPrimaryTextDefault", "getControlOverlayPrimaryTextDefault", "controlOverlayPrimaryTextDefault$delegate", "controlOverlaySecondaryBackgroundActive", "getControlOverlaySecondaryBackgroundActive", "controlOverlaySecondaryBackgroundActive$delegate", "controlOverlaySecondaryBackgroundDefault", "getControlOverlaySecondaryBackgroundDefault", "controlOverlaySecondaryBackgroundDefault$delegate", "controlOverlaySecondaryBorderDefault", "getControlOverlaySecondaryBorderDefault", "controlOverlaySecondaryBorderDefault$delegate", "controlOverlaySecondaryTextDefault", "getControlOverlaySecondaryTextDefault", "controlOverlaySecondaryTextDefault$delegate", "controlPrimaryBackgroundActive", "getControlPrimaryBackgroundActive", "controlPrimaryBackgroundActive$delegate", "controlPrimaryBackgroundDefault", "getControlPrimaryBackgroundDefault", "controlPrimaryBackgroundDefault$delegate", "controlPrimaryBorderActive", "getControlPrimaryBorderActive", "controlPrimaryBorderActive$delegate", "controlPrimaryBorderDefault", "getControlPrimaryBorderDefault", "controlPrimaryBorderDefault$delegate", "controlPrimaryTextDefault", "getControlPrimaryTextDefault", "controlPrimaryTextDefault$delegate", "controlSecondaryBackgroundActive", "getControlSecondaryBackgroundActive", "controlSecondaryBackgroundActive$delegate", "controlSecondaryBackgroundDefault", "getControlSecondaryBackgroundDefault", "controlSecondaryBackgroundDefault$delegate", "controlSecondaryBorderActive", "getControlSecondaryBorderActive", "controlSecondaryBorderActive$delegate", "controlSecondaryBorderDefault", "getControlSecondaryBorderDefault", "controlSecondaryBorderDefault$delegate", "controlSecondaryTextDefault", "getControlSecondaryTextDefault", "controlSecondaryTextDefault$delegate", "embedBackground", "getEmbedBackground", "embedBackground$delegate", "guildFolderBackground", "getGuildFolderBackground", "guildFolderBackground$delegate", "iconFeedbackCritical", "getIconFeedbackCritical", "iconFeedbackCritical$delegate", "iconFeedbackInfo", "getIconFeedbackInfo", "iconFeedbackInfo$delegate", "iconFeedbackNotification", "getIconFeedbackNotification", "iconFeedbackNotification$delegate", "iconFeedbackWarning", "getIconFeedbackWarning", "iconFeedbackWarning$delegate", "inputBackgroundDefault", "getInputBackgroundDefault", "inputBackgroundDefault$delegate", "inputBorderActive", "getInputBorderActive", "inputBorderActive$delegate", "inputBorderDefault", "getInputBorderDefault", "inputBorderDefault$delegate", "inputBorderErrorDefault", "getInputBorderErrorDefault", "inputBorderErrorDefault$delegate", "inputIconDefault", "getInputIconDefault", "inputIconDefault$delegate", "interactiveBackgroundSelected", "getInteractiveBackgroundSelected", "interactiveBackgroundSelected$delegate", "interactiveIconActive", "getInteractiveIconActive", "interactiveIconActive$delegate", "interactiveIconDefault", "getInteractiveIconDefault", "interactiveIconDefault$delegate", "interactiveTextActive", "getInteractiveTextActive", "interactiveTextActive$delegate", "interactiveTextDefault", "getInteractiveTextDefault", "interactiveTextDefault$delegate", "messageHighlightBackgroundDefault", "getMessageHighlightBackgroundDefault", "messageHighlightBackgroundDefault$delegate", "messagesItemChannelTextDefault", "getMessagesItemChannelTextDefault", "messagesItemChannelTextDefault$delegate", "mobileActionsheetBackground", "getMobileActionsheetBackground", "mobileActionsheetBackground$delegate", "mobileChannelItemBackgroundSelected", "getMobileChannelItemBackgroundSelected", "mobileChannelItemBackgroundSelected$delegate", "mobileCoachmarkBorderDefault", "getMobileCoachmarkBorderDefault", "mobileCoachmarkBorderDefault$delegate", "mobileEmbedBackgroundDefault", "getMobileEmbedBackgroundDefault", "mobileEmbedBackgroundDefault$delegate", "mobileEmojiButtonBackground", "getMobileEmojiButtonBackground", "mobileEmojiButtonBackground$delegate", "mobileGuildbarIconBackgroundDefault", "getMobileGuildbarIconBackgroundDefault", "mobileGuildbarIconBackgroundDefault$delegate", "mobileGuildbarIconDefault", "getMobileGuildbarIconDefault", "mobileGuildbarIconDefault$delegate", "mobileHeaderIconDefault", "getMobileHeaderIconDefault", "mobileHeaderIconDefault$delegate", "mobileKeyboardGapBackground", "getMobileKeyboardGapBackground", "mobileKeyboardGapBackground$delegate", "mobileKeyboardPanelBackground", "getMobileKeyboardPanelBackground", "mobileKeyboardPanelBackground$delegate", "mobileSegmentedControlBackground", "getMobileSegmentedControlBackground", "mobileSegmentedControlBackground$delegate", "mobileSegmentedControlIndicatorBackground", "getMobileSegmentedControlIndicatorBackground", "mobileSegmentedControlIndicatorBackground$delegate", "mobileTextHeadingPrimary", "getMobileTextHeadingPrimary", "mobileTextHeadingPrimary$delegate", "mobileThreadEmbedBackground", "getMobileThreadEmbedBackground", "mobileThreadEmbedBackground$delegate", "mobileUnreadbarTextDefault", "getMobileUnreadbarTextDefault", "mobileUnreadbarTextDefault$delegate", "mobileVoicePanelBadgeBackground", "getMobileVoicePanelBadgeBackground", "mobileVoicePanelBadgeBackground$delegate", "progressbarIndicatorBackground", "getProgressbarIndicatorBackground", "progressbarIndicatorBackground$delegate", "radioBorderDefault", "getRadioBorderDefault", "radioBorderDefault$delegate", "reactionBackgroundDefault", "getReactionBackgroundDefault", "reactionBackgroundDefault$delegate", "reactionBackgroundReactedDefault", "getReactionBackgroundReactedDefault", "reactionBackgroundReactedDefault$delegate", "reactionBorderDefault", "getReactionBorderDefault", "reactionBorderDefault$delegate", "reactionBorderReactedDefault", "getReactionBorderReactedDefault", "reactionBorderReactedDefault$delegate", "reactionTextReactedDefault", "getReactionTextReactedDefault", "reactionTextReactedDefault$delegate", "redesignButtonTertiaryBackground", "getRedesignButtonTertiaryBackground", "redesignButtonTertiaryBackground$delegate", "spineDefault", "getSpineDefault", "spineDefault$delegate", "spoilerHiddenBackground", "getSpoilerHiddenBackground", "spoilerHiddenBackground$delegate", "standaloneChannelContentBackground", "getStandaloneChannelContentBackground", "standaloneChannelContentBackground$delegate", "standaloneChannelHeaderBorder", "getStandaloneChannelHeaderBorder", "standaloneChannelHeaderBorder$delegate", "switchBackgroundDefault", "getSwitchBackgroundDefault", "switchBackgroundDefault$delegate", "switchBackgroundSelectedDefault", "getSwitchBackgroundSelectedDefault", "switchBackgroundSelectedDefault$delegate", "switchBorderDefault", "getSwitchBorderDefault", "switchBorderDefault$delegate", "switchBorderSelectedDefault", "getSwitchBorderSelectedDefault", "switchBorderSelectedDefault$delegate", "switchThumbBackgroundDefault", "getSwitchThumbBackgroundDefault", "switchThumbBackgroundDefault$delegate", "switchThumbBackgroundSelectedDefault", "getSwitchThumbBackgroundSelectedDefault", "switchThumbBackgroundSelectedDefault$delegate", "switchThumbIconDefault", "getSwitchThumbIconDefault", "switchThumbIconDefault$delegate", "tabBarBackground", "getTabBarBackground", "tabBarBackground$delegate", "tabLabelTextDefault", "getTabLabelTextDefault", "tabLabelTextDefault$delegate", "tabLabelTextFocused", "getTabLabelTextFocused", "tabLabelTextFocused$delegate", "tablerowBackgroundDefault", "getTablerowBackgroundDefault", "tablerowBackgroundDefault$delegate", "tablerowBackgroundPressed", "getTablerowBackgroundPressed", "tablerowBackgroundPressed$delegate", "tablerowIconColorDefault", "getTablerowIconColorDefault", "tablerowIconColorDefault$delegate", "textBrand", "getTextBrand", "textBrand$delegate", "textDefault", "getTextDefault", "textDefault$delegate", "textFeedbackCritical", "getTextFeedbackCritical", "textFeedbackCritical$delegate", "textFeedbackInfo", "getTextFeedbackInfo", "textFeedbackInfo$delegate", "textFeedbackPositive", "getTextFeedbackPositive", "textFeedbackPositive$delegate", "textFeedbackWarning", "getTextFeedbackWarning", "textFeedbackWarning$delegate", "textMuted", "getTextMuted", "textMuted$delegate", "textStrong", "getTextStrong", "textStrong$delegate", "textSubtle", "getTextSubtle", "textSubtle$delegate", "textVoiceConnected", "getTextVoiceConnected", "textVoiceConnected$delegate", "textVoiceDisconnected", "getTextVoiceDisconnected", "textVoiceDisconnected$delegate", "textVoiceSpeaking", "getTextVoiceSpeaking", "textVoiceSpeaking$delegate", "userProfileAboutMeHeadingText", "getUserProfileAboutMeHeadingText", "userProfileAboutMeHeadingText$delegate", "userProfileContainerBackground", "getUserProfileContainerBackground", "userProfileContainerBackground$delegate", "userProfileGradientBackground", "getUserProfileGradientBackground", "userProfileGradientBackground$delegate", "voiceChannelUserLimitAccentBackground", "getVoiceChannelUserLimitAccentBackground", "voiceChannelUserLimitAccentBackground$delegate", "voiceChannelUserLimitBackground", "getVoiceChannelUserLimitBackground", "voiceChannelUserLimitBackground$delegate", "voiceChannelUserLimitIcon", "getVoiceChannelUserLimitIcon", "voiceChannelUserLimitIcon$delegate", "voiceChannelUserLimitText", "getVoiceChannelUserLimitText", "voiceChannelUserLimitText$delegate", "theme_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DarkThemeExperiment extends DarkTheme {

    /* JADX INFO: renamed from: activityTimebarProgressBackground$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy activityTimebarProgressBackground;

    /* JADX INFO: renamed from: appFrameBorder$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy appFrameBorder;

    /* JADX INFO: renamed from: backgroundBaseLow$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy backgroundBaseLow;

    /* JADX INFO: renamed from: backgroundBaseLower$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy backgroundBaseLower;

    /* JADX INFO: renamed from: backgroundBaseLowest$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy backgroundBaseLowest;

    /* JADX INFO: renamed from: backgroundFeedbackCritical$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy backgroundFeedbackCritical;

    /* JADX INFO: renamed from: backgroundFeedbackNotification$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy backgroundFeedbackNotification;

    /* JADX INFO: renamed from: backgroundModNormal$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy backgroundModNormal;

    /* JADX INFO: renamed from: backgroundModStrong$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy backgroundModStrong;

    /* JADX INFO: renamed from: backgroundModSubtle$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy backgroundModSubtle;

    /* JADX INFO: renamed from: backgroundScrim$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy backgroundScrim;

    /* JADX INFO: renamed from: backgroundScrimLightbox$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy backgroundScrimLightbox;

    /* JADX INFO: renamed from: backgroundSurfaceHigh$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy backgroundSurfaceHigh;

    /* JADX INFO: renamed from: backgroundSurfaceHighest$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy backgroundSurfaceHighest;

    /* JADX INFO: renamed from: backgroundVoiceMuted$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy backgroundVoiceMuted;

    /* JADX INFO: renamed from: badgeNotificationBackground$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy badgeNotificationBackground;

    /* JADX INFO: renamed from: borderStrong$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy borderStrong;

    /* JADX INFO: renamed from: borderSubtle$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy borderSubtle;

    /* JADX INFO: renamed from: cardBackgroundDefault$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy cardBackgroundDefault;

    /* JADX INFO: renamed from: cardSecondaryBackgroundActive$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy cardSecondaryBackgroundActive;

    /* JADX INFO: renamed from: cardSecondaryBackgroundDefault$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy cardSecondaryBackgroundDefault;

    /* JADX INFO: renamed from: channelBackgroundDefault$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy channelBackgroundDefault;

    /* JADX INFO: renamed from: chatInputActionButtonBackground$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy chatInputActionButtonBackground;

    /* JADX INFO: renamed from: chatInputActionButtonIconDefaultTint$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy chatInputActionButtonIconDefaultTint;

    /* JADX INFO: renamed from: chatInputActionIconActiveTint$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy chatInputActionIconActiveTint;

    /* JADX INFO: renamed from: chatInputBackground$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy chatInputBackground;

    /* JADX INFO: renamed from: chatInputIconDefaultTint$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy chatInputIconDefaultTint;

    /* JADX INFO: renamed from: chatInputSendButtonActiveBackground$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy chatInputSendButtonActiveBackground;

    /* JADX INFO: renamed from: chatInputSendButtonIconActiveTint$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy chatInputSendButtonIconActiveTint;

    /* JADX INFO: renamed from: checkboxBackgroundDefault$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy checkboxBackgroundDefault;

    /* JADX INFO: renamed from: checkboxBackgroundSelectedDefault$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy checkboxBackgroundSelectedDefault;

    /* JADX INFO: renamed from: checkboxBorderDefault$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy checkboxBorderDefault;

    /* JADX INFO: renamed from: checkboxBorderSelectedDefault$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy checkboxBorderSelectedDefault;

    /* JADX INFO: renamed from: checkboxIconActive$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy checkboxIconActive;

    /* JADX INFO: renamed from: controlConnectedBackgroundActive$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy controlConnectedBackgroundActive;

    /* JADX INFO: renamed from: controlConnectedBackgroundDefault$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy controlConnectedBackgroundDefault;

    /* JADX INFO: renamed from: controlConnectedBorderActive$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy controlConnectedBorderActive;

    /* JADX INFO: renamed from: controlConnectedBorderDefault$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy controlConnectedBorderDefault;

    /* JADX INFO: renamed from: controlConnectedTextDefault$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy controlConnectedTextDefault;

    /* JADX INFO: renamed from: controlCriticalPrimaryBackgroundActive$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy controlCriticalPrimaryBackgroundActive;

    /* JADX INFO: renamed from: controlCriticalPrimaryBackgroundDefault$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy controlCriticalPrimaryBackgroundDefault;

    /* JADX INFO: renamed from: controlCriticalPrimaryBorderActive$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy controlCriticalPrimaryBorderActive;

    /* JADX INFO: renamed from: controlCriticalPrimaryBorderDefault$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy controlCriticalPrimaryBorderDefault;

    /* JADX INFO: renamed from: controlCriticalPrimaryTextDefault$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy controlCriticalPrimaryTextDefault;

    /* JADX INFO: renamed from: controlOverlayPrimaryBackgroundActive$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy controlOverlayPrimaryBackgroundActive;

    /* JADX INFO: renamed from: controlOverlayPrimaryBackgroundDefault$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy controlOverlayPrimaryBackgroundDefault;

    /* JADX INFO: renamed from: controlOverlayPrimaryBorderDefault$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy controlOverlayPrimaryBorderDefault;

    /* JADX INFO: renamed from: controlOverlayPrimaryTextDefault$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy controlOverlayPrimaryTextDefault;

    /* JADX INFO: renamed from: controlOverlaySecondaryBackgroundActive$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy controlOverlaySecondaryBackgroundActive;

    /* JADX INFO: renamed from: controlOverlaySecondaryBackgroundDefault$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy controlOverlaySecondaryBackgroundDefault;

    /* JADX INFO: renamed from: controlOverlaySecondaryBorderDefault$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy controlOverlaySecondaryBorderDefault;

    /* JADX INFO: renamed from: controlOverlaySecondaryTextDefault$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy controlOverlaySecondaryTextDefault;

    /* JADX INFO: renamed from: controlPrimaryBackgroundActive$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy controlPrimaryBackgroundActive;

    /* JADX INFO: renamed from: controlPrimaryBackgroundDefault$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy controlPrimaryBackgroundDefault;

    /* JADX INFO: renamed from: controlPrimaryBorderActive$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy controlPrimaryBorderActive;

    /* JADX INFO: renamed from: controlPrimaryBorderDefault$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy controlPrimaryBorderDefault;

    /* JADX INFO: renamed from: controlPrimaryTextDefault$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy controlPrimaryTextDefault;

    /* JADX INFO: renamed from: controlSecondaryBackgroundActive$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy controlSecondaryBackgroundActive;

    /* JADX INFO: renamed from: controlSecondaryBackgroundDefault$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy controlSecondaryBackgroundDefault;

    /* JADX INFO: renamed from: controlSecondaryBorderActive$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy controlSecondaryBorderActive;

    /* JADX INFO: renamed from: controlSecondaryBorderDefault$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy controlSecondaryBorderDefault;

    /* JADX INFO: renamed from: controlSecondaryTextDefault$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy controlSecondaryTextDefault;

    /* JADX INFO: renamed from: embedBackground$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy embedBackground;

    /* JADX INFO: renamed from: guildFolderBackground$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy guildFolderBackground;

    /* JADX INFO: renamed from: iconFeedbackCritical$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy iconFeedbackCritical;

    /* JADX INFO: renamed from: iconFeedbackInfo$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy iconFeedbackInfo;

    /* JADX INFO: renamed from: iconFeedbackNotification$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy iconFeedbackNotification;

    /* JADX INFO: renamed from: iconFeedbackWarning$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy iconFeedbackWarning;

    /* JADX INFO: renamed from: inputBackgroundDefault$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy inputBackgroundDefault;

    /* JADX INFO: renamed from: inputBorderActive$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy inputBorderActive;

    /* JADX INFO: renamed from: inputBorderDefault$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy inputBorderDefault;

    /* JADX INFO: renamed from: inputBorderErrorDefault$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy inputBorderErrorDefault;

    /* JADX INFO: renamed from: inputIconDefault$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy inputIconDefault;

    /* JADX INFO: renamed from: interactiveBackgroundSelected$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy interactiveBackgroundSelected;

    /* JADX INFO: renamed from: interactiveIconActive$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy interactiveIconActive;

    /* JADX INFO: renamed from: interactiveIconDefault$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy interactiveIconDefault;

    /* JADX INFO: renamed from: interactiveTextActive$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy interactiveTextActive;

    /* JADX INFO: renamed from: interactiveTextDefault$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy interactiveTextDefault;

    /* JADX INFO: renamed from: messageHighlightBackgroundDefault$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy messageHighlightBackgroundDefault;

    /* JADX INFO: renamed from: messagesItemChannelTextDefault$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy messagesItemChannelTextDefault;

    /* JADX INFO: renamed from: mobileActionsheetBackground$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mobileActionsheetBackground;

    /* JADX INFO: renamed from: mobileChannelItemBackgroundSelected$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mobileChannelItemBackgroundSelected;

    /* JADX INFO: renamed from: mobileCoachmarkBorderDefault$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mobileCoachmarkBorderDefault;

    /* JADX INFO: renamed from: mobileEmbedBackgroundDefault$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mobileEmbedBackgroundDefault;

    /* JADX INFO: renamed from: mobileEmojiButtonBackground$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mobileEmojiButtonBackground;

    /* JADX INFO: renamed from: mobileGuildbarIconBackgroundDefault$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mobileGuildbarIconBackgroundDefault;

    /* JADX INFO: renamed from: mobileGuildbarIconDefault$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mobileGuildbarIconDefault;

    /* JADX INFO: renamed from: mobileHeaderIconDefault$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mobileHeaderIconDefault;

    /* JADX INFO: renamed from: mobileKeyboardGapBackground$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mobileKeyboardGapBackground;

    /* JADX INFO: renamed from: mobileKeyboardPanelBackground$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mobileKeyboardPanelBackground;

    /* JADX INFO: renamed from: mobileSegmentedControlBackground$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mobileSegmentedControlBackground;

    /* JADX INFO: renamed from: mobileSegmentedControlIndicatorBackground$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mobileSegmentedControlIndicatorBackground;

    /* JADX INFO: renamed from: mobileTextHeadingPrimary$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mobileTextHeadingPrimary;

    /* JADX INFO: renamed from: mobileThreadEmbedBackground$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mobileThreadEmbedBackground;

    /* JADX INFO: renamed from: mobileUnreadbarTextDefault$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mobileUnreadbarTextDefault;

    /* JADX INFO: renamed from: mobileVoicePanelBadgeBackground$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mobileVoicePanelBadgeBackground;

    /* JADX INFO: renamed from: progressbarIndicatorBackground$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy progressbarIndicatorBackground;

    /* JADX INFO: renamed from: radioBorderDefault$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy radioBorderDefault;

    /* JADX INFO: renamed from: reactionBackgroundDefault$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy reactionBackgroundDefault;

    /* JADX INFO: renamed from: reactionBackgroundReactedDefault$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy reactionBackgroundReactedDefault;

    /* JADX INFO: renamed from: reactionBorderDefault$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy reactionBorderDefault;

    /* JADX INFO: renamed from: reactionBorderReactedDefault$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy reactionBorderReactedDefault;

    /* JADX INFO: renamed from: reactionTextReactedDefault$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy reactionTextReactedDefault;

    /* JADX INFO: renamed from: redesignButtonTertiaryBackground$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy redesignButtonTertiaryBackground;

    /* JADX INFO: renamed from: spineDefault$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy spineDefault;

    /* JADX INFO: renamed from: spoilerHiddenBackground$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy spoilerHiddenBackground;

    /* JADX INFO: renamed from: standaloneChannelContentBackground$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy standaloneChannelContentBackground;

    /* JADX INFO: renamed from: standaloneChannelHeaderBorder$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy standaloneChannelHeaderBorder;

    /* JADX INFO: renamed from: switchBackgroundDefault$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy switchBackgroundDefault;

    /* JADX INFO: renamed from: switchBackgroundSelectedDefault$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy switchBackgroundSelectedDefault;

    /* JADX INFO: renamed from: switchBorderDefault$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy switchBorderDefault;

    /* JADX INFO: renamed from: switchBorderSelectedDefault$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy switchBorderSelectedDefault;

    /* JADX INFO: renamed from: switchThumbBackgroundDefault$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy switchThumbBackgroundDefault;

    /* JADX INFO: renamed from: switchThumbBackgroundSelectedDefault$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy switchThumbBackgroundSelectedDefault;

    /* JADX INFO: renamed from: switchThumbIconDefault$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy switchThumbIconDefault;

    /* JADX INFO: renamed from: tabBarBackground$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy tabBarBackground;

    /* JADX INFO: renamed from: tabLabelTextDefault$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy tabLabelTextDefault;

    /* JADX INFO: renamed from: tabLabelTextFocused$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy tabLabelTextFocused;

    /* JADX INFO: renamed from: tablerowBackgroundDefault$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy tablerowBackgroundDefault;

    /* JADX INFO: renamed from: tablerowBackgroundPressed$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy tablerowBackgroundPressed;

    /* JADX INFO: renamed from: tablerowIconColorDefault$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy tablerowIconColorDefault;

    /* JADX INFO: renamed from: textBrand$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy textBrand;

    /* JADX INFO: renamed from: textDefault$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy textDefault;

    /* JADX INFO: renamed from: textFeedbackCritical$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy textFeedbackCritical;

    /* JADX INFO: renamed from: textFeedbackInfo$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy textFeedbackInfo;

    /* JADX INFO: renamed from: textFeedbackPositive$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy textFeedbackPositive;

    /* JADX INFO: renamed from: textFeedbackWarning$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy textFeedbackWarning;

    /* JADX INFO: renamed from: textMuted$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy textMuted;

    /* JADX INFO: renamed from: textStrong$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy textStrong;

    /* JADX INFO: renamed from: textSubtle$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy textSubtle;

    /* JADX INFO: renamed from: textVoiceConnected$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy textVoiceConnected;

    /* JADX INFO: renamed from: textVoiceDisconnected$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy textVoiceDisconnected;

    /* JADX INFO: renamed from: textVoiceSpeaking$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy textVoiceSpeaking;

    /* JADX INFO: renamed from: userProfileAboutMeHeadingText$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy userProfileAboutMeHeadingText;

    /* JADX INFO: renamed from: userProfileContainerBackground$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy userProfileContainerBackground;

    /* JADX INFO: renamed from: userProfileGradientBackground$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy userProfileGradientBackground;

    /* JADX INFO: renamed from: voiceChannelUserLimitAccentBackground$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy voiceChannelUserLimitAccentBackground;

    /* JADX INFO: renamed from: voiceChannelUserLimitBackground$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy voiceChannelUserLimitBackground;

    /* JADX INFO: renamed from: voiceChannelUserLimitIcon$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy voiceChannelUserLimitIcon;

    /* JADX INFO: renamed from: voiceChannelUserLimitText$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy voiceChannelUserLimitText;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DarkThemeExperiment(@NotNull final Resources resources, @NotNull final Resources.Theme theme) {
        super(resources, theme);
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(theme, "theme");
        this.activityTimebarProgressBackground = l.b(new h(resources, 3, theme));
        final int i7 = 29;
        this.appFrameBorder = l.b(new Function0() { // from class: f8.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iTextDefault_delegate$lambda$122;
                switch (i7) {
                    case 0:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textDefault_delegate$lambda$122(resources, theme);
                        break;
                    case 1:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackCritical_delegate$lambda$123(resources, theme);
                        break;
                    case 2:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackInfo_delegate$lambda$124(resources, theme);
                        break;
                    case 3:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackPositive_delegate$lambda$125(resources, theme);
                        break;
                    case 4:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackWarning_delegate$lambda$126(resources, theme);
                        break;
                    case 5:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.reactionBorderReactedDefault_delegate$lambda$101(resources, theme);
                        break;
                    case 6:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textMuted_delegate$lambda$127(resources, theme);
                        break;
                    case 7:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textStrong_delegate$lambda$128(resources, theme);
                        break;
                    case 8:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textSubtle_delegate$lambda$129(resources, theme);
                        break;
                    case 9:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.backgroundSurfaceHigh_delegate$lambda$12(resources, theme);
                        break;
                    case 10:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textVoiceConnected_delegate$lambda$130(resources, theme);
                        break;
                    case 11:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textVoiceDisconnected_delegate$lambda$131(resources, theme);
                        break;
                    case 12:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textVoiceSpeaking_delegate$lambda$132(resources, theme);
                        break;
                    case 13:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.userProfileAboutMeHeadingText_delegate$lambda$133(resources, theme);
                        break;
                    case 14:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.userProfileContainerBackground_delegate$lambda$134(resources, theme);
                        break;
                    case 15:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.userProfileGradientBackground_delegate$lambda$135(resources, theme);
                        break;
                    case 16:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.reactionTextReactedDefault_delegate$lambda$102(resources, theme);
                        break;
                    case 17:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitAccentBackground_delegate$lambda$136(resources, theme);
                        break;
                    case 18:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitBackground_delegate$lambda$137(resources, theme);
                        break;
                    case 19:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitIcon_delegate$lambda$138(resources, theme);
                        break;
                    case 20:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitText_delegate$lambda$139(resources, theme);
                        break;
                    case 21:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.backgroundSurfaceHighest_delegate$lambda$13(resources, theme);
                        break;
                    case 22:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.backgroundVoiceMuted_delegate$lambda$14(resources, theme);
                        break;
                    case 23:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.badgeNotificationBackground_delegate$lambda$15(resources, theme);
                        break;
                    case 24:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.borderStrong_delegate$lambda$16(resources, theme);
                        break;
                    case 25:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.borderSubtle_delegate$lambda$17(resources, theme);
                        break;
                    case 26:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.cardBackgroundDefault_delegate$lambda$18(resources, theme);
                        break;
                    case 27:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.redesignButtonTertiaryBackground_delegate$lambda$103(resources, theme);
                        break;
                    case 28:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.cardSecondaryBackgroundActive_delegate$lambda$19(resources, theme);
                        break;
                    default:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.appFrameBorder_delegate$lambda$1(resources, theme);
                        break;
                }
                return Integer.valueOf(iTextDefault_delegate$lambda$122);
            }
        });
        final int i10 = 11;
        this.backgroundBaseLow = l.b(new Function0() { // from class: f8.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iCardSecondaryBackgroundDefault_delegate$lambda$20;
                switch (i10) {
                    case 0:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.cardSecondaryBackgroundDefault_delegate$lambda$20(resources, theme);
                        break;
                    case 1:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.channelBackgroundDefault_delegate$lambda$21(resources, theme);
                        break;
                    case 2:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputActionButtonBackground_delegate$lambda$22(resources, theme);
                        break;
                    case 3:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputActionButtonIconDefaultTint_delegate$lambda$23(resources, theme);
                        break;
                    case 4:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputActionIconActiveTint_delegate$lambda$24(resources, theme);
                        break;
                    case 5:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputBackground_delegate$lambda$25(resources, theme);
                        break;
                    case 6:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputIconDefaultTint_delegate$lambda$26(resources, theme);
                        break;
                    case 7:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputSendButtonActiveBackground_delegate$lambda$27(resources, theme);
                        break;
                    case 8:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.spineDefault_delegate$lambda$104(resources, theme);
                        break;
                    case 9:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputSendButtonIconActiveTint_delegate$lambda$28(resources, theme);
                        break;
                    case 10:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBackgroundDefault_delegate$lambda$29(resources, theme);
                        break;
                    case 11:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.backgroundBaseLow_delegate$lambda$2(resources, theme);
                        break;
                    case 12:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBackgroundSelectedDefault_delegate$lambda$30(resources, theme);
                        break;
                    case 13:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBorderDefault_delegate$lambda$31(resources, theme);
                        break;
                    case 14:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBorderSelectedDefault_delegate$lambda$32(resources, theme);
                        break;
                    case 15:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxIconActive_delegate$lambda$33(resources, theme);
                        break;
                    case 16:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBackgroundActive_delegate$lambda$34(resources, theme);
                        break;
                    case 17:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBackgroundDefault_delegate$lambda$35(resources, theme);
                        break;
                    case 18:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBorderActive_delegate$lambda$36(resources, theme);
                        break;
                    case 19:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.spoilerHiddenBackground_delegate$lambda$105(resources, theme);
                        break;
                    case 20:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBorderDefault_delegate$lambda$37(resources, theme);
                        break;
                    case 21:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedTextDefault_delegate$lambda$38(resources, theme);
                        break;
                    case 22:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBackgroundActive_delegate$lambda$39(resources, theme);
                        break;
                    case 23:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.backgroundBaseLower_delegate$lambda$3(resources, theme);
                        break;
                    case 24:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBackgroundDefault_delegate$lambda$40(resources, theme);
                        break;
                    case 25:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBorderActive_delegate$lambda$41(resources, theme);
                        break;
                    case 26:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBorderDefault_delegate$lambda$42(resources, theme);
                        break;
                    case 27:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryTextDefault_delegate$lambda$43(resources, theme);
                        break;
                    case 28:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlOverlayPrimaryBackgroundActive_delegate$lambda$44(resources, theme);
                        break;
                    default:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlOverlayPrimaryBackgroundDefault_delegate$lambda$45(resources, theme);
                        break;
                }
                return Integer.valueOf(iCardSecondaryBackgroundDefault_delegate$lambda$20);
            }
        });
        final int i11 = 23;
        this.backgroundBaseLower = l.b(new Function0() { // from class: f8.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iCardSecondaryBackgroundDefault_delegate$lambda$20;
                switch (i11) {
                    case 0:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.cardSecondaryBackgroundDefault_delegate$lambda$20(resources, theme);
                        break;
                    case 1:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.channelBackgroundDefault_delegate$lambda$21(resources, theme);
                        break;
                    case 2:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputActionButtonBackground_delegate$lambda$22(resources, theme);
                        break;
                    case 3:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputActionButtonIconDefaultTint_delegate$lambda$23(resources, theme);
                        break;
                    case 4:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputActionIconActiveTint_delegate$lambda$24(resources, theme);
                        break;
                    case 5:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputBackground_delegate$lambda$25(resources, theme);
                        break;
                    case 6:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputIconDefaultTint_delegate$lambda$26(resources, theme);
                        break;
                    case 7:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputSendButtonActiveBackground_delegate$lambda$27(resources, theme);
                        break;
                    case 8:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.spineDefault_delegate$lambda$104(resources, theme);
                        break;
                    case 9:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputSendButtonIconActiveTint_delegate$lambda$28(resources, theme);
                        break;
                    case 10:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBackgroundDefault_delegate$lambda$29(resources, theme);
                        break;
                    case 11:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.backgroundBaseLow_delegate$lambda$2(resources, theme);
                        break;
                    case 12:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBackgroundSelectedDefault_delegate$lambda$30(resources, theme);
                        break;
                    case 13:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBorderDefault_delegate$lambda$31(resources, theme);
                        break;
                    case 14:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBorderSelectedDefault_delegate$lambda$32(resources, theme);
                        break;
                    case 15:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxIconActive_delegate$lambda$33(resources, theme);
                        break;
                    case 16:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBackgroundActive_delegate$lambda$34(resources, theme);
                        break;
                    case 17:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBackgroundDefault_delegate$lambda$35(resources, theme);
                        break;
                    case 18:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBorderActive_delegate$lambda$36(resources, theme);
                        break;
                    case 19:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.spoilerHiddenBackground_delegate$lambda$105(resources, theme);
                        break;
                    case 20:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBorderDefault_delegate$lambda$37(resources, theme);
                        break;
                    case 21:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedTextDefault_delegate$lambda$38(resources, theme);
                        break;
                    case 22:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBackgroundActive_delegate$lambda$39(resources, theme);
                        break;
                    case 23:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.backgroundBaseLower_delegate$lambda$3(resources, theme);
                        break;
                    case 24:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBackgroundDefault_delegate$lambda$40(resources, theme);
                        break;
                    case 25:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBorderActive_delegate$lambda$41(resources, theme);
                        break;
                    case 26:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBorderDefault_delegate$lambda$42(resources, theme);
                        break;
                    case 27:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryTextDefault_delegate$lambda$43(resources, theme);
                        break;
                    case 28:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlOverlayPrimaryBackgroundActive_delegate$lambda$44(resources, theme);
                        break;
                    default:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlOverlayPrimaryBackgroundDefault_delegate$lambda$45(resources, theme);
                        break;
                }
                return Integer.valueOf(iCardSecondaryBackgroundDefault_delegate$lambda$20);
            }
        });
        this.backgroundBaseLowest = l.b(new f8.l(resources, 5, theme));
        this.backgroundFeedbackCritical = l.b(new f8.l(resources, 17, theme));
        this.backgroundFeedbackNotification = l.b(new h(resources, 10, theme));
        this.backgroundModNormal = l.b(new h(resources, 22, theme));
        final int i12 = 4;
        this.backgroundModStrong = l.b(new Function0() { // from class: f8.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iMobileGuildbarIconDefault_delegate$lambda$86;
                switch (i12) {
                    case 0:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileGuildbarIconDefault_delegate$lambda$86(resources, theme);
                        break;
                    case 1:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileHeaderIconDefault_delegate$lambda$87(resources, theme);
                        break;
                    case 2:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileKeyboardGapBackground_delegate$lambda$88(resources, theme);
                        break;
                    case 3:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileKeyboardPanelBackground_delegate$lambda$89(resources, theme);
                        break;
                    case 4:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.backgroundModStrong_delegate$lambda$8(resources, theme);
                        break;
                    case 5:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileSegmentedControlBackground_delegate$lambda$90(resources, theme);
                        break;
                    case 6:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchBorderDefault_delegate$lambda$110(resources, theme);
                        break;
                    case 7:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileSegmentedControlIndicatorBackground_delegate$lambda$91(resources, theme);
                        break;
                    case 8:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileTextHeadingPrimary_delegate$lambda$92(resources, theme);
                        break;
                    case 9:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileThreadEmbedBackground_delegate$lambda$93(resources, theme);
                        break;
                    case 10:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileUnreadbarTextDefault_delegate$lambda$94(resources, theme);
                        break;
                    case 11:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileVoicePanelBadgeBackground_delegate$lambda$95(resources, theme);
                        break;
                    case 12:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.progressbarIndicatorBackground_delegate$lambda$96(resources, theme);
                        break;
                    case 13:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.radioBorderDefault_delegate$lambda$97(resources, theme);
                        break;
                    case 14:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.reactionBackgroundDefault_delegate$lambda$98(resources, theme);
                        break;
                    case 15:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.reactionBackgroundReactedDefault_delegate$lambda$99(resources, theme);
                        break;
                    case 16:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.backgroundModSubtle_delegate$lambda$9(resources, theme);
                        break;
                    case 17:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchBorderSelectedDefault_delegate$lambda$111(resources, theme);
                        break;
                    case 18:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchThumbBackgroundDefault_delegate$lambda$112(resources, theme);
                        break;
                    case 19:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchThumbBackgroundSelectedDefault_delegate$lambda$113(resources, theme);
                        break;
                    case 20:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchThumbIconDefault_delegate$lambda$114(resources, theme);
                        break;
                    case 21:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tabBarBackground_delegate$lambda$115(resources, theme);
                        break;
                    case 22:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tabLabelTextDefault_delegate$lambda$116(resources, theme);
                        break;
                    case 23:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tabLabelTextFocused_delegate$lambda$117(resources, theme);
                        break;
                    case 24:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.reactionBorderDefault_delegate$lambda$100(resources, theme);
                        break;
                    case 25:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tablerowBackgroundDefault_delegate$lambda$118(resources, theme);
                        break;
                    case 26:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tablerowBackgroundPressed_delegate$lambda$119(resources, theme);
                        break;
                    case 27:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.backgroundScrimLightbox_delegate$lambda$11(resources, theme);
                        break;
                    case 28:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tablerowIconColorDefault_delegate$lambda$120(resources, theme);
                        break;
                    default:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.textBrand_delegate$lambda$121(resources, theme);
                        break;
                }
                return Integer.valueOf(iMobileGuildbarIconDefault_delegate$lambda$86);
            }
        });
        final int i13 = 16;
        this.backgroundModSubtle = l.b(new Function0() { // from class: f8.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iMobileGuildbarIconDefault_delegate$lambda$86;
                switch (i13) {
                    case 0:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileGuildbarIconDefault_delegate$lambda$86(resources, theme);
                        break;
                    case 1:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileHeaderIconDefault_delegate$lambda$87(resources, theme);
                        break;
                    case 2:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileKeyboardGapBackground_delegate$lambda$88(resources, theme);
                        break;
                    case 3:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileKeyboardPanelBackground_delegate$lambda$89(resources, theme);
                        break;
                    case 4:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.backgroundModStrong_delegate$lambda$8(resources, theme);
                        break;
                    case 5:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileSegmentedControlBackground_delegate$lambda$90(resources, theme);
                        break;
                    case 6:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchBorderDefault_delegate$lambda$110(resources, theme);
                        break;
                    case 7:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileSegmentedControlIndicatorBackground_delegate$lambda$91(resources, theme);
                        break;
                    case 8:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileTextHeadingPrimary_delegate$lambda$92(resources, theme);
                        break;
                    case 9:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileThreadEmbedBackground_delegate$lambda$93(resources, theme);
                        break;
                    case 10:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileUnreadbarTextDefault_delegate$lambda$94(resources, theme);
                        break;
                    case 11:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileVoicePanelBadgeBackground_delegate$lambda$95(resources, theme);
                        break;
                    case 12:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.progressbarIndicatorBackground_delegate$lambda$96(resources, theme);
                        break;
                    case 13:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.radioBorderDefault_delegate$lambda$97(resources, theme);
                        break;
                    case 14:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.reactionBackgroundDefault_delegate$lambda$98(resources, theme);
                        break;
                    case 15:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.reactionBackgroundReactedDefault_delegate$lambda$99(resources, theme);
                        break;
                    case 16:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.backgroundModSubtle_delegate$lambda$9(resources, theme);
                        break;
                    case 17:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchBorderSelectedDefault_delegate$lambda$111(resources, theme);
                        break;
                    case 18:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchThumbBackgroundDefault_delegate$lambda$112(resources, theme);
                        break;
                    case 19:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchThumbBackgroundSelectedDefault_delegate$lambda$113(resources, theme);
                        break;
                    case 20:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchThumbIconDefault_delegate$lambda$114(resources, theme);
                        break;
                    case 21:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tabBarBackground_delegate$lambda$115(resources, theme);
                        break;
                    case 22:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tabLabelTextDefault_delegate$lambda$116(resources, theme);
                        break;
                    case 23:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tabLabelTextFocused_delegate$lambda$117(resources, theme);
                        break;
                    case 24:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.reactionBorderDefault_delegate$lambda$100(resources, theme);
                        break;
                    case 25:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tablerowBackgroundDefault_delegate$lambda$118(resources, theme);
                        break;
                    case 26:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tablerowBackgroundPressed_delegate$lambda$119(resources, theme);
                        break;
                    case 27:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.backgroundScrimLightbox_delegate$lambda$11(resources, theme);
                        break;
                    case 28:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tablerowIconColorDefault_delegate$lambda$120(resources, theme);
                        break;
                    default:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.textBrand_delegate$lambda$121(resources, theme);
                        break;
                }
                return Integer.valueOf(iMobileGuildbarIconDefault_delegate$lambda$86);
            }
        });
        this.backgroundScrim = l.b(new h(resources, 25, theme));
        final int i14 = 27;
        this.backgroundScrimLightbox = l.b(new Function0() { // from class: f8.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iMobileGuildbarIconDefault_delegate$lambda$86;
                switch (i14) {
                    case 0:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileGuildbarIconDefault_delegate$lambda$86(resources, theme);
                        break;
                    case 1:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileHeaderIconDefault_delegate$lambda$87(resources, theme);
                        break;
                    case 2:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileKeyboardGapBackground_delegate$lambda$88(resources, theme);
                        break;
                    case 3:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileKeyboardPanelBackground_delegate$lambda$89(resources, theme);
                        break;
                    case 4:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.backgroundModStrong_delegate$lambda$8(resources, theme);
                        break;
                    case 5:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileSegmentedControlBackground_delegate$lambda$90(resources, theme);
                        break;
                    case 6:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchBorderDefault_delegate$lambda$110(resources, theme);
                        break;
                    case 7:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileSegmentedControlIndicatorBackground_delegate$lambda$91(resources, theme);
                        break;
                    case 8:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileTextHeadingPrimary_delegate$lambda$92(resources, theme);
                        break;
                    case 9:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileThreadEmbedBackground_delegate$lambda$93(resources, theme);
                        break;
                    case 10:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileUnreadbarTextDefault_delegate$lambda$94(resources, theme);
                        break;
                    case 11:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileVoicePanelBadgeBackground_delegate$lambda$95(resources, theme);
                        break;
                    case 12:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.progressbarIndicatorBackground_delegate$lambda$96(resources, theme);
                        break;
                    case 13:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.radioBorderDefault_delegate$lambda$97(resources, theme);
                        break;
                    case 14:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.reactionBackgroundDefault_delegate$lambda$98(resources, theme);
                        break;
                    case 15:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.reactionBackgroundReactedDefault_delegate$lambda$99(resources, theme);
                        break;
                    case 16:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.backgroundModSubtle_delegate$lambda$9(resources, theme);
                        break;
                    case 17:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchBorderSelectedDefault_delegate$lambda$111(resources, theme);
                        break;
                    case 18:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchThumbBackgroundDefault_delegate$lambda$112(resources, theme);
                        break;
                    case 19:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchThumbBackgroundSelectedDefault_delegate$lambda$113(resources, theme);
                        break;
                    case 20:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchThumbIconDefault_delegate$lambda$114(resources, theme);
                        break;
                    case 21:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tabBarBackground_delegate$lambda$115(resources, theme);
                        break;
                    case 22:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tabLabelTextDefault_delegate$lambda$116(resources, theme);
                        break;
                    case 23:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tabLabelTextFocused_delegate$lambda$117(resources, theme);
                        break;
                    case 24:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.reactionBorderDefault_delegate$lambda$100(resources, theme);
                        break;
                    case 25:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tablerowBackgroundDefault_delegate$lambda$118(resources, theme);
                        break;
                    case 26:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tablerowBackgroundPressed_delegate$lambda$119(resources, theme);
                        break;
                    case 27:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.backgroundScrimLightbox_delegate$lambda$11(resources, theme);
                        break;
                    case 28:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tablerowIconColorDefault_delegate$lambda$120(resources, theme);
                        break;
                    default:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.textBrand_delegate$lambda$121(resources, theme);
                        break;
                }
                return Integer.valueOf(iMobileGuildbarIconDefault_delegate$lambda$86);
            }
        });
        final int i15 = 9;
        this.backgroundSurfaceHigh = l.b(new Function0() { // from class: f8.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iTextDefault_delegate$lambda$122;
                switch (i15) {
                    case 0:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textDefault_delegate$lambda$122(resources, theme);
                        break;
                    case 1:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackCritical_delegate$lambda$123(resources, theme);
                        break;
                    case 2:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackInfo_delegate$lambda$124(resources, theme);
                        break;
                    case 3:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackPositive_delegate$lambda$125(resources, theme);
                        break;
                    case 4:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackWarning_delegate$lambda$126(resources, theme);
                        break;
                    case 5:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.reactionBorderReactedDefault_delegate$lambda$101(resources, theme);
                        break;
                    case 6:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textMuted_delegate$lambda$127(resources, theme);
                        break;
                    case 7:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textStrong_delegate$lambda$128(resources, theme);
                        break;
                    case 8:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textSubtle_delegate$lambda$129(resources, theme);
                        break;
                    case 9:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.backgroundSurfaceHigh_delegate$lambda$12(resources, theme);
                        break;
                    case 10:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textVoiceConnected_delegate$lambda$130(resources, theme);
                        break;
                    case 11:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textVoiceDisconnected_delegate$lambda$131(resources, theme);
                        break;
                    case 12:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textVoiceSpeaking_delegate$lambda$132(resources, theme);
                        break;
                    case 13:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.userProfileAboutMeHeadingText_delegate$lambda$133(resources, theme);
                        break;
                    case 14:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.userProfileContainerBackground_delegate$lambda$134(resources, theme);
                        break;
                    case 15:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.userProfileGradientBackground_delegate$lambda$135(resources, theme);
                        break;
                    case 16:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.reactionTextReactedDefault_delegate$lambda$102(resources, theme);
                        break;
                    case 17:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitAccentBackground_delegate$lambda$136(resources, theme);
                        break;
                    case 18:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitBackground_delegate$lambda$137(resources, theme);
                        break;
                    case 19:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitIcon_delegate$lambda$138(resources, theme);
                        break;
                    case 20:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitText_delegate$lambda$139(resources, theme);
                        break;
                    case 21:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.backgroundSurfaceHighest_delegate$lambda$13(resources, theme);
                        break;
                    case 22:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.backgroundVoiceMuted_delegate$lambda$14(resources, theme);
                        break;
                    case 23:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.badgeNotificationBackground_delegate$lambda$15(resources, theme);
                        break;
                    case 24:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.borderStrong_delegate$lambda$16(resources, theme);
                        break;
                    case 25:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.borderSubtle_delegate$lambda$17(resources, theme);
                        break;
                    case 26:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.cardBackgroundDefault_delegate$lambda$18(resources, theme);
                        break;
                    case 27:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.redesignButtonTertiaryBackground_delegate$lambda$103(resources, theme);
                        break;
                    case 28:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.cardSecondaryBackgroundActive_delegate$lambda$19(resources, theme);
                        break;
                    default:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.appFrameBorder_delegate$lambda$1(resources, theme);
                        break;
                }
                return Integer.valueOf(iTextDefault_delegate$lambda$122);
            }
        });
        final int i16 = 21;
        this.backgroundSurfaceHighest = l.b(new Function0() { // from class: f8.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iTextDefault_delegate$lambda$122;
                switch (i16) {
                    case 0:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textDefault_delegate$lambda$122(resources, theme);
                        break;
                    case 1:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackCritical_delegate$lambda$123(resources, theme);
                        break;
                    case 2:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackInfo_delegate$lambda$124(resources, theme);
                        break;
                    case 3:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackPositive_delegate$lambda$125(resources, theme);
                        break;
                    case 4:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackWarning_delegate$lambda$126(resources, theme);
                        break;
                    case 5:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.reactionBorderReactedDefault_delegate$lambda$101(resources, theme);
                        break;
                    case 6:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textMuted_delegate$lambda$127(resources, theme);
                        break;
                    case 7:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textStrong_delegate$lambda$128(resources, theme);
                        break;
                    case 8:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textSubtle_delegate$lambda$129(resources, theme);
                        break;
                    case 9:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.backgroundSurfaceHigh_delegate$lambda$12(resources, theme);
                        break;
                    case 10:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textVoiceConnected_delegate$lambda$130(resources, theme);
                        break;
                    case 11:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textVoiceDisconnected_delegate$lambda$131(resources, theme);
                        break;
                    case 12:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textVoiceSpeaking_delegate$lambda$132(resources, theme);
                        break;
                    case 13:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.userProfileAboutMeHeadingText_delegate$lambda$133(resources, theme);
                        break;
                    case 14:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.userProfileContainerBackground_delegate$lambda$134(resources, theme);
                        break;
                    case 15:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.userProfileGradientBackground_delegate$lambda$135(resources, theme);
                        break;
                    case 16:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.reactionTextReactedDefault_delegate$lambda$102(resources, theme);
                        break;
                    case 17:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitAccentBackground_delegate$lambda$136(resources, theme);
                        break;
                    case 18:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitBackground_delegate$lambda$137(resources, theme);
                        break;
                    case 19:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitIcon_delegate$lambda$138(resources, theme);
                        break;
                    case 20:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitText_delegate$lambda$139(resources, theme);
                        break;
                    case 21:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.backgroundSurfaceHighest_delegate$lambda$13(resources, theme);
                        break;
                    case 22:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.backgroundVoiceMuted_delegate$lambda$14(resources, theme);
                        break;
                    case 23:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.badgeNotificationBackground_delegate$lambda$15(resources, theme);
                        break;
                    case 24:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.borderStrong_delegate$lambda$16(resources, theme);
                        break;
                    case 25:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.borderSubtle_delegate$lambda$17(resources, theme);
                        break;
                    case 26:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.cardBackgroundDefault_delegate$lambda$18(resources, theme);
                        break;
                    case 27:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.redesignButtonTertiaryBackground_delegate$lambda$103(resources, theme);
                        break;
                    case 28:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.cardSecondaryBackgroundActive_delegate$lambda$19(resources, theme);
                        break;
                    default:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.appFrameBorder_delegate$lambda$1(resources, theme);
                        break;
                }
                return Integer.valueOf(iTextDefault_delegate$lambda$122);
            }
        });
        final int i17 = 22;
        this.backgroundVoiceMuted = l.b(new Function0() { // from class: f8.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iTextDefault_delegate$lambda$122;
                switch (i17) {
                    case 0:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textDefault_delegate$lambda$122(resources, theme);
                        break;
                    case 1:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackCritical_delegate$lambda$123(resources, theme);
                        break;
                    case 2:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackInfo_delegate$lambda$124(resources, theme);
                        break;
                    case 3:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackPositive_delegate$lambda$125(resources, theme);
                        break;
                    case 4:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackWarning_delegate$lambda$126(resources, theme);
                        break;
                    case 5:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.reactionBorderReactedDefault_delegate$lambda$101(resources, theme);
                        break;
                    case 6:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textMuted_delegate$lambda$127(resources, theme);
                        break;
                    case 7:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textStrong_delegate$lambda$128(resources, theme);
                        break;
                    case 8:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textSubtle_delegate$lambda$129(resources, theme);
                        break;
                    case 9:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.backgroundSurfaceHigh_delegate$lambda$12(resources, theme);
                        break;
                    case 10:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textVoiceConnected_delegate$lambda$130(resources, theme);
                        break;
                    case 11:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textVoiceDisconnected_delegate$lambda$131(resources, theme);
                        break;
                    case 12:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textVoiceSpeaking_delegate$lambda$132(resources, theme);
                        break;
                    case 13:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.userProfileAboutMeHeadingText_delegate$lambda$133(resources, theme);
                        break;
                    case 14:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.userProfileContainerBackground_delegate$lambda$134(resources, theme);
                        break;
                    case 15:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.userProfileGradientBackground_delegate$lambda$135(resources, theme);
                        break;
                    case 16:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.reactionTextReactedDefault_delegate$lambda$102(resources, theme);
                        break;
                    case 17:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitAccentBackground_delegate$lambda$136(resources, theme);
                        break;
                    case 18:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitBackground_delegate$lambda$137(resources, theme);
                        break;
                    case 19:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitIcon_delegate$lambda$138(resources, theme);
                        break;
                    case 20:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitText_delegate$lambda$139(resources, theme);
                        break;
                    case 21:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.backgroundSurfaceHighest_delegate$lambda$13(resources, theme);
                        break;
                    case 22:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.backgroundVoiceMuted_delegate$lambda$14(resources, theme);
                        break;
                    case 23:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.badgeNotificationBackground_delegate$lambda$15(resources, theme);
                        break;
                    case 24:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.borderStrong_delegate$lambda$16(resources, theme);
                        break;
                    case 25:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.borderSubtle_delegate$lambda$17(resources, theme);
                        break;
                    case 26:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.cardBackgroundDefault_delegate$lambda$18(resources, theme);
                        break;
                    case 27:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.redesignButtonTertiaryBackground_delegate$lambda$103(resources, theme);
                        break;
                    case 28:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.cardSecondaryBackgroundActive_delegate$lambda$19(resources, theme);
                        break;
                    default:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.appFrameBorder_delegate$lambda$1(resources, theme);
                        break;
                }
                return Integer.valueOf(iTextDefault_delegate$lambda$122);
            }
        });
        final int i18 = 23;
        this.badgeNotificationBackground = l.b(new Function0() { // from class: f8.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iTextDefault_delegate$lambda$122;
                switch (i18) {
                    case 0:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textDefault_delegate$lambda$122(resources, theme);
                        break;
                    case 1:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackCritical_delegate$lambda$123(resources, theme);
                        break;
                    case 2:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackInfo_delegate$lambda$124(resources, theme);
                        break;
                    case 3:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackPositive_delegate$lambda$125(resources, theme);
                        break;
                    case 4:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackWarning_delegate$lambda$126(resources, theme);
                        break;
                    case 5:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.reactionBorderReactedDefault_delegate$lambda$101(resources, theme);
                        break;
                    case 6:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textMuted_delegate$lambda$127(resources, theme);
                        break;
                    case 7:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textStrong_delegate$lambda$128(resources, theme);
                        break;
                    case 8:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textSubtle_delegate$lambda$129(resources, theme);
                        break;
                    case 9:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.backgroundSurfaceHigh_delegate$lambda$12(resources, theme);
                        break;
                    case 10:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textVoiceConnected_delegate$lambda$130(resources, theme);
                        break;
                    case 11:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textVoiceDisconnected_delegate$lambda$131(resources, theme);
                        break;
                    case 12:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textVoiceSpeaking_delegate$lambda$132(resources, theme);
                        break;
                    case 13:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.userProfileAboutMeHeadingText_delegate$lambda$133(resources, theme);
                        break;
                    case 14:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.userProfileContainerBackground_delegate$lambda$134(resources, theme);
                        break;
                    case 15:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.userProfileGradientBackground_delegate$lambda$135(resources, theme);
                        break;
                    case 16:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.reactionTextReactedDefault_delegate$lambda$102(resources, theme);
                        break;
                    case 17:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitAccentBackground_delegate$lambda$136(resources, theme);
                        break;
                    case 18:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitBackground_delegate$lambda$137(resources, theme);
                        break;
                    case 19:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitIcon_delegate$lambda$138(resources, theme);
                        break;
                    case 20:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitText_delegate$lambda$139(resources, theme);
                        break;
                    case 21:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.backgroundSurfaceHighest_delegate$lambda$13(resources, theme);
                        break;
                    case 22:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.backgroundVoiceMuted_delegate$lambda$14(resources, theme);
                        break;
                    case 23:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.badgeNotificationBackground_delegate$lambda$15(resources, theme);
                        break;
                    case 24:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.borderStrong_delegate$lambda$16(resources, theme);
                        break;
                    case 25:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.borderSubtle_delegate$lambda$17(resources, theme);
                        break;
                    case 26:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.cardBackgroundDefault_delegate$lambda$18(resources, theme);
                        break;
                    case 27:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.redesignButtonTertiaryBackground_delegate$lambda$103(resources, theme);
                        break;
                    case 28:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.cardSecondaryBackgroundActive_delegate$lambda$19(resources, theme);
                        break;
                    default:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.appFrameBorder_delegate$lambda$1(resources, theme);
                        break;
                }
                return Integer.valueOf(iTextDefault_delegate$lambda$122);
            }
        });
        final int i19 = 24;
        this.borderStrong = l.b(new Function0() { // from class: f8.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iTextDefault_delegate$lambda$122;
                switch (i19) {
                    case 0:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textDefault_delegate$lambda$122(resources, theme);
                        break;
                    case 1:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackCritical_delegate$lambda$123(resources, theme);
                        break;
                    case 2:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackInfo_delegate$lambda$124(resources, theme);
                        break;
                    case 3:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackPositive_delegate$lambda$125(resources, theme);
                        break;
                    case 4:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackWarning_delegate$lambda$126(resources, theme);
                        break;
                    case 5:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.reactionBorderReactedDefault_delegate$lambda$101(resources, theme);
                        break;
                    case 6:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textMuted_delegate$lambda$127(resources, theme);
                        break;
                    case 7:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textStrong_delegate$lambda$128(resources, theme);
                        break;
                    case 8:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textSubtle_delegate$lambda$129(resources, theme);
                        break;
                    case 9:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.backgroundSurfaceHigh_delegate$lambda$12(resources, theme);
                        break;
                    case 10:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textVoiceConnected_delegate$lambda$130(resources, theme);
                        break;
                    case 11:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textVoiceDisconnected_delegate$lambda$131(resources, theme);
                        break;
                    case 12:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textVoiceSpeaking_delegate$lambda$132(resources, theme);
                        break;
                    case 13:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.userProfileAboutMeHeadingText_delegate$lambda$133(resources, theme);
                        break;
                    case 14:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.userProfileContainerBackground_delegate$lambda$134(resources, theme);
                        break;
                    case 15:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.userProfileGradientBackground_delegate$lambda$135(resources, theme);
                        break;
                    case 16:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.reactionTextReactedDefault_delegate$lambda$102(resources, theme);
                        break;
                    case 17:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitAccentBackground_delegate$lambda$136(resources, theme);
                        break;
                    case 18:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitBackground_delegate$lambda$137(resources, theme);
                        break;
                    case 19:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitIcon_delegate$lambda$138(resources, theme);
                        break;
                    case 20:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitText_delegate$lambda$139(resources, theme);
                        break;
                    case 21:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.backgroundSurfaceHighest_delegate$lambda$13(resources, theme);
                        break;
                    case 22:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.backgroundVoiceMuted_delegate$lambda$14(resources, theme);
                        break;
                    case 23:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.badgeNotificationBackground_delegate$lambda$15(resources, theme);
                        break;
                    case 24:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.borderStrong_delegate$lambda$16(resources, theme);
                        break;
                    case 25:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.borderSubtle_delegate$lambda$17(resources, theme);
                        break;
                    case 26:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.cardBackgroundDefault_delegate$lambda$18(resources, theme);
                        break;
                    case 27:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.redesignButtonTertiaryBackground_delegate$lambda$103(resources, theme);
                        break;
                    case 28:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.cardSecondaryBackgroundActive_delegate$lambda$19(resources, theme);
                        break;
                    default:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.appFrameBorder_delegate$lambda$1(resources, theme);
                        break;
                }
                return Integer.valueOf(iTextDefault_delegate$lambda$122);
            }
        });
        final int i20 = 25;
        this.borderSubtle = l.b(new Function0() { // from class: f8.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iTextDefault_delegate$lambda$122;
                switch (i20) {
                    case 0:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textDefault_delegate$lambda$122(resources, theme);
                        break;
                    case 1:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackCritical_delegate$lambda$123(resources, theme);
                        break;
                    case 2:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackInfo_delegate$lambda$124(resources, theme);
                        break;
                    case 3:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackPositive_delegate$lambda$125(resources, theme);
                        break;
                    case 4:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackWarning_delegate$lambda$126(resources, theme);
                        break;
                    case 5:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.reactionBorderReactedDefault_delegate$lambda$101(resources, theme);
                        break;
                    case 6:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textMuted_delegate$lambda$127(resources, theme);
                        break;
                    case 7:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textStrong_delegate$lambda$128(resources, theme);
                        break;
                    case 8:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textSubtle_delegate$lambda$129(resources, theme);
                        break;
                    case 9:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.backgroundSurfaceHigh_delegate$lambda$12(resources, theme);
                        break;
                    case 10:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textVoiceConnected_delegate$lambda$130(resources, theme);
                        break;
                    case 11:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textVoiceDisconnected_delegate$lambda$131(resources, theme);
                        break;
                    case 12:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textVoiceSpeaking_delegate$lambda$132(resources, theme);
                        break;
                    case 13:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.userProfileAboutMeHeadingText_delegate$lambda$133(resources, theme);
                        break;
                    case 14:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.userProfileContainerBackground_delegate$lambda$134(resources, theme);
                        break;
                    case 15:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.userProfileGradientBackground_delegate$lambda$135(resources, theme);
                        break;
                    case 16:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.reactionTextReactedDefault_delegate$lambda$102(resources, theme);
                        break;
                    case 17:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitAccentBackground_delegate$lambda$136(resources, theme);
                        break;
                    case 18:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitBackground_delegate$lambda$137(resources, theme);
                        break;
                    case 19:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitIcon_delegate$lambda$138(resources, theme);
                        break;
                    case 20:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitText_delegate$lambda$139(resources, theme);
                        break;
                    case 21:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.backgroundSurfaceHighest_delegate$lambda$13(resources, theme);
                        break;
                    case 22:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.backgroundVoiceMuted_delegate$lambda$14(resources, theme);
                        break;
                    case 23:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.badgeNotificationBackground_delegate$lambda$15(resources, theme);
                        break;
                    case 24:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.borderStrong_delegate$lambda$16(resources, theme);
                        break;
                    case 25:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.borderSubtle_delegate$lambda$17(resources, theme);
                        break;
                    case 26:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.cardBackgroundDefault_delegate$lambda$18(resources, theme);
                        break;
                    case 27:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.redesignButtonTertiaryBackground_delegate$lambda$103(resources, theme);
                        break;
                    case 28:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.cardSecondaryBackgroundActive_delegate$lambda$19(resources, theme);
                        break;
                    default:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.appFrameBorder_delegate$lambda$1(resources, theme);
                        break;
                }
                return Integer.valueOf(iTextDefault_delegate$lambda$122);
            }
        });
        final int i21 = 26;
        this.cardBackgroundDefault = l.b(new Function0() { // from class: f8.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iTextDefault_delegate$lambda$122;
                switch (i21) {
                    case 0:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textDefault_delegate$lambda$122(resources, theme);
                        break;
                    case 1:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackCritical_delegate$lambda$123(resources, theme);
                        break;
                    case 2:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackInfo_delegate$lambda$124(resources, theme);
                        break;
                    case 3:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackPositive_delegate$lambda$125(resources, theme);
                        break;
                    case 4:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackWarning_delegate$lambda$126(resources, theme);
                        break;
                    case 5:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.reactionBorderReactedDefault_delegate$lambda$101(resources, theme);
                        break;
                    case 6:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textMuted_delegate$lambda$127(resources, theme);
                        break;
                    case 7:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textStrong_delegate$lambda$128(resources, theme);
                        break;
                    case 8:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textSubtle_delegate$lambda$129(resources, theme);
                        break;
                    case 9:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.backgroundSurfaceHigh_delegate$lambda$12(resources, theme);
                        break;
                    case 10:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textVoiceConnected_delegate$lambda$130(resources, theme);
                        break;
                    case 11:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textVoiceDisconnected_delegate$lambda$131(resources, theme);
                        break;
                    case 12:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textVoiceSpeaking_delegate$lambda$132(resources, theme);
                        break;
                    case 13:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.userProfileAboutMeHeadingText_delegate$lambda$133(resources, theme);
                        break;
                    case 14:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.userProfileContainerBackground_delegate$lambda$134(resources, theme);
                        break;
                    case 15:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.userProfileGradientBackground_delegate$lambda$135(resources, theme);
                        break;
                    case 16:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.reactionTextReactedDefault_delegate$lambda$102(resources, theme);
                        break;
                    case 17:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitAccentBackground_delegate$lambda$136(resources, theme);
                        break;
                    case 18:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitBackground_delegate$lambda$137(resources, theme);
                        break;
                    case 19:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitIcon_delegate$lambda$138(resources, theme);
                        break;
                    case 20:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitText_delegate$lambda$139(resources, theme);
                        break;
                    case 21:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.backgroundSurfaceHighest_delegate$lambda$13(resources, theme);
                        break;
                    case 22:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.backgroundVoiceMuted_delegate$lambda$14(resources, theme);
                        break;
                    case 23:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.badgeNotificationBackground_delegate$lambda$15(resources, theme);
                        break;
                    case 24:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.borderStrong_delegate$lambda$16(resources, theme);
                        break;
                    case 25:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.borderSubtle_delegate$lambda$17(resources, theme);
                        break;
                    case 26:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.cardBackgroundDefault_delegate$lambda$18(resources, theme);
                        break;
                    case 27:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.redesignButtonTertiaryBackground_delegate$lambda$103(resources, theme);
                        break;
                    case 28:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.cardSecondaryBackgroundActive_delegate$lambda$19(resources, theme);
                        break;
                    default:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.appFrameBorder_delegate$lambda$1(resources, theme);
                        break;
                }
                return Integer.valueOf(iTextDefault_delegate$lambda$122);
            }
        });
        final int i22 = 28;
        this.cardSecondaryBackgroundActive = l.b(new Function0() { // from class: f8.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iTextDefault_delegate$lambda$122;
                switch (i22) {
                    case 0:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textDefault_delegate$lambda$122(resources, theme);
                        break;
                    case 1:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackCritical_delegate$lambda$123(resources, theme);
                        break;
                    case 2:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackInfo_delegate$lambda$124(resources, theme);
                        break;
                    case 3:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackPositive_delegate$lambda$125(resources, theme);
                        break;
                    case 4:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackWarning_delegate$lambda$126(resources, theme);
                        break;
                    case 5:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.reactionBorderReactedDefault_delegate$lambda$101(resources, theme);
                        break;
                    case 6:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textMuted_delegate$lambda$127(resources, theme);
                        break;
                    case 7:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textStrong_delegate$lambda$128(resources, theme);
                        break;
                    case 8:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textSubtle_delegate$lambda$129(resources, theme);
                        break;
                    case 9:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.backgroundSurfaceHigh_delegate$lambda$12(resources, theme);
                        break;
                    case 10:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textVoiceConnected_delegate$lambda$130(resources, theme);
                        break;
                    case 11:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textVoiceDisconnected_delegate$lambda$131(resources, theme);
                        break;
                    case 12:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textVoiceSpeaking_delegate$lambda$132(resources, theme);
                        break;
                    case 13:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.userProfileAboutMeHeadingText_delegate$lambda$133(resources, theme);
                        break;
                    case 14:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.userProfileContainerBackground_delegate$lambda$134(resources, theme);
                        break;
                    case 15:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.userProfileGradientBackground_delegate$lambda$135(resources, theme);
                        break;
                    case 16:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.reactionTextReactedDefault_delegate$lambda$102(resources, theme);
                        break;
                    case 17:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitAccentBackground_delegate$lambda$136(resources, theme);
                        break;
                    case 18:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitBackground_delegate$lambda$137(resources, theme);
                        break;
                    case 19:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitIcon_delegate$lambda$138(resources, theme);
                        break;
                    case 20:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitText_delegate$lambda$139(resources, theme);
                        break;
                    case 21:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.backgroundSurfaceHighest_delegate$lambda$13(resources, theme);
                        break;
                    case 22:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.backgroundVoiceMuted_delegate$lambda$14(resources, theme);
                        break;
                    case 23:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.badgeNotificationBackground_delegate$lambda$15(resources, theme);
                        break;
                    case 24:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.borderStrong_delegate$lambda$16(resources, theme);
                        break;
                    case 25:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.borderSubtle_delegate$lambda$17(resources, theme);
                        break;
                    case 26:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.cardBackgroundDefault_delegate$lambda$18(resources, theme);
                        break;
                    case 27:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.redesignButtonTertiaryBackground_delegate$lambda$103(resources, theme);
                        break;
                    case 28:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.cardSecondaryBackgroundActive_delegate$lambda$19(resources, theme);
                        break;
                    default:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.appFrameBorder_delegate$lambda$1(resources, theme);
                        break;
                }
                return Integer.valueOf(iTextDefault_delegate$lambda$122);
            }
        });
        final int i23 = 0;
        this.cardSecondaryBackgroundDefault = l.b(new Function0() { // from class: f8.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iCardSecondaryBackgroundDefault_delegate$lambda$20;
                switch (i23) {
                    case 0:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.cardSecondaryBackgroundDefault_delegate$lambda$20(resources, theme);
                        break;
                    case 1:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.channelBackgroundDefault_delegate$lambda$21(resources, theme);
                        break;
                    case 2:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputActionButtonBackground_delegate$lambda$22(resources, theme);
                        break;
                    case 3:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputActionButtonIconDefaultTint_delegate$lambda$23(resources, theme);
                        break;
                    case 4:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputActionIconActiveTint_delegate$lambda$24(resources, theme);
                        break;
                    case 5:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputBackground_delegate$lambda$25(resources, theme);
                        break;
                    case 6:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputIconDefaultTint_delegate$lambda$26(resources, theme);
                        break;
                    case 7:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputSendButtonActiveBackground_delegate$lambda$27(resources, theme);
                        break;
                    case 8:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.spineDefault_delegate$lambda$104(resources, theme);
                        break;
                    case 9:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputSendButtonIconActiveTint_delegate$lambda$28(resources, theme);
                        break;
                    case 10:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBackgroundDefault_delegate$lambda$29(resources, theme);
                        break;
                    case 11:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.backgroundBaseLow_delegate$lambda$2(resources, theme);
                        break;
                    case 12:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBackgroundSelectedDefault_delegate$lambda$30(resources, theme);
                        break;
                    case 13:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBorderDefault_delegate$lambda$31(resources, theme);
                        break;
                    case 14:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBorderSelectedDefault_delegate$lambda$32(resources, theme);
                        break;
                    case 15:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxIconActive_delegate$lambda$33(resources, theme);
                        break;
                    case 16:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBackgroundActive_delegate$lambda$34(resources, theme);
                        break;
                    case 17:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBackgroundDefault_delegate$lambda$35(resources, theme);
                        break;
                    case 18:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBorderActive_delegate$lambda$36(resources, theme);
                        break;
                    case 19:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.spoilerHiddenBackground_delegate$lambda$105(resources, theme);
                        break;
                    case 20:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBorderDefault_delegate$lambda$37(resources, theme);
                        break;
                    case 21:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedTextDefault_delegate$lambda$38(resources, theme);
                        break;
                    case 22:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBackgroundActive_delegate$lambda$39(resources, theme);
                        break;
                    case 23:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.backgroundBaseLower_delegate$lambda$3(resources, theme);
                        break;
                    case 24:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBackgroundDefault_delegate$lambda$40(resources, theme);
                        break;
                    case 25:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBorderActive_delegate$lambda$41(resources, theme);
                        break;
                    case 26:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBorderDefault_delegate$lambda$42(resources, theme);
                        break;
                    case 27:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryTextDefault_delegate$lambda$43(resources, theme);
                        break;
                    case 28:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlOverlayPrimaryBackgroundActive_delegate$lambda$44(resources, theme);
                        break;
                    default:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlOverlayPrimaryBackgroundDefault_delegate$lambda$45(resources, theme);
                        break;
                }
                return Integer.valueOf(iCardSecondaryBackgroundDefault_delegate$lambda$20);
            }
        });
        final int i24 = 1;
        this.channelBackgroundDefault = l.b(new Function0() { // from class: f8.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iCardSecondaryBackgroundDefault_delegate$lambda$20;
                switch (i24) {
                    case 0:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.cardSecondaryBackgroundDefault_delegate$lambda$20(resources, theme);
                        break;
                    case 1:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.channelBackgroundDefault_delegate$lambda$21(resources, theme);
                        break;
                    case 2:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputActionButtonBackground_delegate$lambda$22(resources, theme);
                        break;
                    case 3:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputActionButtonIconDefaultTint_delegate$lambda$23(resources, theme);
                        break;
                    case 4:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputActionIconActiveTint_delegate$lambda$24(resources, theme);
                        break;
                    case 5:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputBackground_delegate$lambda$25(resources, theme);
                        break;
                    case 6:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputIconDefaultTint_delegate$lambda$26(resources, theme);
                        break;
                    case 7:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputSendButtonActiveBackground_delegate$lambda$27(resources, theme);
                        break;
                    case 8:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.spineDefault_delegate$lambda$104(resources, theme);
                        break;
                    case 9:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputSendButtonIconActiveTint_delegate$lambda$28(resources, theme);
                        break;
                    case 10:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBackgroundDefault_delegate$lambda$29(resources, theme);
                        break;
                    case 11:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.backgroundBaseLow_delegate$lambda$2(resources, theme);
                        break;
                    case 12:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBackgroundSelectedDefault_delegate$lambda$30(resources, theme);
                        break;
                    case 13:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBorderDefault_delegate$lambda$31(resources, theme);
                        break;
                    case 14:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBorderSelectedDefault_delegate$lambda$32(resources, theme);
                        break;
                    case 15:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxIconActive_delegate$lambda$33(resources, theme);
                        break;
                    case 16:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBackgroundActive_delegate$lambda$34(resources, theme);
                        break;
                    case 17:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBackgroundDefault_delegate$lambda$35(resources, theme);
                        break;
                    case 18:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBorderActive_delegate$lambda$36(resources, theme);
                        break;
                    case 19:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.spoilerHiddenBackground_delegate$lambda$105(resources, theme);
                        break;
                    case 20:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBorderDefault_delegate$lambda$37(resources, theme);
                        break;
                    case 21:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedTextDefault_delegate$lambda$38(resources, theme);
                        break;
                    case 22:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBackgroundActive_delegate$lambda$39(resources, theme);
                        break;
                    case 23:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.backgroundBaseLower_delegate$lambda$3(resources, theme);
                        break;
                    case 24:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBackgroundDefault_delegate$lambda$40(resources, theme);
                        break;
                    case 25:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBorderActive_delegate$lambda$41(resources, theme);
                        break;
                    case 26:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBorderDefault_delegate$lambda$42(resources, theme);
                        break;
                    case 27:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryTextDefault_delegate$lambda$43(resources, theme);
                        break;
                    case 28:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlOverlayPrimaryBackgroundActive_delegate$lambda$44(resources, theme);
                        break;
                    default:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlOverlayPrimaryBackgroundDefault_delegate$lambda$45(resources, theme);
                        break;
                }
                return Integer.valueOf(iCardSecondaryBackgroundDefault_delegate$lambda$20);
            }
        });
        final int i25 = 2;
        this.chatInputActionButtonBackground = l.b(new Function0() { // from class: f8.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iCardSecondaryBackgroundDefault_delegate$lambda$20;
                switch (i25) {
                    case 0:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.cardSecondaryBackgroundDefault_delegate$lambda$20(resources, theme);
                        break;
                    case 1:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.channelBackgroundDefault_delegate$lambda$21(resources, theme);
                        break;
                    case 2:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputActionButtonBackground_delegate$lambda$22(resources, theme);
                        break;
                    case 3:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputActionButtonIconDefaultTint_delegate$lambda$23(resources, theme);
                        break;
                    case 4:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputActionIconActiveTint_delegate$lambda$24(resources, theme);
                        break;
                    case 5:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputBackground_delegate$lambda$25(resources, theme);
                        break;
                    case 6:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputIconDefaultTint_delegate$lambda$26(resources, theme);
                        break;
                    case 7:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputSendButtonActiveBackground_delegate$lambda$27(resources, theme);
                        break;
                    case 8:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.spineDefault_delegate$lambda$104(resources, theme);
                        break;
                    case 9:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputSendButtonIconActiveTint_delegate$lambda$28(resources, theme);
                        break;
                    case 10:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBackgroundDefault_delegate$lambda$29(resources, theme);
                        break;
                    case 11:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.backgroundBaseLow_delegate$lambda$2(resources, theme);
                        break;
                    case 12:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBackgroundSelectedDefault_delegate$lambda$30(resources, theme);
                        break;
                    case 13:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBorderDefault_delegate$lambda$31(resources, theme);
                        break;
                    case 14:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBorderSelectedDefault_delegate$lambda$32(resources, theme);
                        break;
                    case 15:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxIconActive_delegate$lambda$33(resources, theme);
                        break;
                    case 16:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBackgroundActive_delegate$lambda$34(resources, theme);
                        break;
                    case 17:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBackgroundDefault_delegate$lambda$35(resources, theme);
                        break;
                    case 18:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBorderActive_delegate$lambda$36(resources, theme);
                        break;
                    case 19:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.spoilerHiddenBackground_delegate$lambda$105(resources, theme);
                        break;
                    case 20:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBorderDefault_delegate$lambda$37(resources, theme);
                        break;
                    case 21:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedTextDefault_delegate$lambda$38(resources, theme);
                        break;
                    case 22:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBackgroundActive_delegate$lambda$39(resources, theme);
                        break;
                    case 23:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.backgroundBaseLower_delegate$lambda$3(resources, theme);
                        break;
                    case 24:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBackgroundDefault_delegate$lambda$40(resources, theme);
                        break;
                    case 25:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBorderActive_delegate$lambda$41(resources, theme);
                        break;
                    case 26:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBorderDefault_delegate$lambda$42(resources, theme);
                        break;
                    case 27:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryTextDefault_delegate$lambda$43(resources, theme);
                        break;
                    case 28:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlOverlayPrimaryBackgroundActive_delegate$lambda$44(resources, theme);
                        break;
                    default:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlOverlayPrimaryBackgroundDefault_delegate$lambda$45(resources, theme);
                        break;
                }
                return Integer.valueOf(iCardSecondaryBackgroundDefault_delegate$lambda$20);
            }
        });
        final int i26 = 3;
        this.chatInputActionButtonIconDefaultTint = l.b(new Function0() { // from class: f8.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iCardSecondaryBackgroundDefault_delegate$lambda$20;
                switch (i26) {
                    case 0:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.cardSecondaryBackgroundDefault_delegate$lambda$20(resources, theme);
                        break;
                    case 1:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.channelBackgroundDefault_delegate$lambda$21(resources, theme);
                        break;
                    case 2:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputActionButtonBackground_delegate$lambda$22(resources, theme);
                        break;
                    case 3:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputActionButtonIconDefaultTint_delegate$lambda$23(resources, theme);
                        break;
                    case 4:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputActionIconActiveTint_delegate$lambda$24(resources, theme);
                        break;
                    case 5:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputBackground_delegate$lambda$25(resources, theme);
                        break;
                    case 6:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputIconDefaultTint_delegate$lambda$26(resources, theme);
                        break;
                    case 7:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputSendButtonActiveBackground_delegate$lambda$27(resources, theme);
                        break;
                    case 8:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.spineDefault_delegate$lambda$104(resources, theme);
                        break;
                    case 9:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputSendButtonIconActiveTint_delegate$lambda$28(resources, theme);
                        break;
                    case 10:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBackgroundDefault_delegate$lambda$29(resources, theme);
                        break;
                    case 11:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.backgroundBaseLow_delegate$lambda$2(resources, theme);
                        break;
                    case 12:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBackgroundSelectedDefault_delegate$lambda$30(resources, theme);
                        break;
                    case 13:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBorderDefault_delegate$lambda$31(resources, theme);
                        break;
                    case 14:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBorderSelectedDefault_delegate$lambda$32(resources, theme);
                        break;
                    case 15:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxIconActive_delegate$lambda$33(resources, theme);
                        break;
                    case 16:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBackgroundActive_delegate$lambda$34(resources, theme);
                        break;
                    case 17:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBackgroundDefault_delegate$lambda$35(resources, theme);
                        break;
                    case 18:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBorderActive_delegate$lambda$36(resources, theme);
                        break;
                    case 19:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.spoilerHiddenBackground_delegate$lambda$105(resources, theme);
                        break;
                    case 20:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBorderDefault_delegate$lambda$37(resources, theme);
                        break;
                    case 21:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedTextDefault_delegate$lambda$38(resources, theme);
                        break;
                    case 22:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBackgroundActive_delegate$lambda$39(resources, theme);
                        break;
                    case 23:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.backgroundBaseLower_delegate$lambda$3(resources, theme);
                        break;
                    case 24:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBackgroundDefault_delegate$lambda$40(resources, theme);
                        break;
                    case 25:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBorderActive_delegate$lambda$41(resources, theme);
                        break;
                    case 26:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBorderDefault_delegate$lambda$42(resources, theme);
                        break;
                    case 27:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryTextDefault_delegate$lambda$43(resources, theme);
                        break;
                    case 28:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlOverlayPrimaryBackgroundActive_delegate$lambda$44(resources, theme);
                        break;
                    default:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlOverlayPrimaryBackgroundDefault_delegate$lambda$45(resources, theme);
                        break;
                }
                return Integer.valueOf(iCardSecondaryBackgroundDefault_delegate$lambda$20);
            }
        });
        final int i27 = 4;
        this.chatInputActionIconActiveTint = l.b(new Function0() { // from class: f8.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iCardSecondaryBackgroundDefault_delegate$lambda$20;
                switch (i27) {
                    case 0:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.cardSecondaryBackgroundDefault_delegate$lambda$20(resources, theme);
                        break;
                    case 1:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.channelBackgroundDefault_delegate$lambda$21(resources, theme);
                        break;
                    case 2:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputActionButtonBackground_delegate$lambda$22(resources, theme);
                        break;
                    case 3:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputActionButtonIconDefaultTint_delegate$lambda$23(resources, theme);
                        break;
                    case 4:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputActionIconActiveTint_delegate$lambda$24(resources, theme);
                        break;
                    case 5:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputBackground_delegate$lambda$25(resources, theme);
                        break;
                    case 6:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputIconDefaultTint_delegate$lambda$26(resources, theme);
                        break;
                    case 7:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputSendButtonActiveBackground_delegate$lambda$27(resources, theme);
                        break;
                    case 8:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.spineDefault_delegate$lambda$104(resources, theme);
                        break;
                    case 9:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputSendButtonIconActiveTint_delegate$lambda$28(resources, theme);
                        break;
                    case 10:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBackgroundDefault_delegate$lambda$29(resources, theme);
                        break;
                    case 11:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.backgroundBaseLow_delegate$lambda$2(resources, theme);
                        break;
                    case 12:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBackgroundSelectedDefault_delegate$lambda$30(resources, theme);
                        break;
                    case 13:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBorderDefault_delegate$lambda$31(resources, theme);
                        break;
                    case 14:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBorderSelectedDefault_delegate$lambda$32(resources, theme);
                        break;
                    case 15:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxIconActive_delegate$lambda$33(resources, theme);
                        break;
                    case 16:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBackgroundActive_delegate$lambda$34(resources, theme);
                        break;
                    case 17:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBackgroundDefault_delegate$lambda$35(resources, theme);
                        break;
                    case 18:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBorderActive_delegate$lambda$36(resources, theme);
                        break;
                    case 19:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.spoilerHiddenBackground_delegate$lambda$105(resources, theme);
                        break;
                    case 20:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBorderDefault_delegate$lambda$37(resources, theme);
                        break;
                    case 21:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedTextDefault_delegate$lambda$38(resources, theme);
                        break;
                    case 22:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBackgroundActive_delegate$lambda$39(resources, theme);
                        break;
                    case 23:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.backgroundBaseLower_delegate$lambda$3(resources, theme);
                        break;
                    case 24:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBackgroundDefault_delegate$lambda$40(resources, theme);
                        break;
                    case 25:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBorderActive_delegate$lambda$41(resources, theme);
                        break;
                    case 26:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBorderDefault_delegate$lambda$42(resources, theme);
                        break;
                    case 27:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryTextDefault_delegate$lambda$43(resources, theme);
                        break;
                    case 28:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlOverlayPrimaryBackgroundActive_delegate$lambda$44(resources, theme);
                        break;
                    default:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlOverlayPrimaryBackgroundDefault_delegate$lambda$45(resources, theme);
                        break;
                }
                return Integer.valueOf(iCardSecondaryBackgroundDefault_delegate$lambda$20);
            }
        });
        final int i28 = 5;
        this.chatInputBackground = l.b(new Function0() { // from class: f8.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iCardSecondaryBackgroundDefault_delegate$lambda$20;
                switch (i28) {
                    case 0:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.cardSecondaryBackgroundDefault_delegate$lambda$20(resources, theme);
                        break;
                    case 1:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.channelBackgroundDefault_delegate$lambda$21(resources, theme);
                        break;
                    case 2:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputActionButtonBackground_delegate$lambda$22(resources, theme);
                        break;
                    case 3:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputActionButtonIconDefaultTint_delegate$lambda$23(resources, theme);
                        break;
                    case 4:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputActionIconActiveTint_delegate$lambda$24(resources, theme);
                        break;
                    case 5:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputBackground_delegate$lambda$25(resources, theme);
                        break;
                    case 6:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputIconDefaultTint_delegate$lambda$26(resources, theme);
                        break;
                    case 7:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputSendButtonActiveBackground_delegate$lambda$27(resources, theme);
                        break;
                    case 8:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.spineDefault_delegate$lambda$104(resources, theme);
                        break;
                    case 9:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputSendButtonIconActiveTint_delegate$lambda$28(resources, theme);
                        break;
                    case 10:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBackgroundDefault_delegate$lambda$29(resources, theme);
                        break;
                    case 11:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.backgroundBaseLow_delegate$lambda$2(resources, theme);
                        break;
                    case 12:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBackgroundSelectedDefault_delegate$lambda$30(resources, theme);
                        break;
                    case 13:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBorderDefault_delegate$lambda$31(resources, theme);
                        break;
                    case 14:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBorderSelectedDefault_delegate$lambda$32(resources, theme);
                        break;
                    case 15:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxIconActive_delegate$lambda$33(resources, theme);
                        break;
                    case 16:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBackgroundActive_delegate$lambda$34(resources, theme);
                        break;
                    case 17:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBackgroundDefault_delegate$lambda$35(resources, theme);
                        break;
                    case 18:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBorderActive_delegate$lambda$36(resources, theme);
                        break;
                    case 19:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.spoilerHiddenBackground_delegate$lambda$105(resources, theme);
                        break;
                    case 20:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBorderDefault_delegate$lambda$37(resources, theme);
                        break;
                    case 21:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedTextDefault_delegate$lambda$38(resources, theme);
                        break;
                    case 22:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBackgroundActive_delegate$lambda$39(resources, theme);
                        break;
                    case 23:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.backgroundBaseLower_delegate$lambda$3(resources, theme);
                        break;
                    case 24:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBackgroundDefault_delegate$lambda$40(resources, theme);
                        break;
                    case 25:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBorderActive_delegate$lambda$41(resources, theme);
                        break;
                    case 26:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBorderDefault_delegate$lambda$42(resources, theme);
                        break;
                    case 27:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryTextDefault_delegate$lambda$43(resources, theme);
                        break;
                    case 28:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlOverlayPrimaryBackgroundActive_delegate$lambda$44(resources, theme);
                        break;
                    default:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlOverlayPrimaryBackgroundDefault_delegate$lambda$45(resources, theme);
                        break;
                }
                return Integer.valueOf(iCardSecondaryBackgroundDefault_delegate$lambda$20);
            }
        });
        final int i29 = 6;
        this.chatInputIconDefaultTint = l.b(new Function0() { // from class: f8.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iCardSecondaryBackgroundDefault_delegate$lambda$20;
                switch (i29) {
                    case 0:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.cardSecondaryBackgroundDefault_delegate$lambda$20(resources, theme);
                        break;
                    case 1:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.channelBackgroundDefault_delegate$lambda$21(resources, theme);
                        break;
                    case 2:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputActionButtonBackground_delegate$lambda$22(resources, theme);
                        break;
                    case 3:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputActionButtonIconDefaultTint_delegate$lambda$23(resources, theme);
                        break;
                    case 4:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputActionIconActiveTint_delegate$lambda$24(resources, theme);
                        break;
                    case 5:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputBackground_delegate$lambda$25(resources, theme);
                        break;
                    case 6:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputIconDefaultTint_delegate$lambda$26(resources, theme);
                        break;
                    case 7:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputSendButtonActiveBackground_delegate$lambda$27(resources, theme);
                        break;
                    case 8:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.spineDefault_delegate$lambda$104(resources, theme);
                        break;
                    case 9:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputSendButtonIconActiveTint_delegate$lambda$28(resources, theme);
                        break;
                    case 10:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBackgroundDefault_delegate$lambda$29(resources, theme);
                        break;
                    case 11:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.backgroundBaseLow_delegate$lambda$2(resources, theme);
                        break;
                    case 12:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBackgroundSelectedDefault_delegate$lambda$30(resources, theme);
                        break;
                    case 13:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBorderDefault_delegate$lambda$31(resources, theme);
                        break;
                    case 14:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBorderSelectedDefault_delegate$lambda$32(resources, theme);
                        break;
                    case 15:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxIconActive_delegate$lambda$33(resources, theme);
                        break;
                    case 16:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBackgroundActive_delegate$lambda$34(resources, theme);
                        break;
                    case 17:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBackgroundDefault_delegate$lambda$35(resources, theme);
                        break;
                    case 18:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBorderActive_delegate$lambda$36(resources, theme);
                        break;
                    case 19:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.spoilerHiddenBackground_delegate$lambda$105(resources, theme);
                        break;
                    case 20:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBorderDefault_delegate$lambda$37(resources, theme);
                        break;
                    case 21:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedTextDefault_delegate$lambda$38(resources, theme);
                        break;
                    case 22:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBackgroundActive_delegate$lambda$39(resources, theme);
                        break;
                    case 23:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.backgroundBaseLower_delegate$lambda$3(resources, theme);
                        break;
                    case 24:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBackgroundDefault_delegate$lambda$40(resources, theme);
                        break;
                    case 25:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBorderActive_delegate$lambda$41(resources, theme);
                        break;
                    case 26:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBorderDefault_delegate$lambda$42(resources, theme);
                        break;
                    case 27:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryTextDefault_delegate$lambda$43(resources, theme);
                        break;
                    case 28:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlOverlayPrimaryBackgroundActive_delegate$lambda$44(resources, theme);
                        break;
                    default:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlOverlayPrimaryBackgroundDefault_delegate$lambda$45(resources, theme);
                        break;
                }
                return Integer.valueOf(iCardSecondaryBackgroundDefault_delegate$lambda$20);
            }
        });
        final int i30 = 7;
        this.chatInputSendButtonActiveBackground = l.b(new Function0() { // from class: f8.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iCardSecondaryBackgroundDefault_delegate$lambda$20;
                switch (i30) {
                    case 0:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.cardSecondaryBackgroundDefault_delegate$lambda$20(resources, theme);
                        break;
                    case 1:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.channelBackgroundDefault_delegate$lambda$21(resources, theme);
                        break;
                    case 2:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputActionButtonBackground_delegate$lambda$22(resources, theme);
                        break;
                    case 3:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputActionButtonIconDefaultTint_delegate$lambda$23(resources, theme);
                        break;
                    case 4:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputActionIconActiveTint_delegate$lambda$24(resources, theme);
                        break;
                    case 5:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputBackground_delegate$lambda$25(resources, theme);
                        break;
                    case 6:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputIconDefaultTint_delegate$lambda$26(resources, theme);
                        break;
                    case 7:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputSendButtonActiveBackground_delegate$lambda$27(resources, theme);
                        break;
                    case 8:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.spineDefault_delegate$lambda$104(resources, theme);
                        break;
                    case 9:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputSendButtonIconActiveTint_delegate$lambda$28(resources, theme);
                        break;
                    case 10:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBackgroundDefault_delegate$lambda$29(resources, theme);
                        break;
                    case 11:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.backgroundBaseLow_delegate$lambda$2(resources, theme);
                        break;
                    case 12:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBackgroundSelectedDefault_delegate$lambda$30(resources, theme);
                        break;
                    case 13:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBorderDefault_delegate$lambda$31(resources, theme);
                        break;
                    case 14:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBorderSelectedDefault_delegate$lambda$32(resources, theme);
                        break;
                    case 15:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxIconActive_delegate$lambda$33(resources, theme);
                        break;
                    case 16:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBackgroundActive_delegate$lambda$34(resources, theme);
                        break;
                    case 17:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBackgroundDefault_delegate$lambda$35(resources, theme);
                        break;
                    case 18:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBorderActive_delegate$lambda$36(resources, theme);
                        break;
                    case 19:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.spoilerHiddenBackground_delegate$lambda$105(resources, theme);
                        break;
                    case 20:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBorderDefault_delegate$lambda$37(resources, theme);
                        break;
                    case 21:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedTextDefault_delegate$lambda$38(resources, theme);
                        break;
                    case 22:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBackgroundActive_delegate$lambda$39(resources, theme);
                        break;
                    case 23:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.backgroundBaseLower_delegate$lambda$3(resources, theme);
                        break;
                    case 24:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBackgroundDefault_delegate$lambda$40(resources, theme);
                        break;
                    case 25:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBorderActive_delegate$lambda$41(resources, theme);
                        break;
                    case 26:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBorderDefault_delegate$lambda$42(resources, theme);
                        break;
                    case 27:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryTextDefault_delegate$lambda$43(resources, theme);
                        break;
                    case 28:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlOverlayPrimaryBackgroundActive_delegate$lambda$44(resources, theme);
                        break;
                    default:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlOverlayPrimaryBackgroundDefault_delegate$lambda$45(resources, theme);
                        break;
                }
                return Integer.valueOf(iCardSecondaryBackgroundDefault_delegate$lambda$20);
            }
        });
        final int i31 = 9;
        this.chatInputSendButtonIconActiveTint = l.b(new Function0() { // from class: f8.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iCardSecondaryBackgroundDefault_delegate$lambda$20;
                switch (i31) {
                    case 0:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.cardSecondaryBackgroundDefault_delegate$lambda$20(resources, theme);
                        break;
                    case 1:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.channelBackgroundDefault_delegate$lambda$21(resources, theme);
                        break;
                    case 2:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputActionButtonBackground_delegate$lambda$22(resources, theme);
                        break;
                    case 3:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputActionButtonIconDefaultTint_delegate$lambda$23(resources, theme);
                        break;
                    case 4:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputActionIconActiveTint_delegate$lambda$24(resources, theme);
                        break;
                    case 5:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputBackground_delegate$lambda$25(resources, theme);
                        break;
                    case 6:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputIconDefaultTint_delegate$lambda$26(resources, theme);
                        break;
                    case 7:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputSendButtonActiveBackground_delegate$lambda$27(resources, theme);
                        break;
                    case 8:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.spineDefault_delegate$lambda$104(resources, theme);
                        break;
                    case 9:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputSendButtonIconActiveTint_delegate$lambda$28(resources, theme);
                        break;
                    case 10:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBackgroundDefault_delegate$lambda$29(resources, theme);
                        break;
                    case 11:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.backgroundBaseLow_delegate$lambda$2(resources, theme);
                        break;
                    case 12:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBackgroundSelectedDefault_delegate$lambda$30(resources, theme);
                        break;
                    case 13:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBorderDefault_delegate$lambda$31(resources, theme);
                        break;
                    case 14:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBorderSelectedDefault_delegate$lambda$32(resources, theme);
                        break;
                    case 15:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxIconActive_delegate$lambda$33(resources, theme);
                        break;
                    case 16:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBackgroundActive_delegate$lambda$34(resources, theme);
                        break;
                    case 17:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBackgroundDefault_delegate$lambda$35(resources, theme);
                        break;
                    case 18:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBorderActive_delegate$lambda$36(resources, theme);
                        break;
                    case 19:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.spoilerHiddenBackground_delegate$lambda$105(resources, theme);
                        break;
                    case 20:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBorderDefault_delegate$lambda$37(resources, theme);
                        break;
                    case 21:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedTextDefault_delegate$lambda$38(resources, theme);
                        break;
                    case 22:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBackgroundActive_delegate$lambda$39(resources, theme);
                        break;
                    case 23:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.backgroundBaseLower_delegate$lambda$3(resources, theme);
                        break;
                    case 24:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBackgroundDefault_delegate$lambda$40(resources, theme);
                        break;
                    case 25:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBorderActive_delegate$lambda$41(resources, theme);
                        break;
                    case 26:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBorderDefault_delegate$lambda$42(resources, theme);
                        break;
                    case 27:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryTextDefault_delegate$lambda$43(resources, theme);
                        break;
                    case 28:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlOverlayPrimaryBackgroundActive_delegate$lambda$44(resources, theme);
                        break;
                    default:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlOverlayPrimaryBackgroundDefault_delegate$lambda$45(resources, theme);
                        break;
                }
                return Integer.valueOf(iCardSecondaryBackgroundDefault_delegate$lambda$20);
            }
        });
        final int i32 = 10;
        this.checkboxBackgroundDefault = l.b(new Function0() { // from class: f8.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iCardSecondaryBackgroundDefault_delegate$lambda$20;
                switch (i32) {
                    case 0:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.cardSecondaryBackgroundDefault_delegate$lambda$20(resources, theme);
                        break;
                    case 1:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.channelBackgroundDefault_delegate$lambda$21(resources, theme);
                        break;
                    case 2:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputActionButtonBackground_delegate$lambda$22(resources, theme);
                        break;
                    case 3:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputActionButtonIconDefaultTint_delegate$lambda$23(resources, theme);
                        break;
                    case 4:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputActionIconActiveTint_delegate$lambda$24(resources, theme);
                        break;
                    case 5:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputBackground_delegate$lambda$25(resources, theme);
                        break;
                    case 6:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputIconDefaultTint_delegate$lambda$26(resources, theme);
                        break;
                    case 7:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputSendButtonActiveBackground_delegate$lambda$27(resources, theme);
                        break;
                    case 8:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.spineDefault_delegate$lambda$104(resources, theme);
                        break;
                    case 9:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputSendButtonIconActiveTint_delegate$lambda$28(resources, theme);
                        break;
                    case 10:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBackgroundDefault_delegate$lambda$29(resources, theme);
                        break;
                    case 11:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.backgroundBaseLow_delegate$lambda$2(resources, theme);
                        break;
                    case 12:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBackgroundSelectedDefault_delegate$lambda$30(resources, theme);
                        break;
                    case 13:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBorderDefault_delegate$lambda$31(resources, theme);
                        break;
                    case 14:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBorderSelectedDefault_delegate$lambda$32(resources, theme);
                        break;
                    case 15:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxIconActive_delegate$lambda$33(resources, theme);
                        break;
                    case 16:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBackgroundActive_delegate$lambda$34(resources, theme);
                        break;
                    case 17:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBackgroundDefault_delegate$lambda$35(resources, theme);
                        break;
                    case 18:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBorderActive_delegate$lambda$36(resources, theme);
                        break;
                    case 19:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.spoilerHiddenBackground_delegate$lambda$105(resources, theme);
                        break;
                    case 20:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBorderDefault_delegate$lambda$37(resources, theme);
                        break;
                    case 21:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedTextDefault_delegate$lambda$38(resources, theme);
                        break;
                    case 22:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBackgroundActive_delegate$lambda$39(resources, theme);
                        break;
                    case 23:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.backgroundBaseLower_delegate$lambda$3(resources, theme);
                        break;
                    case 24:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBackgroundDefault_delegate$lambda$40(resources, theme);
                        break;
                    case 25:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBorderActive_delegate$lambda$41(resources, theme);
                        break;
                    case 26:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBorderDefault_delegate$lambda$42(resources, theme);
                        break;
                    case 27:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryTextDefault_delegate$lambda$43(resources, theme);
                        break;
                    case 28:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlOverlayPrimaryBackgroundActive_delegate$lambda$44(resources, theme);
                        break;
                    default:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlOverlayPrimaryBackgroundDefault_delegate$lambda$45(resources, theme);
                        break;
                }
                return Integer.valueOf(iCardSecondaryBackgroundDefault_delegate$lambda$20);
            }
        });
        final int i33 = 12;
        this.checkboxBackgroundSelectedDefault = l.b(new Function0() { // from class: f8.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iCardSecondaryBackgroundDefault_delegate$lambda$20;
                switch (i33) {
                    case 0:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.cardSecondaryBackgroundDefault_delegate$lambda$20(resources, theme);
                        break;
                    case 1:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.channelBackgroundDefault_delegate$lambda$21(resources, theme);
                        break;
                    case 2:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputActionButtonBackground_delegate$lambda$22(resources, theme);
                        break;
                    case 3:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputActionButtonIconDefaultTint_delegate$lambda$23(resources, theme);
                        break;
                    case 4:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputActionIconActiveTint_delegate$lambda$24(resources, theme);
                        break;
                    case 5:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputBackground_delegate$lambda$25(resources, theme);
                        break;
                    case 6:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputIconDefaultTint_delegate$lambda$26(resources, theme);
                        break;
                    case 7:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputSendButtonActiveBackground_delegate$lambda$27(resources, theme);
                        break;
                    case 8:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.spineDefault_delegate$lambda$104(resources, theme);
                        break;
                    case 9:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputSendButtonIconActiveTint_delegate$lambda$28(resources, theme);
                        break;
                    case 10:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBackgroundDefault_delegate$lambda$29(resources, theme);
                        break;
                    case 11:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.backgroundBaseLow_delegate$lambda$2(resources, theme);
                        break;
                    case 12:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBackgroundSelectedDefault_delegate$lambda$30(resources, theme);
                        break;
                    case 13:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBorderDefault_delegate$lambda$31(resources, theme);
                        break;
                    case 14:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBorderSelectedDefault_delegate$lambda$32(resources, theme);
                        break;
                    case 15:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxIconActive_delegate$lambda$33(resources, theme);
                        break;
                    case 16:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBackgroundActive_delegate$lambda$34(resources, theme);
                        break;
                    case 17:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBackgroundDefault_delegate$lambda$35(resources, theme);
                        break;
                    case 18:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBorderActive_delegate$lambda$36(resources, theme);
                        break;
                    case 19:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.spoilerHiddenBackground_delegate$lambda$105(resources, theme);
                        break;
                    case 20:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBorderDefault_delegate$lambda$37(resources, theme);
                        break;
                    case 21:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedTextDefault_delegate$lambda$38(resources, theme);
                        break;
                    case 22:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBackgroundActive_delegate$lambda$39(resources, theme);
                        break;
                    case 23:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.backgroundBaseLower_delegate$lambda$3(resources, theme);
                        break;
                    case 24:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBackgroundDefault_delegate$lambda$40(resources, theme);
                        break;
                    case 25:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBorderActive_delegate$lambda$41(resources, theme);
                        break;
                    case 26:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBorderDefault_delegate$lambda$42(resources, theme);
                        break;
                    case 27:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryTextDefault_delegate$lambda$43(resources, theme);
                        break;
                    case 28:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlOverlayPrimaryBackgroundActive_delegate$lambda$44(resources, theme);
                        break;
                    default:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlOverlayPrimaryBackgroundDefault_delegate$lambda$45(resources, theme);
                        break;
                }
                return Integer.valueOf(iCardSecondaryBackgroundDefault_delegate$lambda$20);
            }
        });
        final int i34 = 13;
        this.checkboxBorderDefault = l.b(new Function0() { // from class: f8.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iCardSecondaryBackgroundDefault_delegate$lambda$20;
                switch (i34) {
                    case 0:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.cardSecondaryBackgroundDefault_delegate$lambda$20(resources, theme);
                        break;
                    case 1:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.channelBackgroundDefault_delegate$lambda$21(resources, theme);
                        break;
                    case 2:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputActionButtonBackground_delegate$lambda$22(resources, theme);
                        break;
                    case 3:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputActionButtonIconDefaultTint_delegate$lambda$23(resources, theme);
                        break;
                    case 4:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputActionIconActiveTint_delegate$lambda$24(resources, theme);
                        break;
                    case 5:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputBackground_delegate$lambda$25(resources, theme);
                        break;
                    case 6:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputIconDefaultTint_delegate$lambda$26(resources, theme);
                        break;
                    case 7:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputSendButtonActiveBackground_delegate$lambda$27(resources, theme);
                        break;
                    case 8:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.spineDefault_delegate$lambda$104(resources, theme);
                        break;
                    case 9:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputSendButtonIconActiveTint_delegate$lambda$28(resources, theme);
                        break;
                    case 10:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBackgroundDefault_delegate$lambda$29(resources, theme);
                        break;
                    case 11:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.backgroundBaseLow_delegate$lambda$2(resources, theme);
                        break;
                    case 12:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBackgroundSelectedDefault_delegate$lambda$30(resources, theme);
                        break;
                    case 13:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBorderDefault_delegate$lambda$31(resources, theme);
                        break;
                    case 14:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBorderSelectedDefault_delegate$lambda$32(resources, theme);
                        break;
                    case 15:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxIconActive_delegate$lambda$33(resources, theme);
                        break;
                    case 16:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBackgroundActive_delegate$lambda$34(resources, theme);
                        break;
                    case 17:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBackgroundDefault_delegate$lambda$35(resources, theme);
                        break;
                    case 18:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBorderActive_delegate$lambda$36(resources, theme);
                        break;
                    case 19:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.spoilerHiddenBackground_delegate$lambda$105(resources, theme);
                        break;
                    case 20:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBorderDefault_delegate$lambda$37(resources, theme);
                        break;
                    case 21:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedTextDefault_delegate$lambda$38(resources, theme);
                        break;
                    case 22:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBackgroundActive_delegate$lambda$39(resources, theme);
                        break;
                    case 23:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.backgroundBaseLower_delegate$lambda$3(resources, theme);
                        break;
                    case 24:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBackgroundDefault_delegate$lambda$40(resources, theme);
                        break;
                    case 25:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBorderActive_delegate$lambda$41(resources, theme);
                        break;
                    case 26:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBorderDefault_delegate$lambda$42(resources, theme);
                        break;
                    case 27:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryTextDefault_delegate$lambda$43(resources, theme);
                        break;
                    case 28:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlOverlayPrimaryBackgroundActive_delegate$lambda$44(resources, theme);
                        break;
                    default:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlOverlayPrimaryBackgroundDefault_delegate$lambda$45(resources, theme);
                        break;
                }
                return Integer.valueOf(iCardSecondaryBackgroundDefault_delegate$lambda$20);
            }
        });
        final int i35 = 14;
        this.checkboxBorderSelectedDefault = l.b(new Function0() { // from class: f8.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iCardSecondaryBackgroundDefault_delegate$lambda$20;
                switch (i35) {
                    case 0:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.cardSecondaryBackgroundDefault_delegate$lambda$20(resources, theme);
                        break;
                    case 1:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.channelBackgroundDefault_delegate$lambda$21(resources, theme);
                        break;
                    case 2:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputActionButtonBackground_delegate$lambda$22(resources, theme);
                        break;
                    case 3:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputActionButtonIconDefaultTint_delegate$lambda$23(resources, theme);
                        break;
                    case 4:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputActionIconActiveTint_delegate$lambda$24(resources, theme);
                        break;
                    case 5:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputBackground_delegate$lambda$25(resources, theme);
                        break;
                    case 6:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputIconDefaultTint_delegate$lambda$26(resources, theme);
                        break;
                    case 7:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputSendButtonActiveBackground_delegate$lambda$27(resources, theme);
                        break;
                    case 8:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.spineDefault_delegate$lambda$104(resources, theme);
                        break;
                    case 9:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputSendButtonIconActiveTint_delegate$lambda$28(resources, theme);
                        break;
                    case 10:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBackgroundDefault_delegate$lambda$29(resources, theme);
                        break;
                    case 11:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.backgroundBaseLow_delegate$lambda$2(resources, theme);
                        break;
                    case 12:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBackgroundSelectedDefault_delegate$lambda$30(resources, theme);
                        break;
                    case 13:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBorderDefault_delegate$lambda$31(resources, theme);
                        break;
                    case 14:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBorderSelectedDefault_delegate$lambda$32(resources, theme);
                        break;
                    case 15:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxIconActive_delegate$lambda$33(resources, theme);
                        break;
                    case 16:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBackgroundActive_delegate$lambda$34(resources, theme);
                        break;
                    case 17:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBackgroundDefault_delegate$lambda$35(resources, theme);
                        break;
                    case 18:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBorderActive_delegate$lambda$36(resources, theme);
                        break;
                    case 19:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.spoilerHiddenBackground_delegate$lambda$105(resources, theme);
                        break;
                    case 20:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBorderDefault_delegate$lambda$37(resources, theme);
                        break;
                    case 21:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedTextDefault_delegate$lambda$38(resources, theme);
                        break;
                    case 22:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBackgroundActive_delegate$lambda$39(resources, theme);
                        break;
                    case 23:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.backgroundBaseLower_delegate$lambda$3(resources, theme);
                        break;
                    case 24:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBackgroundDefault_delegate$lambda$40(resources, theme);
                        break;
                    case 25:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBorderActive_delegate$lambda$41(resources, theme);
                        break;
                    case 26:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBorderDefault_delegate$lambda$42(resources, theme);
                        break;
                    case 27:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryTextDefault_delegate$lambda$43(resources, theme);
                        break;
                    case 28:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlOverlayPrimaryBackgroundActive_delegate$lambda$44(resources, theme);
                        break;
                    default:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlOverlayPrimaryBackgroundDefault_delegate$lambda$45(resources, theme);
                        break;
                }
                return Integer.valueOf(iCardSecondaryBackgroundDefault_delegate$lambda$20);
            }
        });
        final int i36 = 15;
        this.checkboxIconActive = l.b(new Function0() { // from class: f8.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iCardSecondaryBackgroundDefault_delegate$lambda$20;
                switch (i36) {
                    case 0:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.cardSecondaryBackgroundDefault_delegate$lambda$20(resources, theme);
                        break;
                    case 1:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.channelBackgroundDefault_delegate$lambda$21(resources, theme);
                        break;
                    case 2:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputActionButtonBackground_delegate$lambda$22(resources, theme);
                        break;
                    case 3:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputActionButtonIconDefaultTint_delegate$lambda$23(resources, theme);
                        break;
                    case 4:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputActionIconActiveTint_delegate$lambda$24(resources, theme);
                        break;
                    case 5:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputBackground_delegate$lambda$25(resources, theme);
                        break;
                    case 6:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputIconDefaultTint_delegate$lambda$26(resources, theme);
                        break;
                    case 7:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputSendButtonActiveBackground_delegate$lambda$27(resources, theme);
                        break;
                    case 8:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.spineDefault_delegate$lambda$104(resources, theme);
                        break;
                    case 9:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputSendButtonIconActiveTint_delegate$lambda$28(resources, theme);
                        break;
                    case 10:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBackgroundDefault_delegate$lambda$29(resources, theme);
                        break;
                    case 11:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.backgroundBaseLow_delegate$lambda$2(resources, theme);
                        break;
                    case 12:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBackgroundSelectedDefault_delegate$lambda$30(resources, theme);
                        break;
                    case 13:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBorderDefault_delegate$lambda$31(resources, theme);
                        break;
                    case 14:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBorderSelectedDefault_delegate$lambda$32(resources, theme);
                        break;
                    case 15:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxIconActive_delegate$lambda$33(resources, theme);
                        break;
                    case 16:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBackgroundActive_delegate$lambda$34(resources, theme);
                        break;
                    case 17:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBackgroundDefault_delegate$lambda$35(resources, theme);
                        break;
                    case 18:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBorderActive_delegate$lambda$36(resources, theme);
                        break;
                    case 19:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.spoilerHiddenBackground_delegate$lambda$105(resources, theme);
                        break;
                    case 20:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBorderDefault_delegate$lambda$37(resources, theme);
                        break;
                    case 21:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedTextDefault_delegate$lambda$38(resources, theme);
                        break;
                    case 22:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBackgroundActive_delegate$lambda$39(resources, theme);
                        break;
                    case 23:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.backgroundBaseLower_delegate$lambda$3(resources, theme);
                        break;
                    case 24:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBackgroundDefault_delegate$lambda$40(resources, theme);
                        break;
                    case 25:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBorderActive_delegate$lambda$41(resources, theme);
                        break;
                    case 26:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBorderDefault_delegate$lambda$42(resources, theme);
                        break;
                    case 27:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryTextDefault_delegate$lambda$43(resources, theme);
                        break;
                    case 28:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlOverlayPrimaryBackgroundActive_delegate$lambda$44(resources, theme);
                        break;
                    default:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlOverlayPrimaryBackgroundDefault_delegate$lambda$45(resources, theme);
                        break;
                }
                return Integer.valueOf(iCardSecondaryBackgroundDefault_delegate$lambda$20);
            }
        });
        final int i37 = 16;
        this.controlConnectedBackgroundActive = l.b(new Function0() { // from class: f8.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iCardSecondaryBackgroundDefault_delegate$lambda$20;
                switch (i37) {
                    case 0:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.cardSecondaryBackgroundDefault_delegate$lambda$20(resources, theme);
                        break;
                    case 1:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.channelBackgroundDefault_delegate$lambda$21(resources, theme);
                        break;
                    case 2:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputActionButtonBackground_delegate$lambda$22(resources, theme);
                        break;
                    case 3:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputActionButtonIconDefaultTint_delegate$lambda$23(resources, theme);
                        break;
                    case 4:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputActionIconActiveTint_delegate$lambda$24(resources, theme);
                        break;
                    case 5:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputBackground_delegate$lambda$25(resources, theme);
                        break;
                    case 6:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputIconDefaultTint_delegate$lambda$26(resources, theme);
                        break;
                    case 7:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputSendButtonActiveBackground_delegate$lambda$27(resources, theme);
                        break;
                    case 8:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.spineDefault_delegate$lambda$104(resources, theme);
                        break;
                    case 9:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputSendButtonIconActiveTint_delegate$lambda$28(resources, theme);
                        break;
                    case 10:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBackgroundDefault_delegate$lambda$29(resources, theme);
                        break;
                    case 11:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.backgroundBaseLow_delegate$lambda$2(resources, theme);
                        break;
                    case 12:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBackgroundSelectedDefault_delegate$lambda$30(resources, theme);
                        break;
                    case 13:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBorderDefault_delegate$lambda$31(resources, theme);
                        break;
                    case 14:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBorderSelectedDefault_delegate$lambda$32(resources, theme);
                        break;
                    case 15:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxIconActive_delegate$lambda$33(resources, theme);
                        break;
                    case 16:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBackgroundActive_delegate$lambda$34(resources, theme);
                        break;
                    case 17:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBackgroundDefault_delegate$lambda$35(resources, theme);
                        break;
                    case 18:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBorderActive_delegate$lambda$36(resources, theme);
                        break;
                    case 19:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.spoilerHiddenBackground_delegate$lambda$105(resources, theme);
                        break;
                    case 20:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBorderDefault_delegate$lambda$37(resources, theme);
                        break;
                    case 21:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedTextDefault_delegate$lambda$38(resources, theme);
                        break;
                    case 22:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBackgroundActive_delegate$lambda$39(resources, theme);
                        break;
                    case 23:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.backgroundBaseLower_delegate$lambda$3(resources, theme);
                        break;
                    case 24:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBackgroundDefault_delegate$lambda$40(resources, theme);
                        break;
                    case 25:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBorderActive_delegate$lambda$41(resources, theme);
                        break;
                    case 26:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBorderDefault_delegate$lambda$42(resources, theme);
                        break;
                    case 27:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryTextDefault_delegate$lambda$43(resources, theme);
                        break;
                    case 28:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlOverlayPrimaryBackgroundActive_delegate$lambda$44(resources, theme);
                        break;
                    default:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlOverlayPrimaryBackgroundDefault_delegate$lambda$45(resources, theme);
                        break;
                }
                return Integer.valueOf(iCardSecondaryBackgroundDefault_delegate$lambda$20);
            }
        });
        final int i38 = 17;
        this.controlConnectedBackgroundDefault = l.b(new Function0() { // from class: f8.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iCardSecondaryBackgroundDefault_delegate$lambda$20;
                switch (i38) {
                    case 0:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.cardSecondaryBackgroundDefault_delegate$lambda$20(resources, theme);
                        break;
                    case 1:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.channelBackgroundDefault_delegate$lambda$21(resources, theme);
                        break;
                    case 2:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputActionButtonBackground_delegate$lambda$22(resources, theme);
                        break;
                    case 3:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputActionButtonIconDefaultTint_delegate$lambda$23(resources, theme);
                        break;
                    case 4:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputActionIconActiveTint_delegate$lambda$24(resources, theme);
                        break;
                    case 5:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputBackground_delegate$lambda$25(resources, theme);
                        break;
                    case 6:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputIconDefaultTint_delegate$lambda$26(resources, theme);
                        break;
                    case 7:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputSendButtonActiveBackground_delegate$lambda$27(resources, theme);
                        break;
                    case 8:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.spineDefault_delegate$lambda$104(resources, theme);
                        break;
                    case 9:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputSendButtonIconActiveTint_delegate$lambda$28(resources, theme);
                        break;
                    case 10:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBackgroundDefault_delegate$lambda$29(resources, theme);
                        break;
                    case 11:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.backgroundBaseLow_delegate$lambda$2(resources, theme);
                        break;
                    case 12:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBackgroundSelectedDefault_delegate$lambda$30(resources, theme);
                        break;
                    case 13:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBorderDefault_delegate$lambda$31(resources, theme);
                        break;
                    case 14:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBorderSelectedDefault_delegate$lambda$32(resources, theme);
                        break;
                    case 15:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxIconActive_delegate$lambda$33(resources, theme);
                        break;
                    case 16:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBackgroundActive_delegate$lambda$34(resources, theme);
                        break;
                    case 17:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBackgroundDefault_delegate$lambda$35(resources, theme);
                        break;
                    case 18:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBorderActive_delegate$lambda$36(resources, theme);
                        break;
                    case 19:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.spoilerHiddenBackground_delegate$lambda$105(resources, theme);
                        break;
                    case 20:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBorderDefault_delegate$lambda$37(resources, theme);
                        break;
                    case 21:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedTextDefault_delegate$lambda$38(resources, theme);
                        break;
                    case 22:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBackgroundActive_delegate$lambda$39(resources, theme);
                        break;
                    case 23:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.backgroundBaseLower_delegate$lambda$3(resources, theme);
                        break;
                    case 24:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBackgroundDefault_delegate$lambda$40(resources, theme);
                        break;
                    case 25:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBorderActive_delegate$lambda$41(resources, theme);
                        break;
                    case 26:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBorderDefault_delegate$lambda$42(resources, theme);
                        break;
                    case 27:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryTextDefault_delegate$lambda$43(resources, theme);
                        break;
                    case 28:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlOverlayPrimaryBackgroundActive_delegate$lambda$44(resources, theme);
                        break;
                    default:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlOverlayPrimaryBackgroundDefault_delegate$lambda$45(resources, theme);
                        break;
                }
                return Integer.valueOf(iCardSecondaryBackgroundDefault_delegate$lambda$20);
            }
        });
        final int i39 = 18;
        this.controlConnectedBorderActive = l.b(new Function0() { // from class: f8.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iCardSecondaryBackgroundDefault_delegate$lambda$20;
                switch (i39) {
                    case 0:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.cardSecondaryBackgroundDefault_delegate$lambda$20(resources, theme);
                        break;
                    case 1:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.channelBackgroundDefault_delegate$lambda$21(resources, theme);
                        break;
                    case 2:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputActionButtonBackground_delegate$lambda$22(resources, theme);
                        break;
                    case 3:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputActionButtonIconDefaultTint_delegate$lambda$23(resources, theme);
                        break;
                    case 4:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputActionIconActiveTint_delegate$lambda$24(resources, theme);
                        break;
                    case 5:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputBackground_delegate$lambda$25(resources, theme);
                        break;
                    case 6:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputIconDefaultTint_delegate$lambda$26(resources, theme);
                        break;
                    case 7:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputSendButtonActiveBackground_delegate$lambda$27(resources, theme);
                        break;
                    case 8:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.spineDefault_delegate$lambda$104(resources, theme);
                        break;
                    case 9:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputSendButtonIconActiveTint_delegate$lambda$28(resources, theme);
                        break;
                    case 10:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBackgroundDefault_delegate$lambda$29(resources, theme);
                        break;
                    case 11:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.backgroundBaseLow_delegate$lambda$2(resources, theme);
                        break;
                    case 12:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBackgroundSelectedDefault_delegate$lambda$30(resources, theme);
                        break;
                    case 13:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBorderDefault_delegate$lambda$31(resources, theme);
                        break;
                    case 14:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBorderSelectedDefault_delegate$lambda$32(resources, theme);
                        break;
                    case 15:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxIconActive_delegate$lambda$33(resources, theme);
                        break;
                    case 16:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBackgroundActive_delegate$lambda$34(resources, theme);
                        break;
                    case 17:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBackgroundDefault_delegate$lambda$35(resources, theme);
                        break;
                    case 18:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBorderActive_delegate$lambda$36(resources, theme);
                        break;
                    case 19:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.spoilerHiddenBackground_delegate$lambda$105(resources, theme);
                        break;
                    case 20:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBorderDefault_delegate$lambda$37(resources, theme);
                        break;
                    case 21:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedTextDefault_delegate$lambda$38(resources, theme);
                        break;
                    case 22:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBackgroundActive_delegate$lambda$39(resources, theme);
                        break;
                    case 23:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.backgroundBaseLower_delegate$lambda$3(resources, theme);
                        break;
                    case 24:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBackgroundDefault_delegate$lambda$40(resources, theme);
                        break;
                    case 25:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBorderActive_delegate$lambda$41(resources, theme);
                        break;
                    case 26:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBorderDefault_delegate$lambda$42(resources, theme);
                        break;
                    case 27:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryTextDefault_delegate$lambda$43(resources, theme);
                        break;
                    case 28:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlOverlayPrimaryBackgroundActive_delegate$lambda$44(resources, theme);
                        break;
                    default:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlOverlayPrimaryBackgroundDefault_delegate$lambda$45(resources, theme);
                        break;
                }
                return Integer.valueOf(iCardSecondaryBackgroundDefault_delegate$lambda$20);
            }
        });
        final int i40 = 20;
        this.controlConnectedBorderDefault = l.b(new Function0() { // from class: f8.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iCardSecondaryBackgroundDefault_delegate$lambda$20;
                switch (i40) {
                    case 0:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.cardSecondaryBackgroundDefault_delegate$lambda$20(resources, theme);
                        break;
                    case 1:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.channelBackgroundDefault_delegate$lambda$21(resources, theme);
                        break;
                    case 2:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputActionButtonBackground_delegate$lambda$22(resources, theme);
                        break;
                    case 3:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputActionButtonIconDefaultTint_delegate$lambda$23(resources, theme);
                        break;
                    case 4:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputActionIconActiveTint_delegate$lambda$24(resources, theme);
                        break;
                    case 5:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputBackground_delegate$lambda$25(resources, theme);
                        break;
                    case 6:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputIconDefaultTint_delegate$lambda$26(resources, theme);
                        break;
                    case 7:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputSendButtonActiveBackground_delegate$lambda$27(resources, theme);
                        break;
                    case 8:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.spineDefault_delegate$lambda$104(resources, theme);
                        break;
                    case 9:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputSendButtonIconActiveTint_delegate$lambda$28(resources, theme);
                        break;
                    case 10:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBackgroundDefault_delegate$lambda$29(resources, theme);
                        break;
                    case 11:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.backgroundBaseLow_delegate$lambda$2(resources, theme);
                        break;
                    case 12:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBackgroundSelectedDefault_delegate$lambda$30(resources, theme);
                        break;
                    case 13:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBorderDefault_delegate$lambda$31(resources, theme);
                        break;
                    case 14:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBorderSelectedDefault_delegate$lambda$32(resources, theme);
                        break;
                    case 15:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxIconActive_delegate$lambda$33(resources, theme);
                        break;
                    case 16:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBackgroundActive_delegate$lambda$34(resources, theme);
                        break;
                    case 17:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBackgroundDefault_delegate$lambda$35(resources, theme);
                        break;
                    case 18:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBorderActive_delegate$lambda$36(resources, theme);
                        break;
                    case 19:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.spoilerHiddenBackground_delegate$lambda$105(resources, theme);
                        break;
                    case 20:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBorderDefault_delegate$lambda$37(resources, theme);
                        break;
                    case 21:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedTextDefault_delegate$lambda$38(resources, theme);
                        break;
                    case 22:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBackgroundActive_delegate$lambda$39(resources, theme);
                        break;
                    case 23:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.backgroundBaseLower_delegate$lambda$3(resources, theme);
                        break;
                    case 24:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBackgroundDefault_delegate$lambda$40(resources, theme);
                        break;
                    case 25:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBorderActive_delegate$lambda$41(resources, theme);
                        break;
                    case 26:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBorderDefault_delegate$lambda$42(resources, theme);
                        break;
                    case 27:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryTextDefault_delegate$lambda$43(resources, theme);
                        break;
                    case 28:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlOverlayPrimaryBackgroundActive_delegate$lambda$44(resources, theme);
                        break;
                    default:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlOverlayPrimaryBackgroundDefault_delegate$lambda$45(resources, theme);
                        break;
                }
                return Integer.valueOf(iCardSecondaryBackgroundDefault_delegate$lambda$20);
            }
        });
        final int i41 = 21;
        this.controlConnectedTextDefault = l.b(new Function0() { // from class: f8.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iCardSecondaryBackgroundDefault_delegate$lambda$20;
                switch (i41) {
                    case 0:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.cardSecondaryBackgroundDefault_delegate$lambda$20(resources, theme);
                        break;
                    case 1:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.channelBackgroundDefault_delegate$lambda$21(resources, theme);
                        break;
                    case 2:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputActionButtonBackground_delegate$lambda$22(resources, theme);
                        break;
                    case 3:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputActionButtonIconDefaultTint_delegate$lambda$23(resources, theme);
                        break;
                    case 4:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputActionIconActiveTint_delegate$lambda$24(resources, theme);
                        break;
                    case 5:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputBackground_delegate$lambda$25(resources, theme);
                        break;
                    case 6:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputIconDefaultTint_delegate$lambda$26(resources, theme);
                        break;
                    case 7:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputSendButtonActiveBackground_delegate$lambda$27(resources, theme);
                        break;
                    case 8:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.spineDefault_delegate$lambda$104(resources, theme);
                        break;
                    case 9:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputSendButtonIconActiveTint_delegate$lambda$28(resources, theme);
                        break;
                    case 10:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBackgroundDefault_delegate$lambda$29(resources, theme);
                        break;
                    case 11:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.backgroundBaseLow_delegate$lambda$2(resources, theme);
                        break;
                    case 12:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBackgroundSelectedDefault_delegate$lambda$30(resources, theme);
                        break;
                    case 13:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBorderDefault_delegate$lambda$31(resources, theme);
                        break;
                    case 14:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBorderSelectedDefault_delegate$lambda$32(resources, theme);
                        break;
                    case 15:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxIconActive_delegate$lambda$33(resources, theme);
                        break;
                    case 16:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBackgroundActive_delegate$lambda$34(resources, theme);
                        break;
                    case 17:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBackgroundDefault_delegate$lambda$35(resources, theme);
                        break;
                    case 18:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBorderActive_delegate$lambda$36(resources, theme);
                        break;
                    case 19:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.spoilerHiddenBackground_delegate$lambda$105(resources, theme);
                        break;
                    case 20:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBorderDefault_delegate$lambda$37(resources, theme);
                        break;
                    case 21:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedTextDefault_delegate$lambda$38(resources, theme);
                        break;
                    case 22:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBackgroundActive_delegate$lambda$39(resources, theme);
                        break;
                    case 23:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.backgroundBaseLower_delegate$lambda$3(resources, theme);
                        break;
                    case 24:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBackgroundDefault_delegate$lambda$40(resources, theme);
                        break;
                    case 25:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBorderActive_delegate$lambda$41(resources, theme);
                        break;
                    case 26:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBorderDefault_delegate$lambda$42(resources, theme);
                        break;
                    case 27:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryTextDefault_delegate$lambda$43(resources, theme);
                        break;
                    case 28:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlOverlayPrimaryBackgroundActive_delegate$lambda$44(resources, theme);
                        break;
                    default:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlOverlayPrimaryBackgroundDefault_delegate$lambda$45(resources, theme);
                        break;
                }
                return Integer.valueOf(iCardSecondaryBackgroundDefault_delegate$lambda$20);
            }
        });
        final int i42 = 22;
        this.controlCriticalPrimaryBackgroundActive = l.b(new Function0() { // from class: f8.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iCardSecondaryBackgroundDefault_delegate$lambda$20;
                switch (i42) {
                    case 0:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.cardSecondaryBackgroundDefault_delegate$lambda$20(resources, theme);
                        break;
                    case 1:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.channelBackgroundDefault_delegate$lambda$21(resources, theme);
                        break;
                    case 2:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputActionButtonBackground_delegate$lambda$22(resources, theme);
                        break;
                    case 3:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputActionButtonIconDefaultTint_delegate$lambda$23(resources, theme);
                        break;
                    case 4:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputActionIconActiveTint_delegate$lambda$24(resources, theme);
                        break;
                    case 5:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputBackground_delegate$lambda$25(resources, theme);
                        break;
                    case 6:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputIconDefaultTint_delegate$lambda$26(resources, theme);
                        break;
                    case 7:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputSendButtonActiveBackground_delegate$lambda$27(resources, theme);
                        break;
                    case 8:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.spineDefault_delegate$lambda$104(resources, theme);
                        break;
                    case 9:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputSendButtonIconActiveTint_delegate$lambda$28(resources, theme);
                        break;
                    case 10:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBackgroundDefault_delegate$lambda$29(resources, theme);
                        break;
                    case 11:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.backgroundBaseLow_delegate$lambda$2(resources, theme);
                        break;
                    case 12:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBackgroundSelectedDefault_delegate$lambda$30(resources, theme);
                        break;
                    case 13:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBorderDefault_delegate$lambda$31(resources, theme);
                        break;
                    case 14:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBorderSelectedDefault_delegate$lambda$32(resources, theme);
                        break;
                    case 15:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxIconActive_delegate$lambda$33(resources, theme);
                        break;
                    case 16:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBackgroundActive_delegate$lambda$34(resources, theme);
                        break;
                    case 17:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBackgroundDefault_delegate$lambda$35(resources, theme);
                        break;
                    case 18:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBorderActive_delegate$lambda$36(resources, theme);
                        break;
                    case 19:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.spoilerHiddenBackground_delegate$lambda$105(resources, theme);
                        break;
                    case 20:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBorderDefault_delegate$lambda$37(resources, theme);
                        break;
                    case 21:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedTextDefault_delegate$lambda$38(resources, theme);
                        break;
                    case 22:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBackgroundActive_delegate$lambda$39(resources, theme);
                        break;
                    case 23:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.backgroundBaseLower_delegate$lambda$3(resources, theme);
                        break;
                    case 24:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBackgroundDefault_delegate$lambda$40(resources, theme);
                        break;
                    case 25:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBorderActive_delegate$lambda$41(resources, theme);
                        break;
                    case 26:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBorderDefault_delegate$lambda$42(resources, theme);
                        break;
                    case 27:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryTextDefault_delegate$lambda$43(resources, theme);
                        break;
                    case 28:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlOverlayPrimaryBackgroundActive_delegate$lambda$44(resources, theme);
                        break;
                    default:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlOverlayPrimaryBackgroundDefault_delegate$lambda$45(resources, theme);
                        break;
                }
                return Integer.valueOf(iCardSecondaryBackgroundDefault_delegate$lambda$20);
            }
        });
        final int i43 = 24;
        this.controlCriticalPrimaryBackgroundDefault = l.b(new Function0() { // from class: f8.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iCardSecondaryBackgroundDefault_delegate$lambda$20;
                switch (i43) {
                    case 0:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.cardSecondaryBackgroundDefault_delegate$lambda$20(resources, theme);
                        break;
                    case 1:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.channelBackgroundDefault_delegate$lambda$21(resources, theme);
                        break;
                    case 2:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputActionButtonBackground_delegate$lambda$22(resources, theme);
                        break;
                    case 3:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputActionButtonIconDefaultTint_delegate$lambda$23(resources, theme);
                        break;
                    case 4:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputActionIconActiveTint_delegate$lambda$24(resources, theme);
                        break;
                    case 5:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputBackground_delegate$lambda$25(resources, theme);
                        break;
                    case 6:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputIconDefaultTint_delegate$lambda$26(resources, theme);
                        break;
                    case 7:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputSendButtonActiveBackground_delegate$lambda$27(resources, theme);
                        break;
                    case 8:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.spineDefault_delegate$lambda$104(resources, theme);
                        break;
                    case 9:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputSendButtonIconActiveTint_delegate$lambda$28(resources, theme);
                        break;
                    case 10:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBackgroundDefault_delegate$lambda$29(resources, theme);
                        break;
                    case 11:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.backgroundBaseLow_delegate$lambda$2(resources, theme);
                        break;
                    case 12:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBackgroundSelectedDefault_delegate$lambda$30(resources, theme);
                        break;
                    case 13:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBorderDefault_delegate$lambda$31(resources, theme);
                        break;
                    case 14:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBorderSelectedDefault_delegate$lambda$32(resources, theme);
                        break;
                    case 15:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxIconActive_delegate$lambda$33(resources, theme);
                        break;
                    case 16:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBackgroundActive_delegate$lambda$34(resources, theme);
                        break;
                    case 17:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBackgroundDefault_delegate$lambda$35(resources, theme);
                        break;
                    case 18:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBorderActive_delegate$lambda$36(resources, theme);
                        break;
                    case 19:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.spoilerHiddenBackground_delegate$lambda$105(resources, theme);
                        break;
                    case 20:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBorderDefault_delegate$lambda$37(resources, theme);
                        break;
                    case 21:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedTextDefault_delegate$lambda$38(resources, theme);
                        break;
                    case 22:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBackgroundActive_delegate$lambda$39(resources, theme);
                        break;
                    case 23:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.backgroundBaseLower_delegate$lambda$3(resources, theme);
                        break;
                    case 24:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBackgroundDefault_delegate$lambda$40(resources, theme);
                        break;
                    case 25:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBorderActive_delegate$lambda$41(resources, theme);
                        break;
                    case 26:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBorderDefault_delegate$lambda$42(resources, theme);
                        break;
                    case 27:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryTextDefault_delegate$lambda$43(resources, theme);
                        break;
                    case 28:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlOverlayPrimaryBackgroundActive_delegate$lambda$44(resources, theme);
                        break;
                    default:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlOverlayPrimaryBackgroundDefault_delegate$lambda$45(resources, theme);
                        break;
                }
                return Integer.valueOf(iCardSecondaryBackgroundDefault_delegate$lambda$20);
            }
        });
        final int i44 = 25;
        this.controlCriticalPrimaryBorderActive = l.b(new Function0() { // from class: f8.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iCardSecondaryBackgroundDefault_delegate$lambda$20;
                switch (i44) {
                    case 0:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.cardSecondaryBackgroundDefault_delegate$lambda$20(resources, theme);
                        break;
                    case 1:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.channelBackgroundDefault_delegate$lambda$21(resources, theme);
                        break;
                    case 2:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputActionButtonBackground_delegate$lambda$22(resources, theme);
                        break;
                    case 3:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputActionButtonIconDefaultTint_delegate$lambda$23(resources, theme);
                        break;
                    case 4:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputActionIconActiveTint_delegate$lambda$24(resources, theme);
                        break;
                    case 5:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputBackground_delegate$lambda$25(resources, theme);
                        break;
                    case 6:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputIconDefaultTint_delegate$lambda$26(resources, theme);
                        break;
                    case 7:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputSendButtonActiveBackground_delegate$lambda$27(resources, theme);
                        break;
                    case 8:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.spineDefault_delegate$lambda$104(resources, theme);
                        break;
                    case 9:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputSendButtonIconActiveTint_delegate$lambda$28(resources, theme);
                        break;
                    case 10:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBackgroundDefault_delegate$lambda$29(resources, theme);
                        break;
                    case 11:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.backgroundBaseLow_delegate$lambda$2(resources, theme);
                        break;
                    case 12:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBackgroundSelectedDefault_delegate$lambda$30(resources, theme);
                        break;
                    case 13:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBorderDefault_delegate$lambda$31(resources, theme);
                        break;
                    case 14:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBorderSelectedDefault_delegate$lambda$32(resources, theme);
                        break;
                    case 15:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxIconActive_delegate$lambda$33(resources, theme);
                        break;
                    case 16:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBackgroundActive_delegate$lambda$34(resources, theme);
                        break;
                    case 17:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBackgroundDefault_delegate$lambda$35(resources, theme);
                        break;
                    case 18:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBorderActive_delegate$lambda$36(resources, theme);
                        break;
                    case 19:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.spoilerHiddenBackground_delegate$lambda$105(resources, theme);
                        break;
                    case 20:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBorderDefault_delegate$lambda$37(resources, theme);
                        break;
                    case 21:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedTextDefault_delegate$lambda$38(resources, theme);
                        break;
                    case 22:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBackgroundActive_delegate$lambda$39(resources, theme);
                        break;
                    case 23:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.backgroundBaseLower_delegate$lambda$3(resources, theme);
                        break;
                    case 24:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBackgroundDefault_delegate$lambda$40(resources, theme);
                        break;
                    case 25:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBorderActive_delegate$lambda$41(resources, theme);
                        break;
                    case 26:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBorderDefault_delegate$lambda$42(resources, theme);
                        break;
                    case 27:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryTextDefault_delegate$lambda$43(resources, theme);
                        break;
                    case 28:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlOverlayPrimaryBackgroundActive_delegate$lambda$44(resources, theme);
                        break;
                    default:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlOverlayPrimaryBackgroundDefault_delegate$lambda$45(resources, theme);
                        break;
                }
                return Integer.valueOf(iCardSecondaryBackgroundDefault_delegate$lambda$20);
            }
        });
        final int i45 = 26;
        this.controlCriticalPrimaryBorderDefault = l.b(new Function0() { // from class: f8.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iCardSecondaryBackgroundDefault_delegate$lambda$20;
                switch (i45) {
                    case 0:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.cardSecondaryBackgroundDefault_delegate$lambda$20(resources, theme);
                        break;
                    case 1:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.channelBackgroundDefault_delegate$lambda$21(resources, theme);
                        break;
                    case 2:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputActionButtonBackground_delegate$lambda$22(resources, theme);
                        break;
                    case 3:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputActionButtonIconDefaultTint_delegate$lambda$23(resources, theme);
                        break;
                    case 4:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputActionIconActiveTint_delegate$lambda$24(resources, theme);
                        break;
                    case 5:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputBackground_delegate$lambda$25(resources, theme);
                        break;
                    case 6:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputIconDefaultTint_delegate$lambda$26(resources, theme);
                        break;
                    case 7:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputSendButtonActiveBackground_delegate$lambda$27(resources, theme);
                        break;
                    case 8:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.spineDefault_delegate$lambda$104(resources, theme);
                        break;
                    case 9:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputSendButtonIconActiveTint_delegate$lambda$28(resources, theme);
                        break;
                    case 10:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBackgroundDefault_delegate$lambda$29(resources, theme);
                        break;
                    case 11:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.backgroundBaseLow_delegate$lambda$2(resources, theme);
                        break;
                    case 12:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBackgroundSelectedDefault_delegate$lambda$30(resources, theme);
                        break;
                    case 13:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBorderDefault_delegate$lambda$31(resources, theme);
                        break;
                    case 14:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBorderSelectedDefault_delegate$lambda$32(resources, theme);
                        break;
                    case 15:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxIconActive_delegate$lambda$33(resources, theme);
                        break;
                    case 16:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBackgroundActive_delegate$lambda$34(resources, theme);
                        break;
                    case 17:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBackgroundDefault_delegate$lambda$35(resources, theme);
                        break;
                    case 18:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBorderActive_delegate$lambda$36(resources, theme);
                        break;
                    case 19:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.spoilerHiddenBackground_delegate$lambda$105(resources, theme);
                        break;
                    case 20:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBorderDefault_delegate$lambda$37(resources, theme);
                        break;
                    case 21:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedTextDefault_delegate$lambda$38(resources, theme);
                        break;
                    case 22:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBackgroundActive_delegate$lambda$39(resources, theme);
                        break;
                    case 23:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.backgroundBaseLower_delegate$lambda$3(resources, theme);
                        break;
                    case 24:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBackgroundDefault_delegate$lambda$40(resources, theme);
                        break;
                    case 25:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBorderActive_delegate$lambda$41(resources, theme);
                        break;
                    case 26:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBorderDefault_delegate$lambda$42(resources, theme);
                        break;
                    case 27:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryTextDefault_delegate$lambda$43(resources, theme);
                        break;
                    case 28:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlOverlayPrimaryBackgroundActive_delegate$lambda$44(resources, theme);
                        break;
                    default:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlOverlayPrimaryBackgroundDefault_delegate$lambda$45(resources, theme);
                        break;
                }
                return Integer.valueOf(iCardSecondaryBackgroundDefault_delegate$lambda$20);
            }
        });
        final int i46 = 27;
        this.controlCriticalPrimaryTextDefault = l.b(new Function0() { // from class: f8.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iCardSecondaryBackgroundDefault_delegate$lambda$20;
                switch (i46) {
                    case 0:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.cardSecondaryBackgroundDefault_delegate$lambda$20(resources, theme);
                        break;
                    case 1:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.channelBackgroundDefault_delegate$lambda$21(resources, theme);
                        break;
                    case 2:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputActionButtonBackground_delegate$lambda$22(resources, theme);
                        break;
                    case 3:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputActionButtonIconDefaultTint_delegate$lambda$23(resources, theme);
                        break;
                    case 4:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputActionIconActiveTint_delegate$lambda$24(resources, theme);
                        break;
                    case 5:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputBackground_delegate$lambda$25(resources, theme);
                        break;
                    case 6:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputIconDefaultTint_delegate$lambda$26(resources, theme);
                        break;
                    case 7:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputSendButtonActiveBackground_delegate$lambda$27(resources, theme);
                        break;
                    case 8:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.spineDefault_delegate$lambda$104(resources, theme);
                        break;
                    case 9:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputSendButtonIconActiveTint_delegate$lambda$28(resources, theme);
                        break;
                    case 10:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBackgroundDefault_delegate$lambda$29(resources, theme);
                        break;
                    case 11:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.backgroundBaseLow_delegate$lambda$2(resources, theme);
                        break;
                    case 12:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBackgroundSelectedDefault_delegate$lambda$30(resources, theme);
                        break;
                    case 13:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBorderDefault_delegate$lambda$31(resources, theme);
                        break;
                    case 14:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBorderSelectedDefault_delegate$lambda$32(resources, theme);
                        break;
                    case 15:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxIconActive_delegate$lambda$33(resources, theme);
                        break;
                    case 16:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBackgroundActive_delegate$lambda$34(resources, theme);
                        break;
                    case 17:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBackgroundDefault_delegate$lambda$35(resources, theme);
                        break;
                    case 18:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBorderActive_delegate$lambda$36(resources, theme);
                        break;
                    case 19:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.spoilerHiddenBackground_delegate$lambda$105(resources, theme);
                        break;
                    case 20:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBorderDefault_delegate$lambda$37(resources, theme);
                        break;
                    case 21:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedTextDefault_delegate$lambda$38(resources, theme);
                        break;
                    case 22:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBackgroundActive_delegate$lambda$39(resources, theme);
                        break;
                    case 23:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.backgroundBaseLower_delegate$lambda$3(resources, theme);
                        break;
                    case 24:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBackgroundDefault_delegate$lambda$40(resources, theme);
                        break;
                    case 25:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBorderActive_delegate$lambda$41(resources, theme);
                        break;
                    case 26:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBorderDefault_delegate$lambda$42(resources, theme);
                        break;
                    case 27:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryTextDefault_delegate$lambda$43(resources, theme);
                        break;
                    case 28:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlOverlayPrimaryBackgroundActive_delegate$lambda$44(resources, theme);
                        break;
                    default:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlOverlayPrimaryBackgroundDefault_delegate$lambda$45(resources, theme);
                        break;
                }
                return Integer.valueOf(iCardSecondaryBackgroundDefault_delegate$lambda$20);
            }
        });
        final int i47 = 28;
        this.controlOverlayPrimaryBackgroundActive = l.b(new Function0() { // from class: f8.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iCardSecondaryBackgroundDefault_delegate$lambda$20;
                switch (i47) {
                    case 0:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.cardSecondaryBackgroundDefault_delegate$lambda$20(resources, theme);
                        break;
                    case 1:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.channelBackgroundDefault_delegate$lambda$21(resources, theme);
                        break;
                    case 2:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputActionButtonBackground_delegate$lambda$22(resources, theme);
                        break;
                    case 3:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputActionButtonIconDefaultTint_delegate$lambda$23(resources, theme);
                        break;
                    case 4:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputActionIconActiveTint_delegate$lambda$24(resources, theme);
                        break;
                    case 5:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputBackground_delegate$lambda$25(resources, theme);
                        break;
                    case 6:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputIconDefaultTint_delegate$lambda$26(resources, theme);
                        break;
                    case 7:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputSendButtonActiveBackground_delegate$lambda$27(resources, theme);
                        break;
                    case 8:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.spineDefault_delegate$lambda$104(resources, theme);
                        break;
                    case 9:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputSendButtonIconActiveTint_delegate$lambda$28(resources, theme);
                        break;
                    case 10:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBackgroundDefault_delegate$lambda$29(resources, theme);
                        break;
                    case 11:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.backgroundBaseLow_delegate$lambda$2(resources, theme);
                        break;
                    case 12:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBackgroundSelectedDefault_delegate$lambda$30(resources, theme);
                        break;
                    case 13:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBorderDefault_delegate$lambda$31(resources, theme);
                        break;
                    case 14:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBorderSelectedDefault_delegate$lambda$32(resources, theme);
                        break;
                    case 15:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxIconActive_delegate$lambda$33(resources, theme);
                        break;
                    case 16:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBackgroundActive_delegate$lambda$34(resources, theme);
                        break;
                    case 17:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBackgroundDefault_delegate$lambda$35(resources, theme);
                        break;
                    case 18:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBorderActive_delegate$lambda$36(resources, theme);
                        break;
                    case 19:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.spoilerHiddenBackground_delegate$lambda$105(resources, theme);
                        break;
                    case 20:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBorderDefault_delegate$lambda$37(resources, theme);
                        break;
                    case 21:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedTextDefault_delegate$lambda$38(resources, theme);
                        break;
                    case 22:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBackgroundActive_delegate$lambda$39(resources, theme);
                        break;
                    case 23:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.backgroundBaseLower_delegate$lambda$3(resources, theme);
                        break;
                    case 24:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBackgroundDefault_delegate$lambda$40(resources, theme);
                        break;
                    case 25:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBorderActive_delegate$lambda$41(resources, theme);
                        break;
                    case 26:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBorderDefault_delegate$lambda$42(resources, theme);
                        break;
                    case 27:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryTextDefault_delegate$lambda$43(resources, theme);
                        break;
                    case 28:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlOverlayPrimaryBackgroundActive_delegate$lambda$44(resources, theme);
                        break;
                    default:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlOverlayPrimaryBackgroundDefault_delegate$lambda$45(resources, theme);
                        break;
                }
                return Integer.valueOf(iCardSecondaryBackgroundDefault_delegate$lambda$20);
            }
        });
        final int i48 = 29;
        this.controlOverlayPrimaryBackgroundDefault = l.b(new Function0() { // from class: f8.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iCardSecondaryBackgroundDefault_delegate$lambda$20;
                switch (i48) {
                    case 0:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.cardSecondaryBackgroundDefault_delegate$lambda$20(resources, theme);
                        break;
                    case 1:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.channelBackgroundDefault_delegate$lambda$21(resources, theme);
                        break;
                    case 2:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputActionButtonBackground_delegate$lambda$22(resources, theme);
                        break;
                    case 3:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputActionButtonIconDefaultTint_delegate$lambda$23(resources, theme);
                        break;
                    case 4:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputActionIconActiveTint_delegate$lambda$24(resources, theme);
                        break;
                    case 5:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputBackground_delegate$lambda$25(resources, theme);
                        break;
                    case 6:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputIconDefaultTint_delegate$lambda$26(resources, theme);
                        break;
                    case 7:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputSendButtonActiveBackground_delegate$lambda$27(resources, theme);
                        break;
                    case 8:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.spineDefault_delegate$lambda$104(resources, theme);
                        break;
                    case 9:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputSendButtonIconActiveTint_delegate$lambda$28(resources, theme);
                        break;
                    case 10:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBackgroundDefault_delegate$lambda$29(resources, theme);
                        break;
                    case 11:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.backgroundBaseLow_delegate$lambda$2(resources, theme);
                        break;
                    case 12:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBackgroundSelectedDefault_delegate$lambda$30(resources, theme);
                        break;
                    case 13:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBorderDefault_delegate$lambda$31(resources, theme);
                        break;
                    case 14:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBorderSelectedDefault_delegate$lambda$32(resources, theme);
                        break;
                    case 15:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxIconActive_delegate$lambda$33(resources, theme);
                        break;
                    case 16:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBackgroundActive_delegate$lambda$34(resources, theme);
                        break;
                    case 17:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBackgroundDefault_delegate$lambda$35(resources, theme);
                        break;
                    case 18:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBorderActive_delegate$lambda$36(resources, theme);
                        break;
                    case 19:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.spoilerHiddenBackground_delegate$lambda$105(resources, theme);
                        break;
                    case 20:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBorderDefault_delegate$lambda$37(resources, theme);
                        break;
                    case 21:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedTextDefault_delegate$lambda$38(resources, theme);
                        break;
                    case 22:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBackgroundActive_delegate$lambda$39(resources, theme);
                        break;
                    case 23:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.backgroundBaseLower_delegate$lambda$3(resources, theme);
                        break;
                    case 24:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBackgroundDefault_delegate$lambda$40(resources, theme);
                        break;
                    case 25:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBorderActive_delegate$lambda$41(resources, theme);
                        break;
                    case 26:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBorderDefault_delegate$lambda$42(resources, theme);
                        break;
                    case 27:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryTextDefault_delegate$lambda$43(resources, theme);
                        break;
                    case 28:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlOverlayPrimaryBackgroundActive_delegate$lambda$44(resources, theme);
                        break;
                    default:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlOverlayPrimaryBackgroundDefault_delegate$lambda$45(resources, theme);
                        break;
                }
                return Integer.valueOf(iCardSecondaryBackgroundDefault_delegate$lambda$20);
            }
        });
        this.controlOverlayPrimaryBorderDefault = l.b(new f8.l(resources, 1, theme));
        this.controlOverlayPrimaryTextDefault = l.b(new f8.l(resources, 2, theme));
        this.controlOverlaySecondaryBackgroundActive = l.b(new f8.l(resources, 3, theme));
        this.controlOverlaySecondaryBackgroundDefault = l.b(new f8.l(resources, 4, theme));
        this.controlOverlaySecondaryBorderDefault = l.b(new f8.l(resources, 6, theme));
        this.controlOverlaySecondaryTextDefault = l.b(new f8.l(resources, 7, theme));
        this.controlPrimaryBackgroundActive = l.b(new f8.l(resources, 8, theme));
        this.controlPrimaryBackgroundDefault = l.b(new f8.l(resources, 9, theme));
        this.controlPrimaryBorderActive = l.b(new f8.l(resources, 10, theme));
        this.controlPrimaryBorderDefault = l.b(new f8.l(resources, 12, theme));
        this.controlPrimaryTextDefault = l.b(new f8.l(resources, 13, theme));
        this.controlSecondaryBackgroundActive = l.b(new f8.l(resources, 14, theme));
        this.controlSecondaryBackgroundDefault = l.b(new f8.l(resources, 15, theme));
        this.controlSecondaryBorderActive = l.b(new f8.l(resources, 16, theme));
        this.controlSecondaryBorderDefault = l.b(new f8.l(resources, 18, theme));
        this.controlSecondaryTextDefault = l.b(new f8.l(resources, 19, theme));
        this.embedBackground = l.b(new f8.l(resources, 20, theme));
        this.guildFolderBackground = l.b(new f8.l(resources, 21, theme));
        this.iconFeedbackCritical = l.b(new h(resources, 4, theme));
        this.iconFeedbackInfo = l.b(new h(resources, 5, theme));
        this.iconFeedbackNotification = l.b(new h(resources, 6, theme));
        this.iconFeedbackWarning = l.b(new h(resources, 7, theme));
        this.inputBackgroundDefault = l.b(new h(resources, 8, theme));
        this.inputBorderActive = l.b(new h(resources, 9, theme));
        this.inputBorderDefault = l.b(new h(resources, 11, theme));
        this.inputBorderErrorDefault = l.b(new h(resources, 12, theme));
        this.inputIconDefault = l.b(new h(resources, 13, theme));
        this.interactiveBackgroundSelected = l.b(new h(resources, 15, theme));
        this.interactiveIconActive = l.b(new h(resources, 16, theme));
        this.interactiveIconDefault = l.b(new h(resources, 17, theme));
        this.interactiveTextActive = l.b(new h(resources, 18, theme));
        this.interactiveTextDefault = l.b(new h(resources, 19, theme));
        this.messageHighlightBackgroundDefault = l.b(new h(resources, 20, theme));
        this.messagesItemChannelTextDefault = l.b(new h(resources, 21, theme));
        this.mobileActionsheetBackground = l.b(new h(resources, 23, theme));
        this.mobileChannelItemBackgroundSelected = l.b(new h(resources, 24, theme));
        this.mobileCoachmarkBorderDefault = l.b(new h(resources, 26, theme));
        this.mobileEmbedBackgroundDefault = l.b(new h(resources, 27, theme));
        this.mobileEmojiButtonBackground = l.b(new h(resources, 28, theme));
        this.mobileGuildbarIconBackgroundDefault = l.b(new h(resources, 29, theme));
        final int i49 = 0;
        this.mobileGuildbarIconDefault = l.b(new Function0() { // from class: f8.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iMobileGuildbarIconDefault_delegate$lambda$86;
                switch (i49) {
                    case 0:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileGuildbarIconDefault_delegate$lambda$86(resources, theme);
                        break;
                    case 1:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileHeaderIconDefault_delegate$lambda$87(resources, theme);
                        break;
                    case 2:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileKeyboardGapBackground_delegate$lambda$88(resources, theme);
                        break;
                    case 3:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileKeyboardPanelBackground_delegate$lambda$89(resources, theme);
                        break;
                    case 4:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.backgroundModStrong_delegate$lambda$8(resources, theme);
                        break;
                    case 5:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileSegmentedControlBackground_delegate$lambda$90(resources, theme);
                        break;
                    case 6:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchBorderDefault_delegate$lambda$110(resources, theme);
                        break;
                    case 7:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileSegmentedControlIndicatorBackground_delegate$lambda$91(resources, theme);
                        break;
                    case 8:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileTextHeadingPrimary_delegate$lambda$92(resources, theme);
                        break;
                    case 9:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileThreadEmbedBackground_delegate$lambda$93(resources, theme);
                        break;
                    case 10:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileUnreadbarTextDefault_delegate$lambda$94(resources, theme);
                        break;
                    case 11:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileVoicePanelBadgeBackground_delegate$lambda$95(resources, theme);
                        break;
                    case 12:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.progressbarIndicatorBackground_delegate$lambda$96(resources, theme);
                        break;
                    case 13:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.radioBorderDefault_delegate$lambda$97(resources, theme);
                        break;
                    case 14:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.reactionBackgroundDefault_delegate$lambda$98(resources, theme);
                        break;
                    case 15:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.reactionBackgroundReactedDefault_delegate$lambda$99(resources, theme);
                        break;
                    case 16:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.backgroundModSubtle_delegate$lambda$9(resources, theme);
                        break;
                    case 17:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchBorderSelectedDefault_delegate$lambda$111(resources, theme);
                        break;
                    case 18:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchThumbBackgroundDefault_delegate$lambda$112(resources, theme);
                        break;
                    case 19:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchThumbBackgroundSelectedDefault_delegate$lambda$113(resources, theme);
                        break;
                    case 20:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchThumbIconDefault_delegate$lambda$114(resources, theme);
                        break;
                    case 21:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tabBarBackground_delegate$lambda$115(resources, theme);
                        break;
                    case 22:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tabLabelTextDefault_delegate$lambda$116(resources, theme);
                        break;
                    case 23:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tabLabelTextFocused_delegate$lambda$117(resources, theme);
                        break;
                    case 24:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.reactionBorderDefault_delegate$lambda$100(resources, theme);
                        break;
                    case 25:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tablerowBackgroundDefault_delegate$lambda$118(resources, theme);
                        break;
                    case 26:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tablerowBackgroundPressed_delegate$lambda$119(resources, theme);
                        break;
                    case 27:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.backgroundScrimLightbox_delegate$lambda$11(resources, theme);
                        break;
                    case 28:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tablerowIconColorDefault_delegate$lambda$120(resources, theme);
                        break;
                    default:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.textBrand_delegate$lambda$121(resources, theme);
                        break;
                }
                return Integer.valueOf(iMobileGuildbarIconDefault_delegate$lambda$86);
            }
        });
        final int i50 = 1;
        this.mobileHeaderIconDefault = l.b(new Function0() { // from class: f8.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iMobileGuildbarIconDefault_delegate$lambda$86;
                switch (i50) {
                    case 0:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileGuildbarIconDefault_delegate$lambda$86(resources, theme);
                        break;
                    case 1:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileHeaderIconDefault_delegate$lambda$87(resources, theme);
                        break;
                    case 2:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileKeyboardGapBackground_delegate$lambda$88(resources, theme);
                        break;
                    case 3:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileKeyboardPanelBackground_delegate$lambda$89(resources, theme);
                        break;
                    case 4:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.backgroundModStrong_delegate$lambda$8(resources, theme);
                        break;
                    case 5:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileSegmentedControlBackground_delegate$lambda$90(resources, theme);
                        break;
                    case 6:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchBorderDefault_delegate$lambda$110(resources, theme);
                        break;
                    case 7:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileSegmentedControlIndicatorBackground_delegate$lambda$91(resources, theme);
                        break;
                    case 8:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileTextHeadingPrimary_delegate$lambda$92(resources, theme);
                        break;
                    case 9:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileThreadEmbedBackground_delegate$lambda$93(resources, theme);
                        break;
                    case 10:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileUnreadbarTextDefault_delegate$lambda$94(resources, theme);
                        break;
                    case 11:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileVoicePanelBadgeBackground_delegate$lambda$95(resources, theme);
                        break;
                    case 12:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.progressbarIndicatorBackground_delegate$lambda$96(resources, theme);
                        break;
                    case 13:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.radioBorderDefault_delegate$lambda$97(resources, theme);
                        break;
                    case 14:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.reactionBackgroundDefault_delegate$lambda$98(resources, theme);
                        break;
                    case 15:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.reactionBackgroundReactedDefault_delegate$lambda$99(resources, theme);
                        break;
                    case 16:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.backgroundModSubtle_delegate$lambda$9(resources, theme);
                        break;
                    case 17:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchBorderSelectedDefault_delegate$lambda$111(resources, theme);
                        break;
                    case 18:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchThumbBackgroundDefault_delegate$lambda$112(resources, theme);
                        break;
                    case 19:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchThumbBackgroundSelectedDefault_delegate$lambda$113(resources, theme);
                        break;
                    case 20:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchThumbIconDefault_delegate$lambda$114(resources, theme);
                        break;
                    case 21:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tabBarBackground_delegate$lambda$115(resources, theme);
                        break;
                    case 22:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tabLabelTextDefault_delegate$lambda$116(resources, theme);
                        break;
                    case 23:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tabLabelTextFocused_delegate$lambda$117(resources, theme);
                        break;
                    case 24:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.reactionBorderDefault_delegate$lambda$100(resources, theme);
                        break;
                    case 25:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tablerowBackgroundDefault_delegate$lambda$118(resources, theme);
                        break;
                    case 26:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tablerowBackgroundPressed_delegate$lambda$119(resources, theme);
                        break;
                    case 27:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.backgroundScrimLightbox_delegate$lambda$11(resources, theme);
                        break;
                    case 28:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tablerowIconColorDefault_delegate$lambda$120(resources, theme);
                        break;
                    default:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.textBrand_delegate$lambda$121(resources, theme);
                        break;
                }
                return Integer.valueOf(iMobileGuildbarIconDefault_delegate$lambda$86);
            }
        });
        final int i51 = 2;
        this.mobileKeyboardGapBackground = l.b(new Function0() { // from class: f8.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iMobileGuildbarIconDefault_delegate$lambda$86;
                switch (i51) {
                    case 0:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileGuildbarIconDefault_delegate$lambda$86(resources, theme);
                        break;
                    case 1:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileHeaderIconDefault_delegate$lambda$87(resources, theme);
                        break;
                    case 2:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileKeyboardGapBackground_delegate$lambda$88(resources, theme);
                        break;
                    case 3:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileKeyboardPanelBackground_delegate$lambda$89(resources, theme);
                        break;
                    case 4:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.backgroundModStrong_delegate$lambda$8(resources, theme);
                        break;
                    case 5:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileSegmentedControlBackground_delegate$lambda$90(resources, theme);
                        break;
                    case 6:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchBorderDefault_delegate$lambda$110(resources, theme);
                        break;
                    case 7:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileSegmentedControlIndicatorBackground_delegate$lambda$91(resources, theme);
                        break;
                    case 8:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileTextHeadingPrimary_delegate$lambda$92(resources, theme);
                        break;
                    case 9:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileThreadEmbedBackground_delegate$lambda$93(resources, theme);
                        break;
                    case 10:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileUnreadbarTextDefault_delegate$lambda$94(resources, theme);
                        break;
                    case 11:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileVoicePanelBadgeBackground_delegate$lambda$95(resources, theme);
                        break;
                    case 12:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.progressbarIndicatorBackground_delegate$lambda$96(resources, theme);
                        break;
                    case 13:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.radioBorderDefault_delegate$lambda$97(resources, theme);
                        break;
                    case 14:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.reactionBackgroundDefault_delegate$lambda$98(resources, theme);
                        break;
                    case 15:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.reactionBackgroundReactedDefault_delegate$lambda$99(resources, theme);
                        break;
                    case 16:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.backgroundModSubtle_delegate$lambda$9(resources, theme);
                        break;
                    case 17:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchBorderSelectedDefault_delegate$lambda$111(resources, theme);
                        break;
                    case 18:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchThumbBackgroundDefault_delegate$lambda$112(resources, theme);
                        break;
                    case 19:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchThumbBackgroundSelectedDefault_delegate$lambda$113(resources, theme);
                        break;
                    case 20:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchThumbIconDefault_delegate$lambda$114(resources, theme);
                        break;
                    case 21:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tabBarBackground_delegate$lambda$115(resources, theme);
                        break;
                    case 22:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tabLabelTextDefault_delegate$lambda$116(resources, theme);
                        break;
                    case 23:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tabLabelTextFocused_delegate$lambda$117(resources, theme);
                        break;
                    case 24:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.reactionBorderDefault_delegate$lambda$100(resources, theme);
                        break;
                    case 25:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tablerowBackgroundDefault_delegate$lambda$118(resources, theme);
                        break;
                    case 26:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tablerowBackgroundPressed_delegate$lambda$119(resources, theme);
                        break;
                    case 27:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.backgroundScrimLightbox_delegate$lambda$11(resources, theme);
                        break;
                    case 28:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tablerowIconColorDefault_delegate$lambda$120(resources, theme);
                        break;
                    default:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.textBrand_delegate$lambda$121(resources, theme);
                        break;
                }
                return Integer.valueOf(iMobileGuildbarIconDefault_delegate$lambda$86);
            }
        });
        final int i52 = 3;
        this.mobileKeyboardPanelBackground = l.b(new Function0() { // from class: f8.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iMobileGuildbarIconDefault_delegate$lambda$86;
                switch (i52) {
                    case 0:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileGuildbarIconDefault_delegate$lambda$86(resources, theme);
                        break;
                    case 1:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileHeaderIconDefault_delegate$lambda$87(resources, theme);
                        break;
                    case 2:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileKeyboardGapBackground_delegate$lambda$88(resources, theme);
                        break;
                    case 3:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileKeyboardPanelBackground_delegate$lambda$89(resources, theme);
                        break;
                    case 4:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.backgroundModStrong_delegate$lambda$8(resources, theme);
                        break;
                    case 5:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileSegmentedControlBackground_delegate$lambda$90(resources, theme);
                        break;
                    case 6:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchBorderDefault_delegate$lambda$110(resources, theme);
                        break;
                    case 7:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileSegmentedControlIndicatorBackground_delegate$lambda$91(resources, theme);
                        break;
                    case 8:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileTextHeadingPrimary_delegate$lambda$92(resources, theme);
                        break;
                    case 9:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileThreadEmbedBackground_delegate$lambda$93(resources, theme);
                        break;
                    case 10:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileUnreadbarTextDefault_delegate$lambda$94(resources, theme);
                        break;
                    case 11:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileVoicePanelBadgeBackground_delegate$lambda$95(resources, theme);
                        break;
                    case 12:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.progressbarIndicatorBackground_delegate$lambda$96(resources, theme);
                        break;
                    case 13:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.radioBorderDefault_delegate$lambda$97(resources, theme);
                        break;
                    case 14:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.reactionBackgroundDefault_delegate$lambda$98(resources, theme);
                        break;
                    case 15:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.reactionBackgroundReactedDefault_delegate$lambda$99(resources, theme);
                        break;
                    case 16:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.backgroundModSubtle_delegate$lambda$9(resources, theme);
                        break;
                    case 17:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchBorderSelectedDefault_delegate$lambda$111(resources, theme);
                        break;
                    case 18:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchThumbBackgroundDefault_delegate$lambda$112(resources, theme);
                        break;
                    case 19:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchThumbBackgroundSelectedDefault_delegate$lambda$113(resources, theme);
                        break;
                    case 20:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchThumbIconDefault_delegate$lambda$114(resources, theme);
                        break;
                    case 21:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tabBarBackground_delegate$lambda$115(resources, theme);
                        break;
                    case 22:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tabLabelTextDefault_delegate$lambda$116(resources, theme);
                        break;
                    case 23:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tabLabelTextFocused_delegate$lambda$117(resources, theme);
                        break;
                    case 24:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.reactionBorderDefault_delegate$lambda$100(resources, theme);
                        break;
                    case 25:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tablerowBackgroundDefault_delegate$lambda$118(resources, theme);
                        break;
                    case 26:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tablerowBackgroundPressed_delegate$lambda$119(resources, theme);
                        break;
                    case 27:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.backgroundScrimLightbox_delegate$lambda$11(resources, theme);
                        break;
                    case 28:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tablerowIconColorDefault_delegate$lambda$120(resources, theme);
                        break;
                    default:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.textBrand_delegate$lambda$121(resources, theme);
                        break;
                }
                return Integer.valueOf(iMobileGuildbarIconDefault_delegate$lambda$86);
            }
        });
        final int i53 = 5;
        this.mobileSegmentedControlBackground = l.b(new Function0() { // from class: f8.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iMobileGuildbarIconDefault_delegate$lambda$86;
                switch (i53) {
                    case 0:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileGuildbarIconDefault_delegate$lambda$86(resources, theme);
                        break;
                    case 1:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileHeaderIconDefault_delegate$lambda$87(resources, theme);
                        break;
                    case 2:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileKeyboardGapBackground_delegate$lambda$88(resources, theme);
                        break;
                    case 3:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileKeyboardPanelBackground_delegate$lambda$89(resources, theme);
                        break;
                    case 4:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.backgroundModStrong_delegate$lambda$8(resources, theme);
                        break;
                    case 5:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileSegmentedControlBackground_delegate$lambda$90(resources, theme);
                        break;
                    case 6:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchBorderDefault_delegate$lambda$110(resources, theme);
                        break;
                    case 7:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileSegmentedControlIndicatorBackground_delegate$lambda$91(resources, theme);
                        break;
                    case 8:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileTextHeadingPrimary_delegate$lambda$92(resources, theme);
                        break;
                    case 9:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileThreadEmbedBackground_delegate$lambda$93(resources, theme);
                        break;
                    case 10:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileUnreadbarTextDefault_delegate$lambda$94(resources, theme);
                        break;
                    case 11:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileVoicePanelBadgeBackground_delegate$lambda$95(resources, theme);
                        break;
                    case 12:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.progressbarIndicatorBackground_delegate$lambda$96(resources, theme);
                        break;
                    case 13:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.radioBorderDefault_delegate$lambda$97(resources, theme);
                        break;
                    case 14:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.reactionBackgroundDefault_delegate$lambda$98(resources, theme);
                        break;
                    case 15:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.reactionBackgroundReactedDefault_delegate$lambda$99(resources, theme);
                        break;
                    case 16:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.backgroundModSubtle_delegate$lambda$9(resources, theme);
                        break;
                    case 17:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchBorderSelectedDefault_delegate$lambda$111(resources, theme);
                        break;
                    case 18:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchThumbBackgroundDefault_delegate$lambda$112(resources, theme);
                        break;
                    case 19:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchThumbBackgroundSelectedDefault_delegate$lambda$113(resources, theme);
                        break;
                    case 20:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchThumbIconDefault_delegate$lambda$114(resources, theme);
                        break;
                    case 21:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tabBarBackground_delegate$lambda$115(resources, theme);
                        break;
                    case 22:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tabLabelTextDefault_delegate$lambda$116(resources, theme);
                        break;
                    case 23:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tabLabelTextFocused_delegate$lambda$117(resources, theme);
                        break;
                    case 24:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.reactionBorderDefault_delegate$lambda$100(resources, theme);
                        break;
                    case 25:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tablerowBackgroundDefault_delegate$lambda$118(resources, theme);
                        break;
                    case 26:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tablerowBackgroundPressed_delegate$lambda$119(resources, theme);
                        break;
                    case 27:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.backgroundScrimLightbox_delegate$lambda$11(resources, theme);
                        break;
                    case 28:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tablerowIconColorDefault_delegate$lambda$120(resources, theme);
                        break;
                    default:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.textBrand_delegate$lambda$121(resources, theme);
                        break;
                }
                return Integer.valueOf(iMobileGuildbarIconDefault_delegate$lambda$86);
            }
        });
        final int i54 = 7;
        this.mobileSegmentedControlIndicatorBackground = l.b(new Function0() { // from class: f8.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iMobileGuildbarIconDefault_delegate$lambda$86;
                switch (i54) {
                    case 0:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileGuildbarIconDefault_delegate$lambda$86(resources, theme);
                        break;
                    case 1:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileHeaderIconDefault_delegate$lambda$87(resources, theme);
                        break;
                    case 2:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileKeyboardGapBackground_delegate$lambda$88(resources, theme);
                        break;
                    case 3:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileKeyboardPanelBackground_delegate$lambda$89(resources, theme);
                        break;
                    case 4:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.backgroundModStrong_delegate$lambda$8(resources, theme);
                        break;
                    case 5:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileSegmentedControlBackground_delegate$lambda$90(resources, theme);
                        break;
                    case 6:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchBorderDefault_delegate$lambda$110(resources, theme);
                        break;
                    case 7:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileSegmentedControlIndicatorBackground_delegate$lambda$91(resources, theme);
                        break;
                    case 8:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileTextHeadingPrimary_delegate$lambda$92(resources, theme);
                        break;
                    case 9:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileThreadEmbedBackground_delegate$lambda$93(resources, theme);
                        break;
                    case 10:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileUnreadbarTextDefault_delegate$lambda$94(resources, theme);
                        break;
                    case 11:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileVoicePanelBadgeBackground_delegate$lambda$95(resources, theme);
                        break;
                    case 12:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.progressbarIndicatorBackground_delegate$lambda$96(resources, theme);
                        break;
                    case 13:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.radioBorderDefault_delegate$lambda$97(resources, theme);
                        break;
                    case 14:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.reactionBackgroundDefault_delegate$lambda$98(resources, theme);
                        break;
                    case 15:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.reactionBackgroundReactedDefault_delegate$lambda$99(resources, theme);
                        break;
                    case 16:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.backgroundModSubtle_delegate$lambda$9(resources, theme);
                        break;
                    case 17:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchBorderSelectedDefault_delegate$lambda$111(resources, theme);
                        break;
                    case 18:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchThumbBackgroundDefault_delegate$lambda$112(resources, theme);
                        break;
                    case 19:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchThumbBackgroundSelectedDefault_delegate$lambda$113(resources, theme);
                        break;
                    case 20:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchThumbIconDefault_delegate$lambda$114(resources, theme);
                        break;
                    case 21:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tabBarBackground_delegate$lambda$115(resources, theme);
                        break;
                    case 22:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tabLabelTextDefault_delegate$lambda$116(resources, theme);
                        break;
                    case 23:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tabLabelTextFocused_delegate$lambda$117(resources, theme);
                        break;
                    case 24:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.reactionBorderDefault_delegate$lambda$100(resources, theme);
                        break;
                    case 25:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tablerowBackgroundDefault_delegate$lambda$118(resources, theme);
                        break;
                    case 26:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tablerowBackgroundPressed_delegate$lambda$119(resources, theme);
                        break;
                    case 27:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.backgroundScrimLightbox_delegate$lambda$11(resources, theme);
                        break;
                    case 28:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tablerowIconColorDefault_delegate$lambda$120(resources, theme);
                        break;
                    default:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.textBrand_delegate$lambda$121(resources, theme);
                        break;
                }
                return Integer.valueOf(iMobileGuildbarIconDefault_delegate$lambda$86);
            }
        });
        final int i55 = 8;
        this.mobileTextHeadingPrimary = l.b(new Function0() { // from class: f8.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iMobileGuildbarIconDefault_delegate$lambda$86;
                switch (i55) {
                    case 0:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileGuildbarIconDefault_delegate$lambda$86(resources, theme);
                        break;
                    case 1:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileHeaderIconDefault_delegate$lambda$87(resources, theme);
                        break;
                    case 2:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileKeyboardGapBackground_delegate$lambda$88(resources, theme);
                        break;
                    case 3:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileKeyboardPanelBackground_delegate$lambda$89(resources, theme);
                        break;
                    case 4:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.backgroundModStrong_delegate$lambda$8(resources, theme);
                        break;
                    case 5:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileSegmentedControlBackground_delegate$lambda$90(resources, theme);
                        break;
                    case 6:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchBorderDefault_delegate$lambda$110(resources, theme);
                        break;
                    case 7:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileSegmentedControlIndicatorBackground_delegate$lambda$91(resources, theme);
                        break;
                    case 8:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileTextHeadingPrimary_delegate$lambda$92(resources, theme);
                        break;
                    case 9:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileThreadEmbedBackground_delegate$lambda$93(resources, theme);
                        break;
                    case 10:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileUnreadbarTextDefault_delegate$lambda$94(resources, theme);
                        break;
                    case 11:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileVoicePanelBadgeBackground_delegate$lambda$95(resources, theme);
                        break;
                    case 12:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.progressbarIndicatorBackground_delegate$lambda$96(resources, theme);
                        break;
                    case 13:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.radioBorderDefault_delegate$lambda$97(resources, theme);
                        break;
                    case 14:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.reactionBackgroundDefault_delegate$lambda$98(resources, theme);
                        break;
                    case 15:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.reactionBackgroundReactedDefault_delegate$lambda$99(resources, theme);
                        break;
                    case 16:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.backgroundModSubtle_delegate$lambda$9(resources, theme);
                        break;
                    case 17:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchBorderSelectedDefault_delegate$lambda$111(resources, theme);
                        break;
                    case 18:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchThumbBackgroundDefault_delegate$lambda$112(resources, theme);
                        break;
                    case 19:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchThumbBackgroundSelectedDefault_delegate$lambda$113(resources, theme);
                        break;
                    case 20:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchThumbIconDefault_delegate$lambda$114(resources, theme);
                        break;
                    case 21:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tabBarBackground_delegate$lambda$115(resources, theme);
                        break;
                    case 22:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tabLabelTextDefault_delegate$lambda$116(resources, theme);
                        break;
                    case 23:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tabLabelTextFocused_delegate$lambda$117(resources, theme);
                        break;
                    case 24:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.reactionBorderDefault_delegate$lambda$100(resources, theme);
                        break;
                    case 25:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tablerowBackgroundDefault_delegate$lambda$118(resources, theme);
                        break;
                    case 26:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tablerowBackgroundPressed_delegate$lambda$119(resources, theme);
                        break;
                    case 27:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.backgroundScrimLightbox_delegate$lambda$11(resources, theme);
                        break;
                    case 28:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tablerowIconColorDefault_delegate$lambda$120(resources, theme);
                        break;
                    default:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.textBrand_delegate$lambda$121(resources, theme);
                        break;
                }
                return Integer.valueOf(iMobileGuildbarIconDefault_delegate$lambda$86);
            }
        });
        final int i56 = 9;
        this.mobileThreadEmbedBackground = l.b(new Function0() { // from class: f8.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iMobileGuildbarIconDefault_delegate$lambda$86;
                switch (i56) {
                    case 0:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileGuildbarIconDefault_delegate$lambda$86(resources, theme);
                        break;
                    case 1:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileHeaderIconDefault_delegate$lambda$87(resources, theme);
                        break;
                    case 2:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileKeyboardGapBackground_delegate$lambda$88(resources, theme);
                        break;
                    case 3:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileKeyboardPanelBackground_delegate$lambda$89(resources, theme);
                        break;
                    case 4:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.backgroundModStrong_delegate$lambda$8(resources, theme);
                        break;
                    case 5:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileSegmentedControlBackground_delegate$lambda$90(resources, theme);
                        break;
                    case 6:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchBorderDefault_delegate$lambda$110(resources, theme);
                        break;
                    case 7:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileSegmentedControlIndicatorBackground_delegate$lambda$91(resources, theme);
                        break;
                    case 8:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileTextHeadingPrimary_delegate$lambda$92(resources, theme);
                        break;
                    case 9:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileThreadEmbedBackground_delegate$lambda$93(resources, theme);
                        break;
                    case 10:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileUnreadbarTextDefault_delegate$lambda$94(resources, theme);
                        break;
                    case 11:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileVoicePanelBadgeBackground_delegate$lambda$95(resources, theme);
                        break;
                    case 12:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.progressbarIndicatorBackground_delegate$lambda$96(resources, theme);
                        break;
                    case 13:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.radioBorderDefault_delegate$lambda$97(resources, theme);
                        break;
                    case 14:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.reactionBackgroundDefault_delegate$lambda$98(resources, theme);
                        break;
                    case 15:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.reactionBackgroundReactedDefault_delegate$lambda$99(resources, theme);
                        break;
                    case 16:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.backgroundModSubtle_delegate$lambda$9(resources, theme);
                        break;
                    case 17:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchBorderSelectedDefault_delegate$lambda$111(resources, theme);
                        break;
                    case 18:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchThumbBackgroundDefault_delegate$lambda$112(resources, theme);
                        break;
                    case 19:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchThumbBackgroundSelectedDefault_delegate$lambda$113(resources, theme);
                        break;
                    case 20:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchThumbIconDefault_delegate$lambda$114(resources, theme);
                        break;
                    case 21:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tabBarBackground_delegate$lambda$115(resources, theme);
                        break;
                    case 22:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tabLabelTextDefault_delegate$lambda$116(resources, theme);
                        break;
                    case 23:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tabLabelTextFocused_delegate$lambda$117(resources, theme);
                        break;
                    case 24:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.reactionBorderDefault_delegate$lambda$100(resources, theme);
                        break;
                    case 25:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tablerowBackgroundDefault_delegate$lambda$118(resources, theme);
                        break;
                    case 26:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tablerowBackgroundPressed_delegate$lambda$119(resources, theme);
                        break;
                    case 27:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.backgroundScrimLightbox_delegate$lambda$11(resources, theme);
                        break;
                    case 28:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tablerowIconColorDefault_delegate$lambda$120(resources, theme);
                        break;
                    default:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.textBrand_delegate$lambda$121(resources, theme);
                        break;
                }
                return Integer.valueOf(iMobileGuildbarIconDefault_delegate$lambda$86);
            }
        });
        final int i57 = 10;
        this.mobileUnreadbarTextDefault = l.b(new Function0() { // from class: f8.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iMobileGuildbarIconDefault_delegate$lambda$86;
                switch (i57) {
                    case 0:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileGuildbarIconDefault_delegate$lambda$86(resources, theme);
                        break;
                    case 1:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileHeaderIconDefault_delegate$lambda$87(resources, theme);
                        break;
                    case 2:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileKeyboardGapBackground_delegate$lambda$88(resources, theme);
                        break;
                    case 3:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileKeyboardPanelBackground_delegate$lambda$89(resources, theme);
                        break;
                    case 4:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.backgroundModStrong_delegate$lambda$8(resources, theme);
                        break;
                    case 5:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileSegmentedControlBackground_delegate$lambda$90(resources, theme);
                        break;
                    case 6:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchBorderDefault_delegate$lambda$110(resources, theme);
                        break;
                    case 7:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileSegmentedControlIndicatorBackground_delegate$lambda$91(resources, theme);
                        break;
                    case 8:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileTextHeadingPrimary_delegate$lambda$92(resources, theme);
                        break;
                    case 9:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileThreadEmbedBackground_delegate$lambda$93(resources, theme);
                        break;
                    case 10:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileUnreadbarTextDefault_delegate$lambda$94(resources, theme);
                        break;
                    case 11:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileVoicePanelBadgeBackground_delegate$lambda$95(resources, theme);
                        break;
                    case 12:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.progressbarIndicatorBackground_delegate$lambda$96(resources, theme);
                        break;
                    case 13:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.radioBorderDefault_delegate$lambda$97(resources, theme);
                        break;
                    case 14:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.reactionBackgroundDefault_delegate$lambda$98(resources, theme);
                        break;
                    case 15:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.reactionBackgroundReactedDefault_delegate$lambda$99(resources, theme);
                        break;
                    case 16:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.backgroundModSubtle_delegate$lambda$9(resources, theme);
                        break;
                    case 17:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchBorderSelectedDefault_delegate$lambda$111(resources, theme);
                        break;
                    case 18:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchThumbBackgroundDefault_delegate$lambda$112(resources, theme);
                        break;
                    case 19:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchThumbBackgroundSelectedDefault_delegate$lambda$113(resources, theme);
                        break;
                    case 20:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchThumbIconDefault_delegate$lambda$114(resources, theme);
                        break;
                    case 21:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tabBarBackground_delegate$lambda$115(resources, theme);
                        break;
                    case 22:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tabLabelTextDefault_delegate$lambda$116(resources, theme);
                        break;
                    case 23:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tabLabelTextFocused_delegate$lambda$117(resources, theme);
                        break;
                    case 24:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.reactionBorderDefault_delegate$lambda$100(resources, theme);
                        break;
                    case 25:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tablerowBackgroundDefault_delegate$lambda$118(resources, theme);
                        break;
                    case 26:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tablerowBackgroundPressed_delegate$lambda$119(resources, theme);
                        break;
                    case 27:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.backgroundScrimLightbox_delegate$lambda$11(resources, theme);
                        break;
                    case 28:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tablerowIconColorDefault_delegate$lambda$120(resources, theme);
                        break;
                    default:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.textBrand_delegate$lambda$121(resources, theme);
                        break;
                }
                return Integer.valueOf(iMobileGuildbarIconDefault_delegate$lambda$86);
            }
        });
        final int i58 = 11;
        this.mobileVoicePanelBadgeBackground = l.b(new Function0() { // from class: f8.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iMobileGuildbarIconDefault_delegate$lambda$86;
                switch (i58) {
                    case 0:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileGuildbarIconDefault_delegate$lambda$86(resources, theme);
                        break;
                    case 1:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileHeaderIconDefault_delegate$lambda$87(resources, theme);
                        break;
                    case 2:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileKeyboardGapBackground_delegate$lambda$88(resources, theme);
                        break;
                    case 3:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileKeyboardPanelBackground_delegate$lambda$89(resources, theme);
                        break;
                    case 4:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.backgroundModStrong_delegate$lambda$8(resources, theme);
                        break;
                    case 5:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileSegmentedControlBackground_delegate$lambda$90(resources, theme);
                        break;
                    case 6:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchBorderDefault_delegate$lambda$110(resources, theme);
                        break;
                    case 7:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileSegmentedControlIndicatorBackground_delegate$lambda$91(resources, theme);
                        break;
                    case 8:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileTextHeadingPrimary_delegate$lambda$92(resources, theme);
                        break;
                    case 9:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileThreadEmbedBackground_delegate$lambda$93(resources, theme);
                        break;
                    case 10:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileUnreadbarTextDefault_delegate$lambda$94(resources, theme);
                        break;
                    case 11:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileVoicePanelBadgeBackground_delegate$lambda$95(resources, theme);
                        break;
                    case 12:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.progressbarIndicatorBackground_delegate$lambda$96(resources, theme);
                        break;
                    case 13:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.radioBorderDefault_delegate$lambda$97(resources, theme);
                        break;
                    case 14:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.reactionBackgroundDefault_delegate$lambda$98(resources, theme);
                        break;
                    case 15:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.reactionBackgroundReactedDefault_delegate$lambda$99(resources, theme);
                        break;
                    case 16:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.backgroundModSubtle_delegate$lambda$9(resources, theme);
                        break;
                    case 17:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchBorderSelectedDefault_delegate$lambda$111(resources, theme);
                        break;
                    case 18:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchThumbBackgroundDefault_delegate$lambda$112(resources, theme);
                        break;
                    case 19:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchThumbBackgroundSelectedDefault_delegate$lambda$113(resources, theme);
                        break;
                    case 20:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchThumbIconDefault_delegate$lambda$114(resources, theme);
                        break;
                    case 21:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tabBarBackground_delegate$lambda$115(resources, theme);
                        break;
                    case 22:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tabLabelTextDefault_delegate$lambda$116(resources, theme);
                        break;
                    case 23:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tabLabelTextFocused_delegate$lambda$117(resources, theme);
                        break;
                    case 24:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.reactionBorderDefault_delegate$lambda$100(resources, theme);
                        break;
                    case 25:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tablerowBackgroundDefault_delegate$lambda$118(resources, theme);
                        break;
                    case 26:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tablerowBackgroundPressed_delegate$lambda$119(resources, theme);
                        break;
                    case 27:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.backgroundScrimLightbox_delegate$lambda$11(resources, theme);
                        break;
                    case 28:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tablerowIconColorDefault_delegate$lambda$120(resources, theme);
                        break;
                    default:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.textBrand_delegate$lambda$121(resources, theme);
                        break;
                }
                return Integer.valueOf(iMobileGuildbarIconDefault_delegate$lambda$86);
            }
        });
        final int i59 = 12;
        this.progressbarIndicatorBackground = l.b(new Function0() { // from class: f8.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iMobileGuildbarIconDefault_delegate$lambda$86;
                switch (i59) {
                    case 0:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileGuildbarIconDefault_delegate$lambda$86(resources, theme);
                        break;
                    case 1:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileHeaderIconDefault_delegate$lambda$87(resources, theme);
                        break;
                    case 2:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileKeyboardGapBackground_delegate$lambda$88(resources, theme);
                        break;
                    case 3:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileKeyboardPanelBackground_delegate$lambda$89(resources, theme);
                        break;
                    case 4:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.backgroundModStrong_delegate$lambda$8(resources, theme);
                        break;
                    case 5:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileSegmentedControlBackground_delegate$lambda$90(resources, theme);
                        break;
                    case 6:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchBorderDefault_delegate$lambda$110(resources, theme);
                        break;
                    case 7:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileSegmentedControlIndicatorBackground_delegate$lambda$91(resources, theme);
                        break;
                    case 8:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileTextHeadingPrimary_delegate$lambda$92(resources, theme);
                        break;
                    case 9:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileThreadEmbedBackground_delegate$lambda$93(resources, theme);
                        break;
                    case 10:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileUnreadbarTextDefault_delegate$lambda$94(resources, theme);
                        break;
                    case 11:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileVoicePanelBadgeBackground_delegate$lambda$95(resources, theme);
                        break;
                    case 12:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.progressbarIndicatorBackground_delegate$lambda$96(resources, theme);
                        break;
                    case 13:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.radioBorderDefault_delegate$lambda$97(resources, theme);
                        break;
                    case 14:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.reactionBackgroundDefault_delegate$lambda$98(resources, theme);
                        break;
                    case 15:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.reactionBackgroundReactedDefault_delegate$lambda$99(resources, theme);
                        break;
                    case 16:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.backgroundModSubtle_delegate$lambda$9(resources, theme);
                        break;
                    case 17:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchBorderSelectedDefault_delegate$lambda$111(resources, theme);
                        break;
                    case 18:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchThumbBackgroundDefault_delegate$lambda$112(resources, theme);
                        break;
                    case 19:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchThumbBackgroundSelectedDefault_delegate$lambda$113(resources, theme);
                        break;
                    case 20:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchThumbIconDefault_delegate$lambda$114(resources, theme);
                        break;
                    case 21:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tabBarBackground_delegate$lambda$115(resources, theme);
                        break;
                    case 22:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tabLabelTextDefault_delegate$lambda$116(resources, theme);
                        break;
                    case 23:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tabLabelTextFocused_delegate$lambda$117(resources, theme);
                        break;
                    case 24:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.reactionBorderDefault_delegate$lambda$100(resources, theme);
                        break;
                    case 25:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tablerowBackgroundDefault_delegate$lambda$118(resources, theme);
                        break;
                    case 26:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tablerowBackgroundPressed_delegate$lambda$119(resources, theme);
                        break;
                    case 27:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.backgroundScrimLightbox_delegate$lambda$11(resources, theme);
                        break;
                    case 28:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tablerowIconColorDefault_delegate$lambda$120(resources, theme);
                        break;
                    default:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.textBrand_delegate$lambda$121(resources, theme);
                        break;
                }
                return Integer.valueOf(iMobileGuildbarIconDefault_delegate$lambda$86);
            }
        });
        final int i60 = 13;
        this.radioBorderDefault = l.b(new Function0() { // from class: f8.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iMobileGuildbarIconDefault_delegate$lambda$86;
                switch (i60) {
                    case 0:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileGuildbarIconDefault_delegate$lambda$86(resources, theme);
                        break;
                    case 1:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileHeaderIconDefault_delegate$lambda$87(resources, theme);
                        break;
                    case 2:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileKeyboardGapBackground_delegate$lambda$88(resources, theme);
                        break;
                    case 3:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileKeyboardPanelBackground_delegate$lambda$89(resources, theme);
                        break;
                    case 4:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.backgroundModStrong_delegate$lambda$8(resources, theme);
                        break;
                    case 5:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileSegmentedControlBackground_delegate$lambda$90(resources, theme);
                        break;
                    case 6:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchBorderDefault_delegate$lambda$110(resources, theme);
                        break;
                    case 7:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileSegmentedControlIndicatorBackground_delegate$lambda$91(resources, theme);
                        break;
                    case 8:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileTextHeadingPrimary_delegate$lambda$92(resources, theme);
                        break;
                    case 9:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileThreadEmbedBackground_delegate$lambda$93(resources, theme);
                        break;
                    case 10:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileUnreadbarTextDefault_delegate$lambda$94(resources, theme);
                        break;
                    case 11:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileVoicePanelBadgeBackground_delegate$lambda$95(resources, theme);
                        break;
                    case 12:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.progressbarIndicatorBackground_delegate$lambda$96(resources, theme);
                        break;
                    case 13:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.radioBorderDefault_delegate$lambda$97(resources, theme);
                        break;
                    case 14:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.reactionBackgroundDefault_delegate$lambda$98(resources, theme);
                        break;
                    case 15:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.reactionBackgroundReactedDefault_delegate$lambda$99(resources, theme);
                        break;
                    case 16:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.backgroundModSubtle_delegate$lambda$9(resources, theme);
                        break;
                    case 17:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchBorderSelectedDefault_delegate$lambda$111(resources, theme);
                        break;
                    case 18:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchThumbBackgroundDefault_delegate$lambda$112(resources, theme);
                        break;
                    case 19:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchThumbBackgroundSelectedDefault_delegate$lambda$113(resources, theme);
                        break;
                    case 20:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchThumbIconDefault_delegate$lambda$114(resources, theme);
                        break;
                    case 21:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tabBarBackground_delegate$lambda$115(resources, theme);
                        break;
                    case 22:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tabLabelTextDefault_delegate$lambda$116(resources, theme);
                        break;
                    case 23:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tabLabelTextFocused_delegate$lambda$117(resources, theme);
                        break;
                    case 24:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.reactionBorderDefault_delegate$lambda$100(resources, theme);
                        break;
                    case 25:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tablerowBackgroundDefault_delegate$lambda$118(resources, theme);
                        break;
                    case 26:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tablerowBackgroundPressed_delegate$lambda$119(resources, theme);
                        break;
                    case 27:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.backgroundScrimLightbox_delegate$lambda$11(resources, theme);
                        break;
                    case 28:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tablerowIconColorDefault_delegate$lambda$120(resources, theme);
                        break;
                    default:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.textBrand_delegate$lambda$121(resources, theme);
                        break;
                }
                return Integer.valueOf(iMobileGuildbarIconDefault_delegate$lambda$86);
            }
        });
        final int i61 = 14;
        this.reactionBackgroundDefault = l.b(new Function0() { // from class: f8.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iMobileGuildbarIconDefault_delegate$lambda$86;
                switch (i61) {
                    case 0:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileGuildbarIconDefault_delegate$lambda$86(resources, theme);
                        break;
                    case 1:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileHeaderIconDefault_delegate$lambda$87(resources, theme);
                        break;
                    case 2:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileKeyboardGapBackground_delegate$lambda$88(resources, theme);
                        break;
                    case 3:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileKeyboardPanelBackground_delegate$lambda$89(resources, theme);
                        break;
                    case 4:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.backgroundModStrong_delegate$lambda$8(resources, theme);
                        break;
                    case 5:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileSegmentedControlBackground_delegate$lambda$90(resources, theme);
                        break;
                    case 6:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchBorderDefault_delegate$lambda$110(resources, theme);
                        break;
                    case 7:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileSegmentedControlIndicatorBackground_delegate$lambda$91(resources, theme);
                        break;
                    case 8:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileTextHeadingPrimary_delegate$lambda$92(resources, theme);
                        break;
                    case 9:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileThreadEmbedBackground_delegate$lambda$93(resources, theme);
                        break;
                    case 10:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileUnreadbarTextDefault_delegate$lambda$94(resources, theme);
                        break;
                    case 11:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileVoicePanelBadgeBackground_delegate$lambda$95(resources, theme);
                        break;
                    case 12:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.progressbarIndicatorBackground_delegate$lambda$96(resources, theme);
                        break;
                    case 13:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.radioBorderDefault_delegate$lambda$97(resources, theme);
                        break;
                    case 14:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.reactionBackgroundDefault_delegate$lambda$98(resources, theme);
                        break;
                    case 15:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.reactionBackgroundReactedDefault_delegate$lambda$99(resources, theme);
                        break;
                    case 16:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.backgroundModSubtle_delegate$lambda$9(resources, theme);
                        break;
                    case 17:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchBorderSelectedDefault_delegate$lambda$111(resources, theme);
                        break;
                    case 18:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchThumbBackgroundDefault_delegate$lambda$112(resources, theme);
                        break;
                    case 19:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchThumbBackgroundSelectedDefault_delegate$lambda$113(resources, theme);
                        break;
                    case 20:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchThumbIconDefault_delegate$lambda$114(resources, theme);
                        break;
                    case 21:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tabBarBackground_delegate$lambda$115(resources, theme);
                        break;
                    case 22:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tabLabelTextDefault_delegate$lambda$116(resources, theme);
                        break;
                    case 23:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tabLabelTextFocused_delegate$lambda$117(resources, theme);
                        break;
                    case 24:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.reactionBorderDefault_delegate$lambda$100(resources, theme);
                        break;
                    case 25:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tablerowBackgroundDefault_delegate$lambda$118(resources, theme);
                        break;
                    case 26:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tablerowBackgroundPressed_delegate$lambda$119(resources, theme);
                        break;
                    case 27:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.backgroundScrimLightbox_delegate$lambda$11(resources, theme);
                        break;
                    case 28:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tablerowIconColorDefault_delegate$lambda$120(resources, theme);
                        break;
                    default:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.textBrand_delegate$lambda$121(resources, theme);
                        break;
                }
                return Integer.valueOf(iMobileGuildbarIconDefault_delegate$lambda$86);
            }
        });
        final int i62 = 15;
        this.reactionBackgroundReactedDefault = l.b(new Function0() { // from class: f8.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iMobileGuildbarIconDefault_delegate$lambda$86;
                switch (i62) {
                    case 0:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileGuildbarIconDefault_delegate$lambda$86(resources, theme);
                        break;
                    case 1:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileHeaderIconDefault_delegate$lambda$87(resources, theme);
                        break;
                    case 2:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileKeyboardGapBackground_delegate$lambda$88(resources, theme);
                        break;
                    case 3:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileKeyboardPanelBackground_delegate$lambda$89(resources, theme);
                        break;
                    case 4:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.backgroundModStrong_delegate$lambda$8(resources, theme);
                        break;
                    case 5:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileSegmentedControlBackground_delegate$lambda$90(resources, theme);
                        break;
                    case 6:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchBorderDefault_delegate$lambda$110(resources, theme);
                        break;
                    case 7:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileSegmentedControlIndicatorBackground_delegate$lambda$91(resources, theme);
                        break;
                    case 8:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileTextHeadingPrimary_delegate$lambda$92(resources, theme);
                        break;
                    case 9:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileThreadEmbedBackground_delegate$lambda$93(resources, theme);
                        break;
                    case 10:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileUnreadbarTextDefault_delegate$lambda$94(resources, theme);
                        break;
                    case 11:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileVoicePanelBadgeBackground_delegate$lambda$95(resources, theme);
                        break;
                    case 12:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.progressbarIndicatorBackground_delegate$lambda$96(resources, theme);
                        break;
                    case 13:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.radioBorderDefault_delegate$lambda$97(resources, theme);
                        break;
                    case 14:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.reactionBackgroundDefault_delegate$lambda$98(resources, theme);
                        break;
                    case 15:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.reactionBackgroundReactedDefault_delegate$lambda$99(resources, theme);
                        break;
                    case 16:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.backgroundModSubtle_delegate$lambda$9(resources, theme);
                        break;
                    case 17:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchBorderSelectedDefault_delegate$lambda$111(resources, theme);
                        break;
                    case 18:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchThumbBackgroundDefault_delegate$lambda$112(resources, theme);
                        break;
                    case 19:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchThumbBackgroundSelectedDefault_delegate$lambda$113(resources, theme);
                        break;
                    case 20:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchThumbIconDefault_delegate$lambda$114(resources, theme);
                        break;
                    case 21:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tabBarBackground_delegate$lambda$115(resources, theme);
                        break;
                    case 22:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tabLabelTextDefault_delegate$lambda$116(resources, theme);
                        break;
                    case 23:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tabLabelTextFocused_delegate$lambda$117(resources, theme);
                        break;
                    case 24:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.reactionBorderDefault_delegate$lambda$100(resources, theme);
                        break;
                    case 25:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tablerowBackgroundDefault_delegate$lambda$118(resources, theme);
                        break;
                    case 26:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tablerowBackgroundPressed_delegate$lambda$119(resources, theme);
                        break;
                    case 27:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.backgroundScrimLightbox_delegate$lambda$11(resources, theme);
                        break;
                    case 28:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tablerowIconColorDefault_delegate$lambda$120(resources, theme);
                        break;
                    default:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.textBrand_delegate$lambda$121(resources, theme);
                        break;
                }
                return Integer.valueOf(iMobileGuildbarIconDefault_delegate$lambda$86);
            }
        });
        final int i63 = 24;
        this.reactionBorderDefault = l.b(new Function0() { // from class: f8.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iMobileGuildbarIconDefault_delegate$lambda$86;
                switch (i63) {
                    case 0:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileGuildbarIconDefault_delegate$lambda$86(resources, theme);
                        break;
                    case 1:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileHeaderIconDefault_delegate$lambda$87(resources, theme);
                        break;
                    case 2:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileKeyboardGapBackground_delegate$lambda$88(resources, theme);
                        break;
                    case 3:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileKeyboardPanelBackground_delegate$lambda$89(resources, theme);
                        break;
                    case 4:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.backgroundModStrong_delegate$lambda$8(resources, theme);
                        break;
                    case 5:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileSegmentedControlBackground_delegate$lambda$90(resources, theme);
                        break;
                    case 6:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchBorderDefault_delegate$lambda$110(resources, theme);
                        break;
                    case 7:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileSegmentedControlIndicatorBackground_delegate$lambda$91(resources, theme);
                        break;
                    case 8:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileTextHeadingPrimary_delegate$lambda$92(resources, theme);
                        break;
                    case 9:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileThreadEmbedBackground_delegate$lambda$93(resources, theme);
                        break;
                    case 10:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileUnreadbarTextDefault_delegate$lambda$94(resources, theme);
                        break;
                    case 11:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileVoicePanelBadgeBackground_delegate$lambda$95(resources, theme);
                        break;
                    case 12:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.progressbarIndicatorBackground_delegate$lambda$96(resources, theme);
                        break;
                    case 13:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.radioBorderDefault_delegate$lambda$97(resources, theme);
                        break;
                    case 14:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.reactionBackgroundDefault_delegate$lambda$98(resources, theme);
                        break;
                    case 15:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.reactionBackgroundReactedDefault_delegate$lambda$99(resources, theme);
                        break;
                    case 16:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.backgroundModSubtle_delegate$lambda$9(resources, theme);
                        break;
                    case 17:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchBorderSelectedDefault_delegate$lambda$111(resources, theme);
                        break;
                    case 18:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchThumbBackgroundDefault_delegate$lambda$112(resources, theme);
                        break;
                    case 19:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchThumbBackgroundSelectedDefault_delegate$lambda$113(resources, theme);
                        break;
                    case 20:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchThumbIconDefault_delegate$lambda$114(resources, theme);
                        break;
                    case 21:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tabBarBackground_delegate$lambda$115(resources, theme);
                        break;
                    case 22:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tabLabelTextDefault_delegate$lambda$116(resources, theme);
                        break;
                    case 23:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tabLabelTextFocused_delegate$lambda$117(resources, theme);
                        break;
                    case 24:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.reactionBorderDefault_delegate$lambda$100(resources, theme);
                        break;
                    case 25:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tablerowBackgroundDefault_delegate$lambda$118(resources, theme);
                        break;
                    case 26:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tablerowBackgroundPressed_delegate$lambda$119(resources, theme);
                        break;
                    case 27:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.backgroundScrimLightbox_delegate$lambda$11(resources, theme);
                        break;
                    case 28:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tablerowIconColorDefault_delegate$lambda$120(resources, theme);
                        break;
                    default:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.textBrand_delegate$lambda$121(resources, theme);
                        break;
                }
                return Integer.valueOf(iMobileGuildbarIconDefault_delegate$lambda$86);
            }
        });
        final int i64 = 5;
        this.reactionBorderReactedDefault = l.b(new Function0() { // from class: f8.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iTextDefault_delegate$lambda$122;
                switch (i64) {
                    case 0:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textDefault_delegate$lambda$122(resources, theme);
                        break;
                    case 1:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackCritical_delegate$lambda$123(resources, theme);
                        break;
                    case 2:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackInfo_delegate$lambda$124(resources, theme);
                        break;
                    case 3:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackPositive_delegate$lambda$125(resources, theme);
                        break;
                    case 4:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackWarning_delegate$lambda$126(resources, theme);
                        break;
                    case 5:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.reactionBorderReactedDefault_delegate$lambda$101(resources, theme);
                        break;
                    case 6:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textMuted_delegate$lambda$127(resources, theme);
                        break;
                    case 7:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textStrong_delegate$lambda$128(resources, theme);
                        break;
                    case 8:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textSubtle_delegate$lambda$129(resources, theme);
                        break;
                    case 9:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.backgroundSurfaceHigh_delegate$lambda$12(resources, theme);
                        break;
                    case 10:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textVoiceConnected_delegate$lambda$130(resources, theme);
                        break;
                    case 11:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textVoiceDisconnected_delegate$lambda$131(resources, theme);
                        break;
                    case 12:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textVoiceSpeaking_delegate$lambda$132(resources, theme);
                        break;
                    case 13:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.userProfileAboutMeHeadingText_delegate$lambda$133(resources, theme);
                        break;
                    case 14:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.userProfileContainerBackground_delegate$lambda$134(resources, theme);
                        break;
                    case 15:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.userProfileGradientBackground_delegate$lambda$135(resources, theme);
                        break;
                    case 16:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.reactionTextReactedDefault_delegate$lambda$102(resources, theme);
                        break;
                    case 17:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitAccentBackground_delegate$lambda$136(resources, theme);
                        break;
                    case 18:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitBackground_delegate$lambda$137(resources, theme);
                        break;
                    case 19:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitIcon_delegate$lambda$138(resources, theme);
                        break;
                    case 20:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitText_delegate$lambda$139(resources, theme);
                        break;
                    case 21:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.backgroundSurfaceHighest_delegate$lambda$13(resources, theme);
                        break;
                    case 22:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.backgroundVoiceMuted_delegate$lambda$14(resources, theme);
                        break;
                    case 23:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.badgeNotificationBackground_delegate$lambda$15(resources, theme);
                        break;
                    case 24:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.borderStrong_delegate$lambda$16(resources, theme);
                        break;
                    case 25:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.borderSubtle_delegate$lambda$17(resources, theme);
                        break;
                    case 26:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.cardBackgroundDefault_delegate$lambda$18(resources, theme);
                        break;
                    case 27:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.redesignButtonTertiaryBackground_delegate$lambda$103(resources, theme);
                        break;
                    case 28:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.cardSecondaryBackgroundActive_delegate$lambda$19(resources, theme);
                        break;
                    default:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.appFrameBorder_delegate$lambda$1(resources, theme);
                        break;
                }
                return Integer.valueOf(iTextDefault_delegate$lambda$122);
            }
        });
        final int i65 = 16;
        this.reactionTextReactedDefault = l.b(new Function0() { // from class: f8.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iTextDefault_delegate$lambda$122;
                switch (i65) {
                    case 0:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textDefault_delegate$lambda$122(resources, theme);
                        break;
                    case 1:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackCritical_delegate$lambda$123(resources, theme);
                        break;
                    case 2:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackInfo_delegate$lambda$124(resources, theme);
                        break;
                    case 3:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackPositive_delegate$lambda$125(resources, theme);
                        break;
                    case 4:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackWarning_delegate$lambda$126(resources, theme);
                        break;
                    case 5:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.reactionBorderReactedDefault_delegate$lambda$101(resources, theme);
                        break;
                    case 6:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textMuted_delegate$lambda$127(resources, theme);
                        break;
                    case 7:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textStrong_delegate$lambda$128(resources, theme);
                        break;
                    case 8:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textSubtle_delegate$lambda$129(resources, theme);
                        break;
                    case 9:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.backgroundSurfaceHigh_delegate$lambda$12(resources, theme);
                        break;
                    case 10:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textVoiceConnected_delegate$lambda$130(resources, theme);
                        break;
                    case 11:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textVoiceDisconnected_delegate$lambda$131(resources, theme);
                        break;
                    case 12:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textVoiceSpeaking_delegate$lambda$132(resources, theme);
                        break;
                    case 13:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.userProfileAboutMeHeadingText_delegate$lambda$133(resources, theme);
                        break;
                    case 14:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.userProfileContainerBackground_delegate$lambda$134(resources, theme);
                        break;
                    case 15:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.userProfileGradientBackground_delegate$lambda$135(resources, theme);
                        break;
                    case 16:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.reactionTextReactedDefault_delegate$lambda$102(resources, theme);
                        break;
                    case 17:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitAccentBackground_delegate$lambda$136(resources, theme);
                        break;
                    case 18:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitBackground_delegate$lambda$137(resources, theme);
                        break;
                    case 19:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitIcon_delegate$lambda$138(resources, theme);
                        break;
                    case 20:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitText_delegate$lambda$139(resources, theme);
                        break;
                    case 21:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.backgroundSurfaceHighest_delegate$lambda$13(resources, theme);
                        break;
                    case 22:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.backgroundVoiceMuted_delegate$lambda$14(resources, theme);
                        break;
                    case 23:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.badgeNotificationBackground_delegate$lambda$15(resources, theme);
                        break;
                    case 24:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.borderStrong_delegate$lambda$16(resources, theme);
                        break;
                    case 25:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.borderSubtle_delegate$lambda$17(resources, theme);
                        break;
                    case 26:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.cardBackgroundDefault_delegate$lambda$18(resources, theme);
                        break;
                    case 27:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.redesignButtonTertiaryBackground_delegate$lambda$103(resources, theme);
                        break;
                    case 28:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.cardSecondaryBackgroundActive_delegate$lambda$19(resources, theme);
                        break;
                    default:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.appFrameBorder_delegate$lambda$1(resources, theme);
                        break;
                }
                return Integer.valueOf(iTextDefault_delegate$lambda$122);
            }
        });
        final int i66 = 27;
        this.redesignButtonTertiaryBackground = l.b(new Function0() { // from class: f8.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iTextDefault_delegate$lambda$122;
                switch (i66) {
                    case 0:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textDefault_delegate$lambda$122(resources, theme);
                        break;
                    case 1:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackCritical_delegate$lambda$123(resources, theme);
                        break;
                    case 2:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackInfo_delegate$lambda$124(resources, theme);
                        break;
                    case 3:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackPositive_delegate$lambda$125(resources, theme);
                        break;
                    case 4:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackWarning_delegate$lambda$126(resources, theme);
                        break;
                    case 5:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.reactionBorderReactedDefault_delegate$lambda$101(resources, theme);
                        break;
                    case 6:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textMuted_delegate$lambda$127(resources, theme);
                        break;
                    case 7:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textStrong_delegate$lambda$128(resources, theme);
                        break;
                    case 8:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textSubtle_delegate$lambda$129(resources, theme);
                        break;
                    case 9:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.backgroundSurfaceHigh_delegate$lambda$12(resources, theme);
                        break;
                    case 10:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textVoiceConnected_delegate$lambda$130(resources, theme);
                        break;
                    case 11:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textVoiceDisconnected_delegate$lambda$131(resources, theme);
                        break;
                    case 12:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textVoiceSpeaking_delegate$lambda$132(resources, theme);
                        break;
                    case 13:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.userProfileAboutMeHeadingText_delegate$lambda$133(resources, theme);
                        break;
                    case 14:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.userProfileContainerBackground_delegate$lambda$134(resources, theme);
                        break;
                    case 15:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.userProfileGradientBackground_delegate$lambda$135(resources, theme);
                        break;
                    case 16:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.reactionTextReactedDefault_delegate$lambda$102(resources, theme);
                        break;
                    case 17:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitAccentBackground_delegate$lambda$136(resources, theme);
                        break;
                    case 18:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitBackground_delegate$lambda$137(resources, theme);
                        break;
                    case 19:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitIcon_delegate$lambda$138(resources, theme);
                        break;
                    case 20:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitText_delegate$lambda$139(resources, theme);
                        break;
                    case 21:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.backgroundSurfaceHighest_delegate$lambda$13(resources, theme);
                        break;
                    case 22:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.backgroundVoiceMuted_delegate$lambda$14(resources, theme);
                        break;
                    case 23:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.badgeNotificationBackground_delegate$lambda$15(resources, theme);
                        break;
                    case 24:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.borderStrong_delegate$lambda$16(resources, theme);
                        break;
                    case 25:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.borderSubtle_delegate$lambda$17(resources, theme);
                        break;
                    case 26:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.cardBackgroundDefault_delegate$lambda$18(resources, theme);
                        break;
                    case 27:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.redesignButtonTertiaryBackground_delegate$lambda$103(resources, theme);
                        break;
                    case 28:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.cardSecondaryBackgroundActive_delegate$lambda$19(resources, theme);
                        break;
                    default:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.appFrameBorder_delegate$lambda$1(resources, theme);
                        break;
                }
                return Integer.valueOf(iTextDefault_delegate$lambda$122);
            }
        });
        final int i67 = 8;
        this.spineDefault = l.b(new Function0() { // from class: f8.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iCardSecondaryBackgroundDefault_delegate$lambda$20;
                switch (i67) {
                    case 0:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.cardSecondaryBackgroundDefault_delegate$lambda$20(resources, theme);
                        break;
                    case 1:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.channelBackgroundDefault_delegate$lambda$21(resources, theme);
                        break;
                    case 2:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputActionButtonBackground_delegate$lambda$22(resources, theme);
                        break;
                    case 3:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputActionButtonIconDefaultTint_delegate$lambda$23(resources, theme);
                        break;
                    case 4:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputActionIconActiveTint_delegate$lambda$24(resources, theme);
                        break;
                    case 5:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputBackground_delegate$lambda$25(resources, theme);
                        break;
                    case 6:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputIconDefaultTint_delegate$lambda$26(resources, theme);
                        break;
                    case 7:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputSendButtonActiveBackground_delegate$lambda$27(resources, theme);
                        break;
                    case 8:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.spineDefault_delegate$lambda$104(resources, theme);
                        break;
                    case 9:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputSendButtonIconActiveTint_delegate$lambda$28(resources, theme);
                        break;
                    case 10:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBackgroundDefault_delegate$lambda$29(resources, theme);
                        break;
                    case 11:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.backgroundBaseLow_delegate$lambda$2(resources, theme);
                        break;
                    case 12:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBackgroundSelectedDefault_delegate$lambda$30(resources, theme);
                        break;
                    case 13:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBorderDefault_delegate$lambda$31(resources, theme);
                        break;
                    case 14:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBorderSelectedDefault_delegate$lambda$32(resources, theme);
                        break;
                    case 15:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxIconActive_delegate$lambda$33(resources, theme);
                        break;
                    case 16:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBackgroundActive_delegate$lambda$34(resources, theme);
                        break;
                    case 17:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBackgroundDefault_delegate$lambda$35(resources, theme);
                        break;
                    case 18:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBorderActive_delegate$lambda$36(resources, theme);
                        break;
                    case 19:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.spoilerHiddenBackground_delegate$lambda$105(resources, theme);
                        break;
                    case 20:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBorderDefault_delegate$lambda$37(resources, theme);
                        break;
                    case 21:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedTextDefault_delegate$lambda$38(resources, theme);
                        break;
                    case 22:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBackgroundActive_delegate$lambda$39(resources, theme);
                        break;
                    case 23:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.backgroundBaseLower_delegate$lambda$3(resources, theme);
                        break;
                    case 24:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBackgroundDefault_delegate$lambda$40(resources, theme);
                        break;
                    case 25:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBorderActive_delegate$lambda$41(resources, theme);
                        break;
                    case 26:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBorderDefault_delegate$lambda$42(resources, theme);
                        break;
                    case 27:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryTextDefault_delegate$lambda$43(resources, theme);
                        break;
                    case 28:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlOverlayPrimaryBackgroundActive_delegate$lambda$44(resources, theme);
                        break;
                    default:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlOverlayPrimaryBackgroundDefault_delegate$lambda$45(resources, theme);
                        break;
                }
                return Integer.valueOf(iCardSecondaryBackgroundDefault_delegate$lambda$20);
            }
        });
        final int i68 = 19;
        this.spoilerHiddenBackground = l.b(new Function0() { // from class: f8.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iCardSecondaryBackgroundDefault_delegate$lambda$20;
                switch (i68) {
                    case 0:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.cardSecondaryBackgroundDefault_delegate$lambda$20(resources, theme);
                        break;
                    case 1:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.channelBackgroundDefault_delegate$lambda$21(resources, theme);
                        break;
                    case 2:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputActionButtonBackground_delegate$lambda$22(resources, theme);
                        break;
                    case 3:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputActionButtonIconDefaultTint_delegate$lambda$23(resources, theme);
                        break;
                    case 4:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputActionIconActiveTint_delegate$lambda$24(resources, theme);
                        break;
                    case 5:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputBackground_delegate$lambda$25(resources, theme);
                        break;
                    case 6:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputIconDefaultTint_delegate$lambda$26(resources, theme);
                        break;
                    case 7:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputSendButtonActiveBackground_delegate$lambda$27(resources, theme);
                        break;
                    case 8:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.spineDefault_delegate$lambda$104(resources, theme);
                        break;
                    case 9:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.chatInputSendButtonIconActiveTint_delegate$lambda$28(resources, theme);
                        break;
                    case 10:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBackgroundDefault_delegate$lambda$29(resources, theme);
                        break;
                    case 11:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.backgroundBaseLow_delegate$lambda$2(resources, theme);
                        break;
                    case 12:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBackgroundSelectedDefault_delegate$lambda$30(resources, theme);
                        break;
                    case 13:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBorderDefault_delegate$lambda$31(resources, theme);
                        break;
                    case 14:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxBorderSelectedDefault_delegate$lambda$32(resources, theme);
                        break;
                    case 15:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.checkboxIconActive_delegate$lambda$33(resources, theme);
                        break;
                    case 16:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBackgroundActive_delegate$lambda$34(resources, theme);
                        break;
                    case 17:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBackgroundDefault_delegate$lambda$35(resources, theme);
                        break;
                    case 18:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBorderActive_delegate$lambda$36(resources, theme);
                        break;
                    case 19:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.spoilerHiddenBackground_delegate$lambda$105(resources, theme);
                        break;
                    case 20:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedBorderDefault_delegate$lambda$37(resources, theme);
                        break;
                    case 21:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlConnectedTextDefault_delegate$lambda$38(resources, theme);
                        break;
                    case 22:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBackgroundActive_delegate$lambda$39(resources, theme);
                        break;
                    case 23:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.backgroundBaseLower_delegate$lambda$3(resources, theme);
                        break;
                    case 24:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBackgroundDefault_delegate$lambda$40(resources, theme);
                        break;
                    case 25:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBorderActive_delegate$lambda$41(resources, theme);
                        break;
                    case 26:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryBorderDefault_delegate$lambda$42(resources, theme);
                        break;
                    case 27:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlCriticalPrimaryTextDefault_delegate$lambda$43(resources, theme);
                        break;
                    case 28:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlOverlayPrimaryBackgroundActive_delegate$lambda$44(resources, theme);
                        break;
                    default:
                        iCardSecondaryBackgroundDefault_delegate$lambda$20 = DarkThemeExperiment.controlOverlayPrimaryBackgroundDefault_delegate$lambda$45(resources, theme);
                        break;
                }
                return Integer.valueOf(iCardSecondaryBackgroundDefault_delegate$lambda$20);
            }
        });
        this.standaloneChannelContentBackground = l.b(new f8.l(resources, 0, theme));
        this.standaloneChannelHeaderBorder = l.b(new f8.l(resources, 11, theme));
        this.switchBackgroundDefault = l.b(new f8.l(resources, 22, theme));
        this.switchBackgroundSelectedDefault = l.b(new h(resources, 14, theme));
        final int i69 = 6;
        this.switchBorderDefault = l.b(new Function0() { // from class: f8.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iMobileGuildbarIconDefault_delegate$lambda$86;
                switch (i69) {
                    case 0:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileGuildbarIconDefault_delegate$lambda$86(resources, theme);
                        break;
                    case 1:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileHeaderIconDefault_delegate$lambda$87(resources, theme);
                        break;
                    case 2:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileKeyboardGapBackground_delegate$lambda$88(resources, theme);
                        break;
                    case 3:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileKeyboardPanelBackground_delegate$lambda$89(resources, theme);
                        break;
                    case 4:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.backgroundModStrong_delegate$lambda$8(resources, theme);
                        break;
                    case 5:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileSegmentedControlBackground_delegate$lambda$90(resources, theme);
                        break;
                    case 6:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchBorderDefault_delegate$lambda$110(resources, theme);
                        break;
                    case 7:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileSegmentedControlIndicatorBackground_delegate$lambda$91(resources, theme);
                        break;
                    case 8:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileTextHeadingPrimary_delegate$lambda$92(resources, theme);
                        break;
                    case 9:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileThreadEmbedBackground_delegate$lambda$93(resources, theme);
                        break;
                    case 10:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileUnreadbarTextDefault_delegate$lambda$94(resources, theme);
                        break;
                    case 11:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileVoicePanelBadgeBackground_delegate$lambda$95(resources, theme);
                        break;
                    case 12:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.progressbarIndicatorBackground_delegate$lambda$96(resources, theme);
                        break;
                    case 13:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.radioBorderDefault_delegate$lambda$97(resources, theme);
                        break;
                    case 14:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.reactionBackgroundDefault_delegate$lambda$98(resources, theme);
                        break;
                    case 15:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.reactionBackgroundReactedDefault_delegate$lambda$99(resources, theme);
                        break;
                    case 16:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.backgroundModSubtle_delegate$lambda$9(resources, theme);
                        break;
                    case 17:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchBorderSelectedDefault_delegate$lambda$111(resources, theme);
                        break;
                    case 18:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchThumbBackgroundDefault_delegate$lambda$112(resources, theme);
                        break;
                    case 19:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchThumbBackgroundSelectedDefault_delegate$lambda$113(resources, theme);
                        break;
                    case 20:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchThumbIconDefault_delegate$lambda$114(resources, theme);
                        break;
                    case 21:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tabBarBackground_delegate$lambda$115(resources, theme);
                        break;
                    case 22:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tabLabelTextDefault_delegate$lambda$116(resources, theme);
                        break;
                    case 23:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tabLabelTextFocused_delegate$lambda$117(resources, theme);
                        break;
                    case 24:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.reactionBorderDefault_delegate$lambda$100(resources, theme);
                        break;
                    case 25:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tablerowBackgroundDefault_delegate$lambda$118(resources, theme);
                        break;
                    case 26:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tablerowBackgroundPressed_delegate$lambda$119(resources, theme);
                        break;
                    case 27:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.backgroundScrimLightbox_delegate$lambda$11(resources, theme);
                        break;
                    case 28:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tablerowIconColorDefault_delegate$lambda$120(resources, theme);
                        break;
                    default:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.textBrand_delegate$lambda$121(resources, theme);
                        break;
                }
                return Integer.valueOf(iMobileGuildbarIconDefault_delegate$lambda$86);
            }
        });
        final int i70 = 17;
        this.switchBorderSelectedDefault = l.b(new Function0() { // from class: f8.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iMobileGuildbarIconDefault_delegate$lambda$86;
                switch (i70) {
                    case 0:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileGuildbarIconDefault_delegate$lambda$86(resources, theme);
                        break;
                    case 1:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileHeaderIconDefault_delegate$lambda$87(resources, theme);
                        break;
                    case 2:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileKeyboardGapBackground_delegate$lambda$88(resources, theme);
                        break;
                    case 3:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileKeyboardPanelBackground_delegate$lambda$89(resources, theme);
                        break;
                    case 4:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.backgroundModStrong_delegate$lambda$8(resources, theme);
                        break;
                    case 5:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileSegmentedControlBackground_delegate$lambda$90(resources, theme);
                        break;
                    case 6:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchBorderDefault_delegate$lambda$110(resources, theme);
                        break;
                    case 7:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileSegmentedControlIndicatorBackground_delegate$lambda$91(resources, theme);
                        break;
                    case 8:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileTextHeadingPrimary_delegate$lambda$92(resources, theme);
                        break;
                    case 9:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileThreadEmbedBackground_delegate$lambda$93(resources, theme);
                        break;
                    case 10:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileUnreadbarTextDefault_delegate$lambda$94(resources, theme);
                        break;
                    case 11:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileVoicePanelBadgeBackground_delegate$lambda$95(resources, theme);
                        break;
                    case 12:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.progressbarIndicatorBackground_delegate$lambda$96(resources, theme);
                        break;
                    case 13:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.radioBorderDefault_delegate$lambda$97(resources, theme);
                        break;
                    case 14:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.reactionBackgroundDefault_delegate$lambda$98(resources, theme);
                        break;
                    case 15:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.reactionBackgroundReactedDefault_delegate$lambda$99(resources, theme);
                        break;
                    case 16:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.backgroundModSubtle_delegate$lambda$9(resources, theme);
                        break;
                    case 17:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchBorderSelectedDefault_delegate$lambda$111(resources, theme);
                        break;
                    case 18:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchThumbBackgroundDefault_delegate$lambda$112(resources, theme);
                        break;
                    case 19:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchThumbBackgroundSelectedDefault_delegate$lambda$113(resources, theme);
                        break;
                    case 20:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchThumbIconDefault_delegate$lambda$114(resources, theme);
                        break;
                    case 21:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tabBarBackground_delegate$lambda$115(resources, theme);
                        break;
                    case 22:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tabLabelTextDefault_delegate$lambda$116(resources, theme);
                        break;
                    case 23:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tabLabelTextFocused_delegate$lambda$117(resources, theme);
                        break;
                    case 24:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.reactionBorderDefault_delegate$lambda$100(resources, theme);
                        break;
                    case 25:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tablerowBackgroundDefault_delegate$lambda$118(resources, theme);
                        break;
                    case 26:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tablerowBackgroundPressed_delegate$lambda$119(resources, theme);
                        break;
                    case 27:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.backgroundScrimLightbox_delegate$lambda$11(resources, theme);
                        break;
                    case 28:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tablerowIconColorDefault_delegate$lambda$120(resources, theme);
                        break;
                    default:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.textBrand_delegate$lambda$121(resources, theme);
                        break;
                }
                return Integer.valueOf(iMobileGuildbarIconDefault_delegate$lambda$86);
            }
        });
        final int i71 = 18;
        this.switchThumbBackgroundDefault = l.b(new Function0() { // from class: f8.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iMobileGuildbarIconDefault_delegate$lambda$86;
                switch (i71) {
                    case 0:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileGuildbarIconDefault_delegate$lambda$86(resources, theme);
                        break;
                    case 1:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileHeaderIconDefault_delegate$lambda$87(resources, theme);
                        break;
                    case 2:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileKeyboardGapBackground_delegate$lambda$88(resources, theme);
                        break;
                    case 3:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileKeyboardPanelBackground_delegate$lambda$89(resources, theme);
                        break;
                    case 4:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.backgroundModStrong_delegate$lambda$8(resources, theme);
                        break;
                    case 5:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileSegmentedControlBackground_delegate$lambda$90(resources, theme);
                        break;
                    case 6:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchBorderDefault_delegate$lambda$110(resources, theme);
                        break;
                    case 7:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileSegmentedControlIndicatorBackground_delegate$lambda$91(resources, theme);
                        break;
                    case 8:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileTextHeadingPrimary_delegate$lambda$92(resources, theme);
                        break;
                    case 9:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileThreadEmbedBackground_delegate$lambda$93(resources, theme);
                        break;
                    case 10:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileUnreadbarTextDefault_delegate$lambda$94(resources, theme);
                        break;
                    case 11:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileVoicePanelBadgeBackground_delegate$lambda$95(resources, theme);
                        break;
                    case 12:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.progressbarIndicatorBackground_delegate$lambda$96(resources, theme);
                        break;
                    case 13:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.radioBorderDefault_delegate$lambda$97(resources, theme);
                        break;
                    case 14:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.reactionBackgroundDefault_delegate$lambda$98(resources, theme);
                        break;
                    case 15:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.reactionBackgroundReactedDefault_delegate$lambda$99(resources, theme);
                        break;
                    case 16:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.backgroundModSubtle_delegate$lambda$9(resources, theme);
                        break;
                    case 17:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchBorderSelectedDefault_delegate$lambda$111(resources, theme);
                        break;
                    case 18:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchThumbBackgroundDefault_delegate$lambda$112(resources, theme);
                        break;
                    case 19:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchThumbBackgroundSelectedDefault_delegate$lambda$113(resources, theme);
                        break;
                    case 20:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchThumbIconDefault_delegate$lambda$114(resources, theme);
                        break;
                    case 21:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tabBarBackground_delegate$lambda$115(resources, theme);
                        break;
                    case 22:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tabLabelTextDefault_delegate$lambda$116(resources, theme);
                        break;
                    case 23:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tabLabelTextFocused_delegate$lambda$117(resources, theme);
                        break;
                    case 24:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.reactionBorderDefault_delegate$lambda$100(resources, theme);
                        break;
                    case 25:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tablerowBackgroundDefault_delegate$lambda$118(resources, theme);
                        break;
                    case 26:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tablerowBackgroundPressed_delegate$lambda$119(resources, theme);
                        break;
                    case 27:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.backgroundScrimLightbox_delegate$lambda$11(resources, theme);
                        break;
                    case 28:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tablerowIconColorDefault_delegate$lambda$120(resources, theme);
                        break;
                    default:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.textBrand_delegate$lambda$121(resources, theme);
                        break;
                }
                return Integer.valueOf(iMobileGuildbarIconDefault_delegate$lambda$86);
            }
        });
        final int i72 = 19;
        this.switchThumbBackgroundSelectedDefault = l.b(new Function0() { // from class: f8.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iMobileGuildbarIconDefault_delegate$lambda$86;
                switch (i72) {
                    case 0:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileGuildbarIconDefault_delegate$lambda$86(resources, theme);
                        break;
                    case 1:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileHeaderIconDefault_delegate$lambda$87(resources, theme);
                        break;
                    case 2:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileKeyboardGapBackground_delegate$lambda$88(resources, theme);
                        break;
                    case 3:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileKeyboardPanelBackground_delegate$lambda$89(resources, theme);
                        break;
                    case 4:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.backgroundModStrong_delegate$lambda$8(resources, theme);
                        break;
                    case 5:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileSegmentedControlBackground_delegate$lambda$90(resources, theme);
                        break;
                    case 6:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchBorderDefault_delegate$lambda$110(resources, theme);
                        break;
                    case 7:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileSegmentedControlIndicatorBackground_delegate$lambda$91(resources, theme);
                        break;
                    case 8:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileTextHeadingPrimary_delegate$lambda$92(resources, theme);
                        break;
                    case 9:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileThreadEmbedBackground_delegate$lambda$93(resources, theme);
                        break;
                    case 10:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileUnreadbarTextDefault_delegate$lambda$94(resources, theme);
                        break;
                    case 11:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileVoicePanelBadgeBackground_delegate$lambda$95(resources, theme);
                        break;
                    case 12:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.progressbarIndicatorBackground_delegate$lambda$96(resources, theme);
                        break;
                    case 13:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.radioBorderDefault_delegate$lambda$97(resources, theme);
                        break;
                    case 14:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.reactionBackgroundDefault_delegate$lambda$98(resources, theme);
                        break;
                    case 15:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.reactionBackgroundReactedDefault_delegate$lambda$99(resources, theme);
                        break;
                    case 16:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.backgroundModSubtle_delegate$lambda$9(resources, theme);
                        break;
                    case 17:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchBorderSelectedDefault_delegate$lambda$111(resources, theme);
                        break;
                    case 18:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchThumbBackgroundDefault_delegate$lambda$112(resources, theme);
                        break;
                    case 19:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchThumbBackgroundSelectedDefault_delegate$lambda$113(resources, theme);
                        break;
                    case 20:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchThumbIconDefault_delegate$lambda$114(resources, theme);
                        break;
                    case 21:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tabBarBackground_delegate$lambda$115(resources, theme);
                        break;
                    case 22:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tabLabelTextDefault_delegate$lambda$116(resources, theme);
                        break;
                    case 23:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tabLabelTextFocused_delegate$lambda$117(resources, theme);
                        break;
                    case 24:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.reactionBorderDefault_delegate$lambda$100(resources, theme);
                        break;
                    case 25:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tablerowBackgroundDefault_delegate$lambda$118(resources, theme);
                        break;
                    case 26:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tablerowBackgroundPressed_delegate$lambda$119(resources, theme);
                        break;
                    case 27:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.backgroundScrimLightbox_delegate$lambda$11(resources, theme);
                        break;
                    case 28:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tablerowIconColorDefault_delegate$lambda$120(resources, theme);
                        break;
                    default:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.textBrand_delegate$lambda$121(resources, theme);
                        break;
                }
                return Integer.valueOf(iMobileGuildbarIconDefault_delegate$lambda$86);
            }
        });
        final int i73 = 20;
        this.switchThumbIconDefault = l.b(new Function0() { // from class: f8.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iMobileGuildbarIconDefault_delegate$lambda$86;
                switch (i73) {
                    case 0:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileGuildbarIconDefault_delegate$lambda$86(resources, theme);
                        break;
                    case 1:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileHeaderIconDefault_delegate$lambda$87(resources, theme);
                        break;
                    case 2:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileKeyboardGapBackground_delegate$lambda$88(resources, theme);
                        break;
                    case 3:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileKeyboardPanelBackground_delegate$lambda$89(resources, theme);
                        break;
                    case 4:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.backgroundModStrong_delegate$lambda$8(resources, theme);
                        break;
                    case 5:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileSegmentedControlBackground_delegate$lambda$90(resources, theme);
                        break;
                    case 6:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchBorderDefault_delegate$lambda$110(resources, theme);
                        break;
                    case 7:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileSegmentedControlIndicatorBackground_delegate$lambda$91(resources, theme);
                        break;
                    case 8:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileTextHeadingPrimary_delegate$lambda$92(resources, theme);
                        break;
                    case 9:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileThreadEmbedBackground_delegate$lambda$93(resources, theme);
                        break;
                    case 10:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileUnreadbarTextDefault_delegate$lambda$94(resources, theme);
                        break;
                    case 11:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileVoicePanelBadgeBackground_delegate$lambda$95(resources, theme);
                        break;
                    case 12:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.progressbarIndicatorBackground_delegate$lambda$96(resources, theme);
                        break;
                    case 13:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.radioBorderDefault_delegate$lambda$97(resources, theme);
                        break;
                    case 14:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.reactionBackgroundDefault_delegate$lambda$98(resources, theme);
                        break;
                    case 15:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.reactionBackgroundReactedDefault_delegate$lambda$99(resources, theme);
                        break;
                    case 16:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.backgroundModSubtle_delegate$lambda$9(resources, theme);
                        break;
                    case 17:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchBorderSelectedDefault_delegate$lambda$111(resources, theme);
                        break;
                    case 18:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchThumbBackgroundDefault_delegate$lambda$112(resources, theme);
                        break;
                    case 19:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchThumbBackgroundSelectedDefault_delegate$lambda$113(resources, theme);
                        break;
                    case 20:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchThumbIconDefault_delegate$lambda$114(resources, theme);
                        break;
                    case 21:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tabBarBackground_delegate$lambda$115(resources, theme);
                        break;
                    case 22:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tabLabelTextDefault_delegate$lambda$116(resources, theme);
                        break;
                    case 23:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tabLabelTextFocused_delegate$lambda$117(resources, theme);
                        break;
                    case 24:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.reactionBorderDefault_delegate$lambda$100(resources, theme);
                        break;
                    case 25:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tablerowBackgroundDefault_delegate$lambda$118(resources, theme);
                        break;
                    case 26:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tablerowBackgroundPressed_delegate$lambda$119(resources, theme);
                        break;
                    case 27:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.backgroundScrimLightbox_delegate$lambda$11(resources, theme);
                        break;
                    case 28:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tablerowIconColorDefault_delegate$lambda$120(resources, theme);
                        break;
                    default:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.textBrand_delegate$lambda$121(resources, theme);
                        break;
                }
                return Integer.valueOf(iMobileGuildbarIconDefault_delegate$lambda$86);
            }
        });
        final int i74 = 21;
        this.tabBarBackground = l.b(new Function0() { // from class: f8.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iMobileGuildbarIconDefault_delegate$lambda$86;
                switch (i74) {
                    case 0:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileGuildbarIconDefault_delegate$lambda$86(resources, theme);
                        break;
                    case 1:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileHeaderIconDefault_delegate$lambda$87(resources, theme);
                        break;
                    case 2:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileKeyboardGapBackground_delegate$lambda$88(resources, theme);
                        break;
                    case 3:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileKeyboardPanelBackground_delegate$lambda$89(resources, theme);
                        break;
                    case 4:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.backgroundModStrong_delegate$lambda$8(resources, theme);
                        break;
                    case 5:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileSegmentedControlBackground_delegate$lambda$90(resources, theme);
                        break;
                    case 6:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchBorderDefault_delegate$lambda$110(resources, theme);
                        break;
                    case 7:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileSegmentedControlIndicatorBackground_delegate$lambda$91(resources, theme);
                        break;
                    case 8:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileTextHeadingPrimary_delegate$lambda$92(resources, theme);
                        break;
                    case 9:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileThreadEmbedBackground_delegate$lambda$93(resources, theme);
                        break;
                    case 10:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileUnreadbarTextDefault_delegate$lambda$94(resources, theme);
                        break;
                    case 11:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileVoicePanelBadgeBackground_delegate$lambda$95(resources, theme);
                        break;
                    case 12:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.progressbarIndicatorBackground_delegate$lambda$96(resources, theme);
                        break;
                    case 13:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.radioBorderDefault_delegate$lambda$97(resources, theme);
                        break;
                    case 14:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.reactionBackgroundDefault_delegate$lambda$98(resources, theme);
                        break;
                    case 15:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.reactionBackgroundReactedDefault_delegate$lambda$99(resources, theme);
                        break;
                    case 16:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.backgroundModSubtle_delegate$lambda$9(resources, theme);
                        break;
                    case 17:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchBorderSelectedDefault_delegate$lambda$111(resources, theme);
                        break;
                    case 18:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchThumbBackgroundDefault_delegate$lambda$112(resources, theme);
                        break;
                    case 19:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchThumbBackgroundSelectedDefault_delegate$lambda$113(resources, theme);
                        break;
                    case 20:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchThumbIconDefault_delegate$lambda$114(resources, theme);
                        break;
                    case 21:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tabBarBackground_delegate$lambda$115(resources, theme);
                        break;
                    case 22:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tabLabelTextDefault_delegate$lambda$116(resources, theme);
                        break;
                    case 23:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tabLabelTextFocused_delegate$lambda$117(resources, theme);
                        break;
                    case 24:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.reactionBorderDefault_delegate$lambda$100(resources, theme);
                        break;
                    case 25:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tablerowBackgroundDefault_delegate$lambda$118(resources, theme);
                        break;
                    case 26:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tablerowBackgroundPressed_delegate$lambda$119(resources, theme);
                        break;
                    case 27:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.backgroundScrimLightbox_delegate$lambda$11(resources, theme);
                        break;
                    case 28:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tablerowIconColorDefault_delegate$lambda$120(resources, theme);
                        break;
                    default:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.textBrand_delegate$lambda$121(resources, theme);
                        break;
                }
                return Integer.valueOf(iMobileGuildbarIconDefault_delegate$lambda$86);
            }
        });
        final int i75 = 22;
        this.tabLabelTextDefault = l.b(new Function0() { // from class: f8.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iMobileGuildbarIconDefault_delegate$lambda$86;
                switch (i75) {
                    case 0:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileGuildbarIconDefault_delegate$lambda$86(resources, theme);
                        break;
                    case 1:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileHeaderIconDefault_delegate$lambda$87(resources, theme);
                        break;
                    case 2:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileKeyboardGapBackground_delegate$lambda$88(resources, theme);
                        break;
                    case 3:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileKeyboardPanelBackground_delegate$lambda$89(resources, theme);
                        break;
                    case 4:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.backgroundModStrong_delegate$lambda$8(resources, theme);
                        break;
                    case 5:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileSegmentedControlBackground_delegate$lambda$90(resources, theme);
                        break;
                    case 6:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchBorderDefault_delegate$lambda$110(resources, theme);
                        break;
                    case 7:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileSegmentedControlIndicatorBackground_delegate$lambda$91(resources, theme);
                        break;
                    case 8:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileTextHeadingPrimary_delegate$lambda$92(resources, theme);
                        break;
                    case 9:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileThreadEmbedBackground_delegate$lambda$93(resources, theme);
                        break;
                    case 10:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileUnreadbarTextDefault_delegate$lambda$94(resources, theme);
                        break;
                    case 11:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileVoicePanelBadgeBackground_delegate$lambda$95(resources, theme);
                        break;
                    case 12:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.progressbarIndicatorBackground_delegate$lambda$96(resources, theme);
                        break;
                    case 13:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.radioBorderDefault_delegate$lambda$97(resources, theme);
                        break;
                    case 14:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.reactionBackgroundDefault_delegate$lambda$98(resources, theme);
                        break;
                    case 15:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.reactionBackgroundReactedDefault_delegate$lambda$99(resources, theme);
                        break;
                    case 16:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.backgroundModSubtle_delegate$lambda$9(resources, theme);
                        break;
                    case 17:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchBorderSelectedDefault_delegate$lambda$111(resources, theme);
                        break;
                    case 18:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchThumbBackgroundDefault_delegate$lambda$112(resources, theme);
                        break;
                    case 19:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchThumbBackgroundSelectedDefault_delegate$lambda$113(resources, theme);
                        break;
                    case 20:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchThumbIconDefault_delegate$lambda$114(resources, theme);
                        break;
                    case 21:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tabBarBackground_delegate$lambda$115(resources, theme);
                        break;
                    case 22:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tabLabelTextDefault_delegate$lambda$116(resources, theme);
                        break;
                    case 23:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tabLabelTextFocused_delegate$lambda$117(resources, theme);
                        break;
                    case 24:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.reactionBorderDefault_delegate$lambda$100(resources, theme);
                        break;
                    case 25:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tablerowBackgroundDefault_delegate$lambda$118(resources, theme);
                        break;
                    case 26:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tablerowBackgroundPressed_delegate$lambda$119(resources, theme);
                        break;
                    case 27:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.backgroundScrimLightbox_delegate$lambda$11(resources, theme);
                        break;
                    case 28:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tablerowIconColorDefault_delegate$lambda$120(resources, theme);
                        break;
                    default:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.textBrand_delegate$lambda$121(resources, theme);
                        break;
                }
                return Integer.valueOf(iMobileGuildbarIconDefault_delegate$lambda$86);
            }
        });
        final int i76 = 23;
        this.tabLabelTextFocused = l.b(new Function0() { // from class: f8.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iMobileGuildbarIconDefault_delegate$lambda$86;
                switch (i76) {
                    case 0:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileGuildbarIconDefault_delegate$lambda$86(resources, theme);
                        break;
                    case 1:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileHeaderIconDefault_delegate$lambda$87(resources, theme);
                        break;
                    case 2:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileKeyboardGapBackground_delegate$lambda$88(resources, theme);
                        break;
                    case 3:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileKeyboardPanelBackground_delegate$lambda$89(resources, theme);
                        break;
                    case 4:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.backgroundModStrong_delegate$lambda$8(resources, theme);
                        break;
                    case 5:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileSegmentedControlBackground_delegate$lambda$90(resources, theme);
                        break;
                    case 6:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchBorderDefault_delegate$lambda$110(resources, theme);
                        break;
                    case 7:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileSegmentedControlIndicatorBackground_delegate$lambda$91(resources, theme);
                        break;
                    case 8:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileTextHeadingPrimary_delegate$lambda$92(resources, theme);
                        break;
                    case 9:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileThreadEmbedBackground_delegate$lambda$93(resources, theme);
                        break;
                    case 10:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileUnreadbarTextDefault_delegate$lambda$94(resources, theme);
                        break;
                    case 11:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileVoicePanelBadgeBackground_delegate$lambda$95(resources, theme);
                        break;
                    case 12:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.progressbarIndicatorBackground_delegate$lambda$96(resources, theme);
                        break;
                    case 13:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.radioBorderDefault_delegate$lambda$97(resources, theme);
                        break;
                    case 14:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.reactionBackgroundDefault_delegate$lambda$98(resources, theme);
                        break;
                    case 15:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.reactionBackgroundReactedDefault_delegate$lambda$99(resources, theme);
                        break;
                    case 16:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.backgroundModSubtle_delegate$lambda$9(resources, theme);
                        break;
                    case 17:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchBorderSelectedDefault_delegate$lambda$111(resources, theme);
                        break;
                    case 18:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchThumbBackgroundDefault_delegate$lambda$112(resources, theme);
                        break;
                    case 19:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchThumbBackgroundSelectedDefault_delegate$lambda$113(resources, theme);
                        break;
                    case 20:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchThumbIconDefault_delegate$lambda$114(resources, theme);
                        break;
                    case 21:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tabBarBackground_delegate$lambda$115(resources, theme);
                        break;
                    case 22:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tabLabelTextDefault_delegate$lambda$116(resources, theme);
                        break;
                    case 23:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tabLabelTextFocused_delegate$lambda$117(resources, theme);
                        break;
                    case 24:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.reactionBorderDefault_delegate$lambda$100(resources, theme);
                        break;
                    case 25:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tablerowBackgroundDefault_delegate$lambda$118(resources, theme);
                        break;
                    case 26:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tablerowBackgroundPressed_delegate$lambda$119(resources, theme);
                        break;
                    case 27:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.backgroundScrimLightbox_delegate$lambda$11(resources, theme);
                        break;
                    case 28:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tablerowIconColorDefault_delegate$lambda$120(resources, theme);
                        break;
                    default:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.textBrand_delegate$lambda$121(resources, theme);
                        break;
                }
                return Integer.valueOf(iMobileGuildbarIconDefault_delegate$lambda$86);
            }
        });
        final int i77 = 25;
        this.tablerowBackgroundDefault = l.b(new Function0() { // from class: f8.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iMobileGuildbarIconDefault_delegate$lambda$86;
                switch (i77) {
                    case 0:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileGuildbarIconDefault_delegate$lambda$86(resources, theme);
                        break;
                    case 1:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileHeaderIconDefault_delegate$lambda$87(resources, theme);
                        break;
                    case 2:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileKeyboardGapBackground_delegate$lambda$88(resources, theme);
                        break;
                    case 3:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileKeyboardPanelBackground_delegate$lambda$89(resources, theme);
                        break;
                    case 4:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.backgroundModStrong_delegate$lambda$8(resources, theme);
                        break;
                    case 5:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileSegmentedControlBackground_delegate$lambda$90(resources, theme);
                        break;
                    case 6:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchBorderDefault_delegate$lambda$110(resources, theme);
                        break;
                    case 7:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileSegmentedControlIndicatorBackground_delegate$lambda$91(resources, theme);
                        break;
                    case 8:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileTextHeadingPrimary_delegate$lambda$92(resources, theme);
                        break;
                    case 9:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileThreadEmbedBackground_delegate$lambda$93(resources, theme);
                        break;
                    case 10:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileUnreadbarTextDefault_delegate$lambda$94(resources, theme);
                        break;
                    case 11:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileVoicePanelBadgeBackground_delegate$lambda$95(resources, theme);
                        break;
                    case 12:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.progressbarIndicatorBackground_delegate$lambda$96(resources, theme);
                        break;
                    case 13:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.radioBorderDefault_delegate$lambda$97(resources, theme);
                        break;
                    case 14:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.reactionBackgroundDefault_delegate$lambda$98(resources, theme);
                        break;
                    case 15:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.reactionBackgroundReactedDefault_delegate$lambda$99(resources, theme);
                        break;
                    case 16:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.backgroundModSubtle_delegate$lambda$9(resources, theme);
                        break;
                    case 17:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchBorderSelectedDefault_delegate$lambda$111(resources, theme);
                        break;
                    case 18:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchThumbBackgroundDefault_delegate$lambda$112(resources, theme);
                        break;
                    case 19:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchThumbBackgroundSelectedDefault_delegate$lambda$113(resources, theme);
                        break;
                    case 20:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchThumbIconDefault_delegate$lambda$114(resources, theme);
                        break;
                    case 21:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tabBarBackground_delegate$lambda$115(resources, theme);
                        break;
                    case 22:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tabLabelTextDefault_delegate$lambda$116(resources, theme);
                        break;
                    case 23:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tabLabelTextFocused_delegate$lambda$117(resources, theme);
                        break;
                    case 24:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.reactionBorderDefault_delegate$lambda$100(resources, theme);
                        break;
                    case 25:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tablerowBackgroundDefault_delegate$lambda$118(resources, theme);
                        break;
                    case 26:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tablerowBackgroundPressed_delegate$lambda$119(resources, theme);
                        break;
                    case 27:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.backgroundScrimLightbox_delegate$lambda$11(resources, theme);
                        break;
                    case 28:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tablerowIconColorDefault_delegate$lambda$120(resources, theme);
                        break;
                    default:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.textBrand_delegate$lambda$121(resources, theme);
                        break;
                }
                return Integer.valueOf(iMobileGuildbarIconDefault_delegate$lambda$86);
            }
        });
        final int i78 = 26;
        this.tablerowBackgroundPressed = l.b(new Function0() { // from class: f8.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iMobileGuildbarIconDefault_delegate$lambda$86;
                switch (i78) {
                    case 0:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileGuildbarIconDefault_delegate$lambda$86(resources, theme);
                        break;
                    case 1:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileHeaderIconDefault_delegate$lambda$87(resources, theme);
                        break;
                    case 2:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileKeyboardGapBackground_delegate$lambda$88(resources, theme);
                        break;
                    case 3:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileKeyboardPanelBackground_delegate$lambda$89(resources, theme);
                        break;
                    case 4:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.backgroundModStrong_delegate$lambda$8(resources, theme);
                        break;
                    case 5:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileSegmentedControlBackground_delegate$lambda$90(resources, theme);
                        break;
                    case 6:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchBorderDefault_delegate$lambda$110(resources, theme);
                        break;
                    case 7:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileSegmentedControlIndicatorBackground_delegate$lambda$91(resources, theme);
                        break;
                    case 8:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileTextHeadingPrimary_delegate$lambda$92(resources, theme);
                        break;
                    case 9:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileThreadEmbedBackground_delegate$lambda$93(resources, theme);
                        break;
                    case 10:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileUnreadbarTextDefault_delegate$lambda$94(resources, theme);
                        break;
                    case 11:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileVoicePanelBadgeBackground_delegate$lambda$95(resources, theme);
                        break;
                    case 12:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.progressbarIndicatorBackground_delegate$lambda$96(resources, theme);
                        break;
                    case 13:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.radioBorderDefault_delegate$lambda$97(resources, theme);
                        break;
                    case 14:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.reactionBackgroundDefault_delegate$lambda$98(resources, theme);
                        break;
                    case 15:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.reactionBackgroundReactedDefault_delegate$lambda$99(resources, theme);
                        break;
                    case 16:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.backgroundModSubtle_delegate$lambda$9(resources, theme);
                        break;
                    case 17:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchBorderSelectedDefault_delegate$lambda$111(resources, theme);
                        break;
                    case 18:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchThumbBackgroundDefault_delegate$lambda$112(resources, theme);
                        break;
                    case 19:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchThumbBackgroundSelectedDefault_delegate$lambda$113(resources, theme);
                        break;
                    case 20:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchThumbIconDefault_delegate$lambda$114(resources, theme);
                        break;
                    case 21:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tabBarBackground_delegate$lambda$115(resources, theme);
                        break;
                    case 22:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tabLabelTextDefault_delegate$lambda$116(resources, theme);
                        break;
                    case 23:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tabLabelTextFocused_delegate$lambda$117(resources, theme);
                        break;
                    case 24:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.reactionBorderDefault_delegate$lambda$100(resources, theme);
                        break;
                    case 25:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tablerowBackgroundDefault_delegate$lambda$118(resources, theme);
                        break;
                    case 26:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tablerowBackgroundPressed_delegate$lambda$119(resources, theme);
                        break;
                    case 27:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.backgroundScrimLightbox_delegate$lambda$11(resources, theme);
                        break;
                    case 28:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tablerowIconColorDefault_delegate$lambda$120(resources, theme);
                        break;
                    default:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.textBrand_delegate$lambda$121(resources, theme);
                        break;
                }
                return Integer.valueOf(iMobileGuildbarIconDefault_delegate$lambda$86);
            }
        });
        final int i79 = 28;
        this.tablerowIconColorDefault = l.b(new Function0() { // from class: f8.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iMobileGuildbarIconDefault_delegate$lambda$86;
                switch (i79) {
                    case 0:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileGuildbarIconDefault_delegate$lambda$86(resources, theme);
                        break;
                    case 1:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileHeaderIconDefault_delegate$lambda$87(resources, theme);
                        break;
                    case 2:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileKeyboardGapBackground_delegate$lambda$88(resources, theme);
                        break;
                    case 3:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileKeyboardPanelBackground_delegate$lambda$89(resources, theme);
                        break;
                    case 4:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.backgroundModStrong_delegate$lambda$8(resources, theme);
                        break;
                    case 5:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileSegmentedControlBackground_delegate$lambda$90(resources, theme);
                        break;
                    case 6:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchBorderDefault_delegate$lambda$110(resources, theme);
                        break;
                    case 7:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileSegmentedControlIndicatorBackground_delegate$lambda$91(resources, theme);
                        break;
                    case 8:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileTextHeadingPrimary_delegate$lambda$92(resources, theme);
                        break;
                    case 9:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileThreadEmbedBackground_delegate$lambda$93(resources, theme);
                        break;
                    case 10:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileUnreadbarTextDefault_delegate$lambda$94(resources, theme);
                        break;
                    case 11:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileVoicePanelBadgeBackground_delegate$lambda$95(resources, theme);
                        break;
                    case 12:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.progressbarIndicatorBackground_delegate$lambda$96(resources, theme);
                        break;
                    case 13:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.radioBorderDefault_delegate$lambda$97(resources, theme);
                        break;
                    case 14:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.reactionBackgroundDefault_delegate$lambda$98(resources, theme);
                        break;
                    case 15:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.reactionBackgroundReactedDefault_delegate$lambda$99(resources, theme);
                        break;
                    case 16:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.backgroundModSubtle_delegate$lambda$9(resources, theme);
                        break;
                    case 17:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchBorderSelectedDefault_delegate$lambda$111(resources, theme);
                        break;
                    case 18:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchThumbBackgroundDefault_delegate$lambda$112(resources, theme);
                        break;
                    case 19:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchThumbBackgroundSelectedDefault_delegate$lambda$113(resources, theme);
                        break;
                    case 20:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchThumbIconDefault_delegate$lambda$114(resources, theme);
                        break;
                    case 21:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tabBarBackground_delegate$lambda$115(resources, theme);
                        break;
                    case 22:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tabLabelTextDefault_delegate$lambda$116(resources, theme);
                        break;
                    case 23:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tabLabelTextFocused_delegate$lambda$117(resources, theme);
                        break;
                    case 24:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.reactionBorderDefault_delegate$lambda$100(resources, theme);
                        break;
                    case 25:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tablerowBackgroundDefault_delegate$lambda$118(resources, theme);
                        break;
                    case 26:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tablerowBackgroundPressed_delegate$lambda$119(resources, theme);
                        break;
                    case 27:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.backgroundScrimLightbox_delegate$lambda$11(resources, theme);
                        break;
                    case 28:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tablerowIconColorDefault_delegate$lambda$120(resources, theme);
                        break;
                    default:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.textBrand_delegate$lambda$121(resources, theme);
                        break;
                }
                return Integer.valueOf(iMobileGuildbarIconDefault_delegate$lambda$86);
            }
        });
        final int i80 = 29;
        this.textBrand = l.b(new Function0() { // from class: f8.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iMobileGuildbarIconDefault_delegate$lambda$86;
                switch (i80) {
                    case 0:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileGuildbarIconDefault_delegate$lambda$86(resources, theme);
                        break;
                    case 1:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileHeaderIconDefault_delegate$lambda$87(resources, theme);
                        break;
                    case 2:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileKeyboardGapBackground_delegate$lambda$88(resources, theme);
                        break;
                    case 3:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileKeyboardPanelBackground_delegate$lambda$89(resources, theme);
                        break;
                    case 4:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.backgroundModStrong_delegate$lambda$8(resources, theme);
                        break;
                    case 5:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileSegmentedControlBackground_delegate$lambda$90(resources, theme);
                        break;
                    case 6:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchBorderDefault_delegate$lambda$110(resources, theme);
                        break;
                    case 7:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileSegmentedControlIndicatorBackground_delegate$lambda$91(resources, theme);
                        break;
                    case 8:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileTextHeadingPrimary_delegate$lambda$92(resources, theme);
                        break;
                    case 9:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileThreadEmbedBackground_delegate$lambda$93(resources, theme);
                        break;
                    case 10:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileUnreadbarTextDefault_delegate$lambda$94(resources, theme);
                        break;
                    case 11:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.mobileVoicePanelBadgeBackground_delegate$lambda$95(resources, theme);
                        break;
                    case 12:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.progressbarIndicatorBackground_delegate$lambda$96(resources, theme);
                        break;
                    case 13:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.radioBorderDefault_delegate$lambda$97(resources, theme);
                        break;
                    case 14:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.reactionBackgroundDefault_delegate$lambda$98(resources, theme);
                        break;
                    case 15:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.reactionBackgroundReactedDefault_delegate$lambda$99(resources, theme);
                        break;
                    case 16:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.backgroundModSubtle_delegate$lambda$9(resources, theme);
                        break;
                    case 17:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchBorderSelectedDefault_delegate$lambda$111(resources, theme);
                        break;
                    case 18:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchThumbBackgroundDefault_delegate$lambda$112(resources, theme);
                        break;
                    case 19:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchThumbBackgroundSelectedDefault_delegate$lambda$113(resources, theme);
                        break;
                    case 20:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.switchThumbIconDefault_delegate$lambda$114(resources, theme);
                        break;
                    case 21:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tabBarBackground_delegate$lambda$115(resources, theme);
                        break;
                    case 22:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tabLabelTextDefault_delegate$lambda$116(resources, theme);
                        break;
                    case 23:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tabLabelTextFocused_delegate$lambda$117(resources, theme);
                        break;
                    case 24:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.reactionBorderDefault_delegate$lambda$100(resources, theme);
                        break;
                    case 25:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tablerowBackgroundDefault_delegate$lambda$118(resources, theme);
                        break;
                    case 26:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tablerowBackgroundPressed_delegate$lambda$119(resources, theme);
                        break;
                    case 27:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.backgroundScrimLightbox_delegate$lambda$11(resources, theme);
                        break;
                    case 28:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.tablerowIconColorDefault_delegate$lambda$120(resources, theme);
                        break;
                    default:
                        iMobileGuildbarIconDefault_delegate$lambda$86 = DarkThemeExperiment.textBrand_delegate$lambda$121(resources, theme);
                        break;
                }
                return Integer.valueOf(iMobileGuildbarIconDefault_delegate$lambda$86);
            }
        });
        final int i81 = 0;
        this.textDefault = l.b(new Function0() { // from class: f8.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iTextDefault_delegate$lambda$122;
                switch (i81) {
                    case 0:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textDefault_delegate$lambda$122(resources, theme);
                        break;
                    case 1:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackCritical_delegate$lambda$123(resources, theme);
                        break;
                    case 2:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackInfo_delegate$lambda$124(resources, theme);
                        break;
                    case 3:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackPositive_delegate$lambda$125(resources, theme);
                        break;
                    case 4:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackWarning_delegate$lambda$126(resources, theme);
                        break;
                    case 5:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.reactionBorderReactedDefault_delegate$lambda$101(resources, theme);
                        break;
                    case 6:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textMuted_delegate$lambda$127(resources, theme);
                        break;
                    case 7:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textStrong_delegate$lambda$128(resources, theme);
                        break;
                    case 8:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textSubtle_delegate$lambda$129(resources, theme);
                        break;
                    case 9:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.backgroundSurfaceHigh_delegate$lambda$12(resources, theme);
                        break;
                    case 10:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textVoiceConnected_delegate$lambda$130(resources, theme);
                        break;
                    case 11:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textVoiceDisconnected_delegate$lambda$131(resources, theme);
                        break;
                    case 12:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textVoiceSpeaking_delegate$lambda$132(resources, theme);
                        break;
                    case 13:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.userProfileAboutMeHeadingText_delegate$lambda$133(resources, theme);
                        break;
                    case 14:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.userProfileContainerBackground_delegate$lambda$134(resources, theme);
                        break;
                    case 15:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.userProfileGradientBackground_delegate$lambda$135(resources, theme);
                        break;
                    case 16:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.reactionTextReactedDefault_delegate$lambda$102(resources, theme);
                        break;
                    case 17:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitAccentBackground_delegate$lambda$136(resources, theme);
                        break;
                    case 18:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitBackground_delegate$lambda$137(resources, theme);
                        break;
                    case 19:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitIcon_delegate$lambda$138(resources, theme);
                        break;
                    case 20:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitText_delegate$lambda$139(resources, theme);
                        break;
                    case 21:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.backgroundSurfaceHighest_delegate$lambda$13(resources, theme);
                        break;
                    case 22:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.backgroundVoiceMuted_delegate$lambda$14(resources, theme);
                        break;
                    case 23:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.badgeNotificationBackground_delegate$lambda$15(resources, theme);
                        break;
                    case 24:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.borderStrong_delegate$lambda$16(resources, theme);
                        break;
                    case 25:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.borderSubtle_delegate$lambda$17(resources, theme);
                        break;
                    case 26:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.cardBackgroundDefault_delegate$lambda$18(resources, theme);
                        break;
                    case 27:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.redesignButtonTertiaryBackground_delegate$lambda$103(resources, theme);
                        break;
                    case 28:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.cardSecondaryBackgroundActive_delegate$lambda$19(resources, theme);
                        break;
                    default:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.appFrameBorder_delegate$lambda$1(resources, theme);
                        break;
                }
                return Integer.valueOf(iTextDefault_delegate$lambda$122);
            }
        });
        final int i82 = 1;
        this.textFeedbackCritical = l.b(new Function0() { // from class: f8.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iTextDefault_delegate$lambda$122;
                switch (i82) {
                    case 0:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textDefault_delegate$lambda$122(resources, theme);
                        break;
                    case 1:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackCritical_delegate$lambda$123(resources, theme);
                        break;
                    case 2:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackInfo_delegate$lambda$124(resources, theme);
                        break;
                    case 3:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackPositive_delegate$lambda$125(resources, theme);
                        break;
                    case 4:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackWarning_delegate$lambda$126(resources, theme);
                        break;
                    case 5:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.reactionBorderReactedDefault_delegate$lambda$101(resources, theme);
                        break;
                    case 6:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textMuted_delegate$lambda$127(resources, theme);
                        break;
                    case 7:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textStrong_delegate$lambda$128(resources, theme);
                        break;
                    case 8:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textSubtle_delegate$lambda$129(resources, theme);
                        break;
                    case 9:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.backgroundSurfaceHigh_delegate$lambda$12(resources, theme);
                        break;
                    case 10:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textVoiceConnected_delegate$lambda$130(resources, theme);
                        break;
                    case 11:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textVoiceDisconnected_delegate$lambda$131(resources, theme);
                        break;
                    case 12:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textVoiceSpeaking_delegate$lambda$132(resources, theme);
                        break;
                    case 13:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.userProfileAboutMeHeadingText_delegate$lambda$133(resources, theme);
                        break;
                    case 14:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.userProfileContainerBackground_delegate$lambda$134(resources, theme);
                        break;
                    case 15:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.userProfileGradientBackground_delegate$lambda$135(resources, theme);
                        break;
                    case 16:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.reactionTextReactedDefault_delegate$lambda$102(resources, theme);
                        break;
                    case 17:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitAccentBackground_delegate$lambda$136(resources, theme);
                        break;
                    case 18:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitBackground_delegate$lambda$137(resources, theme);
                        break;
                    case 19:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitIcon_delegate$lambda$138(resources, theme);
                        break;
                    case 20:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitText_delegate$lambda$139(resources, theme);
                        break;
                    case 21:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.backgroundSurfaceHighest_delegate$lambda$13(resources, theme);
                        break;
                    case 22:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.backgroundVoiceMuted_delegate$lambda$14(resources, theme);
                        break;
                    case 23:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.badgeNotificationBackground_delegate$lambda$15(resources, theme);
                        break;
                    case 24:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.borderStrong_delegate$lambda$16(resources, theme);
                        break;
                    case 25:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.borderSubtle_delegate$lambda$17(resources, theme);
                        break;
                    case 26:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.cardBackgroundDefault_delegate$lambda$18(resources, theme);
                        break;
                    case 27:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.redesignButtonTertiaryBackground_delegate$lambda$103(resources, theme);
                        break;
                    case 28:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.cardSecondaryBackgroundActive_delegate$lambda$19(resources, theme);
                        break;
                    default:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.appFrameBorder_delegate$lambda$1(resources, theme);
                        break;
                }
                return Integer.valueOf(iTextDefault_delegate$lambda$122);
            }
        });
        final int i83 = 2;
        this.textFeedbackInfo = l.b(new Function0() { // from class: f8.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iTextDefault_delegate$lambda$122;
                switch (i83) {
                    case 0:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textDefault_delegate$lambda$122(resources, theme);
                        break;
                    case 1:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackCritical_delegate$lambda$123(resources, theme);
                        break;
                    case 2:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackInfo_delegate$lambda$124(resources, theme);
                        break;
                    case 3:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackPositive_delegate$lambda$125(resources, theme);
                        break;
                    case 4:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackWarning_delegate$lambda$126(resources, theme);
                        break;
                    case 5:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.reactionBorderReactedDefault_delegate$lambda$101(resources, theme);
                        break;
                    case 6:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textMuted_delegate$lambda$127(resources, theme);
                        break;
                    case 7:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textStrong_delegate$lambda$128(resources, theme);
                        break;
                    case 8:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textSubtle_delegate$lambda$129(resources, theme);
                        break;
                    case 9:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.backgroundSurfaceHigh_delegate$lambda$12(resources, theme);
                        break;
                    case 10:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textVoiceConnected_delegate$lambda$130(resources, theme);
                        break;
                    case 11:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textVoiceDisconnected_delegate$lambda$131(resources, theme);
                        break;
                    case 12:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textVoiceSpeaking_delegate$lambda$132(resources, theme);
                        break;
                    case 13:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.userProfileAboutMeHeadingText_delegate$lambda$133(resources, theme);
                        break;
                    case 14:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.userProfileContainerBackground_delegate$lambda$134(resources, theme);
                        break;
                    case 15:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.userProfileGradientBackground_delegate$lambda$135(resources, theme);
                        break;
                    case 16:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.reactionTextReactedDefault_delegate$lambda$102(resources, theme);
                        break;
                    case 17:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitAccentBackground_delegate$lambda$136(resources, theme);
                        break;
                    case 18:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitBackground_delegate$lambda$137(resources, theme);
                        break;
                    case 19:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitIcon_delegate$lambda$138(resources, theme);
                        break;
                    case 20:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitText_delegate$lambda$139(resources, theme);
                        break;
                    case 21:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.backgroundSurfaceHighest_delegate$lambda$13(resources, theme);
                        break;
                    case 22:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.backgroundVoiceMuted_delegate$lambda$14(resources, theme);
                        break;
                    case 23:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.badgeNotificationBackground_delegate$lambda$15(resources, theme);
                        break;
                    case 24:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.borderStrong_delegate$lambda$16(resources, theme);
                        break;
                    case 25:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.borderSubtle_delegate$lambda$17(resources, theme);
                        break;
                    case 26:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.cardBackgroundDefault_delegate$lambda$18(resources, theme);
                        break;
                    case 27:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.redesignButtonTertiaryBackground_delegate$lambda$103(resources, theme);
                        break;
                    case 28:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.cardSecondaryBackgroundActive_delegate$lambda$19(resources, theme);
                        break;
                    default:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.appFrameBorder_delegate$lambda$1(resources, theme);
                        break;
                }
                return Integer.valueOf(iTextDefault_delegate$lambda$122);
            }
        });
        final int i84 = 3;
        this.textFeedbackPositive = l.b(new Function0() { // from class: f8.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iTextDefault_delegate$lambda$122;
                switch (i84) {
                    case 0:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textDefault_delegate$lambda$122(resources, theme);
                        break;
                    case 1:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackCritical_delegate$lambda$123(resources, theme);
                        break;
                    case 2:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackInfo_delegate$lambda$124(resources, theme);
                        break;
                    case 3:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackPositive_delegate$lambda$125(resources, theme);
                        break;
                    case 4:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackWarning_delegate$lambda$126(resources, theme);
                        break;
                    case 5:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.reactionBorderReactedDefault_delegate$lambda$101(resources, theme);
                        break;
                    case 6:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textMuted_delegate$lambda$127(resources, theme);
                        break;
                    case 7:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textStrong_delegate$lambda$128(resources, theme);
                        break;
                    case 8:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textSubtle_delegate$lambda$129(resources, theme);
                        break;
                    case 9:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.backgroundSurfaceHigh_delegate$lambda$12(resources, theme);
                        break;
                    case 10:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textVoiceConnected_delegate$lambda$130(resources, theme);
                        break;
                    case 11:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textVoiceDisconnected_delegate$lambda$131(resources, theme);
                        break;
                    case 12:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textVoiceSpeaking_delegate$lambda$132(resources, theme);
                        break;
                    case 13:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.userProfileAboutMeHeadingText_delegate$lambda$133(resources, theme);
                        break;
                    case 14:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.userProfileContainerBackground_delegate$lambda$134(resources, theme);
                        break;
                    case 15:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.userProfileGradientBackground_delegate$lambda$135(resources, theme);
                        break;
                    case 16:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.reactionTextReactedDefault_delegate$lambda$102(resources, theme);
                        break;
                    case 17:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitAccentBackground_delegate$lambda$136(resources, theme);
                        break;
                    case 18:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitBackground_delegate$lambda$137(resources, theme);
                        break;
                    case 19:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitIcon_delegate$lambda$138(resources, theme);
                        break;
                    case 20:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitText_delegate$lambda$139(resources, theme);
                        break;
                    case 21:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.backgroundSurfaceHighest_delegate$lambda$13(resources, theme);
                        break;
                    case 22:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.backgroundVoiceMuted_delegate$lambda$14(resources, theme);
                        break;
                    case 23:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.badgeNotificationBackground_delegate$lambda$15(resources, theme);
                        break;
                    case 24:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.borderStrong_delegate$lambda$16(resources, theme);
                        break;
                    case 25:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.borderSubtle_delegate$lambda$17(resources, theme);
                        break;
                    case 26:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.cardBackgroundDefault_delegate$lambda$18(resources, theme);
                        break;
                    case 27:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.redesignButtonTertiaryBackground_delegate$lambda$103(resources, theme);
                        break;
                    case 28:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.cardSecondaryBackgroundActive_delegate$lambda$19(resources, theme);
                        break;
                    default:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.appFrameBorder_delegate$lambda$1(resources, theme);
                        break;
                }
                return Integer.valueOf(iTextDefault_delegate$lambda$122);
            }
        });
        final int i85 = 4;
        this.textFeedbackWarning = l.b(new Function0() { // from class: f8.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iTextDefault_delegate$lambda$122;
                switch (i85) {
                    case 0:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textDefault_delegate$lambda$122(resources, theme);
                        break;
                    case 1:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackCritical_delegate$lambda$123(resources, theme);
                        break;
                    case 2:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackInfo_delegate$lambda$124(resources, theme);
                        break;
                    case 3:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackPositive_delegate$lambda$125(resources, theme);
                        break;
                    case 4:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackWarning_delegate$lambda$126(resources, theme);
                        break;
                    case 5:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.reactionBorderReactedDefault_delegate$lambda$101(resources, theme);
                        break;
                    case 6:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textMuted_delegate$lambda$127(resources, theme);
                        break;
                    case 7:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textStrong_delegate$lambda$128(resources, theme);
                        break;
                    case 8:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textSubtle_delegate$lambda$129(resources, theme);
                        break;
                    case 9:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.backgroundSurfaceHigh_delegate$lambda$12(resources, theme);
                        break;
                    case 10:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textVoiceConnected_delegate$lambda$130(resources, theme);
                        break;
                    case 11:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textVoiceDisconnected_delegate$lambda$131(resources, theme);
                        break;
                    case 12:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textVoiceSpeaking_delegate$lambda$132(resources, theme);
                        break;
                    case 13:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.userProfileAboutMeHeadingText_delegate$lambda$133(resources, theme);
                        break;
                    case 14:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.userProfileContainerBackground_delegate$lambda$134(resources, theme);
                        break;
                    case 15:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.userProfileGradientBackground_delegate$lambda$135(resources, theme);
                        break;
                    case 16:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.reactionTextReactedDefault_delegate$lambda$102(resources, theme);
                        break;
                    case 17:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitAccentBackground_delegate$lambda$136(resources, theme);
                        break;
                    case 18:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitBackground_delegate$lambda$137(resources, theme);
                        break;
                    case 19:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitIcon_delegate$lambda$138(resources, theme);
                        break;
                    case 20:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitText_delegate$lambda$139(resources, theme);
                        break;
                    case 21:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.backgroundSurfaceHighest_delegate$lambda$13(resources, theme);
                        break;
                    case 22:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.backgroundVoiceMuted_delegate$lambda$14(resources, theme);
                        break;
                    case 23:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.badgeNotificationBackground_delegate$lambda$15(resources, theme);
                        break;
                    case 24:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.borderStrong_delegate$lambda$16(resources, theme);
                        break;
                    case 25:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.borderSubtle_delegate$lambda$17(resources, theme);
                        break;
                    case 26:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.cardBackgroundDefault_delegate$lambda$18(resources, theme);
                        break;
                    case 27:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.redesignButtonTertiaryBackground_delegate$lambda$103(resources, theme);
                        break;
                    case 28:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.cardSecondaryBackgroundActive_delegate$lambda$19(resources, theme);
                        break;
                    default:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.appFrameBorder_delegate$lambda$1(resources, theme);
                        break;
                }
                return Integer.valueOf(iTextDefault_delegate$lambda$122);
            }
        });
        final int i86 = 6;
        this.textMuted = l.b(new Function0() { // from class: f8.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iTextDefault_delegate$lambda$122;
                switch (i86) {
                    case 0:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textDefault_delegate$lambda$122(resources, theme);
                        break;
                    case 1:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackCritical_delegate$lambda$123(resources, theme);
                        break;
                    case 2:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackInfo_delegate$lambda$124(resources, theme);
                        break;
                    case 3:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackPositive_delegate$lambda$125(resources, theme);
                        break;
                    case 4:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackWarning_delegate$lambda$126(resources, theme);
                        break;
                    case 5:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.reactionBorderReactedDefault_delegate$lambda$101(resources, theme);
                        break;
                    case 6:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textMuted_delegate$lambda$127(resources, theme);
                        break;
                    case 7:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textStrong_delegate$lambda$128(resources, theme);
                        break;
                    case 8:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textSubtle_delegate$lambda$129(resources, theme);
                        break;
                    case 9:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.backgroundSurfaceHigh_delegate$lambda$12(resources, theme);
                        break;
                    case 10:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textVoiceConnected_delegate$lambda$130(resources, theme);
                        break;
                    case 11:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textVoiceDisconnected_delegate$lambda$131(resources, theme);
                        break;
                    case 12:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textVoiceSpeaking_delegate$lambda$132(resources, theme);
                        break;
                    case 13:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.userProfileAboutMeHeadingText_delegate$lambda$133(resources, theme);
                        break;
                    case 14:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.userProfileContainerBackground_delegate$lambda$134(resources, theme);
                        break;
                    case 15:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.userProfileGradientBackground_delegate$lambda$135(resources, theme);
                        break;
                    case 16:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.reactionTextReactedDefault_delegate$lambda$102(resources, theme);
                        break;
                    case 17:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitAccentBackground_delegate$lambda$136(resources, theme);
                        break;
                    case 18:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitBackground_delegate$lambda$137(resources, theme);
                        break;
                    case 19:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitIcon_delegate$lambda$138(resources, theme);
                        break;
                    case 20:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitText_delegate$lambda$139(resources, theme);
                        break;
                    case 21:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.backgroundSurfaceHighest_delegate$lambda$13(resources, theme);
                        break;
                    case 22:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.backgroundVoiceMuted_delegate$lambda$14(resources, theme);
                        break;
                    case 23:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.badgeNotificationBackground_delegate$lambda$15(resources, theme);
                        break;
                    case 24:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.borderStrong_delegate$lambda$16(resources, theme);
                        break;
                    case 25:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.borderSubtle_delegate$lambda$17(resources, theme);
                        break;
                    case 26:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.cardBackgroundDefault_delegate$lambda$18(resources, theme);
                        break;
                    case 27:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.redesignButtonTertiaryBackground_delegate$lambda$103(resources, theme);
                        break;
                    case 28:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.cardSecondaryBackgroundActive_delegate$lambda$19(resources, theme);
                        break;
                    default:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.appFrameBorder_delegate$lambda$1(resources, theme);
                        break;
                }
                return Integer.valueOf(iTextDefault_delegate$lambda$122);
            }
        });
        final int i87 = 7;
        this.textStrong = l.b(new Function0() { // from class: f8.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iTextDefault_delegate$lambda$122;
                switch (i87) {
                    case 0:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textDefault_delegate$lambda$122(resources, theme);
                        break;
                    case 1:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackCritical_delegate$lambda$123(resources, theme);
                        break;
                    case 2:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackInfo_delegate$lambda$124(resources, theme);
                        break;
                    case 3:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackPositive_delegate$lambda$125(resources, theme);
                        break;
                    case 4:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackWarning_delegate$lambda$126(resources, theme);
                        break;
                    case 5:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.reactionBorderReactedDefault_delegate$lambda$101(resources, theme);
                        break;
                    case 6:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textMuted_delegate$lambda$127(resources, theme);
                        break;
                    case 7:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textStrong_delegate$lambda$128(resources, theme);
                        break;
                    case 8:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textSubtle_delegate$lambda$129(resources, theme);
                        break;
                    case 9:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.backgroundSurfaceHigh_delegate$lambda$12(resources, theme);
                        break;
                    case 10:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textVoiceConnected_delegate$lambda$130(resources, theme);
                        break;
                    case 11:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textVoiceDisconnected_delegate$lambda$131(resources, theme);
                        break;
                    case 12:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textVoiceSpeaking_delegate$lambda$132(resources, theme);
                        break;
                    case 13:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.userProfileAboutMeHeadingText_delegate$lambda$133(resources, theme);
                        break;
                    case 14:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.userProfileContainerBackground_delegate$lambda$134(resources, theme);
                        break;
                    case 15:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.userProfileGradientBackground_delegate$lambda$135(resources, theme);
                        break;
                    case 16:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.reactionTextReactedDefault_delegate$lambda$102(resources, theme);
                        break;
                    case 17:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitAccentBackground_delegate$lambda$136(resources, theme);
                        break;
                    case 18:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitBackground_delegate$lambda$137(resources, theme);
                        break;
                    case 19:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitIcon_delegate$lambda$138(resources, theme);
                        break;
                    case 20:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitText_delegate$lambda$139(resources, theme);
                        break;
                    case 21:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.backgroundSurfaceHighest_delegate$lambda$13(resources, theme);
                        break;
                    case 22:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.backgroundVoiceMuted_delegate$lambda$14(resources, theme);
                        break;
                    case 23:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.badgeNotificationBackground_delegate$lambda$15(resources, theme);
                        break;
                    case 24:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.borderStrong_delegate$lambda$16(resources, theme);
                        break;
                    case 25:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.borderSubtle_delegate$lambda$17(resources, theme);
                        break;
                    case 26:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.cardBackgroundDefault_delegate$lambda$18(resources, theme);
                        break;
                    case 27:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.redesignButtonTertiaryBackground_delegate$lambda$103(resources, theme);
                        break;
                    case 28:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.cardSecondaryBackgroundActive_delegate$lambda$19(resources, theme);
                        break;
                    default:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.appFrameBorder_delegate$lambda$1(resources, theme);
                        break;
                }
                return Integer.valueOf(iTextDefault_delegate$lambda$122);
            }
        });
        final int i88 = 8;
        this.textSubtle = l.b(new Function0() { // from class: f8.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iTextDefault_delegate$lambda$122;
                switch (i88) {
                    case 0:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textDefault_delegate$lambda$122(resources, theme);
                        break;
                    case 1:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackCritical_delegate$lambda$123(resources, theme);
                        break;
                    case 2:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackInfo_delegate$lambda$124(resources, theme);
                        break;
                    case 3:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackPositive_delegate$lambda$125(resources, theme);
                        break;
                    case 4:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackWarning_delegate$lambda$126(resources, theme);
                        break;
                    case 5:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.reactionBorderReactedDefault_delegate$lambda$101(resources, theme);
                        break;
                    case 6:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textMuted_delegate$lambda$127(resources, theme);
                        break;
                    case 7:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textStrong_delegate$lambda$128(resources, theme);
                        break;
                    case 8:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textSubtle_delegate$lambda$129(resources, theme);
                        break;
                    case 9:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.backgroundSurfaceHigh_delegate$lambda$12(resources, theme);
                        break;
                    case 10:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textVoiceConnected_delegate$lambda$130(resources, theme);
                        break;
                    case 11:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textVoiceDisconnected_delegate$lambda$131(resources, theme);
                        break;
                    case 12:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textVoiceSpeaking_delegate$lambda$132(resources, theme);
                        break;
                    case 13:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.userProfileAboutMeHeadingText_delegate$lambda$133(resources, theme);
                        break;
                    case 14:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.userProfileContainerBackground_delegate$lambda$134(resources, theme);
                        break;
                    case 15:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.userProfileGradientBackground_delegate$lambda$135(resources, theme);
                        break;
                    case 16:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.reactionTextReactedDefault_delegate$lambda$102(resources, theme);
                        break;
                    case 17:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitAccentBackground_delegate$lambda$136(resources, theme);
                        break;
                    case 18:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitBackground_delegate$lambda$137(resources, theme);
                        break;
                    case 19:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitIcon_delegate$lambda$138(resources, theme);
                        break;
                    case 20:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitText_delegate$lambda$139(resources, theme);
                        break;
                    case 21:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.backgroundSurfaceHighest_delegate$lambda$13(resources, theme);
                        break;
                    case 22:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.backgroundVoiceMuted_delegate$lambda$14(resources, theme);
                        break;
                    case 23:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.badgeNotificationBackground_delegate$lambda$15(resources, theme);
                        break;
                    case 24:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.borderStrong_delegate$lambda$16(resources, theme);
                        break;
                    case 25:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.borderSubtle_delegate$lambda$17(resources, theme);
                        break;
                    case 26:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.cardBackgroundDefault_delegate$lambda$18(resources, theme);
                        break;
                    case 27:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.redesignButtonTertiaryBackground_delegate$lambda$103(resources, theme);
                        break;
                    case 28:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.cardSecondaryBackgroundActive_delegate$lambda$19(resources, theme);
                        break;
                    default:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.appFrameBorder_delegate$lambda$1(resources, theme);
                        break;
                }
                return Integer.valueOf(iTextDefault_delegate$lambda$122);
            }
        });
        final int i89 = 10;
        this.textVoiceConnected = l.b(new Function0() { // from class: f8.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iTextDefault_delegate$lambda$122;
                switch (i89) {
                    case 0:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textDefault_delegate$lambda$122(resources, theme);
                        break;
                    case 1:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackCritical_delegate$lambda$123(resources, theme);
                        break;
                    case 2:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackInfo_delegate$lambda$124(resources, theme);
                        break;
                    case 3:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackPositive_delegate$lambda$125(resources, theme);
                        break;
                    case 4:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackWarning_delegate$lambda$126(resources, theme);
                        break;
                    case 5:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.reactionBorderReactedDefault_delegate$lambda$101(resources, theme);
                        break;
                    case 6:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textMuted_delegate$lambda$127(resources, theme);
                        break;
                    case 7:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textStrong_delegate$lambda$128(resources, theme);
                        break;
                    case 8:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textSubtle_delegate$lambda$129(resources, theme);
                        break;
                    case 9:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.backgroundSurfaceHigh_delegate$lambda$12(resources, theme);
                        break;
                    case 10:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textVoiceConnected_delegate$lambda$130(resources, theme);
                        break;
                    case 11:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textVoiceDisconnected_delegate$lambda$131(resources, theme);
                        break;
                    case 12:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textVoiceSpeaking_delegate$lambda$132(resources, theme);
                        break;
                    case 13:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.userProfileAboutMeHeadingText_delegate$lambda$133(resources, theme);
                        break;
                    case 14:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.userProfileContainerBackground_delegate$lambda$134(resources, theme);
                        break;
                    case 15:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.userProfileGradientBackground_delegate$lambda$135(resources, theme);
                        break;
                    case 16:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.reactionTextReactedDefault_delegate$lambda$102(resources, theme);
                        break;
                    case 17:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitAccentBackground_delegate$lambda$136(resources, theme);
                        break;
                    case 18:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitBackground_delegate$lambda$137(resources, theme);
                        break;
                    case 19:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitIcon_delegate$lambda$138(resources, theme);
                        break;
                    case 20:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitText_delegate$lambda$139(resources, theme);
                        break;
                    case 21:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.backgroundSurfaceHighest_delegate$lambda$13(resources, theme);
                        break;
                    case 22:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.backgroundVoiceMuted_delegate$lambda$14(resources, theme);
                        break;
                    case 23:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.badgeNotificationBackground_delegate$lambda$15(resources, theme);
                        break;
                    case 24:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.borderStrong_delegate$lambda$16(resources, theme);
                        break;
                    case 25:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.borderSubtle_delegate$lambda$17(resources, theme);
                        break;
                    case 26:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.cardBackgroundDefault_delegate$lambda$18(resources, theme);
                        break;
                    case 27:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.redesignButtonTertiaryBackground_delegate$lambda$103(resources, theme);
                        break;
                    case 28:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.cardSecondaryBackgroundActive_delegate$lambda$19(resources, theme);
                        break;
                    default:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.appFrameBorder_delegate$lambda$1(resources, theme);
                        break;
                }
                return Integer.valueOf(iTextDefault_delegate$lambda$122);
            }
        });
        final int i90 = 11;
        this.textVoiceDisconnected = l.b(new Function0() { // from class: f8.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iTextDefault_delegate$lambda$122;
                switch (i90) {
                    case 0:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textDefault_delegate$lambda$122(resources, theme);
                        break;
                    case 1:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackCritical_delegate$lambda$123(resources, theme);
                        break;
                    case 2:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackInfo_delegate$lambda$124(resources, theme);
                        break;
                    case 3:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackPositive_delegate$lambda$125(resources, theme);
                        break;
                    case 4:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackWarning_delegate$lambda$126(resources, theme);
                        break;
                    case 5:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.reactionBorderReactedDefault_delegate$lambda$101(resources, theme);
                        break;
                    case 6:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textMuted_delegate$lambda$127(resources, theme);
                        break;
                    case 7:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textStrong_delegate$lambda$128(resources, theme);
                        break;
                    case 8:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textSubtle_delegate$lambda$129(resources, theme);
                        break;
                    case 9:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.backgroundSurfaceHigh_delegate$lambda$12(resources, theme);
                        break;
                    case 10:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textVoiceConnected_delegate$lambda$130(resources, theme);
                        break;
                    case 11:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textVoiceDisconnected_delegate$lambda$131(resources, theme);
                        break;
                    case 12:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textVoiceSpeaking_delegate$lambda$132(resources, theme);
                        break;
                    case 13:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.userProfileAboutMeHeadingText_delegate$lambda$133(resources, theme);
                        break;
                    case 14:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.userProfileContainerBackground_delegate$lambda$134(resources, theme);
                        break;
                    case 15:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.userProfileGradientBackground_delegate$lambda$135(resources, theme);
                        break;
                    case 16:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.reactionTextReactedDefault_delegate$lambda$102(resources, theme);
                        break;
                    case 17:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitAccentBackground_delegate$lambda$136(resources, theme);
                        break;
                    case 18:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitBackground_delegate$lambda$137(resources, theme);
                        break;
                    case 19:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitIcon_delegate$lambda$138(resources, theme);
                        break;
                    case 20:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitText_delegate$lambda$139(resources, theme);
                        break;
                    case 21:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.backgroundSurfaceHighest_delegate$lambda$13(resources, theme);
                        break;
                    case 22:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.backgroundVoiceMuted_delegate$lambda$14(resources, theme);
                        break;
                    case 23:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.badgeNotificationBackground_delegate$lambda$15(resources, theme);
                        break;
                    case 24:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.borderStrong_delegate$lambda$16(resources, theme);
                        break;
                    case 25:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.borderSubtle_delegate$lambda$17(resources, theme);
                        break;
                    case 26:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.cardBackgroundDefault_delegate$lambda$18(resources, theme);
                        break;
                    case 27:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.redesignButtonTertiaryBackground_delegate$lambda$103(resources, theme);
                        break;
                    case 28:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.cardSecondaryBackgroundActive_delegate$lambda$19(resources, theme);
                        break;
                    default:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.appFrameBorder_delegate$lambda$1(resources, theme);
                        break;
                }
                return Integer.valueOf(iTextDefault_delegate$lambda$122);
            }
        });
        final int i91 = 12;
        this.textVoiceSpeaking = l.b(new Function0() { // from class: f8.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iTextDefault_delegate$lambda$122;
                switch (i91) {
                    case 0:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textDefault_delegate$lambda$122(resources, theme);
                        break;
                    case 1:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackCritical_delegate$lambda$123(resources, theme);
                        break;
                    case 2:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackInfo_delegate$lambda$124(resources, theme);
                        break;
                    case 3:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackPositive_delegate$lambda$125(resources, theme);
                        break;
                    case 4:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackWarning_delegate$lambda$126(resources, theme);
                        break;
                    case 5:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.reactionBorderReactedDefault_delegate$lambda$101(resources, theme);
                        break;
                    case 6:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textMuted_delegate$lambda$127(resources, theme);
                        break;
                    case 7:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textStrong_delegate$lambda$128(resources, theme);
                        break;
                    case 8:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textSubtle_delegate$lambda$129(resources, theme);
                        break;
                    case 9:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.backgroundSurfaceHigh_delegate$lambda$12(resources, theme);
                        break;
                    case 10:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textVoiceConnected_delegate$lambda$130(resources, theme);
                        break;
                    case 11:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textVoiceDisconnected_delegate$lambda$131(resources, theme);
                        break;
                    case 12:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textVoiceSpeaking_delegate$lambda$132(resources, theme);
                        break;
                    case 13:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.userProfileAboutMeHeadingText_delegate$lambda$133(resources, theme);
                        break;
                    case 14:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.userProfileContainerBackground_delegate$lambda$134(resources, theme);
                        break;
                    case 15:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.userProfileGradientBackground_delegate$lambda$135(resources, theme);
                        break;
                    case 16:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.reactionTextReactedDefault_delegate$lambda$102(resources, theme);
                        break;
                    case 17:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitAccentBackground_delegate$lambda$136(resources, theme);
                        break;
                    case 18:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitBackground_delegate$lambda$137(resources, theme);
                        break;
                    case 19:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitIcon_delegate$lambda$138(resources, theme);
                        break;
                    case 20:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitText_delegate$lambda$139(resources, theme);
                        break;
                    case 21:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.backgroundSurfaceHighest_delegate$lambda$13(resources, theme);
                        break;
                    case 22:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.backgroundVoiceMuted_delegate$lambda$14(resources, theme);
                        break;
                    case 23:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.badgeNotificationBackground_delegate$lambda$15(resources, theme);
                        break;
                    case 24:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.borderStrong_delegate$lambda$16(resources, theme);
                        break;
                    case 25:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.borderSubtle_delegate$lambda$17(resources, theme);
                        break;
                    case 26:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.cardBackgroundDefault_delegate$lambda$18(resources, theme);
                        break;
                    case 27:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.redesignButtonTertiaryBackground_delegate$lambda$103(resources, theme);
                        break;
                    case 28:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.cardSecondaryBackgroundActive_delegate$lambda$19(resources, theme);
                        break;
                    default:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.appFrameBorder_delegate$lambda$1(resources, theme);
                        break;
                }
                return Integer.valueOf(iTextDefault_delegate$lambda$122);
            }
        });
        final int i92 = 13;
        this.userProfileAboutMeHeadingText = l.b(new Function0() { // from class: f8.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iTextDefault_delegate$lambda$122;
                switch (i92) {
                    case 0:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textDefault_delegate$lambda$122(resources, theme);
                        break;
                    case 1:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackCritical_delegate$lambda$123(resources, theme);
                        break;
                    case 2:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackInfo_delegate$lambda$124(resources, theme);
                        break;
                    case 3:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackPositive_delegate$lambda$125(resources, theme);
                        break;
                    case 4:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackWarning_delegate$lambda$126(resources, theme);
                        break;
                    case 5:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.reactionBorderReactedDefault_delegate$lambda$101(resources, theme);
                        break;
                    case 6:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textMuted_delegate$lambda$127(resources, theme);
                        break;
                    case 7:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textStrong_delegate$lambda$128(resources, theme);
                        break;
                    case 8:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textSubtle_delegate$lambda$129(resources, theme);
                        break;
                    case 9:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.backgroundSurfaceHigh_delegate$lambda$12(resources, theme);
                        break;
                    case 10:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textVoiceConnected_delegate$lambda$130(resources, theme);
                        break;
                    case 11:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textVoiceDisconnected_delegate$lambda$131(resources, theme);
                        break;
                    case 12:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textVoiceSpeaking_delegate$lambda$132(resources, theme);
                        break;
                    case 13:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.userProfileAboutMeHeadingText_delegate$lambda$133(resources, theme);
                        break;
                    case 14:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.userProfileContainerBackground_delegate$lambda$134(resources, theme);
                        break;
                    case 15:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.userProfileGradientBackground_delegate$lambda$135(resources, theme);
                        break;
                    case 16:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.reactionTextReactedDefault_delegate$lambda$102(resources, theme);
                        break;
                    case 17:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitAccentBackground_delegate$lambda$136(resources, theme);
                        break;
                    case 18:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitBackground_delegate$lambda$137(resources, theme);
                        break;
                    case 19:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitIcon_delegate$lambda$138(resources, theme);
                        break;
                    case 20:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitText_delegate$lambda$139(resources, theme);
                        break;
                    case 21:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.backgroundSurfaceHighest_delegate$lambda$13(resources, theme);
                        break;
                    case 22:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.backgroundVoiceMuted_delegate$lambda$14(resources, theme);
                        break;
                    case 23:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.badgeNotificationBackground_delegate$lambda$15(resources, theme);
                        break;
                    case 24:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.borderStrong_delegate$lambda$16(resources, theme);
                        break;
                    case 25:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.borderSubtle_delegate$lambda$17(resources, theme);
                        break;
                    case 26:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.cardBackgroundDefault_delegate$lambda$18(resources, theme);
                        break;
                    case 27:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.redesignButtonTertiaryBackground_delegate$lambda$103(resources, theme);
                        break;
                    case 28:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.cardSecondaryBackgroundActive_delegate$lambda$19(resources, theme);
                        break;
                    default:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.appFrameBorder_delegate$lambda$1(resources, theme);
                        break;
                }
                return Integer.valueOf(iTextDefault_delegate$lambda$122);
            }
        });
        final int i93 = 14;
        this.userProfileContainerBackground = l.b(new Function0() { // from class: f8.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iTextDefault_delegate$lambda$122;
                switch (i93) {
                    case 0:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textDefault_delegate$lambda$122(resources, theme);
                        break;
                    case 1:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackCritical_delegate$lambda$123(resources, theme);
                        break;
                    case 2:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackInfo_delegate$lambda$124(resources, theme);
                        break;
                    case 3:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackPositive_delegate$lambda$125(resources, theme);
                        break;
                    case 4:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackWarning_delegate$lambda$126(resources, theme);
                        break;
                    case 5:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.reactionBorderReactedDefault_delegate$lambda$101(resources, theme);
                        break;
                    case 6:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textMuted_delegate$lambda$127(resources, theme);
                        break;
                    case 7:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textStrong_delegate$lambda$128(resources, theme);
                        break;
                    case 8:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textSubtle_delegate$lambda$129(resources, theme);
                        break;
                    case 9:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.backgroundSurfaceHigh_delegate$lambda$12(resources, theme);
                        break;
                    case 10:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textVoiceConnected_delegate$lambda$130(resources, theme);
                        break;
                    case 11:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textVoiceDisconnected_delegate$lambda$131(resources, theme);
                        break;
                    case 12:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textVoiceSpeaking_delegate$lambda$132(resources, theme);
                        break;
                    case 13:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.userProfileAboutMeHeadingText_delegate$lambda$133(resources, theme);
                        break;
                    case 14:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.userProfileContainerBackground_delegate$lambda$134(resources, theme);
                        break;
                    case 15:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.userProfileGradientBackground_delegate$lambda$135(resources, theme);
                        break;
                    case 16:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.reactionTextReactedDefault_delegate$lambda$102(resources, theme);
                        break;
                    case 17:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitAccentBackground_delegate$lambda$136(resources, theme);
                        break;
                    case 18:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitBackground_delegate$lambda$137(resources, theme);
                        break;
                    case 19:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitIcon_delegate$lambda$138(resources, theme);
                        break;
                    case 20:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitText_delegate$lambda$139(resources, theme);
                        break;
                    case 21:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.backgroundSurfaceHighest_delegate$lambda$13(resources, theme);
                        break;
                    case 22:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.backgroundVoiceMuted_delegate$lambda$14(resources, theme);
                        break;
                    case 23:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.badgeNotificationBackground_delegate$lambda$15(resources, theme);
                        break;
                    case 24:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.borderStrong_delegate$lambda$16(resources, theme);
                        break;
                    case 25:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.borderSubtle_delegate$lambda$17(resources, theme);
                        break;
                    case 26:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.cardBackgroundDefault_delegate$lambda$18(resources, theme);
                        break;
                    case 27:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.redesignButtonTertiaryBackground_delegate$lambda$103(resources, theme);
                        break;
                    case 28:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.cardSecondaryBackgroundActive_delegate$lambda$19(resources, theme);
                        break;
                    default:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.appFrameBorder_delegate$lambda$1(resources, theme);
                        break;
                }
                return Integer.valueOf(iTextDefault_delegate$lambda$122);
            }
        });
        final int i94 = 15;
        this.userProfileGradientBackground = l.b(new Function0() { // from class: f8.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iTextDefault_delegate$lambda$122;
                switch (i94) {
                    case 0:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textDefault_delegate$lambda$122(resources, theme);
                        break;
                    case 1:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackCritical_delegate$lambda$123(resources, theme);
                        break;
                    case 2:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackInfo_delegate$lambda$124(resources, theme);
                        break;
                    case 3:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackPositive_delegate$lambda$125(resources, theme);
                        break;
                    case 4:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackWarning_delegate$lambda$126(resources, theme);
                        break;
                    case 5:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.reactionBorderReactedDefault_delegate$lambda$101(resources, theme);
                        break;
                    case 6:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textMuted_delegate$lambda$127(resources, theme);
                        break;
                    case 7:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textStrong_delegate$lambda$128(resources, theme);
                        break;
                    case 8:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textSubtle_delegate$lambda$129(resources, theme);
                        break;
                    case 9:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.backgroundSurfaceHigh_delegate$lambda$12(resources, theme);
                        break;
                    case 10:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textVoiceConnected_delegate$lambda$130(resources, theme);
                        break;
                    case 11:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textVoiceDisconnected_delegate$lambda$131(resources, theme);
                        break;
                    case 12:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textVoiceSpeaking_delegate$lambda$132(resources, theme);
                        break;
                    case 13:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.userProfileAboutMeHeadingText_delegate$lambda$133(resources, theme);
                        break;
                    case 14:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.userProfileContainerBackground_delegate$lambda$134(resources, theme);
                        break;
                    case 15:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.userProfileGradientBackground_delegate$lambda$135(resources, theme);
                        break;
                    case 16:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.reactionTextReactedDefault_delegate$lambda$102(resources, theme);
                        break;
                    case 17:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitAccentBackground_delegate$lambda$136(resources, theme);
                        break;
                    case 18:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitBackground_delegate$lambda$137(resources, theme);
                        break;
                    case 19:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitIcon_delegate$lambda$138(resources, theme);
                        break;
                    case 20:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitText_delegate$lambda$139(resources, theme);
                        break;
                    case 21:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.backgroundSurfaceHighest_delegate$lambda$13(resources, theme);
                        break;
                    case 22:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.backgroundVoiceMuted_delegate$lambda$14(resources, theme);
                        break;
                    case 23:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.badgeNotificationBackground_delegate$lambda$15(resources, theme);
                        break;
                    case 24:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.borderStrong_delegate$lambda$16(resources, theme);
                        break;
                    case 25:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.borderSubtle_delegate$lambda$17(resources, theme);
                        break;
                    case 26:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.cardBackgroundDefault_delegate$lambda$18(resources, theme);
                        break;
                    case 27:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.redesignButtonTertiaryBackground_delegate$lambda$103(resources, theme);
                        break;
                    case 28:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.cardSecondaryBackgroundActive_delegate$lambda$19(resources, theme);
                        break;
                    default:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.appFrameBorder_delegate$lambda$1(resources, theme);
                        break;
                }
                return Integer.valueOf(iTextDefault_delegate$lambda$122);
            }
        });
        final int i95 = 17;
        this.voiceChannelUserLimitAccentBackground = l.b(new Function0() { // from class: f8.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iTextDefault_delegate$lambda$122;
                switch (i95) {
                    case 0:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textDefault_delegate$lambda$122(resources, theme);
                        break;
                    case 1:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackCritical_delegate$lambda$123(resources, theme);
                        break;
                    case 2:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackInfo_delegate$lambda$124(resources, theme);
                        break;
                    case 3:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackPositive_delegate$lambda$125(resources, theme);
                        break;
                    case 4:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackWarning_delegate$lambda$126(resources, theme);
                        break;
                    case 5:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.reactionBorderReactedDefault_delegate$lambda$101(resources, theme);
                        break;
                    case 6:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textMuted_delegate$lambda$127(resources, theme);
                        break;
                    case 7:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textStrong_delegate$lambda$128(resources, theme);
                        break;
                    case 8:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textSubtle_delegate$lambda$129(resources, theme);
                        break;
                    case 9:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.backgroundSurfaceHigh_delegate$lambda$12(resources, theme);
                        break;
                    case 10:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textVoiceConnected_delegate$lambda$130(resources, theme);
                        break;
                    case 11:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textVoiceDisconnected_delegate$lambda$131(resources, theme);
                        break;
                    case 12:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textVoiceSpeaking_delegate$lambda$132(resources, theme);
                        break;
                    case 13:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.userProfileAboutMeHeadingText_delegate$lambda$133(resources, theme);
                        break;
                    case 14:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.userProfileContainerBackground_delegate$lambda$134(resources, theme);
                        break;
                    case 15:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.userProfileGradientBackground_delegate$lambda$135(resources, theme);
                        break;
                    case 16:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.reactionTextReactedDefault_delegate$lambda$102(resources, theme);
                        break;
                    case 17:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitAccentBackground_delegate$lambda$136(resources, theme);
                        break;
                    case 18:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitBackground_delegate$lambda$137(resources, theme);
                        break;
                    case 19:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitIcon_delegate$lambda$138(resources, theme);
                        break;
                    case 20:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitText_delegate$lambda$139(resources, theme);
                        break;
                    case 21:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.backgroundSurfaceHighest_delegate$lambda$13(resources, theme);
                        break;
                    case 22:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.backgroundVoiceMuted_delegate$lambda$14(resources, theme);
                        break;
                    case 23:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.badgeNotificationBackground_delegate$lambda$15(resources, theme);
                        break;
                    case 24:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.borderStrong_delegate$lambda$16(resources, theme);
                        break;
                    case 25:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.borderSubtle_delegate$lambda$17(resources, theme);
                        break;
                    case 26:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.cardBackgroundDefault_delegate$lambda$18(resources, theme);
                        break;
                    case 27:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.redesignButtonTertiaryBackground_delegate$lambda$103(resources, theme);
                        break;
                    case 28:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.cardSecondaryBackgroundActive_delegate$lambda$19(resources, theme);
                        break;
                    default:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.appFrameBorder_delegate$lambda$1(resources, theme);
                        break;
                }
                return Integer.valueOf(iTextDefault_delegate$lambda$122);
            }
        });
        final int i96 = 18;
        this.voiceChannelUserLimitBackground = l.b(new Function0() { // from class: f8.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iTextDefault_delegate$lambda$122;
                switch (i96) {
                    case 0:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textDefault_delegate$lambda$122(resources, theme);
                        break;
                    case 1:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackCritical_delegate$lambda$123(resources, theme);
                        break;
                    case 2:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackInfo_delegate$lambda$124(resources, theme);
                        break;
                    case 3:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackPositive_delegate$lambda$125(resources, theme);
                        break;
                    case 4:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackWarning_delegate$lambda$126(resources, theme);
                        break;
                    case 5:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.reactionBorderReactedDefault_delegate$lambda$101(resources, theme);
                        break;
                    case 6:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textMuted_delegate$lambda$127(resources, theme);
                        break;
                    case 7:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textStrong_delegate$lambda$128(resources, theme);
                        break;
                    case 8:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textSubtle_delegate$lambda$129(resources, theme);
                        break;
                    case 9:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.backgroundSurfaceHigh_delegate$lambda$12(resources, theme);
                        break;
                    case 10:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textVoiceConnected_delegate$lambda$130(resources, theme);
                        break;
                    case 11:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textVoiceDisconnected_delegate$lambda$131(resources, theme);
                        break;
                    case 12:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textVoiceSpeaking_delegate$lambda$132(resources, theme);
                        break;
                    case 13:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.userProfileAboutMeHeadingText_delegate$lambda$133(resources, theme);
                        break;
                    case 14:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.userProfileContainerBackground_delegate$lambda$134(resources, theme);
                        break;
                    case 15:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.userProfileGradientBackground_delegate$lambda$135(resources, theme);
                        break;
                    case 16:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.reactionTextReactedDefault_delegate$lambda$102(resources, theme);
                        break;
                    case 17:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitAccentBackground_delegate$lambda$136(resources, theme);
                        break;
                    case 18:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitBackground_delegate$lambda$137(resources, theme);
                        break;
                    case 19:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitIcon_delegate$lambda$138(resources, theme);
                        break;
                    case 20:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitText_delegate$lambda$139(resources, theme);
                        break;
                    case 21:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.backgroundSurfaceHighest_delegate$lambda$13(resources, theme);
                        break;
                    case 22:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.backgroundVoiceMuted_delegate$lambda$14(resources, theme);
                        break;
                    case 23:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.badgeNotificationBackground_delegate$lambda$15(resources, theme);
                        break;
                    case 24:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.borderStrong_delegate$lambda$16(resources, theme);
                        break;
                    case 25:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.borderSubtle_delegate$lambda$17(resources, theme);
                        break;
                    case 26:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.cardBackgroundDefault_delegate$lambda$18(resources, theme);
                        break;
                    case 27:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.redesignButtonTertiaryBackground_delegate$lambda$103(resources, theme);
                        break;
                    case 28:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.cardSecondaryBackgroundActive_delegate$lambda$19(resources, theme);
                        break;
                    default:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.appFrameBorder_delegate$lambda$1(resources, theme);
                        break;
                }
                return Integer.valueOf(iTextDefault_delegate$lambda$122);
            }
        });
        final int i97 = 19;
        this.voiceChannelUserLimitIcon = l.b(new Function0() { // from class: f8.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iTextDefault_delegate$lambda$122;
                switch (i97) {
                    case 0:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textDefault_delegate$lambda$122(resources, theme);
                        break;
                    case 1:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackCritical_delegate$lambda$123(resources, theme);
                        break;
                    case 2:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackInfo_delegate$lambda$124(resources, theme);
                        break;
                    case 3:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackPositive_delegate$lambda$125(resources, theme);
                        break;
                    case 4:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackWarning_delegate$lambda$126(resources, theme);
                        break;
                    case 5:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.reactionBorderReactedDefault_delegate$lambda$101(resources, theme);
                        break;
                    case 6:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textMuted_delegate$lambda$127(resources, theme);
                        break;
                    case 7:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textStrong_delegate$lambda$128(resources, theme);
                        break;
                    case 8:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textSubtle_delegate$lambda$129(resources, theme);
                        break;
                    case 9:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.backgroundSurfaceHigh_delegate$lambda$12(resources, theme);
                        break;
                    case 10:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textVoiceConnected_delegate$lambda$130(resources, theme);
                        break;
                    case 11:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textVoiceDisconnected_delegate$lambda$131(resources, theme);
                        break;
                    case 12:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textVoiceSpeaking_delegate$lambda$132(resources, theme);
                        break;
                    case 13:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.userProfileAboutMeHeadingText_delegate$lambda$133(resources, theme);
                        break;
                    case 14:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.userProfileContainerBackground_delegate$lambda$134(resources, theme);
                        break;
                    case 15:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.userProfileGradientBackground_delegate$lambda$135(resources, theme);
                        break;
                    case 16:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.reactionTextReactedDefault_delegate$lambda$102(resources, theme);
                        break;
                    case 17:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitAccentBackground_delegate$lambda$136(resources, theme);
                        break;
                    case 18:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitBackground_delegate$lambda$137(resources, theme);
                        break;
                    case 19:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitIcon_delegate$lambda$138(resources, theme);
                        break;
                    case 20:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitText_delegate$lambda$139(resources, theme);
                        break;
                    case 21:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.backgroundSurfaceHighest_delegate$lambda$13(resources, theme);
                        break;
                    case 22:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.backgroundVoiceMuted_delegate$lambda$14(resources, theme);
                        break;
                    case 23:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.badgeNotificationBackground_delegate$lambda$15(resources, theme);
                        break;
                    case 24:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.borderStrong_delegate$lambda$16(resources, theme);
                        break;
                    case 25:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.borderSubtle_delegate$lambda$17(resources, theme);
                        break;
                    case 26:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.cardBackgroundDefault_delegate$lambda$18(resources, theme);
                        break;
                    case 27:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.redesignButtonTertiaryBackground_delegate$lambda$103(resources, theme);
                        break;
                    case 28:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.cardSecondaryBackgroundActive_delegate$lambda$19(resources, theme);
                        break;
                    default:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.appFrameBorder_delegate$lambda$1(resources, theme);
                        break;
                }
                return Integer.valueOf(iTextDefault_delegate$lambda$122);
            }
        });
        final int i98 = 20;
        this.voiceChannelUserLimitText = l.b(new Function0() { // from class: f8.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iTextDefault_delegate$lambda$122;
                switch (i98) {
                    case 0:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textDefault_delegate$lambda$122(resources, theme);
                        break;
                    case 1:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackCritical_delegate$lambda$123(resources, theme);
                        break;
                    case 2:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackInfo_delegate$lambda$124(resources, theme);
                        break;
                    case 3:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackPositive_delegate$lambda$125(resources, theme);
                        break;
                    case 4:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textFeedbackWarning_delegate$lambda$126(resources, theme);
                        break;
                    case 5:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.reactionBorderReactedDefault_delegate$lambda$101(resources, theme);
                        break;
                    case 6:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textMuted_delegate$lambda$127(resources, theme);
                        break;
                    case 7:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textStrong_delegate$lambda$128(resources, theme);
                        break;
                    case 8:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textSubtle_delegate$lambda$129(resources, theme);
                        break;
                    case 9:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.backgroundSurfaceHigh_delegate$lambda$12(resources, theme);
                        break;
                    case 10:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textVoiceConnected_delegate$lambda$130(resources, theme);
                        break;
                    case 11:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textVoiceDisconnected_delegate$lambda$131(resources, theme);
                        break;
                    case 12:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.textVoiceSpeaking_delegate$lambda$132(resources, theme);
                        break;
                    case 13:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.userProfileAboutMeHeadingText_delegate$lambda$133(resources, theme);
                        break;
                    case 14:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.userProfileContainerBackground_delegate$lambda$134(resources, theme);
                        break;
                    case 15:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.userProfileGradientBackground_delegate$lambda$135(resources, theme);
                        break;
                    case 16:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.reactionTextReactedDefault_delegate$lambda$102(resources, theme);
                        break;
                    case 17:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitAccentBackground_delegate$lambda$136(resources, theme);
                        break;
                    case 18:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitBackground_delegate$lambda$137(resources, theme);
                        break;
                    case 19:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitIcon_delegate$lambda$138(resources, theme);
                        break;
                    case 20:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.voiceChannelUserLimitText_delegate$lambda$139(resources, theme);
                        break;
                    case 21:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.backgroundSurfaceHighest_delegate$lambda$13(resources, theme);
                        break;
                    case 22:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.backgroundVoiceMuted_delegate$lambda$14(resources, theme);
                        break;
                    case 23:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.badgeNotificationBackground_delegate$lambda$15(resources, theme);
                        break;
                    case 24:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.borderStrong_delegate$lambda$16(resources, theme);
                        break;
                    case 25:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.borderSubtle_delegate$lambda$17(resources, theme);
                        break;
                    case 26:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.cardBackgroundDefault_delegate$lambda$18(resources, theme);
                        break;
                    case 27:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.redesignButtonTertiaryBackground_delegate$lambda$103(resources, theme);
                        break;
                    case 28:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.cardSecondaryBackgroundActive_delegate$lambda$19(resources, theme);
                        break;
                    default:
                        iTextDefault_delegate$lambda$122 = DarkThemeExperiment.appFrameBorder_delegate$lambda$1(resources, theme);
                        break;
                }
                return Integer.valueOf(iTextDefault_delegate$lambda$122);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int activityTimebarProgressBackground_delegate$lambda$0(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.blurple_50, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int appFrameBorder_delegate$lambda$1(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.app_frame_border_experiment_dark, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int backgroundBaseLow_delegate$lambda$2(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.neutral_66, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int backgroundBaseLower_delegate$lambda$3(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.neutral_69, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int backgroundBaseLowest_delegate$lambda$4(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.neutral_73, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int backgroundFeedbackCritical_delegate$lambda$5(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.background_feedback_critical_experiment_dark, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int backgroundFeedbackNotification_delegate$lambda$6(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.red_new_46, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int backgroundModNormal_delegate$lambda$7(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.background_mod_normal_experiment_dark, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int backgroundModStrong_delegate$lambda$8(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.background_mod_strong_experiment_dark, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int backgroundModSubtle_delegate$lambda$9(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.background_mod_subtle_experiment_dark, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int backgroundScrimLightbox_delegate$lambda$11(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.background_scrim_lightbox_experiment_dark, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int backgroundScrim_delegate$lambda$10(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.background_scrim_experiment_dark, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int backgroundSurfaceHigh_delegate$lambda$12(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.neutral_64, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int backgroundSurfaceHighest_delegate$lambda$13(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.neutral_60, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int backgroundVoiceMuted_delegate$lambda$14(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.background_voice_muted_experiment_dark, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int badgeNotificationBackground_delegate$lambda$15(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.red_new_46, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int borderStrong_delegate$lambda$16(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.border_strong_experiment_dark, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int borderSubtle_delegate$lambda$17(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.border_subtle_experiment_dark, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int cardBackgroundDefault_delegate$lambda$18(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.neutral_64, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int cardSecondaryBackgroundActive_delegate$lambda$19(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.card_secondary_background_active_experiment_dark, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int cardSecondaryBackgroundDefault_delegate$lambda$20(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.card_secondary_background_default_experiment_dark, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int channelBackgroundDefault_delegate$lambda$21(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.neutral_69, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int chatInputActionButtonBackground_delegate$lambda$22(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.chat_input_action_button_background_experiment_dark, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int chatInputActionButtonIconDefaultTint_delegate$lambda$23(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.neutral_16, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int chatInputActionIconActiveTint_delegate$lambda$24(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.neutral_1, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int chatInputBackground_delegate$lambda$25(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.chat_input_background_experiment_dark, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int chatInputIconDefaultTint_delegate$lambda$26(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.neutral_16, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int chatInputSendButtonActiveBackground_delegate$lambda$27(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.blurple_50, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int chatInputSendButtonIconActiveTint_delegate$lambda$28(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.neutral_1, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int checkboxBackgroundDefault_delegate$lambda$29(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.checkbox_background_default_experiment_dark, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int checkboxBackgroundSelectedDefault_delegate$lambda$30(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.blurple_50, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int checkboxBorderDefault_delegate$lambda$31(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.checkbox_border_default_experiment_dark, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int checkboxBorderSelectedDefault_delegate$lambda$32(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.checkbox_border_selected_default_experiment_dark, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int checkboxIconActive_delegate$lambda$33(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.neutral_1, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int controlConnectedBackgroundActive_delegate$lambda$34(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.green_new_65, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int controlConnectedBackgroundDefault_delegate$lambda$35(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.green_new_50, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int controlConnectedBorderActive_delegate$lambda$36(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.control_connected_border_active_experiment_dark, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int controlConnectedBorderDefault_delegate$lambda$37(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.control_connected_border_default_experiment_dark, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int controlConnectedTextDefault_delegate$lambda$38(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.neutral_1, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int controlCriticalPrimaryBackgroundActive_delegate$lambda$39(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.red_new_65, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int controlCriticalPrimaryBackgroundDefault_delegate$lambda$40(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.red_new_50, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int controlCriticalPrimaryBorderActive_delegate$lambda$41(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.control_critical_primary_border_active_experiment_dark, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int controlCriticalPrimaryBorderDefault_delegate$lambda$42(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.control_critical_primary_border_default_experiment_dark, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int controlCriticalPrimaryTextDefault_delegate$lambda$43(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.neutral_1, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int controlOverlayPrimaryBackgroundActive_delegate$lambda$44(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.neutral_17, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int controlOverlayPrimaryBackgroundDefault_delegate$lambda$45(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.neutral_1, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int controlOverlayPrimaryBorderDefault_delegate$lambda$46(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.control_overlay_primary_border_default_experiment_dark, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int controlOverlayPrimaryTextDefault_delegate$lambda$47(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.neutral_100, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int controlOverlaySecondaryBackgroundActive_delegate$lambda$48(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.control_overlay_secondary_background_active_experiment_dark, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int controlOverlaySecondaryBackgroundDefault_delegate$lambda$49(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.control_overlay_secondary_background_default_experiment_dark, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int controlOverlaySecondaryBorderDefault_delegate$lambda$50(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.control_overlay_secondary_border_default_experiment_dark, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int controlOverlaySecondaryTextDefault_delegate$lambda$51(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.neutral_1, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int controlPrimaryBackgroundActive_delegate$lambda$52(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.blurple_65, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int controlPrimaryBackgroundDefault_delegate$lambda$53(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.blurple_50, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int controlPrimaryBorderActive_delegate$lambda$54(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.control_primary_border_active_experiment_dark, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int controlPrimaryBorderDefault_delegate$lambda$55(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.control_primary_border_default_experiment_dark, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int controlPrimaryTextDefault_delegate$lambda$56(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.neutral_1, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int controlSecondaryBackgroundActive_delegate$lambda$57(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.control_secondary_background_active_experiment_dark, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int controlSecondaryBackgroundDefault_delegate$lambda$58(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.control_secondary_background_default_experiment_dark, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int controlSecondaryBorderActive_delegate$lambda$59(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.control_secondary_border_active_experiment_dark, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int controlSecondaryBorderDefault_delegate$lambda$60(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.control_secondary_border_default_experiment_dark, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int controlSecondaryTextDefault_delegate$lambda$61(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.neutral_1, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int embedBackground_delegate$lambda$62(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.neutral_64, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int guildFolderBackground_delegate$lambda$63(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.guild_folder_background_experiment_dark, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int iconFeedbackCritical_delegate$lambda$64(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.red_new_18, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int iconFeedbackInfo_delegate$lambda$65(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.blue_new_21, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int iconFeedbackNotification_delegate$lambda$66(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.red_new_46, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int iconFeedbackWarning_delegate$lambda$67(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.yellow_new_38, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int inputBackgroundDefault_delegate$lambda$68(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.input_background_default_experiment_dark, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int inputBorderActive_delegate$lambda$69(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.blurple_50, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int inputBorderDefault_delegate$lambda$70(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.input_border_default_experiment_dark, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int inputBorderErrorDefault_delegate$lambda$71(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.red_new_18, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int inputIconDefault_delegate$lambda$72(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.neutral_16, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int interactiveBackgroundSelected_delegate$lambda$73(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.interactive_background_selected_experiment_dark, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int interactiveIconActive_delegate$lambda$74(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.neutral_1, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int interactiveIconDefault_delegate$lambda$75(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.neutral_16, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int interactiveTextActive_delegate$lambda$76(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.neutral_1, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int interactiveTextDefault_delegate$lambda$77(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.neutral_16, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int messageHighlightBackgroundDefault_delegate$lambda$78(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.message_highlight_background_default_experiment_dark, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int messagesItemChannelTextDefault_delegate$lambda$79(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.neutral_16, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int mobileActionsheetBackground_delegate$lambda$80(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.neutral_64, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int mobileChannelItemBackgroundSelected_delegate$lambda$81(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.mobile_channel_item_background_selected_experiment_dark, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int mobileCoachmarkBorderDefault_delegate$lambda$82(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.mobile_coachmark_border_default_experiment_dark, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int mobileEmbedBackgroundDefault_delegate$lambda$83(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.neutral_64, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int mobileEmojiButtonBackground_delegate$lambda$84(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.mobile_emoji_button_background_experiment_dark, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int mobileGuildbarIconBackgroundDefault_delegate$lambda$85(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.mobile_guildbar_icon_background_default_experiment_dark, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int mobileGuildbarIconDefault_delegate$lambda$86(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.neutral_16, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int mobileHeaderIconDefault_delegate$lambda$87(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.neutral_1, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int mobileKeyboardGapBackground_delegate$lambda$88(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.neutral_66, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int mobileKeyboardPanelBackground_delegate$lambda$89(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.neutral_64, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int mobileSegmentedControlBackground_delegate$lambda$90(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.mobile_segmented_control_background_experiment_dark, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int mobileSegmentedControlIndicatorBackground_delegate$lambda$91(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.mobile_segmented_control_indicator_background_experiment_dark, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int mobileTextHeadingPrimary_delegate$lambda$92(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.neutral_1, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int mobileThreadEmbedBackground_delegate$lambda$93(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.neutral_64, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int mobileUnreadbarTextDefault_delegate$lambda$94(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.neutral_16, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int mobileVoicePanelBadgeBackground_delegate$lambda$95(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.mobile_voice_panel_badge_background_experiment_dark, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int progressbarIndicatorBackground_delegate$lambda$96(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.blurple_50, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int radioBorderDefault_delegate$lambda$97(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.radio_border_default_experiment_dark, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int reactionBackgroundDefault_delegate$lambda$98(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.reaction_background_default_experiment_dark, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int reactionBackgroundReactedDefault_delegate$lambda$99(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.reaction_background_reacted_default_experiment_dark, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int reactionBorderDefault_delegate$lambda$100(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.reaction_border_default_experiment_dark, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int reactionBorderReactedDefault_delegate$lambda$101(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.blurple_50, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int reactionTextReactedDefault_delegate$lambda$102(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.blurple_3, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int redesignButtonTertiaryBackground_delegate$lambda$103(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.redesign_button_tertiary_background_experiment_dark, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int spineDefault_delegate$lambda$104(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.neutral_47, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int spoilerHiddenBackground_delegate$lambda$105(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.neutral_36, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int standaloneChannelContentBackground_delegate$lambda$106(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.neutral_69, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int standaloneChannelHeaderBorder_delegate$lambda$107(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.standalone_channel_header_border_experiment_dark, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int switchBackgroundDefault_delegate$lambda$108(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.switch_background_default_experiment_dark, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int switchBackgroundSelectedDefault_delegate$lambda$109(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.blurple_50, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int switchBorderDefault_delegate$lambda$110(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.switch_border_default_experiment_dark, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int switchBorderSelectedDefault_delegate$lambda$111(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.switch_border_selected_default_experiment_dark, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int switchThumbBackgroundDefault_delegate$lambda$112(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.neutral_1, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int switchThumbBackgroundSelectedDefault_delegate$lambda$113(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.neutral_1, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int switchThumbIconDefault_delegate$lambda$114(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.neutral_71, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int tabBarBackground_delegate$lambda$115(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.neutral_66, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int tabLabelTextDefault_delegate$lambda$116(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.neutral_16, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int tabLabelTextFocused_delegate$lambda$117(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.neutral_1, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int tablerowBackgroundDefault_delegate$lambda$118(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.tablerow_background_default_experiment_dark, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int tablerowBackgroundPressed_delegate$lambda$119(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.tablerow_background_pressed_experiment_dark, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int tablerowIconColorDefault_delegate$lambda$120(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.neutral_1, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int textBrand_delegate$lambda$121(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.blurple_26, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int textDefault_delegate$lambda$122(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.neutral_4, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int textFeedbackCritical_delegate$lambda$123(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.red_new_18, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int textFeedbackInfo_delegate$lambda$124(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.blue_new_21, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int textFeedbackPositive_delegate$lambda$125(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.green_new_22, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int textFeedbackWarning_delegate$lambda$126(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.yellow_new_38, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int textMuted_delegate$lambda$127(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.neutral_23, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int textStrong_delegate$lambda$128(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.neutral_1, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int textSubtle_delegate$lambda$129(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.neutral_16, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int textVoiceConnected_delegate$lambda$130(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.green_new_25, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int textVoiceDisconnected_delegate$lambda$131(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.red_new_18, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int textVoiceSpeaking_delegate$lambda$132(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.green_new_40, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int userProfileAboutMeHeadingText_delegate$lambda$133(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.neutral_1, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int userProfileContainerBackground_delegate$lambda$134(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.user_profile_container_background_experiment_dark, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int userProfileGradientBackground_delegate$lambda$135(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.neutral_73, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int voiceChannelUserLimitAccentBackground_delegate$lambda$136(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.voice_channel_user_limit_accent_background_experiment_dark, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int voiceChannelUserLimitBackground_delegate$lambda$137(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.neutral_66, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int voiceChannelUserLimitIcon_delegate$lambda$138(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.neutral_16, theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int voiceChannelUserLimitText_delegate$lambda$139(Resources resources, Resources.Theme theme) {
        return ColorUtilsKt.getColorCompat(resources, R.color.neutral_16, theme);
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getActivityTimebarProgressBackground() {
        return ((Number) this.activityTimebarProgressBackground.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getAppFrameBorder() {
        return ((Number) this.appFrameBorder.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getBackgroundBaseLow() {
        return ((Number) this.backgroundBaseLow.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getBackgroundBaseLower() {
        return ((Number) this.backgroundBaseLower.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getBackgroundBaseLowest() {
        return ((Number) this.backgroundBaseLowest.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getBackgroundFeedbackCritical() {
        return ((Number) this.backgroundFeedbackCritical.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getBackgroundFeedbackNotification() {
        return ((Number) this.backgroundFeedbackNotification.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getBackgroundModNormal() {
        return ((Number) this.backgroundModNormal.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getBackgroundModStrong() {
        return ((Number) this.backgroundModStrong.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getBackgroundModSubtle() {
        return ((Number) this.backgroundModSubtle.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getBackgroundScrim() {
        return ((Number) this.backgroundScrim.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getBackgroundScrimLightbox() {
        return ((Number) this.backgroundScrimLightbox.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getBackgroundSurfaceHigh() {
        return ((Number) this.backgroundSurfaceHigh.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getBackgroundSurfaceHighest() {
        return ((Number) this.backgroundSurfaceHighest.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getBackgroundVoiceMuted() {
        return ((Number) this.backgroundVoiceMuted.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getBadgeNotificationBackground() {
        return ((Number) this.badgeNotificationBackground.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getBorderStrong() {
        return ((Number) this.borderStrong.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getBorderSubtle() {
        return ((Number) this.borderSubtle.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getCardBackgroundDefault() {
        return ((Number) this.cardBackgroundDefault.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getCardSecondaryBackgroundActive() {
        return ((Number) this.cardSecondaryBackgroundActive.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getCardSecondaryBackgroundDefault() {
        return ((Number) this.cardSecondaryBackgroundDefault.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getChannelBackgroundDefault() {
        return ((Number) this.channelBackgroundDefault.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getChatInputActionButtonBackground() {
        return ((Number) this.chatInputActionButtonBackground.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getChatInputActionButtonIconDefaultTint() {
        return ((Number) this.chatInputActionButtonIconDefaultTint.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getChatInputActionIconActiveTint() {
        return ((Number) this.chatInputActionIconActiveTint.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getChatInputBackground() {
        return ((Number) this.chatInputBackground.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getChatInputIconDefaultTint() {
        return ((Number) this.chatInputIconDefaultTint.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getChatInputSendButtonActiveBackground() {
        return ((Number) this.chatInputSendButtonActiveBackground.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getChatInputSendButtonIconActiveTint() {
        return ((Number) this.chatInputSendButtonIconActiveTint.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getCheckboxBackgroundDefault() {
        return ((Number) this.checkboxBackgroundDefault.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getCheckboxBackgroundSelectedDefault() {
        return ((Number) this.checkboxBackgroundSelectedDefault.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getCheckboxBorderDefault() {
        return ((Number) this.checkboxBorderDefault.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getCheckboxBorderSelectedDefault() {
        return ((Number) this.checkboxBorderSelectedDefault.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getCheckboxIconActive() {
        return ((Number) this.checkboxIconActive.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getControlConnectedBackgroundActive() {
        return ((Number) this.controlConnectedBackgroundActive.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getControlConnectedBackgroundDefault() {
        return ((Number) this.controlConnectedBackgroundDefault.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getControlConnectedBorderActive() {
        return ((Number) this.controlConnectedBorderActive.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getControlConnectedBorderDefault() {
        return ((Number) this.controlConnectedBorderDefault.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getControlConnectedTextDefault() {
        return ((Number) this.controlConnectedTextDefault.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getControlCriticalPrimaryBackgroundActive() {
        return ((Number) this.controlCriticalPrimaryBackgroundActive.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getControlCriticalPrimaryBackgroundDefault() {
        return ((Number) this.controlCriticalPrimaryBackgroundDefault.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getControlCriticalPrimaryBorderActive() {
        return ((Number) this.controlCriticalPrimaryBorderActive.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getControlCriticalPrimaryBorderDefault() {
        return ((Number) this.controlCriticalPrimaryBorderDefault.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getControlCriticalPrimaryTextDefault() {
        return ((Number) this.controlCriticalPrimaryTextDefault.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getControlOverlayPrimaryBackgroundActive() {
        return ((Number) this.controlOverlayPrimaryBackgroundActive.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getControlOverlayPrimaryBackgroundDefault() {
        return ((Number) this.controlOverlayPrimaryBackgroundDefault.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getControlOverlayPrimaryBorderDefault() {
        return ((Number) this.controlOverlayPrimaryBorderDefault.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getControlOverlayPrimaryTextDefault() {
        return ((Number) this.controlOverlayPrimaryTextDefault.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getControlOverlaySecondaryBackgroundActive() {
        return ((Number) this.controlOverlaySecondaryBackgroundActive.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getControlOverlaySecondaryBackgroundDefault() {
        return ((Number) this.controlOverlaySecondaryBackgroundDefault.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getControlOverlaySecondaryBorderDefault() {
        return ((Number) this.controlOverlaySecondaryBorderDefault.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getControlOverlaySecondaryTextDefault() {
        return ((Number) this.controlOverlaySecondaryTextDefault.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getControlPrimaryBackgroundActive() {
        return ((Number) this.controlPrimaryBackgroundActive.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getControlPrimaryBackgroundDefault() {
        return ((Number) this.controlPrimaryBackgroundDefault.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getControlPrimaryBorderActive() {
        return ((Number) this.controlPrimaryBorderActive.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getControlPrimaryBorderDefault() {
        return ((Number) this.controlPrimaryBorderDefault.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getControlPrimaryTextDefault() {
        return ((Number) this.controlPrimaryTextDefault.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getControlSecondaryBackgroundActive() {
        return ((Number) this.controlSecondaryBackgroundActive.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getControlSecondaryBackgroundDefault() {
        return ((Number) this.controlSecondaryBackgroundDefault.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getControlSecondaryBorderActive() {
        return ((Number) this.controlSecondaryBorderActive.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getControlSecondaryBorderDefault() {
        return ((Number) this.controlSecondaryBorderDefault.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getControlSecondaryTextDefault() {
        return ((Number) this.controlSecondaryTextDefault.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getEmbedBackground() {
        return ((Number) this.embedBackground.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getGuildFolderBackground() {
        return ((Number) this.guildFolderBackground.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getIconFeedbackCritical() {
        return ((Number) this.iconFeedbackCritical.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getIconFeedbackInfo() {
        return ((Number) this.iconFeedbackInfo.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getIconFeedbackNotification() {
        return ((Number) this.iconFeedbackNotification.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getIconFeedbackWarning() {
        return ((Number) this.iconFeedbackWarning.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getInputBackgroundDefault() {
        return ((Number) this.inputBackgroundDefault.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getInputBorderActive() {
        return ((Number) this.inputBorderActive.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getInputBorderDefault() {
        return ((Number) this.inputBorderDefault.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getInputBorderErrorDefault() {
        return ((Number) this.inputBorderErrorDefault.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getInputIconDefault() {
        return ((Number) this.inputIconDefault.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getInteractiveBackgroundSelected() {
        return ((Number) this.interactiveBackgroundSelected.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getInteractiveIconActive() {
        return ((Number) this.interactiveIconActive.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getInteractiveIconDefault() {
        return ((Number) this.interactiveIconDefault.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getInteractiveTextActive() {
        return ((Number) this.interactiveTextActive.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getInteractiveTextDefault() {
        return ((Number) this.interactiveTextDefault.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getMessageHighlightBackgroundDefault() {
        return ((Number) this.messageHighlightBackgroundDefault.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getMessagesItemChannelTextDefault() {
        return ((Number) this.messagesItemChannelTextDefault.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getMobileActionsheetBackground() {
        return ((Number) this.mobileActionsheetBackground.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getMobileChannelItemBackgroundSelected() {
        return ((Number) this.mobileChannelItemBackgroundSelected.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getMobileCoachmarkBorderDefault() {
        return ((Number) this.mobileCoachmarkBorderDefault.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getMobileEmbedBackgroundDefault() {
        return ((Number) this.mobileEmbedBackgroundDefault.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getMobileEmojiButtonBackground() {
        return ((Number) this.mobileEmojiButtonBackground.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getMobileGuildbarIconBackgroundDefault() {
        return ((Number) this.mobileGuildbarIconBackgroundDefault.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getMobileGuildbarIconDefault() {
        return ((Number) this.mobileGuildbarIconDefault.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getMobileHeaderIconDefault() {
        return ((Number) this.mobileHeaderIconDefault.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getMobileKeyboardGapBackground() {
        return ((Number) this.mobileKeyboardGapBackground.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getMobileKeyboardPanelBackground() {
        return ((Number) this.mobileKeyboardPanelBackground.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getMobileSegmentedControlBackground() {
        return ((Number) this.mobileSegmentedControlBackground.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getMobileSegmentedControlIndicatorBackground() {
        return ((Number) this.mobileSegmentedControlIndicatorBackground.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getMobileTextHeadingPrimary() {
        return ((Number) this.mobileTextHeadingPrimary.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getMobileThreadEmbedBackground() {
        return ((Number) this.mobileThreadEmbedBackground.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getMobileUnreadbarTextDefault() {
        return ((Number) this.mobileUnreadbarTextDefault.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getMobileVoicePanelBadgeBackground() {
        return ((Number) this.mobileVoicePanelBadgeBackground.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getProgressbarIndicatorBackground() {
        return ((Number) this.progressbarIndicatorBackground.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getRadioBorderDefault() {
        return ((Number) this.radioBorderDefault.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getReactionBackgroundDefault() {
        return ((Number) this.reactionBackgroundDefault.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getReactionBackgroundReactedDefault() {
        return ((Number) this.reactionBackgroundReactedDefault.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getReactionBorderDefault() {
        return ((Number) this.reactionBorderDefault.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getReactionBorderReactedDefault() {
        return ((Number) this.reactionBorderReactedDefault.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getReactionTextReactedDefault() {
        return ((Number) this.reactionTextReactedDefault.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getRedesignButtonTertiaryBackground() {
        return ((Number) this.redesignButtonTertiaryBackground.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getSpineDefault() {
        return ((Number) this.spineDefault.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getSpoilerHiddenBackground() {
        return ((Number) this.spoilerHiddenBackground.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getStandaloneChannelContentBackground() {
        return ((Number) this.standaloneChannelContentBackground.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getStandaloneChannelHeaderBorder() {
        return ((Number) this.standaloneChannelHeaderBorder.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getSwitchBackgroundDefault() {
        return ((Number) this.switchBackgroundDefault.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getSwitchBackgroundSelectedDefault() {
        return ((Number) this.switchBackgroundSelectedDefault.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getSwitchBorderDefault() {
        return ((Number) this.switchBorderDefault.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getSwitchBorderSelectedDefault() {
        return ((Number) this.switchBorderSelectedDefault.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getSwitchThumbBackgroundDefault() {
        return ((Number) this.switchThumbBackgroundDefault.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getSwitchThumbBackgroundSelectedDefault() {
        return ((Number) this.switchThumbBackgroundSelectedDefault.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getSwitchThumbIconDefault() {
        return ((Number) this.switchThumbIconDefault.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getTabBarBackground() {
        return ((Number) this.tabBarBackground.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getTabLabelTextDefault() {
        return ((Number) this.tabLabelTextDefault.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getTabLabelTextFocused() {
        return ((Number) this.tabLabelTextFocused.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getTablerowBackgroundDefault() {
        return ((Number) this.tablerowBackgroundDefault.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getTablerowBackgroundPressed() {
        return ((Number) this.tablerowBackgroundPressed.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getTablerowIconColorDefault() {
        return ((Number) this.tablerowIconColorDefault.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getTextBrand() {
        return ((Number) this.textBrand.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getTextDefault() {
        return ((Number) this.textDefault.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getTextFeedbackCritical() {
        return ((Number) this.textFeedbackCritical.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getTextFeedbackInfo() {
        return ((Number) this.textFeedbackInfo.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getTextFeedbackPositive() {
        return ((Number) this.textFeedbackPositive.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getTextFeedbackWarning() {
        return ((Number) this.textFeedbackWarning.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getTextMuted() {
        return ((Number) this.textMuted.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getTextStrong() {
        return ((Number) this.textStrong.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getTextSubtle() {
        return ((Number) this.textSubtle.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getTextVoiceConnected() {
        return ((Number) this.textVoiceConnected.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getTextVoiceDisconnected() {
        return ((Number) this.textVoiceDisconnected.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getTextVoiceSpeaking() {
        return ((Number) this.textVoiceSpeaking.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getUserProfileAboutMeHeadingText() {
        return ((Number) this.userProfileAboutMeHeadingText.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getUserProfileContainerBackground() {
        return ((Number) this.userProfileContainerBackground.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getUserProfileGradientBackground() {
        return ((Number) this.userProfileGradientBackground.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getVoiceChannelUserLimitAccentBackground() {
        return ((Number) this.voiceChannelUserLimitAccentBackground.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getVoiceChannelUserLimitBackground() {
        return ((Number) this.voiceChannelUserLimitBackground.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getVoiceChannelUserLimitIcon() {
        return ((Number) this.voiceChannelUserLimitIcon.getValue()).intValue();
    }

    @Override // com.discord.theme.DarkTheme, com.discord.theme.DiscordThemeObject
    public int getVoiceChannelUserLimitText() {
        return ((Number) this.voiceChannelUserLimitText.getValue()).intValue();
    }
}
