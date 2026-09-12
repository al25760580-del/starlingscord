package gk;

import android.content.Context;
import android.graphics.Rect;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.widget.Button;
import android.widget.EditText;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends AccessibilityNodeProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f10047a = new Rect();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f10048b = new int[2];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10049c = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f10050d;

    public a(i iVar) {
        this.f10050d = iVar;
    }

    public final AccessibilityNodeInfo a(int i7, int i10, String str, int i11, int i12, int i13) {
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
        accessibilityNodeInfoObtain.setClassName(Button.class.getName());
        i iVar = this.f10050d;
        accessibilityNodeInfoObtain.setPackageName(iVar.getContext().getPackageName());
        accessibilityNodeInfoObtain.setSource(iVar, i7);
        accessibilityNodeInfoObtain.setParent(iVar);
        accessibilityNodeInfoObtain.setText(str);
        accessibilityNodeInfoObtain.setClickable(true);
        accessibilityNodeInfoObtain.setLongClickable(true);
        accessibilityNodeInfoObtain.setEnabled(iVar.isEnabled());
        accessibilityNodeInfoObtain.setAccessibilityFocused(this.f10049c == i7);
        Rect rect = this.f10047a;
        rect.set(i10, i11, i12, i13);
        accessibilityNodeInfoObtain.setVisibleToUser(true);
        accessibilityNodeInfoObtain.setBoundsInParent(rect);
        int[] iArr = this.f10048b;
        iVar.getLocationOnScreen(iArr);
        rect.offset(iArr[0], iArr[1]);
        accessibilityNodeInfoObtain.setBoundsInScreen(rect);
        if (this.f10049c != i7) {
            accessibilityNodeInfoObtain.addAction(64);
        }
        if (this.f10049c == i7) {
            accessibilityNodeInfoObtain.addAction(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        }
        if (iVar.isEnabled()) {
            accessibilityNodeInfoObtain.addAction(16);
        }
        return accessibilityNodeInfoObtain;
    }

    public final void b(String str, int i7, ArrayList arrayList) {
        EditText editText = this.f10050d.f10067e;
        if (i7 == 1) {
            String strD = d();
            if (TextUtils.isEmpty(strD) || !strD.toString().toLowerCase().contains(str)) {
                return;
            }
            arrayList.add(createAccessibilityNodeInfo(1));
            return;
        }
        if (i7 != 2) {
            if (i7 != 3) {
                return;
            }
            String strC = c();
            if (TextUtils.isEmpty(strC) || !strC.toString().toLowerCase().contains(str)) {
                return;
            }
            arrayList.add(createAccessibilityNodeInfo(3));
            return;
        }
        Editable text = editText.getText();
        if (!TextUtils.isEmpty(text) && text.toString().toLowerCase().contains(str)) {
            arrayList.add(createAccessibilityNodeInfo(2));
            return;
        }
        Editable text2 = editText.getText();
        if (TextUtils.isEmpty(text2) || !text2.toString().toLowerCase().contains(str)) {
            return;
        }
        arrayList.add(createAccessibilityNodeInfo(2));
    }

    public final String c() {
        i iVar = this.f10050d;
        int iF = iVar.K - 1;
        if (iVar.f10076m0) {
            iF = iVar.f(iF);
        }
        int i7 = iVar.I;
        if (iF < i7) {
            return null;
        }
        String[] strArr = iVar.H;
        return strArr == null ? iVar.d(iF) : strArr[iF - i7];
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i7) {
        int[] iArr = this.f10048b;
        Rect rect = this.f10047a;
        i iVar = this.f10050d;
        if (i7 != -1) {
            if (i7 == 1) {
                return a(1, iVar.getScrollX(), d(), iVar.f10086v0 - iVar.f10080q0, (iVar.getRight() - iVar.getLeft()) + iVar.getScrollX(), (iVar.getBottom() - iVar.getTop()) + iVar.getScrollY());
            }
            if (i7 != 2) {
                if (i7 != 3) {
                    return super.createAccessibilityNodeInfo(i7);
                }
                return a(3, iVar.getScrollX(), c(), iVar.getScrollY(), (iVar.getRight() - iVar.getLeft()) + iVar.getScrollX(), iVar.f10080q0 + iVar.f10084u0);
            }
            int scrollX = iVar.getScrollX();
            int i10 = iVar.f10084u0 + iVar.f10080q0;
            int right = (iVar.getRight() - iVar.getLeft()) + iVar.getScrollX();
            int i11 = iVar.f10086v0 - iVar.f10080q0;
            AccessibilityNodeInfo accessibilityNodeInfoCreateAccessibilityNodeInfo = iVar.f10067e.createAccessibilityNodeInfo();
            accessibilityNodeInfoCreateAccessibilityNodeInfo.setSource(iVar, 2);
            accessibilityNodeInfoCreateAccessibilityNodeInfo.setAccessibilityFocused(this.f10049c == 2);
            if (this.f10049c != 2) {
                accessibilityNodeInfoCreateAccessibilityNodeInfo.addAction(64);
            }
            if (this.f10049c == 2) {
                accessibilityNodeInfoCreateAccessibilityNodeInfo.addAction(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
            }
            rect.set(scrollX, i10, right, i11);
            accessibilityNodeInfoCreateAccessibilityNodeInfo.setVisibleToUser(true);
            accessibilityNodeInfoCreateAccessibilityNodeInfo.setBoundsInParent(rect);
            iVar.getLocationOnScreen(iArr);
            rect.offset(iArr[0], iArr[1]);
            accessibilityNodeInfoCreateAccessibilityNodeInfo.setBoundsInScreen(rect);
            return accessibilityNodeInfoCreateAccessibilityNodeInfo;
        }
        int scrollX2 = iVar.getScrollX();
        int scrollY = iVar.getScrollY();
        int right2 = (iVar.getRight() - iVar.getLeft()) + iVar.getScrollX();
        int bottom = (iVar.getBottom() - iVar.getTop()) + iVar.getScrollY();
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
        accessibilityNodeInfoObtain.setClassName(i.class.getName());
        accessibilityNodeInfoObtain.setPackageName(iVar.getContext().getPackageName());
        accessibilityNodeInfoObtain.setSource(iVar);
        if (iVar.getWrapSelectorWheel() || iVar.getValue() > iVar.getMinValue()) {
            accessibilityNodeInfoObtain.addChild(iVar, 3);
        }
        accessibilityNodeInfoObtain.addChild(iVar, 2);
        if (iVar.getWrapSelectorWheel() || iVar.getValue() < iVar.getMaxValue()) {
            accessibilityNodeInfoObtain.addChild(iVar, 1);
        }
        accessibilityNodeInfoObtain.setParent((View) iVar.getParentForAccessibility());
        accessibilityNodeInfoObtain.setEnabled(iVar.isEnabled());
        accessibilityNodeInfoObtain.setScrollable(true);
        accessibilityNodeInfoObtain.setAccessibilityFocused(this.f10049c == -1);
        rect.set(scrollX2, scrollY, right2, bottom);
        accessibilityNodeInfoObtain.setBoundsInParent(rect);
        accessibilityNodeInfoObtain.setVisibleToUser(true);
        iVar.getLocationOnScreen(iArr);
        rect.offset(iArr[0], iArr[1]);
        accessibilityNodeInfoObtain.setBoundsInScreen(rect);
        if (this.f10049c != -1) {
            accessibilityNodeInfoObtain.addAction(64);
        }
        if (this.f10049c == -1) {
            accessibilityNodeInfoObtain.addAction(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        }
        if (iVar.isEnabled()) {
            if (iVar.getWrapSelectorWheel() || iVar.getValue() < iVar.getMaxValue()) {
                accessibilityNodeInfoObtain.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
                accessibilityNodeInfoObtain.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN);
            }
            if (iVar.getWrapSelectorWheel() || iVar.getValue() > iVar.getMinValue()) {
                accessibilityNodeInfoObtain.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
                accessibilityNodeInfoObtain.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP);
            }
        }
        return accessibilityNodeInfoObtain;
    }

    public final String d() {
        i iVar = this.f10050d;
        int iF = iVar.K + 1;
        if (iVar.f10076m0) {
            iF = iVar.f(iF);
        }
        if (iF > iVar.J) {
            return null;
        }
        String[] strArr = iVar.H;
        return strArr == null ? iVar.d(iF) : strArr[iF - iVar.I];
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void e(int i7, int i10, String str) {
        i iVar = this.f10050d;
        if (((AccessibilityManager) iVar.getContext().getSystemService("accessibility")).isEnabled()) {
            AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i10);
            accessibilityEventObtain.setClassName(Button.class.getName());
            accessibilityEventObtain.setPackageName(iVar.getContext().getPackageName());
            accessibilityEventObtain.getText().add(str);
            accessibilityEventObtain.setEnabled(iVar.isEnabled());
            accessibilityEventObtain.setSource(iVar, i7);
            iVar.requestSendAccessibilityEvent(iVar, accessibilityEventObtain);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void f(int i7, int i10) {
        i iVar = this.f10050d;
        if (i7 == 1) {
            if (iVar.getWrapSelectorWheel() || iVar.getValue() < iVar.getMaxValue()) {
                e(i7, i10, d());
                return;
            }
            return;
        }
        if (i7 != 2) {
            if (i7 != 3) {
                return;
            }
            if (iVar.getWrapSelectorWheel() || iVar.getValue() > iVar.getMinValue()) {
                e(i7, i10, c());
                return;
            }
            return;
        }
        Context context = iVar.getContext();
        EditText editText = iVar.f10067e;
        if (((AccessibilityManager) context.getSystemService("accessibility")).isEnabled()) {
            AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i10);
            editText.onInitializeAccessibilityEvent(accessibilityEventObtain);
            editText.onPopulateAccessibilityEvent(accessibilityEventObtain);
            accessibilityEventObtain.setSource(iVar, 2);
            iVar.requestSendAccessibilityEvent(iVar, accessibilityEventObtain);
        }
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i7) {
        if (TextUtils.isEmpty(str)) {
            return Collections.EMPTY_LIST;
        }
        String lowerCase = str.toLowerCase();
        ArrayList arrayList = new ArrayList();
        if (i7 == -1) {
            b(lowerCase, 3, arrayList);
            b(lowerCase, 2, arrayList);
            b(lowerCase, 1, arrayList);
            return arrayList;
        }
        if (i7 != 1 && i7 != 2 && i7 != 3) {
            return super.findAccessibilityNodeInfosByText(str, i7);
        }
        b(lowerCase, i7, arrayList);
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x012d, code lost:
    
        if (r12 != 16908346) goto L104;
     */
    @Override // android.view.accessibility.AccessibilityNodeProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean performAction(int r11, int r12, android.os.Bundle r13) {
        /*
            Method dump skipped, instruction units count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gk.a.performAction(int, int, android.os.Bundle):boolean");
    }
}
