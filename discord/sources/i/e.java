package i;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertController$RecycleListView;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f11198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11199b;

    public e(Context context) {
        this(context, f.e(context, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.widget.ListAdapter] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    @NonNull
    public f create() {
        b bVar = this.f11198a;
        f fVar = new f(bVar.f11148a, this.f11199b);
        View view = bVar.f11152e;
        d dVar = fVar.f11208x;
        if (view != null) {
            dVar.f11193w = view;
        } else {
            CharSequence charSequence = bVar.f11151d;
            if (charSequence != null) {
                dVar.f11176d = charSequence;
                TextView textView = dVar.f11191u;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = bVar.f11150c;
            if (drawable != null) {
                dVar.f11189s = drawable;
                ImageView imageView = dVar.f11190t;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    dVar.f11190t.setImageDrawable(drawable);
                }
            }
        }
        String str = bVar.f11153f;
        if (str != null) {
            dVar.f11177e = str;
            TextView textView2 = dVar.f11192v;
            if (textView2 != null) {
                textView2.setText(str);
            }
        }
        CharSequence charSequence2 = bVar.f11154g;
        if (charSequence2 != null) {
            dVar.c(-1, charSequence2, bVar.f11155h);
        }
        CharSequence charSequence3 = bVar.f11156i;
        if (charSequence3 != null) {
            dVar.c(-2, charSequence3, bVar.j);
        }
        String str2 = bVar.k;
        if (str2 != null) {
            dVar.c(-3, str2, bVar.f11157l);
        }
        if (bVar.f11159n != null || bVar.f11160o != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) bVar.f11149b.inflate(dVar.A, (ViewGroup) null);
            int i7 = bVar.f11163r ? dVar.B : dVar.C;
            Object obj = bVar.f11160o;
            ?? cVar = obj;
            if (obj == null) {
                cVar = new c(bVar.f11148a, i7, R.id.text1, bVar.f11159n);
            }
            dVar.f11194x = cVar;
            dVar.f11195y = bVar.f11164s;
            if (bVar.f11161p != null) {
                alertController$RecycleListView.setOnItemClickListener(new a(bVar, dVar));
            }
            if (bVar.f11163r) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            dVar.f11178f = alertController$RecycleListView;
        }
        View view2 = bVar.f11162q;
        if (view2 != null) {
            dVar.f11179g = view2;
            dVar.f11180h = false;
        }
        fVar.setCancelable(true);
        fVar.setCanceledOnTouchOutside(true);
        fVar.setOnCancelListener(null);
        fVar.setOnDismissListener(null);
        n.k kVar = bVar.f11158m;
        if (kVar != null) {
            fVar.setOnKeyListener(kVar);
        }
        return fVar;
    }

    @NonNull
    public Context getContext() {
        return this.f11198a.f11148a;
    }

    public e setNegativeButton(int i7, DialogInterface.OnClickListener onClickListener) {
        b bVar = this.f11198a;
        bVar.f11156i = bVar.f11148a.getText(i7);
        bVar.j = onClickListener;
        return this;
    }

    public e setPositiveButton(int i7, DialogInterface.OnClickListener onClickListener) {
        b bVar = this.f11198a;
        bVar.f11154g = bVar.f11148a.getText(i7);
        bVar.f11155h = onClickListener;
        return this;
    }

    public e setTitle(CharSequence charSequence) {
        this.f11198a.f11151d = charSequence;
        return this;
    }

    public e setView(View view) {
        this.f11198a.f11162q = view;
        return this;
    }

    public e(@NonNull Context context, int i7) {
        this.f11198a = new b(new ContextThemeWrapper(context, f.e(context, i7)));
        this.f11199b = i7;
    }
}
