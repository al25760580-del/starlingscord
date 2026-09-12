package hf;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.GZIPInputStream;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import n1.i;
import n1.j;
import n1.l;
import n1.o;
import n1.q;
import n1.v;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f10726a;

    public static j a(b bVar, Object request) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (Intrinsics.areEqual(request, "androidx.credentials.TYPE_CLEAR_RESTORE_CREDENTIAL")) {
            return bVar.d();
        }
        if (request instanceof o) {
            Iterator it = ((o) request).f16230a.iterator();
            while (it.hasNext()) {
                if (((i) it.next()) instanceof q) {
                    return bVar.d();
                }
            }
        } else if (request instanceof v) {
            return bVar.d();
        }
        Context ctx = bVar.f10726a;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        if (!ctx.getPackageManager().hasSystemFeature("android.software.leanback")) {
            Intrinsics.checkNotNullParameter(ctx, "ctx");
            if (!ctx.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                int i7 = Build.VERSION.SDK_INT;
                if (i7 >= 34) {
                    l lVar = new l(ctx);
                    l lVar2 = lVar.isAvailableOnDevice() ? lVar : null;
                    return lVar2 == null ? bVar.d() : lVar2;
                }
                if (i7 <= 33) {
                    return bVar.d();
                }
                return null;
            }
        }
        return bVar.d();
    }

    public static String b(File file) throws IOException {
        String canonicalPath = file.getCanonicalPath();
        return !canonicalPath.endsWith("/") ? canonicalPath.concat("/") : canonicalPath;
    }

    public InputStream c(String str) throws IOException {
        if (str.length() > 1 && str.charAt(0) == '/') {
            str = str.substring(1);
        }
        String[] strArrSplit = str.split("/", -1);
        if (strArrSplit.length != 2) {
            throw new IllegalArgumentException("Incorrect resource path: ".concat(str));
        }
        String str2 = strArrSplit[0];
        String strSubstring = strArrSplit[1];
        int iLastIndexOf = strSubstring.lastIndexOf(46);
        if (iLastIndexOf != -1) {
            strSubstring = strSubstring.substring(0, iLastIndexOf);
        }
        Context context = this.f10726a;
        int identifier = context.getResources().getIdentifier(strSubstring, str2, context.getPackageName());
        TypedValue typedValue = new TypedValue();
        context.getResources().getValue(identifier, typedValue, true);
        int i7 = typedValue.type;
        if (i7 != 3) {
            throw new IOException(String.format("Expected %s resource to be of TYPE_STRING but was %d", str, Integer.valueOf(i7)));
        }
        InputStream inputStreamOpenRawResource = context.getResources().openRawResource(identifier);
        return str.endsWith(".svgz") ? new GZIPInputStream(inputStreamOpenRawResource) : inputStreamOpenRawResource;
    }

    public j d() throws PackageManager.NameNotFoundException {
        String string;
        Context context = this.f10726a;
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 132);
        ArrayList arrayList = new ArrayList();
        ServiceInfo[] serviceInfoArr = packageInfo.services;
        if (serviceInfoArr != null) {
            Intrinsics.checkNotNull(serviceInfoArr);
            for (ServiceInfo serviceInfo : serviceInfoArr) {
                Bundle bundle = serviceInfo.metaData;
                if (bundle != null && (string = bundle.getString("androidx.credentials.CREDENTIAL_PROVIDER_KEY")) != null) {
                    arrayList.add(string);
                }
            }
        }
        List listI0 = CollectionsKt.i0(arrayList);
        if (listI0.isEmpty()) {
            return null;
        }
        Iterator it = listI0.iterator();
        j jVar = null;
        while (it.hasNext()) {
            try {
                Object objNewInstance = Class.forName((String) it.next()).getConstructor(Context.class).newInstance(context);
                Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type androidx.credentials.CredentialProvider");
                j jVar2 = (j) objNewInstance;
                if (!jVar2.isAvailableOnDevice()) {
                    continue;
                } else {
                    if (jVar != null) {
                        Log.i("CredProviderFactory", "Only one active OEM CredentialProvider allowed");
                        return null;
                    }
                    jVar = jVar2;
                }
            } catch (Throwable unused) {
            }
        }
        return jVar;
    }

    public b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f10726a = context;
    }
}
