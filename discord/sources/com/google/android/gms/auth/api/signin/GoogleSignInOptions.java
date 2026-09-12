package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import bf.a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import ls.d;
import org.json.JSONArray;
import org.json.JSONObject;
import te.c;
import ye.b;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class GoogleSignInOptions extends a implements b, ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;
    public static final GoogleSignInOptions H;
    public static final Scope I;
    public static final Scope J;
    public static final Scope K;
    public static final te.b L;
    public final String E;
    public final ArrayList F;
    public final String G;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5902d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f5903e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Account f5904i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f5905v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f5906w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f5907x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f5908y;

    static {
        Scope scope = new Scope(1, "profile");
        new Scope(1, "email");
        Scope scope2 = new Scope(1, "openid");
        I = scope2;
        Scope scope3 = new Scope(1, "https://www.googleapis.com/auth/games_lite");
        J = scope3;
        K = new Scope(1, "https://www.googleapis.com/auth/games");
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        hashSet.add(scope2);
        hashSet.add(scope);
        if (hashSet.contains(K)) {
            Scope scope4 = J;
            if (hashSet.contains(scope4)) {
                hashSet.remove(scope4);
            }
        }
        H = new GoogleSignInOptions(3, new ArrayList(hashSet), null, false, false, false, null, null, map, null);
        HashSet hashSet2 = new HashSet();
        HashMap map2 = new HashMap();
        hashSet2.add(scope3);
        hashSet2.addAll(Arrays.asList(new Scope[0]));
        if (hashSet2.contains(K)) {
            Scope scope5 = J;
            if (hashSet2.contains(scope5)) {
                hashSet2.remove(scope5);
            }
        }
        new GoogleSignInOptions(3, new ArrayList(hashSet2), null, false, false, false, null, null, map2, null);
        CREATOR = new c(1);
        L = new te.b(1);
    }

    public GoogleSignInOptions(int i7, ArrayList arrayList, Account account, boolean z5, boolean z6, boolean z7, String str, String str2, HashMap map, String str3) {
        this.f5902d = i7;
        this.f5903e = arrayList;
        this.f5904i = account;
        this.f5905v = z5;
        this.f5906w = z6;
        this.f5907x = z7;
        this.f5908y = str;
        this.E = str2;
        this.F = new ArrayList(map.values());
        this.G = str3;
    }

    public static GoogleSignInOptions h(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i7 = 0; i7 < length; i7++) {
            hashSet.add(new Scope(1, jSONArray.getString(i7)));
        }
        String strOptString = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;
        return new GoogleSignInOptions(3, new ArrayList(hashSet), !TextUtils.isEmpty(strOptString) ? new Account(strOptString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null, jSONObject.has("hostedDomain") ? jSONObject.optString("hostedDomain") : null, new HashMap(), null);
    }

    public static HashMap i(ArrayList arrayList) {
        HashMap map = new HashMap();
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ue.a aVar = (ue.a) it.next();
                map.put(Integer.valueOf(aVar.f21094e), aVar);
            }
        }
        return map;
    }

    public final boolean equals(Object obj) {
        String str = this.f5908y;
        ArrayList arrayList = this.f5903e;
        if (obj == null) {
            return false;
        }
        try {
            GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
            ArrayList arrayList2 = googleSignInOptions.f5903e;
            String str2 = googleSignInOptions.f5908y;
            Account account = googleSignInOptions.f5904i;
            if (this.F.isEmpty() && googleSignInOptions.F.isEmpty() && arrayList.size() == new ArrayList(arrayList2).size() && arrayList.containsAll(new ArrayList(arrayList2))) {
                Account account2 = this.f5904i;
                if (account2 == null) {
                    if (account != null) {
                        return false;
                    }
                } else if (!account2.equals(account)) {
                    return false;
                }
                if (TextUtils.isEmpty(str)) {
                    if (!TextUtils.isEmpty(str2)) {
                        return false;
                    }
                } else if (!str.equals(str2)) {
                    return false;
                }
                return this.f5907x == googleSignInOptions.f5907x && this.f5905v == googleSignInOptions.f5905v && this.f5906w == googleSignInOptions.f5906w && TextUtils.equals(this.G, googleSignInOptions.G);
            }
            return false;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f5903e;
        int size = arrayList2.size();
        for (int i7 = 0; i7 < size; i7++) {
            arrayList.add(((Scope) arrayList2.get(i7)).f5932e);
        }
        Collections.sort(arrayList);
        int iHashCode = (arrayList.hashCode() + (1 * 31)) * 31;
        Account account = this.f5904i;
        int iHashCode2 = (iHashCode + (account == null ? 0 : account.hashCode())) * 31;
        String str = this.f5908y;
        int iHashCode3 = (((((((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + (this.f5907x ? 1 : 0)) * 31) + (this.f5905v ? 1 : 0)) * 31) + (this.f5906w ? 1 : 0)) * 31;
        String str2 = this.G;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iT = d.T(20293, parcel);
        d.S(parcel, 1, 4);
        parcel.writeInt(this.f5902d);
        d.R(parcel, 2, new ArrayList(this.f5903e));
        d.N(parcel, 3, this.f5904i, i7);
        d.S(parcel, 4, 4);
        parcel.writeInt(this.f5905v ? 1 : 0);
        d.S(parcel, 5, 4);
        parcel.writeInt(this.f5906w ? 1 : 0);
        d.S(parcel, 6, 4);
        parcel.writeInt(this.f5907x ? 1 : 0);
        d.O(this.f5908y, parcel, 7);
        d.O(this.E, parcel, 8);
        d.R(parcel, 9, this.F);
        d.O(this.G, parcel, 10);
        d.U(iT, parcel);
    }
}
