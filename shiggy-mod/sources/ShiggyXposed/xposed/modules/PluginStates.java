package ShiggyXposed.xposed.modules;

import ShiggyXposed.xposed.Utils;
import android.util.AtomicFile;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PluginsModule.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u001b\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003J\u0015\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u001f\u0010\u0010\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0004HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0018"}, d2 = {"LShiggyXposed/xposed/modules/PluginStates;", "", "flags", "", "", "", "<init>", "(Ljava/util/Map;)V", "getFlags", "()Ljava/util/Map;", "saveToFile", "", "file", "Ljava/io/File;", "toMap", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "app_release"}, k = 1, mv = {2, 1, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class PluginStates {
    public static final int CURRENT_VERSION = 1;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Map<String, Double> flags;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PluginStates copy$default(PluginStates pluginStates, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = pluginStates.flags;
        }
        return pluginStates.copy(map);
    }

    public final Map<String, Double> component1() {
        return this.flags;
    }

    public final PluginStates copy(Map<String, Double> flags) {
        Intrinsics.checkNotNullParameter(flags, "flags");
        return new PluginStates(flags);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PluginStates) && Intrinsics.areEqual(this.flags, ((PluginStates) other).flags);
    }

    public int hashCode() {
        return this.flags.hashCode();
    }

    public String toString() {
        return "PluginStates(flags=" + this.flags + ')';
    }

    public PluginStates(Map<String, Double> flags) {
        Intrinsics.checkNotNullParameter(flags, "flags");
        this.flags = flags;
    }

    public final Map<String, Double> getFlags() {
        return this.flags;
    }

    public final void saveToFile(File file) throws Throwable {
        FileOutputStream fileOutputStreamStartWrite;
        Intrinsics.checkNotNullParameter(file, "file");
        AtomicFile atomicFile = new AtomicFile(file);
        try {
            fileOutputStreamStartWrite = atomicFile.startWrite();
            try {
                DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(fileOutputStreamStartWrite));
                dataOutputStream.writeInt(1);
                dataOutputStream.writeInt(this.flags.size());
                for (Map.Entry<String, Double> entry : this.flags.entrySet()) {
                    String key = entry.getKey();
                    double dDoubleValue = entry.getValue().doubleValue();
                    dataOutputStream.writeUTF(key);
                    dataOutputStream.writeInt((int) dDoubleValue);
                }
                dataOutputStream.flush();
                atomicFile.finishWrite(fileOutputStreamStartWrite);
            } catch (Throwable th) {
                th = th;
                if (fileOutputStreamStartWrite != null) {
                    atomicFile.failWrite(fileOutputStreamStartWrite);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStreamStartWrite = null;
        }
    }

    public final Map<String, Object> toMap() {
        return MapsKt.mapOf(TuplesKt.to("flags", this.flags));
    }

    /* JADX INFO: compiled from: PluginsModule.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"LShiggyXposed/xposed/modules/PluginStates$Companion;", "", "<init>", "()V", "CURRENT_VERSION", "", "loadFromFileOrNull", "LShiggyXposed/xposed/modules/PluginStates;", "file", "Ljava/io/File;", "loadV1FromFileOrNull", "input", "Ljava/io/DataInputStream;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final PluginStates loadFromFileOrNull(File file) {
            Intrinsics.checkNotNullParameter(file, "file");
            if (file.exists() && file.length() > 0) {
                try {
                    DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(new AtomicFile(file).openRead()));
                    try {
                        DataInputStream dataInputStream2 = dataInputStream;
                        int i = dataInputStream2.readInt();
                        if (i == 1) {
                            PluginStates pluginStatesLoadV1FromFileOrNull = PluginStates.INSTANCE.loadV1FromFileOrNull(dataInputStream2);
                            CloseableKt.closeFinally(dataInputStream, null);
                            return pluginStatesLoadV1FromFileOrNull;
                        }
                        throw new UnsupportedPluginStatesVersionException(i);
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            CloseableKt.closeFinally(dataInputStream, th);
                            throw th2;
                        }
                    }
                } catch (UnsupportedPluginStatesVersionException e) {
                    Utils.Log log = Utils.Log.INSTANCE;
                    String message = e.getMessage();
                    Intrinsics.checkNotNull(message);
                    log.i(message);
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        Result.m453constructorimpl(Boolean.valueOf(file.delete()));
                    } catch (Throwable th3) {
                        Result.Companion companion2 = Result.INSTANCE;
                        Result.m453constructorimpl(ResultKt.createFailure(th3));
                    }
                    return null;
                } catch (EOFException e2) {
                    Utils.Log.INSTANCE.e("Plugin states corrupt: " + e2.getMessage());
                    Result.Companion companion3 = Result.INSTANCE;
                    Result.m453constructorimpl(Boolean.valueOf(file.delete()));
                    return null;
                } catch (IOException e3) {
                    Utils.Log.INSTANCE.e("Failed to read plugin states: " + e3.getMessage());
                    Result.Companion companion4 = Result.INSTANCE;
                    Result.m453constructorimpl(Boolean.valueOf(file.delete()));
                    return null;
                }
            }
            return null;
        }

        private final PluginStates loadV1FromFileOrNull(DataInputStream input) throws IOException {
            int i = input.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (int i2 = 0; i2 < i; i2++) {
                linkedHashMap.put(input.readUTF(), Double.valueOf(input.readInt()));
            }
            return new PluginStates(linkedHashMap);
        }
    }
}
