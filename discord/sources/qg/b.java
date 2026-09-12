package qg;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import com.discord.R;
import eh.i;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends i {
    public final int A0;
    public final int B0;
    public boolean C0;
    public final ArrayList D0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final int f18895y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public final int f18896z0;

    public b(Context context) {
        super(context);
        this.D0 = new ArrayList();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        Resources resources = getResources();
        this.f18895y0 = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_max_width);
        this.f18896z0 = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_min_width);
        this.A0 = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_max_width);
        this.B0 = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_min_width);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i7, int i10, int i11, int i12) {
        int childCount = getChildCount();
        int i13 = i11 - i7;
        int i14 = i12 - i10;
        int measuredWidth = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                if (getLayoutDirection() == 1) {
                    int i16 = i13 - measuredWidth;
                    childAt.layout(i16 - childAt.getMeasuredWidth(), 0, i16, i14);
                } else {
                    childAt.layout(measuredWidth, 0, childAt.getMeasuredWidth() + measuredWidth, i14);
                }
                measuredWidth += childAt.getMeasuredWidth();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00a7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c9  */
    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11;
        int iMax;
        int i12;
        int iMin;
        int i13;
        int i14;
        int i15;
        int size = View.MeasureSpec.getSize(i7);
        int currentVisibleContentItemCount = getCurrentVisibleContentItemCount();
        int childCount = getChildCount();
        ArrayList arrayList = this.D0;
        arrayList.clear();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), Integer.MIN_VALUE);
        int i16 = 0;
        if (getItemIconGravity() == 0) {
            int labelVisibilityMode = getLabelVisibilityMode();
            int i17 = this.A0;
            if (labelVisibilityMode != -1 ? labelVisibilityMode != 0 : currentVisibleContentItemCount <= 3) {
                iMin = Math.min(size / (currentVisibleContentItemCount != 0 ? currentVisibleContentItemCount : 1), i17);
                i13 = size - (currentVisibleContentItemCount * iMin);
                for (i14 = 0; i14 < childCount; i14++) {
                    if (getChildAt(i14).getVisibility() != 8) {
                        i15 = 0;
                    } else if (i13 > 0) {
                        i15 = iMin + 1;
                        i13--;
                    } else {
                        i15 = iMin;
                    }
                    arrayList.add(Integer.valueOf(i15));
                }
            } else if (this.C0) {
                View childAt = getChildAt(getSelectedItemPosition());
                int visibility = childAt.getVisibility();
                int iMax2 = this.B0;
                if (visibility != 8) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i17, Integer.MIN_VALUE), iMakeMeasureSpec);
                    iMax2 = Math.max(iMax2, childAt.getMeasuredWidth());
                }
                int i18 = currentVisibleContentItemCount - (childAt.getVisibility() != 8 ? 1 : 0);
                int iMin2 = Math.min(size - (this.f18896z0 * i18), Math.min(iMax2, i17));
                int i19 = size - iMin2;
                int iMin3 = Math.min(i19 / (i18 != 0 ? i18 : 1), this.f18895y0);
                int i20 = i19 - (i18 * iMin3);
                int i21 = 0;
                while (i21 < childCount) {
                    if (getChildAt(i21).getVisibility() != 8) {
                        i12 = i21 == getSelectedItemPosition() ? iMin2 : iMin3;
                        if (i20 > 0) {
                            i12++;
                            i20--;
                        }
                    } else {
                        i12 = 0;
                    }
                    arrayList.add(Integer.valueOf(i12));
                    i21++;
                }
            } else {
                iMin = Math.min(size / (currentVisibleContentItemCount != 0 ? currentVisibleContentItemCount : 1), i17);
                i13 = size - (currentVisibleContentItemCount * iMin);
                while (i14 < childCount) {
                    if (getChildAt(i14).getVisibility() != 8) {
                        i15 = 0;
                    } else if (i13 > 0) {
                        i15 = iMin + 1;
                        i13--;
                    } else {
                        i15 = iMin;
                    }
                    arrayList.add(Integer.valueOf(i15));
                }
            }
            i11 = 0;
            iMax = 0;
            while (i16 < childCount) {
                View childAt2 = getChildAt(i16);
                if (childAt2.getVisibility() != 8) {
                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(((Integer) arrayList.get(i16)).intValue(), 1073741824), iMakeMeasureSpec);
                    childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                    int measuredWidth = childAt2.getMeasuredWidth() + i11;
                    iMax = Math.max(iMax, childAt2.getMeasuredHeight());
                    i11 = measuredWidth;
                }
                i16++;
            }
        } else {
            if (currentVisibleContentItemCount == 0) {
                currentVisibleContentItemCount = 1;
            }
            float f2 = size;
            float fMin = Math.min((currentVisibleContentItemCount + 3) / 10.0f, 0.9f) * f2;
            float f7 = currentVisibleContentItemCount;
            int iRound = Math.round(fMin / f7);
            int iRound2 = Math.round(f2 / f7);
            int i22 = 0;
            int iMax3 = 0;
            while (i16 < childCount) {
                View childAt3 = getChildAt(i16);
                if (childAt3.getVisibility() != 8) {
                    childAt3.measure(View.MeasureSpec.makeMeasureSpec(iRound2, Integer.MIN_VALUE), iMakeMeasureSpec);
                    if (childAt3.getMeasuredWidth() < iRound) {
                        childAt3.measure(View.MeasureSpec.makeMeasureSpec(iRound, 1073741824), iMakeMeasureSpec);
                    }
                    int measuredWidth2 = childAt3.getMeasuredWidth() + i22;
                    iMax3 = Math.max(iMax3, childAt3.getMeasuredHeight());
                    i22 = measuredWidth2;
                }
                i16++;
            }
            i11 = i22;
            iMax = iMax3;
        }
        setMeasuredDimension(i11, Math.max(iMax, getSuggestedMinimumHeight()));
    }

    public void setItemHorizontalTranslationEnabled(boolean z5) {
        this.C0 = z5;
    }
}
