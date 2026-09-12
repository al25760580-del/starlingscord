package sh;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.discord.js_watchdog.SharedPreferencesKey;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h extends bg.a implements th.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ig.g f20049g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ m f20050h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(m mVar, ig.g gVar) {
        super("com.google.android.play.core.assetpacks.protocol.IAssetModuleServiceCallback", 4);
        this.f20050h = mVar;
        this.f20049g = gVar;
    }

    @Override // th.l
    public void a(Bundle bundle, Bundle bundle2) {
        this.f20050h.f20100e.d(this.f20049g);
        m.f20094g.d("onKeepAlive(%b)", Boolean.valueOf(bundle.getBoolean("keep_alive")));
    }

    @Override // th.l
    public void b(int i7, Bundle bundle) {
        this.f20050h.f20099d.d(this.f20049g);
        m.f20094g.d("onStartDownload(%d)", Integer.valueOf(i7));
    }

    @Override // th.l
    public void c(List list) {
        this.f20050h.f20099d.d(this.f20049g);
        m.f20094g.d("onGetSessionStates", new Object[0]);
    }

    @Override // th.l
    public void m(Bundle bundle) {
        th.q qVar = this.f20050h.f20099d;
        ig.g gVar = this.f20049g;
        qVar.d(gVar);
        int i7 = bundle.getInt("error_code");
        m.f20094g.b("onError(%d)", Integer.valueOf(i7));
        gVar.c(new ph.a(i7, 1));
    }

    @Override // th.l
    public void o(Bundle bundle, Bundle bundle2) {
        this.f20050h.f20099d.d(this.f20049g);
        m.f20094g.d("onGetChunkFileDescriptor", new Object[0]);
    }

    @Override // bg.a
    public final boolean r(int i7, Parcel parcel) {
        ig.g gVar = this.f20049g;
        m mVar = this.f20050h;
        switch (i7) {
            case 2:
                int i10 = parcel.readInt();
                Parcelable.Creator creator = Bundle.CREATOR;
                Bundle bundle = (Bundle) th.h.a(parcel);
                th.h.b(parcel);
                b(i10, bundle);
                return true;
            case 3:
                int i11 = parcel.readInt();
                Parcelable.Creator creator2 = Bundle.CREATOR;
                th.h.b(parcel);
                mVar.f20099d.d(gVar);
                m.f20094g.d("onCancelDownload(%d)", Integer.valueOf(i11));
                return true;
            case 4:
                int i12 = parcel.readInt();
                Parcelable.Creator creator3 = Bundle.CREATOR;
                th.h.b(parcel);
                mVar.f20099d.d(gVar);
                m.f20094g.d("onGetSession(%d)", Integer.valueOf(i12));
                return true;
            case 5:
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(Bundle.CREATOR);
                th.h.b(parcel);
                c(arrayListCreateTypedArrayList);
                return true;
            case 6:
                Parcelable.Creator creator4 = Bundle.CREATOR;
                Bundle bundle2 = (Bundle) th.h.a(parcel);
                th.h.b(parcel);
                mVar.f20099d.d(gVar);
                m.f20094g.d("onNotifyChunkTransferred(%s, %s, %d, session=%d)", bundle2.getString("module_name"), bundle2.getString("slice_id"), Integer.valueOf(bundle2.getInt("chunk_number")), Integer.valueOf(bundle2.getInt(SharedPreferencesKey.SESSION_ID)));
                return true;
            case 7:
                Parcelable.Creator creator5 = Bundle.CREATOR;
                Bundle bundle3 = (Bundle) th.h.a(parcel);
                th.h.b(parcel);
                m(bundle3);
                return true;
            case 8:
                Parcelable.Creator creator6 = Bundle.CREATOR;
                Bundle bundle4 = (Bundle) th.h.a(parcel);
                th.h.b(parcel);
                mVar.f20099d.d(gVar);
                m.f20094g.d("onNotifyModuleCompleted(%s, sessionId=%d)", bundle4.getString("module_name"), Integer.valueOf(bundle4.getInt(SharedPreferencesKey.SESSION_ID)));
                return true;
            case 9:
            default:
                return false;
            case 10:
                Parcelable.Creator creator7 = Bundle.CREATOR;
                Bundle bundle5 = (Bundle) th.h.a(parcel);
                th.h.b(parcel);
                mVar.f20099d.d(gVar);
                m.f20094g.d("onNotifySessionFailed(%d)", Integer.valueOf(bundle5.getInt(SharedPreferencesKey.SESSION_ID)));
                return true;
            case 11:
                Parcelable.Creator creator8 = Bundle.CREATOR;
                Bundle bundle6 = (Bundle) th.h.a(parcel);
                Bundle bundle7 = (Bundle) th.h.a(parcel);
                th.h.b(parcel);
                a(bundle6, bundle7);
                return true;
            case 12:
                Parcelable.Creator creator9 = Bundle.CREATOR;
                Bundle bundle8 = (Bundle) th.h.a(parcel);
                Bundle bundle9 = (Bundle) th.h.a(parcel);
                th.h.b(parcel);
                o(bundle8, bundle9);
                return true;
            case 13:
                Parcelable.Creator creator10 = Bundle.CREATOR;
                th.h.b(parcel);
                mVar.f20099d.d(gVar);
                m.f20094g.d("onRequestDownloadInfo()", new Object[0]);
                return true;
            case 14:
                Parcelable.Creator creator11 = Bundle.CREATOR;
                th.h.b(parcel);
                mVar.f20099d.d(gVar);
                m.f20094g.d("onRemoveModule()", new Object[0]);
                return true;
            case 15:
                Parcelable.Creator creator12 = Bundle.CREATOR;
                th.h.b(parcel);
                mVar.f20099d.d(gVar);
                m.f20094g.d("onCancelDownloads()", new Object[0]);
                return true;
        }
    }
}
