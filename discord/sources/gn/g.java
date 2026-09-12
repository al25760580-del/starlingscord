package gn;

import android.content.Context;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.EventDispatcher;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g extends FunctionReferenceImpl implements Function3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f10141d = new g(3, h.class, "handleOnInsetsChange", "handleOnInsetsChange(Lcom/th3rdwave/safeareacontext/SafeAreaProvider;Lcom/th3rdwave/safeareacontext/EdgeInsets;Lcom/th3rdwave/safeareacontext/Rect;)V", 1);

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        e p3 = (e) obj;
        a p5 = (a) obj2;
        c p6 = (c) obj3;
        Intrinsics.checkNotNullParameter(p3, "p0");
        Intrinsics.checkNotNullParameter(p5, "p1");
        Intrinsics.checkNotNullParameter(p6, "p2");
        Context context = p3.getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ReactContext context2 = (ReactContext) context;
        int id2 = p3.getId();
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(context2, id2);
        if (eventDispatcherForReactTag != null) {
            Intrinsics.checkNotNullParameter(context2, "context");
            eventDispatcherForReactTag.dispatchEvent(new b(UIManagerHelper.getSurfaceId(context2), id2, p5, p6));
        }
        return Unit.f14616a;
    }
}
