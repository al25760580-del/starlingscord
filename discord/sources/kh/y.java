package kh;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import com.discord.R;
import java.io.IOException;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f14541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[][] f14542c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m[] f14543d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x f14544e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final x f14545f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x f14546g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x f14547h;

    public y(cs.r rVar) {
        this.f14540a = rVar.f7466b;
        this.f14541b = (m) rVar.f7467c;
        this.f14542c = (int[][]) rVar.f7468d;
        this.f14543d = (m[]) rVar.f7469e;
        this.f14544e = (x) rVar.f7470f;
        this.f14545f = (x) rVar.f7471g;
        this.f14546g = (x) rVar.f7472h;
        this.f14547h = (x) rVar.f7473i;
    }

    public static void a(cs.r rVar, Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
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
                int[] iArr = kg.a.f14452y;
                TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                m mVarA = m.a(context, typedArrayObtainAttributes.getResourceId(0, 0), typedArrayObtainAttributes.getResourceId(1, 0)).a();
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i7 = 0;
                for (int i10 = 0; i10 < attributeCount; i10++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i10);
                    if (attributeNameResource != R.attr.shapeAppearance && attributeNameResource != R.attr.shapeAppearanceOverlay) {
                        int i11 = i7 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i10, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i7] = attributeNameResource;
                        i7 = i11;
                    }
                }
                rVar.a(StateSet.trimStateSet(iArr2, i7), mVarA);
            }
        }
    }

    public static y b(Context context, TypedArray typedArray, int i7) {
        int next;
        int resourceId = typedArray.getResourceId(i7, 0);
        if (resourceId == 0 || !Objects.equals(context.getResources().getResourceTypeName(resourceId), "xml")) {
            return null;
        }
        cs.r rVar = new cs.r(1);
        rVar.f();
        try {
            XmlResourceParser xml = context.getResources().getXml(resourceId);
            try {
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                if (xml.getName().equals("selector")) {
                    a(rVar, context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                xml.close();
                if (rVar.f7466b == 0) {
                    return null;
                }
                return new y(rVar);
            } catch (Throwable th2) {
                if (xml != null) {
                    try {
                        xml.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
            rVar.f();
        }
    }

    public final m c() {
        m mVar = this.f14541b;
        x xVar = this.f14547h;
        x xVar2 = this.f14546g;
        x xVar3 = this.f14545f;
        x xVar4 = this.f14544e;
        if (xVar4 == null && xVar3 == null && xVar2 == null && xVar == null) {
            return mVar;
        }
        l lVarG = mVar.g();
        if (xVar4 != null) {
            lVarG.f14494e = xVar4.f14537b;
        }
        if (xVar3 != null) {
            lVarG.f14495f = xVar3.f14537b;
        }
        if (xVar2 != null) {
            lVarG.f14497h = xVar2.f14537b;
        }
        if (xVar != null) {
            lVarG.f14496g = xVar.f14537b;
        }
        return lVarG.a();
    }

    public final boolean d() {
        x xVar;
        x xVar2;
        x xVar3;
        x xVar4;
        return this.f14540a > 1 || ((xVar = this.f14544e) != null && xVar.f14536a > 1) || (((xVar2 = this.f14545f) != null && xVar2.f14536a > 1) || (((xVar3 = this.f14546g) != null && xVar3.f14536a > 1) || ((xVar4 = this.f14547h) != null && xVar4.f14536a > 1)));
    }
}
