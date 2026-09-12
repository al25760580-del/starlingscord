package mm;

import com.swmansion.rnscreens.Screen;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j {
    public static final boolean a(Screen screen) {
        Intrinsics.checkNotNullParameter(screen, "<this>");
        return screen.getStackPresentation() == Screen.StackPresentation.f7145v && screen.getSheetDetents().f7172a.size() == 1 && ((Number) CollectionsKt.K(screen.getSheetDetents().f7172a)).doubleValue() == -1.0d;
    }

    public static final boolean b(Screen screen) {
        Intrinsics.checkNotNullParameter(screen, "<this>");
        return screen.getStackPresentation() == Screen.StackPresentation.f7145v;
    }
}
