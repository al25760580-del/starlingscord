package e2;

import androidx.lifecycle.f0;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.margelo.nitro.rive.p0;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.collections.n0;
import kotlin.collections.s0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;

/* JADX INFO: loaded from: classes.dex */
public final class d extends xn.h implements Function2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7861d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f7862e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f7863i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Object f7864v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f7865w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f7866x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f7867y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(List list, ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.f7866x = list;
        this.f7867y = arrayList;
    }

    @Override // xn.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f7861d) {
            case 0:
                d dVar = new d((List) this.f7866x, (ArrayList) this.f7867y, continuation);
                dVar.f7865w = obj;
                return dVar;
            default:
                d dVar2 = new d((ol.d) this.f7864v, (ReactContext) this.f7865w, (ol.a) this.f7866x, (ReadableArray) this.f7867y, continuation);
                dVar2.f7863i = obj;
                return dVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f7861d) {
            case 0:
                return ((d) create(obj, (Continuation) obj2)).invokeSuspend(Unit.f14616a);
            default:
                return ((d) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [wn.a] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [com.facebook.react.bridge.WritableArray] */
    /* JADX WARN: Type inference failed for: r0v19 */
    @Override // xn.a
    public final Object invokeSuspend(Object obj) throws IOException {
        List list;
        Iterator it;
        int i7 = this.f7861d;
        Object obj2 = this.f7866x;
        Object obj3 = this.f7867y;
        switch (i7) {
            case 0:
                wn.a aVar = wn.a.f22354d;
                int i10 = this.f7862e;
                if (i10 == 0) {
                    ib.a.L(obj);
                    obj = this.f7865w;
                    Iterator it2 = ((List) obj2).iterator();
                    list = (ArrayList) obj3;
                    it = it2;
                } else if (i10 == 1) {
                    Object obj4 = this.f7863i;
                    Iterator it3 = (Iterator) this.f7864v;
                    List list2 = (List) this.f7865w;
                    ib.a.L(obj);
                    if (((Boolean) obj).booleanValue()) {
                        list2.add(new p0(1, null, 1));
                        this.f7865w = list2;
                        this.f7864v = it3;
                        this.f7863i = null;
                        this.f7862e = 2;
                        throw null;
                    }
                    obj = obj4;
                    it = it3;
                    list = list2;
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) this.f7864v;
                    list = (List) this.f7865w;
                    ib.a.L(obj);
                }
                if (!it.hasNext()) {
                    return obj;
                }
                if (it.next() != null) {
                    throw new ClassCastException();
                }
                this.f7865w = list;
                this.f7864v = it;
                this.f7863i = obj;
                this.f7862e = 1;
                throw null;
            default:
                ReadableArray readableArray = (ReadableArray) obj3;
                ?? r5 = wn.a.f22354d;
                int i11 = this.f7862e;
                if (i11 == 0) {
                    ib.a.L(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.f7863i;
                    ReactContext reactContext = (ReactContext) this.f7865w;
                    File file = new File(((ol.a) obj2) == ol.a.DOCUMENT_DIRECTORY ? reactContext.getFilesDir() : reactContext.getCacheDir(), UUID.randomUUID().toString());
                    if (!file.mkdir()) {
                        throw new IOException(a3.e.l("Failed to create directory at ", file.getAbsolutePath()));
                    }
                    IntRange intRangeI = lo.j.i(0, readableArray.size());
                    ol.d dVar = (ol.d) this.f7864v;
                    ReactContext reactContext2 = (ReactContext) this.f7865w;
                    ArrayList arrayList = new ArrayList(e0.l(intRangeI, 10));
                    Iterator it4 = intRangeI.iterator();
                    while (((lo.b) it4).f15156i) {
                        arrayList.add(ar.b0.d(coroutineScope, null, new f0(readableArray, ((s0) it4).nextInt(), dVar, reactContext2, file, (Continuation) null), 3));
                    }
                    WritableArray writableArrayCreateArray = Arguments.createArray();
                    this.f7863i = writableArrayCreateArray;
                    this.f7862e = 1;
                    Object objA = arrayList.isEmpty() ? n0.f14659d : new ar.e((Deferred[]) arrayList.toArray(new Deferred[0])).a(this);
                    if (objA != r5) {
                        r5 = writableArrayCreateArray;
                        obj = objA;
                    }
                    return r5;
                }
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                WritableArray writableArray = (WritableArray) this.f7863i;
                ib.a.L(obj);
                r5 = writableArray;
                Iterator it5 = ((Iterable) obj).iterator();
                while (it5.hasNext()) {
                    r5.pushMap((WritableMap) it5.next());
                }
                return r5;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ol.d dVar, ReactContext reactContext, ol.a aVar, ReadableArray readableArray, Continuation continuation) {
        super(2, continuation);
        this.f7864v = dVar;
        this.f7865w = reactContext;
        this.f7866x = aVar;
        this.f7867y = readableArray;
    }
}
