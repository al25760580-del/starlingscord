package com.discord.emoji_picker;

import android.content.Context;
import ar.b0;
import ar.k0;
import com.discord.cache.Cache;
import com.discord.chat.presentation.message.view.m;
import com.discord.crash_reporting.CrashReporting;
import com.discord.emoji.UnicodeEmojis;
import com.discord.kvstorage.discordapp.DiscordMobileApi;
import com.discord.misc.utilities.coroutines.CollectWithLeadingDebounceKt;
import com.discord.misc.utilities.ids.IdUtilsKt;
import com.discord.misc.utilities.threading.ThreadUtilsKt;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.devsupport.StackTraceHelper;
import dr.z;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.d0;
import kotlin.collections.n0;
import kotlin.collections.s0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import lo.j;
import org.jetbrains.annotations.NotNull;
import xn.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000  2\u00020\u0001:\u0002\u001f B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0013\u001a\u00020\u0012H\u0007J\u0014\u0010\u0014\u001a\u00020\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u0007J\u000e\u0010\u0016\u001a\u00020\u0012H\u0082@¢\u0006\u0002\u0010\u0017J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002J\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001c\u001a\u00020\u001dH\u0082@¢\u0006\u0002\u0010\u001eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/discord/emoji_picker/EmojiPickerCache;", "", "listener", "Lcom/discord/emoji_picker/EmojiPickerCache$Listener;", "emojiCoreData", "Lcom/discord/emoji_picker/EmojiPickerItemData$CoreData;", "<init>", "(Lcom/discord/emoji_picker/EmojiPickerCache$Listener;Lcom/discord/emoji_picker/EmojiPickerItemData$CoreData;)V", "emojiPickerListener", "Ljava/lang/ref/WeakReference;", "emojiJsonConfig", "Lkotlinx/serialization/json/Json;", "emojiCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "emojiFetchJob", "Lkotlinx/coroutines/Job;", "emojiFetchEvents", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "", "invalidate", "refreshEmojis", "emojiCodeData", "refreshDatabaseEmojis", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "buildEmojis", "", "Lcom/discord/emoji_picker/EmojiPickerItem;", "buildEmojisUnicode", "context", "Landroid/content/Context;", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Listener", "Companion", "emoji_picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nEmojiPickerCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmojiPickerCache.kt\ncom/discord/emoji_picker/EmojiPickerCache\n+ 2 ThreadUtils.kt\ncom/discord/misc/utilities/threading/ThreadUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,190:1\n25#2,8:191\n1#3:199\n1#3:212\n1878#4,2:200\n1617#4,9:202\n1869#4:211\n1870#4:213\n1626#4:214\n1056#4:215\n1869#4,2:216\n1880#4:218\n1878#4,2:219\n1869#4,2:221\n1880#4:223\n*S KotlinDebug\n*F\n+ 1 EmojiPickerCache.kt\ncom/discord/emoji_picker/EmojiPickerCache\n*L\n70#1:191,8\n109#1:212\n90#1:200,2\n109#1:202,9\n109#1:211\n109#1:213\n109#1:214\n132#1:215\n137#1:216,2\n90#1:218\n160#1:219,2\n162#1:221,2\n160#1:223\n*E\n"})
public final class EmojiPickerCache {
    private static final long DEBOUNCE_INTERVAL = 3000;

    @NotNull
    private EmojiPickerItemData.CoreData emojiCoreData;

    @NotNull
    private final CoroutineScope emojiCoroutineScope;

    @NotNull
    private final MutableSharedFlow emojiFetchEvents;
    private Job emojiFetchJob;

    @NotNull
    private final Json emojiJsonConfig;

    @NotNull
    private final WeakReference<Listener> emojiPickerListener;

    /* JADX INFO: renamed from: com.discord.emoji_picker.EmojiPickerCache$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.emoji_picker.EmojiPickerCache$1", f = "EmojiPickerCache.kt", l = {42}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends h implements Function2<CoroutineScope, Continuation, Object> {
        int label;

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return EmojiPickerCache.this.new AnonymousClass1(continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                MutableSharedFlow mutableSharedFlow = EmojiPickerCache.this.emojiFetchEvents;
                final EmojiPickerCache emojiPickerCache = EmojiPickerCache.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.discord.emoji_picker.EmojiPickerCache.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Unit unit, Continuation continuation) {
                        Object objRefreshDatabaseEmojis = emojiPickerCache.refreshDatabaseEmojis(continuation);
                        return objRefreshDatabaseEmojis == wn.a.f22354d ? objRefreshDatabaseEmojis : Unit.f14616a;
                    }
                };
                this.label = 1;
                if (CollectWithLeadingDebounceKt.collectWithLeadingDebounce(mutableSharedFlow, EmojiPickerCache.DEBOUNCE_INTERVAL, flowCollector, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
            }
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H'J\b\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lcom/discord/emoji_picker/EmojiPickerCache$Listener;", "", "onEmojisUpdated", "", "emojis", "", "Lcom/discord/emoji_picker/EmojiPickerItem;", "emojisUnicode", "onContext", "Landroid/content/Context;", "emoji_picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Listener {
        @NotNull
        Context onContext();

        void onEmojisUpdated(@NotNull List<? extends EmojiPickerItem> emojis, @NotNull List<? extends EmojiPickerItem> emojisUnicode);
    }

    /* JADX INFO: renamed from: com.discord.emoji_picker.EmojiPickerCache$buildEmojisUnicode$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.emoji_picker.EmojiPickerCache", f = "EmojiPickerCache.kt", l = {156}, m = "buildEmojisUnicode")
    public static final class C01181 extends xn.c {
        int label;
        /* synthetic */ Object result;

        public C01181(Continuation continuation) {
            super(continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EmojiPickerCache.this.buildEmojisUnicode(null, this);
        }
    }

    /* JADX INFO: renamed from: com.discord.emoji_picker.EmojiPickerCache$refreshDatabaseEmojis$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.emoji_picker.EmojiPickerCache", f = "EmojiPickerCache.kt", l = {68}, m = "refreshDatabaseEmojis")
    public static final class C01191 extends xn.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C01191(Continuation continuation) {
            super(continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EmojiPickerCache.this.refreshDatabaseEmojis(this);
        }
    }

    public EmojiPickerCache(@NotNull Listener listener, @NotNull EmojiPickerItemData.CoreData emojiCoreData) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(emojiCoreData, "emojiCoreData");
        this.emojiCoreData = emojiCoreData;
        this.emojiPickerListener = new WeakReference<>(listener);
        this.emojiJsonConfig = ls.d.e(new com.discord.emoji.a(2));
        fr.d dVarB = b0.b(k0.f2938a);
        this.emojiCoroutineScope = dVarB;
        this.emojiFetchEvents = z.a(0, 1, cr.a.f7342d);
        this.emojiFetchJob = b0.t(dVarB, null, new AnonymousClass1(null), 3);
    }

    private final List<EmojiPickerItem> buildEmojis() {
        boolean z5;
        HashMap<String, ArrayList<String>> map;
        boolean z6;
        List listE0;
        boolean z7;
        EmojiPickerItem.Emoji emoji;
        boolean z10;
        ArrayList arrayList;
        try {
            HashMap<String, ArrayList<String>> guildEmojis = DiscordMobileApi.getGuildEmojis(a3.e.l("@account.", Cache.INSTANCE.get().getItem("_userIdKey")));
            Collection<ArrayList<String>> collectionValues = guildEmojis.values();
            Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
            Iterator<T> it = collectionValues.iterator();
            int size = 0;
            while (true) {
                z5 = true;
                if (!it.hasNext()) {
                    break;
                }
                size += ((ArrayList) it.next()).size() + 1;
            }
            ArrayList arrayList2 = new ArrayList(size);
            int i7 = 0;
            boolean z11 = false;
            for (Object obj : this.emojiCoreData.getNativeSectionsEmojis()) {
                int i10 = i7 + 1;
                if (i7 < 0) {
                    d0.k();
                    throw null;
                }
                EmojiPickerItemData.CoreData.NativeSection.Guild guild = (EmojiPickerItemData.CoreData.NativeSection.Guild) obj;
                if (guild.getHasPremiumInlineRoadblockHeader()) {
                    arrayList2.add(new EmojiPickerItem.PremiumInlineRoadblockHeader(a3.e.l("premium-inline-roadblock-header-", guild.getGuildId())));
                    z11 = z5;
                }
                arrayList2.add(new EmojiPickerItem.Category(guild.getGuildName(), Long.parseLong(guild.getGuildId()), z11));
                ArrayList<String> arrayList3 = guildEmojis.get(guild.getGuildId());
                if (arrayList3 != null) {
                    ArrayList arrayList4 = new ArrayList();
                    for (String str : arrayList3) {
                        Json json = this.emojiJsonConfig;
                        Intrinsics.checkNotNull(str);
                        JsonObject jsonObjectJ = pr.h.j(json.d(str));
                        Object obj2 = jsonObjectJ.get(StackTraceHelper.ID_KEY);
                        Intrinsics.checkNotNull(obj2);
                        long jL = pr.h.l(pr.h.k((JsonElement) obj2));
                        if (guild.getEmojisHidden().contains(Long.valueOf(jL))) {
                            z10 = z11;
                            arrayList = arrayList4;
                            emoji = null;
                        } else {
                            Object obj3 = jsonObjectJ.get(StackTraceHelper.NAME_KEY);
                            Intrinsics.checkNotNull(obj3);
                            String strA = pr.h.k((JsonElement) obj3).a();
                            Object obj4 = jsonObjectJ.get("animated");
                            Intrinsics.checkNotNull(obj4);
                            z10 = z11;
                            arrayList = arrayList4;
                            emoji = new EmojiPickerItem.Emoji(jL, strA, pr.h.e(pr.h.k((JsonElement) obj4)), EmojiPickerItem.Emoji.DisabledType.INSTANCE.create(guild.getIsNitroLocked() || guild.getEmojisDisabled().contains(Long.valueOf(jL)), guild.getIsNitroLocked()), null, z10, 16, null);
                        }
                        if (emoji != null) {
                            arrayList.add(emoji);
                        }
                        arrayList4 = arrayList;
                        z11 = z10;
                        guildEmojis = guildEmojis;
                    }
                    map = guildEmojis;
                    z6 = z11;
                    listE0 = CollectionsKt.e0(arrayList4, new Comparator() { // from class: com.discord.emoji_picker.EmojiPickerCache$buildEmojis$lambda$7$$inlined$sortedBy$1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.util.Comparator
                        public final int compare(T t5, T t10) {
                            return tn.a.a(((EmojiPickerItem.Emoji) t5).getName(), ((EmojiPickerItem.Emoji) t10).getName());
                        }
                    });
                } else {
                    map = guildEmojis;
                    z6 = z11;
                    listE0 = null;
                }
                if (listE0 != null) {
                    arrayList2.addAll(listE0);
                    z7 = false;
                } else {
                    z7 = false;
                    Iterator it2 = j.i(0, guild.getEmojiCount()).iterator();
                    while (((lo.b) it2).f15156i) {
                        arrayList2.add(new EmojiPickerItem.EmojiPlaceholder(((long) (i7 * 1000)) + ((long) ((s0) it2).nextInt())));
                    }
                }
                if (guild.getHasPremiumInlineRoadblockFooter()) {
                    arrayList2.add(new EmojiPickerItem.PremiumInlineRoadblockFooter(a3.e.l("premium-inline-roadblock-footer-", guild.getGuildId())));
                    z11 = z7;
                } else {
                    z11 = z6;
                }
                i7 = i10;
                guildEmojis = map;
                z5 = true;
            }
            return arrayList2;
        } catch (Exception e10) {
            CrashReporting.INSTANCE.captureMessage("Unable to read guild emojis from cache.", e10);
            return n0.f14659d;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object buildEmojisUnicode(Context context, Continuation continuation) {
        C01181 c01181;
        Object obj;
        if (continuation instanceof C01181) {
            c01181 = (C01181) continuation;
            int i7 = c01181.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                c01181.label = i7 - Integer.MIN_VALUE;
            } else {
                c01181 = new C01181(continuation);
            }
        } else {
            c01181 = new C01181(continuation);
        }
        Object objLoad = c01181.result;
        wn.a aVar = wn.a.f22354d;
        int i10 = c01181.label;
        if (i10 == 0) {
            ib.a.L(objLoad);
            UnicodeEmojis unicodeEmojis = UnicodeEmojis.INSTANCE;
            c01181.label = 1;
            objLoad = unicodeEmojis.load(context, c01181);
            if (objLoad == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ib.a.L(objLoad);
        }
        Map map = (Map) objLoad;
        Iterator it = map.values().iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((List) it.next()).size() + 1;
        }
        ArrayList arrayList = new ArrayList(size);
        int i11 = 0;
        for (Object obj2 : this.emojiCoreData.getNativeSectionsEmojisUnicode()) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                d0.k();
                throw null;
            }
            arrayList.add(new EmojiPickerItem.Category(((EmojiPickerItemData.CoreData.NativeSection.Unicode) obj2).getTitle(), 0L, false, 6, null));
            Set setKeySet = map.keySet();
            Intrinsics.checkNotNullParameter(setKeySet, "<this>");
            boolean z5 = setKeySet instanceof List;
            if (z5) {
                obj = ((List) setKeySet).get(i11);
            } else {
                m defaultValue = new m(i11, 1);
                Intrinsics.checkNotNullParameter(setKeySet, "<this>");
                Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
                if (z5) {
                    List list = (List) setKeySet;
                    if (i11 < 0 || i11 >= list.size()) {
                        defaultValue.invoke(Integer.valueOf(i11));
                        throw null;
                    }
                    obj = list.get(i11);
                } else {
                    if (i11 < 0) {
                        defaultValue.invoke(Integer.valueOf(i11));
                        throw null;
                    }
                    Iterator it2 = setKeySet.iterator();
                    int i13 = 0;
                    while (true) {
                        if (!it2.hasNext()) {
                            defaultValue.invoke(Integer.valueOf(i11));
                            throw null;
                        }
                        Object next = it2.next();
                        int i14 = i13 + 1;
                        if (i11 == i13) {
                            obj = next;
                            break;
                        }
                        i13 = i14;
                    }
                }
            }
            List<UnicodeEmojis.Emoji> list2 = (List) map.get(obj);
            if (list2 != null) {
                for (UnicodeEmojis.Emoji emoji : list2) {
                    arrayList.add(new EmojiPickerItem.Emoji(IdUtilsKt.convertToId((CharSequence) CollectionsKt.K(emoji.getNames())), (String) CollectionsKt.K(emoji.getNames()), false, null, emoji, false, 44, null));
                }
            }
            i11 = i12;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit emojiJsonConfig$lambda$0(JsonBuilder Json) {
        Intrinsics.checkNotNullParameter(Json, "$this$Json");
        Json.f14765b = true;
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object refreshDatabaseEmojis(Continuation continuation) {
        C01191 c01191;
        final List<EmojiPickerItem> list;
        if (continuation instanceof C01191) {
            c01191 = (C01191) continuation;
            int i7 = c01191.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                c01191.label = i7 - Integer.MIN_VALUE;
            } else {
                c01191 = new C01191(continuation);
            }
        } else {
            c01191 = new C01191(continuation);
        }
        Object objBuildEmojisUnicode = c01191.result;
        Object obj = wn.a.f22354d;
        int i10 = c01191.label;
        if (i10 == 0) {
            ib.a.L(objBuildEmojisUnicode);
            Listener listener = this.emojiPickerListener.get();
            Context contextOnContext = listener != null ? listener.onContext() : null;
            if (!(contextOnContext instanceof ReactContext)) {
                return Unit.f14616a;
            }
            List<EmojiPickerItem> listBuildEmojis = buildEmojis();
            c01191.L$0 = listBuildEmojis;
            c01191.label = 1;
            objBuildEmojisUnicode = buildEmojisUnicode(contextOnContext, c01191);
            if (objBuildEmojisUnicode == obj) {
                return obj;
            }
            list = listBuildEmojis;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) c01191.L$0;
            ib.a.L(objBuildEmojisUnicode);
        }
        final List<? extends EmojiPickerItem> list2 = (List) objBuildEmojisUnicode;
        if (ThreadUtilsKt.isOnMainThread()) {
            Listener listener2 = (Listener) this.emojiPickerListener.get();
            if (listener2 != null) {
                listener2.onEmojisUpdated(list, list2);
            }
        } else {
            ThreadUtilsKt.getUiHandler().post(new Runnable() { // from class: com.discord.emoji_picker.EmojiPickerCache$refreshDatabaseEmojis$$inlined$postOrRunOnMainThread$1
                @Override // java.lang.Runnable
                public final void run() {
                    EmojiPickerCache.Listener listener3 = (EmojiPickerCache.Listener) this.this$0.emojiPickerListener.get();
                    if (listener3 != null) {
                        listener3.onEmojisUpdated(list, list2);
                    }
                }
            });
        }
        return Unit.f14616a;
    }

    public static /* synthetic */ void refreshEmojis$default(EmojiPickerCache emojiPickerCache, EmojiPickerItemData.CoreData coreData, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            coreData = null;
        }
        emojiPickerCache.refreshEmojis(coreData);
    }

    public final void invalidate() {
        Job job = this.emojiFetchJob;
        if (job != null) {
            job.f(null);
        }
    }

    public final void refreshEmojis(EmojiPickerItemData.CoreData emojiCodeData) {
        if (emojiCodeData == null) {
            emojiCodeData = this.emojiCoreData;
        }
        this.emojiCoreData = emojiCodeData;
        if (emojiCodeData.getHasGuildData()) {
            this.emojiFetchEvents.d(Unit.f14616a);
        }
    }
}
