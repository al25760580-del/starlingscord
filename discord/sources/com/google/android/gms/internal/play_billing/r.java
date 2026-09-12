package com.google.android.gms.internal.play_billing;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import java.util.ArrayList;
import java.util.Set;
import org.json.JSONException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f6105a = Runtime.getRuntime().availableProcessors();

    public static int a(String str, Bundle bundle) {
        if (bundle == null) {
            h(str, "Unexpected null bundle received!");
            return 6;
        }
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            g(str, "getResponseCodeFromBundle() got null response code, assuming OK");
            return 0;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        h(str, "Unexpected type for bundle response code: ".concat(obj.getClass().getName()));
        return 6;
    }

    public static void b(Bundle bundle, String str, long j) {
        bundle.putString("playBillingLibraryVersion", z4.a.f23597a);
        if (str != null) {
            bundle.putString("playBillingLibraryWrapperVersion", str);
        }
        bundle.putLong("billingClientSessionId", j);
    }

    public static Bundle c(int i7, BillingResult billingResult) {
        Bundle bundle = new Bundle();
        bundle.putInt("RESPONSE_CODE", billingResult.f3788a);
        bundle.putString("DEBUG_MESSAGE", billingResult.f3790c);
        bundle.putInt("LOG_REASON", com.discord.chat.presentation.list.a.c(i7));
        return bundle;
    }

    public static Bundle d(String str, ArrayList arrayList, a aVar, long j) {
        Bundle bundle = new Bundle();
        b(bundle, str, j);
        bundle.putBoolean("enablePendingPurchases", true);
        bundle.putString("SKU_DETAILS_RESPONSE_FORMAT", "PRODUCT_DETAILS");
        p pVar = s.f6118e;
        Object[] objArr = {"subs", "inapp"};
        for (int i7 = 0; i7 < 2; i7++) {
            if (objArr[i7] == null) {
                throw new NullPointerException(kk.b.h(i7, "at index "));
            }
        }
        bundle.putStringArrayList("PRODUCT_TYPES_TO_RETURN_MULTIPLE_OFFERS", new ArrayList<>(s.k(2, objArr)));
        Object[] objArr2 = {"inapp"};
        for (int i10 = 0; i10 < 1; i10++) {
            if (objArr2[i10] == null) {
                throw new NullPointerException(kk.b.h(i10, "at index "));
            }
        }
        bundle.putStringArrayList("PRODUCT_TYPES_TO_RETURN_PREORDER_OFFERS", new ArrayList<>(s.k(1, objArr2)));
        Object[] objArr3 = {"inapp"};
        for (int i11 = 0; i11 < 1; i11++) {
            if (objArr3[i11] == null) {
                throw new NullPointerException(kk.b.h(i11, "at index "));
            }
        }
        bundle.putStringArrayList("PRODUCT_TYPES_TO_RETURN_RENT_OFFERS", new ArrayList<>(s.k(1, objArr3)));
        bundle.putBoolean("SHOULD_RETURN_UNFETCHED_PRODUCTS", true);
        ArrayList<String> arrayList2 = new ArrayList<>();
        ArrayList<String> arrayList3 = new ArrayList<>();
        ArrayList<String> arrayList4 = new ArrayList<>();
        int size = arrayList.size();
        boolean z5 = false;
        boolean z6 = false;
        for (int i12 = 0; i12 < size; i12++) {
            a5.m mVar = (a5.m) arrayList.get(i12);
            arrayList2.add(null);
            z5 |= !TextUtils.isEmpty(null);
            mVar.getClass();
            arrayList4.add(null);
            z6 |= !TextUtils.isEmpty(null);
            if (mVar.f230b.equals("first_party")) {
                throw new NullPointerException("Serialized DocId is required for constructing ExtraParams to query ProductDetails for all first party products.");
            }
        }
        if (z5) {
            bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList2);
        }
        if (!arrayList3.isEmpty()) {
            bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList3);
        }
        if (!TextUtils.isEmpty(null)) {
            bundle.putString("accountName", null);
        }
        if (z6) {
            bundle.putStringArrayList("SKU_DYNAMIC_PRODUCT_TOKEN_LIST", arrayList4);
        }
        return bundle;
    }

    public static BillingResult e(Intent intent, String str) {
        if (intent != null) {
            a5.g gVarA = BillingResult.a();
            gVarA.f184d = a(str, intent.getExtras());
            gVarA.f186i = f(str, intent.getExtras());
            return gVarA.e();
        }
        h("BillingHelper", "Got null intent!");
        a5.g gVarA2 = BillingResult.a();
        gVarA2.f184d = 6;
        gVarA2.f186i = "An internal error occurred.";
        return gVarA2.e();
    }

    public static String f(String str, Bundle bundle) {
        if (bundle == null) {
            h(str, "Unexpected null bundle received!");
            return "";
        }
        Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            g(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        h(str, "Unexpected type for debug message: ".concat(obj.getClass().getName()));
        return "";
    }

    public static void g(String str, String str2) {
        if (Log.isLoggable(str, 2)) {
            if (str2.isEmpty()) {
                Log.v(str, str2);
                return;
            }
            int i7 = 40000;
            while (!str2.isEmpty() && i7 > 0) {
                int iMin = Math.min(str2.length(), Math.min(4000, i7));
                Log.v(str, str2.substring(0, iMin));
                str2 = str2.substring(iMin);
                i7 -= iMin;
            }
        }
    }

    public static void h(String str, String str2) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2);
        }
    }

    public static void i(String str, String str2, Throwable th2) {
        try {
            if (Log.isLoggable(str, 5)) {
                if (th2 == null) {
                    Log.w(str, str2);
                } else {
                    Log.w(str, str2, th2);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static Purchase j(String str, String str2, Set set) {
        Purchase purchase = null;
        if (str == null || str2 == null) {
            g("BillingHelper", "Received a null purchase data.");
            return null;
        }
        try {
            Purchase purchase2 = new Purchase(str, str2);
            try {
                set.isEmpty();
                return purchase2;
            } catch (JSONException e10) {
                e = e10;
                purchase = purchase2;
                h("BillingHelper", "Got JSONException while parsing purchase data: ".concat(e.toString()));
                return purchase;
            }
        } catch (JSONException e11) {
            e = e11;
        }
    }
}
