// Generated by view binder compiler. Do not edit!
package com.example.worldcup2022.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.worldcup2022.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemHistoryMatchLoseBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final CardView cardViewTeam1;

  @NonNull
  public final CardView cardViewTeam2;

  @NonNull
  public final ImageView imgTeam1;

  @NonNull
  public final ImageView imgTeam2;

  @NonNull
  public final ImageView txtFalse;

  @NonNull
  public final TextView txtGoal;

  @NonNull
  public final TextView txtGroup;

  @NonNull
  public final TextView txtGuess;

  @NonNull
  public final TextView txtTeam1;

  @NonNull
  public final TextView txtTeam2;

  private ItemHistoryMatchLoseBinding(@NonNull ConstraintLayout rootView,
      @NonNull CardView cardViewTeam1, @NonNull CardView cardViewTeam2, @NonNull ImageView imgTeam1,
      @NonNull ImageView imgTeam2, @NonNull ImageView txtFalse, @NonNull TextView txtGoal,
      @NonNull TextView txtGroup, @NonNull TextView txtGuess, @NonNull TextView txtTeam1,
      @NonNull TextView txtTeam2) {
    this.rootView = rootView;
    this.cardViewTeam1 = cardViewTeam1;
    this.cardViewTeam2 = cardViewTeam2;
    this.imgTeam1 = imgTeam1;
    this.imgTeam2 = imgTeam2;
    this.txtFalse = txtFalse;
    this.txtGoal = txtGoal;
    this.txtGroup = txtGroup;
    this.txtGuess = txtGuess;
    this.txtTeam1 = txtTeam1;
    this.txtTeam2 = txtTeam2;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemHistoryMatchLoseBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemHistoryMatchLoseBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_history_match_lose, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemHistoryMatchLoseBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.card_view_team_1;
      CardView cardViewTeam1 = ViewBindings.findChildViewById(rootView, id);
      if (cardViewTeam1 == null) {
        break missingId;
      }

      id = R.id.card_view_team_2;
      CardView cardViewTeam2 = ViewBindings.findChildViewById(rootView, id);
      if (cardViewTeam2 == null) {
        break missingId;
      }

      id = R.id.img_team_1;
      ImageView imgTeam1 = ViewBindings.findChildViewById(rootView, id);
      if (imgTeam1 == null) {
        break missingId;
      }

      id = R.id.img_team_2;
      ImageView imgTeam2 = ViewBindings.findChildViewById(rootView, id);
      if (imgTeam2 == null) {
        break missingId;
      }

      id = R.id.txt_false;
      ImageView txtFalse = ViewBindings.findChildViewById(rootView, id);
      if (txtFalse == null) {
        break missingId;
      }

      id = R.id.txt_goal;
      TextView txtGoal = ViewBindings.findChildViewById(rootView, id);
      if (txtGoal == null) {
        break missingId;
      }

      id = R.id.txt_group;
      TextView txtGroup = ViewBindings.findChildViewById(rootView, id);
      if (txtGroup == null) {
        break missingId;
      }

      id = R.id.txt_guess;
      TextView txtGuess = ViewBindings.findChildViewById(rootView, id);
      if (txtGuess == null) {
        break missingId;
      }

      id = R.id.txt_team_1;
      TextView txtTeam1 = ViewBindings.findChildViewById(rootView, id);
      if (txtTeam1 == null) {
        break missingId;
      }

      id = R.id.txt_team_2;
      TextView txtTeam2 = ViewBindings.findChildViewById(rootView, id);
      if (txtTeam2 == null) {
        break missingId;
      }

      return new ItemHistoryMatchLoseBinding((ConstraintLayout) rootView, cardViewTeam1,
          cardViewTeam2, imgTeam1, imgTeam2, txtFalse, txtGoal, txtGroup, txtGuess, txtTeam1,
          txtTeam2);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}