package f3;

import a5.t;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.core.app.Person;
import androidx.core.content.pm.ShortcutInfoCompat;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.gms.internal.play_billing.u0;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import o0.h;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8800d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ArrayList f8801e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ h f8802i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ f f8803v;

    public /* synthetic */ e(f fVar, ArrayList arrayList, h hVar, int i7) {
        this.f8800d = i7;
        this.f8803v = fVar;
        this.f8801e = arrayList;
        this.f8802i = hVar;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x004e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0064  */
    @Override // java.lang.Runnable
    public final void run() {
        String resourceName;
        String absolutePath;
        switch (this.f8800d) {
            case 0:
                Iterator it = this.f8801e.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    f fVar = this.f8803v;
                    if (!zHasNext) {
                        fVar.h(this.f8802i);
                        return;
                    }
                    String str = (String) it.next();
                    fVar.f8807b.remove(str);
                    ListenableFuture listenableFuture = (ListenableFuture) fVar.f8808c.remove(str);
                    if (listenableFuture != null) {
                        listenableFuture.cancel(false);
                    }
                }
                break;
            default:
                Iterator it2 = this.f8801e.iterator();
                while (true) {
                    boolean zHasNext2 = it2.hasNext();
                    f fVar2 = this.f8803v;
                    if (!zHasNext2) {
                        fVar2.h(this.f8802i);
                        return;
                    }
                    ShortcutInfoCompat shortcutInfoCompat = (ShortcutInfoCompat) it2.next();
                    Set set = shortcutInfoCompat.j;
                    if (set != null) {
                        if (set.isEmpty()) {
                            continue;
                        } else {
                            IconCompat iconCompat = shortcutInfoCompat.f1550h;
                            if (iconCompat == null) {
                                resourceName = null;
                                absolutePath = null;
                            } else {
                                int iV = iconCompat.f1560a;
                                if (iV == -1) {
                                    iV = yk.a.v(iconCompat.f1561b);
                                }
                                if (iV == 1) {
                                    absolutePath = new File(fVar2.f8812g, UUID.randomUUID().toString()).getAbsolutePath();
                                    resourceName = null;
                                } else if (iV == 2) {
                                    resourceName = fVar2.f8806a.getResources().getResourceName(iconCompat.f());
                                    absolutePath = null;
                                } else if (iV != 5) {
                                    resourceName = null;
                                    absolutePath = null;
                                } else {
                                    absolutePath = new File(fVar2.f8812g, UUID.randomUUID().toString()).getAbsolutePath();
                                    resourceName = null;
                                }
                            }
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
                            shortcutInfoCompat2.f1550h = null;
                            if (TextUtils.isEmpty(shortcutInfoCompat2.f1547e)) {
                                throw new IllegalArgumentException("Shortcut must have a non-empty label");
                            }
                            Intent[] intentArr2 = shortcutInfoCompat2.f1545c;
                            if (intentArr2 == null || intentArr2.length == 0) {
                                throw new IllegalArgumentException("Shortcut must have an intent");
                            }
                            g gVar = new g(shortcutInfoCompat2, resourceName, absolutePath);
                            Bitmap bitmapE = absolutePath != null ? shortcutInfoCompat.f1550h.e() : null;
                            String str2 = shortcutInfoCompat.f1544b;
                            fVar2.f8807b.put(str2, gVar);
                            if (bitmapE != null) {
                                t tVar = new t(fVar2, bitmapE, absolutePath, 6, false);
                                h hVar = new h();
                                fVar2.f8810e.submit(new u0(8, hVar, tVar));
                                ListenableFuture listenableFuture2 = (ListenableFuture) fVar2.f8808c.put(str2, hVar);
                                if (listenableFuture2 != null) {
                                    listenableFuture2.cancel(false);
                                }
                                hVar.a(new t(this, str2, hVar, 5, false), fVar2.f8809d);
                            }
                        }
                    }
                }
                break;
        }
    }
}
