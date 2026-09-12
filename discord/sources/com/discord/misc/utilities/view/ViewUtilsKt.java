package com.discord.misc.utilities.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u001a \u0010\u0005\u001a\u0004\u0018\u0001H\u0006\"\n\b\u0000\u0010\u0006\u0018\u0001*\u00020\u0007*\u00020\bH\u0086\b¢\u0006\u0002\u0010\t\u001a\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00060\u000b\"\n\b\u0000\u0010\u0006\u0018\u0001*\u00020\u0007*\u00020\bH\u0086\b\u001a\n\u0010\f\u001a\u00020\r*\u00020\b\u001a\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0086\u0010¨\u0006\u0012"}, d2 = {"setOptionalText", "", "Landroid/widget/TextView;", "text", "", "findParentView", "T", "Landroid/view/ViewGroup;", "Landroid/view/View;", "(Landroid/view/View;)Landroid/view/ViewGroup;", "findParentViews", "", "isLtr", "", "getWindow", "Landroid/view/Window;", "context", "Landroid/content/Context;", "misc_utilities_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nViewUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewUtils.kt\ncom/discord/misc/utilities/view/ViewUtilsKt\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,49:1\n21#1,9:52\n21#1,9:61\n257#2,2:50\n*S KotlinDebug\n*F\n+ 1 ViewUtils.kt\ncom/discord/misc/utilities/view/ViewUtilsKt\n*L\n34#1:52,9\n37#1:61,9\n17#1:50,2\n*E\n"})
public final class ViewUtilsKt {
    public static final /* synthetic */ <T extends ViewGroup> T findParentView(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewParent parent = view.getParent();
        T t5 = parent instanceof ViewGroup ? (T) parent : null;
        if (t5 == null) {
            return null;
        }
        Intrinsics.reifiedOperationMarker(2, "T");
        return t5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0021, code lost:
    
        r5 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ <T extends android.view.ViewGroup> java.util.List<T> findParentViews(android.view.View r5) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.view.ViewParent r5 = r5.getParent()
            boolean r1 = r5 instanceof android.view.ViewGroup
            r2 = 0
            if (r1 == 0) goto L16
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            goto L17
        L16:
            r5 = r2
        L17:
            java.lang.String r1 = "T"
            r3 = 2
            if (r5 == 0) goto L20
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(r3, r1)
            goto L21
        L20:
            r5 = r2
        L21:
            if (r5 == 0) goto L38
            r0.add(r5)
            android.view.ViewParent r5 = r5.getParent()
            boolean r4 = r5 instanceof android.view.ViewGroup
            if (r4 == 0) goto L31
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            goto L32
        L31:
            r5 = r2
        L32:
            if (r5 == 0) goto L20
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(r3, r1)
            goto L21
        L38:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.misc.utilities.view.ViewUtilsKt.findParentViews(android.view.View):java.util.List");
    }

    public static final Window getWindow(Context context) {
        while (context != null) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow();
            }
            ContextWrapper contextWrapper = context instanceof ContextWrapper ? (ContextWrapper) context : null;
            context = contextWrapper != null ? contextWrapper.getBaseContext() : null;
        }
        return null;
    }

    public static final boolean isLtr(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return view.getLayoutDirection() == 0;
    }

    public static final void setOptionalText(@NotNull TextView textView, CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        textView.setText(charSequence);
        textView.setVisibility(charSequence == null || StringsKt.K(charSequence) ? 8 : 0);
    }
}
