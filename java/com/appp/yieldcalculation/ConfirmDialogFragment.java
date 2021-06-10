package com.appp.yieldcalculation;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;



public class ConfirmDialogFragment extends DialogFragment {

    private Calc calculation;

    @Override
    //ダイアログの作成
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(R.string.dialog_title);
        builder.setMessage(R.string.dialog_msg);
        builder.setPositiveButton(R.string.dialog_btn_ok, new DialogButtonClickListener());
        builder.setNegativeButton(R.string.dialog_btn_ng, new DialogButtonClickListener());
        builder.setNegativeButton(R.string.dialog_btn_ng, new DialogButtonClickListener());
        return builder.create();
    }


    //ダイアログが押されたときの処理
     class DialogButtonClickListener implements DialogInterface.OnClickListener {
        @Override
        public void onClick(DialogInterface dialog, int which) {

            switch (which) {
                //「はい」が押された場合、calcメソッドを実行
                case DialogInterface.BUTTON_POSITIVE:
                    calculation = new Calc();
                    calculation.calc();
                    break;

                //「いいえ」が押された場合、ダイアログを閉じる
                case DialogInterface.BUTTON_NEGATIVE:
                    dialog.dismiss();
                    break;


            }
        }
    }


}
