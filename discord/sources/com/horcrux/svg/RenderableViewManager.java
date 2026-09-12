package com.horcrux.svg;

import android.graphics.Matrix;
import android.graphics.Path;
import android.net.Uri;
import android.view.View;
import com.discord.jank_stats.JankStatsAggregatorKt;
import com.discord.span.utilities.spannable.BulletSpan;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.RNSVGCircleManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGCircleManagerInterface;
import com.facebook.react.viewmanagers.RNSVGClipPathManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface;
import com.facebook.react.viewmanagers.RNSVGDefsManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGDefsManagerInterface;
import com.facebook.react.viewmanagers.RNSVGEllipseManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface;
import com.facebook.react.viewmanagers.RNSVGFeBlendManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGFeBlendManagerInterface;
import com.facebook.react.viewmanagers.RNSVGFeColorMatrixManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGFeColorMatrixManagerInterface;
import com.facebook.react.viewmanagers.RNSVGFeCompositeManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGFeCompositeManagerInterface;
import com.facebook.react.viewmanagers.RNSVGFeFloodManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGFeFloodManagerInterface;
import com.facebook.react.viewmanagers.RNSVGFeGaussianBlurManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGFeGaussianBlurManagerInterface;
import com.facebook.react.viewmanagers.RNSVGFeMergeManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGFeMergeManagerInterface;
import com.facebook.react.viewmanagers.RNSVGFeOffsetManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGFeOffsetManagerInterface;
import com.facebook.react.viewmanagers.RNSVGFilterManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGFilterManagerInterface;
import com.facebook.react.viewmanagers.RNSVGForeignObjectManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface;
import com.facebook.react.viewmanagers.RNSVGGroupManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGGroupManagerInterface;
import com.facebook.react.viewmanagers.RNSVGImageManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGImageManagerInterface;
import com.facebook.react.viewmanagers.RNSVGLineManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGLineManagerInterface;
import com.facebook.react.viewmanagers.RNSVGLinearGradientManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGLinearGradientManagerInterface;
import com.facebook.react.viewmanagers.RNSVGMarkerManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface;
import com.facebook.react.viewmanagers.RNSVGMaskManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGMaskManagerInterface;
import com.facebook.react.viewmanagers.RNSVGPathManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGPathManagerInterface;
import com.facebook.react.viewmanagers.RNSVGPatternManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGPatternManagerInterface;
import com.facebook.react.viewmanagers.RNSVGRadialGradientManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface;
import com.facebook.react.viewmanagers.RNSVGRectManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGRectManagerInterface;
import com.facebook.react.viewmanagers.RNSVGSymbolManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface;
import com.facebook.react.viewmanagers.RNSVGTSpanManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface;
import com.facebook.react.viewmanagers.RNSVGTextManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGTextManagerInterface;
import com.facebook.react.viewmanagers.RNSVGTextPathManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface;
import com.facebook.react.viewmanagers.RNSVGUseManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGUseManagerInterface;
import com.facebook.react.views.imagehelper.ResourceDrawableIdHelper;
import com.horcrux.svg.RenderableView;
import com.horcrux.svg.events.SvgLoadEvent;
import com.horcrux.svg.events.SvgOnLayoutEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;

/* JADX INFO: loaded from: classes3.dex */
class RenderableViewManager<T extends RenderableView> extends VirtualViewManager<T> {

    public static class CircleViewManager extends RenderableViewManager<b> implements RNSVGCircleManagerInterface<b> {
        public static final String REACT_CLASS = "RNSVGCircle";

        public CircleViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGCircle);
            ((VirtualViewManager) this).mDelegate = new RNSVGCircleManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i7) {
            super.setClipRule((VirtualView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(customType = "Color", name = ViewProps.COLOR)
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((RenderableView) view, num);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(name = ViewProps.DISPLAY)
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            super.setFill((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(defaultFloat = JankStatsAggregatorKt.DEFAULT_JANK_MULTIPLIER, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f2) {
            super.setFillOpacity((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i7) {
            super.setFillRule((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(name = ViewProps.FILTER)
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(name = StackTraceHelper.NAME_KEY)
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @ReactProp(defaultFloat = JankStatsAggregatorKt.DEFAULT_JANK_MULTIPLIER, name = ViewProps.OPACITY)
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f2) {
            super.setOpacity((VirtualView) view, f2);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(name = ViewProps.POINTER_EVENTS)
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z5) {
            super.setResponsible((VirtualView) view, z5);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            super.setStroke((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f2) {
            super.setStrokeDashoffset((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i7) {
            super.setStrokeLinecap((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i7) {
            super.setStrokeLinejoin((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(defaultFloat = BulletSpan.STANDARD_STROKE_WIDTH_PX, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f2) {
            super.setStrokeMiterlimit((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(defaultFloat = JankStatsAggregatorKt.DEFAULT_JANK_MULTIPLIER, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f2) {
            super.setStrokeOpacity((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i7) {
            super.setVectorEffect((RenderableView) view, i7);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(name = "cx")
        public void setCx(b bVar, Dynamic dynamic) {
            bVar.getClass();
            bVar.f6668d = r0.b(dynamic);
            bVar.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(name = "cy")
        public void setCy(b bVar, Dynamic dynamic) {
            bVar.getClass();
            bVar.f6669e = r0.b(dynamic);
            bVar.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(name = "r")
        public void setR(b bVar, Dynamic dynamic) {
            bVar.getClass();
            bVar.f6670i = r0.b(dynamic);
            bVar.invalidate();
        }
    }

    public static class ClipPathViewManager extends GroupViewManagerAbstract<c> implements RNSVGClipPathManagerInterface<c> {
        public static final String REACT_CLASS = "RNSVGClipPath";

        public ClipPathViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGClipPath);
            ((VirtualViewManager) this).mDelegate = new RNSVGClipPathManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i7) {
            super.setClipRule((VirtualView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(customType = "Color", name = ViewProps.COLOR)
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((RenderableView) view, num);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(name = ViewProps.DISPLAY)
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            super.setFill((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(defaultFloat = JankStatsAggregatorKt.DEFAULT_JANK_MULTIPLIER, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f2) {
            super.setFillOpacity((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i7) {
            super.setFillRule((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(name = ViewProps.FILTER)
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(name = "font")
        public /* bridge */ /* synthetic */ void setFont(View view, Dynamic dynamic) {
            super.setFont((a0) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(name = ViewProps.FONT_SIZE)
        public /* bridge */ /* synthetic */ void setFontSize(View view, Dynamic dynamic) {
            super.setFontSize((a0) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(name = ViewProps.FONT_WEIGHT)
        public /* bridge */ /* synthetic */ void setFontWeight(View view, Dynamic dynamic) {
            super.setFontWeight((a0) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(name = StackTraceHelper.NAME_KEY)
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @ReactProp(defaultFloat = JankStatsAggregatorKt.DEFAULT_JANK_MULTIPLIER, name = ViewProps.OPACITY)
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f2) {
            super.setOpacity((VirtualView) view, f2);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(name = ViewProps.POINTER_EVENTS)
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z5) {
            super.setResponsible((VirtualView) view, z5);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            super.setStroke((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f2) {
            super.setStrokeDashoffset((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i7) {
            super.setStrokeLinecap((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i7) {
            super.setStrokeLinejoin((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(defaultFloat = BulletSpan.STANDARD_STROKE_WIDTH_PX, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f2) {
            super.setStrokeMiterlimit((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(defaultFloat = JankStatsAggregatorKt.DEFAULT_JANK_MULTIPLIER, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f2) {
            super.setStrokeOpacity((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i7) {
            super.setVectorEffect((RenderableView) view, i7);
        }
    }

    public static class DefsViewManager extends VirtualViewManager<f> implements RNSVGDefsManagerInterface<f> {
        public static final String REACT_CLASS = "RNSVGDefs";

        public DefsViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGDefs);
            ((VirtualViewManager) this).mDelegate = new RNSVGDefsManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGDefsManagerInterface
        @ReactProp(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGDefsManagerInterface
        @ReactProp(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i7) {
            super.setClipRule((VirtualView) view, i7);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGDefsManagerInterface
        @ReactProp(name = ViewProps.DISPLAY)
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGDefsManagerInterface
        @ReactProp(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGDefsManagerInterface
        @ReactProp(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGDefsManagerInterface
        @ReactProp(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGDefsManagerInterface
        @ReactProp(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGDefsManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGDefsManagerInterface
        @ReactProp(name = StackTraceHelper.NAME_KEY)
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @ReactProp(defaultFloat = JankStatsAggregatorKt.DEFAULT_JANK_MULTIPLIER, name = ViewProps.OPACITY)
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f2) {
            super.setOpacity((VirtualView) view, f2);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGDefsManagerInterface
        @ReactProp(name = ViewProps.POINTER_EVENTS)
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGDefsManagerInterface
        @ReactProp(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z5) {
            super.setResponsible((VirtualView) view, z5);
        }
    }

    public static class EllipseViewManager extends RenderableViewManager<g> implements RNSVGEllipseManagerInterface<g> {
        public static final String REACT_CLASS = "RNSVGEllipse";

        public EllipseViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGEllipse);
            ((VirtualViewManager) this).mDelegate = new RNSVGEllipseManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i7) {
            super.setClipRule((VirtualView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(customType = "Color", name = ViewProps.COLOR)
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((RenderableView) view, num);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(name = ViewProps.DISPLAY)
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            super.setFill((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(defaultFloat = JankStatsAggregatorKt.DEFAULT_JANK_MULTIPLIER, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f2) {
            super.setFillOpacity((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i7) {
            super.setFillRule((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(name = ViewProps.FILTER)
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(name = StackTraceHelper.NAME_KEY)
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @ReactProp(defaultFloat = JankStatsAggregatorKt.DEFAULT_JANK_MULTIPLIER, name = ViewProps.OPACITY)
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f2) {
            super.setOpacity((VirtualView) view, f2);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(name = ViewProps.POINTER_EVENTS)
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z5) {
            super.setResponsible((VirtualView) view, z5);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            super.setStroke((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f2) {
            super.setStrokeDashoffset((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i7) {
            super.setStrokeLinecap((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i7) {
            super.setStrokeLinejoin((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(defaultFloat = BulletSpan.STANDARD_STROKE_WIDTH_PX, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f2) {
            super.setStrokeMiterlimit((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(defaultFloat = JankStatsAggregatorKt.DEFAULT_JANK_MULTIPLIER, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f2) {
            super.setStrokeOpacity((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i7) {
            super.setVectorEffect((RenderableView) view, i7);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(name = "cx")
        public void setCx(g gVar, Dynamic dynamic) {
            gVar.getClass();
            gVar.f6711d = r0.b(dynamic);
            gVar.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(name = "cy")
        public void setCy(g gVar, Dynamic dynamic) {
            gVar.getClass();
            gVar.f6712e = r0.b(dynamic);
            gVar.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(name = "rx")
        public void setRx(g gVar, Dynamic dynamic) {
            gVar.getClass();
            gVar.f6713i = r0.b(dynamic);
            gVar.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(name = "ry")
        public void setRy(g gVar, Dynamic dynamic) {
            gVar.getClass();
            gVar.f6714v = r0.b(dynamic);
            gVar.invalidate();
        }
    }

    public static class FeBlendManager extends FilterPrimitiveManager<h> implements RNSVGFeBlendManagerInterface<h> {
        public static final String REACT_CLASS = "RNSVGFeBlend";

        public FeBlendManager() {
            super(VirtualViewManager.SVGClass.RNSVGFeBlend);
            ((VirtualViewManager) this).mDelegate = new RNSVGFeBlendManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeBlendManagerInterface
        @ReactProp(name = "height")
        public /* bridge */ /* synthetic */ void setHeight(View view, Dynamic dynamic) {
            super.setHeight((o) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeBlendManagerInterface
        @ReactProp(name = "in1")
        public void setIn1(h hVar, String str) {
            hVar.f6722i = str;
            hVar.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeBlendManagerInterface
        @ReactProp(name = "in2")
        public void setIn2(h hVar, String str) {
            hVar.f6723v = str;
            hVar.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeBlendManagerInterface
        @ReactProp(name = "result")
        public /* bridge */ /* synthetic */ void setResult(View view, String str) {
            super.setResult((o) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeBlendManagerInterface
        @ReactProp(name = "width")
        public /* bridge */ /* synthetic */ void setWidth(View view, Dynamic dynamic) {
            super.setWidth((o) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeBlendManagerInterface
        @ReactProp(name = "x")
        public /* bridge */ /* synthetic */ void setX(View view, Dynamic dynamic) {
            super.setX((o) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeBlendManagerInterface
        @ReactProp(name = "y")
        public /* bridge */ /* synthetic */ void setY(View view, Dynamic dynamic) {
            super.setY((o) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeBlendManagerInterface
        @ReactProp(name = "mode")
        public void setMode(h hVar, String str) {
            hVar.getClass();
            HashMap map = q.f6782i;
            if (!map.containsKey(str)) {
                throw new IllegalArgumentException(a3.e.l("Unknown String Value: ", str));
            }
            hVar.f6724w = (q) map.get(str);
            hVar.invalidate();
        }
    }

    public static class FeColorMatrixManager extends FilterPrimitiveManager<i> implements RNSVGFeColorMatrixManagerInterface<i> {
        public static final String REACT_CLASS = "RNSVGFeColorMatrix";

        public FeColorMatrixManager() {
            super(VirtualViewManager.SVGClass.RNSVGFeColorMatrix);
            ((VirtualViewManager) this).mDelegate = new RNSVGFeColorMatrixManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeColorMatrixManagerInterface
        @ReactProp(name = "height")
        public /* bridge */ /* synthetic */ void setHeight(View view, Dynamic dynamic) {
            super.setHeight((o) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeColorMatrixManagerInterface
        @ReactProp(name = "in1")
        public void setIn1(i iVar, String str) {
            iVar.f6728i = str;
            iVar.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeColorMatrixManagerInterface
        @ReactProp(name = "result")
        public /* bridge */ /* synthetic */ void setResult(View view, String str) {
            super.setResult((o) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeColorMatrixManagerInterface
        @ReactProp(name = "values")
        public void setValues(i iVar, ReadableArray readableArray) {
            iVar.f6730w = readableArray;
            iVar.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeColorMatrixManagerInterface
        @ReactProp(name = "width")
        public /* bridge */ /* synthetic */ void setWidth(View view, Dynamic dynamic) {
            super.setWidth((o) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeColorMatrixManagerInterface
        @ReactProp(name = "x")
        public /* bridge */ /* synthetic */ void setX(View view, Dynamic dynamic) {
            super.setX((o) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeColorMatrixManagerInterface
        @ReactProp(name = "y")
        public /* bridge */ /* synthetic */ void setY(View view, Dynamic dynamic) {
            super.setY((o) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeColorMatrixManagerInterface
        @ReactProp(name = "type")
        public void setType(i iVar, String str) {
            iVar.getClass();
            HashMap map = s.f6788e;
            if (!map.containsKey(str)) {
                throw new IllegalArgumentException(a3.e.l("Unknown String Value: ", str));
            }
            iVar.f6729v = (s) map.get(str);
            iVar.invalidate();
        }
    }

    public static class FeCompositeManager extends FilterPrimitiveManager<j> implements RNSVGFeCompositeManagerInterface<j> {
        public static final String REACT_CLASS = "RNSVGFeComposite";

        public FeCompositeManager() {
            super(VirtualViewManager.SVGClass.RNSVGFeComposite);
            ((VirtualViewManager) this).mDelegate = new RNSVGFeCompositeManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeCompositeManagerInterface
        @ReactProp(name = "height")
        public /* bridge */ /* synthetic */ void setHeight(View view, Dynamic dynamic) {
            super.setHeight((o) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeCompositeManagerInterface
        @ReactProp(name = "in1")
        public void setIn1(j jVar, String str) {
            jVar.f6733i = str;
            jVar.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeCompositeManagerInterface
        @ReactProp(name = "in2")
        public void setIn2(j jVar, String str) {
            jVar.f6734v = str;
            jVar.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeCompositeManagerInterface
        @ReactProp(name = "result")
        public /* bridge */ /* synthetic */ void setResult(View view, String str) {
            super.setResult((o) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeCompositeManagerInterface
        @ReactProp(name = "width")
        public /* bridge */ /* synthetic */ void setWidth(View view, Dynamic dynamic) {
            super.setWidth((o) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeCompositeManagerInterface
        @ReactProp(name = "x")
        public /* bridge */ /* synthetic */ void setX(View view, Dynamic dynamic) {
            super.setX((o) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeCompositeManagerInterface
        @ReactProp(name = "y")
        public /* bridge */ /* synthetic */ void setY(View view, Dynamic dynamic) {
            super.setY((o) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeCompositeManagerInterface
        @ReactProp(name = "k1")
        public void setK1(j jVar, float f2) {
            jVar.getClass();
            jVar.f6735w = f2;
            jVar.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeCompositeManagerInterface
        @ReactProp(name = "k2")
        public void setK2(j jVar, float f2) {
            jVar.getClass();
            jVar.f6736x = f2;
            jVar.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeCompositeManagerInterface
        @ReactProp(name = "k3")
        public void setK3(j jVar, float f2) {
            jVar.getClass();
            jVar.f6737y = f2;
            jVar.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeCompositeManagerInterface
        @ReactProp(name = "k4")
        public void setK4(j jVar, float f2) {
            jVar.getClass();
            jVar.E = f2;
            jVar.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeCompositeManagerInterface
        @ReactProp(name = "operator1")
        public void setOperator1(j jVar, String str) {
            jVar.getClass();
            HashMap map = t.f6792i;
            if (!map.containsKey(str)) {
                throw new IllegalArgumentException(a3.e.l("Unknown String Value: ", str));
            }
            jVar.F = (t) map.get(str);
            jVar.invalidate();
        }
    }

    public static class FeFloodManager extends FilterPrimitiveManager<k> implements RNSVGFeFloodManagerInterface<k> {
        public static final String REACT_CLASS = "RNSVGFeFlood";

        public FeFloodManager() {
            super(VirtualViewManager.SVGClass.RNSVGFeFlood);
            ((VirtualViewManager) this).mDelegate = new RNSVGFeFloodManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeFloodManagerInterface
        @ReactProp(defaultFloat = JankStatsAggregatorKt.DEFAULT_JANK_MULTIPLIER, name = "floodOpacity")
        public void setFloodOpacity(k kVar, float f2) {
            kVar.f6742v = f2;
            kVar.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeFloodManagerInterface
        @ReactProp(name = "height")
        public /* bridge */ /* synthetic */ void setHeight(View view, Dynamic dynamic) {
            super.setHeight((o) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeFloodManagerInterface
        @ReactProp(name = "result")
        public /* bridge */ /* synthetic */ void setResult(View view, String str) {
            super.setResult((o) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeFloodManagerInterface
        @ReactProp(name = "width")
        public /* bridge */ /* synthetic */ void setWidth(View view, Dynamic dynamic) {
            super.setWidth((o) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeFloodManagerInterface
        @ReactProp(name = "x")
        public /* bridge */ /* synthetic */ void setX(View view, Dynamic dynamic) {
            super.setX((o) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeFloodManagerInterface
        @ReactProp(name = "y")
        public /* bridge */ /* synthetic */ void setY(View view, Dynamic dynamic) {
            super.setY((o) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeFloodManagerInterface
        @ReactProp(name = "floodColor")
        public void setFloodColor(k kVar, Dynamic dynamic) {
            if (dynamic != null) {
                kVar.getClass();
                if (!dynamic.isNull()) {
                    if (dynamic.getType().equals(ReadableType.Map)) {
                        kVar.e(dynamic.asMap());
                        return;
                    }
                    ReadableType type = dynamic.getType();
                    int i7 = 0;
                    if (type.equals(ReadableType.Number)) {
                        kVar.f6741i = JavaOnlyArray.of(0, Integer.valueOf(dynamic.asInt()));
                    } else if (type.equals(ReadableType.Array)) {
                        kVar.f6741i = dynamic.asArray();
                    } else {
                        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
                        javaOnlyArray.pushInt(0);
                        Matcher matcher = k.f6740w.matcher(dynamic.asString());
                        while (matcher.find()) {
                            double d6 = Double.parseDouble(matcher.group());
                            int i10 = i7 + 1;
                            if (i7 < 3) {
                                d6 /= 255.0d;
                            }
                            javaOnlyArray.pushDouble(d6);
                            i7 = i10;
                        }
                        kVar.f6741i = javaOnlyArray;
                    }
                    kVar.invalidate();
                    return;
                }
            }
            kVar.f6741i = null;
            kVar.invalidate();
        }

        public void setFloodColor(k kVar, ReadableMap readableMap) {
            kVar.e(readableMap);
        }
    }

    public static class FeGaussianBlurManager extends FilterPrimitiveManager<l> implements RNSVGFeGaussianBlurManagerInterface<l> {
        public static final String REACT_CLASS = "RNSVGFeGaussianBlur";

        public FeGaussianBlurManager() {
            super(VirtualViewManager.SVGClass.RNSVGFeGaussianBlur);
            ((VirtualViewManager) this).mDelegate = new RNSVGFeGaussianBlurManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeGaussianBlurManagerInterface
        @ReactProp(name = "height")
        public /* bridge */ /* synthetic */ void setHeight(View view, Dynamic dynamic) {
            super.setHeight((o) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeGaussianBlurManagerInterface
        @ReactProp(name = "in1")
        public void setIn1(l lVar, String str) {
            lVar.f6745i = str;
            lVar.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeGaussianBlurManagerInterface
        @ReactProp(name = "result")
        public /* bridge */ /* synthetic */ void setResult(View view, String str) {
            super.setResult((o) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeGaussianBlurManagerInterface
        @ReactProp(name = "stdDeviationX")
        public void setStdDeviationX(l lVar, float f2) {
            lVar.f6746v = f2;
            lVar.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeGaussianBlurManagerInterface
        @ReactProp(name = "stdDeviationY")
        public void setStdDeviationY(l lVar, float f2) {
            lVar.f6747w = f2;
            lVar.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeGaussianBlurManagerInterface
        @ReactProp(name = "width")
        public /* bridge */ /* synthetic */ void setWidth(View view, Dynamic dynamic) {
            super.setWidth((o) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeGaussianBlurManagerInterface
        @ReactProp(name = "x")
        public /* bridge */ /* synthetic */ void setX(View view, Dynamic dynamic) {
            super.setX((o) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeGaussianBlurManagerInterface
        @ReactProp(name = "y")
        public /* bridge */ /* synthetic */ void setY(View view, Dynamic dynamic) {
            super.setY((o) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeGaussianBlurManagerInterface
        @ReactProp(name = "values")
        public void setEdgeMode(l lVar, String str) {
            lVar.getClass();
            HashMap map = p.f6777e;
            if (!map.containsKey(str)) {
                throw new IllegalArgumentException(a3.e.l("Unknown 'edgeMode' Value: ", str));
            }
            lVar.invalidate();
        }
    }

    public static class FeMergeManager extends FilterPrimitiveManager<m> implements RNSVGFeMergeManagerInterface<m> {
        public static final String REACT_CLASS = "RNSVGFeMerge";

        public FeMergeManager() {
            super(VirtualViewManager.SVGClass.RNSVGFeMerge);
            ((VirtualViewManager) this).mDelegate = new RNSVGFeMergeManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeMergeManagerInterface
        @ReactProp(name = "height")
        public /* bridge */ /* synthetic */ void setHeight(View view, Dynamic dynamic) {
            super.setHeight((o) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeMergeManagerInterface
        @ReactProp(name = "nodes")
        public void setNodes(m mVar, ReadableArray readableArray) {
            mVar.f6749i = readableArray;
            mVar.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeMergeManagerInterface
        @ReactProp(name = "result")
        public /* bridge */ /* synthetic */ void setResult(View view, String str) {
            super.setResult((o) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeMergeManagerInterface
        @ReactProp(name = "width")
        public /* bridge */ /* synthetic */ void setWidth(View view, Dynamic dynamic) {
            super.setWidth((o) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeMergeManagerInterface
        @ReactProp(name = "x")
        public /* bridge */ /* synthetic */ void setX(View view, Dynamic dynamic) {
            super.setX((o) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeMergeManagerInterface
        @ReactProp(name = "y")
        public /* bridge */ /* synthetic */ void setY(View view, Dynamic dynamic) {
            super.setY((o) view, dynamic);
        }
    }

    public static class FeOffsetManager extends FilterPrimitiveManager<n> implements RNSVGFeOffsetManagerInterface<n> {
        public static final String REACT_CLASS = "RNSVGFeOffset";

        public FeOffsetManager() {
            super(VirtualViewManager.SVGClass.RNSVGFeOffset);
            ((VirtualViewManager) this).mDelegate = new RNSVGFeOffsetManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeOffsetManagerInterface
        @ReactProp(name = "height")
        public /* bridge */ /* synthetic */ void setHeight(View view, Dynamic dynamic) {
            super.setHeight((o) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeOffsetManagerInterface
        @ReactProp(name = "in1")
        public void setIn1(n nVar, String str) {
            nVar.f6759i = str;
            nVar.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeOffsetManagerInterface
        @ReactProp(name = "result")
        public /* bridge */ /* synthetic */ void setResult(View view, String str) {
            super.setResult((o) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeOffsetManagerInterface
        @ReactProp(name = "width")
        public /* bridge */ /* synthetic */ void setWidth(View view, Dynamic dynamic) {
            super.setWidth((o) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeOffsetManagerInterface
        @ReactProp(name = "x")
        public /* bridge */ /* synthetic */ void setX(View view, Dynamic dynamic) {
            super.setX((o) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeOffsetManagerInterface
        @ReactProp(name = "y")
        public /* bridge */ /* synthetic */ void setY(View view, Dynamic dynamic) {
            super.setY((o) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeOffsetManagerInterface
        @ReactProp(name = "dx")
        public void setDx(n nVar, Dynamic dynamic) {
            nVar.getClass();
            nVar.f6760v = r0.b(dynamic);
            nVar.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeOffsetManagerInterface
        @ReactProp(name = "dy")
        public void setDy(n nVar, Dynamic dynamic) {
            nVar.getClass();
            nVar.f6761w = r0.b(dynamic);
            nVar.invalidate();
        }
    }

    public static class FilterManager extends VirtualViewManager<v> implements RNSVGFilterManagerInterface<v> {
        public static final String REACT_CLASS = "RNSVGFilter";

        public FilterManager() {
            super(VirtualViewManager.SVGClass.RNSVGFilter);
            ((VirtualViewManager) this).mDelegate = new RNSVGFilterManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFilterManagerInterface
        @ReactProp(name = "height")
        public void setHeight(v vVar, Dynamic dynamic) {
            vVar.f6803v.setHeight(dynamic);
            vVar.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFilterManagerInterface
        @ReactProp(name = StackTraceHelper.NAME_KEY)
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFilterManagerInterface
        @ReactProp(name = "width")
        public void setWidth(v vVar, Dynamic dynamic) {
            vVar.f6803v.setWidth(dynamic);
            vVar.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFilterManagerInterface
        @ReactProp(name = "x")
        public void setX(v vVar, Dynamic dynamic) {
            vVar.f6803v.setX(dynamic);
            vVar.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFilterManagerInterface
        @ReactProp(name = "y")
        public void setY(v vVar, Dynamic dynamic) {
            vVar.f6803v.setY(dynamic);
            vVar.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFilterManagerInterface
        @ReactProp(name = "filterUnits")
        public void setFilterUnits(v vVar, String str) {
            vVar.getClass();
            vVar.f6801e = u.a(str);
            vVar.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFilterManagerInterface
        @ReactProp(name = "primitiveUnits")
        public void setPrimitiveUnits(v vVar, String str) {
            vVar.getClass();
            vVar.f6802i = u.a(str);
            vVar.invalidate();
        }
    }

    public static class FilterPrimitiveManager<T extends o> extends VirtualViewManager<T> {
        public FilterPrimitiveManager(VirtualViewManager.SVGClass sVGClass) {
            super(sVGClass);
        }

        @ReactProp(name = "height")
        public void setHeight(T t5, Dynamic dynamic) {
            t5.f6770e.setHeight(dynamic);
            t5.invalidate();
        }

        @ReactProp(name = "result")
        public void setResult(T t5, String str) {
            t5.f6769d = str;
            t5.invalidate();
        }

        @ReactProp(name = "width")
        public void setWidth(T t5, Dynamic dynamic) {
            t5.f6770e.setWidth(dynamic);
            t5.invalidate();
        }

        @ReactProp(name = "x")
        public void setX(T t5, Dynamic dynamic) {
            t5.f6770e.setX(dynamic);
            t5.invalidate();
        }

        @ReactProp(name = "y")
        public void setY(T t5, Dynamic dynamic) {
            t5.f6770e.setY(dynamic);
            t5.invalidate();
        }
    }

    public static class ForeignObjectManager extends GroupViewManagerAbstract<y> implements RNSVGForeignObjectManagerInterface<y> {
        public static final String REACT_CLASS = "RNSVGForeignObject";

        public ForeignObjectManager() {
            super(VirtualViewManager.SVGClass.RNSVGForeignObject);
            ((VirtualViewManager) this).mDelegate = new RNSVGForeignObjectManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i7) {
            super.setClipRule((VirtualView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(customType = "Color", name = ViewProps.COLOR)
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((RenderableView) view, num);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(name = ViewProps.DISPLAY)
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            super.setFill((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(defaultFloat = JankStatsAggregatorKt.DEFAULT_JANK_MULTIPLIER, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f2) {
            super.setFillOpacity((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i7) {
            super.setFillRule((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(name = ViewProps.FILTER)
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(name = "font")
        public /* bridge */ /* synthetic */ void setFont(View view, Dynamic dynamic) {
            super.setFont((a0) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(name = ViewProps.FONT_SIZE)
        public /* bridge */ /* synthetic */ void setFontSize(View view, Dynamic dynamic) {
            super.setFontSize((a0) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(name = ViewProps.FONT_WEIGHT)
        public /* bridge */ /* synthetic */ void setFontWeight(View view, Dynamic dynamic) {
            super.setFontWeight((a0) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(name = StackTraceHelper.NAME_KEY)
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @ReactProp(defaultFloat = JankStatsAggregatorKt.DEFAULT_JANK_MULTIPLIER, name = ViewProps.OPACITY)
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f2) {
            super.setOpacity((VirtualView) view, f2);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(name = ViewProps.POINTER_EVENTS)
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z5) {
            super.setResponsible((VirtualView) view, z5);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            super.setStroke((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f2) {
            super.setStrokeDashoffset((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i7) {
            super.setStrokeLinecap((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i7) {
            super.setStrokeLinejoin((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(defaultFloat = BulletSpan.STANDARD_STROKE_WIDTH_PX, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f2) {
            super.setStrokeMiterlimit((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(defaultFloat = JankStatsAggregatorKt.DEFAULT_JANK_MULTIPLIER, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f2) {
            super.setStrokeOpacity((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i7) {
            super.setVectorEffect((RenderableView) view, i7);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(name = "height")
        public void setHeight(y yVar, Dynamic dynamic) {
            yVar.getClass();
            yVar.F = r0.b(dynamic);
            yVar.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(name = "width")
        public void setWidth(y yVar, Dynamic dynamic) {
            yVar.getClass();
            yVar.E = r0.b(dynamic);
            yVar.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(name = "x")
        public void setX(y yVar, Dynamic dynamic) {
            yVar.getClass();
            yVar.f6823x = r0.b(dynamic);
            yVar.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(name = "y")
        public void setY(y yVar, Dynamic dynamic) {
            yVar.getClass();
            yVar.f6824y = r0.b(dynamic);
            yVar.invalidate();
        }
    }

    public static class GroupViewManager extends GroupViewManagerAbstract<a0> implements RNSVGGroupManagerInterface<a0> {
        public static final String REACT_CLASS = "RNSVGGroup";

        public GroupViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGGroup);
            ((VirtualViewManager) this).mDelegate = new RNSVGGroupManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i7) {
            super.setClipRule((VirtualView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(customType = "Color", name = ViewProps.COLOR)
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((RenderableView) view, num);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(name = ViewProps.DISPLAY)
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            super.setFill((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(defaultFloat = JankStatsAggregatorKt.DEFAULT_JANK_MULTIPLIER, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f2) {
            super.setFillOpacity((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i7) {
            super.setFillRule((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(name = ViewProps.FILTER)
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(name = "font")
        public /* bridge */ /* synthetic */ void setFont(View view, Dynamic dynamic) {
            super.setFont((a0) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(name = ViewProps.FONT_SIZE)
        public /* bridge */ /* synthetic */ void setFontSize(View view, Dynamic dynamic) {
            super.setFontSize((a0) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(name = ViewProps.FONT_WEIGHT)
        public /* bridge */ /* synthetic */ void setFontWeight(View view, Dynamic dynamic) {
            super.setFontWeight((a0) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(name = StackTraceHelper.NAME_KEY)
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @ReactProp(defaultFloat = JankStatsAggregatorKt.DEFAULT_JANK_MULTIPLIER, name = ViewProps.OPACITY)
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f2) {
            super.setOpacity((VirtualView) view, f2);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(name = ViewProps.POINTER_EVENTS)
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z5) {
            super.setResponsible((VirtualView) view, z5);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            super.setStroke((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f2) {
            super.setStrokeDashoffset((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i7) {
            super.setStrokeLinecap((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i7) {
            super.setStrokeLinejoin((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(defaultFloat = BulletSpan.STANDARD_STROKE_WIDTH_PX, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f2) {
            super.setStrokeMiterlimit((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(defaultFloat = JankStatsAggregatorKt.DEFAULT_JANK_MULTIPLIER, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f2) {
            super.setStrokeOpacity((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i7) {
            super.setVectorEffect((RenderableView) view, i7);
        }
    }

    public static class GroupViewManagerAbstract<U extends a0> extends RenderableViewManager<U> {
        public GroupViewManagerAbstract(VirtualViewManager.SVGClass sVGClass) {
            super(sVGClass);
        }

        @ReactProp(name = "font")
        public void setFont(U u5, Dynamic dynamic) {
            u5.getClass();
            if (dynamic.getType() == ReadableType.Map) {
                u5.f6663d = dynamic.asMap();
            } else {
                u5.f6663d = null;
            }
            u5.invalidate();
        }

        @ReactProp(name = ViewProps.FONT_SIZE)
        public void setFontSize(U u5, Dynamic dynamic) {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            int i7 = p0.f6780a[dynamic.getType().ordinal()];
            if (i7 == 1) {
                javaOnlyMap.putDouble(ViewProps.FONT_SIZE, dynamic.asDouble());
            } else if (i7 != 2) {
                return;
            } else {
                javaOnlyMap.putString(ViewProps.FONT_SIZE, dynamic.asString());
            }
            u5.f6663d = javaOnlyMap;
            u5.invalidate();
        }

        @ReactProp(name = ViewProps.FONT_WEIGHT)
        public void setFontWeight(U u5, Dynamic dynamic) {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            int i7 = p0.f6780a[dynamic.getType().ordinal()];
            if (i7 == 1) {
                javaOnlyMap.putDouble(ViewProps.FONT_WEIGHT, dynamic.asDouble());
            } else if (i7 != 2) {
                return;
            } else {
                javaOnlyMap.putString(ViewProps.FONT_WEIGHT, dynamic.asString());
            }
            u5.f6663d = javaOnlyMap;
            u5.invalidate();
        }
    }

    public static class ImageViewManager extends RenderableViewManager<c0> implements RNSVGImageManagerInterface<c0> {
        public static final String REACT_CLASS = "RNSVGImage";

        public ImageViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGImage);
            ((VirtualViewManager) this).mDelegate = new RNSVGImageManagerDelegate(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
        public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
            HashMap map = new HashMap();
            map.put(SvgLoadEvent.EVENT_NAME, MapBuilder.of("registrationName", "onLoad"));
            return map;
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(name = "align")
        public void setAlign(c0 c0Var, String str) {
            c0Var.E = str;
            c0Var.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i7) {
            super.setClipRule((VirtualView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(customType = "Color", name = ViewProps.COLOR)
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((RenderableView) view, num);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(name = ViewProps.DISPLAY)
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            super.setFill((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(defaultFloat = JankStatsAggregatorKt.DEFAULT_JANK_MULTIPLIER, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f2) {
            super.setFillOpacity((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i7) {
            super.setFillRule((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(name = ViewProps.FILTER)
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(name = "meetOrSlice")
        public void setMeetOrSlice(c0 c0Var, int i7) {
            c0Var.F = i7;
            c0Var.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(name = StackTraceHelper.NAME_KEY)
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @ReactProp(defaultFloat = JankStatsAggregatorKt.DEFAULT_JANK_MULTIPLIER, name = ViewProps.OPACITY)
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f2) {
            super.setOpacity((VirtualView) view, f2);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(name = ViewProps.POINTER_EVENTS)
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z5) {
            super.setResponsible((VirtualView) view, z5);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            super.setStroke((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f2) {
            super.setStrokeDashoffset((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i7) {
            super.setStrokeLinecap((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i7) {
            super.setStrokeLinejoin((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(defaultFloat = BulletSpan.STANDARD_STROKE_WIDTH_PX, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f2) {
            super.setStrokeMiterlimit((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(defaultFloat = JankStatsAggregatorKt.DEFAULT_JANK_MULTIPLIER, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f2) {
            super.setStrokeOpacity((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i7) {
            super.setVectorEffect((RenderableView) view, i7);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(name = "height")
        public void setHeight(c0 c0Var, Dynamic dynamic) {
            c0Var.getClass();
            c0Var.f6675v = r0.b(dynamic);
            c0Var.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(customType = "ImageSource", name = "src")
        public void setSrc(c0 c0Var, ReadableMap readableMap) {
            c0Var.getClass();
            if (readableMap != null) {
                String string = readableMap.getString("uri");
                c0Var.f6676w = string;
                if (string == null || string.isEmpty()) {
                    return;
                }
                if (readableMap.hasKey("width") && readableMap.hasKey("height")) {
                    c0Var.f6677x = readableMap.getInt("width");
                    c0Var.f6678y = readableMap.getInt("height");
                } else {
                    c0Var.f6677x = 0;
                    c0Var.f6678y = 0;
                }
                if (Uri.parse(c0Var.f6676w).getScheme() == null) {
                    ResourceDrawableIdHelper.getInstance();
                    ResourceDrawableIdHelper.getResourceDrawableUri(c0Var.mContext, c0Var.f6676w);
                }
            }
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(name = "width")
        public void setWidth(c0 c0Var, Dynamic dynamic) {
            c0Var.getClass();
            c0Var.f6674i = r0.b(dynamic);
            c0Var.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(name = "x")
        public void setX(c0 c0Var, Dynamic dynamic) {
            c0Var.getClass();
            c0Var.f6672d = r0.b(dynamic);
            c0Var.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(name = "y")
        public void setY(c0 c0Var, Dynamic dynamic) {
            c0Var.getClass();
            c0Var.f6673e = r0.b(dynamic);
            c0Var.invalidate();
        }
    }

    public static class LineViewManager extends RenderableViewManager<d0> implements RNSVGLineManagerInterface<d0> {
        public static final String REACT_CLASS = "RNSVGLine";

        public LineViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGLine);
            ((VirtualViewManager) this).mDelegate = new RNSVGLineManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i7) {
            super.setClipRule((VirtualView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(customType = "Color", name = ViewProps.COLOR)
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((RenderableView) view, num);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(name = ViewProps.DISPLAY)
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            super.setFill((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(defaultFloat = JankStatsAggregatorKt.DEFAULT_JANK_MULTIPLIER, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f2) {
            super.setFillOpacity((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i7) {
            super.setFillRule((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(name = ViewProps.FILTER)
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(name = StackTraceHelper.NAME_KEY)
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @ReactProp(defaultFloat = JankStatsAggregatorKt.DEFAULT_JANK_MULTIPLIER, name = ViewProps.OPACITY)
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f2) {
            super.setOpacity((VirtualView) view, f2);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(name = ViewProps.POINTER_EVENTS)
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z5) {
            super.setResponsible((VirtualView) view, z5);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            super.setStroke((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f2) {
            super.setStrokeDashoffset((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i7) {
            super.setStrokeLinecap((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i7) {
            super.setStrokeLinejoin((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(defaultFloat = BulletSpan.STANDARD_STROKE_WIDTH_PX, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f2) {
            super.setStrokeMiterlimit((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(defaultFloat = JankStatsAggregatorKt.DEFAULT_JANK_MULTIPLIER, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f2) {
            super.setStrokeOpacity((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i7) {
            super.setVectorEffect((RenderableView) view, i7);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(name = "x1")
        public void setX1(d0 d0Var, Dynamic dynamic) {
            d0Var.getClass();
            d0Var.f6683d = r0.b(dynamic);
            d0Var.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(name = "x2")
        public void setX2(d0 d0Var, Dynamic dynamic) {
            d0Var.getClass();
            d0Var.f6685i = r0.b(dynamic);
            d0Var.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(name = "y1")
        public void setY1(d0 d0Var, Dynamic dynamic) {
            d0Var.getClass();
            d0Var.f6684e = r0.b(dynamic);
            d0Var.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(name = "y2")
        public void setY2(d0 d0Var, Dynamic dynamic) {
            d0Var.getClass();
            d0Var.f6686v = r0.b(dynamic);
            d0Var.invalidate();
        }
    }

    public static class LinearGradientManager extends VirtualViewManager<e0> implements RNSVGLinearGradientManagerInterface<e0> {
        public static final String REACT_CLASS = "RNSVGLinearGradient";

        public LinearGradientManager() {
            super(VirtualViewManager.SVGClass.RNSVGLinearGradient);
            ((VirtualViewManager) this).mDelegate = new RNSVGLinearGradientManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLinearGradientManagerInterface
        @ReactProp(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLinearGradientManagerInterface
        @ReactProp(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i7) {
            super.setClipRule((VirtualView) view, i7);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLinearGradientManagerInterface
        @ReactProp(name = ViewProps.DISPLAY)
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLinearGradientManagerInterface
        @ReactProp(name = "gradient")
        public void setGradient(e0 e0Var, ReadableArray readableArray) {
            e0Var.f6698w = readableArray;
            e0Var.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLinearGradientManagerInterface
        @ReactProp(name = "gradientTransform")
        public void setGradientTransform(e0 e0Var, ReadableArray readableArray) {
            if (readableArray != null) {
                float[] fArr = e0.E;
                int iC = a.a.C(readableArray, fArr, e0Var.mScale);
                if (iC == 6) {
                    if (e0Var.f6700y == null) {
                        e0Var.f6700y = new Matrix();
                    }
                    e0Var.f6700y.setValues(fArr);
                } else if (iC != -1) {
                    o8.a.v(ReactConstants.TAG, "RNSVG: Transform matrices must be of size 6");
                }
            } else {
                e0Var.f6700y = null;
            }
            e0Var.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLinearGradientManagerInterface
        @ReactProp(name = "gradientUnits")
        public void setGradientUnits(e0 e0Var, int i7) {
            if (i7 == 0) {
                e0Var.f6699x = 1;
            } else if (i7 == 1) {
                e0Var.f6699x = 2;
            }
            e0Var.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLinearGradientManagerInterface
        @ReactProp(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLinearGradientManagerInterface
        @ReactProp(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLinearGradientManagerInterface
        @ReactProp(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLinearGradientManagerInterface
        @ReactProp(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLinearGradientManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLinearGradientManagerInterface
        @ReactProp(name = StackTraceHelper.NAME_KEY)
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @ReactProp(defaultFloat = JankStatsAggregatorKt.DEFAULT_JANK_MULTIPLIER, name = ViewProps.OPACITY)
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f2) {
            super.setOpacity((VirtualView) view, f2);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLinearGradientManagerInterface
        @ReactProp(name = ViewProps.POINTER_EVENTS)
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLinearGradientManagerInterface
        @ReactProp(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z5) {
            super.setResponsible((VirtualView) view, z5);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLinearGradientManagerInterface
        @ReactProp(name = "x1")
        public void setX1(e0 e0Var, Dynamic dynamic) {
            e0Var.getClass();
            e0Var.f6694d = r0.b(dynamic);
            e0Var.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLinearGradientManagerInterface
        @ReactProp(name = "x2")
        public void setX2(e0 e0Var, Dynamic dynamic) {
            e0Var.getClass();
            e0Var.f6696i = r0.b(dynamic);
            e0Var.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLinearGradientManagerInterface
        @ReactProp(name = "y1")
        public void setY1(e0 e0Var, Dynamic dynamic) {
            e0Var.getClass();
            e0Var.f6695e = r0.b(dynamic);
            e0Var.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLinearGradientManagerInterface
        @ReactProp(name = "y2")
        public void setY2(e0 e0Var, Dynamic dynamic) {
            e0Var.getClass();
            e0Var.f6697v = r0.b(dynamic);
            e0Var.invalidate();
        }
    }

    public static class MarkerManager extends GroupViewManagerAbstract<f0> implements RNSVGMarkerManagerInterface<f0> {
        public static final String REACT_CLASS = "RNSVGMarker";

        public MarkerManager() {
            super(VirtualViewManager.SVGClass.RNSVGMarker);
            ((VirtualViewManager) this).mDelegate = new RNSVGMarkerManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = "align")
        public void setAlign(f0 f0Var, String str) {
            f0Var.M = str;
            f0Var.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i7) {
            super.setClipRule((VirtualView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(customType = "Color", name = ViewProps.COLOR)
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((RenderableView) view, num);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = ViewProps.DISPLAY)
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            super.setFill((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(defaultFloat = JankStatsAggregatorKt.DEFAULT_JANK_MULTIPLIER, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f2) {
            super.setFillOpacity((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i7) {
            super.setFillRule((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = ViewProps.FILTER)
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = "font")
        public /* bridge */ /* synthetic */ void setFont(View view, Dynamic dynamic) {
            super.setFont((a0) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = ViewProps.FONT_SIZE)
        public /* bridge */ /* synthetic */ void setFontSize(View view, Dynamic dynamic) {
            super.setFontSize((a0) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = ViewProps.FONT_WEIGHT)
        public /* bridge */ /* synthetic */ void setFontWeight(View view, Dynamic dynamic) {
            super.setFontWeight((a0) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = "markerUnits")
        public void setMarkerUnits(f0 f0Var, String str) {
            f0Var.G = str;
            f0Var.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = "meetOrSlice")
        public void setMeetOrSlice(f0 f0Var, int i7) {
            f0Var.N = i7;
            f0Var.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = "minX")
        public void setMinX(f0 f0Var, float f2) {
            f0Var.I = f2;
            f0Var.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = "minY")
        public void setMinY(f0 f0Var, float f2) {
            f0Var.J = f2;
            f0Var.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = StackTraceHelper.NAME_KEY)
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @ReactProp(defaultFloat = JankStatsAggregatorKt.DEFAULT_JANK_MULTIPLIER, name = ViewProps.OPACITY)
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f2) {
            super.setOpacity((VirtualView) view, f2);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = "orient")
        public void setOrient(f0 f0Var, String str) {
            f0Var.H = str;
            f0Var.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = ViewProps.POINTER_EVENTS)
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z5) {
            super.setResponsible((VirtualView) view, z5);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            super.setStroke((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f2) {
            super.setStrokeDashoffset((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i7) {
            super.setStrokeLinecap((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i7) {
            super.setStrokeLinejoin((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(defaultFloat = BulletSpan.STANDARD_STROKE_WIDTH_PX, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f2) {
            super.setStrokeMiterlimit((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(defaultFloat = JankStatsAggregatorKt.DEFAULT_JANK_MULTIPLIER, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f2) {
            super.setStrokeOpacity((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = "vbHeight")
        public void setVbHeight(f0 f0Var, float f2) {
            f0Var.L = f2;
            f0Var.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = "vbWidth")
        public void setVbWidth(f0 f0Var, float f2) {
            f0Var.K = f2;
            f0Var.invalidate();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i7) {
            super.setVectorEffect((RenderableView) view, i7);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = "markerHeight")
        public void setMarkerHeight(f0 f0Var, Dynamic dynamic) {
            f0Var.getClass();
            f0Var.F = r0.b(dynamic);
            f0Var.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = "markerWidth")
        public void setMarkerWidth(f0 f0Var, Dynamic dynamic) {
            f0Var.getClass();
            f0Var.E = r0.b(dynamic);
            f0Var.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = "refX")
        public void setRefX(f0 f0Var, Dynamic dynamic) {
            f0Var.getClass();
            f0Var.f6707x = r0.b(dynamic);
            f0Var.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = "refY")
        public void setRefY(f0 f0Var, Dynamic dynamic) {
            f0Var.getClass();
            f0Var.f6708y = r0.b(dynamic);
            f0Var.invalidate();
        }
    }

    public static class MaskManager extends GroupViewManagerAbstract<g0> implements RNSVGMaskManagerInterface<g0> {
        public static final String REACT_CLASS = "RNSVGMask";

        public MaskManager() {
            super(VirtualViewManager.SVGClass.RNSVGMask);
            ((VirtualViewManager) this).mDelegate = new RNSVGMaskManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i7) {
            super.setClipRule((VirtualView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(customType = "Color", name = ViewProps.COLOR)
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((RenderableView) view, num);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(name = ViewProps.DISPLAY)
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            super.setFill((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(defaultFloat = JankStatsAggregatorKt.DEFAULT_JANK_MULTIPLIER, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f2) {
            super.setFillOpacity((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i7) {
            super.setFillRule((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(name = ViewProps.FILTER)
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(name = "font")
        public /* bridge */ /* synthetic */ void setFont(View view, Dynamic dynamic) {
            super.setFont((a0) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(name = ViewProps.FONT_SIZE)
        public /* bridge */ /* synthetic */ void setFontSize(View view, Dynamic dynamic) {
            super.setFontSize((a0) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(name = ViewProps.FONT_WEIGHT)
        public /* bridge */ /* synthetic */ void setFontWeight(View view, Dynamic dynamic) {
            super.setFontWeight((a0) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(name = "maskContentUnits")
        public void setMaskContentUnits(g0 g0Var, int i7) {
            g0Var.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(name = "maskType")
        public void setMaskType(g0 g0Var, int i7) {
            if (i7 == 0) {
                g0Var.H = 1;
            } else if (i7 == 1) {
                g0Var.H = 2;
            }
            g0Var.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(name = "maskUnits")
        public void setMaskUnits(g0 g0Var, int i7) {
            if (i7 == 0) {
                g0Var.G = 1;
            } else if (i7 == 1) {
                g0Var.G = 2;
            }
            g0Var.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(name = StackTraceHelper.NAME_KEY)
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @ReactProp(defaultFloat = JankStatsAggregatorKt.DEFAULT_JANK_MULTIPLIER, name = ViewProps.OPACITY)
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f2) {
            super.setOpacity((VirtualView) view, f2);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(name = ViewProps.POINTER_EVENTS)
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z5) {
            super.setResponsible((VirtualView) view, z5);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            super.setStroke((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f2) {
            super.setStrokeDashoffset((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i7) {
            super.setStrokeLinecap((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i7) {
            super.setStrokeLinejoin((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(defaultFloat = BulletSpan.STANDARD_STROKE_WIDTH_PX, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f2) {
            super.setStrokeMiterlimit((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(defaultFloat = JankStatsAggregatorKt.DEFAULT_JANK_MULTIPLIER, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f2) {
            super.setStrokeOpacity((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i7) {
            super.setVectorEffect((RenderableView) view, i7);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(name = "height")
        public void setHeight(g0 g0Var, Dynamic dynamic) {
            g0Var.getClass();
            g0Var.F = r0.b(dynamic);
            g0Var.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(name = "width")
        public void setWidth(g0 g0Var, Dynamic dynamic) {
            g0Var.getClass();
            g0Var.E = r0.b(dynamic);
            g0Var.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(name = "x")
        public void setX(g0 g0Var, Dynamic dynamic) {
            g0Var.getClass();
            g0Var.f6715x = r0.b(dynamic);
            g0Var.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(name = "y")
        public void setY(g0 g0Var, Dynamic dynamic) {
            g0Var.getClass();
            g0Var.f6716y = r0.b(dynamic);
            g0Var.invalidate();
        }
    }

    public static class PathViewManager extends RenderableViewManager<i0> implements RNSVGPathManagerInterface<i0> {
        public static final String REACT_CLASS = "RNSVGPath";

        public PathViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGPath);
            ((VirtualViewManager) this).mDelegate = new RNSVGPathManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @ReactProp(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @ReactProp(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i7) {
            super.setClipRule((VirtualView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @ReactProp(customType = "Color", name = ViewProps.COLOR)
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((RenderableView) view, num);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @ReactProp(name = ViewProps.DISPLAY)
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @ReactProp(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            super.setFill((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @ReactProp(defaultFloat = JankStatsAggregatorKt.DEFAULT_JANK_MULTIPLIER, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f2) {
            super.setFillOpacity((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @ReactProp(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i7) {
            super.setFillRule((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @ReactProp(name = ViewProps.FILTER)
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @ReactProp(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @ReactProp(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @ReactProp(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @ReactProp(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @ReactProp(name = StackTraceHelper.NAME_KEY)
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @ReactProp(defaultFloat = JankStatsAggregatorKt.DEFAULT_JANK_MULTIPLIER, name = ViewProps.OPACITY)
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f2) {
            super.setOpacity((VirtualView) view, f2);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @ReactProp(name = ViewProps.POINTER_EVENTS)
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @ReactProp(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @ReactProp(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z5) {
            super.setResponsible((VirtualView) view, z5);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @ReactProp(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            super.setStroke((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @ReactProp(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @ReactProp(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f2) {
            super.setStrokeDashoffset((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i7) {
            super.setStrokeLinecap((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i7) {
            super.setStrokeLinejoin((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @ReactProp(defaultFloat = BulletSpan.STANDARD_STROKE_WIDTH_PX, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f2) {
            super.setStrokeMiterlimit((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @ReactProp(defaultFloat = JankStatsAggregatorKt.DEFAULT_JANK_MULTIPLIER, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f2) {
            super.setStrokeOpacity((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @ReactProp(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @ReactProp(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i7) {
            super.setVectorEffect((RenderableView) view, i7);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @ReactProp(name = "d")
        public void setD(i0 i0Var, String str) {
            i0Var.getClass();
            zs.a.f24109f = new ArrayList();
            Path path = new Path();
            zs.a.f24108e = path;
            if (str != null) {
                zs.a.f24106c = str.length();
                zs.a.f24107d = str;
                zs.a.f24105b = 0;
                zs.a.f24110g = 0.0f;
                zs.a.f24111h = 0.0f;
                zs.a.f24112i = 0.0f;
                zs.a.j = 0.0f;
                zs.a.k = 0.0f;
                zs.a.f24113l = 0.0f;
                zs.a.f24114m = false;
                char c8 = ' ';
                while (zs.a.f24105b < zs.a.f24106c) {
                    zs.a.W();
                    int i7 = zs.a.f24105b;
                    if (i7 >= zs.a.f24106c) {
                        path = zs.a.f24108e;
                    } else {
                        boolean z5 = true;
                        boolean z6 = c8 != ' ';
                        char cCharAt = zs.a.f24107d.charAt(i7);
                        if (!z6 && cCharAt != 'M' && cCharAt != 'm') {
                            throw new IllegalArgumentException(String.format("Unexpected character '%c' (i=%d, s=%s)", Character.valueOf(cCharAt), Integer.valueOf(zs.a.f24105b), zs.a.f24107d));
                        }
                        switch (cCharAt) {
                            case 'A':
                            case 'C':
                            case 'H':
                            case 'L':
                            case 'M':
                            case 'Q':
                            case 'S':
                            case 'T':
                            case com.swmansion.reanimated.BuildConfig.REACT_NATIVE_MINOR_VERSION /* 86 */:
                            case 'Z':
                            case 'a':
                            case 'c':
                            case 'h':
                            case 'l':
                            case 'm':
                            case 'q':
                            case 's':
                            case 't':
                            case 'v':
                            case 'z':
                                zs.a.f24105b++;
                                z5 = false;
                                c8 = cCharAt;
                                break;
                            default:
                                if (((cCharAt < '0' || cCharAt > '9') && cCharAt != '.' && cCharAt != '-' && cCharAt != '+') || !z6) {
                                    throw new IllegalArgumentException(String.format("Unexpected character '%c' (i=%d, s=%s)", Character.valueOf(cCharAt), Integer.valueOf(zs.a.f24105b), zs.a.f24107d));
                                }
                                if (c8 == 'Z' || c8 == 'z') {
                                    throw new IllegalArgumentException(s0.g.e("Unexpected number after 'z' (s=", zs.a.f24107d, ")"));
                                }
                                if (c8 != 'M' && c8 != 'm') {
                                    z5 = false;
                                } else if (Character.isUpperCase(c8)) {
                                    c8 = 'L';
                                } else {
                                    c8 = 'l';
                                }
                                break;
                                break;
                        }
                        boolean zIsUpperCase = Character.isUpperCase(c8);
                        switch (c8) {
                            case 'A':
                                zs.a.c(zs.a.N(), zs.a.N(), zs.a.N(), zs.a.M(), zs.a.M(), zs.a.N(), zs.a.N());
                                break;
                            case 'C':
                                float fN = zs.a.N();
                                float fN2 = zs.a.N();
                                float fN3 = zs.a.N();
                                float fN4 = zs.a.N();
                                float fN5 = zs.a.N();
                                float fN6 = zs.a.N();
                                zs.a.f24112i = fN3;
                                zs.a.j = fN4;
                                zs.a.q(fN, fN2, fN3, fN4, fN5, fN6);
                                break;
                            case 'H':
                                zs.a.H(zs.a.N(), zs.a.f24111h);
                                break;
                            case 'L':
                                zs.a.H(zs.a.N(), zs.a.N());
                                break;
                            case 'M':
                                zs.a.K(zs.a.N(), zs.a.N());
                                break;
                            case 'Q':
                                zs.a.Q(zs.a.N(), zs.a.N(), zs.a.N(), zs.a.N());
                                break;
                            case 'S':
                                float fN7 = zs.a.N();
                                float fN8 = zs.a.N();
                                float fN9 = zs.a.N();
                                float fN10 = zs.a.N();
                                float f2 = (zs.a.f24110g * 2.0f) - zs.a.f24112i;
                                float f7 = (zs.a.f24111h * 2.0f) - zs.a.j;
                                zs.a.f24112i = fN7;
                                zs.a.j = fN8;
                                zs.a.q(f2, f7, fN7, fN8, fN9, fN10);
                                break;
                            case 'T':
                                zs.a.Q((zs.a.f24110g * 2.0f) - zs.a.f24112i, (zs.a.f24111h * 2.0f) - zs.a.j, zs.a.N(), zs.a.N());
                                break;
                            case com.swmansion.reanimated.BuildConfig.REACT_NATIVE_MINOR_VERSION /* 86 */:
                                zs.a.H(zs.a.f24110g, zs.a.N());
                                break;
                            case 'Z':
                            case 'z':
                                if (zs.a.f24114m) {
                                    zs.a.f24110g = zs.a.k;
                                    zs.a.f24111h = zs.a.f24113l;
                                    zs.a.f24114m = false;
                                    zs.a.f24108e.close();
                                    zs.a.f24109f.add(new h0(5, new k0[]{new k0(zs.a.f24110g, zs.a.f24111h)}));
                                }
                                break;
                            case 'a':
                                zs.a.c(zs.a.N(), zs.a.N(), zs.a.N(), zs.a.M(), zs.a.M(), zs.a.N() + zs.a.f24110g, zs.a.N() + zs.a.f24111h);
                                break;
                            case 'c':
                                float fN11 = zs.a.N();
                                float fN12 = zs.a.N();
                                float fN13 = zs.a.N();
                                float fN14 = zs.a.N();
                                float fN15 = zs.a.N();
                                float fN16 = zs.a.N();
                                float f10 = zs.a.f24110g;
                                float f11 = fN11 + f10;
                                float f12 = zs.a.f24111h;
                                float f13 = fN13 + f10;
                                float f14 = fN14 + f12;
                                zs.a.f24112i = f13;
                                zs.a.j = f14;
                                zs.a.q(f11, fN12 + f12, f13, f14, fN15 + f10, fN16 + f12);
                                break;
                            case 'h':
                                zs.a.H(zs.a.N() + zs.a.f24110g, zs.a.f24111h + 0.0f);
                                break;
                            case 'l':
                                zs.a.H(zs.a.N() + zs.a.f24110g, zs.a.N() + zs.a.f24111h);
                                break;
                            case 'm':
                                zs.a.K(zs.a.N() + zs.a.f24110g, zs.a.N() + zs.a.f24111h);
                                break;
                            case 'q':
                                float fN17 = zs.a.N();
                                float fN18 = zs.a.N();
                                float fN19 = zs.a.N();
                                float fN20 = zs.a.N();
                                float f15 = zs.a.f24110g;
                                float f16 = zs.a.f24111h;
                                zs.a.Q(fN17 + f15, fN18 + f16, fN19 + f15, fN20 + f16);
                                break;
                            case 's':
                                float fN21 = zs.a.N();
                                float fN22 = zs.a.N();
                                float fN23 = zs.a.N();
                                float fN24 = zs.a.N();
                                float f17 = zs.a.f24110g;
                                float f18 = fN21 + f17;
                                float f19 = zs.a.f24111h;
                                float f20 = fN22 + f19;
                                float f21 = (f17 * 2.0f) - zs.a.f24112i;
                                float f22 = (f19 * 2.0f) - zs.a.j;
                                zs.a.f24112i = f18;
                                zs.a.j = f20;
                                zs.a.q(f21, f22, f18, f20, fN23 + f17, fN24 + f19);
                                break;
                            case 't':
                                float fN25 = zs.a.N();
                                float fN26 = zs.a.N();
                                float f23 = zs.a.f24110g;
                                float f24 = zs.a.f24111h;
                                zs.a.Q((f23 * 2.0f) - zs.a.f24112i, (f24 * 2.0f) - zs.a.j, fN25 + f23, fN26 + f24);
                                break;
                            case 'v':
                                zs.a.H(zs.a.f24110g + 0.0f, zs.a.N() + zs.a.f24111h);
                                break;
                            default:
                                throw new IllegalArgumentException(String.format("Unexpected comand '%c' (s=%s)", Character.valueOf(c8), zs.a.f24107d));
                        }
                        if (z5) {
                            c8 = zIsUpperCase ? 'M' : 'm';
                        }
                    }
                }
                path = zs.a.f24108e;
            }
            i0Var.f6731d = path;
            ArrayList<h0> arrayList = zs.a.f24109f;
            i0Var.elements = arrayList;
            Iterator<h0> it = arrayList.iterator();
            while (it.hasNext()) {
                for (k0 k0Var : it.next().f6726b) {
                    double d6 = k0Var.f6743a;
                    double d7 = i0Var.mScale;
                    k0Var.f6743a = d6 * d7;
                    k0Var.f6744b *= d7;
                }
            }
            i0Var.invalidate();
        }
    }

    public static class PatternManager extends GroupViewManagerAbstract<j0> implements RNSVGPatternManagerInterface<j0> {
        public static final String REACT_CLASS = "RNSVGPattern";

        public PatternManager() {
            super(VirtualViewManager.SVGClass.RNSVGPattern);
            ((VirtualViewManager) this).mDelegate = new RNSVGPatternManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = "align")
        public void setAlign(j0 j0Var, String str) {
            j0Var.M = str;
            j0Var.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i7) {
            super.setClipRule((VirtualView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(customType = "Color", name = ViewProps.COLOR)
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((RenderableView) view, num);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = ViewProps.DISPLAY)
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            super.setFill((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(defaultFloat = JankStatsAggregatorKt.DEFAULT_JANK_MULTIPLIER, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f2) {
            super.setFillOpacity((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i7) {
            super.setFillRule((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = ViewProps.FILTER)
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = "font")
        public /* bridge */ /* synthetic */ void setFont(View view, Dynamic dynamic) {
            super.setFont((a0) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = ViewProps.FONT_SIZE)
        public /* bridge */ /* synthetic */ void setFontSize(View view, Dynamic dynamic) {
            super.setFontSize((a0) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = ViewProps.FONT_WEIGHT)
        public /* bridge */ /* synthetic */ void setFontWeight(View view, Dynamic dynamic) {
            super.setFontWeight((a0) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = "meetOrSlice")
        public void setMeetOrSlice(j0 j0Var, int i7) {
            j0Var.N = i7;
            j0Var.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = "minX")
        public void setMinX(j0 j0Var, float f2) {
            j0Var.I = f2;
            j0Var.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = "minY")
        public void setMinY(j0 j0Var, float f2) {
            j0Var.J = f2;
            j0Var.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = StackTraceHelper.NAME_KEY)
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @ReactProp(defaultFloat = JankStatsAggregatorKt.DEFAULT_JANK_MULTIPLIER, name = ViewProps.OPACITY)
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f2) {
            super.setOpacity((VirtualView) view, f2);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = "patternContentUnits")
        public void setPatternContentUnits(j0 j0Var, int i7) {
            if (i7 == 0) {
                j0Var.H = 1;
            } else if (i7 == 1) {
                j0Var.H = 2;
            }
            j0Var.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = "patternTransform")
        public void setPatternTransform(j0 j0Var, ReadableArray readableArray) {
            if (readableArray != null) {
                float[] fArr = j0.P;
                int iC = a.a.C(readableArray, fArr, j0Var.mScale);
                if (iC == 6) {
                    if (j0Var.O == null) {
                        j0Var.O = new Matrix();
                    }
                    j0Var.O.setValues(fArr);
                } else if (iC != -1) {
                    o8.a.v(ReactConstants.TAG, "RNSVG: Transform matrices must be of size 6");
                }
            } else {
                j0Var.O = null;
            }
            j0Var.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = "patternUnits")
        public void setPatternUnits(j0 j0Var, int i7) {
            if (i7 == 0) {
                j0Var.G = 1;
            } else if (i7 == 1) {
                j0Var.G = 2;
            }
            j0Var.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = ViewProps.POINTER_EVENTS)
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z5) {
            super.setResponsible((VirtualView) view, z5);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            super.setStroke((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f2) {
            super.setStrokeDashoffset((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i7) {
            super.setStrokeLinecap((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i7) {
            super.setStrokeLinejoin((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(defaultFloat = BulletSpan.STANDARD_STROKE_WIDTH_PX, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f2) {
            super.setStrokeMiterlimit((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(defaultFloat = JankStatsAggregatorKt.DEFAULT_JANK_MULTIPLIER, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f2) {
            super.setStrokeOpacity((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = "vbHeight")
        public void setVbHeight(j0 j0Var, float f2) {
            j0Var.L = f2;
            j0Var.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = "vbWidth")
        public void setVbWidth(j0 j0Var, float f2) {
            j0Var.K = f2;
            j0Var.invalidate();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i7) {
            super.setVectorEffect((RenderableView) view, i7);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = "height")
        public void setHeight(j0 j0Var, Dynamic dynamic) {
            j0Var.getClass();
            j0Var.F = r0.b(dynamic);
            j0Var.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = "width")
        public void setWidth(j0 j0Var, Dynamic dynamic) {
            j0Var.getClass();
            j0Var.E = r0.b(dynamic);
            j0Var.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = "x")
        public void setX(j0 j0Var, Dynamic dynamic) {
            j0Var.getClass();
            j0Var.f6738x = r0.b(dynamic);
            j0Var.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = "y")
        public void setY(j0 j0Var, Dynamic dynamic) {
            j0Var.getClass();
            j0Var.f6739y = r0.b(dynamic);
            j0Var.invalidate();
        }
    }

    public static class RadialGradientManager extends VirtualViewManager<n0> implements RNSVGRadialGradientManagerInterface<n0> {
        public static final String REACT_CLASS = "RNSVGRadialGradient";

        public RadialGradientManager() {
            super(VirtualViewManager.SVGClass.RNSVGRadialGradient);
            ((VirtualViewManager) this).mDelegate = new RNSVGRadialGradientManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        @ReactProp(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        @ReactProp(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i7) {
            super.setClipRule((VirtualView) view, i7);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        @ReactProp(name = ViewProps.DISPLAY)
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        @ReactProp(name = "gradient")
        public void setGradient(n0 n0Var, ReadableArray readableArray) {
            n0Var.f6768y = readableArray;
            n0Var.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        @ReactProp(name = "gradientTransform")
        public void setGradientTransform(n0 n0Var, ReadableArray readableArray) {
            if (readableArray != null) {
                float[] fArr = n0.G;
                int iC = a.a.C(readableArray, fArr, n0Var.mScale);
                if (iC == 6) {
                    if (n0Var.F == null) {
                        n0Var.F = new Matrix();
                    }
                    n0Var.F.setValues(fArr);
                } else if (iC != -1) {
                    o8.a.v(ReactConstants.TAG, "RNSVG: Transform matrices must be of size 6");
                }
            } else {
                n0Var.F = null;
            }
            n0Var.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        @ReactProp(name = "gradientUnits")
        public void setGradientUnits(n0 n0Var, int i7) {
            if (i7 == 0) {
                n0Var.E = 1;
            } else if (i7 == 1) {
                n0Var.E = 2;
            }
            n0Var.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        @ReactProp(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        @ReactProp(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        @ReactProp(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        @ReactProp(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        @ReactProp(name = StackTraceHelper.NAME_KEY)
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @ReactProp(defaultFloat = JankStatsAggregatorKt.DEFAULT_JANK_MULTIPLIER, name = ViewProps.OPACITY)
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f2) {
            super.setOpacity((VirtualView) view, f2);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        @ReactProp(name = ViewProps.POINTER_EVENTS)
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        @ReactProp(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z5) {
            super.setResponsible((VirtualView) view, z5);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        @ReactProp(name = "cx")
        public void setCx(n0 n0Var, Dynamic dynamic) {
            n0Var.getClass();
            n0Var.f6766w = r0.b(dynamic);
            n0Var.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        @ReactProp(name = "cy")
        public void setCy(n0 n0Var, Dynamic dynamic) {
            n0Var.getClass();
            n0Var.f6767x = r0.b(dynamic);
            n0Var.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        @ReactProp(name = "fx")
        public void setFx(n0 n0Var, Dynamic dynamic) {
            n0Var.getClass();
            n0Var.f6762d = r0.b(dynamic);
            n0Var.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        @ReactProp(name = "fy")
        public void setFy(n0 n0Var, Dynamic dynamic) {
            n0Var.getClass();
            n0Var.f6763e = r0.b(dynamic);
            n0Var.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        @ReactProp(name = "rx")
        public void setRx(n0 n0Var, Dynamic dynamic) {
            n0Var.getClass();
            n0Var.f6764i = r0.b(dynamic);
            n0Var.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        @ReactProp(name = "ry")
        public void setRy(n0 n0Var, Dynamic dynamic) {
            n0Var.getClass();
            n0Var.f6765v = r0.b(dynamic);
            n0Var.invalidate();
        }
    }

    public static class RectViewManager extends RenderableViewManager<o0> implements RNSVGRectManagerInterface<o0> {
        public static final String REACT_CLASS = "RNSVGRect";

        public RectViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGRect);
            ((VirtualViewManager) this).mDelegate = new RNSVGRectManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i7) {
            super.setClipRule((VirtualView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(customType = "Color", name = ViewProps.COLOR)
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((RenderableView) view, num);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(name = ViewProps.DISPLAY)
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            super.setFill((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(defaultFloat = JankStatsAggregatorKt.DEFAULT_JANK_MULTIPLIER, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f2) {
            super.setFillOpacity((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i7) {
            super.setFillRule((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(name = ViewProps.FILTER)
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(name = StackTraceHelper.NAME_KEY)
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @ReactProp(defaultFloat = JankStatsAggregatorKt.DEFAULT_JANK_MULTIPLIER, name = ViewProps.OPACITY)
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f2) {
            super.setOpacity((VirtualView) view, f2);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(name = ViewProps.POINTER_EVENTS)
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z5) {
            super.setResponsible((VirtualView) view, z5);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            super.setStroke((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f2) {
            super.setStrokeDashoffset((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i7) {
            super.setStrokeLinecap((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i7) {
            super.setStrokeLinejoin((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(defaultFloat = BulletSpan.STANDARD_STROKE_WIDTH_PX, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f2) {
            super.setStrokeMiterlimit((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(defaultFloat = JankStatsAggregatorKt.DEFAULT_JANK_MULTIPLIER, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f2) {
            super.setStrokeOpacity((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i7) {
            super.setVectorEffect((RenderableView) view, i7);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(name = "height")
        public void setHeight(o0 o0Var, Dynamic dynamic) {
            o0Var.getClass();
            o0Var.f6774v = r0.b(dynamic);
            o0Var.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(name = "rx")
        public void setRx(o0 o0Var, Dynamic dynamic) {
            o0Var.getClass();
            o0Var.f6775w = r0.b(dynamic);
            o0Var.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(name = "ry")
        public void setRy(o0 o0Var, Dynamic dynamic) {
            o0Var.getClass();
            o0Var.f6776x = r0.b(dynamic);
            o0Var.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(name = "width")
        public void setWidth(o0 o0Var, Dynamic dynamic) {
            o0Var.getClass();
            o0Var.f6773i = r0.b(dynamic);
            o0Var.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(name = "x")
        public void setX(o0 o0Var, Dynamic dynamic) {
            o0Var.getClass();
            o0Var.f6771d = r0.b(dynamic);
            o0Var.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(name = "y")
        public void setY(o0 o0Var, Dynamic dynamic) {
            o0Var.getClass();
            o0Var.f6772e = r0.b(dynamic);
            o0Var.invalidate();
        }
    }

    public static class SymbolManager extends GroupViewManagerAbstract<z1> implements RNSVGSymbolManagerInterface<z1> {
        public static final String REACT_CLASS = "RNSVGSymbol";

        public SymbolManager() {
            super(VirtualViewManager.SVGClass.RNSVGSymbol);
            ((VirtualViewManager) this).mDelegate = new RNSVGSymbolManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(name = "align")
        public void setAlign(z1 z1Var, String str) {
            z1Var.G = str;
            z1Var.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i7) {
            super.setClipRule((VirtualView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(customType = "Color", name = ViewProps.COLOR)
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((RenderableView) view, num);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(name = ViewProps.DISPLAY)
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            super.setFill((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(defaultFloat = JankStatsAggregatorKt.DEFAULT_JANK_MULTIPLIER, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f2) {
            super.setFillOpacity((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i7) {
            super.setFillRule((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(name = ViewProps.FILTER)
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(name = "font")
        public /* bridge */ /* synthetic */ void setFont(View view, Dynamic dynamic) {
            super.setFont((a0) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(name = ViewProps.FONT_SIZE)
        public /* bridge */ /* synthetic */ void setFontSize(View view, Dynamic dynamic) {
            super.setFontSize((a0) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(name = ViewProps.FONT_WEIGHT)
        public /* bridge */ /* synthetic */ void setFontWeight(View view, Dynamic dynamic) {
            super.setFontWeight((a0) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(name = "meetOrSlice")
        public void setMeetOrSlice(z1 z1Var, int i7) {
            z1Var.H = i7;
            z1Var.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(name = "minX")
        public void setMinX(z1 z1Var, float f2) {
            z1Var.f6853x = f2;
            z1Var.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(name = "minY")
        public void setMinY(z1 z1Var, float f2) {
            z1Var.f6854y = f2;
            z1Var.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(name = StackTraceHelper.NAME_KEY)
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @ReactProp(defaultFloat = JankStatsAggregatorKt.DEFAULT_JANK_MULTIPLIER, name = ViewProps.OPACITY)
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f2) {
            super.setOpacity((VirtualView) view, f2);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(name = ViewProps.POINTER_EVENTS)
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z5) {
            super.setResponsible((VirtualView) view, z5);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            super.setStroke((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f2) {
            super.setStrokeDashoffset((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i7) {
            super.setStrokeLinecap((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i7) {
            super.setStrokeLinejoin((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(defaultFloat = BulletSpan.STANDARD_STROKE_WIDTH_PX, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f2) {
            super.setStrokeMiterlimit((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(defaultFloat = JankStatsAggregatorKt.DEFAULT_JANK_MULTIPLIER, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f2) {
            super.setStrokeOpacity((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(name = "vbHeight")
        public void setVbHeight(z1 z1Var, float f2) {
            z1Var.F = f2;
            z1Var.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(name = "vbWidth")
        public void setVbWidth(z1 z1Var, float f2) {
            z1Var.E = f2;
            z1Var.invalidate();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i7) {
            super.setVectorEffect((RenderableView) view, i7);
        }
    }

    public static class TextPathViewManager extends TextViewManagerAbstract<b2> implements RNSVGTextPathManagerInterface<b2> {
        public static final String REACT_CLASS = "RNSVGTextPath";

        public TextPathViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGTextPath);
            ((VirtualViewManager) this).mDelegate = new RNSVGTextPathManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        public /* bridge */ /* synthetic */ void setAlignmentBaseline(View view, String str) {
            super.setAlignmentBaseline((f2) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = "baselineShift")
        public /* bridge */ /* synthetic */ void setBaselineShift(View view, Dynamic dynamic) {
            super.setBaselineShift((f2) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i7) {
            super.setClipRule((VirtualView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(customType = "Color", name = ViewProps.COLOR)
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((RenderableView) view, num);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = ViewProps.DISPLAY)
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = "dx")
        public /* bridge */ /* synthetic */ void setDx(View view, Dynamic dynamic) {
            super.setDx((f2) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = "dy")
        public /* bridge */ /* synthetic */ void setDy(View view, Dynamic dynamic) {
            super.setDy((f2) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            super.setFill((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(defaultFloat = JankStatsAggregatorKt.DEFAULT_JANK_MULTIPLIER, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f2) {
            super.setFillOpacity((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i7) {
            super.setFillRule((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = ViewProps.FILTER)
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = "font")
        public /* bridge */ /* synthetic */ void setFont(View view, Dynamic dynamic) {
            super.setFont((f2) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = ViewProps.FONT_SIZE)
        public /* bridge */ /* synthetic */ void setFontSize(View view, Dynamic dynamic) {
            super.setFontSize((a0) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = ViewProps.FONT_WEIGHT)
        public /* bridge */ /* synthetic */ void setFontWeight(View view, Dynamic dynamic) {
            super.setFontWeight((a0) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = "href")
        public void setHref(b2 b2Var, String str) {
            b2Var.N = str;
            b2Var.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = "inlineSize")
        public /* bridge */ /* synthetic */ void setInlineSize(View view, Dynamic dynamic) {
            super.setInlineSize((f2) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = "lengthAdjust")
        public /* bridge */ /* synthetic */ void setLengthAdjust(View view, String str) {
            super.setLengthAdjust((f2) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = StackTraceHelper.NAME_KEY)
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @ReactProp(defaultFloat = JankStatsAggregatorKt.DEFAULT_JANK_MULTIPLIER, name = ViewProps.OPACITY)
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f2) {
            super.setOpacity((VirtualView) view, f2);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = ViewProps.POINTER_EVENTS)
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z5) {
            super.setResponsible((VirtualView) view, z5);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = "rotate")
        public /* bridge */ /* synthetic */ void setRotate(View view, Dynamic dynamic) {
            super.setRotate((f2) view, dynamic);
        }

        @ReactProp(name = "midLine")
        public void setSharp(b2 b2Var, String str) {
            b2Var.getClass();
            b2Var.P = com.discord.chat.presentation.list.a.v(str);
            b2Var.invalidate();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            super.setStroke((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f2) {
            super.setStrokeDashoffset((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i7) {
            super.setStrokeLinecap((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i7) {
            super.setStrokeLinejoin((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(defaultFloat = BulletSpan.STANDARD_STROKE_WIDTH_PX, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f2) {
            super.setStrokeMiterlimit((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(defaultFloat = JankStatsAggregatorKt.DEFAULT_JANK_MULTIPLIER, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f2) {
            super.setStrokeOpacity((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = "textLength")
        public /* bridge */ /* synthetic */ void setTextLength(View view, Dynamic dynamic) {
            super.setTextLength((f2) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i7) {
            super.setVectorEffect((RenderableView) view, i7);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = "verticalAlign")
        public /* bridge */ /* synthetic */ void setVerticalAlign(View view, Dynamic dynamic) {
            super.setVerticalAlign((f2) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = "x")
        public /* bridge */ /* synthetic */ void setX(View view, Dynamic dynamic) {
            super.setX((f2) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = "y")
        public /* bridge */ /* synthetic */ void setY(View view, Dynamic dynamic) {
            super.setY((f2) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        public void setMidLine(b2 b2Var, String str) {
            b2Var.getClass();
            b2Var.P = com.discord.chat.presentation.list.a.v(str);
            b2Var.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = "side")
        public void setSide(b2 b2Var, String str) {
            int i7;
            b2Var.getClass();
            if (str == null) {
                throw new NullPointerException("Name is null");
            }
            if (str.equals(ViewProps.LEFT)) {
                i7 = 1;
            } else {
                if (!str.equals(ViewProps.RIGHT)) {
                    throw new IllegalArgumentException("No enum constant com.horcrux.svg.TextProperties.TextPathSide.".concat(str));
                }
                i7 = 2;
            }
            b2Var.O = i7;
            b2Var.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = "spacing")
        public void setSpacing(b2 b2Var, String str) {
            b2Var.getClass();
            if (str == null) {
                throw new NullPointerException("Name is null");
            }
            if (!str.equals("auto") && !str.equals("exact")) {
                throw new IllegalArgumentException("No enum constant com.horcrux.svg.TextProperties.TextPathSpacing.".concat(str));
            }
            b2Var.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = "startOffset")
        public void setStartOffset(b2 b2Var, Dynamic dynamic) {
            b2Var.getClass();
            b2Var.Q = r0.b(dynamic);
            b2Var.invalidate();
        }

        public TextPathViewManager(VirtualViewManager.SVGClass sVGClass) {
            super(sVGClass);
            ((VirtualViewManager) this).mDelegate = new RNSVGTextPathManagerDelegate(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager.TextViewManagerAbstract
        @ReactProp(name = "method")
        public void setMethod(b2 b2Var, String str) {
            b2Var.l(str);
        }
    }

    public static class TextViewManagerAbstract<K extends f2> extends GroupViewManagerAbstract<K> {
        public TextViewManagerAbstract(VirtualViewManager.SVGClass sVGClass) {
            super(sVGClass);
        }

        public void setAlignmentBaseline(K k, String str) {
            k.l(str);
        }

        @ReactProp(name = "baselineShift")
        public void setBaselineShift(K k, Dynamic dynamic) {
            k.getClass();
            k.E = r0.c(dynamic);
            k.invalidate();
        }

        @ReactProp(name = "dx")
        public void setDx(K k, Dynamic dynamic) {
            k.getClass();
            k.K = r0.a(dynamic);
            k.invalidate();
        }

        @ReactProp(name = "dy")
        public void setDy(K k, Dynamic dynamic) {
            k.getClass();
            k.L = r0.a(dynamic);
            k.invalidate();
        }

        @ReactProp(name = "inlineSize")
        public void setInlineSize(K k, Dynamic dynamic) {
            k.getClass();
            k.f6709x = r0.b(dynamic);
            k.invalidate();
        }

        @ReactProp(name = "lengthAdjust")
        public void setLengthAdjust(K k, String str) {
            int i7;
            k.getClass();
            if (str == null) {
                throw new NullPointerException("Name is null");
            }
            if (str.equals("spacing")) {
                i7 = 1;
            } else {
                if (!str.equals("spacingAndGlyphs")) {
                    throw new IllegalArgumentException("No enum constant com.horcrux.svg.TextProperties.TextLengthAdjust.".concat(str));
                }
                i7 = 2;
            }
            k.F = i7;
            k.invalidate();
        }

        @ReactProp(name = "alignmentBaseline")
        public void setMethod(K k, String str) {
            k.l(str);
        }

        @ReactProp(name = "rotate")
        public void setRotate(K k, Dynamic dynamic) {
            k.getClass();
            k.J = r0.a(dynamic);
            k.invalidate();
        }

        @ReactProp(name = "textLength")
        public void setTextLength(K k, Dynamic dynamic) {
            k.getClass();
            k.f6710y = r0.b(dynamic);
            k.invalidate();
        }

        @ReactProp(name = "verticalAlign")
        public void setVerticalAlign(K k, Dynamic dynamic) {
            k.getClass();
            String strC = r0.c(dynamic);
            if (strC != null) {
                String strTrim = strC.trim();
                int iLastIndexOf = strTrim.lastIndexOf(32);
                try {
                    k.G = c2.a(strTrim.substring(iLastIndexOf));
                } catch (IllegalArgumentException unused) {
                    k.G = c2.baseline;
                }
                try {
                    k.E = strTrim.substring(0, iLastIndexOf);
                } catch (IndexOutOfBoundsException unused2) {
                    k.E = null;
                }
            } else {
                k.G = c2.baseline;
                k.E = null;
            }
            k.invalidate();
        }

        @ReactProp(name = "x")
        public void setX(K k, Dynamic dynamic) {
            k.getClass();
            k.H = r0.a(dynamic);
            k.invalidate();
        }

        @ReactProp(name = "y")
        public void setY(K k, Dynamic dynamic) {
            k.getClass();
            k.I = r0.a(dynamic);
            k.invalidate();
        }

        @Override // com.horcrux.svg.RenderableViewManager.GroupViewManagerAbstract
        @ReactProp(name = "font")
        public void setFont(K k, Dynamic dynamic) {
            k.getClass();
            if (dynamic.getType() == ReadableType.Map) {
                k.f6663d = dynamic.asMap();
            } else {
                k.f6663d = null;
            }
            k.invalidate();
        }
    }

    public static class UseViewManager extends RenderableViewManager<g2> implements RNSVGUseManagerInterface<g2> {
        public static final String REACT_CLASS = "RNSVGUse";

        public UseViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGUse);
            ((VirtualViewManager) this).mDelegate = new RNSVGUseManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i7) {
            super.setClipRule((VirtualView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(customType = "Color", name = ViewProps.COLOR)
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((RenderableView) view, num);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(name = ViewProps.DISPLAY)
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            super.setFill((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(defaultFloat = JankStatsAggregatorKt.DEFAULT_JANK_MULTIPLIER, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f2) {
            super.setFillOpacity((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i7) {
            super.setFillRule((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(name = ViewProps.FILTER)
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(name = "href")
        public void setHref(g2 g2Var, String str) {
            g2Var.f6717d = str;
            g2Var.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(name = StackTraceHelper.NAME_KEY)
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @ReactProp(defaultFloat = JankStatsAggregatorKt.DEFAULT_JANK_MULTIPLIER, name = ViewProps.OPACITY)
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f2) {
            super.setOpacity((VirtualView) view, f2);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(name = ViewProps.POINTER_EVENTS)
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z5) {
            super.setResponsible((VirtualView) view, z5);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            super.setStroke((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f2) {
            super.setStrokeDashoffset((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i7) {
            super.setStrokeLinecap((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i7) {
            super.setStrokeLinejoin((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(defaultFloat = BulletSpan.STANDARD_STROKE_WIDTH_PX, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f2) {
            super.setStrokeMiterlimit((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(defaultFloat = JankStatsAggregatorKt.DEFAULT_JANK_MULTIPLIER, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f2) {
            super.setStrokeOpacity((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i7) {
            super.setVectorEffect((RenderableView) view, i7);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(name = "height")
        public void setHeight(g2 g2Var, Dynamic dynamic) {
            g2Var.getClass();
            g2Var.f6721w = r0.b(dynamic);
            g2Var.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(name = "width")
        public void setWidth(g2 g2Var, Dynamic dynamic) {
            g2Var.getClass();
            g2Var.f6720v = r0.b(dynamic);
            g2Var.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(name = "x")
        public void setX(g2 g2Var, Dynamic dynamic) {
            g2Var.getClass();
            g2Var.f6718e = r0.b(dynamic);
            g2Var.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(name = "y")
        public void setY(g2 g2Var, Dynamic dynamic) {
            g2Var.getClass();
            g2Var.f6719i = r0.b(dynamic);
            g2Var.invalidate();
        }
    }

    public RenderableViewManager(VirtualViewManager.SVGClass sVGClass) {
        super(sVGClass);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        HashMap map = new HashMap();
        map.put(SvgOnLayoutEvent.EVENT_NAME, MapBuilder.of("registrationName", "onSvgLayout"));
        return map;
    }

    @ReactProp(customType = "Color", name = ViewProps.COLOR)
    public void setColor(T t5, Integer num) {
        t5.setCurrentColor(num);
    }

    @ReactProp(name = "fill")
    public void setFill(T t5, Dynamic dynamic) {
        t5.setFill(dynamic);
    }

    @ReactProp(defaultFloat = JankStatsAggregatorKt.DEFAULT_JANK_MULTIPLIER, name = "fillOpacity")
    public void setFillOpacity(T t5, float f2) {
        t5.setFillOpacity(f2);
    }

    @ReactProp(defaultInt = 1, name = "fillRule")
    public void setFillRule(T t5, int i7) {
        t5.setFillRule(i7);
    }

    @ReactProp(name = ViewProps.FILTER)
    public void setFilter(T t5, String str) {
        t5.setFilter(str);
    }

    @ReactProp(name = "propList")
    public void setPropList(T t5, ReadableArray readableArray) {
        t5.setPropList(readableArray);
    }

    @ReactProp(name = "stroke")
    public void setStroke(T t5, Dynamic dynamic) {
        t5.setStroke(dynamic);
    }

    @ReactProp(name = "strokeDasharray")
    public void setStrokeDasharray(T t5, Dynamic dynamic) {
        t5.setStrokeDasharray(dynamic);
    }

    @ReactProp(name = "strokeDashoffset")
    public void setStrokeDashoffset(T t5, float f2) {
        t5.setStrokeDashoffset(f2);
    }

    @ReactProp(defaultInt = 1, name = "strokeLinecap")
    public void setStrokeLinecap(T t5, int i7) {
        t5.setStrokeLinecap(i7);
    }

    @ReactProp(defaultInt = 1, name = "strokeLinejoin")
    public void setStrokeLinejoin(T t5, int i7) {
        t5.setStrokeLinejoin(i7);
    }

    @ReactProp(defaultFloat = BulletSpan.STANDARD_STROKE_WIDTH_PX, name = "strokeMiterlimit")
    public void setStrokeMiterlimit(T t5, float f2) {
        t5.setStrokeMiterlimit(f2);
    }

    @ReactProp(defaultFloat = JankStatsAggregatorKt.DEFAULT_JANK_MULTIPLIER, name = "strokeOpacity")
    public void setStrokeOpacity(T t5, float f2) {
        t5.setStrokeOpacity(f2);
    }

    @ReactProp(name = "strokeWidth")
    public void setStrokeWidth(T t5, Dynamic dynamic) {
        t5.setStrokeWidth(dynamic);
    }

    @ReactProp(name = "vectorEffect")
    public void setVectorEffect(T t5, int i7) {
        t5.setVectorEffect(i7);
    }

    public static class TSpanViewManager extends TextViewManagerAbstract<a2> implements RNSVGTSpanManagerInterface<a2> {
        public static final String REACT_CLASS = "RNSVGTSpan";

        public TSpanViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGTSpan);
            ((VirtualViewManager) this).mDelegate = new RNSVGTSpanManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        public /* bridge */ /* synthetic */ void setAlignmentBaseline(View view, String str) {
            super.setAlignmentBaseline((f2) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = "baselineShift")
        public /* bridge */ /* synthetic */ void setBaselineShift(View view, Dynamic dynamic) {
            super.setBaselineShift((f2) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i7) {
            super.setClipRule((VirtualView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(customType = "Color", name = ViewProps.COLOR)
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((RenderableView) view, num);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = "content")
        public void setContent(a2 a2Var, String str) {
            a2Var.O = str;
            a2Var.invalidate();
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = ViewProps.DISPLAY)
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = "dx")
        public /* bridge */ /* synthetic */ void setDx(View view, Dynamic dynamic) {
            super.setDx((f2) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = "dy")
        public /* bridge */ /* synthetic */ void setDy(View view, Dynamic dynamic) {
            super.setDy((f2) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            super.setFill((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(defaultFloat = JankStatsAggregatorKt.DEFAULT_JANK_MULTIPLIER, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f2) {
            super.setFillOpacity((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i7) {
            super.setFillRule((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = ViewProps.FILTER)
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = "font")
        public /* bridge */ /* synthetic */ void setFont(View view, Dynamic dynamic) {
            super.setFont((f2) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = ViewProps.FONT_SIZE)
        public /* bridge */ /* synthetic */ void setFontSize(View view, Dynamic dynamic) {
            super.setFontSize((a0) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = ViewProps.FONT_WEIGHT)
        public /* bridge */ /* synthetic */ void setFontWeight(View view, Dynamic dynamic) {
            super.setFontWeight((a0) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = "inlineSize")
        public /* bridge */ /* synthetic */ void setInlineSize(View view, Dynamic dynamic) {
            super.setInlineSize((f2) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = "lengthAdjust")
        public /* bridge */ /* synthetic */ void setLengthAdjust(View view, String str) {
            super.setLengthAdjust((f2) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = StackTraceHelper.NAME_KEY)
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @ReactProp(defaultFloat = JankStatsAggregatorKt.DEFAULT_JANK_MULTIPLIER, name = ViewProps.OPACITY)
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f2) {
            super.setOpacity((VirtualView) view, f2);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = ViewProps.POINTER_EVENTS)
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z5) {
            super.setResponsible((VirtualView) view, z5);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = "rotate")
        public /* bridge */ /* synthetic */ void setRotate(View view, Dynamic dynamic) {
            super.setRotate((f2) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            super.setStroke((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f2) {
            super.setStrokeDashoffset((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i7) {
            super.setStrokeLinecap((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i7) {
            super.setStrokeLinejoin((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(defaultFloat = BulletSpan.STANDARD_STROKE_WIDTH_PX, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f2) {
            super.setStrokeMiterlimit((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(defaultFloat = JankStatsAggregatorKt.DEFAULT_JANK_MULTIPLIER, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f2) {
            super.setStrokeOpacity((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = "textLength")
        public /* bridge */ /* synthetic */ void setTextLength(View view, Dynamic dynamic) {
            super.setTextLength((f2) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i7) {
            super.setVectorEffect((RenderableView) view, i7);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = "verticalAlign")
        public /* bridge */ /* synthetic */ void setVerticalAlign(View view, Dynamic dynamic) {
            super.setVerticalAlign((f2) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = "x")
        public /* bridge */ /* synthetic */ void setX(View view, Dynamic dynamic) {
            super.setX((f2) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = "y")
        public /* bridge */ /* synthetic */ void setY(View view, Dynamic dynamic) {
            super.setY((f2) view, dynamic);
        }

        public TSpanViewManager(VirtualViewManager.SVGClass sVGClass) {
            super(sVGClass);
            ((VirtualViewManager) this).mDelegate = new RNSVGTSpanManagerDelegate(this);
        }
    }

    public static class TextViewManager extends TextViewManagerAbstract<f2> implements RNSVGTextManagerInterface<f2> {
        public static final String REACT_CLASS = "RNSVGText";

        public TextViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGText);
            ((VirtualViewManager) this).mDelegate = new RNSVGTextManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        public /* bridge */ /* synthetic */ void setAlignmentBaseline(View view, String str) {
            super.setAlignmentBaseline((f2) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = "baselineShift")
        public /* bridge */ /* synthetic */ void setBaselineShift(View view, Dynamic dynamic) {
            super.setBaselineShift((f2) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i7) {
            super.setClipRule((VirtualView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(customType = "Color", name = ViewProps.COLOR)
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((RenderableView) view, num);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = ViewProps.DISPLAY)
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = "dx")
        public /* bridge */ /* synthetic */ void setDx(View view, Dynamic dynamic) {
            super.setDx((f2) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = "dy")
        public /* bridge */ /* synthetic */ void setDy(View view, Dynamic dynamic) {
            super.setDy((f2) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            super.setFill((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(defaultFloat = JankStatsAggregatorKt.DEFAULT_JANK_MULTIPLIER, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f2) {
            super.setFillOpacity((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i7) {
            super.setFillRule((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = ViewProps.FILTER)
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = "font")
        public /* bridge */ /* synthetic */ void setFont(View view, Dynamic dynamic) {
            super.setFont((f2) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = ViewProps.FONT_SIZE)
        public /* bridge */ /* synthetic */ void setFontSize(View view, Dynamic dynamic) {
            super.setFontSize((a0) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = ViewProps.FONT_WEIGHT)
        public /* bridge */ /* synthetic */ void setFontWeight(View view, Dynamic dynamic) {
            super.setFontWeight((a0) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = "inlineSize")
        public /* bridge */ /* synthetic */ void setInlineSize(View view, Dynamic dynamic) {
            super.setInlineSize((f2) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = "lengthAdjust")
        public /* bridge */ /* synthetic */ void setLengthAdjust(View view, String str) {
            super.setLengthAdjust((f2) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = StackTraceHelper.NAME_KEY)
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @ReactProp(defaultFloat = JankStatsAggregatorKt.DEFAULT_JANK_MULTIPLIER, name = ViewProps.OPACITY)
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f2) {
            super.setOpacity((VirtualView) view, f2);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = ViewProps.POINTER_EVENTS)
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z5) {
            super.setResponsible((VirtualView) view, z5);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = "rotate")
        public /* bridge */ /* synthetic */ void setRotate(View view, Dynamic dynamic) {
            super.setRotate((f2) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            super.setStroke((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f2) {
            super.setStrokeDashoffset((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i7) {
            super.setStrokeLinecap((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i7) {
            super.setStrokeLinejoin((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(defaultFloat = BulletSpan.STANDARD_STROKE_WIDTH_PX, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f2) {
            super.setStrokeMiterlimit((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(defaultFloat = JankStatsAggregatorKt.DEFAULT_JANK_MULTIPLIER, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f2) {
            super.setStrokeOpacity((RenderableView) view, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = "textLength")
        public /* bridge */ /* synthetic */ void setTextLength(View view, Dynamic dynamic) {
            super.setTextLength((f2) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i7) {
            super.setVectorEffect((RenderableView) view, i7);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = "verticalAlign")
        public /* bridge */ /* synthetic */ void setVerticalAlign(View view, Dynamic dynamic) {
            super.setVerticalAlign((f2) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = "x")
        public /* bridge */ /* synthetic */ void setX(View view, Dynamic dynamic) {
            super.setX((f2) view, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = "y")
        public /* bridge */ /* synthetic */ void setY(View view, Dynamic dynamic) {
            super.setY((f2) view, dynamic);
        }

        public TextViewManager(VirtualViewManager.SVGClass sVGClass) {
            super(sVGClass);
            ((VirtualViewManager) this).mDelegate = new RNSVGTextManagerDelegate(this);
        }
    }

    public void setFill(T t5, ReadableMap readableMap) {
        t5.setFill(readableMap);
    }

    public void setStroke(T t5, ReadableMap readableMap) {
        t5.setStroke(readableMap);
    }
}
