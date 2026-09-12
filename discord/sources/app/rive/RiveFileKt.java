package app.rive;

import app.rive.core.CommandQueue;
import com.facebook.imageutils.JfifUtil;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
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
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a)\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0007¢\u0006\u0004\b\u0007\u0010\b\"\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lapp/rive/RiveFileSource;", "source", "Lapp/rive/core/CommandQueue;", "Lapp/rive/core/RiveWorker;", "riveWorker", "Lapp/rive/Result;", "Lapp/rive/RiveFile;", "rememberRiveFile", "(Lapp/rive/RiveFileSource;Lapp/rive/core/CommandQueue;Lu/c;I)Lapp/rive/Result;", "", "FILE_TAG", "Ljava/lang/String;", "kotlin_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class RiveFileKt {

    @NotNull
    private static final String FILE_TAG = "Rive/File";

    /* JADX INFO: renamed from: app.rive.RiveFileKt$rememberRiveFile$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lu/o;", "Lapp/rive/Result;", "Lapp/rive/RiveFile;", "", "<anonymous>", "(Lu/o;)V"}, k = 3, mv = {1, 9, 0})
    @d(c = "app.rive.RiveFileKt$rememberRiveFile$1", f = "RiveFile.kt", l = {211, JfifUtil.MARKER_RST7}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends h implements Function2<o, Continuation, Object> {
        final /* synthetic */ CommandQueue $riveWorker;
        final /* synthetic */ RiveFileSource $source;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RiveFileSource riveFileSource, CommandQueue commandQueue, Continuation continuation) {
            super(2, continuation);
            this.$source = riveFileSource;
            this.$riveWorker = commandQueue;
        }

        @Override // xn.a
        @NotNull
        public final Continuation create(Object obj, @NotNull Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$source, this.$riveWorker, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // xn.a
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            o oVar;
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                oVar = (o) this.L$0;
                RiveFile.Companion companion = RiveFile.INSTANCE;
                RiveFileSource riveFileSource = this.$source;
                CommandQueue commandQueue = this.$riveWorker;
                this.L$0 = oVar;
                this.label = 1;
                obj = companion.fromSource(riveFileSource, commandQueue, this);
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
            q qVar = (q) oVar;
            qVar.setValue(result);
            if (!(result instanceof Result.Success)) {
                return Unit.f14616a;
            }
            Function0<Unit> function0 = new Function0<Unit>() { // from class: app.rive.RiveFileKt.rememberRiveFile.1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m32invoke();
                    return Unit.f14616a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m32invoke() {
                    ((RiveFile) ((Result.Success) result).getValue()).close();
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

    @NotNull
    public static final Result<RiveFile> rememberRiveFile(@NotNull RiveFileSource source, @NotNull CommandQueue riveWorker, c cVar, int i7) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(riveWorker, "riveWorker");
        cVar.d();
        Result.Loading loading = Result.Loading.INSTANCE;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(source, riveWorker, null);
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
            objA2 = new w(anonymousClass1, lVar, null, 0);
            cVar.g();
        }
        throw null;
    }
}
