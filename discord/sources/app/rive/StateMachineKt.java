package app.rive;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import u.b;
import u.c;
import u.f;
import u.g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a#\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\"\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lapp/rive/Artboard;", "artboard", "", "stateMachineName", "Lapp/rive/StateMachine;", "rememberStateMachine", "(Lapp/rive/Artboard;Ljava/lang/String;Lu/c;II)Lapp/rive/StateMachine;", "STATE_MACHINE_TAG", "Ljava/lang/String;", "kotlin_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nStateMachine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StateMachine.kt\napp/rive/StateMachineKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,124:1\n1282#2,6:125\n*S KotlinDebug\n*F\n+ 1 StateMachine.kt\napp/rive/StateMachineKt\n*L\n114#1:125,6\n*E\n"})
public final class StateMachineKt {

    @NotNull
    private static final String STATE_MACHINE_TAG = "Rive/StateMachine";

    @NotNull
    public static final StateMachine rememberStateMachine(@NotNull Artboard artboard, String str, c cVar, int i7, int i10) {
        Intrinsics.checkNotNullParameter(artboard, "artboard");
        cVar.d();
        if ((i10 & 2) != 0) {
            str = null;
        }
        cVar.d();
        boolean zJ = ((((i7 & 112) ^ 48) > 32 && cVar.j()) || (i7 & 48) == 32) | cVar.j();
        Object objA = cVar.a();
        if (zJ || objA == b.f20883a) {
            objA = StateMachine.INSTANCE.fromArtboard(artboard, str);
            cVar.g();
        }
        final StateMachine stateMachine = (StateMachine) objA;
        cVar.k();
        new Function1<g, f>() { // from class: app.rive.StateMachineKt.rememberStateMachine.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final f invoke(@NotNull g DisposableEffect) {
                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                final StateMachine stateMachine2 = stateMachine;
                return new f() { // from class: app.rive.StateMachineKt$rememberStateMachine$1$invoke$$inlined$onDispose$1
                    public void dispose() {
                        stateMachine2.close();
                    }
                };
            }
        };
        throw null;
    }
}
