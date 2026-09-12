package com.discord.chat.presentation.message.view.mosaic_recycler;

import a3.e;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.R;
import com.discord.logging.Log;
import ho.c;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u001e\u0010\u0011\u001a\u00020\u00122\n\u0010\u0013\u001a\u00060\u0014R\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u0018\u001a\u00020\rH\u0016J\u000e\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\tJ\u0016\u0010\u001a\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0018\u00010\u0014R\u00020\u0015H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/discord/chat/presentation/message/view/mosaic_recycler/MosaicLayoutManager;", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "spacingPx", "", "mediaMaxHeight", "availableWidth", "canScrollHorizontally", "", "canScrollVertically", "generateDefaultLayoutParams", "Landroidx/recyclerview/widget/RecyclerView$LayoutParams;", "onLayoutChildren", "", "recycler", "Landroidx/recyclerview/widget/RecyclerView$Recycler;", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "isAutoMeasureEnabled", "setAvailableWidth", "fill", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MosaicLayoutManager extends RecyclerView.LayoutManager {
    private int availableWidth;

    @NotNull
    private final Context context;
    private final int mediaMaxHeight;
    private final int spacingPx;

    public MosaicLayoutManager(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.spacingPx = context.getResources().getDimensionPixelSize(R.dimen.message_media_grid_spacing);
        this.mediaMaxHeight = context.getResources().getDimensionPixelSize(R.dimen.message_media_max_height);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0091  */
    /* JADX WARN: Code duplicated, block: B:57:0x0114  */
    /* JADX WARN: Code duplicated, block: B:61:0x0121  */
    /* JADX WARN: Code duplicated, block: B:62:0x0123  */
    /* JADX WARN: Multi-variable type inference failed */
    private final void fill(RecyclerView.Recycler recycler) {
        Pair pair;
        int i7;
        int i10;
        int itemCount;
        int i11;
        int i12;
        int i13;
        int i14;
        MosaicLayoutManager mosaicLayoutManager = this;
        RecyclerView.Recycler recycler2 = recycler;
        int i15 = 3;
        Integer num = 3;
        int i16 = 2;
        if (recycler2 == null) {
            return;
        }
        int i17 = 1;
        if (mosaicLayoutManager.getChildCount() > 0) {
            try {
                detachAndScrapAttachedViews(recycler);
            } catch (IllegalArgumentException e10) {
                String message = e10.getMessage();
                if (message == null || !StringsKt.D(message, "Scrapped or attached views may not be recycled", false)) {
                    throw e10;
                }
                Log.e$default(Log.INSTANCE, "MosaicLayoutManager", e.l("Skipping layout due to nested RecyclerView timing conflict: ", e10.getMessage()), (Throwable) null, 4, (Object) null);
                return;
            }
        }
        int i18 = (mosaicLayoutManager.availableWidth - (mosaicLayoutManager.spacingPx * 2)) / 3;
        int itemCount2 = mosaicLayoutManager.getItemCount();
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        MosaicLayoutManager mosaicLayoutManager2 = mosaicLayoutManager;
        while (i22 < itemCount2) {
            int itemCount3 = mosaicLayoutManager2.getItemCount();
            if (itemCount3 == i17) {
                pair = new Pair(Integer.valueOf(i17), 6);
            } else if (itemCount3 == i16) {
                pair = new Pair(2, num);
            } else if (itemCount3 == i15) {
                pair = i22 == 0 ? new Pair(2, 4) : new Pair(2, 2);
            } else if (itemCount3 != 4) {
                int itemCount4 = mosaicLayoutManager2.getItemCount() % i15;
                pair = i22 < itemCount4 ? new Pair(Integer.valueOf(itemCount4), Integer.valueOf(6 / itemCount4)) : new Pair(num, 2);
            } else {
                pair = new Pair(2, num);
            }
            int iIntValue = ((Number) pair.f14612d).intValue();
            int iIntValue2 = ((Number) pair.f14613e).intValue();
            int i23 = i19;
            View viewE = recycler2.e(i22);
            Intrinsics.checkNotNullExpressionValue(viewE, "getViewForPosition(...)");
            boolean z5 = viewE instanceof MosaicView;
            MosaicView mosaicView = z5 ? (MosaicView) viewE : null;
            float singleAspectRatio = mosaicView != null ? mosaicView.getSingleAspectRatio() : 1.0f;
            if (mosaicLayoutManager2.getItemCount() == i17) {
                i10 = mosaicLayoutManager2.availableWidth;
                int i24 = (int) (i10 / singleAspectRatio);
                int i25 = mosaicLayoutManager2.mediaMaxHeight;
                if (i24 > i25) {
                    i10 = (int) (i25 * singleAspectRatio);
                    int i26 = i20;
                    i13 = i25;
                    i14 = i26;
                } else {
                    i14 = i20;
                    i13 = i24;
                }
            } else {
                if (mosaicLayoutManager2.getItemCount() == 3) {
                    if (i22 == 0) {
                        i7 = (i18 * 2) + mosaicLayoutManager2.spacingPx;
                    } else {
                        i10 = i18;
                    }
                    itemCount = mosaicLayoutManager2.getItemCount();
                    if (itemCount != 3) {
                        i11 = i20;
                        if (itemCount != 4 || iIntValue >= 3) {
                            i12 = i18;
                        } else {
                            i12 = (i18 * 2) + mosaicLayoutManager2.spacingPx;
                        }
                    } else {
                        i11 = i20;
                        i12 = i10;
                    }
                    if (mosaicLayoutManager2.getItemCount() == 3 || i22 != 2) {
                        i13 = i12;
                        i14 = i11;
                    } else {
                        i13 = i12;
                        i14 = mosaicLayoutManager2.spacingPx * 2;
                        i23 += 4;
                    }
                } else {
                    i7 = (mosaicLayoutManager2.availableWidth - ((iIntValue - 1) * mosaicLayoutManager2.spacingPx)) / iIntValue;
                }
                i10 = i7;
                itemCount = mosaicLayoutManager2.getItemCount();
                if (itemCount != 3) {
                    i11 = i20;
                    if (itemCount != 4) {
                        i12 = i18;
                    } else {
                        i12 = i18;
                    }
                } else {
                    i11 = i20;
                    i12 = i10;
                }
                if (mosaicLayoutManager2.getItemCount() == 3) {
                }
                i13 = i12;
                i14 = i11;
            }
            mosaicLayoutManager2.addView(viewE);
            mosaicLayoutManager2.measureChildWithMargins(viewE, 0, 0);
            if (mosaicLayoutManager2.getItemCount() != 3) {
                iIntValue--;
            }
            int i27 = i14;
            int iB = c.b((float) Math.ceil((((mosaicLayoutManager2.availableWidth - (iIntValue * mosaicLayoutManager2.spacingPx)) / 6.0f) * i23) + i14));
            int i28 = i13;
            Integer num2 = num;
            MosaicLayoutManager mosaicLayoutManager3 = this;
            mosaicLayoutManager3.layoutDecoratedWithMargins(viewE, iB, i21, iB + i10, i21 + i13);
            MosaicView mosaicView2 = z5 ? (MosaicView) viewE : null;
            if (mosaicView2 != null) {
                mosaicView2.setMosaicSize(i10, i28);
            }
            if (mosaicLayoutManager3.getItemCount() > 1) {
                i23 += iIntValue2;
                int i29 = mosaicLayoutManager3.spacingPx + i27;
                i15 = 3;
                if (mosaicLayoutManager3.getItemCount() == 3) {
                    i29 += mosaicLayoutManager3.spacingPx;
                }
                if (i23 >= 6) {
                    i21 += i28 + mosaicLayoutManager3.spacingPx;
                    i19 = 0;
                    i27 = 0;
                } else {
                    i27 = i29;
                }
                i22++;
                int i30 = i27;
                i17 = 1;
                i20 = i30;
                recycler2 = recycler;
                num = num2;
                i16 = 2;
                mosaicLayoutManager2 = mosaicLayoutManager3;
            } else {
                i15 = 3;
            }
            i19 = i23;
            i22++;
            int i31 = i27;
            i17 = 1;
            i20 = i31;
            recycler2 = recycler;
            num = num2;
            i16 = 2;
            mosaicLayoutManager2 = mosaicLayoutManager3;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @NotNull
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(@NotNull RecyclerView.Recycler recycler, RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(recycler, "recycler");
        fill(recycler);
    }

    public final void setAvailableWidth(int availableWidth) {
        this.availableWidth = availableWidth;
    }
}
