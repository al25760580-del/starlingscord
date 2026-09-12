package com.discord.chat.input.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Editable;
import com.discord.chat.input.bridge.ChatInputNode;
import com.discord.chat.input.spans.DCDLeadingIconSpan;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.theme.ThemeManagerKt;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0018\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J \u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0018\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/discord/chat/input/views/ChatInputLeadingIconRenderer;", "", "editText", "Lcom/discord/chat/input/views/DCDChatInput;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "(Lcom/discord/chat/input/views/DCDChatInput;Lkotlinx/coroutines/CoroutineScope;)V", "loader", "Lcom/discord/chat/input/views/ChatInputLeadingIconLoader;", "applyLeadingIcon", "", "node", "Lcom/discord/chat/input/bridge/ChatInputNode;", "refreshLeadingIconSpansFromCache", "iconUrl", "", "bitmap", "Landroid/graphics/Bitmap;", "roundedIcon", "Landroid/graphics/drawable/Drawable;", "sizePx", "", "cornerRadiusPx", "", "skeletonIcon", "chat_input_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nChatInputLeadingIconRenderer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChatInputLeadingIconRenderer.kt\ncom/discord/chat/input/views/ChatInputLeadingIconRenderer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n1#2:94\n*E\n"})
public final class ChatInputLeadingIconRenderer {

    @NotNull
    private final DCDChatInput editText;

    @NotNull
    private final ChatInputLeadingIconLoader loader;

    public ChatInputLeadingIconRenderer(@NotNull DCDChatInput editText, @NotNull CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(editText, "editText");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.editText = editText;
        Context context = editText.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.loader = new ChatInputLeadingIconLoader(context, scope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit applyLeadingIcon$lambda$2(ChatInputLeadingIconRenderer chatInputLeadingIconRenderer, String str, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        chatInputLeadingIconRenderer.refreshLeadingIconSpansFromCache(str, bitmap);
        return Unit.f14616a;
    }

    private final void refreshLeadingIconSpansFromCache(String iconUrl, Bitmap bitmap) {
        Editable editableText = this.editText.getEditableText();
        Iterator it = ArrayIteratorKt.iterator(editableText.getSpans(0, editableText.length(), DCDLeadingIconSpan.class));
        while (it.hasNext()) {
            DCDLeadingIconSpan dCDLeadingIconSpan = (DCDLeadingIconSpan) it.next();
            if (Intrinsics.areEqual(dCDLeadingIconSpan.getIconUrl(), iconUrl)) {
                int spanStart = editableText.getSpanStart(dCDLeadingIconSpan);
                int spanEnd = editableText.getSpanEnd(dCDLeadingIconSpan);
                dCDLeadingIconSpan.setDrawable(roundedIcon(bitmap, dCDLeadingIconSpan.getSizePx(), dCDLeadingIconSpan.getCornerRadiusPx()));
                editableText.setSpan(dCDLeadingIconSpan, spanStart, spanEnd, 33);
            }
        }
    }

    private final Drawable roundedIcon(Bitmap bitmap, int sizePx, float cornerRadiusPx) {
        c1.a aVar = new c1.a(this.editText.getResources(), bitmap);
        if (aVar.f3417g != cornerRadiusPx) {
            Paint paint = aVar.f3414d;
            if (cornerRadiusPx > 0.05f) {
                paint.setShader(aVar.f3415e);
            } else {
                paint.setShader(null);
            }
            aVar.f3417g = cornerRadiusPx;
            aVar.invalidateSelf();
        }
        aVar.setBounds(0, 0, sizePx, sizePx);
        Intrinsics.checkNotNullExpressionValue(aVar, "apply(...)");
        return aVar;
    }

    private final Drawable skeletonIcon(int sizePx, float cornerRadiusPx) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(cornerRadiusPx);
        gradientDrawable.setColor(ThemeManagerKt.getTheme().getBackgroundModNormal());
        gradientDrawable.setBounds(0, 0, sizePx, sizePx);
        return gradientDrawable;
    }

    public final void applyLeadingIcon(@NotNull ChatInputNode node) {
        String icon;
        Drawable drawableSkeletonIcon;
        Intrinsics.checkNotNullParameter(node, "node");
        Editable editableText = this.editText.getEditableText();
        int location = node.getLocation();
        int i7 = location + 1;
        if (location < 0 || i7 > editableText.length() || (icon = node.getIcon()) == null) {
            return;
        }
        if (icon.length() <= 0) {
            icon = null;
        }
        String str = icon;
        if (str == null) {
            return;
        }
        Float iconSize = node.getIconSize();
        int spToPx = SizeUtilsKt.getSpToPx(ho.c.b(iconSize != null ? iconSize.floatValue() : 16.0f));
        Float iconCornerRadius = node.getIconCornerRadius();
        float spToPx2 = SizeUtilsKt.getSpToPx(ho.c.b(iconCornerRadius != null ? iconCornerRadius.floatValue() : 4.0f));
        Float iconSpacing = node.getIconSpacing();
        int spToPx3 = SizeUtilsKt.getSpToPx(ho.c.b(iconSpacing != null ? iconSpacing.floatValue() : 4.0f));
        Bitmap bitmapCachedBitmap = this.loader.cachedBitmap(str);
        if (bitmapCachedBitmap == null || (drawableSkeletonIcon = roundedIcon(bitmapCachedBitmap, spToPx, spToPx2)) == null) {
            drawableSkeletonIcon = skeletonIcon(spToPx, spToPx2);
        }
        editableText.setSpan(new DCDLeadingIconSpan(str, drawableSkeletonIcon, spToPx, spToPx2, spToPx3, spToPx3), location, i7, 33);
        if (bitmapCachedBitmap == null) {
            this.loader.load(str, new b7.a(3, this, str));
        }
    }
}
