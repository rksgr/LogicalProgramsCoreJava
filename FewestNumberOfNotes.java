package com.mycompany.logicalprogramsdec09;

public class FewestNumberOfNotes {
    public void fewestNumberOfNotes(int change){
        // Array
        int notes[]= new int[]{1,2,5,10,50,100,500,1000};
        int notes_needed[] = new int[]{0,0,0,0,0,0,0,0};
        //variables
        int change_rem = change;
        int i =notes.length-1;
        // Iterate till no change remains and index is non-negative
        while ((change_rem>-1)&&(i>-1)){
            // Start from highest denominated notes and then go to lower ones
            while (change_rem>=notes[i]){
                if (change_rem>=notes[i]){
                    notes_needed[i]+=1;
                    change_rem-=notes[i];
                }
            }
            i--;
        }
        // Print the number of notes of different denominations
        System.out.println("Notes of different denominations ");
        for (int j=0;j<notes_needed.length;j++){
            System.out.println("The number of notes denominated" + notes[j] + " ="+ notes_needed[j]);
        }
        // Sum the values of all the elements in notes_needed array to get minimum number of notes
        int min_notes = 0;
        for (int k=0;k<notes_needed.length;k++){
            min_notes += notes_needed[k];
        }
        System.out.println("Minimum no of notes needed = "+ min_notes);
    }
    public static void main(String []args){
        FewestNumberOfNotes fnn = new FewestNumberOfNotes();
        //fnn.fewestNumberOfNotes(37);
        fnn.fewestNumberOfNotes(700);
    }
}
