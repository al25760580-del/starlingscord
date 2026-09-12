package t4;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Base64;
import java.io.IOException;
import java.util.HashMap;
import l4.v;
import l4.x;
import l4.z;
import o4.r;

/* JADX INFO: loaded from: classes.dex */
public final class d extends b {
    public final /* synthetic */ int D;
    public final m4.a E;
    public r F;
    public r G;
    public final Parcelable H;
    public final Object I;
    public final Object J;
    public final Object K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(v vVar, e eVar, int i7) {
        super(vVar, eVar);
        this.D = i7;
        switch (i7) {
            case 1:
                super(vVar, eVar);
                this.H = new RectF();
                m4.a aVar = new m4.a();
                this.E = aVar;
                this.I = new float[8];
                this.J = new Path();
                this.K = eVar;
                aVar.setAlpha(0);
                aVar.setStyle(Paint.Style.FILL);
                aVar.setColor(eVar.f20626l);
                break;
            default:
                this.E = new m4.a(3, 0);
                this.H = new Rect();
                this.I = new Rect();
                String str = eVar.f20623g;
                l4.i iVar = vVar.f14917d;
                this.J = iVar == null ? null : (x) ((HashMap) iVar.c()).get(str);
                e9.b bVar = this.f20606p.f20638x;
                if (bVar != null) {
                    this.K = new o4.h(this, this, bVar);
                }
                break;
        }
    }

    @Override // t4.b, n4.e
    public final void d(RectF rectF, Matrix matrix, boolean z5) {
        switch (this.D) {
            case 0:
                super.d(rectF, matrix, z5);
                x xVar = (x) this.J;
                if (xVar != null) {
                    float fC = x4.h.c();
                    rectF.set(0.0f, 0.0f, xVar.f14937a * fC, xVar.f14938b * fC);
                    this.f20604n.mapRect(rectF);
                }
                break;
            default:
                super.d(rectF, matrix, z5);
                RectF rectF2 = (RectF) this.H;
                e eVar = (e) this.K;
                rectF2.set(0.0f, 0.0f, eVar.j, eVar.k);
                this.f20604n.mapRect(rectF2);
                rectF.set(rectF2);
                break;
        }
    }

    @Override // t4.b, q4.f
    public final void h(e4.c cVar, Object obj) {
        switch (this.D) {
            case 0:
                super.h(cVar, obj);
                if (obj == z.F) {
                    this.F = new r(cVar, null);
                } else if (obj == z.I) {
                    this.G = new r(cVar, null);
                }
                break;
            default:
                super.h(cVar, obj);
                if (obj == z.F) {
                    this.F = new r(cVar, null);
                } else if (obj == 1) {
                    this.G = new r(cVar, null);
                }
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0102  */
    /* JADX WARN: Code duplicated, block: B:97:0x0214  */
    @Override // t4.b
    public final void k(Canvas canvas, Matrix matrix, int i7) {
        Bitmap bitmap;
        Bitmap bitmap2;
        switch (this.D) {
            case 0:
                Rect rect = (Rect) this.H;
                v vVar = this.f20605o;
                Rect rect2 = (Rect) this.I;
                x xVar = (x) this.J;
                m4.a aVar = this.E;
                r rVar = this.G;
                if (rVar == null || (bitmap2 = (Bitmap) rVar.e()) == null) {
                    String str = this.f20606p.f20623g;
                    p4.a aVar2 = vVar.f14934y;
                    if (aVar2 != null) {
                        Context contextH = vVar.h();
                        Context context = aVar2.f17781a;
                        if (contextH != null) {
                            if (context instanceof Application) {
                                contextH = contextH.getApplicationContext();
                            }
                            if (contextH != context) {
                                vVar.f14934y = null;
                            }
                        } else if (context != null) {
                            vVar.f14934y = null;
                        }
                    }
                    if (vVar.f14934y == null) {
                        vVar.f14934y = new p4.a(vVar.getCallback(), vVar.E, vVar.f14917d.c());
                    }
                    p4.a aVar3 = vVar.f14934y;
                    if (aVar3 != null) {
                        String str2 = aVar3.f17782b;
                        x xVar2 = (x) aVar3.f17783c.get(str);
                        if (xVar2 == null) {
                            bitmap = null;
                        } else {
                            int i10 = xVar2.f14938b;
                            int i11 = xVar2.f14937a;
                            Bitmap bitmap3 = xVar2.f14942f;
                            if (bitmap3 != null) {
                                bitmap2 = bitmap3;
                            } else {
                                Context context2 = aVar3.f17781a;
                                if (context2 == null) {
                                    bitmap = null;
                                } else {
                                    String str3 = xVar2.f14940d;
                                    BitmapFactory.Options options = new BitmapFactory.Options();
                                    options.inScaled = true;
                                    options.inDensity = 160;
                                    if (!str3.startsWith("data:") || str3.indexOf("base64,") <= 0) {
                                        try {
                                            if (TextUtils.isEmpty(str2)) {
                                                bitmap = null;
                                                try {
                                                    throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
                                                } catch (IOException e10) {
                                                    e = e10;
                                                }
                                            } else {
                                                bitmap = null;
                                                try {
                                                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(context2.getAssets().open(str2 + str3), null, options);
                                                    if (bitmapDecodeStream == null) {
                                                        x4.c.b("Decoded image `" + str + "` is null.");
                                                    } else {
                                                        Bitmap bitmapD = x4.h.d(i11, i10, bitmapDecodeStream);
                                                        synchronized (p4.a.f17780d) {
                                                            ((x) aVar3.f17783c.get(str)).f14942f = bitmapD;
                                                            break;
                                                        }
                                                        bitmap2 = bitmapD;
                                                    }
                                                } catch (IllegalArgumentException e11) {
                                                    x4.c.c("Unable to decode image `" + str + "`.", e11);
                                                }
                                            }
                                        } catch (IOException e12) {
                                            e = e12;
                                            bitmap = null;
                                        }
                                        x4.c.c("Unable to open asset.", e);
                                    } else {
                                        try {
                                            byte[] bArrDecode = Base64.decode(str3.substring(str3.indexOf(44) + 1), 0);
                                            Bitmap bitmapD2 = x4.h.d(i11, i10, BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options));
                                            synchronized (p4.a.f17780d) {
                                                ((x) aVar3.f17783c.get(str)).f14942f = bitmapD2;
                                                break;
                                            }
                                            bitmap2 = bitmapD2;
                                        } catch (IllegalArgumentException e13) {
                                            x4.c.c("data URL did not have correct base64 format.", e13);
                                            bitmap = null;
                                            bitmap2 = bitmap;
                                        }
                                    }
                                }
                            }
                            bitmap = null;
                        }
                        bitmap2 = bitmap;
                    } else {
                        bitmap = null;
                        bitmap2 = bitmap;
                    }
                    if (bitmap2 == null) {
                        bitmap2 = xVar != null ? xVar.f14942f : bitmap;
                    }
                }
                if (bitmap2 == null || bitmap2.isRecycled() || xVar == null) {
                    return;
                }
                float fC = x4.h.c();
                aVar.setAlpha(i7);
                r rVar2 = this.F;
                if (rVar2 != null) {
                    aVar.setColorFilter((ColorFilter) rVar2.e());
                }
                canvas.save();
                canvas.concat(matrix);
                rect.set(0, 0, bitmap2.getWidth(), bitmap2.getHeight());
                if (vVar.L) {
                    rect2.set(0, 0, (int) (xVar.f14937a * fC), (int) (xVar.f14938b * fC));
                } else {
                    rect2.set(0, 0, (int) (bitmap2.getWidth() * fC), (int) (bitmap2.getHeight() * fC));
                }
                o4.h hVar = (o4.h) this.K;
                if (hVar != null) {
                    hVar.b(aVar, matrix, i7);
                }
                canvas.drawBitmap(bitmap2, rect, rect2, aVar);
                canvas.restore();
                return;
            default:
                Paint paint = this.E;
                float[] fArr = (float[]) this.I;
                Path path = (Path) this.J;
                e eVar = (e) this.K;
                int iAlpha = Color.alpha(eVar.f20626l);
                if (iAlpha == 0) {
                    return;
                }
                r rVar3 = this.G;
                Integer num = rVar3 == null ? null : (Integer) rVar3.e();
                if (num != null) {
                    paint.setColor(num.intValue());
                } else {
                    paint.setColor(eVar.f20626l);
                }
                o4.e eVar2 = this.f20613w.j;
                int iIntValue = (int) ((((iAlpha / 255.0f) * (eVar2 == null ? 100 : ((Integer) eVar2.e()).intValue())) / 100.0f) * (i7 / 255.0f) * 255.0f);
                paint.setAlpha(iIntValue);
                r rVar4 = this.F;
                if (rVar4 != null) {
                    paint.setColorFilter((ColorFilter) rVar4.e());
                }
                if (iIntValue > 0) {
                    fArr[0] = 0.0f;
                    fArr[1] = 0.0f;
                    float f2 = eVar.j;
                    fArr[2] = f2;
                    fArr[3] = 0.0f;
                    fArr[4] = f2;
                    float f7 = eVar.k;
                    fArr[5] = f7;
                    fArr[6] = 0.0f;
                    fArr[7] = f7;
                    matrix.mapPoints(fArr);
                    path.reset();
                    path.moveTo(fArr[0], fArr[1]);
                    path.lineTo(fArr[2], fArr[3]);
                    path.lineTo(fArr[4], fArr[5]);
                    path.lineTo(fArr[6], fArr[7]);
                    path.lineTo(fArr[0], fArr[1]);
                    path.close();
                    canvas.drawPath(path, paint);
                    return;
                }
                return;
        }
    }
}
