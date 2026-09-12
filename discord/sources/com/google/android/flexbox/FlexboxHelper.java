package com.google.android.flexbox;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import ne.b;
import ne.c;

/* JADX INFO: loaded from: classes3.dex */
public final class FlexboxHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ne.a f5869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean[] f5870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f5871c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long[] f5872d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long[] f5873e;

    public static class FlexLinesResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List f5874a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f5875b;
    }

    public FlexboxHelper(ne.a aVar) {
        this.f5869a = aVar;
    }

    public static ArrayList e(List list, int i7, int i10) {
        int i11 = (i7 - i10) / 2;
        ArrayList arrayList = new ArrayList();
        FlexLine flexLine = new FlexLine();
        flexLine.f5859g = i11;
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            if (i12 == 0) {
                arrayList.add(flexLine);
            }
            arrayList.add((FlexLine) list.get(i12));
            if (i12 == list.size() - 1) {
                arrayList.add(flexLine);
            }
        }
        return arrayList;
    }

    public static int[] r(int i7, ArrayList arrayList, SparseIntArray sparseIntArray) {
        Collections.sort(arrayList);
        sparseIntArray.clear();
        int[] iArr = new int[i7];
        Iterator it = arrayList.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            c cVar = (c) it.next();
            int i11 = cVar.f16562d;
            iArr[i10] = i11;
            sparseIntArray.append(i11, cVar.f16563e);
            i10++;
        }
        return iArr;
    }

    public final void a(List list, FlexLine flexLine, int i7, int i10) {
        flexLine.f5863m = i10;
        this.f5869a.onNewFlexLineAdded(flexLine);
        flexLine.f5866p = i7;
        list.add(flexLine);
    }

    /* JADX WARN: Code duplicated, block: B:83:0x01ca  */
    public final void b(FlexLinesResult flexLinesResult, int i7, int i10, int i11, int i12, int i13, List list) {
        int childHeightMeasureSpec;
        b bVar;
        int i14;
        boolean z5;
        int i15 = i7;
        ne.a aVar = this.f5869a;
        boolean zIsMainAxisDirectionHorizontal = aVar.isMainAxisDirectionHorizontal();
        int mode = View.MeasureSpec.getMode(i15);
        int size = View.MeasureSpec.getSize(i15);
        List arrayList = list == null ? new ArrayList() : list;
        flexLinesResult.f5874a = arrayList;
        boolean z6 = i13 == -1;
        int paddingStart = zIsMainAxisDirectionHorizontal ? aVar.getPaddingStart() : aVar.getPaddingTop();
        int paddingEnd = zIsMainAxisDirectionHorizontal ? aVar.getPaddingEnd() : aVar.getPaddingBottom();
        int paddingTop = zIsMainAxisDirectionHorizontal ? aVar.getPaddingTop() : aVar.getPaddingStart();
        int paddingBottom = zIsMainAxisDirectionHorizontal ? aVar.getPaddingBottom() : aVar.getPaddingEnd();
        FlexLine flexLine = new FlexLine();
        int i16 = i12;
        int i17 = 1;
        flexLine.f5865o = i16;
        int i18 = paddingStart + paddingEnd;
        flexLine.f5857e = i18;
        int flexItemCount = aVar.getFlexItemCount();
        boolean z7 = z6;
        int i19 = Integer.MIN_VALUE;
        int iCombineMeasuredStates = 0;
        int i20 = 0;
        int i21 = 0;
        while (i16 < flexItemCount) {
            int i22 = flexItemCount;
            View reorderedFlexItemAt = aVar.getReorderedFlexItemAt(i16);
            if (reorderedFlexItemAt != null) {
                if (reorderedFlexItemAt.getVisibility() == 8) {
                    flexLine.f5861i++;
                    flexLine.f5860h++;
                    if (i16 == i22 - 1 && flexLine.a() != 0) {
                        a(arrayList, flexLine, i16, i20);
                    }
                } else {
                    if (reorderedFlexItemAt instanceof CompoundButton) {
                        CompoundButton compoundButton = (CompoundButton) reorderedFlexItemAt;
                        b bVar2 = (b) compoundButton.getLayoutParams();
                        int iF = bVar2.f();
                        int iQ = bVar2.q();
                        Drawable buttonDrawable = compoundButton.getButtonDrawable();
                        int minimumWidth = buttonDrawable == null ? 0 : buttonDrawable.getMinimumWidth();
                        int minimumHeight = buttonDrawable == null ? 0 : buttonDrawable.getMinimumHeight();
                        if (iF == -1) {
                            iF = minimumWidth;
                        }
                        bVar2.g(iF);
                        if (iQ == -1) {
                            iQ = minimumHeight;
                        }
                        bVar2.m(iQ);
                    }
                    b bVar3 = (b) reorderedFlexItemAt.getLayoutParams();
                    if (bVar3.c() == 4) {
                        flexLine.f5864n.add(Integer.valueOf(i16));
                    }
                    int width = zIsMainAxisDirectionHorizontal ? bVar3.getWidth() : bVar3.getHeight();
                    if (bVar3.o() != -1.0f && mode == 1073741824) {
                        width = Math.round(bVar3.o() * size);
                    }
                    if (zIsMainAxisDirectionHorizontal) {
                        childHeightMeasureSpec = aVar.getChildWidthMeasureSpec(i15, bVar3.p() + bVar3.k() + i18, width);
                        int childHeightMeasureSpec2 = aVar.getChildHeightMeasureSpec(i10, bVar3.j() + bVar3.l() + paddingTop + paddingBottom + i20, bVar3.getHeight());
                        reorderedFlexItemAt.measure(childHeightMeasureSpec, childHeightMeasureSpec2);
                        v(i16, childHeightMeasureSpec, childHeightMeasureSpec2, reorderedFlexItemAt);
                    } else {
                        int childWidthMeasureSpec = aVar.getChildWidthMeasureSpec(i10, bVar3.p() + bVar3.k() + paddingTop + paddingBottom + i20, bVar3.getWidth());
                        childHeightMeasureSpec = aVar.getChildHeightMeasureSpec(i15, bVar3.j() + bVar3.l() + i18, width);
                        reorderedFlexItemAt.measure(childWidthMeasureSpec, childHeightMeasureSpec);
                        v(i16, childWidthMeasureSpec, childHeightMeasureSpec, reorderedFlexItemAt);
                    }
                    aVar.updateViewCache(i16, reorderedFlexItemAt);
                    c(i16, reorderedFlexItemAt);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, reorderedFlexItemAt.getMeasuredState());
                    int i23 = flexLine.f5857e;
                    int measuredWidth = (zIsMainAxisDirectionHorizontal ? reorderedFlexItemAt.getMeasuredWidth() : reorderedFlexItemAt.getMeasuredHeight()) + (zIsMainAxisDirectionHorizontal ? bVar3.k() : bVar3.l()) + (zIsMainAxisDirectionHorizontal ? bVar3.p() : bVar3.j());
                    int size2 = arrayList.size();
                    if (aVar.getFlexWrap() != 0) {
                        if (bVar3.r()) {
                            bVar = bVar3;
                        } else {
                            if (mode == 0) {
                                bVar = bVar3;
                            } else {
                                bVar = bVar3;
                                int maxLine = aVar.getMaxLine();
                                if (maxLine == -1 || maxLine > size2 + 1) {
                                    int decorationLengthMainAxis = aVar.getDecorationLengthMainAxis(reorderedFlexItemAt, i16, i21);
                                    if (decorationLengthMainAxis > 0) {
                                        measuredWidth += decorationLengthMainAxis;
                                    }
                                    if (size < i23 + measuredWidth) {
                                    }
                                }
                            }
                            i18 = i18;
                            arrayList = arrayList;
                            flexLine.f5860h += i17;
                            i21++;
                            i14 = i19;
                        }
                        if (flexLine.a() > 0) {
                            arrayList = arrayList;
                            a(arrayList, flexLine, i16 > 0 ? i16 - 1 : 0, i20);
                            i20 += flexLine.f5859g;
                        }
                        if (zIsMainAxisDirectionHorizontal) {
                            arrayList = arrayList;
                            if (bVar.getHeight() == -1) {
                                reorderedFlexItemAt.measure(childHeightMeasureSpec, aVar.getChildHeightMeasureSpec(i10, bVar.j() + bVar.l() + aVar.getPaddingBottom() + aVar.getPaddingTop() + i20, bVar.getHeight()));
                                c(i16, reorderedFlexItemAt);
                            }
                        } else {
                            arrayList = arrayList;
                            if (bVar.getWidth() == -1) {
                                reorderedFlexItemAt.measure(aVar.getChildWidthMeasureSpec(i10, bVar.p() + bVar.k() + aVar.getPaddingRight() + aVar.getPaddingLeft() + i20, bVar.getWidth()), childHeightMeasureSpec);
                                c(i16, reorderedFlexItemAt);
                            }
                        }
                        flexLine = new FlexLine();
                        flexLine.f5860h = i17;
                        i18 = i18;
                        flexLine.f5857e = i18;
                        flexLine.f5865o = i16;
                        i14 = Integer.MIN_VALUE;
                        i21 = 0;
                    } else {
                        bVar = bVar3;
                        i18 = i18;
                        arrayList = arrayList;
                        flexLine.f5860h += i17;
                        i21++;
                        i14 = i19;
                    }
                    flexLine.f5867q |= bVar.n() != 0.0f;
                    flexLine.f5868r |= bVar.d() != 0.0f;
                    int[] iArr = this.f5871c;
                    if (iArr != null) {
                        iArr[i16] = arrayList.size();
                    }
                    flexLine.f5857e = (zIsMainAxisDirectionHorizontal ? reorderedFlexItemAt.getMeasuredWidth() : reorderedFlexItemAt.getMeasuredHeight()) + (zIsMainAxisDirectionHorizontal ? bVar.k() : bVar.l()) + (zIsMainAxisDirectionHorizontal ? bVar.p() : bVar.j()) + flexLine.f5857e;
                    flexLine.j = bVar.n() + flexLine.j;
                    flexLine.k = bVar.d() + flexLine.k;
                    aVar.onNewFlexItemAdded(reorderedFlexItemAt, i16, i21, flexLine);
                    int iMax = Math.max(i14, aVar.getDecorationLengthCrossAxis(reorderedFlexItemAt) + (zIsMainAxisDirectionHorizontal ? reorderedFlexItemAt.getMeasuredHeight() : reorderedFlexItemAt.getMeasuredWidth()) + (zIsMainAxisDirectionHorizontal ? bVar.l() : bVar.k()) + (zIsMainAxisDirectionHorizontal ? bVar.j() : bVar.p()));
                    flexLine.f5859g = Math.max(flexLine.f5859g, iMax);
                    if (zIsMainAxisDirectionHorizontal) {
                        if (aVar.getFlexWrap() != 2) {
                            flexLine.f5862l = Math.max(flexLine.f5862l, bVar.l() + reorderedFlexItemAt.getBaseline());
                        } else {
                            flexLine.f5862l = Math.max(flexLine.f5862l, bVar.j() + (reorderedFlexItemAt.getMeasuredHeight() - reorderedFlexItemAt.getBaseline()));
                        }
                    }
                    if (i16 == i22 - 1 && flexLine.a() != 0) {
                        a(arrayList, flexLine, i16, i20);
                        i20 += flexLine.f5859g;
                    }
                    if (i13 != -1 && arrayList.size() > 0) {
                        if (((FlexLine) kk.b.f(1, arrayList)).f5866p >= i13 && i16 >= i13 && !z7) {
                            i20 = -flexLine.f5859g;
                            z5 = true;
                        }
                        if (i20 <= i11 && z5) {
                            break;
                        } else {
                            i19 = iMax;
                        }
                    }
                    z5 = z7;
                    if (i20 <= i11) {
                    }
                    i19 = iMax;
                }
                i16++;
                z7 = z5;
                flexItemCount = i22;
                i17 = 1;
                i15 = i7;
            } else if (i16 == i22 - 1 && flexLine.a() != 0) {
                a(arrayList, flexLine, i16, i20);
            }
            z5 = z7;
            i16++;
            z7 = z5;
            flexItemCount = i22;
            i17 = 1;
            i15 = i7;
        }
        flexLinesResult.f5875b = iCombineMeasuredStates;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002d  */
    /* JADX WARN: Code duplicated, block: B:13:0x0032  */
    /* JADX WARN: Code duplicated, block: B:15:0x0038  */
    /* JADX WARN: Code duplicated, block: B:16:0x003d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0040  */
    /* JADX WARN: Code duplicated, block: B:20:? A[RETURN, SYNTHETIC] */
    public final void c(int i7, View view) {
        boolean z5;
        b bVar = (b) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        boolean z6 = true;
        if (measuredWidth >= bVar.f()) {
            if (measuredWidth > bVar.u()) {
                measuredWidth = bVar.u();
            } else {
                z5 = false;
            }
            if (measuredHeight < bVar.q()) {
                measuredHeight = bVar.q();
            } else if (measuredHeight > bVar.s()) {
                measuredHeight = bVar.s();
            } else {
                z6 = z5;
            }
            if (z6) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                v(i7, iMakeMeasureSpec, iMakeMeasureSpec2, view);
                this.f5869a.updateViewCache(i7, view);
            }
        }
        measuredWidth = bVar.f();
        z5 = true;
        if (measuredHeight < bVar.q()) {
            measuredHeight = bVar.q();
        } else if (measuredHeight > bVar.s()) {
            measuredHeight = bVar.s();
        } else {
            z6 = z5;
        }
        if (z6) {
            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
            int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
            view.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
            v(i7, iMakeMeasureSpec3, iMakeMeasureSpec4, view);
            this.f5869a.updateViewCache(i7, view);
        }
    }

    public final void d(int i7, List list) {
        int i10 = this.f5871c[i7];
        if (i10 == -1) {
            i10 = 0;
        }
        if (list.size() > i10) {
            list.subList(i10, list.size()).clear();
        }
        int[] iArr = this.f5871c;
        int length = iArr.length - 1;
        if (i7 > length) {
            Arrays.fill(iArr, -1);
        } else {
            Arrays.fill(iArr, i7, length, -1);
        }
        long[] jArr = this.f5872d;
        int length2 = jArr.length - 1;
        if (i7 > length2) {
            Arrays.fill(jArr, 0L);
        } else {
            Arrays.fill(jArr, i7, length2, 0L);
        }
    }

    public final ArrayList f(int i7) {
        ArrayList arrayList = new ArrayList(i7);
        for (int i10 = 0; i10 < i7; i10++) {
            b bVar = (b) this.f5869a.getFlexItemAt(i10).getLayoutParams();
            c cVar = new c();
            cVar.f16563e = bVar.getOrder();
            cVar.f16562d = i10;
            arrayList.add(cVar);
        }
        return arrayList;
    }

    public final void g(int i7, int i10, int i11) {
        int mode;
        int size;
        ne.a aVar = this.f5869a;
        int flexDirection = aVar.getFlexDirection();
        if (flexDirection == 0 || flexDirection == 1) {
            mode = View.MeasureSpec.getMode(i10);
            size = View.MeasureSpec.getSize(i10);
        } else {
            if (flexDirection != 2 && flexDirection != 3) {
                throw new IllegalArgumentException(kk.b.h(flexDirection, "Invalid flex direction: "));
            }
            mode = View.MeasureSpec.getMode(i7);
            size = View.MeasureSpec.getSize(i7);
        }
        List<FlexLine> flexLinesInternal = aVar.getFlexLinesInternal();
        if (mode == 1073741824) {
            int sumOfCrossSize = aVar.getSumOfCrossSize() + i11;
            int i12 = 0;
            if (flexLinesInternal.size() == 1) {
                ((FlexLine) flexLinesInternal.get(0)).f5859g = size - i11;
                return;
            }
            if (flexLinesInternal.size() >= 2) {
                int alignContent = aVar.getAlignContent();
                if (alignContent == 1) {
                    FlexLine flexLine = new FlexLine();
                    flexLine.f5859g = size - sumOfCrossSize;
                    flexLinesInternal.add(0, flexLine);
                    return;
                }
                if (alignContent == 2) {
                    aVar.setFlexLines(e(flexLinesInternal, size, sumOfCrossSize));
                    return;
                }
                if (alignContent == 3) {
                    if (sumOfCrossSize >= size) {
                        return;
                    }
                    float size2 = (size - sumOfCrossSize) / (flexLinesInternal.size() - 1);
                    ArrayList arrayList = new ArrayList();
                    int size3 = flexLinesInternal.size();
                    float f2 = 0.0f;
                    while (i12 < size3) {
                        arrayList.add((FlexLine) flexLinesInternal.get(i12));
                        if (i12 != flexLinesInternal.size() - 1) {
                            FlexLine flexLine2 = new FlexLine();
                            if (i12 == flexLinesInternal.size() - 2) {
                                flexLine2.f5859g = Math.round(f2 + size2);
                                f2 = 0.0f;
                            } else {
                                flexLine2.f5859g = Math.round(size2);
                            }
                            int i13 = flexLine2.f5859g;
                            float f7 = (size2 - i13) + f2;
                            if (f7 > 1.0f) {
                                flexLine2.f5859g = i13 + 1;
                                f7 -= 1.0f;
                            } else if (f7 < -1.0f) {
                                flexLine2.f5859g = i13 - 1;
                                f7 += 1.0f;
                            }
                            f2 = f7;
                            arrayList.add(flexLine2);
                        }
                        i12++;
                    }
                    aVar.setFlexLines(arrayList);
                    return;
                }
                if (alignContent == 4) {
                    if (sumOfCrossSize >= size) {
                        aVar.setFlexLines(e(flexLinesInternal, size, sumOfCrossSize));
                        return;
                    }
                    int size4 = (size - sumOfCrossSize) / (flexLinesInternal.size() * 2);
                    ArrayList arrayList2 = new ArrayList();
                    FlexLine flexLine3 = new FlexLine();
                    flexLine3.f5859g = size4;
                    for (FlexLine flexLine4 : flexLinesInternal) {
                        arrayList2.add(flexLine3);
                        arrayList2.add(flexLine4);
                        arrayList2.add(flexLine3);
                    }
                    aVar.setFlexLines(arrayList2);
                    return;
                }
                if (alignContent == 5 && sumOfCrossSize < size) {
                    float size5 = (size - sumOfCrossSize) / flexLinesInternal.size();
                    int size6 = flexLinesInternal.size();
                    float f10 = 0.0f;
                    while (i12 < size6) {
                        FlexLine flexLine5 = (FlexLine) flexLinesInternal.get(i12);
                        float f11 = flexLine5.f5859g + size5;
                        if (i12 == flexLinesInternal.size() - 1) {
                            f11 += f10;
                            f10 = 0.0f;
                        }
                        int iRound = Math.round(f11);
                        float f12 = (f11 - iRound) + f10;
                        if (f12 > 1.0f) {
                            iRound++;
                            f12 -= 1.0f;
                        } else if (f12 < -1.0f) {
                            iRound--;
                            f12 += 1.0f;
                        }
                        f10 = f12;
                        flexLine5.f5859g = iRound;
                        i12++;
                    }
                }
            }
        }
    }

    public final void h(int i7, int i10, int i11) {
        int size;
        int paddingLeft;
        int paddingRight;
        int i12;
        int i13;
        ne.a aVar = this.f5869a;
        int flexItemCount = aVar.getFlexItemCount();
        boolean[] zArr = this.f5870b;
        if (zArr == null) {
            this.f5870b = new boolean[Math.max(flexItemCount, 10)];
        } else if (zArr.length < flexItemCount) {
            this.f5870b = new boolean[Math.max(zArr.length * 2, flexItemCount)];
        } else {
            Arrays.fill(zArr, false);
        }
        if (i11 >= aVar.getFlexItemCount()) {
            return;
        }
        int flexDirection = aVar.getFlexDirection();
        int flexDirection2 = aVar.getFlexDirection();
        if (flexDirection2 == 0 || flexDirection2 == 1) {
            int mode = View.MeasureSpec.getMode(i7);
            size = View.MeasureSpec.getSize(i7);
            int largestMainSize = aVar.getLargestMainSize();
            if (mode != 1073741824) {
                size = Math.min(largestMainSize, size);
            }
            paddingLeft = aVar.getPaddingLeft();
            paddingRight = aVar.getPaddingRight();
        } else {
            if (flexDirection2 != 2 && flexDirection2 != 3) {
                throw new IllegalArgumentException(kk.b.h(flexDirection, "Invalid flex direction: "));
            }
            int mode2 = View.MeasureSpec.getMode(i10);
            size = View.MeasureSpec.getSize(i10);
            if (mode2 != 1073741824) {
                size = aVar.getLargestMainSize();
            }
            paddingLeft = aVar.getPaddingTop();
            paddingRight = aVar.getPaddingBottom();
        }
        int i14 = paddingRight + paddingLeft;
        int i15 = size;
        int[] iArr = this.f5871c;
        int i16 = iArr != null ? iArr[i11] : 0;
        List flexLinesInternal = aVar.getFlexLinesInternal();
        int size2 = flexLinesInternal.size();
        while (i16 < size2) {
            FlexLine flexLine = (FlexLine) flexLinesInternal.get(i16);
            int i17 = flexLine.f5857e;
            if (i17 >= i15 || !flexLine.f5867q) {
                i12 = i7;
                i13 = i10;
                if (i17 > i15 && flexLine.f5868r) {
                    q(i12, i13, flexLine, i15, i14, false);
                }
            } else {
                i12 = i7;
                i13 = i10;
                l(i12, i13, flexLine, i15, i14, false);
            }
            i16++;
            i7 = i12;
            i10 = i13;
        }
    }

    public final void i(int i7) {
        int[] iArr = this.f5871c;
        if (iArr == null) {
            this.f5871c = new int[Math.max(i7, 10)];
        } else if (iArr.length < i7) {
            this.f5871c = Arrays.copyOf(this.f5871c, Math.max(iArr.length * 2, i7));
        }
    }

    public final void j(int i7) {
        long[] jArr = this.f5872d;
        if (jArr == null) {
            this.f5872d = new long[Math.max(i7, 10)];
        } else if (jArr.length < i7) {
            this.f5872d = Arrays.copyOf(this.f5872d, Math.max(jArr.length * 2, i7));
        }
    }

    public final void k(int i7) {
        long[] jArr = this.f5873e;
        if (jArr == null) {
            this.f5873e = new long[Math.max(i7, 10)];
        } else if (jArr.length < i7) {
            this.f5873e = Arrays.copyOf(this.f5873e, Math.max(jArr.length * 2, i7));
        }
    }

    public final void l(int i7, int i10, FlexLine flexLine, int i11, int i12, boolean z5) {
        int i13;
        float f2;
        int iMax;
        double d6;
        double d7;
        float f7 = flexLine.j;
        float f10 = 0.0f;
        if (f7 <= 0.0f || i11 < (i13 = flexLine.f5857e)) {
            return;
        }
        float f11 = (i11 - i13) / f7;
        flexLine.f5857e = i12 + flexLine.f5858f;
        if (!z5) {
            flexLine.f5859g = Integer.MIN_VALUE;
        }
        int i14 = 0;
        boolean z6 = false;
        int i15 = 0;
        float f12 = 0.0f;
        while (i14 < flexLine.f5860h) {
            int i16 = flexLine.f5865o + i14;
            ne.a aVar = this.f5869a;
            View reorderedFlexItemAt = aVar.getReorderedFlexItemAt(i16);
            if (reorderedFlexItemAt == null || reorderedFlexItemAt.getVisibility() == 8) {
                f2 = f10;
                i13 = i13;
                f11 = f11;
                z6 = z6;
            } else {
                b bVar = (b) reorderedFlexItemAt.getLayoutParams();
                int flexDirection = aVar.getFlexDirection();
                f2 = f10;
                if (flexDirection == 0 || flexDirection == 1) {
                    i13 = i13;
                    f11 = f11;
                    boolean z7 = z6;
                    int measuredWidth = reorderedFlexItemAt.getMeasuredWidth();
                    long[] jArr = this.f5873e;
                    if (jArr != null) {
                        measuredWidth = (int) jArr[i16];
                    }
                    int measuredHeight = reorderedFlexItemAt.getMeasuredHeight();
                    long[] jArr2 = this.f5873e;
                    if (jArr2 != null) {
                        measuredHeight = (int) (jArr2[i16] >> 32);
                    }
                    if (this.f5870b[i16] || bVar.n() <= f2) {
                        z6 = z7;
                    } else {
                        float fN = (bVar.n() * f11) + measuredWidth;
                        if (i14 == flexLine.f5860h - 1) {
                            fN += f12;
                            f12 = f2;
                        }
                        int iRound = Math.round(fN);
                        if (iRound > bVar.u()) {
                            iRound = bVar.u();
                            this.f5870b[i16] = true;
                            flexLine.j -= bVar.n();
                            z6 = true;
                        } else {
                            float f13 = (fN - iRound) + f12;
                            double d8 = f13;
                            if (d8 > 1.0d) {
                                iRound++;
                                d6 = d8 - 1.0d;
                            } else {
                                if (d8 < -1.0d) {
                                    iRound--;
                                    d6 = d8 + 1.0d;
                                }
                                f12 = f13;
                                z6 = z7;
                            }
                            f13 = (float) d6;
                            f12 = f13;
                            z6 = z7;
                        }
                        int iM = m(i10, bVar, flexLine.f5863m);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                        reorderedFlexItemAt.measure(iMakeMeasureSpec, iM);
                        int measuredWidth2 = reorderedFlexItemAt.getMeasuredWidth();
                        int measuredHeight2 = reorderedFlexItemAt.getMeasuredHeight();
                        v(i16, iMakeMeasureSpec, iM, reorderedFlexItemAt);
                        aVar.updateViewCache(i16, reorderedFlexItemAt);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int iMax2 = Math.max(i15, aVar.getDecorationLengthCrossAxis(reorderedFlexItemAt) + bVar.j() + bVar.l() + measuredHeight);
                    flexLine.f5857e = bVar.p() + bVar.k() + measuredWidth + flexLine.f5857e;
                    iMax = iMax2;
                } else {
                    int measuredHeight3 = reorderedFlexItemAt.getMeasuredHeight();
                    long[] jArr3 = this.f5873e;
                    if (jArr3 != null) {
                        measuredHeight3 = (int) (jArr3[i16] >> 32);
                    }
                    int measuredWidth3 = reorderedFlexItemAt.getMeasuredWidth();
                    long[] jArr4 = this.f5873e;
                    if (jArr4 != null) {
                        measuredWidth3 = (int) jArr4[i16];
                    }
                    if (this.f5870b[i16] || bVar.n() <= f2) {
                        i13 = i13;
                        z6 = z6;
                    } else {
                        float fN2 = (bVar.n() * f11) + measuredHeight3;
                        if (i14 == flexLine.f5860h - 1) {
                            fN2 += f12;
                            f12 = f2;
                        }
                        int iRound2 = Math.round(fN2);
                        if (iRound2 > bVar.s()) {
                            iRound2 = bVar.s();
                            this.f5870b[i16] = true;
                            flexLine.j -= bVar.n();
                            z6 = true;
                        } else {
                            float f14 = (fN2 - iRound2) + f12;
                            double d9 = f14;
                            if (d9 > 1.0d) {
                                iRound2++;
                                d7 = d9 - 1.0d;
                            } else {
                                if (d9 < -1.0d) {
                                    iRound2--;
                                    d7 = d9 + 1.0d;
                                } else {
                                    f12 = f14;
                                }
                                z6 = z6;
                            }
                            f12 = (float) d7;
                            z6 = z6;
                        }
                        int iN = n(i7, bVar, flexLine.f5863m);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
                        reorderedFlexItemAt.measure(iN, iMakeMeasureSpec2);
                        int measuredWidth4 = reorderedFlexItemAt.getMeasuredWidth();
                        int measuredHeight4 = reorderedFlexItemAt.getMeasuredHeight();
                        v(i16, iN, iMakeMeasureSpec2, reorderedFlexItemAt);
                        aVar.updateViewCache(i16, reorderedFlexItemAt);
                        measuredWidth3 = measuredWidth4;
                        measuredHeight3 = measuredHeight4;
                    }
                    iMax = Math.max(i15, aVar.getDecorationLengthCrossAxis(reorderedFlexItemAt) + bVar.p() + bVar.k() + measuredWidth3);
                    flexLine.f5857e = bVar.j() + bVar.l() + measuredHeight3 + flexLine.f5857e;
                }
                flexLine.f5859g = Math.max(flexLine.f5859g, iMax);
                i15 = iMax;
            }
            i14++;
            f11 = f11;
            f10 = f2;
            i13 = i13;
        }
        int i17 = i13;
        if (!z6 || i17 == flexLine.f5857e) {
            return;
        }
        l(i7, i10, flexLine, i11, i12, true);
    }

    public final int m(int i7, b bVar, int i10) {
        ne.a aVar = this.f5869a;
        int childHeightMeasureSpec = aVar.getChildHeightMeasureSpec(i7, bVar.j() + bVar.l() + aVar.getPaddingBottom() + aVar.getPaddingTop() + i10, bVar.getHeight());
        int size = View.MeasureSpec.getSize(childHeightMeasureSpec);
        if (size > bVar.s()) {
            return View.MeasureSpec.makeMeasureSpec(bVar.s(), View.MeasureSpec.getMode(childHeightMeasureSpec));
        }
        return size < bVar.q() ? View.MeasureSpec.makeMeasureSpec(bVar.q(), View.MeasureSpec.getMode(childHeightMeasureSpec)) : childHeightMeasureSpec;
    }

    public final int n(int i7, b bVar, int i10) {
        ne.a aVar = this.f5869a;
        int childWidthMeasureSpec = aVar.getChildWidthMeasureSpec(i7, bVar.p() + bVar.k() + aVar.getPaddingRight() + aVar.getPaddingLeft() + i10, bVar.getWidth());
        int size = View.MeasureSpec.getSize(childWidthMeasureSpec);
        if (size > bVar.u()) {
            return View.MeasureSpec.makeMeasureSpec(bVar.u(), View.MeasureSpec.getMode(childWidthMeasureSpec));
        }
        return size < bVar.f() ? View.MeasureSpec.makeMeasureSpec(bVar.f(), View.MeasureSpec.getMode(childWidthMeasureSpec)) : childWidthMeasureSpec;
    }

    public final void o(View view, FlexLine flexLine, int i7, int i10, int i11, int i12) {
        b bVar = (b) view.getLayoutParams();
        ne.a aVar = this.f5869a;
        int alignItems = aVar.getAlignItems();
        if (bVar.c() != -1) {
            alignItems = bVar.c();
        }
        int i13 = flexLine.f5859g;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (aVar.getFlexWrap() != 2) {
                    int i14 = i10 + i13;
                    view.layout(i7, (i14 - view.getMeasuredHeight()) - bVar.j(), i11, i14 - bVar.j());
                    return;
                }
                view.layout(i7, bVar.l() + view.getMeasuredHeight() + (i10 - i13), i11, bVar.l() + view.getMeasuredHeight() + (i12 - i13));
                return;
            }
            if (alignItems == 2) {
                int iL = ((bVar.l() + (i13 - view.getMeasuredHeight())) - bVar.j()) / 2;
                if (aVar.getFlexWrap() != 2) {
                    int i15 = i10 + iL;
                    view.layout(i7, i15, i11, view.getMeasuredHeight() + i15);
                    return;
                } else {
                    int i16 = i10 - iL;
                    view.layout(i7, i16, i11, view.getMeasuredHeight() + i16);
                    return;
                }
            }
            if (alignItems == 3) {
                if (aVar.getFlexWrap() != 2) {
                    int iMax = Math.max(flexLine.f5862l - view.getBaseline(), bVar.l());
                    view.layout(i7, i10 + iMax, i11, i12 + iMax);
                    return;
                } else {
                    int iMax2 = Math.max(view.getBaseline() + (flexLine.f5862l - view.getMeasuredHeight()), bVar.j());
                    view.layout(i7, i10 - iMax2, i11, i12 - iMax2);
                    return;
                }
            }
            if (alignItems != 4) {
                return;
            }
        }
        if (aVar.getFlexWrap() != 2) {
            view.layout(i7, bVar.l() + i10, i11, bVar.l() + i12);
        } else {
            view.layout(i7, i10 - bVar.j(), i11, i12 - bVar.j());
        }
    }

    public final void p(View view, FlexLine flexLine, boolean z5, int i7, int i10, int i11, int i12) {
        b bVar = (b) view.getLayoutParams();
        int alignItems = this.f5869a.getAlignItems();
        if (bVar.c() != -1) {
            alignItems = bVar.c();
        }
        int i13 = flexLine.f5859g;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (!z5) {
                    view.layout(((i7 + i13) - view.getMeasuredWidth()) - bVar.p(), i10, ((i11 + i13) - view.getMeasuredWidth()) - bVar.p(), i12);
                    return;
                }
                view.layout(bVar.k() + view.getMeasuredWidth() + (i7 - i13), i10, bVar.k() + view.getMeasuredWidth() + (i11 - i13), i12);
                return;
            }
            if (alignItems == 2) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                int marginStart = ((marginLayoutParams.getMarginStart() + (i13 - view.getMeasuredWidth())) - marginLayoutParams.getMarginEnd()) / 2;
                if (z5) {
                    view.layout(i7 - marginStart, i10, i11 - marginStart, i12);
                    return;
                } else {
                    view.layout(i7 + marginStart, i10, i11 + marginStart, i12);
                    return;
                }
            }
            if (alignItems != 3 && alignItems != 4) {
                return;
            }
        }
        if (z5) {
            view.layout(i7 - bVar.p(), i10, i11 - bVar.p(), i12);
        } else {
            view.layout(bVar.k() + i7, i10, bVar.k() + i11, i12);
        }
    }

    public final void q(int i7, int i10, FlexLine flexLine, int i11, int i12, boolean z5) {
        float f2;
        int iMax;
        int iF;
        int iQ;
        int i13 = flexLine.f5857e;
        float f7 = flexLine.k;
        float f10 = 0.0f;
        if (f7 <= 0.0f || i11 > i13) {
            return;
        }
        float f11 = (i13 - i11) / f7;
        flexLine.f5857e = i12 + flexLine.f5858f;
        if (!z5) {
            flexLine.f5859g = Integer.MIN_VALUE;
        }
        int i14 = 0;
        boolean z6 = false;
        int i15 = 0;
        float f12 = 0.0f;
        while (i14 < flexLine.f5860h) {
            int i16 = flexLine.f5865o + i14;
            ne.a aVar = this.f5869a;
            View reorderedFlexItemAt = aVar.getReorderedFlexItemAt(i16);
            if (reorderedFlexItemAt == null || reorderedFlexItemAt.getVisibility() == 8) {
                f2 = f10;
                f11 = f11;
            } else {
                b bVar = (b) reorderedFlexItemAt.getLayoutParams();
                int flexDirection = aVar.getFlexDirection();
                f2 = f10;
                if (flexDirection == 0 || flexDirection == 1) {
                    f11 = f11;
                    int measuredWidth = reorderedFlexItemAt.getMeasuredWidth();
                    long[] jArr = this.f5873e;
                    if (jArr != null) {
                        measuredWidth = (int) jArr[i16];
                    }
                    int measuredHeight = reorderedFlexItemAt.getMeasuredHeight();
                    long[] jArr2 = this.f5873e;
                    if (jArr2 != null) {
                        measuredHeight = (int) (jArr2[i16] >> 32);
                    }
                    if (!this.f5870b[i16] && bVar.d() > f2) {
                        float fD = measuredWidth - (bVar.d() * f11);
                        if (i14 == flexLine.f5860h - 1) {
                            fD += f12;
                            f12 = f2;
                        }
                        int iRound = Math.round(fD);
                        if (iRound < bVar.f()) {
                            iF = bVar.f();
                            this.f5870b[i16] = true;
                            flexLine.k -= bVar.d();
                            z6 = true;
                        } else {
                            float f13 = (fD - iRound) + f12;
                            double d6 = f13;
                            if (d6 > 1.0d) {
                                iF = iRound + 1;
                                f13 -= 1.0f;
                            } else if (d6 < -1.0d) {
                                iF = iRound - 1;
                                f13 += 1.0f;
                            } else {
                                iF = iRound;
                            }
                            f12 = f13;
                        }
                        int iM = m(i10, bVar, flexLine.f5863m);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iF, 1073741824);
                        reorderedFlexItemAt.measure(iMakeMeasureSpec, iM);
                        int measuredWidth2 = reorderedFlexItemAt.getMeasuredWidth();
                        int measuredHeight2 = reorderedFlexItemAt.getMeasuredHeight();
                        v(i16, iMakeMeasureSpec, iM, reorderedFlexItemAt);
                        aVar.updateViewCache(i16, reorderedFlexItemAt);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int iMax2 = Math.max(i15, aVar.getDecorationLengthCrossAxis(reorderedFlexItemAt) + bVar.j() + bVar.l() + measuredHeight);
                    flexLine.f5857e = bVar.p() + bVar.k() + measuredWidth + flexLine.f5857e;
                    iMax = iMax2;
                } else {
                    int measuredHeight3 = reorderedFlexItemAt.getMeasuredHeight();
                    long[] jArr3 = this.f5873e;
                    if (jArr3 != null) {
                        measuredHeight3 = (int) (jArr3[i16] >> 32);
                    }
                    int measuredWidth3 = reorderedFlexItemAt.getMeasuredWidth();
                    long[] jArr4 = this.f5873e;
                    if (jArr4 != null) {
                        measuredWidth3 = (int) jArr4[i16];
                    }
                    if (this.f5870b[i16] || bVar.d() <= f2) {
                        f11 = f11;
                    } else {
                        float fD2 = measuredHeight3 - (bVar.d() * f11);
                        if (i14 == flexLine.f5860h - 1) {
                            fD2 += f12;
                            f12 = f2;
                        }
                        int iRound2 = Math.round(fD2);
                        if (iRound2 < bVar.q()) {
                            iQ = bVar.q();
                            this.f5870b[i16] = true;
                            flexLine.k -= bVar.d();
                            z6 = true;
                        } else {
                            float f14 = (fD2 - iRound2) + f12;
                            double d7 = f14;
                            if (d7 > 1.0d) {
                                iQ = iRound2 + 1;
                                f14 -= 1.0f;
                            } else if (d7 < -1.0d) {
                                iQ = iRound2 - 1;
                                f14 += 1.0f;
                            } else {
                                iQ = iRound2;
                            }
                            f12 = f14;
                        }
                        int iN = n(i7, bVar, flexLine.f5863m);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iQ, 1073741824);
                        reorderedFlexItemAt.measure(iN, iMakeMeasureSpec2);
                        int measuredWidth4 = reorderedFlexItemAt.getMeasuredWidth();
                        int measuredHeight4 = reorderedFlexItemAt.getMeasuredHeight();
                        v(i16, iN, iMakeMeasureSpec2, reorderedFlexItemAt);
                        aVar.updateViewCache(i16, reorderedFlexItemAt);
                        measuredWidth3 = measuredWidth4;
                        measuredHeight3 = measuredHeight4;
                    }
                    iMax = Math.max(i15, aVar.getDecorationLengthCrossAxis(reorderedFlexItemAt) + bVar.p() + bVar.k() + measuredWidth3);
                    flexLine.f5857e = bVar.j() + bVar.l() + measuredHeight3 + flexLine.f5857e;
                }
                flexLine.f5859g = Math.max(flexLine.f5859g, iMax);
                i15 = iMax;
            }
            i14++;
            f10 = f2;
            f11 = f11;
        }
        if (!z6 || i13 == flexLine.f5857e) {
            return;
        }
        q(i7, i10, flexLine, i11, i12, true);
    }

    public final void s(View view, int i7, int i10) {
        b bVar = (b) view.getLayoutParams();
        int iK = (i7 - bVar.k()) - bVar.p();
        ne.a aVar = this.f5869a;
        int iMin = Math.min(Math.max(iK - aVar.getDecorationLengthCrossAxis(view), bVar.f()), bVar.u());
        long[] jArr = this.f5873e;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? (int) (jArr[i10] >> 32) : view.getMeasuredHeight(), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec2, iMakeMeasureSpec);
        v(i10, iMakeMeasureSpec2, iMakeMeasureSpec, view);
        aVar.updateViewCache(i10, view);
    }

    public final void t(View view, int i7, int i10) {
        b bVar = (b) view.getLayoutParams();
        int iL = (i7 - bVar.l()) - bVar.j();
        ne.a aVar = this.f5869a;
        int iMin = Math.min(Math.max(iL - aVar.getDecorationLengthCrossAxis(view), bVar.q()), bVar.s());
        long[] jArr = this.f5873e;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? (int) jArr[i10] : view.getMeasuredWidth(), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        v(i10, iMakeMeasureSpec, iMakeMeasureSpec2, view);
        aVar.updateViewCache(i10, view);
    }

    public final void u(int i7) {
        View reorderedFlexItemAt;
        ne.a aVar = this.f5869a;
        if (i7 >= aVar.getFlexItemCount()) {
            return;
        }
        int flexDirection = aVar.getFlexDirection();
        if (aVar.getAlignItems() != 4) {
            for (FlexLine flexLine : aVar.getFlexLinesInternal()) {
                for (Integer num : flexLine.f5864n) {
                    View reorderedFlexItemAt2 = aVar.getReorderedFlexItemAt(num.intValue());
                    if (flexDirection == 0 || flexDirection == 1) {
                        t(reorderedFlexItemAt2, flexLine.f5859g, num.intValue());
                    } else {
                        if (flexDirection != 2 && flexDirection != 3) {
                            throw new IllegalArgumentException(kk.b.h(flexDirection, "Invalid flex direction: "));
                        }
                        s(reorderedFlexItemAt2, flexLine.f5859g, num.intValue());
                    }
                }
            }
            return;
        }
        int[] iArr = this.f5871c;
        List flexLinesInternal = aVar.getFlexLinesInternal();
        int size = flexLinesInternal.size();
        for (int i10 = iArr != null ? iArr[i7] : 0; i10 < size; i10++) {
            FlexLine flexLine2 = (FlexLine) flexLinesInternal.get(i10);
            int i11 = flexLine2.f5860h;
            for (int i12 = 0; i12 < i11; i12++) {
                int i13 = flexLine2.f5865o + i12;
                if (i12 < aVar.getFlexItemCount() && (reorderedFlexItemAt = aVar.getReorderedFlexItemAt(i13)) != null && reorderedFlexItemAt.getVisibility() != 8) {
                    b bVar = (b) reorderedFlexItemAt.getLayoutParams();
                    if (bVar.c() == -1 || bVar.c() == 4) {
                        if (flexDirection == 0 || flexDirection == 1) {
                            t(reorderedFlexItemAt, flexLine2.f5859g, i13);
                        } else {
                            if (flexDirection != 2 && flexDirection != 3) {
                                throw new IllegalArgumentException(kk.b.h(flexDirection, "Invalid flex direction: "));
                            }
                            s(reorderedFlexItemAt, flexLine2.f5859g, i13);
                        }
                    }
                }
            }
        }
    }

    public final void v(int i7, int i10, int i11, View view) {
        long[] jArr = this.f5872d;
        if (jArr != null) {
            jArr[i7] = (((long) i10) & 4294967295L) | (((long) i11) << 32);
        }
        long[] jArr2 = this.f5873e;
        if (jArr2 != null) {
            jArr2[i7] = (((long) view.getMeasuredWidth()) & 4294967295L) | (((long) view.getMeasuredHeight()) << 32);
        }
    }
}
