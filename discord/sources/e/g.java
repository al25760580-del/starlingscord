package e;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.contract.ActivityResultContract;
import java.util.Arrays;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class g extends ActivityResultRegistry {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ComponentActivity f7831h;

    public g(ComponentActivity componentActivity) {
        this.f7831h = componentActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.activity.result.ActivityResultRegistry
    public final void b(int i7, ActivityResultContract contract, Object obj, x0.f fVar) {
        Bundle bundleG;
        int i10;
        Intrinsics.checkNotNullParameter(contract, "contract");
        ComponentActivity componentActivity = this.f7831h;
        g.a aVarB = contract.b(componentActivity, obj);
        if (aVarB != null) {
            new Handler(Looper.getMainLooper()).post(new ab.a(this, i7, aVarB, 6));
            return;
        }
        Intent intentA = contract.a(componentActivity, obj);
        if (intentA.getExtras() != null) {
            Bundle extras = intentA.getExtras();
            Intrinsics.checkNotNull(extras);
            if (extras.getClassLoader() == null) {
                intentA.setExtrasClassLoader(componentActivity.getClassLoader());
            }
        }
        if (intentA.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundleG = intentA.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            intentA.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundleG = fVar != null ? fVar.g() : null;
        }
        Bundle bundle = bundleG;
        if (Intrinsics.areEqual("androidx.activity.result.contract.action.REQUEST_PERMISSIONS", intentA.getAction())) {
            String[] stringArrayExtra = intentA.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            HashSet hashSet = new HashSet();
            for (int i11 = 0; i11 < stringArrayExtra.length; i11++) {
                if (TextUtils.isEmpty(stringArrayExtra[i11])) {
                    throw new IllegalArgumentException(com.discord.chat.presentation.list.a.k(new StringBuilder("Permission request for permissions "), Arrays.toString(stringArrayExtra), " must not contain null or empty values"));
                }
                if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(stringArrayExtra[i11], "android.permission.POST_NOTIFICATIONS")) {
                    hashSet.add(Integer.valueOf(i11));
                }
            }
            int size = hashSet.size();
            String[] strArr = size > 0 ? new String[stringArrayExtra.length - size] : stringArrayExtra;
            if (size > 0) {
                if (size == stringArrayExtra.length) {
                    return;
                }
                int i12 = 0;
                for (int i13 = 0; i13 < stringArrayExtra.length; i13++) {
                    if (!hashSet.contains(Integer.valueOf(i13))) {
                        strArr[i12] = stringArrayExtra[i13];
                        i12++;
                    }
                }
            }
            if (componentActivity instanceof x0.a) {
                ((x0.a) componentActivity).validateRequestPermissionsRequestCode(i7);
            }
            componentActivity.requestPermissions(stringArrayExtra, i7);
            return;
        }
        if (!Intrinsics.areEqual("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST", intentA.getAction())) {
            componentActivity.startActivityForResult(intentA, i7, bundle);
            return;
        }
        f.h hVar = (f.h) intentA.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
        try {
            Intrinsics.checkNotNull(hVar);
            i10 = i7;
            try {
                componentActivity.startIntentSenderForResult(hVar.f8774d, i10, hVar.f8775e, hVar.f8776i, hVar.f8777v, 0, bundle);
            } catch (IntentSender.SendIntentException e10) {
                e = e10;
                new Handler(Looper.getMainLooper()).post(new ab.a(this, i10, e, 7));
            }
        } catch (IntentSender.SendIntentException e11) {
            e = e11;
            i10 = i7;
        }
    }
}
