package com.discord.emoji;

import a3.e;
import android.content.Context;
import ar.b0;
import ar.k0;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import jr.b;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.w0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kr.f;
import ls.d;
import or.e1;
import or.s1;
import org.jetbrains.annotations.NotNull;
import pc.r;
import qr.i;
import qr.p;
import rn.l;
import rn.m;
import xn.c;
import xn.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0013\u0014B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0086@¢\u0006\u0002\u0010\u0010J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u000fH\u0082@¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\tX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/discord/emoji/UnicodeEmojis;", "", "<init>", "()V", "emojiJsonParser", "Lkotlinx/serialization/json/Json;", "emojiLoadingMutex", "Lkotlinx/coroutines/sync/Mutex;", "emojis", "", "", "", "Lcom/discord/emoji/UnicodeEmojis$Emoji;", "load", "context", "Landroid/content/Context;", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadData", "Lcom/discord/emoji/UnicodeEmojis$EmojiCategories;", "EmojiCategories", "Emoji", "emoji_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUnicodeEmojis.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnicodeEmojis.kt\ncom/discord/emoji/UnicodeEmojis\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,68:1\n116#2,10:69\n*S KotlinDebug\n*F\n+ 1 UnicodeEmojis.kt\ncom/discord/emoji/UnicodeEmojis\n*L\n22#1:69,10\n*E\n"})
public final class UnicodeEmojis {

    @NotNull
    public static final UnicodeEmojis INSTANCE = new UnicodeEmojis();

    @NotNull
    private static final Json emojiJsonParser = d.e(new a(1));

    @NotNull
    private static final Mutex emojiLoadingMutex = new b();
    private static Map<String, ? extends List<Emoji>> emojis;

    @f
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002!\"B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B5\b\u0010\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\fJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0004HÆ\u0003J#\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\tHÖ\u0001J\t\u0010\u0018\u001a\u00020\u0004HÖ\u0001J%\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0001¢\u0006\u0002\b R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006#"}, d2 = {"Lcom/discord/emoji/UnicodeEmojis$Emoji;", "", "names", "", "", "surrogates", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getNames", "()Ljava/util/List;", "getSurrogates", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$emoji_release", "$serializer", "Companion", "emoji_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Emoji {

        @NotNull
        private final List<String> names;

        @NotNull
        private final String surrogates;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private static final Lazy[] $childSerializers = {l.a(m.f19486e, new com.discord.crash_reporting.d(1)), null};

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/emoji/UnicodeEmojis$Emoji$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/emoji/UnicodeEmojis$Emoji;", "emoji_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return UnicodeEmojis$Emoji$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ Emoji(int i7, List list, String str, SerializationConstructorMarker serializationConstructorMarker) {
            if (3 != (i7 & 3)) {
                e1.l(i7, 3, UnicodeEmojis$Emoji$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.names = list;
            this.surrogates = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new or.d(s1.f17602a, 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Emoji copy$default(Emoji emoji, List list, String str, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                list = emoji.names;
            }
            if ((i7 & 2) != 0) {
                str = emoji.surrogates;
            }
            return emoji.copy(list, str);
        }

        public static final /* synthetic */ void write$Self$emoji_release(Emoji self, CompositeEncoder output, SerialDescriptor serialDesc) {
            output.g(serialDesc, 0, (KSerializer) $childSerializers[0].getValue(), self.names);
            output.q(serialDesc, 1, self.surrogates);
        }

        @NotNull
        public final List<String> component1() {
            return this.names;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getSurrogates() {
            return this.surrogates;
        }

        @NotNull
        public final Emoji copy(@NotNull List<String> names, @NotNull String surrogates) {
            Intrinsics.checkNotNullParameter(names, "names");
            Intrinsics.checkNotNullParameter(surrogates, "surrogates");
            return new Emoji(names, surrogates);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Emoji)) {
                return false;
            }
            Emoji emoji = (Emoji) other;
            return Intrinsics.areEqual(this.names, emoji.names) && Intrinsics.areEqual(this.surrogates, emoji.surrogates);
        }

        @NotNull
        public final List<String> getNames() {
            return this.names;
        }

        @NotNull
        public final String getSurrogates() {
            return this.surrogates;
        }

        public int hashCode() {
            return this.surrogates.hashCode() + (this.names.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "Emoji(names=" + this.names + ", surrogates=" + this.surrogates + ")";
        }

        public Emoji(@NotNull List<String> names, @NotNull String surrogates) {
            Intrinsics.checkNotNullParameter(names, "names");
            Intrinsics.checkNotNullParameter(surrogates, "surrogates");
            this.names = names;
            this.surrogates = surrogates;
        }
    }

    @f
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000256Bw\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\f\u0010\rB\u009b\u0001\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\f\u0010\u0012J\u0018\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u001dJ\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0089\u0001\u0010'\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\u000fHÖ\u0001J\t\u0010,\u001a\u00020\u001eHÖ\u0001J%\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u00002\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u000203H\u0001¢\u0006\u0002\b4R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014¨\u00067"}, d2 = {"Lcom/discord/emoji/UnicodeEmojis$EmojiCategories;", "", "people", "", "Lcom/discord/emoji/UnicodeEmojis$Emoji;", "nature", "food", "activity", "travel", "objects", "symbols", "flags", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getPeople", "()Ljava/util/List;", "getNature", "getFood", "getActivity", "getTravel", "getObjects", "getSymbols", "getFlags", "toMap", "", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$emoji_release", "$serializer", "Companion", "emoji_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class EmojiCategories {

        @NotNull
        private static final Lazy[] $childSerializers;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final List<Emoji> activity;

        @NotNull
        private final List<Emoji> flags;

        @NotNull
        private final List<Emoji> food;

        @NotNull
        private final List<Emoji> nature;

        @NotNull
        private final List<Emoji> objects;

        @NotNull
        private final List<Emoji> people;

        @NotNull
        private final List<Emoji> symbols;

        @NotNull
        private final List<Emoji> travel;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/emoji/UnicodeEmojis$EmojiCategories$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/emoji/UnicodeEmojis$EmojiCategories;", "emoji_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return UnicodeEmojis$EmojiCategories$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            m mVar = m.f19486e;
            $childSerializers = new Lazy[]{l.a(mVar, new com.discord.crash_reporting.d(2)), l.a(mVar, new com.discord.crash_reporting.d(3)), l.a(mVar, new com.discord.crash_reporting.d(4)), l.a(mVar, new com.discord.crash_reporting.d(5)), l.a(mVar, new com.discord.crash_reporting.d(6)), l.a(mVar, new com.discord.crash_reporting.d(7)), l.a(mVar, new com.discord.crash_reporting.d(8)), l.a(mVar, new com.discord.crash_reporting.d(9))};
        }

        public /* synthetic */ EmojiCategories(int i7, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, SerializationConstructorMarker serializationConstructorMarker) {
            if (255 != (i7 & 255)) {
                e1.l(i7, 255, UnicodeEmojis$EmojiCategories$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.people = list;
            this.nature = list2;
            this.food = list3;
            this.activity = list4;
            this.travel = list5;
            this.objects = list6;
            this.symbols = list7;
            this.flags = list8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new or.d(UnicodeEmojis$Emoji$$serializer.INSTANCE, 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
            return new or.d(UnicodeEmojis$Emoji$$serializer.INSTANCE, 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
            return new or.d(UnicodeEmojis$Emoji$$serializer.INSTANCE, 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$2() {
            return new or.d(UnicodeEmojis$Emoji$$serializer.INSTANCE, 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$3() {
            return new or.d(UnicodeEmojis$Emoji$$serializer.INSTANCE, 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$4() {
            return new or.d(UnicodeEmojis$Emoji$$serializer.INSTANCE, 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$5() {
            return new or.d(UnicodeEmojis$Emoji$$serializer.INSTANCE, 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$6() {
            return new or.d(UnicodeEmojis$Emoji$$serializer.INSTANCE, 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ EmojiCategories copy$default(EmojiCategories emojiCategories, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                list = emojiCategories.people;
            }
            if ((i7 & 2) != 0) {
                list2 = emojiCategories.nature;
            }
            if ((i7 & 4) != 0) {
                list3 = emojiCategories.food;
            }
            if ((i7 & 8) != 0) {
                list4 = emojiCategories.activity;
            }
            if ((i7 & 16) != 0) {
                list5 = emojiCategories.travel;
            }
            if ((i7 & 32) != 0) {
                list6 = emojiCategories.objects;
            }
            if ((i7 & 64) != 0) {
                list7 = emojiCategories.symbols;
            }
            if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
                list8 = emojiCategories.flags;
            }
            List list9 = list7;
            List list10 = list8;
            List list11 = list5;
            List list12 = list6;
            return emojiCategories.copy(list, list2, list3, list4, list11, list12, list9, list10);
        }

        public static final /* synthetic */ void write$Self$emoji_release(EmojiCategories self, CompositeEncoder output, SerialDescriptor serialDesc) {
            Lazy[] lazyArr = $childSerializers;
            output.g(serialDesc, 0, (KSerializer) lazyArr[0].getValue(), self.people);
            output.g(serialDesc, 1, (KSerializer) lazyArr[1].getValue(), self.nature);
            output.g(serialDesc, 2, (KSerializer) lazyArr[2].getValue(), self.food);
            output.g(serialDesc, 3, (KSerializer) lazyArr[3].getValue(), self.activity);
            output.g(serialDesc, 4, (KSerializer) lazyArr[4].getValue(), self.travel);
            output.g(serialDesc, 5, (KSerializer) lazyArr[5].getValue(), self.objects);
            output.g(serialDesc, 6, (KSerializer) lazyArr[6].getValue(), self.symbols);
            output.g(serialDesc, 7, (KSerializer) lazyArr[7].getValue(), self.flags);
        }

        @NotNull
        public final List<Emoji> component1() {
            return this.people;
        }

        @NotNull
        public final List<Emoji> component2() {
            return this.nature;
        }

        @NotNull
        public final List<Emoji> component3() {
            return this.food;
        }

        @NotNull
        public final List<Emoji> component4() {
            return this.activity;
        }

        @NotNull
        public final List<Emoji> component5() {
            return this.travel;
        }

        @NotNull
        public final List<Emoji> component6() {
            return this.objects;
        }

        @NotNull
        public final List<Emoji> component7() {
            return this.symbols;
        }

        @NotNull
        public final List<Emoji> component8() {
            return this.flags;
        }

        @NotNull
        public final EmojiCategories copy(@NotNull List<Emoji> people, @NotNull List<Emoji> nature, @NotNull List<Emoji> food, @NotNull List<Emoji> activity, @NotNull List<Emoji> travel, @NotNull List<Emoji> objects, @NotNull List<Emoji> symbols, @NotNull List<Emoji> flags) {
            Intrinsics.checkNotNullParameter(people, "people");
            Intrinsics.checkNotNullParameter(nature, "nature");
            Intrinsics.checkNotNullParameter(food, "food");
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(travel, "travel");
            Intrinsics.checkNotNullParameter(objects, "objects");
            Intrinsics.checkNotNullParameter(symbols, "symbols");
            Intrinsics.checkNotNullParameter(flags, "flags");
            return new EmojiCategories(people, nature, food, activity, travel, objects, symbols, flags);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EmojiCategories)) {
                return false;
            }
            EmojiCategories emojiCategories = (EmojiCategories) other;
            return Intrinsics.areEqual(this.people, emojiCategories.people) && Intrinsics.areEqual(this.nature, emojiCategories.nature) && Intrinsics.areEqual(this.food, emojiCategories.food) && Intrinsics.areEqual(this.activity, emojiCategories.activity) && Intrinsics.areEqual(this.travel, emojiCategories.travel) && Intrinsics.areEqual(this.objects, emojiCategories.objects) && Intrinsics.areEqual(this.symbols, emojiCategories.symbols) && Intrinsics.areEqual(this.flags, emojiCategories.flags);
        }

        @NotNull
        public final List<Emoji> getActivity() {
            return this.activity;
        }

        @NotNull
        public final List<Emoji> getFlags() {
            return this.flags;
        }

        @NotNull
        public final List<Emoji> getFood() {
            return this.food;
        }

        @NotNull
        public final List<Emoji> getNature() {
            return this.nature;
        }

        @NotNull
        public final List<Emoji> getObjects() {
            return this.objects;
        }

        @NotNull
        public final List<Emoji> getPeople() {
            return this.people;
        }

        @NotNull
        public final List<Emoji> getSymbols() {
            return this.symbols;
        }

        @NotNull
        public final List<Emoji> getTravel() {
            return this.travel;
        }

        public int hashCode() {
            return this.flags.hashCode() + e.f(this.symbols, e.f(this.objects, e.f(this.travel, e.f(this.activity, e.f(this.food, e.f(this.nature, this.people.hashCode() * 31, 31), 31), 31), 31), 31), 31);
        }

        @NotNull
        public final Map<String, List<Emoji>> toMap() {
            return w0.g(new Pair("people", this.people), new Pair("nature", this.nature), new Pair("food", this.food), new Pair("activity", this.activity), new Pair("travel", this.travel), new Pair("objects", this.objects), new Pair("symbols", this.symbols), new Pair("flags", this.flags));
        }

        @NotNull
        public String toString() {
            return "EmojiCategories(people=" + this.people + ", nature=" + this.nature + ", food=" + this.food + ", activity=" + this.activity + ", travel=" + this.travel + ", objects=" + this.objects + ", symbols=" + this.symbols + ", flags=" + this.flags + ")";
        }

        public EmojiCategories(@NotNull List<Emoji> people, @NotNull List<Emoji> nature, @NotNull List<Emoji> food, @NotNull List<Emoji> activity, @NotNull List<Emoji> travel, @NotNull List<Emoji> objects, @NotNull List<Emoji> symbols, @NotNull List<Emoji> flags) {
            Intrinsics.checkNotNullParameter(people, "people");
            Intrinsics.checkNotNullParameter(nature, "nature");
            Intrinsics.checkNotNullParameter(food, "food");
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(travel, "travel");
            Intrinsics.checkNotNullParameter(objects, "objects");
            Intrinsics.checkNotNullParameter(symbols, "symbols");
            Intrinsics.checkNotNullParameter(flags, "flags");
            this.people = people;
            this.nature = nature;
            this.food = food;
            this.activity = activity;
            this.travel = travel;
            this.objects = objects;
            this.symbols = symbols;
            this.flags = flags;
        }
    }

    /* JADX INFO: renamed from: com.discord.emoji.UnicodeEmojis$load$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.emoji.UnicodeEmojis", f = "UnicodeEmojis.kt", l = {74, 24}, m = "load")
    public static final class AnonymousClass1 extends c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UnicodeEmojis.this.load(null, this);
        }
    }

    /* JADX INFO: renamed from: com.discord.emoji.UnicodeEmojis$loadData$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/discord/emoji/UnicodeEmojis$EmojiCategories;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.emoji.UnicodeEmojis$loadData$2", f = "UnicodeEmojis.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension({"SMAP\nUnicodeEmojis.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnicodeEmojis.kt\ncom/discord/emoji/UnicodeEmojis$loadData$2\n+ 2 JvmStreams.kt\nkotlinx/serialization/json/JvmStreamsKt\n*L\n1#1,68:1\n80#2:69\n*S KotlinDebug\n*F\n+ 1 UnicodeEmojis.kt\ncom/discord/emoji/UnicodeEmojis$loadData$2\n*L\n34#1:69\n*E\n"})
    public static final class AnonymousClass2 extends h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ Context $context;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Context context, Continuation continuation) {
            super(2, continuation);
            this.$context = context;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.$context, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            wn.a aVar = wn.a.f22354d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ib.a.L(obj);
            InputStream inputStreamOpenRawResource = this.$context.getResources().openRawResource(R.raw.emojis_json);
            try {
                GZIPInputStream stream = new GZIPInputStream(inputStreamOpenRawResource);
                try {
                    Json json = UnicodeEmojis.emojiJsonParser;
                    json.getClass();
                    KSerializer deserializer = EmojiCategories.INSTANCE.serializer();
                    Intrinsics.checkNotNullParameter(json, "<this>");
                    Intrinsics.checkNotNullParameter(deserializer, "deserializer");
                    Intrinsics.checkNotNullParameter(stream, "stream");
                    Intrinsics.checkNotNullParameter(stream, "stream");
                    r rVar = new r();
                    rVar.f17922d = new i(stream, Charsets.UTF_8);
                    try {
                        Object objJ = p.j(json, deserializer, rVar);
                        rVar.m();
                        EmojiCategories emojiCategories = (EmojiCategories) objJ;
                        stream.close();
                        d.k(inputStreamOpenRawResource, null);
                        return emojiCategories;
                    } catch (Throwable th2) {
                        rVar.m();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        d.k(stream, th3);
                        throw th4;
                    }
                }
            } catch (Throwable th5) {
                try {
                    throw th5;
                } catch (Throwable th6) {
                    d.k(inputStreamOpenRawResource, th5);
                    throw th6;
                }
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    private UnicodeEmojis() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit emojiJsonParser$lambda$0(JsonBuilder Json) {
        Intrinsics.checkNotNullParameter(Json, "$this$Json");
        Json.f14765b = true;
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object loadData(Context context, Continuation continuation) {
        hr.e eVar = k0.f2938a;
        return b0.A(hr.d.f11103i, new AnonymousClass2(context, null), continuation);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0082 A[Catch: all -> 0x002f, TRY_LEAVE, TryCatch #1 {all -> 0x002f, blocks: (B:13:0x002b, B:29:0x006f, B:33:0x007e, B:35:0x0082), top: B:43:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object load(@NotNull Context context, @NotNull Continuation continuation) {
        AnonymousClass1 anonymousClass1;
        Mutex mutex;
        Throwable th2;
        Mutex mutex2;
        Map<String, ? extends List<Emoji>> map;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i7 = anonymousClass1.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i7 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object obj = anonymousClass1.result;
        wn.a aVar = wn.a.f22354d;
        int i10 = anonymousClass1.label;
        try {
            if (i10 == 0) {
                ib.a.L(obj);
                mutex = emojiLoadingMutex;
                anonymousClass1.L$0 = context;
                anonymousClass1.L$1 = mutex;
                anonymousClass1.label = 1;
                if (mutex.a(anonymousClass1) != aVar) {
                }
                return aVar;
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutex2 = (Mutex) anonymousClass1.L$0;
                try {
                    ib.a.L(obj);
                    emojis = ((EmojiCategories) obj).toMap();
                    map = emojis;
                    if (map == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("emojis");
                        map = null;
                    }
                    mutex2.b(null);
                    return map;
                } catch (Throwable th3) {
                    th2 = th3;
                    mutex2.b(null);
                    throw th2;
                }
            }
            Mutex mutex3 = (Mutex) anonymousClass1.L$1;
            Context context2 = (Context) anonymousClass1.L$0;
            ib.a.L(obj);
            mutex = mutex3;
            context = context2;
            if (emojis == null) {
                UnicodeEmojis unicodeEmojis = INSTANCE;
                anonymousClass1.L$0 = mutex;
                anonymousClass1.L$1 = null;
                anonymousClass1.label = 2;
                Object objLoadData = unicodeEmojis.loadData(context, anonymousClass1);
                if (objLoadData != aVar) {
                    Mutex mutex4 = mutex;
                    obj = objLoadData;
                    mutex2 = mutex4;
                    emojis = ((EmojiCategories) obj).toMap();
                }
                return aVar;
            }
            mutex2 = mutex;
            map = emojis;
            if (map == null) {
                Intrinsics.throwUninitializedPropertyAccessException("emojis");
                map = null;
            }
            mutex2.b(null);
            return map;
        } catch (Throwable th4) {
            Mutex mutex5 = mutex;
            th2 = th4;
            mutex2 = mutex5;
            mutex2.b(null);
            throw th2;
        }
    }
}
