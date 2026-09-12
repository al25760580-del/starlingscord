package op;

import np.l;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends fq.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f17487i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ l f17488v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(l lVar, int i7) {
        super(4);
        this.f17487i = i7;
        this.f17488v = lVar;
    }

    @Override // fq.a
    public final void y0(String[] strArr) {
        switch (this.f17487i) {
            case 0:
                if (strArr == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$1.visitEnd must not be null");
                }
                ((e) ((c) this.f17488v).f17490e).f17496v = strArr;
                return;
            case 1:
                if (strArr == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$2.visitEnd must not be null");
                }
                ((e) ((c) this.f17488v).f17490e).f17497w = strArr;
                return;
            default:
                if (strArr == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor$1.visitEnd must not be null");
                }
                ((e) ((ga.l) this.f17488v).f9547e).E = strArr;
                return;
        }
    }
}
