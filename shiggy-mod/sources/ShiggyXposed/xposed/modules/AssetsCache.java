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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CacheModule.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B'\u0012\u001e\u0010\u0002\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003J!\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0003HÆ\u0003J+\u0010\u0010\u001a\u00020\u00002 \b\u0002\u0010\u0002\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0004HÖ\u0001R)\u0010\u0002\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0018"}, d2 = {"LShiggyXposed/xposed/modules/AssetsCache;", "", "data", "", "", "", "<init>", "(Ljava/util/Map;)V", "getData", "()Ljava/util/Map;", "saveToFile", "", "file", "Ljava/io/File;", "toMap", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "app_release"}, k = 1, mv = {2, 1, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class AssetsCache {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int VERSION = 2;
    private final Map<String, Map<String, Double>> data;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AssetsCache copy$default(AssetsCache assetsCache, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = assetsCache.data;
        }
        return assetsCache.copy(map);
    }

    public final Map<String, Map<String, Double>> component1() {
        return this.data;
    }

    public final AssetsCache copy(Map<String, ? extends Map<String, Double>> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return new AssetsCache(data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AssetsCache) && Intrinsics.areEqual(this.data, ((AssetsCache) other).data);
    }

    public int hashCode() {
        return this.data.hashCode();
    }

    public String toString() {
        return "AssetsCache(data=" + this.data + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AssetsCache(Map<String, ? extends Map<String, Double>> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
    }

    public final Map<String, Map<String, Double>> getData() {
        return this.data;
    }

    public final void saveToFile(File file) throws Throwable {
        FileOutputStream fileOutputStreamStartWrite;
        Intrinsics.checkNotNullParameter(file, "file");
        AtomicFile atomicFile = new AtomicFile(file);
        try {
            fileOutputStreamStartWrite = atomicFile.startWrite();
            try {
                DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(fileOutputStreamStartWrite));
                dataOutputStream.writeInt(2);
                dataOutputStream.writeInt(this.data.size());
                for (Map.Entry<String, Map<String, Double>> entry : this.data.entrySet()) {
                    String key = entry.getKey();
                    Map<String, Double> value = entry.getValue();
                    dataOutputStream.writeUTF(key);
                    dataOutputStream.writeInt(value.size());
                    for (Map.Entry<String, Double> entry2 : value.entrySet()) {
                        String key2 = entry2.getKey();
                        double dDoubleValue = entry2.getValue().doubleValue();
                        dataOutputStream.writeUTF(key2);
                        dataOutputStream.writeInt((int) dDoubleValue);
                    }
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
        Pair[] pairArr = new Pair[2];
        Map<String, Map<String, Double>> map = this.data;
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Map map2 = (Map) entry.getValue();
            ArrayList arrayList = new ArrayList(map2.size());
            for (Map.Entry entry2 : map2.entrySet()) {
                arrayList.add(TuplesKt.to((String) entry2.getKey(), Double.valueOf(((Number) entry2.getValue()).doubleValue())));
            }
            linkedHashMap.put(key, MapsKt.toMap(arrayList));
        }
        pairArr[0] = TuplesKt.to("data", linkedHashMap);
        pairArr[1] = TuplesKt.to("version", 2);
        return MapsKt.mapOf(pairArr);
    }

    /* JADX INFO: compiled from: CacheModule.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"LShiggyXposed/xposed/modules/AssetsCache$Companion;", "", "<init>", "()V", "VERSION", "", "loadFromFileOrNull", "LShiggyXposed/xposed/modules/AssetsCache;", "file", "Ljava/io/File;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final AssetsCache loadFromFileOrNull(File file) {
            Intrinsics.checkNotNullParameter(file, "file");
            if (file.exists() && file.length() > 0) {
                try {
                    DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(new AtomicFile(file).openRead()));
                    try {
                        DataInputStream dataInputStream2 = dataInputStream;
                        int i = dataInputStream2.readInt();
                        if (i != 2) {
                            throw new CacheVersionMismatchException(2, i);
                        }
                        int i2 = dataInputStream2.readInt();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (int i3 = 0; i3 < i2; i3++) {
                            String utf = dataInputStream2.readUTF();
                            int i4 = dataInputStream2.readInt();
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            for (int i5 = 0; i5 < i4; i5++) {
                                linkedHashMap2.put(dataInputStream2.readUTF(), Double.valueOf(dataInputStream2.readInt()));
                            }
                            linkedHashMap.put(utf, linkedHashMap2);
                        }
                        AssetsCache assetsCache = new AssetsCache(linkedHashMap);
                        CloseableKt.closeFinally(dataInputStream, null);
                        return assetsCache;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            CloseableKt.closeFinally(dataInputStream, th);
                            throw th2;
                        }
                    }
                } catch (CacheVersionMismatchException e) {
                    Utils.Log.INSTANCE.i("Assets cache version mismatch: " + e.getMessage());
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        Result.m453constructorimpl(Boolean.valueOf(file.delete()));
                    } catch (Throwable th3) {
                        Result.Companion companion2 = Result.INSTANCE;
                        Result.m453constructorimpl(ResultKt.createFailure(th3));
                    }
                    return null;
                } catch (EOFException e2) {
                    Utils.Log.INSTANCE.e("Assets cache corrupt: " + e2.getMessage());
                    Result.Companion companion3 = Result.INSTANCE;
                    Result.m453constructorimpl(Boolean.valueOf(file.delete()));
                    return null;
                } catch (IOException e3) {
                    Utils.Log.INSTANCE.e("Failed to read assets cache: " + e3.getMessage());
                    Result.Companion companion4 = Result.INSTANCE;
                    Result.m453constructorimpl(Boolean.valueOf(file.delete()));
                    return null;
                }
            }
            return null;
        }
    }
}
