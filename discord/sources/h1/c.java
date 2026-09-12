package h1;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import androidx.core.performance.play.services.PlayServicesDevicePerformance;
import ar.b0;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.reactnativedocumentpicker.RNDocumentPickerModule;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import ol.d;
import ol.f;
import xn.h;

/* JADX INFO: loaded from: classes.dex */
public final class c extends h implements Function2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10283d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f10284e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f10285i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f10286v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(PlayServicesDevicePerformance playServicesDevicePerformance, Integer num, Continuation continuation) {
        super(2, continuation);
        this.f10285i = playServicesDevicePerformance;
        this.f10286v = num;
    }

    @Override // xn.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f10283d) {
            case 0:
                c cVar = new c((PlayServicesDevicePerformance) this.f10285i, (Integer) this.f10286v, continuation);
                cVar.f10284e = obj;
                return cVar;
            default:
                return new c((ReadableMap) this.f10284e, (RNDocumentPickerModule) this.f10285i, (Promise) this.f10286v, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f10283d) {
            case 0:
                break;
        }
        return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
    }

    @Override // xn.a
    public final Object invokeSuspend(Object obj) {
        int i7 = this.f10283d;
        Object obj2 = this.f10285i;
        Object obj3 = this.f10286v;
        switch (i7) {
            case 0:
                wn.a aVar = wn.a.f22354d;
                ib.a.L(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f10284e;
                PlayServicesDevicePerformance playServicesDevicePerformance = (PlayServicesDevicePerformance) obj2;
                String str = playServicesDevicePerformance.f1572b;
                StringBuilder sb2 = new StringBuilder("Got mediaPerformanceClass ");
                Integer result = (Integer) obj3;
                sb2.append(result);
                Log.v(str, sb2.toString());
                Intrinsics.checkNotNullExpressionValue(result, "result");
                b0.t(coroutineScope, null, new b(playServicesDevicePerformance, Math.max(result.intValue(), playServicesDevicePerformance.f1573c.f9457a), null), 3);
                break;
            default:
                Promise promise = (Promise) obj3;
                ReadableMap readableMap = (ReadableMap) this.f10284e;
                RNDocumentPickerModule rNDocumentPickerModule = (RNDocumentPickerModule) obj2;
                wn.a aVar2 = wn.a.f22354d;
                ib.a.L(obj);
                try {
                    String string = readableMap.hasKey("uri") ? readableMap.getString("uri") : null;
                    d dVar = rNDocumentPickerModule.fileOps;
                    Uri uri = rNDocumentPickerModule.currentUriOfFileBeingExported;
                    ReactApplicationContext reactApplicationContext = rNDocumentPickerModule.getReactApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "access$getReactApplicationContext(...)");
                    ol.b bVarC = dVar.c(uri, string, reactApplicationContext);
                    f fVar = rNDocumentPickerModule.metadataGetter;
                    ContentResolver contentResolver = rNDocumentPickerModule.getReactApplicationContext().getContentResolver();
                    Intrinsics.checkNotNullExpressionValue(contentResolver, "getContentResolver(...)");
                    fVar.getClass();
                    f.b(contentResolver, bVarC, false);
                    WritableArray writableArrayCreateArray = Arguments.createArray();
                    writableArrayCreateArray.pushMap(bVarC.a());
                    promise.resolve(writableArrayCreateArray);
                } catch (Exception e10) {
                    promise.reject(e10);
                }
                break;
        }
        return Unit.f14616a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ReadableMap readableMap, RNDocumentPickerModule rNDocumentPickerModule, Promise promise, Continuation continuation) {
        super(2, continuation);
        this.f10284e = readableMap;
        this.f10285i = rNDocumentPickerModule;
        this.f10286v = promise;
    }
}
