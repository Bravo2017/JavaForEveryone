package com.nationwide.chapter9.vipond;

import java.util.ArrayList;
import java.util.Scanner; 
 
/*Add a class MultiChoiceQuestion to the question hierarchy of Section 9.1 that allows multiple correct choices. The respondent should provide all correct choices, sepa­ 
 rated by spaces. Provide instructions in the question text.*/ 
 
public class MultiChoiceQuestion extends Question { 
    private ArrayList<String> theRightAnswers; 
 
    public MultiChoiceQuestion() { 
        super(); 
        this.theRightAnswers = new ArrayList<String>(); 
    } 
 
    public void setAnswer(String correctResponse) { 
        this.theRightAnswers.add(correctResponse); 
    } 
 
    public boolean checkAnswer(String response) { 
        Scanner parser = new Scanner(response); 
        ArrayList<String> answersFound = new ArrayList<String>(); 
        int totalAnswers = 0; 
        while (parser.hasNext()) { 
            String answer = parser.next(); 
            if (this.theRightAnswers.contains(answer) && !answersFound.contains(answer)) { 
                answersFound.add(answer); 
            } 
            totalAnswers += 1; 
        } 

        parser.close(); 
        return answersFound.size() == this.theRightAnswers.size() && totalAnswers == theRightAnswers.size(); 
    } 
     
    public void display() { 
        super.display(); 
        System.out.println("Note: There are several answers. List all of them (in lower case) separated by spaces"); 
    } 
}