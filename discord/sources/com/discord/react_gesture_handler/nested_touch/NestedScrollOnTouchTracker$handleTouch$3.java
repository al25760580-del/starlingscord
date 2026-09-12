package com.discord.react_gesture_handler.nested_touch;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import xn.d;
import xn.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@d(c = "com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchTracker$handleTouch$3", f = "NestedScrollOnTouchTracker.kt", l = {117, 123}, m = "invokeSuspend")
public final class NestedScrollOnTouchTracker$handleTouch$3 extends h implements Function2<CoroutineScope, Continuation, Object> {
    final /* synthetic */ View $view;
    int label;
    final /* synthetic */ NestedScrollOnTouchTracker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollOnTouchTracker$handleTouch$3(NestedScrollOnTouchTracker nestedScrollOnTouchTracker, View view, Continuation continuation) {
        super(2, continuation);
        this.this$0 = nestedScrollOnTouchTracker;
        this.$view = view;
    }

    @Override // xn.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new NestedScrollOnTouchTracker$handleTouch$3(this.this$0, this.$view, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        if (ar.b0.j(r4, r8) == r0) goto L15;
     */
    @Override // xn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            wn.a r0 = wn.a.f22354d
            int r1 = r8.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            ib.a.L(r9)
            goto L4f
        L10:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L18:
            ib.a.L(r9)
            goto L30
        L1c:
            ib.a.L(r9)
            com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchTracker$Companion r9 = com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchTracker.access$getCompanion$p()
            long r4 = r9.getDOUBLE_CLICK_MIN_TIME()
            r8.label = r3
            java.lang.Object r9 = ar.b0.j(r4, r8)
            if (r9 != r0) goto L30
            goto L4e
        L30:
            com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchTracker r9 = r8.this$0
            com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchTracker.access$setConsideringDoubleClick$p(r9, r3)
            com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchTracker$Companion r9 = com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchTracker.access$getCompanion$p()
            long r4 = r9.getDOUBLE_CLICK_TIME()
            com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchTracker$Companion r9 = com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchTracker.access$getCompanion$p()
            long r6 = r9.getDOUBLE_CLICK_MIN_TIME()
            long r4 = r4 - r6
            r8.label = r2
            java.lang.Object r9 = ar.b0.j(r4, r8)
            if (r9 != r0) goto L4f
        L4e:
            return r0
        L4f:
            com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchTracker r9 = r8.this$0
            r0 = 0
            com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchTracker.access$setConsideringDoubleClick$p(r9, r0)
            com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchTracker r9 = r8.this$0
            boolean r9 = com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchTracker.access$getActiveClick$p(r9)
            if (r9 != 0) goto L93
            com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchTracker r9 = r8.this$0
            com.discord.react_gesture_handler.nested_touch.NestedClickableSpan r9 = com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchTracker.access$getSpanBeingTouched$p(r9)
            if (r9 == 0) goto L73
            com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchTracker r9 = r8.this$0
            com.discord.react_gesture_handler.nested_touch.NestedClickableSpan r9 = com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchTracker.access$getSpanBeingTouched$p(r9)
            if (r9 == 0) goto L8b
            android.view.View r0 = r8.$view
            r9.onClick(r0)
            goto L8b
        L73:
            com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchTracker r9 = r8.this$0
            android.view.View$OnClickListener r9 = com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchTracker.access$getOnClickListener$p(r9)
            if (r9 == 0) goto L8b
            android.view.View r9 = r8.$view
            r9.setPressed(r3)
            com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchTracker r9 = r8.this$0
            android.view.View$OnClickListener r9 = com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchTracker.access$getOnClickListener$p(r9)
            android.view.View r0 = r8.$view
            r9.onClick(r0)
        L8b:
            com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchTracker r9 = r8.this$0
            android.view.View r0 = r8.$view
            com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchTracker.access$cleanUp(r9, r0)
            goto L98
        L93:
            com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchTracker r9 = r8.this$0
            com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchTracker.access$cleanupDoubleClickJob(r9)
        L98:
            kotlin.Unit r9 = kotlin.Unit.f14616a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchTracker$handleTouch$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((NestedScrollOnTouchTracker$handleTouch$3) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
    }
}
