package bp;

import java.lang.reflect.Field;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m extends FunctionReferenceImpl implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m f3362d = new m(1, u.class, "<init>", "<init>(Ljava/lang/reflect/Field;)V", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Field p3 = (Field) obj;
        Intrinsics.checkNotNullParameter(p3, "p0");
        return new u(p3);
    }
}
