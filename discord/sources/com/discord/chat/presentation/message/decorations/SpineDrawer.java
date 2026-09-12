package com.discord.chat.presentation.message.decorations;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.PaintDrawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.channel_spine.ChannelSpineView;
import com.discord.chat.R;
import com.discord.chat.presentation.message.decorations.SpineDrawer;
import com.discord.theme.ThemeManagerKt;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import rn.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J0\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00052\b\b\u0002\u0010!\u001a\u00020\u0005J.\u0010\"\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0015\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/discord/chat/presentation/message/decorations/SpineDrawer;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "context", "Landroid/content/Context;", "contentStartPositionPx", "", "<init>", "(Landroid/content/Context;I)V", "getContext", "()Landroid/content/Context;", "lineDrawable", "Landroid/graphics/drawable/PaintDrawable;", "getLineDrawable", "()Landroid/graphics/drawable/PaintDrawable;", "lineDrawable$delegate", "Lkotlin/Lazy;", "splineView", "Lcom/discord/channel_spine/ChannelSpineView;", "getSplineView", "()Lcom/discord/channel_spine/ChannelSpineView;", "splineView$delegate", "itemPaddingOffset", "spineRect", "Landroid/graphics/Rect;", "drawSpinePiece", "", "canvas", "Landroid/graphics/Canvas;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "child", "Landroid/view/View;", "middle", "topOffsetPx", "drawSpineCurve", "viewToCenterSpine", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSpineDrawer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpineDrawer.kt\ncom/discord/chat/presentation/message/decorations/SpineDrawer\n+ 2 Canvas.kt\nandroidx/core/graphics/CanvasKt\n*L\n1#1,101:1\n27#2,7:102\n27#2,7:109\n*S KotlinDebug\n*F\n+ 1 SpineDrawer.kt\ncom/discord/chat/presentation/message/decorations/SpineDrawer\n*L\n55#1:102,7\n78#1:109,7\n*E\n"})
public final class SpineDrawer extends RecyclerView.ItemDecoration {
    private final int contentStartPositionPx;

    @NotNull
    private final Context context;
    private final int itemPaddingOffset;

    /* JADX INFO: renamed from: lineDrawable$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy lineDrawable;

    @NotNull
    private final Rect spineRect;

    /* JADX INFO: renamed from: splineView$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy splineView;

    public SpineDrawer(@NotNull Context context, int i7) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.contentStartPositionPx = i7;
        final int i10 = 0;
        this.lineDrawable = l.b(new Function0(this) { // from class: b6.a

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ SpineDrawer f3072e;

            {
                this.f3072e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return SpineDrawer.lineDrawable_delegate$lambda$1(this.f3072e);
                    default:
                        return SpineDrawer.splineView_delegate$lambda$3(this.f3072e);
                }
            }
        });
        final int i11 = 1;
        this.splineView = l.b(new Function0(this) { // from class: b6.a

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ SpineDrawer f3072e;

            {
                this.f3072e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return SpineDrawer.lineDrawable_delegate$lambda$1(this.f3072e);
                    default:
                        return SpineDrawer.splineView_delegate$lambda$3(this.f3072e);
                }
            }
        });
        this.itemPaddingOffset = context.getResources().getDimensionPixelSize(R.dimen.message_accessories_vertical_spacing);
        this.spineRect = new Rect();
    }

    public static /* synthetic */ void drawSpinePiece$default(SpineDrawer spineDrawer, Canvas canvas, RecyclerView recyclerView, View view, int i7, int i10, int i11, Object obj) {
        if ((i11 & 16) != 0) {
            i10 = 0;
        }
        spineDrawer.drawSpinePiece(canvas, recyclerView, view, i7, i10);
    }

    private final PaintDrawable getLineDrawable() {
        return (PaintDrawable) this.lineDrawable.getValue();
    }

    private final ChannelSpineView getSplineView() {
        return (ChannelSpineView) this.splineView.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PaintDrawable lineDrawable_delegate$lambda$1(SpineDrawer spineDrawer) {
        PaintDrawable paintDrawable = new PaintDrawable(ThemeManagerKt.getTheme().getSpineDefault());
        paintDrawable.setIntrinsicWidth(spineDrawer.context.getResources().getDimensionPixelSize(com.discord.channel_spine.R.dimen.spine_width));
        return paintDrawable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final ChannelSpineView splineView_delegate$lambda$3(SpineDrawer spineDrawer) {
        ChannelSpineView channelSpineView = new ChannelSpineView(spineDrawer.context, null, 2, 0 == true ? 1 : 0);
        channelSpineView.setVerticalPadding(0);
        channelSpineView.setHorizontalPadding(channelSpineView.getContext().getResources().getDimensionPixelSize(R.dimen.thread_spine_end_padding));
        channelSpineView.setNumRows(1);
        return channelSpineView;
    }

    public final void drawSpineCurve(@NotNull Canvas canvas, @NotNull RecyclerView parent, @NotNull View child, @NotNull View viewToCenterSpine, int middle) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(viewToCenterSpine, "viewToCenterSpine");
        int iSave = canvas.save();
        try {
            parent.getDecoratedBoundsWithMargins(child, this.spineRect);
            Rect rect = new Rect(middle - (getLineDrawable().getIntrinsicWidth() / 2), child.getTop(), this.contentStartPositionPx, child.getTop() + ((viewToCenterSpine.getBottom() - viewToCenterSpine.getTop()) / 2) + this.itemPaddingOffset);
            ChannelSpineView splineView = getSplineView();
            splineView.setRowHeight(rect.height() / 2);
            splineView.measure(View.MeasureSpec.makeMeasureSpec(rect.width(), 1073741824), View.MeasureSpec.makeMeasureSpec(rect.height(), 1073741824));
            splineView.layout(0, 0, rect.width(), rect.height());
            canvas.translate(rect.left, rect.top);
            splineView.draw(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    public final void drawSpinePiece(@NotNull Canvas canvas, @NotNull RecyclerView parent, @NotNull View child, int middle, int topOffsetPx) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        int iSave = canvas.save();
        try {
            parent.getDecoratedBoundsWithMargins(child, this.spineRect);
            PaintDrawable lineDrawable = getLineDrawable();
            lineDrawable.setBounds(middle - (lineDrawable.getIntrinsicWidth() / 2), this.spineRect.top + topOffsetPx, (int) Math.ceil((((double) lineDrawable.getIntrinsicWidth()) / ((double) 2)) + ((double) middle)), this.spineRect.bottom);
            lineDrawable.draw(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }
}
