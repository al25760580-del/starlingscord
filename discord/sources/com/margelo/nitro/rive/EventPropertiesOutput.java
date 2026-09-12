package com.margelo.nitro.rive;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@xa.a
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/margelo/nitro/rive/EventPropertiesOutput;", "", "<init>", "()V", "First", "Second", "Third", "com/margelo/nitro/rive/r", "Lcom/margelo/nitro/rive/EventPropertiesOutput$First;", "Lcom/margelo/nitro/rive/EventPropertiesOutput$Second;", "Lcom/margelo/nitro/rive/EventPropertiesOutput$Third;", "rive-app_react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class EventPropertiesOutput {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f6905a = new r();

    @xa.a
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/margelo/nitro/rive/EventPropertiesOutput$First;", "Lcom/margelo/nitro/rive/EventPropertiesOutput;", "", "value", "Z", "getValue", "()Z", "rive-app_react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class First extends EventPropertiesOutput {

        @xa.a
        private final boolean value;

        public First(boolean z5) {
            super(0);
            this.value = z5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof First) && this.value == ((First) obj).value;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.value);
        }

        public final String toString() {
            return "First(value=" + this.value + ")";
        }
    }

    @xa.a
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/margelo/nitro/rive/EventPropertiesOutput$Second;", "Lcom/margelo/nitro/rive/EventPropertiesOutput;", "", "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "rive-app_react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Second extends EventPropertiesOutput {

        @xa.a
        @NotNull
        private final String value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Second(String value) {
            super(0);
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Second) && Intrinsics.areEqual(this.value, ((Second) obj).value);
        }

        public final int hashCode() {
            return this.value.hashCode();
        }

        public final String toString() {
            return s0.g.e("Second(value=", this.value, ")");
        }
    }

    @xa.a
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/margelo/nitro/rive/EventPropertiesOutput$Third;", "Lcom/margelo/nitro/rive/EventPropertiesOutput;", "", "value", "D", "getValue", "()D", "rive-app_react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Third extends EventPropertiesOutput {

        @xa.a
        private final double value;

        public Third(double d6) {
            super(0);
            this.value = d6;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Third) && Double.compare(this.value, ((Third) obj).value) == 0;
        }

        public final int hashCode() {
            return Double.hashCode(this.value);
        }

        public final String toString() {
            return "Third(value=" + this.value + ")";
        }
    }

    public /* synthetic */ EventPropertiesOutput(int i7) {
        this();
    }

    @xa.a
    @NotNull
    public static final EventPropertiesOutput create(double d6) {
        return f6905a.create(d6);
    }

    private EventPropertiesOutput() {
    }

    @xa.a
    @NotNull
    public static final EventPropertiesOutput create(@NotNull String str) {
        return f6905a.create(str);
    }

    @xa.a
    @NotNull
    public static final EventPropertiesOutput create(boolean z5) {
        return f6905a.create(z5);
    }
}
