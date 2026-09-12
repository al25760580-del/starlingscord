package eh;

import android.content.Context;
import android.view.SubMenu;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends n.j {
    public final int A;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Class f8225z;

    public f(Context context, Class cls, int i7) {
        super(context);
        this.f8225z = cls;
        this.A = i7;
    }

    @Override // n.j
    public final n.l a(int i7, int i10, int i11, CharSequence charSequence) {
        int size = this.f16147f.size() + 1;
        int i12 = this.A;
        if (size > i12) {
            String simpleName = this.f8225z.getSimpleName();
            throw new IllegalArgumentException(com.discord.chat.presentation.list.a.k(a3.e.t("Maximum number of items supported by ", simpleName, " is ", i12, ". Limit can be checked with "), simpleName, "#getMaxItemCount()"));
        }
        w();
        n.l lVarA = super.a(i7, i10, i11, charSequence);
        v();
        return lVarA;
    }

    @Override // n.j, android.view.Menu
    public final SubMenu addSubMenu(int i7, int i10, int i11, CharSequence charSequence) {
        throw new UnsupportedOperationException(this.f8225z.getSimpleName().concat(" does not support submenus"));
    }
}
