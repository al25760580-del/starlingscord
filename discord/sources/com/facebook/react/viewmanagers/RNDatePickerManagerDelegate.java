package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.modules.dialog.AlertFragment;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.RNDatePickerManagerInterface;

/* JADX INFO: loaded from: classes3.dex */
public class RNDatePickerManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNDatePickerManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNDatePickerManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* JADX INFO: renamed from: setProperty */
    public void kotlinCompat$setProperty(T t5, String str, Object obj) {
        str.getClass();
        byte b10 = -1;
        switch (str.hashCode()) {
            case -1785411759:
                if (str.equals("buttonColor")) {
                    b10 = 0;
                }
                break;
            case -1411282677:
                if (str.equals("is24hourSource")) {
                    b10 = 1;
                }
                break;
            case -1339516167:
                if (str.equals("minuteInterval")) {
                    b10 = 2;
                }
                break;
            case -1235930166:
                if (str.equals("dividerColor")) {
                    b10 = 3;
                }
                break;
            case -1097462182:
                if (str.equals("locale")) {
                    b10 = 4;
                }
                break;
            case -1063571914:
                if (str.equals("textColor")) {
                    b10 = 5;
                }
                break;
            case -292758706:
                if (str.equals("timeZoneOffsetInMinutes")) {
                    b10 = 6;
                }
                break;
            case 3076014:
                if (str.equals("date")) {
                    b10 = 7;
                }
                break;
            case 3357091:
                if (str.equals("mode")) {
                    b10 = 8;
                }
                break;
            case 3417674:
                if (str.equals("open")) {
                    b10 = 9;
                }
                break;
            case 104069805:
                if (str.equals("modal")) {
                    b10 = 10;
                }
                break;
            case 110327241:
                if (str.equals("theme")) {
                    b10 = 11;
                }
                break;
            case 110371416:
                if (str.equals(AlertFragment.ARG_TITLE)) {
                    b10 = 12;
                }
                break;
            case 344408077:
                if (str.equals("confirmText")) {
                    b10 = 13;
                }
                break;
            case 1007762652:
                if (str.equals("minimumDate")) {
                    b10 = 14;
                }
                break;
            case 1685195246:
                if (str.equals("maximumDate")) {
                    b10 = 15;
                }
                break;
            case 1888623303:
                if (str.equals("cancelText")) {
                    b10 = 16;
                }
                break;
        }
        switch (b10) {
            case 0:
                ((RNDatePickerManagerInterface) this.mViewManager).setButtonColor(t5, obj != null ? (String) obj : null);
                break;
            case 1:
                ((RNDatePickerManagerInterface) this.mViewManager).setIs24hourSource(t5, (String) obj);
                break;
            case 2:
                ((RNDatePickerManagerInterface) this.mViewManager).setMinuteInterval(t5, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 3:
                ((RNDatePickerManagerInterface) this.mViewManager).setDividerColor(t5, obj != null ? (String) obj : null);
                break;
            case 4:
                ((RNDatePickerManagerInterface) this.mViewManager).setLocale(t5, obj != null ? (String) obj : null);
                break;
            case 5:
                ((RNDatePickerManagerInterface) this.mViewManager).setTextColor(t5, obj != null ? (String) obj : null);
                break;
            case 6:
                ((RNDatePickerManagerInterface) this.mViewManager).setTimeZoneOffsetInMinutes(t5, obj != null ? (String) obj : null);
                break;
            case 7:
                ((RNDatePickerManagerInterface) this.mViewManager).setDate(t5, obj != null ? (String) obj : null);
                break;
            case 8:
                ((RNDatePickerManagerInterface) this.mViewManager).setMode(t5, (String) obj);
                break;
            case 9:
                ((RNDatePickerManagerInterface) this.mViewManager).setOpen(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 10:
                ((RNDatePickerManagerInterface) this.mViewManager).setModal(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 11:
                ((RNDatePickerManagerInterface) this.mViewManager).setTheme(t5, (String) obj);
                break;
            case 12:
                ((RNDatePickerManagerInterface) this.mViewManager).setTitle(t5, obj != null ? (String) obj : null);
                break;
            case 13:
                ((RNDatePickerManagerInterface) this.mViewManager).setConfirmText(t5, obj != null ? (String) obj : null);
                break;
            case 14:
                ((RNDatePickerManagerInterface) this.mViewManager).setMinimumDate(t5, obj != null ? (String) obj : null);
                break;
            case 15:
                ((RNDatePickerManagerInterface) this.mViewManager).setMaximumDate(t5, obj != null ? (String) obj : null);
                break;
            case 16:
                ((RNDatePickerManagerInterface) this.mViewManager).setCancelText(t5, obj != null ? (String) obj : null);
                break;
            default:
                super.kotlinCompat$setProperty(t5, str, obj);
                break;
        }
    }
}
