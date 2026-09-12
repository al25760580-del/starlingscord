package n6;

import com.discord.chat.presentation.textutils.EmojiRendererKt;
import com.discord.chat.presentation.textutils.RenderContext;
import com.discord.chat.presentation.textutils.TextUtilsKt;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f16496d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ RenderContext f16497e;

    public /* synthetic */ b(RenderContext renderContext, int i7) {
        this.f16496d = i7;
        this.f16497e = renderContext;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f16496d) {
            case 0:
                return EmojiRendererKt.renderEmoji$lambda$2$lambda$1(this.f16497e, (GenericDraweeHierarchyBuilder) obj);
            default:
                return TextUtilsKt.toSpannable$lambda$71$lambda$70$lambda$69$lambda$68(this.f16497e, (GenericDraweeHierarchyBuilder) obj);
        }
    }
}
