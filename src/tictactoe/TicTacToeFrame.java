
package tictactoe;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class TicTacToeFrame extends javax.swing.JFrame {

   
    private String player = "Player one";
   
    private int playerCount = 0;
    private int computerCount = 0;
    private boolean playerTurn = true;
    
    
    public TicTacToeFrame() {
        initComponents();
        setSize(600,600);
        setLocationRelativeTo(null);
        getPlayerNames();
        setScore();
    }
    
    private void tieGame()
    {
        String one = jButton1.getText();
        String two = jButton2.getText();
        String three = jButton3.getText();
        String four = jButton4.getText();
        String five = jButton5.getText();
        String six = jButton6.getText();
        String seven = jButton7.getText();
        String eight = jButton8.getText();
        String nine = jButton9.getText(); 
        
        if(one != "" && two != "" && three != "" && four != "" && five != "" && 
                six != "" && seven != "" && eight != "" && nine != "")
        {
            JOptionPane.showMessageDialog(this,
                "Game is a tie",
                "Tie Game!",
                JOptionPane.INFORMATION_MESSAGE);
            resetGame();
        }
        
    }
    
    
    private void setScore()
    {
        jLabel_Score.setText(player + "'s score is:    "+String.valueOf(playerCount)+"     "
                +"Computer's score is:    "+String.valueOf(computerCount));
    }
    
    private void getPlayerNames()
    {
        player = JOptionPane.showInputDialog(this,
                "Player's name :",
                "Player name",
                JOptionPane.INFORMATION_MESSAGE);
        
         if(player.equals(""))
         {
             player = "Player One";
         }
         
        
    }
   
    private void xWins(){
        JOptionPane.showMessageDialog(this,
                "Player one wins",
                "Winner",
                JOptionPane.INFORMATION_MESSAGE);
        playerCount++;
        resetGame();
    }
    
    private void oWins(){
        JOptionPane.showMessageDialog(this,
                "Computer wins",
                "Winner",
                JOptionPane.INFORMATION_MESSAGE);
        computerCount++;
        resetGame();
        
    }
    
     private void resetGame()
     {
         jButton1.setText("");
         jButton2.setText("");
         jButton3.setText("");
         jButton4.setText("");
         jButton5.setText("");
         jButton6.setText("");
         jButton7.setText("");
         jButton8.setText("");
         jButton9.setText("");
         setScore();
         playerTurn = true;
   
     }
    private void determineIfWin(){
        String one = jButton1.getText();
        String two = jButton2.getText();
        String three = jButton3.getText();
        String four = jButton4.getText();
        String five = jButton5.getText();
        String six = jButton6.getText();
        String seven = jButton7.getText();
        String eight = jButton8.getText();
        String nine = jButton9.getText();
        
        //winer conditions
        if(one == "X" && two == "X" && three == "X")
        {
            xWins();
        }
        if(four == "X" && five == "X" && six == "X")
        {
            xWins();
        }
        if(seven == "X" && eight == "X" && nine == "X")
        {
            xWins();
        }
        if(one == "X" && four == "X" && seven == "X")
        {
            xWins();
        }
        if(two == "X" && five == "X" && eight == "X")
        {
            xWins();
        }
        if(three == "X" && six == "X" && nine == "X")
        {
            xWins();
        }
        if(one == "X" && five == "X" && nine == "X")
        {
            xWins();
        }
        if(three == "X" && five == "X" && seven == "X")
        {
            xWins();
        }
            
        
        
    }
    
    private boolean winConditionComp()
    {
        
        String one = jButton1.getText();
        String two = jButton2.getText();
        String three = jButton3.getText();
        String four = jButton4.getText();
        String five = jButton5.getText();
        String six = jButton6.getText();
        String seven = jButton7.getText();
        String eight = jButton8.getText();
        String nine = jButton9.getText();
        
        //for row;
        
        if(one=="O" && two =="O" && three == "")
        {
            jButton3.setText("O");
            jButton3.setForeground(Color.BLACK);
            return true;
        }
        else if(one=="O" && three =="O" && two == "")
        {
            jButton2.setText("O");
            jButton2.setForeground(Color.BLACK);
            return true;
        }
        else if(three=="O" && two =="O" && one == "")
        {
            jButton1.setText("O");
            jButton1.setForeground(Color.BLACK);
            return true;
        }
        else if(four=="O" && five =="O" && six == "")
        {
            jButton6.setText("O");
            jButton6.setForeground(Color.BLACK);
            return true;
        }
        else if(four=="O" && six =="O" && five == "")
        {
            jButton5.setText("O");
            jButton5.setForeground(Color.BLACK);
            return true;
        }
        else if(five=="O" && six =="O" && four == "")
        {
            jButton4.setText("O");
            jButton4.setForeground(Color.BLACK);
            return true;
        }
        else if(seven=="O" && eight =="O" && nine == "")
        {
            jButton9.setText("O");
            jButton9.setForeground(Color.BLACK);
            return true;
        }
        else if(seven=="O" && nine =="O" && eight == "")
        {
            jButton8.setText("O");
            jButton8.setForeground(Color.BLACK);
            return true;
        }
        else if(eight=="O" && nine =="O" && seven == "")
        {
            jButton7.setText("O");
            jButton7.setForeground(Color.BLACK);
            return true;
        }
        //for column;
        
        else if(one=="O" && four =="O" && seven == "")
        {
            jButton7.setText("O");
            jButton7.setForeground(Color.BLACK);
            return true;
        }
        else if(one=="O" && seven =="O" && four == "")
        {
            jButton4.setText("O");
            jButton4.setForeground(Color.BLACK);
            return true;
        }
        else if(four=="O" && seven =="O" && one == "")
        {
            jButton1.setText("O");
            jButton1.setForeground(Color.BLACK);
            return true;
        }
        else if(two=="O" && five =="O" && eight == "")
        {
            jButton8.setText("O");
            jButton8.setForeground(Color.BLACK);
            return true;
        }
        else if(two=="O" && eight =="O" && five == "")
        {
            jButton5.setText("O");
            jButton5.setForeground(Color.BLACK);
            return true;
        }
        else if(five=="O" && eight =="O" && two == "")
        {
            jButton2.setText("O");
            jButton2.setForeground(Color.BLACK);
            return true;
        }
        else if(three=="O" && six =="O" && nine == "")
        {
            jButton9.setText("O");
            jButton9.setForeground(Color.BLACK);
            return true;
        }
        else if(three=="O" && nine =="O" && six == "")
        {
            jButton6.setText("O");
            jButton6.setForeground(Color.BLACK);
            return true;
        }
        else if(six=="O" && nine =="O" && three == "")
        {
            jButton3.setText("O");
            jButton3.setForeground(Color.BLACK);
            return true;
        }
        //for diagonals;
        
        else if(one=="O" && five =="O" && nine == "")
        {
            jButton9.setText("O");
            jButton9.setForeground(Color.BLACK);
            return true;
        }
        else if(one=="O" && nine =="O" && five == "")
        {
            jButton5.setText("O");
            jButton5.setForeground(Color.BLACK);
            return true;
        }
        else if(five=="O" && nine =="O" && one == "")
        {
            jButton1.setText("O");
            jButton1.setForeground(Color.BLACK);
            return true;
        }
        else if(three=="O" && five =="O" && seven == "")
        {
            jButton7.setText("O");
            jButton7.setForeground(Color.BLACK);
            return true;
        }
        else if(three=="O" && seven =="O" && five == "")
        {
            jButton5.setText("O");
            jButton5.setForeground(Color.BLACK);
            return true;
        }
        else if(five=="O" && seven =="O" && three == "")
        {
            jButton3.setText("O");
            jButton3.setForeground(Color.BLACK);
            return true;
        }
        else 
            return false;
        
    }
    private boolean blockConditionComp()
    {
        
        String one = jButton1.getText();
        String two = jButton2.getText();
        String three = jButton3.getText();
        String four = jButton4.getText();
        String five = jButton5.getText();
        String six = jButton6.getText();
        String seven = jButton7.getText();
        String eight = jButton8.getText();
        String nine = jButton9.getText();
        
        //for row;
        
        if(one=="X" && two =="X" && three == "")
        {
            jButton3.setText("O");
            jButton3.setForeground(Color.BLACK);
            return true;
        }
        else if(one=="X" && three =="X" && two == "")
        {
            jButton2.setText("O");
            jButton2.setForeground(Color.BLACK);
            return true;
        }
        else if(three=="X" && two =="X" && one == "")
        {
            jButton1.setText("O");
            jButton1.setForeground(Color.BLACK);
            return true;
        }
        else if(four=="X" && five =="X" && six == "")
        {
            jButton6.setText("O");
            jButton6.setForeground(Color.BLACK);
            return true;
        }
        else if(four=="X" && six =="X" && five == "")
        {
            jButton5.setText("O");
            jButton5.setForeground(Color.BLACK);
            return true;
        }
        else if(five=="X" && six =="X" && four == "")
        {
            jButton4.setText("O");
            jButton4.setForeground(Color.BLACK);
            return true;
        }
        else if(seven=="X" && eight =="X" && nine == "")
        {
            jButton9.setText("O");
            jButton9.setForeground(Color.BLACK);
            return true;
        }
        else if(seven=="X" && nine =="X" && eight == "")
        {
            jButton8.setText("O");
            jButton8.setForeground(Color.BLACK);
            return true;
        }
        else if(eight=="X" && nine =="X" && seven == "")
        {
            jButton7.setText("O");
            jButton7.setForeground(Color.BLACK);
            return true;
        }
        //for column;
        
        else if(one=="X" && four =="X" && seven == "")
        {
            jButton7.setText("O");
            jButton7.setForeground(Color.BLACK);
            //jButton7.setForeground(Color.BLACK);
            return true;
        }
        else if(one=="X" && seven =="X" && four == "")
        {
            jButton4.setText("O");
            jButton4.setForeground(Color.BLACK);
            return true;
        }
        else if(four=="X" && seven =="X" && one == "")
        {
            jButton1.setText("O");
            jButton1.setForeground(Color.BLACK);
            return true;
        }
        else if(two=="X" && five =="X" && eight == "")
        {
            jButton8.setText("O");
            jButton8.setForeground(Color.BLACK);
            return true;
        }
        else if(two=="X" && eight =="X" && five == "")
        {
            jButton5.setText("O");
            jButton5.setForeground(Color.BLACK);
            return true;
        }
        else if(five=="X" && eight =="X" && two == "")
        {
            jButton2.setText("O");
            jButton2.setForeground(Color.BLACK);
            return true;
        }
        else if(three=="X" && six =="X" && nine == "")
        {
            jButton9.setText("O");
            jButton9.setForeground(Color.BLACK);
            return true;
        }
        else if(three=="X" && nine =="X" && six == "")
        {
            jButton6.setText("O");
            jButton6.setForeground(Color.BLACK);
            return true;
        }
        else if(six=="X" && nine =="X" && three == "")
        {
            jButton3.setText("O");
            jButton3.setForeground(Color.BLACK);
            return true;
        }
        //for diagonal;
        
        else if(one=="X" && five =="X" && nine == "")
        {
            jButton9.setText("O");
            jButton9.setForeground(Color.BLACK);
            return true;
        }
        else if(one=="X" && nine =="X" && five == "")
        {
            jButton5.setText("O");
            jButton5.setForeground(Color.BLACK);
            return true;
        }
        else if(five=="X" && nine =="X" && one == "")
        {
            jButton1.setText("O");
            jButton1.setForeground(Color.BLACK);
            return true;
        }
        else if(three=="X" && five =="X" && seven == "")
        {
            jButton7.setText("O");
            jButton7.setForeground(Color.BLACK);
            return true;
        }
        else if(three=="X" && seven =="X" && five == "")
        {
            jButton5.setText("O");
            jButton5.setForeground(Color.BLACK);
            return true;
        }
        else if(five=="X" && seven =="X" && three == "")
        {
            jButton3.setText("O");
            jButton3.setForeground(Color.BLACK);
            return true;
        }
        else 
            return false;
        
    }
    
    private void randomMove()
    {
        //sleep();
        
        String one = jButton1.getText();
        String two = jButton2.getText();
        String three = jButton3.getText();
        String four = jButton4.getText();
        String five = jButton5.getText();
        String six = jButton6.getText();
        String seven = jButton7.getText();
        String eight = jButton8.getText();
        String nine = jButton9.getText();
        
        if(five=="")
        {
            jButton5.setText("O");
            jButton5.setForeground(Color.BLACK);
        }
        else if((one == "X" && nine =="X" )|| (three == "X" && seven =="X" ))
        {
            if (four=="")
            {
                jButton4.setText("O");
                jButton4.setForeground(Color.BLACK);
            }
               
            else if (two=="")
            {
                jButton2.setText("O");
                jButton2.setForeground(Color.BLACK);
                
            }
            else if (six=="")
            {
                jButton6.setText("O");
                jButton6.setForeground(Color.BLACK);
            }
               
            else if (eight=="")
            {
                jButton8.setText("O");
                jButton8.setForeground(Color.BLACK);
            }
                 
        }
        else if (one=="")
        {
            jButton1.setText("O");
            jButton1.setForeground(Color.BLACK);
        }
        else if (three=="")
        {
            jButton3.setText("O");
            jButton3.setForeground(Color.BLACK);
        } 
        else if (seven=="")
        {
            jButton7.setText("O");
            jButton7.setForeground(Color.BLACK);
        }
        else if (nine=="")
        {
            jButton9.setText("O");
            jButton9.setForeground(Color.BLACK);
        }
        
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_Score = new javax.swing.JLabel();
        jPanel_GridHolder = new javax.swing.JPanel();
        jPanel_1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel_2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel_3 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel_4 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jPanel_5 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jPanel_6 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jPanel_7 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jPanel_8 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jPanel_9 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel_Score.setBackground(new java.awt.Color(153, 153, 255));
        jLabel_Score.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel_Score.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Score.setText("Place Makes For Score");
        jPanel1.add(jLabel_Score, java.awt.BorderLayout.PAGE_END);

        jPanel_GridHolder.setLayout(new java.awt.GridLayout(3, 3, 1, 1));

        jPanel_1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel_1.setLayout(new java.awt.BorderLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel_1.add(jButton1, java.awt.BorderLayout.CENTER);

        jPanel_GridHolder.add(jPanel_1);

        jPanel_2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel_2.setLayout(new java.awt.BorderLayout());

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel_2.add(jButton2, java.awt.BorderLayout.CENTER);

        jPanel_GridHolder.add(jPanel_2);

        jPanel_3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel_3.setLayout(new java.awt.BorderLayout());

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel_3.add(jButton3, java.awt.BorderLayout.CENTER);

        jPanel_GridHolder.add(jPanel_3);

        jPanel_4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel_4.setLayout(new java.awt.BorderLayout());

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel_4.add(jButton4, java.awt.BorderLayout.CENTER);

        jPanel_GridHolder.add(jPanel_4);

        jPanel_5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel_5.setLayout(new java.awt.BorderLayout());

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel_5.add(jButton5, java.awt.BorderLayout.CENTER);

        jPanel_GridHolder.add(jPanel_5);

        jPanel_6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel_6.setLayout(new java.awt.BorderLayout());

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel_6.add(jButton6, java.awt.BorderLayout.CENTER);

        jPanel_GridHolder.add(jPanel_6);

        jPanel_7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel_7.setLayout(new java.awt.BorderLayout());

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel_7.add(jButton7, java.awt.BorderLayout.CENTER);

        jPanel_GridHolder.add(jPanel_7);

        jPanel_8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel_8.setLayout(new java.awt.BorderLayout());

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel_8.add(jButton8, java.awt.BorderLayout.CENTER);

        jPanel_GridHolder.add(jPanel_8);

        jPanel_9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel_9.setLayout(new java.awt.BorderLayout());

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel_9.add(jButton9, java.awt.BorderLayout.CENTER);

        jPanel_GridHolder.add(jPanel_9);

        jPanel1.add(jPanel_GridHolder, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
 
       if (playerTurn==true)
       {
           
           jButton1.setText("X");
           jButton1.setForeground(Color.red);
           
           determineIfWin();
           playerTurn=false;
       }
       if (playerTurn==false)
       {
           if(winConditionComp()== true)
            {
              oWins();
            } 
           else if(blockConditionComp()==true)
           {  
             playerTurn = true;
           }
           else
           {
               randomMove();
               playerTurn = true;
           }
           
       }
       tieGame();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (playerTurn==true)
       {
           jButton2.setText("X");
           jButton2.setForeground(Color.red);
           determineIfWin();
           playerTurn=false;
       }
       if (playerTurn==false)
       {
           
           if(winConditionComp()== true)
            {
              oWins();
            } 
           else if(blockConditionComp()==true)
           {  
             playerTurn = true;
           }
           else
           {
               randomMove();
               playerTurn = true;
           }
           
       }
       tieGame();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (playerTurn==true)
       {
           jButton3.setText("X");
           jButton3.setForeground(Color.red);
           determineIfWin();
           playerTurn=false;
       }
       if (playerTurn==false)
       {
           
           if(winConditionComp()== true)
            {
              oWins();
            } 
           else if(blockConditionComp()==true)
           {  
             playerTurn = true;
           }
           else
           {
               randomMove();
               playerTurn = true;
           }
           
          
       }
       tieGame();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (playerTurn==true)
       {
           jButton4.setText("X");
           jButton4.setForeground(Color.red);
           determineIfWin();
           playerTurn=false;
       }
       if (playerTurn==false)
       {
           //jButton4.setForeground(Color.BLACK);
           if(winConditionComp()== true)
            {
              oWins();
            } 
           else if(blockConditionComp()==true)
           {  
             playerTurn = true;
           }
           else
           {
               randomMove();
               playerTurn = true;
           }
       }
       tieGame();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (playerTurn==true)
       {
           jButton5.setText("X");
           jButton5.setForeground(Color.red);
           determineIfWin();
           playerTurn=false;
       }
       if (playerTurn==false)
       {
           //jButton5.setForeground(Color.BLACK);
           if(winConditionComp()== true)
            {
              oWins();
            } 
           else if(blockConditionComp()==true)
           {  
             playerTurn = true;
           }
           else
           {
               randomMove();
               playerTurn = true;
           }
       }
       tieGame();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if (playerTurn==true)
       {
           jButton6.setText("X");
           jButton6.setForeground(Color.red);
           determineIfWin();
           playerTurn=false;
       }
       if (playerTurn==false)
       {
           //jButton6.setForeground(Color.BLACK);
           if(winConditionComp()== true)
            {
              oWins();
            } 
           else if(blockConditionComp()==true)
           {  
             playerTurn = true;
           }
           else
           {
               randomMove();
               playerTurn = true;
           }
       }
       tieGame();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
      if (playerTurn==true)
       {
           jButton7.setText("X");
           jButton7.setForeground(Color.red);
           determineIfWin();
           playerTurn=false;
       }
       if (playerTurn==false)
       {
           //jButton7.setForeground(Color.BLACK);
           if(winConditionComp()== true)
            {
              oWins();
            } 
           else if(blockConditionComp()==true)
           {  
             playerTurn = true;
           }
           else
           {
               randomMove();
               playerTurn = true;
           }
       }
       tieGame();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if (playerTurn==true)
       {
           jButton8.setText("X");
           jButton8.setForeground(Color.red);
           determineIfWin();
           playerTurn=false;
       }
       
       if (playerTurn==false)
       {
          // jButton8.setForeground(Color.BLACK);
           if(winConditionComp()== true)
            {
              oWins();
            } 
           else if(blockConditionComp()==true)
           {  
             playerTurn = true;
           }
           else
           {
               randomMove();
               playerTurn = true;
           }
       }
       tieGame();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if (playerTurn==true)
       {
           jButton9.setText("X");
           jButton9.setForeground(Color.red);
           determineIfWin();
           playerTurn=false;
       }
       if (playerTurn==false)
       {
          // jButton9.setForeground(Color.BLACK);
           if(winConditionComp()== true)
            {
              oWins();
            } 
           else if(blockConditionComp()==true)
           {  
             playerTurn = true;
           }
           else
           {
               randomMove();
               playerTurn = true;
           }
       }
       tieGame();
    }//GEN-LAST:event_jButton9ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TicTacToeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel_Score;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_1;
    private javax.swing.JPanel jPanel_2;
    private javax.swing.JPanel jPanel_3;
    private javax.swing.JPanel jPanel_4;
    private javax.swing.JPanel jPanel_5;
    private javax.swing.JPanel jPanel_6;
    private javax.swing.JPanel jPanel_7;
    private javax.swing.JPanel jPanel_8;
    private javax.swing.JPanel jPanel_9;
    private javax.swing.JPanel jPanel_GridHolder;
    // End of variables declaration//GEN-END:variables
}
