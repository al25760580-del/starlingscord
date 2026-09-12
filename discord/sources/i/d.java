package i;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import com.discord.R;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public final int A;
    public final int B;
    public final int C;
    public final boolean D;
    public final bd.d E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f11173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f11174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Window f11175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CharSequence f11176d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f11177e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public AlertController$RecycleListView f11178f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View f11179g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Button f11181i;
    public CharSequence j;
    public Message k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Button f11182l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public CharSequence f11183m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Message f11184n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Button f11185o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public CharSequence f11186p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Message f11187q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public NestedScrollView f11188r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Drawable f11189s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ImageView f11190t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public TextView f11191u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public TextView f11192v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public View f11193w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ListAdapter f11194x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f11196z;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f11180h = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f11195y = -1;
    public final androidx.appcompat.widget.b F = new androidx.appcompat.widget.b(6, this);

    public d(Context context, f fVar, Window window) {
        this.f11173a = context;
        this.f11174b = fVar;
        this.f11175c = window;
        bd.d dVar = new bd.d();
        dVar.f3138b = new WeakReference(fVar);
        this.E = dVar;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, h.a.f10257e, R.attr.alertDialogStyle, 0);
        this.f11196z = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.getResourceId(2, 0);
        this.A = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.B = typedArrayObtainStyledAttributes.getResourceId(7, 0);
        this.C = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        this.D = typedArrayObtainStyledAttributes.getBoolean(6, true);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        fVar.c().v(1);
    }

    public static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static ViewGroup b(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public final void c(int i7, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message messageObtainMessage = onClickListener != null ? this.E.obtainMessage(i7, onClickListener) : null;
        if (i7 == -3) {
            this.f11186p = charSequence;
            this.f11187q = messageObtainMessage;
        } else if (i7 == -2) {
            this.f11183m = charSequence;
            this.f11184n = messageObtainMessage;
        } else {
            if (i7 != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.j = charSequence;
            this.k = messageObtainMessage;
        }
    }
}
