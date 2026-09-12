package app.rive;

import android.content.Context;
import android.content.res.Resources;
import j0.b;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import s0.g;
import u.c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/rive/RiveFileSource;", "", "Bytes", "RawRes", "Lapp/rive/RiveFileSource$Bytes;", "Lapp/rive/RiveFileSource$RawRes;", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface RiveFileSource {

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0016"}, d2 = {"Lapp/rive/RiveFileSource$Bytes;", "Lapp/rive/RiveFileSource;", "data", "", "constructor-impl", "([B)[B", "getData", "()[B", "equals", "", "other", "", "equals-impl", "([BLjava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "([B)I", "toString", "", "toString-impl", "([B)Ljava/lang/String;", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Bytes implements RiveFileSource {

        @NotNull
        private final byte[] data;

        private /* synthetic */ Bytes(byte[] bArr) {
            this.data = bArr;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Bytes m33boximpl(byte[] bArr) {
            return new Bytes(bArr);
        }

        @NotNull
        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static byte[] m34constructorimpl(@NotNull byte[] data) {
            Intrinsics.checkNotNullParameter(data, "data");
            return data;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m35equalsimpl(byte[] bArr, Object obj) {
            return (obj instanceof Bytes) && Intrinsics.areEqual(bArr, ((Bytes) obj).m39unboximpl());
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m36equalsimpl0(byte[] bArr, byte[] bArr2) {
            return Intrinsics.areEqual(bArr, bArr2);
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m37hashCodeimpl(byte[] bArr) {
            return Arrays.hashCode(bArr);
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m38toStringimpl(byte[] bArr) {
            return g.e("Bytes(data=", Arrays.toString(bArr), ")");
        }

        public boolean equals(Object obj) {
            return m35equalsimpl(this.data, obj);
        }

        @NotNull
        public final byte[] getData() {
            return this.data;
        }

        public int hashCode() {
            return m37hashCodeimpl(this.data);
        }

        public String toString() {
            return m38toStringimpl(this.data);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ byte[] m39unboximpl() {
            return this.data;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0017\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lapp/rive/RiveFileSource$RawRes;", "Lapp/rive/RiveFileSource;", "resId", "", "resources", "Landroid/content/res/Resources;", "(ILandroid/content/res/Resources;)V", "getResId", "()I", "getResources", "()Landroid/content/res/Resources;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "Companion", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RawRes implements RiveFileSource {
        private final int resId;

        @NotNull
        private final Resources resources;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lapp/rive/RiveFileSource$RawRes$Companion;", "", "<init>", "()V", "", "resId", "Lapp/rive/RiveFileSource$RawRes;", "from", "(ILu/c;I)Lapp/rive/RiveFileSource$RawRes;", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @SourceDebugExtension({"SMAP\nRiveFile.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RiveFile.kt\napp/rive/RiveFileSource$RawRes$Companion\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,222:1\n75#2:223\n*S KotlinDebug\n*F\n+ 1 RiveFile.kt\napp/rive/RiveFileSource$RawRes$Companion\n*L\n190#1:223\n*E\n"})
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final RawRes from(int i7, c cVar, int i10) {
                cVar.d();
                int i11 = b.f13583a;
                Resources resources = ((Context) cVar.n()).getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                RawRes rawRes = new RawRes(i7, resources);
                cVar.k();
                return rawRes;
            }

            private Companion() {
            }
        }

        public RawRes(int i7, @NotNull Resources resources) {
            Intrinsics.checkNotNullParameter(resources, "resources");
            this.resId = i7;
            this.resources = resources;
        }

        public static /* synthetic */ RawRes copy$default(RawRes rawRes, int i7, Resources resources, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                i7 = rawRes.resId;
            }
            if ((i10 & 2) != 0) {
                resources = rawRes.resources;
            }
            return rawRes.copy(i7, resources);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getResId() {
            return this.resId;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Resources getResources() {
            return this.resources;
        }

        @NotNull
        public final RawRes copy(int resId, @NotNull Resources resources) {
            Intrinsics.checkNotNullParameter(resources, "resources");
            return new RawRes(resId, resources);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RawRes)) {
                return false;
            }
            RawRes rawRes = (RawRes) other;
            return this.resId == rawRes.resId && Intrinsics.areEqual(this.resources, rawRes.resources);
        }

        public final int getResId() {
            return this.resId;
        }

        @NotNull
        public final Resources getResources() {
            return this.resources;
        }

        public int hashCode() {
            return this.resources.hashCode() + (Integer.hashCode(this.resId) * 31);
        }

        @NotNull
        public String toString() {
            return "RawRes(resId=" + this.resId + ", resources=" + this.resources + ")";
        }
    }
}
