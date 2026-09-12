package vm;

import android.graphics.drawable.Drawable;
import android.util.Log;
import com.facebook.react.uimanager.ThemedReactContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends io.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f21772d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k f21773e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(k kVar, int i7) {
        super(null);
        this.f21772d = i7;
        this.f21773e = kVar;
    }

    @Override // io.c
    public final void afterChange(KProperty property, Object obj, Object obj2) {
        switch (this.f21772d) {
            case 0:
                Intrinsics.checkNotNullParameter(property, "property");
                k kVar = this.f21773e;
                k.a(kVar, (String) obj, (String) obj2);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(property, "property");
                k kVar2 = this.f21773e;
                k.a(kVar2, (String) obj, (String) obj2);
                break;
            case 2:
                Intrinsics.checkNotNullParameter(property, "property");
                k kVar3 = this.f21773e;
                k.a(kVar3, (Integer) obj, (Integer) obj2);
                break;
            case 3:
                Intrinsics.checkNotNullParameter(property, "property");
                k kVar4 = this.f21773e;
                k.a(kVar4, (Integer) obj, (Integer) obj2);
                break;
            case 4:
                Intrinsics.checkNotNullParameter(property, "property");
                k kVar5 = this.f21773e;
                k.a(kVar5, (String) obj, (String) obj2);
                break;
            case 5:
                Intrinsics.checkNotNullParameter(property, "property");
                k kVar6 = this.f21773e;
                k.a(kVar6, (String) obj, (String) obj2);
                break;
            case 6:
                Intrinsics.checkNotNullParameter(property, "property");
                String str = (String) obj2;
                if (!Intrinsics.areEqual(str, (String) obj)) {
                    k kVar7 = this.f21773e;
                    ThemedReactContext context = kVar7.getReactContext();
                    Intrinsics.checkNotNullParameter(context, "context");
                    Drawable drawableU = null;
                    if (str != null) {
                        int identifier = context.getResources().getIdentifier(str, "drawable", context.getPackageName());
                        if (identifier > 0) {
                            drawableU = mf.f.u(context, identifier);
                        } else {
                            int identifier2 = context.getResources().getIdentifier(str, "drawable", "android");
                            if (identifier2 > 0) {
                                drawableU = mf.f.u(context, identifier2);
                            } else {
                                Log.w("TabsScreen", "TabsScreen could not resolve drawable resource with the name ".concat(str));
                            }
                        }
                    }
                    kVar7.setIcon(drawableU);
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(property, "property");
                k kVar8 = this.f21773e;
                k.a(kVar8, (Drawable) obj, (Drawable) obj2);
                break;
        }
    }
}
