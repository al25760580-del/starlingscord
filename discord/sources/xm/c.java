package xm;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.util.Log;
import com.facebook.common.references.CloseableReference;
import com.facebook.datasource.DataSource;
import kotlin.jvm.internal.Intrinsics;
import na.d;
import na.g;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends x8.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f22982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vm.a f22983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Uri f22984c;

    public c(Context context, vm.a aVar, Uri uri) {
        this.f22982a = context;
        this.f22983b = aVar;
        this.f22984c = uri;
    }

    @Override // x8.b
    public final void onFailureImpl(DataSource dataSource) {
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        Log.e("[RNScreens]", "Error loading image: " + this.f22984c, dataSource.b());
    }

    @Override // x8.b
    public final void onNewResultImpl(DataSource dataSource) {
        CloseableReference closeableReference;
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        if (dataSource.isFinished() && (closeableReference = (CloseableReference) dataSource.getResult()) != null) {
            Object objQ = closeableReference.q();
            Intrinsics.checkNotNullExpressionValue(objQ, "get(...)");
            na.c cVar = (na.c) objQ;
            if (cVar instanceof d) {
                Bitmap bitmap = ((g) ((d) cVar)).f16528w;
                Intrinsics.checkNotNullExpressionValue(bitmap, "getUnderlyingBitmap(...)");
                Resources resources = this.f22982a.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                this.f22983b.invoke(new BitmapDrawable(resources, bitmap));
            }
            closeableReference.close();
        }
    }
}
