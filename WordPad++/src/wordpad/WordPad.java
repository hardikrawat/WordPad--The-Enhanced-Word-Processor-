/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordpad;

/**
 *
 * @author om
 */
public class WordPad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            for(javax.swing.UIManager.LookAndFeelInfo info: javax.swing.UIManager.getInstalledLookAndFeels()){
                if("Windows".equals(info.getName())){
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }catch(Exception e){
            
        }
    }
    
}