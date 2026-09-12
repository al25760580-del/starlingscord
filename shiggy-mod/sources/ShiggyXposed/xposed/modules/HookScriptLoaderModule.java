package ShiggyXposed.xposed.modules;

import ShiggyXposed.xposed.Constants;
import ShiggyXposed.xposed.Module;
import ShiggyXposed.xposed.Utils;
import android.content.res.AssetManager;
import android.content.res.XModuleResources;
import android.content.res.XResources;
import androidx.constraintlayout.widget.ConstraintLayout;
import de.robv.android.xposed.IXposedHookZygoteInit;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: compiled from: HookScriptLoaderModule.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J%\u0010\u0013\u001a\f\u0012\b\u0012\u00060\u0015R\u00020\u00160\u00142\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001c\u0010\u001b\u001a\u00020\r*\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"LShiggyXposed/xposed/modules/HookScriptLoaderModule;", "LShiggyXposed/xposed/Module;", "<init>", "()V", "preloadsDir", "Ljava/io/File;", "mainScript", "modulePath", "", "resources", "Landroid/content/res/XModuleResources;", "PRELOADS_DIR", "onInit", "", "startupParam", "Lde/robv/android/xposed/IXposedHookZygoteInit$StartupParam;", "onLoad", "packageParam", "Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;", "hook", "Lkotlin/Result;", "Lde/robv/android/xposed/XC_MethodHook$Unhook;", "Lde/robv/android/xposed/XC_MethodHook;", "instance", "Ljava/lang/Class;", "hook-IoAF18A", "(Ljava/lang/Class;)Ljava/lang/Object;", "runCustomScripts", "LShiggyXposed/xposed/Module$HookScope;", "loadScriptFromFile", "Ljava/lang/reflect/Method;", "loadScriptFromAssets", "app_release"}, k = 1, mv = {2, 1, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class HookScriptLoaderModule extends Module {
    public static final HookScriptLoaderModule INSTANCE = new HookScriptLoaderModule();
    public static final String PRELOADS_DIR = "preloads";
    private static File mainScript;
    private static String modulePath;
    private static File preloadsDir;
    private static XModuleResources resources;

    private HookScriptLoaderModule() {
    }

    @Override // ShiggyXposed.xposed.Module
    public void onInit(IXposedHookZygoteInit.StartupParam startupParam) {
        Intrinsics.checkNotNullParameter(startupParam, "startupParam");
        modulePath = startupParam.modulePath;
    }

    @Override // ShiggyXposed.xposed.Module
    public void onLoad(XC_LoadPackage.LoadPackageParam packageParam) {
        Intrinsics.checkNotNullParameter(packageParam, "packageParam");
        File file = new File(packageParam.appInfo.dataDir, Constants.CACHE_DIR);
        HookScriptLoaderModule hookScriptLoaderModule = INSTANCE;
        hookScriptLoaderModule.asDir(file);
        File file2 = new File(packageParam.appInfo.dataDir, Constants.FILES_DIR);
        hookScriptLoaderModule.asDir(file2);
        File file3 = new File(file2, PRELOADS_DIR);
        hookScriptLoaderModule.asDir(file3);
        preloadsDir = file3;
        File file4 = new File(file, Constants.MAIN_SCRIPT_FILE);
        hookScriptLoaderModule.asFile(file4);
        mainScript = file4;
        List<String> listListOf = CollectionsKt.listOf((Object[]) new String[]{"com.facebook.react.runtime.ReactInstance$loadJSBundle$1", "com.facebook.react.runtime.ReactInstance$1", "com.facebook.react.bridge.CatalystInstanceImpl"});
        ArrayList arrayList = new ArrayList();
        for (String str : listListOf) {
            HookScriptLoaderModule hookScriptLoaderModule2 = INSTANCE;
            ClassLoader classLoader = packageParam.classLoader;
            Intrinsics.checkNotNullExpressionValue(classLoader, "classLoader");
            Class<?> clsSafeLoadClass = hookScriptLoaderModule2.safeLoadClass(classLoader, str);
            if (clsSafeLoadClass != null) {
                arrayList.add(clsSafeLoadClass);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            INSTANCE.m9hookIoAF18A((Class) it.next());
        }
    }

    /* JADX INFO: renamed from: hook-IoAF18A, reason: not valid java name */
    private final Object m9hookIoAF18A(Class<?> instance) {
        Object objM453constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            HookScriptLoaderModule hookScriptLoaderModule = this;
            final Method method = method(instance, "loadScriptFromAssets", AssetManager.class, String.class, Boolean.TYPE);
            final Method method2 = method(instance, "loadScriptFromFile", String.class, String.class, Boolean.TYPE);
            hook(method, new Function1() { // from class: ShiggyXposed.xposed.modules.HookScriptLoaderModule$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return HookScriptLoaderModule.hook_IoAF18A$lambda$11$lambda$8(this.f$0, method2, method, (Module.MethodHookBuilder) obj);
                }
            });
            objM453constructorimpl = Result.m453constructorimpl(hook(method2, new Function1() { // from class: ShiggyXposed.xposed.modules.HookScriptLoaderModule$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return HookScriptLoaderModule.hook_IoAF18A$lambda$11$lambda$10(this.f$0, method2, method, (Module.MethodHookBuilder) obj);
                }
            }));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM453constructorimpl = Result.m453constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM456exceptionOrNullimpl = Result.m456exceptionOrNullimpl(objM453constructorimpl);
        if (thM456exceptionOrNullimpl != null) {
            Utils.Log.INSTANCE.e("Failed to hook script loading methods in " + instance.getName() + AbstractJsonLexerKt.COLON, thM456exceptionOrNullimpl);
        }
        return objM453constructorimpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit hook_IoAF18A$lambda$11$lambda$8(final HookScriptLoaderModule hookScriptLoaderModule, final Method method, final Method method2, Module.MethodHookBuilder hook) {
        Intrinsics.checkNotNullParameter(hook, "$this$hook");
        hook.before(new Function1() { // from class: ShiggyXposed.xposed.modules.HookScriptLoaderModule$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HookScriptLoaderModule.hook_IoAF18A$lambda$11$lambda$8$lambda$7(this.f$0, method, method2, (Module.HookScope) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit hook_IoAF18A$lambda$11$lambda$8$lambda$7(HookScriptLoaderModule hookScriptLoaderModule, Method method, Method method2, Module.HookScope before) throws InterruptedException {
        Intrinsics.checkNotNullParameter(before, "$this$before");
        Utils.Log.INSTANCE.i("Received call to loadScriptFromAssets: " + before.getArgs()[1] + " (sync: " + before.getArgs()[2] + ')');
        hookScriptLoaderModule.runCustomScripts(before, method, method2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit hook_IoAF18A$lambda$11$lambda$10(final HookScriptLoaderModule hookScriptLoaderModule, final Method method, final Method method2, Module.MethodHookBuilder hook) {
        Intrinsics.checkNotNullParameter(hook, "$this$hook");
        hook.before(new Function1() { // from class: ShiggyXposed.xposed.modules.HookScriptLoaderModule$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HookScriptLoaderModule.hook_IoAF18A$lambda$11$lambda$10$lambda$9(this.f$0, method, method2, (Module.HookScope) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit hook_IoAF18A$lambda$11$lambda$10$lambda$9(HookScriptLoaderModule hookScriptLoaderModule, Method method, Method method2, Module.HookScope before) throws InterruptedException {
        Intrinsics.checkNotNullParameter(before, "$this$before");
        Utils.Log.INSTANCE.i("Received call to loadScriptFromFile: " + before.getArgs()[0] + " (sync: " + before.getArgs()[2] + ')');
        hookScriptLoaderModule.runCustomScripts(before, method, method2);
        return Unit.INSTANCE;
    }

    private final void runCustomScripts(final Module.HookScope hookScope, final Method method, Method method2) throws InterruptedException {
        Utils.Log.INSTANCE.i("Running custom scripts...");
        File file = null;
        BuildersKt__BuildersKt.runBlocking$default(null, new AnonymousClass1(null), 1, null);
        final Object obj = hookScope.getArgs()[2];
        Function1 function1 = new Function1() { // from class: ShiggyXposed.xposed.modules.HookScriptLoaderModule$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return HookScriptLoaderModule.runCustomScripts$lambda$13(method, hookScope, obj, (File) obj2);
            }
        };
        try {
            File file2 = mainScript;
            if (file2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mainScript");
                file2 = null;
            }
            if (new File(file2.getParentFile(), "bundle.js.disabled").exists()) {
                Utils.Log.INSTANCE.i("Script loading disabled by marker; skipping preloads, cached bundle and fallback");
                return;
            }
            File file3 = preloadsDir;
            if (file3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("preloadsDir");
                file3 = null;
            }
            Iterator it = SequencesKt.filter(FilesKt.walk$default(file3, null, 1, null), new Function1() { // from class: ShiggyXposed.xposed.modules.HookScriptLoaderModule$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return Boolean.valueOf(HookScriptLoaderModule.runCustomScripts$lambda$14((File) obj2));
                }
            }).iterator();
            while (it.hasNext()) {
                function1.invoke(it.next());
            }
            File file4 = mainScript;
            if (file4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mainScript");
                file4 = null;
            }
            if (file4.exists()) {
                File file5 = mainScript;
                if (file5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mainScript");
                } else {
                    file = file5;
                }
                function1.invoke(file);
                return;
            }
            Utils.Log.INSTANCE.i("Main script does not exist, falling back");
            if (resources == null) {
                String str = modulePath;
                if (str == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("modulePath");
                    str = null;
                }
                resources = XModuleResources.createInstance(str, (XResources) null);
            }
            Method method3 = method2;
            Object thisObject = hookScope.getThisObject();
            File file6 = resources;
            if (file6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("resources");
            } else {
                file = file6;
            }
            XposedBridge.invokeOriginalMethod(method3, thisObject, new Object[]{file.getAssets(), "assets://Shiggy.bundle", obj});
        } catch (Throwable th) {
            Utils.Log.INSTANCE.e("Unable to run scripts:", th);
        }
    }

    /* JADX INFO: renamed from: ShiggyXposed.xposed.modules.HookScriptLoaderModule$runCustomScripts$1, reason: invalid class name */
    /* JADX INFO: compiled from: HookScriptLoaderModule.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "ShiggyXposed.xposed.modules.HookScriptLoaderModule$runCustomScripts$1", f = "HookScriptLoaderModule.kt", i = {}, l = {93, 97}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Object>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Object> continuation) {
            return invoke2(coroutineScope, (Continuation<Object>) continuation);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<Object> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0067, code lost:
        
            if (r11.await(r10) == r0) goto L28;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r10.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.ResultKt.throwOnFailure(r11)
                goto L6a
            L12:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1a:
                kotlin.ResultKt.throwOnFailure(r11)
                return r11
            L1e:
                kotlin.ResultKt.throwOnFailure(r11)
                java.lang.Object r11 = r10.L$0
                r4 = r11
                kotlinx.coroutines.CoroutineScope r4 = (kotlinx.coroutines.CoroutineScope) r4
                ShiggyXposed.xposed.modules.HookScriptLoaderModule$runCustomScripts$1$ready$1 r11 = new ShiggyXposed.xposed.modules.HookScriptLoaderModule$runCustomScripts$1$ready$1
                r1 = 0
                r11.<init>(r1)
                r7 = r11
                kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7
                r8 = 3
                r9 = 0
                r5 = 0
                r6 = 0
                kotlinx.coroutines.Deferred r11 = kotlinx.coroutines.BuildersKt.async$default(r4, r5, r6, r7, r8, r9)
                ShiggyXposed.xposed.modules.UpdaterModule r5 = ShiggyXposed.xposed.modules.UpdaterModule.INSTANCE
                boolean r5 = r5.isCustomUrlEnabled()
                java.io.File r6 = ShiggyXposed.xposed.modules.HookScriptLoaderModule.access$getMainScript$p()
                if (r6 != 0) goto L49
                java.lang.String r6 = "mainScript"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r6)
                r6 = r1
            L49:
                boolean r6 = r6.exists()
                if (r6 == 0) goto L6d
                if (r5 == 0) goto L52
                goto L6d
            L52:
                ShiggyXposed.xposed.Utils$Log r4 = ShiggyXposed.xposed.Utils.Log.INSTANCE
                java.lang.String r5 = "Main script exists, updating in background..."
                r4.i(r5)
                ShiggyXposed.xposed.modules.UpdaterModule r4 = ShiggyXposed.xposed.modules.UpdaterModule.INSTANCE
                ShiggyXposed.xposed.modules.UpdaterModule.downloadScript$default(r4, r1, r3, r3, r1)
                r1 = r10
                kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
                r10.label = r2
                java.lang.Object r11 = r11.await(r1)
                if (r11 != r0) goto L6a
                goto La1
            L6a:
                kotlin.Unit r11 = kotlin.Unit.INSTANCE
                return r11
            L6d:
                if (r5 == 0) goto L72
                java.lang.String r5 = "Custom URL enabled"
                goto L74
            L72:
                java.lang.String r5 = "Main script does not exist"
            L74:
                ShiggyXposed.xposed.Utils$Log r6 = ShiggyXposed.xposed.Utils.Log.INSTANCE
                java.lang.String r7 = ", downloading before load..."
                java.lang.String r5 = r5.concat(r7)
                r6.i(r5)
                ShiggyXposed.xposed.modules.HookScriptLoaderModule$runCustomScripts$1$download$1 r5 = new ShiggyXposed.xposed.modules.HookScriptLoaderModule$runCustomScripts$1$download$1
                r5.<init>(r1)
                r7 = r5
                kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7
                r8 = 3
                r9 = 0
                r5 = 0
                r6 = 0
                kotlinx.coroutines.Deferred r1 = kotlinx.coroutines.BuildersKt.async$default(r4, r5, r6, r7, r8, r9)
                kotlinx.coroutines.Deferred[] r2 = new kotlinx.coroutines.Deferred[r2]
                r4 = 0
                r2[r4] = r11
                r2[r3] = r1
                r11 = r10
                kotlin.coroutines.Continuation r11 = (kotlin.coroutines.Continuation) r11
                r10.label = r3
                java.lang.Object r11 = kotlinx.coroutines.AwaitKt.awaitAll(r2, r11)
                if (r11 != r0) goto La2
            La1:
                return r0
            La2:
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: ShiggyXposed.xposed.modules.HookScriptLoaderModule.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit runCustomScripts$lambda$13(Method method, Module.HookScope hookScope, Object obj, File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        Utils.Log.INSTANCE.i("Loading script: " + file.getAbsolutePath());
        XposedBridge.invokeOriginalMethod(method, hookScope.getThisObject(), new Object[]{file.getAbsolutePath(), file.getAbsolutePath(), obj});
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean runCustomScripts$lambda$14(File it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.isFile();
    }
}
