package com.google.android.gms.auth.api.signin;

import af.w;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import bf.a;
import com.facebook.react.devsupport.StackTraceHelper;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import ls.d;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import te.c;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class GoogleSignInAccount extends a implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new c(0);
    public final long E;
    public final String F;
    public final List G;
    public final String H;
    public final String I;
    public final HashSet J = new HashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5895d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f5896e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f5897i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f5898v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f5899w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Uri f5900x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f5901y;

    public GoogleSignInAccount(int i7, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, ArrayList arrayList, String str7, String str8) {
        this.f5895d = i7;
        this.f5896e = str;
        this.f5897i = str2;
        this.f5898v = str3;
        this.f5899w = str4;
        this.f5900x = uri;
        this.f5901y = str5;
        this.E = j;
        this.F = str6;
        this.G = arrayList;
        this.H = str7;
        this.I = str8;
    }

    public static GoogleSignInAccount h(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl");
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i7 = 0; i7 < length; i7++) {
            hashSet.add(new Scope(1, jSONArray.getString(i7)));
        }
        String strOptString2 = jSONObject.optString(StackTraceHelper.ID_KEY);
        String strOptString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String strOptString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        String strOptString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String strOptString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String strOptString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        String string = jSONObject.getString("obfuscatedIdentifier");
        w.d(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, strOptString2, strOptString3, strOptString4, strOptString5, uri, null, j, string, new ArrayList(hashSet), strOptString6, strOptString7);
        googleSignInAccount.f5901y = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        if (!googleSignInAccount.F.equals(this.F)) {
            return false;
        }
        HashSet hashSet = new HashSet(googleSignInAccount.G);
        hashSet.addAll(googleSignInAccount.J);
        HashSet hashSet2 = new HashSet(this.G);
        hashSet2.addAll(this.J);
        return hashSet.equals(hashSet2);
    }

    public final int hashCode() {
        int iHashCode = this.F.hashCode() + 527;
        HashSet hashSet = new HashSet(this.G);
        hashSet.addAll(this.J);
        return (iHashCode * 31) + hashSet.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iT = d.T(20293, parcel);
        d.S(parcel, 1, 4);
        parcel.writeInt(this.f5895d);
        d.O(this.f5896e, parcel, 2);
        d.O(this.f5897i, parcel, 3);
        d.O(this.f5898v, parcel, 4);
        d.O(this.f5899w, parcel, 5);
        d.N(parcel, 6, this.f5900x, i7);
        d.O(this.f5901y, parcel, 7);
        d.S(parcel, 8, 8);
        parcel.writeLong(this.E);
        d.O(this.F, parcel, 9);
        d.R(parcel, 10, this.G);
        d.O(this.H, parcel, 11);
        d.O(this.I, parcel, 12);
        d.U(iT, parcel);
    }
}
