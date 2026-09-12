package com.discord.image.animated_image.apng;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.y;
import ar.b0;
import ar.k0;
import com.discord.file_downloader.FileDownloader;
import com.discord.image.animated_image.animated_image_utils.AnimatedImageStateManager;
import com.discord.misc.utilities.coroutines.AttachedViewCoroutineScope;
import com.discord.misc.utilities.coroutines.CoroutineViewUtilsKt;
import com.linecorp.apng.ApngDrawable;
import hr.e;
import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import xn.d;
import xn.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 (2\u00020\u0001:\u0002()B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\r\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\fJ\r\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\fJ\u0015\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\nJ!\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0017\u0010\fJ\u000f\u0010\u0018\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0018\u0010\fJ\u0015\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cR0\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\b\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00060%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006*"}, d2 = {"Lcom/discord/image/animated_image/apng/APNGView;", "Landroidx/appcompat/widget/y;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcom/discord/image/animated_image/apng/APNGView$Config;", "config", "", "fetchAPNG", "(Lcom/discord/image/animated_image/apng/APNGView$Config;)V", "playApngAnimation", "()V", "pauseApngAnimation", "stopApngAnimation", "play", "pause", "loadImage", "", "resetState", "showLoading", "recycle", "(ZZ)V", "onDetachedFromWindow", "onAttachedToWindow", "", "positionMillis", "seek", "(J)V", "Lkotlin/Function1;", "", "onImageLoaded", "Lkotlin/jvm/functions/Function1;", "getOnImageLoaded", "()Lkotlin/jvm/functions/Function1;", "setOnImageLoaded", "(Lkotlin/jvm/functions/Function1;)V", "Lcom/discord/image/animated_image/animated_image_utils/AnimatedImageStateManager;", "apngStateManager", "Lcom/discord/image/animated_image/animated_image_utils/AnimatedImageStateManager;", "Companion", "Config", "animated_image_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class APNGView extends y {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final AnimatedImageStateManager<Config> apngStateManager;
    private Function1<? super String, Unit> onImageLoaded;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J$\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005¨\u0006\u000f"}, d2 = {"Lcom/discord/image/animated_image/apng/APNGView$Companion;", "", "<init>", "()V", "getFilename", "", "url", "hasFilename", "", "downloadFile", "Lkotlinx/coroutines/flow/Flow;", "Lcom/discord/file_downloader/DownloadState;", "context", "Landroid/content/Context;", "cacheDirectory", "animated_image_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nAPNGView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 APNGView.kt\ncom/discord/image/animated_image/apng/APNGView$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,174:1\n12897#2,3:175\n*S KotlinDebug\n*F\n+ 1 APNGView.kt\ncom/discord/image/animated_image/apng/APNGView$Companion\n*L\n149#1:175,3\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean hasFilename(String url) {
            return !StringsKt.K(getFilename(url));
        }

        @NotNull
        public final Flow downloadFile(@NotNull Context context, @NotNull String url, @NotNull String cacheDirectory) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(cacheDirectory, "cacheDirectory");
            return FileDownloader.downloadFile$default(FileDownloader.INSTANCE, context, url, getFilename(url), new File(context.getCacheDir(), cacheDirectory), false, 16, null);
        }

        @NotNull
        public final String getFilename(@NotNull String url) throws NoSuchAlgorithmException {
            Intrinsics.checkNotNullParameter(url, "url");
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] bytes = url.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            byte[] bArrDigest = messageDigest.digest(bytes);
            Intrinsics.checkNotNullExpressionValue(bArrDigest, "digest(...)");
            String strJ = "";
            for (byte b10 : bArrDigest) {
                String str = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b10)}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                strJ = kk.b.j(strJ, str);
            }
            return strJ;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.discord.image.animated_image.apng.APNGView$fetchAPNG$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @d(c = "com.discord.image.animated_image.apng.APNGView$fetchAPNG$1", f = "APNGView.kt", l = {87}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ Config $config;
        int label;

        /* JADX INFO: renamed from: com.discord.image.animated_image.apng.APNGView$fetchAPNG$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class C00321<T> implements FlowCollector {
            final /* synthetic */ Config $config;
            final /* synthetic */ APNGView this$0;

            /* JADX INFO: renamed from: com.discord.image.animated_image.apng.APNGView$fetchAPNG$1$1$1, reason: invalid class name and collision with other inner class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
            @d(c = "com.discord.image.animated_image.apng.APNGView$fetchAPNG$1$1$1", f = "APNGView.kt", l = {}, m = "invokeSuspend")
            public static final class C00331 extends h implements Function2<CoroutineScope, Continuation, Object> {
                final /* synthetic */ Config $config;
                final /* synthetic */ ApngDrawable $drawable;
                int label;
                final /* synthetic */ APNGView this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00331(APNGView aPNGView, ApngDrawable apngDrawable, Config config, Continuation continuation) {
                    super(2, continuation);
                    this.this$0 = aPNGView;
                    this.$drawable = apngDrawable;
                    this.$config = config;
                }

                @Override // xn.a
                public final Continuation create(Object obj, Continuation continuation) {
                    return new C00331(this.this$0, this.$drawable, this.$config, continuation);
                }

                @Override // xn.a
                public final Object invokeSuspend(Object obj) {
                    wn.a aVar = wn.a.f22354d;
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ib.a.L(obj);
                    this.this$0.setImageDrawable(null);
                    this.this$0.setImageDrawable(this.$drawable);
                    this.this$0.setBackground(null);
                    this.this$0.apngStateManager.onFetchFinished(true, this.$config.getAnimate());
                    Function1<String, Unit> onImageLoaded = this.this$0.getOnImageLoaded();
                    if (onImageLoaded == null) {
                        return null;
                    }
                    onImageLoaded.invoke(this.$config.getUrl());
                    return Unit.f14616a;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((C00331) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
                }
            }

            /* JADX INFO: renamed from: com.discord.image.animated_image.apng.APNGView$fetchAPNG$1$1$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
            @d(c = "com.discord.image.animated_image.apng.APNGView$fetchAPNG$1$1$2", f = "APNGView.kt", l = {}, m = "invokeSuspend")
            public static final class AnonymousClass2 extends h implements Function2<CoroutineScope, Continuation, Object> {
                int label;
                final /* synthetic */ APNGView this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(APNGView aPNGView, Continuation continuation) {
                    super(2, continuation);
                    this.this$0 = aPNGView;
                }

                @Override // xn.a
                public final Continuation create(Object obj, Continuation continuation) {
                    return new AnonymousClass2(this.this$0, continuation);
                }

                @Override // xn.a
                public final Object invokeSuspend(Object obj) {
                    wn.a aVar = wn.a.f22354d;
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ib.a.L(obj);
                    return Boolean.valueOf(AnimatedImageStateManager.onFetchFinished$default(this.this$0.apngStateManager, false, false, 2, null));
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
                }
            }

            /* JADX INFO: renamed from: com.discord.image.animated_image.apng.APNGView$fetchAPNG$1$1$3, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
            @d(c = "com.discord.image.animated_image.apng.APNGView$fetchAPNG$1$1$3", f = "APNGView.kt", l = {}, m = "invokeSuspend")
            public static final class AnonymousClass3 extends h implements Function2<CoroutineScope, Continuation, Object> {
                int label;
                final /* synthetic */ APNGView this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass3(APNGView aPNGView, Continuation continuation) {
                    super(2, continuation);
                    this.this$0 = aPNGView;
                }

                @Override // xn.a
                public final Continuation create(Object obj, Continuation continuation) {
                    return new AnonymousClass3(this.this$0, continuation);
                }

                @Override // xn.a
                public final Object invokeSuspend(Object obj) {
                    wn.a aVar = wn.a.f22354d;
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ib.a.L(obj);
                    AnimatedImageStateManager.onFetchFinished$default(this.this$0.apngStateManager, false, false, 2, null);
                    return Unit.f14616a;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
                }
            }

            public C00321(APNGView aPNGView, Config config) {
                this.this$0 = aPNGView;
                this.$config = config;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x0064, code lost:
            
                if (ar.b0.A(r10, r2, r0) == r1) goto L31;
             */
            /* JADX WARN: Code restructure failed: missing block: B:25:0x0078, code lost:
            
                if (ar.b0.A(r9, r10, r0) == r1) goto L31;
             */
            /* JADX WARN: Code restructure failed: missing block: B:30:0x0090, code lost:
            
                if (ar.b0.A(r9, r10, r0) == r1) goto L31;
             */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(com.discord.file_downloader.DownloadState r9, kotlin.coroutines.Continuation r10) {
                /*
                    r8 = this;
                    boolean r0 = r10 instanceof com.discord.image.animated_image.apng.APNGView$fetchAPNG$1$1$emit$1
                    if (r0 == 0) goto L13
                    r0 = r10
                    com.discord.image.animated_image.apng.APNGView$fetchAPNG$1$1$emit$1 r0 = (com.discord.image.animated_image.apng.APNGView$fetchAPNG$1$1$emit$1) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L18
                L13:
                    com.discord.image.animated_image.apng.APNGView$fetchAPNG$1$1$emit$1 r0 = new com.discord.image.animated_image.apng.APNGView$fetchAPNG$1$1$emit$1
                    r0.<init>(r8, r10)
                L18:
                    java.lang.Object r10 = r0.result
                    wn.a r1 = wn.a.f22354d
                    int r2 = r0.label
                    r3 = 3
                    r4 = 2
                    r5 = 1
                    r6 = 0
                    if (r2 == 0) goto L3e
                    if (r2 == r5) goto L3a
                    if (r2 == r4) goto L36
                    if (r2 != r3) goto L2e
                    ib.a.L(r10)
                    goto L93
                L2e:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r10)
                    throw r9
                L36:
                    ib.a.L(r10)
                    goto L96
                L3a:
                    ib.a.L(r10)     // Catch: java.lang.Exception -> L67
                    goto L96
                L3e:
                    ib.a.L(r10)
                    boolean r10 = r9 instanceof com.discord.file_downloader.DownloadState.Completed
                    if (r10 == 0) goto L7b
                    int r10 = com.linecorp.apng.ApngDrawable.L     // Catch: java.lang.Exception -> L67
                    com.discord.file_downloader.DownloadState$Completed r9 = (com.discord.file_downloader.DownloadState.Completed) r9     // Catch: java.lang.Exception -> L67
                    java.io.File r9 = r9.getFile()     // Catch: java.lang.Exception -> L67
                    com.linecorp.apng.ApngDrawable r9 = nk.b.a(r9)     // Catch: java.lang.Exception -> L67
                    hr.e r10 = ar.k0.f2938a     // Catch: java.lang.Exception -> L67
                    br.d r10 = fr.q.f9394a     // Catch: java.lang.Exception -> L67
                    com.discord.image.animated_image.apng.APNGView$fetchAPNG$1$1$1 r2 = new com.discord.image.animated_image.apng.APNGView$fetchAPNG$1$1$1     // Catch: java.lang.Exception -> L67
                    com.discord.image.animated_image.apng.APNGView r3 = r8.this$0     // Catch: java.lang.Exception -> L67
                    com.discord.image.animated_image.apng.APNGView$Config r7 = r8.$config     // Catch: java.lang.Exception -> L67
                    r2.<init>(r3, r9, r7, r6)     // Catch: java.lang.Exception -> L67
                    r0.label = r5     // Catch: java.lang.Exception -> L67
                    java.lang.Object r9 = ar.b0.A(r10, r2, r0)     // Catch: java.lang.Exception -> L67
                    if (r9 != r1) goto L96
                    goto L92
                L67:
                    hr.e r9 = ar.k0.f2938a
                    br.d r9 = fr.q.f9394a
                    com.discord.image.animated_image.apng.APNGView$fetchAPNG$1$1$2 r10 = new com.discord.image.animated_image.apng.APNGView$fetchAPNG$1$1$2
                    com.discord.image.animated_image.apng.APNGView r2 = r8.this$0
                    r10.<init>(r2, r6)
                    r0.label = r4
                    java.lang.Object r9 = ar.b0.A(r9, r10, r0)
                    if (r9 != r1) goto L96
                    goto L92
                L7b:
                    boolean r9 = r9 instanceof com.discord.file_downloader.DownloadState.Failure
                    if (r9 == 0) goto L96
                    hr.e r9 = ar.k0.f2938a
                    br.d r9 = fr.q.f9394a
                    com.discord.image.animated_image.apng.APNGView$fetchAPNG$1$1$3 r10 = new com.discord.image.animated_image.apng.APNGView$fetchAPNG$1$1$3
                    com.discord.image.animated_image.apng.APNGView r2 = r8.this$0
                    r10.<init>(r2, r6)
                    r0.label = r3
                    java.lang.Object r9 = ar.b0.A(r9, r10, r0)
                    if (r9 != r1) goto L93
                L92:
                    return r1
                L93:
                    kotlin.Unit r9 = kotlin.Unit.f14616a
                    return r9
                L96:
                    kotlin.Unit r9 = kotlin.Unit.f14616a
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: com.discord.image.animated_image.apng.APNGView.AnonymousClass1.C00321.emit(com.discord.file_downloader.DownloadState, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Config config, Continuation continuation) {
            super(2, continuation);
            this.$config = config;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return APNGView.this.new AnonymousClass1(this.$config, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                Companion companion = APNGView.INSTANCE;
                Context context = APNGView.this.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                Flow flowDownloadFile = companion.downloadFile(context, this.$config.getUrl(), this.$config.getCacheDirectory());
                C00321 c00321 = new C00321(APNGView.this, this.$config);
                this.label = 1;
                if (flowDownloadFile.collect(c00321, this) == aVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public APNGView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        final int i7 = 0;
        Function0 function0 = new Function0(this) { // from class: com.discord.image.animated_image.apng.a

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ APNGView f4397e;

            {
                this.f4397e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return APNGView.apngStateManager$lambda$0(this.f4397e);
                    case 1:
                        return APNGView.apngStateManager$lambda$1(this.f4397e);
                    default:
                        return APNGView.apngStateManager$lambda$2(this.f4397e);
                }
            }
        };
        final int i10 = 1;
        Function0 function1 = new Function0(this) { // from class: com.discord.image.animated_image.apng.a

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ APNGView f4397e;

            {
                this.f4397e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return APNGView.apngStateManager$lambda$0(this.f4397e);
                    case 1:
                        return APNGView.apngStateManager$lambda$1(this.f4397e);
                    default:
                        return APNGView.apngStateManager$lambda$2(this.f4397e);
                }
            }
        };
        final int i11 = 2;
        Function0 function2 = new Function0(this) { // from class: com.discord.image.animated_image.apng.a

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ APNGView f4397e;

            {
                this.f4397e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return APNGView.apngStateManager$lambda$0(this.f4397e);
                    case 1:
                        return APNGView.apngStateManager$lambda$1(this.f4397e);
                    default:
                        return APNGView.apngStateManager$lambda$2(this.f4397e);
                }
            }
        };
        final int i12 = 0;
        Function1 function3 = new Function1(this) { // from class: com.discord.image.animated_image.apng.b

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ APNGView f4399e;

            {
                this.f4399e = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i12) {
                    case 0:
                        return APNGView.apngStateManager$lambda$3(this.f4399e, (APNGView.Config) obj);
                    case 1:
                        return Boolean.valueOf(APNGView.apngStateManager$lambda$4(this.f4399e, (APNGView.Config) obj));
                    default:
                        return APNGView.apngStateManager$lambda$5(this.f4399e, (APNGView.Config) obj);
                }
            }
        };
        final int i13 = 1;
        Function1 function4 = new Function1(this) { // from class: com.discord.image.animated_image.apng.b

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ APNGView f4399e;

            {
                this.f4399e = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i13) {
                    case 0:
                        return APNGView.apngStateManager$lambda$3(this.f4399e, (APNGView.Config) obj);
                    case 1:
                        return Boolean.valueOf(APNGView.apngStateManager$lambda$4(this.f4399e, (APNGView.Config) obj));
                    default:
                        return APNGView.apngStateManager$lambda$5(this.f4399e, (APNGView.Config) obj);
                }
            }
        };
        final int i14 = 2;
        this.apngStateManager = new AnimatedImageStateManager<>(function0, function1, function2, function3, function4, new Function1(this) { // from class: com.discord.image.animated_image.apng.b

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ APNGView f4399e;

            {
                this.f4399e = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i14) {
                    case 0:
                        return APNGView.apngStateManager$lambda$3(this.f4399e, (APNGView.Config) obj);
                    case 1:
                        return Boolean.valueOf(APNGView.apngStateManager$lambda$4(this.f4399e, (APNGView.Config) obj));
                    default:
                        return APNGView.apngStateManager$lambda$5(this.f4399e, (APNGView.Config) obj);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit apngStateManager$lambda$0(APNGView aPNGView) {
        aPNGView.playApngAnimation();
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit apngStateManager$lambda$1(APNGView aPNGView) {
        aPNGView.pauseApngAnimation();
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit apngStateManager$lambda$2(APNGView aPNGView) {
        aPNGView.stopApngAnimation();
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit apngStateManager$lambda$3(APNGView aPNGView, Config config) {
        Intrinsics.checkNotNullParameter(config, "<unused var>");
        recycle$default(aPNGView, false, false, 2, null);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean apngStateManager$lambda$4(APNGView aPNGView, Config config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return aPNGView.isAttachedToWindow() && INSTANCE.hasFilename(config.getUrl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit apngStateManager$lambda$5(APNGView aPNGView, Config config) {
        Intrinsics.checkNotNullParameter(config, "config");
        aPNGView.fetchAPNG(config);
        return Unit.f14616a;
    }

    private final void fetchAPNG(Config config) {
        AttachedViewCoroutineScope attachedViewCoroutineScopeAttachedScope = CoroutineViewUtilsKt.attachedScope(this, true);
        e eVar = k0.f2938a;
        b0.t(attachedViewCoroutineScopeAttachedScope, hr.d.f11103i, new AnonymousClass1(config, null), 2);
    }

    private final void pauseApngAnimation() {
        Drawable drawable = getDrawable();
        ApngDrawable apngDrawable = drawable instanceof ApngDrawable ? (ApngDrawable) drawable : null;
        if (apngDrawable != null) {
            apngDrawable.stop();
        }
    }

    private final void playApngAnimation() {
        Drawable drawable = getDrawable();
        ApngDrawable apngDrawable = drawable instanceof ApngDrawable ? (ApngDrawable) drawable : null;
        if (apngDrawable != null) {
            apngDrawable.start();
        }
    }

    public static /* synthetic */ void recycle$default(APNGView aPNGView, boolean z5, boolean z6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z5 = false;
        }
        if ((i7 & 2) != 0) {
            z6 = false;
        }
        aPNGView.recycle(z5, z6);
    }

    private final void stopApngAnimation() {
        Drawable drawable = getDrawable();
        ApngDrawable apngDrawable = drawable instanceof ApngDrawable ? (ApngDrawable) drawable : null;
        if (apngDrawable != null) {
            apngDrawable.stop();
            apngDrawable.K = null;
            apngDrawable.J = 0L;
            apngDrawable.invalidateSelf();
        }
    }

    public final Function1<String, Unit> getOnImageLoaded() {
        return this.onImageLoaded;
    }

    public final void loadImage(@NotNull Config config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.apngStateManager.onTryFetch(config);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.apngStateManager.onAttachedToWindow();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.apngStateManager.onDetachedFromWindow();
    }

    public final void pause() {
        this.apngStateManager.pause();
    }

    public final void play() {
        this.apngStateManager.play();
    }

    public final void recycle(boolean resetState, boolean showLoading) {
        Drawable drawable = getDrawable();
        if (drawable instanceof ApngDrawable) {
            ApngDrawable apngDrawable = (ApngDrawable) drawable;
            apngDrawable.stop();
            apngDrawable.f6868d.f16954a.recycle();
        }
        setImageDrawable(null);
        if (resetState) {
            this.apngStateManager.reset();
        }
        if (showLoading) {
            setBackground(null);
        }
    }

    public final void seek(long positionMillis) {
        Drawable drawable = getDrawable();
        ApngDrawable apngDrawable = drawable instanceof ApngDrawable ? (ApngDrawable) drawable : null;
        if (apngDrawable != null) {
            if (positionMillis < 0) {
                throw new IllegalArgumentException("positionMillis must be positive value");
            }
            apngDrawable.K = null;
            apngDrawable.J = positionMillis;
            apngDrawable.invalidateSelf();
        }
    }

    public final void setOnImageLoaded(Function1<? super String, Unit> function1) {
        this.onImageLoaded = function1;
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001b\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0013J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003JN\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020\u00052\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\bHÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006#"}, d2 = {"Lcom/discord/image/animated_image/apng/APNGView$Config;", "", "url", "", "animate", "", "showLoading", "widthDp", "", "heightDp", "cacheDirectory", "<init>", "(Ljava/lang/String;ZZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "getAnimate", "()Z", "getShowLoading", "getWidthDp", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getHeightDp", "getCacheDirectory", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;ZZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lcom/discord/image/animated_image/apng/APNGView$Config;", "equals", "other", "hashCode", "toString", "animated_image_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Config {
        private final boolean animate;

        @NotNull
        private final String cacheDirectory;
        private final Integer heightDp;
        private final boolean showLoading;

        @NotNull
        private final String url;
        private final Integer widthDp;

        public Config(@NotNull String url, boolean z5, boolean z6, Integer num, Integer num2, @NotNull String cacheDirectory) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(cacheDirectory, "cacheDirectory");
            this.url = url;
            this.animate = z5;
            this.showLoading = z6;
            this.widthDp = num;
            this.heightDp = num2;
            this.cacheDirectory = cacheDirectory;
        }

        public static /* synthetic */ Config copy$default(Config config, String str, boolean z5, boolean z6, Integer num, Integer num2, String str2, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = config.url;
            }
            if ((i7 & 2) != 0) {
                z5 = config.animate;
            }
            if ((i7 & 4) != 0) {
                z6 = config.showLoading;
            }
            if ((i7 & 8) != 0) {
                num = config.widthDp;
            }
            if ((i7 & 16) != 0) {
                num2 = config.heightDp;
            }
            if ((i7 & 32) != 0) {
                str2 = config.cacheDirectory;
            }
            Integer num3 = num2;
            String str3 = str2;
            return config.copy(str, z5, z6, num, num3, str3);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getAnimate() {
            return this.animate;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getShowLoading() {
            return this.showLoading;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Integer getWidthDp() {
            return this.widthDp;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final Integer getHeightDp() {
            return this.heightDp;
        }

        @NotNull
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getCacheDirectory() {
            return this.cacheDirectory;
        }

        @NotNull
        public final Config copy(@NotNull String url, boolean animate, boolean showLoading, Integer widthDp, Integer heightDp, @NotNull String cacheDirectory) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(cacheDirectory, "cacheDirectory");
            return new Config(url, animate, showLoading, widthDp, heightDp, cacheDirectory);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Config)) {
                return false;
            }
            Config config = (Config) other;
            return Intrinsics.areEqual(this.url, config.url) && this.animate == config.animate && this.showLoading == config.showLoading && Intrinsics.areEqual(this.widthDp, config.widthDp) && Intrinsics.areEqual(this.heightDp, config.heightDp) && Intrinsics.areEqual(this.cacheDirectory, config.cacheDirectory);
        }

        public final boolean getAnimate() {
            return this.animate;
        }

        @NotNull
        public final String getCacheDirectory() {
            return this.cacheDirectory;
        }

        public final Integer getHeightDp() {
            return this.heightDp;
        }

        public final boolean getShowLoading() {
            return this.showLoading;
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        public final Integer getWidthDp() {
            return this.widthDp;
        }

        public int hashCode() {
            int iG = com.discord.chat.presentation.list.a.g(com.discord.chat.presentation.list.a.g(this.url.hashCode() * 31, 31, this.animate), 31, this.showLoading);
            Integer num = this.widthDp;
            int iHashCode = (iG + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.heightDp;
            return this.cacheDirectory.hashCode() + ((iHashCode + (num2 != null ? num2.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            return "Config(url=" + this.url + ", animate=" + this.animate + ", showLoading=" + this.showLoading + ", widthDp=" + this.widthDp + ", heightDp=" + this.heightDp + ", cacheDirectory=" + this.cacheDirectory + ")";
        }

        public /* synthetic */ Config(String str, boolean z5, boolean z6, Integer num, Integer num2, String str2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, z5, (i7 & 4) != 0 ? true : z6, num, num2, str2);
        }
    }
}
