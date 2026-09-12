package bd;

import com.discord.chat.presentation.message.MessageView;
import com.facebook.react.modules.core.JavaTimerManager;
import com.facebook.react.uimanager.ViewGroupDrawingOrderHelper;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import java.util.Comparator;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class u implements Comparator {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3216d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3217e;

    public /* synthetic */ u(int i7, Object obj) {
        this.f3216d = i7;
        this.f3217e = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f3216d) {
            case 0:
                y yVar = (y) this.f3217e;
                return yVar.a(obj2) - yVar.a(obj);
            case 1:
                return MessageView.generateMessageAccessories$lambda$43((ar.s) this.f3217e, obj, obj2);
            case 2:
                return JavaTimerManager.timers$lambda$1((com.facebook.react.modules.core.a) this.f3217e, obj, obj2);
            case 3:
                return ViewGroupDrawingOrderHelper.getChildDrawingOrder$lambda$1((ar.s) this.f3217e, obj, obj2);
            case 4:
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this.f3217e;
                MaterialButton materialButton = (MaterialButton) obj;
                MaterialButton materialButton2 = (MaterialButton) obj2;
                int iCompareTo = Boolean.valueOf(materialButton.L).compareTo(Boolean.valueOf(materialButton2.L));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
                int iCompareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
                return iCompareTo2 != 0 ? iCompareTo2 : Integer.compare(materialButtonToggleGroup.indexOfChild(materialButton), materialButtonToggleGroup.indexOfChild(materialButton2));
            default:
                for (Function1 function1 : (Function1[]) this.f3217e) {
                    int iA = tn.a.a((Comparable) function1.invoke(obj), (Comparable) function1.invoke(obj2));
                    if (iA != 0) {
                        return iA;
                    }
                }
                return 0;
        }
    }
}
