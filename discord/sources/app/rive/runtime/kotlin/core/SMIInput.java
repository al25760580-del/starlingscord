package app.rive.runtime.kotlin.core;

import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import s0.g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0003H\u0082 J\u0011\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0003H\u0082 J\u0011\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0003H\u0082 J\u0011\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0003H\u0082 J\b\u0010\u0013\u001a\u00020\u000bH\u0016R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0007R\u0011\u0010\b\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0007R\u0011\u0010\t\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0014"}, d2 = {"Lapp/rive/runtime/kotlin/core/SMIInput;", "Lapp/rive/runtime/kotlin/core/NativeObject;", "unsafeCppPointer", "", "(J)V", "isBoolean", "", "()Z", "isNumber", "isTrigger", StackTraceHelper.NAME_KEY, "", "getName", "()Ljava/lang/String;", "cppIsBoolean", "cppPointer", "cppIsNumber", "cppIsTrigger", "cppName", "toString", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class SMIInput extends NativeObject {
    public static final int $stable = 0;

    public SMIInput(long j) {
        super(j);
    }

    private final native boolean cppIsBoolean(long cppPointer);

    private final native boolean cppIsNumber(long cppPointer);

    private final native boolean cppIsTrigger(long cppPointer);

    private final native String cppName(long cppPointer);

    @NotNull
    public final String getName() {
        return cppName(getCppPointer());
    }

    public final boolean isBoolean() {
        return cppIsBoolean(getCppPointer());
    }

    public final boolean isNumber() {
        return cppIsNumber(getCppPointer());
    }

    public final boolean isTrigger() {
        return cppIsTrigger(getCppPointer());
    }

    @NotNull
    public String toString() {
        return g.e("SMIInput ", getName(), ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
    }
}
