package t7;

import android.view.View;
import com.discord.reactions.ReactionView;
import com.discord.reactions.ReactionViewHolder;
import com.discord.reactions.ShortcutsFlexbox;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements View.OnLongClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f20659d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function1 f20660e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ReactionView.Reaction f20661i;

    public /* synthetic */ b(Function1 function1, ReactionView.Reaction reaction, int i7) {
        this.f20659d = i7;
        this.f20660e = function1;
        this.f20661i = reaction;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.f20659d) {
            case 0:
                return ReactionViewHolder.bind$lambda$2$lambda$1(this.f20660e, this.f20661i, view);
            default:
                return ShortcutsFlexbox.setReactions$lambda$4$lambda$3(this.f20660e, this.f20661i, view);
        }
    }
}
