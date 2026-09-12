package com.discord.image.color_quantizer;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.util.SparseIntArray;
import com.facebook.react.uimanager.ViewProps;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u0000 (2\u00020\u0001:\u0002'(B\u001b\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\"\u0010\u0017\u001a\u00020\u00182\u0010\u0010\u0019\u001a\f\u0012\b\u0012\u00060\u001bR\u00020\u00000\u001a2\u0006\u0010\u001c\u001a\u00020\u0005H\u0002J \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0010\u0010\u001e\u001a\f\u0012\b\u0012\u00060\u001bR\u00020\u00000\u001fH\u0002J \u0010 \u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u0005H\u0002J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0005H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006)"}, d2 = {"Lcom/discord/image/color_quantizer/ColorCutQuantizer;", "", "colorHistogram", "Lcom/discord/image/color_quantizer/ColorHistogram;", "maxColors", "", "<init>", "(Lcom/discord/image/color_quantizer/ColorHistogram;I)V", "mTempHsl", "", "mColors", "", "mColorPopulations", "Landroid/util/SparseIntArray;", "mQuantizedColors", "", "Lcom/discord/image/color_quantizer/Swatch;", "quantizedColors", "", "getQuantizedColors", "()Ljava/util/List;", "quantizePixels", "maxColorIndex", "splitBoxes", "", "queue", "Ljava/util/PriorityQueue;", "Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;", "maxSize", "generateAverageColors", "vboxes", "", "modifySignificantOctet", "dimension", "lowIndex", "highIndex", "shouldIgnoreColor", "", ViewProps.COLOR, "Vbox", "Companion", "color_quantizer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nColorCutQuantizer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorCutQuantizer.kt\ncom/discord/image/color_quantizer/ColorCutQuantizer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,391:1\n1#2:392\n*E\n"})
public final class ColorCutQuantizer {
    private static final float BLACK_MAX_LIGHTNESS = 0.05f;
    private static final int COMPONENT_BLUE = -1;
    private static final int COMPONENT_GREEN = -2;
    private static final int COMPONENT_RED = -3;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Comparator<Vbox> VBOX_COMPARATOR_VOLUME = new a();
    private static final float WHITE_MIN_LIGHTNESS = 0.95f;

    @NotNull
    private final SparseIntArray mColorPopulations;

    @NotNull
    private final int[] mColors;

    @NotNull
    private final List<Swatch> mQuantizedColors;

    @NotNull
    private final float[] mTempHsl;

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bH\u0007J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0015H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u0018\u0010\u0019\u001a\f\u0012\b\u0012\u00060\u001bR\u00020\f0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/discord/image/color_quantizer/ColorCutQuantizer$Companion;", "", "<init>", "()V", "BLACK_MAX_LIGHTNESS", "", "WHITE_MIN_LIGHTNESS", "COMPONENT_RED", "", "COMPONENT_GREEN", "COMPONENT_BLUE", "fromBitmap", "Lcom/discord/image/color_quantizer/ColorCutQuantizer;", "bitmap", "Landroid/graphics/Bitmap;", "maxColors", "shouldIgnoreColor", "", ViewProps.COLOR, "Lcom/discord/image/color_quantizer/Swatch;", "hslColor", "", "isBlack", "isWhite", "isNearRedILine", "VBOX_COMPARATOR_VOLUME", "Ljava/util/Comparator;", "Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;", "color_quantizer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean isBlack(float[] hslColor) {
            return hslColor[2] <= ColorCutQuantizer.BLACK_MAX_LIGHTNESS;
        }

        private final boolean isNearRedILine(float[] hslColor) {
            float f2 = hslColor[0];
            return 10.0f <= f2 && f2 <= 37.0f && hslColor[1] <= 0.82f;
        }

        private final boolean isWhite(float[] hslColor) {
            return hslColor[2] >= ColorCutQuantizer.WHITE_MIN_LIGHTNESS;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean shouldIgnoreColor(Swatch color) {
            float[] hsl = color.getHsl();
            Intrinsics.checkNotNullExpressionValue(hsl, "getHsl(...)");
            return shouldIgnoreColor(hsl);
        }

        @NotNull
        public final ColorCutQuantizer fromBitmap(@NotNull Bitmap bitmap, int maxColors) {
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int[] iArr = new int[width * height];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            return new ColorCutQuantizer(new ColorHistogram(iArr), maxColors, null);
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean shouldIgnoreColor(float[] hslColor) {
            return isWhite(hslColor) || isBlack(hslColor) || isNearRedILine(hslColor);
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0014\u001a\u00020\u0015J\n\u0010\u0016\u001a\u00060\u0000R\u00020\u0017J\u0006\u0010\u001a\u001a\u00020\u0003J\u000e\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0012\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\u0018\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u000fR\u0011\u0010\u001b\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;", "", "lowerIndex", "", "upperIndex", "<init>", "(Lcom/discord/image/color_quantizer/ColorCutQuantizer;II)V", "minRed", "maxRed", "minGreen", "maxGreen", "minBlue", "maxBlue", "volume", "getVolume", "()I", "canSplit", "", "colorCount", "getColorCount", "fitBox", "", "splitBox", "Lcom/discord/image/color_quantizer/ColorCutQuantizer;", "longestColorDimension", "getLongestColorDimension", "findSplitPoint", "averageColor", "Lcom/discord/image/color_quantizer/Swatch;", "getAverageColor", "()Lcom/discord/image/color_quantizer/Swatch;", "midPoint", "dimension", "color_quantizer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nColorCutQuantizer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorCutQuantizer.kt\ncom/discord/image/color_quantizer/ColorCutQuantizer$Vbox\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,391:1\n1#2:392\n*E\n"})
    public final class Vbox {
        private final int lowerIndex;
        private int maxBlue;
        private int maxGreen;
        private int maxRed;
        private int minBlue;
        private int minGreen;
        private int minRed;
        private int upperIndex;

        public Vbox(int i7, int i10) {
            this.lowerIndex = i7;
            this.upperIndex = i10;
            fitBox();
        }

        public final boolean canSplit() {
            return getColorCount() > 1;
        }

        public final int findSplitPoint() {
            int longestColorDimension = getLongestColorDimension();
            ColorCutQuantizer.this.modifySignificantOctet(longestColorDimension, this.lowerIndex, this.upperIndex);
            Arrays.sort(ColorCutQuantizer.this.mColors, this.lowerIndex, this.upperIndex + 1);
            ColorCutQuantizer.this.modifySignificantOctet(longestColorDimension, this.lowerIndex, this.upperIndex);
            int iMidPoint = midPoint(longestColorDimension);
            int i7 = this.upperIndex;
            for (int i10 = this.lowerIndex; i10 < i7; i10++) {
                int i11 = ColorCutQuantizer.this.mColors[i10];
                if (longestColorDimension == ColorCutQuantizer.COMPONENT_RED) {
                    if (Color.red(i11) >= iMidPoint) {
                        return i10;
                    }
                } else if (longestColorDimension != ColorCutQuantizer.COMPONENT_GREEN) {
                    if (longestColorDimension == -1 && Color.blue(i11) > iMidPoint) {
                        return i10;
                    }
                } else {
                    if (Color.green(i11) >= iMidPoint) {
                        return i10;
                    }
                }
            }
            return this.lowerIndex;
        }

        public final void fitBox() {
            this.minBlue = 255;
            this.minGreen = 255;
            this.minRed = 255;
            this.maxBlue = 0;
            this.maxGreen = 0;
            this.maxRed = 0;
            int i7 = this.lowerIndex;
            int i10 = this.upperIndex;
            if (i7 > i10) {
                return;
            }
            while (true) {
                int i11 = ColorCutQuantizer.this.mColors[i7];
                int iRed = Color.red(i11);
                int iGreen = Color.green(i11);
                int iBlue = Color.blue(i11);
                if (iRed > this.maxRed) {
                    this.maxRed = iRed;
                }
                if (iRed < this.minRed) {
                    this.minRed = iRed;
                }
                if (iGreen > this.maxGreen) {
                    this.maxGreen = iGreen;
                }
                if (iGreen < this.minGreen) {
                    this.minGreen = iGreen;
                }
                if (iBlue > this.maxBlue) {
                    this.maxBlue = iBlue;
                }
                if (iBlue < this.minBlue) {
                    this.minBlue = iBlue;
                }
                if (i7 == i10) {
                    return;
                } else {
                    i7++;
                }
            }
        }

        @NotNull
        public final Swatch getAverageColor() {
            int i7;
            int iGreen;
            int iBlue;
            int i10 = this.lowerIndex;
            int i11 = this.upperIndex;
            int i12 = 0;
            if (i10 <= i11) {
                int iRed = 0;
                iGreen = 0;
                iBlue = 0;
                while (true) {
                    int i13 = ColorCutQuantizer.this.mColors[i10];
                    int i14 = ColorCutQuantizer.this.mColorPopulations.get(i13);
                    i12 += i14;
                    iRed += Color.red(i13) * i14;
                    iGreen += Color.green(i13) * i14;
                    iBlue += Color.blue(i13) * i14;
                    if (i10 == i11) {
                        break;
                    }
                    i10++;
                }
                i7 = i12;
                i12 = iRed;
            } else {
                i7 = 0;
                iGreen = 0;
                iBlue = 0;
            }
            float f2 = i12;
            float f7 = i7;
            return new Swatch(Math.round(f2 / f7), Math.round(iGreen / f7), Math.round(iBlue / f7), i7);
        }

        public final int getColorCount() {
            return this.upperIndex - this.lowerIndex;
        }

        public final int getLongestColorDimension() {
            int i7 = this.maxRed - this.minRed;
            int i10 = this.maxGreen - this.minGreen;
            int i11 = this.maxBlue - this.minBlue;
            if (i7 >= i10 && i7 >= i11) {
                return ColorCutQuantizer.COMPONENT_RED;
            }
            if (i10 < i7 || i10 < i11) {
                return -1;
            }
            return ColorCutQuantizer.COMPONENT_GREEN;
        }

        public final int getVolume() {
            return ((this.maxBlue - this.minBlue) + 1) * ((this.maxGreen - this.minGreen) + 1) * ((this.maxRed - this.minRed) + 1);
        }

        public final int midPoint(int dimension) {
            if (dimension == ColorCutQuantizer.COMPONENT_RED) {
                return (this.minRed + this.maxRed) / 2;
            }
            if (dimension != ColorCutQuantizer.COMPONENT_GREEN) {
                return dimension != -1 ? (this.minRed + this.maxRed) / 2 : (this.minBlue + this.maxBlue) / 2;
            }
            return (this.minGreen + this.maxGreen) / 2;
        }

        @NotNull
        public final Vbox splitBox() {
            if (!canSplit()) {
                throw new IllegalStateException("Can not split a box with only 1 color");
            }
            int iFindSplitPoint = findSplitPoint();
            Vbox vbox = ColorCutQuantizer.this.new Vbox(iFindSplitPoint + 1, this.upperIndex);
            this.upperIndex = iFindSplitPoint;
            fitBox();
            return vbox;
        }
    }

    public /* synthetic */ ColorCutQuantizer(ColorHistogram colorHistogram, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(colorHistogram, i7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int VBOX_COMPARATOR_VOLUME$lambda$2(Vbox vbox, Vbox vbox2) {
        return vbox2.getVolume() - vbox.getVolume();
    }

    @NotNull
    public static final ColorCutQuantizer fromBitmap(@NotNull Bitmap bitmap, int i7) {
        return INSTANCE.fromBitmap(bitmap, i7);
    }

    private final List<Swatch> generateAverageColors(Collection<Vbox> vboxes) {
        ArrayList arrayList = new ArrayList(vboxes.size());
        Iterator<Vbox> it = vboxes.iterator();
        while (it.hasNext()) {
            Swatch averageColor = it.next().getAverageColor();
            if (!INSTANCE.shouldIgnoreColor(averageColor)) {
                arrayList.add(averageColor);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void modifySignificantOctet(int dimension, int lowIndex, int highIndex) {
        if (dimension == COMPONENT_GREEN) {
            while (lowIndex <= highIndex) {
                int[] iArr = this.mColors;
                int i7 = iArr[lowIndex];
                iArr[lowIndex] = Color.rgb((i7 >> 8) & 255, (i7 >> 16) & 255, i7 & 255);
                lowIndex++;
            }
            return;
        }
        if (dimension != -1) {
            return;
        }
        while (lowIndex <= highIndex) {
            int[] iArr2 = this.mColors;
            int i10 = iArr2[lowIndex];
            iArr2[lowIndex] = Color.rgb(i10 & 255, (i10 >> 8) & 255, (i10 >> 16) & 255);
            lowIndex++;
        }
    }

    private final List<Swatch> quantizePixels(int maxColorIndex, int maxColors) {
        PriorityQueue<Vbox> priorityQueue = new PriorityQueue<>(maxColors, VBOX_COMPARATOR_VOLUME);
        priorityQueue.offer(new Vbox(0, maxColorIndex));
        splitBoxes(priorityQueue, maxColors);
        return generateAverageColors(priorityQueue);
    }

    private final boolean shouldIgnoreColor(int color) {
        int iAlpha = Color.alpha(color);
        ColorUtils.RGBtoHSL(Color.red(color), Color.green(color), Color.blue(color), this.mTempHsl);
        return iAlpha < 250 || INSTANCE.shouldIgnoreColor(this.mTempHsl);
    }

    private final void splitBoxes(PriorityQueue<Vbox> queue, int maxSize) {
        Vbox vboxPoll;
        while (queue.size() < maxSize && (vboxPoll = queue.poll()) != null && vboxPoll.canSplit()) {
            queue.offer(vboxPoll.splitBox());
            queue.offer(vboxPoll);
        }
    }

    @NotNull
    public final List<Swatch> getQuantizedColors() {
        return this.mQuantizedColors;
    }

    private ColorCutQuantizer(ColorHistogram colorHistogram, int i7) {
        this.mTempHsl = new float[3];
        if (colorHistogram == null) {
            throw new IllegalArgumentException("colorHistogram can not be null");
        }
        if (i7 < 1) {
            throw new IllegalArgumentException("maxColors must be 1 or greater");
        }
        int numberOfColors = colorHistogram.getNumberOfColors();
        int[] colors = colorHistogram.getColors();
        int[] colorCounts = colorHistogram.getColorCounts();
        this.mColorPopulations = new SparseIntArray(numberOfColors);
        int length = colors.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.mColorPopulations.append(colors[i10], colorCounts[i10]);
        }
        this.mColors = new int[numberOfColors];
        int i11 = 0;
        for (int i12 : colors) {
            if (!shouldIgnoreColor(i12)) {
                this.mColors[i11] = i12;
                i11++;
            }
        }
        if (i11 > i7) {
            this.mQuantizedColors = quantizePixels(i11 - 1, i7);
            return;
        }
        this.mQuantizedColors = new ArrayList();
        for (int i13 : this.mColors) {
            ((ArrayList) this.mQuantizedColors).add(new Swatch(i13, this.mColorPopulations.get(i13)));
        }
    }
}
