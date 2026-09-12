package gd;

import com.google.android.exoplayer2.metadata.Metadata;
import di.d;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m3.m;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends com.facebook.imagepipeline.nativecode.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Pattern f9952h = Pattern.compile("(.+?)='(.*?)';", 32);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CharsetDecoder f9953f = d.f7631c.newDecoder();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CharsetDecoder f9954g = d.f7630b.newDecoder();

    @Override // com.facebook.imagepipeline.nativecode.b
    public final Metadata j(cd.d dVar, ByteBuffer byteBuffer) {
        String string;
        CharsetDecoder charsetDecoder = this.f9954g;
        CharsetDecoder charsetDecoder2 = this.f9953f;
        String str = null;
        try {
            string = charsetDecoder2.decode(byteBuffer).toString();
            charsetDecoder2.reset();
            byteBuffer.rewind();
        } catch (CharacterCodingException unused) {
            charsetDecoder2.reset();
            byteBuffer.rewind();
            try {
                String string2 = charsetDecoder.decode(byteBuffer).toString();
                charsetDecoder.reset();
                byteBuffer.rewind();
                string = string2;
            } catch (CharacterCodingException unused2) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                string = null;
            } catch (Throwable th2) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                throw th2;
            }
        } catch (Throwable th3) {
            charsetDecoder2.reset();
            byteBuffer.rewind();
            throw th3;
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (string == null) {
            return new Metadata(new c(null, null, bArr));
        }
        Matcher matcher = f9952h.matcher(string);
        String str2 = null;
        for (int iEnd = 0; matcher.find(iEnd); iEnd = matcher.end()) {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            if (strGroup != null) {
                String strT = m.T(strGroup);
                strT.getClass();
                if (strT.equals("streamurl")) {
                    str2 = strGroup2;
                } else if (strT.equals("streamtitle")) {
                    str = strGroup2;
                }
            }
        }
        return new Metadata(new c(str, str2, bArr));
    }
}
