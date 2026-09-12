package app.rive;

import app.rive.core.RiveSurface;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import u.f;
import u.g;
import u.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lu/g;", "Lu/f;", "invoke", "(Lu/g;)Lu/f;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nRive.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rive.kt\napp/rive/RiveKt$Rive$2$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,521:1\n66#2,5:522\n66#2,5:527\n*S KotlinDebug\n*F\n+ 1 Rive.kt\napp/rive/RiveKt$Rive$2$1\n*L\n200#1:522,5\n201#1:527,5\n*E\n"})
public final class RiveKt$Rive$2$1 extends Lambda implements Function1<g, f> {
    final /* synthetic */ l $surface$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiveKt$Rive$2$1(l lVar) {
        super(1);
        this.$surface$delegate = lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final f invoke(@NotNull g DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        final RiveSurface riveSurfaceRive$lambda$4 = RiveKt.Rive$lambda$4(this.$surface$delegate);
        return riveSurfaceRive$lambda$4 == null ? new f() { // from class: app.rive.RiveKt$Rive$2$1$invoke$$inlined$onDispose$1
            public void dispose() {
            }
        } : new f() { // from class: app.rive.RiveKt$Rive$2$1$invoke$$inlined$onDispose$2
            public void dispose() {
                riveSurfaceRive$lambda$4.close();
            }
        };
    }
}
