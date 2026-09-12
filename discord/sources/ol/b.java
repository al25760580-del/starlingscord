package ol;

import android.net.Uri;
import android.util.Base64;
import android.webkit.MimeTypeMap;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.devsupport.StackTraceHelper;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f17433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f17434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Long f17435c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f17436d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f17437e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String[] f17438f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f17439g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f17440h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Boolean f17441i;

    public b(Uri forUri) {
        Intrinsics.checkNotNullParameter(forUri, "forUri");
        this.f17433a = forUri;
    }

    public final WritableMap a() {
        String lowerCase;
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString(StackTraceHelper.NAME_KEY, this.f17434b);
        writableMapCreateMap.putString("uri", this.f17433a.toString());
        Long l6 = this.f17435c;
        if (l6 != null) {
            writableMapCreateMap.putDouble("size", l6.longValue());
        } else {
            writableMapCreateMap.putNull("size");
        }
        String str = this.f17436d;
        String lowerCase2 = null;
        if (str != null) {
            lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        } else {
            lowerCase = null;
        }
        writableMapCreateMap.putString("type", lowerCase);
        String str2 = this.f17436d;
        if (str2 != null) {
            lowerCase2 = str2.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        }
        writableMapCreateMap.putString("nativeType", lowerCase2);
        String[] strArr = this.f17438f;
        if (strArr != null) {
            WritableArray writableArrayCreateArray = Arguments.createArray();
            for (String str3 : strArr) {
                String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(str3);
                WritableMap writableMapCreateMap2 = Arguments.createMap();
                writableMapCreateMap2.putString("mimeType", str3);
                writableMapCreateMap2.putString("extension", extensionFromMimeType);
                writableArrayCreateArray.pushMap(writableMapCreateMap2);
            }
            writableMapCreateMap.putArray("convertibleToMimeTypes", writableArrayCreateArray);
        } else {
            writableMapCreateMap.putNull("convertibleToMimeTypes");
        }
        writableMapCreateMap.putString("error", this.f17437e);
        Boolean bool = this.f17441i;
        if (bool != null) {
            writableMapCreateMap.putBoolean("isVirtual", bool.booleanValue());
        } else {
            writableMapCreateMap.putNull("isVirtual");
        }
        String str4 = this.f17439g;
        if (str4 == null) {
            String str5 = this.f17440h;
            if (str5 != null) {
                writableMapCreateMap.putString("bookmarkStatus", "error");
                writableMapCreateMap.putString("bookmarkError", str5);
            }
            return writableMapCreateMap;
        }
        byte[] bytes = str4.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        String strEncodeToString = Base64.encodeToString(bytes, 0);
        writableMapCreateMap.putString("bookmarkStatus", "success");
        writableMapCreateMap.putString("bookmark", strEncodeToString);
        return writableMapCreateMap;
    }
}
