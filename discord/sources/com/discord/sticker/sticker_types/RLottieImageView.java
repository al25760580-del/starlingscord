package com.discord.sticker.sticker_types;

import a3.e;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import ar.b0;
import ar.k0;
import com.discord.image.animated_image.animated_image_utils.AnimatedImageStateManager;
import com.discord.misc.utilities.coroutines.AttachedViewCoroutineScope;
import com.discord.misc.utilities.coroutines.CoroutineViewUtilsKt;
import com.discord.rlottie.RLottieDrawable;
import com.discord.theme.ThemeManagerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import xn.d;
import xn.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nJ\u0010\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u0010J\b\u0010\u0011\u001a\u00020\fH\u0014J\b\u0010\u0012\u001a\u00020\fH\u0014J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/discord/sticker/sticker_types/RLottieImageView;", "Lcom/discord/rlottie/RLottieImageView;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "placeholder", "Landroid/graphics/drawable/ShapeDrawable;", "rLottieStateManager", "Lcom/discord/image/animated_image/animated_image_utils/AnimatedImageStateManager;", "Lcom/discord/sticker/sticker_types/RLottieImageView$Config;", "loadImage", "", "config", "recycle", "resetState", "", "onDetachedFromWindow", "onAttachedToWindow", "fetchSticker", "Config", "sticker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RLottieImageView extends com.discord.rlottie.RLottieImageView {

    @NotNull
    private final ShapeDrawable placeholder;

    @NotNull
    private final AnimatedImageStateManager<Config> rLottieStateManager;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u001a\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003JE\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012¨\u0006!"}, d2 = {"Lcom/discord/sticker/sticker_types/RLottieImageView$Config;", "", "url", "", "animate", "", "widthDp", "", "heightDp", "asset", "renderMode", "<init>", "(Ljava/lang/String;ZIILjava/lang/String;I)V", "getUrl", "()Ljava/lang/String;", "getAnimate", "()Z", "getWidthDp", "()I", "getHeightDp", "getAsset", "getRenderMode", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "sticker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Config {
        private final boolean animate;

        @NotNull
        private final String asset;
        private final int heightDp;
        private final int renderMode;

        @NotNull
        private final String url;
        private final int widthDp;

        public Config(@NotNull String url, boolean z5, int i7, int i10, @NotNull String asset, int i11) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(asset, "asset");
            this.url = url;
            this.animate = z5;
            this.widthDp = i7;
            this.heightDp = i10;
            this.asset = asset;
            this.renderMode = i11;
        }

        public static /* synthetic */ Config copy$default(Config config, String str, boolean z5, int i7, int i10, String str2, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = config.url;
            }
            if ((i12 & 2) != 0) {
                z5 = config.animate;
            }
            if ((i12 & 4) != 0) {
                i7 = config.widthDp;
            }
            if ((i12 & 8) != 0) {
                i10 = config.heightDp;
            }
            if ((i12 & 16) != 0) {
                str2 = config.asset;
            }
            if ((i12 & 32) != 0) {
                i11 = config.renderMode;
            }
            String str3 = str2;
            int i13 = i11;
            return config.copy(str, z5, i7, i10, str3, i13);
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
        public final int getWidthDp() {
            return this.widthDp;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final int getHeightDp() {
            return this.heightDp;
        }

        @NotNull
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getAsset() {
            return this.asset;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final int getRenderMode() {
            return this.renderMode;
        }

        @NotNull
        public final Config copy(@NotNull String url, boolean animate, int widthDp, int heightDp, @NotNull String asset, int renderMode) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(asset, "asset");
            return new Config(url, animate, widthDp, heightDp, asset, renderMode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Config)) {
                return false;
            }
            Config config = (Config) other;
            return Intrinsics.areEqual(this.url, config.url) && this.animate == config.animate && this.widthDp == config.widthDp && this.heightDp == config.heightDp && Intrinsics.areEqual(this.asset, config.asset) && this.renderMode == config.renderMode;
        }

        public final boolean getAnimate() {
            return this.animate;
        }

        @NotNull
        public final String getAsset() {
            return this.asset;
        }

        public final int getHeightDp() {
            return this.heightDp;
        }

        public final int getRenderMode() {
            return this.renderMode;
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        public final int getWidthDp() {
            return this.widthDp;
        }

        public int hashCode() {
            return Integer.hashCode(this.renderMode) + e.d(com.discord.chat.presentation.list.a.u(this.heightDp, com.discord.chat.presentation.list.a.u(this.widthDp, com.discord.chat.presentation.list.a.g(this.url.hashCode() * 31, 31, this.animate), 31), 31), 31, this.asset);
        }

        @NotNull
        public String toString() {
            String str = this.url;
            boolean z5 = this.animate;
            int i7 = this.widthDp;
            int i10 = this.heightDp;
            String str2 = this.asset;
            int i11 = this.renderMode;
            StringBuilder sb2 = new StringBuilder("Config(url=");
            sb2.append(str);
            sb2.append(", animate=");
            sb2.append(z5);
            sb2.append(", widthDp=");
            e.z(sb2, i7, ", heightDp=", i10, ", asset=");
            sb2.append(str2);
            sb2.append(", renderMode=");
            sb2.append(i11);
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* JADX INFO: renamed from: com.discord.sticker.sticker_types.RLottieImageView$fetchSticker$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @d(c = "com.discord.sticker.sticker_types.RLottieImageView$fetchSticker$1", f = "RLottieImageView.kt", l = {74, 84}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ Config $config;
        int label;

        /* JADX INFO: renamed from: com.discord.sticker.sticker_types.RLottieImageView$fetchSticker$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @d(c = "com.discord.sticker.sticker_types.RLottieImageView$fetchSticker$1$1", f = "RLottieImageView.kt", l = {}, m = "invokeSuspend")
        public static final class C00441 extends h implements Function2<CoroutineScope, Continuation, Object> {
            int label;
            final /* synthetic */ RLottieImageView this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00441(RLottieImageView rLottieImageView, Continuation continuation) {
                super(2, continuation);
                this.this$0 = rLottieImageView;
            }

            @Override // xn.a
            public final Continuation create(Object obj, Continuation continuation) {
                return new C00441(this.this$0, continuation);
            }

            @Override // xn.a
            public final Object invokeSuspend(Object obj) {
                wn.a aVar = wn.a.f22354d;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
                this.this$0.clearAnimation();
                return Unit.f14616a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((C00441) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Config config, Continuation continuation) {
            super(2, continuation);
            this.$config = config;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return RLottieImageView.this.new AnonymousClass1(this.$config, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x007c, code lost:
        
            if (r12.collect(r1, r11) == r0) goto L15;
         */
        @Override // xn.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                wn.a r0 = wn.a.f22354d
                int r1 = r11.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                ib.a.L(r12)
                goto L7f
            L10:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L18:
                ib.a.L(r12)
                goto L34
            L1c:
                ib.a.L(r12)
                hr.e r12 = ar.k0.f2938a
                br.d r12 = fr.q.f9394a
                com.discord.sticker.sticker_types.RLottieImageView$fetchSticker$1$1 r1 = new com.discord.sticker.sticker_types.RLottieImageView$fetchSticker$1$1
                com.discord.sticker.sticker_types.RLottieImageView r4 = com.discord.sticker.sticker_types.RLottieImageView.this
                r5 = 0
                r1.<init>(r4, r5)
                r11.label = r3
                java.lang.Object r12 = ar.b0.A(r12, r1, r11)
                if (r12 != r0) goto L34
                goto L7e
            L34:
                com.discord.file_downloader.FileDownloader r3 = com.discord.file_downloader.FileDownloader.INSTANCE
                com.discord.sticker.sticker_types.RLottieImageView r12 = com.discord.sticker.sticker_types.RLottieImageView.this
                android.content.Context r4 = r12.getContext()
                java.lang.String r12 = "getContext(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r12)
                com.discord.sticker.sticker_types.RLottieImageView$Config r12 = r11.$config
                java.lang.String r5 = r12.getUrl()
                com.discord.sticker.sticker_types.RLottieImageView$Config r12 = r11.$config
                java.lang.String r12 = r12.getAsset()
                java.lang.String r1 = ".json"
                java.lang.String r6 = kk.b.j(r12, r1)
                java.io.File r7 = new java.io.File
                com.discord.sticker.sticker_types.RLottieImageView r12 = com.discord.sticker.sticker_types.RLottieImageView.this
                android.content.Context r12 = r12.getContext()
                java.io.File r12 = r12.getCacheDir()
                java.lang.String r1 = "stickers"
                r7.<init>(r12, r1)
                r9 = 16
                r10 = 0
                r8 = 0
                kotlinx.coroutines.flow.Flow r12 = com.discord.file_downloader.FileDownloader.downloadFile$default(r3, r4, r5, r6, r7, r8, r9, r10)
                com.discord.sticker.sticker_types.RLottieImageView$fetchSticker$1$2 r1 = new com.discord.sticker.sticker_types.RLottieImageView$fetchSticker$1$2
                com.discord.sticker.sticker_types.RLottieImageView r3 = com.discord.sticker.sticker_types.RLottieImageView.this
                com.discord.sticker.sticker_types.RLottieImageView$Config r4 = r11.$config
                r1.<init>()
                r11.label = r2
                java.lang.Object r12 = r12.collect(r1, r11)
                if (r12 != r0) goto L7f
            L7e:
                return r0
            L7f:
                kotlin.Unit r12 = kotlin.Unit.f14616a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.discord.sticker.sticker_types.RLottieImageView.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RLottieImageView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setShape(new OvalShape());
        shapeDrawable.getPaint().setColor(ThemeManagerKt.getTheme().getBackgroundModMuted());
        this.placeholder = shapeDrawable;
        final int i7 = 0;
        Function0 function0 = new Function0(this) { // from class: com.discord.sticker.sticker_types.a

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ RLottieImageView f4589e;

            {
                this.f4589e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return RLottieImageView.rLottieStateManager$lambda$1(this.f4589e);
                    default:
                        return RLottieImageView.rLottieStateManager$lambda$2(this.f4589e);
                }
            }
        };
        final int i10 = 1;
        Function0 function1 = new Function0(this) { // from class: com.discord.sticker.sticker_types.a

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ RLottieImageView f4589e;

            {
                this.f4589e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return RLottieImageView.rLottieStateManager$lambda$1(this.f4589e);
                    default:
                        return RLottieImageView.rLottieStateManager$lambda$2(this.f4589e);
                }
            }
        };
        final int i11 = 0;
        Function1 function2 = new Function1(this) { // from class: com.discord.sticker.sticker_types.b

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ RLottieImageView f4591e;

            {
                this.f4591e = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i11) {
                    case 0:
                        return RLottieImageView.rLottieStateManager$lambda$3(this.f4591e, (RLottieImageView.Config) obj);
                    case 1:
                        return Boolean.valueOf(RLottieImageView.rLottieStateManager$lambda$4(this.f4591e, (RLottieImageView.Config) obj));
                    default:
                        return RLottieImageView.rLottieStateManager$lambda$5(this.f4591e, (RLottieImageView.Config) obj);
                }
            }
        };
        final int i12 = 1;
        Function1 function3 = new Function1(this) { // from class: com.discord.sticker.sticker_types.b

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ RLottieImageView f4591e;

            {
                this.f4591e = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i12) {
                    case 0:
                        return RLottieImageView.rLottieStateManager$lambda$3(this.f4591e, (RLottieImageView.Config) obj);
                    case 1:
                        return Boolean.valueOf(RLottieImageView.rLottieStateManager$lambda$4(this.f4591e, (RLottieImageView.Config) obj));
                    default:
                        return RLottieImageView.rLottieStateManager$lambda$5(this.f4591e, (RLottieImageView.Config) obj);
                }
            }
        };
        final int i13 = 2;
        this.rLottieStateManager = new AnimatedImageStateManager<>(function0, function1, null, function2, function3, new Function1(this) { // from class: com.discord.sticker.sticker_types.b

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ RLottieImageView f4591e;

            {
                this.f4591e = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i13) {
                    case 0:
                        return RLottieImageView.rLottieStateManager$lambda$3(this.f4591e, (RLottieImageView.Config) obj);
                    case 1:
                        return Boolean.valueOf(RLottieImageView.rLottieStateManager$lambda$4(this.f4591e, (RLottieImageView.Config) obj));
                    default:
                        return RLottieImageView.rLottieStateManager$lambda$5(this.f4591e, (RLottieImageView.Config) obj);
                }
            }
        }, 4, null);
    }

    private final void fetchSticker(Config config) {
        AttachedViewCoroutineScope attachedScope = CoroutineViewUtilsKt.getAttachedScope(this);
        hr.e eVar = k0.f2938a;
        b0.t(attachedScope, hr.d.f11103i, new AnonymousClass1(config, null), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit rLottieStateManager$lambda$1(RLottieImageView rLottieImageView) {
        rLottieImageView.playAnimation();
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit rLottieStateManager$lambda$2(RLottieImageView rLottieImageView) {
        rLottieImageView.pauseAnimation();
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit rLottieStateManager$lambda$3(RLottieImageView rLottieImageView, Config it) {
        Intrinsics.checkNotNullParameter(it, "it");
        rLottieImageView.recycle(false);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean rLottieStateManager$lambda$4(RLottieImageView rLottieImageView, Config it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return rLottieImageView.isAttachedToWindow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit rLottieStateManager$lambda$5(RLottieImageView rLottieImageView, Config config) {
        Intrinsics.checkNotNullParameter(config, "config");
        rLottieImageView.fetchSticker(config);
        return Unit.f14616a;
    }

    public static /* synthetic */ void recycle$default(RLottieImageView rLottieImageView, boolean z5, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z5 = false;
        }
        rLottieImageView.recycle(z5);
    }

    public final void loadImage(@NotNull Config config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.rLottieStateManager.onTryFetch(config);
    }

    @Override // com.discord.rlottie.RLottieImageView, android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.rLottieStateManager.onAttachedToWindow();
    }

    @Override // com.discord.rlottie.RLottieImageView, android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.rLottieStateManager.onDetachedFromWindow();
    }

    public final void recycle(boolean resetState) {
        Drawable drawable = getDrawable();
        if (drawable instanceof RLottieDrawable) {
            RLottieDrawable rLottieDrawable = (RLottieDrawable) drawable;
            rLottieDrawable.stop();
            rLottieDrawable.recycle();
        }
        setImageDrawable(null);
        if (resetState) {
            this.rLottieStateManager.reset();
        }
        setBackground(this.placeholder);
    }
}
