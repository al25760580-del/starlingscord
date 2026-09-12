package app.rive.runtime.kotlin.core;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import rn.n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH\u0002R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lapp/rive/runtime/kotlin/core/RiveEventReport;", "Lapp/rive/runtime/kotlin/core/NativeObject;", "unsafeCppPointer", "", "secondsDelay", "", "(JF)V", "event", "Lapp/rive/runtime/kotlin/core/RiveEvent;", "getEvent", "()Lapp/rive/runtime/kotlin/core/RiveEvent;", "getUnsafeCppPointer", "()J", "convertEvent", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RiveEventReport extends NativeObject {
    public static final int $stable = 0;

    @NotNull
    private final RiveEvent event;
    private final long unsafeCppPointer;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EventType.values().length];
            try {
                iArr[EventType.OpenURLEvent.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EventType.GeneralEvent.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public RiveEventReport(long j, float f2) {
        super(j);
        this.unsafeCppPointer = j;
        this.event = convertEvent(new RiveEvent(j, f2));
    }

    private final RiveEvent convertEvent(RiveEvent event) {
        int i7 = WhenMappings.$EnumSwitchMapping$0[event.getType().ordinal()];
        if (i7 == 1) {
            return new RiveOpenURLEvent(event.getCppPointer(), event.getDelay());
        }
        if (i7 == 2) {
            return new RiveGeneralEvent(event.getCppPointer(), event.getDelay());
        }
        throw new n();
    }

    @NotNull
    public final RiveEvent getEvent() {
        return this.event;
    }

    public final long getUnsafeCppPointer() {
        return this.unsafeCppPointer;
    }
}
