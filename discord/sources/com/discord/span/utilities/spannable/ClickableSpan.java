package com.discord.span.utilities.spannable;

import a3.e;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;
import ar.u;
import b1.c;
import com.discord.react_gesture_handler.nested_touch.NestedClickableSpan;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.ViewProps;
import kk.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.y;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002Bu\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0\r\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00100\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÂ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÂ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÂ\u0003¢\u0006\u0004\b\u0017\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\tHÂ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u000bHÂ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u001c\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0\rHÂ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u001c\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00100\rHÂ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0017\u0010!\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u000eH\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u000eH\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\u00102\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0080\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0\r2\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00100\rHÆ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00101\u001a\u000200HÖ\u0001¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b3\u00104J\u001a\u00107\u001a\u00020\u000b2\b\u00106\u001a\u0004\u0018\u000105HÖ\u0003¢\u0006\u0004\b7\u00108R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u00109\u001a\u0004\b:\u0010-R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010;R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010;R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010;R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010<R\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010=R \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010>R \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00100\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010>R(\u0010@\u001a\u0004\u0018\u00010\u001f2\b\u0010?\u001a\u0004\u0018\u00010\u001f8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b@\u0010A\"\u0004\bB\u0010\"R\u0019\u0010E\u001a\u00020\u0005*\u00020\u00058Ã\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bC\u0010D¨\u0006F"}, d2 = {"Lcom/discord/span/utilities/spannable/ClickableSpan;", "Landroid/text/style/ClickableSpan;", "Lcom/discord/react_gesture_handler/nested_touch/NestedClickableSpan;", "Lcom/discord/react_gesture_handler/nested_touch/NestedClickableSpan$TouchPriority;", "touchPriority", "", "primaryColor", "secondaryColor", "tertiaryColor", "", "gradientPatternWidth", "", "underlineText", "Lkotlin/Function1;", "Landroid/view/View;", "onLongClickListener", "", "onClickListener", "<init>", "(Lcom/discord/react_gesture_handler/nested_touch/NestedClickableSpan$TouchPriority;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;FLjava/lang/Boolean;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "component2", "()Ljava/lang/Integer;", "component3", "component4", "component5", "()F", "component6", "()Ljava/lang/Boolean;", "component7", "()Lkotlin/jvm/functions/Function1;", "component8", "Landroid/widget/TextView;", "textView", "enableHighlight", "(Landroid/widget/TextView;)V", "view", ViewProps.ON_CLICK, "(Landroid/view/View;)V", "onLongClick", "(Landroid/view/View;)Z", "Landroid/text/TextPaint;", "textPaint", "updateDrawState", "(Landroid/text/TextPaint;)V", "component1", "()Lcom/discord/react_gesture_handler/nested_touch/NestedClickableSpan$TouchPriority;", "copy", "(Lcom/discord/react_gesture_handler/nested_touch/NestedClickableSpan$TouchPriority;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;FLjava/lang/Boolean;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/discord/span/utilities/spannable/ClickableSpan;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/discord/react_gesture_handler/nested_touch/NestedClickableSpan$TouchPriority;", "getTouchPriority", "Ljava/lang/Integer;", "F", "Ljava/lang/Boolean;", "Lkotlin/jvm/functions/Function1;", "value", "spanView", "Landroid/widget/TextView;", "setSpanView", "getDarken", "(I)I", "darken", "span_utilities_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nClickableSpan.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClickableSpan.kt\ncom/discord/span/utilities/spannable/ClickableSpan\n*L\n1#1,95:1\n42#1:96\n*S KotlinDebug\n*F\n+ 1 ClickableSpan.kt\ncom/discord/span/utilities/spannable/ClickableSpan\n*L\n80#1:96\n*E\n"})
public final /* data */ class ClickableSpan extends android.text.style.ClickableSpan implements NestedClickableSpan {
    private final float gradientPatternWidth;

    @NotNull
    private final Function1<View, Unit> onClickListener;

    @NotNull
    private final Function1<View, Boolean> onLongClickListener;
    private final Integer primaryColor;
    private final Integer secondaryColor;
    private TextView spanView;
    private final Integer tertiaryColor;

    @NotNull
    private final NestedClickableSpan.TouchPriority touchPriority;
    private final Boolean underlineText;

    public /* synthetic */ ClickableSpan(NestedClickableSpan.TouchPriority touchPriority, Integer num, Integer num2, Integer num3, float f2, Boolean bool, Function1 function1, Function1 function2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? NestedClickableSpan.TouchPriority.DEFAULT : touchPriority, (i7 & 2) != 0 ? null : num, (i7 & 4) != 0 ? null : num2, (i7 & 8) != 0 ? null : num3, (i7 & 16) != 0 ? 150.0f : f2, (i7 & 32) != 0 ? Boolean.FALSE : bool, (i7 & 64) != 0 ? new u(6) : function1, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$0(View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return false;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    private final Integer getPrimaryColor() {
        return this.primaryColor;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    private final Integer getSecondaryColor() {
        return this.secondaryColor;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    private final Integer getTertiaryColor() {
        return this.tertiaryColor;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    private final float getGradientPatternWidth() {
        return this.gradientPatternWidth;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    private final Boolean getUnderlineText() {
        return this.underlineText;
    }

    private final Function1<View, Boolean> component7() {
        return this.onLongClickListener;
    }

    private final Function1<View, Unit> component8() {
        return this.onClickListener;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ClickableSpan copy$default(ClickableSpan clickableSpan, NestedClickableSpan.TouchPriority touchPriority, Integer num, Integer num2, Integer num3, float f2, Boolean bool, Function1 function1, Function1 function2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            touchPriority = clickableSpan.touchPriority;
        }
        if ((i7 & 2) != 0) {
            num = clickableSpan.primaryColor;
        }
        if ((i7 & 4) != 0) {
            num2 = clickableSpan.secondaryColor;
        }
        if ((i7 & 8) != 0) {
            num3 = clickableSpan.tertiaryColor;
        }
        if ((i7 & 16) != 0) {
            f2 = clickableSpan.gradientPatternWidth;
        }
        if ((i7 & 32) != 0) {
            bool = clickableSpan.underlineText;
        }
        if ((i7 & 64) != 0) {
            function1 = clickableSpan.onLongClickListener;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
            function2 = clickableSpan.onClickListener;
        }
        Function1 function3 = function1;
        Function1 function4 = function2;
        float f7 = f2;
        Boolean bool2 = bool;
        return clickableSpan.copy(touchPriority, num, num2, num3, f7, bool2, function3, function4);
    }

    private final int getDarken(int i7) {
        return c.b(i7, -16777216, 0.1f);
    }

    private final void setSpanView(TextView textView) {
        if (textView != null) {
            textView.invalidate();
        } else {
            TextView textView2 = this.spanView;
            if (textView2 != null) {
                textView2.invalidate();
            }
        }
        this.spanView = textView;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final NestedClickableSpan.TouchPriority getTouchPriority() {
        return this.touchPriority;
    }

    @NotNull
    public final ClickableSpan copy(@NotNull NestedClickableSpan.TouchPriority touchPriority, Integer primaryColor, Integer secondaryColor, Integer tertiaryColor, float gradientPatternWidth, Boolean underlineText, @NotNull Function1<? super View, Boolean> onLongClickListener, @NotNull Function1<? super View, Unit> onClickListener) {
        Intrinsics.checkNotNullParameter(touchPriority, "touchPriority");
        Intrinsics.checkNotNullParameter(onLongClickListener, "onLongClickListener");
        Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
        return new ClickableSpan(touchPriority, primaryColor, secondaryColor, tertiaryColor, gradientPatternWidth, underlineText, onLongClickListener, onClickListener);
    }

    @Override // com.discord.react_gesture_handler.nested_touch.NestedClickableSpan
    public void enableHighlight(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "textView");
        setSpanView(textView);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClickableSpan)) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) other;
        return this.touchPriority == clickableSpan.touchPriority && Intrinsics.areEqual(this.primaryColor, clickableSpan.primaryColor) && Intrinsics.areEqual(this.secondaryColor, clickableSpan.secondaryColor) && Intrinsics.areEqual(this.tertiaryColor, clickableSpan.tertiaryColor) && Float.compare(this.gradientPatternWidth, clickableSpan.gradientPatternWidth) == 0 && Intrinsics.areEqual(this.underlineText, clickableSpan.underlineText) && Intrinsics.areEqual(this.onLongClickListener, clickableSpan.onLongClickListener) && Intrinsics.areEqual(this.onClickListener, clickableSpan.onClickListener);
    }

    @Override // com.discord.react_gesture_handler.nested_touch.NestedClickableSpan
    @NotNull
    public NestedClickableSpan.TouchPriority getTouchPriority() {
        return this.touchPriority;
    }

    public int hashCode() {
        int iHashCode = this.touchPriority.hashCode() * 31;
        Integer num = this.primaryColor;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.secondaryColor;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.tertiaryColor;
        int iA = e.a((iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31, 31, this.gradientPatternWidth);
        Boolean bool = this.underlineText;
        return this.onClickListener.hashCode() + e.e((iA + (bool != null ? bool.hashCode() : 0)) * 31, 31, this.onLongClickListener);
    }

    @Override // android.text.style.ClickableSpan, com.discord.react_gesture_handler.nested_touch.NestedClickableSpan
    public void onClick(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.onClickListener.invoke(view);
        Unit unit = Unit.f14616a;
        setSpanView(null);
    }

    @Override // com.discord.react_gesture_handler.nested_touch.NestedClickableSpan
    public boolean onLongClick(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Boolean bool = (Boolean) this.onLongClickListener.invoke(view);
        bool.getClass();
        setSpanView(null);
        return bool.booleanValue();
    }

    @Override // android.text.style.ClickableSpan
    @NotNull
    public String toString() {
        NestedClickableSpan.TouchPriority touchPriority = this.touchPriority;
        Integer num = this.primaryColor;
        Integer num2 = this.secondaryColor;
        Integer num3 = this.tertiaryColor;
        float f2 = this.gradientPatternWidth;
        Boolean bool = this.underlineText;
        Function1<View, Boolean> function1 = this.onLongClickListener;
        Function1<View, Unit> function2 = this.onClickListener;
        StringBuilder sb2 = new StringBuilder("ClickableSpan(touchPriority=");
        sb2.append(touchPriority);
        sb2.append(", primaryColor=");
        sb2.append(num);
        sb2.append(", secondaryColor=");
        b.s(sb2, num2, ", tertiaryColor=", num3, ", gradientPatternWidth=");
        sb2.append(f2);
        sb2.append(", underlineText=");
        sb2.append(bool);
        sb2.append(", onLongClickListener=");
        sb2.append(function1);
        sb2.append(", onClickListener=");
        sb2.append(function2);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(@NotNull TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "textPaint");
        super.updateDrawState(textPaint);
        Integer num = this.primaryColor;
        if (num != null) {
            Integer num2 = this.secondaryColor;
            if (num2 != null) {
                Integer[] elements = {num, num2, this.tertiaryColor};
                Intrinsics.checkNotNullParameter(elements, "elements");
                textPaint.setShader(new LinearGradient(0.0f, 0.0f, this.gradientPatternWidth, 0.0f, CollectionsKt.h0(y.r(elements)), (float[]) null, Shader.TileMode.MIRROR));
            } else {
                textPaint.setShader(null);
                textPaint.setColor(this.spanView != null ? c.b(this.primaryColor.intValue(), -16777216, 0.1f) : this.primaryColor.intValue());
                Unit unit = Unit.f14616a;
            }
        } else {
            textPaint.setShader(null);
        }
        Boolean bool = this.underlineText;
        if (bool != null) {
            textPaint.setUnderlineText(bool.booleanValue());
        } else {
            textPaint.setUnderlineText(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ClickableSpan(@NotNull NestedClickableSpan.TouchPriority touchPriority, Integer num, Integer num2, Integer num3, float f2, Boolean bool, @NotNull Function1<? super View, Boolean> onLongClickListener, @NotNull Function1<? super View, Unit> onClickListener) {
        Intrinsics.checkNotNullParameter(touchPriority, "touchPriority");
        Intrinsics.checkNotNullParameter(onLongClickListener, "onLongClickListener");
        Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
        this.touchPriority = touchPriority;
        this.primaryColor = num;
        this.secondaryColor = num2;
        this.tertiaryColor = num3;
        this.gradientPatternWidth = f2;
        this.underlineText = bool;
        this.onLongClickListener = onLongClickListener;
        this.onClickListener = onClickListener;
    }
}
