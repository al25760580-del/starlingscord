package io.sentry.android.replay.util;

import android.graphics.Rect;
import com.facebook.react.uimanager.ViewProps;
import e0.a;
import g0.k;
import g0.q;
import i0.u;
import java.lang.reflect.Field;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import z.f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\t\u001a0\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0082\b¢\u0006\u0004\b\u000f\u0010\u0010\u001a0\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0082\b¢\u0006\u0004\b\u0011\u0010\u0010\u001a$\u0010\u0014\u001a\u00020\n*\u00020\n2\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\nH\u0082\b¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001c\u0010\u0016\u001a\u00020\n*\u00020\n2\u0006\u0010\u0012\u001a\u00020\nH\u0082\b¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001c\u0010\u0018\u001a\u00020\n*\u00020\n2\u0006\u0010\u0013\u001a\u00020\nH\u0082\b¢\u0006\u0004\b\u0018\u0010\u0017\u001a\u001d\u0010\u001c\u001a\u00020\u001b*\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0000¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Li0/u;", "Le0/a;", "findPainter", "(Li0/u;)Le0/a;", "", "isMaskable", "(Le0/a;)Z", "Lio/sentry/android/replay/util/TextAttributes;", "findTextAttributes", "(Li0/u;)Lio/sentry/android/replay/util/TextAttributes;", "", "a", "b", "c", "d", "fastMinOf", "(FFFF)F", "fastMaxOf", "minimumValue", "maximumValue", "fastCoerceIn", "(FFF)F", "fastCoerceAtLeast", "(FF)F", "fastCoerceAtMost", "Lg0/k;", "rootCoordinates", "Landroid/graphics/Rect;", "boundsInWindow", "(Lg0/k;Lg0/k;)Landroid/graphics/Rect;", "sentry-android-replay_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNodes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Nodes.kt\nio/sentry/android/replay/util/NodesKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,217:1\n163#1,5:219\n159#1,9:224\n159#1,9:233\n159#1,9:242\n159#1,9:251\n143#1:260\n151#1:261\n143#1:262\n151#1:263\n1#2:218\n*S KotlinDebug\n*F\n+ 1 Nodes.kt\nio/sentry/android/replay/util/NodesKt\n*L\n159#1:219,5\n185#1:224,9\n186#1:233,9\n187#1:242,9\n188#1:251,9\n204#1:260\n205#1:261\n212#1:262\n213#1:263\n*E\n"})
public final class NodesKt {
    @NotNull
    public static final Rect boundsInWindow(@NotNull k kVar, k kVar2) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        if (kVar2 == null) {
            Intrinsics.checkNotNullParameter(kVar, "<this>");
            kVar.i();
            throw null;
        }
        kVar2.g();
        kVar2.g();
        kVar2.k(kVar);
        throw null;
    }

    private static final float fastCoerceAtLeast(float f2, float f7) {
        return f2 < f7 ? f7 : f2;
    }

    private static final float fastCoerceAtMost(float f2, float f7) {
        return f2 > f7 ? f7 : f2;
    }

    private static final float fastCoerceIn(float f2, float f7, float f10) {
        if (f2 < f7) {
            f2 = f7;
        }
        return f2 > f10 ? f10 : f2;
    }

    private static final float fastMaxOf(float f2, float f7, float f10, float f11) {
        return Math.max(f2, Math.max(f7, Math.max(f10, f11)));
    }

    private static final float fastMinOf(float f2, float f7, float f10, float f11) {
        return Math.min(f2, Math.min(f7, Math.min(f10, f11)));
    }

    public static final a findPainter(@NotNull u uVar) {
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        List listD = uVar.d();
        int size = listD.size();
        for (int i7 = 0; i7 < size; i7++) {
            f fVar = ((q) listD.get(i7)).f9448a;
            String name = fVar.getClass().getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            if (StringsKt.D(name, "Painter", false)) {
                try {
                    Field declaredField = fVar.getClass().getDeclaredField("painter");
                    declaredField.setAccessible(true);
                    declaredField.get(fVar);
                    return null;
                } catch (Throwable unused) {
                }
            }
        }
        return null;
    }

    @NotNull
    public static final TextAttributes findTextAttributes(@NotNull u uVar) {
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        List listD = uVar.d();
        int size = listD.size();
        boolean z5 = false;
        for (int i7 = 0; i7 < size; i7++) {
            f fVar = ((q) listD.get(i7)).f9448a;
            String name = fVar.getClass().getName();
            Intrinsics.checkNotNull(name);
            if (StringsKt.D(name, "Text", false)) {
                try {
                    Field declaredField = fVar.getClass().getDeclaredField(ViewProps.COLOR);
                    declaredField.setAccessible(true);
                    declaredField.get(fVar);
                } catch (Throwable unused) {
                }
            } else if (StringsKt.D(name, "Fill", false)) {
                z5 = true;
            }
        }
        return new TextAttributes(null, z5, null);
    }

    public static final boolean isMaskable(@NotNull a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        throw null;
    }
}
