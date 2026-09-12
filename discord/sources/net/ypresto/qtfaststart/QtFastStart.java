package net.ypresto.qtfaststart;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes3.dex */
public class QtFastStart {
    private static final int ATOM_PREAMBLE_SIZE = 8;
    public static boolean sDEBUG = false;
    private static final int FREE_ATOM = fourCcToInt(new byte[]{102, 114, 101, 101});
    private static final int JUNK_ATOM = fourCcToInt(new byte[]{106, 117, 110, 107});
    private static final int MDAT_ATOM = fourCcToInt(new byte[]{109, 100, 97, 116});
    private static final int MOOV_ATOM = fourCcToInt(new byte[]{109, 111, 111, 118});
    private static final int PNOT_ATOM = fourCcToInt(new byte[]{112, 110, 111, 116});
    private static final int SKIP_ATOM = fourCcToInt(new byte[]{115, 107, 105, 112});
    private static final int WIDE_ATOM = fourCcToInt(new byte[]{119, 105, 100, 101});
    private static final int PICT_ATOM = fourCcToInt(new byte[]{80, 73, 67, 84});
    private static final int FTYP_ATOM = fourCcToInt(new byte[]{102, 116, 121, 112});
    private static final int UUID_ATOM = fourCcToInt(new byte[]{117, 117, 105, 100});
    private static final int CMOV_ATOM = fourCcToInt(new byte[]{99, 109, 111, 118});
    private static final int STCO_ATOM = fourCcToInt(new byte[]{115, 116, 99, 111});
    private static final int CO64_ATOM = fourCcToInt(new byte[]{99, 111, 54, 52});

    public static class MalformedFileException extends QtFastStartException {
        public /* synthetic */ MalformedFileException(String str, int i7) {
            this(str);
        }

        private MalformedFileException(String str) {
            super(str, 0);
        }
    }

    public static class QtFastStartException extends Exception {
        public /* synthetic */ QtFastStartException(String str, int i7) {
            this(str);
        }

        private QtFastStartException(String str) {
            super(str);
        }
    }

    public static class UnsupportedFileException extends QtFastStartException {
        public /* synthetic */ UnsupportedFileException(String str, int i7) {
            this(str);
        }

        private UnsupportedFileException(String str) {
            super(str, 0);
        }
    }

    public static boolean fastStart(File file, File file2) {
        return fastStartStream(new FileInputStream(file), file2);
    }

    /* JADX WARN: Code duplicated, block: B:103:0x00eb A[EDGE_INSN: B:103:0x00eb->B:40:0x00eb BREAK  A[LOOP:0: B:3:0x0016->B:104:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:? A[LOOP:0: B:3:0x0016->B:104:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x00e7  */
    private static boolean fastStartImpl(FileChannel fileChannel, FileChannel fileChannel2) throws MalformedFileException, UnsupportedFileException, IOException {
        int i7;
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(8).order(ByteOrder.BIG_ENDIAN);
        int i10 = 0;
        long jUint32ToLong = 0;
        ByteBuffer byteBuffer = null;
        int i11 = 0;
        long jPosition = 0;
        while (readAndFill(fileChannel, byteBufferOrder)) {
            jUint32ToLong = uint32ToLong(byteBufferOrder.getInt());
            i11 = byteBufferOrder.getInt();
            int i12 = FTYP_ATOM;
            if (i11 != i12) {
                if (jUint32ToLong == 1) {
                    byteBufferOrder.clear();
                    if (!readAndFill(fileChannel, byteBufferOrder)) {
                        break;
                    }
                    jUint32ToLong = uint64ToLong(byteBufferOrder.getLong());
                    fileChannel.position((fileChannel.position() + jUint32ToLong) - 16);
                } else {
                    fileChannel.position((fileChannel.position() + jUint32ToLong) - 8);
                }
                printf("%c%c%c%c %10d %d", Integer.valueOf((i11 >> 24) & 255), Integer.valueOf((i11 >> 16) & 255), Integer.valueOf((i11 >> 8) & 255), Integer.valueOf(i11 & 255), Long.valueOf(fileChannel.position() - jUint32ToLong), Long.valueOf(jUint32ToLong));
                if (i11 != FREE_ATOM) {
                    if (jUint32ToLong < 8) {
                        break;
                        break;
                    }
                } else {
                    if (jUint32ToLong < 8) {
                        break;
                        break;
                    }
                }
            } else {
                int iUint32ToInt = uint32ToInt(jUint32ToLong);
                ByteBuffer byteBufferOrder2 = ByteBuffer.allocate(iUint32ToInt).order(ByteOrder.BIG_ENDIAN);
                byteBufferOrder.rewind();
                byteBufferOrder2.put(byteBufferOrder);
                if (fileChannel.read(byteBufferOrder2) < iUint32ToInt - 8) {
                    byteBuffer = byteBufferOrder2;
                    break;
                }
                byteBufferOrder2.flip();
                jPosition = fileChannel.position();
                byteBuffer = byteBufferOrder2;
                printf("%c%c%c%c %10d %d", Integer.valueOf((i11 >> 24) & 255), Integer.valueOf((i11 >> 16) & 255), Integer.valueOf((i11 >> 8) & 255), Integer.valueOf(i11 & 255), Long.valueOf(fileChannel.position() - jUint32ToLong), Long.valueOf(jUint32ToLong));
                if (i11 != FREE_ATOM && i11 != JUNK_ATOM && i11 != MDAT_ATOM && i11 != MOOV_ATOM && i11 != PNOT_ATOM && i11 != SKIP_ATOM && i11 != WIDE_ATOM && i11 != PICT_ATOM && i11 != UUID_ATOM && i11 != i12) {
                    printf("encountered non-QT top-level atom (is this a QuickTime file?)", new Object[0]);
                    break;
                }
                if (jUint32ToLong < 8) {
                    break;
                }
            }
        }
        if (i11 != MOOV_ATOM) {
            printf("last atom in file was not a moov atom, can't make streamable", new Object[0]);
            return false;
        }
        int iUint32ToInt2 = uint32ToInt(jUint32ToLong);
        long j = iUint32ToInt2;
        long size = fileChannel.size() - j;
        ByteBuffer byteBufferOrder3 = ByteBuffer.allocate(iUint32ToInt2).order(ByteOrder.BIG_ENDIAN);
        if (!readAndFill(fileChannel, byteBufferOrder3, size)) {
            throw new MalformedFileException("failed to read moov atom", i10);
        }
        if (byteBufferOrder3.getInt(12) == CMOV_ATOM) {
            throw new UnsupportedFileException("this utility does not support compressed moov atoms yet", i10);
        }
        for (int i13 = 8; byteBufferOrder3.remaining() >= i13; i13 = 8) {
            int iPosition = byteBufferOrder3.position();
            int i14 = byteBufferOrder3.getInt(iPosition + 4);
            int i15 = STCO_ATOM;
            if (i14 == i15 || i14 == CO64_ATOM) {
                ByteBuffer byteBuffer2 = byteBuffer;
                if (uint32ToLong(byteBufferOrder3.getInt(iPosition)) > byteBufferOrder3.remaining()) {
                    throw new MalformedFileException("bad atom size", 0);
                }
                byteBufferOrder3.position(iPosition + 12);
                if (byteBufferOrder3.remaining() < 4) {
                    throw new MalformedFileException("malformed atom", 0);
                }
                int iUint32ToInt3 = uint32ToInt(byteBufferOrder3.getInt());
                String str = "bad atom size/element count";
                if (i14 == i15) {
                    printf("patching stco atom...", new Object[0]);
                    if (byteBufferOrder3.remaining() < iUint32ToInt3 * 4) {
                        throw new MalformedFileException(str, 0);
                    }
                    for (int i16 = 0; i16 < iUint32ToInt3; i16++) {
                        int i17 = byteBufferOrder3.getInt(byteBufferOrder3.position());
                        int i18 = i17 + iUint32ToInt2;
                        if (i17 < 0 && i18 >= 0) {
                            throw new UnsupportedFileException("This is bug in original qt-faststart.c: stco atom should be extended to co64 atom as new offset value overflows uint32, but is not implemented.", 0);
                        }
                        byteBufferOrder3.putInt(i18);
                    }
                } else {
                    i7 = 0;
                    if (i14 == CO64_ATOM) {
                        printf("patching co64 atom...", new Object[0]);
                        if (byteBufferOrder3.remaining() < iUint32ToInt3 * 8) {
                            throw new MalformedFileException(str, 0);
                        }
                        for (int i19 = 0; i19 < iUint32ToInt3; i19++) {
                            byteBufferOrder3.putLong(byteBufferOrder3.getLong(byteBufferOrder3.position()) + j);
                        }
                    }
                    i10 = i7;
                    byteBuffer = byteBuffer2;
                }
                i7 = 0;
                i10 = i7;
                byteBuffer = byteBuffer2;
            } else {
                byteBufferOrder3.position(byteBufferOrder3.position() + 1);
            }
        }
        int i20 = i10;
        ByteBuffer byteBuffer3 = byteBuffer;
        fileChannel.position(jPosition);
        if (byteBuffer3 != null) {
            printf("writing ftyp atom...", new Object[i20]);
            byteBuffer3.rewind();
            fileChannel2.write(byteBuffer3);
        }
        printf("writing moov atom...", new Object[i20]);
        byteBufferOrder3.rewind();
        fileChannel2.write(byteBufferOrder3);
        printf("copying rest of file...", new Object[i20]);
        fileChannel.transferTo(jPosition, size - jPosition, fileChannel2);
        return true;
    }

    private static boolean fastStartStream(FileInputStream fileInputStream, File file) throws Throwable {
        FileOutputStream fileOutputStream = null;
        try {
            FileChannel channel = fileInputStream.getChannel();
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                boolean zFastStartImpl = fastStartImpl(channel, fileOutputStream2.getChannel());
                fileInputStream.close();
                fileOutputStream2.close();
                return zFastStartImpl;
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream2;
                fileInputStream.close();
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private static int fourCcToInt(byte[] bArr) {
        return ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).getInt();
    }

    private static void printf(String str, Object... objArr) {
        if (sDEBUG) {
            System.err.println("QtFastStart: ".concat(String.format(str, objArr)));
        }
    }

    private static boolean readAndFill(FileChannel fileChannel, ByteBuffer byteBuffer) throws IOException {
        byteBuffer.clear();
        int i7 = fileChannel.read(byteBuffer);
        byteBuffer.flip();
        return i7 == byteBuffer.capacity();
    }

    public static int uint32ToInt(int i7) throws UnsupportedFileException {
        if (i7 >= 0) {
            return i7;
        }
        throw new UnsupportedFileException("uint32 value is too large", 0);
    }

    public static long uint32ToLong(int i7) {
        return ((long) i7) & 4294967295L;
    }

    public static long uint64ToLong(long j) throws UnsupportedFileException {
        if (j >= 0) {
            return j;
        }
        throw new UnsupportedFileException("uint64 value is too large", 0);
    }

    public static boolean fastStart(FileDescriptor fileDescriptor, File file) {
        return fastStartStream(new FileInputStream(fileDescriptor), file);
    }

    public static int uint32ToInt(long j) throws UnsupportedFileException {
        if (j > 2147483647L || j < 0) {
            throw new UnsupportedFileException("uint32 value is too large", 0);
        }
        return (int) j;
    }

    private static boolean readAndFill(FileChannel fileChannel, ByteBuffer byteBuffer, long j) throws IOException {
        byteBuffer.clear();
        int i7 = fileChannel.read(byteBuffer, j);
        byteBuffer.flip();
        return i7 == byteBuffer.capacity();
    }
}
