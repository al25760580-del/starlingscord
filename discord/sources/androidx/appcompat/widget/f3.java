package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import com.discord.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class f3 extends y1 implements m.a {
    public static final b3 G0;
    public int A0;
    public SearchableInfo B0;
    public Bundle C0;
    public final s2 D0;
    public final s2 E0;
    public final WeakHashMap F0;
    public final SearchView$SearchAutoComplete M;
    public final View N;
    public final View O;
    public final View P;
    public final ImageView Q;
    public final ImageView R;
    public final ImageView S;
    public final ImageView T;
    public final View U;
    public e3 V;
    public final Rect W;
    public final Rect a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final int[] f952b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final int[] f953c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final ImageView f954d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final Drawable f955e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final int f956f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final int f957g0;
    public final Intent h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final Intent f958i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final CharSequence f959j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public z2 f960k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public y2 f961l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public View.OnFocusChangeListener f962m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public View.OnClickListener f963n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public boolean f964o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public boolean f965p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public b2.b f966q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f967r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public CharSequence f968s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f969t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f970u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public int f971v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public boolean f972w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public String f973x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public CharSequence f974y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public boolean f975z0;

    static {
        b3 b3Var = null;
        if (Build.VERSION.SDK_INT < 29) {
            b3 b3Var2 = new b3();
            b3Var2.f906a = null;
            b3Var2.f907b = null;
            b3Var2.f908c = null;
            b3.a();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
                b3Var2.f906a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
                b3Var2.f907b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                b3Var2.f908c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
            b3Var = b3Var2;
        }
        G0 = b3Var;
    }

    public f3(Context context) {
        super(context, null, R.attr.searchViewStyle);
        this.W = new Rect();
        this.a0 = new Rect();
        this.f952b0 = new int[2];
        this.f953c0 = new int[2];
        com.swmansion.rnscreens.c cVar = (com.swmansion.rnscreens.c) this;
        this.D0 = new s2(cVar, 0);
        this.E0 = new s2(cVar, 1);
        this.F0 = new WeakHashMap();
        int i7 = 1;
        b bVar = new b(i7, cVar);
        v2 v2Var = new v2(cVar);
        w2 w2Var = new w2(cVar);
        m0 m0Var = new m0(i7, cVar);
        z1 z1Var = new z1(i7, cVar);
        r2 r2Var = new r2(cVar);
        int[] iArr = h.a.f10271u;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, iArr, R.attr.searchViewStyle, 0);
        e4.m mVar = new e4.m(context, typedArrayObtainStyledAttributes);
        androidx.core.view.u0.o(this, context, iArr, null, typedArrayObtainStyledAttributes, R.attr.searchViewStyle, 0);
        LayoutInflater.from(context).inflate(typedArrayObtainStyledAttributes.getResourceId(19, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) findViewById(R.id.search_src_text);
        this.M = searchView$SearchAutoComplete;
        searchView$SearchAutoComplete.setSearchView(this);
        this.N = findViewById(R.id.search_edit_frame);
        View viewFindViewById = findViewById(R.id.search_plate);
        this.O = viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.submit_area);
        this.P = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.Q = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.R = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.S = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.T = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.f954d0 = imageView5;
        viewFindViewById.setBackground(mVar.x(20));
        viewFindViewById2.setBackground(mVar.x(25));
        imageView.setImageDrawable(mVar.x(23));
        imageView2.setImageDrawable(mVar.x(15));
        imageView3.setImageDrawable(mVar.x(12));
        imageView4.setImageDrawable(mVar.x(28));
        imageView5.setImageDrawable(mVar.x(23));
        this.f955e0 = mVar.x(22);
        ib.a.I(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.f956f0 = typedArrayObtainStyledAttributes.getResourceId(26, R.layout.abc_search_dropdown_item_icons_2line);
        this.f957g0 = typedArrayObtainStyledAttributes.getResourceId(13, 0);
        imageView.setOnClickListener(bVar);
        imageView3.setOnClickListener(bVar);
        imageView2.setOnClickListener(bVar);
        imageView4.setOnClickListener(bVar);
        searchView$SearchAutoComplete.setOnClickListener(bVar);
        searchView$SearchAutoComplete.addTextChangedListener(r2Var);
        searchView$SearchAutoComplete.setOnEditorActionListener(w2Var);
        searchView$SearchAutoComplete.setOnItemClickListener(m0Var);
        searchView$SearchAutoComplete.setOnItemSelectedListener(z1Var);
        searchView$SearchAutoComplete.setOnKeyListener(v2Var);
        searchView$SearchAutoComplete.setOnFocusChangeListener(new t2(cVar, 0));
        setIconifiedByDefault(typedArrayObtainStyledAttributes.getBoolean(18, true));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.f959j0 = typedArrayObtainStyledAttributes.getText(14);
        this.f968s0 = typedArrayObtainStyledAttributes.getText(21);
        int i10 = typedArrayObtainStyledAttributes.getInt(6, -1);
        if (i10 != -1) {
            setImeOptions(i10);
        }
        int i11 = typedArrayObtainStyledAttributes.getInt(5, -1);
        if (i11 != -1) {
            setInputType(i11);
        }
        setFocusable(typedArrayObtainStyledAttributes.getBoolean(1, true));
        mVar.H();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.h0 = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f958i0 = intent2;
        intent2.addFlags(268435456);
        View viewFindViewById3 = findViewById(searchView$SearchAutoComplete.getDropDownAnchor());
        this.U = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new u2(0, cVar));
        }
        x(this.f964o0);
        u();
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.M;
        searchView$SearchAutoComplete.setText(charSequence);
        searchView$SearchAutoComplete.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.f970u0 = true;
        super.clearFocus();
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.M;
        searchView$SearchAutoComplete.clearFocus();
        searchView$SearchAutoComplete.setImeVisibility(false);
        this.f970u0 = false;
    }

    public int getImeOptions() {
        return this.M.getImeOptions();
    }

    public int getInputType() {
        return this.M.getInputType();
    }

    public int getMaxWidth() {
        return this.f971v0;
    }

    public CharSequence getQuery() {
        return this.M.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f968s0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.B0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f959j0 : getContext().getText(this.B0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.f957g0;
    }

    public int getSuggestionRowLayout() {
        return this.f956f0;
    }

    public b2.b getSuggestionsAdapter() {
        return this.f966q0;
    }

    public final Intent j(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f974y0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.C0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.B0.getSearchActivity());
        return intent;
    }

    public final Intent k(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.C0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final void l() {
        int i7 = Build.VERSION.SDK_INT;
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.M;
        if (i7 >= 29) {
            x2.a(searchView$SearchAutoComplete);
            return;
        }
        b3 b3Var = G0;
        b3Var.getClass();
        b3.a();
        Method method = b3Var.f906a;
        if (method != null) {
            try {
                method.invoke(searchView$SearchAutoComplete, null);
            } catch (Exception unused) {
            }
        }
        b3Var.getClass();
        b3.a();
        Method method2 = b3Var.f907b;
        if (method2 != null) {
            try {
                method2.invoke(searchView$SearchAutoComplete, null);
            } catch (Exception unused2) {
            }
        }
    }

    public final void m() {
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.M;
        if (!TextUtils.isEmpty(searchView$SearchAutoComplete.getText())) {
            searchView$SearchAutoComplete.setText("");
            searchView$SearchAutoComplete.requestFocus();
            searchView$SearchAutoComplete.setImeVisibility(true);
        } else if (this.f964o0) {
            y2 y2Var = this.f961l0;
            if (y2Var == null || !y2Var.b()) {
                clearFocus();
                x(true);
            }
        }
    }

    public final void n(int i7) {
        int position;
        String strH;
        Cursor cursor = this.f966q0.f3049i;
        if (cursor != null && cursor.moveToPosition(i7)) {
            Intent intentJ = null;
            try {
                int i10 = h3.U;
                String strH2 = h3.h(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (strH2 == null) {
                    strH2 = this.B0.getSuggestIntentAction();
                }
                if (strH2 == null) {
                    strH2 = "android.intent.action.SEARCH";
                }
                String strH3 = h3.h(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (strH3 == null) {
                    strH3 = this.B0.getSuggestIntentData();
                }
                if (strH3 != null && (strH = h3.h(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                    strH3 = strH3 + "/" + Uri.encode(strH);
                }
                intentJ = j(strH2, strH3 == null ? null : Uri.parse(strH3), h3.h(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), h3.h(cursor, cursor.getColumnIndex("suggest_intent_query")));
            } catch (RuntimeException e10) {
                try {
                    position = cursor.getPosition();
                } catch (RuntimeException unused) {
                    position = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + position + " returned exception.", e10);
            }
            if (intentJ != null) {
                try {
                    getContext().startActivity(intentJ);
                } catch (RuntimeException e11) {
                    Log.e("SearchView", "Failed launch activity: " + intentJ, e11);
                }
            }
        }
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.M;
        searchView$SearchAutoComplete.setImeVisibility(false);
        searchView$SearchAutoComplete.dismissDropDown();
    }

    public final void o(int i7) {
        Editable text = this.M.getText();
        Cursor cursor = this.f966q0.f3049i;
        if (cursor == null) {
            return;
        }
        if (!cursor.moveToPosition(i7)) {
            setQuery(text);
            return;
        }
        String strC = this.f966q0.c(cursor);
        if (strC != null) {
            setQuery(strC);
        } else {
            setQuery(text);
        }
    }

    @Override // m.a
    public final void onActionViewCollapsed() {
        r("");
        clearFocus();
        x(true);
        this.M.setImeOptions(this.A0);
        this.f975z0 = false;
    }

    @Override // m.a
    public final void onActionViewExpanded() {
        if (this.f975z0) {
            return;
        }
        this.f975z0 = true;
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.M;
        int imeOptions = searchView$SearchAutoComplete.getImeOptions();
        this.A0 = imeOptions;
        searchView$SearchAutoComplete.setImeOptions(imeOptions | 33554432);
        searchView$SearchAutoComplete.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.D0);
        post(this.E0);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.y1, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i7, int i10, int i11, int i12) {
        super.onLayout(z5, i7, i10, i11, i12);
        if (z5) {
            SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.M;
            int[] iArr = this.f952b0;
            searchView$SearchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.f953c0;
            getLocationInWindow(iArr2);
            int i13 = iArr[1] - iArr2[1];
            int i14 = iArr[0] - iArr2[0];
            int width = searchView$SearchAutoComplete.getWidth() + i14;
            int height = searchView$SearchAutoComplete.getHeight() + i13;
            Rect rect = this.W;
            rect.set(i14, i13, width, height);
            int i15 = rect.left;
            int i16 = rect.right;
            int i17 = i12 - i10;
            Rect rect2 = this.a0;
            rect2.set(i15, 0, i16, i17);
            e3 e3Var = this.V;
            if (e3Var == null) {
                e3 e3Var2 = new e3(searchView$SearchAutoComplete, rect2, rect);
                this.V = e3Var2;
                setTouchDelegate(e3Var2);
            } else {
                e3Var.f934b.set(rect2);
                Rect rect3 = e3Var.f936d;
                rect3.set(rect2);
                int i18 = -e3Var.f937e;
                rect3.inset(i18, i18);
                e3Var.f935c.set(rect);
            }
        }
    }

    @Override // androidx.appcompat.widget.y1, android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11;
        if (this.f965p0) {
            super.onMeasure(i7, i10);
            return;
        }
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        if (mode == Integer.MIN_VALUE) {
            int i12 = this.f971v0;
            size = i12 > 0 ? Math.min(i12, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f971v0;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i11 = this.f971v0) > 0) {
            size = Math.min(i11, size);
        }
        int mode2 = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i10);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d3)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d3 d3Var = (d3) parcelable;
        super.onRestoreInstanceState(d3Var.f7578d);
        x(d3Var.f931i);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        d3 d3Var = new d3(super.onSaveInstanceState());
        d3Var.f931i = this.f965p0;
        return d3Var;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z5) {
        super.onWindowFocusChanged(z5);
        post(this.D0);
    }

    public final void p(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public final void q() {
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.M;
        Editable text = searchView$SearchAutoComplete.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        z2 z2Var = this.f960k0;
        if (z2Var != null) {
            String string = text.toString();
            com.swmansion.rnscreens.v0 v0Var = (com.swmansion.rnscreens.v0) ((u4.b) z2Var).f20945e;
            v0Var.k(new nm.e(v0Var.J, string, v0Var.getId(), 1));
        } else {
            if (this.B0 != null) {
                getContext().startActivity(j("android.intent.action.SEARCH", null, null, text.toString()));
            }
            searchView$SearchAutoComplete.setImeVisibility(false);
            searchView$SearchAutoComplete.dismissDropDown();
        }
    }

    public final void r(String str) {
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.M;
        searchView$SearchAutoComplete.setText(str);
        if (str != null) {
            searchView$SearchAutoComplete.setSelection(searchView$SearchAutoComplete.length());
            this.f974y0 = str;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i7, Rect rect) {
        if (this.f970u0 || !isFocusable()) {
            return false;
        }
        if (this.f965p0) {
            return super.requestFocus(i7, rect);
        }
        boolean zRequestFocus = this.M.requestFocus(i7, rect);
        if (zRequestFocus) {
            x(false);
        }
        return zRequestFocus;
    }

    public final void s() {
        boolean zIsEmpty = TextUtils.isEmpty(this.M.getText());
        int i7 = (!zIsEmpty || (this.f964o0 && !this.f975z0)) ? 0 : 8;
        ImageView imageView = this.S;
        imageView.setVisibility(i7);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(!zIsEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public void setAppSearchData(Bundle bundle) {
        this.C0 = bundle;
    }

    public void setIconified(boolean z5) {
        if (z5) {
            m();
            return;
        }
        x(false);
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.M;
        searchView$SearchAutoComplete.requestFocus();
        searchView$SearchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f963n0;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z5) {
        if (this.f964o0 == z5) {
            return;
        }
        this.f964o0 = z5;
        x(z5);
        u();
    }

    public void setImeOptions(int i7) {
        this.M.setImeOptions(i7);
    }

    public void setInputType(int i7) {
        this.M.setInputType(i7);
    }

    public void setMaxWidth(int i7) {
        this.f971v0 = i7;
        requestLayout();
    }

    public void setOnCloseListener(y2 y2Var) {
        this.f961l0 = y2Var;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f962m0 = onFocusChangeListener;
    }

    public void setOnQueryTextListener(z2 z2Var) {
        this.f960k0 = z2Var;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f963n0 = onClickListener;
    }

    public void setOnSuggestionListener(a3 a3Var) {
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f968s0 = charSequence;
        u();
    }

    public void setQueryRefinementEnabled(boolean z5) {
        this.f969t0 = z5;
        b2.b bVar = this.f966q0;
        if (bVar instanceof h3) {
            ((h3) bVar).M = z5 ? 2 : 1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0098  */
    public void setSearchableInfo(SearchableInfo searchableInfo) {
        boolean z5;
        this.B0 = searchableInfo;
        Intent intent = null;
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.M;
        if (searchableInfo != null) {
            searchView$SearchAutoComplete.setThreshold(searchableInfo.getSuggestThreshold());
            searchView$SearchAutoComplete.setImeOptions(this.B0.getImeOptions());
            int inputType = this.B0.getInputType();
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.B0.getSuggestAuthority() != null) {
                    inputType |= 589824;
                }
            }
            searchView$SearchAutoComplete.setInputType(inputType);
            b2.b bVar = this.f966q0;
            if (bVar != null) {
                bVar.b(null);
            }
            if (this.B0.getSuggestAuthority() != null) {
                h3 h3Var = new h3(getContext(), this, this.B0, this.F0);
                this.f966q0 = h3Var;
                searchView$SearchAutoComplete.setAdapter(h3Var);
                ((h3) this.f966q0).M = this.f969t0 ? 2 : 1;
            }
            u();
        }
        SearchableInfo searchableInfo2 = this.B0;
        if (searchableInfo2 != null && searchableInfo2.getVoiceSearchEnabled()) {
            if (this.B0.getVoiceSearchLaunchWebSearch()) {
                intent = this.h0;
            } else if (this.B0.getVoiceSearchLaunchRecognizer()) {
                intent = this.f958i0;
            }
            z5 = (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
        }
        this.f972w0 = z5;
        if (z5) {
            searchView$SearchAutoComplete.setPrivateImeOptions("nm");
        }
        x(this.f965p0);
    }

    public void setSubmitButtonEnabled(boolean z5) {
        this.f967r0 = z5;
        x(this.f965p0);
    }

    public void setSuggestionsAdapter(b2.b bVar) {
        this.f966q0 = bVar;
        this.M.setAdapter(bVar);
    }

    public final void t() {
        int[] iArr = this.M.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.O.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.P.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void u() {
        Drawable drawable;
        CharSequence queryHint = getQueryHint();
        CharSequence charSequence = queryHint;
        if (queryHint == null) {
            charSequence = "";
        }
        boolean z5 = this.f964o0;
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.M;
        CharSequence charSequence2 = charSequence;
        if (z5 && (drawable = this.f955e0) != null) {
            charSequence2 = charSequence;
            int textSize = (int) (((double) searchView$SearchAutoComplete.getTextSize()) * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(charSequence);
            charSequence2 = spannableStringBuilder;
        }
        charSequence2 = charSequence;
        searchView$SearchAutoComplete.setHint(charSequence2);
    }

    public final void v() {
        this.P.setVisibility(((this.f967r0 || this.f972w0) && !this.f965p0 && (this.R.getVisibility() == 0 || this.T.getVisibility() == 0)) ? 0 : 8);
    }

    public final void w(boolean z5) {
        boolean z6 = this.f967r0;
        this.R.setVisibility((!z6 || !(z6 || this.f972w0) || this.f965p0 || !hasFocus() || (!z5 && this.f972w0)) ? 8 : 0);
    }

    public final void x(boolean z5) {
        this.f965p0 = z5;
        int i7 = 8;
        int i10 = z5 ? 0 : 8;
        boolean zIsEmpty = TextUtils.isEmpty(this.M.getText());
        this.Q.setVisibility(i10);
        w(!zIsEmpty);
        this.N.setVisibility(z5 ? 8 : 0);
        ImageView imageView = this.f954d0;
        imageView.setVisibility((imageView.getDrawable() == null || this.f964o0) ? 8 : 0);
        s();
        if (this.f972w0 && !this.f965p0 && zIsEmpty) {
            this.R.setVisibility(8);
            i7 = 0;
        }
        this.T.setVisibility(i7);
        v();
    }
}
