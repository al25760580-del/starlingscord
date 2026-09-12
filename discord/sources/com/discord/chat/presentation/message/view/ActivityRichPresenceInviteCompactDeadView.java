package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.discord.SetTextSizeSpKt;
import com.discord.activity_invites.RGBAColorModel;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt;
import com.discord.theme.R;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.react.modules.dialog.AlertFragment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ>\u0010\u0010\u001a\u00020\u00112\b\u0010\n\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00122\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017J\u0018\u0010\u0019\u001a\u00020\u00112\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/discord/chat/presentation/message/view/ActivityRichPresenceInviteCompactDeadView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "headerText", "Landroid/widget/TextView;", "iconView", "Lcom/facebook/drawee/view/SimpleDraweeView;", "titleText", "subtitleText", "configure", "", "", AlertFragment.ARG_TITLE, "subtitle", "iconSrc", "gradientColors", "", "Lcom/discord/activity_invites/RGBAColorModel;", "applyGradient", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nActivityRichPresenceInviteCompactDeadView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityRichPresenceInviteCompactDeadView.kt\ncom/discord/chat/presentation/message/view/ActivityRichPresenceInviteCompactDeadView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,159:1\n1563#2:160\n1634#2,3:161\n*S KotlinDebug\n*F\n+ 1 ActivityRichPresenceInviteCompactDeadView.kt\ncom/discord/chat/presentation/message/view/ActivityRichPresenceInviteCompactDeadView\n*L\n141#1:160\n141#1:161,3\n*E\n"})
public final class ActivityRichPresenceInviteCompactDeadView extends LinearLayout {

    @NotNull
    private final TextView headerText;

    @NotNull
    private final SimpleDraweeView iconView;

    @NotNull
    private final TextView subtitleText;

    @NotNull
    private final TextView titleText;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ActivityRichPresenceInviteCompactDeadView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void applyGradient(List<RGBAColorModel> gradientColors) {
        if (gradientColors == null || gradientColors.isEmpty()) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            ViewBackgroundUtilsKt.setBackgroundRectangle$default(this, ColorUtilsKt.getColorCompat(context, ThemeManagerKt.getTheme().getColorRes(R.color.primary_130, R.color.primary_630)), SizeUtilsKt.getDpToPx(12), null, 0, 12, null);
            return;
        }
        ArrayList arrayList = new ArrayList(e0.l(gradientColors, 10));
        for (RGBAColorModel rGBAColorModel : gradientColors) {
            arrayList.add(Integer.valueOf(Color.argb((int) (rGBAColorModel.getA() * 255), (int) rGBAColorModel.getR(), (int) rGBAColorModel.getG(), (int) rGBAColorModel.getB())));
        }
        int[] iArrH0 = CollectionsKt.h0(arrayList);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColors(iArrH0);
        gradientDrawable.setCornerRadius(SizeUtilsKt.getDpToPx(12));
        gradientDrawable.setOrientation(GradientDrawable.Orientation.BL_TR);
        setBackground(gradientDrawable);
    }

    public final void configure(String headerText, String title, String subtitle, String iconSrc, List<RGBAColorModel> gradientColors) {
        this.headerText.setText(headerText);
        this.titleText.setText(title);
        this.subtitleText.setText(subtitle);
        if (iconSrc != null) {
            Uri uri = v8.a.f21502a;
            this.iconView.setImageURI(Uri.parse(iconSrc));
            this.iconView.setVisibility(0);
        } else {
            this.iconView.setVisibility(8);
        }
        applyGradient(gradientColors);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ActivityRichPresenceInviteCompactDeadView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ActivityRichPresenceInviteCompactDeadView(Context context, AttributeSet attributeSet, int i7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? 0 : i7);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityRichPresenceInviteCompactDeadView(@NotNull Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        TextView textView = new TextView(context);
        this.headerText = textView;
        SimpleDraweeView simpleDraweeView = new SimpleDraweeView(context);
        this.iconView = simpleDraweeView;
        TextView textView2 = new TextView(context);
        this.titleText = textView2;
        TextView textView3 = new TextView(context);
        this.subtitleText = textView3;
        setOrientation(1);
        setPadding(SizeUtilsKt.getDpToPx(12), SizeUtilsKt.getDpToPx(12), SizeUtilsKt.getDpToPx(12), SizeUtilsKt.getDpToPx(12));
        setClipToOutline(true);
        ViewBackgroundUtilsKt.setBackgroundRectangle$default(this, ColorUtilsKt.getColorCompat(context, ThemeManagerKt.getTheme().getColorRes(R.color.primary_130, R.color.primary_630)), SizeUtilsKt.getDpToPx(12), null, 0, 12, null);
        SetTextSizeSpKt.setTextSizeSp(textView, 12.0f);
        DiscordFont discordFont = DiscordFont.PrimarySemibold;
        DiscordFontUtilsKt.setDiscordFont(textView, discordFont);
        ActivityRichPresenceInviteEmbedView.Companion companion = ActivityRichPresenceInviteEmbedView.INSTANCE;
        textView.setTextColor(companion.getWhiteAlpha70());
        textView.setMaxLines(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = SizeUtilsKt.getDpToPx(4);
        Unit unit = Unit.f14616a;
        addView(textView, layoutParams);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        addView(linearLayout, new LinearLayout.LayoutParams(-1, -2));
        GenericDraweeHierarchy genericDraweeHierarchy = (GenericDraweeHierarchy) simpleDraweeView.getHierarchy();
        float dpToPx = SizeUtilsKt.getDpToPx(6);
        i9.b bVar = new i9.b();
        float[] fArr = new float[8];
        bVar.f11404c = fArr;
        Arrays.fill(fArr, dpToPx);
        genericDraweeHierarchy.p(bVar);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(SizeUtilsKt.getDpToPx(32), SizeUtilsKt.getDpToPx(32));
        layoutParams2.setMarginEnd(SizeUtilsKt.getDpToPx(8));
        linearLayout.addView(simpleDraweeView, layoutParams2);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout.addView(linearLayout2, new LinearLayout.LayoutParams(0, -2, 1.0f));
        SetTextSizeSpKt.setTextSizeSp(textView2, 14.0f);
        DiscordFontUtilsKt.setDiscordFont(textView2, discordFont);
        textView2.setTextColor(-1);
        textView2.setMaxLines(1);
        linearLayout2.addView(textView2, new LinearLayout.LayoutParams(-1, -2));
        SetTextSizeSpKt.setTextSizeSp(textView3, 12.0f);
        DiscordFontUtilsKt.setDiscordFont(textView3, DiscordFont.PrimaryMedium);
        textView3.setTextColor(companion.getWhiteAlpha70());
        textView3.setMaxLines(1);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = SizeUtilsKt.getDpToPx(2);
        linearLayout2.addView(textView3, layoutParams3);
    }
}
