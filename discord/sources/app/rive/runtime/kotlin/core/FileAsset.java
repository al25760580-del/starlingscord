package app.rive.runtime.kotlin.core;

import com.facebook.react.devsupport.StackTraceHelper;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rn.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B\u0017\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0011\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0003H\u0082 J!\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00020\u0005H\u0082 J\u0011\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0003H\u0082 J\u0011\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0003H\u0082 J\u000e\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aR\u001b\u0010\u0007\u001a\u00020\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u000e\u0010\nR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\f\u001a\u0004\b\u0013\u0010\n\u0082\u0001\u0003\u001e\u001f ¨\u0006!"}, d2 = {"Lapp/rive/runtime/kotlin/core/FileAsset;", "Lapp/rive/runtime/kotlin/core/NativeObject;", "address", "", "rendererTypeIdx", "", "(JI)V", "cdnUrl", "", "getCdnUrl", "()Ljava/lang/String;", "cdnUrl$delegate", "Lkotlin/Lazy;", StackTraceHelper.NAME_KEY, "getName", "name$delegate", "rendererType", "Lapp/rive/runtime/kotlin/core/RendererType;", "uniqueFilename", "getUniqueFilename", "uniqueFilename$delegate", "cppCDNUrl", "cppPointer", "cppDecode", "", "bytes", "", "cppName", "cppUniqueFilename", "decode", "Lapp/rive/runtime/kotlin/core/AudioAsset;", "Lapp/rive/runtime/kotlin/core/FontAsset;", "Lapp/rive/runtime/kotlin/core/ImageAsset;", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class FileAsset extends NativeObject {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: cdnUrl$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy cdnUrl;

    /* JADX INFO: renamed from: name$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy name;

    @NotNull
    private final RendererType rendererType;

    /* JADX INFO: renamed from: uniqueFilename$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy uniqueFilename;

    public /* synthetic */ FileAsset(long j, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, i7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final native String cppCDNUrl(long cppPointer);

    private final native boolean cppDecode(long cppPointer, byte[] bytes, int rendererType);

    /* JADX INFO: Access modifiers changed from: private */
    public final native String cppName(long cppPointer);

    /* JADX INFO: Access modifiers changed from: private */
    public final native String cppUniqueFilename(long cppPointer);

    public final boolean decode(@NotNull byte[] bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return cppDecode(getCppPointer(), bytes, this.rendererType.getValue());
    }

    @NotNull
    public final String getCdnUrl() {
        return (String) this.cdnUrl.getValue();
    }

    @NotNull
    public final String getName() {
        return (String) this.name.getValue();
    }

    @NotNull
    public final String getUniqueFilename() {
        return (String) this.uniqueFilename.getValue();
    }

    private FileAsset(long j, int i7) {
        super(j);
        this.rendererType = RendererType.INSTANCE.fromIndex(i7);
        this.name = l.b(new Function0<String>() { // from class: app.rive.runtime.kotlin.core.FileAsset$name$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                FileAsset fileAsset = this.this$0;
                return fileAsset.cppName(fileAsset.getCppPointer());
            }
        });
        this.uniqueFilename = l.b(new Function0<String>() { // from class: app.rive.runtime.kotlin.core.FileAsset$uniqueFilename$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                FileAsset fileAsset = this.this$0;
                return fileAsset.cppUniqueFilename(fileAsset.getCppPointer());
            }
        });
        this.cdnUrl = l.b(new Function0<String>() { // from class: app.rive.runtime.kotlin.core.FileAsset$cdnUrl$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                FileAsset fileAsset = this.this$0;
                return fileAsset.cppCDNUrl(fileAsset.getCppPointer());
            }
        });
    }
}
