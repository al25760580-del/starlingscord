package mm;

import android.view.ViewGroup;
import com.facebook.react.uimanager.ThemedReactContext;
import com.swmansion.rnscreens.Screen;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f15894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f15895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f15896c;

    public d(ThemedReactContext reactContext, Screen screen) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(screen, "screen");
        b bVar = new b(reactContext, this.f15895b);
        bVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        bVar.setOnClickListener(new com.discord.chat.presentation.list.delegate.b(10, screen));
        this.f15894a = bVar;
        this.f15895b = 0.3f;
    }
}
