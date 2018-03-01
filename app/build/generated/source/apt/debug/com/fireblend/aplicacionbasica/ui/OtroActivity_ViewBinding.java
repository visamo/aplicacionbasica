// Generated code from Butter Knife. Do not modify!
package com.fireblend.aplicacionbasica.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.fireblend.aplicacionbasica.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class OtroActivity_ViewBinding implements Unbinder {
  private OtroActivity target;

  @UiThread
  public OtroActivity_ViewBinding(OtroActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public OtroActivity_ViewBinding(OtroActivity target, View source) {
    this.target = target;

    target.boton = Utils.findRequiredViewAsType(source, R.id.boton_volver, "field 'boton'", Button.class);
    target.texto = Utils.findRequiredViewAsType(source, R.id.texto, "field 'texto'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    OtroActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.boton = null;
    target.texto = null;
  }
}
