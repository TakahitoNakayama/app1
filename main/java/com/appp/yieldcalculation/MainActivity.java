
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

//integer.parseintにエラー
//gettextできていない？
//空文字が入っている？
//フラグメントで新しく画面が作られるから、入力した数字が消えている？
//activityのonstartのときに変数に代入しようとしたけど、そもそも何も入力されていないから、アプリが立ち上がらない
//
//入力した数字の情報をフラグメント画面で受け継ぐ
//bundleを使うといいかも
//計算がクリックされたときに情報を格納するメソッドが必要

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    @Override
        public void onStart(){
        super.onStart();

        int reserveMoney=0;
        double yield=0;
        int reserveYear=0;
        double investmentResults = 0;//運用成績

        EditText number1 = findViewById(R.id.Number1);//ナンバー１(積立年数入力欄)を変数にする
        String number1string=number1.getText().toString();
        Log.d("main",""+number1string);
        reserveYear = Integer.parseInt(number1string);
//        String number1String = number1.getText().toString();//ナンバー１に入力されたテキストを文字列にして変数に代入
//        //積立年数
//        reserveYear = Integer.parseInt(number1String);//変数をint型に変える

        //毎月の積立金額
        EditText number2 = findViewById(R.id.Number2);//ナンバー２(積立金額入力欄)を変数にする
        String number2String = number2.getText().toString();//ナンバー２に入力されたテキストを文字列にして変数に代入
        reserveMoney = Integer.parseInt(number2String);//変数をint型に変える

        EditText number3 = findViewById(R.id.Number3);//ナンバー３(想定利回り入力欄)を変数にする
        String number3String = number3.getText().toString();//ナンバー３に入力されたテキストを文字列にして変数に代入
        //想定利回り
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
        String str;
        TextView textView;
        int Results = (int) investmentResults;//運用成績をint型に変換
        str = String.valueOf(Results);//運用成績を文字列型に変換
        Log.d("main",""+str);
//        textView = findViewById(R.id.textViewresult);
//        textView.setText(str);//運用成績をテキストビューに出力








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









