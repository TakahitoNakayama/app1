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
    public class DialogButtonClickListener implements DialogInterface.OnClickListener {
        @Override
        public void onClick(DialogInterface dialog, int which) {

            switch (which) {
                //「はい」が押された場合、calcメソッドを実行
                case DialogInterface.BUTTON_POSITIVE:
                    calc();
                    break;

                //「いいえ」が押された場合、ダイアログを閉じる
                case DialogInterface.BUTTON_NEGATIVE:
                    dialog.dismiss();
                    break;


            }
        }
    }

    @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View view = inflater.inflate(R.layout.fragment_blank, container, false);

            public static void calc()
                {
                int reserveYear;//積立年数
                int reserveMoney;//毎月の積立金額
                double yield;//想定利回り
                double investmentResults = 0;//運用成績

                EditText number1 = view.findViewById(R.id.Number1);//ナンバー１(積立年数入力欄)を変数にする
                String number1String = number1.getText().toString();//ナンバー１に入力されたテキストを文字列にして変数に代入
                reserveYear = Integer.valueOf(number1String);//変数をint型に変える

                EditText number2 = view.findViewById(R.id.Number2);//ナンバー２(積立金額入力欄)を変数にする
                String number2String = number2.getText().toString();//ナンバー２に入力されたテキストを文字列にして変数に代入
                reserveMoney = Integer.valueOf(number2String);//変数をint型に変える

                EditText number3 = view.findViewById(R.id.Number3);//ナンバー３(想定利回り入力欄)を変数にする
                String number3String = number3.getText().toString();//ナンバー３に入力されたテキストを文字列にして変数に代入
                yield = Double.parseDouble(number3String);//変数をdouble型に変える

                double monthYield = (yield / 12) / 100 + 1;//月間利回りを求める
                Log.d("Main", "" + monthYield);

                int reserveMonth = reserveYear * 12;//入力された年数を月数に変換
                Log.d("Main", "" + reserveMonth);

                for (int i = 1; i <= reserveMonth; i++) {
                    if (i == 1) {
                        investmentResults = reserveMoney;
                    } else {
                        investmentResults += ((long) investmentResults) * monthYield + reserveMoney - (long) investmentResults;
                    }
                    Log.d("Main", "" + (int) investmentResults);

                }
                int Results = (int) investmentResults;//運用成績をint型に変換
                String str = String.valueOf(Results);//運用成績を文字列型に変換
                TextView textView = view.findViewById(R.id.textViewresult);
                textView.setText(str);//運用成績をテキストビューに出力
            }
            return view;
        }
    }
}
