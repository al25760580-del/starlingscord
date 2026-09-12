package com.discord.chat.input.spans;

import com.discord.span.utilities.common.BackgroundStyle;
import com.discord.span.utilities.spannable.BackgroundSpan;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/input/spans/DCDBackgroundSpan;", "Lcom/discord/span/utilities/spannable/BackgroundSpan;", "Lcom/discord/chat/input/spans/DCDInputSpan;", "style", "Lcom/discord/span/utilities/common/BackgroundStyle;", "<init>", "(Lcom/discord/span/utilities/common/BackgroundStyle;)V", "chat_input_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DCDBackgroundSpan extends BackgroundSpan implements DCDInputSpan {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DCDBackgroundSpan(@NotNull BackgroundStyle style) {
        super(style, null, null, 6, null);
        Intrinsics.checkNotNullParameter(style, "style");
    }
}
