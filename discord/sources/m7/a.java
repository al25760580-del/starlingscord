package m7;

import android.graphics.Canvas;
import androidx.appcompat.widget.v;
import com.discord.chat.presentation.textutils.RenderContext;
import com.discord.chat.presentation.textutils.TextUtilsKt;
import com.discord.qr.scanner.QRScanner;
import com.discord.qr.scanner.QRScannerViewManager;
import com.discord.react_rootview.ReactRootView;
import com.discord.react_rootview.ReactSurfaceView;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.w0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.Json;
import m3.m;
import mr.i;
import mr.j;
import n1.c;
import n1.f;
import o1.o;
import or.a0;
import or.b0;
import pr.n;
import qr.p;
import u1.d;
import v1.h;
import w1.e;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15467d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f15468e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f15469i;

    public /* synthetic */ a(int i7, Object obj, Object obj2) {
        this.f15467d = i7;
        this.f15468e = obj;
        this.f15469i = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String[] strArrNames;
        switch (this.f15467d) {
            case 0:
                return QRScannerViewManager.createViewInstance$lambda$2$lambda$1((QRScannerViewManager) this.f15468e, (QRScanner) this.f15469i);
            case 1:
                return TextUtilsKt.toSpannable$lambda$71$lambda$44((String) this.f15468e, (RenderContext) this.f15469i);
            case 2:
                b0 b0Var = (b0) this.f15468e;
                String str = (String) this.f15469i;
                a0 a0Var = (a0) b0Var.f17507c;
                if (a0Var == null) {
                    Enum[] enumArr = (Enum[]) b0Var.f17506b;
                    a0Var = new a0(str, enumArr.length);
                    for (Enum r5 : enumArr) {
                        a0Var.b(r5.name(), false);
                    }
                }
                return a0Var;
            case 3:
                return m.g((String) this.f15468e, j.f16080e, new SerialDescriptor[0], new kotlin.collections.a(9, (b0) this.f15469i));
            case 4:
                SerialDescriptor serialDescriptor = (SerialDescriptor) this.f15468e;
                Json json = (Json) this.f15469i;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                v vVar = json.f14761a;
                p.p(serialDescriptor, json);
                int iG = serialDescriptor.g();
                for (int i7 = 0; i7 < iG; i7++) {
                    List listI = serialDescriptor.i(i7);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : listI) {
                        if (obj instanceof n) {
                            arrayList.add(obj);
                        }
                    }
                    n nVar = (n) CollectionsKt.b0(arrayList);
                    if (nVar != null && (strArrNames = nVar.names()) != null) {
                        for (String str2 : strArrNames) {
                            String str3 = Intrinsics.areEqual(serialDescriptor.c(), i.f16076b) ? "enum value" : "property";
                            if (linkedHashMap.containsKey(str2)) {
                                throw new kr.j("The suggested name '" + str2 + "' for " + str3 + ' ' + serialDescriptor.h(i7) + " is already one of the names for " + str3 + ' ' + serialDescriptor.h(((Number) w0.e(linkedHashMap, str2)).intValue()) + " in " + serialDescriptor);
                            }
                            linkedHashMap.put(str2, Integer.valueOf(i7));
                        }
                    }
                }
                return linkedHashMap.isEmpty() ? w0.d() : linkedHashMap;
            case 5:
                return ReactRootView.dispatchDraw$lambda$0((ReactRootView) this.f15468e, (Canvas) this.f15469i);
            case 6:
                return ReactSurfaceView.dispatchDraw$lambda$0((ReactSurfaceView) this.f15468e, (Canvas) this.f15469i);
            case 7:
                d dVar = (d) this.f15468e;
                dVar.g().execute(new io.sentry.react.d(22, dVar, (n1.p) this.f15469i));
                return Unit.f14616a;
            case 8:
                d dVar2 = (d) this.f15468e;
                dVar2.g().execute(new io.sentry.react.d(20, dVar2, (Ref.ObjectRef) this.f15469i));
                return Unit.f14616a;
            case 9:
                d dVar3 = (d) this.f15468e;
                dVar3.g().execute(new io.sentry.react.d(21, dVar3, (o) this.f15469i));
                return Unit.f14616a;
            case 10:
                h hVar = (h) this.f15468e;
                f fVar = (f) this.f15469i;
                Executor executor = hVar.f21364g;
                if (executor == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("executor");
                    executor = null;
                }
                executor.execute(new io.sentry.react.d(23, hVar, fVar));
                return Unit.f14616a;
            case 11:
                e eVar = (e) this.f15468e;
                c cVar = (c) this.f15469i;
                Executor executor2 = eVar.f21995g;
                if (executor2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("executor");
                    executor2 = null;
                }
                executor2.execute(new io.sentry.react.d(25, eVar, cVar));
                return Unit.f14616a;
            default:
                e eVar2 = (e) this.f15468e;
                o1.d dVar4 = (o1.d) this.f15469i;
                Executor executor3 = eVar2.f21995g;
                if (executor3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("executor");
                    executor3 = null;
                }
                executor3.execute(new w1.a(eVar2, dVar4, 0));
                return Unit.f14616a;
        }
    }
}
