package t7;

import android.view.View;
import com.discord.reactions.ReactionView;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f20656d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function1 f20657e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ReactionView.Reaction f20658i;

    public /* synthetic */ a(Function1 function1, ReactionView.Reaction reaction, int i7) {
        this.f20656d = i7;
        this.f20657e = function1;
        this.f20658i = reaction;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f20656d) {
            case 0:
                this.f20657e.invoke(this.f20658i);
                break;
            default:
                this.f20657e.invoke(this.f20658i);
                break;
        }
    }
}
