package op;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends fq.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f17491i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ u4.b f17492v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(u4.b bVar, int i7) {
        super(4);
        this.f17491i = i7;
        this.f17492v = bVar;
    }

    @Override // fq.a
    public final void y0(String[] strArr) {
        switch (this.f17491i) {
            case 0:
                if (strArr == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter 'data' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$1.visitEnd must not be null");
                }
                ((e) this.f17492v.f20945e).f17496v = strArr;
                return;
            default:
                if (strArr == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter 'data' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$2.visitEnd must not be null");
                }
                ((e) this.f17492v.f20945e).f17497w = strArr;
                return;
        }
    }
}
