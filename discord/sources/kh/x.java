package kh;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import com.discord.R;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f14537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[][] f14538c = new int[10][];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d[] f14539d = new d[10];

    public static x b(d dVar) {
        x xVar = new x();
        xVar.a(StateSet.WILD_CARD, dVar);
        return xVar;
    }

    public final void a(int[] iArr, d dVar) {
        int i7 = this.f14536a;
        if (i7 == 0 || iArr.length == 0) {
            this.f14537b = dVar;
        }
        int[][] iArr2 = this.f14538c;
        if (i7 >= iArr2.length) {
            int i10 = i7 + 10;
            int[][] iArr3 = new int[i10][];
            System.arraycopy(iArr2, 0, iArr3, 0, i7);
            this.f14538c = iArr3;
            d[] dVarArr = new d[i10];
            System.arraycopy(this.f14539d, 0, dVarArr, 0, i7);
            this.f14539d = dVarArr;
        }
        int[][] iArr4 = this.f14538c;
        int i11 = this.f14536a;
        iArr4[i11] = iArr;
        this.f14539d[i11] = dVar;
        this.f14536a = i11 + 1;
    }

    public final d c(int[] iArr) {
        int i7;
        int[][] iArr2 = this.f14538c;
        int i10 = 0;
        while (true) {
            i7 = -1;
            if (i10 >= this.f14536a) {
                i10 = -1;
                break;
            }
            if (StateSet.stateSetMatches(iArr2[i10], iArr)) {
                break;
            }
            i10++;
        }
        if (i10 < 0) {
            int[] iArr3 = StateSet.WILD_CARD;
            int[][] iArr4 = this.f14538c;
            for (int i11 = 0; i11 < this.f14536a; i11++) {
                if (StateSet.stateSetMatches(iArr4[i11], iArr3)) {
                    i7 = i11;
                    break;
                }
            }
            i10 = i7;
        }
        return i10 < 0 ? this.f14537b : this.f14539d[i10];
    }

    public final void d(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
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
                int[] iArr = kg.a.H;
                TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                d dVarD = m.d(typedArrayObtainAttributes, 5, new a(0.0f));
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i7 = 0;
                for (int i10 = 0; i10 < attributeCount; i10++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i10);
                    if (attributeNameResource != R.attr.cornerSize) {
                        int i11 = i7 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i10, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i7] = attributeNameResource;
                        i7 = i11;
                    }
                }
                a(StateSet.trimStateSet(iArr2, i7), dVarD);
            }
        }
    }
}
