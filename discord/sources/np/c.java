package np;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f16988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f16989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f16990c;

    public c(HashMap memberAnnotations, HashMap propertyConstants, HashMap annotationParametersDefaultValues) {
        Intrinsics.checkNotNullParameter(memberAnnotations, "memberAnnotations");
        Intrinsics.checkNotNullParameter(propertyConstants, "propertyConstants");
        Intrinsics.checkNotNullParameter(annotationParametersDefaultValues, "annotationParametersDefaultValues");
        this.f16988a = memberAnnotations;
        this.f16989b = propertyConstants;
        this.f16990c = annotationParametersDefaultValues;
    }
}
