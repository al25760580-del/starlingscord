package hq;

import java.util.List;
import java.util.Set;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;
import vo.e0;
import vo.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kq.l f11019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vo.z f11020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f11021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f11022d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f11023e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h0 f11024f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k f11025g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m f11026h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final dp.b f11027i;
    public final n j;
    public final Iterable k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final com.google.firebase.messaging.r f11028l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final k f11029m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final xo.b f11030n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final xo.d f11031o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final vp.g f11032p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final mq.k f11033q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List f11034r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final l f11035s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final h f11036t;

    public j(kq.l storageManager, vo.z moduleDescriptor, f classDataFinder, b annotationAndConstantLoader, h0 packageFragmentProvider, m errorReporter, n flexibleTypeDeserializer, Iterable fictitiousClassDescriptorFactories, com.google.firebase.messaging.r notFoundClasses, xo.b additionalClassPartsProvider, xo.d platformDependentDeclarationFilter, vp.g extensionRegistryLite, mq.k kotlinTypeChecker, k8.a samConversionResolver, List typeAttributeTranslators, l enumEntriesDeserializationSupport) {
        k configuration = k.f11037c;
        k localClassifierTypeSettings = k.f11041g;
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(moduleDescriptor, "moduleDescriptor");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(classDataFinder, "classDataFinder");
        Intrinsics.checkNotNullParameter(annotationAndConstantLoader, "annotationAndConstantLoader");
        Intrinsics.checkNotNullParameter(packageFragmentProvider, "packageFragmentProvider");
        Intrinsics.checkNotNullParameter(localClassifierTypeSettings, "localClassifierTypeSettings");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        dp.b lookupTracker = dp.b.f7692a;
        Intrinsics.checkNotNullParameter(lookupTracker, "lookupTracker");
        Intrinsics.checkNotNullParameter(flexibleTypeDeserializer, "flexibleTypeDeserializer");
        Intrinsics.checkNotNullParameter(fictitiousClassDescriptorFactories, "fictitiousClassDescriptorFactories");
        Intrinsics.checkNotNullParameter(notFoundClasses, "notFoundClasses");
        k contractDeserializer = i.f11018a;
        Intrinsics.checkNotNullParameter(contractDeserializer, "contractDeserializer");
        Intrinsics.checkNotNullParameter(additionalClassPartsProvider, "additionalClassPartsProvider");
        Intrinsics.checkNotNullParameter(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        Intrinsics.checkNotNullParameter(extensionRegistryLite, "extensionRegistryLite");
        Intrinsics.checkNotNullParameter(kotlinTypeChecker, "kotlinTypeChecker");
        Intrinsics.checkNotNullParameter(samConversionResolver, "samConversionResolver");
        Intrinsics.checkNotNullParameter(typeAttributeTranslators, "typeAttributeTranslators");
        Intrinsics.checkNotNullParameter(enumEntriesDeserializationSupport, "enumEntriesDeserializationSupport");
        this.f11019a = storageManager;
        this.f11020b = moduleDescriptor;
        this.f11021c = configuration;
        this.f11022d = classDataFinder;
        this.f11023e = annotationAndConstantLoader;
        this.f11024f = packageFragmentProvider;
        this.f11025g = localClassifierTypeSettings;
        this.f11026h = errorReporter;
        this.f11027i = lookupTracker;
        this.j = flexibleTypeDeserializer;
        this.k = fictitiousClassDescriptorFactories;
        this.f11028l = notFoundClasses;
        this.f11029m = contractDeserializer;
        this.f11030n = additionalClassPartsProvider;
        this.f11031o = platformDependentDeclarationFilter;
        this.f11032p = extensionRegistryLite;
        this.f11033q = kotlinTypeChecker;
        this.f11034r = typeAttributeTranslators;
        this.f11035s = enumEntriesDeserializationSupport;
        this.f11036t = new h(this);
    }

    public final bc.k a(e0 descriptor, rp.f nameResolver, pf.b typeTable, rp.g versionRequirementTable, rp.a metadataVersion, jq.l lVar) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        Intrinsics.checkNotNullParameter(versionRequirementTable, "versionRequirementTable");
        Intrinsics.checkNotNullParameter(metadataVersion, "metadataVersion");
        return new bc.k(this, nameResolver, descriptor, typeTable, versionRequirementTable, metadataVersion, lVar, null, n0.f14659d);
    }

    public final vo.f b(up.b classId) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        Set set = h.f11015c;
        return this.f11036t.a(classId, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public j(kq.l lVar, vo.z zVar, u4.c cVar, e4.r rVar, h0 h0Var, Iterable iterable, com.google.firebase.messaging.r rVar2, xo.b bVar, xo.d dVar, vp.g gVar, mq.k kVar, k8.a aVar, int i7) {
        mq.k kVar2;
        k kVar3 = k.f11039e;
        k kVar4 = k.f11040f;
        if ((i7 & 65536) != 0) {
            mq.k.f16033b.getClass();
            kVar2 = mq.j.f16032b;
        } else {
            kVar2 = kVar;
        }
        this(lVar, zVar, cVar, rVar, h0Var, m.f11044a, kVar3, iterable, rVar2, bVar, dVar, gVar, kVar2, aVar, kotlin.collections.c0.c(lq.n.f15228a), (i7 & 524288) != 0 ? k.f11038d : kVar4);
    }
}
