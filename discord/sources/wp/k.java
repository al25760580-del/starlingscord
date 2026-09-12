package wp;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.p0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements j {
    public static final /* synthetic */ KProperty[] Y = {com.discord.chat.presentation.list.a.p(k.class, "classifierNamePolicy", "getClassifierNamePolicy()Lorg/jetbrains/kotlin/renderer/ClassifierNamePolicy;", 0), com.discord.chat.presentation.list.a.p(k.class, "withDefinedIn", "getWithDefinedIn()Z", 0), com.discord.chat.presentation.list.a.p(k.class, "withSourceFileForTopLevel", "getWithSourceFileForTopLevel()Z", 0), com.discord.chat.presentation.list.a.p(k.class, "modifiers", "getModifiers()Ljava/util/Set;", 0), com.discord.chat.presentation.list.a.p(k.class, "startFromName", "getStartFromName()Z", 0), com.discord.chat.presentation.list.a.p(k.class, "startFromDeclarationKeyword", "getStartFromDeclarationKeyword()Z", 0), com.discord.chat.presentation.list.a.p(k.class, "debugMode", "getDebugMode()Z", 0), com.discord.chat.presentation.list.a.p(k.class, "classWithPrimaryConstructor", "getClassWithPrimaryConstructor()Z", 0), com.discord.chat.presentation.list.a.p(k.class, "verbose", "getVerbose()Z", 0), com.discord.chat.presentation.list.a.p(k.class, "unitReturnType", "getUnitReturnType()Z", 0), com.discord.chat.presentation.list.a.p(k.class, "withoutReturnType", "getWithoutReturnType()Z", 0), com.discord.chat.presentation.list.a.p(k.class, "enhancedTypes", "getEnhancedTypes()Z", 0), com.discord.chat.presentation.list.a.p(k.class, "normalizedVisibilities", "getNormalizedVisibilities()Z", 0), com.discord.chat.presentation.list.a.p(k.class, "renderDefaultVisibility", "getRenderDefaultVisibility()Z", 0), com.discord.chat.presentation.list.a.p(k.class, "renderDefaultModality", "getRenderDefaultModality()Z", 0), com.discord.chat.presentation.list.a.p(k.class, "renderConstructorDelegation", "getRenderConstructorDelegation()Z", 0), com.discord.chat.presentation.list.a.p(k.class, "renderPrimaryConstructorParametersAsProperties", "getRenderPrimaryConstructorParametersAsProperties()Z", 0), com.discord.chat.presentation.list.a.p(k.class, "actualPropertiesInPrimaryConstructor", "getActualPropertiesInPrimaryConstructor()Z", 0), com.discord.chat.presentation.list.a.p(k.class, "uninferredTypeParameterAsName", "getUninferredTypeParameterAsName()Z", 0), com.discord.chat.presentation.list.a.p(k.class, "includePropertyConstant", "getIncludePropertyConstant()Z", 0), com.discord.chat.presentation.list.a.p(k.class, "propertyConstantRenderer", "getPropertyConstantRenderer()Lkotlin/jvm/functions/Function1;", 0), com.discord.chat.presentation.list.a.p(k.class, "withoutTypeParameters", "getWithoutTypeParameters()Z", 0), com.discord.chat.presentation.list.a.p(k.class, "withoutSuperTypes", "getWithoutSuperTypes()Z", 0), com.discord.chat.presentation.list.a.p(k.class, "typeNormalizer", "getTypeNormalizer()Lkotlin/jvm/functions/Function1;", 0), com.discord.chat.presentation.list.a.p(k.class, "defaultParameterValueRenderer", "getDefaultParameterValueRenderer()Lkotlin/jvm/functions/Function1;", 0), com.discord.chat.presentation.list.a.p(k.class, "secondaryConstructorsAsPrimary", "getSecondaryConstructorsAsPrimary()Z", 0), com.discord.chat.presentation.list.a.p(k.class, "overrideRenderingPolicy", "getOverrideRenderingPolicy()Lorg/jetbrains/kotlin/renderer/OverrideRenderingPolicy;", 0), com.discord.chat.presentation.list.a.p(k.class, "valueParametersHandler", "getValueParametersHandler()Lorg/jetbrains/kotlin/renderer/DescriptorRenderer$ValueParametersHandler;", 0), com.discord.chat.presentation.list.a.p(k.class, "textFormat", "getTextFormat()Lorg/jetbrains/kotlin/renderer/RenderingFormat;", 0), com.discord.chat.presentation.list.a.p(k.class, "parameterNameRenderingPolicy", "getParameterNameRenderingPolicy()Lorg/jetbrains/kotlin/renderer/ParameterNameRenderingPolicy;", 0), com.discord.chat.presentation.list.a.p(k.class, "receiverAfterName", "getReceiverAfterName()Z", 0), com.discord.chat.presentation.list.a.p(k.class, "renderCompanionObjectName", "getRenderCompanionObjectName()Z", 0), com.discord.chat.presentation.list.a.p(k.class, "propertyAccessorRenderingPolicy", "getPropertyAccessorRenderingPolicy()Lorg/jetbrains/kotlin/renderer/PropertyAccessorRenderingPolicy;", 0), com.discord.chat.presentation.list.a.p(k.class, "renderDefaultAnnotationArguments", "getRenderDefaultAnnotationArguments()Z", 0), com.discord.chat.presentation.list.a.p(k.class, "eachAnnotationOnNewLine", "getEachAnnotationOnNewLine()Z", 0), com.discord.chat.presentation.list.a.p(k.class, "excludedAnnotationClasses", "getExcludedAnnotationClasses()Ljava/util/Set;", 0), com.discord.chat.presentation.list.a.p(k.class, "excludedTypeAnnotationClasses", "getExcludedTypeAnnotationClasses()Ljava/util/Set;", 0), com.discord.chat.presentation.list.a.p(k.class, "annotationFilter", "getAnnotationFilter()Lkotlin/jvm/functions/Function1;", 0), com.discord.chat.presentation.list.a.p(k.class, "annotationArgumentsRenderingPolicy", "getAnnotationArgumentsRenderingPolicy()Lorg/jetbrains/kotlin/renderer/AnnotationArgumentsRenderingPolicy;", 0), com.discord.chat.presentation.list.a.p(k.class, "alwaysRenderModifiers", "getAlwaysRenderModifiers()Z", 0), com.discord.chat.presentation.list.a.p(k.class, "renderConstructorKeyword", "getRenderConstructorKeyword()Z", 0), com.discord.chat.presentation.list.a.p(k.class, "renderUnabbreviatedType", "getRenderUnabbreviatedType()Z", 0), com.discord.chat.presentation.list.a.p(k.class, "renderTypeExpansions", "getRenderTypeExpansions()Z", 0), com.discord.chat.presentation.list.a.p(k.class, "renderAbbreviatedTypeComments", "getRenderAbbreviatedTypeComments()Z", 0), com.discord.chat.presentation.list.a.p(k.class, "includeAdditionalModifiers", "getIncludeAdditionalModifiers()Z", 0), com.discord.chat.presentation.list.a.p(k.class, "parameterNamesInFunctionalTypes", "getParameterNamesInFunctionalTypes()Z", 0), com.discord.chat.presentation.list.a.p(k.class, "renderFunctionContracts", "getRenderFunctionContracts()Z", 0), com.discord.chat.presentation.list.a.p(k.class, "presentableUnresolvedTypes", "getPresentableUnresolvedTypes()Z", 0), com.discord.chat.presentation.list.a.p(k.class, "boldOnlyForNamesInHtml", "getBoldOnlyForNamesInHtml()Z", 0), com.discord.chat.presentation.list.a.p(k.class, "informativeErrorType", "getInformativeErrorType()Z", 0)};
    public final tm.e A;
    public final tm.e B;
    public final tm.e C;
    public final tm.e D;
    public final tm.e E;
    public final tm.e F;
    public final tm.e G;
    public final tm.e H;
    public final tm.e I;
    public final tm.e J;
    public final tm.e K;
    public final tm.e L;
    public final tm.e M;
    public final tm.e N;
    public final tm.e O;
    public final tm.e P;
    public final tm.e Q;
    public final tm.e R;
    public final tm.e S;
    public final tm.e T;
    public final tm.e U;
    public final tm.e V;
    public final tm.e W;
    public final tm.e X;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f22437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tm.e f22438b = new tm.e(b.f22412d, this);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tm.e f22439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final tm.e f22440d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final tm.e f22441e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final tm.e f22442f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final tm.e f22443g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final tm.e f22444h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final tm.e f22445i;
    public final tm.e j;
    public final tm.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final tm.e f22446l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final tm.e f22447m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final tm.e f22448n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final tm.e f22449o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final tm.e f22450p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final tm.e f22451q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final tm.e f22452r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final tm.e f22453s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final tm.e f22454t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final tm.e f22455u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final tm.e f22456v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final tm.e f22457w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final tm.e f22458x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final tm.e f22459y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final tm.e f22460z;

    public k() {
        Boolean bool = Boolean.TRUE;
        this.f22439c = new tm.e(bool, this);
        this.f22440d = new tm.e(bool, this);
        this.f22441e = new tm.e(i.f22430e, this);
        Boolean bool2 = Boolean.FALSE;
        this.f22442f = new tm.e(bool2, this);
        this.f22443g = new tm.e(bool2, this);
        this.f22444h = new tm.e(bool2, this);
        this.f22445i = new tm.e(bool2, this);
        this.j = new tm.e(bool2, this);
        this.k = new tm.e(bool, this);
        this.f22446l = new tm.e(bool2, this);
        this.f22447m = new tm.e(bool2, this);
        this.f22448n = new tm.e(bool2, this);
        this.f22449o = new tm.e(bool, this);
        this.f22450p = new tm.e(bool, this);
        this.f22451q = new tm.e(bool2, this);
        this.f22452r = new tm.e(bool2, this);
        this.f22453s = new tm.e(bool2, this);
        this.f22454t = new tm.e(bool2, this);
        this.f22455u = new tm.e(bool2, this);
        this.f22456v = new tm.e((Object) null, this);
        this.f22457w = new tm.e(bool2, this);
        this.f22458x = new tm.e(bool2, this);
        this.f22459y = new tm.e(d.M, this);
        this.f22460z = new tm.e(d.N, this);
        this.A = new tm.e(bool, this);
        this.B = new tm.e(n.f22464e, this);
        this.C = new tm.e(e.f22421a, this);
        this.D = new tm.e(s.f22473d, this);
        this.E = new tm.e(o.f22466d, this);
        this.F = new tm.e(bool2, this);
        this.G = new tm.e(bool2, this);
        this.H = new tm.e(p.f22470d, this);
        this.I = new tm.e(bool2, this);
        this.J = new tm.e(bool2, this);
        this.K = new tm.e(p0.f14661d, this);
        this.L = new tm.e(l.f22461a, this);
        this.M = new tm.e((Object) null, this);
        this.N = new tm.e(a.NO_ARGUMENTS, this);
        this.O = new tm.e(bool2, this);
        this.P = new tm.e(bool, this);
        this.Q = new tm.e(bool, this);
        this.R = new tm.e(bool2, this);
        this.S = new tm.e(bool2, this);
        this.T = new tm.e(bool, this);
        this.U = new tm.e(bool, this);
        this.V = new tm.e(bool2, this);
        this.W = new tm.e(bool2, this);
        this.X = new tm.e(bool, this);
    }

    @Override // wp.j
    public final void a() {
        this.F.setValue(this, Y[30], Boolean.TRUE);
    }

    @Override // wp.j
    public final void b() {
        this.f22444h.setValue(this, Y[6], Boolean.TRUE);
    }

    @Override // wp.j
    public final void c() {
        this.G.setValue(this, Y[31], Boolean.TRUE);
    }

    @Override // wp.j
    public final void d(Set set) {
        Intrinsics.checkNotNullParameter(set, "<set-?>");
        this.f22441e.setValue(this, Y[3], set);
    }

    @Override // wp.j
    public final void e(LinkedHashSet linkedHashSet) {
        Intrinsics.checkNotNullParameter(linkedHashSet, "<set-?>");
        this.L.setValue(this, Y[36], linkedHashSet);
    }

    @Override // wp.j
    public final void f() {
        this.f22457w.setValue(this, Y[21], Boolean.TRUE);
    }

    @Override // wp.j
    public final void g() {
        this.f22442f.setValue(this, Y[4], Boolean.TRUE);
    }

    @Override // wp.j
    public final void h() {
        this.f22439c.setValue(this, Y[1], Boolean.FALSE);
    }

    @Override // wp.j
    public final void i(c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f22438b.setValue(this, Y[0], cVar);
    }

    @Override // wp.j
    public final void j(o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "<set-?>");
        this.E.setValue(this, Y[29], oVar);
    }

    @Override // wp.j
    public final Set k() {
        return (Set) this.L.getValue(this, Y[36]);
    }

    @Override // wp.j
    public final void l() {
        q qVar = s.f22474e;
        Intrinsics.checkNotNullParameter(qVar, "<set-?>");
        this.D.setValue(this, Y[28], qVar);
    }

    @Override // wp.j
    public final void m() {
        this.f22458x.setValue(this, Y[22], Boolean.TRUE);
    }

    public final boolean n() {
        return ((Boolean) this.f22444h.getValue(this, Y[6])).booleanValue();
    }
}
