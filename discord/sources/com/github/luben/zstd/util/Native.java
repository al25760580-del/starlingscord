package com.github.luben.zstd.util;

import a3.e;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.presentation.list.a;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public enum Native {
    ;

    private static final String errorMsg = a.k(new StringBuilder("Unsupported OS/arch, cannot find "), resourceName(), " or load zstd-jni-1.5.7-3 from system libraries. Please try building from source the jar or providing libzstd-jni-1.5.7-3 in your system.");
    private static AtomicBoolean loaded = new AtomicBoolean(false);

    private static String libExtension() {
        if (osName().contains("os_x") || osName().contains("darwin")) {
            return "dylib";
        }
        return osName().contains("win") ? "dll" : "so";
    }

    public static synchronized void load() {
        try {
            String property = System.getProperty("ZstdTempFolder");
            if (property == null) {
                load(null);
            } else {
                load(new File(property));
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private static void loadLibrary(final String str) {
        AccessController.doPrivileged(new PrivilegedAction<Void>() { // from class: com.github.luben.zstd.util.Native.1
            @Override // java.security.PrivilegedAction
            public Void run() {
                System.loadLibrary(str);
                return null;
            }
        });
    }

    private static void loadLibraryFile(final String str) {
        AccessController.doPrivileged(new PrivilegedAction<Void>() { // from class: com.github.luben.zstd.util.Native.2
            @Override // java.security.PrivilegedAction
            public Void run() {
                System.load(str);
                return null;
            }
        });
    }

    private static String osName() {
        String strReplace = System.getProperty("os.name").toLowerCase().replace(' ', '_');
        if (strReplace.startsWith("win")) {
            return "win";
        }
        return strReplace.startsWith("mac") ? "darwin" : strReplace;
    }

    private static String resourceName() {
        String strOsName = osName();
        String property = System.getProperty("os.arch");
        if (strOsName.equals("darwin") && property.equals("amd64")) {
            property = "x86_64";
        }
        StringBuilder sbU = e.u("/", strOsName, "/", property, "/libzstd-jni-1.5.7-3.");
        sbU.append(libExtension());
        return sbU.toString();
    }

    public static Native valueOf(String str) {
        e.x(Enum.valueOf(Native.class, str));
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:109:? A[ADDED_TO_REGION, Catch: all -> 0x0026, REMOVE, SYNTHETIC, TRY_ENTER, TryCatch #1 {, blocks: (B:4:0x0005, B:8:0x000f, B:10:0x001c, B:18:0x003a, B:20:0x0042, B:48:0x00cd, B:50:0x00d2, B:51:0x00d5, B:53:0x00db, B:72:0x014c, B:74:0x0151, B:76:0x0156, B:78:0x015c, B:79:0x015f, B:24:0x004f, B:25:0x0075, B:15:0x0029), top: B:86:0x0005, inners: #5, #11 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0151 A[Catch: all -> 0x0026, IOException -> 0x015f, TryCatch #1 {, blocks: (B:4:0x0005, B:8:0x000f, B:10:0x001c, B:18:0x003a, B:20:0x0042, B:48:0x00cd, B:50:0x00d2, B:51:0x00d5, B:53:0x00db, B:72:0x014c, B:74:0x0151, B:76:0x0156, B:78:0x015c, B:79:0x015f, B:24:0x004f, B:25:0x0075, B:15:0x0029), top: B:86:0x0005, inners: #5, #11 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0156 A[Catch: all -> 0x0026, IOException -> 0x015f, TryCatch #1 {, blocks: (B:4:0x0005, B:8:0x000f, B:10:0x001c, B:18:0x003a, B:20:0x0042, B:48:0x00cd, B:50:0x00d2, B:51:0x00d5, B:53:0x00db, B:72:0x014c, B:74:0x0151, B:76:0x0156, B:78:0x015c, B:79:0x015f, B:24:0x004f, B:25:0x0075, B:15:0x0029), top: B:86:0x0005, inners: #5, #11 }] */
    public static synchronized void load(File file) {
        File file2;
        Throwable th2;
        FileOutputStream fileOutputStream;
        if (loaded.get()) {
            return;
        }
        String strResourceName = resourceName();
        String property = System.getProperty("ZstdNativePath");
        if (property != null) {
            loadLibraryFile(property);
            loaded.set(true);
            return;
        }
        try {
            Class.forName("org.osgi.framework.BundleEvent");
            loadLibrary("libzstd-jni-1.5.7-3");
            loaded.set(true);
        } catch (Throwable unused) {
            InputStream resourceAsStream = Native.class.getResourceAsStream(strResourceName);
            if (resourceAsStream == null) {
                try {
                    loadLibrary("zstd-jni-1.5.7-3");
                    loaded.set(true);
                    return;
                } catch (UnsatisfiedLinkError e10) {
                    UnsatisfiedLinkError unsatisfiedLinkError = new UnsatisfiedLinkError(e10.getMessage() + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE + errorMsg);
                    unsatisfiedLinkError.setStackTrace(e10.getStackTrace());
                    throw unsatisfiedLinkError;
                }
            }
            File file3 = null;
            fileOutputStream = null;
            fileOutputStream = null;
            FileOutputStream fileOutputStream2 = null;
            try {
                File fileCreateTempFile = File.createTempFile("libzstd-jni-1.5.7-3", "." + libExtension(), file);
                try {
                    fileCreateTempFile.deleteOnExit();
                    FileOutputStream fileOutputStream3 = new FileOutputStream(fileCreateTempFile);
                    try {
                        try {
                            byte[] bArr = new byte[RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT];
                            while (true) {
                                int i7 = resourceAsStream.read(bArr);
                                if (i7 == -1) {
                                    try {
                                        break;
                                    } catch (IOException unused2) {
                                        fileOutputStream2 = fileOutputStream3;
                                    }
                                } else {
                                    fileOutputStream3.write(bArr, 0, i7);
                                }
                            }
                            fileOutputStream3.flush();
                            fileOutputStream3.close();
                            try {
                                loadLibraryFile(fileCreateTempFile.getAbsolutePath());
                            } catch (UnsatisfiedLinkError e11) {
                                try {
                                    loadLibrary("zstd-jni-1.5.7-3");
                                } catch (UnsatisfiedLinkError e12) {
                                    UnsatisfiedLinkError unsatisfiedLinkError2 = new UnsatisfiedLinkError(e11.getMessage() + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE + e12.getMessage() + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE + errorMsg);
                                    unsatisfiedLinkError2.setStackTrace(e12.getStackTrace());
                                    throw unsatisfiedLinkError2;
                                }
                            }
                            loaded.set(true);
                            try {
                                resourceAsStream.close();
                                if (fileOutputStream2 != null) {
                                    fileOutputStream2.close();
                                }
                                if (fileCreateTempFile.exists()) {
                                    fileCreateTempFile.delete();
                                }
                            } catch (IOException unused3) {
                            }
                        } catch (IOException e13) {
                            file3 = fileCreateTempFile;
                            fileOutputStream = fileOutputStream3;
                            e = e13;
                            try {
                                ExceptionInInitializerError exceptionInInitializerError = new ExceptionInInitializerError("Cannot unpack libzstd-jni-1.5.7-3: " + e.getMessage());
                                exceptionInInitializerError.setStackTrace(e.getStackTrace());
                                throw exceptionInInitializerError;
                            } catch (Throwable th3) {
                                File file4 = file3;
                                th2 = th3;
                                file2 = file4;
                                try {
                                    resourceAsStream.close();
                                    if (fileOutputStream != null) {
                                        fileOutputStream.close();
                                    }
                                    if (file2 == null) {
                                        throw th2;
                                    }
                                    throw th2;
                                } catch (IOException unused4) {
                                    throw th2;
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        th2 = th4;
                        file2 = fileCreateTempFile;
                        fileOutputStream = fileOutputStream3;
                        resourceAsStream.close();
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        if (file2 == null && file2.exists()) {
                            file2.delete();
                            throw th2;
                        }
                        throw th2;
                    }
                } catch (IOException e14) {
                    e = e14;
                    FileOutputStream fileOutputStream4 = fileOutputStream2;
                    file3 = fileCreateTempFile;
                    fileOutputStream = fileOutputStream4;
                    ExceptionInInitializerError exceptionInInitializerError2 = new ExceptionInInitializerError("Cannot unpack libzstd-jni-1.5.7-3: " + e.getMessage());
                    exceptionInInitializerError2.setStackTrace(e.getStackTrace());
                    throw exceptionInInitializerError2;
                } catch (Throwable th5) {
                    file2 = fileCreateTempFile;
                    fileOutputStream = fileOutputStream2;
                    th2 = th5;
                    resourceAsStream.close();
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    if (file2 == null) {
                        throw th2;
                    }
                    throw th2;
                }
            } catch (IOException e15) {
                e = e15;
                fileOutputStream = null;
            } catch (Throwable th6) {
                file2 = null;
                th2 = th6;
                fileOutputStream = null;
            }
        }
    }
}
