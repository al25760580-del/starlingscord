package io.sentry.android.replay;

import android.annotation.SuppressLint;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import rn.l;
import rn.m;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R!\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\t\u001a\u0004\u0018\u00010\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\f¨\u0006\u0012"}, d2 = {"Lio/sentry/android/replay/WindowSpy;", "", "()V", "decorViewClass", "Ljava/lang/Class;", "getDecorViewClass", "()Ljava/lang/Class;", "decorViewClass$delegate", "Lkotlin/Lazy;", "windowField", "Ljava/lang/reflect/Field;", "getWindowField", "()Ljava/lang/reflect/Field;", "windowField$delegate", "pullWindow", "Landroid/view/Window;", "maybeDecorView", "Landroid/view/View;", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"PrivateApi"})
@SourceDebugExtension({"SMAP\nWindows.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Windows.kt\nio/sentry/android/replay/WindowSpy\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,210:1\n1#2:211\n*E\n"})
public final class WindowSpy {
    public static final int $stable;

    @NotNull
    public static final WindowSpy INSTANCE = new WindowSpy();

    /* JADX INFO: renamed from: decorViewClass$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy decorViewClass;

    /* JADX INFO: renamed from: windowField$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy windowField;

    static {
        m mVar = m.f19487i;
        decorViewClass = l.a(mVar, new Function0<Class<?>>() { // from class: io.sentry.android.replay.WindowSpy$decorViewClass$2
            @Override // kotlin.jvm.functions.Function0
            public final Class<?> invoke() {
                try {
                    return Class.forName("com.android.internal.policy.DecorView");
                } catch (Throwable th2) {
                    Log.d("WindowSpy", "Unexpected exception loading DecorView on API " + Build.VERSION.SDK_INT, th2);
                    return null;
                }
            }
        });
        windowField = l.a(mVar, new Function0<Field>() { // from class: io.sentry.android.replay.WindowSpy$windowField$2
            @Override // kotlin.jvm.functions.Function0
            public final Field invoke() {
                Class decorViewClass2 = WindowSpy.INSTANCE.getDecorViewClass();
                if (decorViewClass2 == null) {
                    return null;
                }
                try {
                    Field declaredField = decorViewClass2.getDeclaredField("mWindow");
                    declaredField.setAccessible(true);
                    return declaredField;
                } catch (NoSuchFieldException e10) {
                    Log.d("WindowSpy", "Unexpected exception retrieving " + decorViewClass2 + "#mWindow on API " + Build.VERSION.SDK_INT, e10);
                    return null;
                }
            }
        });
        $stable = 8;
    }

    private WindowSpy() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Class<?> getDecorViewClass() {
        return (Class) decorViewClass.getValue();
    }

    private final Field getWindowField() {
        return (Field) windowField.getValue();
    }

    public final Window pullWindow(@NotNull View maybeDecorView) throws IllegalAccessException {
        Field windowField2;
        Intrinsics.checkNotNullParameter(maybeDecorView, "maybeDecorView");
        Class<?> decorViewClass2 = getDecorViewClass();
        if (decorViewClass2 == null || !decorViewClass2.isInstance(maybeDecorView) || (windowField2 = INSTANCE.getWindowField()) == null) {
            return null;
        }
        Object obj = windowField2.get(maybeDecorView);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type android.view.Window");
        return (Window) obj;
    }
}
