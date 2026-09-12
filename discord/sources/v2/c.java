package v2;

import a5.i0;
import android.os.Looper;
import androidx.fragment.app.e1;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelStore;
import androidx.loader.app.LoaderManager;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.firebase.messaging.r;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import ue.d;
import ye.l;

/* JADX INFO: loaded from: classes.dex */
public final class c extends LoaderManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f21374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f21375b;

    public c(LifecycleOwner lifecycleOwner, ViewModelStore store) {
        this.f21374a = lifecycleOwner;
        Intrinsics.checkNotNullParameter(store, "store");
        e1 factory = b.f21371d;
        Intrinsics.checkNotNullParameter(factory, "factory");
        t2.a defaultCreationExtras = t2.a.f20587b;
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        r rVar = new r(store, factory, defaultCreationExtras);
        Intrinsics.checkNotNullParameter(b.class, "modelClass");
        Intrinsics.checkNotNullParameter(b.class, "<this>");
        KClass modelClass = Reflection.getOrCreateKotlinClass(b.class);
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        String qualifiedName = modelClass != null ? modelClass.getQualifiedName() : null;
        if (qualifiedName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        this.f21375b = (b) rVar.g("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(qualifiedName), modelClass);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.lifecycle.LifecycleOwner, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.loader.app.LoaderManager
    public final d b(po.d dVar) {
        ?? r5 = this.f21374a;
        b bVar = this.f21375b;
        if (bVar.f21373c) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        a aVar = (a) bVar.f21372b.c(0);
        if (aVar != 0) {
            d dVar2 = aVar.f21368l;
            i0 i0Var = new i0(dVar2, dVar);
            aVar.d(r5, i0Var);
            i0 i0Var2 = aVar.f21370n;
            if (i0Var2 != null) {
                aVar.g(i0Var2);
            }
            aVar.f21369m = r5;
            aVar.f21370n = i0Var;
            return dVar2;
        }
        try {
            bVar.f21373c = true;
            SignInHubActivity signInHubActivity = (SignInHubActivity) dVar.f18079e;
            Set set = l.f23310a;
            synchronized (set) {
            }
            d dVar3 = new d(signInHubActivity, set);
            if (d.class.isMemberClass() && !Modifier.isStatic(d.class.getModifiers())) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + dVar3);
            }
            a aVar2 = new a(dVar3);
            bVar.f21372b.e(0, aVar2);
            bVar.f21373c = false;
            d dVar4 = aVar2.f21368l;
            i0 i0Var3 = new i0(dVar4, dVar);
            aVar2.d(r5, i0Var3);
            i0 i0Var4 = aVar2.f21370n;
            if (i0Var4 != null) {
                aVar2.g(i0Var4);
            }
            aVar2.f21369m = r5;
            aVar2.f21370n = i0Var3;
            return dVar4;
        } catch (Throwable th2) {
            bVar.f21373c = false;
            throw th2;
        }
    }

    public final void c(String str, PrintWriter printWriter) {
        b bVar = this.f21375b;
        if (bVar.f21372b.g() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            for (int i7 = 0; i7 < bVar.f21372b.g(); i7++) {
                a aVar = (a) bVar.f21372b.h(i7);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(bVar.f21372b.d(i7));
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                printWriter.print(str2);
                printWriter.print("mId=");
                printWriter.print(0);
                printWriter.print(" mArgs=");
                printWriter.println((Object) null);
                printWriter.print(str2);
                printWriter.print("mLoader=");
                printWriter.println(aVar.f21368l);
                d dVar = aVar.f21368l;
                String str3 = str2 + "  ";
                dVar.getClass();
                printWriter.print(str3);
                printWriter.print("mId=");
                printWriter.print(0);
                printWriter.print(" mListener=");
                printWriter.println(dVar.f21103a);
                if (dVar.f21104b || dVar.f21107e) {
                    printWriter.print(str3);
                    printWriter.print("mStarted=");
                    printWriter.print(dVar.f21104b);
                    printWriter.print(" mContentChanged=");
                    printWriter.print(dVar.f21107e);
                    printWriter.print(" mProcessingChange=");
                    printWriter.println(false);
                }
                if (dVar.f21105c || dVar.f21106d) {
                    printWriter.print(str3);
                    printWriter.print("mAbandoned=");
                    printWriter.print(dVar.f21105c);
                    printWriter.print(" mReset=");
                    printWriter.println(dVar.f21106d);
                }
                if (dVar.f21109g != null) {
                    printWriter.print(str3);
                    printWriter.print("mTask=");
                    printWriter.print(dVar.f21109g);
                    printWriter.print(" waiting=");
                    dVar.f21109g.getClass();
                    printWriter.println(false);
                }
                if (dVar.f21110h != null) {
                    printWriter.print(str3);
                    printWriter.print("mCancellingTask=");
                    printWriter.print(dVar.f21110h);
                    printWriter.print(" waiting=");
                    dVar.f21110h.getClass();
                    printWriter.println(false);
                }
                if (aVar.f21370n != null) {
                    printWriter.print(str2);
                    printWriter.print("mCallbacks=");
                    printWriter.println(aVar.f21370n);
                    i0 i0Var = aVar.f21370n;
                    i0Var.getClass();
                    printWriter.print(str2 + "  ");
                    printWriter.print("mDeliveredData=");
                    printWriter.println(i0Var.f214e);
                }
                printWriter.print(str2);
                printWriter.print("mData=");
                d dVar2 = aVar.f21368l;
                Object obj = aVar.f2313e;
                Object obj2 = obj != LiveData.k ? obj : null;
                dVar2.getClass();
                StringBuilder sb2 = new StringBuilder(64);
                if (obj2 == null) {
                    sb2.append("null");
                } else {
                    Class<?> cls = obj2.getClass();
                    sb2.append(cls.getSimpleName());
                    sb2.append("{");
                    sb2.append(Integer.toHexString(System.identityHashCode(cls)));
                    sb2.append("}");
                }
                printWriter.println(sb2.toString());
                printWriter.print(str2);
                printWriter.print("mStarted=");
                printWriter.println(aVar.f2311c > 0);
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        sb2.append("LoaderManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        Class<?> cls = this.f21374a.getClass();
        sb2.append(cls.getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(cls)));
        sb2.append("}}");
        return sb2.toString();
    }
}
