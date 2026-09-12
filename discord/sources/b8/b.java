package b8;

import android.text.TextPaint;
import com.discord.span.utilities.GGSansItalicSpan;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3079d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ GGSansItalicSpan f3080e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ TextPaint f3081i;

    public /* synthetic */ b(GGSansItalicSpan gGSansItalicSpan, TextPaint textPaint, int i7) {
        this.f3079d = i7;
        this.f3080e = gGSansItalicSpan;
        this.f3081i = textPaint;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f3079d) {
            case 0:
                return GGSansItalicSpan.updateMeasureState$lambda$1(this.f3080e, this.f3081i);
            default:
                return GGSansItalicSpan.updateDrawState$lambda$0(this.f3080e, this.f3081i);
        }
    }
}
