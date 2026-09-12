package n6;

import android.view.View;
import com.discord.chat.bridge.contentnode.LinkContentNode;
import com.discord.chat.presentation.textutils.RenderContext;
import com.discord.chat.presentation.textutils.TextUtilsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f16501d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ RenderContext f16502e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ LinkContentNode f16503i;

    public /* synthetic */ d(LinkContentNode linkContentNode, RenderContext renderContext) {
        this.f16503i = linkContentNode;
        this.f16502e = renderContext;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f16501d) {
            case 0:
                return Boolean.valueOf(TextUtilsKt.toSpannable$lambda$71$lambda$22(this.f16503i, this.f16502e, (View) obj));
            default:
                return TextUtilsKt.toSpannable$lambda$71$lambda$23(this.f16502e, this.f16503i, (View) obj);
        }
    }

    public /* synthetic */ d(RenderContext renderContext, LinkContentNode linkContentNode) {
        this.f16502e = renderContext;
        this.f16503i = linkContentNode;
    }
}
