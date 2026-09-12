package kotlin.jvm.internal;

import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\u0004*\u00028\u0000H$¢\u0006\u0002\u0010\bJ\u0013\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00028\u0000¢\u0006\u0002\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0004H\u0004J\u001d\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00028\u0000H\u0004¢\u0006\u0002\u0010\u0019R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\u0004X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\u0006R\u001e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000eX\u0082\u0004¢\u0006\n\n\u0002\u0010\u0011\u0012\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Lkotlin/jvm/internal/PrimitiveSpreadBuilder;", "T", "", "size", "", "<init>", "(I)V", "getSize", "(Ljava/lang/Object;)I", ViewProps.POSITION, "getPosition", "()I", "setPosition", "spreads", "", "getSpreads$annotations", "()V", "[Ljava/lang/Object;", "addSpread", "", "spreadArgument", "(Ljava/lang/Object;)V", "toArray", "values", "result", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class PrimitiveSpreadBuilder<T> {
    private int position;
    private final int size;

    @NotNull
    private final T[] spreads;

    public PrimitiveSpreadBuilder(int i7) {
        this.size = i7;
        this.spreads = (T[]) new Object[i7];
    }

    private static /* synthetic */ void getSpreads$annotations() {
    }

    public final void addSpread(@NotNull T spreadArgument) {
        Intrinsics.checkNotNullParameter(spreadArgument, "spreadArgument");
        T[] tArr = this.spreads;
        int i7 = this.position;
        this.position = i7 + 1;
        tArr[i7] = spreadArgument;
    }

    public final int getPosition() {
        return this.position;
    }

    public abstract int getSize(@NotNull T t5);

    public final void setPosition(int i7) {
        this.position = i7;
    }

    public final int size() {
        int i7 = this.size - 1;
        int size = 0;
        if (i7 >= 0) {
            int i10 = 0;
            while (true) {
                T t5 = this.spreads[i10];
                size += t5 != null ? getSize(t5) : 1;
                if (i10 == i7) {
                    break;
                }
                i10++;
            }
        }
        return size;
    }

    @NotNull
    public final T toArray(@NotNull T values, @NotNull T result) {
        int i7;
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(result, "result");
        int i10 = this.size - 1;
        int i11 = 0;
        if (i10 >= 0) {
            int i12 = 0;
            int i13 = 0;
            i7 = 0;
            while (true) {
                T t5 = this.spreads[i12];
                if (t5 != null) {
                    if (i13 < i12) {
                        int i14 = i12 - i13;
                        System.arraycopy(values, i13, result, i7, i14);
                        i7 += i14;
                    }
                    int size = getSize(t5);
                    System.arraycopy(t5, 0, result, i7, size);
                    i7 += size;
                    i13 = i12 + 1;
                }
                if (i12 == i10) {
                    break;
                }
                i12++;
            }
            i11 = i13;
        } else {
            i7 = 0;
        }
        int i15 = this.size;
        if (i11 < i15) {
            System.arraycopy(values, i11, result, i7, i15 - i11);
        }
        return result;
    }
}
