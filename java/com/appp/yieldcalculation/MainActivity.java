
package com.appp.yieldcalculation;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        int reserveYear;//積立年数
//        int reserveMoney;//毎月の積立金額
//        double yield;//想定利回り
//        double investmentResults = 0;//運用成績
//
//        public void calc(){
//
//            EditText number1 = findViewById(R.id.Number1);//ナンバー１(積立年数入力欄)を変数にする
//            String number1String = number1.getText().toString();//ナンバー１に入力されたテキストを文字列にして変数に代入
//            reserveYear = Integer.valueOf(number1String);//変数をint型に変える
//
//            EditText number2 = findViewById(R.id.Number2);//ナンバー２(積立金額入力欄)を変数にする
//            String number2String = number2.getText().toString();//ナンバー２に入力されたテキストを文字列にして変数に代入
//            reserveMoney = Integer.valueOf(number2String);//変数をint型に変える
//
//            EditText number3 = findViewById(R.id.Number3);//ナンバー３(想定利回り入力欄)を変数にする
//            String number3String = number3.getText().toString();//ナンバー３に入力されたテキストを文字列にして変数に代入
//            yield = Double.parseDouble(number3String);//変数をdouble型に変える
//
//            double monthYield = (yield / 12) / 100 + 1;//月間利回りを求める
//            Log.d("Main", "" + monthYield);
//
//            int reserveMonth = reserveYear * 12;//入力された年数を月数に変換
//            Log.d("Main", "" + reserveMonth);
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
//            int Results = (int) investmentResults;//運用成績をint型に変換
//            String str = String.valueOf(Results);//運用成績を文字列型に変換
//            TextView textView =findViewById(R.id.textViewresult);
//            textView.setText(str);//運用成績をテキストビューに出力
//        }

        Button button = findViewById(R.id.button);//計算開始ボタン
        button.setOnClickListener(new View.OnClickListener() {
            //計算開始ボタンが押されるとダイアログが表示される
            public void onClick(View v) {
                ConfirmDialogFragment dialogFragment = new ConfirmDialogFragment();
                FragmentManager manager = getSupportFragmentManager();
                dialogFragment.show(manager, "MainActivity");
            }
        });


    }

}









