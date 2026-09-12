package com.discord.chat.presentation.message.viewholder;

import com.discord.chat.presentation.events.ChatEventHandler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public /* synthetic */ class FileAttachmentViewHolder$bind$uploadItemProps$1 extends FunctionReferenceImpl implements Function2<String, String, Unit> {
    public FileAttachmentViewHolder$bind$uploadItemProps$1(Object obj) {
        super(2, obj, ChatEventHandler.class, "onTapCancelUploadItem", "onTapCancelUploadItem(Ljava/lang/String;Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((String) obj, (String) obj2);
        return Unit.f14616a;
    }

    public final void invoke(String p3, String p5) {
        Intrinsics.checkNotNullParameter(p3, "p0");
        Intrinsics.checkNotNullParameter(p5, "p1");
        ((ChatEventHandler) this.receiver).onTapCancelUploadItem(p3, p5);
    }
}
