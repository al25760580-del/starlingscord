package org.webrtc;

/* JADX INFO: loaded from: classes4.dex */
class NativeLibrary {
    private static final String TAG = "NativeLibrary";
    private static boolean libraryLoaded;
    private static final Object lock = new Object();

    public static class DefaultLoader implements NativeLibraryLoader {
        @Override // org.webrtc.NativeLibraryLoader
        public boolean load(String str) {
            Logging.d(NativeLibrary.TAG, "Loading library: " + str);
            System.loadLibrary(str);
            return true;
        }
    }

    public static void initialize(NativeLibraryLoader nativeLibraryLoader, String str) {
        synchronized (lock) {
            try {
                if (libraryLoaded) {
                    Logging.d(TAG, "Native library has already been loaded.");
                    return;
                }
                Logging.d(TAG, "Loading native library: " + str);
                libraryLoaded = nativeLibraryLoader.load(str);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static boolean isLoaded() {
        boolean z5;
        synchronized (lock) {
            z5 = libraryLoaded;
        }
        return z5;
    }
}
