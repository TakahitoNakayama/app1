package com.appp.yieldcalculation;

import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Calc extends AppCompatActivity {


//    int reserveMoney;
//    double yield;
//    int reserveYear;
//    double investmentResults = 0;//運用成績
//
//    void calc(){
//        try {
//            EditText number1 = findViewById(R.id.Number1);//ナンバー１(積立年数入力欄)を変数にする
//            Log.d("MainActivity", "number1");
//            String number1String = number1.getText().toString();//ナンバー１に入力されたテキストを文字列にして変数に代入
//            //積立年数
//            reserveYear = Integer.parseInt(number1String);//変数をint型に変える
//
//            EditText number2 = findViewById(R.id.Number2);//ナンバー２(積立金額入力欄)を変数にする
//            String number2String = number2.getText().toString();//ナンバー２に入力されたテキストを文字列にして変数に代入
//            //毎月の積立金額
//            reserveMoney = Integer.parseInt(number2String);//変数をint型に変える
//
//            EditText number3 = findViewById(R.id.Number3);//ナンバー３(想定利回り入力欄)を変数にする
//            String number3String = number3.getText().toString();//ナンバー３に入力されたテキストを文字列にして変数に代入
//            //想定利回り
//            yield = Double.parseDouble(number3String);//変数をdouble型に変える
//
//
//
//            double monthYield = (yield / 12) / 100 + 1;//月間利回りを求める
//            Log.d("Main", "" + monthYield);
//
//            int reserveMonth = reserveYear * 12;//入力された年数を月数に変換
//            Log.d("Main", "" + reserveMonth);
//
//
//
//            for (int i = 1; i <= reserveMonth; i++) {
//                if (i == 1) {
//                    investmentResults = reserveMoney;
//                } else {
//                    investmentResults += ((long) investmentResults) * monthYield + reserveMoney - (long) investmentResults;
//                }
//                Log.d("Main", "" + (int) investmentResults);
//
//            }
//
//            int Results = (int) investmentResults;//運用成績をint型に変換
//            String str = String.valueOf(Results);//運用成績を文字列型に変換
//            TextView textView = findViewById(R.id.textViewresult);
//            textView.setText(str);//運用成績をテキストビューに出力
//
//        }catch (NullPointerException e) {
//            Log.d("Main", "ああああ");
//        }
//    }

}
