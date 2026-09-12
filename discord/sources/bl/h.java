package bl;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.uimanager.BackgroundStyleApplicator;
import com.facebook.react.uimanager.LengthPercentage;
import com.facebook.react.uimanager.style.BorderRadiusProp;
import com.facebook.react.uimanager.style.BorderStyle;
import com.facebook.react.uimanager.style.LogicalEdge;
import com.facebook.react.viewmanagers.RNPlainTextManagerDelegate;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends RNPlainTextManagerDelegate {
    public static void a(e eVar, LogicalEdge logicalEdge, Object obj) {
        BackgroundStyleApplicator.setBorderColor(eVar, logicalEdge, ColorPropConverter.getColor(obj, eVar.getContext()));
    }

    public static void b(e eVar, BorderRadiusProp borderRadiusProp, Object obj) {
        BackgroundStyleApplicator.setBorderRadius(eVar, borderRadiusProp, obj == null ? null : LengthPercentage.setFromDynamic(new DynamicFromObject(obj), false));
    }

    public static void c(e eVar, LogicalEdge logicalEdge, Object obj) {
        BackgroundStyleApplicator.setBorderWidth(eVar, logicalEdge, obj == null ? null : Float.valueOf(((Double) obj).floatValue()));
    }

    @Override // com.facebook.react.viewmanagers.RNPlainTextManagerDelegate, com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* JADX INFO: renamed from: setProperty */
    public final void kotlinCompat$setProperty(View view, String str, Object obj) {
        e eVar = (e) view;
        if (str.startsWith("border")) {
            switch (str) {
                case "borderRightColor":
                    a(eVar, LogicalEdge.RIGHT, obj);
                    break;
                case "borderRightWidth":
                    c(eVar, LogicalEdge.RIGHT, obj);
                    break;
                case "borderTopColor":
                    a(eVar, LogicalEdge.TOP, obj);
                    break;
                case "borderTopWidth":
                    c(eVar, LogicalEdge.TOP, obj);
                    break;
                case "borderBottomColor":
                    a(eVar, LogicalEdge.BOTTOM, obj);
                    break;
                case "borderBottomWidth":
                    c(eVar, LogicalEdge.BOTTOM, obj);
                    break;
                case "borderTopLeftRadius":
                    b(eVar, BorderRadiusProp.BORDER_TOP_LEFT_RADIUS, obj);
                    break;
                case "borderTopStartRadius":
                    b(eVar, BorderRadiusProp.BORDER_TOP_START_RADIUS, obj);
                    break;
                case "borderBottomStartRadius":
                    b(eVar, BorderRadiusProp.BORDER_BOTTOM_START_RADIUS, obj);
                    break;
                case "borderTopEndRadius":
                    b(eVar, BorderRadiusProp.BORDER_TOP_END_RADIUS, obj);
                    break;
                case "borderLeftColor":
                    a(eVar, LogicalEdge.LEFT, obj);
                    break;
                case "borderLeftWidth":
                    c(eVar, LogicalEdge.LEFT, obj);
                    break;
                case "borderStartEndRadius":
                    b(eVar, BorderRadiusProp.BORDER_START_END_RADIUS, obj);
                    break;
                case "borderBottomEndRadius":
                    b(eVar, BorderRadiusProp.BORDER_BOTTOM_END_RADIUS, obj);
                    break;
                case "borderStartStartRadius":
                    b(eVar, BorderRadiusProp.BORDER_START_START_RADIUS, obj);
                    break;
                case "borderBlockStartColor":
                    a(eVar, LogicalEdge.BLOCK_START, obj);
                    break;
                case "borderTopRightRadius":
                    b(eVar, BorderRadiusProp.BORDER_TOP_RIGHT_RADIUS, obj);
                    break;
                case "borderBottomLeftRadius":
                    b(eVar, BorderRadiusProp.BORDER_BOTTOM_LEFT_RADIUS, obj);
                    break;
                case "borderBottomRightRadius":
                    b(eVar, BorderRadiusProp.BORDER_BOTTOM_RIGHT_RADIUS, obj);
                    break;
                case "borderBlockColor":
                    a(eVar, LogicalEdge.BLOCK, obj);
                    break;
                case "borderColor":
                    a(eVar, LogicalEdge.ALL, obj);
                    break;
                case "borderStyle":
                    BackgroundStyleApplicator.setBorderStyle(eVar, obj == null ? null : BorderStyle.fromString((String) obj));
                    break;
                case "borderWidth":
                    c(eVar, LogicalEdge.ALL, obj);
                    break;
                case "borderBlockEndColor":
                    a(eVar, LogicalEdge.BLOCK_END, obj);
                    break;
                case "borderEndStartRadius":
                    b(eVar, BorderRadiusProp.BORDER_END_START_RADIUS, obj);
                    break;
                case "borderEndColor":
                    a(eVar, LogicalEdge.END, obj);
                    break;
                case "borderEndWidth":
                    c(eVar, LogicalEdge.END, obj);
                    break;
                case "borderRadius":
                    b(eVar, BorderRadiusProp.BORDER_RADIUS, obj);
                    break;
                case "borderEndEndRadius":
                    b(eVar, BorderRadiusProp.BORDER_END_END_RADIUS, obj);
                    break;
                case "borderStartColor":
                    a(eVar, LogicalEdge.START, obj);
                    break;
                case "borderStartWidth":
                    c(eVar, LogicalEdge.START, obj);
                    break;
            }
            return;
        }
        super.kotlinCompat$setProperty(eVar, str, obj);
    }
}
