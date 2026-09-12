package ne;

import android.view.View;
import com.google.android.flexbox.FlexLine;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface a {
    int getAlignContent();

    int getAlignItems();

    int getChildHeightMeasureSpec(int i7, int i10, int i11);

    int getChildWidthMeasureSpec(int i7, int i10, int i11);

    int getDecorationLengthCrossAxis(View view);

    int getDecorationLengthMainAxis(View view, int i7, int i10);

    int getFlexDirection();

    View getFlexItemAt(int i7);

    int getFlexItemCount();

    List getFlexLinesInternal();

    int getFlexWrap();

    int getLargestMainSize();

    int getMaxLine();

    int getPaddingBottom();

    int getPaddingEnd();

    int getPaddingLeft();

    int getPaddingRight();

    int getPaddingStart();

    int getPaddingTop();

    View getReorderedFlexItemAt(int i7);

    int getSumOfCrossSize();

    boolean isMainAxisDirectionHorizontal();

    void onNewFlexItemAdded(View view, int i7, int i10, FlexLine flexLine);

    void onNewFlexLineAdded(FlexLine flexLine);

    void setFlexLines(List list);

    void updateViewCache(int i7, View view);
}
