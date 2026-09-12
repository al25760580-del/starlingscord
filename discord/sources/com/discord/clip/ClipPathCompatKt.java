package com.discord.clip;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Region;
import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¨\u0006\u0007"}, d2 = {"clipPathCompat", "", "Landroid/graphics/Canvas;", "path", "Landroid/graphics/Path;", "op", "Landroid/graphics/Region$Op;", "clip_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ClipPathCompatKt {
    public static final boolean clipPathCompat(@NotNull Canvas canvas, @NotNull Path path, @NotNull Region.Op op2) {
        Intrinsics.checkNotNullParameter(canvas, "<this>");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(op2, "op");
        if (Build.VERSION.SDK_INT >= 26) {
            return op2 == Region.Op.DIFFERENCE ? canvas.clipOutPath(path) : canvas.clipPath(path);
        }
        return canvas.clipPath(path, op2);
    }
}
