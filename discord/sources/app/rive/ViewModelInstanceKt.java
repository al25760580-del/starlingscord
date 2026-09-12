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
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a#\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\"\u0014\u0010\b\u001a\u00020\u00078\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lapp/rive/RiveFile;", "file", "Lapp/rive/ViewModelInstanceSource;", "source", "Lapp/rive/ViewModelInstance;", "rememberViewModelInstance", "(Lapp/rive/RiveFile;Lapp/rive/ViewModelInstanceSource;Lu/c;II)Lapp/rive/ViewModelInstance;", "", "VM_INSTANCE_TAG", "Ljava/lang/String;", "kotlin_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nViewModelInstance.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewModelInstance.kt\napp/rive/ViewModelInstanceKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,597:1\n1282#2,6:598\n*S KotlinDebug\n*F\n+ 1 ViewModelInstance.kt\napp/rive/ViewModelInstanceKt\n*L\n587#1:598,6\n*E\n"})
public final class ViewModelInstanceKt {

    @NotNull
    public static final String VM_INSTANCE_TAG = "Rive/VMI";

    @NotNull
    public static final ViewModelInstance rememberViewModelInstance(@NotNull RiveFile file, ViewModelInstanceSource viewModelInstanceSource, c cVar, int i7, int i10) {
        Intrinsics.checkNotNullParameter(file, "file");
        cVar.d();
        if ((i10 & 2) != 0) {
            viewModelInstanceSource = null;
        }
        cVar.d();
        if (viewModelInstanceSource == null) {
            viewModelInstanceSource = ViewModelSource.DefaultForArtboard.m86defaultInstanceimpl(ViewModelSource.DefaultForArtboard.m85constructorimpl(ArtboardKt.rememberArtboard(file, null, cVar, i7 & 14, 2)));
        }
        cVar.k();
        cVar.d();
        boolean zJ = ((((i7 & 14) ^ 6) > 4 && cVar.j()) || (i7 & 6) == 4) | cVar.j();
        Object objA = cVar.a();
        if (zJ || objA == b.f20883a) {
            objA = ViewModelInstance.INSTANCE.fromFile(file, viewModelInstanceSource);
            cVar.g();
        }
        final ViewModelInstance viewModelInstance = (ViewModelInstance) objA;
        cVar.k();
        new Function1<g, f>() { // from class: app.rive.ViewModelInstanceKt.rememberViewModelInstance.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final f invoke(@NotNull g DisposableEffect) {
                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                final ViewModelInstance viewModelInstance2 = viewModelInstance;
                return new f() { // from class: app.rive.ViewModelInstanceKt$rememberViewModelInstance$1$invoke$$inlined$onDispose$1
                    public void dispose() {
                        viewModelInstance2.close();
                    }
                };
            }
        };
        throw null;
    }
}
