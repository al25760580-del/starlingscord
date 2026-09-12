package f8;

import android.content.res.Resources;
import com.discord.theme.DarkTheme;
import com.discord.theme.DarkThemeExperiment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8919d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Resources f8920e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Resources.Theme f8921i;

    public /* synthetic */ h(Resources resources, int i7, Resources.Theme theme) {
        this.f8919d = i7;
        this.f8920e = resources;
        this.f8921i = theme;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int iTextCodeProperty_delegate$lambda$189;
        switch (this.f8919d) {
            case 0:
                iTextCodeProperty_delegate$lambda$189 = DarkTheme.textCodeProperty_delegate$lambda$189(this.f8920e, this.f8921i);
                break;
            case 1:
                iTextCodeProperty_delegate$lambda$189 = DarkTheme.backgroundVoiceMuted_delegate$lambda$18(this.f8920e, this.f8921i);
                break;
            case 2:
                iTextCodeProperty_delegate$lambda$189 = DarkTheme.inputIconDefault_delegate$lambda$108(this.f8920e, this.f8921i);
                break;
            case 3:
                iTextCodeProperty_delegate$lambda$189 = DarkThemeExperiment.activityTimebarProgressBackground_delegate$lambda$0(this.f8920e, this.f8921i);
                break;
            case 4:
                iTextCodeProperty_delegate$lambda$189 = DarkThemeExperiment.iconFeedbackCritical_delegate$lambda$64(this.f8920e, this.f8921i);
                break;
            case 5:
                iTextCodeProperty_delegate$lambda$189 = DarkThemeExperiment.iconFeedbackInfo_delegate$lambda$65(this.f8920e, this.f8921i);
                break;
            case 6:
                iTextCodeProperty_delegate$lambda$189 = DarkThemeExperiment.iconFeedbackNotification_delegate$lambda$66(this.f8920e, this.f8921i);
                break;
            case 7:
                iTextCodeProperty_delegate$lambda$189 = DarkThemeExperiment.iconFeedbackWarning_delegate$lambda$67(this.f8920e, this.f8921i);
                break;
            case 8:
                iTextCodeProperty_delegate$lambda$189 = DarkThemeExperiment.inputBackgroundDefault_delegate$lambda$68(this.f8920e, this.f8921i);
                break;
            case 9:
                iTextCodeProperty_delegate$lambda$189 = DarkThemeExperiment.inputBorderActive_delegate$lambda$69(this.f8920e, this.f8921i);
                break;
            case 10:
                iTextCodeProperty_delegate$lambda$189 = DarkThemeExperiment.backgroundFeedbackNotification_delegate$lambda$6(this.f8920e, this.f8921i);
                break;
            case 11:
                iTextCodeProperty_delegate$lambda$189 = DarkThemeExperiment.inputBorderDefault_delegate$lambda$70(this.f8920e, this.f8921i);
                break;
            case 12:
                iTextCodeProperty_delegate$lambda$189 = DarkThemeExperiment.inputBorderErrorDefault_delegate$lambda$71(this.f8920e, this.f8921i);
                break;
            case 13:
                iTextCodeProperty_delegate$lambda$189 = DarkThemeExperiment.inputIconDefault_delegate$lambda$72(this.f8920e, this.f8921i);
                break;
            case 14:
                iTextCodeProperty_delegate$lambda$189 = DarkThemeExperiment.switchBackgroundSelectedDefault_delegate$lambda$109(this.f8920e, this.f8921i);
                break;
            case 15:
                iTextCodeProperty_delegate$lambda$189 = DarkThemeExperiment.interactiveBackgroundSelected_delegate$lambda$73(this.f8920e, this.f8921i);
                break;
            case 16:
                iTextCodeProperty_delegate$lambda$189 = DarkThemeExperiment.interactiveIconActive_delegate$lambda$74(this.f8920e, this.f8921i);
                break;
            case 17:
                iTextCodeProperty_delegate$lambda$189 = DarkThemeExperiment.interactiveIconDefault_delegate$lambda$75(this.f8920e, this.f8921i);
                break;
            case 18:
                iTextCodeProperty_delegate$lambda$189 = DarkThemeExperiment.interactiveTextActive_delegate$lambda$76(this.f8920e, this.f8921i);
                break;
            case 19:
                iTextCodeProperty_delegate$lambda$189 = DarkThemeExperiment.interactiveTextDefault_delegate$lambda$77(this.f8920e, this.f8921i);
                break;
            case 20:
                iTextCodeProperty_delegate$lambda$189 = DarkThemeExperiment.messageHighlightBackgroundDefault_delegate$lambda$78(this.f8920e, this.f8921i);
                break;
            case 21:
                iTextCodeProperty_delegate$lambda$189 = DarkThemeExperiment.messagesItemChannelTextDefault_delegate$lambda$79(this.f8920e, this.f8921i);
                break;
            case 22:
                iTextCodeProperty_delegate$lambda$189 = DarkThemeExperiment.backgroundModNormal_delegate$lambda$7(this.f8920e, this.f8921i);
                break;
            case 23:
                iTextCodeProperty_delegate$lambda$189 = DarkThemeExperiment.mobileActionsheetBackground_delegate$lambda$80(this.f8920e, this.f8921i);
                break;
            case 24:
                iTextCodeProperty_delegate$lambda$189 = DarkThemeExperiment.mobileChannelItemBackgroundSelected_delegate$lambda$81(this.f8920e, this.f8921i);
                break;
            case 25:
                iTextCodeProperty_delegate$lambda$189 = DarkThemeExperiment.backgroundScrim_delegate$lambda$10(this.f8920e, this.f8921i);
                break;
            case 26:
                iTextCodeProperty_delegate$lambda$189 = DarkThemeExperiment.mobileCoachmarkBorderDefault_delegate$lambda$82(this.f8920e, this.f8921i);
                break;
            case 27:
                iTextCodeProperty_delegate$lambda$189 = DarkThemeExperiment.mobileEmbedBackgroundDefault_delegate$lambda$83(this.f8920e, this.f8921i);
                break;
            case 28:
                iTextCodeProperty_delegate$lambda$189 = DarkThemeExperiment.mobileEmojiButtonBackground_delegate$lambda$84(this.f8920e, this.f8921i);
                break;
            default:
                iTextCodeProperty_delegate$lambda$189 = DarkThemeExperiment.mobileGuildbarIconBackgroundDefault_delegate$lambda$85(this.f8920e, this.f8921i);
                break;
        }
        return Integer.valueOf(iTextCodeProperty_delegate$lambda$189);
    }
}
