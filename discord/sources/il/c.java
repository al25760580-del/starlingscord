package il;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import androidx.core.content.FileProvider;
import androidx.fragment.app.v0;
import f.i;
import g.g;
import java.io.File;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;
import org.webrtc.MediaStreamTrack;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements Callable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11839d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Activity f11840e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e f11841i;

    public /* synthetic */ c(e eVar, Activity activity, int i7) {
        this.f11839d = i7;
        this.f11841i = eVar;
        this.f11840e = activity;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str;
        File fileD;
        g mediaType;
        Intent intentD;
        int i7;
        switch (this.f11839d) {
            case 0:
                Activity activity = this.f11840e;
                e eVar = this.f11841i;
                f fVar = eVar.f11849c0;
                try {
                    if (eVar.f11850d.equals(MediaStreamTrack.VIDEO_TRACK_KIND)) {
                        str = "android.media.action.VIDEO_CAPTURE";
                        fileD = eVar.e();
                    } else {
                        str = "android.media.action.IMAGE_CAPTURE";
                        fileD = eVar.d();
                    }
                    Intent intent = new Intent(str);
                    Uri uriForFile = FileProvider.getUriForFile(activity, activity.getApplicationContext().getPackageName() + ".provider", fileD);
                    eVar.a0 = uriForFile;
                    intent.putExtra("output", uriForFile);
                    if (eVar.J) {
                        intent.putExtra("android.intent.extras.CAMERA_FACING", 1);
                        intent.putExtra("android.intent.extras.LENS_FACING_FRONT", 1);
                        intent.putExtra("android.intent.extra.USE_FRONT_CAMERA", true);
                    }
                    if (intent.resolveActivity(activity.getPackageManager()) != null) {
                        activity.startActivityForResult(intent, 61111);
                    } else {
                        fVar.c("E_CANNOT_LAUNCH_CAMERA", "Cannot launch camera");
                    }
                } catch (Exception e10) {
                    fVar.b("E_FAILED_TO_OPEN_CAMERA", e10);
                    return null;
                }
                break;
            default:
                e eVar2 = this.f11841i;
                eVar2.getClass();
                try {
                    int iA = e.e.a();
                    boolean zEquals = eVar2.f11850d.equals(MediaStreamTrack.VIDEO_TRACK_KIND);
                    g.d mediaType2 = g.d.f9432a;
                    if (zEquals) {
                        mediaType = g.f.f9434a;
                        Intrinsics.checkNotNullParameter(mediaType, "mediaType");
                    } else if (eVar2.f11850d.equals("photo") || eVar2.f11856w) {
                        mediaType = g.e.f9433a;
                        Intrinsics.checkNotNullParameter(mediaType, "mediaType");
                    } else {
                        Intrinsics.checkNotNullParameter(mediaType2, "mediaType");
                        mediaType = mediaType2;
                    }
                    boolean z5 = eVar2.f11852e;
                    g.c cVar = g.c.f9431a;
                    Activity activity2 = this.f11840e;
                    if (!z5 || (i7 = eVar2.Z) <= 1) {
                        v0 v0Var = new v0(1);
                        i iVar = new i();
                        iVar.f8778a = mediaType2;
                        iVar.f8779b = e.e.a();
                        iVar.f8780c = cVar;
                        Intrinsics.checkNotNullParameter(mediaType, "<set-?>");
                        iVar.f8778a = mediaType;
                        iVar.f8779b = iA;
                        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
                        iVar.f8780c = cVar;
                        intentD = v0Var.d(activity2, iVar);
                    } else {
                        g.b bVar = new g.b(i7);
                        i iVar2 = new i();
                        iVar2.f8778a = mediaType2;
                        iVar2.f8779b = e.e.a();
                        iVar2.f8780c = cVar;
                        Intrinsics.checkNotNullParameter(mediaType, "<set-?>");
                        iVar2.f8778a = mediaType;
                        iVar2.f8779b = iA;
                        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
                        iVar2.f8780c = cVar;
                        intentD = bVar.a(activity2, iVar2);
                    }
                    activity2.startActivityForResult(intentD, 61110);
                } catch (Exception e11) {
                    eVar2.f11849c0.b("E_FAILED_TO_SHOW_PICKER", e11);
                    return null;
                }
                break;
        }
        return null;
    }
}
