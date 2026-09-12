package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.r0;
import ar.b0;
import ar.k0;
import com.discord.SetTextSizeSpKt;
import com.discord.chat.bridge.spoiler.SpoilerConfig;
import com.discord.chat.databinding.FileAttachmentViewBinding;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.misc.utilities.coroutines.AttachedViewCoroutineScope;
import com.discord.misc.utilities.coroutines.CoroutineViewUtilsKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt;
import com.discord.misc.utilities.view.ViewUtilsKt;
import com.discord.react_asset_fetcher.ReactAsset;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.discord.react_strings.I18nMessage;
import com.discord.react_strings.I18nUtilsKt;
import com.discord.theme.R;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007Jm\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0011\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/discord/chat/presentation/message/view/FileAttachmentView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "attachmentName", "attachmentDescription", "url", "", "isSuspiciousDownload", "Lkotlin/Function2;", "", ViewProps.ON_CLICK, "isSpoiler", "Lcom/discord/chat/bridge/spoiler/SpoilerConfig;", "spoilerConfig", "Lcom/discord/chat/presentation/message/view/UploadItemProps;", "uploadItemProps", "", ViewProps.BACKGROUND_COLOR, "setContent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function2;ZLcom/discord/chat/bridge/spoiler/SpoilerConfig;Lcom/discord/chat/presentation/message/view/UploadItemProps;Ljava/lang/Integer;)V", "Lcom/discord/chat/databinding/FileAttachmentViewBinding;", "binding", "Lcom/discord/chat/databinding/FileAttachmentViewBinding;", "uploadFinished", "Z", "Lcom/discord/chat/presentation/message/view/UploadContext;", "uploadContext", "Lcom/discord/chat/presentation/message/view/UploadContext;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFileAttachmentView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileAttachmentView.kt\ncom/discord/chat/presentation/message/view/FileAttachmentView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,151:1\n176#2,2:152\n257#2,2:154\n278#2,2:156\n255#2:158\n257#2,2:159\n257#2,2:161\n*S KotlinDebug\n*F\n+ 1 FileAttachmentView.kt\ncom/discord/chat/presentation/message/view/FileAttachmentView\n*L\n56#1:152,2\n72#1:154,2\n73#1:156,2\n116#1:158\n140#1:159,2\n143#1:161,2\n*E\n"})
public class FileAttachmentView extends ConstraintLayout {

    @NotNull
    private final FileAttachmentViewBinding binding;
    private UploadContext uploadContext;
    private boolean uploadFinished;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FileAttachmentView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setContent$lambda$1(boolean z5, Function2 function2, String str, String str2, FileAttachmentView fileAttachmentView, String str3, View view) {
        if (z5) {
            function2.invoke(str, str2);
            return;
        }
        AttachedViewCoroutineScope attachedScope = CoroutineViewUtilsKt.getAttachedScope(fileAttachmentView);
        hr.e eVar = k0.f2938a;
        b0.t(attachedScope, hr.d.f11103i, new FileAttachmentView$setContent$2$1(fileAttachmentView, str, str2, str3, null), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setContent$lambda$3(FileAttachmentView fileAttachmentView) {
        LinearLayout uploadOverlayBackground = fileAttachmentView.binding.uploadOverlayBackground;
        Intrinsics.checkNotNullExpressionValue(uploadOverlayBackground, "uploadOverlayBackground");
        uploadOverlayBackground.setVisibility(8);
        fileAttachmentView.uploadFinished = true;
        return Unit.f14616a;
    }

    public final void setContent(@NotNull final String attachmentName, @NotNull final String attachmentDescription, @NotNull final String url, final boolean isSuspiciousDownload, @NotNull final Function2<? super String, ? super String, Unit> onClick, boolean isSpoiler, SpoilerConfig spoilerConfig, UploadItemProps uploadItemProps, Integer backgroundColor) {
        Intrinsics.checkNotNullParameter(attachmentName, "attachmentName");
        Intrinsics.checkNotNullParameter(attachmentDescription, "attachmentDescription");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        boolean z5 = uploadItemProps != null;
        AttachedViewCoroutineScope.cancelAllWork$default(CoroutineViewUtilsKt.getAttachedScope(this), "Binding ".concat(getClass().getSimpleName()), null, 2, null);
        SimpleDraweeView fileAttachmentDownload = this.binding.fileAttachmentDownload;
        Intrinsics.checkNotNullExpressionValue(fileAttachmentDownload, "fileAttachmentDownload");
        fileAttachmentDownload.setVisibility(!z5 ? 0 : 8);
        ProgressBar fileAttachmentDownloadProgressBar = this.binding.fileAttachmentDownloadProgressBar;
        Intrinsics.checkNotNullExpressionValue(fileAttachmentDownloadProgressBar, "fileAttachmentDownloadProgressBar");
        fileAttachmentDownloadProgressBar.setVisibility(4);
        TextView fileAttachmentName = this.binding.fileAttachmentName;
        Intrinsics.checkNotNullExpressionValue(fileAttachmentName, "fileAttachmentName");
        ViewUtilsKt.setOptionalText(fileAttachmentName, attachmentName);
        TextView fileAttachmentDescription = this.binding.fileAttachmentDescription;
        Intrinsics.checkNotNullExpressionValue(fileAttachmentDescription, "fileAttachmentDescription");
        ViewUtilsKt.setOptionalText(fileAttachmentDescription, attachmentDescription);
        int iIntValue = backgroundColor != null ? backgroundColor.intValue() : ThemeManagerKt.getTheme().getBackgroundSurfaceHigh();
        View root = this.binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        ViewBackgroundUtilsKt.setBackgroundRectangle(root, iIntValue, SizeUtilsKt.getDpToPx(8), Integer.valueOf(ColorUtilsKt.getColorCompat(this, R.color.primary_dark_700_alpha_60)), SizeUtilsKt.getDpToPx(0.25f));
        if (!z5) {
            NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(this, false, new k(0, url, attachmentName, onClick), 1, null);
        }
        SimpleDraweeView fileAttachmentDownload2 = this.binding.fileAttachmentDownload;
        Intrinsics.checkNotNullExpressionValue(fileAttachmentDownload2, "fileAttachmentDownload");
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(fileAttachmentDownload2, false, new View.OnClickListener() { // from class: com.discord.chat.presentation.message.view.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FileAttachmentView.setContent$lambda$1(isSuspiciousDownload, onClick, url, attachmentName, this, attachmentDescription, view);
            }
        }, 1, null);
        this.binding.spoiler.configure(spoilerConfig, this);
        if (isSpoiler) {
            SpoilerView spoiler = this.binding.spoiler;
            Intrinsics.checkNotNullExpressionValue(spoiler, "spoiler");
            if (spoiler.getVisibility() == 0) {
                this.binding.fileAttachmentDownload.setImportantForAccessibility(4);
                this.binding.fileAttachmentName.setImportantForAccessibility(4);
                this.binding.fileAttachmentDescription.setImportantForAccessibility(4);
            }
        }
        this.binding.getRoot().setAlpha(uploadItemProps != null ? uploadItemProps.getUploadOpacity() : 1.0f);
        AttachmentUploadOverlayView attachmentUploadOverlayView = this.binding.uploadOverlay;
        int interactiveTextDefault = ThemeManagerKt.getTheme().getInteractiveTextDefault();
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        Paint paint = shapeDrawable.getPaint();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        paint.setColor(ColorUtilsKt.getColorCompat(context, android.R.color.transparent));
        AttachmentUploadOverlayView.configureProgressView$default(attachmentUploadOverlayView, null, shapeDrawable, null, Integer.valueOf(interactiveTextDefault), null, Integer.valueOf(ThemeManagerKt.getTheme().getBorderSubtle()), 21, null);
        UploadContext uploadContext = this.uploadContext;
        if (!Intrinsics.areEqual(uploadContext, uploadContext)) {
            this.uploadContext = this.uploadContext;
            this.uploadFinished = false;
        }
        if (z5 && !this.uploadFinished) {
            this.binding.uploadOverlayBackground.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundSurfaceHigh());
            LinearLayout uploadOverlayBackground = this.binding.uploadOverlayBackground;
            Intrinsics.checkNotNullExpressionValue(uploadOverlayBackground, "uploadOverlayBackground");
            uploadOverlayBackground.setVisibility(0);
        }
        r0 r0Var = new r0(10, this);
        this.binding.uploadOverlay.setProgress(uploadItemProps);
        this.binding.uploadOverlay.setUploadCancel(uploadItemProps);
        this.binding.uploadOverlay.setOnProgressAnimationComplete(r0Var);
    }

    public /* synthetic */ FileAttachmentView(Context context, AttributeSet attributeSet, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i7 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileAttachmentView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        FileAttachmentViewBinding fileAttachmentViewBindingInflate = FileAttachmentViewBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(fileAttachmentViewBindingInflate, "inflate(...)");
        this.binding = fileAttachmentViewBindingInflate;
        SimpleDraweeView fileAttachmentDownload = fileAttachmentViewBindingInflate.fileAttachmentDownload;
        Intrinsics.checkNotNullExpressionValue(fileAttachmentDownload, "fileAttachmentDownload");
        ReactAssetUtilsKt.setReactAsset(fileAttachmentDownload, ReactAsset.DownloadIcon);
        SimpleDraweeView fileAttachmentDownload2 = fileAttachmentViewBindingInflate.fileAttachmentDownload;
        Intrinsics.checkNotNullExpressionValue(fileAttachmentDownload2, "fileAttachmentDownload");
        ColorUtilsKt.setTintColor(fileAttachmentDownload2, Integer.valueOf(ThemeManagerKt.getTheme().getTextMuted()));
        fileAttachmentViewBindingInflate.fileAttachmentDownload.setContentDescription(I18nUtilsKt.i18nFormat$default(context, I18nMessage.DOWNLOAD, null, 2, null));
        SimpleDraweeView fileAttachmentIcon = fileAttachmentViewBindingInflate.fileAttachmentIcon;
        Intrinsics.checkNotNullExpressionValue(fileAttachmentIcon, "fileAttachmentIcon");
        ReactAssetUtilsKt.setReactAsset(fileAttachmentIcon, ReactAsset.PaperIcon);
        SimpleDraweeView fileAttachmentIcon2 = fileAttachmentViewBindingInflate.fileAttachmentIcon;
        Intrinsics.checkNotNullExpressionValue(fileAttachmentIcon2, "fileAttachmentIcon");
        ColorUtilsKt.setTintColor(fileAttachmentIcon2, Integer.valueOf(ThemeManagerKt.getTheme().getTextMuted()));
        fileAttachmentViewBindingInflate.fileAttachmentName.setTextColor(ThemeManagerKt.getTheme().getTextLink());
        TextView fileAttachmentName = fileAttachmentViewBindingInflate.fileAttachmentName;
        Intrinsics.checkNotNullExpressionValue(fileAttachmentName, "fileAttachmentName");
        DiscordFont discordFont = DiscordFont.PrimaryMedium;
        DiscordFontUtilsKt.setDiscordFont(fileAttachmentName, discordFont);
        fileAttachmentViewBindingInflate.fileAttachmentDescription.setTextColor(ThemeManagerKt.getTheme().getTextDefault());
        TextView fileAttachmentDescription = fileAttachmentViewBindingInflate.fileAttachmentDescription;
        Intrinsics.checkNotNullExpressionValue(fileAttachmentDescription, "fileAttachmentDescription");
        SetTextSizeSpKt.setTextSizeSp(fileAttachmentDescription, 12.0f);
        TextView fileAttachmentDescription2 = fileAttachmentViewBindingInflate.fileAttachmentDescription;
        Intrinsics.checkNotNullExpressionValue(fileAttachmentDescription2, "fileAttachmentDescription");
        DiscordFontUtilsKt.setDiscordFont(fileAttachmentDescription2, discordFont);
        fileAttachmentViewBindingInflate.fileAttachmentDownloadProgressBar.setIndeterminateTintList(ColorStateList.valueOf(ThemeManagerKt.getTheme().getTextMuted()));
        View root = fileAttachmentViewBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        int dpToPx = SizeUtilsKt.getDpToPx(8);
        root.setPadding(dpToPx, dpToPx, dpToPx, dpToPx);
    }
}
