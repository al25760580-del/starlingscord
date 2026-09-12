package app.rive.core;

import app.rive.Fit;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lapp/rive/core/RenderingDefaults;", "", "()V", "CLEAR_COLOR", "", "defaultFit", "Lapp/rive/Fit;", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RenderingDefaults {
    public static final int $stable = 0;
    public static final int CLEAR_COLOR = 0;

    @NotNull
    public static final RenderingDefaults INSTANCE = new RenderingDefaults();

    private RenderingDefaults() {
    }

    @NotNull
    public final Fit defaultFit() {
        return new Fit.Contain(null, 1, null);
    }
}
