package androidx.fragment.app;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.result.contract.ActivityResultContract;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class v0 extends ActivityResultContract {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2260a;

    public /* synthetic */ v0(int i7) {
        this.f2260a = i7;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    public final Intent a(Context context, Object obj) {
        Bundle bundleExtra;
        switch (this.f2260a) {
            case 0:
                f.h hVar = (f.h) obj;
                Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent2 = hVar.f8775e;
                if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        IntentSender intentSender = hVar.f8774d;
                        Intrinsics.checkNotNullParameter(intentSender, "intentSender");
                        hVar = new f.h(intentSender, null, hVar.f8776i, hVar.f8777v);
                    }
                }
                intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", hVar);
                if (FragmentManager.M(2)) {
                    Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
                }
                return intent;
            case 1:
                return d(context, (f.i) obj);
            case 2:
                String[] input = (String[]) obj;
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(input, "input");
                Intrinsics.checkNotNullParameter(input, "input");
                Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", input);
                Intrinsics.checkNotNullExpressionValue(intentPutExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
                return intentPutExtra;
            case 3:
                Intent input2 = (Intent) obj;
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(input2, "input");
                return input2;
            default:
                f.h input3 = (f.h) obj;
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(input3, "input");
                Intent intentPutExtra2 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", input3);
                Intrinsics.checkNotNullExpressionValue(intentPutExtra2, "Intent(ACTION_INTENT_SEN…NT_SENDER_REQUEST, input)");
                return intentPutExtra2;
        }
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    public g.a b(Context context, Object obj) {
        switch (this.f2260a) {
            case 1:
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter((f.i) obj, "input");
                return null;
            case 2:
                String[] input = (String[]) obj;
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(input, "input");
                if (input.length == 0) {
                    return new g.a(kotlin.collections.w0.d());
                }
                for (String str : input) {
                    if (y0.b.a(context, str) != 0) {
                        return null;
                    }
                }
                int iA = kotlin.collections.v0.a(input.length);
                if (iA < 16) {
                    iA = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
                for (String str2 : input) {
                    linkedHashMap.put(str2, Boolean.TRUE);
                }
                return new g.a(linkedHashMap);
            default:
                return super.b(context, obj);
        }
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    public final Object c(int i7, Intent intent) {
        List arrayList;
        switch (this.f2260a) {
            case 0:
                return new f.a(i7, intent);
            case 1:
                if (i7 != -1) {
                    intent = null;
                }
                if (intent == null) {
                    return null;
                }
                Uri data = intent.getData();
                if (data != null) {
                    return data;
                }
                Intrinsics.checkNotNullParameter(intent, "<this>");
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Uri data2 = intent.getData();
                if (data2 != null) {
                    linkedHashSet.add(data2);
                }
                ClipData clipData = intent.getClipData();
                if (clipData == null && linkedHashSet.isEmpty()) {
                    arrayList = kotlin.collections.n0.f14659d;
                } else {
                    if (clipData != null) {
                        int itemCount = clipData.getItemCount();
                        for (int i10 = 0; i10 < itemCount; i10++) {
                            Uri uri = clipData.getItemAt(i10).getUri();
                            if (uri != null) {
                                linkedHashSet.add(uri);
                            }
                        }
                    }
                    arrayList = new ArrayList(linkedHashSet);
                }
                return (Uri) CollectionsKt.firstOrNull(arrayList);
            case 2:
                if (i7 != -1) {
                    return kotlin.collections.w0.d();
                }
                if (intent == null) {
                    return kotlin.collections.w0.d();
                }
                String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                if (intArrayExtra == null || stringArrayExtra == null) {
                    return kotlin.collections.w0.d();
                }
                ArrayList arrayList2 = new ArrayList(intArrayExtra.length);
                for (int i11 : intArrayExtra) {
                    arrayList2.add(Boolean.valueOf(i11 == 0));
                }
                return kotlin.collections.w0.l(CollectionsKt.n0(kotlin.collections.y.r(stringArrayExtra), arrayList2));
            case 3:
                return new f.a(i7, intent);
            default:
                return new f.a(i7, intent);
        }
    }

    public Intent d(Context context, f.i input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        if (z0.d.j()) {
            Intent intent = new Intent("android.provider.action.PICK_IMAGES");
            intent.setType(z0.d.i(input.f8778a));
            input.f8780c.getClass();
            intent.putExtra("android.provider.extra.PICK_IMAGES_LAUNCH_TAB", 1);
            return intent;
        }
        Intrinsics.checkNotNullParameter(context, "context");
        if (z0.d.h(context) == null) {
            Intent intent2 = new Intent("android.intent.action.OPEN_DOCUMENT");
            intent2.setType(z0.d.i(input.f8778a));
            if (intent2.getType() == null) {
                intent2.setType("*/*");
                intent2.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
            }
            return intent2;
        }
        ResolveInfo resolveInfoH = z0.d.h(context);
        if (resolveInfoH == null) {
            throw new IllegalStateException("Required value was null.");
        }
        ActivityInfo activityInfo = resolveInfoH.activityInfo;
        Intent intent3 = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
        intent3.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
        intent3.setType(z0.d.i(input.f8778a));
        input.f8780c.getClass();
        intent3.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_LAUNCH_TAB", 1);
        return intent3;
    }
}
