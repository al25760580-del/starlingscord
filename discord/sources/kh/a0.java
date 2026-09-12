package kh;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import com.discord.R;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ue.i f14456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[][] f14457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ue.i[] f14458d;

    /* JADX WARN: Code duplicated, block: B:28:0x0069  */
    public final void a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        z zVar;
        int depth = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlResourceParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth && xmlResourceParser.getName().equals("item")) {
                Resources resources = context.getResources();
                int[] iArr = kg.a.K;
                TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                TypedValue typedValuePeekValue = typedArrayObtainAttributes.peekValue(0);
                if (typedValuePeekValue != null) {
                    int i7 = typedValuePeekValue.type;
                    if (i7 == 5) {
                        zVar = new z(2, TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArrayObtainAttributes.getResources().getDisplayMetrics()));
                    } else if (i7 == 6) {
                        zVar = new z(1, typedValuePeekValue.getFraction(1.0f, 1.0f));
                    } else {
                        zVar = null;
                    }
                } else {
                    zVar = null;
                }
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i10 = 0;
                for (int i11 = 0; i11 < attributeCount; i11++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i11);
                    if (attributeNameResource != R.attr.widthChange) {
                        int i12 = i10 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i11, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i10] = attributeNameResource;
                        i10 = i12;
                    }
                }
                int[] iArrTrimStateSet = StateSet.trimStateSet(iArr2, i10);
                ue.i iVar = new ue.i();
                iVar.f21117d = zVar;
                int i13 = this.f14455a;
                if (i13 == 0 || iArrTrimStateSet.length == 0) {
                    this.f14456b = iVar;
                }
                int[][] iArr3 = this.f14457c;
                if (i13 >= iArr3.length) {
                    int i14 = i13 + 10;
                    int[][] iArr4 = new int[i14][];
                    System.arraycopy(iArr3, 0, iArr4, 0, i13);
                    this.f14457c = iArr4;
                    ue.i[] iVarArr = new ue.i[i14];
                    System.arraycopy(this.f14458d, 0, iVarArr, 0, i13);
                    this.f14458d = iVarArr;
                }
                int[][] iArr5 = this.f14457c;
                int i15 = this.f14455a;
                iArr5[i15] = iArrTrimStateSet;
                this.f14458d[i15] = iVar;
                this.f14455a = i15 + 1;
            }
        }
    }
}
