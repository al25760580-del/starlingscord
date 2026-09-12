package com.facebook.react.views.view;

import android.view.View;
import com.facebook.react.R;
import com.facebook.react.uimanager.PointerEvents;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rn.n;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/facebook/react/views/view/ImportantForInteractionHelper;", "", "<init>", "()V", "IMPORTANT_FOR_INTERACTION_YES", "", "IMPORTANT_FOR_INTERACTION_NO", "IMPORTANT_FOR_INTERACTION_EXCLUDE_DESCENDANTS", "IMPORTANT_FOR_INTERACTION_AUTO_CSSPOINTEREVENTSAUTO", "setImportantForInteraction", "", "view", "Landroid/view/View;", ViewProps.POINTER_EVENTS, "Lcom/facebook/react/uimanager/PointerEvents;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ImportantForInteractionHelper {
    public static final int IMPORTANT_FOR_INTERACTION_AUTO_CSSPOINTEREVENTSAUTO = 8;
    public static final int IMPORTANT_FOR_INTERACTION_EXCLUDE_DESCENDANTS = 4;
    public static final int IMPORTANT_FOR_INTERACTION_NO = 2;
    public static final int IMPORTANT_FOR_INTERACTION_YES = 1;

    @NotNull
    public static final ImportantForInteractionHelper INSTANCE = new ImportantForInteractionHelper();

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PointerEvents.values().length];
            try {
                iArr[PointerEvents.AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PointerEvents.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PointerEvents.BOX_ONLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PointerEvents.BOX_NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private ImportantForInteractionHelper() {
    }

    public static final void setImportantForInteraction(@NotNull View view, @NotNull PointerEvents pointerEvents) {
        int i7;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(pointerEvents, "pointerEvents");
        int i10 = WhenMappings.$EnumSwitchMapping$0[pointerEvents.ordinal()];
        if (i10 != 1) {
            i7 = 2;
            if (i10 == 2) {
                i7 = 6;
            } else if (i10 == 3) {
                i7 = 12;
            } else if (i10 != 4) {
                throw new n();
            }
        } else {
            i7 = 8;
        }
        view.setTag(R.id.important_for_interaction, Integer.valueOf(i7));
    }
}
