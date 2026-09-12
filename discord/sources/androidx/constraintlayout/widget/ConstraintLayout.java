package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.core.Metrics;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import com.discord.misc.utilities.chat_view_types.ChatViewRecyclerTypes;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import s0.o;
import s0.q;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    private static final boolean DEBUG = false;
    private static final boolean DEBUG_DRAW_CONSTRAINTS = false;
    public static final int DESIGN_INFO_ID = 0;
    private static final boolean MEASURE = false;
    private static final boolean OPTIMIZE_HEIGHT_CHANGE = false;
    private static final String TAG = "ConstraintLayout";
    private static final boolean USE_CONSTRAINTS_HELPER = true;
    public static final String VERSION = "ConstraintLayout-2.1.0";
    private static SharedValues sSharedValues;
    SparseArray<View> mChildrenByIds;
    private ArrayList<b> mConstraintHelpers;
    protected ConstraintLayoutStates mConstraintLayoutSpec;
    private ConstraintSet mConstraintSet;
    private int mConstraintSetId;
    private ConstraintsChangedListener mConstraintsChangedListener;
    private HashMap<String, Integer> mDesignIds;
    protected boolean mDirtyHierarchy;
    private int mLastMeasureHeight;
    int mLastMeasureHeightMode;
    int mLastMeasureHeightSize;
    private int mLastMeasureWidth;
    int mLastMeasureWidthMode;
    int mLastMeasureWidthSize;
    protected ConstraintWidgetContainer mLayoutWidget;
    private int mMaxHeight;
    private int mMaxWidth;
    Measurer mMeasurer;
    private Metrics mMetrics;
    private int mMinHeight;
    private int mMinWidth;
    private int mOnMeasureHeightMeasureSpec;
    private int mOnMeasureWidthMeasureSpec;
    private int mOptimizationLevel;
    private SparseArray<ConstraintWidget> mTempMapIdToWidget;

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public int A;
        public int B;
        public int C;
        public float D;
        public float E;
        public String F;
        public float G;
        public float H;
        public int I;
        public int J;
        public int K;
        public int L;
        public int M;
        public int N;
        public int O;
        public int P;
        public float Q;
        public float R;
        public int S;
        public int T;
        public int U;
        public boolean V;
        public boolean W;
        public String X;
        public int Y;
        public boolean Z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f1285a;
        public boolean a0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f1286b;

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        public boolean f1287b0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f1288c;

        /* JADX INFO: renamed from: c0, reason: collision with root package name */
        public boolean f1289c0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f1290d;

        /* JADX INFO: renamed from: d0, reason: collision with root package name */
        public boolean f1291d0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f1292e;

        /* JADX INFO: renamed from: e0, reason: collision with root package name */
        public int f1293e0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f1294f;

        /* JADX INFO: renamed from: f0, reason: collision with root package name */
        public int f1295f0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f1296g;

        /* JADX INFO: renamed from: g0, reason: collision with root package name */
        public int f1297g0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f1298h;
        public int h0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f1299i;

        /* JADX INFO: renamed from: i0, reason: collision with root package name */
        public int f1300i0;
        public int j;

        /* JADX INFO: renamed from: j0, reason: collision with root package name */
        public int f1301j0;
        public int k;

        /* JADX INFO: renamed from: k0, reason: collision with root package name */
        public float f1302k0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f1303l;

        /* JADX INFO: renamed from: l0, reason: collision with root package name */
        public int f1304l0;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f1305m;

        /* JADX INFO: renamed from: m0, reason: collision with root package name */
        public int f1306m0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f1307n;

        /* JADX INFO: renamed from: n0, reason: collision with root package name */
        public float f1308n0;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f1309o;

        /* JADX INFO: renamed from: o0, reason: collision with root package name */
        public ConstraintWidget f1310o0;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f1311p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public float f1312q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f1313r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f1314s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f1315t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f1316u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f1317v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f1318w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f1319x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f1320y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f1321z;

        public LayoutParams(int i7, int i10) {
            super(i7, i10);
            this.f1285a = -1;
            this.f1286b = -1;
            this.f1288c = -1.0f;
            this.f1290d = -1;
            this.f1292e = -1;
            this.f1294f = -1;
            this.f1296g = -1;
            this.f1298h = -1;
            this.f1299i = -1;
            this.j = -1;
            this.k = -1;
            this.f1303l = -1;
            this.f1305m = -1;
            this.f1307n = -1;
            this.f1309o = -1;
            this.f1311p = 0;
            this.f1312q = 0.0f;
            this.f1313r = -1;
            this.f1314s = -1;
            this.f1315t = -1;
            this.f1316u = -1;
            this.f1317v = Integer.MIN_VALUE;
            this.f1318w = Integer.MIN_VALUE;
            this.f1319x = Integer.MIN_VALUE;
            this.f1320y = Integer.MIN_VALUE;
            this.f1321z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = 0;
            this.D = 0.5f;
            this.E = 0.5f;
            this.F = null;
            this.G = -1.0f;
            this.H = -1.0f;
            this.I = 0;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 1.0f;
            this.R = 1.0f;
            this.S = -1;
            this.T = -1;
            this.U = -1;
            this.V = false;
            this.W = false;
            this.X = null;
            this.Y = 0;
            this.Z = true;
            this.a0 = true;
            this.f1287b0 = false;
            this.f1289c0 = false;
            this.f1291d0 = false;
            this.f1293e0 = -1;
            this.f1295f0 = -1;
            this.f1297g0 = -1;
            this.h0 = -1;
            this.f1300i0 = Integer.MIN_VALUE;
            this.f1301j0 = Integer.MIN_VALUE;
            this.f1302k0 = 0.5f;
            this.f1310o0 = new ConstraintWidget();
        }

        public final void a() {
            this.f1289c0 = false;
            this.Z = true;
            this.a0 = true;
            int i7 = ((ViewGroup.MarginLayoutParams) this).width;
            if (i7 == -2 && this.V) {
                this.Z = false;
                if (this.K == 0) {
                    this.K = 1;
                }
            }
            int i10 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i10 == -2 && this.W) {
                this.a0 = false;
                if (this.L == 0) {
                    this.L = 1;
                }
            }
            if (i7 == 0 || i7 == -1) {
                this.Z = false;
                if (i7 == 0 && this.K == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.V = true;
                }
            }
            if (i10 == 0 || i10 == -1) {
                this.a0 = false;
                if (i10 == 0 && this.L == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.W = true;
                }
            }
            if (this.f1288c == -1.0f && this.f1285a == -1 && this.f1286b == -1) {
                return;
            }
            this.f1289c0 = true;
            this.Z = true;
            this.a0 = true;
            if (!(this.f1310o0 instanceof r0.f)) {
                this.f1310o0 = new r0.f();
            }
            ((r0.f) this.f1310o0).N(this.U);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x004a  */
        /* JADX WARN: Code duplicated, block: B:20:0x0051  */
        /* JADX WARN: Code duplicated, block: B:23:0x0058  */
        /* JADX WARN: Code duplicated, block: B:26:0x005e  */
        /* JADX WARN: Code duplicated, block: B:29:0x0064  */
        /* JADX WARN: Code duplicated, block: B:36:0x0076  */
        /* JADX WARN: Code duplicated, block: B:37:0x007e A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:38:0x0080  */
        /* JADX WARN: Code duplicated, block: B:39:0x0087 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:40:0x0089  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        public final void resolveLayoutDirection(int i7) {
            int i10;
            int i11;
            int i12;
            int i13;
            int i14 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
            int i15 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
            super.resolveLayoutDirection(i7);
            boolean z5 = false;
            boolean z6 = 1 == getLayoutDirection();
            this.f1297g0 = -1;
            this.h0 = -1;
            this.f1293e0 = -1;
            this.f1295f0 = -1;
            this.f1300i0 = this.f1317v;
            this.f1301j0 = this.f1319x;
            float f2 = this.D;
            this.f1302k0 = f2;
            int i16 = this.f1285a;
            this.f1304l0 = i16;
            int i17 = this.f1286b;
            this.f1306m0 = i17;
            float f7 = this.f1288c;
            this.f1308n0 = f7;
            if (z6) {
                int i18 = this.f1313r;
                if (i18 != -1) {
                    this.f1297g0 = i18;
                } else {
                    int i19 = this.f1314s;
                    if (i19 != -1) {
                        this.h0 = i19;
                    } else {
                        i10 = this.f1315t;
                        if (i10 != -1) {
                            this.f1295f0 = i10;
                            z5 = true;
                        }
                        i11 = this.f1316u;
                        if (i11 != -1) {
                            this.f1293e0 = i11;
                            z5 = true;
                        }
                        i12 = this.f1321z;
                        if (i12 != Integer.MIN_VALUE) {
                            this.f1301j0 = i12;
                        }
                        i13 = this.A;
                        if (i13 != Integer.MIN_VALUE) {
                            this.f1300i0 = i13;
                        }
                        if (z5) {
                            this.f1302k0 = 1.0f - f2;
                        }
                        if (this.f1289c0 && this.U == 1) {
                            if (f7 != -1.0f) {
                                this.f1308n0 = 1.0f - f7;
                                this.f1304l0 = -1;
                                this.f1306m0 = -1;
                            } else if (i16 != -1) {
                                this.f1306m0 = i16;
                                this.f1304l0 = -1;
                                this.f1308n0 = -1.0f;
                            } else if (i17 != -1) {
                                this.f1304l0 = i17;
                                this.f1306m0 = -1;
                                this.f1308n0 = -1.0f;
                            }
                        }
                    }
                }
                z5 = true;
                i10 = this.f1315t;
                if (i10 != -1) {
                    this.f1295f0 = i10;
                    z5 = true;
                }
                i11 = this.f1316u;
                if (i11 != -1) {
                    this.f1293e0 = i11;
                    z5 = true;
                }
                i12 = this.f1321z;
                if (i12 != Integer.MIN_VALUE) {
                    this.f1301j0 = i12;
                }
                i13 = this.A;
                if (i13 != Integer.MIN_VALUE) {
                    this.f1300i0 = i13;
                }
                if (z5) {
                    this.f1302k0 = 1.0f - f2;
                }
                if (this.f1289c0) {
                    if (f7 != -1.0f) {
                        this.f1308n0 = 1.0f - f7;
                        this.f1304l0 = -1;
                        this.f1306m0 = -1;
                    } else if (i16 != -1) {
                        this.f1306m0 = i16;
                        this.f1304l0 = -1;
                        this.f1308n0 = -1.0f;
                    } else if (i17 != -1) {
                        this.f1304l0 = i17;
                        this.f1306m0 = -1;
                        this.f1308n0 = -1.0f;
                    }
                }
            } else {
                int i20 = this.f1313r;
                if (i20 != -1) {
                    this.f1295f0 = i20;
                }
                int i21 = this.f1314s;
                if (i21 != -1) {
                    this.f1293e0 = i21;
                }
                int i22 = this.f1315t;
                if (i22 != -1) {
                    this.f1297g0 = i22;
                }
                int i23 = this.f1316u;
                if (i23 != -1) {
                    this.h0 = i23;
                }
                int i24 = this.f1321z;
                if (i24 != Integer.MIN_VALUE) {
                    this.f1300i0 = i24;
                }
                int i25 = this.A;
                if (i25 != Integer.MIN_VALUE) {
                    this.f1301j0 = i25;
                }
            }
            if (this.f1315t == -1 && this.f1316u == -1 && this.f1314s == -1 && this.f1313r == -1) {
                int i26 = this.f1294f;
                if (i26 != -1) {
                    this.f1297g0 = i26;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i15 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i15;
                    }
                } else {
                    int i27 = this.f1296g;
                    if (i27 != -1) {
                        this.h0 = i27;
                        if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i15 > 0) {
                            ((ViewGroup.MarginLayoutParams) this).rightMargin = i15;
                        }
                    }
                }
                int i28 = this.f1290d;
                if (i28 != -1) {
                    this.f1293e0 = i28;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i14 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i14;
                    return;
                }
                int i29 = this.f1292e;
                if (i29 != -1) {
                    this.f1295f0 = i29;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i14 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i14;
                }
            }
        }
    }

    public class Measurer implements s0.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ConstraintLayout f1322a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f1323b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f1324c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f1325d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f1326e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f1327f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f1328g;

        public Measurer(ConstraintLayout constraintLayout) {
            this.f1322a = constraintLayout;
        }

        public static boolean a(int i7, int i10, int i11) {
            if (i7 == i10) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i7);
            View.MeasureSpec.getSize(i7);
            int mode2 = View.MeasureSpec.getMode(i10);
            int size = View.MeasureSpec.getSize(i10);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && i11 == size;
            }
            return false;
        }

        public final void b(ConstraintWidget constraintWidget, s0.b bVar) {
            int iMakeMeasureSpec;
            int iMakeMeasureSpec2;
            int iMax;
            boolean z5;
            int measuredWidth;
            int baseline;
            int i7;
            if (constraintWidget == null) {
                return;
            }
            r0.c cVar = constraintWidget.J;
            r0.c cVar2 = constraintWidget.H;
            if (constraintWidget.f1247f0 == 8) {
                bVar.f19657e = 0;
                bVar.f19658f = 0;
                bVar.f19659g = 0;
                return;
            }
            if (constraintWidget.S == null) {
                return;
            }
            int i10 = bVar.f19653a;
            int i11 = bVar.f19654b;
            int i12 = bVar.f19655c;
            int i13 = bVar.f19656d;
            int i14 = this.f1323b + this.f1324c;
            int i15 = this.f1325d;
            View view = constraintWidget.f1245e0;
            int iB = f0.e.b(i10);
            if (iB == 0) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
            } else if (iB == 1) {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f1327f, i15, -2);
            } else if (iB == 2) {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f1327f, i15, -2);
                boolean z6 = constraintWidget.f1264q == 1;
                int i16 = bVar.j;
                if (i16 == 1 || i16 == 2) {
                    boolean z7 = view.getMeasuredHeight() == constraintWidget.k();
                    if (bVar.j == 2 || !z6 || ((z6 && z7) || constraintWidget.x())) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(constraintWidget.n(), 1073741824);
                    }
                }
            } else if (iB != 3) {
                iMakeMeasureSpec = 0;
            } else {
                int i17 = this.f1327f;
                int i18 = cVar2 != null ? cVar2.f19149g : 0;
                if (cVar != null) {
                    i18 += cVar.f19149g;
                }
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(i17, i15 + i18, -1);
            }
            int iB2 = f0.e.b(i11);
            if (iB2 == 0) {
                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
            } else if (iB2 == 1) {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f1328g, i14, -2);
            } else if (iB2 == 2) {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f1328g, i14, -2);
                boolean z10 = constraintWidget.f1265r == 1;
                int i19 = bVar.j;
                if (i19 == 1 || i19 == 2) {
                    boolean z11 = view.getMeasuredWidth() == constraintWidget.n();
                    if (bVar.j == 2 || !z10 || ((z10 && z11) || constraintWidget.y())) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(constraintWidget.k(), 1073741824);
                    }
                }
            } else if (iB2 != 3) {
                iMakeMeasureSpec2 = 0;
            } else {
                int i20 = this.f1328g;
                int i21 = cVar2 != null ? constraintWidget.I.f19149g : 0;
                if (cVar != null) {
                    i21 += constraintWidget.K.f19149g;
                }
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i20, i14 + i21, -1);
            }
            ConstraintWidgetContainer constraintWidgetContainer = (ConstraintWidgetContainer) constraintWidget.S;
            ConstraintLayout constraintLayout = ConstraintLayout.this;
            if (constraintWidgetContainer != null && r0.h.c(constraintLayout.mOptimizationLevel, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) && view.getMeasuredWidth() == constraintWidget.n() && view.getMeasuredWidth() < constraintWidgetContainer.n() && view.getMeasuredHeight() == constraintWidget.k() && view.getMeasuredHeight() < constraintWidgetContainer.k() && view.getBaseline() == constraintWidget.Z && !constraintWidget.w() && a(constraintWidget.F, iMakeMeasureSpec, constraintWidget.n()) && a(constraintWidget.G, iMakeMeasureSpec2, constraintWidget.k())) {
                bVar.f19657e = constraintWidget.n();
                bVar.f19658f = constraintWidget.k();
                bVar.f19659g = constraintWidget.Z;
                return;
            }
            boolean z12 = i10 == 3;
            boolean z13 = i11 == 3;
            boolean z14 = i11 == 4 || i11 == 1;
            boolean z15 = i10 == 4 || i10 == 1;
            boolean z16 = z12 && constraintWidget.V > 0.0f;
            boolean z17 = z13 && constraintWidget.V > 0.0f;
            if (view == null) {
                return;
            }
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            int i22 = bVar.j;
            if (i22 != 1 && i22 != 2 && z12 && constraintWidget.f1264q == 0 && z13 && constraintWidget.f1265r == 0) {
                z5 = false;
                measuredWidth = 0;
                baseline = 0;
                i7 = -1;
                iMax = 0;
            } else {
                if ((view instanceof n) && (constraintWidget instanceof r0.e)) {
                    ((n) view).l((r0.e) constraintWidget, iMakeMeasureSpec, iMakeMeasureSpec2);
                } else {
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                }
                constraintWidget.F = iMakeMeasureSpec;
                constraintWidget.G = iMakeMeasureSpec2;
                constraintWidget.f1248g = false;
                int measuredWidth2 = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                int baseline2 = view.getBaseline();
                int i23 = constraintWidget.f1267t;
                int iMax2 = i23 > 0 ? Math.max(i23, measuredWidth2) : measuredWidth2;
                int i24 = constraintWidget.f1268u;
                if (i24 > 0) {
                    iMax2 = Math.min(i24, iMax2);
                }
                int i25 = constraintWidget.f1270w;
                iMax = i25 > 0 ? Math.max(i25, measuredHeight) : measuredHeight;
                int i26 = iMakeMeasureSpec2;
                int i27 = constraintWidget.f1271x;
                if (i27 > 0) {
                    iMax = Math.min(i27, iMax);
                }
                if (!r0.h.c(constraintLayout.mOptimizationLevel, 1)) {
                    if (z16 && z14) {
                        iMax2 = (int) ((iMax * constraintWidget.V) + 0.5f);
                    } else if (z17 && z15) {
                        iMax = (int) ((iMax2 / constraintWidget.V) + 0.5f);
                    }
                }
                if (measuredWidth2 == iMax2 && measuredHeight == iMax) {
                    baseline = baseline2;
                    measuredWidth = iMax2;
                    z5 = false;
                } else {
                    if (measuredWidth2 != iMax2) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824);
                    }
                    int iMakeMeasureSpec3 = measuredHeight != iMax ? View.MeasureSpec.makeMeasureSpec(iMax, 1073741824) : i26;
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec3);
                    constraintWidget.F = iMakeMeasureSpec;
                    constraintWidget.G = iMakeMeasureSpec3;
                    z5 = false;
                    constraintWidget.f1248g = false;
                    measuredWidth = view.getMeasuredWidth();
                    int measuredHeight2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                    iMax = measuredHeight2;
                }
                i7 = -1;
            }
            boolean z18 = baseline != i7 ? true : z5;
            bVar.f19661i = (measuredWidth == bVar.f19655c && iMax == bVar.f19656d) ? z5 : true;
            boolean z19 = layoutParams.f1287b0 ? true : z18;
            if (z19 && baseline != -1 && constraintWidget.Z != baseline) {
                bVar.f19661i = true;
            }
            bVar.f19657e = measuredWidth;
            bVar.f19658f = iMax;
            bVar.f19660h = z19;
            bVar.f19659g = baseline;
        }
    }

    public ConstraintLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new ConstraintWidgetContainer();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new Measurer(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        a(attributeSet, 0);
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public static SharedValues getSharedValues() {
        if (sSharedValues == null) {
            SharedValues sharedValues = new SharedValues();
            new SparseIntArray();
            new HashMap();
            sSharedValues = sharedValues;
        }
        return sSharedValues;
    }

    public final void a(AttributeSet attributeSet, int i7) {
        ConstraintWidgetContainer constraintWidgetContainer = this.mLayoutWidget;
        constraintWidgetContainer.f1245e0 = this;
        Measurer measurer = this.mMeasurer;
        constraintWidgetContainer.f1278t0 = measurer;
        constraintWidgetContainer.f1276r0.f19668f = measurer;
        this.mChildrenByIds.put(getId(), this);
        this.mConstraintSet = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, m.f1445b, i7, 0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == 16) {
                    this.mMinWidth = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMinWidth);
                } else if (index == 17) {
                    this.mMinHeight = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMinHeight);
                } else if (index == 14) {
                    this.mMaxWidth = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxWidth);
                } else if (index == 15) {
                    this.mMaxHeight = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxHeight);
                } else if (index == 112) {
                    this.mOptimizationLevel = typedArrayObtainStyledAttributes.getInt(index, this.mOptimizationLevel);
                } else if (index == 55) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            parseLayoutDescription(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.mConstraintLayoutSpec = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        ConstraintSet constraintSet = new ConstraintSet();
                        this.mConstraintSet = constraintSet;
                        constraintSet.g(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.mConstraintSet = null;
                    }
                    this.mConstraintSetId = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        ConstraintWidgetContainer constraintWidgetContainer2 = this.mLayoutWidget;
        constraintWidgetContainer2.C0 = this.mOptimizationLevel;
        p0.c.f17738p = constraintWidgetContainer2.R(IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING);
    }

    /* JADX WARN: Code duplicated, block: B:160:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:43:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:53:0x0101  */
    /* JADX WARN: Code duplicated, block: B:55:0x010a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0118  */
    /* JADX WARN: Code duplicated, block: B:58:0x011e  */
    /* JADX WARN: Code duplicated, block: B:65:0x0141  */
    /* JADX WARN: Code duplicated, block: B:67:0x014a  */
    /* JADX WARN: Code duplicated, block: B:70:0x0156  */
    /* JADX WARN: Code duplicated, block: B:72:0x015b  */
    /* JADX WARN: Code duplicated, block: B:77:0x0173  */
    /* JADX WARN: Code duplicated, block: B:79:0x0180  */
    /* JADX WARN: Code duplicated, block: B:81:0x0185  */
    /* JADX WARN: Code duplicated, block: B:82:0x0190  */
    /* JADX WARN: Code duplicated, block: B:84:0x0194  */
    /* JADX WARN: Code duplicated, block: B:87:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:90:0x01ac  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:160:0x02bb -> B:161:0x02bc). Please report as a decompilation issue!!! */
    public void applyConstraintsFromLayoutParams(boolean z5, View view, ConstraintWidget constraintWidget, LayoutParams layoutParams, SparseArray<ConstraintWidget> sparseArray) {
        ConstraintLayout constraintLayout;
        int i7;
        float f2;
        ConstraintWidget constraintWidget2;
        int i10;
        int i11;
        int i12;
        ConstraintWidget constraintWidget3;
        int i13;
        int i14;
        int i15;
        int i16;
        ConstraintWidget constraintWidget4;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        ConstraintWidget constraintWidget5;
        int i22;
        int i23;
        LayoutParams layoutParams2;
        int i24;
        int i25;
        ConstraintWidget constraintWidget6;
        int i26;
        float f7;
        ConstraintWidget constraintWidget7;
        ConstraintWidget constraintWidget8;
        ConstraintWidget constraintWidget9;
        int i27;
        float fAbs;
        int i28;
        ConstraintWidget constraintWidget10 = constraintWidget;
        layoutParams.a();
        constraintWidget10.f1247f0 = view.getVisibility();
        constraintWidget10.f1245e0 = view;
        if (view instanceof b) {
            constraintLayout = this;
            ((b) view).i(constraintWidget10, constraintLayout.mLayoutWidget.f1279u0);
        } else {
            constraintLayout = this;
        }
        int i29 = -1;
        if (layoutParams.f1289c0) {
            r0.f fVar = (r0.f) constraintWidget10;
            int i30 = layoutParams.f1304l0;
            int i31 = layoutParams.f1306m0;
            float f10 = layoutParams.f1308n0;
            if (f10 != -1.0f) {
                if (f10 > -1.0f) {
                    fVar.f19178p0 = f10;
                    fVar.f19179q0 = -1;
                    fVar.f19180r0 = -1;
                    return;
                }
                return;
            }
            if (i30 != -1) {
                if (i30 > -1) {
                    fVar.f19178p0 = -1.0f;
                    fVar.f19179q0 = i30;
                    fVar.f19180r0 = -1;
                    return;
                }
                return;
            }
            if (i31 == -1 || i31 <= -1) {
                return;
            }
            fVar.f19178p0 = -1.0f;
            fVar.f19179q0 = -1;
            fVar.f19180r0 = i31;
            return;
        }
        int i32 = layoutParams.f1293e0;
        int i33 = layoutParams.f1295f0;
        int i34 = layoutParams.f1297g0;
        int i35 = layoutParams.h0;
        int i36 = layoutParams.f1300i0;
        int i37 = layoutParams.f1301j0;
        float f11 = layoutParams.f1302k0;
        int i38 = layoutParams.f1309o;
        if (i38 != -1) {
            ConstraintWidget constraintWidget11 = sparseArray.get(i38);
            if (constraintWidget11 != null) {
                float f12 = layoutParams.f1312q;
                constraintWidget.s(7, 7, layoutParams.f1311p, 0, constraintWidget11);
                constraintWidget10 = constraintWidget;
                constraintWidget10.C = f12;
            }
            f2 = 0.0f;
            i12 = 2;
            constraintWidget6 = constraintWidget10;
            layoutParams2 = layoutParams;
            i13 = 4;
            i26 = 5;
            i20 = 3;
        } else {
            if (i32 != -1) {
                ConstraintWidget constraintWidget12 = sparseArray.get(i32);
                if (constraintWidget12 != null) {
                    f2 = 0.0f;
                    i7 = 2;
                    constraintWidget10.s(2, 2, ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i36, constraintWidget12);
                } else {
                    i7 = 2;
                    f2 = 0.0f;
                }
            } else {
                i7 = 2;
                f2 = 0.0f;
                if (i33 != -1 && (constraintWidget2 = sparseArray.get(i33)) != null) {
                    constraintWidget.s(2, 4, ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i36, constraintWidget2);
                    i10 = 2;
                    i11 = 4;
                }
                if (i34 != -1) {
                    constraintWidget9 = sparseArray.get(i34);
                    if (constraintWidget9 != null) {
                        constraintWidget.s(i11, i10, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, i37, constraintWidget9);
                    }
                    i12 = i10;
                } else {
                    i12 = i10;
                    if (i35 != -1 && (constraintWidget3 = sparseArray.get(i35)) != null) {
                        constraintWidget.s(i11, i11, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, i37, constraintWidget3);
                    }
                }
                i13 = i11;
                i14 = layoutParams.f1298h;
                if (i14 != -1) {
                    constraintWidget8 = sparseArray.get(i14);
                    if (constraintWidget8 != null) {
                        i15 = 3;
                        constraintWidget.s(3, 3, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, layoutParams.f1318w, constraintWidget8);
                    } else {
                        i15 = 3;
                    }
                } else {
                    i15 = 3;
                    i16 = layoutParams.f1299i;
                    if (i16 == -1 && (constraintWidget4 = sparseArray.get(i16)) != null) {
                        constraintWidget.s(3, 5, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, layoutParams.f1318w, constraintWidget4);
                        i17 = 3;
                        i18 = 5;
                    }
                    i19 = layoutParams.j;
                    if (i19 != -1) {
                        constraintWidget7 = sparseArray.get(i19);
                        if (constraintWidget7 != null) {
                            constraintWidget.s(i18, i17, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutParams.f1320y, constraintWidget7);
                        }
                        i20 = i17;
                    } else {
                        i20 = i17;
                        i21 = layoutParams.k;
                        if (i21 != -1 && (constraintWidget5 = sparseArray.get(i21)) != null) {
                            constraintWidget.s(i18, i18, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutParams.f1320y, constraintWidget5);
                        }
                    }
                    i22 = i18;
                    i23 = layoutParams.f1303l;
                    if (i23 != -1) {
                        layoutParams2 = layoutParams;
                        constraintLayout.b(constraintWidget, layoutParams2, sparseArray, i23, 6);
                    } else {
                        layoutParams2 = layoutParams;
                        i24 = layoutParams2.f1305m;
                        if (i24 != -1) {
                            b(constraintWidget, layoutParams2, sparseArray, i24, i20);
                        } else {
                            i25 = layoutParams2.f1307n;
                            if (i25 != -1) {
                                b(constraintWidget, layoutParams2, sparseArray, i25, i22);
                                constraintWidget6 = constraintWidget;
                                i26 = i22;
                            }
                            if (f11 >= f2) {
                                constraintWidget6.f1241c0 = f11;
                            }
                            f7 = layoutParams2.E;
                            if (f7 >= f2) {
                                constraintWidget6.f1243d0 = f7;
                            }
                        }
                    }
                    constraintWidget6 = constraintWidget;
                    i26 = i22;
                    if (f11 >= f2) {
                        constraintWidget6.f1241c0 = f11;
                    }
                    f7 = layoutParams2.E;
                    if (f7 >= f2) {
                        constraintWidget6.f1243d0 = f7;
                    }
                }
                i17 = i15;
                i18 = 5;
                i19 = layoutParams.j;
                if (i19 != -1) {
                    constraintWidget7 = sparseArray.get(i19);
                    if (constraintWidget7 != null) {
                        constraintWidget.s(i18, i17, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutParams.f1320y, constraintWidget7);
                    }
                    i20 = i17;
                } else {
                    i20 = i17;
                    i21 = layoutParams.k;
                    if (i21 != -1) {
                        constraintWidget.s(i18, i18, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutParams.f1320y, constraintWidget5);
                    }
                }
                i22 = i18;
                i23 = layoutParams.f1303l;
                if (i23 != -1) {
                    layoutParams2 = layoutParams;
                    constraintLayout.b(constraintWidget, layoutParams2, sparseArray, i23, 6);
                } else {
                    layoutParams2 = layoutParams;
                    i24 = layoutParams2.f1305m;
                    if (i24 != -1) {
                        b(constraintWidget, layoutParams2, sparseArray, i24, i20);
                    } else {
                        i25 = layoutParams2.f1307n;
                        if (i25 != -1) {
                            b(constraintWidget, layoutParams2, sparseArray, i25, i22);
                            constraintWidget6 = constraintWidget;
                            i26 = i22;
                        }
                        if (f11 >= f2) {
                            constraintWidget6.f1241c0 = f11;
                        }
                        f7 = layoutParams2.E;
                        if (f7 >= f2) {
                            constraintWidget6.f1243d0 = f7;
                        }
                    }
                }
                constraintWidget6 = constraintWidget;
                i26 = i22;
                if (f11 >= f2) {
                    constraintWidget6.f1241c0 = f11;
                }
                f7 = layoutParams2.E;
                if (f7 >= f2) {
                    constraintWidget6.f1243d0 = f7;
                }
            }
            i10 = i7;
            i11 = 4;
            if (i34 != -1) {
                constraintWidget9 = sparseArray.get(i34);
                if (constraintWidget9 != null) {
                    constraintWidget.s(i11, i10, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, i37, constraintWidget9);
                }
                i12 = i10;
            } else {
                i12 = i10;
                if (i35 != -1) {
                    constraintWidget.s(i11, i11, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, i37, constraintWidget3);
                }
            }
            i13 = i11;
            i14 = layoutParams.f1298h;
            if (i14 != -1) {
                constraintWidget8 = sparseArray.get(i14);
                if (constraintWidget8 != null) {
                    i15 = 3;
                    constraintWidget.s(3, 3, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, layoutParams.f1318w, constraintWidget8);
                } else {
                    i15 = 3;
                }
            } else {
                i15 = 3;
                i16 = layoutParams.f1299i;
                if (i16 == -1) {
                }
                i19 = layoutParams.j;
                if (i19 != -1) {
                    constraintWidget7 = sparseArray.get(i19);
                    if (constraintWidget7 != null) {
                        constraintWidget.s(i18, i17, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutParams.f1320y, constraintWidget7);
                    }
                    i20 = i17;
                } else {
                    i20 = i17;
                    i21 = layoutParams.k;
                    if (i21 != -1) {
                        constraintWidget.s(i18, i18, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutParams.f1320y, constraintWidget5);
                    }
                }
                i22 = i18;
                i23 = layoutParams.f1303l;
                if (i23 != -1) {
                    layoutParams2 = layoutParams;
                    constraintLayout.b(constraintWidget, layoutParams2, sparseArray, i23, 6);
                } else {
                    layoutParams2 = layoutParams;
                    i24 = layoutParams2.f1305m;
                    if (i24 != -1) {
                        b(constraintWidget, layoutParams2, sparseArray, i24, i20);
                    } else {
                        i25 = layoutParams2.f1307n;
                        if (i25 != -1) {
                            b(constraintWidget, layoutParams2, sparseArray, i25, i22);
                            constraintWidget6 = constraintWidget;
                            i26 = i22;
                        }
                        if (f11 >= f2) {
                            constraintWidget6.f1241c0 = f11;
                        }
                        f7 = layoutParams2.E;
                        if (f7 >= f2) {
                            constraintWidget6.f1243d0 = f7;
                        }
                    }
                }
                constraintWidget6 = constraintWidget;
                i26 = i22;
                if (f11 >= f2) {
                    constraintWidget6.f1241c0 = f11;
                }
                f7 = layoutParams2.E;
                if (f7 >= f2) {
                    constraintWidget6.f1243d0 = f7;
                }
            }
            i17 = i15;
            i18 = 5;
            i19 = layoutParams.j;
            if (i19 != -1) {
                constraintWidget7 = sparseArray.get(i19);
                if (constraintWidget7 != null) {
                    constraintWidget.s(i18, i17, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutParams.f1320y, constraintWidget7);
                }
                i20 = i17;
            } else {
                i20 = i17;
                i21 = layoutParams.k;
                if (i21 != -1) {
                    constraintWidget.s(i18, i18, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutParams.f1320y, constraintWidget5);
                }
            }
            i22 = i18;
            i23 = layoutParams.f1303l;
            if (i23 != -1) {
                layoutParams2 = layoutParams;
                constraintLayout.b(constraintWidget, layoutParams2, sparseArray, i23, 6);
            } else {
                layoutParams2 = layoutParams;
                i24 = layoutParams2.f1305m;
                if (i24 != -1) {
                    b(constraintWidget, layoutParams2, sparseArray, i24, i20);
                } else {
                    i25 = layoutParams2.f1307n;
                    if (i25 != -1) {
                        b(constraintWidget, layoutParams2, sparseArray, i25, i22);
                        constraintWidget6 = constraintWidget;
                        i26 = i22;
                    }
                    if (f11 >= f2) {
                        constraintWidget6.f1241c0 = f11;
                    }
                    f7 = layoutParams2.E;
                    if (f7 >= f2) {
                        constraintWidget6.f1243d0 = f7;
                    }
                }
            }
            constraintWidget6 = constraintWidget;
            i26 = i22;
            if (f11 >= f2) {
                constraintWidget6.f1241c0 = f11;
            }
            f7 = layoutParams2.E;
            if (f7 >= f2) {
                constraintWidget6.f1243d0 = f7;
            }
        }
        if (z5 && ((i28 = layoutParams2.S) != -1 || layoutParams2.T != -1)) {
            int i39 = layoutParams2.T;
            constraintWidget6.X = i28;
            constraintWidget6.Y = i39;
        }
        if (layoutParams2.Z) {
            constraintWidget6.H(1);
            constraintWidget6.J(((ViewGroup.MarginLayoutParams) layoutParams2).width);
            if (((ViewGroup.MarginLayoutParams) layoutParams2).width == -2) {
                constraintWidget6.H(2);
            }
        } else if (((ViewGroup.MarginLayoutParams) layoutParams2).width == -1) {
            if (layoutParams2.V) {
                constraintWidget6.H(3);
            } else {
                constraintWidget6.H(4);
            }
            constraintWidget6.i(i12).f19149g = ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin;
            constraintWidget6.i(i13).f19149g = ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
        } else {
            constraintWidget6.H(3);
            constraintWidget6.J(0);
        }
        if (layoutParams2.a0) {
            constraintWidget6.I(1);
            constraintWidget6.G(((ViewGroup.MarginLayoutParams) layoutParams2).height);
            if (((ViewGroup.MarginLayoutParams) layoutParams2).height == -2) {
                constraintWidget6.I(2);
            }
        } else if (((ViewGroup.MarginLayoutParams) layoutParams2).height == -1) {
            if (layoutParams2.W) {
                constraintWidget6.I(3);
            } else {
                constraintWidget6.I(4);
            }
            constraintWidget6.i(i20).f19149g = ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin;
            constraintWidget6.i(i26).f19149g = ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
        } else {
            constraintWidget6.I(3);
            constraintWidget6.G(0);
        }
        String str = layoutParams2.F;
        if (str == null || str.length() == 0) {
            constraintWidget6.V = f2;
        } else {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            if (iIndexOf <= 0 || iIndexOf >= length - 1) {
                i27 = 0;
            } else {
                String strSubstring = str.substring(0, iIndexOf);
                if (strSubstring.equalsIgnoreCase("W")) {
                    i29 = 0;
                } else if (strSubstring.equalsIgnoreCase("H")) {
                    i29 = 1;
                }
                i27 = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i27);
                    if (strSubstring2.length() > 0) {
                        fAbs = Float.parseFloat(strSubstring2);
                    } else {
                        fAbs = f2;
                    }
                } else {
                    String strSubstring3 = str.substring(i27, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() <= 0 || strSubstring4.length() <= 0) {
                        fAbs = f2;
                    } else {
                        float f13 = Float.parseFloat(strSubstring3);
                        float f14 = Float.parseFloat(strSubstring4);
                        if (f13 <= f2 || f14 <= f2) {
                            fAbs = f2;
                        } else {
                            fAbs = i29 == 1 ? Math.abs(f14 / f13) : Math.abs(f13 / f14);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
            if (fAbs > f2) {
                constraintWidget6.V = fAbs;
                constraintWidget6.W = i29;
            }
        }
        float f15 = layoutParams2.G;
        float[] fArr = constraintWidget6.f1253j0;
        fArr[0] = f15;
        fArr[1] = layoutParams2.H;
        constraintWidget6.h0 = layoutParams2.I;
        constraintWidget6.f1252i0 = layoutParams2.J;
        int i40 = layoutParams2.Y;
        if (i40 >= 0 && i40 <= 3) {
            constraintWidget6.f1263p = i40;
        }
        int i41 = layoutParams2.K;
        int i42 = layoutParams2.M;
        int i43 = layoutParams2.O;
        float f16 = layoutParams2.Q;
        constraintWidget6.f1264q = i41;
        constraintWidget6.f1267t = i42;
        if (i43 == Integer.MAX_VALUE) {
            i43 = 0;
        }
        constraintWidget6.f1268u = i43;
        constraintWidget6.f1269v = f16;
        if (f16 > f2 && f16 < 1.0f && i41 == 0) {
            constraintWidget6.f1264q = 2;
        }
        int i44 = layoutParams2.L;
        int i45 = layoutParams2.N;
        int i46 = layoutParams2.P;
        float f17 = layoutParams2.R;
        constraintWidget6.f1265r = i44;
        constraintWidget6.f1270w = i45;
        constraintWidget6.f1271x = i46 != Integer.MAX_VALUE ? i46 : 0;
        constraintWidget6.f1272y = f17;
        if (f17 <= f2 || f17 >= 1.0f || i44 != 0) {
            return;
        }
        constraintWidget6.f1265r = 2;
    }

    public final void b(ConstraintWidget constraintWidget, LayoutParams layoutParams, SparseArray sparseArray, int i7, int i10) {
        View view = this.mChildrenByIds.get(i7);
        ConstraintWidget constraintWidget2 = (ConstraintWidget) sparseArray.get(i7);
        if (constraintWidget2 == null || view == null || !(view.getLayoutParams() instanceof LayoutParams)) {
            return;
        }
        layoutParams.f1287b0 = true;
        if (i10 == 6) {
            LayoutParams layoutParams2 = (LayoutParams) view.getLayoutParams();
            layoutParams2.f1287b0 = true;
            layoutParams2.f1310o0.D = true;
        }
        constraintWidget.i(6).b(constraintWidget2.i(i10), layoutParams.C, layoutParams.B, true);
        constraintWidget.D = true;
        constraintWidget.i(3).j();
        constraintWidget.i(5).j();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<b> arrayList = this.mConstraintHelpers;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i7 = 0; i7 < size; i7++) {
                this.mConstraintHelpers.get(i7).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i11 = Integer.parseInt(strArrSplit[0]);
                        int i12 = Integer.parseInt(strArrSplit[1]);
                        int i13 = Integer.parseInt(strArrSplit[2]);
                        int i14 = (int) ((i11 / 1080.0f) * width);
                        int i15 = (int) ((i12 / 1920.0f) * height);
                        int i16 = (int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f2 = i14;
                        float f7 = i15;
                        float f10 = i14 + ((int) ((i13 / 1080.0f) * width));
                        canvas.drawLine(f2, f7, f10, f7, paint);
                        float f11 = i15 + i16;
                        canvas.drawLine(f10, f7, f10, f11, paint);
                        canvas.drawLine(f10, f11, f2, f11, paint);
                        canvas.drawLine(f2, f11, f2, f7, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f2, f7, f10, f11, paint);
                        canvas.drawLine(f2, f11, f10, f7, paint);
                    }
                }
            }
        }
    }

    public void fillMetrics(Metrics metrics) {
        this.mMetrics = metrics;
        ConstraintWidgetContainer constraintWidgetContainer = this.mLayoutWidget;
        constraintWidgetContainer.getClass();
        constraintWidgetContainer.f1280v0.getClass();
        p0.c.f17740r = metrics;
    }

    @Override // android.view.View
    public void forceLayout() {
        this.mDirtyHierarchy = true;
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        super.forceLayout();
    }

    public Object getDesignInformation(int i7, Object obj) {
        if (i7 != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> map = this.mDesignIds;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.mDesignIds.get(str);
    }

    public int getMaxHeight() {
        return this.mMaxHeight;
    }

    public int getMaxWidth() {
        return this.mMaxWidth;
    }

    public int getMinHeight() {
        return this.mMinHeight;
    }

    public int getMinWidth() {
        return this.mMinWidth;
    }

    public int getOptimizationLevel() {
        return this.mLayoutWidget.C0;
    }

    public View getViewById(int i7) {
        return this.mChildrenByIds.get(i7);
    }

    public final ConstraintWidget getViewWidget(View view) {
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof LayoutParams) {
            return ((LayoutParams) view.getLayoutParams()).f1310o0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof LayoutParams) {
            return ((LayoutParams) view.getLayoutParams()).f1310o0;
        }
        return null;
    }

    public boolean isRtl() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
    }

    public void loadLayoutDescription(int i7) {
        if (i7 == 0) {
            this.mConstraintLayoutSpec = null;
            return;
        }
        try {
            this.mConstraintLayoutSpec = new ConstraintLayoutStates(getContext(), this, i7);
        } catch (Resources.NotFoundException unused) {
            this.mConstraintLayoutSpec = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z5, int i7, int i10, int i11, int i12) {
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            ConstraintWidget constraintWidget = layoutParams.f1310o0;
            if (childAt.getVisibility() != 8 || layoutParams.f1289c0 || layoutParams.f1291d0 || zIsInEditMode) {
                int iO = constraintWidget.o();
                int iP = constraintWidget.p();
                childAt.layout(iO, iP, constraintWidget.n() + iO, constraintWidget.k() + iP);
            }
        }
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i14 = 0; i14 < size; i14++) {
                this.mConstraintHelpers.get(i14).j();
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i7, int i10) {
        boolean z5;
        boolean z6;
        boolean z7;
        ConstraintWidget constraintWidget;
        if (this.mOnMeasureWidthMeasureSpec == i7) {
            int i11 = this.mOnMeasureHeightMeasureSpec;
        }
        boolean z10 = true;
        int i12 = 0;
        if (!this.mDirtyHierarchy) {
            int childCount = getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                if (getChildAt(i13).isLayoutRequested()) {
                    this.mDirtyHierarchy = true;
                    break;
                }
            }
        }
        this.mOnMeasureWidthMeasureSpec = i7;
        this.mOnMeasureHeightMeasureSpec = i10;
        this.mLayoutWidget.f1279u0 = isRtl();
        if (this.mDirtyHierarchy) {
            this.mDirtyHierarchy = false;
            int childCount2 = getChildCount();
            int i14 = 0;
            while (true) {
                if (i14 >= childCount2) {
                    z5 = false;
                    break;
                } else {
                    if (getChildAt(i14).isLayoutRequested()) {
                        z5 = true;
                        break;
                    }
                    i14++;
                }
            }
            if (z5) {
                boolean zIsInEditMode = isInEditMode();
                int childCount3 = getChildCount();
                for (int i15 = 0; i15 < childCount3; i15++) {
                    ConstraintWidget viewWidget = getViewWidget(getChildAt(i15));
                    if (viewWidget != null) {
                        viewWidget.z();
                    }
                }
                Object obj = null;
                if (zIsInEditMode) {
                    for (int i16 = 0; i16 < childCount3; i16++) {
                        View childAt = getChildAt(i16);
                        try {
                            String resourceName = getResources().getResourceName(childAt.getId());
                            setDesignInformation(0, resourceName, Integer.valueOf(childAt.getId()));
                            int iIndexOf = resourceName.indexOf(47);
                            if (iIndexOf != -1) {
                                resourceName = resourceName.substring(iIndexOf + 1);
                            }
                            int id2 = childAt.getId();
                            if (id2 == 0) {
                                constraintWidget = this.mLayoutWidget;
                            } else {
                                View viewFindViewById = this.mChildrenByIds.get(id2);
                                if (viewFindViewById == null && (viewFindViewById = findViewById(id2)) != null && viewFindViewById != this && viewFindViewById.getParent() == this) {
                                    onViewAdded(viewFindViewById);
                                }
                                constraintWidget = viewFindViewById == this ? this.mLayoutWidget : viewFindViewById == null ? null : ((LayoutParams) viewFindViewById.getLayoutParams()).f1310o0;
                            }
                            constraintWidget.f1249g0 = resourceName;
                        } catch (Resources.NotFoundException unused) {
                        }
                    }
                }
                if (this.mConstraintSetId != -1) {
                    for (int i17 = 0; i17 < childCount3; i17++) {
                        getChildAt(i17).getId();
                    }
                }
                ConstraintSet constraintSet = this.mConstraintSet;
                if (constraintSet != null) {
                    constraintSet.b(this);
                }
                this.mLayoutWidget.f1274p0.clear();
                int size = this.mConstraintHelpers.size();
                if (size > 0) {
                    int i18 = 0;
                    while (i18 < size) {
                        b bVar = this.mConstraintHelpers.get(i18);
                        HashMap map = bVar.f1354y;
                        if (bVar.isInEditMode()) {
                            bVar.setIds(bVar.f1352w);
                        }
                        r0.g gVar = bVar.f1351v;
                        if (gVar == null) {
                            z6 = z10;
                        } else {
                            gVar.f19185q0 = i12;
                            Arrays.fill(gVar.f19184p0, obj);
                            int i19 = i12;
                            while (i19 < bVar.f1349e) {
                                int i20 = bVar.f1348d[i19];
                                View viewById = getViewById(i20);
                                if (viewById == null) {
                                    String str = (String) map.get(Integer.valueOf(i20));
                                    z7 = z10;
                                    int iG = bVar.g(this, str);
                                    if (iG != 0) {
                                        bVar.f1348d[i19] = iG;
                                        map.put(Integer.valueOf(iG), str);
                                        viewById = getViewById(iG);
                                    }
                                } else {
                                    z7 = z10;
                                }
                                if (viewById != null) {
                                    r0.g gVar2 = bVar.f1351v;
                                    ConstraintWidget viewWidget2 = getViewWidget(viewById);
                                    gVar2.getClass();
                                    if (viewWidget2 != gVar2 && viewWidget2 != null) {
                                        int i21 = gVar2.f19185q0 + 1;
                                        ConstraintWidget[] constraintWidgetArr = gVar2.f19184p0;
                                        if (i21 > constraintWidgetArr.length) {
                                            gVar2.f19184p0 = (ConstraintWidget[]) Arrays.copyOf(constraintWidgetArr, constraintWidgetArr.length * 2);
                                        }
                                        ConstraintWidget[] constraintWidgetArr2 = gVar2.f19184p0;
                                        int i22 = gVar2.f19185q0;
                                        constraintWidgetArr2[i22] = viewWidget2;
                                        gVar2.f19185q0 = i22 + 1;
                                    }
                                }
                                i19++;
                                z10 = z7;
                            }
                            z6 = z10;
                            bVar.f1351v.N();
                        }
                        i18++;
                        z10 = z6;
                        i12 = 0;
                        obj = null;
                    }
                }
                for (int i23 = 0; i23 < childCount3; i23++) {
                    getChildAt(i23);
                }
                this.mTempMapIdToWidget.clear();
                this.mTempMapIdToWidget.put(0, this.mLayoutWidget);
                this.mTempMapIdToWidget.put(getId(), this.mLayoutWidget);
                for (int i24 = 0; i24 < childCount3; i24++) {
                    View childAt2 = getChildAt(i24);
                    this.mTempMapIdToWidget.put(childAt2.getId(), getViewWidget(childAt2));
                }
                for (int i25 = 0; i25 < childCount3; i25++) {
                    View childAt3 = getChildAt(i25);
                    ConstraintWidget viewWidget3 = getViewWidget(childAt3);
                    if (viewWidget3 != null) {
                        LayoutParams layoutParams = (LayoutParams) childAt3.getLayoutParams();
                        ConstraintWidgetContainer constraintWidgetContainer = this.mLayoutWidget;
                        constraintWidgetContainer.f1274p0.add(viewWidget3);
                        ConstraintWidget constraintWidget2 = viewWidget3.S;
                        if (constraintWidget2 != null) {
                            ((ConstraintWidgetContainer) constraintWidget2).f1274p0.remove(viewWidget3);
                            viewWidget3.z();
                        }
                        viewWidget3.S = constraintWidgetContainer;
                        applyConstraintsFromLayoutParams(zIsInEditMode, childAt3, viewWidget3, layoutParams, this.mTempMapIdToWidget);
                    }
                }
            }
            if (z5) {
                ConstraintWidgetContainer constraintWidgetContainer2 = this.mLayoutWidget;
                constraintWidgetContainer2.f1275q0.k0(constraintWidgetContainer2);
            }
        }
        resolveSystem(this.mLayoutWidget, this.mOptimizationLevel, i7, i10);
        int iN = this.mLayoutWidget.n();
        int iK = this.mLayoutWidget.k();
        ConstraintWidgetContainer constraintWidgetContainer3 = this.mLayoutWidget;
        resolveMeasuredDimension(i7, i10, iN, iK, constraintWidgetContainer3.D0, constraintWidgetContainer3.E0);
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        ConstraintWidget viewWidget = getViewWidget(view);
        if ((view instanceof Guideline) && !(viewWidget instanceof r0.f)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            r0.f fVar = new r0.f();
            layoutParams.f1310o0 = fVar;
            layoutParams.f1289c0 = true;
            fVar.N(layoutParams.U);
        }
        if (view instanceof b) {
            b bVar = (b) view;
            bVar.k();
            ((LayoutParams) view.getLayoutParams()).f1291d0 = true;
            if (!this.mConstraintHelpers.contains(bVar)) {
                this.mConstraintHelpers.add(bVar);
            }
        }
        this.mChildrenByIds.put(view.getId(), view);
        this.mDirtyHierarchy = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.mChildrenByIds.remove(view.getId());
        ConstraintWidget viewWidget = getViewWidget(view);
        this.mLayoutWidget.f1274p0.remove(viewWidget);
        viewWidget.z();
        this.mConstraintHelpers.remove(view);
        this.mDirtyHierarchy = true;
    }

    public void parseLayoutDescription(int i7) {
        this.mConstraintLayoutSpec = new ConstraintLayoutStates(getContext(), this, i7);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.mDirtyHierarchy = true;
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        super.requestLayout();
    }

    public void resolveMeasuredDimension(int i7, int i10, int i11, int i12, boolean z5, boolean z6) {
        Measurer measurer = this.mMeasurer;
        int i13 = measurer.f1326e;
        int iResolveSizeAndState = View.resolveSizeAndState(i11 + measurer.f1325d, i7, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(i12 + i13, i10, 0) & 16777215;
        int iMin = Math.min(this.mMaxWidth, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(this.mMaxHeight, iResolveSizeAndState2);
        if (z5) {
            iMin |= PointerEventHelper.X_FLAG_SUPPORTS_HOVER;
        }
        if (z6) {
            iMin2 |= PointerEventHelper.X_FLAG_SUPPORTS_HOVER;
        }
        setMeasuredDimension(iMin, iMin2);
        this.mLastMeasureWidth = iMin;
        this.mLastMeasureHeight = iMin2;
    }

    /* JADX WARN: Code duplicated, block: B:120:0x025f  */
    /* JADX WARN: Code duplicated, block: B:122:0x027d  */
    /* JADX WARN: Code duplicated, block: B:124:0x0280  */
    /* JADX WARN: Code duplicated, block: B:129:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:138:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:160:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:162:0x0305  */
    /* JADX WARN: Code duplicated, block: B:165:0x0311 A[LOOP:11: B:163:0x030b->B:165:0x0311, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:167:0x0354  */
    /* JADX WARN: Code duplicated, block: B:16:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:170:0x0370  */
    /* JADX WARN: Code duplicated, block: B:171:0x0376  */
    /* JADX WARN: Code duplicated, block: B:173:0x037a  */
    /* JADX WARN: Code duplicated, block: B:175:0x0384 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:176:0x0386  */
    /* JADX WARN: Code duplicated, block: B:177:0x0388  */
    /* JADX WARN: Code duplicated, block: B:179:0x038b  */
    /* JADX WARN: Code duplicated, block: B:180:0x038d  */
    /* JADX WARN: Code duplicated, block: B:182:0x0392  */
    /* JADX WARN: Code duplicated, block: B:190:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:192:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:194:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:19:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:219:0x0401  */
    /* JADX WARN: Code duplicated, block: B:21:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:23:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:245:0x0439  */
    /* JADX WARN: Code duplicated, block: B:248:0x043d  */
    /* JADX WARN: Code duplicated, block: B:24:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:252:0x0452 A[LOOP:4: B:251:0x0450->B:252:0x0452, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:255:0x0462  */
    /* JADX WARN: Code duplicated, block: B:257:0x0465 A[LOOP:5: B:256:0x0463->B:257:0x0465, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:260:0x047f  */
    /* JADX WARN: Code duplicated, block: B:262:0x0484  */
    /* JADX WARN: Code duplicated, block: B:264:0x048b  */
    /* JADX WARN: Code duplicated, block: B:266:0x048e  */
    /* JADX WARN: Code duplicated, block: B:269:0x0494  */
    /* JADX WARN: Code duplicated, block: B:270:0x0496  */
    /* JADX WARN: Code duplicated, block: B:273:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:275:0x04bb  */
    /* JADX WARN: Code duplicated, block: B:276:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:278:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:27:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:285:0x050b  */
    /* JADX WARN: Code duplicated, block: B:28:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:296:0x054c  */
    /* JADX WARN: Code duplicated, block: B:298:0x054f  */
    /* JADX WARN: Code duplicated, block: B:319:0x059b  */
    /* JADX WARN: Code duplicated, block: B:322:0x05ad  */
    /* JADX WARN: Code duplicated, block: B:324:0x05b2  */
    /* JADX WARN: Code duplicated, block: B:327:0x05d1  */
    /* JADX WARN: Code duplicated, block: B:329:0x05d4  */
    /* JADX WARN: Code duplicated, block: B:331:0x05d7  */
    /* JADX WARN: Code duplicated, block: B:333:0x05dc  */
    /* JADX WARN: Code duplicated, block: B:336:0x05fb  */
    /* JADX WARN: Code duplicated, block: B:338:0x05fe  */
    /* JADX WARN: Code duplicated, block: B:341:0x0604  */
    /* JADX WARN: Code duplicated, block: B:344:0x060a  */
    /* JADX WARN: Code duplicated, block: B:348:0x061c A[LOOP:7: B:294:0x0547->B:348:0x061c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:351:0x0113 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:363:0x02ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:379:0x0441 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:385:0x0626 A[EDGE_INSN: B:385:0x0626->B:349:0x0626 BREAK  A[LOOP:7: B:294:0x0547->B:348:0x061c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:386:0x0626 A[EDGE_INSN: B:386:0x0626->B:349:0x0626 BREAK  A[LOOP:7: B:294:0x0547->B:348:0x061c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x0113 A[PHI: r6 r13
      0x0113: PHI (r6v3 boolean) = (r6v2 boolean), (r6v55 boolean) binds: [B:18:0x00ac, B:351:0x0113] A[DONT_GENERATE, DONT_INLINE]
      0x0113: PHI (r13v2 int) = (r13v1 int), (r13v31 int) binds: [B:18:0x00ac, B:351:0x0113] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0136  */
    /* JADX WARN: Code duplicated, block: B:70:0x0152  */
    public void resolveSystem(ConstraintWidgetContainer constraintWidgetContainer, int i7, int i10, int i11) {
        int i12;
        int i13;
        s0.f fVar;
        n8.f fVar2;
        ConstraintWidgetContainer constraintWidgetContainer2;
        ArrayList arrayList;
        s0.c cVar;
        int[] iArr;
        int size;
        int iN;
        int iK;
        boolean zC;
        boolean z5;
        boolean z6;
        int i14;
        boolean z7;
        s0.c cVar2;
        boolean z10;
        boolean zO;
        int i15;
        int size2;
        int[] iArr2;
        boolean z11;
        boolean z12;
        int iMax;
        int iMax2;
        int i16;
        boolean z13;
        boolean z14;
        boolean z15;
        int i17;
        s0.c cVar3;
        int i18;
        int i19;
        ConstraintWidget constraintWidget;
        int iN2;
        int iK2;
        int i20;
        int i21;
        boolean Z;
        int iN3;
        s0.c cVar4;
        int iK3;
        boolean z16;
        ConstraintWidget constraintWidget2;
        int iN4;
        int iK4;
        boolean z17;
        boolean z18;
        s0.c cVar5;
        int iN5;
        boolean z19;
        int iK5;
        int size3;
        s0.c cVar6;
        int i22;
        ConstraintLayout constraintLayout;
        int childCount;
        int i23;
        int size4;
        int i24;
        ConstraintWidget constraintWidget3;
        int iJ;
        int i25;
        boolean z20;
        s0.m mVar;
        o oVar;
        int iMin;
        boolean z21;
        ConstraintWidgetContainer constraintWidgetContainer3;
        int i26;
        int i27;
        boolean z22;
        boolean z23;
        ArrayList<q> arrayList2;
        int i28;
        int i29;
        int i30;
        int i31;
        boolean z24;
        Iterator it;
        boolean z25;
        q qVar;
        Metrics metrics;
        int i32;
        boolean z26;
        ConstraintWidget constraintWidget4;
        int i33;
        int[] iArr3;
        boolean z27;
        boolean z28;
        boolean z29;
        int mode = View.MeasureSpec.getMode(i10);
        int size5 = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size6 = View.MeasureSpec.getSize(i11);
        int iMax3 = Math.max(0, getPaddingTop());
        int iMax4 = Math.max(0, getPaddingBottom());
        int i34 = iMax3 + iMax4;
        int paddingWidth = getPaddingWidth();
        Measurer measurer = this.mMeasurer;
        measurer.f1323b = iMax3;
        measurer.f1324c = iMax4;
        measurer.f1325d = paddingWidth;
        measurer.f1326e = i34;
        measurer.f1327f = i10;
        measurer.f1328g = i11;
        int iMax5 = Math.max(0, getPaddingStart());
        int iMax6 = Math.max(0, getPaddingEnd());
        if (iMax5 > 0 || iMax6 > 0) {
            if (!isRtl()) {
            }
            i12 = size5 - paddingWidth;
            i13 = size6 - i34;
            setSelfDimensionBehaviour(constraintWidgetContainer, mode, i12, mode2, i13);
            constraintWidgetContainer.f1281w0 = iMax6;
            fVar = constraintWidgetContainer.f1276r0;
            constraintWidgetContainer.f1282x0 = iMax3;
            fVar2 = constraintWidgetContainer.f1275q0;
            constraintWidgetContainer2 = (ConstraintWidgetContainer) fVar2.f16511i;
            arrayList = (ArrayList) fVar2.f16510e;
            cVar = constraintWidgetContainer.f1278t0;
            iArr = constraintWidgetContainer.B;
            size = constraintWidgetContainer.f1274p0.size();
            iN = constraintWidgetContainer.n();
            iK = constraintWidgetContainer.k();
            boolean z30 = false;
            zC = r0.h.c(i7, IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
            if (!zC || r0.h.c(i7, 64)) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                i32 = 0;
                while (true) {
                    if (i32 < size) {
                        z26 = z5;
                        constraintWidget4 = (ConstraintWidget) constraintWidgetContainer.f1274p0.get(i32);
                        i33 = i32;
                        iArr3 = constraintWidget4.f1262o0;
                        i14 = size;
                        if (iArr3[0] == 3) {
                            z27 = true;
                        } else {
                            z27 = false;
                        }
                        if (iArr3[1] == 3) {
                            z28 = true;
                        } else {
                            z28 = false;
                        }
                        if (z27 || !z28 || constraintWidget4.V <= 0.0f) {
                            z29 = false;
                        } else {
                            z29 = true;
                        }
                        if ((constraintWidget4.u() || !z29) && !((constraintWidget4.v() && z29) || (constraintWidget4 instanceof r0.e) || constraintWidget4.u() || constraintWidget4.v())) {
                            i32 = i33 + 1;
                            z5 = z26;
                            size = i14;
                        } else {
                            z6 = false;
                        }
                    } else {
                        z6 = z5;
                        i14 = size;
                    }
                }
            } else {
                z6 = z5;
                i14 = size;
            }
            if (z6 && (metrics = p0.c.f17740r) != null) {
                metrics.f1229a++;
            }
            z7 = z6 & ((mode != 1073741824 && mode2 == 1073741824) || zC);
            if (z7) {
                int iMin2 = Math.min(iArr[0], i12);
                iMin = Math.min(iArr[1], i13);
                if (mode == 1073741824 || constraintWidgetContainer.n() == iMin2) {
                    z21 = true;
                } else {
                    constraintWidgetContainer.J(iMin2);
                    z21 = true;
                    fVar.f19664b = true;
                }
                if (mode2 == 1073741824 && constraintWidgetContainer.k() != iMin) {
                    constraintWidgetContainer.G(iMin);
                    fVar.f19664b = z21;
                }
                if (mode == 1073741824 || mode2 != 1073741824) {
                    cVar2 = cVar;
                    z10 = z7;
                    constraintWidgetContainer3 = fVar.f19663a;
                    if (fVar.f19664b) {
                        for (ConstraintWidget constraintWidget5 : constraintWidgetContainer3.f1274p0) {
                            constraintWidget5.h();
                            constraintWidget5.f1237a = false;
                            s0.m mVar2 = constraintWidget5.f1242d;
                            mVar2.f19696e.j = false;
                            mVar2.f19698g = false;
                            mVar2.n();
                            o oVar2 = constraintWidget5.f1244e;
                            oVar2.f19696e.j = false;
                            oVar2.f19698g = false;
                            oVar2.m();
                        }
                        i26 = 0;
                        constraintWidgetContainer3.h();
                        constraintWidgetContainer3.f1237a = false;
                        s0.m mVar3 = constraintWidgetContainer3.f1242d;
                        mVar3.f19696e.j = false;
                        mVar3.f19698g = false;
                        mVar3.n();
                        o oVar3 = constraintWidgetContainer3.f1244e;
                        oVar3.f19696e.j = false;
                        oVar3.f19698g = false;
                        oVar3.m();
                        fVar.c();
                    } else {
                        i26 = 0;
                    }
                    fVar.b(fVar.f19666d);
                    constraintWidgetContainer3.X = i26;
                    constraintWidgetContainer3.Y = i26;
                    constraintWidgetContainer3.f1242d.f19699h.d(i26);
                    constraintWidgetContainer3.f1244e.f19699h.d(i26);
                    i27 = 1073741824;
                    if (mode == 1073741824) {
                        zO = constraintWidgetContainer.O(i26, zC);
                        i15 = 1;
                    } else {
                        zO = true;
                        i15 = 0;
                    }
                    if (mode2 == 1073741824) {
                        zO &= constraintWidgetContainer.O(1, zC);
                        i15++;
                    }
                } else {
                    ArrayList arrayList3 = fVar.f19667e;
                    ConstraintWidgetContainer constraintWidgetContainer4 = fVar.f19663a;
                    if (fVar.f19664b || fVar.f19665c) {
                        for (ConstraintWidget constraintWidget6 : constraintWidgetContainer4.f1274p0) {
                            constraintWidget6.h();
                            constraintWidget6.f1237a = z30;
                            constraintWidget6.f1242d.n();
                            constraintWidget6.f1244e.m();
                            arrayList3 = arrayList3;
                            z30 = false;
                        }
                        arrayList2 = arrayList3;
                        constraintWidgetContainer4.h();
                        i28 = 0;
                        constraintWidgetContainer4.f1237a = false;
                        constraintWidgetContainer4.f1242d.n();
                        constraintWidgetContainer4.f1244e.m();
                        fVar.f19665c = false;
                    } else {
                        arrayList2 = arrayList3;
                        i28 = 0;
                    }
                    fVar.b(fVar.f19666d);
                    constraintWidgetContainer4.X = i28;
                    int[] iArr4 = constraintWidgetContainer4.f1262o0;
                    constraintWidgetContainer4.Y = i28;
                    int iJ2 = constraintWidgetContainer4.j(i28);
                    int iJ3 = constraintWidgetContainer4.j(1);
                    if (fVar.f19664b) {
                        fVar.c();
                    }
                    int iO = constraintWidgetContainer4.o();
                    z10 = z7;
                    int iP = constraintWidgetContainer4.p();
                    cVar2 = cVar;
                    constraintWidgetContainer4.f1242d.f19699h.d(iO);
                    constraintWidgetContainer4.f1244e.f19699h.d(iP);
                    fVar.g();
                    if (iJ2 == 2 || iJ3 == 2) {
                        if (zC) {
                            Iterator it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                if (!((q) it2.next()).k()) {
                                    zC = false;
                                    break;
                                }
                            }
                        }
                        if (zC && iJ2 == 2) {
                            constraintWidgetContainer4.H(1);
                            constraintWidgetContainer4.J(fVar.d(constraintWidgetContainer4, 0));
                            constraintWidgetContainer4.f1242d.f19696e.d(constraintWidgetContainer4.n());
                        }
                        if (zC && iJ3 == 2) {
                            i29 = 1;
                            constraintWidgetContainer4.I(1);
                            constraintWidgetContainer4.G(fVar.d(constraintWidgetContainer4, 1));
                            constraintWidgetContainer4.f1244e.f19696e.d(constraintWidgetContainer4.k());
                        }
                        i30 = iArr4[0];
                        if (i30 != i29 || i30 == 4) {
                            int iN6 = constraintWidgetContainer4.n() + iO;
                            constraintWidgetContainer4.f1242d.f19700i.d(iN6);
                            constraintWidgetContainer4.f1242d.f19696e.d(iN6 - iO);
                            fVar.g();
                            i31 = iArr4[1];
                            if (i31 != 1 || i31 == 4) {
                                int iK6 = constraintWidgetContainer4.k() + iP;
                                constraintWidgetContainer4.f1244e.f19700i.d(iK6);
                                constraintWidgetContainer4.f1244e.f19696e.d(iK6 - iP);
                            }
                            fVar.g();
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        for (q qVar2 : arrayList2) {
                            if (qVar2.f19693b == constraintWidgetContainer4 || qVar2.f19698g) {
                                qVar2.e();
                            }
                        }
                        it = arrayList2.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                z25 = true;
                                break;
                            }
                            qVar = (q) it.next();
                            if (!z24 || qVar.f19693b != constraintWidgetContainer4) {
                                if (qVar.f19699h.j || ((!qVar.f19700i.j && !(qVar instanceof s0.k)) || (!qVar.f19696e.j && !(qVar instanceof s0.d) && !(qVar instanceof s0.k)))) {
                                    z25 = false;
                                    break;
                                }
                            }
                        }
                        constraintWidgetContainer4.H(iJ2);
                        constraintWidgetContainer4.I(iJ3);
                        zO = z25;
                        i27 = 1073741824;
                        i15 = 2;
                    } else {
                        iO = iO;
                    }
                    i29 = 1;
                    i30 = iArr4[0];
                    if (i30 != i29) {
                        int iN7 = constraintWidgetContainer4.n() + iO;
                        constraintWidgetContainer4.f1242d.f19700i.d(iN7);
                        constraintWidgetContainer4.f1242d.f19696e.d(iN7 - iO);
                        fVar.g();
                        i31 = iArr4[1];
                        if (i31 != 1) {
                            int iK7 = constraintWidgetContainer4.k() + iP;
                            constraintWidgetContainer4.f1244e.f19700i.d(iK7);
                            constraintWidgetContainer4.f1244e.f19696e.d(iK7 - iP);
                        } else {
                            int iK8 = constraintWidgetContainer4.k() + iP;
                            constraintWidgetContainer4.f1244e.f19700i.d(iK8);
                            constraintWidgetContainer4.f1244e.f19696e.d(iK8 - iP);
                        }
                        fVar.g();
                        z24 = true;
                    } else {
                        int iN8 = constraintWidgetContainer4.n() + iO;
                        constraintWidgetContainer4.f1242d.f19700i.d(iN8);
                        constraintWidgetContainer4.f1242d.f19696e.d(iN8 - iO);
                        fVar.g();
                        i31 = iArr4[1];
                        if (i31 != 1) {
                            int iK9 = constraintWidgetContainer4.k() + iP;
                            constraintWidgetContainer4.f1244e.f19700i.d(iK9);
                            constraintWidgetContainer4.f1244e.f19696e.d(iK9 - iP);
                        } else {
                            int iK10 = constraintWidgetContainer4.k() + iP;
                            constraintWidgetContainer4.f1244e.f19700i.d(iK10);
                            constraintWidgetContainer4.f1244e.f19696e.d(iK10 - iP);
                        }
                        fVar.g();
                        z24 = true;
                    }
                    while (r3.hasNext()) {
                        if (qVar2.f19693b == constraintWidgetContainer4) {
                        }
                        qVar2.e();
                    }
                    it = arrayList2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            z25 = true;
                            break;
                        }
                        qVar = (q) it.next();
                        if (!z24) {
                        }
                        if (qVar.f19699h.j) {
                        }
                        z25 = false;
                        break;
                    }
                    constraintWidgetContainer4.H(iJ2);
                    constraintWidgetContainer4.I(iJ3);
                    zO = z25;
                    i27 = 1073741824;
                    i15 = 2;
                }
                if (zO) {
                    if (mode == i27) {
                        z22 = true;
                    } else {
                        z22 = false;
                    }
                    if (mode2 == i27) {
                        z23 = true;
                    } else {
                        z23 = false;
                    }
                    constraintWidgetContainer.K(z22, z23);
                }
            } else {
                cVar2 = cVar;
                z10 = z7;
                zO = false;
                i15 = 0;
            }
            if (zO || i15 != 2) {
                int i35 = constraintWidgetContainer.C0;
                if (i14 > 0) {
                    size3 = constraintWidgetContainer.f1274p0.size();
                    boolean zR = constraintWidgetContainer.R(64);
                    cVar6 = constraintWidgetContainer.f1278t0;
                    i22 = 0;
                    while (i22 < size3) {
                        constraintWidget3 = (ConstraintWidget) constraintWidgetContainer.f1274p0.get(i22);
                        if (!(constraintWidget3 instanceof r0.f) || (constraintWidget3 instanceof r0.a) || constraintWidget3.E || (zR && (mVar = constraintWidget3.f1242d) != null && (oVar = constraintWidget3.f1244e) != null && mVar.f19696e.j && oVar.f19696e.j)) {
                            i25 = size3;
                        } else {
                            iJ = constraintWidget3.j(0);
                            int iJ4 = constraintWidget3.j(1);
                            i25 = size3;
                            if (iJ == 3 || constraintWidget3.f1264q == 1 || iJ4 != 3 || constraintWidget3.f1265r == 1) {
                                z20 = false;
                            } else {
                                z20 = true;
                            }
                            if (z20 && constraintWidgetContainer.R(1) && !(constraintWidget3 instanceof r0.e)) {
                                if (iJ == 3 && constraintWidget3.f1264q == 0 && iJ4 != 3 && !constraintWidget3.u()) {
                                    z20 = true;
                                }
                                if (iJ4 == 3 && constraintWidget3.f1265r == 0 && iJ != 3 && !constraintWidget3.u()) {
                                    z20 = true;
                                }
                                if ((iJ == 3 || iJ4 == 3) && constraintWidget3.V > 0.0f) {
                                    z20 = true;
                                }
                            }
                            if (z20) {
                                fVar2.Z(0, constraintWidget3, cVar6);
                            }
                        }
                        i22++;
                        size3 = i25;
                    }
                    constraintLayout = ((Measurer) cVar6).f1322a;
                    childCount = constraintLayout.getChildCount();
                    for (i23 = 0; i23 < childCount; i23++) {
                        constraintLayout.getChildAt(i23);
                    }
                    size4 = constraintLayout.mConstraintHelpers.size();
                    if (size4 > 0) {
                        for (i24 = 0; i24 < size4; i24++) {
                            ((b) constraintLayout.mConstraintHelpers.get(i24)).getClass();
                        }
                    }
                }
                fVar2.k0(constraintWidgetContainer);
                size2 = arrayList.size();
                if (i14 > 0) {
                    fVar2.i0(constraintWidgetContainer, 0, iN, iK);
                }
                if (size2 > 0) {
                    iArr2 = constraintWidgetContainer.f1262o0;
                    if (iArr2[0] == 2) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (iArr2[1] == 2) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    iMax = Math.max(constraintWidgetContainer.n(), constraintWidgetContainer2.a0);
                    iMax2 = Math.max(constraintWidgetContainer.k(), constraintWidgetContainer2.f1239b0);
                    i16 = 0;
                    z13 = false;
                    while (i16 < size2) {
                        constraintWidget2 = (ConstraintWidget) arrayList.get(i16);
                        if (constraintWidget2 instanceof r0.e) {
                            iN4 = constraintWidget2.n();
                            iK4 = constraintWidget2.k();
                            z17 = z12;
                            z18 = z11;
                            cVar5 = cVar2;
                            boolean Z2 = z13 | fVar2.Z(1, constraintWidget2, cVar5);
                            iN5 = constraintWidget2.n();
                            z19 = Z2;
                            iK5 = constraintWidget2.k();
                            if (iN5 != iN4) {
                                constraintWidget2.J(iN5);
                                if (z18 && constraintWidget2.o() + constraintWidget2.T > iMax) {
                                    iMax = Math.max(iMax, constraintWidget2.i(4).e() + constraintWidget2.o() + constraintWidget2.T);
                                }
                                z19 = true;
                            }
                            if (iK5 != iK4) {
                                constraintWidget2.G(iK5);
                                if (z17 && constraintWidget2.p() + constraintWidget2.U > iMax2) {
                                    iMax2 = Math.max(iMax2, constraintWidget2.i(5).e() + constraintWidget2.p() + constraintWidget2.U);
                                }
                                z19 = true;
                            }
                            z13 = z19 | ((r0.e) constraintWidget2).f19175x0;
                        } else {
                            z17 = z12;
                            z18 = z11;
                            cVar5 = cVar2;
                        }
                        i16++;
                        cVar2 = cVar5;
                        z11 = z18;
                        z12 = z17;
                    }
                    z14 = z12;
                    z15 = z11;
                    i17 = 0;
                    while (true) {
                        cVar3 = cVar2;
                        if (i17 < 2) {
                            break;
                        }
                        i18 = 0;
                        while (i18 < size2) {
                            constraintWidget = (ConstraintWidget) arrayList.get(i18);
                            if (!((constraintWidget instanceof r0.g) || (constraintWidget instanceof r0.e)) || (constraintWidget instanceof r0.f) || constraintWidget.f1247f0 == 8 || ((z10 && constraintWidget.f1242d.f19696e.j && constraintWidget.f1244e.f19696e.j) || (constraintWidget instanceof r0.e))) {
                                i20 = size2;
                                cVar4 = cVar3;
                                i21 = i18;
                            } else {
                                iN2 = constraintWidget.n();
                                iK2 = constraintWidget.k();
                                i20 = size2;
                                int i36 = constraintWidget.Z;
                                i21 = i18;
                                Z = fVar2.Z(i17 == 1 ? 2 : 1, constraintWidget, cVar3) | z13;
                                iN3 = constraintWidget.n();
                                cVar4 = cVar3;
                                iK3 = constraintWidget.k();
                                if (iN3 != iN2) {
                                    constraintWidget.J(iN3);
                                    if (!z15 && constraintWidget.o() + constraintWidget.T > iMax) {
                                        iMax = Math.max(iMax, constraintWidget.i(4).e() + constraintWidget.o() + constraintWidget.T);
                                    }
                                    Z = true;
                                }
                                if (iK3 != iK2) {
                                    constraintWidget.G(iK3);
                                    if (!z14 && constraintWidget.p() + constraintWidget.U > iMax2) {
                                        iMax2 = Math.max(iMax2, constraintWidget.i(5).e() + constraintWidget.p() + constraintWidget.U);
                                    }
                                    z16 = true;
                                } else {
                                    z16 = Z;
                                }
                                if (constraintWidget.D || i36 == constraintWidget.Z) {
                                    z13 = z16;
                                } else {
                                    z13 = true;
                                }
                            }
                            i18 = i21 + 1;
                            size2 = i20;
                            cVar3 = cVar4;
                        }
                        i19 = size2;
                        cVar2 = cVar3;
                        if (z13) {
                            break;
                        }
                        i17++;
                        fVar2.i0(constraintWidgetContainer, i17, iN, iK);
                        size2 = i19;
                        z13 = false;
                    }
                }
                constraintWidgetContainer.C0 = i35;
                p0.c.f17738p = constraintWidgetContainer.R(IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING);
            }
            return;
        }
        iMax5 = Math.max(0, getPaddingLeft());
        iMax6 = iMax5;
        i12 = size5 - paddingWidth;
        i13 = size6 - i34;
        setSelfDimensionBehaviour(constraintWidgetContainer, mode, i12, mode2, i13);
        constraintWidgetContainer.f1281w0 = iMax6;
        fVar = constraintWidgetContainer.f1276r0;
        constraintWidgetContainer.f1282x0 = iMax3;
        fVar2 = constraintWidgetContainer.f1275q0;
        constraintWidgetContainer2 = (ConstraintWidgetContainer) fVar2.f16511i;
        arrayList = (ArrayList) fVar2.f16510e;
        cVar = constraintWidgetContainer.f1278t0;
        iArr = constraintWidgetContainer.B;
        size = constraintWidgetContainer.f1274p0.size();
        iN = constraintWidgetContainer.n();
        iK = constraintWidgetContainer.k();
        boolean z31 = false;
        zC = r0.h.c(i7, IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        if (zC) {
            z5 = true;
        } else {
            z5 = true;
        }
        if (z5) {
            i32 = 0;
            while (true) {
                if (i32 < size) {
                    z26 = z5;
                    constraintWidget4 = (ConstraintWidget) constraintWidgetContainer.f1274p0.get(i32);
                    i33 = i32;
                    iArr3 = constraintWidget4.f1262o0;
                    i14 = size;
                    if (iArr3[0] == 3) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    if (iArr3[1] == 3) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    if (z27) {
                        z29 = false;
                    } else {
                        z29 = false;
                    }
                    if (constraintWidget4.u()) {
                        i32 = i33 + 1;
                        z5 = z26;
                        size = i14;
                    } else {
                        i32 = i33 + 1;
                        z5 = z26;
                        size = i14;
                    }
                    z6 = false;
                } else {
                    z6 = z5;
                    i14 = size;
                }
            }
        } else {
            z6 = z5;
            i14 = size;
        }
        if (z6) {
            metrics.f1229a++;
        }
        z7 = z6 & ((mode != 1073741824 && mode2 == 1073741824) || zC);
        if (z7) {
            int iMin3 = Math.min(iArr[0], i12);
            iMin = Math.min(iArr[1], i13);
            if (mode == 1073741824) {
                z21 = true;
            } else {
                z21 = true;
            }
            if (mode2 == 1073741824) {
                constraintWidgetContainer.G(iMin);
                fVar.f19664b = z21;
            }
            if (mode == 1073741824) {
                cVar2 = cVar;
                z10 = z7;
                constraintWidgetContainer3 = fVar.f19663a;
                if (fVar.f19664b) {
                    while (r5.hasNext()) {
                        constraintWidget5.h();
                        constraintWidget5.f1237a = false;
                        s0.m mVar4 = constraintWidget5.f1242d;
                        mVar4.f19696e.j = false;
                        mVar4.f19698g = false;
                        mVar4.n();
                        o oVar4 = constraintWidget5.f1244e;
                        oVar4.f19696e.j = false;
                        oVar4.f19698g = false;
                        oVar4.m();
                    }
                    i26 = 0;
                    constraintWidgetContainer3.h();
                    constraintWidgetContainer3.f1237a = false;
                    s0.m mVar5 = constraintWidgetContainer3.f1242d;
                    mVar5.f19696e.j = false;
                    mVar5.f19698g = false;
                    mVar5.n();
                    o oVar5 = constraintWidgetContainer3.f1244e;
                    oVar5.f19696e.j = false;
                    oVar5.f19698g = false;
                    oVar5.m();
                    fVar.c();
                } else {
                    i26 = 0;
                }
                fVar.b(fVar.f19666d);
                constraintWidgetContainer3.X = i26;
                constraintWidgetContainer3.Y = i26;
                constraintWidgetContainer3.f1242d.f19699h.d(i26);
                constraintWidgetContainer3.f1244e.f19699h.d(i26);
                i27 = 1073741824;
                if (mode == 1073741824) {
                    zO = constraintWidgetContainer.O(i26, zC);
                    i15 = 1;
                } else {
                    zO = true;
                    i15 = 0;
                }
                if (mode2 == 1073741824) {
                    zO &= constraintWidgetContainer.O(1, zC);
                    i15++;
                }
            } else {
                cVar2 = cVar;
                z10 = z7;
                constraintWidgetContainer3 = fVar.f19663a;
                if (fVar.f19664b) {
                    while (r5.hasNext()) {
                        constraintWidget5.h();
                        constraintWidget5.f1237a = false;
                        s0.m mVar6 = constraintWidget5.f1242d;
                        mVar6.f19696e.j = false;
                        mVar6.f19698g = false;
                        mVar6.n();
                        o oVar6 = constraintWidget5.f1244e;
                        oVar6.f19696e.j = false;
                        oVar6.f19698g = false;
                        oVar6.m();
                    }
                    i26 = 0;
                    constraintWidgetContainer3.h();
                    constraintWidgetContainer3.f1237a = false;
                    s0.m mVar7 = constraintWidgetContainer3.f1242d;
                    mVar7.f19696e.j = false;
                    mVar7.f19698g = false;
                    mVar7.n();
                    o oVar7 = constraintWidgetContainer3.f1244e;
                    oVar7.f19696e.j = false;
                    oVar7.f19698g = false;
                    oVar7.m();
                    fVar.c();
                } else {
                    i26 = 0;
                }
                fVar.b(fVar.f19666d);
                constraintWidgetContainer3.X = i26;
                constraintWidgetContainer3.Y = i26;
                constraintWidgetContainer3.f1242d.f19699h.d(i26);
                constraintWidgetContainer3.f1244e.f19699h.d(i26);
                i27 = 1073741824;
                if (mode == 1073741824) {
                    zO = constraintWidgetContainer.O(i26, zC);
                    i15 = 1;
                } else {
                    zO = true;
                    i15 = 0;
                }
                if (mode2 == 1073741824) {
                    zO &= constraintWidgetContainer.O(1, zC);
                    i15++;
                }
            }
            if (zO) {
                if (mode == i27) {
                    z22 = true;
                } else {
                    z22 = false;
                }
                if (mode2 == i27) {
                    z23 = true;
                } else {
                    z23 = false;
                }
                constraintWidgetContainer.K(z22, z23);
            }
        } else {
            cVar2 = cVar;
            z10 = z7;
            zO = false;
            i15 = 0;
        }
        if (zO) {
        }
        int i37 = constraintWidgetContainer.C0;
        if (i14 > 0) {
            size3 = constraintWidgetContainer.f1274p0.size();
            boolean zR2 = constraintWidgetContainer.R(64);
            cVar6 = constraintWidgetContainer.f1278t0;
            i22 = 0;
            while (i22 < size3) {
                constraintWidget3 = (ConstraintWidget) constraintWidgetContainer.f1274p0.get(i22);
                if (!(constraintWidget3 instanceof r0.f)) {
                    i25 = size3;
                } else {
                    iJ = constraintWidget3.j(0);
                    int iJ5 = constraintWidget3.j(1);
                    i25 = size3;
                    if (iJ == 3) {
                        z20 = false;
                    } else {
                        z20 = false;
                    }
                    if (z20) {
                    }
                    if (z20) {
                        fVar2.Z(0, constraintWidget3, cVar6);
                    }
                }
                i22++;
                size3 = i25;
            }
            constraintLayout = ((Measurer) cVar6).f1322a;
            childCount = constraintLayout.getChildCount();
            while (i23 < childCount) {
                constraintLayout.getChildAt(i23);
            }
            size4 = constraintLayout.mConstraintHelpers.size();
            if (size4 > 0) {
                while (i24 < size4) {
                    ((b) constraintLayout.mConstraintHelpers.get(i24)).getClass();
                }
            }
        }
        fVar2.k0(constraintWidgetContainer);
        size2 = arrayList.size();
        if (i14 > 0) {
            fVar2.i0(constraintWidgetContainer, 0, iN, iK);
        }
        if (size2 > 0) {
            iArr2 = constraintWidgetContainer.f1262o0;
            if (iArr2[0] == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (iArr2[1] == 2) {
                z12 = true;
            } else {
                z12 = false;
            }
            iMax = Math.max(constraintWidgetContainer.n(), constraintWidgetContainer2.a0);
            iMax2 = Math.max(constraintWidgetContainer.k(), constraintWidgetContainer2.f1239b0);
            i16 = 0;
            z13 = false;
            while (i16 < size2) {
                constraintWidget2 = (ConstraintWidget) arrayList.get(i16);
                if (constraintWidget2 instanceof r0.e) {
                    z17 = z12;
                    z18 = z11;
                    cVar5 = cVar2;
                } else {
                    iN4 = constraintWidget2.n();
                    iK4 = constraintWidget2.k();
                    z17 = z12;
                    z18 = z11;
                    cVar5 = cVar2;
                    boolean Z3 = z13 | fVar2.Z(1, constraintWidget2, cVar5);
                    iN5 = constraintWidget2.n();
                    z19 = Z3;
                    iK5 = constraintWidget2.k();
                    if (iN5 != iN4) {
                        constraintWidget2.J(iN5);
                        if (z18) {
                            iMax = Math.max(iMax, constraintWidget2.i(4).e() + constraintWidget2.o() + constraintWidget2.T);
                        }
                        z19 = true;
                    }
                    if (iK5 != iK4) {
                        constraintWidget2.G(iK5);
                        if (z17) {
                            iMax2 = Math.max(iMax2, constraintWidget2.i(5).e() + constraintWidget2.p() + constraintWidget2.U);
                        }
                        z19 = true;
                    }
                    z13 = z19 | ((r0.e) constraintWidget2).f19175x0;
                }
                i16++;
                cVar2 = cVar5;
                z11 = z18;
                z12 = z17;
            }
            z14 = z12;
            z15 = z11;
            i17 = 0;
            while (true) {
                cVar3 = cVar2;
                if (i17 < 2) {
                    break;
                    break;
                }
                i18 = 0;
                while (i18 < size2) {
                    constraintWidget = (ConstraintWidget) arrayList.get(i18);
                    if (constraintWidget instanceof r0.g) {
                        iN2 = constraintWidget.n();
                        iK2 = constraintWidget.k();
                        i20 = size2;
                        int i38 = constraintWidget.Z;
                        i21 = i18;
                        Z = fVar2.Z(i17 == 1 ? 2 : 1, constraintWidget, cVar3) | z13;
                        iN3 = constraintWidget.n();
                        cVar4 = cVar3;
                        iK3 = constraintWidget.k();
                        if (iN3 != iN2) {
                            constraintWidget.J(iN3);
                            if (!z15) {
                            }
                            Z = true;
                        }
                        if (iK3 != iK2) {
                            constraintWidget.G(iK3);
                            if (!z14) {
                            }
                            z16 = true;
                        } else {
                            z16 = Z;
                        }
                        if (constraintWidget.D) {
                            z13 = z16;
                        } else {
                            z13 = z16;
                        }
                    } else {
                        iN2 = constraintWidget.n();
                        iK2 = constraintWidget.k();
                        i20 = size2;
                        int i39 = constraintWidget.Z;
                        i21 = i18;
                        Z = fVar2.Z(i17 == 1 ? 2 : 1, constraintWidget, cVar3) | z13;
                        iN3 = constraintWidget.n();
                        cVar4 = cVar3;
                        iK3 = constraintWidget.k();
                        if (iN3 != iN2) {
                            constraintWidget.J(iN3);
                            if (!z15) {
                            }
                            Z = true;
                        }
                        if (iK3 != iK2) {
                            constraintWidget.G(iK3);
                            if (!z14) {
                            }
                            z16 = true;
                        } else {
                            z16 = Z;
                        }
                        if (constraintWidget.D) {
                            z13 = z16;
                        } else {
                            z13 = z16;
                        }
                    }
                    i18 = i21 + 1;
                    size2 = i20;
                    cVar3 = cVar4;
                }
                i19 = size2;
                cVar2 = cVar3;
                if (z13) {
                    break;
                    break;
                }
                i17++;
                fVar2.i0(constraintWidgetContainer, i17, iN, iK);
                size2 = i19;
                z13 = false;
            }
        }
        constraintWidgetContainer.C0 = i37;
        p0.c.f17738p = constraintWidgetContainer.R(IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING);
    }

    public void setConstraintSet(ConstraintSet constraintSet) {
        this.mConstraintSet = constraintSet;
    }

    public void setDesignInformation(int i7, Object obj, Object obj2) {
        if (i7 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.mDesignIds == null) {
                this.mDesignIds = new HashMap<>();
            }
            String strSubstring = (String) obj;
            int iIndexOf = strSubstring.indexOf("/");
            if (iIndexOf != -1) {
                strSubstring = strSubstring.substring(iIndexOf + 1);
            }
            this.mDesignIds.put(strSubstring, (Integer) obj2);
        }
    }

    @Override // android.view.View
    public void setId(int i7) {
        this.mChildrenByIds.remove(getId());
        super.setId(i7);
        this.mChildrenByIds.put(getId(), this);
    }

    public void setMaxHeight(int i7) {
        if (i7 == this.mMaxHeight) {
            return;
        }
        this.mMaxHeight = i7;
        requestLayout();
    }

    public void setMaxWidth(int i7) {
        if (i7 == this.mMaxWidth) {
            return;
        }
        this.mMaxWidth = i7;
        requestLayout();
    }

    public void setMinHeight(int i7) {
        if (i7 == this.mMinHeight) {
            return;
        }
        this.mMinHeight = i7;
        requestLayout();
    }

    public void setMinWidth(int i7) {
        if (i7 == this.mMinWidth) {
            return;
        }
        this.mMinWidth = i7;
        requestLayout();
    }

    public void setOnConstraintsChanged(ConstraintsChangedListener constraintsChangedListener) {
        this.mConstraintsChangedListener = constraintsChangedListener;
    }

    public void setOptimizationLevel(int i7) {
        this.mOptimizationLevel = i7;
        ConstraintWidgetContainer constraintWidgetContainer = this.mLayoutWidget;
        constraintWidgetContainer.C0 = i7;
        p0.c.f17738p = constraintWidgetContainer.R(IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x003c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x003e  */
    /* JADX WARN: Code duplicated, block: B:19:0x003f A[PHI: r5
      0x003f: PHI (r5v2 int) = (r5v0 int), (r5v4 int) binds: [B:21:0x004a, B:18:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0041  */
    /* JADX WARN: Code duplicated, block: B:21:0x004a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x004c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0053 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0055  */
    /* JADX WARN: Code duplicated, block: B:27:0x0061  */
    /* JADX WARN: Code duplicated, block: B:29:0x0067  */
    /* JADX WARN: Code duplicated, block: B:32:0x0090  */
    /* JADX WARN: Code duplicated, block: B:33:0x0093  */
    /* JADX WARN: Code duplicated, block: B:36:0x009a  */
    /* JADX WARN: Code duplicated, block: B:38:0x009d  */
    public void setSelfDimensionBehaviour(ConstraintWidgetContainer constraintWidgetContainer, int i7, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        Measurer measurer = this.mMeasurer;
        int i16 = measurer.f1326e;
        int i17 = measurer.f1325d;
        int childCount = getChildCount();
        int i18 = 2;
        if (i7 != Integer.MIN_VALUE) {
            if (i7 != 0) {
                if (i7 != 1073741824) {
                    i13 = 1;
                } else {
                    i10 = Math.min(this.mMaxWidth - i17, i10);
                    i13 = 1;
                }
                if (i11 != Integer.MIN_VALUE) {
                    if (i11 != 0) {
                        if (i11 != 1073741824) {
                            i18 = 1;
                            i12 = 0;
                        } else {
                            i12 = Math.min(this.mMaxHeight - i16, i12);
                            i18 = 1;
                        }
                    } else if (childCount == 0) {
                        i12 = Math.max(0, this.mMinHeight);
                    } else {
                        i12 = 0;
                    }
                } else if (childCount == 0) {
                    i12 = Math.max(0, this.mMinHeight);
                }
                if (i10 == constraintWidgetContainer.n() || i12 != constraintWidgetContainer.k()) {
                    constraintWidgetContainer.f1276r0.f19665c = true;
                }
                constraintWidgetContainer.X = 0;
                constraintWidgetContainer.Y = 0;
                int i19 = this.mMaxWidth - i17;
                int[] iArr = constraintWidgetContainer.B;
                iArr[0] = i19;
                iArr[1] = this.mMaxHeight - i16;
                constraintWidgetContainer.a0 = 0;
                constraintWidgetContainer.f1239b0 = 0;
                constraintWidgetContainer.H(i13);
                constraintWidgetContainer.J(i10);
                constraintWidgetContainer.I(i18);
                constraintWidgetContainer.G(i12);
                i14 = this.mMinWidth - i17;
                if (i14 < 0) {
                    constraintWidgetContainer.a0 = 0;
                } else {
                    constraintWidgetContainer.a0 = i14;
                }
                i15 = this.mMinHeight - i16;
                if (i15 < 0) {
                    constraintWidgetContainer.f1239b0 = 0;
                } else {
                    constraintWidgetContainer.f1239b0 = i15;
                }
            }
            if (childCount == 0) {
                i10 = Math.max(0, this.mMinWidth);
            } else {
                i13 = 2;
            }
            i10 = 0;
            if (i11 != Integer.MIN_VALUE) {
                if (i11 != 0) {
                    if (i11 != 1073741824) {
                        i18 = 1;
                        i12 = 0;
                    } else {
                        i12 = Math.min(this.mMaxHeight - i16, i12);
                        i18 = 1;
                    }
                } else if (childCount == 0) {
                    i12 = Math.max(0, this.mMinHeight);
                } else {
                    i12 = 0;
                }
            } else if (childCount == 0) {
                i12 = Math.max(0, this.mMinHeight);
            }
            if (i10 == constraintWidgetContainer.n()) {
                constraintWidgetContainer.f1276r0.f19665c = true;
            } else {
                constraintWidgetContainer.f1276r0.f19665c = true;
            }
            constraintWidgetContainer.X = 0;
            constraintWidgetContainer.Y = 0;
            int i110 = this.mMaxWidth - i17;
            int[] iArr2 = constraintWidgetContainer.B;
            iArr2[0] = i110;
            iArr2[1] = this.mMaxHeight - i16;
            constraintWidgetContainer.a0 = 0;
            constraintWidgetContainer.f1239b0 = 0;
            constraintWidgetContainer.H(i13);
            constraintWidgetContainer.J(i10);
            constraintWidgetContainer.I(i18);
            constraintWidgetContainer.G(i12);
            i14 = this.mMinWidth - i17;
            if (i14 < 0) {
                constraintWidgetContainer.a0 = 0;
            } else {
                constraintWidgetContainer.a0 = i14;
            }
            i15 = this.mMinHeight - i16;
            if (i15 < 0) {
                constraintWidgetContainer.f1239b0 = 0;
            } else {
                constraintWidgetContainer.f1239b0 = i15;
            }
        }
        if (childCount == 0) {
            i10 = Math.max(0, this.mMinWidth);
        }
        i13 = 2;
        if (i11 != Integer.MIN_VALUE) {
            if (i11 != 0) {
                if (i11 != 1073741824) {
                    i18 = 1;
                    i12 = 0;
                } else {
                    i12 = Math.min(this.mMaxHeight - i16, i12);
                    i18 = 1;
                }
            } else if (childCount == 0) {
                i12 = Math.max(0, this.mMinHeight);
            } else {
                i12 = 0;
            }
        } else if (childCount == 0) {
            i12 = Math.max(0, this.mMinHeight);
        }
        if (i10 == constraintWidgetContainer.n()) {
            constraintWidgetContainer.f1276r0.f19665c = true;
        } else {
            constraintWidgetContainer.f1276r0.f19665c = true;
        }
        constraintWidgetContainer.X = 0;
        constraintWidgetContainer.Y = 0;
        int i111 = this.mMaxWidth - i17;
        int[] iArr3 = constraintWidgetContainer.B;
        iArr3[0] = i111;
        iArr3[1] = this.mMaxHeight - i16;
        constraintWidgetContainer.a0 = 0;
        constraintWidgetContainer.f1239b0 = 0;
        constraintWidgetContainer.H(i13);
        constraintWidgetContainer.J(i10);
        constraintWidgetContainer.I(i18);
        constraintWidgetContainer.G(i12);
        i14 = this.mMinWidth - i17;
        if (i14 < 0) {
            constraintWidgetContainer.a0 = 0;
        } else {
            constraintWidgetContainer.a0 = i14;
        }
        i15 = this.mMinHeight - i16;
        if (i15 < 0) {
            constraintWidgetContainer.f1239b0 = 0;
        } else {
            constraintWidgetContainer.f1239b0 = i15;
        }
    }

    public void setState(int i7, int i10, int i11) {
        ConstraintLayoutStates constraintLayoutStates = this.mConstraintLayoutSpec;
        if (constraintLayoutStates != null) {
            float f2 = i10;
            float f7 = i11;
            ConstraintLayout constraintLayout = constraintLayoutStates.f1330a;
            SparseArray sparseArray = constraintLayoutStates.f1333d;
            int i12 = constraintLayoutStates.f1331b;
            int i13 = 0;
            if (i12 == i7) {
                d dVar = i7 == -1 ? (d) sparseArray.valueAt(0) : (d) sparseArray.get(i12);
                int i14 = constraintLayoutStates.f1332c;
                if (i14 == -1 || !((e) dVar.f1357b.get(i14)).a(f2, f7)) {
                    ArrayList arrayList = dVar.f1357b;
                    while (true) {
                        if (i13 >= arrayList.size()) {
                            i13 = -1;
                            break;
                        } else if (((e) arrayList.get(i13)).a(f2, f7)) {
                            break;
                        } else {
                            i13++;
                        }
                    }
                    ArrayList arrayList2 = dVar.f1357b;
                    if (constraintLayoutStates.f1332c == i13) {
                        return;
                    }
                    ConstraintSet constraintSet = i13 == -1 ? null : ((e) arrayList2.get(i13)).f1365f;
                    if (i13 != -1) {
                        int i15 = ((e) arrayList2.get(i13)).f1364e;
                    }
                    if (constraintSet == null) {
                        return;
                    }
                    constraintLayoutStates.f1332c = i13;
                    constraintSet.a(constraintLayout);
                    return;
                }
                return;
            }
            constraintLayoutStates.f1331b = i7;
            d dVar2 = (d) sparseArray.get(i7);
            ArrayList arrayList3 = dVar2.f1357b;
            while (true) {
                if (i13 >= arrayList3.size()) {
                    i13 = -1;
                    break;
                } else if (((e) arrayList3.get(i13)).a(f2, f7)) {
                    break;
                } else {
                    i13++;
                }
            }
            ArrayList arrayList4 = dVar2.f1357b;
            ConstraintSet constraintSet2 = i13 == -1 ? dVar2.f1359d : ((e) arrayList4.get(i13)).f1365f;
            if (i13 != -1) {
                int i16 = ((e) arrayList4.get(i13)).f1364e;
            }
            if (constraintSet2 != null) {
                constraintLayoutStates.f1332c = i13;
                constraintSet2.a(constraintLayout);
                return;
            }
            Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + i7 + ", dim =" + f2 + ", " + f7);
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        LayoutParams layoutParams = new LayoutParams(context, attributeSet);
        layoutParams.f1285a = -1;
        layoutParams.f1286b = -1;
        layoutParams.f1288c = -1.0f;
        layoutParams.f1290d = -1;
        layoutParams.f1292e = -1;
        layoutParams.f1294f = -1;
        layoutParams.f1296g = -1;
        layoutParams.f1298h = -1;
        layoutParams.f1299i = -1;
        layoutParams.j = -1;
        layoutParams.k = -1;
        layoutParams.f1303l = -1;
        layoutParams.f1305m = -1;
        layoutParams.f1307n = -1;
        layoutParams.f1309o = -1;
        layoutParams.f1311p = 0;
        layoutParams.f1312q = 0.0f;
        layoutParams.f1313r = -1;
        layoutParams.f1314s = -1;
        layoutParams.f1315t = -1;
        layoutParams.f1316u = -1;
        layoutParams.f1317v = Integer.MIN_VALUE;
        layoutParams.f1318w = Integer.MIN_VALUE;
        layoutParams.f1319x = Integer.MIN_VALUE;
        layoutParams.f1320y = Integer.MIN_VALUE;
        layoutParams.f1321z = Integer.MIN_VALUE;
        layoutParams.A = Integer.MIN_VALUE;
        layoutParams.B = Integer.MIN_VALUE;
        layoutParams.C = 0;
        layoutParams.D = 0.5f;
        layoutParams.E = 0.5f;
        layoutParams.F = null;
        layoutParams.G = -1.0f;
        layoutParams.H = -1.0f;
        layoutParams.I = 0;
        layoutParams.J = 0;
        layoutParams.K = 0;
        layoutParams.L = 0;
        layoutParams.M = 0;
        layoutParams.N = 0;
        layoutParams.O = 0;
        layoutParams.P = 0;
        layoutParams.Q = 1.0f;
        layoutParams.R = 1.0f;
        layoutParams.S = -1;
        layoutParams.T = -1;
        layoutParams.U = -1;
        layoutParams.V = false;
        layoutParams.W = false;
        layoutParams.X = null;
        layoutParams.Y = 0;
        layoutParams.Z = true;
        layoutParams.a0 = true;
        layoutParams.f1287b0 = false;
        layoutParams.f1289c0 = false;
        layoutParams.f1291d0 = false;
        layoutParams.f1293e0 = -1;
        layoutParams.f1295f0 = -1;
        layoutParams.f1297g0 = -1;
        layoutParams.h0 = -1;
        layoutParams.f1300i0 = Integer.MIN_VALUE;
        layoutParams.f1301j0 = Integer.MIN_VALUE;
        layoutParams.f1302k0 = 0.5f;
        layoutParams.f1310o0 = new ConstraintWidget();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m.f1445b);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i7 = 0; i7 < indexCount; i7++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i7);
            int i10 = c.f1355a.get(index);
            switch (i10) {
                case 1:
                    layoutParams.U = typedArrayObtainStyledAttributes.getInt(index, layoutParams.U);
                    break;
                case 2:
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, layoutParams.f1309o);
                    layoutParams.f1309o = resourceId;
                    if (resourceId == -1) {
                        layoutParams.f1309o = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 3:
                    layoutParams.f1311p = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layoutParams.f1311p);
                    break;
                case 4:
                    float f2 = typedArrayObtainStyledAttributes.getFloat(index, layoutParams.f1312q) % 360.0f;
                    layoutParams.f1312q = f2;
                    if (f2 < 0.0f) {
                        layoutParams.f1312q = (360.0f - f2) % 360.0f;
                    }
                    break;
                case 5:
                    layoutParams.f1285a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, layoutParams.f1285a);
                    break;
                case 6:
                    layoutParams.f1286b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, layoutParams.f1286b);
                    break;
                case 7:
                    layoutParams.f1288c = typedArrayObtainStyledAttributes.getFloat(index, layoutParams.f1288c);
                    break;
                case 8:
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, layoutParams.f1290d);
                    layoutParams.f1290d = resourceId2;
                    if (resourceId2 == -1) {
                        layoutParams.f1290d = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 9:
                    int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, layoutParams.f1292e);
                    layoutParams.f1292e = resourceId3;
                    if (resourceId3 == -1) {
                        layoutParams.f1292e = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 10:
                    int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, layoutParams.f1294f);
                    layoutParams.f1294f = resourceId4;
                    if (resourceId4 == -1) {
                        layoutParams.f1294f = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 11:
                    int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, layoutParams.f1296g);
                    layoutParams.f1296g = resourceId5;
                    if (resourceId5 == -1) {
                        layoutParams.f1296g = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 12:
                    int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, layoutParams.f1298h);
                    layoutParams.f1298h = resourceId6;
                    if (resourceId6 == -1) {
                        layoutParams.f1298h = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 13:
                    int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, layoutParams.f1299i);
                    layoutParams.f1299i = resourceId7;
                    if (resourceId7 == -1) {
                        layoutParams.f1299i = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 14:
                    int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, layoutParams.j);
                    layoutParams.j = resourceId8;
                    if (resourceId8 == -1) {
                        layoutParams.j = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 15:
                    int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, layoutParams.k);
                    layoutParams.k = resourceId9;
                    if (resourceId9 == -1) {
                        layoutParams.k = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 16:
                    int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, layoutParams.f1303l);
                    layoutParams.f1303l = resourceId10;
                    if (resourceId10 == -1) {
                        layoutParams.f1303l = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 17:
                    int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, layoutParams.f1313r);
                    layoutParams.f1313r = resourceId11;
                    if (resourceId11 == -1) {
                        layoutParams.f1313r = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 18:
                    int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, layoutParams.f1314s);
                    layoutParams.f1314s = resourceId12;
                    if (resourceId12 == -1) {
                        layoutParams.f1314s = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 19:
                    int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, layoutParams.f1315t);
                    layoutParams.f1315t = resourceId13;
                    if (resourceId13 == -1) {
                        layoutParams.f1315t = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 20:
                    int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, layoutParams.f1316u);
                    layoutParams.f1316u = resourceId14;
                    if (resourceId14 == -1) {
                        layoutParams.f1316u = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 21:
                    layoutParams.f1317v = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layoutParams.f1317v);
                    break;
                case 22:
                    layoutParams.f1318w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layoutParams.f1318w);
                    break;
                case 23:
                    layoutParams.f1319x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layoutParams.f1319x);
                    break;
                case 24:
                    layoutParams.f1320y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layoutParams.f1320y);
                    break;
                case 25:
                    layoutParams.f1321z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layoutParams.f1321z);
                    break;
                case 26:
                    layoutParams.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layoutParams.A);
                    break;
                case 27:
                    layoutParams.V = typedArrayObtainStyledAttributes.getBoolean(index, layoutParams.V);
                    break;
                case 28:
                    layoutParams.W = typedArrayObtainStyledAttributes.getBoolean(index, layoutParams.W);
                    break;
                case 29:
                    layoutParams.D = typedArrayObtainStyledAttributes.getFloat(index, layoutParams.D);
                    break;
                case 30:
                    layoutParams.E = typedArrayObtainStyledAttributes.getFloat(index, layoutParams.E);
                    break;
                case 31:
                    int i11 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    layoutParams.K = i11;
                    if (i11 == 1) {
                        Log.e(TAG, "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                    }
                    break;
                case 32:
                    int i12 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    layoutParams.L = i12;
                    if (i12 == 1) {
                        Log.e(TAG, "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                    }
                    break;
                case 33:
                    try {
                        layoutParams.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layoutParams.M);
                    } catch (Exception unused) {
                        if (typedArrayObtainStyledAttributes.getInt(index, layoutParams.M) == -2) {
                            layoutParams.M = -2;
                        }
                    }
                    break;
                case 34:
                    try {
                        layoutParams.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layoutParams.O);
                    } catch (Exception unused2) {
                        if (typedArrayObtainStyledAttributes.getInt(index, layoutParams.O) == -2) {
                            layoutParams.O = -2;
                        }
                    }
                    break;
                case 35:
                    layoutParams.Q = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, layoutParams.Q));
                    layoutParams.K = 2;
                    break;
                case 36:
                    try {
                        layoutParams.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layoutParams.N);
                    } catch (Exception unused3) {
                        if (typedArrayObtainStyledAttributes.getInt(index, layoutParams.N) == -2) {
                            layoutParams.N = -2;
                        }
                    }
                    break;
                case ChatViewRecyclerTypes.POLL_TEXT_AND_IMAGE /* 37 */:
                    try {
                        layoutParams.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layoutParams.P);
                    } catch (Exception unused4) {
                        if (typedArrayObtainStyledAttributes.getInt(index, layoutParams.P) == -2) {
                            layoutParams.P = -2;
                        }
                    }
                    break;
                case ChatViewRecyclerTypes.POLL_IMAGE_ONLY /* 38 */:
                    layoutParams.R = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, layoutParams.R));
                    layoutParams.L = 2;
                    break;
                default:
                    switch (i10) {
                        case ChatViewRecyclerTypes.FORWARD_BREADCRUMB /* 44 */:
                            ConstraintSet.j(layoutParams, typedArrayObtainStyledAttributes.getString(index));
                            break;
                        case ChatViewRecyclerTypes.REACTION_BURST_REACTION /* 45 */:
                            layoutParams.G = typedArrayObtainStyledAttributes.getFloat(index, layoutParams.G);
                            break;
                        case 46:
                            layoutParams.H = typedArrayObtainStyledAttributes.getFloat(index, layoutParams.H);
                            break;
                        case ChatViewRecyclerTypes.REACTION_ADD_REACTION /* 47 */:
                            layoutParams.I = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            layoutParams.J = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_IMAGE /* 49 */:
                            layoutParams.S = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, layoutParams.S);
                            break;
                        case 50:
                            layoutParams.T = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, layoutParams.T);
                            break;
                        case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_VISUAL_PLACEHOLDER /* 51 */:
                            layoutParams.X = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case ChatViewRecyclerTypes.REFERRAL /* 52 */:
                            int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, layoutParams.f1305m);
                            layoutParams.f1305m = resourceId15;
                            if (resourceId15 == -1) {
                                layoutParams.f1305m = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            break;
                        case ChatViewRecyclerTypes.GUILD_PROFILE_INVITE /* 53 */:
                            int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, layoutParams.f1307n);
                            layoutParams.f1307n = resourceId16;
                            if (resourceId16 == -1) {
                                layoutParams.f1307n = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            break;
                        case ChatViewRecyclerTypes.APP_MESSAGE_EMBED /* 54 */:
                            layoutParams.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layoutParams.C);
                            break;
                        case ChatViewRecyclerTypes.ACTIVITY_RICH_PRESENCE_INVITE_EMBED /* 55 */:
                            layoutParams.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layoutParams.B);
                            break;
                        default:
                            switch (i10) {
                                case 64:
                                    ConstraintSet.i(layoutParams, typedArrayObtainStyledAttributes, index, 0);
                                    break;
                                case 65:
                                    ConstraintSet.i(layoutParams, typedArrayObtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    layoutParams.Y = typedArrayObtainStyledAttributes.getInt(index, layoutParams.Y);
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        layoutParams.a();
        return layoutParams;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new ConstraintWidgetContainer();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new Measurer(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        a(attributeSet, i7);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        LayoutParams layoutParams2 = new LayoutParams(layoutParams);
        layoutParams2.f1285a = -1;
        layoutParams2.f1286b = -1;
        layoutParams2.f1288c = -1.0f;
        layoutParams2.f1290d = -1;
        layoutParams2.f1292e = -1;
        layoutParams2.f1294f = -1;
        layoutParams2.f1296g = -1;
        layoutParams2.f1298h = -1;
        layoutParams2.f1299i = -1;
        layoutParams2.j = -1;
        layoutParams2.k = -1;
        layoutParams2.f1303l = -1;
        layoutParams2.f1305m = -1;
        layoutParams2.f1307n = -1;
        layoutParams2.f1309o = -1;
        layoutParams2.f1311p = 0;
        layoutParams2.f1312q = 0.0f;
        layoutParams2.f1313r = -1;
        layoutParams2.f1314s = -1;
        layoutParams2.f1315t = -1;
        layoutParams2.f1316u = -1;
        layoutParams2.f1317v = Integer.MIN_VALUE;
        layoutParams2.f1318w = Integer.MIN_VALUE;
        layoutParams2.f1319x = Integer.MIN_VALUE;
        layoutParams2.f1320y = Integer.MIN_VALUE;
        layoutParams2.f1321z = Integer.MIN_VALUE;
        layoutParams2.A = Integer.MIN_VALUE;
        layoutParams2.B = Integer.MIN_VALUE;
        layoutParams2.C = 0;
        layoutParams2.D = 0.5f;
        layoutParams2.E = 0.5f;
        layoutParams2.F = null;
        layoutParams2.G = -1.0f;
        layoutParams2.H = -1.0f;
        layoutParams2.I = 0;
        layoutParams2.J = 0;
        layoutParams2.K = 0;
        layoutParams2.L = 0;
        layoutParams2.M = 0;
        layoutParams2.N = 0;
        layoutParams2.O = 0;
        layoutParams2.P = 0;
        layoutParams2.Q = 1.0f;
        layoutParams2.R = 1.0f;
        layoutParams2.S = -1;
        layoutParams2.T = -1;
        layoutParams2.U = -1;
        layoutParams2.V = false;
        layoutParams2.W = false;
        layoutParams2.X = null;
        layoutParams2.Y = 0;
        layoutParams2.Z = true;
        layoutParams2.a0 = true;
        layoutParams2.f1287b0 = false;
        layoutParams2.f1289c0 = false;
        layoutParams2.f1291d0 = false;
        layoutParams2.f1293e0 = -1;
        layoutParams2.f1295f0 = -1;
        layoutParams2.f1297g0 = -1;
        layoutParams2.h0 = -1;
        layoutParams2.f1300i0 = Integer.MIN_VALUE;
        layoutParams2.f1301j0 = Integer.MIN_VALUE;
        layoutParams2.f1302k0 = 0.5f;
        layoutParams2.f1310o0 = new ConstraintWidget();
        return layoutParams2;
    }
}
