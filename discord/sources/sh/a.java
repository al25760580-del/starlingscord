package sh;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Base64;
import com.discord.js_watchdog.SharedPreferencesKey;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ga.k f19973a = new ga.k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final io.sentry.hints.j f19974b = new io.sentry.hints.j(16);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final pa.s f19975c = new pa.s();

    public static String a(List list) throws NoSuchAlgorithmException, IOException {
        int i7;
        MessageDigest messageDigest = MessageDigest.getInstance("SHA256");
        byte[] bArr = new byte[8192];
        Iterator it = list.iterator();
        while (it.hasNext()) {
            FileInputStream fileInputStream = new FileInputStream((File) it.next());
            do {
                try {
                    i7 = fileInputStream.read(bArr);
                    if (i7 > 0) {
                        messageDigest.update(bArr, 0, i7);
                    }
                } catch (Throwable th2) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } while (i7 != -1);
            fileInputStream.close();
        }
        return Base64.encodeToString(messageDigest.digest(), 11);
    }

    public static v3.g b(Bundle bundle, Bundle bundle2) throws Throwable {
        v3.f fVar = new v3.f();
        fVar.f21402a.put("BUNDLE_DATA_CONVERTER_VERSION", "1.0");
        d(new n8.f("session_bundle:", bundle, fVar, 11));
        c(new n8.f("notification_bundle:", bundle2, fVar, 11));
        v3.g gVar = new v3.g(fVar.f21402a);
        v3.g.b(gVar);
        return gVar;
    }

    public static void c(n8.f fVar) {
        fVar.S("notification_channel_name");
        fVar.S("notification_title");
        fVar.S("notification_subtext");
        fVar.K("notification_color");
        fVar.R(600000L, "notification_timeout");
        switch (fVar.f16509d) {
            case 11:
                Bundle bundle = (Bundle) fVar.f16512v;
                String str = (String) fVar.f16510e;
                ((v3.f) fVar.f16511i).f21402a.put(str.concat("notification_intent_reconstruct_from_data"), Boolean.valueOf(bundle.getBoolean("notification_intent_reconstruct_from_data")));
                break;
            default:
                String str2 = (String) fVar.f16510e;
                Bundle bundle2 = (Bundle) fVar.f16511i;
                Object obj = ((v3.g) fVar.f16512v).f21405a.get(str2.concat("notification_intent_reconstruct_from_data"));
                bundle2.putBoolean("notification_intent_reconstruct_from_data", obj instanceof Boolean ? ((Boolean) obj).booleanValue() : false);
                break;
        }
        fVar.S("notification_intent_component_class_name");
        fVar.S("notification_intent_component_package_name");
        fVar.S("notification_intent_package");
        fVar.S("notification_intent_action");
        fVar.S("notification_intent_data");
        fVar.K("notification_intent_flags");
        fVar.S("notification_intent_extra_error_dialog_document_id");
    }

    public static void d(n8.f fVar) {
        fVar.K(SharedPreferencesKey.SESSION_ID);
        fVar.K("app_version_code");
        for (String str : fVar.E("pack_names")) {
            fVar.N(sa.a.a("pack_version", str));
            fVar.S(sa.a.a("pack_version_tag", str));
            fVar.K(sa.a.a("status", str));
            fVar.N(sa.a.a("total_bytes_to_download", str));
            for (String str2 : fVar.E(sa.a.a("slice_ids", str))) {
                String strD = sa.a.d("chunk_intents", str, str2);
                switch (fVar.f16509d) {
                    case 11:
                        ArrayList parcelableArrayList = ((Bundle) fVar.f16512v).getParcelableArrayList(strD);
                        if (parcelableArrayList != null) {
                            String[] strArr = new String[parcelableArrayList.size()];
                            for (int i7 = 0; i7 < parcelableArrayList.size(); i7++) {
                                Intent intent = (Intent) parcelableArrayList.get(i7);
                                strArr[i7] = (intent == null || intent.getData() == null) ? "" : intent.getData().toString();
                            }
                            ((v3.f) fVar.f16511i).f21402a.put(kk.b.k((String) fVar.f16510e, strD, ":intent_data"), strArr);
                        }
                        break;
                    default:
                        Object obj = ((v3.g) fVar.f16512v).f21405a.get(a3.e.o(new StringBuilder(), (String) fVar.f16510e, strD, ":intent_data"));
                        String[] strArr2 = obj instanceof String[] ? (String[]) obj : null;
                        if (strArr2 != null) {
                            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(strArr2.length);
                            for (String str3 : strArr2) {
                                arrayList.add(str3.isEmpty() ? null : new Intent().setData(Uri.parse(str3)));
                            }
                            ((Bundle) fVar.f16511i).putParcelableArrayList(strD, arrayList);
                        }
                        break;
                }
                fVar.S(sa.a.d("uncompressed_hash_sha256", str, str2));
                fVar.N(sa.a.d("uncompressed_size", str, str2));
                fVar.K(sa.a.d("patch_format", str, str2));
                fVar.K(sa.a.d("compression_format", str, str2));
            }
        }
    }
}
