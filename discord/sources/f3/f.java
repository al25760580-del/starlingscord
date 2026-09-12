package f3;

import a5.s;
import a5.v;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.core.app.Person;
import androidx.core.content.pm.ShortcutInfoCompat;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.gms.internal.play_billing.u0;
import hi.o;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
import o0.h;

/* JADX INFO: loaded from: classes.dex */
public class f extends z0.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f8804h = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static volatile f f8805i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f8806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s.e f8807b = new s.e(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s.e f8808c = new s.e(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ThreadPoolExecutor f8809d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ThreadPoolExecutor f8810e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final File f8811f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final File f8812g;

    public f(Context context, ThreadPoolExecutor threadPoolExecutor, ThreadPoolExecutor threadPoolExecutor2) {
        this.f8806a = context.getApplicationContext();
        this.f8809d = threadPoolExecutor;
        this.f8810e = threadPoolExecutor2;
        File file = new File(context.getFilesDir(), "ShortcutInfoCompatSaver_share_targets");
        this.f8812g = new File(file, "ShortcutInfoCompatSaver_share_targets_bitmaps");
        this.f8811f = new File(file, "targets.xml");
        threadPoolExecutor.submit(new u0(this, file, 7, false));
    }

    public static void f(File file) {
        if ((!file.exists() || file.isDirectory() || file.delete()) && !file.exists()) {
            file.mkdirs();
        }
    }

    @Override // z0.c
    public final Object a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ShortcutInfoCompat shortcutInfoCompat = (ShortcutInfoCompat) it.next();
            ShortcutInfoCompat shortcutInfoCompat2 = new ShortcutInfoCompat();
            shortcutInfoCompat2.f1543a = shortcutInfoCompat.f1543a;
            shortcutInfoCompat2.f1544b = shortcutInfoCompat.f1544b;
            Intent[] intentArr = shortcutInfoCompat.f1545c;
            shortcutInfoCompat2.f1545c = (Intent[]) Arrays.copyOf(intentArr, intentArr.length);
            shortcutInfoCompat2.f1546d = shortcutInfoCompat.f1546d;
            shortcutInfoCompat2.f1547e = shortcutInfoCompat.f1547e;
            shortcutInfoCompat2.f1548f = shortcutInfoCompat.f1548f;
            shortcutInfoCompat2.f1549g = shortcutInfoCompat.f1549g;
            shortcutInfoCompat2.f1550h = shortcutInfoCompat.f1550h;
            shortcutInfoCompat2.k = shortcutInfoCompat.k;
            shortcutInfoCompat2.f1552l = shortcutInfoCompat.f1552l;
            shortcutInfoCompat2.f1553m = shortcutInfoCompat.f1553m;
            Person[] personArr = shortcutInfoCompat.f1551i;
            if (personArr != null) {
                shortcutInfoCompat2.f1551i = (Person[]) Arrays.copyOf(personArr, personArr.length);
            }
            if (shortcutInfoCompat.j != null) {
                shortcutInfoCompat2.j = new HashSet(shortcutInfoCompat.j);
            }
            PersistableBundle persistableBundle = shortcutInfoCompat.f1554n;
            if (persistableBundle != null) {
                shortcutInfoCompat2.f1554n = persistableBundle;
            }
            if (TextUtils.isEmpty(shortcutInfoCompat2.f1547e)) {
                throw new IllegalArgumentException("Shortcut must have a non-empty label");
            }
            Intent[] intentArr2 = shortcutInfoCompat2.f1545c;
            if (intentArr2 == null || intentArr2.length == 0) {
                throw new IllegalArgumentException("Shortcut must have an intent");
            }
            arrayList.add(shortcutInfoCompat2);
        }
        h hVar = new h();
        this.f8809d.submit(new e(this, arrayList, hVar, 1));
        return hVar;
    }

    @Override // z0.c
    public final List b() {
        return (List) this.f8809d.submit(new v(1, this)).get();
    }

    @Override // z0.c
    public final Object c() {
        h hVar = new h();
        this.f8809d.submit(new o(this, hVar, 7, false));
        return hVar;
    }

    @Override // z0.c
    public final Object d(List list) {
        ArrayList arrayList = new ArrayList(list);
        h hVar = new h();
        this.f8809d.submit(new e(this, arrayList, hVar, 0));
        return hVar;
    }

    public final void e(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            g gVar = (g) it.next();
            if (!TextUtils.isEmpty(gVar.f8814b)) {
                arrayList2.add(gVar.f8814b);
            }
        }
        for (File file : this.f8812g.listFiles()) {
            if (!arrayList2.contains(file.getAbsolutePath())) {
                file.delete();
            }
        }
    }

    public final IconCompat g(String str) {
        int identifier;
        Context context = this.f8806a;
        g gVar = (g) this.f8809d.submit(new s(this, str, 1)).get();
        if (gVar == null) {
            return null;
        }
        String str2 = gVar.f8813a;
        if (!TextUtils.isEmpty(str2)) {
            try {
                identifier = context.getResources().getIdentifier(str2, null, null);
            } catch (Exception unused) {
                identifier = 0;
            }
            if (identifier != 0) {
                PorterDuff.Mode mode = IconCompat.k;
                context.getClass();
                return IconCompat.d(context.getResources(), context.getPackageName(), identifier);
            }
        }
        if (TextUtils.isEmpty(gVar.f8814b)) {
            return null;
        }
        Bitmap bitmap = (Bitmap) this.f8810e.submit(new v(2, gVar)).get();
        if (bitmap != null) {
            return IconCompat.c(bitmap);
        }
        return null;
    }

    public final void h(h hVar) {
        u0 u0Var = new u0(this, new ArrayList(this.f8807b.values()), 6, false);
        h hVar2 = new h();
        this.f8810e.submit(new u0(8, hVar2, u0Var));
        hVar2.a(new o(6, hVar2, hVar), this.f8809d);
    }
}
