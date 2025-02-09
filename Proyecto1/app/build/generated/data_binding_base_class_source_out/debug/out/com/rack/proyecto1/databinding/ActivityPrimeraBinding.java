// Generated by view binder compiler. Do not edit!
package com.rack.proyecto1.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SearchView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.slider.RangeSlider;
import com.rack.proyecto1.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityPrimeraBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button boton1;

  @NonNull
  public final Button boton3;

  @NonNull
  public final Button boton4;

  @NonNull
  public final SearchView busqueda;

  @NonNull
  public final CardView card1;

  @NonNull
  public final CheckBox check1;

  @NonNull
  public final EditText editText1;

  @NonNull
  public final FloatingActionButton fab1;

  @NonNull
  public final ConstraintLayout main;

  @NonNull
  public final RadioButton radio1;

  @NonNull
  public final RadioButton radio2;

  @NonNull
  public final RadioButton radio3;

  @NonNull
  public final RadioGroup radioGroup1;

  @NonNull
  public final RangeSlider rango1;

  @NonNull
  public final TextView textView;

  @NonNull
  public final TextView texto1;

  @NonNull
  public final View view1;

  @NonNull
  public final View view2;

  private ActivityPrimeraBinding(@NonNull ConstraintLayout rootView, @NonNull Button boton1,
      @NonNull Button boton3, @NonNull Button boton4, @NonNull SearchView busqueda,
      @NonNull CardView card1, @NonNull CheckBox check1, @NonNull EditText editText1,
      @NonNull FloatingActionButton fab1, @NonNull ConstraintLayout main,
      @NonNull RadioButton radio1, @NonNull RadioButton radio2, @NonNull RadioButton radio3,
      @NonNull RadioGroup radioGroup1, @NonNull RangeSlider rango1, @NonNull TextView textView,
      @NonNull TextView texto1, @NonNull View view1, @NonNull View view2) {
    this.rootView = rootView;
    this.boton1 = boton1;
    this.boton3 = boton3;
    this.boton4 = boton4;
    this.busqueda = busqueda;
    this.card1 = card1;
    this.check1 = check1;
    this.editText1 = editText1;
    this.fab1 = fab1;
    this.main = main;
    this.radio1 = radio1;
    this.radio2 = radio2;
    this.radio3 = radio3;
    this.radioGroup1 = radioGroup1;
    this.rango1 = rango1;
    this.textView = textView;
    this.texto1 = texto1;
    this.view1 = view1;
    this.view2 = view2;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityPrimeraBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityPrimeraBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_primera, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityPrimeraBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.boton1;
      Button boton1 = ViewBindings.findChildViewById(rootView, id);
      if (boton1 == null) {
        break missingId;
      }

      id = R.id.boton3;
      Button boton3 = ViewBindings.findChildViewById(rootView, id);
      if (boton3 == null) {
        break missingId;
      }

      id = R.id.boton4;
      Button boton4 = ViewBindings.findChildViewById(rootView, id);
      if (boton4 == null) {
        break missingId;
      }

      id = R.id.busqueda;
      SearchView busqueda = ViewBindings.findChildViewById(rootView, id);
      if (busqueda == null) {
        break missingId;
      }

      id = R.id.card1;
      CardView card1 = ViewBindings.findChildViewById(rootView, id);
      if (card1 == null) {
        break missingId;
      }

      id = R.id.check1;
      CheckBox check1 = ViewBindings.findChildViewById(rootView, id);
      if (check1 == null) {
        break missingId;
      }

      id = R.id.editText1;
      EditText editText1 = ViewBindings.findChildViewById(rootView, id);
      if (editText1 == null) {
        break missingId;
      }

      id = R.id.fab1;
      FloatingActionButton fab1 = ViewBindings.findChildViewById(rootView, id);
      if (fab1 == null) {
        break missingId;
      }

      ConstraintLayout main = (ConstraintLayout) rootView;

      id = R.id.radio1;
      RadioButton radio1 = ViewBindings.findChildViewById(rootView, id);
      if (radio1 == null) {
        break missingId;
      }

      id = R.id.radio2;
      RadioButton radio2 = ViewBindings.findChildViewById(rootView, id);
      if (radio2 == null) {
        break missingId;
      }

      id = R.id.radio3;
      RadioButton radio3 = ViewBindings.findChildViewById(rootView, id);
      if (radio3 == null) {
        break missingId;
      }

      id = R.id.radioGroup1;
      RadioGroup radioGroup1 = ViewBindings.findChildViewById(rootView, id);
      if (radioGroup1 == null) {
        break missingId;
      }

      id = R.id.rango1;
      RangeSlider rango1 = ViewBindings.findChildViewById(rootView, id);
      if (rango1 == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      id = R.id.texto1;
      TextView texto1 = ViewBindings.findChildViewById(rootView, id);
      if (texto1 == null) {
        break missingId;
      }

      id = R.id.view1;
      View view1 = ViewBindings.findChildViewById(rootView, id);
      if (view1 == null) {
        break missingId;
      }

      id = R.id.view2;
      View view2 = ViewBindings.findChildViewById(rootView, id);
      if (view2 == null) {
        break missingId;
      }

      return new ActivityPrimeraBinding((ConstraintLayout) rootView, boton1, boton3, boton4,
          busqueda, card1, check1, editText1, fab1, main, radio1, radio2, radio3, radioGroup1,
          rango1, textView, texto1, view1, view2);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
