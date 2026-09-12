package ShiggyXposed.xposed.modules.appearance;

import androidx.constraintlayout.widget.ConstraintLayout;
import io.ktor.http.ContentDisposition;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: ThemesModule.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000212Bk\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u001c\b\u0002\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0006\u0018\u00010\u000b\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eBy\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u001a\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0006\u0018\u00010\u000b\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0012J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J\u001d\u0010!\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0006\u0018\u00010\u000bHÆ\u0003J\u0017\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000bHÆ\u0003Jq\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\u001c\b\u0002\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0006\u0018\u00010\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000bHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\tHÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001J%\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u00002\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0001¢\u0006\u0002\b0R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R%\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0006\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001b¨\u00063"}, d2 = {"LShiggyXposed/xposed/modules/appearance/ThemeData;", "", ContentDisposition.Parameters.Name, "", "description", "authors", "", "LShiggyXposed/xposed/modules/appearance/Author;", "spec", "", "semanticColors", "", "rawColors", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/util/Map;Ljava/util/Map;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getName", "()Ljava/lang/String;", "getDescription", "getAuthors", "()Ljava/util/List;", "getSpec", "()I", "getSemanticColors", "()Ljava/util/Map;", "getRawColors", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$app_release", "$serializer", "Companion", "app_release"}, k = 1, mv = {2, 1, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@Serializable
public final /* data */ class ThemeData {
    private final List<Author> authors;
    private final String description;
    private final String name;
    private final Map<String, String> rawColors;
    private final Map<String, List<String>> semanticColors;
    private final int spec;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(Author$$serializer.INSTANCE), null, new LinkedHashMapSerializer(StringSerializer.INSTANCE, new ArrayListSerializer(StringSerializer.INSTANCE)), new LinkedHashMapSerializer(StringSerializer.INSTANCE, StringSerializer.INSTANCE)};

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ThemeData copy$default(ThemeData themeData, String str, String str2, List list, int i, Map map, Map map2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = themeData.name;
        }
        if ((i2 & 2) != 0) {
            str2 = themeData.description;
        }
        if ((i2 & 4) != 0) {
            list = themeData.authors;
        }
        if ((i2 & 8) != 0) {
            i = themeData.spec;
        }
        if ((i2 & 16) != 0) {
            map = themeData.semanticColors;
        }
        if ((i2 & 32) != 0) {
            map2 = themeData.rawColors;
        }
        Map map3 = map;
        Map map4 = map2;
        return themeData.copy(str, str2, list, i, map3, map4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final List<Author> component3() {
        return this.authors;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getSpec() {
        return this.spec;
    }

    public final Map<String, List<String>> component5() {
        return this.semanticColors;
    }

    public final Map<String, String> component6() {
        return this.rawColors;
    }

    public final ThemeData copy(String name, String description, List<Author> authors, int spec, Map<String, ? extends List<String>> semanticColors, Map<String, String> rawColors) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new ThemeData(name, description, authors, spec, semanticColors, rawColors);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ThemeData)) {
            return false;
        }
        ThemeData themeData = (ThemeData) other;
        return Intrinsics.areEqual(this.name, themeData.name) && Intrinsics.areEqual(this.description, themeData.description) && Intrinsics.areEqual(this.authors, themeData.authors) && this.spec == themeData.spec && Intrinsics.areEqual(this.semanticColors, themeData.semanticColors) && Intrinsics.areEqual(this.rawColors, themeData.rawColors);
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        String str = this.description;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<Author> list = this.authors;
        int iHashCode3 = (((iHashCode2 + (list == null ? 0 : list.hashCode())) * 31) + Integer.hashCode(this.spec)) * 31;
        Map<String, List<String>> map = this.semanticColors;
        int iHashCode4 = (iHashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, String> map2 = this.rawColors;
        return iHashCode4 + (map2 != null ? map2.hashCode() : 0);
    }

    public String toString() {
        return "ThemeData(name=" + this.name + ", description=" + this.description + ", authors=" + this.authors + ", spec=" + this.spec + ", semanticColors=" + this.semanticColors + ", rawColors=" + this.rawColors + ')';
    }

    /* JADX INFO: compiled from: ThemesModule.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"LShiggyXposed/xposed/modules/appearance/ThemeData$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "LShiggyXposed/xposed/modules/appearance/ThemeData;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ThemeData> serializer() {
            return ThemeData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ThemeData(int i, String str, String str2, List list, int i2, Map map, Map map2, SerializationConstructorMarker serializationConstructorMarker) {
        if (9 != (i & 9)) {
            PluginExceptionsKt.throwMissingFieldException(i, 9, ThemeData$$serializer.INSTANCE.getDescriptor());
        }
        this.name = str;
        if ((i & 2) == 0) {
            this.description = null;
        } else {
            this.description = str2;
        }
        if ((i & 4) == 0) {
            this.authors = null;
        } else {
            this.authors = list;
        }
        this.spec = i2;
        if ((i & 16) == 0) {
            this.semanticColors = null;
        } else {
            this.semanticColors = map;
        }
        if ((i & 32) == 0) {
            this.rawColors = null;
        } else {
            this.rawColors = map2;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$app_release(ThemeData self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.name);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.description != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.description);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.authors != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, kSerializerArr[2], self.authors);
        }
        output.encodeIntElement(serialDesc, 3, self.spec);
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.semanticColors != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, kSerializerArr[4], self.semanticColors);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 5) && self.rawColors == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 5, kSerializerArr[5], self.rawColors);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ThemeData(String name, String str, List<Author> list, int i, Map<String, ? extends List<String>> map, Map<String, String> map2) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.description = str;
        this.authors = list;
        this.spec = i;
        this.semanticColors = map;
        this.rawColors = map2;
    }

    public /* synthetic */ ThemeData(String str, String str2, List list, int i, Map map, Map map2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : list, i, (i2 & 16) != 0 ? null : map, (i2 & 32) != 0 ? null : map2);
    }

    public final String getName() {
        return this.name;
    }

    public final String getDescription() {
        return this.description;
    }

    public final List<Author> getAuthors() {
        return this.authors;
    }

    public final int getSpec() {
        return this.spec;
    }

    public final Map<String, List<String>> getSemanticColors() {
        return this.semanticColors;
    }

    public final Map<String, String> getRawColors() {
        return this.rawColors;
    }
}
