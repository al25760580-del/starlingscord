package mq;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import lq.z;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class t extends FunctionReferenceImpl implements Function2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f16043d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(int i7) {
        super(2, t1.d.f20573a, t1.a.class, "getCredentialExceptionTypeToException", "getCredentialExceptionTypeToException$credentials_play_services_auth(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", 0);
        this.f16043d = i7;
        switch (i7) {
            case 5:
                super(2, t1.d.f20573a, t1.a.class, "createCredentialExceptionTypeToException", "createCredentialExceptionTypeToException$credentials_play_services_auth(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/CreateCredentialException;", 0);
                break;
            case 6:
                super(2, t1.d.f20573a, t1.a.class, "createCredentialExceptionTypeToException", "createCredentialExceptionTypeToException$credentials_play_services_auth(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/CreateCredentialException;", 0);
                break;
            case 7:
                super(2, t1.d.f20573a, t1.a.class, "getCredentialExceptionTypeToException", "getCredentialExceptionTypeToException$credentials_play_services_auth(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", 0);
                break;
            case 8:
                super(2, t1.d.f20573a, t1.a.class, "getCredentialExceptionTypeToException", "getCredentialExceptionTypeToException$credentials_play_services_auth(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", 0);
                break;
            default:
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f16043d) {
            case 0:
                z p3 = (z) obj;
                z p5 = (z) obj2;
                Intrinsics.checkNotNullParameter(p3, "p0");
                Intrinsics.checkNotNullParameter(p5, "p1");
                ((u) this.receiver).getClass();
                k.f16033b.getClass();
                l lVar = j.f16032b;
                return Boolean.valueOf(lVar.b(p3, p5) && !lVar.b(p5, p3));
            case 1:
                z p6 = (z) obj;
                z p10 = (z) obj2;
                Intrinsics.checkNotNullParameter(p6, "p0");
                Intrinsics.checkNotNullParameter(p10, "p1");
                return Boolean.valueOf(((l) this.receiver).a(p6, p10));
            case 2:
                int iIntValue = ((Number) obj).intValue();
                ReactContext p11 = (ReactContext) obj2;
                Intrinsics.checkNotNullParameter(p11, "p1");
                ((qb.c) this.receiver).getClass();
                if (p11.hasActiveReactInstance()) {
                    WritableMap writableMapCreateMap = Arguments.createMap();
                    Integer num = qb.e.f18684v;
                    if (num == null || iIntValue != num.intValue()) {
                        writableMapCreateMap.putInt("orientationDegrees", iIntValue);
                        ((DeviceEventManagerModule.RCTDeviceEventEmitter) p11.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("orientationDegreesDidChange", writableMapCreateMap);
                        qb.e.f18684v = Integer.valueOf(iIntValue);
                    }
                }
                return Unit.f14616a;
            case 3:
                SerialDescriptor p12 = (SerialDescriptor) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                Intrinsics.checkNotNullParameter(p12, "p0");
                qr.n nVar = (qr.n) this.receiver;
                nVar.getClass();
                boolean z5 = !p12.k(iIntValue2) && p12.j(iIntValue2).e();
                nVar.f19026b = z5;
                return Boolean.valueOf(z5);
            case 4:
                ((t1.a) this.receiver).getClass();
                return t1.a.b((String) obj, (String) obj2);
            case 5:
                ((t1.a) this.receiver).getClass();
                return t1.a.a((String) obj, (String) obj2);
            case 6:
                ((t1.a) this.receiver).getClass();
                return t1.a.a((String) obj, (String) obj2);
            case 7:
                ((t1.a) this.receiver).getClass();
                return t1.a.b((String) obj, (String) obj2);
            default:
                ((t1.a) this.receiver).getClass();
                return t1.a.b((String) obj, (String) obj2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(int i7, Object obj, Class cls, String str, String str2, int i10, int i11) {
        super(i7, obj, cls, str, str2, i10);
        this.f16043d = i11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(Object obj) {
        super(2, obj, l.class, "equalTypes", "equalTypes(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z", 0);
        this.f16043d = 1;
    }
}
