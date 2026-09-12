package kotlin.collections;

import android.view.View;
import com.discord.chat.presentation.textutils.RenderContext;
import com.discord.chat.presentation.textutils.TextUtilsKt;
import com.discord.recycler_view.animator.NoMoveItemAnimator;
import com.discord.span.utilities.spannable.QuoteSpan;
import com.facebook.react.uimanager.ThemedReactContext;
import com.github.yamill.orientation.OrientationModule;
import io.sentry.h4;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.jvm.internal.TypeReference;
import kotlin.reflect.KTypeProjection;
import kotlin.text.MatchResult;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import or.s1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14624d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f14625e;

    public /* synthetic */ a(int i7, Object obj) {
        this.f14624d = i7;
        this.f14625e = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SerialDescriptor descriptor;
        int i7 = this.f14624d;
        int i10 = 0;
        int i11 = 1;
        List annotations = null;
        Executor executor = null;
        Executor executor2 = null;
        annotations = null;
        Object obj2 = this.f14625e;
        switch (i7) {
            case 0:
                return obj == ((b) obj2) ? "(this Collection)" : String.valueOf(obj);
            case 1:
                l lVar = (l) obj2;
                Map.Entry it = (Map.Entry) obj;
                i iVar = l.f14655i;
                Intrinsics.checkNotNullParameter(it, "it");
                StringBuilder sb2 = new StringBuilder();
                Object key = it.getKey();
                sb2.append(key == lVar ? "(this Map)" : String.valueOf(key));
                sb2.append('=');
                Object value = it.getValue();
                sb2.append(value != lVar ? String.valueOf(value) : "(this Map)");
                return sb2.toString();
            case 2:
                return TypeReference.asString$lambda$0((TypeReference) obj2, (KTypeProjection) obj);
            case 3:
                mr.a buildSerialDescriptor = (mr.a) obj;
                Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
                KSerializer kSerializer = ((kr.a) obj2).f14793b;
                if (kSerializer != null && (descriptor = kSerializer.getDescriptor()) != null) {
                    annotations = descriptor.getAnnotations();
                }
                if (annotations == null) {
                    annotations = n0.f14659d;
                }
                buildSerialDescriptor.getClass();
                Intrinsics.checkNotNullParameter(annotations, "<set-?>");
                buildSerialDescriptor.f16046b = annotations;
                return Unit.f14616a;
            case 4:
                kr.d dVar = (kr.d) obj2;
                mr.a buildSerialDescriptor2 = (mr.a) obj;
                Intrinsics.checkNotNullParameter(buildSerialDescriptor2, "$this$buildSerialDescriptor");
                com.facebook.imagepipeline.nativecode.b.z(StringCompanionObject.INSTANCE);
                mr.a.a(buildSerialDescriptor2, "type", s1.f17603b);
                mr.a.a(buildSerialDescriptor2, "value", m3.m.g("kotlinx.serialization.Polymorphic<" + dVar.f14798a.getSimpleName() + '>', mr.h.f16075b, new SerialDescriptor[0], new f6.a(17)));
                List list = dVar.f14799b;
                Intrinsics.checkNotNullParameter(list, "<set-?>");
                buildSerialDescriptor2.f16046b = list;
                return Unit.f14616a;
            case 5:
                return Float.valueOf(((mm.i) obj2).f15906d.getHeight());
            case 6:
                mr.g gVar = (mr.g) obj2;
                int iIntValue = ((Integer) obj).intValue();
                return gVar.f16070f[iIntValue] + ": " + gVar.f16071g[iIntValue].d();
            case 7:
                return TextUtilsKt.toSpannable$lambda$71$lambda$17$lambda$16((QuoteSpan) obj2, (RenderContext.Insets) obj);
            case 8:
                return TextUtilsKt.toSpannable$lambda$71$lambda$46$lambda$45((m7.a) obj2, (View) obj);
            case 9:
                mr.a buildSerialDescriptor3 = (mr.a) obj;
                Intrinsics.checkNotNullParameter(buildSerialDescriptor3, "$this$buildSerialDescriptor");
                List list2 = (List) ((or.b0) obj2).f17507c;
                buildSerialDescriptor3.getClass();
                Intrinsics.checkNotNullParameter(list2, "<set-?>");
                buildSerialDescriptor3.f16046b = list2;
                return Unit.f14616a;
            case 10:
                or.g1 g1Var = (or.g1) obj2;
                int iIntValue2 = ((Integer) obj).intValue();
                return g1Var.f17546e[iIntValue2] + ": " + g1Var.j(iIntValue2).d();
            case 11:
                kr.a aVar = (kr.a) obj2;
                mr.a buildClassSerialDescriptor = (mr.a) obj;
                Intrinsics.checkNotNullParameter(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
                mr.a.a(buildClassSerialDescriptor, "first", aVar.f14793b.getDescriptor());
                mr.a.a(buildClassSerialDescriptor, "second", ((KSerializer) aVar.f14794c).getDescriptor());
                mr.a.a(buildClassSerialDescriptor, "third", ((KSerializer) aVar.f14795d).getDescriptor());
                return Unit.f14616a;
            case 12:
                return OrientationModule._init_$lambda$0((OrientationModule) obj2, ((Boolean) obj).booleanValue());
            case 13:
                return com.discord.react_strings.RenderContext.Argument.replace$lambda$0((Function3) obj2, (MatchResult) obj);
            case 14:
                ((h4) obj2).u(ho.c.b(((Float) obj).floatValue()));
                return Unit.f14616a;
            case 15:
                u1.d dVar2 = (u1.d) obj2;
                o1.l e10 = (o1.l) obj;
                Intrinsics.checkNotNullParameter(e10, "e");
                dVar2.g().execute(new u1.b(dVar2, e10, i10));
                return Unit.f14616a;
            case 16:
                v1.h hVar = (v1.h) obj2;
                o1.d e11 = (o1.d) obj;
                Intrinsics.checkNotNullParameter(e11, "e");
                Executor executor3 = hVar.f21364g;
                if (executor3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("executor");
                } else {
                    executor2 = executor3;
                }
                executor2.execute(new v1.c(hVar, e11, i11));
                return Unit.f14616a;
            case 17:
                return NoMoveItemAnimator.onAnimationsFinishedEvents$lambda$0((NoMoveItemAnimator) obj2, (Unit) obj);
            case 18:
                we.k kVar = (we.k) obj2;
                String text = (String) obj;
                Intrinsics.checkNotNullParameter(text, "text");
                ThemedReactContext themedReactContext = (ThemedReactContext) kVar.f22222e;
                am.e eVar = (am.e) kVar.f22221d;
                sl.b.a(themedReactContext, eVar.getId(), new nm.e(kVar.f22219b, eVar.getId(), text));
                return Unit.f14616a;
            default:
                w1.e eVar2 = (w1.e) obj2;
                o1.d e12 = (o1.d) obj;
                Intrinsics.checkNotNullParameter(e12, "e");
                Executor executor4 = eVar2.f21995g;
                if (executor4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("executor");
                } else {
                    executor = executor4;
                }
                executor.execute(new w1.a(eVar2, e12, i11));
                return Unit.f14616a;
        }
    }
}
