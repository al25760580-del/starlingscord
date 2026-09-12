package app.rive.core;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import u.c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a%\u0010\u0005\u001a\u00020\u00042\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "", "", "trackMap", "", "RebuggerWrapper", "(Ljava/util/Map;Lu/c;I)V", "kotlin_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class RebuggerWrapperKt {

    /* JADX INFO: renamed from: app.rive.core.RebuggerWrapperKt$RebuggerWrapper$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 extends Lambda implements Function2<c, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ Map<String, Object> $trackMap;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Map<String, ? extends Object> map, int i7) {
            super(2);
            this.$trackMap = map;
            this.$$changed = i7;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            if (obj != null) {
                throw new ClassCastException();
            }
            invoke((c) null, ((Number) obj2).intValue());
            return Unit.f14616a;
        }

        public final void invoke(c cVar, int i7) {
            Map<String, Object> map = this.$trackMap;
            int i10 = this.$$changed | 1;
            int i11 = 306783378 & i10;
            int i12 = 613566756 & i10;
            RebuggerWrapperKt.RebuggerWrapper(map, cVar, (i10 & (-920350135)) | (i12 >> 1) | i11 | ((i11 << 1) & i12));
        }
    }

    public static final void RebuggerWrapper(@NotNull Map<String, ? extends Object> trackMap, c cVar, int i7) {
        Intrinsics.checkNotNullParameter(trackMap, "trackMap");
        cVar.m();
        if ((i7 & 1) == 0) {
            throw null;
        }
        throw null;
    }
}
