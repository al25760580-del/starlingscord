package com.discord.chat.input.views;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.collection.LruCache;
import ar.b0;
import com.discord.misc.utilities.chat_view_types.ChatViewRecyclerTypes;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import xn.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\nJ\"\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\n2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00120\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/discord/chat/input/views/ChatInputLeadingIconLoader;", "", "context", "Landroid/content/Context;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "(Landroid/content/Context;Lkotlinx/coroutines/CoroutineScope;)V", "cache", "Landroidx/collection/LruCache;", "", "Landroid/graphics/Bitmap;", "inFlightUrls", "", "failedUrls", "cachedBitmap", "url", "load", "", "onLoaded", "Lkotlin/Function1;", "chat_input_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ChatInputLeadingIconLoader {

    @NotNull
    private final LruCache cache;

    @NotNull
    private final Context context;

    @NotNull
    private final Set<String> failedUrls;

    @NotNull
    private final Set<String> inFlightUrls;

    @NotNull
    private final CoroutineScope scope;

    /* JADX INFO: renamed from: com.discord.chat.input.views.ChatInputLeadingIconLoader$load$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.chat.input.views.ChatInputLeadingIconLoader$load$1", f = "ChatInputLeadingIconLoader.kt", l = {48, ChatViewRecyclerTypes.GUILD_PROFILE_INVITE}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ Function1<Bitmap, Unit> $onLoaded;
        final /* synthetic */ String $url;
        int label;

        /* JADX INFO: renamed from: com.discord.chat.input.views.ChatInputLeadingIconLoader$load$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @xn.d(c = "com.discord.chat.input.views.ChatInputLeadingIconLoader$load$1$1", f = "ChatInputLeadingIconLoader.kt", l = {}, m = "invokeSuspend")
        public static final class C00201 extends h implements Function2<CoroutineScope, Continuation, Object> {
            final /* synthetic */ Bitmap $bitmap;
            final /* synthetic */ Function1<Bitmap, Unit> $onLoaded;
            final /* synthetic */ String $url;
            int label;
            final /* synthetic */ ChatInputLeadingIconLoader this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C00201(ChatInputLeadingIconLoader chatInputLeadingIconLoader, String str, Bitmap bitmap, Function1<? super Bitmap, Unit> function1, Continuation continuation) {
                super(2, continuation);
                this.this$0 = chatInputLeadingIconLoader;
                this.$url = str;
                this.$bitmap = bitmap;
                this.$onLoaded = function1;
            }

            @Override // xn.a
            public final Continuation create(Object obj, Continuation continuation) {
                return new C00201(this.this$0, this.$url, this.$bitmap, this.$onLoaded, continuation);
            }

            @Override // xn.a
            public final Object invokeSuspend(Object obj) {
                wn.a aVar = wn.a.f22354d;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
                this.this$0.cache.b(this.$url, this.$bitmap);
                this.$onLoaded.invoke(this.$bitmap);
                return Unit.f14616a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((C00201) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(String str, Function1<? super Bitmap, Unit> function1, Continuation continuation) {
            super(2, continuation);
            this.$url = str;
            this.$onLoaded = function1;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return ChatInputLeadingIconLoader.this.new AnonymousClass1(this.$url, this.$onLoaded, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x006d, code lost:
        
            if (ar.b0.A(r1, r9, r15) == r0) goto L25;
         */
        @Override // xn.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r16) {
            /*
                r15 = this;
                wn.a r0 = wn.a.f22354d
                int r1 = r15.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L20
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                ib.a.L(r16)     // Catch: java.lang.Throwable -> L10
                goto L70
            L10:
                r0 = move-exception
                goto L7e
            L12:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L1a:
                ib.a.L(r16)     // Catch: java.lang.Throwable -> L10
                r1 = r16
                goto L39
            L20:
                ib.a.L(r16)
                com.discord.chat.input.views.ChatInputLeadingIconLoader r1 = com.discord.chat.input.views.ChatInputLeadingIconLoader.this     // Catch: java.lang.Throwable -> L10
                android.content.Context r4 = com.discord.chat.input.views.ChatInputLeadingIconLoader.access$getContext$p(r1)     // Catch: java.lang.Throwable -> L10
                java.lang.String r5 = r15.$url     // Catch: java.lang.Throwable -> L10
                r15.label = r3     // Catch: java.lang.Throwable -> L10
                r6 = 0
                r7 = 1
                r9 = 2
                r10 = 0
                r8 = r15
                java.lang.Object r1 = com.discord.image.fresco.FrescoFetchDecodedImageKt.fetchDecodedImage$default(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L10
                if (r1 != r0) goto L39
                goto L6f
            L39:
                r12 = r1
                android.graphics.Bitmap r12 = (android.graphics.Bitmap) r12     // Catch: java.lang.Throwable -> L10
                if (r12 != 0) goto L57
                com.discord.chat.input.views.ChatInputLeadingIconLoader r0 = com.discord.chat.input.views.ChatInputLeadingIconLoader.this     // Catch: java.lang.Throwable -> L10
                java.util.Set r0 = com.discord.chat.input.views.ChatInputLeadingIconLoader.access$getFailedUrls$p(r0)     // Catch: java.lang.Throwable -> L10
                java.lang.String r1 = r15.$url     // Catch: java.lang.Throwable -> L10
                r0.add(r1)     // Catch: java.lang.Throwable -> L10
                kotlin.Unit r0 = kotlin.Unit.f14616a     // Catch: java.lang.Throwable -> L10
                com.discord.chat.input.views.ChatInputLeadingIconLoader r1 = com.discord.chat.input.views.ChatInputLeadingIconLoader.this
                java.util.Set r1 = com.discord.chat.input.views.ChatInputLeadingIconLoader.access$getInFlightUrls$p(r1)
                java.lang.String r2 = r15.$url
                r1.remove(r2)
                return r0
            L57:
                hr.e r1 = ar.k0.f2938a     // Catch: java.lang.Throwable -> L10
                br.d r1 = fr.q.f9394a     // Catch: java.lang.Throwable -> L10
                com.discord.chat.input.views.ChatInputLeadingIconLoader$load$1$1 r9 = new com.discord.chat.input.views.ChatInputLeadingIconLoader$load$1$1     // Catch: java.lang.Throwable -> L10
                com.discord.chat.input.views.ChatInputLeadingIconLoader r10 = com.discord.chat.input.views.ChatInputLeadingIconLoader.this     // Catch: java.lang.Throwable -> L10
                java.lang.String r11 = r15.$url     // Catch: java.lang.Throwable -> L10
                kotlin.jvm.functions.Function1<android.graphics.Bitmap, kotlin.Unit> r13 = r15.$onLoaded     // Catch: java.lang.Throwable -> L10
                r14 = 0
                r9.<init>(r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> L10
                r15.label = r2     // Catch: java.lang.Throwable -> L10
                java.lang.Object r1 = ar.b0.A(r1, r9, r15)     // Catch: java.lang.Throwable -> L10
                if (r1 != r0) goto L70
            L6f:
                return r0
            L70:
                com.discord.chat.input.views.ChatInputLeadingIconLoader r0 = com.discord.chat.input.views.ChatInputLeadingIconLoader.this
                java.util.Set r0 = com.discord.chat.input.views.ChatInputLeadingIconLoader.access$getInFlightUrls$p(r0)
                java.lang.String r1 = r15.$url
                r0.remove(r1)
                kotlin.Unit r0 = kotlin.Unit.f14616a
                return r0
            L7e:
                com.discord.chat.input.views.ChatInputLeadingIconLoader r1 = com.discord.chat.input.views.ChatInputLeadingIconLoader.this
                java.util.Set r1 = com.discord.chat.input.views.ChatInputLeadingIconLoader.access$getInFlightUrls$p(r1)
                java.lang.String r2 = r15.$url
                r1.remove(r2)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.input.views.ChatInputLeadingIconLoader.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    public ChatInputLeadingIconLoader(@NotNull Context context, @NotNull CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.context = context;
        this.scope = scope;
        this.cache = new LruCache(32);
        this.inFlightUrls = new LinkedHashSet();
        this.failedUrls = new LinkedHashSet();
    }

    public final Bitmap cachedBitmap(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return (Bitmap) this.cache.a(url);
    }

    public final void load(@NotNull String url, @NotNull Function1<? super Bitmap, Unit> onLoaded) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(onLoaded, "onLoaded");
        if (this.failedUrls.contains(url) || !this.inFlightUrls.add(url)) {
            return;
        }
        b0.t(this.scope, null, new AnonymousClass1(url, onLoaded, null), 3);
    }
}
