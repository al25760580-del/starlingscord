package androidx.lifecycle;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class Lifecycle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ga.l f2294a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class State {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final State f2295d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final State f2296e;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final State f2297i;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final State f2298v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final State f2299w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final /* synthetic */ State[] f2300x;

        static {
            State state = new State("DESTROYED", 0);
            f2295d = state;
            State state2 = new State("INITIALIZED", 1);
            f2296e = state2;
            State state3 = new State("CREATED", 2);
            f2297i = state3;
            State state4 = new State("STARTED", 3);
            f2298v = state4;
            State state5 = new State("RESUMED", 4);
            f2299w = state5;
            State[] stateArr = {state, state2, state3, state4, state5};
            f2300x = stateArr;
            com.facebook.imagepipeline.nativecode.b.l(stateArr);
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) f2300x.clone();
        }

        public final boolean a(State state) {
            Intrinsics.checkNotNullParameter(state, "state");
            return compareTo(state) >= 0;
        }
    }

    public abstract void a(u uVar);

    public abstract State b();

    public abstract void c(u uVar);
}
