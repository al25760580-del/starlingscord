package z0;

import android.content.Context;
import android.content.Intent;
import android.content.LocusId;
import android.content.pm.ShortcutInfo;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.core.app.Person;
import androidx.core.content.pm.ShortcutInfoCompat;
import com.facebook.react.devsupport.StackTraceHelper;
import java.util.Arrays;
import y0.e;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ShortcutInfoCompat f23582a;

    public a(Context context, ShortcutInfo shortcutInfo) {
        Person[] personArr;
        String string;
        ShortcutInfoCompat shortcutInfoCompat = new ShortcutInfoCompat();
        this.f23582a = shortcutInfoCompat;
        shortcutInfoCompat.f1543a = context;
        shortcutInfoCompat.f1544b = shortcutInfo.getId();
        shortcutInfo.getPackage();
        Intent[] intents = shortcutInfo.getIntents();
        shortcutInfoCompat.f1545c = (Intent[]) Arrays.copyOf(intents, intents.length);
        shortcutInfoCompat.f1546d = shortcutInfo.getActivity();
        shortcutInfoCompat.f1547e = shortcutInfo.getShortLabel();
        shortcutInfoCompat.f1548f = shortcutInfo.getLongLabel();
        shortcutInfoCompat.f1549g = shortcutInfo.getDisabledMessage();
        if (Build.VERSION.SDK_INT >= 28) {
            shortcutInfo.getDisabledReason();
        } else {
            shortcutInfo.isEnabled();
        }
        shortcutInfoCompat.j = shortcutInfo.getCategories();
        PersistableBundle extras = shortcutInfo.getExtras();
        e eVar = null;
        if (extras == null || !extras.containsKey("extraPersonCount")) {
            personArr = null;
        } else {
            int i7 = extras.getInt("extraPersonCount");
            personArr = new Person[i7];
            int i10 = 0;
            while (i10 < i7) {
                StringBuilder sb2 = new StringBuilder("extraPerson_");
                int i11 = i10 + 1;
                sb2.append(i11);
                PersistableBundle persistableBundle = extras.getPersistableBundle(sb2.toString());
                String string2 = persistableBundle.getString(StackTraceHelper.NAME_KEY);
                String string3 = persistableBundle.getString("uri");
                String string4 = persistableBundle.getString("key");
                boolean z5 = persistableBundle.getBoolean("isBot");
                boolean z6 = persistableBundle.getBoolean("isImportant");
                Person person = new Person();
                person.f1519a = string2;
                person.f1520b = null;
                person.f1521c = string3;
                person.f1522d = string4;
                person.f1523e = z5;
                person.f1524f = z6;
                personArr[i10] = person;
                i10 = i11;
            }
        }
        shortcutInfoCompat.f1551i = personArr;
        shortcutInfo.getUserHandle();
        shortcutInfo.getLastChangedTimestamp();
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 30) {
            shortcutInfo.isCached();
        }
        shortcutInfo.isDynamic();
        shortcutInfo.isPinned();
        shortcutInfo.isDeclaredInManifest();
        shortcutInfo.isImmutable();
        shortcutInfo.isEnabled();
        shortcutInfo.hasKeyFieldsOnly();
        ShortcutInfoCompat shortcutInfoCompat2 = this.f23582a;
        if (i12 < 29) {
            PersistableBundle extras2 = shortcutInfo.getExtras();
            if (extras2 != null && (string = extras2.getString("extraLocusId")) != null) {
                eVar = new e(string);
            }
        } else if (shortcutInfo.getLocusId() != null) {
            LocusId locusId = shortcutInfo.getLocusId();
            yk.a.d(locusId, "locusId cannot be null");
            String strD = y0.b.d(locusId);
            if (TextUtils.isEmpty(strD)) {
                throw new IllegalArgumentException("id cannot be empty");
            }
            eVar = new e(strD);
        }
        shortcutInfoCompat2.k = eVar;
        this.f23582a.f1553m = shortcutInfo.getRank();
        this.f23582a.f1554n = shortcutInfo.getExtras();
    }
}
