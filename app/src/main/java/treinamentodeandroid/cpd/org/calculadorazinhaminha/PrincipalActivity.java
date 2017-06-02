package treinamentodeandroid.cpd.org.calculadorazinhaminha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PrincipalActivity extends AppCompatActivity {

    /* Variáveis globais para os componentes gráficos da calculadora */
    TextView txtVisor;
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0,
           btnCE, btnIgual, btnMult, btnDiv, btnSub, btnSoma, btnPoint;



    Calculadora calculadora;
    Double num1, num2;
    TipoDeConta tipoDeConta;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        calculadora = new Calculadora();
        recuperaElementos();
        registraEventos();
        limpaVisor();
    }



    private void registraEventos() {
        // registra evento do btn1
        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String textoDoVisor = txtVisor.getText().toString();
                textoDoVisor = textoDoVisor + "1";
                txtVisor.setText(textoDoVisor);
            }
        });

        // registra evento do btn2
        btn2.setOnClickListener(new View.OnClickListener(){ // adicionar evento ao btn2
            @Override
            public void onClick(View v){
                String textoDoVisor = txtVisor.getText().toString();
                textoDoVisor = textoDoVisor + "2";
                txtVisor.setText(textoDoVisor);
            }
        });

        // registra evento do btn3
        btn3.setOnClickListener(new View.OnClickListener(){ // adicionar evento ao btn3
            @Override
            public void onClick(View v){
                String textoDoVisor = txtVisor.getText().toString();
                textoDoVisor = textoDoVisor + "3";
                txtVisor.setText(textoDoVisor);
            }
        });

    // registra evento do btn4
        btn4.setOnClickListener(new View.OnClickListener(){ // adicionar evento ao btn4
            @Override
            public void onClick(View v){
                String textoDoVisor = txtVisor.getText().toString();
                textoDoVisor = textoDoVisor + "4";
                txtVisor.setText(textoDoVisor);
            }
        });

    // registra evento do btn5
        btn5.setOnClickListener(new View.OnClickListener(){ // adicionar evento ao btn5
            @Override
            public void onClick(View v){
                String textoDoVisor = txtVisor.getText().toString();
                textoDoVisor = textoDoVisor + "5";
                txtVisor.setText(textoDoVisor);
            }
        });

    // registra evento do btn6
        btn6.setOnClickListener(new View.OnClickListener(){ // adicionar evento ao btn6
            @Override
            public void onClick(View v){
                String textoDoVisor = txtVisor.getText().toString();
                textoDoVisor = textoDoVisor + "6";
                txtVisor.setText(textoDoVisor);
            }
        });

    // registra evento do btn7
        btn7.setOnClickListener(new View.OnClickListener(){ // adicionar evento ao btn7
            @Override
            public void onClick(View v){
                String textoDoVisor = txtVisor.getText().toString();
                textoDoVisor = textoDoVisor + "7";
                txtVisor.setText(textoDoVisor);
            }
        });

    // registra evento do btn8
        btn8.setOnClickListener(new View.OnClickListener(){ // adicionar evento ao btn8
            @Override
            public void onClick(View v){
                String textoDoVisor = txtVisor.getText().toString();
                textoDoVisor = textoDoVisor + "8";
                txtVisor.setText(textoDoVisor);
            }
        });

    // registra evento do btn9
        btn9.setOnClickListener(new View.OnClickListener(){ // adicionar evento ao btn9
            @Override
            public void onClick(View v){
                String textoDoVisor = txtVisor.getText().toString();
                textoDoVisor = textoDoVisor + "9";
                txtVisor.setText(textoDoVisor);
            }
        });

    // registra evento do btn0
        btn0.setOnClickListener(new View.OnClickListener(){ // adicionar evento ao btn0
            @Override
            public void onClick(View v){
                String textoDoVisor = txtVisor.getText().toString();
                textoDoVisor = textoDoVisor + "0";
                txtVisor.setText(textoDoVisor);
            }
        });

    // registra evento do btnCE
        btnCE.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                limpaVisor();
            }
        });

    // registra evento btnPoint
        btnPoint.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String textoDoVisor = txtVisor.getText().toString();
                textoDoVisor = textoDoVisor + ".";
                txtVisor.setText(textoDoVisor);
            }
        });

    // registra evento btnSoma
        btnSoma.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                tipoDeConta = TipoDeConta.SOMA;
                num1 = Double.parseDouble(txtVisor.getText().toString());
                limpaVisor();
            }
        });

    // registra evento btnSub
        btnSub.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                tipoDeConta = TipoDeConta.SUBTRACAO;
                num1 = Double.parseDouble(txtVisor.getText().toString());
                limpaVisor();
            }
        });

    // registra evento btnMulti
        btnMult.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                tipoDeConta = TipoDeConta.MULTIPLICACAO;
                num1 = Double.parseDouble(txtVisor.getText().toString());
                limpaVisor();
            }
        });

    // registra evento btnDiv
        btnDiv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                tipoDeConta = TipoDeConta.DIVISAO;
                num1 = Double.parseDouble(txtVisor.getText().toString());
                limpaVisor();
            }
        });

    // registra evento btnIgual
        btnIgual.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                double result = 0.0;
                num2 = Double.parseDouble(txtVisor.getText().toString());
                result = calculadora.fazerCalculo(num1,num2,tipoDeConta);
                txtVisor.setText(String.valueOf(result));
            }
        });

    }

    private void limpaVisor() {
        txtVisor.setText("");
    }

    private void recuperaElementos() {
        // recupera componentes gráficos e coloca nas variáveis globais
        txtVisor = (TextView) findViewById(R.id.txtEquacao); /* Recuperando txtEquacao */
        btn1 = (Button) findViewById(R.id.btn_num1); /* Recuperando btn_num1 */
        btn2 = (Button) findViewById(R.id.btn_num2); /* Recuperando btn_num2 */
        btn3 = (Button) findViewById(R.id.btn_num3); /* Recuperando btn_num3 */
        btn4 = (Button) findViewById(R.id.btn_num4); /* Recuperando btn_num4 */
        btn5 = (Button) findViewById(R.id.btn_num5); /* Recuperando btn_num5 */
        btn6 = (Button) findViewById(R.id.btn_num6); /* Recuperando btn_num6 */
        btn7 = (Button) findViewById(R.id.btn_num7); /* Recuperando btn_num7 */
        btn8 = (Button) findViewById(R.id.btn_num8); /* Recuperando btn_num8 */
        btn9 = (Button) findViewById(R.id.btn_num9); /* Recuperando btn_num9 */
        btn0 = (Button) findViewById(R.id.btn_num0); /* Recuperando btn_num0 */
        btnCE = (Button) findViewById(R.id.btn_limpa); /* Recuperando btn_limpa */
        btnPoint = (Button) findViewById(R.id.btn_ponto); /* Recuperando btn_ponto */
        btnCE = (Button) findViewById(R.id.btn_limpa);  /* Recuperando btn_limpa */
        btnIgual = (Button) findViewById(R.id.btn_igual); /* Recuperando btn_igual */
        btnSoma = (Button) findViewById(R.id.btn_mais); /* Recuperando btn_mais */
        btnSub = (Button) findViewById(R.id.btn_menos); /* Recuperando btn_menos */
        btnDiv = (Button) findViewById(R.id.btn_div); /* Recuperando btn_div */
        btnMult = (Button) findViewById(R.id.btn_mult); /* Recuperando btn_mult */
    }
}
