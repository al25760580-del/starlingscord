package androidx.core.content.pm;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.core.app.Person;
import androidx.core.graphics.drawable.IconCompat;
import com.facebook.react.devsupport.StackTraceHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import x0.m;
import y0.e;
import z0.a;

/* JADX INFO: loaded from: classes.dex */
public final class ShortcutInfoCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f1543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f1544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Intent[] f1545c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ComponentName f1546d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f1547e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f1548f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public CharSequence f1549g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public IconCompat f1550h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Person[] f1551i;
    public Set j;
    public e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f1552l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f1553m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public PersistableBundle f1554n;

    public static ArrayList a(Context context, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ShortcutInfoCompat shortcutInfoCompat = new a(context, (ShortcutInfo) it.next()).f23582a;
            if (TextUtils.isEmpty(shortcutInfoCompat.f1547e)) {
                throw new IllegalArgumentException("Shortcut must have a non-empty label");
            }
            Intent[] intentArr = shortcutInfoCompat.f1545c;
            if (intentArr == null || intentArr.length == 0) {
                throw new IllegalArgumentException("Shortcut must have an intent");
            }
            arrayList.add(shortcutInfoCompat);
        }
        return arrayList;
    }

    public final ShortcutInfo b() {
        ShortcutInfo.Builder intents = new ShortcutInfo.Builder(this.f1543a, this.f1544b).setShortLabel(this.f1547e).setIntents(this.f1545c);
        IconCompat iconCompat = this.f1550h;
        if (iconCompat != null) {
            intents.setIcon(iconCompat.i(this.f1543a));
        }
        if (!TextUtils.isEmpty(this.f1548f)) {
            intents.setLongLabel(this.f1548f);
        }
        if (!TextUtils.isEmpty(this.f1549g)) {
            intents.setDisabledMessage(this.f1549g);
        }
        ComponentName componentName = this.f1546d;
        if (componentName != null) {
            intents.setActivity(componentName);
        }
        Set<String> set = this.j;
        if (set != null) {
            intents.setCategories(set);
        }
        intents.setRank(this.f1553m);
        PersistableBundle persistableBundle = this.f1554n;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        int i7 = 0;
        if (Build.VERSION.SDK_INT >= 29) {
            Person[] personArr = this.f1551i;
            if (personArr != null && personArr.length > 0) {
                int length = personArr.length;
                android.app.Person[] personArr2 = new android.app.Person[length];
                while (i7 < length) {
                    Person person = this.f1551i[i7];
                    person.getClass();
                    personArr2[i7] = m.h(person);
                    i7++;
                }
                intents.setPersons(personArr2);
            }
            e eVar = this.k;
            if (eVar != null) {
                intents.setLocusId(eVar.f23128b);
            }
            intents.setLongLived(this.f1552l);
        } else {
            if (this.f1554n == null) {
                this.f1554n = new PersistableBundle();
            }
            Person[] personArr3 = this.f1551i;
            if (personArr3 != null && personArr3.length > 0) {
                this.f1554n.putInt("extraPersonCount", personArr3.length);
                while (i7 < this.f1551i.length) {
                    PersistableBundle persistableBundle2 = this.f1554n;
                    StringBuilder sb2 = new StringBuilder("extraPerson_");
                    int i10 = i7 + 1;
                    sb2.append(i10);
                    String string = sb2.toString();
                    Person person2 = this.f1551i[i7];
                    person2.getClass();
                    PersistableBundle persistableBundle3 = new PersistableBundle();
                    CharSequence charSequence = person2.f1519a;
                    persistableBundle3.putString(StackTraceHelper.NAME_KEY, charSequence != null ? charSequence.toString() : null);
                    persistableBundle3.putString("uri", person2.f1521c);
                    persistableBundle3.putString("key", person2.f1522d);
                    persistableBundle3.putBoolean("isBot", person2.f1523e);
                    persistableBundle3.putBoolean("isImportant", person2.f1524f);
                    persistableBundle2.putPersistableBundle(string, persistableBundle3);
                    i7 = i10;
                }
            }
            e eVar2 = this.k;
            if (eVar2 != null) {
                this.f1554n.putString("extraLocusId", eVar2.f23127a);
            }
            this.f1554n.putBoolean("extraLongLived", this.f1552l);
            intents.setExtras(this.f1554n);
        }
        if (Build.VERSION.SDK_INT >= 33) {
            e.e.h(intents);
        }
        return intents.build();
    }
}
