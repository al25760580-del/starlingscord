package com.margelo.nitro.playagerangedeclaration;

import ar.k;
import com.google.android.play.agesignals.AgeSignalsResult;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import rn.q;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6900d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k f6901e;

    public /* synthetic */ c(k kVar, int i7) {
        this.f6900d = i7;
        this.f6901e = kVar;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0061  */
    /* JADX WARN: Code duplicated, block: B:39:0x006d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0078  */
    /* JADX WARN: Code duplicated, block: B:43:0x007f  */
    public void a(AgeSignalsResult ageSignalsResult) {
        PlayAgeRangeDeclarationUserStatus playAgeRangeDeclarationUserStatus;
        PlayAgeRangeDeclarationUserStatus playAgeRangeDeclarationUserStatus2;
        Integer numA;
        Double dValueOf;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        Date dateMostRecentApprovalDate = ageSignalsResult.mostRecentApprovalDate();
        String str = dateMostRecentApprovalDate != null ? simpleDateFormat.format(dateMostRecentApprovalDate) : null;
        Integer numUserStatus = ageSignalsResult.userStatus();
        if (numUserStatus != null && numUserStatus.intValue() == 0) {
            playAgeRangeDeclarationUserStatus2 = PlayAgeRangeDeclarationUserStatus.VERIFIED;
        } else if (numUserStatus != null && numUserStatus.intValue() == 1) {
            playAgeRangeDeclarationUserStatus2 = PlayAgeRangeDeclarationUserStatus.SUPERVISED;
        } else if (numUserStatus != null && numUserStatus.intValue() == 2) {
            playAgeRangeDeclarationUserStatus2 = PlayAgeRangeDeclarationUserStatus.SUPERVISED_APPROVAL_PENDING;
        } else {
            if (numUserStatus == null || numUserStatus.intValue() != 3) {
                if (numUserStatus != null && numUserStatus.intValue() == 4) {
                    playAgeRangeDeclarationUserStatus2 = PlayAgeRangeDeclarationUserStatus.UNKNOWN;
                } else {
                    playAgeRangeDeclarationUserStatus = null;
                }
                boolean z5 = playAgeRangeDeclarationUserStatus != null;
                String strD = ageSignalsResult.d();
                numA = ageSignalsResult.a();
                if (numA != null) {
                    dValueOf = Double.valueOf(numA.intValue());
                } else {
                    dValueOf = null;
                }
                Integer numC = ageSignalsResult.c();
                PlayAgeRangeDeclarationResult playAgeRangeDeclarationResult = new PlayAgeRangeDeclarationResult(z5, strD, playAgeRangeDeclarationUserStatus, null, dValueOf, numC != null ? Double.valueOf(numC.intValue()) : null, str);
                q qVar = Result.f14614e;
                this.f6901e.resumeWith(playAgeRangeDeclarationResult);
            }
            playAgeRangeDeclarationUserStatus2 = PlayAgeRangeDeclarationUserStatus.SUPERVISED_APPROVAL_DENIED;
        }
        playAgeRangeDeclarationUserStatus = playAgeRangeDeclarationUserStatus2;
        boolean z6 = playAgeRangeDeclarationUserStatus != null;
        String strD2 = ageSignalsResult.d();
        numA = ageSignalsResult.a();
        if (numA != null) {
            dValueOf = Double.valueOf(numA.intValue());
        } else {
            dValueOf = null;
        }
        Integer numC2 = ageSignalsResult.c();
        PlayAgeRangeDeclarationResult playAgeRangeDeclarationResult2 = new PlayAgeRangeDeclarationResult(z6, strD2, playAgeRangeDeclarationUserStatus, null, dValueOf, numC2 != null ? Double.valueOf(numC2.intValue()) : null, str);
        q qVar2 = Result.f14614e;
        this.f6901e.resumeWith(playAgeRangeDeclarationResult2);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f6900d) {
            case 0:
                a((AgeSignalsResult) obj);
                return Unit.f14616a;
            default:
                q qVar = Result.f14614e;
                Unit unit = Unit.f14616a;
                this.f6901e.resumeWith(unit);
                return unit;
        }
    }
}
