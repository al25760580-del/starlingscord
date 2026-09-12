package com.discord.misc.utilities.view;

import android.content.res.ColorStateList;
import android.widget.Button;
import androidx.core.view.l0;
import androidx.core.view.u0;
import com.facebook.react.uimanager.ViewProps;
import java.util.ArrayList;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a%\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00042\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"setBackgroundColors", "", "Landroid/widget/Button;", ViewProps.COLOR, "", "disabledColor", "(Landroid/widget/Button;ILjava/lang/Integer;)V", "misc_utilities_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nButtonBackgroundUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ButtonBackgroundUtils.kt\ncom/discord/misc/utilities/view/ButtonBackgroundUtilsKt\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,29:1\n37#2:30\n36#2,3:31\n*S KotlinDebug\n*F\n+ 1 ButtonBackgroundUtils.kt\ncom/discord/misc/utilities/view/ButtonBackgroundUtilsKt\n*L\n25#1:30\n25#1:31,3\n*E\n"})
public final class ButtonBackgroundUtilsKt {
    public static final void setBackgroundColors(@NotNull Button button, int i7, Integer num) {
        Intrinsics.checkNotNullParameter(button, "<this>");
        ArrayList arrayList = new ArrayList(2);
        ArrayList arrayList2 = new ArrayList(2);
        if (num != null) {
            arrayList.add(new int[]{-16842910});
            arrayList2.add(num);
        }
        arrayList.add(new int[0]);
        arrayList2.add(Integer.valueOf(i7));
        ColorStateList colorStateList = new ColorStateList((int[][]) arrayList.toArray(new int[0][]), CollectionsKt.h0(arrayList2));
        WeakHashMap weakHashMap = u0.f1729a;
        l0.i(button, colorStateList);
    }

    public static /* synthetic */ void setBackgroundColors$default(Button button, int i7, Integer num, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            num = null;
        }
        setBackgroundColors(button, i7, num);
    }
}
