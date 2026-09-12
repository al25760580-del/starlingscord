package com.discord.device.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.device.utils.IsMetaQuestKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\u000bJ\u0012\u0010\u0010\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016R\u0014\u0010\f\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/discord/device/views/DiscordRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "canScrollAnyDirection", "", "getCanScrollAnyDirection", "()Z", "onGenericMotionEvent", "event", "Landroid/view/MotionEvent;", "device_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class DiscordRecyclerView extends RecyclerView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiscordRecyclerView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        if (IsMetaQuestKt.isMetaQuest()) {
            setOverScrollMode(2);
        }
    }

    private final boolean getCanScrollAnyDirection() {
        return canScrollVertically(1) || canScrollVertically(-1) || canScrollHorizontally(1) || canScrollHorizontally(-1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onGenericMotionEvent(MotionEvent event) {
        if (!IsMetaQuestKt.isMetaQuest() || event == null || event.getAction() != 8) {
            super.onGenericMotionEvent(event);
            return false;
        }
        boolean canScrollAnyDirection = getCanScrollAnyDirection();
        if (canScrollAnyDirection) {
            super.onGenericMotionEvent(event);
        }
        return canScrollAnyDirection;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiscordRecyclerView(@NotNull Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        if (IsMetaQuestKt.isMetaQuest()) {
            setOverScrollMode(2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiscordRecyclerView(@NotNull Context context) {
        super(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
        if (IsMetaQuestKt.isMetaQuest()) {
            setOverScrollMode(2);
        }
    }
}
