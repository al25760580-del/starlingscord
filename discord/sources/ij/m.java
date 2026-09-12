package ij;

/* JADX INFO: loaded from: classes3.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f11823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f11824b;

    public m(float f2, float f7) {
        this.f11823a = f2;
        this.f11824b = f7;
    }

    public static float a(m mVar, m mVar2) {
        float f2 = mVar.f11823a;
        float f7 = mVar.f11824b;
        float f10 = f2 - mVar2.f11823a;
        float f11 = f7 - mVar2.f11824b;
        return (float) Math.sqrt((f11 * f11) + (f10 * f10));
    }

    public static void b(m[] mVarArr) {
        m mVar;
        m mVar2;
        m mVar3;
        float fA = a(mVarArr[0], mVarArr[1]);
        float fA2 = a(mVarArr[1], mVarArr[2]);
        float fA3 = a(mVarArr[0], mVarArr[2]);
        if (fA2 >= fA && fA2 >= fA3) {
            mVar = mVarArr[0];
            mVar2 = mVarArr[1];
            mVar3 = mVarArr[2];
        } else if (fA3 < fA2 || fA3 < fA) {
            mVar = mVarArr[2];
            mVar2 = mVarArr[0];
            mVar3 = mVarArr[1];
        } else {
            mVar = mVarArr[1];
            mVar2 = mVarArr[0];
            mVar3 = mVarArr[2];
        }
        float f2 = mVar.f11823a;
        float f7 = mVar.f11824b;
        if (((mVar2.f11824b - f7) * (mVar3.f11823a - f2)) - ((mVar2.f11823a - f2) * (mVar3.f11824b - f7)) < 0.0f) {
            m mVar4 = mVar3;
            mVar3 = mVar2;
            mVar2 = mVar4;
        }
        mVarArr[0] = mVar2;
        mVarArr[1] = mVar;
        mVarArr[2] = mVar3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (this.f11823a == mVar.f11823a && this.f11824b == mVar.f11824b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f11824b) + (Float.floatToIntBits(this.f11823a) * 31);
    }

    public final String toString() {
        return "(" + this.f11823a + ',' + this.f11824b + ')';
    }
}
