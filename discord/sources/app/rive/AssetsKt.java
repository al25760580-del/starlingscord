package app.rive;

import app.rive.core.CommandQueue;
import com.facebook.react.devsupport.StackTraceHelper;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import mf.f;
import org.jetbrains.annotations.NotNull;
import u.b;
import u.c;
import u.i;
import u.l;
import u.o;
import u.q;
import u.w;
import xn.d;
import xn.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\u001a)\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a1\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u00012\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a)\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00052\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u000e\u0010\b\u001a1\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u00052\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u00012\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u000f\u0010\f\u001a)\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00052\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0011\u0010\b\u001a1\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u00052\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u00012\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0013\u0010\f\u001a\u007f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u000e\b\u0000\u0010\u0015*\b\u0012\u0004\u0012\u00028\u00010\u0014\"\u0004\b\u0001\u0010\u00162\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u00012\u0006\u0010\u0004\u001a\u00020\u000322\u0010\u001a\u001a.\b\u0001\u0012\b\u0012\u00060\u0000j\u0002`\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00172\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0003¢\u0006\u0004\b\u001b\u0010\u001c\"\u0014\u0010\u001d\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e\"\u0014\u0010\u001f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u001e\"\u0014\u0010 \u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u001e¨\u0006!"}, d2 = {"Lapp/rive/core/CommandQueue;", "Lapp/rive/core/RiveWorker;", "riveWorker", "", "bytes", "Lapp/rive/Result;", "Lapp/rive/ImageAsset;", "rememberImage", "(Lapp/rive/core/CommandQueue;[BLu/c;I)Lapp/rive/Result;", "", "key", "rememberRegisteredImage", "(Lapp/rive/core/CommandQueue;Ljava/lang/String;[BLu/c;I)Lapp/rive/Result;", "Lapp/rive/AudioAsset;", "rememberAudio", "rememberRegisteredAudio", "Lapp/rive/FontAsset;", "rememberFont", StackTraceHelper.NAME_KEY, "rememberRegisteredFont", "Lapp/rive/Asset;", "T", "H", "Lkotlin/Function3;", "Lkotlin/coroutines/Continuation;", "", "constructFn", "rememberAsset", "(Lapp/rive/core/CommandQueue;[BLkotlin/jvm/functions/Function3;Ljava/lang/String;Lu/c;II)Lapp/rive/Result;", "IMAGE_TAG", "Ljava/lang/String;", "AUDIO_TAG", "FONT_TAG", "kotlin_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAssets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Assets.kt\napp/rive/AssetsKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,432:1\n1282#2,6:433\n1282#2,6:439\n1282#2,6:445\n1282#2,6:451\n1282#2,6:457\n1282#2,6:463\n*S KotlinDebug\n*F\n+ 1 Assets.kt\napp/rive/AssetsKt\n*L\n280#1:433,6\n303#1:439,6\n324#1:445,6\n347#1:451,6\n368#1:457,6\n391#1:463,6\n*E\n"})
public final class AssetsKt {

    @NotNull
    private static final String AUDIO_TAG = "Rive/Audio";

    @NotNull
    private static final String FONT_TAG = "Rive/Font";

    @NotNull
    private static final String IMAGE_TAG = "Rive/Image";

    /* JADX INFO: renamed from: app.rive.AssetsKt$rememberAsset$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0000\"\u0004\b\u0001\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lapp/rive/Asset;", "T", "H", "Lu/o;", "Lapp/rive/Result;", "", "<anonymous>", "(Lu/o;)V"}, k = 3, mv = {1, 9, 0})
    @d(c = "app.rive.AssetsKt$rememberAsset$1", f = "Assets.kt", l = {415, 423}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends h implements Function2<o, Continuation, Object> {
        final /* synthetic */ byte[] $bytes;
        final /* synthetic */ Function3 $constructFn;
        final /* synthetic */ String $key;
        final /* synthetic */ CommandQueue $riveWorker;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Function3 function3, CommandQueue commandQueue, byte[] bArr, String str, Continuation continuation) {
            super(2, continuation);
            this.$constructFn = function3;
            this.$riveWorker = commandQueue;
            this.$bytes = bArr;
            this.$key = str;
        }

        @Override // xn.a
        @NotNull
        public final Continuation create(Object obj, @NotNull Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$constructFn, this.$riveWorker, this.$bytes, this.$key, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // xn.a
        public final Object invokeSuspend(@NotNull Object obj) {
            o oVar;
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                oVar = (o) this.L$0;
                Function3 function3 = this.$constructFn;
                CommandQueue commandQueue = this.$riveWorker;
                byte[] bArr = this.$bytes;
                this.L$0 = oVar;
                this.label = 1;
                obj = function3.invoke(commandQueue, bArr, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ib.a.L(obj);
                    throw new rn.h();
                }
                oVar = (o) this.L$0;
                ib.a.L(obj);
            }
            final Result result = (Result) obj;
            if (this.$key != null && (result instanceof Result.Success)) {
                ((Asset) ((Result.Success) result).getValue()).register(this.$key);
            }
            q qVar = (q) oVar;
            qVar.setValue(result);
            final String str = this.$key;
            Function0<Unit> function0 = new Function0<Unit>() { // from class: app.rive.AssetsKt.rememberAsset.1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m9invoke();
                    return Unit.f14616a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m9invoke() {
                    Object obj2 = result;
                    if (obj2 instanceof Result.Success) {
                        if (str != null) {
                            ((Asset) ((Result.Success) obj2).getValue()).unregister(str);
                        }
                        ((Asset) ((Result.Success) result).getValue()).close();
                    }
                }
            };
            this.L$0 = null;
            this.label = 2;
            qVar.a(function0, this);
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull o oVar, Continuation continuation) {
            return ((AnonymousClass1) create(oVar, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    private static final <T extends Asset<H>, H> Result<T> rememberAsset(CommandQueue commandQueue, byte[] bArr, Function3 function3, String str, c cVar, int i7, int i10) {
        cVar.d();
        String str2 = (i10 & 8) != 0 ? null : str;
        Result.Loading loading = Result.Loading.INSTANCE;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(function3, commandQueue, bArr, str2, null);
        Object objA = cVar.a();
        i iVar = b.f20883a;
        if (objA == iVar) {
            objA = f.C(loading);
            cVar.g();
        }
        l lVar = (l) objA;
        boolean zB = cVar.b();
        Object objA2 = cVar.a();
        if (zB || objA2 == iVar) {
            objA2 = new w(anonymousClass1, lVar, null, 1);
            cVar.g();
        }
        throw null;
    }

    @NotNull
    public static final Result<AudioAsset> rememberAudio(@NotNull CommandQueue riveWorker, @NotNull byte[] bytes, c cVar, int i7) {
        Intrinsics.checkNotNullParameter(riveWorker, "riveWorker");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        cVar.d();
        AudioAsset.Companion companion = AudioAsset.INSTANCE;
        cVar.d();
        Object objA = cVar.a();
        if (objA == b.f20883a) {
            objA = new AssetsKt$rememberAudio$1$1(companion);
            cVar.g();
        }
        cVar.k();
        Result<AudioAsset> resultRememberAsset = rememberAsset(riveWorker, bytes, (Function3) ((KFunction) objA), null, cVar, 584, 8);
        cVar.k();
        return resultRememberAsset;
    }

    @NotNull
    public static final Result<FontAsset> rememberFont(@NotNull CommandQueue riveWorker, @NotNull byte[] bytes, c cVar, int i7) {
        Intrinsics.checkNotNullParameter(riveWorker, "riveWorker");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        cVar.d();
        FontAsset.Companion companion = FontAsset.INSTANCE;
        cVar.d();
        Object objA = cVar.a();
        if (objA == b.f20883a) {
            objA = new AssetsKt$rememberFont$1$1(companion);
            cVar.g();
        }
        cVar.k();
        Result<FontAsset> resultRememberAsset = rememberAsset(riveWorker, bytes, (Function3) ((KFunction) objA), null, cVar, 584, 8);
        cVar.k();
        return resultRememberAsset;
    }

    @NotNull
    public static final Result<ImageAsset> rememberImage(@NotNull CommandQueue riveWorker, @NotNull byte[] bytes, c cVar, int i7) {
        Intrinsics.checkNotNullParameter(riveWorker, "riveWorker");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        cVar.d();
        ImageAsset.Companion companion = ImageAsset.INSTANCE;
        cVar.d();
        Object objA = cVar.a();
        if (objA == b.f20883a) {
            objA = new AssetsKt$rememberImage$1$1(companion);
            cVar.g();
        }
        cVar.k();
        Result<ImageAsset> resultRememberAsset = rememberAsset(riveWorker, bytes, (Function3) ((KFunction) objA), null, cVar, 584, 8);
        cVar.k();
        return resultRememberAsset;
    }

    @NotNull
    public static final Result<AudioAsset> rememberRegisteredAudio(@NotNull CommandQueue riveWorker, @NotNull String key, @NotNull byte[] bytes, c cVar, int i7) {
        Intrinsics.checkNotNullParameter(riveWorker, "riveWorker");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        cVar.d();
        AudioAsset.Companion companion = AudioAsset.INSTANCE;
        cVar.d();
        Object objA = cVar.a();
        if (objA == b.f20883a) {
            objA = new AssetsKt$rememberRegisteredAudio$1$1(companion);
            cVar.g();
        }
        cVar.k();
        Result<AudioAsset> resultRememberAsset = rememberAsset(riveWorker, bytes, (Function3) ((KFunction) objA), key, cVar, ((i7 << 6) & 7168) | 584, 0);
        cVar.k();
        return resultRememberAsset;
    }

    @NotNull
    public static final Result<FontAsset> rememberRegisteredFont(@NotNull CommandQueue riveWorker, @NotNull String name, @NotNull byte[] bytes, c cVar, int i7) {
        Intrinsics.checkNotNullParameter(riveWorker, "riveWorker");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        cVar.d();
        FontAsset.Companion companion = FontAsset.INSTANCE;
        cVar.d();
        Object objA = cVar.a();
        if (objA == b.f20883a) {
            objA = new AssetsKt$rememberRegisteredFont$1$1(companion);
            cVar.g();
        }
        cVar.k();
        Result<FontAsset> resultRememberAsset = rememberAsset(riveWorker, bytes, (Function3) ((KFunction) objA), name, cVar, ((i7 << 6) & 7168) | 584, 0);
        cVar.k();
        return resultRememberAsset;
    }

    @NotNull
    public static final Result<ImageAsset> rememberRegisteredImage(@NotNull CommandQueue riveWorker, @NotNull String key, @NotNull byte[] bytes, c cVar, int i7) {
        Intrinsics.checkNotNullParameter(riveWorker, "riveWorker");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        cVar.d();
        ImageAsset.Companion companion = ImageAsset.INSTANCE;
        cVar.d();
        Object objA = cVar.a();
        if (objA == b.f20883a) {
            objA = new AssetsKt$rememberRegisteredImage$1$1(companion);
            cVar.g();
        }
        cVar.k();
        Result<ImageAsset> resultRememberAsset = rememberAsset(riveWorker, bytes, (Function3) ((KFunction) objA), key, cVar, ((i7 << 6) & 7168) | 584, 0);
        cVar.k();
        return resultRememberAsset;
    }
}
