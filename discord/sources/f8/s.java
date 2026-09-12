package f8;

import android.content.res.Resources;
import com.discord.theme.DarkerTheme;
import com.discord.theme.DarkerThemeExperiment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class s implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8985d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Resources f8986e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Resources.Theme f8987i;

    public /* synthetic */ s(Resources resources, int i7, Resources.Theme theme) {
        this.f8985d = i7;
        this.f8986e = resources;
        this.f8987i = theme;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int iBackgroundSurfaceHigh_delegate$lambda$16;
        switch (this.f8985d) {
            case 0:
                iBackgroundSurfaceHigh_delegate$lambda$16 = DarkerTheme.backgroundSurfaceHigh_delegate$lambda$16(this.f8986e, this.f8987i);
                break;
            case 1:
                iBackgroundSurfaceHigh_delegate$lambda$16 = DarkerTheme.switchBorderDefault_delegate$lambda$170(this.f8986e, this.f8987i);
                break;
            case 2:
                iBackgroundSurfaceHigh_delegate$lambda$16 = DarkerTheme.switchBorderSelectedDefault_delegate$lambda$171(this.f8986e, this.f8987i);
                break;
            case 3:
                iBackgroundSurfaceHigh_delegate$lambda$16 = DarkerTheme.inputBorderDefault_delegate$lambda$106(this.f8986e, this.f8987i);
                break;
            case 4:
                iBackgroundSurfaceHigh_delegate$lambda$16 = DarkerTheme.switchThumbBackgroundDefault_delegate$lambda$172(this.f8986e, this.f8987i);
                break;
            case 5:
                iBackgroundSurfaceHigh_delegate$lambda$16 = DarkerTheme.switchThumbBackgroundSelectedDefault_delegate$lambda$173(this.f8986e, this.f8987i);
                break;
            case 6:
                iBackgroundSurfaceHigh_delegate$lambda$16 = DarkerTheme.switchThumbIconActive_delegate$lambda$174(this.f8986e, this.f8987i);
                break;
            case 7:
                iBackgroundSurfaceHigh_delegate$lambda$16 = DarkerTheme.switchThumbIconDefault_delegate$lambda$175(this.f8986e, this.f8987i);
                break;
            case 8:
                iBackgroundSurfaceHigh_delegate$lambda$16 = DarkerTheme.tabBarBackground_delegate$lambda$176(this.f8986e, this.f8987i);
                break;
            case 9:
                iBackgroundSurfaceHigh_delegate$lambda$16 = DarkerTheme.tabLabelTextDefault_delegate$lambda$177(this.f8986e, this.f8987i);
                break;
            case 10:
                iBackgroundSurfaceHigh_delegate$lambda$16 = DarkerTheme.tabLabelTextFocused_delegate$lambda$178(this.f8986e, this.f8987i);
                break;
            case 11:
                iBackgroundSurfaceHigh_delegate$lambda$16 = DarkerTheme.tablerowBackgroundDefault_delegate$lambda$179(this.f8986e, this.f8987i);
                break;
            case 12:
                iBackgroundSurfaceHigh_delegate$lambda$16 = DarkerTheme.backgroundSurfaceHighest_delegate$lambda$17(this.f8986e, this.f8987i);
                break;
            case 13:
                iBackgroundSurfaceHigh_delegate$lambda$16 = DarkerTheme.tablerowBackgroundPressed_delegate$lambda$180(this.f8986e, this.f8987i);
                break;
            case 14:
                iBackgroundSurfaceHigh_delegate$lambda$16 = DarkerTheme.inputBorderErrorDefault_delegate$lambda$107(this.f8986e, this.f8987i);
                break;
            case 15:
                iBackgroundSurfaceHigh_delegate$lambda$16 = DarkerTheme.tablerowIconColorDefault_delegate$lambda$181(this.f8986e, this.f8987i);
                break;
            case 16:
                iBackgroundSurfaceHigh_delegate$lambda$16 = DarkerTheme.textBrand_delegate$lambda$182(this.f8986e, this.f8987i);
                break;
            case 17:
                iBackgroundSurfaceHigh_delegate$lambda$16 = DarkerTheme.textCode_delegate$lambda$183(this.f8986e, this.f8987i);
                break;
            case 18:
                iBackgroundSurfaceHigh_delegate$lambda$16 = DarkerTheme.textCodeAddition_delegate$lambda$184(this.f8986e, this.f8987i);
                break;
            case 19:
                iBackgroundSurfaceHigh_delegate$lambda$16 = DarkerTheme.textCodeBuiltin_delegate$lambda$185(this.f8986e, this.f8987i);
                break;
            case 20:
                iBackgroundSurfaceHigh_delegate$lambda$16 = DarkerTheme.textCodeComment_delegate$lambda$186(this.f8986e, this.f8987i);
                break;
            case 21:
                iBackgroundSurfaceHigh_delegate$lambda$16 = DarkerTheme.textCodeDeletion_delegate$lambda$187(this.f8986e, this.f8987i);
                break;
            case 22:
                iBackgroundSurfaceHigh_delegate$lambda$16 = DarkerTheme.textCodeKeyword_delegate$lambda$188(this.f8986e, this.f8987i);
                break;
            case 23:
                iBackgroundSurfaceHigh_delegate$lambda$16 = DarkerTheme.textCodeProperty_delegate$lambda$189(this.f8986e, this.f8987i);
                break;
            case 24:
                iBackgroundSurfaceHigh_delegate$lambda$16 = DarkerTheme.backgroundVoiceMuted_delegate$lambda$18(this.f8986e, this.f8987i);
                break;
            case 25:
                iBackgroundSurfaceHigh_delegate$lambda$16 = DarkerTheme.inputIconDefault_delegate$lambda$108(this.f8986e, this.f8987i);
                break;
            case 26:
                iBackgroundSurfaceHigh_delegate$lambda$16 = DarkerThemeExperiment.activityTimebarProgressBackground_delegate$lambda$0(this.f8986e, this.f8987i);
                break;
            case 27:
                iBackgroundSurfaceHigh_delegate$lambda$16 = DarkerThemeExperiment.iconFeedbackCritical_delegate$lambda$64(this.f8986e, this.f8987i);
                break;
            case 28:
                iBackgroundSurfaceHigh_delegate$lambda$16 = DarkerThemeExperiment.iconFeedbackInfo_delegate$lambda$65(this.f8986e, this.f8987i);
                break;
            default:
                iBackgroundSurfaceHigh_delegate$lambda$16 = DarkerThemeExperiment.iconFeedbackNotification_delegate$lambda$66(this.f8986e, this.f8987i);
                break;
        }
        return Integer.valueOf(iBackgroundSurfaceHigh_delegate$lambda$16);
    }
}
