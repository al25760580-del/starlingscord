package app.rive;

import a3.e;
import kk.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lapp/rive/ViewModelInstanceSource;", "", "Blank", "Default", "Named", "Reference", "ReferenceListItem", "Lapp/rive/ViewModelInstanceSource$Blank;", "Lapp/rive/ViewModelInstanceSource$Default;", "Lapp/rive/ViewModelInstanceSource$Named;", "Lapp/rive/ViewModelInstanceSource$Reference;", "Lapp/rive/ViewModelInstanceSource$ReferenceListItem;", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface ViewModelInstanceSource {

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0016"}, d2 = {"Lapp/rive/ViewModelInstanceSource$Blank;", "Lapp/rive/ViewModelInstanceSource;", "vmSource", "Lapp/rive/ViewModelSource;", "constructor-impl", "(Lapp/rive/ViewModelSource;)Lapp/rive/ViewModelSource;", "getVmSource", "()Lapp/rive/ViewModelSource;", "equals", "", "other", "", "equals-impl", "(Lapp/rive/ViewModelSource;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Lapp/rive/ViewModelSource;)I", "toString", "", "toString-impl", "(Lapp/rive/ViewModelSource;)Ljava/lang/String;", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Blank implements ViewModelInstanceSource {

        @NotNull
        private final ViewModelSource vmSource;

        private /* synthetic */ Blank(ViewModelSource viewModelSource) {
            this.vmSource = viewModelSource;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Blank m69boximpl(ViewModelSource viewModelSource) {
            return new Blank(viewModelSource);
        }

        @NotNull
        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static ViewModelSource m70constructorimpl(@NotNull ViewModelSource vmSource) {
            Intrinsics.checkNotNullParameter(vmSource, "vmSource");
            return vmSource;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m71equalsimpl(ViewModelSource viewModelSource, Object obj) {
            return (obj instanceof Blank) && Intrinsics.areEqual(viewModelSource, ((Blank) obj).m75unboximpl());
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m72equalsimpl0(ViewModelSource viewModelSource, ViewModelSource viewModelSource2) {
            return Intrinsics.areEqual(viewModelSource, viewModelSource2);
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m73hashCodeimpl(ViewModelSource viewModelSource) {
            return viewModelSource.hashCode();
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m74toStringimpl(ViewModelSource viewModelSource) {
            return "Blank(vmSource=" + viewModelSource + ")";
        }

        public boolean equals(Object obj) {
            return m71equalsimpl(this.vmSource, obj);
        }

        @NotNull
        public final ViewModelSource getVmSource() {
            return this.vmSource;
        }

        public int hashCode() {
            return m73hashCodeimpl(this.vmSource);
        }

        public String toString() {
            return m74toStringimpl(this.vmSource);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ ViewModelSource m75unboximpl() {
            return this.vmSource;
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0016"}, d2 = {"Lapp/rive/ViewModelInstanceSource$Default;", "Lapp/rive/ViewModelInstanceSource;", "vmSource", "Lapp/rive/ViewModelSource;", "constructor-impl", "(Lapp/rive/ViewModelSource;)Lapp/rive/ViewModelSource;", "getVmSource", "()Lapp/rive/ViewModelSource;", "equals", "", "other", "", "equals-impl", "(Lapp/rive/ViewModelSource;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Lapp/rive/ViewModelSource;)I", "toString", "", "toString-impl", "(Lapp/rive/ViewModelSource;)Ljava/lang/String;", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Default implements ViewModelInstanceSource {

        @NotNull
        private final ViewModelSource vmSource;

        private /* synthetic */ Default(ViewModelSource viewModelSource) {
            this.vmSource = viewModelSource;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Default m76boximpl(ViewModelSource viewModelSource) {
            return new Default(viewModelSource);
        }

        @NotNull
        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static ViewModelSource m77constructorimpl(@NotNull ViewModelSource vmSource) {
            Intrinsics.checkNotNullParameter(vmSource, "vmSource");
            return vmSource;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m78equalsimpl(ViewModelSource viewModelSource, Object obj) {
            return (obj instanceof Default) && Intrinsics.areEqual(viewModelSource, ((Default) obj).m82unboximpl());
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m79equalsimpl0(ViewModelSource viewModelSource, ViewModelSource viewModelSource2) {
            return Intrinsics.areEqual(viewModelSource, viewModelSource2);
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m80hashCodeimpl(ViewModelSource viewModelSource) {
            return viewModelSource.hashCode();
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m81toStringimpl(ViewModelSource viewModelSource) {
            return "Default(vmSource=" + viewModelSource + ")";
        }

        public boolean equals(Object obj) {
            return m78equalsimpl(this.vmSource, obj);
        }

        @NotNull
        public final ViewModelSource getVmSource() {
            return this.vmSource;
        }

        public int hashCode() {
            return m80hashCodeimpl(this.vmSource);
        }

        public String toString() {
            return m81toStringimpl(this.vmSource);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ ViewModelSource m82unboximpl() {
            return this.vmSource;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lapp/rive/ViewModelInstanceSource$Named;", "Lapp/rive/ViewModelInstanceSource;", "vmSource", "Lapp/rive/ViewModelSource;", "instanceName", "", "(Lapp/rive/ViewModelSource;Ljava/lang/String;)V", "getInstanceName", "()Ljava/lang/String;", "getVmSource", "()Lapp/rive/ViewModelSource;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Named implements ViewModelInstanceSource {
        public static final int $stable = 8;

        @NotNull
        private final String instanceName;

        @NotNull
        private final ViewModelSource vmSource;

        public Named(@NotNull ViewModelSource vmSource, @NotNull String instanceName) {
            Intrinsics.checkNotNullParameter(vmSource, "vmSource");
            Intrinsics.checkNotNullParameter(instanceName, "instanceName");
            this.vmSource = vmSource;
            this.instanceName = instanceName;
        }

        public static /* synthetic */ Named copy$default(Named named, ViewModelSource viewModelSource, String str, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                viewModelSource = named.vmSource;
            }
            if ((i7 & 2) != 0) {
                str = named.instanceName;
            }
            return named.copy(viewModelSource, str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final ViewModelSource getVmSource() {
            return this.vmSource;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getInstanceName() {
            return this.instanceName;
        }

        @NotNull
        public final Named copy(@NotNull ViewModelSource vmSource, @NotNull String instanceName) {
            Intrinsics.checkNotNullParameter(vmSource, "vmSource");
            Intrinsics.checkNotNullParameter(instanceName, "instanceName");
            return new Named(vmSource, instanceName);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Named)) {
                return false;
            }
            Named named = (Named) other;
            return Intrinsics.areEqual(this.vmSource, named.vmSource) && Intrinsics.areEqual(this.instanceName, named.instanceName);
        }

        @NotNull
        public final String getInstanceName() {
            return this.instanceName;
        }

        @NotNull
        public final ViewModelSource getVmSource() {
            return this.vmSource;
        }

        public int hashCode() {
            return this.instanceName.hashCode() + (this.vmSource.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "Named(vmSource=" + this.vmSource + ", instanceName=" + this.instanceName + ")";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lapp/rive/ViewModelInstanceSource$Reference;", "Lapp/rive/ViewModelInstanceSource;", "parentInstance", "Lapp/rive/ViewModelInstance;", "path", "", "(Lapp/rive/ViewModelInstance;Ljava/lang/String;)V", "getParentInstance", "()Lapp/rive/ViewModelInstance;", "getPath", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Reference implements ViewModelInstanceSource {
        public static final int $stable = 8;

        @NotNull
        private final ViewModelInstance parentInstance;

        @NotNull
        private final String path;

        public Reference(@NotNull ViewModelInstance parentInstance, @NotNull String path) {
            Intrinsics.checkNotNullParameter(parentInstance, "parentInstance");
            Intrinsics.checkNotNullParameter(path, "path");
            this.parentInstance = parentInstance;
            this.path = path;
        }

        public static /* synthetic */ Reference copy$default(Reference reference, ViewModelInstance viewModelInstance, String str, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                viewModelInstance = reference.parentInstance;
            }
            if ((i7 & 2) != 0) {
                str = reference.path;
            }
            return reference.copy(viewModelInstance, str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final ViewModelInstance getParentInstance() {
            return this.parentInstance;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getPath() {
            return this.path;
        }

        @NotNull
        public final Reference copy(@NotNull ViewModelInstance parentInstance, @NotNull String path) {
            Intrinsics.checkNotNullParameter(parentInstance, "parentInstance");
            Intrinsics.checkNotNullParameter(path, "path");
            return new Reference(parentInstance, path);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Reference)) {
                return false;
            }
            Reference reference = (Reference) other;
            return Intrinsics.areEqual(this.parentInstance, reference.parentInstance) && Intrinsics.areEqual(this.path, reference.path);
        }

        @NotNull
        public final ViewModelInstance getParentInstance() {
            return this.parentInstance;
        }

        @NotNull
        public final String getPath() {
            return this.path;
        }

        public int hashCode() {
            return this.path.hashCode() + (this.parentInstance.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "Reference(parentInstance=" + this.parentInstance + ", path=" + this.path + ")";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lapp/rive/ViewModelInstanceSource$ReferenceListItem;", "Lapp/rive/ViewModelInstanceSource;", "parentInstance", "Lapp/rive/ViewModelInstance;", "pathToList", "", "index", "", "(Lapp/rive/ViewModelInstance;Ljava/lang/String;I)V", "getIndex", "()I", "getParentInstance", "()Lapp/rive/ViewModelInstance;", "getPathToList", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ReferenceListItem implements ViewModelInstanceSource {
        public static final int $stable = 8;
        private final int index;

        @NotNull
        private final ViewModelInstance parentInstance;

        @NotNull
        private final String pathToList;

        public ReferenceListItem(@NotNull ViewModelInstance parentInstance, @NotNull String pathToList, int i7) {
            Intrinsics.checkNotNullParameter(parentInstance, "parentInstance");
            Intrinsics.checkNotNullParameter(pathToList, "pathToList");
            this.parentInstance = parentInstance;
            this.pathToList = pathToList;
            this.index = i7;
        }

        public static /* synthetic */ ReferenceListItem copy$default(ReferenceListItem referenceListItem, ViewModelInstance viewModelInstance, String str, int i7, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                viewModelInstance = referenceListItem.parentInstance;
            }
            if ((i10 & 2) != 0) {
                str = referenceListItem.pathToList;
            }
            if ((i10 & 4) != 0) {
                i7 = referenceListItem.index;
            }
            return referenceListItem.copy(viewModelInstance, str, i7);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final ViewModelInstance getParentInstance() {
            return this.parentInstance;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getPathToList() {
            return this.pathToList;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        @NotNull
        public final ReferenceListItem copy(@NotNull ViewModelInstance parentInstance, @NotNull String pathToList, int index) {
            Intrinsics.checkNotNullParameter(parentInstance, "parentInstance");
            Intrinsics.checkNotNullParameter(pathToList, "pathToList");
            return new ReferenceListItem(parentInstance, pathToList, index);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ReferenceListItem)) {
                return false;
            }
            ReferenceListItem referenceListItem = (ReferenceListItem) other;
            return Intrinsics.areEqual(this.parentInstance, referenceListItem.parentInstance) && Intrinsics.areEqual(this.pathToList, referenceListItem.pathToList) && this.index == referenceListItem.index;
        }

        public final int getIndex() {
            return this.index;
        }

        @NotNull
        public final ViewModelInstance getParentInstance() {
            return this.parentInstance;
        }

        @NotNull
        public final String getPathToList() {
            return this.pathToList;
        }

        public int hashCode() {
            return Integer.hashCode(this.index) + e.d(this.parentInstance.hashCode() * 31, 31, this.pathToList);
        }

        @NotNull
        public String toString() {
            ViewModelInstance viewModelInstance = this.parentInstance;
            String str = this.pathToList;
            int i7 = this.index;
            StringBuilder sb2 = new StringBuilder("ReferenceListItem(parentInstance=");
            sb2.append(viewModelInstance);
            sb2.append(", pathToList=");
            sb2.append(str);
            sb2.append(", index=");
            return b.l(sb2, i7, ")");
        }
    }
}
