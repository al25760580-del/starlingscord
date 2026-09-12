package app.rive.runtime.kotlin.core;

import com.facebook.react.devsupport.StackTraceHelper;
import java.util.HashMap;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\t\b\u0017\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J-\u0010\u001d\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bj\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n`\u000b2\u0006\u0010\u001e\u001a\u00020\u0003H\u0082 J\u0011\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u0003H\u0082 J-\u0010 \u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bj\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n`\u000b2\u0006\u0010\u001e\u001a\u00020\u0003H\u0082 J\u0011\u0010!\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u0003H\u0082 J\b\u0010\"\u001a\u00020\tH\u0016R-\u0010\u0007\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bj\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n`\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R-\u0010\u0013\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bj\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n`\u000b8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\rR\u0011\u0010\u0015\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006#"}, d2 = {"Lapp/rive/runtime/kotlin/core/RiveEvent;", "Lapp/rive/runtime/kotlin/core/NativeObject;", "unsafeCppPointer", "", "delay", "", "(JF)V", "data", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "getData", "()Ljava/util/HashMap;", "getDelay", "()F", StackTraceHelper.NAME_KEY, "getName", "()Ljava/lang/String;", "properties", "getProperties", "type", "Lapp/rive/runtime/kotlin/core/EventType;", "getType", "()Lapp/rive/runtime/kotlin/core/EventType;", "typeCode", "", "getTypeCode", "()S", "cppData", "cppPointer", "cppName", "cppProperties", "cppType", "toString", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class RiveEvent extends NativeObject {
    public static final int $stable = 0;
    private final float delay;

    public RiveEvent(long j, float f2) {
        super(j);
        this.delay = f2;
    }

    private final native HashMap<String, Object> cppData(long cppPointer);

    private final native String cppName(long cppPointer);

    private final native HashMap<String, Object> cppProperties(long cppPointer);

    private final native short cppType(long cppPointer);

    private final short getTypeCode() {
        return cppType(getCppPointer());
    }

    @NotNull
    public final HashMap<String, Object> getData() {
        return cppData(getCppPointer());
    }

    public final float getDelay() {
        return this.delay;
    }

    @NotNull
    public final String getName() {
        return cppName(getCppPointer());
    }

    @NotNull
    public final HashMap<String, Object> getProperties() {
        return cppProperties(getCppPointer());
    }

    @NotNull
    public final EventType getType() {
        EventType eventTypeFromInt = EventType.INSTANCE.fromInt(getTypeCode());
        return eventTypeFromInt == null ? EventType.GeneralEvent : eventTypeFromInt;
    }

    @NotNull
    public String toString() {
        return "RiveEvent " + getData();
    }
}
