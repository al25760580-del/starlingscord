package qo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends w {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f18958e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Member member, Type type, Class cls, Type[] typeArr, int i7) {
        super(member, type, cls, typeArr);
        this.f18958e = i7;
    }

    @Override // qo.g
    public final Object call(Object[] args) {
        switch (this.f18958e) {
            case 0:
                Intrinsics.checkNotNullParameter(args, "args");
                zs.a.l(this, args);
                Constructor constructor = (Constructor) this.f18970a;
                SpreadBuilder spreadBuilder = new SpreadBuilder(2);
                spreadBuilder.addSpread(args);
                spreadBuilder.add(null);
                return constructor.newInstance(spreadBuilder.toArray(new Object[spreadBuilder.size()]));
            default:
                Intrinsics.checkNotNullParameter(args, "args");
                zs.a.l(this, args);
                return ((Constructor) this.f18970a).newInstance(Arrays.copyOf(args, args.length));
        }
    }
}
