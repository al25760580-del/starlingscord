package app.rive.runtime.kotlin;

import app.rive.runtime.kotlin.core.File;
import com.facebook.react.devsupport.StackTraceHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import s0.g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00032\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lapp/rive/runtime/kotlin/ResourceType;", "", "()V", "Companion", "ResourceBytes", "ResourceId", "ResourceRiveFile", "ResourceUrl", "Lapp/rive/runtime/kotlin/ResourceType$ResourceBytes;", "Lapp/rive/runtime/kotlin/ResourceType$ResourceId;", "Lapp/rive/runtime/kotlin/ResourceType$ResourceRiveFile;", "Lapp/rive/runtime/kotlin/ResourceType$ResourceUrl;", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class ResourceType {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001¨\u0006\u0006"}, d2 = {"Lapp/rive/runtime/kotlin/ResourceType$Companion;", "", "()V", "makeMaybeResource", "Lapp/rive/runtime/kotlin/ResourceType;", "value", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ResourceType makeMaybeResource(Object value) {
            if (value == null) {
                return null;
            }
            if (value instanceof Integer) {
                return new ResourceId(((Number) value).intValue());
            }
            if (value instanceof String) {
                return new ResourceUrl((String) value);
            }
            if (value instanceof byte[]) {
                return new ResourceBytes((byte[]) value);
            }
            if (value instanceof File) {
                return new ResourceRiveFile((File) value);
            }
            throw new IllegalArgumentException(g.e("Incompatible type ", value.getClass().getSimpleName(), "."));
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lapp/rive/runtime/kotlin/ResourceType$ResourceBytes;", "Lapp/rive/runtime/kotlin/ResourceType;", "bytes", "", "([B)V", "getBytes", "()[B", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ResourceBytes extends ResourceType {
        public static final int $stable = 8;

        @NotNull
        private final byte[] bytes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResourceBytes(@NotNull byte[] bytes) {
            super(null);
            Intrinsics.checkNotNullParameter(bytes, "bytes");
            this.bytes = bytes;
        }

        @NotNull
        public final byte[] getBytes() {
            return this.bytes;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lapp/rive/runtime/kotlin/ResourceType$ResourceId;", "Lapp/rive/runtime/kotlin/ResourceType;", StackTraceHelper.ID_KEY, "", "(I)V", "getId", "()I", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ResourceId extends ResourceType {
        public static final int $stable = 0;
        private final int id;

        public ResourceId(int i7) {
            super(null);
            this.id = i7;
        }

        public final int getId() {
            return this.id;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lapp/rive/runtime/kotlin/ResourceType$ResourceRiveFile;", "Lapp/rive/runtime/kotlin/ResourceType;", "file", "Lapp/rive/runtime/kotlin/core/File;", "(Lapp/rive/runtime/kotlin/core/File;)V", "getFile", "()Lapp/rive/runtime/kotlin/core/File;", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ResourceRiveFile extends ResourceType {
        public static final int $stable = 8;

        @NotNull
        private final File file;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResourceRiveFile(@NotNull File file) {
            super(null);
            Intrinsics.checkNotNullParameter(file, "file");
            this.file = file;
        }

        @NotNull
        public final File getFile() {
            return this.file;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lapp/rive/runtime/kotlin/ResourceType$ResourceUrl;", "Lapp/rive/runtime/kotlin/ResourceType;", "url", "", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ResourceUrl extends ResourceType {
        public static final int $stable = 0;

        @NotNull
        private final String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResourceUrl(@NotNull String url) {
            super(null);
            Intrinsics.checkNotNullParameter(url, "url");
            this.url = url;
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }
    }

    public /* synthetic */ ResourceType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ResourceType() {
    }
}
