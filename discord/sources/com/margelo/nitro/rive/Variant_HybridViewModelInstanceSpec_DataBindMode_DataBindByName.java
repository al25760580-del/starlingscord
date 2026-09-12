package com.margelo.nitro.rive;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@xa.a
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/margelo/nitro/rive/Variant_HybridViewModelInstanceSpec_DataBindMode_DataBindByName;", "", "<init>", "()V", "First", "Second", "Third", "com/margelo/nitro/rive/a2", "Lcom/margelo/nitro/rive/Variant_HybridViewModelInstanceSpec_DataBindMode_DataBindByName$First;", "Lcom/margelo/nitro/rive/Variant_HybridViewModelInstanceSpec_DataBindMode_DataBindByName$Second;", "Lcom/margelo/nitro/rive/Variant_HybridViewModelInstanceSpec_DataBindMode_DataBindByName$Third;", "rive-app_react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class Variant_HybridViewModelInstanceSpec_DataBindMode_DataBindByName {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a2 f6906a = new a2();

    @xa.a
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/margelo/nitro/rive/Variant_HybridViewModelInstanceSpec_DataBindMode_DataBindByName$First;", "Lcom/margelo/nitro/rive/Variant_HybridViewModelInstanceSpec_DataBindMode_DataBindByName;", "Lcom/margelo/nitro/rive/HybridViewModelInstanceSpec;", "value", "Lcom/margelo/nitro/rive/HybridViewModelInstanceSpec;", "a", "()Lcom/margelo/nitro/rive/HybridViewModelInstanceSpec;", "rive-app_react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class First extends Variant_HybridViewModelInstanceSpec_DataBindMode_DataBindByName {

        @xa.a
        @NotNull
        private final HybridViewModelInstanceSpec value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public First(HybridViewModelInstanceSpec value) {
            super(0);
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final HybridViewModelInstanceSpec getValue() {
            return this.value;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof First) && Intrinsics.areEqual(this.value, ((First) obj).value);
        }

        public final int hashCode() {
            return this.value.hashCode();
        }

        public final String toString() {
            return "First(value=" + this.value + ")";
        }
    }

    @xa.a
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/margelo/nitro/rive/Variant_HybridViewModelInstanceSpec_DataBindMode_DataBindByName$Second;", "Lcom/margelo/nitro/rive/Variant_HybridViewModelInstanceSpec_DataBindMode_DataBindByName;", "Lcom/margelo/nitro/rive/DataBindMode;", "value", "Lcom/margelo/nitro/rive/DataBindMode;", "a", "()Lcom/margelo/nitro/rive/DataBindMode;", "rive-app_react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Second extends Variant_HybridViewModelInstanceSpec_DataBindMode_DataBindByName {

        @xa.a
        @NotNull
        private final DataBindMode value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Second(DataBindMode value) {
            super(0);
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final DataBindMode getValue() {
            return this.value;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Second) && this.value == ((Second) obj).value;
        }

        public final int hashCode() {
            return this.value.hashCode();
        }

        public final String toString() {
            return "Second(value=" + this.value + ")";
        }
    }

    @xa.a
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/margelo/nitro/rive/Variant_HybridViewModelInstanceSpec_DataBindMode_DataBindByName$Third;", "Lcom/margelo/nitro/rive/Variant_HybridViewModelInstanceSpec_DataBindMode_DataBindByName;", "Lcom/margelo/nitro/rive/DataBindByName;", "value", "Lcom/margelo/nitro/rive/DataBindByName;", "a", "()Lcom/margelo/nitro/rive/DataBindByName;", "rive-app_react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Third extends Variant_HybridViewModelInstanceSpec_DataBindMode_DataBindByName {

        @xa.a
        @NotNull
        private final DataBindByName value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Third(DataBindByName value) {
            super(0);
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final DataBindByName getValue() {
            return this.value;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Third) && Intrinsics.areEqual(this.value, ((Third) obj).value);
        }

        public final int hashCode() {
            return this.value.hashCode();
        }

        public final String toString() {
            return "Third(value=" + this.value + ")";
        }
    }

    public /* synthetic */ Variant_HybridViewModelInstanceSpec_DataBindMode_DataBindByName(int i7) {
        this();
    }

    @xa.a
    @NotNull
    public static final Variant_HybridViewModelInstanceSpec_DataBindMode_DataBindByName create(@NotNull DataBindByName dataBindByName) {
        return f6906a.create(dataBindByName);
    }

    private Variant_HybridViewModelInstanceSpec_DataBindMode_DataBindByName() {
    }

    @xa.a
    @NotNull
    public static final Variant_HybridViewModelInstanceSpec_DataBindMode_DataBindByName create(@NotNull DataBindMode dataBindMode) {
        return f6906a.create(dataBindMode);
    }

    @xa.a
    @NotNull
    public static final Variant_HybridViewModelInstanceSpec_DataBindMode_DataBindByName create(@NotNull HybridViewModelInstanceSpec hybridViewModelInstanceSpec) {
        return f6906a.create(hybridViewModelInstanceSpec);
    }
}
