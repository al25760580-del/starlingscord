package androidx.lifecycle;

import android.util.Log;
import app.rive.runtime.kotlin.core.FileAsset;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.margelo.nitro.rive.w1;
import com.margelo.nitro.rive.x1;
import com.reactnativedocumentpicker.RNDocumentPickerModule;
import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: loaded from: classes.dex */
public final class f0 extends xn.h implements Function2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2347d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2348e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f2349i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Object f2350v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f2351w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f2352x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(ReadableArray readableArray, int i7, ol.d dVar, ReactContext reactContext, File file, Continuation continuation) {
        super(2, continuation);
        this.f2347d = 2;
        this.f2349i = readableArray;
        this.f2348e = i7;
        this.f2350v = dVar;
        this.f2351w = reactContext;
        this.f2352x = file;
    }

    @Override // xn.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f2347d) {
            case 0:
                return new f0((jr.b) this.f2352x, (Function2) this.f2351w, continuation);
            case 1:
                return new f0((com.margelo.nitro.rive.p) this.f2349i, (x1) this.f2350v, (FileAsset) this.f2351w, (ar.p) this.f2352x, continuation, 1);
            case 2:
                return new f0((ReadableArray) this.f2349i, this.f2348e, (ol.d) this.f2350v, (ReactContext) this.f2351w, (File) this.f2352x, continuation);
            default:
                return new f0((RNDocumentPickerModule) this.f2349i, (ReadableArray) this.f2350v, (String) this.f2351w, (Promise) this.f2352x, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f2347d) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((f0) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
    }

    /* JADX WARN: Code duplicated, block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:18:0x0067  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r5v10 */
    @Override // xn.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Function2 function2;
        Mutex mutex;
        Throwable th2;
        Mutex mutex2;
        ol.a aVar;
        int i7 = this.f2347d;
        Object obj2 = this.f2352x;
        String str = 0;
        Object obj3 = null;
        Object obj4 = this.f2351w;
        switch (i7) {
            case 0:
                wn.a aVar2 = wn.a.f22354d;
                int i10 = this.f2348e;
                try {
                    if (i10 == 0) {
                        ib.a.L(obj);
                        jr.b bVar = (jr.b) obj2;
                        function2 = (Function2) obj4;
                        this.f2349i = bVar;
                        this.f2350v = function2;
                        this.f2348e = 1;
                        if (bVar.a(this) == aVar2) {
                            return aVar2;
                        }
                        mutex = bVar;
                    } else {
                        if (i10 != 1) {
                            if (i10 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            mutex2 = (Mutex) this.f2349i;
                            try {
                                ib.a.L(obj);
                                Unit unit = Unit.f14616a;
                                mutex2.b(null);
                                return Unit.f14616a;
                            } catch (Throwable th3) {
                                th2 = th3;
                                mutex2.b(null);
                                throw th2;
                            }
                        }
                        function2 = (Function2) this.f2350v;
                        mutex = (Mutex) this.f2349i;
                        ib.a.L(obj);
                    }
                    e0 e0Var = new e0(function2, null);
                    this.f2349i = mutex;
                    this.f2350v = null;
                    this.f2348e = 2;
                    if (ar.b0.i(e0Var, this) == aVar2) {
                        return aVar2;
                    }
                    mutex2 = mutex;
                    Unit unit2 = Unit.f14616a;
                    mutex2.b(null);
                    return Unit.f14616a;
                } catch (Throwable th4) {
                    th2 = th4;
                    mutex2 = mutex;
                    mutex2.b(null);
                    throw th2;
                }
            case 1:
                ar.p pVar = (ar.p) obj2;
                com.margelo.nitro.rive.p pVar2 = (com.margelo.nitro.rive.p) this.f2349i;
                wn.a aVar3 = wn.a.f22354d;
                int i11 = this.f2348e;
                try {
                    if (i11 != 0) {
                        if (i11 == 1) {
                            ib.a.L(obj);
                        } else {
                            if (i11 != 2) {
                                if (i11 != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ib.a.L(obj);
                                ((Boolean) obj).getClass();
                                return Unit.f14616a;
                            }
                            ib.a.L(obj);
                        }
                        ((Boolean) obj).getClass();
                        return Unit.f14616a;
                    }
                    ib.a.L(obj);
                    com.margelo.nitro.rive.g gVarA = pVar2.a();
                    this.f2348e = 1;
                    obj = gVarA.a(pVar2, this);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                    byte[] bArr = (byte[]) obj;
                    hr.e eVar = ar.k0.f2938a;
                    br.d dVar = fr.q.f9394a;
                    w1 w1Var = new w1((x1) this.f2350v, bArr, (FileAsset) obj4, pVar, null, 0);
                    this.f2348e = 2;
                    obj = ar.b0.A(dVar, w1Var, this);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                    ((Boolean) obj).getClass();
                    break;
                } catch (Exception e10) {
                    Log.e("ReferencedAssetLoader", "Failed to load asset: " + e10.getMessage());
                    hr.e eVar2 = ar.k0.f2938a;
                    br.d dVar2 = fr.q.f9394a;
                    com.margelo.nitro.rive.t tVar = new com.margelo.nitro.rive.t(pVar, str, 4);
                    this.f2348e = 3;
                    obj = ar.b0.A(dVar2, tVar, this);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                }
                return Unit.f14616a;
            case 2:
                wn.a aVar4 = wn.a.f22354d;
                ib.a.L(obj);
                WritableMap writableMapCreateMap = Arguments.createMap();
                ReadableArray readableArray = (ReadableArray) this.f2349i;
                int i12 = this.f2348e;
                ReadableMap map = readableArray.getMap(i12);
                try {
                    if (map != null) {
                        writableMapCreateMap.merge(ol.d.b((ol.d) this.f2350v, map, (ReactContext) obj4, (File) obj2));
                        return writableMapCreateMap;
                    }
                    throw new IllegalArgumentException("keepLocalCopy: The file argument is null at index " + i12);
                } catch (Exception e11) {
                    String localizedMessage = e11.getLocalizedMessage();
                    if (localizedMessage == null && (localizedMessage = e11.getMessage()) == null) {
                        localizedMessage = "Unknown error";
                    }
                    writableMapCreateMap.putString("status", "error");
                    writableMapCreateMap.putString("copyError", localizedMessage);
                    writableMapCreateMap.putString("sourceUri", map != null ? map.getString("uri") : 0);
                }
                break;
            default:
                RNDocumentPickerModule rNDocumentPickerModule = (RNDocumentPickerModule) this.f2349i;
                wn.a aVar5 = wn.a.f22354d;
                int i13 = this.f2348e;
                if (i13 == 0) {
                    ib.a.L(obj);
                    ol.d dVar3 = rNDocumentPickerModule.fileOps;
                    ReactApplicationContext reactApplicationContext = rNDocumentPickerModule.getReactApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "access$getReactApplicationContext(...)");
                    ReadableArray readableArray2 = (ReadableArray) this.f2350v;
                    String path = (String) obj4;
                    ol.a.f17427e.getClass();
                    Intrinsics.checkNotNullParameter(path, "path");
                    for (Object obj5 : ol.a.f17431x) {
                        if (Intrinsics.areEqual(((ol.a) obj5).f17432d, path)) {
                            obj3 = obj5;
                            aVar = (ol.a) obj3;
                            if (aVar == null) {
                                aVar = ol.a.CACHES_DIRECTORY;
                            }
                            this.f2348e = 1;
                            dVar3.getClass();
                            hr.e eVar3 = ar.k0.f2938a;
                            obj = ar.b0.A(hr.d.f11103i, new e2.d(dVar3, reactApplicationContext, aVar, readableArray2, null), this);
                            if (obj == aVar5) {
                                return aVar5;
                            }
                        }
                    }
                    aVar = (ol.a) obj3;
                    if (aVar == null) {
                        aVar = ol.a.CACHES_DIRECTORY;
                    }
                    this.f2348e = 1;
                    dVar3.getClass();
                    hr.e eVar4 = ar.k0.f2938a;
                    obj = ar.b0.A(hr.d.f11103i, new e2.d(dVar3, reactApplicationContext, aVar, readableArray2, null), this);
                    if (obj == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ib.a.L(obj);
                }
                ((Promise) obj2).resolve((ReadableArray) obj);
                return Unit.f14616a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(Object obj, Object obj2, Object obj3, Object obj4, Continuation continuation, int i7) {
        super(2, continuation);
        this.f2347d = i7;
        this.f2349i = obj;
        this.f2350v = obj2;
        this.f2351w = obj3;
        this.f2352x = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(jr.b bVar, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.f2347d = 0;
        this.f2352x = bVar;
        this.f2351w = function2;
    }
}
