package app.rive;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rn.n;
import u.c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0003\u0015\u0016\u0017JE\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00020\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00010\u00002\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00000\u0004H\u0017¢\u0006\u0004\b\u0006\u0010\u0007JY\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00030\u0000\"\u0004\b\u0001\u0010\b\"\u0004\b\u0002\u0010\t\"\u0004\b\u0003\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00010\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJE\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000f0\u0000\"\u0004\b\u0001\u0010\b\"\u0004\b\u0002\u0010\t*\b\u0012\u0004\u0012\u00028\u00010\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00020\u0000H\u0016¢\u0006\u0004\b\r\u0010\u0010J1\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00120\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00000\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0001\u0003\u0018\u0019\u001a¨\u0006\u001b"}, d2 = {"Lapp/rive/Result;", "T", "", "R", "Lkotlin/Function1;", "onSuccess", "andThen", "(Lapp/rive/Result;Lkotlin/jvm/functions/Function3;Lu/c;I)Lapp/rive/Result;", "A", "B", "other", "Lkotlin/Function2;", "combine", "zip", "(Lapp/rive/Result;Lapp/rive/Result;Lkotlin/jvm/functions/Function2;)Lapp/rive/Result;", "Lkotlin/Pair;", "(Lapp/rive/Result;Lapp/rive/Result;)Lapp/rive/Result;", "", "", "sequence", "(Ljava/lang/Iterable;)Lapp/rive/Result;", "Error", "Loading", "Success", "Lapp/rive/Result$Error;", "Lapp/rive/Result$Loading;", "Lapp/rive/Result$Success;", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface Result<T> {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\t\u0010\b\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lapp/rive/Result$Error;", "Lapp/rive/Result;", "", "throwable", "", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements Result {
        public static final int $stable = 8;

        @NotNull
        private final Throwable throwable;

        public Error(@NotNull Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.throwable = throwable;
        }

        public static /* synthetic */ Error copy$default(Error error, Throwable th2, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                th2 = error.throwable;
            }
            return error.copy(th2);
        }

        @Override // app.rive.Result
        @NotNull
        public <T, R> Result<R> andThen(@NotNull Result<? extends T> result, @NotNull Function3 function3, c cVar, int i7) {
            return DefaultImpls.andThen(this, result, function3, cVar, i7);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Throwable getThrowable() {
            return this.throwable;
        }

        @NotNull
        public final Error copy(@NotNull Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            return new Error(throwable);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.areEqual(this.throwable, ((Error) other).throwable);
        }

        @NotNull
        public final Throwable getThrowable() {
            return this.throwable;
        }

        public int hashCode() {
            return this.throwable.hashCode();
        }

        @Override // app.rive.Result
        @NotNull
        public <T> Result<List<T>> sequence(@NotNull Iterable<? extends Result<? extends T>> iterable) {
            return DefaultImpls.sequence(this, iterable);
        }

        @NotNull
        public String toString() {
            return "Error(throwable=" + this.throwable + ")";
        }

        @Override // app.rive.Result
        @NotNull
        public <A, B> Result<Pair<A, B>> zip(@NotNull Result<? extends A> result, @NotNull Result<? extends B> result2) {
            return DefaultImpls.zip(this, result, result2);
        }

        @Override // app.rive.Result
        @NotNull
        public <A, B, R> Result<R> zip(@NotNull Result<? extends A> result, @NotNull Result<? extends B> result2, @NotNull Function2<? super A, ? super B, ? extends R> function2) {
            return DefaultImpls.zip(this, result, result2, function2);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lapp/rive/Result$Loading;", "Lapp/rive/Result;", "", "()V", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading implements Result {
        public static final int $stable = 0;

        @NotNull
        public static final Loading INSTANCE = new Loading();

        private Loading() {
        }

        @Override // app.rive.Result
        @NotNull
        public <T, R> Result<R> andThen(@NotNull Result<? extends T> result, @NotNull Function3 function3, c cVar, int i7) {
            return DefaultImpls.andThen(this, result, function3, cVar, i7);
        }

        @Override // app.rive.Result
        @NotNull
        public <T> Result<List<T>> sequence(@NotNull Iterable<? extends Result<? extends T>> iterable) {
            return DefaultImpls.sequence(this, iterable);
        }

        @Override // app.rive.Result
        @NotNull
        public <A, B> Result<Pair<A, B>> zip(@NotNull Result<? extends A> result, @NotNull Result<? extends B> result2) {
            return DefaultImpls.zip(this, result, result2);
        }

        @Override // app.rive.Result
        @NotNull
        public <A, B, R> Result<R> zip(@NotNull Result<? extends A> result, @NotNull Result<? extends B> result2, @NotNull Function2<? super A, ? super B, ? extends R> function2) {
            return DefaultImpls.zip(this, result, result2, function2);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\u00028\u0001HÆ\u0003¢\u0006\u0002\u0010\u0006J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u0001HÆ\u0001¢\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0013\u0010\u0003\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0013"}, d2 = {"Lapp/rive/Result$Success;", "T", "Lapp/rive/Result;", "value", "(Ljava/lang/Object;)V", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lapp/rive/Result$Success;", "equals", "", "other", "", "hashCode", "", "toString", "", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Success<T> implements Result<T> {
        public static final int $stable = 0;
        private final T value;

        public Success(T t5) {
            this.value = t5;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Success copy$default(Success success, Object obj, int i7, Object obj2) {
            if ((i7 & 1) != 0) {
                obj = success.value;
            }
            return success.copy(obj);
        }

        @Override // app.rive.Result
        @NotNull
        public <T, R> Result<R> andThen(@NotNull Result<? extends T> result, @NotNull Function3 function3, c cVar, int i7) {
            return DefaultImpls.andThen(this, result, function3, cVar, i7);
        }

        public final T component1() {
            return this.value;
        }

        @NotNull
        public final Success<T> copy(T value) {
            return new Success<>(value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && Intrinsics.areEqual(this.value, ((Success) other).value);
        }

        public final T getValue() {
            return this.value;
        }

        public int hashCode() {
            T t5 = this.value;
            if (t5 == null) {
                return 0;
            }
            return t5.hashCode();
        }

        @Override // app.rive.Result
        @NotNull
        public <T> Result<List<T>> sequence(@NotNull Iterable<? extends Result<? extends T>> iterable) {
            return DefaultImpls.sequence(this, iterable);
        }

        @NotNull
        public String toString() {
            return "Success(value=" + this.value + ")";
        }

        @Override // app.rive.Result
        @NotNull
        public <A, B> Result<Pair<A, B>> zip(@NotNull Result<? extends A> result, @NotNull Result<? extends B> result2) {
            return DefaultImpls.zip(this, result, result2);
        }

        @Override // app.rive.Result
        @NotNull
        public <A, B, R> Result<R> zip(@NotNull Result<? extends A> result, @NotNull Result<? extends B> result2, @NotNull Function2<? super A, ? super B, ? extends R> function2) {
            return DefaultImpls.zip(this, result, result2, function2);
        }
    }

    @NotNull
    <T, R> Result<R> andThen(@NotNull Result<? extends T> result, @NotNull Function3 function3, c cVar, int i7);

    @NotNull
    <T> Result<List<T>> sequence(@NotNull Iterable<? extends Result<? extends T>> iterable);

    @NotNull
    <A, B> Result<Pair<A, B>> zip(@NotNull Result<? extends A> result, @NotNull Result<? extends B> result2);

    @NotNull
    <A, B, R> Result<R> zip(@NotNull Result<? extends A> result, @NotNull Result<? extends B> result2, @NotNull Function2<? super A, ? super B, ? extends R> function2);

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        @NotNull
        public static <T_I1, T, R> Result<R> andThen(@NotNull Result<? extends T_I1> result, @NotNull Result<? extends T> receiver, @NotNull Function3 onSuccess, c cVar, int i7) {
            Result<R> error;
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
            cVar.d();
            if (receiver instanceof Loading) {
                error = Loading.INSTANCE;
            } else if (receiver instanceof Error) {
                error = new Error(((Error) receiver).getThrowable());
            } else {
                if (!(receiver instanceof Success)) {
                    throw new n();
                }
                error = (Result) onSuccess.invoke(((Success) receiver).getValue(), cVar, Integer.valueOf(i7 & 112));
            }
            cVar.k();
            return error;
        }

        @NotNull
        public static <T_I1, T> Result<List<T>> sequence(@NotNull Result<? extends T_I1> result, @NotNull Iterable<? extends Result<? extends T>> receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            ArrayList arrayList = new ArrayList();
            for (Result<? extends T> result2 : receiver) {
                if (result2 instanceof Error) {
                    return new Error(((Error) result2).getThrowable());
                }
                if (result2 instanceof Loading) {
                    return Loading.INSTANCE;
                }
                if (result2 instanceof Success) {
                    arrayList.add(((Success) result2).getValue());
                }
            }
            return new Success(arrayList);
        }

        @NotNull
        public static <T, A, B, R> Result<R> zip(@NotNull Result<? extends T> result, @NotNull Result<? extends A> receiver, @NotNull Result<? extends B> other, @NotNull Function2<? super A, ? super B, ? extends R> combine) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            Intrinsics.checkNotNullParameter(other, "other");
            Intrinsics.checkNotNullParameter(combine, "combine");
            if (receiver instanceof Loading) {
                return Loading.INSTANCE;
            }
            if (receiver instanceof Error) {
                return new Error(((Error) receiver).getThrowable());
            }
            if (!(receiver instanceof Success)) {
                throw new n();
            }
            if (other instanceof Loading) {
                return Loading.INSTANCE;
            }
            if (other instanceof Error) {
                return new Error(((Error) other).getThrowable());
            }
            if (other instanceof Success) {
                return new Success(combine.invoke(((Success) receiver).getValue(), ((Success) other).getValue()));
            }
            throw new n();
        }

        @NotNull
        public static <T, A, B> Result<Pair<A, B>> zip(@NotNull Result<? extends T> result, @NotNull Result<? extends A> receiver, @NotNull Result<? extends B> other) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            Intrinsics.checkNotNullParameter(other, "other");
            return (Result<Pair<A, B>>) receiver.zip(receiver, other, new Function2<A, B, Pair<? extends A, ? extends B>>() { // from class: app.rive.Result.zip.1
                @Override // kotlin.jvm.functions.Function2
                @NotNull
                public final Pair<A, B> invoke(A a10, B b10) {
                    return new Pair<>(a10, b10);
                }
            });
        }
    }
}
