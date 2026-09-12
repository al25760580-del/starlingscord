package com.facebook.react.viewmanagers;

import android.view.View;
import com.discord.misc.utilities.chat_view_types.ChatViewRecyclerTypes;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface;

/* JADX INFO: loaded from: classes3.dex */
public class RNGestureHandlerButtonManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNGestureHandlerButtonManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNGestureHandlerButtonManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* JADX INFO: renamed from: setProperty */
    public void kotlinCompat$setProperty(T t5, String str, Object obj) {
        byte b10;
        str.getClass();
        switch (str) {
            case "rippleRadius":
                b10 = 0;
                break;
            case "borderRightColor":
                b10 = 1;
                break;
            case "borderRightWidth":
                b10 = 2;
                break;
            case "underlayColor":
                b10 = 3;
                break;
            case "enabled":
                b10 = 4;
                break;
            case "defaultUnderlayOpacity":
                b10 = 5;
                break;
            case "borderTopColor":
                b10 = 6;
                break;
            case "borderTopWidth":
                b10 = 7;
                break;
            case "borderBottomColor":
                b10 = 8;
                break;
            case "borderBottomWidth":
                b10 = 9;
                break;
            case "borderTopLeftRadius":
                b10 = 10;
                break;
            case "borderTopStartRadius":
                b10 = 11;
                break;
            case "activeScale":
                b10 = 12;
                break;
            case "borderBottomStartRadius":
                b10 = 13;
                break;
            case "rippleColor":
                b10 = 14;
                break;
            case "defaultScale":
                b10 = 15;
                break;
            case "hoverAnimationOutDuration":
                b10 = 16;
                break;
            case "borderTopEndRadius":
                b10 = 17;
                break;
            case "longPressDuration":
                b10 = 18;
                break;
            case "pointerEvents":
                b10 = 19;
                break;
            case "hoverAnimationInDuration":
                b10 = 20;
                break;
            case "borderLeftColor":
                b10 = 21;
                break;
            case "borderLeftWidth":
                b10 = 22;
                break;
            case "borderStartEndRadius":
                b10 = 23;
                break;
            case "borderBottomEndRadius":
                b10 = 24;
                break;
            case "hoverUnderlayOpacity":
                b10 = 25;
                break;
            case "borderStartStartRadius":
                b10 = 26;
                break;
            case "hoverScale":
                b10 = 27;
                break;
            case "borderBlockStartColor":
                b10 = 28;
                break;
            case "borderTopRightRadius":
                b10 = 29;
                break;
            case "overflow":
                b10 = 30;
                break;
            case "hoverOpacity":
                b10 = 31;
                break;
            case "tapAnimationOutDuration":
                b10 = 32;
                break;
            case "borderBottomLeftRadius":
                b10 = 33;
                break;
            case "borderBottomRightRadius":
                b10 = 34;
                break;
            case "longPressAnimationOutDuration":
                b10 = 35;
                break;
            case "borderBlockColor":
                b10 = 36;
                break;
            case "activeUnderlayOpacity":
                b10 = 37;
                break;
            case "borderColor":
                b10 = 38;
                break;
            case "defaultOpacity":
                b10 = 39;
                break;
            case "borderStyle":
                b10 = 40;
                break;
            case "borderWidth":
                b10 = 41;
                break;
            case "borderBlockEndColor":
                b10 = 42;
                break;
            case "borderEndStartRadius":
                b10 = 43;
                break;
            case "borderEndColor":
                b10 = 44;
                break;
            case "borderEndWidth":
                b10 = 45;
                break;
            case "borderRadius":
                b10 = 46;
                break;
            case "touchSoundDisabled":
                b10 = 47;
                break;
            case "tapAnimationInDuration":
                b10 = 48;
                break;
            case "needsOffscreenAlphaCompositing":
                b10 = 49;
                break;
            case "exclusive":
                b10 = 50;
                break;
            case "borderEndEndRadius":
                b10 = 51;
                break;
            case "borderless":
                b10 = 52;
                break;
            case "activeOpacity":
                b10 = 53;
                break;
            case "foreground":
                b10 = 54;
                break;
            case "borderStartColor":
                b10 = 55;
                break;
            case "borderStartWidth":
                b10 = 56;
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                ((RNGestureHandlerButtonManagerInterface) this.mViewManager).setRippleRadius(t5, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 1:
                ((RNGestureHandlerButtonManagerInterface) this.mViewManager).setBorderRightColor(t5, ColorPropConverter.getColor(obj, t5.getContext()));
                break;
            case 2:
                ((RNGestureHandlerButtonManagerInterface) this.mViewManager).setBorderRightWidth(t5, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 3:
                ((RNGestureHandlerButtonManagerInterface) this.mViewManager).setUnderlayColor(t5, ColorPropConverter.getColor(obj, t5.getContext()));
                break;
            case 4:
                ((RNGestureHandlerButtonManagerInterface) this.mViewManager).setEnabled(t5, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case 5:
                ((RNGestureHandlerButtonManagerInterface) this.mViewManager).setDefaultUnderlayOpacity(t5, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 6:
                ((RNGestureHandlerButtonManagerInterface) this.mViewManager).setBorderTopColor(t5, ColorPropConverter.getColor(obj, t5.getContext()));
                break;
            case 7:
                ((RNGestureHandlerButtonManagerInterface) this.mViewManager).setBorderTopWidth(t5, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 8:
                ((RNGestureHandlerButtonManagerInterface) this.mViewManager).setBorderBottomColor(t5, ColorPropConverter.getColor(obj, t5.getContext()));
                break;
            case 9:
                ((RNGestureHandlerButtonManagerInterface) this.mViewManager).setBorderBottomWidth(t5, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 10:
                ((RNGestureHandlerButtonManagerInterface) this.mViewManager).setBorderTopLeftRadius(t5, new DynamicFromObject(obj));
                break;
            case 11:
                ((RNGestureHandlerButtonManagerInterface) this.mViewManager).setBorderTopStartRadius(t5, new DynamicFromObject(obj));
                break;
            case 12:
                ((RNGestureHandlerButtonManagerInterface) this.mViewManager).setActiveScale(t5, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case 13:
                ((RNGestureHandlerButtonManagerInterface) this.mViewManager).setBorderBottomStartRadius(t5, new DynamicFromObject(obj));
                break;
            case 14:
                ((RNGestureHandlerButtonManagerInterface) this.mViewManager).setRippleColor(t5, ColorPropConverter.getColor(obj, t5.getContext()));
                break;
            case 15:
                ((RNGestureHandlerButtonManagerInterface) this.mViewManager).setDefaultScale(t5, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case 16:
                ((RNGestureHandlerButtonManagerInterface) this.mViewManager).setHoverAnimationOutDuration(t5, obj != null ? ((Double) obj).intValue() : 100);
                break;
            case 17:
                ((RNGestureHandlerButtonManagerInterface) this.mViewManager).setBorderTopEndRadius(t5, new DynamicFromObject(obj));
                break;
            case 18:
                ((RNGestureHandlerButtonManagerInterface) this.mViewManager).setLongPressDuration(t5, obj != null ? ((Double) obj).intValue() : -1);
                break;
            case 19:
                ((RNGestureHandlerButtonManagerInterface) this.mViewManager).setPointerEvents(t5, (String) obj);
                break;
            case 20:
                ((RNGestureHandlerButtonManagerInterface) this.mViewManager).setHoverAnimationInDuration(t5, obj != null ? ((Double) obj).intValue() : 50);
                break;
            case 21:
                ((RNGestureHandlerButtonManagerInterface) this.mViewManager).setBorderLeftColor(t5, ColorPropConverter.getColor(obj, t5.getContext()));
                break;
            case 22:
                ((RNGestureHandlerButtonManagerInterface) this.mViewManager).setBorderLeftWidth(t5, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 23:
                ((RNGestureHandlerButtonManagerInterface) this.mViewManager).setBorderStartEndRadius(t5, new DynamicFromObject(obj));
                break;
            case 24:
                ((RNGestureHandlerButtonManagerInterface) this.mViewManager).setBorderBottomEndRadius(t5, new DynamicFromObject(obj));
                break;
            case 25:
                ((RNGestureHandlerButtonManagerInterface) this.mViewManager).setHoverUnderlayOpacity(t5, obj != null ? ((Double) obj).floatValue() : -1.0f);
                break;
            case 26:
                ((RNGestureHandlerButtonManagerInterface) this.mViewManager).setBorderStartStartRadius(t5, new DynamicFromObject(obj));
                break;
            case 27:
                ((RNGestureHandlerButtonManagerInterface) this.mViewManager).setHoverScale(t5, obj != null ? ((Double) obj).floatValue() : -1.0f);
                break;
            case 28:
                ((RNGestureHandlerButtonManagerInterface) this.mViewManager).setBorderBlockStartColor(t5, ColorPropConverter.getColor(obj, t5.getContext()));
                break;
            case 29:
                ((RNGestureHandlerButtonManagerInterface) this.mViewManager).setBorderTopRightRadius(t5, new DynamicFromObject(obj));
                break;
            case 30:
                ((RNGestureHandlerButtonManagerInterface) this.mViewManager).setOverflow(t5, obj == null ? ViewProps.VISIBLE : (String) obj);
                break;
            case 31:
                ((RNGestureHandlerButtonManagerInterface) this.mViewManager).setHoverOpacity(t5, obj != null ? ((Double) obj).floatValue() : -1.0f);
                break;
            case 32:
                ((RNGestureHandlerButtonManagerInterface) this.mViewManager).setTapAnimationOutDuration(t5, obj != null ? ((Double) obj).intValue() : 100);
                break;
            case 33:
                ((RNGestureHandlerButtonManagerInterface) this.mViewManager).setBorderBottomLeftRadius(t5, new DynamicFromObject(obj));
                break;
            case 34:
                ((RNGestureHandlerButtonManagerInterface) this.mViewManager).setBorderBottomRightRadius(t5, new DynamicFromObject(obj));
                break;
            case 35:
                ((RNGestureHandlerButtonManagerInterface) this.mViewManager).setLongPressAnimationOutDuration(t5, obj != null ? ((Double) obj).intValue() : -1);
                break;
            case 36:
                ((RNGestureHandlerButtonManagerInterface) this.mViewManager).setBorderBlockColor(t5, ColorPropConverter.getColor(obj, t5.getContext()));
                break;
            case ChatViewRecyclerTypes.POLL_TEXT_AND_IMAGE /* 37 */:
                ((RNGestureHandlerButtonManagerInterface) this.mViewManager).setActiveUnderlayOpacity(t5, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case ChatViewRecyclerTypes.POLL_IMAGE_ONLY /* 38 */:
                ((RNGestureHandlerButtonManagerInterface) this.mViewManager).setBorderColor(t5, ColorPropConverter.getColor(obj, t5.getContext()));
                break;
            case ChatViewRecyclerTypes.SAFETY_SYSTEM_NOTIFICATION /* 39 */:
                ((RNGestureHandlerButtonManagerInterface) this.mViewManager).setDefaultOpacity(t5, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case 40:
                ((RNGestureHandlerButtonManagerInterface) this.mViewManager).setBorderStyle(t5, obj == null ? "solid" : (String) obj);
                break;
            case 41:
                ((RNGestureHandlerButtonManagerInterface) this.mViewManager).setBorderWidth(t5, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 42:
                ((RNGestureHandlerButtonManagerInterface) this.mViewManager).setBorderBlockEndColor(t5, ColorPropConverter.getColor(obj, t5.getContext()));
                break;
            case ChatViewRecyclerTypes.FORWARD_HEADER /* 43 */:
                ((RNGestureHandlerButtonManagerInterface) this.mViewManager).setBorderEndStartRadius(t5, new DynamicFromObject(obj));
                break;
            case ChatViewRecyclerTypes.FORWARD_BREADCRUMB /* 44 */:
                ((RNGestureHandlerButtonManagerInterface) this.mViewManager).setBorderEndColor(t5, ColorPropConverter.getColor(obj, t5.getContext()));
                break;
            case ChatViewRecyclerTypes.REACTION_BURST_REACTION /* 45 */:
                ((RNGestureHandlerButtonManagerInterface) this.mViewManager).setBorderEndWidth(t5, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 46:
                ((RNGestureHandlerButtonManagerInterface) this.mViewManager).setBorderRadius(t5, new DynamicFromObject(obj));
                break;
            case ChatViewRecyclerTypes.REACTION_ADD_REACTION /* 47 */:
                ((RNGestureHandlerButtonManagerInterface) this.mViewManager).setTouchSoundDisabled(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 48:
                ((RNGestureHandlerButtonManagerInterface) this.mViewManager).setTapAnimationInDuration(t5, obj != null ? ((Double) obj).intValue() : 50);
                break;
            case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_IMAGE /* 49 */:
                ((RNGestureHandlerButtonManagerInterface) this.mViewManager).setNeedsOffscreenAlphaCompositing(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 50:
                ((RNGestureHandlerButtonManagerInterface) this.mViewManager).setExclusive(t5, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_VISUAL_PLACEHOLDER /* 51 */:
                ((RNGestureHandlerButtonManagerInterface) this.mViewManager).setBorderEndEndRadius(t5, new DynamicFromObject(obj));
                break;
            case ChatViewRecyclerTypes.REFERRAL /* 52 */:
                ((RNGestureHandlerButtonManagerInterface) this.mViewManager).setBorderless(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case ChatViewRecyclerTypes.GUILD_PROFILE_INVITE /* 53 */:
                ((RNGestureHandlerButtonManagerInterface) this.mViewManager).setActiveOpacity(t5, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case ChatViewRecyclerTypes.APP_MESSAGE_EMBED /* 54 */:
                ((RNGestureHandlerButtonManagerInterface) this.mViewManager).setForeground(t5, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case ChatViewRecyclerTypes.ACTIVITY_RICH_PRESENCE_INVITE_EMBED /* 55 */:
                ((RNGestureHandlerButtonManagerInterface) this.mViewManager).setBorderStartColor(t5, ColorPropConverter.getColor(obj, t5.getContext()));
                break;
            case ChatViewRecyclerTypes.SHARED_CUSTOM_THEME_EMBED /* 56 */:
                ((RNGestureHandlerButtonManagerInterface) this.mViewManager).setBorderStartWidth(t5, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            default:
                super.kotlinCompat$setProperty(t5, str, obj);
                break;
        }
    }
}
