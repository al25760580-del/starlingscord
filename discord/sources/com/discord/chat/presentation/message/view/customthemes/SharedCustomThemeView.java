package com.discord.chat.presentation.message.view.customthemes;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.z0;
import co.q;
import com.discord.chat.bridge.customthemes.SharedCustomThemeData;
import com.discord.chat.databinding.SharedCustomThemeViewBinding;
import com.discord.chat.presentation.message.view.e;
import com.discord.core.DCDButton;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.image.fresco.SetImageUriWithCachePolicyKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.primitives.MessageId;
import com.discord.theme.ThemeManagerKt;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.android.flexbox.FlexboxLayout;
import i9.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import xq.r;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007JO\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u001f\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R$\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010#R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010$R\u0016\u0010&\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, d2 = {"Lcom/discord/chat/presentation/message/view/customthemes/SharedCustomThemeView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/discord/primitives/MessageId;", "messageId", "Lcom/discord/chat/bridge/customthemes/SharedCustomThemeData;", "sharedCustomThemeData", "", "author", "Lkotlin/Function1;", "", "onTapPreview", "onViewed", "bind-pPZZVto", "(Ljava/lang/String;Lcom/discord/chat/bridge/customthemes/SharedCustomThemeData;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "bind", "formatUsername", "(Lcom/discord/chat/bridge/customthemes/SharedCustomThemeData;Ljava/lang/String;)V", "onAttachedToWindow", "()V", "Lcom/discord/chat/databinding/SharedCustomThemeViewBinding;", "binding", "Lcom/discord/chat/databinding/SharedCustomThemeViewBinding;", "getBinding", "()Lcom/discord/chat/databinding/SharedCustomThemeViewBinding;", "Lcom/facebook/drawee/view/SimpleDraweeView;", "nitroWheelIcon", "Lcom/facebook/drawee/view/SimpleDraweeView;", "getNitroWheelIcon", "()Lcom/facebook/drawee/view/SimpleDraweeView;", "Lkotlin/jvm/functions/Function1;", "Ljava/lang/String;", "", "hasViewed", "Z", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSharedCustomThemeView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedCustomThemeView.kt\ncom/discord/chat/presentation/message/view/customthemes/SharedCustomThemeView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,158:1\n176#2,2:159\n1563#3:161\n1634#3,3:162\n1563#3:165\n1634#3,3:166\n*S KotlinDebug\n*F\n+ 1 SharedCustomThemeView.kt\ncom/discord/chat/presentation/message/view/customthemes/SharedCustomThemeView\n*L\n50#1:159,2\n74#1:161\n74#1:162,3\n116#1:165\n116#1:166,3\n*E\n"})
public final class SharedCustomThemeView extends LinearLayout {

    @NotNull
    private final SharedCustomThemeViewBinding binding;
    private boolean hasViewed;
    private String messageId;

    @NotNull
    private final SimpleDraweeView nitroWheelIcon;
    private Function1<? super MessageId, Unit> onViewed;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SharedCustomThemeView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind_pPZZVto$lambda$2(Function1 function1, String str, View view) {
        function1.invoke(MessageId.m1156boximpl(str));
    }

    /* JADX INFO: renamed from: bind-pPZZVto, reason: not valid java name */
    public final void m757bindpPZZVto(@NotNull String messageId, @NotNull SharedCustomThemeData sharedCustomThemeData, String author, @NotNull Function1<? super MessageId, Unit> onTapPreview, @NotNull Function1<? super MessageId, Unit> onViewed) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(sharedCustomThemeData, "sharedCustomThemeData");
        Intrinsics.checkNotNullParameter(onTapPreview, "onTapPreview");
        Intrinsics.checkNotNullParameter(onViewed, "onViewed");
        this.hasViewed = false;
        this.messageId = messageId;
        this.onViewed = onViewed;
        this.binding.previewBtn.setText(sharedCustomThemeData.getPreviewLabel());
        DCDButton dCDButton = this.binding.previewBtn;
        dCDButton.setCornerRadius(dCDButton.getHeight() / 2);
        this.binding.previewBtn.setOnClickButtonListener(new e(3, messageId, onTapPreview));
        ThemePreviewView themePreviewView = this.binding.themePreview;
        List<String> colors = sharedCustomThemeData.getColors();
        ArrayList arrayList = new ArrayList(e0.l(colors, 10));
        Iterator<T> it = colors.iterator();
        while (it.hasNext()) {
            arrayList.add("#" + ((String) it.next()));
        }
        themePreviewView.setHexColors(arrayList);
        this.binding.themePreview.setGradientAngle(sharedCustomThemeData.getGradientAngle());
        this.binding.previewHeading.setText(sharedCustomThemeData.getPreviewHeading());
        this.binding.previewHeading.setTextColor(ThemeManagerKt.getTheme().getTextDefault());
        this.binding.previewHeading.setTextSize(16.0f);
        TextView previewHeading = this.binding.previewHeading;
        Intrinsics.checkNotNullExpressionValue(previewHeading, "previewHeading");
        DiscordFontUtilsKt.setDiscordFont(previewHeading, DiscordFont.PrimarySemibold);
        this.binding.previewHeading.setPadding(0, 0, 0, SizeUtilsKt.getDpToPx(6.0f));
        FlexboxLayout heading = this.binding.heading;
        Intrinsics.checkNotNullExpressionValue(heading, "heading");
        z0 block = new z0(heading, null);
        Intrinsics.checkNotNullParameter(block, "block");
        q qVar = new q(block);
        SimpleDraweeView simpleDraweeView = this.nitroWheelIcon;
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        if (r.l(qVar, simpleDraweeView) < 0) {
            SimpleDraweeView simpleDraweeView2 = this.nitroWheelIcon;
            FlexboxLayout.LayoutParams layoutParams = new FlexboxLayout.LayoutParams(SizeUtilsKt.getDpToPx(18.0f), SizeUtilsKt.getDpToPx(13.0f));
            layoutParams.setMarginStart(SizeUtilsKt.getDpToPx(4.0f));
            simpleDraweeView2.setLayoutParams(layoutParams);
            GenericDraweeHierarchyBuilder genericDraweeHierarchyBuilder = new GenericDraweeHierarchyBuilder(simpleDraweeView2.getResources());
            genericDraweeHierarchyBuilder.f4715m = new PorterDuffColorFilter(ThemeManagerKt.getTheme().getTextDefault(), PorterDuff.Mode.SRC_IN);
            GenericDraweeHierarchy genericDraweeHierarchyA = genericDraweeHierarchyBuilder.a();
            Intrinsics.checkNotNullExpressionValue(genericDraweeHierarchyA, "build(...)");
            simpleDraweeView2.setHierarchy(genericDraweeHierarchyA);
            SetImageUriWithCachePolicyKt.setImageUriWithCachePolicy(simpleDraweeView2, sharedCustomThemeData.getNitroWheelIconUrl());
            this.binding.heading.addView(this.nitroWheelIcon);
        }
        formatUsername(sharedCustomThemeData, author);
    }

    public final void formatUsername(@NotNull SharedCustomThemeData sharedCustomThemeData, String author) {
        Intrinsics.checkNotNullParameter(sharedCustomThemeData, "sharedCustomThemeData");
        this.binding.createdByContainer.removeAllViews();
        List<String> listSplit$default = StringsKt__StringsKt.split$default(sharedCustomThemeData.getCreatedByLabel(), new String[]{"__USERNAME__"}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList(e0.l(listSplit$default, 10));
        for (String str : listSplit$default) {
            TextView textView = new TextView(getContext());
            textView.setText(str);
            textView.setTextColor(ThemeManagerKt.getTheme().getTextSubtle());
            textView.setTextSize(14.0f);
            arrayList.add(textView);
        }
        this.binding.createdByContainer.addView((View) arrayList.get(0));
        SimpleDraweeView simpleDraweeView = new SimpleDraweeView(getContext());
        simpleDraweeView.setLayoutParams(new ViewGroup.LayoutParams(SizeUtilsKt.getDpToPx(20.0f), SizeUtilsKt.getDpToPx(20.0f)));
        b bVar = new b();
        bVar.f11403b = true;
        Intrinsics.checkNotNullExpressionValue(bVar, "asCircle(...)");
        GenericDraweeHierarchyBuilder genericDraweeHierarchyBuilder = new GenericDraweeHierarchyBuilder(simpleDraweeView.getResources());
        genericDraweeHierarchyBuilder.f4719q = bVar;
        GenericDraweeHierarchy genericDraweeHierarchyA = genericDraweeHierarchyBuilder.a();
        Intrinsics.checkNotNullExpressionValue(genericDraweeHierarchyA, "build(...)");
        simpleDraweeView.setHierarchy(genericDraweeHierarchyA);
        SetImageUriWithCachePolicyKt.setImageUriWithCachePolicy(simpleDraweeView, sharedCustomThemeData.getCreatedByAvatarUrl());
        TextView textView2 = new TextView(getContext());
        textView2.setTextColor(ThemeManagerKt.getTheme().getTextStrong());
        textView2.setTextSize(14.0f);
        textView2.setText(author);
        this.binding.createdByContainer.addView(simpleDraweeView);
        this.binding.createdByContainer.addView(textView2);
        this.binding.createdByContainer.addView((View) arrayList.get(1));
    }

    @NotNull
    public final SharedCustomThemeViewBinding getBinding() {
        return this.binding;
    }

    @NotNull
    public final SimpleDraweeView getNitroWheelIcon() {
        return this.nitroWheelIcon;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        String str;
        super.onAttachedToWindow();
        if (this.hasViewed || (str = this.messageId) == null) {
            return;
        }
        Function1<? super MessageId, Unit> function1 = this.onViewed;
        if (function1 != null) {
            function1.invoke(MessageId.m1156boximpl(str));
        }
        this.hasViewed = true;
    }

    public /* synthetic */ SharedCustomThemeView(Context context, AttributeSet attributeSet, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i7 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedCustomThemeView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        SharedCustomThemeViewBinding sharedCustomThemeViewBindingInflate = SharedCustomThemeViewBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(sharedCustomThemeViewBindingInflate, "inflate(...)");
        this.binding = sharedCustomThemeViewBindingInflate;
        this.nitroWheelIcon = new SimpleDraweeView(context);
        View root = sharedCustomThemeViewBindingInflate.getRoot();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(SizeUtilsKt.getDpToPx(8));
        gradientDrawable.setColor(ThemeManagerKt.getTheme().getBackgroundModStrong());
        gradientDrawable.setStroke(SizeUtilsKt.getDpToPx(2), ThemeManagerKt.getTheme().getBorderSubtle());
        root.setBackground(gradientDrawable);
        Intrinsics.checkNotNull(root);
        int dpToPx = SizeUtilsKt.getDpToPx(12);
        root.setPadding(dpToPx, dpToPx, dpToPx, dpToPx);
    }
}
