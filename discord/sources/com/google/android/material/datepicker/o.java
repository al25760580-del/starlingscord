package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.core.view.e1;
import androidx.core.view.l0;
import androidx.core.view.u0;
import androidx.fragment.app.DialogFragment;
import com.discord.R;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class o<S> extends DialogFragment {
    public CharSequence E;
    public boolean F;
    public int G;
    public int H;
    public CharSequence I;
    public int J;
    public CharSequence K;
    public int L;
    public CharSequence M;
    public int N;
    public CharSequence O;
    public TextView P;
    public TextView Q;
    public CheckableImageButton R;
    public kh.i S;
    public boolean T;
    public CharSequence U;
    public CharSequence V;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f6366d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f6367e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f6368i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public v f6369v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public b f6370w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public m f6371x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f6372y;

    public o() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.f6366d = new LinkedHashSet();
        this.f6367e = new LinkedHashSet();
    }

    public static int v(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar calendarB = z.b();
        calendarB.set(5, 1);
        Calendar calendarA = z.a(calendarB);
        calendarA.get(2);
        calendarA.get(1);
        int maximum = calendarA.getMaximum(7);
        calendarA.getActualMaximum(5);
        calendarA.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public static boolean w(Context context, int i7) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(com.facebook.imagepipeline.nativecode.b.x(context, m.class.getCanonicalName(), R.attr.materialCalendarStyle).data, new int[]{i7});
        boolean z5 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z5;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f6366d.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f6368i = bundle.getInt("OVERRIDE_THEME_RES_ID");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f6370w = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f6372y = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.E = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.G = bundle.getInt("INPUT_MODE_KEY");
        this.H = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.I = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.J = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.K = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.L = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.M = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.N = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.O = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence text = this.E;
        if (text == null) {
            text = requireContext().getResources().getText(this.f6372y);
        }
        this.U = text;
        if (text != null) {
            CharSequence[] charSequenceArrSplit = TextUtils.split(String.valueOf(text), ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
            if (charSequenceArrSplit.length > 1) {
                text = charSequenceArrSplit[0];
            }
        } else {
            text = null;
        }
        this.V = text;
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Context contextRequireContext = requireContext();
        requireContext();
        int i7 = this.f6368i;
        if (i7 == 0) {
            u();
            throw null;
        }
        Dialog dialog = new Dialog(contextRequireContext, i7);
        Context context = dialog.getContext();
        this.F = w(context, android.R.attr.windowFullscreen);
        this.S = new kh.i(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, kg.a.f14446s, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        int color = typedArrayObtainStyledAttributes.getColor(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.S.m(context);
        this.S.q(ColorStateList.valueOf(color));
        this.S.p(dialog.getWindow().getDecorView().getElevation());
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(this.F ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = viewInflate.getContext();
        if (this.F) {
            viewInflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(v(context), -2));
        } else {
            viewInflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(v(context), -1));
        }
        TextView textView = (TextView) viewInflate.findViewById(R.id.mtrl_picker_header_selection_text);
        this.Q = textView;
        textView.setAccessibilityLiveRegion(1);
        this.R = (CheckableImageButton) viewInflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.P = (TextView) viewInflate.findViewById(R.id.mtrl_picker_title_text);
        this.R.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.R;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, mf.f.u(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], mf.f.u(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.R.setChecked(this.G != 0);
        u0.p(this.R, null);
        CheckableImageButton checkableImageButton2 = this.R;
        this.R.setContentDescription(this.G == 1 ? checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
        this.R.setOnClickListener(new com.discord.chat.presentation.list.delegate.b(5, this));
        u();
        throw null;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f6367e.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f6368i);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        b bVar = this.f6370w;
        a aVar = new a();
        int i7 = a.f6324b;
        int i10 = a.f6324b;
        long j = bVar.f6327d.f6380x;
        long j5 = bVar.f6328e.f6380x;
        aVar.f6325a = Long.valueOf(bVar.f6330v.f6380x);
        int i11 = bVar.f6331w;
        d dVar = bVar.f6329i;
        m mVar = this.f6371x;
        q qVar = mVar == null ? null : mVar.f6357v;
        if (qVar != null) {
            aVar.f6325a = Long.valueOf(qVar.f6380x);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", dVar);
        q qVarH = q.h(j);
        q qVarH2 = q.h(j5);
        d dVar2 = (d) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l6 = aVar.f6325a;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new b(qVarH, qVarH2, dVar2, l6 == null ? null : q.h(l6.longValue()), i11));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f6372y);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.E);
        bundle.putInt("INPUT_MODE_KEY", this.G);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.H);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.I);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.J);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.K);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.L);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.M);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.N);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.O);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        v vVar;
        super.onStart();
        Window window = requireDialog().getWindow();
        if (this.F) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.S);
            if (!this.T) {
                View viewFindViewById = requireView().findViewById(R.id.fullscreen_header);
                ColorStateList colorStateListB = e1.b(viewFindViewById.getBackground());
                Integer numValueOf = colorStateListB != null ? Integer.valueOf(colorStateListB.getDefaultColor()) : null;
                boolean z5 = false;
                boolean z6 = numValueOf == null || numValueOf.intValue() == 0;
                int iX = io.sentry.config.a.x(window.getContext(), android.R.attr.colorBackground, -16777216);
                if (z6) {
                    numValueOf = Integer.valueOf(iX);
                }
                e1.k(window, false);
                window.getContext();
                int iE = Build.VERSION.SDK_INT < 27 ? b1.c.e(io.sentry.config.a.x(window.getContext(), android.R.attr.navigationBarColor, -16777216), IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) : 0;
                window.setStatusBarColor(0);
                window.setNavigationBarColor(iE);
                new WindowInsetsControllerCompat(window, window.getDecorView()).c(io.sentry.config.a.K(0) || io.sentry.config.a.K(numValueOf.intValue()));
                boolean zK = io.sentry.config.a.K(iX);
                if (io.sentry.config.a.K(iE) || (iE == 0 && zK)) {
                    z5 = true;
                }
                new WindowInsetsControllerCompat(window, window.getDecorView()).b(z5);
                n nVar = new n(viewFindViewById, viewFindViewById.getLayoutParams().height, viewFindViewById.getPaddingLeft(), viewFindViewById.getPaddingTop(), viewFindViewById.getPaddingRight());
                WeakHashMap weakHashMap = u0.f1729a;
                l0.m(viewFindViewById, nVar);
                this.T = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.S, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new yg.a(requireDialog(), rect));
        }
        requireContext();
        int i7 = this.f6368i;
        if (i7 == 0) {
            u();
            throw null;
        }
        u();
        b bVar = this.f6370w;
        m mVar = new m();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i7);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", bVar.f6330v);
        mVar.setArguments(bundle);
        this.f6371x = mVar;
        if (this.G == 1) {
            vVar = mVar;
            u();
            b bVar2 = this.f6370w;
            p pVar = new p();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i7);
            bundle2.putParcelable("DATE_SELECTOR_KEY", null);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar2);
            pVar.setArguments(bundle2);
            vVar = pVar;
        }
        vVar = mVar;
        this.f6369v = vVar;
        this.P.setText((this.G == 1 && getResources().getConfiguration().orientation == 2) ? this.V : this.U);
        u();
        getContext();
        throw null;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        this.f6369v.f6394d.clear();
        super.onStop();
    }

    public final void u() {
        if (getArguments().getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
    }
}
