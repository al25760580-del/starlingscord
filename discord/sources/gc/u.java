package gc;

import android.view.View;
import android.view.ViewParent;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class u implements je.j, AccessibilityViewCommand {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9860d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f9861e;

    public /* synthetic */ u(int i7, Object obj) {
        this.f9861e = obj;
        this.f9860d = i7;
    }

    @Override // androidx.core.view.accessibility.AccessibilityViewCommand
    public boolean c(View view, AccessibilityViewCommand.CommandArguments commandArguments) throws IllegalAccessException, InvocationTargetException {
        SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f9861e;
        int i7 = this.f9860d;
        if (i7 == 1 || i7 == 2) {
            throw new IllegalArgumentException(com.discord.chat.presentation.list.a.k(new StringBuilder("STATE_"), i7 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        WeakReference weakReference = sideSheetBehavior.f6429p;
        if (weakReference == null || weakReference.get() == null) {
            sideSheetBehavior.s(i7);
            return true;
        }
        View view2 = (View) sideSheetBehavior.f6429p.get();
        a1.l lVar = new a1.l(i7, 6, sideSheetBehavior);
        ViewParent parent = view2.getParent();
        if (parent != null && parent.isLayoutRequested() && view2.isAttachedToWindow()) {
            view2.post(lVar);
            return true;
        }
        lVar.run();
        return true;
    }

    @Override // je.j
    public void invoke(Object obj) {
        ((com.google.android.exoplayer2.e) obj).onMediaItemTransition((MediaItem) this.f9861e, this.f9860d);
    }
}
