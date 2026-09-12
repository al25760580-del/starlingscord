package app.rive.runtime.kotlin.core;

import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import s0.g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H\u0082 J\r\u0010\b\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\tJ\b\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Lapp/rive/runtime/kotlin/core/SMITrigger;", "Lapp/rive/runtime/kotlin/core/SMIInput;", "unsafeCppPointer", "", "(J)V", "cppFire", "", "cppPointer", "fire", "fire$kotlin_release", "toString", "", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SMITrigger extends SMIInput {
    public static final int $stable = 0;

    public SMITrigger(long j) {
        super(j);
    }

    private final native void cppFire(long cppPointer);

    public final void fire$kotlin_release() {
        cppFire(getCppPointer());
    }

    @Override // app.rive.runtime.kotlin.core.SMIInput
    @NotNull
    public String toString() {
        return g.e("SMITrigger ", getName(), ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
    }
}
