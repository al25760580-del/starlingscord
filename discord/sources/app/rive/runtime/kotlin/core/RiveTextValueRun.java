package app.rive.runtime.kotlin.core;

import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import s0.g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0019\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0082 J\u0011\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0003H\u0082 J\b\u0010\u0010\u001a\u00020\u0006H\u0016R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0011"}, d2 = {"Lapp/rive/runtime/kotlin/core/RiveTextValueRun;", "Lapp/rive/runtime/kotlin/core/NativeObject;", "unsafeCppPointer", "", "(J)V", StackTraceHelper.NAME_KEY, "", "text", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "cppSetText", "", "cppPointer", "cppText", "toString", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class RiveTextValueRun extends NativeObject {
    public static final int $stable = 0;

    public RiveTextValueRun(long j) {
        super(j);
    }

    private final native void cppSetText(long cppPointer, String name);

    private final native String cppText(long cppPointer);

    @NotNull
    public final String getText() {
        return cppText(getCppPointer());
    }

    public final void setText(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        cppSetText(getCppPointer(), name);
    }

    @NotNull
    public String toString() {
        return g.e("TextValueRun: ", getText(), ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
    }
}
