package com.appp.yieldcalculation;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;



public class ConfirmDialogFragment extends DialogFragment {



//    @Override
//    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState){
//        View view=inflater.inflate(R.layout.activity_main,container,false);
//
////        int reserveMoney=0;
//        double yield=0;
//        int reserveYear=0;
//        double investmentResults = 0;//運用成績
//
//        EditText number1 = view.findViewById(R.id.Number1);//ナンバー１(積立年数入力欄)を変数にする
//        String number1string=number1.getText().toString();
//        Log.d("main",""+number1string);
//        reserveYear = Integer.parseInt(number1string);
////        String number1String = number1.getText().toString();//ナンバー１に入力されたテキストを文字列にして変数に代入
////        //積立年数
////        reserveYear = Integer.parseInt(number1String);//変数をint型に変える
//
//        //毎月の積立金額
//        EditText number2 = view.findViewById(R.id.Number2);//ナンバー２(積立金額入力欄)を変数にする
//        String number2String = number2.getText().toString();//ナンバー２に入力されたテキストを文字列にして変数に代入
//        reserveMoney = Integer.parseInt(number2String);//変数をint型に変える
//
//        EditText number3 = view.findViewById(R.id.Number3);//ナンバー３(想定利回り入力欄)を変数にする
//        String number3String = number3.getText().toString();//ナンバー３に入力されたテキストを文字列にして変数に代入
//        //想定利回り
//        yield = Double.parseDouble(number3String);//変数をdouble型に変える
//
//
//
//        double monthYield = (yield / 12) / 100 + 1;//月間利回りを求める
//        Log.d("Main", "" + monthYield);
//
//        int reserveMonth = reserveYear * 12;//入力された年数を月数に変換
//        Log.d("Main", "" + reserveMonth);
//
//
//
//        for (int i = 1; i <= reserveMonth; i++) {
//            if (i == 1) {
//                investmentResults = reserveMoney;
//            } else {
//                investmentResults += ((long) investmentResults) * monthYield + reserveMoney - (long) investmentResults;
//            }
//            Log.d("Main", "" + (int) investmentResults);
//
//        }
//
//        int Results = (int) investmentResults;//運用成績をint型に変換
//        str = String.valueOf(Results);//運用成績を文字列型に変換
//        textView = view.findViewById(R.id.textViewresult);
//
//        return view;
//    }



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

                    break;

                //「いいえ」が押された場合、ダイアログを閉じる
                case DialogInterface.BUTTON_NEGATIVE:
                    break;


            }
        }
    }


}
