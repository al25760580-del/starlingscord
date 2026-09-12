package ol;

import android.content.Intent;
import android.os.Build;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.collections.e0;
import kotlin.collections.y;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String[] f17454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f17455c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f17456d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f17457e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f17458f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f17459g;

    /* JADX WARN: Code duplicated, block: B:14:0x005e  */
    public g(ReadableMap readableMap) {
        String[] mimeTypes;
        ReadableArray readableArray;
        Intrinsics.checkNotNullParameter(readableMap, "readableMap");
        String string = readableMap.getString("mode");
        if (!readableMap.hasKey("type") || readableMap.isNull("type") || (readableArray = readableMap.getArray("type")) == null) {
            mimeTypes = new String[]{"*/*"};
        } else {
            Intrinsics.checkNotNullParameter(readableArray, "readableArray");
            ArrayList<Object> arrayList = readableArray.toArrayList();
            ArrayList arrayList2 = new ArrayList(e0.l(arrayList, 10));
            Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                String strNormalizeMimeType = Intent.normalizeMimeType(String.valueOf(it.next()));
                Intrinsics.checkNotNull(strNormalizeMimeType);
                arrayList2.add(strNormalizeMimeType);
            }
            mimeTypes = (String[]) arrayList2.toArray(new String[0]);
            if (mimeTypes == null) {
                mimeTypes = new String[]{"*/*"};
            }
        }
        String string2 = readableMap.hasKey("initialDirectoryUrl") ? readableMap.getString("initialDirectoryUrl") : null;
        boolean z5 = readableMap.hasKey("localOnly") && readableMap.getBoolean("localOnly");
        boolean z6 = readableMap.hasKey("allowMultiSelection") && readableMap.getBoolean("allowMultiSelection");
        boolean z7 = readableMap.hasKey("requestLongTermAccess") && readableMap.getBoolean("requestLongTermAccess");
        boolean z10 = readableMap.hasKey("allowVirtualFiles") && readableMap.getBoolean("allowVirtualFiles");
        Intrinsics.checkNotNullParameter(mimeTypes, "mimeTypes");
        this.f17453a = string;
        this.f17454b = mimeTypes;
        this.f17455c = string2;
        this.f17456d = z5;
        this.f17457e = z6;
        this.f17458f = z7;
        this.f17459g = z10;
    }

    public final Intent a() {
        String strA;
        String str;
        String str2 = this.f17453a;
        Intent intent = new Intent(Intrinsics.areEqual("open", str2) ? "android.intent.action.OPEN_DOCUMENT" : "android.intent.action.GET_CONTENT");
        String[] strArr = this.f17454b;
        if (strArr.length > 1) {
            intent.putExtra("android.intent.extra.MIME_TYPES", strArr);
            strA = Intrinsics.areEqual(Intrinsics.areEqual("open", str2) ? "android.intent.action.OPEN_DOCUMENT" : "android.intent.action.GET_CONTENT", "android.intent.action.OPEN_DOCUMENT") ? "*/*" : y.A(this.f17454b, "|", null, null, null, 62);
        } else {
            strA = strArr[0];
        }
        intent.setType(strA);
        if (Build.VERSION.SDK_INT >= 26 && (str = this.f17455c) != null) {
            intent.putExtra("android.provider.extra.INITIAL_URI", str);
        }
        if (!this.f17459g) {
            intent.addCategory("android.intent.category.OPENABLE");
        }
        intent.putExtra("android.intent.extra.LOCAL_ONLY", this.f17456d);
        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", this.f17457e);
        return intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.areEqual(this.f17453a, gVar.f17453a) && Intrinsics.areEqual(this.f17454b, gVar.f17454b) && Intrinsics.areEqual(this.f17455c, gVar.f17455c) && this.f17456d == gVar.f17456d && this.f17457e == gVar.f17457e && this.f17458f == gVar.f17458f && this.f17459g == gVar.f17459g;
    }

    public final int hashCode() {
        String str = this.f17453a;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f17454b)) * 31;
        String str2 = this.f17455c;
        return Boolean.hashCode(this.f17459g) + com.discord.chat.presentation.list.a.g(com.discord.chat.presentation.list.a.g(com.discord.chat.presentation.list.a.g((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f17456d), 31, this.f17457e), 31, this.f17458f);
    }

    public final String toString() {
        StringBuilder sbU = a3.e.u("PickOptions(mode=", this.f17453a, ", mimeTypes=", Arrays.toString(this.f17454b), ", initialDirectoryUrl=");
        sbU.append(this.f17455c);
        sbU.append(", localOnly=");
        sbU.append(this.f17456d);
        sbU.append(", multiple=");
        a3.e.B(sbU, this.f17457e, ", requestLongTermAccess=", this.f17458f, ", allowVirtualFiles=");
        return com.discord.chat.presentation.list.a.m(sbU, this.f17459g, ")");
    }
}
