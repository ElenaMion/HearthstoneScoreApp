package com.example.android.hearthstonescore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    final int startingLife = 30;  //players start game with 30 HP
    int currentLife1 = startingLife; //player 1's HP
    int currentLife2 = startingLife; //player 2's HP
    int armor1; //pleyer 1's armor
    int armor2; //player 2's armor
    int damage1; //damage done to Player 1 during a turn
    int damage2;//damage done to Player 3 during a turn
    int lifesteal1; //life that Player 1 gained during a turn
    int lifesteal2; //life that Player 12 gained during a turn
    int armorgained1; //pleyer 1's armor gained during turn
    int armorgained2; //pleyer 2's armor gained during turn
    boolean pleyer1turn = true; // tracks whose turn it is; player 1 starts


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createListeners();
    }

    public void createListeners() {

        //Listeners to TextViews - damage, lifesteal, armor gained
        EditText damage1TextBox = (EditText) findViewById(R.id.damage1_number);
        damage1TextBox.addTextChangedListener(new TextWatcher() {

            public void afterTextChanged(Editable s) {
            }

            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
            }

            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {
                if (!s.equals("")) {
                    try {
                        damage1 = Integer.parseInt(s.toString());
                    } catch (Exception e) {
                        damage1 = 0;
                    }
                }
            }
        });

        EditText lifesteal1TextBox = (EditText) findViewById(R.id.lifesteal1_number);
        lifesteal1TextBox.addTextChangedListener(new TextWatcher() {

            public void afterTextChanged(Editable s) {
            }

            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
            }

            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {
                if (!s.equals("")) {
                    try {
                        lifesteal1 = Integer.parseInt(s.toString());
                    } catch (Exception e) {
                        lifesteal1 = 0;
                    }
                }
            }
        });

        EditText armor1TextBox = (EditText) findViewById(R.id.armorGained1_number);
        armor1TextBox.addTextChangedListener(new TextWatcher() {

            public void afterTextChanged(Editable s) {
            }

            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
            }

            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {
                if (!s.equals("")) {
                    try {
                        armorgained1 = Integer.parseInt(s.toString());
                    } catch (Exception e) {
                        armorgained1 = 0;
                    }
                }
            }
        });

        EditText damage2TextBox = (EditText) findViewById(R.id.damage2_number);
        damage2TextBox.addTextChangedListener(new TextWatcher() {

            public void afterTextChanged(Editable s) {
            }

            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
            }

            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {
                if (!s.equals("")) {
                    try {
                        damage2 = Integer.parseInt(s.toString());
                    } catch (Exception e) {
                        damage2 = 0;
                    }
                }
            }
        });

        EditText lifesteal2TextBox = (EditText) findViewById(R.id.lifesteal2_number);
        lifesteal2TextBox.addTextChangedListener(new TextWatcher() {

            public void afterTextChanged(Editable s) {
            }

            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
            }

            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {
                if (!s.equals("")) {
                    try {
                        lifesteal2 = Integer.parseInt(s.toString());
                    } catch (Exception e) {
                        lifesteal2 = 0;
                    }
                }
            }
        });

        EditText armor2TextBox = (EditText) findViewById(R.id.armorGained2_number);
        armor2TextBox.addTextChangedListener(new TextWatcher() {

            public void afterTextChanged(Editable s) {
            }

            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
            }

            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {
                if (!s.equals("")) {
                    try {
                        armorgained2 = Integer.parseInt(s.toString());
                    } catch (Exception e) {
                        armorgained2 = 0;
                    }
                }
            }
        });

    }


    //decreases the damage done to player1 during a turn
    public void decrementDamage1(View view) {
        if (damage1 > 0) {
            damage1--;
        }
        displayDamage1(damage1);
    }

    //increases the damage done to player1 during a turn
    public void incrementDamage1(View view) {
        damage1++;
        displayDamage1(damage1);
    }

    //displays the damage done to player1 during a turn
    public void displayDamage1(int damage1) {
        TextView damage1new = (TextView) findViewById(R.id.damage1_number);
        damage1new.setText(String.valueOf(damage1));
    }


    //decreases the life that Player 1 gained during a turn
    public void decrementLifesteal1(View view) {
        if (lifesteal1 > 0) {
            lifesteal1--;
        }
        displaylifesteal1(lifesteal1);
    }

    //increases the life that Player 1 gained during a turn
    public void incrementLifesteal1(View view) {
        lifesteal1++;
        displaylifesteal1(lifesteal1);
    }

    //displays the life that Player 1 gained during a turn
    public void displaylifesteal1(int lifesteal1) {
        TextView lifesteal1new = (TextView) findViewById(R.id.lifesteal1_number);
        lifesteal1new.setText(String.valueOf(lifesteal1));
    }


    //decreases how much armor pleyer 1 gained during turn
    public void decrementArmorGained1(View view) {
        if (armorgained1 > 0) {
            armorgained1--;
        }
        displayArmorGained1(armorgained1);
    }

    //increases how much armor pleyer 1 gained during turn
    public void incrementArmorGained1(View view) {
        armorgained1++;
        displayArmorGained1(armorgained1);
    }

    //displays how much armor pleyer 1 gained during turn
    public void displayArmorGained1(int armorgained1) {
        TextView armorgained1new = (TextView) findViewById(R.id.armorGained1_number);
        armorgained1new.setText(String.valueOf(armorgained1));
    }

    //decreases the damage done to player2 during a turn
    public void decrementDamage2(View view) {
        if (damage2 > 0) {
            damage2--;
        }
        displayDamage2(damage2);
    }

    //increases the damage done to player2 during a turn
    public void incrementDamage2(View view) {
        damage2++;
        displayDamage2(damage2);
    }

    //displays the damage done to player2 during a turn
    public void displayDamage2(int damage2) {
        TextView damage2new = (TextView) findViewById(R.id.damage2_number);
        damage2new.setText(String.valueOf(damage2));
    }

    //decreases the life that Player2 gained during a turn
    public void decrementLifesteal2(View view) {
        if (lifesteal2 > 0) {
            lifesteal2--;
        }
        displaylifesteal2(lifesteal2);
    }

    //increases the life that Player 2 gained during a turn
    public void incrementLifesteal2(View view) {
        lifesteal2++;
        displaylifesteal2(lifesteal2);
    }

    //displays the life that Player 2 gained during a turn
    public void displaylifesteal2(int lifesteal2) {
        TextView lifesteal2new = (TextView) findViewById(R.id.lifesteal2_number);
        lifesteal2new.setText(String.valueOf(lifesteal2));
    }

    //decreases how much armor pleyer 2 gained during turn
    public void decrementArmorGained2(View view) {
        if (armorgained2 > 0) {
            armorgained2--;
        }
        displayArmorGained2(armorgained2);
    }

    //increases how much armor pleyer 2 gained during turn
    public void incrementArmorGained2(View view) {
        armorgained2++;
        displayArmorGained2(armorgained2);
    }

    //displays how much armor pleyer 2 gained during turn
    public void displayArmorGained2(int armorgained2) {
        TextView armorgained2new = (TextView) findViewById(R.id.armorGained2_number);
        armorgained2new.setText(String.valueOf(armorgained2));
    }

    public void endTurn(View view) {

        //set remaining HP of palyers - life + armor
        calculateplayer1HP();
        calculateplayer2HP();

        //check if someone died
        if (currentLife1 <= 0) {
            LinearLayout mainGame = (LinearLayout) findViewById(R.id.main_game);
            mainGame.setVisibility(View.GONE);
            TextView endGame = (TextView) findViewById(R.id.end_game);
            endGame.setText("Player2 won!");
            endGame.setVisibility(View.VISIBLE);
        }

        if (currentLife2 <= 0) {
            LinearLayout mainGame = (LinearLayout) findViewById(R.id.main_game);
            mainGame.setVisibility(View.GONE);
            TextView endGame = (TextView) findViewById(R.id.end_game);
            endGame.setText("Player1 won!");
            endGame.setVisibility(View.VISIBLE);
        }

        //make damage, lifesteal and armor 0
        nullStats();

        //sets text on top and manages button "EndTurn"
        TextView player1turn = (TextView) findViewById(R.id.player1);
        TextView player2turn = (TextView) findViewById(R.id.player2);
        Button endturn1 = (Button) findViewById(R.id.endTurn1);
        Button endturn2 = (Button) findViewById(R.id.endTurn2);
        if (pleyer1turn) {
            player1turn.setText("Player 1");
            player2turn.setText("Player 2's turn");
            endturn1.setVisibility(View.GONE);
            endturn2.setVisibility(View.VISIBLE);
            pleyer1turn = false;
        } else {
            player1turn.setText("Player 1's turn");
            player2turn.setText("Player 2");
            endturn1.setVisibility(View.VISIBLE);
            endturn2.setVisibility(View.GONE);
            pleyer1turn = true;
        }
    }

    public void calculateplayer1HP() {

        //add armor gained during the turn
        armor1 += armorgained1;

        if (damage1 > armor1) {
            damage1 = damage1 - armor1;
            armor1 = 0;
        } else {
            armor1 -= damage1;
            damage1 = 0;
        }
        currentLife1 -= damage1;

        //add lifesteal
        if ((lifesteal1 + currentLife1) > 30) {
            currentLife1 = 30;
        } else currentLife1 += lifesteal1;


        //set player 1 life and armor
        TextView player1life = (TextView) findViewById(R.id.life1);
        TextView player1armor = (TextView) findViewById(R.id.armor1);
        player1life.setText("Life: " + currentLife1);
        player1armor.setText("Armor: " + armor1);
    }

    public void calculateplayer2HP() {

        //add armor gained during the turn
        armor2 += armorgained2;

        if (damage2 > armor2) {
            damage2 = damage2 - armor2;
            armor2 = 0;
        } else {
            armor2 -= damage2;
            damage2 = 0;
        }
        currentLife2 -= damage2;

        //add lifesteal
        if ((lifesteal2 + currentLife2) > 30) {
            currentLife2 = 30;
        } else currentLife2 += lifesteal2;

        //set player 2 life and armor
        TextView player2life = (TextView) findViewById(R.id.life2);
        TextView player2armor = (TextView) findViewById(R.id.armor2);
        player2life.setText("Life: " + currentLife2);
        player2armor.setText("Armor: " + armor2);
    }

    public void nullStats() {
        damage1 = 0;
        displayDamage1(damage1);
        damage2 = 0;
        displayDamage2(damage2);
        lifesteal1 = 0;
        displaylifesteal1(lifesteal1);
        lifesteal2 = 0;
        displaylifesteal2(lifesteal2);
        armorgained1 = 0;
        displayArmorGained1(armorgained1);
        armorgained2 = 0;
        displayArmorGained2(armorgained2);
    }

    public void reset(View view) {
        nullStats();

        currentLife1 = 30;
        currentLife2 = 30;
        armor1 = 0;
        armor2 = 0;

        LinearLayout mainGame = (LinearLayout) findViewById(R.id.main_game);
        mainGame.setVisibility(View.VISIBLE);
        TextView endGame = (TextView) findViewById(R.id.end_game);
        endGame.setVisibility(View.GONE);

        //set player 1 life and armor
        TextView player1life = (TextView) findViewById(R.id.life1);
        TextView player1armor = (TextView) findViewById(R.id.armor1);
        player1life.setText("Life: " + currentLife1);
        player1armor.setText("Armor: " + armor1);

        //set player 2 life and armor
        TextView player2life = (TextView) findViewById(R.id.life2);
        TextView player2armor = (TextView) findViewById(R.id.armor2);
        player2life.setText("Life: " + currentLife2);
        player2armor.setText("Armor: " + armor2);

    }
}

