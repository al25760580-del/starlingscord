package ze;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 extends Fragment implements f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final WeakHashMap f23926e = new WeakHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a1.d f23927d = new a1.d();

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = ((Map) this.f23927d.f18i).values().iterator();
        while (it.hasNext()) {
            ((k) it.next()).getClass();
        }
    }

    @Override // ze.f
    public final k f() {
        return (k) k.class.cast(((Map) this.f23927d.f18i).get("ConnectionlessLifecycleHelper"));
    }

    @Override // ze.f
    public final Activity h() {
        return getActivity();
    }

    @Override // ze.f
    public final void j(k kVar) {
        this.f23927d.C(kVar);
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i7, int i10, Intent intent) {
        super.onActivityResult(i7, i10, intent);
        this.f23927d.E(i7, i10, intent);
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f23927d.D(bundle);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a1.d dVar = this.f23927d;
        dVar.f17e = 5;
        Iterator it = ((Map) dVar.f18i).values().iterator();
        while (it.hasNext()) {
            ((k) it.next()).getClass();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        a1.d dVar = this.f23927d;
        dVar.f17e = 3;
        Iterator it = ((Map) dVar.f18i).values().iterator();
        while (it.hasNext()) {
            ((k) it.next()).d();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f23927d.F(bundle);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        a1.d dVar = this.f23927d;
        dVar.f17e = 2;
        for (k kVar : ((Map) dVar.f18i).values()) {
            kVar.f23938e = true;
            kVar.d();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a1.d dVar = this.f23927d;
        dVar.f17e = 4;
        Iterator it = ((Map) dVar.f18i).values().iterator();
        while (it.hasNext()) {
            ((k) it.next()).c();
        }
    }
}
