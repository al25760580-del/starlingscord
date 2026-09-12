package po;

import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f18160a = new ConcurrentHashMap();

    public static final ap.e a(Class cls) {
        xo.b bVarK;
        xo.d dVarK;
        Intrinsics.checkNotNullParameter(cls, "<this>");
        ClassLoader classLoader = bp.c.d(cls);
        b2 b2Var = new b2(classLoader);
        ConcurrentHashMap concurrentHashMap = f18160a;
        WeakReference weakReference = (WeakReference) concurrentHashMap.get(b2Var);
        if (weakReference != null) {
            ap.e eVar = (ap.e) weakReference.get();
            if (eVar != null) {
                return eVar;
            }
            concurrentHashMap.remove(b2Var, weakReference);
        }
        Intrinsics.checkNotNullParameter(classLoader, "classLoader");
        ue.i kotlinClassFinder = new ue.i(classLoader);
        ClassLoader classLoader2 = Unit.class.getClassLoader();
        Intrinsics.checkNotNullExpressionValue(classLoader2, "getClassLoader(...)");
        ue.i finder = new ue.i(classLoader2);
        Intrinsics.checkNotNullParameter(classLoader, "classLoader");
        u4.c javaClassFinder = new u4.c();
        javaClassFinder.f20946d = classLoader;
        String moduleName = "runtime module for " + classLoader;
        ap.d errorReporter = ap.d.f2859b;
        ap.d javaSourceElementFactory = ap.d.f2860c;
        Intrinsics.checkNotNullParameter(kotlinClassFinder, "kotlinClassFinder");
        Intrinsics.checkNotNullParameter(finder, "jvmBuiltInsKotlinClassFinder");
        Intrinsics.checkNotNullParameter(javaClassFinder, "javaClassFinder");
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        Intrinsics.checkNotNullParameter(javaSourceElementFactory, "javaSourceElementFactory");
        kq.l storageManager = new kq.l("DeserializationComponentsForJava.ModuleData");
        uo.h hVar = uo.h.f21219d;
        uo.j jVar = new uo.j(storageManager);
        up.e eVarG = up.e.g("<" + moduleName + '>');
        Intrinsics.checkNotNullExpressionValue(eVarG, "special(...)");
        yo.z moduleDescriptor = new yo.z(eVarG, storageManager, jVar, 56);
        kq.n nVar = storageManager.f14789a;
        nVar.lock();
        try {
            if (jVar.f20343a != null) {
                throw new AssertionError("Built-ins module is already set: " + jVar.f20343a + " (attempting to reset to " + moduleDescriptor + ")");
            }
            jVar.f20343a = moduleDescriptor;
            nVar.unlock();
            Intrinsics.checkNotNullParameter(moduleDescriptor, "moduleDescriptor");
            so.l computation = new so.l(moduleDescriptor, 1);
            Intrinsics.checkNotNullParameter(computation, "computation");
            jVar.f21223f = computation;
            np.e deserializedDescriptorResolver = new np.e();
            u4.b singleModuleClassResolver = new u4.b(12);
            com.google.firebase.messaging.r notFoundClasses = new com.google.firebase.messaging.r(storageManager, moduleDescriptor);
            b2 b2Var2 = b2Var;
            np.f packagePartProvider = np.f.f16999d;
            Intrinsics.checkNotNullParameter(javaClassFinder, "javaClassFinder");
            Intrinsics.checkNotNullParameter(moduleDescriptor, "module");
            ConcurrentHashMap concurrentHashMap2 = concurrentHashMap;
            Intrinsics.checkNotNullParameter(storageManager, "storageManager");
            Intrinsics.checkNotNullParameter(notFoundClasses, "notFoundClasses");
            Intrinsics.checkNotNullParameter(kotlinClassFinder, "reflectKotlinClassFinder");
            Intrinsics.checkNotNullParameter(deserializedDescriptorResolver, "deserializedDescriptorResolver");
            Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
            Intrinsics.checkNotNullParameter(javaSourceElementFactory, "javaSourceElementFactory");
            Intrinsics.checkNotNullParameter(singleModuleClassResolver, "singleModuleClassResolver");
            Intrinsics.checkNotNullParameter(packagePartProvider, "packagePartProvider");
            fp.i DO_NOTHING = fp.i.f9349c;
            Intrinsics.checkNotNullExpressionValue(DO_NOTHING, "DO_NOTHING");
            fp.i EMPTY = fp.i.f9348b;
            Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
            fp.i iVar = fp.i.f9347a;
            kotlin.collections.n0 n0Var = kotlin.collections.n0.f14659d;
            k8.a aVar = new k8.a(storageManager, n0Var);
            vo.o0 o0Var = vo.o0.f21822i;
            so.n nVar2 = new so.n(moduleDescriptor, notFoundClasses);
            ep.v vVar = ep.v.f8595d;
            ep.b bVar = new ep.b(vVar);
            hp.b javaResolverSettings = hp.b.f10979d;
            Intrinsics.checkNotNullParameter(javaResolverSettings, "javaResolverSettings");
            mp.c typeEnhancement = new mp.c();
            Intrinsics.checkNotNullParameter(typeEnhancement, "typeEnhancement");
            mp.o oVar = new mp.o();
            mq.k.f16033b.getClass();
            mq.l kotlinTypeChecker = mq.j.f16032b;
            hp.d packageFragmentProvider = new hp.d(new hp.a(storageManager, javaClassFinder, kotlinClassFinder, deserializedDescriptorResolver, DO_NOTHING, errorReporter, iVar, aVar, javaSourceElementFactory, singleModuleClassResolver, packagePartProvider, o0Var, dp.b.f7692a, moduleDescriptor, nVar2, bVar, oVar, ep.m.f8571a, javaResolverSettings, kotlinTypeChecker, vVar, new np.f()));
            rp.e metadataVersion = rp.e.f19536g;
            Intrinsics.checkNotNullParameter(moduleDescriptor, "module");
            Intrinsics.checkNotNullParameter(storageManager, "storageManager");
            Intrinsics.checkNotNullParameter(notFoundClasses, "notFoundClasses");
            Intrinsics.checkNotNullParameter(packageFragmentProvider, "lazyJavaPackageFragmentProvider");
            Intrinsics.checkNotNullParameter(kotlinClassFinder, "reflectKotlinClassFinder");
            Intrinsics.checkNotNullParameter(deserializedDescriptorResolver, "deserializedDescriptorResolver");
            Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
            Intrinsics.checkNotNullParameter(metadataVersion, "metadataVersion");
            e4.r classDataFinder = new e4.r(deserializedDescriptorResolver, kotlinClassFinder);
            Intrinsics.checkNotNullParameter(moduleDescriptor, "module");
            Intrinsics.checkNotNullParameter(notFoundClasses, "notFoundClasses");
            Intrinsics.checkNotNullParameter(storageManager, "storageManager");
            Intrinsics.checkNotNullParameter(kotlinClassFinder, "kotlinClassFinder");
            Intrinsics.checkNotNullParameter(metadataVersion, "metadataVersion");
            Intrinsics.checkNotNullParameter(moduleDescriptor, "module");
            Intrinsics.checkNotNullParameter(notFoundClasses, "notFoundClasses");
            Intrinsics.checkNotNullParameter(storageManager, "storageManager");
            Intrinsics.checkNotNullParameter(kotlinClassFinder, "kotlinClassFinder");
            Intrinsics.checkNotNullParameter(storageManager, "storageManager");
            Intrinsics.checkNotNullParameter(kotlinClassFinder, "kotlinClassFinder");
            Intrinsics.checkNotNullParameter(kotlinClassFinder, "kotlinClassFinder");
            af.c annotationAndConstantLoader = new af.c();
            annotationAndConstantLoader.f393d = kotlinClassFinder;
            annotationAndConstantLoader.f394e = storageManager.c(new bp.i(16, annotationAndConstantLoader));
            annotationAndConstantLoader.f395i = moduleDescriptor;
            annotationAndConstantLoader.f396v = notFoundClasses;
            annotationAndConstantLoader.f397w = new io.sentry.internal.debugmeta.c(moduleDescriptor, notFoundClasses);
            annotationAndConstantLoader.f398x = rp.e.f19536g;
            Intrinsics.checkNotNullParameter(metadataVersion, "<set-?>");
            annotationAndConstantLoader.f398x = metadataVersion;
            hq.k deserializationConfiguration = hq.k.f11037c;
            List translators = kotlin.collections.c0.c(lq.n.f15228a);
            Intrinsics.checkNotNullParameter(translators, "translators");
            u4.c typeAttributeTranslators = new u4.c();
            typeAttributeTranslators.f20946d = translators;
            hq.k configuration = hq.k.f11037c;
            ap.d errorReporter2 = ap.d.f2859b;
            Intrinsics.checkNotNullParameter(storageManager, "storageManager");
            Intrinsics.checkNotNullParameter(moduleDescriptor, "moduleDescriptor");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            Intrinsics.checkNotNullParameter(classDataFinder, "classDataFinder");
            Intrinsics.checkNotNullParameter(annotationAndConstantLoader, "annotationAndConstantLoader");
            Intrinsics.checkNotNullParameter(packageFragmentProvider, "packageFragmentProvider");
            Intrinsics.checkNotNullParameter(notFoundClasses, "notFoundClasses");
            Intrinsics.checkNotNullParameter(errorReporter2, "errorReporter");
            dp.b lookupTracker = dp.b.f7692a;
            Intrinsics.checkNotNullParameter(lookupTracker, "lookupTracker");
            hq.k contractDeserializer = hq.i.f11018a;
            Intrinsics.checkNotNullParameter(contractDeserializer, "contractDeserializer");
            Intrinsics.checkNotNullParameter(kotlinTypeChecker, "kotlinTypeChecker");
            Intrinsics.checkNotNullParameter(typeAttributeTranslators, "typeAttributeTranslators");
            ue.i deserializationComponentsForJava = new ue.i();
            so.i iVar2 = moduleDescriptor.f23495w;
            uo.j jVar2 = iVar2 instanceof uo.j ? (uo.j) iVar2 : null;
            np.f fVar = np.f.f16997b;
            kotlin.collections.n0 n0Var2 = kotlin.collections.n0.f14659d;
            if (jVar2 == null || (bVarK = jVar2.K()) == null) {
                bVarK = xo.a.f22990b;
            }
            xo.b bVar2 = bVarK;
            if (jVar2 == null || (dVarK = jVar2.K()) == null) {
                dVarK = xo.a.f22992d;
            }
            deserializationComponentsForJava.f21117d = new hq.j(storageManager, moduleDescriptor, classDataFinder, annotationAndConstantLoader, packageFragmentProvider, errorReporter2, fVar, n0Var2, notFoundClasses, bVar2, dVarK, tp.g.f20880a, kotlinTypeChecker, new k8.a(storageManager, n0Var2), (List) typeAttributeTranslators.f20946d, hq.k.f11040f);
            hq.j jVar3 = (hq.j) deserializationComponentsForJava.f21117d;
            Intrinsics.checkNotNullParameter(deserializationComponentsForJava, "components");
            Intrinsics.checkNotNullParameter(jVar3, "<set-?>");
            deserializedDescriptorResolver.f16996a = jVar3;
            Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
            fp.i javaResolverCache = fp.i.f9348b;
            Intrinsics.checkNotNullParameter(packageFragmentProvider, "packageFragmentProvider");
            Intrinsics.checkNotNullParameter(javaResolverCache, "javaResolverCache");
            u4.c cVar = new u4.c();
            cVar.f20946d = packageFragmentProvider;
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            singleModuleClassResolver.f20945e = cVar;
            uo.o additionalClassPartsProvider = jVar.K();
            uo.o platformDependentDeclarationFilter = jVar.K();
            k8.a samConversionResolver = new k8.a(storageManager, n0Var);
            Intrinsics.checkNotNullParameter(storageManager, "storageManager");
            Intrinsics.checkNotNullParameter(finder, "finder");
            Intrinsics.checkNotNullParameter(moduleDescriptor, "moduleDescriptor");
            Intrinsics.checkNotNullParameter(notFoundClasses, "notFoundClasses");
            Intrinsics.checkNotNullParameter(additionalClassPartsProvider, "additionalClassPartsProvider");
            Intrinsics.checkNotNullParameter(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
            Intrinsics.checkNotNullParameter(deserializationConfiguration, "deserializationConfiguration");
            Intrinsics.checkNotNullParameter(kotlinTypeChecker, "kotlinTypeChecker");
            Intrinsics.checkNotNullParameter(samConversionResolver, "samConversionResolver");
            uo.q qVar = new uo.q(storageManager, finder, moduleDescriptor);
            u4.c cVar2 = new u4.c((vo.h0) qVar);
            iq.a aVar2 = iq.a.f13401m;
            e4.r rVar = new e4.r(moduleDescriptor, notFoundClasses, aVar2);
            Intrinsics.checkNotNullExpressionValue(hq.m.f11044a, "DO_NOTHING");
            hq.j jVar4 = new hq.j(storageManager, moduleDescriptor, cVar2, rVar, qVar, kotlin.collections.d0.g(new to.a(storageManager, moduleDescriptor), new uo.g(storageManager, moduleDescriptor)), notFoundClasses, additionalClassPartsProvider, platformDependentDeclarationFilter, aVar2.f10172a, kotlinTypeChecker, samConversionResolver, 262144);
            Intrinsics.checkNotNullParameter(jVar4, "<set-?>");
            qVar.f21247c = jVar4;
            moduleDescriptor.B0(moduleDescriptor);
            yo.k providerForModuleContent = new yo.k(kotlin.collections.d0.g(packageFragmentProvider, qVar), "CompositeProvider@RuntimeModuleData for " + moduleDescriptor);
            Intrinsics.checkNotNullParameter(providerForModuleContent, "providerForModuleContent");
            moduleDescriptor.F = providerForModuleContent;
            Intrinsics.checkNotNullParameter(deserializationComponentsForJava, "deserializationComponentsForJava");
            Intrinsics.checkNotNullParameter(deserializedDescriptorResolver, "deserializedDescriptorResolver");
            ap.e eVar2 = new ap.e(jVar3, new e4.m(deserializedDescriptorResolver, kotlinClassFinder));
            while (true) {
                b2 b2Var3 = b2Var2;
                ConcurrentHashMap concurrentHashMap3 = concurrentHashMap2;
                WeakReference weakReference2 = (WeakReference) concurrentHashMap3.putIfAbsent(b2Var3, new WeakReference(eVar2));
                if (weakReference2 == null) {
                    return eVar2;
                }
                ap.e eVar3 = (ap.e) weakReference2.get();
                if (eVar3 != null) {
                    return eVar3;
                }
                concurrentHashMap3.remove(b2Var3, weakReference2);
                b2Var2 = b2Var3;
                concurrentHashMap2 = concurrentHashMap3;
            }
        } catch (Throwable th2) {
            try {
                storageManager.f14790b.a(th2);
                throw null;
            } catch (Throwable th3) {
                nVar.unlock();
                throw th3;
            }
        }
    }
}
