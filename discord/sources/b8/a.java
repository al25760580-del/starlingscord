package b8;

import android.text.TextPaint;
import com.discord.span.utilities.GGSansBoldSpan;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3076d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ GGSansBoldSpan f3077e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ TextPaint f3078i;

    public /* synthetic */ a(GGSansBoldSpan gGSansBoldSpan, TextPaint textPaint, int i7) {
        this.f3076d = i7;
        this.f3077e = gGSansBoldSpan;
        this.f3078i = textPaint;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f3076d) {
            case 0:
                return GGSansBoldSpan.updateDrawState$lambda$0(this.f3077e, this.f3078i);
            default:
                return GGSansBoldSpan.updateMeasureState$lambda$1(this.f3077e, this.f3078i);
        }
    }
}
