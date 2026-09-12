package bp;

import java.lang.annotation.Annotation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends e implements lp.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Annotation f3352b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(up.e eVar, Annotation annotation) {
        super(eVar);
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        this.f3352b = annotation;
    }
}
