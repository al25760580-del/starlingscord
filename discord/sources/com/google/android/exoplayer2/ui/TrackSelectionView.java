package com.google.android.exoplayer2.ui;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.b;
import com.google.android.exoplayer2.Format;
import gc.w1;
import ge.s;
import ge.t;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import je.o;
import md.x0;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class TrackSelectionView extends LinearLayout {
    public boolean E;
    public boolean F;
    public s G;
    public CheckedTextView[][] H;
    public boolean I;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5828d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LayoutInflater f5829e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CheckedTextView f5830i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final CheckedTextView f5831v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final b f5832w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ArrayList f5833x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final HashMap f5834y;

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setOrientation(1);
        setSaveFromParentEnabled(false);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.selectableItemBackground});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        this.f5828d = resourceId;
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        this.f5829e = layoutInflaterFrom;
        b bVar = new b(5, this);
        this.f5832w = bVar;
        this.G = new u4.b(getResources());
        this.f5833x = new ArrayList();
        this.f5834y = new HashMap();
        CheckedTextView checkedTextView = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f5830i = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(com.discord.R.string.exo_track_selection_none);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(bVar);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(layoutInflaterFrom.inflate(com.discord.R.layout.exo_list_divider, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f5831v = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(com.discord.R.string.exo_track_selection_auto);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(bVar);
        addView(checkedTextView2);
    }

    public final void a() {
        this.f5830i.setChecked(this.I);
        boolean z5 = this.I;
        HashMap map = this.f5834y;
        this.f5831v.setChecked(!z5 && map.size() == 0);
        for (int i7 = 0; i7 < this.H.length; i7++) {
            fe.s sVar = (fe.s) map.get(((w1) this.f5833x.get(i7)).f9929e);
            int i10 = 0;
            while (true) {
                CheckedTextView[] checkedTextViewArr = this.H[i7];
                if (i10 < checkedTextViewArr.length) {
                    if (sVar != null) {
                        Object tag = checkedTextViewArr[i10].getTag();
                        tag.getClass();
                        this.H[i7][i10].setChecked(sVar.f9120e.contains(Integer.valueOf(((t) tag).f10023b)));
                    } else {
                        checkedTextViewArr[i10].setChecked(false);
                    }
                    i10++;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00da  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e2  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [int] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [int] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r23v0, types: [android.view.ViewGroup, com.google.android.exoplayer2.ui.TrackSelectionView] */
    public final void b() {
        String strZ;
        String string;
        boolean z5;
        boolean z6;
        boolean z7 = true;
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        ArrayList arrayList = this.f5833x;
        boolean zIsEmpty = arrayList.isEmpty();
        CheckedTextView checkedTextView = this.f5831v;
        CheckedTextView checkedTextView2 = this.f5830i;
        boolean z10 = false;
        if (zIsEmpty) {
            checkedTextView2.setEnabled(false);
            checkedTextView.setEnabled(false);
            return;
        }
        checkedTextView2.setEnabled(true);
        checkedTextView.setEnabled(true);
        this.H = new CheckedTextView[arrayList.size()][];
        boolean z11 = this.F && arrayList.size() > 1;
        int i7 = 0;
        while (i7 < arrayList.size()) {
            w1 w1Var = (w1) arrayList.get(i7);
            boolean z12 = (this.E && w1Var.f9930i) ? z7 : z10;
            CheckedTextView[][] checkedTextViewArr = this.H;
            int i10 = w1Var.f9928d;
            checkedTextViewArr[i7] = new CheckedTextView[i10];
            t[] tVarArr = new t[i10];
            for (?? r10 = z10; r10 < w1Var.f9928d; r10++) {
                tVarArr[r10] = new t(w1Var, r10);
            }
            for (?? r11 = z10; r11 < i10; r11++) {
                LayoutInflater layoutInflater = this.f5829e;
                if (r11 == 0) {
                    addView(layoutInflater.inflate(com.discord.R.layout.exo_list_divider, (ViewGroup) this, z10));
                }
                CheckedTextView checkedTextView3 = (CheckedTextView) layoutInflater.inflate((z12 || z11) ? R.layout.simple_list_item_multiple_choice : R.layout.simple_list_item_single_choice, (ViewGroup) this, z10);
                checkedTextView3.setBackgroundResource(this.f5828d);
                s sVar = this.G;
                t tVar = tVarArr[r11];
                Format format = tVar.f10022a.f9929e.f15730v[tVar.f10023b];
                u4.b bVar = (u4.b) sVar;
                Resources resources = (Resources) bVar.f20945e;
                Resources resources2 = (Resources) bVar.f20945e;
                String str = format.I;
                int i11 = format.E;
                ArrayList arrayList2 = arrayList;
                int i12 = format.V;
                boolean z13 = z11;
                int i13 = format.O;
                int i14 = i7;
                int i15 = format.N;
                String str2 = format.F;
                int iH = o.h(str);
                boolean z14 = z12;
                t[] tVarArr2 = tVarArr;
                if (iH == -1) {
                    if (o.i(str2) != null) {
                        iH = 2;
                    } else if (o.a(str2) != null) {
                        iH = 1;
                    } else if (i15 != -1 || i13 != -1) {
                        iH = 2;
                    } else if (i12 == -1 && format.W == -1) {
                        iH = -1;
                    } else {
                        iH = 1;
                    }
                }
                if (iH == 2) {
                    strZ = bVar.e0(bVar.a0(format), (i15 == -1 || i13 == -1) ? "" : resources.getString(com.discord.R.string.exo_track_resolution, Integer.valueOf(i15), Integer.valueOf(i13)), i11 != -1 ? resources2.getString(com.discord.R.string.exo_track_bitrate, Float.valueOf(i11 / 1000000.0f)) : "");
                } else if (iH == 1) {
                    String strZ2 = bVar.Z(format);
                    if (i12 == -1 || i12 < 1) {
                        string = "";
                    } else if (i12 == 1) {
                        string = resources.getString(com.discord.R.string.exo_track_mono);
                    } else if (i12 == 2) {
                        string = resources.getString(com.discord.R.string.exo_track_stereo);
                    } else if (i12 == 6 || i12 == 7) {
                        string = resources.getString(com.discord.R.string.exo_track_surround_5_point_1);
                    } else {
                        string = i12 != 8 ? resources.getString(com.discord.R.string.exo_track_surround) : resources.getString(com.discord.R.string.exo_track_surround_7_point_1);
                    }
                    strZ = bVar.e0(strZ2, string, i11 != -1 ? resources2.getString(com.discord.R.string.exo_track_bitrate, Float.valueOf(i11 / 1000000.0f)) : "");
                } else {
                    strZ = bVar.Z(format);
                }
                if (strZ.length() == 0) {
                    strZ = resources.getString(com.discord.R.string.exo_track_unknown);
                }
                checkedTextView3.setText(strZ);
                checkedTextView3.setTag(tVarArr2[r11]);
                if (w1Var.f9931v[r11] != 4) {
                    z5 = false;
                    checkedTextView3.setFocusable(false);
                    checkedTextView3.setEnabled(false);
                    z6 = true;
                } else {
                    z5 = false;
                    z6 = true;
                    checkedTextView3.setFocusable(true);
                    checkedTextView3.setOnClickListener(this.f5832w);
                }
                this.H[i14][r11] = checkedTextView3;
                addView(checkedTextView3);
                z10 = z5;
                z7 = z6;
                arrayList = arrayList2;
                z11 = z13;
                i7 = i14;
                z12 = z14;
                tVarArr = tVarArr2;
            }
            i7++;
            arrayList = arrayList;
            z11 = z11;
        }
        a();
    }

    public boolean getIsDisabled() {
        return this.I;
    }

    public Map<x0, fe.s> getOverrides() {
        return this.f5834y;
    }

    public void setAllowAdaptiveSelections(boolean z5) {
        if (this.E != z5) {
            this.E = z5;
            b();
        }
    }

    public void setAllowMultipleOverrides(boolean z5) {
        if (this.F != z5) {
            this.F = z5;
            if (!z5) {
                HashMap map = this.f5834y;
                if (map.size() > 1) {
                    HashMap map2 = new HashMap();
                    int i7 = 0;
                    while (true) {
                        ArrayList arrayList = this.f5833x;
                        if (i7 >= arrayList.size()) {
                            break;
                        }
                        fe.s sVar = (fe.s) map.get(((w1) arrayList.get(i7)).f9929e);
                        if (sVar != null && map2.isEmpty()) {
                            map2.put(sVar.f9119d, sVar);
                        }
                        i7++;
                    }
                    map.clear();
                    map.putAll(map2);
                }
            }
            b();
        }
    }

    public void setShowDisableOption(boolean z5) {
        this.f5830i.setVisibility(z5 ? 0 : 8);
    }

    public void setTrackNameProvider(s sVar) {
        sVar.getClass();
        this.G = sVar;
        b();
    }
}
