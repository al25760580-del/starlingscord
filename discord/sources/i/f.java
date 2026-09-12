package i;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.appcompat.widget.x1;
import androidx.core.view.m0;
import androidx.core.view.u0;
import androidx.core.widget.NestedScrollView;
import com.discord.R;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class f extends z implements DialogInterface {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final d f11208x;

    public f(ContextThemeWrapper contextThemeWrapper, int i7) {
        super(contextThemeWrapper, e(contextThemeWrapper, i7));
        this.f11208x = new d(getContext(), this, getWindow());
    }

    public static int e(Context context, int i7) {
        if (((i7 >>> 24) & 255) >= 1) {
            return i7;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // i.z, androidx.activity.ComponentDialog, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i7;
        ListAdapter listAdapter;
        View viewFindViewById;
        super.onCreate(bundle);
        d dVar = this.f11208x;
        dVar.f11174b.setContentView(dVar.f11196z);
        Context context = dVar.f11173a;
        Window window = dVar.f11175c;
        View viewFindViewById2 = window.findViewById(R.id.parentPanel);
        View viewFindViewById3 = viewFindViewById2.findViewById(R.id.topPanel);
        View viewFindViewById4 = viewFindViewById2.findViewById(R.id.contentPanel);
        View viewFindViewById5 = viewFindViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(R.id.customPanel);
        View view = dVar.f11179g;
        if (view == null) {
            view = null;
        }
        boolean z5 = view != null;
        if (!z5 || !d.a(view)) {
            window.setFlags(131072, 131072);
        }
        if (z5) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (dVar.f11180h) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (dVar.f11178f != null) {
                ((LinearLayout.LayoutParams) ((x1) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View viewFindViewById6 = viewGroup.findViewById(R.id.topPanel);
        View viewFindViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View viewFindViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup viewGroupB = d.b(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupB2 = d.b(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupB3 = d.b(viewFindViewById8, viewFindViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        dVar.f11188r = nestedScrollView;
        nestedScrollView.setFocusable(false);
        dVar.f11188r.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupB2.findViewById(android.R.id.message);
        dVar.f11192v = textView;
        if (textView != null) {
            String str = dVar.f11177e;
            if (str != null) {
                textView.setText(str);
            } else {
                textView.setVisibility(8);
                dVar.f11188r.removeView(dVar.f11192v);
                if (dVar.f11178f != null) {
                    ViewGroup viewGroup2 = (ViewGroup) dVar.f11188r.getParent();
                    int iIndexOfChild = viewGroup2.indexOfChild(dVar.f11188r);
                    viewGroup2.removeViewAt(iIndexOfChild);
                    viewGroup2.addView(dVar.f11178f, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    viewGroupB2.setVisibility(8);
                }
            }
        }
        Button button = (Button) viewGroupB3.findViewById(android.R.id.button1);
        dVar.f11181i = button;
        androidx.appcompat.widget.b bVar = dVar.F;
        button.setOnClickListener(bVar);
        if (TextUtils.isEmpty(dVar.j)) {
            dVar.f11181i.setVisibility(8);
            i7 = 0;
        } else {
            dVar.f11181i.setText(dVar.j);
            dVar.f11181i.setVisibility(0);
            i7 = 1;
        }
        Button button2 = (Button) viewGroupB3.findViewById(android.R.id.button2);
        dVar.f11182l = button2;
        button2.setOnClickListener(bVar);
        if (TextUtils.isEmpty(dVar.f11183m)) {
            dVar.f11182l.setVisibility(8);
        } else {
            dVar.f11182l.setText(dVar.f11183m);
            dVar.f11182l.setVisibility(0);
            i7 |= 2;
        }
        Button button3 = (Button) viewGroupB3.findViewById(android.R.id.button3);
        dVar.f11185o = button3;
        button3.setOnClickListener(bVar);
        if (TextUtils.isEmpty(dVar.f11186p)) {
            dVar.f11185o.setVisibility(8);
        } else {
            dVar.f11185o.setText(dVar.f11186p);
            dVar.f11185o.setVisibility(0);
            i7 |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i7 == 1) {
                Button button4 = dVar.f11181i;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (i7 == 2) {
                Button button5 = dVar.f11182l;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i7 == 4) {
                Button button6 = dVar.f11185o;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i7 == 0) {
            viewGroupB3.setVisibility(8);
        }
        if (dVar.f11193w != null) {
            viewGroupB.addView(dVar.f11193w, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            dVar.f11190t = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(dVar.f11176d) || !dVar.D) {
                window.findViewById(R.id.title_template).setVisibility(8);
                dVar.f11190t.setVisibility(8);
                viewGroupB.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                dVar.f11191u = textView2;
                textView2.setText(dVar.f11176d);
                Drawable drawable = dVar.f11189s;
                if (drawable != null) {
                    dVar.f11190t.setImageDrawable(drawable);
                } else {
                    dVar.f11191u.setPadding(dVar.f11190t.getPaddingLeft(), dVar.f11190t.getPaddingTop(), dVar.f11190t.getPaddingRight(), dVar.f11190t.getPaddingBottom());
                    dVar.f11190t.setVisibility(8);
                }
            }
        }
        boolean z6 = viewGroup.getVisibility() != 8;
        int i10 = (viewGroupB == null || viewGroupB.getVisibility() == 8) ? 0 : 1;
        boolean z7 = viewGroupB3.getVisibility() != 8;
        if (!z7 && (viewFindViewById = viewGroupB2.findViewById(R.id.textSpacerNoButtons)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (i10 != 0) {
            NestedScrollView nestedScrollView2 = dVar.f11188r;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View viewFindViewById9 = (dVar.f11177e == null && dVar.f11178f == null) ? null : viewGroupB.findViewById(R.id.titleDividerNoCustom);
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            View viewFindViewById10 = viewGroupB2.findViewById(R.id.textSpacerNoTitle);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = dVar.f11178f;
        if (alertController$RecycleListView != null && (!z7 || i10 == 0)) {
            alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i10 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.f730d, alertController$RecycleListView.getPaddingRight(), z7 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.f731e);
        }
        if (!z6) {
            View view2 = dVar.f11178f;
            if (view2 == null) {
                view2 = dVar.f11188r;
            }
            if (view2 != null) {
                int i11 = z7 ? 2 : 0;
                View viewFindViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View viewFindViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = u0.f1729a;
                m0.b(view2, i10 | i11, 3);
                if (viewFindViewById11 != null) {
                    viewGroupB2.removeView(viewFindViewById11);
                }
                if (viewFindViewById12 != null) {
                    viewGroupB2.removeView(viewFindViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = dVar.f11178f;
        if (alertController$RecycleListView2 == null || (listAdapter = dVar.f11194x) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i12 = dVar.f11195y;
        if (i12 > -1) {
            alertController$RecycleListView2.setItemChecked(i12, true);
            alertController$RecycleListView2.setSelection(i12);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i7, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f11208x.f11188r;
        if (nestedScrollView == null || !nestedScrollView.executeKeyEvent(keyEvent)) {
            return super.onKeyDown(i7, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i7, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f11208x.f11188r;
        if (nestedScrollView == null || !nestedScrollView.executeKeyEvent(keyEvent)) {
            return super.onKeyUp(i7, keyEvent);
        }
        return true;
    }

    @Override // i.z, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        d dVar = this.f11208x;
        dVar.f11176d = charSequence;
        TextView textView = dVar.f11191u;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
