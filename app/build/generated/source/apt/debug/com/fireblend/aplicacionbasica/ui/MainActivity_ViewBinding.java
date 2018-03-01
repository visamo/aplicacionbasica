// Generated code from Butter Knife. Do not modify!
package com.fireblend.aplicacionbasica.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.fireblend.aplicacionbasica.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MainActivity_ViewBinding implements Unbinder {
  private MainActivity target;

  @UiThread
  public MainActivity_ViewBinding(MainActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MainActivity_ViewBinding(MainActivity target, View source) {
    this.target = target;

    target.botonCambiar = Utils.findRequiredViewAsType(source, R.id.boton_cambiar, "field 'botonCambiar'", Button.class);
    target.botonLlamar = Utils.findRequiredViewAsType(source, R.id.boton_llamar, "field 'botonLlamar'", Button.class);
    target.input = Utils.findRequiredViewAsType(source, R.id.input, "field 'input'", EditText.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MainActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.botonCambiar = null;
    target.botonLlamar = null;
    target.input = null;
  }
}
