package app.rive.runtime.kotlin.core;

import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import s0.g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0019\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0006H\u0082 J\u0011\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0003H\u0082 J\b\u0010\u0010\u001a\u00020\u0011H\u0016R$\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@@X\u0086\u000e¢\u0006\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0012"}, d2 = {"Lapp/rive/runtime/kotlin/core/SMIBoolean;", "Lapp/rive/runtime/kotlin/core/SMIInput;", "unsafeCppPointer", "", "(J)V", "value", "", "getValue", "()Z", "setValue$kotlin_release", "(Z)V", "cppSetValue", "", "cppPointer", "newValue", "cppValue", "toString", "", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SMIBoolean extends SMIInput {
    public static final int $stable = 0;

    public SMIBoolean(long j) {
        super(j);
    }

    private final native void cppSetValue(long cppPointer, boolean newValue);

    private final native boolean cppValue(long cppPointer);

    public final boolean getValue() {
        return cppValue(getCppPointer());
    }

    public final void setValue$kotlin_release(boolean z5) {
        cppSetValue(getCppPointer(), z5);
    }

    @Override // app.rive.runtime.kotlin.core.SMIInput
    @NotNull
    public String toString() {
        return g.e("SMIBoolean ", getName(), ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
    }
}
