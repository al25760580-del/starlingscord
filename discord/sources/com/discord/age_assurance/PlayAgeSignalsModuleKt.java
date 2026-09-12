package com.discord.age_assurance;

import com.discord.logging.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.google.android.play.agesignals.AgeSignalsAccessResult;
import com.google.android.play.agesignals.AgeSignalsResult;
import com.google.firebase.messaging.r;
import java.util.Date;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import ph.i;
import ph.j;
import s0.g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\u001a\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\u001a\u0017\u0010\t\u001a\u00020\n2\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0002\u0010\u000b\u001a\f\u0010\f\u001a\u00020\n*\u00020\bH\u0002¨\u0006\r"}, d2 = {"fakeAccessResult", "Lcom/google/android/play/agesignals/AgeSignalsAccessResult;", "status", "", "accessStatusFor", "scenario", "", "buildFakeResult", "Lcom/google/android/play/agesignals/AgeSignalsResult;", "statusOnlyMap", "Lcom/facebook/react/bridge/WritableMap;", "(Ljava/lang/Integer;)Lcom/facebook/react/bridge/WritableMap;", "toWritableMap", "age_assurance_androidRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPlayAgeSignalsModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlayAgeSignalsModule.kt\ncom/discord/age_assurance/PlayAgeSignalsModuleKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,212:1\n1#2:213\n*E\n"})
public final class PlayAgeSignalsModuleKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int accessStatusFor(String str) {
        if (Intrinsics.areEqual(str, "not_shared")) {
            return 2;
        }
        return Intrinsics.areEqual(str, "verification_required") ? 3 : 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:43:0x0108  */
    public static final AgeSignalsResult buildFakeResult(String str) {
        r rVar = new r();
        Intrinsics.checkNotNullExpressionValue(rVar, "builder(...)");
        switch (str) {
            case "supervised_pending":
                rVar.f6610d = 2;
                rVar.f6611e = 13;
                rVar.f6612i = 17;
                rVar.f6613v = 2;
                Intrinsics.checkNotNullExpressionValue(rVar, "setSignificantChangeStatus(...)");
                break;
            case "adult_assessed":
                rVar.f6610d = 3;
                rVar.f6611e = 18;
                Intrinsics.checkNotNullExpressionValue(rVar, "setAgeLower(...)");
                break;
            case "adult_self_declared":
                rVar.f6610d = 1;
                rVar.f6611e = 18;
                Intrinsics.checkNotNullExpressionValue(rVar, "setAgeLower(...)");
                break;
            case "under_13":
                rVar.f6610d = 2;
                rVar.f6611e = 0;
                rVar.f6612i = 12;
                Intrinsics.checkNotNullExpressionValue(rVar, "setAgeUpper(...)");
                break;
            case "teen":
                rVar.f6610d = 2;
                rVar.f6611e = 13;
                rVar.f6612i = 17;
                Intrinsics.checkNotNullExpressionValue(rVar, "setAgeUpper(...)");
                break;
            case "adult":
                rVar.f6610d = 4;
                rVar.f6611e = 18;
                Intrinsics.checkNotNullExpressionValue(rVar, "setAgeLower(...)");
                break;
            case "empty":
                Unit unit = Unit.f14616a;
                break;
            case "supervised_declined":
                rVar.f6610d = 2;
                rVar.f6611e = 13;
                rVar.f6612i = 17;
                rVar.f6613v = 3;
                Intrinsics.checkNotNullExpressionValue(rVar, "setSignificantChangeStatus(...)");
                break;
            case "supervised_approved":
                rVar.f6610d = 2;
                rVar.f6611e = 13;
                rVar.f6612i = 17;
                rVar.f6613v = 1;
                Intrinsics.checkNotNullExpressionValue(rVar, "setSignificantChangeStatus(...)");
                break;
            case "under_13_declined":
                rVar.f6610d = 2;
                rVar.f6611e = 0;
                rVar.f6612i = 12;
                rVar.f6613v = 3;
                Intrinsics.checkNotNullExpressionValue(rVar, "setSignificantChangeStatus(...)");
                break;
            default:
                Log.w$default(Log.INSTANCE, PlayAgeSignalsModule.TAG, g.e("Unknown fake scenario '", str, "'; returning empty result"), (Throwable) null, 4, (Object) null);
                Unit unit2 = Unit.f14616a;
                break;
        }
        j jVar = new j((Integer) rVar.f6610d, (Integer) rVar.f6611e, (Integer) rVar.f6612i, null, (Integer) rVar.f6613v, null);
        Intrinsics.checkNotNullExpressionValue(jVar, "build(...)");
        return jVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AgeSignalsAccessResult fakeAccessResult(int i7) {
        i iVar = new i(Integer.valueOf(i7));
        Intrinsics.checkNotNullExpressionValue(iVar, "build(...)");
        return iVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WritableMap statusOnlyMap(Integer num) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        if (num != null) {
            writableMapCreateMap.putInt("ageSignalsStatus", num.intValue());
        }
        return writableMapCreateMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WritableMap toWritableMap(AgeSignalsResult ageSignalsResult) {
        WritableMap writableMapStatusOnlyMap = statusOnlyMap(1);
        Integer numB = ageSignalsResult.b();
        if (numB != null) {
            writableMapStatusOnlyMap.putInt("ageRangeSource", numB.intValue());
        }
        Integer numA = ageSignalsResult.a();
        if (numA != null) {
            writableMapStatusOnlyMap.putInt("ageLower", numA.intValue());
        }
        Integer numC = ageSignalsResult.c();
        if (numC != null) {
            writableMapStatusOnlyMap.putInt("ageUpper", numC.intValue());
        }
        Integer numF = ageSignalsResult.f();
        if (numF != null) {
            writableMapStatusOnlyMap.putInt("significantChangeStatus", numF.intValue());
        }
        Date dateE = ageSignalsResult.e();
        if (dateE != null) {
            writableMapStatusOnlyMap.putDouble("significantChangeApprovalDate", dateE.getTime());
        }
        String strD = ageSignalsResult.d();
        if (strD != null) {
            writableMapStatusOnlyMap.putString("installId", strD);
        }
        return writableMapStatusOnlyMap;
    }
}
