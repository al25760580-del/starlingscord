package app.rive.runtime.kotlin.core;

import com.facebook.react.devsupport.StackTraceHelper;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import rn.d;
import rn.n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0012\u00102\u001a\u0004\u0018\u00010\u001e2\u0006\u00103\u001a\u00020\bH\u0007J\u000e\u00104\u001a\u0002052\u0006\u00103\u001a\u00020\bJ\u0006\u00106\u001a\u000207J\u000e\u00106\u001a\u0002082\u0006\u00109\u001a\u00020\bJ\u001b\u0010:\u001a\u0004\u0018\u00010\u001e2\u0006\u0010;\u001a\u00020\u00042\u0006\u00103\u001a\u00020\bH\u0082 J\u0019\u0010<\u001a\u0002052\u0006\u0010;\u001a\u00020\u00042\u0006\u00103\u001a\u00020\bH\u0082 J\u0019\u0010=\u001a\u0002072\u0006\u0010;\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0082 J\u0011\u0010>\u001a\u0002072\u0006\u0010;\u001a\u00020\u0004H\u0096 J\u0011\u0010?\u001a\u00020\u00112\u0006\u0010@\u001a\u00020\u0004H\u0082 J\u0011\u0010A\u001a\u00020\u00112\u0006\u0010@\u001a\u00020\u0004H\u0082 J\u0011\u0010B\u001a\u00020\u00112\u0006\u0010;\u001a\u00020\u0004H\u0082 J\u0011\u0010C\u001a\u00020\u00112\u0006\u0010@\u001a\u00020\u0004H\u0082 J\u0011\u0010D\u001a\u00020\b2\u0006\u0010;\u001a\u00020\u0004H\u0082 J\u0011\u0010E\u001a\u00020'2\u0006\u0010@\u001a\u00020\u0004H\u0082 J\u0019\u0010F\u001a\u0002072\u0006\u0010;\u001a\u00020\u00042\u0006\u0010G\u001a\u00020\u0011H\u0082 J\u0019\u0010H\u001a\u0002072\u0006\u0010@\u001a\u00020\u00042\u0006\u0010I\u001a\u00020\u0011H\u0082 J\u0019\u0010J\u001a\u0002072\u0006\u0010;\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\bH\u0082 J\u0011\u0010K\u001a\u00020\u00112\u0006\u0010@\u001a\u00020\u0004H\u0082 J\u0011\u0010L\u001a\u00020\u00112\u0006\u0010@\u001a\u00020\u0004H\u0082 J\u000e\u0010,\u001a\u0002072\u0006\u0010,\u001a\u00020\bR$\u0010\n\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\u001b\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0013R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0018\"\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0011\u0010*\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b+\u0010\u0018R\u0011\u0010,\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b-\u0010\u0018R\u0011\u0010.\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b/\u0010\u0013R\u0011\u00100\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b1\u0010\u0013¨\u0006M"}, d2 = {"Lapp/rive/runtime/kotlin/core/LinearAnimationInstance;", "Lapp/rive/runtime/kotlin/core/PlayableInstance;", "Lapp/rive/runtime/kotlin/core/NativeObject;", "unsafeCppPointer", "", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "mix", "", "(JLjava/util/concurrent/locks/ReentrantLock;F)V", "direction", "Lapp/rive/runtime/kotlin/core/Direction;", "getDirection", "()Lapp/rive/runtime/kotlin/core/Direction;", "setDirection", "(Lapp/rive/runtime/kotlin/core/Direction;)V", "duration", "", "getDuration", "()I", "effectiveDuration", "getEffectiveDuration", "effectiveDurationInSeconds", "getEffectiveDurationInSeconds", "()F", "endTime", "getEndTime", "fps", "getFps", "loop", "Lapp/rive/runtime/kotlin/core/Loop;", "getLoop", "()Lapp/rive/runtime/kotlin/core/Loop;", "setLoop", "(Lapp/rive/runtime/kotlin/core/Loop;)V", "getMix", "setMix", "(F)V", StackTraceHelper.NAME_KEY, "", "getName", "()Ljava/lang/String;", "startTime", "getStartTime", "time", "getTime", "workEnd", "getWorkEnd", "workStart", "getWorkStart", "advance", "elapsedTime", "advanceAndGetResult", "Lapp/rive/runtime/kotlin/core/AdvanceResult;", "apply", "", "", "elapsed", "cppAdvance", "pointer", "cppAdvanceAndGetResult", "cppApply", "cppDelete", "cppDuration", "cppPointer", "cppFps", "cppGetDirection", "cppGetLoop", "cppGetTime", "cppName", "cppSetDirection", "int", "cppSetLoop", "value", "cppSetTime", "cppWorkEnd", "cppWorkStart", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLinearAnimationInstance.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinearAnimationInstance.kt\napp/rive/runtime/kotlin/core/LinearAnimationInstance\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,185:1\n1#2:186\n*E\n"})
public final class LinearAnimationInstance extends NativeObject implements PlayableInstance {
    public static final int $stable = 8;

    @NotNull
    private final ReentrantLock lock;
    private float mix;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AdvanceResult.values().length];
            try {
                iArr[AdvanceResult.ADVANCED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdvanceResult.LOOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AdvanceResult.PINGPONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AdvanceResult.ONESHOT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AdvanceResult.NONE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ LinearAnimationInstance(long j, ReentrantLock reentrantLock, float f2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, reentrantLock, (i7 & 4) != 0 ? 1.0f : f2);
    }

    private final native Loop cppAdvance(long pointer, float elapsedTime);

    private final native AdvanceResult cppAdvanceAndGetResult(long pointer, float elapsedTime);

    private final native void cppApply(long pointer, float mix);

    private final native int cppDuration(long cppPointer);

    private final native int cppFps(long cppPointer);

    private final native int cppGetDirection(long pointer);

    private final native int cppGetLoop(long cppPointer);

    private final native float cppGetTime(long pointer);

    private final native String cppName(long cppPointer);

    private final native void cppSetDirection(long pointer, int i7);

    private final native void cppSetLoop(long cppPointer, int value);

    private final native void cppSetTime(long pointer, float time);

    private final native int cppWorkEnd(long cppPointer);

    private final native int cppWorkStart(long cppPointer);

    @d
    public final Loop advance(float elapsedTime) {
        Loop loopCppAdvance;
        synchronized (this.lock) {
            loopCppAdvance = cppAdvance(getCppPointer(), elapsedTime);
        }
        return loopCppAdvance;
    }

    @NotNull
    public final AdvanceResult advanceAndGetResult(float elapsedTime) {
        AdvanceResult advanceResultCppAdvanceAndGetResult;
        synchronized (this.lock) {
            advanceResultCppAdvanceAndGetResult = cppAdvanceAndGetResult(getCppPointer(), elapsedTime);
        }
        return advanceResultCppAdvanceAndGetResult;
    }

    public final void apply() {
        synchronized (this.lock) {
            cppApply(getCppPointer(), this.mix);
            Unit unit = Unit.f14616a;
        }
    }

    @Override // app.rive.runtime.kotlin.core.NativeObject
    public native void cppDelete(long pointer);

    @NotNull
    public final Direction getDirection() {
        Direction directionFromInt = Direction.INSTANCE.fromInt(cppGetDirection(getCppPointer()));
        if (directionFromInt != null) {
            return directionFromInt;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final int getDuration() {
        return cppDuration(getCppPointer());
    }

    public final int getEffectiveDuration() {
        return getWorkStart() == -1 ? getDuration() : getWorkEnd() - getWorkStart();
    }

    public final float getEffectiveDurationInSeconds() {
        return getEffectiveDuration() / getFps();
    }

    public final float getEndTime() {
        float workEnd;
        int fps;
        if (getWorkEnd() == -1) {
            workEnd = getDuration();
            fps = getFps();
        } else {
            workEnd = getWorkEnd();
            fps = getFps();
        }
        return workEnd / fps;
    }

    public final int getFps() {
        return cppFps(getCppPointer());
    }

    @NotNull
    public final Loop getLoop() {
        return Loop.INSTANCE.fromIndex(cppGetLoop(getCppPointer()));
    }

    public final float getMix() {
        return this.mix;
    }

    @Override // app.rive.runtime.kotlin.core.PlayableInstance
    @NotNull
    public String getName() {
        return cppName(getCppPointer());
    }

    public final float getStartTime() {
        if (getWorkStart() == -1) {
            return 0.0f;
        }
        return getWorkStart() / getFps();
    }

    public final float getTime() {
        return cppGetTime(getCppPointer());
    }

    public final int getWorkEnd() {
        return cppWorkEnd(getCppPointer());
    }

    public final int getWorkStart() {
        return cppWorkStart(getCppPointer());
    }

    public final void setDirection(@NotNull Direction direction) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        synchronized (this.lock) {
            cppSetDirection(getCppPointer(), direction.getValue());
            Unit unit = Unit.f14616a;
        }
    }

    public final void setLoop(@NotNull Loop loop) {
        Intrinsics.checkNotNullParameter(loop, "loop");
        synchronized (this.lock) {
            cppSetLoop(getCppPointer(), loop.ordinal());
            Unit unit = Unit.f14616a;
        }
    }

    public final void setMix(float f2) {
        this.mix = f2;
    }

    public final void time(float time) {
        synchronized (this.lock) {
            cppSetTime(getCppPointer(), time);
            Unit unit = Unit.f14616a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinearAnimationInstance(long j, @NotNull ReentrantLock lock, float f2) {
        super(j);
        Intrinsics.checkNotNullParameter(lock, "lock");
        this.lock = lock;
        this.mix = f2;
    }

    public final boolean apply(float elapsed) {
        synchronized (this.lock) {
            cppApply(getCppPointer(), this.mix);
            Unit unit = Unit.f14616a;
        }
        int i7 = WhenMappings.$EnumSwitchMapping$0[advanceAndGetResult(elapsed).ordinal()];
        if (i7 == 1 || i7 == 2 || i7 == 3) {
            return true;
        }
        if (i7 == 4 || i7 == 5) {
            return false;
        }
        throw new n();
    }
}
