package n2;

import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.imageutils.TiffUtil;
import com.facebook.react.common.assets.ReactFontManager;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import j$.util.DesugarTimeZone;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import kotlin.jvm.internal.LongCompanionObject;
import mo.c0;

/* JADX INFO: loaded from: classes.dex */
public final class h {
    public static final e W;
    public static final e[][] X;
    public static final e[] Y;
    public static final HashMap[] Z;
    public static final HashMap[] a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final Set f16259b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final HashMap f16260c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final Charset f16261d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final byte[] f16262e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final byte[] f16263f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final Pattern f16264g0;
    public static final Pattern h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final Pattern f16265i0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f16271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public FileDescriptor f16272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AssetManager.AssetInputStream f16273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16274d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f16275e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap[] f16276f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashSet f16277g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ByteOrder f16278h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f16279i;
    public boolean j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f16280l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f16281m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public byte[] f16282n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f16283o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f16284p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f16285q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f16286r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f16287s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public d f16288t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f16289u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final boolean f16266v = Log.isLoggable("ExifInterface", 3);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final List f16267w = Arrays.asList(1, 6, 3, 8);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final List f16268x = Arrays.asList(2, 7, 4, 5);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int[] f16269y = {8, 8, 8};

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int[] f16270z = {8};
    public static final byte[] A = {-1, -40, -1};
    public static final byte[] B = {102, 116, 121, 112};
    public static final byte[] C = {109, 105, 102, 49};
    public static final byte[] D = {104, 101, 105, 99};
    public static final byte[] E = {97, 118, 105, 102};
    public static final byte[] F = {97, 118, 105, 115};
    public static final byte[] G = {79, 76, 89, 77, 80, 0};
    public static final byte[] H = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    public static final byte[] I = {-119, 80, 78, 71, 13, 10, 26, 10};
    public static final byte[] J = "XML:com.adobe.xmp\u0000\u0000\u0000\u0000\u0000".getBytes(StandardCharsets.UTF_8);
    public static final byte[] K = {82, 73, 70, 70};
    public static final byte[] L = {87, 69, 66, 80};
    public static final byte[] M = {69, 88, 73, 70};
    public static final byte[] N = {-99, 1, 42};
    public static final byte[] O = "VP8X".getBytes(Charset.defaultCharset());
    public static final byte[] P = "VP8L".getBytes(Charset.defaultCharset());
    public static final byte[] Q = "VP8 ".getBytes(Charset.defaultCharset());
    public static final byte[] R = "ANIM".getBytes(Charset.defaultCharset());
    public static final byte[] S = "ANMF".getBytes(Charset.defaultCharset());
    public static final String[] T = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    public static final int[] U = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    public static final byte[] V = {65, 83, 67, 73, 73, 0, 0, 0};

    static {
        e[] eVarArr = {new e("NewSubfileType", 254, 4), new e("SubfileType", 255, 4), new e("ImageWidth", IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER, 3, 4), new e("ImageLength", 257, 3, 4), new e("BitsPerSample", 258, 3), new e("Compression", 259, 3), new e("PhotometricInterpretation", 262, 3), new e("ImageDescription", 270, 2), new e("Make", 271, 2), new e("Model", 272, 2), new e("StripOffsets", 273, 3, 4), new e("Orientation", TiffUtil.TIFF_TAG_ORIENTATION, 3), new e("SamplesPerPixel", 277, 3), new e("RowsPerStrip", 278, 3, 4), new e("StripByteCounts", 279, 3, 4), new e("XResolution", 282, 5), new e("YResolution", 283, 5), new e("PlanarConfiguration", 284, 3), new e("ResolutionUnit", 296, 3), new e("TransferFunction", 301, 3), new e("Software", 305, 2), new e("DateTime", 306, 2), new e("Artist", 315, 2), new e("WhitePoint", 318, 5), new e("PrimaryChromaticities", 319, 5), new e("SubIFDPointer", 330, 4), new e("JPEGInterchangeFormat", 513, 4), new e("JPEGInterchangeFormatLength", 514, 4), new e("YCbCrCoefficients", 529, 5), new e("YCbCrSubSampling", 530, 3), new e("YCbCrPositioning", 531, 3), new e("ReferenceBlackWhite", 532, 5), new e("Copyright", 33432, 2), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("SensorTopBorder", 4, 4), new e("SensorLeftBorder", 5, 4), new e("SensorBottomBorder", 6, 4), new e("SensorRightBorder", 7, 4), new e("ISO", 23, 3), new e("JpgFromRaw", 46, 7), new e("Xmp", ReactFontManager.TypefaceStyle.BOLD, 1)};
        e[] eVarArr2 = {new e("ExposureTime", 33434, 5), new e("FNumber", 33437, 5), new e("ExposureProgram", 34850, 3), new e("SpectralSensitivity", 34852, 2), new e("PhotographicSensitivity", 34855, 3), new e("OECF", 34856, 7), new e("SensitivityType", 34864, 3), new e("StandardOutputSensitivity", 34865, 4), new e("RecommendedExposureIndex", 34866, 4), new e("ISOSpeed", 34867, 4), new e("ISOSpeedLatitudeyyy", 34868, 4), new e("ISOSpeedLatitudezzz", 34869, 4), new e("ExifVersion", 36864, 2), new e("DateTimeOriginal", 36867, 2), new e("DateTimeDigitized", 36868, 2), new e("OffsetTime", 36880, 2), new e("OffsetTimeOriginal", 36881, 2), new e("OffsetTimeDigitized", 36882, 2), new e("ComponentsConfiguration", 37121, 7), new e("CompressedBitsPerPixel", 37122, 5), new e("ShutterSpeedValue", 37377, 10), new e("ApertureValue", 37378, 5), new e("BrightnessValue", 37379, 10), new e("ExposureBiasValue", 37380, 10), new e("MaxApertureValue", 37381, 5), new e("SubjectDistance", 37382, 5), new e("MeteringMode", 37383, 3), new e("LightSource", 37384, 3), new e("Flash", 37385, 3), new e("FocalLength", 37386, 5), new e("SubjectArea", 37396, 3), new e("MakerNote", 37500, 7), new e("UserComment", 37510, 7), new e("SubSecTime", 37520, 2), new e("SubSecTimeOriginal", 37521, 2), new e("SubSecTimeDigitized", 37522, 2), new e("FlashpixVersion", 40960, 7), new e("ColorSpace", 40961, 3), new e("PixelXDimension", 40962, 3, 4), new e("PixelYDimension", 40963, 3, 4), new e("RelatedSoundFile", 40964, 2), new e("InteroperabilityIFDPointer", 40965, 4), new e("FlashEnergy", 41483, 5), new e("SpatialFrequencyResponse", 41484, 7), new e("FocalPlaneXResolution", 41486, 5), new e("FocalPlaneYResolution", 41487, 5), new e("FocalPlaneResolutionUnit", 41488, 3), new e("SubjectLocation", 41492, 3), new e("ExposureIndex", 41493, 5), new e("SensingMethod", 41495, 3), new e("FileSource", 41728, 7), new e("SceneType", 41729, 7), new e("CFAPattern", 41730, 7), new e("CustomRendered", 41985, 3), new e("ExposureMode", 41986, 3), new e("WhiteBalance", 41987, 3), new e("DigitalZoomRatio", 41988, 5), new e("FocalLengthIn35mmFilm", 41989, 3), new e("SceneCaptureType", 41990, 3), new e("GainControl", 41991, 3), new e("Contrast", 41992, 3), new e("Saturation", 41993, 3), new e("Sharpness", 41994, 3), new e("DeviceSettingDescription", 41995, 7), new e("SubjectDistanceRange", 41996, 3), new e("ImageUniqueID", 42016, 2), new e("CameraOwnerName", 42032, 2), new e("BodySerialNumber", 42033, 2), new e("LensSpecification", 42034, 5), new e("LensMake", 42035, 2), new e("LensModel", 42036, 2), new e("Gamma", 42240, 5), new e("DNGVersion", 50706, 1), new e("DefaultCropSize", 50720, 3, 4)};
        e[] eVarArr3 = {new e("GPSVersionID", 0, 1), new e("GPSLatitudeRef", 1, 2), new e("GPSLatitude", 2, 5, 10), new e("GPSLongitudeRef", 3, 2), new e("GPSLongitude", 4, 5, 10), new e("GPSAltitudeRef", 5, 1), new e("GPSAltitude", 6, 5), new e("GPSTimeStamp", 7, 5), new e("GPSSatellites", 8, 2), new e("GPSStatus", 9, 2), new e("GPSMeasureMode", 10, 2), new e("GPSDOP", 11, 5), new e("GPSSpeedRef", 12, 2), new e("GPSSpeed", 13, 5), new e("GPSTrackRef", 14, 2), new e("GPSTrack", 15, 5), new e("GPSImgDirectionRef", 16, 2), new e("GPSImgDirection", 17, 5), new e("GPSMapDatum", 18, 2), new e("GPSDestLatitudeRef", 19, 2), new e("GPSDestLatitude", 20, 5), new e("GPSDestLongitudeRef", 21, 2), new e("GPSDestLongitude", 22, 5), new e("GPSDestBearingRef", 23, 2), new e("GPSDestBearing", 24, 5), new e("GPSDestDistanceRef", 25, 2), new e("GPSDestDistance", 26, 5), new e("GPSProcessingMethod", 27, 7), new e("GPSAreaInformation", 28, 7), new e("GPSDateStamp", 29, 2), new e("GPSDifferential", 30, 3), new e("GPSHPositioningError", 31, 5)};
        e[] eVarArr4 = {new e("InteroperabilityIndex", 1, 2)};
        e[] eVarArr5 = {new e("NewSubfileType", 254, 4), new e("SubfileType", 255, 4), new e("ThumbnailImageWidth", IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER, 3, 4), new e("ThumbnailImageLength", 257, 3, 4), new e("BitsPerSample", 258, 3), new e("Compression", 259, 3), new e("PhotometricInterpretation", 262, 3), new e("ImageDescription", 270, 2), new e("Make", 271, 2), new e("Model", 272, 2), new e("StripOffsets", 273, 3, 4), new e("ThumbnailOrientation", TiffUtil.TIFF_TAG_ORIENTATION, 3), new e("SamplesPerPixel", 277, 3), new e("RowsPerStrip", 278, 3, 4), new e("StripByteCounts", 279, 3, 4), new e("XResolution", 282, 5), new e("YResolution", 283, 5), new e("PlanarConfiguration", 284, 3), new e("ResolutionUnit", 296, 3), new e("TransferFunction", 301, 3), new e("Software", 305, 2), new e("DateTime", 306, 2), new e("Artist", 315, 2), new e("WhitePoint", 318, 5), new e("PrimaryChromaticities", 319, 5), new e("SubIFDPointer", 330, 4), new e("JPEGInterchangeFormat", 513, 4), new e("JPEGInterchangeFormatLength", 514, 4), new e("YCbCrCoefficients", 529, 5), new e("YCbCrSubSampling", 530, 3), new e("YCbCrPositioning", 531, 3), new e("ReferenceBlackWhite", 532, 5), new e("Copyright", 33432, 2), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("DNGVersion", 50706, 1), new e("DefaultCropSize", 50720, 3, 4)};
        W = new e("StripOffsets", 273, 3);
        X = new e[][]{eVarArr, eVarArr2, eVarArr3, eVarArr4, eVarArr5, eVarArr, new e[]{new e("ThumbnailImage", IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER, 7), new e("CameraSettingsIFDPointer", 8224, 4), new e("ImageProcessingIFDPointer", 8256, 4)}, new e[]{new e("PreviewImageStart", 257, 4), new e("PreviewImageLength", 258, 4)}, new e[]{new e("AspectFrame", 4371, 3)}, new e[]{new e("ColorSpace", 55, 3)}};
        Y = new e[]{new e("SubIFDPointer", 330, 4), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("InteroperabilityIFDPointer", 40965, 4), new e("CameraSettingsIFDPointer", 8224, 1), new e("ImageProcessingIFDPointer", 8256, 1)};
        Z = new HashMap[10];
        a0 = new HashMap[10];
        f16259b0 = Collections.unmodifiableSet(new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance")));
        f16260c0 = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        f16261d0 = charsetForName;
        f16262e0 = "Exif\u0000\u0000".getBytes(charsetForName);
        f16263f0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        int i7 = 0;
        while (true) {
            e[][] eVarArr6 = X;
            if (i7 >= eVarArr6.length) {
                HashMap map = f16260c0;
                e[] eVarArr7 = Y;
                map.put(Integer.valueOf(eVarArr7[0].f16253a), 5);
                map.put(Integer.valueOf(eVarArr7[1].f16253a), 1);
                map.put(Integer.valueOf(eVarArr7[2].f16253a), 2);
                map.put(Integer.valueOf(eVarArr7[3].f16253a), 3);
                map.put(Integer.valueOf(eVarArr7[4].f16253a), 7);
                map.put(Integer.valueOf(eVarArr7[5].f16253a), 8);
                Pattern.compile(".*[1-9].*");
                f16264g0 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                h0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                f16265i0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            Z[i7] = new HashMap();
            a0[i7] = new HashMap();
            for (e eVar : eVarArr6[i7]) {
                Z[i7].put(Integer.valueOf(eVar.f16253a), eVar);
                a0[i7].put(eVar.f16254b, eVar);
            }
            i7++;
        }
    }

    public h(File file) throws Throwable {
        e[][] eVarArr = X;
        this.f16276f = new HashMap[eVarArr.length];
        this.f16277g = new HashSet(eVarArr.length);
        this.f16278h = ByteOrder.BIG_ENDIAN;
        if (file == null) {
            throw new NullPointerException("file cannot be null");
        }
        r(file.getAbsolutePath());
    }

    public static Pair p(String str) {
        if (str.contains(",")) {
            String[] strArrSplit = str.split(",", -1);
            Pair pairP = p(strArrSplit[0]);
            if (((Integer) pairP.first).intValue() == 2) {
                return pairP;
            }
            for (int i7 = 1; i7 < strArrSplit.length; i7++) {
                Pair pairP2 = p(strArrSplit[i7]);
                int iIntValue = (((Integer) pairP2.first).equals(pairP.first) || ((Integer) pairP2.second).equals(pairP.first)) ? ((Integer) pairP.first).intValue() : -1;
                int iIntValue2 = (((Integer) pairP.second).intValue() == -1 || !(((Integer) pairP2.first).equals(pairP.second) || ((Integer) pairP2.second).equals(pairP.second))) ? -1 : ((Integer) pairP.second).intValue();
                if (iIntValue == -1 && iIntValue2 == -1) {
                    return new Pair(2, -1);
                }
                if (iIntValue == -1) {
                    pairP = new Pair(Integer.valueOf(iIntValue2), -1);
                } else if (iIntValue2 == -1) {
                    pairP = new Pair(Integer.valueOf(iIntValue), -1);
                }
            }
            return pairP;
        }
        if (!str.contains("/")) {
            try {
                try {
                    long j = Long.parseLong(str);
                    if (j < 0 || j > 65535) {
                        return j < 0 ? new Pair(9, -1) : new Pair(4, -1);
                    }
                    return new Pair(3, 4);
                } catch (NumberFormatException unused) {
                    return new Pair(2, -1);
                }
            } catch (NumberFormatException unused2) {
                Double.parseDouble(str);
                return new Pair(12, -1);
            }
        }
        String[] strArrSplit2 = str.split("/", -1);
        if (strArrSplit2.length == 2) {
            try {
                long j5 = (long) Double.parseDouble(strArrSplit2[0]);
                long j7 = (long) Double.parseDouble(strArrSplit2[1]);
                if (j5 >= 0 && j7 >= 0) {
                    if (j5 <= 2147483647L && j7 <= 2147483647L) {
                        return new Pair(10, 5);
                    }
                    return new Pair(5, -1);
                }
                return new Pair(10, -1);
            } catch (NumberFormatException unused3) {
            }
        }
        return new Pair(2, -1);
    }

    public static ByteOrder w(b bVar) throws IOException {
        short s2 = bVar.readShort();
        boolean z5 = f16266v;
        if (s2 == 18761) {
            if (z5) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s2 == 19789) {
            if (z5) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(s2));
    }

    public final void A(int i7, String str, String str2) {
        HashMap[] mapArr = this.f16276f;
        if (mapArr[i7].isEmpty() || mapArr[i7].get(str) == null) {
            return;
        }
        HashMap map = mapArr[i7];
        map.put(str2, (d) map.get(str));
        mapArr[i7].remove(str);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0153  */
    /* JADX WARN: Code duplicated, block: B:81:0x00fb A[Catch: all -> 0x0104, Exception -> 0x0107, TryCatch #19 {Exception -> 0x0107, all -> 0x0104, blocks: (B:79:0x00f7, B:81:0x00fb, B:88:0x0119, B:87:0x010a), top: B:128:0x00f7 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x010a A[Catch: all -> 0x0104, Exception -> 0x0107, TryCatch #19 {Exception -> 0x0107, all -> 0x0104, blocks: (B:79:0x00f7, B:81:0x00fb, B:88:0x0119, B:87:0x010a), top: B:128:0x00f7 }] */
    public final void B() {
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream2;
        FileInputStream fileInputStream2;
        FileOutputStream fileOutputStream3;
        Object obj;
        int i7 = this.f16274d;
        if (i7 != 4 && i7 != 13 && i7 != 14) {
            throw new IOException("ExifInterface only supports saving attributes for JPEG, PNG, and WebP formats.");
        }
        if (this.f16272b == null && this.f16271a == null) {
            throw new IOException("ExifInterface does not support saving attributes for the current input.");
        }
        if (this.f16279i && this.j && !this.k) {
            throw new IOException("ExifInterface does not support saving attributes when the image file has non-consecutive thumbnail strips");
        }
        int i10 = this.f16283o;
        Closeable closeable = null;
        this.f16282n = (i10 == 6 || i10 == 7) ? n() : null;
        try {
            File fileCreateTempFile = File.createTempFile("temp", "tmp");
            if (this.f16271a != null) {
                fileInputStream = new FileInputStream(this.f16271a);
            } else {
                Os.lseek(this.f16272b, 0L, OsConstants.SEEK_SET);
                fileInputStream = new FileInputStream(this.f16272b);
            }
            try {
                fileOutputStream = new FileOutputStream(fileCreateTempFile);
                try {
                    c0.l(fileInputStream, fileOutputStream);
                    c0.f(fileInputStream);
                    c0.f(fileOutputStream);
                    try {
                        try {
                            try {
                                FileInputStream fileInputStream3 = new FileInputStream(fileCreateTempFile);
                                try {
                                    if (this.f16271a != null) {
                                        fileOutputStream2 = new FileOutputStream(this.f16271a);
                                    } else {
                                        Os.lseek(this.f16272b, 0L, OsConstants.SEEK_SET);
                                        fileOutputStream2 = new FileOutputStream(this.f16272b);
                                    }
                                    try {
                                        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream3);
                                        try {
                                            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream2);
                                            try {
                                                int i11 = this.f16274d;
                                                if (i11 == 4) {
                                                    C(bufferedInputStream, bufferedOutputStream);
                                                } else if (i11 == 13) {
                                                    D(bufferedInputStream, bufferedOutputStream);
                                                } else if (i11 == 14) {
                                                    E(bufferedInputStream, bufferedOutputStream);
                                                }
                                                c0.f(bufferedInputStream);
                                                c0.f(bufferedOutputStream);
                                                fileCreateTempFile.delete();
                                                this.f16282n = null;
                                            } catch (Exception e10) {
                                                e = e10;
                                                closeable = fileInputStream3;
                                                try {
                                                    try {
                                                        fileInputStream2 = new FileInputStream(fileCreateTempFile);
                                                        try {
                                                            if (this.f16271a != null) {
                                                                fileOutputStream3 = new FileOutputStream(this.f16271a);
                                                            } else {
                                                                Os.lseek(this.f16272b, 0L, OsConstants.SEEK_SET);
                                                                fileOutputStream3 = new FileOutputStream(this.f16272b);
                                                            }
                                                            fileOutputStream2 = fileOutputStream3;
                                                            c0.l(fileInputStream2, fileOutputStream2);
                                                            c0.f(fileInputStream2);
                                                            c0.f(fileOutputStream2);
                                                            throw new IOException("Failed to save new file", e);
                                                        } catch (Exception e11) {
                                                            e = e11;
                                                            closeable = fileInputStream2;
                                                            throw new IOException("Failed to save new file. Original file is stored in " + fileCreateTempFile.getAbsolutePath(), e);
                                                        } catch (Throwable th2) {
                                                            th = th2;
                                                            closeable = fileInputStream2;
                                                            c0.f(closeable);
                                                            c0.f(fileOutputStream2);
                                                            throw th;
                                                        }
                                                    } catch (Exception e12) {
                                                        e = e12;
                                                    }
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                }
                                            }
                                        } catch (Exception e13) {
                                            e = e13;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            closeable = bufferedInputStream;
                                            c0.f(closeable);
                                            c0.f(0);
                                            if (0 == 0) {
                                                fileCreateTempFile.delete();
                                            }
                                            throw th;
                                        }
                                    } catch (Exception e14) {
                                        e = e14;
                                        obj = null;
                                        closeable = fileInputStream3;
                                        fileInputStream2 = new FileInputStream(fileCreateTempFile);
                                        if (this.f16271a != null) {
                                            fileOutputStream3 = new FileOutputStream(this.f16271a);
                                        } else {
                                            Os.lseek(this.f16272b, 0L, OsConstants.SEEK_SET);
                                            fileOutputStream3 = new FileOutputStream(this.f16272b);
                                        }
                                        fileOutputStream2 = fileOutputStream3;
                                        c0.l(fileInputStream2, fileOutputStream2);
                                        c0.f(fileInputStream2);
                                        c0.f(fileOutputStream2);
                                        throw new IOException("Failed to save new file", e);
                                    }
                                } catch (Exception e15) {
                                    e = e15;
                                    fileOutputStream2 = null;
                                    obj = null;
                                }
                            } catch (Exception e16) {
                                e = e16;
                                fileOutputStream2 = null;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            c0.f(closeable);
                            c0.f(0);
                            if (0 == 0) {
                                fileCreateTempFile.delete();
                            }
                            throw th;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                    }
                } catch (Exception e17) {
                    e = e17;
                    closeable = fileInputStream;
                    try {
                        throw new IOException("Failed to copy original file to temp file", e);
                    } catch (Throwable th7) {
                        th = th7;
                        c0.f(closeable);
                        c0.f(fileOutputStream);
                        throw th;
                    }
                } catch (Throwable th8) {
                    th = th8;
                    closeable = fileInputStream;
                    c0.f(closeable);
                    c0.f(fileOutputStream);
                    throw th;
                }
            } catch (Exception e18) {
                e = e18;
                fileOutputStream = null;
            } catch (Throwable th9) {
                th = th9;
                fileOutputStream = null;
            }
        } catch (Exception e19) {
            e = e19;
            fileOutputStream = null;
        } catch (Throwable th10) {
            th = th10;
            fileOutputStream = null;
        }
    }

    public final void C(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) throws IOException {
        byte[] bArr;
        if (f16266v) {
            Log.d("ExifInterface", "saveJpegAttributes starting with (inputStream: " + bufferedInputStream + ", outputStream: " + bufferedOutputStream + ")");
        }
        b bVar = new b(bufferedInputStream);
        c cVar = new c(bufferedOutputStream, ByteOrder.BIG_ENDIAN);
        if (bVar.readByte() != -1) {
            throw new IOException("Invalid marker");
        }
        cVar.c(-1);
        if (bVar.readByte() != -40) {
            throw new IOException("Invalid marker");
        }
        cVar.c(-40);
        cVar.c(-1);
        cVar.c(-31);
        this.f16284p = K(cVar);
        d dVar = this.f16288t;
        byte[] bArr2 = f16263f0;
        if (dVar != null) {
            cVar.write(-1);
            cVar.c(-31);
            cVar.l(bArr2.length + 2 + this.f16288t.f16252d.length);
            cVar.write(bArr2);
            cVar.write(this.f16288t.f16252d);
            this.f16289u = true;
        }
        byte[] bArr3 = new byte[RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT];
        while (bVar.readByte() == -1) {
            byte b10 = bVar.readByte();
            if (b10 == -39 || b10 == -38) {
                cVar.c(-1);
                cVar.c(b10);
                c0.l(bVar, cVar);
                return;
            }
            if (b10 != -31) {
                cVar.c(-1);
                cVar.c(b10);
                int unsignedShort = bVar.readUnsignedShort();
                cVar.l(unsignedShort);
                int i7 = unsignedShort - 2;
                if (i7 < 0) {
                    throw new IOException("Invalid length");
                }
                while (i7 > 0) {
                    int i10 = bVar.read(bArr3, 0, Math.min(i7, RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT));
                    if (i10 < 0) {
                        break;
                    }
                    cVar.write(bArr3, 0, i10);
                    i7 -= i10;
                }
            } else {
                int unsignedShort2 = bVar.readUnsignedShort();
                int length = unsignedShort2 - 2;
                if (length < 0) {
                    throw new IOException("Invalid length");
                }
                int length2 = bArr2.length;
                byte[] bArr4 = f16262e0;
                if (length >= length2) {
                    bArr = new byte[bArr2.length];
                } else {
                    bArr = length >= bArr4.length ? new byte[bArr4.length] : null;
                }
                if (bArr != null) {
                    bVar.readFully(bArr);
                    if (c0.N(bArr, bArr4) || c0.N(bArr, bArr2)) {
                        bVar.c(length - bArr.length);
                    }
                }
                cVar.c(-1);
                cVar.c(b10);
                cVar.l(unsignedShort2);
                if (bArr != null) {
                    length -= bArr.length;
                    cVar.write(bArr);
                }
                while (length > 0) {
                    int i11 = bVar.read(bArr3, 0, Math.min(length, RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT));
                    if (i11 < 0) {
                        break;
                    }
                    cVar.write(bArr3, 0, i11);
                    length -= i11;
                }
            }
        }
        throw new IOException("Invalid marker");
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0043 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:19:0x0066  */
    /* JADX WARN: Code duplicated, block: B:28:0x007c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:32:0x008d  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:42:0x0077 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x006e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0057 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x0088 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0041 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0075 -> B:10:0x0041). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0041
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final void D(java.io.BufferedInputStream r9, java.io.BufferedOutputStream r10) {
        /*
            r8 = this;
            boolean r0 = n2.h.f16266v
            if (r0 == 0) goto L24
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "savePngAttributes starting with (inputStream: "
            r0.<init>(r1)
            r0.append(r9)
            java.lang.String r1 = ", outputStream: "
            r0.append(r1)
            r0.append(r10)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ExifInterface"
            android.util.Log.d(r1, r0)
        L24:
            n2.b r0 = new n2.b
            r0.<init>(r9)
            n2.c r9 = new n2.c
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            r9.<init>(r10, r1)
            byte[] r10 = n2.h.I
            int r10 = r10.length
            mo.c0.m(r0, r9, r10)
            n2.d r10 = r8.f16288t
            r1 = 1
            r2 = 0
            if (r10 != 0) goto L40
            boolean r10 = r8.f16289u
            if (r10 == 0) goto L75
        L40:
            r10 = r1
        L41:
            if (r1 != 0) goto L4a
            if (r10 == 0) goto L46
            goto L4a
        L46:
            mo.c0.l(r0, r9)
            return
        L4a:
            int r3 = r0.readInt()
            int r4 = r0.readInt()
            r5 = 1229472850(0x49484452, float:820293.1)
            if (r4 != r5) goto L77
            r9.f(r3)
            r9.f(r4)
            int r3 = r3 + 4
            mo.c0.m(r0, r9, r3)
            int r3 = r8.f16284p
            if (r3 != 0) goto L6a
            r8.L(r9)
            r1 = r2
        L6a:
            n2.d r3 = r8.f16288t
            if (r3 == 0) goto L41
            boolean r3 = r8.f16289u
            if (r3 != 0) goto L41
            r8.M(r9)
        L75:
            r10 = r2
            goto L41
        L77:
            r5 = 1700284774(0x65584966, float:6.383657E22)
            if (r4 != r5) goto L88
            if (r1 == 0) goto L88
            r8.L(r9)
            int r3 = r3 + 4
            r0.c(r3)
            r1 = r2
            goto L41
        L88:
            r5 = 1767135348(0x69545874, float:1.6044374E25)
            if (r4 != r5) goto Lba
            byte[] r5 = n2.h.J
            int r6 = r5.length
            if (r3 < r6) goto Lba
            int r6 = r5.length
            byte[] r7 = new byte[r6]
            r0.readFully(r7)
            int r6 = r3 - r6
            int r6 = r6 + 4
            boolean r5 = java.util.Arrays.equals(r7, r5)
            if (r5 == 0) goto Lad
            n2.d r10 = r8.f16288t
            if (r10 == 0) goto La9
            r8.M(r9)
        La9:
            r0.c(r6)
            goto L75
        Lad:
            r9.f(r3)
            r9.f(r4)
            r9.write(r7)
            mo.c0.m(r0, r9, r6)
            goto L41
        Lba:
            r9.f(r3)
            r9.f(r4)
            int r3 = r3 + 4
            mo.c0.m(r0, r9, r3)
            goto L41
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.h.D(java.io.BufferedInputStream, java.io.BufferedOutputStream):void");
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 6941. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final void E(java.io.BufferedInputStream r23, java.io.BufferedOutputStream r24) {
        /*
            Method dump skipped, instruction units count: 694
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.h.E(java.io.BufferedInputStream, java.io.BufferedOutputStream):void");
    }

    /* JADX WARN: Code duplicated, block: B:139:0x02d8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:140:0x02da  */
    /* JADX WARN: Code duplicated, block: B:141:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:144:0x02ed A[LOOP:2: B:142:0x02ea->B:144:0x02ed, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:147:0x030c A[LOOP:3: B:146:0x030a->B:147:0x030c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:149:0x0322  */
    /* JADX WARN: Code duplicated, block: B:152:0x032e A[LOOP:4: B:150:0x032b->B:152:0x032e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:155:0x0376 A[LOOP:5: B:154:0x0374->B:155:0x0376, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:157:0x0395  */
    /* JADX WARN: Code duplicated, block: B:160:0x03a6 A[LOOP:6: B:158:0x03a3->B:160:0x03a6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:163:0x03c5 A[LOOP:7: B:162:0x03c3->B:163:0x03c5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:165:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:168:0x03ed A[LOOP:8: B:166:0x03ea->B:168:0x03ed, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:170:0x041f  */
    /* JADX WARN: Code duplicated, block: B:173:0x0430 A[LOOP:9: B:171:0x042d->B:173:0x0430, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:175:0x0447  */
    /* JADX WARN: Code duplicated, block: B:178:0x0458 A[LOOP:10: B:176:0x0455->B:178:0x0458, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:180:0x046f  */
    /* JADX WARN: Code duplicated, block: B:181:0x047d  */
    public final void F(String str, String str2) {
        String str3;
        boolean z5;
        String str4;
        e eVar;
        int[] iArr;
        String[] strArrSplit;
        int[] iArr2;
        int i7;
        String[] strArrSplit2;
        long[] jArr;
        int i10;
        int i11;
        String[] strArrSplit3;
        f[] fVarArr;
        int i12;
        String[] strArrSplit4;
        int length;
        int[] iArr3;
        int i13;
        ByteBuffer byteBufferWrap;
        int i14;
        String[] strArrSplit5;
        int length2;
        f[] fVarArr2;
        int i15;
        ByteBuffer byteBufferWrap2;
        int i16;
        String[] strArrSplit6;
        int length3;
        double[] dArr;
        int i17;
        ByteBuffer byteBufferWrap3;
        int i18;
        f fVar;
        long j;
        long j5;
        String strReplaceAll = str2;
        boolean zEquals = "ISOSpeedRatings".equals(str);
        boolean z6 = f16266v;
        if (zEquals) {
            if (z6) {
                Log.d("ExifInterface", "setAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str3 = "PhotographicSensitivity";
        } else {
            str3 = str;
        }
        String str5 = "/";
        if (strReplaceAll == null) {
            z5 = z6;
            str4 = "/";
        } else if (!f16259b0.contains(str3) || strReplaceAll.contains("/")) {
            z5 = z6;
            str4 = "/";
            if (str3.equals("GPSTimeStamp")) {
                Matcher matcher = f16264g0.matcher(strReplaceAll);
                if (!matcher.find()) {
                    Log.w("ExifInterface", "Invalid value for " + str3 + " : " + strReplaceAll);
                    return;
                }
                strReplaceAll = Integer.parseInt(matcher.group(1)) + "/1," + Integer.parseInt(matcher.group(2)) + "/1," + Integer.parseInt(matcher.group(3)) + "/1";
            } else if ("DateTime".equals(str3) || "DateTimeOriginal".equals(str3) || "DateTimeDigitized".equals(str3)) {
                boolean zFind = h0.matcher(strReplaceAll).find();
                boolean zFind2 = f16265i0.matcher(strReplaceAll).find();
                if (strReplaceAll.length() != 19 || (!zFind && !zFind2)) {
                    Log.w("ExifInterface", "Invalid value for " + str3 + " : " + strReplaceAll);
                    return;
                }
                if (zFind2) {
                    strReplaceAll = strReplaceAll.replaceAll("-", ":");
                }
            }
        } else {
            try {
                double d6 = Double.parseDouble(strReplaceAll);
                long j7 = 1;
                if (d6 >= 9.223372036854776E18d || d6 <= -9.223372036854776E18d) {
                    z5 = z6;
                    str4 = "/";
                    fVar = new f(d6 > 0.0d ? LongCompanionObject.MAX_VALUE : Long.MIN_VALUE, 1L);
                } else {
                    double dAbs = Math.abs(d6);
                    long j10 = 0;
                    long j11 = 1;
                    double d7 = dAbs;
                    long j12 = 0;
                    while (true) {
                        double d8 = d7 % 1.0d;
                        long j13 = (long) (d7 - d8);
                        str4 = str5;
                        j = (j13 * j7) + j12;
                        j5 = (j13 * j10) + j11;
                        d7 = 1.0d / d8;
                        z5 = z6;
                        if (Math.abs(dAbs - (j / j5)) <= 1.0E-8d * dAbs) {
                            break;
                        }
                        z6 = z5;
                        j11 = j10;
                        j10 = j5;
                        j12 = j7;
                        j7 = j;
                        str5 = str4;
                    }
                    if (d6 < 0.0d) {
                        j = -j;
                    }
                    fVar = new f(j, j5);
                }
                strReplaceAll = fVar.toString();
            } catch (NumberFormatException unused) {
                Log.w("ExifInterface", "Invalid value for " + str3 + " : " + strReplaceAll);
                return;
            }
        }
        boolean zEquals2 = "Xmp".equals(str3);
        int i19 = 12;
        int i20 = 9;
        int i21 = 4;
        HashMap[] mapArr = this.f16276f;
        int i22 = 0;
        if (zEquals2) {
            boolean z7 = mapArr[0].containsKey("Xmp") || mapArr[5].containsKey("Xmp");
            int i23 = this.f16274d;
            char c8 = i23 != 4 ? (i23 == 9 || i23 == 15 || i23 == 12 || i23 == 13) ? (char) 2 : (char) 1 : (char) 3;
            if ((c8 == 2 && (this.f16288t != null || !z7)) || (c8 == 3 && !z7)) {
                this.f16288t = strReplaceAll != null ? d.a(strReplaceAll) : null;
                return;
            }
        }
        int i24 = 0;
        while (i24 < X.length) {
            if ((i24 != i21 || this.f16279i) && (eVar = (e) a0[i24].get(str3)) != null) {
                int i25 = eVar.f16256d;
                int i26 = eVar.f16255c;
                if (strReplaceAll != null) {
                    Pair pairP = p(strReplaceAll);
                    int i27 = -1;
                    if (i26 == ((Integer) pairP.first).intValue() || i26 == ((Integer) pairP.second).intValue()) {
                        i25 = i26;
                        iArr = U;
                        switch (i25) {
                            case 1:
                                str4 = str4;
                                mapArr[i24].put(str3, d.a(strReplaceAll));
                                break;
                            case 2:
                            case 7:
                                str4 = str4;
                                mapArr[i24].put(str3, d.b(strReplaceAll));
                                break;
                            case 3:
                                str4 = str4;
                                strArrSplit = strReplaceAll.split(",", -1);
                                iArr2 = new int[strArrSplit.length];
                                while (i7 < strArrSplit.length) {
                                    iArr2[i7] = Integer.parseInt(strArrSplit[i7]);
                                }
                                mapArr[i24].put(str3, d.g(iArr2, this.f16278h));
                                break;
                            case 4:
                                str4 = str4;
                                strArrSplit2 = strReplaceAll.split(",", -1);
                                jArr = new long[strArrSplit2.length];
                                while (i10 < strArrSplit2.length) {
                                    jArr[i10] = Long.parseLong(strArrSplit2[i10]);
                                }
                                mapArr[i24].put(str3, d.d(jArr, this.f16278h));
                                break;
                            case 5:
                                i11 = -1;
                                str4 = str4;
                                strArrSplit3 = strReplaceAll.split(",", -1);
                                fVarArr = new f[strArrSplit3.length];
                                i12 = i22;
                                while (i12 < strArrSplit3.length) {
                                    String[] strArrSplit7 = strArrSplit3[i12].split(str4, i11);
                                    fVarArr[i12] = new f((long) Double.parseDouble(strArrSplit7[i22]), (long) Double.parseDouble(strArrSplit7[1]));
                                    i12++;
                                    i11 = -1;
                                }
                                mapArr[i24].put(str3, d.e(fVarArr, this.f16278h));
                                break;
                            case 6:
                            case 8:
                            case 11:
                            default:
                                if (z5) {
                                    kk.b.q(i25, "Data format isn't one of expected formats: ", "ExifInterface");
                                }
                                break;
                            case 9:
                                int i28 = i20;
                                strArrSplit4 = strReplaceAll.split(",", -1);
                                length = strArrSplit4.length;
                                iArr3 = new int[length];
                                while (i13 < strArrSplit4.length) {
                                    iArr3[i13] = Integer.parseInt(strArrSplit4[i13]);
                                }
                                HashMap map = mapArr[i24];
                                ByteOrder byteOrder = this.f16278h;
                                byteBufferWrap = ByteBuffer.wrap(new byte[iArr[i28] * length]);
                                byteBufferWrap.order(byteOrder);
                                while (i14 < length) {
                                    byteBufferWrap.putInt(iArr3[i14]);
                                }
                                map.put(str3, new d(byteBufferWrap.array(), i28, length));
                                break;
                            case 10:
                                strArrSplit5 = strReplaceAll.split(",", -1);
                                length2 = strArrSplit5.length;
                                fVarArr2 = new f[length2];
                                i15 = i22;
                                while (i15 < strArrSplit5.length) {
                                    String[] strArrSplit8 = strArrSplit5[i15].split(str4, i27);
                                    fVarArr2[i15] = new f((long) Double.parseDouble(strArrSplit8[i22]), (long) Double.parseDouble(strArrSplit8[1]));
                                    i15++;
                                    i20 = i20;
                                    strArrSplit5 = strArrSplit5;
                                    i27 = -1;
                                }
                                HashMap map2 = mapArr[i24];
                                ByteOrder byteOrder2 = this.f16278h;
                                byteBufferWrap2 = ByteBuffer.wrap(new byte[iArr[10] * length2]);
                                byteBufferWrap2.order(byteOrder2);
                                while (i16 < length2) {
                                    f fVar2 = fVarArr2[i16];
                                    byteBufferWrap2.putInt((int) fVar2.f16257a);
                                    byteBufferWrap2.putInt((int) fVar2.f16258b);
                                }
                                map2.put(str3, new d(byteBufferWrap2.array(), 10, length2));
                                break;
                            case 12:
                                strArrSplit6 = strReplaceAll.split(",", -1);
                                length3 = strArrSplit6.length;
                                dArr = new double[length3];
                                while (i17 < strArrSplit6.length) {
                                    dArr[i17] = Double.parseDouble(strArrSplit6[i17]);
                                }
                                HashMap map3 = mapArr[i24];
                                ByteOrder byteOrder3 = this.f16278h;
                                byteBufferWrap3 = ByteBuffer.wrap(new byte[iArr[i19] * length3]);
                                byteBufferWrap3.order(byteOrder3);
                                while (i18 < length3) {
                                    byteBufferWrap3.putDouble(dArr[i18]);
                                }
                                map3.put(str3, new d(byteBufferWrap3.array(), i19, length3));
                                break;
                        }
                    } else if (i25 != -1 && (i25 == ((Integer) pairP.first).intValue() || i25 == ((Integer) pairP.second).intValue())) {
                        i22 = i22;
                        iArr = U;
                        switch (i25) {
                            case 1:
                                str4 = str4;
                                mapArr[i24].put(str3, d.a(strReplaceAll));
                                break;
                            case 2:
                            case 7:
                                str4 = str4;
                                mapArr[i24].put(str3, d.b(strReplaceAll));
                                break;
                            case 3:
                                str4 = str4;
                                strArrSplit = strReplaceAll.split(",", -1);
                                iArr2 = new int[strArrSplit.length];
                                for (i7 = i22; i7 < strArrSplit.length; i7++) {
                                    iArr2[i7] = Integer.parseInt(strArrSplit[i7]);
                                }
                                mapArr[i24].put(str3, d.g(iArr2, this.f16278h));
                                break;
                            case 4:
                                str4 = str4;
                                strArrSplit2 = strReplaceAll.split(",", -1);
                                jArr = new long[strArrSplit2.length];
                                for (i10 = i22; i10 < strArrSplit2.length; i10++) {
                                    jArr[i10] = Long.parseLong(strArrSplit2[i10]);
                                }
                                mapArr[i24].put(str3, d.d(jArr, this.f16278h));
                                break;
                            case 5:
                                i11 = -1;
                                str4 = str4;
                                strArrSplit3 = strReplaceAll.split(",", -1);
                                fVarArr = new f[strArrSplit3.length];
                                i12 = i22;
                                while (i12 < strArrSplit3.length) {
                                    String[] strArrSplit9 = strArrSplit3[i12].split(str4, i11);
                                    fVarArr[i12] = new f((long) Double.parseDouble(strArrSplit9[i22]), (long) Double.parseDouble(strArrSplit9[1]));
                                    i12++;
                                    i11 = -1;
                                }
                                mapArr[i24].put(str3, d.e(fVarArr, this.f16278h));
                                break;
                            case 6:
                            case 8:
                            case 11:
                            default:
                                if (z5) {
                                    kk.b.q(i25, "Data format isn't one of expected formats: ", "ExifInterface");
                                }
                                break;
                            case 9:
                                int i29 = i20;
                                strArrSplit4 = strReplaceAll.split(",", -1);
                                length = strArrSplit4.length;
                                iArr3 = new int[length];
                                for (i13 = i22; i13 < strArrSplit4.length; i13++) {
                                    iArr3[i13] = Integer.parseInt(strArrSplit4[i13]);
                                }
                                HashMap map4 = mapArr[i24];
                                ByteOrder byteOrder4 = this.f16278h;
                                byteBufferWrap = ByteBuffer.wrap(new byte[iArr[i29] * length]);
                                byteBufferWrap.order(byteOrder4);
                                for (i14 = i22; i14 < length; i14++) {
                                    byteBufferWrap.putInt(iArr3[i14]);
                                }
                                map4.put(str3, new d(byteBufferWrap.array(), i29, length));
                                break;
                            case 10:
                                strArrSplit5 = strReplaceAll.split(",", -1);
                                length2 = strArrSplit5.length;
                                fVarArr2 = new f[length2];
                                i15 = i22;
                                while (i15 < strArrSplit5.length) {
                                    String[] strArrSplit10 = strArrSplit5[i15].split(str4, i27);
                                    fVarArr2[i15] = new f((long) Double.parseDouble(strArrSplit10[i22]), (long) Double.parseDouble(strArrSplit10[1]));
                                    i15++;
                                    i20 = i20;
                                    strArrSplit5 = strArrSplit5;
                                    i27 = -1;
                                }
                                HashMap map5 = mapArr[i24];
                                ByteOrder byteOrder5 = this.f16278h;
                                byteBufferWrap2 = ByteBuffer.wrap(new byte[iArr[10] * length2]);
                                byteBufferWrap2.order(byteOrder5);
                                for (i16 = i22; i16 < length2; i16++) {
                                    f fVar3 = fVarArr2[i16];
                                    byteBufferWrap2.putInt((int) fVar3.f16257a);
                                    byteBufferWrap2.putInt((int) fVar3.f16258b);
                                }
                                map5.put(str3, new d(byteBufferWrap2.array(), 10, length2));
                                break;
                            case 12:
                                strArrSplit6 = strReplaceAll.split(",", -1);
                                length3 = strArrSplit6.length;
                                dArr = new double[length3];
                                for (i17 = i22; i17 < strArrSplit6.length; i17++) {
                                    dArr[i17] = Double.parseDouble(strArrSplit6[i17]);
                                }
                                HashMap map6 = mapArr[i24];
                                ByteOrder byteOrder6 = this.f16278h;
                                byteBufferWrap3 = ByteBuffer.wrap(new byte[iArr[i19] * length3]);
                                byteBufferWrap3.order(byteOrder6);
                                for (i18 = i22; i18 < length3; i18++) {
                                    byteBufferWrap3.putDouble(dArr[i18]);
                                }
                                map6.put(str3, new d(byteBufferWrap3.array(), i19, length3));
                                break;
                        }
                    } else if (i26 == 1 || i26 == 7 || i26 == 2) {
                        i25 = i26;
                        iArr = U;
                        switch (i25) {
                            case 1:
                                str4 = str4;
                                mapArr[i24].put(str3, d.a(strReplaceAll));
                                break;
                            case 2:
                            case 7:
                                str4 = str4;
                                mapArr[i24].put(str3, d.b(strReplaceAll));
                                break;
                            case 3:
                                str4 = str4;
                                strArrSplit = strReplaceAll.split(",", -1);
                                iArr2 = new int[strArrSplit.length];
                                while (i7 < strArrSplit.length) {
                                    iArr2[i7] = Integer.parseInt(strArrSplit[i7]);
                                }
                                mapArr[i24].put(str3, d.g(iArr2, this.f16278h));
                                break;
                            case 4:
                                str4 = str4;
                                strArrSplit2 = strReplaceAll.split(",", -1);
                                jArr = new long[strArrSplit2.length];
                                while (i10 < strArrSplit2.length) {
                                    jArr[i10] = Long.parseLong(strArrSplit2[i10]);
                                }
                                mapArr[i24].put(str3, d.d(jArr, this.f16278h));
                                break;
                            case 5:
                                i11 = -1;
                                str4 = str4;
                                strArrSplit3 = strReplaceAll.split(",", -1);
                                fVarArr = new f[strArrSplit3.length];
                                i12 = i22;
                                while (i12 < strArrSplit3.length) {
                                    String[] strArrSplit11 = strArrSplit3[i12].split(str4, i11);
                                    fVarArr[i12] = new f((long) Double.parseDouble(strArrSplit11[i22]), (long) Double.parseDouble(strArrSplit11[1]));
                                    i12++;
                                    i11 = -1;
                                }
                                mapArr[i24].put(str3, d.e(fVarArr, this.f16278h));
                                break;
                            case 6:
                            case 8:
                            case 11:
                            default:
                                if (z5) {
                                    kk.b.q(i25, "Data format isn't one of expected formats: ", "ExifInterface");
                                }
                                break;
                            case 9:
                                int i210 = i20;
                                strArrSplit4 = strReplaceAll.split(",", -1);
                                length = strArrSplit4.length;
                                iArr3 = new int[length];
                                while (i13 < strArrSplit4.length) {
                                    iArr3[i13] = Integer.parseInt(strArrSplit4[i13]);
                                }
                                HashMap map7 = mapArr[i24];
                                ByteOrder byteOrder7 = this.f16278h;
                                byteBufferWrap = ByteBuffer.wrap(new byte[iArr[i210] * length]);
                                byteBufferWrap.order(byteOrder7);
                                while (i14 < length) {
                                    byteBufferWrap.putInt(iArr3[i14]);
                                }
                                map7.put(str3, new d(byteBufferWrap.array(), i210, length));
                                break;
                            case 10:
                                strArrSplit5 = strReplaceAll.split(",", -1);
                                length2 = strArrSplit5.length;
                                fVarArr2 = new f[length2];
                                i15 = i22;
                                while (i15 < strArrSplit5.length) {
                                    String[] strArrSplit12 = strArrSplit5[i15].split(str4, i27);
                                    fVarArr2[i15] = new f((long) Double.parseDouble(strArrSplit12[i22]), (long) Double.parseDouble(strArrSplit12[1]));
                                    i15++;
                                    i20 = i20;
                                    strArrSplit5 = strArrSplit5;
                                    i27 = -1;
                                }
                                HashMap map8 = mapArr[i24];
                                ByteOrder byteOrder8 = this.f16278h;
                                byteBufferWrap2 = ByteBuffer.wrap(new byte[iArr[10] * length2]);
                                byteBufferWrap2.order(byteOrder8);
                                while (i16 < length2) {
                                    f fVar4 = fVarArr2[i16];
                                    byteBufferWrap2.putInt((int) fVar4.f16257a);
                                    byteBufferWrap2.putInt((int) fVar4.f16258b);
                                }
                                map8.put(str3, new d(byteBufferWrap2.array(), 10, length2));
                                break;
                            case 12:
                                strArrSplit6 = strReplaceAll.split(",", -1);
                                length3 = strArrSplit6.length;
                                dArr = new double[length3];
                                while (i17 < strArrSplit6.length) {
                                    dArr[i17] = Double.parseDouble(strArrSplit6[i17]);
                                }
                                HashMap map9 = mapArr[i24];
                                ByteOrder byteOrder9 = this.f16278h;
                                byteBufferWrap3 = ByteBuffer.wrap(new byte[iArr[i19] * length3]);
                                byteBufferWrap3.order(byteOrder9);
                                while (i18 < length3) {
                                    byteBufferWrap3.putDouble(dArr[i18]);
                                }
                                map9.put(str3, new d(byteBufferWrap3.array(), i19, length3));
                                break;
                        }
                    } else if (z5) {
                        StringBuilder sbN = com.discord.chat.presentation.list.a.n("Given tag (", str3, ") value didn't match with one of expected formats: ");
                        String[] strArr = T;
                        sbN.append(strArr[i26]);
                        sbN.append(i25 == -1 ? "" : ", " + strArr[i25]);
                        sbN.append(" (guess: ");
                        sbN.append(strArr[((Integer) pairP.first).intValue()]);
                        sbN.append(((Integer) pairP.second).intValue() != -1 ? ", " + strArr[((Integer) pairP.second).intValue()] : "");
                        sbN.append(")");
                        Log.d("ExifInterface", sbN.toString());
                    }
                } else {
                    mapArr[i24].remove(str3);
                }
                i22 = i22;
            } else {
                i22 = i22;
            }
            i24++;
            i22 = i22;
            str4 = str4;
            i19 = 12;
            i20 = 9;
            i21 = 4;
        }
    }

    public final void G(b bVar) throws Throwable {
        String str;
        d dVar;
        int i7;
        HashMap map = this.f16276f[4];
        d dVar2 = (d) map.get("Compression");
        if (dVar2 == null) {
            this.f16283o = 6;
            q(bVar, map);
            return;
        }
        int i10 = dVar2.i(this.f16278h);
        this.f16283o = i10;
        int i11 = 1;
        if (i10 != 1) {
            if (i10 == 6) {
                q(bVar, map);
                return;
            } else if (i10 != 7) {
                return;
            }
        }
        d dVar3 = (d) map.get("BitsPerSample");
        String str2 = "ExifInterface";
        if (dVar3 != null) {
            int[] iArr = (int[]) dVar3.k(this.f16278h);
            int[] iArr2 = f16269y;
            if (Arrays.equals(iArr2, iArr) || (this.f16274d == 3 && (dVar = (d) map.get("PhotometricInterpretation")) != null && (((i7 = dVar.i(this.f16278h)) == 1 && Arrays.equals(iArr, f16270z)) || (i7 == 6 && Arrays.equals(iArr, iArr2))))) {
                d dVar4 = (d) map.get("StripOffsets");
                d dVar5 = (d) map.get("StripByteCounts");
                if (dVar4 == null || dVar5 == null) {
                    return;
                }
                long[] jArrK = c0.k(dVar4.k(this.f16278h));
                long[] jArrK2 = c0.k(dVar5.k(this.f16278h));
                if (jArrK == null || jArrK.length == 0) {
                    Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                    return;
                }
                if (jArrK2 == null || jArrK2.length == 0) {
                    Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                    return;
                }
                if (jArrK.length != jArrK2.length) {
                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                long j = 0;
                for (long j5 : jArrK2) {
                    j += j5;
                }
                int i12 = (int) j;
                byte[] bArr = new byte[i12];
                this.k = true;
                this.j = true;
                this.f16279i = true;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                while (i13 < jArrK.length) {
                    int i16 = (int) jArrK[i13];
                    int i17 = (int) jArrK2[i13];
                    if (i13 < jArrK.length - i11) {
                        str = str2;
                        if (i16 + i17 != jArrK[i13 + 1]) {
                            this.k = false;
                        }
                    } else {
                        str = str2;
                    }
                    int i18 = i16 - i14;
                    if (i18 < 0) {
                        Log.d(str, "Invalid strip offset value");
                        return;
                    }
                    String str3 = str;
                    try {
                        bVar.c(i18);
                        int i19 = i14 + i18;
                        byte[] bArr2 = new byte[i17];
                        try {
                            bVar.readFully(bArr2);
                            i14 = i19 + i17;
                            System.arraycopy(bArr2, 0, bArr, i15, i17);
                            i15 += i17;
                            i13++;
                            str2 = str3;
                            i11 = 1;
                        } catch (EOFException unused) {
                            Log.d(str3, "Failed to read " + i17 + " bytes.");
                            return;
                        }
                    } catch (EOFException unused2) {
                        Log.d(str3, "Failed to skip " + i18 + " bytes.");
                        return;
                    }
                }
                this.f16282n = bArr;
                if (this.k) {
                    this.f16280l = (int) jArrK[0];
                    this.f16281m = i12;
                    return;
                }
                return;
            }
        }
        if (f16266v) {
            Log.d("ExifInterface", "Unsupported data type value");
        }
    }

    public final void H(int i7, int i10) throws Throwable {
        HashMap[] mapArr = this.f16276f;
        boolean zIsEmpty = mapArr[i7].isEmpty();
        boolean z5 = f16266v;
        if (zIsEmpty || mapArr[i10].isEmpty()) {
            if (z5) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        d dVar = (d) mapArr[i7].get("ImageLength");
        d dVar2 = (d) mapArr[i7].get("ImageWidth");
        d dVar3 = (d) mapArr[i10].get("ImageLength");
        d dVar4 = (d) mapArr[i10].get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            if (z5) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (dVar3 == null || dVar4 == null) {
            if (z5) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int i11 = dVar.i(this.f16278h);
        int i12 = dVar2.i(this.f16278h);
        int i13 = dVar3.i(this.f16278h);
        int i14 = dVar4.i(this.f16278h);
        if (i11 >= i13 || i12 >= i14) {
            return;
        }
        HashMap map = mapArr[i7];
        mapArr[i7] = mapArr[i10];
        mapArr[i10] = map;
    }

    public final void I(g gVar, int i7) throws Throwable {
        d dVarF;
        d dVarF2;
        HashMap[] mapArr = this.f16276f;
        d dVar = (d) mapArr[i7].get("DefaultCropSize");
        d dVar2 = (d) mapArr[i7].get("SensorTopBorder");
        d dVar3 = (d) mapArr[i7].get("SensorLeftBorder");
        d dVar4 = (d) mapArr[i7].get("SensorBottomBorder");
        d dVar5 = (d) mapArr[i7].get("SensorRightBorder");
        if (dVar != null) {
            if (dVar.f16249a == 5) {
                f[] fVarArr = (f[]) dVar.k(this.f16278h);
                if (fVarArr == null || fVarArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(fVarArr));
                    return;
                } else {
                    dVarF = d.e(new f[]{fVarArr[0]}, this.f16278h);
                    dVarF2 = d.e(new f[]{fVarArr[1]}, this.f16278h);
                }
            } else {
                int[] iArr = (int[]) dVar.k(this.f16278h);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                dVarF = d.f(iArr[0], this.f16278h);
                dVarF2 = d.f(iArr[1], this.f16278h);
            }
            mapArr[i7].put("ImageWidth", dVarF);
            mapArr[i7].put("ImageLength", dVarF2);
            return;
        }
        if (dVar2 != null && dVar3 != null && dVar4 != null && dVar5 != null) {
            int i10 = dVar2.i(this.f16278h);
            int i11 = dVar4.i(this.f16278h);
            int i12 = dVar5.i(this.f16278h);
            int i13 = dVar3.i(this.f16278h);
            if (i11 <= i10 || i12 <= i13) {
                return;
            }
            d dVarF3 = d.f(i11 - i10, this.f16278h);
            d dVarF4 = d.f(i12 - i13, this.f16278h);
            mapArr[i7].put("ImageLength", dVarF3);
            mapArr[i7].put("ImageWidth", dVarF4);
            return;
        }
        d dVar6 = (d) mapArr[i7].get("ImageLength");
        d dVar7 = (d) mapArr[i7].get("ImageWidth");
        if (dVar6 == null || dVar7 == null) {
            d dVar8 = (d) mapArr[i7].get("JPEGInterchangeFormat");
            d dVar9 = (d) mapArr[i7].get("JPEGInterchangeFormatLength");
            if (dVar8 == null || dVar9 == null) {
                return;
            }
            int i14 = dVar8.i(this.f16278h);
            int i15 = dVar8.i(this.f16278h);
            gVar.f(i14);
            byte[] bArr = new byte[i15];
            gVar.readFully(bArr);
            f(new b(bArr), i14, i7);
        }
    }

    public final void J() throws Throwable {
        H(0, 5);
        H(0, 4);
        H(5, 4);
        HashMap[] mapArr = this.f16276f;
        d dVar = (d) mapArr[1].get("PixelXDimension");
        d dVar2 = (d) mapArr[1].get("PixelYDimension");
        if (dVar != null && dVar2 != null) {
            mapArr[0].put("ImageWidth", dVar);
            mapArr[0].put("ImageLength", dVar2);
        }
        if (mapArr[4].isEmpty() && s(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        if (!s(mapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        A(0, "ThumbnailOrientation", "Orientation");
        A(0, "ThumbnailImageLength", "ImageLength");
        A(0, "ThumbnailImageWidth", "ImageWidth");
        A(5, "ThumbnailOrientation", "Orientation");
        A(5, "ThumbnailImageLength", "ImageLength");
        A(5, "ThumbnailImageWidth", "ImageWidth");
        A(4, "Orientation", "ThumbnailOrientation");
        A(4, "ImageLength", "ThumbnailImageLength");
        A(4, "ImageWidth", "ThumbnailImageWidth");
    }

    public final int K(c cVar) throws IOException {
        HashMap[] mapArr;
        int i7;
        int[] iArr;
        int i10;
        e[][] eVarArr = X;
        int[] iArr2 = new int[eVarArr.length];
        int[] iArr3 = new int[eVarArr.length];
        e[] eVarArr2 = Y;
        for (e eVar : eVarArr2) {
            z(eVar.f16254b);
        }
        if (this.f16279i) {
            if (this.j) {
                z("StripOffsets");
                z("StripByteCounts");
            } else {
                z("JPEGInterchangeFormat");
                z("JPEGInterchangeFormatLength");
            }
        }
        int i11 = 0;
        while (true) {
            int length = eVarArr.length;
            mapArr = this.f16276f;
            if (i11 >= length) {
                break;
            }
            Iterator it = mapArr[i11].entrySet().iterator();
            while (it.hasNext()) {
                if (((Map.Entry) it.next()).getValue() == null) {
                    it.remove();
                }
            }
            i11++;
        }
        if (mapArr[1].isEmpty()) {
            i7 = 1;
        } else {
            i7 = 1;
            mapArr[0].put(eVarArr2[1].f16254b, d.c(0L, this.f16278h));
        }
        if (!mapArr[2].isEmpty()) {
            mapArr[r7].put(eVarArr2[2].f16254b, d.c(0L, this.f16278h));
        }
        if (!mapArr[3].isEmpty()) {
            mapArr[i7].put(eVarArr2[3].f16254b, d.c(0L, this.f16278h));
        }
        int i12 = 4;
        if (this.f16279i) {
            if (this.j) {
                mapArr[4].put("StripOffsets", d.f(0, this.f16278h));
                mapArr[4].put("StripByteCounts", d.f(this.f16281m, this.f16278h));
            } else {
                mapArr[4].put("JPEGInterchangeFormat", d.c(0L, this.f16278h));
                mapArr[4].put("JPEGInterchangeFormatLength", d.c(this.f16281m, this.f16278h));
            }
        }
        int i13 = 0;
        while (true) {
            int length2 = eVarArr.length;
            iArr = U;
            if (i13 >= length2) {
                break;
            }
            Iterator it2 = mapArr[i13].entrySet().iterator();
            int i14 = 0;
            while (it2.hasNext()) {
                d dVar = (d) ((Map.Entry) it2.next()).getValue();
                dVar.getClass();
                int i15 = iArr[dVar.f16249a] * dVar.f16250b;
                if (i15 > 4) {
                    i14 += i15;
                }
            }
            iArr3[i13] = iArr3[i13] + i14;
            i13++;
        }
        int size = 8;
        for (int i16 = 0; i16 < eVarArr.length; i16++) {
            if (!mapArr[i16].isEmpty()) {
                iArr2[i16] = size;
                size = (mapArr[i16].size() * 12) + 6 + iArr3[i16] + size;
            }
        }
        if (this.f16279i) {
            if (this.j) {
                mapArr[4].put("StripOffsets", d.f(size, this.f16278h));
            } else {
                mapArr[4].put("JPEGInterchangeFormat", d.c(size, this.f16278h));
            }
            this.f16280l = size;
            size += this.f16281m;
        }
        if (this.f16274d == 4) {
            size += 8;
        }
        if (f16266v) {
            for (int i17 = 0; i17 < eVarArr.length; i17++) {
                Log.d("ExifInterface", String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", Integer.valueOf(i17), Integer.valueOf(iArr2[i17]), Integer.valueOf(mapArr[i17].size()), Integer.valueOf(iArr3[i17]), Integer.valueOf(size)));
            }
        }
        if (!mapArr[i7].isEmpty()) {
            mapArr[0].put(eVarArr2[i7].f16254b, d.c(iArr2[i7], this.f16278h));
        }
        if (!mapArr[r6].isEmpty()) {
            mapArr[0].put(eVarArr2[r6].f16254b, d.c(iArr2[2], this.f16278h));
        }
        if (!mapArr[r6].isEmpty()) {
            mapArr[i7].put(eVarArr2[r6].f16254b, d.c(iArr2[3], this.f16278h));
        }
        int i18 = this.f16274d;
        if (i18 == 4) {
            if (size > 65535) {
                throw new IllegalStateException(s0.g.d(size, "Size of exif data (", " bytes) exceeds the max size of a JPEG APP1 segment (65536 bytes)"));
            }
            cVar.l(size);
            cVar.write(f16262e0);
        } else if (i18 == 13) {
            cVar.f(size);
            cVar.f(1700284774);
        } else if (i18 == 14) {
            cVar.write(M);
            cVar.f(size);
        }
        int size2 = cVar.f16247d.size();
        cVar.g(this.f16278h == ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
        cVar.f16248e = this.f16278h;
        cVar.l(42);
        cVar.i(8L);
        int i19 = 0;
        while (i19 < eVarArr.length) {
            if (mapArr[i19].isEmpty()) {
                i10 = i12;
            } else {
                cVar.l(mapArr[i19].size());
                int size3 = (mapArr[i19].size() * 12) + iArr2[i19] + 2 + i12;
                for (Map.Entry entry : mapArr[i19].entrySet()) {
                    int i20 = ((e) a0[i19].get(entry.getKey())).f16253a;
                    d dVar2 = (d) entry.getValue();
                    dVar2.getClass();
                    int i21 = dVar2.f16250b;
                    int i22 = dVar2.f16249a;
                    int i23 = iArr[i22] * i21;
                    cVar.l(i20);
                    cVar.l(i22);
                    cVar.f(i21);
                    if (i23 > 4) {
                        cVar.i(size3);
                        size3 += i23;
                    } else {
                        cVar.write(dVar2.f16252d);
                        if (i23 < 4) {
                            while (i23 < 4) {
                                cVar.c(0);
                                i23++;
                            }
                        }
                    }
                    i12 = 4;
                }
                int i24 = i12;
                if (i19 != 0 || mapArr[i24].isEmpty()) {
                    cVar.i(0L);
                } else {
                    cVar.i(iArr2[i24]);
                }
                Iterator it3 = mapArr[i19].entrySet().iterator();
                while (it3.hasNext()) {
                    byte[] bArr = ((d) ((Map.Entry) it3.next()).getValue()).f16252d;
                    if (bArr.length > 4) {
                        cVar.write(bArr, 0, bArr.length);
                    }
                }
                i10 = 4;
            }
            i19++;
            i12 = i10;
        }
        if (this.f16279i) {
            cVar.write(n());
        }
        if (this.f16274d == 14 && size % 2 == i7) {
            cVar.c(0);
        }
        cVar.f16248e = ByteOrder.BIG_ENDIAN;
        return size2;
    }

    public final void L(c cVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.f16284p = cVar.f16247d.size() + K(new c(byteArrayOutputStream, ByteOrder.BIG_ENDIAN));
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        cVar.write(byteArray);
        CRC32 crc32 = new CRC32();
        crc32.update(byteArray, 4, byteArray.length - 4);
        cVar.f((int) crc32.getValue());
    }

    public final void M(c cVar) throws IOException {
        cVar.f(this.f16288t.f16252d.length + 22);
        CRC32 crc32 = new CRC32();
        cVar.f(1767135348);
        crc32.update(105);
        crc32.update(26964);
        crc32.update(6902872);
        crc32.update(1767135348);
        byte[] bArr = J;
        cVar.write(bArr);
        crc32.update(bArr);
        cVar.write(this.f16288t.f16252d);
        crc32.update(this.f16288t.f16252d);
        cVar.f((int) crc32.getValue());
        this.f16289u = true;
    }

    public final void a() {
        String strB = b("DateTimeOriginal");
        HashMap[] mapArr = this.f16276f;
        if (strB != null && b("DateTime") == null) {
            mapArr[0].put("DateTime", d.b(strB));
        }
        if (b("ImageWidth") == null) {
            mapArr[0].put("ImageWidth", d.c(0L, this.f16278h));
        }
        if (b("ImageLength") == null) {
            mapArr[0].put("ImageLength", d.c(0L, this.f16278h));
        }
        if (b("Orientation") == null) {
            mapArr[0].put("Orientation", d.c(0L, this.f16278h));
        }
        if (b("LightSource") == null) {
            mapArr[1].put("LightSource", d.c(0L, this.f16278h));
        }
    }

    public final String b(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d dVarD = d(str);
        if (dVarD != null) {
            int i7 = dVarD.f16249a;
            if (str.equals("GPSTimeStamp")) {
                if (i7 != 5 && i7 != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i7);
                    return null;
                }
                f[] fVarArr = (f[]) dVarD.k(this.f16278h);
                if (fVarArr == null || fVarArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(fVarArr));
                    return null;
                }
                f fVar = fVarArr[0];
                Integer numValueOf = Integer.valueOf((int) (fVar.f16257a / fVar.f16258b));
                f fVar2 = fVarArr[1];
                Integer numValueOf2 = Integer.valueOf((int) (fVar2.f16257a / fVar2.f16258b));
                f fVar3 = fVarArr[2];
                return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (fVar3.f16257a / fVar3.f16258b)));
            }
            if (!f16259b0.contains(str)) {
                return dVarD.j(this.f16278h);
            }
            try {
                return Double.toString(dVarD.h(this.f16278h));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final int c() {
        d dVarD = d("Orientation");
        if (dVarD == null) {
            return 1;
        }
        try {
            return dVarD.i(this.f16278h);
        } catch (NumberFormatException unused) {
            return 1;
        }
    }

    public final d d(String str) {
        d dVar;
        int i7;
        d dVar2;
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if ("ISOSpeedRatings".equals(str)) {
            if (f16266v) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        if ("Xmp".equals(str) && (i7 = this.f16274d) != 4 && ((i7 == 9 || i7 == 15 || i7 == 12 || i7 == 13) && (dVar2 = this.f16288t) != null)) {
            return dVar2;
        }
        for (int i10 = 0; i10 < X.length; i10++) {
            d dVar3 = (d) this.f16276f[i10].get(str);
            if (dVar3 != null) {
                return dVar3;
            }
        }
        if (!"Xmp".equals(str) || (dVar = this.f16288t) == null) {
            return null;
        }
        return dVar;
    }

    public final void e(g gVar, int i7) {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        int i10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIC files is supported from SDK 28 and above");
        }
        if (i7 == 15 && i11 < 31) {
            throw new UnsupportedOperationException("Reading EXIF from AVIF files is supported from SDK 31 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                mediaMetadataRetriever.setDataSource(new a(gVar));
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                HashMap[] mapArr = this.f16276f;
                if (strExtractMetadata != null) {
                    mapArr[0].put("ImageWidth", d.f(Integer.parseInt(strExtractMetadata), this.f16278h));
                }
                if (strExtractMetadata3 != null) {
                    mapArr[0].put("ImageLength", d.f(Integer.parseInt(strExtractMetadata3), this.f16278h));
                }
                if (strExtractMetadata2 != null) {
                    int i12 = Integer.parseInt(strExtractMetadata2);
                    if (i12 == 90) {
                        i10 = 6;
                    } else if (i12 != 180) {
                        i10 = i12 != 270 ? 1 : 8;
                    } else {
                        i10 = 3;
                    }
                    mapArr[0].put("Orientation", d.f(i10, this.f16278h));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i13 = Integer.parseInt(strExtractMetadata4);
                    int i14 = Integer.parseInt(strExtractMetadata5);
                    if (i14 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    gVar.f(i13);
                    byte[] bArr = new byte[6];
                    gVar.readFully(bArr);
                    int i15 = i13 + 6;
                    int i16 = i14 - 6;
                    if (!Arrays.equals(bArr, f16262e0)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i16];
                    gVar.readFully(bArr2);
                    this.f16284p = i15;
                    x(bArr2, 0);
                }
                String strExtractMetadata8 = mediaMetadataRetriever.extractMetadata(41);
                String strExtractMetadata9 = mediaMetadataRetriever.extractMetadata(42);
                if (strExtractMetadata8 != null && strExtractMetadata9 != null) {
                    int i17 = Integer.parseInt(strExtractMetadata8);
                    int i18 = Integer.parseInt(strExtractMetadata9);
                    long j = i17;
                    gVar.f(j);
                    byte[] bArr3 = new byte[i18];
                    gVar.readFully(bArr3);
                    this.f16288t = new d(j, bArr3, 1, i18);
                    this.f16289u = true;
                }
                if (f16266v) {
                    Log.d("ExifInterface", "Heif meta: " + strExtractMetadata + "x" + strExtractMetadata3 + ", rotation " + strExtractMetadata2);
                }
                try {
                    mediaMetadataRetriever.release();
                } catch (IOException unused) {
                }
            } catch (RuntimeException e10) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.", e10);
            }
        } catch (Throwable th2) {
            try {
                mediaMetadataRetriever.release();
            } catch (IOException unused2) {
            }
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00ab A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:36:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:41:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:56:0x014d A[LOOP:0: B:10:0x0033->B:56:0x014d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:73:0x0154 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:29:0x009d. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x00a0. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x00a3. Please report as an issue. */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1058)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    public final void f(n2.b r22, int r23, int r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.h.f(n2.b, int, int):void");
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0142  */
    /* JADX WARN: Code duplicated, block: B:104:0x0144  */
    /* JADX WARN: Code duplicated, block: B:119:0x0163 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:121:0x0166  */
    /* JADX WARN: Code duplicated, block: B:124:0x016d  */
    /* JADX WARN: Code duplicated, block: B:127:0x0176 A[LOOP:2: B:122:0x0168->B:127:0x0176, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:130:0x017c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:132:0x017f  */
    /* JADX WARN: Code duplicated, block: B:135:0x0186  */
    /* JADX WARN: Code duplicated, block: B:138:0x018f A[LOOP:3: B:133:0x0181->B:138:0x018f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:142:0x0199  */
    /* JADX WARN: Code duplicated, block: B:145:0x01a3 A[LOOP:4: B:140:0x0194->B:145:0x01a3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:147:0x01a8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:149:0x01ab A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:168:0x012d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:16:0x004a  */
    /* JADX WARN: Code duplicated, block: B:174:0x00f2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x0179 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:0x0173 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x0192 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x018c A[EDGE_INSN: B:183:0x018c->B:137:0x018c BREAK  A[LOOP:3: B:133:0x0181->B:138:0x018f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:0x01a6 A[EDGE_INSN: B:184:0x01a6->B:146:0x01a6 BREAK  A[LOOP:4: B:140:0x0194->B:145:0x01a3], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x018c A[EDGE_INSN: B:185:0x018c->B:137:0x018c BREAK  A[LOOP:3: B:133:0x0181->B:138:0x018f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x00f1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:83:0x010f  */
    /* JADX WARN: Code duplicated, block: B:97:0x012b A[RETURN] */
    public final int g(BufferedInputStream bufferedInputStream) throws Throwable {
        b bVar;
        int i7;
        b bVar2;
        int i10;
        b bVar3;
        b bVar4;
        int i11;
        b bVar5;
        b bVar6;
        int i12;
        int i13;
        byte[] bArr;
        int i14;
        int i15;
        byte[] bArr2;
        int i16;
        byte[] bArr3;
        b bVar7;
        short s2;
        long j;
        bufferedInputStream.mark(5000);
        byte[] bArr4 = new byte[5000];
        bufferedInputStream.read(bArr4);
        bufferedInputStream.reset();
        int i17 = 0;
        while (true) {
            byte[] bArr5 = A;
            if (i17 >= bArr5.length) {
                return 4;
            }
            if (bArr4[i17] != bArr5[i17]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                for (int i18 = 0; i18 < bytes.length; i18++) {
                    if (bArr4[i18] != bytes[i18]) {
                        int i19 = 1;
                        try {
                            bVar2 = new b(bArr4);
                            try {
                                try {
                                    long j5 = bVar2.readInt();
                                    byte[] bArr6 = new byte[4];
                                    bVar2.readFully(bArr6);
                                    if (Arrays.equals(bArr6, B)) {
                                        if (j5 == 1) {
                                            j5 = bVar2.readLong();
                                            j = 16;
                                            if (j5 < 16) {
                                                bVar2.close();
                                                i7 = 0;
                                                i10 = 0;
                                            }
                                        } else {
                                            j = 8;
                                        }
                                        i7 = 0;
                                        long j7 = 5000;
                                        if (j5 > j7) {
                                            j5 = j7;
                                        }
                                        long j10 = j5 - j;
                                        if (j10 >= 8) {
                                            try {
                                                byte[] bArr7 = new byte[4];
                                                long j11 = 0;
                                                boolean z5 = false;
                                                boolean z6 = false;
                                                boolean z7 = false;
                                                while (true) {
                                                    if (j11 < j10 / 4) {
                                                        try {
                                                            bVar2.readFully(bArr7);
                                                            if (j11 != 1) {
                                                                if (Arrays.equals(bArr7, C)) {
                                                                    z5 = true;
                                                                } else if (Arrays.equals(bArr7, D)) {
                                                                    z6 = true;
                                                                } else if (Arrays.equals(bArr7, E) || Arrays.equals(bArr7, F)) {
                                                                    z7 = true;
                                                                }
                                                                if (!z5) {
                                                                    continue;
                                                                } else if (z6) {
                                                                    bVar2.close();
                                                                    i10 = 12;
                                                                } else if (z7) {
                                                                    bVar2.close();
                                                                    i10 = 15;
                                                                }
                                                            }
                                                            j11++;
                                                        } catch (EOFException unused) {
                                                            bVar2.close();
                                                            i10 = i7;
                                                        }
                                                    }
                                                }
                                            } catch (Exception e10) {
                                                e = e10;
                                                if (f16266v) {
                                                    Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                                                }
                                                if (bVar2 != null) {
                                                }
                                                i10 = i7;
                                                if (i10 != 0) {
                                                    return i10;
                                                }
                                                try {
                                                    bVar4 = new b(bArr4);
                                                    try {
                                                        ByteOrder byteOrderW = w(bVar4);
                                                        this.f16278h = byteOrderW;
                                                        bVar4.f16244i = byteOrderW;
                                                        s2 = bVar4.readShort();
                                                        if (s2 != 20306) {
                                                            i11 = 1;
                                                        } else {
                                                            i11 = 1;
                                                        }
                                                        bVar4.close();
                                                    } catch (Exception unused2) {
                                                        if (bVar4 != null) {
                                                            bVar4.close();
                                                        }
                                                        i11 = i7;
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        bVar3 = bVar4;
                                                        if (bVar3 != null) {
                                                            bVar3.close();
                                                        }
                                                        throw th;
                                                    }
                                                } catch (Exception unused3) {
                                                    bVar4 = null;
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    bVar3 = null;
                                                }
                                                if (i11 != 0) {
                                                    return 7;
                                                }
                                                try {
                                                    bVar7 = new b(bArr4);
                                                    try {
                                                        ByteOrder byteOrderW2 = w(bVar7);
                                                        this.f16278h = byteOrderW2;
                                                        bVar7.f16244i = byteOrderW2;
                                                        if (bVar7.readShort() == 85) {
                                                            i12 = 1;
                                                        } else {
                                                            i12 = i7;
                                                        }
                                                        bVar7.close();
                                                    } catch (Exception unused4) {
                                                        bVar6 = bVar7;
                                                        if (bVar6 != null) {
                                                            bVar6.close();
                                                        }
                                                        i12 = i7;
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                        bVar5 = bVar7;
                                                        if (bVar5 != null) {
                                                            bVar5.close();
                                                        }
                                                        throw th;
                                                    }
                                                } catch (Exception unused5) {
                                                    bVar6 = null;
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                    bVar5 = null;
                                                }
                                                if (i12 != 0) {
                                                    return 10;
                                                }
                                                i13 = i7;
                                                while (true) {
                                                    bArr = I;
                                                    if (i13 < bArr.length) {
                                                        i14 = 1;
                                                        break;
                                                    }
                                                    if (bArr4[i13] != bArr[i13]) {
                                                        i14 = i7;
                                                        break;
                                                    }
                                                    i13++;
                                                }
                                                if (i14 != 0) {
                                                    return 13;
                                                }
                                                i15 = i7;
                                                while (true) {
                                                    bArr2 = K;
                                                    if (i15 < bArr2.length) {
                                                        i16 = i7;
                                                        while (true) {
                                                            bArr3 = L;
                                                            if (i16 >= bArr3.length) {
                                                                break;
                                                            }
                                                            if (bArr4[bArr2.length + i16 + 4] != bArr3[i16]) {
                                                                break;
                                                            }
                                                            i16++;
                                                        }
                                                        if (i19 != 0) {
                                                            return 14;
                                                        }
                                                        return i7;
                                                    }
                                                    if (bArr4[i15] != bArr2[i15]) {
                                                        break;
                                                    }
                                                    i15++;
                                                }
                                                i19 = i7;
                                                if (i19 != 0) {
                                                    return 14;
                                                }
                                                return i7;
                                            }
                                        }
                                        bVar2.close();
                                        i10 = i7;
                                    } else {
                                        bVar2.close();
                                        i7 = 0;
                                        i10 = 0;
                                    }
                                } catch (Exception e11) {
                                    e = e11;
                                    i7 = 0;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                bVar = bVar2;
                                if (bVar != null) {
                                    bVar.close();
                                }
                                throw th;
                            }
                        } catch (Exception e12) {
                            e = e12;
                            i7 = 0;
                            bVar2 = null;
                        } catch (Throwable th7) {
                            th = th7;
                            bVar = null;
                        }
                        if (i10 != 0) {
                            return i10;
                        }
                        bVar4 = new b(bArr4);
                        ByteOrder byteOrderW3 = w(bVar4);
                        this.f16278h = byteOrderW3;
                        bVar4.f16244i = byteOrderW3;
                        s2 = bVar4.readShort();
                        if (s2 != 20306 || s2 == 21330) {
                            i11 = 1;
                        } else {
                            i11 = i7;
                        }
                        bVar4.close();
                        if (i11 != 0) {
                            return 7;
                        }
                        bVar7 = new b(bArr4);
                        ByteOrder byteOrderW4 = w(bVar7);
                        this.f16278h = byteOrderW4;
                        bVar7.f16244i = byteOrderW4;
                        if (bVar7.readShort() == 85) {
                            i12 = 1;
                        } else {
                            i12 = i7;
                        }
                        bVar7.close();
                        if (i12 != 0) {
                            return 10;
                        }
                        i13 = i7;
                        while (true) {
                            bArr = I;
                            if (i13 < bArr.length) {
                                i14 = 1;
                                break;
                            }
                            if (bArr4[i13] != bArr[i13]) {
                                i14 = i7;
                                break;
                            }
                            i13++;
                        }
                        if (i14 != 0) {
                            return 13;
                        }
                        i15 = i7;
                        while (true) {
                            bArr2 = K;
                            if (i15 < bArr2.length) {
                                i16 = i7;
                                while (true) {
                                    bArr3 = L;
                                    if (i16 >= bArr3.length) {
                                        break;
                                        break;
                                    }
                                    if (bArr4[bArr2.length + i16 + 4] != bArr3[i16]) {
                                        break;
                                        break;
                                    }
                                    i16++;
                                }
                                if (i19 != 0) {
                                    return 14;
                                }
                                return i7;
                            }
                            if (bArr4[i15] != bArr2[i15]) {
                                break;
                                break;
                            }
                            i15++;
                        }
                        i19 = i7;
                        if (i19 != 0) {
                            return 14;
                        }
                        return i7;
                    }
                }
                return 9;
            }
            i17++;
        }
    }

    public final void h(g gVar) throws Throwable {
        int i7;
        int i10;
        k(gVar);
        HashMap[] mapArr = this.f16276f;
        d dVar = (d) mapArr[1].get("MakerNote");
        if (dVar != null) {
            g gVar2 = new g(dVar.f16252d);
            gVar2.f16244i = this.f16278h;
            byte[] bArr = G;
            byte[] bArr2 = new byte[bArr.length];
            gVar2.readFully(bArr2);
            gVar2.f(0L);
            byte[] bArr3 = H;
            byte[] bArr4 = new byte[bArr3.length];
            gVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                gVar2.f(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                gVar2.f(12L);
            }
            y(gVar2, 6);
            d dVar2 = (d) mapArr[7].get("PreviewImageStart");
            d dVar3 = (d) mapArr[7].get("PreviewImageLength");
            if (dVar2 != null && dVar3 != null) {
                mapArr[5].put("JPEGInterchangeFormat", dVar2);
                mapArr[5].put("JPEGInterchangeFormatLength", dVar3);
            }
            d dVar4 = (d) mapArr[8].get("AspectFrame");
            if (dVar4 != null) {
                int[] iArr = (int[]) dVar4.k(this.f16278h);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i11 = iArr[2];
                int i12 = iArr[0];
                if (i11 <= i12 || (i7 = iArr[3]) <= (i10 = iArr[1])) {
                    return;
                }
                int i13 = (i11 - i12) + 1;
                int i14 = (i7 - i10) + 1;
                if (i13 < i14) {
                    int i15 = i13 + i14;
                    i14 = i15 - i14;
                    i13 = i15 - i14;
                }
                d dVarF = d.f(i13, this.f16278h);
                d dVarF2 = d.f(i14, this.f16278h);
                mapArr[0].put("ImageWidth", dVarF);
                mapArr[0].put("ImageLength", dVarF2);
            }
        }
    }

    public final void i(b bVar) throws Throwable {
        if (f16266v) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.f16244i = ByteOrder.BIG_ENDIAN;
        int i7 = bVar.f16243e;
        bVar.c(I.length);
        boolean z5 = false;
        boolean z6 = false;
        while (true) {
            if (z5 && z6) {
                break;
            }
            try {
                int i10 = bVar.readInt();
                int i11 = bVar.readInt();
                int i12 = bVar.f16243e;
                int i13 = i12 + i10 + 4;
                int i14 = i12 - i7;
                if (i14 == 16 && i11 != 1229472850) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appear as the first chunk");
                }
                if (i11 == 1229278788) {
                    break;
                }
                if (i11 == 1700284774 && !z5) {
                    this.f16284p = i14;
                    byte[] bArr = new byte[i10];
                    bVar.readFully(bArr);
                    int i15 = bVar.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(i11 >>> 24);
                    crc32.update(i11 >>> 16);
                    crc32.update(i11 >>> 8);
                    crc32.update(i11);
                    crc32.update(bArr);
                    if (((int) crc32.getValue()) != i15) {
                        throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i15 + ", calculated CRC value: " + crc32.getValue());
                    }
                    x(bArr, 0);
                    J();
                    G(new b(bArr));
                    z5 = true;
                } else if (i11 == 1767135348 && !z6) {
                    byte[] bArr2 = J;
                    if (i10 >= bArr2.length) {
                        int length = bArr2.length;
                        byte[] bArr3 = new byte[length];
                        bVar.readFully(bArr3);
                        if (Arrays.equals(bArr3, bArr2)) {
                            int i16 = bVar.f16243e - i7;
                            int i17 = i10 - length;
                            byte[] bArr4 = new byte[i17];
                            bVar.readFully(bArr4);
                            this.f16288t = new d(i16, bArr4, 1, i17);
                            z6 = true;
                        }
                    }
                }
                bVar.c(i13 - bVar.f16243e);
            } catch (EOFException e10) {
                throw new IOException("Encountered corrupt PNG file.", e10);
            }
        }
        this.f16289u = z6;
    }

    public final void j(b bVar) throws Throwable {
        boolean z5 = f16266v;
        if (z5) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + bVar);
        }
        bVar.c(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.readFully(bArr);
        bVar.readFully(bArr2);
        bVar.readFully(bArr3);
        int i7 = ByteBuffer.wrap(bArr).getInt();
        int i10 = ByteBuffer.wrap(bArr2).getInt();
        int i11 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i10];
        bVar.c(i7 - bVar.f16243e);
        bVar.readFully(bArr4);
        f(new b(bArr4), i7, 5);
        bVar.c(i11 - bVar.f16243e);
        bVar.f16244i = ByteOrder.BIG_ENDIAN;
        int i12 = bVar.readInt();
        if (z5) {
            kk.b.q(i12, "numberOfDirectoryEntry: ", "ExifInterface");
        }
        for (int i13 = 0; i13 < i12; i13++) {
            int unsignedShort = bVar.readUnsignedShort();
            int unsignedShort2 = bVar.readUnsignedShort();
            if (unsignedShort == W.f16253a) {
                short s2 = bVar.readShort();
                short s5 = bVar.readShort();
                d dVarF = d.f(s2, this.f16278h);
                d dVarF2 = d.f(s5, this.f16278h);
                HashMap[] mapArr = this.f16276f;
                mapArr[0].put("ImageLength", dVarF);
                mapArr[0].put("ImageWidth", dVarF2);
                if (z5) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) s2) + ", width: " + ((int) s5));
                    return;
                }
                return;
            }
            bVar.c(unsignedShort2);
        }
    }

    public final void k(g gVar) throws Throwable {
        u(gVar);
        y(gVar, 0);
        I(gVar, 0);
        I(gVar, 5);
        I(gVar, 4);
        J();
        if (this.f16274d == 8) {
            HashMap[] mapArr = this.f16276f;
            d dVar = (d) mapArr[1].get("MakerNote");
            if (dVar != null) {
                g gVar2 = new g(dVar.f16252d);
                gVar2.f16244i = this.f16278h;
                gVar2.c(6);
                y(gVar2, 9);
                d dVar2 = (d) mapArr[9].get("ColorSpace");
                if (dVar2 != null) {
                    mapArr[1].put("ColorSpace", dVar2);
                }
            }
        }
    }

    public final void l(g gVar) throws Throwable {
        if (f16266v) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + gVar);
        }
        k(gVar);
        HashMap[] mapArr = this.f16276f;
        d dVar = (d) mapArr[0].get("JpgFromRaw");
        if (dVar != null) {
            f(new b(dVar.f16252d), (int) dVar.f16251c, 5);
        }
        d dVar2 = (d) mapArr[0].get("ISO");
        d dVar3 = (d) mapArr[1].get("PhotographicSensitivity");
        if (dVar2 == null || dVar3 != null) {
            return;
        }
        mapArr[1].put("PhotographicSensitivity", dVar2);
    }

    public final boolean m(g gVar) throws IOException {
        byte[] bArr = f16262e0;
        byte[] bArr2 = new byte[bArr.length];
        gVar.readFully(bArr2);
        if (!Arrays.equals(bArr2, bArr)) {
            Log.w("ExifInterface", "Given data is not EXIF-only.");
            return false;
        }
        byte[] bArrCopyOf = new byte[IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET];
        int i7 = 0;
        while (true) {
            if (i7 == bArrCopyOf.length) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length * 2);
            }
            int i10 = gVar.f16242d.read(bArrCopyOf, i7, bArrCopyOf.length - i7);
            if (i10 == -1) {
                byte[] bArrCopyOf2 = Arrays.copyOf(bArrCopyOf, i7);
                this.f16284p = bArr.length;
                x(bArrCopyOf2, 0);
                return true;
            }
            i7 += i10;
            gVar.f16243e += i10;
        }
    }

    /* JADX WARN: Code duplicated, block: B:71:0x0078 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v7, types: [android.content.res.AssetManager$AssetInputStream, java.io.Closeable, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.io.Closeable, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v3 */
    public final byte[] n() throws Throwable {
        FileDescriptor fileDescriptor;
        Exception e10;
        byte[] bArr;
        ?? fileInputStream;
        ?? r5 = 0;
        r5 = 0;
        if (this.f16279i) {
            ?? fileInputStream2 = this.f16282n;
            try {
                if (fileInputStream2 != 0) {
                    return fileInputStream2;
                }
                try {
                    fileInputStream2 = this.f16273c;
                    if (fileInputStream2 != 0) {
                        try {
                            if (!fileInputStream2.markSupported()) {
                                Log.d("ExifInterface", "Cannot read thumbnail from inputstream without mark/reset support");
                                c0.f(fileInputStream2);
                                return null;
                            }
                            fileInputStream2.reset();
                            fileInputStream = fileInputStream2;
                            fileDescriptor = null;
                            fileInputStream2 = fileInputStream;
                            try {
                                b bVar = new b((InputStream) fileInputStream2);
                                bVar.c(this.f16280l + this.f16284p);
                                bArr = new byte[this.f16281m];
                                bVar.readFully(bArr);
                                this.f16282n = bArr;
                                c0.f(fileInputStream2);
                                if (fileDescriptor != null) {
                                    try {
                                        Os.close(fileDescriptor);
                                        return bArr;
                                    } catch (ErrnoException e11) {
                                        Log.e("ExifInterfaceUtils", "Error closing fd.", e11);
                                    }
                                }
                                return bArr;
                            } catch (Exception e12) {
                                e10 = e12;
                            }
                        } catch (Exception e13) {
                            e10 = e13;
                            fileDescriptor = null;
                        } catch (Throwable th2) {
                            th = th2;
                            fileDescriptor = null;
                        }
                    } else {
                        if (this.f16271a != null) {
                            fileInputStream = new FileInputStream(this.f16271a);
                            fileDescriptor = null;
                            fileInputStream2 = fileInputStream;
                            b bVar2 = new b((InputStream) fileInputStream2);
                            bVar2.c(this.f16280l + this.f16284p);
                            bArr = new byte[this.f16281m];
                            bVar2.readFully(bArr);
                            this.f16282n = bArr;
                            c0.f(fileInputStream2);
                            if (fileDescriptor != null) {
                                Os.close(fileDescriptor);
                                return bArr;
                            }
                            return bArr;
                        }
                        FileDescriptor fileDescriptorDup = Os.dup(this.f16272b);
                        try {
                            Os.lseek(fileDescriptorDup, 0L, OsConstants.SEEK_SET);
                            fileDescriptor = fileDescriptorDup;
                            fileInputStream2 = new FileInputStream(fileDescriptorDup);
                            b bVar3 = new b((InputStream) fileInputStream2);
                            bVar3.c(this.f16280l + this.f16284p);
                            bArr = new byte[this.f16281m];
                            bVar3.readFully(bArr);
                            this.f16282n = bArr;
                            c0.f(fileInputStream2);
                            if (fileDescriptor != null) {
                                Os.close(fileDescriptor);
                                return bArr;
                            }
                            return bArr;
                        } catch (Exception e14) {
                            e10 = e14;
                            fileDescriptor = fileDescriptorDup;
                            fileInputStream2 = 0;
                        } catch (Throwable th3) {
                            th = th3;
                            fileDescriptor = fileDescriptorDup;
                        }
                    }
                } catch (Exception e15) {
                    fileInputStream2 = 0;
                    e10 = e15;
                    fileDescriptor = null;
                } catch (Throwable th4) {
                    th = th4;
                    fileDescriptor = null;
                }
                Log.d("ExifInterface", "Encountered exception while getting thumbnail", e10);
                c0.f(fileInputStream2);
                if (fileDescriptor != null) {
                    try {
                        Os.close(fileDescriptor);
                    } catch (ErrnoException e16) {
                        Log.e("ExifInterfaceUtils", "Error closing fd.", e16);
                    }
                }
            } catch (Throwable th5) {
                th = th5;
            }
            r5 = fileInputStream2;
            c0.f(r5);
            if (fileDescriptor != null) {
                try {
                    Os.close(fileDescriptor);
                } catch (ErrnoException e17) {
                    Log.e("ExifInterfaceUtils", "Error closing fd.", e17);
                }
            }
            throw th;
        }
        return null;
    }

    public final void o(b bVar) throws Throwable {
        if (f16266v) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.f16244i = ByteOrder.LITTLE_ENDIAN;
        bVar.c(K.length);
        int i7 = bVar.readInt() + 8;
        byte[] bArr = L;
        bVar.c(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                bVar.readFully(bArr2);
                int i10 = bVar.readInt();
                int i11 = length + 8;
                if (Arrays.equals(M, bArr2)) {
                    byte[] bArrCopyOfRange = new byte[i10];
                    bVar.readFully(bArrCopyOfRange);
                    byte[] bArr3 = f16262e0;
                    if (c0.N(bArrCopyOfRange, bArr3)) {
                        bArrCopyOfRange = Arrays.copyOfRange(bArrCopyOfRange, bArr3.length, i10);
                    }
                    this.f16284p = i11;
                    x(bArrCopyOfRange, 0);
                    G(new b(bArrCopyOfRange));
                    return;
                }
                if (i10 % 2 == 1) {
                    i10++;
                }
                length = i11 + i10;
                if (length == i7) {
                    return;
                }
                if (length > i7) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                bVar.c(i10);
            } catch (EOFException e10) {
                throw new IOException("Encountered corrupt WebP file.", e10);
            }
        }
    }

    public final void q(b bVar, HashMap map) throws Throwable {
        d dVar = (d) map.get("JPEGInterchangeFormat");
        d dVar2 = (d) map.get("JPEGInterchangeFormatLength");
        if (dVar == null || dVar2 == null) {
            return;
        }
        int i7 = dVar.i(this.f16278h);
        int i10 = dVar2.i(this.f16278h);
        if (this.f16274d == 7) {
            i7 += this.f16285q;
        }
        if (i7 > 0 && i10 > 0) {
            this.f16279i = true;
            if (this.f16271a == null && this.f16273c == null && this.f16272b == null) {
                byte[] bArr = new byte[i10];
                bVar.c(i7);
                bVar.readFully(bArr);
                this.f16282n = bArr;
            }
            this.f16280l = i7;
            this.f16281m = i10;
        }
        if (f16266v) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + i7 + ", length: " + i10);
        }
    }

    public final void r(String str) throws Throwable {
        boolean z5;
        if (str == null) {
            throw new NullPointerException("filename cannot be null");
        }
        FileInputStream fileInputStream = null;
        this.f16273c = null;
        this.f16271a = str;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(str);
            try {
                try {
                    Os.lseek(fileInputStream2.getFD(), 0L, OsConstants.SEEK_CUR);
                    z5 = true;
                } catch (Exception unused) {
                    if (f16266v) {
                        Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                    }
                    z5 = false;
                }
                if (z5) {
                    this.f16272b = fileInputStream2.getFD();
                } else {
                    this.f16272b = null;
                }
                t(fileInputStream2);
                c0.f(fileInputStream2);
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = fileInputStream2;
                c0.f(fileInputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final boolean s(HashMap map) {
        d dVar = (d) map.get("ImageLength");
        d dVar2 = (d) map.get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            return false;
        }
        return dVar.i(this.f16278h) <= 512 && dVar2.i(this.f16278h) <= 512;
    }

    public final void t(InputStream inputStream) {
        boolean z5 = f16266v;
        for (int i7 = 0; i7 < X.length; i7++) {
            try {
                try {
                    this.f16276f[i7] = new HashMap();
                } catch (Throwable th2) {
                    a();
                    if (z5) {
                        v();
                    }
                    throw th2;
                }
            } catch (IOException | UnsupportedOperationException e10) {
                if (z5) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file (ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e10);
                }
                a();
                if (z5) {
                    v();
                    return;
                }
                return;
            }
        }
        boolean z6 = this.f16275e;
        if (!z6) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
            this.f16274d = g(bufferedInputStream);
            inputStream = bufferedInputStream;
        }
        int i10 = this.f16274d;
        if (i10 == 4 || i10 == 9 || i10 == 13 || i10 == 14) {
            b bVar = new b(inputStream);
            int i11 = this.f16274d;
            if (i11 == 4) {
                f(bVar, 0, 0);
            } else if (i11 == 13) {
                i(bVar);
            } else if (i11 == 9) {
                j(bVar);
            } else if (i11 == 14) {
                o(bVar);
            }
        } else {
            g gVar = new g(inputStream);
            if (!z6) {
                int i12 = this.f16274d;
                if (i12 == 12 || i12 == 15) {
                    e(gVar, i12);
                } else if (i12 == 7) {
                    h(gVar);
                } else if (i12 == 10) {
                    l(gVar);
                } else {
                    k(gVar);
                }
            } else if (!m(gVar)) {
                a();
                if (z5) {
                    v();
                    return;
                }
                return;
            }
            gVar.f(this.f16284p);
            G(gVar);
        }
        a();
        if (z5) {
            v();
        }
    }

    public final void u(g gVar) throws IOException {
        ByteOrder byteOrderW = w(gVar);
        this.f16278h = byteOrderW;
        gVar.f16244i = byteOrderW;
        int unsignedShort = gVar.readUnsignedShort();
        int i7 = this.f16274d;
        if (i7 != 7 && i7 != 10 && unsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(unsignedShort));
        }
        int i10 = gVar.readInt();
        if (i10 < 8) {
            throw new IOException(kk.b.h(i10, "Invalid first Ifd offset: "));
        }
        int i11 = i10 - 8;
        if (i11 > 0) {
            gVar.c(i11);
        }
    }

    public final void v() {
        int i7 = 0;
        while (true) {
            HashMap[] mapArr = this.f16276f;
            if (i7 >= mapArr.length) {
                return;
            }
            StringBuilder sbS = a3.e.s(i7, "The size of tag group[", "]: ");
            sbS.append(mapArr[i7].size());
            Log.d("ExifInterface", sbS.toString());
            for (Map.Entry entry : mapArr[i7].entrySet()) {
                d dVar = (d) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + dVar.toString() + ", tagValue: '" + dVar.j(this.f16278h) + "'");
            }
            i7++;
        }
    }

    public final void x(byte[] bArr, int i7) throws IOException {
        g gVar = new g(bArr);
        u(gVar);
        y(gVar, i7);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:102:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:107:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:108:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:109:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:111:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:114:0x0215 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:118:0x021d  */
    /* JADX WARN: Code duplicated, block: B:126:0x025b  */
    /* JADX WARN: Code duplicated, block: B:128:0x0263  */
    /* JADX WARN: Code duplicated, block: B:131:0x0284  */
    /* JADX WARN: Code duplicated, block: B:133:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:136:0x02be  */
    /* JADX WARN: Code duplicated, block: B:138:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:147:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:174:0x02f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x011f  */
    /* JADX WARN: Code duplicated, block: B:72:0x0129  */
    /* JADX WARN: Code duplicated, block: B:74:0x0131  */
    /* JADX WARN: Code duplicated, block: B:76:0x0137  */
    /* JADX WARN: Code duplicated, block: B:79:0x0143  */
    /* JADX WARN: Code duplicated, block: B:81:0x014d  */
    /* JADX WARN: Code duplicated, block: B:82:0x014f  */
    /* JADX WARN: Code duplicated, block: B:83:0x0153  */
    /* JADX WARN: Code duplicated, block: B:85:0x0156  */
    /* JADX WARN: Code duplicated, block: B:89:0x019a  */
    /* JADX WARN: Code duplicated, block: B:92:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:94:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:96:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:98:0x01ce  */
    /* JADX WARN: Instruction removed from duplicated block: B:128:0x0263, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:92:0x01ad, please report this as an issue */
    public final void y(g gVar, int i7) throws IOException {
        HashMap[] mapArr;
        long j;
        long j5;
        boolean z5;
        int i10;
        long j7;
        Integer num;
        HashSet hashSet;
        long j10;
        String str;
        String str2;
        int unsignedShort;
        long j11;
        String strI;
        int i11;
        int i12 = gVar.f16243e;
        int i13 = gVar.f16246w;
        Integer numValueOf = Integer.valueOf(i12);
        HashSet hashSet2 = this.f16277g;
        hashSet2.add(numValueOf);
        short s2 = gVar.readShort();
        String str3 = "ExifInterface";
        boolean z6 = f16266v;
        if (z6) {
            kk.b.q(s2, "numberOfDirectoryEntry: ", "ExifInterface");
        }
        if (s2 <= 0) {
            return;
        }
        short s5 = 0;
        while (true) {
            mapArr = this.f16276f;
            if (s5 >= s2) {
                break;
            }
            int unsignedShort2 = gVar.readUnsignedShort();
            int unsignedShort3 = gVar.readUnsignedShort();
            int i14 = gVar.readInt();
            long j12 = ((long) gVar.f16243e) + 4;
            short s7 = s2;
            e eVar = (e) Z[i7].get(Integer.valueOf(unsignedShort2));
            if (z6) {
                Log.d(str3, String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i7), Integer.valueOf(unsignedShort2), eVar != null ? eVar.f16254b : null, Integer.valueOf(unsignedShort3), Integer.valueOf(i14)));
            }
            if (eVar != null) {
                if (unsignedShort3 > 0) {
                    int[] iArr = U;
                    if (unsignedShort3 < iArr.length) {
                        int i15 = eVar.f16255c;
                        if (i15 == 7 || unsignedShort3 == 7 || i15 == unsignedShort3 || (i10 = eVar.f16256d) == unsignedShort3 || (((i15 == 4 || i10 == 4) && unsignedShort3 == 3) || (((i15 == 9 || i10 == 9) && unsignedShort3 == 8) || ((i15 == 12 || i10 == 12) && unsignedShort3 == 11)))) {
                            if (unsignedShort3 == 7) {
                                unsignedShort3 = i15;
                            }
                            j = j12;
                            j5 = ((long) i14) * ((long) iArr[unsignedShort3]);
                            if (j5 < 0 || j5 > 2147483647L) {
                                if (z6 != 0) {
                                    kk.b.q(i14, "Skip the tag entry since the number of components is invalid: ", str3);
                                }
                                z5 = false;
                            } else {
                                z5 = true;
                            }
                        } else if (z6 != 0) {
                            Log.d(str3, "Skip the tag entry since data format (" + T[unsignedShort3] + ") is unexpected for tag: " + eVar.f16254b);
                        }
                    }
                    if (z5) {
                        j7 = j;
                        if (j5 > 4) {
                            i11 = gVar.readInt();
                            if (z6 != 0) {
                                kk.b.q(i11, "seek to data offset: ", str3);
                            }
                            if (this.f16274d == 7) {
                                if ("MakerNote".equals(eVar.f16254b)) {
                                    this.f16285q = i11;
                                } else if (i7 != 6 && "ThumbnailImage".equals(eVar.f16254b)) {
                                    this.f16286r = i11;
                                    this.f16287s = i14;
                                    d dVarF = d.f(6, this.f16278h);
                                    d dVarC = d.c(this.f16286r, this.f16278h);
                                    d dVarC2 = d.c(this.f16287s, this.f16278h);
                                    mapArr[4].put("Compression", dVarF);
                                    mapArr[4].put("JPEGInterchangeFormat", dVarC);
                                    mapArr[4].put("JPEGInterchangeFormatLength", dVarC2);
                                }
                            }
                            gVar.f(i11);
                        } else {
                            j7 = j7;
                            eVar = eVar;
                        }
                        num = (Integer) f16260c0.get(Integer.valueOf(unsignedShort2));
                        if (z6 != 0) {
                            Log.d(str3, "nextIfdType: " + num + " byteCount: " + j5);
                        }
                        if (num != null) {
                            if (unsignedShort3 != 3) {
                                if (unsignedShort3 == 4) {
                                    j11 = ((long) gVar.readInt()) & 4294967295L;
                                } else if (unsignedShort3 == 8) {
                                    unsignedShort = gVar.readShort();
                                } else if (unsignedShort3 != 9 || unsignedShort3 == 13) {
                                    unsignedShort = gVar.readInt();
                                } else {
                                    j11 = -1;
                                }
                                if (z6 != 0) {
                                    Log.d(str3, String.format("Offset: %d, tagName: %s", Long.valueOf(j11), eVar.f16254b));
                                }
                                if (j11 > 0 || (i13 != -1 && j11 >= i13)) {
                                    hashSet = hashSet2;
                                    if (z6 != 0) {
                                        strI = kk.b.i(j11, "Skip jump into the IFD since its offset is invalid: ");
                                        if (i13 != -1) {
                                            strI = strI + " (total length: " + i13 + ")";
                                        }
                                        Log.d(str3, strI);
                                    }
                                } else {
                                    hashSet = hashSet2;
                                    if (!hashSet.contains(Integer.valueOf((int) j11))) {
                                        gVar.f(j11);
                                        y(gVar, num.intValue());
                                    } else if (z6 != 0) {
                                        Log.d(str3, "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j11 + ")");
                                    }
                                }
                                gVar.f(j7);
                                str = str3;
                            } else {
                                unsignedShort = gVar.readUnsignedShort();
                            }
                            j11 = unsignedShort;
                            if (z6 != 0) {
                                Log.d(str3, String.format("Offset: %d, tagName: %s", Long.valueOf(j11), eVar.f16254b));
                            }
                            if (j11 > 0) {
                                hashSet = hashSet2;
                                if (z6 != 0) {
                                    strI = kk.b.i(j11, "Skip jump into the IFD since its offset is invalid: ");
                                    if (i13 != -1) {
                                        strI = strI + " (total length: " + i13 + ")";
                                    }
                                    Log.d(str3, strI);
                                }
                            } else {
                                hashSet = hashSet2;
                                if (z6 != 0) {
                                    strI = kk.b.i(j11, "Skip jump into the IFD since its offset is invalid: ");
                                    if (i13 != -1) {
                                        strI = strI + " (total length: " + i13 + ")";
                                    }
                                    Log.d(str3, strI);
                                }
                            }
                            gVar.f(j7);
                            str = str3;
                        } else {
                            hashSet = hashSet2;
                            j10 = j7;
                            int i16 = gVar.f16243e + this.f16284p;
                            byte[] bArr = new byte[(int) j5];
                            gVar.readFully(bArr);
                            str = str3;
                            d dVar = new d(i16, bArr, unsignedShort3, i14);
                            HashMap map = mapArr[i7];
                            str2 = eVar.f16254b;
                            map.put(str2, dVar);
                            if ("DNGVersion".equals(str2)) {
                                this.f16274d = 3;
                            }
                            if (((!"Make".equals(str2) || "Model".equals(str2)) && dVar.j(this.f16278h).contains("PENTAX")) || ("Compression".equals(str2) && dVar.i(this.f16278h) == 65535)) {
                                this.f16274d = 8;
                            }
                            if (gVar.f16243e != j10) {
                                gVar.f(j10);
                            }
                        }
                    } else {
                        gVar.f(j);
                        str = str3;
                        hashSet = hashSet2;
                    }
                    s5 = (short) (s5 + 1);
                    str3 = str;
                    hashSet2 = hashSet;
                    s2 = s7;
                    z6 = z6;
                }
                j = j12;
                if (z6 != 0) {
                    kk.b.q(unsignedShort3, "Skip the tag entry since data format is invalid: ", str3);
                }
                j5 = 0;
                z5 = false;
                if (z5) {
                    gVar.f(j);
                    str = str3;
                    hashSet = hashSet2;
                } else {
                    j7 = j;
                    if (j5 > 4) {
                        i11 = gVar.readInt();
                        if (z6 != 0) {
                            kk.b.q(i11, "seek to data offset: ", str3);
                        }
                        if (this.f16274d == 7) {
                            if ("MakerNote".equals(eVar.f16254b)) {
                                this.f16285q = i11;
                            } else if (i7 != 6) {
                            }
                        }
                        gVar.f(i11);
                    } else {
                        j7 = j7;
                        eVar = eVar;
                    }
                    num = (Integer) f16260c0.get(Integer.valueOf(unsignedShort2));
                    if (z6 != 0) {
                        Log.d(str3, "nextIfdType: " + num + " byteCount: " + j5);
                    }
                    if (num != null) {
                        if (unsignedShort3 != 3) {
                            if (unsignedShort3 == 4) {
                                j11 = ((long) gVar.readInt()) & 4294967295L;
                            } else if (unsignedShort3 == 8) {
                                if (unsignedShort3 != 9) {
                                }
                                unsignedShort = gVar.readInt();
                            } else {
                                unsignedShort = gVar.readShort();
                            }
                            if (z6 != 0) {
                                Log.d(str3, String.format("Offset: %d, tagName: %s", Long.valueOf(j11), eVar.f16254b));
                            }
                            if (j11 > 0) {
                                hashSet = hashSet2;
                                if (z6 != 0) {
                                    strI = kk.b.i(j11, "Skip jump into the IFD since its offset is invalid: ");
                                    if (i13 != -1) {
                                        strI = strI + " (total length: " + i13 + ")";
                                    }
                                    Log.d(str3, strI);
                                }
                            } else {
                                hashSet = hashSet2;
                                if (z6 != 0) {
                                    strI = kk.b.i(j11, "Skip jump into the IFD since its offset is invalid: ");
                                    if (i13 != -1) {
                                        strI = strI + " (total length: " + i13 + ")";
                                    }
                                    Log.d(str3, strI);
                                }
                            }
                            gVar.f(j7);
                            str = str3;
                        } else {
                            unsignedShort = gVar.readUnsignedShort();
                        }
                        j11 = unsignedShort;
                        if (z6 != 0) {
                            Log.d(str3, String.format("Offset: %d, tagName: %s", Long.valueOf(j11), eVar.f16254b));
                        }
                        if (j11 > 0) {
                            hashSet = hashSet2;
                            if (z6 != 0) {
                                strI = kk.b.i(j11, "Skip jump into the IFD since its offset is invalid: ");
                                if (i13 != -1) {
                                    strI = strI + " (total length: " + i13 + ")";
                                }
                                Log.d(str3, strI);
                            }
                        } else {
                            hashSet = hashSet2;
                            if (z6 != 0) {
                                strI = kk.b.i(j11, "Skip jump into the IFD since its offset is invalid: ");
                                if (i13 != -1) {
                                    strI = strI + " (total length: " + i13 + ")";
                                }
                                Log.d(str3, strI);
                            }
                        }
                        gVar.f(j7);
                        str = str3;
                    } else {
                        hashSet = hashSet2;
                        j10 = j7;
                        int i17 = gVar.f16243e + this.f16284p;
                        byte[] bArr2 = new byte[(int) j5];
                        gVar.readFully(bArr2);
                        str = str3;
                        d dVar2 = new d(i17, bArr2, unsignedShort3, i14);
                        HashMap map2 = mapArr[i7];
                        str2 = eVar.f16254b;
                        map2.put(str2, dVar2);
                        if ("DNGVersion".equals(str2)) {
                            this.f16274d = 3;
                        }
                        if (!"Make".equals(str2)) {
                        }
                        this.f16274d = 8;
                        if (gVar.f16243e != j10) {
                            gVar.f(j10);
                        }
                    }
                }
                s5 = (short) (s5 + 1);
                str3 = str;
                hashSet2 = hashSet;
                s2 = s7;
                z6 = z6;
            } else if (z6) {
                kk.b.q(unsignedShort2, "Skip the tag entry since tag number is not defined: ", str3);
            }
            j = j12;
            j5 = 0;
            z5 = false;
            if (z5) {
                gVar.f(j);
                str = str3;
                hashSet = hashSet2;
            } else {
                j7 = j;
                if (j5 > 4) {
                    i11 = gVar.readInt();
                    if (z6 != 0) {
                        kk.b.q(i11, "seek to data offset: ", str3);
                    }
                    if (this.f16274d == 7) {
                        if ("MakerNote".equals(eVar.f16254b)) {
                            this.f16285q = i11;
                        } else if (i7 != 6) {
                        }
                    }
                    gVar.f(i11);
                } else {
                    j7 = j7;
                    eVar = eVar;
                }
                num = (Integer) f16260c0.get(Integer.valueOf(unsignedShort2));
                if (z6 != 0) {
                    Log.d(str3, "nextIfdType: " + num + " byteCount: " + j5);
                }
                if (num != null) {
                    if (unsignedShort3 != 3) {
                        if (unsignedShort3 == 4) {
                            j11 = ((long) gVar.readInt()) & 4294967295L;
                        } else if (unsignedShort3 == 8) {
                            if (unsignedShort3 != 9) {
                            }
                            unsignedShort = gVar.readInt();
                        } else {
                            unsignedShort = gVar.readShort();
                        }
                        if (z6 != 0) {
                            Log.d(str3, String.format("Offset: %d, tagName: %s", Long.valueOf(j11), eVar.f16254b));
                        }
                        if (j11 > 0) {
                            hashSet = hashSet2;
                            if (z6 != 0) {
                                strI = kk.b.i(j11, "Skip jump into the IFD since its offset is invalid: ");
                                if (i13 != -1) {
                                    strI = strI + " (total length: " + i13 + ")";
                                }
                                Log.d(str3, strI);
                            }
                        } else {
                            hashSet = hashSet2;
                            if (z6 != 0) {
                                strI = kk.b.i(j11, "Skip jump into the IFD since its offset is invalid: ");
                                if (i13 != -1) {
                                    strI = strI + " (total length: " + i13 + ")";
                                }
                                Log.d(str3, strI);
                            }
                        }
                        gVar.f(j7);
                        str = str3;
                    } else {
                        unsignedShort = gVar.readUnsignedShort();
                    }
                    j11 = unsignedShort;
                    if (z6 != 0) {
                        Log.d(str3, String.format("Offset: %d, tagName: %s", Long.valueOf(j11), eVar.f16254b));
                    }
                    if (j11 > 0) {
                        hashSet = hashSet2;
                        if (z6 != 0) {
                            strI = kk.b.i(j11, "Skip jump into the IFD since its offset is invalid: ");
                            if (i13 != -1) {
                                strI = strI + " (total length: " + i13 + ")";
                            }
                            Log.d(str3, strI);
                        }
                    } else {
                        hashSet = hashSet2;
                        if (z6 != 0) {
                            strI = kk.b.i(j11, "Skip jump into the IFD since its offset is invalid: ");
                            if (i13 != -1) {
                                strI = strI + " (total length: " + i13 + ")";
                            }
                            Log.d(str3, strI);
                        }
                    }
                    gVar.f(j7);
                    str = str3;
                } else {
                    hashSet = hashSet2;
                    j10 = j7;
                    int i18 = gVar.f16243e + this.f16284p;
                    byte[] bArr3 = new byte[(int) j5];
                    gVar.readFully(bArr3);
                    str = str3;
                    d dVar3 = new d(i18, bArr3, unsignedShort3, i14);
                    HashMap map3 = mapArr[i7];
                    str2 = eVar.f16254b;
                    map3.put(str2, dVar3);
                    if ("DNGVersion".equals(str2)) {
                        this.f16274d = 3;
                    }
                    if (!"Make".equals(str2)) {
                    }
                    this.f16274d = 8;
                    if (gVar.f16243e != j10) {
                        gVar.f(j10);
                    }
                }
            }
            s5 = (short) (s5 + 1);
            str3 = str;
            hashSet2 = hashSet;
            s2 = s7;
            z6 = z6;
        }
        HashSet hashSet3 = hashSet2;
        String str4 = str3;
        boolean z7 = z6;
        int i19 = gVar.readInt();
        if (z7) {
            Log.d(str4, String.format("nextIfdOffset: %d", Integer.valueOf(i19)));
        }
        long j13 = i19;
        if (j13 <= 0) {
            if (z7) {
                kk.b.q(i19, "Stop reading file since a wrong offset may cause an infinite loop: ", str4);
            }
        } else {
            if (hashSet3.contains(Integer.valueOf(i19))) {
                if (z7) {
                    kk.b.q(i19, "Stop reading file since re-reading an IFD may cause an infinite loop: ", str4);
                    return;
                }
                return;
            }
            gVar.f(j13);
            if (mapArr[4].isEmpty()) {
                y(gVar, 4);
            } else if (mapArr[5].isEmpty()) {
                y(gVar, 5);
            }
        }
    }

    public final void z(String str) {
        for (int i7 = 0; i7 < X.length; i7++) {
            this.f16276f[i7].remove(str);
        }
    }

    public h(String str) throws Throwable {
        e[][] eVarArr = X;
        this.f16276f = new HashMap[eVarArr.length];
        this.f16277g = new HashSet(eVarArr.length);
        this.f16278h = ByteOrder.BIG_ENDIAN;
        if (str != null) {
            r(str);
            return;
        }
        throw new NullPointerException("filename cannot be null");
    }

    public h(InputStream inputStream) throws IOException {
        e[][] eVarArr = X;
        this.f16276f = new HashMap[eVarArr.length];
        this.f16277g = new HashSet(eVarArr.length);
        this.f16278h = ByteOrder.BIG_ENDIAN;
        if (inputStream != null) {
            this.f16271a = null;
            this.f16275e = false;
            if (inputStream instanceof AssetManager.AssetInputStream) {
                this.f16273c = (AssetManager.AssetInputStream) inputStream;
                this.f16272b = null;
            } else if (inputStream instanceof FileInputStream) {
                FileInputStream fileInputStream = (FileInputStream) inputStream;
                try {
                    Os.lseek(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                    this.f16273c = null;
                    this.f16272b = fileInputStream.getFD();
                } catch (Exception unused) {
                    if (f16266v) {
                        Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                    }
                    this.f16273c = null;
                    this.f16272b = null;
                }
            } else {
                this.f16273c = null;
                this.f16272b = null;
            }
            t(inputStream);
            return;
        }
        throw new NullPointerException("inputStream cannot be null");
    }
}
