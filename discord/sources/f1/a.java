package f1;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f8784a = new a();

    private a() {
    }

    public static final void a(@NotNull Bundle bundle, @NotNull String str, Size size) {
        bundle.putSize(str, size);
    }

    public static final void b(@NotNull Bundle bundle, @NotNull String str, SizeF sizeF) {
        bundle.putSizeF(str, sizeF);
    }
}
