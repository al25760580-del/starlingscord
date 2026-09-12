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
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CacheModule.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB7\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012 \u0010\u0005\u001a\u001c\u0012\u0004\u0012\u00020\u0007\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00060\u0006¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J#\u0010\u0014\u001a\u001c\u0012\u0004\u0012\u00020\u0007\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00060\u0006HÆ\u0003J=\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\"\b\u0002\u0010\u0005\u001a\u001c\u0012\u0004\u0012\u00020\u0007\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00060\u0006HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR+\u0010\u0005\u001a\u001c\u0012\u0004\u0012\u00020\u0007\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00060\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001d"}, d2 = {"LShiggyXposed/xposed/modules/ModulesCache;", "", "blacklist", "", "", "finds", "", "", "<init>", "(Ljava/util/List;Ljava/util/Map;)V", "getBlacklist", "()Ljava/util/List;", "getFinds", "()Ljava/util/Map;", "saveToFile", "", "file", "Ljava/io/File;", "toMap", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "app_release"}, k = 1, mv = {2, 1, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class ModulesCache {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int VERSION = 3;
    private final List<Double> blacklist;
    private final Map<String, Map<String, Double>> finds;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ModulesCache copy$default(ModulesCache modulesCache, List list, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            list = modulesCache.blacklist;
        }
        if ((i & 2) != 0) {
            map = modulesCache.finds;
        }
        return modulesCache.copy(list, map);
    }

    public final List<Double> component1() {
        return this.blacklist;
    }

    public final Map<String, Map<String, Double>> component2() {
        return this.finds;
    }

    public final ModulesCache copy(List<Double> blacklist, Map<String, ? extends Map<String, Double>> finds) {
        Intrinsics.checkNotNullParameter(blacklist, "blacklist");
        Intrinsics.checkNotNullParameter(finds, "finds");
        return new ModulesCache(blacklist, finds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ModulesCache)) {
            return false;
        }
        ModulesCache modulesCache = (ModulesCache) other;
        return Intrinsics.areEqual(this.blacklist, modulesCache.blacklist) && Intrinsics.areEqual(this.finds, modulesCache.finds);
    }

    public int hashCode() {
        return (this.blacklist.hashCode() * 31) + this.finds.hashCode();
    }

    public String toString() {
        return "ModulesCache(blacklist=" + this.blacklist + ", finds=" + this.finds + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ModulesCache(List<Double> blacklist, Map<String, ? extends Map<String, Double>> finds) {
        Intrinsics.checkNotNullParameter(blacklist, "blacklist");
        Intrinsics.checkNotNullParameter(finds, "finds");
        this.blacklist = blacklist;
        this.finds = finds;
    }

    public final List<Double> getBlacklist() {
        return this.blacklist;
    }

    public final Map<String, Map<String, Double>> getFinds() {
        return this.finds;
    }

    public final void saveToFile(File file) throws Throwable {
        FileOutputStream fileOutputStreamStartWrite;
        Intrinsics.checkNotNullParameter(file, "file");
        AtomicFile atomicFile = new AtomicFile(file);
        try {
            fileOutputStreamStartWrite = atomicFile.startWrite();
            try {
                DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(fileOutputStreamStartWrite));
                dataOutputStream.writeInt(3);
                dataOutputStream.writeInt(this.blacklist.size());
                Iterator<Double> it = this.blacklist.iterator();
                while (it.hasNext()) {
                    dataOutputStream.writeInt((int) it.next().doubleValue());
                }
                dataOutputStream.writeInt(this.finds.size());
                for (Map.Entry<String, Map<String, Double>> entry : this.finds.entrySet()) {
                    String key = entry.getKey();
                    Map<String, Double> value = entry.getValue();
                    dataOutputStream.writeUTF(key);
                    if (value == null) {
                        dataOutputStream.writeBoolean(false);
                    } else {
                        dataOutputStream.writeBoolean(true);
                        dataOutputStream.writeInt(value.size());
                        for (Map.Entry<String, Double> entry2 : value.entrySet()) {
                            String key2 = entry2.getKey();
                            double dDoubleValue = entry2.getValue().doubleValue();
                            dataOutputStream.writeInt(Integer.parseInt(key2));
                            dataOutputStream.writeInt((int) dDoubleValue);
                        }
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
        Map map;
        Map<String, Map<String, Double>> map2 = this.finds;
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map2.size()));
        Iterator<T> it = map2.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Map map3 = (Map) entry.getValue();
            if (map3 != null) {
                ArrayList arrayList = new ArrayList(map3.size());
                for (Map.Entry entry2 : map3.entrySet()) {
                    arrayList.add(TuplesKt.to((String) entry2.getKey(), Double.valueOf(((Number) entry2.getValue()).doubleValue())));
                }
                map = MapsKt.toMap(arrayList);
            } else {
                map = null;
            }
            linkedHashMap.put(key, map);
        }
        return MapsKt.mapOf(TuplesKt.to("blacklist", this.blacklist), TuplesKt.to("finds", linkedHashMap), TuplesKt.to("version", 3));
    }

    /* JADX INFO: compiled from: CacheModule.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"LShiggyXposed/xposed/modules/ModulesCache$Companion;", "", "<init>", "()V", "VERSION", "", "loadFromFileOrNull", "LShiggyXposed/xposed/modules/ModulesCache;", "file", "Ljava/io/File;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ModulesCache loadFromFileOrNull(File file) {
            Intrinsics.checkNotNullParameter(file, "file");
            if (file.exists() && file.length() > 0) {
                try {
                    DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(new AtomicFile(file).openRead()));
                    try {
                        DataInputStream dataInputStream2 = dataInputStream;
                        int i = dataInputStream2.readInt();
                        if (i != 3) {
                            throw new CacheVersionMismatchException(3, i);
                        }
                        int i2 = dataInputStream2.readInt();
                        ArrayList arrayList = new ArrayList(i2);
                        for (int i3 = 0; i3 < i2; i3++) {
                            arrayList.add(Double.valueOf(dataInputStream2.readInt()));
                        }
                        ArrayList arrayList2 = arrayList;
                        int i4 = dataInputStream2.readInt();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (int i5 = 0; i5 < i4; i5++) {
                            String utf = dataInputStream2.readUTF();
                            if (!dataInputStream2.readBoolean()) {
                                linkedHashMap.put(utf, null);
                            } else {
                                int i6 = dataInputStream2.readInt();
                                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                for (int i7 = 0; i7 < i6; i7++) {
                                    linkedHashMap2.put(String.valueOf(dataInputStream2.readInt()), Double.valueOf(dataInputStream2.readInt()));
                                }
                                linkedHashMap.put(utf, linkedHashMap2);
                            }
                        }
                        ModulesCache modulesCache = new ModulesCache(arrayList2, linkedHashMap);
                        CloseableKt.closeFinally(dataInputStream, null);
                        return modulesCache;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            CloseableKt.closeFinally(dataInputStream, th);
                            throw th2;
                        }
                    }
                } catch (CacheVersionMismatchException e) {
                    Utils.Log.INSTANCE.i("Modules cache version mismatch: " + e.getMessage());
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        Result.m453constructorimpl(Boolean.valueOf(file.delete()));
                    } catch (Throwable th3) {
                        Result.Companion companion2 = Result.INSTANCE;
                        Result.m453constructorimpl(ResultKt.createFailure(th3));
                    }
                    return null;
                } catch (EOFException e2) {
                    Utils.Log.INSTANCE.e("Modules cache corrupt: " + e2.getMessage());
                    Result.Companion companion3 = Result.INSTANCE;
                    Result.m453constructorimpl(Boolean.valueOf(file.delete()));
                    return null;
                } catch (IOException e3) {
                    Utils.Log.INSTANCE.e("Failed to read modules cache: " + e3.getMessage());
                    Result.Companion companion4 = Result.INSTANCE;
                    Result.m453constructorimpl(Boolean.valueOf(file.delete()));
                    return null;
                }
            }
            return null;
        }
    }
}
