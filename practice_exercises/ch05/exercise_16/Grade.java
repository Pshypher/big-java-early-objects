/**
        This program translates a letter grade into a number grade
*/
public class Grade
{       

        // Constants for the numeric value of each grade
        final static double A = 4.0;
        final static double B = 3.0;
        final static double C = 2.0;
        final static double D = 1.0;
        final static double F = 0;
                
        final static double DELTA = 0.3;

        public Grade()
        {
        
        }

        /**
                Assigns each grade A-F a numeric value
                @param grade grade are characters between A-F
                @return the numeric value of a grade
        */
        public double getNumericGrade(String grade)
        {                
                String letter = grade.substring(0, 1);
                double value;
                if (grade.length() == 2)
                {
                        String sign = grade.substring(1, grade.length());
                        if (letter.equals("A"))
                        {
                                value = (sign.equals("-")) ? A - DELTA : A;
                        }
                        else if (letter.equals("B"))
                        {
                                value = (sign.equals("-")) ? B - DELTA : B + DELTA; 
                        }
                        else if (letter.equals("C"))
                        {
                                value = (sign.equals("-")) ? C - DELTA : C + DELTA;
                        }
                        else if (letter.equals("D"))
                        {
                                value = (sign.equals("-")) ? D - DELTA : D + DELTA;
                        }
                        else
                        {
                                return -1;
                        }
                }
                else if (grade.length() == 1)
                {
                        if (letter.equals("A"))
                        {
                                value = A;
                        }
                        else if (letter.equals("B"))
                        {
                                value = B;
                        }
                        else if (letter.equals("C"))
                        {
                                value = C;
                        }
                        else if (letter.equals("D"))
                        {
                                value = D;
                        }
                        else if (letter.equals("F"))
                        {
                                value = F;
                        }
                        else
                        {
                                return -1;
                        }
                }
                else
                {
                        return -1;
                }
                
                return value;
        }
        
        /**
                Assigns the average scored to a numeric grade 
                between characters A and F
                @param avg average score of pupil less than or equal to 4.0
                @return the letter grade of pupil between chars A-F
                
        */
        public String getNumericGrade(double avg)
        {
                String grade;
                if (avg < 0.7)
                {
                        grade = "F";
                }
                else if (avg < 1.75)
                {
                        grade = (avg < 0.85) ? "D-" : 
                                (avg < 1.15) ? "D" : "D+";
                }
                else if (avg < 2.75)
                {
                        grade = (avg < 1.85) ? "C-" :
                                (avg < 2.15) ? "C" : "C+";
                }
                else if (avg < 3.85)
                {
                        grade = (avg < 2.85) ? "B-" :
                                (avg < 3.15) ? "B" : "B+";
                }
                else if (avg <= 4.0)
                {
                        grade = "A";
                }
                else
                {
                        return "";
                }
                return grade;
        }
}