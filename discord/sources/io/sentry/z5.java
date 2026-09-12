package io.sentry;

import java.util.Locale;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public enum z5 {
    LOW(0.8f, 50000, 10),
    MEDIUM(1.0f, 75000, 30),
    HIGH(1.0f, 100000, 50);

    public final int bitRate;
    public final int screenshotQuality;
    public final float sizeScale;

    z5(float f2, int i7, int i10) {
        this.sizeScale = f2;
        this.bitRate = i7;
        this.screenshotQuality = i10;
    }

    @NotNull
    public String serializedName() {
        return name().toLowerCase(Locale.ROOT);
    }
}
