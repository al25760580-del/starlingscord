package com.facebook.react.views.text;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u001a\u0010\f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000bH\u0002¨\u0006\u000e"}, d2 = {"Lcom/facebook/react/views/text/DefaultStyleValuesUtil;", "", "<init>", "()V", "getDefaultTextColorHint", "Landroid/content/res/ColorStateList;", "context", "Landroid/content/Context;", "getDefaultTextColor", "getTextColorSecondary", "getDefaultTextColorHighlight", "", "getDefaultTextAttribute", "attribute", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDefaultStyleValuesUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultStyleValuesUtil.kt\ncom/facebook/react/views/text/DefaultStyleValuesUtil\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n*L\n1#1,65:1\n233#2,3:66\n*S KotlinDebug\n*F\n+ 1 DefaultStyleValuesUtil.kt\ncom/facebook/react/views/text/DefaultStyleValuesUtil\n*L\n60#1:66,3\n*E\n"})
public final class DefaultStyleValuesUtil {

    @NotNull
    public static final DefaultStyleValuesUtil INSTANCE = new DefaultStyleValuesUtil();

    private DefaultStyleValuesUtil() {
    }

    private final ColorStateList getDefaultTextAttribute(Context context, int attribute) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{attribute});
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        return typedArrayObtainStyledAttributes.getColorStateList(0);
    }

    public static final ColorStateList getDefaultTextColor(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return INSTANCE.getDefaultTextAttribute(context, R.attr.textColor);
    }

    public static final int getDefaultTextColorHighlight(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ColorStateList defaultTextAttribute = INSTANCE.getDefaultTextAttribute(context, R.attr.textColorHighlight);
        if (defaultTextAttribute != null) {
            return defaultTextAttribute.getDefaultColor();
        }
        return 0;
    }

    public static final ColorStateList getDefaultTextColorHint(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return INSTANCE.getDefaultTextAttribute(context, R.attr.textColorHint);
    }

    public static final ColorStateList getTextColorSecondary(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return INSTANCE.getDefaultTextAttribute(context, R.attr.textColorSecondary);
    }
}
