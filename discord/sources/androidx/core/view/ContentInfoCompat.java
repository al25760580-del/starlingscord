package androidx.core.view;

import android.content.ClipData;
import android.content.ClipDescription;
import android.os.Build;
import android.util.Pair;
import android.view.ContentInfo;
import androidx.core.util.Predicate;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ContentInfoCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f1583a;

    public ContentInfoCompat(g gVar) {
        this.f1583a = gVar;
    }

    public static ClipData a(ClipDescription clipDescription, ArrayList arrayList) {
        ClipData clipData = new ClipData(new ClipDescription(clipDescription), (ClipData.Item) arrayList.get(0));
        for (int i7 = 1; i7 < arrayList.size(); i7++) {
            clipData.addItem((ClipData.Item) arrayList.get(i7));
        }
        return clipData;
    }

    public final Pair b(Predicate predicate) {
        e dVar;
        e dVar2;
        g gVar = this.f1583a;
        ClipData clipDataF = gVar.f();
        if (clipDataF.getItemCount() == 1) {
            boolean zTest = predicate.test(clipDataF.getItemAt(0));
            return Pair.create(zTest ? this : null, zTest ? null : this);
        }
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        for (int i7 = 0; i7 < clipDataF.getItemCount(); i7++) {
            ClipData.Item itemAt = clipDataF.getItemAt(i7);
            if (predicate.test(itemAt)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(itemAt);
            } else {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(itemAt);
            }
        }
        Pair pairCreate = arrayList == null ? Pair.create(null, clipDataF) : arrayList2 == null ? Pair.create(clipDataF, null) : Pair.create(a(clipDataF.getDescription(), arrayList), a(clipDataF.getDescription(), arrayList2));
        if (pairCreate.first == null) {
            return Pair.create(null, this);
        }
        if (pairCreate.second == null) {
            return Pair.create(this, null);
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            dVar = new d(this);
        } else {
            f fVar = new f();
            fVar.f1654b = gVar.f();
            fVar.f1655c = gVar.d();
            fVar.f1656d = gVar.g();
            fVar.f1657e = gVar.e();
            fVar.f1658f = gVar.getExtras();
            dVar = fVar;
        }
        dVar.c((ClipData) pairCreate.first);
        ContentInfoCompat contentInfoCompatBuild = dVar.build();
        if (i10 >= 31) {
            dVar2 = new d(this);
        } else {
            f fVar2 = new f();
            fVar2.f1654b = gVar.f();
            fVar2.f1655c = gVar.d();
            fVar2.f1656d = gVar.g();
            fVar2.f1657e = gVar.e();
            fVar2.f1658f = gVar.getExtras();
            dVar2 = fVar2;
        }
        dVar2.c((ClipData) pairCreate.second);
        return Pair.create(contentInfoCompatBuild, dVar2.build());
    }

    public final ContentInfo c() {
        ContentInfo contentInfoH = this.f1583a.h();
        Objects.requireNonNull(contentInfoH);
        return contentInfoH;
    }

    public final String toString() {
        return this.f1583a.toString();
    }
}
