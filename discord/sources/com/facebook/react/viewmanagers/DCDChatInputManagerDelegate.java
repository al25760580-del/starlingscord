package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.viewmanagers.DCDChatInputManagerInterface;

/* JADX INFO: loaded from: classes3.dex */
public class DCDChatInputManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & DCDChatInputManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public DCDChatInputManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* JADX INFO: renamed from: receiveCommand */
    public void kotlinCompat$receiveCommand(T t5, String str, ReadableArray readableArray) {
        str.getClass();
        switch (str) {
            case "setSelectedRange":
                ((DCDChatInputManagerInterface) this.mViewManager).setSelectedRange(t5, readableArray.getInt(0), readableArray.getInt(1));
                break;
            case "openSystemKeyboard":
                ((DCDChatInputManagerInterface) this.mViewManager).openSystemKeyboard(t5);
                break;
            case "flushText":
                ((DCDChatInputManagerInterface) this.mViewManager).flushText(t5, readableArray.getString(0));
                break;
            case "blur":
                ((DCDChatInputManagerInterface) this.mViewManager).blur(t5);
                break;
            case "updateTextBlocks":
                ((DCDChatInputManagerInterface) this.mViewManager).updateTextBlocks(t5, readableArray.getString(0), readableArray.getString(1));
                break;
            case "focus":
                ((DCDChatInputManagerInterface) this.mViewManager).focus(t5);
                break;
            case "replaceRange":
                ((DCDChatInputManagerInterface) this.mViewManager).replaceRange(t5, readableArray.getInt(0), readableArray.getInt(1), readableArray.getString(2), readableArray.getString(3), readableArray.getBoolean(4), readableArray.getString(5));
                break;
            case "backspace":
                ((DCDChatInputManagerInterface) this.mViewManager).backspace(t5);
                break;
            case "openCustomKeyboard":
                ((DCDChatInputManagerInterface) this.mViewManager).openCustomKeyboard(t5);
                break;
            case "closeCustomKeyboard":
                ((DCDChatInputManagerInterface) this.mViewManager).closeCustomKeyboard(t5);
                break;
            case "setText":
                ((DCDChatInputManagerInterface) this.mViewManager).setText(t5, readableArray.getString(0));
                break;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* JADX INFO: renamed from: setProperty */
    public void kotlinCompat$setProperty(T t5, String str, Object obj) {
        str.getClass();
        byte b10 = -1;
        switch (str.hashCode()) {
            case -1710287051:
                if (str.equals("markAsSpoilerTitle")) {
                    b10 = 0;
                }
                break;
            case -1576785488:
                if (str.equals("placeholderColor")) {
                    b10 = 1;
                }
                break;
            case -1187146042:
                if (str.equals("shouldShowCursor")) {
                    b10 = 2;
                }
                break;
            case -1132444857:
                if (str.equals("verticalInset")) {
                    b10 = 3;
                }
                break;
            case -1095204782:
                if (str.equals("setNoExtractUI")) {
                    b10 = 4;
                }
                break;
            case -1063571914:
                if (str.equals("textColor")) {
                    b10 = 5;
                }
                break;
            case -954624085:
                if (str.equals("keyboardAppearance")) {
                    b10 = 6;
                }
                break;
            case -906066005:
                if (str.equals(ViewProps.MAX_HEIGHT)) {
                    b10 = 7;
                }
                break;
            case 208939969:
                if (str.equals("keyboardType")) {
                    b10 = 8;
                }
                break;
            case 598246771:
                if (str.equals("placeholder")) {
                    b10 = 9;
                }
                break;
            case 1602416228:
                if (str.equals("editable")) {
                    b10 = 10;
                }
                break;
            case 2142299447:
                if (str.equals("selectionColor")) {
                    b10 = 11;
                }
                break;
        }
        switch (b10) {
            case 0:
                ((DCDChatInputManagerInterface) this.mViewManager).setMarkAsSpoilerTitle(t5, obj != null ? (String) obj : null);
                break;
            case 1:
                ((DCDChatInputManagerInterface) this.mViewManager).setPlaceholderColor(t5, ColorPropConverter.getColor(obj, t5.getContext()));
                break;
            case 2:
                ((DCDChatInputManagerInterface) this.mViewManager).setShouldShowCursor(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 3:
                ((DCDChatInputManagerInterface) this.mViewManager).setVerticalInset(t5, obj != null ? Float.valueOf(((Double) obj).floatValue()) : null);
                break;
            case 4:
                ((DCDChatInputManagerInterface) this.mViewManager).setSetNoExtractUI(t5, obj != null ? (Boolean) obj : null);
                break;
            case 5:
                ((DCDChatInputManagerInterface) this.mViewManager).setTextColor(t5, ColorPropConverter.getColor(obj, t5.getContext()));
                break;
            case 6:
                ((DCDChatInputManagerInterface) this.mViewManager).setKeyboardAppearance(t5, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 7:
                ((DCDChatInputManagerInterface) this.mViewManager).setMaxHeight(t5, obj != null ? Float.valueOf(((Double) obj).floatValue()) : null);
                break;
            case 8:
                ((DCDChatInputManagerInterface) this.mViewManager).setKeyboardType(t5, (String) obj);
                break;
            case 9:
                ((DCDChatInputManagerInterface) this.mViewManager).setPlaceholder(t5, obj != null ? (String) obj : null);
                break;
            case 10:
                ((DCDChatInputManagerInterface) this.mViewManager).setEditable(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 11:
                ((DCDChatInputManagerInterface) this.mViewManager).setSelectionColor(t5, ColorPropConverter.getColor(obj, t5.getContext()));
                break;
            default:
                super.kotlinCompat$setProperty(t5, str, obj);
                break;
        }
    }
}
