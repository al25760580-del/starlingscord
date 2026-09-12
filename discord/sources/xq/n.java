package xq;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes3.dex */
public class n extends m {
    public static final h b(Sequence sequence, Function1 iterator) {
        if (!(sequence instanceof s)) {
            return new h(sequence, new n6.e(20), iterator);
        }
        s sVar = (s) sequence;
        Intrinsics.checkNotNullParameter(iterator, "iterator");
        return new h(sVar.f23049a, sVar.f23050b, iterator);
    }

    public static Sequence c(Function1 nextFunction, Object obj) {
        Intrinsics.checkNotNullParameter(nextFunction, "nextFunction");
        return obj == null ? f.f23028a : new e(new i6.a(14, obj), nextFunction);
    }

    public static a d(Function0 nextFunction) {
        Intrinsics.checkNotNullParameter(nextFunction, "nextFunction");
        e eVar = new e(nextFunction, new com.facebook.react.defaults.a(5, nextFunction));
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        return new a(eVar);
    }
}
