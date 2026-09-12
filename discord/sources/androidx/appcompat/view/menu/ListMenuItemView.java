package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.R;
import e4.m;
import h.a;
import n.j;
import n.l;
import n.w;

/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements w, AbsListView.SelectionBoundsAdjuster {
    public ImageView E;
    public LinearLayout F;
    public final Drawable G;
    public final int H;
    public final Context I;
    public boolean J;
    public final Drawable K;
    public final boolean L;
    public LayoutInflater M;
    public boolean N;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public l f789d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ImageView f790e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public RadioButton f791i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public TextView f792v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public CheckBox f793w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public TextView f794x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ImageView f795y;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m mVarE = m.E(getContext(), attributeSet, a.f10268r, R.attr.listMenuViewStyle);
        this.G = mVarE.x(5);
        TypedArray typedArray = (TypedArray) mVarE.f7994i;
        this.H = typedArray.getResourceId(1, -1);
        this.J = typedArray.getBoolean(7, false);
        this.I = context;
        this.K = mVarE.x(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.L = typedArrayObtainStyledAttributes.hasValue(0);
        mVarE.H();
        typedArrayObtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.M == null) {
            this.M = LayoutInflater.from(getContext());
        }
        return this.M;
    }

    private void setSubMenuArrowVisible(boolean z5) {
        ImageView imageView = this.f795y;
        if (imageView != null) {
            imageView.setVisibility(z5 ? 0 : 8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0035  */
    /* JADX WARN: Code duplicated, block: B:25:0x0054  */
    /* JADX WARN: Code duplicated, block: B:28:0x0058  */
    @Override // n.w
    public final void a(l lVar) {
        boolean z5;
        int i7;
        String string;
        boolean z6;
        this.f789d = lVar;
        boolean zIsVisible = lVar.isVisible();
        j jVar = lVar.f16178n;
        setVisibility(zIsVisible ? 0 : 8);
        setTitle(lVar.f16171e);
        setCheckable(lVar.isCheckable());
        if (jVar.o()) {
            if ((jVar.n() ? lVar.j : lVar.f16174h) != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
        } else {
            z5 = false;
        }
        jVar.n();
        if (z5) {
            l lVar2 = this.f789d;
            j jVar2 = lVar2.f16178n;
            if (jVar2.o()) {
                if ((jVar2.n() ? lVar2.j : lVar2.f16174h) != 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
            } else {
                z6 = false;
            }
            i7 = z6 ? 0 : 8;
        }
        if (i7 == 0) {
            TextView textView = this.f794x;
            l lVar3 = this.f789d;
            j jVar3 = lVar3.f16178n;
            Context context = jVar3.f16142a;
            char c8 = jVar3.n() ? lVar3.j : lVar3.f16174h;
            if (c8 == 0) {
                string = "";
            } else {
                Resources resources = context.getResources();
                StringBuilder sb2 = new StringBuilder();
                if (ViewConfiguration.get(context).hasPermanentMenuKey()) {
                    sb2.append(resources.getString(R.string.abc_prepend_shortcut_label));
                }
                int i10 = jVar3.n() ? lVar3.k : lVar3.f16175i;
                l.c(sb2, i10, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label));
                l.c(sb2, i10, RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT, resources.getString(R.string.abc_menu_ctrl_shortcut_label));
                l.c(sb2, i10, 2, resources.getString(R.string.abc_menu_alt_shortcut_label));
                l.c(sb2, i10, 1, resources.getString(R.string.abc_menu_shift_shortcut_label));
                l.c(sb2, i10, 4, resources.getString(R.string.abc_menu_sym_shortcut_label));
                l.c(sb2, i10, 8, resources.getString(R.string.abc_menu_function_shortcut_label));
                if (c8 == '\b') {
                    sb2.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                } else if (c8 == '\n') {
                    sb2.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                } else if (c8 != ' ') {
                    sb2.append(c8);
                } else {
                    sb2.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                }
                string = sb2.toString();
            }
            textView.setText(string);
        }
        if (this.f794x.getVisibility() != i7) {
            this.f794x.setVisibility(i7);
        }
        setIcon(lVar.getIcon());
        setEnabled(lVar.isEnabled());
        setSubMenuArrowVisible(lVar.hasSubMenu());
        setContentDescription(lVar.f16181q);
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.E;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.E.getLayoutParams();
        rect.top = this.E.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    @Override // n.w
    public l getItemData() {
        return this.f789d;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.G);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f792v = textView;
        int i7 = this.H;
        if (i7 != -1) {
            textView.setTextAppearance(this.I, i7);
        }
        this.f794x = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f795y = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.K);
        }
        this.E = (ImageView) findViewById(R.id.group_divider);
        this.F = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        if (this.f790e != null && this.J) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f790e.getLayoutParams();
            int i11 = layoutParams.height;
            if (i11 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i11;
            }
        }
        super.onMeasure(i7, i10);
    }

    public void setCheckable(boolean z5) {
        CompoundButton compoundButton;
        View view;
        if (!z5 && this.f791i == null && this.f793w == null) {
            return;
        }
        if ((this.f789d.f16188x & 4) != 0) {
            if (this.f791i == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f791i = radioButton;
                LinearLayout linearLayout = this.F;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f791i;
            view = this.f793w;
        } else {
            if (this.f793w == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f793w = checkBox;
                LinearLayout linearLayout2 = this.F;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f793w;
            view = this.f791i;
        }
        if (z5) {
            compoundButton.setChecked(this.f789d.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f793w;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f791i;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z5) {
        CompoundButton compoundButton;
        if ((this.f789d.f16188x & 4) != 0) {
            if (this.f791i == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f791i = radioButton;
                LinearLayout linearLayout = this.F;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f791i;
        } else {
            if (this.f793w == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f793w = checkBox;
                LinearLayout linearLayout2 = this.F;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f793w;
        }
        compoundButton.setChecked(z5);
    }

    public void setForceShowIcon(boolean z5) {
        this.N = z5;
        this.J = z5;
    }

    public void setGroupDividerEnabled(boolean z5) {
        ImageView imageView = this.E;
        if (imageView != null) {
            imageView.setVisibility((this.L || !z5) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        j jVar = this.f789d.f16178n;
        boolean z5 = this.N;
        if (z5 || this.J) {
            ImageView imageView = this.f790e;
            if (imageView == null && drawable == null && !this.J) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f790e = imageView2;
                LinearLayout linearLayout = this.F;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.J) {
                this.f790e.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f790e;
            if (!z5) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f790e.getVisibility() != 0) {
                this.f790e.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f792v.getVisibility() != 8) {
                this.f792v.setVisibility(8);
            }
        } else {
            this.f792v.setText(charSequence);
            if (this.f792v.getVisibility() != 0) {
                this.f792v.setVisibility(0);
            }
        }
    }
}
