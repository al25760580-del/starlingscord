package androidx.sharetarget;

import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.service.chooser.ChooserTarget;
import android.service.chooser.ChooserTargetService;
import android.util.Log;
import androidx.core.content.pm.ShortcutInfoCompat;
import androidx.core.graphics.drawable.IconCompat;
import f3.a;
import f3.b;
import f3.c;
import f3.d;
import f3.f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class ChooserTargetServiceCompat extends ChooserTargetService {
    @Override // android.service.chooser.ChooserTargetService
    public final List onGetChooserTargets(ComponentName componentName, IntentFilter intentFilter) {
        IconCompat iconCompatG;
        Context applicationContext = getApplicationContext();
        if (d.f8798a == null) {
            synchronized (d.f8799b) {
                try {
                    if (d.f8798a == null) {
                        d.f8798a = d.e(applicationContext);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        ArrayList arrayList = d.f8798a;
        ArrayList<c> arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            c cVar = (c) it.next();
            if (cVar.f8796b.equals(componentName.getClassName())) {
                for (b bVar : cVar.f8795a) {
                    if (intentFilter.hasDataType(bVar.f8794a)) {
                        arrayList2.add(cVar);
                        break;
                    }
                }
            }
        }
        if (arrayList2.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        if (f.f8805i == null) {
            synchronized (f.f8804h) {
                try {
                    if (f.f8805i == null) {
                        TimeUnit timeUnit = TimeUnit.SECONDS;
                        f.f8805i = new f(applicationContext, new ThreadPoolExecutor(0, 1, 20L, timeUnit, new LinkedBlockingQueue()), new ThreadPoolExecutor(0, 1, 20L, timeUnit, new LinkedBlockingQueue()));
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        f fVar = f.f8805i;
        try {
            List<ShortcutInfoCompat> listB = fVar.b();
            if (listB == null || listB.isEmpty()) {
                return Collections.EMPTY_LIST;
            }
            ArrayList<a> arrayList3 = new ArrayList();
            for (ShortcutInfoCompat shortcutInfoCompat : listB) {
                for (c cVar2 : arrayList2) {
                    if (shortcutInfoCompat.j.containsAll(Arrays.asList(cVar2.f8797c))) {
                        arrayList3.add(new a(shortcutInfoCompat, new ComponentName(applicationContext.getPackageName(), cVar2.f8796b)));
                        break;
                    }
                }
            }
            if (arrayList3.isEmpty()) {
                return new ArrayList();
            }
            Collections.sort(arrayList3);
            ArrayList arrayList4 = new ArrayList();
            int i7 = ((a) arrayList3.get(0)).f8792d.f1553m;
            float f2 = 1.0f;
            int i10 = i7;
            for (a aVar : arrayList3) {
                ShortcutInfoCompat shortcutInfoCompat2 = aVar.f8792d;
                try {
                    iconCompatG = fVar.g(shortcutInfoCompat2.f1544b);
                } catch (Exception e10) {
                    Log.e("ChooserServiceCompat", "Failed to retrieve shortcut icon: ", e10);
                    iconCompatG = null;
                }
                Bundle bundle = new Bundle();
                bundle.putString("android.intent.extra.shortcut.ID", shortcutInfoCompat2.f1544b);
                int i11 = shortcutInfoCompat2.f1553m;
                if (i10 != i11) {
                    f2 -= 0.01f;
                    i10 = i11;
                }
                float f7 = f2;
                arrayList4.add(new ChooserTarget(shortcutInfoCompat2.f1547e, iconCompatG != null ? iconCompatG.i(null) : null, f7, aVar.f8793e, bundle));
                f2 = f7;
            }
            return arrayList4;
        } catch (Exception e11) {
            Log.e("ChooserServiceCompat", "Failed to retrieve shortcuts: ", e11);
            return Collections.EMPTY_LIST;
        }
    }
}
