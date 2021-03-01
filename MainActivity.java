package com.example.footballquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int score = 0;
    int correctAnswers = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView welcomeTextView = (TextView) findViewById(R.id.welcome_text);
        welcomeTextView.setTextSize(20);
        TextView pleaseTextView = (TextView) findViewById(R.id.please_text);
        pleaseTextView.setTextSize(15);
        pleaseTextView.setTextColor(Color.RED);
    }

    public void submit(View view){
        EditText nameEditText = (EditText) findViewById(R.id.name_field);
        String name = nameEditText.getText().toString();
        RadioButton messiBox=(RadioButton) findViewById(R.id.firstAnswer);
        boolean isMessi = messiBox.isChecked();
        EditText secondAnswer = (EditText) findViewById(R.id.secondAnswer);
        String answer2 = secondAnswer.getText().toString();
        EditText thirdAnswer = (EditText) findViewById(R.id.thirdAnswer);
        String answer3 = thirdAnswer.getText().toString();
        EditText fourthAnswer = (EditText) findViewById(R.id.fourthAnswer);
        String answer4 = fourthAnswer.getText().toString();
        CheckBox fifthAnswer = (CheckBox) findViewById(R.id.fifthAnswer1);
        boolean answer5 = fifthAnswer.isChecked();
        CheckBox fifthAnswer2 = (CheckBox) findViewById(R.id.fifthAnswer2);
        boolean answer5two = fifthAnswer2.isChecked();
        CheckBox fifthAnswer3 = (CheckBox) findViewById(R.id.fifthAnswer3);
        boolean answer5three = fifthAnswer3.isChecked();
        String final_result = summary(name,isMessi,answer2,answer3,answer4,answer5,answer5two,answer5three);
        Toast.makeText(this,final_result , Toast.LENGTH_LONG).show();

    }

    public String summary( String name,boolean isMessi, String answer2,  String answer3, String answer4,boolean answer5,boolean answer5two,boolean answer5three){
        String result = "Name: " +name;
        if (isMessi&&answer2.equalsIgnoreCase("Real Madrid")&&answer3.equalsIgnoreCase("Yes")&&answer4.equalsIgnoreCase("France")&&answer5&&answer5two&&!answer5three)
        {
            score += 25;
            result+="\nYour Score is: "+score;
        }else if (!isMessi&&answer2.equalsIgnoreCase("Real Madrid")&&answer3.equalsIgnoreCase("Yes")&&answer4.equalsIgnoreCase("France")&&answer5&&answer5two&&!answer5three){
            score+=20;
            result+="\nYour Score is: "+score;
        }else if (isMessi&&!answer2.equalsIgnoreCase("Real Madrid")&&answer3.equalsIgnoreCase("Yes")&&answer4.equalsIgnoreCase("France")&&answer5&&answer5two&&answer5three){
            score+=20;
            result+="\nYour Score is: "+score;
        }else if (isMessi&&answer2.equalsIgnoreCase("Real Madrid")&&!answer3.equalsIgnoreCase("Yes")&&answer4.equalsIgnoreCase("France")&&answer5&&answer5two&&!answer5three){
            score+=20;
            result+="\nYour Score is: "+score;
        }else if (isMessi&&answer2.equalsIgnoreCase("Real Madrid")&&answer3.equalsIgnoreCase("Yes")&&!answer4.equalsIgnoreCase("France")&&answer5&&answer5two&&!answer5three){
            score+=20;
            result+="\nYour Score is: "+score;
        }else if (isMessi&&answer2.equalsIgnoreCase("Real Madrid")&&answer3.equalsIgnoreCase("Yes")&&answer4.equalsIgnoreCase("France")&&!answer5&&answer5two&&answer5three){
            score+=20;
            result+="\nYour Score is: "+score;
        } else if (isMessi&&answer2.equalsIgnoreCase("Real Madrid")&&answer3.equalsIgnoreCase("Yes")&&answer4.equalsIgnoreCase("France")&&answer5&&!answer5two&&answer5three){
            score+=20;
            result+="\nYour Score is: "+score;
        }else if (isMessi&&answer2.equalsIgnoreCase("Real Madrid")&&answer3.equalsIgnoreCase("Yes")&&answer4.equalsIgnoreCase("France")&&answer5&&answer5two&&answer5three){
            score+=20;
            result+="\nYour Score is: "+score;
        }
        else if (isMessi&&!answer2.equalsIgnoreCase("Real Madrid")&&!answer3.equalsIgnoreCase("Yes")&&!answer4.equalsIgnoreCase("France")&&!answer5&&!answer5two&&!answer5three){
           score+=5;
            result+="\nYour Score is: "+score;
        }else if (isMessi&&!answer2.equalsIgnoreCase("Real Madrid")&&!answer3.equalsIgnoreCase("Yes")&&!answer4.equalsIgnoreCase("France")&&answer5&&!answer5two&&!answer5three){
            score+=5;
            result+="\nYour Score is: "+score;
        }else if (isMessi&&!answer2.equalsIgnoreCase("Real Madrid")&&!answer3.equalsIgnoreCase("Yes")&&!answer4.equalsIgnoreCase("France")&&!answer5&&answer5two&&!answer5three){
            score+=5;
            result+="\nYour Score is: "+score;
        }else if (isMessi&&!answer2.equalsIgnoreCase("Real Madrid")&&!answer3.equalsIgnoreCase("Yes")&&!answer4.equalsIgnoreCase("France")&&!answer5&&!answer5two&&answer5three){
            score+=5;
            result+="\nYour Score is: "+score;
        }
        else if (!isMessi&&answer2.equalsIgnoreCase("Real Madrid")&&!answer3.equalsIgnoreCase("Yes")&&!answer4.equalsIgnoreCase("France")&&!answer5&&!answer5two&&!answer5three){
            score+=5;
            result+="\nYour Score is: "+score;
        }
        else if (!isMessi&&!answer2.equalsIgnoreCase("Real Madrid")&&answer3.equalsIgnoreCase("Yes")&&!answer4.equalsIgnoreCase("France")&&!answer5&&!answer5two&&!answer5three){
            score+=5;
            result+="\nYour Score is: "+score;
        }else if (!isMessi&&!answer2.equalsIgnoreCase("Real Madrid")&&answer3.equalsIgnoreCase("Yes")&&!answer4.equalsIgnoreCase("France")&&answer5&&!answer5two&&!answer5three){
            score+=5;
            result+="\nYour Score is: "+score;
        }else if (isMessi&&!answer2.equalsIgnoreCase("Real Madrid")&&answer3.equalsIgnoreCase("Yes")&&!answer4.equalsIgnoreCase("France")&&!answer5&&answer5two&&!answer5three){
            score+=5;
            result+="\nYour Score is: "+score;
        }
        else if (isMessi&&!answer2.equalsIgnoreCase("Real Madrid")&&answer3.equalsIgnoreCase("Yes")&&!answer4.equalsIgnoreCase("France")&&!answer5&&!answer5two&&answer5three){
            score+=5;
            result+="\nYour Score is: "+score;
        }
        else if (!isMessi&&!answer2.equalsIgnoreCase("Real Madrid")&&!answer3.equalsIgnoreCase("Yes")&&answer4.equalsIgnoreCase("France")&&!answer5&&!answer5two&&!answer5three){
            score+=5;
            result+="\nYour Score is: "+score;
        }else if (!isMessi&&!answer2.equalsIgnoreCase("Real Madrid")&&!answer3.equalsIgnoreCase("Yes")&&answer4.equalsIgnoreCase("France")&&answer5&&!answer5two&&!answer5three){
            score+=5;
            result+="\nYour Score is: "+score;
        }else if (!isMessi&&!answer2.equalsIgnoreCase("Real Madrid")&&!answer3.equalsIgnoreCase("Yes")&&answer4.equalsIgnoreCase("France")&&!answer5&&answer5two&&!answer5three){
            score+=5;
            result+="\nYour Score is: "+score;
        }else if (!isMessi&&!answer2.equalsIgnoreCase("Real Madrid")&&!answer3.equalsIgnoreCase("Yes")&&answer4.equalsIgnoreCase("France")&&!answer5&&!answer5two&&answer5three){
            score+=5;
            result+="\nYour Score is: "+score;
        }
        else if (!isMessi&&!answer2.equalsIgnoreCase("Real Madrid")&&!answer3.equalsIgnoreCase("Yes")&&!answer4.equalsIgnoreCase("France")&&answer5&&answer5two&&!answer5three){
            score+=5;
            result+="\nYour Score is: "+score;
        }else if (!isMessi&&answer2.equalsIgnoreCase("Real Madrid")&&!answer3.equalsIgnoreCase("Yes")&&!answer4.equalsIgnoreCase("France")&&answer5&&!answer5two&&!answer5three){
            score+=5;
            result+="\nYour Score is: "+score;
        }else if (!isMessi&&answer2.equalsIgnoreCase("Real Madrid")&&!answer3.equalsIgnoreCase("Yes")&&!answer4.equalsIgnoreCase("France")&&!answer5&&answer5two&&!answer5three){
            score+=5;
            result+="\nYour Score is: "+score;
        }else if (!isMessi&&answer2.equalsIgnoreCase("Real Madrid")&&!answer3.equalsIgnoreCase("Yes")&&!answer4.equalsIgnoreCase("France")&&!answer5&&!answer5two&&answer5three){
            score+=5;
            result+="\nYour Score is: "+score;
        }
        else if (!isMessi&&!answer2.equalsIgnoreCase("Real Madrid")&&!answer3.equalsIgnoreCase("Yes")&&answer4.equalsIgnoreCase("France")&&answer5&&answer5two&&!answer5three){
            score+=10;
            result+="\nYour Score is: "+score;
        }else if (!isMessi&&!answer2.equalsIgnoreCase("Real Madrid")&&answer3.equalsIgnoreCase("Yes")&&!answer4.equalsIgnoreCase("France")&&answer5&&answer5two&&!answer5three){
            score+=10;
            result+="\nYour Score is: "+score;
        }else if (!isMessi&&!answer2.equalsIgnoreCase("Real Madrid")&&answer3.equalsIgnoreCase("Yes")&&answer4.equalsIgnoreCase("France")&&!answer5&&!answer5two&&!answer5three){
            score+=10;
            result+="\nYour Score is: "+score;
        }else if (!isMessi&&!answer2.equalsIgnoreCase("Real Madrid")&&answer3.equalsIgnoreCase("Yes")&&answer4.equalsIgnoreCase("France")&&!answer5&&answer5two&&answer5three){
            score+=10;
            result+="\nYour Score is: "+score;
        } else if (!isMessi&&!answer2.equalsIgnoreCase("Real Madrid")&&answer3.equalsIgnoreCase("Yes")&&answer4.equalsIgnoreCase("France")&&answer5&&!answer5two&&answer5three){
            score+=10;
            result+="\nYour Score is: "+score;
        }else if (!isMessi&&!answer2.equalsIgnoreCase("Real Madrid")&&answer3.equalsIgnoreCase("Yes")&&answer4.equalsIgnoreCase("France")&&answer5&&answer5two&&answer5three){
            score+=10;
            result+="\nYour Score is: "+score;
        }
        else if (isMessi&&!answer2.equalsIgnoreCase("Real Madrid")&&!answer3.equalsIgnoreCase("Yes")&&!answer4.equalsIgnoreCase("France")&&answer5&&answer5two&&!answer5three){
            score+=10;
            result+="\nYour Score is: "+score;
        }
        else if (isMessi&&!answer2.equalsIgnoreCase("Real Madrid")&&!answer3.equalsIgnoreCase("Yes")&&answer4.equalsIgnoreCase("France")&&!answer5&&!answer5two&&!answer5three){
            score+=10;
            result+="\nYour Score is: "+score;
        }else if (isMessi&&!answer2.equalsIgnoreCase("Real Madrid")&&!answer3.equalsIgnoreCase("Yes")&&answer4.equalsIgnoreCase("France")&&!answer5&&answer5two&&answer5three){
            score+=10;
            result+="\nYour Score is: "+score;
        }else if (isMessi&&!answer2.equalsIgnoreCase("Real Madrid")&&!answer3.equalsIgnoreCase("Yes")&&answer4.equalsIgnoreCase("France")&&answer5&&!answer5two&&answer5three){
            score+=10;
            result+="\nYour Score is: "+score;
        }else if (isMessi&&!answer2.equalsIgnoreCase("Real Madrid")&&!answer3.equalsIgnoreCase("Yes")&&answer4.equalsIgnoreCase("France")&&answer5&&answer5two&&answer5three){
            score+=10;
            result+="\nYour Score is: "+score;
        }
        else if (isMessi&&answer2.equalsIgnoreCase("Real Madrid")&&!answer3.equalsIgnoreCase("Yes")&&!answer4.equalsIgnoreCase("France")&&!answer5&&!answer5two&&!answer5three){
            score+=10;
            result+="\nYour Score is: "+score;
        }else if (isMessi&&answer2.equalsIgnoreCase("Real Madrid")&&!answer3.equalsIgnoreCase("Yes")&&!answer4.equalsIgnoreCase("France")&&!answer5&&answer5two&&answer5three){
            score+=10;
            result+="\nYour Score is: "+score;
        }else if (isMessi&&answer2.equalsIgnoreCase("Real Madrid")&&!answer3.equalsIgnoreCase("Yes")&&!answer4.equalsIgnoreCase("France")&&answer5&&!answer5two&&answer5three){
            score+=10;
            result+="\nYour Score is: "+score;
        }else if (isMessi&&answer2.equalsIgnoreCase("Real Madrid")&&!answer3.equalsIgnoreCase("Yes")&&!answer4.equalsIgnoreCase("France")&&answer5&&answer5two&&answer5three){
            score+=10;
            result+="\nYour Score is: "+score;
        }
        else if (isMessi&&!answer2.equalsIgnoreCase("Real Madrid")&&answer3.equalsIgnoreCase("Yes")&&!answer4.equalsIgnoreCase("France")&&!answer5&&!answer5two&&!answer5three){
            score+=10;
            result+="\nYour Score is: "+score;
        }else if (isMessi&&!answer2.equalsIgnoreCase("Real Madrid")&&answer3.equalsIgnoreCase("Yes")&&!answer4.equalsIgnoreCase("France")&&!answer5&&answer5two&&answer5three){
            score+=10;
            result+="\nYour Score is: "+score;
        }else if (isMessi&&!answer2.equalsIgnoreCase("Real Madrid")&&answer3.equalsIgnoreCase("Yes")&&!answer4.equalsIgnoreCase("France")&&answer5&&!answer5two&&answer5three){
            score+=10;
            result+="\nYour Score is: "+score;
        }else if (isMessi&&!answer2.equalsIgnoreCase("Real Madrid")&&answer3.equalsIgnoreCase("Yes")&&!answer4.equalsIgnoreCase("France")&&answer5&&answer5two&&answer5three){
            score+=10;
            result+="\nYour Score is: "+score;
        }
        else if (!isMessi&&answer2.equalsIgnoreCase("Real Madrid")&&answer3.equalsIgnoreCase("Yes")&&!answer4.equalsIgnoreCase("France")&&!answer5&&!answer5two&&!answer5three){
            score+=10;
            result+="\nYour Score is: "+score;
        }else if (!isMessi&&answer2.equalsIgnoreCase("Real Madrid")&&answer3.equalsIgnoreCase("Yes")&&!answer4.equalsIgnoreCase("France")&&!answer5&&answer5two&&answer5three){
            score+=10;
            result+="\nYour Score is: "+score;
        } else if (!isMessi&&answer2.equalsIgnoreCase("Real Madrid")&&answer3.equalsIgnoreCase("Yes")&&!answer4.equalsIgnoreCase("France")&&answer5&&!answer5two&&answer5three){
            score+=10;
            result+="\nYour Score is: "+score;
        }else if (!isMessi&&answer2.equalsIgnoreCase("Real Madrid")&&answer3.equalsIgnoreCase("Yes")&&!answer4.equalsIgnoreCase("France")&&answer5&&answer5two&&answer5three){
            score+=10;
            result+="\nYour Score is: "+score;
        }
        else if (!isMessi&&answer2.equalsIgnoreCase("Real Madrid")&&!answer3.equalsIgnoreCase("Yes")&&answer4.equalsIgnoreCase("France")&&!answer5&&!answer5two&&!answer5three){
            score+=10;
            result+="\nYour Score is: "+score;
        }else if (!isMessi&&answer2.equalsIgnoreCase("Real Madrid")&&!answer3.equalsIgnoreCase("Yes")&&answer4.equalsIgnoreCase("France")&&!answer5&&answer5two&&answer5three){
            score+=10;
            result+="\nYour Score is: "+score;
        } else if (!isMessi&&answer2.equalsIgnoreCase("Real Madrid")&&!answer3.equalsIgnoreCase("Yes")&&answer4.equalsIgnoreCase("France")&&answer5&&!answer5two&&answer5three){
            score+=10;
            result+="\nYour Score is: "+score;
        }
        else if(!isMessi&&!answer2.equalsIgnoreCase("Real Madrid")&&answer3.equalsIgnoreCase("Yes")&&answer4.equalsIgnoreCase("France")&&answer5&&answer5two&&!answer5three){
            score+=15;
            result+="\nYour Score is: "+score;
        }else if (!isMessi&&answer2.equalsIgnoreCase("Real Madrid")&&!answer3.equalsIgnoreCase("Yes")&&answer4.equalsIgnoreCase("France")&&answer5&&answer5two&&!answer5three){
            score+=15;
            result+="\nYour Score is: "+score;
        } else if (!isMessi&&answer2.equalsIgnoreCase("Real Madrid")&&answer3.equalsIgnoreCase("Yes")&&!answer4.equalsIgnoreCase("France")&&answer5&&answer5two&&!answer5three){
            score+=15;
            result+="\nYour Score is: "+score;
        }else if (isMessi&&!answer2.equalsIgnoreCase("Real Madrid")&&!answer3.equalsIgnoreCase("Yes")&&answer4.equalsIgnoreCase("France")&&answer5&&answer5two&&!answer5three){
            score+=15;
            result+="\nYour Score is: "+score;
        }else if (isMessi&&!answer2.equalsIgnoreCase("Real Madrid")&&answer3.equalsIgnoreCase("Yes")&&!answer4.equalsIgnoreCase("France")&&answer5&&answer5two&&!answer5three){
            score+=15;
            result+="\nYour Score is: "+score;
        }else if (isMessi&&!answer2.equalsIgnoreCase("Real Madrid")&&answer3.equalsIgnoreCase("Yes")&&answer4.equalsIgnoreCase("France")&&!answer5&&!answer5two&&!answer5three){
            score+=15;
            result+="\nYour Score is: "+score;
        }else if (isMessi&&!answer2.equalsIgnoreCase("Real Madrid")&&answer3.equalsIgnoreCase("Yes")&&answer4.equalsIgnoreCase("France")&&!answer5&&answer5two&&answer5three){
            score+=15;
            result+="\nYour Score is: "+score;
        }else if (isMessi&&!answer2.equalsIgnoreCase("Real Madrid")&&answer3.equalsIgnoreCase("Yes")&&answer4.equalsIgnoreCase("France")&&answer5&&!answer5two&&answer5three){
            score+=15;
            result+="\nYour Score is: "+score;
        }else if (isMessi&&!answer2.equalsIgnoreCase("Real Madrid")&&answer3.equalsIgnoreCase("Yes")&&answer4.equalsIgnoreCase("France")&&answer5&&answer5two&&!answer5three){
            score+=15;
            result+="\nYour Score is: "+score;
        }
        else if (isMessi&&answer2.equalsIgnoreCase("Real Madrid")&&!answer3.equalsIgnoreCase("Yes")&&!answer4.equalsIgnoreCase("France")&&answer5&&answer5two&&!answer5three){
            score+=15;
            result+="\nYour Score is: "+score;
        }else if (isMessi&&answer2.equalsIgnoreCase("Real Madrid")&&!answer3.equalsIgnoreCase("Yes")&&answer4.equalsIgnoreCase("France")&&!answer5&&!answer5two&&!answer5three){
            score+=15;
            result+="\nYour Score is: "+score;
        }else if (isMessi&&answer2.equalsIgnoreCase("Real Madrid")&&!answer3.equalsIgnoreCase("Yes")&&answer4.equalsIgnoreCase("France")&&!answer5&&answer5two&&answer5three){
            score+=15;
            result+="\nYour Score is: "+score;
        }else if (isMessi&&answer2.equalsIgnoreCase("Real Madrid")&&!answer3.equalsIgnoreCase("Yes")&&answer4.equalsIgnoreCase("France")&&answer5&&!answer5two&&answer5three){
            score+=15;
            result+="\nYour Score is: "+score;
        }
        else if (isMessi&&answer2.equalsIgnoreCase("Real Madrid")&&answer3.equalsIgnoreCase("Yes")&&!answer4.equalsIgnoreCase("France")&&!answer5&&!answer5two&&!answer5three){
            score+=15;
            result+="\nYour Score is: "+score;
        }else if (isMessi&&answer2.equalsIgnoreCase("Real Madrid")&&answer3.equalsIgnoreCase("Yes")&&!answer4.equalsIgnoreCase("France")&&!answer5&&answer5two&&answer5three){
            score+=15;
            result+="\nYour Score is: "+score;
        }else if (isMessi&&answer2.equalsIgnoreCase("Real Madrid")&&answer3.equalsIgnoreCase("Yes")&&!answer4.equalsIgnoreCase("France")&&answer5&&!answer5two&&answer5three){
            score+=15;
            result+="\nYour Score is: "+score;
        } else if (isMessi&&answer2.equalsIgnoreCase("Real Madrid")&&answer3.equalsIgnoreCase("Yes")&&!answer4.equalsIgnoreCase("France")&&answer5&&answer5two&&!answer5three){
            score+=15;
            result+="\nYour Score is: "+score;
        }
        else {
            score=score;
            result+="\nYour Score is: "+score;
        }
        return result;
    }

    public String display_message(String message){
        TextView final_result = (TextView) findViewById(R.id.Final_result);
        final_result.setText(message);
        return message;
    }

}