package b4;

import androidx.core.performance.play.services.PlayServicesDevicePerformance;
import com.margelo.nitro.core.Promise;
import com.margelo.nitro.rive.HybridRiveFile;
import com.reactnativedocumentpicker.RNDocumentPickerModule;
import e2.s;
import e4.i;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import xn.h;

/* JADX INFO: loaded from: classes.dex */
public final class d extends h implements Function2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3063d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3064e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f3065i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f3066v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(PlayServicesDevicePerformance playServicesDevicePerformance, int i7, Continuation continuation) {
        super(2, continuation);
        this.f3063d = 9;
        this.f3066v = playServicesDevicePerformance;
        this.f3064e = i7;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [kotlin.jvm.functions.Function1, xn.h] */
    /* JADX WARN: Type inference failed for: r1v20, types: [kotlin.jvm.functions.Function2, xn.h] */
    @Override // xn.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f3063d) {
            case 0:
                d dVar = new d((e) this.f3066v, continuation, 0);
                dVar.f3065i = obj;
                return dVar;
            case 1:
                return new d((Function1) this.f3065i, (Promise) this.f3066v, continuation);
            case 2:
                return new d((ArrayList) this.f3065i, (HybridRiveFile) this.f3066v, continuation, 2);
            case 3:
                d dVar2 = new d((Flow) this.f3066v, continuation, 3);
                dVar2.f3065i = obj;
                return dVar2;
            case 4:
                d dVar3 = new d((List) this.f3066v, continuation, 4);
                dVar3.f3065i = obj;
                return dVar3;
            case 5:
                return new d((i) this.f3066v, continuation, 5);
            case 6:
                d dVar4 = new d((er.e) this.f3066v, continuation, 6);
                dVar4.f3065i = obj;
                return dVar4;
            case 7:
                d dVar5 = new d((er.f) this.f3066v, continuation, 7);
                dVar5.f3065i = obj;
                return dVar5;
            case 8:
                d dVar6 = new d((FlowCollector) this.f3066v, continuation, 8);
                dVar6.f3065i = obj;
                return dVar6;
            case 9:
                d dVar7 = new d((PlayServicesDevicePerformance) this.f3066v, this.f3064e, continuation);
                dVar7.f3065i = obj;
                return dVar7;
            case 10:
                d dVar8 = new d((h) this.f3066v, continuation);
                dVar8.f3065i = obj;
                return dVar8;
            case 11:
                d dVar9 = new d((d) this.f3066v, continuation, 11);
                dVar9.f3065i = obj;
                return dVar9;
            default:
                return new d((RNDocumentPickerModule) this.f3065i, (List) this.f3066v, continuation, 12);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f3063d) {
            case 0:
                return ((d) create((ProducerScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f14616a);
            case 1:
                return ((d) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f14616a);
            case 2:
                return ((d) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f14616a);
            case 3:
                return ((d) create((ProducerScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f14616a);
            case 4:
                return ((d) create((s) obj, (Continuation) obj2)).invokeSuspend(Unit.f14616a);
            case 5:
                return ((d) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f14616a);
            case 6:
                return ((d) create((ProducerScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f14616a);
            case 7:
                return ((d) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f14616a);
            case 8:
                return ((d) create(obj, (Continuation) obj2)).invokeSuspend(Unit.f14616a);
            case 9:
                return ((d) create((h2.b) obj, (Continuation) obj2)).invokeSuspend(Unit.f14616a);
            case 10:
                return ((d) create((h2.b) obj, (Continuation) obj2)).invokeSuspend(Unit.f14616a);
            case 11:
                return ((d) create((h2.b) obj, (Continuation) obj2)).invokeSuspend(Unit.f14616a);
            default:
                return ((d) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x020f  */
    /* JADX WARN: Code duplicated, block: B:106:0x0227  */
    /* JADX WARN: Code duplicated, block: B:112:0x0246  */
    /* JADX WARN: Code duplicated, block: B:114:0x024a  */
    /* JADX WARN: Code duplicated, block: B:116:0x0252  */
    /* JADX WARN: Code duplicated, block: B:120:0x0262  */
    /* JADX WARN: Code duplicated, block: B:123:0x0270 A[Catch: all -> 0x0275, TryCatch #2 {all -> 0x0275, blocks: (B:121:0x026a, B:123:0x0270, B:127:0x027a, B:129:0x0282, B:130:0x0285, B:131:0x028b, B:133:0x0291, B:134:0x029f, B:136:0x02b1, B:142:0x02bd, B:144:0x02c6, B:145:0x02ca, B:147:0x02ce, B:149:0x02d6, B:151:0x02db, B:153:0x02df, B:154:0x02e7, B:155:0x02ee, B:156:0x02ef), top: B:269:0x026a }] */
    /* JADX WARN: Code duplicated, block: B:126:0x0278  */
    /* JADX WARN: Code duplicated, block: B:127:0x027a A[Catch: all -> 0x0275, TryCatch #2 {all -> 0x0275, blocks: (B:121:0x026a, B:123:0x0270, B:127:0x027a, B:129:0x0282, B:130:0x0285, B:131:0x028b, B:133:0x0291, B:134:0x029f, B:136:0x02b1, B:142:0x02bd, B:144:0x02c6, B:145:0x02ca, B:147:0x02ce, B:149:0x02d6, B:151:0x02db, B:153:0x02df, B:154:0x02e7, B:155:0x02ee, B:156:0x02ef), top: B:269:0x026a }] */
    /* JADX WARN: Code duplicated, block: B:129:0x0282 A[Catch: all -> 0x0275, TryCatch #2 {all -> 0x0275, blocks: (B:121:0x026a, B:123:0x0270, B:127:0x027a, B:129:0x0282, B:130:0x0285, B:131:0x028b, B:133:0x0291, B:134:0x029f, B:136:0x02b1, B:142:0x02bd, B:144:0x02c6, B:145:0x02ca, B:147:0x02ce, B:149:0x02d6, B:151:0x02db, B:153:0x02df, B:154:0x02e7, B:155:0x02ee, B:156:0x02ef), top: B:269:0x026a }] */
    /* JADX WARN: Code duplicated, block: B:134:0x029f A[Catch: all -> 0x0275, TryCatch #2 {all -> 0x0275, blocks: (B:121:0x026a, B:123:0x0270, B:127:0x027a, B:129:0x0282, B:130:0x0285, B:131:0x028b, B:133:0x0291, B:134:0x029f, B:136:0x02b1, B:142:0x02bd, B:144:0x02c6, B:145:0x02ca, B:147:0x02ce, B:149:0x02d6, B:151:0x02db, B:153:0x02df, B:154:0x02e7, B:155:0x02ee, B:156:0x02ef), top: B:269:0x026a }] */
    /* JADX WARN: Code duplicated, block: B:136:0x02b1 A[Catch: all -> 0x0275, TryCatch #2 {all -> 0x0275, blocks: (B:121:0x026a, B:123:0x0270, B:127:0x027a, B:129:0x0282, B:130:0x0285, B:131:0x028b, B:133:0x0291, B:134:0x029f, B:136:0x02b1, B:142:0x02bd, B:144:0x02c6, B:145:0x02ca, B:147:0x02ce, B:149:0x02d6, B:151:0x02db, B:153:0x02df, B:154:0x02e7, B:155:0x02ee, B:156:0x02ef), top: B:269:0x026a }] */
    /* JADX WARN: Code duplicated, block: B:145:0x02ca A[Catch: all -> 0x0275, TryCatch #2 {all -> 0x0275, blocks: (B:121:0x026a, B:123:0x0270, B:127:0x027a, B:129:0x0282, B:130:0x0285, B:131:0x028b, B:133:0x0291, B:134:0x029f, B:136:0x02b1, B:142:0x02bd, B:144:0x02c6, B:145:0x02ca, B:147:0x02ce, B:149:0x02d6, B:151:0x02db, B:153:0x02df, B:154:0x02e7, B:155:0x02ee, B:156:0x02ef), top: B:269:0x026a }] */
    /* JADX WARN: Code duplicated, block: B:147:0x02ce A[Catch: all -> 0x0275, TryCatch #2 {all -> 0x0275, blocks: (B:121:0x026a, B:123:0x0270, B:127:0x027a, B:129:0x0282, B:130:0x0285, B:131:0x028b, B:133:0x0291, B:134:0x029f, B:136:0x02b1, B:142:0x02bd, B:144:0x02c6, B:145:0x02ca, B:147:0x02ce, B:149:0x02d6, B:151:0x02db, B:153:0x02df, B:154:0x02e7, B:155:0x02ee, B:156:0x02ef), top: B:269:0x026a }] */
    /* JADX WARN: Code duplicated, block: B:149:0x02d6 A[Catch: all -> 0x0275, TryCatch #2 {all -> 0x0275, blocks: (B:121:0x026a, B:123:0x0270, B:127:0x027a, B:129:0x0282, B:130:0x0285, B:131:0x028b, B:133:0x0291, B:134:0x029f, B:136:0x02b1, B:142:0x02bd, B:144:0x02c6, B:145:0x02ca, B:147:0x02ce, B:149:0x02d6, B:151:0x02db, B:153:0x02df, B:154:0x02e7, B:155:0x02ee, B:156:0x02ef), top: B:269:0x026a }] */
    /* JADX WARN: Code duplicated, block: B:153:0x02df A[Catch: all -> 0x0275, TryCatch #2 {all -> 0x0275, blocks: (B:121:0x026a, B:123:0x0270, B:127:0x027a, B:129:0x0282, B:130:0x0285, B:131:0x028b, B:133:0x0291, B:134:0x029f, B:136:0x02b1, B:142:0x02bd, B:144:0x02c6, B:145:0x02ca, B:147:0x02ce, B:149:0x02d6, B:151:0x02db, B:153:0x02df, B:154:0x02e7, B:155:0x02ee, B:156:0x02ef), top: B:269:0x026a }] */
    /* JADX WARN: Code duplicated, block: B:154:0x02e7 A[Catch: all -> 0x0275, TryCatch #2 {all -> 0x0275, blocks: (B:121:0x026a, B:123:0x0270, B:127:0x027a, B:129:0x0282, B:130:0x0285, B:131:0x028b, B:133:0x0291, B:134:0x029f, B:136:0x02b1, B:142:0x02bd, B:144:0x02c6, B:145:0x02ca, B:147:0x02ce, B:149:0x02d6, B:151:0x02db, B:153:0x02df, B:154:0x02e7, B:155:0x02ee, B:156:0x02ef), top: B:269:0x026a }] */
    /* JADX WARN: Code duplicated, block: B:156:0x02ef A[Catch: all -> 0x0275, TRY_LEAVE, TryCatch #2 {all -> 0x0275, blocks: (B:121:0x026a, B:123:0x0270, B:127:0x027a, B:129:0x0282, B:130:0x0285, B:131:0x028b, B:133:0x0291, B:134:0x029f, B:136:0x02b1, B:142:0x02bd, B:144:0x02c6, B:145:0x02ca, B:147:0x02ce, B:149:0x02d6, B:151:0x02db, B:153:0x02df, B:154:0x02e7, B:155:0x02ee, B:156:0x02ef), top: B:269:0x026a }] */
    /* JADX WARN: Code duplicated, block: B:159:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:163:0x030a  */
    /* JADX WARN: Code duplicated, block: B:273:0x0334 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:274:0x0237 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:275:0x0236 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:276:0x022f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:277:0x032c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:278:0x025e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:282:0x0291 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:283:0x02bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:284:0x02b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:285:0x02b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:286:0x02c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:287:0x02db A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x031b, code lost:
    
        if (r5.invoke(r3, r20) == r6) goto L168;
     */
    /* JADX WARN: Type inference failed for: r3v5, types: [kotlin.jvm.functions.Function1, xn.h] */
    /* JADX WARN: Type inference failed for: r4v35, types: [kotlin.jvm.functions.Function2, xn.h] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:167:0x031b -> B:169:0x031f). Please report as a decompilation issue!!! */
    @Override // xn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, Object obj2, Continuation continuation, int i7) {
        super(2, continuation);
        this.f3063d = i7;
        this.f3065i = obj;
        this.f3066v = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, Continuation continuation, int i7) {
        super(2, continuation);
        this.f3063d = i7;
        this.f3066v = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(Function1 function1, Promise promise, Continuation continuation) {
        super(2, continuation);
        this.f3063d = 1;
        this.f3065i = (h) function1;
        this.f3066v = promise;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.f3063d = 10;
        this.f3066v = (h) function2;
    }
}
