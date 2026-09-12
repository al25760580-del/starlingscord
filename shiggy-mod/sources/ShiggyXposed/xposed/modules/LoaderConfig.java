package ShiggyXposed.xposed.modules;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: compiled from: UpdaterModule.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002!\"B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\fJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\tHÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J%\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0001¢\u0006\u0002\b R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006#"}, d2 = {"LShiggyXposed/xposed/modules/LoaderConfig;", "", "customLoadUrl", "LShiggyXposed/xposed/modules/CustomLoadUrl;", "disableInjection", "", "<init>", "(LShiggyXposed/xposed/modules/CustomLoadUrl;Z)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILShiggyXposed/xposed/modules/CustomLoadUrl;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getCustomLoadUrl", "()LShiggyXposed/xposed/modules/CustomLoadUrl;", "getDisableInjection", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$app_release", "$serializer", "Companion", "app_release"}, k = 1, mv = {2, 1, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@Serializable
public final /* data */ class LoaderConfig {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final CustomLoadUrl customLoadUrl;
    private final boolean disableInjection;

    /* JADX WARN: Multi-variable type inference failed */
    public LoaderConfig() {
        this((CustomLoadUrl) null, false, 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ LoaderConfig copy$default(LoaderConfig loaderConfig, CustomLoadUrl customLoadUrl, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            customLoadUrl = loaderConfig.customLoadUrl;
        }
        if ((i & 2) != 0) {
            z = loaderConfig.disableInjection;
        }
        return loaderConfig.copy(customLoadUrl, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CustomLoadUrl getCustomLoadUrl() {
        return this.customLoadUrl;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getDisableInjection() {
        return this.disableInjection;
    }

    public final LoaderConfig copy(CustomLoadUrl customLoadUrl, boolean disableInjection) {
        Intrinsics.checkNotNullParameter(customLoadUrl, "customLoadUrl");
        return new LoaderConfig(customLoadUrl, disableInjection);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoaderConfig)) {
            return false;
        }
        LoaderConfig loaderConfig = (LoaderConfig) other;
        return Intrinsics.areEqual(this.customLoadUrl, loaderConfig.customLoadUrl) && this.disableInjection == loaderConfig.disableInjection;
    }

    public int hashCode() {
        return (this.customLoadUrl.hashCode() * 31) + Boolean.hashCode(this.disableInjection);
    }

    public String toString() {
        return "LoaderConfig(customLoadUrl=" + this.customLoadUrl + ", disableInjection=" + this.disableInjection + ')';
    }

    /* JADX INFO: compiled from: UpdaterModule.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"LShiggyXposed/xposed/modules/LoaderConfig$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "LShiggyXposed/xposed/modules/LoaderConfig;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LoaderConfig> serializer() {
            return LoaderConfig$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LoaderConfig(int i, CustomLoadUrl customLoadUrl, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        this.customLoadUrl = (i & 1) == 0 ? new CustomLoadUrl(false, (String) null, 3, (DefaultConstructorMarker) null) : customLoadUrl;
        if ((i & 2) == 0) {
            this.disableInjection = false;
        } else {
            this.disableInjection = z;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$app_release(LoaderConfig self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !Intrinsics.areEqual(self.customLoadUrl, new CustomLoadUrl(false, (String) null, 3, (DefaultConstructorMarker) null))) {
            output.encodeSerializableElement(serialDesc, 0, CustomLoadUrl$$serializer.INSTANCE, self.customLoadUrl);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.disableInjection) {
            output.encodeBooleanElement(serialDesc, 1, self.disableInjection);
        }
    }

    public LoaderConfig(CustomLoadUrl customLoadUrl, boolean z) {
        Intrinsics.checkNotNullParameter(customLoadUrl, "customLoadUrl");
        this.customLoadUrl = customLoadUrl;
        this.disableInjection = z;
    }

    public /* synthetic */ LoaderConfig(CustomLoadUrl customLoadUrl, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new CustomLoadUrl(false, (String) null, 3, (DefaultConstructorMarker) null) : customLoadUrl, (i & 2) != 0 ? false : z);
    }

    public final CustomLoadUrl getCustomLoadUrl() {
        return this.customLoadUrl;
    }

    public final boolean getDisableInjection() {
        return this.disableInjection;
    }
}
