package io.sentry.android.replay;

import android.annotation.SuppressLint;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rn.l;
import rn.m;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J<\u0010\u0012\u001a\u00020\u001322\u0010\u0014\u001a.\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00170\u0016j\b\u0012\u0004\u0012\u00020\u0017`\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00170\u0016j\b\u0012\u0004\u0012\u00020\u0017`\u00180\u0015H\u0007R\u001d\u0010\u0003\u001a\u0004\u0018\u00010\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R!\u0010\t\u001a\b\u0012\u0002\b\u0003\u0018\u00010\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u000e\u001a\u0004\u0018\u00010\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\b\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0019"}, d2 = {"Lio/sentry/android/replay/WindowManagerSpy;", "", "()V", "mViewsField", "Ljava/lang/reflect/Field;", "getMViewsField", "()Ljava/lang/reflect/Field;", "mViewsField$delegate", "Lkotlin/Lazy;", "windowManagerClass", "Ljava/lang/Class;", "getWindowManagerClass", "()Ljava/lang/Class;", "windowManagerClass$delegate", "windowManagerInstance", "getWindowManagerInstance", "()Ljava/lang/Object;", "windowManagerInstance$delegate", "swapWindowManagerGlobalMViews", "", "swap", "Lkotlin/Function1;", "Ljava/util/ArrayList;", "Landroid/view/View;", "Lkotlin/collections/ArrayList;", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class WindowManagerSpy {
    public static final int $stable;

    @NotNull
    public static final WindowManagerSpy INSTANCE = new WindowManagerSpy();

    /* JADX INFO: renamed from: mViewsField$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy mViewsField;

    /* JADX INFO: renamed from: windowManagerClass$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy windowManagerClass;

    /* JADX INFO: renamed from: windowManagerInstance$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy windowManagerInstance;

    static {
        m mVar = m.f19487i;
        windowManagerClass = l.a(mVar, new Function0<Class<?>>() { // from class: io.sentry.android.replay.WindowManagerSpy$windowManagerClass$2
            @Override // kotlin.jvm.functions.Function0
            public final Class<?> invoke() {
                try {
                    return Class.forName("android.view.WindowManagerGlobal");
                } catch (Throwable th2) {
                    Log.w("WindowManagerSpy", th2);
                    return null;
                }
            }
        });
        windowManagerInstance = l.a(mVar, new Function0<Object>() { // from class: io.sentry.android.replay.WindowManagerSpy$windowManagerInstance$2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Method method;
                Class windowManagerClass2 = WindowManagerSpy.INSTANCE.getWindowManagerClass();
                if (windowManagerClass2 == null || (method = windowManagerClass2.getMethod("getInstance", null)) == null) {
                    return null;
                }
                return method.invoke(null, null);
            }
        });
        mViewsField = l.a(mVar, new Function0<Field>() { // from class: io.sentry.android.replay.WindowManagerSpy$mViewsField$2
            @Override // kotlin.jvm.functions.Function0
            public final Field invoke() throws NoSuchFieldException {
                Class windowManagerClass2 = WindowManagerSpy.INSTANCE.getWindowManagerClass();
                if (windowManagerClass2 == null) {
                    return null;
                }
                Field declaredField = windowManagerClass2.getDeclaredField("mViews");
                declaredField.setAccessible(true);
                return declaredField;
            }
        });
        $stable = 8;
    }

    private WindowManagerSpy() {
    }

    private final Field getMViewsField() {
        return (Field) mViewsField.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Class<?> getWindowManagerClass() {
        return (Class) windowManagerClass.getValue();
    }

    private final Object getWindowManagerInstance() {
        return windowManagerInstance.getValue();
    }

    @SuppressLint({"PrivateApi", "ObsoleteSdkInt", "DiscouragedPrivateApi"})
    public final void swapWindowManagerGlobalMViews(@NotNull Function1<? super ArrayList<View>, ? extends ArrayList<View>> swap) {
        Field mViewsField2;
        Intrinsics.checkNotNullParameter(swap, "swap");
        try {
            Object windowManagerInstance2 = getWindowManagerInstance();
            if (windowManagerInstance2 == null || (mViewsField2 = INSTANCE.getMViewsField()) == null) {
                return;
            }
            Object obj = mViewsField2.get(windowManagerInstance2);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.util.ArrayList<android.view.View>{ kotlin.collections.TypeAliasesKt.ArrayList<android.view.View> }");
            mViewsField2.set(windowManagerInstance2, swap.invoke((ArrayList) obj));
        } catch (Throwable th2) {
            Log.w("WindowManagerSpy", th2);
        }
    }
}
