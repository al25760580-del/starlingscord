package com.swmansion.rnscreens.bottomsheet;

import a3.e;
import com.swmansion.rnscreens.Screen;
import com.swmansion.rnscreens.ScreenContentWrapper;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class SheetDetents {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f7172a;

    public SheetDetents(List rawDetents) {
        Intrinsics.checkNotNullParameter(rawDetents, "rawDetents");
        this.f7172a = CollectionsKt.i0(rawDetents);
        if (rawDetents.isEmpty()) {
            throw new IllegalArgumentException("[RNScreens] At least one detent must be provided.");
        }
        if (rawDetents.size() > 3) {
            throw new IllegalArgumentException("[RNScreens] Maximum of 3 detents supported.");
        }
        if (rawDetents.size() == 1) {
            double dDoubleValue = ((Number) rawDetents.get(0)).doubleValue();
            if ((0.0d > dDoubleValue || dDoubleValue > 1.0d) && dDoubleValue != -1.0d) {
                throw new IllegalArgumentException(("[RNScreens] Detent value must be within 0.0 and 1.0, or SHEET_FIT_TO_CONTENTS should be defined, got " + dDoubleValue + ".").toString());
            }
            return;
        }
        Iterator it = rawDetents.iterator();
        while (it.hasNext()) {
            double dDoubleValue2 = ((Number) it.next()).doubleValue();
            if (0.0d > dDoubleValue2 || dDoubleValue2 > 1.0d) {
                throw new IllegalArgumentException(("[RNScreens] Detent values must be within 0.0 and 1.0, got " + dDoubleValue2 + ".").toString());
            }
        }
        if (!Intrinsics.areEqual(rawDetents, CollectionsKt.d0(rawDetents))) {
            throw new IllegalArgumentException("[RNScreens] Detents must be sorted in ascending order.");
        }
    }

    public static int d(Screen screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        ScreenContentWrapper contentWrapper = screen.getContentWrapper();
        if (contentWrapper == null) {
            return 0;
        }
        Integer numValueOf = Integer.valueOf(contentWrapper.getHeight());
        Intrinsics.checkNotNullParameter(contentWrapper, "<this>");
        if (!contentWrapper.isLaidOut() && contentWrapper.getHeight() <= 0 && contentWrapper.getWidth() <= 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    public final int a(int i7, int i10, boolean z5) {
        List list = this.f7172a;
        if (list.size() < 3) {
            throw new IllegalStateException("[RNScreens] At least 3 detents required for expandedOffsetFromTop.");
        }
        int iDoubleValue = (int) ((((double) 1) - ((Number) list.get(2)).doubleValue()) * ((double) i7));
        if (z5) {
            i10 = 0;
        }
        return iDoubleValue + i10;
    }

    public final int b(int i7, int i10) {
        double dDoubleValue = ((Number) this.f7172a.get(i7)).doubleValue();
        if (dDoubleValue != -1.0d) {
            return (int) (dDoubleValue * ((double) i10));
        }
        throw new IllegalArgumentException("[RNScreens] FIT_TO_CONTENTS is not supported by heightAt.");
    }

    public final int c(int i7) {
        return b(this.f7172a.size() - 1, i7);
    }

    public final int e(int i7) {
        int size = this.f7172a.size();
        if (size != 1) {
            if (size != 2) {
                if (size != 3) {
                    throw new IllegalArgumentException(e.g(size, i7, "[RNScreens] Invalid detentCount/index combination ", " / "));
                }
                if (i7 == -1) {
                    return 5;
                }
                if (i7 == 0) {
                    return 4;
                }
                if (i7 == 1) {
                    return 6;
                }
                if (i7 != 2) {
                    throw new IllegalArgumentException(e.g(size, i7, "[RNScreens] Invalid detentCount/index combination ", " / "));
                }
            } else {
                if (i7 == -1) {
                    return 5;
                }
                if (i7 == 0) {
                    return 4;
                }
                if (i7 != 1) {
                    throw new IllegalArgumentException(e.g(size, i7, "[RNScreens] Invalid detentCount/index combination ", " / "));
                }
            }
        } else {
            if (i7 == -1) {
                return 5;
            }
            if (i7 != 0) {
                throw new IllegalArgumentException(e.g(size, i7, "[RNScreens] Invalid detentCount/index combination ", " / "));
            }
        }
        return 3;
    }
}
