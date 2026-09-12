package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.CheckedTextView;
import androidx.appcompat.view.ActionMode;
import com.discord.R;
import com.google.android.exoplayer2.ui.TrackSelectionView;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class b implements View.OnClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f901d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f902e;

    public /* synthetic */ b(int i7, Object obj) {
        this.f901d = i7;
        this.f902e = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message messageObtain;
        Message message;
        Message message2;
        Message message3;
        switch (this.f901d) {
            case 0:
                ((ActionMode) this.f902e).a();
                break;
            case 1:
                com.swmansion.rnscreens.c cVar = (com.swmansion.rnscreens.c) this.f902e;
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = cVar.M;
                if (view == cVar.Q) {
                    cVar.x(false);
                    searchView$SearchAutoComplete.requestFocus();
                    searchView$SearchAutoComplete.setImeVisibility(true);
                    View.OnClickListener onClickListener = cVar.f963n0;
                    if (onClickListener != null) {
                        onClickListener.onClick(cVar);
                    }
                    break;
                } else if (view == cVar.S) {
                    cVar.m();
                    break;
                } else if (view == cVar.R) {
                    cVar.q();
                    break;
                } else if (view != cVar.T) {
                    if (view == searchView$SearchAutoComplete) {
                        cVar.l();
                    }
                    break;
                } else {
                    SearchableInfo searchableInfo = cVar.B0;
                    if (searchableInfo != null) {
                        try {
                            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                                Intent intent = new Intent(cVar.h0);
                                ComponentName searchActivity = searchableInfo.getSearchActivity();
                                intent.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
                                cVar.getContext().startActivity(intent);
                            } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                                cVar.getContext().startActivity(cVar.k(cVar.f958i0, searchableInfo));
                            }
                        } catch (ActivityNotFoundException unused) {
                            Log.w("SearchView", "Could not find voice search activity");
                            return;
                        }
                        break;
                    }
                }
                break;
            case 2:
                r3 r3Var = ((Toolbar) this.f902e).f876m0;
                n.l lVar = r3Var == null ? null : r3Var.f1097e;
                if (lVar != null) {
                    lVar.collapseActionView();
                }
                break;
            case 3:
                com.google.android.material.datepicker.m mVar = (com.google.android.material.datepicker.m) this.f902e;
                int i7 = mVar.f6358w;
                if (i7 == 2) {
                    mVar.u(1);
                    mVar.E.announceForAccessibility(mVar.getString(R.string.mtrl_picker_toggled_to_day_selection));
                } else if (i7 == 1) {
                    mVar.u(2);
                    mVar.f6360y.announceForAccessibility(mVar.getString(R.string.mtrl_picker_toggled_to_year_selection));
                }
                break;
            case 4:
                n.l itemData = ((eh.e) view).getItemData();
                qg.b bVar = (qg.b) this.f902e;
                boolean zQ = bVar.f8246m0.f8226a.q(itemData, bVar.f8245l0, 0);
                if (itemData != null && itemData.isCheckable()) {
                    if (!zQ || itemData.isChecked()) {
                        bVar.setCheckedItem(itemData);
                    }
                    break;
                }
                break;
            case 5:
                TrackSelectionView trackSelectionView = (TrackSelectionView) this.f902e;
                HashMap map = trackSelectionView.f5834y;
                boolean z5 = true;
                if (view == trackSelectionView.f5830i) {
                    trackSelectionView.I = true;
                    map.clear();
                } else if (view == trackSelectionView.f5831v) {
                    trackSelectionView.I = false;
                    map.clear();
                } else {
                    trackSelectionView.I = false;
                    Object tag = view.getTag();
                    tag.getClass();
                    ge.t tVar = (ge.t) tag;
                    gc.w1 w1Var = tVar.f10022a;
                    md.x0 x0Var = w1Var.f9929e;
                    int i10 = tVar.f10023b;
                    fe.s sVar = (fe.s) map.get(x0Var);
                    if (sVar == null) {
                        if (!trackSelectionView.F && map.size() > 0) {
                            map.clear();
                        }
                        map.put(x0Var, new fe.s(x0Var, ei.e0.r(Integer.valueOf(i10))));
                    } else {
                        ArrayList arrayList = new ArrayList(sVar.f9120e);
                        boolean zIsChecked = ((CheckedTextView) view).isChecked();
                        boolean z6 = trackSelectionView.E && w1Var.f9930i;
                        if (!z6 && (!trackSelectionView.F || trackSelectionView.f5833x.size() <= 1)) {
                            z5 = false;
                        }
                        if (zIsChecked && z5) {
                            arrayList.remove(Integer.valueOf(i10));
                            if (arrayList.isEmpty()) {
                                map.remove(x0Var);
                            } else {
                                map.put(x0Var, new fe.s(x0Var, arrayList));
                            }
                        } else if (!zIsChecked) {
                            if (z6) {
                                arrayList.add(Integer.valueOf(i10));
                                map.put(x0Var, new fe.s(x0Var, arrayList));
                            } else {
                                map.put(x0Var, new fe.s(x0Var, ei.e0.r(Integer.valueOf(i10))));
                            }
                        }
                    }
                }
                trackSelectionView.a();
                break;
            default:
                i.d dVar = (i.d) this.f902e;
                if (view == dVar.f11181i && (message3 = dVar.k) != null) {
                    messageObtain = Message.obtain(message3);
                } else if (view != dVar.f11182l || (message2 = dVar.f11184n) == null) {
                    messageObtain = (view != dVar.f11185o || (message = dVar.f11187q) == null) ? null : Message.obtain(message);
                } else {
                    messageObtain = Message.obtain(message2);
                }
                if (messageObtain != null) {
                    messageObtain.sendToTarget();
                }
                dVar.E.obtainMessage(1, dVar.f11174b).sendToTarget();
                break;
        }
    }
}
