package com.discord.chat.presentation.message.view.polls;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.discord.chat.R;
import com.discord.chat.bridge.attachment.Attachment;
import com.discord.chat.bridge.polls.PollAnswer;
import com.discord.chat.bridge.polls.PollMediaEmoji;
import com.discord.chat.presentation.message.messagepart.polls.PollAnswerAccessory;
import com.discord.chat.presentation.message.messagepart.polls.PollAnswerAccessoryKt;
import com.discord.chat.reactevents.ViewResizeMode;
import com.discord.emoji.RenderableEmoji;
import com.discord.emoji.RenderableEmojiKt;
import com.discord.image.fresco.SetOptionalImageUrlKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.view.ViewLocationUtilsKt;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import com.facebook.drawee.span.DraweeSpanStringBuilder;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import rn.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 82\u00020\u0001:\u00018B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0016JU\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001920\u0010\u001e\u001a,\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u000e0\u001b¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001c\u0010'\u001a\n &*\u0004\u0018\u00010%0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010)\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010+\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u001b\u00102\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001b\u00107\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010/\u001a\u0004\b5\u00106¨\u00069"}, d2 = {"Lcom/discord/chat/presentation/message/view/polls/PollMediaView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "url", "Landroid/widget/ImageView$ScaleType;", "scaleType", "", "autoPlayAnimations", "", "setImageURL", "(Ljava/lang/String;Landroid/widget/ImageView$ScaleType;Z)V", "Lcom/facebook/drawee/span/DraweeSpanStringBuilder;", "spanBuilder", "setDraweeSpanStringBuilder", "(Lcom/facebook/drawee/span/DraweeSpanStringBuilder;)V", "hideViews", "()V", "Lcom/discord/chat/presentation/message/messagepart/polls/PollAnswerAccessory;", "accessory", "Lkotlin/Function0;", "onTapAnswer", "Lkotlin/Function6;", "", "Lcom/discord/chat/reactevents/ViewResizeMode;", "onLongPressImage", "setMedia", "(Lcom/discord/chat/presentation/message/messagepart/polls/PollAnswerAccessory;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function6;)V", "", "Landroid/view/View;", "childViews", "Ljava/util/List;", "Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;", "kotlin.jvm.PlatformType", "hierarchyBuilder", "Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;", "emojiSize", "I", "lastMedia", "Lcom/discord/chat/presentation/message/messagepart/polls/PollAnswerAccessory;", "Lcom/facebook/drawee/view/SimpleDraweeView;", "draweeView$delegate", "Lkotlin/Lazy;", "getDraweeView", "()Lcom/facebook/drawee/view/SimpleDraweeView;", "draweeView", "Lcom/facebook/drawee/span/SimpleDraweeSpanTextView;", "textView$delegate", "getTextView", "()Lcom/facebook/drawee/span/SimpleDraweeSpanTextView;", "textView", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPollMediaView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PollMediaView.kt\ncom/discord/chat/presentation/message/view/polls/PollMediaView\n+ 2 Context.kt\nandroidx/core/content/ContextKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,169:1\n51#2,9:170\n257#3,2:179\n257#3,2:181\n257#3,2:183\n*S KotlinDebug\n*F\n+ 1 PollMediaView.kt\ncom/discord/chat/presentation/message/view/polls/PollMediaView\n*L\n38#1:170,9\n137#1:179,2\n154#1:181,2\n161#1:183,2\n*E\n"})
public final class PollMediaView extends FrameLayout {
    private static final int DEFAULT_EMOJI_SIZE = SizeUtilsKt.getDpToPx(24);

    @NotNull
    private final List<View> childViews;

    /* JADX INFO: renamed from: draweeView$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy draweeView;
    private int emojiSize;
    private final GenericDraweeHierarchyBuilder hierarchyBuilder;
    private PollAnswerAccessory lastMedia;

    /* JADX INFO: renamed from: textView$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy textView;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PollMediaView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SimpleDraweeView draweeView_delegate$lambda$2(Context context, PollMediaView pollMediaView) {
        SimpleDraweeView simpleDraweeView = new SimpleDraweeView(context);
        simpleDraweeView.setHierarchy(pollMediaView.hierarchyBuilder.a());
        pollMediaView.childViews.add(simpleDraweeView);
        pollMediaView.addView(simpleDraweeView, new FrameLayout.LayoutParams(-1, -1, 17));
        return simpleDraweeView;
    }

    private final SimpleDraweeView getDraweeView() {
        return (SimpleDraweeView) this.draweeView.getValue();
    }

    private final SimpleDraweeSpanTextView getTextView() {
        return (SimpleDraweeSpanTextView) this.textView.getValue();
    }

    private final void hideViews() {
        Iterator<View> it = this.childViews.iterator();
        while (it.hasNext()) {
            it.next().setVisibility(8);
        }
    }

    private final void setDraweeSpanStringBuilder(DraweeSpanStringBuilder spanBuilder) {
        hideViews();
        SimpleDraweeSpanTextView textView = getTextView();
        textView.setVisibility(0);
        textView.setDraweeSpanStringBuilder(spanBuilder);
    }

    private final void setImageURL(String url, ImageView.ScaleType scaleType, boolean autoPlayAnimations) {
        hideViews();
        getDraweeView().setScaleType(scaleType);
        SetOptionalImageUrlKt.setOptionalImageUrl$default(getDraweeView(), url, Boolean.valueOf(autoPlayAnimations), null, null, null, null, 60, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setMedia$lambda$6(PollMediaView pollMediaView, Function6 function6, Attachment attachment, View view) {
        Point locationInWindow = ViewLocationUtilsKt.getLocationInWindow(pollMediaView);
        function6.invoke(attachment.getId(), Integer.valueOf(pollMediaView.getWidth()), Integer.valueOf(pollMediaView.getHeight()), Integer.valueOf(locationInWindow.x), Integer.valueOf(locationInWindow.y), ViewResizeMode.Cover);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SimpleDraweeSpanTextView textView_delegate$lambda$4(Context context, PollMediaView pollMediaView) {
        SimpleDraweeSpanTextView simpleDraweeSpanTextView = new SimpleDraweeSpanTextView(context);
        pollMediaView.childViews.add(simpleDraweeSpanTextView);
        pollMediaView.addView(simpleDraweeSpanTextView, new FrameLayout.LayoutParams(-2, -2, 17));
        return simpleDraweeSpanTextView;
    }

    public final void setMedia(@NotNull PollAnswerAccessory accessory, @NotNull Function0<Unit> onTapAnswer, @NotNull Function6 onLongPressImage) {
        PollAnswer answer;
        Intrinsics.checkNotNullParameter(accessory, "accessory");
        Intrinsics.checkNotNullParameter(onTapAnswer, "onTapAnswer");
        Intrinsics.checkNotNullParameter(onLongPressImage, "onLongPressImage");
        PollAnswerAccessory pollAnswerAccessory = this.lastMedia;
        if (Intrinsics.areEqual((pollAnswerAccessory == null || (answer = pollAnswerAccessory.getAnswer()) == null) ? null : answer.getPollMedia(), accessory.getAnswer().getPollMedia())) {
            return;
        }
        this.lastMedia = accessory;
        Attachment firstImage = PollAnswerAccessoryKt.getFirstImage(accessory.getAttachments());
        setOnClickListener(null);
        setOnLongClickListener(null);
        int i7 = 0;
        if (firstImage != null) {
            setImageURL(firstImage.getUrl(), ImageView.ScaleType.CENTER_CROP, accessory.getShouldAutoPlayGifs());
            if (firstImage.getId() != null) {
                setOnClickListener(new a6.a(5, onTapAnswer));
                setOnLongClickListener(new e6.a(this, onLongPressImage, firstImage, 2));
            }
        } else if (accessory.getAnswer().getPollMedia().getEmoji() != null) {
            PollMediaEmoji emoji = accessory.getAnswer().getPollMedia().getEmoji();
            RenderableEmoji renderableEmojiRenderable = emoji.renderable();
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            setDraweeSpanStringBuilder(RenderableEmojiKt.renderEmoji$default(renderableEmojiRenderable, context, this.emojiSize, accessory.getShouldAnimateEmoji() && emoji.getAnimated(), 0, null, 48, null));
            setImportantForAccessibility(2);
            setOnClickListener(new a6.a(6, onTapAnswer));
        } else {
            hideViews();
            i7 = 8;
        }
        setVisibility(i7);
    }

    public /* synthetic */ PollMediaView(Context context, AttributeSet attributeSet, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i7 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PollMediaView(@NotNull final Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.childViews = new ArrayList();
        this.hierarchyBuilder = a.a.q(context, attributeSet);
        this.emojiSize = DEFAULT_EMOJI_SIZE;
        int[] PollMediaView = R.styleable.PollMediaView;
        Intrinsics.checkNotNullExpressionValue(PollMediaView, "PollMediaView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, PollMediaView, 0, 0);
        this.emojiSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.PollMediaView_emojiSize, this.emojiSize);
        typedArrayObtainStyledAttributes.recycle();
        final int i7 = 0;
        this.draweeView = l.b(new Function0() { // from class: com.discord.chat.presentation.message.view.polls.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return PollMediaView.draweeView_delegate$lambda$2(context, this);
                    default:
                        return PollMediaView.textView_delegate$lambda$4(context, this);
                }
            }
        });
        final int i10 = 1;
        this.textView = l.b(new Function0() { // from class: com.discord.chat.presentation.message.view.polls.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return PollMediaView.draweeView_delegate$lambda$2(context, this);
                    default:
                        return PollMediaView.textView_delegate$lambda$4(context, this);
                }
            }
        });
    }
}
