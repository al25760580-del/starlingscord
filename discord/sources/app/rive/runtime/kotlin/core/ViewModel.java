package app.rive.runtime.kotlin.core;

import a3.e;
import app.rive.runtime.kotlin.core.errors.ViewModelException;
import com.facebook.imagepipeline.nativecode.b;
import com.facebook.react.devsupport.StackTraceHelper;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.collections.v0;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001:\u0002#$B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0003H\u0095 J\u0011\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0003H\u0092 J\u0019\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0006H\u0092 J\u0019\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0092 J\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0015\u001a\u00020\u0003H\u0092 J\u0011\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0003H\u0092 J\u0011\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0003H\u0092 J\u0011\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0003H\u0092 J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u001fH\u0016J\u0010\u0010!\u001a\u00020\u001f2\u0006\u0010\u0018\u001a\u00020\u0006H\u0016J\u0010\u0010\"\u001a\u00020\u001f2\u0006\u0010\t\u001a\u00020\nH\u0016R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\b¨\u0006%"}, d2 = {"Lapp/rive/runtime/kotlin/core/ViewModel;", "Lapp/rive/runtime/kotlin/core/NativeObject;", "unsafeCppPointer", "", "(J)V", "instanceCount", "", "getInstanceCount", "()I", StackTraceHelper.NAME_KEY, "", "getName", "()Ljava/lang/String;", "properties", "", "Lapp/rive/runtime/kotlin/core/ViewModel$Property;", "getProperties", "()Ljava/util/List;", "propertyCount", "getPropertyCount", "cppCreateBlankInstance", "cppPointer", "cppCreateDefaultInstance", "cppCreateInstanceFromIndex", "index", "cppCreateInstanceFromName", "cppGetProperties", "cppInstanceCount", "cppName", "cppPropertyCount", "createBlankInstance", "Lapp/rive/runtime/kotlin/core/ViewModelInstance;", "createDefaultInstance", "createInstanceFromIndex", "createInstanceFromName", "Property", "PropertyDataType", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewModel.kt\napp/rive/runtime/kotlin/core/ViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,156:1\n1#2:157\n*E\n"})
public class ViewModel extends NativeObject {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lapp/rive/runtime/kotlin/core/ViewModel$Property;", "", "type", "Lapp/rive/runtime/kotlin/core/ViewModel$PropertyDataType;", StackTraceHelper.NAME_KEY, "", "(Lapp/rive/runtime/kotlin/core/ViewModel$PropertyDataType;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getType", "()Lapp/rive/runtime/kotlin/core/ViewModel$PropertyDataType;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Property {
        public static final int $stable = 0;

        @NotNull
        private final String name;

        @NotNull
        private final PropertyDataType type;

        public Property(@NotNull PropertyDataType type, @NotNull String name) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(name, "name");
            this.type = type;
            this.name = name;
        }

        public static /* synthetic */ Property copy$default(Property property, PropertyDataType propertyDataType, String str, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                propertyDataType = property.type;
            }
            if ((i7 & 2) != 0) {
                str = property.name;
            }
            return property.copy(propertyDataType, str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final PropertyDataType getType() {
            return this.type;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final Property copy(@NotNull PropertyDataType type, @NotNull String name) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(name, "name");
            return new Property(type, name);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Property)) {
                return false;
            }
            Property property = (Property) other;
            return this.type == property.type && Intrinsics.areEqual(this.name, property.name);
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final PropertyDataType getType() {
            return this.type;
        }

        public int hashCode() {
            return this.name.hashCode() + (this.type.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "Property(type=" + this.type + ", name=" + this.name + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0014B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0015"}, d2 = {"Lapp/rive/runtime/kotlin/core/ViewModel$PropertyDataType;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "NONE", "STRING", "NUMBER", "BOOLEAN", "COLOR", "LIST", "ENUM", "TRIGGER", "VIEW_MODEL", "INTEGER", "SYMBOL_LIST_INDEX", "ASSET_IMAGE", "ARTBOARD", "Companion", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewModel.kt\napp/rive/runtime/kotlin/core/ViewModel$PropertyDataType\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,156:1\n1202#2,2:157\n1230#2,4:159\n*S KotlinDebug\n*F\n+ 1 ViewModel.kt\napp/rive/runtime/kotlin/core/ViewModel$PropertyDataType\n*L\n149#1:157,2\n149#1:159,4\n*E\n"})
    public enum PropertyDataType {
        NONE(0),
        STRING(1),
        NUMBER(2),
        BOOLEAN(3),
        COLOR(4),
        LIST(5),
        ENUM(6),
        TRIGGER(7),
        VIEW_MODEL(8),
        INTEGER(9),
        SYMBOL_LIST_INDEX(10),
        ASSET_IMAGE(11),
        ARTBOARD(12);


        @NotNull
        private static final Map<Integer, PropertyDataType> map;
        private final int value;
        private static final /* synthetic */ EnumEntries $ENTRIES = b.l(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0005H\u0007R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lapp/rive/runtime/kotlin/core/ViewModel$PropertyDataType$Companion;", "", "()V", "map", "", "", "Lapp/rive/runtime/kotlin/core/ViewModel$PropertyDataType;", "fromInt", "type", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final PropertyDataType fromInt(int type) {
                return (PropertyDataType) PropertyDataType.map.get(Integer.valueOf(type));
            }

            private Companion() {
            }
        }

        static {
            EnumEntries entries = getEntries();
            int iA = v0.a(e0.l(entries, 10));
            LinkedHashMap linkedHashMap = new LinkedHashMap(iA < 16 ? 16 : iA);
            for (Object obj : entries) {
                linkedHashMap.put(Integer.valueOf(((PropertyDataType) obj).value), obj);
            }
            map = linkedHashMap;
        }

        PropertyDataType(int i7) {
            this.value = i7;
        }

        public static final PropertyDataType fromInt(int i7) {
            return INSTANCE.fromInt(i7);
        }

        @NotNull
        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public final int getValue() {
            return this.value;
        }
    }

    public ViewModel(long j) {
        super(j);
    }

    private native long cppCreateDefaultInstance(long cppPointer);

    private native long cppCreateInstanceFromIndex(long cppPointer, int index);

    private native long cppCreateInstanceFromName(long cppPointer, String name);

    private native List<Property> cppGetProperties(long cppPointer);

    private native int cppInstanceCount(long cppPointer);

    private native String cppName(long cppPointer);

    private native int cppPropertyCount(long cppPointer);

    public native long cppCreateBlankInstance(long cppPointer);

    @NotNull
    public ViewModelInstance createBlankInstance() throws ViewModelException {
        long jCppCreateBlankInstance = cppCreateBlankInstance(getCppPointer());
        if (jCppCreateBlankInstance == 0) {
            throw new ViewModelException("Could not create a blank ViewModel instance");
        }
        ViewModelInstance viewModelInstance = new ViewModelInstance(jCppCreateBlankInstance);
        getDependencies().add(viewModelInstance);
        return viewModelInstance;
    }

    @NotNull
    public ViewModelInstance createDefaultInstance() {
        long jCppCreateDefaultInstance = cppCreateDefaultInstance(getCppPointer());
        if (jCppCreateDefaultInstance == 0) {
            throw new ViewModelException("Could not create default ViewModel instance");
        }
        ViewModelInstance viewModelInstance = new ViewModelInstance(jCppCreateDefaultInstance);
        getDependencies().add(viewModelInstance);
        return viewModelInstance;
    }

    @NotNull
    public ViewModelInstance createInstanceFromIndex(int index) throws ViewModelException {
        long jCppCreateInstanceFromIndex = cppCreateInstanceFromIndex(getCppPointer(), index);
        if (jCppCreateInstanceFromIndex == 0) {
            throw new ViewModelException(kk.b.h(index, "ViewModel instance not found: "));
        }
        ViewModelInstance viewModelInstance = new ViewModelInstance(jCppCreateInstanceFromIndex);
        getDependencies().add(viewModelInstance);
        return viewModelInstance;
    }

    @NotNull
    public ViewModelInstance createInstanceFromName(@NotNull String name) throws ViewModelException {
        Intrinsics.checkNotNullParameter(name, "name");
        long jCppCreateInstanceFromName = cppCreateInstanceFromName(getCppPointer(), name);
        if (jCppCreateInstanceFromName == 0) {
            throw new ViewModelException(e.l("ViewModel instance not found: ", name));
        }
        ViewModelInstance viewModelInstance = new ViewModelInstance(jCppCreateInstanceFromName);
        getDependencies().add(viewModelInstance);
        return viewModelInstance;
    }

    public int getInstanceCount() {
        return cppInstanceCount(getCppPointer());
    }

    @NotNull
    public String getName() {
        return cppName(getCppPointer());
    }

    @NotNull
    public List<Property> getProperties() {
        return cppGetProperties(getCppPointer());
    }

    public int getPropertyCount() {
        return cppPropertyCount(getCppPointer());
    }
}
