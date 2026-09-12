package com.discord.chat.presentation.list;

import android.graphics.Canvas;
import android.util.Pair;
import androidx.core.view.u0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h0;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
abstract class ChatListCallback extends h0 {
    public final int getAbsoluteMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        int movementFlags = getMovementFlags(recyclerView, viewHolder);
        WeakHashMap weakHashMap = u0.f1729a;
        return convertToAbsoluteDirection(movementFlags, recyclerView.getLayoutDirection());
    }

    public Pair getEffectiveDxDy(float f2, float f7) {
        return new Pair(Float.valueOf(f2), Float.valueOf(f7));
    }

    public boolean hasDragFlag(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        return (getAbsoluteMovementFlags(recyclerView, viewHolder) & 16711680) != 0;
    }

    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, List<ChatListItemTouchHelper.RecoverAnimation> list, int i7, float f2, float f7) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            ChatListItemTouchHelper.RecoverAnimation recoverAnimation = list.get(i10);
            recoverAnimation.update();
            int iSave = canvas.save();
            onChildDraw(canvas, recyclerView, recoverAnimation.mViewHolder, recoverAnimation.mX, recoverAnimation.mY, recoverAnimation.mActionState, false);
            canvas.restoreToCount(iSave);
        }
        if (viewHolder != null) {
            int iSave2 = canvas.save();
            onChildDraw(canvas, recyclerView, viewHolder, f2, f7, i7, true);
            canvas.restoreToCount(iSave2);
        }
    }

    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, List<ChatListItemTouchHelper.RecoverAnimation> list, int i7, float f2, float f7) {
        int size = list.size();
        boolean z5 = false;
        for (int i10 = 0; i10 < size; i10++) {
            ChatListItemTouchHelper.RecoverAnimation recoverAnimation = list.get(i10);
            int iSave = canvas.save();
            onChildDrawOver(canvas, recyclerView, recoverAnimation.mViewHolder, recoverAnimation.mX, recoverAnimation.mY, recoverAnimation.mActionState, false);
            canvas.restoreToCount(iSave);
        }
        if (viewHolder != null) {
            int iSave2 = canvas.save();
            onChildDrawOver(canvas, recyclerView, viewHolder, f2, f7, i7, true);
            canvas.restoreToCount(iSave2);
        }
        for (int i11 = size - 1; i11 >= 0; i11--) {
            ChatListItemTouchHelper.RecoverAnimation recoverAnimation2 = list.get(i11);
            boolean z6 = recoverAnimation2.mEnded;
            if (z6 && !recoverAnimation2.mIsPendingCleanup) {
                list.remove(i11);
            } else if (!z6) {
                z5 = true;
            }
        }
        if (z5) {
            recyclerView.invalidate();
        }
    }

    public abstract void onReleased(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder);

    public boolean shouldReturnToOriginalPosition() {
        return false;
    }

    /* JADX INFO: renamed from: shouldUseSpringyExit */
    public boolean getShouldTriggerReply() {
        return false;
    }
}
