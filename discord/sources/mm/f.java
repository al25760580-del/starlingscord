package mm;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import com.swmansion.rnscreens.Screen;
import com.swmansion.rnscreens.ScreenFooter;
import com.swmansion.rnscreens.e0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends rg.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15900b;

    public /* synthetic */ f(int i7, Object obj) {
        this.f15899a = i7;
        this.f15900b = obj;
    }

    @Override // rg.b
    public final void a(View bottomSheet, float f2) {
        switch (this.f15899a) {
            case 0:
            case 1:
                Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
                break;
            default:
                Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
                ScreenFooter screenFooter = (ScreenFooter) this.f15900b;
                screenFooter.f7152v = Math.max(f2, 0.0f);
                if (!screenFooter.f7151i) {
                    screenFooter.e(screenFooter.f7150e, screenFooter.getReactHeight(), ScreenFooter.d(screenFooter, screenFooter.f7152v), screenFooter.f7153w);
                }
                break;
        }
    }

    @Override // rg.b
    public final void b(int i7, View bottomSheet) {
        int i10 = this.f15899a;
        int i11 = 0;
        Object obj = this.f15900b;
        switch (i10) {
            case 0:
                Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
                if (i7 == 4 && WindowInsetsCompat.g(null, bottomSheet.getRootWindowInsets()).f1605a.p(8)) {
                    bottomSheet.requestFocus();
                    InputMethodManager inputMethodManagerE = ((i) obj).e();
                    if (inputMethodManagerE != null) {
                        inputMethodManagerE.hideSoftInputFromWindow(bottomSheet.getWindowToken(), 0);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
                i iVar = (i) obj;
                Screen screen = iVar.f15906d;
                boolean z5 = i7 == 3 || i7 == 4 || i7 == 5 || i7 == 6;
                if (z5) {
                    int size = screen.getSheetDetents().f7172a.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size != 3) {
                                throw new IllegalArgumentException(a3.e.g(i7, size, "[RNScreens] Invalid state ", " for detentCount "));
                            }
                            if (i7 == 3) {
                                i11 = 2;
                            } else if (i7 != 4) {
                                if (i7 != 5) {
                                    if (i7 != 6) {
                                        throw new IllegalArgumentException(a3.e.g(i7, size, "[RNScreens] Invalid state ", " for detentCount "));
                                    }
                                    i11 = 1;
                                } else {
                                    i11 = -1;
                                }
                            }
                        } else if (i7 == 3) {
                            i11 = 1;
                        } else if (i7 != 4) {
                            if (i7 != 5) {
                                throw new IllegalArgumentException(a3.e.g(i7, size, "[RNScreens] Invalid state ", " for detentCount "));
                            }
                            i11 = -1;
                        }
                    } else if (i7 != 3) {
                        if (i7 != 5) {
                            throw new IllegalArgumentException(a3.e.g(i7, size, "[RNScreens] Invalid state ", " for detentCount "));
                        }
                        i11 = -1;
                    }
                    iVar.f15912y = i11;
                }
                screen.onSheetDetentChanged$react_native_screens_release(iVar.f15912y, z5);
                if (i7 == 5) {
                    Fragment fragment = screen.getFragment();
                    Intrinsics.checkNotNull(fragment, "null cannot be cast to non-null type com.swmansion.rnscreens.ScreenStackFragment");
                    ((e0) fragment).y();
                    return;
                }
                return;
            default:
                ScreenFooter screenFooter = (ScreenFooter) obj;
                Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
                if (i7 == 3 || i7 == 4 || i7 == 5 || i7 == 6) {
                    if (i7 == 3 || i7 == 4 || i7 == 6) {
                        screenFooter.e(screenFooter.f7150e, screenFooter.getReactHeight(), screenFooter.h(i7), screenFooter.f7153w);
                    }
                    int i12 = ScreenFooter.E;
                    return;
                }
                return;
        }
    }
}
