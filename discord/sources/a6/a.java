package a6;

import android.view.View;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f281d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function0 f282e;

    public /* synthetic */ a(int i7, Function0 function0) {
        this.f281d = i7;
        this.f282e = function0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f281d) {
            case 0:
                this.f282e.invoke();
                break;
            case 1:
                this.f282e.invoke();
                break;
            case 2:
                this.f282e.invoke();
                break;
            case 3:
                this.f282e.invoke();
                break;
            case 4:
                this.f282e.invoke();
                break;
            case 5:
                this.f282e.invoke();
                break;
            default:
                this.f282e.invoke();
                break;
        }
    }
}
