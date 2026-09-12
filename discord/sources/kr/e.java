package kr;

import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import m3.m;
import or.s1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14801d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ SealedClassSerializer f14802e;

    public /* synthetic */ e(SealedClassSerializer sealedClassSerializer, int i7) {
        this.f14801d = i7;
        this.f14802e = sealedClassSerializer;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        mr.a buildSerialDescriptor = (mr.a) obj;
        switch (this.f14801d) {
            case 0:
                Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
                com.facebook.imagepipeline.nativecode.b.z(StringCompanionObject.INSTANCE);
                mr.a.a(buildSerialDescriptor, "type", s1.f17603b);
                StringBuilder sb2 = new StringBuilder("kotlinx.serialization.Sealed<");
                SealedClassSerializer sealedClassSerializer = this.f14802e;
                sb2.append(sealedClassSerializer.f14755a.getSimpleName());
                sb2.append('>');
                e eVar = new e(sealedClassSerializer, 1);
                mr.a.a(buildSerialDescriptor, "value", m.g(sb2.toString(), mr.h.f16075b, new SerialDescriptor[0], eVar));
                List list = sealedClassSerializer.f14756b;
                Intrinsics.checkNotNullParameter(list, "<set-?>");
                buildSerialDescriptor.f16046b = list;
                break;
            default:
                Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
                for (Map.Entry entry : this.f14802e.f14759e.entrySet()) {
                    mr.a.a(buildSerialDescriptor, (String) entry.getKey(), ((KSerializer) entry.getValue()).getDescriptor());
                }
                break;
        }
        return Unit.f14616a;
    }
}
