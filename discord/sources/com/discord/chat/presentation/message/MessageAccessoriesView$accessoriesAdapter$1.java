package com.discord.chat.presentation.message;

import android.view.View;
import com.discord.misc.utilities.measure.ViewMeasureExtensionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public /* synthetic */ class MessageAccessoriesView$accessoriesAdapter$1 extends FunctionReferenceImpl implements Function0<Unit> {
    public MessageAccessoriesView$accessoriesAdapter$1(Object obj) {
        super(0, obj, ViewMeasureExtensionsKt.class, "measureAndLayout", "measureAndLayout(Landroid/view/View;)V", 1);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m568invoke();
        return Unit.f14616a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m568invoke() {
        ViewMeasureExtensionsKt.measureAndLayout((View) this.receiver);
    }
}
